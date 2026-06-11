/**
 * JVM-only statics for Class238 (game connection). Companion could not stay on
 * the commonMain class because Class114 and Class318_Sub9_Sub1 are jvmMain-only.
 * All call-sites in jvmMain reference these directly; none exist in commonMain.
 */
object Class238Statics {
    var anInt3132: Int = 0
    var aClass114_3133: Class114? = null

    fun method1703(i: Int, i_2_: Int, i_3_: Int, i_4_: Int, i_5_: Int) {
        anInt3132++
        val class348_sub42_sub15 = Class318_Sub9_Sub1.method2516(i_2_, 105.toByte(), i_4_)
        class348_sub42_sub15.method3246(-25490)
        class348_sub42_sub15.anInt9651 = i_3_
        class348_sub42_sub15.anInt9652 = i
        class348_sub42_sub15.anInt9650 = i_5_
    }

    fun method1704(i: Byte) {
        if (i >= -90) aClass114_3133 = null
        aClass114_3133 = null
    }
}
