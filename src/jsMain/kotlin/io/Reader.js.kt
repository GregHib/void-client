package io

actual abstract class Reader protected actual constructor() : AutoCloseable {

    actual open fun read(): Int {
        val one = CharArray(1)
        return if (read(one, 0, 1) <= 0) -1 else one[0].code
    }

    actual abstract fun read(cbuf: CharArray, off: Int, len: Int): Int

    actual open fun read(cbuf: CharArray): Int = read(cbuf, 0, cbuf.size)

    actual open fun skip(n: Long): Long {
        if (n <= 0L) return 0L
        val buf = CharArray(minOf(n, DEFAULT_BUFFER_SIZE.toLong()).toInt())
        var remaining = n
        while (remaining > 0L) {
            val read = read(buf, 0, minOf(remaining, buf.size.toLong()).toInt())
            if (read <= 0) break
            remaining -= read
        }
        return n - remaining
    }

    actual open fun ready(): Boolean = false
}
