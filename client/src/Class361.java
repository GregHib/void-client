/* Class361 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class361 {
    static int anInt4431;
    static int anInt4432;
    static Class114 aClass114_4433 = new Class114(22, 0);
    static int anInt4434;
    static int anInt4435;
    static int anInt4436;
    int anInt4437;
    int[][] anIntArrayArray4438;
    static int anInt4439;
    static int anInt4440;
    int anInt4441;
    static int anInt4442;
    int anInt4443;
    static int anInt4444;
    static int anInt4445;
    static int anInt4446;
    static int anInt4447;
    static int anInt4448;
    static int anInt4449;
    static int anInt4450;
    static int anInt4451;
    static int anInt4452;
    int anInt4453;
    static int anInt4454;
    static float aFloat4455;

    private final void method3493(int i, int i_0_, int i_1_, int i_2_) {
        this.anIntArrayArray4438[i_1_][i_2_] = Class139.method1166((this.anIntArrayArray4438[i_1_][i_2_]), ~i);
        if (i_0_ > -120) method3509(-18, true, false, 122, 119, -54, 18, -57);
        anInt4452++;
    }

    private final void method3494(int i, int i_3_, int i_4_, int i_5_) {
        this.anIntArrayArray4438[i][i_4_] = Class273.method2057((this.anIntArrayArray4438[i][i_4_]), i_3_);
        if (i_5_ != -6496) method3494(20, -107, -63, 115);
        anInt4448++;
    }

    final boolean method3495(int i, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_) {
        anInt4440++;
        int i_13_ = 64 % ((-11 - i_12_) / 37);
        if (i_7_ == 1) {
            if (i_9_ == i && i_10_ == i_6_) return true;
        } else if (i >= i_9_ && -1 + i_9_ + i_7_ >= i && i_10_ >= i_10_ && i_10_ <= -1 + (i_7_ + i_10_)) return true;
        i_10_ -= this.anInt4441;
        i_6_ -= this.anInt4441;
        i -= this.anInt4453;
        i_9_ -= this.anInt4453;
        if (i_7_ == 1) {
            if (i_11_ == 0) {
                if (i_8_ == 0) {
                    if (i_9_ == -1 + i && i_6_ == i_10_) return true;
                    if (i == i_9_ && i_10_ - -1 == i_6_ && (0x2c0120 & (this.anIntArrayArray4438[i_9_][i_6_])) == 0) return true;
                    if (i == i_9_ && i_6_ == -1 + i_10_ && (0x2c0102 & (this.anIntArrayArray4438[i_9_][i_6_])) == 0) return true;
                } else if (i_8_ == 1) {
                    if (i_9_ == i && i_10_ - -1 == i_6_) return true;
                    if (i + -1 == i_9_ && i_10_ == i_6_ && ((this.anIntArrayArray4438[i_9_][i_6_]) & 0x2c0108) == 0) return true;
                    if (i + 1 == i_9_ && i_10_ == i_6_ && (0x2c0180 & (this.anIntArrayArray4438[i_9_][i_6_])) == 0) return true;
                } else if (i_8_ == 2) {
                    if (i + 1 == i_9_ && i_10_ == i_6_) return true;
                    if (i_9_ == i && 1 + i_10_ == i_6_ && ((this.anIntArrayArray4438[i_9_][i_6_]) & 0x2c0120) == 0) return true;
                    if (i_9_ == i && i_10_ + -1 == i_6_ && (0x2c0102 & (this.anIntArrayArray4438[i_9_][i_6_])) == 0) return true;
                } else if (i_8_ == 3) {
                    if (i_9_ == i && -1 + i_10_ == i_6_) return true;
                    if (i + -1 == i_9_ && i_10_ == i_6_ && ((this.anIntArrayArray4438[i_9_][i_6_]) & 0x2c0108) == 0) return true;
                    if (i_9_ == 1 + i && i_10_ == i_6_ && ((this.anIntArrayArray4438[i_9_][i_6_]) & 0x2c0180) == 0) return true;
                }
            }
            if (i_11_ == 2) {
                if (i_8_ == 0) {
                    if (-1 + i == i_9_ && i_6_ == i_10_) return true;
                    if (i == i_9_ && i_6_ == i_10_ - -1) return true;
                    if (i + 1 == i_9_ && i_10_ == i_6_ && (0x2c0180 & (this.anIntArrayArray4438[i_9_][i_6_])) == 0) return true;
                    if (i == i_9_ && i_6_ == i_10_ - 1 && (0x2c0102 & (this.anIntArrayArray4438[i_9_][i_6_])) == 0) return true;
                } else if (i_8_ == 1) {
                    if (i_9_ == -1 + i && i_10_ == i_6_ && (0x2c0108 & (this.anIntArrayArray4438[i_9_][i_6_])) == 0) return true;
                    if (i == i_9_ && i_10_ + 1 == i_6_) return true;
                    if (i_9_ == i - -1 && i_10_ == i_6_) return true;
                    if (i == i_9_ && i_10_ - 1 == i_6_ && ((this.anIntArrayArray4438[i_9_][i_6_]) & 0x2c0102) == 0) return true;
                } else if (i_8_ == 2) {
                    if (i - 1 == i_9_ && i_10_ == i_6_ && (0x2c0108 & (this.anIntArrayArray4438[i_9_][i_6_])) == 0) return true;
                    if (i_9_ == i && i_10_ + 1 == i_6_ && (0x2c0120 & (this.anIntArrayArray4438[i_9_][i_6_])) == 0) return true;
                    if (i_9_ == i + 1 && i_10_ == i_6_) return true;
                    if (i_9_ == i && -1 + i_10_ == i_6_) return true;
                } else if (i_8_ == 3) {
                    if (i + -1 == i_9_ && i_6_ == i_10_) return true;
                    if (i_9_ == i && 1 + i_10_ == i_6_ && (0x2c0120 & (this.anIntArrayArray4438[i_9_][i_6_])) == 0) return true;
                    if (1 + i == i_9_ && i_6_ == i_10_ && ((this.anIntArrayArray4438[i_9_][i_6_]) & 0x2c0180) == 0) return true;
                    if (i == i_9_ && (i_6_ == i_10_ + -1)) return true;
                }
            }
            if (i_11_ == 9) {
                if (i_9_ == i && i_6_ == 1 + i_10_ && ((0x20 & this.anIntArrayArray4438[i_9_][i_6_]) == 0)) return true;
                if (i == i_9_ && -1 + i_10_ == i_6_ && ((0x2 & this.anIntArrayArray4438[i_9_][i_6_]) == 0)) return true;
                if (-1 + i == i_9_ && i_6_ == i_10_ && ((0x8 & this.anIntArrayArray4438[i_9_][i_6_]) == 0)) return true;
                return i_9_ == 1 + i && i_10_ == i_6_ && (this.anIntArrayArray4438[i_9_][i_6_] & 0x80) == 0;
            }
        } else {
            int i_14_ = -1 + (i_7_ + i_9_);
            int i_15_ = -1 + i_7_ + i_6_;
            if (i_11_ == 0) {
                if (i_8_ == 0) {
                    if (-i_7_ + i == i_9_ && i_6_ <= i_10_ && i_10_ <= i_15_) return true;
                    if (i_9_ <= i && i <= i_14_ && i_10_ + 1 == i_6_ && (this.anIntArrayArray4438[i][i_6_] & 0x2c0120) == 0) return true;
                    if (i_9_ <= i && i_14_ >= i && i_6_ == -i_7_ + i_10_ && (this.anIntArrayArray4438[i][i_15_] & 0x2c0102) == 0) return true;
                } else if (i_8_ == 1) {
                    if (i >= i_9_ && i <= i_14_ && i_10_ - -1 == i_6_) return true;
                    if (i + -i_7_ == i_9_ && i_6_ <= i_10_ && i_15_ >= i_10_ && (0x2c0108 & (this.anIntArrayArray4438[i_14_][i_10_])) == 0) return true;
                    if (1 + i == i_9_ && i_6_ <= i_10_ && i_15_ >= i_10_ && (0x2c0180 & (this.anIntArrayArray4438[i_9_][i_10_])) == 0) return true;
                } else if (i_8_ == 2) {
                    if (i_9_ == 1 + i && i_6_ <= i_10_ && i_15_ >= i_10_) return true;
                    if (i >= i_9_ && i <= i_14_ && i_10_ - -1 == i_6_ && (this.anIntArrayArray4438[i][i_6_] & 0x2c0120) == 0) return true;
                    if (i >= i_9_ && i_14_ >= i && -i_7_ + i_10_ == i_6_ && ((this.anIntArrayArray4438[i][i_15_]) & 0x2c0102) == 0) return true;
                } else if (i_8_ == 3) {
                    if (i_9_ <= i && i_14_ >= i && i_10_ + -i_7_ == i_6_) return true;
                    if (i - i_7_ == i_9_ && i_10_ >= i_6_ && i_10_ <= i_15_ && ((this.anIntArrayArray4438[i_14_][i_10_]) & 0x2c0108) == 0) return true;
                    if (i_9_ == 1 + i && i_6_ <= i_10_ && i_10_ <= i_15_ && (0x2c0180 & (this.anIntArrayArray4438[i_9_][i_10_])) == 0) return true;
                }
            }
            if (i_11_ == 2) {
                if (i_8_ == 0) {
                    if (i - i_7_ == i_9_ && i_6_ <= i_10_ && i_10_ <= i_15_) return true;
                    if (i_9_ <= i && i <= i_14_ && i_6_ == 1 + i_10_) return true;
                    if (i_9_ == i + 1 && i_10_ >= i_6_ && i_10_ <= i_15_ && (0x2c0180 & (this.anIntArrayArray4438[i_9_][i_10_])) == 0) return true;
                    if (i >= i_9_ && i <= i_14_ && -i_7_ + i_10_ == i_6_ && (this.anIntArrayArray4438[i][i_15_] & 0x2c0102) == 0) return true;
                } else if (i_8_ == 1) {
                    if (i_9_ == -i_7_ + i && i_6_ <= i_10_ && i_15_ >= i_10_ && (0x2c0108 & (this.anIntArrayArray4438[i_14_][i_10_])) == 0) return true;
                    if (i >= i_9_ && i <= i_14_ && i_6_ == i_10_ + 1) return true;
                    if (1 + i == i_9_ && i_10_ >= i_6_ && i_10_ <= i_15_) return true;
                    if (i_9_ <= i && i <= i_14_ && -i_7_ + i_10_ == i_6_ && (this.anIntArrayArray4438[i][i_15_] & 0x2c0102) == 0) return true;
                } else if (i_8_ == 2) {
                    if (i_9_ == i - i_7_ && i_6_ <= i_10_ && i_10_ <= i_15_ && (0x2c0108 & (this.anIntArrayArray4438[i_14_][i_10_])) == 0) return true;
                    if (i >= i_9_ && i_14_ >= i && 1 + i_10_ == i_6_ && (this.anIntArrayArray4438[i][i_6_] & 0x2c0120) == 0) return true;
                    if (i - -1 == i_9_ && i_6_ <= i_10_ && i_15_ >= i_10_) return true;
                    if (i >= i_9_ && i <= i_14_ && -i_7_ + i_10_ == i_6_) return true;
                } else if (i_8_ == 3) {
                    if (i_9_ == i + -i_7_ && i_6_ <= i_10_ && i_10_ <= i_15_) return true;
                    if (i >= i_9_ && i_14_ >= i && i_6_ == i_10_ + 1 && (this.anIntArrayArray4438[i][i_6_] & 0x2c0120) == 0) return true;
                    if (i_9_ == i + 1 && i_10_ >= i_6_ && i_10_ <= i_15_ && ((this.anIntArrayArray4438[i_9_][i_10_]) & 0x2c0180) == 0) return true;
                    if (i >= i_9_ && i <= i_14_ && i_6_ == i_10_ + -i_7_) return true;
                }
            }
            if (i_11_ == 9) {
                if (i >= i_9_ && i <= i_14_ && i_10_ - -1 == i_6_ && (this.anIntArrayArray4438[i][i_6_] & 0x2c0120) == 0) return true;
                if (i_9_ <= i && i_14_ >= i && i_10_ + -i_7_ == i_6_ && (this.anIntArrayArray4438[i][i_15_] & 0x2c0102) == 0) return true;
                if (-i_7_ + i == i_9_ && i_10_ >= i_6_ && i_10_ <= i_15_ && (0x2c0108 & this.anIntArrayArray4438[i_14_][i_10_]) == 0) return true;
                return i_9_ == i - -1 && i_10_ >= i_6_ && i_10_ <= i_15_ && ((0x2c0180 & this.anIntArrayArray4438[i_9_][i_10_]) == 0);
            }
        }
        return false;
    }

    final void method3496(int i, int i_16_, int i_17_) {
        i -= this.anInt4441;
        if (i_17_ != 1) method3510(113, 9, 32, -49, -123, false, false);
        anInt4444++;
        i_16_ -= this.anInt4453;
        this.anIntArrayArray4438[i_16_][i] = Class273.method2057((this.anIntArrayArray4438[i_16_][i]), 262144);
    }

    final boolean method3497(int i, int i_18_, int i_19_, int i_20_, int i_21_, int i_22_, int i_23_, int i_24_, int i_25_, int i_26_) {
        if (i != -28388) method3504(-75, -117, 49, -113, 42, -115, 105, -59);
        anInt4449++;
        int i_27_ = i_22_ - -i_20_;
        int i_28_ = i_23_ + i_24_;
        int i_29_ = i_18_ - -i_26_;
        int i_30_ = i_25_ - -i_21_;
        if (i_29_ == i_22_ && (i_19_ & 0x2) == 0) {
            int i_31_ = Math.max(i_25_, i_24_);
            for (int i_32_ = (Math.min(i_28_, i_30_)); i_32_ > i_31_; i_31_++) {
                if (((this.anIntArrayArray4438[-this.anInt4453 + (i_29_ - 1)][i_31_ - this.anInt4441]) & 0x8) == 0) return true;
            }
        } else if (i_18_ == i_27_ && (0x8 & i_19_) == 0) {
            int i_33_ = Math.max(i_25_, i_24_);
            for (int i_34_ = (Math.min(i_30_, i_28_)); i_33_ < i_34_; i_33_++) {
                if (((this.anIntArrayArray4438[-this.anInt4453 + i_18_][-this.anInt4441 + i_33_]) & 0x80) == 0) return true;
            }
        } else if (i_30_ == i_24_ && (i_19_ & 0x1) == 0) {
            int i_35_ = Math.max(i_18_, i_22_);
            for (int i_36_ = Math.min(i_27_, i_29_); i_36_ > i_35_; i_35_++) {
                if ((0x2 & (this.anIntArrayArray4438[i_35_ + -this.anInt4453][-this.anInt4441 + -1 + i_30_])) == 0) return true;
            }
        } else if (i_25_ == i_28_ && (i_19_ & 0x4) == 0) {
            int i_37_ = Math.max(i_22_, i_18_);
            for (int i_38_ = Math.min(i_27_, i_29_); i_38_ > i_37_; i_37_++) {
                if (((this.anIntArrayArray4438[i_37_ + -this.anInt4453][i_25_ - this.anInt4441]) & 0x20) == 0) return true;
            }
        }
        return false;
    }

    static final void method3498(int i, ha var_ha, int i_39_, int i_40_, boolean bool, int i_41_) {
        do {
            try {
                anInt4442++;
                var_ha.KA(i_39_, i_41_, i_40_ + i_39_, i_41_ + i);
                var_ha.method3675(i_40_, (byte) -125, i_39_, i_41_, i, -16777216);
                if (Class348.anInt4290 >= 100) {
                    float f = ((float) Class75.anInt1267 / (float) Class75.anInt1259);
                    int i_42_ = i_40_;
                    int i_43_ = i;
                    if (!(f < 1.0F)) i_42_ = (int) ((float) i / f);
                    else i_43_ = (int) ((float) i_40_ * f);
                    i_41_ += (-i_43_ + i) / 2;
                    i_39_ += (i_40_ + -i_42_) / 2;
                    if (Class67.aClass105_4643 == null || i_40_ != Class67.aClass105_4643.method971() || (Class67.aClass105_4643.method969() != i)) {
                        Class75.method751(Class75.anInt1266, (Class75.anInt1267 + Class75.anInt1263), (Class75.anInt1266 - -Class75.anInt1259), Class75.anInt1263, i_39_, i_41_, i_42_ + i_39_, i_43_ + i_41_);
                        Class75.method748(var_ha);
                        Class67.aClass105_4643 = var_ha.method3683(i_39_, i_41_, i_42_, i_43_, false);
                    }
                    Class67.aClass105_4643.method974(i_39_, i_41_);
                    int i_44_ = Class25.anInt370 * i_42_ / Class75.anInt1259;
                    int i_45_ = i_43_ * Class182.anInt2446 / Class75.anInt1267;
                    int i_46_ = i_39_ - -(i_42_ * Class368.anInt4509 / Class75.anInt1259);
                    if (bool != true) method3498(44, null, -27, -91, true, -26);
                    int i_47_ = (-i_45_ + i_41_ - (-i_43_ + (i_43_ * Class59_Sub1_Sub2.anInt8665 / Class75.anInt1267)));
                    int i_48_ = -1996554240;
                    if (Class14_Sub4.aClass230_8638 == Class348_Sub42_Sub8_Sub2.aClass230_10434) i_48_ = -1996488705;
                    var_ha.aa(i_46_, i_47_, i_44_, i_45_, i_48_, 1);
                    var_ha.method3628(i_46_, i_47_, i_44_, i_45_, i_48_, 0);
                    if (Class367_Sub9.anInt7379 <= 0) break;
                    int i_49_;
                    if (Class164.anInt2173 <= 50) i_49_ = Class164.anInt2173 * 5;
                    else i_49_ = -(5 * Class164.anInt2173) + 500;
                    for (Class348_Sub21 class348_sub21 = ((Class348_Sub21) Class75.aClass262_1254.method1995(4)); class348_sub21 != null; class348_sub21 = (Class348_Sub21) Class75.aClass262_1254.method1990((byte) 126)) {
                        Class42 class42 = (Class75.aClass153_1238.method1225(class348_sub21.anInt6847, (byte) 71));
                        if (Class60.method589(class42, -4)) {
                            if (Class348_Sub40_Sub30.anInt9399 == (class348_sub21.anInt6847)) {
                                int i_50_ = (i_39_ + (i_42_ * (class348_sub21.anInt6852) / Class75.anInt1259));
                                int i_51_ = (((Class75.anInt1267 - (class348_sub21.anInt6851)) * i_43_ / Class75.anInt1267) + i_41_);
                                var_ha.method3675(4, (byte) -125, i_50_ - 2, -2 + i_51_, 4, (i_49_ << 24 | 0xffff00));
                            } else if (Class34.anInt481 != -1 && (class42.anInt596 == Class34.anInt481)) {
                                int i_52_ = (i_39_ - -((class348_sub21.anInt6852) * i_42_ / Class75.anInt1259));
                                int i_53_ = i_41_ - -(i_43_ * (Class75.anInt1267 + -(class348_sub21.anInt6851)) / Class75.anInt1267);
                                var_ha.method3675(4, (byte) -125, i_52_ + -2, -2 + i_53_, 4, (i_49_ << 24 | 0xffff00));
                            }
                        }
                    }
                }
            } catch (RuntimeException runtimeexception) {
                throw Class348_Sub17.method2929(runtimeexception, ("fe.E(" + i + ',' + (var_ha != null ? "{...}" : "null") + ',' + i_39_ + ',' + i_40_ + ',' + bool + ',' + i_41_ + ')'));
            }
            break;
        } while (false);
    }

    final void method3499(byte i, int i_54_, int i_55_) {
        i_55_ -= this.anInt4441;
        i_54_ -= this.anInt4453;
        anInt4446++;
        if (i == -52) this.anIntArrayArray4438[i_54_][i_55_] = Class139.method1166((this.anIntArrayArray4438[i_54_][i_55_]), -262145);
    }

    final void method3500(int i) {
        int i_56_ = 0;
        if (i != 700) method3509(120, true, false, 4, -12, 14, -33, -109);
        for (/**/; i_56_ < this.anInt4437; i_56_++) {
            for (int i_57_ = 0; this.anInt4443 > i_57_; i_57_++) {
                if (i_56_ != 0 && i_57_ != 0 && i_56_ < this.anInt4437 + -5 && (i_57_ < -5 + this.anInt4443)) this.anIntArrayArray4438[i_56_][i_57_] = 2097152;
                else this.anIntArrayArray4438[i_56_][i_57_] = -1;
            }
        }
        anInt4451++;
    }

    final void method3501(byte i, int i_58_, int i_59_) {
        i_59_ -= this.anInt4453;
        anInt4447++;
        i_58_ -= this.anInt4441;
        int i_60_ = -79 % ((i - 66) / 39);
        this.anIntArrayArray4438[i_59_][i_58_] = Class139.method1166((this.anIntArrayArray4438[i_59_][i_58_]), -2097153);
    }

    static final void method3502(int i, int i_61_, int i_62_, int i_63_) {
        anInt4439++;
        String string = ("tele " + i_62_ + "," + (i_63_ >> 6) + "," + (i >> 6) + "," + (0x3f & i_63_) + "," + (0x3f & i));
        System.out.println(string);
        if (i_61_ != 2) method3502(-25, -23, 24, 63);
        Class82.method812(string, true, false, (byte) -79);
    }

    final boolean method3503(int i, byte i_64_, int i_65_, int i_66_, int i_67_, int i_68_, int i_69_, int i_70_, int i_71_) {
        anInt4436++;
        if (i_66_ > 1) {
            if (Class239_Sub28.method1842(i_68_, i_65_, -1, i_66_, i, i_70_, i_71_, i_66_, i_67_)) return true;
            return method3497(-28388, i_71_, i_69_, i_66_, i_67_, i, i_66_, i_70_, i_65_, i_68_);
        }
        int i_72_ = 64 % ((2 - i_64_) / 45);
        int i_73_ = -1 + i_68_ + i_71_;
        int i_74_ = i_65_ - (-i_67_ + 1);
        if (i >= i_71_ && i_73_ >= i && i_65_ <= i_70_ && i_70_ <= i_74_) return true;
        if (-1 + i_71_ == i && i_70_ >= i_65_ && i_70_ <= i_74_ && ((this.anIntArrayArray4438[-this.anInt4453 + i][-this.anInt4441 + i_70_]) & 0x8) == 0 && (i_69_ & 0x8) == 0) return true;
        if (1 + i_73_ == i && i_70_ >= i_65_ && i_74_ >= i_70_ && (0x80 & (this.anIntArrayArray4438[-this.anInt4453 + i][i_70_ - this.anInt4441])) == 0 && (0x2 & i_69_) == 0) return true;
        if (-1 + i_65_ == i_70_ && i >= i_71_ && i_73_ >= i && ((this.anIntArrayArray4438[i + -this.anInt4453][-this.anInt4441 + i_70_]) & 0x2) == 0 && (i_69_ & 0x4) == 0) return true;
        return i_70_ == i_74_ - -1 && i_71_ <= i && i_73_ >= i && (0x20 & (this.anIntArrayArray4438[-this.anInt4453 + i][i_70_ - this.anInt4441])) == 0 && (0x1 & i_69_) == 0;
    }

    final boolean method3504(int i, int i_75_, int i_76_, int i_77_, int i_78_, int i_79_, int i_80_, int i_81_) {
        anInt4454++;
        if (i_79_ != 1) this.anInt4443 = -59;
        if (i_81_ != 1) {
            if (i_77_ <= i_76_ && -1 + i_81_ + i_77_ >= i_76_ && i <= i && i_81_ + i - 1 >= i) return true;
        } else if (i_77_ == i_76_ && i_75_ == i) return true;
        i_76_ -= this.anInt4453;
        i_77_ -= this.anInt4453;
        i -= this.anInt4441;
        i_75_ -= this.anInt4441;
        if (i_81_ == 1) {
            if (i_78_ == 6 || i_78_ == 7) {
                if (i_78_ == 7) i_80_ = 2 + i_80_ & 0x3;
                if (i_80_ == 0) {
                    if (i_77_ == 1 + i_76_ && i_75_ == i && (0x80 & (this.anIntArrayArray4438[i_77_][i_75_])) == 0) return true;
                    if (i_77_ == i_76_ && i_75_ == -1 + i && (0x2 & (this.anIntArrayArray4438[i_77_][i_75_])) == 0) return true;
                } else if (i_80_ == 1) {
                    if (i_76_ + -1 == i_77_ && i == i_75_ && (this.anIntArrayArray4438[i_77_][i_75_] & 0x8) == 0) return true;
                    if (i_76_ == i_77_ && i - 1 == i_75_ && ((this.anIntArrayArray4438[i_77_][i_75_]) & 0x2) == 0) return true;
                } else if (i_80_ == 2) {
                    if (i_77_ == -1 + i_76_ && i == i_75_ && (0x8 & (this.anIntArrayArray4438[i_77_][i_75_])) == 0) return true;
                    if (i_76_ == i_77_ && i + 1 == i_75_ && ((this.anIntArrayArray4438[i_77_][i_75_]) & 0x20) == 0) return true;
                } else if (i_80_ == 3) {
                    if (i_76_ - -1 == i_77_ && i_75_ == i && (this.anIntArrayArray4438[i_77_][i_75_] & 0x80) == 0) return true;
                    if (i_77_ == i_76_ && i + 1 == i_75_ && (0x20 & (this.anIntArrayArray4438[i_77_][i_75_])) == 0) return true;
                }
            }
            if (i_78_ == 8) {
                if (i_76_ == i_77_ && 1 + i == i_75_ && (this.anIntArrayArray4438[i_77_][i_75_] & 0x20) == 0) return true;
                if (i_76_ == i_77_ && i - 1 == i_75_ && (this.anIntArrayArray4438[i_77_][i_75_] & 0x2) == 0) return true;
                if (i_77_ == i_76_ + -1 && i_75_ == i && (this.anIntArrayArray4438[i_77_][i_75_] & 0x8) == 0) return true;
                return i_77_ == 1 + i_76_ && i_75_ == i && (this.anIntArrayArray4438[i_77_][i_75_] & 0x80) == 0;
            }
        } else {
            int i_82_ = -1 + (i_81_ + i_77_);
            int i_83_ = i_75_ - (-i_81_ - -1);
            if (i_78_ == 6 || i_78_ == 7) {
                if (i_78_ == 7) i_80_ = 0x3 & 2 + i_80_;
                if (i_80_ == 0) {
                    if (i_77_ == 1 + i_76_ && i_75_ <= i && i <= i_83_ && ((0x80 & this.anIntArrayArray4438[i_77_][i]) == 0)) return true;
                    if (i_76_ >= i_77_ && i_76_ <= i_82_ && -i_81_ + i == i_75_ && ((this.anIntArrayArray4438[i_76_][i_83_]) & 0x2) == 0) return true;
                } else if (i_80_ == 1) {
                    if (i_77_ == i_76_ + -i_81_ && i >= i_75_ && i <= i_83_ && (this.anIntArrayArray4438[i_82_][i] & 0x8) == 0) return true;
                    if (i_76_ >= i_77_ && i_76_ <= i_82_ && i_75_ == -i_81_ + i && ((this.anIntArrayArray4438[i_76_][i_83_]) & 0x2) == 0) return true;
                } else if (i_80_ == 2) {
                    if (-i_81_ + i_76_ == i_77_ && i >= i_75_ && i_83_ >= i && ((this.anIntArrayArray4438[i_82_][i]) & 0x8) == 0) return true;
                    if (i_76_ >= i_77_ && i_76_ <= i_82_ && 1 + i == i_75_ && ((this.anIntArrayArray4438[i_76_][i_75_]) & 0x20) == 0) return true;
                } else if (i_80_ == 3) {
                    if (i_77_ == i_76_ - -1 && i_75_ <= i && i <= i_83_ && (0x80 & (this.anIntArrayArray4438[i_77_][i])) == 0) return true;
                    if (i_76_ >= i_77_ && i_82_ >= i_76_ && i - -1 == i_75_ && ((this.anIntArrayArray4438[i_76_][i_75_]) & 0x20) == 0) return true;
                }
            }
            if (i_78_ == 8) {
                if (i_76_ >= i_77_ && i_82_ >= i_76_ && 1 + i == i_75_ && (0x20 & this.anIntArrayArray4438[i_76_][i_75_]) == 0) return true;
                if (i_76_ >= i_77_ && i_76_ <= i_82_ && i_75_ == -i_81_ + i && (0x2 & this.anIntArrayArray4438[i_76_][i_83_]) == 0) return true;
                if (i_77_ == i_76_ - i_81_ && i_75_ <= i && i <= i_83_ && ((0x8 & this.anIntArrayArray4438[i_82_][i]) == 0)) return true;
                return i_77_ == 1 + i_76_ && i_75_ <= i && i_83_ >= i && ((0x80 & this.anIntArrayArray4438[i_77_][i]) == 0);
            }
        }
        return false;
    }

    final void method3505(boolean bool, int i, int i_84_, boolean bool_85_, int i_86_, boolean bool_87_, int i_88_) {
        if (bool_85_ != true) this.anInt4453 = 116;
        anInt4434++;
        int i_89_ = 256;
        if (bool_87_) i_89_ |= 0x20000;
        i_86_ -= this.anInt4453;
        i_84_ -= this.anInt4441;
        if (bool) i_89_ |= 0x40000000;
        for (int i_90_ = i_86_; i_86_ + i > i_90_; i_90_++) {
            if (i_90_ >= 0 && (i_90_ < this.anInt4437)) {
                for (int i_91_ = i_84_; i_91_ < i_84_ + i_88_; i_91_++) {
                    if (i_91_ >= 0 && this.anInt4443 > i_91_) method3494(i_90_, i_89_, i_91_, -6496);
                }
            }
        }
    }

    final void method3506(boolean bool, int i, int i_92_, int i_93_, int i_94_, boolean bool_95_, int i_96_) {
        anInt4435++;
        i_92_ -= this.anInt4453;
        if (i_96_ == 29216) {
            i_94_ -= this.anInt4441;
            if (i_93_ == 0) {
                if (i == 0) {
                    method3493(128, i_96_ ^ ~0x725a, i_92_, i_94_);
                    method3493(8, i_96_ + -29342, i_92_ + -1, i_94_);
                }
                if (i == 1) {
                    method3493(2, -122, i_92_, i_94_);
                    method3493(32, -124, i_92_, i_94_ + 1);
                }
                if (i == 2) {
                    method3493(8, -127, i_92_, i_94_);
                    method3493(128, -127, 1 + i_92_, i_94_);
                }
                if (i == 3) {
                    method3493(32, -125, i_92_, i_94_);
                    method3493(2, i_96_ ^ ~0x725f, i_92_, i_94_ + -1);
                }
            }
            if (i_93_ == 1 || i_93_ == 3) {
                if (i == 0) {
                    method3493(1, -123, i_92_, i_94_);
                    method3493(16, -127, -1 + i_92_, i_94_ + 1);
                }
                if (i == 1) {
                    method3493(4, -123, i_92_, i_94_);
                    method3493(64, -128, i_92_ - -1, 1 + i_94_);
                }
                if (i == 2) {
                    method3493(16, -122, i_92_, i_94_);
                    method3493(1, -125, 1 + i_92_, -1 + i_94_);
                }
                if (i == 3) {
                    method3493(64, -127, i_92_, i_94_);
                    method3493(4, i_96_ ^ ~0x725f, -1 + i_92_, -1 + i_94_);
                }
            }
            if (i_93_ == 2) {
                if (i == 0) {
                    method3493(130, -122, i_92_, i_94_);
                    method3493(8, -123, -1 + i_92_, i_94_);
                    method3493(32, -124, i_92_, i_94_ + 1);
                }
                if (i == 1) {
                    method3493(10, -123, i_92_, i_94_);
                    method3493(32, -122, i_92_, i_94_ - -1);
                    method3493(128, -127, i_92_ - -1, i_94_);
                }
                if (i == 2) {
                    method3493(40, -122, i_92_, i_94_);
                    method3493(128, -123, 1 + i_92_, i_94_);
                    method3493(2, -127, i_92_, i_94_ + -1);
                }
                if (i == 3) {
                    method3493(160, -127, i_92_, i_94_);
                    method3493(2, -128, i_92_, i_94_ - 1);
                    method3493(8, i_96_ + -29343, -1 + i_92_, i_94_);
                }
            }
            if (bool) {
                if (i_93_ == 0) {
                    if (i == 0) {
                        method3493(65536, i_96_ ^ ~0x7258, i_92_, i_94_);
                        method3493(4096, -127, i_92_ - 1, i_94_);
                    }
                    if (i == 1) {
                        method3493(1024, i_96_ ^ ~0x725f, i_92_, i_94_);
                        method3493(16384, -122, i_92_, 1 + i_94_);
                    }
                    if (i == 2) {
                        method3493(4096, -124, i_92_, i_94_);
                        method3493(65536, -121, 1 + i_92_, i_94_);
                    }
                    if (i == 3) {
                        method3493(16384, -128, i_92_, i_94_);
                        method3493(1024, -125, i_92_, i_94_ - 1);
                    }
                }
                if (i_93_ == 1 || i_93_ == 3) {
                    if (i == 0) {
                        method3493(512, -125, i_92_, i_94_);
                        method3493(8192, -128, -1 + i_92_, 1 + i_94_);
                    }
                    if (i == 1) {
                        method3493(2048, i_96_ ^ ~0x7258, i_92_, i_94_);
                        method3493(32768, -128, 1 + i_92_, i_94_ - -1);
                    }
                    if (i == 2) {
                        method3493(8192, -125, i_92_, i_94_);
                        method3493(512, -123, i_92_ + 1, i_94_ - 1);
                    }
                    if (i == 3) {
                        method3493(32768, i_96_ ^ ~0x7258, i_92_, i_94_);
                        method3493(2048, -123, i_92_ - 1, i_94_ - 1);
                    }
                }
                if (i_93_ == 2) {
                    if (i == 0) {
                        method3493(66560, i_96_ + -29342, i_92_, i_94_);
                        method3493(4096, -121, -1 + i_92_, i_94_);
                        method3493(16384, -127, i_92_, i_94_ - -1);
                    }
                    if (i == 1) {
                        method3493(5120, -127, i_92_, i_94_);
                        method3493(16384, -125, i_92_, 1 + i_94_);
                        method3493(65536, -123, 1 + i_92_, i_94_);
                    }
                    if (i == 2) {
                        method3493(20480, i_96_ + -29339, i_92_, i_94_);
                        method3493(65536, -124, 1 + i_92_, i_94_);
                        method3493(1024, -125, i_92_, i_94_ + -1);
                    }
                    if (i == 3) {
                        method3493(81920, -123, i_92_, i_94_);
                        method3493(1024, i_96_ + -29339, i_92_, -1 + i_94_);
                        method3493(4096, i_96_ + -29340, i_92_ + -1, i_94_);
                    }
                }
            }
            if (bool_95_) {
                if (i_93_ == 0) {
                    if (i == 0) {
                        method3493(536870912, -125, i_92_, i_94_);
                        method3493(33554432, -128, i_92_ + -1, i_94_);
                    }
                    if (i == 1) {
                        method3493(8388608, i_96_ + -29338, i_92_, i_94_);
                        method3493(134217728, i_96_ + -29339, i_92_, i_94_ - -1);
                    }
                    if (i == 2) {
                        method3493(33554432, -123, i_92_, i_94_);
                        method3493(536870912, -122, 1 + i_92_, i_94_);
                    }
                    if (i == 3) {
                        method3493(134217728, -128, i_92_, i_94_);
                        method3493(8388608, -127, i_92_, -1 + i_94_);
                    }
                }
                if (i_93_ == 1 || i_93_ == 3) {
                    if (i == 0) {
                        method3493(4194304, -121, i_92_, i_94_);
                        method3493(67108864, -121, i_92_ + -1, 1 + i_94_);
                    }
                    if (i == 1) {
                        method3493(16777216, -126, i_92_, i_94_);
                        method3493(268435456, -124, 1 + i_92_, 1 + i_94_);
                    }
                    if (i == 2) {
                        method3493(67108864, -122, i_92_, i_94_);
                        method3493(4194304, -126, 1 + i_92_, -1 + i_94_);
                    }
                    if (i == 3) {
                        method3493(268435456, -122, i_92_, i_94_);
                        method3493(16777216, -126, -1 + i_92_, i_94_ + -1);
                    }
                }
                if (i_93_ == 2) {
                    if (i == 0) {
                        method3493(545259520, -124, i_92_, i_94_);
                        method3493(33554432, -123, -1 + i_92_, i_94_);
                        method3493(134217728, -123, i_92_, i_94_ + 1);
                    }
                    if (i == 1) {
                        method3493(41943040, -123, i_92_, i_94_);
                        method3493(134217728, i_96_ ^ ~0x725f, i_92_, 1 + i_94_);
                        method3493(536870912, -121, 1 + i_92_, i_94_);
                    }
                    if (i == 2) {
                        method3493(167772160, -127, i_92_, i_94_);
                        method3493(536870912, -124, 1 + i_92_, i_94_);
                        method3493(8388608, -128, i_92_, i_94_ - 1);
                    }
                    if (i == 3) {
                        method3493(671088640, -126, i_92_, i_94_);
                        method3493(8388608, -121, i_92_, i_94_ - 1);
                        method3493(33554432, -126, i_92_ - 1, i_94_);
                    }
                }
            }
        }
    }

    final void method3507(int i, int i_97_, byte i_98_) {
        if (i_98_ > -32) this.anInt4437 = 85;
        i -= this.anInt4441;
        anInt4431++;
        i_97_ -= this.anInt4453;
        this.anIntArrayArray4438[i_97_][i] = Class273.method2057((this.anIntArrayArray4438[i_97_][i]), 2097152);
    }

    public static void method3508(int i) {
        aClass114_4433 = null;
        if (i != 2) aFloat4455 = 0.7198636F;
    }

    final void method3509(int i, boolean bool, boolean bool_99_, int i_100_, int i_101_, int i_102_, int i_103_, int i_104_) {
        anInt4432++;
        if (i_103_ > 52) {
            int i_105_ = 256;
            if (bool_99_) i_105_ |= 0x20000;
            i_100_ -= this.anInt4453;
            i_101_ -= this.anInt4441;
            if (bool) i_105_ |= 0x40000000;
            if (i == 1 || i == 3) {
                int i_106_ = i_104_;
                i_104_ = i_102_;
                i_102_ = i_106_;
            }
            for (int i_107_ = i_100_; i_107_ < i_104_ + i_100_; i_107_++) {
                if (i_107_ >= 0 && i_107_ < this.anInt4437) {
                    for (int i_108_ = i_101_; (i_101_ + i_102_ > i_108_); i_108_++) {
                        if (i_108_ >= 0 && this.anInt4443 > i_108_) method3493(i_105_, -122, i_107_, i_108_);
                    }
                }
            }
        }
    }

    final void method3510(int i, int i_109_, int i_110_, int i_111_, int i_112_, boolean bool, boolean bool_113_) {
        anInt4445++;
        int i_114_ = 49 / ((i_110_ - 6) / 46);
        i -= this.anInt4441;
        i_109_ -= this.anInt4453;
        if (i_111_ == 0) {
            if (i_112_ == 0) {
                method3494(i_109_, 128, i, -6496);
                method3494(-1 + i_109_, 8, i, -6496);
            }
            if (i_112_ == 1) {
                method3494(i_109_, 2, i, -6496);
                method3494(i_109_, 32, 1 + i, -6496);
            }
            if (i_112_ == 2) {
                method3494(i_109_, 8, i, -6496);
                method3494(i_109_ + 1, 128, i, -6496);
            }
            if (i_112_ == 3) {
                method3494(i_109_, 32, i, -6496);
                method3494(i_109_, 2, -1 + i, -6496);
            }
        }
        if (i_111_ == 1 || i_111_ == 3) {
            if (i_112_ == 0) {
                method3494(i_109_, 1, i, -6496);
                method3494(i_109_ - 1, 16, 1 + i, -6496);
            }
            if (i_112_ == 1) {
                method3494(i_109_, 4, i, -6496);
                method3494(i_109_ + 1, 64, 1 + i, -6496);
            }
            if (i_112_ == 2) {
                method3494(i_109_, 16, i, -6496);
                method3494(1 + i_109_, 1, -1 + i, -6496);
            }
            if (i_112_ == 3) {
                method3494(i_109_, 64, i, -6496);
                method3494(i_109_ - 1, 4, -1 + i, -6496);
            }
        }
        if (i_111_ == 2) {
            if (i_112_ == 0) {
                method3494(i_109_, 130, i, -6496);
                method3494(i_109_ - 1, 8, i, -6496);
                method3494(i_109_, 32, i + 1, -6496);
            }
            if (i_112_ == 1) {
                method3494(i_109_, 10, i, -6496);
                method3494(i_109_, 32, 1 + i, -6496);
                method3494(1 + i_109_, 128, i, -6496);
            }
            if (i_112_ == 2) {
                method3494(i_109_, 40, i, -6496);
                method3494(i_109_ + 1, 128, i, -6496);
                method3494(i_109_, 2, -1 + i, -6496);
            }
            if (i_112_ == 3) {
                method3494(i_109_, 160, i, -6496);
                method3494(i_109_, 2, -1 + i, -6496);
                method3494(-1 + i_109_, 8, i, -6496);
            }
        }
        if (bool_113_) {
            if (i_111_ == 0) {
                if (i_112_ == 0) {
                    method3494(i_109_, 65536, i, -6496);
                    method3494(i_109_ - 1, 4096, i, -6496);
                }
                if (i_112_ == 1) {
                    method3494(i_109_, 1024, i, -6496);
                    method3494(i_109_, 16384, i + 1, -6496);
                }
                if (i_112_ == 2) {
                    method3494(i_109_, 4096, i, -6496);
                    method3494(i_109_ + 1, 65536, i, -6496);
                }
                if (i_112_ == 3) {
                    method3494(i_109_, 16384, i, -6496);
                    method3494(i_109_, 1024, i - 1, -6496);
                }
            }
            if (i_111_ == 1 || i_111_ == 3) {
                if (i_112_ == 0) {
                    method3494(i_109_, 512, i, -6496);
                    method3494(-1 + i_109_, 8192, i + 1, -6496);
                }
                if (i_112_ == 1) {
                    method3494(i_109_, 2048, i, -6496);
                    method3494(i_109_ + 1, 32768, i - -1, -6496);
                }
                if (i_112_ == 2) {
                    method3494(i_109_, 8192, i, -6496);
                    method3494(1 + i_109_, 512, i - 1, -6496);
                }
                if (i_112_ == 3) {
                    method3494(i_109_, 32768, i, -6496);
                    method3494(i_109_ + -1, 2048, -1 + i, -6496);
                }
            }
            if (i_111_ == 2) {
                if (i_112_ == 0) {
                    method3494(i_109_, 66560, i, -6496);
                    method3494(i_109_ + -1, 4096, i, -6496);
                    method3494(i_109_, 16384, 1 + i, -6496);
                }
                if (i_112_ == 1) {
                    method3494(i_109_, 5120, i, -6496);
                    method3494(i_109_, 16384, i + 1, -6496);
                    method3494(i_109_ - -1, 65536, i, -6496);
                }
                if (i_112_ == 2) {
                    method3494(i_109_, 20480, i, -6496);
                    method3494(1 + i_109_, 65536, i, -6496);
                    method3494(i_109_, 1024, -1 + i, -6496);
                }
                if (i_112_ == 3) {
                    method3494(i_109_, 81920, i, -6496);
                    method3494(i_109_, 1024, i - 1, -6496);
                    method3494(i_109_ + -1, 4096, i, -6496);
                }
            }
        }
        if (bool) {
            if (i_111_ == 0) {
                if (i_112_ == 0) {
                    method3494(i_109_, 536870912, i, -6496);
                    method3494(-1 + i_109_, 33554432, i, -6496);
                }
                if (i_112_ == 1) {
                    method3494(i_109_, 8388608, i, -6496);
                    method3494(i_109_, 134217728, i - -1, -6496);
                }
                if (i_112_ == 2) {
                    method3494(i_109_, 33554432, i, -6496);
                    method3494(i_109_ - -1, 536870912, i, -6496);
                }
                if (i_112_ == 3) {
                    method3494(i_109_, 134217728, i, -6496);
                    method3494(i_109_, 8388608, i - 1, -6496);
                }
            }
            if (i_111_ == 1 || i_111_ == 3) {
                if (i_112_ == 0) {
                    method3494(i_109_, 4194304, i, -6496);
                    method3494(-1 + i_109_, 67108864, i - -1, -6496);
                }
                if (i_112_ == 1) {
                    method3494(i_109_, 16777216, i, -6496);
                    method3494(1 + i_109_, 268435456, 1 + i, -6496);
                }
                if (i_112_ == 2) {
                    method3494(i_109_, 67108864, i, -6496);
                    method3494(1 + i_109_, 4194304, i - 1, -6496);
                }
                if (i_112_ == 3) {
                    method3494(i_109_, 268435456, i, -6496);
                    method3494(i_109_ - 1, 16777216, -1 + i, -6496);
                }
            }
            if (i_111_ == 2) {
                if (i_112_ == 0) {
                    method3494(i_109_, 545259520, i, -6496);
                    method3494(i_109_ + -1, 33554432, i, -6496);
                    method3494(i_109_, 134217728, i - -1, -6496);
                }
                if (i_112_ == 1) {
                    method3494(i_109_, 41943040, i, -6496);
                    method3494(i_109_, 134217728, 1 + i, -6496);
                    method3494(1 + i_109_, 536870912, i, -6496);
                }
                if (i_112_ == 2) {
                    method3494(i_109_, 167772160, i, -6496);
                    method3494(1 + i_109_, 536870912, i, -6496);
                    method3494(i_109_, 8388608, -1 + i, -6496);
                }
                if (i_112_ == 3) {
                    method3494(i_109_, 671088640, i, -6496);
                    method3494(i_109_, 8388608, i + -1, -6496);
                    method3494(-1 + i_109_, 33554432, i, -6496);
                }
            }
        }
    }
}
