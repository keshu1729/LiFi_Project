package io.kodular.himanshus2847.LiFiProject;

import android.support.v4.app.FragmentTransaction;
import com.google.appinventor.components.common.PropertyTypeConstants;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.Clock;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.HorizontalArrangement;
import com.google.appinventor.components.runtime.Image;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.SpaceView;
import com.google.appinventor.components.runtime.TextBox;
import com.google.appinventor.components.runtime.errors.PermissionException;
import com.google.appinventor.components.runtime.errors.YailRuntimeError;
import com.google.appinventor.components.runtime.util.RetValManager;
import com.google.appinventor.components.runtime.util.RuntimeErrorAlert;
import com.google.youngandroid.runtime;
import com.puravidaapps.TaifunFlashlight;
import gnu.expr.Language;
import gnu.expr.ModuleBody;
import gnu.expr.ModuleInfo;
import gnu.expr.ModuleMethod;
import gnu.kawa.functions.Apply;
import gnu.kawa.functions.Format;
import gnu.kawa.functions.GetNamedPart;
import gnu.kawa.functions.IsEqual;
import gnu.kawa.reflect.Invoke;
import gnu.kawa.reflect.SlotGet;
import gnu.kawa.reflect.SlotSet;
import gnu.lists.Consumer;
import gnu.lists.FString;
import gnu.lists.LList;
import gnu.lists.Pair;
import gnu.lists.PairWithPosition;
import gnu.lists.VoidConsumer;
import gnu.mapping.CallContext;
import gnu.mapping.Environment;
import gnu.mapping.SimpleSymbol;
import gnu.mapping.Symbol;
import gnu.mapping.Values;
import gnu.mapping.WrongType;
import gnu.math.IntNum;
import kawa.lang.Promise;
import kawa.lib.lists;
import kawa.lib.misc;
import kawa.lib.strings;
import kawa.standard.Scheme;
import kawa.standard.require;

/* compiled from: Screen1.yail */
public class Screen1 extends Form implements Runnable {
    static final SimpleSymbol Lit0;
    static final SimpleSymbol Lit1;
    static final SimpleSymbol Lit10;
    static final SimpleSymbol Lit100;
    static final SimpleSymbol Lit101;
    static final SimpleSymbol Lit102;
    static final SimpleSymbol Lit103;
    static final SimpleSymbol Lit104;
    static final SimpleSymbol Lit105;
    static final SimpleSymbol Lit106;
    static final SimpleSymbol Lit107;
    static final SimpleSymbol Lit108;
    static final SimpleSymbol Lit109;
    static final SimpleSymbol Lit11;
    static final SimpleSymbol Lit110;
    static final SimpleSymbol Lit111;
    static final SimpleSymbol Lit112;
    static final SimpleSymbol Lit113;
    static final SimpleSymbol Lit114;
    static final SimpleSymbol Lit12;
    static final IntNum Lit13;
    static final SimpleSymbol Lit14;
    static final IntNum Lit15;
    static final SimpleSymbol Lit16;
    static final FString Lit17;
    static final SimpleSymbol Lit18;
    static final SimpleSymbol Lit19;
    static final SimpleSymbol Lit2;
    static final IntNum Lit20 = IntNum.make(-1008);
    static final FString Lit21;
    static final FString Lit22;
    static final SimpleSymbol Lit23;
    static final SimpleSymbol Lit24;
    static final IntNum Lit25;
    static final IntNum Lit26 = IntNum.make(-1008);
    static final SimpleSymbol Lit27;
    static final IntNum Lit28 = IntNum.make(-1080);
    static final SimpleSymbol Lit29;
    static final SimpleSymbol Lit3;
    static final SimpleSymbol Lit30;
    static final SimpleSymbol Lit31;
    static final FString Lit32;
    static final FString Lit33;
    static final SimpleSymbol Lit34;
    static final SimpleSymbol Lit35;
    static final SimpleSymbol Lit36;
    static final IntNum Lit37 = IntNum.make(18);
    static final IntNum Lit38 = IntNum.make(-1070);
    static final SimpleSymbol Lit39;
    static final SimpleSymbol Lit4;
    static final SimpleSymbol Lit40;
    static final IntNum Lit41;
    static final SimpleSymbol Lit42;
    static final IntNum Lit43 = IntNum.make(1);
    static final FString Lit44;
    static final FString Lit45;
    static final SimpleSymbol Lit46;
    static final IntNum Lit47 = IntNum.make(16);
    static final IntNum Lit48 = IntNum.make(-1007);
    static final SimpleSymbol Lit49;
    static final SimpleSymbol Lit5;
    static final FString Lit50;
    static final PairWithPosition Lit51 = PairWithPosition.make(Lit114, PairWithPosition.make(Lit114, LList.Empty, "/tmp/1587609697566_0.6758884707683882-0/youngandroidproject/../src/io/kodular/himanshus2847/LiFiProject/Screen1.yail", 311402), "/tmp/1587609697566_0.6758884707683882-0/youngandroidproject/../src/io/kodular/himanshus2847/LiFiProject/Screen1.yail", 311397);
    static final SimpleSymbol Lit52;
    static final SimpleSymbol Lit53;
    static final SimpleSymbol Lit54;
    static final SimpleSymbol Lit55;
    static final SimpleSymbol Lit56;
    static final IntNum Lit57 = IntNum.make(300);
    static final SimpleSymbol Lit58;
    static final PairWithPosition Lit59 = PairWithPosition.make(Lit114, PairWithPosition.make(Lit114, LList.Empty, "/tmp/1587609697566_0.6758884707683882-0/youngandroidproject/../src/io/kodular/himanshus2847/LiFiProject/Screen1.yail", 311784), "/tmp/1587609697566_0.6758884707683882-0/youngandroidproject/../src/io/kodular/himanshus2847/LiFiProject/Screen1.yail", 311779);
    static final IntNum Lit6 = IntNum.make(3);
    static final IntNum Lit60 = IntNum.make(500);
    static final PairWithPosition Lit61 = PairWithPosition.make(Lit114, PairWithPosition.make(Lit114, LList.Empty, "/tmp/1587609697566_0.6758884707683882-0/youngandroidproject/../src/io/kodular/himanshus2847/LiFiProject/Screen1.yail", 312173), "/tmp/1587609697566_0.6758884707683882-0/youngandroidproject/../src/io/kodular/himanshus2847/LiFiProject/Screen1.yail", 312168);
    static final IntNum Lit62 = IntNum.make(700);
    static final PairWithPosition Lit63 = PairWithPosition.make(Lit114, PairWithPosition.make(Lit114, LList.Empty, "/tmp/1587609697566_0.6758884707683882-0/youngandroidproject/../src/io/kodular/himanshus2847/LiFiProject/Screen1.yail", 312559), "/tmp/1587609697566_0.6758884707683882-0/youngandroidproject/../src/io/kodular/himanshus2847/LiFiProject/Screen1.yail", 312554);
    static final IntNum Lit64 = IntNum.make(900);
    static final PairWithPosition Lit65 = PairWithPosition.make(Lit114, PairWithPosition.make(Lit114, LList.Empty, "/tmp/1587609697566_0.6758884707683882-0/youngandroidproject/../src/io/kodular/himanshus2847/LiFiProject/Screen1.yail", 312938), "/tmp/1587609697566_0.6758884707683882-0/youngandroidproject/../src/io/kodular/himanshus2847/LiFiProject/Screen1.yail", 312933);
    static final IntNum Lit66 = IntNum.make(1100);
    static final PairWithPosition Lit67 = PairWithPosition.make(Lit114, PairWithPosition.make(Lit114, LList.Empty, "/tmp/1587609697566_0.6758884707683882-0/youngandroidproject/../src/io/kodular/himanshus2847/LiFiProject/Screen1.yail", 313328), "/tmp/1587609697566_0.6758884707683882-0/youngandroidproject/../src/io/kodular/himanshus2847/LiFiProject/Screen1.yail", 313323);
    static final IntNum Lit68 = IntNum.make(1300);
    static final PairWithPosition Lit69 = PairWithPosition.make(Lit114, PairWithPosition.make(Lit114, LList.Empty, "/tmp/1587609697566_0.6758884707683882-0/youngandroidproject/../src/io/kodular/himanshus2847/LiFiProject/Screen1.yail", 313720), "/tmp/1587609697566_0.6758884707683882-0/youngandroidproject/../src/io/kodular/himanshus2847/LiFiProject/Screen1.yail", 313715);
    static final SimpleSymbol Lit7;
    static final IntNum Lit70 = IntNum.make(1500);
    static final PairWithPosition Lit71 = PairWithPosition.make(Lit114, PairWithPosition.make(Lit114, LList.Empty, "/tmp/1587609697566_0.6758884707683882-0/youngandroidproject/../src/io/kodular/himanshus2847/LiFiProject/Screen1.yail", 314110), "/tmp/1587609697566_0.6758884707683882-0/youngandroidproject/../src/io/kodular/himanshus2847/LiFiProject/Screen1.yail", 314105);
    static final IntNum Lit72 = IntNum.make(1700);
    static final PairWithPosition Lit73 = PairWithPosition.make(Lit114, PairWithPosition.make(Lit114, LList.Empty, "/tmp/1587609697566_0.6758884707683882-0/youngandroidproject/../src/io/kodular/himanshus2847/LiFiProject/Screen1.yail", 314497), "/tmp/1587609697566_0.6758884707683882-0/youngandroidproject/../src/io/kodular/himanshus2847/LiFiProject/Screen1.yail", 314492);
    static final IntNum Lit74 = IntNum.make(1900);
    static final PairWithPosition Lit75 = PairWithPosition.make(Lit114, PairWithPosition.make(Lit114, LList.Empty, "/tmp/1587609697566_0.6758884707683882-0/youngandroidproject/../src/io/kodular/himanshus2847/LiFiProject/Screen1.yail", 314880), "/tmp/1587609697566_0.6758884707683882-0/youngandroidproject/../src/io/kodular/himanshus2847/LiFiProject/Screen1.yail", 314875);
    static final IntNum Lit76 = IntNum.make(2100);
    static final SimpleSymbol Lit77;
    static final SimpleSymbol Lit78;
    static final FString Lit79;
    static final SimpleSymbol Lit8;
    static final SimpleSymbol Lit80;
    static final IntNum Lit81 = IntNum.make(-1008);
    static final FString Lit82;
    static final FString Lit83;
    static final FString Lit84;
    static final FString Lit85;
    static final SimpleSymbol Lit86;
    static final IntNum Lit87 = IntNum.make(-1035);
    static final IntNum Lit88 = IntNum.make(-1080);
    static final SimpleSymbol Lit89;
    static final SimpleSymbol Lit9;
    static final FString Lit90;
    static final FString Lit91;
    static final FString Lit92;
    static final FString Lit93;
    static final SimpleSymbol Lit94;
    static final IntNum Lit95 = IntNum.make(0);
    static final FString Lit96;
    static final SimpleSymbol Lit97;
    static final SimpleSymbol Lit98;
    static final SimpleSymbol Lit99;
    public static Screen1 Screen1;
    static final ModuleMethod lambda$Fn1 = null;
    static final ModuleMethod lambda$Fn10 = null;
    static final ModuleMethod lambda$Fn11 = null;
    static final ModuleMethod lambda$Fn12 = null;
    static final ModuleMethod lambda$Fn13 = null;
    static final ModuleMethod lambda$Fn14 = null;
    static final ModuleMethod lambda$Fn15 = null;
    static final ModuleMethod lambda$Fn16 = null;
    static final ModuleMethod lambda$Fn17 = null;
    static final ModuleMethod lambda$Fn18 = null;
    static final ModuleMethod lambda$Fn2 = null;
    static final ModuleMethod lambda$Fn3 = null;
    static final ModuleMethod lambda$Fn4 = null;
    static final ModuleMethod lambda$Fn5 = null;
    static final ModuleMethod lambda$Fn6 = null;
    static final ModuleMethod lambda$Fn7 = null;
    static final ModuleMethod lambda$Fn8 = null;
    static final ModuleMethod lambda$Fn9 = null;
    public Boolean $Stdebug$Mnform$St;
    public final ModuleMethod $define;
    public Button Button1;
    public final ModuleMethod Button1$Click;
    public Clock Clock1;
    public final ModuleMethod Clock1$Timer;
    public HorizontalArrangement Horizontal_Arrangement1;
    public Image Image1;
    public Label Label1;
    public SpaceView Space1;
    public SpaceView Space2;
    public TaifunFlashlight TaifunFlashlight1;
    public TextBox Text_Box1;
    public final ModuleMethod add$Mnto$Mncomponents;
    public final ModuleMethod add$Mnto$Mnevents;
    public final ModuleMethod add$Mnto$Mnform$Mndo$Mnafter$Mncreation;
    public final ModuleMethod add$Mnto$Mnform$Mnenvironment;
    public final ModuleMethod add$Mnto$Mnglobal$Mnvar$Mnenvironment;
    public final ModuleMethod add$Mnto$Mnglobal$Mnvars;
    public final ModuleMethod android$Mnlog$Mnform;
    public LList components$Mnto$Mncreate;
    public final ModuleMethod dispatchEvent;
    public final ModuleMethod dispatchGenericEvent;
    public LList events$Mnto$Mnregister;
    public LList form$Mndo$Mnafter$Mncreation;
    public Environment form$Mnenvironment;
    public Symbol form$Mnname$Mnsymbol;
    public final ModuleMethod get$Mnsimple$Mnname;
    public Environment global$Mnvar$Mnenvironment;
    public LList global$Mnvars$Mnto$Mncreate;
    public final ModuleMethod is$Mnbound$Mnin$Mnform$Mnenvironment;
    public final ModuleMethod lookup$Mnhandler;
    public final ModuleMethod lookup$Mnin$Mnform$Mnenvironment;
    public final ModuleMethod process$Mnexception;
    public final ModuleMethod send$Mnerror;

