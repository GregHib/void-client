import java.io.IOException

object LightDetailOptionStateStatics {
    @JvmField
            var anInt6029: Int = 0
            @JvmField
            var aConfigFlagUtil_6030: ConfigFlagUtil? = ConfigFlagUtil()
            @JvmField
            var anInt6031: Int = 0
            @JvmField
            var anInt6032: Int = 0
            @JvmField
            var anInt6033: Int = 0
            @JvmField
            var anInt6034: Int = 0
            @JvmField
            var anIntArray6035: IntArray? = null
            @JvmField
            var anInt6036: Int = 0
            @JvmField
            var anInt6037: Int = 0
            @JvmField
            var anInt6038: Int = 0
    
            @JvmStatic
            fun method1799(i: Int) {
                val i_0_ = 51 / ((i - 33) / 40)
                anIntArray6035 = null
                aConfigFlagUtil_6030 = null
            }
    
            @JvmStatic
            @Throws(IOException::class)
            fun method1802(i: Int) {
                if (PerlinNoiseTextureNodeStatics.aAbstractGameSocket_9165 != null && IntPairStatics.anInt6969 > 0) {
                    var i_2_ = 0
                    while (true) {
                        val class348_sub47 = GrayscaleEffectStatics.aNodeDeque_9201!!.method1995(i xor 0x4) as OutgoingPacketNode?
                        if (class348_sub47 == null) break
                        PerlinNoiseTextureNodeStatics.aAbstractGameSocket_9165!!.method1706(0, i xor 0x77, class348_sub47.anInt7119, (class348_sub47.aClass348_Sub49_Sub2_7116!!.aByteArray7154!!))
                        i_2_ += class348_sub47.anInt7119
                        IntPairStatics.anInt6969 -= class348_sub47.anInt7119
                        class348_sub47.method2715(74.toByte())
                        class348_sub47.aClass348_Sub49_Sub2_7116!!.method3360((-69).toByte())
                        class348_sub47.method3326((-45).toByte())
                    }
                    SceneRegionState.anInt193 = 0
                    FogState.anInt1433 += i_2_
                }
                if (i != 0) method1799(58)
                anInt6038++
            }
}
