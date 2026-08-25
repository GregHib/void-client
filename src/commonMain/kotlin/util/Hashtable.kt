package util

expect open class Hashtable<K, V> : MutableMap<K, V> {
    constructor()
    constructor(initialCapacity: Int)

    fun keys(): Enumeration<K>
    fun elements(): Enumeration<V>
    override val keys: MutableSet<K>
    override val values: MutableCollection<V>
    override val entries: MutableSet<MutableMap.MutableEntry<K, V>>
    override fun put(key: K, value: V): V?
    override fun remove(key: K): V?
    override fun putAll(from: Map<out K, V>)
    override fun clear()
    override val size: Int
    override fun isEmpty(): Boolean
    override fun containsKey(key: K): Boolean
    override fun containsValue(value: V): Boolean
    override fun get(key: K): V?
}
