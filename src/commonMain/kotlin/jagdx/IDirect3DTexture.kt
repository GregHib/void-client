package jagdx

import jaclib.peer.hb

expect class IDirect3DTexture(arg0: hb?) : IDirect3DBaseTexture {
    fun LockRect(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: Int, arg6: PixelBuffer?): Int

    fun UnlockRect(arg0: Int): Boolean
}
