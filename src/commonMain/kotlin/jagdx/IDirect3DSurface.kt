package jagdx

import jaclib.peer.IUnknown
import jaclib.peer.hb

expect class IDirect3DSurface(arg0: hb?) : IUnknown {
    fun LockRect(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: PixelBuffer?): Int

    fun UnlockRect(): Boolean
}
