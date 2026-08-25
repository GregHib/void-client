package lang

actual class StringBuffer actual constructor() {
    internal val delegate = java.lang.StringBuffer()

    actual constructor(initial: String) : this() {
        delegate.append(initial)
    }

    actual constructor(capacity: Int) : this() {
        delegate.ensureCapacity(capacity)
    }

    actual val length: Int get() = delegate.length

    actual fun get(index: Int): Char = delegate[index]

    actual fun append(value: Any?, i: Int, i2: Int): StringBuffer = apply {
        delegate.append(value.toString(), i, i2)
    }

    actual fun append(value: Any?): StringBuffer = apply { delegate.append(value) }

    actual fun insert(offset: Int, value: Any?): StringBuffer = apply { delegate.insert(offset, value) }

    actual fun delete(start: Int, end: Int): StringBuffer = apply { delegate.delete(start, end) }

    actual fun deleteCharAt(index: Int): StringBuffer = apply { delegate.deleteCharAt(index) }

    actual fun reverse(): StringBuffer = apply { delegate.reverse() }

    actual fun setCharAt(index: Int, ch: Char) = delegate.setCharAt(index, ch)

    actual fun charAt(index: Int): Char = delegate[index]

    actual fun setLength(newLength: Int) = delegate.setLength(newLength)

    actual override fun toString(): String = delegate.toString()
}
