# 💡 Li-Fi Technology — Data Transmission Using Phone Flash

> Send text from an Android phone to an Arduino **using light**.  
> The phone’s **flashlight** blinks encoded pulses (Tx). An **LDR** reads them (Rx).  
> The Arduino **decodes** the pulses and shows the message on a **16×2 LCD**.

---

## ✨ Highlights
- Simple, safe, RF-free comms: visible light instead of radio.
- End-to-end demo: **Android app → light pulses → LDR → Arduino → LCD**.
- Clear, beginner-friendly code and wiring.

---

## 🧰 Hardware
- **Arduino UNO**
- **16×2 LCD** (HD44780 compatible)
- **LDR** (photoresistor) + **10 kΩ** resistor (voltage divider)
- Breadboard + jumpers
- **Android smartphone** with camera flash

> Optional: 10 kΩ potentiometer in LCD V0 (contrast).

---

## 🔌 Wiring

> File included in repo: `Circuit diagram.png`

![Circuit Diagram](Circuit%20diagram.png)

**LCD ↔ Arduino**
| LCD Pin | Arduino |
|---|---|
| VSS | GND |
| VDD | 5V |
| V0  | Pot wiper (or GND for quick test) |
| RS  | D12 |
| E   | D11 |
| D4  | D5  |
| D5  | D4  |
| D6  | D3  |
| D7  | D2  |
| RW  | GND |
| A/K (backlight) | 5V/GND |

**LDR Voltage Divider**
- One side of LDR → **5V**  
- Other side of LDR → **A0** and → **10 kΩ** → **GND**

---

## 📡 Protocol (Simple, Reliable, Human-Tunable)

We encode each character as **8 data bits (ASCII)** framed by a **start pulse**.

- **Start pulse:** light **ON ~800 ms**
- **Bit “0” pulse:** light **ON ~200 ms**
- **Bit “1” pulse:** light **ON ~600 ms**
- **Gap between bits:** **200 ms** light **OFF**
- **Word/end gap (silence):** **≥1000 ms** OFF (used by receiver to “flush” the line to LCD)

> These timings are generous for phone torches + LDRs. You can tighten them later.

---

## 🧠 How It Works

1. **Android app** turns the torch on/off with the durations above to send bytes.
2. **LDR + divider** converts light to a voltage the Arduino reads on **A0**.
3. **Arduino** auto-calibrates a light threshold, measures **ON durations**, classifies start/bit pulses, rebuilds characters, and prints them on the **LCD** (and Serial).

---

## 📁 Repo Structure

├─ LiFi.ino # Arduino receiver (see below for a reference version)
├─ android/ # Minimal Android sender (Kotlin)
│ ├─ app/src/... # Torch sender Activity
├─ Circuit diagram.png
├─ README.md # This file


---

## 🧾 Arduino Receiver (drop-in sketch)

> If you already have `LiFi.ino`, you can keep it.  
> Otherwise use this reference sketch (works with the wiring/protocol above).

```cpp
/*
  Li-Fi Receiver — Arduino UNO + LDR + 16x2 LCD
  Protocol:
    Start:  ON ~800ms
    Bit 0:  ON ~200ms
    Bit 1:  ON ~600ms
    Gap:    OFF 200ms between bits
    End:    OFF >=1000ms flushes buffer to LCD

  Wiring:
    LDR divider -> A0
    LCD: RS=12, E=11, D4=5, D5=4, D6=3, D7=2, RW=GND, VDD=5V, VSS=GND
*/

#include <LiquidCrystal.h>

LiquidCrystal lcd(12, 11, 5, 4, 3, 2);
const int LDR_PIN = A0;

// Timing (ms)
const unsigned long START_MS   = 800;
const unsigned long BIT1_MS    = 600;
const unsigned long BIT0_MS    = 200;
const unsigned long GAP_MS     = 200;    // expected OFF between pulses
const unsigned long FLUSH_MS   = 1000;   // OFF => flush buffer

// Classification tolerances (±%)
const float TOL = 0.35;  // generous to handle phone torch variability

// Thresholding
int ambient = 0;
int thresh  = 0;   // dynamic light threshold (ambient + margin)
const int MARGIN = 150;

// Decoder state
bool lightHigh = false;
unsigned long edgeTs = 0;

uint8_t bitIndex = 0;
uint8_t currentByte = 0;
String lineBuffer;

bool approx(unsigned long d, unsigned long target) {
  unsigned long low  = target * (1.0 - TOL);
  unsigned long high = target * (1.0 + TOL);
  return (d >= low && d <= high);
}

void flushLine() {
  if (lineBuffer.length() == 0) return;
  lcd.clear();
  // Print over two lines if needed
  for (int i = 0; i < (int)lineBuffer.length(); ++i) {
    if (i == 16) lcd.setCursor(0, 1);
    lcd.print(lineBuffer[i]);
  }
  Serial.println("[LCD] " + lineBuffer);
  lineBuffer = "";
}

void resetByte() {
  bitIndex = 0;
  currentByte = 0;
}

void setup() {
  Serial.begin(115200);
  lcd.begin(16, 2);
  lcd.print("Li-Fi Receiver");

  // Auto-calibrate ambient light
  delay(200);
  long sum = 0;
  const int N = 200;
  for (int i = 0; i < N; ++i) { sum += analogRead(LDR_PIN); delay(2); }
  ambient = sum / N;
  thresh = ambient + MARGIN;

  Serial.print("Ambient="); Serial.print(ambient);
  Serial.print("  Threshold="); Serial.println(thresh);
  delay(800);
  lcd.clear();
}

void loop() {
  // Simple edge detector on light level
  int v = analogRead(LDR_PIN);
  bool isHigh = (v > thresh);

  static unsigned long lastEdgeOffTs = millis();

  if (isHigh && !lightHigh) {
    // rising edge
    lightHigh = true;
    edgeTs = millis();
  }

  if (!isHigh && lightHigh) {
    // falling edge -> measure ON duration
    lightHigh = false;
    unsigned long dur = millis() - edgeTs;
    lastEdgeOffTs = millis();

    // Classify pulse
    if (approx(dur, START_MS)) {
      // Start frame
      resetByte();
      // (Optional) mark start
      // Serial.println("START");
    } else if (approx(dur, BIT0_MS) || approx(dur, BIT1_MS)) {
      // Data bit — MSB first
      currentByte <<= 1;
      if (approx(dur, BIT1_MS)) currentByte |= 0x01;
      bitIndex++;

      if (bitIndex == 8) {
        char c = (char)currentByte;
        Serial.print(c);
        if (c == '\n') flushLine();
        else lineBuffer += c;
        resetByte();
      }
    } else {
      // Unknown pulse width — ignore
      Serial.print("[? "); Serial.print(dur); Serial.println(" ms]");
    }
  }

  // If long silence, flush the buffer to LCD
  if (!lightHigh && (millis() - lastEdgeOffTs >= FLUSH_MS)) {
    lastEdgeOffTs = millis();
    flushLine();
  }
}

---

If you want, I can also drop these files into your repo structure and commit them (README, Arduino sketch, and a minimal Android project skeleton).
