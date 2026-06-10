package jagdx

import jaclib.peer.hb

class IDirect3DTexture(arg0: hb?) : IDirect3DBaseTexture(arg0) {
    external fun LockRect(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: Int, arg6: PixelBuffer?): Int

    external fun UnlockRect(arg0: Int): Boolean
}
