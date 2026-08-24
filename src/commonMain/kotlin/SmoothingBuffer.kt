import kotlin.jvm.JvmField
import kotlin.jvm.JvmStatic
/* Class252 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class SmoothingBuffer internal constructor(@JvmField var anInt3241: Int) {

    var anIntArray3238: IntArray? = IntArray(this.anInt3241)


    var anIntArray3239: IntArray? = IntArray(this.anInt3241)

    companion object {

        var aFontMetaRef_3237: FontMetaRef? = FontMetaRef(80, 7)
        var aFloat3242: Float = 0f

        @JvmStatic
        fun method1917(i: Int) {
            aFontMetaRef_3237 = null
            InboundPacketHeader.aInboundPacketHeader_3240 = null
        }

    }
}
