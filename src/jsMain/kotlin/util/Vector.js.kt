package util

actual class Vector<E> private constructor(
    private val backing: ArrayList<E>,
) : MutableList<E> by backing {

    actual constructor() : this(ArrayList<E>())
    actual constructor(initialCapacity: Int) : this(
        if (initialCapacity < 0) {
            throw IllegalArgumentException("Illegal Capacity: $initialCapacity")
        } else {
            ArrayList<E>(initialCapacity)
        },
    )

    actual fun addElement(obj: E) {
        backing.add(obj)
    }

    actual fun insertElementAt(obj: E, index: Int) {
        backing.add(index, obj)
    }

    actual fun setElementAt(obj: E, index: Int) {
        backing[index] = obj
    }

    actual fun elementAt(index: Int): E = backing[index]

    actual fun firstElement(): E =
        if (backing.isEmpty()) throw NoSuchElementException() else backing[0]

    actual fun lastElement(): E =
        if (backing.isEmpty()) throw NoSuchElementException() else backing[backing.size - 1]

    actual fun removeElementAt(index: Int) {
        backing.removeAt(index)
    }

    actual fun removeAllElements() {
        backing.clear()
    }

    actual fun elements(): Enumeration<E> = IteratorEnumeration(backing.iterator())

    actual fun capacity(): Int = backing.size

    actual fun ensureCapacity(minCapacity: Int) {
        // No-op: JS arrays are grown by the runtime.
    }

    actual fun trimToSize() {
        // No-op: see ensureCapacity.
    }

    override fun equals(other: Any?): Boolean = other is List<*> && backing == other
    override fun hashCode(): Int = backing.hashCode()
    override fun toString(): String = backing.toString()
}