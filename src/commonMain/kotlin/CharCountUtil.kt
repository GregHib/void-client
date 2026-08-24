import kotlin.jvm.JvmStatic
/* Class15 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
object CharCountUtil {

    var aLruByteCache_225: LruByteCache? = LruByteCache(4)

    var anInt226: Int = 0

    var anInt227: Int = 0

    var anInt228: Int = 0

    @JvmStatic
    fun method255(i: Int) {
        aLruByteCache_225 = null
        if (i != 6725) aLruByteCache_225 = null
        InboundPacketHeader.aInboundPacketHeader_229 = null
    }

    @JvmStatic
    fun method256(i: Int, i_0_: Byte): Int {
        anInt228++
        return i ushr 7
    }

    fun method257(i: Int, string: String, c: Char): Int {
        anInt227++
        var i_1_ = 0
        val i_2_ = string.length
        var i_3_ = 0
        while (i_2_ > i_3_) {
            if (c == string.get(i_3_)) i_1_++
            i_3_++
        }
        return i_1_
    }
}
