/* Class348_Sub40_Sub7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class348_Sub40_Sub7 extends Class348_Sub40 {
    private boolean aBoolean9140 = true;
    static int anInt9141;
    static int anInt9142;
    static int anInt9143;
    static Class348_Sub42_Sub12 aClass348_Sub42_Sub12_9144;
    static int anInt9145;
    static int anInt9146;
    private boolean aBoolean9147 = true;

    final int[][] method3047(int i, int i_0_) {
        anInt9141++;
        int[][] is
                = ((Class348_Sub40) this).aClass322_7033.method2557(-119, i);
        if (((Class322) ((Class348_Sub40) this).aClass322_7033).aBoolean4035) {
            int[][] is_1_
                    = this.method3039((byte) 120,
                    (aBoolean9147 ? -i + Class299_Sub2.anInt6325
                            : i),
                    0);
            int[] is_2_ = is_1_[0];
            int[] is_3_ = is_1_[1];
            int[] is_4_ = is_1_[2];
            int[] is_5_ = is[0];
            int[] is_6_ = is[1];
            int[] is_7_ = is[2];
            if (aBoolean9140) {
                for (int i_8_ = 0; i_8_ < Class348_Sub40_Sub6.anInt9139;
                     i_8_++) {
                    is_5_[i_8_] = is_2_[Class239_Sub22.anInt6076 + -i_8_];
                    is_6_[i_8_] = is_3_[Class239_Sub22.anInt6076 - i_8_];
                    is_7_[i_8_] = is_4_[-i_8_ + Class239_Sub22.anInt6076];
                }
            } else {
                for (int i_9_ = 0;
                     ((Class348_Sub40_Sub6.anInt9139 ^ 0xffffffff)
                             < (i_9_ ^ 0xffffffff));
                     i_9_++) {
                    is_5_[i_9_] = is_2_[i_9_];
                    is_6_[i_9_] = is_3_[i_9_];
                    is_7_[i_9_] = is_4_[i_9_];
                }
            }
        }
        if (i_0_ != -1564599039)
            method3065(-40, true, 93);
        return is;
    }

    static final void method3064(int i, int i_10_, boolean bool, int i_11_,
                                 int i_12_, int i_13_, int i_14_,
                                 boolean bool_15_, Class46[] class46s,
                                 int i_16_, int i_17_) {
        try {
            Class348_Sub8.aHa6654.KA(i, i_12_, i_14_, i_17_);
            if (bool_15_ == false) {
                anInt9145++;
                int i_18_ = 0;
                for (/**/; class46s.length > i_18_; i_18_++) {
                    Class46 class46 = class46s[i_18_];
                    if (class46 != null
                            && (((Class46) class46).anInt834 == i_16_
                            || ((i_16_ ^ 0xffffffff) == 1412584498
                            && Class289.aClass46_3701 == class46))) {
                        int i_19_ = i_11_ + ((Class46) class46).anInt800;
                        int i_20_ = ((Class46) class46).anInt750 + i_10_;
                        int i_21_ = 1 + (((Class46) class46).anInt709 + i_19_);
                        int i_22_ = ((Class46) class46).anInt789 + i_20_ - -1;
                        int i_23_;
                        if ((i_13_ ^ 0xffffffff) == 0) {
                            Class180.aRectangleArray2371
                                    [Class348_Sub38.anInt7008].setBounds
                                    (i_11_ + ((Class46) class46).anInt800,
                                            i_10_ + ((Class46) class46).anInt750,
                                            ((Class46) class46).anInt709,
                                            ((Class46) class46).anInt789);
                            i_23_ = Class348_Sub38.anInt7008++;
                        } else
                            i_23_ = i_13_;
                        ((Class46) class46).anInt794
                                = Class367_Sub11.anInt7396;
                        ((Class46) class46).anInt760 = i_23_;
                        if (!client.method111(class46)) {
                            if (((Class46) class46).anInt765 != 0)
                                Class348_Sub18.method2942(class46, (byte) -36);
                            int i_24_ = ((Class46) class46).anInt800 - -i_11_;
                            int i_25_ = ((Class46) class46).anInt750 + i_10_;
                            int i_26_ = 0;
                            int i_27_ = 0;
                            if (Class59_Sub1.aBoolean5300) {
                                i_26_ = s_Sub3.method4008((byte) -124);
                                i_27_ = Class16.method260(bool_15_);
                            }
                            int i_28_ = ((Class46) class46).anInt696;
                            if (Class299_Sub2.aBoolean6327
                                    && (((Class348_Sub44)
                                    client.method105(class46)).anInt7098 != 0
                                    || (((Class46) class46).anInt774
                                    ^ 0xffffffff) == -1)
                                    && (i_28_ ^ 0xffffffff) < -128)
                                i_28_ = 127;
                            if (class46 == Class289.aClass46_3701) {
                                if ((i_16_ ^ 0xffffffff) != 1412584498
                                        && ((Class312.anInt3930
                                        == ((Class46) class46).anInt797)
                                        || (InputStream_Sub1.anInt78
                                        == (((Class46) class46)
                                        .anInt797)))) {
                                    Class136.anInt4792 = i_10_;
                                    Class348_Sub1.anInt6555 = i_11_;
                                    Class138.aClass46Array1942 = class46s;
                                    continue;
                                }
                                if (Class300.aBoolean3819
                                        && Class127_Sub1.aBoolean8386) {
                                    int i_29_ = (Class258_Sub4
                                            .aClass373_8552
                                            .method3597(true)
                                            - -i_26_);
                                    int i_30_ = (Class258_Sub4
                                            .aClass373_8552
                                            .method3594((byte) 101)
                                            + i_27_);
                                    i_29_ -= Class318_Sub4.anInt6411;
                                    i_30_ -= Class219.anInt2872;
                                    if (Class348_Sub40_Sub37.anInt9461 > i_29_)
                                        i_29_ = Class348_Sub40_Sub37.anInt9461;
                                    if (i_30_ < Class40.anInt558)
                                        i_30_ = Class40.anInt558;
                                    if (((Class46) class46).anInt709 + i_29_
                                            > ((((Class46) Class331.aClass46_4130)
                                            .anInt709)
                                            + Class348_Sub40_Sub37.anInt9461))
                                        i_29_ = (-((Class46) class46).anInt709
                                                + ((Class348_Sub40_Sub37
                                                .anInt9461)
                                                + (((Class46)
                                                Class331.aClass46_4130)
                                                .anInt709)));
                                    if (i_30_ + ((Class46) class46).anInt789
                                            > (((Class46) Class331.aClass46_4130)
                                            .anInt789) + Class40.anInt558)
                                        i_30_
                                                = (-((Class46) class46).anInt789
                                                + (Class40.anInt558
                                                - -(((Class46)
                                                Class331.aClass46_4130)
                                                .anInt789)));
                                    i_24_ = i_29_;
                                    i_25_ = i_30_;
                                }
                                if ((InputStream_Sub1.anInt78 ^ 0xffffffff)
                                        == (((Class46) class46).anInt797
                                        ^ 0xffffffff))
                                    i_28_ = 128;
                            }
                            int i_31_;
                            int i_32_;
                            int i_33_;
                            int i_34_;
                            if ((((Class46) class46).anInt774 ^ 0xffffffff)
                                    != -3) {
                                int i_35_
                                        = i_24_ - -((Class46) class46).anInt709;
                                int i_36_
                                        = i_25_ + ((Class46) class46).anInt789;
                                if ((((Class46) class46).anInt774 ^ 0xffffffff)
                                        == -10) {
                                    i_36_++;
                                    i_35_++;
                                }
                                i_31_ = i < i_24_ ? i_24_ : i;
                                i_32_ = ((i_25_ ^ 0xffffffff) >= (i_12_
                                        ^ 0xffffffff)
                                        ? i_12_ : i_25_);
                                i_34_ = i_14_ <= i_35_ ? i_14_ : i_35_;
                                i_33_ = ((i_36_ ^ 0xffffffff) > (i_17_
                                        ^ 0xffffffff)
                                        ? i_36_ : i_17_);
                            } else {
                                i_31_ = i;
                                i_32_ = i_12_;
                                i_33_ = i_17_;
                                i_34_ = i_14_;
                            }
                            if (i_31_ < i_34_ && i_32_ < i_33_) {
                                if ((((Class46) class46).anInt765 ^ 0xffffffff)
                                        != -1) {
                                    if (((((Class46) class46).anInt765
                                            ^ 0xffffffff)
                                            == (Class239_Sub10.anInt5943
                                            ^ 0xffffffff))
                                            || ((Class312.anInt3932 ^ 0xffffffff)
                                            == (((Class46) class46).anInt765
                                            ^ 0xffffffff))) {
                                        Class5_Sub2.method198(class46, false,
                                                i_25_, i_24_);
                                        if (!Class59_Sub1.aBoolean5300) {
                                            OutputStream_Sub1.method132
                                                    (124,
                                                            (Class312.anInt3932
                                                                    == (((Class46) class46)
                                                                    .anInt765)),
                                                            ((Class46) class46).anInt709,
                                                            i_24_,
                                                            ((Class46) class46).anInt789,
                                                            i_25_);
                                            Class348_Sub8.aHa6654
                                                    .KA(i, i_12_, i_14_, i_17_);
                                        }
                                        Class152.aBooleanArray2076[i_23_]
                                                = true;
                                        continue;
                                    }
                                    if ((Class290.anInt3717 ^ 0xffffffff)
                                            == (((Class46) class46).anInt765
                                            ^ 0xffffffff)) {
                                        if (class46.method425((Class348_Sub8
                                                        .aHa6654),
                                                (byte) 8)
                                                != null) {
                                            Class369_Sub1.method3570(false);
                                            Class107.method1007(class46,
                                                    (Class348_Sub8
                                                            .aHa6654),
                                                    i_24_, i_25_,
                                                    22960);
                                            Class268.aBooleanArray3438[i_23_]
                                                    = true;
                                            Class348_Sub8.aHa6654
                                                    .KA(i, i_12_, i_14_, i_17_);
                                            if (Class59_Sub1.aBoolean5300) {
                                                if (bool)
                                                    Class338.method2663(-5590,
                                                            i_19_,
                                                            i_21_,
                                                            i_20_,
                                                            i_22_);
                                                else
                                                    Class54.method503
                                                            (i_22_, i_19_,
                                                                    (byte) -74, i_21_,
                                                                    i_20_);
                                            }
                                        }
                                        continue;
                                    }
                                    if ((Class239_Sub11.anInt5951 ^ 0xffffffff)
                                            == (((Class46) class46).anInt765
                                            ^ 0xffffffff)) {
                                        if (class46.method425((Class348_Sub8
                                                        .aHa6654),
                                                (byte) 26)
                                                != null) {
                                            Class18.method271(i_25_, class46,
                                                    (byte) -98,
                                                    i_24_);
                                            Class268.aBooleanArray3438[i_23_]
                                                    = true;
                                            Class348_Sub8.aHa6654
                                                    .KA(i, i_12_, i_14_, i_17_);
                                            if (Class59_Sub1.aBoolean5300) {
                                                if (!bool)
                                                    Class54.method503
                                                            (i_22_, i_19_,
                                                                    (byte) -74, i_21_,
                                                                    i_20_);
                                                else
                                                    Class338.method2663(-5590,
                                                            i_19_,
                                                            i_21_,
                                                            i_20_,
                                                            i_22_);
                                            }
                                        }
                                        continue;
                                    }
                                    if ((Class348_Sub45.anInt7102 ^ 0xffffffff)
                                            == (((Class46) class46).anInt765
                                            ^ 0xffffffff)) {
                                        Class318_Sub1_Sub3_Sub4.method2464
                                                ((byte) -7, i_24_,
                                                        ((Class46) class46).anInt709,
                                                        ((Class46) class46).anInt789,
                                                        Class348_Sub8.aHa6654, i_25_,
                                                        Class348_Sub40_Sub4.aD9113);
                                        Class152.aBooleanArray2076[i_23_]
                                                = true;
                                        Class348_Sub8.aHa6654.KA(i, i_12_,
                                                i_14_, i_17_);
                                        continue;
                                    }
                                    if (Class218.anInt2861
                                            == ((Class46) class46).anInt765) {
                                        Class361.method3498
                                                (((Class46) class46).anInt789,
                                                        Class348_Sub8.aHa6654, i_24_,
                                                        ((Class46) class46).anInt709,
                                                        true, i_25_);
                                        Class152.aBooleanArray2076[i_23_]
                                                = true;
                                        Class348_Sub8.aHa6654.KA(i, i_12_,
                                                i_14_, i_17_);
                                        continue;
                                    }
                                    if ((((Class46) class46).anInt765
                                            ^ 0xffffffff)
                                            == (Class136.anInt4793 ^ 0xffffffff)) {
                                        if (Class298.aBoolean3811
                                                || Class188.aBoolean2514) {
                                            int i_37_
                                                    = (((Class46) class46).anInt709
                                                    + i_24_);
                                            int i_38_ = 15 + i_25_;
                                            if (Class59_Sub1.aBoolean5300) {
                                                if (!bool)
                                                    Class54.method503
                                                            (i_22_, i_19_,
                                                                    (byte) -74, i_21_,
                                                                    i_20_);
                                                else
                                                    Class338.method2663(-5590,
                                                            i_19_,
                                                            i_21_,
                                                            i_20_,
                                                            i_22_);
                                            }
                                            if (Class298.aBoolean3811) {
                                                int i_39_ = -256;
                                                if ((Class239_Sub5.anInt5891
                                                        ^ 0xffffffff)
                                                        > -21)
                                                    i_39_ = -65536;
                                                Applet_Sub1.aClass324_20
                                                        .method2569
                                                                ("Fps:" + (Class239_Sub5
                                                                                .anInt5891),
                                                                        i_38_, i_39_, i_37_, -128,
                                                                        -1);
                                                i_38_ += 15;
                                                Runtime runtime
                                                        = Runtime.getRuntime();
                                                int i_40_
                                                        = (int) (((runtime
                                                        .totalMemory
                                                                ())
                                                        + -(runtime
                                                        .freeMemory
                                                                ()))
                                                        / 1024L);
                                                int i_41_ = -256;
                                                if (i_40_ > 98304) {
                                                    i_41_ = -65536;
                                                    if (Class161
                                                            .aBoolean2151) {
                                                        Class46.method427(-35);
                                                        for (int i_42_ = 0;
                                                             i_42_ < 10;
                                                             i_42_++)
                                                            System.gc();
                                                        i_40_
                                                                = (int) (((runtime
                                                                .totalMemory
                                                                        ())
                                                                - (runtime
                                                                .freeMemory
                                                                        ()))
                                                                / 1024L);
                                                        if (i_40_ > 65536)
                                                            Class59.method544
                                                                    ("WARNING: Memory usage over 64MB! Please inform whoever is responsible for the content/area you are using/in.",
                                                                            false, 4);
                                                    }
                                                }
                                                Applet_Sub1.aClass324_20
                                                        .method2569
                                                                ("Mem:" + i_40_ + "k",
                                                                        i_38_, i_41_, i_37_, -124,
                                                                        -1);
                                                i_38_ += 15;
                                                Applet_Sub1.aClass324_20
                                                        .method2569
                                                                (("In:"
                                                                                + Class264.anInt3372
                                                                                + "B/s Out:"
                                                                                + (Class348_Sub48
                                                                                .anInt7134)
                                                                                + "B/s"),
                                                                        i_38_, -256, i_37_, -127,
                                                                        -1);
                                                i_38_ += 15;
                                                int i_43_ = (Class348_Sub8
                                                        .aHa6654.E()
                                                        / 1024);
                                                Applet_Sub1.aClass324_20
                                                        .method2569
                                                                ("Offheap:" + i_43_ + "k",
                                                                        i_38_,
                                                                        (i_43_ <= 65536 ? -256
                                                                                : -65536),
                                                                        i_37_, -125, -1);
                                                i_38_ += 15;
                                                int i_44_ = 0;
                                                int i_45_ = 0;
                                                int i_46_ = 0;
                                                for (int i_47_ = 0;
                                                     ((i_47_ ^ 0xffffffff)
                                                             > -38);
                                                     i_47_++) {
                                                    if ((Class13
                                                            .aClass314_Sub1Array223
                                                            [i_47_])
                                                            != null) {
                                                        i_44_
                                                                += (Class13
                                                                .aClass314_Sub1Array223
                                                                [i_47_]
                                                                .method2345
                                                                        (0));
                                                        i_45_
                                                                += (Class13
                                                                .aClass314_Sub1Array223
                                                                [i_47_]
                                                                .method2351
                                                                        (0));
                                                        i_46_
                                                                += (Class13
                                                                .aClass314_Sub1Array223
                                                                [i_47_]
                                                                .method2341
                                                                        (24940));
                                                    }
                                                }
                                                int i_48_
                                                        = i_46_ * 100 / i_44_;
                                                int i_49_
                                                        = 10000 * i_45_ / i_44_;
                                                String string
                                                        = ("Cache:"
                                                        + (Class357.method3486
                                                        (2, true, 0,
                                                                (long) i_49_,
                                                                16980))
                                                        + "% (" + i_48_ + "%)");
                                                Class240.aClass324_4684
                                                        .method2569
                                                                (string, i_38_, -256,
                                                                        i_37_, -127, -1);
                                                i_38_ += 12;
                                            }
                                            if ((Class313.anInt3936
                                                    ^ 0xffffffff)
                                                    < -1)
                                                Class240.aClass324_4684
                                                        .method2569
                                                                (("Particles: "
                                                                                + (Class318_Sub1_Sub5
                                                                                .anInt8780)
                                                                                + " / "
                                                                                + Class313.anInt3936),
                                                                        i_38_, -256, i_37_, -121,
                                                                        -1);
                                            i_38_ += 12;
                                            if (Class188.aBoolean2514) {
                                                Class240.aClass324_4684
                                                        .method2569
                                                                (("Polys: "
                                                                                + Class348_Sub8
                                                                                .aHa6654.I()
                                                                                + " Models: "
                                                                                + Class348_Sub8
                                                                                .aHa6654.M()),
                                                                        i_38_, -256, i_37_, -127,
                                                                        -1);
                                                i_38_ += 12;
                                                Class240.aClass324_4684
                                                        .method2569
                                                                (("Ls: "
                                                                                + Class177.anInt4666
                                                                                + " La: "
                                                                                + Class86.anInt1482
                                                                                + " NPC: "
                                                                                + Class227.anInt2968
                                                                                + " Pl: "
                                                                                + za_Sub1.anInt9776),
                                                                        i_38_, -256, i_37_, -122,
                                                                        -1);
                                                Class110_Sub1
                                                        .method1042((byte) -123);
                                                i_38_ += 12;
                                            }
                                            Class152.aBooleanArray2076[i_23_]
                                                    = true;
                                        }
                                        continue;
                                    }
                                }
                                if ((((Class46) class46).anInt774 ^ 0xffffffff)
                                        == -1) {
                                    if (((Class372.anInt4532 ^ 0xffffffff)
                                            == (((Class46) class46).anInt765
                                            ^ 0xffffffff))
                                            && Class348_Sub8.aHa6654.method3666())
                                        Class348_Sub8.aHa6654.method3658
                                                (i_24_, i_25_,
                                                        ((Class46) class46).anInt709,
                                                        ((Class46) class46).anInt789);
                                    method3064
                                            (i_31_,
                                                    -((Class46) class46).anInt755 + i_25_,
                                                    bool,
                                                    i_24_ - ((Class46) class46).anInt747,
                                                    i_32_, i_23_, i_34_, false, class46s,
                                                    ((Class46) class46).anInt830, i_33_);
                                    if (((Class46) class46).aClass46Array798
                                            != null)
                                        method3064(i_31_,
                                                -(((Class46) class46)
                                                        .anInt755) + i_25_,
                                                bool,
                                                i_24_ - (((Class46) class46)
                                                        .anInt747),
                                                i_32_, i_23_, i_34_, false,
                                                (((Class46) class46)
                                                        .aClass46Array798),
                                                (((Class46) class46)
                                                        .anInt830),
                                                i_33_);
                                    Class348_Sub41 class348_sub41
                                            = ((Class348_Sub41)
                                            (Class125.aClass356_4915.method3480
                                                    ((long) (((Class46) class46)
                                                                    .anInt830),
                                                            -6008)));
                                    if (class348_sub41 != null)
                                        Class159.method1252(i_25_,
                                                (((Class348_Sub41)
                                                        class348_sub41)
                                                        .anInt7050),
                                                i_32_, i_23_,
                                                i_24_, i_34_,
                                                i_33_, (byte) 60,
                                                i_31_);
                                    if (((Class372.anInt4532 ^ 0xffffffff)
                                            == (((Class46) class46).anInt765
                                            ^ 0xffffffff))
                                            && Class348_Sub8.aHa6654.method3666())
                                        Class348_Sub8.aHa6654.method3698();
                                    Class348_Sub8.aHa6654.KA(i, i_12_, i_14_,
                                            i_17_);
                                }
                                if (Class175.aBooleanArray2326[i_23_]
                                        || (ha_Sub3.anInt8045 ^ 0xffffffff) < -2) {
                                    if (((Class46) class46).anInt774 == 3) {
                                        if (i_28_ == 0) {
                                            if (((Class46) class46)
                                                    .aBoolean810)
                                                Class348_Sub8.aHa6654.aa
                                                        (i_24_, i_25_,
                                                                (((Class46) class46)
                                                                        .anInt709),
                                                                (((Class46) class46)
                                                                        .anInt789),
                                                                (((Class46) class46)
                                                                        .anInt749),
                                                                0);
                                            else
                                                Class348_Sub8.aHa6654
                                                        .method3628
                                                                (i_24_, i_25_,
                                                                        (((Class46) class46)
                                                                                .anInt709),
                                                                        (((Class46) class46)
                                                                                .anInt789),
                                                                        (((Class46) class46)
                                                                                .anInt749),
                                                                        0);
                                        } else if (!((Class46) class46)
                                                .aBoolean810)
                                            Class348_Sub8.aHa6654.method3628
                                                    (i_24_, i_25_,
                                                            ((Class46) class46).anInt709,
                                                            ((Class46) class46).anInt789,
                                                            (0xffffff & ((Class46)
                                                                    class46).anInt749
                                                                    | (-(i_28_ & 0xff) + 255
                                                                    << 245198520)),
                                                            1);
                                        else
                                            Class348_Sub8.aHa6654.aa
                                                    (i_24_, i_25_,
                                                            ((Class46) class46).anInt709,
                                                            ((Class46) class46).anInt789,
                                                            (0xffffff & ((Class46)
                                                                    class46).anInt749
                                                                    | (-(0xff & i_28_) + 255
                                                                    << 1773948952)),
                                                            1);
                                        if (Class59_Sub1.aBoolean5300) {
                                            if (bool)
                                                Class338.method2663(-5590,
                                                        i_19_,
                                                        i_21_,
                                                        i_20_,
                                                        i_22_);
                                            else
                                                Class54.method503(i_22_, i_19_,
                                                        (byte) -74,
                                                        i_21_,
                                                        i_20_);
                                        }
                                    } else if ((((Class46) class46).anInt774
                                            ^ 0xffffffff)
                                            == -5) {
                                        Class324 class324
                                                = class46.method426((Class348_Sub8
                                                        .aHa6654),
                                                (byte) 68);
                                        if (class324 == null) {
                                            if (Class348_Sub42_Sub13
                                                    .aBoolean9616)
                                                Class251.method1916(-9343,
                                                        class46);
                                        } else {
                                            int i_50_
                                                    = ((Class46) class46).anInt749;
                                            String string
                                                    = (((Class46) class46)
                                                    .aString792);
                                            if (((Class46) class46).anInt812
                                                    != -1) {
                                                Class213 class213
                                                        = (Exception_Sub1
                                                        .aClass255_112
                                                        .method1940
                                                                (-67,
                                                                        (((Class46) class46)
                                                                                .anInt812)));
                                                string = (((Class213) class213)
                                                        .aString2795);
                                                if (string == null)
                                                    string = "null";
                                                if (((((Class213) class213)
                                                        .anInt2820) == 1
                                                        || ((((Class46) class46)
                                                        .anInt781)
                                                        ^ 0xffffffff) != -2)
                                                        && ((((Class46) class46)
                                                        .anInt781)
                                                        ^ 0xffffffff) != 0)
                                                    string
                                                            = ("<col=ff9040>"
                                                            + string
                                                            + "</col> x"
                                                            + (Class37.method356
                                                            (-127,
                                                                    (((Class46)
                                                                            class46)
                                                                            .anInt781))));
                                            }
                                            if (((Class46) class46).anInt806
                                                    != -1) {
                                                string
                                                        = (Class286_Sub4.method2157
                                                        ((((Class46) class46)
                                                                        .anInt806),
                                                                -1431655765));
                                                if (string == null)
                                                    string = "";
                                            }
                                            if (Class49.aClass46_4730
                                                    == class46) {
                                                string
                                                        = (Class274
                                                        .aClass274_3514
                                                        .method2063
                                                                ((Class348_Sub33
                                                                                .anInt6967),
                                                                        544));
                                                i_50_ = (((Class46) class46)
                                                        .anInt749);
                                            }
                                            if (Class318_Sub1_Sub3_Sub2
                                                    .aBoolean10046)
                                                Class348_Sub8.aHa6654.T
                                                        (i_24_, i_25_,
                                                                (((Class46) class46)
                                                                        .anInt709) + i_24_,
                                                                (((Class46) class46)
                                                                        .anInt789) + i_25_);
                                            class324.method2568
                                                    (null,
                                                            ((Class46) class46).anInt789,
                                                            (byte) -77, null, 0,
                                                            Class113.aClass105Array1744,
                                                            (-(i_28_ & 0xff) + 255
                                                                    << 312621368) | i_50_,
                                                            i_25_,
                                                            ((Class46) class46).anInt709,
                                                            ((Class46) class46).anInt700,
                                                            string, 0, i_24_,
                                                            ((Class46) class46).anInt762,
                                                            (!(((Class46) class46)
                                                                    .aBoolean769)
                                                                    ? -1
                                                                    : (-(0xff & i_28_) + 255
                                                                    << -1082128904)),
                                                            ((Class46) class46).anInt773,
                                                            ((Class46) class46).anInt673);
                                            if (Class318_Sub1_Sub3_Sub2
                                                    .aBoolean10046)
                                                Class348_Sub8.aHa6654.KA
                                                        (i, i_12_, i_14_, i_17_);
                                            if ((string.trim().length()
                                                    ^ 0xffffffff)
                                                    < -1) {
                                                if (Class318_Sub1_Sub3_Sub2
                                                        .aBoolean10046) {
                                                    if (Class59_Sub1
                                                            .aBoolean5300) {
                                                        if (!bool)
                                                            Class54.method503
                                                                    (i_22_, i_19_,
                                                                            (byte) -74,
                                                                            i_21_, i_20_);
                                                        else
                                                            Class338.method2663
                                                                    (-5590, i_19_,
                                                                            i_21_, i_20_,
                                                                            i_22_);
                                                    }
                                                } else {
                                                    Class143 class143
                                                            = (Class135.method1151
                                                            (-25411,
                                                                    (Class348_Sub8
                                                                            .aHa6654),
                                                                    (((Class46)
                                                                            class46)
                                                                            .anInt702)));
                                                    int i_51_
                                                            = (class143.method1187
                                                            (string, bool_15_,
                                                                    ((Class46)
                                                                            class46).anInt709,
                                                                    (Class113
                                                                            .aClass105Array1744)));
                                                    int i_52_
                                                            = (class143.method1185
                                                            ((Class113
                                                                            .aClass105Array1744),
                                                                    0,
                                                                    ((Class46)
                                                                            class46).anInt673,
                                                                    ((Class46)
                                                                            class46).anInt709,
                                                                    string));
                                                    if (Class59_Sub1
                                                            .aBoolean5300) {
                                                        if (!bool)
                                                            Class54.method503
                                                                    (i_25_ + i_52_,
                                                                            i_24_,
                                                                            (byte) -74,
                                                                            (i_24_
                                                                                    - -i_51_),
                                                                            i_25_);
                                                        else
                                                            Class338.method2663
                                                                    (-5590, i_24_,
                                                                            i_51_ + i_24_,
                                                                            i_25_,
                                                                            (i_25_
                                                                                    + i_52_));
                                                    }
                                                }
                                            }
                                        }
                                    } else if ((((Class46) class46).anInt774
                                            ^ 0xffffffff)
                                            == -6) {
                                        if (((Class46) class46).anInt705 >= 0)
                                            class46.method444
                                                    (bool_15_,
                                                            Class123.aClass25_1813,
                                                            Class30.aClass84_413)
                                                    .method2293
                                                            (0, Class348_Sub8.aHa6654,
                                                                    (byte) -35, i_24_,
                                                                    ((Class46) class46).anInt709,
                                                                    i_25_,
                                                                    (((Class46) class46).anInt835
                                                                            << -1331349661),
                                                                    (((Class46) class46).anInt759
                                                                            << 61800355),
                                                                    0,
                                                                    ((Class46) class46).anInt789);
                                        else {
                                            Class105 class105;
                                            if (((Class46) class46).anInt812
                                                    != -1) {
                                                Class154 class154
                                                        = ((((Class46) class46)
                                                        .aBoolean720)
                                                        ? (((Class318_Sub1_Sub3_Sub3_Sub2)
                                                        (Class132
                                                                .aClass318_Sub1_Sub3_Sub3_Sub2_1907))
                                                        .aClass154_10536)
                                                        : null);
                                                class105
                                                        = (Exception_Sub1
                                                        .aClass255_112
                                                        .method1941
                                                                ((((Class46) class46)
                                                                                .anInt672),
                                                                        (byte) -74,
                                                                        (((Class46) class46)
                                                                                .anInt812),
                                                                        (((Class46) class46)
                                                                                .anInt781),
                                                                        (~0xffffff
                                                                                | (((Class46) class46)
                                                                                .anInt809)),
                                                                        (((Class46) class46)
                                                                                .anInt678),
                                                                        Class348_Sub8.aHa6654,
                                                                        class154));
                                            } else if (((((Class46) class46)
                                                    .anInt806)
                                                    ^ 0xffffffff)
                                                    == 0)
                                                class105
                                                        = (class46.method443
                                                        (Class348_Sub8.aHa6654,
                                                                (byte) -57));
                                            else
                                                class105
                                                        = (Class299_Sub1_Sub2
                                                        .method2263
                                                                (Class348_Sub8.aHa6654,
                                                                        0,
                                                                        (((Class46) class46)
                                                                                .anInt806)));
                                            if (class105 == null) {
                                                if (Class348_Sub42_Sub13
                                                        .aBoolean9616)
                                                    Class251.method1916
                                                            (-9343, class46);
                                            } else {
                                                int i_53_
                                                        = class105.method966();
                                                int i_54_
                                                        = class105.method980();
                                                int i_55_
                                                        = ((-(i_28_ & 0xff) + 255
                                                        << 1570074200)
                                                        | (((((Class46) class46)
                                                        .anInt749)
                                                        ^ 0xffffffff) != -1
                                                        ? (((Class46)
                                                        class46).anInt749
                                                        & 0xffffff)
                                                        : 16777215));
                                                if (((Class46) class46)
                                                        .aBoolean697) {
                                                    Class348_Sub8.aHa6654.T
                                                            (i_24_, i_25_,
                                                                    i_24_ - -(((Class46)
                                                                            class46)
                                                                            .anInt709),
                                                                    (((Class46) class46)
                                                                            .anInt789) + i_25_);
                                                    if (((((Class46) class46)
                                                            .anInt828)
                                                            ^ 0xffffffff)
                                                            != -1) {
                                                        int i_56_
                                                                = ((i_53_ - 1
                                                                + (((Class46)
                                                                class46)
                                                                .anInt709))
                                                                / i_53_);
                                                        int i_57_
                                                                = ((i_54_ - 1
                                                                + (((Class46)
                                                                class46)
                                                                .anInt789))
                                                                / i_54_);
                                                        for (int i_58_ = 0;
                                                             i_58_ < i_56_;
                                                             i_58_++) {
                                                            for (int i_59_ = 0;
                                                                 i_59_ < i_57_;
                                                                 i_59_++) {
                                                                if ((((Class46)
                                                                        class46)
                                                                        .anInt749)
                                                                        == 0)
                                                                    class105
                                                                            .method981
                                                                                    ((((float) i_53_
                                                                                                    / 2.0F)
                                                                                                    + (float) (i_24_ - -(i_53_ * i_58_))),
                                                                                            (((float) i_54_
                                                                                                    / 2.0F)
                                                                                                    + (float) (i_59_ * i_54_ + i_25_)),
                                                                                            4096,
                                                                                            (((Class46)
                                                                                                    class46)
                                                                                                    .anInt828));
                                                                else
                                                                    class105
                                                                            .method977
                                                                                    ((((float) i_53_
                                                                                                    / 2.0F)
                                                                                                    + (float) (i_53_ * i_58_ + i_24_)),
                                                                                            (((float) i_54_
                                                                                                    / 2.0F)
                                                                                                    + (float) (i_25_ + i_59_ * i_54_)),
                                                                                            4096,
                                                                                            (((Class46)
                                                                                                    class46)
                                                                                                    .anInt828),
                                                                                            0,
                                                                                            i_55_,
                                                                                            1);
                                                            }
                                                        }
                                                    } else if ((((Class46)
                                                            class46)
                                                            .anInt749) != 0
                                                            || ((i_28_
                                                            ^ 0xffffffff)
                                                            != -1))
                                                        class105.method965
                                                                (i_24_, i_25_,
                                                                        (((Class46)
                                                                                class46)
                                                                                .anInt709),
                                                                        (((Class46)
                                                                                class46)
                                                                                .anInt789),
                                                                        0, i_55_, 1);
                                                    else
                                                        class105.method972
                                                                (i_24_, i_25_,
                                                                        (((Class46)
                                                                                class46)
                                                                                .anInt709),
                                                                        (((Class46)
                                                                                class46)
                                                                                .anInt789));
                                                    Class348_Sub8.aHa6654.KA
                                                            (i, i_12_, i_14_,
                                                                    i_17_);
                                                } else if ((((Class46) class46)
                                                        .anInt749) == 0
                                                        && i_28_ == 0) {
                                                    if (((((Class46) class46)
                                                            .anInt828)
                                                            ^ 0xffffffff)
                                                            != -1)
                                                        class105.method981
                                                                (((float) i_24_
                                                                                + ((float) (((Class46)
                                                                                class46)
                                                                                .anInt709)
                                                                                / 2.0F)),
                                                                        (((float) (((Class46)
                                                                                class46)
                                                                                .anInt789)
                                                                                / 2.0F)
                                                                                + (float) i_25_),
                                                                        (4096
                                                                                * (((Class46)
                                                                                class46)
                                                                                .anInt709)
                                                                                / i_53_),
                                                                        (((Class46)
                                                                                class46)
                                                                                .anInt828));
                                                    else if ((i_53_
                                                            == (((Class46)
                                                            class46)
                                                            .anInt709))
                                                            && ((((Class46)
                                                            class46)
                                                            .anInt789)
                                                            == i_54_))
                                                        class105.method974
                                                                (i_24_, i_25_);
                                                    else
                                                        class105.method973
                                                                (i_24_, i_25_,
                                                                        (((Class46)
                                                                                class46)
                                                                                .anInt709),
                                                                        (((Class46)
                                                                                class46)
                                                                                .anInt789));
                                                } else if ((((Class46)
                                                        class46).anInt828
                                                        ^ 0xffffffff)
                                                        != -1)
                                                    class105.method977
                                                            (((float) i_24_
                                                                            + ((float) (((Class46)
                                                                            class46)
                                                                            .anInt709)
                                                                            / 2.0F)),
                                                                    ((float) i_25_
                                                                            + ((float) (((Class46)
                                                                            class46)
                                                                            .anInt789)
                                                                            / 2.0F)),
                                                                    (4096
                                                                            * ((Class46)
                                                                            class46).anInt709
                                                                            / i_53_),
                                                                    (((Class46) class46)
                                                                            .anInt828),
                                                                    0, i_55_, 1);
                                                else if (((i_53_ ^ 0xffffffff)
                                                        == ((((Class46)
                                                        class46)
                                                        .anInt709)
                                                        ^ 0xffffffff))
                                                        && (((Class46)
                                                        class46).anInt789
                                                        == i_54_))
                                                    class105.method964(i_24_,
                                                            i_25_,
                                                            0,
                                                            i_55_,
                                                            1);
                                                else
                                                    class105.method970
                                                            (i_24_, i_25_,
                                                                    (((Class46) class46)
                                                                            .anInt709),
                                                                    (((Class46) class46)
                                                                            .anInt789),
                                                                    0, i_55_, 1);
                                            }
                                        }
                                        if (Class59_Sub1.aBoolean5300) {
                                            if (!bool)
                                                Class54.method503(i_22_, i_19_,
                                                        (byte) -74,
                                                        i_21_,
                                                        i_20_);
                                            else
                                                Class338.method2663(-5590,
                                                        i_19_,
                                                        i_21_,
                                                        i_20_,
                                                        i_22_);
                                        }
                                    } else if (((Class46) class46).anInt774
                                            == 6) {
                                        Class358.method3489(115);
                                        Class64 class64 = null;
                                        int i_60_ = 0;
                                        if ((((Class46) class46).anInt812
                                                ^ 0xffffffff)
                                                != 0) {
                                            Class213 class213
                                                    = (Exception_Sub1
                                                    .aClass255_112
                                                    .method1940
                                                            (103, (((Class46) class46)
                                                                    .anInt812)));
                                            if (class213 != null) {
                                                class213
                                                        = (class213.method1560
                                                        ((((Class46) class46)
                                                                        .anInt781),
                                                                (byte) 97));
                                                Class17 class17
                                                        = ((((Class46) class46)
                                                        .anInt699) == -1
                                                        ? null
                                                        : (Class10
                                                        .aClass87_191
                                                        .method835
                                                                ((((Class46) class46)
                                                                                .anInt699),
                                                                        7)));
                                                Class154 class154
                                                        = (!(((Class46) class46)
                                                        .aBoolean720)
                                                        ? null
                                                        : (((Class318_Sub1_Sub3_Sub3_Sub2)
                                                        (Class132
                                                                .aClass318_Sub1_Sub3_Sub3_Sub2_1907))
                                                        .aClass154_10536));
                                                class64
                                                        = (class213.method1559
                                                        (class154, class17,
                                                                Class348_Sub8.aHa6654,
                                                                2048,
                                                                (((Class46) class46)
                                                                        .anInt841),
                                                                1,
                                                                (((Class46) class46)
                                                                        .anInt795),
                                                                (byte) 88,
                                                                (((Class46) class46)
                                                                        .anInt730)));
                                                if (class64 != null)
                                                    i_60_ = (-class64.fa()
                                                            >> 1559581057);
                                                else
                                                    Class251.method1916
                                                            (-9343, class46);
                                            }
                                        } else if (((((Class46) class46)
                                                .anInt770)
                                                ^ 0xffffffff)
                                                == -6) {
                                            int i_61_
                                                    = ((Class46) class46).anInt753;
                                            if ((i_61_ ^ 0xffffffff) <= -1
                                                    && ((i_61_ ^ 0xffffffff)
                                                    > -2049)) {
                                                Class318_Sub1_Sub3_Sub3_Sub2 class318_sub1_sub3_sub3_sub2
                                                        = (Class294
                                                        .aClass318_Sub1_Sub3_Sub3_Sub2Array5058
                                                        [i_61_]);
                                                Class17 class17
                                                        = (((((Class46) class46)
                                                        .anInt699)
                                                        ^ 0xffffffff) == 0
                                                        ? null
                                                        : (Class10
                                                        .aClass87_191
                                                        .method835
                                                                ((((Class46) class46)
                                                                                .anInt699),
                                                                        7)));
                                                if ((class318_sub1_sub3_sub3_sub2
                                                        != null)
                                                        && ((i_61_
                                                        == (Class348_Sub42_Sub11
                                                        .anInt9591))
                                                        || (((Class318_Sub1_Sub3_Sub1
                                                        .method2418
                                                                ((((Class318_Sub1_Sub3_Sub3_Sub2)
                                                                                class318_sub1_sub3_sub3_sub2)
                                                                                .aString10544),
                                                                        (byte) -50))
                                                        ^ 0xffffffff)
                                                        == ((((Class46)
                                                        class46)
                                                        .anInt779)
                                                        ^ 0xffffffff))))
                                                    class64
                                                            = (((Class318_Sub1_Sub3_Sub3_Sub2)
                                                            class318_sub1_sub3_sub3_sub2)
                                                            .aClass154_10536
                                                            .method1226
                                                                    ((Class318_Sub1_Sub3_Sub3
                                                                                    .aClass170_10209),
                                                                            null, null, true,
                                                                            (Exception_Sub1
                                                                                    .aClass255_112),
                                                                            0, class17,
                                                                            ((Class46)
                                                                                    class46).anInt730,
                                                                            true, -1, null,
                                                                            2048,
                                                                            (Class348_Sub40_Sub25
                                                                                    .aClass150_9342),
                                                                            ((Class46)
                                                                                    class46).anInt841,
                                                                            (Class348_Sub8
                                                                                    .aHa6654),
                                                                            (Class189
                                                                                    .aClass278_2529),
                                                                            (Class10
                                                                                    .aClass87_191),
                                                                            0,
                                                                            ((Class46)
                                                                                    class46).anInt795,
                                                                            0,
                                                                            (Class64_Sub3
                                                                                    .aClass261_5558)));
                                            }
                                        } else if (((((Class46) class46)
                                                .anInt770)
                                                ^ 0xffffffff) != -9
                                                && (((Class46) class46)
                                                .anInt770) != 9) {
                                            if (((Class46) class46).anInt699
                                                    != -1) {
                                                Class17 class17
                                                        = (Class10.aClass87_191
                                                        .method835
                                                                ((((Class46) class46)
                                                                                .anInt699),
                                                                        7));
                                                class64
                                                        = (class46.method430
                                                        ((Class348_Sub40_Sub25
                                                                        .aClass150_9342),
                                                                Class10.aClass87_191,
                                                                2048,
                                                                Class348_Sub8.aHa6654,
                                                                (((Class46) class46)
                                                                        .anInt795),
                                                                (((Class46) class46)
                                                                        .anInt841),
                                                                (Exception_Sub1
                                                                        .aClass255_112),
                                                                (Class318_Sub1_Sub3_Sub3
                                                                        .aClass170_10209),
                                                                255,
                                                                (((Class318_Sub1_Sub3_Sub3_Sub2)
                                                                        (Class132
                                                                                .aClass318_Sub1_Sub3_Sub3_Sub2_1907))
                                                                        .aClass154_10536),
                                                                class17,
                                                                (Class64_Sub3
                                                                        .aClass261_5558),
                                                                (Class189
                                                                        .aClass278_2529),
                                                                (((Class46) class46)
                                                                        .anInt730)));
                                                if (class64 == null
                                                        && (Class348_Sub42_Sub13
                                                        .aBoolean9616))
                                                    Class251.method1916
                                                            (-9343, class46);
                                            } else {
                                                class64
                                                        = (class46.method430
                                                        ((Class348_Sub40_Sub25
                                                                        .aClass150_9342),
                                                                Class10.aClass87_191,
                                                                2048,
                                                                Class348_Sub8.aHa6654,
                                                                -1, 0,
                                                                (Exception_Sub1
                                                                        .aClass255_112),
                                                                (Class318_Sub1_Sub3_Sub3
                                                                        .aClass170_10209),
                                                                255,
                                                                (((Class318_Sub1_Sub3_Sub3_Sub2)
                                                                        (Class132
                                                                                .aClass318_Sub1_Sub3_Sub3_Sub2_1907))
                                                                        .aClass154_10536),
                                                                null,
                                                                (Class64_Sub3
                                                                        .aClass261_5558),
                                                                (Class189
                                                                        .aClass278_2529),
                                                                -1));
                                                if (class64 == null
                                                        && (Class348_Sub42_Sub13
                                                        .aBoolean9616))
                                                    Class251.method1916
                                                            (-9343, class46);
                                            }
                                        } else {
                                            Class348_Sub13 class348_sub13
                                                    = (Class258_Sub4.method1974
                                                    ((byte) -123,
                                                            (((Class46) class46)
                                                                    .anInt753),
                                                            false));
                                            Class17 class17
                                                    = (((((Class46) class46)
                                                    .anInt699)
                                                    ^ 0xffffffff) == 0
                                                    ? null
                                                    : (Class10.aClass87_191
                                                    .method835
                                                            ((((Class46) class46)
                                                                            .anInt699),
                                                                    7)));
                                            if (class348_sub13 != null) {
                                                Class154 class154
                                                        = ((((Class46) class46)
                                                        .aBoolean720)
                                                        ? (((Class318_Sub1_Sub3_Sub3_Sub2)
                                                        (Class132
                                                                .aClass318_Sub1_Sub3_Sub3_Sub2_1907))
                                                        .aClass154_10536)
                                                        : null);
                                                class64
                                                        = (class348_sub13
                                                        .method2803
                                                                (class17, class154,
                                                                        (((Class46) class46)
                                                                                .anInt779),
                                                                        (((Class46) class46)
                                                                                .anInt795),
                                                                        (((Class46) class46)
                                                                                .anInt841),
                                                                        (((Class46) class46)
                                                                                .anInt730),
                                                                        2048,
                                                                        Class348_Sub8.aHa6654,
                                                                        (((Class46) class46)
                                                                                .anInt770) == 9,
                                                                        -1));
                                            }
                                        }
                                        if (class64 != null) {
                                            int i_62_;
                                            if (((Class46) class46).anInt796
                                                    > 0)
                                                i_62_ = (((((Class46) class46)
                                                        .anInt709)
                                                        << -1443856247)
                                                        / (((Class46) class46)
                                                        .anInt796));
                                            else
                                                i_62_ = 512;
                                            int i_63_;
                                            if ((((Class46) class46).anInt826
                                                    ^ 0xffffffff)
                                                    >= -1)
                                                i_63_ = 512;
                                            else
                                                i_63_ = (((((Class46) class46)
                                                        .anInt789)
                                                        << -1073852311)
                                                        / (((Class46) class46)
                                                        .anInt826));
                                            int i_64_
                                                    = (i_24_
                                                    - -((((Class46) class46)
                                                    .anInt709)
                                                    / 2));
                                            int i_65_
                                                    = i_25_ + (((Class46) class46)
                                                    .anInt789) / 2;
                                            if (!((Class46) class46)
                                                    .aBoolean784) {
                                                i_64_ += (i_62_ * (((Class46)
                                                        class46)
                                                        .anInt688)
                                                        >> -2040925559);
                                                i_65_ += (i_63_ * (((Class46)
                                                        class46)
                                                        .anInt799)
                                                        >> -1320013655);
                                            }
                                            Class157.aClass101_2123
                                                    .method910();
                                            Class348_Sub8.aHa6654.method3638
                                                    (Class157.aClass101_2123);
                                            Class348_Sub8.aHa6654.DA(i_64_,
                                                    i_65_,
                                                    i_62_,
                                                    i_63_);
                                            Class348_Sub8.aHa6654.ya();
                                            if (((Class46) class46)
                                                    .aBoolean754)
                                                Class348_Sub8.aHa6654.C(false);
                                            if (!((Class46) class46)
                                                    .aBoolean784) {
                                                int i_66_
                                                        = ((((((Class46) class46)
                                                        .anInt716)
                                                        << -1885378654)
                                                        * (Class70
                                                        .anIntArray1207
                                                        [(((Class46)
                                                        class46).anInt757
                                                        << -436072925)]))
                                                        >> 1786282830);
                                                int i_67_
                                                        = (((Class70.anIntArray1204
                                                        [((((Class46) class46)
                                                        .anInt757)
                                                        << -1370449085)])
                                                        * ((((Class46) class46)
                                                        .anInt716)
                                                        << 518286114))
                                                        >> -908346642);
                                                Class50_Sub1.aClass101_5209
                                                        .method902
                                                                (-(((Class46) class46)
                                                                        .anInt717)
                                                                        << 632879075);
                                                Class50_Sub1.aClass101_5209
                                                        .method896
                                                                ((((Class46) class46)
                                                                        .anInt675)
                                                                        << 1285199491);
                                                Class50_Sub1.aClass101_5209
                                                        .method891
                                                                (((((Class46) class46)
                                                                                .anInt808)
                                                                                << -1809254174),
                                                                        (((((Class46) class46)
                                                                                .anInt786)
                                                                                << -1811115454)
                                                                                + (i_66_ + i_60_)),
                                                                        ((((Class46) class46)
                                                                                .anInt786)
                                                                                << 226771746) + i_67_);
                                                Class50_Sub1.aClass101_5209
                                                        .method900
                                                                ((((Class46) class46)
                                                                        .anInt757) << -63363069);
                                            } else {
                                                Class50_Sub1.aClass101_5209
                                                        .method899
                                                                (((Class46) class46)
                                                                        .anInt757);
                                                Class50_Sub1.aClass101_5209
                                                        .method896
                                                                (((Class46) class46)
                                                                        .anInt675);
                                                Class50_Sub1.aClass101_5209
                                                        .method908
                                                                (((Class46) class46)
                                                                        .anInt717);
                                                Class50_Sub1.aClass101_5209
                                                        .method891
                                                                ((((Class46) class46)
                                                                                .anInt688),
                                                                        (((Class46) class46)
                                                                                .anInt799),
                                                                        (((Class46) class46)
                                                                                .anInt787));
                                            }
                                            class46.method437
                                                    (-20154, class64,
                                                            Class348_Sub8.aHa6654,
                                                            Class367_Sub11.anInt7396,
                                                            Class50_Sub1.aClass101_5209);
                                            if (Class318_Sub1_Sub3_Sub2
                                                    .aBoolean10046)
                                                Class348_Sub8.aHa6654.T
                                                        (i_24_, i_25_,
                                                                (((Class46) class46)
                                                                        .anInt709) + i_24_,
                                                                (i_25_
                                                                        + (((Class46) class46)
                                                                        .anInt789)));
                                            if (!((Class46) class46)
                                                    .aBoolean784) {
                                                if (!((Class46) class46)
                                                        .aBoolean689) {
                                                    class64.method615
                                                            ((Class50_Sub1
                                                                            .aClass101_5209),
                                                                    null, 1);
                                                    if ((((Class46) class46)
                                                            .aClass318_Sub10_740)
                                                            != null)
                                                        Class348_Sub8
                                                                .aHa6654.method3684
                                                                (((Class46)
                                                                        class46)
                                                                        .aClass318_Sub10_740
                                                                        .method2539
                                                                                ());
                                                } else
                                                    class64.method608
                                                            ((Class50_Sub1
                                                                            .aClass101_5209),
                                                                    null,
                                                                    ((((Class46) class46)
                                                                            .anInt716)
                                                                            << -1914185502),
                                                                    1);
                                            } else if (((Class46) class46)
                                                    .aBoolean689)
                                                class64.method608
                                                        ((Class50_Sub1
                                                                        .aClass101_5209),
                                                                null,
                                                                (((Class46) class46)
                                                                        .anInt716),
                                                                1);
                                            else {
                                                class64.method615
                                                        ((Class50_Sub1
                                                                        .aClass101_5209),
                                                                null, 1);
                                                if ((((Class46) class46)
                                                        .aClass318_Sub10_740)
                                                        != null)
                                                    Class348_Sub8.aHa6654
                                                            .method3684
                                                                    (((Class46) class46)
                                                                            .aClass318_Sub10_740
                                                                            .method2539());
                                            }
                                            if (Class318_Sub1_Sub3_Sub2
                                                    .aBoolean10046)
                                                Class348_Sub8.aHa6654.KA
                                                        (i, i_12_, i_14_, i_17_);
                                            if (((Class46) class46)
                                                    .aBoolean754)
                                                Class348_Sub8.aHa6654.C(true);
                                        }
                                        if (Class59_Sub1.aBoolean5300) {
                                            if (bool)
                                                Class338.method2663(-5590,
                                                        i_19_,
                                                        i_21_,
                                                        i_20_,
                                                        i_22_);
                                            else
                                                Class54.method503(i_22_, i_19_,
                                                        (byte) -74,
                                                        i_21_,
                                                        i_20_);
                                        }
                                    } else if ((((Class46) class46).anInt774
                                            ^ 0xffffffff)
                                            == -10) {
                                        int i_68_;
                                        int i_69_;
                                        int i_70_;
                                        int i_71_;
                                        if (!((Class46) class46).aBoolean744) {
                                            i_71_
                                                    = i_25_ + (((Class46) class46)
                                                    .anInt789);
                                            i_70_
                                                    = (((Class46) class46).anInt709
                                                    + i_24_);
                                            i_68_ = i_25_;
                                            i_69_ = i_24_;
                                        } else {
                                            i_68_
                                                    = (((Class46) class46).anInt789
                                                    + i_25_);
                                            i_69_ = i_24_;
                                            i_70_
                                                    = (((Class46) class46).anInt709
                                                    + i_24_);
                                            i_71_ = i_25_;
                                        }
                                        if ((((Class46) class46).anInt690
                                                ^ 0xffffffff)
                                                != -2)
                                            Class348_Sub8.aHa6654.method3688
                                                    (i_69_, i_68_, i_70_, i_71_,
                                                            ((Class46) class46).anInt749,
                                                            ((Class46) class46).anInt690,
                                                            0);
                                        else
                                            Class348_Sub8.aHa6654.method3709
                                                    (i_69_, i_68_, i_70_, i_71_,
                                                            ((Class46) class46).anInt749,
                                                            0);
                                        if (Class59_Sub1.aBoolean5300) {
                                            if (bool)
                                                Class338.method2663(-5590,
                                                        i_19_,
                                                        i_21_,
                                                        i_20_,
                                                        i_22_);
                                            else
                                                Class54.method503(i_22_, i_19_,
                                                        (byte) -74,
                                                        i_21_,
                                                        i_20_);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception,
                    ("jia.B(" + i + ',' + i_10_ + ','
                            + bool + ',' + i_11_ + ',' + i_12_
                            + ',' + i_13_ + ',' + i_14_ + ','
                            + bool_15_ + ','
                            + (class46s != null ? "{...}"
                            : "null")
                            + ',' + i_16_ + ',' + i_17_
                            + ')'));
        }
    }

    final void method3049(Class348_Sub49 class348_sub49, int i, int i_72_) {
        while_146_:
        do {
            try {
                anInt9146++;
                if (i_72_ == 31015) {
                    int i_73_ = i;
                    do {
                        if (i_73_ != 0) {
                            if ((i_73_ ^ 0xffffffff) != -2) {
                                if (i_73_ == 2)
                                    break;
                                break while_146_;
                            }
                        } else {
                            aBoolean9140 = (class348_sub49.method3387(255)
                                    ^ 0xffffffff) == -2;
                            return;
                        }
                        aBoolean9147 = class348_sub49.method3387(255) == 1;
                        return;
                    } while (false);
                    ((Class348_Sub40) this).aBoolean7045
                            = (class348_sub49.method3387(255) ^ 0xffffffff) == -2;
                    break;
                }
                break;
            } catch (RuntimeException runtimeexception) {
                throw Class348_Sub17.method2929(runtimeexception,
                        ("jia.F("
                                + (class348_sub49 != null
                                ? "{...}" : "null")
                                + ',' + i + ',' + i_72_
                                + ')'));
            }
        } while (false);
    }

    public Class348_Sub40_Sub7() {
        super(1, false);
    }

    static final void method3065(int i, boolean bool, int i_74_) {
        Class318_Sub1_Sub4.anInt8765++;
        anInt9142++;
        if (bool != false)
            method3065(-42, true, 43);
        Class348_Sub47 class348_sub47
                = Class286_Sub3.method2148(Class348_Sub40_Sub1.aClass351_9089,
                Class348_Sub23_Sub2.aClass77_9029, -97);
        ((Class348_Sub47) class348_sub47).aClass348_Sub49_Sub2_7116
                .method3335(52, i_74_);
        ((Class348_Sub47) class348_sub47).aClass348_Sub49_Sub2_7116
                .method3336(i, (byte) 44);
        Class348_Sub42_Sub14.method3243(25, class348_sub47);
    }

    final int[] method3042(int i, int i_75_) {
        anInt9143++;
        if (i_75_ != 255)
            aClass348_Sub42_Sub12_9144 = null;
        int[] is = ((Class348_Sub40) this).aClass191_7032.method1433(0, i);
        if (((Class191) ((Class348_Sub40) this).aClass191_7032).aBoolean2570) {
            int[] is_76_ = this.method3048((aBoolean9147
                            ? Class299_Sub2.anInt6325 - i : i),
                    i_75_ + 633706082, 0);
            if (!aBoolean9140)
                Class214.method1578(is_76_, 0, is, 0,
                        Class348_Sub40_Sub6.anInt9139);
            else {
                for (int i_77_ = 0;
                     ((Class348_Sub40_Sub6.anInt9139 ^ 0xffffffff)
                             < (i_77_ ^ 0xffffffff));
                     i_77_++)
                    is[i_77_] = is_76_[Class239_Sub22.anInt6076 + -i_77_];
            }
        }
        return is;
    }

    public static void method3066(int i) {
        if (i != -1)
            aClass348_Sub42_Sub12_9144 = null;
        aClass348_Sub42_Sub12_9144 = null;
    }
}
