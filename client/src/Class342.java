/* Class342 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;

final class Class342 {
    int anInt4238;
    int anInt4239;
    int anInt4240;
    static int anInt4241;
    static int anInt4242;
    static int anInt4243;
    int anInt4244;
    int anInt4245;
    static Class364 aClass364_4246 = new Class364("WTI", 5);
    static Class70 aClass70_4247;
    Class342 aClass342_4248;
    static Image anImage4249;
    static int[] anIntArray4250 = new int[64];
    static int anInt4251;
    Class101 aClass101_4252;
    static int[][] anIntArrayArray4253;
    static Class60 aClass60_4254;

    public static void method2682(int i) {
        aClass364_4246 = null;
        anIntArrayArray4253 = null;
        if (i > 5) {
            aClass70_4247 = null;
            anIntArray4250 = null;
            aClass60_4254 = null;
            anImage4249 = null;
        }
    }

    static final void method2683
            (Class323 class323, Class348_Sub21 class348_sub21, int i, int i_0_,
             int i_1_, ha var_ha, int i_2_, int i_3_, Class42 class42) {
        try {
            if (i_0_ == 64) {
                anInt4242++;
                int i_4_ = -5 + i - i_3_ / 2;
                int i_5_ = i_2_ - -2;
                if (class42.anInt602 != 0)
                    var_ha.method3675(i_3_ + 10, (byte) -125, i_4_, i_5_,
                            (i_2_ - -(class323.method2565() * i_1_)
                                    - (i_5_ - 1)),
                            class42.anInt602);
                if ((class42.anInt604 ^ 0xffffffff) != -1)
                    var_ha.method3668(i_3_ + 10, i_5_,
                            class42.anInt604, i_4_,
                            (i_1_ * class323.method2565() + i_2_
                                    - (i_5_ + -1)),
                            92);
                int i_6_ = class42.anInt580;
                if (class348_sub21.aBoolean6848
                        && class42.anInt567 != -1)
                    i_6_ = class42.anInt567;
                for (int i_7_ = 0; (i_7_ ^ 0xffffffff) > (i_1_ ^ 0xffffffff);
                     i_7_++) {
                    String string = ha_Sub3.aStringArray8019[i_7_];
                    if (-1 + i_1_ > i_7_)
                        string = string.substring(0, -4 + string.length());
                    class323.method2563(var_ha, string, i, i_2_, i_6_, true);
                    i_2_ += class323.method2565();
                }
            }
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929
                    (runtimeexception,
                            ("eca.A(" + (class323 != null ? "{...}" : "null") + ','
                                    + (class348_sub21 != null ? "{...}" : "null") + ',' + i
                                    + ',' + i_0_ + ',' + i_1_ + ','
                                    + (var_ha != null ? "{...}" : "null") + ',' + i_2_
                                    + ',' + i_3_ + ','
                                    + (class42 != null ? "{...}" : "null") + ')'));
        }
    }

    static final float method2684(int i, float f) {
        if (i != 6)
            aClass70_4247 = null;
        anInt4251++;
        return (f * (6.0F * f - 15.0F) + 10.0F) * (f * (f * f));
    }

    final Class174 method2685(byte i) {
        if (i != -13)
            method2683(null, null, -120, 35, -33, null, 90, 71, null);
        anInt4243++;
        return Class256.method1943(false, this.anInt4245);
    }

    static final void method2686() {
        for (int i = Canvas_Sub1.anInt67; i < Class189.anInt2524; i++) {
            for (int i_8_ = 0; i_8_ < Class318_Sub7.anInt6451; i_8_++) {
                for (int i_9_ = 0; i_9_ < Class348_Sub41.anInt7054; i_9_++) {
                    Class357 class357
                            = Class147.aClass357ArrayArrayArray2029[i][i_8_][i_9_];
                    if (class357 != null) {
                        Class318_Sub1_Sub4 class318_sub1_sub4
                                = class357.aClass318_Sub1_Sub4_4406;
                        Class318_Sub1_Sub4 class318_sub1_sub4_10_
                                = class357.aClass318_Sub1_Sub4_4403;
                        if (class318_sub1_sub4 != null
                                && class318_sub1_sub4.method2388(-121)) {
                            Class318_Sub9_Sub2.method2519(class318_sub1_sub4,
                                    i, i_8_, i_9_, 1, 1);
                            if (class318_sub1_sub4_10_ != null
                                    && class318_sub1_sub4_10_.method2388(-125)) {
                                Class318_Sub9_Sub2.method2519
                                        (class318_sub1_sub4_10_, i, i_8_, i_9_, 1,
                                                1);
                                class318_sub1_sub4_10_.method2380
                                        (Class9.aHa171, 0, false,
                                                class318_sub1_sub4, 0, (byte) -110, 0);
                                class318_sub1_sub4_10_.method2392(true);
                            }
                            class318_sub1_sub4.method2392(true);
                        }
                        for (Class148 class148
                             = class357.aClass148_4396;
                             class148 != null;
                             class148 = class148.aClass148_2038) {
                            Class318_Sub1_Sub3 class318_sub1_sub3
                                    = (class148
                                    .aClass318_Sub1_Sub3_2040);
                            if (class318_sub1_sub3 != null
                                    && class318_sub1_sub3.method2388(-71)) {
                                Class318_Sub9_Sub2.method2519
                                        (class318_sub1_sub3, i, i_8_, i_9_,
                                                (class318_sub1_sub3.aShort8751
                                                        - class318_sub1_sub3.aShort8743
                                                        + 1),
                                                (class318_sub1_sub3.aShort8747
                                                        - class318_sub1_sub3.aShort8750
                                                        + 1));
                                class318_sub1_sub3.method2392(true);
                            }
                        }
                        Class318_Sub1_Sub1 class318_sub1_sub1
                                = class357.aClass318_Sub1_Sub1_4402;
                        if (class318_sub1_sub1 != null
                                && class318_sub1_sub1.method2388(-85)) {
                            Class262.method1992(class318_sub1_sub1, i, i_8_,
                                    i_9_);
                            class318_sub1_sub1.method2392(true);
                        }
                    }
                }
            }
        }
    }

    final Class342 method2687(byte i, int i_11_) {
        anInt4241++;
        if (i < 61)
            return null;
        return new Class342(this.anInt4245, i_11_);
    }

    Class342(int i, int i_12_) {
        this.anInt4245 = i;
        this.anInt4244 = i_12_;
    }

    static {
        aClass70_4247 = new Class70();
        aClass60_4254 = new Class60(32);
    }
}
