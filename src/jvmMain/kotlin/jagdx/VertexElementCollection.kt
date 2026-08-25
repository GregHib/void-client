package jagdx

import jaclib.peer.hb
import jaclib.peer.uda

actual class VertexElementCollection actual constructor(arg0: hb?) : uda(arg0) {
    init {
        this.init()
    }

    /*private*/ actual external fun init()

    actual external fun finish()

    actual external fun addElement(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: Int)

    /*private*/ actual external fun reset()
}
