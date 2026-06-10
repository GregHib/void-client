package jagdx

import jaclib.peer.hb
import jaclib.peer.uda

class VertexElementCollection(arg0: hb?) : uda(arg0) {
    init {
        this.init()
    }

    private external fun init()

    external fun finish()

    external fun addElement(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: Int)

    private external fun reset()
}
