package io

actual open class FilterInputStream protected actual constructor(
    input: InputStream,
) : InputStream() {

    protected val input: InputStream = input   // was `protected val` in the ctor params

    actual override fun read(): Int = input.read()

    actual override fun read(b: ByteArray, off: Int, len: Int): Int = input.read(b, off, len)

    override fun skip(n: Long): Long = input.skip(n)

    override fun available(): Int = input.available()

    actual override fun close() {
        input.close()
    }
}