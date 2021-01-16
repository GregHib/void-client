/* Class101_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class101_Sub1 extends Class101 {
    float aFloat5655;
    static int anInt5656;
    static int anInt5657;
    static int anInt5658;
    static int anInt5659;
    static int anInt5660;
    static int anInt5661;
    float aFloat5662;
    static long aLong5663;
    float aFloat5664;
    static int anInt5665;
    float aFloat5666;
    static int anInt5667;
    static int anInt5668;
    float aFloat5669;
    static int anInt5670;
    static int anInt5671;
    float aFloat5672;
    float aFloat5673;
    static int anInt5674;
    static Class246 aClass246_5675 = Class284.method2118((byte) -42);
    static int anInt5676;
    static Class351 aClass351_5677 = new Class351(56, 7);
    float aFloat5678;
    static int anInt5679;
    float aFloat5680;
    float aFloat5681;
    static int anInt5682;
    static int anInt5683;
    static d aD5684;
    float aFloat5685;
    float aFloat5686;
    static int anInt5687;
    static int anInt5688;
    static Class223 aClass223_5689 = new Class223(4, 1);

    public static void method911(int i) {
        if (i != 0)
            method911(-121);
        aClass223_5689 = null;
        aD5684 = null;
        aClass246_5675 = null;
        aClass351_5677 = null;
    }

    final void method910() {
        anInt5688++;
        this.aFloat5672
                = this.aFloat5678
                = this.aFloat5664 = 1.0F;
        this.aFloat5655
                = this.aFloat5662
                = this.aFloat5673
                = this.aFloat5680
                = this.aFloat5669
                = this.aFloat5666
                = this.aFloat5686
                = this.aFloat5685
                = this.aFloat5681 = 0.0F;
    }

    final void method894(int i, int i_0_, int i_1_) {
        anInt5674++;
        this.aFloat5685 = (float) i_0_;
        this.aFloat5655
                = this.aFloat5662
                = this.aFloat5673
                = this.aFloat5680
                = this.aFloat5669
                = this.aFloat5666 = 0.0F;
        this.aFloat5672
                = this.aFloat5678
                = this.aFloat5664 = 1.0F;
        this.aFloat5686 = (float) i;
        this.aFloat5681 = (float) i_1_;
    }

    final void method903(int i, int i_2_, int i_3_, int i_4_, int i_5_,
                         int i_6_) {
        anInt5682++;
        float f = Class239_Sub4.aFloatArray5876[i_4_ & 0x3fff];
        float f_7_ = Class239_Sub4.aFloatArray5874[0x3fff & i_4_];
        float f_8_ = Class239_Sub4.aFloatArray5876[i_5_ & 0x3fff];
        float f_9_ = Class239_Sub4.aFloatArray5874[0x3fff & i_5_];
        float f_10_ = Class239_Sub4.aFloatArray5876[0x3fff & i_6_];
        float f_11_ = Class239_Sub4.aFloatArray5874[0x3fff & i_6_];
        float f_12_ = f_10_ * f_7_;
        float f_13_ = f_7_ * f_11_;
        this.aFloat5666 = f_11_ * f_9_ + f_8_ * f_12_;
        this.aFloat5669 = f_10_ * -f_9_ + f_13_ * f_8_;
        this.aFloat5680 = -f_7_;
        this.aFloat5678 = f * f_10_;
        this.aFloat5664 = f_8_ * f;
        this.aFloat5662 = f * f_9_;
        this.aFloat5655 = f_12_ * f_9_ + -f_8_ * f_11_;
        this.aFloat5673 = f * f_11_;
        this.aFloat5672 = f_13_ * f_9_ + f_10_ * f_8_;
        this.aFloat5681
                = (-((float) i_3_ * this.aFloat5664)
                + (-((float) i_2_ * this.aFloat5680)
                + (float) -i * this.aFloat5662));
        this.aFloat5686
                = (this.aFloat5672 * (float) -i
                - (float) i_2_ * this.aFloat5673
                - this.aFloat5669 * (float) i_3_);
        this.aFloat5685
                = (-(this.aFloat5666 * (float) i_3_)
                + (this.aFloat5655 * (float) -i
                - (float) i_2_ * this.aFloat5678));
    }

    static final int method912(int i) {
        if (i != 0)
            return -41;
        anInt5657++;
        return Class108.anInt1663;
    }

    final void method898(Class101 class101) {
        anInt5683++;
        Class101_Sub1 class101_sub1_14_ = (Class101_Sub1) class101;
        this.aFloat5669
                = class101_sub1_14_.aFloat5669;
        this.aFloat5681
                = class101_sub1_14_.aFloat5681;
        this.aFloat5655
                = class101_sub1_14_.aFloat5655;
        this.aFloat5664
                = class101_sub1_14_.aFloat5664;
        this.aFloat5666
                = class101_sub1_14_.aFloat5666;
        this.aFloat5678
                = class101_sub1_14_.aFloat5678;
        this.aFloat5680
                = class101_sub1_14_.aFloat5680;
        this.aFloat5672
                = class101_sub1_14_.aFloat5672;
        this.aFloat5662
                = class101_sub1_14_.aFloat5662;
        this.aFloat5686
                = class101_sub1_14_.aFloat5686;
        this.aFloat5673
                = class101_sub1_14_.aFloat5673;
        this.aFloat5685
                = class101_sub1_14_.aFloat5685;
    }

    final void method905(int i, int i_15_, int i_16_, int[] is) {
        is[0] = (int) ((float) i_16_ * this.aFloat5669
                + (this.aFloat5673 * (float) i_15_
                + this.aFloat5672 * (float) i));
        anInt5687++;
        is[1] = (int) (this.aFloat5655 * (float) i
                + (float) i_15_ * this.aFloat5678
                + this.aFloat5666 * (float) i_16_);
        is[2]
                = (int) (this.aFloat5664 * (float) i_16_
                + ((float) i * this.aFloat5662
                + (float) i_15_ * this.aFloat5680));
    }

    final void method891(int i, int i_17_, int i_18_) {
        this.aFloat5685 += (float) i_17_;
        this.aFloat5681 += (float) i_18_;
        this.aFloat5686 += (float) i;
        anInt5661++;
    }

    final void method908(int i) {
        anInt5656++;
        float f = Class239_Sub4.aFloatArray5876[i & 0x3fff];
        float f_19_ = Class239_Sub4.aFloatArray5874[i & 0x3fff];
        float f_20_ = this.aFloat5672;
        float f_21_ = this.aFloat5673;
        float f_22_ = this.aFloat5669;
        this.aFloat5672
                = -(f_19_ * this.aFloat5655) + f * f_20_;
        float f_23_ = this.aFloat5686;
        this.aFloat5673
                = f_21_ * f - this.aFloat5678 * f_19_;
        this.aFloat5655
                = f * this.aFloat5655 + f_20_ * f_19_;
        this.aFloat5669
                = f * f_22_ - this.aFloat5666 * f_19_;
        this.aFloat5678
                = f * this.aFloat5678 + f_19_ * f_21_;
        this.aFloat5666
                = f_19_ * f_22_ + f * this.aFloat5666;
        this.aFloat5686
                = -(f_19_ * this.aFloat5685) + f_23_ * f;
        this.aFloat5685
                = f * this.aFloat5685 + f_19_ * f_23_;
    }

    final void method900(int i) {
        anInt5658++;
        float f = Class239_Sub4.aFloatArray5876[0x3fff & i];
        float f_24_ = Class239_Sub4.aFloatArray5874[0x3fff & i];
        float f_25_ = this.aFloat5655;
        float f_26_ = this.aFloat5678;
        float f_27_ = this.aFloat5666;
        this.aFloat5655
                = f_25_ * f - this.aFloat5662 * f_24_;
        float f_28_ = this.aFloat5685;
        this.aFloat5662
                = f_24_ * f_25_ + this.aFloat5662 * f;
        this.aFloat5678
                = f * f_26_ - this.aFloat5680 * f_24_;
        this.aFloat5666
                = -(f_24_ * this.aFloat5664) + f * f_27_;
        this.aFloat5680
                = this.aFloat5680 * f + f_24_ * f_26_;
        this.aFloat5685
                = f * f_28_ - f_24_ * this.aFloat5681;
        this.aFloat5664
                = f * this.aFloat5664 + f_27_ * f_24_;
        this.aFloat5681
                = f_28_ * f_24_ + f * this.aFloat5681;
    }

    final void method892(int i, int i_29_, int i_30_, int[] is) {
        i_30_ -= this.aFloat5681;
        anInt5668++;
        i_29_ -= this.aFloat5685;
        i -= this.aFloat5686;
        is[0] = (int) (this.aFloat5662 * (float) i_30_
                + (this.aFloat5655 * (float) i_29_
                + this.aFloat5672 * (float) i));
        is[1] = (int) ((float) i_29_ * this.aFloat5678
                + this.aFloat5673 * (float) i
                + (float) i_30_ * this.aFloat5680);
        is[2] = (int) ((float) i_30_ * this.aFloat5664
                + ((float) i_29_ * this.aFloat5666
                + (float) i * this.aFloat5669));
    }

    final void method899(int i) {
        anInt5670++;
        this.aFloat5672 = 1.0F;
        this.aFloat5678
                = this.aFloat5664
                = Class239_Sub4.aFloatArray5876[i & 0x3fff];
        this.aFloat5680
                = Class239_Sub4.aFloatArray5874[0x3fff & i];
        this.aFloat5666 = -this.aFloat5680;
        this.aFloat5673
                = this.aFloat5669
                = this.aFloat5686
                = this.aFloat5655
                = this.aFloat5685
                = this.aFloat5662
                = this.aFloat5681 = 0.0F;
    }

    final void method902(int i) {
        anInt5667++;
        this.aFloat5664 = 1.0F;
        this.aFloat5672
                = this.aFloat5678
                = Class239_Sub4.aFloatArray5876[0x3fff & i];
        this.aFloat5655
                = Class239_Sub4.aFloatArray5874[0x3fff & i];
        this.aFloat5669
                = this.aFloat5686
                = this.aFloat5666
                = this.aFloat5685
                = this.aFloat5662
                = this.aFloat5680
                = this.aFloat5681 = 0.0F;
        this.aFloat5673 = -this.aFloat5655;
    }

    final Class101 method907() {
        anInt5660++;
        Class101_Sub1 class101_sub1_31_ = new Class101_Sub1();
        class101_sub1_31_.aFloat5664
                = this.aFloat5664;
        class101_sub1_31_.aFloat5681
                = this.aFloat5681;
        class101_sub1_31_.aFloat5662
                = this.aFloat5662;
        class101_sub1_31_.aFloat5669
                = this.aFloat5669;
        class101_sub1_31_.aFloat5655
                = this.aFloat5655;
        class101_sub1_31_.aFloat5666
                = this.aFloat5666;
        class101_sub1_31_.aFloat5686
                = this.aFloat5686;
        class101_sub1_31_.aFloat5678
                = this.aFloat5678;
        class101_sub1_31_.aFloat5673
                = this.aFloat5673;
        class101_sub1_31_.aFloat5685
                = this.aFloat5685;
        class101_sub1_31_.aFloat5672
                = this.aFloat5672;
        class101_sub1_31_.aFloat5680
                = this.aFloat5680;
        return class101_sub1_31_;
    }

    final void method895(int i) {
        this.aFloat5678 = 1.0F;
        anInt5676++;
        this.aFloat5672
                = this.aFloat5664
                = Class239_Sub4.aFloatArray5876[0x3fff & i];
        this.aFloat5669
                = Class239_Sub4.aFloatArray5874[i & 0x3fff];
        this.aFloat5673
                = this.aFloat5686
                = this.aFloat5655
                = this.aFloat5666
                = this.aFloat5685
                = this.aFloat5680
                = this.aFloat5681 = 0.0F;
        this.aFloat5662 = -this.aFloat5669;
    }

    final void method896(int i) {
        anInt5659++;
        float f = Class239_Sub4.aFloatArray5876[0x3fff & i];
        float f_32_ = Class239_Sub4.aFloatArray5874[i & 0x3fff];
        float f_33_ = this.aFloat5672;
        float f_34_ = this.aFloat5673;
        float f_35_ = this.aFloat5669;
        this.aFloat5672
                = f_33_ * f + f_32_ * this.aFloat5662;
        float f_36_ = this.aFloat5686;
        this.aFloat5673
                = f * f_34_ + f_32_ * this.aFloat5680;
        this.aFloat5662
                = -(f_32_ * f_33_) + this.aFloat5662 * f;
        this.aFloat5669
                = f * f_35_ + f_32_ * this.aFloat5664;
        this.aFloat5680
                = -(f_32_ * f_34_) + f * this.aFloat5680;
        this.aFloat5664
                = -(f_32_ * f_35_) + f * this.aFloat5664;
        this.aFloat5686
                = f_36_ * f + f_32_ * this.aFloat5681;
        this.aFloat5681
                = f * this.aFloat5681 - f_32_ * f_36_;
    }

    final void method890(int[] is) {
        anInt5671++;
        float f = -this.aFloat5686 + (float) is[0];
        float f_37_ = (float) is[1] - this.aFloat5685;
        float f_38_ = (float) is[2] - this.aFloat5681;
        is[2] = (int) (this.aFloat5669 * f
                + f_37_ * this.aFloat5666
                + this.aFloat5664 * f_38_);
        is[1] = (int) (this.aFloat5673 * f
                + f_37_ * this.aFloat5678
                + f_38_ * this.aFloat5680);
        is[0] = (int) (this.aFloat5662 * f_38_
                + (f * this.aFloat5672
                + this.aFloat5655 * f_37_));
    }

    static final boolean method913(byte i) {
        if (i <= 115)
            return true;
        anInt5679++;
        return (Class73.anInt4776 ^ 0xffffffff) < -1;
    }

    public Class101_Sub1() {
        method910();
    }

    final void method897(int i, int i_39_, int i_40_, int[] is) {
        anInt5665++;
        is[1] = (int) ((float) i * this.aFloat5655
                + this.aFloat5678 * (float) i_39_
                + (float) i_40_ * this.aFloat5666
                + this.aFloat5685);
        is[0] = (int) ((float) i_40_ * this.aFloat5669
                + (this.aFloat5673 * (float) i_39_
                + (float) i * this.aFloat5672)
                + this.aFloat5686);
        is[2]
                = (int) (this.aFloat5681
                + (this.aFloat5680 * (float) i_39_
                + (float) i * this.aFloat5662
                + (float) i_40_ * this.aFloat5664));
    }
}
