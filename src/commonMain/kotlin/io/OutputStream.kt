package io

expect abstract class OutputStream() {
    abstract fun write(b: Int)
    open fun write(b: ByteArray, off: Int, len: Int)
    open fun flush()
    open fun close()
}