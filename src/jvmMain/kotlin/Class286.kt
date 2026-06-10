/* Class286 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
abstract class Class286 internal constructor(var aHa_Sub2_3684: ha_Sub2) {
    abstract fun method2133(i: Int)

    abstract fun method2134(bool: Boolean, bool_0_: Boolean)

    abstract fun method2136(i: Int, i_1_: Int, i_2_: Byte)

    abstract fun method2137(i: Int): Boolean

    abstract fun method2139(bool: Boolean, i: Byte)

    abstract fun method2140(class258: Class258?, i: Byte, i_5_: Int)

    companion object {
        @JvmField
        var anInt3681: Int = 0
        @JvmField
        var anInt3682: Int = 0
        @JvmField
        var aClass348_Sub2_3683: Class348_Sub2? = null
        @JvmStatic
        fun method2135(i: Int) {
            if (i == 0) aClass348_Sub2_3683 = null
        }

        @JvmStatic
        fun method2138(i: Int): Boolean {
            anInt3681++
            val class348_sub48 = Class348_Sub35.aClass262_6978!!.method1995(4) as Class348_Sub48?
            if (class348_sub48 == null) return false
            val i_3_ = 118 % ((-40 - i) / 50)
            var i_4_ = 0
            while ((class348_sub48.anInt7126 > i_4_)) {
                if ((class348_sub48.aClass144Array7135!![i_4_] != null) && (class348_sub48.aClass144Array7135!![i_4_]!!.anInt1997) == 0) return false
                if ((class348_sub48.aClass144Array7127!![i_4_] != null) && (class348_sub48.aClass144Array7127!![i_4_]!!.anInt1997) == 0) return false
                i_4_++
            }
            return true
        }
    }
}
