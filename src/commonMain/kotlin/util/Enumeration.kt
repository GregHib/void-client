package util

expect interface Enumeration<E> {
    fun hasMoreElements(): Boolean
    fun nextElement(): E
}

operator fun <E> Enumeration<E>.iterator(): Iterator<E> = object : Iterator<E> {
    override fun hasNext(): Boolean = hasMoreElements()
    override fun next(): E = nextElement()
}

fun <E> Enumeration<E>.asSequence(): Sequence<E> = Sequence { iterator() }