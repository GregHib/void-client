package jaclib.memory


open expect class NativeBuffer : Buffer, Source {
    var a: Long

    var b: Int

    override fun getAddress(): Long 

    override fun a(arg0: ByteArray?, arg1: Int, arg2: Int, arg3: Int) 

    override fun getSize(): Int 

    fun a(arg0: Long, arg1: Int) 

    fun get(arg0: Long, arg1: ByteArray?, arg2: Int, arg3: Int, arg4: Int)

    fun put(arg0: Long, arg1: ByteArray?, arg2: Int, arg3: Int, arg4: Int)
}
