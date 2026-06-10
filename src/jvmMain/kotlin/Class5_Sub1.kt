import Class239_Sub28.Companion.method1842

/* Class5_Sub1 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
open class Class5_Sub1(class45: Class45, class45_0_: Class45, class369_sub3: Class369_Sub3) : Class5(class45, class45_0_, class369_sub3) {
    private var aClass105_8338: Class105? = null
    private var aClass105_8339: Class105? = null
    private var aClass105_8342: Class105? = null
    private var aClass105_8343: Class105? = null
    private var aClass105_8347: Class105? = null
    var aClass105_8350: Class105? = null
    public override fun method8(i: Byte): Boolean {
        anInt8351++
        if (!super.method8((-125).toByte())) return false
        val class369_sub3 = this.aClass369_4635 as Class369_Sub3?
        if (!this.aClass45_4632!!.method421(false, class369_sub3!!.anInt8599)) return false
        if (!this.aClass45_4632!!.method421(false, class369_sub3.anInt8595)) return false
        if (!this.aClass45_4632!!.method421(false, class369_sub3.anInt8603)) return false
        if (!this.aClass45_4632!!.method421(false, class369_sub3.anInt8602)) return false
        val i_1_ = 47 / ((25 - i) / 52)
        if (!this.aClass45_4632!!.method421(false, class369_sub3.anInt8600)) return false
        return this.aClass45_4632!!.method421(false, class369_sub3.anInt8597)
    }

    open fun method186(i: Int, i_3_: Int, i_4_: Byte, i_5_: Int, i_6_: Int) {
        this.aClass105_8350!!.method972(i_5_, i, i_6_, i_3_)
        anInt8341++
        if (i_4_ <= 21) method8(68.toByte())
    }

    public override fun method178(i: Int, bool: Boolean, i_27_: Byte, i_28_: Int) {
        if (bool) {
            val `is` = IntArray(4)
            Class348_Sub8.aHa6654!!.K(`is`)
            Class348_Sub8.aHa6654!!.KA(i, i_28_, i - -this.aClass369_4635!!.anInt4971, (i_28_ + this.aClass369_4635!!.anInt4963))
            val i_29_ = aClass105_8342!!.method966()
            val i_30_ = aClass105_8342!!.method980()
            val i_31_ = aClass105_8339!!.method966()
            val i_32_ = aClass105_8339!!.method980()
            aClass105_8342!!.method974(i, i_28_ - -(((this.aClass369_4635!!.anInt4963) + -i_30_) / 2))
            aClass105_8339!!.method974((this.aClass369_4635!!.anInt4971 + (i + -i_31_)), i_28_ + (this.aClass369_4635!!.anInt4963 + -i_32_) / 2)
            Class348_Sub8.aHa6654!!.KA(i, i_28_, (this.aClass369_4635!!.anInt4971 + i), i_28_ - -aClass105_8343!!.method980())
            aClass105_8343!!.method972(i + i_29_, i_28_, -i_29_ + (this.aClass369_4635!!.anInt4971) - i_31_, this.aClass369_4635!!.anInt4963)
            val i_33_ = aClass105_8338!!.method980()
            Class348_Sub8.aHa6654!!.KA(i, (-i_33_ + i_28_ - -this.aClass369_4635!!.anInt4963), this.aClass369_4635!!.anInt4971 + i, (i_28_ + this.aClass369_4635!!.anInt4963))
            aClass105_8338!!.method972(i_29_ + i, (-i_33_ + i_28_ + this.aClass369_4635!!.anInt4963), (-i_29_ + this.aClass369_4635!!.anInt4971 + -i_31_), this.aClass369_4635!!.anInt4963)
            Class348_Sub8.aHa6654!!.KA(`is`[0], `is`[1], `is`[2], `is`[3])
        }
        anInt8334++
        if (i_27_ > -6) aClass105_8347 = null
    }

    public override fun method182(i: Int, i_35_: Int, i_36_: Int, bool: Boolean) {
        val i_37_ = -45 / ((-20 - i) / 57)
        anInt8336++
        val i_38_ = aClass105_8342!!.method966() + i_36_
        val i_39_ = (this.aClass369_4635!!.anInt4971 + (i_36_ + -aClass105_8339!!.method966()))
        val i_40_ = i_35_ - -aClass105_8343!!.method980()
        val i_41_ = (i_35_ + this.aClass369_4635!!.anInt4963 - aClass105_8338!!.method980())
        val i_42_ = -i_38_ + i_39_
        val i_43_ = -i_40_ + i_41_
        val i_44_ = this.method183(124) * i_42_ / 10000
        val `is` = IntArray(4)
        Class348_Sub8.aHa6654!!.K(`is`)
        Class348_Sub8.aHa6654!!.KA(i_38_, i_40_, i_44_ + i_38_, i_41_)
        method186(i_40_, i_43_, 33.toByte(), i_38_, i_42_)
        Class348_Sub8.aHa6654!!.KA(i_44_ + i_38_, i_40_, i_39_, i_41_)
        aClass105_8347!!.method972(i_38_, i_40_, i_42_, i_43_)
        Class348_Sub8.aHa6654!!.KA(`is`[0], `is`[1], `is`[2], `is`[3])
    }

    public override fun method7(i: Int) {
        super.method7(i)
        anInt8337++
        val class369_sub3 = this.aClass369_4635 as Class369_Sub3?
        this.aClass105_8350 = Class369_Sub3_Sub1.method3577((class369_sub3!!.anInt8599), (-19).toByte(), this.aClass45_4632!!)
        aClass105_8347 = Class369_Sub3_Sub1.method3577((class369_sub3.anInt8595), 106.toByte(), this.aClass45_4632!!)
        aClass105_8342 = Class369_Sub3_Sub1.method3577((class369_sub3.anInt8603), (-19).toByte(), this.aClass45_4632!!)
        aClass105_8339 = Class369_Sub3_Sub1.method3577((class369_sub3.anInt8602), (-121).toByte(), this.aClass45_4632!!)
        aClass105_8343 = Class369_Sub3_Sub1.method3577((class369_sub3.anInt8600), 124.toByte(), this.aClass45_4632!!)
        aClass105_8338 = Class369_Sub3_Sub1.method3577((class369_sub3.anInt8597), 115.toByte(), this.aClass45_4632!!)
    }

    companion object {
        @JvmField
        var anInt8334: Int = 0
        @JvmField
        var aBoolean8335: Boolean = false
        @JvmField
        var anInt8336: Int = 0
        @JvmField
        var anInt8337: Int = 0
        @JvmField
        var anInt8340: Int = 0
        @JvmField
        var anInt8341: Int = 0
        @JvmField
        var aClass221_8344: Class221?
        @JvmField
        var anInt8345: Int = 0
        @JvmField
        var anInt8346: Int = 0
        @JvmField
        var anInt8348: Int = 0
        @JvmField
        var anInt8349: Int = 0
        @JvmField
        var anInt8351: Int = 0
        @JvmField
        var anInt8352: Int = 0

        @JvmStatic
        fun method184(i: Int): IntArray {
            anInt8346++
            if (i != 1084489728) method189(33.toByte())
            return (intArrayOf(Class56.anInt1044, Class17.anInt235, Class291.anInt3736))
        }

        @JvmStatic
        fun method185(i: Int, i_2_: Byte): Int {
            if (i_2_ > 0) anInt8352 = 48
            anInt8340++
            return 0xff and i
        }

        @JvmStatic
        fun method187(i: Int, i_7_: Int, i_8_: Int, i_9_: Int, i_10_: Int, i_11_: Int, class361: Class361, i_12_: Int, i_13_: Int, i_14_: Int, i_15_: Int): Boolean {
            anInt8348++
            var i_16_ = i_14_
            var i_17_ = i_8_
            var i_18_ = 64
            var i_19_ = 64
            val i_20_ = i_14_ + -i_18_
            r.anIntArrayArray9723!![i_18_]!![i_19_] = 99
            val i_21_ = -i_19_ + i_8_
            Class223.anIntArrayArray2900!![i_18_]!![i_19_] = 0
            var i_22_ = 0
            var i_23_ = 0
            Class367_Sub11.anIntArray7397!![i_22_] = i_16_
            Class205.anIntArray2694!![i_22_++] = i_17_
            val `is` = class361.anIntArrayArray4438!!
            while (i_22_ != i_23_) {
                i_17_ = Class205.anIntArray2694!![i_23_]
                i_16_ = Class367_Sub11.anIntArray7397!![i_23_]
                val i_24_ = -class361.anInt4441 + i_17_
                i_18_ = -i_20_ + i_16_
                i_19_ = i_17_ - i_21_
                val i_25_ = i_16_ + -class361.anInt4453
                i_23_ = 0xfff and 1 + i_23_
                var i_26_ = i_12_
                while_3_@ do {
                    while_2_@ do {
                        while_1_@ do {
                            while_0_@ do {
                                do {
                                    if (i_26_ == -4) {
                                        if (i_16_ == i && (i_17_ == i_7_)) {
                                            Class348_Sub40_Sub30.anInt9388 = i_16_
                                            Class115.anInt1753 = i_17_
                                            return true
                                        }
                                        break@while_3_
                                    } else if (i_26_ != -3) {
                                        if (i_26_ != -2) {
                                            if (i_26_ != -1) {
                                                if (i_26_ == 0 || (i_26_ == 1) || (i_26_ == 2) || (i_26_ == 3) || i_26_ == 9) break@while_1_
                                                break@while_2_
                                            }
                                        } else break
                                        break@while_0_
                                    }
                                    if (method1842(i_11_, i_7_, -1, 1, i_16_, i_17_, i, 1, i_13_)) {
                                        Class115.anInt1753 = i_17_
                                        Class348_Sub40_Sub30.anInt9388 = i_16_
                                        return true
                                    }
                                    break@while_3_
                                } while (false)
                                if (class361.method3497(-28388, i, i_10_, 1, i_13_, i_16_, 1, i_17_, i_7_, i_11_)) {
                                    Class115.anInt1753 = i_17_
                                    Class348_Sub40_Sub30.anInt9388 = i_16_
                                    return true
                                }
                                break@while_3_
                            } while (false)
                            if (class361.method3503(i_16_, 110.toByte(), i_7_, 1, i_13_, i_11_, i_10_, i_17_, i)) {
                                Class348_Sub40_Sub30.anInt9388 = i_16_
                                Class115.anInt1753 = i_17_
                                return true
                            }
                            break@while_3_
                        } while (false)
                        if (class361.method3495(i, i_17_, 1, i_9_, i_16_, i_7_, i_12_, 91)) {
                            Class115.anInt1753 = i_17_
                            Class348_Sub40_Sub30.anInt9388 = i_16_
                            return true
                        }
                        break@while_3_
                    } while (false)
                    if (class361.method3504(i_7_, i_17_, i, i_16_, i_12_, 1, i_9_, 1)) {
                        Class348_Sub40_Sub30.anInt9388 = i_16_
                        Class115.anInt1753 = i_17_
                        return true
                    }
                } while (false)
                i_26_ = 1 + Class223.anIntArrayArray2900!![i_18_]!![i_19_]
                if (i_18_ > 0 && (r.anIntArrayArray9723!![i_18_ + -1]!![i_19_] == 0) && (`is`[-1 + i_25_]!![i_24_] and 0x42240000) == 0) {
                    Class367_Sub11.anIntArray7397!![i_22_] = -1 + i_16_
                    Class205.anIntArray2694!![i_22_] = i_17_
                    i_22_ = 0xfff and i_22_ - -1
                    r.anIntArrayArray9723!![i_18_ + -1]!![i_19_] = 2
                    Class223.anIntArrayArray2900!![-1 + i_18_]!![i_19_] = i_26_
                }
                if (i_18_ < 127 && r.anIntArrayArray9723!![1 + i_18_]!![i_19_] == 0 && (0x60240000 and `is`[1 + i_25_]!![i_24_]) == 0) {
                    Class367_Sub11.anIntArray7397!![i_22_] = i_16_ + 1
                    Class205.anIntArray2694!![i_22_] = i_17_
                    r.anIntArrayArray9723!![1 + i_18_]!![i_19_] = 8
                    i_22_ = 0xfff and i_22_ - -1
                    Class223.anIntArrayArray2900!![1 + i_18_]!![i_19_] = i_26_
                }
                if (i_19_ > 0 && (r.anIntArrayArray9723!![i_18_]!![i_19_ + -1] == 0) && (`is`[i_25_]!![i_24_ - 1] and 0x40a40000) == 0) {
                    Class367_Sub11.anIntArray7397!![i_22_] = i_16_
                    Class205.anIntArray2694!![i_22_] = -1 + i_17_
                    r.anIntArrayArray9723!![i_18_]!![-1 + i_19_] = 1
                    i_22_ = 0xfff and 1 + i_22_
                    Class223.anIntArrayArray2900!![i_18_]!![-1 + i_19_] = i_26_
                }
                if (i_19_ < 127 && r.anIntArrayArray9723!![i_18_]!![1 + i_19_] == 0 && (0x48240000 and `is`[i_25_]!![i_24_ - -1]) == 0) {
                    Class367_Sub11.anIntArray7397!![i_22_] = i_16_
                    Class205.anIntArray2694!![i_22_] = i_17_ + 1
                    r.anIntArrayArray9723!![i_18_]!![i_19_ - -1] = 4
                    i_22_ = 0xfff and i_22_ + 1
                    Class223.anIntArrayArray2900!![i_18_]!![i_19_ + 1] = i_26_
                }
                if (i_18_ > 0 && i_19_ > 0 && r.anIntArrayArray9723!![-1 + i_18_]!![i_19_ + -1] == 0 && (`is`[-1 + i_25_]!![i_24_ - 1] and 0x43a40000) == 0 && (`is`[-1 + i_25_]!![i_24_] and 0x42240000) == 0 && (0x40a40000 and `is`[i_25_]!![i_24_ - 1]) == 0) {
                    Class367_Sub11.anIntArray7397!![i_22_] = -1 + i_16_
                    Class205.anIntArray2694!![i_22_] = i_17_ - 1
                    i_22_ = 1 + i_22_ and 0xfff
                    r.anIntArrayArray9723!![i_18_ + -1]!![-1 + i_19_] = 3
                    Class223.anIntArrayArray2900!![i_18_ + -1]!![-1 + i_19_] = i_26_
                }
                if (i_18_ < 127 && i_19_ > 0 && (r.anIntArrayArray9723!![i_18_ + 1]!![i_19_ - 1] == 0) && (0x60e40000 and `is`[i_25_ - -1]!![i_24_ + -1]) == 0 && (`is`[1 + i_25_]!![i_24_] and 0x60240000) == 0 && (`is`[i_25_]!![-1 + i_24_] and 0x40a40000) == 0) {
                    Class367_Sub11.anIntArray7397!![i_22_] = i_16_ + 1
                    Class205.anIntArray2694!![i_22_] = i_17_ - 1
                    i_22_ = 0xfff and 1 + i_22_
                    r.anIntArrayArray9723!![1 + i_18_]!![-1 + i_19_] = 9
                    Class223.anIntArrayArray2900!![1 + i_18_]!![i_19_ + -1] = i_26_
                }
                if (i_18_ > 0 && i_19_ < 127 && r.anIntArrayArray9723!![-1 + i_18_]!![i_19_ - -1] == 0 && (`is`[i_25_ + -1]!![i_24_ - -1] and 0x4e240000) == 0 && (0x42240000 and `is`[i_25_ - 1]!![i_24_]) == 0 && (0x48240000 and `is`[i_25_]!![1 + i_24_]) == 0) {
                    Class367_Sub11.anIntArray7397!![i_22_] = i_16_ - 1
                    Class205.anIntArray2694!![i_22_] = i_17_ + 1
                    r.anIntArrayArray9723!![i_18_ + -1]!![i_19_ - -1] = 6
                    i_22_ = 1 + i_22_ and 0xfff
                    Class223.anIntArrayArray2900!![-1 + i_18_]!![1 + i_19_] = i_26_
                }
                if (i_18_ < 127 && i_19_ < 127 && (r.anIntArrayArray9723!![1 + i_18_]!![1 + i_19_] == 0) && (0x78240000 and `is`[i_25_ - -1]!![1 + i_24_]) == 0 && (0x60240000 and `is`[1 + i_25_]!![i_24_]) == 0 && (0x48240000 and `is`[i_25_]!![i_24_ - -1]) == 0) {
                    Class367_Sub11.anIntArray7397!![i_22_] = i_16_ - -1
                    Class205.anIntArray2694!![i_22_] = 1 + i_17_
                    r.anIntArrayArray9723!![1 + i_18_]!![i_19_ + 1] = 12
                    i_22_ = 0xfff and 1 + i_22_
                    Class223.anIntArrayArray2900!![1 + i_18_]!![1 + i_19_] = i_26_
                }
            }
            if (i_15_ != 1109655552) aBoolean8335 = false
            Class348_Sub40_Sub30.anInt9388 = i_16_
            Class115.anInt1753 = i_17_
            return false
        }

        @JvmStatic
        fun method188(i: Byte): Array<Class29?> {
            anInt8345++
            val i_34_ = -7 / ((-67 - i) / 44)
            return (arrayOf<Class29?>(Class178.aClass29_2339, Class178.aClass29_2341, Class178.aClass29_2342, Class178.aClass29_2343, Class178.aClass29_2344, Class178.aClass29_2345, Class178.aClass29_2346, Class178.aClass29_2347, Class178.aClass29_2348, Class178.aClass29_2349, Class178.aClass29_2350, Class178.aClass29_2351, Class178.aClass29_2352, Class178.aClass29_2353))
        }

        @JvmStatic
        fun method189(i: Byte) {
            if (i < 112) anInt8352 = -87
            aClass221_8344 = null
        }

        init {
            aClass221_8344 = Class221()
        }
    }
}
