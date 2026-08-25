package io

expect open class FilterInputStream protected constructor(input: InputStream) : InputStream {
    override fun read(): Int
    override fun read(b: ByteArray, off: Int, len: Int): Int
    override fun close()
}