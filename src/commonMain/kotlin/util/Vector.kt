package util

expect class Vector<E> : MutableList<E> {
    constructor()
    constructor(initialCapacity: Int)

    fun addElement(obj: E)
    fun insertElementAt(obj: E, index: Int)
    fun setElementAt(obj: E, index: Int)
    fun elementAt(index: Int): E
    fun firstElement(): E
    fun lastElement(): E
    fun removeElementAt(index: Int)
    fun removeAllElements()
    fun elements(): Enumeration<E>

    fun capacity(): Int
    fun ensureCapacity(minCapacity: Int)
    fun trimToSize()
    override fun add(element: E): Boolean
    override fun remove(element: E): Boolean
    override fun addAll(elements: Collection<E>): Boolean
    override fun addAll(index: Int, elements: Collection<E>): Boolean
    override fun removeAll(elements: Collection<E>): Boolean
    override fun retainAll(elements: Collection<E>): Boolean
    override fun clear()
    override fun set(index: Int, element: E): E
    override fun add(index: Int, element: E)
    override fun removeAt(index: Int): E
    override fun listIterator(): MutableListIterator<E>
    override fun listIterator(index: Int): MutableListIterator<E>
    override fun subList(fromIndex: Int, toIndex: Int): MutableList<E>
    override val size: Int
    override fun isEmpty(): Boolean
    override fun contains(element: E): Boolean
    override fun containsAll(elements: Collection<E>): Boolean
    override fun get(index: Int): E
    override fun indexOf(element: E): Int
    override fun lastIndexOf(element: E): Int
    override fun iterator(): MutableIterator<E>
}
