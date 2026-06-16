/**
 * JVM actual for [RuntimeException_Sub1Statics].
 *
 * Owns the scalar/array state. [RuntimeException_Sub1]'s companion delegates
 * back here so existing call-sites on the companion continue to work unchanged.
 * [aClass351_4601] is jvmMain-only and stays on the companion directly.
 * The four methods (method4009–method4012) reference jvmMain-only types and
 * also stay on the companion.
 */
actual object RuntimeException_Sub1Statics {
    actual var anInt4596: Int = -1
    actual var anInt4597: Int = 0
    actual var anInt4598: Int = 0
    actual var aBoolean4599: Boolean = true
    actual var anInt4600: Int = 52
    actual var aFloatArray4602: FloatArray? = FloatArray(4)
    actual var anIntArray4603: IntArray? = null
    actual var aBoolean4604: Boolean = false
    actual var anInt4605: Int = 0
}
