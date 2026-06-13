/**
 * commonMain statics for Class241.
 * method1861 drives the frame-timing pulse — all deps (Class348_Sub8, Class241, Sleepers) are common.
 * JVM-only members (aClass351_3150, method1860) live in Class241StaticsJvm in jvmMain.
 */
object Class241Statics {
    fun method1861(i: Int, l: Long): Int {
        try {
            Class241.anInt3149++
            val l_1_ = Class348_Sub8.aClass241_6660!!.method1858(-73)
            if (i.toLong() < l_1_) Sleepers.sleep(l_1_)
            return Class348_Sub8.aClass241_6660!!.method1859(71, l)
        } catch (runtimeexception: RuntimeException) {
            throw runtimeexception
        }
    }
}
