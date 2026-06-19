/* Class63 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class SceneTileBounds {
    @JvmField
    var anInt1118: Int = 0
    @JvmField
    var anInt1119: Int = 0
    @JvmField
    var anInt1122: Int = 0

    companion object {
        @JvmField
        var anInt1117: Int = 0
        var aInboundPacketHeader_1120: InboundPacketHeader? = InboundPacketHeader(53, -2)
        @JvmField
        var anInt1121: Int = 0
        var aInboundPacketHeader_1123: InboundPacketHeader? = InboundPacketHeader(78, -1)

        @JvmStatic
        fun method601(i: Byte) {
            aInboundPacketHeader_1120 = null
            aInboundPacketHeader_1123 = null
            if (i.toInt() != -85) Companion.method601((-70).toByte())
        }
    }
}
