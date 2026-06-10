import Class239_Sub3.Companion.method1728

/* Class251 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class251 {
    override fun toString(): String {
        anInt3230++
        throw IllegalStateException()
    }

    companion object {
        var anInt3229: Int = 0
        var anInt3230: Int = 0
        var anInt3231: Int = 0
        @JvmField
        var aClass351_3232: Class351? = Class351(51, 3)
        var anInt3233: Int = 0
        @JvmField
        var anInt3234: Int = 0
        var anInt3235: Int = 0
        var anInt3236: Int = 0

        @JvmStatic
        fun method1912(i: Int) {
            if (i == 8549) aClass351_3232 = null
        }

        @JvmStatic
        fun method1913(bool: Boolean, i: Int, class46: Class46) {
            anInt3235++
            val i_0_ = -40 % ((-35 - i) / 51)
            val i_1_ = (if (class46.anInt698 == 0) class46.anInt709 else class46.anInt698)
            val i_2_ = (if (class46.anInt791 != 0) class46.anInt791 else class46.anInt789)
            Class367_Sub1.method3534(false, class46.anInt830, i_1_, bool, i_2_, (Class348_Sub40_Sub33.aClass46ArrayArray9427!![(class46.anInt830 shr 16)]!!))
            if (class46.aClass46Array798 != null) Class367_Sub1.method3534(false, class46.anInt830, i_1_, bool, i_2_, class46.aClass46Array798!!)
            val class348_sub41 = (Class125.aClass356_4915!!.method3480(class46.anInt830.toLong(), -6008) as Class348_Sub41?)
            if (class348_sub41 != null) method1728(i_2_, -1, (class348_sub41.anInt7050), bool, i_1_)
        }

        fun method1914(i: Int, i_3_: Int): Int {
            anInt3231++
            return i_3_ and 0xff
        }

        @JvmStatic
        fun method1915(i: Byte, i_4_: Int): Boolean {
            if (i.toInt() != 4) return false
            anInt3233++
            return i_4_ != 1 && i_4_ != 7
        }

        @JvmStatic
        fun method1916(i: Int, class46: Class46) {
            anInt3229++
            if (class46.anInt794 == Class58.anInt1064) Class152.aBooleanArray2076!![class46.anInt760] = true
            if (i != -9343) method1914(-107, 120)
        }
    }
}
