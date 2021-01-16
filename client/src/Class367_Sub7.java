/* Class367_Sub7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jagdx.IDirect3DDevice;
import jagdx.IDirect3DPixelShader;
import jagdx.IDirect3DVertexShader;

final class Class367_Sub7 extends Class367 {
    private static float[] aFloatArray7342 = new float[16];
    private IDirect3DPixelShader anIDirect3DPixelShader7343;
    private boolean aBoolean7344;
    private IDirect3DVertexShader anIDirect3DVertexShader7345;
    private Class378 aClass378_7346;
    private final boolean aBoolean7347;
    private final Class269 aClass269_7348;

    final void method3526(int i, int i_0_, int i_1_) {
        if (i != 10756) method3527(-80, null, 80);
        if (aBoolean7344) {
            IDirect3DDevice idirect3ddevice = aClass378_7346.anIDirect3DDevice9810;
            int i_2_ = 1 << (i_0_ & 0x3);
            float f = (float) (1 << ((0x38 & i_0_) >> -1657014269)) / 32.0F;
            int i_3_ = i_1_ & 0xffff;
            float f_4_ = (float) ((i_1_ & 0x320d7) >> -1712887664) / 8.0F;
            idirect3ddevice.a(14, (float) (this.aHa_Sub3_4479.anInt8146 * i_2_ % 40000) / 40000.0F, 0.0F, 0.0F, 0.0F);
            idirect3ddevice.a(15, f, 0.0F, 0.0F, 0.0F);
            idirect3ddevice.b(4, (float) i_3_, 0.0F, 0.0F, 0.0F);
            idirect3ddevice.b(5, f_4_, 0.0F, 0.0F, 0.0F);
        }
    }

    final void method3521(boolean bool, byte i) {
        if (i != -103) aBoolean7344 = true;
    }

    final void method3532(int i) {
        if (aBoolean7344) {
            IDirect3DDevice idirect3ddevice = aClass378_7346.anIDirect3DDevice9810;
            Class101_Sub2 class101_sub2 = this.aHa_Sub3_4479.method3848(i + -10420);
            idirect3ddevice.SetVertexShaderConstantF(12, class101_sub2.method915(aFloatArray7342, 1), 2);
        }
        if (i != 10425) anIDirect3DVertexShader7345 = null;
    }

    final void method3527(int i, Interface18 interface18, int i_5_) {
        if (i_5_ != -16776) method3532(16);
    }

    final void method3522(int i) {
        if (aBoolean7344) {
            IDirect3DDevice idirect3ddevice = aClass378_7346.anIDirect3DDevice9810;
            if (this.aHa_Sub3_4479.anInt8091 <= 0) idirect3ddevice.a(16, 0.0F, 0.0F, 0.0F, 0.0F);
            else {
                float f = (this.aHa_Sub3_4479.aFloat8115);
                float f_6_ = (this.aHa_Sub3_4479.aFloat8173);
                idirect3ddevice.a(16, f, 1.0F / (f - f_6_), 0.0F, 0.0F);
            }
            idirect3ddevice.b(0, (float) ((this.aHa_Sub3_4479.anInt8144 >> -621516848) & 0xff) / 255.0F, (float) ((this.aHa_Sub3_4479.anInt8144 >> 1567558920) & 0xff) / 255.0F, (float) (this.aHa_Sub3_4479.anInt8144 & 0xff) / 255.0F, 0.0F);
        }
        if (i != -16252) aClass378_7346 = null;
    }

    Class367_Sub7(Class378 class378, Class45 class45, Class269 class269) {
        super(class378);
        aClass269_7348 = class269;
        aClass378_7346 = class378;
        if (null == class45 || !this.aHa_Sub3_4479.aBoolean8101 || !this.aHa_Sub3_4479.aBoolean8159 || (aClass378_7346.aD3DCAPS9791.VertexShaderVersion & 0xffff) < 257) {
            anIDirect3DVertexShader7345 = null;
            aBoolean7347 = false;
            anIDirect3DPixelShader7343 = null;
        } else {
            anIDirect3DVertexShader7345 = (aClass378_7346.anIDirect3DDevice9810.b(class45.method391("dx", "environment_mapped_water_v", -29832)));
            anIDirect3DPixelShader7343 = (aClass378_7346.anIDirect3DDevice9810.a(class45.method391("dx", "environment_mapped_water_f", -29832)));
            aBoolean7347 = (anIDirect3DVertexShader7345 != null && null != anIDirect3DPixelShader7343 && aClass269_7348.method2041((byte) 49));
        }
    }

    final void method3525(int i, boolean bool) {
        if (i == 15192) {
            Interface18_Impl2 interface18_impl2 = this.aHa_Sub3_4479.method3834(-16777216);
            if (aBoolean7347 && null != interface18_impl2) {
                IDirect3DDevice idirect3ddevice = aClass378_7346.anIDirect3DDevice9810;
                aClass378_7346.method3957(anIDirect3DVertexShader7345, (byte) -89);
                aClass378_7346.method3962(22927, anIDirect3DPixelShader7343);
                this.aHa_Sub3_4479.method3897(1, -4382);
                this.aHa_Sub3_4479.method3850((byte) 63, interface18_impl2);
                this.aHa_Sub3_4479.method3897(0, -4382);
                this.aHa_Sub3_4479.method3850((byte) -127, aClass269_7348.anInterface18_Impl1_3455);
                aBoolean7344 = true;
                method3531(false);
                method3532(10425);
                method3524(-14775);
                method3522(-16252);
                idirect3ddevice.b(1, -(this.aHa_Sub3_4479.aFloatArray8170[0]), -(this.aHa_Sub3_4479.aFloatArray8170[1]), -(this.aHa_Sub3_4479.aFloatArray8170[2]), 0.0F);
                idirect3ddevice.b(2, this.aHa_Sub3_4479.aFloat8180, this.aHa_Sub3_4479.aFloat8087, this.aHa_Sub3_4479.aFloat8168, 1.0F);
                idirect3ddevice.b(3, (928.0F * Math.abs(this.aHa_Sub3_4479.aFloatArray8170[1]) + 96.0F), 0.0F, 0.0F, 0.0F);
            }
        }
    }

    final boolean method3530(int i) {
        if (i > -57) anIDirect3DPixelShader7343 = null;
        return aBoolean7347;
    }

    final void method3523(byte i) {
        if (aBoolean7344) {
            IDirect3DDevice idirect3ddevice = aClass378_7346.anIDirect3DDevice9810;
            Class101_Sub2 class101_sub2 = aClass378_7346.method3948(-22036);
            idirect3ddevice.a(0, class101_sub2.method924(11, aFloatArray7342));
        }
        if (i != 12) aFloatArray7342 = null;
    }

    final void method3520(byte i) {
        if (aBoolean7344) {
            aClass378_7346.method3957(null, (byte) -89);
            aClass378_7346.method3962(22927, null);
            this.aHa_Sub3_4479.method3897(1, -4382);
            this.aHa_Sub3_4479.method3850((byte) -98, null);
            this.aHa_Sub3_4479.method3897(0, -4382);
            this.aHa_Sub3_4479.method3850((byte) -124, null);
            aBoolean7344 = false;
        }
        if (i != 87) method3531(true);
    }

    final void method3524(int i) {
        if (i == -14775) {
            if (aBoolean7344) {
                IDirect3DDevice idirect3ddevice = aClass378_7346.anIDirect3DDevice9810;
                idirect3ddevice.a(8, this.aHa_Sub3_4479.method3835(aFloatArray7342, i + 14651));
            }
        }
    }

    final void method3531(boolean bool) {
        if (!bool) {
            if (aBoolean7344) {
                IDirect3DDevice idirect3ddevice = aClass378_7346.anIDirect3DDevice9810;
                Class101_Sub2 class101_sub2 = aClass378_7346.method3887((byte) -123);
                Class101_Sub2 class101_sub2_7_ = aClass378_7346.method3948(-22036);
                idirect3ddevice.a(0, class101_sub2_7_.method924(11, aFloatArray7342));
                idirect3ddevice.a(4, class101_sub2.method930(0, aFloatArray7342));
            }
        }
    }
}
