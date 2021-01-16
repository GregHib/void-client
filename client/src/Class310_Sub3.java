/* Class310_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DVolumeTexture;
import jagdx.PixelBuffer;
import jagdx.ue;

final class Class310_Sub3 extends Class310 implements Interface18_Impl1 {
    private final IDirect3DVolumeTexture anIDirect3DVolumeTexture6336;
    private final int anInt6337;
    private int anInt6338;
    private final int anInt6339;

    public final void method63(byte i) {
        this.aClass378_3893.method3959(-101, this);
        if (i >= -21) method2314(78);
    }

    final IDirect3DBaseTexture method2314(int i) {
        if (i != 17723) anInt6338 = -39;
        return anIDirect3DVolumeTexture6336;
    }

    public final void method64(Class209 class209, int i) {
        super.method64(class209, i);
    }

    Class310_Sub3(Class378 class378, Class304 class304, int i, int i_0_, int i_1_, byte[] is) {
        super(class378, class304, Class68.aClass68_1183, false, i_1_ * i_0_ * i);
        anInt6338 = i;
        anInt6337 = i_1_;
        anInt6339 = i_0_;
        anIDirect3DVolumeTexture6336 = (this.aClass378_3893.anIDirect3DDevice9810.a(i, i_0_, i_1_, 1, 0, Class378.method3958(22, this.aClass68_3895, class304), 1));
        PixelBuffer pixelbuffer = (this.aClass378_3893.aPixelBuffer9803);
        int i_2_ = anIDirect3DVolumeTexture6336.LockBox(0, 0, 0, 0, i, i_0_, i_1_, 0, pixelbuffer);
        if (ue.a(i_2_, false)) {
            int i_3_ = (this.aClass304_3896.anInt3850 * anInt6338);
            int i_4_ = i_3_ * anInt6339;
            int i_5_ = pixelbuffer.getSlicePitch();
            if (i_5_ == i_4_) pixelbuffer.a(is, 0, 0, anInt6337 * (i_3_ * anInt6339));
            else {
                int i_6_ = pixelbuffer.getRowPitch();
                if (i_3_ == i_6_) {
                    for (int i_9_ = 0; anInt6337 > i_9_; i_9_++)
                        pixelbuffer.a(is, i_4_ * i_9_, i_9_ * i_5_, i_4_);
                } else {
                    for (int i_7_ = 0; i_7_ < anInt6337; i_7_++) {
                        for (int i_8_ = 0; anInt6339 > i_8_; i_8_++)
                            pixelbuffer.a(is, i_3_ * i_8_ + i_4_ * i_7_, i_8_ * i_6_ + i_7_ * i_5_, i_3_);
                    }
                }
            }
            anIDirect3DVolumeTexture6336.UnlockBox(0);
        }
    }
}
