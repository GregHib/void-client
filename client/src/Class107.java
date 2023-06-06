/* Class107 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class107 {
    static int anInt1642;
    static int anInt1643;
    static int anInt1644;
    static int anInt1645 = -2;
    static int anInt1646;
    Class348_Sub42 aClass348_Sub42_1647 = new Class348_Sub42();
    static int anInt1648;
    static int anInt1649;
    static int[] anIntArray1650 = new int[1000];
    static int anInt1651;
    private Class348_Sub42 aClass348_Sub42_1652;
    static int anInt1653;
    static int anInt1654;
    static int anInt1655;

    final int method1002(int i) {
        anInt1643++;
        int i_0_ = i;
        for (Class348_Sub42 class348_sub42 = (this.aClass348_Sub42_1647.aClass348_Sub42_7063); this.aClass348_Sub42_1647 != class348_sub42; class348_sub42 = class348_sub42.aClass348_Sub42_7063)
            i_0_++;
        return i_0_;
    }

    final Class348_Sub42 method1003(byte i) {
        anInt1644++;
        if (i <= 41) return null;
        Class348_Sub42 class348_sub42 = aClass348_Sub42_1652;
        if (class348_sub42 == this.aClass348_Sub42_1647) {
            aClass348_Sub42_1652 = null;
            return null;
        }
        aClass348_Sub42_1652 = class348_sub42.aClass348_Sub42_7063;
        return class348_sub42;
    }

    public static void method1004(byte i) {
        anIntArray1650 = null;
        if (i != 16) method1006(false, (byte) -62);
    }

    final void method1005(boolean bool, Class348_Sub42 class348_sub42) {
        if (class348_sub42.aClass348_Sub42_7060 != null) class348_sub42.method3162(bool);
        anInt1654++;
        class348_sub42.aClass348_Sub42_7063 = this.aClass348_Sub42_1647;
        class348_sub42.aClass348_Sub42_7060 = (this.aClass348_Sub42_1647.aClass348_Sub42_7060);
        if (bool == true) {
            class348_sub42.aClass348_Sub42_7060.aClass348_Sub42_7063 = class348_sub42;
            class348_sub42.aClass348_Sub42_7063.aClass348_Sub42_7060 = class348_sub42;
        }
    }

    static final void method1006(boolean bool, byte i) {
        anInt1655++;
        if (bool) {
            if (r.anInt9721 != -1) Class14.method235(r.anInt9721, (byte) -108);
            for (Class348_Sub41 class348_sub41 = (Class348_Sub41) Class125.aClass356_4915.method3484(0); class348_sub41 != null; class348_sub41 = ((Class348_Sub41) Class125.aClass356_4915.method3482(0))) {
                if (!class348_sub41.method2712((byte) 4)) {
                    class348_sub41 = ((Class348_Sub41) Class125.aClass356_4915.method3484(0));
                    if (class348_sub41 == null) break;
                }
                Class127_Sub1.method1118(true, false, class348_sub41, 2533);
            }
            r.anInt9721 = -1;
            Class125.aClass356_4915 = new Class356(8);
            Class99.method882((byte) 11);
            r.anInt9721 = Class54.anInt970;
            Class239.method1713(false, 520);
            Class354.method3466(-119);
            Class66.method703(r.anInt9721);
        }
        Class223.aBoolean2895 = true;
        if (i < 49) anInt1651 = 10;
    }

    static final void method1007(Class46 class46, ha var_ha, int i, int i_1_, int i_2_) {
        try {
            anInt1648++;
            aa var_aa = class46.method425(var_ha, (byte) 40);
            if (var_aa != null) {
                if (i_2_ != 22960) anIntArray1650 = null;
                var_ha.KA(i, i_1_, i + class46.anInt709, class46.anInt789 + i_1_);
                if (Class259.anInt3306 != 2 && Class259.anInt3306 != 5 && Class108.aClass105_1664 != null) {
                    int i_3_;
                    int i_4_;
                    int i_5_;
                    int i_6_;
                    if (Class348_Sub40_Sub21.anInt9282 == 4) {
                        i_3_ = Class348_Sub7.anInt6652;
                        i_4_ = Class348_Sub6.anInt6633;
                        i_5_ = 4096;
                        i_6_ = 0x3fff & (int) -Class314.aFloat3938;
                    } else {
                        i_5_ = 4096 - 16 * Class348_Sub49_Sub1.anInt9750;
                        i_3_ = (Class132.aPlayer_1907.y);
                        i_6_ = ((int) -Class314.aFloat3938 - -r_Sub2.anInt10483 & 0x3fff);
                        i_4_ = (Class132.aPlayer_1907.x);
                    }
                    int i_7_ = 48 - (-(i_4_ / 128) - -(Class367_Sub4.anInt7319 * 2)) - -208;
                    int i_8_ = (208 - (Class348_Sub40_Sub3.anInt9109 * 2 - 48) + 4 * Class348_Sub40_Sub3.anInt9109 - i_3_ / 128);
                    Class108.aClass105_1664.method967(((float) class46.anInt709 / 2.0F + (float) i), ((float) class46.anInt789 / 2.0F + (float) i_1_), (float) i_7_, (float) i_8_, i_5_, i_6_ << 2, var_aa, i, i_1_);
                    for (Class348_Sub35 class348_sub35 = (Class348_Sub35) Class318_Sub1_Sub5_Sub1.aClass262_10125.method1995(i_2_ ^ 0x59b4); class348_sub35 != null; class348_sub35 = (Class348_Sub35) Class318_Sub1_Sub5_Sub1.aClass262_10125.method1990((byte) 92)) {
                        int i_9_ = class348_sub35.anInt6976;
                        int i_10_ = (-za_Sub2.regionTileX + ((0xfffe5b0 & (r_Sub2.aClass252_10488.anIntArray3238[i_9_])) >> 14));
                        int i_11_ = (-Class90.regionTileY + (0x3fff & (r_Sub2.aClass252_10488.anIntArray3238[i_9_])));
                        int i_12_ = -(i_4_ / 128) + 2 + 4 * i_10_;
                        int i_13_ = 2 + (4 * i_11_ - i_3_ / 128);
                        Class318_Sub1.method2385(class46, i_1_, var_aa, (r_Sub2.aClass252_10488.anIntArray3239[i_9_]), i_12_, i, (byte) -94, i_13_, var_ha);
                    }
                    for (int i_14_ = 0; (Class348_Sub40_Sub38.anInt9479 > i_14_); i_14_++) {
                        int i_15_ = (Class348_Sub15.anIntArray6770[i_14_] * 4 - -2 - i_4_ / 128);
                        int i_16_ = (-(i_3_ / 128) + Class348_Sub40_Sub37.anIntArray9458[i_14_] * 4 - -2);
                        Class51 class51 = (Class348_Sub40_Sub12.aClass263_9195.method2005(0, Class263.anIntArray3347[i_14_]));
                        if (class51.anIntArray945 != null) {
                            class51 = class51.method480((Class318_Sub1_Sub3_Sub3.aClass170_10209), (byte) 47);
                            if (class51 == null || (class51.anInt921 == -1)) continue;
                        }
                        Class318_Sub1.method2385(class46, i_1_, var_aa, class51.anInt921, i_15_, i, (byte) -113, i_16_, var_ha);
                    }
                    for (Class348_Sub37 class348_sub37 = (Class348_Sub37) Class130.aClass356_1895.method3484(i_2_ ^ 0x59b0); class348_sub37 != null; class348_sub37 = ((Class348_Sub37) Class130.aClass356_1895.method3482(0))) {
                        int i_17_ = (int) (0x3L & (class348_sub37.aLong4291) >> 28);
                        if (Class334.anInt4155 == i_17_) {
                            int i_18_ = (-za_Sub2.regionTileX + (int) ((class348_sub37.aLong4291) & 0x3fffL));
                            int i_19_ = (-Class90.regionTileY + (int) ((class348_sub37.aLong4291) >> 14 & 0x3fffL));
                            int i_20_ = -(i_4_ / 128) + (2 + i_18_ * 4);
                            int i_21_ = -(i_3_ / 128) + (2 + i_19_ * 4);
                            Class151.method1211(i_1_, (Class348_Sub12.aClass105Array6742[0]), i, class46, var_aa, i_21_, i_2_ ^ 0x59b2, i_20_);
                        }
                    }
                    for (int i_22_ = 0; (i_22_ < Class150.anInt2057); i_22_++) {
                        Class348_Sub22 class348_sub22 = ((Class348_Sub22) (Class282.aClass356_3654.method3480(Class74.anIntArray1233[i_22_], -6008)));
                        if (class348_sub22 != null) {
                            Npc npc = (class348_sub22.aNpc_6859);
                            if (npc.method2445((byte) -126) && ((npc.plane) == (Class132.aPlayer_1907.plane))) {
                                Class79 class79 = (npc.aClass79_10505);
                                if (class79 != null && (class79.anIntArray1377 != null)) class79 = (class79.method794((Class318_Sub1_Sub3_Sub3.aClass170_10209), -1));
                                if (class79 != null && class79.aBoolean1397 && class79.aBoolean1396) {
                                    int i_23_ = (-(i_4_ / 128) + (npc.x) / 128);
                                    int i_24_ = ((npc.y) / 128 + -(i_3_ / 128));
                                    if (class79.anInt1383 != -1) Class318_Sub1.method2385(class46, i_1_, var_aa, class79.anInt1383, i_23_, i, (byte) -73, i_24_, var_ha);
                                    else Class151.method1211(i_1_, (Class348_Sub12.aClass105Array6742[1]), i, class46, var_aa, i_24_, 2, i_23_);
                                }
                            }
                        }
                    }
                    int i_25_ = Class328_Sub1.anInt6513;
                    int[] is = Class286_Sub7.anIntArray6290;
                    for (int i_26_ = 0; i_26_ < i_25_; i_26_++) {
                        Player player = (Class294.aPlayerArray5058[is[i_26_]]);
                        if (player != null && player.method2457((byte) 37) && !player.aBoolean10551 && (Class132.aPlayer_1907 != player) && (player.plane == (Class132.aPlayer_1907.plane))) {
                            int i_27_ = (-(i_4_ / 128) + (player.x) / 128);
                            int i_28_ = (-(i_3_ / 128) + (player.y) / 128);
                            boolean bool = false;
                            for (int i_29_ = 0; (Class348_Sub40_Sub30.anInt9383 > i_29_); i_29_++) {
                                if ((player.username.equals(Class83.aStringArray1441[i_29_])) && (ha.anIntArray4578[i_29_] != 0)) {
                                    bool = true;
                                    break;
                                }
                            }
                            boolean bool_30_ = false;
                            for (int i_31_ = 0; Class37.anInt496 > i_31_; i_31_++) {
                                if (player.username.equals(Class169.aClass19Array2261[i_31_].aString306)) {
                                    bool_30_ = true;
                                    break;
                                }
                            }
                            boolean bool_32_ = false;
                            if ((Class132.aPlayer_1907.anInt10542) != 0 && (player.anInt10542 != 0) && (player.anInt10542 == (Class132.aPlayer_1907.anInt10542))) bool_32_ = true;
                            if (!player.aBoolean10554) {
                                if (!bool) {
                                    if (bool_30_) Class151.method1211(i_1_, (Class348_Sub12.aClass105Array6742[5]), i, class46, var_aa, i_28_, i_2_ + -22958, i_27_);
                                    else if (!bool_32_) Class151.method1211(i_1_, (Class348_Sub12.aClass105Array6742[2]), i, class46, var_aa, i_28_, 2, i_27_);
                                    else Class151.method1211(i_1_, (Class348_Sub12.aClass105Array6742[4]), i, class46, var_aa, i_28_, 2, i_27_);
                                } else Class151.method1211(i_1_, (Class348_Sub12.aClass105Array6742[3]), i, class46, var_aa, i_28_, 2, i_27_);
                            } else Class151.method1211(i_1_, (Class348_Sub12.aClass105Array6742[6]), i, class46, var_aa, i_28_, i_2_ + -22958, i_27_);
                        }
                    }
                    Class302[] class302s = Class348_Sub27.aClass302Array6897;
                    for (int i_33_ = 0; (i_33_ < class302s.length); i_33_++) {
                        Class302 class302 = class302s[i_33_];
                        if (class302 != null && (class302.anInt3840 != 0) && Class367_Sub11.anInt7396 % 20 < 10) {
                            if (class302.anInt3840 == 1) {
                                Class348_Sub22 class348_sub22 = ((Class348_Sub22) (Class282.aClass356_3654.method3480(class302.anInt3833, -6008)));
                                if (class348_sub22 != null) {
                                    Npc npc = (class348_sub22.aNpc_6859);
                                    int i_34_ = (-(i_4_ / 128) + (npc.x) / 128);
                                    int i_35_ = (-(i_3_ / 128) + (npc.y) / 128);
                                    Class287.method2181(360000L, i_1_, -125, i_35_, i, class46, i_34_, (class302.anInt3831), var_aa);
                                }
                            }
                            if (class302.anInt3840 == 2) {
                                int i_36_ = (-(i_4_ / 128) + (class302.anInt3835 / 128));
                                int i_37_ = (-(i_3_ / 128) + (class302.anInt3832 / 128));
                                long l = class302.anInt3837 << 7;
                                l *= l;
                                Class287.method2181(l, i_1_, -112, i_37_, i, class46, i_36_, (class302.anInt3831), var_aa);
                            }
                            if ((class302.anInt3840 == 10) && class302.anInt3833 >= 0 && (class302.anInt3833 < (Class294.aPlayerArray5058).length)) {
                                Player player = (Class294.aPlayerArray5058[class302.anInt3833]);
                                if (player != null) {
                                    int i_38_ = (-(i_4_ / 128) + (player.x) / 128);
                                    int i_39_ = (-(i_3_ / 128) + (player.y) / 128);
                                    Class287.method2181(360000L, i_1_, -121, i_39_, i, class46, i_38_, (class302.anInt3831), var_aa);
                                }
                            }
                        }
                    }
                    if (Class348_Sub40_Sub21.anInt9282 != 4) {
                        if (Class248.anInt3203 != 0) {
                            int i_40_ = (-(i_4_ / 128) + (Class248.anInt3203 * 4 + 2) - (-(2 * Class132.aPlayer_1907.method2436((byte) 77)) - -2));
                            int i_41_ = (4 * Class97.anInt1548 - (-2 + i_3_ / 128) + (2 * (Class132.aPlayer_1907.method2436((byte) 59) - 1)));
                            Class151.method1211(i_1_, (Class25.aClass105Array367[(!Class348_Sub13.aBoolean6759 ? 0 : 1)]), i, class46, var_aa, i_41_, 2, i_40_);
                        }
                        if (!Class132.aPlayer_1907.aBoolean10551) var_ha.method3675(3, (byte) -125, -1 + (i - -((class46.anInt709) / 2)), -1 + ((class46.anInt789) / 2 + i_1_), 3, -1);
                    }
                } else var_ha.A(-16777216, var_aa, i, i_1_);
            }
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("mn.F(" + (class46 != null ? "{...}" : "null") + ',' + (var_ha != null ? "{...}" : "null") + ',' + i + ',' + i_1_ + ',' + i_2_ + ')'));
        }
    }

    final Class348_Sub42 method1008(int i) {
        if (i != 20) aClass348_Sub42_1652 = null;
        anInt1653++;
        Class348_Sub42 class348_sub42 = (this.aClass348_Sub42_1647.aClass348_Sub42_7063);
        if (class348_sub42 == this.aClass348_Sub42_1647) return null;
        class348_sub42.method3162(true);
        return class348_sub42;
    }

    final void method1009(int i) {
        anInt1646++;
        if (i == 2110355138) {
            for (; ; ) {
                Class348_Sub42 class348_sub42 = (this.aClass348_Sub42_1647.aClass348_Sub42_7063);
                if (this.aClass348_Sub42_1647 == class348_sub42) break;
                class348_sub42.method3162(true);
            }
            aClass348_Sub42_1652 = null;
        }
    }

    static final void method1010(boolean bool, boolean bool_42_) {
        r.aClass101_9720.method898(Class21.aHa326.method3640());
        anInt1642++;
        int[] is = Class21.aHa326.Y();
        Class14_Sub3.anInt8630 = is[2];
        Class248.anInt3202 = is[0];
        Class27.anInt394 = is[3];
        Class239_Sub5.anInt5886 = is[1];
        if (bool_42_) {
            Class21.aHa326.DA(Class94.anInt1537, Class318_Sub5.anInt6417, Class193.anInt2590, Class129.anInt1879);
            r.method3284(true, Class318_Sub1_Sub5_Sub1.aDouble10120);
        } else {
            Class21.aHa326.DA(Class120.anInt4910, Class328_Sub1_Sub1.anInt8799, Class286_Sub5.anInt6255, OutputStream_Sub1.anInt95);
            r.method3284(true, Class14_Sub2.aDouble8621);
        }
        if (bool != false) method1010(true, true);
    }

    final Class348_Sub42 method1011(int i) {
        if (i > -23) method1006(false, (byte) -34);
        anInt1649++;
        Class348_Sub42 class348_sub42 = (this.aClass348_Sub42_1647.aClass348_Sub42_7063);
        if (class348_sub42 == this.aClass348_Sub42_1647) {
            aClass348_Sub42_1652 = null;
            return null;
        }
        aClass348_Sub42_1652 = class348_sub42.aClass348_Sub42_7063;
        return class348_sub42;
    }

    public Class107() {
        this.aClass348_Sub42_1647.aClass348_Sub42_7060 = this.aClass348_Sub42_1647;
        this.aClass348_Sub42_1647.aClass348_Sub42_7063 = this.aClass348_Sub42_1647;
    }
}
