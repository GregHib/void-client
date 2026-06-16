import java.io.FileOutputStream
import kotlin.math.ln
import kotlin.math.pow

abstract class Class299_Sub1 : Class299() {
    abstract fun method2256(i: Byte): Class258_Sub2?

    companion object {
        var anInt6320: Int = 0
        var aClass138_6321: Class138? get() = Class299Sub1Statics.aClass138_6321; set(v) { Class299Sub1Statics.aClass138_6321 = v }
        var anInt6322: Int = 0
        var aFileOutputStream6323: FileOutputStream? = null

        fun method2257(i: Int, i_0_: Int, i_1_: Byte): Int {
            anInt6322++
            val d = ln(i.toDouble()) / ln(2.0)
            val d_2_ = ln(i_0_.toDouble()) / ln(2.0)
            val i_3_ = -43 % ((i_1_ - 11) / 59)
            val d_4_ = (d - d_2_) * Math.random() + d_2_
            return (0.5 + 2.0.pow(d_4_)).toInt()
        }

        fun method2258(i: Byte) {
            aClass138_6321 = null
            if (i < -119) aFileOutputStream6323 = null
        }

        fun method2259(i: Int, i_5_: Int, i_6_: Int): Boolean {
            anInt6320++
            if (i != 0) aClass138_6321 = null
            return (0x34 and i_6_) != 0
        }
    }
}
