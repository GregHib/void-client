package jagdx

import jaclib.memory.Source
import jaclib.peer.IUnknown
import jaclib.peer.hb

class IDirect3DVertexBuffer(arg0: hb?) : IUnknown(arg0) {
    var b: Int = 0

    private external fun _Update(arg0: Long, arg1: Int, arg2: Int, arg3: Int): Boolean

    fun a(arg0: Source, arg1: Int, arg2: Int, arg3: Int, arg4: Int): Boolean {
        if (arg0 == null || arg3 > arg0.getSize() + arg1) {
            throw fda("")
        } else if (arg3 > arg2 + this.b) {
            throw fda("")
        } else {
            return this._Update(arg1.toLong() + arg0.getAddress(), arg2, arg3, arg4)
        }
    }

    external fun Unlock(): Int

    override fun a(): Long {
        this.b = 0
        return super.a()
    }

    external fun Lock(arg0: Int, arg1: Int, arg2: Int, arg3: GeometryBuffer?): Int
}
