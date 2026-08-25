package jagdx

import jaclib.peer.IUnknown
import jaclib.peer.hb

expect class IDirect3DSwapChain(val b: hb?) : IUnknown {
    fun a(arg0: Int, arg1: Int): IDirect3DSurface 

    fun _GetBackBuffer(arg0: Int, arg1: Int, arg2: IDirect3DSurface?): Int

    fun Present(arg0: Int): Int
}
