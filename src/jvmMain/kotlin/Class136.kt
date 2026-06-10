/* Class136 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class136 internal constructor(class45: Class45?, string: String?) : Interface7 {
    private val aString4788: String?
    private val aClass45_4789: Class45?

    init {
        try {
            aString4788 = string
            aClass45_4789 = class45
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("nv.<init>(" + (if (class45 != null) "{...}" else "null") + ',' + (if (string != null) "{...}" else "null") + ')'))
        }
    }

    override fun method32(i: Int): Class69? {
        anInt4794++
        if (i != -15004) Companion.method1159((-110).toByte())
        return Class69.aClass69_1198
    }

    override fun method31(i: Int): Int {
        anInt4790++
        if (aClass45_4789!!.method413(100, aString4788!!)) return 100
        val i_0_ = 31 % ((-43 - i) / 62)
        return aClass45_4789.method397(aString4788, 0)
    }

    companion object {
        @JvmField
        var aClass65_4787: Class65? = null
        var anInt4790: Int = 0
        @JvmField
        var aShortArrayArray4791: Array<ShortArray?>? = null
        var anInt4792: Int = 0
        var anInt4793: Int = 1405
        var anInt4794: Int = 0
        var anInt4795: Int = 0
        @JvmField
        var aClass45_4796: Class45? = null

        @JvmStatic
        fun method1159(i: Byte) {
            aShortArrayArray4791 = null
            aClass65_4787 = null
            if (i >= 36) aClass45_4796 = null
        }
    }
}
