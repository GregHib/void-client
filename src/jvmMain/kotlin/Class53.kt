import jagdx.IDirect3DSurface
import jagdx.IDirect3DSwapChain

class Class53 internal constructor(idirect3dswapchain: IDirect3DSwapChain?, idirect3dsurface: IDirect3DSurface?) {
    private var anIDirect3DSwapChain963: IDirect3DSwapChain? = null
    private var anIDirect3DSurface964: IDirect3DSurface? = null
    private var anIDirect3DSurface965: IDirect3DSurface? = null

    fun method495(i: Byte, i_0_: Int): Int {
        if (i.toInt() != 91) anIDirect3DSurface964 = null
        return anIDirect3DSwapChain963!!.Present(i_0_)
    }

    fun method496(i: Byte) {
        if (null != anIDirect3DSurface965) {
            anIDirect3DSurface965!!.a(9275)
            anIDirect3DSurface965 = null
        }
        if (anIDirect3DSurface964 != null) {
            anIDirect3DSurface964!!.a(9275)
            anIDirect3DSurface964 = null
        }
        val i_1_ = -115 / ((i - -20) / 51)
        if (anIDirect3DSwapChain963 != null) {
            anIDirect3DSwapChain963!!.a(9275)
            anIDirect3DSwapChain963 = null
        }
    }

    fun method497(idirect3dswapchain: IDirect3DSwapChain?, i: Byte, idirect3dsurface: IDirect3DSurface?) {
        anIDirect3DSurface964 = idirect3dsurface
        if (i.toInt() == -107) {
            anIDirect3DSwapChain963 = idirect3dswapchain
            anIDirect3DSurface965 = anIDirect3DSwapChain963!!.a(0, 0)
        }
    }

    fun method498(i: Int): Boolean {
        val i_2_ = -21 / ((7 - i) / 51)
        return null != anIDirect3DSwapChain963
    }

    init {
        method497(idirect3dswapchain, (-107).toByte(), idirect3dsurface)
    }
}
