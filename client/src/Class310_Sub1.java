/* Class310_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DCubeTexture;
import jagdx.PixelBuffer;
import jagdx.ue;

final class Class310_Sub1 extends Class310 implements Interface18_Impl2
{
    private int anInt6329;
    private IDirect3DCubeTexture anIDirect3DCubeTexture6330;
    
    public final void method63(byte i) {
	((Class310_Sub1) this).aClass378_3893.method3956((byte) -128, this);
	if (i > -21)
	    method2314(88);
    }
    
    Class310_Sub1(Class378 class378, int i, boolean bool, int[][] is) {
	super(class378, Class108.aClass304_1662, Class68.aClass68_1183,
	      bool && ((Class378) class378).aBoolean9802, 6 * i * i);
	anInt6329 = i;
	if (((Class310_Sub1) this).aBoolean3892)
	    anIDirect3DCubeTexture6330
		= ((Class378) ((Class310_Sub1) this).aClass378_3893)
		      .anIDirect3DDevice9810.a(anInt6329, 0, 1024, 21, 1);
	else
	    anIDirect3DCubeTexture6330
		= ((Class378) ((Class310_Sub1) this).aClass378_3893)
		      .anIDirect3DDevice9810.a(anInt6329, 1, 0, 21, 1);
	PixelBuffer pixelbuffer
	    = (((Class378) ((Class310_Sub1) this).aClass378_3893)
	       .aPixelBuffer9803);
	for (int i_0_ = 0; (i_0_ ^ 0xffffffff) > -7; i_0_++) {
	    int i_1_
		= anIDirect3DCubeTexture6330.LockRect(i_0_, 0, 0, 0, anInt6329,
						      anInt6329, 0,
						      pixelbuffer);
	    if (ue.a(i_1_, false)) {
		int i_2_ = pixelbuffer.getRowPitch();
		if (i_2_ == anInt6329 * 4)
		    pixelbuffer.a(is[i_0_], 0, 0, anInt6329 * anInt6329);
		else {
		    for (int i_3_ = 0;
			 (i_3_ ^ 0xffffffff) > (anInt6329 ^ 0xffffffff);
			 i_3_++)
			pixelbuffer.a(is[i_0_], anInt6329 * i_3_, i_3_ * i_2_,
				      anInt6329);
		}
		anIDirect3DCubeTexture6330.UnlockRect(i_0_, 0);
	    }
	}
    }
    
    final IDirect3DBaseTexture method2314(int i) {
	if (i != 17723)
	    method2314(-17);
	return anIDirect3DCubeTexture6330;
    }
    
    public final void method64(Class209 class209, int i) {
	super.method64(class209, i);
    }
}
