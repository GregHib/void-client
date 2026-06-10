import java.net.URL
import kotlin.math.max
import kotlin.math.pow
import kotlin.math.sin

class Class348_Sub16_Sub3 : Class348_Sub16 {
    private val aClass356_8891: Class356
    private val anIntArray8894: IntArray
    var anIntArray8895: IntArray
    private val anIntArray8896: IntArray
    private val anIntArray8899: IntArray
    private var anIntArray8902: IntArray?
    private val anIntArray8904: IntArray
    var anIntArray8906: IntArray?
    var anIntArray8914: IntArray
    private val aClass348_Sub43ArrayArray8915: Array<Array<Class348_Sub43?>?>
    private var anIntArray8916: IntArray?
    private val anInt8921: Int
    private val anIntArray8925: IntArray
    private val aClass348_Sub43ArrayArray8928: Array<Array<Class348_Sub43?>?>
    private var anInt8933: Int
    private var anIntArray8937: IntArray?
    private val anIntArray8939: IntArray
    private var anIntArray8942: IntArray?
    private var aClass204_8944: Class204?
    private val anIntArray8945: IntArray
    private var anIntArray8947: IntArray?
    private val anIntArray8953: IntArray
    private var anInt8956 = 0
    private var aLong8957: Long = 0
    private var aClass348_Sub16_Sub1_8958: Class348_Sub16_Sub1?
    private var aLong8959: Long = 0
    private var anInt8960 = 0
    private var aBoolean8961 = false
    private val anInt8962 = 0
    private var aClass348_Sub2_8963: Class348_Sub2? = null
    private val aBoolean8964 = false

    @Synchronized
    override fun method2818(): Class348_Sub16? {
        anInt8946++
        return null
    }

    @Synchronized
    private fun method2840(bool: Boolean, i: Byte) {
        aClass204_8944!!.method1487()
        anInt8950++
        aClass348_Sub2_8963 = null
        method2851(true, bool)
        if (i >= -74) method2879(-43, 88, -33)
    }

    @Synchronized
    fun method2841(i: Int, i_2_: Int, i_3_: Int) {
        if (i_2_ < -34) {
            anInt8935++
            method2854(i_3_, i, 98)
        }
    }

    private fun method2842(i: Int, i_4_: Int) {
        anInt8922++
        var i_5_ = i_4_ and 0xf0
        if (i_5_ == 128) {
            val i_6_ = i_4_ and 0xf
            val i_7_ = (0x7f44 and i_4_) shr 8
            val i_8_ = (0x7f9fe0 and i_4_) shr 16
            method2849(i_8_, i_7_, 97.toByte(), i_6_)
        } else if (i_5_ == 144) {
            val i_9_ = 0xf and i_4_
            val i_10_ = 0x7f and (i_4_ shr 8)
            val i_11_ = 0x7f and (i_4_ shr 16)
            if (i_11_ <= 0) method2849(64, i_10_, 74.toByte(), i_9_)
            else method2853(0, i_11_, i_10_, i_9_)
        } else if (i_5_ == 160) {
            val i_12_ = 0xf and i_4_
            val i_13_ = i_4_ shr 8 and 0x7f
            val i_14_ = (i_4_ and 0x7fba60) shr 16
            method2863(i_14_, 90, i_12_, i_13_)
        } else if (i_5_ == 176) {
            val i_15_ = 0xf and i_4_
            val i_16_ = (0x7f93 and i_4_) shr 8
            val i_17_ = 0x7f and (i_4_ shr 16)
            if (i_16_ == 0) anIntArray8947!![i_15_] = ((i_17_ shl 14) + Class139.method1166(anIntArray8947!![i_15_], -2080769))
            if (i_16_ == 32) anIntArray8947!![i_15_] = ((i_17_ shl 7) + Class139.method1166(anIntArray8947!![i_15_], -16257))
            if (i_16_ == 1) anIntArray8899[i_15_] = (Class139.method1166(-16257, anIntArray8899[i_15_]) + (i_17_ shl 7))
            if (i_16_ == 33) anIntArray8899[i_15_] = (Class139.method1166(anIntArray8899[i_15_], -128) - -i_17_)
            if (i_16_ == 5) anIntArray8939[i_15_] = (Class139.method1166(anIntArray8939[i_15_], -16257) - -(i_17_ shl 7))
            if (i_16_ == 37) anIntArray8939[i_15_] = i_17_ + Class139.method1166(-128, anIntArray8939[i_15_])
            if (i_16_ == 7) anIntArray8953[i_15_] = ((i_17_ shl 7) + Class139.method1166(-16257, anIntArray8953[i_15_]))
            if (i_16_ == 39) anIntArray8953[i_15_] = i_17_ + Class139.method1166(anIntArray8953[i_15_], -128)
            if (i_16_ == 10) anIntArray8894[i_15_] = ((i_17_ shl 7) + Class139.method1166(anIntArray8894[i_15_], -16257))
            if (i_16_ == 42) anIntArray8894[i_15_] = i_17_ + Class139.method1166(anIntArray8894[i_15_], -128)
            if (i_16_ == 11) anIntArray8896[i_15_] = ((i_17_ shl 7) + Class139.method1166(-16257, anIntArray8896[i_15_]))
            if (i_16_ == 43) anIntArray8896[i_15_] = (Class139.method1166(-128, anIntArray8896[i_15_]) - -i_17_)
            if (i_16_ == 64) {
                if (i_17_ < 64) this.anIntArray8895[i_15_] = Class139.method1166((this.anIntArray8895[i_15_]), -2)
                else this.anIntArray8895[i_15_] = Class273.method2057((this.anIntArray8895[i_15_]), 1)
            }
            if (i_16_ == 65) {
                if (i_17_ >= 64) this.anIntArray8895[i_15_] = Class273.method2057((this.anIntArray8895[i_15_]), 2)
                else {
                    method2858(-106, i_15_)
                    this.anIntArray8895[i_15_] = Class139.method1166((this.anIntArray8895[i_15_]), -3)
                }
            }
            if (i_16_ == 99) anIntArray8904[i_15_] = ((i_17_ shl 7) + Class139.method1166(127, anIntArray8904[i_15_]))
            if (i_16_ == 98) anIntArray8904[i_15_] = (Class139.method1166(16256, anIntArray8904[i_15_]) + i_17_)
            if (i_16_ == 101) anIntArray8904[i_15_] = (16384 - -Class139.method1166(anIntArray8904[i_15_], 127) + (i_17_ shl 7))
            if (i_16_ == 100) anIntArray8904[i_15_] = i_17_ + (Class139.method1166(16256, anIntArray8904[i_15_]) + 16384)
            if (i_16_ == 120) method2872(2005674600, i_15_)
            if (i_16_ == 121) method2865(0, i_15_)
            if (i_16_ == 123) method2855(i_15_, (-70).toByte())
            if (i_16_ == 6) {
                val i_18_ = anIntArray8904[i_15_]
                if (i_18_ == 16384) anIntArray8902!![i_15_] = ((i_17_ shl 7) + Class139.method1166(anIntArray8902!![i_15_], -16257))
            }
            if (i_16_ == 38) {
                val i_19_ = anIntArray8904[i_15_]
                if (i_19_ == 16384) anIntArray8902!![i_15_] = i_17_ + Class139.method1166(-128, anIntArray8902!![i_15_])
            }
            if (i_16_ == 16) this.anIntArray8914[i_15_] = (Class139.method1166(-16257, (this.anIntArray8914[i_15_])) + (i_17_ shl 7))
            if (i_16_ == 48) this.anIntArray8914[i_15_] = Class139.method1166((this.anIntArray8914[i_15_]), -128) - -i_17_
            if (i_16_ == 81) {
                if (i_17_ >= 64) this.anIntArray8895[i_15_] = Class273.method2057((this.anIntArray8895[i_15_]), 4)
                else {
                    method2850(i_15_, 0)
                    this.anIntArray8895[i_15_] = Class139.method1166((this.anIntArray8895[i_15_]), -5)
                }
            }
            if (i_16_ == 17) method2857(i_15_, 125, (i_17_ shl 7) + (0x3f80.inv() and anIntArray8942!![i_15_]))
            if (i_16_ == 49) method2857(i_15_, 125, i_17_ + (0x7f.inv() and anIntArray8942!![i_15_]))
        } else if (i_5_ == 192) {
            val i_20_ = i_4_ and 0xf
            val i_21_ = 0x7f and (i_4_ shr 8)
            method2873((-21).toByte(), anIntArray8947!![i_20_] + i_21_, i_20_)
        } else if (i_5_ == 208) {
            val i_22_ = 0xf and i_4_
            val i_23_ = (0x7f48 and i_4_) shr 8
            method2859(i_22_, i_23_, -32)
        } else {
            if (i < 54) anInt8956 = -51
            if (i_5_ == 224) {
                val i_24_ = 0xf and i_4_
                val i_25_ = ((0x7f and (i_4_ shr 8)) + ((0x7f0064 and i_4_) shr 9))
                method2875(i_24_, 2, i_25_)
            } else {
                i_5_ = 0xff and i_4_
                if (i_5_ == 255) method2851(true, true)
            }
        }
    }

