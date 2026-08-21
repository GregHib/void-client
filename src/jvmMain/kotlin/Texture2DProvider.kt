import java.io.FileOutputStream
import kotlin.math.ln
import kotlin.math.pow

abstract class Texture2DProvider : CircleRasterizer() {
    abstract fun method2256(i: Byte): GlTextureCubeMap?

    companion object {

        var anInt6320: Int = 0

        var anInt6322: Int = 0

        var aFileOutputStream6323: FileOutputStream? = null

        @JvmStatic
        fun method2257(i: Int, i_0_: Int, i_1_: Byte): Int {
            anInt6322++
            val d = ln(i.toDouble()) / ln(2.0)
            val d_2_ = ln(i_0_.toDouble()) / ln(2.0)
            val i_3_ = -43 % ((i_1_ - 11) / 59)
            val d_4_ = (d - d_2_) * Math.random() + d_2_
            return (0.5 + 2.0.pow(d_4_)).toInt()
        }

        @JvmStatic
        fun method2259(i: Int, i_5_: Int, i_6_: Int): Boolean {
            anInt6320++
//            if (i != 0) aRectangleRegion_6321 = null
            return (0x34 and i_6_) != 0
        }
    }
}
