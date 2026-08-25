package io

actual open class ByteArrayInputStream : InputStream {

    private val buf: ByteArray
    private var pos: Int
    private val end: Int
    private var markPos: Int

    actual constructor(buf: ByteArray) : this(buf, 0, buf.size)

    actual constructor(buf: ByteArray, offset: Int, length: Int) : super() {
        require(offset >= 0 && length >= 0 && offset + length <= buf.size) {
            "offset=$offset, length=$length, size=${buf.size}"
        }
        this.buf = buf
        this.pos = offset
        this.markPos = offset
        this.end = offset + length
    }

    actual override fun read(): Int = if (pos < end) buf[pos++].toInt() and 0xFF else -1

    actual override fun read(b: ByteArray, off: Int, len: Int): Int {
        if (len == 0) return 0
        if (pos >= end) return -1
        val n = minOf(len, end - pos)
        for (i in 0 until n) b[off + i] = buf[pos + i]
        pos += n
        return n
    }

    override fun skip(n: Long): Long {
        if (n <= 0L) return 0L
        val skipped = minOf(n, (end - pos).toLong())
        pos += skipped.toInt()
        return skipped
    }

    override fun available(): Int = end - pos

    open fun markSupported(): Boolean = true

    open fun mark(readAheadLimit: Int) {
        markPos = pos
    }

    open fun reset() {
        pos = markPos
    }

    /** No-op, exactly as on the JVM. */
    actual override fun close() {}
}