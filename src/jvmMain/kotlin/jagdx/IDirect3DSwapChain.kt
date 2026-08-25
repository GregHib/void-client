package jagdx

import jaclib.peer.IUnknown
import jaclib.peer.hb

actual class IDirect3DSwapChain actual constructor(/*private*/ actual val b: hb?) : IUnknown(b) {
    actual fun a(arg0: Int, arg1: Int): IDirect3DSurface {
        val local5 = IDirect3DSurface(this.b)
        val local11 = this._GetBackBuffer(arg0, arg1, local5)
        if (ue.a(97.toByte(), local11)) {
            throw fda(local11.toString())
        }
        return local5
    }

    /*private*/ actual external fun _GetBackBuffer(arg0: Int, arg1: Int, arg2: IDirect3DSurface?): Int

    actual external fun Present(arg0: Int): Int
}
