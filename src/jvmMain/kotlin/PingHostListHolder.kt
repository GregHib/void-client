/* Class176 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
object PingHostListHolder {
    var aInboundPacketHeader_2331: InboundPacketHeader? = InboundPacketHeader(120, -2)

    var aClass348_Sub26_2332: NamedIdEntry?

    var aSystemFontGlyphs_2333: SystemFontGlyphs? = null

    var aClass348_Sub47Array2334: Array<OutgoingPacketNode?>? = arrayOfNulls<OutgoingPacketNode>(300)
    var aInboundPacketHeader_2335: InboundPacketHeader?

    @JvmStatic
    fun method1351(i: Int) {
        aInboundPacketHeader_2331 = null
        aClass348_Sub26_2332 = null
        aInboundPacketHeader_2335 = null
        if (i != 1) aInboundPacketHeader_2331 = null
        aClass348_Sub47Array2334 = null
        aSystemFontGlyphs_2333 = null
    }

    init {
        aClass348_Sub26_2332 = null
        aInboundPacketHeader_2335 = InboundPacketHeader(80, 0)
    }
}
