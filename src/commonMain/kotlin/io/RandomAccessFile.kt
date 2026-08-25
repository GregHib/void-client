package io

expect open class RandomAccessFile(name: String, mode: String) : AutoCloseable {
    open fun read(): Int
    open fun read(b: ByteArray): Int
    open fun read(b: ByteArray, off: Int, len: Int): Int
    fun readFully(b: ByteArray)
    fun readFully(b: ByteArray, off: Int, len: Int)

    open fun write(b: Int)
    open fun write(b: ByteArray)
    open fun write(b: ByteArray, off: Int, len: Int)

    open fun seek(pos: Long)
    open fun getFilePointer(): Long
    open fun length(): Long
    open fun setLength(newLength: Long)
    open fun skipBytes(n: Int): Int

    override fun close()
}