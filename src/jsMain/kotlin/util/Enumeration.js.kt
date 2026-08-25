package util

actual interface Enumeration<E> {
    actual fun hasMoreElements(): Boolean
    actual fun nextElement(): E
}

internal class IteratorEnumeration<E>(private val delegate: Iterator<E>) : Enumeration<E> {
    override fun hasMoreElements(): Boolean = delegate.hasNext()
    override fun nextElement(): E = delegate.next()
}
