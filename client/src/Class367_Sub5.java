/* Class367_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;

final class Class367_Sub5 extends Class367 {
    private boolean aBoolean7326 = false;
    private static float[] aFloatArray7327 = new float[4];
    private Class378 aClass378_7328;
    private final boolean aBoolean7329;
    private IDirect3DVertexShader anIDirect3DVertexShader7330;
    private Interface18_Impl3 anInterface18_Impl3_7331;
    private IDirect3DVertexShader anIDirect3DVertexShader7332;
    private IDirect3DVertexShader anIDirect3DVertexShader7333;
    private IDirect3DVertexShader anIDirect3DVertexShader7334;
    private IDirect3DVertexShader anIDirect3DVertexShader7335;
    private boolean aBoolean7336;
    private static final float[] aFloatArray7337 = new float[16];

    Class367_Sub5(Class378 class378, Class45 class45) {
        super(class378);
        aClass378_7328 = class378;
        if (null == class45 || ((aClass378_7328.aD3DCAPS9791.VertexShaderVersion) & 0xffff) < 257) aBoolean7329 = false;
        else {
            anIDirect3DVertexShader7332 = aClass378_7328.anIDirect3DDevice9810.b(class45.method391("dx", "uw_ground_unlit", -29832));
            anIDirect3DVertexShader7330 = aClass378_7328.anIDirect3DDevice9810.b(class45.method391("dx", "uw_ground_lit", -29832));
            anIDirect3DVertexShader7334 = aClass378_7328.anIDirect3DDevice9810.b(class45.method391("dx", "uw_model_unlit", -29832));
            anIDirect3DVertexShader7335 = aClass378_7328.anIDirect3DDevice9810.b(class45.method391("dx", "uw_model_lit", -29832));
            if (null != anIDirect3DVertexShader7332 & anIDirect3DVertexShader7330 != null & anIDirect3DVertexShader7334 != null & null != anIDirect3DVertexShader7335) {
                anInterface18_Impl3_7331 = (this.aHa_Sub3_4479.method3839(1, 2, -15137, false, new int[]{0, -1}));
                anInterface18_Impl3_7331.method66(false, false, 25688);
                aBoolean7329 = true;
            } else aBoolean7329 = false;
        }
    }

    final void method3528(int i) {
        if (i < 45) aFloatArray7327 = null;
        IDirect3DDevice idirect3ddevice = aClass378_7328.anIDirect3DDevice9810;
        int i_0_ = this.aHa_Sub3_4479.method3941(-103);
        Class101_Sub2 class101_sub2 = this.aHa_Sub3_4479.method3887((byte) 61);
        IDirect3DVertexShader idirect3dvertexshader;
        if (aBoolean7336) idirect3dvertexshader = (i_0_ != 2147483647 ? anIDirect3DVertexShader7335 : anIDirect3DVertexShader7330);
        else idirect3dvertexshader = (i_0_ == 2147483647 ? anIDirect3DVertexShader7332 : anIDirect3DVertexShader7334);
        if (anIDirect3DVertexShader7333 != idirect3dvertexshader) {
            anIDirect3DVertexShader7333 = idirect3dvertexshader;
            aClass378_7328.method3957(idirect3dvertexshader, (byte) -89);
            method3545(121);
            method3524(-14775);
            method3532(10425);
            method3523((byte) 12);
            method3531(false);
            method3522(-16252);
        }
        class101_sub2.method919(0.0F, aFloatArray7327, -1.0F, 0.0F, (float) i_0_, (byte) -120);
        idirect3ddevice.a(12, aFloatArray7327);
    }

    final void method3526(int i, int i_1_, int i_2_) {
        if (i != 10756) method3531(false);
    }

    final void method3520(byte i) {
        if (i != 87) method3527(55, null, -69);
        this.aHa_Sub3_4479.method3897(1, -4382);
        this.aHa_Sub3_4479.method3850((byte) 82, null);
        this.aHa_Sub3_4479.method3874(Class167.aClass229_2207, i + 25, Class167.aClass229_2207);
        this.aHa_Sub3_4479.method3849((byte) 47, 0, Class342.aClass70_4247);
        this.aHa_Sub3_4479.method3849((byte) 47, 2, Class348_Sub40_Sub39.aClass70_9485);
        this.aHa_Sub3_4479.method3885(0, true, Class342.aClass70_4247);
        this.aHa_Sub3_4479.method3897(0, i ^ ~0x114a);
        if (aBoolean7326) {
            this.aHa_Sub3_4479.method3849((byte) 47, 0, Class342.aClass70_4247);
            this.aHa_Sub3_4479.method3885(0, true, Class342.aClass70_4247);
            aBoolean7326 = false;
        }
        if (null != anIDirect3DVertexShader7333) {
            aClass378_7328.method3957(null, (byte) -89);
            anIDirect3DVertexShader7333 = null;
        }
    }

    final boolean method3530(int i) {
        if (i > -57) aClass378_7328 = null;
        return aBoolean7329;
    }

    final void method3523(byte i) {
        if (i != 12) method3521(false, (byte) -54);
        if (null != anIDirect3DVertexShader7333) {
            IDirect3DDevice idirect3ddevice = aClass378_7328.anIDirect3DDevice9810;
            Class101_Sub2 class101_sub2 = aClass378_7328.method3948(i + -22048);
            idirect3ddevice.a(0, class101_sub2.method924(11, aFloatArray7337));
        }
    }

    final void method3524(int i) {
        if (i == -14775) {
            if (null != anIDirect3DVertexShader7333) {
                IDirect3DDevice idirect3ddevice = aClass378_7328.anIDirect3DDevice9810;
                idirect3ddevice.a(4, this.aHa_Sub3_4479.method3835(aFloatArray7337, -101));
            }
        }
    }

    final void method3527(int i, Interface18 interface18, int i_3_) {
        if (interface18 == null) {
            if (!aBoolean7326) {
                this.aHa_Sub3_4479.method3850((byte) -43, (this.aHa_Sub3_4479.anInterface18_8147));
                this.aHa_Sub3_4479.method3923(true, 1);
                this.aHa_Sub3_4479.method3849((byte) 47, 0, Class318_Sub1_Sub2.aClass70_8737);
                this.aHa_Sub3_4479.method3885(0, true, Class318_Sub1_Sub2.aClass70_8737);
                aBoolean7326 = true;
            }
        } else {
            if (aBoolean7326) {
                this.aHa_Sub3_4479.method3849((byte) 47, 0, Class342.aClass70_4247);
                this.aHa_Sub3_4479.method3885(0, true, Class342.aClass70_4247);
                aBoolean7326 = false;
            }
            this.aHa_Sub3_4479.method3850((byte) -103, interface18);
            this.aHa_Sub3_4479.method3923(true, i);
        }
        if (i_3_ != -16776) anIDirect3DVertexShader7332 = null;
    }

    final void method3522(int i) {
        if (i != -16252) method3521(true, (byte) -11);
        if (null != anIDirect3DVertexShader7333) {
            IDirect3DDevice idirect3ddevice = aClass378_7328.anIDirect3DDevice9810;
            int i_4_ = this.aHa_Sub3_4479.XA();
            int i_5_ = this.aHa_Sub3_4479.i();
            float f = -(0.125F * (float) (i_4_ + -i_5_)) + (float) i_4_;
            float f_6_ = (float) i_4_ - (float) (-i_5_ + i_4_) * 0.25F;
            idirect3ddevice.a(10, f_6_, 1.0F / (-f_6_ + f), f, 1.0F / (-f + (float) i_4_));
            idirect3ddevice.a(11, 1.0F / (float) this.aHa_Sub3_4479.method3833((byte) -58), (float) this.aHa_Sub3_4479.method3826((byte) -70) / 255.0F, this.aHa_Sub3_4479.aFloat8115, 1.0F / (-(this.aHa_Sub3_4479.aFloat8173) + (this.aHa_Sub3_4479.aFloat8115)));
            this.aHa_Sub3_4479.method3894(-28186, this.aHa_Sub3_4479.method3863(-103));
        }
    }

    final void method3525(int i, boolean bool) {
        aBoolean7336 = bool;
        this.aHa_Sub3_4479.method3897(1, -4382);
        this.aHa_Sub3_4479.method3850((byte) 95, anInterface18_Impl3_7331);
        if (i != 15192) method3520((byte) -41);
        this.aHa_Sub3_4479.method3874(Class328_Sub3.aClass229_6519, 105, Class248.aClass229_3196);
        this.aHa_Sub3_4479.method3849((byte) 47, 0, Class348_Sub40_Sub39.aClass70_9485);
        this.aHa_Sub3_4479.method3924(true, false, 2, Class342.aClass70_4247, false);
        this.aHa_Sub3_4479.method3885(0, true, Class318_Sub1_Sub2.aClass70_8737);
        this.aHa_Sub3_4479.method3897(0, -4382);
        method3528(106);
    }

    final void method3521(boolean bool, byte i) {
        if (i != -103) aBoolean7326 = true;
    }

    private final void method3545(int i) {
        if (i > 95) {
            if (null != anIDirect3DVertexShader7333 && aBoolean7336) {
                Class101_Sub2 class101_sub2 = this.aHa_Sub3_4479.method3854((byte) 111);
                IDirect3DDevice idirect3ddevice = aClass378_7328.anIDirect3DDevice9810;
                idirect3ddevice.a(13, ((this.aHa_Sub3_4479.aFloat8093) * (this.aHa_Sub3_4479.aFloat8180)), ((this.aHa_Sub3_4479.aFloat8087) * (this.aHa_Sub3_4479.aFloat8093)), ((this.aHa_Sub3_4479.aFloat8168) * (this.aHa_Sub3_4479.aFloat8093)), 1.0F);
                idirect3ddevice.a(14, ((this.aHa_Sub3_4479.aFloat8174) * (this.aHa_Sub3_4479.aFloat8180)), ((this.aHa_Sub3_4479.aFloat8087) * (this.aHa_Sub3_4479.aFloat8174)), ((this.aHa_Sub3_4479.aFloat8174) * (this.aHa_Sub3_4479.aFloat8168)), 1.0F);
                idirect3ddevice.a(16, ((this.aHa_Sub3_4479.aFloat8180) * (this.aHa_Sub3_4479.aFloat8186)), ((this.aHa_Sub3_4479.aFloat8087) * (this.aHa_Sub3_4479.aFloat8186)), ((this.aHa_Sub3_4479.aFloat8168) * (this.aHa_Sub3_4479.aFloat8186)), 1.0F);
                class101_sub2.method923((this.aHa_Sub3_4479.aFloatArray8170[0]), (this.aHa_Sub3_4479.aFloatArray8170[1]), (byte) -97, (this.aHa_Sub3_4479.aFloatArray8170[2]), aFloatArray7327);
                idirect3ddevice.SetVertexShaderConstantF(15, aFloatArray7327, 1);
                class101_sub2.method923((this.aHa_Sub3_4479.aFloatArray8102[0]), (this.aHa_Sub3_4479.aFloatArray8102[1]), (byte) -99, (this.aHa_Sub3_4479.aFloatArray8102[2]), aFloatArray7327);
                idirect3ddevice.SetVertexShaderConstantF(17, aFloatArray7327, 1);
            }
        }
    }

    final void method3531(boolean bool) {
        if (bool) method3528(89);
        if (anIDirect3DVertexShader7333 != null) {
            IDirect3DDevice idirect3ddevice = aClass378_7328.anIDirect3DDevice9810;
            Class101_Sub2 class101_sub2 = aClass378_7328.method3948(-22036);
            idirect3ddevice.a(0, class101_sub2.method924(11, aFloatArray7337));
        }
    }

    final void method3532(int i) {
        if (i != 10425) method3545(-24);
        if (null != anIDirect3DVertexShader7333) {
            IDirect3DDevice idirect3ddevice = aClass378_7328.anIDirect3DDevice9810;
            Class101_Sub2 class101_sub2 = this.aHa_Sub3_4479.method3848(5);
            idirect3ddevice.SetVertexShaderConstantF(8, class101_sub2.method915(aFloatArray7337, i + -10424), 2);
        }
    }
}
