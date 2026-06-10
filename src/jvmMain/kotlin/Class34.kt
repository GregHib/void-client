import java.awt.Frame

class Class34 {
    private val anIntArray464 = intArrayOf(-1, -1, -1, -1, -1)
    private var aShortArray465: ShortArray? = null
    private var anIntArray472: IntArray? = null
    private var aShortArray474: ShortArray? = null
    @JvmField
    var aClass150_475: Class150? = null
    private lateinit var aShortArray477: ShortArray
    private lateinit var aShortArray480: ShortArray

    fun method341(i: Int): Class124? {
        anInt468++
        if (anIntArray472 == null) return null
        val class124s = arrayOfNulls<Class124>(anIntArray472!!.size)
        synchronized(this.aClass150_475!!.aClass45_2054!!) {
            for (i_0_ in anIntArray472!!.indices) class124s[i_0_] = Class300.method2277(0, (this.aClass150_475!!.aClass45_2054!!), anIntArray472!![i_0_], -1)
        }
        var i_1_ = 0
        while (anIntArray472!!.size > i_1_) {
            if (class124s[i_1_]!!.anInt1830 < 13) class124s[i_1_]!!.method1092(2, 113)
            i_1_++
        }
        val class124: Class124?
        if (class124s.size != 1) class124 = Class124(class124s, class124s.size)
        else class124 = class124s[0]
        if (class124 == null) return null
        if (i < 53) method341(-22)
        if (aShortArray474 != null) {
            for (i_2_ in aShortArray474!!.indices) class124.method1098(aShortArray474!![i_2_], 126.toByte(), aShortArray480[i_2_])
        }
        if (aShortArray465 != null) {
            for (i_3_ in aShortArray465!!.indices) class124.method1095(aShortArray465!![i_3_], 0, aShortArray477[i_3_])
        }
        return class124
    }

    fun method342(i: Byte): Boolean {
        anInt470++
        var bool = true
        synchronized(this.aClass150_475!!.aClass45_2054!!) {
            for (i_4_ in 0..4) {
                if (anIntArray464[i_4_] != -1 && !this.aClass150_475!!.aClass45_2054!!.method420(-10499, anIntArray464[i_4_], 0)) bool = false
            }
            if (i <= 87) method351(96)
        }
        return bool
    }

    fun method343(i: Byte): Class124? {
        anInt471++
        val class124s = arrayOfNulls<Class124>(5)
        var i_5_ = 0
        synchronized(this.aClass150_475!!.aClass45_2054!!) {
            for (i_6_ in 0..4) {
                if (anIntArray464[i_6_] != -1) class124s[i_5_++] = Class300.method2277(0, (this.aClass150_475!!.aClass45_2054!!), anIntArray464[i_6_], -1)
            }
        }
        for (i_7_ in 0..4) {
            if (class124s[i_7_] != null && class124s[i_7_]!!.anInt1830 < 13) class124s[i_7_]!!.method1092(2, 99)
        }
        if (i > -27) return null
        val class124 = Class124(class124s, i_5_)
        if (aShortArray474 != null) {
            var i_8_ = 0
            while (aShortArray474!!.size > i_8_) {
                class124.method1098(aShortArray474!![i_8_], 126.toByte(), aShortArray480[i_8_])
                i_8_++
            }
        }
        if (aShortArray465 != null) {
            var i_9_ = 0
            while (aShortArray465!!.size > i_9_) {
                class124.method1095(aShortArray465!![i_9_], 0, aShortArray477[i_9_])
                i_9_++
            }
        }
        return class124
    }

    private fun method344(i: Int, class348_sub49: Class348_Sub49, i_10_: Byte) {
        if (i != 1) {
            if (i == 2) {
                val i_11_ = class348_sub49.readUnsignedByte(i_10_ + 320)
                anIntArray472 = IntArray(i_11_)
                for (i_12_ in 0..<i_11_) anIntArray472!![i_12_] = class348_sub49.readUnsignedShort(842397944)
            } else if (i != 3) {
                if (i == 40) {
                    val i_13_ = class348_sub49.readUnsignedByte(i_10_.toInt() xor 0xbf.inv())
                    aShortArray480 = ShortArray(i_13_)
                    aShortArray474 = ShortArray(i_13_)
                    for (i_14_ in 0..<i_13_) {
                        aShortArray474!![i_14_] = class348_sub49.readUnsignedShort(842397944).toShort()
                        aShortArray480[i_14_] = class348_sub49.readUnsignedShort(842397944).toShort()
                    }
                } else if (i == 41) {
                    val i_15_ = class348_sub49.readUnsignedByte(255)
                    aShortArray465 = ShortArray(i_15_)
                    aShortArray477 = ShortArray(i_15_)
                    var i_16_ = 0
                    while (i_15_ > i_16_) {
                        aShortArray465!![i_16_] = class348_sub49.readUnsignedShort(i_10_ + 842398009).toShort()
                        aShortArray477[i_16_] = class348_sub49.readUnsignedShort(842397944).toShort()
                        i_16_++
                    }
                } else if (i >= 60 && i < 70) anIntArray464[i + -60] = class348_sub49.readUnsignedShort(842397944)
            }
        } else class348_sub49.readUnsignedByte(i_10_ + 320)
        anInt479++
        if (i_10_.toInt() != -65) aLong482 = -90L
    }

