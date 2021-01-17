/* Class101_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class101_Sub3 extends Class101 {
    static int anInt5746;
    float aFloat5747;
    static int anInt5748;
    static int anInt5749;
    float aFloat5750;
    float aFloat5751;
    static int anInt5752;
    static int anInt5753;
    float aFloat5754;
    static int anInt5755;
    float aFloat5756;
    static int anInt5757;
    static int anInt5758;
    static int anInt5759;
    static int anInt5760;
    float aFloat5761;
    float aFloat5762;
    static int anInt5763;
    static Class326 aClass326_5764;
    static int anInt5765;
    static int anInt5766;
    static int anInt5767;
    static int anInt5768 = 0;
    float aFloat5769;
    float aFloat5770;
    static int anInt5771;
    float aFloat5772;
    static int anInt5773;
    static int anInt5774;
    static int anInt5775;
    static int anInt5776;
    static int anInt5777;
    static int anInt5778;
    static int anInt5779;
    static int anInt5780;
    float aFloat5781;
    static int anInt5782;
    static int anInt5783;
    float aFloat5784;
    static int anInt5785;

    final void method902(int i) {
        anInt5779++;
        this.aFloat5784 = 1.0F;
        this.aFloat5770 = this.aFloat5769 = Class348_Sub23.aFloatArray6867[0x3fff & i];
        this.aFloat5761 = Class348_Sub23.aFloatArray6865[0x3fff & i];
        this.aFloat5781 = this.aFloat5747 = this.aFloat5762 = this.aFloat5772 = this.aFloat5756 = this.aFloat5754 = this.aFloat5751 = 0.0F;
        this.aFloat5750 = -this.aFloat5761;
    }

    final void method937(boolean bool, float f, float f_0_, float f_1_, float f_2_, float[] fs) {
        anInt5765++;
        float f_3_;
        float f_4_;
        float f_5_;
        if (f > 0.00390625F || f < -0.00390625F) {
            float f_6_ = -f_2_ / f;
            f_4_ = (f_6_ * this.aFloat5770 + this.aFloat5747);
            f_5_ = (this.aFloat5751 + this.aFloat5756 * f_6_);
            f_3_ = (this.aFloat5772 + f_6_ * this.aFloat5761);
        } else if (f_1_ <= 0.00390625F && f_1_ >= -0.00390625F) {
            float f_8_ = -f_2_ / f_0_;
            f_4_ = (f_8_ * this.aFloat5781 + this.aFloat5747);
            f_3_ = (this.aFloat5762 * f_8_ + this.aFloat5772);
            f_5_ = (this.aFloat5751 + f_8_ * this.aFloat5784);
        } else {
            float f_7_ = -f_2_ / f_1_;
            f_3_ = (this.aFloat5769 * f_7_ + this.aFloat5772);
            f_4_ = (this.aFloat5750 * f_7_ + this.aFloat5747);
            f_5_ = (this.aFloat5754 * f_7_ + this.aFloat5751);
        }
        fs[0] = (f_0_ * this.aFloat5781 + (f * this.aFloat5770 + f_1_ * this.aFloat5750));
        fs[2] = (f_0_ * this.aFloat5784 + (this.aFloat5756 * f + this.aFloat5754 * f_1_));
        if (bool != true) this.aFloat5772 = -0.4364811F;
        fs[1] = (this.aFloat5769 * f_1_ + this.aFloat5761 * f + this.aFloat5762 * f_0_);
        fs[3] = -(fs[0] * f_4_ + f_3_ * fs[1] + f_5_ * fs[2]);
    }

    final void method891(int i, int i_9_, int i_10_) {
        this.aFloat5751 += (float) i_10_;
        this.aFloat5772 += (float) i_9_;
        this.aFloat5747 += (float) i;
        anInt5785++;
    }

    public static void method938(int i) {
        aClass326_5764 = null;
        if (i <= 8) aClass326_5764 = null;
    }

    final void method900(int i) {
        anInt5763++;
        float f = Class348_Sub23.aFloatArray6867[0x3fff & i];
        float f_11_ = Class348_Sub23.aFloatArray6865[0x3fff & i];
        float f_12_ = this.aFloat5761;
        float f_13_ = this.aFloat5769;
        float f_14_ = this.aFloat5762;
        this.aFloat5761 = f * f_12_ - this.aFloat5756 * f_11_;
        float f_15_ = this.aFloat5772;
        this.aFloat5756 = this.aFloat5756 * f + f_11_ * f_12_;
        this.aFloat5769 = -(f_11_ * this.aFloat5754) + f_13_ * f;
        this.aFloat5762 = f * f_14_ - this.aFloat5784 * f_11_;
        this.aFloat5754 = f_13_ * f_11_ + f * this.aFloat5754;
        this.aFloat5784 = f_14_ * f_11_ + f * this.aFloat5784;
        this.aFloat5772 = -(f_11_ * this.aFloat5751) + f * f_15_;
        this.aFloat5751 = f * this.aFloat5751 + f_15_ * f_11_;
    }

    final void method939(float f, int i, float f_16_, int i_17_, int i_18_, int i_19_, float f_20_) {
        if (i_18_ == 0) {
            this.aFloat5761 = this.aFloat5756 = this.aFloat5750 = this.aFloat5754 = this.aFloat5781 = this.aFloat5762 = 0.0F;
            this.aFloat5770 = (float) i;
            this.aFloat5784 = 1.0F;
            this.aFloat5769 = (float) i_17_;
        } else {
            float f_21_ = Class348_Sub23.aFloatArray6867[0x3fff & i_18_];
            float f_22_ = Class348_Sub23.aFloatArray6865[i_18_ & 0x3fff];
            this.aFloat5761 = (float) i * f_22_;
            this.aFloat5769 = (float) i_17_ * f_21_;
            this.aFloat5756 = this.aFloat5754 = this.aFloat5781 = this.aFloat5762 = 0.0F;
            this.aFloat5784 = 1.0F;
            this.aFloat5750 = -f_22_ * (float) i_17_;
            this.aFloat5770 = (float) i * f_21_;
        }
        anInt5746++;
        this.aFloat5747 = f_16_;
        this.aFloat5772 = f_20_;
        this.aFloat5751 = f;
        int i_23_ = -88 / ((i_19_ - 6) / 39);
    }

    final void method897(int i, int i_24_, int i_25_, int[] is) {
        anInt5767++;
        is[0] = (int) ((float) i_25_ * this.aFloat5781 + ((float) i * this.aFloat5770 + (float) i_24_ * this.aFloat5750) + this.aFloat5747);
        is[2] = (int) ((float) i_24_ * this.aFloat5754 + this.aFloat5756 * (float) i + this.aFloat5784 * (float) i_25_ + this.aFloat5751);
        is[1] = (int) (this.aFloat5772 + ((float) i_25_ * this.aFloat5762 + ((float) i * this.aFloat5761 + ((float) i_24_ * this.aFloat5769))));
    }

    final void method894(int i, int i_26_, int i_27_) {
        this.aFloat5751 = (float) i_27_;
        this.aFloat5747 = (float) i;
        this.aFloat5761 = this.aFloat5756 = this.aFloat5750 = this.aFloat5754 = this.aFloat5781 = this.aFloat5762 = 0.0F;
        this.aFloat5772 = (float) i_26_;
        this.aFloat5770 = this.aFloat5769 = this.aFloat5784 = 1.0F;
        anInt5749++;
    }

    final void method890(int[] is) {
        anInt5775++;
        float f = (float) is[0] - this.aFloat5747;
        float f_28_ = -this.aFloat5772 + (float) is[1];
        float f_29_ = -this.aFloat5751 + (float) is[2];
        is[1] = (int) (this.aFloat5769 * f_28_ + f * this.aFloat5750 + this.aFloat5754 * f_29_);
        is[2] = (int) (this.aFloat5784 * f_29_ + (f_28_ * this.aFloat5762 + this.aFloat5781 * f));
        is[0] = (int) (this.aFloat5770 * f + this.aFloat5761 * f_28_ + f_29_ * this.aFloat5756);
    }

    final void method903(int i, int i_30_, int i_31_, int i_32_, int i_33_, int i_34_) {
        anInt5782++;
        float f = Class348_Sub23.aFloatArray6867[i_32_ & 0x3fff];
        float f_35_ = Class348_Sub23.aFloatArray6865[i_32_ & 0x3fff];
        float f_36_ = Class348_Sub23.aFloatArray6867[0x3fff & i_33_];
        float f_37_ = Class348_Sub23.aFloatArray6865[0x3fff & i_33_];
        float f_38_ = Class348_Sub23.aFloatArray6867[0x3fff & i_34_];
        float f_39_ = Class348_Sub23.aFloatArray6865[0x3fff & i_34_];
        float f_40_ = f_35_ * f_38_;
        float f_41_ = f_39_ * f_35_;
        this.aFloat5762 = f_40_ * f_36_ + f_37_ * f_39_;
        this.aFloat5756 = f * f_37_;
        this.aFloat5770 = f_37_ * f_41_ + f_36_ * f_38_;
        this.aFloat5769 = f_38_ * f;
        this.aFloat5754 = -f_35_;
        this.aFloat5750 = f_39_ * f;
        this.aFloat5784 = f * f_36_;
        this.aFloat5781 = f_38_ * -f_37_ + f_36_ * f_41_;
        this.aFloat5761 = f_40_ * f_37_ + -f_36_ * f_39_;
        this.aFloat5751 = (this.aFloat5756 * (float) -i - this.aFloat5754 * (float) i_30_ - (float) i_31_ * this.aFloat5784);
        this.aFloat5747 = (-(this.aFloat5750 * (float) i_30_) + this.aFloat5770 * (float) -i - this.aFloat5781 * (float) i_31_);
        this.aFloat5772 = (-((float) i_31_ * this.aFloat5762) + (this.aFloat5761 * (float) -i - this.aFloat5769 * (float) i_30_));
    }

    final void method908(int i) {
        anInt5774++;
        float f = Class348_Sub23.aFloatArray6867[i & 0x3fff];
        float f_42_ = Class348_Sub23.aFloatArray6865[i & 0x3fff];
        float f_43_ = this.aFloat5770;
        float f_44_ = this.aFloat5750;
        float f_45_ = this.aFloat5781;
        this.aFloat5770 = f * f_43_ - this.aFloat5761 * f_42_;
        float f_46_ = this.aFloat5747;
        this.aFloat5761 = this.aFloat5761 * f + f_43_ * f_42_;
        this.aFloat5750 = -(this.aFloat5769 * f_42_) + f_44_ * f;
        this.aFloat5781 = -(f_42_ * this.aFloat5762) + f_45_ * f;
        this.aFloat5769 = f * this.aFloat5769 + f_42_ * f_44_;
        this.aFloat5762 = this.aFloat5762 * f + f_45_ * f_42_;
        this.aFloat5747 = -(f_42_ * this.aFloat5772) + f * f_46_;
        this.aFloat5772 = this.aFloat5772 * f + f_42_ * f_46_;
    }

    final float[] method940(int i) {
        Class288_Sub1.aFloatArray8575[0] = this.aFloat5770;
        Class288_Sub1.aFloatArray8575[9] = this.aFloat5762;
        Class288_Sub1.aFloatArray8575[12] = this.aFloat5747;
        anInt5777++;
        Class288_Sub1.aFloatArray8575[i] = this.aFloat5761;
        Class288_Sub1.aFloatArray8575[6] = this.aFloat5754;
        Class288_Sub1.aFloatArray8575[4] = this.aFloat5750;
        Class288_Sub1.aFloatArray8575[10] = this.aFloat5784;
        Class288_Sub1.aFloatArray8575[8] = this.aFloat5781;
        Class288_Sub1.aFloatArray8575[14] = this.aFloat5751;
        Class288_Sub1.aFloatArray8575[13] = this.aFloat5772;
        Class288_Sub1.aFloatArray8575[2] = this.aFloat5756;
        Class288_Sub1.aFloatArray8575[5] = this.aFloat5769;
        return Class288_Sub1.aFloatArray8575;
    }

    final Class101 method907() {
        anInt5748++;
        Class101_Sub3 class101_sub3_47_ = new Class101_Sub3();
        class101_sub3_47_.aFloat5747 = this.aFloat5747;
        class101_sub3_47_.aFloat5750 = this.aFloat5750;
        class101_sub3_47_.aFloat5769 = this.aFloat5769;
        class101_sub3_47_.aFloat5784 = this.aFloat5784;
        class101_sub3_47_.aFloat5772 = this.aFloat5772;
        class101_sub3_47_.aFloat5762 = this.aFloat5762;
        class101_sub3_47_.aFloat5781 = this.aFloat5781;
        class101_sub3_47_.aFloat5770 = this.aFloat5770;
        class101_sub3_47_.aFloat5756 = this.aFloat5756;
        class101_sub3_47_.aFloat5761 = this.aFloat5761;
        class101_sub3_47_.aFloat5751 = this.aFloat5751;
        class101_sub3_47_.aFloat5754 = this.aFloat5754;
        return class101_sub3_47_;
    }

    static final void method941(int i, int i_48_) {
        Class77.anInt1290 = i_48_;
        anInt5755++;
        if (i <= 113) aClass326_5764 = null;
    }

    final void method942(int i) {
        this.aFloat5754 = -this.aFloat5754;
        anInt5760++;
        this.aFloat5761 = -this.aFloat5761;
        if (i == 3128) {
            this.aFloat5769 = -this.aFloat5769;
            this.aFloat5756 = -this.aFloat5756;
            this.aFloat5784 = -this.aFloat5784;
            this.aFloat5762 = -this.aFloat5762;
            this.aFloat5772 = -this.aFloat5772;
            this.aFloat5751 = -this.aFloat5751;
        }
    }

    final void method892(int i, int i_49_, int i_50_, int[] is) {
        i_49_ -= this.aFloat5772;
        anInt5773++;
        i_50_ -= this.aFloat5751;
        i -= this.aFloat5747;
        is[0] = (int) (this.aFloat5756 * (float) i_50_ + ((float) i * this.aFloat5770 + (float) i_49_ * this.aFloat5761));
        is[2] = (int) (this.aFloat5781 * (float) i + (float) i_49_ * this.aFloat5762 + this.aFloat5784 * (float) i_50_);
        is[1] = (int) ((float) i_50_ * this.aFloat5754 + (this.aFloat5750 * (float) i + (float) i_49_ * this.aFloat5769));
    }

    static final Class348_Sub16_Sub3 method943(boolean bool) {
        anInt5776++;
        if (bool != false) method943(true);
        return Class98.aClass348_Sub16_Sub3_1564;
    }

    final void method898(Class101 class101) {
        anInt5758++;
        Class101_Sub3 class101_sub3_51_ = (Class101_Sub3) class101;
        this.aFloat5751 = class101_sub3_51_.aFloat5751;
        this.aFloat5769 = class101_sub3_51_.aFloat5769;
        this.aFloat5770 = class101_sub3_51_.aFloat5770;
        this.aFloat5781 = class101_sub3_51_.aFloat5781;
        this.aFloat5747 = class101_sub3_51_.aFloat5747;
        this.aFloat5754 = class101_sub3_51_.aFloat5754;
        this.aFloat5761 = class101_sub3_51_.aFloat5761;
        this.aFloat5772 = class101_sub3_51_.aFloat5772;
        this.aFloat5784 = class101_sub3_51_.aFloat5784;
        this.aFloat5762 = class101_sub3_51_.aFloat5762;
        this.aFloat5756 = class101_sub3_51_.aFloat5756;
        this.aFloat5750 = class101_sub3_51_.aFloat5750;
    }

    final void method895(int i) {
        anInt5780++;
        this.aFloat5769 = 1.0F;
        this.aFloat5770 = this.aFloat5784 = Class348_Sub23.aFloatArray6867[0x3fff & i];
        this.aFloat5781 = Class348_Sub23.aFloatArray6865[0x3fff & i];
        this.aFloat5756 = -this.aFloat5781;
        this.aFloat5750 = this.aFloat5747 = this.aFloat5761 = this.aFloat5762 = this.aFloat5772 = this.aFloat5754 = this.aFloat5751 = 0.0F;
    }

    final void method899(int i) {
        anInt5757++;
        this.aFloat5770 = 1.0F;
        this.aFloat5769 = this.aFloat5784 = Class348_Sub23.aFloatArray6867[0x3fff & i];
        this.aFloat5754 = Class348_Sub23.aFloatArray6865[0x3fff & i];
        this.aFloat5762 = -this.aFloat5754;
        this.aFloat5750 = this.aFloat5781 = this.aFloat5747 = this.aFloat5761 = this.aFloat5772 = this.aFloat5756 = this.aFloat5751 = 0.0F;
    }

    static final void method944(int i, byte[][] is, Class237_Sub1 class237_sub1) {
        try {
            if (i != -8212) method944(65, null, null);
            anInt5752++;
            for (int i_52_ = 0; i_52_ < class237_sub1.anInt3130; i_52_++) {
                Class369_Sub1.method3570(false);
                for (int i_53_ = 0; (i_53_ < Class367_Sub4.anInt7319 >> 3); i_53_++) {
                    for (int i_54_ = 0; (Class348_Sub40_Sub3.anInt9109 >> 3 > i_54_); i_54_++) {
                        int i_55_ = (Class62.anIntArrayArrayArray1116[i_52_][i_53_][i_54_]);
                        if (i_55_ != -1) {
                            int i_56_ = 0x3 & i_55_ >> 24;
                            if (!class237_sub1.aBoolean3109 || i_56_ == 0) {
                                int i_57_ = (0x6 & i_55_) >> 1;
                                int i_58_ = i_55_ >> 14 & 0x3ff;
                                int i_59_ = (0x3ff9 & i_55_) >> 3;
                                int i_60_ = i_59_ / 8 + (i_58_ / 8 << 8);
                                for (int i_61_ = 0; i_61_ < Class348_Sub23_Sub3.anIntArray9042.length; i_61_++) {
                                    if (i_60_ == (Class348_Sub23_Sub3.anIntArray9042[i_61_]) && is[i_61_] != null) {
                                        class237_sub1.method1692((i_58_ & 0x7) * 8, i_57_, is[i_61_], i_56_, (i_59_ & 0x7) * 8, Class348_Sub8.aHa6654, 8 * i_54_, 8 * i_53_, i + 8219, Class348_Sub45.aClass361Array7108, i_52_);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("iaa.W(" + i + ',' + (is != null ? "{...}" : "null") + ',' + (class237_sub1 != null ? "{...}" : "null") + ')'));
        }
    }

    final void method910() {
        anInt5759++;
        this.aFloat5770 = this.aFloat5769 = this.aFloat5784 = 1.0F;
        this.aFloat5761 = this.aFloat5756 = this.aFloat5750 = this.aFloat5754 = this.aFloat5781 = this.aFloat5762 = this.aFloat5747 = this.aFloat5772 = this.aFloat5751 = 0.0F;
    }

    final void method896(int i) {
        anInt5766++;
        float f = Class348_Sub23.aFloatArray6867[i & 0x3fff];
        float f_62_ = Class348_Sub23.aFloatArray6865[i & 0x3fff];
        float f_63_ = this.aFloat5770;
        float f_64_ = this.aFloat5750;
        float f_65_ = this.aFloat5781;
        this.aFloat5770 = f_63_ * f + this.aFloat5756 * f_62_;
        float f_66_ = this.aFloat5747;
        this.aFloat5756 = f * this.aFloat5756 - f_62_ * f_63_;
        this.aFloat5750 = f * f_64_ + f_62_ * this.aFloat5754;
        this.aFloat5754 = -(f_64_ * f_62_) + this.aFloat5754 * f;
        this.aFloat5781 = f * f_65_ + this.aFloat5784 * f_62_;
        this.aFloat5784 = -(f_65_ * f_62_) + f * this.aFloat5784;
        this.aFloat5747 = this.aFloat5751 * f_62_ + f * f_66_;
        this.aFloat5751 = this.aFloat5751 * f - f_62_ * f_66_;
    }

    final float[] method945(boolean bool) {
        if (bool != true) this.aFloat5756 = 0.66213727F;
        Class288_Sub1.aFloatArray8575[14] = 0.0F;
        Class288_Sub1.aFloatArray8575[0] = this.aFloat5770;
        Class288_Sub1.aFloatArray8575[13] = 0.0F;
        Class288_Sub1.aFloatArray8575[1] = this.aFloat5761;
        Class288_Sub1.aFloatArray8575[12] = 0.0F;
        Class288_Sub1.aFloatArray8575[10] = this.aFloat5784;
        Class288_Sub1.aFloatArray8575[5] = this.aFloat5769;
        Class288_Sub1.aFloatArray8575[6] = this.aFloat5754;
        Class288_Sub1.aFloatArray8575[9] = this.aFloat5762;
        anInt5778++;
        Class288_Sub1.aFloatArray8575[2] = this.aFloat5756;
        Class288_Sub1.aFloatArray8575[4] = this.aFloat5750;
        Class288_Sub1.aFloatArray8575[8] = this.aFloat5781;
        return Class288_Sub1.aFloatArray8575;
    }

    final void method946(Class101 class101, int i) {
        anInt5771++;
        Class101_Sub3 class101_sub3_67_ = (Class101_Sub3) class101;
        this.aFloat5781 = class101_sub3_67_.aFloat5756;
        if (i != -7929) method899(52);
        this.aFloat5750 = class101_sub3_67_.aFloat5761;
        this.aFloat5770 = class101_sub3_67_.aFloat5770;
        this.aFloat5756 = class101_sub3_67_.aFloat5781;
        this.aFloat5762 = class101_sub3_67_.aFloat5754;
        this.aFloat5761 = class101_sub3_67_.aFloat5750;
        this.aFloat5769 = class101_sub3_67_.aFloat5769;
        this.aFloat5747 = -((class101_sub3_67_.aFloat5772 * this.aFloat5750) + (class101_sub3_67_.aFloat5747 * this.aFloat5770) + (class101_sub3_67_.aFloat5751 * this.aFloat5781));
        this.aFloat5754 = class101_sub3_67_.aFloat5762;
        this.aFloat5784 = class101_sub3_67_.aFloat5784;
        this.aFloat5772 = -((class101_sub3_67_.aFloat5772 * this.aFloat5769) + (class101_sub3_67_.aFloat5747 * this.aFloat5761) + (class101_sub3_67_.aFloat5751 * this.aFloat5762));
        this.aFloat5751 = -((this.aFloat5756 * class101_sub3_67_.aFloat5747) + (this.aFloat5754 * class101_sub3_67_.aFloat5772) + (class101_sub3_67_.aFloat5751 * this.aFloat5784));
    }

    static final void method947(byte i) {
        anInt5783++;
        if (i != 41) anInt5768 = 38;
        for (Class348_Sub9 class348_sub9 = (Class348_Sub9) Class218.aClass262_2859.method1995(4); class348_sub9 != null; class348_sub9 = (Class348_Sub9) Class218.aClass262_2859.method1990((byte) 117)) {
            if (class348_sub9.aBoolean6684) class348_sub9.method2781((byte) 21);
        }
        for (Class348_Sub9 class348_sub9 = (Class348_Sub9) client.aClass262_5185.method1995(4); class348_sub9 != null; class348_sub9 = ((Class348_Sub9) client.aClass262_5185.method1990((byte) 39))) {
            if (class348_sub9.aBoolean6684) class348_sub9.method2781((byte) 21);
        }
    }

    public Class101_Sub3() {
        method910();
    }

    final void method905(int i, int i_68_, int i_69_, int[] is) {
        anInt5753++;
        is[1] = (int) ((float) i_69_ * this.aFloat5762 + ((float) i_68_ * this.aFloat5769 + this.aFloat5761 * (float) i));
        is[2] = (int) (this.aFloat5754 * (float) i_68_ + this.aFloat5756 * (float) i + (float) i_69_ * this.aFloat5784);
        is[0] = (int) (this.aFloat5750 * (float) i_68_ + this.aFloat5770 * (float) i + this.aFloat5781 * (float) i_69_);
    }
}
