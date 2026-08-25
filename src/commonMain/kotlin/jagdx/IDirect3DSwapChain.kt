package jagdx

import jaclib.peer.IUnknown
import jaclib.peer.hb

expect class IDirect3DSwapChain(b: hb?) : IUnknown {
    val b: hb?
    fun a(arg0: Int, arg1: Int): IDirect3DSurface 

    fun _GetBackBuffer(arg0: Int, arg1: Int, arg2: IDirect3DSurface?): Int

    fun Present(arg0: Int): Int
}
