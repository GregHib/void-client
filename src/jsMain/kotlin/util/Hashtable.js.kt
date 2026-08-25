package util

actual open class Hashtable<K, V> private constructor(
    private val backing: LinkedHashMap<K, V>,
) : MutableMap<K, V> by backing {

    actual constructor() : this(LinkedHashMap<K, V>())
    actual constructor(initialCapacity: Int) : this(
        if (initialCapacity < 0) {
            throw IllegalArgumentException("Illegal Capacity: $initialCapacity")
        } else {
            LinkedHashMap<K, V>(initialCapacity)
        },
    )

    actual fun keys(): Enumeration<K> = IteratorEnumeration(backing.keys.iterator())

    actual fun elements(): Enumeration<V> = IteratorEnumeration(backing.values.iterator())
}