/* Class57 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class57 {
    @JvmField
    var anInt1046: Int = 0
    @JvmField
    var anInt1047: Int = 0
    @JvmField
    var anInt1052: Int = 0
    @JvmField
    var anInt1054: Int = 0

    companion object {
        @JvmField
        var aClass17Array1048: Array<Class17?>? = arrayOfNulls<Class17>(14)
        @JvmField
        var anInt1049: Int = 0
        @JvmField
        var aClass163_1050: Class163? = null
        var aClass251_1051: Class251? = Class251()
        @JvmField
        var anInt1053: Int = 0
        @JvmField
        var aClass227_1055: Class227? = null

        @JvmStatic
        fun method529(i: Int, bool: Boolean) {
            anInt1053++
            if (bool != true) method530(-105)
            val class348_sub42_sub15 = Class318_Sub9_Sub1.method2516(i, 105.toByte(), 2)
            class348_sub42_sub15.method3251(-16058)
        }

        @JvmStatic
        fun method530(i: Int) {
            aClass17Array1048 = null
            aClass227_1055 = null
            aClass163_1050 = null
            aClass251_1051 = null
            if (i != 14) aClass251_1051 = null
        }

        fun method531(i: Byte, class70: Class70?): Int {
            val i_0_ = -45 / ((i - 54) / 43)
            anInt1049++
            if (Class342.aClass70_4247 != class70) {
                if (class70 != Class285_Sub2.aClass70_8503) {
                    if (Class318_Sub1_Sub2.aClass70_8737 != class70) {
                        if (Class348_Sub40_Sub39.aClass70_9485 == class70) return 34166
                    } else return 34168
                } else return 34167
            } else return 5890
            throw IllegalArgumentException()
        }
    }
}
