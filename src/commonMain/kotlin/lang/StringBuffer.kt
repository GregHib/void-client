package lang

expect class StringBuffer() {
    constructor(initial: String)
    constructor(capacity: Int)

    val length: Int

    fun get(index: Int): Char
    fun append(value: Any?, i: Int, i2: Int): StringBuffer
    fun append(value: Any?): StringBuffer
    fun insert(offset: Int, value: Any?): StringBuffer
    fun delete(start: Int, end: Int): StringBuffer
    fun deleteCharAt(index: Int): StringBuffer
    fun reverse(): StringBuffer
    fun setCharAt(index: Int, ch: Char)
    fun charAt(index: Int): Char
    fun setLength(newLength: Int)

    override fun toString(): String
}
