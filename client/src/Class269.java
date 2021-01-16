/* Class269 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class269 {
    static int anInt3450;
    static int anInt3451;
    Interface18_Impl1 anInterface18_Impl1_3452 = null;
    static Class217 aClass217_3453;
    private Interface18_Impl3[] anInterface18_Impl3Array3454;
    Interface18_Impl1 anInterface18_Impl1_3455 = null;
    static int anInt3456;
    private final ha_Sub3 aHa_Sub3_3457;
    boolean aBoolean3458;
    Interface18_Impl3[] anInterface18_Impl3Array3459;
    static int anInt3460;
    static int anInt3461;
    static float aFloat3462;

    final boolean method2039(int i) {
        anInt3461++;
        if (i < 81)
            this.anInterface18_Impl1_3452 = null;
        if (!this.aBoolean3458) {
            return this.anInterface18_Impl3Array3459 != null;
        }
        return this.anInterface18_Impl1_3452 != null;
    }

    static final void method2040(int i, boolean bool) {
        Class185.anInt2482 = i;
        if (bool != true)
            aFloat3462 = -0.54794437F;
        anInt3450++;
        synchronized (Class342.aClass60_4254) {
            Class342.aClass60_4254.method590(0);
        }
    }

    final boolean method2041(byte i) {
        if (i < 42)
            aFloat3462 = 2.1357973F;
        if (this.anInterface18_Impl1_3455 == null) {
            if (Class262.anObject3331 == null) {
                byte[] is
                        = Class5_Sub2.method194(128, -1922, 8, 0.6F, 128, 4.0F,
                        4.0F, 0.5F, 16.0F,
                        new Class186_Sub1(419684), 16);
                Class262.anObject3331
                        = Class179.method1357(is, false, (byte) 87);
            }
            byte[] is = Class50_Sub1.method461(false, Class262.anObject3331,
                    53146732);
            byte[] is_0_ = new byte[4 * is.length];
            int i_1_ = 0;
            for (int i_2_ = 0; i_2_ < 16; i_2_++) {
                int i_3_ = 128 * (i_2_ * 128);
                int i_4_ = i_3_;
                for (int i_5_ = 0; (i_5_ ^ 0xffffffff) > -129; i_5_++) {
                    int i_6_ = 128 * i_5_ + i_4_;
                    int i_7_ = (0x7f & -1 + i_5_) * 128 + i_4_;
                    int i_8_ = i_4_ + 128 * (0x7f & 1 + i_5_);
                    for (int i_9_ = 0; (i_9_ ^ 0xffffffff) > -129; i_9_++) {
                        float f = (float) ((is[i_9_ + i_7_] & 0xff)
                                - (is[i_9_ + i_8_] & 0xff));
                        float f_10_
                                = (float) ((0xff & is[(-1 + i_9_ & 0x7f) + i_6_])
                                - (0xff
                                & is[i_6_ - -(i_9_ - -1 & 0x7f)]));
                        float f_11_
                                = (float) (128.0
                                / (Math.sqrt
                                (f * f
                                        + (16384.0F
                                        + f_10_ * f_10_))));
                        is_0_[i_1_++] = (byte) (int) (f_10_ * f_11_ + 127.0F);
                        is_0_[i_1_++] = (byte) (int) (128.0F * f_11_ + 127.0F);
                        is_0_[i_1_++] = (byte) (int) (f_11_ * f + 127.0F);
                        is_0_[i_1_++] = is[i_3_++];
                    }
                }
            }
            this.anInterface18_Impl1_3455
                    = aHa_Sub3_3457.method3872(16, 128, Class108.aClass304_1662,
                    true, 128, is_0_);
        }
        anInt3456++;
        return this.anInterface18_Impl1_3455 != null;
    }

    public static void method2042(byte i) {
        if (i == -67)
            aClass217_3453 = null;
    }

    Class269(ha_Sub3 var_ha_Sub3) {
        anInterface18_Impl3Array3454 = null;
        this.anInterface18_Impl3Array3459 = null;
        aHa_Sub3_3457 = var_ha_Sub3;
        this.aBoolean3458
                = aHa_Sub3_3457.aBoolean8159;
        if (this.aBoolean3458
                && !aHa_Sub3_3457.method3931(true, Class191.aClass304_2571,
                Class68.aClass68_1183))
            this.aBoolean3458 = false;
        if (this.aBoolean3458
                || aHa_Sub3_3457.method3880(Class68.aClass68_1183,
                Class191.aClass304_2571, (byte) 123)) {
            OutputStream_Sub1.method134((byte) -126);
            if (!this.aBoolean3458) {
                this.anInterface18_Impl3Array3459
                        = new Interface18_Impl3[16];
                for (int i = 0; i < 16; i++) {
                    byte[] is
                            = Class173.method1331((byte) 100,
                            Class355.anObject4366,
                            128 * (i * 128 * 2), 32768);
                    this.anInterface18_Impl3Array3459[i]
                            = aHa_Sub3_3457.method3944(is, 128,
                            Class191.aClass304_2571, 2,
                            true, 128);
                }
                anInterface18_Impl3Array3454 = new Interface18_Impl3[16];
                for (int i = 0; (i ^ 0xffffffff) > -17; i++) {
                    byte[] is
                            = Class173.method1331((byte) 120,
                            Class227.anObject2969,
                            128 * (128 * i) * 2, 32768);
                    anInterface18_Impl3Array3454[i]
                            = aHa_Sub3_3457.method3944(is, 128,
                            Class191.aClass304_2571, 2,
                            true, 128);
                }
            } else {
                byte[] is
                        = Class50_Sub1.method461(false, Class355.anObject4366,
                        53146732);
                this.anInterface18_Impl1_3452
                        = aHa_Sub3_3457.method3872(16, 128,
                        Class191.aClass304_2571, true,
                        128, is);
                is = Class50_Sub1.method461(false, Class227.anObject2969,
                        53146732);
                aHa_Sub3_3457.method3872(16, 128, Class191.aClass304_2571,
                        true, 128, is);
            }
        }
    }
}
