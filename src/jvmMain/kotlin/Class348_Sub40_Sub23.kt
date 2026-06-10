import java.util.*
import kotlin.math.max
import kotlin.math.min

class Class348_Sub40_Sub23 : Class348_Sub40(0, true) {
    private var anInt9306 = 0
    private var anInt9310 = 1024
    private var anInt9311 = 1024
    private var anInt9312 = 0
    private var anInt9314 = 1024
    private var anInt9317 = 1024
    private var anInt9318 = 0
    private var anInt9320 = 2048
    private var anInt9322 = 409
    private var anInt9323 = 819

    override fun method3049(class348_sub49: Class348_Sub49, i: Int, i_0_: Int) {
        anInt9308++
        if (i_0_ != 31015) aBoolean9307 = true
        val i_1_ = i
        while_196_@ do {
            while_195_@ do {
                while_194_@ do {
                    while_193_@ do {
                        while_192_@ do {
                            while_191_@ do {
                                while_190_@ do {
                                    do {
                                        if (i_1_ == 0) {
                                            anInt9318 = class348_sub49.readUnsignedByte(255)
                                            return
                                        } else if (i_1_ != 1) {
                                            if (i_1_ != 2) {
                                                if (i_1_ != 3) {
                                                    if (i_1_ != 4) {
                                                        if (i_1_ != 5) {
                                                            if (i_1_ != 6) {
                                                                if (i_1_ != 7) {
                                                                    if (i_1_ == 8) break@while_195_
                                                                    break@while_196_
                                                                }
                                                            } else break@while_193_
                                                            break@while_194_
                                                        }
                                                    } else break@while_191_
                                                    break@while_192_
                                                }
                                            } else break
                                            break@while_190_
                                        }
                                        anInt9317 = class348_sub49.readUnsignedShort(842397944)
                                        return
                                    } while (false)
                                    anInt9320 = class348_sub49.readUnsignedShort(842397944)
                                    return
                                } while (false)
                                anInt9322 = class348_sub49.readUnsignedShort(i_0_ xor 0x323581df)
                                return
                            } while (false)
                            anInt9323 = class348_sub49.readUnsignedShort(842397944)
                            return
                        } while (false)
                        anInt9311 = class348_sub49.readUnsignedShort(842397944)
                        return
                    } while (false)
                    anInt9312 = class348_sub49.readUnsignedByte(i_0_ xor 0x79d8)
                    return
                } while (false)
                anInt9314 = class348_sub49.readUnsignedShort(842397944)
                return
            } while (false)
            anInt9310 = class348_sub49.readUnsignedShort(842397944)
        } while (false)
    }

    override fun method3044(i: Int) {
        if (i >= 108) anInt9316++
    }

