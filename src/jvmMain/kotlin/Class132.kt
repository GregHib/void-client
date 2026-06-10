/* Class132 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
object Class132 {
    var anInt1905: Int = 4
    @JvmField
    var anInt1906: Int
    @JvmField
    var aPlayer_1907: Player? = null
    var anInt1908: Int = 0
    @JvmField
    var anIntArray1909: IntArray? = null
    @JvmField
    var anInt1910: Int = 0
    var anInt1911: Int = 7000

    @JvmStatic
    fun method1137(i: Int) {
        if (i != 3) method1138(null, true, null, 70.toByte())
        anIntArray1909 = null
        aPlayer_1907 = null
    }

    @JvmStatic
    fun method1138(string: String?, bool: Boolean, string_0_: String?, i: Byte) {
        try {
            anInt1908++
            Class64_Sub3.aString5600 = string
            Class186.aString2496 = string_0_
            Class318_Sub1_Sub3_Sub3.aBoolean10238 = bool
            if (!Class318_Sub1_Sub3_Sub3.aBoolean10238 && (Class64_Sub3.aString5600 == "" || Class186.aString2496 == "")) Class14_Sub4.method254(3, (-100).toByte())
            else {
                val i_1_ = 34 % ((16 - i) / 55)
                if (Class239_Sub12.anInt5969 != 1) {
                    Class63.anInt1121 = 0
                    Class348_Sub42_Sub7.anInt9541 = -1
                }
                Class110.aBoolean1712 = false
                Class14_Sub4.method254(-3, (-94).toByte())
                Class225.anInt2955 = 1
                Class11.anInt197 = 0
                Class318_Sub1_Sub1_Sub2.anInt9971 = 0
            }
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("nr.A(" + (if (string != null) "{...}" else "null") + ',' + bool + ',' + (if (string_0_ != null) "{...}" else "null") + ',' + i + ')'))
        }
    }

    init {
        anInt1906 = anInt1911
    }
}
