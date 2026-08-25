package io

actual open class InputStreamReader : Reader {

    private val input: InputStream
    private val decoder: TextDecoder
    private val bytes = ByteArray(DEFAULT_BUFFER_SIZE)

    /** Decoded-but-not-yet-consumed characters. */
    private var pending: String = ""
    private var pos = 0
    private var endOfInput = false
    private var closed = false

    actual constructor(input: InputStream) : this(input, "UTF-8")

    actual constructor(input: InputStream, charsetName: String) : super() {
        this.input = input
        this.decoder = try {
            TextDecoder(charsetName)
        } catch (e: Throwable) {
            // The JVM would throw UnsupportedEncodingException, which is an IOException.
            throw IOException("Unsupported encoding: $charsetName", e)
        }
    }

    /** Ensures at least one character is buffered; returns false at end of stream. */
    private fun fill(): Boolean {
        while (pos >= pending.length) {
            if (endOfInput) return false
            val n = input.read(bytes, 0, bytes.size)
            pos = 0
            pending = if (n <= 0) {
                endOfInput = true
                decoder.decode() // flush any trailing partial sequence
            } else {
                decoder.decode(bytes.asUint8Array().subarray(0, n), STREAM_OPTIONS)
            }
        }
        return true
    }

    actual override fun read(): Int {
        checkOpen()
        return if (!fill()) -1 else pending[pos++].code
    }

    actual override fun read(cbuf: CharArray, off: Int, len: Int): Int {
        checkOpen()
        checkBounds(cbuf.size, off, len)
        if (len == 0) return 0
        if (!fill()) return -1
        var i = 0
        while (i < len && pos < pending.length) {
            cbuf[off + i] = pending[pos]
            pos++
            i++
        }
        return i
    }

    override fun ready(): Boolean = !closed && pos < pending.length

    actual override fun close() {
        if (closed) return
        closed = true
        input.close()
    }

    private fun checkOpen() {
        if (closed) throw IOException("Stream closed")
    }

    private companion object {
        val STREAM_OPTIONS: dynamic = js("({ stream: true })")
    }
}