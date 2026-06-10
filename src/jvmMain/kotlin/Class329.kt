/* Class329 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
object Class329 {
    private var anInt4102 = 0
    private var anInt4103 = 0
    private var anInt4104 = 0
    private var anInt4105 = 0
    private var anInt4106 = 0
    private var anIntArray4107: IntArray? = null
    private var anInt4108 = 0
    private var anInt4109 = 0

    private fun method2618(i: Int) {
        if (anInt4105 < 0) {
            anInt4109 = 0
            anInt4102 = anInt4109
            anInt4104 = anInt4102
            anInt4103 = 2147483646
        } else {
            method2625(0, anInt4105)
            var i_0_ = anIntArray4107!![1]
            if (i_0_ < i) i_0_ = i
            val i_1_ = 0
            var i_2_: Int
            i_2_ = 0
            while (i_2_ < anInt4105) {
                val i_3_ = anIntArray4107!![i_2_ + 1]
                if (i_0_ < i_3_) break
                val i_4_ = anIntArray4107!![i_2_]
                val i_5_ = anIntArray4107!![i_2_ + 2]
                val i_6_ = anIntArray4107!![i_2_ + 3]
                val i_7_ = (i_5_ - i_4_ shl 16) / (i_6_ - i_3_)
                val i_8_ = (i_4_ shl 16) + 32768
                anIntArray4107!![i_2_] = i_8_ + (i_0_ - i_3_) * i_7_
                anIntArray4107!![i_2_ + 2] = i_7_
                i_2_ += 4
            }
            anInt4104 = i_1_
            anInt4102 = i_2_
            anInt4109 = i_2_
            anInt4103 = i_0_ - 1
        }
    }

    fun method2619(var_ha: ha, `is`: IntArray, i: Int, is_9_: IntArray?, is_10_: IntArray) {
        method2623(var_ha, `is`, 0, `is`.size, i, is_9_, is_10_)
    }

    fun method2620(var_ha: ha, `is`: IntArray, i: Int) {
        Class329.method2623(var_ha, `is`, 0, `is`.size, i, null, null)
    }

    @JvmStatic
    fun method2621() {
        anIntArray4107 = null
    }

    private fun method2622(`is`: IntArray, i: Int, i_11_: Int) {
        var i_11_ = i_11_
        val i_12_ = anInt4105 + (i_11_ shl 1)
        if (anIntArray4107 == null || anIntArray4107!!.size < i_12_) {
            val is_13_ = IntArray(i_12_)
            for (i_14_ in 0..<anInt4105) is_13_[i_14_] = anIntArray4107!![i_14_]
            anIntArray4107 = is_13_
        }
        i_11_ += i
        var i_15_ = i_11_ - 2
        var i_16_ = i
        while (i_16_ < i_11_) {
            val i_17_ = `is`[i_15_ + 1]
            val i_18_ = `is`[i_16_ + 1]
            if (i_17_ < i_18_) {
                anIntArray4107!![anInt4105++] = `is`[i_15_]
                anIntArray4107!![anInt4105++] = i_17_
                anIntArray4107!![anInt4105++] = `is`[i_16_]
                anIntArray4107!![anInt4105++] = i_18_
            } else if (i_18_ < i_17_) {
                anIntArray4107!![anInt4105++] = `is`[i_16_]
                anIntArray4107!![anInt4105++] = i_18_
                anIntArray4107!![anInt4105++] = `is`[i_15_]
                anIntArray4107!![anInt4105++] = i_17_
            }
            i_15_ = i_16_
            i_16_ += 2
        }
    }

    private fun method2623(var_ha: ha, `is`: IntArray, i: Int, i_19_: Int, i_20_: Int, is_21_: IntArray?, is_22_: IntArray?) {
        val is_23_ = IntArray(4)
        var_ha.K(is_23_)
        check(!(is_21_ != null && is_23_[3] - is_23_[1] != is_21_.size))
        method2624()
        method2622(`is`, i, i_19_)
        method2618(is_23_[1])
        while (method2627(is_23_[3])) {
            var i_24_ = anInt4106
            var i_25_ = anInt4108
            val i_26_ = anInt4103
            if (is_21_ != null) {
                val i_27_ = i_26_ - is_23_[1]
                if (i_24_ < is_21_[i_27_] + is_23_[0]) i_24_ = is_21_[i_27_] + is_23_[0]
                if (i_25_ > is_21_[i_27_] + is_22_!![i_27_] + is_23_[0]) i_25_ = is_21_[i_27_] + is_22_[i_27_] + is_23_[0]
                if (i_25_ - i_24_ <= 0) continue
            }
            var_ha.U(i_24_, i_26_, i_25_ - i_24_, i_20_, 1)
        }
    }

    private fun method2624() {
        anInt4105 = 0
    }

    private fun method2625(i: Int, i_28_: Int) {
        if (i_28_ > i + 4) {
            var i_29_ = i
            val i_30_ = anIntArray4107!![i_29_]
            val i_31_ = anIntArray4107!![i_29_ + 1]
            val i_32_ = anIntArray4107!![i_29_ + 2]
            val i_33_ = anIntArray4107!![i_29_ + 3]
            var i_34_ = i + 4
            while (i_34_ < i_28_) {
                val i_35_ = anIntArray4107!![i_34_ + 1]
                if (i_35_ < i_31_) {
                    anIntArray4107!![i_29_] = anIntArray4107!![i_34_]
                    anIntArray4107!![i_29_ + 1] = i_35_
                    anIntArray4107!![i_29_ + 2] = anIntArray4107!![i_34_ + 2]
                    anIntArray4107!![i_29_ + 3] = anIntArray4107!![i_34_ + 3]
                    i_29_ += 4
                    anIntArray4107!![i_34_] = anIntArray4107!![i_29_]
                    anIntArray4107!![i_34_ + 1] = anIntArray4107!![i_29_ + 1]
                    anIntArray4107!![i_34_ + 2] = anIntArray4107!![i_29_ + 2]
                    anIntArray4107!![i_34_ + 3] = anIntArray4107!![i_29_ + 3]
                }
                i_34_ += 4
            }
            anIntArray4107!![i_29_] = i_30_
            anIntArray4107!![i_29_ + 1] = i_31_
            anIntArray4107!![i_29_ + 2] = i_32_
            anIntArray4107!![i_29_ + 3] = i_33_
            method2625(i, i_29_)
            method2625(i_29_ + 4, i_28_)
        }
    }

    private fun method2626(i: Int, i_36_: Int) {
        var i_36_ = i_36_
        while ( /**/i_36_ >= i + 8) {
            var bool = true
            var i_37_ = i + 4
            while (i_37_ < i_36_) {
                var i_38_ = anIntArray4107!![i_37_ - 4]
                val i_39_ = anIntArray4107!![i_37_]
                if (i_38_ > i_39_) {
                    bool = false
                    anIntArray4107!![i_37_ - 4] = i_39_
                    anIntArray4107!![i_37_] = i_38_
                    i_38_ = anIntArray4107!![i_37_ - 2]
                    anIntArray4107!![i_37_ - 2] = anIntArray4107!![i_37_ + 2]
                    anIntArray4107!![i_37_ + 2] = i_38_
                    i_38_ = anIntArray4107!![i_37_ - 1]
                    anIntArray4107!![i_37_ - 1] = anIntArray4107!![i_37_ + 3]
                    anIntArray4107!![i_37_ + 3] = i_38_
                }
                i_37_ += 4
            }
            if (bool) break
            i_36_ -= 4
        }
    }

    private fun method2627(i: Int): Boolean {
        var i_40_ = anInt4102
        var i_41_ = anInt4109
        var i_42_ = anInt4103
        var i_43_: Int
        while ( /**/i_41_ >= i_40_) {
            anInt4103 = ++i_42_
            if (i_42_ >= i) return false
            i_43_ = anInt4104
            while ( /**/i_40_ < anInt4105) {
                val i_44_ = anIntArray4107!![i_40_ + 1]
                if (i_42_ < i_44_) break
                val i_45_ = anIntArray4107!![i_40_]
                val i_46_ = anIntArray4107!![i_40_ + 2]
                val i_47_ = anIntArray4107!![i_40_ + 3]
                val i_48_ = (i_46_ - i_45_ shl 16) / (i_47_ - i_44_)
                val i_49_ = (i_45_ shl 16) + 32768
                anIntArray4107!![i_40_] = i_49_
                anIntArray4107!![i_40_ + 2] = i_48_
                i_40_ += 4
            }
            var i_50_ = i_43_
            while (i_50_ < i_40_) {
                val i_51_ = anIntArray4107!![i_50_ + 3]
                if (i_42_ >= i_51_) {
                    anIntArray4107!![i_50_] = anIntArray4107!![i_43_]
                    anIntArray4107!![i_50_ + 1] = anIntArray4107!![i_43_ + 1]
                    anIntArray4107!![i_50_ + 2] = anIntArray4107!![i_43_ + 2]
                    anIntArray4107!![i_50_ + 3] = anIntArray4107!![i_43_ + 3]
                    i_43_ += 4
                }
                i_50_ += 4
            }
            if (i_43_ == anInt4105) {
                anInt4105 = 0
                return false
            }
            method2626(i_43_, i_40_)
            anInt4104 = i_43_
            anInt4102 = i_40_
            i_41_ = i_43_
        }
        anInt4106 = anIntArray4107!![i_41_] shr 16
        anInt4108 = anIntArray4107!![i_41_ + 4] shr 16
        anIntArray4107!![i_41_] += anIntArray4107!![i_41_ + 2]
        anIntArray4107!![i_41_ + 4] += anIntArray4107!![i_41_ + 6]
        i_41_ += 8
        anInt4109 = i_41_
        return true
    }
}
