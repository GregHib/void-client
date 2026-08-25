package io

actual open class StringReader actual constructor(s: String) : Reader() {

    private val value: String = s
    private var position: Int = 0
    private var markPosition: Int = 0
    private var closed = false

    actual override fun read(): Int {
        checkOpen()
        if (position >= value.length) return -1
        return value[position++].code
    }

    actual override fun read(cbuf: CharArray, off: Int, len: Int): Int {
        checkOpen()
        checkBounds(cbuf.size, off, len)
        if (len == 0) return 0
        if (position >= value.length) return -1
        val n = minOf(len, value.length - position)
        for (i in 0 until n) {
            cbuf[off + i] = value[position + i]
        }
        position += n
        return n
    }

    actual override fun skip(n: Long): Long {
        checkOpen()
        if (n <= 0L) return 0L
        val remaining = (value.length - position).toLong()
        val skipped = minOf(n, remaining)
        position += skipped.toInt()
        return skipped
    }

    actual override fun ready(): Boolean {
        checkOpen()
        return true
    }

    actual fun markSupported(): Boolean = true

    actual fun mark(readAheadLimit: Int) {
        checkOpen()
        markPosition = position
    }

    actual fun reset() {
        checkOpen()
        position = markPosition
    }

    actual override fun close() {
        closed = true
    }

    private fun checkOpen() {
        if (closed) throw IOException("Stream closed")
    }
}