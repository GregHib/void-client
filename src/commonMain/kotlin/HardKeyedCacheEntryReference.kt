/* Class348_Sub42_Sub9_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
class HardKeyedCacheEntryReference internal constructor(keyedComparable: KeyedComparable?, `object`: Any?, i: Int) : KeyedCacheEntryReference(keyedComparable, i) {
    private val anObject10440: Any?
    override fun method3205(i: Int): Any? {
        if (i != 65536) method3205(-30)
        anInt10441++
        return anObject10440
    }

    override fun method3206(i: Byte): Boolean {
        val i_0_ = -50 / ((-63 - i) / 61)
        anInt10445++
        return false
    }

    init {
        try {
            anObject10440 = `object`
        } catch (runtimeexception: RuntimeException) {
            throw TextureLoadException.method2929(runtimeexception, ("ct.<init>(" + (if (keyedComparable != null) "{...}" else "null") + ',' + (if (`object` != null) "{...}" else "null") + ',' + i + ')'))
        }
    }

    companion object {

        var anInt10441: Int = 0

        var aHashtable_10442: Hashtable?

        var anInt10443: Int = 2

        var anInt10445: Int = 0

        @JvmStatic
        fun method3207(i: Byte) {
            val i_1_ = -126 % ((i - -27) / 61)
            aHashtable_10442 = null
        }

        init {
            aHashtable_10442 = Hashtable(8)
        }
    }
}