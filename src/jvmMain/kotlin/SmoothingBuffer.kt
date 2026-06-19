/* Class252 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class SmoothingBuffer internal constructor(@JvmField var anInt3241: Int) {

    var anIntArray3238: IntArray? = IntArray(this.anInt3241)


    var anIntArray3239: IntArray? = IntArray(this.anInt3241)

    companion object {

        var aFontMetaRef_3237: FontMetaRef? = FontMetaRef(80, 7)
        var aInboundPacketHeader_3240: InboundPacketHeader? = InboundPacketHeader(43, 4)
        var aFloat3242: Float = 0f

        @JvmStatic
        fun method1917(i: Int) {
            if (i != 40960) aInboundPacketHeader_3240 = null
            aFontMetaRef_3237 = null
            aInboundPacketHeader_3240 = null
        }

    }
}
