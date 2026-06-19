import kotlin.math.cos
import kotlin.math.sin

object CameraRotationStubStatics {
    @JvmField
            var anInt321: Int = 0
            @JvmField
            var aJs5Archive_322: Js5Archive? = null
            @JvmField
            var aWidgetComponent_323: WidgetComponent? = null
            @JvmField
            var anInt324: Int = 0
            @JvmField
            var anInt325: Int = -50
            @JvmField
            var aRenderer326: Renderer? = null
            @JvmField
            var anInt327: Int = 0
    
            @JvmStatic
            fun method288(i: Byte) {
                aJs5Archive_322 = null
                if (i > 93) {
                    aRenderer326 = null
                    aWidgetComponent_323 = null
                }
            }
    
            fun method289(i: Int, i_0_: Int, i_1_: Int, i_2_: Int) {
                anInt324++
                if (WorldMapAreaLabelStatics.anInt8583 != i_2_ || LocalizedTextTripleStatics.anInt3760 != i_0_ || i_1_ != ProjectileConfigUtil.anInt396) {
                    WorldMapAreaLabelStatics.anInt8583 = i_2_
                    PcmStreamBufferStatics.aBoolean8870 = true
                    ProjectileConfigUtil.anInt396 = i_1_
                    LocalizedTextTripleStatics.anInt3760 = i_0_
                    val d = -((i_2_ * 2).toDouble() * 3.141592653589793) / 16384.0
                    val d_3_ = -(3.141592653589793 * (2 * i_0_).toDouble()) / 16384.0
                    val d_4_ = cos(d_3_)
                    val d_5_ = sin(d_3_)
                    val d_6_ = cos(d)
                    val d_7_ = sin(d)
                    VideoAdChecker.aDouble3182 = d_4_
                    MenuActionNodeStatics.aDouble6774 = d_7_
                    LocalizedTextTripleStatics.aDouble3761 = d_6_
                    PcmStreamBufferStatics.aDouble8869 = d_4_ * d_6_
                    if (i != -15902) method288((-120).toByte())
                    ProceduralTextureGraphStatics.aDouble9531 = d_7_ * -d_4_
                    SceneCollisionEntryStatics.aDouble4404 = d_5_
                    MapElementDefinitionCacheStatics.aDouble3980 = 0.0
                    NoiseTextureGeneratorStatics.aDouble1083 = d_6_ * -d_5_
                    TheoraVideoStreamStatics.aDouble9023 = d_5_ * d_7_
                }
            }
}
