/* Class371 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class371 {
    @JvmField
    var anInt4520: Int = 0
    @JvmField
    var anInt4522: Int = 0
    @JvmField
    var anInt4524: Int = 0
    @JvmField
    var anInt4525: Int = 0

    companion object {
        @JvmField
        var anInt4521: Int = 0
        @JvmField
        var anInt4523: Int = 0
        @JvmStatic
        fun method3583(bool: Boolean, `is`: ByteArray?, i: Int, i_0_: Int, var_ha_Sub2: ha_Sub2?, i_1_: Int, i_2_: Int, i_3_: Int): Class258_Sub3_Sub1? {
            try {
                anInt4521++
                if (i_1_ > -17) return null
                if (var_ha_Sub2!!.aBoolean7793 || Class192.method1436(-58, i_3_) && Class192.method1436(-68, i_0_)) return Class258_Sub3_Sub1(var_ha_Sub2, 3553, i_2_, i_3_, i_0_, bool, `is`, i)
                if (var_ha_Sub2.aBoolean7837) return Class258_Sub3_Sub1(var_ha_Sub2, 34037, i_2_, i_3_, i_0_, bool, `is`, i)
                return Class258_Sub3_Sub1(var_ha_Sub2, i_2_, i_3_, i_0_, Class33.method340(i_3_, 108.toByte()), Class33.method340(i_0_, 108.toByte()), `is`, i)
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, ("fr.B(" + bool + ',' + (if (`is` != null) "{...}" else "null") + ',' + i + ',' + i_0_ + ',' + (if (var_ha_Sub2 != null) "{...}" else "null") + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ')'))
            }
        }

        @JvmStatic
        fun method3584(i: Int, i_4_: Int): Boolean {
            if (i_4_ != 1) return false
            anInt4523++
            return i == 0 || i == 1 || i == 2
        }
    }
}