    @Synchronized
    fun method2843(i: Int, i_26_: Int, i_27_: Int) {
        if (i_26_ < 0) {
            for (i_28_ in 0..15) anIntArray8925[i_28_] = i
        } else anIntArray8925[i_26_] = i
        anInt8907++
        if (i_27_ != -7836) method2843(41, 73, 85)
    }

    fun method2844(i: Byte): Int {
        val i_29_ = -88 / ((8 - i) / 40)
        anInt8892++
        return anInt8933
    }

    private fun method2845(i: Int, class348_sub43: Class348_Sub43?): Int {
        try {
            if (i != 0) anInt8956 = 53
            anInt8934++
            var i_30_ = (class348_sub43!!.anInt7080 - -((class348_sub43.anInt7072 * class348_sub43.anInt7089) shr 12))
            i_30_ += (((anIntArray8937!![class348_sub43.anInt7067]) - 8192) * anIntArray8902!![(class348_sub43.anInt7067)]) shr 12
            val class23 = class348_sub43.aClass23_7075!!
            if (class23.anInt352 > 0 && (class23.anInt353 > 0 || (anIntArray8899[class348_sub43.anInt7067]) > 0)) {
                var i_31_ = class23.anInt353 shl 2
                val i_32_ = class23.anInt346 shl 1
                if (i_32_ > class348_sub43.anInt7083) i_31_ = (i_31_ * class348_sub43.anInt7083 / i_32_)
                i_31_ += anIntArray8899[(class348_sub43.anInt7067)] shr 7
                val d = sin(((class348_sub43.anInt7076) and 0x1ff).toDouble() * 0.01227184630308513)
                i_30_ += (d * i_31_.toDouble()).toInt()
            }
            val i_33_ = (((class348_sub43.aClass348_Sub19_Sub1_7077!!.anInt8988 * 256).toDouble() * 2.0.pow(3.255208333333333E-4 * i_30_.toDouble()) / Class22.anInt339.toDouble()) + 0.5).toInt()
            return max(i_33_, 1)
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("ma.JA(" + i + ',' + (if (class348_sub43 != null) "{...}" else "null") + ')'))
        }
    }

    @Synchronized
    private fun method2846(bool: Boolean, bool_34_: Boolean, class348_sub2: Class348_Sub2?, bool_35_: Boolean) {
        do {
            try {
                method2840(bool_34_, (-127).toByte())
                anInt8889++
                aClass204_8944!!.method1482(class348_sub2!!.aByteArray6564)
                aLong8959 = 0L
                aBoolean8961 = bool_35_
                val i = aClass204_8944!!.method1483()
                for (i_36_ in 0..<i) {
                    aClass204_8944!!.method1492(i_36_)
                    aClass204_8944!!.method1485(i_36_)
                    aClass204_8944!!.method1486(i_36_)
                }
                anInt8960 = aClass204_8944!!.method1490()
                anInt8956 = aClass204_8944!!.anIntArray2681!![anInt8960]
                aLong8957 = aClass204_8944!!.method1488(anInt8956)
                if (bool == false) break
                aClass348_Sub16_Sub1_8958 = null
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, ("ma.T(" + bool + ',' + bool_34_ + ',' + (if (class348_sub2 != null) "{...}" else "null") + ',' + bool_35_ + ')'))
            }
            break
        } while (false)
    }

    fun method2847(i: Int, class348_sub43: Class348_Sub43?): Boolean {
        try {
            anInt8948++
            val i_37_ = 47 / ((i - -62) / 36)
            if (class348_sub43!!.aClass348_Sub16_Sub5_7081 == null) {
                if (class348_sub43.anInt7087 >= 0) {
                    class348_sub43.method2715(97.toByte())
                    if (class348_sub43.anInt7088 > 0 && (class348_sub43 == (aClass348_Sub43ArrayArray8915[class348_sub43.anInt7067]!![(class348_sub43.anInt7088)]))) aClass348_Sub43ArrayArray8915[class348_sub43.anInt7067]!![class348_sub43.anInt7088] = null
                }
                return true
            }
            return false
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("ma.W(" + i + ',' + (if (class348_sub43 != null) "{...}" else "null") + ')'))
        }
    }

    private fun method2848(class348_sub43: Class348_Sub43?, i: Byte): Int {
        try {
            if (i.toInt() != -70) anIntArray8942 = null
            anInt8936++
            val i_38_ = anIntArray8894[class348_sub43!!.anInt7067]
            if (i_38_ >= 8192) return 16384 - ((-class348_sub43.anInt7074 + 128) * (16384 - i_38_) - -32 shr 6)
            return (class348_sub43.anInt7074 * i_38_ - -32 shr 6)
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("ma.GA(" + (if (class348_sub43 != null) "{...}" else "null") + ',' + i + ')'))
        }
    }

    private fun method2849(i: Int, i_39_: Int, i_40_: Byte, i_41_: Int) {
        anInt8941++
        val class348_sub43 = aClass348_Sub43ArrayArray8928[i_41_]!![i_39_]
        if (class348_sub43 != null) {
            val i_42_ = -123 % ((i_40_ - 24) / 42)
            aClass348_Sub43ArrayArray8928[i_41_]!![i_39_] = null
            if ((this.anIntArray8895[i_41_] and 0x2) != 0) {
                var class348_sub43_43_ = (aClass348_Sub16_Sub1_8958!!.aClass262_8848.method1995(4) as Class348_Sub43?)
                while (class348_sub43_43_ != null) {
                    if ((class348_sub43_43_.anInt7067 == class348_sub43.anInt7067) && class348_sub43_43_.anInt7087 < 0 && class348_sub43 != class348_sub43_43_) {
                        class348_sub43.anInt7087 = 0
                        break
                    }
                    class348_sub43_43_ = (aClass348_Sub16_Sub1_8958!!.aClass262_8848.method1990(36.toByte()) as Class348_Sub43?)
                }
            } else class348_sub43.anInt7087 = 0
        }
    }

    private fun method2850(i: Int, i_44_: Int) {
        if ((0x4 and this.anIntArray8895[i]) != 0) {
            var class348_sub43 = (aClass348_Sub16_Sub1_8958!!.aClass262_8848.method1995(4) as Class348_Sub43?)
            while (class348_sub43 != null) {
                if (i == class348_sub43.anInt7067) class348_sub43.anInt7082 = 0
                class348_sub43 = (aClass348_Sub16_Sub1_8958!!.aClass262_8848.method1990(65.toByte()) as Class348_Sub43?)
            }
        }
        if (i_44_ == 0) anInt8897++
    }

    private fun method2851(bool: Boolean, bool_45_: Boolean) {
        if (bool_45_) method2872(2005674600, -1)
        else method2855(-1, (-79).toByte())
        anInt8951++
        method2865(0, -1)
        if (bool != true) anIntArray8947 = null
        for (i in 0..15) anIntArray8916!![i] = anIntArray8945[i]
        for (i in 0..15) anIntArray8947!![i] = Class139.method1166(anIntArray8945[i], -128)
    }

    fun method2852(`is`: IntArray?, i: Int, class348_sub43: Class348_Sub43?, i_46_: Int, i_47_: Byte): Boolean {
        try {
            class348_sub43!!.anInt7086 = Class22.anInt339 / 100
            anInt8952++
            if (class348_sub43.anInt7087 >= 0 && ((class348_sub43.aClass348_Sub16_Sub5_7081) == null || class348_sub43.aClass348_Sub16_Sub5_7081!!.method2890())) {
                class348_sub43.method3299(36.toByte())
                class348_sub43.method2715(66.toByte())
                if (class348_sub43.anInt7088 > 0 && (class348_sub43 == (aClass348_Sub43ArrayArray8915[class348_sub43.anInt7067]!![class348_sub43.anInt7088]))) aClass348_Sub43ArrayArray8915[class348_sub43.anInt7067]!![class348_sub43.anInt7088] = null
                return true
            }
            var i_48_ = class348_sub43.anInt7089
            if (i_47_.toInt() != -4) return false
            if (i_48_ > 0) {
                i_48_ -= (0.5 + (16.0 * 2.0.pow((4.921259842519685E-4 * (anIntArray8939[(class348_sub43.anInt7067)]).toDouble())))).toInt()
                if (i_48_ < 0) i_48_ = 0
                class348_sub43.anInt7089 = i_48_
            }
            class348_sub43.aClass348_Sub16_Sub5_7081!!.method2901(method2845(0, class348_sub43))
            val class23 = class348_sub43.aClass23_7075!!
            var bool = false
            class348_sub43.anInt7076 += class23.anInt352
            class348_sub43.anInt7083++
            val d = ((class348_sub43.anInt7071 - 60 shl 8) - -((class348_sub43.anInt7072 * class348_sub43.anInt7089) shr 12)).toDouble() * 5.086263020833333E-6
            if (class23.anInt347 > 0) {
                if (class23.anInt350 <= 0) class348_sub43.anInt7090 += 128
                else class348_sub43.anInt7090 += ((128.0 * 2.0.pow((class23.anInt350).toDouble() * d)) + 0.5).toInt()
                if ((class23.anInt347 * class348_sub43.anInt7090) >= 819200) bool = true
            }
            if (class23.aByteArray348 != null) {
                if (class23.anInt345 > 0) class348_sub43.anInt7070 += (0.5 + (128.0 * 2.0.pow(d * (class23.anInt345).toDouble()))).toInt()
                else class348_sub43.anInt7070 += 128
                while ( /**/((class348_sub43.anInt7069 < -2 + class23.aByteArray348!!.size) && (class348_sub43.anInt7070 > (0xff00 and ((class23.aByteArray348!![2 + (class348_sub43.anInt7069)]).toInt() shl 8))))) {
                    class348_sub43.anInt7069 += 2
                }
                if ((class348_sub43.anInt7069 == -2 + class23.aByteArray348!!.size) && ((class23.aByteArray348!![1 + class348_sub43.anInt7069]).toInt() == 0)) bool = true
            }
            if (class348_sub43.anInt7087 >= 0 && class23.aByteArray344 != null && (0x1 and (this.anIntArray8895[class348_sub43.anInt7067])) == 0 && (class348_sub43.anInt7088 < 0 || ((aClass348_Sub43ArrayArray8915[class348_sub43.anInt7067]!![class348_sub43.anInt7088]) != class348_sub43))) {
                if (class23.anInt349 > 0) class348_sub43.anInt7087 += ((2.0.pow((class23.anInt349).toDouble() * d) * 128.0) + 0.5).toInt()
                else class348_sub43.anInt7087 += 128
                while ( /**/((class348_sub43.anInt7084 < -2 + class23.aByteArray344!!.size) && (((class23.aByteArray344!![(class348_sub43.anInt7084 - -2)]).toInt() shl 8 and 0xff00) < class348_sub43.anInt7087))) {
                    class348_sub43.anInt7084 += 2
                }
                if (class348_sub43.anInt7084 == -2 + class23.aByteArray344!!.size) bool = true
            }
            if (bool) {
                class348_sub43.aClass348_Sub16_Sub5_7081!!.method2902(class348_sub43.anInt7086)
                if (`is` == null) class348_sub43.aClass348_Sub16_Sub5_7081!!.method2819(i)
                else class348_sub43.aClass348_Sub16_Sub5_7081!!.method2817(`is`, i_46_, i)
                if (class348_sub43.aClass348_Sub16_Sub5_7081!!.method2895()) aClass348_Sub16_Sub1_8958!!.aClass348_Sub16_Sub4_8855.method2883(class348_sub43.aClass348_Sub16_Sub5_7081!!)
                class348_sub43.method3299((-100).toByte())
                if (class348_sub43.anInt7087 >= 0) {
                    class348_sub43.method2715(124.toByte())
                    if (class348_sub43.anInt7088 > 0 && (class348_sub43 == (aClass348_Sub43ArrayArray8915[class348_sub43.anInt7067]!![(class348_sub43.anInt7088)]))) aClass348_Sub43ArrayArray8915[class348_sub43.anInt7067]!![class348_sub43.anInt7088] = null
                }
                return true
            }
            class348_sub43.aClass348_Sub16_Sub5_7081!!.method2888(class348_sub43.anInt7086, method2868(class348_sub43, -76), method2848(class348_sub43, (-70).toByte()))
            return false
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("ma.U(" + (if (`is` != null) "{...}" else "null") + ',' + i + ',' + (if (class348_sub43 != null) "{...}" else "null") + ',' + i_46_ + ',' + i_47_ + ')'))
        }
    }

    private fun method2853(i: Int, i_49_: Int, i_50_: Int, i_51_: Int) {
        method2849(64, i_50_, 86.toByte(), i_51_)
        anInt8931++
        if ((0x2 and this.anIntArray8895[i_51_]) != 0) {
            var class348_sub43 = (aClass348_Sub16_Sub1_8958!!.aClass262_8848.method1993(i xor 0x51.inv()) as? Class348_Sub43?)
            while (class348_sub43 != null) {
                if ((class348_sub43.anInt7067 == i_51_) && class348_sub43.anInt7087 < 0) {
                    aClass348_Sub43ArrayArray8928[i_51_]!![class348_sub43.anInt7071] = null
                    aClass348_Sub43ArrayArray8928[i_51_]!![i_50_] = class348_sub43
                    val i_52_ = (((class348_sub43.anInt7089 * class348_sub43.anInt7072) shr 12) + class348_sub43.anInt7080)
                    class348_sub43.anInt7080 += (-class348_sub43.anInt7071 + i_50_) shl 8
                    class348_sub43.anInt7072 = -class348_sub43.anInt7080 + i_52_
                    class348_sub43.anInt7071 = i_50_
                    class348_sub43.anInt7089 = 4096
                    return
                }
                class348_sub43 = (aClass348_Sub16_Sub1_8958!!.aClass262_8848.method2003(-50) as? Class348_Sub43?)
            }
        }
        val class348_sub17 = (aClass356_8891.method3480(anIntArray8916!![i_51_].toLong(), -6008) as? Class348_Sub17?)
        if (class348_sub17 != null) {
            val class348_sub19_sub1 = (class348_sub17.aClass348_Sub19_Sub1Array6800[i_50_])
            if (class348_sub19_sub1 != null) {
                val class348_sub43 = Class348_Sub43()
                class348_sub43.anInt7067 = i_51_
                class348_sub43.aClass348_Sub17_7085 = class348_sub17
                class348_sub43.aClass348_Sub19_Sub1_7077 = class348_sub19_sub1
                class348_sub43.aClass23_7075 = (class348_sub17.aClass23Array6796!![i_50_])
                class348_sub43.anInt7088 = class348_sub17.aByteArray6798!![i_50_].toInt()
                class348_sub43.anInt7071 = i_50_
                class348_sub43.anInt7066 = 1024 + ((class348_sub17.aByteArray6799[i_50_]) * (class348_sub17.anInt6797 * (i_49_ * i_49_))) shr 11
                class348_sub43.anInt7074 = (class348_sub17.aByteArray6792[i_50_].toInt() and 0xff)
                class348_sub43.anInt7080 = ((i_50_ shl 8) + -((class348_sub17.aShortArray6795!![i_50_]).toInt() and 0x7fff))
                class348_sub43.anInt7087 = -1
                class348_sub43.anInt7070 = 0
                class348_sub43.anInt7069 = i
                class348_sub43.anInt7090 = 0
                class348_sub43.anInt7084 = 0
                if (this.anIntArray8914[i_51_] == 0) class348_sub43.aClass348_Sub16_Sub5_7081 = (Class348_Sub16_Sub5.Companion.method2911(class348_sub19_sub1, method2845(0, class348_sub43), method2868(class348_sub43, i + -82), method2848(class348_sub43, (-70).toByte())))
                else {
                    class348_sub43.aClass348_Sub16_Sub5_7081 = (Class348_Sub16_Sub5.Companion.method2911(class348_sub19_sub1, method2845(0, class348_sub43), 0, method2848(class348_sub43, (-70).toByte())))
                    method2874(i xor 0x7a, (class348_sub17.aShortArray6795!![i_50_]) < 0, class348_sub43)
                }
                if (class348_sub17.aShortArray6795!![i_50_] < 0) class348_sub43.aClass348_Sub16_Sub5_7081!!.method2917(-1)
                if (class348_sub43.anInt7088 >= 0) {
                    val class348_sub43_53_ = (aClass348_Sub43ArrayArray8915[i_51_]!![class348_sub43.anInt7088])
                    if (class348_sub43_53_ != null && class348_sub43_53_.anInt7087 < 0) {
                        aClass348_Sub43ArrayArray8928[i_51_]!![class348_sub43_53_.anInt7071] = null
                        class348_sub43_53_.anInt7087 = 0
                    }
                    aClass348_Sub43ArrayArray8915[i_51_]!![class348_sub43.anInt7088] = class348_sub43
                }
                aClass348_Sub16_Sub1_8958!!.aClass262_8848.method1999(class348_sub43, i xor 0x4ed3.inv())
                aClass348_Sub43ArrayArray8928[i_51_]!![i_50_] = class348_sub43
            }
        }
    }

    private fun method2854(i: Int, i_54_: Int, i_55_: Int) {
        anInt8943++
        anIntArray8945[i_54_] = i
        if (i_55_ < 39) aClass45_8926 = null
        anIntArray8947!![i_54_] = Class139.method1166(i, -128)
        method2873((-21).toByte(), i, i_54_)
    }

    private fun method2855(i: Int, i_56_: Byte) {
        anInt8927++
        if (i_56_ < -42) {
            var class348_sub43 = (aClass348_Sub16_Sub1_8958!!.aClass262_8848.method1995(4) as Class348_Sub43?)
            while (class348_sub43 != null) {
                if ((i < 0 || i == class348_sub43.anInt7067) && class348_sub43.anInt7087 < 0) {
                    aClass348_Sub43ArrayArray8928[class348_sub43.anInt7067]!![class348_sub43.anInt7071] = null
                    class348_sub43.anInt7087 = 0
                }
                class348_sub43 = (aClass348_Sub16_Sub1_8958!!.aClass262_8848.method1990(60.toByte()) as Class348_Sub43?)
            }
        }
    }

    private fun method2856(i: Byte) {
        anInt8955++
        var i_57_ = anInt8960
        var i_58_ = anInt8956
        var l = aLong8957
        if (aClass348_Sub2_8963 != null && anInt8962 == i_58_) {
            method2846(false, aBoolean8964, aClass348_Sub2_8963, aBoolean8961)
            method2856(124.toByte())
        } else {
            while (i_58_ == anInt8956) {
                while (aClass204_8944!!.anIntArray2681!![i_57_] == i_58_) {
                    aClass204_8944!!.method1492(i_57_)
                    val i_59_ = aClass204_8944!!.method1494(i_57_)
                    if (i_59_ == 1) {
                        aClass204_8944!!.method1495()
                        aClass204_8944!!.method1486(i_57_)
                        if (aClass204_8944!!.method1480()) {
                            if (aClass348_Sub2_8963 != null) {
                                method2869(aClass348_Sub2_8963, aBoolean8961, false)
                                method2856(124.toByte())
                                return
                            }
                            if (aBoolean8961 && i_58_ != 0) aClass204_8944!!.method1484(l)
                            else {
                                method2851(true, true)
                                aClass204_8944!!.method1487()
                                return
                            }
                        }
                        break
                    }
                    if ((0x80 and i_59_) != 0) method2842(i.toInt() xor 0x40, i_59_)
                    aClass204_8944!!.method1485(i_57_)
                    aClass204_8944!!.method1486(i_57_)
                }
                i_57_ = aClass204_8944!!.method1490()
                i_58_ = aClass204_8944!!.anIntArray2681!![i_57_]
                l = aClass204_8944!!.method1488(i_58_)
            }
            if (i.toInt() != 124) method2879(-127, -46, -96)
            aLong8957 = l
            anInt8956 = i_58_
            anInt8960 = i_57_
            if (aClass348_Sub2_8963 != null && i_58_ > anInt8962) {
                anInt8960 = -1
                anInt8956 = anInt8962
                aLong8957 = aClass204_8944!!.method1488(anInt8956)
            }
        }
    }

    private fun method2857(i: Int, i_60_: Int, i_61_: Int) {
        anInt8917++
        anIntArray8942!![i] = i_61_
        this.anIntArray8906!![i] = (0.5 + 2097152.0 * 2.0.pow(5.4931640625E-4 * i_61_.toDouble())).toInt()
        if (i_60_ < 124) this.anIntArray8906 = null
    }

    private fun method2858(i: Int, i_62_: Int) {
        anInt8893++
        if (i >= -101) method2856((-89).toByte())
        if ((this.anIntArray8895[i_62_] and 0x2) != 0) {
            var class348_sub43 = (aClass348_Sub16_Sub1_8958!!.aClass262_8848.method1995(4) as Class348_Sub43?)
            while (class348_sub43 != null) {
                if ((class348_sub43.anInt7067 == i_62_) && (aClass348_Sub43ArrayArray8928[i_62_]!![class348_sub43.anInt7071]) == null && class348_sub43.anInt7087 < 0) class348_sub43.anInt7087 = 0
                class348_sub43 = (aClass348_Sub16_Sub1_8958!!.aClass262_8848.method1990(41.toByte()) as Class348_Sub43?)
            }
        }
    }

    @Synchronized
    override fun method2819(i: Int) {
        var i = i
        anInt8908++
        if (aClass204_8944!!.method1491()) {
            val i_63_ = (aClass204_8944!!.anInt2683 * anInt8921 / Class22.anInt339)
            do {
                val l = aLong8959 + i_63_.toLong() * i.toLong()
                if (-l + aLong8957 >= 0L) {
                    aLong8959 = l
                    break
                }
                val i_64_ = ((-1L + -aLong8959 + aLong8957 + i_63_.toLong()) / i_63_.toLong()).toInt()
                aLong8959 += i_64_.toLong() * i_63_.toLong()
                aClass348_Sub16_Sub1_8958!!.method2819(i_64_)
                i -= i_64_
                method2856(124.toByte())
            } while (aClass204_8944!!.method1491())
        }
        aClass348_Sub16_Sub1_8958!!.method2819(i)
    }

    private fun method2859(i: Int, i_65_: Int, i_66_: Int) {
        anInt8905++
        if (i_66_ != -32) anIntArray8916 = null
    }

    @Synchronized
    fun method2860(i: Int): Boolean {
        if (i <= 94) method2818()
        anInt8949++
        return aClass204_8944!!.method1491()
    }

    @Synchronized
    override fun method2817(`is`: IntArray, i: Int, i_67_: Int) {
        var i = i
        var i_67_ = i_67_
        try {
            anInt8898++
            if (aClass204_8944!!.method1491()) {
                val i_68_ = (anInt8921 * aClass204_8944!!.anInt2683 / Class22.anInt339)
                do {
                    val l = aLong8959 + i_67_.toLong() * i_68_.toLong()
                    if (aLong8957 + -l >= 0L) {
                        aLong8959 = l
                        break
                    }
                    val i_69_ = ((-1L + i_68_.toLong() + aLong8957 + -aLong8959) / i_68_.toLong()).toInt()
                    aLong8959 += i_68_.toLong() * i_69_.toLong()
                    aClass348_Sub16_Sub1_8958!!.method2817(`is`, i, i_69_)
                    i += i_69_
                    i_67_ -= i_69_
                    method2856(124.toByte())
                } while (aClass204_8944!!.method1491())
            }
            aClass348_Sub16_Sub1_8958!!.method2817(`is`, i, i_67_)
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("ma.C(" + (if (`is` != null) "{...}" else "null") + ',' + i + ',' + i_67_ + ')'))
        }
    }

    @Synchronized
    fun method2861(i: Int, i_70_: Int) {
        if (i != 0) method2878(56, 73, 54)
        anInt8933 = i_70_
        anInt8938++
    }

    private fun method2863(i: Int, i_73_: Int, i_74_: Int, i_75_: Int) {
        if (i_73_ <= 38) anIntArray8942 = null
        anInt8940++
    }

    @Synchronized
    fun method2864(i: Byte) {
        anInt8924++
        if (i <= 46) aClass204_8944 = null
        var class348_sub17 = aClass356_8891.method3484(0) as Class348_Sub17?
        while (class348_sub17 != null) {
            class348_sub17.method2933((-103).toByte())
            class348_sub17 = aClass356_8891.method3482(0) as Class348_Sub17?
        }
    }

    private fun method2865(i: Int, i_76_: Int) {
        var i_76_ = i_76_
        anInt8900++
        if (i_76_ < 0) {
            i_76_ = 0
            while (i_76_ < 16) {
                method2865(i, i_76_)
                i_76_++
            }
        } else {
            anIntArray8953[i_76_] = 12800
            anIntArray8894[i_76_] = 8192
            anIntArray8896[i_76_] = 16383
            anIntArray8937!![i_76_] = 8192
            anIntArray8899[i_76_] = i
            anIntArray8939[i_76_] = 8192
            method2858(-124, i_76_)
            method2850(i_76_, 0)
            this.anIntArray8895[i_76_] = 0
            anIntArray8904[i_76_] = 32767
            anIntArray8902!![i_76_] = 256
            this.anIntArray8914[i_76_] = 0
            method2857(i_76_, 127, 8192)
        }
    }

    @Synchronized
    fun method2866(class348_sub2: Class348_Sub2?, i: Int, class26: Class26?, class45: Class45?, i_77_: Int): Boolean {
        try {
            class348_sub2!!.method2733()
            anInt8954++
            var bool = true
            var `is`: IntArray? = null
            if (i > 0) `is` = intArrayOf(i)
            var class348_sub8 = class348_sub2.aClass356_6565!!.method3484(0) as Class348_Sub8?
            while (class348_sub8 != null) {
                val i_78_ = class348_sub8.aLong4291.toInt()
                var class348_sub17 = (aClass356_8891.method3480(i_78_.toLong(), -6008) as Class348_Sub17?)
                if (class348_sub17 == null) {
                    class348_sub17 = Class188.method1417(0, class45!!, i_78_)
                    if (class348_sub17 == null) {
                        bool = false
                        class348_sub8 = class348_sub2.aClass356_6565!!.method3482(0) as Class348_Sub8?
                        continue
                    }
                    aClass356_8891.method3483(69.toByte(), i_78_.toLong(), class348_sub17)
                }
                if (!class348_sub17.method2932(class26, `is`, (class348_sub8.aByteArray6657), 0)) bool = false
                class348_sub8 = class348_sub2.aClass356_6565!!.method3482(0) as Class348_Sub8?
            }
            if (i_77_ >= -13) return true
            if (bool) class348_sub2.method2735()
            return bool
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("ma.CA(" + (if (class348_sub2 != null) "{...}" else "null") + ',' + i + ',' + (if (class26 != null) "{...}" else "null") + ',' + (if (class45 != null) "{...}" else "null") + ',' + i_77_ + ')'))
        }
    }

    @Synchronized
    fun method2867(i: Int) {
        anInt8903++
        if (i == 4) {
            var class348_sub17 = aClass356_8891.method3484(0) as Class348_Sub17?
            while (class348_sub17 != null) {
                class348_sub17.method2715(53.toByte())
                class348_sub17 = aClass356_8891.method3482(i xor 0x4) as Class348_Sub17?
            }
        }
    }

    private fun method2868(class348_sub43: Class348_Sub43?, i: Int): Int {
        try {
            if (i >= -16) method2879(-95, 66, 110)
            anInt8920++
            if (anIntArray8925[class348_sub43!!.anInt7067] == 0) return 0
            val class23 = class348_sub43.aClass23_7075!!
            var i_79_ = ((anIntArray8953[class348_sub43.anInt7067] * (anIntArray8896[class348_sub43.anInt7067])) + 4096 shr 13)
            i_79_ = 16384 + i_79_ * i_79_ shr 15
            i_79_ = (16384 + i_79_ * class348_sub43.anInt7066 shr 15)
            i_79_ = i_79_ * anInt8933 + 128 shr 8
            i_79_ = 128 + anIntArray8925[(class348_sub43.anInt7067)] * i_79_ shr 8
            if (class23.anInt347 > 0) i_79_ = (0.5 + (i_79_.toDouble() * 0.5.pow((class348_sub43.anInt7090.toDouble() * 1.953125E-5 * (class23.anInt347).toDouble())))).toInt()
            if (class23.aByteArray348 != null) {
                val i_80_ = class348_sub43.anInt7070
                var i_81_ = (class23.aByteArray348!![class348_sub43.anInt7069 + 1]).toInt()
                if (class348_sub43.anInt7069 < class23.aByteArray348!!.size + -2) {
                    val i_82_ = 0xff00 and ((class23.aByteArray348!![(class348_sub43.anInt7069)]).toInt() shl 8)
                    val i_83_ = ((0xff and (class23.aByteArray348!![(class348_sub43.anInt7069) + 2]).toInt()) shl 8)
                    i_81_ += (-i_81_ + (class23.aByteArray348!![(class348_sub43.anInt7069 - -3)])) * (i_80_ + -i_82_) / (i_83_ - i_82_)
                }
                i_79_ = i_79_ * i_81_ + 32 shr 6
            }
            if (class348_sub43.anInt7087 > 0 && class23.aByteArray344 != null) {
                val i_84_ = class348_sub43.anInt7087
                var i_85_ = (class23.aByteArray344!![1 + class348_sub43.anInt7084]).toInt()
                if (class23.aByteArray344!!.size + -2 > class348_sub43.anInt7084) {
                    val i_86_ = 0xff00 and ((class23.aByteArray344!![(class348_sub43.anInt7084)]).toInt() shl 8)
                    val i_87_ = ((class23.aByteArray344!![class348_sub43.anInt7084 - -2]).toInt() shl 8) and 0xff00
                    i_85_ += ((class23.aByteArray344!![3 + class348_sub43.anInt7084]) + -i_85_) * (i_84_ + -i_86_) / (-i_86_ + i_87_)
                }
                i_79_ = i_85_ * i_79_ + 32 shr 6
            }
            return i_79_
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("ma.DA(" + (if (class348_sub43 != null) "{...}" else "null") + ',' + i + ')'))
        }
    }

    @Synchronized
    fun method2869(class348_sub2: Class348_Sub2?, bool: Boolean, bool_88_: Boolean) {
        try {
            anInt8932++
            method2846(bool_88_, true, class348_sub2, bool)
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("ma.L(" + (if (class348_sub2 != null) "{...}" else "null") + ',' + bool + ',' + bool_88_ + ')'))
        }
    }

    @Synchronized
    fun method2870(class348_sub2: Class348_Sub2?, l: Long, bool: Boolean, bool_89_: Boolean, i: Byte) {
        try {
            method2846(false, bool_89_, class348_sub2, bool)
            if (i > 17) {
                anInt8930++
                method2876(aClass204_8944!!.anInt2683.toLong() * l, -125)
            }
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("ma.O(" + (if (class348_sub2 != null) "{...}" else "null") + ',' + l + ',' + bool + ',' + bool_89_ + ',' + i + ')'))
        }
    }

    @Synchronized
    override fun method2816(): Class348_Sub16? {
        anInt8912++
        return aClass348_Sub16_Sub1_8958
    }

    private fun method2872(i: Int, i_90_: Int) {
        anInt8918++
        var class348_sub43 = (aClass348_Sub16_Sub1_8958!!.aClass262_8848.method1995(i + -2005674596) as Class348_Sub43?)
        while (class348_sub43 != null) {
            if (i_90_ < 0 || (class348_sub43.anInt7067 == i_90_)) {
                if (class348_sub43.aClass348_Sub16_Sub5_7081 != null) {
                    class348_sub43.aClass348_Sub16_Sub5_7081!!.method2902(Class22.anInt339 / 100)
                    if (class348_sub43.aClass348_Sub16_Sub5_7081!!.method2895()) aClass348_Sub16_Sub1_8958!!.aClass348_Sub16_Sub4_8855.method2883(class348_sub43.aClass348_Sub16_Sub5_7081!!)
                    class348_sub43.method3299(72.toByte())
                }
                if (class348_sub43.anInt7087 < 0) aClass348_Sub43ArrayArray8928[class348_sub43.anInt7067]!![class348_sub43.anInt7071] = null
                class348_sub43.method2715(21.toByte())
            }
            class348_sub43 = (aClass348_Sub16_Sub1_8958!!.aClass262_8848.method1990(68.toByte()) as Class348_Sub43?)
        }
        if (i != 2005674600) anIntArray8902 = null
    }

    private fun method2873(i: Byte, i_91_: Int, i_92_: Int) {
        if (i.toInt() == -21) {
            anInt8929++
            if (i_91_ != anIntArray8916!![i_92_]) {
                anIntArray8916!![i_92_] = i_91_
                for (i_93_ in 0..127) aClass348_Sub43ArrayArray8915[i_92_]!![i_93_] = null
            }
        }
    }

    fun method2874(i: Int, bool: Boolean, class348_sub43: Class348_Sub43?) {
        try {
            anInt8909++
            var i_94_ = (class348_sub43!!.aClass348_Sub19_Sub1_7077!!.aByteArray8984)!!.size
            var i_95_: Int
            if (bool && (class348_sub43.aClass348_Sub19_Sub1_7077!!.aBoolean8987)) {
                val i_96_ = (i_94_ + i_94_ + -class348_sub43.aClass348_Sub19_Sub1_7077!!.anInt8986)
                i_95_ = ((this.anIntArray8914[(class348_sub43.anInt7067)]).toLong() * i_96_.toLong() shr 6).toInt()
                i_94_ = i_94_ shl 8
                if (i_94_ <= i_95_) {
                    i_95_ = i_94_ + i_94_ - 1 - i_95_
                    class348_sub43.aClass348_Sub16_Sub5_7081!!.method2891(true)
                }
            } else i_95_ = ((i_94_.toLong() * (this.anIntArray8914[(class348_sub43.anInt7067)]).toLong()) shr 6).toInt()
            if (i > 93) class348_sub43.aClass348_Sub16_Sub5_7081!!.method2924(i_95_)
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("ma.WA(" + i + ',' + bool + ',' + (if (class348_sub43 != null) "{...}" else "null") + ')'))
        }
    }

    private fun method2875(i: Int, i_97_: Int, i_98_: Int) {
        anIntArray8937!![i] = i_98_
        anInt8923++
        if (i_97_ != 2) anIntArray8937 = null
    }

    private fun method2876(l: Long, i: Int) {
        try {
            anInt8919++
            if (i <= -124) {
                while (aLong8957 <= l) {
                    var i_99_ = anInt8960
                    var i_100_ = anInt8956
                    var l_101_ = aLong8957
                    while (anInt8956 == i_100_) {
                        while ((aClass204_8944!!.anIntArray2681!![i_99_]) == i_100_) {
                            aClass204_8944!!.method1492(i_99_)
                            val i_102_ = aClass204_8944!!.method1494(i_99_)
                            if (i_102_ == 1) {
                                aClass204_8944!!.method1495()
                                aClass204_8944!!.method1486(i_99_)
                                if (aClass204_8944!!.method1480()) {
                                    if (aBoolean8961 && i_100_ != 0) aClass204_8944!!.method1484(l_101_)
                                    else {
                                        method2851(true, true)
                                        aClass204_8944!!.method1487()
                                        return
                                    }
                                }
                                break
                            }
                            if ((i_102_ and 0x80) != 0 && (0xf0 and i_102_) != 144) method2842(65, i_102_)
                            aClass204_8944!!.method1485(i_99_)
                            aClass204_8944!!.method1486(i_99_)
                        }
                        aLong8959 = l_101_
                        i_99_ = aClass204_8944!!.method1490()
                        i_100_ = (aClass204_8944!!.anIntArray2681!![i_99_])
                        l_101_ = aClass204_8944!!.method1488(i_100_)
                    }
                    anInt8960 = i_99_
                    aLong8957 = l_101_
                    anInt8956 = i_100_
                }
            }
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, "ma.UA(" + l + ',' + i + ')')
        }
    }

    @Synchronized
    fun method2877(i: Int) {
        method2840(true, (-95).toByte())
        if (i != -128) method2849(103, -71, (-108).toByte(), -63)
        anInt8913++
    }

    @Synchronized
    override fun method2821(): Int {
        anInt8901++
        return 0
    }

    constructor() {
        anIntArray8896 = IntArray(16)
        aClass348_Sub43ArrayArray8915 = Array<Array<Class348_Sub43?>?>(16) { arrayOfNulls<Class348_Sub43>(128) }
        anIntArray8904 = IntArray(16)
        this.anIntArray8914 = IntArray(16)
        this.anIntArray8906 = IntArray(16)
        anIntArray8894 = IntArray(16)
        anIntArray8899 = IntArray(16)
        anIntArray8925 = IntArray(16)
        anIntArray8902 = IntArray(16)
        this.anIntArray8895 = IntArray(16)
        aClass348_Sub43ArrayArray8928 = Array<Array<Class348_Sub43?>?>(16) { arrayOfNulls<Class348_Sub43>(128) }
        anIntArray8937 = IntArray(16)
        anIntArray8939 = IntArray(16)
        anInt8921 = 1000000
        anIntArray8942 = IntArray(16)
        anIntArray8945 = IntArray(16)
        anIntArray8916 = IntArray(16)
        anInt8933 = 256
        anIntArray8953 = IntArray(16)
        anIntArray8947 = IntArray(16)
        aClass204_8944 = Class204()
        aClass348_Sub16_Sub1_8958 = Class348_Sub16_Sub1(this)
        aClass356_8891 = Class356(128)
        method2843(256, -1, -7836)
        method2851(true, true)
    }

    internal constructor(class348_sub16_sub3_107_: Class348_Sub16_Sub3?) {
        anIntArray8896 = IntArray(16)
        aClass348_Sub43ArrayArray8915 = Array<Array<Class348_Sub43?>?>(16) { arrayOfNulls<Class348_Sub43>(128) }
        anIntArray8904 = IntArray(16)
        this.anIntArray8914 = IntArray(16)
        this.anIntArray8906 = IntArray(16)
        anIntArray8894 = IntArray(16)
        anIntArray8899 = IntArray(16)
        anIntArray8925 = IntArray(16)
        anIntArray8902 = IntArray(16)
        this.anIntArray8895 = IntArray(16)
        aClass348_Sub43ArrayArray8928 = Array<Array<Class348_Sub43?>?>(16) { arrayOfNulls<Class348_Sub43>(128) }
        anIntArray8937 = IntArray(16)
        anIntArray8939 = IntArray(16)
        anInt8921 = 1000000
        anIntArray8942 = IntArray(16)
        anIntArray8945 = IntArray(16)
        anIntArray8916 = IntArray(16)
        anInt8933 = 256
        anIntArray8953 = IntArray(16)
        anIntArray8947 = IntArray(16)
        aClass204_8944 = Class204()
        aClass348_Sub16_Sub1_8958 = Class348_Sub16_Sub1(this)
        try {
            aClass356_8891 = class348_sub16_sub3_107_!!.aClass356_8891
            method2843(256, -1, -7836)
            method2851(true, true)
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("ma.<init>(" + (if (class348_sub16_sub3_107_ != null) "{...}" else "null") + ')'))
        }
    }

    companion object {
        @JvmField
        var anInt8889: Int = 0
        @JvmField
        var anInt8890: Int = 0
        @JvmField
        var anInt8892: Int = 0
        @JvmField
        var anInt8893: Int = 0
        @JvmField
        var anInt8897: Int = 0
        @JvmField
        var anInt8898: Int = 0
        @JvmField
        var anInt8900: Int = 0
        @JvmField
        var anInt8901: Int = 0
        @JvmField
        var anInt8903: Int = 0
        @JvmField
        var anInt8905: Int = 0
        @JvmField
        var anInt8907: Int = 0
        @JvmField
        var anInt8908: Int = 0
        @JvmField
        var anInt8909: Int = 0
        @JvmField
        var anIntArrayArray8910: Array<IntArray?>? = arrayOf<IntArray?>(intArrayOf(0, 1, 2, 3), intArrayOf(1, 2, 3, 0), intArrayOf(1, 2, -1, 0), intArrayOf(2, 0, -1, 1), intArrayOf(0, 1, -1, 2), intArrayOf(1, 2, -1, 0), intArrayOf(-1, 4, -1, 1), intArrayOf(-1, 1, 3, -1), intArrayOf(-1, 0, 2, -1), intArrayOf(3, 5, 2, 0), intArrayOf(0, 2, 5, 3), intArrayOf(0, 2, 3, 5), intArrayOf(0, 1, 2, 3))
        @JvmField
        var anInt8911: Int = 0
        @JvmField
        var anInt8912: Int = 0
        @JvmField
        var anInt8913: Int = 0
        @JvmField
        var anInt8917: Int = 0
        @JvmField
        var anInt8918: Int = 0
        @JvmField
        var anInt8919: Int = 0
        @JvmField
        var anInt8920: Int = 0
        @JvmField
        var anInt8922: Int = 0
        @JvmField
        var anInt8923: Int = 0
        @JvmField
        var anInt8924: Int = 0
        @JvmField
        var aClass45_8926: Class45? = null
        @JvmField
        var anInt8927: Int = 0
        @JvmField
        var anInt8929: Int = 0
        @JvmField
        var anInt8930: Int = 0
        @JvmField
        var anInt8931: Int = 0
        @JvmField
        var anInt8932: Int = 0
        @JvmField
        var anInt8934: Int = 0
        @JvmField
        var anInt8935: Int = 0
        @JvmField
        var anInt8936: Int = 0
        @JvmField
        var anInt8938: Int = 0
        @JvmField
        var anInt8940: Int = 0
        @JvmField
        var anInt8941: Int = 0
        @JvmField
        var anInt8943: Int = 0
        @JvmField
        var anInt8946: Int = 0
        @JvmField
        var anInt8948: Int = 0
        @JvmField
        var anInt8949: Int = 0
        @JvmField
        var anInt8950: Int = 0
        @JvmField
        var anInt8951: Int = 0
        @JvmField
        var anInt8952: Int = 0
        @JvmField
        var anInt8954: Int = 0
        @JvmField
        var anInt8955: Int = 0
        @JvmStatic
        fun method2839(i: Int, i_0_: Int, i_1_: Int) {
            anInt8890++
            Class244.anInt4609 = i - Class75.anInt1266
            Class48.anInt859 = i_1_ + -Class75.anInt1263
            if (i_0_ != -17) method2839(-112, -58, -95)
        }

        @JvmStatic
        fun method2862(class297: Class297?, string: String?, i: Int, i_71_: Int): Class144? {
            try {
                val i_72_ = 16 % ((-37 - i) / 51)
                anInt8911++
                if (i_71_ == 0) return class297!!.method2245(string, 16)
                if (i_71_ == 1) {
                    try {
                        Class224.method1616("openjs", (arrayOf<Any?>(URL(Class93.anApplet1530!!.getCodeBase(), string).toString())), Class93.anApplet1530, 38.toByte())
                        val class144 = Class144()
                        class144.anInt1997 = 1
                        return class144
                    } catch (throwable: Throwable) {
                        val class144 = Class144()
                        class144.anInt1997 = 2
                        return class144
                    }
                }
                if (i_71_ == 2) {
                    try {
                        Class93.anApplet1530!!.showDocument(URL(Class93.anApplet1530!!.getCodeBase(), string), "_blank")
                        val class144 = Class144()
                        class144.anInt1997 = 1
                        return class144
                    } catch (exception: Exception) {
                        val class144 = Class144()
                        class144.anInt1997 = 2
                        return class144
                    }
                }
                if (i_71_ == 3) {
                    try {
                        Class224.method1617(125.toByte(), Class93.anApplet1530, "loggedout")
                    } catch (throwable: Throwable) {
                        /* empty */
                    }
                    try {
                        Class93.anApplet1530!!.showDocument(URL(Class93.anApplet1530!!.getCodeBase(), string), "_top")
                        val class144 = Class144()
                        class144.anInt1997 = 1
                        return class144
                    } catch (exception: Exception) {
                        val class144 = Class144()
                        class144.anInt1997 = 2
                        return class144
                    }
                }
                throw IllegalArgumentException()
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, ("ma.EA(" + (if (class297 != null) "{...}" else "null") + ',' + (if (string != null) "{...}" else "null") + ',' + i + ',' + i_71_ + ')'))
            }
        }

        @JvmStatic
        fun method2871(i: Int) {
            anIntArrayArray8910 = null
            if (i != -65) method2862(null, null, 96, -71)
            aClass45_8926 = null
        }

        @JvmStatic
        fun method2878(i: Int, i_103_: Int, i_104_: Int): Class318_Sub1_Sub1? {
            val class357 = Class147.aClass357ArrayArrayArray2029!![i]!![i_103_]!![i_104_]
            if (class357 == null || class357.aClass318_Sub1_Sub1_4402 == null) return null
            return class357.aClass318_Sub1_Sub1_4402
        }

        @JvmStatic
        fun method2879(i: Int, i_105_: Int, i_106_: Int) {
            val class357 = Class147.aClass357ArrayArrayArray2029!![i]!![i_105_]!![i_106_]
            if (class357 != null) {
                Class183.method1376(class357.aClass318_Sub1_Sub1_4402)
                if (class357.aClass318_Sub1_Sub1_4402 != null) class357.aClass318_Sub1_Sub1_4402 = null
            }
        }
    }
}
