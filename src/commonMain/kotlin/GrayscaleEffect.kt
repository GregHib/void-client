import kotlin.jvm.JvmStatic
/* Class348_Sub40_Sub13 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class GrayscaleEffect : AbstractProceduralTextureNode(1, true) {
    override fun method3042(i: Int, i_0_: Int): IntArray {
        anInt9202++
        val `is` = this.aSpriteSheetCache_7032!!.method1433(i_0_ + -255, i)!!
        if (i_0_ != 255) method3042(19, -84)
        if (this.aSpriteSheetCache_7032!!.aBoolean2570) {
            val is_1_ = this.method3039((-119).toByte(), i, 0)!!
            val is_2_ = is_1_[0]!!
            val is_3_ = is_1_[1]!!
            val is_4_ = is_1_[2]!!
            var i_5_ = 0
            while (PerlinNoiseTextureNode.Companion.anInt9139 > i_5_) {
                `is`[i_5_] = (is_2_[i_5_] - (-is_3_[i_5_] - is_4_[i_5_])) / 3
                i_5_++
            }
        }
        return `is`
    }

    companion object {

        var aNodeDeque_9201: NodeDeque?

        var anInt9202: Int = 0

        var anInt9203: Int = -1
        var aFloat9204: Float

        @JvmStatic
        fun method3080(i: Byte) {
            aNodeDeque_9201 = null
            if (i < 39) method3080(100.toByte())
        }

        init {
            aNodeDeque_9201 = NodeDeque()
            aFloat9204 = 0.25f
        }
    }
}
