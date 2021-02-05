/* Class318_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class318_Sub1 extends Class318 {
    byte aByte6376;
    int x;
    static int anInt6378;
    Class318_Sub1 aClass318_Sub1_6379;
    int anInt6380;
    byte plane;
    int anInt6382;
    static Class114 aClass114_6383 = new Class114(11, 6);
    static int anInt6384;
    static int anInt6385;
    int anInt6386;
    boolean aBoolean6387;
    int y;
    int anInt6389;
    static int anInt6390;
    boolean aBoolean6391 = false;
    static int anInt6392;

    abstract boolean method2376(int i);

    abstract boolean method2377(byte i);

    abstract boolean method2378(int i);

    abstract int method2379(int i);

    abstract void method2380(ha var_ha, int i, boolean bool, Class318_Sub1 class318_sub1_0_, int i_1_, byte i_2_, int i_3_);

    abstract Class30 method2381(ha var_ha, int i);

    abstract boolean method2382(byte i);

    static final void method2383(ha var_ha, int i, Class46 class46) {
        do {
            try {
                if (i != -2) method2383(null, -63, null);
                anInt6385++;
                boolean bool = ((Exception_Sub1.aClass255_112.method1941(class46.anInt672, (byte) -74, class46.anInt812, class46.anInt781, ~0xffffff | class46.anInt809, class46.anInt678, var_ha, (!class46.aBoolean720 ? null : (Class132.aPlayer_1907.aClass154_10536)))) == null);
                if (!bool) break;
                Class5_Sub1_Sub1.aClass262_9931.method1999(new Class348_Sub7(class46.anInt812, class46.anInt781, class46.anInt672, (~0xffffff | class46.anInt809), class46.anInt678, class46.aBoolean720), i ^ 0x4ed2);
                Class251.method1916(-9343, class46);
            } catch (RuntimeException runtimeexception) {
                throw Class348_Sub17.method2929(runtimeexception, ("ga.QA(" + (var_ha != null ? "{...}" : "null") + ',' + i + ',' + (class46 != null ? "{...}" : "null") + ')'));
            }
            break;
        } while (false);
    }

    abstract int method2384(Class348_Sub1[] class348_sub1s, int i);

    static final void method2385(Class46 class46, int i, aa var_aa, int i_4_, int i_5_, int i_6_, byte i_7_, int i_8_, ha var_ha) {
        do {
            try {
                anInt6390++;
                Class42 class42 = Class348_Sub23_Sub2.aClass153_9031.method1225(i_4_, (byte) 98);
                if (i_7_ < -52) {
                    if (class42 == null || !class42.aBoolean569 || !class42.method373((Class318_Sub1_Sub3_Sub3.aClass170_10209), 69)) break;
                    if (class42.anIntArray591 != null) {
                        int[] is = (new int
                                [class42.anIntArray591.length]);
                        for (int i_9_ = 0; is.length / 2 > i_9_; i_9_++) {
                            int i_10_;
                            if (Class348_Sub40_Sub21.anInt9282 != 4) i_10_ = 0x3fff & (r_Sub2.anInt10483 + (int) Class314.aFloat3938);
                            else i_10_ = (int) Class314.aFloat3938 & 0x3fff;
                            int i_11_ = Class70.anIntArray1207[i_10_];
                            int i_12_ = Class70.anIntArray1204[i_10_];
                            if (Class348_Sub40_Sub21.anInt9282 != 4) {
                                i_11_ = (i_11_ * 256 / (Class348_Sub49_Sub1.anInt9750 + 256));
                                i_12_ = i_12_ * 256 / (256 + (Class348_Sub49_Sub1.anInt9750));
                            }
                            is[i_9_ * 2] = (((i_11_ * (((class42.anIntArray591[i_9_ * 2 - -1]) * 4) + i_8_) + (i_5_ - -(4 * (class42.anIntArray591[2 * i_9_]))) * i_12_) >> 14) + (i_6_ - -(class46.anInt709 / 2)));
                            is[i_9_ * 2 - -1] = (-((((class42.anIntArray591[1 + i_9_ * 2]) * 4 + i_8_) * i_12_ - (i_5_ - -((class42.anIntArray591[i_9_ * 2]) * 4)) * i_11_) >> 14) + i + class46.anInt789 / 2);
                        }
                        Class329.method2619(var_ha, is, class42.anInt582, class46.anIntArray677, class46.anIntArray772);
                        if (class42.anInt584 > 0) {
                            for (int i_13_ = 0; (i_13_ < -1 + is.length / 2); i_13_++) {
                                int i_14_ = is[i_13_ * 2];
                                int i_15_ = is[1 + 2 * i_13_];
                                int i_16_ = is[2 + i_13_ * 2];
                                int i_17_ = is[1 + 2 * (i_13_ - -1)];
                                if (i_14_ <= i_16_) {
                                    if (i_14_ == i_16_ && i_15_ > i_17_) {
                                        int i_18_ = i_15_;
                                        i_15_ = i_17_;
                                        i_17_ = i_18_;
                                    }
                                } else {
                                    int i_19_ = i_14_;
                                    i_14_ = i_16_;
                                    int i_20_ = i_15_;
                                    i_15_ = i_17_;
                                    i_16_ = i_19_;
                                    i_17_ = i_20_;
                                }
                                var_ha.method3703(i_14_, i_15_, i_16_, i_17_, (class42.anIntArray572[((class42.aByteArray564[i_13_]) & 0xff)]), 1, var_aa, i_6_, i, class42.anInt584, class42.anInt575, (class42.anInt601));
                            }
                            int i_21_ = is[-2 + is.length];
                            int i_22_ = is[-1 + is.length];
                            int i_23_ = is[0];
                            int i_24_ = is[1];
                            if (i_23_ < i_21_) {
                                int i_25_ = i_21_;
                                i_21_ = i_23_;
                                int i_26_ = i_22_;
                                i_22_ = i_24_;
                                i_23_ = i_25_;
                                i_24_ = i_26_;
                            } else if (i_21_ == i_23_ && i_22_ > i_24_) {
                                int i_27_ = i_22_;
                                i_22_ = i_24_;
                                i_24_ = i_27_;
                            }
                            var_ha.method3703(i_21_, i_22_, i_23_, i_24_, (class42.anIntArray572[(class42.aByteArray564[((class42.aByteArray564).length - 1)]) & 0xff]), 1, var_aa, i_6_, i, class42.anInt584, class42.anInt575, class42.anInt601);
                        } else {
                            for (int i_28_ = 0; -1 + is.length / 2 > i_28_; i_28_++)
                                var_ha.method3636(is[i_28_ * 2], is[2 * i_28_ + 1], is[2 * (i_28_ - -1)], is[2 * i_28_ + 3], (class42.anIntArray572[((class42.aByteArray564[i_28_]) & 0xff)]), 1, var_aa, i_6_, i);
                            var_ha.method3636(is[is.length + -2], is[-1 + is.length], is[0], is[1], (class42.anIntArray572[(class42.aByteArray564[((class42.aByteArray564).length + -1)]) & 0xff]), 1, var_aa, i_6_, i);
                        }
                    }
                    Class105 class105 = null;
                    if (class42.anInt578 != -1) {
                        class105 = class42.method374(false, var_ha, (byte) 127);
                        if (class105 != null) Class151.method1211(i, class105, i_6_, class46, var_aa, i_8_, 2, i_5_);
                    }
                    if (class42.aString597 == null) break;
                    int i_29_ = 0;
                    if (class105 != null) i_29_ = class105.method969();
                    Class324 class324 = Class240.aClass324_4684;
                    Class143 class143 = Class258_Sub1.aClass143_8527;
                    if (class42.anInt576 == 1) {
                        class324 = Applet_Sub1.aClass324_20;
                        class143 = Class246.aClass143_3179;
                    }
                    if (class42.anInt576 == 2) {
                        class143 = Class369.aClass143_4962;
                        class324 = Class262.aClass324_3326;
                    }
                    Class334.method2650(class143, class42.anInt580, var_aa, i_8_, i_6_, class42.aString597, i, class324, i_29_, class46, i_5_, 100);
                }
            } catch (RuntimeException runtimeexception) {
                throw Class348_Sub17.method2929(runtimeexception, ("ga.KA(" + (class46 != null ? "{...}" : "null") + ',' + i + ',' + (var_aa != null ? "{...}" : "null") + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ',' + (var_ha != null ? "{...}" : "null") + ')'));
            }
            break;
        } while (false);
    }

    abstract Class318_Sub4 method2386(int i, ha var_ha);

    abstract void method2387(ha var_ha, int i);

    abstract boolean method2388(int i);

    public static void method2389(int i) {
        aClass114_6383 = null;
        if (i != 1) aClass114_6383 = null;
    }

    final int method2390(Class348_Sub1[] class348_sub1s, int i, int i_30_, int i_31_) {
        anInt6384++;
        if (i_30_ != -2) this.aByte6376 = (byte) 33;
        long l = (Class348_Sub42_Sub8_Sub2.aLongArrayArrayArray10431[this.plane][i][i_31_]);
        long l_32_ = 0L;
        int i_33_ = 0;
        for (/**/; l_32_ <= 48; l_32_ += 16L) {
            int i_34_ = (int) (0xffffL & l >> (int) l_32_);
            if (i_34_ <= 0) break;
            class348_sub1s[i_33_++] = (Class239_Sub14.aClass211Array5993[i_34_ + -1].aClass348_Sub1_2745);
        }
        for (int i_35_ = i_33_; i_35_ < 4; i_35_++)
            class348_sub1s[i_35_] = null;
        return i_33_;
    }

    abstract boolean method2391(ha var_ha, int i, int i_36_, int i_37_);

    abstract void method2392(boolean bool);

    public Class318_Sub1() {
        /* empty */
    }

    int method2393(int i) {
        if (i >= -109) method2385(null, 23, null, -94, -53, 18, (byte) -3, 35, null);
        anInt6378++;
        return 0;
    }

    abstract int method2394(boolean bool);
}
