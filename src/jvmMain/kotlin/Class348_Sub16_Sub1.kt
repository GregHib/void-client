import Class375.method3612

/* Class348_Sub16_Sub1 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class348_Sub16_Sub1 internal constructor(private val aClass348_Sub16_Sub3_8852: Class348_Sub16_Sub3) : Class348_Sub16() {
    var aClass262_8848: Class262 = Class262()
    var aClass348_Sub16_Sub4_8855: Class348_Sub16_Sub4 = Class348_Sub16_Sub4()
    override fun method2818(): Class348_Sub16? {
        anInt8856++
        var class348_sub43: Class348_Sub43?
        do {
            class348_sub43 = this.aClass262_8848.method1990(122.toByte()) as Class348_Sub43?
            if (class348_sub43 == null) return null
        } while (class348_sub43.aClass348_Sub16_Sub5_7081 == null)
        return class348_sub43.aClass348_Sub16_Sub5_7081
    }

    override fun method2817(`is`: IntArray, i: Int, i_0_: Int) {
        anInt8847++
        this.aClass348_Sub16_Sub4_8855.method2817(`is`, i, i_0_)
        var class348_sub43 = (this.aClass262_8848.method1995(4) as Class348_Sub43?)
        while_125_@ while (class348_sub43 != null) {
            if (!aClass348_Sub16_Sub3_8852.method2847(-107, class348_sub43)) {
                var i_1_ = i
                var i_2_ = i_0_
                while (class348_sub43!!.anInt7086 < i_2_) {
                    method2825(i_1_ + i_2_, class348_sub43, i_1_, (-114).toByte(), class348_sub43.anInt7086, `is`)
                    i_1_ += class348_sub43.anInt7086
                    i_2_ -= class348_sub43.anInt7086
                    if (aClass348_Sub16_Sub3_8852.method2852(`is`, i_2_, class348_sub43, i_1_, (-4).toByte())) {
                        class348_sub43 = this.aClass262_8848.method1990(121.toByte()) as Class348_Sub43?
                        continue@while_125_
                    }
                }
                method2825(i_1_ + i_2_, class348_sub43, i_1_, (-114).toByte(), i_2_, `is`)
                class348_sub43.anInt7086 -= i_2_
            }
            class348_sub43 = this.aClass262_8848.method1990(121.toByte()) as Class348_Sub43?
        }
    }

    private fun method2824(i: Int, i_4_: Byte, class348_sub43: Class348_Sub43) {
        var i = i
        if (((aClass348_Sub16_Sub3_8852.anIntArray8895[class348_sub43.anInt7067]) and 0x4) != 0 && (class348_sub43.anInt7087 < 0)) {
            val i_5_ = ((aClass348_Sub16_Sub3_8852.anIntArray8906!![class348_sub43.anInt7067]) / Class22.anInt339)
            val i_6_ = ((-class348_sub43.anInt7082 + (1048575 + i_5_)) / i_5_)
            class348_sub43.anInt7082 = (i_5_ * i + class348_sub43.anInt7082 and 0xfffff)
            if (i_6_ <= i) {
                if ((aClass348_Sub16_Sub3_8852.anIntArray8914[class348_sub43.anInt7067]) != 0) {
                    class348_sub43.aClass348_Sub16_Sub5_7081 = (Class348_Sub16_Sub5.Companion.method2911((class348_sub43.aClass348_Sub19_Sub1_7077!!), class348_sub43.aClass348_Sub16_Sub5_7081!!.method2914(), 0, class348_sub43.aClass348_Sub16_Sub5_7081!!.method2892()))
                    aClass348_Sub16_Sub3_8852.method2874(95, (class348_sub43.aClass348_Sub17_7085!!.aShortArray6795!![class348_sub43.anInt7071]) < 0, class348_sub43)
                } else class348_sub43.aClass348_Sub16_Sub5_7081 = (Class348_Sub16_Sub5.Companion.method2911((class348_sub43.aClass348_Sub19_Sub1_7077!!), class348_sub43.aClass348_Sub16_Sub5_7081!!.method2914(), class348_sub43.aClass348_Sub16_Sub5_7081!!.method2906(), class348_sub43.aClass348_Sub16_Sub5_7081!!.method2892()))
                if ((class348_sub43.aClass348_Sub17_7085!!.aShortArray6795!![class348_sub43.anInt7071]) < 0) class348_sub43.aClass348_Sub16_Sub5_7081!!.method2917(-1)
                i = class348_sub43.anInt7082 / i_5_
            }
        }
        anInt8849++
        val i_7_ = -70 / ((14 - i_4_) / 61)
        class348_sub43.aClass348_Sub16_Sub5_7081!!.method2819(i)
    }

    override fun method2821(): Int {
        anInt8858++
        return 0
    }

    override fun method2819(i: Int) {
        this.aClass348_Sub16_Sub4_8855.method2819(i)
        anInt8850++
        var class348_sub43 = (this.aClass262_8848.method1995(4) as Class348_Sub43?)
        while_127_@ while (class348_sub43 != null) {
            if (!aClass348_Sub16_Sub3_8852.method2847(53, class348_sub43)) {
                var i_8_ = i
                while (i_8_ > class348_sub43!!.anInt7086) {
                    method2824(class348_sub43.anInt7086, 115.toByte(), class348_sub43)
                    i_8_ -= class348_sub43.anInt7086
                    if (aClass348_Sub16_Sub3_8852.method2852(null, i_8_, class348_sub43, 0, (-4).toByte())) {
                        class348_sub43 = this.aClass262_8848.method1990(38.toByte()) as Class348_Sub43?
                        continue@while_127_
                    }
                }
                method2824(i_8_, 84.toByte(), class348_sub43)
                class348_sub43.anInt7086 -= i_8_
            }
            class348_sub43 = this.aClass262_8848.method1990(38.toByte()) as Class348_Sub43?
        }
    }

    private fun method2825(i: Int, class348_sub43: Class348_Sub43?, i_9_: Int, i_10_: Byte, i_11_: Int, `is`: IntArray) {
        var i_9_ = i_9_
        var i_11_ = i_11_
        try {
            anInt8859++
            if (i_10_.toInt() != -114) method2821()
            if ((0x4 and (aClass348_Sub16_Sub3_8852.anIntArray8895[class348_sub43!!.anInt7067])) != 0 && (class348_sub43.anInt7087 < 0)) {
                val i_12_ = ((aClass348_Sub16_Sub3_8852.anIntArray8906!![class348_sub43.anInt7067]) / Class22.anInt339)
                while (true) {
                    val i_13_ = ((i_12_ + (1048575 + -class348_sub43.anInt7082)) / i_12_)
                    if (i_13_ > i_11_) break
                    class348_sub43.aClass348_Sub16_Sub5_7081!!.method2817(`is`, i_9_, i_13_)
                    i_9_ += i_13_
                    class348_sub43.anInt7082 += -1048576 + i_12_ * i_13_
                    i_11_ -= i_13_
                    var i_14_ = Class22.anInt339 / 100
                    val i_15_ = 262144 / i_12_
                    if (i_15_ < i_14_) i_14_ = i_15_
                    val class348_sub16_sub5 = (class348_sub43.aClass348_Sub16_Sub5_7081)!!
                    if ((aClass348_Sub16_Sub3_8852.anIntArray8914[class348_sub43.anInt7067]) != 0) {
                        class348_sub43.aClass348_Sub16_Sub5_7081 = (Class348_Sub16_Sub5.Companion.method2911((class348_sub43.aClass348_Sub19_Sub1_7077!!), class348_sub16_sub5.method2914(), 0, class348_sub16_sub5.method2892()))
                        aClass348_Sub16_Sub3_8852.method2874(116, ((class348_sub43.aClass348_Sub17_7085!!.aShortArray6795!![class348_sub43.anInt7071]) < 0), class348_sub43)
                        class348_sub43.aClass348_Sub16_Sub5_7081!!.method2916(i_14_, class348_sub16_sub5.method2906())
                    } else class348_sub43.aClass348_Sub16_Sub5_7081 = (Class348_Sub16_Sub5.Companion.method2911((class348_sub43.aClass348_Sub19_Sub1_7077!!), class348_sub16_sub5.method2914(), class348_sub16_sub5.method2906(), class348_sub16_sub5.method2892()))
                    if ((class348_sub43.aClass348_Sub17_7085!!.aShortArray6795!![class348_sub43.anInt7071]) < 0) class348_sub43.aClass348_Sub16_Sub5_7081!!.method2917(-1)
                    class348_sub16_sub5.method2902(i_14_)
                    class348_sub16_sub5.method2817(`is`, i_9_, -i_9_ + i)
                    if (class348_sub16_sub5.method2895()) this.aClass348_Sub16_Sub4_8855.method2883(class348_sub16_sub5)
                }
                class348_sub43.anInt7082 += i_11_ * i_12_
            }
            class348_sub43.aClass348_Sub16_Sub5_7081!!.method2817(`is`, i_9_, i_11_)
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("bea.H(" + i + ',' + (if (class348_sub43 != null) "{...}" else "null") + ',' + i_9_ + ',' + i_10_ + ',' + i_11_ + ',' + (if (`is` != null) "{...}" else "null") + ')'))
        }
    }

    override fun method2816(): Class348_Sub16? {
        anInt8851++
        val class348_sub43 = (this.aClass262_8848.method1995(4) as Class348_Sub43?)
        if (class348_sub43 == null) return null
        if (class348_sub43.aClass348_Sub16_Sub5_7081 != null) return class348_sub43.aClass348_Sub16_Sub5_7081
        return method2818()
    }

    companion object {
        @JvmField
        var anInt8845: Int = 0
        @JvmField
        var anInt8846: Int = 0
        @JvmField
        var anInt8847: Int = 0
        @JvmField
        var anInt8849: Int = 0
        @JvmField
        var anInt8850: Int = 0
        @JvmField
        var anInt8851: Int = 0
        @JvmField
        var aClass74_8853: Class74? = Class74(11, 8)
        @JvmField
        var anInt8854: Int = 0
        @JvmField
        var anInt8856: Int = 0
        @JvmField
        var aClass351_8857: Class351? = Class351(54, 15)
        @JvmField
        var anInt8858: Int = 0
        @JvmField
        var anInt8859: Int = 0

        fun method2822(i: Int, class348_sub49_sub2: Class348_Sub49_Sub2, i_3_: Int) {
            Class101_Sub3.anInt5768 = 0
            anInt8846++
            Class55.aBoolean979 = false
            if (i < -17) {
                Class348_Sub40_Sub18.method3094(-21478, class348_sub49_sub2)
                method3612(75, class348_sub49_sub2)
                if (Class55.aBoolean979) println("---endgpp---")
                if (class348_sub49_sub2.anInt7197 != i_3_) throw RuntimeException("gpi1 pos:" + class348_sub49_sub2.anInt7197 + " psize:" + i_3_)
            }
        }

        @JvmStatic
        fun method2823(i: Int) {
            if (i != 0) method2823(33)
            aClass351_8857 = null
            aClass74_8853 = null
        }

        @JvmStatic
        fun method2826(i: Int): Class47? {
            anInt8845++
            try {
                return Class47_Sub2()
            } catch (throwable: Throwable) {
                if (i != 15) return null
                return Class47_Sub1()
            }
        }
    }
}
