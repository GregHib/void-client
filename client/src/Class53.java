/* Class53 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagdx.IDirect3DSurface;
import jagdx.IDirect3DSwapChain;

final class Class53
{
    private IDirect3DSwapChain anIDirect3DSwapChain963;
    private IDirect3DSurface anIDirect3DSurface964;
    private IDirect3DSurface anIDirect3DSurface965;
    
    final int method495(byte i, int i_0_) {
	if (i != 91)
	    anIDirect3DSurface964 = null;
	return anIDirect3DSwapChain963.Present(i_0_);
    }
    
    final void method496(byte i) {
	if (null != anIDirect3DSurface965) {
	    anIDirect3DSurface965.a(9275);
	    anIDirect3DSurface965 = null;
	}
	if (anIDirect3DSurface964 != null) {
	    anIDirect3DSurface964.a(9275);
	    anIDirect3DSurface964 = null;
	}
	int i_1_ = -115 / ((i - -20) / 51);
	if (anIDirect3DSwapChain963 != null) {
	    anIDirect3DSwapChain963.a(9275);
	    anIDirect3DSwapChain963 = null;
	}
    }
    
    final void method497(IDirect3DSwapChain idirect3dswapchain, byte i,
			 IDirect3DSurface idirect3dsurface) {
	anIDirect3DSurface964 = idirect3dsurface;
	if (i == -107) {
	    anIDirect3DSwapChain963 = idirect3dswapchain;
	    anIDirect3DSurface965 = anIDirect3DSwapChain963.a(0, 0);
	}
    }
    
    final boolean method498(int i) {
	int i_2_ = -21 / ((7 - i) / 51);
	return null != anIDirect3DSwapChain963;
    }
    
    Class53(IDirect3DSwapChain idirect3dswapchain,
	    IDirect3DSurface idirect3dsurface) {
	method497(idirect3dswapchain, (byte) -107, idirect3dsurface);
    }
}
