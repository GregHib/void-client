package jagdx

import jaclib.memory.Source
import jaclib.peer.IUnknown
import jaclib.peer.hb

expect class IDirect3DVertexBuffer(arg0: hb?) : IUnknown {
    var b: Int

    fun _Update(arg0: Long, arg1: Int, arg2: Int, arg3: Int): Boolean

    fun a(arg0: Source, arg1: Int, arg2: Int, arg3: Int, arg4: Int): Boolean 

    fun Unlock(): Int

    override fun a(): Long 

    fun Lock(arg0: Int, arg1: Int, arg2: Int, arg3: GeometryBuffer?): Int
}
