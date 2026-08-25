package io
actual open class PrintWriter : Writer {

    private val out: Writer
    private val autoFlush: Boolean
    private var trouble = false
    private var closed = false

    actual constructor(out: Writer) : this(out, false)

    actual constructor(out: Writer, autoFlush: Boolean) : super() {
        this.out = out
        this.autoFlush = autoFlush
    }

    /** PrintWriter swallows IOExceptions and latches an error flag instead. */
    private fun guarded(block: () -> Unit) {
        if (closed) {
            trouble = true
            return
        }
        try {
            block()
        } catch (e: Throwable) {
            trouble = true
        }
    }

    actual override fun write(c: Int) = guarded { out.write(c) }

    actual override fun write(cbuf: CharArray, off: Int, len: Int) = guarded { out.write(cbuf, off, len) }

    actual override fun write(str: String) = guarded { out.write(str) }

    actual override fun write(str: String, off: Int, len: Int) = guarded { out.write(str, off, len) }

    actual open fun print(c: Char) = write(c.toString())
    actual open fun print(i: Int) = write(i.toString())
    actual open fun print(l: Long) = write(l.toString())
    actual open fun print(d: Double) = write(d.toString())
    actual open fun print(b: Boolean) = write(b.toString())
    actual open fun print(s: String?) = write(s ?: "null")
    actual open fun print(obj: Any?) = write(obj?.toString() ?: "null")

    actual open fun println() {
        write(LINE_SEPARATOR)
        if (autoFlush) flush()
    }

    actual open fun println(c: Char) {
        print(c); println()
    }

    actual open fun println(i: Int) {
        print(i); println()
    }

    actual open fun println(l: Long) {
        print(l); println()
    }

    actual open fun println(d: Double) {
        print(d); println()
    }

    actual open fun println(b: Boolean) {
        print(b); println()
    }

    actual open fun println(s: String?) {
        print(s); println()
    }

    actual open fun println(obj: Any?) {
        print(obj); println()
    }

    actual open fun checkError(): Boolean {
        if (!closed) flush()
        return trouble
    }

    actual override fun flush() = guarded { out.flush() }

    actual override fun close() {
        if (closed) return
        try {
            out.flush()
            out.close()
        } catch (e: Throwable) {
            trouble = true
        } finally {
            closed = true
        }
    }

    private companion object {
        /** The JVM uses System.lineSeparator(); JS has no equivalent, so "\n". */
        const val LINE_SEPARATOR = "\n"
    }
}
