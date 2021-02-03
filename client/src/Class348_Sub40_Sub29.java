/* Class348_Sub40_Sub29 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class348_Sub40_Sub29 extends Class348_Sub40 {
    static int anInt9371;
    static int anInt9372 = 1;
    static int anInt9373;
    private int anInt9374;
    private int[] anIntArray9375;
    static int anInt9376;
    static int anInt9377;
    static int anInt9378;
    private int anInt9379;
    private int anInt9380 = -1;
    static int anInt9381;
    static int anInt9382;

    final int[][] method3047(int i, int i_0_) {
        if (i_0_ != -1564599039) return null;
        anInt9378++;
        int[][] is = this.aClass322_7033.method2557(-94, i);
        if (this.aClass322_7033.aBoolean4035) {
            int i_1_ = (anInt9374 * (Class286_Sub2.anInt6212 == anInt9379 ? i : anInt9379 * i / Class286_Sub2.anInt6212));
            int[] is_2_ = is[0];
            int[] is_3_ = is[1];
            int[] is_4_ = is[2];
            if (Class348_Sub40_Sub6.anInt9139 == anInt9374) {
                for (int i_8_ = 0; (Class348_Sub40_Sub6.anInt9139 > i_8_); i_8_++) {
                    int i_9_ = anIntArray9375[i_1_++];
                    is_4_[i_8_] = Class139.method1166(255, i_9_) << 4;
                    is_3_[i_8_] = Class139.method1166(i_9_ >> 4, 4080);
                    is_2_[i_8_] = Class139.method1166(16711680, i_9_) >> 12;
                }
            } else {
                for (int i_5_ = 0; i_5_ < Class348_Sub40_Sub6.anInt9139; i_5_++) {
                    int i_6_ = anInt9374 * i_5_ / Class348_Sub40_Sub6.anInt9139;
                    int i_7_ = anIntArray9375[i_6_ + i_1_];
                    is_4_[i_5_] = Class139.method1166(i_7_, 255) << 4;
                    is_3_[i_5_] = Class139.method1166(65280, i_7_) >> 4;
                    is_2_[i_5_] = Class139.method1166(i_7_ >> 12, 4080);
                }
            }
        }
        return is;
    }

    final void method3045(int i, int i_10_, int i_11_) {
        super.method3045(i, i_10_, i_11_);
        anInt9382++;
        if (anInt9380 >= 0 && Class286_Sub5.aD6247 != null) {
            int i_12_ = (!(Class286_Sub5.aD6247.method3(anInt9380, -6662).aBoolean199) ? 128 : 64);
            anIntArray9375 = Class286_Sub5.aD6247.method5(false, anInt9380, 1.0F, i_12_, i_12_, -123);
            anInt9379 = i_12_;
            anInt9374 = i_12_;
        }
    }

    public Class348_Sub40_Sub29() {
        super(0, false);
    }

    final void method3046(byte i) {
        if (i >= -102) anInt9374 = -104;
        anInt9373++;
        super.method3046((byte) -107);
        anIntArray9375 = null;
    }

    static final boolean method3124(int i, byte i_13_, int i_14_) {
        anInt9371++;
        if (i_13_ > -55) method3124(-76, (byte) -110, -59);
        return (i_14_ & 0x40000) != 0 | Class348_Sub23_Sub4.method2985(-31735, i, i_14_) || Class348_Sub42_Sub8_Sub2.method3200(i_14_, i, (byte) -120);
    }

    final void method3049(Class348_Sub49 class348_sub49, int i, int i_15_) {
        if (i_15_ == 31015) {
            if (i == 0) anInt9380 = class348_sub49.readUnsignedShort(842397944);
            anInt9376++;
        }
    }

    static final boolean method3125(int i, int i_16_, int i_17_, int i_18_, int i_19_, byte i_20_, int i_21_, int i_22_, int i_23_, int i_24_) {
        anInt9377++;
        if (i_16_ > 2000 || i_21_ > 2000 || i_24_ > 2000 || i_23_ > 2000 || i_17_ > 2000 || i > 2000) return false;
        if (i_16_ < -2000 || i_21_ < -2000 || i_24_ < -2000 || i_23_ < -2000 || i_17_ < -2000 || i < -2000) return false;
        if (Class350.anInt4319 == 2) {
            int i_25_ = i_23_ + i_16_ * Class306.anInt3872;
            if (i_25_ >= 0 && Class14.anIntArray5091.length > i_25_ && Class14.anIntArray5091[i_25_] > -38400 + (i_22_ << 8)) return false;
            i_25_ = i_17_ + i_21_ * Class306.anInt3872;
            if (i_25_ >= 0 && Class14.anIntArray5091.length > i_25_ && ((i_19_ << 8) + -38400 < Class14.anIntArray5091[i_25_])) return false;
            i_25_ = i + i_24_ * Class306.anInt3872;
            if (i_25_ >= 0 && Class14.anIntArray5091.length > i_25_ && (Class14.anIntArray5091[i_25_] > (i_18_ << 8) - 38400)) return false;
        }
        int i_26_ = -i_23_ + i_17_;
        int i_27_ = i_21_ - i_16_;
        int i_28_ = -i_23_ + i;
        int i_29_ = -i_16_ + i_24_;
        int i_30_ = -i_22_ + i_19_;
        if (i_16_ < i_21_ && i_24_ > i_24_) {
            i_16_--;
            if (i_24_ < i_21_) i_21_++;
            else i_24_++;
        } else if (i_21_ >= i_24_) {
            i_24_--;
            if (i_21_ < i_16_) i_16_++;
            else i_21_++;
        } else {
            i_21_--;
            if (i_16_ > i_24_) i_16_++;
            else i_24_++;
        }
        int i_31_ = -i_22_ + i_18_;
        int i_32_ = 0;
        if (i_21_ != i_16_) i_32_ = (i_17_ - i_23_ << 12) / (i_21_ - i_16_);
        int i_33_ = 0;
        if (i_21_ != i_24_) i_33_ = (-i_17_ + i << 12) / (i_24_ + -i_21_);
        if (i_20_ >= -7) anInt9372 = 8;
        int i_34_ = 0;
        if (i_24_ != i_16_) i_34_ = (i_23_ + -i << 12) / (i_16_ - i_24_);
        int i_35_ = -(i_27_ * i_28_) + i_29_ * i_26_;
        if (i_35_ == 0) return false;
        int i_36_ = (-(i_31_ * i_27_) + i_30_ * i_29_ << 8) / i_35_;
        int i_37_ = (i_26_ * i_31_ + -(i_30_ * i_28_) << 8) / i_35_;
        if (i_16_ > i_21_ || i_24_ < i_16_) {
            if (i_24_ < i_21_) {
                if (Class86.anInt1480 <= i_24_) return true;
                i_18_ = -(i_36_ * i) + ((i_18_ << 8) - -i_36_);
                if (Class86.anInt1480 < i_16_) i_16_ = Class86.anInt1480;
                if (Class86.anInt1480 < i_21_) i_21_ = Class86.anInt1480;
                if (i_21_ > i_16_) {
                    i_17_ = i <<= -1549996884;
                    i_23_ <<= 869809292;
                    if (i_24_ < 0) {
                        i_18_ -= i_24_ * i_37_;
                        i -= i_34_ * i_24_;
                        i_17_ -= i_24_ * i_33_;
                        i_24_ = 0;
                    }
                    if (i_16_ < 0) {
                        i_23_ -= i_16_ * i_32_;
                        i_16_ = 0;
                    }
                    if (i_34_ > i_33_) {
                        i_21_ -= i_16_;
                        i_16_ -= i_24_;
                        i_24_ *= Class306.anInt3872;
                        while (--i_16_ >= 0) {
                            if (!Class76.method771(i_36_, (byte) -25, i_18_, 0, 1 + (i >> 12), (i_17_ >> 12) - 1, Class14.anIntArray5091, i_24_)) return false;
                            i_24_ += Class306.anInt3872;
                            i += i_34_;
                            i_17_ += i_33_;
                            i_18_ += i_37_;
                        }
                        while (--i_21_ >= 0) {
                            if (!Class76.method771(i_36_, (byte) -25, i_18_, 0, 1 + (i_23_ >> 12), -1 + (i_17_ >> 12), Class14.anIntArray5091, i_24_)) return false;
                            i_24_ += Class306.anInt3872;
                            i_23_ += i_32_;
                            i_18_ += i_37_;
                            i_17_ += i_33_;
                        }
                        return true;
                    }
                    i_21_ -= i_16_;
                    i_16_ -= i_24_;
                    i_24_ *= Class306.anInt3872;
                    while (--i_16_ >= 0) {
                        if (!Class76.method771(i_36_, (byte) -25, i_18_, 0, (i_17_ >> 12) + 1, -1 + (i >> 12), Class14.anIntArray5091, i_24_)) return false;
                        i_18_ += i_37_;
                        i_17_ += i_33_;
                        i_24_ += Class306.anInt3872;
                        i += i_34_;
                    }
                    while (--i_21_ >= 0) {
                        if (!Class76.method771(i_36_, (byte) -25, i_18_, 0, (i_17_ >> 12) - -1, (i_23_ >> 12) - 1, Class14.anIntArray5091, i_24_)) return false;
                        i_18_ += i_37_;
                        i_17_ += i_33_;
                        i_24_ += Class306.anInt3872;
                        i_23_ += i_32_;
                    }
                    return true;
                }
                i_23_ = i <<= -384535508;
                if (i_24_ < 0) {
                    i_23_ -= i_33_ * i_24_;
                    i -= i_34_ * i_24_;
                    i_18_ -= i_24_ * i_37_;
                    i_24_ = 0;
                }
                i_17_ <<= 1142396620;
                if (i_21_ < 0) {
                    i_17_ -= i_21_ * i_32_;
                    i_21_ = 0;
                }
                if (i_33_ >= i_34_) {
                    i_16_ -= i_21_;
                    i_21_ -= i_24_;
                    i_24_ *= Class306.anInt3872;
                    while (--i_21_ >= 0) {
                        if (!Class76.method771(i_36_, (byte) -25, i_18_, 0, (i_23_ >> 12) - -1, (i >> 12) - 1, Class14.anIntArray5091, i_24_)) return false;
                        i_18_ += i_37_;
                        i_24_ += Class306.anInt3872;
                        i_23_ += i_33_;
                        i += i_34_;
                    }
                    while (--i_16_ >= 0) {
                        if (!Class76.method771(i_36_, (byte) -25, i_18_, 0, (i_17_ >> 12) - -1, (i >> 12) + -1, Class14.anIntArray5091, i_24_)) return false;
                        i += i_34_;
                        i_17_ += i_32_;
                        i_18_ += i_37_;
                        i_24_ += Class306.anInt3872;
                    }
                    return true;
                }
                i_16_ -= i_21_;
                i_21_ -= i_24_;
                i_24_ = Class306.anInt3872 * i_24_;
                while (--i_21_ >= 0) {
                    if (!Class76.method771(i_36_, (byte) -25, i_18_, 0, 1 + (i >> 12), -1 + (i_23_ >> 12), Class14.anIntArray5091, i_24_)) return false;
                    i += i_34_;
                    i_24_ += Class306.anInt3872;
                    i_23_ += i_33_;
                    i_18_ += i_37_;
                }
                while (--i_16_ >= 0) {
                    if (!Class76.method771(i_36_, (byte) -25, i_18_, 0, (i >> 12) - -1, -1 + (i_17_ >> 12), Class14.anIntArray5091, i_24_)) return false;
                    i_18_ += i_37_;
                    i_17_ += i_32_;
                    i_24_ += Class306.anInt3872;
                    i += i_34_;
                }
                return true;
            }
            if (Class86.anInt1480 <= i_21_) return true;
            i_19_ = i_36_ + -(i_17_ * i_36_) + (i_19_ << 8);
            if (Class86.anInt1480 < i_24_) i_24_ = Class86.anInt1480;
            if (Class86.anInt1480 < i_16_) i_16_ = Class86.anInt1480;
            if (i_24_ >= i_16_) {
                i = i_17_ <<= 1841711244;
                i_23_ <<= -258927156;
                if (i_21_ < 0) {
                    i -= i_32_ * i_21_;
                    i_19_ -= i_21_ * i_37_;
                    i_17_ -= i_33_ * i_21_;
                    i_21_ = 0;
                }
                if (i_16_ < 0) {
                    i_23_ -= i_34_ * i_16_;
                    i_16_ = 0;
                }
                if (i_32_ >= i_33_) {
                    i_24_ -= i_16_;
                    i_16_ -= i_21_;
                    i_21_ = Class306.anInt3872 * i_21_;
                    while (--i_16_ >= 0) {
                        if (!Class76.method771(i_36_, (byte) -25, i_19_, 0, (i >> 12) - -1, (i_17_ >> 12) - 1, Class14.anIntArray5091, i_21_)) return false;
                        i_17_ += i_33_;
                        i_19_ += i_37_;
                        i_21_ += Class306.anInt3872;
                        i += i_32_;
                    }
                    while (--i_24_ >= 0) {
                        if (!Class76.method771(i_36_, (byte) -25, i_19_, 0, (i_23_ >> 12) - -1, -1 + (i_17_ >> 12), Class14.anIntArray5091, i_21_)) return false;
                        i_19_ += i_37_;
                        i_21_ += Class306.anInt3872;
                        i_17_ += i_33_;
                        i_23_ += i_34_;
                    }
                    return true;
                }
                i_24_ -= i_16_;
                i_16_ -= i_21_;
                i_21_ = Class306.anInt3872 * i_21_;
                while (--i_16_ >= 0) {
                    if (!Class76.method771(i_36_, (byte) -25, i_19_, 0, 1 + (i_17_ >> 12), (i >> 12) - 1, Class14.anIntArray5091, i_21_)) return false;
                    i_21_ += Class306.anInt3872;
                    i_17_ += i_33_;
                    i_19_ += i_37_;
                    i += i_32_;
                }
                while (--i_24_ >= 0) {
                    if (!Class76.method771(i_36_, (byte) -25, i_19_, 0, 1 + (i_17_ >> 12), (i_23_ >> 12) - 1, Class14.anIntArray5091, i_21_)) return false;
                    i_17_ += i_33_;
                    i_23_ += i_34_;
                    i_19_ += i_37_;
                    i_21_ += Class306.anInt3872;
                }
                return true;
            }
            i_23_ = i_17_ <<= -575323604;
            i <<= 1434108396;
            if (i_21_ < 0) {
                i_23_ -= i_32_ * i_21_;
                i_17_ -= i_21_ * i_33_;
                i_19_ -= i_37_ * i_21_;
                i_21_ = 0;
            }
            if (i_24_ < 0) {
                i -= i_34_ * i_24_;
                i_24_ = 0;
            }
            if (i_24_ != i_21_ && i_33_ > i_32_ || (i_24_ == i_21_ && i_32_ > i_34_)) {
                i_16_ -= i_24_;
                i_24_ -= i_21_;
                i_21_ = Class306.anInt3872 * i_21_;
                while (--i_24_ >= 0) {
                    if (!Class76.method771(i_36_, (byte) -25, i_19_, 0, (i_17_ >> 12) - -1, -1 + (i_23_ >> 12), Class14.anIntArray5091, i_21_)) return false;
                    i_23_ += i_32_;
                    i_19_ += i_37_;
                    i_21_ += Class306.anInt3872;
                    i_17_ += i_33_;
                }
                while (--i_16_ >= 0) {
                    if (!Class76.method771(i_36_, (byte) -25, i_19_, 0, (i >> 12) - -1, -1 + (i_23_ >> 12), Class14.anIntArray5091, i_21_)) return false;
                    i_23_ += i_32_;
                    i += i_34_;
                    i_19_ += i_37_;
                    i_21_ += Class306.anInt3872;
                }
                return true;
            }
            i_16_ -= i_24_;
            i_24_ -= i_21_;
            i_21_ = Class306.anInt3872 * i_21_;
            while (--i_24_ >= 0) {
                if (!Class76.method771(i_36_, (byte) -25, i_19_, 0, (i_23_ >> 12) - -1, (i_17_ >> 12) - 1, Class14.anIntArray5091, i_21_)) return false;
                i_17_ += i_33_;
                i_23_ += i_32_;
                i_21_ += Class306.anInt3872;
                i_19_ += i_37_;
            }
            while (--i_16_ >= 0) {
                if (!Class76.method771(i_36_, (byte) -25, i_19_, 0, (i_23_ >> 12) - -1, -1 + (i >> 12), Class14.anIntArray5091, i_21_)) return false;
                i_19_ += i_37_;
                i_21_ += Class306.anInt3872;
                i_23_ += i_32_;
                i += i_34_;
            }
            return true;
        }
        if (i_16_ >= Class86.anInt1480) return true;
        i_22_ = (i_22_ << 8) - (i_23_ * i_36_ + -i_36_);
        if (Class86.anInt1480 < i_24_) i_24_ = Class86.anInt1480;
        if (Class86.anInt1480 < i_21_) i_21_ = Class86.anInt1480;
        if (i_24_ > i_21_) {
            i = i_23_ <<= 1361045260;
            if (i_16_ < 0) {
                i_23_ -= i_32_ * i_16_;
                i_22_ -= i_16_ * i_37_;
                i -= i_16_ * i_34_;
                i_16_ = 0;
            }
            i_17_ <<= 1453497388;
            if (i_21_ < 0) {
                i_17_ -= i_21_ * i_33_;
                i_21_ = 0;
            }
            if (i_21_ != i_16_ && i_32_ > i_34_ || (i_16_ == i_21_ && i_34_ > i_33_)) {
                i_24_ -= i_21_;
                i_21_ -= i_16_;
                i_16_ *= Class306.anInt3872;
                while (--i_21_ >= 0) {
                    if (!Class76.method771(i_36_, (byte) -25, i_22_, 0, 1 + (i_23_ >> 12), -1 + (i >> 12), Class14.anIntArray5091, i_16_)) return false;
                    i_22_ += i_37_;
                    i_16_ += Class306.anInt3872;
                    i_23_ += i_32_;
                    i += i_34_;
                }
                while (--i_24_ >= 0) {
                    if (!Class76.method771(i_36_, (byte) -25, i_22_, 0, 1 + (i_17_ >> 12), (i >> 12) + -1, Class14.anIntArray5091, i_16_)) return false;
                    i_17_ += i_33_;
                    i += i_34_;
                    i_22_ += i_37_;
                    i_16_ += Class306.anInt3872;
                }
                return true;
            }
            i_24_ -= i_21_;
            i_21_ -= i_16_;
            i_16_ *= Class306.anInt3872;
            while (--i_21_ >= 0) {
                if (!Class76.method771(i_36_, (byte) -25, i_22_, 0, 1 + (i >> 12), (i_23_ >> 12) + -1, Class14.anIntArray5091, i_16_)) return false;
                i_16_ += Class306.anInt3872;
                i_22_ += i_37_;
                i += i_34_;
                i_23_ += i_32_;
            }
            while (--i_24_ >= 0) {
                if (!Class76.method771(i_36_, (byte) -25, i_22_, 0, (i >> 12) - -1, -1 + (i_17_ >> 12), Class14.anIntArray5091, i_16_)) return false;
                i_17_ += i_33_;
                i_16_ += Class306.anInt3872;
                i_22_ += i_37_;
                i += i_34_;
            }
            return true;
        }
        i_17_ = i_23_ <<= 1488621804;
        if (i_16_ < 0) {
            i_17_ -= i_34_ * i_16_;
            i_22_ -= i_16_ * i_37_;
            i_23_ -= i_32_ * i_16_;
            i_16_ = 0;
        }
        i <<= -1533082100;
        if (i_24_ < 0) {
            i -= i_24_ * i_33_;
            i_24_ = 0;
        }
        if ((i_16_ == i_24_ || i_32_ <= i_34_) && (i_24_ != i_16_ || i_32_ >= i_33_)) {
            i_21_ -= i_24_;
            i_24_ -= i_16_;
            i_16_ = Class306.anInt3872 * i_16_;
            while (--i_24_ >= 0) {
                if (!Class76.method771(i_36_, (byte) -25, i_22_, 0, 1 + (i_17_ >> 12), -1 + (i_23_ >> 12), Class14.anIntArray5091, i_16_)) return false;
                i_17_ += i_34_;
                i_23_ += i_32_;
                i_22_ += i_37_;
                i_16_ += Class306.anInt3872;
            }
            while (--i_21_ >= 0) {
                if (!Class76.method771(i_36_, (byte) -25, i_22_, 0, (i >> 12) - -1, -1 + (i_23_ >> 12), Class14.anIntArray5091, i_16_)) return false;
                i_23_ += i_32_;
                i_22_ += i_37_;
                i += i_33_;
                i_16_ += Class306.anInt3872;
            }
            return true;
        }
        i_21_ -= i_24_;
        i_24_ -= i_16_;
        i_16_ *= Class306.anInt3872;
        while (--i_24_ >= 0) {
            if (!Class76.method771(i_36_, (byte) -25, i_22_, 0, 1 + (i_23_ >> 12), -1 + (i_17_ >> 12), Class14.anIntArray5091, i_16_)) return false;
            i_16_ += Class306.anInt3872;
            i_23_ += i_32_;
            i_22_ += i_37_;
            i_17_ += i_34_;
        }
        while (--i_21_ >= 0) {
            if (!Class76.method771(i_36_, (byte) -25, i_22_, 0, (i_23_ >> 12) - -1, (i >> 12) - 1, Class14.anIntArray5091, i_16_)) return false;
            i_16_ += Class306.anInt3872;
            i += i_33_;
            i_22_ += i_37_;
            i_23_ += i_32_;
        }
        return true;
    }

    final int method3043(int i) {
        if (i != -1) anInt9379 = 10;
        anInt9381++;
        return anInt9380;
    }
}
