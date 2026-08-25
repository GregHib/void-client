package jagdx

import jaclib.peer.IUnknown
import jaclib.peer.hb

expect class IDirect3DEventQuery(arg0: hb?) : IUnknown {
    fun Issue(): Int

    fun IsSignaled(): Int
}
