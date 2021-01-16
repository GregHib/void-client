/* Class219 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class219 {
    Class60 aClass60_2862 = new Class60(20);
    static int anInt2863;
    static Class196 aClass196_2864 = new Class196();
    static int anInt2865;
    private Class45 aClass45_2866;
    static int anInt2867;
    static Class223 aClass223_2868 = new Class223(0, 1);
    static int anInt2869;
    static int anInt2870;
    static byte aByte2871;
    static int anInt2872 = 0;
    Class45 aClass45_2873;
    static int anInt2874;
    private Class60 aClass60_2875 = new Class60(64);

    final void method1598(int i) {
        anInt2863++;
        synchronized (aClass60_2875) {
            aClass60_2875.method587(-103);
        }
        synchronized (((Class219) this).aClass60_2862) {
            if (i <= 42)
                method1598(36);
            ((Class219) this).aClass60_2862.method587(-126);
        }
    }

    static final boolean method1599(byte i, int i_0_, int i_1_) {
        anInt2869++;
        if (i > -65)
            return false;
        if ((i_0_ & 0xc580) == 0)
            return false;
        return true;
    }

    static final void method1600
            (boolean bool, int i,
             Class318_Sub1_Sub3_Sub3 class318_sub1_sub3_sub3) {
        anInt2867++;
        Class225 class225 = class318_sub1_sub3_sub3.method2422((byte) 72);
        if (((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3).anInt10319
                == 0) {
            ((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3).anInt10326 = 0;
            Class235.anInt3062 = -1;
            Class127_Sub1.anInt8387 = 0;
        } else {
            if (i != ((((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3)
                    .anInt10286)
                    ^ 0xffffffff)
                    && ((((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3)
                    .anInt10218)
                    ^ 0xffffffff) == -1) {
                Class17 class17
                        = (Class10.aClass87_191.method835
                        ((((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3)
                                        .anInt10286),
                                i + 7));
                if ((((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3)
                        .anInt10322) > 0
                        && (((Class17) class17).anInt262 ^ 0xffffffff) == -1) {
                    Class235.anInt3062 = -1;
                    Class127_Sub1.anInt8387 = 0;
                    ((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3)
                            .anInt10326++;
                    return;
                }
                if ((((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3)
                        .anInt10322) <= 0
                        && (((Class17) class17).anInt245 ^ 0xffffffff) == -1) {
                    Class127_Sub1.anInt8387 = 0;
                    Class235.anInt3062 = -1;
                    ((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3)
                            .anInt10326++;
                    return;
                }
            }
            if ((((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3).anInt10269
                    ^ 0xffffffff) != 0
                    && (((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3)
                    .anInt10225) <= Class367_Sub11.anInt7396) {
                Class368 class368
                        = (Class348_Sub40_Sub18.aClass319_9245.method2543
                        ((byte) 118,
                                (((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3)
                                        .anInt10269)));
                if (((Class368) class368).aBoolean4487
                        && (((Class368) class368).anInt4503 ^ 0xffffffff) != 0) {
                    Class17 class17
                            = Class10.aClass87_191
                            .method835(((Class368) class368).anInt4503, 7);
                    if ((((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3)
                            .anInt10322) > 0
                            && (((Class17) class17).anInt262 ^ 0xffffffff) == -1) {
                        Class127_Sub1.anInt8387 = 0;
                        ((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3)
                                .anInt10326++;
                        Class235.anInt3062 = -1;
                        return;
                    }
                    if (((((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3)
                            .anInt10322)
                            ^ 0xffffffff) >= -1
                            && (((Class17) class17).anInt245 ^ 0xffffffff) == -1) {
                        Class235.anInt3062 = -1;
                        Class127_Sub1.anInt8387 = 0;
                        ((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3)
                                .anInt10326++;
                        return;
                    }
                }
            }
            if ((((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3).anInt10269
                    ^ 0xffffffff) != 0
                    && ((Class367_Sub11.anInt7396 ^ 0xffffffff)
                    <= ((((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3)
                    .anInt10225)
                    ^ 0xffffffff))) {
                Class368 class368
                        = (Class348_Sub40_Sub18.aClass319_9245.method2543
                        ((byte) 98,
                                (((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3)
                                        .anInt10269)));
                if (((Class368) class368).aBoolean4487
                        && ((Class368) class368).anInt4503 != -1) {
                    Class17 class17
                            = Class10.aClass87_191.method835((((Class368) class368)
                                    .anInt4503),
                            i ^ 0x7);
                    if (((((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3)
                            .anInt10322)
                            ^ 0xffffffff) < -1
                            && (((Class17) class17).anInt262 ^ 0xffffffff) == -1) {
                        Class127_Sub1.anInt8387 = 0;
                        ((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3)
                                .anInt10326++;
                        Class235.anInt3062 = -1;
                        return;
                    }
                    if ((((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3)
                            .anInt10322) <= 0
                            && (((Class17) class17).anInt245 ^ 0xffffffff) == -1) {
                        Class235.anInt3062 = -1;
                        Class127_Sub1.anInt8387 = 0;
                        ((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3)
                                .anInt10326++;
                        return;
                    }
                }
            }
            int i_2_ = ((Class318_Sub1) class318_sub1_sub3_sub3).anInt6377;
            int i_3_ = ((Class318_Sub1) class318_sub1_sub3_sub3).anInt6388;
            int i_4_
                    = (512 * (((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3)
                    .anIntArray10320
                    [-1 + ((Class318_Sub1_Sub3_Sub3)
                    class318_sub1_sub3_sub3).anInt10319])
                    + class318_sub1_sub3_sub3.method2436((byte) 117) * 256);
            int i_5_
                    = (512 * (((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3)
                    .anIntArray10317
                    [-1 + ((Class318_Sub1_Sub3_Sub3)
                    class318_sub1_sub3_sub3).anInt10319])
                    - -(class318_sub1_sub3_sub3.method2436((byte) 72) * 256));
            if (i_2_ >= i_4_) {
                if (i_4_ < i_2_) {
                    if ((i_3_ ^ 0xffffffff) > (i_5_ ^ 0xffffffff))
                        class318_sub1_sub3_sub3.method2440((byte) 49, 6144);
                    else if ((i_3_ ^ 0xffffffff) < (i_5_ ^ 0xffffffff))
                        class318_sub1_sub3_sub3.method2440((byte) 49, 2048);
                    else
                        class318_sub1_sub3_sub3.method2440((byte) 49, 4096);
                } else if (i_5_ <= i_3_) {
                    if ((i_5_ ^ 0xffffffff) > (i_3_ ^ 0xffffffff))
                        class318_sub1_sub3_sub3.method2440((byte) 49, 0);
                } else
                    class318_sub1_sub3_sub3.method2440((byte) 49, 8192);
            } else if ((i_5_ ^ 0xffffffff) >= (i_3_ ^ 0xffffffff)) {
                if ((i_3_ ^ 0xffffffff) < (i_5_ ^ 0xffffffff))
                    class318_sub1_sub3_sub3.method2440((byte) 49, 14336);
                else
                    class318_sub1_sub3_sub3.method2440((byte) 49, 12288);
            } else
                class318_sub1_sub3_sub3.method2440((byte) 49, 10240);
            byte i_6_
                    = (((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3)
                    .aByteArray10321
                    [-1 + (((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3)
                    .anInt10319)]);
            if (!bool
                    && (i_4_ - i_2_ > 1024 || (i_4_ + -i_2_ ^ 0xffffffff) > 1023
                    || (-i_3_ + i_5_ ^ 0xffffffff) < -1025
                    || i_5_ + -i_3_ < -1024)) {
                ((Class318_Sub1) class318_sub1_sub3_sub3).anInt6388 = i_5_;
                ((Class318_Sub1) class318_sub1_sub3_sub3).anInt6377 = i_4_;
                class318_sub1_sub3_sub3.method2435((byte) -108,
                        (((Class318_Sub1_Sub3_Sub3)
                                class318_sub1_sub3_sub3)
                                .anInt10282),
                        false);
                Class235.anInt3062 = -1;
                ((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3)
                        .anInt10319--;
                if (((((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3)
                        .anInt10322)
                        ^ 0xffffffff)
                        < -1)
                    ((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3)
                            .anInt10322--;
                Class127_Sub1.anInt8387 = 0;
            } else {
                int i_7_ = 16;
                boolean bool_8_ = true;
                if (class318_sub1_sub3_sub3
                        instanceof Class318_Sub1_Sub3_Sub3_Sub1)
                    bool_8_ = ((Class79) (((Class318_Sub1_Sub3_Sub3_Sub1)
                            (Class318_Sub1_Sub3_Sub3_Sub1)
                                    class318_sub1_sub3_sub3)
                            .aClass79_10505)).aBoolean1331;
                if (bool_8_) {
                    int i_9_
                            = ((((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3)
                            .anInt10282)
                            - ((Class264) (((Class318_Sub1_Sub3_Sub3)
                            class318_sub1_sub3_sub3)
                            .aClass264_10217)).anInt3370);
                    if ((i_9_ ^ 0xffffffff) != -1
                            && (((Class318_Sub1_Sub3_Sub3)
                            class318_sub1_sub3_sub3).anInt10275
                            ^ 0xffffffff) == 0
                            && (((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3)
                            .anInt10310) != 0)
                        i_7_ = 8;
                    if (!bool
                            && (((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3)
                            .anInt10319) > 2)
                        i_7_ = 24;
                    if (!bool
                            && (((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3)
                            .anInt10319) > 3)
                        i_7_ = 32;
                } else {
                    if (!bool && (((Class318_Sub1_Sub3_Sub3)
                            class318_sub1_sub3_sub3).anInt10319
                            ^ 0xffffffff) < -2)
                        i_7_ = 24;
                    if (!bool && (((Class318_Sub1_Sub3_Sub3)
                            class318_sub1_sub3_sub3).anInt10319
                            ^ 0xffffffff) < -3)
                        i_7_ = 32;
                }
                if ((((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3)
                        .anInt10326) > 0
                        && (((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3)
                        .anInt10319) > 1) {
                    i_7_ = 32;
                    ((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3)
                            .anInt10326--;
                }
                if ((i_6_ ^ 0xffffffff) == -3)
                    i_7_ <<= 1;
                else if (i_6_ == 0)
                    i_7_ >>= 1;
                Class127_Sub1.anInt8387 = 0;
                if ((((Class225) class225).anInt2945 ^ 0xffffffff) != 0) {
                    i_7_ <<= 9;
                    if (((((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3)
                            .anInt10319)
                            ^ 0xffffffff)
                            != -2) {
                        if (i_7_ <= ((Class318_Sub1_Sub3_Sub3)
                                class318_sub1_sub3_sub3).anInt10325) {
                            if (((Class318_Sub1_Sub3_Sub3)
                                    class318_sub1_sub3_sub3).anInt10325
                                    > 0) {
                                ((Class318_Sub1_Sub3_Sub3)
                                        class318_sub1_sub3_sub3).anInt10325
                                        -= ((Class225) class225).anInt2945;
                                if ((((Class318_Sub1_Sub3_Sub3)
                                        class318_sub1_sub3_sub3).anInt10325
                                        ^ 0xffffffff)
                                        > -1)
                                    ((Class318_Sub1_Sub3_Sub3)
                                            class318_sub1_sub3_sub3).anInt10325
                                            = 0;
                            }
                        } else {
                            ((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3)
                                    .anInt10325
                                    += ((Class225) class225).anInt2945;
                            if (i_7_ < ((Class318_Sub1_Sub3_Sub3)
                                    class318_sub1_sub3_sub3).anInt10325)
                                ((Class318_Sub1_Sub3_Sub3)
                                        class318_sub1_sub3_sub3).anInt10325
                                        = i_7_;
                        }
                    } else {
                        int i_10_ = (((Class318_Sub1_Sub3_Sub3)
                                class318_sub1_sub3_sub3).anInt10325
                                * ((Class318_Sub1_Sub3_Sub3)
                                class318_sub1_sub3_sub3).anInt10325);
                        int i_11_
                                = ((i_4_ >= ((Class318_Sub1)
                                class318_sub1_sub3_sub3).anInt6377
                                ? -(((Class318_Sub1) class318_sub1_sub3_sub3)
                                .anInt6377) + i_4_
                                : (((Class318_Sub1) class318_sub1_sub3_sub3)
                                .anInt6377) + -i_4_)
                                << -606376951);
                        int i_12_
                                = (((((Class318_Sub1) class318_sub1_sub3_sub3)
                                .anInt6388) <= i_5_
                                ? i_5_ - ((Class318_Sub1)
                                class318_sub1_sub3_sub3).anInt6388
                                : (((Class318_Sub1) class318_sub1_sub3_sub3)
                                .anInt6388) + -i_5_)
                                << 1550268617);
                        int i_13_ = i_12_ >= i_11_ ? i_12_ : i_11_;
                        int i_14_
                                = ((Class225) class225).anInt2945 * 2 * i_13_;
                        if (i_10_ <= i_14_) {
                            if (i_13_ < i_10_ / 2) {
                                ((Class318_Sub1_Sub3_Sub3)
                                        class318_sub1_sub3_sub3).anInt10325
                                        -= ((Class225) class225).anInt2945;
                                if (((Class318_Sub1_Sub3_Sub3)
                                        class318_sub1_sub3_sub3).anInt10325
                                        < 0)
                                    ((Class318_Sub1_Sub3_Sub3)
                                            class318_sub1_sub3_sub3).anInt10325
                                            = 0;
                            } else if ((((Class318_Sub1_Sub3_Sub3)
                                    class318_sub1_sub3_sub3).anInt10325
                                    ^ 0xffffffff)
                                    > (i_7_ ^ 0xffffffff)) {
                                ((Class318_Sub1_Sub3_Sub3)
                                        class318_sub1_sub3_sub3).anInt10325
                                        += ((Class225) class225).anInt2945;
                                if (((Class318_Sub1_Sub3_Sub3)
                                        class318_sub1_sub3_sub3).anInt10325
                                        > i_7_)
                                    ((Class318_Sub1_Sub3_Sub3)
                                            class318_sub1_sub3_sub3).anInt10325
                                            = i_7_;
                            }
                        } else
                            ((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3)
                                    .anInt10325
                                    /= 2;
                    }
                    i_7_ = (((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3)
                            .anInt10325) >> -961523191;
                    if (i_7_ < 1)
                        i_7_ = 1;
                }
                if (i_2_ == i_4_ && i_5_ == i_3_)
                    Class235.anInt3062 = -1;
                else {
                    if ((i_2_ ^ 0xffffffff) > (i_4_ ^ 0xffffffff)) {
                        Class127_Sub1.anInt8387 |= 0x4;
                        ((Class318_Sub1) class318_sub1_sub3_sub3).anInt6377
                                += i_7_;
                        if (i_4_ < (((Class318_Sub1) class318_sub1_sub3_sub3)
                                .anInt6377))
                            ((Class318_Sub1) class318_sub1_sub3_sub3).anInt6377
                                    = i_4_;
                    } else if (i_4_ < i_2_) {
                        Class127_Sub1.anInt8387 |= 0x8;
                        ((Class318_Sub1) class318_sub1_sub3_sub3).anInt6377
                                -= i_7_;
                        if (((Class318_Sub1) class318_sub1_sub3_sub3).anInt6377
                                < i_4_)
                            ((Class318_Sub1) class318_sub1_sub3_sub3).anInt6377
                                    = i_4_;
                    }
                    if ((i_7_ ^ 0xffffffff) <= -33)
                        Class235.anInt3062 = 2;
                    else
                        Class235.anInt3062 = i_6_;
                    if ((i_5_ ^ 0xffffffff) < (i_3_ ^ 0xffffffff)) {
                        Class127_Sub1.anInt8387 |= 0x1;
                        ((Class318_Sub1) class318_sub1_sub3_sub3).anInt6388
                                += i_7_;
                        if (((((Class318_Sub1) class318_sub1_sub3_sub3)
                                .anInt6388)
                                ^ 0xffffffff)
                                < (i_5_ ^ 0xffffffff))
                            ((Class318_Sub1) class318_sub1_sub3_sub3).anInt6388
                                    = i_5_;
                    } else if (i_5_ < i_3_) {
                        Class127_Sub1.anInt8387 |= 0x2;
                        ((Class318_Sub1) class318_sub1_sub3_sub3).anInt6388
                                -= i_7_;
                        if (i_5_ > (((Class318_Sub1) class318_sub1_sub3_sub3)
                                .anInt6388))
                            ((Class318_Sub1) class318_sub1_sub3_sub3).anInt6388
                                    = i_5_;
                    }
                }
                if ((((Class318_Sub1) class318_sub1_sub3_sub3).anInt6377
                        ^ 0xffffffff) == (i_4_ ^ 0xffffffff)
                        && i_5_ == (((Class318_Sub1) class318_sub1_sub3_sub3)
                        .anInt6388)) {
                    if (((((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3)
                            .anInt10322)
                            ^ 0xffffffff)
                            < -1)
                        ((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3)
                                .anInt10322--;
                    ((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3)
                            .anInt10319--;
                }
            }
        }
    }

    final Class31 method1601(int i, int i_15_) {
        anInt2874++;
        Class31 class31;
        synchronized (aClass60_2875) {
            class31
                    = (Class31) aClass60_2875.method583((long) i_15_, i + -148);
        }
        if (class31 != null)
            return class31;
        byte[] is;
        synchronized (aClass45_2866) {
            is = aClass45_2866.method410(-1860, i, i_15_);
        }
        class31 = new Class31();
        ((Class31) class31).aClass219_438 = this;
        if (is != null)
            class31.method332(i ^ ~0x55, new Class348_Sub49(is));
        synchronized (aClass60_2875) {
            aClass60_2875.method582(class31, (long) i_15_, (byte) -109);
        }
        return class31;
    }

    final void method1602(int i) {
        synchronized (aClass60_2875) {
            aClass60_2875.method590(i);
        }
        anInt2865++;
        synchronized (((Class219) this).aClass60_2862) {
            ((Class219) this).aClass60_2862.method590(0);
        }
    }

    final void method1603(int i, int i_16_) {
        anInt2870++;
        synchronized (aClass60_2875) {
            aClass60_2875.method578(2, i);
            if (i_16_ >= -22)
                ((Class219) this).aClass45_2873 = null;
        }
        synchronized (((Class219) this).aClass60_2862) {
            ((Class219) this).aClass60_2862.method578(2, i);
        }
    }

    public static void method1604(int i) {
        aClass196_2864 = null;
        aClass223_2868 = null;
        if (i != 11868)
            anInt2872 = -94;
    }

    Class219(Class230 class230, int i, Class45 class45, Class45 class45_17_) {
        try {
            ((Class219) this).aClass45_2873 = class45_17_;
            aClass45_2866 = class45;
            aClass45_2866.method407(0, 46);
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929
                    (runtimeexception,
                            ("sb.<init>(" + (class230 != null ? "{...}" : "null")
                                    + ',' + i + ',' + (class45 != null ? "{...}" : "null")
                                    + ',' + (class45_17_ != null ? "{...}" : "null")
                                    + ')'));
        }
    }
}