    static {
        SimpleSymbol simpleSymbol;
        SimpleSymbol simpleSymbol2;
        SimpleSymbol simpleSymbol3;
        SimpleSymbol simpleSymbol4;
        SimpleSymbol simpleSymbol5;
        SimpleSymbol simpleSymbol6;
        SimpleSymbol simpleSymbol7;
        SimpleSymbol simpleSymbol8;
        SimpleSymbol simpleSymbol9;
        SimpleSymbol simpleSymbol10;
        SimpleSymbol simpleSymbol11;
        SimpleSymbol simpleSymbol12;
        SimpleSymbol simpleSymbol13;
        SimpleSymbol simpleSymbol14;
        SimpleSymbol simpleSymbol15;
        SimpleSymbol simpleSymbol16;
        SimpleSymbol simpleSymbol17;
        SimpleSymbol simpleSymbol18;
        FString fString;
        SimpleSymbol simpleSymbol19;
        FString fString2;
        FString fString3;
        FString fString4;
        FString fString5;
        SimpleSymbol simpleSymbol20;
        SimpleSymbol simpleSymbol21;
        FString fString6;
        FString fString7;
        FString fString8;
        FString fString9;
        SimpleSymbol simpleSymbol22;
        FString fString10;
        SimpleSymbol simpleSymbol23;
        SimpleSymbol simpleSymbol24;
        SimpleSymbol simpleSymbol25;
        SimpleSymbol simpleSymbol26;
        SimpleSymbol simpleSymbol27;
        SimpleSymbol simpleSymbol28;
        SimpleSymbol simpleSymbol29;
        SimpleSymbol simpleSymbol30;
        FString fString11;
        SimpleSymbol simpleSymbol31;
        SimpleSymbol simpleSymbol32;
        FString fString12;
        FString fString13;
        SimpleSymbol simpleSymbol33;
        SimpleSymbol simpleSymbol34;
        SimpleSymbol simpleSymbol35;
        SimpleSymbol simpleSymbol36;
        SimpleSymbol simpleSymbol37;
        SimpleSymbol simpleSymbol38;
        FString fString14;
        FString fString15;
        SimpleSymbol simpleSymbol39;
        SimpleSymbol simpleSymbol40;
        SimpleSymbol simpleSymbol41;
        SimpleSymbol simpleSymbol42;
        SimpleSymbol simpleSymbol43;
        SimpleSymbol simpleSymbol44;
        FString fString16;
        FString fString17;
        SimpleSymbol simpleSymbol45;
        SimpleSymbol simpleSymbol46;
        FString fString18;
        SimpleSymbol simpleSymbol47;
        SimpleSymbol simpleSymbol48;
        SimpleSymbol simpleSymbol49;
        SimpleSymbol simpleSymbol50;
        SimpleSymbol simpleSymbol51;
        SimpleSymbol simpleSymbol52;
        SimpleSymbol simpleSymbol53;
        SimpleSymbol simpleSymbol54;
        SimpleSymbol simpleSymbol55;
        SimpleSymbol simpleSymbol56;
        SimpleSymbol simpleSymbol57;
        SimpleSymbol simpleSymbol58;
        SimpleSymbol simpleSymbol59;
        SimpleSymbol simpleSymbol60;
        new SimpleSymbol("any");
        Lit114 = (SimpleSymbol) simpleSymbol.readResolve();
        new SimpleSymbol("lookup-handler");
        Lit113 = (SimpleSymbol) simpleSymbol2.readResolve();
        new SimpleSymbol("dispatchGenericEvent");
        Lit112 = (SimpleSymbol) simpleSymbol3.readResolve();
        new SimpleSymbol("dispatchEvent");
        Lit111 = (SimpleSymbol) simpleSymbol4.readResolve();
        new SimpleSymbol("send-error");
        Lit110 = (SimpleSymbol) simpleSymbol5.readResolve();
        new SimpleSymbol("add-to-form-do-after-creation");
        Lit109 = (SimpleSymbol) simpleSymbol6.readResolve();
        new SimpleSymbol("add-to-global-vars");
        Lit108 = (SimpleSymbol) simpleSymbol7.readResolve();
        new SimpleSymbol("add-to-components");
        Lit107 = (SimpleSymbol) simpleSymbol8.readResolve();
        new SimpleSymbol("add-to-events");
        Lit106 = (SimpleSymbol) simpleSymbol9.readResolve();
        new SimpleSymbol("add-to-global-var-environment");
        Lit105 = (SimpleSymbol) simpleSymbol10.readResolve();
        new SimpleSymbol("is-bound-in-form-environment");
        Lit104 = (SimpleSymbol) simpleSymbol11.readResolve();
        new SimpleSymbol("lookup-in-form-environment");
        Lit103 = (SimpleSymbol) simpleSymbol12.readResolve();
        new SimpleSymbol("add-to-form-environment");
        Lit102 = (SimpleSymbol) simpleSymbol13.readResolve();
        new SimpleSymbol("android-log-form");
        Lit101 = (SimpleSymbol) simpleSymbol14.readResolve();
        new SimpleSymbol("get-simple-name");
        Lit100 = (SimpleSymbol) simpleSymbol15.readResolve();
        new SimpleSymbol("Timer");
        Lit99 = (SimpleSymbol) simpleSymbol16.readResolve();
        new SimpleSymbol("Clock1$Timer");
        Lit98 = (SimpleSymbol) simpleSymbol17.readResolve();
        new SimpleSymbol("Off");
        Lit97 = (SimpleSymbol) simpleSymbol18.readResolve();
        new FString("com.google.appinventor.components.runtime.Clock");
        Lit96 = fString;
        new SimpleSymbol("TimerAlwaysFires");
        Lit94 = (SimpleSymbol) simpleSymbol19.readResolve();
        new FString("com.google.appinventor.components.runtime.Clock");
        Lit93 = fString2;
        new FString("com.puravidaapps.TaifunFlashlight");
        Lit92 = fString3;
        new FString("com.puravidaapps.TaifunFlashlight");
        Lit91 = fString4;
        new FString("com.google.appinventor.components.runtime.Image");
        Lit90 = fString5;
        new SimpleSymbol("Picture");
        Lit89 = (SimpleSymbol) simpleSymbol20.readResolve();
        new SimpleSymbol("Image1");
        Lit86 = (SimpleSymbol) simpleSymbol21.readResolve();
        new FString("com.google.appinventor.components.runtime.Image");
        Lit85 = fString6;
        new FString("com.google.appinventor.components.runtime.Label");
        Lit84 = fString7;
        new FString("com.google.appinventor.components.runtime.Label");
        Lit83 = fString8;
        new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit82 = fString9;
        new SimpleSymbol("Space2");
        Lit80 = (SimpleSymbol) simpleSymbol22.readResolve();
        new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit79 = fString10;
        new SimpleSymbol("Click");
        Lit78 = (SimpleSymbol) simpleSymbol23.readResolve();
        new SimpleSymbol("Button1$Click");
        Lit77 = (SimpleSymbol) simpleSymbol24.readResolve();
        new SimpleSymbol("TimerEnabled");
        Lit58 = (SimpleSymbol) simpleSymbol25.readResolve();
        new SimpleSymbol("TimerInterval");
        Lit56 = (SimpleSymbol) simpleSymbol26.readResolve();
        new SimpleSymbol("Clock1");
        Lit55 = (SimpleSymbol) simpleSymbol27.readResolve();
        new SimpleSymbol("On");
        Lit54 = (SimpleSymbol) simpleSymbol28.readResolve();
        new SimpleSymbol("TaifunFlashlight1");
        Lit53 = (SimpleSymbol) simpleSymbol29.readResolve();
        new SimpleSymbol("Label1");
        Lit52 = (SimpleSymbol) simpleSymbol30.readResolve();
        new FString("com.google.appinventor.components.runtime.Button");
        Lit50 = fString11;
        new SimpleSymbol("Text");
        Lit49 = (SimpleSymbol) simpleSymbol31.readResolve();
        new SimpleSymbol("Button1");
        Lit46 = (SimpleSymbol) simpleSymbol32.readResolve();
        new FString("com.google.appinventor.components.runtime.Button");
        Lit45 = fString12;
        new FString("com.google.appinventor.components.runtime.TextBox");
        Lit44 = fString13;
        new SimpleSymbol("TextAlignment");
        Lit42 = (SimpleSymbol) simpleSymbol33.readResolve();
        int[] iArr = new int[2];
        iArr[0] = -6381922;
        Lit41 = IntNum.make(iArr);
        new SimpleSymbol("HintColor");
        Lit40 = (SimpleSymbol) simpleSymbol34.readResolve();
        new SimpleSymbol("Hint");
        Lit39 = (SimpleSymbol) simpleSymbol35.readResolve();
        new SimpleSymbol("FontSize");
        Lit36 = (SimpleSymbol) simpleSymbol36.readResolve();
        new SimpleSymbol("FontBold");
        Lit35 = (SimpleSymbol) simpleSymbol37.readResolve();
        new SimpleSymbol("Text_Box1");
        Lit34 = (SimpleSymbol) simpleSymbol38.readResolve();
        new FString("com.google.appinventor.components.runtime.TextBox");
        Lit33 = fString14;
        new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit32 = fString15;
        new SimpleSymbol("isCard");
        Lit31 = (SimpleSymbol) simpleSymbol39.readResolve();
        new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_BOOLEAN);
        Lit30 = (SimpleSymbol) simpleSymbol40.readResolve();
        new SimpleSymbol("UseRoundCard");
        Lit29 = (SimpleSymbol) simpleSymbol41.readResolve();
        new SimpleSymbol("Width");
        Lit27 = (SimpleSymbol) simpleSymbol42.readResolve();
        int[] iArr2 = new int[2];
        iArr2[0] = -1;
        Lit25 = IntNum.make(iArr2);
        new SimpleSymbol("BackgroundColor");
        Lit24 = (SimpleSymbol) simpleSymbol43.readResolve();
        new SimpleSymbol("Horizontal_Arrangement1");
        Lit23 = (SimpleSymbol) simpleSymbol44.readResolve();
        new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit22 = fString16;
        new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit21 = fString17;
        new SimpleSymbol("Height");
        Lit19 = (SimpleSymbol) simpleSymbol45.readResolve();
        new SimpleSymbol("Space1");
        Lit18 = (SimpleSymbol) simpleSymbol46.readResolve();
        new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit17 = fString18;
        new SimpleSymbol("Title");
        Lit16 = (SimpleSymbol) simpleSymbol47.readResolve();
        int[] iArr3 = new int[2];
        iArr3[0] = -131850208;
        Lit15 = IntNum.make(iArr3);
        new SimpleSymbol("PrimaryColorDark");
        Lit14 = (SimpleSymbol) simpleSymbol48.readResolve();
        int[] iArr4 = new int[2];
        iArr4[0] = -31749426;
        Lit13 = IntNum.make(iArr4);
        new SimpleSymbol("PrimaryColor");
        Lit12 = (SimpleSymbol) simpleSymbol49.readResolve();
        new SimpleSymbol("PackageName");
        Lit11 = (SimpleSymbol) simpleSymbol50.readResolve();
        new SimpleSymbol("Icon");
        Lit10 = (SimpleSymbol) simpleSymbol51.readResolve();
        new SimpleSymbol("AppName");
        Lit9 = (SimpleSymbol) simpleSymbol52.readResolve();
        new SimpleSymbol("AppId");
        Lit8 = (SimpleSymbol) simpleSymbol53.readResolve();
        new SimpleSymbol("number");
        Lit7 = (SimpleSymbol) simpleSymbol54.readResolve();
        new SimpleSymbol("AlignHorizontal");
        Lit5 = (SimpleSymbol) simpleSymbol55.readResolve();
        new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_TEXT);
        Lit4 = (SimpleSymbol) simpleSymbol56.readResolve();
        new SimpleSymbol("AboutScreen");
        Lit3 = (SimpleSymbol) simpleSymbol57.readResolve();
        new SimpleSymbol("*the-null-value*");
        Lit2 = (SimpleSymbol) simpleSymbol58.readResolve();
        new SimpleSymbol("getMessage");
        Lit1 = (SimpleSymbol) simpleSymbol59.readResolve();
        new SimpleSymbol("Screen1");
        Lit0 = (SimpleSymbol) simpleSymbol60.readResolve();
    }

    public Screen1() {
        ModuleMethod moduleMethod;
        frame frame2;
        ModuleMethod moduleMethod2;
        ModuleMethod moduleMethod3;
        ModuleMethod moduleMethod4;
        ModuleMethod moduleMethod5;
        ModuleMethod moduleMethod6;
        ModuleMethod moduleMethod7;
        ModuleMethod moduleMethod8;
        ModuleMethod moduleMethod9;
        ModuleMethod moduleMethod10;
        ModuleMethod moduleMethod11;
        ModuleMethod moduleMethod12;
        ModuleMethod moduleMethod13;
        ModuleMethod moduleMethod14;
        ModuleMethod moduleMethod15;
        ModuleMethod moduleMethod16;
        ModuleMethod moduleMethod17;
        ModuleMethod moduleMethod18;
        ModuleMethod moduleMethod19;
        ModuleMethod moduleMethod20;
        ModuleMethod moduleMethod21;
        ModuleMethod moduleMethod22;
        ModuleMethod moduleMethod23;
        ModuleMethod moduleMethod24;
        ModuleMethod moduleMethod25;
        ModuleMethod moduleMethod26;
        ModuleMethod moduleMethod27;
        ModuleMethod moduleMethod28;
        ModuleMethod moduleMethod29;
        ModuleMethod moduleMethod30;
        ModuleMethod moduleMethod31;
        ModuleMethod moduleMethod32;
        ModuleMethod moduleMethod33;
        ModuleMethod moduleMethod34;
        ModuleMethod moduleMethod35;
        ModuleMethod moduleMethod36;
        ModuleInfo.register(this);
        ModuleMethod moduleMethod37 = moduleMethod;
        new frame();
        frame frame3 = frame2;
        frame3.$main = this;
        frame frame4 = frame3;
        new ModuleMethod(frame4, 1, Lit100, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.get$Mnsimple$Mnname = moduleMethod37;
        new ModuleMethod(frame4, 2, Lit101, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.android$Mnlog$Mnform = moduleMethod2;
        new ModuleMethod(frame4, 3, Lit102, 8194);
        this.add$Mnto$Mnform$Mnenvironment = moduleMethod3;
        new ModuleMethod(frame4, 4, Lit103, 8193);
        this.lookup$Mnin$Mnform$Mnenvironment = moduleMethod4;
        new ModuleMethod(frame4, 6, Lit104, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.is$Mnbound$Mnin$Mnform$Mnenvironment = moduleMethod5;
        new ModuleMethod(frame4, 7, Lit105, 8194);
        this.add$Mnto$Mnglobal$Mnvar$Mnenvironment = moduleMethod6;
        new ModuleMethod(frame4, 8, Lit106, 8194);
        this.add$Mnto$Mnevents = moduleMethod7;
        new ModuleMethod(frame4, 9, Lit107, 16388);
        this.add$Mnto$Mncomponents = moduleMethod8;
        new ModuleMethod(frame4, 10, Lit108, 8194);
        this.add$Mnto$Mnglobal$Mnvars = moduleMethod9;
        new ModuleMethod(frame4, 11, Lit109, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.add$Mnto$Mnform$Mndo$Mnafter$Mncreation = moduleMethod10;
        new ModuleMethod(frame4, 12, Lit110, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.send$Mnerror = moduleMethod11;
        new ModuleMethod(frame4, 13, "process-exception", FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.process$Mnexception = moduleMethod12;
        new ModuleMethod(frame4, 14, Lit111, 16388);
        this.dispatchEvent = moduleMethod13;
        new ModuleMethod(frame4, 15, Lit112, 16388);
        this.dispatchGenericEvent = moduleMethod14;
        new ModuleMethod(frame4, 16, Lit113, 8194);
        this.lookup$Mnhandler = moduleMethod15;
        new ModuleMethod(frame4, 17, (Object) null, 0);
        ModuleMethod moduleMethod38 = moduleMethod16;
        moduleMethod38.setProperty("source-location", "/tmp/runtime1006043334016776955.scm:615");
        lambda$Fn1 = moduleMethod38;
        new ModuleMethod(frame4, 18, "$define", 0);
        this.$define = moduleMethod17;
        new ModuleMethod(frame4, 19, (Object) null, 0);
        lambda$Fn2 = moduleMethod18;
        new ModuleMethod(frame4, 20, (Object) null, 0);
        lambda$Fn3 = moduleMethod19;
        new ModuleMethod(frame4, 21, (Object) null, 0);
        lambda$Fn4 = moduleMethod20;
        new ModuleMethod(frame4, 22, (Object) null, 0);
        lambda$Fn5 = moduleMethod21;
        new ModuleMethod(frame4, 23, (Object) null, 0);
        lambda$Fn6 = moduleMethod22;
        new ModuleMethod(frame4, 24, (Object) null, 0);
        lambda$Fn7 = moduleMethod23;
        new ModuleMethod(frame4, 25, (Object) null, 0);
        lambda$Fn8 = moduleMethod24;
        new ModuleMethod(frame4, 26, (Object) null, 0);
        lambda$Fn9 = moduleMethod25;
        new ModuleMethod(frame4, 27, (Object) null, 0);
        lambda$Fn10 = moduleMethod26;
        new ModuleMethod(frame4, 28, Lit77, 0);
        this.Button1$Click = moduleMethod27;
        new ModuleMethod(frame4, 29, (Object) null, 0);
        lambda$Fn11 = moduleMethod28;
        new ModuleMethod(frame4, 30, (Object) null, 0);
        lambda$Fn12 = moduleMethod29;
        new ModuleMethod(frame4, 31, (Object) null, 0);
        lambda$Fn13 = moduleMethod30;
        new ModuleMethod(frame4, 32, (Object) null, 0);
        lambda$Fn14 = moduleMethod31;
        new ModuleMethod(frame4, 33, (Object) null, 0);
        lambda$Fn15 = moduleMethod32;
        new ModuleMethod(frame4, 34, (Object) null, 0);
        lambda$Fn16 = moduleMethod33;
        new ModuleMethod(frame4, 35, (Object) null, 0);
        lambda$Fn17 = moduleMethod34;
        new ModuleMethod(frame4, 36, (Object) null, 0);
        lambda$Fn18 = moduleMethod35;
        new ModuleMethod(frame4, 37, Lit98, 0);
        this.Clock1$Timer = moduleMethod36;
    }

    public Object lookupInFormEnvironment(Symbol symbol) {
        return lookupInFormEnvironment(symbol, Boolean.FALSE);
    }

    public void run() {
        Throwable th;
        CallContext instance = CallContext.getInstance();
        Consumer consumer = instance.consumer;
        instance.consumer = VoidConsumer.instance;
        try {
            run(instance);
            th = null;
        } catch (Throwable th2) {
            th = th2;
        }
        ModuleBody.runCleanup(instance, th, consumer);
    }

    public final void run(CallContext $ctx) {
        Throwable th;
        String obj;
        Throwable th2;
        Object obj2;
        Consumer $result = $ctx.consumer;
        Object find = require.find("com.google.youngandroid.runtime");
        Object obj3 = find;
        try {
            ((Runnable) find).run();
            this.$Stdebug$Mnform$St = Boolean.FALSE;
            this.form$Mnenvironment = Environment.make(misc.symbol$To$String(Lit0));
            Object[] objArr = new Object[2];
            objArr[0] = misc.symbol$To$String(Lit0);
            Object[] objArr2 = objArr;
            objArr2[1] = "-global-vars";
            FString stringAppend = strings.stringAppend(objArr2);
            FString fString = stringAppend;
            if (stringAppend == null) {
                obj = null;
            } else {
                obj = fString.toString();
            }
            this.global$Mnvar$Mnenvironment = Environment.make(obj);
            Screen1 = null;
            this.form$Mnname$Mnsymbol = Lit0;
            this.events$Mnto$Mnregister = LList.Empty;
            this.components$Mnto$Mncreate = LList.Empty;
            this.global$Mnvars$Mnto$Mncreate = LList.Empty;
            this.form$Mndo$Mnafter$Mncreation = LList.Empty;
            Object find2 = require.find("com.google.youngandroid.runtime");
            Object obj4 = find2;
            try {
                ((Runnable) find2).run();
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Object andCoerceProperty$Ex = runtime.setAndCoerceProperty$Ex(Lit0, Lit3, "Data you can send:\n1. hi\n2. hello\n3. how are you?\n4. I am fine\n5. ok\n6. good morning\n7. good afternoon\n8. good evening\n9. thank you\n10. sorry ", Lit4);
                    Object andCoerceProperty$Ex2 = runtime.setAndCoerceProperty$Ex(Lit0, Lit5, Lit6, Lit7);
                    Object andCoerceProperty$Ex3 = runtime.setAndCoerceProperty$Ex(Lit0, Lit8, "4556654899101696", Lit4);
                    Object andCoerceProperty$Ex4 = runtime.setAndCoerceProperty$Ex(Lit0, Lit9, "LiFiProject", Lit4);
                    Object andCoerceProperty$Ex5 = runtime.setAndCoerceProperty$Ex(Lit0, Lit10, "giamportone180800208.jpg", Lit4);
                    Object andCoerceProperty$Ex6 = runtime.setAndCoerceProperty$Ex(Lit0, Lit11, "com.LiFi.Project", Lit4);
                    Object andCoerceProperty$Ex7 = runtime.setAndCoerceProperty$Ex(Lit0, Lit12, Lit13, Lit7);
                    Object andCoerceProperty$Ex8 = runtime.setAndCoerceProperty$Ex(Lit0, Lit14, Lit15, Lit7);
                    Values.writeValues(runtime.setAndCoerceProperty$Ex(Lit0, Lit16, "LiFi Data Transmission", Lit4), $result);
                } else {
                    new Promise(lambda$Fn2);
                    addToFormDoAfterCreation(obj2);
                }
                this.Space1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit17, Lit18, lambda$Fn3), $result);
                } else {
                    addToComponents(Lit0, Lit21, Lit18, lambda$Fn4);
                }
                this.Horizontal_Arrangement1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit22, Lit23, lambda$Fn5), $result);
                } else {
                    addToComponents(Lit0, Lit32, Lit23, lambda$Fn6);
                }
                this.Text_Box1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit23, Lit33, Lit34, lambda$Fn7), $result);
                } else {
                    addToComponents(Lit23, Lit44, Lit34, lambda$Fn8);
                }
                this.Button1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit45, Lit46, lambda$Fn9), $result);
                } else {
                    addToComponents(Lit0, Lit50, Lit46, lambda$Fn10);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Object addToCurrentFormEnvironment = runtime.addToCurrentFormEnvironment(Lit77, this.Button1$Click);
                } else {
                    addToFormEnvironment(Lit77, this.Button1$Click);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Button1", "Click");
                } else {
                    addToEvents(Lit46, Lit78);
                }
                this.Space2 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit79, Lit80, lambda$Fn11), $result);
                } else {
                    addToComponents(Lit0, Lit82, Lit80, lambda$Fn12);
                }
                this.Label1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit83, Lit52, lambda$Fn13), $result);
                } else {
                    addToComponents(Lit0, Lit84, Lit52, lambda$Fn14);
                }
                this.Image1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit85, Lit86, lambda$Fn15), $result);
                } else {
                    addToComponents(Lit0, Lit90, Lit86, lambda$Fn16);
                }
                this.TaifunFlashlight1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit91, Lit53, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit0, Lit92, Lit53, Boolean.FALSE);
                }
                this.Clock1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit93, Lit55, lambda$Fn17), $result);
                } else {
                    addToComponents(Lit0, Lit96, Lit55, lambda$Fn18);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Object addToCurrentFormEnvironment2 = runtime.addToCurrentFormEnvironment(Lit98, this.Clock1$Timer);
                } else {
                    addToFormEnvironment(Lit98, this.Clock1$Timer);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Clock1", "Timer");
                } else {
                    addToEvents(Lit55, Lit99);
                }
                runtime.initRuntime();
            } catch (ClassCastException e) {
                ClassCastException classCastException = e;
                Throwable th3 = th2;
                new WrongType(classCastException, "java.lang.Runnable.run()", 1, obj4);
                throw th3;
            }
        } catch (ClassCastException e2) {
            ClassCastException classCastException2 = e2;
            Throwable th4 = th;
            new WrongType(classCastException2, "java.lang.Runnable.run()", 1, obj3);
            throw th4;
        }
    }

    static Object lambda3() {
        Object andCoerceProperty$Ex = runtime.setAndCoerceProperty$Ex(Lit0, Lit3, "Data you can send:\n1. hi\n2. hello\n3. how are you?\n4. I am fine\n5. ok\n6. good morning\n7. good afternoon\n8. good evening\n9. thank you\n10. sorry ", Lit4);
        Object andCoerceProperty$Ex2 = runtime.setAndCoerceProperty$Ex(Lit0, Lit5, Lit6, Lit7);
        Object andCoerceProperty$Ex3 = runtime.setAndCoerceProperty$Ex(Lit0, Lit8, "4556654899101696", Lit4);
        Object andCoerceProperty$Ex4 = runtime.setAndCoerceProperty$Ex(Lit0, Lit9, "LiFiProject", Lit4);
        Object andCoerceProperty$Ex5 = runtime.setAndCoerceProperty$Ex(Lit0, Lit10, "giamportone180800208.jpg", Lit4);
        Object andCoerceProperty$Ex6 = runtime.setAndCoerceProperty$Ex(Lit0, Lit11, "com.LiFi.Project", Lit4);
        Object andCoerceProperty$Ex7 = runtime.setAndCoerceProperty$Ex(Lit0, Lit12, Lit13, Lit7);
        Object andCoerceProperty$Ex8 = runtime.setAndCoerceProperty$Ex(Lit0, Lit14, Lit15, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit0, Lit16, "LiFi Data Transmission", Lit4);
    }

    static Object lambda4() {
        return runtime.setAndCoerceProperty$Ex(Lit18, Lit19, Lit20, Lit7);
    }

    static Object lambda5() {
        return runtime.setAndCoerceProperty$Ex(Lit18, Lit19, Lit20, Lit7);
    }

    static Object lambda6() {
        Object andCoerceProperty$Ex = runtime.setAndCoerceProperty$Ex(Lit23, Lit5, Lit6, Lit7);
        Object andCoerceProperty$Ex2 = runtime.setAndCoerceProperty$Ex(Lit23, Lit24, Lit25, Lit7);
        Object andCoerceProperty$Ex3 = runtime.setAndCoerceProperty$Ex(Lit23, Lit19, Lit26, Lit7);
        Object andCoerceProperty$Ex4 = runtime.setAndCoerceProperty$Ex(Lit23, Lit27, Lit28, Lit7);
        Object andCoerceProperty$Ex5 = runtime.setAndCoerceProperty$Ex(Lit23, Lit29, Boolean.TRUE, Lit30);
        return runtime.setAndCoerceProperty$Ex(Lit23, Lit31, Boolean.TRUE, Lit30);
    }

    static Object lambda7() {
        Object andCoerceProperty$Ex = runtime.setAndCoerceProperty$Ex(Lit23, Lit5, Lit6, Lit7);
        Object andCoerceProperty$Ex2 = runtime.setAndCoerceProperty$Ex(Lit23, Lit24, Lit25, Lit7);
        Object andCoerceProperty$Ex3 = runtime.setAndCoerceProperty$Ex(Lit23, Lit19, Lit26, Lit7);
        Object andCoerceProperty$Ex4 = runtime.setAndCoerceProperty$Ex(Lit23, Lit27, Lit28, Lit7);
        Object andCoerceProperty$Ex5 = runtime.setAndCoerceProperty$Ex(Lit23, Lit29, Boolean.TRUE, Lit30);
        return runtime.setAndCoerceProperty$Ex(Lit23, Lit31, Boolean.TRUE, Lit30);
    }

    static Object lambda8() {
        Object andCoerceProperty$Ex = runtime.setAndCoerceProperty$Ex(Lit34, Lit35, Boolean.TRUE, Lit30);
        Object andCoerceProperty$Ex2 = runtime.setAndCoerceProperty$Ex(Lit34, Lit36, Lit37, Lit7);
        Object andCoerceProperty$Ex3 = runtime.setAndCoerceProperty$Ex(Lit34, Lit27, Lit38, Lit7);
        Object andCoerceProperty$Ex4 = runtime.setAndCoerceProperty$Ex(Lit34, Lit39, "Enter Data to Transfer", Lit4);
        Object andCoerceProperty$Ex5 = runtime.setAndCoerceProperty$Ex(Lit34, Lit40, Lit41, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit34, Lit42, Lit43, Lit7);
    }

    static Object lambda9() {
        Object andCoerceProperty$Ex = runtime.setAndCoerceProperty$Ex(Lit34, Lit35, Boolean.TRUE, Lit30);
        Object andCoerceProperty$Ex2 = runtime.setAndCoerceProperty$Ex(Lit34, Lit36, Lit37, Lit7);
        Object andCoerceProperty$Ex3 = runtime.setAndCoerceProperty$Ex(Lit34, Lit27, Lit38, Lit7);
        Object andCoerceProperty$Ex4 = runtime.setAndCoerceProperty$Ex(Lit34, Lit39, "Enter Data to Transfer", Lit4);
        Object andCoerceProperty$Ex5 = runtime.setAndCoerceProperty$Ex(Lit34, Lit40, Lit41, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit34, Lit42, Lit43, Lit7);
    }

    static Object lambda10() {
        Object andCoerceProperty$Ex = runtime.setAndCoerceProperty$Ex(Lit46, Lit35, Boolean.TRUE, Lit30);
        Object andCoerceProperty$Ex2 = runtime.setAndCoerceProperty$Ex(Lit46, Lit36, Lit47, Lit7);
        Object andCoerceProperty$Ex3 = runtime.setAndCoerceProperty$Ex(Lit46, Lit19, Lit48, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit46, Lit49, "Send", Lit4);
    }

    static Object lambda11() {
        Object andCoerceProperty$Ex = runtime.setAndCoerceProperty$Ex(Lit46, Lit35, Boolean.TRUE, Lit30);
        Object andCoerceProperty$Ex2 = runtime.setAndCoerceProperty$Ex(Lit46, Lit36, Lit47, Lit7);
        Object andCoerceProperty$Ex3 = runtime.setAndCoerceProperty$Ex(Lit46, Lit19, Lit48, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit46, Lit49, "Send", Lit4);
    }

    public Object Button1$Click() {
        Object obj;
        runtime.setThisForm();
        if (runtime.callYailPrimitive(runtime.yail$Mnequal$Qu, LList.list2(runtime.getProperty$1(Lit34, Lit49), "hi"), Lit51, "=") != Boolean.FALSE) {
            Object andCoerceProperty$Ex = runtime.setAndCoerceProperty$Ex(Lit52, Lit49, "Sending Data....", Lit4);
            Object callComponentMethod = runtime.callComponentMethod(Lit53, Lit54, LList.Empty, LList.Empty);
            Object andCoerceProperty$Ex2 = runtime.setAndCoerceProperty$Ex(Lit55, Lit56, Lit57, Lit7);
            Object andCoerceProperty$Ex3 = runtime.setAndCoerceProperty$Ex(Lit55, Lit58, Boolean.TRUE, Lit30);
        }
        if (runtime.callYailPrimitive(runtime.yail$Mnequal$Qu, LList.list2(runtime.getProperty$1(Lit34, Lit49), "hello"), Lit59, "=") != Boolean.FALSE) {
            Object andCoerceProperty$Ex4 = runtime.setAndCoerceProperty$Ex(Lit52, Lit49, "Sending Data....", Lit4);
            Object callComponentMethod2 = runtime.callComponentMethod(Lit53, Lit54, LList.Empty, LList.Empty);
            Object andCoerceProperty$Ex5 = runtime.setAndCoerceProperty$Ex(Lit55, Lit56, Lit60, Lit7);
            Object andCoerceProperty$Ex6 = runtime.setAndCoerceProperty$Ex(Lit55, Lit58, Boolean.TRUE, Lit30);
        }
        if (runtime.callYailPrimitive(runtime.yail$Mnequal$Qu, LList.list2(runtime.getProperty$1(Lit34, Lit49), "how are you?"), Lit61, "=") != Boolean.FALSE) {
            Object andCoerceProperty$Ex7 = runtime.setAndCoerceProperty$Ex(Lit52, Lit49, "Sending Data....", Lit4);
            Object callComponentMethod3 = runtime.callComponentMethod(Lit53, Lit54, LList.Empty, LList.Empty);
            Object andCoerceProperty$Ex8 = runtime.setAndCoerceProperty$Ex(Lit55, Lit56, Lit62, Lit7);
            Object andCoerceProperty$Ex9 = runtime.setAndCoerceProperty$Ex(Lit55, Lit58, Boolean.TRUE, Lit30);
        }
        if (runtime.callYailPrimitive(runtime.yail$Mnequal$Qu, LList.list2(runtime.getProperty$1(Lit34, Lit49), "I am fine"), Lit63, "=") != Boolean.FALSE) {
            Object andCoerceProperty$Ex10 = runtime.setAndCoerceProperty$Ex(Lit52, Lit49, "Sending Data....", Lit4);
            Object callComponentMethod4 = runtime.callComponentMethod(Lit53, Lit54, LList.Empty, LList.Empty);
            Object andCoerceProperty$Ex11 = runtime.setAndCoerceProperty$Ex(Lit55, Lit56, Lit64, Lit7);
            Object andCoerceProperty$Ex12 = runtime.setAndCoerceProperty$Ex(Lit55, Lit58, Boolean.TRUE, Lit30);
        }
        if (runtime.callYailPrimitive(runtime.yail$Mnequal$Qu, LList.list2(runtime.getProperty$1(Lit34, Lit49), "ok"), Lit65, "=") != Boolean.FALSE) {
            Object andCoerceProperty$Ex13 = runtime.setAndCoerceProperty$Ex(Lit52, Lit49, "Sending Data....", Lit4);
            Object callComponentMethod5 = runtime.callComponentMethod(Lit53, Lit54, LList.Empty, LList.Empty);
            Object andCoerceProperty$Ex14 = runtime.setAndCoerceProperty$Ex(Lit55, Lit56, Lit66, Lit7);
            Object andCoerceProperty$Ex15 = runtime.setAndCoerceProperty$Ex(Lit55, Lit58, Boolean.TRUE, Lit30);
        }
        if (runtime.callYailPrimitive(runtime.yail$Mnequal$Qu, LList.list2(runtime.getProperty$1(Lit34, Lit49), "good morning"), Lit67, "=") != Boolean.FALSE) {
            Object andCoerceProperty$Ex16 = runtime.setAndCoerceProperty$Ex(Lit52, Lit49, "Sending Data....", Lit4);
            Object callComponentMethod6 = runtime.callComponentMethod(Lit53, Lit54, LList.Empty, LList.Empty);
            Object andCoerceProperty$Ex17 = runtime.setAndCoerceProperty$Ex(Lit55, Lit56, Lit68, Lit7);
            Object andCoerceProperty$Ex18 = runtime.setAndCoerceProperty$Ex(Lit55, Lit58, Boolean.TRUE, Lit30);
        }
        if (runtime.callYailPrimitive(runtime.yail$Mnequal$Qu, LList.list2(runtime.getProperty$1(Lit34, Lit49), "good afternoon"), Lit69, "=") != Boolean.FALSE) {
            Object andCoerceProperty$Ex19 = runtime.setAndCoerceProperty$Ex(Lit52, Lit49, "Sending Data....", Lit4);
            Object callComponentMethod7 = runtime.callComponentMethod(Lit53, Lit54, LList.Empty, LList.Empty);
            Object andCoerceProperty$Ex20 = runtime.setAndCoerceProperty$Ex(Lit55, Lit56, Lit70, Lit7);
            Object andCoerceProperty$Ex21 = runtime.setAndCoerceProperty$Ex(Lit55, Lit58, Boolean.TRUE, Lit30);
        }
        if (runtime.callYailPrimitive(runtime.yail$Mnequal$Qu, LList.list2(runtime.getProperty$1(Lit34, Lit49), "good evening"), Lit71, "=") != Boolean.FALSE) {
            Object andCoerceProperty$Ex22 = runtime.setAndCoerceProperty$Ex(Lit52, Lit49, "Sending Data....", Lit4);
            Object callComponentMethod8 = runtime.callComponentMethod(Lit53, Lit54, LList.Empty, LList.Empty);
            Object andCoerceProperty$Ex23 = runtime.setAndCoerceProperty$Ex(Lit55, Lit56, Lit72, Lit7);
            Object andCoerceProperty$Ex24 = runtime.setAndCoerceProperty$Ex(Lit55, Lit58, Boolean.TRUE, Lit30);
        }
        if (runtime.callYailPrimitive(runtime.yail$Mnequal$Qu, LList.list2(runtime.getProperty$1(Lit34, Lit49), "thank you"), Lit73, "=") != Boolean.FALSE) {
            Object andCoerceProperty$Ex25 = runtime.setAndCoerceProperty$Ex(Lit52, Lit49, "Sending Data....", Lit4);
            Object callComponentMethod9 = runtime.callComponentMethod(Lit53, Lit54, LList.Empty, LList.Empty);
            Object andCoerceProperty$Ex26 = runtime.setAndCoerceProperty$Ex(Lit55, Lit56, Lit74, Lit7);
            Object andCoerceProperty$Ex27 = runtime.setAndCoerceProperty$Ex(Lit55, Lit58, Boolean.TRUE, Lit30);
        }
        if (runtime.callYailPrimitive(runtime.yail$Mnequal$Qu, LList.list2(runtime.getProperty$1(Lit34, Lit49), "sorry"), Lit75, "=") != Boolean.FALSE) {
            Object andCoerceProperty$Ex28 = runtime.setAndCoerceProperty$Ex(Lit52, Lit49, "Sending Data....", Lit4);
            Object callComponentMethod10 = runtime.callComponentMethod(Lit53, Lit54, LList.Empty, LList.Empty);
            Object andCoerceProperty$Ex29 = runtime.setAndCoerceProperty$Ex(Lit55, Lit56, Lit76, Lit7);
            obj = runtime.setAndCoerceProperty$Ex(Lit55, Lit58, Boolean.TRUE, Lit30);
        } else {
            obj = Values.empty;
        }
        return obj;
    }

    static Object lambda12() {
        return runtime.setAndCoerceProperty$Ex(Lit80, Lit19, Lit81, Lit7);
    }

    static Object lambda13() {
        return runtime.setAndCoerceProperty$Ex(Lit80, Lit19, Lit81, Lit7);
    }

    static Object lambda14() {
        Object andCoerceProperty$Ex = runtime.setAndCoerceProperty$Ex(Lit52, Lit35, Boolean.TRUE, Lit30);
        Object andCoerceProperty$Ex2 = runtime.setAndCoerceProperty$Ex(Lit52, Lit36, Lit47, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit52, Lit49, "No data to send!", Lit4);
    }

    static Object lambda15() {
        Object andCoerceProperty$Ex = runtime.setAndCoerceProperty$Ex(Lit52, Lit35, Boolean.TRUE, Lit30);
        Object andCoerceProperty$Ex2 = runtime.setAndCoerceProperty$Ex(Lit52, Lit36, Lit47, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit52, Lit49, "No data to send!", Lit4);
    }

    static Object lambda16() {
        Object andCoerceProperty$Ex = runtime.setAndCoerceProperty$Ex(Lit86, Lit19, Lit87, Lit7);
        Object andCoerceProperty$Ex2 = runtime.setAndCoerceProperty$Ex(Lit86, Lit27, Lit88, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit86, Lit89, "LiFi-image-01.png", Lit4);
    }

    static Object lambda17() {
        Object andCoerceProperty$Ex = runtime.setAndCoerceProperty$Ex(Lit86, Lit19, Lit87, Lit7);
        Object andCoerceProperty$Ex2 = runtime.setAndCoerceProperty$Ex(Lit86, Lit27, Lit88, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit86, Lit89, "LiFi-image-01.png", Lit4);
    }

    static Object lambda18() {
        Object andCoerceProperty$Ex = runtime.setAndCoerceProperty$Ex(Lit55, Lit94, Boolean.FALSE, Lit30);
        Object andCoerceProperty$Ex2 = runtime.setAndCoerceProperty$Ex(Lit55, Lit58, Boolean.FALSE, Lit30);
        return runtime.setAndCoerceProperty$Ex(Lit55, Lit56, Lit95, Lit7);
    }

    static Object lambda19() {
        Object andCoerceProperty$Ex = runtime.setAndCoerceProperty$Ex(Lit55, Lit94, Boolean.FALSE, Lit30);
        Object andCoerceProperty$Ex2 = runtime.setAndCoerceProperty$Ex(Lit55, Lit58, Boolean.FALSE, Lit30);
        return runtime.setAndCoerceProperty$Ex(Lit55, Lit56, Lit95, Lit7);
    }

    public Object Clock1$Timer() {
        runtime.setThisForm();
        Object callComponentMethod = runtime.callComponentMethod(Lit53, Lit97, LList.Empty, LList.Empty);
        return runtime.setAndCoerceProperty$Ex(Lit52, Lit49, "Data sent!", Lit4);
    }

    /* compiled from: Screen1.yail */
    public class frame extends ModuleBody {
        Screen1 $main;

        public frame() {
        }

        public int match1(ModuleMethod moduleMethod, Object obj, CallContext callContext) {
            ModuleMethod moduleMethod2 = moduleMethod;
            Object obj2 = obj;
            CallContext callContext2 = callContext;
            switch (moduleMethod2.selector) {
                case 1:
                    callContext2.value1 = obj2;
                    callContext2.proc = moduleMethod2;
                    callContext2.pc = 1;
                    return 0;
                case 2:
                    callContext2.value1 = obj2;
                    callContext2.proc = moduleMethod2;
                    callContext2.pc = 1;
                    return 0;
                case 4:
                    CallContext callContext3 = callContext2;
                    Object obj3 = obj2;
                    Object obj4 = obj3;
                    if (!(obj3 instanceof Symbol)) {
                        return -786431;
                    }
                    callContext3.value1 = obj4;
                    callContext2.proc = moduleMethod2;
                    callContext2.pc = 1;
                    return 0;
                case 6:
                    CallContext callContext4 = callContext2;
                    Object obj5 = obj2;
                    Object obj6 = obj5;
                    if (!(obj5 instanceof Symbol)) {
                        return -786431;
                    }
                    callContext4.value1 = obj6;
                    callContext2.proc = moduleMethod2;
                    callContext2.pc = 1;
                    return 0;
                case 11:
                    callContext2.value1 = obj2;
                    callContext2.proc = moduleMethod2;
                    callContext2.pc = 1;
                    return 0;
                case 12:
                    callContext2.value1 = obj2;
                    callContext2.proc = moduleMethod2;
                    callContext2.pc = 1;
                    return 0;
                case 13:
                    CallContext callContext5 = callContext2;
                    Object obj7 = obj2;
                    Object obj8 = obj7;
                    if (!(obj7 instanceof Screen1)) {
                        return -786431;
                    }
                    callContext5.value1 = obj8;
                    callContext2.proc = moduleMethod2;
                    callContext2.pc = 1;
                    return 0;
                default:
                    return super.match1(moduleMethod2, obj2, callContext2);
            }
        }

        public int match2(ModuleMethod moduleMethod, Object obj, Object obj2, CallContext callContext) {
            ModuleMethod moduleMethod2 = moduleMethod;
            Object obj3 = obj;
            Object obj4 = obj2;
            CallContext callContext2 = callContext;
            switch (moduleMethod2.selector) {
                case 3:
                    CallContext callContext3 = callContext2;
                    Object obj5 = obj3;
                    Object obj6 = obj5;
                    if (!(obj5 instanceof Symbol)) {
                        return -786431;
                    }
                    callContext3.value1 = obj6;
                    callContext2.value2 = obj4;
                    callContext2.proc = moduleMethod2;
                    callContext2.pc = 2;
                    return 0;
                case 4:
                    CallContext callContext4 = callContext2;
                    Object obj7 = obj3;
                    Object obj8 = obj7;
                    if (!(obj7 instanceof Symbol)) {
                        return -786431;
                    }
                    callContext4.value1 = obj8;
                    callContext2.value2 = obj4;
                    callContext2.proc = moduleMethod2;
                    callContext2.pc = 2;
                    return 0;
                case 7:
                    CallContext callContext5 = callContext2;
                    Object obj9 = obj3;
                    Object obj10 = obj9;
                    if (!(obj9 instanceof Symbol)) {
                        return -786431;
                    }
                    callContext5.value1 = obj10;
                    callContext2.value2 = obj4;
                    callContext2.proc = moduleMethod2;
                    callContext2.pc = 2;
                    return 0;
                case 8:
                    callContext2.value1 = obj3;
                    callContext2.value2 = obj4;
                    callContext2.proc = moduleMethod2;
                    callContext2.pc = 2;
                    return 0;
                case 10:
                    callContext2.value1 = obj3;
                    callContext2.value2 = obj4;
                    callContext2.proc = moduleMethod2;
                    callContext2.pc = 2;
                    return 0;
                case 16:
                    callContext2.value1 = obj3;
                    callContext2.value2 = obj4;
                    callContext2.proc = moduleMethod2;
                    callContext2.pc = 2;
                    return 0;
                default:
                    return super.match2(moduleMethod2, obj3, obj4, callContext2);
            }
        }

        public int match4(ModuleMethod moduleMethod, Object obj, Object obj2, Object obj3, Object obj4, CallContext callContext) {
            ModuleMethod moduleMethod2 = moduleMethod;
            Object obj5 = obj;
            Object obj6 = obj2;
            Object obj7 = obj3;
            Object obj8 = obj4;
            CallContext callContext2 = callContext;
            switch (moduleMethod2.selector) {
                case 9:
                    callContext2.value1 = obj5;
                    callContext2.value2 = obj6;
                    callContext2.value3 = obj7;
                    callContext2.value4 = obj8;
                    callContext2.proc = moduleMethod2;
                    callContext2.pc = 4;
                    return 0;
                case 14:
                    CallContext callContext3 = callContext2;
                    Object obj9 = obj5;
                    Object obj10 = obj9;
                    if (!(obj9 instanceof Screen1)) {
                        return -786431;
                    }
                    callContext3.value1 = obj10;
                    CallContext callContext4 = callContext2;
                    Object obj11 = obj6;
                    Object obj12 = obj11;
                    if (!(obj11 instanceof Component)) {
                        return -786430;
                    }
                    callContext4.value2 = obj12;
                    CallContext callContext5 = callContext2;
                    Object obj13 = obj7;
                    Object obj14 = obj13;
                    if (!(obj13 instanceof String)) {
                        return -786429;
                    }
                    callContext5.value3 = obj14;
                    CallContext callContext6 = callContext2;
                    Object obj15 = obj8;
                    Object obj16 = obj15;
                    if (!(obj15 instanceof String)) {
                        return -786428;
                    }
                    callContext6.value4 = obj16;
                    callContext2.proc = moduleMethod2;
                    callContext2.pc = 4;
                    return 0;
                case 15:
                    CallContext callContext7 = callContext2;
                    Object obj17 = obj5;
                    Object obj18 = obj17;
                    if (!(obj17 instanceof Screen1)) {
                        return -786431;
                    }
                    callContext7.value1 = obj18;
                    CallContext callContext8 = callContext2;
                    Object obj19 = obj6;
                    Object obj20 = obj19;
                    if (!(obj19 instanceof Component)) {
                        return -786430;
                    }
                    callContext8.value2 = obj20;
                    CallContext callContext9 = callContext2;
                    Object obj21 = obj7;
                    Object obj22 = obj21;
                    if (!(obj21 instanceof String)) {
                        return -786429;
                    }
                    callContext9.value3 = obj22;
                    CallContext callContext10 = callContext2;
                    Object obj23 = obj8;
                    Object obj24 = obj23;
                    Object obj25 = obj23;
                    if (1 == 0) {
                        return -786428;
                    }
                    callContext10.value4 = obj24;
                    callContext2.proc = moduleMethod2;
                    callContext2.pc = 4;
                    return 0;
                default:
                    return super.match4(moduleMethod2, obj5, obj6, obj7, obj8, callContext2);
            }
        }

        public Object apply1(ModuleMethod moduleMethod, Object obj) {
            Throwable th;
            Throwable th2;
            ModuleMethod moduleMethod2 = moduleMethod;
            Object obj2 = obj;
            switch (moduleMethod2.selector) {
                case 1:
                    return this.$main.getSimpleName(obj2);
                case 2:
                    this.$main.androidLogForm(obj2);
                    return Values.empty;
                case 4:
                    try {
                        return this.$main.lookupInFormEnvironment((Symbol) obj2);
                    } catch (ClassCastException e) {
                        ClassCastException classCastException = e;
                        Throwable th3 = th2;
                        new WrongType(classCastException, "lookup-in-form-environment", 1, obj2);
                        throw th3;
                    }
                case 6:
                    try {
                        return this.$main.isBoundInFormEnvironment((Symbol) obj2) ? Boolean.TRUE : Boolean.FALSE;
                    } catch (ClassCastException e2) {
                        ClassCastException classCastException2 = e2;
                        Throwable th4 = th;
                        new WrongType(classCastException2, "is-bound-in-form-environment", 1, obj2);
                        throw th4;
                    }
                case 11:
                    this.$main.addToFormDoAfterCreation(obj2);
                    return Values.empty;
                case 12:
                    this.$main.sendError(obj2);
                    return Values.empty;
                case 13:
                    this.$main.processException(obj2);
                    return Values.empty;
                default:
                    return super.apply1(moduleMethod2, obj2);
            }
        }

        public Object apply4(ModuleMethod moduleMethod, Object obj, Object obj2, Object obj3, Object obj4) {
            Throwable th;
            Throwable th2;
            Throwable th3;
            Throwable th4;
            Throwable th5;
            Throwable th6;
            Throwable th7;
            Throwable th8;
            ModuleMethod moduleMethod2 = moduleMethod;
            Object obj5 = obj;
            Object obj6 = obj2;
            Object obj7 = obj3;
            Object obj8 = obj4;
            switch (moduleMethod2.selector) {
                case 9:
                    this.$main.addToComponents(obj5, obj6, obj7, obj8);
                    return Values.empty;
                case 14:
                    try {
                        try {
                            try {
                                try {
                                    return this.$main.dispatchEvent((Component) obj5, (String) obj6, (String) obj7, (Object[]) obj8) ? Boolean.TRUE : Boolean.FALSE;
                                } catch (ClassCastException e) {
                                    ClassCastException classCastException = e;
                                    Throwable th9 = th8;
                                    new WrongType(classCastException, "dispatchEvent", 4, obj8);
                                    throw th9;
                                }
                            } catch (ClassCastException e2) {
                                ClassCastException classCastException2 = e2;
                                Throwable th10 = th7;
                                new WrongType(classCastException2, "dispatchEvent", 3, obj7);
                                throw th10;
                            }
                        } catch (ClassCastException e3) {
                            ClassCastException classCastException3 = e3;
                            Throwable th11 = th6;
                            new WrongType(classCastException3, "dispatchEvent", 2, obj6);
                            throw th11;
                        }
                    } catch (ClassCastException e4) {
                        ClassCastException classCastException4 = e4;
                        Throwable th12 = th5;
                        new WrongType(classCastException4, "dispatchEvent", 1, obj5);
                        throw th12;
                    }
                case 15:
                    try {
                        try {
                            try {
                                try {
                                    this.$main.dispatchGenericEvent((Component) obj5, (String) obj6, obj7 != Boolean.FALSE, (Object[]) obj8);
                                    return Values.empty;
                                } catch (ClassCastException e5) {
                                    ClassCastException classCastException5 = e5;
                                    Throwable th13 = th4;
                                    new WrongType(classCastException5, "dispatchGenericEvent", 4, obj8);
                                    throw th13;
                                }
                            } catch (ClassCastException e6) {
                                ClassCastException classCastException6 = e6;
                                Throwable th14 = th3;
                                new WrongType(classCastException6, "dispatchGenericEvent", 3, obj7);
                                throw th14;
                            }
                        } catch (ClassCastException e7) {
                            ClassCastException classCastException7 = e7;
                            Throwable th15 = th2;
                            new WrongType(classCastException7, "dispatchGenericEvent", 2, obj6);
                            throw th15;
                        }
                    } catch (ClassCastException e8) {
                        ClassCastException classCastException8 = e8;
                        Throwable th16 = th;
                        new WrongType(classCastException8, "dispatchGenericEvent", 1, obj5);
                        throw th16;
                    }
                default:
                    return super.apply4(moduleMethod2, obj5, obj6, obj7, obj8);
            }
        }

        public Object apply2(ModuleMethod moduleMethod, Object obj, Object obj2) {
            Throwable th;
            Throwable th2;
            Throwable th3;
            ModuleMethod moduleMethod2 = moduleMethod;
            Object obj3 = obj;
            Object obj4 = obj2;
            switch (moduleMethod2.selector) {
                case 3:
                    try {
                        this.$main.addToFormEnvironment((Symbol) obj3, obj4);
                        return Values.empty;
                    } catch (ClassCastException e) {
                        ClassCastException classCastException = e;
                        Throwable th4 = th3;
                        new WrongType(classCastException, "add-to-form-environment", 1, obj3);
                        throw th4;
                    }
                case 4:
                    try {
                        return this.$main.lookupInFormEnvironment((Symbol) obj3, obj4);
                    } catch (ClassCastException e2) {
                        ClassCastException classCastException2 = e2;
                        Throwable th5 = th2;
                        new WrongType(classCastException2, "lookup-in-form-environment", 1, obj3);
                        throw th5;
                    }
                case 7:
                    try {
                        this.$main.addToGlobalVarEnvironment((Symbol) obj3, obj4);
                        return Values.empty;
                    } catch (ClassCastException e3) {
                        ClassCastException classCastException3 = e3;
                        Throwable th6 = th;
                        new WrongType(classCastException3, "add-to-global-var-environment", 1, obj3);
                        throw th6;
                    }
                case 8:
                    this.$main.addToEvents(obj3, obj4);
                    return Values.empty;
                case 10:
                    this.$main.addToGlobalVars(obj3, obj4);
                    return Values.empty;
                case 16:
                    return this.$main.lookupHandler(obj3, obj4);
                default:
                    return super.apply2(moduleMethod2, obj3, obj4);
            }
        }

        public Object apply0(ModuleMethod moduleMethod) {
            ModuleMethod moduleMethod2 = moduleMethod;
            switch (moduleMethod2.selector) {
                case 17:
                    return Screen1.lambda2();
                case 18:
                    this.$main.$define();
                    return Values.empty;
                case 19:
                    return Screen1.lambda3();
                case 20:
                    return Screen1.lambda4();
                case 21:
                    return Screen1.lambda5();
                case 22:
                    return Screen1.lambda6();
                case 23:
                    return Screen1.lambda7();
                case 24:
                    return Screen1.lambda8();
                case 25:
                    return Screen1.lambda9();
                case 26:
                    return Screen1.lambda10();
                case 27:
                    return Screen1.lambda11();
                case 28:
                    return this.$main.Button1$Click();
                case 29:
                    return Screen1.lambda12();
                case 30:
                    return Screen1.lambda13();
                case 31:
                    return Screen1.lambda14();
                case 32:
                    return Screen1.lambda15();
                case 33:
                    return Screen1.lambda16();
                case 34:
                    return Screen1.lambda17();
                case 35:
                    return Screen1.lambda18();
                case 36:
                    return Screen1.lambda19();
                case 37:
                    return this.$main.Clock1$Timer();
                default:
                    return super.apply0(moduleMethod2);
            }
        }

        public int match0(ModuleMethod moduleMethod, CallContext callContext) {
            ModuleMethod moduleMethod2 = moduleMethod;
            CallContext callContext2 = callContext;
            switch (moduleMethod2.selector) {
                case 17:
                    callContext2.proc = moduleMethod2;
                    callContext2.pc = 0;
                    return 0;
                case 18:
                    callContext2.proc = moduleMethod2;
                    callContext2.pc = 0;
                    return 0;
                case 19:
                    callContext2.proc = moduleMethod2;
                    callContext2.pc = 0;
                    return 0;
                case 20:
                    callContext2.proc = moduleMethod2;
                    callContext2.pc = 0;
                    return 0;
                case 21:
                    callContext2.proc = moduleMethod2;
                    callContext2.pc = 0;
                    return 0;
                case 22:
                    callContext2.proc = moduleMethod2;
                    callContext2.pc = 0;
                    return 0;
                case 23:
                    callContext2.proc = moduleMethod2;
                    callContext2.pc = 0;
                    return 0;
                case 24:
                    callContext2.proc = moduleMethod2;
                    callContext2.pc = 0;
                    return 0;
                case 25:
                    callContext2.proc = moduleMethod2;
                    callContext2.pc = 0;
                    return 0;
                case 26:
                    callContext2.proc = moduleMethod2;
                    callContext2.pc = 0;
                    return 0;
                case 27:
                    callContext2.proc = moduleMethod2;
                    callContext2.pc = 0;
                    return 0;
                case 28:
                    callContext2.proc = moduleMethod2;
                    callContext2.pc = 0;
                    return 0;
                case 29:
                    callContext2.proc = moduleMethod2;
                    callContext2.pc = 0;
                    return 0;
                case 30:
                    callContext2.proc = moduleMethod2;
                    callContext2.pc = 0;
                    return 0;
                case 31:
                    callContext2.proc = moduleMethod2;
                    callContext2.pc = 0;
                    return 0;
                case 32:
                    callContext2.proc = moduleMethod2;
                    callContext2.pc = 0;
                    return 0;
                case 33:
                    callContext2.proc = moduleMethod2;
                    callContext2.pc = 0;
                    return 0;
                case 34:
                    callContext2.proc = moduleMethod2;
                    callContext2.pc = 0;
                    return 0;
                case 35:
                    callContext2.proc = moduleMethod2;
                    callContext2.pc = 0;
                    return 0;
                case 36:
                    callContext2.proc = moduleMethod2;
                    callContext2.pc = 0;
                    return 0;
                case 37:
                    callContext2.proc = moduleMethod2;
                    callContext2.pc = 0;
                    return 0;
                default:
                    return super.match0(moduleMethod2, callContext2);
            }
        }
    }

    public String getSimpleName(Object object) {
        return object.getClass().getSimpleName();
    }

    public void androidLogForm(Object message) {
    }

    public void addToFormEnvironment(Symbol symbol, Object obj) {
        Symbol name = symbol;
        Object object = obj;
        Object[] objArr = new Object[4];
        objArr[0] = "Adding ~A to env ~A with value ~A";
        Object[] objArr2 = objArr;
        objArr2[1] = name;
        Object[] objArr3 = objArr2;
        objArr3[2] = this.form$Mnenvironment;
        Object[] objArr4 = objArr3;
        objArr4[3] = object;
        androidLogForm(Format.formatToString(0, objArr4));
        this.form$Mnenvironment.put(name, object);
    }

    public Object lookupInFormEnvironment(Symbol symbol, Object obj) {
        Object obj2;
        Symbol name = symbol;
        Object default$Mnvalue = obj;
        boolean x = ((this.form$Mnenvironment == null ? 1 : 0) + 1) & true;
        if (!x ? !x : !this.form$Mnenvironment.isBound(name)) {
            obj2 = default$Mnvalue;
        } else {
            obj2 = this.form$Mnenvironment.get(name);
        }
        return obj2;
    }

    public boolean isBoundInFormEnvironment(Symbol name) {
        return this.form$Mnenvironment.isBound(name);
    }

    public void addToGlobalVarEnvironment(Symbol symbol, Object obj) {
        Symbol name = symbol;
        Object object = obj;
        Object[] objArr = new Object[4];
        objArr[0] = "Adding ~A to env ~A with value ~A";
        Object[] objArr2 = objArr;
        objArr2[1] = name;
        Object[] objArr3 = objArr2;
        objArr3[2] = this.global$Mnvar$Mnenvironment;
        Object[] objArr4 = objArr3;
        objArr4[3] = object;
        androidLogForm(Format.formatToString(0, objArr4));
        this.global$Mnvar$Mnenvironment.put(name, object);
    }

    public void addToEvents(Object component$Mnname, Object event$Mnname) {
        this.events$Mnto$Mnregister = lists.cons(lists.cons(component$Mnname, event$Mnname), this.events$Mnto$Mnregister);
    }

    public void addToComponents(Object container$Mnname, Object component$Mntype, Object component$Mnname, Object init$Mnthunk) {
        this.components$Mnto$Mncreate = lists.cons(LList.list4(container$Mnname, component$Mntype, component$Mnname, init$Mnthunk), this.components$Mnto$Mncreate);
    }

    public void addToGlobalVars(Object var, Object val$Mnthunk) {
        this.global$Mnvars$Mnto$Mncreate = lists.cons(LList.list2(var, val$Mnthunk), this.global$Mnvars$Mnto$Mncreate);
    }

    public void addToFormDoAfterCreation(Object thunk) {
        this.form$Mndo$Mnafter$Mncreation = lists.cons(thunk, this.form$Mndo$Mnafter$Mncreation);
    }

    public void sendError(Object error) {
        Object obj = error;
        RetValManager.sendError(obj == null ? null : obj.toString());
    }

    public void processException(Object obj) {
        Object ex = obj;
        Object apply1 = Scheme.applyToArgs.apply1(GetNamedPart.getNamedPart.apply2(ex, Lit1));
        RuntimeErrorAlert.alert(this, apply1 == null ? null : apply1.toString(), ex instanceof YailRuntimeError ? ((YailRuntimeError) ex).getErrorType() : "Runtime Error", "End Application");
    }

    public boolean dispatchEvent(Component component, String str, String str2, Object[] objArr) {
        boolean z;
        boolean z2;
        Component componentObject = component;
        String registeredComponentName = str;
        String eventName = str2;
        Object[] args = objArr;
        SimpleSymbol registeredObject = misc.string$To$Symbol(registeredComponentName);
        if (!isBoundInFormEnvironment(registeredObject)) {
            EventDispatcher.unregisterEventForDelegation(this, registeredComponentName, eventName);
            z = false;
        } else if (lookupInFormEnvironment(registeredObject) == componentObject) {
            try {
                Object apply2 = Scheme.apply.apply2(lookupHandler(registeredComponentName, eventName), LList.makeList(args, 0));
                z2 = true;
            } catch (PermissionException e) {
                PermissionException exception = e;
                exception.printStackTrace();
                boolean x = this == componentObject;
                if (!x ? !x : !IsEqual.apply(eventName, "PermissionNeeded")) {
                    PermissionDenied(componentObject, eventName, exception.getPermissionNeeded());
                } else {
                    processException(exception);
                }
                z2 = false;
            } catch (Throwable th) {
                Throwable exception2 = th;
                androidLogForm(exception2.getMessage());
                exception2.printStackTrace();
                processException(exception2);
                z2 = false;
            }
            z = z2;
        } else {
            z = false;
        }
        return z;
    }

    public void dispatchGenericEvent(Component component, String str, boolean z, Object[] objArr) {
        Boolean bool;
        Component componentObject = component;
        String eventName = str;
        boolean notAlreadyHandled = z;
        Object[] args = objArr;
        Object[] objArr2 = new Object[4];
        objArr2[0] = "any$";
        Object[] objArr3 = objArr2;
        objArr3[1] = getSimpleName(componentObject);
        Object[] objArr4 = objArr3;
        objArr4[2] = "$";
        Object[] objArr5 = objArr4;
        objArr5[3] = eventName;
        Object handler = lookupInFormEnvironment(misc.string$To$Symbol(strings.stringAppend(objArr5)));
        if (handler != Boolean.FALSE) {
            try {
                Apply apply = Scheme.apply;
                Object obj = handler;
                Component component2 = componentObject;
                if (notAlreadyHandled) {
                    bool = Boolean.TRUE;
                } else {
                    bool = Boolean.FALSE;
                }
                Object apply2 = apply.apply2(obj, lists.cons(component2, lists.cons(bool, LList.makeList(args, 0))));
            } catch (PermissionException e) {
                PermissionException exception = e;
                exception.printStackTrace();
                boolean x = this == componentObject;
                if (!x ? !x : !IsEqual.apply(eventName, "PermissionNeeded")) {
                    PermissionDenied(componentObject, eventName, exception.getPermissionNeeded());
                } else {
                    processException(exception);
                }
            } catch (Throwable th) {
                Throwable exception2 = th;
                androidLogForm(exception2.getMessage());
                exception2.printStackTrace();
                processException(exception2);
            }
        }
    }

    public Object lookupHandler(Object componentName, Object obj) {
        Object eventName = obj;
        Object obj2 = componentName;
        String obj3 = obj2 == null ? null : obj2.toString();
        Object obj4 = eventName;
        return lookupInFormEnvironment(misc.string$To$Symbol(EventDispatcher.makeFullEventName(obj3, obj4 == null ? null : obj4.toString())));
    }

    public void $define() {
        Object obj;
        Throwable th;
        Object obj2;
        Throwable th2;
        Object obj3;
        Throwable th3;
        Object obj4;
        Throwable th4;
        Object obj5;
        Throwable th5;
        Object obj6;
        Throwable th6;
        Object obj7;
        Throwable th7;
        Object obj8;
        Throwable th8;
        Throwable th9;
        Language.setDefaults(Scheme.getInstance());
        try {
            run();
        } catch (Exception e) {
            Exception exception = e;
            androidLogForm(exception.getMessage());
            processException(exception);
        }
        Screen1 = this;
        addToFormEnvironment(Lit0, this);
        Object obj9 = this.events$Mnto$Mnregister;
        while (true) {
            Object obj10 = obj9;
            if (obj10 == LList.Empty) {
                break;
            }
            Object obj11 = obj10;
            Object obj12 = obj11;
            try {
                Pair arg0 = (Pair) obj11;
                Object event$Mninfo = arg0.getCar();
                Object apply1 = lists.car.apply1(event$Mninfo);
                String obj13 = apply1 == null ? null : apply1.toString();
                Object apply12 = lists.cdr.apply1(event$Mninfo);
                EventDispatcher.registerEventForDelegation(this, obj13, apply12 == null ? null : apply12.toString());
                obj9 = arg0.getCdr();
            } catch (ClassCastException e2) {
                ClassCastException classCastException = e2;
                Throwable th10 = th9;
                new WrongType(classCastException, "arg0", -2, obj12);
                throw th10;
            }
        }
        try {
            LList components = lists.reverse(this.components$Mnto$Mncreate);
            addToGlobalVars(Lit2, lambda$Fn1);
            LList event$Mninfo2 = components;
            while (event$Mninfo2 != LList.Empty) {
                Object obj14 = event$Mninfo2;
                obj6 = obj14;
                Pair arg02 = (Pair) obj14;
                Object component$Mninfo = arg02.getCar();
                Object apply13 = lists.caddr.apply1(component$Mninfo);
                Object apply14 = lists.cadddr.apply1(component$Mninfo);
                Object component$Mntype = lists.cadr.apply1(component$Mninfo);
                Object apply15 = lists.car.apply1(component$Mninfo);
                obj7 = apply15;
                Object component$Mnname = apply13;
                Object component$Mnobject = Invoke.make.apply2(component$Mntype, lookupInFormEnvironment((Symbol) apply15));
                Object apply3 = SlotSet.set$Mnfield$Ex.apply3(this, component$Mnname, component$Mnobject);
                Object obj15 = component$Mnname;
                obj8 = obj15;
                addToFormEnvironment((Symbol) obj15, component$Mnobject);
                event$Mninfo2 = arg02.getCdr();
            }
            LList reverse = lists.reverse(this.global$Mnvars$Mnto$Mncreate);
            while (reverse != LList.Empty) {
                Object obj16 = reverse;
                obj4 = obj16;
                Pair arg03 = (Pair) obj16;
                Object var$Mnval = arg03.getCar();
                Object apply16 = lists.car.apply1(var$Mnval);
                obj5 = apply16;
                addToGlobalVarEnvironment((Symbol) apply16, Scheme.applyToArgs.apply1(lists.cadr.apply1(var$Mnval)));
                reverse = arg03.getCdr();
            }
            Object reverse2 = lists.reverse(this.form$Mndo$Mnafter$Mncreation);
            while (reverse2 != LList.Empty) {
                Object obj17 = reverse2;
                obj3 = obj17;
                Pair arg04 = (Pair) obj17;
                Object force = misc.force(arg04.getCar());
                reverse2 = arg04.getCdr();
            }
            LList component$Mndescriptors = components;
            LList lList = component$Mndescriptors;
            while (lList != LList.Empty) {
                Object obj18 = lList;
                obj2 = obj18;
                Pair arg05 = (Pair) obj18;
                Object component$Mninfo2 = arg05.getCar();
                Object apply17 = lists.caddr.apply1(component$Mninfo2);
                Object init$Mnthunk = lists.cadddr.apply1(component$Mninfo2);
                if (init$Mnthunk != Boolean.FALSE) {
                    Object apply18 = Scheme.applyToArgs.apply1(init$Mnthunk);
                }
                lList = arg05.getCdr();
            }
            LList lList2 = component$Mndescriptors;
            while (lList2 != LList.Empty) {
                Object obj19 = lList2;
                obj = obj19;
                Pair arg06 = (Pair) obj19;
                Object component$Mninfo3 = arg06.getCar();
                Object component$Mnname2 = lists.caddr.apply1(component$Mninfo3);
                Object apply19 = lists.cadddr.apply1(component$Mninfo3);
                callInitialize(SlotGet.field.apply2(this, component$Mnname2));
                lList2 = arg06.getCdr();
            }
        } catch (ClassCastException e3) {
            ClassCastException classCastException2 = e3;
            Throwable th11 = th;
            new WrongType(classCastException2, "arg0", -2, obj);
            throw th11;
        } catch (ClassCastException e4) {
            ClassCastException classCastException3 = e4;
            Throwable th12 = th2;
            new WrongType(classCastException3, "arg0", -2, obj2);
            throw th12;
        } catch (ClassCastException e5) {
            ClassCastException classCastException4 = e5;
            Throwable th13 = th3;
            new WrongType(classCastException4, "arg0", -2, obj3);
            throw th13;
        } catch (ClassCastException e6) {
            ClassCastException classCastException5 = e6;
            Throwable th14 = th5;
            new WrongType(classCastException5, "add-to-global-var-environment", 0, obj5);
            throw th14;
        } catch (ClassCastException e7) {
            ClassCastException classCastException6 = e7;
            Throwable th15 = th4;
            new WrongType(classCastException6, "arg0", -2, obj4);
            throw th15;
        } catch (ClassCastException e8) {
            ClassCastException classCastException7 = e8;
            Throwable th16 = th8;
            new WrongType(classCastException7, "add-to-form-environment", 0, obj8);
            throw th16;
        } catch (ClassCastException e9) {
            ClassCastException classCastException8 = e9;
            Throwable th17 = th7;
            new WrongType(classCastException8, "lookup-in-form-environment", 0, obj7);
            throw th17;
        } catch (ClassCastException e10) {
            ClassCastException classCastException9 = e10;
            Throwable th18 = th6;
            new WrongType(classCastException9, "arg0", -2, obj6);
            throw th18;
        } catch (YailRuntimeError e11) {
            processException(e11);
        }
    }

    public static SimpleSymbol lambda1symbolAppend$V(Object[] argsArray) {
        Throwable th;
        Throwable th2;
        Throwable th3;
        LList symbols = LList.makeList(argsArray, 0);
        LList lList = symbols;
        Apply apply = Scheme.apply;
        ModuleMethod moduleMethod = strings.string$Mnappend;
        Object obj = symbols;
        Object obj2 = LList.Empty;
        while (true) {
            Object obj3 = obj2;
            Object obj4 = obj;
            if (obj4 == LList.Empty) {
                Object apply2 = apply.apply2(moduleMethod, LList.reverseInPlace(obj3));
                Object obj5 = apply2;
                try {
                    return misc.string$To$Symbol((CharSequence) apply2);
                } catch (ClassCastException e) {
                    ClassCastException classCastException = e;
                    Throwable th4 = th;
                    new WrongType(classCastException, "string->symbol", 1, obj5);
                    throw th4;
                }
            } else {
                Object obj6 = obj4;
                Object obj7 = obj6;
                try {
                    Pair arg0 = (Pair) obj6;
                    obj = arg0.getCdr();
                    Object car = arg0.getCar();
                    Object obj8 = car;
                    try {
                        obj2 = Pair.make(misc.symbol$To$String((Symbol) car), obj3);
                    } catch (ClassCastException e2) {
                        ClassCastException classCastException2 = e2;
                        Throwable th5 = th3;
                        new WrongType(classCastException2, "symbol->string", 1, obj8);
                        throw th5;
                    }
                } catch (ClassCastException e3) {
                    ClassCastException classCastException3 = e3;
                    Throwable th6 = th2;
                    new WrongType(classCastException3, "arg0", -2, obj7);
                    throw th6;
                }
            }
        }
    }

    static Object lambda2() {
        return null;
    }
}
