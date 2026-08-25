package util.zip

expect class CRC32() {
    fun update(b: Int)
    fun update(b: ByteArray)
    fun update(b: ByteArray, off: Int, len: Int)
    fun getValue(): Long
    fun reset()
}