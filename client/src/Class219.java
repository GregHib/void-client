/* Class219 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class219 {
    Class60 aClass60_2862 = new Class60(20);
    static int anInt2863;
    static Class196 aClass196_2864 = new Class196();
    static int anInt2865;
    private final Class45 aClass45_2866;
    static int anInt2867;
    static Class223 aClass223_2868 = new Class223(0, 1);
    static int anInt2869;
    static int anInt2870;
    static byte aByte2871;
    static int anInt2872 = 0;
    Class45 aClass45_2873;
    static int anInt2874;
    private final Class60 aClass60_2875 = new Class60(64);

    final void method1598(int i) {
        anInt2863++;
        synchronized (aClass60_2875) {
            aClass60_2875.method587(-103);
        }
        synchronized (this.aClass60_2862) {
            if (i <= 42)
                method1598(36);
            this.aClass60_2862.method587(-126);
        }
    }

    static final boolean method1599(byte i, int i_0_, int i_1_) {
        anInt2869++;
        if (i > -65)
            return false;
        return (i_0_ & 0xc580) != 0;
    }

    static final void method1600
            (boolean bool, int i,
             Class318_Sub1_Sub3_Sub3 class318_sub1_sub3_sub3) {
        anInt2867++;
        Class225 class225 = class318_sub1_sub3_sub3.method2422((byte) 72);
        if (class318_sub1_sub3_sub3.anInt10319
                == 0) {
            class318_sub1_sub3_sub3.anInt10326 = 0;
            Class235.anInt3062 = -1;
            Class127_Sub1.anInt8387 = 0;
        } else {
            if (i != (~(class318_sub1_sub3_sub3
                    .anInt10286))
                    && (class318_sub1_sub3_sub3
                    .anInt10218) == 0) {
                Class17 class17
                        = (Class10.aClass87_191.method835
                        ((class318_sub1_sub3_sub3
                                        .anInt10286),
                                i + 7));
                if ((class318_sub1_sub3_sub3
                        .anInt10322) > 0
                        && class17.anInt262 == 0) {
                    Class235.anInt3062 = -1;
                    Class127_Sub1.anInt8387 = 0;
                    class318_sub1_sub3_sub3
                            .anInt10326++;
                    return;
                }
                if ((class318_sub1_sub3_sub3
                        .anInt10322) <= 0
                        && class17.anInt245 == 0) {
                    Class127_Sub1.anInt8387 = 0;
                    Class235.anInt3062 = -1;
                    class318_sub1_sub3_sub3
                            .anInt10326++;
                    return;
                }
            }
            if (class318_sub1_sub3_sub3.anInt10269 != -1
                    && (class318_sub1_sub3_sub3
                    .anInt10225) <= Class367_Sub11.anInt7396) {
                Class368 class368
                        = (Class348_Sub40_Sub18.aClass319_9245.method2543
                        ((byte) 118,
                                (class318_sub1_sub3_sub3
                                        .anInt10269)));
                if (class368.aBoolean4487
                        && class368.anInt4503 != -1) {
                    Class17 class17
                            = Class10.aClass87_191
                            .method835(class368.anInt4503, 7);
                    if ((class318_sub1_sub3_sub3
                            .anInt10322) > 0
                            && class17.anInt262 == 0) {
                        Class127_Sub1.anInt8387 = 0;
                        class318_sub1_sub3_sub3
                                .anInt10326++;
                        Class235.anInt3062 = -1;
                        return;
                    }
                    if ((class318_sub1_sub3_sub3
                            .anInt10322) <= 0
                            && class17.anInt245 == 0) {
                        Class235.anInt3062 = -1;
                        Class127_Sub1.anInt8387 = 0;
                        class318_sub1_sub3_sub3
                                .anInt10326++;
                        return;
                    }
                }
            }
            if (class318_sub1_sub3_sub3.anInt10269 != -1
                    && ((class318_sub1_sub3_sub3
                    .anInt10225) <= Class367_Sub11.anInt7396)) {
                Class368 class368
                        = (Class348_Sub40_Sub18.aClass319_9245.method2543
                        ((byte) 98,
                                (class318_sub1_sub3_sub3
                                        .anInt10269)));
                if (class368.aBoolean4487
                        && class368.anInt4503 != -1) {
                    Class17 class17
                            = Class10.aClass87_191.method835((class368
                                    .anInt4503),
                            i ^ 0x7);
                    if ((class318_sub1_sub3_sub3
                            .anInt10322) > 0
                            && class17.anInt262 == 0) {
                        Class127_Sub1.anInt8387 = 0;
                        class318_sub1_sub3_sub3
                                .anInt10326++;
                        Class235.anInt3062 = -1;
                        return;
                    }
                    if ((class318_sub1_sub3_sub3
                            .anInt10322) <= 0
                            && class17.anInt245 == 0) {
                        Class235.anInt3062 = -1;
                        Class127_Sub1.anInt8387 = 0;
                        class318_sub1_sub3_sub3
                                .anInt10326++;
                        return;
                    }
                }
            }
            int i_2_ = class318_sub1_sub3_sub3.anInt6377;
            int i_3_ = class318_sub1_sub3_sub3.anInt6388;
            int i_4_
                    = (512 * (class318_sub1_sub3_sub3
                    .anIntArray10320
                    [-1 + class318_sub1_sub3_sub3.anInt10319])
                    + class318_sub1_sub3_sub3.method2436((byte) 117) * 256);
            int i_5_
                    = (512 * (class318_sub1_sub3_sub3
                    .anIntArray10317
                    [-1 + class318_sub1_sub3_sub3.anInt10319])
                    - -(class318_sub1_sub3_sub3.method2436((byte) 72) * 256));
            if (i_2_ >= i_4_) {
                if (i_4_ < i_2_) {
                    if (i_5_ > i_3_)
                        class318_sub1_sub3_sub3.method2440((byte) 49, 6144);
                    else if (i_5_ < i_3_)
                        class318_sub1_sub3_sub3.method2440((byte) 49, 2048);
                    else
                        class318_sub1_sub3_sub3.method2440((byte) 49, 4096);
                } else if (i_5_ <= i_3_) {
                    if (i_3_ > i_5_)
                        class318_sub1_sub3_sub3.method2440((byte) 49, 0);
                } else
                    class318_sub1_sub3_sub3.method2440((byte) 49, 8192);
            } else if (i_3_ >= i_5_) {
                if (i_5_ < i_3_)
                    class318_sub1_sub3_sub3.method2440((byte) 49, 14336);
                else
                    class318_sub1_sub3_sub3.method2440((byte) 49, 12288);
            } else
                class318_sub1_sub3_sub3.method2440((byte) 49, 10240);
            byte i_6_
                    = (class318_sub1_sub3_sub3
                    .aByteArray10321
                    [-1 + (class318_sub1_sub3_sub3
                    .anInt10319)]);
            if (!bool
                    && (i_4_ - i_2_ > 1024 || i_4_ + -i_2_ < -1024
                    || -i_3_ + i_5_ > 1024
                    || i_5_ + -i_3_ < -1024)) {
                class318_sub1_sub3_sub3.anInt6388 = i_5_;
                class318_sub1_sub3_sub3.anInt6377 = i_4_;
                class318_sub1_sub3_sub3.method2435((byte) -108,
                        (class318_sub1_sub3_sub3
                                .anInt10282),
                        false);
                Class235.anInt3062 = -1;
                class318_sub1_sub3_sub3
                        .anInt10319--;
                if ((class318_sub1_sub3_sub3
                        .anInt10322) > 0)
                    class318_sub1_sub3_sub3
                            .anInt10322--;
                Class127_Sub1.anInt8387 = 0;
            } else {
                int i_7_ = 16;
                boolean bool_8_ = true;
                if (class318_sub1_sub3_sub3
                        instanceof Class318_Sub1_Sub3_Sub3_Sub1)
                    bool_8_ = ((Class318_Sub1_Sub3_Sub3_Sub1)
                            class318_sub1_sub3_sub3)
                            .aClass79_10505.aBoolean1331;
                if (bool_8_) {
                    int i_9_
                            = ((class318_sub1_sub3_sub3
                            .anInt10282)
                            - class318_sub1_sub3_sub3
                            .aClass264_10217.anInt3370);
                    if (i_9_ != 0
                            && class318_sub1_sub3_sub3.anInt10275 == -1
                            && (class318_sub1_sub3_sub3
                            .anInt10310) != 0)
                        i_7_ = 8;
                    if (!bool
                            && (class318_sub1_sub3_sub3
                            .anInt10319) > 2)
                        i_7_ = 24;
                    if (!bool
                            && (class318_sub1_sub3_sub3
                            .anInt10319) > 3)
                        i_7_ = 32;
                } else {
                    if (!bool && class318_sub1_sub3_sub3.anInt10319 > 1)
                        i_7_ = 24;
                    if (!bool && class318_sub1_sub3_sub3.anInt10319 > 2)
                        i_7_ = 32;
                }
                if ((class318_sub1_sub3_sub3
                        .anInt10326) > 0
                        && (class318_sub1_sub3_sub3
                        .anInt10319) > 1) {
                    i_7_ = 32;
                    class318_sub1_sub3_sub3
                            .anInt10326--;
                }
                if (i_6_ == 2)
                    i_7_ <<= 1;
                else if (i_6_ == 0)
                    i_7_ >>= 1;
                Class127_Sub1.anInt8387 = 0;
                if (class225.anInt2945 != -1) {
                    i_7_ <<= 9;
                    if ((class318_sub1_sub3_sub3
                            .anInt10319) != 1) {
                        if (i_7_ <= class318_sub1_sub3_sub3.anInt10325) {
                            if (class318_sub1_sub3_sub3.anInt10325
                                    > 0) {
                                class318_sub1_sub3_sub3.anInt10325
                                        -= class225.anInt2945;
                                if (class318_sub1_sub3_sub3.anInt10325 < 0)
                                    class318_sub1_sub3_sub3.anInt10325
                                            = 0;
                            }
                        } else {
                            class318_sub1_sub3_sub3
                                    .anInt10325
                                    += class225.anInt2945;
                            if (i_7_ < class318_sub1_sub3_sub3.anInt10325)
                                class318_sub1_sub3_sub3.anInt10325
                                        = i_7_;
                        }
                    } else {
                        int i_10_ = (class318_sub1_sub3_sub3.anInt10325
                                * class318_sub1_sub3_sub3.anInt10325);
                        int i_11_
                                = ((i_4_ >= class318_sub1_sub3_sub3.anInt6377
                                ? -(class318_sub1_sub3_sub3
                                .anInt6377) + i_4_
                                : (class318_sub1_sub3_sub3
                                .anInt6377) + -i_4_)
                                << -606376951);
                        int i_12_
                                = (((class318_sub1_sub3_sub3
                                .anInt6388) <= i_5_
                                ? i_5_ - class318_sub1_sub3_sub3.anInt6388
                                : (class318_sub1_sub3_sub3
                                .anInt6388) + -i_5_)
                                << 1550268617);
                        int i_13_ = Math.max(i_12_, i_11_);
                        int i_14_
                                = class225.anInt2945 * 2 * i_13_;
                        if (i_10_ <= i_14_) {
                            if (i_13_ < i_10_ / 2) {
                                class318_sub1_sub3_sub3.anInt10325
                                        -= class225.anInt2945;
                                if (class318_sub1_sub3_sub3.anInt10325
                                        < 0)
                                    class318_sub1_sub3_sub3.anInt10325
                                            = 0;
                            } else if (i_7_ > class318_sub1_sub3_sub3.anInt10325) {
                                class318_sub1_sub3_sub3.anInt10325
                                        += class225.anInt2945;
                                if (class318_sub1_sub3_sub3.anInt10325
                                        > i_7_)
                                    class318_sub1_sub3_sub3.anInt10325
                                            = i_7_;
                            }
                        } else
                            class318_sub1_sub3_sub3
                                    .anInt10325
                                    /= 2;
                    }
                    i_7_ = (class318_sub1_sub3_sub3
                            .anInt10325) >> -961523191;
                    if (i_7_ < 1)
                        i_7_ = 1;
                }
                if (i_2_ == i_4_ && i_5_ == i_3_)
                    Class235.anInt3062 = -1;
                else {
                    if (i_4_ > i_2_) {
                        Class127_Sub1.anInt8387 |= 0x4;
                        class318_sub1_sub3_sub3.anInt6377
                                += i_7_;
                        if (i_4_ < (class318_sub1_sub3_sub3
                                .anInt6377))
                            class318_sub1_sub3_sub3.anInt6377
                                    = i_4_;
                    } else if (i_4_ < i_2_) {
                        Class127_Sub1.anInt8387 |= 0x8;
                        class318_sub1_sub3_sub3.anInt6377
                                -= i_7_;
                        if (class318_sub1_sub3_sub3.anInt6377
                                < i_4_)
                            class318_sub1_sub3_sub3.anInt6377
                                    = i_4_;
                    }
                    if (i_7_ >= 32)
                        Class235.anInt3062 = 2;
                    else
                        Class235.anInt3062 = i_6_;
                    if (i_3_ < i_5_) {
                        Class127_Sub1.anInt8387 |= 0x1;
                        class318_sub1_sub3_sub3.anInt6388
                                += i_7_;
                        if (i_5_ < (class318_sub1_sub3_sub3
                                .anInt6388))
                            class318_sub1_sub3_sub3.anInt6388
                                    = i_5_;
                    } else if (i_5_ < i_3_) {
                        Class127_Sub1.anInt8387 |= 0x2;
                        class318_sub1_sub3_sub3.anInt6388
                                -= i_7_;
                        if (i_5_ > (class318_sub1_sub3_sub3
                                .anInt6388))
                            class318_sub1_sub3_sub3.anInt6388
                                    = i_5_;
                    }
                }
                if (i_4_ == class318_sub1_sub3_sub3.anInt6377
                        && i_5_ == (class318_sub1_sub3_sub3
                        .anInt6388)) {
                    if ((class318_sub1_sub3_sub3
                            .anInt10322) > 0)
                        class318_sub1_sub3_sub3
                                .anInt10322--;
                    class318_sub1_sub3_sub3
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
                    = (Class31) aClass60_2875.method583(i_15_, i + -148);
        }
        if (class31 != null)
            return class31;
        byte[] is;
        synchronized (aClass45_2866) {
            is = aClass45_2866.method410(-1860, i, i_15_);
        }
        class31 = new Class31();
        class31.aClass219_438 = this;
        if (is != null)
            class31.method332(i ^ ~0x55, new Class348_Sub49(is));
        synchronized (aClass60_2875) {
            aClass60_2875.method582(class31, i_15_, (byte) -109);
        }
        return class31;
    }

    final void method1602(int i) {
        synchronized (aClass60_2875) {
            aClass60_2875.method590(i);
        }
        anInt2865++;
        synchronized (this.aClass60_2862) {
            this.aClass60_2862.method590(0);
        }
    }

    final void method1603(int i, int i_16_) {
        anInt2870++;
        synchronized (aClass60_2875) {
            aClass60_2875.method578(2, i);
            if (i_16_ >= -22)
                this.aClass45_2873 = null;
        }
        synchronized (this.aClass60_2862) {
            this.aClass60_2862.method578(2, i);
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
            this.aClass45_2873 = class45_17_;
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
