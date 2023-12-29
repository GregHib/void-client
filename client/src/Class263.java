/* Class263 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class263 {
    private final Index aIndex_3343;
    static int anInt3344;
    Index aIndex_3345;
    static int anInt3346;
    static int[] anIntArray3347 = new int[1000];
    static int anInt3348;
    static int anInt3349;
    private Class60 aClass60_3350;
    static int anInt3351;
    private static char[] aCharArray3352 = new char[64];
    static int anInt3353;
    static int anInt3354;
    boolean aBoolean3355 = false;
    static int anInt3356;
    static int anInt3357;
    static int anInt3358;
    boolean aBoolean3359;
    Class60 aClass60_3360;
    Class60 aClass60_3361;
    Class60 aClass60_3362;
    int anInt3363;

    final void method2004(boolean bool, byte i) {
        anInt3346++;
        if (bool == !this.aBoolean3359) {
            this.aBoolean3359 = bool;
            if (i != 25) aClass60_3350 = null;
            method2012(i + -23853);
        }
    }

    final Class51 method2005(int i, int i_0_) {
        anInt3351++;
        Class51 class51;
        synchronized (aClass60_3350) {
            class51 = (Class51) aClass60_3350.method583(i_0_, i ^ 0x32);
        }
        if (class51 != null) return class51;
        byte[] is;
        synchronized (aIndex_3343) {
            is = aIndex_3343.method410(i + -1860, Class239_Sub29.method1850(i_0_, 111), Class5_Sub1.method185(i_0_, (byte) -90));
        }
        class51 = new Class51();
        class51.anInt941 = i_0_;
        class51.aClass263_933 = this;
        if (is != null) class51.method479((byte) 0, new Class348_Sub49(is));
        class51.method488(-105);
        if (i != 0) this.aClass60_3361 = null;
        if (!this.aBoolean3359 && class51.aBoolean942) {
            class51.anIntArray917 = null;
            class51.aStringArray913 = null;
        }
        if (class51.aBoolean876) {
            class51.anInt920 = 0;
            class51.aBoolean896 = false;
        }
        synchronized (aClass60_3350) {
            aClass60_3350.method582(class51, i_0_, (byte) -109);
        }
        return class51;
    }

    final void method2006(int i) {
        if (i >= 68) {
            anInt3353++;
            synchronized (aClass60_3350) {
                aClass60_3350.method587(-106);
            }
            synchronized (this.aClass60_3360) {
                this.aClass60_3360.method587(-125);
            }
            synchronized (this.aClass60_3361) {
                this.aClass60_3361.method587(-122);
            }
            synchronized (this.aClass60_3362) {
                this.aClass60_3362.method587(-101);
            }
        }
    }

    static final boolean method2007(int i, int i_1_, int i_2_, Class361 class361, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_) {
        anInt3354++;
        int i_10_ = i_8_;
        int i_11_ = i_4_;
        int i_12_ = 64;
        int i_13_ = 64;
        int i_14_ = -i_12_ + i_8_;
        int i_15_ = -i_13_ + i_4_;
        r.anIntArrayArray9723[i_12_][i_13_] = 99;
        if (i_1_ >= -27) method2011((byte) 103);
        Class223.anIntArrayArray2900[i_12_][i_13_] = 0;
        int i_16_ = 0;
        Class367_Sub11.anIntArray7397[i_16_] = i_10_;
        int i_17_ = 0;
        Class205.anIntArray2694[i_16_++] = i_11_;
        int[][] is = class361.anIntArrayArray4438;
        while (i_16_ != i_17_) {
            i_11_ = Class205.anIntArray2694[i_17_];
            i_10_ = Class367_Sub11.anIntArray7397[i_17_];
            i_17_ = 0xfff & 1 + i_17_;
            i_12_ = i_10_ - i_14_;
            i_13_ = -i_15_ + i_11_;
            int i_18_ = i_10_ + -class361.anInt4453;
            int i_19_ = -class361.anInt4441 + i_11_;
            int i_20_ = i;
            while_85_:
            do {
                while_84_:
                do {
                    while_83_:
                    do {
                        while_82_:
                        do {
                            do {
                                if (i_20_ == -4) {
                                    if (i_10_ == i_3_ && i_2_ == i_11_) {
                                        Class348_Sub40_Sub30.anInt9388 = i_10_;
                                        Class115.anInt1753 = i_11_;
                                        return true;
                                    }
                                    break while_85_;
                                } else if (i_20_ != -3) {
                                    if (i_20_ != -2) {
                                        if (i_20_ != -1) {
                                            if (i_20_ == 0 || i_20_ == 1 || i_20_ == 2 || i_20_ == 3 || (i_20_ == 9)) break while_83_;
                                            break while_84_;
                                        }
                                    } else break;
                                    break while_82_;
                                }
                                if (Class239_Sub28.method1842(i_5_, i_2_, -1, 2, i_10_, i_11_, i_3_, 2, i_6_)) {
                                    Class115.anInt1753 = i_11_;
                                    Class348_Sub40_Sub30.anInt9388 = i_10_;
                                    return true;
                                }
                                break while_85_;
                            } while (false);
                            if (class361.method3497(-28388, i_3_, i_7_, 2, i_6_, i_10_, 2, i_11_, i_2_, i_5_)) {
                                Class348_Sub40_Sub30.anInt9388 = i_10_;
                                Class115.anInt1753 = i_11_;
                                return true;
                            }
                            break while_85_;
                        } while (false);
                        if (class361.method3503(i_10_, (byte) -82, i_2_, 2, i_6_, i_5_, i_7_, i_11_, i_3_)) {
                            Class348_Sub40_Sub30.anInt9388 = i_10_;
                            Class115.anInt1753 = i_11_;
                            return true;
                        }
                        break while_85_;
                    } while (false);
                    if (class361.method3495(i_3_, i_11_, 2, i_9_, i_10_, i_2_, i, -53)) {
                        Class348_Sub40_Sub30.anInt9388 = i_10_;
                        Class115.anInt1753 = i_11_;
                        return true;
                    }
                    break while_85_;
                } while (false);
                if (class361.method3504(i_2_, i_11_, i_3_, i_10_, i, 1, i_9_, 2)) {
                    Class348_Sub40_Sub30.anInt9388 = i_10_;
                    Class115.anInt1753 = i_11_;
                    return true;
                }
            } while (false);
            i_20_ = Class223.anIntArrayArray2900[i_12_][i_13_] + 1;
            if (i_12_ > 0 && r.anIntArrayArray9723[i_12_ + -1][i_13_] == 0 && (0x43a40000 & is[i_18_ - 1][i_19_]) == 0 && (0x4e240000 & is[i_18_ - 1][1 + i_19_]) == 0) {
                Class367_Sub11.anIntArray7397[i_16_] = -1 + i_10_;
                Class205.anIntArray2694[i_16_] = i_11_;
                r.anIntArrayArray9723[-1 + i_12_][i_13_] = 2;
                i_16_ = i_16_ + 1 & 0xfff;
                Class223.anIntArrayArray2900[i_12_ + -1][i_13_] = i_20_;
            }
            if (i_12_ < 126 && (r.anIntArrayArray9723[i_12_ - -1][i_13_] == 0) && (0x60e40000 & is[2 + i_18_][i_19_]) == 0 && (is[i_18_ + 2][i_19_ + 1] & 0x78240000) == 0) {
                Class367_Sub11.anIntArray7397[i_16_] = 1 + i_10_;
                Class205.anIntArray2694[i_16_] = i_11_;
                r.anIntArrayArray9723[1 + i_12_][i_13_] = 8;
                i_16_ = i_16_ + 1 & 0xfff;
                Class223.anIntArrayArray2900[1 + i_12_][i_13_] = i_20_;
            }
            if (i_13_ > 0 && r.anIntArrayArray9723[i_12_][-1 + i_13_] == 0 && (0x43a40000 & is[i_18_][i_19_ - 1]) == 0 && ((is[i_18_ + 1][-1 + i_19_] & 0x60e40000) == 0)) {
                Class367_Sub11.anIntArray7397[i_16_] = i_10_;
                Class205.anIntArray2694[i_16_] = i_11_ - 1;
                r.anIntArrayArray9723[i_12_][i_13_ + -1] = 1;
                i_16_ = 1 + i_16_ & 0xfff;
                Class223.anIntArrayArray2900[i_12_][i_13_ + -1] = i_20_;
            }
            if (i_13_ < 126 && r.anIntArrayArray9723[i_12_][i_13_ + 1] == 0 && (is[i_18_][2 + i_19_] & 0x4e240000) == 0 && ((0x78240000 & is[1 + i_18_][2 + i_19_]) == 0)) {
                Class367_Sub11.anIntArray7397[i_16_] = i_10_;
                Class205.anIntArray2694[i_16_] = 1 + i_11_;
                i_16_ = 1 + i_16_ & 0xfff;
                r.anIntArrayArray9723[i_12_][1 + i_13_] = 4;
                Class223.anIntArrayArray2900[i_12_][i_13_ - -1] = i_20_;
            }
            if (i_12_ > 0 && i_13_ > 0 && r.anIntArrayArray9723[-1 + i_12_][i_13_ + -1] == 0 && (is[i_18_ + -1][i_19_] & 0x4fa40000) == 0 && (is[i_18_ - 1][i_19_ - 1] & 0x43a40000) == 0 && (is[i_18_][i_19_ - 1] & 0x63e40000) == 0) {
                Class367_Sub11.anIntArray7397[i_16_] = -1 + i_10_;
                Class205.anIntArray2694[i_16_] = i_11_ - 1;
                i_16_ = 0xfff & 1 + i_16_;
                r.anIntArrayArray9723[i_12_ - 1][i_13_ - 1] = 3;
                Class223.anIntArrayArray2900[-1 + i_12_][-1 + i_13_] = i_20_;
            }
            if (i_12_ < 126 && i_13_ > 0 && (r.anIntArrayArray9723[i_12_ + 1][-1 + i_13_] == 0) && (is[i_18_ - -1][i_19_ + -1] & 0x63e40000) == 0 && (0x60e40000 & is[2 + i_18_][-1 + i_19_]) == 0 && (is[i_18_ - -2][i_19_] & 0x78e40000) == 0) {
                Class367_Sub11.anIntArray7397[i_16_] = 1 + i_10_;
                Class205.anIntArray2694[i_16_] = i_11_ + -1;
                r.anIntArrayArray9723[1 + i_12_][-1 + i_13_] = 9;
                i_16_ = 0xfff & i_16_ - -1;
                Class223.anIntArrayArray2900[i_12_ - -1][i_13_ - 1] = i_20_;
            }
            if (i_12_ > 0 && i_13_ < 126 && r.anIntArrayArray9723[i_12_ - 1][1 + i_13_] == 0 && (is[i_18_ - 1][1 + i_19_] & 0x4fa40000) == 0 && (0x4e240000 & is[i_18_ - 1][2 + i_19_]) == 0 && (is[i_18_][i_19_ - -2] & 0x7e240000) == 0) {
                Class367_Sub11.anIntArray7397[i_16_] = i_10_ - 1;
                Class205.anIntArray2694[i_16_] = i_11_ + 1;
                r.anIntArrayArray9723[i_12_ + -1][1 + i_13_] = 6;
                i_16_ = 1 + i_16_ & 0xfff;
                Class223.anIntArrayArray2900[-1 + i_12_][1 + i_13_] = i_20_;
            }
            if (i_12_ < 126 && i_13_ < 126 && r.anIntArrayArray9723[i_12_ + 1][1 + i_13_] == 0 && (is[i_18_ - -1][i_19_ + 2] & 0x7e240000) == 0 && (is[i_18_ + 2][i_19_ - -2] & 0x78240000) == 0 && ((0x78e40000 & is[i_18_ + 2][1 + i_19_]) == 0)) {
                Class367_Sub11.anIntArray7397[i_16_] = i_10_ - -1;
                Class205.anIntArray2694[i_16_] = 1 + i_11_;
                i_16_ = 1 + i_16_ & 0xfff;
                r.anIntArrayArray9723[1 + i_12_][i_13_ - -1] = 12;
                Class223.anIntArrayArray2900[1 + i_12_][1 + i_13_] = i_20_;
            }
        }
        Class348_Sub40_Sub30.anInt9388 = i_10_;
        Class115.anInt1753 = i_11_;
        return false;
    }

    final void method2008(int i, boolean bool) {
        anInt3344++;
        if (!this.aBoolean3355 == bool) {
            this.aBoolean3355 = bool;
            if (i >= -27) this.aClass60_3361 = null;
            method2012(-23828);
        }
    }

    final void method2009(int i, byte i_21_) {
        this.anInt3363 = i;
        anInt3348++;
        synchronized (this.aClass60_3360) {
            this.aClass60_3360.method590(0);
        }
        synchronized (this.aClass60_3361) {
            this.aClass60_3361.method590(0);
        }
        if (i_21_ < 94) anIntArray3347 = null;
        synchronized (this.aClass60_3362) {
            this.aClass60_3362.method590(0);
        }
    }

    final void method2010(int i, int i_22_) {
        anInt3349++;
        synchronized (aClass60_3350) {
            aClass60_3350.method578(2, i);
        }
        synchronized (this.aClass60_3360) {
            this.aClass60_3360.method578(i_22_ ^ ~0x2, i);
        }
        synchronized (this.aClass60_3361) {
            this.aClass60_3361.method578(i_22_ ^ ~0x2, i);
        }
        synchronized (this.aClass60_3362) {
            this.aClass60_3362.method578(2, i);
            if (i_22_ != -1) method2013(null, (byte) 96);
        }
    }

    public static void method2011(byte i) {
        anIntArray3347 = null;
        if (i > -19) aCharArray3352 = null;
        aCharArray3352 = null;
    }

    final void method2012(int i) {
        synchronized (aClass60_3350) {
            aClass60_3350.method590(0);
        }
        anInt3356++;
        synchronized (this.aClass60_3360) {
            this.aClass60_3360.method590(0);
        }
        synchronized (this.aClass60_3361) {
            this.aClass60_3361.method590(0);
        }
        synchronized (this.aClass60_3362) {
            this.aClass60_3362.method590(0);
        }
    }

    static final void method2013(byte[] is, byte i) {
        if (i != 112) method2007(84, 119, -100, null, 92, -110, 96, 62, 31, 11, 62);
        anInt3357++;
        Class348_Sub49 class348_sub49 = new Class348_Sub49(is);
        for (; ; ) {
            int i_23_ = class348_sub49.readUnsignedByte(255);
            if (i_23_ == 0) break;
            if (i_23_ == 1) {
                int[] is_28_ = Class81.anIntArray1432 = new int[6];
                is_28_[0] = class348_sub49.readUnsignedShort(i + 842397832);
                is_28_[1] = class348_sub49.readUnsignedShort(i + 842397832);
                is_28_[2] = class348_sub49.readUnsignedShort(842397944);
                is_28_[3] = class348_sub49.readUnsignedShort(842397944);
                is_28_[4] = class348_sub49.readUnsignedShort(842397944);
                is_28_[5] = class348_sub49.readUnsignedShort(842397944);
            } else if (i_23_ == 4) {
                int i_24_ = class348_sub49.readUnsignedByte(255);
                RuntimeException_Sub1.anIntArray4603 = new int[i_24_];
                for (int i_25_ = 0; i_24_ > i_25_; i_25_++) {
                    RuntimeException_Sub1.anIntArray4603[i_25_] = class348_sub49.readUnsignedShort(842397944);
                    if (RuntimeException_Sub1.anIntArray4603[i_25_] == 65535) RuntimeException_Sub1.anIntArray4603[i_25_] = -1;
                }
            } else if (i_23_ == 5) {
                int i_26_ = class348_sub49.readUnsignedByte(255);
                Class239_Sub17.anIntArray6021 = new int[i_26_];
                for (int i_27_ = 0; i_27_ < i_26_; i_27_++) {
                    Class239_Sub17.anIntArray6021[i_27_] = class348_sub49.readUnsignedShort(842397944);
                    if (Class239_Sub17.anIntArray6021[i_27_] == 65535) Class239_Sub17.anIntArray6021[i_27_] = -1;
                }
            }
        }
    }

    final void method2014(int i, boolean bool) {
        aClass60_3350 = new Class60(i);
        anInt3358++;
        if (bool != true) this.aClass60_3362 = null;
    }

    Class263(Class230 class230, int i, boolean bool, Index index, Index index_29_) {
        aClass60_3350 = new Class60(64);
        this.aClass60_3360 = new Class60(500);
        this.aClass60_3361 = new Class60(30);
        this.aClass60_3362 = new Class60(50);
        do {
            try {
                this.aBoolean3359 = bool;
                this.aIndex_3345 = index_29_;
                aIndex_3343 = index;
                if (aIndex_3343 == null) break;
                int i_30_ = aIndex_3343.method414(-1) + -1;
                aIndex_3343.method407(0, i_30_);
            } catch (RuntimeException runtimeexception) {
                throw Class348_Sub17.method2929(runtimeexception, ("uha.<init>(" + (class230 != null ? "{...}" : "null") + ',' + i + ',' + bool + ',' + (index != null ? "{...}" : "null") + ',' + (index_29_ != null ? "{...}" : "null") + ')'));
            }
            break;
        } while (false);
    }

    static {
        for (int i = 0; i < 26; i++)
            aCharArray3352[i] = (char) (65 + i);
        for (int i = 26; i < 52; i++)
            aCharArray3352[i] = (char) (97 + i - 26);
        for (int i = 52; i < 62; i++)
            aCharArray3352[i] = (char) (-52 + (i + 48));
        aCharArray3352[62] = '+';
        aCharArray3352[63] = '/';
    }
}
