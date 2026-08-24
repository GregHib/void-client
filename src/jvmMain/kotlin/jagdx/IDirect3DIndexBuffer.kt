package jagdx

import jaclib.peer.IUnknown
import jaclib.peer.hb

class IDirect3DIndexBuffer(arg0: hb?) : IUnknown(arg0) {
    override fun a(): Long {
        return super.a()
    }

    external fun Unlock(): Int

    external fun Lock(arg0: Int, arg1: Int, arg2: Int, arg3: GeometryBuffer?): Int

    private external fun _Update(arg0: Long, arg1: Int, arg2: Int): Boolean
}
