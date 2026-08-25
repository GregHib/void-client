package io

expect open class BufferedInputStream : FilterInputStream {
    constructor(input: InputStream)
    constructor(input: InputStream, size: Int)

    override fun read(): Int
    override fun read(b: ByteArray, off: Int, len: Int): Int
    override fun close()
}