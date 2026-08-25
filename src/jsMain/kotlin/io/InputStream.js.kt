package io

actual abstract class InputStream actual constructor() : AutoCloseable {

    actual abstract fun read(): Int

    actual open fun read(b: ByteArray): Int = read(b, 0, b.size)

    actual open fun read(b: ByteArray, off: Int, len: Int): Int {
        checkBounds(b.size, off, len)
        if (len == 0) return 0
        val first = read()
        if (first < 0) return -1
        b[off] = first.toByte()
        var i = 1
        while (i < len) {
            val c = read()
            if (c < 0) break
            b[off + i] = c.toByte()
            i++
        }
        return i
    }

    actual open fun skip(n: Long): Long {
        if (n <= 0L) return 0L
        val buf = ByteArray(minOf(n, DEFAULT_BUFFER_SIZE.toLong()).toInt())
        var remaining = n
        while (remaining > 0L) {
            val read = read(buf, 0, minOf(remaining, buf.size.toLong()).toInt())
            if (read <= 0) break
            remaining -= read
        }
        return n - remaining
    }

    actual open fun available(): Int = 0
}
