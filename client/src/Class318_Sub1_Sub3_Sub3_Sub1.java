/* Class318_Sub1_Sub3_Sub3_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class318_Sub1_Sub3_Sub3_Sub1 extends Class318_Sub1_Sub3_Sub3 {
    static int anInt10493;
    static int anInt10494;
    static int anInt10495;
    static int anInt10496;
    static int anInt10497;
    static int anInt10498;
    int anInt10499 = -1;
    static int anInt10500;
    static int anInt10501;
    static int anInt10502;
    static int anInt10503;
    static int anInt10504;
    Class79 aClass79_10505;
    static int anInt10506;
    static int anInt10507;
    static int anInt10508;
    static int anInt10509;
    static int anInt10510;
    static int anInt10511;
    int anInt10512 = -1;
    static int anInt10513;
    static int anInt10514;
    static int anInt10515;

    static final void method2441(int i, int i_0_, int i_1_, int i_2_, int i_3_,
                                 int i_4_, int i_5_) {
        if (i_2_ != -22728)
            anInt10503 = 121;
        if ((Class369.anInt4960 ^ 0xffffffff) >= (i_5_ - i_0_ ^ 0xffffffff)
                && (i_0_ + i_5_ ^ 0xffffffff) >= (Class113.anInt1745 ^ 0xffffffff)
                && (Class132.anInt1910 ^ 0xffffffff) >= (-i_0_ + i_3_ ^ 0xffffffff)
                && i_3_ + i_0_ <= Class38.anInt513)
            Class299.method2255(i_0_, i_5_, (byte) -68, i_1_, i_3_, i_4_, i);
        else
            Class205.method1496(i, i_3_, i_4_, i_0_, 2, i_1_, i_5_);
        anInt10498++;
    }

    private final boolean method2442(int i) {
        if (i != 1810797122)
            ((Class318_Sub1_Sub3_Sub3_Sub1) this).anInt10499 = -103;
        anInt10510++;
        return (((Class79)
                ((Class318_Sub1_Sub3_Sub3_Sub1) this).aClass79_10505)
                .aBoolean1396);
    }

    final void method2380(ha var_ha, int i, boolean bool,
                          Class318_Sub1 class318_sub1, int i_6_, byte i_7_,
                          int i_8_) {
        try {
            if (i_7_ > -106)
                ((Class318_Sub1_Sub3_Sub3_Sub1) this).aClass79_10505 = null;
            anInt10513++;
            throw new IllegalStateException();
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception,
                    ("ff.N("
                            + (var_ha != null ? "{...}"
                            : "null")
                            + ',' + i + ',' + bool + ','
                            + (class318_sub1 != null ? "{...}"
                            : "null")
                            + ',' + i_6_ + ',' + i_7_ + ','
                            + i_8_ + ')'));
        }
    }

    final void method2392(boolean bool) {
        anInt10507++;
        if (bool != true)
            ((Class318_Sub1_Sub3_Sub3_Sub1) this).anInt10499 = -13;
        throw new IllegalStateException();
    }

    final boolean method2391(ha var_ha, int i, int i_9_, int i_10_) {
        anInt10514++;
        if (((Class318_Sub1_Sub3_Sub3_Sub1) this).aClass79_10505 == null
                || !method2447(97, 131072, var_ha))
            return false;
        Class101 class101 = var_ha.method3705();
        int i_11_ = ((Class318_Sub1_Sub3_Sub3) this).aClass264_10217
                .method2019((byte) -78);
        class101.method895(i_11_);
        class101.method891(((Class318_Sub1) this).anInt6377,
                ((Class318_Sub1) this).anInt6382,
                ((Class318_Sub1) this).anInt6388);
        boolean bool = false;
        for (int i_12_ = i_10_;
             ((i_12_ ^ 0xffffffff)
                     > (((Class318_Sub1_Sub3_Sub3) this).aClass64Array10323.length
                     ^ 0xffffffff));
             i_12_++) {
            if (((Class318_Sub1_Sub3_Sub3) this).aClass64Array10323[i_12_]
                    != null) {
                boolean bool_13_
                        = (((Class79) (((Class318_Sub1_Sub3_Sub3_Sub1) this)
                        .aClass79_10505)).anInt1337 > 0
                        || (((Class79) (((Class318_Sub1_Sub3_Sub3_Sub1) this)
                        .aClass79_10505)).anInt1333 != -1
                        ? (((Class79) (((Class318_Sub1_Sub3_Sub3_Sub1) this)
                        .aClass79_10505)).anInt1333
                        ^ 0xffffffff) == -2
                        : (((Class79) (((Class318_Sub1_Sub3_Sub3_Sub1) this)
                        .aClass79_10505)).anInt1399
                        ^ 0xffffffff) == -2));
                boolean bool_14_;
                if (Class305.aBoolean3870)
                    bool_14_
                            = (((Class318_Sub1_Sub3_Sub3) this)
                            .aClass64Array10323[i_12_].method623
                            (i_9_, i, class101, bool_13_,
                                    ((Class79) (((Class318_Sub1_Sub3_Sub3_Sub1) this)
                                            .aClass79_10505)).anInt1337,
                                    Class132.anInt1906));
                else
                    bool_14_
                            = (((Class318_Sub1_Sub3_Sub3) this)
                            .aClass64Array10323[i_12_].method628
                            (i_9_, i, class101, bool_13_,
                                    ((Class79) (((Class318_Sub1_Sub3_Sub3_Sub1) this)
                                            .aClass79_10505)).anInt1337));
                if (bool_14_) {
                    bool = true;
                    break;
                }
            }
        }
        ((Class318_Sub1_Sub3_Sub3) this).aClass64Array10323[0]
                = ((Class318_Sub1_Sub3_Sub3) this).aClass64Array10323[1]
                = ((Class318_Sub1_Sub3_Sub3) this).aClass64Array10323[2] = null;
        return bool;
    }

    final void method2443(int i, int i_15_, int i_16_) {
        anInt10497++;
        int i_17_ = ((Class318_Sub1_Sub3_Sub3) this).anIntArray10320[0];
        int i_18_ = ((Class318_Sub1_Sub3_Sub3) this).anIntArray10317[0];
        if (i == 0)
            i_18_++;
        if ((i ^ 0xffffffff) == -2) {
            i_17_++;
            i_18_++;
        }
        if ((i ^ 0xffffffff) == -3)
            i_17_++;
        if ((i ^ 0xffffffff) == -4) {
            i_17_++;
            i_18_--;
        }
        if (i == 4)
            i_18_--;
        if ((i ^ 0xffffffff) == -6) {
            i_17_--;
            i_18_--;
        }
        if ((i ^ 0xffffffff) == -7)
            i_17_--;
        if (i == 7) {
            i_17_--;
            i_18_++;
        }
        if (((Class318_Sub1_Sub3_Sub3) this).anInt10286 != -1
                && (((Class17)
                Class10.aClass87_191.method835(((Class318_Sub1_Sub3_Sub3)
                                this).anInt10286,
                        7)).anInt245
                ^ 0xffffffff) == -2) {
            ((Class318_Sub1_Sub3_Sub3) this).anInt10286 = -1;
            ((Class318_Sub1_Sub3_Sub3) this).anIntArray10236 = null;
        }
        if (((Class318_Sub1_Sub3_Sub3) this).anInt10269 != -1) {
            Class368 class368
                    = (Class348_Sub40_Sub18.aClass319_9245.method2543
                    ((byte) 118, ((Class318_Sub1_Sub3_Sub3) this).anInt10269));
            if (((Class368) class368).aBoolean4487
                    && (((Class368) class368).anInt4503 ^ 0xffffffff) != 0
                    && ((((Class17)
                    Class10.aClass87_191
                            .method835(((Class368) class368).anInt4503, 7))
                    .anInt245)
                    ^ 0xffffffff) == -2)
                ((Class318_Sub1_Sub3_Sub3) this).anInt10269 = -1;
        }
        if (((Class318_Sub1_Sub3_Sub3) this).anInt10291 != -1) {
            Class368 class368
                    = (Class348_Sub40_Sub18.aClass319_9245.method2543
                    ((byte) 77, ((Class318_Sub1_Sub3_Sub3) this).anInt10291));
            if (((Class368) class368).aBoolean4487
                    && (((Class368) class368).anInt4503 ^ 0xffffffff) != 0
                    && (((Class17)
                    Class10.aClass87_191
                            .method835(((Class368) class368).anInt4503, 7))
                    .anInt245) == 1)
                ((Class318_Sub1_Sub3_Sub3) this).anInt10291 = -1;
        }
        if ((((Class318_Sub1_Sub3_Sub3) this).anInt10319 ^ 0xffffffff) > i_16_)
            ((Class318_Sub1_Sub3_Sub3) this).anInt10319++;
        for (int i_19_ = ((Class318_Sub1_Sub3_Sub3) this).anInt10319;
             i_19_ > 0; i_19_--) {
            ((Class318_Sub1_Sub3_Sub3) this).anIntArray10320[i_19_]
                    = ((Class318_Sub1_Sub3_Sub3) this).anIntArray10320[-1 + i_19_];
            ((Class318_Sub1_Sub3_Sub3) this).anIntArray10317[i_19_]
                    = ((Class318_Sub1_Sub3_Sub3) this).anIntArray10317[-1 + i_19_];
            ((Class318_Sub1_Sub3_Sub3) this).aByteArray10321[i_19_]
                    = ((Class318_Sub1_Sub3_Sub3) this).aByteArray10321[i_19_ + -1];
        }
        ((Class318_Sub1_Sub3_Sub3) this).anIntArray10320[0] = i_17_;
        ((Class318_Sub1_Sub3_Sub3) this).anIntArray10317[0] = i_18_;
        ((Class318_Sub1_Sub3_Sub3) this).aByteArray10321[0] = (byte) i_15_;
    }

    final Class318_Sub4 method2386(int i, ha var_ha) {
        anInt10501++;
        if (((Class318_Sub1_Sub3_Sub3_Sub1) this).aClass79_10505 == null
                || !method2447(i + 114, 2048, var_ha))
            return null;
        Class101 class101 = var_ha.method3705();
        int i_20_ = ((Class318_Sub1_Sub3_Sub3) this).aClass264_10217
                .method2019((byte) -69);
        class101.method895(i_20_);
        Class357 class357
                = (Class147.aClass357ArrayArrayArray2029
                [((Class318_Sub1) this).aByte6381]
                [((Class318_Sub1) this).anInt6377 >> Class362.anInt4459]
                [((Class318_Sub1) this).anInt6388 >> Class362.anInt4459]);
        if (class357 != null
                && ((Class357) class357).aClass318_Sub1_Sub1_4402 != null) {
            int i_21_
                    = (-((Class318_Sub1_Sub1)
                    ((Class357) class357).aClass318_Sub1_Sub1_4402).aShort8727
                    + ((Class318_Sub1_Sub3_Sub3) this).anInt10274);
            ((Class318_Sub1_Sub3_Sub3) this).anInt10274
                    -= (float) i_21_ / 10.0F;
        } else
            ((Class318_Sub1_Sub3_Sub3) this).anInt10274
                    -= (float) ((Class318_Sub1_Sub3_Sub3) this).anInt10274 / 10.0F;
        class101.method891(((Class318_Sub1) this).anInt6377,
                (-((Class318_Sub1_Sub3_Sub3) this).anInt10274
                        + ((Class318_Sub1) this).anInt6382 + -20),
                ((Class318_Sub1) this).anInt6388);
        Class225 class225 = this.method2422((byte) 72);
        Class79 class79
                = (((Class79) (((Class318_Sub1_Sub3_Sub3_Sub1) this)
                .aClass79_10505)).anIntArray1377 != null
                ? ((Class318_Sub1_Sub3_Sub3_Sub1) this).aClass79_10505
                .method794(Class318_Sub1_Sub3_Sub3.aClass170_10209, -1)
                : ((Class318_Sub1_Sub3_Sub3_Sub1) this).aClass79_10505);
        ((Class318_Sub1_Sub3_Sub3) this).aBoolean10324 = false;
        Class318_Sub4 class318_sub4 = null;
        if (((Class348_Sub51) Class316.aClass348_Sub51_3959)
                .aClass239_Sub21_7270.method1812(-32350) == i
                && ((Class79) class79).aBoolean1369
                && ((Class225) class225).aBoolean2913) {
            Class17 class17
                    = ((((Class318_Sub1_Sub3_Sub3) this).anInt10286 == -1
                    || ((Class318_Sub1_Sub3_Sub3) this).anInt10218 != 0)
                    ? null
                    : Class10.aClass87_191.method835(((Class318_Sub1_Sub3_Sub3)
                            this).anInt10286,
                    7));
            Class17 class17_22_
                    = ((((Class318_Sub1_Sub3_Sub3) this).anInt10268 == -1
                    || (((Class318_Sub1_Sub3_Sub3) this).aBoolean10213
                    && class17 != null))
                    ? null
                    : Class10.aClass87_191.method835(((Class318_Sub1_Sub3_Sub3)
                            this).anInt10268,
                    7));
            Class64 class64
                    = (Class348.method2711
                    (((Class318_Sub1_Sub3_Sub3) this).anInt10302, i_20_,
                            ((Class318_Sub1_Sub3_Sub3) this).aClass64Array10323[0],
                            ((Class318_Sub1_Sub3_Sub3) this).anInt10208, false,
                            (class17_22_ == null
                                    ? ((Class318_Sub1_Sub3_Sub3) this).anInt10267
                                    : ((Class318_Sub1_Sub3_Sub3) this).anInt10245),
                            0xffff & ((Class79) (((Class318_Sub1_Sub3_Sub3_Sub1) this)
                                    .aClass79_10505)).aShort1339,
                            ((Class79) (((Class318_Sub1_Sub3_Sub3_Sub1) this)
                                    .aClass79_10505)).anInt1399,
                            ((Class318_Sub1_Sub3_Sub3) this).anInt10252, var_ha,
                            0xff & ((Class79) (((Class318_Sub1_Sub3_Sub3_Sub1) this)
                                    .aClass79_10505)).aByte1353,
                            ((Class79) (((Class318_Sub1_Sub3_Sub3_Sub1) this)
                                    .aClass79_10505)).aShort1350 & 0xffff,
                            ((Class79) (((Class318_Sub1_Sub3_Sub3_Sub1) this)
                                    .aClass79_10505)).aByte1347 & 0xff,
                            class17_22_ == null ? class17 : class17_22_));
            if (class64 != null) {
                class318_sub4 = (OutputStream_Sub2.method136
                        (1 + (((Class318_Sub1_Sub3_Sub3) this)
                                        .aClass64Array10323).length,
                                method2442(1810797122), false));
                ((Class318_Sub1_Sub3_Sub3) this).aBoolean10324 = true;
                var_ha.C(false);
                if (!Class305.aBoolean3870)
                    class64.method615(class101,
                            (((Class318_Sub4) class318_sub4)
                                    .aClass318_Sub3Array6414
                                    [(((Class318_Sub1_Sub3_Sub3) this)
                                    .aClass64Array10323).length]),
                            0);
                else
                    class64.method608(class101,
                            (((Class318_Sub4) class318_sub4)
                                    .aClass318_Sub3Array6414
                                    [(((Class318_Sub1_Sub3_Sub3) this)
                                    .aClass64Array10323).length]),
                            Class132.anInt1906, 0);
                var_ha.C(true);
            }
        }
        class101.method895(i_20_);
        class101.method891(((Class318_Sub1) this).anInt6377,
                (-((Class318_Sub1_Sub3_Sub3) this).anInt10274
                        + (-5 + ((Class318_Sub1) this).anInt6382)),
                ((Class318_Sub1) this).anInt6388);
        if (class318_sub4 == null)
            class318_sub4
                    = OutputStream_Sub2.method136((((Class318_Sub1_Sub3_Sub3) this)
                            .aClass64Array10323).length,
                    method2442(1810797122), false);
        this.method2432(var_ha, -15074, class101, false,
                ((Class318_Sub1_Sub3_Sub3) this).aClass64Array10323);
        if (!Class305.aBoolean3870) {
            for (int i_23_ = 0;
                 (((Class318_Sub1_Sub3_Sub3) this).aClass64Array10323.length
                         > i_23_);
                 i_23_++) {
                if (((Class318_Sub1_Sub3_Sub3) this).aClass64Array10323[i_23_]
                        != null)
                    ((Class318_Sub1_Sub3_Sub3) this).aClass64Array10323
                            [i_23_].method615
                            (class101, (((Class318_Sub4) class318_sub4)
                                    .aClass318_Sub3Array6414[i_23_]), 0);
            }
        } else {
            for (int i_24_ = 0;
                 (((Class318_Sub1_Sub3_Sub3) this).aClass64Array10323.length
                         > i_24_);
                 i_24_++) {
                if (((Class318_Sub1_Sub3_Sub3) this).aClass64Array10323[i_24_]
                        != null)
                    ((Class318_Sub1_Sub3_Sub3) this).aClass64Array10323
                            [i_24_].method608
                            (class101,
                                    (((Class318_Sub4) class318_sub4)
                                            .aClass318_Sub3Array6414[i_24_]),
                                    Class132.anInt1906, 0);
            }
        }
        if (((Class318_Sub1_Sub3_Sub3) this).aClass318_Sub10_10327 != null) {
            Class98 class98 = ((Class318_Sub1_Sub3_Sub3) this)
                    .aClass318_Sub10_10327.method2525();
            if (Class305.aBoolean3870)
                var_ha.method3685(class98, Class132.anInt1906);
            else
                var_ha.method3684(class98);
        }
        for (int i_25_ = 0;
             ((i_25_ ^ 0xffffffff)
                     > (((Class318_Sub1_Sub3_Sub3) this).aClass64Array10323.length
                     ^ 0xffffffff));
             i_25_++) {
            if (((Class318_Sub1_Sub3_Sub3) this).aClass64Array10323[i_25_]
                    != null)
                ((Class318_Sub1_Sub3_Sub3) this).aBoolean10324
                        |= ((Class318_Sub1_Sub3_Sub3) this).aClass64Array10323
                        [i_25_].F();
        }
        ((Class318_Sub1_Sub3_Sub3) this).anInt10301 = Class239_Sub15.anInt6006;
        ((Class318_Sub1_Sub3_Sub3) this).aClass64Array10323[0]
                = ((Class318_Sub1_Sub3_Sub3) this).aClass64Array10323[1]
                = ((Class318_Sub1_Sub3_Sub3) this).aClass64Array10323[2] = null;
        return class318_sub4;
    }

    final int method2421(byte i) {
        anInt10495++;
        if ((((Class79) ((Class318_Sub1_Sub3_Sub3_Sub1) this).aClass79_10505)
                .anIntArray1377)
                != null) {
            Class79 class79
                    = ((Class318_Sub1_Sub3_Sub3_Sub1) this).aClass79_10505
                    .method794(Class318_Sub1_Sub3_Sub3.aClass170_10209, -1);
            if (class79 != null && ((Class79) class79).anInt1366 != -1)
                return ((Class79) class79).anInt1366;
        }
        if (i < 113)
            method2448(null, 88);
        return (((Class79)
                ((Class318_Sub1_Sub3_Sub3_Sub1) this).aClass79_10505)
                .anInt1366);
    }

    final int method2393(int i) {
        anInt10506++;
        if (i >= -109)
            ((Class318_Sub1_Sub3_Sub3_Sub1) this).anInt10499 = -47;
        if (((Class318_Sub1_Sub3_Sub3_Sub1) this).aClass79_10505 == null)
            return 0;
        return (((Class79)
                ((Class318_Sub1_Sub3_Sub3_Sub1) this).aClass79_10505)
                .anInt1337);
    }

    final void method2444(int i, boolean bool, int i_26_, int i_27_, int i_28_,
                          int i_29_) {
        ((Class318_Sub1) this).aByte6381 = ((Class318_Sub1) this).aByte6376
                = (byte) i_29_;
        anInt10515++;
        if (Class79.method802(i, i_26_, true))
            ((Class318_Sub1) this).aByte6376++;
        if ((((Class318_Sub1_Sub3_Sub3) this).anInt10286 ^ 0xffffffff) != 0
                && (((Class17)
                Class10.aClass87_191.method835(((Class318_Sub1_Sub3_Sub3)
                                this).anInt10286,
                        7)).anInt245
                ^ 0xffffffff) == -2) {
            ((Class318_Sub1_Sub3_Sub3) this).anIntArray10236 = null;
            ((Class318_Sub1_Sub3_Sub3) this).anInt10286 = -1;
        }
        if (((Class318_Sub1_Sub3_Sub3) this).anInt10269 != -1) {
            Class368 class368
                    = (Class348_Sub40_Sub18.aClass319_9245.method2543
                    ((byte) 117, ((Class318_Sub1_Sub3_Sub3) this).anInt10269));
            if (((Class368) class368).aBoolean4487
                    && ((Class368) class368).anInt4503 != -1
                    && ((((Class17)
                    Class10.aClass87_191
                            .method835(((Class368) class368).anInt4503, 7))
                    .anInt245)
                    ^ 0xffffffff) == -2)
                ((Class318_Sub1_Sub3_Sub3) this).anInt10269 = -1;
        }
        if (((Class318_Sub1_Sub3_Sub3) this).anInt10291 != -1) {
            Class368 class368
                    = (Class348_Sub40_Sub18.aClass319_9245.method2543
                    ((byte) 56, ((Class318_Sub1_Sub3_Sub3) this).anInt10291));
            if (((Class368) class368).aBoolean4487
                    && ((Class368) class368).anInt4503 != -1
                    && ((((Class17)
                    Class10.aClass87_191
                            .method835(((Class368) class368).anInt4503, 7))
                    .anInt245)
                    ^ 0xffffffff) == -2)
                ((Class318_Sub1_Sub3_Sub3) this).anInt10291 = -1;
        }
        if (!bool) {
            int i_30_
                    = i_26_ - ((Class318_Sub1_Sub3_Sub3) this).anIntArray10320[0];
            int i_31_
                    = i + -((Class318_Sub1_Sub3_Sub3) this).anIntArray10317[0];
            if (i_30_ >= -8 && i_30_ <= 8 && (i_31_ ^ 0xffffffff) <= 7
                    && i_31_ <= 8) {
                if ((((Class318_Sub1_Sub3_Sub3) this).anInt10319 ^ 0xffffffff)
                        > -10)
                    ((Class318_Sub1_Sub3_Sub3) this).anInt10319++;
                for (int i_32_ = ((Class318_Sub1_Sub3_Sub3) this).anInt10319;
                     i_32_ > 0; i_32_--) {
                    ((Class318_Sub1_Sub3_Sub3) this).anIntArray10320[i_32_]
                            = (((Class318_Sub1_Sub3_Sub3) this).anIntArray10320
                            [i_32_ - 1]);
                    ((Class318_Sub1_Sub3_Sub3) this).anIntArray10317[i_32_]
                            = (((Class318_Sub1_Sub3_Sub3) this).anIntArray10317
                            [i_32_ + -1]);
                    ((Class318_Sub1_Sub3_Sub3) this).aByteArray10321[i_32_]
                            = (((Class318_Sub1_Sub3_Sub3) this).aByteArray10321
                            [i_32_ + -1]);
                }
                ((Class318_Sub1_Sub3_Sub3) this).anIntArray10320[0] = i_26_;
                ((Class318_Sub1_Sub3_Sub3) this).anIntArray10317[0] = i;
                ((Class318_Sub1_Sub3_Sub3) this).aByteArray10321[0] = (byte) 1;
                return;
            }
        }
        ((Class318_Sub1_Sub3_Sub3) this).anInt10322 = 0;
        ((Class318_Sub1_Sub3_Sub3) this).anInt10319 = 0;
        ((Class318_Sub1_Sub3_Sub3) this).anIntArray10320[0] = i_26_;
        if (i_27_ >= 91) {
            ((Class318_Sub1_Sub3_Sub3) this).anInt10326 = 0;
            ((Class318_Sub1_Sub3_Sub3) this).anIntArray10317[0] = i;
            ((Class318_Sub1) this).anInt6377
                    = (((Class318_Sub1_Sub3_Sub3) this).anIntArray10320[0]
                    << -1437922839) + (i_28_ << 1521356296);
            ((Class318_Sub1) this).anInt6388
                    = (((Class318_Sub1_Sub3_Sub3) this).anIntArray10317[0]
                    << 1741655913) + (i_28_ << 1580577608);
            if (((Class318_Sub1_Sub3_Sub3) this).aClass318_Sub10_10327 != null)
                ((Class318_Sub1_Sub3_Sub3) this).aClass318_Sub10_10327
                        .method2529();
        }
    }

    final Class30 method2381(ha var_ha, int i) {
        if (i != 7)
            ((Class318_Sub1_Sub3_Sub3_Sub1) this).anInt10512 = 102;
        anInt10493++;
        return null;
    }

    final boolean method2445(byte i) {
        anInt10500++;
        if (((Class318_Sub1_Sub3_Sub3_Sub1) this).aClass79_10505 == null)
            return false;
        int i_33_ = 116 % ((-44 - i) / 38);
        return true;
    }

    final int method2425(int i) {
        anInt10496++;
        if ((((Class79) ((Class318_Sub1_Sub3_Sub3_Sub1) this).aClass79_10505)
                .anIntArray1377)
                != null) {
            Class79 class79
                    = ((Class318_Sub1_Sub3_Sub3_Sub1) this).aClass79_10505
                    .method794(Class318_Sub1_Sub3_Sub3.aClass170_10209, -1);
            if (class79 != null
                    && (((Class79) class79).anInt1336 ^ 0xffffffff) != 0)
                return ((Class79) class79).anInt1336;
        }
        if (i != -1)
            ((Class318_Sub1_Sub3_Sub3_Sub1) this).anInt10499 = -69;
        return (((Class79)
                ((Class318_Sub1_Sub3_Sub3_Sub1) this).aClass79_10505)
                .anInt1336);
    }

    final boolean method2388(int i) {
        anInt10502++;
        if (i > -65)
            return true;
        return false;
    }

    final int method2426(int i) {
        anInt10504++;
        if (i != 200)
            return 115;
        if ((((Class79) ((Class318_Sub1_Sub3_Sub3_Sub1) this).aClass79_10505)
                .anIntArray1377)
                != null) {
            Class79 class79
                    = ((Class318_Sub1_Sub3_Sub3_Sub1) this).aClass79_10505
                    .method794(Class318_Sub1_Sub3_Sub3.aClass170_10209, -1);
            if (class79 != null && ((Class79) class79).anInt1390 != -1)
                return ((Class79) class79).anInt1390;
        }
        if ((((Class79) ((Class318_Sub1_Sub3_Sub3_Sub1) this).aClass79_10505)
                .anInt1390)
                == -1)
            return super.method2426(200);
        return (((Class79)
                ((Class318_Sub1_Sub3_Sub3_Sub1) this).aClass79_10505)
                .anInt1390);
    }

    final void method2387(ha var_ha, int i) {
        anInt10509++;
        if (((Class318_Sub1_Sub3_Sub3_Sub1) this).aClass79_10505 != null
                && (((Class318_Sub1_Sub3_Sub3) this).aBoolean10318
                || method2447(123, 0, var_ha))) {
            if (i > -125)
                method2391(null, -2, -103, 34);
            Class101 class101 = var_ha.method3705();
            class101.method895(((Class318_Sub1_Sub3_Sub3) this)
                    .aClass264_10217.method2019((byte) -118));
            class101.method891(((Class318_Sub1) this).anInt6377,
                    -20 + ((Class318_Sub1) this).anInt6382,
                    ((Class318_Sub1) this).anInt6388);
            this.method2432(var_ha, -15074, class101,
                    ((Class318_Sub1_Sub3_Sub3) this).aBoolean10318,
                    (((Class318_Sub1_Sub3_Sub3) this)
                            .aClass64Array10323));
            ((Class318_Sub1_Sub3_Sub3) this).aClass64Array10323[0]
                    = ((Class318_Sub1_Sub3_Sub3) this).aClass64Array10323[1]
                    = ((Class318_Sub1_Sub3_Sub3) this).aClass64Array10323[2]
                    = null;
        }
    }

    public Class318_Sub1_Sub3_Sub3_Sub1() {
        /* empty */
    }

    static final boolean method2446(char c, byte i) {
        if (i != 105)
            anInt10503 = 124;
        anInt10508++;
        if ((c < 48 || c > 57)
                && ((c ^ 0xffffffff) > -66 || (c ^ 0xffffffff) < -91)
                && (c < 97 || c > 122))
            return false;
        return true;
    }

    private final boolean method2447(int i, int i_34_, ha var_ha) {
        if (i <= 84)
            ((Class318_Sub1_Sub3_Sub3_Sub1) this).aClass79_10505 = null;
        anInt10494++;
        int i_35_ = i_34_;
        Class225 class225 = this.method2422((byte) 72);
        Class17 class17
                = ((((Class318_Sub1_Sub3_Sub3) this).anInt10286 == -1
                || ((Class318_Sub1_Sub3_Sub3) this).anInt10218 != 0)
                ? null
                : Class10.aClass87_191.method835(((Class318_Sub1_Sub3_Sub3)
                        this).anInt10286,
                7));
        Class17 class17_36_
                = ((((Class318_Sub1_Sub3_Sub3) this).anInt10268 != -1
                && (!((Class318_Sub1_Sub3_Sub3) this).aBoolean10213
                || class17 == null))
                ? Class10.aClass87_191
                .method835(((Class318_Sub1_Sub3_Sub3) this).anInt10268, 7)
                : null);
        int i_37_ = ((Class225) class225).anInt2932;
        int i_38_ = ((Class225) class225).anInt2941;
        if (i_37_ != 0 || i_38_ != 0
                || (((Class225) class225).anInt2950 ^ 0xffffffff) != -1
                || (((Class225) class225).anInt2926 ^ 0xffffffff) != -1)
            i_34_ |= 0x7;
        boolean bool = (((Class318_Sub1_Sub3_Sub3) this).aByte10279 != 0
                && (Class367_Sub11.anInt7396
                >= ((Class318_Sub1_Sub3_Sub3) this).anInt10248)
                && (Class367_Sub11.anInt7396
                < ((Class318_Sub1_Sub3_Sub3) this).anInt10250));
        if (bool)
            i_34_ |= 0x80000;
        int i_39_ = ((Class318_Sub1_Sub3_Sub3) this).aClass264_10217
                .method2019((byte) -25);
        Class64 class64
                = (((Class318_Sub1_Sub3_Sub3) this).aClass64Array10323[0]
                = (((Class318_Sub1_Sub3_Sub3_Sub1) this).aClass79_10505
                .method800
                        (i_39_, ((Class318_Sub1_Sub3_Sub3) this).aClass182Array10308,
                                Class10.aClass87_191, false, class17_36_,
                                ((Class318_Sub1_Sub3_Sub3) this).anInt10203,
                                Class64_Sub3.aClass261_5558,
                                ((Class318_Sub1_Sub3_Sub3) this).anInt10267, class17,
                                Class318_Sub1_Sub3_Sub3.aClass170_10209, var_ha,
                                ((Class318_Sub1_Sub3_Sub3) this).anInt10312,
                                ((Class318_Sub1_Sub3_Sub3) this).anIntArray10296,
                                ((Class318_Sub1_Sub3_Sub3) this).anInt10244,
                                ((Class318_Sub1_Sub3_Sub3) this).anInt10245, i_34_,
                                ((Class318_Sub1_Sub3_Sub3) this).anInt10232)));
        if (class64 == null)
            return false;
        ((Class318_Sub1_Sub3_Sub3) this).anInt10207 = class64.fa();
        ((Class318_Sub1_Sub3_Sub3) this).anInt10230 = class64.ma();
        this.method2439(-125, class64);
        if (i_37_ != 0 || i_38_ != 0) {
            this.method2424(i_39_, i_37_, ((Class225) class225).anInt2943,
                    i_38_, (byte) 78, ((Class225) class225).anInt2912);
            if (((Class318_Sub1_Sub3_Sub3) this).anInt10302 != 0)
                ((Class318_Sub1_Sub3_Sub3) this).aClass64Array10323[0]
                        .FA(((Class318_Sub1_Sub3_Sub3) this).anInt10302);
            if ((((Class318_Sub1_Sub3_Sub3) this).anInt10208 ^ 0xffffffff)
                    != -1)
                ((Class318_Sub1_Sub3_Sub3) this).aClass64Array10323[0]
                        .VA(((Class318_Sub1_Sub3_Sub3) this).anInt10208);
            if (((Class318_Sub1_Sub3_Sub3) this).anInt10252 != 0)
                ((Class318_Sub1_Sub3_Sub3) this).aClass64Array10323[0]
                        .H(0, ((Class318_Sub1_Sub3_Sub3) this).anInt10252, 0);
        } else
            this.method2424(i_39_, this.method2436((byte) 78) << 213238601, 0,
                    this.method2436((byte) 108) << 703949321,
                    (byte) 92, 0);
        if (bool)
            class64.method624(((Class318_Sub1_Sub3_Sub3) this).aByte10255,
                    ((Class318_Sub1_Sub3_Sub3) this).aByte10206,
                    ((Class318_Sub1_Sub3_Sub3) this).aByte10270,
                    (0xff
                            & ((Class318_Sub1_Sub3_Sub3) this).aByte10279));
        if (((Class318_Sub1_Sub3_Sub3) this).anInt10269 == -1
                || ((Class318_Sub1_Sub3_Sub3) this).anInt10240 == -1)
            ((Class318_Sub1_Sub3_Sub3) this).aClass64Array10323[1] = null;
        else {
            Class368 class368
                    = (Class348_Sub40_Sub18.aClass319_9245.method2543
                    ((byte) 56, ((Class318_Sub1_Sub3_Sub3) this).anInt10269));
            boolean bool_40_
                    = ((((Class368) class368).aByte4488 ^ 0xffffffff) == -4
                    && (i_37_ != 0 || i_38_ != 0));
            int i_41_ = i_35_;
            if (!bool_40_) {
                if ((((Class318_Sub1_Sub3_Sub3) this).anInt10237 ^ 0xffffffff)
                        != -1)
                    i_41_ |= 0x5;
                if (((Class318_Sub1_Sub3_Sub3) this).anInt10220 != 0)
                    i_41_ |= 0x2;
                if ((((Class318_Sub1_Sub3_Sub3) this).anInt10278 ^ 0xffffffff)
                        <= -1)
                    i_41_ |= 0x7;
            } else
                i_41_ |= 0x7;
            Class64 class64_42_
                    = (((Class318_Sub1_Sub3_Sub3) this).aClass64Array10323[1]
                    = (class368.method3562
                    (((Class318_Sub1_Sub3_Sub3) this).anInt10240, var_ha,
                            ((Class318_Sub1_Sub3_Sub3) this).anInt10243, i_41_,
                            ((Class318_Sub1_Sub3_Sub3) this).anInt10283,
                            Class10.aClass87_191, (byte) 78)));
            if (class64_42_ != null) {
                if ((((Class318_Sub1_Sub3_Sub3) this).anInt10278 ^ 0xffffffff)
                        > -1) {
                    if (((Class318_Sub1_Sub3_Sub3) this).anInt10237 != 0)
                        class64_42_.a(2048 * (((Class318_Sub1_Sub3_Sub3) this)
                                .anInt10237));
                } else {
                    int i_43_ = 0;
                    int i_44_ = 0;
                    int i_45_ = 0;
                    if (((Class225) class225).anIntArrayArray2939 != null
                            && ((((Class225) class225).anIntArrayArray2939
                            [((Class318_Sub1_Sub3_Sub3) this).anInt10278])
                            != null)) {
                        i_45_ += (((Class225) class225).anIntArrayArray2939
                                [((Class318_Sub1_Sub3_Sub3) this).anInt10278]
                                [2]);
                        i_43_ += (((Class225) class225).anIntArrayArray2939
                                [((Class318_Sub1_Sub3_Sub3) this).anInt10278]
                                [0]);
                        i_44_ += (((Class225) class225).anIntArrayArray2939
                                [((Class318_Sub1_Sub3_Sub3) this).anInt10278]
                                [1]);
                    }
                    if (((Class225) class225).anIntArrayArray2910 != null
                            && ((((Class225) class225).anIntArrayArray2910
                            [((Class318_Sub1_Sub3_Sub3) this).anInt10278])
                            != null)) {
                        i_44_ += (((Class225) class225).anIntArrayArray2910
                                [((Class318_Sub1_Sub3_Sub3) this).anInt10278]
                                [1]);
                        i_43_ += (((Class225) class225).anIntArrayArray2910
                                [((Class318_Sub1_Sub3_Sub3) this).anInt10278]
                                [0]);
                        i_45_ += (((Class225) class225).anIntArrayArray2910
                                [((Class318_Sub1_Sub3_Sub3) this).anInt10278]
                                [2]);
                    }
                    if ((i_45_ ^ 0xffffffff) != -1 || i_43_ != 0) {
                        int i_46_ = i_39_;
                        if ((((Class318_Sub1_Sub3_Sub3) this).anIntArray10296
                                != null)
                                && ((((Class318_Sub1_Sub3_Sub3) this)
                                .anIntArray10296
                                [((Class318_Sub1_Sub3_Sub3) this).anInt10278])
                                != -1))
                            i_46_ = (((Class318_Sub1_Sub3_Sub3) this)
                                    .anIntArray10296
                                    [(((Class318_Sub1_Sub3_Sub3) this)
                                    .anInt10278)]);
                        int i_47_
                                = (-i_39_ + (i_46_
                                + 2048 * ((Class318_Sub1_Sub3_Sub3)
                                this).anInt10237)
                                & 0x3fff);
                        if ((i_47_ ^ 0xffffffff) != -1)
                            class64_42_.a(i_47_);
                        int i_48_ = Class70.anIntArray1207[i_47_];
                        int i_49_ = Class70.anIntArray1204[i_47_];
                        int i_50_
                                = i_45_ * i_48_ - -(i_43_ * i_49_) >> -32107538;
                        i_45_ = i_45_ * i_49_ + -(i_43_ * i_48_) >> 231876942;
                        i_43_ = i_50_;
                    }
                    class64_42_.H(i_43_, i_44_, i_45_);
                }
                if ((((Class318_Sub1_Sub3_Sub3) this).anInt10220 ^ 0xffffffff)
                        != -1)
                    class64_42_.H(0,
                            (-((Class318_Sub1_Sub3_Sub3) this).anInt10220
                                    << 1810797122),
                            0);
                if (bool_40_) {
                    if ((((Class318_Sub1_Sub3_Sub3) this).anInt10302
                            ^ 0xffffffff)
                            != -1)
                        class64_42_
                                .FA(((Class318_Sub1_Sub3_Sub3) this).anInt10302);
                    if (((Class318_Sub1_Sub3_Sub3) this).anInt10208 != 0)
                        class64_42_
                                .VA(((Class318_Sub1_Sub3_Sub3) this).anInt10208);
                    if ((((Class318_Sub1_Sub3_Sub3) this).anInt10252
                            ^ 0xffffffff)
                            != -1)
                        class64_42_.H(0, (((Class318_Sub1_Sub3_Sub3) this)
                                .anInt10252), 0);
                }
            }
        }
        if ((((Class318_Sub1_Sub3_Sub3) this).anInt10291 ^ 0xffffffff) == 0
                || (((Class318_Sub1_Sub3_Sub3) this).anInt10224 ^ 0xffffffff) == 0)
            ((Class318_Sub1_Sub3_Sub3) this).aClass64Array10323[2] = null;
        else {
            Class368 class368
                    = (Class348_Sub40_Sub18.aClass319_9245.method2543
                    ((byte) 98, ((Class318_Sub1_Sub3_Sub3) this).anInt10291));
            boolean bool_51_
                    = ((((Class368) class368).aByte4488 ^ 0xffffffff) == -4
                    && (i_37_ != 0 || i_38_ != 0));
            int i_52_ = i_35_;
            if (!bool_51_) {
                if ((((Class318_Sub1_Sub3_Sub3) this).anInt10202 ^ 0xffffffff)
                        != -1)
                    i_52_ |= 0x5;
                if (((Class318_Sub1_Sub3_Sub3) this).anInt10260 != 0)
                    i_52_ |= 0x2;
                if (((Class318_Sub1_Sub3_Sub3) this).anInt10289 >= 0)
                    i_52_ |= 0x7;
            } else
                i_52_ |= 0x7;
            Class64 class64_53_
                    = (((Class318_Sub1_Sub3_Sub3) this).aClass64Array10323[2]
                    = (class368.method3558
                    (((Class318_Sub1_Sub3_Sub3) this).anInt10273,
                            ((Class318_Sub1_Sub3_Sub3) this).anInt10276, var_ha,
                            i_52_, 3172, Class10.aClass87_191,
                            ((Class318_Sub1_Sub3_Sub3) this).anInt10224)));
            if (class64_53_ != null) {
                if (((Class318_Sub1_Sub3_Sub3) this).anInt10289 >= 0
                        && ((Class225) class225).anIntArrayArray2939 != null
                        && ((((Class225) class225).anIntArrayArray2939
                        [((Class318_Sub1_Sub3_Sub3) this).anInt10289])
                        != null)) {
                    int i_54_ = 0;
                    int i_55_ = 0;
                    int i_56_ = 0;
                    if (((Class225) class225).anIntArrayArray2939 != null
                            && ((((Class225) class225).anIntArrayArray2939
                            [((Class318_Sub1_Sub3_Sub3) this).anInt10289])
                            != null)) {
                        i_55_ += (((Class225) class225).anIntArrayArray2939
                                [((Class318_Sub1_Sub3_Sub3) this).anInt10289]
                                [1]);
                        i_54_ += (((Class225) class225).anIntArrayArray2939
                                [((Class318_Sub1_Sub3_Sub3) this).anInt10289]
                                [0]);
                        i_56_ += (((Class225) class225).anIntArrayArray2939
                                [((Class318_Sub1_Sub3_Sub3) this).anInt10289]
                                [2]);
                    }
                    if (((Class225) class225).anIntArrayArray2910 != null
                            && ((((Class225) class225).anIntArrayArray2910
                            [((Class318_Sub1_Sub3_Sub3) this).anInt10289])
                            != null)) {
                        i_55_ += (((Class225) class225).anIntArrayArray2910
                                [((Class318_Sub1_Sub3_Sub3) this).anInt10289]
                                [1]);
                        i_54_ += (((Class225) class225).anIntArrayArray2910
                                [((Class318_Sub1_Sub3_Sub3) this).anInt10289]
                                [0]);
                        i_56_ += (((Class225) class225).anIntArrayArray2910
                                [((Class318_Sub1_Sub3_Sub3) this).anInt10289]
                                [2]);
                    }
                    if (i_56_ != 0 || (i_54_ ^ 0xffffffff) != -1) {
                        int i_57_ = i_39_;
                        if ((((Class318_Sub1_Sub3_Sub3) this).anIntArray10296
                                != null)
                                && ((((Class318_Sub1_Sub3_Sub3) this)
                                .anIntArray10296
                                [((Class318_Sub1_Sub3_Sub3) this).anInt10289])
                                != -1))
                            i_57_ = (((Class318_Sub1_Sub3_Sub3) this)
                                    .anIntArray10296
                                    [(((Class318_Sub1_Sub3_Sub3) this)
                                    .anInt10289)]);
                        int i_58_
                                = (0x3fff
                                & -i_39_ + (i_57_
                                + 2048 * ((Class318_Sub1_Sub3_Sub3)
                                this).anInt10202));
                        if (i_58_ != 0)
                            class64_53_.a(i_58_);
                        int i_59_ = Class70.anIntArray1207[i_58_];
                        int i_60_ = Class70.anIntArray1204[i_58_];
                        int i_61_
                                = i_56_ * i_59_ - -(i_60_ * i_54_) >> 1049013518;
                        i_56_ = i_60_ * i_56_ - i_59_ * i_54_ >> 1591912270;
                        i_54_ = i_61_;
                    }
                    class64_53_.H(i_54_, i_55_, i_56_);
                } else if (((Class318_Sub1_Sub3_Sub3) this).anInt10202 != 0)
                    class64_53_
                            .a(2048 * ((Class318_Sub1_Sub3_Sub3) this).anInt10202);
                if ((((Class318_Sub1_Sub3_Sub3) this).anInt10260 ^ 0xffffffff)
                        != -1)
                    class64_53_.H(0,
                            (-((Class318_Sub1_Sub3_Sub3) this).anInt10260
                                    << 1146830786),
                            0);
                if (bool_51_) {
                    if ((((Class318_Sub1_Sub3_Sub3) this).anInt10302
                            ^ 0xffffffff)
                            != -1)
                        class64_53_
                                .FA(((Class318_Sub1_Sub3_Sub3) this).anInt10302);
                    if ((((Class318_Sub1_Sub3_Sub3) this).anInt10208
                            ^ 0xffffffff)
                            != -1)
                        class64_53_
                                .VA(((Class318_Sub1_Sub3_Sub3) this).anInt10208);
                    if ((((Class318_Sub1_Sub3_Sub3) this).anInt10252
                            ^ 0xffffffff)
                            != -1)
                        class64_53_.H(0, (((Class318_Sub1_Sub3_Sub3) this)
                                .anInt10252), 0);
                }
            }
        }
        return true;
    }

    final void method2448(Class79 class79, int i) {
        anInt10511++;
        ((Class318_Sub1_Sub3_Sub3_Sub1) this).aClass79_10505 = class79;
        if (i != -2)
            ((Class318_Sub1_Sub3_Sub3_Sub1) this).anInt10512 = 69;
        if (((Class318_Sub1_Sub3_Sub3) this).aClass318_Sub10_10327 != null)
            ((Class318_Sub1_Sub3_Sub3) this).aClass318_Sub10_10327
                    .method2529();
    }
}
