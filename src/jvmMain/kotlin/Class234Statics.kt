/**
 * JVM-only statics split out of Class234 (random-access cache store).
 * The companion could not stay on Class234 because the I/O body was folded
 * into FileCacheStorage; these counters and the Class138 grab-bag field are
 * referenced by jvmMain call-sites that have nothing to do with file I/O.
 */
object Class234Statics {
    @JvmField var anInt3038: Int = 0
    @JvmField var anInt3040: Int = 0
    @JvmField var anInt3041: Int = 0
    @JvmField var anInt3042: Int = 0
    @JvmField var anInt3043: Int = 0
    @JvmField var aClass138_3044: Class138? = Class138(0, 2, 2, 1)
    @JvmField var anInt3045: Int = 0
    @JvmField var anInt3047: Int = 0
    @JvmField var anInt3048: Int = 0
    @JvmField var anInt3049: Int = 0

    @JvmStatic
    fun method1659(i: Byte) {
        if (i >= -2) method1659(126.toByte())
        aClass138_3044 = null
    }
}
