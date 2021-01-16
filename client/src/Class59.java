/* Class59 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.File;
import java.util.Random;

abstract class Class59 {
    static Class114 aClass114_1068 = new Class114(35, 0);
    private short[] aShortArray1069;
    static int anInt1070;
    int anInt1071;
    static int anInt1072;
    static int anInt1073;
    private int anInt1074 = 4;
    static int anInt1075;
    static int anInt1076;
    static int anInt1077;
    private int anInt1078;
    private int anInt1079;
    static int anInt1080;
    private int anInt1081;
    private final short[] aShortArray1082;
    static double aDouble1083;

    private final void method539(int i) {
        anInt1070++;
        Random random = new Random(anInt1081);
        for (int i_0_ = 0; i_0_ < 255; i_0_++)
            aShortArray1082[i_0_] = (short) i_0_;
        for (int i_1_ = 0; i_1_ < 255; i_1_++) {
            int i_2_ = -i_1_ + 255;
            int i_3_ = Class124.method1097((byte) 106, i_2_, random);
            short i_4_ = aShortArray1082[i_3_];
            aShortArray1082[i_3_] = aShortArray1082[i_2_];
            aShortArray1082[i_2_] = aShortArray1082[256 + i_2_] = i_4_;
        }
        if (i <= 6)
            this.anInt1071 = -11;
    }

    private final void method540(int i) {
        aShortArray1069 = new short[this.anInt1071];
        anInt1072++;
        for (int i_5_ = i; this.anInt1071 > i_5_; i_5_++)
            aShortArray1069[i_5_] = (short) (int) Math.pow(2.0, i_5_);
    }

    abstract void method541(int i);

    final void method542(int i, int i_6_, int i_7_, int i_8_) {
        anInt1073++;
        int[] is = new int[i_6_];
        int[] is_9_ = new int[i];
        for (int i_10_ = 0; i_10_ < i_6_; i_10_++)
            is[i_10_] = (i_10_ << -797283828) / i_6_;
        int[] is_11_ = new int[i_8_];
        for (int i_12_ = 0; i > i_12_; i_12_++)
            is_9_[i_12_] = (i_12_ << 924292012) / i;
        for (int i_13_ = i_7_; i_13_ < i_8_; i_13_++)
            is_11_[i_13_] = (i_13_ << 1719216812) / i_8_;
        method543(true);
        for (int i_14_ = 0; i_8_ > i_14_;
			 i_14_++) {
            for (int i_15_ = 0; i > i_15_;
				 i_15_++) {
                for (int i_16_ = 0; i_6_ > i_16_;
					 i_16_++) {
                    for (int i_17_ = 0;
                         (this.anInt1071 > i_17_);
                         i_17_++) {
                        int i_18_ = aShortArray1069[i_17_] << 374187564;
                        int i_19_ = i_18_ * is_11_[i_14_] >> -58102804;
                        int i_20_ = anInt1074 * i_18_ >> 102038988;
                        int i_21_ = anInt1078 * i_18_ >> 99113516;
                        int i_22_ = is[i_16_] * i_18_ >> -862472724;
                        int i_23_ = i_18_ * anInt1079 >> -1208966836;
                        int i_24_ = i_18_ * is_9_[i_15_] >> -2083662964;
                        i_22_ *= anInt1079;
                        i_24_ *= anInt1078;
                        i_19_ *= anInt1074;
                        int i_25_ = i_22_ >> 2136063468;
                        int i_26_ = i_25_ + 1;
                        i_25_ &= 0xff;
                        int i_27_ = i_24_ >> 1829709740;
                        int i_28_ = 1 + i_27_;
                        i_27_ &= 0xff;
                        int i_29_ = i_19_ >> 1498379500;
                        int i_30_ = i_29_ + 1;
                        i_22_ &= 0xfff;
                        i_24_ &= 0xfff;
                        if (i_28_ >= i_21_)
                            i_28_ = 0;
                        else
                            i_28_ &= 0xff;
                        if (i_26_ >= i_23_)
                            i_26_ = 0;
                        else
                            i_26_ &= 0xff;
                        i_29_ &= 0xff;
                        if (i_20_ > i_30_)
                            i_30_ &= 0xff;
                        else
                            i_30_ = 0;
                        i_19_ &= 0xfff;
                        int i_31_ = -4096 + i_24_;
                        int i_32_ = aShortArray1082[i_30_];
                        int i_33_ = i_22_ + -4096;
                        int i_34_ = Class199.anIntArray2631[i_19_];
                        int i_35_ = Class199.anIntArray2631[i_22_];
                        int i_36_ = Class199.anIntArray2631[i_24_];
                        int i_37_ = i_19_ + -4096;
                        int i_38_ = aShortArray1082[i_29_];
                        int i_39_ = aShortArray1082[i_38_ + i_28_];
                        int i_40_ = aShortArray1082[i_32_ + i_27_];
                        int i_41_ = aShortArray1082[i_28_ - -i_32_];
                        int i_42_ = aShortArray1082[i_38_ + i_27_];
                        int i_43_ = Class301.method2279(true,
                                (aShortArray1082
                                        [i_25_ - -i_42_]),
                                i_19_, i_24_, i_22_);
                        int i_44_ = Class301.method2279(true,
                                (aShortArray1082
                                        [i_26_ + i_42_]),
                                i_19_, i_24_, i_33_);
                        int i_45_ = i_43_ - -((i_44_ - i_43_) * i_35_
                                >> -1190473268);
                        i_43_ = Class301.method2279(true,
                                (aShortArray1082
                                        [i_39_ + i_25_]),
                                i_19_, i_31_, i_22_);
                        i_44_ = Class301.method2279(true,
                                (aShortArray1082
                                        [i_26_ + i_39_]),
                                i_19_, i_31_, i_33_);
                        int i_46_
                                = i_43_ + ((i_44_ + -i_43_) * i_35_ >> 1917444172);
                        i_43_ = Class301.method2279(true,
                                (aShortArray1082
                                        [i_40_ + i_25_]),
                                i_37_, i_24_, i_22_);
                        int i_47_
                                = ((i_46_ + -i_45_) * i_36_ >> -655192468) + i_45_;
                        i_44_ = Class301.method2279(true,
                                (aShortArray1082
                                        [i_40_ + i_26_]),
                                i_37_, i_24_, i_33_);
                        i_45_ = i_43_ + (i_35_ * (i_44_ - i_43_) >> 472750060);
                        i_43_ = Class301.method2279(true,
                                (aShortArray1082
                                        [i_25_ - -i_41_]),
                                i_37_, i_31_, i_22_);
                        i_44_ = Class301.method2279(true,
                                (aShortArray1082
                                        [i_26_ - -i_41_]),
                                i_37_, i_31_, i_33_);
                        i_46_ = (((-i_43_ + i_44_) * i_35_ >> -1538606516)
                                + i_43_);
                        int i_48_
                                = ((i_46_ - i_45_) * i_36_ >> 1360834124) + i_45_;
                        method546(i_47_ + ((-i_47_ + i_48_) * i_34_
                                        >> 1938656396),
                                i_17_, i_7_ ^ ~0x1);
                    }
                    method541(-1538606516);
                }
            }
        }
    }

    abstract void method543(boolean bool);

    static final void method544(String string, boolean bool, int i) {
        anInt1075++;
        Class286_Sub2.method2144("", i, (byte) -96, 0, string, "", "");
        if (bool != false)
            method547(null, -103);
    }

    static final void method545(int i, int i_49_) {
        Class351.aClass60_4327.method578(2, i);
        anInt1077++;
        Class358.aClass60_4417.method578(2, i);
        if (i_49_ != -1)
            aClass114_1068 = null;
        Class239_Sub24.aClass60_6096.method578(2, i);
        Class348_Sub40_Sub9.aClass60_9171.method578(i_49_ ^ ~0x2, i);
    }

    abstract void method546(int i, int i_50_, int i_51_);

    static final int method547(String string, int i) {
        anInt1076++;
        if (!Class59_Sub1.aClass297_5297.aBoolean3777)
            return -1;
        if (Class275.aHashtable3548.containsKey(string))
            return 100;
        String string_52_ = Class334.method2651(string, 3);
        if (string_52_ == null)
            return -1;
        String string_53_ = Class348_Sub41.aString7048 + string_52_;
        if (i != 7468)
            method549((byte) 28, null, null, null);
        if (!Class167.aClass45_2208.method422("", string_53_, -88))
            return -1;
        if (!Class167.aClass45_2208.method413(i ^ 0x1d48, string_53_))
            return Class167.aClass45_2208.method397(string_53_, 0);
        byte[] is = Class167.aClass45_2208.method391(string_53_, "", -29832);
        Object object = null;
        File file;
        try {
            file = Class201.method1466(i + -7470, string_52_);
        } catch (RuntimeException runtimeexception) {
            return -1;
        }
        if (is != null && file != null) {
            boolean bool = true;
            byte[] is_54_ = Class239_Sub24.method1821(i ^ 0x1d5b, file);
            if (is_54_ == null
                    || is_54_.length != is.length)
                bool = false;
            else {
                for (int i_55_ = 0;
					 i_55_ < is_54_.length;
                     i_55_++) {
                    if (is_54_[i_55_] != is[i_55_]) {
                        bool = false;
                        break;
                    }
                }
            }
            try {
                if (!bool)
                    Class59_Sub1.aClass297_5297.method2242(is, (byte) -104,
                            file);
            } catch (Throwable throwable) {
                return -1;
            }
            Class166.method1286(file, 64, string);
            return 100;
        }
        return -1;
    }

    public static void method548(int i) {
        aClass114_1068 = null;
        if (i != 10)
            aClass114_1068 = null;
    }

    static final void method549(byte i, Class348_Sub21 class348_sub21,
                                ha var_ha, Class42 class42) {
        try {
            anInt1080++;
            Class105 class105 = class42.method375(var_ha, false);
            if (class105 != null) {
                int i_56_ = class105.method971();
                if (i_56_ < class105.method969())
                    i_56_ = class105.method969();
                int i_57_ = 10;
                int i_58_ = class348_sub21.anInt6853;
                int i_59_ = class348_sub21.anInt6855;
                int i_60_ = 0;
                int i_61_ = 0;
                int i_62_ = 0;
                if (class42.aString597 != null) {
                    i_60_ = (Class258_Sub1.aClass143_8527.method1188
                            (class42.aString597, null,
                                    ha_Sub3.aStringArray8019, (byte) 87, null));
                    for (int i_63_ = 0; i_60_ > i_63_; i_63_++) {
                        String string = ha_Sub3.aStringArray8019[i_63_];
                        if (i_60_ + -1 > i_63_)
                            string = string.substring(0, string.length() - 4);
                        int i_64_ = Class39.aClass323_521.method2564(string);
                        if (i_61_ < i_64_)
                            i_61_ = i_64_;
                    }
                    i_62_ = (i_60_ * Class39.aClass323_521.method2565()
                            - -(Class39.aClass323_521.method2560() / 2));
                }
                int i_65_
                        = i_56_ / 2 + class348_sub21.anInt6853;
                int i_66_ = class348_sub21.anInt6855;
                if (Class75.anInt1272 - -i_56_ <= i_58_) {
                    if (i_58_ > -i_56_ + Class75.anInt1276) {
                        i_58_ = -i_56_ + Class75.anInt1276;
                        i_65_ = (-(i_56_ / 2) + Class75.anInt1276
                                + (-i_57_ + -(i_61_ / 2) - 5));
                    }
                } else {
                    i_58_ = Class75.anInt1272;
                    i_65_ = i_61_ / 2 + i_57_ + i_56_ / 2 + (Class75.anInt1272
                            + 5);
                }
                if (i_59_ < i_56_ + Class75.anInt1262) {
                    i_59_ = Class75.anInt1262;
                    i_66_ = i_56_ / 2 + i_57_ + Class75.anInt1262;
                } else if (i_59_ > Class75.anInt1268 + -i_56_) {
                    i_59_ = -i_56_ + Class75.anInt1268;
                    i_66_
                            = -(i_56_ / 2) + Class75.anInt1268 - (i_57_ - -i_62_);
                }
                int i_67_
                        = (int) (32767.0
                        * (Math.atan2(i_58_ - (class348_sub21
                                .anInt6853),
						-(class348_sub21
								.anInt6855)
								+ i_59_)
                        / 3.141592653589793)) & 0xffff;
                class105.method981((float) i_56_ / 2.0F + (float) i_58_,
                        (float) i_56_ / 2.0F + (float) i_59_, 4096,
                        i_67_);
                int i_68_ = -2;
                int i_69_ = -2;
                int i_70_ = -2;
                if (i != -43)
                    method545(-91, -16);
                int i_71_ = -2;
                if (class42.aString597 != null) {
                    i_69_ = i_66_;
                    i_68_ = i_65_ + -(i_61_ / 2) - 5;
                    i_71_ = 3 + (i_60_ * Class39.aClass323_521.method2565()
                            + i_69_);
                    i_70_ = i_61_ + (i_68_ + 10);
                    if (class42.anInt602 != 0)
                        var_ha.method3675(-i_68_ + i_70_, (byte) -125, i_68_,
                                i_69_, i_71_ - i_69_,
                                class42.anInt602);
                    if (class42.anInt604 != 0)
                        var_ha.method3668(-i_68_ + i_70_, i_69_,
                                class42.anInt604, i_68_,
                                -i_69_ + i_71_, 67);
                    for (int i_72_ = 0; i_60_ > i_72_; i_72_++) {
                        String string = ha_Sub3.aStringArray8019[i_72_];
                        if (i_72_ < i_60_ + -1)
                            string = string.substring(0, -4 + string.length());
                        Class39.aClass323_521.method2563(var_ha, string, i_65_,
                                i_66_,
                                (class42
                                        .anInt580),
                                true);
                        i_66_ += Class39.aClass323_521.method2565();
                    }
                }
                if (class42.anInt578 != -1
                        || class42.aString597 != null) {
                    i_56_ >>= 1;
                    Class348_Sub12 class348_sub12
                            = new Class348_Sub12(class348_sub21);
                    class348_sub12.anInt6737 = i_70_;
                    class348_sub12.anInt6746
                            = -i_56_ + i_59_;
                    class348_sub12.anInt6735
                            = i_59_ - -i_56_;
                    class348_sub12.anInt6750
                            = i_58_ - -i_56_;
                    class348_sub12.anInt6738 = i_71_;
                    class348_sub12.anInt6753 = i_69_;
                    class348_sub12.anInt6747
                            = i_58_ - i_56_;
                    class348_sub12.anInt6745 = i_68_;
                    Class289.aClass262_3705.method1999(class348_sub12, -20180);
                }
            }
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929
                    (runtimeexception,
                            ("jp.I(" + i + ','
                                    + (class348_sub21 != null ? "{...}" : "null") + ','
                                    + (var_ha != null ? "{...}" : "null") + ','
                                    + (class42 != null ? "{...}" : "null") + ')'));
        }
    }

    Class59(int i, int i_73_, int i_74_, int i_75_, int i_76_) {
        this.anInt1071 = 4;
        anInt1081 = 0;
        aShortArray1082 = new short[512];
        anInt1078 = 4;
        anInt1079 = 4;
        this.anInt1071 = i_73_;
        anInt1078 = i_75_;
        anInt1079 = i_74_;
        anInt1081 = i;
        anInt1074 = i_76_;
        method540(0);
        method539(85);
    }
}
