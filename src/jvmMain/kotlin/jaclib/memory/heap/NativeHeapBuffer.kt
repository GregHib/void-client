package jaclib.memory.heap

import jaclib.memory.Buffer
import jaclib.memory.Source

class NativeHeapBuffer(private val a: NativeHeap, private val d: Int, @JvmField val b: Int) : Buffer, Source {
    private var c = true

    override fun getAddress(): Long {
        return this.a.getBufferAddress(this.d)
    }

    @Synchronized
    private fun a(): Boolean {
        return this.a.a() && this.c
    }

    @Synchronized
    private fun b() {
        if (this.a()) {
            this.a.deallocateBuffer(this.d)
        }
        this.c = false
    }

    @Synchronized
    override fun a(arg0: ByteArray?, arg1: Int, arg2: Int, arg3: Int) {
        if ((arg1 < 0) or (arg0 == null) or !this.a() or (arg3 + arg1 > arg0!!.size) or (arg2 < 0) or (this.b < arg2 + arg3)) {
            throw RuntimeException()
        }
        this.a.put(this.d, arg0, arg1, arg2, arg3)
    }

    @Synchronized
    @Throws(Throwable::class)
    fun finalize() {
//        super.finalize()
        this.b()
    }

    override fun getSize(): Int {
        return this.b
    }
}
