import IOException_Sub1.Companion.method131

/* r_Sub1 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class r_Sub1(var_ha_Sub3: ha_Sub3?, i: Int, i_19_: Int) : r() {
    @JvmField
    var anInt10466: Int = 0
    @JvmField
    var anInt10467: Int = 0
    @JvmField
    var anInt10468: Int = 0
    @JvmField
    var aByteArray10471: ByteArray
    @JvmField
    var anInt10474: Int = 0
    fun method3286(i: Int, i_0_: Int, i_1_: Int, i_2_: Int, i_3_: Int) {
        this.anInt10466 = i - i_3_
        this.anInt10467 = i_1_ + -i_2_
        this.anInt10468 = i_3_
        if (i_0_ > -96) method3289(27)
        anInt10473++
        this.anInt10474 = i_2_
    }

    fun method3287(i: Int, i_4_: Int, i_5_: Int, i_6_: Int, i_7_: Int, i_8_: Int, i_9_: Int) {
        var i = i
        var i_5_ = i_5_
        var i_6_ = i_6_
        var i_7_ = i_7_
        var i_8_ = i_8_
        var i_9_ = i_9_
        anInt10472++
        var i_10_ = 0
        if (i_7_ != i) i_10_ = (-i_5_ + i_6_ shl 16) / (i_7_ + -i)
        var i_11_ = 0
        if (i_7_ != i_8_) i_11_ = (-i_6_ + i_9_ shl 16) / (i_8_ + -i_7_)
        val i_12_ = -10 % ((-65 - i_4_) / 55)
        var i_13_ = 0
        if (i_8_ != i) i_13_ = (i_5_ - i_9_ shl 16) / (i + -i_8_)
        if (i > i_7_ || i > i_8_) {
            if (i_8_ >= i_7_) {
                if (i_8_ >= i) {
                    i_6_ = i_6_ shl 477681040
                    i_9_ = i_6_
                    if (i_7_ < 0) {
                        i_6_ -= i_7_ * i_11_
                        i_9_ -= i_7_ * i_10_
                        i_7_ = 0
                    }
                    i_5_ = i_5_ shl 193943408
                    if (i < 0) {
                        i_5_ -= i * i_13_
                        i = 0
                    }
                    if (i_11_ > i_10_) {
                        i_8_ -= i
                        i -= i_7_
                        i_7_ = this.anInt10466 * i_7_
                        while (--i >= 0) {
                            Class33.method339(i_7_, i_9_ shr 16, this.aByteArray10471, 0, 1354705384, i_6_ shr 16)
                            i_9_ += i_10_
                            i_7_ += this.anInt10466
                            i_6_ += i_11_
                        }
                        while (--i_8_ >= 0) {
                            Class33.method339(i_7_, i_5_ shr 16, this.aByteArray10471, 0, 1354705384, i_6_ shr 16)
                            i_6_ += i_11_
                            i_7_ += this.anInt10466
                            i_5_ += i_13_
                        }
                    } else {
                        i_8_ -= i
                        i -= i_7_
                        i_7_ = this.anInt10466 * i_7_
                        while (--i >= 0) {
                            Class33.method339(i_7_, i_6_ shr 16, this.aByteArray10471, 0, 1354705384, i_9_ shr 16)
                            i_7_ += this.anInt10466
                            i_6_ += i_11_
                            i_9_ += i_10_
                        }
                        while (--i_8_ >= 0) {
                            Class33.method339(i_7_, i_6_ shr 16, this.aByteArray10471, 0, 1354705384, i_5_ shr 16)
                            i_6_ += i_11_
                            i_5_ += i_13_
                            i_7_ += this.anInt10466
                        }
                    }
                } else {
                    i_6_ = i_6_ shl -1310795248
                    i_5_ = i_6_
                    if (i_7_ < 0) {
                        i_6_ -= i_11_ * i_7_
                        i_5_ -= i_10_ * i_7_
                        i_7_ = 0
                    }
                    i_9_ = i_9_ shl -280513936
                    if (i_8_ < 0) {
                        i_9_ -= i_8_ * i_13_
                        i_8_ = 0
                    }
                    if ((i_8_ == i_7_ || i_10_ >= i_11_) && (i_8_ != i_7_ || i_13_ >= i_10_)) {
                        i -= i_8_
                        i_8_ -= i_7_
                        i_7_ *= this.anInt10466
                        while (--i_8_ >= 0) {
                            Class33.method339(i_7_, i_6_ shr 16, this.aByteArray10471, 0, 1354705384, i_5_ shr 16)
                            i_7_ += this.anInt10466
                            i_5_ += i_10_
                            i_6_ += i_11_
                        }
                        while (--i >= 0) {
                            Class33.method339(i_7_, i_9_ shr 16, this.aByteArray10471, 0, 1354705384, i_5_ shr 16)
                            i_7_ += this.anInt10466
                            i_5_ += i_10_
                            i_9_ += i_13_
                        }
                    } else {
                        i -= i_8_
                        i_8_ -= i_7_
                        i_7_ *= this.anInt10466
                        while (--i_8_ >= 0) {
                            Class33.method339(i_7_, i_5_ shr 16, this.aByteArray10471, 0, 1354705384, i_6_ shr 16)
                            i_6_ += i_11_
                            i_7_ += this.anInt10466
                            i_5_ += i_10_
                        }
                        while (--i >= 0) {
                            Class33.method339(i_7_, i_5_ shr 16, this.aByteArray10471, 0, 1354705384, i_9_ shr 16)
                            i_7_ += this.anInt10466
                            i_9_ += i_13_
                            i_5_ += i_10_
                        }
                    }
                }
            } else if (i_7_ > i) {
                i_9_ = i_9_ shl -547798224
                i_6_ = i_9_
                i_5_ = i_5_ shl -1378422192
                if (i_8_ < 0) {
                    i_9_ -= i_13_ * i_8_
                    i_6_ -= i_11_ * i_8_
                    i_8_ = 0
                }
                if (i < 0) {
                    i_5_ -= i_10_ * i
                    i = 0
                }
                if (i_13_ > i_11_) {
                    i_7_ -= i
                    i -= i_8_
                    i_8_ *= this.anInt10466
                    while (--i >= 0) {
                        Class33.method339(i_8_, i_6_ shr 16, this.aByteArray10471, 0, 1354705384, i_9_ shr 16)
                        i_8_ += this.anInt10466
                        i_6_ += i_11_
                        i_9_ += i_13_
                    }
                    while (--i_7_ >= 0) {
                        Class33.method339(i_8_, i_6_ shr 16, this.aByteArray10471, 0, 1354705384, i_5_ shr 16)
                        i_5_ += i_10_
                        i_8_ += this.anInt10466
                        i_6_ += i_11_
                    }
                } else {
                    i_7_ -= i
                    i -= i_8_
                    i_8_ = this.anInt10466 * i_8_
                    while (--i >= 0) {
                        Class33.method339(i_8_, i_9_ shr 16, this.aByteArray10471, 0, 1354705384, i_6_ shr 16)
                        i_6_ += i_11_
                        i_8_ += this.anInt10466
                        i_9_ += i_13_
                    }
                    while (--i_7_ >= 0) {
                        Class33.method339(i_8_, i_5_ shr 16, this.aByteArray10471, 0, 1354705384, i_6_ shr 16)
                        i_5_ += i_10_
                        i_8_ += this.anInt10466
                        i_6_ += i_11_
                    }
                }
            } else {
                i_9_ = i_9_ shl -2101498192
                i_5_ = i_9_
                if (i_8_ < 0) {
                    i_9_ -= i_13_ * i_8_
                    i_5_ -= i_8_ * i_11_
                    i_8_ = 0
                }
                i_6_ = i_6_ shl -1561324976
                if (i_7_ < 0) {
                    i_6_ -= i_10_ * i_7_
                    i_7_ = 0
                }
                if (i_11_ >= i_13_) {
                    i -= i_7_
                    i_7_ -= i_8_
                    i_8_ = this.anInt10466 * i_8_
                    while (--i_7_ >= 0) {
                        Class33.method339(i_8_, i_9_ shr 16, this.aByteArray10471, 0, 1354705384, i_5_ shr 16)
                        i_8_ += this.anInt10466
                        i_5_ += i_11_
                        i_9_ += i_13_
                    }
                    while (--i >= 0) {
                        Class33.method339(i_8_, i_9_ shr 16, this.aByteArray10471, 0, 1354705384, i_6_ shr 16)
                        i_6_ += i_10_
                        i_9_ += i_13_
                        i_8_ += this.anInt10466
                    }
                } else {
                    i -= i_7_
                    i_7_ -= i_8_
                    i_8_ = this.anInt10466 * i_8_
                    while (--i_7_ >= 0) {
                        Class33.method339(i_8_, i_5_ shr 16, this.aByteArray10471, 0, 1354705384, i_9_ shr 16)
                        i_5_ += i_11_
                        i_9_ += i_13_
                        i_8_ += this.anInt10466
                    }
                    while (--i >= 0) {
                        Class33.method339(i_8_, i_6_ shr 16, this.aByteArray10471, 0, 1354705384, i_9_ shr 16)
                        i_9_ += i_13_
                        i_8_ += this.anInt10466
                        i_6_ += i_10_
                    }
                }
            }
        } else if (i_7_ >= i_8_) {
            i_5_ = i_5_ shl 1567994448
            i_6_ = i_5_
            i_9_ = i_9_ shl -487806832
            if (i < 0) {
                i_6_ -= i * i_13_
                i_5_ -= i_10_ * i
                i = 0
            }
            if (i_8_ < 0) {
                i_9_ -= i_8_ * i_11_
                i_8_ = 0
            }
            if (i_8_ != i && i_13_ < i_10_ || i == i_8_ && i_10_ < i_11_) {
                i_7_ -= i_8_
                i_8_ -= i
                i = this.anInt10466 * i
                while (--i_8_ >= 0) {
                    Class33.method339(i, i_6_ shr 16, this.aByteArray10471, 0, 1354705384, i_5_ shr 16)
                    i += this.anInt10466
                    i_5_ += i_10_
                    i_6_ += i_13_
                }
                while (--i_7_ >= 0) {
                    Class33.method339(i, i_9_ shr 16, this.aByteArray10471, 0, 1354705384, i_5_ shr 16)
                    i += this.anInt10466
                    i_9_ += i_11_
                    i_5_ += i_10_
                }
            } else {
                i_7_ -= i_8_
                i_8_ -= i
                i *= this.anInt10466
                while (--i_8_ >= 0) {
                    Class33.method339(i, i_5_ shr 16, this.aByteArray10471, 0, 1354705384, i_6_ shr 16)
                    i_6_ += i_13_
                    i_5_ += i_10_
                    i += this.anInt10466
                }
                while (--i_7_ >= 0) {
                    Class33.method339(i, i_5_ shr 16, this.aByteArray10471, 0, 1354705384, i_9_ shr 16)
                    i += this.anInt10466
                    i_9_ += i_11_
                    i_5_ += i_10_
                }
            }
        } else {
            i_5_ = i_5_ shl 592959792
            i_9_ = i_5_
            if (i < 0) {
                i_5_ -= i_10_ * i
                i_9_ -= i_13_ * i
                i = 0
            }
            i_6_ = i_6_ shl 797030512
            if (i_7_ < 0) {
                i_6_ -= i_7_ * i_11_
                i_7_ = 0
            }
            if ((i_7_ == i || i_10_ <= i_13_) && (i != i_7_ || i_11_ >= i_13_)) {
                i_8_ -= i_7_
                i_7_ -= i
                i = this.anInt10466 * i
                while (--i_7_ >= 0) {
                    Class33.method339(i, i_5_ shr 16, this.aByteArray10471, 0, 1354705384, i_9_ shr 16)
                    i_9_ += i_13_
                    i += this.anInt10466
                    i_5_ += i_10_
                }
                while (--i_8_ >= 0) {
                    Class33.method339(i, i_6_ shr 16, this.aByteArray10471, 0, 1354705384, i_9_ shr 16)
                    i_6_ += i_11_
                    i += this.anInt10466
                    i_9_ += i_13_
                }
            } else {
                i_8_ -= i_7_
                i_7_ -= i
                i *= this.anInt10466
                while (--i_7_ >= 0) {
                    Class33.method339(i, i_9_ shr 16, this.aByteArray10471, 0, 1354705384, i_5_ shr 16)
                    i_5_ += i_10_
                    i_9_ += i_13_
                    i += this.anInt10466
                }
                while (--i_8_ >= 0) {
                    Class33.method339(i, i_9_ shr 16, this.aByteArray10471, 0, 1354705384, i_6_ shr 16)
                    i += this.anInt10466
                    i_9_ += i_13_
                    i_6_ += i_11_
                }
            }
        }
    }

    fun method3289(i: Int) {
        if (i <= 1) method3286(-75, -2, 86, -31, 120)
        anInt10475++
        var i_15_ = -1
        val i_16_ = -8 + this.aByteArray10471.size
        while (i_16_ > i_15_) {
            this.aByteArray10471[++i_15_] = 0.toByte()
            this.aByteArray10471[++i_15_] = 0.toByte()
            this.aByteArray10471[++i_15_] = 0.toByte()
            this.aByteArray10471[++i_15_] = 0.toByte()
            this.aByteArray10471[++i_15_] = 0.toByte()
            this.aByteArray10471[++i_15_] = 0.toByte()
            this.aByteArray10471[++i_15_] = 0.toByte()
            this.aByteArray10471[++i_15_] = 0.toByte()
        }
        while (i_15_ < this.aByteArray10471.size + -1) this.aByteArray10471[++i_15_] = 0.toByte()
    }

    fun method3291(i: Int, i_17_: Int, i_18_: Byte): Boolean {
        anInt10469++
        if (i_18_.toInt() != -59) this.anInt10467 = 41
        return i_17_ * i <= this.aByteArray10471.size
    }

    init {
        try {
            this.aByteArray10471 = ByteArray(i_19_ * i)
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("fc.<init>(" + (if (var_ha_Sub3 != null) "{...}" else "null") + ',' + i + ',' + i_19_ + ')'))
        }
    }

    companion object {
        @JvmField
        var anInt10469: Int = 0
        @JvmField
        var anInt10470: Int = 0
        @JvmField
        var anInt10472: Int = 0
        @JvmField
        var anInt10473: Int = 0
        @JvmField
        var anInt10475: Int = 0
        @JvmField
        var anInt10476: Int = 0
        @JvmField
        var aClass351_10477: Class351? = Class351(22, 7)
        @JvmField
        var anIntArray10478: IntArray? = IntArray(1)
        @JvmField
        var aClass262_10479: Class262?

        @JvmStatic
        fun method3288(i: Byte) {
            val i_14_ = 107 % ((i - 27) / 34)
            anIntArray10478 = null
            aClass351_10477 = null
            aClass262_10479 = null
        }

        @JvmStatic
        fun method3290(i: Int) {
            if (i < 30) aClass262_10479 = null
            method131(Class316.aClass348_Sub51_3959!!.aClass239_Sub5_7240!!.method1739(-32350) == 1, 2, true, 22050)
            anInt10470++
            Class348_Sub40.aClass279_7042 = Class193.method1439(22050, Class348_Sub23_Sub1.aClass297_8992, Class305.aCanvas3869, 0, 7)
            Class348_Sub42_Sub18.method3273(true, -114, Class172.method1326(null, 9))
            Class194.aClass279_2596 = Class193.method1439(2048, Class348_Sub23_Sub1.aClass297_8992, Class305.aCanvas3869, 1, 7)
            Class348_Sub43.aClass348_Sub16_Sub4_7065 = Class348_Sub16_Sub4()
            Class194.aClass279_2596!!.method2088(false, Class348_Sub43.aClass348_Sub16_Sub4_7065)
            Class57.aClass163_1050 = Class163(22050, Class22.anInt339)
            Class348_Sub40_Sub17_Sub1.method3093(110)
        }

        init {
            Class273("", 76)
            aClass262_10479 = Class262()
        }
    }
}
