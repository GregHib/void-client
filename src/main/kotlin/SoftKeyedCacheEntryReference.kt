import java.lang.ref.SoftReference

class SoftKeyedCacheEntryReference internal constructor(interface14: Interface14?, `object`: Any?, i: Int) : KeyedCacheEntryReference(interface14, i) {
    private var aSoftReference10446: SoftReference<*>?

    override fun method3205(i: Int): Any? {
        if (i != 65536) aSoftReference10446 = null
        return aSoftReference10446!!.get()
    }

    override fun method3206(i: Byte): Boolean {
        val i_0_ = -88 % ((-63 - i) / 61)
        return true
    }

    init {
        aSoftReference10446 = SoftReference<Any?>(`object`)
    }
}
