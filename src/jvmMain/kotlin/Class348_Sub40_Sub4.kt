/* Class348_Sub40_Sub4 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class348_Sub40_Sub4 : Class348_Sub40(0, true) {
    override fun method3042(i: Int, i_0_: Int): IntArray? {
        anInt9115++
        if (i_0_ != 255) aClass262_9111 = null
        val `is` = this.aClass191_7032!!.method1433(0, i)!!
        if (this.aClass191_7032!!.aBoolean2570) Class214.method1579(`is`, 0, Class348_Sub40_Sub6.Companion.anInt9139, Class239_Sub18.anIntArray6035!![i])
        return `is`
    }

    companion object {
        @JvmField
        var aClass262_9111: Class262? = Class262()
        @JvmField
        var anInt9112: Int = 0
        @JvmField
        var aD9113: d? = null
        @JvmField
        var aClass101_9114: Class101? = null
        @JvmField
        var anInt9115: Int = 0

        @JvmStatic
        fun method3057(i: Byte) {
            if (i > -32) method3058(-76, 25, -12)
            aClass101_9114 = null
            aClass262_9111 = null
            aD9113 = null
        }

        @JvmStatic
        fun method3058(i: Int, i_1_: Int, i_2_: Int) {
            val class357 = Class147.aClass357ArrayArrayArray2029!![i]!![i_1_]!![i_2_]
            if (class357 != null) {
                Class183.method1376(class357.aClass318_Sub1_Sub4_4406)
                Class183.method1376(class357.aClass318_Sub1_Sub4_4403)
                if (class357.aClass318_Sub1_Sub4_4406 != null) class357.aClass318_Sub1_Sub4_4406 = null
                if (class357.aClass318_Sub1_Sub4_4403 != null) class357.aClass318_Sub1_Sub4_4403 = null
            }
        }
    }
}
