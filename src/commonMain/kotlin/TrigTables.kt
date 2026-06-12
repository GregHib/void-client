/**
 * Platform seam for the 16384-entry sin/cos lookup tables.
 *
 * The original tables live in Class239_Sub4 (jvmMain) and are indexed as:
 *   aFloatArray5874[i & 0x3fff]  → sin
 *   aFloatArray5876[i & 0x3fff]  → cos
 *
 * Populated from angle index i using: angle = i * (2π / 16384)
 *
 * Used by Class101_Sub1 and Class101_Sub2 for 3D matrix rotation methods.
 * JVM actual delegates directly to Class239_Sub4's companion arrays.
 */
expect object TrigTables {
    val sin: FloatArray
    val cos: FloatArray
}
