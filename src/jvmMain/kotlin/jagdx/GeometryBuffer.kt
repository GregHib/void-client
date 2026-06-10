package jagdx

import jaclib.memory.Buffer
import jaclib.peer.hb
import jaclib.peer.uda

class GeometryBuffer(arg0: hb?) : uda(arg0), Buffer {
    init {
        this.init()
    }

    external override fun getAddress(): Long

    override fun a(arg0: ByteArray?, arg1: Int, arg2: Int, arg3: Int) {
        if ((arg2 < 0) or (arg0 == null) or (arg1 < 0) or (arg1 + arg3 > arg0!!.size) || arg3 + arg2 > this.getSize()) {
            throw fda()
        }
        this.putub(arg0, arg1, arg2, arg3)
    }

    private external fun getub(arg0: ByteArray?, arg1: Int, arg2: Int, arg3: Int)

    private external fun init()

    private external fun putub(arg0: ByteArray?, arg1: Int, arg2: Int, arg3: Int)

    external override fun getSize(): Int
}
