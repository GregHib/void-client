package io

actual abstract class InputStream actual constructor() {
    actual abstract fun read(): Int
    actual open fun read(b: ByteArray, off: Int, len: Int): Int {
        TODO("Not yet implemented")
    }

    actual open fun close() {
    }
}