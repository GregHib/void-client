import Class239_Sub3.Companion.method1731
import Class239_Sub6.Companion.method1745
import Class286_Sub2.Companion.method2146
import Class286_Sub3.Companion.method2148
import Class318_Sub1_Sub5.Companion.method2485
import Class99.method881

/* Class261 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class261 internal constructor(class230: Class230?, i: Int, class45: Class45?) {
    private val aClass45_3319: Class45?
    private val aClass60_3321 = Class60(64)
    fun method1983(i: Int, i_9_: Int): Class225 {
        anInt3320++
        var class225: Class225?
        synchronized(aClass60_3321) {
            class225 = aClass60_3321.method583(i.toLong(), 69) as Class225?
        }
        if (class225 != null) return class225
        val `is`: ByteArray?
        synchronized(aClass45_3319!!) {
            `is` = aClass45_3319.method410(-1860, i_9_, i)
        }
        class225 = Class225()
        if (`is` != null) class225.method1620(Class348_Sub49(`is`), -108)
        synchronized(aClass60_3321) {
            aClass60_3321.method582(class225, i.toLong(), (-109).toByte())
        }
        return class225
    }

    fun method1984(i: Byte, i_10_: Int) {
        synchronized(aClass60_3321) {
            aClass60_3321.method578(2, i_10_)
        }
        anInt3315++
        if (i < 36) method1980(-32)
    }

    fun method1985(i: Int) {
        anInt3317++
        synchronized(aClass60_3321) {
            aClass60_3321.method590(i)
        }
    }

    fun method1986(i: Byte) {
        synchronized(aClass60_3321) {
            aClass60_3321.method587(-112)
        }
        val i_11_ = 119 / ((i - 47) / 55)
        anInt3316++
    }

    init {
        try {
            aClass45_3319 = class45
            aClass45_3319!!.method407(0, 32)
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("uga.<init>(" + (if (class230 != null) "{...}" else "null") + ',' + i + ',' + (if (class45 != null) "{...}" else "null") + ')'))
        }
    }

    companion object {
        var anInt3313: Int = 0
        var aClass113_3314: Class113? = Class113()
        var anInt3315: Int = 0
        var anInt3316: Int = 0
        var anInt3317: Int = 0
        var anInt3318: Int = 0
        var anInt3320: Int = 0
        var anInt3322: Int = 0

        @JvmStatic
        fun method1980(i: Int) {
            if (i > 92) aClass113_3314 = null
        }

        fun method1981(string: String?, i: Byte, c: Char, string_0_: String?): String? {
            try {
                anInt3322++
                val i_1_ = string!!.length
                val i_2_ = string_0_!!.length
                var i_3_ = i_1_
                val i_4_ = -1 + i_2_
                if (i_4_ != 0) {
                    var i_5_ = 0
                    while (true) {
                        i_5_ = string.indexOf(c, i_5_)
                        if (i_5_ < 0) break
                        i_5_++
                        i_3_ += i_4_
                    }
                }
                val stringbuffer = StringBuffer(i_3_)
                var i_6_ = 0
                if (i > -77) return null
                while (true) {
                    val i_7_ = string.indexOf(c, i_6_)
                    if (i_7_ < 0) break
                    stringbuffer.append(string, i_6_, i_7_)
                    stringbuffer.append(string_0_)
                    i_6_ = i_7_ + 1
                }
                stringbuffer.append(string.substring(i_6_))
                return stringbuffer.toString()
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, ("uga.H(" + (if (string != null) "{...}" else "null") + ',' + i + ',' + c + ',' + (if (string_0_ != null) "{...}" else "null") + ')'))
            }
        }

        fun method1982(i: Int, i_8_: Int, string: String) {
            Class348_Sub42_Sub12.anInt9594++
            anInt3318++
            val class348_sub47 = method2148(Class117.aClass351_1766, Class348_Sub23_Sub2.aClass77_9029, i + -107)
            class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByte(false, 1 - -method1745(string, -65))
            if (i == 16) {
                class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByteSubtract((-70).toByte(), i_8_)
                class348_sub47.aClass348_Sub49_Sub2_7116!!.writeString((-5).toByte(), string)
                Class348_Sub42_Sub14.method3243(117, class348_sub47)
            }
        }

        @JvmStatic
        fun method1987(i: Int) {
            val i_12_ = 81 % ((i - -70) / 35)
            anInt3313++
            if (!Class5_Sub1.aBoolean8335) Class348_Sub42_Sub6.aBoolean9535 = ((Class332.anInt4143 != -1 && Class73.anInt4776 >= Class332.anInt4143) || (Class348_Sub42_Sub8_Sub2.anInt10432 < 16 * Class73.anInt4776 - -(if (!Class71.aBoolean1211) 22 else 26)))
            Class166.aClass262_2187!!.method1996(103)
            Class348_Sub40_Sub38.aClass262_9478!!.method1996(104)
            var class348_sub42_sub12 = (Class348_Sub40_Sub4.aClass262_9111!!.method1995(4) as Class348_Sub42_Sub12?)
            while (class348_sub42_sub12 != null) {
                val i_13_ = class348_sub42_sub12.anInt9608
                if (i_13_ < 1000) {
                    class348_sub42_sub12.method2715(97.toByte())
                    if (i_13_ == 15 || i_13_ == 2 || i_13_ == 30 || i_13_ == 49 || i_13_ == 51 || i_13_ == 50 || i_13_ == 6) Class348_Sub40_Sub38.aClass262_9478!!.method1999(class348_sub42_sub12, -20180)
                    else Class166.aClass262_2187!!.method1999(class348_sub42_sub12, -20180)
                }
                class348_sub42_sub12 = Class348_Sub40_Sub4.aClass262_9111!!.method1990(83.toByte()) as Class348_Sub42_Sub12?
            }
            Class166.aClass262_2187!!.method1988(Class348_Sub40_Sub4.aClass262_9111, (-115).toByte())
            Class348_Sub40_Sub38.aClass262_9478!!.method1988(Class348_Sub40_Sub4.aClass262_9111, (-115).toByte())
            if (Class73.anInt4776 > 1) {
                if (!Class116.shiftClick || !Class182.aClass346_2449!!.method2696(81, -122) || Class73.anInt4776 <= 2) Class316.aClass348_Sub42_Sub12_3963 = (Class348_Sub40_Sub4.aClass262_9111!!.aClass348_3334.aClass348_4295 as Class348_Sub42_Sub12?)
                else Class316.aClass348_Sub42_Sub12_3963 = (Class348_Sub40_Sub4.aClass262_9111!!.aClass348_3334.aClass348_4295!!.aClass348_4295 as Class348_Sub42_Sub12?)
                Class135_Sub2.aClass348_Sub42_Sub12_4846 = (Class348_Sub40_Sub4.aClass262_9111!!.aClass348_3334.aClass348_4295 as Class348_Sub42_Sub12?)
            } else {
                Class316.aClass348_Sub42_Sub12_3963 = null
                Class135_Sub2.aClass348_Sub42_Sub12_4846 = null
            }
            var i_14_ = -1
            val class348_sub45 = Class318_Sub1_Sub3.aClass262_8744!!.method1995(4) as Class348_Sub45?
            if (class348_sub45 != null) i_14_ = class348_sub45.method3310(58)
            if (Class5_Sub1.aBoolean8335) {
                if (i_14_ == -1) {
                    val i_15_ = Class258_Sub4.aClass373_8552!!.method3597(true)
                    val i_16_ = Class258_Sub4.aClass373_8552!!.method3594(116.toByte())
                    var bool = false
                    if (Class242.aClass348_Sub42_Sub13_3152 != null) {
                        if (Class50_Sub3.anInt5252 + -10 > i_15_ || ((Class50_Sub3.anInt5252 - -Class348_Sub1_Sub1.anInt8806 + 10) < i_15_) || -10 + Class373.anInt4534 > i_16_ || (Class177.anInt4669 + Class373.anInt4534 + 10 < i_16_)) Class348_Sub42_Sub19.method3277((-48).toByte())
                        else bool = true
                    }
                    if (!bool) {
                        if (Class135_Sub1.anInt4717 - 10 <= i_15_ && i_15_ <= (10 + Class135_Sub1.anInt4717 - -Class63.anInt1117) && i_16_ >= -10 + Class348_Sub42_Sub5.anInt9532 && i_16_ <= (10 + Class348_Sub42_Sub5.anInt9532 - -Class237_Sub1.anInt5819)) {
                            if (Class348_Sub42_Sub6.aBoolean9535) {
                                var i_17_ = -1
                                var i_18_ = -1
                                for (i_19_ in 0..<Class8.anInt166) {
                                    if (Class71.aBoolean1211) {
                                        val i_21_ = (16 * i_19_ + 33 + Class348_Sub42_Sub5.anInt9532)
                                        if ((i_16_ > -13 + i_21_) && i_21_ + 4 > i_16_) {
                                            i_18_ = -13 + i_21_
                                            i_17_ = i_19_
                                            break
                                        }
                                    } else {
                                        val i_20_ = (16 * i_19_ + Class348_Sub42_Sub5.anInt9532 - -31)
                                        if (i_20_ + -13 < i_16_ && (i_20_ + 3 > i_16_)) {
                                            i_18_ = i_20_ + -13
                                            i_17_ = i_19_
                                            break
                                        }
                                    }
                                }
                                if (i_17_ != -1) {
                                    var i_22_ = 0
                                    val class156 = Class156(Class233.aClass107_3022!!)
                                    var class348_sub42_sub13 = (class156.method1240(75) as Class348_Sub42_Sub13?)
                                    while (class348_sub42_sub13 != null) {
                                        if (i_17_ == i_22_) {
                                            if (class348_sub42_sub13.anInt9615 > 1) method881(class348_sub42_sub13, i_16_, true, i_18_)
                                            break
                                        }
                                        i_22_++
                                        class348_sub42_sub13 = (class156.method1243(74.toByte()) as Class348_Sub42_Sub13?)
                                    }
                                }
                            }
                        } else method2146(70.toByte())
                    }
                }
                if (i_14_ == 0) {
                    val i_23_ = class348_sub45!!.method3308((-128).toByte())
                    val i_24_ = class348_sub45.method3311(33)
                    if (Class242.aClass348_Sub42_Sub13_3152 != null && Class50_Sub3.anInt5252 <= i_23_ && (Class348_Sub1_Sub1.anInt8806 + Class50_Sub3.anInt5252 >= i_23_) && i_24_ >= Class373.anInt4534 && Class373.anInt4534 + Class177.anInt4669 >= i_24_) {
                        var i_25_ = -1
                        var i_26_ = 0
                        while ((Class242.aClass348_Sub42_Sub13_3152!!.anInt9615 > i_26_)) {
                            if (Class71.aBoolean1211) {
                                val i_27_ = 33 + (Class373.anInt4534 + i_26_ * 16)
                                if (i_24_ > -13 + i_27_ && i_24_ < 4 + i_27_) i_25_ = i_26_
                            } else {
                                val i_28_ = i_26_ * 16 + 31 + Class373.anInt4534
                                if (i_28_ + -13 < i_24_ && i_24_ < 3 + i_28_) i_25_ = i_26_
                            }
                            i_26_++
                        }
                        if (i_25_ != -1) {
                            var i_29_ = 0
                            val class156 = Class156(Class242.aClass348_Sub42_Sub13_3152!!.aClass107_9621)
                            var class348_sub42_sub12 = (class156.method1240(98) as Class348_Sub42_Sub12?)
                            while (class348_sub42_sub12 != null) {
                                if (i_29_ == i_25_) {
                                    Class325.method2599(126.toByte(), class348_sub42_sub12, i_24_, i_23_)
                                    break
                                }
                                i_29_++
                                class348_sub42_sub12 = (class156.method1243(122.toByte()) as Class348_Sub42_Sub12?)
                            }
                        }
                        method2146(78.toByte())
                    } else if (Class135_Sub1.anInt4717 <= i_23_ && (i_23_ <= Class135_Sub1.anInt4717 - -Class63.anInt1117) && i_24_ >= Class348_Sub42_Sub5.anInt9532 && ((Class348_Sub42_Sub5.anInt9532 - -Class237_Sub1.anInt5819) >= i_24_)) {
                        if (Class348_Sub42_Sub6.aBoolean9535) {
                            var i_30_ = -1
                            for (i_31_ in 0..<Class8.anInt166) {
                                if (Class71.aBoolean1211) {
                                    val i_33_ = (Class348_Sub42_Sub5.anInt9532 + 33 - -(i_31_ * 16))
                                    if (i_24_ > -13 + i_33_ && i_33_ + 4 > i_24_) {
                                        i_30_ = i_31_
                                        break
                                    }
                                } else {
                                    val i_32_ = (Class348_Sub42_Sub5.anInt9532 + 31 + i_31_ * 16)
                                    if (i_24_ > i_32_ - 13 && i_32_ + 3 > i_24_) {
                                        i_30_ = i_31_
                                        break
                                    }
                                }
                            }
                            if (i_30_ != -1) {
                                var i_34_ = 0
                                val class156 = Class156(Class233.aClass107_3022!!)
                                var class348_sub42_sub13 = (class156.method1240(18) as Class348_Sub42_Sub13?)
                                while (class348_sub42_sub13 != null) {
                                    if (i_34_ == i_30_) {
                                        Class325.method2599(122.toByte(), ((class348_sub42_sub13.aClass107_9621.aClass348_Sub42_1647.aClass348_Sub42_7063) as Class348_Sub42_Sub12?), i_24_, i_23_)
                                        method2146(118.toByte())
                                        break
                                    }
                                    i_34_++
                                    class348_sub42_sub13 = (class156.method1243(55.toByte()) as Class348_Sub42_Sub13?)
                                }
                            }
                        } else {
                            var i_35_ = -1
                            var i_36_ = 0
                            while ((i_36_ < Class73.anInt4776)) {
                                if (Class71.aBoolean1211) {
                                    val i_37_ = (33 + Class348_Sub42_Sub5.anInt9532 + 16 * (Class73.anInt4776 - (1 - -i_36_)))
                                    if (i_37_ - 13 < i_24_ && 4 + i_37_ > i_24_) i_35_ = i_36_
                                } else {
                                    val i_38_ = (Class348_Sub42_Sub5.anInt9532 + (31 - -((Class73.anInt4776 - 1 - i_36_) * 16)))
                                    if (i_38_ - 13 < i_24_ && (i_24_ < i_38_ - -3)) i_35_ = i_36_
                                }
                                i_36_++
                            }
                            if (i_35_ != -1) {
                                var i_39_ = 0
                                val class312 = Class312(Class348_Sub40_Sub4.aClass262_9111!!)
                                var class348_sub42_sub12 = (class312.method2327((-53).toByte()) as Class348_Sub42_Sub12?)
                                while (class348_sub42_sub12 != null) {
                                    if (i_35_ == i_39_) {
                                        Class325.method2599(107.toByte(), class348_sub42_sub12, i_24_, i_23_)
                                        break
                                    }
                                    i_39_++
                                    class348_sub42_sub12 = (class312.method2329(10) as Class348_Sub42_Sub12?)
                                }
                            }
                            Class286_Sub2.method2146((-46).toByte())
                        }
                    }
                }
            } else {
                if (i_14_ == 0 && ((Class318_Sub1_Sub5.anInt8770 == 1 && Class73.anInt4776 > 2) || method2485(-100))) i_14_ = 2
                if (i_14_ == 2 && Class73.anInt4776 > 0 && class348_sub45 != null) {
                    if (Class289.aClass46_3701 == null && Class348_Sub42.anInt7059 == 0) Class304.method2291((-124).toByte(), class348_sub45.method3308((-127).toByte()), class348_sub45.method3311(-104))
                    else Class282.anInt3655 = 2
                }
                if (i_14_ == 0) {
                    if (Class316.aClass348_Sub42_Sub12_3963 != null) method1731(1)
                    else if (r.aBoolean9722) Class341.method2678(-2049)
                }
                if (Class289.aClass46_3701 == null && Class348_Sub42.anInt7059 == 0) {
                    Class138.aClass348_Sub42_Sub12_1946 = null
                    Class282.anInt3655 = 0
                }
            }
        }
    }
}
