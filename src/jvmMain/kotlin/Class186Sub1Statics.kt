/**
 * JVM-only statics split from [Class186_Sub1] companion.
 * Factory [create] avoids a direct constructor reference to the noise impl in callers.
 */
object Class186Sub1Statics {
    fun create(seed: Int): Class186_Sub1 = Class186_Sub1(seed)
}