    fun method346(i: Int, class348_sub49: Class348_Sub49) {
        anInt467++
        while (true) {
            val i_18_ = class348_sub49.readUnsignedByte(255)
            if (i_18_ == 0) break
            method344(i_18_, class348_sub49, (-65).toByte())
        }
        val i_19_ = -5 / ((73 - i) / 49)
    }

    fun method348(i: Byte): Boolean {
        anInt478++
        if (i.toInt() != 34) method348((-15).toByte())
        if (anIntArray472 == null) return true
        var bool = true
        synchronized(this.aClass150_475!!.aClass45_2054!!) {
            var i_31_ = 0
            while (anIntArray472!!.size > i_31_) {
                if (!this.aClass150_475!!.aClass45_2054!!.method420(-10499, anIntArray472!![i_31_], 0)) bool = false
                i_31_++
            }
        }
        return bool
    }

    companion object {
        @JvmField
        var anInt462: Int = 0
        @JvmField
        var aClass60_463: Class60? = Class60(8)
        @JvmField
        var anInt466: Int = 0
        @JvmField
        var anInt467: Int = 0
        @JvmField
        var anInt468: Int = 0
        @JvmField
        var anInt469: Int = 0
        @JvmField
        var anInt470: Int = 0
        @JvmField
        var anInt471: Int = 0
        @JvmField
        var anInt473: Int = 0
        @JvmField
        var aFrame476: Frame? = null
        @JvmField
        var anInt478: Int = 0
        @JvmField
        var anInt479: Int = 0
        @JvmField
        var anInt481: Int
        @JvmField
        var aLong482: Long = -1L

        @JvmStatic
        fun method345(i: Int, i_17_: Byte) {
            anInt469++
            if (Class348_Sub43.anInt7068 == 0) Class98.aClass348_Sub16_Sub3_1564!!.method2861(0, i)
            else Class58.anInt1059 = i
            if (i_17_ > -26) method349(-111)
        }

        @JvmStatic
        fun method347(`is`: IntArray?, is_20_: IntArray?, i: Int, i_21_: Int, i_22_: Int) {
            do {
                try {
                    anInt473++
                    if (i_21_ != -22222) aClass60_463 = null
                    if (i >= i_22_) break
                    val i_23_ = (i - -i_22_) / 2
                    var i_24_ = i
                    val i_25_ = `is`!![i_23_]
                    `is`[i_23_] = `is`[i_22_]
                    `is`[i_22_] = i_25_
                    val i_26_ = is_20_!![i_23_]
                    is_20_[i_23_] = is_20_[i_22_]
                    is_20_[i_22_] = i_26_
                    val i_27_ = if (i_25_ == 2147483647) 0 else 1
                    for (i_28_ in i..<i_22_) {
                        if (`is`[i_28_] < (i_28_ and i_27_) + i_25_) {
                            val i_29_ = `is`[i_28_]
                            `is`[i_28_] = `is`[i_24_]
                            `is`[i_24_] = i_29_
                            val i_30_ = is_20_[i_28_]
                            is_20_[i_28_] = is_20_[i_24_]
                            is_20_[i_24_++] = i_30_
                        }
                    }
                    `is`[i_22_] = `is`[i_24_]
                    `is`[i_24_] = i_25_
                    is_20_[i_22_] = is_20_[i_24_]
                    is_20_[i_24_] = i_26_
                    method347(`is`, is_20_, i, -22222, -1 + i_24_)
                    method347(`is`, is_20_, i_24_ - -1, i_21_, i_22_)
                } catch (runtimeexception: RuntimeException) {
                    throw Class348_Sub17.method2929(runtimeexception, ("ic.K(" + (if (`is` != null) "{...}" else "null") + ',' + (if (is_20_ != null) "{...}" else "null") + ',' + i + ',' + i_21_ + ',' + i_22_ + ')'))
                }
                break
            } while (false)
        }

        @JvmStatic
        fun method349(i: Int) {
            anInt462++
            val i_32_ = Class328_Sub1.anInt6513
            val `is` = Class286_Sub7.anIntArray6290
            for (i_33_ in 0..<i_32_) {
                val player = Class294.aPlayerArray5058!![`is`!![i_33_]]
                if (player != null) Class322.method2556(false, player.method2436(60.toByte()), player)
            }
            if (i != 4740) method347(null, null, 79, -21, 64)
        }

        fun method350(i: Int, i_34_: Int, i_35_: Int, i_36_: Int, i_37_: Int) {
            anInt466++
            val class348_sub42_sub15 = Class318_Sub9_Sub1.method2516(i_36_, 105.toByte(), 10)
            class348_sub42_sub15.method3246(-25490)
            class348_sub42_sub15.anInt9651 = i_34_
            val i_38_ = 112 % ((i_35_ - 76) / 44)
            class348_sub42_sub15.anInt9650 = i_37_
            class348_sub42_sub15.anInt9652 = i
        }

        @JvmStatic
        fun method351(i: Int) {
            aClass60_463 = null
            val i_39_ = 90 / ((i - 19) / 43)
            aFrame476 = null
        }

        init {
            anInt481 = -1
        }
    }
}
