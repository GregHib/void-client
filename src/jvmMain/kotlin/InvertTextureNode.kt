import MouseInputTrackerStatics.method3607
import InvertTextureNodeStatics.method3133
import InvertTextureNodeStatics.anInt9414
import InvertTextureNodeStatics.aBoundsConstraintEntry_9415
import InvertTextureNodeStatics.anInt9417
import InvertTextureNodeStatics.anInt9420

/* Class348_Sub40_Sub32 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class InvertTextureNode : AbstractProceduralTextureNode(1, false) {
    override fun method3047(i: Int, i_9_: Int): Array<IntArray?>? {
        if (i_9_ != -1564599039) method3133(4.toByte())
        anInt9417++
        val `is` = this.aImageFrameCache_7033!!.method2557(-78, i)!!
        if (this.aImageFrameCache_7033!!.aBoolean4035) {
            val is_10_ = this.method3039((-104).toByte(), i, 0)!!
            val is_11_ = is_10_[0]!!
            val is_12_ = is_10_[1]!!
            val is_13_ = is_10_[2]!!
            val is_14_ = `is`[0]!!
            val is_15_ = `is`[1]!!
            val is_16_ = `is`[2]!!
            var i_17_ = 0
            while (DisplaceTextureNodeStatics.anInt9139 > i_17_) {
                is_14_[i_17_] = -is_11_[i_17_] + 4096
                is_15_[i_17_] = 4096 + -is_12_[i_17_]
                is_16_[i_17_] = -is_13_[i_17_] + 4096
                i_17_++
            }
        }
        return `is`
    }

    override fun method3042(i: Int, i_18_: Int): IntArray {
        anInt9420++
        val `is` = this.aSpriteSheetCache_7032!!.method1433(0, i)!!
        if (i_18_ != 255) method3047(-113, -46)
        if (this.aSpriteSheetCache_7032!!.aBoolean2570) {
            val is_19_ = this.method3048(i, 633706337, 0)!!
            var i_20_ = 0
            while ((i_20_ < DisplaceTextureNodeStatics.anInt9139)) {
                `is`[i_20_] = 4096 + -is_19_[i_20_]
                i_20_++
            }
        }
        return `is`
    }

    override fun method3049(class348_sub49: ByteBuffer, i: Int, i_21_: Int) {
        anInt9414++
        if (i_21_ != 31015) aBoundsConstraintEntry_9415 = null
        if (i == 0) this.aBoolean7045 = class348_sub49.readUnsignedByte(255) == 1
    }
}
