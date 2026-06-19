import ProjectedGroundDecorStatics.method2433
import AbstractFrameBufferSurfaceStatics.method3007
import SpriteStatics.method160
import kotlin.math.sqrt
import NormalMapTextureNodeStatics.method3140
import NormalMapTextureNodeStatics.anInt9433
import NormalMapTextureNodeStatics.anInt9434

/* Class348_Sub40_Sub34 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class NormalMapTextureNode : AbstractProceduralTextureNode(1, false) {
    private var anInt9438 = 4096
    private var aBoolean9439 = true

    override fun method3049(class348_sub49: ByteBuffer, i: Int, i_5_: Int) {
        do {
            try {
                if (i_5_ != 31015) method3140(-77, 55)
                anInt9433++
                val i_6_ = i
                if (i_6_ == 0) {
                    anInt9438 = class348_sub49!!.readUnsignedShort(842397944)
                    break
                } else if (i_6_ != 1) break
                aBoolean9439 = class348_sub49!!.readUnsignedByte(255) == 1
                break
            } catch (runtimeexception: RuntimeException) {
                throw SoundBankPatchStatics.method2929(runtimeexception, ("cfa.F(" + (if (class348_sub49 != null) "{...}" else "null") + ',' + i + ',' + i_5_ + ')'))
            }
        } while (false)
    }

    override fun method3047(i: Int, i_7_: Int): Array<IntArray?>? {
        anInt9434++
        val `is` = this.aImageFrameCache_7033!!.method2557(-111, i)!!
        if (i_7_ != -1564599039) method3140(72, -13)
        if (this.aImageFrameCache_7033!!.aBoolean4035) {
            val is_8_ = this.method3048(-1 + i and TextureCubeProviderStatics.anInt6325, 633706337, 0)!!
            val is_9_ = this.method3048(i, i_7_ + -2096661920, 0)!!
            val is_10_ = this.method3048(TextureCubeProviderStatics.anInt6325 and 1 + i, 633706337, 0)!!
            val is_11_ = `is`[0]!!
            val is_12_ = `is`[1]!!
            val is_13_ = `is`[2]!!
            var i_14_ = 0
            while (DisplaceTextureNodeStatics.anInt9139 > i_14_) {
                val i_15_ = (-is_8_[i_14_] + is_10_[i_14_]) * anInt9438
                val i_16_ = (anInt9438 * (is_9_[1 + i_14_ and SimpleBinaryOptionStateStatics.anInt6076] - is_9_[SimpleBinaryOptionStateStatics.anInt6076 and -1 + i_14_]))
                val i_17_ = i_16_ shr 12
                val i_18_ = i_15_ shr 12
                val i_19_ = i_17_ * i_17_ shr 12
                val i_20_ = i_18_ * i_18_ shr 12
                val i_21_ = (sqrt(((i_19_ - (-i_20_ + -4096)).toFloat() / 4096.0f).toDouble()) * 4096.0).toInt()
                var i_22_: Int
                var i_23_: Int
                var i_24_: Int
                if (i_21_ == 0) {
                    i_22_ = 0
                    i_23_ = 0
                    i_24_ = 0
                } else {
                    i_23_ = i_16_ / i_21_
                    i_22_ = i_15_ / i_21_
                    i_24_ = 16777216 / i_21_
                }
                if (aBoolean9439) {
                    i_24_ = (i_24_ shr 1) + 2048
                    i_23_ = (i_23_ shr 1) + 2048
                    i_22_ = (i_22_ shr 1) + 2048
                }
                is_11_[i_14_] = i_23_
                is_12_[i_14_] = i_22_
                is_13_[i_14_] = i_24_
                i_14_++
            }
        }
        return `is`
    }
}
