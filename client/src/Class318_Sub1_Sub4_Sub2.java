/* Class318_Sub1_Sub4_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class318_Sub1_Sub4_Sub2 extends Class318_Sub1_Sub4
        implements Interface10 {
    private boolean aBoolean10095 = false;
    static int anInt10096 = 0;
    static int anInt10097;
    static int anInt10098;
    static int anInt10099;
    static int anInt10100;
    static int anInt10101;
    static int anInt10102;
    static int anInt10103;
    static int anInt10104;
    static int anInt10105;
    static int anInt10106;
    static int anInt10107;
    static int anInt10108;
    static int anInt10109;
    static int anInt10110;
    static int anInt10111;
    static int anInt10112;
    static int anInt10113;
    private boolean aBoolean10114;
    Class235 aClass235_10115;
    private Class30 aClass30_10116;
    static int anInt10117;

    public final int method39(int i) {
        anInt10105++;
        int i_0_ = -66 / ((-91 - i) / 35);
        return (this.aClass235_10115
                .anInt3079);
    }

    public final void method44(int i, ha var_ha) {
        this.aClass235_10115.method1667((byte) 116,
                var_ha);
        if (i != 836)
            method2379(42);
        anInt10099++;
    }

    final void method2387(ha var_ha, int i) {
        anInt10113++;
        if (i >= -125)
            method2386(111, null);
        Class64 class64 = this.aClass235_10115
                .method1668(true, true, -128, 262144, var_ha);
        if (class64 != null) {
            int i_1_ = this.anInt6377 >> -4724599;
            int i_2_ = this.anInt6388 >> 1294324713;
            Class101 class101 = var_ha.method3705();
            class101.method894(this.anInt6377,
                    this.anInt6382,
                    this.anInt6388);
            this.aClass235_10115.method1670
                    (i_1_, class101, i_2_, var_ha, i_1_, class64, false,
                            (byte) -73, i_2_);
        }
    }

    final int method2394(boolean bool) {
        if (bool != true)
            method2381(null, -82);
        anInt10107++;
        return this.aClass235_10115
                .method1663(109);
    }

    final boolean method2391(ha var_ha, int i, int i_3_, int i_4_) {
        anInt10101++;
        Class64 class64 = this.aClass235_10115
                .method1668(false, false, -127, 131072, var_ha);
        if (class64 == null)
            return false;
        Class101 class101 = var_ha.method3705();
        class101.method894(this.anInt6377,
                this.anInt6382,
                this.anInt6388);
        if (i_4_ != 0)
            return true;
        if (Class305.aBoolean3870)
            return class64.method623(i_3_, i, class101, false, 0,
                    Class132.anInt1906);
        return class64.method628(i_3_, i, class101, false, 0);
    }

    final boolean method2376(int i) {
        if (i > -12)
            method2394(true);
        anInt10108++;
        return false;
    }

    Class318_Sub1_Sub4_Sub2(ha var_ha, Class51 class51, int i, int i_5_,
                            int i_6_, int i_7_, int i_8_, boolean bool,
                            int i_9_, int i_10_, int i_11_) {
        super(i_6_, i_7_, i_8_, i, i_5_,
                Class95.method868(i_9_, i_10_, false));
        try {
            this.aClass235_10115
                    = new Class235(var_ha, class51, i_9_, i_10_,
                    this.aByte6381, i_5_, this,
                    bool, i_11_);
            aBoolean10114 = class51.anInt874 != 0 && !bool;
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception,
                    ("ju.<init>("
                            + (var_ha != null ? "{...}"
                            : "null")
                            + ','
                            + (class51 != null ? "{...}"
                            : "null")
                            + ',' + i + ',' + i_5_ + ','
                            + i_6_ + ',' + i_7_ + ',' + i_8_
                            + ',' + bool + ',' + i_9_ + ','
                            + i_10_ + ',' + i_11_ + ')'));
        }
    }

    final int method2379(int i) {
        anInt10097++;
        if (i != -25675)
            aBoolean10114 = false;
        return this.aClass235_10115
                .method1664(-71);
    }

    public final boolean method38(int i) {
        anInt10117++;
        if (i != -18443)
            aBoolean10095 = true;
        return this.aClass235_10115.method1665(2);
    }

    public final int method42(int i) {
        if (i > -62)
            aClass30_10116 = null;
        anInt10098++;
        return (this.aClass235_10115
                .anInt3063);
    }

    public final void method43(ha var_ha, int i) {
        anInt10110++;
        this.aClass235_10115.method1674(-1,
                var_ha);
        if (i != -14218)
            aBoolean10114 = true;
    }

    final Class318_Sub4 method2386(int i, ha var_ha) {
        anInt10111++;
        Class64 class64
                = this.aClass235_10115
                .method1668(false, true, i ^ ~0x7f, 2048, var_ha);
        if (class64 == null)
            return null;
        Class101 class101 = var_ha.method3705();
        class101.method894(this.anInt6377,
                this.anInt6382,
                this.anInt6388);
        Class318_Sub4 class318_sub4
                = OutputStream_Sub2.method136(i, aBoolean10114, false);
        int i_12_ = this.anInt6377 >> -2076119959;
        int i_13_ = this.anInt6388 >> -2035686871;
        this.aClass235_10115.method1670
                (i_12_, class101, i_13_, var_ha, i_12_, class64, true, (byte) -73,
                        i_13_);
        if (!Class305.aBoolean3870)
            class64.method615(class101, (class318_sub4
                    .aClass318_Sub3Array6414[0]), 0);
        else
            class64.method608(class101,
                    (class318_sub4
                            .aClass318_Sub3Array6414[0]),
                    Class132.anInt1906, 0);
        if ((this.aClass235_10115
                .aClass318_Sub10_3081)
                != null) {
            Class98 class98
                    = this.aClass235_10115
                    .aClass318_Sub10_3081.method2525();
            if (Class305.aBoolean3870)
                var_ha.method3685(class98, Class132.anInt1906);
            else
                var_ha.method3684(class98);
        }
        aBoolean10095
                = class64.F() || (this
                .aClass235_10115
                .aClass318_Sub10_3081) != null;
        if (aClass30_10116 != null)
            Class255.method1935(this.anInt6388,
                    this.anInt6382,
                    aClass30_10116, class64, false,
                    this.anInt6377);
        else
            aClass30_10116 = (Class348_Sub23_Sub1.method2967
                    (this.anInt6377, class64,
                            this.anInt6388,
                            this.anInt6382, 2));
        return class318_sub4;
    }

    final Class30 method2381(ha var_ha, int i) {
        anInt10109++;
        if (i != 7)
            return null;
        return aClass30_10116;
    }

    public final int method41(int i) {
        anInt10100++;
        if (i != -32228)
            this.aClass235_10115 = null;
        return (this.aClass235_10115
                .anInt3052);
    }

    public final void method40(int i) {
        if (i != -12031)
            aBoolean10114 = false;
        anInt10102++;
    }

    final boolean method2388(int i) {
        if (i >= -65)
            return true;
        anInt10106++;
        return false;
    }

    final void method2392(boolean bool) {
        anInt10103++;
        if (bool != true)
            aBoolean10114 = false;
        throw new IllegalStateException();
    }

    final boolean method2377(byte i) {
        if (i != 122)
            return false;
        anInt10104++;
        return aBoolean10095;
    }

    final void method2380(ha var_ha, int i, boolean bool,
                          Class318_Sub1 class318_sub1, int i_14_, byte i_15_,
                          int i_16_) {
        try {
            anInt10112++;
            if (i_15_ < -106)
                throw new IllegalStateException();
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception,
                    ("ju.N("
                            + (var_ha != null ? "{...}"
                            : "null")
                            + ',' + i + ',' + bool + ','
                            + (class318_sub1 != null ? "{...}"
                            : "null")
                            + ',' + i_14_ + ',' + i_15_ + ','
                            + i_16_ + ')'));
        }
    }
}
