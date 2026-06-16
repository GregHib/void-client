/**
 * JVM-only statics split from [Class135] companion.
 * [aColorArray1928] is needed by Client.kt and rendering classes without importing the GL buffer class.
 */
object Class135Statics {
    var aColorArray1928: IntArray?
        get() = Class135.aColorArray1928
        set(v) { Class135.aColorArray1928 = v }
}
