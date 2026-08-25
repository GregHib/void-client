package jagdx

import jaclib.peer.IUnknown
import jaclib.peer.hb

actual class IDirect3DIndexBuffer actual constructor(arg0: hb?) : IUnknown(arg0) {
    actual override fun a(): Long {
        return super.a()
    }

    actual external fun Unlock(): Int

    actual external fun Lock(arg0: Int, arg1: Int, arg2: Int, arg3: GeometryBuffer?): Int

    /*private*/ actual external fun _Update(arg0: Long, arg1: Int, arg2: Int): Boolean
}
