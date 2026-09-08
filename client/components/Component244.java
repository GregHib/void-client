/* Component244 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Component244
/**
 * RENAMED from `Class337` (JODE-obfuscated).
 * Evidence: root class; no distinctive extends/strings
 */ {
    private final GlToolkitSub2 aHa_Sub2_4173;
    static float[][] aFloatArrayArray4174 = {{-0.333333F, -0.333333F, -0.333333F}, {0.333333F, -0.333333F, -0.333333F}, {-0.333333F, 0.333333F, -0.333333F}, {0.333333F, 0.333333F, -0.333333F}, {-0.333333F, -0.333333F, 0.333333F}, {0.333333F, -0.333333F, 0.333333F}, {-0.333333F, 0.333333F, 0.333333F}, {0.333333F, 0.333333F, 0.333333F}};
    static int anInt4175;
    static int anInt4176;
    static Object anObject4177;
    long aLong4178;
    /**
     * Currently installed custom cursor def id, or {@code -1} for system pointer.
     * Written by {@link Component373#applyCustomCursor}; reset on canvas recreate.
     */
    static int currentCursorId = -1;
    static int anInt4180;

    public static void method2658(boolean bool) {
        aFloatArrayArray4174 = null;
        anObject4177 = null;
        if (bool != true) aFloatArrayArray4174 = null;
    }

    protected final void finalize() throws Throwable {
        aHa_Sub2_4173.method3769(this.aLong4178, false);
        anInt4175++;
        super.finalize();
    }

    Component244(GlToolkitSub2 var_ha_Sub2, long l, Component359[] class242s) {
        try {
            aHa_Sub2_4173 = var_ha_Sub2;
            this.aLong4178 = l;
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("dw.<init>(" + (var_ha_Sub2 != null ? "{...}" : "null") + ',' + l + ',' + (class242s != null ? "{...}" : "null") + ')'));
        }
    }

    static final boolean method2659(byte i, int i_0_, int i_1_) {
        int i_2_ = 24 % ((i - 76) / 42);
        anInt4176++;
        return (0x70000 & i_0_) != 0 | Node.method2709(i_1_, i_0_, -1) || Component118.method2187(i_0_, -84, i_1_);
    }

    static final Component383 method2660(byte i, Buffer class348_sub49) {
        anInt4180++;
        if (i != 26) return null;
        Component118 class288 = Component383.method2189(class348_sub49, i + 59);
        int i_3_ = class348_sub49.readSignedMedium((byte) 125);
        return new Component383(class288.anInt4958, class288.aClass221_4955, class288.aClass341_4952, class288.anInt4950, class288.anInt4951, i_3_);
    }
}