    private fun method3112(i: Int, i_2_: Int, `is`: Array<IntArray?>?, random: Random, i_3_: Int, i_4_: Int, i_5_: Int) {
        var i_3_ = i_3_
        try {
            anInt9309++
            val i_6_ = (if (anInt9310 <= 0) 4096 else 4096 - Class124.method1097(117.toByte(), anInt9310, random))
            val i_7_ = 88 % ((i - 57) / 55)
            val i_8_ = anInt9306 * anInt9314 shr 12
            val i_9_ = (anInt9306 - (if (i_8_ > 0) Class124.method1097(82.toByte(), i_8_, random) else 0))
            if (Class348_Sub40_Sub6.Companion.anInt9139 <= i_3_) i_3_ -= Class348_Sub40_Sub6.Companion.anInt9139
            if (i_9_ <= 0) {
                if (Class348_Sub40_Sub6.Companion.anInt9139 < i_3_ + i_5_) {
                    val i_10_: Int = Class348_Sub40_Sub6.Companion.anInt9139 + -i_3_
                    for (i_11_ in 0..<i_2_) {
                        val is_12_: IntArray = `is`!![i_11_ + i_4_]!!
                        Class214.method1579(is_12_, i_3_, i_10_, i_6_)
                        Class214.method1579(is_12_, 0, i_5_ - i_10_, i_6_)
                    }
                } else {
                    var i_13_ = 0
                    while (i_2_ > i_13_) {
                        Class214.method1579(`is`!![i_13_ + i_4_]!!, i_3_, i_5_, i_6_)
                        i_13_++
                    }
                }
            } else if (i_2_ > 0 && i_5_ > 0) {
                val i_14_ = i_5_ / 2
                val i_15_ = i_2_ / 2
                val i_16_ = min(i_14_, i_9_)
                val i_17_ = min(i_15_, i_9_)
                val i_18_ = i_3_ - -i_16_
                val i_19_ = i_5_ - i_16_ * 2
                for (i_20_ in 0..<i_2_) {
                    val is_21_ = `is`!![i_20_ - -i_4_]!!
                    if (i_20_ < i_17_) {
                        val i_22_ = i_6_ * i_20_ / i_17_
                        if (anInt9312 == 0) {
                            for (i_23_ in 0..<i_16_) {
                                val i_24_ = i_6_ * i_23_ / i_16_
                                is_21_[(Class139.method1166(Class239_Sub22.anInt6076, i_3_ - (-i_5_ + (i_23_ - -1))))] = i_22_ * i_24_ shr 12
                                is_21_[Class139.method1166(i_23_ + i_3_, (Class239_Sub22.anInt6076))] = is_21_[(Class139.method1166(Class239_Sub22.anInt6076, i_3_ - (-i_5_ + (i_23_ - -1))))]
                            }
                        } else {
                            var i_25_ = 0
                            while (i_16_ > i_25_) {
                                val i_26_ = i_6_ * i_25_ / i_16_
                                is_21_[(Class139.method1166(i_3_ - -i_5_ + (-i_25_ - 1), Class239_Sub22.anInt6076))] = min(i_26_, i_22_)
                                is_21_[Class139.method1166((Class239_Sub22.anInt6076), i_25_ + i_3_)] = is_21_[(Class139.method1166(i_3_ - -i_5_ + (-i_25_ - 1), Class239_Sub22.anInt6076))]
                                i_25_++
                            }
                        }
                        if (Class348_Sub40_Sub6.Companion.anInt9139 >= i_19_ + i_18_) Class214.method1579(is_21_, i_18_, i_19_, i_22_)
                        else {
                            val i_27_: Int = -i_18_ + Class348_Sub40_Sub6.Companion.anInt9139
                            Class214.method1579(is_21_, i_18_, i_27_, i_22_)
                            Class214.method1579(is_21_, 0, i_19_ - i_27_, i_22_)
                        }
                    } else {
                        val i_28_ = -1 + (-i_20_ + i_2_)
                        if (i_17_ > i_28_) {
                            val i_29_ = i_28_ * i_6_ / i_17_
                            if (anInt9312 == 0) {
                                var i_30_ = 0
                                while (i_16_ > i_30_) {
                                    val i_31_ = i_6_ * i_30_ / i_16_
                                    is_21_[(Class139.method1166(Class239_Sub22.anInt6076, -1 + i_5_ + i_3_ - i_30_))] = i_31_ * i_29_ shr 12
                                    is_21_[Class139.method1166((Class239_Sub22.anInt6076), i_30_ + i_3_)] = is_21_[(Class139.method1166(Class239_Sub22.anInt6076, -1 + i_5_ + i_3_ - i_30_))]
                                    i_30_++
                                }
                            } else {
                                var i_32_ = 0
                                while ((i_16_ > i_32_)) {
                                    val i_33_ = i_32_ * i_6_ / i_16_
                                    is_21_[(Class139.method1166(Class239_Sub22.anInt6076, -i_32_ + i_5_ + (i_3_ + -1)))] = min(i_29_, i_33_)
                                    is_21_[Class139.method1166((Class239_Sub22.anInt6076), i_3_ + i_32_)] = is_21_[(Class139.method1166(Class239_Sub22.anInt6076, -i_32_ + i_5_ + (i_3_ + -1)))]
                                    i_32_++
                                }
                            }
                            if (i_19_ + i_18_ <= Class348_Sub40_Sub6.Companion.anInt9139) Class214.method1579(is_21_, i_18_, i_19_, i_29_)
                            else {
                                val i_34_: Int = -i_18_ + Class348_Sub40_Sub6.Companion.anInt9139
                                Class214.method1579(is_21_, i_18_, i_34_, i_29_)
                                Class214.method1579(is_21_, 0, -i_34_ + i_19_, i_29_)
                            }
                        } else {
                            for (i_35_ in 0..<i_16_) {
                                is_21_[(Class139.method1166(Class239_Sub22.anInt6076, -i_35_ + (i_3_ - (-i_5_ + 1))))] = i_6_ * i_35_ / i_16_
                                is_21_[Class139.method1166(i_35_ + i_3_, (Class239_Sub22.anInt6076))] = is_21_[(Class139.method1166(Class239_Sub22.anInt6076, -i_35_ + (i_3_ - (-i_5_ + 1))))]
                            }
                            if (Class348_Sub40_Sub6.Companion.anInt9139 >= i_18_ - -i_19_) Class214.method1579(is_21_, i_18_, i_19_, i_6_)
                            else {
                                val i_36_: Int = -i_18_ + Class348_Sub40_Sub6.Companion.anInt9139
                                Class214.method1579(is_21_, i_18_, i_36_, i_6_)
                                Class214.method1579(is_21_, 0, i_19_ - i_36_, i_6_)
                            }
                        }
                    }
                }
            }
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("cc.C(" + i + ',' + i_2_ + ',' + (if (`is` != null) "{...}" else "null") + ',' + (if (random != null) "{...}" else "null") + ',' + i_3_ + ',' + i_4_ + ',' + i_5_ + ')'))
        }
    }

    override fun method3042(i: Int, i_41_: Int): IntArray? {
        anInt9321++
        if (i_41_ != 255) anInt9312 = 113
        val `is` = this.aClass191_7032!!.method1433(0, i)
        if (this.aClass191_7032!!.aBoolean2570) {
            val is_42_ = this.aClass191_7032!!.method1427(16.toByte())!!
            var i_43_ = 0
            var i_44_ = 0
            var i_45_ = 0
            var i_46_ = 0
            var i_47_ = 0
            var bool = true
            var bool_48_ = true
            var i_49_ = 0
            var i_50_ = 0
            val i_51_: Int = anInt9317 * Class348_Sub40_Sub6.Companion.anInt9139 shr 12
            val i_52_: Int = Class348_Sub40_Sub6.Companion.anInt9139 * anInt9320 shr 12
            val i_53_ = anInt9322 * Class286_Sub2.anInt6212 shr 12
            val i_54_ = Class286_Sub2.anInt6212 * anInt9323 shr 12
            if (i_54_ <= 1) return is_42_[i]
            anInt9306 = Class348_Sub40_Sub6.Companion.anInt9139 / 8 * anInt9311 shr 12
            val i_55_: Int = 1 + Class348_Sub40_Sub6.Companion.anInt9139 / i_51_
            var is_56_: Array<IntArray> = Array<IntArray>(i_55_) { IntArray(3) }
            var is_57_: Array<IntArray> = Array<IntArray>(i_55_) { IntArray(3) }
            val random = Random(anInt9318.toLong())
            while (true) {
                var i_58_ = i_51_ + Class124.method1097(106.toByte(), i_52_ - i_51_, random)
                var i_59_ = (Class124.method1097(117.toByte(), -i_53_ + i_54_, random) + i_53_)
                var i_60_ = i_46_ + i_58_
                if (i_60_ > Class348_Sub40_Sub6.Companion.anInt9139) {
                    i_60_ = Class348_Sub40_Sub6.Companion.anInt9139
                    i_58_ = Class348_Sub40_Sub6.Companion.anInt9139 - i_46_
                }
                var i_61_: Int
                if (bool_48_) i_61_ = 0
                else {
                    var i_62_ = i_47_
                    val is_63_ = is_57_[i_47_]
                    var i_64_ = 0
                    var i_65_ = i_43_ + i_60_
                    if (i_65_ < 0) i_65_ += Class348_Sub40_Sub6.Companion.anInt9139
                    if (i_65_ > Class348_Sub40_Sub6.Companion.anInt9139) i_65_ -= Class348_Sub40_Sub6.Companion.anInt9139
                    while (true) {
                        val is_66_ = is_57_[i_62_]
                        if (i_65_ >= is_66_[0] && is_66_[1] >= i_65_) break
                        if (i_49_ <= ++i_62_) i_62_ = 0
                        i_64_++
                    }
                    i_61_ = is_63_[2]
                    if (i_62_ != i_47_) {
                        var i_67_ = i_46_ - -i_43_
                        if (i_67_ < 0) i_67_ += Class348_Sub40_Sub6.Companion.anInt9139
                        if (Class348_Sub40_Sub6.Companion.anInt9139 < i_67_) i_67_ -= Class348_Sub40_Sub6.Companion.anInt9139
                        var i_68_ = 1
                        while (i_64_ >= i_68_) {
                            val is_69_ = is_57_[(i_68_ + i_47_) % i_49_]
                            i_61_ = max(i_61_, is_69_[2])
                            i_68_++
                        }
                        for (i_70_ in 0..i_64_) {
                            val is_71_ = is_57_[(i_47_ - -i_70_) % i_49_]
                            val i_72_ = is_71_[2]
                            if (i_61_ != i_72_) {
                                val i_73_ = is_71_[0]
                                val i_74_ = is_71_[1]
                                val i_75_: Int
                                val i_76_: Int
                                if (i_67_ >= i_65_) {
                                    if (i_73_ == 0) {
                                        i_75_ = 0
                                        i_76_ = min(i_65_, i_74_)
                                    } else {
                                        i_75_ = max(i_67_, i_73_)
                                        i_76_ = Class348_Sub40_Sub6.Companion.anInt9139
                                    }
                                } else {
                                    i_75_ = max(i_67_, i_73_)
                                    i_76_ = min(i_65_, i_74_)
                                }
                                method3112(124, i_61_ - i_72_, is_42_, random, i_45_ + i_75_, i_72_, -i_75_ + i_76_)
                            }
                        }
                    }
                    i_47_ = i_62_
                }
                if (Class286_Sub2.anInt6212 >= i_59_ + i_61_) bool = false
                else i_59_ = -i_61_ + Class286_Sub2.anInt6212
                if (i_60_ == Class348_Sub40_Sub6.Companion.anInt9139) {
                    method3112(-59, i_59_, is_42_, random, i_46_ + i_44_, i_61_, i_58_)
                    if (bool) break
                    bool = true
                    val is_78_ = is_56_[i_50_++]
                    is_78_[1] = i_60_
                    is_78_[2] = i_59_ + i_61_
                    is_78_[0] = i_46_
                    val is_79_ = is_57_
                    is_57_ = is_56_
                    is_56_ = is_79_
                    i_49_ = i_50_
                    i_45_ = i_44_
                    i_50_ = 0
                    i_44_ = Class124.method1097(113.toByte(), Class348_Sub40_Sub6.Companion.anInt9139, random)
                    i_43_ = -i_45_ + i_44_
                    i_46_ = 0
                    var i_80_ = i_43_
                    if (i_80_ < 0) i_80_ += Class348_Sub40_Sub6.Companion.anInt9139
                    i_47_ = 0
                    if (i_80_ > Class348_Sub40_Sub6.Companion.anInt9139) i_80_ -= Class348_Sub40_Sub6.Companion.anInt9139
                    bool_48_ = false
                    while (true) {
                        val is_81_ = is_57_[i_47_]
                        if (i_80_ >= is_81_[0] && i_80_ <= is_81_[1]) break
                        if (i_49_ <= ++i_47_) i_47_ = 0
                    }
                } else {
                    val is_77_ = is_56_[i_50_++]
                    is_77_[1] = i_60_
                    is_77_[0] = i_46_
                    is_77_[2] = i_59_ + i_61_
                    method3112(112, i_59_, is_42_, random, i_46_ + i_44_, i_61_, i_58_)
                    i_46_ = i_60_
                }
            }
        }
        return `is`
    }

    companion object {
        @JvmField
        var aBoolean9307: Boolean = true
        @JvmField
        var anInt9308: Int = 0
        @JvmField
        var anInt9309: Int = 0
        @JvmField
        var anInt9313: Int
        @JvmField
        var anInt9315: Int = 0
        @JvmField
        var anInt9316: Int = 0
        @JvmField
        var aClass348_Sub22Array9319: Array<Class348_Sub22?>? = arrayOfNulls<Class348_Sub22>(1024)
        @JvmField
        var anInt9321: Int = 0
        @JvmStatic
        fun method3113(c: Char, bool: Boolean, string: String): Array<String?> {
            anInt9315++
            val i = Class15.method257(4, string, c)
            val strings = arrayOfNulls<String>(i - -1)
            var i_37_ = 0
            var i_38_ = 0
            if (bool != true) Companion.method3114((-76).toByte())
            for (i_39_ in 0..<i) {
                var i_40_: Int
                i_40_ = i_38_
                while (string.get(i_40_) != c) {
                    i_40_++
                }
                strings[i_37_++] = string.substring(i_38_, i_40_)
                i_38_ = 1 + i_40_
            }
            strings[i] = string.substring(i_38_)
            return strings
        }

        @JvmStatic
        fun method3114(i: Byte) {
            aClass348_Sub22Array9319 = null
            if (i > -63) Companion.method3114((-91).toByte())
        }

        init {
            anInt9313 = 0
        }
    }
}
