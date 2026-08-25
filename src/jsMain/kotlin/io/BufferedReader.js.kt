package io

actual open class BufferedReader : Reader {

    private val input: Reader
    private val buf: CharArray
    private var pos = 0
    private var count = 0
    private var closed = false

    actual constructor(input: Reader) : this(input, DEFAULT_BUFFER_SIZE)

    actual constructor(input: Reader, size: Int) : super() {
        require(size > 0) { "Buffer size <= 0" }
        this.input = input
        this.buf = CharArray(size)
    }

    /** Ensures at least one buffered character; returns false at end of stream. */
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
        return if (!fill()) -1 else buf[pos++].code
    }

    actual override fun read(cbuf: CharArray, off: Int, len: Int): Int {
        checkOpen()
        checkBounds(cbuf.size, off, len)
        if (len == 0) return 0
        if (!fill()) return -1
        val n = minOf(len, count - pos)
        for (i in 0 until n) cbuf[off + i] = buf[pos + i]
        pos += n
        return n
    }

    /** Terminates on `\n`, `\r` or `\r\n`; the terminator is not part of the result. */
    actual open fun readLine(): String? {
        checkOpen()
        val sb = StringBuilder()
        var sawAnything = false
        while (fill()) {
            sawAnything = true
            val c = buf[pos++]
            when (c) {
                '\n' -> return sb.toString()
                '\r' -> {
                    if (fill() && buf[pos] == '\n') pos++
                    return sb.toString()
                }
                else -> sb.append(c)
            }
        }
        return if (!sawAnything && sb.isEmpty()) null else sb.toString()
    }

    override fun ready(): Boolean = !closed && (pos < count || input.ready())

    actual override fun close() {
        if (closed) return
        closed = true
        input.close()
    }

    private fun checkOpen() {
        if (closed) throw IOException("Stream closed")
    }
}
