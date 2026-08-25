package io

expect open class StringWriter : Writer {
    constructor()
    constructor(initialSize: Int)

    override fun write(c: Int)
    override fun write(cbuf: CharArray, off: Int, len: Int)
    override fun write(str: String)
    override fun write(str: String, off: Int, len: Int)
    override fun flush()
    override fun close()
    override fun toString(): String
}