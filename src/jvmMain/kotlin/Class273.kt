import Class122.method1087
import Class146.Companion.method1193
import Class156.Companion.method1241
import Class239_Sub1.Companion.method1722

/* Class273 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class273 internal constructor(string: String?, var anInt5167: Int) : Interface21 {
    override fun toString(): String {
        anInt5166++
        throw IllegalStateException()
    }

    companion object {
        var anIntArray5165: IntArray? = intArrayOf(-1, -1, 1, 1)
        var anInt5166: Int = 0
        var anInt5168: Int = 0
        var aClass173_5169: Class173? = Class173()

        @JvmStatic
        fun method2055(i: Int) {
            anIntArray5165 = null
            aClass173_5169 = null
            if (i != 1) anIntArray5165 = null
        }

        @JvmStatic
        fun method2056(i: Int, i_0_: Int, i_1_: Int): Boolean {
            if (i_0_ < 80) method2055(17)
            anInt5168++
            if (!method1193(i_1_, i, true)) return false
            if (method1087(12644, i_1_, i) or ((i and 0xb000) != 0) or Class278.Companion.method2075(i, -128, i_1_)) return true
            return ((method1241(i_1_, i, -128) or method1722(i, i_1_, 92.toByte())) and ((0x37 and i_1_) == 0))
        }

        @JvmStatic
        fun method2057(i: Int, i_2_: Int): Int {
            return i or i_2_
        }
    }
}
