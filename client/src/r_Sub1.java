/* r_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class r_Sub1 extends r {
    int anInt10466;
    int anInt10467;
    int anInt10468;
    static int anInt10469;
    static int anInt10470;
    byte[] aByteArray10471;
    static int anInt10472;
    static int anInt10473;
    int anInt10474;
    static int anInt10475;
    static int anInt10476;
    static Class351 aClass351_10477 = new Class351(22, 7);
    static int[] anIntArray10478 = new int[1];
    static Class262 aClass262_10479;

    final void method3286(int i, int i_0_, int i_1_, int i_2_, int i_3_) {
        this.anInt10466 = i - i_3_;
        this.anInt10467 = i_1_ + -i_2_;
        this.anInt10468 = i_3_;
        if (i_0_ > -96) method3289(27);
        anInt10473++;
        this.anInt10474 = i_2_;
    }

    final void method3287(int i, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_) {
        anInt10472++;
        int i_10_ = 0;
        if (i_7_ != i) i_10_ = (-i_5_ + i_6_ << 136201552) / (i_7_ + -i);
        int i_11_ = 0;
        if (i_7_ != i_8_) i_11_ = (-i_6_ + i_9_ << 1450537008) / (i_8_ + -i_7_);
        int i_12_ = -10 % ((-65 - i_4_) / 55);
        int i_13_ = 0;
        if (i_8_ != i) i_13_ = (i_5_ - i_9_ << -1880826096) / (i + -i_8_);
        if (i > i_7_ || i > i_8_) {
            if (i_8_ >= i_7_) {
                if (i_8_ >= i) {
                    i_9_ = i_6_ <<= 477681040;
                    if (i_7_ < 0) {
                        i_6_ -= i_7_ * i_11_;
                        i_9_ -= i_7_ * i_10_;
                        i_7_ = 0;
                    }
                    i_5_ <<= 193943408;
                    if (i < 0) {
                        i_5_ -= i * i_13_;
                        i = 0;
                    }
                    if (i_11_ > i_10_) {
                        i_8_ -= i;
                        i -= i_7_;
                        i_7_ = this.anInt10466 * i_7_;
                        while (--i >= 0) {
                            Class33.method339(i_7_, i_9_ >> 2067111440, this.aByteArray10471, 0, 1354705384, i_6_ >> -487218064);
                            i_9_ += i_10_;
                            i_7_ += this.anInt10466;
                            i_6_ += i_11_;
                        }
                        while (--i_8_ >= 0) {
                            Class33.method339(i_7_, i_5_ >> 873512592, this.aByteArray10471, 0, 1354705384, i_6_ >> -1843431664);
                            i_6_ += i_11_;
                            i_7_ += this.anInt10466;
                            i_5_ += i_13_;
                        }
                    } else {
                        i_8_ -= i;
                        i -= i_7_;
                        i_7_ = this.anInt10466 * i_7_;
                        while (--i >= 0) {
                            Class33.method339(i_7_, i_6_ >> 1575398320, this.aByteArray10471, 0, 1354705384, i_9_ >> -613190224);
                            i_7_ += this.anInt10466;
                            i_6_ += i_11_;
                            i_9_ += i_10_;
                        }
                        while (--i_8_ >= 0) {
                            Class33.method339(i_7_, i_6_ >> -1897738608, this.aByteArray10471, 0, 1354705384, i_5_ >> -877896304);
                            i_6_ += i_11_;
                            i_5_ += i_13_;
                            i_7_ += this.anInt10466;
                        }
                    }
                } else {
                    i_5_ = i_6_ <<= -1310795248;
                    if (i_7_ < 0) {
                        i_6_ -= i_11_ * i_7_;
                        i_5_ -= i_10_ * i_7_;
                        i_7_ = 0;
                    }
                    i_9_ <<= -280513936;
                    if (i_8_ < 0) {
                        i_9_ -= i_8_ * i_13_;
                        i_8_ = 0;
                    }
                    if ((i_8_ == i_7_ || i_10_ >= i_11_) && (i_8_ != i_7_ || i_13_ >= i_10_)) {
                        i -= i_8_;
                        i_8_ -= i_7_;
                        i_7_ *= this.anInt10466;
                        while (--i_8_ >= 0) {
                            Class33.method339(i_7_, i_6_ >> 692482416, this.aByteArray10471, 0, 1354705384, i_5_ >> 1791870896);
                            i_7_ += this.anInt10466;
                            i_5_ += i_10_;
                            i_6_ += i_11_;
                        }
                        while (--i >= 0) {
                            Class33.method339(i_7_, i_9_ >> 120030384, this.aByteArray10471, 0, 1354705384, i_5_ >> -1490619856);
                            i_7_ += this.anInt10466;
                            i_5_ += i_10_;
                            i_9_ += i_13_;
                        }
                    } else {
                        i -= i_8_;
                        i_8_ -= i_7_;
                        i_7_ *= this.anInt10466;
                        while (--i_8_ >= 0) {
                            Class33.method339(i_7_, i_5_ >> -852939952, this.aByteArray10471, 0, 1354705384, i_6_ >> -1790982128);
                            i_6_ += i_11_;
                            i_7_ += this.anInt10466;
                            i_5_ += i_10_;
                        }
                        while (--i >= 0) {
                            Class33.method339(i_7_, i_5_ >> 619635760, this.aByteArray10471, 0, 1354705384, i_9_ >> -241226064);
                            i_7_ += this.anInt10466;
                            i_9_ += i_13_;
                            i_5_ += i_10_;
                        }
                    }
                }
            } else if (i_7_ > i) {
                i_6_ = i_9_ <<= -547798224;
                i_5_ <<= -1378422192;
                if (i_8_ < 0) {
                    i_9_ -= i_13_ * i_8_;
                    i_6_ -= i_11_ * i_8_;
                    i_8_ = 0;
                }
                if (i < 0) {
                    i_5_ -= i_10_ * i;
                    i = 0;
                }
                if (i_13_ > i_11_) {
                    i_7_ -= i;
                    i -= i_8_;
                    i_8_ *= this.anInt10466;
                    while (--i >= 0) {
                        Class33.method339(i_8_, i_6_ >> -407114800, this.aByteArray10471, 0, 1354705384, i_9_ >> -518470768);
                        i_8_ += this.anInt10466;
                        i_6_ += i_11_;
                        i_9_ += i_13_;
                    }
                    while (--i_7_ >= 0) {
                        Class33.method339(i_8_, i_6_ >> -1140344752, this.aByteArray10471, 0, 1354705384, i_5_ >> -1498772432);
                        i_5_ += i_10_;
                        i_8_ += this.anInt10466;
                        i_6_ += i_11_;
                    }
                } else {
                    i_7_ -= i;
                    i -= i_8_;
                    i_8_ = this.anInt10466 * i_8_;
                    while (--i >= 0) {
                        Class33.method339(i_8_, i_9_ >> 1834027728, this.aByteArray10471, 0, 1354705384, i_6_ >> 1058894288);
                        i_6_ += i_11_;
                        i_8_ += this.anInt10466;
                        i_9_ += i_13_;
                    }
                    while (--i_7_ >= 0) {
                        Class33.method339(i_8_, i_5_ >> -1051671728, this.aByteArray10471, 0, 1354705384, i_6_ >> -2004115696);
                        i_5_ += i_10_;
                        i_8_ += this.anInt10466;
                        i_6_ += i_11_;
                    }
                }
            } else {
                i_5_ = i_9_ <<= -2101498192;
                if (i_8_ < 0) {
                    i_9_ -= i_13_ * i_8_;
                    i_5_ -= i_8_ * i_11_;
                    i_8_ = 0;
                }
                i_6_ <<= -1561324976;
                if (i_7_ < 0) {
                    i_6_ -= i_10_ * i_7_;
                    i_7_ = 0;
                }
                if (i_11_ >= i_13_) {
                    i -= i_7_;
                    i_7_ -= i_8_;
                    i_8_ = this.anInt10466 * i_8_;
                    while (--i_7_ >= 0) {
                        Class33.method339(i_8_, i_9_ >> -1776259280, this.aByteArray10471, 0, 1354705384, i_5_ >> -1580666096);
                        i_8_ += this.anInt10466;
                        i_5_ += i_11_;
                        i_9_ += i_13_;
                    }
                    while (--i >= 0) {
                        Class33.method339(i_8_, i_9_ >> -516460048, this.aByteArray10471, 0, 1354705384, i_6_ >> 929098704);
                        i_6_ += i_10_;
                        i_9_ += i_13_;
                        i_8_ += this.anInt10466;
                    }
                } else {
                    i -= i_7_;
                    i_7_ -= i_8_;
                    i_8_ = this.anInt10466 * i_8_;
                    while (--i_7_ >= 0) {
                        Class33.method339(i_8_, i_5_ >> -190419984, this.aByteArray10471, 0, 1354705384, i_9_ >> -2068433328);
                        i_5_ += i_11_;
                        i_9_ += i_13_;
                        i_8_ += this.anInt10466;
                    }
                    while (--i >= 0) {
                        Class33.method339(i_8_, i_6_ >> 1690166640, this.aByteArray10471, 0, 1354705384, i_9_ >> 865224944);
                        i_9_ += i_13_;
                        i_8_ += this.anInt10466;
                        i_6_ += i_10_;
                    }
                }
            }
        } else if (i_7_ >= i_8_) {
            i_6_ = i_5_ <<= 1567994448;
            i_9_ <<= -487806832;
            if (i < 0) {
                i_6_ -= i * i_13_;
                i_5_ -= i_10_ * i;
                i = 0;
            }
            if (i_8_ < 0) {
                i_9_ -= i_8_ * i_11_;
                i_8_ = 0;
            }
            if (i_8_ != i && i_13_ < i_10_ || i == i_8_ && i_10_ < i_11_) {
                i_7_ -= i_8_;
                i_8_ -= i;
                i = this.anInt10466 * i;
                while (--i_8_ >= 0) {
                    Class33.method339(i, i_6_ >> 42122608, this.aByteArray10471, 0, 1354705384, i_5_ >> -1331298416);
                    i += this.anInt10466;
                    i_5_ += i_10_;
                    i_6_ += i_13_;
                }
                while (--i_7_ >= 0) {
                    Class33.method339(i, i_9_ >> 885843920, this.aByteArray10471, 0, 1354705384, i_5_ >> -1039499664);
                    i += this.anInt10466;
                    i_9_ += i_11_;
                    i_5_ += i_10_;
                }
            } else {
                i_7_ -= i_8_;
                i_8_ -= i;
                i *= this.anInt10466;
                while (--i_8_ >= 0) {
                    Class33.method339(i, i_5_ >> -1963976848, this.aByteArray10471, 0, 1354705384, i_6_ >> -778751888);
                    i_6_ += i_13_;
                    i_5_ += i_10_;
                    i += this.anInt10466;
                }
                while (--i_7_ >= 0) {
                    Class33.method339(i, i_5_ >> -143110288, this.aByteArray10471, 0, 1354705384, i_9_ >> -1709642736);
                    i += this.anInt10466;
                    i_9_ += i_11_;
                    i_5_ += i_10_;
                }
            }
        } else {
            i_9_ = i_5_ <<= 592959792;
            if (i < 0) {
                i_5_ -= i_10_ * i;
                i_9_ -= i_13_ * i;
                i = 0;
            }
            i_6_ <<= 797030512;
            if (i_7_ < 0) {
                i_6_ -= i_7_ * i_11_;
                i_7_ = 0;
            }
            if ((i_7_ == i || i_10_ <= i_13_) && (i != i_7_ || i_11_ >= i_13_)) {
                i_8_ -= i_7_;
                i_7_ -= i;
                i = this.anInt10466 * i;
                while (--i_7_ >= 0) {
                    Class33.method339(i, i_5_ >> 739407504, this.aByteArray10471, 0, 1354705384, i_9_ >> 1031372208);
                    i_9_ += i_13_;
                    i += this.anInt10466;
                    i_5_ += i_10_;
                }
                while (--i_8_ >= 0) {
                    Class33.method339(i, i_6_ >> 1178720560, this.aByteArray10471, 0, 1354705384, i_9_ >> -922332912);
                    i_6_ += i_11_;
                    i += this.anInt10466;
                    i_9_ += i_13_;
                }
            } else {
                i_8_ -= i_7_;
                i_7_ -= i;
                i *= this.anInt10466;
                while (--i_7_ >= 0) {
                    Class33.method339(i, i_9_ >> -782847536, this.aByteArray10471, 0, 1354705384, i_5_ >> -131799216);
                    i_5_ += i_10_;
                    i_9_ += i_13_;
                    i += this.anInt10466;
                }
                while (--i_8_ >= 0) {
                    Class33.method339(i, i_9_ >> 1113329200, this.aByteArray10471, 0, 1354705384, i_6_ >> 1785341904);
                    i += this.anInt10466;
                    i_9_ += i_13_;
                    i_6_ += i_11_;
                }
            }
        }
    }

    public static void method3288(byte i) {
        int i_14_ = 107 % ((i - 27) / 34);
        anIntArray10478 = null;
        aClass351_10477 = null;
        aClass262_10479 = null;
    }

    final void method3289(int i) {
        if (i <= 1) method3286(-75, -2, 86, -31, 120);
        anInt10475++;
        int i_15_ = -1;
        int i_16_ = -8 + this.aByteArray10471.length;
        while (i_16_ > i_15_) {
            this.aByteArray10471[++i_15_] = (byte) 0;
            this.aByteArray10471[++i_15_] = (byte) 0;
            this.aByteArray10471[++i_15_] = (byte) 0;
            this.aByteArray10471[++i_15_] = (byte) 0;
            this.aByteArray10471[++i_15_] = (byte) 0;
            this.aByteArray10471[++i_15_] = (byte) 0;
            this.aByteArray10471[++i_15_] = (byte) 0;
            this.aByteArray10471[++i_15_] = (byte) 0;
        }
        while (i_15_ < this.aByteArray10471.length + -1) this.aByteArray10471[++i_15_] = (byte) 0;
    }

    static final void method3290(int i) {
        if (i < 30) aClass262_10479 = null;
        IOException_Sub1.method131(Class316.aClass348_Sub51_3959.aClass239_Sub5_7240.method1739(-32350) == 1, 2, true, 22050);
        anInt10470++;
        Class348_Sub40.aClass279_7042 = Class193.method1439(22050, Class348_Sub23_Sub1.aClass297_8992, Class305.aCanvas3869, 0, 7);
        Class348_Sub42_Sub18.method3273(true, -114, Class172.method1326(null, 9));
        Class194.aClass279_2596 = Class193.method1439(2048, Class348_Sub23_Sub1.aClass297_8992, Class305.aCanvas3869, 1, 7);
        Class348_Sub43.aClass348_Sub16_Sub4_7065 = new Class348_Sub16_Sub4();
        Class194.aClass279_2596.method2088(false, Class348_Sub43.aClass348_Sub16_Sub4_7065);
        Class57.aClass163_1050 = new Class163(22050, Class22.anInt339);
        Class348_Sub40_Sub17_Sub1.method3093(110);
    }

    final boolean method3291(int i, int i_17_, byte i_18_) {
        anInt10469++;
        if (i_18_ != -59) this.anInt10467 = 41;
        return i_17_ * i <= this.aByteArray10471.length;
    }

    r_Sub1(ha_Sub3 var_ha_Sub3, int i, int i_19_) {
        try {
            this.aByteArray10471 = new byte[i_19_ * i];
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("fc.<init>(" + (var_ha_Sub3 != null ? "{...}" : "null") + ',' + i + ',' + i_19_ + ')'));
        }
    }

    static {
        new Class273("", 76);
        aClass262_10479 = new Class262();
    }
}
