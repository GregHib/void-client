class HardCacheEntryReference internal constructor(private val anObject10429: Any?, i: Int) : CacheEntryReference(i) {
    override fun method3195(i: Int): Boolean {
        anInt10438++
        return false
    }

    override fun method3193(i: Int): Any? {
        anInt10435++
        return anObject10429
    }

    companion object {
        var anInt10435: Int = 0
        var anInt10438: Int = 0
    }
}