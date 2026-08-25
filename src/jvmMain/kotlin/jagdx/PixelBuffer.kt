package jagdx

import jaclib.memory.Buffer
import jaclib.peer.hb
import jaclib.peer.uda

actual class PixelBuffer actual constructor(arg0: hb?) : uda(arg0), Buffer {
    init {
        this.init()
    }

    actual val rowPitch: Int
        external get

    /*private*/ actual external fun getub(arg0: ByteArray?, arg1: Int, arg2: Int, arg3: Int)

    actual override fun a(arg0: ByteArray?, arg1: Int, arg2: Int, arg3: Int) {
        if ((arg2 < 0) or (arg0 == null) or (arg1 < 0) or (arg3 + arg1 > arg0!!.size) || this.getSize() < arg3 + arg2) {
            throw fda()
        }
        this.putub(arg0, arg1, arg2, arg3)
    }

    /*private*/ actual external fun putub(arg0: ByteArray?, arg1: Int, arg2: Int, arg3: Int)

    actual fun a(arg0: IntArray?, arg1: Int, arg2: Int, arg3: Int) {
        if ((arg2 < 0) or (arg1 + arg3 > (arg0?.size ?: 0)) or (arg1 < 0) or (arg0 == null) || arg3 * 4 + arg2 > this.getSize()) {
            throw fda()
        }
        this.puti(arg0, arg1, arg2, arg3)
    }

    /*private*/ actual external fun init()

    actual override fun getAddress(): Long {
        return 0L
    }

    actual external override fun getSize(): Int

    actual fun b(arg0: IntArray?, arg1: Int, arg2: Int, arg3: Int) {
        if ((arg1 < 0) or (arg0 == null) or (arg3 + arg1 > arg0!!.size) or (arg2 < 0) || this.getSize() < arg3 * 4 + arg2) {
            throw fda()
        }
        this.geti(arg0, arg1, arg2, arg3)
    }

    /*private*/ actual external fun puti(arg0: IntArray?, arg1: Int, arg2: Int, arg3: Int)

    /*private*/ actual external fun geti(arg0: IntArray?, arg1: Int, arg2: Int, arg3: Int)

    actual val slicePitch: Int
        external get
}
