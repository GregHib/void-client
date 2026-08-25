package io

expect open class BufferedReader : Reader {
    constructor(input: Reader)
    constructor(input: Reader, size: Int)

    open fun readLine(): String?

    override fun read(): Int
    override fun read(cbuf: CharArray, off: Int, len: Int): Int
    override fun close()
}