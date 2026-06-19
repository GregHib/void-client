import CompositeRgbNoiseTextureStatics.anInt8678
import CompositeRgbNoiseTextureStatics.anInt8682
import CompositeRgbNoiseTextureStatics.method574

/* Class59_Sub2_Sub2 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class CompositeRgbNoiseTexture : RgbNoiseTexture(12, 5, 16, 2, 2, 0.45f) {
    private lateinit var aByteArray8681: ByteArray
    fun method571(i: Int, i_4_: Byte, i_5_: Int, i_6_: Int): ByteArray {
        aByteArray8681 = ByteArray(i_5_ * (i_6_ * (i * 2)))
        val i_7_ = -82 % ((i_4_ - 70) / 37)
        anInt8678++
        this.method542(i, i_6_, 0, i_5_)
        return aByteArray8681
    }

    override fun method563(i: Byte, i_8_: Int, i_9_: Byte) {
        var i_9_ = i_9_
        anInt8682++
        i_9_ = (127 + ((0xff and i_9_.toInt()) shr 1)).toByte()
        var i_10_ = 2 * i_8_
        aByteArray8681[i_10_++] = i_9_
        aByteArray8681[i_10_] = i_9_
        if (i <= 79) method574(-29, -37, 73, null, true, (-64).toByte(), 2, -112, 50, null, -65, null, -92, 30, -5)
    }
}
