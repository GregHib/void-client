object FileExistsConditionStatics {
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
                var mapAreaDefinition = ParticleAmountCacheStatics.aLruByteCache_2844!!.method583(i_0_.toLong(), -104) as MapAreaDefinition?
                if (mapAreaDefinition != null) return mapAreaDefinition
                val `is` = WorldMapIconLabelStatics.aJs5Archive_8601!!.method410(-1860, 0, i_0_)
                if (i != 104) method741(98.toByte())
                mapAreaDefinition = MapAreaDefinition()
                if (`is` != null) mapAreaDefinition.method1419(i_0_, ByteBuffer(`is`), 64.toByte())
                ParticleAmountCacheStatics.aLruByteCache_2844!!.method582(mapAreaDefinition, i_0_.toLong(), (-114).toByte())
                return mapAreaDefinition
            }
    
            fun method743(i: Int, i_2_: Int) {
                anInt4775++
                val class348_sub42_sub15 = NamedTimedNodeStatics.method2516(i_2_, 105.toByte(), i) //9
                class348_sub42_sub15.method3251(i xor 0x3eb0.inv())
            }
    
            init {
                anInt4776 = 0
                aFloatArray4772 = FloatArray(16)
                anIntArray4780 = intArrayOf(104, 120, 136, 168)
                aIntRange_4779 = IntRange(76, 6)
            }
}
