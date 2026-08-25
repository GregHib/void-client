package io

actual abstract class Writer protected actual constructor() : AutoCloseable {

    actual open fun write(c: Int) {
        write(charArrayOf(Char(c and 0xFFFF)), 0, 1)
    }

    actual open fun write(cbuf: CharArray) {
        write(cbuf, 0, cbuf.size)
    }

    actual abstract fun write(cbuf: CharArray, off: Int, len: Int)

    actual open fun write(str: String) {
        write(str, 0, str.length)
    }

    actual open fun write(str: String, off: Int, len: Int) {
        val chars = CharArray(len)
        for (i in 0 until len) chars[i] = str[off + i]
        write(chars, 0, len)
    }

    actual abstract fun flush()
}
