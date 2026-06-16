/**
 * Platform-free statics split out of [Class348_Sub22].
 *
 * Exposes the counter/scalar fields so commonMain code can reference them
 * without pulling in java.awt or jvmMain-only types (Npc, Class45, Class46).
 *
 * The three companion methods (method2957, method2958, method2959) all
 * reference jvmMain-only types and remain in the jvmMain actual only.
 */
expect object Class348_Sub22Statics {
    var anInt6857: Int
    var anInt6858: Int
    var anInt6860: Int
    var anInt6861: Int
    var anInt6862: Int
}
