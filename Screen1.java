package appinventor.ai_tshetty510.Defence;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import com.google.appinventor.components.common.PropertyTypeConstants;
import com.google.appinventor.components.runtime.AppInventorCompatActivity;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.HorizontalArrangement;
import com.google.appinventor.components.runtime.Image;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.Notifier;
import com.google.appinventor.components.runtime.PasswordTextBox;
import com.google.appinventor.components.runtime.Spinner;
import com.google.appinventor.components.runtime.TinyWebDB;
import com.google.appinventor.components.runtime.errors.PermissionException;
import com.google.appinventor.components.runtime.errors.YailRuntimeError;
import com.google.appinventor.components.runtime.util.RetValManager;
import com.google.appinventor.components.runtime.util.RuntimeErrorAlert;
import com.google.youngandroid.runtime;
import gnu.expr.Language;
import gnu.expr.ModuleBody;
import gnu.expr.ModuleInfo;
import gnu.expr.ModuleMethod;
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
import gnu.mapping.Procedure;
import gnu.mapping.PropertySet;
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
    static final SimpleSymbol Lit0 = ((SimpleSymbol) new SimpleSymbol("Screen1").readResolve());
    static final SimpleSymbol Lit1 = ((SimpleSymbol) new SimpleSymbol("getMessage").readResolve());
    static final SimpleSymbol Lit10 = ((SimpleSymbol) new SimpleSymbol("GetValue").readResolve());
    static final PairWithPosition Lit11 = PairWithPosition.make(Lit7, LList.Empty, "/tmp/1552236494828_0.6178377661207605-0/youngandroidproject/../src/appinventor/ai_tshetty510/Defence/Screen1.yail", 69712);
    static final PairWithPosition Lit12 = PairWithPosition.make(Lit7, LList.Empty, "/tmp/1552236494828_0.6178377661207605-0/youngandroidproject/../src/appinventor/ai_tshetty510/Defence/Screen1.yail", 69797);
    static final SimpleSymbol Lit13 = ((SimpleSymbol) new SimpleSymbol("Screen1$Initialize").readResolve());
    static final SimpleSymbol Lit14 = ((SimpleSymbol) new SimpleSymbol("Initialize").readResolve());
    static final FString Lit15 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit16 = ((SimpleSymbol) new SimpleSymbol("Label1").readResolve());
    static final SimpleSymbol Lit17 = ((SimpleSymbol) new SimpleSymbol("FontBold").readResolve());
    static final SimpleSymbol Lit18 = ((SimpleSymbol) new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_BOOLEAN).readResolve());
    static final SimpleSymbol Lit19 = ((SimpleSymbol) new SimpleSymbol("FontSize").readResolve());
    static final SimpleSymbol Lit2 = ((SimpleSymbol) new SimpleSymbol("*the-null-value*").readResolve());
    static final IntNum Lit20 = IntNum.make(72);
    static final SimpleSymbol Lit21;
    static final SimpleSymbol Lit22 = ((SimpleSymbol) new SimpleSymbol("Text").readResolve());
    static final SimpleSymbol Lit23 = ((SimpleSymbol) new SimpleSymbol("TextAlignment").readResolve());
    static final IntNum Lit24 = IntNum.make(1);
    static final SimpleSymbol Lit25 = ((SimpleSymbol) new SimpleSymbol("Width").readResolve());
    static final IntNum Lit26 = IntNum.make(-1100);
    static final FString Lit27 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit28 = new FString("com.google.appinventor.components.runtime.Image");
    static final SimpleSymbol Lit29 = ((SimpleSymbol) new SimpleSymbol("Image1").readResolve());
    static final SimpleSymbol Lit3 = ((SimpleSymbol) new SimpleSymbol("g$Password").readResolve());
    static final SimpleSymbol Lit30 = ((SimpleSymbol) new SimpleSymbol("Height").readResolve());
    static final IntNum Lit31 = IntNum.make(-1050);
    static final SimpleSymbol Lit32 = ((SimpleSymbol) new SimpleSymbol("Picture").readResolve());
    static final SimpleSymbol Lit33 = ((SimpleSymbol) new SimpleSymbol("ScalePictureToFit").readResolve());
    static final IntNum Lit34 = IntNum.make(-1100);
    static final FString Lit35 = new FString("com.google.appinventor.components.runtime.Image");
    static final FString Lit36 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit37 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement1").readResolve());
    static final FString Lit38 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final FString Lit39 = new FString("com.google.appinventor.components.runtime.Spinner");
    static final SimpleSymbol Lit4 = ((SimpleSymbol) new SimpleSymbol("g$index").readResolve());
    static final SimpleSymbol Lit40 = ((SimpleSymbol) new SimpleSymbol("Spinner1").readResolve());
    static final FString Lit41 = new FString("com.google.appinventor.components.runtime.Spinner");
    static final SimpleSymbol Lit42 = ((SimpleSymbol) new SimpleSymbol("SelectionIndex").readResolve());
    static final SimpleSymbol Lit43 = ((SimpleSymbol) new SimpleSymbol("Spinner1$AfterSelecting").readResolve());
    static final SimpleSymbol Lit44 = ((SimpleSymbol) new SimpleSymbol("AfterSelecting").readResolve());
    static final FString Lit45 = new FString("com.google.appinventor.components.runtime.PasswordTextBox");
    static final SimpleSymbol Lit46 = ((SimpleSymbol) new SimpleSymbol("PasswordTextBox1").readResolve());
    static final FString Lit47 = new FString("com.google.appinventor.components.runtime.PasswordTextBox");
    static final FString Lit48 = new FString("com.google.appinventor.components.runtime.Button");
    static final SimpleSymbol Lit49 = ((SimpleSymbol) new SimpleSymbol("save_button").readResolve());
    static final IntNum Lit5 = IntNum.make(0);
    static final IntNum Lit50 = IntNum.make(-1100);
    static final FString Lit51 = new FString("com.google.appinventor.components.runtime.Button");
    static final PairWithPosition Lit52 = PairWithPosition.make(Lit89, PairWithPosition.make(Lit89, LList.Empty, "/tmp/1552236494828_0.6178377661207605-0/youngandroidproject/../src/appinventor/ai_tshetty510/Defence/Screen1.yail", 299123), "/tmp/1552236494828_0.6178377661207605-0/youngandroidproject/../src/appinventor/ai_tshetty510/Defence/Screen1.yail", 299118);
    static final PairWithPosition Lit53;
    static final PairWithPosition Lit54 = PairWithPosition.make(Lit89, PairWithPosition.make(Lit89, LList.Empty, "/tmp/1552236494828_0.6178377661207605-0/youngandroidproject/../src/appinventor/ai_tshetty510/Defence/Screen1.yail", 299439), "/tmp/1552236494828_0.6178377661207605-0/youngandroidproject/../src/appinventor/ai_tshetty510/Defence/Screen1.yail", 299434);
    static final SimpleSymbol Lit55 = ((SimpleSymbol) new SimpleSymbol("Notifier1").readResolve());
    static final SimpleSymbol Lit56 = ((SimpleSymbol) new SimpleSymbol("ShowAlert").readResolve());
    static final PairWithPosition Lit57 = PairWithPosition.make(Lit7, LList.Empty, "/tmp/1552236494828_0.6178377661207605-0/youngandroidproject/../src/appinventor/ai_tshetty510/Defence/Screen1.yail", 299538);
    static final PairWithPosition Lit58 = PairWithPosition.make(Lit7, LList.Empty, "/tmp/1552236494828_0.6178377661207605-0/youngandroidproject/../src/appinventor/ai_tshetty510/Defence/Screen1.yail", 299618);
    static final PairWithPosition Lit59 = PairWithPosition.make(Lit7, LList.Empty, "/tmp/1552236494828_0.6178377661207605-0/youngandroidproject/../src/appinventor/ai_tshetty510/Defence/Screen1.yail", 299744);
    static final SimpleSymbol Lit6 = ((SimpleSymbol) new SimpleSymbol("AppName").readResolve());
    static final PairWithPosition Lit60 = PairWithPosition.make(Lit7, LList.Empty, "/tmp/1552236494828_0.6178377661207605-0/youngandroidproject/../src/appinventor/ai_tshetty510/Defence/Screen1.yail", 299855);
    static final SimpleSymbol Lit61 = ((SimpleSymbol) new SimpleSymbol("save_button$Click").readResolve());
    static final SimpleSymbol Lit62 = ((SimpleSymbol) new SimpleSymbol("Click").readResolve());
    static final FString Lit63 = new FString("com.google.appinventor.components.runtime.TinyWebDB");
    static final FString Lit64 = new FString("com.google.appinventor.components.runtime.TinyWebDB");
    static final SimpleSymbol Lit65 = ((SimpleSymbol) new SimpleSymbol("$tagFromWebDB").readResolve());
    static final PairWithPosition Lit66 = PairWithPosition.make(Lit89, PairWithPosition.make(Lit89, LList.Empty, "/tmp/1552236494828_0.6178377661207605-0/youngandroidproject/../src/appinventor/ai_tshetty510/Defence/Screen1.yail", 327787), "/tmp/1552236494828_0.6178377661207605-0/youngandroidproject/../src/appinventor/ai_tshetty510/Defence/Screen1.yail", 327782);
    static final SimpleSymbol Lit67 = ((SimpleSymbol) new SimpleSymbol("Elements").readResolve());
    static final SimpleSymbol Lit68 = ((SimpleSymbol) new SimpleSymbol("$valueFromWebDB").readResolve());
    static final SimpleSymbol Lit69 = ((SimpleSymbol) new SimpleSymbol("list").readResolve());
    static final SimpleSymbol Lit7;
    static final PairWithPosition Lit70 = PairWithPosition.make(Lit7, LList.Empty, "/tmp/1552236494828_0.6178377661207605-0/youngandroidproject/../src/appinventor/ai_tshetty510/Defence/Screen1.yail", 327974);
    static final PairWithPosition Lit71 = PairWithPosition.make(Lit89, PairWithPosition.make(Lit89, LList.Empty, "/tmp/1552236494828_0.6178377661207605-0/youngandroidproject/../src/appinventor/ai_tshetty510/Defence/Screen1.yail", 328095), "/tmp/1552236494828_0.6178377661207605-0/youngandroidproject/../src/appinventor/ai_tshetty510/Defence/Screen1.yail", 328090);
    static final PairWithPosition Lit72;
    static final SimpleSymbol Lit73 = ((SimpleSymbol) new SimpleSymbol("TinyWebDB1$GotValue").readResolve());
    static final SimpleSymbol Lit74 = ((SimpleSymbol) new SimpleSymbol("GotValue").readResolve());
    static final FString Lit75 = new FString("com.google.appinventor.components.runtime.Notifier");
    static final FString Lit76 = new FString("com.google.appinventor.components.runtime.Notifier");
    static final SimpleSymbol Lit77 = ((SimpleSymbol) new SimpleSymbol("android-log-form").readResolve());
    static final SimpleSymbol Lit78 = ((SimpleSymbol) new SimpleSymbol("add-to-form-environment").readResolve());
    static final SimpleSymbol Lit79 = ((SimpleSymbol) new SimpleSymbol("lookup-in-form-environment").readResolve());
    static final SimpleSymbol Lit8 = ((SimpleSymbol) new SimpleSymbol("Title").readResolve());
    static final SimpleSymbol Lit80 = ((SimpleSymbol) new SimpleSymbol("is-bound-in-form-environment").readResolve());
    static final SimpleSymbol Lit81 = ((SimpleSymbol) new SimpleSymbol("add-to-global-var-environment").readResolve());
    static final SimpleSymbol Lit82 = ((SimpleSymbol) new SimpleSymbol("add-to-events").readResolve());
    static final SimpleSymbol Lit83 = ((SimpleSymbol) new SimpleSymbol("add-to-components").readResolve());
    static final SimpleSymbol Lit84 = ((SimpleSymbol) new SimpleSymbol("add-to-global-vars").readResolve());
    static final SimpleSymbol Lit85 = ((SimpleSymbol) new SimpleSymbol("add-to-form-do-after-creation").readResolve());
    static final SimpleSymbol Lit86 = ((SimpleSymbol) new SimpleSymbol("send-error").readResolve());
    static final SimpleSymbol Lit87 = ((SimpleSymbol) new SimpleSymbol("dispatchEvent").readResolve());
    static final SimpleSymbol Lit88 = ((SimpleSymbol) new SimpleSymbol("lookup-handler").readResolve());
    static final SimpleSymbol Lit89 = ((SimpleSymbol) new SimpleSymbol("any").readResolve());
    static final SimpleSymbol Lit9 = ((SimpleSymbol) new SimpleSymbol("TinyWebDB1").readResolve());
    public static Screen1 Screen1;
    static final ModuleMethod lambda$Fn1 = null;
    static final ModuleMethod lambda$Fn10 = null;
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
    public HorizontalArrangement HorizontalArrangement1;
    public Image Image1;
    public Label Label1;
    public Notifier Notifier1;
    public PasswordTextBox PasswordTextBox1;
    public final ModuleMethod Screen1$Initialize;
    public Spinner Spinner1;
    public final ModuleMethod Spinner1$AfterSelecting;
    public TinyWebDB TinyWebDB1;
    public final ModuleMethod TinyWebDB1$GotValue;
    public final ModuleMethod add$Mnto$Mncomponents;
    public final ModuleMethod add$Mnto$Mnevents;
    public final ModuleMethod add$Mnto$Mnform$Mndo$Mnafter$Mncreation;
    public final ModuleMethod add$Mnto$Mnform$Mnenvironment;
    public final ModuleMethod add$Mnto$Mnglobal$Mnvar$Mnenvironment;
    public final ModuleMethod add$Mnto$Mnglobal$Mnvars;
    public final ModuleMethod android$Mnlog$Mnform;
    public LList components$Mnto$Mncreate;
    public final ModuleMethod dispatchEvent;
    public LList events$Mnto$Mnregister;
    public LList form$Mndo$Mnafter$Mncreation;
    public Environment form$Mnenvironment;
    public Symbol form$Mnname$Mnsymbol;
    public Environment global$Mnvar$Mnenvironment;
    public LList global$Mnvars$Mnto$Mncreate;
    public final ModuleMethod is$Mnbound$Mnin$Mnform$Mnenvironment;
    public final ModuleMethod lookup$Mnhandler;
    public final ModuleMethod lookup$Mnin$Mnform$Mnenvironment;
    public final ModuleMethod onCreate;
    public final ModuleMethod process$Mnexception;
    public Button save_button;
    public final ModuleMethod save_button$Click;
    public final ModuleMethod send$Mnerror;

    /* compiled from: Screen1.yail */
    public class frame extends ModuleBody {
        Screen1 $main = this;

        public int match1(ModuleMethod moduleMethod, Object obj, CallContext callContext) {
            switch (moduleMethod.selector) {
                case 1:
                    if (!(obj instanceof Screen1)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 2:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 4:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 6:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 11:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 12:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 13:
                    if (!(obj instanceof Screen1)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 26:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                default:
                    return super.match1(moduleMethod, obj, callContext);
            }
        }

        public int match2(ModuleMethod moduleMethod, Object obj, Object obj2, CallContext callContext) {
            switch (moduleMethod.selector) {
                case 3:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                case 4:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                case 7:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                case 8:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                case 10:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                case 15:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                case 30:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                default:
                    return super.match2(moduleMethod, obj, obj2, callContext);
            }
        }

        public int match4(ModuleMethod moduleMethod, Object obj, Object obj2, Object obj3, Object obj4, CallContext callContext) {
            switch (moduleMethod.selector) {
                case 9:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.value3 = obj3;
                    callContext.value4 = obj4;
                    callContext.proc = moduleMethod;
                    callContext.pc = 4;
                    return 0;
                case 14:
                    if (!(obj instanceof Screen1)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    if (!(obj2 instanceof Component)) {
                        return -786430;
                    }
                    callContext.value2 = obj2;
                    if (!(obj3 instanceof String)) {
                        return -786429;
                    }
                    callContext.value3 = obj3;
                    if (!(obj4 instanceof String)) {
                        return -786428;
                    }
                    callContext.value4 = obj4;
                    callContext.proc = moduleMethod;
                    callContext.pc = 4;
                    return 0;
                default:
                    return super.match4(moduleMethod, obj, obj2, obj3, obj4, callContext);
            }
        }

        public Object apply1(ModuleMethod moduleMethod, Object obj) {
            switch (moduleMethod.selector) {
                case 1:
                    try {
                        this.$main.onCreate((Bundle) obj);
                        return Values.empty;
                    } catch (ClassCastException e) {
                        throw new WrongType(e, "onCreate", 1, obj);
                    }
                case 2:
                    this.$main.androidLogForm(obj);
                    return Values.empty;
                case 4:
                    try {
                        return this.$main.lookupInFormEnvironment((Symbol) obj);
                    } catch (ClassCastException e2) {
                        throw new WrongType(e2, "lookup-in-form-environment", 1, obj);
                    }
                case 6:
                    try {
                        return this.$main.isBoundInFormEnvironment((Symbol) obj) ? Boolean.TRUE : Boolean.FALSE;
                    } catch (ClassCastException e22) {
                        throw new WrongType(e22, "is-bound-in-form-environment", 1, obj);
                    }
                case 11:
                    this.$main.addToFormDoAfterCreation(obj);
                    return Values.empty;
                case 12:
                    this.$main.sendError(obj);
                    return Values.empty;
                case 13:
                    this.$main.processException(obj);
                    return Values.empty;
                case 26:
                    return this.$main.Spinner1$AfterSelecting(obj);
                default:
                    return super.apply1(moduleMethod, obj);
            }
        }

        public Object apply4(ModuleMethod moduleMethod, Object obj, Object obj2, Object obj3, Object obj4) {
            switch (moduleMethod.selector) {
                case 9:
                    this.$main.addToComponents(obj, obj2, obj3, obj4);
                    return Values.empty;
                case 14:
                    try {
                        try {
                            try {
                                try {
                                    return this.$main.dispatchEvent((Component) obj, (String) obj2, (String) obj3, (Object[]) obj4) ? Boolean.TRUE : Boolean.FALSE;
                                } catch (ClassCastException e) {
                                    throw new WrongType(e, "dispatchEvent", 4, obj4);
                                }
                            } catch (ClassCastException e2) {
                                throw new WrongType(e2, "dispatchEvent", 3, obj3);
                            }
                        } catch (ClassCastException e22) {
                            throw new WrongType(e22, "dispatchEvent", 2, obj2);
                        }
                    } catch (ClassCastException e222) {
                        throw new WrongType(e222, "dispatchEvent", 1, obj);
                    }
                default:
                    return super.apply4(moduleMethod, obj, obj2, obj3, obj4);
            }
        }

        public Object apply2(ModuleMethod moduleMethod, Object obj, Object obj2) {
            switch (moduleMethod.selector) {
                case 3:
                    try {
                        this.$main.addToFormEnvironment((Symbol) obj, obj2);
                        return Values.empty;
                    } catch (ClassCastException e) {
                        throw new WrongType(e, "add-to-form-environment", 1, obj);
                    }
                case 4:
                    try {
                        return this.$main.lookupInFormEnvironment((Symbol) obj, obj2);
                    } catch (ClassCastException e2) {
                        throw new WrongType(e2, "lookup-in-form-environment", 1, obj);
                    }
                case 7:
                    try {
                        this.$main.addToGlobalVarEnvironment((Symbol) obj, obj2);
                        return Values.empty;
                    } catch (ClassCastException e22) {
                        throw new WrongType(e22, "add-to-global-var-environment", 1, obj);
                    }
                case 8:
                    this.$main.addToEvents(obj, obj2);
                    return Values.empty;
                case 10:
                    this.$main.addToGlobalVars(obj, obj2);
                    return Values.empty;
                case 15:
                    return this.$main.lookupHandler(obj, obj2);
                case 30:
                    return this.$main.TinyWebDB1$GotValue(obj, obj2);
                default:
                    return super.apply2(moduleMethod, obj, obj2);
            }
        }

        public Object apply0(ModuleMethod moduleMethod) {
            switch (moduleMethod.selector) {
                case 16:
                    return Screen1.lambda2();
                case 17:
                    this.$main.$define();
                    return Values.empty;
                case 18:
                    return Screen1.lambda3();
                case 19:
                    return Screen1.lambda4();
                case 20:
                    return Screen1.lambda5();
                case 21:
                    return this.$main.Screen1$Initialize();
                case 22:
                    return Screen1.lambda6();
                case 23:
                    return Screen1.lambda7();
                case 24:
                    return Screen1.lambda8();
                case 25:
                    return Screen1.lambda9();
                case 27:
                    return Screen1.lambda10();
                case 28:
                    return Screen1.lambda11();
                case 29:
                    return this.$main.save_button$Click();
                default:
                    return super.apply0(moduleMethod);
            }
        }

        public int match0(ModuleMethod moduleMethod, CallContext callContext) {
            switch (moduleMethod.selector) {
                case 16:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 17:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 18:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 19:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 20:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 21:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 22:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 23:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 24:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 25:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 27:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 28:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 29:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                default:
                    return super.match0(moduleMethod, callContext);
            }
        }
    }

    static {
        SimpleSymbol simpleSymbol = (SimpleSymbol) new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_TEXT).readResolve();
        Lit7 = simpleSymbol;
        Lit72 = PairWithPosition.make(simpleSymbol, LList.Empty, "/tmp/1552236494828_0.6178377661207605-0/youngandroidproject/../src/appinventor/ai_tshetty510/Defence/Screen1.yail", 328254);
        SimpleSymbol simpleSymbol2 = Lit69;
        simpleSymbol = (SimpleSymbol) new SimpleSymbol("number").readResolve();
        Lit21 = simpleSymbol;
        Lit53 = PairWithPosition.make(simpleSymbol2, PairWithPosition.make(simpleSymbol, LList.Empty, "/tmp/1552236494828_0.6178377661207605-0/youngandroidproject/../src/appinventor/ai_tshetty510/Defence/Screen1.yail", 299404), "/tmp/1552236494828_0.6178377661207605-0/youngandroidproject/../src/appinventor/ai_tshetty510/Defence/Screen1.yail", 299398);
    }

    public Screen1() {
        ModuleInfo.register(this);
        ModuleBody frame = new frame();
        this.onCreate = new ModuleMethod(frame, 1, "onCreate", FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.android$Mnlog$Mnform = new ModuleMethod(frame, 2, Lit77, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.add$Mnto$Mnform$Mnenvironment = new ModuleMethod(frame, 3, Lit78, 8194);
        this.lookup$Mnin$Mnform$Mnenvironment = new ModuleMethod(frame, 4, Lit79, 8193);
        this.is$Mnbound$Mnin$Mnform$Mnenvironment = new ModuleMethod(frame, 6, Lit80, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.add$Mnto$Mnglobal$Mnvar$Mnenvironment = new ModuleMethod(frame, 7, Lit81, 8194);
        this.add$Mnto$Mnevents = new ModuleMethod(frame, 8, Lit82, 8194);
        this.add$Mnto$Mncomponents = new ModuleMethod(frame, 9, Lit83, 16388);
        this.add$Mnto$Mnglobal$Mnvars = new ModuleMethod(frame, 10, Lit84, 8194);
        this.add$Mnto$Mnform$Mndo$Mnafter$Mncreation = new ModuleMethod(frame, 11, Lit85, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.send$Mnerror = new ModuleMethod(frame, 12, Lit86, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.process$Mnexception = new ModuleMethod(frame, 13, "process-exception", FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.dispatchEvent = new ModuleMethod(frame, 14, Lit87, 16388);
        this.lookup$Mnhandler = new ModuleMethod(frame, 15, Lit88, 8194);
        PropertySet moduleMethod = new ModuleMethod(frame, 16, null, 0);
        moduleMethod.setProperty("source-location", "/tmp/runtime6320751136067573141.scm:581");
        lambda$Fn1 = moduleMethod;
        this.$define = new ModuleMethod(frame, 17, "$define", 0);
        lambda$Fn2 = new ModuleMethod(frame, 18, null, 0);
        lambda$Fn3 = new ModuleMethod(frame, 19, null, 0);
        lambda$Fn4 = new ModuleMethod(frame, 20, null, 0);
        this.Screen1$Initialize = new ModuleMethod(frame, 21, Lit13, 0);
        lambda$Fn5 = new ModuleMethod(frame, 22, null, 0);
        lambda$Fn6 = new ModuleMethod(frame, 23, null, 0);
        lambda$Fn7 = new ModuleMethod(frame, 24, null, 0);
        lambda$Fn8 = new ModuleMethod(frame, 25, null, 0);
        this.Spinner1$AfterSelecting = new ModuleMethod(frame, 26, Lit43, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        lambda$Fn9 = new ModuleMethod(frame, 27, null, 0);
        lambda$Fn10 = new ModuleMethod(frame, 28, null, 0);
        this.save_button$Click = new ModuleMethod(frame, 29, Lit61, 0);
        this.TinyWebDB1$GotValue = new ModuleMethod(frame, 30, Lit73, 8194);
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
        Consumer $result = $ctx.consumer;
        Object find = require.find("com.google.youngandroid.runtime");
        try {
            String str;
            ((Runnable) find).run();
            this.$Stdebug$Mnform$St = Boolean.FALSE;
            this.form$Mnenvironment = Environment.make(misc.symbol$To$String(Lit0));
            FString stringAppend = strings.stringAppend(misc.symbol$To$String(Lit0), "-global-vars");
            if (stringAppend == null) {
                str = null;
            } else {
                str = stringAppend.toString();
            }
            this.global$Mnvar$Mnenvironment = Environment.make(str);
            Screen1 = null;
            this.form$Mnname$Mnsymbol = Lit0;
            this.events$Mnto$Mnregister = LList.Empty;
            this.components$Mnto$Mncreate = LList.Empty;
            this.global$Mnvars$Mnto$Mncreate = LList.Empty;
            this.form$Mndo$Mnafter$Mncreation = LList.Empty;
            find = require.find("com.google.youngandroid.runtime");
            try {
                ((Runnable) find).run();
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addGlobalVarToCurrentFormEnvironment(Lit3, runtime.callYailPrimitive(runtime.make$Mnyail$Mnlist, LList.Empty, LList.Empty, "make a list")), $result);
                } else {
                    addToGlobalVars(Lit3, lambda$Fn2);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addGlobalVarToCurrentFormEnvironment(Lit4, Lit5), $result);
                } else {
                    addToGlobalVars(Lit4, lambda$Fn3);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit6, "Defence", Lit7);
                    Values.writeValues(runtime.setAndCoerceProperty$Ex(Lit0, Lit8, "Screen1", Lit7), $result);
                } else {
                    addToFormDoAfterCreation(new Promise(lambda$Fn4));
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit13, this.Screen1$Initialize);
                } else {
                    addToFormEnvironment(Lit13, this.Screen1$Initialize);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Screen1", "Initialize");
                } else {
                    addToEvents(Lit0, Lit14);
                }
                this.Label1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit15, Lit16, lambda$Fn5), $result);
                } else {
                    addToComponents(Lit0, Lit27, Lit16, lambda$Fn6);
                }
                this.Image1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit28, Lit29, lambda$Fn7), $result);
                } else {
                    addToComponents(Lit0, Lit35, Lit29, lambda$Fn8);
                }
                this.HorizontalArrangement1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit36, Lit37, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit0, Lit38, Lit37, Boolean.FALSE);
                }
                this.Spinner1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit37, Lit39, Lit40, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit37, Lit41, Lit40, Boolean.FALSE);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit43, this.Spinner1$AfterSelecting);
                } else {
                    addToFormEnvironment(Lit43, this.Spinner1$AfterSelecting);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Spinner1", "AfterSelecting");
                } else {
                    addToEvents(Lit40, Lit44);
                }
                this.PasswordTextBox1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit37, Lit45, Lit46, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit37, Lit47, Lit46, Boolean.FALSE);
                }
                this.save_button = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit48, Lit49, lambda$Fn9), $result);
                } else {
                    addToComponents(Lit0, Lit51, Lit49, lambda$Fn10);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit61, this.save_button$Click);
                } else {
                    addToFormEnvironment(Lit61, this.save_button$Click);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "save_button", "Click");
                } else {
                    addToEvents(Lit49, Lit62);
                }
                this.TinyWebDB1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit63, Lit9, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit0, Lit64, Lit9, Boolean.FALSE);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit73, this.TinyWebDB1$GotValue);
                } else {
                    addToFormEnvironment(Lit73, this.TinyWebDB1$GotValue);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "TinyWebDB1", "GotValue");
                } else {
                    addToEvents(Lit9, Lit74);
                }
                this.Notifier1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit75, Lit55, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit0, Lit76, Lit55, Boolean.FALSE);
                }
                runtime.initRuntime();
            } catch (ClassCastException e) {
                throw new WrongType(e, "java.lang.Runnable.run()", 1, find);
            }
        } catch (ClassCastException e2) {
            throw new WrongType(e2, "java.lang.Runnable.run()", 1, find);
        }
    }

    static Object lambda3() {
        return runtime.callYailPrimitive(runtime.make$Mnyail$Mnlist, LList.Empty, LList.Empty, "make a list");
    }

    static IntNum lambda4() {
        return Lit5;
    }

    static Object lambda5() {
        runtime.setAndCoerceProperty$Ex(Lit0, Lit6, "Defence", Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit0, Lit8, "Screen1", Lit7);
    }

    public Object Screen1$Initialize() {
        runtime.setThisForm();
        runtime.callComponentMethod(Lit9, Lit10, LList.list1("Names"), Lit11);
        return runtime.callComponentMethod(Lit9, Lit10, LList.list1("Password"), Lit12);
    }

    static Object lambda6() {
        runtime.setAndCoerceProperty$Ex(Lit16, Lit17, Boolean.TRUE, Lit18);
        runtime.setAndCoerceProperty$Ex(Lit16, Lit19, Lit20, Lit21);
        runtime.setAndCoerceProperty$Ex(Lit16, Lit22, "DEFENCE", Lit7);
        runtime.setAndCoerceProperty$Ex(Lit16, Lit23, Lit24, Lit21);
        return runtime.setAndCoerceProperty$Ex(Lit16, Lit25, Lit26, Lit21);
    }

    static Object lambda7() {
        runtime.setAndCoerceProperty$Ex(Lit16, Lit17, Boolean.TRUE, Lit18);
        runtime.setAndCoerceProperty$Ex(Lit16, Lit19, Lit20, Lit21);
        runtime.setAndCoerceProperty$Ex(Lit16, Lit22, "DEFENCE", Lit7);
        runtime.setAndCoerceProperty$Ex(Lit16, Lit23, Lit24, Lit21);
        return runtime.setAndCoerceProperty$Ex(Lit16, Lit25, Lit26, Lit21);
    }

    static Object lambda8() {
        runtime.setAndCoerceProperty$Ex(Lit29, Lit30, Lit31, Lit21);
        runtime.setAndCoerceProperty$Ex(Lit29, Lit32, "military.JPG", Lit7);
        runtime.setAndCoerceProperty$Ex(Lit29, Lit33, Boolean.TRUE, Lit18);
        return runtime.setAndCoerceProperty$Ex(Lit29, Lit25, Lit34, Lit21);
    }

    static Object lambda9() {
        runtime.setAndCoerceProperty$Ex(Lit29, Lit30, Lit31, Lit21);
        runtime.setAndCoerceProperty$Ex(Lit29, Lit32, "military.JPG", Lit7);
        runtime.setAndCoerceProperty$Ex(Lit29, Lit33, Boolean.TRUE, Lit18);
        return runtime.setAndCoerceProperty$Ex(Lit29, Lit25, Lit34, Lit21);
    }

    public Object Spinner1$AfterSelecting(Object $selection) {
        runtime.sanitizeComponentData($selection);
        runtime.setThisForm();
        return runtime.addGlobalVarToCurrentFormEnvironment(Lit4, runtime.getProperty$1(Lit40, Lit42));
    }

    static Object lambda10() {
        runtime.setAndCoerceProperty$Ex(Lit49, Lit22, "login", Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit49, Lit25, Lit50, Lit21);
    }

    static Object lambda11() {
        runtime.setAndCoerceProperty$Ex(Lit49, Lit22, "login", Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit49, Lit25, Lit50, Lit21);
    }

    public Object save_button$Click() {
        runtime.setThisForm();
        if (runtime.callYailPrimitive(runtime.yail$Mnnot$Mnequal$Qu, LList.list2(runtime.getProperty$1(Lit46, Lit22), ""), Lit52, "=") != Boolean.FALSE) {
            runtime.addGlobalVarToCurrentFormEnvironment(Lit4, runtime.getProperty$1(Lit40, Lit42));
            if (runtime.callYailPrimitive(runtime.yail$Mnequal$Qu, LList.list2(runtime.getProperty$1(Lit46, Lit22), runtime.callYailPrimitive(runtime.yail$Mnlist$Mnget$Mnitem, LList.list2(runtime.lookupGlobalVarInCurrentFormEnvironment(Lit3, runtime.$Stthe$Mnnull$Mnvalue$St), runtime.lookupGlobalVarInCurrentFormEnvironment(Lit4, runtime.$Stthe$Mnnull$Mnvalue$St)), Lit53, "select list item")), Lit54, "=") != Boolean.FALSE) {
                runtime.callComponentMethod(Lit55, Lit56, LList.list1("Valid user"), Lit57);
                runtime.callYailPrimitive(runtime.open$Mnanother$Mnscreen, LList.list1("Screen2"), Lit58, "open another screen");
            } else {
                runtime.callComponentMethod(Lit55, Lit56, LList.list1("Password invalid"), Lit59);
            }
        }
        return runtime.callComponentMethod(Lit55, Lit56, LList.list1("Select user and enter password"), Lit60);
    }

    public Object TinyWebDB1$GotValue(Object $tagFromWebDB, Object $valueFromWebDB) {
        Object signalRuntimeError;
        $tagFromWebDB = runtime.sanitizeComponentData($tagFromWebDB);
        $valueFromWebDB = runtime.sanitizeComponentData($valueFromWebDB);
        runtime.setThisForm();
        ModuleMethod moduleMethod = runtime.yail$Mnequal$Qu;
        if ($tagFromWebDB instanceof Package) {
            signalRuntimeError = runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit65), " is not bound in the current context"), "Unbound Variable");
        } else {
            signalRuntimeError = $tagFromWebDB;
        }
        if (runtime.callYailPrimitive(moduleMethod, LList.list2(signalRuntimeError, "Names"), Lit66, "=") != Boolean.FALSE) {
            SimpleSymbol simpleSymbol = Lit40;
            SimpleSymbol simpleSymbol2 = Lit67;
            if ($valueFromWebDB instanceof Package) {
                $valueFromWebDB = runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit68), " is not bound in the current context"), "Unbound Variable");
            }
            runtime.setAndCoerceProperty$Ex(simpleSymbol, simpleSymbol2, $valueFromWebDB, Lit69);
            return runtime.callComponentMethod(Lit55, Lit56, LList.list1("Names retrived"), Lit70);
        }
        ModuleMethod moduleMethod2 = runtime.yail$Mnequal$Qu;
        if ($tagFromWebDB instanceof Package) {
            $tagFromWebDB = runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit65), " is not bound in the current context"), "Unbound Variable");
        }
        if (runtime.callYailPrimitive(moduleMethod2, LList.list2($tagFromWebDB, "Password"), Lit71, "=") == Boolean.FALSE) {
            return Values.empty;
        }
        Symbol symbol = Lit3;
        if ($valueFromWebDB instanceof Package) {
            $valueFromWebDB = runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit68), " is not bound in the current context"), "Unbound Variable");
        }
        runtime.addGlobalVarToCurrentFormEnvironment(symbol, $valueFromWebDB);
        return runtime.callComponentMethod(Lit55, Lit56, LList.list1("Password retrived"), Lit72);
    }

    public void onCreate(Bundle icicle) {
        AppInventorCompatActivity.setClassicModeFromYail(true);
        super.onCreate(icicle);
    }

    public void androidLogForm(Object message) {
    }

    public void addToFormEnvironment(Symbol name, Object object) {
        androidLogForm(Format.formatToString(0, "Adding ~A to env ~A with value ~A", name, this.form$Mnenvironment, object));
        this.form$Mnenvironment.put(name, object);
    }

    public Object lookupInFormEnvironment(Symbol name, Object default$Mnvalue) {
        boolean x = ((this.form$Mnenvironment == null ? 1 : 0) + 1) & 1;
        if (x) {
            if (!this.form$Mnenvironment.isBound(name)) {
                return default$Mnvalue;
            }
        } else if (!x) {
            return default$Mnvalue;
        }
        return this.form$Mnenvironment.get(name);
    }

    public boolean isBoundInFormEnvironment(Symbol name) {
        return this.form$Mnenvironment.isBound(name);
    }

    public void addToGlobalVarEnvironment(Symbol name, Object object) {
        androidLogForm(Format.formatToString(0, "Adding ~A to env ~A with value ~A", name, this.global$Mnvar$Mnenvironment, object));
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
        RetValManager.sendError(error == null ? null : error.toString());
    }

    public void processException(Object ex) {
        Object apply1 = Scheme.applyToArgs.apply1(GetNamedPart.getNamedPart.apply2(ex, Lit1));
        RuntimeErrorAlert.alert(this, apply1 == null ? null : apply1.toString(), ex instanceof YailRuntimeError ? ((YailRuntimeError) ex).getErrorType() : "Runtime Error", "End Application");
    }

    public boolean dispatchEvent(Component componentObject, String registeredComponentName, String eventName, Object[] args) {
        boolean x;
        SimpleSymbol registeredObject = misc.string$To$Symbol(registeredComponentName);
        if (!isBoundInFormEnvironment(registeredObject)) {
            EventDispatcher.unregisterEventForDelegation(this, registeredComponentName, eventName);
            return false;
        } else if (lookupInFormEnvironment(registeredObject) != componentObject) {
            return false;
        } else {
            try {
                Scheme.apply.apply2(lookupHandler(registeredComponentName, eventName), LList.makeList(args, 0));
                return true;
            } catch (PermissionException exception) {
                exception.printStackTrace();
                if (this == componentObject) {
                    x = true;
                } else {
                    x = false;
                }
                if (x ? IsEqual.apply(eventName, "PermissionNeeded") : x) {
                    processException(exception);
                } else {
                    PermissionDenied(componentObject, eventName, exception.getPermissionNeeded());
                }
                return false;
            } catch (Throwable exception2) {
                androidLogForm(exception2.getMessage());
                exception2.printStackTrace();
                processException(exception2);
                return false;
            }
        }
    }

    public Object lookupHandler(Object componentName, Object eventName) {
        String str = null;
        String obj = componentName == null ? null : componentName.toString();
        if (eventName != null) {
            str = eventName.toString();
        }
        return lookupInFormEnvironment(misc.string$To$Symbol(EventDispatcher.makeFullEventName(obj, str)));
    }

    public void $define() {
        Language.setDefaults(Scheme.getInstance());
        try {
            run();
        } catch (Exception exception) {
            androidLogForm(exception.getMessage());
            processException(exception);
        }
        Screen1 = this;
        addToFormEnvironment(Lit0, this);
        Object obj = this.events$Mnto$Mnregister;
        while (obj != LList.Empty) {
            try {
                Pair arg0 = (Pair) obj;
                Object event$Mninfo = arg0.getCar();
                Object apply1 = lists.car.apply1(event$Mninfo);
                String obj2 = apply1 == null ? null : apply1.toString();
                Object apply12 = lists.cdr.apply1(event$Mninfo);
                EventDispatcher.registerEventForDelegation(this, obj2, apply12 == null ? null : apply12.toString());
                obj = arg0.getCdr();
            } catch (ClassCastException e) {
                throw new WrongType(e, "arg0", -2, obj);
            }
        }
        addToGlobalVars(Lit2, lambda$Fn1);
        Screen1 closureEnv = this;
        obj = lists.reverse(this.global$Mnvars$Mnto$Mncreate);
        while (obj != LList.Empty) {
            try {
                arg0 = (Pair) obj;
                Object var$Mnval = arg0.getCar();
                Object var = lists.car.apply1(var$Mnval);
                addToGlobalVarEnvironment((Symbol) var, Scheme.applyToArgs.apply1(lists.cadr.apply1(var$Mnval)));
                obj = arg0.getCdr();
            } catch (ClassCastException e2) {
                throw new WrongType(e2, "arg0", -2, obj);
            } catch (ClassCastException e22) {
                throw new WrongType(e22, "arg0", -2, obj);
            } catch (ClassCastException e222) {
                throw new WrongType(e222, "add-to-form-environment", 0, component$Mnname);
            } catch (ClassCastException e3) {
                throw new WrongType(e3, "lookup-in-form-environment", 0, apply1);
            } catch (ClassCastException e2222) {
                throw new WrongType(e2222, "arg0", -2, obj);
            } catch (ClassCastException e22222) {
                throw new WrongType(e22222, "arg0", -2, obj);
            } catch (ClassCastException e222222) {
                throw new WrongType(e222222, "add-to-global-var-environment", 0, var);
            } catch (ClassCastException e2222222) {
                throw new WrongType(e2222222, "arg0", -2, obj);
            } catch (YailRuntimeError exception2) {
                processException(exception2);
                return;
            }
        }
        obj = lists.reverse(this.form$Mndo$Mnafter$Mncreation);
        while (obj != LList.Empty) {
            arg0 = (Pair) obj;
            misc.force(arg0.getCar());
            obj = arg0.getCdr();
        }
        LList component$Mndescriptors = lists.reverse(this.components$Mnto$Mncreate);
        closureEnv = this;
        obj = component$Mndescriptors;
        while (obj != LList.Empty) {
            arg0 = (Pair) obj;
            Object component$Mninfo = arg0.getCar();
            Object component$Mnname = lists.caddr.apply1(component$Mninfo);
            lists.cadddr.apply1(component$Mninfo);
            Object component$Mnobject = Invoke.make.apply2(lists.cadr.apply1(component$Mninfo), lookupInFormEnvironment((Symbol) lists.car.apply1(component$Mninfo)));
            SlotSet.set$Mnfield$Ex.apply3(this, component$Mnname, component$Mnobject);
            addToFormEnvironment((Symbol) component$Mnname, component$Mnobject);
            obj = arg0.getCdr();
        }
        obj = component$Mndescriptors;
        while (obj != LList.Empty) {
            arg0 = (Pair) obj;
            component$Mninfo = arg0.getCar();
            lists.caddr.apply1(component$Mninfo);
            Boolean init$Mnthunk = lists.cadddr.apply1(component$Mninfo);
            if (init$Mnthunk != Boolean.FALSE) {
                Scheme.applyToArgs.apply1(init$Mnthunk);
            }
            obj = arg0.getCdr();
        }
        obj = component$Mndescriptors;
        while (obj != LList.Empty) {
            arg0 = (Pair) obj;
            component$Mninfo = arg0.getCar();
            component$Mnname = lists.caddr.apply1(component$Mninfo);
            lists.cadddr.apply1(component$Mninfo);
            callInitialize(SlotGet.field.apply2(this, component$Mnname));
            obj = arg0.getCdr();
        }
    }

    public static SimpleSymbol lambda1symbolAppend$V(Object[] argsArray) {
        Object car;
        LList symbols = LList.makeList(argsArray, 0);
        Procedure procedure = Scheme.apply;
        ModuleMethod moduleMethod = strings.string$Mnappend;
        Pair result = LList.Empty;
        Object arg0 = symbols;
        while (arg0 != LList.Empty) {
            try {
                Pair arg02 = (Pair) arg0;
                Object arg03 = arg02.getCdr();
                car = arg02.getCar();
                try {
                    result = Pair.make(misc.symbol$To$String((Symbol) car), result);
                    arg0 = arg03;
                } catch (ClassCastException e) {
                    throw new WrongType(e, "symbol->string", 1, car);
                }
            } catch (ClassCastException e2) {
                throw new WrongType(e2, "arg0", -2, arg0);
            }
        }
        car = procedure.apply2(moduleMethod, LList.reverseInPlace(result));
        try {
            return misc.string$To$Symbol((CharSequence) car);
        } catch (ClassCastException e3) {
            throw new WrongType(e3, "string->symbol", 1, car);
        }
    }

    static Object lambda2() {
        return null;
    }
}
