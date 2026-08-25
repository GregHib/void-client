package lang

actual class StringBuffer actual constructor() {

    actual constructor(initial: String) : this() {
        sb.append(initial)
    }

    private val sb = StringBuilder()

    actual val length: Int get() = sb.length

    actual fun get(index: Int): Char = sb[index]

    actual fun append(value: Any?, i: Int, i2: Int): StringBuffer {
        sb.append(value.toString(), i, i2)
        return this
    }

    actual fun append(value: Any?): StringBuffer {
        sb.append(value.toString())
        return this
    }

    actual fun insert(offset: Int, value: Any?): StringBuffer {
        sb.insert(offset, value.toString())
        return this
    }

    actual fun delete(start: Int, end: Int): StringBuffer {
        sb.deleteRange(start, end)
        return this
    }

    actual fun deleteCharAt(index: Int): StringBuffer {
        sb.deleteAt(index)
        return this
    }

    actual fun reverse(): StringBuffer {
        sb.reverse()
        return this
    }

    actual fun setCharAt(index: Int, ch: Char) {
        sb[index] = ch
    }

    actual fun charAt(index: Int): Char = sb[index]

    actual fun setLength(newLength: Int) {
        sb.setLength(newLength)
    }

    actual override fun toString(): String = sb.toString()

    actual constructor(capacity: Int) : this() {
        TODO("Not yet implemented")
    }
}
