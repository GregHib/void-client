/* Class370 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class370 {
    int anInt4514;
    private float[][] aFloatArrayArray4515;
    private final int[] anIntArray4516;
    private int[] anIntArray4517;
    private final int anInt4518;
    private int[] anIntArray4519;

    private final void method3579() {
        int[] is = new int[anInt4518];
        int[] is_0_ = new int[33];
        for (int i = 0; i < anInt4518; i++) {
            int i_1_ = anIntArray4516[i];
            if (i_1_ != 0) {
                int i_2_ = 1 << 32 - i_1_;
                int i_3_ = is_0_[i_1_];
                is[i] = i_3_;
                int i_4_;
                if ((i_3_ & i_2_) == 0) {
                    i_4_ = i_3_ | i_2_;
                    for (int i_5_ = i_1_ - 1; i_5_ >= 1; i_5_--) {
                        int i_6_ = is_0_[i_5_];
                        if (i_6_ != i_3_) break;
                        int i_7_ = 1 << 32 - i_5_;
                        if ((i_6_ & i_7_) != 0) {
                            is_0_[i_5_] = is_0_[i_5_ - 1];
                            break;
                        }
                        is_0_[i_5_] = i_6_ | i_7_;
                    }
                } else i_4_ = is_0_[i_1_ - 1];
                is_0_[i_1_] = i_4_;
                for (int i_8_ = i_1_ + 1; i_8_ <= 32; i_8_++) {
                    int i_9_ = is_0_[i_8_];
                    if (i_9_ == i_3_) is_0_[i_8_] = i_4_;
                }
            }
        }
        anIntArray4519 = new int[8];
        int i = 0;
        for (int i_10_ = 0; i_10_ < anInt4518; i_10_++) {
            int i_11_ = anIntArray4516[i_10_];
            if (i_11_ != 0) {
                int i_12_ = is[i_10_];
                int i_13_ = 0;
                for (int i_14_ = 0; i_14_ < i_11_; i_14_++) {
                    int i_15_ = -2147483648 >>> i_14_;
                    if ((i_12_ & i_15_) != 0) {
                        if (anIntArray4519[i_13_] == 0) anIntArray4519[i_13_] = i;
                        i_13_ = anIntArray4519[i_13_];
                    } else i_13_++;
                    if (i_13_ >= anIntArray4519.length) {
                        int[] is_16_ = new int[anIntArray4519.length * 2];
                        for (int i_17_ = 0; i_17_ < anIntArray4519.length; i_17_++)
                            is_16_[i_17_] = anIntArray4519[i_17_];
                        anIntArray4519 = is_16_;
                    }
                    i_15_ >>>= 1;
                }
                anIntArray4519[i_13_] = ~i_10_;
                if (i_13_ >= i) i = i_13_ + 1;
            }
        }
    }

    private static final int method3580(int i, int i_18_) {
        int i_19_;
        for (i_19_ = (int) Math.pow(i, 1.0 / (double) i_18_) + 1; Class348_Sub49.method3331(i_18_, (byte) 64, i_19_) > i; i_19_--) {
            /* empty */
        }
        return i_19_;
    }

    final int method3581() {
        int i;
        for (i = 0; anIntArray4519[i] >= 0; i = (Class348_Sub10.method2788() != 0 ? anIntArray4519[i] : i + 1)) {
            /* empty */
        }
        return ~anIntArray4519[i];
    }

    final float[] method3582() {
        return aFloatArrayArray4515[method3581()];
    }

    Class370() {
        Class348_Sub10.method2789(24);
        this.anInt4514 = Class348_Sub10.method2789(16);
        anInt4518 = Class348_Sub10.method2789(24);
        anIntArray4516 = new int[anInt4518];
        boolean bool = Class348_Sub10.method2788() != 0;
        if (bool) {
            int i = 0;
            int i_20_ = Class348_Sub10.method2789(5) + 1;
            while (i < anInt4518) {
                int i_21_ = Class348_Sub10.method2789(Class299.method2253(anInt4518 - i, 126));
                for (int i_22_ = 0; i_22_ < i_21_; i_22_++)
                    anIntArray4516[i++] = i_20_;
                i_20_++;
            }
        } else {
            boolean bool_23_ = Class348_Sub10.method2788() != 0;
            for (int i = 0; i < anInt4518; i++) {
                if (bool_23_ && Class348_Sub10.method2788() == 0) anIntArray4516[i] = 0;
                else anIntArray4516[i] = Class348_Sub10.method2789(5) + 1;
            }
        }
        method3579();
        int i = Class348_Sub10.method2789(4);
        if (i > 0) {
            float f = Class348_Sub10.method2786(Class348_Sub10.method2789(32));
            float f_24_ = Class348_Sub10.method2786(Class348_Sub10.method2789(32));
            int i_25_ = Class348_Sub10.method2789(4) + 1;
            boolean bool_26_ = Class348_Sub10.method2788() != 0;
            int i_27_;
            if (i == 1) i_27_ = method3580(anInt4518, this.anInt4514);
            else i_27_ = anInt4518 * this.anInt4514;
            anIntArray4517 = new int[i_27_];
            for (int i_28_ = 0; i_28_ < i_27_; i_28_++)
                anIntArray4517[i_28_] = Class348_Sub10.method2789(i_25_);
            aFloatArrayArray4515 = new float[anInt4518][this.anInt4514];
            if (i == 1) {
                for (int i_29_ = 0; i_29_ < anInt4518; i_29_++) {
                    float f_30_ = 0.0F;
                    int i_31_ = 1;
                    for (int i_32_ = 0; i_32_ < this.anInt4514; i_32_++) {
                        int i_33_ = i_29_ / i_31_ % i_27_;
                        float f_34_ = ((float) anIntArray4517[i_33_] * f_24_ + f + f_30_);
                        aFloatArrayArray4515[i_29_][i_32_] = f_34_;
                        if (bool_26_) f_30_ = f_34_;
                        i_31_ *= i_27_;
                    }
                }
            } else {
                for (int i_35_ = 0; i_35_ < anInt4518; i_35_++) {
                    float f_36_ = 0.0F;
                    int i_37_ = i_35_ * this.anInt4514;
                    for (int i_38_ = 0; i_38_ < this.anInt4514; i_38_++) {
                        float f_39_ = ((float) anIntArray4517[i_37_] * f_24_ + f + f_36_);
                        aFloatArrayArray4515[i_35_][i_38_] = f_39_;
                        if (bool_26_) f_36_ = f_39_;
                        i_37_++;
                    }
                }
            }
        }
    }
}
