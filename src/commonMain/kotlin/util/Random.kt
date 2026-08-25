package util

expect class Random {
    constructor()
    constructor(seed: Long)

    fun setSeed(seed: Long)
    fun nextInt(): Int
    fun nextInt(bound: Int): Int
    fun nextLong(): Long
    fun nextBoolean(): Boolean
    fun nextFloat(): Float
    fun nextDouble(): Double
    fun nextGaussian(): Double
    fun nextBytes(bytes: ByteArray)
}