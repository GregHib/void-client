object InputTrackerStatics {
    @JvmField
            var anInt4533: Int = 0
            @JvmField
            var anInt4534: Int = 0
            @JvmField
            var anInt4535: Int = 0
    
            @JvmStatic
            fun method3591(i: Int, i_0_: Int): SpotAnimDefinition {
                anInt4535++
                var spotAnimDefinition = WorldMapElementStatics.aLruByteCache_4636!!.method583(i.toLong(), i_0_ + -128) as SpotAnimDefinition?
                if (spotAnimDefinition != null) return spotAnimDefinition
                val `is` = BloomGraphicsOptionStateStatics.aJs5Archive_5964!!.method410(-1860, i_0_, i)
                spotAnimDefinition = SpotAnimDefinition()
                if (`is` != null) spotAnimDefinition.method1370(24, ByteBuffer(`is`))
                spotAnimDefinition.method1371(4)
                WorldMapElementStatics.aLruByteCache_4636!!.method582(spotAnimDefinition, i.toLong(), (-103).toByte())
                return spotAnimDefinition
            }
}
