package jagdx

import jaclib.memory.Source
import jaclib.peer.IUnknown
import jaclib.peer.hb

actual class IDirect3DVertexBuffer actual constructor(arg0: hb?) : IUnknown(arg0) {
    actual var b: Int
        get() = TODO("Not yet implemented")
        set(value) {}

    actual fun _Update(arg0: Long, arg1: Int, arg2: Int, arg3: Int): Boolean {
        TODO("Not yet implemented")
    }

    actual fun a(arg0: Source, arg1: Int, arg2: Int, arg3: Int, arg4: Int): Boolean {
        TODO("Not yet implemented")
    }

    actual override fun a(): Long {
        TODO("Not yet implemented")
    }

    actual fun Unlock(): Int {
        TODO("Not yet implemented")
    }

    actual fun Lock(arg0: Int, arg1: Int, arg2: Int, arg3: GeometryBuffer?): Int {
        TODO("Not yet implemented")
    }
}