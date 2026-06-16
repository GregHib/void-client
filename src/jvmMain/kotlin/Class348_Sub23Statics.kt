import kotlin.math.cos
import kotlin.math.sin

/**
 * JVM-only statics split from [Class348_Sub23] companion.
 * The sin/cos lookup tables are accessed widely without needing the OGG machinery.
 */
object Class348_Sub23Statics {
    var aFloatArray6865: FloatArray? = FloatArray(16384)
    var aFloatArray6867: FloatArray? = FloatArray(16384)

    init {
        val d = 3.834951969714103E-4
        for (i in 0..16383) {
            aFloatArray6865!![i] = sin(d * i.toDouble()).toFloat()
            aFloatArray6867!![i] = cos(i.toDouble() * d).toFloat()
        }
    }
}
