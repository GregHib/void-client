/* Class237 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Class237 {
    static int anInt3102;
    static boolean aBoolean3103 = false;
    byte[][][] aByteArrayArrayArray3104;
    static int anInt3105;
    static int anInt3106;
    static int anInt3107;
    byte[][][] aByteArrayArrayArray3108;
    boolean aBoolean3109;
    static int anInt3110;
    static int anInt3111;
    static int anInt3112;
    private final byte[][][] aByteArrayArrayArray3113;
    int anInt3114;
    static int anInt3115;
    static int anInt3116;
    int anInt3117;
    static int anInt3118;
    private final Class268 aClass268_3119;
    private final Class183 aClass183_3120;
    static int anInt3121;
    int[][][] anIntArrayArrayArray3122;
    private final byte[][][] aByteArrayArrayArray3123;
    private final int[] anIntArray3124;
    static int anInt3125;
    private final byte[][][] aByteArrayArrayArray3126;
    static int anInt3127;
    private final int[] anIntArray3128 = {0, 0, 0, 256, 512, 512, 512, 256, 256, 384, 128, 128, 256};
    private final byte[][][] aByteArrayArrayArray3129;
    int anInt3130;
    static int anInt3131;

    private final void method1675(int i, int i_0_, byte[][] is, int i_1_, byte[][] is_2_, int i_3_, Class277 class277, Class22 class22, boolean[] bools, int i_4_, byte[][] is_5_, int i_6_, int i_7_, ha var_ha) {
        do {
            try {
                anInt3112++;
                boolean[] bools_8_ = (class277 != null && class277.aBoolean3560 ? Class50_Sub1.aBooleanArrayArray5225[i_7_] : Class265.aBooleanArrayArray4693[i_7_]);
                if (i_1_ > 0) {
                    if (i > 0) {
                        int i_9_ = is_5_[i + -1][i_1_ - 1] & 0xff;
                        if (i_9_ > 0) {
                            Class277 class277_10_ = aClass268_3119.method2034(i_9_ - 1, false);
                            if (class277_10_.anInt3563 != -1 && class277_10_.aBoolean3560) {
                                byte i_11_ = is[-1 + i][i_1_ - 1];
                                int i_12_ = 4 + is_2_[i + -1][-1 + i_1_] * 2 & 0x7;
                                int i_13_ = (Class348_Sub42_Sub17.method3266(var_ha, 127, class277_10_));
                                if (Class160.aBooleanArrayArray2133[i_11_][i_12_]) {
                                    Class348_Sub15.anIntArray6775[0] = class277_10_.anInt3563;
                                    Class348_Sub40_Sub38.anIntArray9480[0] = i_13_;
                                    Class223.anIntArray2899[0] = class277_10_.anInt3575;
                                    Class348_Sub6.anIntArray6631[0] = class277_10_.anInt3570;
                                    Class306.anIntArray3873[0] = class277_10_.anInt3564;
                                    Class180.anIntArray2370[0] = 256;
                                }
                            }
                        }
                    }
                    if (i < i_6_ + -1) {
                        int i_14_ = 0xff & is_5_[1 + i][i_1_ - 1];
                        if (i_14_ > 0) {
                            Class277 class277_15_ = aClass268_3119.method2034(i_14_ - 1, false);
                            if (class277_15_.anInt3563 != -1 && class277_15_.aBoolean3560) {
                                byte i_16_ = is[i + 1][-1 + i_1_];
                                int i_17_ = 0x7 & 2 * is_2_[1 + i][i_1_ + -1] + 6;
                                int i_18_ = (Class348_Sub42_Sub17.method3266(var_ha, 125, class277_15_));
                                if (Class160.aBooleanArrayArray2133[i_16_][i_17_]) {
                                    Class348_Sub15.anIntArray6775[2] = class277_15_.anInt3563;
                                    Class348_Sub40_Sub38.anIntArray9480[2] = i_18_;
                                    Class223.anIntArray2899[2] = class277_15_.anInt3575;
                                    Class348_Sub6.anIntArray6631[2] = class277_15_.anInt3570;
                                    Class306.anIntArray3873[2] = class277_15_.anInt3564;
                                    Class180.anIntArray2370[2] = 512;
                                }
                            }
                        }
                    }
                }
                if (i_3_ + i_0_ > i_1_) {
                    if (i > 0) {
                        int i_19_ = is_5_[-1 + i][1 + i_1_] & 0xff;
                        if (i_19_ > 0) {
                            Class277 class277_20_ = aClass268_3119.method2034(-1 + i_19_, false);
                            if (class277_20_.anInt3563 != -1 && class277_20_.aBoolean3560) {
                                byte i_21_ = is[-1 + i][1 + i_1_];
                                int i_22_ = 2 * is_2_[-1 + i][1 + i_1_] + 2 & 0x7;
                                int i_23_ = (Class348_Sub42_Sub17.method3266(var_ha, i_3_ ^ ~0x7c, class277_20_));
                                if (Class160.aBooleanArrayArray2133[i_21_][i_22_]) {
                                    Class348_Sub15.anIntArray6775[6] = class277_20_.anInt3563;
                                    Class348_Sub40_Sub38.anIntArray9480[6] = i_23_;
                                    Class223.anIntArray2899[6] = class277_20_.anInt3575;
                                    Class348_Sub6.anIntArray6631[6] = class277_20_.anInt3570;
                                    Class306.anIntArray3873[6] = class277_20_.anInt3564;
                                    Class180.anIntArray2370[6] = 64;
                                }
                            }
                        }
                    }
                    if (i < i_6_ - 1) {
                        int i_24_ = is_5_[i - -1][i_1_ + 1] & 0xff;
                        if (i_24_ > 0) {
                            Class277 class277_25_ = aClass268_3119.method2034(-1 + i_24_, false);
                            if (class277_25_.anInt3563 != -1 && class277_25_.aBoolean3560) {
                                byte i_26_ = is[1 + i][i_1_ - -1];
                                int i_27_ = 0x7 & /*--*/(is_2_[i - -1][1 + i_1_] * 2);
                                int i_28_ = (Class348_Sub42_Sub17.method3266(var_ha, i_3_ + 127, class277_25_));
                                if (Class160.aBooleanArrayArray2133[i_26_][i_27_]) {
                                    Class348_Sub15.anIntArray6775[4] = class277_25_.anInt3563;
                                    Class348_Sub40_Sub38.anIntArray9480[4] = i_28_;
                                    Class223.anIntArray2899[4] = class277_25_.anInt3575;
                                    Class348_Sub6.anIntArray6631[4] = class277_25_.anInt3570;
                                    Class306.anIntArray3873[4] = class277_25_.anInt3564;
                                    Class180.anIntArray2370[4] = 128;
                                }
                            }
                        }
                    }
                }
                if (i_1_ > 0) {
                    int i_29_ = 0xff & is_5_[i][i_1_ + -1];
                    if (i_29_ > 0) {
                        Class277 class277_30_ = aClass268_3119.method2034(-1 + i_29_, false);
                        if (class277_30_.anInt3563 != -1) {
                            byte i_31_ = is[i][-1 + i_1_];
                            int i_32_ = is_2_[i][i_1_ - 1];
                            if (class277_30_.aBoolean3560) {
                                int i_33_ = 2;
                                int i_34_ = 4 + i_32_ * 2;
                                int i_35_ = (Class348_Sub42_Sub17.method3266(var_ha, 125, class277_30_));
                                for (int i_36_ = 0; i_36_ < 3; i_36_++) {
                                    i_33_ &= 0x7;
                                    i_34_ = 0x7 & i_34_;
                                    if ((Class160.aBooleanArrayArray2133[i_31_][i_34_]) && (Class306.anIntArray3873[i_33_] <= (class277_30_.anInt3564))) {
                                        Class348_Sub15.anIntArray6775[i_33_] = (class277_30_.anInt3563);
                                        Class348_Sub40_Sub38.anIntArray9480[i_33_] = i_35_;
                                        Class223.anIntArray2899[i_33_] = (class277_30_.anInt3575);
                                        Class348_Sub6.anIntArray6631[i_33_] = (class277_30_.anInt3570);
                                        if (Class306.anIntArray3873[i_33_] != (class277_30_.anInt3564)) Class180.anIntArray2370[i_33_] = 32;
                                        else Class180.anIntArray2370[i_33_] = (Class273.method2057((Class180.anIntArray2370[i_33_]), 32));
                                        Class306.anIntArray3873[i_33_] = (class277_30_.anInt3564);
                                    }
                                    i_34_++;
                                    i_33_--;
                                }
                                if (!bools_8_[0x3 & i_4_]) bools[0] = (Class50_Sub1.aBooleanArrayArray5225[i_31_][Class139.method1166(i_32_ + 2, 3)]);
                            } else if (!bools_8_[0x3 & i_4_]) bools[0] = (Class265.aBooleanArrayArray4693[i_31_][Class139.method1166(3, i_32_ + 2)]);
                        }
                    }
                }
                if (i_1_ < -1 + i_0_) {
                    int i_37_ = is_5_[i][i_1_ - -1] & 0xff;
                    if (i_37_ > 0) {
                        Class277 class277_38_ = aClass268_3119.method2034(-1 + i_37_, false);
                        if (class277_38_.anInt3563 != -1) {
                            byte i_39_ = is[i][i_1_ + 1];
                            int i_40_ = is_2_[i][i_1_ - -1];
                            if (class277_38_.aBoolean3560) {
                                int i_41_ = 4;
                                int i_42_ = 2 * i_40_ + 2;
                                int i_43_ = (Class348_Sub42_Sub17.method3266(var_ha, 124, class277_38_));
                                for (int i_44_ = 0; i_44_ < 3; i_44_++) {
                                    i_41_ &= 0x7;
                                    i_42_ = 0x7 & i_42_;
                                    if ((Class160.aBooleanArrayArray2133[i_39_][i_42_]) && ((class277_38_.anInt3564) >= Class306.anIntArray3873[i_41_])) {
                                        Class348_Sub15.anIntArray6775[i_41_] = (class277_38_.anInt3563);
                                        Class348_Sub40_Sub38.anIntArray9480[i_41_] = i_43_;
                                        Class223.anIntArray2899[i_41_] = (class277_38_.anInt3575);
                                        Class348_Sub6.anIntArray6631[i_41_] = (class277_38_.anInt3570);
                                        if (Class306.anIntArray3873[i_41_] != (class277_38_.anInt3564)) Class180.anIntArray2370[i_41_] = 16;
                                        else Class180.anIntArray2370[i_41_] = (Class273.method2057((Class180.anIntArray2370[i_41_]), 16));
                                        Class306.anIntArray3873[i_41_] = (class277_38_.anInt3564);
                                    }
                                    i_42_--;
                                    i_41_++;
                                }
                                if (!bools_8_[0x3 & i_4_ + 2]) bools[2] = (Class50_Sub1.aBooleanArrayArray5225[i_39_][Class139.method1166(3, --i_40_)]);
                            } else if (!bools_8_[0x3 & 2 + i_4_]) bools[2] = (Class265.aBooleanArrayArray4693[i_39_][Class139.method1166(3, i_40_)]);
                        }
                    }
                }
                if (i > 0) {
                    int i_45_ = 0xff & is_5_[i + -1][i_1_];
                    if (i_45_ > 0) {
                        Class277 class277_46_ = aClass268_3119.method2034(-1 + i_45_, false);
                        if (class277_46_.anInt3563 != -1) {
                            byte i_47_ = is[-1 + i][i_1_];
                            int i_48_ = is_2_[-1 + i][i_1_];
                            if (class277_46_.aBoolean3560) {
                                int i_49_ = 6;
                                int i_50_ = 2 * i_48_ + 4;
                                int i_51_ = (Class348_Sub42_Sub17.method3266(var_ha, 127, class277_46_));
                                for (int i_52_ = 0; i_52_ < 3; i_52_++) {
                                    i_50_ &= 0x7;
                                    i_49_ = 0x7 & i_49_;
                                    if ((Class160.aBooleanArrayArray2133[i_47_][i_50_]) && (Class306.anIntArray3873[i_49_] <= (class277_46_.anInt3564))) {
                                        Class348_Sub15.anIntArray6775[i_49_] = (class277_46_.anInt3563);
                                        Class348_Sub40_Sub38.anIntArray9480[i_49_] = i_51_;
                                        Class223.anIntArray2899[i_49_] = (class277_46_.anInt3575);
                                        Class348_Sub6.anIntArray6631[i_49_] = (class277_46_.anInt3570);
                                        if (Class306.anIntArray3873[i_49_] != (class277_46_.anInt3564)) Class180.anIntArray2370[i_49_] = 8;
                                        else Class180.anIntArray2370[i_49_] = (Class273.method2057((Class180.anIntArray2370[i_49_]), 8));
                                        Class306.anIntArray3873[i_49_] = (class277_46_.anInt3564);
                                    }
                                    i_49_++;
                                    i_50_--;
                                }
                                if (!bools_8_[3 - -i_4_ & 0x3]) bools[3] = (Class50_Sub1.aBooleanArrayArray5225[i_47_][Class139.method1166(3, 1 + i_48_)]);
                            } else if (!bools_8_[0x3 & 3 - -i_4_]) bools[3] = (Class265.aBooleanArrayArray4693[i_47_][Class139.method1166(3, 1 + i_48_)]);
                        }
                    }
                }
                if (i_6_ - 1 > i) {
                    int i_53_ = is_5_[1 + i][i_1_] & 0xff;
                    if (i_53_ > 0) {
                        Class277 class277_54_ = aClass268_3119.method2034(-1 + i_53_, false);
                        if (class277_54_.anInt3563 != -1) {
                            byte i_55_ = is[i + 1][i_1_];
                            int i_56_ = is_2_[1 + i][i_1_];
                            if (class277_54_.aBoolean3560) {
                                int i_57_ = 4;
                                int i_58_ = 6 + i_56_ * 2;
                                int i_59_ = (Class348_Sub42_Sub17.method3266(var_ha, 127, class277_54_));
                                for (int i_60_ = 0; i_60_ < 3; i_60_++) {
                                    i_57_ = 0x7 & i_57_;
                                    i_58_ = 0x7 & i_58_;
                                    if ((Class160.aBooleanArrayArray2133[i_55_][i_58_]) && (Class306.anIntArray3873[i_57_] <= (class277_54_.anInt3564))) {
                                        Class348_Sub15.anIntArray6775[i_57_] = (class277_54_.anInt3563);
                                        Class348_Sub40_Sub38.anIntArray9480[i_57_] = i_59_;
                                        Class223.anIntArray2899[i_57_] = (class277_54_.anInt3575);
                                        Class348_Sub6.anIntArray6631[i_57_] = (class277_54_.anInt3570);
                                        if (class277_54_.anInt3564 == Class306.anIntArray3873[i_57_]) Class180.anIntArray2370[i_57_] = (Class273.method2057((Class180.anIntArray2370[i_57_]), 4));
                                        else Class180.anIntArray2370[i_57_] = 4;
                                        Class306.anIntArray3873[i_57_] = (class277_54_.anInt3564);
                                    }
                                    i_58_++;
                                    i_57_--;
                                }
                                if (!bools_8_[1 + i_4_ & 0x3]) bools[1] = (Class50_Sub1.aBooleanArrayArray5225[i_55_][Class139.method1166(3, i_56_ + 3)]);
                            } else if (!bools_8_[1 - -i_4_ & 0x3]) bools[1] = (Class265.aBooleanArrayArray4693[i_55_][Class139.method1166(3, 3 - -i_56_)]);
                        }
                    }
                }
                if (class277 == null) break;
                int i_61_ = Class348_Sub42_Sub17.method3266(var_ha, i_3_ ^ ~0x7e, class277);
                if (!class277.aBoolean3560) break;
                for (int i_62_ = 0; i_62_ < 8; i_62_++) {
                    int i_63_ = -(i_4_ * 2) + i_62_ & 0x7;
                    if (Class160.aBooleanArrayArray2133[i_7_][i_62_] && (Class306.anIntArray3873[i_63_] <= class277.anInt3564)) {
                        Class348_Sub15.anIntArray6775[i_63_] = class277.anInt3563;
                        Class348_Sub40_Sub38.anIntArray9480[i_63_] = i_61_;
                        Class223.anIntArray2899[i_63_] = class277.anInt3575;
                        Class348_Sub6.anIntArray6631[i_63_] = class277.anInt3570;
                        if (Class306.anIntArray3873[i_63_] != class277.anInt3564) Class180.anIntArray2370[i_63_] = 2;
                        else Class180.anIntArray2370[i_63_] = Class273.method2057((Class180.anIntArray2370[i_63_]), 2);
                        Class306.anIntArray3873[i_63_] = class277.anInt3564;
                    }
                }
            } catch (RuntimeException runtimeexception) {
                throw Class348_Sub17.method2929(runtimeexception, ("sr.M(" + i + ',' + i_0_ + ',' + (is != null ? "{...}" : "null") + ',' + i_1_ + ',' + (is_2_ != null ? "{...}" : "null") + ',' + i_3_ + ',' + (class277 != null ? "{...}" : "null") + ',' + (class22 != null ? "{...}" : "null") + ',' + (bools != null ? "{...}" : "null") + ',' + i_4_ + ',' + (is_5_ != null ? "{...}" : "null") + ',' + i_6_ + ',' + i_7_ + ',' + (var_ha != null ? "{...}" : "null") + ')'));
            }
            break;
        } while (false);
    }

    private final void method1676(s var_s, s var_s_64_, int i, s var_s_65_, int[][] is, ha var_ha, int i_66_) {
        try {
            anInt3102++;
            byte[][] is_67_ = aByteArrayArrayArray3126[i_66_];
            if (i != -26833) this.anInt3114 = -107;
            byte[][] is_68_ = aByteArrayArrayArray3129[i_66_];
            byte[][] is_69_ = aByteArrayArrayArray3113[i_66_];
            byte[][] is_70_ = aByteArrayArrayArray3123[i_66_];
            for (int i_71_ = 0; (i_71_ < this.anInt3117); i_71_++) {
                int i_72_ = (i_71_ >= this.anInt3117 - 1 ? i_71_ : i_71_ + 1);
                for (int i_73_ = 0; i_73_ < this.anInt3114; i_73_++) {
                    int i_74_ = (i_73_ < this.anInt3114 + -1 ? 1 + i_73_ : i_73_);
                    if (OutputStream_Sub2.anInt101 == -1 || Class58.method536(i_73_, false, i_71_, OutputStream_Sub2.anInt101, i_66_)) {
                        boolean bool = false;
                        boolean bool_75_ = false;
                        boolean[] bools = new boolean[4];
                        byte i_76_ = is_67_[i_71_][i_73_];
                        int i_77_ = is_68_[i_71_][i_73_];
                        int i_78_ = 0xff & is_70_[i_71_][i_73_];
                        int i_79_ = is_69_[i_71_][i_73_] & 0xff;
                        int i_80_ = 0xff & is_69_[i_71_][i_74_];
                        int i_81_ = is_69_[i_72_][i_74_] & 0xff;
                        int i_82_ = is_69_[i_72_][i_73_] & 0xff;
                        if (i_78_ != 0 || i_79_ != 0) {
                            Class277 class277 = (i_78_ == 0 ? null : aClass268_3119.method2034(i_78_ - 1, false));
                            Class22 class22 = (i_79_ == 0 ? null : aClass183_3120.method1380(true, -1 + i_79_));
                            if (i_76_ == 0 && class277 == null) i_76_ = (byte) 12;
                            Class277 class277_83_ = class277;
                            if (class277 != null) {
                                if (class277.anInt3563 != -1 || class277.anInt3569 != -1) {
                                    if (class22 != null && i_76_ != 0) bool_75_ = (class277.aBoolean3560);
                                } else {
                                    class277_83_ = class277;
                                    class277 = null;
                                }
                            }
                            if ((i_76_ == 0 || i_76_ == 12) && i_71_ > 0 && i_73_ > 0 && (this.anInt3117 > i_71_) && (this.anInt3114 > i_73_)) {
                                int i_84_ = 0;
                                int i_85_ = 0;
                                int i_86_ = 0;
                                i_86_ = i_86_ + (is_69_[i_72_][i_74_] != i_79_ ? -1 : 1);
                                i_85_ = (i_85_ + (is_69_[i_72_][i_73_ + -1] != i_79_ ? -1 : 1));
                                int i_87_ = 0;
                                i_84_ = i_84_ + (i_79_ == (is_69_[-1 + i_71_][-1 + i_73_]) ? 1 : -1);
                                if (is_69_[i_71_][i_73_ - 1] == i_79_) {
                                    i_84_++;
                                    i_85_++;
                                } else {
                                    i_85_--;
                                    i_84_--;
                                }
                                i_87_ = (i_87_ + (is_69_[-1 + i_71_][i_74_] != i_79_ ? -1 : 1));
                                if (i_79_ == is_69_[i_72_][i_73_]) {
                                    i_85_++;
                                    i_86_++;
                                } else {
                                    i_85_--;
                                    i_86_--;
                                }
                                if (i_79_ == is_69_[i_71_][i_74_]) {
                                    i_86_++;
                                    i_87_++;
                                } else {
                                    i_87_--;
                                    i_86_--;
                                }
                                if (i_79_ == is_69_[-1 + i_71_][i_73_]) {
                                    i_87_++;
                                    i_84_++;
                                } else {
                                    i_87_--;
                                    i_84_--;
                                }
                                int i_88_ = i_84_ + -i_86_;
                                if (i_88_ < 0) i_88_ = -i_88_;
                                int i_89_ = -i_87_ + i_85_;
                                if (i_89_ < 0) i_89_ = -i_89_;
                                if (i_89_ == i_88_) {
                                    i_88_ = (var_s_64_.method3982((byte) -86, i_73_, i_71_) + -var_s_64_.method3982((byte) -86, i_74_, i_72_));
                                    if (i_88_ < 0) i_88_ = -i_88_;
                                    i_89_ = (var_s_64_.method3982((byte) -86, i_73_, i_72_) - var_s_64_.method3982((byte) -86, i_74_, i_71_));
                                    if (i_89_ < 0) i_89_ = -i_89_;
                                }
                                i_77_ = (i_89_ <= i_88_ ? 0 : 1);
                            }
                            for (int i_90_ = 0; i_90_ < 13; i_90_++) {
                                Class306.anIntArray3873[i_90_] = -1;
                                Class180.anIntArray2370[i_90_] = 1;
                            }
                            boolean[] bools_91_ = ((class277 == null || !class277.aBoolean3560) ? Class265.aBooleanArrayArray4693[i_76_] : (Class50_Sub1.aBooleanArrayArray5225[i_76_]));
                            method1675(i_71_, this.anInt3114, is_67_, i_73_, is_68_, -1, class277, class22, bools, i_77_, is_70_, this.anInt3117, i_76_, var_ha);
                            boolean bool_92_ = (class277 != null && (class277.anInt3563 != class277.anInt3569));
                            if (!bool_92_) {
                                for (int i_93_ = 0; i_93_ < 8; i_93_++) {
                                    if (Class306.anIntArray3873[i_93_] >= 0 && ((Class348_Sub15.anIntArray6775[i_93_]) != (Class348_Sub40_Sub38.anIntArray9480[i_93_]))) {
                                        bool_92_ = true;
                                        break;
                                    }
                                }
                            }
                            if (!bools_91_[i_77_ + 1 & 0x3]) bools[1] = (Class369_Sub3_Sub1.method3576(bools[1], Class139.method1166((Class180.anIntArray2370[2]), (Class180.anIntArray2370[4])) == 0));
                            if (!bools_91_[0x3 & i_77_ + 3]) bools[3] = (Class369_Sub3_Sub1.method3576(bools[3], Class139.method1166((Class180.anIntArray2370[0]), (Class180.anIntArray2370[6])) == 0));
                            if (!bools_91_[i_77_ & 0x3]) bools[0] = (Class369_Sub3_Sub1.method3576(bools[0], Class139.method1166((Class180.anIntArray2370[0]), (Class180.anIntArray2370[2])) == 0));
                            if (!bools_91_[i_77_ + 2 & 0x3]) bools[2] = (Class369_Sub3_Sub1.method3576(bools[2], Class139.method1166((Class180.anIntArray2370[4]), (Class180.anIntArray2370[6])) == 0));
                            if (!bool_75_ && (i_76_ == 0 || i_76_ == 12)) {
                                if (!bools[0] || bools[1] || bools[2] || !bools[3]) {
                                    if (!bools[0] || !bools[1] || bools[2] || bools[3]) {
                                        if (!bools[0] && bools[1] && bools[2] && !bools[3]) {
                                            i_77_ = 2;
                                            i_76_ = (i_76_ != 0 ? (byte) 14 : (byte) 13);
                                            bools[1] = bools[2] = false;
                                        } else if (!bools[0] && !bools[1] && bools[2] && bools[3]) {
                                            i_76_ = (i_76_ != 0 ? (byte) 14 : (byte) 13);
                                            bools[2] = bools[3] = false;
                                            i_77_ = 1;
                                        }
                                    } else {
                                        i_76_ = (i_76_ == 0 ? (byte) 13 : (byte) 14);
                                        bools[0] = bools[1] = false;
                                        i_77_ = 3;
                                    }
                                } else {
                                    bools[0] = bools[3] = false;
                                    i_77_ = 0;
                                    i_76_ = (i_76_ == 0 ? (byte) 13 : (byte) 14);
                                }
                            }
                            boolean bool_94_ = (!bool_75_ && !bools[0] && !bools[2] && !bools[1] && !bools[3]);
                            int[] is_95_ = null;
                            int[] is_96_;
                            int[] is_97_;
                            int i_98_;
                            int[] is_99_;
                            int i_100_;
                            if (bool_94_) {
                                is_96_ = Class10.anIntArrayArray174[i_76_];
                                is_97_ = Class68.anIntArrayArray1190[i_76_];
                                i_98_ = (class22 != null ? Class43.anIntArray619[i_76_] : 0);
                                is_99_ = (Class348_Sub12.anIntArrayArray6740[i_76_]);
                                i_100_ = (class277 == null ? 0 : (Class348_Sub40_Sub18.anIntArray9249[i_76_]));
                            } else if (bool_75_) {
                                i_100_ = (class277 == null ? 0 : Class48.anIntArray860[i_76_]);
                                is_96_ = Class98.anIntArrayArray1566[i_76_];
                                is_95_ = Class106.anIntArrayArray1638[i_76_];
                                is_97_ = Class163.anIntArrayArray2165[i_76_];
                                is_99_ = (Class348_Sub15.anIntArrayArray6780[i_76_]);
                                i_98_ = (class22 != null ? Class283.anIntArray3659[i_76_] : 0);
                            } else {
                                i_98_ = (class22 == null ? 0 : Class246.anIntArray3173[i_76_]);
                                i_100_ = (class277 == null ? 0 : Class334.anIntArray4152[i_76_]);
                                is_97_ = Class284.anIntArrayArray3677[i_76_];
                                is_99_ = (Class239_Sub20.anIntArrayArray6054[i_76_]);
                                is_96_ = (Exception_Sub1.anIntArrayArray111[i_76_]);
                                is_95_ = (Class348_Sub16_Sub3.anIntArrayArray8910[i_76_]);
                            }
                            int i_101_ = i_100_ + i_98_;
                            if (i_101_ <= 0) Class185.method1394(i_66_, i_71_, i_73_);
                            else {
                                if (bools[0]) i_101_++;
                                if (bools[2]) i_101_++;
                                if (bools[1]) i_101_++;
                                if (bools[3]) i_101_++;
                                int i_102_ = 0;
                                int i_103_ = 0;
                                int i_104_ = i_101_ * 3;
                                int[] is_105_ = bool_92_ ? new int[i_104_] : null;
                                int[] is_106_ = new int[i_104_];
                                int[] is_107_ = new int[i_104_];
                                int[] is_108_ = new int[i_104_];
                                int[] is_109_ = new int[i_104_];
                                int[] is_110_ = new int[i_104_];
                                int[] is_111_ = var_s == null ? null : new int[i_104_];
                                int[] is_112_ = (var_s == null && var_s_65_ == null ? null : new int[i_104_]);
                                int i_113_ = -1;
                                int i_114_ = -1;
                                int i_115_ = 256;
                                if (class277 != null) {
                                    i_114_ = class277.anInt3575;
                                    i_115_ = class277.anInt3570;
                                    i_113_ = class277.anInt3563;
                                    int i_116_ = (Class348_Sub42_Sub17.method3266(var_ha, i ^ ~0x68ad, class277));
                                    for (int i_117_ = 0; i_117_ < i_100_; i_117_++) {
                                        boolean bool_118_ = false;
                                        int i_119_;
                                        if (!bools[-i_77_ & 0x3] || is_95_[0] != i_102_) {
                                            if (!bools[-i_77_ + 2 & 0x3] || is_95_[2] != i_102_) {
                                                if (!bools[-i_77_ + 1 & 0x3] || (is_95_[1] != i_102_)) {
                                                    if (!(bools[0x3 & -i_77_ + 3]) || (i_102_ != is_95_[3])) {
                                                        Class348.anIntArray4288[0] = is_96_[i_102_];
                                                        Class348.anIntArray4288[1] = is_97_[i_102_];
                                                        Class348.anIntArray4288[2] = is_99_[i_102_];
                                                        i_119_ = 3;
                                                    } else {
                                                        Class348.anIntArray4288[0] = is_96_[i_102_];
                                                        Class348.anIntArray4288[1] = 7;
                                                        Class348.anIntArray4288[2] = is_99_[i_102_];
                                                        Class348.anIntArray4288[3] = 7;
                                                        Class348.anIntArray4288[4] = is_97_[i_102_];
                                                        i_119_ = 6;
                                                        Class348.anIntArray4288[5] = is_99_[i_102_];
                                                    }
                                                } else {
                                                    Class348.anIntArray4288[0] = is_96_[i_102_];
                                                    Class348.anIntArray4288[1] = 3;
                                                    Class348.anIntArray4288[2] = is_99_[i_102_];
                                                    Class348.anIntArray4288[3] = 3;
                                                    Class348.anIntArray4288[4] = is_97_[i_102_];
                                                    i_119_ = 6;
                                                    Class348.anIntArray4288[5] = is_99_[i_102_];
                                                }
                                            } else {
                                                Class348.anIntArray4288[0] = is_96_[i_102_];
                                                Class348.anIntArray4288[1] = 5;
                                                Class348.anIntArray4288[2] = is_99_[i_102_];
                                                Class348.anIntArray4288[3] = 5;
                                                Class348.anIntArray4288[4] = is_97_[i_102_];
                                                i_119_ = 6;
                                                Class348.anIntArray4288[5] = is_99_[i_102_];
                                            }
                                        } else {
                                            Class348.anIntArray4288[0] = is_96_[i_102_];
                                            Class348.anIntArray4288[1] = 1;
                                            Class348.anIntArray4288[2] = is_99_[i_102_];
                                            Class348.anIntArray4288[3] = 1;
                                            Class348.anIntArray4288[4] = is_97_[i_102_];
                                            Class348.anIntArray4288[5] = is_99_[i_102_];
                                            i_119_ = 6;
                                        }
                                        for (int i_120_ = 0; (i_119_ > i_120_); i_120_++) {
                                            int i_121_ = (Class348.anIntArray4288[i_120_]);
                                            int i_122_ = -(2 * i_77_) + i_121_ & 0x7;
                                            int i_123_ = anIntArray3124[i_121_];
                                            int i_124_ = anIntArray3128[i_121_];
                                            int i_125_;
                                            int i_126_;
                                            if (i_77_ == 1) {
                                                i_125_ = 512 + -i_123_;
                                                i_126_ = i_124_;
                                            } else if (i_77_ == 2) {
                                                i_126_ = 512 - i_123_;
                                                i_125_ = -i_124_ + 512;
                                            } else if (i_77_ == 3) {
                                                i_125_ = i_123_;
                                                i_126_ = 512 + -i_124_;
                                            } else {
                                                i_125_ = i_124_;
                                                i_126_ = i_123_;
                                            }
                                            is_106_[i_103_] = i_126_;
                                            is_107_[i_103_] = i_125_;
                                            if (is_111_ != null && (Class160.aBooleanArrayArray2133[i_76_][i_121_])) {
                                                int i_127_ = (i_126_ + (i_71_ << 9));
                                                int i_128_ = i_125_ + (i_73_ << 9);
                                                is_111_[i_103_] = ((var_s.method3986(i_127_, i_128_, (byte) 124)) + -(var_s_64_.method3986(i_127_, i_128_, (byte) -118)));
                                            }
                                            if (is_112_ != null) {
                                                if (var_s == null || (Class160.aBooleanArrayArray2133[i_76_][i_121_])) {
                                                    if (var_s_65_ != null && !(Class348_Sub42_Sub1.aBooleanArrayArray9495[i_76_][i_121_])) {
                                                        int i_129_ = ((i_71_ << 9) - -i_126_);
                                                        int i_130_ = ((i_73_ << 9) + i_125_);
                                                        is_112_[i_103_] = ((var_s_65_.method3986(i_129_, i_130_, (byte) -105)) + -(var_s_64_.method3986(i_129_, i_130_, (byte) -109)));
                                                    }
                                                } else {
                                                    int i_131_ = ((i_71_ << 9) + i_126_);
                                                    int i_132_ = (i_125_ + (i_73_ << 9));
                                                    is_112_[i_103_] = ((var_s_64_.method3986(i_131_, i_132_, (byte) -4)) - (var_s.method3986(i_131_, i_132_, (byte) 73)));
                                                }
                                            }
                                            if (i_121_ < 8 && ((Class306.anIntArray3873[i_122_]) > (class277.anInt3564))) {
                                                if (is_105_ != null) is_105_[i_103_] = (Class348_Sub40_Sub38.anIntArray9480[i_122_]);
                                                is_110_[i_103_] = (Class348_Sub6.anIntArray6631[i_122_]);
                                                is_109_[i_103_] = (Class223.anIntArray2899[i_122_]);
                                                is_108_[i_103_] = (Class348_Sub15.anIntArray6775[i_122_]);
                                            } else {
                                                if (is_105_ != null) is_105_[i_103_] = i_116_;
                                                is_109_[i_103_] = (class277.anInt3575);
                                                is_110_[i_103_] = (class277.anInt3570);
                                                is_108_[i_103_] = i_113_;
                                            }
                                            i_103_++;
                                        }
                                        i_102_++;
                                    }
                                    if (!this.aBoolean3109 && i_66_ == 0) Class333.method2643(i_71_, i_73_, class277.anInt3559, 8 * (class277.anInt3558), class277.anInt3574);
                                    if (i_76_ != 12 && (class277.anInt3563 != -1) && class277.aBoolean3566) bool = true;
                                } else if (bool_94_) i_102_ += (Class348_Sub40_Sub18.anIntArray9249[i_76_]);
                                else if (!bool_75_) i_102_ += Class334.anIntArray4152[i_76_];
                                else i_102_ += Class48.anIntArray860[i_76_];
                                if (class22 != null) {
                                    if (i_82_ == 0) i_82_ = i_79_;
                                    if (i_81_ == 0) i_81_ = i_79_;
                                    if (i_80_ == 0) i_80_ = i_79_;
                                    Class22 class22_133_ = aClass183_3120.method1380(true, -1 + i_79_);
                                    Class22 class22_134_ = aClass183_3120.method1380(true, i_80_ - 1);
                                    Class22 class22_135_ = aClass183_3120.method1380(true, i_81_ + -1);
                                    Class22 class22_136_ = aClass183_3120.method1380(true, -1 + i_82_);
                                    for (int i_137_ = 0; (i_98_ > i_137_); i_137_++) {
                                        boolean bool_138_ = false;
                                        int i_139_;
                                        if (!bools[-i_77_ & 0x3] || i_102_ != is_95_[0]) {
                                            if (!bools[2 + -i_77_ & 0x3] || i_102_ != is_95_[2]) {
                                                if (bools[0x3 & -i_77_ + 1] && (is_95_[1] == i_102_)) {
                                                    Class348.anIntArray4288[0] = is_96_[i_102_];
                                                    Class348.anIntArray4288[1] = 3;
                                                    Class348.anIntArray4288[2] = is_99_[i_102_];
                                                    Class348.anIntArray4288[3] = 3;
                                                    Class348.anIntArray4288[4] = is_97_[i_102_];
                                                    Class348.anIntArray4288[5] = is_99_[i_102_];
                                                    i_139_ = 6;
                                                } else if ((bools[-i_77_ + 3 & 0x3]) && (i_102_ == is_95_[3])) {
                                                    Class348.anIntArray4288[0] = is_96_[i_102_];
                                                    Class348.anIntArray4288[1] = 7;
                                                    Class348.anIntArray4288[2] = is_99_[i_102_];
                                                    Class348.anIntArray4288[3] = 7;
                                                    Class348.anIntArray4288[4] = is_97_[i_102_];
                                                    Class348.anIntArray4288[5] = is_99_[i_102_];
                                                    i_139_ = 6;
                                                } else {
                                                    Class348.anIntArray4288[0] = is_96_[i_102_];
                                                    Class348.anIntArray4288[1] = is_97_[i_102_];
                                                    i_139_ = 3;
                                                    Class348.anIntArray4288[2] = is_99_[i_102_];
                                                }
                                            } else {
                                                Class348.anIntArray4288[0] = is_96_[i_102_];
                                                Class348.anIntArray4288[1] = 5;
                                                Class348.anIntArray4288[2] = is_99_[i_102_];
                                                Class348.anIntArray4288[3] = 5;
                                                Class348.anIntArray4288[4] = is_97_[i_102_];
                                                i_139_ = 6;
                                                Class348.anIntArray4288[5] = is_99_[i_102_];
                                            }
                                        } else {
                                            Class348.anIntArray4288[0] = is_96_[i_102_];
                                            Class348.anIntArray4288[1] = 1;
                                            Class348.anIntArray4288[2] = is_99_[i_102_];
                                            Class348.anIntArray4288[3] = 1;
                                            Class348.anIntArray4288[4] = is_97_[i_102_];
                                            i_139_ = 6;
                                            Class348.anIntArray4288[5] = is_99_[i_102_];
                                        }
                                        i_102_++;
                                        for (int i_140_ = 0; (i_140_ < i_139_); i_140_++) {
                                            int i_141_ = (Class348.anIntArray4288[i_140_]);
                                            int i_142_ = -(2 * i_77_) + i_141_ & 0x7;
                                            int i_143_ = anIntArray3124[i_141_];
                                            int i_144_ = anIntArray3128[i_141_];
                                            int i_145_;
                                            int i_146_;
                                            if (i_77_ == 1) {
                                                i_146_ = i_144_;
                                                i_145_ = -i_143_ + 512;
                                            } else if (i_77_ == 2) {
                                                i_145_ = 512 + -i_144_;
                                                i_146_ = 512 + -i_143_;
                                            } else if (i_77_ == 3) {
                                                i_145_ = i_143_;
                                                i_146_ = 512 + -i_144_;
                                            } else {
                                                i_145_ = i_144_;
                                                i_146_ = i_143_;
                                            }
                                            is_106_[i_103_] = i_146_;
                                            is_107_[i_103_] = i_145_;
                                            if (is_111_ != null && (Class160.aBooleanArrayArray2133[i_76_][i_141_])) {
                                                int i_147_ = (i_146_ + (i_71_ << 9));
                                                int i_148_ = ((i_73_ << 9) - -i_145_);
                                                is_111_[i_103_] = ((var_s.method3986(i_147_, i_148_, (byte) -95)) - (var_s_64_.method3986(i_147_, i_148_, (byte) 69)));
                                            }
                                            if (is_112_ != null) {
                                                if (var_s == null || (Class160.aBooleanArrayArray2133[i_76_][i_141_])) {
                                                    if (var_s_65_ != null && !(Class348_Sub42_Sub1.aBooleanArrayArray9495[i_76_][i_141_])) {
                                                        int i_149_ = ((i_71_ << 9) - -i_146_);
                                                        int i_150_ = (i_145_ + (i_73_ << 9));
                                                        is_112_[i_103_] = ((var_s_65_.method3986(i_149_, i_150_, (byte) 92)) + -(var_s_64_.method3986(i_149_, i_150_, (byte) 127)));
                                                    }
                                                } else {
                                                    int i_151_ = ((i_71_ << 9) + i_146_);
                                                    int i_152_ = (i_145_ + (i_73_ << 9));
                                                    is_112_[i_103_] = ((var_s_64_.method3986(i_151_, i_152_, (byte) -102)) - (var_s.method3986(i_151_, i_152_, (byte) 106)));
                                                }
                                            }
                                            if (i_141_ < 8 && (Class306.anIntArray3873[i_142_]) >= 0) {
                                                if (is_105_ != null) is_105_[i_103_] = (Class348_Sub40_Sub38.anIntArray9480[i_142_]);
                                                is_110_[i_103_] = (Class348_Sub6.anIntArray6631[i_142_]);
                                                is_109_[i_103_] = (Class223.anIntArray2899[i_142_]);
                                                is_108_[i_103_] = (Class348_Sub15.anIntArray6775[i_142_]);
                                            } else {
                                                if (!bool_75_ || !(Class160.aBooleanArrayArray2133[i_76_][i_141_])) {
                                                    if ((i_146_ == 0) && i_145_ == 0) {
                                                        is_108_[i_103_] = is[i_71_][i_73_];
                                                        is_109_[i_103_] = (class22_133_.anInt331);
                                                        is_110_[i_103_] = (class22_133_.anInt336);
                                                    } else if (i_146_ != 0 || (i_145_ != 512)) {
                                                        if (i_146_ == 512 && i_145_ == 512) {
                                                            is_108_[i_103_] = (is[i_72_][i_74_]);
                                                            is_109_[i_103_] = (class22_135_.anInt331);
                                                            is_110_[i_103_] = (class22_135_.anInt336);
                                                        } else if ((i_146_ != 512) || (i_145_ != 0)) {
                                                            if (i_146_ >= 256) {
                                                                if (i_145_ >= 256) {
                                                                    is_109_[i_103_] = (class22_135_.anInt331);
                                                                    is_110_[i_103_] = (class22_135_.anInt336);
                                                                } else {
                                                                    is_109_[i_103_] = (class22_136_.anInt331);
                                                                    is_110_[i_103_] = (class22_136_.anInt336);
                                                                }
                                                            } else if (i_145_ < 256) {
                                                                is_109_[i_103_] = (class22_133_.anInt331);
                                                                is_110_[i_103_] = (class22_133_.anInt336);
                                                            } else {
                                                                is_109_[i_103_] = (class22_134_.anInt331);
                                                                is_110_[i_103_] = (class22_134_.anInt336);
                                                            }
                                                            int i_153_ = (Class334.method2652((is[i_71_][i_73_]), (is[i_72_][i_73_]), 1, (i_146_ << 7 >> 9)));
                                                            int i_154_ = (Class334.method2652((is[i_71_][i_74_]), (is[i_72_][i_74_]), 1, (i_146_ << 7 >> 9)));
                                                            is_108_[i_103_] = (Class334.method2652(i_153_, i_154_, i + 26834, (i_145_ << 7 >> 9)));
                                                        } else {
                                                            is_108_[i_103_] = (is[i_72_][i_73_]);
                                                            is_109_[i_103_] = (class22_136_.anInt331);
                                                            is_110_[i_103_] = (class22_136_.anInt336);
                                                        }
                                                    } else {
                                                        is_108_[i_103_] = is[i_71_][i_74_];
                                                        is_109_[i_103_] = (class22_134_.anInt331);
                                                        is_110_[i_103_] = (class22_134_.anInt336);
                                                    }
                                                } else {
                                                    is_109_[i_103_] = i_114_;
                                                    is_110_[i_103_] = i_115_;
                                                    is_108_[i_103_] = i_113_;
                                                }
                                                if (is_105_ != null) is_105_[i_103_] = is_108_[i_103_];
                                            }
                                            i_103_++;
                                        }
                                    }
                                    if (i_76_ != 0 && class22.aBoolean342) bool = true;
                                }
                                int i_155_ = var_s_64_.method3982((byte) -86, i_73_, i_71_);
                                int i_156_ = var_s_64_.method3982((byte) -86, i_73_, i_72_);
                                int i_157_ = var_s_64_.method3982((byte) -86, i_74_, i_72_);
                                int i_158_ = var_s_64_.method3982((byte) -86, i_74_, i_71_);
                                boolean bool_159_ = Class79.method802(i_73_, i_71_, true);
                                if (bool_159_ && i_66_ > 1 || (!bool_159_ && i_66_ > 0)) {
                                    boolean bool_160_ = true;
                                    if (class22 != null && !class22.aBoolean334) bool_160_ = false;
                                    else if (i_79_ == 0 && i_76_ != 0) bool_160_ = false;
                                    else if (i_78_ > 0 && class277_83_ != null && !(class277_83_.aBoolean3561)) bool_160_ = false;
                                    if (bool_160_ && (i_156_ == i_155_) && i_157_ == i_155_ && i_155_ == i_158_) this.aByteArrayArrayArray3108[i_66_][i_71_][i_73_] = (byte) (Class273.method2057((this.aByteArrayArrayArray3108[i_66_][i_71_][i_73_]), 4));
                                }
                                int i_161_ = 0;
                                int i_162_ = 0;
                                int i_163_ = 0;
                                if (this.aBoolean3109) {
                                    i_161_ = Class367_Sub8.method3547(i_71_, i_73_);
                                    i_162_ = Class318_Sub1_Sub5.method2483(i_71_, i_73_);
                                    i_163_ = Class199.method1457(i_71_, i_73_);
                                }
                                var_s_64_.U(i_71_, i_73_, is_106_, is_111_, is_107_, is_112_, is_108_, is_105_, is_109_, is_110_, i_161_, i_162_, i_163_, bool);
                                Class185.method1394(i_66_, i_71_, i_73_);
                            }
                        }
                    }
                }
            }
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("sr.B(" + (var_s != null ? "{...}" : "null") + ',' + (var_s_64_ != null ? "{...}" : "null") + ',' + i + ',' + (var_s_65_ != null ? "{...}" : "null") + ',' + (is != null ? "{...}" : "null") + ',' + (var_ha != null ? "{...}" : "null") + ',' + i_66_ + ')'));
        }
    }

    static final Class231 method1677(int i, int i_164_) {
        anInt3116++;
        Class231[] class231s = Class239.method1709(-126);
        if (i >= -111) return null;
        for (int i_165_ = 0; i_165_ < class231s.length; i_165_++) {
            Class231 class231 = class231s[i_165_];
            if (class231.anInt2995 == i_164_) return class231;
        }
        return null;
    }

    final void method1678(int i, int i_166_, int i_167_, int i_168_, int i_169_, int i_170_) {
        if (i_168_ >= -80) this.aByteArrayArrayArray3108 = null;
        for (int i_171_ = i_167_; i_166_ + i_167_ > i_171_; i_171_++) {
            for (int i_172_ = i; i_169_ + i > i_172_; i_172_++) {
                if (i_172_ >= 0 && i_172_ < this.anInt3117 && i_171_ >= 0 && this.anInt3114 > i_171_) this.anIntArrayArrayArray3122[i_170_][i_172_][i_171_] = (i_170_ <= 0 ? 0 : -960 + (this.anIntArrayArrayArray3122[-1 + i_170_][i_172_][i_171_]));
            }
        }
        anInt3105++;
        if (i > 0 && this.anInt3117 > i) {
            for (int i_173_ = i_167_ - -1; i_173_ < i_167_ - -i_166_; i_173_++) {
                if (i_173_ >= 0 && this.anInt3114 > i_173_) this.anIntArrayArrayArray3122[i_170_][i][i_173_] = (this.anIntArrayArrayArray3122[i_170_][i - 1][i_173_]);
            }
        }
        if (i_167_ > 0 && i_167_ < this.anInt3114) {
            for (int i_174_ = 1 + i; i_174_ < i_169_ + i; i_174_++) {
                if (i_174_ >= 0 && i_174_ < this.anInt3117) this.anIntArrayArrayArray3122[i_170_][i_174_][i_167_] = (this.anIntArrayArrayArray3122[i_170_][i_174_][-1 + i_167_]);
            }
        }
        if (i >= 0 && i_167_ >= 0 && this.anInt3117 > i && i_167_ < this.anInt3114) {
            if (i_170_ != 0) {
                if (i > 0 && ((this.anIntArrayArrayArray3122[i_170_ - 1][-1 + i][i_167_]) != (this.anIntArrayArrayArray3122[i_170_][i - 1][i_167_]))) this.anIntArrayArrayArray3122[i_170_][i][i_167_] = (this.anIntArrayArrayArray3122[i_170_][i - 1][i_167_]);
                else if (i_167_ <= 0 || ((this.anIntArrayArrayArray3122[i_170_][i][-1 + i_167_]) == (this.anIntArrayArrayArray3122[-1 + i_170_][i][-1 + i_167_]))) {
                    if (i > 0 && i_167_ > 0 && ((this.anIntArrayArrayArray3122[i_170_ + -1][i + -1][-1 + i_167_]) != (this.anIntArrayArrayArray3122[i_170_][i + -1][-1 + i_167_]))) this.anIntArrayArrayArray3122[i_170_][i][i_167_] = (this.anIntArrayArrayArray3122[i_170_][i + -1][-1 + i_167_]);
                } else this.anIntArrayArrayArray3122[i_170_][i][i_167_] = (this.anIntArrayArrayArray3122[i_170_][i][i_167_ + -1]);
            } else if (i <= 0 || (this.anIntArrayArrayArray3122[i_170_][-1 + i][i_167_]) == 0) {
                if (i_167_ <= 0 || (this.anIntArrayArrayArray3122[i_170_][i][-1 + i_167_]) == 0) {
                    if (i > 0 && i_167_ > 0 && (this.anIntArrayArrayArray3122[i_170_][-1 + i][i_167_ - 1]) != 0) this.anIntArrayArrayArray3122[i_170_][i][i_167_] = (this.anIntArrayArrayArray3122[i_170_][i - 1][-1 + i_167_]);
                } else this.anIntArrayArrayArray3122[i_170_][i][i_167_] = (this.anIntArrayArrayArray3122[i_170_][i][-1 + i_167_]);
            } else this.anIntArrayArrayArray3122[i_170_][i][i_167_] = (this.anIntArrayArrayArray3122[i_170_][-1 + i][i_167_]);
        }
    }

    final void method1679(int i, int i_175_, int[][] is) {
        anInt3121++;
        int[][] is_176_ = this.anIntArrayArrayArray3122[i];
        for (int i_177_ = i_175_; (i_177_ < this.anInt3117 - -1); i_177_++) {
            for (int i_178_ = 0; (i_178_ < this.anInt3114 + 1); i_178_++)
                is_176_[i_177_][i_178_] += is[i_177_][i_178_];
        }
    }

    final void method1680(s var_s, byte i, s var_s_179_, ha var_ha) {
        try {
            anInt3131++;
            int[][] is = (new int[this.anInt3117]
                    [this.anInt3114]);
            if (i <= -122) {
                if (Class348_Sub24.anIntArray6878 == null || (this.anInt3114 != Class348_Sub24.anIntArray6878.length)) {
                    Class318_Sub9_Sub1.anIntArray8785 = new int[this.anInt3114];
                    Class348_Sub40_Sub6.anIntArray9135 = new int[this.anInt3114];
                    Class265.anIntArray4692 = new int[this.anInt3114];
                    Class348_Sub24.anIntArray6878 = new int[this.anInt3114];
                    Class348_Sub8.anIntArray6655 = new int[this.anInt3114];
                }
                for (int i_180_ = 0; this.anInt3130 > i_180_; i_180_++) {
                    for (int i_181_ = 0; this.anInt3114 > i_181_; i_181_++) {
                        Class348_Sub24.anIntArray6878[i_181_] = 0;
                        Class348_Sub40_Sub6.anIntArray9135[i_181_] = 0;
                        Class348_Sub8.anIntArray6655[i_181_] = 0;
                        Class265.anIntArray4692[i_181_] = 0;
                        Class318_Sub9_Sub1.anIntArray8785[i_181_] = 0;
                    }
                    for (int i_182_ = -5; i_182_ < this.anInt3117; i_182_++) {
                        for (int i_183_ = 0; (i_183_ < this.anInt3114); i_183_++) {
                            int i_184_ = i_182_ - -5;
                            if (this.anInt3117 > i_184_) {
                                int i_185_ = ((aByteArrayArrayArray3113[i_180_][i_184_][i_183_]) & 0xff);
                                if (i_185_ > 0) {
                                    Class22 class22 = aClass183_3120.method1380(true, -1 + i_185_);
                                    Class348_Sub24.anIntArray6878[i_183_] += class22.anInt341;
                                    Class348_Sub40_Sub6.anIntArray9135[i_183_] += class22.anInt332;
                                    Class348_Sub8.anIntArray6655[i_183_] += class22.anInt335;
                                    Class265.anIntArray4692[i_183_] += class22.anInt343;
                                    Class318_Sub9_Sub1.anIntArray8785[i_183_]++;
                                }
                            }
                            int i_186_ = i_182_ - 5;
                            if (i_186_ >= 0) {
                                int i_187_ = 0xff & (aByteArrayArrayArray3113[i_180_][i_186_][i_183_]);
                                if (i_187_ > 0) {
                                    Class22 class22 = aClass183_3120.method1380(true, -1 + i_187_);
                                    Class348_Sub24.anIntArray6878[i_183_] -= class22.anInt341;
                                    Class348_Sub40_Sub6.anIntArray9135[i_183_] -= class22.anInt332;
                                    Class348_Sub8.anIntArray6655[i_183_] -= class22.anInt335;
                                    Class265.anIntArray4692[i_183_] -= class22.anInt343;
                                    Class318_Sub9_Sub1.anIntArray8785[i_183_]--;
                                }
                            }
                        }
                        if (i_182_ >= 0) {
                            int i_188_ = 0;
                            int i_189_ = 0;
                            int i_190_ = 0;
                            int i_191_ = 0;
                            int i_192_ = 0;
                            for (int i_193_ = -5; (this.anInt3114 > i_193_); i_193_++) {
                                int i_194_ = 5 + i_193_;
                                if (i_194_ < this.anInt3114) {
                                    i_190_ += (Class348_Sub8.anIntArray6655[i_194_]);
                                    i_189_ += (Class348_Sub40_Sub6.anIntArray9135[i_194_]);
                                    i_188_ += (Class348_Sub24.anIntArray6878[i_194_]);
                                    i_192_ += (Class318_Sub9_Sub1.anIntArray8785[i_194_]);
                                    i_191_ += Class265.anIntArray4692[i_194_];
                                }
                                int i_195_ = i_193_ + -5;
                                if (i_195_ >= 0) {
                                    i_191_ -= Class265.anIntArray4692[i_195_];
                                    i_188_ -= (Class348_Sub24.anIntArray6878[i_195_]);
                                    i_190_ -= (Class348_Sub8.anIntArray6655[i_195_]);
                                    i_192_ -= (Class318_Sub9_Sub1.anIntArray8785[i_195_]);
                                    i_189_ -= (Class348_Sub40_Sub6.anIntArray9135[i_195_]);
                                }
                                if (i_193_ >= 0 && i_191_ > 0 && i_192_ > 0) is[i_182_][i_193_] = Class247.method1890(i_190_ / i_192_, (byte) 66, i_189_ / i_192_, (256 * i_188_ / i_191_));
                            }
                        }
                    }
                    if (!IOException_Sub1.aBoolean86) method1683(var_ha, i_180_ != 0 ? null : var_s, i_180_, (byte) 127, is, aa_Sub1.aSArray5191[i_180_], i_180_ != 0 ? null : var_s_179_);
                    else method1676(i_180_ != 0 ? null : var_s, aa_Sub1.aSArray5191[i_180_], -26833, i_180_ == 0 ? var_s_179_ : null, is, var_ha, i_180_);
                    aByteArrayArrayArray3113[i_180_] = null;
                    aByteArrayArrayArray3123[i_180_] = null;
                    aByteArrayArrayArray3126[i_180_] = null;
                    aByteArrayArrayArray3129[i_180_] = null;
                }
                if (!this.aBoolean3109) {
                    if (Class291.anInt3720 != 0) Class258_Sub3.method1968();
                    if (Class186.aBoolean2492) Class171.method1320();
                }
                for (int i_196_ = 0; (this.anInt3130 > i_196_); i_196_++)
                    aa_Sub1.aSArray5191[i_196_].YA();
            }
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("sr.L(" + (var_s != null ? "{...}" : "null") + ',' + i + ',' + (var_s_179_ != null ? "{...}" : "null") + ',' + (var_ha != null ? "{...}" : "null") + ')'));
        }
    }

    final void method1681(Class348_Sub49 class348_sub49, int i, Class361[] class361s, int i_197_, int i_198_, int i_199_, byte i_200_) {
        try {
            anInt3107++;
            if (!this.aBoolean3109) {
                for (int i_201_ = 0; i_201_ < 4; i_201_++) {
                    Class361 class361 = class361s[i_201_];
                    for (int i_202_ = 0; i_202_ < 64; i_202_++) {
                        for (int i_203_ = 0; i_203_ < 64; i_203_++) {
                            int i_204_ = i_202_ + i;
                            int i_205_ = i_199_ + i_203_;
                            if (i_204_ >= 0 && (i_204_ < this.anInt3117) && i_205_ >= 0 && (this.anInt3114 > i_205_)) class361.method3501((byte) 107, i_205_, i_204_);
                        }
                    }
                }
            }
            int i_206_ = i + i_198_;
            int i_207_ = 65 % ((i_200_ - 34) / 42);
            int i_208_ = i_197_ - -i_199_;
            for (int i_209_ = 0; this.anInt3130 > i_209_; i_209_++) {
                for (int i_210_ = 0; i_210_ < 64; i_210_++) {
                    for (int i_211_ = 0; i_211_ < 64; i_211_++)
                        method1682(false, 0, i_211_ + i_199_, 0, class348_sub49, 0, 1115212770, i + i_210_, i_206_ + i_210_, i_208_ - -i_211_, i_209_);
                }
            }
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("sr.I(" + (class348_sub49 != null ? "{...}" : "null") + ',' + i + ',' + (class361s != null ? "{...}" : "null") + ',' + i_197_ + ',' + i_198_ + ',' + i_199_ + ',' + i_200_ + ')'));
        }
    }

    private final void method1682(boolean bool, int i, int i_212_, int i_213_, Class348_Sub49 class348_sub49, int i_214_, int i_215_, int i_216_, int i_217_, int i_218_, int i_219_) {
        anInt3125++;
        if (i_213_ != 1) {
            if (i_213_ == 2) {
                i = 1;
                i_214_ = 1;
            } else if (i_213_ == 3) i_214_ = 1;
        } else i = 1;
        if (i_216_ < 0 || i_216_ >= this.anInt3117 || i_212_ < 0 || this.anInt3114 <= i_212_) {
            for (; ; ) {
                int i_220_ = class348_sub49.readUnsignedByte(255);
                if (i_220_ == 0) break;
                if (i_220_ == 1) {
                    class348_sub49.readUnsignedByte(i_215_ ^ 0x4278cb1d);
                    break;
                }
                if (i_220_ <= 49) class348_sub49.readUnsignedByte(255);
            }
        } else {
            if (!this.aBoolean3109 && !bool) Class348_Sub33.aByteArrayArrayArray6962[i_219_][i_216_][i_212_] = (byte) 0;
            for (; ; ) {
                int i_221_ = class348_sub49.readUnsignedByte(i_215_ ^ 0x4278cb1d);
                if (i_221_ == 0) {
                    if (this.aBoolean3109) this.anIntArrayArrayArray3122[0][i_214_ + i_216_][i + i_212_] = 0;
                    else if (i_219_ != 0) this.anIntArrayArrayArray3122[i_219_][i_214_ + i_216_][i + i_212_] = -960 + (this.anIntArrayArrayArray3122[-1 + i_219_][i_214_ + i_216_][i + i_212_]);
                    else this.anIntArrayArrayArray3122[0][i_214_ + i_216_][i_212_ - -i] = (8 * -(Class318_Sub1_Sub3_Sub4.method2462(-113, i_217_ + 932731, i_218_ + 556238)) << 2);
                    break;
                }
                if (i_221_ == 1) {
                    int i_222_ = class348_sub49.readUnsignedByte(255);
                    if (this.aBoolean3109) this.anIntArrayArrayArray3122[0][i_216_ - -i_214_][i_212_ + i] = i_222_ * 8 << 2;
                    else {
                        if (i_222_ == 1) i_222_ = 0;
                        if (i_219_ != 0) this.anIntArrayArrayArray3122[i_219_][i_214_ + i_216_][i + i_212_] = (this.anIntArrayArrayArray3122[-1 + i_219_][i_214_ + i_216_][i_212_ - -i]) - (i_222_ * 8 << 2);
                        else this.anIntArrayArrayArray3122[0][i_216_ - -i_214_][i_212_ - -i] = 8 * -i_222_ << 2;
                    }
                    break;
                }
                if (i_221_ <= 49) {
                    if (bool) class348_sub49.readUnsignedByte(255);
                    else {
                        aByteArrayArrayArray3123[i_219_][i_216_][i_212_] = class348_sub49.readByte(i_215_ + -1115212859);
                        aByteArrayArrayArray3126[i_219_][i_216_][i_212_] = (byte) ((i_221_ + -2) / 4);
                        aByteArrayArrayArray3129[i_219_][i_216_][i_212_] = (byte) Class139.method1166(3, -2 + i_221_ + i_213_);
                    }
                } else if (i_221_ <= 81) {
                    if (!this.aBoolean3109 && !bool) Class348_Sub33.aByteArrayArrayArray6962[i_219_][i_216_][i_212_] = (byte) (i_221_ - 49);
                } else if (!bool) aByteArrayArrayArray3113[i_219_][i_216_][i_212_] = (byte) (-81 + i_221_);
            }
        }
        if (i_215_ != 1115212770) this.aByteArrayArrayArray3104 = null;
    }

    private final void method1683(ha var_ha, s var_s, int i, byte i_223_, int[][] is, s var_s_224_, s var_s_225_) {
        do {
            try {
                anInt3111++;
                for (int i_226_ = 0; i_226_ < this.anInt3117; i_226_++) {
                    for (int i_227_ = 0; this.anInt3114 > i_227_; i_227_++) {
                        if (OutputStream_Sub2.anInt101 == -1 || Class58.method536(i_227_, false, i_226_, OutputStream_Sub2.anInt101, i)) {
                            byte i_228_ = aByteArrayArrayArray3126[i][i_226_][i_227_];
                            byte i_229_ = aByteArrayArrayArray3129[i][i_226_][i_227_];
                            int i_230_ = (aByteArrayArrayArray3123[i][i_226_][i_227_] & 0xff);
                            int i_231_ = 0xff & (aByteArrayArrayArray3113[i][i_226_][i_227_]);
                            Class277 class277 = (i_230_ != 0 ? aClass268_3119.method2034(-1 + i_230_, false) : null);
                            if (i_228_ == 0 && class277 == null) i_228_ = (byte) 12;
                            Class22 class22 = (i_231_ == 0 ? null : aClass183_3120.method1380(true, i_231_ - 1));
                            int i_232_ = 0;
                            int i_233_ = 0;
                            if (i_228_ != 0) {
                                i_233_ = (class277 == null ? 0 : (Class348_Sub40_Sub18.anIntArray9249[i_228_]));
                                i_232_ = (class22 != null ? Class43.anIntArray619[i_228_] : 0);
                            } else if (class277 != null) i_233_ = (Class348_Sub40_Sub18.anIntArray9249[i_228_]);
                            else if (class22 != null) i_232_ = (Class348_Sub40_Sub18.anIntArray9249[i_228_]);
                            int i_234_ = i_233_ + i_232_;
                            int i_235_ = 0;
                            if (i_234_ != 0) {
                                int i_236_ = (class277 != null ? class277.anInt3575 : -1);
                                int i_237_ = (class22 != null ? class22.anInt331 : -1);
                                int[] is_238_ = new int[i_234_];
                                int[] is_239_ = new int[i_234_];
                                int[] is_240_ = new int[i_234_];
                                int[] is_241_ = new int[i_234_];
                                boolean bool = false;
                                boolean bool_242_ = false;
                                if (class277 == null || (class277.anInt3563 == -1 && (class277.anInt3569 == -1) && i_236_ == -1)) {
                                    bool_242_ = true;
                                    for (int i_243_ = 0; i_243_ < i_233_; i_243_++) {
                                        is_238_[i_235_] = -1;
                                        i_235_++;
                                    }
                                } else {
                                    for (int i_244_ = 0; (i_233_ > i_244_); i_244_++) {
                                        is_240_[i_235_] = i_236_;
                                        is_241_[i_235_] = class277.anInt3570;
                                        if (class277.anInt3563 != -1) is_238_[i_235_] = (class277.anInt3563);
                                        else is_238_[i_235_] = -1;
                                        if (class277.anInt3569 == -1) is_239_[i_235_] = -1;
                                        else {
                                            bool = true;
                                            is_239_[i_235_] = (class277.anInt3569);
                                        }
                                        i_235_++;
                                    }
                                    if (!this.aBoolean3109 && i == 0) Class333.method2643(i_226_, i_227_, class277.anInt3559, (class277.anInt3558 * 8), class277.anInt3574);
                                }
                                if (!bool) is_239_ = null;
                                if (class22 == null) {
                                    if (bool_242_) continue;
                                    for (int i_245_ = 0; i_245_ < i_232_; i_245_++) {
                                        is_238_[i_235_] = -1;
                                        i_235_++;
                                    }
                                } else {
                                    for (int i_246_ = 0; (i_232_ > i_246_); i_246_++) {
                                        is_240_[i_235_] = i_237_;
                                        is_241_[i_235_] = class22.anInt336;
                                        is_238_[i_235_] = is[i_226_][i_227_];
                                        if (is_239_ != null) is_239_[i_235_] = -1;
                                        i_235_++;
                                    }
                                }
                                int i_247_ = anIntArray3124.length;
                                int[] is_248_ = new int[i_247_];
                                int[] is_249_ = new int[i_247_];
                                int[] is_250_ = var_s == null ? null : new int[i_247_];
                                int[] is_251_ = (var_s != null || var_s_225_ != null ? new int[i_247_] : null);
                                for (int i_252_ = 0; i_247_ > i_252_; i_252_++) {
                                    int i_253_ = anIntArray3124[i_252_];
                                    int i_254_ = anIntArray3128[i_252_];
                                    if (i_229_ == 0) {
                                        is_248_[i_252_] = i_253_;
                                        is_249_[i_252_] = i_254_;
                                    } else if (i_229_ == 1) {
                                        is_248_[i_252_] = i_254_;
                                        int i_256_ = i_253_;
                                        is_249_[i_252_] = 512 - i_256_;
                                    } else if (i_229_ == 2) {
                                        is_248_[i_252_] = -i_253_ + 512;
                                        is_249_[i_252_] = 512 - i_254_;
                                    } else if (i_229_ == 3) {
                                        is_248_[i_252_] = 512 - i_254_;
                                        int i_255_ = i_253_;
                                        is_249_[i_252_] = i_255_;
                                    }
                                    if (is_250_ != null && (Class160.aBooleanArrayArray2133[i_228_][i_252_])) {
                                        int i_257_ = (is_248_[i_252_] + (i_226_ << 9));
                                        int i_258_ = ((i_227_ << 9) - -is_249_[i_252_]);
                                        is_250_[i_252_] = (var_s.method3986(i_257_, i_258_, (byte) -101) + -(var_s_224_.method3986(i_257_, i_258_, (byte) -12)));
                                    }
                                    if (is_251_ != null) {
                                        if (var_s != null && !(Class160.aBooleanArrayArray2133[i_228_][i_252_])) {
                                            int i_259_ = (is_248_[i_252_] + (i_226_ << 9));
                                            int i_260_ = ((i_227_ << 9) + is_249_[i_252_]);
                                            is_251_[i_252_] = ((var_s_224_.method3986(i_259_, i_260_, (byte) 87)) - (var_s.method3986(i_259_, i_260_, (byte) -90)));
                                        } else if (var_s_225_ != null && !(Class348_Sub42_Sub1.aBooleanArrayArray9495[i_228_][i_252_])) {
                                            int i_261_ = (is_248_[i_252_] + (i_226_ << 9));
                                            int i_262_ = (is_249_[i_252_] + (i_227_ << 9));
                                            is_251_[i_252_] = ((var_s_225_.method3986(i_261_, i_262_, (byte) -128)) + -(var_s_224_.method3986(i_261_, i_262_, (byte) -1)));
                                        }
                                    }
                                }
                                int i_263_ = var_s_224_.method3982((byte) -86, i_227_, i_226_);
                                int i_264_ = var_s_224_.method3982((byte) -86, i_227_, 1 + i_226_);
                                int i_265_ = var_s_224_.method3982((byte) -86, 1 + i_227_, i_226_ - -1);
                                int i_266_ = var_s_224_.method3982((byte) -86, i_227_ + 1, i_226_);
                                boolean bool_267_ = Class79.method802(i_227_, i_226_, true);
                                if (bool_267_ && i > 1 || !bool_267_ && i > 0) {
                                    boolean bool_268_ = true;
                                    if (class22 != null && !class22.aBoolean334) bool_268_ = false;
                                    else if (i_231_ == 0 && i_228_ != 0) bool_268_ = false;
                                    else if (i_230_ > 0 && class277 != null && !(class277.aBoolean3561)) bool_268_ = false;
                                    if (bool_268_ && (i_264_ == i_263_) && (i_263_ == i_265_) && (i_263_ == i_266_)) this.aByteArrayArrayArray3108[i][i_226_][i_227_] = (byte) (Class273.method2057((this.aByteArrayArrayArray3108[i][i_226_][i_227_]), 4));
                                }
                                int i_269_ = 0;
                                int i_270_ = 0;
                                int i_271_ = 0;
                                if (this.aBoolean3109) {
                                    i_269_ = Class367_Sub8.method3547(i_226_, i_227_);
                                    i_270_ = Class318_Sub1_Sub5.method2483(i_226_, i_227_);
                                    i_271_ = Class199.method1457(i_226_, i_227_);
                                }
                                var_s_224_.method3978(i_226_, i_227_, is_248_, is_250_, is_249_, is_251_, Class10.anIntArrayArray174[i_228_], Class68.anIntArrayArray1190[i_228_], (Class348_Sub12.anIntArrayArray6740[i_228_]), is_238_, is_239_, is_240_, is_241_, i_269_, i_270_, i_271_, false);
                                Class185.method1394(i, i_226_, i_227_);
                            }
                        }
                    }
                }
                if (i_223_ >= 115) break;
                this.anInt3117 = 57;
            } catch (RuntimeException runtimeexception) {
                throw Class348_Sub17.method2929(runtimeexception, ("sr.H(" + (var_ha != null ? "{...}" : "null") + ',' + (var_s != null ? "{...}" : "null") + ',' + i + ',' + i_223_ + ',' + (is != null ? "{...}" : "null") + ',' + (var_s_224_ != null ? "{...}" : "null") + ',' + (var_s_225_ != null ? "{...}" : "null") + ')'));
            }
            break;
        } while (false);
    }

    final void method1684(int i, int i_272_, int i_273_, Class348_Sub49 class348_sub49, int i_274_, int i_275_, int i_276_, Class361[] class361s, int i_277_, int i_278_) {
        try {
            if (i_273_ == -1) {
                anInt3115++;
                int i_279_ = 8 * (i_276_ & 0x7);
                int i_280_ = 8 * (0x7 & i_274_);
                if (!this.aBoolean3109) {
                    Class361 class361 = class361s[i_272_];
                    for (int i_281_ = 0; i_281_ < 8; i_281_++) {
                        for (int i_282_ = 0; i_282_ < 8; i_282_++) {
                            int i_283_ = i + Class295.method2220(0x7 & i_282_, i_277_, 0x7 & i_281_, (byte) 71);
                            int i_284_ = (Class87.method837(i_281_ & 0x7, true, 0x7 & i_282_, i_277_) + i_275_);
                            if (i_283_ > 0 && i_283_ < -1 + this.anInt3117 && i_284_ > 0 && this.anInt3114 + -1 > i_284_) class361.method3501((byte) 124, i_284_, i_283_);
                        }
                    }
                }
                int i_285_ = (i_276_ & ~0x7) << 3;
                int i_286_ = (~0x7 & i_274_) << 3;
                int i_287_ = 0;
                int i_288_ = 0;
                if (i_277_ != 1) {
                    if (i_277_ == 2) {
                        i_288_ = 1;
                        i_287_ = 1;
                    } else if (i_277_ == 3) i_287_ = 1;
                } else i_288_ = 1;
                for (int i_289_ = 0; this.anInt3130 > i_289_; i_289_++) {
                    for (int i_290_ = 0; i_290_ < 64; i_290_++) {
                        for (int i_291_ = 0; i_291_ < 64; i_291_++) {
                            if (i_278_ != i_289_ || i_279_ > i_290_ || i_290_ > i_279_ - -8 || i_280_ > i_291_ || 8 + i_280_ < i_291_) method1682(false, 0, -1, 0, class348_sub49, 0, 1115212770, -1, 0, 0, 0);
                            else {
                                int i_292_;
                                int i_293_;
                                if (i_290_ == i_279_ + 8 || i_280_ - -8 == i_291_) {
                                    if (i_277_ == 0) {
                                        i_292_ = -i_280_ + (i_291_ + i_275_);
                                        i_293_ = -i_279_ - -i_290_ + i;
                                    } else if (i_277_ == 1) {
                                        i_292_ = i_275_ + 8 + (i_279_ + -i_290_);
                                        i_293_ = i_291_ - (i_280_ - i);
                                    } else if (i_277_ == 2) {
                                        i_292_ = i_275_ + 8 + (-i_291_ + i_280_);
                                        i_293_ = i_279_ - i_290_ + i + 8;
                                    } else {
                                        i_293_ = i_280_ - (i_291_ - i) - -8;
                                        i_292_ = i_275_ - (i_279_ + -i_290_);
                                    }
                                    method1682(true, 0, i_292_, 0, class348_sub49, 0, 1115212770, i_293_, i_290_ + i_285_, i_291_ + i_286_, i_272_);
                                } else {
                                    i_293_ = Class295.method2220(0x7 & i_291_, i_277_, i_290_ & 0x7, (byte) 71) + i;
                                    i_292_ = (i_275_ + Class87.method837(0x7 & i_290_, true, 0x7 & i_291_, i_277_));
                                    method1682(false, i_288_, i_292_, i_277_, class348_sub49, i_287_, 1115212770, i_293_, i_285_ - -i_290_, i_291_ + i_286_, i_272_);
                                }
                                if (i_290_ == 63 || i_291_ == 63) {
                                    int i_294_ = 1;
                                    if (i_290_ == 63 && i_291_ == 63) i_294_ = 3;
                                    for (int i_295_ = 0; (i_294_ > i_295_); i_295_++) {
                                        int i_296_ = i_290_;
                                        int i_297_ = i_291_;
                                        if (i_295_ == 0) {
                                            i_297_ = (i_291_ == 63 ? 64 : i_291_);
                                            i_296_ = i_290_ == 63 ? 64 : i_290_;
                                        } else if (i_295_ == 1) i_296_ = 64;
                                        else if (i_295_ == 2) i_297_ = 64;
                                        int i_298_;
                                        int i_299_;
                                        if (i_277_ == 0) {
                                            i_298_ = -i_280_ - -i_297_ + i_275_;
                                            i_299_ = i_296_ + -i_279_ + i;
                                        } else if (i_277_ == 1) {
                                            i_298_ = i_279_ - (i_296_ - i_275_) - -8;
                                            i_299_ = i + i_297_ - i_280_;
                                        } else if (i_277_ == 2) {
                                            i_298_ = (8 + i_275_ + -i_297_ + i_280_);
                                            i_299_ = i_279_ - (i_296_ - i - 8);
                                        } else {
                                            i_299_ = -i_297_ - -i_280_ + 8 + i;
                                            i_298_ = -i_279_ - -i_296_ + i_275_;
                                        }
                                        if (i_299_ >= 0 && (i_299_ < this.anInt3117) && i_298_ >= 0 && (this.anInt3114 > i_298_)) this.anIntArrayArrayArray3122[i_272_][i_299_][i_298_] = (this.anIntArrayArrayArray3122[i_272_][i_287_ + i_293_][i_288_ + i_292_]);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("sr.E(" + i + ',' + i_272_ + ',' + i_273_ + ',' + (class348_sub49 != null ? "{...}" : "null") + ',' + i_274_ + ',' + i_275_ + ',' + i_276_ + ',' + (class361s != null ? "{...}" : "null") + ',' + i_277_ + ',' + i_278_ + ')'));
        }
    }

    final void method1685(ha var_ha, int[][][] is, int i, Class361[] class361s) {
        try {
            anInt3118++;
            if (i != 21407) method1680(null, (byte) -116, null, null);
            if (!this.aBoolean3109) {
                for (int i_300_ = 0; i_300_ < 4; i_300_++) {
                    for (int i_301_ = 0; (i_301_ < this.anInt3117); i_301_++) {
                        for (int i_302_ = 0; this.anInt3114 > i_302_; i_302_++) {
                            if ((0x1 & (Class348_Sub33.aByteArrayArrayArray6962[i_300_][i_301_][i_302_])) != 0) {
                                int i_303_ = i_300_;
                                if ((0x2 & (Class348_Sub33.aByteArrayArrayArray6962[1][i_301_][i_302_])) != 0) i_303_--;
                                if (i_303_ >= 0) class361s[i_303_].method3507(i_302_, i_301_, (byte) -116);
                            }
                        }
                    }
                }
            }
            for (int i_304_ = 0; this.anInt3130 > i_304_; i_304_++) {
                int i_305_ = 0;
                int i_306_ = 0;
                if (!this.aBoolean3109) {
                    if (Class186.aBoolean2492) i_305_ |= 0x2;
                    if (Class369.aBoolean4972) i_306_ |= 0x8;
                    if (Class291.anInt3720 != 0) {
                        if (i_304_ == 0 | Class296.aBoolean3767) i_306_ |= 0x10;
                        i_305_ |= 0x1;
                    }
                }
                if (Class186.aBoolean2492) i_306_ |= 0x7;
                if (!Class47.aBoolean845) i_306_ |= 0x20;
                int[][] is_307_ = (is == null || is.length <= i_304_ ? this.anIntArrayArrayArray3122[i_304_] : is[i_304_]);
                Class348_Sub45.method3313(i_304_, var_ha.method3648(this.anInt3117, this.anInt3114, (this.anIntArrayArrayArray3122[i_304_]), is_307_, 512, i_305_, i_306_));
            }
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("sr.J(" + (var_ha != null ? "{...}" : "null") + ',' + (is != null ? "{...}" : "null") + ',' + i + ',' + (class361s != null ? "{...}" : "null") + ')'));
        }
    }

    static final void method1686(int i) {
        int i_308_ = -110 / ((i - -74) / 44);
        if (Class348_Sub40_Sub29.anInt9372 > 1) Class316.aClass348_Sub51_3959.method3429((byte) 74, (Class316.aClass348_Sub51_3959.aClass239_Sub17_7263), 4);
        else Class316.aClass348_Sub51_3959.method3429((byte) 74, (Class316.aClass348_Sub51_3959.aClass239_Sub17_7263), 2);
        anInt3106++;
    }

    static final Class46 method1687(Class46 class46, int i) {
        if (i != 3) method1686(-21);
        anInt3110++;
        if (class46.anInt834 != -1) return Class324.method2570(1512932720, class46.anInt834);
        int i_309_ = class46.anInt830 >>> 16;
        Class333 class333 = new Class333(Class125.aClass356_4915);
        for (Class348_Sub41 class348_sub41 = (Class348_Sub41) class333.method2644((byte) 123); class348_sub41 != null; class348_sub41 = (Class348_Sub41) class333.method2646((byte) 117)) {
            if (i_309_ == class348_sub41.anInt7050) return Class324.method2570(1512932720, (int) (class348_sub41.aLong4291));
        }
        return null;
    }

    final void method1688(int i, int i_310_, int i_311_, int i_312_, int i_313_) {
        if (i_312_ > 50) {
            for (int i_314_ = 0; (this.anInt3130 > i_314_); i_314_++)
                method1678(i_313_, i_310_, i, -124, i_311_, i_314_);
            anInt3127++;
        }
    }

    Class237(int i, int i_315_, int i_316_, boolean bool, Class268 class268, Class183 class183) {
        anIntArray3124 = new int[]{0, 256, 512, 512, 512, 256, 0, 0, 128, 256, 128, 384, 256};
        try {
            this.aBoolean3109 = bool;
            aClass268_3119 = class268;
            aClass183_3120 = class183;
            this.anInt3117 = i_315_;
            this.anInt3130 = i;
            this.anInt3114 = i_316_;
            this.anIntArrayArrayArray3122 = (new int[this.anInt3130]
                    [this.anInt3117 + 1]
                    [1 + this.anInt3114]);
            this.aByteArrayArrayArray3108 = (new byte[this.anInt3130]
                    [this.anInt3117 - -1]
                    [1 + this.anInt3114]);
            aByteArrayArrayArray3113 = (new byte[this.anInt3130]
                    [this.anInt3117][this.anInt3114]);
            aByteArrayArrayArray3129 = (new byte[this.anInt3130]
                    [this.anInt3117][this.anInt3114]);
            aByteArrayArrayArray3126 = (new byte[this.anInt3130]
                    [this.anInt3117][this.anInt3114]);
            aByteArrayArrayArray3123 = (new byte[this.anInt3130]
                    [this.anInt3117][this.anInt3114]);
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("sr.<init>(" + i + ',' + i_315_ + ',' + i_316_ + ',' + bool + ',' + (class268 != null ? "{...}" : "null") + ',' + (class183 != null ? "{...}" : "null") + ')'));
        }
    }
}
