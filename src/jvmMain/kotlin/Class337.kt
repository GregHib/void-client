import Class288.Companion.method2187
import Class288_Sub1.Companion.method2189
import Class348.Companion.method2709

/* Class337 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class337 internal constructor(var_ha_Sub2: ha_Sub2?, l: Long, class242s: Array<Class242?>?) {
    private val aHa_Sub2_4173: ha_Sub2?
    var aLong4178: Long = 0

    @Throws(Throwable::class)
    protected fun finalize() {
        aHa_Sub2_4173!!.method3769(this.aLong4178, false)
        anInt4175++
//        super.finalize()
    }

    init {
        try {
            aHa_Sub2_4173 = var_ha_Sub2
            this.aLong4178 = l
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("dw.<init>(" + (if (var_ha_Sub2 != null) "{...}" else "null") + ',' + l + ',' + (if (class242s != null) "{...}" else "null") + ')'))
        }
    }

    companion object {
        var aFloatArrayArray4174: Array<FloatArray?>? =
            arrayOf<FloatArray?>(floatArrayOf(-0.333333f, -0.333333f, -0.333333f), floatArrayOf(0.333333f, -0.333333f, -0.333333f), floatArrayOf(-0.333333f, 0.333333f, -0.333333f), floatArrayOf(0.333333f, 0.333333f, -0.333333f), floatArrayOf(-0.333333f, -0.333333f, 0.333333f), floatArrayOf(0.333333f, -0.333333f, 0.333333f), floatArrayOf(-0.333333f, 0.333333f, 0.333333f), floatArrayOf(0.333333f, 0.333333f, 0.333333f))
        var anInt4175: Int = 0
        var anInt4176: Int = 0
        @JvmField
        var anObject4177: Any? = null
        @JvmField
        var anInt4179: Int = -1
        var anInt4180: Int = 0

        @JvmStatic
        fun method2658(bool: Boolean) {
            aFloatArrayArray4174 = null
            anObject4177 = null
            if (bool != true) aFloatArrayArray4174 = null
        }

        fun method2659(i: Byte, i_0_: Int, i_1_: Int): Boolean {
            val i_2_ = 24 % ((i - 76) / 42)
            anInt4176++
            return ((0x70000 and i_0_) != 0) or method2709(i_1_, i_0_, -1) || method2187(i_0_, -84, i_1_)
        }

        fun method2660(i: Byte, class348_sub49: Class348_Sub49): Class288_Sub1? {
            anInt4180++
            if (i.toInt() != 26) return null
            val class288 = method2189(class348_sub49, i + 59)
            val i_3_ = class348_sub49.method3369(125.toByte())
            return Class288_Sub1(class288.anInt4958, class288.aClass221_4955, class288.aClass341_4952, class288.anInt4950, class288.anInt4951, i_3_)
        }
    }
}
