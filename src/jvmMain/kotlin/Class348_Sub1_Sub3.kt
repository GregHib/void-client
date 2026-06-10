import Class367_Sub11.Companion.method3555

/* Class348_Sub1_Sub3 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class348_Sub1_Sub3 internal constructor(i: Int, i_3_: Int, i_4_: Int, i_5_: Int, i_6_: Int, f: Float) : Class348_Sub1(i, i_3_, i_4_, i_5_, i_6_, f) {
    override fun method2725(i: Int, i_0_: Byte, i_1_: Int, i_2_: Int) {
        if (i_0_.toInt() == 70) {
            this.anInt6553 = i_1_
            this.anInt6562 = i
            anInt8819++
            this.anInt6548 = i_2_
        }
    }

    override fun method2716(i: Int, f: Float) {
        anInt8821++
        this.aFloat6550 = f
        if (i != -1) method2732(-79, -120, true, 36, null, 19)
    }

    companion object {
        @JvmField
        var anInt8818: Int = 0
        @JvmField
        var anInt8819: Int = 0
        @JvmField
        var anInt8820: Int = 0
        @JvmField
        var anInt8821: Int = 0

        @JvmStatic
        fun method2732(i: Int, i_7_: Int, bool: Boolean, i_8_: Int, class45: Class45?, i_9_: Int) {
            anInt8820++
            if (i_8_ < 90) anInt8818 = -21
            method3555(class45, -89, bool, 0L, i_9_, i, i_7_)
        }
    }
}
