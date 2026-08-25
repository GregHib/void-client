package jagdx

import jaclib.peer.IUnknown
import jaclib.peer.hb

actual class IDirect3DSurface actual constructor(arg0: hb?) : IUnknown(arg0) {
    actual external fun LockRect(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: PixelBuffer?): Int

    actual external fun UnlockRect(): Boolean
}
