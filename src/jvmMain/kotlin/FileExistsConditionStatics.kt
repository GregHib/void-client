object FileExistsConditionStatics {

    var anInt4773: Int = 0

    var anInt4775: Int = 0

    var anInt4776: Int

    var anInt4777: Int = 0
    var anIntArray4780: IntArray?

    var aModelDefinitionCache_4782: ModelDefinitionCache? = null

    var aLong4783: Long = 20000000L
    var anInt4786: Int = 0

    @JvmStatic
    fun method741(i: Byte) {
        FileExistsCondition.aFloatArray4772 = null
        anIntArray4780 = null
        if (i.toInt() != -128) method743(113, -98)
        InboundPacketHeader.aInboundPacketHeader_4779 = null
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
        anIntArray4780 = intArrayOf(104, 120, 136, 168)
    }
}
