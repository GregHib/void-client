/* Class142 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.Buffer;

import jagdx.IDirect3DIndexBuffer;
import jagdx.ue;

final class Class142 implements Interface5_Impl2
{
    private Class378 aClass378_8515;
    private int anInt8516;
    IDirect3DIndexBuffer anIDirect3DIndexBuffer8517;
    private Class68 aClass68_8518;
    private boolean aBoolean8519;
    private boolean aBoolean8520 = false;
    private int anInt8521;
    
    public final Class68 method25(byte i) {
	if (i <= 19)
	    aClass68_8518 = null;
	return aClass68_8518;
    }
    
    public final boolean method22(int i) {
	if (i != -23)
	    anInt8516 = 118;
	if (aBoolean8520
	    && ue.a(((Class142) this).anIDirect3DIndexBuffer8517.Unlock(),
		    false)) {
	    aBoolean8520 = false;
	    return true;
	}
	return false;
    }
    
    public final void method23(int i, int i_0_) {
	if (i != 15959)
	    anInt8516 = -78;
	anInt8516 = ((Class68) aClass68_8518).anInt1178 * i_0_;
	if (anInt8521 < anInt8516) {
	    int i_1_ = 8;
	    int i_2_;
	    if (aBoolean8519) {
		i_1_ |= 0x200;
		i_2_ = 0;
	    } else
		i_2_ = 1;
	    if (null != ((Class142) this).anIDirect3DIndexBuffer8517)
		((Class142) this).anIDirect3DIndexBuffer8517.a(9275);
	    ((Class142) this).anIDirect3DIndexBuffer8517
		= (((Class378) aClass378_8515).anIDirect3DDevice9810.a
		   (anInt8516, i_1_,
		    aClass68_8518 != Class68.aClass68_1184 ? 102 : 101, i_2_,
		    ((Class142) this).anIDirect3DIndexBuffer8517));
	    anInt8521 = anInt8516;
	}
    }
    
    public final Buffer method24(boolean bool, boolean bool_3_) {
	if (null == ((Class142) this).anIDirect3DIndexBuffer8517)
	    return null;
	if (bool_3_)
	    method23(-111, 54);
	bool &= aBoolean8519;
	if (!aBoolean8520
	    && ue.a((((Class142) this).anIDirect3DIndexBuffer8517.Lock
		     (0, anInt8521, !bool ? 0 : 8192,
		      ((Class378) aClass378_8515).aGeometryBuffer9811)),
		    false)) {
	    aBoolean8520 = true;
	    return ((Class378) aClass378_8515).aGeometryBuffer9811;
	}
	return null;
    }
    
    public final int method16(boolean bool) {
	if (bool)
	    method25((byte) 116);
	return anInt8516;
    }
    
    public final void method21(int i) {
	if (null != ((Class142) this).anIDirect3DIndexBuffer8517) {
	    ((Class142) this).anIDirect3DIndexBuffer8517.a(9275);
	    ((Class142) this).anIDirect3DIndexBuffer8517 = null;
	}
	if (i != 23315)
	    method23(65, -35);
	anInt8521 = 0;
	anInt8516 = 0;
    }
    
    Class142(Class378 class378, Class68 class68, boolean bool) {
	aClass378_8515 = class378;
	aBoolean8519 = bool;
	aClass68_8518 = class68;
    }
}
