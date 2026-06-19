import kotlin.math.pow
import StaticNoiseTextureStatics.anInt8659
import StaticNoiseTextureStatics.anInt8661
import StaticNoiseTextureStatics.aBoundsConstraintEntry_8664

/* Class59_Sub1_Sub2 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class StaticNoiseTexture : GrayscaleNoiseTexture(8, 5, 8, 8, 2, 0.1f, 0.55f, 3.0f) {
    private lateinit var aByteArray8660: ByteArray
    override fun method550(i: Int, i_0_: Byte, i_1_: Byte) {
        anInt8659++
        var i_2_ = i * 2
        val i_3_ = i_0_.toInt() and 0xff
        aByteArray8660[i_2_++] = (i_3_ * 3 shr 5).toByte()
        if (i_1_.toInt() == 14) aByteArray8660[i_2_] = (i_3_ * 3 shr 5).toByte()
    }

    fun method562(i: Int, i_4_: Int, i_5_: Byte, i_6_: Int): ByteArray {
        aByteArray8660 = ByteArray(2 * i_6_ * (i_4_ * i))
        if (i_5_ <= 85) aBoundsConstraintEntry_8664 = null
        anInt8661++
        this.method542(i_4_, i, 0, i_6_)
        return aByteArray8660
    }
}
