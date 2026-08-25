package io

expect open class InputStreamReader : Reader {
    constructor(input: InputStream)
    constructor(input: InputStream, charsetName: String)

    override fun read(): Int
    override fun read(cbuf: CharArray, off: Int, len: Int): Int
    override fun close()
}