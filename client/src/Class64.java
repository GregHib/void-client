/* Class64 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class64 {
    boolean aBoolean1124 = false;
    static int anInt1125;
    static int anInt1126;
    static int[] anIntArray1127 = new int[2];
    static int anInt1128;
    static int anInt1129;
    static int anInt1130;
    static Class296 aClass296_1131;
    static int anInt1132;
    static int anInt1133;
    static int anInt1134;
    static int anInt1135;
    static float aFloat1136;
    static int anInt1137;

    abstract void FA(int i);

    abstract void p(int i, int i_0_, s var_s, s var_s_1_, int i_2_, int i_3_,
                    int i_4_);

    private final void method602
            (int i, Class348_Sub33 class348_sub33, int i_5_, boolean bool,
             int i_6_, Class4 class4, int i_7_, int[] is, boolean[] bools,
             Class4 class4_8_, int i_9_, boolean bool_10_) {
        try {
            anInt1130++;
            if (class4 == null || i_7_ == 0) {
                for (int i_11_ = 0; class4_8_.anInt126 > i_11_;
                     i_11_++) {
                    short i_12_ = class4_8_.aShortArray130[i_11_];
                    if (bools == null || bools[i_12_] != !bool
                            || (class348_sub33.anIntArray6957
                            [i_12_]) == 0) {
                        short i_13_
                                = class4_8_.aShortArray128[i_11_];
                        if (i_13_ != -1)
                            method627((class348_sub33
                                            .anIntArrayArray6959[i_13_]),
                                    bool_10_, i, 0, 0,
                                    i_9_ & (class348_sub33
                                            .anIntArray6960[i_13_]),
                                    (byte) -93, 0, is, 0);
                        method627((class348_sub33
                                        .anIntArrayArray6959[i_12_]),
                                bool_10_, i,
                                class4_8_.aShortArray137[i_11_],
                                (class348_sub33
                                        .anIntArray6957[i_12_]),
                                (class348_sub33
                                        .anIntArray6960[i_12_]) & i_9_,
                                (byte) -93,
                                class4_8_.aShortArray140[i_11_],
                                is,
                                class4_8_.aShortArray135[i_11_]);
                    }
                }
            } else {
                int i_14_ = 0;
                int i_15_ = 0;
                int i_16_ = 0;
                int i_17_ = -53 % ((i_5_ - 76) / 41);
                for (/**/; class348_sub33.anInt6965 > i_16_;
                         i_16_++) {
                    boolean bool_18_ = false;
                    if (class4_8_.anInt126 > i_14_
                            && class4_8_.aShortArray130[i_14_] == i_16_)
                        bool_18_ = true;
                    boolean bool_19_ = false;
                    if (class4.anInt126 > i_15_
                            && i_16_ == class4.aShortArray130[i_15_])
                        bool_19_ = true;
                    if (bool_18_ || bool_19_) {
                        if (bools != null && bool == !bools[i_16_]
                                && (class348_sub33
                                .anIntArray6957[i_16_]) != 0) {
                            if (bool_19_)
                                i_15_++;
                            if (bool_18_)
                                i_14_++;
                        } else {
                            int i_20_ = 0;
                            int i_21_ = (class348_sub33
                                    .anIntArray6957[i_16_]);
                            if (i_21_ == 3
                                    || i_21_ == 10)
                                i_20_ = 128;
                            int i_22_;
                            short i_23_;
                            int i_24_;
                            byte i_25_;
                            int i_26_;
                            if (!bool_18_) {
                                i_24_ = i_20_;
                                i_23_ = (short) -1;
                                i_22_ = i_20_;
                                i_26_ = i_20_;
                                i_25_ = (byte) 0;
                            } else {
                                i_22_ = (class4_8_.aShortArray135
                                        [i_14_]);
                                i_23_ = (class4_8_.aShortArray128
                                        [i_14_]);
                                i_24_ = (class4_8_.aShortArray137
                                        [i_14_]);
                                i_25_ = (class4_8_.aByteArray132
                                        [i_14_]);
                                i_26_ = (class4_8_.aShortArray140
                                        [i_14_]);
                                i_14_++;
                            }
                            int i_27_;
                            int i_28_;
                            byte i_29_;
                            int i_30_;
                            short i_31_;
                            if (!bool_19_) {
                                i_28_ = i_20_;
                                i_31_ = (short) -1;
                                i_30_ = i_20_;
                                i_27_ = i_20_;
                                i_29_ = (byte) 0;
                            } else {
                                i_27_
                                        = class4.aShortArray137[i_15_];
                                i_28_
                                        = class4.aShortArray135[i_15_];
                                i_29_ = class4.aByteArray132[i_15_];
                                i_30_
                                        = class4.aShortArray140[i_15_];
                                i_31_
                                        = class4.aShortArray128[i_15_];
                                i_15_++;
                            }
                            if (i_23_ != -1)
                                method627((class348_sub33
                                                .anIntArrayArray6959[i_23_]),
                                        bool_10_, i, 0, 0,
                                        (i_9_
                                                & (class348_sub33
                                                .anIntArray6960[i_23_])),
                                        (byte) -93, 0, is, 0);
                            else if (i_31_ != -1)
                                method627((class348_sub33
                                                .anIntArrayArray6959[i_31_]),
                                        bool_10_, i, 0, 0,
                                        (i_9_
                                                & (class348_sub33
                                                .anIntArray6960[i_31_])),
                                        (byte) -93, 0, is, 0);
                            int i_32_;
                            int i_33_;
                            int i_34_;
                            if ((0x2 & i_25_) != 0
                                    || (i_29_ & 0x1) != 0) {
                                i_32_ = i_26_;
                                i_34_ = i_22_;
                                i_33_ = i_24_;
                            } else if (i_21_ != 2) {
                                if (i_21_ == 9) {
                                    int i_35_ = i_30_ + -i_26_ & 0x3fff;
                                    if (i_35_ >= 8192)
                                        i_35_ -= 16384;
                                    i_32_
                                            = i_35_ * i_7_ / i_6_ + i_26_ & 0x3fff;
                                    i_33_ = i_34_ = 0;
                                } else if (i_21_ == 7) {
                                    int i_36_ = 0x3f & i_30_ + -i_26_;
                                    if (i_36_ >= 32)
                                        i_36_ -= 64;
                                    i_32_ = (i_26_ - -(i_36_ * i_7_ / i_6_)
                                            & 0x3f);
                                    i_33_ = (i_7_ * (i_27_ + -i_24_) / i_6_
                                            + i_24_);
                                    i_34_ = ((-i_22_ + i_28_) * i_7_ / i_6_
                                            + i_22_);
                                } else {
                                    i_32_ = (i_26_
                                            + i_7_ * (i_30_ - i_26_) / i_6_);
                                    i_34_ = i_22_ - -((i_28_ + -i_22_) * i_7_
                                            / i_6_);
                                    i_33_ = (i_7_ * (-i_24_ + i_27_) / i_6_
                                            + i_24_);
                                }
                            } else {
                                int i_37_ = 0x3fff & i_30_ - i_26_;
                                int i_38_ = i_27_ + -i_24_ & 0x3fff;
                                int i_39_ = 0x3fff & i_28_ - i_22_;
                                if (i_37_ >= 8192)
                                    i_37_ -= 16384;
                                if (i_38_ >= 8192)
                                    i_38_ -= 16384;
                                if (i_39_ >= 8192)
                                    i_39_ -= 16384;
                                i_32_
                                        = i_26_ - -(i_37_ * i_7_ / i_6_) & 0x3fff;
                                i_33_ = i_38_ * i_7_ / i_6_ + i_24_ & 0x3fff;
                                i_34_
                                        = 0x3fff & i_22_ - -(i_7_ * i_39_ / i_6_);
                            }
                            method627((class348_sub33
                                            .anIntArrayArray6959[i_16_]),
                                    bool_10_, i, i_33_, i_21_,
                                    i_9_ & (class348_sub33
                                            .anIntArray6960[i_16_]),
                                    (byte) -93, i_32_, is, i_34_);
                        }
                    }
                }
            }
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929
                    (runtimeexception,
                            ("ka.AC(" + i + ','
                                    + (class348_sub33 != null ? "{...}" : "null") + ','
                                    + i_5_ + ',' + bool + ',' + i_6_ + ','
                                    + (class4 != null ? "{...}" : "null") + ',' + i_7_
                                    + ',' + (is != null ? "{...}" : "null") + ','
                                    + (bools != null ? "{...}" : "null") + ','
                                    + (class4_8_ != null ? "{...}" : "null") + ',' + i_9_
                                    + ',' + bool_10_ + ')'));
        }
    }

    final void method603(byte i, int i_40_, int[] is, int i_41_, int i_42_,
                         int i_43_, Class348_Sub42_Sub17 class348_sub42_sub17,
                         int i_44_,
                         Class348_Sub42_Sub17 class348_sub42_sub17_45_,
                         boolean bool, int i_46_) {
        try {
            anInt1133++;
            if (i_42_ != -1) {
                method622();
                if (!NA())
                    method621();
                else {
                    Class4 class4
                            = (class348_sub42_sub17_45_
                            .aClass4Array9673[i_42_]);
                    if (i != -55)
                        this.aBoolean1124 = false;
                    Class348_Sub33 class348_sub33
                            = class4.aClass348_Sub33_134;
                    Class4 class4_47_ = null;
                    if (class348_sub42_sub17 != null) {
                        class4_47_
                                = (class348_sub42_sub17
                                .aClass4Array9673[i_43_]);
                        if (class4_47_.aClass348_Sub33_134
                                != class348_sub33)
                            class4_47_ = null;
                    }
                    method602(i_44_, class348_sub33, -18, false, i_46_,
                            class4_47_, i_40_, is, null, class4, i_41_,
                            bool);
                    wa();
                    method621();
                }
            }
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929
                    (runtimeexception,
                            ("ka.QB(" + i + ',' + i_40_ + ','
                                    + (is != null ? "{...}" : "null") + ',' + i_41_ + ','
                                    + i_42_ + ',' + i_43_ + ','
                                    + (class348_sub42_sub17 != null ? "{...}" : "null")
                                    + ',' + i_44_ + ','
                                    + (class348_sub42_sub17_45_ != null ? "{...}" : "null")
                                    + ',' + bool + ',' + i_46_ + ')'));
        }
    }

    abstract Class342[] method604();

    abstract void C(int i);

    abstract void method605(int i, int[] is, int i_48_, int i_49_, int i_50_,
                            int i_51_, boolean bool);

    static final void method606(int i, boolean bool, String string) {
        anInt1128++;
        string = string.toLowerCase();
        short[] is = new short[16];
        int i_52_ = i;
        int i_53_ = bool ? 32768 : 0;
        int i_54_
                = ((!bool ? Class239_Sub6.aClass355_5900.anInt4365
                : Class239_Sub6.aClass355_5900.anInt4364)
                + i_53_);
        for (int i_55_ = i_53_; i_55_ < i_54_;
             i_55_++) {
            Class348_Sub42_Sub10 class348_sub42_sub10
                    = Class239_Sub6.aClass355_5900.method3471(i_55_, (byte) -102);
            if (class348_sub42_sub10.aBoolean9562
                    && class348_sub42_sub10.method3219(98).toLowerCase()
                    .indexOf(string) != -1) {
                if (i_52_ >= 50) {
                    Class192.aShortArray2579 = null;
                    Class76.anInt1285 = -1;
                    return;
                }
                if (is.length <= i_52_) {
                    short[] is_56_ = new short[is.length * 2];
                    for (int i_57_ = 0; i_52_ > i_57_; i_57_++)
                        is_56_[i_57_] = is[i_57_];
                    is = is_56_;
                }
                is[i_52_++] = (short) i_55_;
            }
        }
        Class76.anInt1285 = i_52_;
        Class148.anInt2037 = 0;
        Class192.aShortArray2579 = is;
        String[] strings = new String[Class76.anInt1285];
        for (int i_58_ = 0; Class76.anInt1285 > i_58_; i_58_++)
            strings[i_58_] = Class239_Sub6.aClass355_5900.method3471
                    (is[i_58_], (byte) -91)
                    .method3219(Class348_Sub21.method2955(i, 81));
        Class174.method1333(Class192.aShortArray2579, i + 26073, strings);
    }

    abstract void wa();

    abstract void I(int i, int[] is, int i_59_, int i_60_, int i_61_,
                    boolean bool, int i_62_, int[] is_63_);

    abstract int G();

    static final void method607(int i, String[] strings, short[] is, int i_64_,
                                boolean bool) {
        try {
            if (bool != false)
                aFloat1136 = 0.5791872F;
            if (i > i_64_) {
                int i_65_ = (i_64_ - -i) / 2;
                int i_66_ = i_64_;
                String string = strings[i_65_];
                strings[i_65_] = strings[i];
                strings[i] = string;
                short i_67_ = is[i_65_];
                is[i_65_] = is[i];
                is[i] = i_67_;
                for (int i_68_ = i_64_;
                     i_68_ < i; i_68_++) {
                    if (string == null
                            || (strings[i_68_] != null
                            && (strings[i_68_].compareTo(string) < (i_68_ & 0x1)))) {
                        String string_69_ = strings[i_68_];
                        strings[i_68_] = strings[i_66_];
                        strings[i_66_] = string_69_;
                        short i_70_ = is[i_68_];
                        is[i_68_] = is[i_66_];
                        is[i_66_++] = i_70_;
                    }
                }
                strings[i] = strings[i_66_];
                strings[i_66_] = string;
                is[i] = is[i_66_];
                is[i_66_] = i_67_;
                method607(i_66_ + -1, strings, is, i_64_, false);
                method607(i, strings, is, 1 + i_66_, bool);
            }
            anInt1134++;
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception,
                    ("ka.UB(" + i + ','
                            + (strings != null ? "{...}"
                            : "null")
                            + ','
                            + (is != null ? "{...}" : "null")
                            + ',' + i_64_ + ',' + bool
                            + ')'));
        }
    }

    abstract boolean NA();

    abstract void LA(int i);

    abstract void method608(Class101 class101, Class318_Sub3 class318_sub3,
                            int i, int i_71_);

    abstract int ua();

    abstract int HA();

    abstract int ma();

    public static void method609(byte i) {
        if (i <= -7) {
            aClass296_1131 = null;
            anIntArray1127 = null;
        }
    }

    abstract boolean F();

    abstract void O(int i, int i_72_, int i_73_);

    abstract void method610(Class101 class101, int i, boolean bool);

    abstract int EA();

    final void method611(int i, int i_74_,
                         Class348_Sub42_Sub17 class348_sub42_sub17) {
        anInt1126++;
        if (i != -1) {
            method622();
            if (!NA())
                method621();
            else {
                Class4 class4 = (class348_sub42_sub17
                        .aClass4Array9673[i]);
                Class348_Sub33 class348_sub33
                        = class4.aClass348_Sub33_134;
                for (int i_75_ = 0; (i_75_ < class4.anInt126); i_75_++) {
                    short i_76_ = class4.aShortArray130[i_75_];
                    if (class348_sub33.aBooleanArray6954
                            [i_76_]) {
                        if (class4.aShortArray128[i_75_] != -1)
                            P(0, 0, 0, 0);
                        P((class348_sub33.anIntArray6957
                                        [i_76_]),
                                class4.aShortArray140[i_75_],
                                class4.aShortArray137[i_75_],
                                class4.aShortArray135[i_75_]);
                    }
                }
                if (i_74_ != -8700)
                    anIntArray1127 = null;
                wa();
                method621();
            }
        }
    }

    abstract void method612();

    abstract int da();

    abstract void s(int i);

    abstract int RA();

    abstract void method613(Class64 class64_77_, int i, int i_78_, int i_79_,
                            boolean bool);

    abstract void v();

    abstract Class64 method614(byte i, int i_80_, boolean bool);

    abstract void method615(Class101 class101, Class318_Sub3 class318_sub3,
                            int i);

    static final boolean method616(int i, int i_81_, int i_82_) {
        anInt1129++;
        if (i != 2)
            return false;
        return (i_81_ & 0x800) != 0;
    }

    final void method617
            (int i, int i_83_, Class348_Sub42_Sub17 class348_sub42_sub17,
             int i_84_, Class348_Sub42_Sub17 class348_sub42_sub17_85_,
             boolean bool, boolean bool_86_, int i_87_, int i_88_) {
        try {
            anInt1125++;
            if (i != -1) {
                method622();
                if (!NA())
                    method621();
                else {
                    Class4 class4
                            = (class348_sub42_sub17_85_
                            .aClass4Array9673[i]);
                    Class348_Sub33 class348_sub33
                            = class4.aClass348_Sub33_134;
                    Class4 class4_89_ = null;
                    if (class348_sub42_sub17 != null) {
                        class4_89_
                                = (class348_sub42_sub17
                                .aClass4Array9673[i_87_]);
                        if (class348_sub33
                                != class4_89_.aClass348_Sub33_134)
                            class4_89_ = null;
                    }
                    method602(i_84_, class348_sub33, 121, bool, i_83_,
                            class4_89_, i_88_, null, null, class4, 65535,
                            bool_86_);
                    wa();
                    method621();
                }
            }
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception,
                    ("ka.BC(" + i + ',' + i_83_ + ','
                            + (class348_sub42_sub17 != null
                            ? "{...}" : "null")
                            + ',' + i_84_ + ','
                            + ((class348_sub42_sub17_85_
                            != null)
                            ? "{...}" : "null")
                            + ',' + bool + ',' + bool_86_
                            + ',' + i_87_ + ',' + i_88_
                            + ')'));
        }
    }

    abstract boolean r();

    abstract boolean method618();

    abstract int fa();

    abstract void a(int i);

    abstract Class129[] method619();

    abstract int V();

    abstract void H(int i, int i_90_, int i_91_);

    abstract void method620(Class101 class101);

    abstract void method621();

    abstract void method622();

    abstract void k(int i);

    abstract boolean method623(int i, int i_92_, Class101 class101,
                               boolean bool, int i_93_, int i_94_);

    abstract void P(int i, int i_95_, int i_96_, int i_97_);

    abstract int WA();

    abstract void VA(int i);

    abstract void method624(int i, int i_98_, int i_99_, int i_100_);

    abstract int na();

    final void method625
            (Class348_Sub42_Sub17 class348_sub42_sub17, int i, byte i_101_,
             int i_102_, Class348_Sub42_Sub17 class348_sub42_sub17_103_,
             int i_104_, int i_105_, int i_106_,
             Class348_Sub42_Sub17 class348_sub42_sub17_107_, boolean bool,
             int i_108_, Class348_Sub42_Sub17 class348_sub42_sub17_109_,
             int i_110_, boolean[] bools, int i_111_) {
        try {
            anInt1135++;
            if (i_104_ != -1) {
                if (i_101_ <= 103)
                    aFloat1136 = 0.38855714F;
                if (bools == null || i_105_ == -1)
                    method617(i_104_, i, class348_sub42_sub17, 0,
                            class348_sub42_sub17_107_, false, bool, i_108_,
                            i_106_);
                else {
                    method622();
                    if (!NA())
                        method621();
                    else {
                        Class4 class4 = (class348_sub42_sub17_107_
                                .aClass4Array9673[i_104_]);
                        Class348_Sub33 class348_sub33
                                = class4.aClass348_Sub33_134;
                        Class4 class4_112_ = null;
                        if (class348_sub42_sub17 != null) {
                            class4_112_ = (class348_sub42_sub17
                                    .aClass4Array9673[i_108_]);
                            if (class348_sub33
                                    != class4_112_.aClass348_Sub33_134)
                                class4_112_ = null;
                        }
                        method602(0, class348_sub33, -70, false, i,
                                class4_112_, i_106_, null, bools, class4,
                                65535, bool);
                        Class4 class4_113_ = (class348_sub42_sub17_103_
                                .aClass4Array9673[i_105_]);
                        Class4 class4_114_ = null;
                        if (class348_sub42_sub17_109_ != null) {
                            class4_114_ = (class348_sub42_sub17_109_
                                    .aClass4Array9673[i_111_]);
                            if (class4_114_.aClass348_Sub33_134
                                    != class348_sub33)
                                class4_114_ = null;
                        }
                        method605(0, new int[0], 0, 0, 0, 0, bool);
                        method602(0,
                                class4_113_.aClass348_Sub33_134,
                                122, true, i_102_, class4_114_, i_110_, null,
                                bools, class4_113_, 65535, bool);
                        wa();
                        method621();
                    }
                }
            }
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929
                    (runtimeexception,
                            ("ka.VB("
                                    + (class348_sub42_sub17 != null ? "{...}" : "null")
                                    + ',' + i + ',' + i_101_ + ',' + i_102_ + ','
                                    + (class348_sub42_sub17_103_ != null ? "{...}"
                                    : "null")
                                    + ',' + i_104_ + ',' + i_105_ + ',' + i_106_ + ','
                                    + (class348_sub42_sub17_107_ != null ? "{...}"
                                    : "null")
                                    + ',' + bool + ',' + i_108_ + ','
                                    + (class348_sub42_sub17_109_ != null ? "{...}"
                                    : "null")
                                    + ',' + i_110_ + ','
                                    + (bools != null ? "{...}" : "null") + ',' + i_111_
                                    + ')'));
        }
    }

    abstract void ia(short i, short i_115_);

    final void method626(int i, int i_116_, int i_117_, int i_118_, int i_119_,
                         int i_120_, int i_121_, s var_s, int i_122_) {
        anInt1137++;
        boolean bool = false;
        boolean bool_123_ = false;
        boolean bool_124_ = false;
        int i_125_ = -i / 2;
        int i_126_ = -i_119_ / 2;
        int i_127_
                = var_s.method3986(i_118_ + i_125_, i_126_ + i_122_, (byte) 10);
        int i_128_ = i / 2;
        int i_129_ = -i_119_ / 2;
        int i_130_
                = var_s.method3986(i_128_ + i_118_, i_122_ - -i_129_, (byte) -116);
        int i_131_ = -i / 2;
        int i_132_ = i_119_ / 2;
        int i_133_
                = var_s.method3986(i_118_ + i_131_, i_122_ - -i_132_, (byte) -111);
        int i_134_ = i / 2;
        if (i_116_ != 10947)
            EA();
        int i_135_ = i_119_ / 2;
        int i_136_
                = var_s.method3986(i_118_ + i_134_, i_135_ + i_122_, (byte) 50);
        int i_137_
                = i_130_ > i_127_ ? i_127_ : i_130_;
        int i_138_ = i_136_ <= i_133_ ? i_136_ : i_133_;
        int i_139_
                = i_136_ > i_130_ ? i_130_ : i_136_;
        if (i_119_ != 0) {
            int i_140_ = 0x3fff & (int) (Math.atan2(i_137_ - i_138_,
                    i_119_)
                    * 2607.5945876176133);
            if (i_140_ != 0) {
                if (i_121_ != 0) {
                    if (i_140_ > 8192) {
                        int i_141_ = -i_121_ + 16384;
                        if (i_141_ > i_140_)
                            i_140_ = i_141_;
                    } else if (i_140_ > i_121_)
                        i_140_ = i_121_;
                }
                FA(i_140_);
            }
        }
        int i_142_
                = i_133_ <= i_127_ ? i_133_ : i_127_;
        if (i != 0) {
            int i_143_
                    = (0x3fff
                    & (int) (Math.atan2(-i_139_ + i_142_, i)
                    * 2607.5945876176133));
            if (i_143_ != 0) {
                if (i_117_ != 0) {
                    if (i_143_ > 8192) {
                        int i_144_ = 16384 - i_117_;
                        if (i_144_ > i_143_)
                            i_143_ = i_144_;
                    } else if (i_117_ < i_143_)
                        i_143_ = i_117_;
                }
                VA(i_143_);
            }
        }
        int i_145_ = i_136_ + i_127_;
        if (i_133_ + i_130_ < i_145_)
            i_145_ = i_133_ + i_130_;
        i_145_ = (i_145_ >> -642454047) - i_120_;
        if (i_145_ != 0)
            H(0, i_145_, 0);
    }

    private final void method627(int[] is, boolean bool, int i, int i_146_,
                                 int i_147_, int i_148_, byte i_149_,
                                 int i_150_, int[] is_151_, int i_152_) {
        try {
            anInt1132++;
            if (i_149_ == -93) {
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            if (i_147_ != 0 && i_147_ != 1) {
                                if (i_147_ != 3) {
                                    if (i_147_ == 2) {
                                        int i_153_ = i_150_;
                                        i_150_ = i_152_ & 0x3fff;
                                        i_152_ = -i_153_ & 0x3fff;
                                    }
                                } else {
                                    int i_154_ = i_150_;
                                    i_150_ = i_152_;
                                    i_152_ = i_154_;
                                }
                            } else {
                                int i_155_ = i_150_;
                                i_150_ = -i_152_;
                                i_152_ = i_155_;
                            }
                        }
                    } else if (i_147_ == 0 || i_147_ == 1) {
                        i_150_ = -i_150_;
                        i_152_ = -i_152_;
                    } else if (i_147_ == 2) {
                        i_152_ = 0x3fff & -i_152_;
                        i_150_ = 0x3fff & -i_150_;
                    }
                } else if (i_147_ == 0
                        || i_147_ == 1) {
                    int i_156_ = -i_150_;
                    i_150_ = i_152_;
                    i_152_ = i_156_;
                } else if (i_147_ != 3) {
                    if (i_147_ == 2) {
                        int i_157_ = i_150_;
                        i_150_ = -i_152_ & 0x3fff;
                        i_152_ = i_157_ & 0x3fff;
                    }
                } else {
                    int i_158_ = i_150_;
                    i_150_ = i_152_;
                    i_152_ = i_158_;
                }
                if (i_148_ == 65535)
                    method605(i_147_, is, i_150_, i_146_, i_152_, i, bool);
                else
                    I(i_147_, is, i_150_, i_146_, i_152_, bool, i_148_,
                            is_151_);
            }
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception,
                    ("ka.PB("
                            + (is != null ? "{...}" : "null")
                            + ',' + bool + ',' + i + ','
                            + i_146_ + ',' + i_147_ + ','
                            + i_148_ + ',' + i_149_ + ','
                            + i_150_ + ','
                            + (is_151_ != null ? "{...}"
                            : "null")
                            + ',' + i_152_ + ')'));
        }
    }

    public Class64() {
        /* empty */
    }

    abstract boolean method628(int i, int i_159_, Class101 class101,
                               boolean bool, int i_160_);

    abstract void aa(short i, short i_161_);

    abstract r ba(r var_r);
}
