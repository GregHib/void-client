package jagdx

import jaclib.peer.hb

expect class IDirect3DVolumeTexture(arg0: hb?) : IDirect3DBaseTexture {
    fun UnlockBox(arg0: Int): Boolean

    fun LockBox(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: Int, arg6: Int, arg7: Int, arg8: PixelBuffer?): Int
}
