/* Class367_Sub8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class367_Sub8 extends Class367 {
    static int anInt7349;
    private float aFloat7350 = 0.0F;
    static int anInt7351;
    static int anInt7352;
    private final Class269 aClass269_7353;
    static int anInt7354;
    static short aShort7355 = 1;
    static int anInt7356;
    static int anInt7357;
    static int anInt7358;
    static int anInt7359;
    static int anInt7360;
    static Class364 aClass364_7361 = new Class364("WTRC", 1);
    static Class45 aClass45_7362;
    static Class114 aClass114_7363;
    static int anInt7364;
    static int anInt7365 = 0;

    static final String method3546(byte[] is, int i, int i_0_, int i_1_) {
        anInt7349++;
        char[] cs = new char[i_0_];
        int i_2_ = 0;
        for (int i_3_ = i; i_3_ < i_0_; i_3_++) {
            int i_4_ = 0xff & is[i_3_ + i_1_];
            if (i_4_ != 0) {
                if (i_4_ >= 128 && i_4_ < 160) {
                    int i_5_ = Class44.aCharArray625[i_4_ - 128];
                    if (i_5_ == 0)
                        i_5_ = 63;
                    i_4_ = i_5_;
                }
                cs[i_2_++] = (char) i_4_;
            }
        }
        return new String(cs, 0, i_2_);
    }

    static final int method3547(int i, int i_6_) {
        if (Class342.anIntArrayArray4253 != null)
            return Class342.anIntArrayArray4253[i][i_6_] & 0xffffff;
        return 0;
    }

    static final void method3548
            (int i, Class318_Sub1_Sub3_Sub3_Sub1 class318_sub1_sub3_sub3_sub1,
             int[] is, int[] is_7_, int[] is_8_) {
        try {
            if (i != -7387)
                method3550((byte) 10);
            for (int i_9_ = 0; is_7_.length > i_9_; i_9_++) {
                int i_10_ = is_7_[i_9_];
                int i_11_ = is[i_9_];
                int i_12_ = is_8_[i_9_];
                for (int i_13_ = 0;
                     i_11_ != 0 && ((class318_sub1_sub3_sub3_sub1
                             .aClass182Array10308).length > i_13_);
                     i_13_++) {
                    if ((0x1 & i_11_) != 0) {
                        if (i_10_ != -1) {
                            Class17 class17
                                    = Class10.aClass87_191.method835(i_10_,
                                    i + 7394);
                            int i_14_ = class17.anInt248;
                            Class182 class182 = (class318_sub1_sub3_sub3_sub1
                                    .aClass182Array10308[i_13_]);
                            if (class182 != null) {
                                if (i_10_ != class182.anInt2454) {
                                    if (Class10.aClass87_191.method835
                                            (class182.anInt2454,
                                                    7).anInt239 <= class17.anInt239)
                                        class182
                                                = class318_sub1_sub3_sub3_sub1
                                                .aClass182Array10308[i_13_]
                                                = null;
                                } else if (i_14_ == 0)
                                    class182
                                            = class318_sub1_sub3_sub3_sub1
                                            .aClass182Array10308[i_13_]
                                            = null;
                                else if (i_14_ != 1) {
                                    if (i_14_ == 2)
                                        class182.anInt2445 = 0;
                                } else {
                                    class182.anInt2448 = i_12_;
                                    class182.anInt2456 = 0;
                                    class182.anInt2455 = 1;
                                    class182.anInt2451 = 0;
                                    class182.anInt2445 = 0;
                                    if (!class318_sub1_sub3_sub3_sub1
                                            .aBoolean10309)
                                        Class287.method2178
                                                (class318_sub1_sub3_sub3_sub1, 0,
                                                        class17, -75);
                                }
                            }
                            if (class182 == null) {
                                class182
                                        = class318_sub1_sub3_sub3_sub1
                                        .aClass182Array10308[i_13_]
                                        = new Class182();
                                class182.anInt2455 = 1;
                                class182.anInt2454 = i_10_;
                                class182.anInt2456 = 0;
                                class182.anInt2445 = 0;
                                class182.anInt2451 = 0;
                                class182.anInt2448 = i_12_;
                                if (!class318_sub1_sub3_sub3_sub1
                                        .aBoolean10309)
                                    Class287.method2178
                                            (class318_sub1_sub3_sub3_sub1, 0,
                                                    class17, -19);
                            }
                        } else
                            class318_sub1_sub3_sub3_sub1
                                    .aClass182Array10308[i_13_]
                                    = null;
                    }
                    i_11_ >>>= 1;
                }
            }
            anInt7359++;
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929
                    (runtimeexception,
                            ("kl.E(" + i + ','
                                    + (class318_sub1_sub3_sub3_sub1 != null ? "{...}"
                                    : "null")
                                    + ',' + (is != null ? "{...}" : "null") + ','
                                    + (is_7_ != null ? "{...}" : "null") + ','
                                    + (is_8_ != null ? "{...}" : "null") + ')'));
        }
    }

    final void method3520(byte i) {
        this.aHa_Sub3_4479.method3897(1, -4382);
        if (i != 87)
            method3549(-29, (byte) -5);
        anInt7364++;
        this.aHa_Sub3_4479
                .method3874(Class167.aClass229_2207, 120, Class167.aClass229_2207);
        this.aHa_Sub3_4479.method3849((byte) 47, 0,
                Class342.aClass70_4247);
        this.aHa_Sub3_4479.method3885(0, true,
                Class342.aClass70_4247);
        this.aHa_Sub3_4479.method3910((byte) -26, 1);
        this.aHa_Sub3_4479.method3850((byte) 86, null);
        this.aHa_Sub3_4479.method3897(0, -4382);
        this.aHa_Sub3_4479.method3885(0, true,
                Class342.aClass70_4247);
    }

    Class367_Sub8(ha_Sub3 var_ha_Sub3, Class269 class269) {
        super(var_ha_Sub3);
        try {
            aClass269_7353 = class269;
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception,
                    ("kl.<init>("
                            + (var_ha_Sub3 != null ? "{...}"
                            : "null")
                            + ','
                            + (class269 != null ? "{...}"
                            : "null")
                            + ')'));
        }
    }

    static final boolean method3549(int i, byte i_15_) {
        anInt7351++;
        int i_16_ = -72 / ((37 - i_15_) / 48);
        if (i == 25 || i == 20 || i == 44 || i == 46
                || i == 60)
            return true;
        return i == 30 || i == 1008;
    }

    final void method3526(int i, int i_17_, int i_18_) {
        this.aHa_Sub3_4479.method3897(1, -4382);
        anInt7354++;
        if (i != 10756)
            method3527(-26, null, 111);
        if ((0x80 & i_17_) == 0) {
            if ((0x1 & i_18_) != 1) {
                if (aClass269_7353.aBoolean3458)
                    this.aHa_Sub3_4479.method3850
                            ((byte) 108,
                                    aClass269_7353.anInterface18_Impl1_3452);
                else
                    this.aHa_Sub3_4479.method3850
                            ((byte) 126, (aClass269_7353
                                    .anInterface18_Impl3Array3459[0]));
            } else if (aClass269_7353.aBoolean3458) {
                aFloat7350
                        = (float) ((this.aHa_Sub3_4479
                        .anInt8146)
                        % 4000) / 4000.0F;
                this.aHa_Sub3_4479.method3850
                        ((byte) -112,
                                aClass269_7353.anInterface18_Impl1_3452);
            } else {
                int i_19_
                        = (16
                        * (this.aHa_Sub3_4479.anInt8146
                        % 4000)
                        / 4000);
                this.aHa_Sub3_4479.method3850
                        ((byte) -114, (aClass269_7353
                                .anInterface18_Impl3Array3459[i_19_]));
            }
        } else
            this.aHa_Sub3_4479.method3850((byte) 85, null);
        this.aHa_Sub3_4479.method3897(0, -4382);
    }

    final boolean method3530(int i) {
        if (i > -57)
            return false;
        anInt7360++;
        return aClass269_7353.method2039(116);
    }

    public static void method3550(byte i) {
        aClass114_7363 = null;
        aClass45_7362 = null;
        int i_20_ = -90 % ((-54 - i) / 60);
        aClass364_7361 = null;
    }

    final void method3532(int i) {
        if (this.aHa_Sub3_4479.method3877((byte) -126) == 0) {
            Class101_Sub2 class101_sub2
                    = this.aHa_Sub3_4479.method3848(5);
            this.aHa_Sub3_4479.method3897(1, i ^ ~0x39a4);
            Class101_Sub2 class101_sub2_21_
                    = this.aHa_Sub3_4479.method3820(false);
            class101_sub2_21_.method898(class101_sub2);
            class101_sub2_21_.method914(0.125F, 1.0F, 0, 0.125F);
            class101_sub2_21_.method920(0.0F, false, aFloat7350, 0.0F);
            this.aHa_Sub3_4479
                    .method3853(-32, Class348_Sub40_Sub38.aClass251_9477);
            this.aHa_Sub3_4479.method3897(0, -4382);
        }
        anInt7352++;
        if (i != 10425)
            method3530(16);
    }

    final void method3521(boolean bool, byte i) {
        if (i != -103)
            anInt7365 = 86;
        this.aHa_Sub3_4479.method3874((Class328_Sub3
                        .aClass229_6519),
                i ^ ~0x17,
                Class167.aClass229_2207);
        anInt7357++;
    }

    final void method3525(int i, boolean bool) {
        anInt7356++;
        this.aHa_Sub3_4479.method3897(1, i ^ ~0x2a45);
        this.aHa_Sub3_4479.method3874((Class328_Sub3
                        .aClass229_6519),
                111,
                (Class348_Sub23_Sub2
                        .aClass229_9011));
        this.aHa_Sub3_4479
                .method3924(true, false, 0, Class342.aClass70_4247, false);
        this.aHa_Sub3_4479
                .method3885(0, true, Class318_Sub1_Sub2.aClass70_8737);
        this.aHa_Sub3_4479.method3910((byte) -26, 0);
        this.aHa_Sub3_4479.method3897(0, -4382);
        this.aHa_Sub3_4479.method3894(-28186, -16777216);
        this.aHa_Sub3_4479
                .method3885(0, true, Class348_Sub40_Sub39.aClass70_9485);
        method3532(10425);
        if (i != 15192)
            aShort7355 = (short) 106;
    }

    final void method3527(int i, Interface18 interface18, int i_22_) {
        this.aHa_Sub3_4479.method3850((byte) 103, interface18);
        anInt7358++;
        if (i_22_ != -16776)
            method3520((byte) -127);
    }

    static {
        aClass114_7363 = new Class114(103, 8);
    }
}
