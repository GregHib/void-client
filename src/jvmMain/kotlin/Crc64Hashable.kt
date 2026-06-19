import KeyedCacheEntryReferenceStatics.method3203
import Crc64HashableStatics.anInt4988
import Crc64HashableStatics.anInt4994

/* Class126 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Crc64Hashable : KeyedComparable {
    @JvmField
    var anInt4981: Int = 0
    @JvmField
    var anInt4982: Int = 0
    @JvmField
    var anInt4989: Int = 0
    @JvmField
    var aBoolean4990: Boolean = false
    @JvmField
    var anInt4991: Int = 0
    @JvmField
    var anInt4992: Int = 0
    @JvmField
    var anInt4993: Int = 0
    override fun method52(i: Byte): Long {
        anInt4988++
        val ls = WeaveTextureNodeStatics.aLongArray9283
        var l = -1L
        l = (ls!![((l xor this.anInt4991.toLong()) and 0xffL).toInt()] xor (l ushr 8))
        l = (l ushr 8 xor ls[(0xffL and ((this.anInt4992 shr 8).toLong() xor l)).toInt()])
        l = (l ushr 8 xor ls[((l xor this.anInt4992.toLong()) and 0xffL).toInt()])
        l = (l ushr 8 xor ls[(0xffL and (l xor (this.anInt4989 shr 24).toLong())).toInt()])
        l = ls[(0xffL and ((this.anInt4989 shr 16).toLong() xor l)).toInt()] xor (l ushr 8)
        l = (l ushr 8 xor ls[(0xffL and (l xor (this.anInt4989 shr 8).toLong())).toInt()])
        l = (l ushr 8 xor ls[((l xor this.anInt4989.toLong()) and 0xffL).toInt()])
        l = (l ushr 8 xor ls[(0xffL and (this.anInt4993.toLong() xor l)).toInt()])
        l = ls[((l xor (this.anInt4982 shr 24).toLong()) and 0xffL).toInt()] xor (l ushr 8)
        l = (l ushr 8 xor ls[((l xor (this.anInt4982 shr 16).toLong()) and 0xffL).toInt()])
        if (i < 46) return -94L
        l = ls[((l xor (this.anInt4982 shr 8).toLong()) and 0xffL).toInt()] xor (l ushr 8)
        l = (l ushr 8 xor ls[(0xffL and (this.anInt4982.toLong() xor l)).toInt()])
        l = (ls[(0xffL and (l xor this.anInt4981.toLong())).toInt()] xor (l ushr 8))
        l = (l ushr 8 xor ls[(0xffL and ((if (this.aBoolean4990) 1 else 0).toLong() xor l)).toInt()])
        return l
    }

    override fun method53(i: Int, keyedComparable: KeyedComparable?): Boolean {
        anInt4994++
        if (keyedComparable !is Crc64Hashable) return false
        val class126_3_ = keyedComparable
        if (this.anInt4991 != class126_3_.anInt4991) return false
        if (i <= 50) return true
        if (this.anInt4992 != class126_3_.anInt4992) return false
        if (this.anInt4989 != class126_3_.anInt4989) return false
        if (this.anInt4993 != class126_3_.anInt4993) return false
        if (class126_3_.anInt4982 != this.anInt4982) return false
        if (this.anInt4981 != class126_3_.anInt4981) return false
        return !class126_3_.aBoolean4990 == !this.aBoolean4990
    }
}
