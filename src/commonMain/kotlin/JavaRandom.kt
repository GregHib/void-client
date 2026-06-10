/**
 * Faithful pure-Kotlin port of java.util.Random's linear congruential generator.
 *
 * Multiplatform replacement that reproduces java.util.Random's exact bit sequence
 * for a given seed — required because seeded streams here drive deterministic
 * content (noise tables, shuffles) that must match the JVM reference byte-for-byte.
 *
 * Only the subset the client uses is implemented: Random(), Random(seed), nextInt().
 */
class JavaRandom {
    private var seed: Long = 0L

    constructor(seed: Long) {
        setSeed(seed)
    }

    /** Time-seeded, like java.util.Random()'s no-arg constructor (non-deterministic). */
    constructor() {
        setSeed(nextSeedUniquifier() xor monotonicSeed())
    }

    fun setSeed(seed: Long) {
        this.seed = (seed xor MULTIPLIER) and MASK
    }

    private fun next(bits: Int): Int {
        seed = (seed * MULTIPLIER + INCREMENT) and MASK
        return (seed ushr (48 - bits)).toInt()
    }

    fun nextInt(): Int = next(32)

    companion object {
        private const val MULTIPLIER = 0x5DEECE66DL
        private const val INCREMENT = 0xBL
        private const val MASK = (1L shl 48) - 1

        // Mirrors the spirit of java.util.Random's seed uniquifier for the no-arg ctor.
        // Determinism is not required for the no-arg case (used only for shuffles).
        private var uniquifier: Long = 8682522807148012L
        private fun nextSeedUniquifier(): Long {
            uniquifier *= 1181783497276652981L
            return uniquifier
        }

        private fun monotonicSeed(): Long = monotonicCounter++
        private var monotonicCounter: Long = 0L
    }
}
