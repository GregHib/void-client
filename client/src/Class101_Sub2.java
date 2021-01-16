/* Class101_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class101_Sub2 extends Class101 {
    static int anInt5690;
    float aFloat5691;
    static int anInt5692;
    static int anInt5693;
    static int anInt5694;
    static int anInt5695;
    static int anInt5696;
    static int anInt5697;
    static int anInt5698;
    static Class351 aClass351_5699;
    float aFloat5700;
    static int anInt5701;
    static int anInt5702;
    static int anInt5703;
    float aFloat5704;
    static int anInt5705;
    static int anInt5706;
    static int anInt5707;
    float aFloat5708;
    static int anInt5709;
    float aFloat5710;
    float aFloat5711;
    static int anInt5712;
    static int anInt5713 = -1;
    static int anInt5714;
    static int anInt5715;
    float aFloat5716;
    static int anInt5717;
    static int anInt5718;
    static int anInt5719;
    static int anInt5720;
    static int anInt5721;
    float aFloat5722;
    static int anInt5723;
    float aFloat5724;
    static int anInt5725;
    static int anInt5726;
    static int anInt5727;
    static int anInt5728;
    float aFloat5729;
    static int anInt5730;
    static int anInt5731;
    float aFloat5732;
    static int anInt5733;
    static int anInt5734;
    static int anInt5735;
    float aFloat5736;
    static int anInt5737;
    static int anInt5738;
    static int anInt5739;
    static int anInt5740;
    static int anInt5741;
    static Class114 aClass114_5742;
    static int anInt5743;
    static int anInt5744;
    static long aLong5745;

    final void method902(int i) {
        this.aFloat5716 = 1.0F;
        anInt5712++;
        this.aFloat5711
                = this.aFloat5722
                = Class239_Sub4.aFloatArray5876[0x3fff & i];
        this.aFloat5708
                = Class239_Sub4.aFloatArray5874[i & 0x3fff];
        this.aFloat5700 = -this.aFloat5708;
        this.aFloat5704
                = this.aFloat5729
                = this.aFloat5732
                = this.aFloat5710
                = this.aFloat5736
                = this.aFloat5691
                = this.aFloat5724 = 0.0F;
    }

    final void method914(float f, float f_0_, int i, float f_1_) {
        if (i == 0) {
            this.aFloat5724 *= f_0_;
            this.aFloat5729 *= f_1_;
            this.aFloat5732 *= f;
            this.aFloat5708 *= f;
            this.aFloat5704 *= f_1_;
            this.aFloat5722 *= f;
            this.aFloat5710 *= f;
            this.aFloat5716 *= f_0_;
            this.aFloat5736 *= f_0_;
            anInt5728++;
            this.aFloat5711 *= f_1_;
            this.aFloat5691 *= f_0_;
            this.aFloat5700 *= f_1_;
        }
    }

    final void method894(int i, int i_2_, int i_3_) {
        this.aFloat5724 = (float) i_3_;
        this.aFloat5711
                = this.aFloat5722
                = this.aFloat5716 = 1.0F;
        this.aFloat5710 = (float) i_2_;
        this.aFloat5729 = (float) i;
        anInt5706++;
        this.aFloat5708
                = this.aFloat5736
                = this.aFloat5700
                = this.aFloat5691
                = this.aFloat5704
                = this.aFloat5732 = 0.0F;
    }

    final void method910() {
        this.aFloat5711
                = this.aFloat5722
                = this.aFloat5716 = 1.0F;
        this.aFloat5708
                = this.aFloat5736
                = this.aFloat5700
                = this.aFloat5691
                = this.aFloat5704
                = this.aFloat5732
                = this.aFloat5729
                = this.aFloat5710
                = this.aFloat5724 = 0.0F;
        anInt5696++;
    }

    final float[] method915(float[] fs, int i) {
        fs[7] = this.aFloat5710;
        anInt5726++;
        fs[5] = this.aFloat5722;
        fs[4] = this.aFloat5708;
        fs[6] = this.aFloat5732;
        fs[i] = this.aFloat5700;
        fs[2] = this.aFloat5704;
        fs[3] = this.aFloat5729;
        fs[0] = this.aFloat5711;
        return fs;
    }

    final void method903(int i, int i_4_, int i_5_, int i_6_, int i_7_,
                         int i_8_) {
        anInt5733++;
        float f = Class239_Sub4.aFloatArray5876[i_6_ & 0x3fff];
        float f_9_ = Class239_Sub4.aFloatArray5874[i_6_ & 0x3fff];
        float f_10_ = Class239_Sub4.aFloatArray5876[0x3fff & i_7_];
        float f_11_ = Class239_Sub4.aFloatArray5874[0x3fff & i_7_];
        float f_12_ = Class239_Sub4.aFloatArray5876[0x3fff & i_8_];
        float f_13_ = Class239_Sub4.aFloatArray5874[i_8_ & 0x3fff];
        float f_14_ = f_12_ * f_9_;
        float f_15_ = f_9_ * f_13_;
        this.aFloat5700 = f_13_ * f;
        this.aFloat5704 = -f_11_ * f_12_ + f_10_ * f_15_;
        this.aFloat5716 = f * f_10_;
        this.aFloat5732 = f_13_ * f_11_ + f_14_ * f_10_;
        this.aFloat5711 = f_10_ * f_12_ + f_15_ * f_11_;
        this.aFloat5736 = f * f_11_;
        this.aFloat5722 = f_12_ * f;
        this.aFloat5691 = -f_9_;
        this.aFloat5708 = f_11_ * f_14_ + f_13_ * -f_10_;
        this.aFloat5729
                = (-(this.aFloat5704 * (float) i_5_)
                + (-((float) i_4_ * this.aFloat5700)
                + this.aFloat5711 * (float) -i));
        this.aFloat5710
                = ((float) -i * this.aFloat5708
                - this.aFloat5722 * (float) i_4_
                - (float) i_5_ * this.aFloat5732);
        this.aFloat5724
                = (-(this.aFloat5716 * (float) i_5_)
                + (this.aFloat5736 * (float) -i
                - this.aFloat5691 * (float) i_4_));
    }

    final void method895(int i) {
        this.aFloat5722 = 1.0F;
        anInt5738++;
        this.aFloat5711
                = this.aFloat5716
                = Class239_Sub4.aFloatArray5876[0x3fff & i];
        this.aFloat5704
                = Class239_Sub4.aFloatArray5874[i & 0x3fff];
        this.aFloat5736 = -this.aFloat5704;
        this.aFloat5700
                = this.aFloat5729
                = this.aFloat5708
                = this.aFloat5732
                = this.aFloat5710
                = this.aFloat5691
                = this.aFloat5724 = 0.0F;
    }

    final void method899(int i) {
        this.aFloat5711 = 1.0F;
        anInt5721++;
        this.aFloat5722
                = this.aFloat5716
                = Class239_Sub4.aFloatArray5876[0x3fff & i];
        this.aFloat5691
                = Class239_Sub4.aFloatArray5874[0x3fff & i];
        this.aFloat5700
                = this.aFloat5704
                = this.aFloat5729
                = this.aFloat5708
                = this.aFloat5710
                = this.aFloat5736
                = this.aFloat5724 = 0.0F;
        this.aFloat5732 = -this.aFloat5691;
    }

    final void method892(int i, int i_16_, int i_17_, int[] is) {
        anInt5694++;
        i_17_ -= this.aFloat5724;
        i -= this.aFloat5729;
        i_16_ -= this.aFloat5710;
        is[2] = (int) ((float) i_17_ * this.aFloat5716
                + ((float) i_16_ * this.aFloat5732
                + (float) i * this.aFloat5704));
        is[0] = (int) ((float) i * this.aFloat5711
                + (float) i_16_ * this.aFloat5708
                + this.aFloat5736 * (float) i_17_);
        is[1] = (int) (this.aFloat5700 * (float) i
                + this.aFloat5722 * (float) i_16_
                + this.aFloat5691 * (float) i_17_);
    }

    final void method916(float f, boolean bool, float f_18_, float f_19_) {
        this.aFloat5710 = f;
        this.aFloat5724 = f_18_;
        this.aFloat5711
                = this.aFloat5722
                = this.aFloat5716 = 1.0F;
        if (bool == true) {
            this.aFloat5729 = f_19_;
            this.aFloat5708
                    = this.aFloat5736
                    = this.aFloat5700
                    = this.aFloat5691
                    = this.aFloat5704
                    = this.aFloat5732 = 0.0F;
            anInt5735++;
        }
    }

    final void method891(int i, int i_20_, int i_21_) {
        this.aFloat5729 += (float) i;
        this.aFloat5710 += (float) i_20_;
        anInt5707++;
        this.aFloat5724 += (float) i_21_;
    }

    final void method917(Class101 class101, byte i) {
        anInt5698++;
        Class101_Sub2 class101_sub2_22_ = (Class101_Sub2) class101;
        float f = this.aFloat5711;
        float f_23_ = this.aFloat5708;
        float f_24_ = this.aFloat5700;
        float f_25_ = this.aFloat5722;
        float f_26_ = this.aFloat5704;
        float f_27_ = this.aFloat5732;
        if (i <= 104)
            this.aFloat5732 = -0.557632F;
        float f_28_ = this.aFloat5729;
        this.aFloat5708
                = (f * class101_sub2_22_.aFloat5708
                + class101_sub2_22_.aFloat5722 * f_23_
                + (this.aFloat5736
                * class101_sub2_22_.aFloat5732));
        this.aFloat5711
                = ((class101_sub2_22_.aFloat5704
                * this.aFloat5736)
                + (class101_sub2_22_.aFloat5711 * f
                + f_23_ * class101_sub2_22_.aFloat5700));
        float f_29_ = this.aFloat5710;
        this.aFloat5722
                = ((class101_sub2_22_.aFloat5732
                * this.aFloat5691)
                + (f_24_ * class101_sub2_22_.aFloat5708
                + class101_sub2_22_.aFloat5722 * f_25_));
        this.aFloat5700
                = ((this.aFloat5691
                * class101_sub2_22_.aFloat5704)
                + (class101_sub2_22_.aFloat5711 * f_24_
                + f_25_ * class101_sub2_22_.aFloat5700));
        this.aFloat5736
                = (f_23_ * class101_sub2_22_.aFloat5691
                + class101_sub2_22_.aFloat5736 * f
                + (this.aFloat5736
                * class101_sub2_22_.aFloat5716));
        this.aFloat5691
                = ((this.aFloat5691
                * class101_sub2_22_.aFloat5716)
                + (f_25_ * class101_sub2_22_.aFloat5691
                + class101_sub2_22_.aFloat5736 * f_24_));
        this.aFloat5732
                = (class101_sub2_22_.aFloat5722 * f_27_
                + class101_sub2_22_.aFloat5708 * f_26_
                + (this.aFloat5716
                * class101_sub2_22_.aFloat5732));
        this.aFloat5704
                = ((this.aFloat5716
                * class101_sub2_22_.aFloat5704)
                + (class101_sub2_22_.aFloat5711 * f_26_
                + f_27_ * class101_sub2_22_.aFloat5700));
        this.aFloat5729
                = (class101_sub2_22_.aFloat5729
                + (f_28_ * class101_sub2_22_.aFloat5711
                + class101_sub2_22_.aFloat5700 * f_29_
                + (class101_sub2_22_.aFloat5704
                * this.aFloat5724)));
        this.aFloat5710
                = (class101_sub2_22_.aFloat5708 * f_28_
                + f_29_ * class101_sub2_22_.aFloat5722
                + (this.aFloat5724
                * class101_sub2_22_.aFloat5732)
                + class101_sub2_22_.aFloat5710);
        this.aFloat5716
                = ((this.aFloat5716
                * class101_sub2_22_.aFloat5716)
                + (class101_sub2_22_.aFloat5736 * f_26_
                + class101_sub2_22_.aFloat5691 * f_27_));
        this.aFloat5724
                = (class101_sub2_22_.aFloat5736 * f_28_
                + class101_sub2_22_.aFloat5691 * f_29_
                + (this.aFloat5724
                * class101_sub2_22_.aFloat5716)
                + class101_sub2_22_.aFloat5724);
    }

    final float[] method918(float[] fs, int i) {
        fs[7] = 0.0F;
        fs[13] = this.aFloat5710;
        fs[14] = this.aFloat5724;
        fs[12] = this.aFloat5729;
        fs[11] = 0.0F;
        anInt5709++;
        fs[9] = this.aFloat5732;
        fs[8] = this.aFloat5704;
        fs[4] = this.aFloat5700;
        fs[0] = this.aFloat5711;
        fs[10] = this.aFloat5716;
        fs[5] = this.aFloat5722;
        fs[15] = 1.0F;
        fs[1] = this.aFloat5708;
        fs[3] = (float) i;
        fs[2] = this.aFloat5736;
        fs[6] = this.aFloat5691;
        return fs;
    }

    final void method919(float f, float[] fs, float f_30_, float f_31_,
                         float f_32_, byte i) {
        anInt5727++;
        if (i != -120)
            method921((byte) -93, false);
        fs[0] = (f_30_ * this.aFloat5700
                + f_31_ * this.aFloat5711
                + this.aFloat5704 * f);
        fs[1] = (this.aFloat5708 * f_31_
                + f_30_ * this.aFloat5722
                + this.aFloat5732 * f);
        float f_33_;
        float f_34_;
        float f_35_;
        if (f_31_ > 0.00390625F || f_31_ < -0.00390625F) {
            float f_36_ = -f_32_ / f_31_;
            f_34_ = (this.aFloat5724
                    + f_36_ * this.aFloat5736);
            f_35_ = (this.aFloat5729
                    + f_36_ * this.aFloat5711);
            f_33_ = (f_36_ * this.aFloat5708
                    + this.aFloat5710);
        } else if (f_30_ <= 0.00390625F && f_30_ >= -0.00390625F) {
            float f_38_ = -f_32_ / f;
            f_35_ = (this.aFloat5704 * f_38_
                    + this.aFloat5729);
            f_33_ = (this.aFloat5732 * f_38_
                    + this.aFloat5710);
            f_34_ = (this.aFloat5724
                    + f_38_ * this.aFloat5716);
        } else {
            float f_37_ = -f_32_ / f_30_;
            f_33_ = (this.aFloat5710
                    + f_37_ * this.aFloat5722);
            f_34_ = (this.aFloat5724
                    + this.aFloat5691 * f_37_);
            f_35_ = (this.aFloat5729
                    + this.aFloat5700 * f_37_);
        }
        fs[2] = (f * this.aFloat5716
                + (this.aFloat5691 * f_30_
                + f_31_ * this.aFloat5736));
        fs[3] = -(fs[2] * f_34_ + (fs[0] * f_35_ + fs[1] * f_33_));
    }

    final void method900(int i) {
        anInt5734++;
        float f = Class239_Sub4.aFloatArray5876[0x3fff & i];
        float f_39_ = Class239_Sub4.aFloatArray5874[0x3fff & i];
        float f_40_ = this.aFloat5708;
        float f_41_ = this.aFloat5722;
        float f_42_ = this.aFloat5732;
        this.aFloat5708
                = f_40_ * f - f_39_ * this.aFloat5736;
        float f_43_ = this.aFloat5710;
        this.aFloat5722
                = f_41_ * f - f_39_ * this.aFloat5691;
        this.aFloat5736
                = f * this.aFloat5736 + f_39_ * f_40_;
        this.aFloat5691
                = f * this.aFloat5691 + f_39_ * f_41_;
        this.aFloat5732
                = f_42_ * f - this.aFloat5716 * f_39_;
        this.aFloat5710
                = f * f_43_ - f_39_ * this.aFloat5724;
        this.aFloat5716
                = f * this.aFloat5716 + f_42_ * f_39_;
        this.aFloat5724
                = f_39_ * f_43_ + f * this.aFloat5724;
    }

    final void method920(float f, boolean bool, float f_44_, float f_45_) {
        this.aFloat5724 += f_44_;
        anInt5717++;
        this.aFloat5729 += f_45_;
        this.aFloat5710 += f;
        if (bool != false)
            method915(null, 69);
    }

    static final void method921(byte i, boolean bool) {
        if (i == 99) {
            for (Class348_Sub9 class348_sub9
                 = (Class348_Sub9) Class218.aClass262_2859.method1995(4);
                 class348_sub9 != null;
                 class348_sub9 = (Class348_Sub9) Class218.aClass262_2859
                         .method1990((byte) 120)) {
                if (class348_sub9.aClass348_Sub16_Sub5_6676
                        != null) {
                    Class348_Sub43.aClass348_Sub16_Sub4_7065.method2880
                            (class348_sub9
                                    .aClass348_Sub16_Sub5_6676);
                    class348_sub9.aClass348_Sub16_Sub5_6676
                            = null;
                }
                if (class348_sub9.aClass348_Sub16_Sub5_6673
                        != null) {
                    Class348_Sub43.aClass348_Sub16_Sub4_7065.method2880
                            (class348_sub9
                                    .aClass348_Sub16_Sub5_6673);
                    class348_sub9.aClass348_Sub16_Sub5_6673
                            = null;
                }
                class348_sub9.method2715((byte) 94);
            }
            anInt5739++;
            if (bool) {
                for (Class348_Sub9 class348_sub9
                     = (Class348_Sub9) client.aClass262_5185.method1995(4);
                     class348_sub9 != null;
                     class348_sub9
                             = ((Class348_Sub9)
                             client.aClass262_5185.method1990((byte) 69))) {
                    if ((class348_sub9
                            .aClass348_Sub16_Sub5_6676)
                            != null) {
                        Class348_Sub43.aClass348_Sub16_Sub4_7065.method2880
                                (class348_sub9
                                        .aClass348_Sub16_Sub5_6676);
                        class348_sub9
                                .aClass348_Sub16_Sub5_6676
                                = null;
                    }
                    class348_sub9.method2715((byte) 66);
                }
                for (Class348_Sub9 class348_sub9
                     = (Class348_Sub9) Class348_Sub42_Sub16_Sub2
                        .aClass356_10465.method3484(0);
                     class348_sub9 != null;
                     class348_sub9 = (Class348_Sub9) Class348_Sub42_Sub16_Sub2
                             .aClass356_10465
                             .method3482(0)) {
                    if ((class348_sub9
                            .aClass348_Sub16_Sub5_6676)
                            != null) {
                        Class348_Sub43.aClass348_Sub16_Sub4_7065.method2880
                                (class348_sub9
                                        .aClass348_Sub16_Sub5_6676);
                        class348_sub9
                                .aClass348_Sub16_Sub5_6676
                                = null;
                    }
                    class348_sub9.method2715((byte) 112);
                }
            }
        }
    }

    final float method922(byte i, float f, float f_46_, float f_47_) {
        anInt5701++;
        if (i <= 63)
            this.aFloat5700 = -0.2392172F;
        return (this.aFloat5722 * f_47_
                + f * this.aFloat5708
                + f_46_ * this.aFloat5732
                + this.aFloat5710);
    }

    final void method923(float f, float f_48_, byte i, float f_49_,
                         float[] fs) {
        fs[2] = (f_49_ * this.aFloat5716
                + (this.aFloat5691 * f_48_
                + this.aFloat5736 * f));
        if (i > -23)
            method897(30, -104, -112, null);
        anInt5697++;
        fs[1] = (this.aFloat5732 * f_49_
                + (f_48_ * this.aFloat5722
                + f * this.aFloat5708));
        fs[0] = (f_49_ * this.aFloat5704
                + (this.aFloat5711 * f
                + f_48_ * this.aFloat5700));
    }

    final float[] method924(int i, float[] fs) {
        fs[2] = this.aFloat5704;
        fs[0] = this.aFloat5711;
        fs[6] = this.aFloat5732;
        fs[13] = 0.0F;
        fs[3] = this.aFloat5729;
        fs[7] = this.aFloat5710;
        fs[12] = 0.0F;
        fs[14] = 0.0F;
        anInt5705++;
        fs[10] = this.aFloat5716;
        fs[8] = this.aFloat5736;
        fs[1] = this.aFloat5700;
        fs[5] = this.aFloat5722;
        fs[9] = this.aFloat5691;
        fs[15] = 1.0F;
        fs[4] = this.aFloat5708;
        fs[i] = this.aFloat5724;
        return fs;
    }

    public static void method925(int i) {
        if (i == -5997) {
            aClass351_5699 = null;
            aClass114_5742 = null;
        }
    }

    final Class101 method907() {
        anInt5695++;
        Class101_Sub2 class101_sub2_50_ = new Class101_Sub2();
        class101_sub2_50_.aFloat5691
                = this.aFloat5691;
        class101_sub2_50_.aFloat5724
                = this.aFloat5724;
        class101_sub2_50_.aFloat5700
                = this.aFloat5700;
        class101_sub2_50_.aFloat5729
                = this.aFloat5729;
        class101_sub2_50_.aFloat5736
                = this.aFloat5736;
        class101_sub2_50_.aFloat5710
                = this.aFloat5710;
        class101_sub2_50_.aFloat5722
                = this.aFloat5722;
        class101_sub2_50_.aFloat5704
                = this.aFloat5704;
        class101_sub2_50_.aFloat5708
                = this.aFloat5708;
        class101_sub2_50_.aFloat5716
                = this.aFloat5716;
        class101_sub2_50_.aFloat5711
                = this.aFloat5711;
        class101_sub2_50_.aFloat5732
                = this.aFloat5732;
        return class101_sub2_50_;
    }

    final void method926(int i, Class101 class101) {
        anInt5737++;
        if (i != -15699)
            this.aFloat5722 = 0.6372093F;
        Class101_Sub2 class101_sub2_51_ = (Class101_Sub2) class101;
        this.aFloat5711
                = class101_sub2_51_.aFloat5711;
        this.aFloat5710 = 0.0F;
        this.aFloat5722
                = class101_sub2_51_.aFloat5722;
        this.aFloat5736
                = class101_sub2_51_.aFloat5736;
        this.aFloat5691
                = class101_sub2_51_.aFloat5691;
        this.aFloat5716
                = class101_sub2_51_.aFloat5716;
        this.aFloat5700
                = class101_sub2_51_.aFloat5700;
        this.aFloat5708
                = class101_sub2_51_.aFloat5708;
        this.aFloat5732
                = class101_sub2_51_.aFloat5732;
        this.aFloat5724 = 0.0F;
        this.aFloat5729 = 0.0F;
        this.aFloat5704
                = class101_sub2_51_.aFloat5704;
    }

    final void method927(Class101 class101, Class101 class101_52_) {
        try {
            anInt5743++;
            Class101_Sub2 class101_sub2_53_ = (Class101_Sub2) class101;
            Class101_Sub2 class101_sub2_54_ = (Class101_Sub2) class101_52_;
            this.aFloat5711
                    = ((class101_sub2_53_.aFloat5704
                    * class101_sub2_54_.aFloat5736)
                    + ((class101_sub2_53_.aFloat5711
                    * class101_sub2_54_.aFloat5711)
                    + (class101_sub2_54_.aFloat5708
                    * class101_sub2_53_.aFloat5700)));
            this.aFloat5708
                    = ((class101_sub2_53_.aFloat5722
                    * class101_sub2_54_.aFloat5708)
                    + (class101_sub2_54_.aFloat5711
                    * class101_sub2_53_.aFloat5708)
                    + (class101_sub2_53_.aFloat5732
                    * class101_sub2_54_.aFloat5736));
            this.aFloat5736
                    = ((class101_sub2_54_.aFloat5736
                    * class101_sub2_53_.aFloat5716)
                    + ((class101_sub2_53_.aFloat5736
                    * class101_sub2_54_.aFloat5711)
                    + (class101_sub2_54_.aFloat5708
                    * class101_sub2_53_.aFloat5691)));
            this.aFloat5700
                    = ((class101_sub2_54_.aFloat5691
                    * class101_sub2_53_.aFloat5704)
                    + ((class101_sub2_54_.aFloat5722
                    * class101_sub2_53_.aFloat5700)
                    + (class101_sub2_54_.aFloat5700
                    * class101_sub2_53_.aFloat5711)));
            this.aFloat5722
                    = ((class101_sub2_53_.aFloat5708
                    * class101_sub2_54_.aFloat5700)
                    + (class101_sub2_54_.aFloat5722
                    * class101_sub2_53_.aFloat5722)
                    + (class101_sub2_53_.aFloat5732
                    * class101_sub2_54_.aFloat5691));
            this.aFloat5704
                    = ((class101_sub2_53_.aFloat5700
                    * class101_sub2_54_.aFloat5732)
                    + (class101_sub2_53_.aFloat5711
                    * class101_sub2_54_.aFloat5704)
                    + (class101_sub2_53_.aFloat5704
                    * class101_sub2_54_.aFloat5716));
            this.aFloat5691
                    = ((class101_sub2_53_.aFloat5716
                    * class101_sub2_54_.aFloat5691)
                    + ((class101_sub2_53_.aFloat5736
                    * class101_sub2_54_.aFloat5700)
                    + (class101_sub2_53_.aFloat5691
                    * class101_sub2_54_.aFloat5722)));
            this.aFloat5732
                    = ((class101_sub2_53_.aFloat5708
                    * class101_sub2_54_.aFloat5704)
                    + (class101_sub2_53_.aFloat5722
                    * class101_sub2_54_.aFloat5732)
                    + (class101_sub2_54_.aFloat5716
                    * class101_sub2_53_.aFloat5732));
            this.aFloat5729
                    = (class101_sub2_53_.aFloat5729
                    + ((class101_sub2_54_.aFloat5724
                    * class101_sub2_53_.aFloat5704)
                    + ((class101_sub2_54_.aFloat5710
                    * class101_sub2_53_.aFloat5700)
                    + (class101_sub2_53_.aFloat5711
                    * (class101_sub2_54_
                    .aFloat5729)))));
            this.aFloat5716
                    = ((class101_sub2_53_.aFloat5691
                    * class101_sub2_54_.aFloat5732)
                    + (class101_sub2_53_.aFloat5736
                    * class101_sub2_54_.aFloat5704)
                    + (class101_sub2_53_.aFloat5716
                    * class101_sub2_54_.aFloat5716));
            this.aFloat5710
                    = (class101_sub2_53_.aFloat5710
                    + ((class101_sub2_53_.aFloat5732
                    * class101_sub2_54_.aFloat5724)
                    + ((class101_sub2_54_.aFloat5710
                    * class101_sub2_53_.aFloat5722)
                    + (class101_sub2_53_.aFloat5708
                    * (class101_sub2_54_
                    .aFloat5729)))));
            this.aFloat5724
                    = ((class101_sub2_53_.aFloat5691
                    * class101_sub2_54_.aFloat5710)
                    + (class101_sub2_53_.aFloat5736
                    * class101_sub2_54_.aFloat5729)
                    + (class101_sub2_54_.aFloat5724
                    * class101_sub2_53_.aFloat5716)
                    + class101_sub2_53_.aFloat5724);
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception,
                    ("haa.HA("
                            + (class101 != null ? "{...}"
                            : "null")
                            + ','
                            + (class101_52_ != null ? "{...}"
                            : "null")
                            + ')'));
        }
    }

    final float[] method928(float[] fs, int i) {
        fs[13] = 0.0F;
        fs[i] = this.aFloat5708;
        fs[5] = this.aFloat5722;
        fs[6] = 0.0F;
        fs[3] = 0.0F;
        fs[15] = 1.0F;
        fs[4] = this.aFloat5700;
        fs[14] = 0.0F;
        fs[10] = this.aFloat5724;
        fs[2] = 0.0F;
        fs[0] = this.aFloat5711;
        fs[7] = 0.0F;
        fs[11] = 0.0F;
        fs[12] = 0.0F;
        anInt5690++;
        fs[8] = this.aFloat5729;
        fs[9] = this.aFloat5710;
        return fs;
    }

    final float method929(float f, float f_55_, byte i, float f_56_) {
        anInt5720++;
        if (i != 45)
            this.aFloat5722 = 0.64777815F;
        return (f * this.aFloat5704
                + (f_55_ * this.aFloat5700
                + f_56_ * this.aFloat5711)
                + this.aFloat5729);
    }

    final void method908(int i) {
        anInt5702++;
        float f = Class239_Sub4.aFloatArray5876[i & 0x3fff];
        float f_57_ = Class239_Sub4.aFloatArray5874[i & 0x3fff];
        float f_58_ = this.aFloat5711;
        float f_59_ = this.aFloat5700;
        float f_60_ = this.aFloat5704;
        float f_61_ = this.aFloat5729;
        this.aFloat5711
                = f_58_ * f - this.aFloat5708 * f_57_;
        this.aFloat5708
                = f * this.aFloat5708 + f_58_ * f_57_;
        this.aFloat5700
                = f_59_ * f - this.aFloat5722 * f_57_;
        this.aFloat5722
                = this.aFloat5722 * f + f_59_ * f_57_;
        this.aFloat5704
                = f_60_ * f - f_57_ * this.aFloat5732;
        this.aFloat5729
                = -(f_57_ * this.aFloat5710) + f * f_61_;
        this.aFloat5732
                = f_57_ * f_60_ + f * this.aFloat5732;
        this.aFloat5710
                = f_57_ * f_61_ + this.aFloat5710 * f;
    }

    final void method890(int[] is) {
        anInt5715++;
        float f = -this.aFloat5729 + (float) is[0];
        float f_62_ = (float) is[1] - this.aFloat5710;
        float f_63_ = (float) is[2] - this.aFloat5724;
        is[2] = (int) (f_63_ * this.aFloat5716
                + (this.aFloat5704 * f
                + f_62_ * this.aFloat5732));
        is[1] = (int) (this.aFloat5691 * f_63_
                + (this.aFloat5722 * f_62_
                + f * this.aFloat5700));
        is[0] = (int) (this.aFloat5708 * f_62_
                + this.aFloat5711 * f
                + f_63_ * this.aFloat5736);
    }

    final void method897(int i, int i_64_, int i_65_, int[] is) {
        is[2] = (int) ((float) i_64_ * this.aFloat5691
                + this.aFloat5736 * (float) i
                + this.aFloat5716 * (float) i_65_
                + this.aFloat5724);
        anInt5723++;
        is[1] = (int) (this.aFloat5732 * (float) i_65_
                + (this.aFloat5722 * (float) i_64_
                + (float) i * this.aFloat5708)
                + this.aFloat5710);
        is[0] = (int) (this.aFloat5729
                + (this.aFloat5704 * (float) i_65_
                + ((float) i * this.aFloat5711
                + (this.aFloat5700
                * (float) i_64_))));
    }

    final void method905(int i, int i_66_, int i_67_, int[] is) {
        is[0] = (int) ((float) i * this.aFloat5711
                + this.aFloat5700 * (float) i_66_
                + (float) i_67_ * this.aFloat5704);
        is[1] = (int) ((float) i_66_ * this.aFloat5722
                + this.aFloat5708 * (float) i
                + this.aFloat5732 * (float) i_67_);
        anInt5741++;
        is[2] = (int) ((float) i * this.aFloat5736
                + this.aFloat5691 * (float) i_66_
                + (float) i_67_ * this.aFloat5716);
    }

    final float[] method930(int i, float[] fs) {
        fs[7] = 0.0F;
        fs[14] = 0.0F;
        fs[8] = this.aFloat5736;
        fs[6] = this.aFloat5732;
        fs[4] = this.aFloat5708;
        fs[2] = this.aFloat5704;
        fs[11] = 0.0F;
        anInt5719++;
        fs[15] = 0.0F;
        fs[9] = this.aFloat5691;
        fs[12] = 0.0F;
        fs[13] = (float) i;
        fs[3] = 0.0F;
        fs[1] = this.aFloat5700;
        fs[0] = this.aFloat5711;
        fs[10] = this.aFloat5716;
        fs[5] = this.aFloat5722;
        return fs;
    }

    final void method931(int i, Class101 class101) {
        anInt5730++;
        Class101_Sub2 class101_sub2_68_ = (Class101_Sub2) class101;
        this.aFloat5700
                = class101_sub2_68_.aFloat5708;
        this.aFloat5704
                = class101_sub2_68_.aFloat5736;
        this.aFloat5711
                = class101_sub2_68_.aFloat5711;
        this.aFloat5708
                = class101_sub2_68_.aFloat5700;
        this.aFloat5722
                = class101_sub2_68_.aFloat5722;
        this.aFloat5736
                = class101_sub2_68_.aFloat5704;
        this.aFloat5732
                = class101_sub2_68_.aFloat5691;
        this.aFloat5691
                = class101_sub2_68_.aFloat5732;
        if (i != -25519)
            method932(0.19733748F, -0.027194114F, -1.3929868F, (byte) 77);
        this.aFloat5729
                = -((this.aFloat5704
                * class101_sub2_68_.aFloat5724)
                + ((class101_sub2_68_.aFloat5710
                * this.aFloat5700)
                + (class101_sub2_68_.aFloat5729
                * this.aFloat5711)));
        this.aFloat5716
                = class101_sub2_68_.aFloat5716;
        this.aFloat5710
                = -((class101_sub2_68_.aFloat5724
                * this.aFloat5732)
                + ((this.aFloat5708
                * class101_sub2_68_.aFloat5729)
                + (class101_sub2_68_.aFloat5710
                * this.aFloat5722)));
        this.aFloat5724
                = -((class101_sub2_68_.aFloat5710
                * this.aFloat5691)
                + (this.aFloat5736
                * class101_sub2_68_.aFloat5729)
                + (this.aFloat5716
                * class101_sub2_68_.aFloat5724));
    }

    final void method896(int i) {
        anInt5725++;
        float f = Class239_Sub4.aFloatArray5876[i & 0x3fff];
        float f_69_ = Class239_Sub4.aFloatArray5874[i & 0x3fff];
        float f_70_ = this.aFloat5711;
        float f_71_ = this.aFloat5700;
        float f_72_ = this.aFloat5704;
        this.aFloat5711
                = f * f_70_ + this.aFloat5736 * f_69_;
        float f_73_ = this.aFloat5729;
        this.aFloat5736
                = -(f_69_ * f_70_) + this.aFloat5736 * f;
        this.aFloat5700
                = f * f_71_ + f_69_ * this.aFloat5691;
        this.aFloat5691
                = -(f_69_ * f_71_) + this.aFloat5691 * f;
        this.aFloat5704
                = f * f_72_ + this.aFloat5716 * f_69_;
        this.aFloat5716
                = -(f_72_ * f_69_) + this.aFloat5716 * f;
        this.aFloat5729
                = f_73_ * f + f_69_ * this.aFloat5724;
        this.aFloat5724
                = -(f_73_ * f_69_) + f * this.aFloat5724;
    }

    final void method932(float f, float f_74_, float f_75_, byte i) {
        this.aFloat5722 = f_74_;
        this.aFloat5704 = 0.0F;
        this.aFloat5700 = 0.0F;
        anInt5692++;
        this.aFloat5729 = 0.0F;
        this.aFloat5716 = f;
        this.aFloat5724 = 0.0F;
        this.aFloat5732 = 0.0F;
        this.aFloat5710 = 0.0F;
        if (i > -5)
            method900(-55);
        this.aFloat5736 = 0.0F;
        this.aFloat5708 = 0.0F;
        this.aFloat5691 = 0.0F;
        this.aFloat5711 = f_75_;
    }

    final float method933(byte i, float f, float f_76_, float f_77_) {
        if (i != -105)
            this.aFloat5724 = -0.26493254F;
        anInt5740++;
        return (this.aFloat5724
                + (this.aFloat5736 * f
                + f_77_ * this.aFloat5691
                + this.aFloat5716 * f_76_));
    }

    public Class101_Sub2() {
        method910();
    }

    final void method934(byte i) {
        this.aFloat5710 = -this.aFloat5710;
        if (i == 64) {
            this.aFloat5691
                    = -this.aFloat5691;
            this.aFloat5736
                    = -this.aFloat5736;
            this.aFloat5732
                    = -this.aFloat5732;
            this.aFloat5724
                    = -this.aFloat5724;
            anInt5731++;
            this.aFloat5716
                    = -this.aFloat5716;
            this.aFloat5708
                    = -this.aFloat5708;
            this.aFloat5722
                    = -this.aFloat5722;
        }
    }

    final void method898(Class101 class101) {
        anInt5693++;
        Class101_Sub2 class101_sub2_78_ = (Class101_Sub2) class101;
        this.aFloat5724
                = class101_sub2_78_.aFloat5724;
        this.aFloat5736
                = class101_sub2_78_.aFloat5736;
        this.aFloat5729
                = class101_sub2_78_.aFloat5729;
        this.aFloat5700
                = class101_sub2_78_.aFloat5700;
        this.aFloat5691
                = class101_sub2_78_.aFloat5691;
        this.aFloat5711
                = class101_sub2_78_.aFloat5711;
        this.aFloat5704
                = class101_sub2_78_.aFloat5704;
        this.aFloat5732
                = class101_sub2_78_.aFloat5732;
        this.aFloat5716
                = class101_sub2_78_.aFloat5716;
        this.aFloat5722
                = class101_sub2_78_.aFloat5722;
        this.aFloat5710
                = class101_sub2_78_.aFloat5710;
        this.aFloat5708
                = class101_sub2_78_.aFloat5708;
    }

    final void method935(float f, float f_79_, float f_80_, float f_81_,
                         float f_82_, float f_83_, float f_84_, float f_85_,
                         float f_86_, int i) {
        anInt5718++;
        this.aFloat5708 = f_79_;
        this.aFloat5716 = f;
        this.aFloat5700 = f_80_;
        this.aFloat5724 = 0.0F;
        this.aFloat5732 = f_85_;
        this.aFloat5729 = 0.0F;
        this.aFloat5722 = f_83_;
        this.aFloat5704 = f_84_;
        this.aFloat5710 = (float) i;
        this.aFloat5691 = f_82_;
        this.aFloat5736 = f_81_;
        this.aFloat5711 = f_86_;
    }

    final void method936(int i, int i_87_, int i_88_, float f, float f_89_,
                         float f_90_, int i_91_) {
        anInt5703++;
        if (i == i_87_) {
            this.aFloat5708
                    = this.aFloat5736
                    = this.aFloat5700
                    = this.aFloat5691
                    = this.aFloat5704
                    = this.aFloat5732 = 0.0F;
            this.aFloat5729 = f - (float) i_91_;
            this.aFloat5716 = 1.0F;
            this.aFloat5710 = (float) -i_88_ + f_90_;
            this.aFloat5711 = (float) (i_91_ * 2);
            this.aFloat5722 = (float) (2 * i_88_);
            this.aFloat5724 = f_89_;
        } else {
            float f_92_ = Class239_Sub4.aFloatArray5876[i & 0x3fff];
            float f_93_ = Class239_Sub4.aFloatArray5874[0x3fff & i];
            this.aFloat5711 = 2.0F * f_92_ * (float) i_91_;
            this.aFloat5710
                    = (-0.5F * f_93_ - f_92_ * 0.5F) * (float) (2 * i_88_) + f_90_;
            this.aFloat5722 = (float) i_88_ * (f_92_ * 2.0F);
            this.aFloat5716 = 1.0F;
            this.aFloat5700 = -2.0F * f_93_ * (float) i_88_;
            this.aFloat5736
                    = this.aFloat5691
                    = this.aFloat5704
                    = this.aFloat5732 = 0.0F;
            this.aFloat5724 = f_89_;
            this.aFloat5708 = (float) i_91_ * (f_93_ * 2.0F);
            this.aFloat5729
                    = f + (float) (2 * i_91_) * (0.5F * f_93_ - f_92_ * 0.5F);
        }
    }

    static {
        aClass351_5699 = new Class351(53, -1);
        aClass114_5742 = new Class114(119, 6);
    }
}
