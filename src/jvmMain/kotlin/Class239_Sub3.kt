/* Class239_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
class Class239_Sub3 : Class239 {
    override fun method1712(i: Int, i_0_: Int) {
        this.anInt3138 = i_0_
        anInt5862++
        val i_1_ = -40 / ((i - 82) / 35)
    }

    fun method1727(i: Int): Int {
        if (i != -32350) anInt5871 = 39
        anInt5869++
        return this.anInt3138
    }

    internal constructor(class348_sub51: Class348_Sub51) : super(class348_sub51)

    override fun method1710(i: Int): Int {
        if (i != 20014) anInt5871 = -72
        anInt5867++
        return 0
    }

    internal constructor(i: Int, class348_sub51: Class348_Sub51) : super(i, class348_sub51)

    fun method1729(i: Int): Boolean {
        if (i <= 85) return true
        anInt5861++
        return true
    }

    override fun method1716(bool: Boolean) {
        anInt5864++
        if (method1735(bool)) {
            if (this.aClass348_Sub51_3136.aClass239_Sub25_7271!!.method1830((-97).toByte()) && !Class151.method1210((-94).toByte(), this.aClass348_Sub51_3136.aClass239_Sub25_7271!!.method1829(-32350))) this.anInt3138 = 1
            if (this.aClass348_Sub51_3136.aClass239_Sub8_7254!!.method1751(-32350) == 1) this.anInt3138 = 1
        }
        if (this.anInt3138 == 3) this.anInt3138 = 2
        if (bool != false) method1716(true)
        if (this.anInt3138 < 0 || this.anInt3138 > 3) this.anInt3138 = method1710(20014)
    }

    override fun method1714(i: Int, i_24_: Int): Int {
        anInt5866++
        if (Class60.method576(i_24_, 29)) {
            if (this.aClass348_Sub51_3136.aClass239_Sub25_7271!!.method1830((-97).toByte()) && !Class151.method1210((-113).toByte(), this.aClass348_Sub51_3136.aClass239_Sub25_7271!!.method1829(-32350))) return 3
            if (this.aClass348_Sub51_3136.aClass239_Sub8_7254!!.method1751(-32350) == 1) return 3
        }
        if (i_24_ == i) return 3
        if (Class60.method576(i_24_, i xor 0x56)) return 2
        return 1
    }

    fun method1735(bool: Boolean): Boolean {
        if (bool != false) anInt5871 = -86
        anInt5858++
        return Class60.method576(this.anInt3138, 29)
    }

    companion object {
        @JvmField
        var anInt5858: Int = 0
        @JvmField
        var anInt5859: Int = 0
        @JvmField
        var anInt5860: Int = 0
        @JvmField
        var anInt5861: Int = 0
        @JvmField
        var anInt5862: Int = 0
        @JvmField
        var anInt5863: Int = 0
        @JvmField
        var anInt5864: Int = 0
        @JvmField
        var anInt5865: Int = 0
        @JvmField
        var anInt5866: Int = 0
        @JvmField
        var anInt5867: Int = 0
        @JvmField
        var anInt5868: Int = 0
        @JvmField
        var anInt5869: Int = 0
        @JvmField
        var anInt5870: Int = 0
        @JvmField
        var anInt5871: Int = 0

        @JvmStatic
        fun method1728(i: Int, i_2_: Int, i_3_: Int, bool: Boolean, i_4_: Int) {
            anInt5860++
            if (Class320.method2547(i_3_, 84.toByte())) Class367_Sub1.method3534(false, i_2_, i_4_, bool, i, (Class348_Sub40_Sub33.aClass46ArrayArray9427!![i_3_]!!))
        }

        @JvmStatic
        fun method1730(i: Int, i_5_: Int, i_6_: Int, i_7_: Int, i_8_: Int, i_9_: Int, i_10_: Int, i_11_: Int) {
            if (i_10_ != -128) method1730(-6, -95, 101, -81, 56, 14, -29, -19)
            anInt5868++
            val i_12_ = -i_9_ + i_5_
            val i_13_ = i_9_ + i_6_
            for (i_14_ in i_6_..<i_13_) Class135_Sub2.method1156(-27, i_7_, Class17.anIntArrayArray255!![i_14_]!!, i_11_, i)
            val i_15_ = i_7_ + -i_9_
            val i_16_ = i_9_ + i_11_
            var i_17_ = i_5_
            while (i_12_ < i_17_) {
                Class135_Sub2.method1156(i_10_ + 101, i_7_, Class17.anIntArrayArray255!![i_17_]!!, i_11_, i)
                i_17_--
            }
            for (i_18_ in i_13_..i_12_) {
                val `is` = Class17.anIntArrayArray255!![i_18_]!!
                Class135_Sub2.method1156(-27, i_16_, `is`, i_11_, i)
                Class135_Sub2.method1156(-27, i_15_, `is`, i_16_, i_8_)
                Class135_Sub2.method1156(-27, i_7_, `is`, i_15_, i)
            }
        }

        @JvmStatic
        fun method1731(i: Int) {
            anInt5863++
            val class348_sub45 = (Class318_Sub1_Sub3.aClass262_8744!!.method1995(i xor 0x5) as Class348_Sub45?)
            val bool = (Class289.aClass46_3701 != null || Class348_Sub42.anInt7059 > 0)
            val i_19_ = class348_sub45!!.method3308((-128).toByte())
            val i_20_ = class348_sub45.method3311(119)
            if (bool) Class282.anInt3655 = 1
            if (!bool) Class325.method2599(109.toByte(), Class316.aClass348_Sub42_Sub12_3963, i_20_, i_19_)
            else Class138.aClass348_Sub42_Sub12_1946 = Class316.aClass348_Sub42_Sub12_3963
            if (i != 1) Companion.method1734(-88, null, (-126).toByte(), false)
        }

        @JvmStatic
        fun method1732(i: Byte, i_21_: Int): Boolean {
            anInt5865++
            val i_22_ = i.toInt() and 0xff
            if (i_22_ == 0) return false
            return i_21_ < (i_22_.inv()) || i_22_ >= 160 || Class44.aCharArray625!![i_22_ + -128].code != 0
        }

        @JvmStatic
        fun method1733(i: Byte, i_23_: Int) {
            anInt5870++
            if (i.toInt() != -78) method1732(80.toByte(), -38)
            val class348_sub42_sub15 = Class318_Sub9_Sub1.method2516(i_23_, 105.toByte(), 11)
            class348_sub42_sub15.method3251(-16058)
        }

        fun method1734(i: Int, var_ha: ha?, i_25_: Byte, bool: Boolean): Class352? {
            try {
                anInt5859++
                if (i == -1) return null
                if (Class348_Sub1.anIntArray6547 != null) {
                    for (i_26_ in Class348_Sub1.anIntArray6547!!.indices) {
                        if (Class348_Sub1.anIntArray6547!![i_26_] == i) return Class199.aClass352Array2636!![i_26_]
                    }
                }
                var class352 = Class332.aClass60_4139!!.method583(i.toLong(), -92) as? Class352?
                if (class352 != null) {
                    if (bool && class352.aClass143_4333 == null) {
                        val class143 = Class239_Sub10.method1766((-76).toByte(), i, s.aClass45_4585!!)
                        if (class143 == null) return null
                        class352.aClass143_4333 = class143
                    }
                    return class352
                }
                val i_27_ = -118 / ((-33 - i_25_) / 44)
                val class207s = Class207.method1523(Class39.aClass45_518!!, i)
                if (class207s == null) return null
                val class143 = Class239_Sub10.method1766((-39).toByte(), i, s.aClass45_4585!!)
                if (class143 == null) return null
                if (!bool) class352 = Class352(var_ha!!.method3686(class143, class207s, true))
                else class352 = Class352(var_ha!!.method3686(class143, class207s, true), class143)
                Class332.aClass60_4139!!.method582(class352, i.toLong(), (-109).toByte())
                return class352
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, ("jaa.K(" + i + ',' + (if (var_ha != null) "{...}" else "null") + ',' + i_25_ + ',' + bool + ')'))
            }
        }
    }
}
