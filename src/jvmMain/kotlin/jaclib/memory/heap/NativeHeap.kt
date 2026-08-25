package jaclib.memory.heap


actual class NativeHeap actual constructor(/*private*/ actual val b: Int) {
    /*private*/ actual val peer: Long = 0

    /*private*/ actual var a: Boolean

    init {
        this.allocateHeap(this.b)
        this.a = true
    }

    /*private*/ actual external fun allocateHeap(arg0: Int)

    @Synchronized
    actual fun a(): Boolean {
        return this.a
    }

    actual fun a(arg0: Int, arg1: Boolean): NativeHeapBuffer {
        check(this.a)
        return NativeHeapBuffer(this, this.allocateBuffer(arg0, arg1), arg0)
    }

    @Synchronized
    @Throws(Throwable::class)
    actual fun finalize() {
//        super.finalize()
        this.b()
    }

    @Synchronized
    actual fun b() {
        if (this.a) {
            this.deallocateHeap()
        }
        this.a = false
    }

    @Synchronized
    /*private*/ actual external fun allocateBuffer(arg0: Int, arg1: Boolean): Int

    @Synchronized
    /*private*/ actual external fun get(arg0: Int, arg1: ByteArray?, arg2: Int, arg3: Int, arg4: Int)

    @Synchronized
    actual external fun put(arg0: Int, arg1: ByteArray?, arg2: Int, arg3: Int, arg4: Int)

    /*private*/ actual external fun deallocateHeap()

    @Synchronized
    actual external fun getBufferAddress(arg0: Int): Long

    @Synchronized
    actual external fun deallocateBuffer(arg0: Int)
}
