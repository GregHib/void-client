package jaclib.memory.heap


class NativeHeap(private val b: Int) {
    private val peer: Long = 0

    private var a: Boolean

    init {
        this.allocateHeap(this.b)
        this.a = true
    }

    private external fun allocateHeap(arg0: Int)

    @Synchronized
    fun a(): Boolean {
        return this.a
    }

    fun a(arg0: Int, arg1: Boolean): NativeHeapBuffer {
        check(this.a)
        return NativeHeapBuffer(this, this.allocateBuffer(arg0, arg1), arg0)
    }

    @Synchronized
    @Throws(Throwable::class)
    fun finalize() {
//        super.finalize()
        this.b()
    }

    @Synchronized
    fun b() {
        if (this.a) {
            this.deallocateHeap()
        }
        this.a = false
    }

    @Synchronized
    private external fun allocateBuffer(arg0: Int, arg1: Boolean): Int

    @Synchronized
    private external fun get(arg0: Int, arg1: ByteArray?, arg2: Int, arg3: Int, arg4: Int)

    @Synchronized
    external fun put(arg0: Int, arg1: ByteArray?, arg2: Int, arg3: Int, arg4: Int)

    private external fun deallocateHeap()

    @Synchronized
    external fun getBufferAddress(arg0: Int): Long

    @Synchronized
    external fun deallocateBuffer(arg0: Int)
}
