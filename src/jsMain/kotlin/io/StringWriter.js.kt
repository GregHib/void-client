package io

actual open class StringWriter : Writer {

    private val sb: StringBuilder

    actual constructor() : super() {
        sb = StringBuilder()
    }

    actual constructor(initialSize: Int) : super() {
        require(initialSize >= 0) { "Negative buffer size" }
        sb = StringBuilder(initialSize)
    }

    actual override fun write(c: Int) {
        sb.append(Char(c and 0xFFFF))
    }

    actual override fun write(cbuf: CharArray, off: Int, len: Int) {
        sb.appendRange(cbuf, off, off + len)
    }

    actual override fun write(str: String) {
        sb.append(str)
    }

    actual override fun write(str: String, off: Int, len: Int) {
        sb.append(str, off, off + len)
    }

    open fun getBuffer(): StringBuilder = sb

    /** No-op, exactly as on the JVM. */
    actual override fun flush() {}

    /** No-op, exactly as on the JVM: the buffer stays readable after close. */
    actual override fun close() {}

    actual override fun toString(): String = sb.toString()
}