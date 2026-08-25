package io

expect open class StringReader(s: String) : Reader {
    override fun read(): Int
    override fun read(cbuf: CharArray, off: Int, len: Int): Int
    override fun skip(n: Long): Long
    override fun ready(): Boolean
    fun markSupported(): Boolean
    fun mark(readAheadLimit: Int)
    fun reset()
    override fun close()
}