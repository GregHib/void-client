import Class62.method599

/* Class318_Sub9_Sub1 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class318_Sub9_Sub1 internal constructor(@JvmField var aString8783: String?, i: Int) : Class318_Sub9() {
    @JvmField
    var aShort8786: Short
    @JvmField
    var anInt8787: Int = (method599(-92) / 1000L).toInt()

    init {
        this.aShort8786 = i.toShort()
    }

    companion object {
        var anInt8782: Int = 0
        var aFloat8784: Float = 0f
        @JvmField
        var anIntArray8785: IntArray? = null
        var anInt8788: Int = 0

        fun method2515(i: Int): Array<Class57?>? {
            if (i != 1494) method2515(-18)
            anInt8782++
            if (Class228.aClass57Array2974 == null) {
                val class57s: Array<Class57?> = Class19.method286((-107).toByte(), Class348_Sub23_Sub1.aClass297_8992!!)
                val class57s_0_: Array<Class57?> = arrayOfNulls<Class57>(class57s.size)
                var i_1_ = 0
                val i_2_ = Class316.aClass348_Sub51_3959!!.aClass239_Sub23_7231!!.method1818(-32350)
                var i_3_ = 0
                while_108_@ while (class57s.size > i_3_) {
                    val class57 = class57s[i_3_]!!
                    if ((class57.anInt1046 <= 0 || class57.anInt1046 >= 24) && class57.anInt1047 >= 800 && class57.anInt1054 >= 600 && (i_2_ != 2 || (class57.anInt1047 <= 800) && class57.anInt1054 <= 600) && (i_2_ != 1 || ((class57.anInt1047 <= 1024) && (class57.anInt1054 <= 768)))) {
                        for (i_4_ in 0..<i_1_) {
                            val class57_5_ = class57s_0_[i_4_]!!
                            if ((class57_5_.anInt1047 == class57.anInt1047) && (class57_5_.anInt1054 == class57.anInt1054)) {
                                if (class57.anInt1046 > class57_5_.anInt1046) class57s_0_[i_4_] = class57
                                i_3_++
                                continue@while_108_
                            }
                        }
                        class57s_0_[i_1_] = class57
                        i_1_++
                    }
                    i_3_++
                }
                Class228.aClass57Array2974 = arrayOfNulls<Class57>(i_1_)
                Class214.method1575<Class57?>(class57s_0_, 0, Class228.aClass57Array2974!!, 0, i_1_)
                val `is` = IntArray(Class228.aClass57Array2974!!.size)
                var i_6_ = 0
                while ((Class228.aClass57Array2974!!.size > i_6_)) {
                    val class57 = Class228.aClass57Array2974!![i_6_]
                    `is`[i_6_] = (class57!!.anInt1047 * class57.anInt1054)
                    i_6_++
                }
                Class39.method366(Class228.aClass57Array2974 as Array<Any?>, (-123).toByte(), `is`)
            }
            return Class228.aClass57Array2974
        }

        @JvmStatic
        fun method2516(i: Int, i_7_: Byte, i_8_: Int): Class348_Sub42_Sub15 {
            anInt8788++
            var class348_sub42_sub15 = (Class100.aClass356_1585!!.method3480((i_8_.toLong() shl 32 or i.toLong()), i_7_.toInt() xor 0x171e.inv()) as Class348_Sub42_Sub15?)
            if (i_7_.toInt() != 105) aFloat8784 = 0.99212307f
            if (class348_sub42_sub15 == null) {
                class348_sub42_sub15 = Class348_Sub42_Sub15(i_8_, i)
                Class100.aClass356_1585!!.method3483(91.toByte(), (class348_sub42_sub15.aLong4291), class348_sub42_sub15)
            }
            return class348_sub42_sub15
        }

        @JvmStatic
        fun method2517(i: Byte) {
            if (i.toInt() != 4) anIntArray8785 = null
            anIntArray8785 = null
        }
    }
}
