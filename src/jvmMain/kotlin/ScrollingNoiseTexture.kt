import ScrollingNoiseTextureStatics.anInt8654
import ScrollingNoiseTextureStatics.anInt8655

/* Class59_Sub1_Sub1 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class ScrollingNoiseTexture : GrayscaleNoiseTexture(8, 5, 8, 8, 2, 0.1f, 0.55f, 3.0f) {
    private lateinit var aByteArray8657: ByteArray
    override fun method550(i: Int, i_3_: Byte, i_4_: Byte) {
        if (i_4_.toInt() == 14) {
            anInt8654++
            var i_5_ = i * 2
            aByteArray8657!![i_5_++] = (-1).toByte()
            val i_6_ = i_3_.toInt() and 0xff
            aByteArray8657!![i_5_] = (i_6_ * 3 shr 5).toByte()
        }
    }

    fun method559(i: Int, i_8_: Int, i_9_: Byte, i_10_: Int): ByteArray? {
        aByteArray8657 = ByteArray(2 * (i_8_ * i) * i_10_)
        anInt8655++
        this.method542(i_8_, i, 0, i_10_)
        return aByteArray8657
    }
}
