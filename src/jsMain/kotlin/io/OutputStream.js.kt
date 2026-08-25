package io

actual abstract class OutputStream actual constructor() : AutoCloseable {

    actual abstract fun write(b: Int)

    actual open fun write(b: ByteArray) {
        write(b, 0, b.size)
    }

    actual open fun write(b: ByteArray, off: Int, len: Int) {
        checkBounds(b.size, off, len)
        for (i in 0 until len) write(b[off + i].toInt())
    }

    actual open fun flush() {}
}
