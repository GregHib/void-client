package jagdx

import jaclib.memory.Buffer
import jaclib.peer.hb
import jaclib.peer.uda

actual class GeometryBuffer actual constructor(arg0: hb?) : uda(arg0), Buffer {
    actual override fun getAddress(): Long {
        TODO("Not yet implemented")
    }

    actual override fun a(arg0: ByteArray?, arg1: Int, arg2: Int, arg3: Int) {
    }

    actual fun getub(arg0: ByteArray?, arg1: Int, arg2: Int, arg3: Int) {
    }

    actual fun init() {
    }

    actual fun putub(arg0: ByteArray?, arg1: Int, arg2: Int, arg3: Int) {
    }

    actual override fun getSize(): Int {
        TODO("Not yet implemented")
    }
}