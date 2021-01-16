/* Class239_Sub25 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class239_Sub25 extends Class239 {
    static int anInt6099;
    static int anInt6100;
    static int anInt6101;
    static int anInt6102;
    static Class318_Sub9_Sub2_Sub1[] aClass318_Sub9_Sub2_Sub1Array6103;
    static int anInt6104;
    static int anInt6105;
    static int anInt6106;
    static int anInt6107;
    static int anInt6108;
    static int anInt6109;
    private boolean aBoolean6110 = true;
    static int anInt6111;
    static int anInt6112;
    boolean aBoolean6113 = false;

    final int method1714(int i, int i_0_) {
        anInt6100++;
        if (i != 3)
            aBoolean6110 = false;
        if (!this.aClass348_Sub51_3136.method3428((byte) -89)
                .method1460(-38))
            return 3;
        if (i_0_ == 3
                && !Applet_Sub1.method86("jagdx", i ^ 0x3))
            return 3;
        return 2;
    }

    final void method1712(int i, int i_1_) {
        int i_2_ = -50 / ((i - 82) / 35);
        this.anInt3138 = i_1_;
        anInt6106++;
        this.aBoolean6113 = false;
    }

    static final void method1825(int i, int i_3_, int i_4_) {
        anInt6102++;
        Class348_Sub42_Sub15 class348_sub42_sub15
                = Class318_Sub9_Sub1.method2516(0, (byte) 105, 15);
        class348_sub42_sub15.method3246(-25490);
        class348_sub42_sub15.anInt9652 = i_4_;
        class348_sub42_sub15.anInt9651 = i_3_;
        if (i < 57)
            method1828(5);
    }

    final void method1826(boolean bool, int i) {
        aBoolean6110 = bool;
        anInt6109++;
        if (i != -142238264)
            method1828(20);
    }

    static final void method1827(int i) {
        anInt6112++;
        if (Class126.anIntArray4983 == null)
            Class126.anIntArray4983 = new int[65536];
        else
            return;
        double d = 0.7 + (0.03 * Math.random() - 0.015);
        int i_5_ = 0;
        if (i == 1415665776) {
            for (int i_6_ = 0; i_6_ < 512; i_6_++) {
                float f = (((float) (i_6_ >> -1851515709) / 64.0F + 0.0078125F)
                        * 360.0F);
                float f_7_ = (float) (i_6_ & 0x7) / 8.0F + 0.0625F;
                for (int i_8_ = 0; i_8_ < 128; i_8_++) {
                    float f_9_ = (float) i_8_ / 128.0F;
                    float f_10_ = 0.0F;
                    float f_11_ = 0.0F;
                    float f_12_ = 0.0F;
                    float f_13_ = f / 60.0F;
                    int i_14_ = (int) f_13_;
                    int i_15_ = i_14_ % 6;
                    float f_16_ = (float) -i_14_ + f_13_;
                    float f_17_ = f_9_ * (-f_7_ + 1.0F);
                    float f_18_ = f_9_ * (1.0F - f_16_ * f_7_);
                    float f_19_ = (1.0F - (1.0F - f_16_) * f_7_) * f_9_;
                    if (i_15_ == 0) {
                        f_10_ = f_9_;
                        f_11_ = f_19_;
                        f_12_ = f_17_;
                    } else if (i_15_ == 1) {
                        f_11_ = f_9_;
                        f_10_ = f_18_;
                        f_12_ = f_17_;
                    } else if (i_15_ == 2) {
                        f_12_ = f_19_;
                        f_10_ = f_17_;
                        f_11_ = f_9_;
                    } else if (i_15_ == 3) {
                        f_12_ = f_9_;
                        f_11_ = f_18_;
                        f_10_ = f_17_;
                    } else if (i_15_ == 4) {
                        f_12_ = f_9_;
                        f_11_ = f_17_;
                        f_10_ = f_19_;
                    } else if (i_15_ == 5) {
                        f_10_ = f_9_;
                        f_11_ = f_17_;
                        f_12_ = f_18_;
                    }
                    f_10_ = (float) Math.pow(f_10_, d);
                    f_11_ = (float) Math.pow(f_11_, d);
                    f_12_ = (float) Math.pow(f_12_, d);
                    int i_20_ = (int) (f_10_ * 256.0F);
                    int i_21_ = (int) (256.0F * f_11_);
                    int i_22_ = (int) (256.0F * f_12_);
                    int i_23_
                            = ((i_21_ << -142238264)
                            + ((i_20_ << 1415665776) + (-16777216 + i_22_)));
                    Class126.anIntArray4983[i_5_++] = i_23_;
                }
            }
        }
    }

    final int method1710(int i) {
        this.aBoolean6113 = true;
        anInt6101++;
        if (i != 20014)
            aBoolean6110 = false;
        if (!this.aClass348_Sub51_3136.method3428((byte) -113)
                .method1460(i + -20083))
            return 0;
        return 2;
    }

    Class239_Sub25(int i, Class348_Sub51 class348_sub51) {
        super(i, class348_sub51);
    }

    Class239_Sub25(Class348_Sub51 class348_sub51) {
        super(class348_sub51);
    }

    static final void method1828(int i) {
        if (i < 20)
            method1832(47);
        anInt6104++;
        synchronized (Class342.aClass60_4254) {
            Class342.aClass60_4254.method590(0);
        }
    }

    final void method1716(boolean bool) {
        anInt6108++;
        if (!this.aClass348_Sub51_3136.method3428((byte) -106)
                .method1460(-33))
            this.anInt3138 = 0;
        if (bool != false)
            method1829(31);
        if (this.anInt3138 < 0 || this.anInt3138 > 5)
            this.anInt3138 = method1710(20014);
    }

    final int method1829(int i) {
        anInt6107++;
        if (i != -32350)
            aBoolean6110 = false;
        return this.anInt3138;
    }

    final boolean method1830(byte i) {
        anInt6099++;
        if (i >= -93)
            aBoolean6110 = false;
        return aBoolean6110;
    }

    final boolean method1831(int i) {
        anInt6105++;
        if (i < 85)
            return true;
        return this.aClass348_Sub51_3136.method3428((byte) -124)
                .method1460(-59);
    }

    public static void method1832(int i) {
        if (i != 1)
            method1828(33);
        aClass318_Sub9_Sub2_Sub1Array6103 = null;
    }
}
