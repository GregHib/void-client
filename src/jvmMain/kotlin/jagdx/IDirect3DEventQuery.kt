package jagdx

import jaclib.peer.IUnknown
import jaclib.peer.hb

class IDirect3DEventQuery(arg0: hb?) : IUnknown(arg0) {
    external fun Issue(): Int

    external fun IsSignaled(): Int
}
