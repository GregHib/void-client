/* Class324_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaggl.OpenGL;

final class Class324_Sub5 extends Class324 {
    private final ha_Sub2 aHa_Sub2_6509;
    private final Class61 aClass61_6510;
    private final Class258_Sub3_Sub1 aClass258_Sub3_Sub1_6511;
    private final boolean aBoolean6512;

    Class324_Sub5(ha_Sub2 var_ha_Sub2, Class143 class143, Class207[] class207s,
                  boolean bool) {
        super(var_ha_Sub2, class143);
        aHa_Sub2_6509 = var_ha_Sub2;
        int i = 0;
        for (int i_0_ = 0; i_0_ < 256; i_0_++) {
            Class207 class207 = class207s[i_0_];
            if (class207.anInt2696 > i)
                i = class207.anInt2696;
            if (class207.anInt2702 > i)
                i = class207.anInt2702;
        }
        int i_1_ = i * 16;
        if (bool) {
            byte[] is = new byte[i_1_ * i_1_];
            for (int i_2_ = 0; i_2_ < 256; i_2_++) {
                Class207 class207 = class207s[i_2_];
                int i_3_ = class207.anInt2696;
                int i_4_ = class207.anInt2702;
                int i_5_ = i_2_ % 16 * i;
                int i_6_ = i_2_ / 16 * i;
                int i_7_ = i_6_ * i_1_ + i_5_;
                int i_8_ = 0;
                if (class207.aByteArray2695 == null) {
                    byte[] is_9_ = class207.aByteArray2699;
                    for (int i_10_ = 0; i_10_ < i_3_; i_10_++) {
                        for (int i_11_ = 0; i_11_ < i_4_; i_11_++)
                            is[i_7_++] = (byte) (is_9_[i_8_++] == 0 ? 0 : -1);
                        i_7_ += i_1_ - i_4_;
                    }
                } else {
                    byte[] is_12_ = class207.aByteArray2695;
                    for (int i_13_ = 0; i_13_ < i_3_; i_13_++) {
                        for (int i_14_ = 0; i_14_ < i_4_; i_14_++)
                            is[i_7_++] = is_12_[i_8_++];
                        i_7_ += i_1_ - i_4_;
                    }
                }
            }
            aClass258_Sub3_Sub1_6511
                    = Class371.method3583(false, is, 6406, i_1_, var_ha_Sub2, -86,
                    6406, i_1_);
            aBoolean6512 = true;
        } else {
            int[] is = new int[i_1_ * i_1_];
            for (int i_15_ = 0; i_15_ < 256; i_15_++) {
                Class207 class207 = class207s[i_15_];
                int[] is_16_ = class207.anIntArray2697;
                byte[] is_17_ = class207.aByteArray2695;
                byte[] is_18_ = class207.aByteArray2699;
                int i_19_ = class207.anInt2696;
                int i_20_ = class207.anInt2702;
                int i_21_ = i_15_ % 16 * i;
                int i_22_ = i_15_ / 16 * i;
                int i_23_ = i_22_ * i_1_ + i_21_;
                int i_24_ = 0;
                if (is_17_ == null) {
                    for (int i_27_ = 0; i_27_ < i_19_; i_27_++) {
                        for (int i_28_ = 0; i_28_ < i_20_; i_28_++) {
                            int i_29_;
                            if ((i_29_ = is_18_[i_24_++]) != 0)
                                is[i_23_++] = ~0xffffff | is_16_[i_29_ & 0xff];
                            else
                                i_23_++;
                        }
                        i_23_ += i_1_ - i_20_;
                    }
                } else {
                    for (int i_25_ = 0; i_25_ < i_19_; i_25_++) {
                        for (int i_26_ = 0; i_26_ < i_20_; i_26_++) {
                            is[i_23_++] = (is_17_[i_24_] << 24
                                    | is_16_[is_18_[i_24_] & 0xff]);
                            i_24_++;
                        }
                        i_23_ += i_1_ - i_20_;
                    }
                }
            }
            aClass258_Sub3_Sub1_6511
                    = Class348_Sub40_Sub32.method3132(is, 0, 0, i_1_, i_1_,
                    var_ha_Sub2, false,
                    (byte) 12);
            aBoolean6512 = false;
        }
        aClass258_Sub3_Sub1_6511.method1957(9728, false);
        aClass61_6510 = new Class61(var_ha_Sub2, 256);
        float f = (aClass258_Sub3_Sub1_6511.aFloat9937
                / (float) (aClass258_Sub3_Sub1_6511
                .anInt9940));
        float f_30_
                = (aClass258_Sub3_Sub1_6511.aFloat9938
                / (float) (aClass258_Sub3_Sub1_6511
                .anInt9939));
        for (int i_31_ = 0; i_31_ < 256; i_31_++) {
            Class207 class207 = class207s[i_31_];
            int i_32_ = class207.anInt2696;
            int i_33_ = class207.anInt2702;
            int i_34_ = class207.anInt2700;
            int i_35_ = class207.anInt2703;
            float f_36_ = (float) (i_31_ % 16 * i);
            float f_37_ = (float) (i_31_ / 16 * i);
            float f_38_ = f_36_ * f;
            float f_39_ = f_37_ * f_30_;
            float f_40_ = (f_36_ + (float) i_33_) * f;
            float f_41_ = (f_37_ + (float) i_32_) * f_30_;
            aClass61_6510.method595((byte) 123, i_31_);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(f_38_,
                    aClass258_Sub3_Sub1_6511.aFloat9938 - f_39_);
            OpenGL.glVertex2i(i_35_, i_34_);
            OpenGL.glTexCoord2f(f_38_,
                    aClass258_Sub3_Sub1_6511.aFloat9938 - f_41_);
            OpenGL.glVertex2i(i_35_, i_34_ + i_32_);
            OpenGL.glTexCoord2f(f_40_,
                    aClass258_Sub3_Sub1_6511.aFloat9938 - f_41_);
            OpenGL.glVertex2i(i_35_ + i_33_, i_34_ + i_32_);
            OpenGL.glTexCoord2f(f_40_,
                    aClass258_Sub3_Sub1_6511.aFloat9938 - f_39_);
            OpenGL.glVertex2i(i_35_ + i_33_, i_34_);
            OpenGL.glEnd();
            aClass61_6510.method591(-1);
        }
    }

    final void method2578(char c, int i, int i_42_, int i_43_, boolean bool,
                          aa var_aa, int i_44_, int i_45_) {
        aa_Sub1 var_aa_Sub1 = (aa_Sub1) var_aa;
        Class258_Sub3_Sub1 class258_sub3_sub1
                = var_aa_Sub1.aClass258_Sub3_Sub1_5193;
        aHa_Sub2_6509.method3735(9473);
        aHa_Sub2_6509.method3771((byte) -109, aClass258_Sub3_Sub1_6511);
        if (aBoolean6512 || bool) {
            aHa_Sub2_6509.method3729(7681, (byte) -38, 8448);
            aHa_Sub2_6509.method3762(34168, 768, (byte) -87, 0);
        } else
            aHa_Sub2_6509.method3729(7681, (byte) -55, 7681);
        aHa_Sub2_6509.method3738(-15039, 1);
        aHa_Sub2_6509.method3771((byte) -127, class258_sub3_sub1);
        aHa_Sub2_6509.method3729(7681, (byte) 97, 8448);
        aHa_Sub2_6509.method3762(34168, 768, (byte) -87, 0);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        float f
                = (class258_sub3_sub1.aFloat9937
                / (float) class258_sub3_sub1.anInt9940);
        float f_46_
                = (class258_sub3_sub1.aFloat9938
                / (float) class258_sub3_sub1.anInt9939);
        OpenGL.glTexGenfv(8192, 9474,
                new float[]{f, 0.0F, 0.0F, (float) -i_44_ * f},
                0);
        OpenGL.glTexGenfv(8193, 9474,
                new float[]{0.0F, f_46_, 0.0F,
                        (float) -i_45_ * f_46_},
                0);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        OpenGL.glColor4ub((byte) (i_43_ >> 16), (byte) (i_43_ >> 8),
                (byte) i_43_, (byte) (i_43_ >> 24));
        OpenGL.glTranslatef((float) i, (float) i_42_, 0.0F);
        aClass61_6510.method594(c, 28666);
        OpenGL.glLoadIdentity();
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        aHa_Sub2_6509.method3762(5890, 768, (byte) -87, 0);
        aHa_Sub2_6509.method3729(8448, (byte) -96, 8448);
        aHa_Sub2_6509.method3771((byte) -91, null);
        aHa_Sub2_6509.method3738(-15039, 0);
        if (aBoolean6512 || bool)
            aHa_Sub2_6509.method3762(5890, 768, (byte) -87, 0);
    }

    final void fa(char c, int i, int i_47_, int i_48_, boolean bool) {
        aHa_Sub2_6509.method3735(9473);
        aHa_Sub2_6509.method3771((byte) -96, aClass258_Sub3_Sub1_6511);
        if (aBoolean6512 || bool) {
            aHa_Sub2_6509.method3729(7681, (byte) 117, 8448);
            aHa_Sub2_6509.method3762(34168, 768, (byte) -87, 0);
        } else
            aHa_Sub2_6509.method3729(7681, (byte) 117, 7681);
        OpenGL.glColor4ub((byte) (i_48_ >> 16), (byte) (i_48_ >> 8),
                (byte) i_48_, (byte) (i_48_ >> 24));
        OpenGL.glTranslatef((float) i, (float) i_47_, 0.0F);
        aClass61_6510.method594(c, 28666);
        OpenGL.glLoadIdentity();
        if (aBoolean6512 || bool)
            aHa_Sub2_6509.method3762(5890, 768, (byte) -87, 0);
    }
}
