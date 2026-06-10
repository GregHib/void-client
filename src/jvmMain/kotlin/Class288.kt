import Class223.Companion.method1613
import Class299_Sub1.Companion.method2259
import Class348.Companion.method2709
import Class64.Companion.method616

/* Class288 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
open class Class288 internal constructor(i: Int, class221: Class221?, class341: Class341?, i_2_: Int, i_3_: Int) : Interface12 {
    @JvmField
    var anInt4950: Int = 0
    @JvmField
    var anInt4951: Int = 0
    @JvmField
    var aClass341_4952: Class341? = null
    @JvmField
    var aClass221_4955: Class221? = null
    @JvmField
    var anInt4958: Int = 0

    override fun method51(i: Byte): Class223? {
        anInt4957++
        return Class348_Sub40_Sub21.aClass223_9274
    }

    init {
        try {
            this.anInt4950 = i_2_
            this.anInt4958 = i
            this.anInt4951 = i_3_
            this.aClass221_4955 = class221
            this.aClass341_4952 = class341
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("vr.<init>(" + i + ',' + (if (class221 != null) "{...}" else "null") + ',' + (if (class341 != null) "{...}" else "null") + ',' + i_2_ + ',' + i_3_ + ')'))
        }
    }

    companion object {
        @JvmField
        var aClass231_4953: Class231? = Class231("WIP", 2)
        var anInt4954: Int = 0
        var anInt4956: Int = 0
        var anInt4957: Int = 0
        @JvmStatic
        fun method2185(i: Int) {
            aClass231_4953 = null
            if (i != 2) aClass231_4953 = null
        }

        fun method2186(i: Byte, string: String): Int {
            anInt4954++
            if (i.toInt() != -114) method2187(-85, -44, 56)
            return string.length + 2
        }

        @JvmStatic
        fun method2187(i: Int, i_0_: Int, i_1_: Int): Boolean {
            anInt4956++
            if (i_0_ > -70) method2187(-57, -121, 54)
            return ((method2709(i_1_, i, -1) or method1613(false, i_1_, i) or method2259(0, i_1_, i)) and method616(2, i, i_1_))
        }
    }
}
