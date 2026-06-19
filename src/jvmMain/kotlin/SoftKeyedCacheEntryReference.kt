class SoftKeyedCacheEntryReference internal constructor(keyedComparable: KeyedComparable?, `object`: Any?, i: Int) : KeyedCacheEntryReference(keyedComparable, i) {
    private var aSoftReference10446: SoftRef<*>?

    override fun method3205(i: Int): Any? {
        if (i != 65536) aSoftReference10446 = null
        return aSoftReference10446!!.get()
    }

    override fun method3206(i: Byte): Boolean {
        return true
    }

    init {
        aSoftReference10446 = SoftRef<Any?>(`object`)
    }
}
