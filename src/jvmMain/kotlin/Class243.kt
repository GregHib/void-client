/* Class243 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class243 {
    private val aClass318_3166 = Class318()
    private var aClass318_3167: Class318? = null
    fun method1869(i: Int, class318: Class318) {
        if (class318.aClass318_3976 != null) class318.method2373(false)
        anInt3158++
        class318.aClass318_3976 = aClass318_3166.aClass318_3976
        if (i > -81) aClass318_3167 = null
        class318.aClass318_3970 = aClass318_3166
        class318.aClass318_3976!!.aClass318_3970 = class318
        class318.aClass318_3970!!.aClass318_3976 = class318
    }

    fun method1870(i: Int): Class318? {
        if (i > -103) aClass318_3167 = null
        anInt3162++
        val class318 = aClass318_3166.aClass318_3976
        if (aClass318_3166 === class318) {
            aClass318_3167 = null
            return null
        }
        aClass318_3167 = class318!!.aClass318_3976
        return class318
    }

    fun method1871(i: Byte): Boolean {
        anInt3157++
        if (i <= 98) method1879(true)
        return aClass318_3166 === aClass318_3166.aClass318_3970
    }

    fun method1872(i: Int): Class318? {
        anInt3163++
        val class318 = aClass318_3166.aClass318_3970
        if (i != 8) method1878(126.toByte())
        if (class318 === aClass318_3166) {
            aClass318_3167 = null
            return null
        }
        aClass318_3167 = class318!!.aClass318_3970
        return class318
    }

    fun method1874(i: Int): Int {
        anInt3161++
        var i_0_ = i
        var class318 = aClass318_3166.aClass318_3970
        while (aClass318_3166 !== class318) {
            i_0_++
            class318 = class318!!.aClass318_3970
        }
        return i_0_
    }

    fun method1875(i: Int): Class318? {
        anInt3160++
        val class318 = aClass318_3166.aClass318_3970
        if (class318 === aClass318_3166) return null
        class318!!.method2373(false)
        if (i != 60) method1878(16.toByte())
        return class318
    }

    fun method1876(i: Byte) {
        if (i.toInt() == -45) {
            anInt3168++
            while (true) {
                val class318 = aClass318_3166.aClass318_3970
                if (class318 === aClass318_3166) break
                class318!!.method2373(false)
            }
            aClass318_3167 = null
        }
    }

    fun method1878(i: Byte): Class318? {
        anInt3159++
        val class318 = aClass318_3167
        val i_1_ = -59 % ((67 - i) / 55)
        if (class318 === aClass318_3166) {
            aClass318_3167 = null
            return null
        }
        aClass318_3167 = class318!!.aClass318_3970
        return class318
    }

    init {
        aClass318_3166.aClass318_3976 = aClass318_3166
        aClass318_3166.aClass318_3970 = aClass318_3166
    }

    companion object {
        var anInt3157: Int = 0
        var anInt3158: Int = 0
        var anInt3159: Int = 0
        var anInt3160: Int = 0
        var anInt3161: Int = 0
        var anInt3162: Int = 0
        var anInt3163: Int = 0
        var anInt3164: Int = 0
        var aClass351_3165: Class351? = Class351(60, 8)
        var anInt3168: Int = 0

        @JvmStatic
        fun method1873(i: Byte) {
            if (i > -111) aClass351_3165 = null
            aClass351_3165 = null
        }

        fun method1877(var_ha: ha?, i: Int) {
            anInt3164++
            if (i >= -20) method1877(null, -112)
            var class318_sub10 = Class152.aClass243_2077!!.method1872(8) as Class318_Sub10?
            while (class318_sub10 != null) {
                if (class318_sub10.aBoolean6482) class318_sub10.method2528(var_ha)
                class318_sub10 = Class152.aClass243_2077!!.method1878(124.toByte()) as Class318_Sub10?
            }
        }

        @JvmStatic
        fun method1879(bool: Boolean) {
            if (bool) {
                Class147.aClass357ArrayArrayArray2029 = Class348_Sub31_Sub2.aClass357ArrayArrayArray9082
                aa_Sub1.aSArray5191 = Class332.aSArray4142
            } else {
                Class147.aClass357ArrayArrayArray2029 = Class65.aClass357ArrayArrayArray1148
                aa_Sub1.aSArray5191 = Class348_Sub1_Sub1.aSArray8801
            }
            Class189.anInt2524 = Class147.aClass357ArrayArrayArray2029!!.size
        }
    }
}
