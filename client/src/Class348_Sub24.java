/* Class348_Sub24 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.File;

final class Class348_Sub24 extends Class348 {
    static int anInt6871;
    int anInt6872;
    static int anInt6873;
    static int anInt6874;
    int anInt6875;
    static String aString6876;
    static String aString6877;
    static int[] anIntArray6878;

    static final void method2991(int i) {
        if (Class289.anInt3699 > 1) {
            Class348_Sub40_Sub23.anInt9313 = Class311.anInt3918;
            Class289.anInt3699--;
        }
        anInt6874++;
        if (Class110.aBoolean1712) {
            Class110.aBoolean1712 = false;
            Class272.method2049(67);
        } else {
            if (!Class5_Sub1.aBoolean8335) Class64_Sub2.method661((byte) 95);
            for (int i_0_ = 0; i_0_ < 100; i_0_++) {
                if (!Class292.method2203((byte) -52)) break;
            }
            if (Class240.anInt4674 == 10) {
                while (Class286.method2138(i ^ 0x2ca2)) {
                    Class348_Sub47 class348_sub47 = Class286_Sub3.method2148(Class140.aClass351_1961, (Class348_Sub23_Sub2.aClass77_9029), -92);
                    class348_sub47.aClass348_Sub49_Sub2_7116.writeByte(false, 0);
                    int i_1_ = (class348_sub47.aClass348_Sub49_Sub2_7116.anInt7197);
                    Class348_Sub33.method3025((byte) 121, (class348_sub47.aClass348_Sub49_Sub2_7116));
                    class348_sub47.aClass348_Sub49_Sub2_7116.method3339(113, (class348_sub47.aClass348_Sub49_Sub2_7116.anInt7197) + -i_1_);
                    Class348_Sub42_Sub14.method3243(119, class348_sub47);
                }
                if (Class239_Sub4.aClass348_Sub26_5881 != null) {
                    if ((Class239_Sub4.aClass348_Sub26_5881.anInt6887) != -1) {
                        Class348_Sub47 class348_sub47 = Class286_Sub3.method2148((Class367_Sub4.aClass351_7318), (Class348_Sub23_Sub2.aClass77_9029), -81);
                        class348_sub47.aClass348_Sub49_Sub2_7116.writeShort((byte) 107, Class239_Sub4.aClass348_Sub26_5881.anInt6887);
                        Class348_Sub42_Sub14.method3243(122, class348_sub47);
                        Class239_Sub4.aClass348_Sub26_5881 = null;
                        Class101_Sub2.aLong5745 = Class62.method599(-106) + 30000L;
                    }
                } else if (Class101_Sub2.aLong5745 <= Class62.method599(-121)) Class239_Sub4.aClass348_Sub26_5881 = Class76.aClass169_1286.method1302(-5255, (Class3.aClass161_125.aString2147));
                Class348_Sub45 class348_sub45 = ((Class348_Sub45) Class318_Sub1_Sub3.aClass262_8744.method1995(4));
                if (class348_sub45 != null || (Class355.aLong4367 < -2000L + Class62.method599(-97))) {
                    Class348_Sub47 class348_sub47 = null;
                    int i_2_ = 0;
                    for (Class348_Sub45 class348_sub45_3_ = ((Class348_Sub45) r_Sub1.aClass262_10479.method1995(4)); class348_sub45_3_ != null; class348_sub45_3_ = (Class348_Sub45) r_Sub1.aClass262_10479.method1990((byte) 79)) {
                        if (class348_sub47 != null && (class348_sub47.aClass348_Sub49_Sub2_7116.anInt7197 - i_2_ >= 240)) break;
                        class348_sub45_3_.method2715((byte) 107);
                        int i_4_ = class348_sub45_3_.method3311(-15);
                        if (i_4_ >= -1) {
                            if (i_4_ > 65534) i_4_ = 65534;
                        } else i_4_ = -1;
                        int i_5_ = class348_sub45_3_.method3308((byte) -127);
                        if (i_5_ >= -1) {
                            if (i_5_ > 65534) i_5_ = 65534;
                        } else i_5_ = -1;
                        if (s_Sub2.anInt8270 != i_5_ || i_4_ != Class322.anInt4032) {
                            if (class348_sub47 == null) {
                                Class361.anInt4450++;
                                class348_sub47 = (Class286_Sub3.method2148(Class348_Sub42_Sub11.aClass351_9590, Class348_Sub23_Sub2.aClass77_9029, -94));
                                class348_sub47.aClass348_Sub49_Sub2_7116.writeByte(false, 0);
                                i_2_ = class348_sub47.aClass348_Sub49_Sub2_7116.anInt7197;
                            }
                            int i_6_ = -s_Sub2.anInt8270 + i_5_;
                            s_Sub2.anInt8270 = i_5_;
                            int i_7_ = i_4_ - Class322.anInt4032;
                            Class322.anInt4032 = i_4_;
                            int i_8_ = (int) ((class348_sub45_3_.method3312((byte) -107) + -Class355.aLong4367) / 20L);
                            if (i_8_ >= 8 || i_6_ < -32 || i_6_ > 31 || i_7_ < -32 || i_7_ > 31) {
                                if (i_8_ < 32 && i_6_ >= -128 && i_6_ <= 127 && i_7_ >= -128 && i_7_ <= 127) {
                                    i_6_ += 128;
                                    i_7_ += 128;
                                    class348_sub47.aClass348_Sub49_Sub2_7116.writeByte(false, 128 + i_8_);
                                    class348_sub47.aClass348_Sub49_Sub2_7116.writeShort((byte) 107, i_7_ + (i_6_ << 8));
                                } else if (i_8_ >= 32) {
                                    class348_sub47.aClass348_Sub49_Sub2_7116.writeShort((byte) 107, 57344 + i_8_);
                                    if (i_5_ == 1 || i_4_ == -1) class348_sub47.aClass348_Sub49_Sub2_7116.writeInt((byte) 99, -2147483648);
                                    else class348_sub47.aClass348_Sub49_Sub2_7116.writeInt((byte) 101, i_4_ << 16 | i_5_);
                                } else {
                                    class348_sub47.aClass348_Sub49_Sub2_7116.writeByte(false, 192 + i_8_);
                                    if (i_5_ != 1 && i_4_ != -1) class348_sub47.aClass348_Sub49_Sub2_7116.writeInt((byte) 100, i_5_ | i_4_ << 16);
                                    else class348_sub47.aClass348_Sub49_Sub2_7116.writeInt((byte) 114, -2147483648);
                                }
                            } else {
                                i_6_ += 32;
                                i_7_ += 32;
                                class348_sub47.aClass348_Sub49_Sub2_7116.writeShort((byte) 107, (i_7_ + (i_6_ << 6) + (i_8_ << 12)));
                            }
                            Class355.aLong4367 = class348_sub45_3_.method3312((byte) -109);
                        }
                    }
                    if (class348_sub47 != null) {
                        class348_sub47.aClass348_Sub49_Sub2_7116.method3339(105, class348_sub47.aClass348_Sub49_Sub2_7116.anInt7197 + -i_2_);
                        Class348_Sub42_Sub14.method3243(23, class348_sub47);
                    }
                }
                if (class348_sub45 != null) {
                    long l = ((class348_sub45.method3312((byte) -110) + -Class14.aLong5089) / 50L);
                    Class14.aLong5089 = class348_sub45.method3312((byte) -87);
                    if (l > 32767) l = 32767L;
                    int i_9_ = class348_sub45.method3311(20);
                    if (i_9_ >= 0) {
                        if (i_9_ > 65535) i_9_ = 65535;
                    } else i_9_ = 0;
                    int i_10_ = class348_sub45.method3308((byte) -128);
                    if (i_10_ < 0) i_10_ = 0;
                    else if (i_10_ > 65535) i_10_ = 65535;
                    int i_11_ = 0;
                    if (class348_sub45.method3310(i ^ 0x2cee) == 2) i_11_ = 1;
                    int i_12_ = (int) l;
                    Class10.anInt182++;
                    Class348_Sub47 class348_sub47 = Class286_Sub3.method2148(Class27.aClass351_395, (Class348_Sub23_Sub2.aClass77_9029), i + -11525);
                    class348_sub47.aClass348_Sub49_Sub2_7116.writeShort((byte) 107, i_12_ | i_11_ << 15);
                    class348_sub47.aClass348_Sub49_Sub2_7116.writeInt((byte) 121, i_9_ << 16 | i_10_);
                    Class348_Sub42_Sub14.method3243(25, class348_sub47);
                }
                if (Class253.anInt3246 > 0) {
                    Class348_Sub40_Sub26.anInt9348++;
                    Class348_Sub47 class348_sub47 = Class286_Sub3.method2148((Class328_Sub1_Sub1.aClass351_8798), (Class348_Sub23_Sub2.aClass77_9029), -111);
                    class348_sub47.aClass348_Sub49_Sub2_7116.writeByte(false, 3 * Class253.anInt3246);
                    for (int i_13_ = 0; (i_13_ < Class253.anInt3246); i_13_++) {
                        Interface6 interface6 = Class308.anInterface6Array3884[i_13_];
                        long l = ((interface6.method29((byte) -29) + -Class348_Sub7.aLong6651) / 50L);
                        Class348_Sub7.aLong6651 = interface6.method29((byte) 106);
                        if (l > 65535L) l = 65535L;
                        class348_sub47.aClass348_Sub49_Sub2_7116.writeByte(false, interface6.method30(false));
                        class348_sub47.aClass348_Sub49_Sub2_7116.writeShort((byte) 107, (int) l);
                    }
                    Class348_Sub42_Sub14.method3243(-49, class348_sub47);
                }
                if (Class147.anInt2035 > 0) Class147.anInt2035--;
                if (Class369_Sub3_Sub1.aBoolean10174 && Class147.anInt2035 <= 0) {
                    Class239_Sub18.anInt6033++;
                    Class369_Sub3_Sub1.aBoolean10174 = false;
                    Class147.anInt2035 = 20;
                    Class348_Sub47 class348_sub47 = Class286_Sub3.method2148(Class281.aClass351_3648, (Class348_Sub23_Sub2.aClass77_9029), i + -11549);
                    class348_sub47.aClass348_Sub49_Sub2_7116.writeShortAddLittle(i ^ 0x3c4d, (int) Class314.aFloat3938 >> 3);
                    class348_sub47.aClass348_Sub49_Sub2_7116.writeShort((byte) 107, (int) Class76.aFloat1287 >> 3);
                    Class348_Sub42_Sub14.method3243(-31, class348_sub47);
                }
                if (Class347.aBoolean4278 != Class175.aBoolean2329) {
                    Class269.anInt3460++;
                    Class347.aBoolean4278 = Class175.aBoolean2329;
                    Class348_Sub47 class348_sub47 = Class286_Sub3.method2148((InputStream_Sub1.aClass351_77), (Class348_Sub23_Sub2.aClass77_9029), i ^ ~0x2cc8);
                    class348_sub47.aClass348_Sub49_Sub2_7116.writeByte(false, !Class175.aBoolean2329 ? 0 : 1);
                    Class348_Sub42_Sub14.method3243(i + -11501, class348_sub47);
                }
                if (!r.aBoolean9719) {
                    Class62.anInt1110++;
                    Class348_Sub47 class348_sub47 = Class286_Sub3.method2148((Class348_Sub49_Sub1.aClass351_9743), (Class348_Sub23_Sub2.aClass77_9029), -113);
                    class348_sub47.aClass348_Sub49_Sub2_7116.writeByte(false, 0);
                    int i_14_ = (class348_sub47.aClass348_Sub49_Sub2_7116.anInt7197);
                    Class348_Sub49 class348_sub49 = Class316.aClass348_Sub51_3959.method3427(i ^ 0x2cb0);
                    class348_sub47.aClass348_Sub49_Sub2_7116.writeBytes(class348_sub49.anInt7197, 0, class348_sub49.aByteArray7154, 82);
                    class348_sub47.aClass348_Sub49_Sub2_7116.method3339(96, (class348_sub47.aClass348_Sub49_Sub2_7116.anInt7197) + -i_14_);
                    Class348_Sub42_Sub14.method3243(i + -11473, class348_sub47);
                    r.aBoolean9719 = true;
                }
                if (Class147.aClass357ArrayArrayArray2029 != null) {
                    if (Class348_Sub40_Sub21.anInt9282 == 2) Class14_Sub1.method241((byte) 127);
                    else if (Class348_Sub40_Sub21.anInt9282 == 3) Class348_Sub21.method2954((byte) -4);
                }
                if (!Class160.aBoolean2130) Class205.aFloat2687 /= 2.0F;
                else Class160.aBoolean2130 = false;
                if (!Class50_Sub1.aBoolean5224) Class348_Sub27.aFloat6898 /= 2.0F;
                else Class50_Sub1.aBoolean5224 = false;
                Class348_Sub35.method3027((byte) 33);
                if (Class240.anInt4674 == 10) {
                    Class348_Sub42_Sub3.method3175((byte) 55);
                    Class38.method362(i + -11335);
                    Class206.method1501(-123);
                    Class348_Sub50.anInt7213++;
                    if (Class348_Sub50.anInt7213 > 750) Class272.method2049(83);
                    else {
                        Class34.method349(i + -6692);
                        Class348_Sub40_Sub38.method3150(true);
                        Class186.method1397(0);
                        for (int i_15_ = Class318_Sub1_Sub3_Sub3.aClass170_10209.method1305((byte) -126, true); i_15_ != -1; i_15_ = Class318_Sub1_Sub3_Sub3.aClass170_10209.method1305((byte) -128, false)) {
                            Class239_Sub11.method1767(true, i_15_);
                            Class327.anIntArray4096[Class139.method1166(31, Class287.anInt3695++)] = i_15_;
                        }
                        for (Class348_Sub42_Sub15 class348_sub42_sub15 = Class348_Sub40_Sub30.method3127(2681); class348_sub42_sub15 != null; class348_sub42_sub15 = Class348_Sub40_Sub30.method3127(2681)) {
                            int i_16_ = class348_sub42_sub15.method3245(true);
                            int i_17_ = class348_sub42_sub15.method3248(1);
                            if (i_16_ == 1) {
                                Class77.anIntArray1303[i_17_] = class348_sub42_sub15.anInt9652;
                                Class184.aBoolean2469 |= Class286_Sub6.aBooleanArray6270[i_17_];
                                Class348_Sub26.anIntArray6890[Class139.method1166(31, Class5_Sub1.anInt8352++)] = i_17_;
                            } else if (i_16_ == 2) {
                                Class258_Sub2.aStringArray8532[i_17_] = class348_sub42_sub15.aString9654;
                                Class239_Sub21.anIntArray6061[Class139.method1166(Class348_Sub40_Sub30.anInt9385++, 31)] = i_17_;
                            } else if (i_16_ == 3) {
                                Class46 class46 = Class324.method2570(1512932720, i_17_);
                                if (!class348_sub42_sub15.aString9654.equals(class46.aString792)) {
                                    class46.aString792 = class348_sub42_sub15.aString9654;
                                    Class251.method1916(-9343, class46);
                                }
                            } else if (i_16_ == 4) {
                                Class46 class46 = Class324.method2570(1512932720, i_17_);
                                int i_18_ = (class348_sub42_sub15.anInt9652);
                                int i_19_ = (class348_sub42_sub15.anInt9651);
                                int i_20_ = (class348_sub42_sub15.anInt9650);
                                if (i_18_ != class46.anInt770 || (class46.anInt753 != i_19_) || (i_20_ != class46.anInt779)) {
                                    class46.anInt753 = i_19_;
                                    class46.anInt770 = i_18_;
                                    class46.anInt779 = i_20_;
                                    Class251.method1916(-9343, class46);
                                }
                            } else if (i_16_ == 5) {
                                Class46 class46 = Class324.method2570(i ^ 0x5a2da9d8, i_17_);
                                if ((class46.anInt699 != class348_sub42_sub15.anInt9652) || (class348_sub42_sub15.anInt9652 == -1)) {
                                    class46.anInt699 = class348_sub42_sub15.anInt9652;
                                    class46.anInt795 = 0;
                                    class46.anInt841 = 0;
                                    class46.anInt730 = 1;
                                    Class17 class17 = ((class46.anInt699 == -1) ? null : (Class10.aClass87_191.method835((class46.anInt699), 7)));
                                    if (class17 != null) Class264.method2017((class46.anInt795), class17, 30);
                                    Class251.method1916(-9343, class46);
                                }
                            } else if (i_16_ == 6) {
                                int i_21_ = (class348_sub42_sub15.anInt9652);
                                int i_22_ = (0x7ff9 & i_21_) >> 10;
                                int i_23_ = 0x1f & i_21_ >> 5;
                                int i_24_ = 0x1f & i_21_;
                                int i_25_ = ((i_24_ << 3) + ((i_22_ << 19) - -(i_23_ << 11)));
                                Class46 class46 = Class324.method2570(1512932720, i_17_);
                                if (class46.anInt749 != i_25_) {
                                    class46.anInt749 = i_25_;
                                    Class251.method1916(-9343, class46);
                                }
                            } else if (i_16_ == 7) {
                                Class46 class46 = Class324.method2570(1512932720, i_17_);
                                boolean bool = (class348_sub42_sub15.anInt9652 == 1);
                                if (!class46.aBoolean813 == bool) {
                                    class46.aBoolean813 = bool;
                                    Class251.method1916(-9343, class46);
                                }
                            } else if (i_16_ == 8) {
                                Class46 class46 = Class324.method2570(1512932720, i_17_);
                                if ((class46.anInt757 != class348_sub42_sub15.anInt9652) || (class46.anInt675 != class348_sub42_sub15.anInt9651) || (class46.anInt716 != class348_sub42_sub15.anInt9650)) {
                                    class46.anInt716 = class348_sub42_sub15.anInt9650;
                                    class46.anInt675 = class348_sub42_sub15.anInt9651;
                                    class46.anInt757 = class348_sub42_sub15.anInt9652;
                                    if (class46.anInt812 != -1) {
                                        if (class46.anInt796 <= 0) {
                                            if ((class46.anInt842) > 0) class46.anInt716 = (32 * class46.anInt716 / (class46.anInt842));
                                        } else class46.anInt716 = ((class46.anInt716) * 32 / (class46.anInt796));
                                    }
                                    Class251.method1916(-9343, class46);
                                }
                            } else if (i_16_ == 9) {
                                Class46 class46 = Class324.method2570(1512932720, i_17_);
                                if ((class348_sub42_sub15.anInt9652 != class46.anInt812) || (class348_sub42_sub15.anInt9651 != class46.anInt781)) {
                                    class46.anInt781 = class348_sub42_sub15.anInt9651;
                                    class46.anInt812 = class348_sub42_sub15.anInt9652;
                                    Class251.method1916(-9343, class46);
                                }
                            } else if (i_16_ == 10) {
                                Class46 class46 = Class324.method2570(1512932720, i_17_);
                                if ((class46.anInt808 != (class348_sub42_sub15.anInt9652)) || ((class46.anInt786) != (class348_sub42_sub15.anInt9651)) || ((class348_sub42_sub15.anInt9650) != class46.anInt717)) {
                                    class46.anInt786 = (class348_sub42_sub15.anInt9651);
                                    class46.anInt808 = (class348_sub42_sub15.anInt9652);
                                    class46.anInt717 = (class348_sub42_sub15.anInt9650);
                                    Class251.method1916(-9343, class46);
                                }
                            } else if (i_16_ == 11) {
                                Class46 class46 = (Class324.method2570(1512932720, i_17_));
                                class46.aByte817 = (byte) 0;
                                class46.anInt750 = class46.anInt739 = (class348_sub42_sub15.anInt9651);
                                class46.aByte681 = (byte) 0;
                                class46.anInt800 = class46.anInt788 = (class348_sub42_sub15.anInt9652);
                                Class251.method1916(-9343, class46);
                            } else if (i_16_ == 12) {
                                Class46 class46 = (Class324.method2570(1512932720, i_17_));
                                int i_26_ = (class348_sub42_sub15.anInt9652);
                                if (class46 != null && (class46.anInt774) == 0) {
                                    if ((-(class46.anInt789) + (class46.anInt791)) < i_26_) i_26_ = ((class46.anInt791) - (class46.anInt789));
                                    if (i_26_ < 0) i_26_ = 0;
                                    if (i_26_ != (class46.anInt755)) {
                                        class46.anInt755 = i_26_;
                                        Class251.method1916(-9343, class46);
                                    }
                                }
                            } else if (i_16_ == 14) {
                                Class46 class46 = (Class324.method2570(1512932720, i_17_));
                                class46.anInt756 = (class348_sub42_sub15.anInt9652);
                            } else if (i_16_ == 15) {
                                Class97.anInt1548 = (class348_sub42_sub15.anInt9651);
                                Class248.anInt3203 = (class348_sub42_sub15.anInt9652);
                                Class348_Sub13.aBoolean6759 = true;
                            } else if (i_16_ == 16) {
                                Class46 class46 = (Class324.method2570(1512932720, i_17_));
                                class46.anInt702 = (class348_sub42_sub15.anInt9652);
                            } else if (i_16_ == 17) {
                                Class46 class46 = (Class324.method2570(1512932720, i_17_));
                                class46.anInt806 = (class348_sub42_sub15.anInt9652);
                            }
                        }
                        Class348_Sub51.anInt7267++;
                        if (Class239_Sub20.anInt6048 != 0) {
                            Class348.anInt4292 += 20;
                            if (Class348.anInt4292 >= 400) Class239_Sub20.anInt6048 = 0;
                        }
                        if (Class311.aClass46_3913 != null) {
                            Class108.anInt1656++;
                            if (Class108.anInt1656 >= 15) {
                                Class251.method1916(-9343, Class311.aClass46_3913);
                                Class311.aClass46_3913 = null;
                            }
                        }
                        Class318_Sub1_Sub3_Sub4.aClass46_10336 = null;
                        Class50_Sub1.aBoolean5221 = false;
                        Class168.aClass46_2249 = null;
                        Class127_Sub1.aBoolean8386 = false;
                        Class5_Sub2.method198(null, false, -1, -1);
                        Class175.method1343(-1, null, 1, -1);
                        if (!r.aBoolean9722) Class362.anInt4458 = -1;
                        Class216.method1583((byte) -73);
                        Class311.anInt3918++;
                        if (Class237.aBoolean3103) {
                            Class98.anInt1568++;
                            Class348_Sub47 class348_sub47 = Class286_Sub3.method2148((ha_Sub2.aClass351_7715), (Class348_Sub23_Sub2.aClass77_9029), i + -11525);
                            class348_sub47.aClass348_Sub49_Sub2_7116.writeInt((byte) 117, (InputStream_Sub2.anInt85 << 14 | (Class348_Sub40_Sub26.anInt9349 << 28) | Class79.anInt1404));
                            Class348_Sub42_Sub14.method3243(30, class348_sub47);
                            Class237.aBoolean3103 = false;
                        }
                        for (; ; ) {
                            Class348_Sub36 class348_sub36 = ((Class348_Sub36) Class208.aClass262_2707.method1997(8));
                            if (class348_sub36 == null) break;
                            Class46 class46 = (class348_sub36.aClass46_6989);
                            if (class46.anInt704 >= 0) {
                                Class46 class46_27_ = Class324.method2570(1512932720, (class46.anInt834));
                                if (class46_27_ == null || (class46_27_.aClass46Array798) == null || ((class46_27_.aClass46Array798).length <= class46.anInt704) || (class46 != (class46_27_.aClass46Array798[class46.anInt704]))) continue;
                            }
                            Class66.method705(class348_sub36);
                        }
                        for (; ; ) {
                            Class348_Sub36 class348_sub36 = ((Class348_Sub36) Class365.aClass262_4473.method1997(8));
                            if (class348_sub36 == null) break;
                            Class46 class46 = (class348_sub36.aClass46_6989);
                            if (class46.anInt704 >= 0) {
                                Class46 class46_28_ = Class324.method2570(1512932720, (class46.anInt834));
                                if (class46_28_ == null || (class46_28_.aClass46Array798) == null || (class46.anInt704 >= (class46_28_.aClass46Array798).length) || ((class46_28_.aClass46Array798[class46.anInt704]) != class46)) continue;
                            }
                            Class66.method705(class348_sub36);
                        }
                        for (; ; ) {
                            Class348_Sub36 class348_sub36 = ((Class348_Sub36) Class348_Sub1_Sub2.aClass262_8810.method1997(i + -11424));
                            if (class348_sub36 == null) break;
                            Class46 class46 = (class348_sub36.aClass46_6989);
                            if (class46.anInt704 >= 0) {
                                Class46 class46_29_ = Class324.method2570(1512932720, (class46.anInt834));
                                if (class46_29_ == null || (class46_29_.aClass46Array798) == null || (class46.anInt704 >= (class46_29_.aClass46Array798).length) || ((class46_29_.aClass46Array798[class46.anInt704]) != class46)) continue;
                            }
                            Class66.method705(class348_sub36);
                        }
                        if (Class168.aClass46_2249 == null) Class348_Sub42.anInt7059 = 0;
                        if (Class289.aClass46_3701 != null) Class347.method2708(-30206);
                        if (Class192.anInt2581 > 0 && Class182.aClass346_2449.method2696(82, i ^ ~0x2cd5) && Class182.aClass346_2449.method2696(81, -121) && Class98.anInt1565 != 0) {
                            int i_30_ = ((Class132.aClass318_Sub1_Sub3_Sub3_Sub2_1907.aByte6381) - Class98.anInt1565);
                            if (i_30_ >= 0) {
                                if (i_30_ > 3) i_30_ = 3;
                            } else i_30_ = 0;
                            Class361.method3502((Class132.aClass318_Sub1_Sub3_Sub3_Sub2_1907.anIntArray10317[0]) + Class90.anInt1517, i ^ 0x2caa, i_30_, (Class132.aClass318_Sub1_Sub3_Sub3_Sub2_1907.anIntArray10320[0]) + za_Sub2.anInt9780);
                        }
                        Class261.method1987(-120);
                        int i_31_ = 0;
                        if (i == 11432) {
                            for (/**/; i_31_ < 5; i_31_++)
                                Class318_Sub1_Sub1_Sub2.anIntArray9981[i_31_]++;
                            if (Class184.aBoolean2469 && (-60000L + Class62.method599(-84) > Class34.aLong482)) Class318_Sub1_Sub2.method2405(i + -11313);
                            for (Class318_Sub9_Sub1 class318_sub9_sub1 = ((Class318_Sub9_Sub1) Class348_Sub42_Sub14.aClass243_9642.method1872(i + -11424)); class318_sub9_sub1 != null; class318_sub9_sub1 = ((Class318_Sub9_Sub1) Class348_Sub42_Sub14.aClass243_9642.method1878((byte) -105))) {
                                if ((Class62.method599(i ^ ~0x2ce9) / 1000L + -5L) > (long) class318_sub9_sub1.anInt8787) {
                                    if (class318_sub9_sub1.aShort8786 > 0) Class286_Sub2.method2144("", 5, (byte) -128, 0, (class318_sub9_sub1.aString8783 + (Class274.aClass274_3502.method2063(Class348_Sub33.anInt6967, 544))), "", "");
                                    if (class318_sub9_sub1.aShort8786 == 0) Class286_Sub2.method2144("", 5, (byte) -105, 0, (class318_sub9_sub1.aString8783 + (Class274.aClass274_3503.method2063(Class348_Sub33.anInt6967, 544))), "", "");
                                    class318_sub9_sub1.method2373(false);
                                }
                            }
                            Class28.anInt4999++;
                            if (Class28.anInt4999 > 500) {
                                Class28.anInt4999 = 0;
                                int i_32_ = (int) (8.0 * Math.random());
                                if ((0x4 & i_32_) == 4) Class195.anInt5016 += Class303.anInt3844;
                                if ((i_32_ & 0x1) == 1) Class20.anInt319 += Class318_Sub1_Sub5.anInt8775;
                                if ((0x2 & i_32_) == 2) Class260.anInt3310 += Class344.anInt4263;
                            }
                            if (Class20.anInt319 < -50) Class318_Sub1_Sub5.anInt8775 = 2;
                            if (Class20.anInt319 > 50) Class318_Sub1_Sub5.anInt8775 = -2;
                            if (Class260.anInt3310 < -55) Class344.anInt4263 = 2;
                            if (Class195.anInt5016 < -40) Class303.anInt3844 = 1;
                            if (Class260.anInt3310 > 55) Class344.anInt4263 = -2;
                            Class285.anInt4753++;
                            if (Class195.anInt5016 > 40) Class303.anInt3844 = -1;
                            if (Class285.anInt4753 > 500) {
                                Class285.anInt4753 = 0;
                                int i_33_ = (int) (Math.random() * 8.0);
                                if ((i_33_ & 0x2) == 2) Class348_Sub49_Sub1.anInt9750 += Class348_Sub42_Sub14.anInt9645;
                                if ((i_33_ & 0x1) == 1) r_Sub2.anInt10483 += Class348_Sub42_Sub9_Sub1.anInt10443;
                            }
                            if (r_Sub2.anInt10483 < -60) Class348_Sub42_Sub9_Sub1.anInt10443 = 2;
                            if (Class348_Sub49_Sub1.anInt9750 < -20) Class348_Sub42_Sub14.anInt9645 = 1;
                            if (r_Sub2.anInt10483 > 60) Class348_Sub42_Sub9_Sub1.anInt10443 = -2;
                            if (Class348_Sub49_Sub1.anInt9750 > 10) Class348_Sub42_Sub14.anInt9645 = -1;
                            Class11.anInt193++;
                            if (Class11.anInt193 > 50) {
                                IOException_Sub1.anInt88++;
                                Class348_Sub47 class348_sub47 = (Class286_Sub3.method2148(Class239_Sub10.aClass351_5938, Class348_Sub23_Sub2.aClass77_9029, -125));
                                Class348_Sub42_Sub14.method3243(i ^ ~0x2cc0, class348_sub47);
                            }
                            if (Class239_Sub29.aBoolean6147) {
                                Class313.method2334(0);
                                Class239_Sub29.aBoolean6147 = false;
                            }
                            try {
                                Class239_Sub18.method1802(0);
                            } catch (java.io.IOException ioexception) {
                                Class272.method2049(93);
                            }
                        }
                    }
                }
            }
        }
    }

    static final byte[] method2992(String string, byte i) {
        try {
            anInt6873++;
            int i_34_ = string.length();
            byte[] is = new byte[i_34_];
            if (i != -20) method2991(-54);
            for (int i_35_ = 0; i_35_ < i_34_; i_35_++) {
                int i_36_ = string.charAt(i_35_);
                if (i_36_ > 0 && i_36_ < 128 || i_36_ >= 160 && i_36_ <= 255) is[i_35_] = (byte) i_36_;
                else if (i_36_ != 8364) {
                    if (i_36_ != 8218) {
                        if (i_36_ != 402) {
                            if (i_36_ == 8222) is[i_35_] = (byte) -124;
                            else if (i_36_ == 8230) is[i_35_] = (byte) -123;
                            else if (i_36_ != 8224) {
                                if (i_36_ != 8225) {
                                    if (i_36_ == 710) is[i_35_] = (byte) -120;
                                    else if (i_36_ == 8240) is[i_35_] = (byte) -119;
                                    else if (i_36_ == 352) is[i_35_] = (byte) -118;
                                    else if (i_36_ != 8249) {
                                        if (i_36_ != 338) {
                                            if (i_36_ != 381) {
                                                if (i_36_ == 8216) is[i_35_] = (byte) -111;
                                                else if (i_36_ == 8217) is[i_35_] = (byte) -110;
                                                else if (i_36_ != 8220) {
                                                    if (i_36_ != 8221) {
                                                        if (i_36_ == 8226) is[i_35_] = (byte) -107;
                                                        else if (i_36_ == 8211) is[i_35_] = (byte) -106;
                                                        else if (i_36_ != 8212) {
                                                            if (i_36_ != 732) {
                                                                if (i_36_ != 8482) {
                                                                    if (i_36_ == 353) is[i_35_] = (byte) -102;
                                                                    else if (i_36_ == 8250) is[i_35_] = (byte) -101;
                                                                    else if (i_36_ != 339) {
                                                                        if (i_36_ == 382) is[i_35_] = (byte) -98;
                                                                        else if (i_36_ != 376) is[i_35_] = (byte) 63;
                                                                        else is[i_35_] = (byte) -97;
                                                                    } else is[i_35_] = (byte) -100;
                                                                } else is[i_35_] = (byte) -103;
                                                            } else is[i_35_] = (byte) -104;
                                                        } else is[i_35_] = (byte) -105;
                                                    } else is[i_35_] = (byte) -108;
                                                } else is[i_35_] = (byte) -109;
                                            } else is[i_35_] = (byte) -114;
                                        } else is[i_35_] = (byte) -116;
                                    } else is[i_35_] = (byte) -117;
                                } else is[i_35_] = (byte) -121;
                            } else is[i_35_] = (byte) -122;
                        } else is[i_35_] = (byte) -125;
                    } else is[i_35_] = (byte) -126;
                } else is[i_35_] = (byte) -128;
            }
            return is;
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("ls.B(" + (string != null ? "{...}" : "null") + ',' + i + ')'));
        }
    }

    public static void method2993(byte i) {
        anIntArray6878 = null;
        aString6876 = null;
        aString6877 = null;
        int i_37_ = 31 % ((3 - i) / 37);
    }

    static final void method2994(int i) {
        anInt6871++;
        if (i == 2) Class199.aClass352Array2636 = null;
    }

    Class348_Sub24(int i, int i_38_) {
        this.anInt6872 = i;
        this.anInt6875 = i_38_;
    }

    static {
        String string = "Unknown";
        try {
            string = System.getProperty("java.vendor").toLowerCase();
        } catch (Exception exception) {
            /* empty */
        }
        string.toLowerCase();
        string = "Unknown";
        try {
            string = System.getProperty("java.version").toLowerCase();
        } catch (Exception exception) {
            /* empty */
        }
        string.toLowerCase();
        string = "Unknown";
        try {
            string = System.getProperty("os.name").toLowerCase();
        } catch (Exception exception) {
            /* empty */
        }
        aString6877 = string.toLowerCase();
        string = "Unknown";
        try {
            string = System.getProperty("os.arch").toLowerCase();
        } catch (Exception exception) {
            /* empty */
        }
        aString6876 = string.toLowerCase();
        string = "Unknown";
        try {
            string = System.getProperty("os.version").toLowerCase();
        } catch (Exception exception) {
            /* empty */
        }
        string.toLowerCase();
        string = "~/";
        try {
            string = System.getProperty("user.home").toLowerCase();
        } catch (Exception exception) {
            /* empty */
        }
        new File(string);
    }
}
