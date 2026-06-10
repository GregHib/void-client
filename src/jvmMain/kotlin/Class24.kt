import Class367_Sub10.Companion.method3553

/* Class24 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
object Class24 {
    @JvmField
    var anInt354: Int = 0
    @JvmField
    var aClass60_355: Class60? = Class60(260)
    @JvmField
    var anInt356: Int = 0
    @JvmField
    var aClass318_Sub1_Sub3Array357: Array<Class318_Sub1_Sub3?>? = null
    @JvmField
    var aByteArrayArray358: Array<ByteArray?>? = arrayOfNulls<ByteArray>(1000)
    @JvmField
    var anInt359: Int = 0

    @JvmStatic
    fun method296(i: Byte) {
        if (i.toInt() != -99) method298(false, 24, -128, 22, -7)
        aClass60_355 = null
        aByteArrayArray358 = null
        aClass318_Sub1_Sub3Array357 = null
    }

    @JvmStatic
    fun method297(bool: Boolean) {
        if (bool != false) aClass60_355 = null
        Class5.aClass60_4636!!.method590(0)
        anInt356++
    }

    @JvmStatic
    fun method298(bool: Boolean, i: Int, i_0_: Int, i_1_: Int, i_2_: Int) {
        anInt354++
        if (Class316.aClass348_Sub51_3959!!.aClass239_Sub25_7271!!.method1829(-32350) == 0) Class348_Sub42_Sub3.method3177(-98, false)
        else {
            Class111.anInt1720 = Class316.aClass348_Sub51_3959!!.aClass239_Sub25_7271!!.method1829(-32350)
            method3553(true, 103.toByte(), 0)
        }
        Class88.aBoolean1500 = bool
        Class339.anInt4202 = i
        Class239_Sub7.anInt5909 = i_0_
        Class75.method754(i_1_)
        if (i_2_ > -41) method297(true)
    }
}
