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
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.LocationSensor;
import com.google.appinventor.components.runtime.errors.PermissionException;
import com.google.appinventor.components.runtime.errors.YailRuntimeError;
import com.google.appinventor.components.runtime.util.RetValManager;
import com.google.appinventor.components.runtime.util.RuntimeErrorAlert;
import com.google.youngandroid.runtime;
import gnu.expr.Language;
import gnu.expr.ModuleBody;
import gnu.expr.ModuleInfo;
import gnu.expr.ModuleMethod;
import gnu.kawa.functions.AddOp;
import gnu.kawa.functions.Format;
import gnu.kawa.functions.GetNamedPart;
import gnu.kawa.functions.IsEqual;
import gnu.kawa.functions.NumberCompare;
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
import gnu.math.DFloNum;
import gnu.math.IntNum;
import kawa.lang.Promise;
import kawa.lib.lists;
import kawa.lib.misc;
import kawa.lib.numbers;
import kawa.lib.strings;
import kawa.standard.Scheme;

/* compiled from: LOCTION_SENSOR.yail */
public class LOCTION_SENSOR extends Form implements Runnable {
    public static LOCTION_SENSOR LOCTION_SENSOR;
    static final SimpleSymbol Lit0 = ((SimpleSymbol) new SimpleSymbol("LOCTION_SENSOR").readResolve());
    static final SimpleSymbol Lit1 = ((SimpleSymbol) new SimpleSymbol("getMessage").readResolve());
    static final SimpleSymbol Lit10 = ((SimpleSymbol) new SimpleSymbol("Label1").readResolve());
    static final SimpleSymbol Lit11 = ((SimpleSymbol) new SimpleSymbol("Text").readResolve());
    static final FString Lit12 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit13 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit14 = ((SimpleSymbol) new SimpleSymbol("Label2").readResolve());
    static final FString Lit15 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit16 = new FString("com.google.appinventor.components.runtime.Button");
    static final SimpleSymbol Lit17 = ((SimpleSymbol) new SimpleSymbol("save_button").readResolve());
    static final FString Lit18 = new FString("com.google.appinventor.components.runtime.Button");
    static final SimpleSymbol Lit19 = ((SimpleSymbol) new SimpleSymbol("LocationSensor1").readResolve());
    static final SimpleSymbol Lit2 = ((SimpleSymbol) new SimpleSymbol("*the-null-value*").readResolve());
    static final SimpleSymbol Lit20 = ((SimpleSymbol) new SimpleSymbol("Latitude").readResolve());
    static final SimpleSymbol Lit21 = ((SimpleSymbol) new SimpleSymbol("Longitude").readResolve());
    static final SimpleSymbol Lit22 = ((SimpleSymbol) new SimpleSymbol("save_button$Click").readResolve());
    static final SimpleSymbol Lit23 = ((SimpleSymbol) new SimpleSymbol("Click").readResolve());
    static final FString Lit24 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit25 = ((SimpleSymbol) new SimpleSymbol("hotcoldlabel").readResolve());
    static final FString Lit26 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit27 = new FString("com.google.appinventor.components.runtime.LocationSensor");
    static final FString Lit28 = new FString("com.google.appinventor.components.runtime.LocationSensor");
    static final SimpleSymbol Lit29 = ((SimpleSymbol) new SimpleSymbol("$latitude").readResolve());
    static final SimpleSymbol Lit3 = ((SimpleSymbol) new SimpleSymbol("g$savedlatitude").readResolve());
    static final SimpleSymbol Lit30 = ((SimpleSymbol) new SimpleSymbol("$longitude").readResolve());
    static final PairWithPosition Lit31 = PairWithPosition.make(Lit61, PairWithPosition.make(Lit61, LList.Empty, "/tmp/1552236494828_0.6178377661207605-0/youngandroidproject/../src/appinventor/ai_tshetty510/Defence/LOCTION_SENSOR.yail", 213352), "/tmp/1552236494828_0.6178377661207605-0/youngandroidproject/../src/appinventor/ai_tshetty510/Defence/LOCTION_SENSOR.yail", 213344);
    static final PairWithPosition Lit32 = PairWithPosition.make(Lit61, LList.Empty, "/tmp/1552236494828_0.6178377661207605-0/youngandroidproject/../src/appinventor/ai_tshetty510/Defence/LOCTION_SENSOR.yail", 213367);
    static final DFloNum Lit33 = DFloNum.make(1.0E-4d);
    static final PairWithPosition Lit34 = PairWithPosition.make(Lit61, PairWithPosition.make(Lit61, LList.Empty, "/tmp/1552236494828_0.6178377661207605-0/youngandroidproject/../src/appinventor/ai_tshetty510/Defence/LOCTION_SENSOR.yail", 213400), "/tmp/1552236494828_0.6178377661207605-0/youngandroidproject/../src/appinventor/ai_tshetty510/Defence/LOCTION_SENSOR.yail", 213392);
    static final PairWithPosition Lit35 = PairWithPosition.make(Lit61, PairWithPosition.make(Lit61, LList.Empty, "/tmp/1552236494828_0.6178377661207605-0/youngandroidproject/../src/appinventor/ai_tshetty510/Defence/LOCTION_SENSOR.yail", 213607), "/tmp/1552236494828_0.6178377661207605-0/youngandroidproject/../src/appinventor/ai_tshetty510/Defence/LOCTION_SENSOR.yail", 213599);
    static final PairWithPosition Lit36 = PairWithPosition.make(Lit61, LList.Empty, "/tmp/1552236494828_0.6178377661207605-0/youngandroidproject/../src/appinventor/ai_tshetty510/Defence/LOCTION_SENSOR.yail", 213622);
    static final DFloNum Lit37 = DFloNum.make(1.0E-4d);
    static final PairWithPosition Lit38 = PairWithPosition.make(Lit61, PairWithPosition.make(Lit61, LList.Empty, "/tmp/1552236494828_0.6178377661207605-0/youngandroidproject/../src/appinventor/ai_tshetty510/Defence/LOCTION_SENSOR.yail", 213655), "/tmp/1552236494828_0.6178377661207605-0/youngandroidproject/../src/appinventor/ai_tshetty510/Defence/LOCTION_SENSOR.yail", 213647);
    static final PairWithPosition Lit39 = PairWithPosition.make(Lit61, PairWithPosition.make(Lit61, LList.Empty, "/tmp/1552236494828_0.6178377661207605-0/youngandroidproject/../src/appinventor/ai_tshetty510/Defence/LOCTION_SENSOR.yail", 213955), "/tmp/1552236494828_0.6178377661207605-0/youngandroidproject/../src/appinventor/ai_tshetty510/Defence/LOCTION_SENSOR.yail", 213947);
    static final IntNum Lit4 = IntNum.make(0);
    static final PairWithPosition Lit40 = PairWithPosition.make(Lit61, LList.Empty, "/tmp/1552236494828_0.6178377661207605-0/youngandroidproject/../src/appinventor/ai_tshetty510/Defence/LOCTION_SENSOR.yail", 213970);
    static final DFloNum Lit41 = DFloNum.make(3.0E-4d);
    static final PairWithPosition Lit42 = PairWithPosition.make(Lit61, PairWithPosition.make(Lit61, LList.Empty, "/tmp/1552236494828_0.6178377661207605-0/youngandroidproject/../src/appinventor/ai_tshetty510/Defence/LOCTION_SENSOR.yail", 214003), "/tmp/1552236494828_0.6178377661207605-0/youngandroidproject/../src/appinventor/ai_tshetty510/Defence/LOCTION_SENSOR.yail", 213995);
    static final PairWithPosition Lit43 = PairWithPosition.make(Lit61, PairWithPosition.make(Lit61, LList.Empty, "/tmp/1552236494828_0.6178377661207605-0/youngandroidproject/../src/appinventor/ai_tshetty510/Defence/LOCTION_SENSOR.yail", 214210), "/tmp/1552236494828_0.6178377661207605-0/youngandroidproject/../src/appinventor/ai_tshetty510/Defence/LOCTION_SENSOR.yail", 214202);
    static final PairWithPosition Lit44 = PairWithPosition.make(Lit61, LList.Empty, "/tmp/1552236494828_0.6178377661207605-0/youngandroidproject/../src/appinventor/ai_tshetty510/Defence/LOCTION_SENSOR.yail", 214225);
    static final DFloNum Lit45 = DFloNum.make(3.0E-4d);
    static final PairWithPosition Lit46 = PairWithPosition.make(Lit61, PairWithPosition.make(Lit61, LList.Empty, "/tmp/1552236494828_0.6178377661207605-0/youngandroidproject/../src/appinventor/ai_tshetty510/Defence/LOCTION_SENSOR.yail", 214258), "/tmp/1552236494828_0.6178377661207605-0/youngandroidproject/../src/appinventor/ai_tshetty510/Defence/LOCTION_SENSOR.yail", 214250);
    static final SimpleSymbol Lit47 = ((SimpleSymbol) new SimpleSymbol("LocationSensor1$LocationChanged").readResolve());
    static final SimpleSymbol Lit48 = ((SimpleSymbol) new SimpleSymbol("LocationChanged").readResolve());
    static final SimpleSymbol Lit49 = ((SimpleSymbol) new SimpleSymbol("android-log-form").readResolve());
    static final SimpleSymbol Lit5 = ((SimpleSymbol) new SimpleSymbol("g$savedlongitude").readResolve());
    static final SimpleSymbol Lit50 = ((SimpleSymbol) new SimpleSymbol("add-to-form-environment").readResolve());
    static final SimpleSymbol Lit51 = ((SimpleSymbol) new SimpleSymbol("lookup-in-form-environment").readResolve());
    static final SimpleSymbol Lit52 = ((SimpleSymbol) new SimpleSymbol("is-bound-in-form-environment").readResolve());
    static final SimpleSymbol Lit53 = ((SimpleSymbol) new SimpleSymbol("add-to-global-var-environment").readResolve());
    static final SimpleSymbol Lit54 = ((SimpleSymbol) new SimpleSymbol("add-to-events").readResolve());
    static final SimpleSymbol Lit55 = ((SimpleSymbol) new SimpleSymbol("add-to-components").readResolve());
    static final SimpleSymbol Lit56 = ((SimpleSymbol) new SimpleSymbol("add-to-global-vars").readResolve());
    static final SimpleSymbol Lit57 = ((SimpleSymbol) new SimpleSymbol("add-to-form-do-after-creation").readResolve());
    static final SimpleSymbol Lit58 = ((SimpleSymbol) new SimpleSymbol("send-error").readResolve());
    static final SimpleSymbol Lit59 = ((SimpleSymbol) new SimpleSymbol("dispatchEvent").readResolve());
    static final SimpleSymbol Lit6 = ((SimpleSymbol) new SimpleSymbol("AppName").readResolve());
    static final SimpleSymbol Lit60 = ((SimpleSymbol) new SimpleSymbol("lookup-handler").readResolve());
    static final SimpleSymbol Lit61 = ((SimpleSymbol) new SimpleSymbol("number").readResolve());
    static final SimpleSymbol Lit7 = ((SimpleSymbol) new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_TEXT).readResolve());
    static final SimpleSymbol Lit8 = ((SimpleSymbol) new SimpleSymbol("Title").readResolve());
    static final FString Lit9 = new FString("com.google.appinventor.components.runtime.Label");
    static final ModuleMethod lambda$Fn1 = null;
    static final ModuleMethod lambda$Fn10 = null;
    static final ModuleMethod lambda$Fn11 = null;
    static final ModuleMethod lambda$Fn12 = null;
    static final ModuleMethod lambda$Fn14 = null;
    static final ModuleMethod lambda$Fn16 = null;
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
    public Label Label1;
    public Label Label2;
    public LocationSensor LocationSensor1;
    public final ModuleMethod LocationSensor1$LocationChanged;
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
    public Label hotcoldlabel;
    public final ModuleMethod is$Mnbound$Mnin$Mnform$Mnenvironment;
    public final ModuleMethod lookup$Mnhandler;
    public final ModuleMethod lookup$Mnin$Mnform$Mnenvironment;
    public final ModuleMethod onCreate;
    public final ModuleMethod process$Mnexception;
    public Button save_button;
    public final ModuleMethod save_button$Click;
    public final ModuleMethod send$Mnerror;

    /* compiled from: LOCTION_SENSOR.yail */
    public class frame0 extends ModuleBody {
        Object $latitude;
        final ModuleMethod lambda$Fn13 = new ModuleMethod(this, 1, null, 0);
        final ModuleMethod lambda$Fn15 = new ModuleMethod(this, 2, null, 0);

        public Object apply0(ModuleMethod moduleMethod) {
            switch (moduleMethod.selector) {
                case 1:
                    return lambda14();
                case 2:
                    return lambda16();
                default:
                    return super.apply0(moduleMethod);
            }
        }

        public int match0(ModuleMethod moduleMethod, CallContext callContext) {
            switch (moduleMethod.selector) {
                case 1:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 2:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                default:
                    return super.match0(moduleMethod, callContext);
            }
        }

        static Object lambda15() {
            return runtime.callYailPrimitive(Scheme.numLss, LList.list2(runtime.callYailPrimitive(numbers.abs, LList.list1(runtime.callYailPrimitive(AddOp.$Mn, LList.list2(runtime.lookupGlobalVarInCurrentFormEnvironment(LOCTION_SENSOR.Lit3, runtime.$Stthe$Mnnull$Mnvalue$St), runtime.lookupGlobalVarInCurrentFormEnvironment(LOCTION_SENSOR.Lit5, runtime.$Stthe$Mnnull$Mnvalue$St)), LOCTION_SENSOR.Lit35, "-")), LOCTION_SENSOR.Lit36, "abs"), LOCTION_SENSOR.Lit37), LOCTION_SENSOR.Lit38, "<");
        }

        static Object lambda17() {
            return runtime.callYailPrimitive(Scheme.numLss, LList.list2(runtime.callYailPrimitive(numbers.abs, LList.list1(runtime.callYailPrimitive(AddOp.$Mn, LList.list2(runtime.lookupGlobalVarInCurrentFormEnvironment(LOCTION_SENSOR.Lit3, runtime.$Stthe$Mnnull$Mnvalue$St), runtime.lookupGlobalVarInCurrentFormEnvironment(LOCTION_SENSOR.Lit5, runtime.$Stthe$Mnnull$Mnvalue$St)), LOCTION_SENSOR.Lit43, "-")), LOCTION_SENSOR.Lit44, "abs"), LOCTION_SENSOR.Lit45), LOCTION_SENSOR.Lit46, "<");
        }

        Object lambda14() {
            Object signalRuntimeError;
            NumberCompare numberCompare = Scheme.numLss;
            ModuleMethod moduleMethod = numbers.abs;
            AddOp addOp = AddOp.$Mn;
            if (this.$latitude instanceof Package) {
                signalRuntimeError = runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(LOCTION_SENSOR.Lit29), " is not bound in the current context"), "Unbound Variable");
            } else {
                signalRuntimeError = this.$latitude;
            }
            return runtime.callYailPrimitive(numberCompare, LList.list2(runtime.callYailPrimitive(moduleMethod, LList.list1(runtime.callYailPrimitive(addOp, LList.list2(signalRuntimeError, runtime.lookupGlobalVarInCurrentFormEnvironment(LOCTION_SENSOR.Lit3, runtime.$Stthe$Mnnull$Mnvalue$St)), LOCTION_SENSOR.Lit31, "-")), LOCTION_SENSOR.Lit32, "abs"), LOCTION_SENSOR.Lit33), LOCTION_SENSOR.Lit34, "<");
        }

        Object lambda16() {
            Object signalRuntimeError;
            NumberCompare numberCompare = Scheme.numLss;
            ModuleMethod moduleMethod = numbers.abs;
            AddOp addOp = AddOp.$Mn;
            if (this.$latitude instanceof Package) {
                signalRuntimeError = runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(LOCTION_SENSOR.Lit29), " is not bound in the current context"), "Unbound Variable");
            } else {
                signalRuntimeError = this.$latitude;
            }
            return runtime.callYailPrimitive(numberCompare, LList.list2(runtime.callYailPrimitive(moduleMethod, LList.list1(runtime.callYailPrimitive(addOp, LList.list2(signalRuntimeError, runtime.lookupGlobalVarInCurrentFormEnvironment(LOCTION_SENSOR.Lit3, runtime.$Stthe$Mnnull$Mnvalue$St)), LOCTION_SENSOR.Lit39, "-")), LOCTION_SENSOR.Lit40, "abs"), LOCTION_SENSOR.Lit41), LOCTION_SENSOR.Lit42, "<");
        }
    }

    /* compiled from: LOCTION_SENSOR.yail */
    public class frame extends ModuleBody {
        LOCTION_SENSOR $main = this;

        public int match1(ModuleMethod moduleMethod, Object obj, CallContext callContext) {
            switch (moduleMethod.selector) {
                case 3:
                    if (!(obj instanceof LOCTION_SENSOR)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 4:
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
                case 8:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 13:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 14:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 15:
                    if (!(obj instanceof LOCTION_SENSOR)) {
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
                case 5:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                case 6:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                case 9:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
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
                case 12:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                case 17:
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
                case 11:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.value3 = obj3;
                    callContext.value4 = obj4;
                    callContext.proc = moduleMethod;
                    callContext.pc = 4;
                    return 0;
                case 16:
                    if (!(obj instanceof LOCTION_SENSOR)) {
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
                case 34:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.value3 = obj3;
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
                case 3:
                    try {
                        this.$main.onCreate((Bundle) obj);
                        return Values.empty;
                    } catch (ClassCastException e) {
                        throw new WrongType(e, "onCreate", 1, obj);
                    }
                case 4:
                    this.$main.androidLogForm(obj);
                    return Values.empty;
                case 6:
                    try {
                        return this.$main.lookupInFormEnvironment((Symbol) obj);
                    } catch (ClassCastException e2) {
                        throw new WrongType(e2, "lookup-in-form-environment", 1, obj);
                    }
                case 8:
                    try {
                        return this.$main.isBoundInFormEnvironment((Symbol) obj) ? Boolean.TRUE : Boolean.FALSE;
                    } catch (ClassCastException e22) {
                        throw new WrongType(e22, "is-bound-in-form-environment", 1, obj);
                    }
                case 13:
                    this.$main.addToFormDoAfterCreation(obj);
                    return Values.empty;
                case 14:
                    this.$main.sendError(obj);
                    return Values.empty;
                case 15:
                    this.$main.processException(obj);
                    return Values.empty;
                default:
                    return super.apply1(moduleMethod, obj);
            }
        }

        public Object apply4(ModuleMethod moduleMethod, Object obj, Object obj2, Object obj3, Object obj4) {
            switch (moduleMethod.selector) {
                case 11:
                    this.$main.addToComponents(obj, obj2, obj3, obj4);
                    return Values.empty;
                case 16:
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
                case 34:
                    return this.$main.LocationSensor1$LocationChanged(obj, obj2, obj3, obj4);
                default:
                    return super.apply4(moduleMethod, obj, obj2, obj3, obj4);
            }
        }

        public Object apply2(ModuleMethod moduleMethod, Object obj, Object obj2) {
            switch (moduleMethod.selector) {
                case 5:
                    try {
                        this.$main.addToFormEnvironment((Symbol) obj, obj2);
                        return Values.empty;
                    } catch (ClassCastException e) {
                        throw new WrongType(e, "add-to-form-environment", 1, obj);
                    }
                case 6:
                    try {
                        return this.$main.lookupInFormEnvironment((Symbol) obj, obj2);
                    } catch (ClassCastException e2) {
                        throw new WrongType(e2, "lookup-in-form-environment", 1, obj);
                    }
                case 9:
                    try {
                        this.$main.addToGlobalVarEnvironment((Symbol) obj, obj2);
                        return Values.empty;
                    } catch (ClassCastException e22) {
                        throw new WrongType(e22, "add-to-global-var-environment", 1, obj);
                    }
                case 10:
                    this.$main.addToEvents(obj, obj2);
                    return Values.empty;
                case 12:
                    this.$main.addToGlobalVars(obj, obj2);
                    return Values.empty;
                case 17:
                    return this.$main.lookupHandler(obj, obj2);
                default:
                    return super.apply2(moduleMethod, obj, obj2);
            }
        }

        public Object apply0(ModuleMethod moduleMethod) {
            switch (moduleMethod.selector) {
                case 18:
                    return LOCTION_SENSOR.lambda2();
                case 19:
                    this.$main.$define();
                    return Values.empty;
                case 20:
                    return LOCTION_SENSOR.lambda3();
                case 21:
                    return LOCTION_SENSOR.lambda4();
                case 22:
                    return LOCTION_SENSOR.lambda5();
                case 23:
                    return LOCTION_SENSOR.lambda6();
                case 24:
                    return LOCTION_SENSOR.lambda7();
                case 25:
                    return LOCTION_SENSOR.lambda8();
                case 26:
                    return LOCTION_SENSOR.lambda9();
                case 27:
                    return LOCTION_SENSOR.lambda10();
                case 28:
                    return LOCTION_SENSOR.lambda11();
                case 29:
                    return this.$main.save_button$Click();
                case 30:
                    return LOCTION_SENSOR.lambda12();
                case 31:
                    return LOCTION_SENSOR.lambda13();
                case 32:
                    return frame0.lambda15();
                case 33:
                    return frame0.lambda17();
                default:
                    return super.apply0(moduleMethod);
            }
        }

        public int match0(ModuleMethod moduleMethod, CallContext callContext) {
            switch (moduleMethod.selector) {
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
                default:
                    return super.match0(moduleMethod, callContext);
            }
        }
    }

    public LOCTION_SENSOR() {
        ModuleInfo.register(this);
        ModuleBody frame = new frame();
        this.onCreate = new ModuleMethod(frame, 3, "onCreate", FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.android$Mnlog$Mnform = new ModuleMethod(frame, 4, Lit49, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.add$Mnto$Mnform$Mnenvironment = new ModuleMethod(frame, 5, Lit50, 8194);
        this.lookup$Mnin$Mnform$Mnenvironment = new ModuleMethod(frame, 6, Lit51, 8193);
        this.is$Mnbound$Mnin$Mnform$Mnenvironment = new ModuleMethod(frame, 8, Lit52, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.add$Mnto$Mnglobal$Mnvar$Mnenvironment = new ModuleMethod(frame, 9, Lit53, 8194);
        this.add$Mnto$Mnevents = new ModuleMethod(frame, 10, Lit54, 8194);
        this.add$Mnto$Mncomponents = new ModuleMethod(frame, 11, Lit55, 16388);
        this.add$Mnto$Mnglobal$Mnvars = new ModuleMethod(frame, 12, Lit56, 8194);
        this.add$Mnto$Mnform$Mndo$Mnafter$Mncreation = new ModuleMethod(frame, 13, Lit57, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.send$Mnerror = new ModuleMethod(frame, 14, Lit58, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.process$Mnexception = new ModuleMethod(frame, 15, "process-exception", FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.dispatchEvent = new ModuleMethod(frame, 16, Lit59, 16388);
        this.lookup$Mnhandler = new ModuleMethod(frame, 17, Lit60, 8194);
        PropertySet moduleMethod = new ModuleMethod(frame, 18, null, 0);
        moduleMethod.setProperty("source-location", "/tmp/runtime6320751136067573141.scm:581");
        lambda$Fn1 = moduleMethod;
        this.$define = new ModuleMethod(frame, 19, "$define", 0);
        lambda$Fn2 = new ModuleMethod(frame, 20, null, 0);
        lambda$Fn3 = new ModuleMethod(frame, 21, null, 0);
        lambda$Fn4 = new ModuleMethod(frame, 22, null, 0);
        lambda$Fn5 = new ModuleMethod(frame, 23, null, 0);
        lambda$Fn6 = new ModuleMethod(frame, 24, null, 0);
        lambda$Fn7 = new ModuleMethod(frame, 25, null, 0);
        lambda$Fn8 = new ModuleMethod(frame, 26, null, 0);
        lambda$Fn9 = new ModuleMethod(frame, 27, null, 0);
        lambda$Fn10 = new ModuleMethod(frame, 28, null, 0);
        this.save_button$Click = new ModuleMethod(frame, 29, Lit22, 0);
        lambda$Fn11 = new ModuleMethod(frame, 30, null, 0);
        lambda$Fn12 = new ModuleMethod(frame, 31, null, 0);
        lambda$Fn14 = new ModuleMethod(frame, 32, null, 0);
        lambda$Fn16 = new ModuleMethod(frame, 33, null, 0);
        this.LocationSensor1$LocationChanged = new ModuleMethod(frame, 34, Lit47, 16388);
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
        LOCTION_SENSOR = null;
        this.form$Mnname$Mnsymbol = Lit0;
        this.events$Mnto$Mnregister = LList.Empty;
        this.components$Mnto$Mncreate = LList.Empty;
        this.global$Mnvars$Mnto$Mncreate = LList.Empty;
        this.form$Mndo$Mnafter$Mncreation = LList.Empty;
        runtime.$instance.run();
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addGlobalVarToCurrentFormEnvironment(Lit3, Lit4), $result);
        } else {
            addToGlobalVars(Lit3, lambda$Fn2);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addGlobalVarToCurrentFormEnvironment(Lit5, Lit4), $result);
        } else {
            addToGlobalVars(Lit5, lambda$Fn3);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            runtime.setAndCoerceProperty$Ex(Lit0, Lit6, "Defence", Lit7);
            Values.writeValues(runtime.setAndCoerceProperty$Ex(Lit0, Lit8, "LOCTION_SENSOR", Lit7), $result);
        } else {
            addToFormDoAfterCreation(new Promise(lambda$Fn4));
        }
        this.Label1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit9, Lit10, lambda$Fn5), $result);
        } else {
            addToComponents(Lit0, Lit12, Lit10, lambda$Fn6);
        }
        this.Label2 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit13, Lit14, lambda$Fn7), $result);
        } else {
            addToComponents(Lit0, Lit15, Lit14, lambda$Fn8);
        }
        this.save_button = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit16, Lit17, lambda$Fn9), $result);
        } else {
            addToComponents(Lit0, Lit18, Lit17, lambda$Fn10);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            runtime.addToCurrentFormEnvironment(Lit22, this.save_button$Click);
        } else {
            addToFormEnvironment(Lit22, this.save_button$Click);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "save_button", "Click");
        } else {
            addToEvents(Lit17, Lit23);
        }
        this.hotcoldlabel = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit24, Lit25, lambda$Fn11), $result);
        } else {
            addToComponents(Lit0, Lit26, Lit25, lambda$Fn12);
        }
        this.LocationSensor1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit27, Lit19, Boolean.FALSE), $result);
        } else {
            addToComponents(Lit0, Lit28, Lit19, Boolean.FALSE);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            runtime.addToCurrentFormEnvironment(Lit47, this.LocationSensor1$LocationChanged);
        } else {
            addToFormEnvironment(Lit47, this.LocationSensor1$LocationChanged);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "LocationSensor1", "LocationChanged");
        } else {
            addToEvents(Lit19, Lit48);
        }
        runtime.initRuntime();
    }

    static IntNum lambda3() {
        return Lit4;
    }

    static IntNum lambda4() {
        return Lit4;
    }

    static Object lambda5() {
        runtime.setAndCoerceProperty$Ex(Lit0, Lit6, "Defence", Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit0, Lit8, "LOCTION_SENSOR", Lit7);
    }

    static Object lambda6() {
        return runtime.setAndCoerceProperty$Ex(Lit10, Lit11, "(LATTITUDE)", Lit7);
    }

    static Object lambda7() {
        return runtime.setAndCoerceProperty$Ex(Lit10, Lit11, "(LATTITUDE)", Lit7);
    }

    static Object lambda8() {
        return runtime.setAndCoerceProperty$Ex(Lit14, Lit11, "(LONGITUDE)", Lit7);
    }

    static Object lambda9() {
        return runtime.setAndCoerceProperty$Ex(Lit14, Lit11, "(LONGITUDE)", Lit7);
    }

    static Object lambda10() {
        return runtime.setAndCoerceProperty$Ex(Lit17, Lit11, "SAVE LOCATION", Lit7);
    }

    static Object lambda11() {
        return runtime.setAndCoerceProperty$Ex(Lit17, Lit11, "SAVE LOCATION", Lit7);
    }

    public Object save_button$Click() {
        runtime.setThisForm();
        runtime.addGlobalVarToCurrentFormEnvironment(Lit3, runtime.get$Mnproperty.apply2(Lit19, Lit20));
        return runtime.addGlobalVarToCurrentFormEnvironment(Lit5, runtime.get$Mnproperty.apply2(Lit19, Lit21));
    }

    static Object lambda12() {
        return runtime.setAndCoerceProperty$Ex(Lit25, Lit11, "---", Lit7);
    }

    static Object lambda13() {
        return runtime.setAndCoerceProperty$Ex(Lit25, Lit11, "---", Lit7);
    }

    public Object LocationSensor1$LocationChanged(Object $latitude, Object $longitude, Object $altitude, Object $speed) {
        frame0 frame0 = new frame0();
        Object sanitizeComponentData = runtime.sanitizeComponentData($latitude);
        $longitude = runtime.sanitizeComponentData($longitude);
        runtime.sanitizeComponentData($altitude);
        runtime.sanitizeComponentData($speed);
        frame0.$latitude = sanitizeComponentData;
        runtime.setThisForm();
        runtime.setAndCoerceProperty$Ex(Lit10, Lit11, frame0.$latitude instanceof Package ? runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit29), " is not bound in the current context"), "Unbound Variable") : frame0.$latitude, Lit7);
        SimpleSymbol simpleSymbol = Lit14;
        SimpleSymbol simpleSymbol2 = Lit11;
        if ($longitude instanceof Package) {
            $longitude = runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit30), " is not bound in the current context"), "Unbound Variable");
        }
        runtime.setAndCoerceProperty$Ex(simpleSymbol, simpleSymbol2, $longitude, Lit7);
        if (runtime.processAndDelayed$V(new Object[]{frame0.lambda$Fn13, lambda$Fn14}) != Boolean.FALSE) {
            return runtime.setAndCoerceProperty$Ex(Lit25, Lit11, "hot", Lit7);
        }
        return runtime.processAndDelayed$V(new Object[]{frame0.lambda$Fn15, lambda$Fn16}) != Boolean.FALSE ? runtime.setAndCoerceProperty$Ex(Lit25, Lit11, "cold", Lit7) : Values.empty;
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
        LOCTION_SENSOR = this;
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
        LOCTION_SENSOR closureEnv = this;
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
