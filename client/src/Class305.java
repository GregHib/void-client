/* Class305 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;

final class Class305 {
    private int anInt3852;
    private int anInt3853;
    private int anInt3854;
    static int anInt3855;
    static int anInt3856;
    private boolean aBoolean3857 = true;
    private int anInt3858;
    private int anInt3859 = -1;
    static int anInt3860;
    static int anInt3861;
    private Class72[] aClass72Array3862;
    private int anInt3863;
    static int anInt3864;
    private Class72[] aClass72Array3865;
    private int anInt3866;
    private Class105 aClass105_3867;
    static int anInt3868;
    static Canvas aCanvas3869;
    static boolean aBoolean3870 = false;
    private Class72 aClass72_3871;

    final boolean method2292(int i, ha var_ha, int i_0_) {
        if ((i_0_ ^ 0xffffffff) != (anInt3859 ^ 0xffffffff)) {
            anInt3859 = i_0_;
            int i_1_ = Class348_Sub40_Sub1.method3051(i_0_, 4096);
            if (i_1_ > 512)
                i_1_ = 512;
            if ((i_1_ ^ 0xffffffff) >= -1)
                i_1_ = 1;
            if ((anInt3863 ^ 0xffffffff) != (i_1_ ^ 0xffffffff)) {
                aClass105_3867 = null;
                anInt3863 = i_1_;
            }
            if (aClass72Array3862 != null) {
                anInt3852 = 0;
                int[] is = new int[aClass72Array3862.length];
                for (int i_2_ = 0; aClass72Array3862.length > i_2_; i_2_++) {
                    Class72 class72 = aClass72Array3862[i_2_];
                    if (class72.method733(anInt3866, anInt3854, anInt3853,
                            anInt3859)) {
                        is[anInt3852] = ((Class72) class72).anInt1232;
                        aClass72Array3865[anInt3852++] = class72;
                    }
                }
                Class279.method2092(-1 + anInt3852, 0, is, -120,
                        aClass72Array3865);
            }
            aBoolean3857 = true;
        }
        anInt3856++;
        if (i <= 27)
            anInt3853 = -98;
        boolean bool = false;
        if (aBoolean3857) {
            aBoolean3857 = false;
            for (int i_3_ = -1 + anInt3852; (i_3_ ^ 0xffffffff) <= -1;
                 i_3_--) {
                boolean bool_4_
                        = aClass72Array3865[i_3_].method736(var_ha, aClass72_3871);
                bool |= bool_4_;
                Class305 class305_5_ = this;
                class305_5_.aBoolean3857 = class305_5_.aBoolean3857 | !bool_4_;
            }
        }
        return bool;
    }

    final void method2293(int i, ha var_ha, byte i_6_, int i_7_, int i_8_,
                          int i_9_, int i_10_, int i_11_, int i_12_,
                          int i_13_) {
        i_10_ = 0x3fff & i + i_10_;
        anInt3860++;
        if ((anInt3858 ^ 0xffffffff) != 0 && (anInt3863 ^ 0xffffffff) != -1) {
            Class12 class12 = Class101_Sub1.aD5684.method3(anInt3858, -6662);
            if (aClass105_3867 == null
                    && Class101_Sub1.aD5684.method4(-7953, anInt3858)) {
                int[] is = ((((Class12) class12).anInt200 ^ 0xffffffff) == -3
                        ? Class101_Sub1.aD5684.method6(-21540, anInt3863,
                        0.7F, anInt3858,
                        false, anInt3863)
                        : Class101_Sub1.aD5684.method5(false, anInt3858,
                        0.7F, anInt3863,
                        anInt3863, -119));
                aClass105_3867 = var_ha.method3662(anInt3863, is, (byte) 94, 0,
                        anInt3863, anInt3863);
            }
            if ((((Class12) class12).anInt200 ^ 0xffffffff) == -3)
                var_ha.aa(i_7_, i_9_, i_8_, i_13_, i_12_, 0);
            if (aClass105_3867 != null) {
                int i_14_ = ((Class12) class12).anInt200 == 2 ? 1 : 0;
                int i_15_ = i_13_ * i_11_ / -4096;
                int i_16_;
                for (i_16_ = (-i_13_ + i_8_) / 2 + i_13_ * i_10_ / 4096;
                     i_13_ < i_16_; i_16_ -= i_13_) {
                    /* empty */
                }
                for (/**/; i_16_ < 0; i_16_ += i_13_) {
                    /* empty */
                }
                for (/**/; i_13_ < i_15_; i_15_ -= i_13_) {
                    /* empty */
                }
                for (/**/; i_15_ < 0; i_15_ += i_13_) {
                    /* empty */
                }
                for (int i_17_ = -i_13_ + i_16_;
                     (i_17_ ^ 0xffffffff) > (i_8_ ^ 0xffffffff);
                     i_17_ += i_13_) {
                    for (int i_18_ = i_15_ + -i_13_;
                         (i_13_ ^ 0xffffffff) < (i_18_ ^ 0xffffffff);
                         i_18_ += i_13_)
                        aClass105_3867.method970(i_7_ + i_17_, i_18_ + i_9_,
                                i_13_, i_13_, 1, 0, i_14_);
                }
            }
        } else
            var_ha.aa(i_7_, i_9_, i_8_, i_13_, i_12_, 0);
        for (int i_19_ = -1 + anInt3852; i_19_ >= 0; i_19_--)
            aClass72Array3865[i_19_].method737(var_ha, i_7_, i_9_, i_8_, i_13_,
                    i_11_, i_10_);
        int i_20_ = 103 % ((i_6_ - 14) / 32);
    }

    public static void method2294(int i) {
        aCanvas3869 = null;
        if (i <= 94)
            method2296(-107);
    }

    final void method2295(byte i) {
        anInt3864++;
        if (aClass72Array3862 != null) {
            for (int i_21_ = 0; aClass72Array3862.length > i_21_; i_21_++)
                aClass72Array3862[i_21_].method734();
        }
        aClass105_3867 = null;
        if (i != 96)
            method2292(-84, null, 73);
    }

    static final void method2296(int i) {
        anInt3868++;
        if (i < -46) {
            for (int i_22_ = 0; (i_22_ ^ 0xffffffff) > -101; i_22_++)
                Class318_Sub2.aClass147Array6400[i_22_] = null;
            za_Sub1.anInt9774 = 0;
        }
    }

    Class305(int i, Class72[] class72s, int i_23_, int i_24_, int i_25_,
             int i_26_) {
        anInt3853 = i_26_;
        anInt3858 = i;
        aClass72Array3862 = class72s;
        anInt3854 = i_25_;
        anInt3866 = i_24_;
        if (class72s == null) {
            aClass72Array3865 = null;
            aClass72_3871 = null;
        } else {
            aClass72Array3865 = new Class72[class72s.length];
            aClass72_3871 = i_23_ < 0 ? null : class72s[i_23_];
        }
    }
}
