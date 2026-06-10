/* Class369 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
public open class Class369(class221: Class221?, class341: Class341?, i: Int, i_3_: Int, i_4_: Int, i_5_: Int, i_6_: Int, i_7_: Int, i_8_: Int) : Interface12 {
    @JvmField
    var anInt4959: Int = 0
    @JvmField
    var anInt4961: Int = 0
    @JvmField
    var anInt4963: Int = 0
    @JvmField
    var anInt4965: Int = 0
    @JvmField
    var anInt4966: Int = 0
    @JvmField
    var aClass221_4968: Class221? = null
    @JvmField
    var anInt4970: Int = 0
    @JvmField
    var anInt4971: Int = 0
    @JvmField
    var aClass341_4973: Class341? = null

    override fun method51(i: Byte): Class223? {
        if (i < 116) return null
        anInt4967++
        return null
    }

    init {
        try {
            this.anInt4961 = i_8_
            this.anInt4971 = i_4_
            this.anInt4965 = i_7_
            this.anInt4966 = i_6_
            this.anInt4959 = i_3_
            this.aClass341_4973 = class341
            this.anInt4970 = i
            this.aClass221_4968 = class221
            this.anInt4963 = i_5_
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("fn.<init>(" + (if (class221 != null) "{...}" else "null") + ',' + (if (class341 != null) "{...}" else "null") + ',' + i + ',' + i_3_ + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ')'))
        }
    }

    companion object {
        @JvmField
        var anInt4960: Int = 0
        @JvmField
        var aClass143_4962: Class143? = null
        @JvmField
        var anInt4964: Int = 0
        @JvmField
        var anInt4967: Int = 0
        @JvmField
        var anInt4969: Int = 0
        @JvmField
        var aBoolean4972: Boolean = false
        @JvmStatic
        fun method3567(i: Int) {
            aClass143_4962 = null
            val i_0_ = 105 % ((-15 - i) / 36)
        }

        @JvmStatic
        fun method3568(var_ha: ha?, i: Int) {
            anInt4964++
            Class240.aClass324_4684 = Class14.method232(var_ha, (-53).toByte(), true, Class56.anInt1044)
            Class258_Sub1.aClass143_8527 = Class135.method1151(-25411, var_ha, Class56.anInt1044)
            if (i != 4) aClass143_4962 = null
            Applet_Sub1.aClass324_20 = Class14.method232(var_ha, (-53).toByte(), true, Class17.anInt235)
            Class246.aClass143_3179 = Class135.method1151(-25411, var_ha, Class17.anInt235)
            Class262.aClass324_3326 = Class14.method232(var_ha, (-53).toByte(), true, Class291.anInt3736)
            aClass143_4962 = Class135.method1151(-25411, var_ha, Class291.anInt3736)
        }

        @JvmStatic
        fun method3569(i: Int, i_1_: Int) {
            anInt4969++
            val i_2_ = 83 % ((i_1_ - -87) / 37)
            val class348_sub42_sub15 = Class318_Sub9_Sub1.method2516(i, 105.toByte(), 4)
            class348_sub42_sub15.method3251(-16058)
        }
    }
}
