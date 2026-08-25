package jaclib.memory.heap

expect class NativeHeap(val b: Int) {
    val peer: Long

    var a: Boolean

    fun allocateHeap(arg0: Int)

    /*@Synchronized*/
    fun a(): Boolean 

    fun a(arg0: Int, arg1: Boolean): NativeHeapBuffer 

    /*@Synchronized*/
    @Throws(Throwable::class)
    fun finalize() 

    /*@Synchronized*/
    fun b() 

    /*@Synchronized*/
    fun allocateBuffer(arg0: Int, arg1: Boolean): Int

    /*@Synchronized*/
    fun get(arg0: Int, arg1: ByteArray?, arg2: Int, arg3: Int, arg4: Int)

    /*@Synchronized*/
    fun put(arg0: Int, arg1: ByteArray?, arg2: Int, arg3: Int, arg4: Int)

    fun deallocateHeap()

    /*@Synchronized*/
    fun getBufferAddress(arg0: Int): Long

    /*@Synchronized*/
    fun deallocateBuffer(arg0: Int)
}
