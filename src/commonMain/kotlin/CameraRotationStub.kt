import kotlin.jvm.JvmStatic
import kotlin.math.cos
import kotlin.math.sin

/* Class21 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class CameraRotationStub {
    override fun toString(): String {
        anInt327++
        throw IllegalStateException()
    }

    companion object {

        var anInt321: Int = 0

        var sprites: Js5Archive? = null

        var aWidgetComponent_323: WidgetComponent? = null

        var anInt324: Int = 0

        var anInt325: Int = -50

        var aRenderer326: Renderer? = null

        var anInt327: Int = 0

        @JvmStatic
        fun method288(i: Byte) {
            sprites = null
            if (i > 93) {
                aRenderer326 = null
                aWidgetComponent_323 = null
            }
        }

        fun method289(i: Int, i_0_: Int, i_1_: Int, i_2_: Int) {
            anInt324++
            if (WorldMapAreaLabel.anInt8583 != i_2_ || LocalizedTextTriple.anInt3760 != i_0_ || i_1_ != ProjectileConfigUtil.anInt396) {
                WorldMapAreaLabel.anInt8583 = i_2_
                PcmStreamBuffer.aBoolean8870 = true
                ProjectileConfigUtil.anInt396 = i_1_
                LocalizedTextTriple.anInt3760 = i_0_
                val d = -((i_2_ * 2).toDouble() * 3.141592653589793) / 16384.0
                val d_3_ = -(3.141592653589793 * (2 * i_0_).toDouble()) / 16384.0
                val d_4_ = cos(d_3_)
                val d_5_ = sin(d_3_)
                val d_6_ = cos(d)
                val d_7_ = sin(d)
                VideoAdChecker.aDouble3182 = d_4_
                MenuActionNode.aDouble6774 = d_7_
                LocalizedTextTriple.aDouble3761 = d_6_
                PcmStreamBuffer.aDouble8869 = d_4_ * d_6_
                if (i != -15902) Companion.method288((-120).toByte())
                ProceduralTextureGraph.aDouble9531 = d_7_ * -d_4_
                SceneCollisionEntry.aDouble4404 = d_5_
                GfxTypeList.aDouble3980 = 0.0
                NoiseTextureGenerator.aDouble1083 = d_6_ * -d_5_
                TheoraVideoStream.aDouble9023 = d_5_ * d_7_
            }
        }
    }
}
