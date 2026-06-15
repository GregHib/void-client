/**
 * Platform-free statics split out of [Class348_Sub33].
 *
 * Exposes the counters and state fields used by commonMain classes.
 *
 * [method3024] / [method3025] use java.io + java.lang.reflect (anti-cheat /
 * update checker via reflection) and are JVM-only; they stay in the jvmMain
 * actual only.
 *
 * [aByteArrayArrayArray6962] is exposed as nullable so JS can return null
 * (the anti-cheat data is never populated on JS).
 */
expect object Class348_Sub33Statics {
    var anInt6956: Int
    var anInt6961: Int
    var anInt6964: Int
    var anInt6967: Int
    var aLong6963: Long
    var aLong6966: Long
    var aByteArrayArrayArray6962: Array<Array<ByteArray?>?>?
}
