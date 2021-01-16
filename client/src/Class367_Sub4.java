/* Class367_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class367_Sub4 extends Class367 {
    static int anInt7308;
    static int anInt7309;
    static int anInt7310;
    private boolean aBoolean7311;
    static int anInt7312;
    static int anInt7313;
    static int anInt7314;
    private Interface18_Impl2[] anInterface18_Impl2Array7315;
    static int anInt7316;
    private boolean aBoolean7317 = false;
    static Class351 aClass351_7318 = new Class351(21, 2);
    static int anInt7319 = 104;
    static boolean aBoolean7320 = false;
    static int anInt7321;
    static int anInt7322;
    static Class114 aClass114_7323 = new Class114(105, -2);
    static Class114 aClass114_7324 = new Class114(96, 8);
    static Class107 aClass107_7325 = new Class107();

    Class367_Sub4(ha_Sub3 var_ha_Sub3) {
        super(var_ha_Sub3);
        if (var_ha_Sub3.aBoolean8101) {
            aBoolean7311
                    = (var_ha_Sub3.anInt8090 ^ 0xffffffff) > -4;
            int i = aBoolean7311 ? 48 : 127;
            int[][] is = new int[6][4096];
            int[][] is_0_ = new int[6][4096];
            int[][] is_1_ = new int[6][4096];
            int i_2_ = 0;
            for (int i_3_ = 0; i_3_ < 64; i_3_++) {
                for (int i_4_ = 0; (i_4_ ^ 0xffffffff) > -65; i_4_++) {
                    float f = -1.0F + (float) i_3_ * 2.0F / 64.0F;
                    float f_5_ = 2.0F * (float) i_4_ / 64.0F - 1.0F;
                    float f_6_
                            = (float) (1.0
                            / Math.sqrt(f * f
                            + (1.0F
                            + f_5_ * f_5_)));
                    f *= f_6_;
                    f_5_ *= f_6_;
                    for (int i_7_ = 0; i_7_ < 6; i_7_++) {
                        float f_8_;
                        if (i_7_ != 0) {
                            if ((i_7_ ^ 0xffffffff) != -2) {
                                if ((i_7_ ^ 0xffffffff) == -3)
                                    f_8_ = f;
                                else if (i_7_ == 3)
                                    f_8_ = -f;
                                else if ((i_7_ ^ 0xffffffff) != -5)
                                    f_8_ = -f_6_;
                                else
                                    f_8_ = f_6_;
                            } else
                                f_8_ = f_5_;
                        } else
                            f_8_ = -f_5_;
                        int i_9_;
                        int i_10_;
                        int i_11_;
                        if (!(f_8_ > 0.0F))
                            i_9_ = i_10_ = i_11_ = 0;
                        else {
                            i_9_ = (int) ((double) i
                                    * Math.pow(f_8_, 96.0));
                            i_10_ = (int) ((double) i
                                    * Math.pow(f_8_, 36.0));
                            i_11_ = (int) (Math.pow(f_8_, 12.0)
                                    * (double) i);
                        }
                        is_0_[i_7_][i_2_] = i_9_ << 1864042872;
                        is_1_[i_7_][i_2_] = i_10_ << -808975368;
                        is[i_7_][i_2_] = i_11_ << 571661400;
                    }
                    i_2_++;
                }
            }
            anInterface18_Impl2Array7315 = new Interface18_Impl2[3];
            anInterface18_Impl2Array7315[0]
                    = this.aHa_Sub3_4479.method3900(is_0_, false, 52,
                    64);
            anInterface18_Impl2Array7315[1]
                    = this.aHa_Sub3_4479.method3900(is_1_, false, 3,
                    64);
            anInterface18_Impl2Array7315[2]
                    = this.aHa_Sub3_4479.method3900(is, false, 17,
                    64);
        }
    }

    final boolean method3530(int i) {
        anInt7314++;
        if (i > -57)
            method3525(91, false);
        return true;
    }

    public static void method3541(byte i) {
        aClass114_7323 = null;
        aClass114_7324 = null;
        aClass107_7325 = null;
        if (i == 23)
            aClass351_7318 = null;
    }

    final void method3525(int i, boolean bool) {
        if (i != 15192)
            method3527(-85, null, -72);
        if (anInterface18_Impl2Array7315 != null && bool) {
            this.aHa_Sub3_4479.method3897(1, -4382);
            this.aHa_Sub3_4479.method3871(Class31.aClass113_430,
                    0);
            Class101_Sub2 class101_sub2
                    = this.aHa_Sub3_4479.method3820(false);
            class101_sub2.method899(1024);
            this.aHa_Sub3_4479
                    .method3853(-32, Class348_Sub40_Sub38.aClass251_9477);
            if (aBoolean7311) {
                this.aHa_Sub3_4479.method3874((Class328_Sub3
                                .aClass229_6519),
                        113,
                        (Class348_Sub23_Sub2
                                .aClass229_9011));
                this.aHa_Sub3_4479
                        .method3924(true, false, 0, Class342.aClass70_4247, false);
                this.aHa_Sub3_4479
                        .method3885(0, true, Class285_Sub2.aClass70_8503);
            } else {
                this.aHa_Sub3_4479.method3874((Class167
                                .aClass229_2207),
                        117,
                        (Class328_Sub3
                                .aClass229_6519));
                this.aHa_Sub3_4479.method3849((byte) 47, 0,
                        (Class318_Sub1_Sub2
                                .aClass70_8737));
                this.aHa_Sub3_4479.method3897(2, -4382);
                this.aHa_Sub3_4479.method3874((Class328_Sub3
                                .aClass229_6519),
                        122,
                        (Class348_Sub23_Sub2
                                .aClass229_9011));
                this.aHa_Sub3_4479.method3849((byte) 47, 0,
                        (Class318_Sub1_Sub2
                                .aClass70_8737));
                this.aHa_Sub3_4479.method3924(true, false, 1,
                        (Class318_Sub1_Sub2
                                .aClass70_8737),
                        false);
                this.aHa_Sub3_4479
                        .method3885(0, true, Class285_Sub2.aClass70_8503);
                this.aHa_Sub3_4479.method3850
                        ((byte) -61, (this.aHa_Sub3_4479
                                .anInterface18_8147));
            }
            this.aHa_Sub3_4479.method3897(0, i + -19574);
            aBoolean7317 = true;
        } else
            this.aHa_Sub3_4479
                    .method3885(0, true, Class285_Sub2.aClass70_8503);
        anInt7313++;
    }

    final void method3527(int i, Interface18 interface18, int i_12_) {
        anInt7316++;
        this.aHa_Sub3_4479.method3850((byte) 91, interface18);
        this.aHa_Sub3_4479.method3923(true, i);
        if (i_12_ != -16776)
            method3525(61, true);
    }

    final void method3520(byte i) {
        if (aBoolean7317) {
            this.aHa_Sub3_4479.method3897(1, i ^ ~0x114a);
            this.aHa_Sub3_4479.method3850((byte) -121, null);
            this.aHa_Sub3_4479.method3871(Class150.aClass113_2047,
                    0);
            this.aHa_Sub3_4479.method3879(-8629);
            if (aBoolean7311) {
                this.aHa_Sub3_4479.method3874
                        (Class167.aClass229_2207, 120, Class167.aClass229_2207);
                this.aHa_Sub3_4479
                        .method3849((byte) 47, 0, Class342.aClass70_4247);
                this.aHa_Sub3_4479
                        .method3885(0, true, Class342.aClass70_4247);
            } else {
                this.aHa_Sub3_4479.method3874
                        (Class167.aClass229_2207, 115, Class167.aClass229_2207);
                this.aHa_Sub3_4479
                        .method3849((byte) 47, 0, Class342.aClass70_4247);
                this.aHa_Sub3_4479.method3897(2, i + -4469);
                this.aHa_Sub3_4479.method3874((Class167
                                .aClass229_2207),
                        i ^ 0x21,
                        (Class167
                                .aClass229_2207));
                this.aHa_Sub3_4479
                        .method3849((byte) 47, 0, Class342.aClass70_4247);
                this.aHa_Sub3_4479.method3849((byte) 47, 1,
                        (Class318_Sub1_Sub2
                                .aClass70_8737));
                this.aHa_Sub3_4479
                        .method3885(0, true, Class342.aClass70_4247);
                this.aHa_Sub3_4479.method3850((byte) 64, null);
            }
            this.aHa_Sub3_4479.method3897(0, i ^ ~0x114a);
            aBoolean7317 = false;
        } else
            this.aHa_Sub3_4479.method3885(0, true,
                    Class342.aClass70_4247);
        anInt7312++;
        if (i != 87)
            aBoolean7311 = true;
        this.aHa_Sub3_4479.method3874(Class167.aClass229_2207,
                i + 13,
                Class167.aClass229_2207);
    }

    static final boolean method3542(int i, Class357[][][] class357s, int i_13_,
                                    int i_14_, int i_15_, boolean bool) {
        anInt7310++;
        byte i_16_
                = bool ? (byte) 1 : (byte) (Class239_Sub15.anInt6006 & 0xff);
        if ((Class289.aByteArrayArrayArray3700[Class355.anInt4372][i_13_][i]
                ^ 0xffffffff)
                == (i_16_ ^ 0xffffffff))
            return false;
        if (((Class348_Sub33.aByteArrayArrayArray6962[Class355.anInt4372]
                [i_13_][i])
                & 0x4)
                == 0)
            return false;
        int i_17_ = i_14_;
        int i_18_ = 0;
        Class348_Sub16_Sub2.anIntArray8862[i_17_] = i_13_;
        Exception_Sub1.anIntArray110[i_17_++] = i;
        Class289.aByteArrayArrayArray3700[Class355.anInt4372][i_13_][i]
                = i_16_;
        while ((i_18_ ^ 0xffffffff) != (i_17_ ^ 0xffffffff)) {
            int i_19_ = 0xffff & Class348_Sub16_Sub2.anIntArray8862[i_18_];
            int i_20_ = ((Class348_Sub16_Sub2.anIntArray8862[i_18_] & 0xff3677)
                    >> -690290320);
            int i_21_
                    = (0xff
                    & Class348_Sub16_Sub2.anIntArray8862[i_18_] >> 1098074104);
            int i_22_ = 0xffff & Exception_Sub1.anIntArray110[i_18_];
            int i_23_ = ((0xff5347 & Exception_Sub1.anIntArray110[i_18_])
                    >> -782063056);
            i_18_ = i_18_ + 1 & 0xfff;
            boolean bool_24_ = false;
            if ((0x4 & (Class348_Sub33.aByteArrayArrayArray6962
                    [Class355.anInt4372][i_19_][i_22_]))
                    == 0)
                bool_24_ = true;
            boolean bool_25_ = false;
            if (class357s != null) {
                int i_26_ = Class355.anInt4372 + 1;
                while_223_:
                for (/**/; (i_26_ ^ 0xffffffff) >= -4; i_26_++) {
                    if (class357s[i_26_] != null
                            && (0x8 & (Class348_Sub33.aByteArrayArrayArray6962
                            [i_26_][i_19_][i_22_])
                            ^ 0xffffffff) == -1) {
                        if (bool_24_
                                && class357s[i_26_][i_19_][i_22_] != null) {
                            if ((class357s[i_26_][i_19_][i_22_]
                                    .aClass318_Sub1_Sub4_4406)
                                    != null) {
                                int i_27_ = Class359.method3492(i_20_, 226);
                                if (((i_27_ ^ 0xffffffff)
                                        == ((class357s[i_26_][i_19_][i_22_]
                                                .aClass318_Sub1_Sub4_4406
                                        .aShort8759)
                                        ^ 0xffffffff))
                                        || ((class357s[i_26_][i_19_][i_22_]
                                        .aClass318_Sub1_Sub4_4403) != null
                                        && (((class357s[i_26_]
                                                [i_19_][i_22_]
                                                .aClass318_Sub1_Sub4_4403
                                        .aShort8759)
                                        ^ 0xffffffff)
                                        == (i_27_ ^ 0xffffffff))))
                                    continue;
                                if ((i_21_ ^ 0xffffffff) != -1) {
                                    int i_28_
                                            = Class359.method3492(i_21_, 226);
                                    if (((i_28_ ^ 0xffffffff)
                                            == ((class357s[i_26_]
                                                    [i_19_][i_22_]
                                                    .aClass318_Sub1_Sub4_4406
                                            .aShort8759)
                                            ^ 0xffffffff))
                                            || ((class357s[i_26_][i_19_][i_22_]
                                            .aClass318_Sub1_Sub4_4403) != null
                                            && ((i_28_ ^ 0xffffffff)
                                            == ((class357s[i_26_]
                                                    [i_19_][i_22_]
                                                    .aClass318_Sub1_Sub4_4403
                                            .aShort8759)
                                            ^ 0xffffffff))))
                                        continue;
                                }
                                if (i_23_ != 0) {
                                    int i_29_
                                            = Class359.method3492(i_23_, 226);
                                    if ((class357s[i_26_][i_19_][i_22_]
                                            .aClass318_Sub1_Sub4_4406
                                            .aShort8759) == i_29_
                                            || ((class357s[i_26_][i_19_][i_22_]
                                            .aClass318_Sub1_Sub4_4403) != null
                                            && (((class357s
                                                    [i_26_][i_19_]
                                                    [i_22_]
                                                    .aClass318_Sub1_Sub4_4403
                                            .aShort8759)
                                            ^ 0xffffffff)
                                            == (i_29_ ^ 0xffffffff))))
                                        continue;
                                }
                            }
                            Class357 class357 = class357s[i_26_][i_19_][i_22_];
                            if (class357.aClass148_4396 != null) {
                                for (Class148 class148 = (class357
                                        .aClass148_4396);
                                     class148 != null;
                                     class148 = (class148
                                             .aClass148_2038)) {
                                    Class318_Sub1_Sub3 class318_sub1_sub3
                                            = (class148
                                            .aClass318_Sub1_Sub3_2040);
                                    if (class318_sub1_sub3
                                            instanceof Interface10) {
                                        Interface10 interface10
                                                = (Interface10) class318_sub1_sub3;
                                        int i_30_ = interface10.method39(59);
                                        int i_31_
                                                = interface10.method41(-32228);
                                        if (i_30_ == 21)
                                            i_30_ = 19;
                                        int i_32_
                                                = i_31_ << -1688308698 | i_30_;
                                        if (i_32_ == i_20_
                                                || i_21_ != 0 && i_21_ == i_32_
                                                || i_23_ != 0 && i_23_ == i_32_)
                                            continue while_223_;
                                    }
                                }
                            }
                        }
                        Class357 class357 = class357s[i_26_][i_19_][i_22_];
                        if (class357 != null
                                && class357.aClass148_4396 != null) {
                            for (Class148 class148
                                 = class357.aClass148_4396;
                                 class148 != null;
                                 class148
                                         = class148.aClass148_2038) {
                                Class318_Sub1_Sub3 class318_sub1_sub3
                                        = (class148
                                        .aClass318_Sub1_Sub3_2040);
                                if (((class318_sub1_sub3
                                        .aShort8743)
                                        != class318_sub1_sub3.aShort8751)
                                        || ((class318_sub1_sub3.aShort8747
                                        ^ 0xffffffff)
                                        != (class318_sub1_sub3.aShort8750
                                        ^ 0xffffffff))) {
                                    for (int i_33_ = (class318_sub1_sub3
                                            .aShort8743);
                                         ((class318_sub1_sub3.aShort8751
                                                 ^ 0xffffffff)
                                                 <= (i_33_ ^ 0xffffffff));
                                         i_33_++) {
                                        for (int i_34_ = (class318_sub1_sub3
                                                .aShort8750);
                                             ((class318_sub1_sub3.aShort8747
                                                     ^ 0xffffffff)
                                                     <= (i_34_ ^ 0xffffffff));
                                             i_34_++)
                                            Class289
                                                    .aByteArrayArrayArray3700
                                                    [i_26_][i_33_][i_34_]
                                                    = i_16_;
                                    }
                                }
                            }
                        }
                        Class289.aByteArrayArrayArray3700[i_26_][i_19_][i_22_]
                                = i_16_;
                        bool_25_ = true;
                    }
                }
            }
            if (bool_25_) {
                int i_35_ = aa_Sub1.aSArray5191[1 + Class355.anInt4372]
                        .method3982((byte) -86, i_22_, i_19_);
                if (i_35_ > Class327.anIntArray4097[i_15_])
                    Class327.anIntArray4097[i_15_] = i_35_;
                int i_36_ = i_19_ << -1709276023;
                if ((Class156.anIntArray2117[i_15_] ^ 0xffffffff)
                        < (i_36_ ^ 0xffffffff))
                    Class156.anIntArray2117[i_15_] = i_36_;
                else if (i_36_ > Class348_Sub40_Sub19.anIntArray9259[i_15_])
                    Class348_Sub40_Sub19.anIntArray9259[i_15_] = i_36_;
                int i_37_ = i_22_ << -544812791;
                if ((Class64.anIntArray1127[i_15_] ^ 0xffffffff)
                        >= (i_37_ ^ 0xffffffff)) {
                    if ((i_37_ ^ 0xffffffff)
                            < (Class56.anIntArray1045[i_15_] ^ 0xffffffff))
                        Class56.anIntArray1045[i_15_] = i_37_;
                } else
                    Class64.anIntArray1127[i_15_] = i_37_;
            }
            if (!bool_24_) {
                if (i_19_ >= 1
                        && (Class289.aByteArrayArrayArray3700[Class355.anInt4372]
                        [i_19_ - 1][i_22_]) != i_16_) {
                    Class348_Sub16_Sub2.anIntArray8862[i_17_]
                            = Class273.method2057(Class273.method2057(1179648,
                            i_19_ + -1),
                            -754974720);
                    Exception_Sub1.anIntArray110[i_17_]
                            = Class273.method2057(i_22_, 1245184);
                    i_17_ = 0xfff & 1 + i_17_;
                    Class289.aByteArrayArrayArray3700[Class355.anInt4372]
                            [i_19_ - 1][i_22_]
                            = i_16_;
                }
                if ((Class348_Sub40_Sub3.anInt9109 ^ 0xffffffff)
                        < (++i_22_ ^ 0xffffffff)) {
                    if (i_19_ - 1 >= 0
                            && ((Class289.aByteArrayArrayArray3700
                            [Class355.anInt4372][-1 + i_19_][i_22_])
                            ^ 0xffffffff) != (i_16_ ^ 0xffffffff)
                            && ((Class348_Sub33.aByteArrayArrayArray6962
                            [Class355.anInt4372][i_19_][i_22_]) & 0x4
                            ^ 0xffffffff) == -1
                            && (0x4 & (Class348_Sub33.aByteArrayArrayArray6962
                            [Class355.anInt4372][-1 + i_19_]
                            [-1 + i_22_])
                            ^ 0xffffffff) == -1) {
                        Class348_Sub16_Sub2.anIntArray8862[i_17_]
                                = (Class273.method2057
                                (1375731712,
                                        Class273.method2057(i_19_ + -1, 1179648)));
                        Exception_Sub1.anIntArray110[i_17_]
                                = Class273.method2057(i_22_, 1245184);
                        Class289.aByteArrayArrayArray3700
                                [Class355.anInt4372][-1 + i_19_][i_22_]
                                = i_16_;
                        i_17_ = 0xfff & 1 + i_17_;
                    }
                    if ((i_16_ ^ 0xffffffff)
                            != ((Class289.aByteArrayArrayArray3700
                            [Class355.anInt4372][i_19_][i_22_])
                            ^ 0xffffffff)) {
                        Class348_Sub16_Sub2.anIntArray8862[i_17_]
                                = (Class273.method2057
                                (318767104,
                                        Class273.method2057(i_19_, 5373952)));
                        Exception_Sub1.anIntArray110[i_17_]
                                = Class273.method2057(i_22_, 5439488);
                        Class289.aByteArrayArrayArray3700
                                [Class355.anInt4372][i_19_][i_22_]
                                = i_16_;
                        i_17_ = i_17_ + 1 & 0xfff;
                    }
                    if ((anInt7319 ^ 0xffffffff) < (1 + i_19_ ^ 0xffffffff)
                            && ((i_16_ ^ 0xffffffff)
                            != ((Class289.aByteArrayArrayArray3700
                            [Class355.anInt4372][i_19_ + 1][i_22_])
                            ^ 0xffffffff))
                            && (0x4 & (Class348_Sub33.aByteArrayArrayArray6962
                            [Class355.anInt4372][i_19_][i_22_])) == 0
                            && (0x4 & (Class348_Sub33.aByteArrayArrayArray6962
                            [Class355.anInt4372][1 + i_19_]
                            [i_22_ + -1])) == 0) {
                        Class348_Sub16_Sub2.anIntArray8862[i_17_]
                                = (Class273.method2057
                                (-1845493760,
                                        Class273.method2057(1 + i_19_, 5373952)));
                        Exception_Sub1.anIntArray110[i_17_]
                                = Class273.method2057(5439488, i_22_);
                        i_17_ = 1 + i_17_ & 0xfff;
                        Class289.aByteArrayArrayArray3700
                                [Class355.anInt4372][i_19_ - -1][i_22_]
                                = i_16_;
                    }
                }
                i_22_--;
                if ((anInt7319 ^ 0xffffffff) < (i_19_ - -1 ^ 0xffffffff)
                        && (Class289.aByteArrayArrayArray3700[Class355.anInt4372]
                        [i_19_ - -1][i_22_]) != i_16_) {
                    Class348_Sub16_Sub2.anIntArray8862[i_17_]
                            = Class273.method2057(1392508928,
                            Class273.method2057(9568256,
                                    1 + i_19_));
                    Exception_Sub1.anIntArray110[i_17_]
                            = Class273.method2057(i_22_, 9633792);
                    i_17_ = 1 + i_17_ & 0xfff;
                    Class289.aByteArrayArrayArray3700[Class355.anInt4372]
                            [i_19_ - -1][i_22_]
                            = i_16_;
                }
                if ((--i_22_ ^ 0xffffffff) <= -1) {
                    if ((i_19_ + -1 ^ 0xffffffff) <= -1
                            && ((Class289.aByteArrayArrayArray3700
                            [Class355.anInt4372][i_19_ - 1][i_22_])
                            ^ 0xffffffff) != (i_16_ ^ 0xffffffff)
                            && (0x4 & (Class348_Sub33.aByteArrayArrayArray6962
                            [Class355.anInt4372][i_19_][i_22_])
                            ^ 0xffffffff) == -1
                            && (0x4 & (Class348_Sub33.aByteArrayArrayArray6962
                            [Class355.anInt4372][-1 + i_19_][1 + i_22_])
                            ^ 0xffffffff) == -1) {
                        Class348_Sub16_Sub2.anIntArray8862[i_17_]
                                = (Class273.method2057
                                (301989888,
                                        Class273.method2057(13762560, -1 + i_19_)));
                        Exception_Sub1.anIntArray110[i_17_]
                                = Class273.method2057(i_22_, 13828096);
                        Class289.aByteArrayArrayArray3700
                                [Class355.anInt4372][i_19_ - 1][i_22_]
                                = i_16_;
                        i_17_ = i_17_ - -1 & 0xfff;
                    }
                    if ((i_16_ ^ 0xffffffff)
                            != ((Class289.aByteArrayArrayArray3700
                            [Class355.anInt4372][i_19_][i_22_])
                            ^ 0xffffffff)) {
                        Class348_Sub16_Sub2.anIntArray8862[i_17_]
                                = Class273.method2057(Class273.method2057(13762560,
                                i_19_),
                                -1828716544);
                        Exception_Sub1.anIntArray110[i_17_]
                                = Class273.method2057(13828096, i_22_);
                        Class289.aByteArrayArrayArray3700
                                [Class355.anInt4372][i_19_][i_22_]
                                = i_16_;
                        i_17_ = 0xfff & i_17_ - -1;
                    }
                    if ((1 + i_19_ ^ 0xffffffff) > (anInt7319 ^ 0xffffffff)
                            && (Class289.aByteArrayArrayArray3700
                            [Class355.anInt4372][1 + i_19_][i_22_]) != i_16_
                            && ((Class348_Sub33.aByteArrayArrayArray6962
                            [Class355.anInt4372][i_19_][i_22_])
                            & 0x4) == 0
                            && ((Class348_Sub33.aByteArrayArrayArray6962
                            [Class355.anInt4372][i_19_ + 1][i_22_ + 1]) & 0x4
                            ^ 0xffffffff) == -1) {
                        Class348_Sub16_Sub2.anIntArray8862[i_17_]
                                = (Class273.method2057
                                (-771751936,
                                        Class273.method2057(i_19_ - -1, 9568256)));
                        Exception_Sub1.anIntArray110[i_17_]
                                = Class273.method2057(i_22_, 9633792);
                        Class289.aByteArrayArrayArray3700
                                [Class355.anInt4372][i_19_ - -1][i_22_]
                                = i_16_;
                        i_17_ = 0xfff & i_17_ - -1;
                    }
                }
            }
        }
        if (Class327.anIntArray4097[i_15_] != -1000000) {
            Class327.anIntArray4097[i_15_] += 40;
            Class156.anIntArray2117[i_15_] -= 512;
            Class348_Sub40_Sub19.anIntArray9259[i_15_] += 512;
            Class56.anIntArray1045[i_15_] += 512;
            Class64.anIntArray1127[i_15_] -= 512;
        }
        return true;
    }

    static final void method3543(byte i) {
        anInt7309++;
        if (i == -89) {
            Class351.aBoolean4328 = false;
            Class354.method3466(i + 6);
        }
    }

    static final int method3544(Class348_Sub49 class348_sub49, int i,
                                String string) {
        try {
            anInt7321++;
            int i_38_ = class348_sub49.anInt7197;
            byte[] is = Class348_Sub24.method2992(string, (byte) -20);
            int i_39_ = 1 % ((-6 - i) / 63);
            class348_sub49.method3381(5537, is.length);
            class348_sub49.anInt7197
                    += (Class64.aClass296_1131.method2227
                    (is.length, 0, class348_sub49.anInt7197,
                            is, 103,
                            class348_sub49.aByteArray7154));
            return class348_sub49.anInt7197 + -i_38_;
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception,
                    ("bk.O("
                            + (class348_sub49 != null
                            ? "{...}" : "null")
                            + ',' + i + ','
                            + (string != null ? "{...}"
                            : "null")
                            + ')'));
        }
    }

    final void method3521(boolean bool, byte i) {
        this.aHa_Sub3_4479.method3874((Class328_Sub3
                        .aClass229_6519),
                126,
                Class167.aClass229_2207);
        if (i != -103)
            method3542(74, null, 65, 65, -77, true);
        anInt7308++;
    }

    final void method3526(int i, int i_40_, int i_41_) {
        if (i != 10756)
            method3520((byte) -127);
        if (aBoolean7317) {
            this.aHa_Sub3_4479.method3897(1, i + -15138);
            this.aHa_Sub3_4479.method3850
                    ((byte) -67, anInterface18_Impl2Array7315[-1 + i_40_]);
            this.aHa_Sub3_4479.method3897(0, i ^ ~0x3b19);
        }
        anInt7322++;
    }
}
