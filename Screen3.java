package appinventor.ai_tshetty510.Defence;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import com.google.appinventor.components.common.PropertyTypeConstants;
import com.google.appinventor.components.runtime.AppInventorCompatActivity;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.CheckBox;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.Notifier;
import com.google.appinventor.components.runtime.TextBox;
import com.google.appinventor.components.runtime.VerticalArrangement;
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

/* compiled from: Screen3.yail */
public class Screen3 extends Form implements Runnable {
    static final SimpleSymbol Lit0 = ((SimpleSymbol) new SimpleSymbol("Screen3").readResolve());
    static final SimpleSymbol Lit1 = ((SimpleSymbol) new SimpleSymbol("getMessage").readResolve());
    static final SimpleSymbol Lit10 = ((SimpleSymbol) new SimpleSymbol("Label1").readResolve());
    static final SimpleSymbol Lit11 = ((SimpleSymbol) new SimpleSymbol("Text").readResolve());
    static final SimpleSymbol Lit12 = ((SimpleSymbol) new SimpleSymbol("TextAlignment").readResolve());
    static final IntNum Lit13 = IntNum.make(1);
    static final SimpleSymbol Lit14 = ((SimpleSymbol) new SimpleSymbol("TextColor").readResolve());
    static final IntNum Lit15;
    static final SimpleSymbol Lit16 = ((SimpleSymbol) new SimpleSymbol("Width").readResolve());
    static final IntNum Lit17 = IntNum.make(-1100);
    static final FString Lit18 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit19 = new FString("com.google.appinventor.components.runtime.TextBox");
    static final SimpleSymbol Lit2 = ((SimpleSymbol) new SimpleSymbol("*the-null-value*").readResolve());
    static final SimpleSymbol Lit20 = ((SimpleSymbol) new SimpleSymbol("TextBox1").readResolve());
    static final SimpleSymbol Lit21 = ((SimpleSymbol) new SimpleSymbol("Hint").readResolve());
    static final IntNum Lit22 = IntNum.make(-1100);
    static final FString Lit23 = new FString("com.google.appinventor.components.runtime.TextBox");
    static final FString Lit24 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit25 = ((SimpleSymbol) new SimpleSymbol("Label2").readResolve());
    static final IntNum Lit26;
    static final IntNum Lit27 = IntNum.make(-1100);
    static final FString Lit28 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit29 = new FString("com.google.appinventor.components.runtime.TextBox");
    static final SimpleSymbol Lit3 = ((SimpleSymbol) new SimpleSymbol("AppName").readResolve());
    static final SimpleSymbol Lit30 = ((SimpleSymbol) new SimpleSymbol("TextBox2").readResolve());
    static final IntNum Lit31 = IntNum.make(-1100);
    static final FString Lit32 = new FString("com.google.appinventor.components.runtime.TextBox");
    static final FString Lit33 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
    static final SimpleSymbol Lit34 = ((SimpleSymbol) new SimpleSymbol("VerticalArrangement1").readResolve());
    static final IntNum Lit35;
    static final IntNum Lit36 = IntNum.make(-1100);
    static final FString Lit37 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
    static final FString Lit38 = new FString("com.google.appinventor.components.runtime.CheckBox");
    static final SimpleSymbol Lit39 = ((SimpleSymbol) new SimpleSymbol("CheckBox1").readResolve());
    static final SimpleSymbol Lit4;
    static final IntNum Lit40;
    static final FString Lit41 = new FString("com.google.appinventor.components.runtime.CheckBox");
    static final FString Lit42 = new FString("com.google.appinventor.components.runtime.CheckBox");
    static final SimpleSymbol Lit43 = ((SimpleSymbol) new SimpleSymbol("CheckBox2").readResolve());
    static final IntNum Lit44;
    static final FString Lit45 = new FString("com.google.appinventor.components.runtime.CheckBox");
    static final FString Lit46 = new FString("com.google.appinventor.components.runtime.CheckBox");
    static final SimpleSymbol Lit47 = ((SimpleSymbol) new SimpleSymbol("CheckBox3").readResolve());
    static final IntNum Lit48;
    static final FString Lit49 = new FString("com.google.appinventor.components.runtime.CheckBox");
    static final SimpleSymbol Lit5 = ((SimpleSymbol) new SimpleSymbol("BackgroundColor").readResolve());
    static final FString Lit50 = new FString("com.google.appinventor.components.runtime.Button");
    static final SimpleSymbol Lit51 = ((SimpleSymbol) new SimpleSymbol("Button1").readResolve());
    static final IntNum Lit52;
    static final IntNum Lit53;
    static final FString Lit54 = new FString("com.google.appinventor.components.runtime.Button");
    static final SimpleSymbol Lit55 = ((SimpleSymbol) new SimpleSymbol("Checked").readResolve());
    static final PairWithPosition Lit56 = PairWithPosition.make(Lit99, PairWithPosition.make(Lit99, LList.Empty, "/tmp/1552236494828_0.6178377661207605-0/youngandroidproject/../src/appinventor/ai_tshetty510/Defence/Screen3.yail", 438392), "/tmp/1552236494828_0.6178377661207605-0/youngandroidproject/../src/appinventor/ai_tshetty510/Defence/Screen3.yail", 438387);
    static final PairWithPosition Lit57 = PairWithPosition.make(Lit99, PairWithPosition.make(Lit99, LList.Empty, "/tmp/1552236494828_0.6178377661207605-0/youngandroidproject/../src/appinventor/ai_tshetty510/Defence/Screen3.yail", 438513), "/tmp/1552236494828_0.6178377661207605-0/youngandroidproject/../src/appinventor/ai_tshetty510/Defence/Screen3.yail", 438508);
    static final PairWithPosition Lit58 = PairWithPosition.make(Lit99, PairWithPosition.make(Lit99, LList.Empty, "/tmp/1552236494828_0.6178377661207605-0/youngandroidproject/../src/appinventor/ai_tshetty510/Defence/Screen3.yail", 438621), "/tmp/1552236494828_0.6178377661207605-0/youngandroidproject/../src/appinventor/ai_tshetty510/Defence/Screen3.yail", 438616);
    static final SimpleSymbol Lit59 = ((SimpleSymbol) new SimpleSymbol("Notifier1").readResolve());
    static final IntNum Lit6;
    static final SimpleSymbol Lit60 = ((SimpleSymbol) new SimpleSymbol("ShowAlert").readResolve());
    static final PairWithPosition Lit61 = PairWithPosition.make(Lit4, LList.Empty, "/tmp/1552236494828_0.6178377661207605-0/youngandroidproject/../src/appinventor/ai_tshetty510/Defence/Screen3.yail", 438740);
    static final PairWithPosition Lit62 = PairWithPosition.make(Lit99, PairWithPosition.make(Lit99, LList.Empty, "/tmp/1552236494828_0.6178377661207605-0/youngandroidproject/../src/appinventor/ai_tshetty510/Defence/Screen3.yail", 438871), "/tmp/1552236494828_0.6178377661207605-0/youngandroidproject/../src/appinventor/ai_tshetty510/Defence/Screen3.yail", 438866);
    static final PairWithPosition Lit63 = PairWithPosition.make(Lit99, PairWithPosition.make(Lit99, LList.Empty, "/tmp/1552236494828_0.6178377661207605-0/youngandroidproject/../src/appinventor/ai_tshetty510/Defence/Screen3.yail", 438979), "/tmp/1552236494828_0.6178377661207605-0/youngandroidproject/../src/appinventor/ai_tshetty510/Defence/Screen3.yail", 438974);
    static final PairWithPosition Lit64 = PairWithPosition.make(Lit4, LList.Empty, "/tmp/1552236494828_0.6178377661207605-0/youngandroidproject/../src/appinventor/ai_tshetty510/Defence/Screen3.yail", 439112);
    static final PairWithPosition Lit65 = PairWithPosition.make(Lit99, PairWithPosition.make(Lit99, LList.Empty, "/tmp/1552236494828_0.6178377661207605-0/youngandroidproject/../src/appinventor/ai_tshetty510/Defence/Screen3.yail", 439243), "/tmp/1552236494828_0.6178377661207605-0/youngandroidproject/../src/appinventor/ai_tshetty510/Defence/Screen3.yail", 439238);
    static final PairWithPosition Lit66 = PairWithPosition.make(Lit99, PairWithPosition.make(Lit99, LList.Empty, "/tmp/1552236494828_0.6178377661207605-0/youngandroidproject/../src/appinventor/ai_tshetty510/Defence/Screen3.yail", 439351), "/tmp/1552236494828_0.6178377661207605-0/youngandroidproject/../src/appinventor/ai_tshetty510/Defence/Screen3.yail", 439346);
    static final PairWithPosition Lit67 = PairWithPosition.make(Lit4, LList.Empty, "/tmp/1552236494828_0.6178377661207605-0/youngandroidproject/../src/appinventor/ai_tshetty510/Defence/Screen3.yail", 439493);
    static final PairWithPosition Lit68 = PairWithPosition.make(Lit99, PairWithPosition.make(Lit99, LList.Empty, "/tmp/1552236494828_0.6178377661207605-0/youngandroidproject/../src/appinventor/ai_tshetty510/Defence/Screen3.yail", 439624), "/tmp/1552236494828_0.6178377661207605-0/youngandroidproject/../src/appinventor/ai_tshetty510/Defence/Screen3.yail", 439619);
    static final PairWithPosition Lit69 = PairWithPosition.make(Lit99, PairWithPosition.make(Lit99, LList.Empty, "/tmp/1552236494828_0.6178377661207605-0/youngandroidproject/../src/appinventor/ai_tshetty510/Defence/Screen3.yail", 439732), "/tmp/1552236494828_0.6178377661207605-0/youngandroidproject/../src/appinventor/ai_tshetty510/Defence/Screen3.yail", 439727);
    static final SimpleSymbol Lit7 = ((SimpleSymbol) new SimpleSymbol("number").readResolve());
    static final PairWithPosition Lit70 = PairWithPosition.make(Lit4, LList.Empty, "/tmp/1552236494828_0.6178377661207605-0/youngandroidproject/../src/appinventor/ai_tshetty510/Defence/Screen3.yail", 439869);
    static final PairWithPosition Lit71 = PairWithPosition.make(Lit99, PairWithPosition.make(Lit99, LList.Empty, "/tmp/1552236494828_0.6178377661207605-0/youngandroidproject/../src/appinventor/ai_tshetty510/Defence/Screen3.yail", 439987), "/tmp/1552236494828_0.6178377661207605-0/youngandroidproject/../src/appinventor/ai_tshetty510/Defence/Screen3.yail", 439982);
    static final PairWithPosition Lit72 = PairWithPosition.make(Lit4, LList.Empty, "/tmp/1552236494828_0.6178377661207605-0/youngandroidproject/../src/appinventor/ai_tshetty510/Defence/Screen3.yail", 440107);
    static final PairWithPosition Lit73 = PairWithPosition.make(Lit99, PairWithPosition.make(Lit99, LList.Empty, "/tmp/1552236494828_0.6178377661207605-0/youngandroidproject/../src/appinventor/ai_tshetty510/Defence/Screen3.yail", 440225), "/tmp/1552236494828_0.6178377661207605-0/youngandroidproject/../src/appinventor/ai_tshetty510/Defence/Screen3.yail", 440220);
    static final PairWithPosition Lit74 = PairWithPosition.make(Lit4, LList.Empty, "/tmp/1552236494828_0.6178377661207605-0/youngandroidproject/../src/appinventor/ai_tshetty510/Defence/Screen3.yail", 440349);
    static final PairWithPosition Lit75 = PairWithPosition.make(Lit99, PairWithPosition.make(Lit99, LList.Empty, "/tmp/1552236494828_0.6178377661207605-0/youngandroidproject/../src/appinventor/ai_tshetty510/Defence/Screen3.yail", 440467), "/tmp/1552236494828_0.6178377661207605-0/youngandroidproject/../src/appinventor/ai_tshetty510/Defence/Screen3.yail", 440462);
    static final PairWithPosition Lit76 = PairWithPosition.make(Lit4, LList.Empty, "/tmp/1552236494828_0.6178377661207605-0/youngandroidproject/../src/appinventor/ai_tshetty510/Defence/Screen3.yail", 440594);
    static final PairWithPosition Lit77 = PairWithPosition.make(Lit4, LList.Empty, "/tmp/1552236494828_0.6178377661207605-0/youngandroidproject/../src/appinventor/ai_tshetty510/Defence/Screen3.yail", 440699);
    static final SimpleSymbol Lit78 = ((SimpleSymbol) new SimpleSymbol("Button1$Click").readResolve());
    static final SimpleSymbol Lit79 = ((SimpleSymbol) new SimpleSymbol("Click").readResolve());
    static final SimpleSymbol Lit8 = ((SimpleSymbol) new SimpleSymbol("Title").readResolve());
    static final FString Lit80 = new FString("com.google.appinventor.components.runtime.Button");
    static final SimpleSymbol Lit81 = ((SimpleSymbol) new SimpleSymbol("Button2").readResolve());
    static final FString Lit82 = new FString("com.google.appinventor.components.runtime.Button");
    static final PairWithPosition Lit83;
    static final SimpleSymbol Lit84 = ((SimpleSymbol) new SimpleSymbol("Button2$Click").readResolve());
    static final FString Lit85 = new FString("com.google.appinventor.components.runtime.Notifier");
    static final FString Lit86 = new FString("com.google.appinventor.components.runtime.Notifier");
    static final SimpleSymbol Lit87 = ((SimpleSymbol) new SimpleSymbol("android-log-form").readResolve());
    static final SimpleSymbol Lit88 = ((SimpleSymbol) new SimpleSymbol("add-to-form-environment").readResolve());
    static final SimpleSymbol Lit89 = ((SimpleSymbol) new SimpleSymbol("lookup-in-form-environment").readResolve());
    static final FString Lit9 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit90 = ((SimpleSymbol) new SimpleSymbol("is-bound-in-form-environment").readResolve());
    static final SimpleSymbol Lit91 = ((SimpleSymbol) new SimpleSymbol("add-to-global-var-environment").readResolve());
    static final SimpleSymbol Lit92 = ((SimpleSymbol) new SimpleSymbol("add-to-events").readResolve());
    static final SimpleSymbol Lit93 = ((SimpleSymbol) new SimpleSymbol("add-to-components").readResolve());
    static final SimpleSymbol Lit94 = ((SimpleSymbol) new SimpleSymbol("add-to-global-vars").readResolve());
    static final SimpleSymbol Lit95 = ((SimpleSymbol) new SimpleSymbol("add-to-form-do-after-creation").readResolve());
    static final SimpleSymbol Lit96 = ((SimpleSymbol) new SimpleSymbol("send-error").readResolve());
    static final SimpleSymbol Lit97 = ((SimpleSymbol) new SimpleSymbol("dispatchEvent").readResolve());
    static final SimpleSymbol Lit98 = ((SimpleSymbol) new SimpleSymbol("lookup-handler").readResolve());
    static final SimpleSymbol Lit99 = ((SimpleSymbol) new SimpleSymbol("any").readResolve());
    public static Screen3 Screen3;
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
    static final ModuleMethod lambda$Fn19 = null;
    static final ModuleMethod lambda$Fn2 = null;
    static final ModuleMethod lambda$Fn20 = null;
    static final ModuleMethod lambda$Fn21 = null;
    static final ModuleMethod lambda$Fn22 = null;
    static final ModuleMethod lambda$Fn23 = null;
    static final ModuleMethod lambda$Fn24 = null;
    static final ModuleMethod lambda$Fn25 = null;
    static final ModuleMethod lambda$Fn26 = null;
    static final ModuleMethod lambda$Fn27 = null;
    static final ModuleMethod lambda$Fn28 = null;
    static final ModuleMethod lambda$Fn29 = null;
    static final ModuleMethod lambda$Fn3 = null;
    static final ModuleMethod lambda$Fn30 = null;
    static final ModuleMethod lambda$Fn31 = null;
    static final ModuleMethod lambda$Fn32 = null;
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
    public Button Button2;
    public final ModuleMethod Button2$Click;
    public CheckBox CheckBox1;
    public CheckBox CheckBox2;
    public CheckBox CheckBox3;
    public Label Label1;
    public Label Label2;
    public Notifier Notifier1;
    public TextBox TextBox1;
    public TextBox TextBox2;
    public VerticalArrangement VerticalArrangement1;
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
    public final ModuleMethod send$Mnerror;

