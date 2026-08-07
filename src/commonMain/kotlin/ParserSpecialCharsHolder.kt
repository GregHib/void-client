/* Class131 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
object ParserSpecialCharsHolder {
    var anInt1902: Int
    var aCharArray1903: CharArray? = charArrayOf('[', ']', '#')

    var aOutgoingPacketHeader_1904: OutgoingPacketHeader?

    @JvmStatic
    fun method1136(i: Byte) {
        aCharArray1903 = null
        if (i.toInt() == -98) {
            InboundPacketHeader.aInboundPacketHeader_1901 = null
            aOutgoingPacketHeader_1904 = null
        }
    }

    init {
        anInt1902 = 0
        aOutgoingPacketHeader_1904 = OutgoingPacketHeader(61, 11)
    }
}