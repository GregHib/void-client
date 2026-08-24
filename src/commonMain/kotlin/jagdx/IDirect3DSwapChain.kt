package jagdx

import jaclib.peer.IUnknown
import jaclib.peer.hb

class IDirect3DSwapChain(private val b: hb?) : IUnknown(b) {
    fun a(arg0: Int, arg1: Int): IDirect3DSurface {
        val local5 = IDirect3DSurface(this.b)
        val local11 = this._GetBackBuffer(arg0, arg1, local5)
        if (ue.a(97.toByte(), local11)) {
            throw fda(local11.toString())
        }
        return local5
    }

    private external fun _GetBackBuffer(arg0: Int, arg1: Int, arg2: IDirect3DSurface?): Int

    external fun Present(arg0: Int): Int
}
