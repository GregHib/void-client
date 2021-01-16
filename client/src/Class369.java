/* Class369 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Class369 implements Interface12 {
    int anInt4959;
    static int anInt4960 = 0;
    int anInt4961;
    static Class143 aClass143_4962;
    int anInt4963;
    static int anInt4964;
    int anInt4965;
    int anInt4966;
    static int anInt4967;
    Class221 aClass221_4968;
    static int anInt4969;
    int anInt4970;
    int anInt4971;
    static boolean aBoolean4972 = false;
    Class341 aClass341_4973;

    public static void method3567(int i) {
        aClass143_4962 = null;
        int i_0_ = 105 % ((-15 - i) / 36);
    }

    static final void method3568(ha var_ha, int i) {
        anInt4964++;
        Class240.aClass324_4684 = Class14.method232(var_ha, (byte) -53, true, Class56.anInt1044);
        Class258_Sub1.aClass143_8527 = Class135.method1151(-25411, var_ha, Class56.anInt1044);
        if (i != 4) aClass143_4962 = null;
        Applet_Sub1.aClass324_20 = Class14.method232(var_ha, (byte) -53, true, Class17.anInt235);
        Class246.aClass143_3179 = Class135.method1151(-25411, var_ha, Class17.anInt235);
        Class262.aClass324_3326 = Class14.method232(var_ha, (byte) -53, true, Class291.anInt3736);
        aClass143_4962 = Class135.method1151(-25411, var_ha, Class291.anInt3736);
    }

    static final void method3569(int i, int i_1_) {
        anInt4969++;
        int i_2_ = 83 % ((i_1_ - -87) / 37);
        Class348_Sub42_Sub15 class348_sub42_sub15 = Class318_Sub9_Sub1.method2516(i, (byte) 105, 4);
        class348_sub42_sub15.method3251(-16058);
    }

    public Class223 method51(byte i) {
        if (i < 116) return null;
        anInt4967++;
        return null;
    }

    Class369(Class221 class221, Class341 class341, int i, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_) {
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
            throw Class348_Sub17.method2929(runtimeexception, ("fn.<init>(" + (class221 != null ? "{...}" : "null") + ',' + (class341 != null ? "{...}" : "null") + ',' + i + ',' + i_3_ + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ')'));
        }
    }
}
