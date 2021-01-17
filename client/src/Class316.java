/* Class316 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class316 {
    static int anInt3958;
    static Class348_Sub51 aClass348_Sub51_3959;
    static int anInt3960;
    private final int[] anIntArray3961;
    static int anInt3962;
    static Class348_Sub42_Sub12 aClass348_Sub42_Sub12_3963;
    static int anInt3964;
    static int anInt3965;
    static int anInt3966;

    static final void method2363(int i) {
        if (i <= -39) {
            anInt3958++;
            if (Class275.method2066((byte) 106)) {
                if (Class286_Sub1.aStringArray6200 == null) Class14_Sub3.method249(2);
                Class168.anInt2254 = 0;
                Class351.aBoolean4328 = true;
            }
        }
    }

    static final void method2364(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_) {
        if (i_7_ == 3) {
            if (i_3_ != i_1_ || i_2_ != i_6_ || i_5_ != i_0_ || i_8_ != i_4_) {
                int i_9_ = i_1_;
                int i_10_ = i_6_;
                int i_11_ = i_1_ * 3;
                int i_12_ = 3 * i_6_;
                int i_13_ = i_3_ * 3;
                int i_14_ = 3 * i_2_;
                int i_15_ = 3 * i_0_;
                int i_16_ = i_4_ * 3;
                int i_17_ = -i_1_ + (i_13_ + i_5_) + -i_15_;
                int i_18_ = -i_6_ + (i_8_ + (-i_16_ - -i_14_));
                int i_19_ = -i_13_ + -i_13_ + (i_15_ + i_11_);
                int i_20_ = i_12_ + -i_14_ + (i_16_ - i_14_);
                int i_21_ = -i_11_ + i_13_;
                int i_22_ = -i_12_ + i_14_;
                for (int i_23_ = 128; i_23_ <= 4096; i_23_ += 128) {
                    int i_24_ = i_23_ * i_23_ >> 12;
                    int i_25_ = i_24_ * i_23_ >> 12;
                    int i_26_ = i_17_ * i_25_;
                    int i_27_ = i_18_ * i_25_;
                    int i_28_ = i_19_ * i_24_;
                    int i_29_ = i_24_ * i_20_;
                    int i_30_ = i_23_ * i_21_;
                    int i_31_ = i_22_ * i_23_;
                    int i_32_ = i_1_ - -(i_26_ - (-i_28_ + -i_30_) >> 12);
                    int i_33_ = i_6_ - -(i_29_ + (i_27_ - -i_31_) >> 12);
                    Class339.method2665(i_9_, (byte) 109, i, i_10_, i_33_, i_32_);
                    i_9_ = i_32_;
                    i_10_ = i_33_;
                }
            } else Class339.method2665(i_1_, (byte) 73, i, i_6_, i_8_, i_5_);
            anInt3964++;
        }
    }

    Class316(int[] is) {
        int i;
        for (i = 1; is.length - -(is.length >> 1) >= i; i <<= 1) {
            /* empty */
        }
        anIntArray3961 = new int[i + i];
        for (int i_34_ = 0; i_34_ < i + i; i_34_++)
            anIntArray3961[i_34_] = -1;
        for (int i_35_ = 0; is.length > i_35_; i_35_++) {
            int i_36_;
            for (i_36_ = is[i_35_] & -1 + i; anIntArray3961[i_36_ - -i_36_ - -1] != -1; i_36_ = -1 + i & 1 + i_36_) {
                /* empty */
            }
            anIntArray3961[i_36_ + i_36_] = is[i_35_];
            anIntArray3961[i_36_ - (-i_36_ + -1)] = i_35_;
        }
    }

    final int method2365(int i, int i_37_) {
        anInt3960++;
        if (i != 1) method2365(-74, 111);
        int i_38_ = -1 + (anIntArray3961.length >> 1);
        int i_39_ = i_38_ & i_37_;
        for (; ; ) {
            int i_40_ = anIntArray3961[i_39_ + i_39_ - -1];
            if (i_40_ == -1) return -1;
            if (i_37_ == anIntArray3961[i_39_ + i_39_]) return i_40_;
            i_39_ = i_38_ & 1 + i_39_;
        }
    }

    public static void method2366(boolean bool) {
        aClass348_Sub42_Sub12_3963 = null;
        aClass348_Sub51_3959 = null;
        if (bool != true) method2368(46);
    }

    static final String method2367(byte i, Class348_Sub42_Sub12 class348_sub42_sub12) {
        anInt3962++;
        int i_41_ = 9 / ((79 - i) / 46);
        if (class348_sub42_sub12.aString9595 == null || class348_sub42_sub12.aString9595.length() == 0) {
            if ((class348_sub42_sub12.aString9601 == null) || class348_sub42_sub12.aString9601.length() <= 0) return (class348_sub42_sub12.aString9593);
            return (class348_sub42_sub12.aString9593 + Class274.aClass274_3515.method2063(Class348_Sub33.anInt6967, 544) + (class348_sub42_sub12.aString9601));
        }
        if (class348_sub42_sub12.aString9601 == null || class348_sub42_sub12.aString9601.length() <= 0) return (class348_sub42_sub12.aString9593 + Class274.aClass274_3515.method2063(Class348_Sub33.anInt6967, 544) + (class348_sub42_sub12.aString9595));
        return (class348_sub42_sub12.aString9593 + Class274.aClass274_3515.method2063(Class348_Sub33.anInt6967, 544) + class348_sub42_sub12.aString9601 + Class274.aClass274_3515.method2063(Class348_Sub33.anInt6967, 544) + class348_sub42_sub12.aString9595);
    }

    static final void method2368(int i) {
        Class15.aClass60_225.method590(0);
        anInt3965++;
        if (i != -1) aClass348_Sub51_3959 = null;
    }
}
