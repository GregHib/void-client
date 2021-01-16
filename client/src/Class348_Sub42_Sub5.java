/* Class348_Sub42_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class348_Sub42_Sub5 extends Class348_Sub42 {
    private final Class348_Sub40[] aClass348_Sub40Array9520;
    private final Class348_Sub40 aClass348_Sub40_9521;
    static int anInt9522;
    private final int[] anIntArray9523;
    private final int[] anIntArray9524;
    static int anInt9525;
    static int anInt9526;
    private final Class348_Sub40 aClass348_Sub40_9527;
    private final Class348_Sub40 aClass348_Sub40_9528;
    static int anInt9529;
    static Class138 aClass138_9530 = new Class138(6, 0, 4, 2);
    static double aDouble9531;
    static int anInt9532;
    static Class351 aClass351_9533;
    static Interface6[] anInterface6Array9534 = new Interface6[128];

    final int[] method3183(d var_d, int i, int i_0_, boolean bool, double d, Class45 class45, byte i_1_) {
        try {
            anInt9522++;
            Class286_Sub5.aD6247 = var_d;
            Class348.aClass45_4286 = class45;
            for (int i_2_ = 0; aClass348_Sub40Array9520.length > i_2_; i_2_++)
                aClass348_Sub40Array9520[i_2_].method3045(i, i_0_, -256);
            Class348_Sub42_Sub13.method3232(d, (byte) -122);
            Class79.method797(i_0_, i, (byte) 114);
            int[] is = new int[i * i_0_];
            int i_3_ = 0;
            for (int i_4_ = 0; i_0_ > i_4_; i_4_++) {
                int[] is_5_;
                int[] is_6_;
                int[] is_7_;
                if (aClass348_Sub40_9521.aBoolean7045) {
                    int[] is_8_ = aClass348_Sub40_9521.method3042(i_4_, 255);
                    is_7_ = is_8_;
                    is_5_ = is_8_;
                    is_6_ = is_8_;
                } else {
                    int[][] is_9_ = aClass348_Sub40_9521.method3047(i_4_, -1564599039);
                    is_5_ = is_9_[2];
                    is_6_ = is_9_[1];
                    is_7_ = is_9_[0];
                }
                if (bool) i_3_ = i_4_;
                int[] is_10_;
                if (aClass348_Sub40_9527.aBoolean7045) is_10_ = aClass348_Sub40_9527.method3042(i_4_, i_1_ + 244);
                else is_10_ = (aClass348_Sub40_9527.method3047(i_4_, -1564599039)[0]);
                for (int i_11_ = i - 1; i_11_ >= 0; i_11_--) {
                    int i_12_ = is_7_[i_11_] >> 1832681924;
                    if (i_12_ > 255) i_12_ = 255;
                    if (i_12_ < 0) i_12_ = 0;
                    int i_13_ = is_6_[i_11_] >> 1956846788;
                    if (i_13_ > 255) i_13_ = 255;
                    if (i_13_ < 0) i_13_ = 0;
                    int i_14_ = is_5_[i_11_] >> -816062588;
                    if (i_14_ > 255) i_14_ = 255;
                    i_13_ = Class318_Sub1_Sub3_Sub3.anIntArray10266[i_13_];
                    if (i_14_ < 0) i_14_ = 0;
                    i_12_ = Class318_Sub1_Sub3_Sub3.anIntArray10266[i_12_];
                    i_14_ = Class318_Sub1_Sub3_Sub3.anIntArray10266[i_14_];
                    int i_15_;
                    if (i_12_ == 0 && i_13_ == 0 && i_14_ == 0) i_15_ = 0;
                    else {
                        i_15_ = is_10_[i_11_] >> 153204452;
                        if (i_15_ > 255) i_15_ = 255;
                        if (i_15_ < 0) i_15_ = 0;
                    }
                    is[i_3_++] = (i_14_ + (i_15_ << 881050840) + ((i_12_ << 521342256) + (i_13_ << 1696622760)));
                    if (bool) i_3_ += -1 + i;
                }
            }
            for (int i_16_ = 0; (i_16_ < aClass348_Sub40Array9520.length); i_16_++)
                aClass348_Sub40Array9520[i_16_].method3046((byte) -116);
            if (i_1_ != 11) anInt9532 = 97;
            return is;
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("lr.D(" + (var_d != null ? "{...}" : "null") + ',' + i + ',' + i_0_ + ',' + bool + ',' + d + ',' + (class45 != null ? "{...}" : "null") + ',' + i_1_ + ')'));
        }
    }

    final boolean method3184(d var_d, Class45 class45, int i) {
        try {
            anInt9529++;
            if (Class101_Sub2.anInt5713 < 0) {
                for (int i_17_ = 0; (anIntArray9524.length > i_17_); i_17_++) {
                    if (!class45.method421(false, anIntArray9524[i_17_])) return false;
                }
            } else {
                for (int i_18_ = 0; (i_18_ < anIntArray9524.length); i_18_++) {
                    if (!class45.method420(-10499, Class101_Sub2.anInt5713, anIntArray9524[i_18_])) return false;
                }
            }
            int i_19_ = 0;
            int i_20_ = -109 / ((10 - i) / 60);
            for (/**/; i_19_ < anIntArray9523.length; i_19_++) {
                if (!var_d.method4(-7953, anIntArray9523[i_19_])) return false;
            }
            return true;
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("lr.B(" + (var_d != null ? "{...}" : "null") + ',' + (class45 != null ? "{...}" : "null") + ',' + i + ')'));
        }
    }

    final int[] method3185(int i, d var_d, int i_21_, boolean bool, double d, boolean bool_22_, Class45 class45, int i_23_) {
        try {
            Class286_Sub5.aD6247 = var_d;
            Class348.aClass45_4286 = class45;
            anInt9526++;
            for (int i_24_ = 0; aClass348_Sub40Array9520.length > i_24_; i_24_++)
                aClass348_Sub40Array9520[i_24_].method3045(i, i_23_, i_21_ + -256);
            Class348_Sub42_Sub13.method3232(d, (byte) -89);
            Class79.method797(i_23_, i, (byte) 122);
            int[] is = new int[i_23_ * i];
            int i_25_;
            int i_26_;
            int i_27_;
            if (bool_22_) {
                i_25_ = i - 1;
                i_26_ = -1;
                i_27_ = -1;
            } else {
                i_25_ = 0;
                i_26_ = 1;
                i_27_ = i;
            }
            int i_28_ = 0;
            for (int i_29_ = 0; i_23_ > i_29_; i_29_++) {
                int[] is_30_;
                int[] is_31_;
                int[] is_32_;
                if (aClass348_Sub40_9521.aBoolean7045) {
                    int[] is_33_ = aClass348_Sub40_9521.method3042(i_29_, 255);
                    is_30_ = is_33_;
                    is_31_ = is_33_;
                    is_32_ = is_33_;
                } else {
                    int[][] is_34_ = aClass348_Sub40_9521.method3047(i_29_, -1564599039);
                    is_30_ = is_34_[1];
                    is_31_ = is_34_[0];
                    is_32_ = is_34_[2];
                }
                if (bool) i_28_ = i_29_;
                for (int i_35_ = i_25_; i_35_ != i_27_; i_35_ += i_26_) {
                    int i_36_ = is_31_[i_35_] >> -168548476;
                    if (i_36_ > 255) i_36_ = 255;
                    if (i_36_ < 0) i_36_ = 0;
                    int i_37_ = is_30_[i_35_] >> -1597493052;
                    if (i_37_ > 255) i_37_ = 255;
                    if (i_37_ < 0) i_37_ = 0;
                    int i_38_ = is_32_[i_35_] >> -310157596;
                    if (i_38_ > 255) i_38_ = 255;
                    i_37_ = Class318_Sub1_Sub3_Sub3.anIntArray10266[i_37_];
                    i_36_ = Class318_Sub1_Sub3_Sub3.anIntArray10266[i_36_];
                    if (i_38_ < 0) i_38_ = 0;
                    i_38_ = Class318_Sub1_Sub3_Sub3.anIntArray10266[i_38_];
                    int i_39_ = (i_37_ << 1965956712) + (i_36_ << 934532560) + i_38_;
                    if (i_39_ != 0) i_39_ |= ~0xffffff;
                    is[i_28_++] = i_39_;
                    if (bool) i_28_ += -1 + i;
                }
            }
            for (int i_40_ = i_21_; (aClass348_Sub40Array9520.length > i_40_); i_40_++)
                aClass348_Sub40Array9520[i_40_].method3046((byte) -106);
            return is;
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("lr.C(" + i + ',' + (var_d != null ? "{...}" : "null") + ',' + i_21_ + ',' + bool + ',' + d + ',' + bool_22_ + ',' + (class45 != null ? "{...}" : "null") + ',' + i_23_ + ')'));
        }
    }

    final float[] method3186(int i, d var_d, boolean bool, int i_41_, Class45 class45, int i_42_) {
        try {
            anInt9525++;
            Class348.aClass45_4286 = class45;
            Class286_Sub5.aD6247 = var_d;
            if (i_42_ >= -1) method3183(null, -60, 98, false, -0.11623531533038078, null, (byte) -72);
            for (int i_43_ = 0; aClass348_Sub40Array9520.length > i_43_; i_43_++)
                aClass348_Sub40Array9520[i_43_].method3045(i, i_41_, -256);
            Class79.method797(i_41_, i, (byte) 115);
            float[] fs = new float[4 * i * i_41_];
            int i_44_ = 0;
            for (int i_45_ = 0; i_41_ > i_45_; i_45_++) {
                int[] is;
                int[] is_46_;
                int[] is_47_;
                if (aClass348_Sub40_9521.aBoolean7045) {
                    int[] is_49_ = aClass348_Sub40_9521.method3042(i_45_, 255);
                    is = is_49_;
                    is_46_ = is_49_;
                    is_47_ = is_49_;
                } else {
                    int[][] is_48_ = aClass348_Sub40_9521.method3047(i_45_, -1564599039);
                    is_46_ = is_48_[1];
                    is_47_ = is_48_[0];
                    is = is_48_[2];
                }
                int[] is_50_;
                if (aClass348_Sub40_9527.aBoolean7045) is_50_ = aClass348_Sub40_9527.method3042(i_45_, 255);
                else is_50_ = (aClass348_Sub40_9527.method3047(i_45_, -1564599039)[0]);
                int[] is_51_;
                if (aClass348_Sub40_9528.aBoolean7045) is_51_ = aClass348_Sub40_9528.method3042(i_45_, 255);
                else is_51_ = (aClass348_Sub40_9528.method3047(i_45_, -1564599039)[0]);
                if (bool) i_44_ = i_45_ << 1696393858;
                for (int i_52_ = i + -1; i_52_ >= 0; i_52_--) {
                    float f = (float) is_50_[i_52_] / 4096.0F;
                    float f_53_ = ((31.0F * (float) is_51_[i_52_] / 4096.0F + 1.0F) / 4096.0F);
                    if (!(f < 0.0F)) {
                        if (f > 1.0F) f = 1.0F;
                    } else f = 0.0F;
                    fs[i_44_++] = (float) is_47_[i_52_] * f_53_;
                    fs[i_44_++] = f_53_ * (float) is_46_[i_52_];
                    fs[i_44_++] = (float) is[i_52_] * f_53_;
                    fs[i_44_++] = f;
                    if (bool) i_44_ += -4 + (i << 842241826);
                }
            }
            for (int i_54_ = 0; (aClass348_Sub40Array9520.length > i_54_); i_54_++)
                aClass348_Sub40Array9520[i_54_].method3046((byte) -125);
            return fs;
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("lr.A(" + i + ',' + (var_d != null ? "{...}" : "null") + ',' + bool + ',' + i_41_ + ',' + (class45 != null ? "{...}" : "null") + ',' + i_42_ + ')'));
        }
    }

    public static void method3187(byte i) {
        anInterface6Array9534 = null;
        int i_55_ = 19 % ((76 - i) / 39);
        aClass351_9533 = null;
        aClass138_9530 = null;
    }

    public Class348_Sub42_Sub5() {
        anIntArray9523 = new int[0];
        anIntArray9524 = new int[0];
        aClass348_Sub40_9528 = new Class348_Sub40_Sub15(0);
        aClass348_Sub40_9528.anInt7036 = 1;
        aClass348_Sub40_9521 = new Class348_Sub40_Sub15();
        aClass348_Sub40_9521.anInt7036 = 1;
        aClass348_Sub40_9527 = new Class348_Sub40_Sub15();
        aClass348_Sub40Array9520 = new Class348_Sub40[]{aClass348_Sub40_9521, aClass348_Sub40_9527, aClass348_Sub40_9528};
        aClass348_Sub40_9527.anInt7036 = 1;
    }

    Class348_Sub42_Sub5(Class348_Sub49 class348_sub49) {
        int i = class348_sub49.method3387(255);
        int i_56_ = 0;
        int i_57_ = 0;
        int[][] is = new int[i][];
        aClass348_Sub40Array9520 = new Class348_Sub40[i];
        for (int i_58_ = 0; i_58_ < i; i_58_++) {
            Class348_Sub40 class348_sub40 = Class348_Sub37.method3031(125, class348_sub49);
            if (class348_sub40.method3037(-121) >= 0) i_56_++;
            if (class348_sub40.method3043(-1) >= 0) i_57_++;
            int i_59_ = (class348_sub40.aClass348_Sub40Array7031).length;
            is[i_58_] = new int[i_59_];
            for (int i_60_ = 0; i_60_ < i_59_; i_60_++)
                is[i_58_][i_60_] = class348_sub49.method3387(255);
            aClass348_Sub40Array9520[i_58_] = class348_sub40;
        }
        anIntArray9524 = new int[i_56_];
        anIntArray9523 = new int[i_57_];
        i_56_ = 0;
        i_57_ = 0;
        for (int i_61_ = 0; i > i_61_; i_61_++) {
            Class348_Sub40 class348_sub40 = aClass348_Sub40Array9520[i_61_];
            int i_62_ = (class348_sub40.aClass348_Sub40Array7031).length;
            for (int i_63_ = 0; i_62_ > i_63_; i_63_++)
                class348_sub40.aClass348_Sub40Array7031[i_63_] = aClass348_Sub40Array9520[is[i_61_][i_63_]];
            int i_64_ = class348_sub40.method3037(-119);
            int i_65_ = class348_sub40.method3043(-1);
            if (i_64_ > 0) anIntArray9524[i_56_++] = i_64_;
            if (i_65_ > 0) anIntArray9523[i_57_++] = i_65_;
            is[i_61_] = null;
        }
        aClass348_Sub40_9521 = aClass348_Sub40Array9520[class348_sub49.method3387(255)];
        aClass348_Sub40_9527 = aClass348_Sub40Array9520[class348_sub49.method3387(255)];
        aClass348_Sub40_9528 = aClass348_Sub40Array9520[class348_sub49.method3387(255)];
        Object object = null;
    }

    static {
        aClass351_9533 = new Class351(57, 3);
    }
}
