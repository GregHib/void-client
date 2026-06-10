import Class186_Sub1.Companion.method1399
import Class286_Sub9.Companion.method2174

/* Class98 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class98 {
    @JvmField
    var aClass88_1569: Class88 = Class88()

    companion object {
        @JvmField
        var aClass348_Sub16_Sub3_1564: Class348_Sub16_Sub3? = null
        @JvmField
        var anInt1565: Int = 0
        @JvmField
        var anIntArrayArray1566: Array<IntArray>? = arrayOf(intArrayOf(0, 2, 4, 6), intArrayOf(6, 0, 2, 3, 5, 3), intArrayOf(6, 0, 2, 4), intArrayOf(2, 5, 6, 1), intArrayOf(0, 2, 6), intArrayOf(6, 0, 2), intArrayOf(5, 6, 0, 1, 2, 4), intArrayOf(7, 7, 1, 2, 4, 6), intArrayOf(2, 4, 4, 7), intArrayOf(6, 6, 4, 0, 1, 1, 3, 3), intArrayOf(0, 2, 2, 6, 6, 4), intArrayOf(0, 2, 2, 3, 7, 0, 4, 3), intArrayOf(0, 2, 4, 6))
        @JvmField
        var anInt1567: Int = 0
        @JvmField
        var anInt1568: Int = 0
        @JvmField
        var anInt1570: Int = 0
        @JvmField
        var anInt1571: Int = 0

        fun method877(i: Int, i_0_: Int, i_1_: Byte): Boolean {
            if (i_1_.toInt() != -127) anIntArrayArray1566 = null
            anInt1567++
            return method2174(126.toByte(), i, i_0_) || Class202.method1475(((-107).toByte()).toByte(), i_0_, i)
        }

        @JvmStatic
        fun method878(string: String, i: Int): ByteArray {
            anInt1571++
            val i_2_ = string.length
            if (i_2_ == 0) return ByteArray(0)
            val i_3_ = 0x3.inv() and 3 + i_2_
            var i_4_ = i_3_ / 4 * 3
            if (i_3_ + -2 >= i_2_ || method1399(7, string[i_3_ + -2]) == -1) i_4_ -= 2
            else if (i_2_ <= i_3_ + -1 || method1399(7, string[i_3_ - 1]) == -1) i_4_--
            if (i > -92) method877(-51, -45, ((-74).toByte()).toByte())
            val `is` = ByteArray(i_4_)
            Class318_Sub2.method2497(`is`, 0.toByte(), string, 0)
            return `is`
        }

        @JvmStatic
        fun method879(i: Int) {
            aClass348_Sub16_Sub3_1564 = null
            if (i > 67) anIntArrayArray1566 = null
        }
    }
}
