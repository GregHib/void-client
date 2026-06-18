package jaclib.memory


interface Buffer {
    fun getSize(): Int

	fun getAddress(): Long

    fun a(arg0: ByteArray?, arg1: Int, arg2: Int, arg3: Int)
}
