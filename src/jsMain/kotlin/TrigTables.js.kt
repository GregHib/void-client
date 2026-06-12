import kotlin.math.PI
import kotlin.math.cos
import kotlin.math.sin

/**
 * JS actual for [TrigTables]: tables computed at init time using the same formula
 * as the original Class239_Sub4 initialiser:
 *   angle = i * (2π / 16384)
 * The JVM actual delegates to Class239_Sub4 which populates them from game boot;
 * here we populate eagerly since JS has no Class239_Sub4.
 */
actual object TrigTables {
    actual val sin: FloatArray = FloatArray(16384) { i -> kotlin.math.sin(i * (2.0 * PI / 16384.0)).toFloat() }
    actual val cos: FloatArray = FloatArray(16384) { i -> kotlin.math.cos(i * (2.0 * PI / 16384.0)).toFloat() }
}
