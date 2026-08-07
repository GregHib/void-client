/* Class172 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
object NpcCountAccessor {
    var anInt2277: Int = 0
    var anInt2278: Int = 0
    var anIntArray2280: IntArray? = IntArray(200)
    var anInt2281: Int = 0

    @JvmStatic
    fun method1325(i: Int) {
        anIntArray2280 = null
        if (i <= -123) InboundPacketHeader.aInboundPacketHeader_2279 = null
    }

    fun method1326(class348_sub16_sub3: MidiSequencePlayer?, i: Int): MidiSequencePlayer {
        anInt2278++
        val class348_sub16_sub3_0_ = (if (class348_sub16_sub3 == null) MidiSequencePlayer() else MidiSequencePlayer(class348_sub16_sub3))
        class348_sub16_sub3_0_.method2841(i, -94, 128)
        return class348_sub16_sub3_0_
    }

    fun method1327(i: Int): Int {
        if (i <= 17) anIntArray2280 = null
        anInt2277++
        return AbstractFrameBufferSurface.anInt6924
    }

    fun method1328(i: Int) {
        if (i != -26162) anIntArray2280 = null
        OutgoingPacketHeader.aLruByteCache_4327!!.method587(-118)
        anInt2281++
        ParticleGeometryStatics.aLruByteCache_4417!!.method587(-89)
        SceneryDetailOptionState.aLruByteCache_6096!!.method587(-87)
        EdgeDetectTextureNode.aLruByteCache_9171!!.method587(-95)
    }
}
