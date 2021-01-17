/* r_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class r_Sub2 extends r {
    static Class45 aClass45_10480;
    static int anInt10481;
    int anInt10482;
    static int anInt10483 = 0;
    int anInt10484;
    static int anInt10485;
    byte[] aByteArray10486;
    int anInt10487;
    static Class252 aClass252_10488;
    int anInt10489;
    static int anInt10490;
    static int anInt10491;
    static Class262 aClass262_10492 = new Class262();

    final void method3292(int i, int i_0_, int i_1_, int i_2_, int i_3_) {
        this.anInt10484 = i_1_;
        this.anInt10489 = i_3_;
        anInt10481++;
        this.anInt10487 = i - i_1_;
        if (i_2_ == 25053) this.anInt10482 = i_0_ + -i_3_;
    }

    final void method3293(byte i) {
        anInt10485++;
        int i_4_ = -1;
        int i_5_ = -8 + this.aByteArray10486.length;
        while (i_5_ > i_4_) {
            this.aByteArray10486[++i_4_] = (byte) 0;
            this.aByteArray10486[++i_4_] = (byte) 0;
            this.aByteArray10486[++i_4_] = (byte) 0;
            this.aByteArray10486[++i_4_] = (byte) 0;
            this.aByteArray10486[++i_4_] = (byte) 0;
            this.aByteArray10486[++i_4_] = (byte) 0;
            this.aByteArray10486[++i_4_] = (byte) 0;
            this.aByteArray10486[++i_4_] = (byte) 0;
        }
        if (i == 0) {
            while (i_4_ < this.aByteArray10486.length - 1) this.aByteArray10486[++i_4_] = (byte) 0;
        }
    }

    final void method3294(int i, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_) {
        anInt10491++;
        int i_12_ = 0;
        if (i_11_ != i_7_) i_12_ = (-i_6_ + i_9_ << 16) / (i_11_ + -i_7_);
        int i_13_ = 71 % ((-38 - i_8_) / 52);
        int i_14_ = 0;
        if (i_11_ != i_10_) i_14_ = (i - i_9_ << 16) / (-i_11_ + i_10_);
        int i_15_ = 0;
        if (i_10_ != i_7_) i_15_ = (i_6_ - i << 16) / (i_7_ + -i_10_);
        if (i_11_ >= i_7_ && i_7_ <= i_10_) {
            if (i_10_ > i_11_) {
                i = i_6_ <<= -1167965648;
                if (i_7_ < 0) {
                    i -= i_7_ * i_15_;
                    i_6_ -= i_12_ * i_7_;
                    i_7_ = 0;
                }
                i_9_ <<= -1709216688;
                if (i_11_ < 0) {
                    i_9_ -= i_14_ * i_11_;
                    i_11_ = 0;
                }
                if ((i_7_ == i_11_ || i_15_ >= i_12_) && (i_7_ != i_11_ || i_14_ >= i_15_)) {
                    i_10_ -= i_11_;
                    i_11_ -= i_7_;
                    i_7_ = this.anInt10482 * i_7_;
                    while (--i_11_ >= 0) {
                        Class304.method2289(i_6_ >> 16, i_7_, -36, 0, this.aByteArray10486, i >> 16);
                        i_6_ += i_12_;
                        i_7_ += this.anInt10482;
                        i += i_15_;
                    }
                    while (--i_10_ >= 0) {
                        Class304.method2289(i_9_ >> 16, i_7_, -104, 0, this.aByteArray10486, i >> 16);
                        i += i_15_;
                        i_7_ += this.anInt10482;
                        i_9_ += i_14_;
                    }
                } else {
                    i_10_ -= i_11_;
                    i_11_ -= i_7_;
                    i_7_ = this.anInt10482 * i_7_;
                    while (--i_11_ >= 0) {
                        Class304.method2289(i >> 16, i_7_, -111, 0, this.aByteArray10486, i_6_ >> 16);
                        i_7_ += this.anInt10482;
                        i += i_15_;
                        i_6_ += i_12_;
                    }
                    while (--i_10_ >= 0) {
                        Class304.method2289(i >> 16, i_7_, -120, 0, this.aByteArray10486, i_9_ >> 16);
                        i_9_ += i_14_;
                        i_7_ += this.anInt10482;
                        i += i_15_;
                    }
                }
            } else {
                i_9_ = i_6_ <<= -1228970768;
                if (i_7_ < 0) {
                    i_6_ -= i_12_ * i_7_;
                    i_9_ -= i_15_ * i_7_;
                    i_7_ = 0;
                }
                i <<= -1758318000;
                if (i_10_ < 0) {
                    i -= i_14_ * i_10_;
                    i_10_ = 0;
                }
                if ((i_7_ == i_10_ || i_12_ <= i_15_) && (i_10_ != i_7_ || i_14_ <= i_12_)) {
                    i_11_ -= i_10_;
                    i_10_ -= i_7_;
                    i_7_ = this.anInt10482 * i_7_;
                    while (--i_10_ >= 0) {
                        Class304.method2289(i_6_ >> 16, i_7_, -75, 0, this.aByteArray10486, i_9_ >> 16);
                        i_9_ += i_15_;
                        i_7_ += this.anInt10482;
                        i_6_ += i_12_;
                    }
                    while (--i_11_ >= 0) {
                        Class304.method2289(i_6_ >> 16, i_7_, -62, 0, this.aByteArray10486, i >> 16);
                        i_7_ += this.anInt10482;
                        i_6_ += i_12_;
                        i += i_14_;
                    }
                } else {
                    i_11_ -= i_10_;
                    i_10_ -= i_7_;
                    i_7_ *= this.anInt10482;
                    while (--i_10_ >= 0) {
                        Class304.method2289(i_9_ >> 16, i_7_, -102, 0, this.aByteArray10486, i_6_ >> 16);
                        i_7_ += this.anInt10482;
                        i_9_ += i_15_;
                        i_6_ += i_12_;
                    }
                    while (--i_11_ >= 0) {
                        Class304.method2289(i >> 16, i_7_, -92, 0, this.aByteArray10486, i_6_ >> 16);
                        i += i_14_;
                        i_6_ += i_12_;
                        i_7_ += this.anInt10482;
                    }
                }
            }
        } else if (i_10_ < i_11_) {
            if (i_11_ <= i_7_) {
                i_6_ = i <<= -1859479696;
                i_9_ <<= -1453584560;
                if (i_10_ < 0) {
                    i -= i_10_ * i_15_;
                    i_6_ -= i_10_ * i_14_;
                    i_10_ = 0;
                }
                if (i_11_ < 0) {
                    i_9_ -= i_11_ * i_12_;
                    i_11_ = 0;
                }
                if (i_15_ <= i_14_) {
                    i_7_ -= i_11_;
                    i_11_ -= i_10_;
                    i_10_ = this.anInt10482 * i_10_;
                    while (--i_11_ >= 0) {
                        Class304.method2289(i >> 16, i_10_, -68, 0, this.aByteArray10486, i_6_ >> 16);
                        i_6_ += i_14_;
                        i_10_ += this.anInt10482;
                        i += i_15_;
                    }
                    while (--i_7_ >= 0) {
                        Class304.method2289(i >> 16, i_10_, -101, 0, this.aByteArray10486, i_9_ >> 16);
                        i_9_ += i_12_;
                        i += i_15_;
                        i_10_ += this.anInt10482;
                    }
                } else {
                    i_7_ -= i_11_;
                    i_11_ -= i_10_;
                    i_10_ *= this.anInt10482;
                    while (--i_11_ >= 0) {
                        Class304.method2289(i_6_ >> 16, i_10_, -99, 0, this.aByteArray10486, i >> 16);
                        i += i_15_;
                        i_6_ += i_14_;
                        i_10_ += this.anInt10482;
                    }
                    while (--i_7_ >= 0) {
                        Class304.method2289(i_9_ >> 16, i_10_, -122, 0, this.aByteArray10486, i >> 16);
                        i += i_15_;
                        i_9_ += i_12_;
                        i_10_ += this.anInt10482;
                    }
                }
            } else {
                i_9_ = i <<= -1009380592;
                i_6_ <<= -202478416;
                if (i_10_ < 0) {
                    i_9_ -= i_14_ * i_10_;
                    i -= i_10_ * i_15_;
                    i_10_ = 0;
                }
                if (i_7_ < 0) {
                    i_6_ -= i_7_ * i_12_;
                    i_7_ = 0;
                }
                if (i_14_ < i_15_) {
                    i_11_ -= i_7_;
                    i_7_ -= i_10_;
                    i_10_ = this.anInt10482 * i_10_;
                    while (--i_7_ >= 0) {
                        Class304.method2289(i_9_ >> 16, i_10_, -36, 0, this.aByteArray10486, i >> 16);
                        i_10_ += this.anInt10482;
                        i += i_15_;
                        i_9_ += i_14_;
                    }
                    while (--i_11_ >= 0) {
                        Class304.method2289(i_9_ >> 16, i_10_, -48, 0, this.aByteArray10486, i_6_ >> 16);
                        i_9_ += i_14_;
                        i_6_ += i_12_;
                        i_10_ += this.anInt10482;
                    }
                } else {
                    i_11_ -= i_7_;
                    i_7_ -= i_10_;
                    i_10_ *= this.anInt10482;
                    while (--i_7_ >= 0) {
                        Class304.method2289(i >> 16, i_10_, -83, 0, this.aByteArray10486, i_9_ >> 16);
                        i += i_15_;
                        i_9_ += i_14_;
                        i_10_ += this.anInt10482;
                    }
                    while (--i_11_ >= 0) {
                        Class304.method2289(i_6_ >> 16, i_10_, -104, 0, this.aByteArray10486, i_9_ >> 16);
                        i_10_ += this.anInt10482;
                        i_9_ += i_14_;
                        i_6_ += i_12_;
                    }
                }
            }
        } else if (i_10_ >= i_7_) {
            i = i_9_ <<= -907151120;
            if (i_11_ < 0) {
                i -= i_11_ * i_12_;
                i_9_ -= i_14_ * i_11_;
                i_11_ = 0;
            }
            i_6_ <<= 209489840;
            if (i_7_ < 0) {
                i_6_ -= i_7_ * i_15_;
                i_7_ = 0;
            }
            if (i_14_ > i_12_) {
                i_10_ -= i_7_;
                i_7_ -= i_11_;
                i_11_ = this.anInt10482 * i_11_;
                while (--i_7_ >= 0) {
                    Class304.method2289(i >> 16, i_11_, -62, 0, this.aByteArray10486, i_9_ >> 16);
                    i += i_12_;
                    i_9_ += i_14_;
                    i_11_ += this.anInt10482;
                }
                while (--i_10_ >= 0) {
                    Class304.method2289(i_6_ >> 16, i_11_, -66, 0, this.aByteArray10486, i_9_ >> 16);
                    i_6_ += i_15_;
                    i_9_ += i_14_;
                    i_11_ += this.anInt10482;
                }
            } else {
                i_10_ -= i_7_;
                i_7_ -= i_11_;
                i_11_ *= this.anInt10482;
                while (--i_7_ >= 0) {
                    Class304.method2289(i_9_ >> 16, i_11_, -67, 0, this.aByteArray10486, i >> 16);
                    i_9_ += i_14_;
                    i += i_12_;
                    i_11_ += this.anInt10482;
                }
                while (--i_10_ >= 0) {
                    Class304.method2289(i_9_ >> 16, i_11_, -108, 0, this.aByteArray10486, i_6_ >> 16);
                    i_9_ += i_14_;
                    i_6_ += i_15_;
                    i_11_ += this.anInt10482;
                }
            }
        } else {
            i_6_ = i_9_ <<= -1570270288;
            if (i_11_ < 0) {
                i_6_ -= i_12_ * i_11_;
                i_9_ -= i_14_ * i_11_;
                i_11_ = 0;
            }
            i <<= -1382410736;
            if (i_10_ < 0) {
                i -= i_15_ * i_10_;
                i_10_ = 0;
            }
            if ((i_10_ == i_11_ || i_14_ <= i_12_) && (i_11_ != i_10_ || i_15_ >= i_12_)) {
                i_7_ -= i_10_;
                i_10_ -= i_11_;
                i_11_ = this.anInt10482 * i_11_;
                while (--i_10_ >= 0) {
                    Class304.method2289(i_9_ >> 16, i_11_, -85, 0, this.aByteArray10486, i_6_ >> 16);
                    i_6_ += i_12_;
                    i_11_ += this.anInt10482;
                    i_9_ += i_14_;
                }
                while (--i_7_ >= 0) {
                    Class304.method2289(i >> 16, i_11_, -92, 0, this.aByteArray10486, i_6_ >> 16);
                    i_11_ += this.anInt10482;
                    i += i_15_;
                    i_6_ += i_12_;
                }
            } else {
                i_7_ -= i_10_;
                i_10_ -= i_11_;
                i_11_ = this.anInt10482 * i_11_;
                while (--i_10_ >= 0) {
                    Class304.method2289(i_6_ >> 16, i_11_, -113, 0, this.aByteArray10486, i_9_ >> 16);
                    i_11_ += this.anInt10482;
                    i_6_ += i_12_;
                    i_9_ += i_14_;
                }
                while (--i_7_ >= 0) {
                    Class304.method2289(i_6_ >> 16, i_11_, -125, 0, this.aByteArray10486, i >> 16);
                    i_6_ += i_12_;
                    i += i_15_;
                    i_11_ += this.anInt10482;
                }
            }
        }
    }

    public static void method3295(int i) {
        aClass45_10480 = null;
        aClass252_10488 = null;
        aClass262_10492 = null;
        if (i != -1) method3295(109);
    }

    final boolean method3296(byte i, int i_16_, int i_17_) {
        int i_18_ = 65 % ((i - 45) / 39);
        anInt10490++;
        return i_16_ * i_17_ <= this.aByteArray10486.length;
    }

    r_Sub2(ha_Sub2 var_ha_Sub2, int i, int i_19_) {
        this.aByteArray10486 = new byte[i * i_19_];
    }

    static final Class318_Sub1_Sub4 method3297(int i, int i_20_, int i_21_) {
        Class357 class357 = Class147.aClass357ArrayArrayArray2029[i][i_20_][i_21_];
        if (class357 == null) return null;
        return class357.aClass318_Sub1_Sub4_4406;
    }
}
