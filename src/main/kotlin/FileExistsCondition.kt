/* Class73 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class FileExistsCondition internal constructor(js5Archive: Js5Archive?, string: String?) : ArchiveFileCondition {
    private val aString4778: String?
    private val aJs5Archive_4785: Js5Archive?
    override fun method31(i: Int): Int {
        val i_1_ = -62 / ((i - -43) / 62)
        anInt4774++
        if (aJs5Archive_4785!!.method416((-74).toByte(), aString4778)) return 100
        return 0
    }

    override fun method32(i: Int): CollisionFlagQuery? {
        anInt4781++
        if (i != -15004) aFloatArray4772 = null
        return CollisionFlagQuery.Companion.aCollisionFlagQuery_1197
    }

    init {
        try {
            aJs5Archive_4785 = js5Archive
            aString4778 = string
        } catch (runtimeexception: RuntimeException) {
            throw SoundBankPatch.method2929(runtimeexception, ("kk.<init>(" + (if (js5Archive != null) "{...}" else "null") + ',' + (if (string != null) "{...}" else "null") + ')'))
        }
    }

    companion object {
        var aFloatArray4772: FloatArray?
        @JvmField
        var anInt4773: Int = 0
        @JvmField
        var anInt4774: Int = 0
        @JvmField
        var anInt4775: Int = 0
        @JvmField
        var anInt4776: Int
        @JvmField
        var anInt4777: Int = 0
        var aIntRange_4779: IntRange?
        var anIntArray4780: IntArray?
        @JvmField
        var anInt4781: Int = 0
        @JvmField
        var aModelDefinitionCache_4782: ModelDefinitionCache? = null
        @JvmField
        var aLong4783: Long = 20000000L
        var anInt4784: Int = 0
        var anInt4786: Int = 0

        @JvmStatic
        fun method741(i: Byte) {
            aFloatArray4772 = null
            anIntArray4780 = null
            if (i.toInt() != -128) method743(113, -98)
            aIntRange_4779 = null
            aModelDefinitionCache_4782 = null
        }

        fun method742(i: Int, i_0_: Int): MapAreaDefinition {
            anInt4777++
            var mapAreaDefinition = ParticleAmountCache.aLruByteCache_2844!!.method583(i_0_.toLong(), -104) as MapAreaDefinition?
            if (mapAreaDefinition != null) return mapAreaDefinition
            val `is` = WorldMapIconLabel.aJs5Archive_8601!!.method410(-1860, 0, i_0_)
            if (i != 104) method741(98.toByte())
            mapAreaDefinition = MapAreaDefinition()
            if (`is` != null) mapAreaDefinition.method1419(i_0_, ByteBuffer(`is`), 64.toByte())
            ParticleAmountCache.aLruByteCache_2844!!.method582(mapAreaDefinition, i_0_.toLong(), (-114).toByte())
            return mapAreaDefinition
        }

        fun method743(i: Int, i_2_: Int) {
            anInt4775++
            val class348_sub42_sub15 = NamedTimedNode.method2516(i_2_, 105.toByte(), i) //9
            class348_sub42_sub15.method3251(i xor 0x3eb0.inv())
        }

        init {
            anInt4776 = 0
            aFloatArray4772 = FloatArray(16)
            anIntArray4780 = intArrayOf(104, 120, 136, 168)
            aIntRange_4779 = IntRange(76, 6)
        }
    }
}
