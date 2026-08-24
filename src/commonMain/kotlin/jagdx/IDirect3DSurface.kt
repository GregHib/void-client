package jagdx

import jaclib.peer.IUnknown
import jaclib.peer.hb

class IDirect3DSurface(arg0: hb?) : IUnknown(arg0) {
    external fun LockRect(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: PixelBuffer?): Int

    external fun UnlockRect(): Boolean
}
