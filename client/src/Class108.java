/* Class108 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class108 {
    static int anInt1656 = 0;
    static Class364 aClass364_1657 = new Class364("WTWIP", 3);
    static int anInt1658;
    static int anInt1659;
    static int anInt1660;
    static boolean aBoolean1661 = true;
    static Class304 aClass304_1662 = new Class304(4);
    static int anInt1663;
    static Class105 aClass105_1664;

    static final float method1012(float f, float f_0_, float f_1_, float f_2_, int i, float f_3_, byte i_4_, float f_5_) {
        anInt1659++;
        float f_6_ = 0.0F;
        float f_7_ = -f_3_ + f_0_;
        float f_8_ = -f + f_5_;
        float f_9_ = -f_1_ + f_2_;
        if (i_4_ < 99) method1015(-13, -42, false);
        float f_10_ = 0.0F;
        float f_11_ = 0.0F;
        float f_12_ = 0.0F;
        while (f_6_ < 1.1F) {
            float f_13_ = f_7_ * f_6_ + f_3_;
            float f_14_ = f + f_6_ * f_8_;
            float f_15_ = f_1_ + f_9_ * f_6_;
            int i_16_ = (int) f_13_ >> 9;
            int i_17_ = (int) f_15_ >> 9;
            if (i_16_ > 0 && i_17_ > 0 && Class367_Sub4.anInt7319 > i_16_ && (i_17_ < Class348_Sub40_Sub3.anInt9109)) {
                int i_18_ = (Class132.aPlayer_1907.plane);
                if (i_18_ < 3 && ((Class348_Sub33.aByteArrayArrayArray6962[1][i_16_][i_17_]) & 0x2) != 0) i_18_++;
                int i_19_ = Class348_Sub1_Sub1.aSArray8801[i_18_].method3986((int) f_13_, (int) f_15_, (byte) 109);
                if (f_14_ > (float) i_19_) {
                    if (i < 2) return f_6_;
                    return (f_6_ - 0.1F + method1012(f_11_, f_13_, f_12_, f_15_, i - 1, f_10_, (byte) 122, f_14_) * 0.1F);
                }
            }
            f_10_ = f_13_;
            f_11_ = f_14_;
            f_6_ += 0.1F;
            f_12_ = f_15_;
        }
        return -1.0F;
    }

    public static void method1013(byte i) {
        aClass364_1657 = null;
        if (i < 111) method1013((byte) 17);
        aClass304_1662 = null;
        aClass105_1664 = null;
    }

    static final void method1014(int i) {
        anInt1660++;
        for (Class348_Sub42_Sub6 class348_sub42_sub6 = (Class348_Sub42_Sub6) r_Sub2.aClass262_10492.method1995(4); class348_sub42_sub6 != null; class348_sub42_sub6 = ((Class348_Sub42_Sub6) r_Sub2.aClass262_10492.method1990((byte) 55))) {
            Class318_Sub1_Sub3_Sub4 class318_sub1_sub3_sub4 = (class348_sub42_sub6.aClass318_Sub1_Sub3_Sub4_9538);
            if (class318_sub1_sub3_sub4.aBoolean10345) {
                class348_sub42_sub6.method2715((byte) 76);
                class318_sub1_sub3_sub4.method2466(false);
            } else if (Class367_Sub11.anInt7396 >= (class318_sub1_sub3_sub4.anInt10349)) {
                class318_sub1_sub3_sub4.method2470(Class348_Sub51.anInt7267, (byte) -16);
                if (class318_sub1_sub3_sub4.aBoolean10345) class348_sub42_sub6.method2715((byte) 42);
                else Class89.method850(class318_sub1_sub3_sub4, true);
            }
        }
        if (i != -4) aBoolean1661 = false;
    }

    static final void method1015(int i, int i_20_, boolean bool) {
        anInt1658++;
        Class190 class190 = Class262.aClass190ArrayArray3335[i][i_20_];
        if (class190 != null) {
            Class196.anInt2601 = class190.anInt2535;
            Class21.anInt325 = class190.anInt2538;
            Class318_Sub1_Sub3_Sub1.anInt10023 = class190.anInt2548;
        }
        Class348_Sub23_Sub4.method2988(bool);
    }
}
