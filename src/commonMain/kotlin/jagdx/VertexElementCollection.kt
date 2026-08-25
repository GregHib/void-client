package jagdx

import jaclib.peer.hb
import jaclib.peer.uda

expect class VertexElementCollection(arg0: hb?) : uda {
    fun init()

    fun finish()

    fun addElement(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: Int)

    fun reset()
}
