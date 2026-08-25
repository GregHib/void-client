package io

expect abstract class Writer protected constructor() : AutoCloseable {
    open fun write(c: Int)
    open fun write(cbuf: CharArray)
    abstract fun write(cbuf: CharArray, off: Int, len: Int)
    open fun write(str: String)
    open fun write(str: String, off: Int, len: Int)
    abstract fun flush()
}