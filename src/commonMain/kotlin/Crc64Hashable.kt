import kotlin.jvm.JvmStatic
import KeyedCacheEntryReference.Companion.method3203

/* Class126 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Crc64Hashable : KeyedComparable {

    var anInt4981: Int = 0

    var anInt4982: Int = 0

    var anInt4989: Int = 0

    var aBoolean4990: Boolean = false

    var anInt4991: Int = 0

    var anInt4992: Int = 0

    var anInt4993: Int = 0
    override fun method52(i: Byte): Long {
        anInt4988++
        val ls = WeaveTextureNode.aLongArray9283
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

    companion object {

        var aJs5Archive_4984: Js5Archive? = null

        var anInt4985: Int = 0

        var anInt4986: Int = 0
        var aSlotBindingArray4987: Array<SlotBinding?>? = null

        var anInt4988: Int = 0

        var anInt4994: Int = 0

        var anInt4995: Int = 0

        @JvmStatic
        fun method1112(i: Int) {
            if (i != 1) aSlotBindingArray4987 = null
            aJs5Archive_4984 = null
            SoundEnvelope.anIntArray4983 = null
            aSlotBindingArray4987 = null
        }

        fun method1113(i: Int, i_0_: Int, i_1_: Int): Boolean {
            anInt4995++
            if (i_1_ >= -3) aJs5Archive_4984 = null
            return (GlowPostProcessor.method1412((-35).toByte(), i_0_, i) and (LocalizedTextStatics.method2058(i, i_0_, 72) or ((i and 0x2000) != 0) or method3203(i_0_, 114.toByte(), i)))
        }

        fun method1114(i: Int, i_2_: Int) {
            var i = i
            anInt4986++
            if (i < 0 || i > 2) i = 0
            TextureQualityOptionState.anInt6637 = i
            DisplaySettingsConfig.aClass318_Sub10Array7249 = arrayOfNulls<SceneGraphContainer>(1 + (KeyedCacheEntryReference.anIntArray9558!![TextureQualityOptionState.anInt6637]))
            GlTexture2D.anInt8550 = 0
            if (i_2_ >= -118) method1114(-43, -71)
            RingBufferInputStream.anInt4559 = 0
        }
    }
}
