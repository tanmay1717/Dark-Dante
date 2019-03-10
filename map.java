package appinventor.ai_tshetty510.Defence;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import com.google.appinventor.components.common.PropertyTypeConstants;
import com.google.appinventor.components.runtime.ActivityStarter;
import com.google.appinventor.components.runtime.AppInventorCompatActivity;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.HorizontalArrangement;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.LocationSensor;
import com.google.appinventor.components.runtime.TinyDB;
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

/* compiled from: map.yail */
public class map extends Form implements Runnable {
    static final SimpleSymbol Lit0 = ((SimpleSymbol) new SimpleSymbol("map").readResolve());
    static final SimpleSymbol Lit1 = ((SimpleSymbol) new SimpleSymbol("getMessage").readResolve());
    static final PairWithPosition Lit10 = PairWithPosition.make(Lit5, LList.Empty, "/tmp/1552236494828_0.6178377661207605-0/youngandroidproject/../src/appinventor/ai_tshetty510/Defence/map.yail", 65783);
    static final SimpleSymbol Lit100 = ((SimpleSymbol) new SimpleSymbol("$longitude").readResolve());
    static final SimpleSymbol Lit101 = ((SimpleSymbol) new SimpleSymbol("LocationSensor1$LocationChanged").readResolve());
    static final SimpleSymbol Lit102 = ((SimpleSymbol) new SimpleSymbol("LocationChanged").readResolve());
    static final FString Lit103 = new FString("com.google.appinventor.components.runtime.ActivityStarter");
    static final SimpleSymbol Lit104 = ((SimpleSymbol) new SimpleSymbol("Action").readResolve());
    static final SimpleSymbol Lit105 = ((SimpleSymbol) new SimpleSymbol("ActivityClass").readResolve());
    static final SimpleSymbol Lit106 = ((SimpleSymbol) new SimpleSymbol("ActivityPackage").readResolve());
    static final FString Lit107 = new FString("com.google.appinventor.components.runtime.ActivityStarter");
    static final SimpleSymbol Lit108 = ((SimpleSymbol) new SimpleSymbol("android-log-form").readResolve());
    static final SimpleSymbol Lit109 = ((SimpleSymbol) new SimpleSymbol("add-to-form-environment").readResolve());
    static final IntNum Lit11 = IntNum.make(0);
    static final SimpleSymbol Lit110 = ((SimpleSymbol) new SimpleSymbol("lookup-in-form-environment").readResolve());
    static final SimpleSymbol Lit111 = ((SimpleSymbol) new SimpleSymbol("is-bound-in-form-environment").readResolve());
    static final SimpleSymbol Lit112 = ((SimpleSymbol) new SimpleSymbol("add-to-global-var-environment").readResolve());
    static final SimpleSymbol Lit113 = ((SimpleSymbol) new SimpleSymbol("add-to-events").readResolve());
    static final SimpleSymbol Lit114 = ((SimpleSymbol) new SimpleSymbol("add-to-components").readResolve());
    static final SimpleSymbol Lit115 = ((SimpleSymbol) new SimpleSymbol("add-to-global-vars").readResolve());
    static final SimpleSymbol Lit116 = ((SimpleSymbol) new SimpleSymbol("add-to-form-do-after-creation").readResolve());
    static final SimpleSymbol Lit117 = ((SimpleSymbol) new SimpleSymbol("send-error").readResolve());
    static final SimpleSymbol Lit118 = ((SimpleSymbol) new SimpleSymbol("dispatchEvent").readResolve());
    static final SimpleSymbol Lit119 = ((SimpleSymbol) new SimpleSymbol("lookup-handler").readResolve());
    static final PairWithPosition Lit12 = PairWithPosition.make(Lit121, PairWithPosition.make(Lit121, LList.Empty, "/tmp/1552236494828_0.6178377661207605-0/youngandroidproject/../src/appinventor/ai_tshetty510/Defence/map.yail", 65812), "/tmp/1552236494828_0.6178377661207605-0/youngandroidproject/../src/appinventor/ai_tshetty510/Defence/map.yail", 65804);
    static final SimpleSymbol Lit120 = ((SimpleSymbol) new SimpleSymbol("any").readResolve());
    static final SimpleSymbol Lit121 = ((SimpleSymbol) new SimpleSymbol("number").readResolve());
    static final SimpleSymbol Lit13 = ((SimpleSymbol) new SimpleSymbol("remember_address_data").readResolve());
    static final SimpleSymbol Lit14 = ((SimpleSymbol) new SimpleSymbol("Text").readResolve());
    static final SimpleSymbol Lit15 = ((SimpleSymbol) new SimpleSymbol("remembered_latitude").readResolve());
    static final PairWithPosition Lit16 = PairWithPosition.make(Lit5, PairWithPosition.make(Lit120, LList.Empty, "/tmp/1552236494828_0.6178377661207605-0/youngandroidproject/../src/appinventor/ai_tshetty510/Defence/map.yail", 66057), "/tmp/1552236494828_0.6178377661207605-0/youngandroidproject/../src/appinventor/ai_tshetty510/Defence/map.yail", 66051);
    static final SimpleSymbol Lit17 = ((SimpleSymbol) new SimpleSymbol("remembered_longitude").readResolve());
    static final PairWithPosition Lit18 = PairWithPosition.make(Lit5, PairWithPosition.make(Lit120, LList.Empty, "/tmp/1552236494828_0.6178377661207605-0/youngandroidproject/../src/appinventor/ai_tshetty510/Defence/map.yail", 66209), "/tmp/1552236494828_0.6178377661207605-0/youngandroidproject/../src/appinventor/ai_tshetty510/Defence/map.yail", 66203);
    static final SimpleSymbol Lit19 = ((SimpleSymbol) new SimpleSymbol("show_location").readResolve());
    static final SimpleSymbol Lit2 = ((SimpleSymbol) new SimpleSymbol("*the-null-value*").readResolve());
    static final SimpleSymbol Lit20 = ((SimpleSymbol) new SimpleSymbol("Enabled").readResolve());
    static final SimpleSymbol Lit21 = ((SimpleSymbol) new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_BOOLEAN).readResolve());
    static final SimpleSymbol Lit22 = ((SimpleSymbol) new SimpleSymbol("map$Initialize").readResolve());
    static final SimpleSymbol Lit23 = ((SimpleSymbol) new SimpleSymbol("Initialize").readResolve());
    static final FString Lit24 = new FString("com.google.appinventor.components.runtime.Button");
    static final SimpleSymbol Lit25 = ((SimpleSymbol) new SimpleSymbol("RECORD_CURRENT_LOCATION").readResolve());
    static final FString Lit26 = new FString("com.google.appinventor.components.runtime.Button");
    static final FString Lit27 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit28 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement1").readResolve());
    static final FString Lit29 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit3 = ((SimpleSymbol) new SimpleSymbol("g$tempaddress").readResolve());
    static final FString Lit30 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit31 = ((SimpleSymbol) new SimpleSymbol("current_address").readResolve());
    static final FString Lit32 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit33 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit34 = ((SimpleSymbol) new SimpleSymbol("current_address_data_label").readResolve());
    static final FString Lit35 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit36 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit37 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement2").readResolve());
    static final FString Lit38 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final FString Lit39 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit4 = ((SimpleSymbol) new SimpleSymbol("AppName").readResolve());
    static final SimpleSymbol Lit40 = ((SimpleSymbol) new SimpleSymbol("current_Gps").readResolve());
    static final FString Lit41 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit42 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit43 = ((SimpleSymbol) new SimpleSymbol("current_latitude").readResolve());
    static final FString Lit44 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit45 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit46 = ((SimpleSymbol) new SimpleSymbol("comma").readResolve());
    static final FString Lit47 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit48 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit49 = ((SimpleSymbol) new SimpleSymbol("current_longitude").readResolve());
    static final SimpleSymbol Lit5;
    static final FString Lit50 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit51 = new FString("com.google.appinventor.components.runtime.Button");
    static final SimpleSymbol Lit52 = ((SimpleSymbol) new SimpleSymbol("record_button").readResolve());
    static final FString Lit53 = new FString("com.google.appinventor.components.runtime.Button");
    static final SimpleSymbol Lit54 = ((SimpleSymbol) new SimpleSymbol("remember_loction").readResolve());
    static final SimpleSymbol Lit55 = ((SimpleSymbol) new SimpleSymbol("LocationSensor1").readResolve());
    static final SimpleSymbol Lit56 = ((SimpleSymbol) new SimpleSymbol("CurrentAddress").readResolve());
    static final SimpleSymbol Lit57 = ((SimpleSymbol) new SimpleSymbol("Latitude").readResolve());
    static final SimpleSymbol Lit58 = ((SimpleSymbol) new SimpleSymbol("Longitude").readResolve());
    static final SimpleSymbol Lit59 = ((SimpleSymbol) new SimpleSymbol("StoreValue").readResolve());
    static final SimpleSymbol Lit6 = ((SimpleSymbol) new SimpleSymbol("Title").readResolve());
    static final PairWithPosition Lit60 = PairWithPosition.make(Lit5, PairWithPosition.make(Lit120, LList.Empty, "/tmp/1552236494828_0.6178377661207605-0/youngandroidproject/../src/appinventor/ai_tshetty510/Defence/map.yail", 344508), "/tmp/1552236494828_0.6178377661207605-0/youngandroidproject/../src/appinventor/ai_tshetty510/Defence/map.yail", 344502);
    static final PairWithPosition Lit61 = PairWithPosition.make(Lit5, PairWithPosition.make(Lit120, LList.Empty, "/tmp/1552236494828_0.6178377661207605-0/youngandroidproject/../src/appinventor/ai_tshetty510/Defence/map.yail", 344639), "/tmp/1552236494828_0.6178377661207605-0/youngandroidproject/../src/appinventor/ai_tshetty510/Defence/map.yail", 344633);
    static final PairWithPosition Lit62 = PairWithPosition.make(Lit5, PairWithPosition.make(Lit120, LList.Empty, "/tmp/1552236494828_0.6178377661207605-0/youngandroidproject/../src/appinventor/ai_tshetty510/Defence/map.yail", 344772), "/tmp/1552236494828_0.6178377661207605-0/youngandroidproject/../src/appinventor/ai_tshetty510/Defence/map.yail", 344766);
    static final SimpleSymbol Lit63 = ((SimpleSymbol) new SimpleSymbol("record_button$Click").readResolve());
    static final SimpleSymbol Lit64 = ((SimpleSymbol) new SimpleSymbol("Click").readResolve());
    static final FString Lit65 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit66 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit67 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit68 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement3").readResolve());
    static final FString Lit69 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit7 = ((SimpleSymbol) new SimpleSymbol(TinyDB.DEFAULT_NAMESPACE).readResolve());
    static final FString Lit70 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit71 = ((SimpleSymbol) new SimpleSymbol("addres").readResolve());
    static final FString Lit72 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit73 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit74 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit75 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit76 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement4").readResolve());
    static final FString Lit77 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final FString Lit78 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit79 = ((SimpleSymbol) new SimpleSymbol("remembered_gps").readResolve());
    static final SimpleSymbol Lit8 = ((SimpleSymbol) new SimpleSymbol("GetValue").readResolve());
    static final FString Lit80 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit81 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit82 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit83 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit84 = ((SimpleSymbol) new SimpleSymbol("comma1").readResolve());
    static final FString Lit85 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit86 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit87 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit88 = new FString("com.google.appinventor.components.runtime.Button");
    static final FString Lit89 = new FString("com.google.appinventor.components.runtime.Button");
    static final PairWithPosition Lit9 = PairWithPosition.make(Lit5, PairWithPosition.make(Lit120, LList.Empty, "/tmp/1552236494828_0.6178377661207605-0/youngandroidproject/../src/appinventor/ai_tshetty510/Defence/map.yail", 65649), "/tmp/1552236494828_0.6178377661207605-0/youngandroidproject/../src/appinventor/ai_tshetty510/Defence/map.yail", 65643);
    static final SimpleSymbol Lit90 = ((SimpleSymbol) new SimpleSymbol("ActivityStarter1").readResolve());
    static final SimpleSymbol Lit91 = ((SimpleSymbol) new SimpleSymbol("DataUri").readResolve());
    static final PairWithPosition Lit92;
    static final SimpleSymbol Lit93 = ((SimpleSymbol) new SimpleSymbol("StartActivity").readResolve());
    static final SimpleSymbol Lit94 = ((SimpleSymbol) new SimpleSymbol("show_location$Click").readResolve());
    static final FString Lit95 = new FString("com.google.appinventor.components.runtime.TinyDB");
    static final FString Lit96 = new FString("com.google.appinventor.components.runtime.TinyDB");
    static final FString Lit97 = new FString("com.google.appinventor.components.runtime.LocationSensor");
    static final FString Lit98 = new FString("com.google.appinventor.components.runtime.LocationSensor");
    static final SimpleSymbol Lit99 = ((SimpleSymbol) new SimpleSymbol("$latitude").readResolve());
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
    static final ModuleMethod lambda$Fn33 = null;
    static final ModuleMethod lambda$Fn34 = null;
    static final ModuleMethod lambda$Fn35 = null;
    static final ModuleMethod lambda$Fn36 = null;
    static final ModuleMethod lambda$Fn37 = null;
    static final ModuleMethod lambda$Fn4 = null;
    static final ModuleMethod lambda$Fn5 = null;
    static final ModuleMethod lambda$Fn6 = null;
    static final ModuleMethod lambda$Fn7 = null;
    static final ModuleMethod lambda$Fn8 = null;
    static final ModuleMethod lambda$Fn9 = null;
    public static map map;
    public Boolean $Stdebug$Mnform$St;
    public final ModuleMethod $define;
    public ActivityStarter ActivityStarter1;
    public HorizontalArrangement HorizontalArrangement1;
    public HorizontalArrangement HorizontalArrangement2;
    public HorizontalArrangement HorizontalArrangement3;
    public HorizontalArrangement HorizontalArrangement4;
    public LocationSensor LocationSensor1;
    public final ModuleMethod LocationSensor1$LocationChanged;
    public Button RECORD_CURRENT_LOCATION;
    public TinyDB TinyDB1;
    public final ModuleMethod add$Mnto$Mncomponents;
    public final ModuleMethod add$Mnto$Mnevents;
    public final ModuleMethod add$Mnto$Mnform$Mndo$Mnafter$Mncreation;
    public final ModuleMethod add$Mnto$Mnform$Mnenvironment;
    public final ModuleMethod add$Mnto$Mnglobal$Mnvar$Mnenvironment;
    public final ModuleMethod add$Mnto$Mnglobal$Mnvars;
    public Label addres;
    public final ModuleMethod android$Mnlog$Mnform;
    public Label comma;
    public Label comma1;
    public LList components$Mnto$Mncreate;
    public Label current_Gps;
    public Label current_address;
    public Label current_address_data_label;
    public Label current_latitude;
    public Label current_longitude;
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
    public final ModuleMethod map$Initialize;
    public final ModuleMethod onCreate;
    public final ModuleMethod process$Mnexception;
    public Button record_button;
    public final ModuleMethod record_button$Click;
    public Label remember_address_data;
    public Label remember_loction;
    public Label remembered_gps;
    public Label remembered_latitude;
    public Label remembered_longitude;
    public final ModuleMethod send$Mnerror;
    public Button show_location;
    public final ModuleMethod show_location$Click;

    /* compiled from: map.yail */
    public class frame extends ModuleBody {
        map $main = this;

        public int match1(ModuleMethod moduleMethod, Object obj, CallContext callContext) {
            switch (moduleMethod.selector) {
                case 1:
                    if (!(obj instanceof map)) {
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
                    if (!(obj instanceof map)) {
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
                    if (!(obj instanceof map)) {
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
                case 55:
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
                case 55:
                    return this.$main.LocationSensor1$LocationChanged(obj, obj2, obj3, obj4);
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
                    return map.lambda2();
                case 17:
                    this.$main.$define();
                    return Values.empty;
                case 18:
                    return map.lambda3();
                case 19:
                    return map.lambda4();
                case 20:
                    return this.$main.map$Initialize();
                case 21:
                    return map.lambda5();
                case 22:
                    return map.lambda6();
                case 23:
                    return map.lambda7();
                case 24:
                    return map.lambda8();
                case 25:
                    return map.lambda9();
                case 26:
                    return map.lambda10();
                case 27:
                    return map.lambda11();
                case 28:
                    return map.lambda12();
                case 29:
                    return map.lambda13();
                case 30:
                    return map.lambda14();
                case 31:
                    return map.lambda15();
                case 32:
                    return map.lambda16();
                case 33:
                    return map.lambda17();
                case 34:
                    return map.lambda18();
                case 35:
                    return map.lambda19();
                case 36:
                    return map.lambda20();
                case 37:
                    return this.$main.record_button$Click();
                case 38:
                    return map.lambda21();
                case 39:
                    return map.lambda22();
                case 40:
                    return map.lambda23();
                case 41:
                    return map.lambda24();
                case 42:
                    return map.lambda25();
                case 43:
                    return map.lambda26();
                case 44:
                    return map.lambda27();
                case 45:
                    return map.lambda28();
                case 46:
                    return map.lambda29();
                case 47:
                    return map.lambda30();
                case 48:
                    return map.lambda31();
                case 49:
                    return map.lambda32();
                case 50:
                    return map.lambda33();
                case 51:
                    return map.lambda34();
                case 52:
                    return map.lambda35();
                case 53:
                    return map.lambda36();
                case 54:
                    return this.$main.show_location$Click();
                case 56:
                    return map.lambda37();
                case 57:
                    return map.lambda38();
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
                case 51:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 52:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 53:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 54:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 56:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 57:
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
        Lit5 = simpleSymbol;
        Lit92 = PairWithPosition.make(simpleSymbol, PairWithPosition.make(Lit5, PairWithPosition.make(Lit5, PairWithPosition.make(Lit5, PairWithPosition.make(Lit5, PairWithPosition.make(Lit5, PairWithPosition.make(Lit5, PairWithPosition.make(Lit5, LList.Empty, "/tmp/1552236494828_0.6178377661207605-0/youngandroidproject/../src/appinventor/ai_tshetty510/Defence/map.yail", 622959), "/tmp/1552236494828_0.6178377661207605-0/youngandroidproject/../src/appinventor/ai_tshetty510/Defence/map.yail", 622954), "/tmp/1552236494828_0.6178377661207605-0/youngandroidproject/../src/appinventor/ai_tshetty510/Defence/map.yail", 622949), "/tmp/1552236494828_0.6178377661207605-0/youngandroidproject/../src/appinventor/ai_tshetty510/Defence/map.yail", 622944), "/tmp/1552236494828_0.6178377661207605-0/youngandroidproject/../src/appinventor/ai_tshetty510/Defence/map.yail", 622939), "/tmp/1552236494828_0.6178377661207605-0/youngandroidproject/../src/appinventor/ai_tshetty510/Defence/map.yail", 622934), "/tmp/1552236494828_0.6178377661207605-0/youngandroidproject/../src/appinventor/ai_tshetty510/Defence/map.yail", 622929), "/tmp/1552236494828_0.6178377661207605-0/youngandroidproject/../src/appinventor/ai_tshetty510/Defence/map.yail", 622923);
    }

    public map() {
        ModuleInfo.register(this);
        ModuleBody frame = new frame();
        this.onCreate = new ModuleMethod(frame, 1, "onCreate", FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.android$Mnlog$Mnform = new ModuleMethod(frame, 2, Lit108, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.add$Mnto$Mnform$Mnenvironment = new ModuleMethod(frame, 3, Lit109, 8194);
        this.lookup$Mnin$Mnform$Mnenvironment = new ModuleMethod(frame, 4, Lit110, 8193);
        this.is$Mnbound$Mnin$Mnform$Mnenvironment = new ModuleMethod(frame, 6, Lit111, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.add$Mnto$Mnglobal$Mnvar$Mnenvironment = new ModuleMethod(frame, 7, Lit112, 8194);
        this.add$Mnto$Mnevents = new ModuleMethod(frame, 8, Lit113, 8194);
        this.add$Mnto$Mncomponents = new ModuleMethod(frame, 9, Lit114, 16388);
        this.add$Mnto$Mnglobal$Mnvars = new ModuleMethod(frame, 10, Lit115, 8194);
        this.add$Mnto$Mnform$Mndo$Mnafter$Mncreation = new ModuleMethod(frame, 11, Lit116, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.send$Mnerror = new ModuleMethod(frame, 12, Lit117, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.process$Mnexception = new ModuleMethod(frame, 13, "process-exception", FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.dispatchEvent = new ModuleMethod(frame, 14, Lit118, 16388);
        this.lookup$Mnhandler = new ModuleMethod(frame, 15, Lit119, 8194);
        PropertySet moduleMethod = new ModuleMethod(frame, 16, null, 0);
        moduleMethod.setProperty("source-location", "/tmp/runtime6320751136067573141.scm:581");
        lambda$Fn1 = moduleMethod;
        this.$define = new ModuleMethod(frame, 17, "$define", 0);
        lambda$Fn2 = new ModuleMethod(frame, 18, null, 0);
        lambda$Fn3 = new ModuleMethod(frame, 19, null, 0);
        this.map$Initialize = new ModuleMethod(frame, 20, Lit22, 0);
        lambda$Fn4 = new ModuleMethod(frame, 21, null, 0);
        lambda$Fn5 = new ModuleMethod(frame, 22, null, 0);
        lambda$Fn6 = new ModuleMethod(frame, 23, null, 0);
        lambda$Fn7 = new ModuleMethod(frame, 24, null, 0);
        lambda$Fn8 = new ModuleMethod(frame, 25, null, 0);
        lambda$Fn9 = new ModuleMethod(frame, 26, null, 0);
        lambda$Fn10 = new ModuleMethod(frame, 27, null, 0);
        lambda$Fn11 = new ModuleMethod(frame, 28, null, 0);
        lambda$Fn12 = new ModuleMethod(frame, 29, null, 0);
        lambda$Fn13 = new ModuleMethod(frame, 30, null, 0);
        lambda$Fn14 = new ModuleMethod(frame, 31, null, 0);
        lambda$Fn15 = new ModuleMethod(frame, 32, null, 0);
        lambda$Fn16 = new ModuleMethod(frame, 33, null, 0);
        lambda$Fn17 = new ModuleMethod(frame, 34, null, 0);
        lambda$Fn18 = new ModuleMethod(frame, 35, null, 0);
        lambda$Fn19 = new ModuleMethod(frame, 36, null, 0);
        this.record_button$Click = new ModuleMethod(frame, 37, Lit63, 0);
        lambda$Fn20 = new ModuleMethod(frame, 38, null, 0);
        lambda$Fn21 = new ModuleMethod(frame, 39, null, 0);
        lambda$Fn22 = new ModuleMethod(frame, 40, null, 0);
        lambda$Fn23 = new ModuleMethod(frame, 41, null, 0);
        lambda$Fn24 = new ModuleMethod(frame, 42, null, 0);
        lambda$Fn25 = new ModuleMethod(frame, 43, null, 0);
        lambda$Fn26 = new ModuleMethod(frame, 44, null, 0);
        lambda$Fn27 = new ModuleMethod(frame, 45, null, 0);
        lambda$Fn28 = new ModuleMethod(frame, 46, null, 0);
        lambda$Fn29 = new ModuleMethod(frame, 47, null, 0);
        lambda$Fn30 = new ModuleMethod(frame, 48, null, 0);
        lambda$Fn31 = new ModuleMethod(frame, 49, null, 0);
        lambda$Fn32 = new ModuleMethod(frame, 50, null, 0);
        lambda$Fn33 = new ModuleMethod(frame, 51, null, 0);
        lambda$Fn34 = new ModuleMethod(frame, 52, null, 0);
        lambda$Fn35 = new ModuleMethod(frame, 53, null, 0);
        this.show_location$Click = new ModuleMethod(frame, 54, Lit94, 0);
        this.LocationSensor1$LocationChanged = new ModuleMethod(frame, 55, Lit101, 16388);
        lambda$Fn36 = new ModuleMethod(frame, 56, null, 0);
        lambda$Fn37 = new ModuleMethod(frame, 57, null, 0);
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
        map = null;
        this.form$Mnname$Mnsymbol = Lit0;
        this.events$Mnto$Mnregister = LList.Empty;
        this.components$Mnto$Mncreate = LList.Empty;
        this.global$Mnvars$Mnto$Mncreate = LList.Empty;
        this.form$Mndo$Mnafter$Mncreation = LList.Empty;
        runtime.$instance.run();
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addGlobalVarToCurrentFormEnvironment(Lit3, PropertyTypeConstants.PROPERTY_TYPE_TEXT), $result);
        } else {
            addToGlobalVars(Lit3, lambda$Fn2);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            runtime.setAndCoerceProperty$Ex(Lit0, Lit4, "Defence", Lit5);
            Values.writeValues(runtime.setAndCoerceProperty$Ex(Lit0, Lit6, "map", Lit5), $result);
        } else {
            addToFormDoAfterCreation(new Promise(lambda$Fn3));
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            runtime.addToCurrentFormEnvironment(Lit22, this.map$Initialize);
        } else {
            addToFormEnvironment(Lit22, this.map$Initialize);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "map", "Initialize");
        } else {
            addToEvents(Lit0, Lit23);
        }
        this.RECORD_CURRENT_LOCATION = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit24, Lit25, lambda$Fn4), $result);
        } else {
            addToComponents(Lit0, Lit26, Lit25, lambda$Fn5);
        }
        this.HorizontalArrangement1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit27, Lit28, Boolean.FALSE), $result);
        } else {
            addToComponents(Lit0, Lit29, Lit28, Boolean.FALSE);
        }
        this.current_address = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit28, Lit30, Lit31, lambda$Fn6), $result);
        } else {
            addToComponents(Lit28, Lit32, Lit31, lambda$Fn7);
        }
        this.current_address_data_label = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit28, Lit33, Lit34, lambda$Fn8), $result);
        } else {
            addToComponents(Lit28, Lit35, Lit34, lambda$Fn9);
        }
        this.HorizontalArrangement2 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit36, Lit37, Boolean.FALSE), $result);
        } else {
            addToComponents(Lit0, Lit38, Lit37, Boolean.FALSE);
        }
        this.current_Gps = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit37, Lit39, Lit40, lambda$Fn10), $result);
        } else {
            addToComponents(Lit37, Lit41, Lit40, lambda$Fn11);
        }
        this.current_latitude = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit37, Lit42, Lit43, lambda$Fn12), $result);
        } else {
            addToComponents(Lit37, Lit44, Lit43, lambda$Fn13);
        }
        this.comma = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit37, Lit45, Lit46, lambda$Fn14), $result);
        } else {
            addToComponents(Lit37, Lit47, Lit46, lambda$Fn15);
        }
        this.current_longitude = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit37, Lit48, Lit49, lambda$Fn16), $result);
        } else {
            addToComponents(Lit37, Lit50, Lit49, lambda$Fn17);
        }
        this.record_button = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit51, Lit52, lambda$Fn18), $result);
        } else {
            addToComponents(Lit0, Lit53, Lit52, lambda$Fn19);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            runtime.addToCurrentFormEnvironment(Lit63, this.record_button$Click);
        } else {
            addToFormEnvironment(Lit63, this.record_button$Click);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "record_button", "Click");
        } else {
            addToEvents(Lit52, Lit64);
        }
        this.remember_loction = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit65, Lit54, lambda$Fn20), $result);
        } else {
            addToComponents(Lit0, Lit66, Lit54, lambda$Fn21);
        }
        this.HorizontalArrangement3 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit67, Lit68, Boolean.FALSE), $result);
        } else {
            addToComponents(Lit0, Lit69, Lit68, Boolean.FALSE);
        }
        this.addres = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit68, Lit70, Lit71, lambda$Fn22), $result);
        } else {
            addToComponents(Lit68, Lit72, Lit71, lambda$Fn23);
        }
        this.remember_address_data = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit68, Lit73, Lit13, lambda$Fn24), $result);
        } else {
            addToComponents(Lit68, Lit74, Lit13, lambda$Fn25);
        }
        this.HorizontalArrangement4 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit75, Lit76, Boolean.FALSE), $result);
        } else {
            addToComponents(Lit0, Lit77, Lit76, Boolean.FALSE);
        }
        this.remembered_gps = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit76, Lit78, Lit79, lambda$Fn26), $result);
        } else {
            addToComponents(Lit76, Lit80, Lit79, lambda$Fn27);
        }
        this.remembered_latitude = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit76, Lit81, Lit15, lambda$Fn28), $result);
        } else {
            addToComponents(Lit76, Lit82, Lit15, lambda$Fn29);
        }
        this.comma1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit76, Lit83, Lit84, lambda$Fn30), $result);
        } else {
            addToComponents(Lit76, Lit85, Lit84, lambda$Fn31);
        }
        this.remembered_longitude = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit76, Lit86, Lit17, lambda$Fn32), $result);
        } else {
            addToComponents(Lit76, Lit87, Lit17, lambda$Fn33);
        }
        this.show_location = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit88, Lit19, lambda$Fn34), $result);
        } else {
            addToComponents(Lit0, Lit89, Lit19, lambda$Fn35);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            runtime.addToCurrentFormEnvironment(Lit94, this.show_location$Click);
        } else {
            addToFormEnvironment(Lit94, this.show_location$Click);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "show_location", "Click");
        } else {
            addToEvents(Lit19, Lit64);
        }
        this.TinyDB1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit95, Lit7, Boolean.FALSE), $result);
        } else {
            addToComponents(Lit0, Lit96, Lit7, Boolean.FALSE);
        }
        this.LocationSensor1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit97, Lit55, Boolean.FALSE), $result);
        } else {
            addToComponents(Lit0, Lit98, Lit55, Boolean.FALSE);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            runtime.addToCurrentFormEnvironment(Lit101, this.LocationSensor1$LocationChanged);
        } else {
            addToFormEnvironment(Lit101, this.LocationSensor1$LocationChanged);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "LocationSensor1", "LocationChanged");
        } else {
            addToEvents(Lit55, Lit102);
        }
        this.ActivityStarter1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit103, Lit90, lambda$Fn36), $result);
        } else {
            addToComponents(Lit0, Lit107, Lit90, lambda$Fn37);
        }
        runtime.initRuntime();
    }

    static String lambda3() {
        return PropertyTypeConstants.PROPERTY_TYPE_TEXT;
    }

    static Object lambda4() {
        runtime.setAndCoerceProperty$Ex(Lit0, Lit4, "Defence", Lit5);
        return runtime.setAndCoerceProperty$Ex(Lit0, Lit6, "map", Lit5);
    }

    public Object map$Initialize() {
        runtime.setThisForm();
        runtime.addGlobalVarToCurrentFormEnvironment(Lit3, runtime.callComponentMethod(Lit7, Lit8, LList.list2("address", ""), Lit9));
        if (runtime.callYailPrimitive(Scheme.numGrt, LList.list2(runtime.callYailPrimitive(strings.string$Mnlength, LList.list1(runtime.lookupGlobalVarInCurrentFormEnvironment(Lit3, runtime.$Stthe$Mnnull$Mnvalue$St)), Lit10, "length"), Lit11), Lit12, ">") == Boolean.FALSE) {
            return Values.empty;
        }
        runtime.setAndCoerceProperty$Ex(Lit13, Lit14, runtime.lookupGlobalVarInCurrentFormEnvironment(Lit3, runtime.$Stthe$Mnnull$Mnvalue$St), Lit5);
        runtime.setAndCoerceProperty$Ex(Lit15, Lit14, runtime.callComponentMethod(Lit7, Lit8, LList.list2(PropertyTypeConstants.PROPERTY_TYPE_LATITUDE, ""), Lit16), Lit5);
        runtime.setAndCoerceProperty$Ex(Lit17, Lit14, runtime.callComponentMethod(Lit7, Lit8, LList.list2(PropertyTypeConstants.PROPERTY_TYPE_LONGITUDE, ""), Lit18), Lit5);
        return runtime.setAndCoerceProperty$Ex(Lit19, Lit20, Boolean.TRUE, Lit21);
    }

    static Object lambda5() {
        return runtime.setAndCoerceProperty$Ex(Lit25, Lit14, "RECORD LOCATION", Lit5);
    }

    static Object lambda6() {
        return runtime.setAndCoerceProperty$Ex(Lit25, Lit14, "RECORD LOCATION", Lit5);
    }

    static Object lambda7() {
        return runtime.setAndCoerceProperty$Ex(Lit31, Lit14, "Address:", Lit5);
    }

    static Object lambda8() {
        return runtime.setAndCoerceProperty$Ex(Lit31, Lit14, "Address:", Lit5);
    }

    static Object lambda10() {
        return runtime.setAndCoerceProperty$Ex(Lit34, Lit14, "Unknown", Lit5);
    }

    static Object lambda9() {
        return runtime.setAndCoerceProperty$Ex(Lit34, Lit14, "Unknown", Lit5);
    }

    static Object lambda11() {
        return runtime.setAndCoerceProperty$Ex(Lit40, Lit14, "GPS", Lit5);
    }

    static Object lambda12() {
        return runtime.setAndCoerceProperty$Ex(Lit40, Lit14, "GPS", Lit5);
    }

    static Object lambda13() {
        return runtime.setAndCoerceProperty$Ex(Lit43, Lit14, "0", Lit5);
    }

    static Object lambda14() {
        return runtime.setAndCoerceProperty$Ex(Lit43, Lit14, "0", Lit5);
    }

    static Object lambda15() {
        return runtime.setAndCoerceProperty$Ex(Lit46, Lit14, ",", Lit5);
    }

    static Object lambda16() {
        return runtime.setAndCoerceProperty$Ex(Lit46, Lit14, ",", Lit5);
    }

    static Object lambda17() {
        return runtime.setAndCoerceProperty$Ex(Lit49, Lit14, "0", Lit5);
    }

    static Object lambda18() {
        return runtime.setAndCoerceProperty$Ex(Lit49, Lit14, "0", Lit5);
    }

    static Object lambda19() {
        return runtime.setAndCoerceProperty$Ex(Lit52, Lit14, "record location", Lit5);
    }

    static Object lambda20() {
        return runtime.setAndCoerceProperty$Ex(Lit52, Lit14, "record location", Lit5);
    }

    public Object record_button$Click() {
        runtime.setThisForm();
        runtime.setAndCoerceProperty$Ex(Lit54, Lit14, runtime.get$Mnproperty.apply2(Lit55, Lit56), Lit5);
        runtime.setAndCoerceProperty$Ex(Lit15, Lit14, runtime.get$Mnproperty.apply2(Lit55, Lit57), Lit5);
        runtime.setAndCoerceProperty$Ex(Lit17, Lit14, runtime.get$Mnproperty.apply2(Lit55, Lit58), Lit5);
        runtime.callComponentMethod(Lit7, Lit59, LList.list2("address", runtime.get$Mnproperty.apply2(Lit55, Lit56)), Lit60);
        runtime.callComponentMethod(Lit7, Lit59, LList.list2(PropertyTypeConstants.PROPERTY_TYPE_LATITUDE, runtime.get$Mnproperty.apply2(Lit55, Lit57)), Lit61);
        runtime.callComponentMethod(Lit7, Lit59, LList.list2(PropertyTypeConstants.PROPERTY_TYPE_LONGITUDE, runtime.get$Mnproperty.apply2(Lit55, Lit58)), Lit62);
        return runtime.setAndCoerceProperty$Ex(Lit19, Lit20, Boolean.TRUE, Lit21);
    }

    static Object lambda21() {
        return runtime.setAndCoerceProperty$Ex(Lit54, Lit14, "Remember location", Lit5);
    }

    static Object lambda22() {
        return runtime.setAndCoerceProperty$Ex(Lit54, Lit14, "Remember location", Lit5);
    }

    static Object lambda23() {
        return runtime.setAndCoerceProperty$Ex(Lit71, Lit14, "Address:", Lit5);
    }

    static Object lambda24() {
        return runtime.setAndCoerceProperty$Ex(Lit71, Lit14, "Address:", Lit5);
    }

    static Object lambda25() {
        return runtime.setAndCoerceProperty$Ex(Lit13, Lit14, "Unknown", Lit5);
    }

    static Object lambda26() {
        return runtime.setAndCoerceProperty$Ex(Lit13, Lit14, "Unknown", Lit5);
    }

    static Object lambda27() {
        return runtime.setAndCoerceProperty$Ex(Lit79, Lit14, "GPS", Lit5);
    }

    static Object lambda28() {
        return runtime.setAndCoerceProperty$Ex(Lit79, Lit14, "GPS", Lit5);
    }

    static Object lambda29() {
        return runtime.setAndCoerceProperty$Ex(Lit15, Lit14, "0.0", Lit5);
    }

    static Object lambda30() {
        return runtime.setAndCoerceProperty$Ex(Lit15, Lit14, "0.0", Lit5);
    }

    static Object lambda31() {
        return runtime.setAndCoerceProperty$Ex(Lit84, Lit14, ",", Lit5);
    }

    static Object lambda32() {
        return runtime.setAndCoerceProperty$Ex(Lit84, Lit14, ",", Lit5);
    }

    static Object lambda33() {
        return runtime.setAndCoerceProperty$Ex(Lit17, Lit14, "0.0", Lit5);
    }

    static Object lambda34() {
        return runtime.setAndCoerceProperty$Ex(Lit17, Lit14, "0.0", Lit5);
    }

    static Object lambda35() {
        return runtime.setAndCoerceProperty$Ex(Lit19, Lit14, "SHOW LOCATION", Lit5);
    }

    static Object lambda36() {
        return runtime.setAndCoerceProperty$Ex(Lit19, Lit14, "SHOW LOCATION", Lit5);
    }

    public Object show_location$Click() {
        runtime.setThisForm();
        SimpleSymbol simpleSymbol = Lit90;
        SimpleSymbol simpleSymbol2 = Lit91;
        ModuleMethod moduleMethod = strings.string$Mnappend;
        Pair list1 = LList.list1("https://maps.google.com?saddr=");
        LList.chain1(LList.chain1(LList.chain1(LList.chain4(list1, runtime.get$Mnproperty.apply2(Lit43, Lit14), ",", runtime.get$Mnproperty.apply2(Lit49, Lit14), "&daddr="), runtime.get$Mnproperty.apply2(Lit15, Lit14)), ","), runtime.get$Mnproperty.apply2(Lit17, Lit14));
        runtime.setAndCoerceProperty$Ex(simpleSymbol, simpleSymbol2, runtime.callYailPrimitive(moduleMethod, list1, Lit92, "join"), Lit5);
        return runtime.callComponentMethod(Lit90, Lit93, LList.Empty, LList.Empty);
    }

    public Object LocationSensor1$LocationChanged(Object $latitude, Object $longitude, Object $altitude, Object $speed) {
        $latitude = runtime.sanitizeComponentData($latitude);
        $longitude = runtime.sanitizeComponentData($longitude);
        runtime.sanitizeComponentData($altitude);
        runtime.sanitizeComponentData($speed);
        runtime.setThisForm();
        runtime.setAndCoerceProperty$Ex(Lit31, Lit14, runtime.get$Mnproperty.apply2(Lit55, Lit56), Lit5);
        SimpleSymbol simpleSymbol = Lit43;
        SimpleSymbol simpleSymbol2 = Lit14;
        if ($latitude instanceof Package) {
            $latitude = runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit99), " is not bound in the current context"), "Unbound Variable");
        }
        runtime.setAndCoerceProperty$Ex(simpleSymbol, simpleSymbol2, $latitude, Lit5);
        simpleSymbol = Lit49;
        simpleSymbol2 = Lit14;
        if ($longitude instanceof Package) {
            $longitude = runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit100), " is not bound in the current context"), "Unbound Variable");
        }
        runtime.setAndCoerceProperty$Ex(simpleSymbol, simpleSymbol2, $longitude, Lit5);
        return runtime.setAndCoerceProperty$Ex(Lit52, Lit20, Boolean.TRUE, Lit21);
    }

    static Object lambda37() {
        runtime.setAndCoerceProperty$Ex(Lit90, Lit104, "android.intend.action.VIEW", Lit5);
        runtime.setAndCoerceProperty$Ex(Lit90, Lit105, "com.google.android.apps.maps", Lit5);
        return runtime.setAndCoerceProperty$Ex(Lit90, Lit106, "com.google.android.apps.Maps.MapsActivity", Lit5);
    }

    static Object lambda38() {
        runtime.setAndCoerceProperty$Ex(Lit90, Lit104, "android.intend.action.VIEW", Lit5);
        runtime.setAndCoerceProperty$Ex(Lit90, Lit105, "com.google.android.apps.maps", Lit5);
        return runtime.setAndCoerceProperty$Ex(Lit90, Lit106, "com.google.android.apps.Maps.MapsActivity", Lit5);
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
        map = this;
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
        map closureEnv = this;
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
        Object apply2 = Scheme.apply.apply2(strings.string$Mnappend, Scheme.applyToArgs.apply3(map, misc.symbol$Mn$Grstring, LList.makeList(argsArray, 0)));
        try {
            return misc.string$To$Symbol((CharSequence) apply2);
        } catch (ClassCastException e) {
            throw new WrongType(e, "string->symbol", 1, apply2);
        }
    }

    static Object lambda2() {
        return null;
    }
}
