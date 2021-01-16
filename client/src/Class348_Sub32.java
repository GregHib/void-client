/* Class348_Sub32 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class348_Sub32 extends Class348 {
    private final Class123 aClass123_6927;
    private float[][] aFloatArrayArray6928;
    private final s_Sub2 aS_Sub2_6929;
    static int anInt6930 = 0;
    static int anInt6931;
    private Class356 aClass356_6932;
    static int anInt6933;
    private int anInt6934;
    private final int anInt6935;
    private Class348_Sub49 aClass348_Sub49_6936;
    private final Class348_Sub1 aClass348_Sub1_6937;
    static int anInt6938;
    static int anInt6939;
    private int anInt6940;
    static int anInt6941;
    private int anInt6942;
    private final Class123 aClass123_6943;
    private final int anInt6944;
    private final Interface8 anInterface8_6945;
    static Thread aThread6946;
    private float[][] aFloatArrayArray6947;
    private final int anInt6948;
    private float[][] aFloatArrayArray6949;
    static Class45 aClass45_6950;
    private final ha_Sub2 aHa_Sub2_6951;
    private final Interface2 anInterface2_6952;
    private Class348_Sub49_Sub1 aClass348_Sub49_Sub1_6953;

    static final void method3018(int i) {
        Class348_Sub18.anInt6818 = i;
    }

    private final void method3019(int i, int i_0_, int i_1_, int i_2_,
                                  int i_3_, byte i_4_, int i_5_) {
        anInt6933++;
        long l = -1L;
        int i_6_ = i_3_ - -(i_2_ << aS_Sub2_6929.anInt4588);
        int i_7_ = i + (i_5_ << aS_Sub2_6929.anInt4588);
        int i_8_ = aS_Sub2_6929.method3986(i_6_, i_7_, (byte) -17);
        if ((i_3_ & 0x7f) == 0 || (i & 0x7f) == 0) {
            l = ((long) i_7_ << -1366341936 & 65535L << 692063248
                    | 0xffffL & (long) i_6_);
            Class348 class348 = aClass356_6932.method3480(l, -6008);
            if (class348 != null) {
                method3022((byte) -46,
                        (((Class348_Sub29) class348)
                                .aShort6911));
                return;
            }
        }
        short i_9_ = (short) anInt6940++;
        if (l != -1L)
            aClass356_6932.method3483((byte) 107, l, new Class348_Sub29(i_9_));
        float f;
        float f_10_;
        float f_11_;
        if (i_3_ != 0 || i != 0) {
            if (aS_Sub2_6929.anInt4592 == i_3_
                    && i == 0) {
                f_10_ = aFloatArrayArray6928[1 + i_0_][i_1_];
                f_11_ = aFloatArrayArray6947[1 + i_0_][i_1_];
                f = aFloatArrayArray6949[1 + i_0_][i_1_];
            } else if (i_3_ != aS_Sub2_6929.anInt4592
                    || aS_Sub2_6929.anInt4592 != i) {
                if (i_3_ != 0 || aS_Sub2_6929.anInt4592 != i) {
                    float f_12_
                            = (float) i_3_ / (float) aS_Sub2_6929.anInt4592;
                    float f_13_
                            = (float) i / (float) aS_Sub2_6929.anInt4592;
                    float f_14_ = aFloatArrayArray6949[i_0_][i_1_];
                    float f_15_ = aFloatArrayArray6947[i_0_][i_1_];
                    float f_16_ = aFloatArrayArray6928[i_0_][i_1_];
                    float f_17_ = aFloatArrayArray6949[1 + i_0_][i_1_];
                    float f_18_ = aFloatArrayArray6947[i_0_ + 1][i_1_];
                    f_18_ += (aFloatArrayArray6947[1 + i_0_][1 + i_1_]
                            - f_18_) * f_12_;
                    f_17_ += f_12_ * (aFloatArrayArray6949[1 + i_0_][i_1_ - -1]
                            - f_17_);
                    f_16_ += ((aFloatArrayArray6928[i_0_][i_1_ - -1] - f_16_)
                            * f_12_);
                    float f_19_ = aFloatArrayArray6928[i_0_ + 1][i_1_];
                    f_15_ += f_12_ * (aFloatArrayArray6947[i_0_][1 + i_1_]
                            - f_15_);
                    f_14_ += f_12_ * (-f_14_
                            + aFloatArrayArray6949[i_0_][i_1_ + 1]);
                    f = f_14_ + (f_17_ - f_14_) * f_13_;
                    f_11_ = f_15_ + f_13_ * (-f_15_ + f_18_);
                    f_19_ += f_12_ * (-f_19_ + (aFloatArrayArray6928[i_0_ - -1]
                            [i_1_ + 1]));
                    f_10_ = f_16_ + f_13_ * (f_19_ - f_16_);
                } else {
                    f = aFloatArrayArray6949[i_0_][1 + i_1_];
                    f_10_ = aFloatArrayArray6928[i_0_][i_1_ - -1];
                    f_11_ = aFloatArrayArray6947[i_0_][1 + i_1_];
                }
            } else {
                f = aFloatArrayArray6949[1 + i_0_][1 + i_1_];
                f_10_ = aFloatArrayArray6928[1 + i_0_][1 + i_1_];
                f_11_ = aFloatArrayArray6947[i_0_ + 1][1 + i_1_];
            }
        } else {
            f = aFloatArrayArray6949[i_0_][i_1_];
            f_10_ = aFloatArrayArray6928[i_0_][i_1_];
            f_11_ = aFloatArrayArray6947[i_0_][i_1_];
        }
        float f_20_ = (float) (aClass348_Sub1_6937.method2724(-1) + -i_6_);
        float f_21_ = (float) (aClass348_Sub1_6937.method2722(120) + -i_8_);
        float f_22_
                = (float) (aClass348_Sub1_6937.method2717((byte) 107) + -i_7_);
        float f_23_ = (float) Math.sqrt(f_21_ * f_21_ + f_20_ * f_20_
                + f_22_ * f_22_);
        float f_24_ = 1.0F / f_23_;
        f_22_ *= f_24_;
        f_20_ *= f_24_;
        f_21_ *= f_24_;
        float f_25_ = f_23_ / (float) aClass348_Sub1_6937.method2723(-1);
        float f_26_ = -(f_25_ * f_25_) + 1.0F;
        if (f_26_ < 0.0F)
            f_26_ = 0.0F;
        float f_27_ = f_22_ * f_10_ + (f_21_ * f_11_ + f * f_20_);
        if (f_27_ < 0.0F)
            f_27_ = 0.0F;
        float f_28_ = 2.0F * (f_26_ * f_27_);
        if (f_28_ > 1.0F)
            f_28_ = 1.0F;
        int i_29_ = -108 % ((42 - i_4_) / 50);
        int i_30_ = aClass348_Sub1_6937.method2720(-1);
        int i_31_ = (int) ((float) ((i_30_ & 0xff081b) >> -649778736) * f_28_);
        if (i_31_ > 255)
            i_31_ = 255;
        int i_32_ = (int) ((float) (0xff & i_30_ >> 111442440) * f_28_);
        if (i_32_ > 255)
            i_32_ = 255;
        int i_33_ = (int) (f_28_ * (float) (0xff & i_30_));
        if (!aHa_Sub2_6951.aBoolean7775) {
            aClass348_Sub49_Sub1_6953.method3399(18291, (float) i_6_);
            aClass348_Sub49_Sub1_6953.method3399(18291, (float) i_8_);
            aClass348_Sub49_Sub1_6953.method3399(18291, (float) i_7_);
        } else {
            aClass348_Sub49_Sub1_6953.method3400((float) i_6_, (byte) -122);
            aClass348_Sub49_Sub1_6953.method3400((float) i_8_, (byte) -115);
            aClass348_Sub49_Sub1_6953.method3400((float) i_7_, (byte) -94);
        }
        if (i_33_ > 255)
            i_33_ = 255;
        aClass348_Sub49_Sub1_6953.method3378(false, i_31_);
        aClass348_Sub49_Sub1_6953.method3378(false, i_32_);
        aClass348_Sub49_Sub1_6953.method3378(false, i_33_);
        aClass348_Sub49_Sub1_6953.method3378(false, 255);
        method3022((byte) -46, i_9_);
    }

    public static void method3020(byte i) {
        if (i == -64) {
            aClass45_6950 = null;
            aThread6946 = null;
        }
    }

    static final int method3021(byte i, Class229 class229) {
        anInt6931++;
        if (class229 != Class328_Sub3.aClass229_6519) {
            if (Class167.aClass229_2207 == class229)
                return 8448;
            if (class229 == Class248.aClass229_3196)
                return 34165;
            if (Class348_Sub23_Sub2.aClass229_9011 == class229)
                return 260;
            if (class229 == Class348_Sub7.aClass229_6644)
                return 34023;
        } else
            return 7681;
        if (i != 32)
            method3021((byte) -21, null);
        throw new IllegalArgumentException();
    }

    private final void method3022(byte i, short i_34_) {
        anInt6939++;
        if (i == -46) {
            if (!aHa_Sub2_6951.aBoolean7775)
                aClass348_Sub49_6936.method3397(i + 135, i_34_);
            else
                aClass348_Sub49_6936.method3337((byte) 107, i_34_);
        }
    }

    final void method3023(boolean[][] bools, int i, int i_35_, int i_36_,
                          int i_37_) {
        anInt6941++;
        if (anInterface8_6945 != null && i_37_ + i_35_ >= anInt6935
                && anInt6942 >= i_35_ + -i_37_
                && i_36_ + i_37_ >= anInt6948
                && i_36_ + -i_37_ <= anInt6944) {
            for (int i_38_ = anInt6948;
                 i_38_ <= anInt6944; i_38_++) {
                for (int i_39_ = anInt6935; anInt6942 >= i_39_; i_39_++) {
                    int i_40_ = i_39_ - i_35_;
                    int i_41_ = -i_36_ + i_38_;
                    if (i_40_ > -i_37_ && i_37_ > i_40_
                            && i_41_ > -i_37_
                            && i_37_ > i_41_
                            && bools[i_40_ + i_37_][i_37_ + i_41_]) {
                        aHa_Sub2_6951.method3808
                                (((int) (255.0F
                                                * aClass348_Sub1_6937.method2721(-66))
                                                << -857818216),
                                        i + -136);
                        aHa_Sub2_6951.method3794(aClass123_6927,
                                aClass123_6943, i + -26666,
                                null, null);
                        aHa_Sub2_6951.method3759(anInt6934, -128, 4,
                                anInterface8_6945, 0);
                        return;
                    }
                }
            }
            if (i != 255)
                anInt6942 = 3;
        }
    }

    Class348_Sub32(ha_Sub2 var_ha_Sub2, s_Sub2 var_s_Sub2,
                   Class348_Sub1 class348_sub1, int[] is) {
        try {
            aS_Sub2_6929 = var_s_Sub2;
            aHa_Sub2_6951 = var_ha_Sub2;
            aClass348_Sub1_6937 = class348_sub1;
            int i = (aClass348_Sub1_6937.method2723(-1)
                    + -(var_s_Sub2.anInt4592 >> -2046904927));
            anInt6935 = (aClass348_Sub1_6937.method2724(-1) + -i
                    >> var_s_Sub2.anInt4588);
            anInt6942 = (aClass348_Sub1_6937.method2724(-1) - -i
                    >> var_s_Sub2.anInt4588);
            anInt6948 = (-i + aClass348_Sub1_6937.method2717((byte) 85)
                    >> var_s_Sub2.anInt4588);
            anInt6944 = (aClass348_Sub1_6937.method2717((byte) 99) + i
                    >> var_s_Sub2.anInt4588);
            int i_42_ = anInt6942 + -anInt6935 - -1;
            int i_43_ = 1 + -anInt6948 + anInt6944;
            aFloatArrayArray6928 = new float[i_42_ - -1][i_43_ + 1];
            aFloatArrayArray6949 = new float[i_42_ + 1][1 + i_43_];
            aFloatArrayArray6947 = new float[i_42_ - -1][1 + i_43_];
            for (int i_44_ = 0; i_43_ >= i_44_; i_44_++) {
                int i_45_ = i_44_ - -anInt6948;
                if (i_45_ > 0
                        && i_45_ < -1 + aS_Sub2_6929.anInt4590) {
                    for (int i_46_ = 0;
                         i_42_ >= i_46_;
                         i_46_++) {
                        int i_47_ = i_46_ - -anInt6935;
                        if (i_47_ > 0
                                && i_47_ < aS_Sub2_6929.anInt4587 + -1) {
                            int i_48_
                                    = (var_s_Sub2.method3982((byte) -86, i_45_,
                                    i_47_ + 1)
                                    - var_s_Sub2.method3982((byte) -86, i_45_,
                                    i_47_ + -1));
                            int i_49_
                                    = (var_s_Sub2.method3982((byte) -86, 1 + i_45_,
                                    i_47_)
                                    - var_s_Sub2.method3982((byte) -86,
                                    -1 + i_45_, i_47_));
                            float f
                                    = (float) (1.0
                                    / (Math.sqrt
                                    (i_48_ * i_48_
                                            + (65536
                                            - -(i_49_
                                            * i_49_)))));
                            aFloatArrayArray6949[i_46_][i_44_]
                                    = (float) i_48_ * f;
                            aFloatArrayArray6947[i_46_][i_44_] = -256.0F * f;
                            aFloatArrayArray6928[i_46_][i_44_]
                                    = f * (float) i_49_;
                        }
                    }
                }
            }
            int i_50_ = 0;
            for (int i_51_ = anInt6948; i_51_ <= anInt6944; i_51_++) {
                if (i_51_ < 0 || i_51_ >= var_s_Sub2.anInt4590)
                    i_50_ += anInt6942 - anInt6935;
                else {
                    for (int i_52_ = anInt6935; i_52_ <= anInt6942; i_52_++) {
                        if (i_52_ >= 0
                                && (i_52_ < var_s_Sub2.anInt4587)) {
                            int i_53_ = is[i_50_];
                            int[] is_54_
                                    = (var_s_Sub2
                                    .anIntArrayArrayArray8253[i_52_][i_51_]);
                            if (is_54_ != null && i_53_ != 0) {
                                if (i_53_ != 1)
                                    anInt6934 += 3;
                                else {
                                    int i_55_ = 0;
                                    while (i_55_ < is_54_.length) {
                                        if (is_54_[i_55_++] != -1
                                                && is_54_[i_55_++] != -1
                                                && (is_54_[i_55_++] != -1))
                                            anInt6934 += 3;
                                    }
                                }
                            }
                        }
                        i_50_++;
                    }
                }
            }
            if (anInt6934 > 0) {
                aClass348_Sub49_6936 = new Class348_Sub49(anInt6934 * 2);
                aClass348_Sub49_Sub1_6953
                        = new Class348_Sub49_Sub1(anInt6934 * 16);
                aClass356_6932
                        = new Class356(Class33.method340(anInt6934, (byte) 108));
                int i_56_ = 0;
                i_50_ = 0;
                for (int i_57_ = anInt6948;
                     anInt6944 >= i_57_;
                     i_57_++) {
                    if (i_57_ >= 0
                            && var_s_Sub2.anInt4590 > i_57_) {
                        int i_58_ = 0;
                        for (int i_59_ = anInt6935; i_59_ <= anInt6942;
                             i_59_++) {
                            if (i_59_ >= 0
                                    && (i_59_ < var_s_Sub2.anInt4587)) {
                                int i_60_ = is[i_50_];
                                int[] is_61_ = (var_s_Sub2
                                        .anIntArrayArrayArray8253
                                        [i_59_][i_57_]);
                                if (is_61_ != null && i_60_ != 0) {
                                    if (i_60_ != 1) {
                                        if (i_60_ != 3) {
                                            if (i_60_ != 2) {
                                                if (i_60_ != 5) {
                                                    if (i_60_ == 4) {
                                                        method3019
                                                                ((var_s_Sub2
                                                                                .anInt4592),
                                                                        i_58_, i_56_,
                                                                        i_59_, 0,
                                                                        (byte) -70,
                                                                        i_57_);
                                                        method3019(0, i_58_,
                                                                i_56_,
                                                                i_59_, 0,
                                                                (byte) 96,
                                                                i_57_);
                                                        method3019
                                                                ((var_s_Sub2
                                                                                .anInt4592),
                                                                        i_58_, i_56_,
                                                                        i_59_,
                                                                        (var_s_Sub2
                                                                                .anInt4592),
                                                                        (byte) 112,
                                                                        i_57_);
                                                    }
                                                } else {
                                                    method3019
                                                            ((var_s_Sub2
                                                                            .anInt4592),
                                                                    i_58_, i_56_, i_59_,
                                                                    (var_s_Sub2
                                                                            .anInt4592),
                                                                    (byte) 111, i_57_);
                                                    method3019((var_s_Sub2
                                                                    .anInt4592),
                                                            i_58_, i_56_,
                                                            i_59_, 0,
                                                            (byte) -83,
                                                            i_57_);
                                                    method3019(0, i_58_, i_56_,
                                                            i_59_,
                                                            (var_s_Sub2
                                                                    .anInt4592),
                                                            (byte) 125,
                                                            i_57_);
                                                }
                                            } else {
                                                method3019(0, i_58_, i_56_,
                                                        i_59_,
                                                        (var_s_Sub2
                                                                .anInt4592),
                                                        (byte) 119, i_57_);
                                                method3019((var_s_Sub2
                                                                .anInt4592),
                                                        i_58_, i_56_, i_59_,
                                                        (var_s_Sub2
                                                                .anInt4592),
                                                        (byte) -90, i_57_);
                                                method3019(0, i_58_, i_56_,
                                                        i_59_, 0,
                                                        (byte) -119, i_57_);
                                            }
                                        } else {
                                            method3019(0, i_58_, i_56_, i_59_,
                                                    0, (byte) -40, i_57_);
                                            method3019(0, i_58_, i_56_, i_59_,
                                                    (var_s_Sub2
                                                            .anInt4592),
                                                    (byte) 111, i_57_);
                                            method3019((var_s_Sub2
                                                            .anInt4592),
                                                    i_58_, i_56_, i_59_, 0,
                                                    (byte) -29, i_57_);
                                        }
                                    } else {
                                        int[] is_62_
                                                = (var_s_Sub2
                                                .anIntArrayArrayArray8268[i_59_]
                                                [i_57_]);
                                        int[] is_63_
                                                = (var_s_Sub2
                                                .anIntArrayArrayArray8234[i_59_]
                                                [i_57_]);
                                        int i_64_ = 0;
                                        while (i_64_ < is_61_.length) {
                                            if ((is_61_[i_64_] == -1)
                                                    || is_61_[1 + i_64_] == -1
                                                    || is_61_[2 + i_64_] == -1)
                                                i_64_ += 3;
                                            else {
                                                method3019(is_63_[i_64_],
                                                        i_58_, i_56_, i_59_,
                                                        is_62_[i_64_],
                                                        (byte) -94, i_57_);
                                                i_64_++;
                                                method3019(is_63_[i_64_],
                                                        i_58_, i_56_, i_59_,
                                                        is_62_[i_64_],
                                                        (byte) 97, i_57_);
                                                i_64_++;
                                                method3019(is_63_[i_64_],
                                                        i_58_, i_56_, i_59_,
                                                        is_62_[i_64_],
                                                        (byte) 104, i_57_);
                                                i_64_++;
                                            }
                                        }
                                    }
                                }
                            }
                            i_58_++;
                            i_50_++;
                        }
                    } else
                        i_50_ += anInt6942 - anInt6935;
                    i_56_++;
                }
                anInterface8_6945
                        = (aHa_Sub2_6951.method3733
                        (5123, -49,
                                aClass348_Sub49_6936.anInt7197,
                                aClass348_Sub49_6936.aByteArray7154,
                                false));
                anInterface2_6952
                        = aHa_Sub2_6951.method3731(2, false, 16,
                        (aClass348_Sub49_Sub1_6953
                                .aByteArray7154),
                        (aClass348_Sub49_Sub1_6953
                                .anInt7197));
                aClass123_6927 = new Class123(anInterface2_6952, 5126, 3, 0);
                aClass123_6943 = new Class123(anInterface2_6952, 5121, 4, 12);
            } else {
                anInterface2_6952 = null;
                anInterface8_6945 = null;
                aClass123_6927 = null;
                aClass123_6943 = null;
            }
            aClass348_Sub49_Sub1_6953 = null;
            aFloatArrayArray6949 = aFloatArrayArray6947
                    = aFloatArrayArray6928 = null;
            aClass348_Sub49_6936 = null;
            aClass356_6932 = null;
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929
                    (runtimeexception,
                            ("qw.<init>(" + (var_ha_Sub2 != null ? "{...}" : "null")
                                    + ',' + (var_s_Sub2 != null ? "{...}" : "null") + ','
                                    + (class348_sub1 != null ? "{...}" : "null") + ','
                                    + (is != null ? "{...}" : "null") + ')'));
        }
    }
}
