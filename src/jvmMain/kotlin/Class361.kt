import Class139.Companion.method1166
import Class239_Sub28.Companion.method1842
import Class273.Companion.method2057
import Class348_Sub17.Companion.method2929
import Class60.Companion.method589
import Class75.Companion.method751
import kotlin.math.max
import kotlin.math.min

/* Class361 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class361 {
    var anInt4437: Int = 0
    var anIntArrayArray4438: Array<IntArray?>? = null
    var anInt4441: Int = 0
    var anInt4443: Int = 0
    var anInt4453: Int = 0
    private fun method3493(i: Int, i_0_: Int, i_1_: Int, i_2_: Int) {
        this.anIntArrayArray4438!![i_1_]!![i_2_] = method1166((this.anIntArrayArray4438!![i_1_]!![i_2_]), i.inv())
        if (i_0_ > -120) method3509(-18, true, false, 122, 119, -54, 18, -57)
        anInt4452++
    }

    private fun method3494(i: Int, i_3_: Int, i_4_: Int, i_5_: Int) {
        this.anIntArrayArray4438!![i]!![i_4_] = method2057((this.anIntArrayArray4438!![i]!![i_4_]), i_3_)
        if (i_5_ != -6496) method3494(20, -107, -63, 115)
        anInt4448++
    }

    fun method3495(i: Int, i_6_: Int, i_7_: Int, i_8_: Int, i_9_: Int, i_10_: Int, i_11_: Int, i_12_: Int): Boolean {
        var i = i
        var i_6_ = i_6_
        var i_9_ = i_9_
        var i_10_ = i_10_
        anInt4440++
        val i_13_ = 64 % ((-11 - i_12_) / 37)
        if (i_7_ == 1) {
            if (i_9_ == i && i_10_ == i_6_) return true
        } else if (i >= i_9_ && -1 + i_9_ + i_7_ >= i && i_10_ >= i_10_ && i_10_ <= -1 + (i_7_ + i_10_)) return true
        i_10_ -= this.anInt4441
        i_6_ -= this.anInt4441
        i -= this.anInt4453
        i_9_ -= this.anInt4453
        if (i_7_ == 1) {
            if (i_11_ == 0) {
                if (i_8_ == 0) {
                    if (i_9_ == -1 + i && i_6_ == i_10_) return true
                    if (i == i_9_ && i_10_ - -1 == i_6_ && (0x2c0120 and (this.anIntArrayArray4438!![i_9_]!![i_6_])) == 0) return true
                    if (i == i_9_ && i_6_ == -1 + i_10_ && (0x2c0102 and (this.anIntArrayArray4438!![i_9_]!![i_6_])) == 0) return true
                } else if (i_8_ == 1) {
                    if (i_9_ == i && i_10_ - -1 == i_6_) return true
                    if (i + -1 == i_9_ && i_10_ == i_6_ && ((this.anIntArrayArray4438!![i_9_]!![i_6_]) and 0x2c0108) == 0) return true
                    if (i + 1 == i_9_ && i_10_ == i_6_ && (0x2c0180 and (this.anIntArrayArray4438!![i_9_]!![i_6_])) == 0) return true
                } else if (i_8_ == 2) {
                    if (i + 1 == i_9_ && i_10_ == i_6_) return true
                    if (i_9_ == i && 1 + i_10_ == i_6_ && ((this.anIntArrayArray4438!![i_9_]!![i_6_]) and 0x2c0120) == 0) return true
                    if (i_9_ == i && i_10_ + -1 == i_6_ && (0x2c0102 and (this.anIntArrayArray4438!![i_9_]!![i_6_])) == 0) return true
                } else if (i_8_ == 3) {
                    if (i_9_ == i && -1 + i_10_ == i_6_) return true
                    if (i + -1 == i_9_ && i_10_ == i_6_ && ((this.anIntArrayArray4438!![i_9_]!![i_6_]) and 0x2c0108) == 0) return true
                    if (i_9_ == 1 + i && i_10_ == i_6_ && ((this.anIntArrayArray4438!![i_9_]!![i_6_]) and 0x2c0180) == 0) return true
                }
            }
            if (i_11_ == 2) {
                if (i_8_ == 0) {
                    if (-1 + i == i_9_ && i_6_ == i_10_) return true
                    if (i == i_9_ && i_6_ == i_10_ - -1) return true
                    if (i + 1 == i_9_ && i_10_ == i_6_ && (0x2c0180 and (this.anIntArrayArray4438!![i_9_]!![i_6_])) == 0) return true
                    if (i == i_9_ && i_6_ == i_10_ - 1 && (0x2c0102 and (this.anIntArrayArray4438!![i_9_]!![i_6_])) == 0) return true
                } else if (i_8_ == 1) {
                    if (i_9_ == -1 + i && i_10_ == i_6_ && (0x2c0108 and (this.anIntArrayArray4438!![i_9_]!![i_6_])) == 0) return true
                    if (i == i_9_ && i_10_ + 1 == i_6_) return true
                    if (i_9_ == i - -1 && i_10_ == i_6_) return true
                    if (i == i_9_ && i_10_ - 1 == i_6_ && ((this.anIntArrayArray4438!![i_9_]!![i_6_]) and 0x2c0102) == 0) return true
                } else if (i_8_ == 2) {
                    if (i - 1 == i_9_ && i_10_ == i_6_ && (0x2c0108 and (this.anIntArrayArray4438!![i_9_]!![i_6_])) == 0) return true
                    if (i_9_ == i && i_10_ + 1 == i_6_ && (0x2c0120 and (this.anIntArrayArray4438!![i_9_]!![i_6_])) == 0) return true
                    if (i_9_ == i + 1 && i_10_ == i_6_) return true
                    if (i_9_ == i && -1 + i_10_ == i_6_) return true
                } else if (i_8_ == 3) {
                    if (i + -1 == i_9_ && i_6_ == i_10_) return true
                    if (i_9_ == i && 1 + i_10_ == i_6_ && (0x2c0120 and (this.anIntArrayArray4438!![i_9_]!![i_6_])) == 0) return true
                    if (1 + i == i_9_ && i_6_ == i_10_ && ((this.anIntArrayArray4438!![i_9_]!![i_6_]) and 0x2c0180) == 0) return true
                    if (i == i_9_ && (i_6_ == i_10_ + -1)) return true
                }
            }
            if (i_11_ == 9) {
                if (i_9_ == i && i_6_ == 1 + i_10_ && ((0x20 and this.anIntArrayArray4438!![i_9_]!![i_6_]) == 0)) return true
                if (i == i_9_ && -1 + i_10_ == i_6_ && ((0x2 and this.anIntArrayArray4438!![i_9_]!![i_6_]) == 0)) return true
                if (-1 + i == i_9_ && i_6_ == i_10_ && ((0x8 and this.anIntArrayArray4438!![i_9_]!![i_6_]) == 0)) return true
                return i_9_ == 1 + i && i_10_ == i_6_ && (this.anIntArrayArray4438!![i_9_]!![i_6_] and 0x80) == 0
            }
        } else {
            val i_14_ = -1 + (i_7_ + i_9_)
            val i_15_ = -1 + i_7_ + i_6_
            if (i_11_ == 0) {
                if (i_8_ == 0) {
                    if (-i_7_ + i == i_9_ && i_6_ <= i_10_ && i_10_ <= i_15_) return true
                    if (i_9_ <= i && i <= i_14_ && i_10_ + 1 == i_6_ && (this.anIntArrayArray4438!![i]!![i_6_] and 0x2c0120) == 0) return true
                    if (i_9_ <= i && i_14_ >= i && i_6_ == -i_7_ + i_10_ && (this.anIntArrayArray4438!![i]!![i_15_] and 0x2c0102) == 0) return true
                } else if (i_8_ == 1) {
                    if (i >= i_9_ && i <= i_14_ && i_10_ - -1 == i_6_) return true
                    if (i + -i_7_ == i_9_ && i_6_ <= i_10_ && i_15_ >= i_10_ && (0x2c0108 and (this.anIntArrayArray4438!![i_14_]!![i_10_])) == 0) return true
                    if (1 + i == i_9_ && i_6_ <= i_10_ && i_15_ >= i_10_ && (0x2c0180 and (this.anIntArrayArray4438!![i_9_]!![i_10_])) == 0) return true
                } else if (i_8_ == 2) {
                    if (i_9_ == 1 + i && i_6_ <= i_10_ && i_15_ >= i_10_) return true
                    if (i >= i_9_ && i <= i_14_ && i_10_ - -1 == i_6_ && (this.anIntArrayArray4438!![i]!![i_6_] and 0x2c0120) == 0) return true
                    if (i >= i_9_ && i_14_ >= i && -i_7_ + i_10_ == i_6_ && ((this.anIntArrayArray4438!![i]!![i_15_]) and 0x2c0102) == 0) return true
                } else if (i_8_ == 3) {
                    if (i_9_ <= i && i_14_ >= i && i_10_ + -i_7_ == i_6_) return true
                    if (i - i_7_ == i_9_ && i_10_ >= i_6_ && i_10_ <= i_15_ && ((this.anIntArrayArray4438!![i_14_]!![i_10_]) and 0x2c0108) == 0) return true
                    if (i_9_ == 1 + i && i_6_ <= i_10_ && i_10_ <= i_15_ && (0x2c0180 and (this.anIntArrayArray4438!![i_9_]!![i_10_])) == 0) return true
                }
            }
            if (i_11_ == 2) {
                if (i_8_ == 0) {
                    if (i - i_7_ == i_9_ && i_6_ <= i_10_ && i_10_ <= i_15_) return true
                    if (i_9_ <= i && i <= i_14_ && i_6_ == 1 + i_10_) return true
                    if (i_9_ == i + 1 && i_10_ >= i_6_ && i_10_ <= i_15_ && (0x2c0180 and (this.anIntArrayArray4438!![i_9_]!![i_10_])) == 0) return true
                    if (i >= i_9_ && i <= i_14_ && -i_7_ + i_10_ == i_6_ && (this.anIntArrayArray4438!![i]!![i_15_] and 0x2c0102) == 0) return true
                } else if (i_8_ == 1) {
                    if (i_9_ == -i_7_ + i && i_6_ <= i_10_ && i_15_ >= i_10_ && (0x2c0108 and (this.anIntArrayArray4438!![i_14_]!![i_10_])) == 0) return true
                    if (i >= i_9_ && i <= i_14_ && i_6_ == i_10_ + 1) return true
                    if (1 + i == i_9_ && i_10_ >= i_6_ && i_10_ <= i_15_) return true
                    if (i_9_ <= i && i <= i_14_ && -i_7_ + i_10_ == i_6_ && (this.anIntArrayArray4438!![i]!![i_15_] and 0x2c0102) == 0) return true
                } else if (i_8_ == 2) {
                    if (i_9_ == i - i_7_ && i_6_ <= i_10_ && i_10_ <= i_15_ && (0x2c0108 and (this.anIntArrayArray4438!![i_14_]!![i_10_])) == 0) return true
                    if (i >= i_9_ && i_14_ >= i && 1 + i_10_ == i_6_ && (this.anIntArrayArray4438!![i]!![i_6_] and 0x2c0120) == 0) return true
                    if (i - -1 == i_9_ && i_6_ <= i_10_ && i_15_ >= i_10_) return true
                    if (i >= i_9_ && i <= i_14_ && -i_7_ + i_10_ == i_6_) return true
                } else if (i_8_ == 3) {
                    if (i_9_ == i + -i_7_ && i_6_ <= i_10_ && i_10_ <= i_15_) return true
                    if (i >= i_9_ && i_14_ >= i && i_6_ == i_10_ + 1 && (this.anIntArrayArray4438!![i]!![i_6_] and 0x2c0120) == 0) return true
                    if (i_9_ == i + 1 && i_10_ >= i_6_ && i_10_ <= i_15_ && ((this.anIntArrayArray4438!![i_9_]!![i_10_]) and 0x2c0180) == 0) return true
                    if (i >= i_9_ && i <= i_14_ && i_6_ == i_10_ + -i_7_) return true
                }
            }
            if (i_11_ == 9) {
                if (i >= i_9_ && i <= i_14_ && i_10_ - -1 == i_6_ && (this.anIntArrayArray4438!![i]!![i_6_] and 0x2c0120) == 0) return true
                if (i_9_ <= i && i_14_ >= i && i_10_ + -i_7_ == i_6_ && (this.anIntArrayArray4438!![i]!![i_15_] and 0x2c0102) == 0) return true
                if (-i_7_ + i == i_9_ && i_10_ >= i_6_ && i_10_ <= i_15_ && (0x2c0108 and this.anIntArrayArray4438!![i_14_]!![i_10_]) == 0) return true
                return i_9_ == i - -1 && i_10_ >= i_6_ && i_10_ <= i_15_ && ((0x2c0180 and this.anIntArrayArray4438!![i_9_]!![i_10_]) == 0)
            }
        }
        return false
    }

    fun method3496(i: Int, i_16_: Int, i_17_: Int) {
        var i = i
        var i_16_ = i_16_
        i -= this.anInt4441
        if (i_17_ != 1) method3510(113, 9, 32, -49, -123, false, false)
        anInt4444++
        i_16_ -= this.anInt4453
        this.anIntArrayArray4438!![i_16_]!![i] = method2057((this.anIntArrayArray4438!![i_16_]!![i]), 262144)
    }

    fun method3497(i: Int, i_18_: Int, i_19_: Int, i_20_: Int, i_21_: Int, i_22_: Int, i_23_: Int, i_24_: Int, i_25_: Int, i_26_: Int): Boolean {
        if (i != -28388) method3504(-75, -117, 49, -113, 42, -115, 105, -59)
        anInt4449++
        val i_27_ = i_22_ - -i_20_
        val i_28_ = i_23_ + i_24_
        val i_29_ = i_18_ - -i_26_
        val i_30_ = i_25_ - -i_21_
        if (i_29_ == i_22_ && (i_19_ and 0x2) == 0) {
            var i_31_ = max(i_25_, i_24_)
            val i_32_ = (min(i_28_, i_30_))
            while (i_32_ > i_31_) {
                if (((this.anIntArrayArray4438!![-this.anInt4453 + (i_29_ - 1)]!![i_31_ - this.anInt4441]) and 0x8) == 0) return true
                i_31_++
            }
        } else if (i_18_ == i_27_ && (0x8 and i_19_) == 0) {
            var i_33_ = max(i_25_, i_24_)
            val i_34_ = (min(i_30_, i_28_))
            while (i_33_ < i_34_) {
                if (((this.anIntArrayArray4438!![-this.anInt4453 + i_18_]!![-this.anInt4441 + i_33_]) and 0x80) == 0) return true
                i_33_++
            }
        } else if (i_30_ == i_24_ && (i_19_ and 0x1) == 0) {
            var i_35_ = max(i_18_, i_22_)
            val i_36_ = min(i_27_, i_29_)
            while (i_36_ > i_35_) {
                if ((0x2 and (this.anIntArrayArray4438!![i_35_ + -this.anInt4453]!![-this.anInt4441 + -1 + i_30_])) == 0) return true
                i_35_++
            }
        } else if (i_25_ == i_28_ && (i_19_ and 0x4) == 0) {
            var i_37_ = max(i_22_, i_18_)
            val i_38_ = min(i_27_, i_29_)
            while (i_38_ > i_37_) {
                if (((this.anIntArrayArray4438!![i_37_ + -this.anInt4453]!![i_25_ - this.anInt4441]) and 0x20) == 0) return true
                i_37_++
            }
        }
        return false
    }

    fun method3499(i: Byte, i_54_: Int, i_55_: Int) {
        var i_54_ = i_54_
        var i_55_ = i_55_
        i_55_ -= this.anInt4441
        i_54_ -= this.anInt4453
        anInt4446++
        if (i.toInt() == -52) this.anIntArrayArray4438!![i_54_]!![i_55_] = method1166((this.anIntArrayArray4438!![i_54_]!![i_55_]), -262145)
    }

    fun method3500(i: Int) {
        var i_56_ = 0
        if (i != 700) method3509(120, true, false, 4, -12, 14, -33, -109)
        while ( /**/i_56_ < this.anInt4437) {
            var i_57_ = 0
            while (this.anInt4443 > i_57_) {
                if (i_56_ != 0 && i_57_ != 0 && i_56_ < this.anInt4437 + -5 && (i_57_ < -5 + this.anInt4443)) this.anIntArrayArray4438!![i_56_]!![i_57_] = 2097152
                else this.anIntArrayArray4438!![i_56_]!![i_57_] = -1
                i_57_++
            }
            i_56_++
        }
        anInt4451++
    }

    fun method3501(i: Byte, i_58_: Int, i_59_: Int) {
        var i_58_ = i_58_
        var i_59_ = i_59_
        i_59_ -= this.anInt4453
        anInt4447++
        i_58_ -= this.anInt4441
        val i_60_ = -79 % ((i - 66) / 39)
        this.anIntArrayArray4438!![i_59_]!![i_58_] = method1166((this.anIntArrayArray4438!![i_59_]!![i_58_]), -2097153)
    }

    fun method3503(i: Int, i_64_: Byte, i_65_: Int, i_66_: Int, i_67_: Int, i_68_: Int, i_69_: Int, i_70_: Int, i_71_: Int): Boolean {
        anInt4436++
        if (i_66_ > 1) {
            if (method1842(i_68_, i_65_, -1, i_66_, i, i_70_, i_71_, i_66_, i_67_)) return true
            return method3497(-28388, i_71_, i_69_, i_66_, i_67_, i, i_66_, i_70_, i_65_, i_68_)
        }
        val i_72_ = 64 % ((2 - i_64_) / 45)
        val i_73_ = -1 + i_68_ + i_71_
        val i_74_ = i_65_ - (-i_67_ + 1)
        if (i >= i_71_ && i_73_ >= i && i_65_ <= i_70_ && i_70_ <= i_74_) return true
        if (-1 + i_71_ == i && i_70_ >= i_65_ && i_70_ <= i_74_ && ((this.anIntArrayArray4438!![-this.anInt4453 + i]!![-this.anInt4441 + i_70_]) and 0x8) == 0 && (i_69_ and 0x8) == 0) return true
        if (1 + i_73_ == i && i_70_ >= i_65_ && i_74_ >= i_70_ && (0x80 and (this.anIntArrayArray4438!![-this.anInt4453 + i]!![i_70_ - this.anInt4441])) == 0 && (0x2 and i_69_) == 0) return true
        if (-1 + i_65_ == i_70_ && i >= i_71_ && i_73_ >= i && ((this.anIntArrayArray4438!![i + -this.anInt4453]!![-this.anInt4441 + i_70_]) and 0x2) == 0 && (i_69_ and 0x4) == 0) return true
        return i_70_ == i_74_ - -1 && i_71_ <= i && i_73_ >= i && (0x20 and (this.anIntArrayArray4438!![-this.anInt4453 + i]!![i_70_ - this.anInt4441])) == 0 && (0x1 and i_69_) == 0
    }

    fun method3504(i: Int, i_75_: Int, i_76_: Int, i_77_: Int, i_78_: Int, i_79_: Int, i_80_: Int, i_81_: Int): Boolean {
        var i = i
        var i_75_ = i_75_
        var i_76_ = i_76_
        var i_77_ = i_77_
        var i_80_ = i_80_
        anInt4454++
        if (i_79_ != 1) this.anInt4443 = -59
        if (i_81_ != 1) {
            if (i_77_ <= i_76_ && -1 + i_81_ + i_77_ >= i_76_ && i <= i && i_81_ + i - 1 >= i) return true
        } else if (i_77_ == i_76_ && i_75_ == i) return true
        i_76_ -= this.anInt4453
        i_77_ -= this.anInt4453
        i -= this.anInt4441
        i_75_ -= this.anInt4441
        if (i_81_ == 1) {
            if (i_78_ == 6 || i_78_ == 7) {
                if (i_78_ == 7) i_80_ = 2 + i_80_ and 0x3
                if (i_80_ == 0) {
                    if (i_77_ == 1 + i_76_ && i_75_ == i && (0x80 and (this.anIntArrayArray4438!![i_77_]!![i_75_])) == 0) return true
                    if (i_77_ == i_76_ && i_75_ == -1 + i && (0x2 and (this.anIntArrayArray4438!![i_77_]!![i_75_])) == 0) return true
                } else if (i_80_ == 1) {
                    if (i_76_ + -1 == i_77_ && i == i_75_ && (this.anIntArrayArray4438!![i_77_]!![i_75_] and 0x8) == 0) return true
                    if (i_76_ == i_77_ && i - 1 == i_75_ && ((this.anIntArrayArray4438!![i_77_]!![i_75_]) and 0x2) == 0) return true
                } else if (i_80_ == 2) {
                    if (i_77_ == -1 + i_76_ && i == i_75_ && (0x8 and (this.anIntArrayArray4438!![i_77_]!![i_75_])) == 0) return true
                    if (i_76_ == i_77_ && i + 1 == i_75_ && ((this.anIntArrayArray4438!![i_77_]!![i_75_]) and 0x20) == 0) return true
                } else if (i_80_ == 3) {
                    if (i_76_ - -1 == i_77_ && i_75_ == i && (this.anIntArrayArray4438!![i_77_]!![i_75_] and 0x80) == 0) return true
                    if (i_77_ == i_76_ && i + 1 == i_75_ && (0x20 and (this.anIntArrayArray4438!![i_77_]!![i_75_])) == 0) return true
                }
            }
            if (i_78_ == 8) {
                if (i_76_ == i_77_ && 1 + i == i_75_ && (this.anIntArrayArray4438!![i_77_]!![i_75_] and 0x20) == 0) return true
                if (i_76_ == i_77_ && i - 1 == i_75_ && (this.anIntArrayArray4438!![i_77_]!![i_75_] and 0x2) == 0) return true
                if (i_77_ == i_76_ + -1 && i_75_ == i && (this.anIntArrayArray4438!![i_77_]!![i_75_] and 0x8) == 0) return true
                return i_77_ == 1 + i_76_ && i_75_ == i && (this.anIntArrayArray4438!![i_77_]!![i_75_] and 0x80) == 0
            }
        } else {
            val i_82_ = -1 + (i_81_ + i_77_)
            val i_83_ = i_75_ - (-i_81_ - -1)
            if (i_78_ == 6 || i_78_ == 7) {
                if (i_78_ == 7) i_80_ = 0x3 and 2 + i_80_
                if (i_80_ == 0) {
                    if (i_77_ == 1 + i_76_ && i_75_ <= i && i <= i_83_ && ((0x80 and this.anIntArrayArray4438!![i_77_]!![i]) == 0)) return true
                    if (i_76_ >= i_77_ && i_76_ <= i_82_ && -i_81_ + i == i_75_ && ((this.anIntArrayArray4438!![i_76_]!![i_83_]) and 0x2) == 0) return true
                } else if (i_80_ == 1) {
                    if (i_77_ == i_76_ + -i_81_ && i >= i_75_ && i <= i_83_ && (this.anIntArrayArray4438!![i_82_]!![i] and 0x8) == 0) return true
                    if (i_76_ >= i_77_ && i_76_ <= i_82_ && i_75_ == -i_81_ + i && ((this.anIntArrayArray4438!![i_76_]!![i_83_]) and 0x2) == 0) return true
                } else if (i_80_ == 2) {
                    if (-i_81_ + i_76_ == i_77_ && i >= i_75_ && i_83_ >= i && ((this.anIntArrayArray4438!![i_82_]!![i]) and 0x8) == 0) return true
                    if (i_76_ >= i_77_ && i_76_ <= i_82_ && 1 + i == i_75_ && ((this.anIntArrayArray4438!![i_76_]!![i_75_]) and 0x20) == 0) return true
                } else if (i_80_ == 3) {
                    if (i_77_ == i_76_ - -1 && i_75_ <= i && i <= i_83_ && (0x80 and (this.anIntArrayArray4438!![i_77_]!![i])) == 0) return true
                    if (i_76_ >= i_77_ && i_82_ >= i_76_ && i - -1 == i_75_ && ((this.anIntArrayArray4438!![i_76_]!![i_75_]) and 0x20) == 0) return true
                }
            }
            if (i_78_ == 8) {
                if (i_76_ >= i_77_ && i_82_ >= i_76_ && 1 + i == i_75_ && (0x20 and this.anIntArrayArray4438!![i_76_]!![i_75_]) == 0) return true
                if (i_76_ >= i_77_ && i_76_ <= i_82_ && i_75_ == -i_81_ + i && (0x2 and this.anIntArrayArray4438!![i_76_]!![i_83_]) == 0) return true
                if (i_77_ == i_76_ - i_81_ && i_75_ <= i && i <= i_83_ && ((0x8 and this.anIntArrayArray4438!![i_82_]!![i]) == 0)) return true
                return i_77_ == 1 + i_76_ && i_75_ <= i && i_83_ >= i && ((0x80 and this.anIntArrayArray4438!![i_77_]!![i]) == 0)
            }
        }
        return false
    }

    fun method3505(bool: Boolean, i: Int, i_84_: Int, bool_85_: Boolean, i_86_: Int, bool_87_: Boolean, i_88_: Int) {
        var i_84_ = i_84_
        var i_86_ = i_86_
        if (bool_85_ != true) this.anInt4453 = 116
        anInt4434++
        var i_89_ = 256
        if (bool_87_) i_89_ = i_89_ or 0x20000
        i_86_ -= this.anInt4453
        i_84_ -= this.anInt4441
        if (bool) i_89_ = i_89_ or 0x40000000
        var i_90_ = i_86_
        while (i_86_ + i > i_90_) {
            if (i_90_ >= 0 && (i_90_ < this.anInt4437)) {
                for (i_91_ in i_84_..<i_84_ + i_88_) {
                    if (i_91_ >= 0 && this.anInt4443 > i_91_) method3494(i_90_, i_89_, i_91_, -6496)
                }
            }
            i_90_++
        }
    }

    fun method3506(bool: Boolean, i: Int, i_92_: Int, i_93_: Int, i_94_: Int, bool_95_: Boolean, i_96_: Int) {
        var i_92_ = i_92_
        var i_94_ = i_94_
        anInt4435++
        i_92_ -= this.anInt4453
        if (i_96_ == 29216) {
            i_94_ -= this.anInt4441
            if (i_93_ == 0) {
                if (i == 0) {
                    method3493(128, i_96_ xor 0x725a.inv(), i_92_, i_94_)
                    method3493(8, i_96_ + -29342, i_92_ + -1, i_94_)
                }
                if (i == 1) {
                    method3493(2, -122, i_92_, i_94_)
                    method3493(32, -124, i_92_, i_94_ + 1)
                }
                if (i == 2) {
                    method3493(8, -127, i_92_, i_94_)
                    method3493(128, -127, 1 + i_92_, i_94_)
                }
                if (i == 3) {
                    method3493(32, -125, i_92_, i_94_)
                    method3493(2, i_96_ xor 0x725f.inv(), i_92_, i_94_ + -1)
                }
            }
            if (i_93_ == 1 || i_93_ == 3) {
                if (i == 0) {
                    method3493(1, -123, i_92_, i_94_)
                    method3493(16, -127, -1 + i_92_, i_94_ + 1)
                }
                if (i == 1) {
                    method3493(4, -123, i_92_, i_94_)
                    method3493(64, -128, i_92_ - -1, 1 + i_94_)
                }
                if (i == 2) {
                    method3493(16, -122, i_92_, i_94_)
                    method3493(1, -125, 1 + i_92_, -1 + i_94_)
                }
                if (i == 3) {
                    method3493(64, -127, i_92_, i_94_)
                    method3493(4, i_96_ xor 0x725f.inv(), -1 + i_92_, -1 + i_94_)
                }
            }
            if (i_93_ == 2) {
                if (i == 0) {
                    method3493(130, -122, i_92_, i_94_)
                    method3493(8, -123, -1 + i_92_, i_94_)
                    method3493(32, -124, i_92_, i_94_ + 1)
                }
                if (i == 1) {
                    method3493(10, -123, i_92_, i_94_)
                    method3493(32, -122, i_92_, i_94_ - -1)
                    method3493(128, -127, i_92_ - -1, i_94_)
                }
                if (i == 2) {
                    method3493(40, -122, i_92_, i_94_)
                    method3493(128, -123, 1 + i_92_, i_94_)
                    method3493(2, -127, i_92_, i_94_ + -1)
                }
                if (i == 3) {
                    method3493(160, -127, i_92_, i_94_)
                    method3493(2, -128, i_92_, i_94_ - 1)
                    method3493(8, i_96_ + -29343, -1 + i_92_, i_94_)
                }
            }
            if (bool) {
                if (i_93_ == 0) {
                    if (i == 0) {
                        method3493(65536, i_96_ xor 0x7258.inv(), i_92_, i_94_)
                        method3493(4096, -127, i_92_ - 1, i_94_)
                    }
                    if (i == 1) {
                        method3493(1024, i_96_ xor 0x725f.inv(), i_92_, i_94_)
                        method3493(16384, -122, i_92_, 1 + i_94_)
                    }
                    if (i == 2) {
                        method3493(4096, -124, i_92_, i_94_)
                        method3493(65536, -121, 1 + i_92_, i_94_)
                    }
                    if (i == 3) {
                        method3493(16384, -128, i_92_, i_94_)
                        method3493(1024, -125, i_92_, i_94_ - 1)
                    }
                }
                if (i_93_ == 1 || i_93_ == 3) {
                    if (i == 0) {
                        method3493(512, -125, i_92_, i_94_)
                        method3493(8192, -128, -1 + i_92_, 1 + i_94_)
                    }
                    if (i == 1) {
                        method3493(2048, i_96_ xor 0x7258.inv(), i_92_, i_94_)
                        method3493(32768, -128, 1 + i_92_, i_94_ - -1)
                    }
                    if (i == 2) {
                        method3493(8192, -125, i_92_, i_94_)
                        method3493(512, -123, i_92_ + 1, i_94_ - 1)
                    }
                    if (i == 3) {
                        method3493(32768, i_96_ xor 0x7258.inv(), i_92_, i_94_)
                        method3493(2048, -123, i_92_ - 1, i_94_ - 1)
                    }
                }
                if (i_93_ == 2) {
                    if (i == 0) {
                        method3493(66560, i_96_ + -29342, i_92_, i_94_)
                        method3493(4096, -121, -1 + i_92_, i_94_)
                        method3493(16384, -127, i_92_, i_94_ - -1)
                    }
                    if (i == 1) {
                        method3493(5120, -127, i_92_, i_94_)
                        method3493(16384, -125, i_92_, 1 + i_94_)
                        method3493(65536, -123, 1 + i_92_, i_94_)
                    }
                    if (i == 2) {
                        method3493(20480, i_96_ + -29339, i_92_, i_94_)
                        method3493(65536, -124, 1 + i_92_, i_94_)
                        method3493(1024, -125, i_92_, i_94_ + -1)
                    }
                    if (i == 3) {
                        method3493(81920, -123, i_92_, i_94_)
                        method3493(1024, i_96_ + -29339, i_92_, -1 + i_94_)
                        method3493(4096, i_96_ + -29340, i_92_ + -1, i_94_)
                    }
                }
            }
            if (bool_95_) {
                if (i_93_ == 0) {
                    if (i == 0) {
                        method3493(536870912, -125, i_92_, i_94_)
                        method3493(33554432, -128, i_92_ + -1, i_94_)
                    }
                    if (i == 1) {
                        method3493(8388608, i_96_ + -29338, i_92_, i_94_)
                        method3493(134217728, i_96_ + -29339, i_92_, i_94_ - -1)
                    }
                    if (i == 2) {
                        method3493(33554432, -123, i_92_, i_94_)
                        method3493(536870912, -122, 1 + i_92_, i_94_)
                    }
                    if (i == 3) {
                        method3493(134217728, -128, i_92_, i_94_)
                        method3493(8388608, -127, i_92_, -1 + i_94_)
                    }
                }
                if (i_93_ == 1 || i_93_ == 3) {
                    if (i == 0) {
                        method3493(4194304, -121, i_92_, i_94_)
                        method3493(67108864, -121, i_92_ + -1, 1 + i_94_)
                    }
                    if (i == 1) {
                        method3493(16777216, -126, i_92_, i_94_)
                        method3493(268435456, -124, 1 + i_92_, 1 + i_94_)
                    }
                    if (i == 2) {
                        method3493(67108864, -122, i_92_, i_94_)
                        method3493(4194304, -126, 1 + i_92_, -1 + i_94_)
                    }
                    if (i == 3) {
                        method3493(268435456, -122, i_92_, i_94_)
                        method3493(16777216, -126, -1 + i_92_, i_94_ + -1)
                    }
                }
                if (i_93_ == 2) {
                    if (i == 0) {
                        method3493(545259520, -124, i_92_, i_94_)
                        method3493(33554432, -123, -1 + i_92_, i_94_)
                        method3493(134217728, -123, i_92_, i_94_ + 1)
                    }
                    if (i == 1) {
                        method3493(41943040, -123, i_92_, i_94_)
                        method3493(134217728, i_96_ xor 0x725f.inv(), i_92_, 1 + i_94_)
                        method3493(536870912, -121, 1 + i_92_, i_94_)
                    }
                    if (i == 2) {
                        method3493(167772160, -127, i_92_, i_94_)
                        method3493(536870912, -124, 1 + i_92_, i_94_)
                        method3493(8388608, -128, i_92_, i_94_ - 1)
                    }
                    if (i == 3) {
                        method3493(671088640, -126, i_92_, i_94_)
                        method3493(8388608, -121, i_92_, i_94_ - 1)
                        method3493(33554432, -126, i_92_ - 1, i_94_)
                    }
                }
            }
        }
    }

    fun method3507(i: Int, i_97_: Int, i_98_: Byte) {
        var i = i
        var i_97_ = i_97_
        if (i_98_ > -32) this.anInt4437 = 85
        i -= this.anInt4441
        anInt4431++
        i_97_ -= this.anInt4453
        this.anIntArrayArray4438!![i_97_]!![i] = method2057((this.anIntArrayArray4438!![i_97_]!![i]), 2097152)
    }

    fun method3509(i: Int, bool: Boolean, bool_99_: Boolean, i_100_: Int, i_101_: Int, i_102_: Int, i_103_: Int, i_104_: Int) {
        var i_100_ = i_100_
        var i_101_ = i_101_
        var i_102_ = i_102_
        var i_104_ = i_104_
        anInt4432++
        if (i_103_ > 52) {
            var i_105_ = 256
            if (bool_99_) i_105_ = i_105_ or 0x20000
            i_100_ -= this.anInt4453
            i_101_ -= this.anInt4441
            if (bool) i_105_ = i_105_ or 0x40000000
            if (i == 1 || i == 3) {
                val i_106_ = i_104_
                i_104_ = i_102_
                i_102_ = i_106_
            }
            for (i_107_ in i_100_..<i_104_ + i_100_) {
                if (i_107_ >= 0 && i_107_ < this.anInt4437) {
                    var i_108_ = i_101_
                    while ((i_101_ + i_102_ > i_108_)) {
                        if (i_108_ >= 0 && this.anInt4443 > i_108_) method3493(i_105_, -122, i_107_, i_108_)
                        i_108_++
                    }
                }
            }
        }
    }

    fun method3510(i: Int, i_109_: Int, i_110_: Int, i_111_: Int, i_112_: Int, bool: Boolean, bool_113_: Boolean) {
        var i = i
        var i_109_ = i_109_
        anInt4445++
        val i_114_ = 49 / ((i_110_ - 6) / 46)
        i -= this.anInt4441
        i_109_ -= this.anInt4453
        if (i_111_ == 0) {
            if (i_112_ == 0) {
                method3494(i_109_, 128, i, -6496)
                method3494(-1 + i_109_, 8, i, -6496)
            }
            if (i_112_ == 1) {
                method3494(i_109_, 2, i, -6496)
                method3494(i_109_, 32, 1 + i, -6496)
            }
            if (i_112_ == 2) {
                method3494(i_109_, 8, i, -6496)
                method3494(i_109_ + 1, 128, i, -6496)
            }
            if (i_112_ == 3) {
                method3494(i_109_, 32, i, -6496)
                method3494(i_109_, 2, -1 + i, -6496)
            }
        }
        if (i_111_ == 1 || i_111_ == 3) {
            if (i_112_ == 0) {
                method3494(i_109_, 1, i, -6496)
                method3494(i_109_ - 1, 16, 1 + i, -6496)
            }
            if (i_112_ == 1) {
                method3494(i_109_, 4, i, -6496)
                method3494(i_109_ + 1, 64, 1 + i, -6496)
            }
            if (i_112_ == 2) {
                method3494(i_109_, 16, i, -6496)
                method3494(1 + i_109_, 1, -1 + i, -6496)
            }
            if (i_112_ == 3) {
                method3494(i_109_, 64, i, -6496)
                method3494(i_109_ - 1, 4, -1 + i, -6496)
            }
        }
        if (i_111_ == 2) {
            if (i_112_ == 0) {
                method3494(i_109_, 130, i, -6496)
                method3494(i_109_ - 1, 8, i, -6496)
                method3494(i_109_, 32, i + 1, -6496)
            }
            if (i_112_ == 1) {
                method3494(i_109_, 10, i, -6496)
                method3494(i_109_, 32, 1 + i, -6496)
                method3494(1 + i_109_, 128, i, -6496)
            }
            if (i_112_ == 2) {
                method3494(i_109_, 40, i, -6496)
                method3494(i_109_ + 1, 128, i, -6496)
                method3494(i_109_, 2, -1 + i, -6496)
            }
            if (i_112_ == 3) {
                method3494(i_109_, 160, i, -6496)
                method3494(i_109_, 2, -1 + i, -6496)
                method3494(-1 + i_109_, 8, i, -6496)
            }
        }
        if (bool_113_) {
            if (i_111_ == 0) {
                if (i_112_ == 0) {
                    method3494(i_109_, 65536, i, -6496)
                    method3494(i_109_ - 1, 4096, i, -6496)
                }
                if (i_112_ == 1) {
                    method3494(i_109_, 1024, i, -6496)
                    method3494(i_109_, 16384, i + 1, -6496)
                }
                if (i_112_ == 2) {
                    method3494(i_109_, 4096, i, -6496)
                    method3494(i_109_ + 1, 65536, i, -6496)
                }
                if (i_112_ == 3) {
                    method3494(i_109_, 16384, i, -6496)
                    method3494(i_109_, 1024, i - 1, -6496)
                }
            }
            if (i_111_ == 1 || i_111_ == 3) {
                if (i_112_ == 0) {
                    method3494(i_109_, 512, i, -6496)
                    method3494(-1 + i_109_, 8192, i + 1, -6496)
                }
                if (i_112_ == 1) {
                    method3494(i_109_, 2048, i, -6496)
                    method3494(i_109_ + 1, 32768, i - -1, -6496)
                }
                if (i_112_ == 2) {
                    method3494(i_109_, 8192, i, -6496)
                    method3494(1 + i_109_, 512, i - 1, -6496)
                }
                if (i_112_ == 3) {
                    method3494(i_109_, 32768, i, -6496)
                    method3494(i_109_ + -1, 2048, -1 + i, -6496)
                }
            }
            if (i_111_ == 2) {
                if (i_112_ == 0) {
                    method3494(i_109_, 66560, i, -6496)
                    method3494(i_109_ + -1, 4096, i, -6496)
                    method3494(i_109_, 16384, 1 + i, -6496)
                }
                if (i_112_ == 1) {
                    method3494(i_109_, 5120, i, -6496)
                    method3494(i_109_, 16384, i + 1, -6496)
                    method3494(i_109_ - -1, 65536, i, -6496)
                }
                if (i_112_ == 2) {
                    method3494(i_109_, 20480, i, -6496)
                    method3494(1 + i_109_, 65536, i, -6496)
                    method3494(i_109_, 1024, -1 + i, -6496)
                }
                if (i_112_ == 3) {
                    method3494(i_109_, 81920, i, -6496)
                    method3494(i_109_, 1024, i - 1, -6496)
                    method3494(i_109_ + -1, 4096, i, -6496)
                }
            }
        }
        if (bool) {
            if (i_111_ == 0) {
                if (i_112_ == 0) {
                    method3494(i_109_, 536870912, i, -6496)
                    method3494(-1 + i_109_, 33554432, i, -6496)
                }
                if (i_112_ == 1) {
                    method3494(i_109_, 8388608, i, -6496)
                    method3494(i_109_, 134217728, i - -1, -6496)
                }
                if (i_112_ == 2) {
                    method3494(i_109_, 33554432, i, -6496)
                    method3494(i_109_ - -1, 536870912, i, -6496)
                }
                if (i_112_ == 3) {
                    method3494(i_109_, 134217728, i, -6496)
                    method3494(i_109_, 8388608, i - 1, -6496)
                }
            }
            if (i_111_ == 1 || i_111_ == 3) {
                if (i_112_ == 0) {
                    method3494(i_109_, 4194304, i, -6496)
                    method3494(-1 + i_109_, 67108864, i - -1, -6496)
                }
                if (i_112_ == 1) {
                    method3494(i_109_, 16777216, i, -6496)
                    method3494(1 + i_109_, 268435456, 1 + i, -6496)
                }
                if (i_112_ == 2) {
                    method3494(i_109_, 67108864, i, -6496)
                    method3494(1 + i_109_, 4194304, i - 1, -6496)
                }
                if (i_112_ == 3) {
                    method3494(i_109_, 268435456, i, -6496)
                    method3494(i_109_ - 1, 16777216, -1 + i, -6496)
                }
            }
            if (i_111_ == 2) {
                if (i_112_ == 0) {
                    method3494(i_109_, 545259520, i, -6496)
                    method3494(i_109_ + -1, 33554432, i, -6496)
                    method3494(i_109_, 134217728, i - -1, -6496)
                }
                if (i_112_ == 1) {
                    method3494(i_109_, 41943040, i, -6496)
                    method3494(i_109_, 134217728, 1 + i, -6496)
                    method3494(1 + i_109_, 536870912, i, -6496)
                }
                if (i_112_ == 2) {
                    method3494(i_109_, 167772160, i, -6496)
                    method3494(1 + i_109_, 536870912, i, -6496)
                    method3494(i_109_, 8388608, -1 + i, -6496)
                }
                if (i_112_ == 3) {
                    method3494(i_109_, 671088640, i, -6496)
                    method3494(i_109_, 8388608, i + -1, -6496)
                    method3494(-1 + i_109_, 33554432, i, -6496)
                }
            }
        }
    }

    companion object {
        var anInt4431: Int = 0
        var anInt4432: Int = 0
        var aClass114_4433: Class114? = Class114(22, 0)
        var anInt4434: Int = 0
        var anInt4435: Int = 0
        var anInt4436: Int = 0
        var anInt4439: Int = 0
        var anInt4440: Int = 0
        var anInt4442: Int = 0
        var anInt4444: Int = 0
        var anInt4445: Int = 0
        var anInt4446: Int = 0
        var anInt4447: Int = 0
        var anInt4448: Int = 0
        var anInt4449: Int = 0
        var anInt4450: Int = 0
        var anInt4451: Int = 0
        var anInt4452: Int = 0
        var anInt4454: Int = 0
        var aFloat4455: Float = 0f

        fun method3498(i: Int, var_ha: ha?, i_39_: Int, i_40_: Int, bool: Boolean, i_41_: Int) {
            var i_39_ = i_39_
            var i_41_ = i_41_
            do {
                try {
                    anInt4442++
                    var_ha!!.KA(i_39_, i_41_, i_40_ + i_39_, i_41_ + i)
                    var_ha.method3675(i_40_, (-125).toByte(), i_39_, i_41_, i, -16777216)
                    if (Class348.anInt4290 >= 100) {
                        val f = (Class75.anInt1267.toFloat() / Class75.anInt1259.toFloat())
                        var i_42_ = i_40_
                        var i_43_ = i
                        if (!(f < 1.0f)) i_42_ = (i.toFloat() / f).toInt()
                        else i_43_ = (i_40_.toFloat() * f).toInt()
                        i_41_ += (-i_43_ + i) / 2
                        i_39_ += (i_40_ + -i_42_) / 2
                        if (Class67.aClass105_4643 == null || i_40_ != Class67.aClass105_4643!!.method971() || (Class67.aClass105_4643!!.method969() != i)) {
                            method751(Class75.anInt1266, (Class75.anInt1267 + Class75.anInt1263), (Class75.anInt1266 - -Class75.anInt1259), Class75.anInt1263, i_39_, i_41_, i_42_ + i_39_, i_43_ + i_41_)
                            Class75.method748(var_ha)
                            Class67.aClass105_4643 = var_ha.method3683(i_39_, i_41_, i_42_, i_43_, false)
                        }
                        Class67.aClass105_4643!!.method974(i_39_, i_41_)
                        val i_44_ = Class25.anInt370 * i_42_ / Class75.anInt1259
                        val i_45_ = i_43_ * Class182.anInt2446 / Class75.anInt1267
                        val i_46_ = i_39_ - -(i_42_ * Class368.anInt4509 / Class75.anInt1259)
                        if (bool != true) method3498(44, null, -27, -91, true, -26)
                        val i_47_ = (-i_45_ + i_41_ - (-i_43_ + (i_43_ * Class59_Sub1_Sub2.anInt8665 / Class75.anInt1267)))
                        var i_48_ = -1996554240
                        if (Class14_Sub4.aClass230_8638 == Class348_Sub42_Sub8_Sub2.aClass230_10434) i_48_ = -1996488705
                        var_ha.aa(i_46_, i_47_, i_44_, i_45_, i_48_, 1)
                        var_ha.method3628(i_46_, i_47_, i_44_, i_45_, i_48_, 0)
                        if (Class367_Sub9.anInt7379 <= 0) break
                        val i_49_: Int
                        if (Class164.anInt2173 <= 50) i_49_ = Class164.anInt2173 * 5
                        else i_49_ = -(5 * Class164.anInt2173) + 500
                        var class348_sub21 = (Class75.aClass262_1254!!.method1995(4) as Class348_Sub21?)
                        while (class348_sub21 != null) {
                            val class42 = (Class75.aClass153_1238!!.method1225(class348_sub21.anInt6847, 71.toByte()))
                            if (method589(class42, -4)) {
                                if (Class348_Sub40_Sub30.anInt9399 == (class348_sub21.anInt6847)) {
                                    val i_50_ = (i_39_ + (i_42_ * (class348_sub21.anInt6852) / Class75.anInt1259))
                                    val i_51_ = (((Class75.anInt1267 - (class348_sub21.anInt6851)) * i_43_ / Class75.anInt1267) + i_41_)
                                    var_ha.method3675(4, (-125).toByte(), i_50_ - 2, -2 + i_51_, 4, (i_49_ shl 24 or 0xffff00))
                                } else if (Class34.anInt481 != -1 && (class42!!.anInt596 == Class34.anInt481)) {
                                    val i_52_ = (i_39_ - -((class348_sub21.anInt6852) * i_42_ / Class75.anInt1259))
                                    val i_53_ = i_41_ - -(i_43_ * (Class75.anInt1267 + -(class348_sub21.anInt6851)) / Class75.anInt1267)
                                    var_ha.method3675(4, (-125).toByte(), i_52_ + -2, -2 + i_53_, 4, (i_49_ shl 24 or 0xffff00))
                                }
                            }
                            class348_sub21 = Class75.aClass262_1254!!.method1990(126.toByte()) as Class348_Sub21?
                        }
                    }
                } catch (runtimeexception: RuntimeException) {
                    throw method2929(runtimeexception, ("fe.E(" + i + ',' + (if (var_ha != null) "{...}" else "null") + ',' + i_39_ + ',' + i_40_ + ',' + bool + ',' + i_41_ + ')'))
                }
                break
            } while (false)
        }

        @JvmStatic
        fun method3502(i: Int, i_61_: Int, i_62_: Int, i_63_: Int) {
            anInt4439++
            val string = ("tele " + i_62_ + "," + (i_63_ shr 6) + "," + (i shr 6) + "," + (0x3f and i_63_) + "," + (0x3f and i))
            if (i_61_ != 2) method3502(-25, -23, 24, 63)
            Class82.method812(string, true, false, (-79).toByte())
        }

        @JvmStatic
        fun method3508(i: Int) {
            aClass114_4433 = null
            if (i != 2) aFloat4455 = 0.7198636f
        }
    }
}
