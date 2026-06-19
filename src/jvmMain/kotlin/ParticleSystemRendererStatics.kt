import ColorThresholdEffectStatics.method3051
import java.awt.Canvas

object ParticleSystemRendererStatics {
    @JvmField
            var anInt3855: Int = 0
            var anInt3856: Int = 0
            var anInt3860: Int = 0
            var anInt3861: Int = 0
            var anInt3864: Int = 0
            var anInt3868: Int = 0
            @JvmField
            var aCanvas3869: Canvas? = null
            @JvmField
            var aBoolean3870: Boolean = false
            @JvmStatic
            fun method2294(i: Int) {
                aCanvas3869 = null
                if (i <= 94) method2296(-107)
            }
    
            @JvmStatic
            fun method2296(i: Int) {
                anInt3868++
                if (i < -46) {
                    for (i_22_ in 0..99) SceneModelBuilderStatics.aHintArrowOrMessageArray6400s!![i_22_] = null
                    NativeShaderProgramStatics.anInt9774 = 0
                }
            }
}
