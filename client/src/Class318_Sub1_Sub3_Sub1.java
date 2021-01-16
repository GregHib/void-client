/* Class318_Sub1_Sub3_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class318_Sub1_Sub3_Sub1 extends Class318_Sub1_Sub3
        implements Interface10 {
    private final boolean aBoolean10003;
    static int anInt10004;
    static int anInt10005;
    static int anInt10006;
    static int anInt10007;
    static int anInt10008;
    static int anInt10009;
    static Class348_Sub42_Sub17[] aClass348_Sub42_Sub17Array10010
            = new Class348_Sub42_Sub17[14];
    static int anInt10011;
    static int anInt10012;
    static int anInt10013;
    private final boolean aBoolean10014;
    private byte aByte10015;
    static int anInt10016;
    private final boolean aBoolean10017;
    static int anInt10018;
    private boolean aBoolean10019;
    static int anInt10020;
    static int anInt10021;
    static int anInt10022;
    static int anInt10023 = -60;
    private final byte aByte10024;
    private Class30 aClass30_10025;
    static int anInt10026;
    static int anInt10027;
    Class64 aClass64_10028;
    static int anInt10029;
    static int anInt10030;
    static int anInt10031;
    private short aShort10032;
    static int anInt10033;
    static int anInt10034;
    static int anInt10035;
    private r aR10036;
    static int anInt10037;

    public final void method40(int i) {
        if (i == -12031) {
            if (this.aClass64_10028 != null)
                this.aClass64_10028.method612();
            anInt10022++;
        }
    }

    final int method2394(boolean bool) {
        if (bool != true)
            return 109;
        anInt10006++;
        if (this.aClass64_10028 == null)
            return 0;
        return this.aClass64_10028.fa();
    }

    public final void method44(int i, ha var_ha) {
        anInt10008++;
        Object object = null;
        r var_r;
        if (aR10036 != null || !aBoolean10003) {
            var_r = aR10036;
            aR10036 = null;
        } else {
            Class2 class2 = method2417(0, var_ha, 262144, true);
            var_r = class2 != null ? class2.aR118 : null;
        }
        if (i != 836)
            method41(-125);
        if (var_r != null)
            Class130.method1130(var_r, this.aByte6376,
                    this.anInt6377,
                    this.anInt6388, null);
    }

    Class318_Sub1_Sub3_Sub1(ha var_ha, Class51 class51, int i, int i_0_,
                            int i_1_, int i_2_, int i_3_, boolean bool,
                            int i_4_, int i_5_, int i_6_, int i_7_, int i_8_,
                            int i_9_, boolean bool_10_) {
        super(i, i_0_, i_1_, i_2_, i_3_, i_4_, i_5_, i_6_, i_7_,
                class51.anInt895 == 1,
                Class348_Sub9.method2782(i_9_, i_8_, 0));
        do {
            try {
                aShort10032 = (short) class51.anInt941;
                aByte10015 = (byte) i_9_;
                aByte10024 = (byte) i_8_;
                aBoolean10014 = class51.anInt874 != 0 && !bool;
                aBoolean10017 = bool;
                aBoolean10019 = bool_10_;
                this.aByte6376 = (byte) i_0_;
                aBoolean10003
                        = (var_ha.method3682() && class51.aBoolean894
                        && !aBoolean10017
                        && Class316.aClass348_Sub51_3959
                        .aClass239_Sub7_7238.method1748(-32350) != 0);
                int i_11_ = 2048;
                if (aBoolean10019)
                    i_11_ |= 0x10000;
                Class2 class2 = method2417(0, var_ha, i_11_, aBoolean10003);
                if (class2 == null)
                    break;
                this.aClass64_10028
                        = class2.aClass64_119;
                aR10036 = class2.aR118;
                if (!aBoolean10019)
                    break;
                this.aClass64_10028
                        = this.aClass64_10028
                        .method614((byte) 0, i_11_, false);
            } catch (RuntimeException runtimeexception) {
                throw Class348_Sub17.method2929
                        (runtimeexception,
                                ("dm.<init>(" + (var_ha != null ? "{...}" : "null")
                                        + ',' + (class51 != null ? "{...}" : "null") + ','
                                        + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ','
                                        + i_3_ + ',' + bool + ',' + i_4_ + ',' + i_5_ + ','
                                        + i_6_ + ',' + i_7_ + ',' + i_8_ + ',' + i_9_ + ','
                                        + bool_10_ + ')'));
            }
            break;
        } while (false);
    }

    final int method2379(int i) {
        if (i != -25675)
            method2418(null, (byte) -68);
        anInt10027++;
        if (this.aClass64_10028 != null)
            return this.aClass64_10028.ma();
        return 0;
    }

    public final boolean method38(int i) {
        if (i != -18443)
            return false;
        anInt10037++;
        return aBoolean10003;
    }

    final boolean method2391(ha var_ha, int i, int i_12_, int i_13_) {
        anInt10005++;
        if (i_13_ != 0)
            return false;
        Class64 class64 = method2414(-1, var_ha, 131072);
        if (class64 != null) {
            Class101 class101 = var_ha.method3705();
            class101.method894(this.anInt6377,
                    this.anInt6382,
                    this.anInt6388);
            if (Class305.aBoolean3870)
                return class64.method623(i_12_, i, class101, false, 0,
                        Class132.anInt1906);
            return class64.method628(i_12_, i, class101, false, 0);
        }
        return false;
    }

    private final Class64 method2414(int i, ha var_ha, int i_14_) {
        if (i != -1)
            method2392(false);
        anInt10004++;
        if (this.aClass64_10028 != null
                && var_ha.method3667(this
                        .aClass64_10028.ua(),
                i_14_) == 0)
            return this.aClass64_10028;
        Class2 class2 = method2417(0, var_ha, i_14_, false);
        if (class2 == null)
            return null;
        return class2.aClass64_119;
    }

    final void method2387(ha var_ha, int i) {
        anInt10033++;
        if (i > -125)
            aShort10032 = (short) -95;
    }

    public static void method2415(int i) {
        aClass348_Sub42_Sub17Array10010 = null;
        int i_15_ = 93 / ((i - -62) / 35);
    }

    final int method2416(int i) {
        if (i != 15)
            aByte10015 = (byte) 66;
        anInt10009++;
        if (this.aClass64_10028 != null)
            return this.aClass64_10028.na() / 4;
        return 15;
    }

    final boolean method2388(int i) {
        anInt10035++;
        if (i > -65)
            return true;
        return aBoolean10019;
    }

    public final int method41(int i) {
        if (i != -32228)
            this.aClass64_10028 = null;
        anInt10030++;
        return aByte10015;
    }

    final void method2380(ha var_ha, int i, boolean bool,
                          Class318_Sub1 class318_sub1, int i_16_, byte i_17_,
                          int i_18_) {
        do {
            try {
                anInt10034++;
                if (class318_sub1 instanceof Class318_Sub1_Sub4_Sub1) {
                    Class318_Sub1_Sub4_Sub1 class318_sub1_sub4_sub1
                            = (Class318_Sub1_Sub4_Sub1) class318_sub1;
                    if (this.aClass64_10028 != null
                            && (class318_sub1_sub4_sub1
                            .aClass64_10071) != null)
                        this.aClass64_10028
                                .method613
                                        (class318_sub1_sub4_sub1.aClass64_10071,
                                                i_18_, i, i_16_, bool);
                } else if (class318_sub1 instanceof Class318_Sub1_Sub3_Sub1) {
                    Class318_Sub1_Sub3_Sub1 class318_sub1_sub3_sub1_19_
                            = (Class318_Sub1_Sub3_Sub1) class318_sub1;
                    if (this.aClass64_10028 != null
                            && (class318_sub1_sub3_sub1_19_.aClass64_10028
                            != null))
                        this.aClass64_10028
                                .method613
                                        (class318_sub1_sub3_sub1_19_.aClass64_10028,
                                                i_18_, i, i_16_, bool);
                }
                if (i_17_ < -106)
                    break;
                method2392(false);
            } catch (RuntimeException runtimeexception) {
                throw Class348_Sub17.method2929(runtimeexception,
                        ("dm.N("
                                + (var_ha != null ? "{...}"
                                : "null")
                                + ',' + i + ',' + bool + ','
                                + (class318_sub1 != null
                                ? "{...}" : "null")
                                + ',' + i_16_ + ',' + i_17_
                                + ',' + i_18_ + ')'));
            }
            break;
        } while (false);
    }

    public final int method42(int i) {
        if (i > -62)
            return 126;
        anInt10012++;
        return aShort10032 & 0xffff;
    }

    final void method2392(boolean bool) {
        anInt10020++;
        if (bool != true)
            method38(120);
        aBoolean10019 = false;
        if (this.aClass64_10028 != null)
            this.aClass64_10028.s
                    (~0x10000
                            & this.aClass64_10028.ua());
    }

    final Class30 method2381(ha var_ha, int i) {
        if (aClass30_10025 == null)
            aClass30_10025 = (Class348_Sub23_Sub1.method2967
                    (this.anInt6377,
                            method2414(i + -8, var_ha, 0),
                            this.anInt6388,
                            this.anInt6382, 2));
        if (i != 7)
            return null;
        anInt10013++;
        return aClass30_10025;
    }

    private final Class2 method2417(int i, ha var_ha, int i_20_,
                                    boolean bool) {
        anInt10007++;
        Class51 class51 = Class348_Sub40_Sub12.aClass263_9195
                .method2005(i, 0xffff & aShort10032);
        s var_s;
        s var_s_21_;
        if (aBoolean10017) {
            var_s = Class332.aSArray4142[this.aByte6376];
            var_s_21_ = Class348_Sub1_Sub1.aSArray8801[0];
        } else {
            var_s = (Class348_Sub1_Sub1.aSArray8801
                    [this.aByte6376]);
            if (this.aByte6376 >= 3)
                var_s_21_ = null;
            else
                var_s_21_ = (Class348_Sub1_Sub1.aSArray8801
                        [this.aByte6376 - -1]);
        }
        return class51.method476(var_ha, var_s_21_,
                (aByte10024 != 11 ? aByte10024
                        : 10),
                i_20_, this.anInt6377, bool,
                var_s, this.anInt6382,
                this.anInt6388,
                (aByte10024 != 11 ? (int) aByte10015
                        : aByte10015 + 4),
                128);
    }

    final boolean method2376(int i) {
        if (i > -12)
            return false;
        anInt10029++;
        if (this.aClass64_10028 != null) {
            return !this.aClass64_10028.r();
        }
        return true;
    }

    final boolean method2377(byte i) {
        if (i != 122)
            method2381(null, -44);
        anInt10021++;
        if (this.aClass64_10028 != null)
            return this.aClass64_10028.F();
        return false;
    }

    public final void method43(ha var_ha, int i) {
        if (i != -14218)
            aBoolean10019 = false;
        anInt10016++;
        Object object = null;
        r var_r;
        if (aR10036 == null && aBoolean10003) {
            Class2 class2 = method2417(i + 14218, var_ha, 262144, true);
            var_r = class2 != null ? class2.aR118 : null;
        } else {
            var_r = aR10036;
            aR10036 = null;
        }
        if (var_r != null)
            Class169.method1301(var_r, this.aByte6376,
                    this.anInt6377,
                    this.anInt6388, null);
    }

    static final int method2418(String string, byte i) {
        anInt10011++;
        int i_22_ = -51 / ((i - 3) / 42);
        int i_23_ = string.length();
        int i_24_ = 0;
        for (int i_25_ = 0; i_23_ > i_25_; i_25_++)
            i_24_ = string.charAt(i_25_) + ((i_24_ << 873766853) + -i_24_);
        return i_24_;
    }

    static final int method2419(byte i, int i_26_) {
        anInt10018++;
        if (i < 122)
            return -49;
        return i_26_ >>> -1834667160;
    }

    public final int method39(int i) {
        int i_27_ = -116 / ((-91 - i) / 35);
        anInt10026++;
        return aByte10024;
    }

    final Class318_Sub4 method2386(int i, ha var_ha) {
        anInt10031++;
        if (this.aClass64_10028 == null)
            return null;
        Class101 class101 = var_ha.method3705();
        class101.method894(this.anInt6377,
                this.anInt6382,
                this.anInt6388);
        Class318_Sub4 class318_sub4
                = OutputStream_Sub2.method136(i, aBoolean10014, false);
        if (!Class305.aBoolean3870)
            this.aClass64_10028.method615
                    (class101,
                            class318_sub4.aClass318_Sub3Array6414[0],
                            0);
        else
            this.aClass64_10028.method608
                    (class101,
                            class318_sub4.aClass318_Sub3Array6414[0],
                            Class132.anInt1906, 0);
        return class318_sub4;
    }
}
