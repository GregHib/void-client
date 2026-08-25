package jaclib.memory.heap

actual class NativeHeap actual constructor(actual val b: Int) {
    actual fun b() {
    }

    actual val peer: Long
        get() = TODO("Not yet implemented")

    actual fun a(): Boolean {
        TODO("Not yet implemented")
    }

    actual fun a(arg0: Int, arg1: Boolean): NativeHeapBuffer {
        TODO("Not yet implemented")
    }

    actual var a: Boolean
        get() = TODO("Not yet implemented")
        set(value) {}

    actual fun allocateHeap(arg0: Int) {
    }

//    @Throws(exceptionClasses = [Throwable::class])
    actual fun finalize() {
    }

    actual fun allocateBuffer(arg0: Int, arg1: Boolean): Int {
        TODO("Not yet implemented")
    }

    actual fun get(arg0: Int, arg1: ByteArray?, arg2: Int, arg3: Int, arg4: Int) {
    }

    actual fun put(arg0: Int, arg1: ByteArray?, arg2: Int, arg3: Int, arg4: Int) {
    }

    actual fun deallocateHeap() {
    }

    actual fun getBufferAddress(arg0: Int): Long {
        TODO("Not yet implemented")
    }

    actual fun deallocateBuffer(arg0: Int) {
    }
}