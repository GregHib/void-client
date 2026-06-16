/**
 * Platform-free statics split out of [RuntimeException_Sub1].
 *
 * Exposes the counter/scalar/array fields so commonMain code can reference
 * them without pulling in jvmMain-only types (Class351, aa_Sub1, ha_Sub2,
 * Class348_Sub17, etc.).
 *
 * [aClass351_4601] is a jvmMain-only type and remains in the jvmMain actual
 * only. The four methods (method4009–method4012) all reference jvmMain-only
 * types and stay on the companion directly.
 */
expect object RuntimeException_Sub1Statics {
    var anInt4596: Int
    var anInt4597: Int
    var anInt4598: Int
    var aBoolean4599: Boolean
    var anInt4600: Int
    var aFloatArray4602: FloatArray?
    var anIntArray4603: IntArray?
    var aBoolean4604: Boolean
    var anInt4605: Int
}
