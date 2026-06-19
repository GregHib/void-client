import SphereMapMaterialPassStatics.method2177
import GroundDecorEntityStatics.method2413
import ConstantColourTextureNodeStatics.anInt9246
import ConstantColourTextureNodeStatics.anInt9248
import ConstantColourTextureNodeStatics.anInt9251

/* Class348_Sub40_Sub18 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class ConstantColourTextureNode private constructor(i: Int) : AbstractProceduralTextureNode(0, false) {
    private var anInt9244 = 0
    private var anInt9250 = 0
    private var anInt9252 = 0

    init {
        method3095(-104, i)
    }

    override fun method3047(i: Int, i_14_: Int): Array<IntArray?>? {
        anInt9246++
        val `is` = this.aImageFrameCache_7033!!.method2557(i_14_ xor 0x5d41e2b0, i)!!
        if (this.aImageFrameCache_7033!!.aBoolean4035) {
            val is_15_ = `is`[0]!!
            val is_16_ = `is`[1]!!
            val is_17_ = `is`[2]!!
            for (i_18_ in 0..<DisplaceTextureNodeStatics.anInt9139) {
                is_15_[i_18_] = anInt9244
                is_16_[i_18_] = anInt9252
                is_17_[i_18_] = anInt9250
            }
        }
        if (i_14_ != -1564599039) method3095(102, 6)
        return `is`
    }

    private fun method3095(i: Int, i_19_: Int) {
        anInt9244 = 0xff0 and (i_19_ shr 12)
        anInt9252 = i_19_ shr 4 and 0xff0
        anInt9248++
        anInt9250 = (i_19_ and 0xff) shl 4
        if (i >= -54) anInt9250 = -42
    }

    override fun method3049(class348_sub49: ByteBuffer, i: Int, i_20_: Int) {
        val i_21_ = i
        if (i_21_ == 0) method3095(-124, class348_sub49.readMedium(-1))
        anInt9251++
        if (i_20_ != 31015) anInt9250 = 105
    }

    constructor() : this(0)
}
