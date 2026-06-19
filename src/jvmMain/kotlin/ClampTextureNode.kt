import kotlin.math.min

/* Class348_Sub40_Sub38 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class ClampTextureNode : AbstractProceduralTextureNode(1, false) {
    private var anInt9470 = 4096
    private var anInt9474 = 0
    override fun method3049(class348_sub49: ByteBuffer, i: Int, i_0_: Int) {
        if (i_0_ != 31015) anInt9470 = -15
        val i_1_ = i
        while_213_@ do {
            do {
                if (i_1_ == 0) {
                    anInt9474 = class348_sub49.readUnsignedShort(i_0_ + 842366929)
                    break@while_213_
                } else if (i_1_ != 1) {
                    if (i_1_ == 2) break
                    break@while_213_
                }
                anInt9470 = class348_sub49.readUnsignedShort(i_0_ + 842366929)
                break@while_213_
            } while (false)
            this.aBoolean7045 = class348_sub49.readUnsignedByte(i_0_ + -30760) == 1
        } while (false)
        anInt9472++
    }

    override fun method3047(i: Int, i_2_: Int): Array<IntArray?>? {
        anInt9468++
        val `is` = this.aImageFrameCache_7033!!.method2557(-117, i)!!
        if (this.aImageFrameCache_7033!!.aBoolean4035) {
            val is_3_ = this.method3039((-88).toByte(), i, 0)!!
            val is_4_ = is_3_[0]!!
            val is_5_ = is_3_[1]!!
            val is_6_ = is_3_[2]!!
            val is_7_ = `is`[0]!!
            val is_8_ = `is`[1]!!
            val is_9_ = `is`[2]!!
            var i_10_ = 0
            while ((i_10_ < anInt9139)) {
                val i_11_ = is_4_[i_10_]
                val i_12_ = is_5_[i_10_]
                val i_13_ = is_6_[i_10_]
                if (i_11_ < anInt9474) is_7_[i_10_] = anInt9474
                else is_7_[i_10_] = min(i_11_, anInt9470)
                if (anInt9474 > i_12_) is_8_[i_10_] = anInt9474
                else is_8_[i_10_] = min(i_12_, anInt9470)
                if (anInt9474 <= i_13_) {
                    is_9_[i_10_] = min(i_13_, anInt9470)
                } else is_9_[i_10_] = anInt9474
                i_10_++
            }
        }
        return `is`
    }

    override fun method3042(i: Int, i_15_: Int): IntArray {
        anInt9476++
        val `is` = this.aSpriteSheetCache_7032!!.method1433(0, i)!!
        if (this.aSpriteSheetCache_7032!!.aBoolean2570) {
            val is_16_ = this.method3048(i, 633706337, 0)!!
            for (i_17_ in 0..<anInt9139) {
                val i_18_ = is_16_[i_17_]
                if (anInt9474 > i_18_) `is`[i_17_] = anInt9474
                else `is`[i_17_] = min(i_18_, anInt9470)
            }
        }
        return `is`
    }

    companion object {
        @JvmField
        var anInt9468: Int = 0
        @JvmField
        var anInt9472: Int = 0
        @JvmField
        var anInt9476: Int = 0
        var anInt9139: Int = 0
    }
}
