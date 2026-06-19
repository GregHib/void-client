/* Class131 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
object ParserSpecialCharsHolder {
    var aInboundPacketHeader_1901: InboundPacketHeader? = InboundPacketHeader(38, -1)
    var anInt1902: Int
    var aCharArray1903: CharArray? = charArrayOf('[', ']', '#')
    @JvmField
    var aFontMetaRef_1904: FontMetaRef?

    @JvmStatic
    fun method1136(i: Byte) {
        aCharArray1903 = null
        if (i.toInt() == -98) {
            aInboundPacketHeader_1901 = null
            aFontMetaRef_1904 = null
        }
    }

    init {
        anInt1902 = 0
        aFontMetaRef_1904 = FontMetaRef(61, 11)
    }
}
