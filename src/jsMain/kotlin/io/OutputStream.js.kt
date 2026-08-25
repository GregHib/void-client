package io

actual abstract class OutputStream actual constructor() {
    actual abstract fun write(b: Int)
    actual open fun write(b: ByteArray, off: Int, len: Int) {
    }

    actual open fun flush() {
    }

    actual open fun close() {
    }
}