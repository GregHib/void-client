/* Class241 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
abstract class Class241 {
    abstract fun method1856(i: Byte)

    abstract fun method1858(i: Int): Long

    abstract fun method1859(i: Int, l: Long): Int

    fun method1861(i: Int, l: Long): Int {
        try {
            anInt3149++
            val l_1_ = method1858(-73)
            if (i.toLong() < l_1_) Class286_Sub5.method2161(61.toByte(), l_1_)
            return method1859(71, l)
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, "tb.H(" + i + ',' + l + ')')
        }
    }

    abstract fun method1862(i: Int): Long

    companion object {
        @JvmField
        var anInt3148: Int = 0
        @JvmField
        var anInt3149: Int = 0
        @JvmField
        var aClass351_3150: Class351? = Class351(71, 2)

        @JvmStatic
        fun method1857(i: Byte): Long {
            anInt3148++
            if (i.toInt() != -45) return -58L
            return Class348_Sub8.aClass241_6660!!.method1862(-18931)
        }

        @JvmStatic
        fun method1860(i: Byte) {
            aClass351_3150 = null
            val i_0_ = -52 / ((-22 - i) / 55)
        }
    }
}
