package io

actual open class BufferedInputStream : FilterInputStream {

    private val buf: ByteArray
    private var pos = 0
    private var count = 0
    private var closed = false

    actual constructor(input: InputStream) : this(input, DEFAULT_BUFFER_SIZE)

    actual constructor(input: InputStream, size: Int) : super(input) {
        require(size > 0) { "Buffer size <= 0" }
        buf = ByteArray(size)
    }

    /** Ensures at least one buffered byte; false at end of stream. */
    private fun fill(): Boolean {
        if (pos < count) return true
        val n = input.read(buf, 0, buf.size)
        if (n <= 0) return false
        pos = 0
        count = n
        return true
    }

    actual override fun read(): Int {
        checkOpen()
        return if (!fill()) -1 else buf[pos++].toInt() and 0xFF
    }

    actual override fun read(b: ByteArray, off: Int, len: Int): Int {
        checkOpen()
        if (len == 0) return 0
        // Bypass the buffer entirely for large reads on an empty buffer.
        if (pos >= count && len >= buf.size) return input.read(b, off, len)
        if (!fill()) return -1
        val n = minOf(len, count - pos)
        for (i in 0 until n) b[off + i] = buf[pos + i]
        pos += n
        return n
    }

    override fun skip(n: Long): Long {
        checkOpen()
        if (n <= 0L) return 0L
        val buffered = (count - pos).toLong()
        if (buffered >= n) {
            pos += n.toInt()
            return n
        }
        pos = count
        return buffered + input.skip(n - buffered)
    }

    override fun available(): Int {
        checkOpen()
        return (count - pos) + input.available()
    }

    actual override fun close() {
        if (closed) return
        closed = true
        pos = 0
        count = 0
        input.close()
    }

    private fun checkOpen() {
        if (closed) throw IOException("Stream closed")
    }
}