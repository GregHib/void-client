import Class155.method1237
import Class239_Sub8.Companion.method1753
import Class286_Sub3.Companion.method2148
import Class299.Companion.method2253
import Class309.Companion.method2307
import Class348_Sub40_Sub7.Companion.method3065
import Class348_Sub9.Companion.method2780
import Class65.Companion.method696

/* Class325 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class325 private constructor(i: Int, i_78_: Int, class68: Class68?) {
    var anInt4069: Int = 0
    var anInt4070: Int = 0
    private val aClass68_4071: Class68?
    private val anInt4072: Int
    override fun toString(): String {
        anInt4066++
        throw IllegalStateException()
    }

    init {
        try {
            anInt4072 = i_78_
            aClass68_4071 = class68
            this.anInt4070 = i
            this.anInt4069 = aClass68_4071!!.anInt1178 * anInt4072
            if (this.anInt4070 >= 16) throw RuntimeException()
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("daa.<init>(" + i + ',' + i_78_ + ',' + (if (class68 != null) "{...}" else "null") + ')'))
        }
    }

    companion object {
        var anInt4066: Int = 0
        var anInt4067: Int = 0
        var anInt4068: Int = 0
        var aClass325_4073: Class325? = Class325(0, 3, Class68.aClass68_1187)
        var anInt4074: Int = 0
        var aClass325_4075: Class325? = Class325(1, 3, Class68.aClass68_1187)
        var aClass325_4076: Class325? = Class325(2, 4, Class68.aClass68_1183)
        var aClass325_4077: Class325? = Class325(3, 1, Class68.aClass68_1187)
        var aClass325_4078: Class325? = Class325(4, 2, Class68.aClass68_1187)
        var aClass325_4079: Class325? = Class325(5, 3, Class68.aClass68_1187)
        var aClass325_4080: Class325? = Class325(6, 4, Class68.aClass68_1187)
        var anInt4081: Int = method2253(16, 119)
        @JvmField
        var aClass138_4082: Class138? = Class138(8, 0, 4, 1)

        fun method2596(i: Int, i_0_: Int): Array<Array<ByteArray?>?> {
            anInt4068++
            val `is` = Array<Array<ByteArray?>?>(8) { arrayOfNulls<ByteArray>(4) }
            val i_1_ = i
            val i_2_ = i
            var is_3_ = ByteArray(i_2_ * i_1_)
            var i_4_ = 0
            var i_5_ = 0
            while (i_2_ > i_5_) {
                for (i_6_ in 0..<i_1_) {
                    if (i_6_ <= i_5_) is_3_[i_4_] = (-1).toByte()
                    i_4_++
                }
                i_5_++
            }
            `is`[0]!![0] = is_3_
            i_4_ = 0
            is_3_ = ByteArray(i_1_ * i_2_)
            for (i_7_ in -1 + i_2_ downTo 0) {
                var i_8_ = 0
                while (i_2_ > i_8_) {
                    if (i_7_ >= i_8_) is_3_[i_4_] = (-1).toByte()
                    i_4_++
                    i_8_++
                }
            }
            `is`[0]!![1] = is_3_
            i_4_ = 0
            is_3_ = ByteArray(i_2_ * i_1_)
            var i_9_ = 0
            while (i_2_ > i_9_) {
                for (i_10_ in 0..<i_1_) {
                    if (i_10_ >= i_9_) is_3_[i_4_] = (-1).toByte()
                    i_4_++
                }
                i_9_++
            }
            if (i_0_ != 12871) aClass325_4078 = null
            `is`[0]!![2] = is_3_
            is_3_ = ByteArray(i_1_ * i_2_)
            i_4_ = 0
            for (i_11_ in -1 + i_2_ downTo 0) {
                for (i_12_ in 0..<i_1_) {
                    if (i_12_ >= i_11_) is_3_[i_4_] = (-1).toByte()
                    i_4_++
                }
            }
            `is`[0]!![3] = is_3_
            i_4_ = 0
            is_3_ = ByteArray(i_2_ * i_1_)
            for (i_13_ in i_2_ + -1 downTo 0) {
                for (i_14_ in 0..<i_1_) {
                    if (i_14_ <= i_13_ shr 1) is_3_[i_4_] = (-1).toByte()
                    i_4_++
                }
            }
            `is`[1]!![0] = is_3_
            is_3_ = ByteArray(i_1_ * i_2_)
            i_4_ = 0
            var i_15_ = 0
            while (i_2_ > i_15_) {
                var i_16_ = 0
                while (i_1_ > i_16_) {
                    if (i_4_ >= 0 && is_3_.size > i_4_) {
                        if (i_16_ >= i_15_ shl 1) is_3_[i_4_] = (-1).toByte()
                        i_4_++
                    } else i_4_++
                    i_16_++
                }
                i_15_++
            }
            `is`[1]!![1] = is_3_
            is_3_ = ByteArray(i_2_ * i_1_)
            i_4_ = 0
            for (i_17_ in 0..<i_2_) {
                for (i_18_ in -1 + i_1_ downTo 0) {
                    if (i_18_ <= i_17_ shr 1) is_3_[i_4_] = (-1).toByte()
                    i_4_++
                }
            }
            `is`[1]!![2] = is_3_
            i_4_ = 0
            is_3_ = ByteArray(i_2_ * i_1_)
            for (i_19_ in -1 + i_2_ downTo 0) {
                for (i_20_ in i_1_ + -1 downTo 0) {
                    if (i_19_ shl 1 <= i_20_) is_3_[i_4_] = (-1).toByte()
                    i_4_++
                }
            }
            `is`[1]!![3] = is_3_
            is_3_ = ByteArray(i_1_ * i_2_)
            i_4_ = 0
            for (i_21_ in i_2_ - 1 downTo 0) {
                for (i_22_ in i_1_ - 1 downTo 0) {
                    if (i_21_ shr 1 >= i_22_) is_3_[i_4_] = (-1).toByte()
                    i_4_++
                }
            }
            `is`[2]!![0] = is_3_
            is_3_ = ByteArray(i_1_ * i_2_)
            i_4_ = 0
            for (i_23_ in -1 + i_2_ downTo 0) {
                var i_24_ = 0
                while (i_1_ > i_24_) {
                    if (i_23_ shl 1 <= i_24_) is_3_[i_4_] = (-1).toByte()
                    i_4_++
                    i_24_++
                }
            }
            `is`[2]!![1] = is_3_
            is_3_ = ByteArray(i_2_ * i_1_)
            i_4_ = 0
            for (i_25_ in 0..<i_2_) {
                var i_26_ = 0
                while (i_1_ > i_26_) {
                    if (i_25_ shr 1 >= i_26_) is_3_[i_4_] = (-1).toByte()
                    i_4_++
                    i_26_++
                }
            }
            `is`[2]!![2] = is_3_
            is_3_ = ByteArray(i_2_ * i_1_)
            i_4_ = 0
            for (i_27_ in 0..<i_2_) {
                for (i_28_ in -1 + i_1_ downTo 0) {
                    if (i_27_ shl 1 <= i_28_) is_3_[i_4_] = (-1).toByte()
                    i_4_++
                }
            }
            `is`[2]!![3] = is_3_
            i_4_ = 0
            is_3_ = ByteArray(i_1_ * i_2_)
            for (i_29_ in -1 + i_2_ downTo 0) {
                var i_30_ = 0
                while (i_1_ > i_30_) {
                    if (i_29_ shr 1 <= i_30_) is_3_[i_4_] = (-1).toByte()
                    i_4_++
                    i_30_++
                }
            }
            `is`[3]!![0] = is_3_
            is_3_ = ByteArray(i_1_ * i_2_)
            i_4_ = 0
            var i_31_ = 0
            while (i_2_ > i_31_) {
                for (i_32_ in 0..<i_1_) {
                    if (i_32_ <= i_31_ shl 1) is_3_[i_4_] = (-1).toByte()
                    i_4_++
                }
                i_31_++
            }
            `is`[3]!![1] = is_3_
            i_4_ = 0
            is_3_ = ByteArray(i_1_ * i_2_)
            var i_33_ = 0
            while (i_2_ > i_33_) {
                for (i_34_ in i_1_ + -1 downTo 0) {
                    if (i_34_ >= i_33_ shr 1) is_3_[i_4_] = (-1).toByte()
                    i_4_++
                }
                i_33_++
            }
            `is`[3]!![2] = is_3_
            i_4_ = 0
            is_3_ = ByteArray(i_1_ * i_2_)
            for (i_35_ in i_2_ - 1 downTo 0) {
                for (i_36_ in i_1_ + -1 downTo 0) {
                    if (i_36_ <= i_35_ shl 1) is_3_[i_4_] = (-1).toByte()
                    i_4_++
                }
            }
            `is`[3]!![3] = is_3_
            is_3_ = ByteArray(i_1_ * i_2_)
            i_4_ = 0
            for (i_37_ in -1 + i_2_ downTo 0) {
                for (i_38_ in i_1_ - 1 downTo 0) {
                    if (i_37_ shr 1 <= i_38_) is_3_[i_4_] = (-1).toByte()
                    i_4_++
                }
            }
            `is`[4]!![0] = is_3_
            is_3_ = ByteArray(i_2_ * i_1_)
            i_4_ = 0
            for (i_39_ in i_2_ + -1 downTo 0) {
                var i_40_ = 0
                while (i_1_ > i_40_) {
                    if (i_40_ <= i_39_ shl 1) is_3_[i_4_] = (-1).toByte()
                    i_4_++
                    i_40_++
                }
            }
            `is`[4]!![1] = is_3_
            i_4_ = 0
            is_3_ = ByteArray(i_1_ * i_2_)
            var i_41_ = 0
            while (i_2_ > i_41_) {
                for (i_42_ in 0..<i_1_) {
                    if (i_41_ shr 1 <= i_42_) is_3_[i_4_] = (-1).toByte()
                    i_4_++
                }
                i_41_++
            }
            `is`[4]!![2] = is_3_
            is_3_ = ByteArray(i_1_ * i_2_)
            i_4_ = 0
            for (i_43_ in 0..<i_2_) {
                for (i_44_ in -1 + i_1_ downTo 0) {
                    if (i_44_ <= i_43_ shl 1) is_3_[i_4_] = (-1).toByte()
                    i_4_++
                }
            }
            `is`[4]!![3] = is_3_
            is_3_ = ByteArray(i_2_ * i_1_)
            i_4_ = 0
            var i_45_ = 0
            while (i_2_ > i_45_) {
                var i_46_ = 0
                while (i_1_ > i_46_) {
                    if (i_1_ / 2 >= i_46_) is_3_[i_4_] = (-1).toByte()
                    i_4_++
                    i_46_++
                }
                i_45_++
            }
            `is`[5]!![0] = is_3_
            i_4_ = 0
            is_3_ = ByteArray(i_1_ * i_2_)
            var i_47_ = 0
            while (i_2_ > i_47_) {
                var i_48_ = 0
                while (i_1_ > i_48_) {
                    if (i_47_ <= i_2_ / 2) is_3_[i_4_] = (-1).toByte()
                    i_4_++
                    i_48_++
                }
                i_47_++
            }
            `is`[5]!![1] = is_3_
            i_4_ = 0
            is_3_ = ByteArray(i_2_ * i_1_)
            for (i_49_ in 0..<i_2_) {
                for (i_50_ in 0..<i_1_) {
                    if (i_1_ / 2 <= i_50_) is_3_[i_4_] = (-1).toByte()
                    i_4_++
                }
            }
            `is`[5]!![2] = is_3_
            i_4_ = 0
            is_3_ = ByteArray(i_2_ * i_1_)
            for (i_51_ in 0..<i_2_) {
                var i_52_ = 0
                while (i_1_ > i_52_) {
                    if (i_51_ >= i_2_ / 2) is_3_[i_4_] = (-1).toByte()
                    i_4_++
                    i_52_++
                }
            }
            `is`[5]!![3] = is_3_
            is_3_ = ByteArray(i_1_ * i_2_)
            i_4_ = 0
            for (i_53_ in 0..<i_2_) {
                for (i_54_ in 0..<i_1_) {
                    if (i_54_ <= i_53_ - i_2_ / 2) is_3_[i_4_] = (-1).toByte()
                    i_4_++
                }
            }
            `is`[6]!![0] = is_3_
            is_3_ = ByteArray(i_2_ * i_1_)
            i_4_ = 0
            for (i_55_ in -1 + i_2_ downTo 0) {
                var i_56_ = 0
                while (i_1_ > i_56_) {
                    if (i_56_ <= i_55_ - i_2_ / 2) is_3_[i_4_] = (-1).toByte()
                    i_4_++
                    i_56_++
                }
            }
            `is`[6]!![1] = is_3_
            i_4_ = 0
            is_3_ = ByteArray(i_1_ * i_2_)
            for (i_57_ in -1 + i_2_ downTo 0) {
                for (i_58_ in i_1_ - 1 downTo 0) {
                    if (i_58_ <= -(i_2_ / 2) + i_57_) is_3_[i_4_] = (-1).toByte()
                    i_4_++
                }
            }
            `is`[6]!![2] = is_3_
            i_4_ = 0
            is_3_ = ByteArray(i_2_ * i_1_)
            var i_59_ = 0
            while (i_2_ > i_59_) {
                for (i_60_ in -1 + i_1_ downTo 0) {
                    if (i_60_ <= -(i_2_ / 2) + i_59_) is_3_[i_4_] = (-1).toByte()
                    i_4_++
                }
                i_59_++
            }
            `is`[6]!![3] = is_3_
            is_3_ = ByteArray(i_1_ * i_2_)
            i_4_ = 0
            for (i_61_ in 0..<i_2_) {
                for (i_62_ in 0..<i_1_) {
                    if (i_62_ >= i_61_ + -(i_2_ / 2)) is_3_[i_4_] = (-1).toByte()
                    i_4_++
                }
            }
            `is`[7]!![0] = is_3_
            i_4_ = 0
            is_3_ = ByteArray(i_2_ * i_1_)
            for (i_63_ in -1 + i_2_ downTo 0) {
                for (i_64_ in 0..<i_1_) {
                    if (i_64_ >= i_63_ - i_2_ / 2) is_3_[i_4_] = (-1).toByte()
                    i_4_++
                }
            }
            `is`[7]!![1] = is_3_
            i_4_ = 0
            is_3_ = ByteArray(i_2_ * i_1_)
            for (i_65_ in i_2_ + -1 downTo 0) {
                for (i_66_ in -1 + i_1_ downTo 0) {
                    if (-(i_2_ / 2) + i_65_ <= i_66_) is_3_[i_4_] = (-1).toByte()
                    i_4_++
                }
            }
            `is`[7]!![2] = is_3_
            i_4_ = 0
            is_3_ = ByteArray(i_2_ * i_1_)
            for (i_67_ in 0..<i_2_) {
                for (i_68_ in i_1_ - 1 downTo 0) {
                    if (i_68_ >= -(i_2_ / 2) + i_67_) is_3_[i_4_] = (-1).toByte()
                    i_4_++
                }
            }
            `is`[7]!![3] = is_3_
            return `is`
        }

        @JvmStatic
        fun method2597(i: Int) {
            aClass325_4073 = null
            aClass325_4080 = null
            aClass325_4078 = null
            aClass138_4082 = null
            aClass325_4077 = null
            aClass325_4079 = null
            if (i == -27327) {
                aClass325_4076 = null
                aClass325_4075 = null
            }
        }

        fun method2598(i: Int, i_69_: Int): Class325? {
            anInt4074++
            val i_70_ = -44 / ((-47 - i_69_) / 45)
            val i_71_ = i
            while_118_@ do {
                while_117_@ do {
                    while_116_@ do {
                        while_115_@ do {
                            while_114_@ do {
                                do {
                                    if (i_71_ != 0) {
                                        if (i_71_ != 1) {
                                            if (i_71_ != 2) {
                                                if (i_71_ != 3) {
                                                    if (i_71_ != 4) {
                                                        if (i_71_ != 5) {
                                                            if (i_71_ == 6) break@while_117_
                                                            break@while_118_
                                                        }
                                                    } else break@while_115_
                                                    break@while_116_
                                                }
                                            } else break
                                            break@while_114_
                                        }
                                    } else return aClass325_4073
                                    return aClass325_4075
                                } while (false)
                                return aClass325_4076
                            } while (false)
                            return aClass325_4077
                        } while (false)
                        return aClass325_4078
                    } while (false)
                    return aClass325_4079
                } while (false)
                return aClass325_4080
            } while (false)
            return null
        }

        fun method2599(i: Byte, class348_sub42_sub12: Class348_Sub42_Sub12?, i_72_: Int, i_73_: Int) {
            do {
                try {
                    anInt4067++
                    if (class348_sub42_sub12 != null && (class348_sub42_sub12 != (Class348_Sub40_Sub4.aClass262_9111!!.aClass348_3334))) {
                        val i_74_ = (class348_sub42_sub12.anInt9602)
                        val i_75_ = (class348_sub42_sub12.anInt9607)
                        var i_76_ = (class348_sub42_sub12.anInt9608)
                        val i_77_ = (class348_sub42_sub12.aLong9605).toInt()
                        if (i_76_ >= 2000) i_76_ -= 2000
                        val l = (class348_sub42_sub12.aLong9605)
                        if (i_76_ == 19) {
                            if (Class192.anInt2581 <= 0 || !Class182.aClass346_2449!!.method2696(82, -125) || !Class182.aClass346_2449!!.method2696(81, -126)) {
                                val class348_sub47 = Class348_Sub14.method2807(i_75_, i_74_, (-110).toByte(), i_77_)!!
                                if (i_77_ == 1) {
                                    class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByte(false, -1)
                                    class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByte(false, -1)
                                    class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShort(107.toByte(), Class314.aFloat3938.toInt())
                                    class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByte(false, 57)
                                    class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByte(false, r_Sub2.anInt10483)
                                    class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByte(false, Class348_Sub49_Sub1.anInt9750)
                                    class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByte(false, 89)
                                    class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShort(107.toByte(), (Class132.aPlayer_1907!!.x))
                                    class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShort(107.toByte(), (Class132.aPlayer_1907!!.y))
                                    class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByte(false, 63)
                                } else {
                                    Class93.anInt1534 = i_72_
                                    Class26.anInt385 = i_73_
                                    Class348.anInt4292 = 0
                                    Class239_Sub20.anInt6048 = 1
                                }
                                Class348_Sub42_Sub14.method3243(123, class348_sub47)
                                Class298.method2252(true, i_74_, i_75_, (-120).toByte(), 1, 0, 1, -4, 0)
                            } else Class361.method3502(i_75_ + Class90.regionTileY, 2, (Class132.aPlayer_1907!!.plane).toInt(), i_74_ + za_Sub2.regionTileX)
                        }
                        if (i_76_ == 4) {
                            Class93.anInt1534 = i_72_
                            Class239_Sub20.anInt6048 = 2
                            Class26.anInt385 = i_73_
                            Class348.anInt4292 = 0
                            Class21.anInt321++
                            val class348_sub47 = method2148((Class348_Sub42_Sub8.aClass351_9553), (Class348_Sub23_Sub2.aClass77_9029), -113)
                            class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShortAddLittle(4325, Class90.regionTileY + i_75_)
                            class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShortAdd(120, i_74_ + za_Sub2.regionTileX)
                            class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByteSubtract(117.toByte(), (if (!Class182.aClass346_2449!!.method2696(82, -122)) 0 else 1))
                            class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShortAddLittle(4325, 0x7fffffff and (l ushr 32).toInt())
                            Class348_Sub42_Sub14.method3243(117, class348_sub47)
                            method2307(i_75_, l, i_74_, 51)
                        }
                        if (i_76_ == 1008) {
                            Class239_Sub20.anInt6048 = 2
                            Class93.anInt1534 = i_72_
                            Class26.anInt385 = i_73_
                            Class348.anInt4292 = 0
                            val class348_sub22 = (Class282.aClass356_3654!!.method3480(i_77_.toLong(), -6008) as Class348_Sub22?)
                            if (class348_sub22 != null) {
                                val npc = (class348_sub22.aNpc_6859)!!
                                var class79 = (npc.aClass79_10505)
                                if (class79!!.anIntArray1377 != null) class79 = (class79.method794((Class318_Sub1_Sub3_Sub3.aClass170_10209!!), -1))
                                if (class79 != null) {
                                    Class306.anInt3874++
                                    val class348_sub47 = (method2148(Class318_Sub7.aClass351_6443, Class348_Sub23_Sub2.aClass77_9029, -111))
                                    class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShort(107.toByte(), class79.anInt1344)
                                    Class348_Sub42_Sub14.method3243(-99, class348_sub47)
                                }
                            }
                        }
                        if (i_76_ == 48) {
                            val player = (Class294.aPlayerArray5058!![i_77_])
                            if (player != null) {
                                Class348.anInt4292 = 0
                                Class93.anInt1534 = i_72_
                                Class26.anInt385 = i_73_
                                Class216.anInt4979++
                                Class239_Sub20.anInt6048 = 2
                                val class348_sub47 = (method2148(Class348_Sub42_Sub18.aClass351_9684, Class348_Sub23_Sub2.aClass77_9029, -126))
                                class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShortAdd(81, i_77_)
                                class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByte(false, (if (!Class182.aClass346_2449!!.method2696(82, -126)) 0 else 1))
                                Class348_Sub42_Sub14.method3243(116, class348_sub47)
                                Class298.method2252(true, (player.anIntArray10320!![0]), (player.anIntArray10317!![0]), (-89).toByte(), player.method2436(106.toByte()), 0, player.method2436(43.toByte()), -2, 0)
                            }
                        }
                        if (i_76_ == 49) {
                            Class26.anInt385 = i_73_
                            Class348.anInt4292 = 0
                            Class239_Sub20.anInt6048 = 2
                            Class93.anInt1534 = i_72_
                            Class205.anInt2689++
                            val class348_sub47 = method2148(Class344.aClass351_4262, (Class348_Sub23_Sub2.aClass77_9029), -107)
                            class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShortLittle(i_74_ + za_Sub2.regionTileX, 3.toByte())
                            class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShortAdd(-107, i_77_)
                            class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShortLittle(Class9.anInt169, 3.toByte())
                            class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShort(107.toByte(), Class90.regionTileY + i_75_)
                            class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByte(false, (if (!Class182.aClass346_2449!!.method2696(82, -126)) 0 else 1))
                            class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShortAdd(90, Class301.anInt3829)
                            class348_sub47.aClass348_Sub49_Sub2_7116!!.writeIntMiddle(Class149.anInt2046, 44.toByte())
                            Class348_Sub42_Sub14.method3243(120, class348_sub47)
                            Class348_Sub42_Sub18.method3275(1, i_75_, i_74_)
                        }
                        if (i_76_ == 6) {
                            val class46 = Class348_Sub22.method2957(i_74_, (-54).toByte(), i_75_)
                            if (class46 != null) method1237(71.toByte(), class46)
                        }
                        if (i_76_ == 5) {
                            Class348.anInt4292 = 0
                            Class15.anInt226++
                            Class26.anInt385 = i_73_
                            Class239_Sub20.anInt6048 = 2
                            Class93.anInt1534 = i_72_
                            val class348_sub47 = method2148(Class190.aClass351_2539, (Class348_Sub23_Sub2.aClass77_9029), -110)
                            class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShort(107.toByte(), Class90.regionTileY + i_75_)
                            class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShortAdd(-110, i_74_ + za_Sub2.regionTileX)
                            class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByteInverse((-44).toByte(), (if (!Class182.aClass346_2449!!.method2696(82, -122)) 0 else 1))
                            class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShortAdd(97, i_77_)
                            Class348_Sub42_Sub14.method3243(118, class348_sub47)
                            Class348_Sub42_Sub18.method3275(1, i_75_, i_74_)
                        }
                        if (i_76_ == 46) {
                            val class348_sub22 = (Class282.aClass356_3654!!.method3480(i_77_.toLong(), -6008) as Class348_Sub22?)
                            if (class348_sub22 != null) {
                                Class348.anInt4292 = 0
                                Class187.anInt2499++
                                Class26.anInt385 = i_73_
                                Class239_Sub20.anInt6048 = 2
                                Class93.anInt1534 = i_72_
                                val npc = (class348_sub22.aNpc_6859)!!
                                val class348_sub47 = (method2148(Class318_Sub1_Sub5_Sub1.aClass351_10134, Class348_Sub23_Sub2.aClass77_9029, -96))
                                class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShortLittle(i_77_, 3.toByte())
                                class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByteAdd(124.toByte(), (if (Class182.aClass346_2449!!.method2696(82, -121)) 1 else 0))
                                Class348_Sub42_Sub14.method3243(117, class348_sub47)
                                Class298.method2252(true, (npc.anIntArray10320!![0]), (npc.anIntArray10317!![0]), (-100).toByte(), npc.method2436(68.toByte()), 0, npc.method2436(106.toByte()), -2, 0)
                            }
                        }
                        if (i_76_ == 11) {
                            val player = (Class294.aPlayerArray5058!![i_77_])
                            if (player != null) {
                                Class348.anInt4292 = 0
                                Class127.anInt4657++
                                Class93.anInt1534 = i_72_
                                Class239_Sub20.anInt6048 = 2
                                Class26.anInt385 = i_73_
                                val class348_sub47 = method2148((Class239_Sub9.aClass351_5929), (Class348_Sub23_Sub2.aClass77_9029), -94)
                                class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShortAddLittle(4325, i_77_)
                                class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByteInverse((-108).toByte(), (if (Class182.aClass346_2449!!.method2696(82, -124)) 1 else 0))
                                Class348_Sub42_Sub14.method3243(119, class348_sub47)
                                Class298.method2252(true, (player.anIntArray10320!![0]), (player.anIntArray10317!![0]), (-128).toByte(), player.method2436(53.toByte()), 0, player.method2436(110.toByte()), -2, 0)
                            }
                        }
                        if (i_76_ == 59) {
                            Class26.anInt385 = i_73_
                            Class93.anInt1534 = i_72_
                            Class348.anInt4292 = 0
                            Class178.anInt2336++
                            Class239_Sub20.anInt6048 = 2
                            val class348_sub47 = method2148((Class101_Sub1.aClass351_5677), (Class348_Sub23_Sub2.aClass77_9029), -83)
                            class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByteAdd(86.toByte(), (if (!Class182.aClass346_2449!!.method2696(82, -121)) 0 else 1))
                            class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShortAdd(31, (l ushr 32).toInt() and 0x7fffffff)
                            class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShortAdd(-104, za_Sub2.regionTileX + i_74_)
                            class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShortLittle(Class90.regionTileY + i_75_, 3.toByte())
                            Class348_Sub42_Sub14.method3243(119, class348_sub47)
                            method2307(i_75_, l, i_74_, 93)
                        }
                        if (i_76_ == 30) {
                            val class348_sub22 = (Class282.aClass356_3654!!.method3480(i_77_.toLong(), -6008) as Class348_Sub22?)
                            if (class348_sub22 != null) {
                                Class348.anInt4292 = 0
                                Class93.anInt1534 = i_72_
                                Class26.anInt385 = i_73_
                                val npc = (class348_sub22.aNpc_6859)!!
                                Class239_Sub20.anInt6048 = 2
                                Class348_Sub7.anInt6646++
                                val class348_sub47 = method2148((Class131.aClass351_1904), (Class348_Sub23_Sub2.aClass77_9029), -119)
                                class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShortAddLittle(4325, Class9.anInt169)
                                class348_sub47.aClass348_Sub49_Sub2_7116!!.writeInt(108.toByte(), Class149.anInt2046)
                                class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShortLittle(i_77_, 3.toByte())
                                class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByteAdd((-89).toByte(), (if (!Class182.aClass346_2449!!.method2696(82, -127)) 0 else 1))
                                class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShortAdd(-116, Class301.anInt3829)
                                Class348_Sub42_Sub14.method3243(122, class348_sub47)
                                Class298.method2252(true, (npc.anIntArray10320!![0]), (npc.anIntArray10317!![0]), (-107).toByte(), npc.method2436(88.toByte()), 0, npc.method2436(108.toByte()), -2, 0)
                            }
                        }
                        if (i_76_ == 12) {
                            if (Class192.anInt2581 > 0 && Class182.aClass346_2449!!.method2696(82, -127) && Class182.aClass346_2449!!.method2696(81, -126)) Class361.method3502(i_75_ + Class90.regionTileY, 2, (Class132.aPlayer_1907!!.plane).toInt(), za_Sub2.regionTileX - -i_74_)
                            else {
                                Class93.anInt1534 = i_72_
                                Class26.anInt385 = i_73_
                                Class55.anInt994++
                                Class348.anInt4292 = 0
                                Class239_Sub20.anInt6048 = 1
                                val class348_sub47 = method2148((Class195.aClass351_5015), (Class348_Sub23_Sub2.aClass77_9029), -123)
                                class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShortAdd(101, za_Sub2.regionTileX + i_74_)
                                class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShort(107.toByte(), Class90.regionTileY - -i_75_)
                                Class348_Sub42_Sub14.method3243(6, class348_sub47)
                            }
                        }
                        if (i_76_ == 1001) {
                            Class93.anInt1534 = i_72_
                            Class35.anInt484++
                            Class239_Sub20.anInt6048 = 2
                            Class348.anInt4292 = 0
                            Class26.anInt385 = i_73_
                            val class348_sub47 = method2148(Class205.aClass351_2691, (Class348_Sub23_Sub2.aClass77_9029), -115)
                            class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShort(107.toByte(), i_77_)
                            Class348_Sub42_Sub14.method3243(-60, class348_sub47)
                        }
                        if (i_76_ == 51) {
                            val player = (Class294.aPlayerArray5058!![i_77_])
                            if (player != null) {
                                Class26.anInt385 = i_73_
                                Class239_Sub20.anInt6048 = 2
                                Class228.anInt2975++
                                Class348.anInt4292 = 0
                                Class93.anInt1534 = i_72_
                                val class348_sub47 = method2148((Class52.aClass351_4907), (Class348_Sub23_Sub2.aClass77_9029), -93)
                                class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShortAddLittle(4325, Class9.anInt169)
                                class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShortLittle(i_77_, 3.toByte())
                                class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShortLittle(Class301.anInt3829, 3.toByte())
                                class348_sub47.aClass348_Sub49_Sub2_7116!!.writeIntInverseMiddle(Class149.anInt2046, -4086)
                                class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByteInverse((-89).toByte(), (if (Class182.aClass346_2449!!.method2696(82, -127)) 1 else 0))
                                Class348_Sub42_Sub14.method3243(-33, class348_sub47)
                                Class298.method2252(true, (player.anIntArray10320!![0]), (player.anIntArray10317!![0]), (-88).toByte(), player.method2436(44.toByte()), 0, player.method2436(110.toByte()), -2, 0)
                            }
                        }
                        if (i_76_ == 45) {
                            val player = (Class294.aPlayerArray5058!![i_77_])
                            if (player != null) {
                                Class348.anInt4292 = 0
                                Class93.anInt1534 = i_72_
                                Class101.anInt1596++
                                Class239_Sub20.anInt6048 = 2
                                Class26.anInt385 = i_73_
                                val class348_sub47 = method2148((Class299_Sub1_Sub2.aClass351_8706), (Class348_Sub23_Sub2.aClass77_9029), -84)
                                class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByteSubtract((-125).toByte(), (if (Class182.aClass346_2449!!.method2696(82, -126)) 1 else 0))
                                class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShortLittle(i_77_, 3.toByte())
                                Class348_Sub42_Sub14.method3243(30, class348_sub47)
                                Class298.method2252(true, (player.anIntArray10320!![0]), (player.anIntArray10317!![0]), (-91).toByte(), player.method2436(70.toByte()), 0, player.method2436(125.toByte()), -2, 0)
                            }
                        }
                        if (i_76_ == 1007) {
                            Class239_Sub20.anInt6048 = 2
                            Class318_Sub1_Sub5_Sub2.anInt10164++
                            Class26.anInt385 = i_73_
                            Class348.anInt4292 = 0
                            Class93.anInt1534 = i_72_
                            val class348_sub47 = method2148(Class193.aClass351_2587, (Class348_Sub23_Sub2.aClass77_9029), -112)
                            class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShortLittle(Class90.regionTileY + i_75_, 3.toByte())
                            class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByteAdd((-96).toByte(), (if (Class182.aClass346_2449!!.method2696(82, -125)) 1 else 0))
                            class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShortAddLittle(4325, za_Sub2.regionTileX + i_74_)
                            class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShortAdd(68, 0x7fffffff and (l ushr 32).toInt())
                            Class348_Sub42_Sub14.method3243(-68, class348_sub47)
                            method2307(i_75_, l, i_74_, 25)
                        }
                        if (i_76_ == 23) {
                            val player = (Class294.aPlayerArray5058!![i_77_])
                            if (player != null) {
                                Class239_Sub20.anInt6048 = 2
                                Class318_Sub1_Sub4_Sub1.anInt10073++
                                Class348.anInt4292 = 0
                                Class26.anInt385 = i_73_
                                Class93.anInt1534 = i_72_
                                val class348_sub47 = method2148((Class52.aClass351_4905), (Class348_Sub23_Sub2.aClass77_9029), -113)
                                class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShort(107.toByte(), i_77_)
                                class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByteAdd(60.toByte(), (if (!Class182.aClass346_2449!!.method2696(82, -121)) 0 else 1))
                                Class348_Sub42_Sub14.method3243(118, class348_sub47)
                                Class298.method2252(true, (player.anIntArray10320!![0]), (player.anIntArray10317!![0]), (-106).toByte(), player.method2436(45.toByte()), 0, player.method2436(63.toByte()), -2, 0)
                            }
                        }
                        if (i_76_ == 16 && Class49.aClass46_4730 == null) {
                            method3065(i_75_, false, i_74_)
                            Class49.aClass46_4730 = Class348_Sub22.method2957(i_74_, (-54).toByte(), i_75_)
                            Class251.method1916(-9343, Class49.aClass46_4730!!)
                        }
                        if (i_76_ == 8) {
                            val player = (Class294.aPlayerArray5058!![i_77_])
                            if (player != null) {
                                Class93.anInt1534 = i_72_
                                Class26.anInt385 = i_73_
                                Class239_Sub20.anInt6048 = 2
                                Class296.anInt3768++
                                Class348.anInt4292 = 0
                                val class348_sub47 = method2148((Class251.aClass351_3232), (Class348_Sub23_Sub2.aClass77_9029), -84)
                                class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByte(false, (if (!Class182.aClass346_2449!!.method2696(82, -128)) 0 else 1))
                                class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShortAdd(-99, i_77_)
                                Class348_Sub42_Sub14.method3243(127, class348_sub47)
                                Class298.method2252(true, (player.anIntArray10320!![0]), (player.anIntArray10317!![0]), (-106).toByte(), player.method2436(100.toByte()), 0, player.method2436(99.toByte()), -2, 0)
                            }
                        }
                        if (i_76_ == 21) {
                            Class93.anInt1534 = i_72_
                            Class239_Sub8.anInt5919++
                            Class348.anInt4292 = 0
                            Class239_Sub20.anInt6048 = 2
                            Class26.anInt385 = i_73_
                            val class348_sub47 = method2148(r_Sub1.aClass351_10477, (Class348_Sub23_Sub2.aClass77_9029), -107)
                            class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShort(107.toByte(), i_77_)
                            class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShort(107.toByte(), za_Sub2.regionTileX + i_74_)
                            class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShort(107.toByte(), i_75_ + Class90.regionTileY)
                            class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByteSubtract(120.toByte(), (if (!Class182.aClass346_2449!!.method2696(82, -123)) 0 else 1))
                            Class348_Sub42_Sub14.method3243(120, class348_sub47)
                            Class348_Sub42_Sub18.method3275(1, i_75_, i_74_)
                        }
                        if (i_76_ == 15) {
                            Class239_Sub20.anInt6048 = 1
                            Class26.anInt385 = i_73_
                            Class348.anInt4292 = 0
                            Class93.anInt1534 = i_72_
                            Client.anInt5187++
                            val class348_sub47 = method2148(Class344.aClass351_4264, (Class348_Sub23_Sub2.aClass77_9029), -127)
                            class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShortLittle(za_Sub2.regionTileX - -i_74_, 3.toByte())
                            class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShortAdd(-85, Class301.anInt3829)
                            class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShortLittle(Class9.anInt169, 3.toByte())
                            class348_sub47.aClass348_Sub49_Sub2_7116!!.writeInt(127.toByte(), Class149.anInt2046)
                            class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShortAdd(-84, Class90.regionTileY + i_75_)
                            Class348_Sub42_Sub14.method3243(-62, class348_sub47)
                            Class298.method2252(true, i_74_, i_75_, (-91).toByte(), 1, 0, 1, -4, 0)
                        }
                        if (i_76_ == 60) {
                            val class348_sub22 = (Class282.aClass356_3654!!.method3480(i_77_.toLong(), -6008) as Class348_Sub22?)
                            if (class348_sub22 != null) {
                                Class290.anInt3707++
                                Class348.anInt4292 = 0
                                Class26.anInt385 = i_73_
                                Class93.anInt1534 = i_72_
                                val npc = (class348_sub22.aNpc_6859)!!
                                Class239_Sub20.anInt6048 = 2
                                val class348_sub47 = (method2148(RuntimeException_Sub1.aClass351_4601, Class348_Sub23_Sub2.aClass77_9029, -123))
                                class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShort(107.toByte(), i_77_)
                                class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByteInverse((-67).toByte(), (if (Class182.aClass346_2449!!.method2696(82, -122)) 1 else 0))
                                Class348_Sub42_Sub14.method3243(119, class348_sub47)
                                Class298.method2252(true, (npc.anIntArray10320!![0]), (npc.anIntArray10317!![0]), (-111).toByte(), npc.method2436(65.toByte()), 0, npc.method2436(42.toByte()), -2, 0)
                            }
                        }
                        if (i_76_ == 2) {
                            Class348.anInt4292 = 0
                            Class239_Sub20.anInt6048 = 2
                            r_Sub1.anInt10476++
                            Class26.anInt385 = i_73_
                            Class93.anInt1534 = i_72_
                            val class348_sub47 = method2148((Class348_Sub16_Sub1.aClass351_8857), (Class348_Sub23_Sub2.aClass77_9029), -105)
                            class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShort(107.toByte(), Class301.anInt3829)
                            class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShortAddLittle(4325, za_Sub2.regionTileX + i_74_)
                            class348_sub47.aClass348_Sub49_Sub2_7116!!.writeIntLittle(-128, Class149.anInt2046)
                            class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShortAdd(-82, Class90.regionTileY + i_75_)
                            class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByteSubtract((-74).toByte(), (if (!Class182.aClass346_2449!!.method2696(82, -125)) 0 else 1))
                            class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShortLittle(Class9.anInt169, 3.toByte())
                            class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShortLittle((l ushr 32).toInt() and 0x7fffffff, 3.toByte())
                            Class348_Sub42_Sub14.method3243(117, class348_sub47)
                            method2307(i_75_, l, i_74_, 4)
                        }
                        if (i_76_ == 58) {
                            val player = (Class294.aPlayerArray5058!![i_77_])
                            if (player != null) {
                                Class348.anInt4292 = 0
                                Class93.anInt1534 = i_72_
                                Class26.anInt385 = i_73_
                                Class239_Sub20.anInt6048 = 2
                                Class98.anInt1570++
                                val class348_sub47 = method2148((Class175.aClass351_2315), (Class348_Sub23_Sub2.aClass77_9029), -90)
                                class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByte(false, (if (!Class182.aClass346_2449!!.method2696(82, -121)) 0 else 1))
                                class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShortAdd(52, i_77_)
                                Class348_Sub42_Sub14.method3243(-127, class348_sub47)
                                Class298.method2252(true, (player.anIntArray10320!![0]), (player.anIntArray10317!![0]), (-93).toByte(), player.method2436(119.toByte()), 0, player.method2436(54.toByte()), -2, 0)
                            }
                        }
                        if (i_76_ == 17) {
                            val player = (Class294.aPlayerArray5058!![i_77_])
                            if (player != null) {
                                Class239_Sub20.anInt6048 = 2
                                Class93.anInt1534 = i_72_
                                Class14_Sub3.anInt8625++
                                Class26.anInt385 = i_73_
                                Class348.anInt4292 = 0
                                val class348_sub47 = method2148((Class25.aClass351_364), (Class348_Sub23_Sub2.aClass77_9029), -113)
                                class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByte(false, (if (!Class182.aClass346_2449!!.method2696(82, -126)) 0 else 1))
                                class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShort(107.toByte(), i_77_)
                                Class348_Sub42_Sub14.method3243(121, class348_sub47)
                                Class298.method2252(true, (player.anIntArray10320!![0]), (player.anIntArray10317!![0]), (-123).toByte(), player.method2436(96.toByte()), 0, player.method2436(97.toByte()), -2, 0)
                            }
                        }
                        if (i_76_ == 47) {
                            Class26.anInt385 = i_73_
                            Class239_Sub20.anInt6048 = 2
                            Class348.anInt4292 = 0
                            Class316.anInt3966++
                            Class93.anInt1534 = i_72_
                            val class348_sub47 = method2148((Class348_Sub49_Sub1.aClass351_9749), (Class348_Sub23_Sub2.aClass77_9029), -81)
                            class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShort(107.toByte(), i_77_)
                            class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShortAdd(106, i_74_ - -za_Sub2.regionTileX)
                            class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByte(false, (if (!Class182.aClass346_2449!!.method2696(82, -128)) 0 else 1))
                            class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShortAddLittle(4325, i_75_ - -Class90.regionTileY)
                            Class348_Sub42_Sub14.method3243(116, class348_sub47)
                            Class348_Sub42_Sub18.method3275(1, i_75_, i_74_)
                        }
                        if (i_76_ == 3) {
                            Class151.anInt2065++
                            Class26.anInt385 = i_73_
                            Class348.anInt4292 = 0
                            Class239_Sub20.anInt6048 = 2
                            Class93.anInt1534 = i_72_
                            val class348_sub47 = method2148((Class348_Sub42_Sub17.aClass351_9679), (Class348_Sub23_Sub2.aClass77_9029), -98)
                            class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByteSubtract((-83).toByte(), (if (!Class182.aClass346_2449!!.method2696(82, -128)) 0 else 1))
                            class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShortAddLittle(4325, za_Sub2.regionTileX + i_74_)
                            class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShortLittle(i_75_ + Class90.regionTileY, 3.toByte())
                            class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShort(107.toByte(), 0x7fffffff and (l ushr 32).toInt())
                            Class348_Sub42_Sub14.method3243(127, class348_sub47)
                            method2307(i_75_, l, i_74_, 63)
                        }
                        if (i_76_ == 20) {
                            val class348_sub22 = (Class282.aClass356_3654!!.method3480(i_77_.toLong(), -6008) as Class348_Sub22?)
                            if (class348_sub22 != null) {
                                Class239_Sub20.anInt6048 = 2
                                Class26.anInt385 = i_73_
                                Class93.anInt1534 = i_72_
                                val npc = (class348_sub22.aNpc_6859)!!
                                Class348.anInt4292 = 0
                                Class328_Sub2.anInt6516++
                                val class348_sub47 = method2148((Class339.aClass351_4207), (Class348_Sub23_Sub2.aClass77_9029), -81)
                                class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShortAddLittle(4325, i_77_)
                                class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByteAdd((-119).toByte(), (if (!Class182.aClass346_2449!!.method2696(82, -123)) 0 else 1))
                                Class348_Sub42_Sub14.method3243(-85, class348_sub47)
                                Class298.method2252(true, (npc.anIntArray10320!![0]), (npc.anIntArray10317!![0]), (-121).toByte(), npc.method2436(99.toByte()), 0, npc.method2436(99.toByte()), -2, 0)
                            }
                        }
                        if (i > 97) {
                            if (i_76_ == 1010) {
                                Class239_Sub20.anInt6048 = 2
                                Class348_Sub42_Sub18.anInt9686++
                                Class93.anInt1534 = i_72_
                                Class26.anInt385 = i_73_
                                Class348.anInt4292 = 0
                                val class348_sub47 = method2148((Class65.aClass351_1144), (Class348_Sub23_Sub2.aClass77_9029), -96)
                                class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShort(107.toByte(), i_77_)
                                Class348_Sub42_Sub14.method3243(125, class348_sub47)
                            }
                            if (i_76_ == 22) {
                                Class239_Sub20.anInt6048 = 2
                                Class348.anInt4292 = 0
                                Class93.anInt1534 = i_72_
                                Class26.anInt385 = i_73_
                                Class348_Sub42_Sub13.anInt9620++
                                val class348_sub47 = method2148((Class202.aClass351_2661), (Class348_Sub23_Sub2.aClass77_9029), -117)
                                class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByteSubtract((-101).toByte(), (if (!Class182.aClass346_2449!!.method2696(82, -125)) 0 else 1))
                                class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShortAdd(-69, za_Sub2.regionTileX + i_74_)
                                class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShortLittle(Class90.regionTileY + i_75_, 3.toByte())
                                class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShort(107.toByte(), i_77_)
                                Class348_Sub42_Sub14.method3243(116, class348_sub47)
                                Class348_Sub42_Sub18.method3275(1, i_75_, i_74_)
                            }
                            if (i_76_ == 50) {
                                Class26.anInt385 = i_73_
                                Class239_Sub20.anInt6048 = 2
                                Class348.anInt4292 = 0
                                Class93.anInt1534 = i_72_
                                Class228.anInt2975++
                                val class348_sub47 = method2148((Class52.aClass351_4907), (Class348_Sub23_Sub2.aClass77_9029), -127)
                                class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShortAddLittle(4325, Class9.anInt169)
                                class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShortLittle((Class132.aPlayer_1907!!.anInt10290), 3.toByte())
                                class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShortLittle(Class301.anInt3829, 3.toByte())
                                class348_sub47.aClass348_Sub49_Sub2_7116!!.writeIntInverseMiddle(Class149.anInt2046, -4086)
                                class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByteInverse((-29).toByte(), (if (Class182.aClass346_2449!!.method2696(82, -121)) 1 else 0))
                                Class348_Sub42_Sub14.method3243(-40, class348_sub47)
                            }
                            if (i_76_ == 18 || i_76_ == 1011) method2780(i_74_, (class348_sub42_sub12.aString9601), 5.toByte(), i_77_, i_75_)
                            if (i_76_ == 13) {
                                val class46 = Class348_Sub22.method2957(i_74_, (-54).toByte(), i_75_)
                                if (class46 != null) {
                                    Class341.method2678(-2049)
                                    val class348_sub44 = Client.method105(class46)!!
                                    Class339.method2666(class348_sub44.anInt7093, class348_sub44.method3307(14), class46, 21.toByte())
                                    Class28.aString5001 = method1753(0, class46)
                                    Class28.aString5000 = (class46.aString752 + "<col=ffffff>")
                                    if (Class28.aString5001 == null) Class28.aString5001 = "Null"
                                }
                            } else {
                                if (i_76_ == 1009 || i_76_ == 1012 || i_76_ == 1002 || i_76_ == 1003 || i_76_ == 1006) method696(i_76_, i_74_, i_77_, -1007)
                                if (i_76_ == 25) {
                                    val class348_sub22 = (Class282.aClass356_3654!!.method3480(i_77_.toLong(), -6008) as Class348_Sub22?)
                                    if (class348_sub22 != null) {
                                        Class239_Sub20.anInt6048 = 2
                                        Class93.anInt1534 = i_72_
                                        Class299_Sub1_Sub2.anInt8702++
                                        val npc = (class348_sub22.aNpc_6859)!!
                                        Class26.anInt385 = i_73_
                                        Class348.anInt4292 = 0
                                        val class348_sub47 = (method2148(Class348_Sub18.aClass351_6814, Class348_Sub23_Sub2.aClass77_9029, -125))
                                        class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByte(false, if (!Class182.aClass346_2449!!.method2696(82, -125)) 0 else 1)
                                        class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShortLittle(i_77_, 3.toByte())
                                        Class348_Sub42_Sub14.method3243(-37, class348_sub47)
                                        Class298.method2252(true, (npc.anIntArray10320!![0]), (npc.anIntArray10317!![0]), (-85).toByte(), npc.method2436(124.toByte()), 0, npc.method2436(84.toByte()), -2, 0)
                                    }
                                }
                                if (i_76_ == 57) {
                                    val player = (Class294.aPlayerArray5058!![i_77_])
                                    if (player != null) {
                                        Class239_Sub20.anInt6048 = 2
                                        Class93.anInt1534 = i_72_
                                        Class369_Sub2.anInt8588++
                                        Class348.anInt4292 = 0
                                        Class26.anInt385 = i_73_
                                        val class348_sub47 = (method2148(Class348_Sub42_Sub5.aClass351_9533, Class348_Sub23_Sub2.aClass77_9029, -115))
                                        class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShortAdd(-88, i_77_)
                                        class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByteAdd((-111).toByte(), if (Class182.aClass346_2449!!.method2696(82, -127)) 1 else 0)
                                        Class348_Sub42_Sub14.method3243(125, class348_sub47)
                                        Class298.method2252(true, (player.anIntArray10320!![0]), (player.anIntArray10317!![0]), (-98).toByte(), player.method2436(83.toByte()), 0, player.method2436(91.toByte()), -2, 0)
                                    }
                                }
                                if (i_76_ == 9) {
                                    Class318_Sub1_Sub3_Sub4.anInt10364++
                                    Class26.anInt385 = i_73_
                                    Class348.anInt4292 = 0
                                    Class239_Sub20.anInt6048 = 2
                                    Class93.anInt1534 = i_72_
                                    val class348_sub47 = (method2148(Class252.aClass351_3237, Class348_Sub23_Sub2.aClass77_9029, -125))
                                    class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShortAdd(-96, Class90.regionTileY + i_75_)
                                    class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShortAddLittle(4325, 0x7fffffff and (l ushr 32).toInt())
                                    class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShortLittle(i_74_ - -za_Sub2.regionTileX, 3.toByte())
                                    class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByteAdd((-91).toByte(), (if (!Class182.aClass346_2449!!.method2696(82, -127)) 0 else 1))
                                    Class348_Sub42_Sub14.method3243(118, class348_sub47)
                                    method2307(i_75_, l, i_74_, 24)
                                }
                                if (i_76_ == 44) {
                                    val class348_sub22 = (Class282.aClass356_3654!!.method3480(i_77_.toLong(), -6008) as Class348_Sub22?)
                                    if (class348_sub22 != null) {
                                        val npc = (class348_sub22.aNpc_6859)!!
                                        Class93.anInt1534 = i_72_
                                        Class348.anInt4292 = 0
                                        Class26.anInt385 = i_73_
                                        Class239_Sub20.anInt6048 = 2
                                        Class73.anInt4773++
                                        val class348_sub47 = (method2148(Class43.aClass351_618, Class348_Sub23_Sub2.aClass77_9029, -117))
                                        class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShort(107.toByte(), i_77_)
                                        class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByte(false, if (Class182.aClass346_2449!!.method2696(82, -124)) 1 else 0)
                                        Class348_Sub42_Sub14.method3243(-25, class348_sub47)
                                        Class298.method2252(true, (npc.anIntArray10320!![0]), (npc.anIntArray10317!![0]), (-107).toByte(), npc.method2436(104.toByte()), 0, npc.method2436(50.toByte()), -2, 0)
                                    }
                                }
                                if (i_76_ == 10) {
                                    Class239_Sub20.anInt6048 = 2
                                    Class26.anInt385 = i_73_
                                    Class348.anInt4292 = 0
                                    Class300.anInt3820++
                                    Class93.anInt1534 = i_72_
                                    val class348_sub47 = (method2148(Class188.aClass351_2512, Class348_Sub23_Sub2.aClass77_9029, -91))
                                    class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShortAdd(-108, i_75_ - -Class90.regionTileY)
                                    class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShortAdd(-70, i_77_)
                                    class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShortLittle(za_Sub2.regionTileX + i_74_, 3.toByte())
                                    class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByteInverse((-70).toByte(), (if (!Class182.aClass346_2449!!.method2696(82, -128)) 0 else 1))
                                    Class348_Sub42_Sub14.method3243(-22, class348_sub47)
                                    Class348_Sub42_Sub18.method3275(1, i_75_, i_74_)
                                }
                                if (r.aBoolean9722) Class341.method2678(-2049)
                                if (Class311.aClass46_3913 == null || Class108.anInt1656 != 0) break
                                Class251.method1916(-9343, Class311.aClass46_3913!!)
                            }
                        }
                    }
                } catch (runtimeexception: RuntimeException) {
                    throw Class348_Sub17.method2929(runtimeexception, ("daa.A(" + i + ',' + (if (class348_sub42_sub12 != null) "{...}" else "null") + ',' + i_72_ + ',' + i_73_ + ')'))
                }
                break
            } while (false)
        }
    }
}
