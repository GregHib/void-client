/* Class209 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class UnusedToStringStub {
    override fun toString(): String {
        anInt2716++
        throw IllegalStateException()
    }

    companion object {
        var anInt2716: Int = 0
        var aInboundPacketHeader_2717: InboundPacketHeader? = InboundPacketHeader(118, -2)
        var aClass348_Sub16_Sub3_2718: MidiSequencePlayer? = null

        @JvmStatic
        fun method1529(bool: Boolean) {
            aInboundPacketHeader_2717 = null
            if (bool != true) aInboundPacketHeader_2717 = null
            aClass348_Sub16_Sub3_2718 = null
        }
    }
}
