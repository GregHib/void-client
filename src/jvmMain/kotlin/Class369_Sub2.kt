/* Class369_Sub2 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class369_Sub2(class221: Class221?, class341: Class341?, i: Int, i_2_: Int, i_3_: Int, i_4_: Int, i_5_: Int, i_6_: Int, i_7_: Int, i_8_: Int, i_9_: Int) : Class369(class221, class341, i, i_2_, i_3_, i_4_, i_5_, i_6_, i_7_) {
    @JvmField
    var anInt8585: Int = 0
    @JvmField
    var anInt8591: Int = 0
    override fun method51(i: Byte): Class223? {
        if (i < 116) method3572(118)
        anInt8586++
        return Class348_Sub49.aClass223_7175
    }

    init {
        try {
            this.anInt8585 = i_9_
            this.anInt8591 = i_8_
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("ou.<init>(" + (if (class221 != null) "{...}" else "null") + ',' + (if (class341 != null) "{...}" else "null") + ',' + i + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ',' + i_9_ + ')'))
        }
    }

    companion object {
        @JvmField
        var aClass46ArrayArray8584: Array<Array<Class46?>?>? = null
        @JvmField
        var anInt8586: Int = 0
        @JvmField
        var anInt8587: Int = 0
        @JvmField
        var anInt8588: Int = 0
        @JvmField
        var aClass45_8589: Class45? = null
        @JvmField
        var aClass114_8590: Class114? = Class114(58, 2)
        @JvmField
        var anObject8592: Any? = null
        @JvmField
        var anInt8593: Int = 0

        @JvmStatic
        fun method3571(bool: Boolean, i: Int, i_0_: Byte, i_1_: Int): Class45? {
            anInt8593++
            if (i_0_.toInt() != -23) return null
            var class137: Class137? = null
            if (Class299_Sub2.aClass78_6328 != null) class137 = Class137(i, Class299_Sub2.aClass78_6328, Class100.aClass78Array1579!![i], 1000000)
            Class13.aClass314_Sub1Array223!![i] = Class175.aClass340_2327!!.method2673(class137, i, Class277.aClass137_3568, 255)
            Class13.aClass314_Sub1Array223!![i]!!.method2346(27872)
            return Class45(Class13.aClass314_Sub1Array223!![i]!!, bool, i_1_)
        }

        @JvmStatic
        fun method3572(i: Int) {
            aClass114_8590 = null
            aClass45_8589 = null
            if (i != 1000000) method3571(false, -66, 13.toByte(), 13)
            aClass46ArrayArray8584 = null
            anObject8592 = null
        }
    }
}
