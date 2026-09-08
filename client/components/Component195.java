/* Component195 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Component195
/**
 * RENAMED from `Class195` (JODE-obfuscated).
 * Evidence: root class; no distinctive extends/strings
 */ implements Interface16 {
    static int anInt5003;
    static int anInt5004;
    static int anInt5005;
    private final DisplayModeManagerContainer260 aClass287_5006;
    static int[] anIntArray5007 = new int[4];
    static int anInt5008;
    static int anInt5009;
    private GraphicsToolkit aHa5010;
    private boolean aBoolean5011;
    private final Interface1[] anInterface1Array5012;
    static boolean aBoolean5013 = false;
    static int anInt5014;
    static StringCache aClass351_5015;
    static int anInt5016 = 0;
    static ReflectionInvoker aClass297_5017;
    static int anInt5018;
    static int anInt5019;

    public static void method1447(int i) {
        if (i == 76) {
            anIntArray5007 = null;
            aClass297_5017 = null;
            aClass351_5015 = null;
        }
    }

    static final void method1448(int i) {
        anInt5003++;
        if (i <= -55) ImageDefinition.aMenuEntry_9144 = new MenuEntry((FriendsIgnoreList.aClass274_3487.getLocalized(ObjectDeserializer.languageId, 544)), "", Component149.widgetCursorId, 1004, -1, 0L, 0, 0, true, false, 0L, true);
    }

    public final void method57(int i) {
        anInt5004++;
        if (aHa5010 != NodeSub8.toolkit) {
            aHa5010 = NodeSub8.toolkit;
            aBoolean5011 = true;
        }
        aHa5010.GA(0);
        Interface1[] interface1s = anInterface1Array5012;
        for (int i_0_ = 0; interface1s.length > i_0_; i_0_++) {
            Interface1 interface1 = interface1s[i_0_];
            if (interface1 != null) interface1.method7(10286);
        }
        if (i <= 84) method56((byte) 2, 40L);
    }

    public final void method58(boolean bool, int i) {
        anInt5018++;
        bool = true;
        Interface1[] interface1s = anInterface1Array5012;
        for (int i_1_ = 0; interface1s.length > i_1_; i_1_++) {
            Interface1 interface1 = interface1s[i_1_];
            if (interface1 != null) interface1.method9((byte) -49, bool || aBoolean5011);
        }
        if (i > -69) method1447(-38);
        aBoolean5011 = false;
    }

    public final void method59(int i) {
        anInt5008++;
        if (i != -9719) aClass351_5015 = null;
    }

    public final int method55(byte i) {
        anInt5009++;
        if (i != -58) method58(false, -122);
        return aClass287_5006.anInt3687;
    }

    static final Component3 method1449(int i, int i_2_, int i_3_) {
        Component186 class357 = Component335.aClass357ArrayArrayArray2029[i][i_2_][i_3_];
        if (class357 == null) return null;
        return class357.aClass148_4396;
    }

    public final boolean method56(byte i, long l) {
        try {
            anInt5005++;
            if (i < 30) method1449(-81, 10, -115);
            return l - -(long) aClass287_5006.anInt3690 <= Component240.currentTimeMillis(-97);
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, "qt.I(" + i + ',' + l + ')');
        }
    }

    Component195(DisplayModeManagerContainer260 class287, KeyStoreLoader class106) {
        try {
            aClass287_5006 = class287;
            anInterface1Array5012 = new Interface1[(aClass287_5006.anInterface12Array3688).length];
            for (int i = 0; (i < anInterface1Array5012.length); i++)
                anInterface1Array5012[i] = class106.createProvider(true, (aClass287_5006.anInterface12Array3688[i]));
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("qt.<init>(" + (class287 != null ? "{...}" : "null") + ',' + (class106 != null ? "{...}" : "null") + ')'));
        }
    }

    public final int method60(int i) {
        if (i != -19079) method58(false, 116);
        anInt5014++;
        int i_4_ = 0;
        Interface1[] interface1s = anInterface1Array5012;
        for (int i_5_ = 0; interface1s.length > i_5_; i_5_++) {
            Interface1 interface1 = interface1s[i_5_];
            if (interface1 == null || interface1.method8((byte) -121)) i_4_++;
        }
        return i_4_ * 100 / anInterface1Array5012.length;
    }

    static {
        aClass351_5015 = new StringCache(76, 4);
        anInt5019 = 0;
    }
}
