package jagdx

import jaclib.peer.IUnknown
import jaclib.peer.hb

expect class IDirect3DIndexBuffer(arg0: hb?) : IUnknown {
    override fun a(): Long 

    fun Unlock(): Int

    fun Lock(arg0: Int, arg1: Int, arg2: Int, arg3: GeometryBuffer?): Int

    fun _Update(arg0: Long, arg1: Int, arg2: Int): Boolean
}
