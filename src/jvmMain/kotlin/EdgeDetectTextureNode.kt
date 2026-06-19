import kotlin.math.sqrt
import EdgeDetectTextureNodeStatics.anInt9166
import EdgeDetectTextureNodeStatics.anInt9170

/* Class348_Sub40_Sub9 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class EdgeDetectTextureNode : AbstractProceduralTextureNode(1, true) {
    private var anInt9167 = 4096
    override fun method3049(class348_sub49: ByteBuffer, i: Int, i_2_: Int) {
        if (i_2_ != 31015) method3042(-111, 25)
        anInt9170++
        if (i == 0) anInt9167 = class348_sub49.readUnsignedShort(842397944)
    }

    override fun method3042(i: Int, i_5_: Int): IntArray {
        anInt9166++
        val `is` = this.aSpriteSheetCache_7032!!.method1433(0, i)!!
        if (this.aSpriteSheetCache_7032!!.aBoolean2570) {
            val is_6_ = this.method3048(TextureCubeProviderStatics.anInt6325 and -1 + i, 633706337, 0)!!
            val is_7_ = this.method3048(i, 633706337, 0)!!
            val is_8_ = this.method3048(i - -1 and TextureCubeProviderStatics.anInt6325, 633706337, 0)!!
            var i_9_ = 0
            while (DisplaceTextureNodeStatics.anInt9139 > i_9_) {
                val i_10_ = anInt9167 * (-is_6_[i_9_] + is_8_[i_9_])
                val i_11_ = (anInt9167 * (-is_7_[SimpleBinaryOptionStateStatics.anInt6076 and -1 + i_9_] + is_7_[SimpleBinaryOptionStateStatics.anInt6076 and i_9_ - -1]))
                val i_12_ = i_11_ shr 12
                val i_13_ = i_10_ shr 12
                val i_14_ = i_12_ * i_12_ shr 12
                val i_15_ = i_13_ * i_13_ shr 12
                val i_16_ = (4096.0 * sqrt(((i_15_ + (i_14_ - -4096)).toFloat() / 4096.0f).toDouble())).toInt()
                val i_17_ = if (i_16_ != 0) 16777216 / i_16_ else 0
                `is`[i_9_] = 4096 - i_17_
                i_9_++
            }
        }
        return `is`
    }
}
