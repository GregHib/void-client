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
        ((r_Sub2) this).anInt10484 = i_1_;
        ((r_Sub2) this).anInt10489 = i_3_;
        anInt10481++;
        ((r_Sub2) this).anInt10487 = i - i_1_;
        if (i_2_ == 25053)
            ((r_Sub2) this).anInt10482 = i_0_ + -i_3_;
    }

    final void method3293(byte i) {
        anInt10485++;
        int i_4_ = -1;
        int i_5_ = -8 + ((r_Sub2) this).aByteArray10486.length;
        while ((i_4_ ^ 0xffffffff) > (i_5_ ^ 0xffffffff)) {
            ((r_Sub2) this).aByteArray10486[++i_4_] = (byte) 0;
            ((r_Sub2) this).aByteArray10486[++i_4_] = (byte) 0;
            ((r_Sub2) this).aByteArray10486[++i_4_] = (byte) 0;
            ((r_Sub2) this).aByteArray10486[++i_4_] = (byte) 0;
            ((r_Sub2) this).aByteArray10486[++i_4_] = (byte) 0;
            ((r_Sub2) this).aByteArray10486[++i_4_] = (byte) 0;
            ((r_Sub2) this).aByteArray10486[++i_4_] = (byte) 0;
            ((r_Sub2) this).aByteArray10486[++i_4_] = (byte) 0;
        }
        if (i == 0) {
            while ((((r_Sub2) this).aByteArray10486.length - 1 ^ 0xffffffff)
                    < (i_4_ ^ 0xffffffff))
                ((r_Sub2) this).aByteArray10486[++i_4_] = (byte) 0;
        }
    }

    final void method3294(int i, int i_6_, int i_7_, int i_8_, int i_9_,
                          int i_10_, int i_11_) {
        anInt10491++;
        int i_12_ = 0;
        if (i_11_ != i_7_)
            i_12_ = (-i_6_ + i_9_ << 1673530928) / (i_11_ + -i_7_);
        int i_13_ = 71 % ((-38 - i_8_) / 52);
        int i_14_ = 0;
        if (i_11_ != i_10_)
            i_14_ = (i - i_9_ << -471189328) / (-i_11_ + i_10_);
        int i_15_ = 0;
        if ((i_7_ ^ 0xffffffff) != (i_10_ ^ 0xffffffff))
            i_15_ = (i_6_ - i << -752300112) / (i_7_ + -i_10_);
        if (i_11_ >= i_7_ && i_7_ <= i_10_) {
            if ((i_11_ ^ 0xffffffff) > (i_10_ ^ 0xffffffff)) {
                i = i_6_ <<= -1167965648;
                if (i_7_ < 0) {
                    i -= i_7_ * i_15_;
                    i_6_ -= i_12_ * i_7_;
                    i_7_ = 0;
                }
                i_9_ <<= -1709216688;
                if ((i_11_ ^ 0xffffffff) > -1) {
                    i_9_ -= i_14_ * i_11_;
                    i_11_ = 0;
                }
                if ((i_7_ == i_11_ || i_15_ >= i_12_)
                        && ((i_11_ ^ 0xffffffff) != (i_7_ ^ 0xffffffff)
                        || (i_15_ ^ 0xffffffff) >= (i_14_ ^ 0xffffffff))) {
                    i_10_ -= i_11_;
                    i_11_ -= i_7_;
                    i_7_ = ((r_Sub2) this).anInt10482 * i_7_;
                    while ((--i_11_ ^ 0xffffffff) <= -1) {
                        Class304.method2289(i_6_ >> 1294609040, i_7_, -36, 0,
                                ((r_Sub2) this).aByteArray10486,
                                i >> -1130520496);
                        i_6_ += i_12_;
                        i_7_ += ((r_Sub2) this).anInt10482;
                        i += i_15_;
                    }
                    while ((--i_10_ ^ 0xffffffff) <= -1) {
                        Class304.method2289(i_9_ >> -1092336912, i_7_, -104, 0,
                                ((r_Sub2) this).aByteArray10486,
                                i >> -775781552);
                        i += i_15_;
                        i_7_ += ((r_Sub2) this).anInt10482;
                        i_9_ += i_14_;
                    }
                } else {
                    i_10_ -= i_11_;
                    i_11_ -= i_7_;
                    i_7_ = ((r_Sub2) this).anInt10482 * i_7_;
                    while ((--i_11_ ^ 0xffffffff) <= -1) {
                        Class304.method2289(i >> -1236966352, i_7_, -111, 0,
                                ((r_Sub2) this).aByteArray10486,
                                i_6_ >> 770894736);
                        i_7_ += ((r_Sub2) this).anInt10482;
                        i += i_15_;
                        i_6_ += i_12_;
                    }
                    while ((--i_10_ ^ 0xffffffff) <= -1) {
                        Class304.method2289(i >> -1522319888, i_7_, -120, 0,
                                ((r_Sub2) this).aByteArray10486,
                                i_9_ >> 1507459440);
                        i_9_ += i_14_;
                        i_7_ += ((r_Sub2) this).anInt10482;
                        i += i_15_;
                    }
                }
            } else {
                i_9_ = i_6_ <<= -1228970768;
                if ((i_7_ ^ 0xffffffff) > -1) {
                    i_6_ -= i_12_ * i_7_;
                    i_9_ -= i_15_ * i_7_;
                    i_7_ = 0;
                }
                i <<= -1758318000;
                if (i_10_ < 0) {
                    i -= i_14_ * i_10_;
                    i_10_ = 0;
                }
                if (((i_10_ ^ 0xffffffff) == (i_7_ ^ 0xffffffff)
                        || i_12_ <= i_15_)
                        && ((i_7_ ^ 0xffffffff) != (i_10_ ^ 0xffffffff)
                        || i_14_ <= i_12_)) {
                    i_11_ -= i_10_;
                    i_10_ -= i_7_;
                    i_7_ = ((r_Sub2) this).anInt10482 * i_7_;
                    while (--i_10_ >= 0) {
                        Class304.method2289(i_6_ >> -1142590032, i_7_, -75, 0,
                                ((r_Sub2) this).aByteArray10486,
                                i_9_ >> -1574786416);
                        i_9_ += i_15_;
                        i_7_ += ((r_Sub2) this).anInt10482;
                        i_6_ += i_12_;
                    }
                    while ((--i_11_ ^ 0xffffffff) <= -1) {
                        Class304.method2289(i_6_ >> -422896112, i_7_, -62, 0,
                                ((r_Sub2) this).aByteArray10486,
                                i >> -1919498320);
                        i_7_ += ((r_Sub2) this).anInt10482;
                        i_6_ += i_12_;
                        i += i_14_;
                    }
                } else {
                    i_11_ -= i_10_;
                    i_10_ -= i_7_;
                    i_7_ *= ((r_Sub2) this).anInt10482;
                    while ((--i_10_ ^ 0xffffffff) <= -1) {
                        Class304.method2289(i_9_ >> 96551056, i_7_, -102, 0,
                                ((r_Sub2) this).aByteArray10486,
                                i_6_ >> -972110128);
                        i_7_ += ((r_Sub2) this).anInt10482;
                        i_9_ += i_15_;
                        i_6_ += i_12_;
                    }
                    while ((--i_11_ ^ 0xffffffff) <= -1) {
                        Class304.method2289(i >> 574649104, i_7_, -92, 0,
                                ((r_Sub2) this).aByteArray10486,
                                i_6_ >> 2116942416);
                        i += i_14_;
                        i_6_ += i_12_;
                        i_7_ += ((r_Sub2) this).anInt10482;
                    }
                }
            }
        } else if ((i_11_ ^ 0xffffffff) < (i_10_ ^ 0xffffffff)) {
            if (i_11_ <= i_7_) {
                i_6_ = i <<= -1859479696;
                i_9_ <<= -1453584560;
                if ((i_10_ ^ 0xffffffff) > -1) {
                    i -= i_10_ * i_15_;
                    i_6_ -= i_10_ * i_14_;
                    i_10_ = 0;
                }
                if (i_11_ < 0) {
                    i_9_ -= i_11_ * i_12_;
                    i_11_ = 0;
                }
                if ((i_14_ ^ 0xffffffff) <= (i_15_ ^ 0xffffffff)) {
                    i_7_ -= i_11_;
                    i_11_ -= i_10_;
                    i_10_ = ((r_Sub2) this).anInt10482 * i_10_;
                    while ((--i_11_ ^ 0xffffffff) <= -1) {
                        Class304.method2289(i >> -969983856, i_10_, -68, 0,
                                ((r_Sub2) this).aByteArray10486,
                                i_6_ >> 110992720);
                        i_6_ += i_14_;
                        i_10_ += ((r_Sub2) this).anInt10482;
                        i += i_15_;
                    }
                    while (--i_7_ >= 0) {
                        Class304.method2289(i >> -435929232, i_10_, -101, 0,
                                ((r_Sub2) this).aByteArray10486,
                                i_9_ >> -609282352);
                        i_9_ += i_12_;
                        i += i_15_;
                        i_10_ += ((r_Sub2) this).anInt10482;
                    }
                } else {
                    i_7_ -= i_11_;
                    i_11_ -= i_10_;
                    i_10_ *= ((r_Sub2) this).anInt10482;
                    while (--i_11_ >= 0) {
                        Class304.method2289(i_6_ >> -1172738000, i_10_, -99, 0,
                                ((r_Sub2) this).aByteArray10486,
                                i >> 19890032);
                        i += i_15_;
                        i_6_ += i_14_;
                        i_10_ += ((r_Sub2) this).anInt10482;
                    }
                    while ((--i_7_ ^ 0xffffffff) <= -1) {
                        Class304.method2289(i_9_ >> 1208035216, i_10_, -122, 0,
                                ((r_Sub2) this).aByteArray10486,
                                i >> -328427984);
                        i += i_15_;
                        i_9_ += i_12_;
                        i_10_ += ((r_Sub2) this).anInt10482;
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
                if ((i_15_ ^ 0xffffffff) < (i_14_ ^ 0xffffffff)) {
                    i_11_ -= i_7_;
                    i_7_ -= i_10_;
                    i_10_ = ((r_Sub2) this).anInt10482 * i_10_;
                    while ((--i_7_ ^ 0xffffffff) <= -1) {
                        Class304.method2289(i_9_ >> 813058384, i_10_, -36, 0,
                                ((r_Sub2) this).aByteArray10486,
                                i >> -977261424);
                        i_10_ += ((r_Sub2) this).anInt10482;
                        i += i_15_;
                        i_9_ += i_14_;
                    }
                    while (--i_11_ >= 0) {
                        Class304.method2289(i_9_ >> 1771442224, i_10_, -48, 0,
                                ((r_Sub2) this).aByteArray10486,
                                i_6_ >> 794026928);
                        i_9_ += i_14_;
                        i_6_ += i_12_;
                        i_10_ += ((r_Sub2) this).anInt10482;
                    }
                } else {
                    i_11_ -= i_7_;
                    i_7_ -= i_10_;
                    i_10_ *= ((r_Sub2) this).anInt10482;
                    while (--i_7_ >= 0) {
                        Class304.method2289(i >> -73821936, i_10_, -83, 0,
                                ((r_Sub2) this).aByteArray10486,
                                i_9_ >> 1568214832);
                        i += i_15_;
                        i_9_ += i_14_;
                        i_10_ += ((r_Sub2) this).anInt10482;
                    }
                    while (--i_11_ >= 0) {
                        Class304.method2289(i_6_ >> -1081488240, i_10_, -104,
                                0, ((r_Sub2) this).aByteArray10486,
                                i_9_ >> -908961328);
                        i_10_ += ((r_Sub2) this).anInt10482;
                        i_9_ += i_14_;
                        i_6_ += i_12_;
                    }
                }
            }
        } else if (i_10_ >= i_7_) {
            i = i_9_ <<= -907151120;
            if ((i_11_ ^ 0xffffffff) > -1) {
                i -= i_11_ * i_12_;
                i_9_ -= i_14_ * i_11_;
                i_11_ = 0;
            }
            i_6_ <<= 209489840;
            if ((i_7_ ^ 0xffffffff) > -1) {
                i_6_ -= i_7_ * i_15_;
                i_7_ = 0;
            }
            if ((i_12_ ^ 0xffffffff) > (i_14_ ^ 0xffffffff)) {
                i_10_ -= i_7_;
                i_7_ -= i_11_;
                i_11_ = ((r_Sub2) this).anInt10482 * i_11_;
                while (--i_7_ >= 0) {
                    Class304.method2289(i >> 2092865008, i_11_, -62, 0,
                            ((r_Sub2) this).aByteArray10486,
                            i_9_ >> 1056855056);
                    i += i_12_;
                    i_9_ += i_14_;
                    i_11_ += ((r_Sub2) this).anInt10482;
                }
                while ((--i_10_ ^ 0xffffffff) <= -1) {
                    Class304.method2289(i_6_ >> -1604901200, i_11_, -66, 0,
                            ((r_Sub2) this).aByteArray10486,
                            i_9_ >> 157309744);
                    i_6_ += i_15_;
                    i_9_ += i_14_;
                    i_11_ += ((r_Sub2) this).anInt10482;
                }
            } else {
                i_10_ -= i_7_;
                i_7_ -= i_11_;
                i_11_ *= ((r_Sub2) this).anInt10482;
                while ((--i_7_ ^ 0xffffffff) <= -1) {
                    Class304.method2289(i_9_ >> 1595067536, i_11_, -67, 0,
                            ((r_Sub2) this).aByteArray10486,
                            i >> -932576240);
                    i_9_ += i_14_;
                    i += i_12_;
                    i_11_ += ((r_Sub2) this).anInt10482;
                }
                while (--i_10_ >= 0) {
                    Class304.method2289(i_9_ >> -2050996816, i_11_, -108, 0,
                            ((r_Sub2) this).aByteArray10486,
                            i_6_ >> 1963203440);
                    i_9_ += i_14_;
                    i_6_ += i_15_;
                    i_11_ += ((r_Sub2) this).anInt10482;
                }
            }
        } else {
            i_6_ = i_9_ <<= -1570270288;
            if ((i_11_ ^ 0xffffffff) > -1) {
                i_6_ -= i_12_ * i_11_;
                i_9_ -= i_14_ * i_11_;
                i_11_ = 0;
            }
            i <<= -1382410736;
            if (i_10_ < 0) {
                i -= i_15_ * i_10_;
                i_10_ = 0;
            }
            if (((i_11_ ^ 0xffffffff) == (i_10_ ^ 0xffffffff)
                    || i_14_ <= i_12_)
                    && ((i_10_ ^ 0xffffffff) != (i_11_ ^ 0xffffffff)
                    || (i_12_ ^ 0xffffffff) >= (i_15_ ^ 0xffffffff))) {
                i_7_ -= i_10_;
                i_10_ -= i_11_;
                i_11_ = ((r_Sub2) this).anInt10482 * i_11_;
                while (--i_10_ >= 0) {
                    Class304.method2289(i_9_ >> 641788048, i_11_, -85, 0,
                            ((r_Sub2) this).aByteArray10486,
                            i_6_ >> 249707568);
                    i_6_ += i_12_;
                    i_11_ += ((r_Sub2) this).anInt10482;
                    i_9_ += i_14_;
                }
                while ((--i_7_ ^ 0xffffffff) <= -1) {
                    Class304.method2289(i >> 70400048, i_11_, -92, 0,
                            ((r_Sub2) this).aByteArray10486,
                            i_6_ >> -1034120880);
                    i_11_ += ((r_Sub2) this).anInt10482;
                    i += i_15_;
                    i_6_ += i_12_;
                }
            } else {
                i_7_ -= i_10_;
                i_10_ -= i_11_;
                i_11_ = ((r_Sub2) this).anInt10482 * i_11_;
                while (--i_10_ >= 0) {
                    Class304.method2289(i_6_ >> -192376496, i_11_, -113, 0,
                            ((r_Sub2) this).aByteArray10486,
                            i_9_ >> 27594480);
                    i_11_ += ((r_Sub2) this).anInt10482;
                    i_6_ += i_12_;
                    i_9_ += i_14_;
                }
                while ((--i_7_ ^ 0xffffffff) <= -1) {
                    Class304.method2289(i_6_ >> -449167568, i_11_, -125, 0,
                            ((r_Sub2) this).aByteArray10486,
                            i >> -1901772080);
                    i_6_ += i_12_;
                    i += i_15_;
                    i_11_ += ((r_Sub2) this).anInt10482;
                }
            }
        }
    }

    public static void method3295(int i) {
        aClass45_10480 = null;
        aClass252_10488 = null;
        aClass262_10492 = null;
        if (i != -1)
            method3295(109);
    }

    final boolean method3296(byte i, int i_16_, int i_17_) {
        int i_18_ = 65 % ((i - 45) / 39);
        anInt10490++;
        if (i_16_ * i_17_ > ((r_Sub2) this).aByteArray10486.length)
            return false;
        return true;
    }

    r_Sub2(ha_Sub2 var_ha_Sub2, int i, int i_19_) {
        ((r_Sub2) this).aByteArray10486 = new byte[i * i_19_];
    }

    static final Class318_Sub1_Sub4 method3297(int i, int i_20_, int i_21_) {
        Class357 class357
                = Class147.aClass357ArrayArrayArray2029[i][i_20_][i_21_];
        if (class357 == null)
            return null;
        return ((Class357) class357).aClass318_Sub1_Sub4_4406;
    }
}
