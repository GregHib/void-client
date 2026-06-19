import kotlin.math.cos
import kotlin.math.pow

object FormantSynthFilterStatics {
    var anIntArrayArray4301: Array<IntArray?>? = Array<IntArray?>(2) { IntArray(8) }
    var anInt4303: Int = 0
    var aFloat4305 = 0f
    var aFloatArrayArray4306: Array<FloatArray?>? = Array<FloatArray?>(2) { FloatArray(8) }

    fun method3448(f: Float): Float {
        val f_7_ = 32.703197f * 2.0.pow(f.toDouble()).toFloat()
        return f_7_ * 3.1415927f / 11025.0f
    }

    @JvmStatic
    fun method3450() {
        aFloatArrayArray4306 = null
        anIntArrayArray4301 = null
    }
}
