/* Class348_Sub49_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class348_Sub49_Sub2 extends Class348_Sub49 {
    static int anInt9752;
    static int anInt9753;
    private int anInt9754;
    static int anInt9755;
    private Class77 aClass77_9756;
    static int[] anIntArray9757;
    static int anInt9758;
    static int anInt9759;
    static int anInt9760;
    static int anInt9761;
    static int anInt9762;
    static int anInt9763;
    static int anInt9764;
    static int anInt9765;
    static int anInt9766;
    static int anInt9767;
    static short[] aShortArray9768 = {11, 17, 45, 23, 48, 8, 57, 58};
    static int anInt9769;

    final boolean method3404(int i) {
        anInt9758++;
        if (i != -1510) return true;
        int i_0_ = (((this.aByteArray7154[this.anInt7197]) - aClass77_9756.method778((byte) 19)) & 0xff);
        return i_0_ >= 128;
    }

    static final int method3405(int i, boolean bool) {
        anInt9765++;
        if (Class348_Sub1.anIntArray6547 == null) return 0;
        if (!bool && Class199.aClass352Array2636 != null) return Class348_Sub1.anIntArray6547.length * 2;
        int i_1_ = 0;
        if (i != 2012104999) method3405(118, false);
        for (int i_2_ = 0; Class348_Sub1.anIntArray6547.length > i_2_; i_2_++) {
            int i_3_ = Class348_Sub1.anIntArray6547[i_2_];
            if (Class39.aClass45_518.method421(false, i_3_)) i_1_++;
            if (s.aClass45_4585.method421(false, i_3_)) i_1_++;
        }
        return i_1_;
    }

    final void method3406(int i, int[] is) {
        anInt9755++;
        aClass77_9756 = new Class77(is);
        if (i > -41) anIntArray9757 = null;
    }

    final int method3407(int i) {
        anInt9752++;
        int i_4_ = (((this.aByteArray7154[this.anInt7197++]) - aClass77_9756.method781((byte) -67)) & 0xff);
        if (i_4_ < 128) return i_4_;
        if (i != 15295) anIntArray9757 = null;
        return ((((this.aByteArray7154[this.anInt7197++]) - aClass77_9756.method781((byte) -62)) & 0xff) + (i_4_ + -128 << 8));
    }

    final void method3408(int i, int i_5_) {
        this.aByteArray7154[this.anInt7197++] = (byte) (i + aClass77_9756.method781((byte) -85));
        if (i_5_ == 18676) anInt9760++;
    }

    final void method3409(int i, byte[] is, int i_6_, int i_7_) {
        if (i_7_ == -32769) {
            for (int i_8_ = 0; i_8_ < i; i_8_++)
                is[i_6_ + i_8_] = (byte) ((this.aByteArray7154[this.anInt7197++]) + -aClass77_9756.method781((byte) -99));
            anInt9762++;
        }
    }

    final int readBits(byte i, int i_9_) {
        if (i != -24) return -126;
        anInt9763++;
        int i_10_ = anInt9754 >> 3;
        int i_11_ = 8 + -(anInt9754 & 0x7);
        anInt9754 += i_9_;
        int i_12_ = 0;
        for (/**/; i_11_ < i_9_; i_11_ = 8) {
            i_12_ += (this.aByteArray7154[i_10_++] & Class348_Sub34.anIntArray6972[i_11_]) << i_9_ - i_11_;
            i_9_ -= i_11_;
        }
        if (i_11_ != i_9_) i_12_ += (this.aByteArray7154[i_10_] >> i_11_ - i_9_) & Class348_Sub34.anIntArray6972[i_9_];
        else i_12_ += (Class348_Sub34.anIntArray6972[i_11_] & this.aByteArray7154[i_10_]);
        return i_12_;
    }

    static final void method3411(int i, int i_13_, int i_14_) {
        anInt9761++;
        Class348_Sub42_Sub15 class348_sub42_sub15 = Class318_Sub9_Sub1.method2516(i, (byte) 105, i_13_);
        class348_sub42_sub15.method3246(-25490);
        class348_sub42_sub15.anInt9652 = i_14_;
    }

    final void method3412(boolean bool) {
        anInt9753++;
        this.anInt7197 = (7 + anInt9754) / 8;
        if (bool != false) aShortArray9768 = null;
    }

    static final int[][] method3413(int i, int i_15_, int i_16_, int i_17_, int i_18_, boolean bool, int i_19_, float f, boolean bool_20_) {
        anInt9764++;
        int[][] is = new int[i_18_][i_16_];
        Class348_Sub40_Sub8 class348_sub40_sub8 = new Class348_Sub40_Sub8();
        class348_sub40_sub8.anInt9149 = (int) (f * 4096.0F);
        class348_sub40_sub8.anInt9150 = i_15_;
        class348_sub40_sub8.anInt9158 = i_17_;
        class348_sub40_sub8.anInt9164 = i;
        class348_sub40_sub8.aBoolean9160 = bool_20_;
        class348_sub40_sub8.method3044(109);
        Class79.method797(i_18_, i_16_, (byte) 120);
        if (bool != true) anIntArray9757 = null;
        for (int i_21_ = 0; i_21_ < i_18_; i_21_++)
            class348_sub40_sub8.method3069(i_21_, is[i_21_], (byte) 99);
        return is;
    }

    public static void method3414(int i) {
        aShortArray9768 = null;
        if (i == 21515) anIntArray9757 = null;
    }

    final int method3415(int i, int i_22_) {
        if (i >= -58) method3405(50, true);
        anInt9769++;
        return -anInt9754 + i_22_ * 8;
    }

    final void method3416(int i, Class77 class77) {
        int i_23_ = -103 / ((i - 57) / 40);
        aClass77_9756 = class77;
        anInt9766++;
    }

    Class348_Sub49_Sub2(int i) {
        super(i);
    }

    final void method3417(int i) {
        int i_24_ = -126 / ((-15 - i) / 49);
        anInt9767++;
        anInt9754 = 8 * this.anInt7197;
    }
}
