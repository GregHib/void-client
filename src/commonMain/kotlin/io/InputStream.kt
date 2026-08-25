package io

expect abstract class InputStream() {
    abstract fun read(): Int
    open fun read(b: ByteArray, off: Int, len: Int): Int
    open fun close()
}