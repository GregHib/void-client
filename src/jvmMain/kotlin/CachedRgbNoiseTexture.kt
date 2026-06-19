import DisplayModeOptionStateStatics.method1827
import HslColorTableNodeStatics.method2770
import CachedRgbNoiseTextureStatics.anInt8669
import CachedRgbNoiseTextureStatics.anInt8672

/* Class59_Sub2_Sub1 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class CachedRgbNoiseTexture : RgbNoiseTexture(12, 5, 16, 2, 2, 0.45f) {
    private lateinit var aByteArray8674: ByteArray

    override fun method563(i: Byte, i_27_: Int, i_28_: Byte) {
        var i_28_ = i_28_
        if (i > 79) {
            anInt8669++
            i_28_ = (((i_28_.toInt() and 0xff) shr 1) + 127).toByte()
            var i_29_ = 2 * i_27_
            aByteArray8674[i_29_++] = i_28_
            aByteArray8674[i_29_] = i_28_
        }
    }

    fun method567(i: Int, i_30_: Byte, i_31_: Int, i_32_: Int): ByteArray {
        anInt8672++
        aByteArray8674 = ByteArray(2 * i_32_ * i * i_31_)
        this.method542(i, i_32_, 0, i_31_)
        val i_33_ = -61 % ((70 - i_30_) / 37)
        return aByteArray8674
    }
}
