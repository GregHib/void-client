import GlCubeMapTextureStatics.method243
import GradientLookupEffectStatics.method3076
import GlShadowRenderPassStatics.method3553
import kotlin.concurrent.Volatile

object SpriteRenderableStatics {
    @JvmField
            var aFloat4720: Float = 0f
            @JvmField
            var anInt4721: Int = 0
            @JvmField
            var anInt4723: Int = 0
    
            @JvmField
            @Volatile
            var aBoolean4726: Boolean = true
            @JvmField
            var anInt4727: Int = 0
            @JvmField
            var aBoolean4728: Boolean = false
            @JvmField
            var aWidgetComponent_4730: WidgetComponent? = null
            @JvmStatic
            fun method453(i: Int) {
                if (i == -2001) aWidgetComponent_4730 = null
            }
    
            fun method454(i: Int, i_0_: Byte): Int {
                val i_1_ = 20 / ((i_0_ - -4) / 37)
                anInt4727++
                val i_2_: Int
                if (i > 12000) {
                    PlayerUpdateDecoder.method1140(73)
                    i_2_ = 4
                } else if (i > 5000) {
                    NanoTimerStatics.method447((-59).toByte())
                    i_2_ = 3
                } else if (i <= 2000) {
                    i_2_ = 1
                    method3076(0, true)
                } else {
                    i_2_ = 2
                    ServerConnectionInfoStatics.method1263(true)
                }
                if (IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub25_7271!!.method1829(-32350) != 2) {
                    IntHashSetStatics.aClass348_Sub51_3959!!.method3429(74.toByte(), (IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub25_7251), 2)
                    method3553(false, 119.toByte(), 2)
                }
                method243(37)
                return i_2_
            }
}
