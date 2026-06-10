/* Class239_Sub26 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class239_Sub26 : Class239 {
    override fun method1710(i: Int): Int {
        if (i != 20014) return 112
        anInt6116++
        return 127
    }

    override fun method1716(bool: Boolean) {
        if (bool != false) anInt6115 = 87
        if (this.anInt3138 < 0 && this.anInt3138 > 127) this.anInt3138 = method1710(20014)
        anInt6117++
    }

    override fun method1714(i: Int, i_5_: Int): Int {
        anInt6124++
        return 1
    }

    internal constructor(i: Int, class348_sub51: Class348_Sub51) : super(i, class348_sub51)

    override fun method1712(i: Int, i_16_: Int) {
        val i_17_ = 63 % ((i - 82) / 35)
        anInt6119++
        this.anInt3138 = i_16_
    }

    internal constructor(class348_sub51: Class348_Sub51) : super(class348_sub51)

    fun method1838(i: Int): Int {
        anInt6123++
        return this.anInt3138
    }

    companion object {
        @JvmField
        var aClass54Array6114: Array<Class54?>?
        @JvmField
        var anInt6115: Int = 0
        @JvmField
        var anInt6116: Int = 0
        @JvmField
        var anInt6117: Int = 0
        @JvmField
        var anInt6118: Int = 0
        @JvmField
        var anInt6119: Int = 0
        @JvmField
        var aFloat6120: Float = 1.0f
        @JvmField
        var aClass114_6121: Class114?
        @JvmField
        var anInt6122: Int = 0
        @JvmField
        var anInt6123: Int = 0
        @JvmField
        var anInt6124: Int = 0
        @JvmField
        var anInt6125: Int = 0
        @JvmField
        var anInt6126: Int = 0

        @JvmStatic
        fun method1833(i: Byte, i_0_: Int, i_1_: Int): Boolean {
            anInt6126++
            return (i_0_ and 0x84080) != 0
        }

        @JvmStatic
        fun method1834(class318_sub1_sub3_sub3: Class318_Sub1_Sub3_Sub3, i: Byte) {
            anInt6125++
            val i_2_ = (class318_sub1_sub3_sub3.anInt10239 - Class367_Sub11.anInt7396)
            if (i < 0) {
                val i_3_ = ((class318_sub1_sub3_sub3.anInt10293) * 512 + 256 * class318_sub1_sub3_sub3.method2436(73.toByte()))
                val i_4_ = (512 * (class318_sub1_sub3_sub3.anInt10314) - -(class318_sub1_sub3_sub3.method2436(114.toByte()) * 256))
                class318_sub1_sub3_sub3.anInt10326 = 0
                class318_sub1_sub3_sub3.y += ((i_4_ + -class318_sub1_sub3_sub3.y) / i_2_)
                class318_sub1_sub3_sub3.x += ((i_3_ + -class318_sub1_sub3_sub3.x) / i_2_)
                if (class318_sub1_sub3_sub3.anInt10231 == 0) class318_sub1_sub3_sub3.method2440(49.toByte(), 8192)
                if (class318_sub1_sub3_sub3.anInt10231 == 1) class318_sub1_sub3_sub3.method2440(49.toByte(), 12288)
                if (class318_sub1_sub3_sub3.anInt10231 == 2) class318_sub1_sub3_sub3.method2440(49.toByte(), 0)
                if (class318_sub1_sub3_sub3.anInt10231 == 3) class318_sub1_sub3_sub3.method2440(49.toByte(), 4096)
            }
        }

        @JvmStatic
        fun method1835(i: Int) {
            aClass54Array6114 = null
            aClass114_6121 = null
            if (i != -28594) anInt6115 = -7
        }

        @JvmStatic
        fun method1836(i: Int, i_6_: Int, bool: Boolean, string: String): Int {
            anInt6118++
            require(!(i_6_ < 2 || i_6_ > 36)) { "Invalid radix:" + i_6_ }
            var bool_7_ = false
            var bool_8_ = false
            var i_9_ = 0
            if (i != -123) method1837(-93, 121, 38)
            val i_10_ = string.length
            for (i_11_ in 0..<i_10_) {
                var i_12_ = string.get(i_11_).code
                if (i_11_ == 0) {
                    if (i_12_ == 45) {
                        bool_7_ = true
                        continue
                    }
                    if (i_12_ == 43 && bool) continue
                }
                if (i_12_ >= 48 && i_12_ <= 57) i_12_ -= 48
                else if (i_12_ >= 65 && i_12_ <= 90) i_12_ -= 55
                else if (i_12_ >= 97 && i_12_ <= 122) i_12_ -= 87
                else throw NumberFormatException()
                if (i_12_ >= i_6_) throw NumberFormatException()
                if (bool_7_) i_12_ = -i_12_
                val i_13_ = i_6_ * i_9_ - -i_12_
                if (i_9_ != i_13_ / i_6_) throw NumberFormatException()
                bool_8_ = true
                i_9_ = i_13_
            }
            if (!bool_8_) throw NumberFormatException()
            return i_9_
        }

        @JvmStatic
        fun method1837(i: Int, i_14_: Int, i_15_: Int): Boolean {
            if (i_14_ < 41) aClass114_6121 = null
            anInt6122++
            return (i_15_ and 0x800) != 0
        }

        init {
            aClass54Array6114 = arrayOfNulls<Class54>(6)
            aClass114_6121 = Class114(32, 6)
        }
    }
}
