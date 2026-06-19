import RangeThresholdTextureNodeStatics.method3056
import RangeThresholdTextureNodeStatics.anInt9102
import RangeThresholdTextureNodeStatics.anInt9110

/* Class348_Sub40_Sub3 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class RangeThresholdTextureNode : AbstractProceduralTextureNode(1, true) {
    private var anInt9104 = 0
    private var anInt9107 = 4096
    override fun method3049(class348_sub49: ByteBuffer, i: Int, i_0_: Int) {
        val i_1_ = i
        do {
            if (i_1_ == 0) {
                anInt9104 = class348_sub49.readUnsignedShort(842397944)
                break
            } else if (i_1_ != 1) break
            anInt9107 = class348_sub49.readUnsignedShort(842397944)
        } while (false)
        anInt9102++
        if (i_0_ != 31015) method3056(-75, 18, 53)
    }

    override fun method3042(i: Int, i_3_: Int): IntArray {
        anInt9110++
        if (i_3_ != 255) anInt9107 = -121
        val `is` = this.aSpriteSheetCache_7032!!.method1433(i_3_ + -255, i)!!
        if (this.aSpriteSheetCache_7032!!.aBoolean2570) {
            val is_4_ = this.method3048(i, 633706337, 0)!!
            var i_5_ = 0
            while ((DisplaceTextureNodeStatics.anInt9139 > i_5_)) {
                val i_6_ = is_4_[i_5_]
                `is`[i_5_] = if (i_6_ >= anInt9104 && (i_6_ <= anInt9107)) 4096 else 0
                i_5_++
            }
        }
        return `is`
    }
}
