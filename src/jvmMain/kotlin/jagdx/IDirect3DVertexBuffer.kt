package jagdx

import jaclib.memory.Source
import jaclib.peer.IUnknown
import jaclib.peer.hb

actual class IDirect3DVertexBuffer actual constructor(arg0: hb?) : IUnknown(arg0) {
    actual var b: Int = 0

    /*private*/ actual external fun _Update(arg0: Long, arg1: Int, arg2: Int, arg3: Int): Boolean

    actual fun a(arg0: Source, arg1: Int, arg2: Int, arg3: Int, arg4: Int): Boolean {
        if (arg0 == null || arg3 > arg0.getSize() + arg1) {
            throw fda("")
        } else if (arg3 > arg2 + this.b) {
            throw fda("")
        } else {
            return this._Update(arg1.toLong() + arg0.getAddress(), arg2, arg3, arg4)
        }
    }

    actual external fun Unlock(): Int

    actual override fun a(): Long {
        this.b = 0
        return super.a()
    }

    actual external fun Lock(arg0: Int, arg1: Int, arg2: Int, arg3: GeometryBuffer?): Int
}
