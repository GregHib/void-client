/* Class372 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class372(var_ha_Sub3: ha_Sub3?, var_d: d?) {
    private val aHa_Sub3_4526: ha_Sub3?
    private val aD4528: d?
    private val aClass60_4531 = Class60(256)
    fun method3585(i: Int) {
        anInt4530++
        if (i == 7271) aClass60_4531.method590(0)
    }

    fun method3586(i: Int) {
        aClass60_4531.method578(2, 5)
        if (i != -16130) method3586(-94)
        anInt4527++
    }

    fun method3587(i: Byte, i_0_: Int): Interface18_Impl3? {
        anInt4529++
        val `object` = aClass60_4531.method583(i_0_.toLong(), 107)
        if (`object` != null) return `object` as Interface18_Impl3
        if (!aD4528!!.method4(-7953, i_0_)) return null
        if (i > -30) anInt4532 = 37
        val class12 = aD4528.method3(i_0_, -6662)
        val i_1_ = (if (!class12!!.aBoolean199) aHa_Sub3_4526!!.anInt8150 else 64)
        val interface18_impl3: Interface18_Impl3
        if (class12.aBoolean218 && aHa_Sub3_4526!!.method3666()) {
            val fs = aD4528.method1(i_1_, 0.7f, false, -30824, i_1_, i_0_)
            interface18_impl3 = aHa_Sub3_4526.method3891(fs, i_1_, i_1_, Class108.aClass304_1662, -109, class12.aByte205.toInt() != 0)!!
        } else {
            val `is`: IntArray?
            if (class12.anInt200 == 2 || !Class251.method1915(4.toByte(), class12.aByte213.toInt())) `is` = aD4528.method6(-21540, i_1_, 0.7f, i_0_, false, i_1_)
            else `is` = aD4528.method5(true, i_0_, 0.7f, i_1_, i_1_, 83)
            interface18_impl3 = aHa_Sub3_4526!!.method3839(i_1_, i_1_, -15137, class12.aByte205.toInt() != 0, `is`)!!
        }
        interface18_impl3.method66(class12.aBoolean217, class12.aBoolean215, 25688)
        aClass60_4531.method582(interface18_impl3, i_0_.toLong(), (-107).toByte())
        return interface18_impl3
    }

    init {
        try {
            aHa_Sub3_4526 = var_ha_Sub3
            aD4528 = var_d
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("fw.<init>(" + (if (var_ha_Sub3 != null) "{...}" else "null") + ',' + (if (var_d != null) "{...}" else "null") + ')'))
        }
    }

    companion object {
        @JvmField
        var anInt4527: Int = 0
        @JvmField
        var anInt4529: Int = 0
        @JvmField
        var anInt4530: Int = 0
        @JvmField
        var anInt4532: Int = 1407
    }
}
