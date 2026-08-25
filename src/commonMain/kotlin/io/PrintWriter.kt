package io

expect open class PrintWriter : Writer {
    constructor(out: Writer)
    constructor(out: Writer, autoFlush: Boolean)

    open fun print(c: Char)
    open fun print(i: Int)
    open fun print(l: Long)
    open fun print(d: Double)
    open fun print(b: Boolean)
    open fun print(s: String?)
    open fun print(obj: Any?)

    open fun println()
    open fun println(c: Char)
    open fun println(i: Int)
    open fun println(l: Long)
    open fun println(d: Double)
    open fun println(b: Boolean)
    open fun println(s: String?)
    open fun println(obj: Any?)

    /** PrintWriter never throws; it latches the error instead. */
    open fun checkError(): Boolean

    override fun write(c: Int)
    override fun write(cbuf: CharArray, off: Int, len: Int)
    override fun write(str: String)
    override fun write(str: String, off: Int, len: Int)
    override fun flush()
    override fun close()
}