/* Class348_Sub16_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class348_Sub16_Sub5 extends Class348_Sub16 {
    private int anInt8969;
    private int anInt8970;
    private int anInt8971;
    private int anInt8972;
    private int anInt8973;
    private int anInt8974;
    private int anInt8975;
    private int anInt8976;
    private int anInt8977;
    private int anInt8978;
    private int anInt8979;
    private int anInt8980;
    private boolean aBoolean8981;
    private int anInt8982;
    private int anInt8983;

    final synchronized void method2888(int i, int i_0_, int i_1_) {
        if (i == 0)
            method2926(i_0_, i_1_);
        else {
            int i_2_ = method2904(i_0_, i_1_);
            int i_3_ = method2889(i_0_, i_1_);
            if (anInt8970 == i_2_ && anInt8974 == i_3_)
                anInt8972 = 0;
            else {
                int i_4_ = i_0_ - anInt8976;
                if (anInt8976 - i_0_ > i_4_)
                    i_4_ = anInt8976 - i_0_;
                if (i_2_ - anInt8970 > i_4_)
                    i_4_ = i_2_ - anInt8970;
                if (anInt8970 - i_2_ > i_4_)
                    i_4_ = anInt8970 - i_2_;
                if (i_3_ - anInt8974 > i_4_)
                    i_4_ = i_3_ - anInt8974;
                if (anInt8974 - i_3_ > i_4_)
                    i_4_ = anInt8974 - i_3_;
                if (i > i_4_)
                    i = i_4_;
                anInt8972 = i;
                anInt8969 = i_0_;
                anInt8977 = i_1_;
                anInt8973 = (i_0_ - anInt8976) / i;
                anInt8971 = (i_2_ - anInt8970) / i;
                anInt8978 = (i_3_ - anInt8974) / i;
            }
        }
    }

    private static final int method2889(int i, int i_5_) {
        if (i_5_ < 0)
            return -i;
        return (int) ((double) i * Math.sqrt((double) i_5_ * 1.220703125E-4)
                + 0.5);
    }

    final boolean method2890() {
        if (anInt8983 >= 0
                && anInt8983 < (((Class348_Sub19_Sub1) (Class348_Sub19_Sub1)
                ((Class348_Sub16) this).aClass348_Sub19_6787)
                .aByteArray8984).length << 8)
            return false;
        return true;
    }

    final synchronized void method2891(boolean bool) {
        anInt8979 = (anInt8979 ^ anInt8979 >> 31) + (anInt8979 >>> 31);
        if (bool)
            anInt8979 = -anInt8979;
    }

    final synchronized int method2892() {
        if (anInt8977 < 0)
            return -1;
        return anInt8977;
    }

    final int method2820() {
        int i = anInt8976 * 3 >> 6;
        i = (i ^ i >> 31) + (i >>> 31);
        if (anInt8980 == 0)
            i -= (i * anInt8983
                    / ((((Class348_Sub19_Sub1) (Class348_Sub19_Sub1)
                    ((Class348_Sub16) this).aClass348_Sub19_6787)
                    .aByteArray8984).length
                    << 8));
        else if (anInt8980 >= 0)
            i -= (i * anInt8975
                    / (((Class348_Sub19_Sub1) (Class348_Sub19_Sub1)
                    ((Class348_Sub16) this).aClass348_Sub19_6787)
                    .aByteArray8984).length);
        if (i > 255)
            return 255;
        return i;
    }

    private static final int method2893
            (int i, byte[] is, int[] is_6_, int i_7_, int i_8_, int i_9_,
             int i_10_, int i_11_, int i_12_, int i_13_, int i_14_, int i_15_,
             Class348_Sub16_Sub5 class348_sub16_sub5) {
        i_7_ >>= 8;
        i_15_ >>= 8;
        i_9_ <<= 2;
        i_10_ <<= 2;
        i_11_ <<= 2;
        i_12_ <<= 2;
        if ((i_13_ = i_8_ + i_15_ - i_7_) > i_14_)
            i_13_ = i_14_;
        class348_sub16_sub5.anInt8976
                += class348_sub16_sub5.anInt8973 * (i_13_ - i_8_);
        i_8_ <<= 1;
        i_13_ <<= 1;
        i_13_ -= 6;
        while (i_8_ < i_13_) {
            i = is[i_7_++];
            is_6_[i_8_++] += i * i_9_;
            i_9_ += i_11_;
            is_6_[i_8_++] += i * i_10_;
            i_10_ += i_12_;
            i = is[i_7_++];
            is_6_[i_8_++] += i * i_9_;
            i_9_ += i_11_;
            is_6_[i_8_++] += i * i_10_;
            i_10_ += i_12_;
            i = is[i_7_++];
            is_6_[i_8_++] += i * i_9_;
            i_9_ += i_11_;
            is_6_[i_8_++] += i * i_10_;
            i_10_ += i_12_;
            i = is[i_7_++];
            is_6_[i_8_++] += i * i_9_;
            i_9_ += i_11_;
            is_6_[i_8_++] += i * i_10_;
            i_10_ += i_12_;
        }
        i_13_ += 6;
        while (i_8_ < i_13_) {
            i = is[i_7_++];
            is_6_[i_8_++] += i * i_9_;
            i_9_ += i_11_;
            is_6_[i_8_++] += i * i_10_;
            i_10_ += i_12_;
        }
        class348_sub16_sub5.anInt8970 = i_9_ >> 2;
        class348_sub16_sub5.anInt8974 = i_10_ >> 2;
        class348_sub16_sub5.anInt8983 = i_7_ << 8;
        return i_8_ >> 1;
    }

    private static final int method2894
            (int i, int i_16_, byte[] is, int[] is_17_, int i_18_, int i_19_,
             int i_20_, int i_21_, int i_22_, int i_23_, int i_24_,
             Class348_Sub16_Sub5 class348_sub16_sub5, int i_25_, int i_26_) {
        if (i_25_ == 0
                || (i_22_ = i_19_ + (i_24_ + 256 - i_18_ + i_25_) / i_25_) > i_23_)
            i_22_ = i_23_;
        i_19_ <<= 1;
        i_22_ <<= 1;
        while (i_19_ < i_22_) {
            i_16_ = i_18_ >> 8;
            i = is[i_16_ - 1];
            i = (i << 8) + (is[i_16_] - i) * (i_18_ & 0xff);
            is_17_[i_19_++] += i * i_20_ >> 6;
            is_17_[i_19_++] += i * i_21_ >> 6;
            i_18_ += i_25_;
        }
        if (i_25_ == 0
                || ((i_22_ = (i_19_ >> 1) + (i_24_ - i_18_ + i_25_) / i_25_)
                > i_23_))
            i_22_ = i_23_;
        i_22_ <<= 1;
        i_16_ = i_26_;
        while (i_19_ < i_22_) {
            i = (i_16_ << 8) + (is[i_18_ >> 8] - i_16_) * (i_18_ & 0xff);
            is_17_[i_19_++] += i * i_20_ >> 6;
            is_17_[i_19_++] += i * i_21_ >> 6;
            i_18_ += i_25_;
        }
        class348_sub16_sub5.anInt8983 = i_18_;
        return i_19_ >> 1;
    }

    final boolean method2895() {
        if (anInt8972 == 0)
            return false;
        return true;
    }

    private final void method2896() {
        if (anInt8972 != 0) {
            if (anInt8969 == -2147483648)
                anInt8969 = 0;
            anInt8972 = 0;
            method2918();
        }
    }

    private static final int method2897
            (int i, byte[] is, int[] is_27_, int i_28_, int i_29_, int i_30_,
             int i_31_, int i_32_, int i_33_, int i_34_,
             Class348_Sub16_Sub5 class348_sub16_sub5) {
        i_28_ >>= 8;
        i_34_ >>= 8;
        i_30_ <<= 2;
        i_31_ <<= 2;
        if ((i_32_ = i_29_ + i_28_ - (i_34_ - 1)) > i_33_)
            i_32_ = i_33_;
        i_29_ <<= 1;
        i_32_ <<= 1;
        i_32_ -= 6;
        while (i_29_ < i_32_) {
            i = is[i_28_--];
            is_27_[i_29_++] += i * i_30_;
            is_27_[i_29_++] += i * i_31_;
            i = is[i_28_--];
            is_27_[i_29_++] += i * i_30_;
            is_27_[i_29_++] += i * i_31_;
            i = is[i_28_--];
            is_27_[i_29_++] += i * i_30_;
            is_27_[i_29_++] += i * i_31_;
            i = is[i_28_--];
            is_27_[i_29_++] += i * i_30_;
            is_27_[i_29_++] += i * i_31_;
        }
        i_32_ += 6;
        while (i_29_ < i_32_) {
            i = is[i_28_--];
            is_27_[i_29_++] += i * i_30_;
            is_27_[i_29_++] += i * i_31_;
        }
        class348_sub16_sub5.anInt8983 = i_28_ << 8;
        return i_29_ >> 1;
    }

    private final boolean method2898() {
        int i = anInt8969;
        int i_35_;
        int i_36_;
        if (i == -2147483648)
            i = i_35_ = i_36_ = 0;
        else {
            i_35_ = method2904(i, anInt8977);
            i_36_ = method2889(i, anInt8977);
        }
        if (anInt8976 != i || anInt8970 != i_35_ || anInt8974 != i_36_) {
            if (anInt8976 < i) {
                anInt8973 = 1;
                anInt8972 = i - anInt8976;
            } else if (anInt8976 > i) {
                anInt8973 = -1;
                anInt8972 = anInt8976 - i;
            } else
                anInt8973 = 0;
            if (anInt8970 < i_35_) {
                anInt8971 = 1;
                if (anInt8972 == 0 || anInt8972 > i_35_ - anInt8970)
                    anInt8972 = i_35_ - anInt8970;
            } else if (anInt8970 > i_35_) {
                anInt8971 = -1;
                if (anInt8972 == 0 || anInt8972 > anInt8970 - i_35_)
                    anInt8972 = anInt8970 - i_35_;
            } else
                anInt8971 = 0;
            if (anInt8974 < i_36_) {
                anInt8978 = 1;
                if (anInt8972 == 0 || anInt8972 > i_36_ - anInt8974)
                    anInt8972 = i_36_ - anInt8974;
            } else if (anInt8974 > i_36_) {
                anInt8978 = -1;
                if (anInt8972 == 0 || anInt8972 > anInt8974 - i_36_)
                    anInt8972 = anInt8974 - i_36_;
            } else
                anInt8978 = 0;
            return false;
        }
        if (anInt8969 == -2147483648) {
            anInt8969 = 0;
            anInt8976 = anInt8970 = anInt8974 = 0;
            this.method2715((byte) 79);
            return true;
        }
        method2918();
        return false;
    }

    private static final int method2899
            (int i, int i_37_, byte[] is, int[] is_38_, int i_39_, int i_40_,
             int i_41_, int i_42_, int i_43_, int i_44_, int i_45_, int i_46_,
             int i_47_, Class348_Sub16_Sub5 class348_sub16_sub5, int i_48_,
             int i_49_) {
        class348_sub16_sub5.anInt8976 -= class348_sub16_sub5.anInt8973 * i_40_;
        if (i_48_ == 0
                || (i_45_ = i_40_ + (i_47_ - i_39_ + i_48_ - 257) / i_48_) > i_46_)
            i_45_ = i_46_;
        i_40_ <<= 1;
        i_45_ <<= 1;
        while (i_40_ < i_45_) {
            i_37_ = i_39_ >> 8;
            i = is[i_37_];
            i = (i << 8) + (is[i_37_ + 1] - i) * (i_39_ & 0xff);
            is_38_[i_40_++] += i * i_41_ >> 6;
            i_41_ += i_43_;
            is_38_[i_40_++] += i * i_42_ >> 6;
            i_42_ += i_44_;
            i_39_ += i_48_;
        }
        if (i_48_ == 0
                || ((i_45_ = (i_40_ >> 1) + (i_47_ - i_39_ + i_48_ - 1) / i_48_)
                > i_46_))
            i_45_ = i_46_;
        i_45_ <<= 1;
        i_37_ = i_49_;
        while (i_40_ < i_45_) {
            i = is[i_39_ >> 8];
            i = (i << 8) + (i_37_ - i) * (i_39_ & 0xff);
            is_38_[i_40_++] += i * i_41_ >> 6;
            i_41_ += i_43_;
            is_38_[i_40_++] += i * i_42_ >> 6;
            i_42_ += i_44_;
            i_39_ += i_48_;
        }
        i_40_ >>= 1;
        class348_sub16_sub5.anInt8976 += class348_sub16_sub5.anInt8973 * i_40_;
        class348_sub16_sub5.anInt8970 = i_41_;
        class348_sub16_sub5.anInt8974 = i_42_;
        class348_sub16_sub5.anInt8983 = i_39_;
        return i_40_;
    }

    private static final int method2900
            (int i, byte[] is, int[] is_50_, int i_51_, int i_52_, int i_53_,
             int i_54_, int i_55_, int i_56_, int i_57_, int i_58_, int i_59_,
             Class348_Sub16_Sub5 class348_sub16_sub5) {
        i_51_ >>= 8;
        i_59_ >>= 8;
        i_53_ <<= 2;
        i_54_ <<= 2;
        i_55_ <<= 2;
        i_56_ <<= 2;
        if ((i_57_ = i_52_ + i_51_ - (i_59_ - 1)) > i_58_)
            i_57_ = i_58_;
        class348_sub16_sub5.anInt8976
                += class348_sub16_sub5.anInt8973 * (i_57_ - i_52_);
        i_52_ <<= 1;
        i_57_ <<= 1;
        i_57_ -= 6;
        while (i_52_ < i_57_) {
            i = is[i_51_--];
            is_50_[i_52_++] += i * i_53_;
            i_53_ += i_55_;
            is_50_[i_52_++] += i * i_54_;
            i_54_ += i_56_;
            i = is[i_51_--];
            is_50_[i_52_++] += i * i_53_;
            i_53_ += i_55_;
            is_50_[i_52_++] += i * i_54_;
            i_54_ += i_56_;
            i = is[i_51_--];
            is_50_[i_52_++] += i * i_53_;
            i_53_ += i_55_;
            is_50_[i_52_++] += i * i_54_;
            i_54_ += i_56_;
            i = is[i_51_--];
            is_50_[i_52_++] += i * i_53_;
            i_53_ += i_55_;
            is_50_[i_52_++] += i * i_54_;
            i_54_ += i_56_;
        }
        i_57_ += 6;
        while (i_52_ < i_57_) {
            i = is[i_51_--];
            is_50_[i_52_++] += i * i_53_;
            i_53_ += i_55_;
            is_50_[i_52_++] += i * i_54_;
            i_54_ += i_56_;
        }
        class348_sub16_sub5.anInt8970 = i_53_ >> 2;
        class348_sub16_sub5.anInt8974 = i_54_ >> 2;
        class348_sub16_sub5.anInt8983 = i_51_ << 8;
        return i_52_ >> 1;
    }

    final synchronized void method2901(int i) {
        if (anInt8979 < 0)
            anInt8979 = -i;
        else
            anInt8979 = i;
    }

    final synchronized void method2902(int i) {
        if (i == 0) {
            method2923(0);
            this.method2715((byte) 93);
        } else if (anInt8970 == 0 && anInt8974 == 0) {
            anInt8972 = 0;
            anInt8969 = 0;
            anInt8976 = 0;
            this.method2715((byte) 113);
        } else {
            int i_60_ = -anInt8976;
            if (anInt8976 > i_60_)
                i_60_ = anInt8976;
            if (-anInt8970 > i_60_)
                i_60_ = -anInt8970;
            if (anInt8970 > i_60_)
                i_60_ = anInt8970;
            if (-anInt8974 > i_60_)
                i_60_ = -anInt8974;
            if (anInt8974 > i_60_)
                i_60_ = anInt8974;
            if (i > i_60_)
                i = i_60_;
            anInt8972 = i;
            anInt8969 = -2147483648;
            anInt8973 = -anInt8976 / i;
            anInt8971 = -anInt8970 / i;
            anInt8978 = -anInt8974 / i;
        }
    }

    private static final int method2903
            (int i, int i_61_, byte[] is, int[] is_62_, int i_63_, int i_64_,
             int i_65_, int i_66_, int i_67_, int i_68_, int i_69_,
             Class348_Sub16_Sub5 class348_sub16_sub5, int i_70_, int i_71_) {
        class348_sub16_sub5.anInt8970 -= class348_sub16_sub5.anInt8971 * i_64_;
        class348_sub16_sub5.anInt8974 -= class348_sub16_sub5.anInt8978 * i_64_;
        if (i_70_ == 0
                || (i_67_ = i_64_ + (i_69_ - i_63_ + i_70_ - 257) / i_70_) > i_68_)
            i_67_ = i_68_;
        while (i_64_ < i_67_) {
            i_61_ = i_63_ >> 8;
            i = is[i_61_];
            is_62_[i_64_++]
                    += (((i << 8) + (is[i_61_ + 1] - i) * (i_63_ & 0xff)) * i_65_
                    >> 6);
            i_65_ += i_66_;
            i_63_ += i_70_;
        }
        if (i_70_ == 0
                || (i_67_ = i_64_ + (i_69_ - i_63_ + i_70_ - 1) / i_70_) > i_68_)
            i_67_ = i_68_;
        i_61_ = i_71_;
        while (i_64_ < i_67_) {
            i = is[i_63_ >> 8];
            is_62_[i_64_++]
                    += ((i << 8) + (i_61_ - i) * (i_63_ & 0xff)) * i_65_ >> 6;
            i_65_ += i_66_;
            i_63_ += i_70_;
        }
        class348_sub16_sub5.anInt8970 += class348_sub16_sub5.anInt8971 * i_64_;
        class348_sub16_sub5.anInt8974 += class348_sub16_sub5.anInt8978 * i_64_;
        class348_sub16_sub5.anInt8976 = i_65_;
        class348_sub16_sub5.anInt8983 = i_63_;
        return i_64_;
    }

    final int method2821() {
        if (anInt8969 == 0 && anInt8972 == 0)
            return 0;
        return 1;
    }

    private static final int method2904(int i, int i_72_) {
        if (i_72_ < 0)
            return i;
        return (int) (((double) i
                * Math.sqrt((double) (16384 - i_72_) * 1.220703125E-4))
                + 0.5);
    }

    private static final int method2905
            (byte[] is, int[] is_73_, int i, int i_74_, int i_75_, int i_76_,
             int i_77_, int i_78_, Class348_Sub16_Sub5 class348_sub16_sub5) {
        i >>= 8;
        i_78_ >>= 8;
        i_75_ <<= 2;
        if ((i_76_ = i_74_ + i_78_ - i) > i_77_)
            i_76_ = i_77_;
        i_76_ -= 3;
        while (i_74_ < i_76_) {
            is_73_[i_74_++] += is[i++] * i_75_;
            is_73_[i_74_++] += is[i++] * i_75_;
            is_73_[i_74_++] += is[i++] * i_75_;
            is_73_[i_74_++] += is[i++] * i_75_;
        }
        i_76_ += 3;
        while (i_74_ < i_76_)
            is_73_[i_74_++] += is[i++] * i_75_;
        class348_sub16_sub5.anInt8983 = i << 8;
        return i_74_;
    }

    final synchronized int method2906() {
        if (anInt8969 == -2147483648)
            return 0;
        return anInt8969;
    }

    private static final int method2907
            (int i, int i_79_, byte[] is, int[] is_80_, int i_81_, int i_82_,
             int i_83_, int i_84_, int i_85_, int i_86_,
             Class348_Sub16_Sub5 class348_sub16_sub5, int i_87_, int i_88_) {
        if (i_87_ == 0
                || (i_84_ = i_82_ + (i_86_ + 256 - i_81_ + i_87_) / i_87_) > i_85_)
            i_84_ = i_85_;
        while (i_82_ < i_84_) {
            i_79_ = i_81_ >> 8;
            i = is[i_79_ - 1];
            is_80_[i_82_++]
                    += ((i << 8) + (is[i_79_] - i) * (i_81_ & 0xff)) * i_83_ >> 6;
            i_81_ += i_87_;
        }
        if (i_87_ == 0
                || (i_84_ = i_82_ + (i_86_ - i_81_ + i_87_) / i_87_) > i_85_)
            i_84_ = i_85_;
        i = i_88_;
        i_79_ = i_87_;
        while (i_82_ < i_84_) {
            is_80_[i_82_++]
                    += (((i << 8) + (is[i_81_ >> 8] - i) * (i_81_ & 0xff)) * i_83_
                    >> 6);
            i_81_ += i_79_;
        }
        class348_sub16_sub5.anInt8983 = i_81_;
        return i_82_;
    }

    private static final int method2908
            (byte[] is, int[] is_89_, int i, int i_90_, int i_91_, int i_92_,
             int i_93_, int i_94_, int i_95_,
             Class348_Sub16_Sub5 class348_sub16_sub5) {
        i >>= 8;
        i_95_ >>= 8;
        i_91_ <<= 2;
        i_92_ <<= 2;
        if ((i_93_ = i_90_ + i - (i_95_ - 1)) > i_94_)
            i_93_ = i_94_;
        class348_sub16_sub5.anInt8970
                += class348_sub16_sub5.anInt8971 * (i_93_ - i_90_);
        class348_sub16_sub5.anInt8974
                += class348_sub16_sub5.anInt8978 * (i_93_ - i_90_);
        i_93_ -= 3;
        while (i_90_ < i_93_) {
            is_89_[i_90_++] += is[i--] * i_91_;
            i_91_ += i_92_;
            is_89_[i_90_++] += is[i--] * i_91_;
            i_91_ += i_92_;
            is_89_[i_90_++] += is[i--] * i_91_;
            i_91_ += i_92_;
            is_89_[i_90_++] += is[i--] * i_91_;
            i_91_ += i_92_;
        }
        i_93_ += 3;
        while (i_90_ < i_93_) {
            is_89_[i_90_++] += is[i--] * i_91_;
            i_91_ += i_92_;
        }
        class348_sub16_sub5.anInt8976 = i_91_ >> 2;
        class348_sub16_sub5.anInt8983 = i << 8;
        return i_90_;
    }

    final synchronized void method2909(int i) {
        method2926(method2906(), i);
    }

    private static final int method2910
            (int i, byte[] is, int[] is_96_, int i_97_, int i_98_, int i_99_,
             int i_100_, int i_101_, int i_102_, int i_103_,
             Class348_Sub16_Sub5 class348_sub16_sub5) {
        i_97_ >>= 8;
        i_103_ >>= 8;
        i_99_ <<= 2;
        i_100_ <<= 2;
        if ((i_101_ = i_98_ + i_103_ - i_97_) > i_102_)
            i_101_ = i_102_;
        i_98_ <<= 1;
        i_101_ <<= 1;
        i_101_ -= 6;
        while (i_98_ < i_101_) {
            i = is[i_97_++];
            is_96_[i_98_++] += i * i_99_;
            is_96_[i_98_++] += i * i_100_;
            i = is[i_97_++];
            is_96_[i_98_++] += i * i_99_;
            is_96_[i_98_++] += i * i_100_;
            i = is[i_97_++];
            is_96_[i_98_++] += i * i_99_;
            is_96_[i_98_++] += i * i_100_;
            i = is[i_97_++];
            is_96_[i_98_++] += i * i_99_;
            is_96_[i_98_++] += i * i_100_;
        }
        i_101_ += 6;
        while (i_98_ < i_101_) {
            i = is[i_97_++];
            is_96_[i_98_++] += i * i_99_;
            is_96_[i_98_++] += i * i_100_;
        }
        class348_sub16_sub5.anInt8983 = i_97_ << 8;
        return i_98_ >> 1;
    }

    static final Class348_Sub16_Sub5 method2911
            (Class348_Sub19_Sub1 class348_sub19_sub1, int i, int i_104_,
             int i_105_) {
        if (((Class348_Sub19_Sub1) class348_sub19_sub1).aByteArray8984 == null
                || (((Class348_Sub19_Sub1) class348_sub19_sub1)
                .aByteArray8984).length == 0)
            return null;
        return new Class348_Sub16_Sub5(class348_sub19_sub1, i, i_104_, i_105_);
    }

    private static final int method2912
            (int i, int i_106_, byte[] is, int[] is_107_, int i_108_, int i_109_,
             int i_110_, int i_111_, int i_112_, int i_113_, int i_114_,
             Class348_Sub16_Sub5 class348_sub16_sub5, int i_115_, int i_116_) {
        class348_sub16_sub5.anInt8970
                -= class348_sub16_sub5.anInt8971 * i_109_;
        class348_sub16_sub5.anInt8974
                -= class348_sub16_sub5.anInt8978 * i_109_;
        if (i_115_ == 0
                || ((i_112_ = i_109_ + (i_114_ + 256 - i_108_ + i_115_) / i_115_)
                > i_113_))
            i_112_ = i_113_;
        while (i_109_ < i_112_) {
            i_106_ = i_108_ >> 8;
            i = is[i_106_ - 1];
            is_107_[i_109_++]
                    += (((i << 8) + (is[i_106_] - i) * (i_108_ & 0xff)) * i_110_
                    >> 6);
            i_110_ += i_111_;
            i_108_ += i_115_;
        }
        if (i_115_ == 0
                || ((i_112_ = i_109_ + (i_114_ - i_108_ + i_115_) / i_115_)
                > i_113_))
            i_112_ = i_113_;
        i = i_116_;
        i_106_ = i_115_;
        while (i_109_ < i_112_) {
            is_107_[i_109_++]
                    += (((i << 8) + (is[i_108_ >> 8] - i) * (i_108_ & 0xff))
                    * i_110_) >> 6;
            i_110_ += i_111_;
            i_108_ += i_106_;
        }
        class348_sub16_sub5.anInt8970
                += class348_sub16_sub5.anInt8971 * i_109_;
        class348_sub16_sub5.anInt8974
                += class348_sub16_sub5.anInt8978 * i_109_;
        class348_sub16_sub5.anInt8976 = i_110_;
        class348_sub16_sub5.anInt8983 = i_108_;
        return i_109_;
    }

    private static final int method2913
            (byte[] is, int[] is_117_, int i, int i_118_, int i_119_, int i_120_,
             int i_121_, int i_122_, int i_123_,
             Class348_Sub16_Sub5 class348_sub16_sub5) {
        i >>= 8;
        i_123_ >>= 8;
        i_119_ <<= 2;
        i_120_ <<= 2;
        if ((i_121_ = i_118_ + i_123_ - i) > i_122_)
            i_121_ = i_122_;
        class348_sub16_sub5.anInt8970
                += class348_sub16_sub5.anInt8971 * (i_121_ - i_118_);
        class348_sub16_sub5.anInt8974
                += class348_sub16_sub5.anInt8978 * (i_121_ - i_118_);
        i_121_ -= 3;
        while (i_118_ < i_121_) {
            is_117_[i_118_++] += is[i++] * i_119_;
            i_119_ += i_120_;
            is_117_[i_118_++] += is[i++] * i_119_;
            i_119_ += i_120_;
            is_117_[i_118_++] += is[i++] * i_119_;
            i_119_ += i_120_;
            is_117_[i_118_++] += is[i++] * i_119_;
            i_119_ += i_120_;
        }
        i_121_ += 3;
        while (i_118_ < i_121_) {
            is_117_[i_118_++] += is[i++] * i_119_;
            i_119_ += i_120_;
        }
        class348_sub16_sub5.anInt8976 = i_119_ >> 2;
        class348_sub16_sub5.anInt8983 = i << 8;
        return i_118_;
    }

    final synchronized int method2914() {
        if (anInt8979 < 0)
            return -anInt8979;
        return anInt8979;
    }

    final synchronized void method2915(int i) {
        method2926(i << 6, method2892());
    }

    final Class348_Sub16 method2818() {
        return null;
    }

    final synchronized void method2916(int i, int i_124_) {
        method2888(i, i_124_, method2892());
    }

    final synchronized void method2917(int i) {
        anInt8980 = i;
    }

    private final void method2918() {
        anInt8976 = anInt8969;
        anInt8970 = method2904(anInt8969, anInt8977);
        anInt8974 = method2889(anInt8969, anInt8977);
    }

    private final int method2919(int[] is, int i, int i_125_, int i_126_,
                                 int i_127_) {
        while (anInt8972 > 0) {
            int i_128_ = i + anInt8972;
            if (i_128_ > i_126_)
                i_128_ = i_126_;
            anInt8972 += i;
            if (anInt8979 == 256 && (anInt8983 & 0xff) == 0) {
                if (Class282.aBoolean3652)
                    i = method2893(0,
                            ((Class348_Sub19_Sub1) (Class348_Sub19_Sub1)
                                    (((Class348_Sub16) this)
                                            .aClass348_Sub19_6787)).aByteArray8984,
                            is, anInt8983, i, anInt8970, anInt8974,
                            anInt8971, anInt8978, 0, i_128_, i_125_,
                            this);
                else
                    i = method2913(((Class348_Sub19_Sub1) (Class348_Sub19_Sub1)
                                    (((Class348_Sub16) this)
                                            .aClass348_Sub19_6787)).aByteArray8984,
                            is, anInt8983, i, anInt8976, anInt8973, 0,
                            i_128_, i_125_, this);
            } else if (Class282.aBoolean3652)
                i = method2899(0, 0,
                        (((Class348_Sub19_Sub1) (Class348_Sub19_Sub1)
                                ((Class348_Sub16) this).aClass348_Sub19_6787)
                                .aByteArray8984),
                        is, anInt8983, i, anInt8970, anInt8974,
                        anInt8971, anInt8978, 0, i_128_, i_125_, this,
                        anInt8979, i_127_);
            else
                i = method2903(0, 0,
                        (((Class348_Sub19_Sub1) (Class348_Sub19_Sub1)
                                ((Class348_Sub16) this).aClass348_Sub19_6787)
                                .aByteArray8984),
                        is, anInt8983, i, anInt8976, anInt8973, 0,
                        i_128_, i_125_, this, anInt8979, i_127_);
            anInt8972 -= i;
            if (anInt8972 != 0)
                return i;
            if (method2898())
                return i_126_;
        }
        if (anInt8979 == 256 && (anInt8983 & 0xff) == 0) {
            if (Class282.aBoolean3652)
                return method2910(0,
                        ((Class348_Sub19_Sub1) (Class348_Sub19_Sub1)
                                (((Class348_Sub16) this)
                                        .aClass348_Sub19_6787)).aByteArray8984,
                        is, anInt8983, i, anInt8970, anInt8974, 0,
                        i_126_, i_125_, this);
            return method2905((((Class348_Sub19_Sub1) (Class348_Sub19_Sub1)
                            ((Class348_Sub16) this).aClass348_Sub19_6787)
                            .aByteArray8984),
                    is, anInt8983, i, anInt8976, 0, i_126_, i_125_,
                    this);
        }
        if (Class282.aBoolean3652)
            return method2922(0, 0,
                    (((Class348_Sub19_Sub1) (Class348_Sub19_Sub1)
                            ((Class348_Sub16) this).aClass348_Sub19_6787)
                            .aByteArray8984),
                    is, anInt8983, i, anInt8970, anInt8974, 0,
                    i_126_, i_125_, this, anInt8979, i_127_);
        return method2925(0, 0,
                (((Class348_Sub19_Sub1) (Class348_Sub19_Sub1)
                        ((Class348_Sub16) this).aClass348_Sub19_6787)
                        .aByteArray8984),
                is, anInt8983, i, anInt8976, 0, i_126_, i_125_, this,
                anInt8979, i_127_);
    }

    private static final int method2920
            (int i, int i_129_, byte[] is, int[] is_130_, int i_131_, int i_132_,
             int i_133_, int i_134_, int i_135_, int i_136_, int i_137_,
             int i_138_, int i_139_, Class348_Sub16_Sub5 class348_sub16_sub5,
             int i_140_, int i_141_) {
        class348_sub16_sub5.anInt8976
                -= class348_sub16_sub5.anInt8973 * i_132_;
        if (i_140_ == 0
                || ((i_137_ = i_132_ + (i_139_ + 256 - i_131_ + i_140_) / i_140_)
                > i_138_))
            i_137_ = i_138_;
        i_132_ <<= 1;
        i_137_ <<= 1;
        while (i_132_ < i_137_) {
            i_129_ = i_131_ >> 8;
            i = is[i_129_ - 1];
            i = (i << 8) + (is[i_129_] - i) * (i_131_ & 0xff);
            is_130_[i_132_++] += i * i_133_ >> 6;
            i_133_ += i_135_;
            is_130_[i_132_++] += i * i_134_ >> 6;
            i_134_ += i_136_;
            i_131_ += i_140_;
        }
        if (i_140_ == 0
                || ((i_137_ = (i_132_ >> 1) + (i_139_ - i_131_ + i_140_) / i_140_)
                > i_138_))
            i_137_ = i_138_;
        i_137_ <<= 1;
        i_129_ = i_141_;
        while (i_132_ < i_137_) {
            i = (i_129_ << 8) + (is[i_131_ >> 8] - i_129_) * (i_131_ & 0xff);
            is_130_[i_132_++] += i * i_133_ >> 6;
            i_133_ += i_135_;
            is_130_[i_132_++] += i * i_134_ >> 6;
            i_134_ += i_136_;
            i_131_ += i_140_;
        }
        i_132_ >>= 1;
        class348_sub16_sub5.anInt8976
                += class348_sub16_sub5.anInt8973 * i_132_;
        class348_sub16_sub5.anInt8970 = i_133_;
        class348_sub16_sub5.anInt8974 = i_134_;
        class348_sub16_sub5.anInt8983 = i_131_;
        return i_132_;
    }

    private static final int method2921
            (byte[] is, int[] is_142_, int i, int i_143_, int i_144_, int i_145_,
             int i_146_, int i_147_, Class348_Sub16_Sub5 class348_sub16_sub5) {
        i >>= 8;
        i_147_ >>= 8;
        i_144_ <<= 2;
        if ((i_145_ = i_143_ + i - (i_147_ - 1)) > i_146_)
            i_145_ = i_146_;
        i_145_ -= 3;
        while (i_143_ < i_145_) {
            is_142_[i_143_++] += is[i--] * i_144_;
            is_142_[i_143_++] += is[i--] * i_144_;
            is_142_[i_143_++] += is[i--] * i_144_;
            is_142_[i_143_++] += is[i--] * i_144_;
        }
        i_145_ += 3;
        while (i_143_ < i_145_)
            is_142_[i_143_++] += is[i--] * i_144_;
        class348_sub16_sub5.anInt8983 = i << 8;
        return i_143_;
    }

    private static final int method2922
            (int i, int i_148_, byte[] is, int[] is_149_, int i_150_, int i_151_,
             int i_152_, int i_153_, int i_154_, int i_155_, int i_156_,
             Class348_Sub16_Sub5 class348_sub16_sub5, int i_157_, int i_158_) {
        if (i_157_ == 0
                || ((i_154_ = i_151_ + (i_156_ - i_150_ + i_157_ - 257) / i_157_)
                > i_155_))
            i_154_ = i_155_;
        i_151_ <<= 1;
        i_154_ <<= 1;
        while (i_151_ < i_154_) {
            i_148_ = i_150_ >> 8;
            i = is[i_148_];
            i = (i << 8) + (is[i_148_ + 1] - i) * (i_150_ & 0xff);
            is_149_[i_151_++] += i * i_152_ >> 6;
            is_149_[i_151_++] += i * i_153_ >> 6;
            i_150_ += i_157_;
        }
        if (i_157_ == 0 || (i_154_ = (i_151_ >> 1) + (i_156_ - i_150_ + i_157_
                - 1) / i_157_) > i_155_)
            i_154_ = i_155_;
        i_154_ <<= 1;
        i_148_ = i_158_;
        while (i_151_ < i_154_) {
            i = is[i_150_ >> 8];
            i = (i << 8) + (i_148_ - i) * (i_150_ & 0xff);
            is_149_[i_151_++] += i * i_152_ >> 6;
            is_149_[i_151_++] += i * i_153_ >> 6;
            i_150_ += i_157_;
        }
        class348_sub16_sub5.anInt8983 = i_150_;
        return i_151_ >> 1;
    }

    private final synchronized void method2923(int i) {
        method2926(i, method2892());
    }

    final synchronized void method2817(int[] is, int i, int i_159_) {
        if (anInt8969 == 0 && anInt8972 == 0)
            method2819(i_159_);
        else {
            Class348_Sub19_Sub1 class348_sub19_sub1
                    = ((Class348_Sub19_Sub1)
                    ((Class348_Sub16) this).aClass348_Sub19_6787);
            int i_160_ = anInt8975 << 8;
            int i_161_ = anInt8982 << 8;
            int i_162_ = ((((Class348_Sub19_Sub1) class348_sub19_sub1)
                    .aByteArray8984).length
                    << 8);
            int i_163_ = i_161_ - i_160_;
            if (i_163_ <= 0)
                anInt8980 = 0;
            int i_164_ = i;
            i_159_ += i;
            if (anInt8983 < 0) {
                if (anInt8979 > 0)
                    anInt8983 = 0;
                else {
                    method2896();
                    this.method2715((byte) 83);
                    return;
                }
            }
            if (anInt8983 >= i_162_) {
                if (anInt8979 < 0)
                    anInt8983 = i_162_ - 1;
                else {
                    method2896();
                    this.method2715((byte) 81);
                    return;
                }
            }
            if (anInt8980 < 0) {
                if (aBoolean8981) {
                    if (anInt8979 < 0) {
                        i_164_ = method2927(is, i_164_, i_160_, i_159_,
                                (((Class348_Sub19_Sub1)
                                        class348_sub19_sub1)
                                        .aByteArray8984[anInt8975]));
                        if (anInt8983 >= i_160_)
                            return;
                        anInt8983 = i_160_ + i_160_ - 1 - anInt8983;
                        anInt8979 = -anInt8979;
                    }
                    for (; ; ) {
                        i_164_ = method2919(is, i_164_, i_161_, i_159_,
                                (((Class348_Sub19_Sub1)
                                        class348_sub19_sub1)
                                        .aByteArray8984[anInt8982 - 1]));
                        if (anInt8983 < i_161_)
                            break;
                        anInt8983 = i_161_ + i_161_ - 1 - anInt8983;
                        anInt8979 = -anInt8979;
                        i_164_ = method2927(is, i_164_, i_160_, i_159_,
                                (((Class348_Sub19_Sub1)
                                        class348_sub19_sub1)
                                        .aByteArray8984[anInt8975]));
                        if (anInt8983 >= i_160_)
                            break;
                        anInt8983 = i_160_ + i_160_ - 1 - anInt8983;
                        anInt8979 = -anInt8979;
                    }
                } else if (anInt8979 < 0) {
                    for (; ; ) {
                        i_164_ = method2927(is, i_164_, i_160_, i_159_,
                                (((Class348_Sub19_Sub1)
                                        class348_sub19_sub1)
                                        .aByteArray8984[anInt8982 - 1]));
                        if (anInt8983 >= i_160_)
                            break;
                        anInt8983
                                = i_161_ - 1 - (i_161_ - 1 - anInt8983) % i_163_;
                    }
                } else {
                    for (; ; ) {
                        i_164_ = method2919(is, i_164_, i_161_, i_159_,
                                (((Class348_Sub19_Sub1)
                                        class348_sub19_sub1)
                                        .aByteArray8984[anInt8975]));
                        if (anInt8983 < i_161_)
                            break;
                        anInt8983 = i_160_ + (anInt8983 - i_160_) % i_163_;
                    }
                }
            } else {
                do {
                    if (anInt8980 > 0) {
                        if (aBoolean8981) {
                            if (anInt8979 < 0) {
                                i_164_
                                        = method2927(is, i_164_, i_160_, i_159_,
                                        (((Class348_Sub19_Sub1)
                                                class348_sub19_sub1)
                                                .aByteArray8984[anInt8975]));
                                if (anInt8983 >= i_160_)
                                    return;
                                anInt8983 = i_160_ + i_160_ - 1 - anInt8983;
                                anInt8979 = -anInt8979;
                                if (--anInt8980 == 0)
                                    break;
                            }
                            do {
                                i_164_ = method2919(is, i_164_, i_161_, i_159_,
                                        (((Class348_Sub19_Sub1)
                                                class348_sub19_sub1)
                                                .aByteArray8984
                                                [anInt8982 - 1]));
                                if (anInt8983 < i_161_)
                                    return;
                                anInt8983 = i_161_ + i_161_ - 1 - anInt8983;
                                anInt8979 = -anInt8979;
                                if (--anInt8980 == 0)
                                    break;
                                i_164_
                                        = method2927(is, i_164_, i_160_, i_159_,
                                        (((Class348_Sub19_Sub1)
                                                class348_sub19_sub1)
                                                .aByteArray8984[anInt8975]));
                                if (anInt8983 >= i_160_)
                                    return;
                                anInt8983 = i_160_ + i_160_ - 1 - anInt8983;
                                anInt8979 = -anInt8979;
                            } while (--anInt8980 != 0);
                        } else if (anInt8979 < 0) {
                            for (; ; ) {
                                i_164_ = method2927(is, i_164_, i_160_, i_159_,
                                        (((Class348_Sub19_Sub1)
                                                class348_sub19_sub1)
                                                .aByteArray8984
                                                [anInt8982 - 1]));
                                if (anInt8983 >= i_160_)
                                    return;
                                int i_165_ = (i_161_ - 1 - anInt8983) / i_163_;
                                if (i_165_ >= anInt8980) {
                                    anInt8983 += i_163_ * anInt8980;
                                    anInt8980 = 0;
                                    break;
                                }
                                anInt8983 += i_163_ * i_165_;
                                anInt8980 -= i_165_;
                            }
                        } else {
                            for (; ; ) {
                                i_164_
                                        = method2919(is, i_164_, i_161_, i_159_,
                                        (((Class348_Sub19_Sub1)
                                                class348_sub19_sub1)
                                                .aByteArray8984[anInt8975]));
                                if (anInt8983 < i_161_)
                                    return;
                                int i_166_ = (anInt8983 - i_160_) / i_163_;
                                if (i_166_ >= anInt8980) {
                                    anInt8983 -= i_163_ * anInt8980;
                                    anInt8980 = 0;
                                    break;
                                }
                                anInt8983 -= i_163_ * i_166_;
                                anInt8980 -= i_166_;
                            }
                        }
                    }
                } while (false);
                if (anInt8979 < 0) {
                    method2927(is, i_164_, 0, i_159_, 0);
                    if (anInt8983 < 0) {
                        anInt8983 = -1;
                        method2896();
                        this.method2715((byte) 24);
                    }
                } else {
                    method2919(is, i_164_, i_162_, i_159_, 0);
                    if (anInt8983 >= i_162_) {
                        anInt8983 = i_162_;
                        method2896();
                        this.method2715((byte) 93);
                    }
                }
            }
        }
    }

    final synchronized void method2924(int i) {
        int i_167_ = ((((Class348_Sub19_Sub1) (Class348_Sub19_Sub1)
                ((Class348_Sub16) this).aClass348_Sub19_6787)
                .aByteArray8984).length
                << 8);
        if (i < -1)
            i = -1;
        if (i > i_167_)
            i = i_167_;
        anInt8983 = i;
    }

    final Class348_Sub16 method2816() {
        return null;
    }

    private static final int method2925
            (int i, int i_168_, byte[] is, int[] is_169_, int i_170_, int i_171_,
             int i_172_, int i_173_, int i_174_, int i_175_,
             Class348_Sub16_Sub5 class348_sub16_sub5, int i_176_, int i_177_) {
        if (i_176_ == 0
                || ((i_173_ = i_171_ + (i_175_ - i_170_ + i_176_ - 257) / i_176_)
                > i_174_))
            i_173_ = i_174_;
        while (i_171_ < i_173_) {
            i_168_ = i_170_ >> 8;
            i = is[i_168_];
            is_169_[i_171_++]
                    += (((i << 8) + (is[i_168_ + 1] - i) * (i_170_ & 0xff))
                    * i_172_) >> 6;
            i_170_ += i_176_;
        }
        if (i_176_ == 0
                || ((i_173_ = i_171_ + (i_175_ - i_170_ + i_176_ - 1) / i_176_)
                > i_174_))
            i_173_ = i_174_;
        i_168_ = i_177_;
        while (i_171_ < i_173_) {
            i = is[i_170_ >> 8];
            is_169_[i_171_++]
                    += ((i << 8) + (i_168_ - i) * (i_170_ & 0xff)) * i_172_ >> 6;
            i_170_ += i_176_;
        }
        class348_sub16_sub5.anInt8983 = i_170_;
        return i_171_;
    }

    private final synchronized void method2926(int i, int i_178_) {
        anInt8969 = i;
        anInt8977 = i_178_;
        anInt8972 = 0;
        method2918();
    }

    final synchronized void method2819(int i) {
        if (anInt8972 > 0) {
            if (i >= anInt8972) {
                if (anInt8969 == -2147483648) {
                    anInt8969 = 0;
                    anInt8976 = anInt8970 = anInt8974 = 0;
                    this.method2715((byte) 52);
                    i = anInt8972;
                }
                anInt8972 = 0;
                method2918();
            } else {
                anInt8976 += anInt8973 * i;
                anInt8970 += anInt8971 * i;
                anInt8974 += anInt8978 * i;
                anInt8972 -= i;
            }
        }
        Class348_Sub19_Sub1 class348_sub19_sub1
                = ((Class348_Sub19_Sub1)
                ((Class348_Sub16) this).aClass348_Sub19_6787);
        int i_179_ = anInt8975 << 8;
        int i_180_ = anInt8982 << 8;
        int i_181_ = ((((Class348_Sub19_Sub1) class348_sub19_sub1)
                .aByteArray8984).length
                << 8);
        int i_182_ = i_180_ - i_179_;
        if (i_182_ <= 0)
            anInt8980 = 0;
        if (anInt8983 < 0) {
            if (anInt8979 > 0)
                anInt8983 = 0;
            else {
                method2896();
                this.method2715((byte) 60);
                return;
            }
        }
        if (anInt8983 >= i_181_) {
            if (anInt8979 < 0)
                anInt8983 = i_181_ - 1;
            else {
                method2896();
                this.method2715((byte) 93);
                return;
            }
        }
        anInt8983 += anInt8979 * i;
        if (anInt8980 < 0) {
            if (aBoolean8981) {
                if (anInt8979 < 0) {
                    if (anInt8983 >= i_179_)
                        return;
                    anInt8983 = i_179_ + i_179_ - 1 - anInt8983;
                    anInt8979 = -anInt8979;
                }
                while (anInt8983 >= i_180_) {
                    anInt8983 = i_180_ + i_180_ - 1 - anInt8983;
                    anInt8979 = -anInt8979;
                    if (anInt8983 >= i_179_)
                        break;
                    anInt8983 = i_179_ + i_179_ - 1 - anInt8983;
                    anInt8979 = -anInt8979;
                }
            } else if (anInt8979 < 0) {
                if (anInt8983 < i_179_)
                    anInt8983 = i_180_ - 1 - (i_180_ - 1 - anInt8983) % i_182_;
            } else if (anInt8983 >= i_180_)
                anInt8983 = i_179_ + (anInt8983 - i_179_) % i_182_;
        } else {
            do {
                if (anInt8980 > 0) {
                    if (aBoolean8981) {
                        if (anInt8979 < 0) {
                            if (anInt8983 >= i_179_)
                                return;
                            anInt8983 = i_179_ + i_179_ - 1 - anInt8983;
                            anInt8979 = -anInt8979;
                            if (--anInt8980 == 0)
                                break;
                        }
                        do {
                            if (anInt8983 < i_180_)
                                return;
                            anInt8983 = i_180_ + i_180_ - 1 - anInt8983;
                            anInt8979 = -anInt8979;
                            if (--anInt8980 == 0)
                                break;
                            if (anInt8983 >= i_179_)
                                return;
                            anInt8983 = i_179_ + i_179_ - 1 - anInt8983;
                            anInt8979 = -anInt8979;
                        } while (--anInt8980 != 0);
                    } else if (anInt8979 < 0) {
                        if (anInt8983 >= i_179_)
                            return;
                        int i_183_ = (i_180_ - 1 - anInt8983) / i_182_;
                        if (i_183_ >= anInt8980) {
                            anInt8983 += i_182_ * anInt8980;
                            anInt8980 = 0;
                        } else {
                            anInt8983 += i_182_ * i_183_;
                            anInt8980 -= i_183_;
                            return;
                        }
                    } else {
                        if (anInt8983 < i_180_)
                            return;
                        int i_184_ = (anInt8983 - i_179_) / i_182_;
                        if (i_184_ >= anInt8980) {
                            anInt8983 -= i_182_ * anInt8980;
                            anInt8980 = 0;
                        } else {
                            anInt8983 -= i_182_ * i_184_;
                            anInt8980 -= i_184_;
                            return;
                        }
                    }
                }
            } while (false);
            if (anInt8979 < 0) {
                if (anInt8983 < 0) {
                    anInt8983 = -1;
                    method2896();
                    this.method2715((byte) 126);
                }
            } else if (anInt8983 >= i_181_) {
                anInt8983 = i_181_;
                method2896();
                this.method2715((byte) 55);
            }
        }
    }

    private Class348_Sub16_Sub5(Class348_Sub19_Sub1 class348_sub19_sub1, int i,
                                int i_185_, int i_186_) {
        ((Class348_Sub16) this).aClass348_Sub19_6787 = class348_sub19_sub1;
        anInt8975 = ((Class348_Sub19_Sub1) class348_sub19_sub1).anInt8986;
        anInt8982 = ((Class348_Sub19_Sub1) class348_sub19_sub1).anInt8985;
        aBoolean8981
                = ((Class348_Sub19_Sub1) class348_sub19_sub1).aBoolean8987;
        anInt8979 = i;
        anInt8969 = i_185_;
        anInt8977 = i_186_;
        anInt8983 = 0;
        method2918();
    }

    private final int method2927(int[] is, int i, int i_187_, int i_188_,
                                 int i_189_) {
        while (anInt8972 > 0) {
            int i_190_ = i + anInt8972;
            if (i_190_ > i_188_)
                i_190_ = i_188_;
            anInt8972 += i;
            if (anInt8979 == -256 && (anInt8983 & 0xff) == 0) {
                if (Class282.aBoolean3652)
                    i = method2900(0,
                            ((Class348_Sub19_Sub1) (Class348_Sub19_Sub1)
                                    (((Class348_Sub16) this)
                                            .aClass348_Sub19_6787)).aByteArray8984,
                            is, anInt8983, i, anInt8970, anInt8974,
                            anInt8971, anInt8978, 0, i_190_, i_187_,
                            this);
                else
                    i = method2908(((Class348_Sub19_Sub1) (Class348_Sub19_Sub1)
                                    (((Class348_Sub16) this)
                                            .aClass348_Sub19_6787)).aByteArray8984,
                            is, anInt8983, i, anInt8976, anInt8973, 0,
                            i_190_, i_187_, this);
            } else if (Class282.aBoolean3652)
                i = method2920(0, 0,
                        (((Class348_Sub19_Sub1) (Class348_Sub19_Sub1)
                                ((Class348_Sub16) this).aClass348_Sub19_6787)
                                .aByteArray8984),
                        is, anInt8983, i, anInt8970, anInt8974,
                        anInt8971, anInt8978, 0, i_190_, i_187_, this,
                        anInt8979, i_189_);
            else
                i = method2912(0, 0,
                        (((Class348_Sub19_Sub1) (Class348_Sub19_Sub1)
                                ((Class348_Sub16) this).aClass348_Sub19_6787)
                                .aByteArray8984),
                        is, anInt8983, i, anInt8976, anInt8973, 0,
                        i_190_, i_187_, this, anInt8979, i_189_);
            anInt8972 -= i;
            if (anInt8972 != 0)
                return i;
            if (method2898())
                return i_188_;
        }
        if (anInt8979 == -256 && (anInt8983 & 0xff) == 0) {
            if (Class282.aBoolean3652)
                return method2897(0,
                        ((Class348_Sub19_Sub1) (Class348_Sub19_Sub1)
                                (((Class348_Sub16) this)
                                        .aClass348_Sub19_6787)).aByteArray8984,
                        is, anInt8983, i, anInt8970, anInt8974, 0,
                        i_188_, i_187_, this);
            return method2921((((Class348_Sub19_Sub1) (Class348_Sub19_Sub1)
                            ((Class348_Sub16) this).aClass348_Sub19_6787)
                            .aByteArray8984),
                    is, anInt8983, i, anInt8976, 0, i_188_, i_187_,
                    this);
        }
        if (Class282.aBoolean3652)
            return method2894(0, 0,
                    (((Class348_Sub19_Sub1) (Class348_Sub19_Sub1)
                            ((Class348_Sub16) this).aClass348_Sub19_6787)
                            .aByteArray8984),
                    is, anInt8983, i, anInt8970, anInt8974, 0,
                    i_188_, i_187_, this, anInt8979, i_189_);
        return method2907(0, 0,
                (((Class348_Sub19_Sub1) (Class348_Sub19_Sub1)
                        ((Class348_Sub16) this).aClass348_Sub19_6787)
                        .aByteArray8984),
                is, anInt8983, i, anInt8976, 0, i_188_, i_187_, this,
                anInt8979, i_189_);
    }
}
