/* Class348_Sub14 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class348_Sub14 extends Class348 {
    static int anInt6760;
    static int anInt6761;
    long aLong6762;
    static int anInt6763;
    static Class351 aClass351_6764 = new Class351(32, 4);
    static int anInt6765;
    static Class351 aClass351_6766 = new Class351(75, 3);
    /*synthetic*/ static Class aClass6767;

    static final boolean method2804(byte i) {
        anInt6765++;
        try {
            Class152 class152 = new Class152();
            byte[] is = class152.method1214(9, Class348_Sub42_Sub14.aByteArray9622);
            int i_0_ = 19 % ((19 - i) / 43);
            Class258_Sub3.method1969(is, -5901);
            return true;
        } catch (Exception exception) {
            return false;
        }
    }

    public Class348_Sub14() {
        /* empty */
    }

    public static void method2805(byte i) {
        aClass351_6766 = null;
        int i_1_ = -14 % ((i - 72) / 32);
        aClass351_6764 = null;
    }

    static final int method2806(boolean bool, int i) {
        anInt6760++;
        if (bool != false) method2807(-36, 35, (byte) -71, -71);
        return 0x3ff & i;
    }

    Class348_Sub14(long l) {
        try {
            this.aLong6762 = l;
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, "ij.<init>(" + l + ')');
        }
    }

    static final Class348_Sub47 method2807(int i, int i_2_, byte i_3_, int i_4_) {
        anInt6761++;
        Class348_Sub47 class348_sub47 = null;
        if (i_4_ == 0) {
            class348_sub47 = Class286_Sub3.method2148(Class186.aClass351_2495, Class348_Sub23_Sub2.aClass77_9029, -100);
            Class348_Sub46.anInt7112++;
        }
        if (i_4_ == 1) {
            class348_sub47 = Class286_Sub3.method2148(Class301.aClass351_3825, Class348_Sub23_Sub2.aClass77_9029, -93);
            Class177.anInt4665++;
        }
        class348_sub47.aClass348_Sub49_Sub2_7116.method3353(i + Class90.anInt1517, (byte) 3);
        class348_sub47.aClass348_Sub49_Sub2_7116.method3395((byte) 78, !Class182.aClass346_2449.method2696(82, -124) ? 0 : 1);
        class348_sub47.aClass348_Sub49_Sub2_7116.method3335(-124, za_Sub2.anInt9780 + i_2_);
        Class248.anInt3203 = i_2_;
        if (i_3_ >= -88) aClass351_6764 = null;
        Class97.anInt1548 = i;
        Class348_Sub13.aBoolean6759 = false;
        Class299_Sub1_Sub2.method2264(false);
        return class348_sub47;
    }

    static final boolean method2808(int i, ha var_ha, boolean bool) {
        try {
            anInt6763++;
            int i_5_ = (-104 + Class367_Sub4.anInt7319) / 2;
            int i_6_ = (Class348_Sub40_Sub3.anInt9109 - 104) / 2;
            boolean bool_7_ = bool;
            for (int i_8_ = i_5_; i_8_ < 104 + i_5_; i_8_++) {
                for (int i_9_ = i_6_; i_6_ + 104 > i_9_; i_9_++) {
                    for (int i_10_ = i; i_10_ <= 3; i_10_++) {
                        if (Class58.method536(i_9_, false, i_8_, i, i_10_)) {
                            int i_11_ = i_10_;
                            if (Class79.method802(i_9_, i_8_, true)) i_11_--;
                            if (i_11_ >= 0) bool_7_ &= Class14_Sub2.method245(i_11_, i_8_, i_9_, (byte) 75);
                        }
                    }
                }
            }
            if (!bool_7_) return false;
            int[] is = new int[262144];
            for (int i_12_ = 0; is.length > i_12_; i_12_++)
                is[i_12_] = -16777216;
            Class108.aClass105_1664 = var_ha.method3662(512, is, (byte) 94, 0, 512, 512);
            Class358.method3489(-3);
            int i_13_ = (((-10 + (238 + (int) (20.0 * Math.random())) << 8) + (-10 + (int) (Math.random() * 20.0) + 238 << 16) - (-(int) (Math.random() * 20.0) + -228)) | ~0xffffff);
            int i_14_ = (228 - -(int) (20.0 * Math.random()) << 16 | ~0xffffff);
            int i_15_ = ((int) (8.0 * Math.random()) | ((int) (8.0 * Math.random()) << 16 | (int) (8.0 * Math.random()) << 8));
            boolean[][] bools = (new boolean[3 + RuntimeException_Sub1.anInt4600]
                    [RuntimeException_Sub1.anInt4600 - -1 + 2]);
            for (int i_16_ = i_5_; i_16_ < i_5_ - -104; i_16_ += RuntimeException_Sub1.anInt4600) {
                for (int i_17_ = i_6_; i_17_ < i_6_ - -104; i_17_ += RuntimeException_Sub1.anInt4600) {
                    int i_18_ = 0;
                    int i_19_ = 0;
                    int i_20_ = i_16_;
                    if (i_20_ > 0) {
                        i_20_--;
                        i_18_ += 4;
                    }
                    int i_21_ = i_17_;
                    if (i_21_ > 0) i_21_--;
                    int i_22_ = RuntimeException_Sub1.anInt4600 + i_16_;
                    if (i_22_ < 104) i_22_++;
                    int i_23_ = i_17_ - -RuntimeException_Sub1.anInt4600;
                    if (i_23_ < 104) {
                        i_23_++;
                        i_19_ += 4;
                    }
                    var_ha.KA(0, 0, RuntimeException_Sub1.anInt4600 * 4 + i_18_, RuntimeException_Sub1.anInt4600 * 4 + i_19_);
                    var_ha.GA(-16777216);
                    for (int i_24_ = i; i_24_ <= 3; i_24_++) {
                        for (int i_25_ = 0; i_25_ <= RuntimeException_Sub1.anInt4600; i_25_++) {
                            for (int i_26_ = 0; (i_26_ <= RuntimeException_Sub1.anInt4600); i_26_++)
                                bools[i_25_][i_26_] = Class58.method536(i_21_ + i_26_, false, i_20_ + i_25_, i, i_24_);
                        }
                        Class348_Sub1_Sub1.aSArray8801[i_24_].method3987(0, 0, 1024, i_20_, i_21_, i_22_, i_23_, bools);
                        if (!Class375.aBoolean4542) {
                            for (int i_27_ = -4; i_27_ < RuntimeException_Sub1.anInt4600; i_27_++) {
                                for (int i_28_ = -4; i_28_ < RuntimeException_Sub1.anInt4600; i_28_++) {
                                    int i_29_ = i_16_ + i_27_;
                                    int i_30_ = i_28_ + i_17_;
                                    if (i_5_ <= i_29_ && i_6_ <= i_30_ && Class58.method536(i_30_, false, i_29_, i, i_24_)) {
                                        int i_31_ = i_24_;
                                        if (Class79.method802(i_30_, i_29_, true)) i_31_--;
                                        if (i_31_ >= 0) Class348_Sub41.method3159(i_14_, ((-i_28_ + (RuntimeException_Sub1.anInt4600)) * 4 + i_19_ + -4), false, i_31_, i_30_, i_29_, var_ha, 4 * i_27_ + i_18_, i_13_);
                                    }
                                }
                            }
                        }
                    }
                    if (Class375.aBoolean4542) {
                        Class361 class361 = Class348_Sub45.aClass361Array7108[i];
                        for (int i_32_ = 0; i_32_ < RuntimeException_Sub1.anInt4600; i_32_++) {
                            for (int i_33_ = 0; (RuntimeException_Sub1.anInt4600 > i_33_); i_33_++) {
                                int i_34_ = i_16_ + i_32_;
                                int i_35_ = i_33_ + i_17_;
                                int i_36_ = (class361.anIntArrayArray4438[(-class361.anInt4453 + i_34_)][(-class361.anInt4441 + i_35_)]);
                                if ((0x40240000 & i_36_) != 0) var_ha.method3675(4, (byte) -125, i_32_ * 4 + i_18_, -4 + (RuntimeException_Sub1.anInt4600 + -i_33_) * 4 + i_19_, 4, -1713569622);
                                else if ((0x800000 & i_36_) == 0) {
                                    if ((i_36_ & 0x2000000) != 0) var_ha.method3660(3 + (i_18_ - -(i_32_ * 4)), -1713569622, 4, (-4 + (4 * (-i_33_ + (RuntimeException_Sub1.anInt4600)) + i_19_)), true);
                                    else if ((i_36_ & 0x8000000) != 0) var_ha.method3649((byte) -126, 4, 3 + (i_19_ + ((RuntimeException_Sub1.anInt4600) - i_33_) * 4) + -4, -1713569622, i_18_ + 4 * i_32_);
                                    else if ((0x20000000 & i_36_) != 0) var_ha.method3660(i_18_ + 4 * i_32_, -1713569622, 4, (4 * (-i_33_ + (RuntimeException_Sub1.anInt4600)) + (i_19_ - 4)), bool);
                                } else var_ha.method3649((byte) -113, 4, (-4 + i_19_ + 4 * (-i_33_ + (RuntimeException_Sub1.anInt4600))), -1713569622, i_32_ * 4 + i_18_);
                            }
                        }
                    }
                    var_ha.aa(i_18_, i_19_, 4 * RuntimeException_Sub1.anInt4600, RuntimeException_Sub1.anInt4600 * 4, i_15_, 2);
                    Class108.aClass105_1664.method979((-i_5_ + i_16_) * 4 + 48, (-(4 * (i_17_ - i_6_)) + 464 + -(RuntimeException_Sub1.anInt4600 * 4)), RuntimeException_Sub1.anInt4600 * 4, 4 * RuntimeException_Sub1.anInt4600, i_18_, i_19_);
                }
            }
            var_ha.la();
            var_ha.GA(-16777215);
            Class354.method3466(-86);
            Class348_Sub40_Sub38.anInt9479 = 0;
            Class318_Sub1_Sub5_Sub1.aClass262_10125.method1996(116);
            if (!Class375.aBoolean4542) {
                for (int i_37_ = i_5_; 104 + i_5_ > i_37_; i_37_++) {
                    for (int i_38_ = i_6_; 104 + i_6_ > i_38_; i_38_++) {
                        for (int i_39_ = i; i_39_ <= 1 + i && i_39_ <= 3; i_39_++) {
                            if (Class58.method536(i_38_, !bool, i_37_, i, i_39_)) {
                                Interface10 interface10 = ((Interface10) Class348_Sub16_Sub3.method2878(i_39_, i_37_, i_38_));
                                if (interface10 == null) interface10 = ((Interface10) (Class177.method1353(i_39_, i_37_, i_38_, (aClass6767 != null ? aClass6767 : (aClass6767 = Interface10.class)))));
                                if (interface10 == null) interface10 = ((Interface10) r_Sub2.method3297(i_39_, i_37_, i_38_));
                                if (interface10 == null) interface10 = ((Interface10) (Class348_Sub40_Sub32.method3135(i_39_, i_37_, i_38_)));
                                if (interface10 != null) {
                                    Class51 class51 = (Class348_Sub40_Sub12.aClass263_9195.method2005(0, interface10.method42(-99)));
                                    if (!class51.aBoolean942 || Class130.aBoolean1900) {
                                        int i_40_ = class51.anInt921;
                                        if (class51.anIntArray945 != null) {
                                            for (int i_41_ = 0; ((class51.anIntArray945).length > i_41_); i_41_++) {
                                                if ((class51.anIntArray945[i_41_]) != -1) {
                                                    Class51 class51_42_ = (Class348_Sub40_Sub12.aClass263_9195.method2005(0, (class51.anIntArray945[i_41_])));
                                                    if (class51_42_.anInt921 >= 0) i_40_ = (class51_42_.anInt921);
                                                }
                                            }
                                        }
                                        if (i_40_ >= 0) {
                                            boolean bool_43_ = false;
                                            if (i_40_ >= 0) {
                                                Class42 class42 = (Class348_Sub23_Sub2.aClass153_9031.method1225(i_40_, (byte) 126));
                                                if (class42 != null && (class42.aBoolean599)) bool_43_ = true;
                                            }
                                            int i_44_ = i_37_;
                                            int i_45_ = i_38_;
                                            if (bool_43_) {
                                                int[][] is_46_ = (Class348_Sub45.aClass361Array7108[i_39_].anIntArrayArray4438);
                                                int i_47_ = (Class348_Sub45.aClass361Array7108[i_39_].anInt4453);
                                                int i_48_ = (Class348_Sub45.aClass361Array7108[i_39_].anInt4441);
                                                for (int i_49_ = 0; i_49_ < 10; i_49_++) {
                                                    int i_50_ = (int) (Math.random() * 4.0);
                                                    if ((i_50_ == 0) && (i_44_ > i_5_) && i_37_ + -3 < i_44_ && ((0x2c0108 & (is_46_[(-i_47_ + (i_44_ - 1))][(-i_48_ + i_45_)])) == 0)) i_44_--;
                                                    if (i_50_ == 1 && (i_44_ < 104 + (i_5_ - 1)) && 3 + i_37_ > i_44_ && ((is_46_[(-i_47_ + 1 + i_44_)][i_45_ + -i_48_]) & 0x2c0180) == 0) i_44_++;
                                                    if ((i_50_ == 2) && (i_6_ < i_45_) && i_45_ > -3 + i_38_ && ((0x2c0102 & (is_46_[(-i_47_ + i_44_)][(i_45_ - 1 - i_48_)])) == 0)) i_45_--;
                                                    if (i_50_ == 3 && (104 + i_6_ - 1 > i_45_) && 3 + i_38_ > i_45_ && ((0x2c0120 & (is_46_[i_44_ - i_47_][(-i_48_ + 1 + i_45_)])) == 0)) i_45_++;
                                                }
                                            }
                                            Class263.anIntArray3347[(Class348_Sub40_Sub38.anInt9479)] = class51.anInt941;
                                            Class348_Sub15.anIntArray6770[(Class348_Sub40_Sub38.anInt9479)] = i_44_;
                                            Class348_Sub40_Sub37.anIntArray9458[(Class348_Sub40_Sub38.anInt9479)] = i_45_;
                                            Class348_Sub40_Sub38.anInt9479++;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (r_Sub2.aClass252_10488 != null) {
                    Class95.aClass45_1541.anInt634 = 1;
                    Class348_Sub23_Sub2.aClass153_9031.method1220((byte) 116, 64, 1024);
                    for (int i_51_ = 0; i_51_ < r_Sub2.aClass252_10488.anInt3241; i_51_++) {
                        int i_52_ = (r_Sub2.aClass252_10488.anIntArray3238[i_51_]);
                        if ((Class132.aClass318_Sub1_Sub3_Sub3_Sub2_1907.aByte6381) == i_52_ >> 28) {
                            int i_53_ = ((i_52_ >> 14 & 0x3fff) - za_Sub2.anInt9780);
                            int i_54_ = (i_52_ & 0x3fff) + -Class90.anInt1517;
                            if (i_53_ >= 0 && i_53_ < Class367_Sub4.anInt7319 && i_54_ >= 0 && (Class348_Sub40_Sub3.anInt9109 > i_54_)) Class318_Sub1_Sub5_Sub1.aClass262_10125.method1999(new Class348_Sub35(i_51_), -20180);
                            else {
                                Class42 class42 = (Class348_Sub23_Sub2.aClass153_9031.method1225((r_Sub2.aClass252_10488.anIntArray3239[i_51_]), (byte) 120));
                                if (class42.anIntArray591 != null && (i_53_ + class42.anInt595 >= 0) && (Class367_Sub4.anInt7319 > class42.anInt603 + i_53_) && i_54_ + class42.anInt570 >= 0 && (Class348_Sub40_Sub3.anInt9109 > (i_54_ - -class42.anInt607)))
                                    Class318_Sub1_Sub5_Sub1.aClass262_10125.method1999(new Class348_Sub35(i_51_), -20180);
                            }
                        }
                    }
                    Class348_Sub23_Sub2.aClass153_9031.method1220((byte) 13, 64, 128);
                    Class95.aClass45_1541.anInt634 = 2;
                    Class95.aClass45_1541.method412((byte) -126);
                }
            }
            return true;
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("ij.E(" + i + ',' + (var_ha != null ? "{...}" : "null") + ',' + bool + ')'));
        }
    }
}
