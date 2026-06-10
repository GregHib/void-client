import Class239_Sub6.Companion.method1745
import Class285_Sub1.Companion.method2127
import Class286_Sub3.Companion.method2148
import Class59.Companion.method544
import kotlin.math.max
import kotlin.math.min

/* Class348_Sub40_Sub30 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class348_Sub40_Sub30 : Class348_Sub40(1, false) {
    private var anInt9386 = 0
    private var anInt9389 = 0
    private var anInt9390 = 0
    private var anInt9392 = 0
    private var anInt9396 = 0
    private var anInt9398 = 0
    private var anInt9400 = 0
    private var anInt9401 = 0
    private var anInt9402 = 0
    override fun method3047(i: Int, i_8_: Int): Array<IntArray?>? {
        anInt9393++
        val `is` = this.aClass322_7033!!.method2557(-105, i)!!
        if (this.aClass322_7033!!.aBoolean4035) {
            val is_9_ = this.method3039(50.toByte(), i, 0)!!
            val is_10_ = is_9_[0]!!
            val is_11_ = is_9_[1]!!
            val is_12_ = is_9_[2]!!
            val is_13_ = `is`[0]!!
            val is_14_ = `is`[1]!!
            val is_15_ = `is`[2]!!
            var i_16_ = 0
            while ((i_16_ < Class348_Sub40_Sub6.Companion.anInt9139)) {
                method3129(is_10_[i_16_], is_11_[i_16_], 82.toByte(), is_12_[i_16_])
                anInt9401 += anInt9390
                anInt9400 += anInt9402
                anInt9389 += anInt9398
                while ( /**/anInt9400 < 0) {
                    anInt9400 += 4096
                }
                if (anInt9401 < 0) anInt9401 = 0
                while ( /**/anInt9400 > 4096) {
                    anInt9400 -= 4096
                }
                if (anInt9389 < 0) anInt9389 = 0
                if (anInt9401 > 4096) anInt9401 = 4096
                if (anInt9389 > 4096) anInt9389 = 4096
                method3130(anInt9389, anInt9400, (-120).toByte(), anInt9401)
                is_13_[i_16_] = anInt9386
                is_14_[i_16_] = anInt9396
                is_15_[i_16_] = anInt9392
                i_16_++
            }
        }
        if (i_8_ != -1564599039) anInt9399 = 25
        return `is`
    }

    private fun method3129(i: Int, i_17_: Int, i_18_: Byte, i_19_: Int) {
        anInt9394++
        var i_20_ = max(i_17_, i)
        if (i_18_.toInt() == 82) {
            i_20_ = max(i_19_, i_20_)
            var i_21_ = min(i, i_17_)
            i_21_ = min(i_19_, i_21_)
            anInt9389 = (i_20_ + i_21_) / 2
            val i_22_ = i_20_ - i_21_
            if (i_22_ > 0) {
                val i_23_ = (i_20_ + -i shl 12) / i_22_
                val i_24_ = (i_20_ + -i_17_ shl 12) / i_22_
                val i_25_ = (-i_19_ + i_20_ shl 12) / i_22_
                if (i == i_20_) anInt9400 = (if (i_17_ != i_21_) 4096 + -i_24_ else i_25_ + 20480)
                else if (i_17_ != i_20_) anInt9400 = if (i != i_21_) -i_23_ + 20480 else 12288 - -i_24_
                else anInt9400 = (if (i_21_ == i_19_) 4096 + i_23_ else -i_25_ + 12288)
                anInt9400 /= 6
            } else anInt9400 = 0
            if (anInt9389 > 0 && anInt9389 < 4096) anInt9401 = (i_22_ shl 12) / (if (anInt9389 > 2048) 8192 - anInt9389 * 2 else anInt9389 * 2)
            else anInt9401 = 0
        }
    }

    private fun method3130(i: Int, i_26_: Int, i_27_: Byte, i_28_: Int) {
        var i_26_ = i_26_
        anInt9397++
        val i_29_ = 31 / ((i_27_ - -74) / 40)
        val i_30_ = (if (i > 2048) i_28_ + (i - (i * i_28_ shr 12)) else i * (4096 - -i_28_) shr 12)
        if (i_30_ <= 0) {
            anInt9392 = i
            anInt9396 = anInt9392
            anInt9386 = anInt9396
        } else {
            i_26_ *= 6
            val i_31_ = -i_30_ + i - -i
            val i_32_ = (-i_31_ + i_30_ shl 12) / i_30_
            val i_33_ = i_26_ shr 12
            val i_34_ = i_26_ + -(i_33_ shl 12)
            var i_35_ = i_30_
            i_35_ = i_35_ * i_32_ shr 12
            i_35_ = i_35_ * i_34_ shr 12
            val i_36_ = i_35_ + i_31_
            val i_37_ = i_30_ - i_35_
            val i_38_ = i_33_
            while_208_@ do {
                while_207_@ do {
                    while_206_@ do {
                        while_205_@ do {
                            do {
                                if (i_38_ == 0) {
                                    anInt9396 = i_36_
                                    anInt9386 = i_30_
                                    anInt9392 = i_31_
                                    return
                                } else if (i_38_ != 1) {
                                    if (i_38_ != 2) {
                                        if (i_38_ != 3) {
                                            if (i_38_ != 4) {
                                                if (i_38_ != 5) break@while_208_
                                            } else break@while_206_
                                            break@while_207_
                                        }
                                    } else break
                                    break@while_205_
                                }
                                anInt9392 = i_31_
                                anInt9386 = i_37_
                                anInt9396 = i_30_
                                return
                            } while (false)
                            anInt9392 = i_36_
                            anInt9386 = i_31_
                            anInt9396 = i_30_
                            return
                        } while (false)
                        anInt9396 = i_37_
                        anInt9386 = i_31_
                        anInt9392 = i_30_
                        return
                    } while (false)
                    anInt9396 = i_31_
                    anInt9386 = i_36_
                    anInt9392 = i_30_
                    return
                } while (false)
                anInt9386 = i_30_
                anInt9392 = i_37_
                anInt9396 = i_31_
            } while (false)
        }
    }

    override fun method3049(class348_sub49: Class348_Sub49, i: Int, i_39_: Int) {
        while_209_@ do {
            try {
                anInt9384++
                if (i_39_ == 31015) {
                    val i_40_ = i
                    do {
                        if (i_40_ == 0) {
                            anInt9402 = class348_sub49!!.readShort(13638)
                            return
                        } else if (i_40_ != 1) {
                            if (i_40_ == 2) break
                            break@while_209_
                        }
                        anInt9390 = (class348_sub49!!.readByte(-83).toInt() shl 12) / 100
                        return
                    } while (false)
                    anInt9398 = (class348_sub49!!.readByte(i_39_ + -31101).toInt() shl 12) / 100
                    break
                }
                break
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, ("vj.F(" + (if (class348_sub49 != null) "{...}" else "null") + ',' + i + ',' + i_39_ + ')'))
            }
        } while (false)
    }

    companion object {
        @JvmField
        var anInt9383: Int = 0
        @JvmField
        var anInt9384: Int = 0
        @JvmField
        var anInt9385: Int = 0
        @JvmField
        var anInt9387: Int = 0
        @JvmField
        var anInt9388: Int = 0
        @JvmField
        var anInt9391: Int = 0
        @JvmField
        var anInt9393: Int = 0
        @JvmField
        var anInt9394: Int = 0
        @JvmField
        var anInt9395: Int = 0
        @JvmField
        var anInt9397: Int = 0
        @JvmField
        var anInt9399: Int = -1
        @JvmField
        var aBoolean9403: Boolean = false

        @JvmStatic
        fun method3126(i: Byte) {
            if (i.toInt() != 98) anInt9388 = 46
            Class60.aHa1098!!.method3700(Class239_Sub10.aFloat5945, Class348_Sub3.aFloat6586, Class269.aFloat3462)
            anInt9387++
        }

        @JvmStatic
        fun method3127(i: Int): Class348_Sub42_Sub15? {
            anInt9395++
            if (i != 2681) aBoolean9403 = true
            var class348_sub42_sub15 = (Class367_Sub4.aClass107_7325!!.method1011(-47) as Class348_Sub42_Sub15?)
            if (class348_sub42_sub15 != null) {
                class348_sub42_sub15.method2715(81.toByte())
                class348_sub42_sub15.method3162(true)
                return class348_sub42_sub15
            }
            do {
                class348_sub42_sub15 = s_Sub2.aClass107_8241!!.method1011(-87) as Class348_Sub42_Sub15?
                if (class348_sub42_sub15 == null) return null
                if (Class62.method599(-59) < class348_sub42_sub15.method3250((-51).toByte())) return null
                class348_sub42_sub15.method2715(113.toByte())
                class348_sub42_sub15.method3162(true)
            } while ((0x7fffffffffffffffL.inv() and class348_sub42_sub15.aLong7057) == 0L)
            return class348_sub42_sub15
        }

        @JvmStatic
        fun method3128(i: Int, string: String?) {
            do {
                try {
                    anInt9391++
                    if (string != null) {
                        if (anInt9383 >= 200 && !Class206.aBoolean4888 || anInt9383 >= 200) {
                            method544((Class274.aClass274_3493!!.method2063(Class348_Sub33.anInt6967, 544)), false, 4)
                            val string_0_ = Class274.aClass274_3494!!.method2063(Class348_Sub33.anInt6967, 544)
                            if (string_0_ != null) method544(string_0_, false, 4)
                        } else {
                            val string_1_ = method2127(2, string)
                            if (string_1_ != null) {
                                var i_2_ = 0
                                while ((anInt9383 > i_2_)) {
                                    val string_3_ = (method2127(2, Class83.aStringArray1441!![i_2_]))
                                    if (string_3_ != null && string_3_ == string_1_) {
                                        method544((string + (Class274.aClass274_3521!!.method2063((Class348_Sub33.anInt6967), 544))), false, 4)
                                        return
                                    }
                                    if (Class286_Sub2.aStringArray6205!![i_2_] != null) {
                                        val string_4_ = (method2127(2, (Class286_Sub2.aStringArray6205!![i_2_])))
                                        if (string_4_ != null && string_4_ == string_1_) {
                                            method544((string + (Class274.aClass274_3521!!.method2063(Class348_Sub33.anInt6967, 544))), false, 4)
                                            return
                                        }
                                    }
                                    i_2_++
                                }
                                for (i_5_ in 0..<Class348_Sub42_Sub12.anInt9604) {
                                    val string_6_ = (method2127(2, Class51.aStringArray932!![i_5_]))
                                    if (string_6_ != null && string_6_ == string_1_) {
                                        method544(((Class274.aClass274_3526!!.method2063(Class348_Sub33.anInt6967, 544)) + string + (Class274.aClass274_3527!!.method2063(Class348_Sub33.anInt6967, 544))), false, 4)
                                        return
                                    }
                                    if (Class348_Sub40_Sub21.Companion.aStringArray9275!![i_5_] != null) {
                                        val string_7_ = (method2127(2, (Class348_Sub40_Sub21.Companion.aStringArray9275!![i_5_])))
                                        if (string_7_ != null && string_7_ == string_1_) {
                                            method544(((Class274.aClass274_3526!!.method2063(Class348_Sub33.anInt6967, 544)) + string + (Class274.aClass274_3527!!.method2063(Class348_Sub33.anInt6967, 544))), false, 4)
                                            return
                                        }
                                    }
                                }
                                if (method2127(2, (Class132.aPlayer_1907!!.aString10544)) == string_1_) method544((Class274.aClass274_3524!!.method2063(Class348_Sub33.anInt6967, 544)), false, 4)
                                else {
                                    Class146.anInt2012++
                                    val class348_sub47 = (method2148(Class294.aClass351_5057, Class348_Sub23_Sub2.aClass77_9029, -85))
                                    class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByte(false, method1745(string, -65))
                                    class348_sub47.aClass348_Sub49_Sub2_7116!!.writeString((-5).toByte(), string)
                                    Class348_Sub42_Sub14.method3243(123, class348_sub47)
                                    if (i <= -31) break
                                    method3127(-4)
                                }
                            }
                        }
                    }
                } catch (runtimeexception: RuntimeException) {
                    throw Class348_Sub17.method2929(runtimeexception, ("vj.B(" + i + ',' + (if (string != null) "{...}" else "null") + ')'))
                }
                break
            } while (false)
        }
    }
}
