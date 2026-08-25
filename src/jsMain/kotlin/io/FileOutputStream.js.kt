package io

actual open class FileOutputStream : OutputStream {

    private val path: String
    private val fd: Int
    private var closed = false

    actual constructor(name: String) : this(name, false)

    actual constructor(name: String, append: Boolean) : super() {
        path = name
        fd = mapNodeErrors(name) { openSync(name, if (append) "a" else "w") }
    }

    actual override fun write(b: Int) {
        write(byteArrayOf(b.toByte()), 0, 1)
    }

    override fun write(b: ByteArray?, off: Int, len: Int) {
        b ?: return
        checkOpen()
        checkBounds(b.size, off, len)
        val view = b.asUint8Array()
        var written = 0
        while (written < len) {
            val n = mapNodeErrors(path) { writeSync(fd, view, off + written, len - written, null) }
            if (n <= 0) throw IOException("Failed to write to $path")
            written += n
        }
    }

    actual override fun close() {
        if (closed) return
        closed = true
        mapNodeErrors(path) { closeSync(fd) }
    }

    private fun checkOpen() {
        if (closed) throw IOException("Stream closed: $path")
    }

    actual override fun flush() {
    }
}