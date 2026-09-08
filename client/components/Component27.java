/* Component27 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Component27
/**
 * RENAMED from `Class369` (JODE-obfuscated).
 * Evidence: root class; no distinctive extends/strings
 */ implements Interface12 {
    int anInt4959;
    static int anInt4960 = 0;
    int anInt4961;
    static Component184 aClass143_4962;
    int anInt4963;
    static int anInt4964;
    int anInt4965;
    int anInt4966;
    static int anInt4967;
    Component85 aClass221_4968;
    static int anInt4969;
    int anInt4970;
    int anInt4971;
    static boolean aBoolean4972 = false;
    DisplayModeManagerContainer196 aClass341_4973;

    public static void method3567(int i) {
        aClass143_4962 = null;
        int i_0_ = 105 % ((-15 - i) / 36);
    }

    static final void method3568(GraphicsToolkit var_ha, int i) {
        anInt4964++;
        Component49.aClass324_4684 = DisplayModeManagerContainer194.method232(var_ha, (byte) -53, true, LoadingState.p11FullGroupId);
        AbstractGlTextureSub1.aClass143_8527 = Component137.method1151(-25411, var_ha, LoadingState.p11FullGroupId);
        if (i != 4) aClass143_4962 = null;
        Applet_Sub1.aClass324_20 = DisplayModeManagerContainer194.method232(var_ha, (byte) -53, true, DisplayModeManagerContainer167.p12FullGroupId);
        Component163.aClass143_3179 = Component137.method1151(-25411, var_ha, DisplayModeManagerContainer167.p12FullGroupId);
        NodeList.aClass324_3326 = DisplayModeManagerContainer194.method232(var_ha, (byte) -53, true, ReferenceTable.b12FullGroupId);
        aClass143_4962 = Component137.method1151(-25411, var_ha, ReferenceTable.b12FullGroupId);
    }

    static final void method3569(int i, int i_1_) {
        anInt4969++;
        int i_2_ = 83 % ((i_1_ - -87) / 37);
        RSARequest class348_sub42_sub15 = FriendLoginMessage.method2516(i, (byte) 105, 4);
        class348_sub42_sub15.method3251(-16058);
    }

    public DisplayModeManagerContainer369 method51(byte i) {
        if (i < 116) return null;
        anInt4967++;
        return null;
    }

    Component27(Component85 class221, DisplayModeManagerContainer196 class341, int i, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_) {
        try {
            this.anInt4961 = i_8_;
            this.anInt4971 = i_4_;
            this.anInt4965 = i_7_;
            this.anInt4966 = i_6_;
            this.anInt4959 = i_3_;
            this.aClass341_4973 = class341;
            this.anInt4970 = i;
            this.aClass221_4968 = class221;
            this.anInt4963 = i_5_;
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("fn.<init>(" + (class221 != null ? "{...}" : "null") + ',' + (class341 != null ? "{...}" : "null") + ',' + i + ',' + i_3_ + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ')'));
        }
    }
}
