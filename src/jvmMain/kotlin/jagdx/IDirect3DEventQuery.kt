package jagdx

import jaclib.peer.IUnknown
import jaclib.peer.hb

actual class IDirect3DEventQuery actual constructor(arg0: hb?) : IUnknown(arg0) {
    actual external fun Issue(): Int

    actual external fun IsSignaled(): Int
}
