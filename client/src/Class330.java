/* Class330 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaclib.memory.Buffer;
import jaclib.memory.Stream;

final class Class330 {
    static int anInt4110;
    private final ha_Sub3 aHa_Sub3_4111;
    byte[] aByteArray4112;
    int anInt4113;
    static int anInt4114;
    static int anInt4115;
    private final s_Sub3 aS_Sub3_4116;
    static boolean aBoolean4117 = false;
    private final int anInt4118;
    static int anInt4119;
    static int anInt4120;
    private final int anInt4121;
    private Class97[][] aClass97ArrayArray4122;
    private final int anInt4123;
    private final int anInt4124;
    static int anInt4125;
    static Class114 aClass114_4126 = new Class114(5, 8);
    static boolean aBoolean4127 = false;

    final boolean method2628(int i, byte i_0_, r var_r, int i_1_) {
        anInt4119++;
        r_Sub1 var_r_Sub1 = (r_Sub1) var_r;
        int i_2_ = 13 % ((i_0_ - -21) / 45);
        i_1_ += var_r_Sub1.anInt10474 + 1;
        i += var_r_Sub1.anInt10468 - -1;
        int i_3_ = i_1_ * this.anInt4113 + i;
        int i_4_ = var_r_Sub1.anInt10467;
        int i_5_ = var_r_Sub1.anInt10466;
        int i_6_ = -i_5_ + this.anInt4113;
        if (i_1_ <= 0) {
            int i_7_ = 1 + -i_1_;
            i_4_ -= i_7_;
            i_3_ += this.anInt4113 * i_7_;
            i_1_ = 1;
        }
        if (anInt4123 <= i_4_ + i_1_) {
            int i_8_ = -anInt4123 + (i_4_ + i_1_) - -1;
            i_4_ -= i_8_;
        }
        if (i <= 0) {
            int i_9_ = -i + 1;
            i = 1;
            i_6_ += i_9_;
            i_5_ -= i_9_;
            i_3_ += i_9_;
        }
        if (i_5_ + i >= this.anInt4113) {
            int i_10_ = 1 + i + (i_5_ + -this.anInt4113);
            i_5_ -= i_10_;
            i_6_ += i_10_;
        }
        if (i_5_ <= 0 || i_4_ <= 0) return false;
        int i_11_ = 8;
        i_6_ += (i_11_ + -1) * this.anInt4113;
        return Class318_Sub4.method2503(i_6_, i_3_, i_11_, this.aByteArray4112, i_5_, -16259, i_4_);
    }

    final void method2629(int i, r var_r, int i_12_, int i_13_) {
        anInt4114++;
        r_Sub1 var_r_Sub1 = (r_Sub1) var_r;
        i_13_ += 1 + var_r_Sub1.anInt10468;
        i += i_12_ + var_r_Sub1.anInt10474;
        int i_14_ = i * this.anInt4113 + i_13_;
        int i_15_ = 0;
        int i_16_ = var_r_Sub1.anInt10467;
        int i_17_ = var_r_Sub1.anInt10466;
        int i_18_ = this.anInt4113 + -i_17_;
        if (i <= 0) {
            int i_19_ = -i + 1;
            i_14_ += this.anInt4113 * i_19_;
            i_16_ -= i_19_;
            i = 1;
            i_15_ += i_19_ * i_17_;
        }
        int i_20_ = 0;
        if (anInt4123 <= i_16_ + i) {
            int i_21_ = -anInt4123 + i - -i_16_ + 1;
            i_16_ -= i_21_;
        }
        if (i_13_ <= 0) {
            int i_22_ = 1 + -i_13_;
            i_20_ += i_22_;
            i_18_ += i_22_;
            i_13_ = 1;
            i_14_ += i_22_;
            i_15_ += i_22_;
            i_17_ -= i_22_;
        }
        if (i_13_ + i_17_ >= this.anInt4113) {
            int i_23_ = 1 + i_17_ + (i_13_ - this.anInt4113);
            i_18_ += i_23_;
            i_17_ -= i_23_;
            i_20_ += i_23_;
        }
        if (i_17_ > 0 && i_16_ > 0) {
            Class348_Sub40_Sub37.method3146(i_18_, i_17_, (byte) -116, i_20_, i_16_, i_14_, this.aByteArray4112, (var_r_Sub1.aByteArray10471), i_15_);
            method2634(i, -1, i_13_, i_16_, i_17_);
        }
    }

    final void method2630(int i, int i_24_, int i_25_, boolean bool, boolean[][] bools, int i_26_) {
        anInt4115++;
        aHa_Sub3_4111.method3866(false, true);
        aHa_Sub3_4111.method3946(-32, false);
        aHa_Sub3_4111.method3817(79, 1);
        aHa_Sub3_4111.method3923(true, 1);
        aHa_Sub3_4111.method3814(false, false, -2, (byte) 82);
        float f = 1.0F / (float) (aHa_Sub3_4111.anInt8125 * i);
        if (bool) {
            for (int i_27_ = 0; anInt4118 > i_27_; i_27_++) {
                int i_28_ = i_27_ << anInt4124;
                int i_29_ = 1 + i_27_ << anInt4124;
                for (int i_30_ = 0; anInt4121 > i_30_; i_30_++) {
                    if (aClass97ArrayArray4122[i_30_][i_27_] != null) {
                        int i_31_ = i_30_ << anInt4124;
                        int i_32_ = i_30_ + 1 << anInt4124;
                        while_119_:
                        for (int i_33_ = i_31_; i_33_ < i_32_; i_33_++) {
                            if (-i_25_ + i_33_ >= -i_24_ && i_24_ >= -i_25_ + i_33_) {
                                for (int i_34_ = i_28_; (i_29_ > i_34_); i_34_++) {
                                    if (-i_24_ <= i_34_ + -i_26_ && i_24_ >= -i_26_ + i_34_ && (bools[i_24_ + (-i_25_ + i_33_)][-i_26_ + i_34_ + i_24_])) {
                                        Class101_Sub2 class101_sub2 = aHa_Sub3_4111.method3820(false);
                                        class101_sub2.method932(1.0F, f, f, (byte) -65);
                                        class101_sub2.method891(-i_30_, -i_27_, 0);
                                        aHa_Sub3_4111.method3853(i ^ ~0x9f, Class239_Sub18.aClass251_6030);
                                        aClass97ArrayArray4122[i_30_][i_27_].method871((byte) 116);
                                        break while_119_;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int i_35_ = 0; anInt4118 > i_35_; i_35_++) {
                int i_36_ = i_35_ << anInt4124;
                int i_37_ = 1 + i_35_ << anInt4124;
                for (int i_38_ = 0; i_38_ < anInt4121; i_38_++) {
                    Class97 class97 = aClass97ArrayArray4122[i_38_][i_35_];
                    if (class97 != null) {
                        Interface5_Impl2 interface5_impl2 = aHa_Sub3_4111.method3822(118, (class97.anInt1563) * 3);
                        Buffer buffer = interface5_impl2.method24(true, false);
                        if (buffer != null) {
                            Stream stream = aHa_Sub3_4111.method3893(buffer, 9179);
                            int i_39_ = 0;
                            int i_40_ = i_38_ << anInt4124;
                            int i_41_ = i_38_ + 1 << anInt4124;
                            for (int i_42_ = i_36_; i_42_ < i_37_; i_42_++) {
                                if (-i_26_ + i_42_ >= -i_24_ && (i_42_ - i_26_ <= i_24_)) {
                                    int i_43_ = (i_42_ * aS_Sub3_4116.anInt4587 - -i_40_);
                                    for (int i_44_ = i_40_; (i_44_ < i_41_); i_44_++) {
                                        if ((-i_25_ + i_44_ >= -i_24_) && i_24_ >= i_44_ - i_25_ && (bools[i_24_ + (i_44_ + -i_25_)][i_24_ + -i_26_ + i_42_])) {
                                            short[] is = (aS_Sub3_4116.aShortArrayArray8299[i_43_]);
                                            if (is != null) {
                                                if (Stream.c()) {
                                                    for (int i_46_ = 0; (is.length > i_46_); i_46_++) {
                                                        stream.d(is[i_46_] & 0xffff);
                                                        i_39_++;
                                                    }
                                                } else {
                                                    for (int i_45_ = 0; is.length > i_45_; i_45_++) {
                                                        i_39_++;
                                                        stream.a(is[i_45_] & 0xffff);
                                                    }
                                                }
                                            }
                                        }
                                        i_43_++;
                                    }
                                }
                            }
                            stream.a();
                            if (interface5_impl2.method22(-23) && i_39_ > 0) {
                                Class101_Sub2 class101_sub2 = aHa_Sub3_4111.method3820(false);
                                class101_sub2.method932(1.0F, f, f, (byte) -62);
                                class101_sub2.method891(-i_38_, -i_35_, 0);
                                aHa_Sub3_4111.method3853(i ^ ~0x9f, (Class239_Sub18.aClass251_6030));
                                class97.method875(-82, interface5_impl2, i_39_ / 3);
                            }
                        }
                    }
                }
            }
        }
        aHa_Sub3_4111.method3879(-8629);
    }

    public static void method2631(int i) {
        int i_47_ = -46 / ((65 - i) / 61);
        aClass114_4126 = null;
    }

    final void method2632(int i) {
        aClass97ArrayArray4122 = new Class97[anInt4121][anInt4118];
        anInt4125++;
        if (i != 128) method2630(-93, -74, 10, false, null, 48);
        for (int i_48_ = 0; anInt4118 > i_48_; i_48_++) {
            for (int i_49_ = 0; i_49_ < anInt4121; i_49_++) {
                aClass97ArrayArray4122[i_49_][i_48_] = new Class97(aHa_Sub3_4111, this, aS_Sub3_4116, i_49_, i_48_, anInt4124, 128 * i_49_ - -1, 128 * i_48_ + 1);
                if (aClass97ArrayArray4122[i_49_][i_48_].anInt1563 == 0) aClass97ArrayArray4122[i_49_][i_48_] = null;
            }
        }
    }

    final void method2633(int i, int i_50_, r var_r, int i_51_) {
        anInt4120++;
        r_Sub1 var_r_Sub1 = (r_Sub1) var_r;
        i_51_ += var_r_Sub1.anInt10474 + 1;
        i_50_ += 1 + var_r_Sub1.anInt10468;
        if (i != 287) method2634(-49, -3, 16, -9, -115);
        int i_52_ = i_50_ + this.anInt4113 * i_51_;
        int i_53_ = 0;
        int i_54_ = var_r_Sub1.anInt10467;
        int i_55_ = var_r_Sub1.anInt10466;
        int i_56_ = -i_55_ + this.anInt4113;
        if (i_51_ <= 0) {
            int i_57_ = -i_51_ + 1;
            i_52_ += this.anInt4113 * i_57_;
            i_54_ -= i_57_;
            i_53_ += i_57_ * i_55_;
            i_51_ = 1;
        }
        int i_58_ = 0;
        if (anInt4123 <= i_54_ + i_51_) {
            int i_59_ = -anInt4123 + (i_51_ - -i_54_) + 1;
            i_54_ -= i_59_;
        }
        if (i_50_ <= 0) {
            int i_60_ = 1 + -i_50_;
            i_53_ += i_60_;
            i_56_ += i_60_;
            i_58_ += i_60_;
            i_52_ += i_60_;
            i_50_ = 1;
            i_55_ -= i_60_;
        }
        if (i_55_ + i_50_ >= this.anInt4113) {
            int i_61_ = 1 + (i_55_ + (i_50_ + -this.anInt4113));
            i_58_ += i_61_;
            i_55_ -= i_61_;
            i_56_ += i_61_;
        }
        if (i_55_ > 0 && i_54_ > 0) {
            Class99.method880(i_55_, this.aByteArray4112, var_r_Sub1.aByteArray10471, i_53_, i + 13593, i_54_, i_52_, i_56_, i_58_);
            method2634(i_51_, -1, i_50_, i_54_, i_55_);
        }
    }

    private final void method2634(int i, int i_62_, int i_63_, int i_64_, int i_65_) {
        anInt4110++;
        if (aClass97ArrayArray4122 != null) {
            int i_66_ = -1 + i_63_ >> 7;
            int i_67_ = -1 + (i_65_ + i_63_ - 1) >> 7;
            int i_68_ = i + -1 >> 7;
            int i_69_ = i_62_ + (-1 + (i - -i_64_)) >> 7;
            for (int i_70_ = i_66_; i_67_ >= i_70_; i_70_++) {
                Class97[] class97s = aClass97ArrayArray4122[i_70_];
                for (int i_71_ = i_68_; i_69_ >= i_71_; i_71_++) {
                    if (class97s[i_71_] != null) class97s[i_71_].aBoolean1562 = true;
                }
            }
        }
    }

    Class330(ha_Sub3 var_ha_Sub3, s_Sub3 var_s_Sub3) {
        try {
            aHa_Sub3_4111 = var_ha_Sub3;
            aS_Sub3_4116 = var_s_Sub3;
            this.anInt4113 = 2 + ((aS_Sub3_4116.anInt4587 * aS_Sub3_4116.anInt4592) >> aHa_Sub3_4111.anInt8107);
            anInt4123 = (aS_Sub3_4116.anInt4592 * aS_Sub3_4116.anInt4590 >> aHa_Sub3_4111.anInt8107) + 2;
            this.aByteArray4112 = new byte[this.anInt4113 * anInt4123];
            anInt4124 = (-aS_Sub3_4116.anInt4588 + (7 + aHa_Sub3_4111.anInt8107));
            anInt4121 = aS_Sub3_4116.anInt4587 >> anInt4124;
            anInt4118 = aS_Sub3_4116.anInt4590 >> anInt4124;
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("dg.<init>(" + (var_ha_Sub3 != null ? "{...}" : "null") + ',' + (var_s_Sub3 != null ? "{...}" : "null") + ')'));
        }
    }
}
