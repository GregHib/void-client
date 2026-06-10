/* Class299_Sub2_Sub1 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class299_Sub2_Sub1 internal constructor(private val aHa_Sub3_8718: ha_Sub3, private val anInt8716: Int, private val anInt8717: Int, private val anInt8715: Int, private val anInt8711: Int, private val anInt8708: Int, private val anInt8714: Int) : Class299_Sub2() {
    private var anInterface18_Impl2_8719: Interface18_Impl2? = null
    override fun method2266(bool: Boolean): Interface18_Impl2? {
        if (bool != true) return null
        anInt8720++
        if (anInterface18_Impl2_8719 == null) {
            Class270.anIntArray3464!![3] = anInt8711
            Class270.anIntArray3464!![1] = anInt8717
            Class270.anIntArray3464!![4] = anInt8708
            val var_d = aHa_Sub3_8718.aD4579!!
            Class270.anIntArray3464!![5] = anInt8714
            Class270.anIntArray3464!![2] = anInt8715
            Class270.anIntArray3464!![0] = anInt8716
            var bool_0_ = false
            var i = 0
            for (i_1_ in 0..5) {
                if (!var_d.method4(-7953, Class270.anIntArray3464!![i_1_])) return null
                val class12 = var_d.method3(Class270.anIntArray3464!![i_1_], -6662)
                val i_2_ = if (class12!!.aBoolean199) 64 else 128
                if (i < i_2_) i = i_2_
                if (class12.aByte205 > 0) bool_0_ = true
            }
            for (i_3_ in 0..5) Class239_Sub14.anIntArrayArray5991!![i_3_] = var_d.method5(false, Class270.anIntArray3464!![i_3_], 1.0f, i, i, 81)
            anInterface18_Impl2_8719 = aHa_Sub3_8718.method3900(Class239_Sub14.anIntArrayArray5991, bool_0_, 61, i)
        }
        return anInterface18_Impl2_8719
    }

    companion object {
        @JvmField
        var anInt8709: Int = 0
        @JvmField
        var anInt8710: Int = 0
        @JvmField
        var anIntArray8712: IntArray? = null
        @JvmField
        var aDouble8713: Double = -1.0
        @JvmField
        var anInt8720: Int = 0

        @JvmStatic
        fun method2270(i: Int, i_4_: Int, var_ha: ha?, string: String?, bool: Boolean, i_5_: Int, i_6_: Int, i_7_: Int) {
            try {
                if (OutputStream_Sub2.aClass105_106 == null || Class121.aClass105_1800 == null) {
                    if (Class21.aClass45_322!!.method421(false, Class231.anInt2996) && Class21.aClass45_322!!.method421(false, Class348_Sub40_Sub16.anInt9231)) {
                        OutputStream_Sub2.aClass105_106 = (var_ha!!.method3691(Class207.method1521(Class21.aClass45_322!!, Class231.anInt2996, 0), true))
                        val class207 = Class207.method1521(Class21.aClass45_322!!, Class348_Sub40_Sub16.anInt9231, 0)
                        Class121.aClass105_1800 = var_ha.method3691(class207, true)
                        class207!!.method1518()
                        Class348_Sub5.aClass105_6627 = var_ha.method3691(class207, true)
                    } else var_ha!!.aa(i_4_, i_5_, i, i_7_, (255 + -Class51.anInt948 shl 24 or Class264.anInt3376), 1)
                }
                anInt8709++
                if (OutputStream_Sub2.aClass105_106 != null && Class121.aClass105_1800 != null) {
                    val i_8_ = ((i - 2 * Class121.aClass105_1800!!.method971()) / OutputStream_Sub2.aClass105_106!!.method971())
                    for (i_9_ in 0..<i_8_) OutputStream_Sub2.aClass105_106!!.method974((Class121.aClass105_1800!!.method971() + i_4_ + (OutputStream_Sub2.aClass105_106!!.method971() * i_9_)), i_5_)
                    Class121.aClass105_1800!!.method974(i_4_, i_5_)
                    Class348_Sub5.aClass105_6627!!.method974((-Class348_Sub5.aClass105_6627!!.method971() + i_4_ - -i), i_5_)
                }
                if (bool == false) {
                    Class262.aClass324_3326!!.method2576(string, (Class348_Sub42_Sub11.anInt9586) or 0xffffff.inv(), 14 + i_5_, 3 + i_4_, -1, -127)
                    var_ha!!.aa(i_4_, i_7_ + i_5_, i, i_6_ + -i_7_, (Class264.anInt3376 or (255 + -Class51.anInt948 shl 24)), 1)
                }
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, ("kv.G(" + i + ',' + i_4_ + ',' + (if (var_ha != null) "{...}" else "null") + ',' + (if (string != null) "{...}" else "null") + ',' + bool + ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ')'))
            }
        }

        @JvmStatic
        fun method2271(i: Int) {
            anInt8710++
            if (!Class55_Sub1.aBoolean5265) {
                Class152.method1217(0, Class65.aClass357ArrayArrayArray1148!!)
                if (Class348_Sub31_Sub2.aClass357ArrayArrayArray9082 != null) Class152.method1217(0, (Class348_Sub31_Sub2.aClass357ArrayArrayArray9082!!))
                Class55_Sub1.aBoolean5265 = true
            }
        }

        @JvmStatic
        fun method2272(i: Int) {
            if (i < 85) method2271(-124)
            anIntArray8712 = null
        }
    }
}
