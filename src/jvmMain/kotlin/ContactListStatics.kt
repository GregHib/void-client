import SceneModelBuilderStatics.method2496
import CollisionFlagQueryStatics.method721
import kotlin.math.min
import kotlin.math.pow

object ContactListStatics {
    var anInt9613: Int = 0
            var anInt9614: Int = 0
            var aBoolean9616: Boolean = false
            var anInt9618: Int = 0
            var anInt9619: Int = 0
            var anInt9620: Int = 0
            fun method3232(d: Double, i: Byte) {
                if (i <= -54) {
                    if (d != CubemapTextureImplSourceStatics.aDouble8713) {
                        for (i_0_ in 0..255) {
                            val i_1_ = (255.0 * (i_0_.toDouble() / 255.0).pow(d)).toInt()
                            ProjectedGroundDecorStatics.anIntArray10266!![i_0_] = min(i_1_, 255)
                        }
                        CubemapTextureImplSourceStatics.aDouble8713 = d
                    }
                    anInt9618++
                }
            }
}
