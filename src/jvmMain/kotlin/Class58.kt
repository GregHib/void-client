import Class239_Sub10.Companion.method1762

/* Class58 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class58 {
    private var aLong1057: Long = 0
    private var anInt1058 = 0
    private fun method533(class325: Class325, i: Int) {
        aLong1057 = aLong1057 or (class325.anInt4070 shl anInt1058++ * Class325.anInt4081).toLong()
        anInt1063++
        val i_5_ = 0 % ((28 - i) / 59)
    }

    private fun method534(i: Byte, i_6_: Int): Int {
        anInt1065++
        if (i.toInt() != 0) return -115
        return (aLong1057 shr Class325.anInt4081 * i_6_).toInt() and 0xf
    }

    internal constructor(class325: Class325) {
        aLong1057 = class325.anInt4070.toLong()
        anInt1058 = 1
    }

    internal constructor(class325s: Array<Class325?>) {
        for (i in class325s.indices) method533(class325s[i]!!, 92)
    }

    fun method537(i: Int, i_27_: Int): Class325? {
        anInt1060++
        val i_28_ = 4 % ((-35 - i_27_) / 53)
        return Class325.method2598(method534(0.toByte(), i), -109)
    }

    fun method538(i: Byte): Int {
        anInt1056++
        if (i >= -114) method538(105.toByte())
        return anInt1058
    }

    companion object {
        @JvmField
        var anInt1056: Int = 0
        @JvmField
        var anInt1059: Int = 0
        @JvmField
        var anInt1060: Int = 0
        @JvmField
        var anInt1061: Int = 0
        @JvmField
        var anInt1062: Int = 0
        @JvmField
        var anInt1063: Int = 0
        @JvmField
        var anInt1064: Int = -2
        @JvmField
        var anInt1065: Int = 0
        @JvmField
        var anInt1066: Int = 0
        @JvmField
        var anInt1067: Int = 0

        @JvmStatic
        fun method532(i: Int, i_0_: Int, bool: Boolean, i_1_: Int): Int {
            anInt1061++
            val class348_sub13 = Class258_Sub4.method1974((-120).toByte(), i_0_, bool)
            if (class348_sub13 == null) return 0
            if (i == -1) return 0
            var i_2_ = 0
            var i_3_ = 0
            while ((i_3_ < class348_sub13.anIntArray6758.size)) {
                if (class348_sub13.anIntArray6757!![i_3_] == i) i_2_ += class348_sub13.anIntArray6758[i_3_]
                i_3_++
            }
            val i_4_ = 73 % ((i_1_ - -52) / 63)
            return i_2_
        }

        @JvmStatic
        fun method535(i: Int, i_7_: Int, i_8_: Int, i_9_: Int, i_10_: Int, i_11_: Int, i_12_: Byte) {
            anInt1062++
            val i_13_ = Class85.method831(Class38.anInt513, i_11_, Class132.anInt1910, 111)
            val i_14_ = Class85.method831(Class38.anInt513, i_7_, Class132.anInt1910, -104)
            if (i_12_ >= -62) Companion.method535(80, -63, -10, 41, -65, 39, (-89).toByte())
            val i_15_ = Class85.method831(Class113.anInt1745, i, Class369.anInt4960, -79)
            val i_16_ = Class85.method831(Class113.anInt1745, i_9_, Class369.anInt4960, 92)
            val i_17_ = Class85.method831(Class38.anInt513, i_11_ + i_8_, Class132.anInt1910, 32)
            val i_18_ = Class85.method831(Class38.anInt513, -i_8_ + i_7_, Class132.anInt1910, 41)
            var i_19_ = i_13_
            while (i_17_ > i_19_) {
                Class135_Sub2.method1156(-27, i_16_, Class17.anIntArrayArray255!![i_19_]!!, i_15_, i_10_)
                i_19_++
            }
            var i_20_ = i_14_
            while (i_18_ < i_20_) {
                Class135_Sub2.method1156(-27, i_16_, Class17.anIntArrayArray255!![i_20_]!!, i_15_, i_10_)
                i_20_--
            }
            val i_21_ = Class85.method831(Class113.anInt1745, i_8_ + i, Class369.anInt4960, 121)
            val i_22_ = Class85.method831(Class113.anInt1745, -i_8_ + i_9_, Class369.anInt4960, -101)
            for (i_23_ in i_17_..i_18_) {
                val `is`: IntArray = Class17.anIntArrayArray255!![i_23_]!!
                Class135_Sub2.method1156(-27, i_21_, `is`, i_15_, i_10_)
                Class135_Sub2.method1156(-27, i_16_, `is`, i_22_, i_10_)
            }
        }

        @JvmStatic
        fun method536(i: Int, bool: Boolean, i_24_: Int, i_25_: Int, i_26_: Int): Boolean {
            if (bool != false) method536(-65, true, 105, -126, 39)
            anInt1066++
            if ((Class348_Sub33.aByteArrayArrayArray6962!![0]!![i_24_]!![i].toInt() and 0x2) != 0) return true
            if ((0x10 and Class348_Sub33.aByteArrayArrayArray6962!![i_26_]!![i_24_]!![i].toInt()) != 0) return false
            return i_25_ == method1762(-55, i_26_, i, i_24_)
        }
    }
}
