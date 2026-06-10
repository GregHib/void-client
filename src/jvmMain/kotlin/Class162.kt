/* Class162 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class162 internal constructor(var anInt2153: Int, var anInt2155: Int, var anInt2156: Int, var anInt2158: Int) {
    fun method1266(i: Int, i_0_: Int): Class162 {
        if (i != 5) method1266(82, -25)
        anInt2154++
        return Class162(this.anInt2153, i_0_, this.anInt2156, this.anInt2158)
    }

    companion object {
        var anInt2152: Int = 0
        var anInt2154: Int = 0
        @JvmField
        var aClass74_2157: Class74? = Class74(5, 16)
        @JvmStatic
        fun method1265(i: Int) {
            anInt2152++
            if (i != 16) aClass74_2157 = null
            if (Class348_Sub40.aClass279_7042 != null) Class348_Sub40.aClass279_7042!!.method2093(true)
            if (Class194.aClass279_2596 != null) Class194.aClass279_2596!!.method2093(true)
        }

        @JvmStatic
        fun method1267(i: Byte) {
            aClass74_2157 = null
            if (i.toInt() != 85) method1267(121.toByte())
        }
    }
}
