package jagdx

import jaclib.memory.Buffer
import jaclib.peer.hb
import jaclib.peer.uda

class PixelBuffer(arg0: hb?) : uda(arg0), Buffer {
    init {
        this.init()
    }

    val rowPitch: Int
        external get

    private external fun getub(arg0: ByteArray?, arg1: Int, arg2: Int, arg3: Int)

    override fun a(arg0: ByteArray?, arg1: Int, arg2: Int, arg3: Int) {
        if ((arg2 < 0) or (arg0 == null) or (arg1 < 0) or (arg3 + arg1 > arg0!!.size) || this.getSize() < arg3 + arg2) {
            throw fda()
        }
        this.putub(arg0, arg1, arg2, arg3)
    }

    private external fun putub(arg0: ByteArray?, arg1: Int, arg2: Int, arg3: Int)

    fun a(arg0: IntArray?, arg1: Int, arg2: Int, arg3: Int) {
        if ((arg2 < 0) or (arg1 + arg3 > (arg0?.size ?: 0)) or (arg1 < 0) or (arg0 == null) || arg3 * 4 + arg2 > this.getSize()) {
            throw fda()
        }
        this.puti(arg0, arg1, arg2, arg3)
    }

    private external fun init()

    override fun getAddress(): Long {
        return 0L
    }

    external override fun getSize(): Int

    fun b(arg0: IntArray?, arg1: Int, arg2: Int, arg3: Int) {
        if ((arg1 < 0) or (arg0 == null) or (arg3 + arg1 > arg0!!.size) or (arg2 < 0) || this.getSize() < arg3 * 4 + arg2) {
            throw fda()
        }
        this.geti(arg0, arg1, arg2, arg3)
    }

    private external fun puti(arg0: IntArray?, arg1: Int, arg2: Int, arg3: Int)

    private external fun geti(arg0: IntArray?, arg1: Int, arg2: Int, arg3: Int)

    val slicePitch: Int
        external get
}
