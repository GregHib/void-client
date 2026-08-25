package jagdx

import jaclib.memory.Buffer
import jaclib.peer.hb
import jaclib.peer.uda

actual class PixelBuffer actual constructor(arg0: hb?) : uda(arg0), Buffer {
    actual val rowPitch: Int
        get() = TODO("Not yet implemented")

    actual fun getub(arg0: ByteArray?, arg1: Int, arg2: Int, arg3: Int) {
    }

    actual override fun a(arg0: ByteArray?, arg1: Int, arg2: Int, arg3: Int) {
    }

    actual fun a(arg0: IntArray?, arg1: Int, arg2: Int, arg3: Int) {
    }

    actual fun putub(arg0: ByteArray?, arg1: Int, arg2: Int, arg3: Int) {
    }

    actual fun init() {
    }

    actual override fun getAddress(): Long {
        TODO("Not yet implemented")
    }

    actual override fun getSize(): Int {
        TODO("Not yet implemented")
    }

    actual fun b(arg0: IntArray?, arg1: Int, arg2: Int, arg3: Int) {
    }

    actual fun puti(arg0: IntArray?, arg1: Int, arg2: Int, arg3: Int) {
    }

    actual fun geti(arg0: IntArray?, arg1: Int, arg2: Int, arg3: Int) {
    }

    actual val slicePitch: Int
        get() = TODO("Not yet implemented")
}