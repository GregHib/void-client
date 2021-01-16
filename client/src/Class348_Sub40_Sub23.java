/* Class348_Sub40_Sub23 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.util.Random;

final class Class348_Sub40_Sub23 extends Class348_Sub40 {
    private int anInt9306;
    static boolean aBoolean9307 = true;
    static int anInt9308;
    static int anInt9309;
    private int anInt9310;
    private int anInt9311 = 1024;
    private int anInt9312 = 0;
    static int anInt9313;
    private int anInt9314;
    static int anInt9315;
    static int anInt9316;
    private int anInt9317;
    private int anInt9318;
    static Class348_Sub22[] aClass348_Sub22Array9319
            = new Class348_Sub22[1024];
    private int anInt9320;
    static int anInt9321;
    private int anInt9322;
    private int anInt9323;

    final void method3049(Class348_Sub49 class348_sub49, int i, int i_0_) {
        anInt9308++;
        if (i_0_ != 31015)
            aBoolean9307 = true;
        int i_1_ = i;
        while_196_:
        do {
            while_195_:
            do {
                while_194_:
                do {
                    while_193_:
                    do {
                        while_192_:
                        do {
                            while_191_:
                            do {
                                while_190_:
                                do {
                                    do {
                                        if ((i_1_ ^ 0xffffffff) != -1) {
                                            if ((i_1_ ^ 0xffffffff) != -2) {
                                                if (i_1_ != 2) {
                                                    if (i_1_ != 3) {
                                                        if (i_1_ != 4) {
                                                            if ((i_1_
                                                                    ^ 0xffffffff)
                                                                    != -6) {
                                                                if (i_1_
                                                                        != 6) {
                                                                    if ((i_1_
                                                                            ^ 0xffffffff)
                                                                            != -8) {
                                                                        if (i_1_
                                                                                == 8)
                                                                            break while_195_;
                                                                        break while_196_;
                                                                    }
                                                                } else
                                                                    break while_193_;
                                                                break while_194_;
                                                            }
                                                        } else
                                                            break while_191_;
                                                        break while_192_;
                                                    }
                                                } else
                                                    break;
                                                break while_190_;
                                            }
                                        } else {
                                            anInt9318 = class348_sub49
                                                    .method3387(255);
                                            return;
                                        }
                                        anInt9317 = class348_sub49
                                                .method3330(842397944);
                                        return;
                                    } while (false);
                                    anInt9320
                                            = class348_sub49.method3330(842397944);
                                    return;
                                } while (false);
                                anInt9322 = class348_sub49
                                        .method3330(i_0_ ^ 0x323581df);
                                return;
                            } while (false);
                            anInt9323 = class348_sub49.method3330(842397944);
                            return;
                        } while (false);
                        anInt9311 = class348_sub49.method3330(842397944);
                        return;
                    } while (false);
                    anInt9312 = class348_sub49.method3387(i_0_ ^ 0x79d8);
                    return;
                } while (false);
                anInt9314 = class348_sub49.method3330(842397944);
                return;
            } while (false);
            anInt9310 = class348_sub49.method3330(842397944);
        } while (false);
    }

    final void method3044(int i) {
        if (i >= 108)
            anInt9316++;
    }

    private final void method3112(int i, int i_2_, int[][] is, Random random,
                                  int i_3_, int i_4_, int i_5_) {
        try {
            anInt9309++;
            int i_6_ = ((anInt9310 ^ 0xffffffff) >= -1 ? 4096
                    : 4096 - Class124.method1097((byte) 117, anInt9310,
                    random));
            int i_7_ = 88 % ((i - 57) / 55);
            int i_8_ = anInt9306 * anInt9314 >> -1291409268;
            int i_9_
                    = (anInt9306
                    - ((i_8_ ^ 0xffffffff) < -1
                    ? Class124.method1097((byte) 82, i_8_, random) : 0));
            if (Class348_Sub40_Sub6.anInt9139 <= i_3_)
                i_3_ -= Class348_Sub40_Sub6.anInt9139;
            if (i_9_ <= 0) {
                if ((i_3_ + i_5_ ^ 0xffffffff)
                        < (Class348_Sub40_Sub6.anInt9139 ^ 0xffffffff)) {
                    int i_10_ = Class348_Sub40_Sub6.anInt9139 + -i_3_;
                    for (int i_11_ = 0;
                         (i_2_ ^ 0xffffffff) < (i_11_ ^ 0xffffffff); i_11_++) {
                        int[] is_12_ = is[i_11_ + i_4_];
                        Class214.method1579(is_12_, i_3_, i_10_, i_6_);
                        Class214.method1579(is_12_, 0, i_5_ - i_10_, i_6_);
                    }
                } else {
                    for (int i_13_ = 0; i_2_ > i_13_; i_13_++)
                        Class214.method1579(is[i_13_ + i_4_], i_3_, i_5_,
                                i_6_);
                }
            } else if ((i_2_ ^ 0xffffffff) < -1 && (i_5_ ^ 0xffffffff) < -1) {
                int i_14_ = i_5_ / 2;
                int i_15_ = i_2_ / 2;
                int i_16_ = i_14_ < i_9_ ? i_14_ : i_9_;
                int i_17_ = i_15_ >= i_9_ ? i_9_ : i_15_;
                int i_18_ = i_3_ - -i_16_;
                int i_19_ = i_5_ - i_16_ * 2;
                for (int i_20_ = 0; (i_2_ ^ 0xffffffff) < (i_20_ ^ 0xffffffff);
                     i_20_++) {
                    int[] is_21_ = is[i_20_ - -i_4_];
                    if ((i_17_ ^ 0xffffffff) < (i_20_ ^ 0xffffffff)) {
                        int i_22_ = i_6_ * i_20_ / i_17_;
                        if ((anInt9312 ^ 0xffffffff) == -1) {
                            for (int i_23_ = 0;
                                 (i_16_ ^ 0xffffffff) < (i_23_ ^ 0xffffffff);
                                 i_23_++) {
                                int i_24_ = i_6_ * i_23_ / i_16_;
                                is_21_[Class139.method1166(i_23_ + i_3_,
                                        (Class239_Sub22
                                                .anInt6076))]
                                        = is_21_[(Class139.method1166
                                        (Class239_Sub22.anInt6076,
                                                i_3_ - (-i_5_ + (i_23_ - -1))))]
                                        = i_22_ * i_24_ >> 1318683468;
                            }
                        } else {
                            for (int i_25_ = 0;
                                 (i_25_ ^ 0xffffffff) > (i_16_ ^ 0xffffffff);
                                 i_25_++) {
                                int i_26_ = i_6_ * i_25_ / i_16_;
                                is_21_[Class139.method1166((Class239_Sub22
                                                .anInt6076),
                                        i_25_ + i_3_)]
                                        = is_21_[(Class139.method1166
                                        (i_3_ - -i_5_ + (-i_25_ - 1),
                                                Class239_Sub22.anInt6076))]
                                        = i_26_ < i_22_ ? i_26_ : i_22_;
                            }
                        }
                        if (Class348_Sub40_Sub6.anInt9139 >= i_19_ + i_18_)
                            Class214.method1579(is_21_, i_18_, i_19_, i_22_);
                        else {
                            int i_27_ = -i_18_ + Class348_Sub40_Sub6.anInt9139;
                            Class214.method1579(is_21_, i_18_, i_27_, i_22_);
                            Class214.method1579(is_21_, 0, i_19_ - i_27_,
                                    i_22_);
                        }
                    } else {
                        int i_28_ = -1 + (-i_20_ + i_2_);
                        if ((i_28_ ^ 0xffffffff) > (i_17_ ^ 0xffffffff)) {
                            int i_29_ = i_28_ * i_6_ / i_17_;
                            if (anInt9312 == 0) {
                                for (int i_30_ = 0; i_16_ > i_30_; i_30_++) {
                                    int i_31_ = i_6_ * i_30_ / i_16_;
                                    is_21_[Class139.method1166((Class239_Sub22
                                                    .anInt6076),
                                            i_30_ + i_3_)]
                                            = is_21_[(Class139.method1166
                                            (Class239_Sub22.anInt6076,
                                                    -1 + i_5_ + i_3_ - i_30_))]
                                            = i_31_ * i_29_ >> 299348108;
                                }
                            } else {
                                for (int i_32_ = 0;
                                     ((i_32_ ^ 0xffffffff)
                                             > (i_16_ ^ 0xffffffff));
                                     i_32_++) {
                                    int i_33_ = i_32_ * i_6_ / i_16_;
                                    is_21_[Class139.method1166((Class239_Sub22
                                                    .anInt6076),
                                            i_3_ + i_32_)]
                                            = is_21_[(Class139.method1166
                                            (Class239_Sub22.anInt6076,
                                                    -i_32_ + i_5_ + (i_3_
                                                            + -1)))]
                                            = i_29_ <= i_33_ ? i_29_ : i_33_;
                                }
                            }
                            if (i_19_ + i_18_ <= Class348_Sub40_Sub6.anInt9139)
                                Class214.method1579(is_21_, i_18_, i_19_,
                                        i_29_);
                            else {
                                int i_34_
                                        = -i_18_ + Class348_Sub40_Sub6.anInt9139;
                                Class214.method1579(is_21_, i_18_, i_34_,
                                        i_29_);
                                Class214.method1579(is_21_, 0, -i_34_ + i_19_,
                                        i_29_);
                            }
                        } else {
                            for (int i_35_ = 0; i_35_ < i_16_; i_35_++)
                                is_21_[Class139.method1166(i_35_ + i_3_,
                                        (Class239_Sub22
                                                .anInt6076))]
                                        = is_21_[(Class139.method1166
                                        (Class239_Sub22.anInt6076,
                                                -i_35_ + (i_3_ - (-i_5_ + 1))))]
                                        = i_6_ * i_35_ / i_16_;
                            if (Class348_Sub40_Sub6.anInt9139
                                    >= i_18_ - -i_19_)
                                Class214.method1579(is_21_, i_18_, i_19_,
                                        i_6_);
                            else {
                                int i_36_
                                        = -i_18_ + Class348_Sub40_Sub6.anInt9139;
                                Class214.method1579(is_21_, i_18_, i_36_,
                                        i_6_);
                                Class214.method1579(is_21_, 0, i_19_ - i_36_,
                                        i_6_);
                            }
                        }
                    }
                }
            }
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception,
                    ("cc.C(" + i + ',' + i_2_ + ','
                            + (is != null ? "{...}" : "null")
                            + ','
                            + (random != null ? "{...}"
                            : "null")
                            + ',' + i_3_ + ',' + i_4_ + ','
                            + i_5_ + ')'));
        }
    }

    static final String[] method3113(char c, boolean bool, String string) {
        anInt9315++;
        int i = Class15.method257(4, string, c);
        String[] strings = new String[i - -1];
        int i_37_ = 0;
        int i_38_ = 0;
        if (bool != true)
            method3114((byte) -76);
        for (int i_39_ = 0; (i ^ 0xffffffff) < (i_39_ ^ 0xffffffff); i_39_++) {
            int i_40_;
            for (i_40_ = i_38_; string.charAt(i_40_) != c; i_40_++) {
                /* empty */
            }
            strings[i_37_++] = string.substring(i_38_, i_40_);
            i_38_ = 1 + i_40_;
        }
        strings[i] = string.substring(i_38_);
        return strings;
    }

    public static void method3114(byte i) {
        aClass348_Sub22Array9319 = null;
        if (i > -63)
            method3114((byte) -91);
    }

    public Class348_Sub40_Sub23() {
        super(0, true);
        anInt9310 = 1024;
        anInt9314 = 1024;
        anInt9318 = 0;
        anInt9317 = 1024;
        anInt9320 = 2048;
        anInt9322 = 409;
        anInt9323 = 819;
    }

    final int[] method3042(int i, int i_41_) {
        anInt9321++;
        if (i_41_ != 255)
            anInt9312 = 113;
        int[] is = this.aClass191_7032.method1433(0, i);
        if (this.aClass191_7032.aBoolean2570) {
            int[][] is_42_
                    = this.aClass191_7032.method1427((byte) 16);
            int i_43_ = 0;
            int i_44_ = 0;
            int i_45_ = 0;
            int i_46_ = 0;
            int i_47_ = 0;
            boolean bool = true;
            boolean bool_48_ = true;
            int i_49_ = 0;
            int i_50_ = 0;
            int i_51_
                    = anInt9317 * Class348_Sub40_Sub6.anInt9139 >> 1202357772;
            int i_52_
                    = Class348_Sub40_Sub6.anInt9139 * anInt9320 >> -1513067412;
            int i_53_ = anInt9322 * Class286_Sub2.anInt6212 >> -1185109972;
            int i_54_ = Class286_Sub2.anInt6212 * anInt9323 >> 867771724;
            if (i_54_ <= 1)
                return is_42_[i];
            anInt9306
                    = Class348_Sub40_Sub6.anInt9139 / 8 * anInt9311 >> -336223796;
            int i_55_ = 1 + Class348_Sub40_Sub6.anInt9139 / i_51_;
            int[][] is_56_ = new int[i_55_][3];
            int[][] is_57_ = new int[i_55_][3];
            Random random = new Random(anInt9318);
            for (; ; ) {
                int i_58_ = i_51_ + Class124.method1097((byte) 106,
                        i_52_ - i_51_, random);
                int i_59_
                        = (Class124.method1097((byte) 117, -i_53_ + i_54_, random)
                        + i_53_);
                int i_60_ = i_46_ + i_58_;
                if (i_60_ > Class348_Sub40_Sub6.anInt9139) {
                    i_60_ = Class348_Sub40_Sub6.anInt9139;
                    i_58_ = Class348_Sub40_Sub6.anInt9139 - i_46_;
                }
                int i_61_;
                if (bool_48_)
                    i_61_ = 0;
                else {
                    int i_62_ = i_47_;
                    int[] is_63_ = is_57_[i_47_];
                    int i_64_ = 0;
                    int i_65_ = i_43_ + i_60_;
                    if (i_65_ < 0)
                        i_65_ += Class348_Sub40_Sub6.anInt9139;
                    if ((Class348_Sub40_Sub6.anInt9139 ^ 0xffffffff)
                            > (i_65_ ^ 0xffffffff))
                        i_65_ -= Class348_Sub40_Sub6.anInt9139;
                    for (; ; ) {
                        int[] is_66_ = is_57_[i_62_];
                        if (i_65_ >= is_66_[0] && is_66_[1] >= i_65_)
                            break;
                        if ((++i_62_ ^ 0xffffffff) <= (i_49_ ^ 0xffffffff))
                            i_62_ = 0;
                        i_64_++;
                    }
                    i_61_ = is_63_[2];
                    if (i_62_ != i_47_) {
                        int i_67_ = i_46_ - -i_43_;
                        if (i_67_ < 0)
                            i_67_ += Class348_Sub40_Sub6.anInt9139;
                        if ((i_67_ ^ 0xffffffff)
                                < (Class348_Sub40_Sub6.anInt9139 ^ 0xffffffff))
                            i_67_ -= Class348_Sub40_Sub6.anInt9139;
                        for (int i_68_ = 1;
                             (i_68_ ^ 0xffffffff) >= (i_64_ ^ 0xffffffff);
                             i_68_++) {
                            int[] is_69_ = is_57_[(i_68_ + i_47_) % i_49_];
                            i_61_ = Math.max(i_61_, is_69_[2]);
                        }
                        for (int i_70_ = 0;
                             (i_64_ ^ 0xffffffff) <= (i_70_ ^ 0xffffffff);
                             i_70_++) {
                            int[] is_71_ = is_57_[(i_47_ - -i_70_) % i_49_];
                            int i_72_ = is_71_[2];
                            if ((i_72_ ^ 0xffffffff) != (i_61_ ^ 0xffffffff)) {
                                int i_73_ = is_71_[0];
                                int i_74_ = is_71_[1];
                                int i_75_;
                                int i_76_;
                                if (i_67_ >= i_65_) {
                                    if ((i_73_ ^ 0xffffffff) != -1) {
                                        i_75_ = Math.max(i_67_, i_73_);
                                        i_76_ = Class348_Sub40_Sub6.anInt9139;
                                    } else {
                                        i_75_ = 0;
                                        i_76_ = Math.min(i_65_, i_74_);
                                    }
                                } else {
                                    i_75_ = Math.max(i_67_, i_73_);
                                    i_76_ = Math.min(i_65_, i_74_);
                                }
                                method3112(124, i_61_ - i_72_, is_42_, random,
                                        i_45_ + i_75_, i_72_,
                                        -i_75_ + i_76_);
                            }
                        }
                    }
                    i_47_ = i_62_;
                }
                if ((i_59_ + i_61_ ^ 0xffffffff)
                        >= (Class286_Sub2.anInt6212 ^ 0xffffffff))
                    bool = false;
                else
                    i_59_ = -i_61_ + Class286_Sub2.anInt6212;
                if ((Class348_Sub40_Sub6.anInt9139 ^ 0xffffffff)
                        != (i_60_ ^ 0xffffffff)) {
                    int[] is_77_ = is_56_[i_50_++];
                    is_77_[1] = i_60_;
                    is_77_[0] = i_46_;
                    is_77_[2] = i_59_ + i_61_;
                    method3112(112, i_59_, is_42_, random, i_46_ + i_44_,
                            i_61_, i_58_);
                    i_46_ = i_60_;
                } else {
                    method3112(-59, i_59_, is_42_, random, i_46_ + i_44_,
                            i_61_, i_58_);
                    if (bool)
                        break;
                    bool = true;
                    int[] is_78_ = is_56_[i_50_++];
                    is_78_[1] = i_60_;
                    is_78_[2] = i_59_ + i_61_;
                    is_78_[0] = i_46_;
                    int[][] is_79_ = is_57_;
                    is_57_ = is_56_;
                    is_56_ = is_79_;
                    i_49_ = i_50_;
                    i_45_ = i_44_;
                    i_50_ = 0;
                    i_44_ = Class124.method1097((byte) 113,
                            Class348_Sub40_Sub6.anInt9139,
                            random);
                    i_43_ = -i_45_ + i_44_;
                    i_46_ = 0;
                    int i_80_ = i_43_;
                    if ((i_80_ ^ 0xffffffff) > -1)
                        i_80_ += Class348_Sub40_Sub6.anInt9139;
                    i_47_ = 0;
                    if ((Class348_Sub40_Sub6.anInt9139 ^ 0xffffffff)
                            > (i_80_ ^ 0xffffffff))
                        i_80_ -= Class348_Sub40_Sub6.anInt9139;
                    bool_48_ = false;
                    for (; ; ) {
                        int[] is_81_ = is_57_[i_47_];
                        if (i_80_ >= is_81_[0] && i_80_ <= is_81_[1])
                            break;
                        if ((++i_47_ ^ 0xffffffff) <= (i_49_ ^ 0xffffffff))
                            i_47_ = 0;
                    }
                }
            }
        }
        return is;
    }

    static {
        anInt9313 = 0;
    }
}
