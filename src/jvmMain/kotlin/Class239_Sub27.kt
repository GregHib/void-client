/* Class239_Sub27 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class239_Sub27 : Class239 {
    fun method1840(i: Int): Int {
        anInt6127++
        if (i != -32350) aClass341_6128 = null
        return this.anInt3138
    }

    override fun method1712(i: Int, i_26_: Int) {
        this.anInt3138 = i_26_
        anInt6132++
        val i_27_ = 123 / ((82 - i) / 35)
    }

    override fun method1714(i: Int, i_28_: Int): Int {
        if (i != 3) aClass341_6128 = null
        anInt6130++
        return 3
    }

    internal constructor(i: Int, class348_sub51: Class348_Sub51) : super(i, class348_sub51)

    internal constructor(class348_sub51: Class348_Sub51) : super(class348_sub51)

    override fun method1710(i: Int): Int {
        anInt6133++
        if (i != 20014) method1716(true)
        if ((this.aClass348_Sub51_3136.method3422(674) == Class10.aClass230_186) && this.aClass348_Sub51_3136.method3425(-111)) return 0
        return 1
    }

    override fun method1716(bool: Boolean) {
        anInt6131++
        this.anInt3138 = method1710(20014)
        if (bool != false) method1710(98)
    }

    companion object {
        @JvmField
        var anInt6127: Int = 0
        @JvmField
        var aClass341_6128: Class341? = null
        @JvmField
        var anInt6129: Int = 0
        @JvmField
        var anInt6130: Int = 0
        @JvmField
        var anInt6131: Int = 0
        @JvmField
        var anInt6132: Int = 0
        @JvmField
        var anInt6133: Int = 0

        @JvmStatic
        fun method1839(i: Int, i_0_: Int, i_1_: Int, i_2_: Int, i_3_: Int, i_4_: Int) {
            anInt6129++
            var i_5_ = 0
            var i_6_ = i_0_
            val i_7_ = i_4_ * i_4_
            val i_8_ = i_0_ * i_0_
            val i_9_ = i_8_ shl 1
            val i_10_ = i_7_ shl 1
            val i_11_ = i_0_ shl 1
            var i_12_ = i_9_ + i_7_ * (-i_11_ + 1)
            var i_13_ = -((i_11_ + i_2_) * i_10_) + i_8_
            val i_14_ = i_7_ shl 2
            val i_15_ = i_8_ shl 2
            var i_16_ = i_9_ * (3 + (i_5_ shl 1))
            var i_17_ = i_10_ * (-3 + (i_6_ shl 1))
            var i_18_ = i_15_ * (i_5_ - -1)
            if (Class132.anInt1910 <= i_1_ && Class38.anInt513 >= i_1_) {
                val i_19_ = Class85.method831(Class113.anInt1745, i + i_4_, Class369.anInt4960, -89)
                val i_20_ = Class85.method831(Class113.anInt1745, -i_4_ + i, Class369.anInt4960, -116)
                Class135_Sub2.method1156(-27, i_19_, Class17.anIntArrayArray255!![i_1_]!!, i_20_, i_3_)
            }
            var i_21_ = i_14_ * (i_6_ - 1)
            while (i_6_ > 0) {
                if (i_12_ < 0) {
                    while (i_12_ < 0) {
                        i_13_ += i_18_
                        i_12_ += i_16_
                        i_5_++
                        i_16_ += i_15_
                        i_18_ += i_15_
                    }
                }
                if (i_13_ < 0) {
                    i_12_ += i_16_
                    i_13_ += i_18_
                    i_16_ += i_15_
                    i_18_ += i_15_
                    i_5_++
                }
                i_13_ += -i_17_
                i_12_ += -i_21_
                i_21_ -= i_14_
                i_17_ -= i_14_
                i_6_--
                val i_22_ = i_1_ + -i_6_
                val i_23_ = i_6_ + i_1_
                if (i_23_ >= Class132.anInt1910 && i_22_ <= Class38.anInt513) {
                    val i_24_ = Class85.method831(Class113.anInt1745, i + i_5_, Class369.anInt4960, 86)
                    val i_25_ = Class85.method831(Class113.anInt1745, -i_5_ + i, Class369.anInt4960, 32)
                    if (Class132.anInt1910 <= i_22_) Class135_Sub2.method1156(i_2_ + -26, i_24_, Class17.anIntArrayArray255!![i_22_]!!, i_25_, i_3_)
                    if (Class38.anInt513 >= i_23_) Class135_Sub2.method1156(-27, i_24_, Class17.anIntArrayArray255!![i_23_]!!, i_25_, i_3_)
                }
            }
        }

        @JvmStatic
        fun method1841(i: Int) {
            if (i != 16878) method1839(-83, -10, 27, 111, 41, 109)
            aClass341_6128 = null
        }
    }
}
