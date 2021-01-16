/* Class348_Sub10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class348_Sub10 extends Class348 {
    private static float[] aFloatArray6700;
    private float[] aFloatArray6701;
    private int anInt6702;
    private byte[][] aByteArrayArray6703;
    private static Class276[] aClass276Array6704;
    private static int[] anIntArray6705;
    private boolean aBoolean6706;
    private static float[] aFloatArray6707;
    private static float[] aFloatArray6708;
    private static int[] anIntArray6709;
    private static Class343[] aClass343Array6710;
    private static int anInt6711;
    private static float[] aFloatArray6712;
    private static boolean[] aBooleanArray6713;
    private static byte[] aByteArray6714;
    private static Class210[] aClass210Array6715;
    private int anInt6716;
    private int anInt6717;
    static Class370[] aClass370Array6718;
    private static int[] anIntArray6719;
    private static float[] aFloatArray6720;
    private static int anInt6721;
    private static float[] aFloatArray6722;
    private int anInt6723;
    private static boolean aBoolean6724 = false;
    private static int anInt6725;
    private static float[] aFloatArray6726;
    private int anInt6727;
    private boolean aBoolean6728;
    private static int anInt6729;
    private int anInt6730;
    private byte[] aByteArray6731;
    private int anInt6732;
    private int anInt6733;

    private static final void method2784(byte[] is, int i) {
        aByteArray6714 = is;
        anInt6729 = i;
        anInt6711 = 0;
    }

    public static void method2785() {
        aByteArray6714 = null;
        aClass370Array6718 = null;
        aClass210Array6715 = null;
        aClass343Array6710 = null;
        aClass276Array6704 = null;
        aBooleanArray6713 = null;
        anIntArray6709 = null;
        aFloatArray6707 = null;
        aFloatArray6722 = null;
        aFloatArray6720 = null;
        aFloatArray6708 = null;
        aFloatArray6712 = null;
        aFloatArray6726 = null;
        aFloatArray6700 = null;
        anIntArray6719 = null;
        anIntArray6705 = null;
    }

    static final float method2786(int i) {
        int i_0_ = i & 0x1fffff;
        int i_1_ = i & ~0x7fffffff;
        int i_2_ = (i & 0x7fe00000) >> 21;
        if (i_1_ != 0) i_0_ = -i_0_;
        return (float) ((double) i_0_ * Math.pow(2.0, i_2_ - 788));
    }

    private final void method2787(byte[] is) {
        Class348_Sub49 class348_sub49 = new Class348_Sub49(is);
        anInt6702 = class348_sub49.method3385((byte) -126);
        anInt6716 = class348_sub49.method3385((byte) -126);
        anInt6723 = class348_sub49.method3385((byte) -126);
        anInt6717 = class348_sub49.method3385((byte) -126);
        if (anInt6717 < 0) {
            anInt6717 = ~anInt6717;
            aBoolean6728 = true;
        }
        int i = class348_sub49.method3385((byte) -126);
        aByteArrayArray6703 = new byte[i][];
        for (int i_3_ = 0; i_3_ < i; i_3_++) {
            int i_4_ = 0;
            int i_5_;
            do {
                i_5_ = class348_sub49.method3387(255);
                i_4_ += i_5_;
            } while (i_5_ >= 255);
            byte[] is_6_ = new byte[i_4_];
            class348_sub49.method3389(2147483647, 0, i_4_, is_6_);
            aByteArrayArray6703[i_3_] = is_6_;
        }
    }

    static final int method2788() {
        int i = aByteArray6714[anInt6729] >> anInt6711 & 0x1;
        anInt6711++;
        anInt6729 += anInt6711 >> 3;
        anInt6711 &= 0x7;
        return i;
    }

    static final int method2789(int i) {
        int i_7_ = 0;
        int i_8_ = 0;
        int i_9_;
        for (/**/; i >= 8 - anInt6711; i -= i_9_) {
            i_9_ = 8 - anInt6711;
            int i_10_ = (1 << i_9_) - 1;
            i_7_ += (aByteArray6714[anInt6729] >> anInt6711 & i_10_) << i_8_;
            anInt6711 = 0;
            anInt6729++;
            i_8_ += i_9_;
        }
        if (i > 0) {
            i_9_ = (1 << i) - 1;
            i_7_ += (aByteArray6714[anInt6729] >> anInt6711 & i_9_) << i_8_;
            anInt6711 += i;
        }
        return i_7_;
    }

    private static final void method2790(byte[] is) {
        method2784(is, 0);
        anInt6725 = 1 << method2789(4);
        anInt6721 = 1 << method2789(4);
        aFloatArray6707 = new float[anInt6721];
        for (int i = 0; i < 2; i++) {
            int i_11_ = i != 0 ? anInt6721 : anInt6725;
            int i_12_ = i_11_ >> 1;
            int i_13_ = i_11_ >> 2;
            int i_14_ = i_11_ >> 3;
            float[] fs = new float[i_12_];
            for (int i_15_ = 0; i_15_ < i_13_; i_15_++) {
                fs[2 * i_15_] = (float) Math.cos((double) (4 * i_15_) * 3.141592653589793 / (double) i_11_);
                fs[2 * i_15_ + 1] = -(float) Math.sin((double) (4 * i_15_) * 3.141592653589793 / (double) i_11_);
            }
            float[] fs_16_ = new float[i_12_];
            for (int i_17_ = 0; i_17_ < i_13_; i_17_++) {
                fs_16_[2 * i_17_] = (float) Math.cos((double) (2 * i_17_ + 1) * 3.141592653589793 / (double) (2 * i_11_));
                fs_16_[2 * i_17_ + 1] = (float) Math.sin((double) (2 * i_17_ + 1) * 3.141592653589793 / (double) (2 * i_11_));
            }
            float[] fs_18_ = new float[i_13_];
            for (int i_19_ = 0; i_19_ < i_14_; i_19_++) {
                fs_18_[2 * i_19_] = (float) Math.cos((double) (4 * i_19_ + 2) * 3.141592653589793 / (double) i_11_);
                fs_18_[2 * i_19_ + 1] = -(float) Math.sin((double) (4 * i_19_ + 2) * 3.141592653589793 / (double) i_11_);
            }
            int[] is_20_ = new int[i_14_];
            int i_21_ = Class299.method2253(i_14_ - 1, -53);
            for (int i_22_ = 0; i_22_ < i_14_; i_22_++)
                is_20_[i_22_] = Class84.method818(i_21_, 0, i_22_);
            if (i == 0) {
                aFloatArray6722 = fs;
                aFloatArray6720 = fs_16_;
                aFloatArray6708 = fs_18_;
                anIntArray6719 = is_20_;
            } else {
                aFloatArray6712 = fs;
                aFloatArray6726 = fs_16_;
                aFloatArray6700 = fs_18_;
                anIntArray6705 = is_20_;
            }
        }
        int i = method2789(8) + 1;
        aClass370Array6718 = new Class370[i];
        for (int i_23_ = 0; i_23_ < i; i_23_++)
            aClass370Array6718[i_23_] = new Class370();
        int i_24_ = method2789(6) + 1;
        for (int i_25_ = 0; i_25_ < i_24_; i_25_++)
            method2789(16);
        int i_26_ = method2789(6) + 1;
        aClass210Array6715 = new Class210[i_26_];
        for (int i_27_ = 0; i_27_ < i_26_; i_27_++)
            aClass210Array6715[i_27_] = new Class210();
        int i_28_ = method2789(6) + 1;
        aClass343Array6710 = new Class343[i_28_];
        for (int i_29_ = 0; i_29_ < i_28_; i_29_++)
            aClass343Array6710[i_29_] = new Class343();
        int i_30_ = method2789(6) + 1;
        aClass276Array6704 = new Class276[i_30_];
        for (int i_31_ = 0; i_31_ < i_30_; i_31_++)
            aClass276Array6704[i_31_] = new Class276();
        int i_32_ = method2789(6) + 1;
        aBooleanArray6713 = new boolean[i_32_];
        anIntArray6709 = new int[i_32_];
        for (int i_33_ = 0; i_33_ < i_32_; i_33_++) {
            aBooleanArray6713[i_33_] = method2788() != 0;
            method2789(16);
            method2789(16);
            anIntArray6709[i_33_] = method2789(8);
        }
        aBoolean6724 = true;
    }

    final Class348_Sub19_Sub1 method2791(int[] is) {
        if (is != null && is[0] <= 0) return null;
        if (aByteArray6731 == null) {
            anInt6730 = 0;
            aFloatArray6701 = new float[anInt6721];
            aByteArray6731 = new byte[anInt6716];
            anInt6733 = 0;
            anInt6732 = 0;
        }
        for (/**/; anInt6732 < aByteArrayArray6703.length; anInt6732++) {
            if (is != null && is[0] <= 0) return null;
            float[] fs = method2794(anInt6732);
            if (fs != null) {
                int i = anInt6733;
                int i_34_ = fs.length;
                if (i_34_ > anInt6716 - i) i_34_ = anInt6716 - i;
                for (int i_35_ = 0; i_35_ < i_34_; i_35_++) {
                    int i_36_ = (int) (128.0F + fs[i_35_] * 128.0F);
                    if ((i_36_ & ~0xff) != 0) i_36_ = (~i_36_) >> 31;
                    aByteArray6731[i++] = (byte) (i_36_ - 128);
                }
                if (is != null) is[0] -= i - anInt6733;
                anInt6733 = i;
            }
        }
        aFloatArray6701 = null;
        byte[] is_37_ = aByteArray6731;
        aByteArray6731 = null;
        return new Class348_Sub19_Sub1(anInt6702, is_37_, anInt6723, anInt6717, aBoolean6728);
    }

    private static final boolean method2792(Class45 class45) {
        if (!aBoolean6724) {
            byte[] is = class45.method410(-1860, 0, 0);
            if (is == null) return false;
            method2790(is);
        }
        return true;
    }

    static final Class348_Sub10 method2793(Class45 class45, int i) {
        if (!method2792(class45)) {
            class45.method421(false, i);
            return null;
        }
        byte[] is = class45.method415((byte) 73, i);
        if (is == null) return null;
        return new Class348_Sub10(is);
    }

    private final float[] method2794(int i) {
        method2784(aByteArrayArray6703[i], 0);
        method2788();
        int i_38_ = method2789(Class299.method2253(anIntArray6709.length - 1, 123));
        boolean bool = aBooleanArray6713[i_38_];
        int i_39_ = bool ? anInt6721 : anInt6725;
        boolean bool_40_ = false;
        boolean bool_41_ = false;
        if (bool) {
            bool_40_ = method2788() != 0;
            bool_41_ = method2788() != 0;
        }
        int i_42_ = i_39_ >> 1;
        int i_43_;
        int i_44_;
        int i_45_;
        if (bool && !bool_40_) {
            i_43_ = (i_39_ >> 2) - (anInt6725 >> 2);
            i_44_ = (i_39_ >> 2) + (anInt6725 >> 2);
            i_45_ = anInt6725 >> 1;
        } else {
            i_43_ = 0;
            i_44_ = i_42_;
            i_45_ = i_39_ >> 1;
        }
        int i_46_;
        int i_47_;
        int i_48_;
        if (bool && !bool_41_) {
            i_46_ = i_39_ - (i_39_ >> 2) - (anInt6725 >> 2);
            i_47_ = i_39_ - (i_39_ >> 2) + (anInt6725 >> 2);
            i_48_ = anInt6725 >> 1;
        } else {
            i_46_ = i_42_;
            i_47_ = i_39_;
            i_48_ = i_39_ >> 1;
        }
        Class276 class276 = aClass276Array6704[anIntArray6709[i_38_]];
        int i_49_ = class276.anInt3557;
        int i_50_ = class276.anIntArray3556[i_49_];
        boolean bool_51_ = !aClass210Array6715[i_50_].method1534();
        boolean bool_52_ = bool_51_;
        for (int i_53_ = 0; i_53_ < class276.anInt3555; i_53_++) {
            Class343 class343 = (aClass343Array6710[class276.anIntArray3554[i_53_]]);
            float[] fs = aFloatArray6707;
            class343.method2688(fs, i_39_ >> 1, bool_52_);
        }
        if (!bool_51_) {
            int i_54_ = class276.anInt3557;
            int i_55_ = class276.anIntArray3556[i_54_];
            aClass210Array6715[i_55_].method1530(aFloatArray6707, i_39_ >> 1);
        }
        if (bool_51_) {
            for (int i_56_ = i_39_ >> 1; i_56_ < i_39_; i_56_++)
                aFloatArray6707[i_56_] = 0.0F;
        } else {
            int i_57_ = i_39_ >> 1;
            int i_58_ = i_39_ >> 2;
            int i_59_ = i_39_ >> 3;
            float[] fs = aFloatArray6707;
            for (int i_60_ = 0; i_60_ < i_57_; i_60_++)
                fs[i_60_] *= 0.5F;
            for (int i_61_ = i_57_; i_61_ < i_39_; i_61_++)
                fs[i_61_] = -fs[i_39_ - i_61_ - 1];
            float[] fs_62_ = bool ? aFloatArray6712 : aFloatArray6722;
            float[] fs_63_ = bool ? aFloatArray6726 : aFloatArray6720;
            float[] fs_64_ = bool ? aFloatArray6700 : aFloatArray6708;
            int[] is = bool ? anIntArray6705 : anIntArray6719;
            for (int i_65_ = 0; i_65_ < i_58_; i_65_++) {
                float f = fs[4 * i_65_] - fs[i_39_ - 4 * i_65_ - 1];
                float f_66_ = fs[4 * i_65_ + 2] - fs[i_39_ - 4 * i_65_ - 3];
                float f_67_ = fs_62_[2 * i_65_];
                float f_68_ = fs_62_[2 * i_65_ + 1];
                fs[i_39_ - 4 * i_65_ - 1] = f * f_67_ - f_66_ * f_68_;
                fs[i_39_ - 4 * i_65_ - 3] = f * f_68_ + f_66_ * f_67_;
            }
            for (int i_69_ = 0; i_69_ < i_59_; i_69_++) {
                float f = fs[i_57_ + 3 + 4 * i_69_];
                float f_70_ = fs[i_57_ + 1 + 4 * i_69_];
                float f_71_ = fs[4 * i_69_ + 3];
                float f_72_ = fs[4 * i_69_ + 1];
                fs[i_57_ + 3 + 4 * i_69_] = f + f_71_;
                fs[i_57_ + 1 + 4 * i_69_] = f_70_ + f_72_;
                float f_73_ = fs_62_[i_57_ - 4 - 4 * i_69_];
                float f_74_ = fs_62_[i_57_ - 3 - 4 * i_69_];
                fs[4 * i_69_ + 3] = (f - f_71_) * f_73_ - (f_70_ - f_72_) * f_74_;
                fs[4 * i_69_ + 1] = (f_70_ - f_72_) * f_73_ + (f - f_71_) * f_74_;
            }
            int i_75_ = Class299.method2253(i_39_ - 1, -52);
            for (int i_76_ = 0; i_76_ < i_75_ - 3; i_76_++) {
                int i_77_ = i_39_ >> i_76_ + 2;
                int i_78_ = 8 << i_76_;
                for (int i_79_ = 0; i_79_ < 2 << i_76_; i_79_++) {
                    int i_80_ = i_39_ - i_77_ * 2 * i_79_;
                    int i_81_ = i_39_ - i_77_ * (2 * i_79_ + 1);
                    for (int i_82_ = 0; i_82_ < i_39_ >> i_76_ + 4; i_82_++) {
                        int i_83_ = 4 * i_82_;
                        float f = fs[i_80_ - 1 - i_83_];
                        float f_84_ = fs[i_80_ - 3 - i_83_];
                        float f_85_ = fs[i_81_ - 1 - i_83_];
                        float f_86_ = fs[i_81_ - 3 - i_83_];
                        fs[i_80_ - 1 - i_83_] = f + f_85_;
                        fs[i_80_ - 3 - i_83_] = f_84_ + f_86_;
                        float f_87_ = fs_62_[i_82_ * i_78_];
                        float f_88_ = fs_62_[i_82_ * i_78_ + 1];
                        fs[i_81_ - 1 - i_83_] = (f - f_85_) * f_87_ - (f_84_ - f_86_) * f_88_;
                        fs[i_81_ - 3 - i_83_] = (f_84_ - f_86_) * f_87_ + (f - f_85_) * f_88_;
                    }
                }
            }
            for (int i_89_ = 1; i_89_ < i_59_ - 1; i_89_++) {
                int i_90_ = is[i_89_];
                if (i_89_ < i_90_) {
                    int i_91_ = 8 * i_89_;
                    int i_92_ = 8 * i_90_;
                    float f = fs[i_91_ + 1];
                    fs[i_91_ + 1] = fs[i_92_ + 1];
                    fs[i_92_ + 1] = f;
                    f = fs[i_91_ + 3];
                    fs[i_91_ + 3] = fs[i_92_ + 3];
                    fs[i_92_ + 3] = f;
                    f = fs[i_91_ + 5];
                    fs[i_91_ + 5] = fs[i_92_ + 5];
                    fs[i_92_ + 5] = f;
                    f = fs[i_91_ + 7];
                    fs[i_91_ + 7] = fs[i_92_ + 7];
                    fs[i_92_ + 7] = f;
                }
            }
            for (int i_93_ = 0; i_93_ < i_57_; i_93_++)
                fs[i_93_] = fs[2 * i_93_ + 1];
            for (int i_94_ = 0; i_94_ < i_59_; i_94_++) {
                fs[i_39_ - 1 - 2 * i_94_] = fs[4 * i_94_];
                fs[i_39_ - 2 - 2 * i_94_] = fs[4 * i_94_ + 1];
                fs[i_39_ - i_58_ - 1 - 2 * i_94_] = fs[4 * i_94_ + 2];
                fs[i_39_ - i_58_ - 2 - 2 * i_94_] = fs[4 * i_94_ + 3];
            }
            for (int i_95_ = 0; i_95_ < i_59_; i_95_++) {
                float f = fs_64_[2 * i_95_];
                float f_96_ = fs_64_[2 * i_95_ + 1];
                float f_97_ = fs[i_57_ + 2 * i_95_];
                float f_98_ = fs[i_57_ + 2 * i_95_ + 1];
                float f_99_ = fs[i_39_ - 2 - 2 * i_95_];
                float f_100_ = fs[i_39_ - 1 - 2 * i_95_];
                float f_101_ = f_96_ * (f_97_ - f_99_) + f * (f_98_ + f_100_);
                fs[i_57_ + 2 * i_95_] = (f_97_ + f_99_ + f_101_) * 0.5F;
                fs[i_39_ - 2 - 2 * i_95_] = (f_97_ + f_99_ - f_101_) * 0.5F;
                f_101_ = f_96_ * (f_98_ + f_100_) - f * (f_97_ - f_99_);
                fs[i_57_ + 2 * i_95_ + 1] = (f_98_ - f_100_ + f_101_) * 0.5F;
                fs[i_39_ - 1 - 2 * i_95_] = (-f_98_ + f_100_ + f_101_) * 0.5F;
            }
            for (int i_102_ = 0; i_102_ < i_58_; i_102_++) {
                fs[i_102_] = (fs[2 * i_102_ + i_57_] * fs_63_[2 * i_102_] + fs[2 * i_102_ + 1 + i_57_] * fs_63_[2 * i_102_ + 1]);
                fs[i_57_ - 1 - i_102_] = (fs[2 * i_102_ + i_57_] * fs_63_[2 * i_102_ + 1] - fs[2 * i_102_ + 1 + i_57_] * fs_63_[2 * i_102_]);
            }
            for (int i_103_ = 0; i_103_ < i_58_; i_103_++)
                fs[i_39_ - i_58_ + i_103_] = -fs[i_103_];
            for (int i_104_ = 0; i_104_ < i_58_; i_104_++)
                fs[i_104_] = fs[i_58_ + i_104_];
            for (int i_105_ = 0; i_105_ < i_58_; i_105_++)
                fs[i_58_ + i_105_] = -fs[i_58_ - i_105_ - 1];
            for (int i_106_ = 0; i_106_ < i_58_; i_106_++)
                fs[i_57_ + i_106_] = fs[i_39_ - i_106_ - 1];
            for (int i_107_ = i_43_; i_107_ < i_44_; i_107_++) {
                float f = (float) Math.sin(((double) (i_107_ - i_43_) + 0.5) / (double) i_45_ * 0.5 * 3.141592653589793);
                aFloatArray6707[i_107_] *= (float) Math.sin(1.5707963267948966 * (double) f * (double) f);
            }
            for (int i_108_ = i_46_; i_108_ < i_47_; i_108_++) {
                float f = (float) Math.sin((((double) (i_108_ - i_46_) + 0.5) / (double) i_48_ * 0.5 * 3.141592653589793) + 1.5707963267948966);
                aFloatArray6707[i_108_] *= (float) Math.sin(1.5707963267948966 * (double) f * (double) f);
            }
        }
        float[] fs = null;
        if (anInt6730 > 0) {
            int i_109_ = anInt6730 + i_39_ >> 2;
            fs = new float[i_109_];
            if (!aBoolean6706) {
                for (int i_110_ = 0; i_110_ < anInt6727; i_110_++) {
                    int i_111_ = (anInt6730 >> 1) + i_110_;
                    fs[i_110_] += aFloatArray6701[i_111_];
                }
            }
            if (!bool_51_) {
                for (int i_112_ = i_43_; i_112_ < i_39_ >> 1; i_112_++) {
                    int i_113_ = fs.length - (i_39_ >> 1) + i_112_;
                    fs[i_113_] += aFloatArray6707[i_112_];
                }
            }
        }
        float[] fs_114_ = aFloatArray6701;
        aFloatArray6701 = aFloatArray6707;
        aFloatArray6707 = fs_114_;
        anInt6730 = i_39_;
        anInt6727 = i_47_ - (i_39_ >> 1);
        aBoolean6706 = bool_51_;
        return fs;
    }

    private Class348_Sub10(byte[] is) {
        method2787(is);
    }

    static final Class348_Sub10 method2795(Class45 class45, int i, int i_115_) {
        if (!method2792(class45)) {
            class45.method420(-10499, i, i_115_);
            return null;
        }
        byte[] is = class45.method410(-1860, i, i_115_);
        if (is == null) return null;
        return new Class348_Sub10(is);
    }
}
