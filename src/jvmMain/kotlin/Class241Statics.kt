/**
 * JVM-only statics for Class241 that depend on Class351 and Class348_Sub17.
 * method1861 uses Class348_Sub17.method2929 (jvmMain).
 * aClass351_3150/method1860 use Class351 (jvmMain).
 */
object Class241StaticsJvm {
    var aClass351_3150: Class351? = Class351(71, 2)

    fun method1860(i: Byte) {
        aClass351_3150 = null
        val i_0_ = -52 / ((-22 - i) / 55)
    }

    fun method1861(i: Int, l: Long): Int {
        try {
            Class241.anInt3149++
            val l_1_ = Class348_Sub8.aClass241_6660!!.method1858(-73)
            if (i.toLong() < l_1_) Sleepers.sleep(l_1_)
            return Class348_Sub8.aClass241_6660!!.method1859(71, l)
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, "tb.H(" + i + ',' + l + ')')
        }
    }
}