    /* compiled from: Screen3.yail */
    public class frame extends ModuleBody {
        Screen3 $main = this;

        public int match1(ModuleMethod moduleMethod, Object obj, CallContext callContext) {
            switch (moduleMethod.selector) {
                case 1:
                    if (!(obj instanceof Screen3)) {
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
                    if (!(obj instanceof Screen3)) {
                        return -786431;
                    }
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
                    if (!(obj instanceof Screen3)) {
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
                default:
                    return super.apply2(moduleMethod, obj, obj2);
            }
        }

        public Object apply0(ModuleMethod moduleMethod) {
            switch (moduleMethod.selector) {
                case 16:
                    return Screen3.lambda2();
                case 17:
                    this.$main.$define();
                    return Values.empty;
                case 18:
                    return Screen3.lambda3();
                case 19:
                    return Screen3.lambda4();
                case 20:
                    return Screen3.lambda5();
                case 21:
                    return Screen3.lambda6();
                case 22:
                    return Screen3.lambda7();
                case 23:
                    return Screen3.lambda8();
                case 24:
                    return Screen3.lambda9();
                case 25:
                    return Screen3.lambda10();
                case 26:
                    return Screen3.lambda11();
                case 27:
                    return Screen3.lambda12();
                case 28:
                    return Screen3.lambda13();
                case 29:
                    return Screen3.lambda14();
                case 30:
                    return Screen3.lambda15();
                case 31:
                    return Screen3.lambda16();
                case 32:
                    return Screen3.lambda17();
                case 33:
                    return Screen3.lambda18();
                case 34:
                    return Screen3.lambda19();
                case 35:
                    return Screen3.lambda20();
                case 36:
                    return Screen3.lambda21();
                case 37:
                    return Screen3.lambda22();
                case 38:
                    return Screen3.lambda24();
                case 39:
                    return Screen3.lambda25();
                case 40:
                    return Screen3.lambda23();
                case 41:
                    return Screen3.lambda26();
                case 42:
                    return Screen3.lambda27();
                case 43:
                    return Screen3.lambda28();
                case 44:
                    return Screen3.lambda29();
                case 45:
                    return Screen3.lambda30();
                case 46:
                    return Screen3.lambda31();
                case 47:
                    return this.$main.Button1$Click();
                case 48:
                    return Screen3.lambda32();
                case 49:
                    return Screen3.lambda33();
                case 50:
                    return this.$main.Button2$Click();
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
                case 26:
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
                case 30:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 31:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 32:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 33:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 34:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 35:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 36:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 37:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 38:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 39:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 40:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 41:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 42:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 43:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 44:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 45:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 46:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 47:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 48:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 49:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 50:
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
        Lit4 = simpleSymbol;
        Lit83 = PairWithPosition.make(simpleSymbol, LList.Empty, "/tmp/1552236494828_0.6178377661207605-0/youngandroidproject/../src/appinventor/ai_tshetty510/Defence/Screen3.yail", 475214);
        int[] iArr = new int[2];
        iArr[0] = -16777216;
        Lit53 = IntNum.make(iArr);
        iArr = new int[2];
        iArr[0] = Component.COLOR_LTGRAY;
        Lit52 = IntNum.make(iArr);
        iArr = new int[2];
        iArr[0] = -1;
        Lit48 = IntNum.make(iArr);
        iArr = new int[2];
        iArr[0] = -1;
        Lit44 = IntNum.make(iArr);
        iArr = new int[2];
        iArr[0] = -1;
        Lit40 = IntNum.make(iArr);
        iArr = new int[2];
        iArr[0] = -16777216;
        Lit35 = IntNum.make(iArr);
        iArr = new int[2];
        iArr[0] = -1;
        Lit26 = IntNum.make(iArr);
        iArr = new int[2];
        iArr[0] = -1;
        Lit15 = IntNum.make(iArr);
        iArr = new int[2];
        iArr[0] = -16777216;
        Lit6 = IntNum.make(iArr);
    }

    public Screen3() {
        ModuleInfo.register(this);
        ModuleBody frame = new frame();
        this.onCreate = new ModuleMethod(frame, 1, "onCreate", FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.android$Mnlog$Mnform = new ModuleMethod(frame, 2, Lit87, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.add$Mnto$Mnform$Mnenvironment = new ModuleMethod(frame, 3, Lit88, 8194);
        this.lookup$Mnin$Mnform$Mnenvironment = new ModuleMethod(frame, 4, Lit89, 8193);
        this.is$Mnbound$Mnin$Mnform$Mnenvironment = new ModuleMethod(frame, 6, Lit90, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.add$Mnto$Mnglobal$Mnvar$Mnenvironment = new ModuleMethod(frame, 7, Lit91, 8194);
        this.add$Mnto$Mnevents = new ModuleMethod(frame, 8, Lit92, 8194);
        this.add$Mnto$Mncomponents = new ModuleMethod(frame, 9, Lit93, 16388);
        this.add$Mnto$Mnglobal$Mnvars = new ModuleMethod(frame, 10, Lit94, 8194);
        this.add$Mnto$Mnform$Mndo$Mnafter$Mncreation = new ModuleMethod(frame, 11, Lit95, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.send$Mnerror = new ModuleMethod(frame, 12, Lit96, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.process$Mnexception = new ModuleMethod(frame, 13, "process-exception", FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.dispatchEvent = new ModuleMethod(frame, 14, Lit97, 16388);
        this.lookup$Mnhandler = new ModuleMethod(frame, 15, Lit98, 8194);
        PropertySet moduleMethod = new ModuleMethod(frame, 16, null, 0);
        moduleMethod.setProperty("source-location", "/tmp/runtime6320751136067573141.scm:581");
        lambda$Fn1 = moduleMethod;
        this.$define = new ModuleMethod(frame, 17, "$define", 0);
        lambda$Fn2 = new ModuleMethod(frame, 18, null, 0);
        lambda$Fn3 = new ModuleMethod(frame, 19, null, 0);
        lambda$Fn4 = new ModuleMethod(frame, 20, null, 0);
        lambda$Fn5 = new ModuleMethod(frame, 21, null, 0);
        lambda$Fn6 = new ModuleMethod(frame, 22, null, 0);
        lambda$Fn7 = new ModuleMethod(frame, 23, null, 0);
        lambda$Fn8 = new ModuleMethod(frame, 24, null, 0);
        lambda$Fn9 = new ModuleMethod(frame, 25, null, 0);
        lambda$Fn10 = new ModuleMethod(frame, 26, null, 0);
        lambda$Fn11 = new ModuleMethod(frame, 27, null, 0);
        lambda$Fn12 = new ModuleMethod(frame, 28, null, 0);
        lambda$Fn13 = new ModuleMethod(frame, 29, null, 0);
        lambda$Fn14 = new ModuleMethod(frame, 30, null, 0);
        lambda$Fn15 = new ModuleMethod(frame, 31, null, 0);
        lambda$Fn16 = new ModuleMethod(frame, 32, null, 0);
        lambda$Fn17 = new ModuleMethod(frame, 33, null, 0);
        lambda$Fn18 = new ModuleMethod(frame, 34, null, 0);
        lambda$Fn19 = new ModuleMethod(frame, 35, null, 0);
        lambda$Fn20 = new ModuleMethod(frame, 36, null, 0);
        lambda$Fn21 = new ModuleMethod(frame, 37, null, 0);
        lambda$Fn23 = new ModuleMethod(frame, 38, null, 0);
        lambda$Fn24 = new ModuleMethod(frame, 39, null, 0);
        lambda$Fn22 = new ModuleMethod(frame, 40, null, 0);
        lambda$Fn25 = new ModuleMethod(frame, 41, null, 0);
        lambda$Fn26 = new ModuleMethod(frame, 42, null, 0);
        lambda$Fn27 = new ModuleMethod(frame, 43, null, 0);
        lambda$Fn28 = new ModuleMethod(frame, 44, null, 0);
        lambda$Fn29 = new ModuleMethod(frame, 45, null, 0);
        lambda$Fn30 = new ModuleMethod(frame, 46, null, 0);
        this.Button1$Click = new ModuleMethod(frame, 47, Lit78, 0);
        lambda$Fn31 = new ModuleMethod(frame, 48, null, 0);
        lambda$Fn32 = new ModuleMethod(frame, 49, null, 0);
        this.Button2$Click = new ModuleMethod(frame, 50, Lit84, 0);
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
        String str;
        Consumer $result = $ctx.consumer;
        runtime.$instance.run();
        this.$Stdebug$Mnform$St = Boolean.FALSE;
        this.form$Mnenvironment = Environment.make(misc.symbol$To$String(Lit0));
        FString stringAppend = strings.stringAppend(misc.symbol$To$String(Lit0), "-global-vars");
        if (stringAppend == null) {
            str = null;
        } else {
            str = stringAppend.toString();
        }
        this.global$Mnvar$Mnenvironment = Environment.make(str);
        Screen3 = null;
        this.form$Mnname$Mnsymbol = Lit0;
        this.events$Mnto$Mnregister = LList.Empty;
        this.components$Mnto$Mncreate = LList.Empty;
        this.global$Mnvars$Mnto$Mncreate = LList.Empty;
        this.form$Mndo$Mnafter$Mncreation = LList.Empty;
        runtime.$instance.run();
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            runtime.setAndCoerceProperty$Ex(Lit0, Lit3, "Defence", Lit4);
            runtime.setAndCoerceProperty$Ex(Lit0, Lit5, Lit6, Lit7);
            Values.writeValues(runtime.setAndCoerceProperty$Ex(Lit0, Lit8, "Screen3", Lit4), $result);
        } else {
            addToFormDoAfterCreation(new Promise(lambda$Fn2));
        }
        this.Label1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit9, Lit10, lambda$Fn3), $result);
        } else {
            addToComponents(Lit0, Lit18, Lit10, lambda$Fn4);
        }
        this.TextBox1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit19, Lit20, lambda$Fn5), $result);
        } else {
            addToComponents(Lit0, Lit23, Lit20, lambda$Fn6);
        }
        this.Label2 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit24, Lit25, lambda$Fn7), $result);
        } else {
            addToComponents(Lit0, Lit28, Lit25, lambda$Fn8);
        }
        this.TextBox2 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit29, Lit30, lambda$Fn9), $result);
        } else {
            addToComponents(Lit0, Lit32, Lit30, lambda$Fn10);
        }
        this.VerticalArrangement1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit33, Lit34, lambda$Fn11), $result);
        } else {
            addToComponents(Lit0, Lit37, Lit34, lambda$Fn12);
        }
        this.CheckBox1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit34, Lit38, Lit39, lambda$Fn13), $result);
        } else {
            addToComponents(Lit34, Lit41, Lit39, lambda$Fn14);
        }
        this.CheckBox2 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit34, Lit42, Lit43, lambda$Fn15), $result);
        } else {
            addToComponents(Lit34, Lit45, Lit43, lambda$Fn16);
        }
        this.CheckBox3 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit34, Lit46, Lit47, lambda$Fn17), $result);
        } else {
            addToComponents(Lit34, Lit49, Lit47, lambda$Fn18);
        }
        this.Button1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit50, Lit51, lambda$Fn19), $result);
        } else {
            addToComponents(Lit0, Lit54, Lit51, lambda$Fn20);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            runtime.addToCurrentFormEnvironment(Lit78, this.Button1$Click);
        } else {
            addToFormEnvironment(Lit78, this.Button1$Click);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Button1", "Click");
        } else {
            addToEvents(Lit51, Lit79);
        }
        this.Button2 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit80, Lit81, lambda$Fn31), $result);
        } else {
            addToComponents(Lit0, Lit82, Lit81, lambda$Fn32);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            runtime.addToCurrentFormEnvironment(Lit84, this.Button2$Click);
        } else {
            addToFormEnvironment(Lit84, this.Button2$Click);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Button2", "Click");
        } else {
            addToEvents(Lit81, Lit79);
        }
        this.Notifier1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit85, Lit59, Boolean.FALSE), $result);
        } else {
            addToComponents(Lit0, Lit86, Lit59, Boolean.FALSE);
        }
        runtime.initRuntime();
    }

    static Object lambda3() {
        runtime.setAndCoerceProperty$Ex(Lit0, Lit3, "Defence", Lit4);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit5, Lit6, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit0, Lit8, "Screen3", Lit4);
    }

    static Object lambda4() {
        runtime.setAndCoerceProperty$Ex(Lit10, Lit11, "Batch Number", Lit4);
        runtime.setAndCoerceProperty$Ex(Lit10, Lit12, Lit13, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit10, Lit14, Lit15, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit10, Lit16, Lit17, Lit7);
    }

    static Object lambda5() {
        runtime.setAndCoerceProperty$Ex(Lit10, Lit11, "Batch Number", Lit4);
        runtime.setAndCoerceProperty$Ex(Lit10, Lit12, Lit13, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit10, Lit14, Lit15, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit10, Lit16, Lit17, Lit7);
    }

    static Object lambda6() {
        runtime.setAndCoerceProperty$Ex(Lit20, Lit21, "Hint for TextBox1", Lit4);
        return runtime.setAndCoerceProperty$Ex(Lit20, Lit16, Lit22, Lit7);
    }

    static Object lambda7() {
        runtime.setAndCoerceProperty$Ex(Lit20, Lit21, "Hint for TextBox1", Lit4);
        return runtime.setAndCoerceProperty$Ex(Lit20, Lit16, Lit22, Lit7);
    }

    static Object lambda8() {
        runtime.setAndCoerceProperty$Ex(Lit25, Lit11, "Message", Lit4);
        runtime.setAndCoerceProperty$Ex(Lit25, Lit12, Lit13, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit25, Lit14, Lit26, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit25, Lit16, Lit27, Lit7);
    }

    static Object lambda9() {
        runtime.setAndCoerceProperty$Ex(Lit25, Lit11, "Message", Lit4);
        runtime.setAndCoerceProperty$Ex(Lit25, Lit12, Lit13, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit25, Lit14, Lit26, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit25, Lit16, Lit27, Lit7);
    }

    static Object lambda10() {
        runtime.setAndCoerceProperty$Ex(Lit30, Lit21, "Hint for TextBox2", Lit4);
        return runtime.setAndCoerceProperty$Ex(Lit30, Lit16, Lit31, Lit7);
    }

    static Object lambda11() {
        runtime.setAndCoerceProperty$Ex(Lit30, Lit21, "Hint for TextBox2", Lit4);
        return runtime.setAndCoerceProperty$Ex(Lit30, Lit16, Lit31, Lit7);
    }

    static Object lambda12() {
        runtime.setAndCoerceProperty$Ex(Lit34, Lit5, Lit35, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit34, Lit16, Lit36, Lit7);
    }

    static Object lambda13() {
        runtime.setAndCoerceProperty$Ex(Lit34, Lit5, Lit35, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit34, Lit16, Lit36, Lit7);
    }

    static Object lambda14() {
        runtime.setAndCoerceProperty$Ex(Lit39, Lit11, "NAVY", Lit4);
        return runtime.setAndCoerceProperty$Ex(Lit39, Lit14, Lit40, Lit7);
    }

    static Object lambda15() {
        runtime.setAndCoerceProperty$Ex(Lit39, Lit11, "NAVY", Lit4);
        return runtime.setAndCoerceProperty$Ex(Lit39, Lit14, Lit40, Lit7);
    }

    static Object lambda16() {
        runtime.setAndCoerceProperty$Ex(Lit43, Lit11, "AIRFORCE", Lit4);
        return runtime.setAndCoerceProperty$Ex(Lit43, Lit14, Lit44, Lit7);
    }

    static Object lambda17() {
        runtime.setAndCoerceProperty$Ex(Lit43, Lit11, "AIRFORCE", Lit4);
        return runtime.setAndCoerceProperty$Ex(Lit43, Lit14, Lit44, Lit7);
    }

    static Object lambda18() {
        runtime.setAndCoerceProperty$Ex(Lit47, Lit11, "INTELLIGENCE", Lit4);
        return runtime.setAndCoerceProperty$Ex(Lit47, Lit14, Lit48, Lit7);
    }

    static Object lambda19() {
        runtime.setAndCoerceProperty$Ex(Lit47, Lit11, "INTELLIGENCE", Lit4);
        return runtime.setAndCoerceProperty$Ex(Lit47, Lit14, Lit48, Lit7);
    }

    static Object lambda20() {
        runtime.setAndCoerceProperty$Ex(Lit51, Lit5, Lit52, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit51, Lit11, "Send", Lit4);
        return runtime.setAndCoerceProperty$Ex(Lit51, Lit14, Lit53, Lit7);
    }

    static Object lambda21() {
        runtime.setAndCoerceProperty$Ex(Lit51, Lit5, Lit52, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit51, Lit11, "Send", Lit4);
        return runtime.setAndCoerceProperty$Ex(Lit51, Lit14, Lit53, Lit7);
    }

    public Object Button1$Click() {
        runtime.setThisForm();
        if (runtime.processAndDelayed$V(new Object[]{lambda$Fn21, lambda$Fn22}) != Boolean.FALSE) {
            return runtime.callComponentMethod(Lit59, Lit60, LList.list1("Message has been send to all"), Lit61);
        }
        if (runtime.processAndDelayed$V(new Object[]{lambda$Fn25, lambda$Fn26}) != Boolean.FALSE) {
            return runtime.callComponentMethod(Lit59, Lit60, LList.list1("Message has been send to Navy and air force"), Lit64);
        }
        if (runtime.processAndDelayed$V(new Object[]{lambda$Fn27, lambda$Fn28}) != Boolean.FALSE) {
            return runtime.callComponentMethod(Lit59, Lit60, LList.list1("Message has been send to  air force and intelligence"), Lit67);
        }
        if (runtime.processAndDelayed$V(new Object[]{lambda$Fn29, lambda$Fn30}) != Boolean.FALSE) {
            return runtime.callComponentMethod(Lit59, Lit60, LList.list1("Message has been send to  navy and intelligence"), Lit70);
        }
        if (runtime.callYailPrimitive(runtime.yail$Mnequal$Qu, LList.list2(runtime.get$Mnproperty.apply2(Lit39, Lit55), Boolean.TRUE), Lit71, "=") != Boolean.FALSE) {
            return runtime.callComponentMethod(Lit59, Lit60, LList.list1("Message has been send to  navy "), Lit72);
        }
        if (runtime.callYailPrimitive(runtime.yail$Mnequal$Qu, LList.list2(runtime.get$Mnproperty.apply2(Lit43, Lit55), Boolean.TRUE), Lit73, "=") != Boolean.FALSE) {
            return runtime.callComponentMethod(Lit59, Lit60, LList.list1("Message has been send to  air force"), Lit74);
        }
        return runtime.callYailPrimitive(runtime.yail$Mnequal$Qu, LList.list2(runtime.get$Mnproperty.apply2(Lit47, Lit55), Boolean.TRUE), Lit75, "=") != Boolean.FALSE ? runtime.callComponentMethod(Lit59, Lit60, LList.list1("Message has been send to  intelligence"), Lit76) : runtime.callComponentMethod(Lit59, Lit60, LList.list1("Select the option"), Lit77);
    }

    static Object lambda22() {
        return runtime.callYailPrimitive(runtime.yail$Mnequal$Qu, LList.list2(runtime.get$Mnproperty.apply2(Lit39, Lit55), Boolean.TRUE), Lit56, "=");
    }

    static Object lambda23() {
        return runtime.processAndDelayed$V(new Object[]{lambda$Fn23, lambda$Fn24});
    }

    static Object lambda24() {
        return runtime.callYailPrimitive(runtime.yail$Mnequal$Qu, LList.list2(runtime.get$Mnproperty.apply2(Lit43, Lit55), Boolean.TRUE), Lit57, "=");
    }

    static Object lambda25() {
        return runtime.callYailPrimitive(runtime.yail$Mnequal$Qu, LList.list2(runtime.get$Mnproperty.apply2(Lit47, Lit55), Boolean.TRUE), Lit58, "=");
    }

    static Object lambda26() {
        return runtime.callYailPrimitive(runtime.yail$Mnequal$Qu, LList.list2(runtime.get$Mnproperty.apply2(Lit39, Lit55), Boolean.TRUE), Lit62, "=");
    }

    static Object lambda27() {
        return runtime.callYailPrimitive(runtime.yail$Mnequal$Qu, LList.list2(runtime.get$Mnproperty.apply2(Lit43, Lit55), Boolean.TRUE), Lit63, "=");
    }

    static Object lambda28() {
        return runtime.callYailPrimitive(runtime.yail$Mnequal$Qu, LList.list2(runtime.get$Mnproperty.apply2(Lit43, Lit55), Boolean.TRUE), Lit65, "=");
    }

    static Object lambda29() {
        return runtime.callYailPrimitive(runtime.yail$Mnequal$Qu, LList.list2(runtime.get$Mnproperty.apply2(Lit47, Lit55), Boolean.TRUE), Lit66, "=");
    }

    static Object lambda30() {
        return runtime.callYailPrimitive(runtime.yail$Mnequal$Qu, LList.list2(runtime.get$Mnproperty.apply2(Lit39, Lit55), Boolean.TRUE), Lit68, "=");
    }

    static Object lambda31() {
        return runtime.callYailPrimitive(runtime.yail$Mnequal$Qu, LList.list2(runtime.get$Mnproperty.apply2(Lit47, Lit55), Boolean.TRUE), Lit69, "=");
    }

    static Object lambda32() {
        return runtime.setAndCoerceProperty$Ex(Lit81, Lit11, "Back", Lit4);
    }

    static Object lambda33() {
        return runtime.setAndCoerceProperty$Ex(Lit81, Lit11, "Back", Lit4);
    }

    public Object Button2$Click() {
        runtime.setThisForm();
        return runtime.callYailPrimitive(runtime.open$Mnanother$Mnscreen, LList.list1("Screen2"), Lit83, "open another screen");
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
        Screen3 = this;
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
        Screen3 closureEnv = this;
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
