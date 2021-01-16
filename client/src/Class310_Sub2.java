/* Class310_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DTexture;
import jagdx.PixelBuffer;
import jagdx.ue;

final class Class310_Sub2 extends Class310 implements Interface18_Impl3 {
    private final int anInt6331;
    private final IDirect3DTexture anIDirect3DTexture6332;
    private final int anInt6333;
    boolean aBoolean6334;
    boolean aBoolean6335;

    Class310_Sub2(Class378 class378, int i, int i_0_, boolean bool, int[] is,
                  int i_1_, int i_2_) {
        super(class378, Class108.aClass304_1662, Class68.aClass68_1183,
                bool && class378.aBoolean9798, i_0_ * i);
        if (this.aClass378_3893.aBoolean9792) {
            anInt6331 = i_0_;
            anInt6333 = i;
        } else {
            anInt6333 = Class33.method340(i, (byte) 108);
            anInt6331 = Class33.method340(i_0_, (byte) 108);
        }
        if (!bool)
            anIDirect3DTexture6332
                    = this.aClass378_3893
                    .anIDirect3DDevice9810
                    .a(anInt6333, anInt6331, 1, 0, 21, 1);
        else
            anIDirect3DTexture6332
                    = this.aClass378_3893
                    .anIDirect3DDevice9810
                    .a(anInt6333, anInt6331, 0, 1024, 21, 1);
        PixelBuffer pixelbuffer
                = (this.aClass378_3893
                .aPixelBuffer9803);
        int i_3_ = anIDirect3DTexture6332.LockRect(0, 0, 0, i, i_0_, 0,
                pixelbuffer);
        if (ue.a(i_3_, false)) {
            if (0 == i_2_)
                i_2_ = i;
            int i_4_ = pixelbuffer.getRowPitch();
            if (i_4_ == 4 * i && i == i_2_)
                pixelbuffer.a(is, i_1_, 0, i * i_0_);
            else {
                for (int i_5_ = 0; i_0_ > i_5_;
                     i_5_++)
                    pixelbuffer.a(is, i_5_ * i_2_ + i_1_, i_4_ * i_5_, i);
            }
            anIDirect3DTexture6332.UnlockRect(0);
        }
    }

    Class310_Sub2(Class378 class378, Class304 class304, Class68 class68, int i,
                  int i_6_) {
        super(class378, class304, class68, false, i_6_ * i);
        if (this.aClass378_3893.aBoolean9792) {
            anInt6333 = i;
            anInt6331 = i_6_;
        } else {
            anInt6333 = Class33.method340(i, (byte) 108);
            anInt6331 = Class33.method340(i_6_, (byte) 108);
        }
        anIDirect3DTexture6332
                = (this.aClass378_3893
                .anIDirect3DDevice9810.a
                        (i, i_6_, 1, 0,
                                Class378.method3958(22, this.aClass68_3895,
                                        this.aClass304_3896),
                                1));
    }

    public final void method64(Class209 class209, int i) {
        super.method64(class209, i);
    }

    final IDirect3DBaseTexture method2314(int i) {
        if (i != 17723)
            return null;
        return anIDirect3DTexture6332;
    }

    public final int method69(boolean bool) {
        if (bool)
            return -95;
        return anInt6333;
    }

    public final int method72(int i) {
        int i_7_ = -47 % ((55 - i) / 63);
        return anInt6331;
    }

    public final void method65(int i, int[] is, int i_8_, int i_9_, int i_10_,
                               byte i_11_, int i_12_) {
        if (Class108.aClass304_1662 != this.aClass304_3896
                || this.aClass68_3895 != Class68.aClass68_1183)
            throw new RuntimeException();
        if (i_11_ != 112)
            this.aBoolean6334 = false;
        PixelBuffer pixelbuffer
                = (this.aClass378_3893
                .aPixelBuffer9803);
        int i_13_ = anIDirect3DTexture6332.LockRect(0, i, i_9_, i_8_, i_10_,
                16, pixelbuffer);
        if (ue.a(i_13_, false)) {
            int i_14_ = pixelbuffer.getRowPitch();
            if (i_14_ != 4 * i_8_) {
                for (int i_15_ = 0; i_15_ < i_10_; i_15_++)
                    pixelbuffer.b(is, i_12_ - -(i_8_ * i_15_), i_15_ * i_14_,
                            i_8_);
            } else
                pixelbuffer.b(is, i_12_, 0, is.length);
            anIDirect3DTexture6332.UnlockRect(0);
        }
    }

    Class310_Sub2(Class378 class378, Class304 class304, int i, int i_16_,
                  boolean bool, byte[] is, int i_17_, int i_18_) {
        super(class378, class304, Class68.aClass68_1183,
                bool && class378.aBoolean9798, i * i_16_);
        if (this.aClass378_3893.aBoolean9792) {
            anInt6333 = i;
            anInt6331 = i_16_;
        } else {
            anInt6333 = Class33.method340(i, (byte) 108);
            anInt6331 = Class33.method340(i_16_, (byte) 108);
        }
        if (bool)
            anIDirect3DTexture6332
                    = (this.aClass378_3893
                    .anIDirect3DDevice9810.a
                            (anInt6333, anInt6331, 0, 1024,
                                    Class378.method3958(22, Class68.aClass68_1183,
                                            this.aClass304_3896),
                                    1));
        else
            anIDirect3DTexture6332
                    = (this.aClass378_3893
                    .anIDirect3DDevice9810.a
                            (anInt6333, anInt6331, 1, 0,
                                    Class378.method3958(22, Class68.aClass68_1183,
                                            this.aClass304_3896),
                                    1));
        PixelBuffer pixelbuffer
                = (this.aClass378_3893
                .aPixelBuffer9803);
        int i_19_ = anIDirect3DTexture6332.LockRect(0, 0, 0, i, i_16_, 0,
                pixelbuffer);
        if (ue.a(i_19_, false)) {
            if (0 == i_18_)
                i_18_ = i;
            i *= this.aClass304_3896.anInt3850;
            i_18_ *= (this.aClass304_3896
                    .anInt3850);
            int i_20_ = pixelbuffer.getRowPitch();
            if (i != i_20_
                    || i != i_18_) {
                for (int i_21_ = 0; i_16_ > i_21_; i_21_++)
                    pixelbuffer.a(is, i_21_ * i_18_ + i_17_, i_20_ * i_21_, i);
            } else
                pixelbuffer.a(is, i_17_, 0, i * i_16_);
            anIDirect3DTexture6332.UnlockRect(0);
        }
    }

    public final float method71(byte i, float f) {
        if (i > -24)
            return -0.2576451F;
        return f / (float) anInt6331;
    }

    public final void method68(int i, int i_22_, int[] is, int i_23_,
                               int i_24_, int i_25_, int i_26_, int i_27_) {
        if (this.aClass304_3896 != Class108.aClass304_1662
                || this.aClass68_3895 != Class68.aClass68_1183)
            throw new RuntimeException();
        PixelBuffer pixelbuffer
                = (this.aClass378_3893
                .aPixelBuffer9803);
        int i_28_ = anIDirect3DTexture6332.LockRect(0, i_23_, i_26_, i_25_,
                i_27_, 0, pixelbuffer);
        if (ue.a(i_28_, false)) {
            int i_29_ = pixelbuffer.getRowPitch();
            if (i_29_ != i_25_ * 4
                    || i_25_ != i) {
                for (int i_30_ = 0;
                     i_27_ > i_30_; i_30_++)
                    pixelbuffer.a(is, i_24_ + i * i_30_, i_30_ * i_29_, i_25_);
            } else
                pixelbuffer.a(is, i_24_, 0, i_27_ * i_25_);
            anIDirect3DTexture6332.UnlockRect(0);
        }
        if (i_22_ != 22809)
            this.aBoolean6334 = false;
    }

    public final float method67(float f, int i) {
        if (i < 69)
            return 0.44069603F;
        return f / (float) anInt6333;
    }

    public final void method63(byte i) {
        if (i > -21)
            method64(null, 39);
        this.aClass378_3893.method3954(13700, this);
    }

    public final void method70(int i, int i_31_, byte i_32_, int i_33_,
                               int i_34_, int i_35_, int i_36_, byte[] is,
                               Class304 class304) {
        if (this.aClass304_3896 != class304
                || this.aClass68_3895 != Class68.aClass68_1183)
            throw new RuntimeException();
        if (i_32_ < -4) {
            PixelBuffer pixelbuffer
                    = (this.aClass378_3893
                    .aPixelBuffer9803);
            int i_37_ = anIDirect3DTexture6332.LockRect(0, i_36_, i, i_35_,
                    i_34_, 0, pixelbuffer);
            if (ue.a(i_37_, false)) {
                i_33_ *= (this.aClass304_3896
                        .anInt3850);
                i_35_ *= (this.aClass304_3896
                        .anInt3850);
                int i_38_ = pixelbuffer.getRowPitch();
                if (i_38_ == i_35_
                        && i_33_ == i_35_)
                    pixelbuffer.a(is, i_31_, 0, i_35_ * i_34_);
                else {
                    for (int i_39_ = 0; i_34_ > i_39_; i_39_++)
                        pixelbuffer.a(is, i_31_ + i_39_ * i_33_, i_39_ * i_38_,
                                i_35_);
                }
                anIDirect3DTexture6332.UnlockRect(0);
            }
        }
    }

    public final boolean method73(int i) {
        if (i <= 84)
            method67(1.9572803F, 45);
        return true;
    }

    public final void method66(boolean bool, boolean bool_40_, int i) {
        this.aBoolean6335 = bool_40_;
        if (i == 25688)
            this.aBoolean6334 = bool;
    }
}
