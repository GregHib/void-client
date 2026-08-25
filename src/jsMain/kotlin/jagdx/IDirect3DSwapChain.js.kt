package jagdx

import jaclib.peer.IUnknown
import jaclib.peer.hb

actual class IDirect3DSwapChain actual constructor(actual val b: hb?) : IUnknown(b) {
    actual fun a(arg0: Int, arg1: Int): IDirect3DSurface {
        TODO("Not yet implemented")
    }

    actual fun _GetBackBuffer(arg0: Int, arg1: Int, arg2: IDirect3DSurface?): Int {
        TODO("Not yet implemented")
    }

    actual fun Present(arg0: Int): Int {
        TODO("Not yet implemented")
    }
}