/* Class345 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
abstract class ParticleProcessor {
    abstract fun method2694(i: Int, class348_sub42_sub9: KeyedCacheEntryReference): KeyedCacheEntryReference?

    companion object {

        var aFloat4268: Float = 0f

        var aInboundPacketHeader_4269: InboundPacketHeader? = InboundPacketHeader(87, 1)

        var anInt4270: Int = -1

        var anIntArray4271: IntArray? = null

        var aInboundPacketHeader_4272: InboundPacketHeader? = InboundPacketHeader(67, 3)

        var aLruByteCache_4273: LruByteCache? = LruByteCache(128, 4)

        @JvmStatic
        fun method2693(i: Int) {
            if (i != 3) aInboundPacketHeader_4269 = null
            aInboundPacketHeader_4272 = null
            anIntArray4271 = null
            aInboundPacketHeader_4269 = null
            aLruByteCache_4273 = null
        }
    }
}
