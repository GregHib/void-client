/* ha_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;

final class ha_Sub1 extends ha {
    private int anInt7465;
    private int anInt7466;
    private Class356 aClass356_7467;
    private Canvas aCanvas7468;
    Class348_Sub31 aClass348_Sub31_7469;
    private boolean aBoolean7470 = false;
    private boolean aBoolean7471 = false;
    private int anInt7472;
    int anInt7473;
    int anInt7474;
    private Class49 aClass49_7475;
    int anInt7476;
    int anInt7477;
    int anInt7478;
    int anInt7479;
    private Class167[] aClass167Array7480;
    private int anInt7481;
    int anInt7482;
    int[] anIntArray7483;
    int anInt7484;
    int anInt7485;
    private int anInt7486;
    private int anInt7487;
    private int anInt7488;
    private boolean aBoolean7489;
    int anInt7490;
    int anInt7491;
    Class101_Sub1 aClass101_Sub1_7492;
    private int anInt7493;
    int anInt7494;
    private int anInt7495;
    int anInt7496;
    int anInt7497;
    private final Class60 aClass60_7498;
    private final Class60 aClass60_7499;
    int anInt7500;
    int anInt7501;
    float[] aFloatArray7502;
    int anInt7503;
    int anInt7504;
    private int anInt7505;
    int anInt7506;
    int anInt7507;
    int anInt7508;
    int anInt7509;
    int anInt7510;
    float[] aFloatArray7511;
    private int anInt7512;
    private Class105 aClass105_7513;

    final boolean method3695() {
        return true;
    }

    final void GA(int i) {
        aa(0, 0, this.anInt7477, anInt7486, i, 0);
    }

    final int[] na(int i, int i_0_, int i_1_, int i_2_) {
        int[] is = new int[i_1_ * i_2_];
        int i_3_ = 0;
        for (int i_4_ = 0; i_4_ < i_2_; i_4_++) {
            int i_5_ = (i_0_ + i_4_) * this.anInt7477 + i;
            for (int i_6_ = 0; i_6_ < i_1_; i_6_++)
                is[i_3_++] = this.anIntArray7483[i_5_ + i_6_];
        }
        return is;
    }

    final void method3628(int i, int i_7_, int i_8_, int i_9_, int i_10_,
                          int i_11_) {
        U(i, i_7_, i_8_, i_10_, i_11_);
        U(i, i_7_ + i_9_ - 1, i_8_, i_10_, i_11_);
        P(i, i_7_ + 1, i_9_ - 2, i_10_, i_11_);
        P(i + i_8_ - 1, i_7_ + 1, i_9_ - 2, i_10_, i_11_);
    }

    final void pa() {
        for (int i = 0; i < aClass167Array7480.length; i++) {
            aClass167Array7480[i].anInt2192
                    = aClass167Array7480[i].anInt2205;
            aClass167Array7480[i].aBoolean2195 = false;
        }
    }

    final void method3703(int i, int i_12_, int i_13_, int i_14_, int i_15_,
                          int i_16_, aa var_aa, int i_17_, int i_18_,
                          int i_19_, int i_20_, int i_21_) {
        aa_Sub3 var_aa_Sub3 = (aa_Sub3) var_aa;
        int[] is = var_aa_Sub3.anIntArray5201;
        int[] is_22_ = var_aa_Sub3.anIntArray5202;
        int i_23_ = (Math.max(this.anInt7476, i_18_));
        int i_24_ = (Math.min(this.anInt7503, i_18_ + is.length));
        i_21_ <<= 8;
        i_19_ <<= 8;
        i_20_ <<= 8;
        int i_25_ = i_19_ + i_20_;
        i_21_ %= i_25_;
        i_13_ -= i;
        i_14_ -= i_12_;
        if (i_13_ + i_14_ < 0) {
            int i_26_
                    = (int) (Math.sqrt(i_13_ * i_13_ + i_14_ * i_14_)
                    * 256.0);
            int i_27_ = i_26_ % i_25_;
            i_21_ = i_25_ + i_19_ - i_21_ - i_27_;
            i_21_ %= i_25_;
            if (i_21_ < 0)
                i_21_ += i_25_;
            i += i_13_;
            i_13_ = -i_13_;
            i_12_ += i_14_;
            i_14_ = -i_14_;
        }
        if (i_13_ > i_14_) {
            i_12_ <<= 16;
            i_12_ += 32768;
            i_14_ <<= 16;
            int i_28_
                    = (int) Math.floor((double) i_14_ / (double) i_13_ + 0.5);
            i_13_ += i;
            int i_29_ = i_15_ >>> 24;
            int i_30_
                    = (int) Math.sqrt(65536
                    + (i_28_ >> 8) * (i_28_ >> 8));
            if (i_16_ == 0 || i_16_ == 1 && i_29_ == 255) {
                while (i <= i_13_) {
                    int i_31_ = i_12_ >> 16;
                    int i_32_ = i_31_ - i_18_;
                    if (i >= this.anInt7496
                            && i < this.anInt7507 && i_31_ >= i_23_
                            && i_31_ < i_24_ && i_21_ < i_19_) {
                        int i_33_ = i_17_ + is[i_32_];
                        if (i >= i_33_ && i < i_33_ + is_22_[i_32_])
                            this.anIntArray7483
                                    [i + i_31_ * this.anInt7477]
                                    = i_15_;
                    }
                    i_12_ += i_28_;
                    i++;
                    i_21_ += i_30_;
                    i_21_ %= i_25_;
                }
                return;
            }
            if (i_16_ == 1) {
                i_15_ = (((i_15_ & 0xff00ff) * i_29_ >> 8 & 0xff00ff)
                        + ((i_15_ & 0xff00) * i_29_ >> 8 & 0xff00)
                        + (i_29_ << 24));
                int i_34_ = 256 - i_29_;
                while (i <= i_13_) {
                    int i_35_ = i_12_ >> 16;
                    int i_36_ = i_35_ - i_18_;
                    if (i >= this.anInt7496
                            && i < this.anInt7507 && i_35_ >= i_23_
                            && i_35_ < i_24_ && i_21_ < i_19_) {
                        int i_37_ = i_17_ + is[i_36_];
                        if (i >= i_37_ && i < i_37_ + is_22_[i_36_]) {
                            int i_38_ = i + i_35_ * this.anInt7477;
                            int i_39_ = this.anIntArray7483[i_38_];
                            i_39_
                                    = (((i_39_ & 0xff00ff) * i_34_ >> 8 & 0xff00ff)
                                    + ((i_39_ & 0xff00) * i_34_ >> 8 & 0xff00));
                            this.anIntArray7483[i_38_]
                                    = i_15_ + i_39_;
                        }
                    }
                    i_12_ += i_28_;
                    i++;
                    i_21_ += i_30_;
                    i_21_ %= i_25_;
                }
                return;
            }
            if (i_16_ == 2) {
                while (i <= i_13_) {
                    int i_40_ = i_12_ >> 16;
                    int i_41_ = i_40_ - i_18_;
                    if (i >= this.anInt7496
                            && i < this.anInt7507 && i_40_ >= i_23_
                            && i_40_ < i_24_ && i_21_ < i_19_) {
                        int i_42_ = i_17_ + is[i_41_];
                        if (i >= i_42_ && i < i_42_ + is_22_[i_41_]) {
                            int i_43_ = i + i_40_ * this.anInt7477;
                            int i_44_ = this.anIntArray7483[i_43_];
                            int i_45_ = i_15_ + i_44_;
                            int i_46_
                                    = (i_15_ & 0xff00ff) + (i_44_ & 0xff00ff);
                            i_44_ = (i_46_ & 0x1000100) + (i_45_ - i_46_
                                    & 0x10000);
                            this.anIntArray7483[i_43_]
                                    = i_45_ - i_44_ | i_44_ - (i_44_ >>> 8);
                        }
                    }
                    i_12_ += i_28_;
                    i++;
                    i_21_ += i_30_;
                    i_21_ %= i_25_;
                }
                return;
            }
            throw new IllegalArgumentException();
        }
        i <<= 16;
        i += 32768;
        i_13_ <<= 16;
        int i_47_ = (int) Math.floor((double) i_13_ / (double) i_14_ + 0.5);
        int i_48_
                = (int) Math.sqrt(65536 + (i_47_ >> 8) * (i_47_ >> 8));
        i_14_ += i_12_;
        int i_49_ = i_15_ >>> 24;
        if (i_16_ == 0 || i_16_ == 1 && i_49_ == 255) {
            while (i_12_ <= i_14_) {
                int i_50_ = i >> 16;
                int i_51_ = i_12_ - i_18_;
                if (i_12_ >= i_23_ && i_12_ < i_24_
                        && i_50_ >= this.anInt7496
                        && i_50_ < this.anInt7507 && i_21_ < i_19_
                        && i_50_ >= i_17_ + is[i_51_]
                        && i_50_ < i_17_ + is[i_51_] + is_22_[i_51_])
                    this.anIntArray7483
                            [i_50_ + i_12_ * this.anInt7477]
                            = i_15_;
                i += i_47_;
                i_12_++;
                i_21_ += i_48_;
                i_21_ %= i_25_;
            }
        } else if (i_16_ == 1) {
            i_15_
                    = (((i_15_ & 0xff00ff) * i_49_ >> 8 & 0xff00ff)
                    + ((i_15_ & 0xff00) * i_49_ >> 8 & 0xff00) + (i_49_ << 24));
            int i_52_ = 256 - i_49_;
            while (i_12_ <= i_14_) {
                int i_53_ = i >> 16;
                int i_54_ = i_12_ - i_18_;
                if (i_12_ >= i_23_ && i_12_ < i_24_
                        && i_53_ >= this.anInt7496
                        && i_53_ < this.anInt7507 && i_21_ < i_19_
                        && i_53_ >= i_17_ + is[i_54_]
                        && i_53_ < i_17_ + is[i_54_] + is_22_[i_54_]) {
                    int i_55_ = i_53_ + i_12_ * this.anInt7477;
                    int i_56_ = this.anIntArray7483[i_55_];
                    i_56_ = (((i_56_ & 0xff00ff) * i_52_ >> 8 & 0xff00ff)
                            + ((i_56_ & 0xff00) * i_52_ >> 8 & 0xff00));
                    this.anIntArray7483
                            [i_53_ + i_12_ * this.anInt7477]
                            = i_15_ + i_56_;
                }
                i += i_47_;
                i_12_++;
                i_21_ += i_48_;
                i_21_ %= i_25_;
            }
        } else if (i_16_ == 2) {
            while (i_12_ <= i_14_) {
                int i_57_ = i >> 16;
                int i_58_ = i_12_ - i_18_;
                if (i_12_ >= i_23_ && i_12_ < i_24_
                        && i_57_ >= this.anInt7496
                        && i_57_ < this.anInt7507 && i_21_ < i_19_
                        && i_57_ >= i_17_ + is[i_58_]
                        && i_57_ < i_17_ + is[i_58_] + is_22_[i_58_]) {
                    int i_59_ = i_57_ + i_12_ * this.anInt7477;
                    int i_60_ = this.anIntArray7483[i_59_];
                    int i_61_ = i_15_ + i_60_;
                    int i_62_ = (i_15_ & 0xff00ff) + (i_60_ & 0xff00ff);
                    i_60_ = (i_62_ & 0x1000100) + (i_61_ - i_62_ & 0x10000);
                    this.anIntArray7483[i_59_]
                            = i_61_ - i_60_ | i_60_ - (i_60_ >>> 8);
                }
                i += i_47_;
                i_12_++;
                i_21_ += i_48_;
                i_21_ %= i_25_;
            }
        } else
            throw new IllegalArgumentException();
    }

    final aa method3661(int i, int i_63_, int[] is, int[] is_64_) {
        return new aa_Sub3(i, i_63_, is, is_64_);
    }

    final void method3685(Class98 class98, int i) {
        Class167 class167 = method3724(Thread.currentThread());
        Class318_Sub9 class318_sub9
                = (class98.aClass88_1569
                .aClass318_Sub9_1503);
        for (Class318_Sub9 class318_sub9_65_
             = class318_sub9.aClass318_Sub9_6469;
             class318_sub9_65_ != class318_sub9;
             class318_sub9_65_
                     = class318_sub9_65_.aClass318_Sub9_6469) {
            Class318_Sub9_Sub2 class318_sub9_sub2
                    = (Class318_Sub9_Sub2) class318_sub9_65_;
            int i_66_
                    = class318_sub9_sub2.anInt8791 >> 12;
            int i_67_
                    = class318_sub9_sub2.anInt8796 >> 12;
            int i_68_
                    = class318_sub9_sub2.anInt8789 >> 12;
            float f
                    = ((this.aClass101_Sub1_7492
                    .aFloat5681)
                    + ((this.aClass101_Sub1_7492
                    .aFloat5662) * (float) i_66_
                    + (this.aClass101_Sub1_7492
                    .aFloat5680) * (float) i_67_
                    + (this.aClass101_Sub1_7492
                    .aFloat5664) * (float) i_68_));
            if (!(f < (float) this.anInt7482)
                    && !(f > (float) class167.anInt2210)) {
                int i_69_
                        = (this.anInt7510
                        + (int) ((float) this.anInt7491
                        * ((this.aClass101_Sub1_7492
                        .aFloat5686)
                        + ((this.aClass101_Sub1_7492
                        .aFloat5672) * (float) i_66_
                        + (this.aClass101_Sub1_7492
                        .aFloat5673) * (float) i_67_
                        + (this.aClass101_Sub1_7492
                        .aFloat5669) * (float) i_68_))
                        / (float) i));
                int i_70_
                        = (this.anInt7504
                        + (int) ((float) this.anInt7497
                        * ((this.aClass101_Sub1_7492
                        .aFloat5685)
                        + ((this.aClass101_Sub1_7492
                        .aFloat5655) * (float) i_66_
                        + (this.aClass101_Sub1_7492
                        .aFloat5678) * (float) i_67_
                        + (this.aClass101_Sub1_7492
                        .aFloat5666) * (float) i_68_))
                        / (float) i));
                if (i_69_ >= this.anInt7496
                        && i_69_ <= this.anInt7507
                        && i_70_ >= this.anInt7476
                        && i_70_ <= this.anInt7503) {
                    if (f == 0.0F)
                        f = 1.0F;
                    method3712(class318_sub9_sub2, i_69_, i_70_, (int) f,
                            ((class318_sub9_sub2
                                    .anInt8793) * this.anInt7491
                                    >> 12) / i);
                }
            }
        }
    }

    final void method3642(int i, Class348_Sub1[] class348_sub1s) {
        /* empty */
    }

    final boolean method3693() {
        return false;
    }

    final void method3710() {
        /* empty */
    }

    final void P(int i, int i_71_, int i_72_, int i_73_, int i_74_) {
        if (i >= this.anInt7496
                && i < this.anInt7507) {
            if (i_71_ < this.anInt7476) {
                i_72_ -= this.anInt7476 - i_71_;
                i_71_ = this.anInt7476;
            }
            if (i_71_ + i_72_ > this.anInt7503)
                i_72_ = this.anInt7503 - i_71_;
            int i_75_ = i + i_71_ * this.anInt7477;
            int i_76_ = i_73_ >>> 24;
            if (i_74_ == 0 || i_74_ == 1 && i_76_ == 255) {
                for (int i_77_ = 0; i_77_ < i_72_; i_77_++)
                    this.anIntArray7483
                            [i_75_ + i_77_ * this.anInt7477]
                            = i_73_;
            } else if (i_74_ == 1) {
                i_73_ = (((i_73_ & 0xff00ff) * i_76_ >> 8 & 0xff00ff)
                        + ((i_73_ & 0xff00) * i_76_ >> 8 & 0xff00)
                        + (i_76_ << 24));
                int i_78_ = 256 - i_76_;
                for (int i_79_ = 0; i_79_ < i_72_; i_79_++) {
                    int i_80_ = i_75_ + i_79_ * this.anInt7477;
                    int i_81_ = this.anIntArray7483[i_80_];
                    i_81_ = (((i_81_ & 0xff00ff) * i_78_ >> 8 & 0xff00ff)
                            + ((i_81_ & 0xff00) * i_78_ >> 8 & 0xff00));
                    this.anIntArray7483[i_80_] = i_73_ + i_81_;
                }
            } else if (i_74_ == 2) {
                for (int i_82_ = 0; i_82_ < i_72_; i_82_++) {
                    int i_83_ = i_75_ + i_82_ * this.anInt7477;
                    int i_84_ = this.anIntArray7483[i_83_];
                    int i_85_ = i_73_ + i_84_;
                    int i_86_ = (i_73_ & 0xff00ff) + (i_84_ & 0xff00ff);
                    i_84_ = (i_86_ & 0x1000100) + (i_85_ - i_86_ & 0x10000);
                    this.anIntArray7483[i_83_]
                            = i_85_ - i_84_ | i_84_ - (i_84_ >>> 8);
                }
            } else
                throw new IllegalArgumentException();
        }
    }

    final void method3647(boolean bool) {
        /* empty */
    }

    final void xa(float f) {
        this.anInt7500 = (int) (f * 65535.0F);
    }

    final void ra(int i, int i_87_, int i_88_, int i_89_) {
        for (int i_90_ = 0; i_90_ < aClass167Array7480.length; i_90_++) {
            aClass167Array7480[i_90_].anInt2205
                    = aClass167Array7480[i_90_].anInt2192;
            aClass167Array7480[i_90_].anInt2211 = i;
            aClass167Array7480[i_90_].anInt2192 = i_87_;
            aClass167Array7480[i_90_].anInt2197 = i_88_;
            aClass167Array7480[i_90_].aBoolean2195 = true;
        }
    }

    final void method3651(za var_za) {
        /* empty */
    }

    private final void method3712(Class318_Sub9_Sub2 class318_sub9_sub2, int i,
                                  int i_91_, int i_92_, int i_93_) {
        int i_94_ = class318_sub9_sub2.anInt8792;
        int i_95_ = i_93_;
        i_93_ <<= 1;
        if (i_94_ == -1)
            method3723(i, i_91_, i_92_, i_95_,
                    class318_sub9_sub2.anInt8790, 1);
        else {
            if (anInt7512 != i_94_) {
                Class105 class105
                        = (Class105) aClass60_7499.method583(i_94_, 117);
                if (class105 == null) {
                    int[] is = method3719(i_94_);
                    if (is != null) {
                        int i_96_ = (method3727(i_94_) ? 64
                                : this.anInt7501);
                        class105 = this.method3662(i_96_, is, (byte) 94, 0,
                                i_96_, i_96_);
                        aClass60_7499.method582(class105, i_94_,
                                (byte) -121);
                    } else
                        return;
                }
                anInt7512 = i_94_;
                aClass105_7513 = class105;
            }
            i_93_++;
            ((Class105_Sub3) aClass105_7513).method996
                    (i - i_95_, i_91_ - i_95_, i_92_, i_93_, i_93_, 0,
                            class318_sub9_sub2.anInt8790, 1, 1);
        }
    }

    private final void method3713() {
        this.anInt7509
                = this.anInt7496 - this.anInt7510;
        this.anInt7508
                = this.anInt7507 - this.anInt7510;
        this.anInt7490
                = this.anInt7476 - this.anInt7504;
        this.anInt7506
                = this.anInt7503 - this.anInt7504;
        for (int i = 0; i < this.anInt7485; i++) {
            Class109 class109
                    = aClass167Array7480[i].aClass109_2220;
            class109.anInt1665
                    = this.anInt7510 - this.anInt7496;
            class109.anInt1668
                    = this.anInt7504 - this.anInt7476;
            class109.anInt1679
                    = this.anInt7507 - this.anInt7496;
            class109.anInt1672
                    = this.anInt7503 - this.anInt7476;
        }
        int i = (this.anInt7476 * this.anInt7477
                + this.anInt7496);
        for (int i_97_ = this.anInt7476;
             i_97_ < this.anInt7503; i_97_++) {
            for (int i_98_ = 0; i_98_ < this.anInt7485; i_98_++)
                aClass167Array7480[i_98_].aClass109_2220
                        .anIntArray1676[i_97_ - this.anInt7476]
                        = i;
            i += this.anInt7477;
        }
    }

    final int i() {
        return this.anInt7482;
    }

    final Class101 method3705() {
        Class167 class167 = method3724(Thread.currentThread());
        return class167.aClass101_Sub1_2209;
    }

    final boolean method3714(int i) {
        return this.aD4579.method3(i, -6662).aBoolean217
                || this.aD4579.method3(i, -6662).aBoolean215;
    }

    final void Q(int i, int i_99_, int i_100_, int i_101_, int i_102_,
                 int i_103_, byte[] is, int i_104_, int i_105_) {
        if (i_100_ > 0 && i_101_ > 0) {
            int i_106_ = 0;
            int i_107_ = 0;
            int i_108_ = (i_104_ << 16) / i_100_;
            int i_109_ = (is.length / i_104_ << 16) / i_101_;
            int i_110_ = i + i_99_ * this.anInt7477;
            int i_111_ = this.anInt7477 - i_100_;
            if (i_99_ + i_101_ > this.anInt7503)
                i_101_ -= i_99_ + i_101_ - this.anInt7503;
            if (i_99_ < this.anInt7476) {
                int i_112_ = this.anInt7476 - i_99_;
                i_101_ -= i_112_;
                i_110_ += i_112_ * this.anInt7477;
                i_107_ += i_109_ * i_112_;
            }
            if (i + i_100_ > this.anInt7507) {
                int i_113_ = i + i_100_ - this.anInt7507;
                i_100_ -= i_113_;
                i_111_ += i_113_;
            }
            if (i < this.anInt7496) {
                int i_114_ = this.anInt7496 - i;
                i_100_ -= i_114_;
                i_110_ += i_114_;
                i_106_ += i_108_ * i_114_;
                i_111_ += i_114_;
            }
            int i_115_ = i_102_ >>> 24;
            int i_116_ = i_103_ >>> 24;
            if (i_105_ == 0 || i_105_ == 1 && i_115_ == 255 && i_116_ == 255) {
                int i_117_ = i_106_;
                for (int i_118_ = -i_101_; i_118_ < 0; i_118_++) {
                    int i_119_ = (i_107_ >> 16) * i_104_;
                    for (int i_120_ = -i_100_; i_120_ < 0; i_120_++) {
                        if (is[(i_106_ >> 16) + i_119_] != 0)
                            this.anIntArray7483[i_110_++] = i_103_;
                        else
                            this.anIntArray7483[i_110_++] = i_102_;
                        i_106_ += i_108_;
                    }
                    i_107_ += i_109_;
                    i_106_ = i_117_;
                    i_110_ += i_111_;
                }
            } else if (i_105_ == 1) {
                int i_121_ = i_106_;
                for (int i_122_ = -i_101_; i_122_ < 0; i_122_++) {
                    int i_123_ = (i_107_ >> 16) * i_104_;
                    for (int i_124_ = -i_100_; i_124_ < 0; i_124_++) {
                        int i_125_ = i_102_;
                        if (is[(i_106_ >> 16) + i_123_] != 0)
                            i_125_ = i_103_;
                        int i_126_ = i_125_ >>> 24;
                        int i_127_ = 255 - i_126_;
                        int i_128_ = this.anIntArray7483[i_110_];
                        this.anIntArray7483[i_110_++]
                                = ((((i_125_ & 0xff00ff) * i_126_
                                + (i_128_ & 0xff00ff) * i_127_)
                                & ~0xff00ff)
                                + (((i_125_ & 0xff00) * i_126_
                                + (i_128_ & 0xff00) * i_127_)
                                & 0xff0000)) >> 8;
                        i_106_ += i_108_;
                    }
                    i_107_ += i_109_;
                    i_106_ = i_121_;
                    i_110_ += i_111_;
                }
            } else if (i_105_ == 2) {
                int i_129_ = i_106_;
                for (int i_130_ = -i_101_; i_130_ < 0; i_130_++) {
                    int i_131_ = (i_107_ >> 16) * i_104_;
                    for (int i_132_ = -i_100_; i_132_ < 0; i_132_++) {
                        int i_133_ = i_102_;
                        if (is[(i_106_ >> 16) + i_131_] != 0)
                            i_133_ = i_103_;
                        if (i_133_ != 0) {
                            int i_134_
                                    = this.anIntArray7483[i_110_];
                            int i_135_ = i_133_ + i_134_;
                            int i_136_
                                    = (i_133_ & 0xff00ff) + (i_134_ & 0xff00ff);
                            i_134_ = (i_136_ & 0x1000100) + (i_135_ - i_136_
                                    & 0x10000);
                            this.anIntArray7483[i_110_++]
                                    = i_135_ - i_134_ | i_134_ - (i_134_ >>> 8);
                        } else
                            i_110_++;
                        i_106_ += i_108_;
                    }
                    i_107_ += i_109_;
                    i_106_ = i_129_;
                    i_110_ += i_111_;
                }
            } else
                throw new IllegalArgumentException();
        }
    }

    final boolean method3655() {
        return false;
    }

    final Class299 method3697(int i, int i_137_, int i_138_, int i_139_,
                              int i_140_, int i_141_) {
        return null;
    }

    final void KA(int i, int i_142_, int i_143_, int i_144_) {
        if (i < 0)
            i = 0;
        if (i_142_ < 0)
            i_142_ = 0;
        if (i_143_ > this.anInt7477)
            i_143_ = this.anInt7477;
        if (i_144_ > anInt7486)
            i_144_ = anInt7486;
        this.anInt7496 = i;
        this.anInt7507 = i_143_;
        this.anInt7476 = i_142_;
        this.anInt7503 = i_144_;
        method3713();
    }

    final void method3698() {
        /* empty */
    }

    final void method3638(Class101 class101) {
        this.aClass101_Sub1_7492 = (Class101_Sub1) class101;
    }

    final void A(int i, aa var_aa, int i_145_, int i_146_) {
        aa_Sub3 var_aa_Sub3 = (aa_Sub3) var_aa;
        int[] is = var_aa_Sub3.anIntArray5201;
        int[] is_147_ = var_aa_Sub3.anIntArray5202;
        int i_148_;
        if (this.anInt7503 < i_146_ + is.length)
            i_148_ = this.anInt7503 - i_146_;
        else
            i_148_ = is.length;
        int i_149_;
        if (this.anInt7476 > i_146_) {
            i_149_ = this.anInt7476 - i_146_;
            i_146_ = this.anInt7476;
        } else
            i_149_ = 0;
        if (i_148_ - i_149_ > 0) {
            int i_150_ = i_146_ * this.anInt7477;
            for (int i_151_ = i_149_; i_151_ < i_148_; i_151_++) {
                int i_152_ = i_145_ + is[i_151_];
                int i_153_ = is_147_[i_151_];
                if (this.anInt7496 > i_152_) {
                    i_153_ -= this.anInt7496 - i_152_;
                    i_152_ = this.anInt7496;
                }
                if (this.anInt7507 < i_152_ + i_153_)
                    i_153_ = this.anInt7507 - i_152_;
                i_152_ += i_150_;
                for (int i_154_ = -i_153_; i_154_ < 0; i_154_++)
                    this.anIntArray7483[i_152_++] = i;
                i_150_ += this.anInt7477;
            }
        }
    }

    final int method3667(int i, int i_155_) {
        i |= 0x20800;
        return i & i_155_ ^ i_155_;
    }

    final void f(int i, int i_156_) {
        Class167 class167 = method3724(Thread.currentThread());
        this.anInt7482 = i;
        this.anInt7494 = i_156_;
        class167.anInt2210 = this.anInt7494 - 255;
    }

    private final void method3715(int i, int i_157_, int i_158_, int i_159_,
                                  int i_160_, int i_161_, int i_162_,
                                  int i_163_) {
        if (i_157_ >= this.anInt7476
                && i_157_ < this.anInt7503) {
            int i_164_ = i + i_157_ * this.anInt7477;
            int i_165_ = i_159_ >>> 24;
            int i_166_ = i_161_ + i_162_;
            int i_167_ = i_163_ % i_166_;
            if (i_160_ == 0 || i_160_ == 1 && i_165_ == 255) {
                int i_168_ = 0;
                while (i_168_ < i_158_) {
                    if (i + i_168_ >= this.anInt7496
                            && i + i_168_ < this.anInt7507
                            && i_167_ < i_161_)
                        this.anIntArray7483[i_164_ + i_168_]
                                = i_159_;
                    i_168_++;
                    i_167_ = ++i_167_ % i_166_;
                }
            } else if (i_160_ == 1) {
                i_159_ = (((i_159_ & 0xff00ff) * i_165_ >> 8 & 0xff00ff)
                        + ((i_159_ & 0xff00) * i_165_ >> 8 & 0xff00)
                        + (i_165_ << 24));
                int i_169_ = 256 - i_165_;
                int i_170_ = 0;
                while (i_170_ < i_158_) {
                    if (i + i_170_ >= this.anInt7496
                            && i + i_170_ < this.anInt7507
                            && i_167_ < i_161_) {
                        int i_171_
                                = this.anIntArray7483[i_164_ + i_170_];
                        i_171_
                                = (((i_171_ & 0xff00ff) * i_169_ >> 8 & 0xff00ff)
                                + ((i_171_ & 0xff00) * i_169_ >> 8 & 0xff00));
                        this.anIntArray7483[i_164_ + i_170_]
                                = i_159_ + i_171_;
                    }
                    i_170_++;
                    i_167_ = ++i_167_ % i_166_;
                }
            } else if (i_160_ == 2) {
                int i_172_ = 0;
                while (i_172_ < i_158_) {
                    if (i + i_172_ >= this.anInt7496
                            && i + i_172_ < this.anInt7507
                            && i_167_ < i_161_) {
                        int i_173_
                                = this.anIntArray7483[i_164_ + i_172_];
                        int i_174_ = i_159_ + i_173_;
                        int i_175_ = (i_159_ & 0xff00ff) + (i_173_ & 0xff00ff);
                        i_173_ = (i_175_ & 0x1000100) + (i_174_ - i_175_
                                & 0x10000);
                        this.anIntArray7483[i_164_ + i_172_]
                                = i_174_ - i_173_ | i_173_ - (i_173_ >>> 8);
                    }
                    i_172_++;
                    i_167_ = ++i_167_ % i_166_;
                }
            } else
                throw new IllegalArgumentException();
        }
    }

    final int[] Y() {
        return (new int[]
                {this.anInt7510, this.anInt7504,
                        this.anInt7491, this.anInt7497});
    }

    final void ya() {
        if (this.anInt7496 == 0
                && this.anInt7507 == this.anInt7477
                && this.anInt7476 == 0
                && this.anInt7503 == anInt7486) {
            int i = this.aFloatArray7511.length;
            int i_176_ = i - (i & 0x7);
            int i_177_ = 0;
            while (i_177_ < i_176_) {
                this.aFloatArray7511[i_177_++] = 2.14748365E9F;
                this.aFloatArray7511[i_177_++] = 2.14748365E9F;
                this.aFloatArray7511[i_177_++] = 2.14748365E9F;
                this.aFloatArray7511[i_177_++] = 2.14748365E9F;
                this.aFloatArray7511[i_177_++] = 2.14748365E9F;
                this.aFloatArray7511[i_177_++] = 2.14748365E9F;
                this.aFloatArray7511[i_177_++] = 2.14748365E9F;
                this.aFloatArray7511[i_177_++] = 2.14748365E9F;
            }
            while (i_177_ < i)
                this.aFloatArray7511[i_177_++] = 2.14748365E9F;
        } else {
            int i = this.anInt7507 - this.anInt7496;
            int i_178_
                    = this.anInt7503 - this.anInt7476;
            int i_179_ = this.anInt7477 - i;
            int i_180_
                    = (this.anInt7496
                    + this.anInt7476 * this.anInt7477);
            int i_181_ = i >> 3;
            int i_182_ = i & 0x7;
            i = i_180_ - 1;
            for (int i_183_ = -i_178_; i_183_ < 0; i_183_++) {
                if (i_181_ > 0) {
                    int i_184_ = i_181_;
                    do {
                        this.aFloatArray7511[++i] = 2.14748365E9F;
                        this.aFloatArray7511[++i] = 2.14748365E9F;
                        this.aFloatArray7511[++i] = 2.14748365E9F;
                        this.aFloatArray7511[++i] = 2.14748365E9F;
                        this.aFloatArray7511[++i] = 2.14748365E9F;
                        this.aFloatArray7511[++i] = 2.14748365E9F;
                        this.aFloatArray7511[++i] = 2.14748365E9F;
                        this.aFloatArray7511[++i] = 2.14748365E9F;
                    } while (--i_184_ > 0);
                }
                if (i_182_ > 0) {
                    int i_185_ = i_182_;
                    do
                        this.aFloatArray7511[++i] = 2.14748365E9F;
                    while (--i_185_ > 0);
                }
                i += i_179_;
            }
        }
    }

    final boolean method3639() {
        return true;
    }

    final void U(int i, int i_186_, int i_187_, int i_188_, int i_189_) {
        if (i_186_ >= this.anInt7476
                && i_186_ < this.anInt7503) {
            if (i < this.anInt7496) {
                i_187_ -= this.anInt7496 - i;
                i = this.anInt7496;
            }
            if (i + i_187_ > this.anInt7507)
                i_187_ = this.anInt7507 - i;
            int i_190_ = i + i_186_ * this.anInt7477;
            int i_191_ = i_188_ >>> 24;
            if (i_189_ == 0 || i_189_ == 1 && i_191_ == 255) {
                for (int i_192_ = 0; i_192_ < i_187_; i_192_++)
                    this.anIntArray7483[i_190_ + i_192_] = i_188_;
            } else if (i_189_ == 1) {
                i_188_ = (((i_188_ & 0xff00ff) * i_191_ >> 8 & 0xff00ff)
                        + ((i_188_ & 0xff00) * i_191_ >> 8 & 0xff00)
                        + (i_191_ << 24));
                int i_193_ = 256 - i_191_;
                for (int i_194_ = 0; i_194_ < i_187_; i_194_++) {
                    int i_195_
                            = this.anIntArray7483[i_190_ + i_194_];
                    i_195_ = (((i_195_ & 0xff00ff) * i_193_ >> 8 & 0xff00ff)
                            + ((i_195_ & 0xff00) * i_193_ >> 8 & 0xff00));
                    this.anIntArray7483[i_190_ + i_194_]
                            = i_188_ + i_195_;
                }
            } else if (i_189_ == 2) {
                for (int i_196_ = 0; i_196_ < i_187_; i_196_++) {
                    int i_197_
                            = this.anIntArray7483[i_190_ + i_196_];
                    int i_198_ = i_188_ + i_197_;
                    int i_199_ = (i_188_ & 0xff00ff) + (i_197_ & 0xff00ff);
                    i_197_
                            = (i_199_ & 0x1000100) + (i_198_ - i_199_ & 0x10000);
                    this.anIntArray7483[i_190_ + i_196_]
                            = i_198_ - i_197_ | i_197_ - (i_197_ >>> 8);
                }
            } else
                throw new IllegalArgumentException();
        }
    }

    final void HA(int i, int i_200_, int i_201_, int i_202_, int[] is) {
        float f = ((this.aClass101_Sub1_7492
                .aFloat5681)
                + ((this.aClass101_Sub1_7492
                .aFloat5662) * (float) i
                + (this.aClass101_Sub1_7492
                .aFloat5680) * (float) i_200_
                + (this.aClass101_Sub1_7492
                .aFloat5664) * (float) i_201_));
        if (f >= (float) this.anInt7482 && f <= (float) this.anInt7494) {
            int i_203_
                    = (int) ((float) this.anInt7491
                    * (this.aClass101_Sub1_7492.aFloat5686
                    + ((this.aClass101_Sub1_7492
                    .aFloat5672) * (float) i
                    + (this.aClass101_Sub1_7492
                    .aFloat5673) * (float) i_200_
                    + (this.aClass101_Sub1_7492
                    .aFloat5669) * (float) i_201_))
                    / (float) i_202_);
            int i_204_
                    = (int) ((float) this.anInt7497
                    * (this.aClass101_Sub1_7492.aFloat5685
                    + ((this.aClass101_Sub1_7492
                    .aFloat5655) * (float) i
                    + (this.aClass101_Sub1_7492
                    .aFloat5678) * (float) i_200_
                    + (this.aClass101_Sub1_7492
                    .aFloat5666) * (float) i_201_))
                    / (float) i_202_);
            if (i_203_ >= this.anInt7509
                    && i_203_ <= this.anInt7508
                    && i_204_ >= this.anInt7490
                    && i_204_ <= this.anInt7506) {
                is[0] = i_203_ - this.anInt7509;
                is[1] = i_204_ - this.anInt7490;
                is[2] = (int) f;
            } else
                is[0] = is[1] = is[2] = -1;
        } else is[0] = is[1] = is[2] = -1;
    }

    final boolean method3716() {
        return aBoolean7470;
    }

    final void method3658(int i, int i_205_, int i_206_, int i_207_) {
        /* empty */
    }

    final void method3684(Class98 class98) {
        Class167 class167 = method3724(Thread.currentThread());
        Class318_Sub9 class318_sub9
                = (class98.aClass88_1569
                .aClass318_Sub9_1503);
        for (Class318_Sub9 class318_sub9_208_
             = class318_sub9.aClass318_Sub9_6469;
             class318_sub9_208_ != class318_sub9;
             class318_sub9_208_
                     = class318_sub9_208_.aClass318_Sub9_6469) {
            Class318_Sub9_Sub2 class318_sub9_sub2
                    = (Class318_Sub9_Sub2) class318_sub9_208_;
            int i = class318_sub9_sub2.anInt8791 >> 12;
            int i_209_
                    = class318_sub9_sub2.anInt8796 >> 12;
            int i_210_
                    = class318_sub9_sub2.anInt8789 >> 12;
            float f
                    = ((this.aClass101_Sub1_7492
                    .aFloat5681)
                    + ((this.aClass101_Sub1_7492
                    .aFloat5662) * (float) i
                    + (this.aClass101_Sub1_7492
                    .aFloat5680) * (float) i_209_
                    + (this.aClass101_Sub1_7492
                    .aFloat5664) * (float) i_210_));
            if (!(f < (float) this.anInt7482)
                    && !(f > (float) class167.anInt2210)) {
                int i_211_
                        = (this.anInt7510
                        + (int) ((float) this.anInt7491
                        * ((this.aClass101_Sub1_7492
                        .aFloat5686)
                        + ((this.aClass101_Sub1_7492
                        .aFloat5672) * (float) i
                        + (this.aClass101_Sub1_7492
                        .aFloat5673) * (float) i_209_
                        + (this.aClass101_Sub1_7492
                        .aFloat5669) * (float) i_210_))
                        / f));
                int i_212_
                        = (this.anInt7504
                        + (int) ((float) this.anInt7497
                        * ((this.aClass101_Sub1_7492
                        .aFloat5685)
                        + ((this.aClass101_Sub1_7492
                        .aFloat5655) * (float) i
                        + (this.aClass101_Sub1_7492
                        .aFloat5678) * (float) i_209_
                        + (this.aClass101_Sub1_7492
                        .aFloat5666) * (float) i_210_))
                        / f));
                if (i_211_ >= this.anInt7496
                        && i_211_ <= this.anInt7507
                        && i_212_ >= this.anInt7476
                        && i_212_ <= this.anInt7503) {
                    if (f == 0.0F)
                        f = 1.0F;
                    method3712(class318_sub9_sub2, i_211_, i_212_, (int) f,
                            (int) ((float) ((class318_sub9_sub2.anInt8793
                                    * this.anInt7491)
                                    >> 12)
                                    / f));
                }
            }
        }
    }

    final void method3700(float f, float f_213_, float f_214_) {
        /* empty */
    }

    final Class105 method3683(int i, int i_215_, int i_216_, int i_217_,
                              boolean bool) {
        int[] is = new int[i_216_ * i_217_];
        int i_218_ = i_215_ * this.anInt7477 + i;
        int i_219_ = this.anInt7477 - i_216_;
        for (int i_220_ = 0; i_220_ < i_217_; i_220_++) {
            int i_221_ = i_220_ * i_216_;
            for (int i_222_ = 0; i_222_ < i_216_; i_222_++)
                is[i_221_ + i_222_]
                        = this.anIntArray7483[i_218_++];
            i_218_ += i_219_;
        }
        if (bool)
            return new Class105_Sub3_Sub3(this, is, i_216_, i_217_);
        return new Class105_Sub3_Sub1(this, is, i_216_, i_217_);
    }

    private final void method3717() {
        for (int i = 0; i < this.anInt7485; i++)
            aClass167Array7480[i].method1292(64);
        la();
    }

    final boolean method3682() {
        return false;
    }

    final boolean method3670() {
        return false;
    }

    final void DA(int i, int i_223_, int i_224_, int i_225_) {
        this.anInt7510 = i;
        this.anInt7504 = i_223_;
        this.anInt7491 = i_224_;
        this.anInt7497 = i_225_;
        method3713();
    }

    final void method3701(Canvas canvas) {
        if (aCanvas7468 == canvas)
            method3677(null);
        Class348_Sub31 class348_sub31
                = ((Class348_Sub31)
                aClass356_7467.method3480(canvas.hashCode(), -6008));
        if (class348_sub31 != null)
            class348_sub31.method2715((byte) 100);
    }

    final void L(int i, int i_226_, int i_227_) {
        for (int i_228_ = 0; i_228_ < aClass167Array7480.length; i_228_++) {
            Class167 class167 = aClass167Array7480[i_228_];
            class167.anInt2192 = i & 0xffffff;
            int i_229_ = class167.anInt2192 >>> 16 & 0xff;
            if (i_229_ < 2)
                i_229_ = 2;
            int i_230_ = class167.anInt2192 >> 8 & 0xff;
            if (i_230_ < 2)
                i_230_ = 2;
            int i_231_ = class167.anInt2192 & 0xff;
            if (i_231_ < 2)
                i_231_ = 2;
            class167.anInt2192
                    = i_229_ << 16 | i_230_ << 8 | i_231_;
            class167.aBoolean2201 = i_226_ >= 0;
        }
    }

    final boolean method3627() {
        return false;
    }

    final void method3643(Canvas canvas, int i, int i_232_) {
        Class348_Sub31 class348_sub31
                = ((Class348_Sub31)
                aClass356_7467.method3480(canvas.hashCode(), -6008));
        if (class348_sub31 == null) {
            class348_sub31 = Class110.method1035(9029, i_232_, canvas, i);
            aClass356_7467.method3483((byte) 21, canvas.hashCode(),
                    class348_sub31);
        } else if (class348_sub31.anInt6917 != i
                || class348_sub31.anInt6920 != i_232_)
            method3669(canvas, i, i_232_);
    }

    final void b(int i, int i_233_, int i_234_, int i_235_, double d) {
        int i_236_ = anInt7495 - i_234_;
        int i_237_ = i_233_ * anInt7495 + i;
        float[] fs = this.aFloatArray7511;
        int i_238_ = 0;
        while (i_238_ < i_235_) {
            int i_239_ = 0;
            while (i_239_ < i_234_) {
                float f = fs[i_237_];
                if (f != 2.14748365E9F)
                    fs[i_237_] = (float) ((double) f + d);
                i_239_++;
                i_237_++;
            }
            i_238_++;
            i_237_ += i_236_;
        }
    }

    final void method3633() {
        /* empty */
    }

    final void method3631(int i) {
        this.anInt7485 = i;
        aClass167Array7480 = new Class167[this.anInt7485];
        for (int i_240_ = 0; i_240_ < this.anInt7485; i_240_++)
            aClass167Array7480[i_240_] = new Class167(this);
    }

    final void method3709(int i, int i_241_, int i_242_, int i_243_,
                          int i_244_, int i_245_) {
        i_242_ -= i;
        i_243_ -= i_241_;
        if (i_243_ == 0) {
            if (i_242_ >= 0)
                U(i, i_241_, i_242_ + 1, i_244_, i_245_);
            else
                U(i + i_242_, i_241_, -i_242_ + 1, i_244_, i_245_);
        } else if (i_242_ == 0) {
            if (i_243_ >= 0)
                P(i, i_241_, i_243_ + 1, i_244_, i_245_);
            else
                P(i, i_241_ + i_243_, -i_243_ + 1, i_244_, i_245_);
        } else {
            if (i_242_ + i_243_ < 0) {
                i += i_242_;
                i_242_ = -i_242_;
                i_241_ += i_243_;
                i_243_ = -i_243_;
            }
            if (i_242_ > i_243_) {
                i_241_ <<= 16;
                i_241_ += 32768;
                i_243_ <<= 16;
                int i_246_ = (int) Math.floor((double) i_243_ / (double) i_242_
                        + 0.5);
                i_242_ += i;
                if (i < this.anInt7496) {
                    i_241_ += i_246_ * (this.anInt7496 - i);
                    i = this.anInt7496;
                }
                if (i_242_ >= this.anInt7507)
                    i_242_ = this.anInt7507 - 1;
                int i_247_ = i_244_ >>> 24;
                if (i_245_ == 0 || i_245_ == 1 && i_247_ == 255) {
                    for (/**/; i <= i_242_; i++) {
                        int i_248_ = i_241_ >> 16;
                        if (i_248_ >= this.anInt7476
                                && i_248_ < this.anInt7503)
                            this.anIntArray7483
                                    [i + i_248_ * this.anInt7477]
                                    = i_244_;
                        i_241_ += i_246_;
                    }
                    return;
                }
                if (i_245_ == 1) {
                    i_244_ = (((i_244_ & 0xff00ff) * i_247_ >> 8 & 0xff00ff)
                            + ((i_244_ & 0xff00) * i_247_ >> 8 & 0xff00)
                            + (i_247_ << 24));
                    int i_249_ = 256 - i_247_;
                    for (/**/; i <= i_242_; i++) {
                        int i_250_ = i_241_ >> 16;
                        if (i_250_ >= this.anInt7476
                                && i_250_ < this.anInt7503) {
                            int i_251_
                                    = i + i_250_ * this.anInt7477;
                            int i_252_
                                    = this.anIntArray7483[i_251_];
                            i_252_ = (((i_252_ & 0xff00ff) * i_249_ >> 8
                                    & 0xff00ff)
                                    + ((i_252_ & 0xff00) * i_249_ >> 8
                                    & 0xff00));
                            this.anIntArray7483[i_251_]
                                    = i_244_ + i_252_;
                        }
                        i_241_ += i_246_;
                    }
                    return;
                }
                if (i_245_ == 2) {
                    for (/**/; i <= i_242_; i++) {
                        int i_253_ = i_241_ >> 16;
                        if (i_253_ >= this.anInt7476
                                && i_253_ < this.anInt7503) {
                            int i_254_
                                    = i + i_253_ * this.anInt7477;
                            int i_255_
                                    = this.anIntArray7483[i_254_];
                            int i_256_ = i_244_ + i_255_;
                            int i_257_
                                    = (i_244_ & 0xff00ff) + (i_255_ & 0xff00ff);
                            i_255_ = (i_257_ & 0x1000100) + (i_256_ - i_257_
                                    & 0x10000);
                            this.anIntArray7483[i_254_]
                                    = i_256_ - i_255_ | i_255_ - (i_255_ >>> 8);
                        }
                        i_241_ += i_246_;
                    }
                    return;
                }
                throw new IllegalArgumentException();
            }
            i <<= 16;
            i += 32768;
            i_242_ <<= 16;
            int i_258_
                    = (int) Math.floor((double) i_242_ / (double) i_243_ + 0.5);
            i_243_ += i_241_;
            if (i_241_ < this.anInt7476) {
                i += i_258_ * (this.anInt7476 - i_241_);
                i_241_ = this.anInt7476;
            }
            if (i_243_ >= this.anInt7503)
                i_243_ = this.anInt7503 - 1;
            int i_259_ = i_244_ >>> 24;
            if (i_245_ == 0 || i_245_ == 1 && i_259_ == 255) {
                for (/**/; i_241_ <= i_243_; i_241_++) {
                    int i_260_ = i >> 16;
                    if (i_260_ >= this.anInt7496
                            && i_260_ < this.anInt7507)
                        this.anIntArray7483
                                [i_260_ + i_241_ * this.anInt7477]
                                = i_244_;
                    i += i_258_;
                }
            } else if (i_245_ == 1) {
                i_244_ = (((i_244_ & 0xff00ff) * i_259_ >> 8 & 0xff00ff)
                        + ((i_244_ & 0xff00) * i_259_ >> 8 & 0xff00)
                        + (i_259_ << 24));
                int i_261_ = 256 - i_259_;
                for (/**/; i_241_ <= i_243_; i_241_++) {
                    int i_262_ = i >> 16;
                    if (i_262_ >= this.anInt7496
                            && i_262_ < this.anInt7507) {
                        int i_263_
                                = i_262_ + i_241_ * this.anInt7477;
                        int i_264_ = this.anIntArray7483[i_263_];
                        i_264_
                                = (((i_264_ & 0xff00ff) * i_261_ >> 8 & 0xff00ff)
                                + ((i_264_ & 0xff00) * i_261_ >> 8 & 0xff00));
                        this.anIntArray7483
                                [i_262_ + i_241_ * this.anInt7477]
                                = i_244_ + i_264_;
                    }
                    i += i_258_;
                }
            } else if (i_245_ == 2) {
                for (/**/; i_241_ <= i_243_; i_241_++) {
                    int i_265_ = i >> 16;
                    if (i_265_ >= this.anInt7496
                            && i_265_ < this.anInt7507) {
                        int i_266_
                                = i_265_ + i_241_ * this.anInt7477;
                        int i_267_ = this.anIntArray7483[i_266_];
                        int i_268_ = i_244_ + i_267_;
                        int i_269_ = (i_244_ & 0xff00ff) + (i_267_ & 0xff00ff);
                        i_267_ = (i_269_ & 0x1000100) + (i_268_ - i_269_
                                & 0x10000);
                        this.anIntArray7483[i_266_]
                                = i_268_ - i_267_ | i_267_ - (i_267_ >>> 8);
                    }
                    i += i_258_;
                }
            } else
                throw new IllegalArgumentException();
        }
    }

    final void method3676(int i, int i_270_, int i_271_, int i_272_,
                          int i_273_, int i_274_, int i_275_, int i_276_,
                          int i_277_, int i_278_, int i_279_, int i_280_,
                          int i_281_) {
        Class167 class167 = method3724(Thread.currentThread());
        Class109 class109 = class167.aClass109_2220;
        class109.aBoolean1669 = false;
        i -= this.anInt7509;
        i_272_ -= this.anInt7509;
        i_275_ -= this.anInt7509;
        i_270_ -= this.anInt7490;
        i_273_ -= this.anInt7490;
        i_276_ -= this.anInt7490;
        class109.aBoolean1671
                = (i < 0 || i > class109.anInt1679 || i_272_ < 0
                || i_272_ > class109.anInt1679 || i_275_ < 0
                || i_275_ > class109.anInt1679);
        int i_282_ = i_278_ >>> 24;
        if (i_281_ == 0 || i_281_ == 1 && i_282_ == 255) {
            class109.anInt1674 = 0;
            class109.aBoolean1667 = false;
            class109.method1027((float) i_270_, (float) i_273_, (float) i_276_,
                    (float) i, (float) i_272_, (float) i_275_,
                    (float) i_271_, (float) i_274_, (float) i_277_,
                    i_278_, i_279_, i_280_);
        } else if (i_281_ == 1) {
            class109.anInt1674 = 255 - i_282_;
            class109.aBoolean1667 = false;
            class109.method1027((float) i_270_, (float) i_273_, (float) i_276_,
                    (float) i, (float) i_272_, (float) i_275_,
                    (float) i_271_, (float) i_274_, (float) i_277_,
                    i_278_, i_279_, i_280_);
        } else if (i_281_ == 2) {
            class109.anInt1674 = 128;
            class109.aBoolean1667 = true;
            class109.method1027((float) i_270_, (float) i_273_, (float) i_276_,
                    (float) i, (float) i_272_, (float) i_275_,
                    (float) i_271_, (float) i_274_, (float) i_277_,
                    i_278_, i_279_, i_280_);
        } else
            throw new IllegalArgumentException();
        class109.aBoolean1669 = true;
    }

    final Class324 method3686(Class143 class143, Class207[] class207s,
                              boolean bool) {
        int[] is = new int[class207s.length];
        int[] is_283_ = new int[class207s.length];
        boolean bool_284_ = false;
        for (int i = 0; i < class207s.length; i++) {
            is[i] = class207s[i].anInt2702;
            is_283_[i] = class207s[i].anInt2696;
            if (class207s[i].aByteArray2695 != null)
                bool_284_ = true;
        }
        if (bool) {
            if (bool_284_)
                return new Class324_Sub4(this, class143, class207s, is,
                        is_283_);
            return new Class324_Sub1(this, class143, class207s, is, is_283_);
        }
        if (bool_284_)
            throw new IllegalArgumentException("");
        return new Class324_Sub3(this, class143, class207s, is, is_283_);
    }

    final Interface4 method3634(Interface3 interface3,
                                Interface13 interface13) {
        return new Class49(this, (Class105) interface3,
                (Class216) interface13);
    }

    final void C(boolean bool) {
        Class167 class167 = method3724(Thread.currentThread());
        class167.aBoolean2202 = bool;
    }

    final void method3636(int i, int i_285_, int i_286_, int i_287_,
                          int i_288_, int i_289_, aa var_aa, int i_290_,
                          int i_291_) {
        aa_Sub3 var_aa_Sub3 = (aa_Sub3) var_aa;
        int[] is = var_aa_Sub3.anIntArray5201;
        int[] is_292_ = var_aa_Sub3.anIntArray5202;
        int i_293_ = (Math.max(this.anInt7476, i_291_));
        int i_294_ = (Math.min(this.anInt7503, i_291_ + is.length));
        i_286_ -= i;
        i_287_ -= i_285_;
        if (i_286_ + i_287_ < 0) {
            i += i_286_;
            i_286_ = -i_286_;
            i_285_ += i_287_;
            i_287_ = -i_287_;
        }
        if (i_286_ > i_287_) {
            i_285_ <<= 16;
            i_285_ += 32768;
            i_287_ <<= 16;
            int i_295_
                    = (int) Math.floor((double) i_287_ / (double) i_286_ + 0.5);
            i_286_ += i;
            if (i < this.anInt7496) {
                i_285_ += i_295_ * (this.anInt7496 - i);
                i = this.anInt7496;
            }
            if (i_286_ >= this.anInt7507)
                i_286_ = this.anInt7507 - 1;
            int i_296_ = i_288_ >>> 24;
            if (i_289_ == 0 || i_289_ == 1 && i_296_ == 255) {
                for (/**/; i <= i_286_; i++) {
                    int i_297_ = i_285_ >> 16;
                    int i_298_ = i_297_ - i_291_;
                    if (i_297_ >= i_293_ && i_297_ < i_294_) {
                        int i_299_ = i_290_ + is[i_298_];
                        if (i >= i_299_ && i < i_299_ + is_292_[i_298_])
                            this.anIntArray7483
                                    [i + i_297_ * this.anInt7477]
                                    = i_288_;
                    }
                    i_285_ += i_295_;
                }
                return;
            }
            if (i_289_ == 1) {
                i_288_ = (((i_288_ & 0xff00ff) * i_296_ >> 8 & 0xff00ff)
                        + ((i_288_ & 0xff00) * i_296_ >> 8 & 0xff00)
                        + (i_296_ << 24));
                int i_300_ = 256 - i_296_;
                for (/**/; i <= i_286_; i++) {
                    int i_301_ = i_285_ >> 16;
                    int i_302_ = i_301_ - i_291_;
                    if (i_301_ >= i_293_ && i_301_ < i_294_) {
                        int i_303_ = i_290_ + is[i_302_];
                        if (i >= i_303_ && i < i_303_ + is_292_[i_302_]) {
                            int i_304_
                                    = i + i_301_ * this.anInt7477;
                            int i_305_
                                    = this.anIntArray7483[i_304_];
                            i_305_ = (((i_305_ & 0xff00ff) * i_300_ >> 8
                                    & 0xff00ff)
                                    + ((i_305_ & 0xff00) * i_300_ >> 8
                                    & 0xff00));
                            this.anIntArray7483[i_304_]
                                    = i_288_ + i_305_;
                        }
                    }
                    i_285_ += i_295_;
                }
                return;
            }
            if (i_289_ == 2) {
                for (/**/; i <= i_286_; i++) {
                    int i_306_ = i_285_ >> 16;
                    int i_307_ = i_306_ - i_291_;
                    if (i_306_ >= i_293_ && i_306_ < i_294_) {
                        int i_308_ = i_290_ + is[i_307_];
                        if (i >= i_308_ && i < i_308_ + is_292_[i_307_]) {
                            int i_309_
                                    = i + i_306_ * this.anInt7477;
                            int i_310_
                                    = this.anIntArray7483[i_309_];
                            int i_311_ = i_288_ + i_310_;
                            int i_312_
                                    = (i_288_ & 0xff00ff) + (i_310_ & 0xff00ff);
                            i_310_ = (i_312_ & 0x1000100) + (i_311_ - i_312_
                                    & 0x10000);
                            this.anIntArray7483[i_309_]
                                    = i_311_ - i_310_ | i_310_ - (i_310_ >>> 8);
                        }
                    }
                    i_285_ += i_295_;
                }
                return;
            }
            throw new IllegalArgumentException();
        }
        i <<= 16;
        i += 32768;
        i_286_ <<= 16;
        int i_313_ = (int) Math.floor((double) i_286_ / (double) i_287_ + 0.5);
        i_287_ += i_285_;
        if (i_285_ < i_293_) {
            i += i_313_ * (i_293_ - i_285_);
            i_285_ = i_293_;
        }
        if (i_287_ >= i_294_)
            i_287_ = i_294_ - 1;
        int i_314_ = i_288_ >>> 24;
        if (i_289_ == 0 || i_289_ == 1 && i_314_ == 255) {
            for (/**/; i_285_ <= i_287_; i_285_++) {
                int i_315_ = i >> 16;
                int i_316_ = i_285_ - i_291_;
                int i_317_ = i_290_ + is[i_316_];
                if (i_315_ >= this.anInt7496
                        && i_315_ < this.anInt7507 && i_315_ >= i_317_
                        && i_315_ < i_317_ + is_292_[i_316_])
                    this.anIntArray7483
                            [i_315_ + i_285_ * this.anInt7477]
                            = i_288_;
                i += i_313_;
            }
        } else if (i_289_ == 1) {
            i_288_ = (((i_288_ & 0xff00ff) * i_314_ >> 8 & 0xff00ff)
                    + ((i_288_ & 0xff00) * i_314_ >> 8 & 0xff00)
                    + (i_314_ << 24));
            int i_318_ = 256 - i_314_;
            for (/**/; i_285_ <= i_287_; i_285_++) {
                int i_319_ = i >> 16;
                int i_320_ = i_285_ - i_291_;
                int i_321_ = i_290_ + is[i_320_];
                if (i_319_ >= this.anInt7496
                        && i_319_ < this.anInt7507 && i_319_ >= i_321_
                        && i_319_ < i_321_ + is_292_[i_320_]) {
                    int i_322_ = i_319_ + i_285_ * this.anInt7477;
                    int i_323_ = this.anIntArray7483[i_322_];
                    i_323_ = (((i_323_ & 0xff00ff) * i_318_ >> 8 & 0xff00ff)
                            + ((i_323_ & 0xff00) * i_318_ >> 8 & 0xff00));
                    this.anIntArray7483
                            [i_319_ + i_285_ * this.anInt7477]
                            = i_288_ + i_323_;
                }
                i += i_313_;
            }
        } else if (i_289_ == 2) {
            for (/**/; i_285_ <= i_287_; i_285_++) {
                int i_324_ = i >> 16;
                int i_325_ = i_285_ - i_291_;
                int i_326_ = i_290_ + is[i_325_];
                if (i_324_ >= this.anInt7496
                        && i_324_ < this.anInt7507 && i_324_ >= i_326_
                        && i_324_ < i_326_ + is_292_[i_325_]) {
                    int i_327_ = i_324_ + i_285_ * this.anInt7477;
                    int i_328_ = this.anIntArray7483[i_327_];
                    int i_329_ = i_288_ + i_328_;
                    int i_330_ = (i_288_ & 0xff00ff) + (i_328_ & 0xff00ff);
                    i_328_
                            = (i_330_ & 0x1000100) + (i_329_ - i_330_ & 0x10000);
                    this.anIntArray7483[i_327_]
                            = i_329_ - i_328_ | i_328_ - (i_328_ >>> 8);
                }
                i += i_313_;
            }
        } else
            throw new IllegalArgumentException();
    }

    final int XA() {
        return this.anInt7494;
    }

    final void T(int i, int i_331_, int i_332_, int i_333_) {
        if (this.anInt7496 < i)
            this.anInt7496 = i;
        if (this.anInt7476 < i_331_)
            this.anInt7476 = i_331_;
        if (this.anInt7507 > i_332_)
            this.anInt7507 = i_332_;
        if (this.anInt7503 > i_333_)
            this.anInt7503 = i_333_;
        method3713();
    }

    final void aa(int i, int i_334_, int i_335_, int i_336_, int i_337_,
                  int i_338_) {
        if (i < this.anInt7496) {
            i_335_ -= this.anInt7496 - i;
            i = this.anInt7496;
        }
        if (i_334_ < this.anInt7476) {
            i_336_ -= this.anInt7476 - i_334_;
            i_334_ = this.anInt7476;
        }
        if (i + i_335_ > this.anInt7507)
            i_335_ = this.anInt7507 - i;
        if (i_334_ + i_336_ > this.anInt7503)
            i_336_ = this.anInt7503 - i_334_;
        if (i_335_ > 0 && i_336_ > 0 && i <= this.anInt7507
                && i_334_ <= this.anInt7503) {
            int i_339_ = this.anInt7477 - i_335_;
            int i_340_ = i + i_334_ * this.anInt7477;
            int i_341_ = i_337_ >>> 24;
            if (i_338_ == 0 || i_338_ == 1 && i_341_ == 255) {
                int i_342_ = i_335_ >> 3;
                int i_343_ = i_335_ & 0x7;
                i_335_ = i_340_ - 1;
                for (int i_344_ = -i_336_; i_344_ < 0; i_344_++) {
                    if (i_342_ > 0) {
                        i = i_342_;
                        do {
                            this.anIntArray7483[++i_335_] = i_337_;
                            this.anIntArray7483[++i_335_] = i_337_;
                            this.anIntArray7483[++i_335_] = i_337_;
                            this.anIntArray7483[++i_335_] = i_337_;
                            this.anIntArray7483[++i_335_] = i_337_;
                            this.anIntArray7483[++i_335_] = i_337_;
                            this.anIntArray7483[++i_335_] = i_337_;
                            this.anIntArray7483[++i_335_] = i_337_;
                        } while (--i > 0);
                    }
                    if (i_343_ > 0) {
                        i = i_343_;
                        do
                            this.anIntArray7483[++i_335_] = i_337_;
                        while (--i > 0);
                    }
                    i_335_ += i_339_;
                }
            } else if (i_338_ == 1) {
                i_337_
                        = (((i_337_ & 0xff00ff) * i_341_ >> 8 & 0xff00ff)
                        + (((i_337_ & ~0xff00ff) >>> 8) * i_341_ & ~0xff00ff));
                int i_345_ = 256 - i_341_;
                for (int i_346_ = 0; i_346_ < i_336_; i_346_++) {
                    for (int i_347_ = -i_335_; i_347_ < 0; i_347_++) {
                        int i_348_ = this.anIntArray7483[i_340_];
                        i_348_
                                = (((i_348_ & 0xff00ff) * i_345_ >> 8 & 0xff00ff)
                                + (((i_348_ & ~0xff00ff) >>> 8) * i_345_
                                & ~0xff00ff));
                        this.anIntArray7483[i_340_++]
                                = i_337_ + i_348_;
                    }
                    i_340_ += i_339_;
                }
            } else if (i_338_ == 2) {
                for (int i_349_ = 0; i_349_ < i_336_; i_349_++) {
                    for (int i_350_ = -i_335_; i_350_ < 0; i_350_++) {
                        int i_351_ = this.anIntArray7483[i_340_];
                        int i_352_ = i_337_ + i_351_;
                        int i_353_ = (i_337_ & 0xff00ff) + (i_351_ & 0xff00ff);
                        i_351_ = (i_353_ & 0x1000100) + (i_352_ - i_353_
                                & 0x10000);
                        this.anIntArray7483[i_340_++]
                                = i_352_ - i_351_ | i_351_ - (i_351_ >>> 8);
                    }
                    i_340_ += i_339_;
                }
            } else
                throw new IllegalArgumentException();
        }
    }

    final int[] method3718(int i) {
        Class348_Sub25 class348_sub25;
        synchronized (aClass60_7498) {
            class348_sub25
                    = (Class348_Sub25) aClass60_7498.method583(i, 77);
            if (class348_sub25 == null) {
                if (!this.aD4579.method4(-7953, i))
                    return null;
                Class12 class12 = this.aD4579.method3(i, -6662);
                int i_354_ = (class12.aBoolean199 || aBoolean7489
                        ? 64 : this.anInt7501);
                class348_sub25
                        = new Class348_Sub25(i, i_354_,
                        this.aD4579.method5(true, i,
                                0.7F,
                                i_354_,
                                i_354_,
                                71),
                        class12.anInt200 != 1);
                aClass60_7498.method582(class348_sub25, i, (byte) -122);
            }
        }
        class348_sub25.aBoolean6882 = true;
        return class348_sub25.method2997();
    }

    final void method3652() {
        if (aBoolean7471) {
            Class286_Sub8.method2173(false, -101, true);
            aBoolean7471 = false;
        }
        this.aClass348_Sub31_7469 = null;
        aCanvas7468 = null;
        anInt7465 = 0;
        anInt7472 = 0;
        aClass356_7467 = null;
        aBoolean7470 = true;
    }

    final Class101 method3640() {
        return this.aClass101_Sub1_7492;
    }

    ha_Sub1(Canvas canvas, d var_d, int i, int i_355_) {
        this(var_d);
        try {
            method3643(canvas, i, i_355_);
            method3677(canvas);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            this.method3635((byte) -115);
            throw new RuntimeException("");
        }
    }

    final int[] method3719(int i) {
        Class348_Sub25 class348_sub25;
        synchronized (aClass60_7498) {
            class348_sub25
                    = ((Class348_Sub25)
                    aClass60_7498.method583((long) i | ~0x7fffffffffffffffL,
                            107));
            if (class348_sub25 == null) {
                if (!this.aD4579.method4(-7953, i))
                    return null;
                Class12 class12 = this.aD4579.method3(i, -6662);
                int i_356_ = (class12.aBoolean199 || aBoolean7489
                        ? 64 : this.anInt7501);
                class348_sub25
                        = new Class348_Sub25(i, i_356_,
                        this.aD4579.method6(-21540,
                                i_356_,
                                0.7F, i,
                                true,
                                i_356_),
                        class12.anInt200 != 1);
                aClass60_7498.method582(class348_sub25,
                        (long) i | ~0x7fffffffffffffffL,
                        (byte) -126);
            }
        }
        class348_sub25.aBoolean6882 = true;
        return class348_sub25.method2997();
    }

    final s method3648(int i, int i_357_, int[][] is, int[][] is_358_,
                       int i_359_, int i_360_, int i_361_) {
        return new s_Sub1(this, i_360_, i_361_, i, i_357_, is, is_358_,
                i_359_);
    }

    final void H(int i, int i_362_, int i_363_, int[] is) {
        float f = ((this.aClass101_Sub1_7492
                .aFloat5681)
                + ((this.aClass101_Sub1_7492
                .aFloat5662) * (float) i
                + (this.aClass101_Sub1_7492
                .aFloat5680) * (float) i_362_
                + (this.aClass101_Sub1_7492
                .aFloat5664) * (float) i_363_));
        if (f == 0.0F)
            is[0] = is[1] = is[2] = -1;
        else {
            int i_364_
                    = (int) ((float) this.anInt7491
                    * (this.aClass101_Sub1_7492.aFloat5686
                    + ((this.aClass101_Sub1_7492
                    .aFloat5672) * (float) i
                    + (this.aClass101_Sub1_7492
                    .aFloat5673) * (float) i_362_
                    + (this.aClass101_Sub1_7492
                    .aFloat5669) * (float) i_363_))
                    / f);
            int i_365_
                    = (int) ((float) this.anInt7497
                    * (this.aClass101_Sub1_7492.aFloat5685
                    + ((this.aClass101_Sub1_7492
                    .aFloat5655) * (float) i
                    + (this.aClass101_Sub1_7492
                    .aFloat5678) * (float) i_362_
                    + (this.aClass101_Sub1_7492
                    .aFloat5666) * (float) i_363_))
                    / f);
            is[0] = i_364_ - this.anInt7509;
            is[1] = i_365_ - this.anInt7490;
            is[2] = (int) f;
        }
    }

    final Class101 method3654() {
        return new Class101_Sub1();
    }

    final void la() {
        this.anInt7496 = 0;
        this.anInt7476 = 0;
        this.anInt7507 = this.anInt7477;
        this.anInt7503 = anInt7486;
        method3713();
    }

    final Class64 method3625(Class124 class124, int i, int i_366_, int i_367_,
                             int i_368_) {
        return new Class64_Sub1(this, class124, i, i_367_, i_368_, i_366_);
    }

    final Interface13 method3624(int i, int i_369_) {
        return new Class216(i, i_369_);
    }

    final void method3632(int[] is) {
        is[0] = this.anInt7477;
        is[1] = anInt7486;
    }

    final void F(int i, int i_370_) {
        int i_371_ = i_370_ * this.anInt7477 + i;
        int i_372_ = i_370_ * anInt7495 + i;
        if (i_371_ != 0 || i_372_ != 0) {
            int[] is = this.anIntArray7483;
            float[] fs = this.aFloatArray7511;
            if (i_371_ < 0) {
                int i_373_ = is.length + i_371_;
                Class214.method1578(is, -i_371_, is, 0, i_373_);
            } else if (i_371_ > 0) {
                int i_374_ = is.length - i_371_;
                Class214.method1578(is, 0, is, i_371_, i_374_);
            }
            if (i_372_ < 0) {
                int i_375_ = fs.length + i_372_;
                Class214.method1574(fs, -i_372_, fs, 0, i_375_);
            } else if (i_372_ > 0) {
                int i_376_ = fs.length - i_372_;
                Class214.method1574(fs, 0, fs, i_372_, i_376_);
            }
        }
    }

    final void method3687(Interface4 interface4) {
        Class49 class49 = (Class49) interface4;
        this.anInt7477 = class49.anInt4725;
        anInt7486 = class49.anInt4722;
        this.anIntArray7483 = class49.anIntArray4731;
        aClass49_7475 = class49;
        anInt7495 = class49.anInt4725;
        anInt7488 = class49.anInt4722;
        this.aFloatArray7511 = class49.aFloatArray4719;
        method3717();
    }

    final void method3720(int i, int i_377_, int i_378_, int i_379_,
                          int i_380_, int i_381_, int i_382_, int i_383_,
                          int i_384_, int i_385_) {
        if (i_379_ != 0 && i_380_ != 0) {
            if (i_382_ != 65535
                    && !(this.aD4579.method3(i_382_, -6662)
                    .aBoolean209)) {
                if (anInt7512 != i_382_) {
                    Class105 class105
                            = ((Class105)
                            aClass60_7499.method583(i_382_, 97));
                    if (class105 == null) {
                        int[] is = method3719(i_382_);
                        if (is == null)
                            return;
                        int i_386_ = (method3727(i_382_) ? 64
                                : this.anInt7501);
                        class105 = this.method3662(i_386_, is, (byte) 94, 0,
                                i_386_, i_386_);
                        aClass60_7499.method582(class105, i_382_,
                                (byte) -100);
                    }
                    anInt7512 = i_382_;
                    aClass105_7513 = class105;
                }
                ((Class105_Sub3) aClass105_7513).method996(i - i_379_,
                        i_377_ - i_380_,
                        i_378_, i_379_ << 1,
                        i_380_ << 1, i_384_,
                        i_383_, i_385_, 1);
            } else
                method3723(i, i_377_, i_378_, i_379_, i_383_, i_385_);
        }
    }

    final void method3653(Class299 class299) {
        /* empty */
    }

    final void EA(int i, int i_387_, int i_388_, int i_389_) {
        Class167 class167 = method3724(Thread.currentThread());
        class167.anInt2211 = i;
        class167.anInt2192 = i_387_;
        class167.anInt2197 = i_388_;
    }

    private final void method3721(int i, int i_390_, int i_391_, int i_392_,
                                  int i_393_, int i_394_, int i_395_,
                                  int i_396_) {
        if (i >= this.anInt7496
                && i < this.anInt7507) {
            int i_397_ = i + i_390_ * this.anInt7477;
            int i_398_ = i_392_ >>> 24;
            int i_399_ = i_394_ + i_395_;
            int i_400_ = i_396_ % i_399_;
            if (i_393_ == 0 || i_393_ == 1 && i_398_ == 255) {
                int i_401_ = 0;
                while (i_401_ < i_391_) {
                    if (i_390_ + i_401_ >= this.anInt7476
                            && i_390_ + i_401_ < this.anInt7503
                            && i_400_ < i_394_)
                        this.anIntArray7483
                                [i_397_ + i_401_ * this.anInt7477]
                                = i_392_;
                    i_401_++;
                    i_400_ = ++i_400_ % i_399_;
                }
            } else if (i_393_ == 1) {
                i_392_ = (((i_392_ & 0xff00ff) * i_398_ >> 8 & 0xff00ff)
                        + ((i_392_ & 0xff00) * i_398_ >> 8 & 0xff00)
                        + (i_398_ << 24));
                int i_402_ = 256 - i_398_;
                int i_403_ = 0;
                while (i_403_ < i_391_) {
                    if (i_390_ + i_403_ >= this.anInt7476
                            && i_390_ + i_403_ < this.anInt7503
                            && i_400_ < i_394_) {
                        int i_404_
                                = i_397_ + i_403_ * this.anInt7477;
                        int i_405_ = this.anIntArray7483[i_404_];
                        i_405_
                                = (((i_405_ & 0xff00ff) * i_402_ >> 8 & 0xff00ff)
                                + ((i_405_ & 0xff00) * i_402_ >> 8 & 0xff00));
                        this.anIntArray7483[i_404_]
                                = i_392_ + i_405_;
                    }
                    i_403_++;
                    i_400_ = ++i_400_ % i_399_;
                }
            } else if (i_393_ == 2) {
                int i_406_ = 0;
                while (i_406_ < i_391_) {
                    if (i_390_ + i_406_ >= this.anInt7476
                            && i_390_ + i_406_ < this.anInt7503
                            && i_400_ < i_394_) {
                        int i_407_
                                = i_397_ + i_406_ * this.anInt7477;
                        int i_408_ = this.anIntArray7483[i_407_];
                        int i_409_ = i_392_ + i_408_;
                        int i_410_ = (i_392_ & 0xff00ff) + (i_408_ & 0xff00ff);
                        i_408_ = (i_410_ & 0x1000100) + (i_409_ - i_410_
                                & 0x10000);
                        this.anIntArray7483[i_407_]
                                = i_409_ - i_408_ | i_408_ - (i_408_ >>> 8);
                    }
                    i_406_++;
                    i_400_ = ++i_400_ % i_399_;
                }
            } else
                throw new IllegalArgumentException();
        }
    }

    final void method3677(Canvas canvas) {
        if (canvas == null) {
            aCanvas7468 = null;
            this.aClass348_Sub31_7469 = null;
            if (aClass49_7475 == null) {
                this.anIntArray7483 = null;
                this.anInt7477 = anInt7486 = 1;
                anInt7495 = anInt7488 = 1;
                method3717();
            }
        } else {
            Class348_Sub31 class348_sub31
                    = ((Class348_Sub31)
                    aClass356_7467.method3480(canvas.hashCode(), -6008));
            if (class348_sub31 != null) {
                aCanvas7468 = canvas;
                Dimension dimension = canvas.getSize();
                anInt7465 = dimension.width;
                anInt7472 = dimension.height;
                this.aClass348_Sub31_7469 = class348_sub31;
                if (aClass49_7475 == null) {
                    this.anIntArray7483
                            = class348_sub31.anIntArray6916;
                    this.anInt7477
                            = class348_sub31.anInt6917;
                    anInt7486 = class348_sub31.anInt6920;
                    if (this.anInt7477 != anInt7495
                            || anInt7486 != anInt7488) {
                        anInt7481 = anInt7495 = this.anInt7477;
                        anInt7493 = anInt7488 = anInt7486;
                        this.aFloatArray7502
                                = this.aFloatArray7511
                                = new float[anInt7495 * anInt7488];
                    }
                    method3717();
                }
            }
        }
    }

    final int JA(int i, int i_411_, int i_412_, int i_413_, int i_414_,
                 int i_415_) {
        int i_416_ = 0;
        float f = ((this.aClass101_Sub1_7492
                .aFloat5662) * (float) i
                + (this.aClass101_Sub1_7492
                .aFloat5680) * (float) i_411_
                + (this.aClass101_Sub1_7492
                .aFloat5664) * (float) i_412_
                + (this.aClass101_Sub1_7492
                .aFloat5681));
        if (f < 1.0F)
            f = 1.0F;
        float f_417_
                = ((this.aClass101_Sub1_7492
                .aFloat5662) * (float) i_413_
                + (this.aClass101_Sub1_7492
                .aFloat5680) * (float) i_414_
                + (this.aClass101_Sub1_7492
                .aFloat5664) * (float) i_415_
                + (this.aClass101_Sub1_7492
                .aFloat5681));
        if (f_417_ < 1.0F)
            f_417_ = 1.0F;
        if (f < (float) this.anInt7482
                && f_417_ < (float) this.anInt7482)
            i_416_ |= 0x10;
        else if (f > (float) this.anInt7494
                && f_417_ > (float) this.anInt7494)
            i_416_ |= 0x20;
        int i_418_
                = (int) ((float) this.anInt7491
                * ((this.aClass101_Sub1_7492
                .aFloat5672) * (float) i
                + (this.aClass101_Sub1_7492.aFloat5673
                * (float) i_411_)
                + (this.aClass101_Sub1_7492.aFloat5669
                * (float) i_412_)
                + this.aClass101_Sub1_7492.aFloat5686)
                / f);
        int i_419_
                = (int) ((float) this.anInt7491
                * ((this.aClass101_Sub1_7492
                .aFloat5672) * (float) i_413_
                + (this.aClass101_Sub1_7492.aFloat5673
                * (float) i_414_)
                + (this.aClass101_Sub1_7492.aFloat5669
                * (float) i_415_)
                + this.aClass101_Sub1_7492.aFloat5686)
                / f_417_);
        if (i_418_ < this.anInt7509
                && i_419_ < this.anInt7509)
            i_416_ |= 0x1;
        else if (i_418_ > this.anInt7508
                && i_419_ > this.anInt7508)
            i_416_ |= 0x2;
        int i_420_
                = (int) ((float) this.anInt7497
                * ((this.aClass101_Sub1_7492
                .aFloat5655) * (float) i
                + (this.aClass101_Sub1_7492.aFloat5678
                * (float) i_411_)
                + (this.aClass101_Sub1_7492.aFloat5666
                * (float) i_412_)
                + this.aClass101_Sub1_7492.aFloat5685)
                / f);
        int i_421_
                = (int) ((float) this.anInt7497
                * ((this.aClass101_Sub1_7492
                .aFloat5655) * (float) i_413_
                + (this.aClass101_Sub1_7492.aFloat5678
                * (float) i_414_)
                + (this.aClass101_Sub1_7492.aFloat5666
                * (float) i_415_)
                + this.aClass101_Sub1_7492.aFloat5685)
                / f_417_);
        if (i_420_ < this.anInt7490
                && i_421_ < this.anInt7490)
            i_416_ |= 0x4;
        else if (i_420_ > this.anInt7506
                && i_421_ > this.anInt7506)
            i_416_ |= 0x8;
        return i_416_;
    }

    final void method3678(int i) {
        aClass167Array7480[i].method1291(10000, null);
    }

    final void method3672() {
        if (aCanvas7468 == null) {
            this.anInt7477 = 1;
            anInt7486 = 1;
            this.anIntArray7483 = null;
            anInt7495 = 1;
            anInt7488 = 1;
            this.aFloatArray7511 = null;
        } else {
            this.anIntArray7483
                    = (this.aClass348_Sub31_7469
                    .anIntArray6916);
            this.anInt7477
                    = (this.aClass348_Sub31_7469
                    .anInt6917);
            anInt7486
                    = (this.aClass348_Sub31_7469
                    .anInt6920);
            this.aFloatArray7511
                    = this.aFloatArray7502;
            anInt7495 = anInt7481;
            anInt7488 = anInt7493;
        }
        aClass49_7475 = null;
        method3717();
    }

    final int method3722(int i) {
        return (this.aD4579.method3(i, -6662).aShort208
                & 0xffff);
    }

    final boolean method3699() {
        return false;
    }

    final boolean method3671() {
        return false;
    }

    final Class105 method3711(int[] is, int i, int i_422_, int i_423_,
                              int i_424_, boolean bool) {
        boolean bool_425_ = false;
        int i_426_ = i;
        while_229_:
        for (int i_427_ = 0; i_427_ < i_424_; i_427_++) {
            for (int i_428_ = 0; i_428_ < i_423_; i_428_++) {
                int i_429_ = is[i_426_++] >>> 24;
                if (i_429_ != 0 && i_429_ != 255) {
                    bool_425_ = true;
                    break while_229_;
                }
            }
        }
        if (bool_425_)
            return new Class105_Sub3_Sub3(this, is, i, i_422_, i_423_, i_424_,
                    bool);
        return new Class105_Sub3_Sub1(this, is, i, i_422_, i_423_, i_424_,
                bool);
    }

    final Class105 method3691(Class207 class207, boolean bool) {
        int[] is = class207.anIntArray2697;
        byte[] is_430_ = class207.aByteArray2699;
        int i = class207.anInt2702;
        int i_431_ = class207.anInt2696;
        Class105_Sub3 class105_sub3;
        if (bool && class207.aByteArray2695 == null) {
            int[] is_432_ = new int[is.length];
            byte[] is_433_ = new byte[i * i_431_];
            for (int i_434_ = 0; i_434_ < i_431_; i_434_++) {
                int i_435_ = i_434_ * i;
                for (int i_436_ = 0; i_436_ < i; i_436_++)
                    is_433_[i_435_ + i_436_] = is_430_[i_435_ + i_436_];
            }
            for (int i_437_ = 0; i_437_ < is.length; i_437_++)
                is_432_[i_437_] = is[i_437_];
            class105_sub3
                    = new Class105_Sub3_Sub2(this, is_433_, is_432_, i, i_431_);
        } else {
            int[] is_438_ = new int[i * i_431_];
            byte[] is_439_ = class207.aByteArray2695;
            if (is_439_ == null) {
                for (int i_443_ = 0; i_443_ < i_431_; i_443_++) {
                    int i_444_ = i_443_ * i;
                    for (int i_445_ = 0; i_445_ < i; i_445_++) {
                        int i_446_ = is[is_430_[i_444_ + i_445_] & 0xff];
                        is_438_[i_444_ + i_445_]
                                = i_446_ != 0 ? ~0xffffff | i_446_ : 0;
                    }
                }
                class105_sub3
                        = new Class105_Sub3_Sub1(this, is_438_, i, i_431_);
            } else {
                for (int i_440_ = 0; i_440_ < i_431_; i_440_++) {
                    int i_441_ = i_440_ * i;
                    for (int i_442_ = 0; i_442_ < i; i_442_++)
                        is_438_[i_441_ + i_442_]
                                = (is[is_430_[i_441_ + i_442_] & 0xff]
                                | is_439_[i_441_ + i_442_] << 24);
                }
                class105_sub3
                        = new Class105_Sub3_Sub3(this, is_438_, i, i_431_);
            }
        }
        class105_sub3.method985(class207.anInt2703,
                class207.anInt2700,
                class207.anInt2698,
                class207.anInt2701);
        return class105_sub3;
    }

    private final void method3723(int i, int i_447_, int i_448_, int i_449_,
                                  int i_450_, int i_451_) {
        if (i_449_ < 0)
            i_449_ = -i_449_;
        int i_452_ = i_447_ - i_449_;
        if (i_452_ < this.anInt7476)
            i_452_ = this.anInt7476;
        int i_453_ = i_447_ + i_449_ + 1;
        if (i_453_ > this.anInt7503)
            i_453_ = this.anInt7503;
        int i_454_ = i_452_;
        int i_455_ = i_449_ * i_449_;
        int i_456_ = 0;
        int i_457_ = i_447_ - i_454_;
        int i_458_ = i_457_ * i_457_;
        int i_459_ = i_458_ - i_457_;
        if (i_447_ > i_453_)
            i_447_ = i_453_;
        int i_460_ = i_450_ >>> 24;
        if (i_451_ == 0 || i_451_ == 1 && i_460_ == 255) {
            while (i_454_ < i_447_) {
                for (/**/; i_459_ <= i_455_ || i_458_ <= i_455_;
                         i_459_ += i_456_++ + i_456_)
                    i_458_ += i_456_ + i_456_;
                int i_461_ = i - i_456_ + 1;
                if (i_461_ < this.anInt7496)
                    i_461_ = this.anInt7496;
                int i_462_ = i + i_456_;
                if (i_462_ > this.anInt7507)
                    i_462_ = this.anInt7507;
                int i_463_ = i_461_ + i_454_ * this.anInt7477;
                for (int i_464_ = i_461_; i_464_ < i_462_; i_464_++) {
                    if ((float) i_448_
                            < this.aFloatArray7511[i_463_])
                        this.anIntArray7483[i_463_] = i_450_;
                    i_463_++;
                }
                i_454_++;
                i_458_ -= i_457_-- + i_457_;
                i_459_ -= i_457_ + i_457_;
            }
            i_456_ = i_449_;
            i_457_ = i_454_ - i_447_;
            i_459_ = i_457_ * i_457_ + i_455_;
            i_458_ = i_459_ - i_456_;
            i_459_ -= i_457_;
            while (i_454_ < i_453_) {
                for (/**/; i_459_ > i_455_ && i_458_ > i_455_;
                         i_458_ -= i_456_ + i_456_)
                    i_459_ -= i_456_-- + i_456_;
                int i_465_ = i - i_456_;
                if (i_465_ < this.anInt7496)
                    i_465_ = this.anInt7496;
                int i_466_ = i + i_456_;
                if (i_466_ > this.anInt7507 - 1)
                    i_466_ = this.anInt7507 - 1;
                int i_467_ = i_465_ + i_454_ * this.anInt7477;
                for (int i_468_ = i_465_; i_468_ <= i_466_; i_468_++) {
                    if ((float) i_448_
                            < this.aFloatArray7511[i_467_])
                        this.anIntArray7483[i_467_] = i_450_;
                    i_467_++;
                }
                i_454_++;
                i_459_ += i_457_ + i_457_;
                i_458_ += i_457_++ + i_457_;
            }
        } else if (i_451_ == 1) {
            i_450_ = (((i_450_ & 0xff00ff) * i_460_ >> 8 & 0xff00ff)
                    + ((i_450_ & 0xff00) * i_460_ >> 8 & 0xff00)
                    + (i_460_ << 24));
            int i_469_ = 256 - i_460_;
            while (i_454_ < i_447_) {
                for (/**/; i_459_ <= i_455_ || i_458_ <= i_455_;
                         i_459_ += i_456_++ + i_456_)
                    i_458_ += i_456_ + i_456_;
                int i_470_ = i - i_456_ + 1;
                if (i_470_ < this.anInt7496)
                    i_470_ = this.anInt7496;
                int i_471_ = i + i_456_;
                if (i_471_ > this.anInt7507)
                    i_471_ = this.anInt7507;
                int i_472_ = i_470_ + i_454_ * this.anInt7477;
                for (int i_473_ = i_470_; i_473_ < i_471_; i_473_++) {
                    if ((float) i_448_
                            < this.aFloatArray7511[i_472_]) {
                        int i_474_ = this.anIntArray7483[i_472_];
                        i_474_
                                = (((i_474_ & 0xff00ff) * i_469_ >> 8 & 0xff00ff)
                                + ((i_474_ & 0xff00) * i_469_ >> 8 & 0xff00));
                        this.anIntArray7483[i_472_]
                                = i_450_ + i_474_;
                    }
                    i_472_++;
                }
                i_454_++;
                i_458_ -= i_457_-- + i_457_;
                i_459_ -= i_457_ + i_457_;
            }
            i_456_ = i_449_;
            i_457_ = -i_457_;
            i_459_ = i_457_ * i_457_ + i_455_;
            i_458_ = i_459_ - i_456_;
            i_459_ -= i_457_;
            while (i_454_ < i_453_) {
                for (/**/; i_459_ > i_455_ && i_458_ > i_455_;
                         i_458_ -= i_456_ + i_456_)
                    i_459_ -= i_456_-- + i_456_;
                int i_475_ = i - i_456_;
                if (i_475_ < this.anInt7496)
                    i_475_ = this.anInt7496;
                int i_476_ = i + i_456_;
                if (i_476_ > this.anInt7507 - 1)
                    i_476_ = this.anInt7507 - 1;
                int i_477_ = i_475_ + i_454_ * this.anInt7477;
                for (int i_478_ = i_475_; i_478_ <= i_476_; i_478_++) {
                    if ((float) i_448_
                            < this.aFloatArray7511[i_477_]) {
                        int i_479_ = this.anIntArray7483[i_477_];
                        i_479_
                                = (((i_479_ & 0xff00ff) * i_469_ >> 8 & 0xff00ff)
                                + ((i_479_ & 0xff00) * i_469_ >> 8 & 0xff00));
                        this.anIntArray7483[i_477_]
                                = i_450_ + i_479_;
                    }
                    i_477_++;
                }
                i_454_++;
                i_459_ += i_457_ + i_457_;
                i_458_ += i_457_++ + i_457_;
            }
        } else if (i_451_ == 2) {
            while (i_454_ < i_447_) {
                for (/**/; i_459_ <= i_455_ || i_458_ <= i_455_;
                         i_459_ += i_456_++ + i_456_)
                    i_458_ += i_456_ + i_456_;
                int i_480_ = i - i_456_ + 1;
                if (i_480_ < this.anInt7496)
                    i_480_ = this.anInt7496;
                int i_481_ = i + i_456_;
                if (i_481_ > this.anInt7507)
                    i_481_ = this.anInt7507;
                int i_482_ = i_480_ + i_454_ * this.anInt7477;
                for (int i_483_ = i_480_; i_483_ < i_481_; i_483_++) {
                    if ((float) i_448_
                            < this.aFloatArray7511[i_482_]) {
                        int i_484_ = this.anIntArray7483[i_482_];
                        int i_485_ = i_450_ + i_484_;
                        int i_486_ = (i_450_ & 0xff00ff) + (i_484_ & 0xff00ff);
                        i_484_ = (i_486_ & 0x1000100) + (i_485_ - i_486_
                                & 0x10000);
                        this.anIntArray7483[i_482_]
                                = i_485_ - i_484_ | i_484_ - (i_484_ >>> 8);
                    }
                    i_482_++;
                }
                i_454_++;
                i_458_ -= i_457_-- + i_457_;
                i_459_ -= i_457_ + i_457_;
            }
            i_456_ = i_449_;
            i_457_ = -i_457_;
            i_459_ = i_457_ * i_457_ + i_455_;
            i_458_ = i_459_ - i_456_;
            i_459_ -= i_457_;
            while (i_454_ < i_453_) {
                for (/**/; i_459_ > i_455_ && i_458_ > i_455_;
                         i_458_ -= i_456_ + i_456_)
                    i_459_ -= i_456_-- + i_456_;
                int i_487_ = i - i_456_;
                if (i_487_ < this.anInt7496)
                    i_487_ = this.anInt7496;
                int i_488_ = i + i_456_;
                if (i_488_ > this.anInt7507 - 1)
                    i_488_ = this.anInt7507 - 1;
                int i_489_ = i_487_ + i_454_ * this.anInt7477;
                for (int i_490_ = i_487_; i_490_ <= i_488_; i_490_++) {
                    if ((float) i_448_
                            < this.aFloatArray7511[i_489_]) {
                        int i_491_ = this.anIntArray7483[i_489_];
                        int i_492_ = i_450_ + i_491_;
                        int i_493_ = (i_450_ & 0xff00ff) + (i_491_ & 0xff00ff);
                        i_491_ = (i_493_ & 0x1000100) + (i_492_ - i_493_
                                & 0x10000);
                        this.anIntArray7483[i_489_]
                                = i_492_ - i_491_ | i_491_ - (i_491_ >>> 8);
                    }
                    i_489_++;
                }
                i_454_++;
                i_459_ += i_457_ + i_457_;
                i_458_ += i_457_++ + i_457_;
            }
        } else
            throw new IllegalArgumentException();
    }

    final void method3688(int i, int i_494_, int i_495_, int i_496_,
                          int i_497_, int i_498_, int i_499_) {
        Class167 class167 = method3724(Thread.currentThread());
        Class109 class109 = class167.aClass109_2220;
        int i_500_ = i_495_ - i;
        int i_501_ = i_496_ - i_494_;
        int i_502_ = i_500_ >= 0 ? i_500_ : -i_500_;
        int i_503_ = i_501_ >= 0 ? i_501_ : -i_501_;
        int i_504_ = i_502_;
        if (i_504_ < i_503_)
            i_504_ = i_503_;
        if (i_504_ != 0) {
            int i_505_ = (i_500_ << 16) / i_504_;
            int i_506_ = (i_501_ << 16) / i_504_;
            i_500_ += i_505_ >> 16;
            i_501_ += i_506_ >> 16;
            if (i_506_ <= i_505_)
                i_505_ = -i_505_;
            else
                i_506_ = -i_506_;
            int i_507_ = i_498_ * i_506_ >> 17;
            int i_508_ = i_498_ * i_506_ + 1 >> 17;
            int i_509_ = i_498_ * i_505_ >> 17;
            int i_510_ = i_498_ * i_505_ + 1 >> 17;
            i -= class109.method1028();
            i_494_ -= class109.method1017();
            int i_511_ = i + i_507_;
            int i_512_ = i - i_508_;
            int i_513_ = i + i_500_ - i_508_;
            int i_514_ = i + i_500_ + i_507_;
            int i_515_ = i_494_ + i_509_;
            int i_516_ = i_494_ - i_510_;
            int i_517_ = i_494_ + i_501_ - i_510_;
            int i_518_ = i_494_ + i_501_ + i_509_;
            if (i_499_ == 0)
                class109.anInt1674 = 0;
            else if (i_499_ == 1)
                class109.anInt1674 = 255 - (i_497_ >>> 24);
            else
                throw new IllegalArgumentException();
            C(false);
            class109.aBoolean1671
                    = (i_511_ < 0 || i_511_ > class109.anInt1679
                    || i_512_ < 0 || i_512_ > class109.anInt1679
                    || i_513_ < 0 || i_513_ > class109.anInt1679);
            class109.method1018((float) i_515_, (float) i_516_, (float) i_517_,
                    (float) i_511_, (float) i_512_, (float) i_513_,
                    100.0F, 100.0F, 100.0F, i_497_);
            class109.aBoolean1671
                    = (i_511_ < 0 || i_511_ > class109.anInt1679
                    || i_513_ < 0 || i_513_ > class109.anInt1679
                    || i_514_ < 0 || i_514_ > class109.anInt1679);
            class109.method1018((float) i_515_, (float) i_517_, (float) i_518_,
                    (float) i_511_, (float) i_513_, (float) i_514_,
                    100.0F, 100.0F, 100.0F, i_497_);
            C(true);
        }
    }

    final Class105 method3629(int i, int i_519_, boolean bool) {
        if (bool)
            return new Class105_Sub3_Sub3(this, i, i_519_);
        return new Class105_Sub3_Sub1(this, i, i_519_);
    }

    final void method3630(boolean bool) {
        aBoolean7489 = bool;
        aClass60_7498.method590(0);
    }

    final void method3650(int i) {
        Class64_Sub1.anInt5346 = Class64_Sub1.anInt5350 = i;
        if (this.anInt7485 > 1)
            throw new IllegalStateException("No MT");
        method3631(this.anInt7485);
        method3659(0);
    }

    final Class348_Sub1 method3690(int i, int i_520_, int i_521_, int i_522_,
                                   int i_523_, float f) {
        return null;
    }

    final boolean method3666() {
        return false;
    }

    final Class299 method3706(Class299 class299, Class299 class299_524_,
                              float f, Class299 class299_525_) {
        return null;
    }

    final void za(int i, int i_526_, int i_527_, int i_528_, int i_529_) {
        if (i_527_ < 0)
            i_527_ = -i_527_;
        int i_530_ = i_526_ - i_527_;
        if (i_530_ < this.anInt7476)
            i_530_ = this.anInt7476;
        int i_531_ = i_526_ + i_527_ + 1;
        if (i_531_ > this.anInt7503)
            i_531_ = this.anInt7503;
        int i_532_ = i_530_;
        int i_533_ = i_527_ * i_527_;
        int i_534_ = 0;
        int i_535_ = i_526_ - i_532_;
        int i_536_ = i_535_ * i_535_;
        int i_537_ = i_536_ - i_535_;
        if (i_526_ > i_531_)
            i_526_ = i_531_;
        int i_538_ = i_528_ >>> 24;
        if (i_529_ == 0 || i_529_ == 1 && i_538_ == 255) {
            while (i_532_ < i_526_) {
                for (/**/; i_537_ <= i_533_ || i_536_ <= i_533_;
                         i_537_ += i_534_++ + i_534_)
                    i_536_ += i_534_ + i_534_;
                int i_539_ = i - i_534_ + 1;
                if (i_539_ < this.anInt7496)
                    i_539_ = this.anInt7496;
                int i_540_ = i + i_534_;
                if (i_540_ > this.anInt7507)
                    i_540_ = this.anInt7507;
                int i_541_ = i_539_ + i_532_ * this.anInt7477;
                for (int i_542_ = i_539_; i_542_ < i_540_; i_542_++)
                    this.anIntArray7483[i_541_++] = i_528_;
                i_532_++;
                i_536_ -= i_535_-- + i_535_;
                i_537_ -= i_535_ + i_535_;
            }
            i_534_ = i_527_;
            i_535_ = i_532_ - i_526_;
            i_537_ = i_535_ * i_535_ + i_533_;
            i_536_ = i_537_ - i_534_;
            i_537_ -= i_535_;
            while (i_532_ < i_531_) {
                for (/**/; i_537_ > i_533_ && i_536_ > i_533_;
                         i_536_ -= i_534_ + i_534_)
                    i_537_ -= i_534_-- + i_534_;
                int i_543_ = i - i_534_;
                if (i_543_ < this.anInt7496)
                    i_543_ = this.anInt7496;
                int i_544_ = i + i_534_;
                if (i_544_ > this.anInt7507 - 1)
                    i_544_ = this.anInt7507 - 1;
                int i_545_ = i_543_ + i_532_ * this.anInt7477;
                for (int i_546_ = i_543_; i_546_ <= i_544_; i_546_++)
                    this.anIntArray7483[i_545_++] = i_528_;
                i_532_++;
                i_537_ += i_535_ + i_535_;
                i_536_ += i_535_++ + i_535_;
            }
        } else if (i_529_ == 1) {
            i_528_ = (((i_528_ & 0xff00ff) * i_538_ >> 8 & 0xff00ff)
                    + ((i_528_ & 0xff00) * i_538_ >> 8 & 0xff00)
                    + (i_538_ << 24));
            int i_547_ = 256 - i_538_;
            while (i_532_ < i_526_) {
                for (/**/; i_537_ <= i_533_ || i_536_ <= i_533_;
                         i_537_ += i_534_++ + i_534_)
                    i_536_ += i_534_ + i_534_;
                int i_548_ = i - i_534_ + 1;
                if (i_548_ < this.anInt7496)
                    i_548_ = this.anInt7496;
                int i_549_ = i + i_534_;
                if (i_549_ > this.anInt7507)
                    i_549_ = this.anInt7507;
                int i_550_ = i_548_ + i_532_ * this.anInt7477;
                for (int i_551_ = i_548_; i_551_ < i_549_; i_551_++) {
                    int i_552_ = this.anIntArray7483[i_550_];
                    i_552_ = (((i_552_ & 0xff00ff) * i_547_ >> 8 & 0xff00ff)
                            + ((i_552_ & 0xff00) * i_547_ >> 8 & 0xff00));
                    this.anIntArray7483[i_550_++]
                            = i_528_ + i_552_;
                }
                i_532_++;
                i_536_ -= i_535_-- + i_535_;
                i_537_ -= i_535_ + i_535_;
            }
            i_534_ = i_527_;
            i_535_ = -i_535_;
            i_537_ = i_535_ * i_535_ + i_533_;
            i_536_ = i_537_ - i_534_;
            i_537_ -= i_535_;
            while (i_532_ < i_531_) {
                for (/**/; i_537_ > i_533_ && i_536_ > i_533_;
                         i_536_ -= i_534_ + i_534_)
                    i_537_ -= i_534_-- + i_534_;
                int i_553_ = i - i_534_;
                if (i_553_ < this.anInt7496)
                    i_553_ = this.anInt7496;
                int i_554_ = i + i_534_;
                if (i_554_ > this.anInt7507 - 1)
                    i_554_ = this.anInt7507 - 1;
                int i_555_ = i_553_ + i_532_ * this.anInt7477;
                for (int i_556_ = i_553_; i_556_ <= i_554_; i_556_++) {
                    int i_557_ = this.anIntArray7483[i_555_];
                    i_557_ = (((i_557_ & 0xff00ff) * i_547_ >> 8 & 0xff00ff)
                            + ((i_557_ & 0xff00) * i_547_ >> 8 & 0xff00));
                    this.anIntArray7483[i_555_++]
                            = i_528_ + i_557_;
                }
                i_532_++;
                i_537_ += i_535_ + i_535_;
                i_536_ += i_535_++ + i_535_;
            }
        } else if (i_529_ == 2) {
            while (i_532_ < i_526_) {
                for (/**/; i_537_ <= i_533_ || i_536_ <= i_533_;
                         i_537_ += i_534_++ + i_534_)
                    i_536_ += i_534_ + i_534_;
                int i_558_ = i - i_534_ + 1;
                if (i_558_ < this.anInt7496)
                    i_558_ = this.anInt7496;
                int i_559_ = i + i_534_;
                if (i_559_ > this.anInt7507)
                    i_559_ = this.anInt7507;
                int i_560_ = i_558_ + i_532_ * this.anInt7477;
                for (int i_561_ = i_558_; i_561_ < i_559_; i_561_++) {
                    int i_562_ = this.anIntArray7483[i_560_];
                    int i_563_ = i_528_ + i_562_;
                    int i_564_ = (i_528_ & 0xff00ff) + (i_562_ & 0xff00ff);
                    i_562_
                            = (i_564_ & 0x1000100) + (i_563_ - i_564_ & 0x10000);
                    this.anIntArray7483[i_560_++]
                            = i_563_ - i_562_ | i_562_ - (i_562_ >>> 8);
                }
                i_532_++;
                i_536_ -= i_535_-- + i_535_;
                i_537_ -= i_535_ + i_535_;
            }
            i_534_ = i_527_;
            i_535_ = -i_535_;
            i_537_ = i_535_ * i_535_ + i_533_;
            i_536_ = i_537_ - i_534_;
            i_537_ -= i_535_;
            while (i_532_ < i_531_) {
                for (/**/; i_537_ > i_533_ && i_536_ > i_533_;
                         i_536_ -= i_534_ + i_534_)
                    i_537_ -= i_534_-- + i_534_;
                int i_565_ = i - i_534_;
                if (i_565_ < this.anInt7496)
                    i_565_ = this.anInt7496;
                int i_566_ = i + i_534_;
                if (i_566_ > this.anInt7507 - 1)
                    i_566_ = this.anInt7507 - 1;
                int i_567_ = i_565_ + i_532_ * this.anInt7477;
                for (int i_568_ = i_565_; i_568_ <= i_566_; i_568_++) {
                    int i_569_ = this.anIntArray7483[i_567_];
                    int i_570_ = i_528_ + i_569_;
                    int i_571_ = (i_528_ & 0xff00ff) + (i_569_ & 0xff00ff);
                    i_569_
                            = (i_571_ & 0x1000100) + (i_570_ - i_571_ & 0x10000);
                    this.anIntArray7483[i_567_++]
                            = i_570_ - i_569_ | i_569_ - (i_569_ >>> 8);
                }
                i_532_++;
                i_537_ += i_535_ + i_535_;
                i_536_ += i_535_++ + i_535_;
            }
        } else
            throw new IllegalArgumentException();
    }

    final Class167 method3724(Runnable runnable) {
        for (int i = 0; i < this.anInt7485; i++) {
            if (aClass167Array7480[i].aRunnable2198 == runnable)
                return aClass167Array7480[i];
        }
        return null;
    }

    final int E() {
        return 0;
    }

    final void method3626(int i, int i_572_) throws Exception_Sub1 {
        if (aCanvas7468 == null
                || this.aClass348_Sub31_7469 == null)
            throw new IllegalStateException("off");
        try {
            Graphics graphics = aCanvas7468.getGraphics();
            this.aClass348_Sub31_7469.method3011(0, i, anInt7472,
                    graphics, -1, 0,
                    anInt7465,
                    i_572_);
        } catch (Exception exception) {
            aCanvas7468.repaint();
        }
    }

    final void ZA(int i, float f, float f_573_, float f_574_, float f_575_,
                  float f_576_) {
        this.anInt7474 = (int) (f * 65535.0F);
        this.anInt7478 = (int) (f_573_ * 65535.0F);
        float f_577_
                = (float) Math.sqrt(f_574_ * f_574_ + f_575_ * f_575_
                + f_576_ * f_576_);
        this.anInt7484 = (int) (f_574_ * 65535.0F / f_577_);
        this.anInt7473 = (int) (f_575_ * 65535.0F / f_577_);
        this.anInt7479 = (int) (f_576_ * 65535.0F / f_577_);
    }

    final void method3696(int i) {
        this.anInt7501 = i;
        aClass60_7498.method590(0);
    }

    final void method3669(Canvas canvas, int i, int i_578_) {
        Class348_Sub31 class348_sub31
                = ((Class348_Sub31)
                aClass356_7467.method3480(canvas.hashCode(), -6008));
        if (class348_sub31 != null) {
            class348_sub31.method2715((byte) 95);
            class348_sub31 = Class110.method1035(9029, i_578_, canvas, i);
            aClass356_7467.method3483((byte) 112, canvas.hashCode(),
                    class348_sub31);
            if (aCanvas7468 == canvas && aClass49_7475 == null) {
                Dimension dimension = canvas.getSize();
                anInt7465 = dimension.width;
                anInt7472 = dimension.height;
                this.aClass348_Sub31_7469 = class348_sub31;
                this.anIntArray7483
                        = class348_sub31.anIntArray6916;
                this.anInt7477
                        = class348_sub31.anInt6917;
                anInt7486 = class348_sub31.anInt6920;
                if (this.anInt7477 != anInt7495
                        || anInt7486 != anInt7488) {
                    anInt7481 = anInt7495 = this.anInt7477;
                    anInt7493 = anInt7488 = anInt7486;
                    this.aFloatArray7502
                            = this.aFloatArray7511
                            = new float[anInt7495 * anInt7488];
                }
                method3717();
            }
        }
    }

    final int r(int i, int i_579_, int i_580_, int i_581_, int i_582_,
                int i_583_, int i_584_) {
        float f = ((this.aClass101_Sub1_7492
                .aFloat5662) * (float) i
                + (this.aClass101_Sub1_7492
                .aFloat5680) * (float) i_579_
                + (this.aClass101_Sub1_7492
                .aFloat5664) * (float) i_580_
                + (this.aClass101_Sub1_7492
                .aFloat5681));
        float f_585_
                = ((this.aClass101_Sub1_7492
                .aFloat5662) * (float) i_581_
                + (this.aClass101_Sub1_7492
                .aFloat5680) * (float) i_582_
                + (this.aClass101_Sub1_7492
                .aFloat5664) * (float) i_583_
                + (this.aClass101_Sub1_7492
                .aFloat5681));
        int i_586_ = 0;
        if (f < (float) this.anInt7482
                && f_585_ < (float) this.anInt7482)
            i_586_ |= 0x10;
        else if (f > (float) this.anInt7494
                && f_585_ > (float) this.anInt7494)
            i_586_ |= 0x20;
        int i_587_
                = (int) ((float) this.anInt7491
                * ((this.aClass101_Sub1_7492
                .aFloat5672) * (float) i
                + (this.aClass101_Sub1_7492.aFloat5673
                * (float) i_579_)
                + (this.aClass101_Sub1_7492.aFloat5669
                * (float) i_580_)
                + this.aClass101_Sub1_7492.aFloat5686)
                / (float) i_584_);
        int i_588_
                = (int) ((float) this.anInt7491
                * ((this.aClass101_Sub1_7492
                .aFloat5672) * (float) i_581_
                + (this.aClass101_Sub1_7492.aFloat5673
                * (float) i_582_)
                + (this.aClass101_Sub1_7492.aFloat5669
                * (float) i_583_)
                + this.aClass101_Sub1_7492.aFloat5686)
                / (float) i_584_);
        if (i_587_ < this.anInt7509
                && i_588_ < this.anInt7509)
            i_586_ |= 0x1;
        else if (i_587_ > this.anInt7508
                && i_588_ > this.anInt7508)
            i_586_ |= 0x2;
        int i_589_
                = (int) ((float) this.anInt7497
                * ((this.aClass101_Sub1_7492
                .aFloat5655) * (float) i
                + (this.aClass101_Sub1_7492.aFloat5678
                * (float) i_579_)
                + (this.aClass101_Sub1_7492.aFloat5666
                * (float) i_580_)
                + this.aClass101_Sub1_7492.aFloat5685)
                / (float) i_584_);
        int i_590_
                = (int) ((float) this.anInt7497
                * ((this.aClass101_Sub1_7492
                .aFloat5655) * (float) i_581_
                + (this.aClass101_Sub1_7492.aFloat5678
                * (float) i_582_)
                + (this.aClass101_Sub1_7492.aFloat5666
                * (float) i_583_)
                + this.aClass101_Sub1_7492.aFloat5685)
                / (float) i_584_);
        if (i_589_ < this.anInt7490
                && i_590_ < this.anInt7490)
            i_586_ |= 0x4;
        else if (i_589_ > this.anInt7506
                && i_590_ > this.anInt7506)
            i_586_ |= 0x8;
        return i_586_;
    }

    final boolean method3725(int i) {
        return this.aD4579.method4(-7953, i);
    }

    private ha_Sub1(d var_d) {
        super(var_d);
        aClass356_7467 = new Class356(4);
        this.anInt7474 = 45823;
        aBoolean7489 = false;
        anInt7487 = 0;
        this.anInt7501 = 128;
        this.anInt7476 = 0;
        this.anInt7482 = 50;
        this.anInt7503 = 0;
        this.anInt7496 = 0;
        this.anInt7497 = 512;
        this.anInt7500 = 75518;
        this.anInt7491 = 512;
        anInt7505 = 0;
        this.anInt7494 = 3500;
        this.anInt7507 = 0;
        this.anInt7478 = 78642;
        aClass60_7499 = new Class60(16);
        anInt7512 = -1;
        try {
            aClass60_7498 = new Class60(256);
            this.aClass101_Sub1_7492 = new Class101_Sub1();
            method3631(1);
            method3659(0);
            Class59_Sub2_Sub1.method566(true, true, (byte) -126);
            aBoolean7471 = true;
            anInt7466 = (int) Class62.method599(-70);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            this.method3635((byte) -98);
            throw new RuntimeException("");
        }
    }

    final boolean method3708() {
        return true;
    }

    final void K(int[] is) {
        is[0] = this.anInt7496;
        is[1] = this.anInt7476;
        is[2] = this.anInt7507;
        is[3] = this.anInt7503;
    }

    final za method3702(int i) {
        return null;
    }

    final Interface3 method3665(int i, int i_591_) {
        return method3629(i, i_591_, false);
    }

    final void method3674(int i, int i_592_, int i_593_, int i_594_,
                          int i_595_, int i_596_, int i_597_, int i_598_,
                          int i_599_) {
        i_593_ -= i;
        i_594_ -= i_592_;
        if (i_594_ == 0) {
            if (i_593_ >= 0)
                method3715(i, i_592_, i_593_ + 1, i_595_, i_596_, i_597_,
                        i_598_, i_599_);
            else {
                int i_600_ = i_597_ + i_598_;
                i_599_ %= i_600_;
                i_599_ = i_600_ + i_597_ - i_599_ - (-i_593_ + 1) % i_600_;
                i_599_ %= i_600_;
                if (i_599_ < 0)
                    i_599_ += i_600_;
                method3715(i + i_593_, i_592_, -i_593_ + 1, i_595_, i_596_,
                        i_597_, i_598_, i_599_);
            }
        } else if (i_593_ == 0) {
            if (i_594_ >= 0)
                method3721(i, i_592_, i_594_ + 1, i_595_, i_596_, i_597_,
                        i_598_, i_599_);
            else {
                int i_601_ = i_597_ + i_598_;
                i_599_ %= i_601_;
                i_599_ = i_601_ + i_597_ - i_599_ - (-i_594_ + 1) % i_601_;
                i_599_ %= i_601_;
                if (i_599_ < 0)
                    i_599_ += i_601_;
                method3721(i, i_592_ + i_594_, -i_594_ + 1, i_595_, i_596_,
                        i_597_, i_598_, i_599_);
            }
        } else {
            i_599_ <<= 8;
            i_597_ <<= 8;
            i_598_ <<= 8;
            int i_602_ = i_597_ + i_598_;
            i_599_ %= i_602_;
            if (i_593_ + i_594_ < 0) {
                int i_603_ = (int) (Math.sqrt(i_593_ * i_593_
                        + i_594_ * i_594_)
                        * 256.0);
                int i_604_ = i_603_ % i_602_;
                i_599_ = i_602_ + i_597_ - i_599_ - i_604_;
                i_599_ %= i_602_;
                if (i_599_ < 0)
                    i_599_ += i_602_;
                i += i_593_;
                i_593_ = -i_593_;
                i_592_ += i_594_;
                i_594_ = -i_594_;
            }
            if (i_593_ > i_594_) {
                i_592_ <<= 16;
                i_592_ += 32768;
                i_594_ <<= 16;
                int i_605_ = (int) Math.floor((double) i_594_ / (double) i_593_
                        + 0.5);
                i_593_ += i;
                int i_606_ = i_595_ >>> 24;
                int i_607_
                        = (int) Math.sqrt(65536
                        + (i_605_ >> 8) * (i_605_
                        >> 8));
                if (i_596_ == 0 || i_596_ == 1 && i_606_ == 255) {
                    while (i <= i_593_) {
                        int i_608_ = i_592_ >> 16;
                        if (i >= this.anInt7496
                                && i < this.anInt7507
                                && i_608_ >= this.anInt7476
                                && i_608_ < this.anInt7503
                                && i_599_ < i_597_)
                            this.anIntArray7483
                                    [i + i_608_ * this.anInt7477]
                                    = i_595_;
                        i_592_ += i_605_;
                        i++;
                        i_599_ += i_607_;
                        i_599_ %= i_602_;
                    }
                    return;
                }
                if (i_596_ == 1) {
                    i_595_ = (((i_595_ & 0xff00ff) * i_606_ >> 8 & 0xff00ff)
                            + ((i_595_ & 0xff00) * i_606_ >> 8 & 0xff00)
                            + (i_606_ << 24));
                    int i_609_ = 256 - i_606_;
                    while (i <= i_593_) {
                        int i_610_ = i_592_ >> 16;
                        if (i >= this.anInt7496
                                && i < this.anInt7507
                                && i_610_ >= this.anInt7476
                                && i_610_ < this.anInt7503
                                && i_599_ < i_597_) {
                            int i_611_
                                    = i + i_610_ * this.anInt7477;
                            int i_612_
                                    = this.anIntArray7483[i_611_];
                            i_612_ = (((i_612_ & 0xff00ff) * i_609_ >> 8
                                    & 0xff00ff)
                                    + ((i_612_ & 0xff00) * i_609_ >> 8
                                    & 0xff00));
                            this.anIntArray7483[i_611_]
                                    = i_595_ + i_612_;
                        }
                        i_592_ += i_605_;
                        i++;
                        i_599_ += i_607_;
                        i_599_ %= i_602_;
                    }
                    return;
                }
                if (i_596_ == 2) {
                    while (i <= i_593_) {
                        int i_613_ = i_592_ >> 16;
                        if (i >= this.anInt7496
                                && i < this.anInt7507
                                && i_613_ >= this.anInt7476
                                && i_613_ < this.anInt7503
                                && i_599_ < i_597_) {
                            int i_614_
                                    = i + i_613_ * this.anInt7477;
                            int i_615_
                                    = this.anIntArray7483[i_614_];
                            int i_616_ = i_595_ + i_615_;
                            int i_617_
                                    = (i_595_ & 0xff00ff) + (i_615_ & 0xff00ff);
                            i_615_ = (i_617_ & 0x1000100) + (i_616_ - i_617_
                                    & 0x10000);
                            this.anIntArray7483[i_614_]
                                    = i_616_ - i_615_ | i_615_ - (i_615_ >>> 8);
                        }
                        i_592_ += i_605_;
                        i++;
                        i_599_ += i_607_;
                        i_599_ %= i_602_;
                    }
                    return;
                }
                throw new IllegalArgumentException();
            }
            i <<= 16;
            i += 32768;
            i_593_ <<= 16;
            int i_618_
                    = (int) Math.floor((double) i_593_ / (double) i_594_ + 0.5);
            i_594_ += i_592_;
            int i_619_ = i_595_ >>> 24;
            int i_620_
                    = (int) Math.sqrt(65536
                    + (i_618_ >> 8) * (i_618_ >> 8));
            if (i_596_ == 0 || i_596_ == 1 && i_619_ == 255) {
                while (i_592_ <= i_594_) {
                    int i_621_ = i >> 16;
                    if (i_592_ >= this.anInt7476
                            && i_592_ < this.anInt7503
                            && i_621_ >= this.anInt7496
                            && i_621_ < this.anInt7507
                            && i_599_ < i_597_)
                        this.anIntArray7483
                                [i_621_ + i_592_ * this.anInt7477]
                                = i_595_;
                    i += i_618_;
                    i_592_++;
                    i_599_ += i_620_;
                    i_599_ %= i_602_;
                }
            } else if (i_596_ == 1) {
                i_595_ = (((i_595_ & 0xff00ff) * i_619_ >> 8 & 0xff00ff)
                        + ((i_595_ & 0xff00) * i_619_ >> 8 & 0xff00)
                        + (i_619_ << 24));
                int i_622_ = 256 - i_619_;
                while (i_592_ <= i_594_) {
                    int i_623_ = i >> 16;
                    if (i_592_ >= this.anInt7476
                            && i_592_ < this.anInt7503
                            && i_623_ >= this.anInt7496
                            && i_623_ < this.anInt7507
                            && i_599_ < i_597_) {
                        int i_624_
                                = i_623_ + i_592_ * this.anInt7477;
                        int i_625_ = this.anIntArray7483[i_624_];
                        i_625_
                                = (((i_625_ & 0xff00ff) * i_622_ >> 8 & 0xff00ff)
                                + ((i_625_ & 0xff00) * i_622_ >> 8 & 0xff00));
                        this.anIntArray7483
                                [i_623_ + i_592_ * this.anInt7477]
                                = i_595_ + i_625_;
                    }
                    i += i_618_;
                    i_592_++;
                    i_599_ += i_620_;
                    i_599_ %= i_602_;
                }
            } else if (i_596_ == 2) {
                while (i_592_ <= i_594_) {
                    int i_626_ = i >> 16;
                    if (i_592_ >= this.anInt7476
                            && i_592_ < this.anInt7503
                            && i_626_ >= this.anInt7496
                            && i_626_ < this.anInt7507
                            && i_599_ < i_597_) {
                        int i_627_
                                = i_626_ + i_592_ * this.anInt7477;
                        int i_628_ = this.anIntArray7483[i_627_];
                        int i_629_ = i_595_ + i_628_;
                        int i_630_ = (i_595_ & 0xff00ff) + (i_628_ & 0xff00ff);
                        i_628_ = (i_630_ & 0x1000100) + (i_629_ - i_630_
                                & 0x10000);
                        this.anIntArray7483[i_627_]
                                = i_629_ - i_628_ | i_628_ - (i_628_ >>> 8);
                    }
                    i += i_618_;
                    i_592_++;
                    i_599_ += i_620_;
                    i_599_ %= i_602_;
                }
            } else
                throw new IllegalArgumentException();
        }
    }

    final void X(int i) {
        /* empty */
    }

    final Class365 c() {
        return new Class365(0, "Pure Java", 1, "CPU", 0L);
    }

    final void method3659(int i) {
        aClass167Array7480[i].method1291(10000, Thread.currentThread());
    }

    final void method3707(Rectangle[] rectangles, int i, int i_631_,
                          int i_632_) throws Exception_Sub1 {
        if (aCanvas7468 == null
                || this.aClass348_Sub31_7469 == null)
            throw new IllegalStateException("off");
        try {
            Graphics graphics = aCanvas7468.getGraphics();
            for (int i_633_ = 0; i_633_ < i; i_633_++) {
                Rectangle rectangle = rectangles[i_633_];
                if (rectangle.x + i_631_ <= this.anInt7477
                        && rectangle.y + i_632_ <= anInt7486
                        && rectangle.x + i_631_ + rectangle.width > 0
                        && rectangle.y + i_632_ + rectangle.height > 0)
                    this.aClass348_Sub31_7469.method3011
                            (rectangle.y, rectangle.x + i_631_, rectangle.height,
                                    graphics, -1, rectangle.x, rectangle.width,
                                    rectangle.y + i_632_);
            }
        } catch (Exception exception) {
            aCanvas7468.repaint();
        }
    }

    final int M() {
        int i = anInt7505;
        anInt7505 = 0;
        return i;
    }

    final int method3726(int i) {
        return this.aD4579.method3(i, -6662).anInt200;
    }

    final int I() {
        int i = anInt7487;
        anInt7487 = 0;
        return i;
    }

    final int method3704() {
        return 0;
    }

    final void method3646(int i) {
        int i_634_ = i - anInt7466;
        for (Object object = aClass60_7498.method588(-5052); object != null;
             object = aClass60_7498.method579(-117)) {
            Class348_Sub25 class348_sub25 = (Class348_Sub25) object;
            if (class348_sub25.aBoolean6882) {
                class348_sub25.anInt6879 += i_634_;
                int i_635_ = class348_sub25.anInt6879 / 20;
                if (i_635_ > 0) {
                    Class12 class12
                            = this.aD4579.method3((class348_sub25
                                    .anInt6883),
                            -6662);
                    class348_sub25.method2995((class12.aByte198
                                    * i_634_ * 50 / 1000),
                            (class12.aByte211
                                    * i_634_ * 50 / 1000));
                    class348_sub25.anInt6879 -= i_635_ * 20;
                }
                class348_sub25.aBoolean6882 = false;
            }
        }
        anInt7466 = i;
        aClass60_7499.method578(2, 5);
        aClass60_7498.method578(2, 5);
    }

    final boolean method3694() {
        return true;
    }

    final void da(int i, int i_636_, int i_637_, int[] is) {
        float f = ((this.aClass101_Sub1_7492
                .aFloat5681)
                + ((this.aClass101_Sub1_7492
                .aFloat5662) * (float) i
                + (this.aClass101_Sub1_7492
                .aFloat5680) * (float) i_636_
                + (this.aClass101_Sub1_7492
                .aFloat5664) * (float) i_637_));
        if (f >= (float) this.anInt7482 && f <= (float) this.anInt7494) {
            int i_638_
                    = (int) ((float) this.anInt7491
                    * (this.aClass101_Sub1_7492.aFloat5686
                    + ((this.aClass101_Sub1_7492
                    .aFloat5672) * (float) i
                    + (this.aClass101_Sub1_7492
                    .aFloat5673) * (float) i_636_
                    + (this.aClass101_Sub1_7492
                    .aFloat5669) * (float) i_637_))
                    / f);
            int i_639_
                    = (int) ((float) this.anInt7497
                    * (this.aClass101_Sub1_7492.aFloat5685
                    + ((this.aClass101_Sub1_7492
                    .aFloat5655) * (float) i
                    + (this.aClass101_Sub1_7492
                    .aFloat5678) * (float) i_636_
                    + (this.aClass101_Sub1_7492
                    .aFloat5666) * (float) i_637_))
                    / f);
            if (i_638_ >= this.anInt7509
                    && i_638_ <= this.anInt7508
                    && i_639_ >= this.anInt7490
                    && i_639_ <= this.anInt7506) {
                is[0] = i_638_ - this.anInt7509;
                is[1] = i_639_ - this.anInt7490;
                is[2] = (int) f;
            } else
                is[0] = is[1] = is[2] = -1;
        } else is[0] = is[1] = is[2] = -1;
    }

    final void method3673() {
        /* empty */
    }

    final boolean method3644() {
        return false;
    }

    final void method3663() {
        aClass60_7498.method590(0);
        aClass60_7499.method590(0);
    }

    final int method3679(int i, int i_640_) {
        return i | i_640_;
    }

    final boolean method3727(int i) {
        return aBoolean7489
                || this.aD4579.method3(i, -6662).aBoolean199;
    }
}
