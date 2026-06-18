/* Class136 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class SpriteLoadValidator internal constructor(js5Archive: Js5Archive?, string: String?) : Interface7 {
    private val aString4788: String?
    private val aJs5Archive_4789: Js5Archive?

    init {
        try {
            aString4788 = string
            aJs5Archive_4789 = js5Archive
        } catch (runtimeexception: RuntimeException) {
            throw SoundBankPatch.method2929(runtimeexception, ("nv.<init>(" + (if (js5Archive != null) "{...}" else "null") + ',' + (if (string != null) "{...}" else "null") + ')'))
        }
    }

    override fun method32(i: Int): Class69? {
        anInt4794++
        if (i != -15004) Companion.method1159((-110).toByte())
        return Class69.aClass69_1198
    }

    override fun method31(i: Int): Int {
        anInt4790++
        if (aJs5Archive_4789!!.method413(100, aString4788!!)) return 100
        val i_0_ = 31 % ((-43 - i) / 62)
        return aJs5Archive_4789.method397(aString4788, 0)
    }

    companion object {
        @JvmField
        var aWorldMapImageBuilder_4787: WorldMapImageBuilder? = null
        var anInt4790: Int = 0
        @JvmField
        var aShortArrayArray4791: Array<ShortArray?>? = null
        var anInt4792: Int = 0
        var anInt4793: Int = 1405
        var anInt4794: Int = 0
        var anInt4795: Int = 0
        @JvmField
        var aJs5Archive_4796: Js5Archive? = null

        @JvmStatic
        fun method1159(i: Byte) {
            aShortArrayArray4791 = null
            aWorldMapImageBuilder_4787 = null
            if (i >= 36) aJs5Archive_4796 = null
        }
    }
}
