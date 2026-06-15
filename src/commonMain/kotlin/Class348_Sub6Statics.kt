/**
 * Platform-free statics split out of [Class348_Sub6].
 *
 * Exposes the companion counters, arrays, and pure-math methods so
 * commonMain classes can reference them without pulling in java.io.File.
 *
 * [method2769] (loads a native library via System.load from a File path)
 * is JVM-only and stays in the jvmMain actual only.
 */
expect object Class348_Sub6Statics {
    var anIntArray6631: IntArray?
    var anInt6632: Int
    var anInt6633: Int
    var anInt6634: Int
    var anIntArray6635: IntArray?
    var anInt6637: Int
    var anInt6638: Int
    var anInt6639: Int

    fun method2768(i: Int)
    fun method2770(i: Int)
}
