/* Class318_Sub9_Sub2_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class318_Sub9_Sub2_Sub1 extends Class318_Sub9_Sub2 {
    private short aShort10416;
    private int anInt10417;
    private short aShort10418;
    Class318_Sub7 aClass318_Sub7_10419;
    private short aShort10420;
    private int anInt10421;
    private short aShort10422;
    private short aShort10423;
    private short aShort10424;

    final void method2520() {
        ((Class318_Sub10) (((Class318_Sub7) (((Class318_Sub9_Sub2_Sub1) this)
                .aClass318_Sub7_10419))
                .aClass318_Sub10_6439))
                .aClass318_Sub9_Sub2_Sub1Array6475[aShort10416]
                = null;
        Class239_Sub25.aClass318_Sub9_Sub2_Sub1Array6103[client.anInt5171]
                = this;
        client.anInt5171 = client.anInt5171 + 1 & 0x3ff;
        this.method2373(false);
        this.method2514(-108);
    }

    private final void method2521() {
        int i
                = (((Class318_Sub10)
                ((Class318_Sub7) (((Class318_Sub9_Sub2_Sub1) this)
                        .aClass318_Sub7_10419)).aClass318_Sub10_6439)
                .anInt6476);
        if ((((Class318_Sub10)
                ((Class318_Sub7) (((Class318_Sub9_Sub2_Sub1) this)
                        .aClass318_Sub7_10419)).aClass318_Sub10_6439)
                .aClass318_Sub9_Sub2_Sub1Array6475[i])
                != null)
            ((Class318_Sub10)
                    ((Class318_Sub7) (((Class318_Sub9_Sub2_Sub1) this)
                            .aClass318_Sub7_10419)).aClass318_Sub10_6439)
                    .aClass318_Sub9_Sub2_Sub1Array6475[i].method2520();
        ((Class318_Sub10) (((Class318_Sub7) (((Class318_Sub9_Sub2_Sub1) this)
                .aClass318_Sub7_10419))
                .aClass318_Sub10_6439))
                .aClass318_Sub9_Sub2_Sub1Array6475[i]
                = this;
        aShort10416
                = (short) ((Class318_Sub10)
                (((Class318_Sub7)
                        ((Class318_Sub9_Sub2_Sub1) this).aClass318_Sub7_10419)
                        .aClass318_Sub10_6439)).anInt6476;
        ((Class318_Sub10) (((Class318_Sub7) (((Class318_Sub9_Sub2_Sub1) this)
                .aClass318_Sub7_10419))
                .aClass318_Sub10_6439)).anInt6476
                = i + 1 & 0x1fff;
        ((Class318_Sub7) ((Class318_Sub9_Sub2_Sub1) this).aClass318_Sub7_10419)
                .aClass243_6433.method1869(-98, this);
    }

    final void method2522(ha var_ha, long l) {
        int i
                = ((Class318_Sub9_Sub2) this).anInt8791 >> 12 + Class362.anInt4459;
        int i_0_
                = ((Class318_Sub9_Sub2) this).anInt8789 >> 12 + Class362.anInt4459;
        int i_1_ = ((Class318_Sub9_Sub2) this).anInt8796 >> 12;
        if (i_1_ > 0 || i_1_ < -262144 || i < 0 || i >= Class318_Sub7.anInt6451
                || i_0_ < 0 || i_0_ >= Class348_Sub41.anInt7054)
            method2520();
        else {
            Class318_Sub10 class318_sub10
                    = (((Class318_Sub7)
                    ((Class318_Sub9_Sub2_Sub1) this).aClass318_Sub7_10419)
                    .aClass318_Sub10_6439);
            Class181 class181
                    = (((Class318_Sub7)
                    ((Class318_Sub9_Sub2_Sub1) this).aClass318_Sub7_10419)
                    .aClass181_6441);
            s[] var_ses = aa_Sub1.aSArray5191;
            int i_2_ = ((Class318_Sub10) class318_sub10).anInt6483;
            Class357 class357
                    = (Class147.aClass357ArrayArrayArray2029
                    [((Class318_Sub10) class318_sub10).anInt6483][i][i_0_]);
            if (class357 != null)
                i_2_ = ((Class357) class357).aByte4399;
            int i_3_ = var_ses[i_2_].method3982((byte) -86, i_0_, i);
            int i_4_;
            if (i_2_ < Class189.anInt2524 - 1)
                i_4_ = var_ses[i_2_ + 1].method3982((byte) -86, i_0_, i);
            else
                i_4_ = i_3_ - (8 << Class362.anInt4459);
            if (((Class181) class181).aBoolean2397) {
                if (((Class181) class181).anInt2384 == -1 && i_1_ > i_3_) {
                    method2520();
                    return;
                }
                if (((Class181) class181).anInt2384 >= 0
                        && i_1_ > var_ses[((Class181) class181).anInt2384]
                        .method3982((byte) -86, i_0_, i)) {
                    method2520();
                    return;
                }
                if (((Class181) class181).anInt2423 == -1 && i_1_ < i_4_) {
                    method2520();
                    return;
                }
                if (((Class181) class181).anInt2423 >= 0
                        && i_1_ < var_ses[((Class181) class181).anInt2423 + 1]
                        .method3982((byte) -86, i_0_, i)) {
                    method2520();
                    return;
                }
            }
            int i_5_;
            for (i_5_ = Class189.anInt2524 - 1;
                 (i_5_ > 0
                         && i_1_ > var_ses[i_5_].method3982((byte) -86, i_0_, i));
                 i_5_--) {
                /* empty */
            }
            if (((Class181) class181).aBoolean2376 && i_5_ == 0
                    && i_1_ > var_ses[0].method3982((byte) -86, i_0_, i))
                method2520();
            else if (i_5_ == Class189.anInt2524 - 1
                    && (var_ses[i_5_].method3982((byte) -86, i_0_, i) - i_1_
                    > 8 << Class362.anInt4459))
                method2520();
            else {
                class357
                        = Class147.aClass357ArrayArrayArray2029[i_5_][i][i_0_];
                if (class357 == null) {
                    if (i_5_ == 0
                            || (Class147.aClass357ArrayArrayArray2029[0][i][i_0_]
                            == null))
                        class357
                                = Class147.aClass357ArrayArrayArray2029[0][i][i_0_]
                                = new Class357(0);
                    boolean bool
                            = (((Class357) (Class147.aClass357ArrayArrayArray2029
                            [0][i][i_0_])).aClass357_4400
                            != null);
                    if (i_5_ == 3 && bool) {
                        method2520();
                        return;
                    }
                    for (int i_6_ = 1; i_6_ <= i_5_; i_6_++) {
                        if ((Class147.aClass357ArrayArrayArray2029[i_6_][i]
                                [i_0_])
                                == null) {
                            class357
                                    = Class147.aClass357ArrayArrayArray2029
                                    [i_6_][i][i_0_]
                                    = new Class357(i_6_);
                            if (bool)
                                ((Class357) class357).aByte4399++;
                        }
                    }
                }
                if (((Class181) class181).aBoolean2424) {
                    int i_7_ = ((Class318_Sub9_Sub2) this).anInt8791 >> 12;
                    int i_8_ = ((Class318_Sub9_Sub2) this).anInt8789 >> 12;
                    if (((Class357) class357).aClass318_Sub1_Sub4_4406
                            != null) {
                        Class30 class30
                                = ((Class357) class357)
                                .aClass318_Sub1_Sub4_4406
                                .method2381(var_ha, 7);
                        if (class30 != null
                                && class30.method321(-14735, i_8_, i_1_, i_7_)) {
                            method2520();
                            return;
                        }
                    }
                    if (((Class357) class357).aClass318_Sub1_Sub4_4403
                            != null) {
                        Class30 class30
                                = ((Class357) class357)
                                .aClass318_Sub1_Sub4_4403
                                .method2381(var_ha, 7);
                        if (class30 != null
                                && class30.method321(-14735, i_8_, i_1_, i_7_)) {
                            method2520();
                            return;
                        }
                    }
                    if (((Class357) class357).aClass318_Sub1_Sub1_4402
                            != null) {
                        Class30 class30
                                = ((Class357) class357)
                                .aClass318_Sub1_Sub1_4402
                                .method2381(var_ha, 7);
                        if (class30 != null
                                && class30.method321(-14735, i_8_, i_1_, i_7_)) {
                            method2520();
                            return;
                        }
                    }
                    for (Class148 class148
                         = ((Class357) class357).aClass148_4396;
                         class148 != null;
                         class148 = ((Class148) class148).aClass148_2038) {
                        Class30 class30
                                = ((Class148) class148)
                                .aClass318_Sub1_Sub3_2040
                                .method2381(var_ha, 7);
                        if (class30 != null
                                && class30.method321(-14735, i_8_, i_1_, i_7_)) {
                            method2520();
                            return;
                        }
                    }
                }
                ((Class98) ((Class318_Sub10) class318_sub10).aClass98_6481)
                        .aClass88_1569.method844(this, true);
            }
        }
    }

    final void method2523(Class318_Sub7 class318_sub7, int i, int i_9_,
                          int i_10_, int i_11_, int i_12_, int i_13_,
                          int i_14_, int i_15_, int i_16_, int i_17_,
                          int i_18_, boolean bool, boolean bool_19_) {
        ((Class318_Sub9_Sub2_Sub1) this).aClass318_Sub7_10419 = class318_sub7;
        ((Class318_Sub9_Sub2) this).anInt8791 = i << 12;
        ((Class318_Sub9_Sub2) this).anInt8796 = i_9_ << 12;
        ((Class318_Sub9_Sub2) this).anInt8789 = i_10_ << 12;
        ((Class318_Sub9_Sub2) this).anInt8790 = i_16_;
        aShort10418 = aShort10420 = (short) i_15_;
        ((Class318_Sub9_Sub2) this).anInt8793 = i_17_;
        ((Class318_Sub9_Sub2) this).anInt8792 = i_18_;
        ((Class318_Sub9_Sub2) this).aBoolean8794 = bool_19_;
        aShort10424 = (short) i_11_;
        aShort10423 = (short) i_12_;
        aShort10422 = (short) i_13_;
        anInt10421 = i_14_;
        ((Class318_Sub9_Sub2) this).aByte8795
                = ((Class129) (((Class318_Sub7) (((Class318_Sub9_Sub2_Sub1) this)
                .aClass318_Sub7_10419))
                .aClass129_6436)).aByte1875;
        method2521();
    }

    final void method2524(long l, int i) {
        aShort10420 -= i;
        if (aShort10420 <= 0)
            method2520();
        else {
            int i_20_ = ((Class318_Sub9_Sub2) this).anInt8791 >> 12;
            int i_21_ = ((Class318_Sub9_Sub2) this).anInt8796 >> 12;
            int i_22_ = ((Class318_Sub9_Sub2) this).anInt8789 >> 12;
            Class318_Sub10 class318_sub10
                    = (((Class318_Sub7)
                    ((Class318_Sub9_Sub2_Sub1) this).aClass318_Sub7_10419)
                    .aClass318_Sub10_6439);
            Class181 class181
                    = (((Class318_Sub7)
                    ((Class318_Sub9_Sub2_Sub1) this).aClass318_Sub7_10419)
                    .aClass181_6441);
            if (((Class181) class181).anInt2386 != 0) {
                if (aShort10418 - aShort10420
                        <= ((Class181) class181).anInt2373) {
                    int i_23_ = ((((Class318_Sub9_Sub2) this).anInt8790 >> 8
                            & 0xff00)
                            + (anInt10417 >> 16 & 0xff)
                            + ((Class181) class181).anInt2426 * i);
                    int i_24_
                            = ((((Class318_Sub9_Sub2) this).anInt8790 & 0xff00)
                            + (anInt10417 >> 8 & 0xff)
                            + ((Class181) class181).anInt2421 * i);
                    int i_25_ = ((((Class318_Sub9_Sub2) this).anInt8790 << 8
                            & 0xff00)
                            + (anInt10417 & 0xff)
                            + ((Class181) class181).anInt2405 * i);
                    if (i_23_ < 0)
                        i_23_ = 0;
                    else if (i_23_ > 65535)
                        i_23_ = 65535;
                    if (i_24_ < 0)
                        i_24_ = 0;
                    else if (i_24_ > 65535)
                        i_24_ = 65535;
                    if (i_25_ < 0)
                        i_25_ = 0;
                    else if (i_25_ > 65535)
                        i_25_ = 65535;
                    ((Class318_Sub9_Sub2) this).anInt8790 &= ~0xffffff;
                    ((Class318_Sub9_Sub2) this).anInt8790
                            |= (((i_23_ & 0xff00) << 8) + (i_24_ & 0xff00)
                            + ((i_25_ & 0xff00) >> 8));
                    anInt10417 &= ~0xffffff;
                    anInt10417 |= (((i_23_ & 0xff) << 16)
                            + ((i_24_ & 0xff) << 8) + (i_25_ & 0xff));
                }
                if (aShort10418 - aShort10420
                        <= ((Class181) class181).anInt2381) {
                    int i_26_ = ((((Class318_Sub9_Sub2) this).anInt8790 >> 16
                            & 0xff00)
                            + (anInt10417 >> 24 & 0xff)
                            + ((Class181) class181).anInt2416 * i);
                    if (i_26_ < 0)
                        i_26_ = 0;
                    else if (i_26_ > 65535)
                        i_26_ = 65535;
                    ((Class318_Sub9_Sub2) this).anInt8790 &= 0xffffff;
                    ((Class318_Sub9_Sub2) this).anInt8790
                            |= (i_26_ & 0xff00) << 16;
                    anInt10417 &= 0xffffff;
                    anInt10417 |= (i_26_ & 0xff) << 24;
                }
            }
            if (((Class181) class181).anInt2404 != -1
                    && (aShort10418 - aShort10420
                    <= ((Class181) class181).anInt2383))
                anInt10421 += ((Class181) class181).anInt2377 * i;
            if (((Class181) class181).anInt2427 != -1
                    && (aShort10418 - aShort10420
                    <= ((Class181) class181).anInt2388))
                ((Class318_Sub9_Sub2) this).anInt8793
                        += ((Class181) class181).anInt2439 * i;
            double d = (double) aShort10424;
            double d_27_ = (double) aShort10423;
            double d_28_ = (double) aShort10422;
            boolean bool = false;
            if (((Class181) class181).anInt2436 == 1) {
                int i_29_
                        = i_20_ - ((Class284) (((Class318_Sub7)
                        (((Class318_Sub9_Sub2_Sub1) this)
                                .aClass318_Sub7_10419))
                        .aClass284_6444)).anInt3673;
                int i_30_
                        = i_21_ - ((Class284) (((Class318_Sub7)
                        (((Class318_Sub9_Sub2_Sub1) this)
                                .aClass318_Sub7_10419))
                        .aClass284_6444)).anInt3667;
                int i_31_
                        = i_22_ - ((Class284) (((Class318_Sub7)
                        (((Class318_Sub9_Sub2_Sub1) this)
                                .aClass318_Sub7_10419))
                        .aClass284_6444)).anInt3671;
                int i_32_
                        = ((int) Math.sqrt((double) (i_29_ * i_29_ + i_30_ * i_30_
                        + i_31_ * i_31_))
                        >> 2);
                long l_33_
                        = (long) (((Class181) class181).anInt2437 * i_32_ * i);
                anInt10421 -= (long) anInt10421 * l_33_ >> 18;
            } else if (((Class181) class181).anInt2436 == 2) {
                int i_34_
                        = i_20_ - ((Class284) (((Class318_Sub7)
                        (((Class318_Sub9_Sub2_Sub1) this)
                                .aClass318_Sub7_10419))
                        .aClass284_6444)).anInt3673;
                int i_35_
                        = i_21_ - ((Class284) (((Class318_Sub7)
                        (((Class318_Sub9_Sub2_Sub1) this)
                                .aClass318_Sub7_10419))
                        .aClass284_6444)).anInt3667;
                int i_36_
                        = i_22_ - ((Class284) (((Class318_Sub7)
                        (((Class318_Sub9_Sub2_Sub1) this)
                                .aClass318_Sub7_10419))
                        .aClass284_6444)).anInt3671;
                int i_37_ = i_34_ * i_34_ + i_35_ * i_35_ + i_36_ * i_36_;
                long l_38_
                        = (long) (((Class181) class181).anInt2437 * i_37_ * i);
                anInt10421 -= (long) anInt10421 * l_38_ >> 28;
            }
            if (((Class181) class181).anIntArray2402 != null) {
                Class348 class348
                        = (((Class262)
                        ((Class318_Sub10) class318_sub10).aClass262_6479)
                        .aClass348_3334);
                for (Class348 class348_39_
                     = ((Class348) class348).aClass348_4294;
                     class348_39_ != class348;
                     class348_39_ = ((Class348) class348_39_).aClass348_4294) {
                    Class348_Sub42_Sub20 class348_sub42_sub20
                            = (Class348_Sub42_Sub20) class348_39_;
                    Class174 class174
                            = (((Class348_Sub42_Sub20) class348_sub42_sub20)
                            .aClass174_9704);
                    if (((Class174) class174).anInt2296 != 1) {
                        boolean bool_40_ = false;
                        for (int i_41_ = 0;
                             (i_41_
                                     < ((Class181) class181).anIntArray2402.length);
                             i_41_++) {
                            if (((Class181) class181).anIntArray2402[i_41_]
                                    == ((Class174) class174).anInt2303) {
                                bool_40_ = true;
                                break;
                            }
                        }
                        if (bool_40_) {
                            double d_42_
                                    = (double) (i_20_ - (((Class348_Sub42_Sub20)
                                    class348_sub42_sub20)
                                    .anInt9712));
                            double d_43_
                                    = (double) (i_21_ - (((Class348_Sub42_Sub20)
                                    class348_sub42_sub20)
                                    .anInt9706));
                            double d_44_
                                    = (double) (i_22_ - (((Class348_Sub42_Sub20)
                                    class348_sub42_sub20)
                                    .anInt9710));
                            double d_45_ = (d_42_ * d_42_ + d_43_ * d_43_
                                    + d_44_ * d_44_);
                            if (!(d_45_ > (double) (((Class174) class174)
                                    .aLong2301))) {
                                double d_46_ = Math.sqrt(d_45_);
                                if (d_46_ == 0.0)
                                    d_46_ = 1.0;
                                double d_47_
                                        = (((d_42_
                                        * (double) (((Class348_Sub42_Sub20)
                                        class348_sub42_sub20)
                                        .anInt9705))
                                        + d_43_ * (double) ((Class174)
                                        class174).anInt2290
                                        + (d_44_
                                        * (double) (((Class348_Sub42_Sub20)
                                        class348_sub42_sub20)
                                        .anInt9707)))
                                        * 65535.0
                                        / ((double) (((Class174) class174)
                                        .anInt2299)
                                        * d_46_));
                                if (!(d_47_ < (double) (((Class174) class174)
                                        .anInt2298))) {
                                    double d_48_ = 0.0;
                                    if (((Class174) class174).anInt2289 == 1)
                                        d_48_ = (d_46_ / 16.0
                                                * (double) (((Class174)
                                                class174)
                                                .anInt2304));
                                    else if (((Class174) class174).anInt2289
                                            == 2)
                                        d_48_ = (d_46_ / 16.0 * (d_46_ / 16.0)
                                                * (double) (((Class174)
                                                class174)
                                                .anInt2304));
                                    if (((Class174) class174).anInt2292 == 0) {
                                        if (((Class174) class174).anInt2297
                                                == 0) {
                                            d += ((double) (((Class348_Sub42_Sub20)
                                                    class348_sub42_sub20)
                                                    .anInt9705)
                                                    - d_48_) * (double) i;
                                            d_27_ += ((double) (((Class174)
                                                    class174)
                                                    .anInt2290)
                                                    - d_48_) * (double) i;
                                            d_28_
                                                    += ((double) (((Class348_Sub42_Sub20)
                                                    class348_sub42_sub20)
                                                    .anInt9707)
                                                    - d_48_) * (double) i;
                                            bool = true;
                                        } else {
                                            ((Class318_Sub9_Sub2) this)
                                                    .anInt8791
                                                    += ((double) (((Class348_Sub42_Sub20)
                                                    class348_sub42_sub20)
                                                    .anInt9705)
                                                    - d_48_) * (double) i;
                                            ((Class318_Sub9_Sub2) this)
                                                    .anInt8796
                                                    += ((double) (((Class174)
                                                    class174)
                                                    .anInt2290)
                                                    - d_48_) * (double) i;
                                            ((Class318_Sub9_Sub2) this)
                                                    .anInt8789
                                                    += ((double) (((Class348_Sub42_Sub20)
                                                    class348_sub42_sub20)
                                                    .anInt9707)
                                                    - d_48_) * (double) i;
                                        }
                                    } else {
                                        double d_49_
                                                = (d_42_ / d_46_
                                                * (double) (((Class174)
                                                class174)
                                                .anInt2299));
                                        double d_50_
                                                = (d_43_ / d_46_
                                                * (double) (((Class174)
                                                class174)
                                                .anInt2299));
                                        double d_51_
                                                = (d_44_ / d_46_
                                                * (double) (((Class174)
                                                class174)
                                                .anInt2299));
                                        if (((Class174) class174).anInt2297
                                                == 0) {
                                            d += d_49_ * (double) i;
                                            d_27_ += d_50_ * (double) i;
                                            d_28_ += d_51_ * (double) i;
                                            bool = true;
                                        } else {
                                            ((Class318_Sub9_Sub2) this)
                                                    .anInt8791
                                                    += d_49_ * (double) i;
                                            ((Class318_Sub9_Sub2) this)
                                                    .anInt8796
                                                    += d_50_ * (double) i;
                                            ((Class318_Sub9_Sub2) this)
                                                    .anInt8789
                                                    += d_51_ * (double) i;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (((Class181) class181).anIntArray2380 != null) {
                for (int i_52_ = 0;
                     i_52_ < ((Class181) class181).anIntArray2380.length;
                     i_52_++) {
                    Class348_Sub42_Sub20 class348_sub42_sub20
                            = ((Class348_Sub42_Sub20)
                            (Class367_Sub11.aClass32_7415.method334
                                    ((long) (((Class181) class181).anIntArray2380
                                                    [i_52_]),
                                            (byte) 121)));
                    while (class348_sub42_sub20 != null) {
                        Class174 class174
                                = (((Class348_Sub42_Sub20) class348_sub42_sub20)
                                .aClass174_9704);
                        double d_53_
                                = (double) (i_20_
                                - ((Class348_Sub42_Sub20)
                                class348_sub42_sub20).anInt9712);
                        double d_54_
                                = (double) (i_21_
                                - ((Class348_Sub42_Sub20)
                                class348_sub42_sub20).anInt9706);
                        double d_55_
                                = (double) (i_22_
                                - ((Class348_Sub42_Sub20)
                                class348_sub42_sub20).anInt9710);
                        double d_56_
                                = d_53_ * d_53_ + d_54_ * d_54_ + d_55_ * d_55_;
                        if (d_56_ > (double) ((Class174) class174).aLong2301)
                            class348_sub42_sub20
                                    = (Class348_Sub42_Sub20) Class367_Sub11
                                    .aClass32_7415
                                    .method336(true);
                        else {
                            double d_57_ = Math.sqrt(d_56_);
                            if (d_57_ == 0.0)
                                d_57_ = 1.0;
                            double d_58_
                                    = ((d_53_ * (double) (((Class348_Sub42_Sub20)
                                    class348_sub42_sub20)
                                    .anInt9705)
                                    + d_54_ * (double) (((Class174) class174)
                                    .anInt2290)
                                    + d_55_ * (double) (((Class348_Sub42_Sub20)
                                    class348_sub42_sub20)
                                    .anInt9707))
                                    * 65535.0
                                    / ((double) ((Class174) class174).anInt2299
                                    * d_57_));
                            if (d_58_
                                    < (double) ((Class174) class174).anInt2298)
                                class348_sub42_sub20
                                        = ((Class348_Sub42_Sub20)
                                        Class367_Sub11.aClass32_7415
                                                .method336(true));
                            else {
                                double d_59_ = 0.0;
                                if (((Class174) class174).anInt2289 == 1)
                                    d_59_ = (d_57_ / 16.0
                                            * (double) (((Class174) class174)
                                            .anInt2304));
                                else if (((Class174) class174).anInt2289 == 2)
                                    d_59_ = (d_57_ / 16.0 * (d_57_ / 16.0)
                                            * (double) (((Class174) class174)
                                            .anInt2304));
                                if (((Class174) class174).anInt2292 == 0) {
                                    if (((Class174) class174).anInt2297 == 0) {
                                        d += ((double) (((Class348_Sub42_Sub20)
                                                class348_sub42_sub20)
                                                .anInt9705)
                                                - d_59_) * (double) i;
                                        d_27_
                                                += ((double) (((Class174) class174)
                                                .anInt2290)
                                                - d_59_) * (double) i;
                                        d_28_
                                                += ((double) (((Class348_Sub42_Sub20)
                                                class348_sub42_sub20)
                                                .anInt9707)
                                                - d_59_) * (double) i;
                                        bool = true;
                                    } else {
                                        ((Class318_Sub9_Sub2) this).anInt8791
                                                += ((double) (((Class348_Sub42_Sub20)
                                                class348_sub42_sub20)
                                                .anInt9705)
                                                - d_59_) * (double) i;
                                        ((Class318_Sub9_Sub2) this).anInt8796
                                                += ((double) (((Class174) class174)
                                                .anInt2290)
                                                - d_59_) * (double) i;
                                        ((Class318_Sub9_Sub2) this).anInt8789
                                                += ((double) (((Class348_Sub42_Sub20)
                                                class348_sub42_sub20)
                                                .anInt9707)
                                                - d_59_) * (double) i;
                                    }
                                } else {
                                    double d_60_
                                            = (d_53_ / d_57_
                                            * (double) (((Class174) class174)
                                            .anInt2299));
                                    double d_61_
                                            = (d_54_ / d_57_
                                            * (double) (((Class174) class174)
                                            .anInt2299));
                                    double d_62_
                                            = (d_55_ / d_57_
                                            * (double) (((Class174) class174)
                                            .anInt2299));
                                    if (((Class174) class174).anInt2297 == 0) {
                                        d += d_60_ * (double) i;
                                        d_27_ += d_61_ * (double) i;
                                        d_28_ += d_62_ * (double) i;
                                        bool = true;
                                    } else {
                                        ((Class318_Sub9_Sub2) this).anInt8791
                                                += d_60_ * (double) i;
                                        ((Class318_Sub9_Sub2) this).anInt8796
                                                += d_61_ * (double) i;
                                        ((Class318_Sub9_Sub2) this).anInt8789
                                                += d_62_ * (double) i;
                                    }
                                }
                                class348_sub42_sub20
                                        = ((Class348_Sub42_Sub20)
                                        Class367_Sub11.aClass32_7415
                                                .method336(true));
                            }
                        }
                    }
                }
            }
            if (((Class181) class181).anIntArray2395 != null) {
                if (((Class181) class181).anIntArray2385 == null) {
                    ((Class181) class181).anIntArray2385
                            = new int[((Class181) class181).anIntArray2395.length];
                    for (int i_63_ = 0;
                         i_63_ < ((Class181) class181).anIntArray2395.length;
                         i_63_++) {
                        Class256.method1943(false, (((Class181) class181)
                                .anIntArray2395[i_63_]));
                        ((Class181) class181).anIntArray2385[i_63_]
                                = ((Class348_Sub35) (Class348_Sub35)
                                (Class59_Sub2_Sub2.aClass356_8679.method3480
                                        ((long) (((Class181) class181).anIntArray2395
                                                        [i_63_]),
                                                -6008))).anInt6976;
                    }
                }
                for (int i_64_ = 0;
                     i_64_ < ((Class181) class181).anIntArray2385.length;
                     i_64_++) {
                    Class174 class174
                            = (Class19.aClass174Array311
                            [((Class181) class181).anIntArray2385[i_64_]]);
                    if (((Class174) class174).anInt2297 == 0) {
                        d += (double) (((Class174) class174).anInt2291 * i);
                        d_27_
                                += (double) (((Class174) class174).anInt2290 * i);
                        d_28_
                                += (double) (((Class174) class174).anInt2294 * i);
                        bool = true;
                    } else {
                        ((Class318_Sub9_Sub2) this).anInt8791
                                += ((Class174) class174).anInt2291 * i;
                        ((Class318_Sub9_Sub2) this).anInt8796
                                += ((Class174) class174).anInt2290 * i;
                        ((Class318_Sub9_Sub2) this).anInt8789
                                += ((Class174) class174).anInt2294 * i;
                    }
                }
            }
            if (bool) {
                while (d > 32767.0 || d_27_ > 32767.0 || d_28_ > 32767.0
                        || d < -32767.0 || d_27_ < -32767.0
                        || d_28_ < -32767.0) {
                    d /= 2.0;
                    d_27_ /= 2.0;
                    d_28_ /= 2.0;
                    anInt10421 <<= 1;
                }
                aShort10424 = (short) (int) d;
                aShort10423 = (short) (int) d_27_;
                aShort10422 = (short) (int) d_28_;
            }
            ((Class318_Sub9_Sub2) this).anInt8791
                    += (((long) aShort10424 * (long) (anInt10421 << 2) >> 23)
                    * (long) i);
            ((Class318_Sub9_Sub2) this).anInt8796
                    += (((long) aShort10423 * (long) (anInt10421 << 2) >> 23)
                    * (long) i);
            ((Class318_Sub9_Sub2) this).anInt8789
                    += (((long) aShort10422 * (long) (anInt10421 << 2) >> 23)
                    * (long) i);
        }
    }

    Class318_Sub9_Sub2_Sub1(Class318_Sub7 class318_sub7, int i, int i_65_,
                            int i_66_, int i_67_, int i_68_, int i_69_,
                            int i_70_, int i_71_, int i_72_, int i_73_,
                            int i_74_, boolean bool, boolean bool_75_) {
        ((Class318_Sub9_Sub2_Sub1) this).aClass318_Sub7_10419 = class318_sub7;
        ((Class318_Sub9_Sub2) this).anInt8791 = i << 12;
        ((Class318_Sub9_Sub2) this).anInt8796 = i_65_ << 12;
        ((Class318_Sub9_Sub2) this).anInt8789 = i_66_ << 12;
        ((Class318_Sub9_Sub2) this).anInt8790 = i_72_;
        aShort10418 = aShort10420 = (short) i_71_;
        ((Class318_Sub9_Sub2) this).anInt8793 = i_73_;
        ((Class318_Sub9_Sub2) this).anInt8792 = i_74_;
        ((Class318_Sub9_Sub2) this).aBoolean8794 = bool_75_;
        aShort10424 = (short) i_67_;
        aShort10423 = (short) i_68_;
        aShort10422 = (short) i_69_;
        anInt10421 = i_70_;
        ((Class318_Sub9_Sub2) this).aByte8795
                = ((Class129) (((Class318_Sub7) (((Class318_Sub9_Sub2_Sub1) this)
                .aClass318_Sub7_10419))
                .aClass129_6436)).aByte1875;
        method2521();
    }
}
