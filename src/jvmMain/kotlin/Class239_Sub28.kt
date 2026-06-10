/* Class239_Sub28 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class239_Sub28 : Class239 {
    internal constructor(class348_sub51: Class348_Sub51) : super(class348_sub51)

    override fun method1714(i: Int, i_17_: Int): Int {
        if (i != 3) method1712(-55, 59)
        anInt6139++
        return 1
    }

    internal constructor(i: Int, class348_sub51: Class348_Sub51) : super(i, class348_sub51)

    override fun method1716(bool: Boolean) {
        if (bool != false) method1847(null, 64)
        anInt6142++
        if (this.anInt3138 != 1 && this.anInt3138 != 0) this.anInt3138 = method1710(20014)
    }

    override fun method1710(i: Int): Int {
        if (i != 20014) return 52
        anInt6138++
        return 1
    }

    fun method1845(i: Int): Int {
        anInt6141++
        if (i != -32350) return -127
        return this.anInt3138
    }

    override fun method1712(i: Int, i_22_: Int) {
        val i_23_ = -89 / ((82 - i) / 35)
        anInt6137++
        this.anInt3138 = i_22_
    }

    companion object {
        @JvmField
        var anInt6134: Int = 0
        @JvmField
        var anInt6135: Int = 0
        @JvmField
        var anInt6136: Int = 0
        @JvmField
        var anInt6137: Int = 0
        @JvmField
        var anInt6138: Int = 0
        @JvmField
        var anInt6139: Int = 0
        @JvmField
        var anInt6140: Int = 0
        @JvmField
        var anInt6141: Int = 0
        @JvmField
        var anInt6142: Int = 0
        @JvmField
        var anInt6143: Int = 0

        @JvmStatic
        fun method1842(i: Int, i_0_: Int, i_1_: Int, i_2_: Int, i_3_: Int, i_4_: Int, i_5_: Int, i_6_: Int, i_7_: Int): Boolean {
            anInt6134++
            if (i_1_ != -1) return false
            if (i_3_ >= i + i_5_ || i_3_ - -i_6_ <= i_5_) return false
            return i_0_ + i_7_ > i_4_ && i_0_ < i_2_ + i_4_
        }

        @JvmStatic
        fun method1843(i: Int, i_8_: Int, class46: Class46, bool: Boolean, i_9_: Int) {
            anInt6135++
            if (i_8_ != -326) method1844(32, -33, false, 1, false, 64, -83)
            val i_10_ = class46.anInt709
            val i_11_ = class46.anInt789
            if (class46.aByte778.toInt() == 0) class46.anInt709 = class46.anInt842
            else if (class46.aByte778.toInt() != 1) {
                if (class46.aByte778.toInt() == 2) class46.anInt709 = class46.anInt842 * i shr 14
            } else class46.anInt709 = -class46.anInt842 + i
            if (class46.aByte724.toInt() != 0) {
                if (class46.aByte724.toInt() != 1) {
                    if (class46.aByte724.toInt() == 2) class46.anInt789 = class46.anInt728 * i_9_ shr 14
                } else class46.anInt789 = i_9_ - class46.anInt728
            } else class46.anInt789 = class46.anInt728
            if (class46.aByte778.toInt() == 4) class46.anInt709 = (class46.anInt789 * class46.anInt710 / class46.anInt775)
            if (class46.aByte724.toInt() == 4) class46.anInt789 = (class46.anInt775 * class46.anInt709 / class46.anInt710)
            if (Class299_Sub2.aBoolean6327 && (Client.method105(class46)!!.anInt7098 != 0 || class46.anInt774 == 0)) {
                if (class46.anInt789 < 5 && class46.anInt709 < 5) {
                    class46.anInt789 = 5
                    class46.anInt709 = 5
                } else {
                    if (class46.anInt789 <= 0) class46.anInt789 = 5
                    if (class46.anInt709 <= 0) class46.anInt709 = 5
                }
            }
            if (Class239_Sub10.anInt5943 == class46.anInt765) Class348_Sub1.aClass46_6561 = class46
            if (bool && class46.anObjectArray727 != null && (i_10_ != class46.anInt709 || (i_11_ != class46.anInt789))) {
                val class348_sub36 = Class348_Sub36()
                class348_sub36.aClass46_6989 = class46
                class348_sub36.anObjectArray6987 = class46.anObjectArray727
                Class348_Sub1_Sub2.aClass262_8810!!.method1999(class348_sub36, -20180)
            }
        }

        @JvmStatic
        fun method1844(i: Int, i_12_: Int, bool: Boolean, i_13_: Int, bool_14_: Boolean, i_15_: Int, i_16_: Int) {
            Class348_Sub42_Sub4.anInt9515 = i_13_
            Class275.anInt3550 = i_16_
            if (bool_14_ == false) {
                Class348_Sub40_Sub31.anInt9406 = i
                anInt6136++
                Class348_Sub35.anInt6981 = i_12_
                Class258_Sub2.anInt8537 = i_15_
                if (bool && Class258_Sub2.anInt8537 >= 100) {
                    Class59_Sub2_Sub2.anInt8685 = 256 + 512 * Class275.anInt3550
                    Class286_Sub4.anInt6246 = 256 + Class348_Sub35.anInt6981 * 512
                    Class305.anInt3855 = (Class275.method2064(Class286_Sub4.anInt6246, Class355.anInt4372, 11219, Class59_Sub2_Sub2.anInt8685) + -Class348_Sub42_Sub4.anInt9515)
                }
                Class348_Sub40_Sub21.anInt9282 = 2
                Class318_Sub1_Sub5_Sub2.anInt10163 = -1
                Class9.anInt167 = Class318_Sub1_Sub5_Sub2.anInt10163
            }
        }

        @JvmStatic
        fun method1846(i: Int, i_18_: Int, i_19_: Int): Boolean {
            if (i_19_ <= 42) return true
            anInt6143++
            return Class278.method2075(i_18_, -126, i) or ((0x40000 and i_18_) != 0) || Class273.method2056(i_18_, 122, i)
        }

        @JvmStatic
        fun method1847(strings: Array<String?>?, i: Int): Array<String?> {
            anInt6140++
            val strings_20_ = arrayOfNulls<String>(5)
            for (i_21_ in i..4) {
                strings_20_[i_21_] = i_21_.toString() + ": "
                if (strings != null && strings[i_21_] != null) strings_20_[i_21_] = strings_20_[i_21_] + strings[i_21_]
            }
            return strings_20_
        }
    }
}
