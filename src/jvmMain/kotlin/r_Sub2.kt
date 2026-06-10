/* r_Sub2 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class r_Sub2(var_ha_Sub2: ha_Sub2?, i: Int, i_19_: Int) : r() {
    @JvmField
    var anInt10482: Int = 0
    @JvmField
    var anInt10484: Int = 0
    @JvmField
    var aByteArray10486: ByteArray
    @JvmField
    var anInt10487: Int = 0
    @JvmField
    var anInt10489: Int = 0
    fun method3292(i: Int, i_0_: Int, i_1_: Int, i_2_: Int, i_3_: Int) {
        this.anInt10484 = i_1_
        this.anInt10489 = i_3_
        anInt10481++
        this.anInt10487 = i - i_1_
        if (i_2_ == 25053) this.anInt10482 = i_0_ + -i_3_
    }

    fun method3293(i: Byte) {
        anInt10485++
        var i_4_ = -1
        val i_5_ = -8 + this.aByteArray10486.size
        while (i_5_ > i_4_) {
            this.aByteArray10486[++i_4_] = 0.toByte()
            this.aByteArray10486[++i_4_] = 0.toByte()
            this.aByteArray10486[++i_4_] = 0.toByte()
            this.aByteArray10486[++i_4_] = 0.toByte()
            this.aByteArray10486[++i_4_] = 0.toByte()
            this.aByteArray10486[++i_4_] = 0.toByte()
            this.aByteArray10486[++i_4_] = 0.toByte()
            this.aByteArray10486[++i_4_] = 0.toByte()
        }
        if (i.toInt() == 0) {
            while (i_4_ < this.aByteArray10486.size - 1) this.aByteArray10486[++i_4_] = 0.toByte()
        }
    }

    fun method3294(i: Int, i_6_: Int, i_7_: Int, i_8_: Int, i_9_: Int, i_10_: Int, i_11_: Int) {
        var i = i
        var i_6_ = i_6_
        var i_7_ = i_7_
        var i_9_ = i_9_
        var i_10_ = i_10_
        var i_11_ = i_11_
        anInt10491++
        var i_12_ = 0
        if (i_11_ != i_7_) i_12_ = (-i_6_ + i_9_ shl 16) / (i_11_ + -i_7_)
        val i_13_ = 71 % ((-38 - i_8_) / 52)
        var i_14_ = 0
        if (i_11_ != i_10_) i_14_ = (i - i_9_ shl 16) / (-i_11_ + i_10_)
        var i_15_ = 0
        if (i_10_ != i_7_) i_15_ = (i_6_ - i shl 16) / (i_7_ + -i_10_)
        if (i_11_ >= i_7_ && i_7_ <= i_10_) {
            if (i_10_ > i_11_) {
                i_6_ = i_6_ shl -1167965648
                i = i_6_
                if (i_7_ < 0) {
                    i -= i_7_ * i_15_
                    i_6_ -= i_12_ * i_7_
                    i_7_ = 0
                }
                i_9_ = i_9_ shl -1709216688
                if (i_11_ < 0) {
                    i_9_ -= i_14_ * i_11_
                    i_11_ = 0
                }
                if ((i_7_ == i_11_ || i_15_ >= i_12_) && (i_7_ != i_11_ || i_14_ >= i_15_)) {
                    i_10_ -= i_11_
                    i_11_ -= i_7_
                    i_7_ = this.anInt10482 * i_7_
                    while (--i_11_ >= 0) {
                        Class304.method2289(i_6_ shr 16, i_7_, -36, 0, this.aByteArray10486, i shr 16)
                        i_6_ += i_12_
                        i_7_ += this.anInt10482
                        i += i_15_
                    }
                    while (--i_10_ >= 0) {
                        Class304.method2289(i_9_ shr 16, i_7_, -104, 0, this.aByteArray10486, i shr 16)
                        i += i_15_
                        i_7_ += this.anInt10482
                        i_9_ += i_14_
                    }
                } else {
                    i_10_ -= i_11_
                    i_11_ -= i_7_
                    i_7_ = this.anInt10482 * i_7_
                    while (--i_11_ >= 0) {
                        Class304.method2289(i shr 16, i_7_, -111, 0, this.aByteArray10486, i_6_ shr 16)
                        i_7_ += this.anInt10482
                        i += i_15_
                        i_6_ += i_12_
                    }
                    while (--i_10_ >= 0) {
                        Class304.method2289(i shr 16, i_7_, -120, 0, this.aByteArray10486, i_9_ shr 16)
                        i_9_ += i_14_
                        i_7_ += this.anInt10482
                        i += i_15_
                    }
                }
            } else {
                i_6_ = i_6_ shl -1228970768
                i_9_ = i_6_
                if (i_7_ < 0) {
                    i_6_ -= i_12_ * i_7_
                    i_9_ -= i_15_ * i_7_
                    i_7_ = 0
                }
                i = i shl -1758318000
                if (i_10_ < 0) {
                    i -= i_14_ * i_10_
                    i_10_ = 0
                }
                if ((i_7_ == i_10_ || i_12_ <= i_15_) && (i_10_ != i_7_ || i_14_ <= i_12_)) {
                    i_11_ -= i_10_
                    i_10_ -= i_7_
                    i_7_ = this.anInt10482 * i_7_
                    while (--i_10_ >= 0) {
                        Class304.method2289(i_6_ shr 16, i_7_, -75, 0, this.aByteArray10486, i_9_ shr 16)
                        i_9_ += i_15_
                        i_7_ += this.anInt10482
                        i_6_ += i_12_
                    }
                    while (--i_11_ >= 0) {
                        Class304.method2289(i_6_ shr 16, i_7_, -62, 0, this.aByteArray10486, i shr 16)
                        i_7_ += this.anInt10482
                        i_6_ += i_12_
                        i += i_14_
                    }
                } else {
                    i_11_ -= i_10_
                    i_10_ -= i_7_
                    i_7_ *= this.anInt10482
                    while (--i_10_ >= 0) {
                        Class304.method2289(i_9_ shr 16, i_7_, -102, 0, this.aByteArray10486, i_6_ shr 16)
                        i_7_ += this.anInt10482
                        i_9_ += i_15_
                        i_6_ += i_12_
                    }
                    while (--i_11_ >= 0) {
                        Class304.method2289(i shr 16, i_7_, -92, 0, this.aByteArray10486, i_6_ shr 16)
                        i += i_14_
                        i_6_ += i_12_
                        i_7_ += this.anInt10482
                    }
                }
            }
        } else if (i_10_ < i_11_) {
            if (i_11_ <= i_7_) {
                i = i shl -1859479696
                i_6_ = i
                i_9_ = i_9_ shl -1453584560
                if (i_10_ < 0) {
                    i -= i_10_ * i_15_
                    i_6_ -= i_10_ * i_14_
                    i_10_ = 0
                }
                if (i_11_ < 0) {
                    i_9_ -= i_11_ * i_12_
                    i_11_ = 0
                }
                if (i_15_ <= i_14_) {
                    i_7_ -= i_11_
                    i_11_ -= i_10_
                    i_10_ = this.anInt10482 * i_10_
                    while (--i_11_ >= 0) {
                        Class304.method2289(i shr 16, i_10_, -68, 0, this.aByteArray10486, i_6_ shr 16)
                        i_6_ += i_14_
                        i_10_ += this.anInt10482
                        i += i_15_
                    }
                    while (--i_7_ >= 0) {
                        Class304.method2289(i shr 16, i_10_, -101, 0, this.aByteArray10486, i_9_ shr 16)
                        i_9_ += i_12_
                        i += i_15_
                        i_10_ += this.anInt10482
                    }
                } else {
                    i_7_ -= i_11_
                    i_11_ -= i_10_
                    i_10_ *= this.anInt10482
                    while (--i_11_ >= 0) {
                        Class304.method2289(i_6_ shr 16, i_10_, -99, 0, this.aByteArray10486, i shr 16)
                        i += i_15_
                        i_6_ += i_14_
                        i_10_ += this.anInt10482
                    }
                    while (--i_7_ >= 0) {
                        Class304.method2289(i_9_ shr 16, i_10_, -122, 0, this.aByteArray10486, i shr 16)
                        i += i_15_
                        i_9_ += i_12_
                        i_10_ += this.anInt10482
                    }
                }
            } else {
                i = i shl -1009380592
                i_9_ = i
                i_6_ = i_6_ shl -202478416
                if (i_10_ < 0) {
                    i_9_ -= i_14_ * i_10_
                    i -= i_10_ * i_15_
                    i_10_ = 0
                }
                if (i_7_ < 0) {
                    i_6_ -= i_7_ * i_12_
                    i_7_ = 0
                }
                if (i_14_ < i_15_) {
                    i_11_ -= i_7_
                    i_7_ -= i_10_
                    i_10_ = this.anInt10482 * i_10_
                    while (--i_7_ >= 0) {
                        Class304.method2289(i_9_ shr 16, i_10_, -36, 0, this.aByteArray10486, i shr 16)
                        i_10_ += this.anInt10482
                        i += i_15_
                        i_9_ += i_14_
                    }
                    while (--i_11_ >= 0) {
                        Class304.method2289(i_9_ shr 16, i_10_, -48, 0, this.aByteArray10486, i_6_ shr 16)
                        i_9_ += i_14_
                        i_6_ += i_12_
                        i_10_ += this.anInt10482
                    }
                } else {
                    i_11_ -= i_7_
                    i_7_ -= i_10_
                    i_10_ *= this.anInt10482
                    while (--i_7_ >= 0) {
                        Class304.method2289(i shr 16, i_10_, -83, 0, this.aByteArray10486, i_9_ shr 16)
                        i += i_15_
                        i_9_ += i_14_
                        i_10_ += this.anInt10482
                    }
                    while (--i_11_ >= 0) {
                        Class304.method2289(i_6_ shr 16, i_10_, -104, 0, this.aByteArray10486, i_9_ shr 16)
                        i_10_ += this.anInt10482
                        i_9_ += i_14_
                        i_6_ += i_12_
                    }
                }
            }
        } else if (i_10_ >= i_7_) {
            i_9_ = i_9_ shl -907151120
            i = i_9_
            if (i_11_ < 0) {
                i -= i_11_ * i_12_
                i_9_ -= i_14_ * i_11_
                i_11_ = 0
            }
            i_6_ = i_6_ shl 209489840
            if (i_7_ < 0) {
                i_6_ -= i_7_ * i_15_
                i_7_ = 0
            }
            if (i_14_ > i_12_) {
                i_10_ -= i_7_
                i_7_ -= i_11_
                i_11_ = this.anInt10482 * i_11_
                while (--i_7_ >= 0) {
                    Class304.method2289(i shr 16, i_11_, -62, 0, this.aByteArray10486, i_9_ shr 16)
                    i += i_12_
                    i_9_ += i_14_
                    i_11_ += this.anInt10482
                }
                while (--i_10_ >= 0) {
                    Class304.method2289(i_6_ shr 16, i_11_, -66, 0, this.aByteArray10486, i_9_ shr 16)
                    i_6_ += i_15_
                    i_9_ += i_14_
                    i_11_ += this.anInt10482
                }
            } else {
                i_10_ -= i_7_
                i_7_ -= i_11_
                i_11_ *= this.anInt10482
                while (--i_7_ >= 0) {
                    Class304.method2289(i_9_ shr 16, i_11_, -67, 0, this.aByteArray10486, i shr 16)
                    i_9_ += i_14_
                    i += i_12_
                    i_11_ += this.anInt10482
                }
                while (--i_10_ >= 0) {
                    Class304.method2289(i_9_ shr 16, i_11_, -108, 0, this.aByteArray10486, i_6_ shr 16)
                    i_9_ += i_14_
                    i_6_ += i_15_
                    i_11_ += this.anInt10482
                }
            }
        } else {
            i_9_ = i_9_ shl -1570270288
            i_6_ = i_9_
            if (i_11_ < 0) {
                i_6_ -= i_12_ * i_11_
                i_9_ -= i_14_ * i_11_
                i_11_ = 0
            }
            i = i shl -1382410736
            if (i_10_ < 0) {
                i -= i_15_ * i_10_
                i_10_ = 0
            }
            if ((i_10_ == i_11_ || i_14_ <= i_12_) && (i_11_ != i_10_ || i_15_ >= i_12_)) {
                i_7_ -= i_10_
                i_10_ -= i_11_
                i_11_ = this.anInt10482 * i_11_
                while (--i_10_ >= 0) {
                    Class304.method2289(i_9_ shr 16, i_11_, -85, 0, this.aByteArray10486, i_6_ shr 16)
                    i_6_ += i_12_
                    i_11_ += this.anInt10482
                    i_9_ += i_14_
                }
                while (--i_7_ >= 0) {
                    Class304.method2289(i shr 16, i_11_, -92, 0, this.aByteArray10486, i_6_ shr 16)
                    i_11_ += this.anInt10482
                    i += i_15_
                    i_6_ += i_12_
                }
            } else {
                i_7_ -= i_10_
                i_10_ -= i_11_
                i_11_ = this.anInt10482 * i_11_
                while (--i_10_ >= 0) {
                    Class304.method2289(i_6_ shr 16, i_11_, -113, 0, this.aByteArray10486, i_9_ shr 16)
                    i_11_ += this.anInt10482
                    i_6_ += i_12_
                    i_9_ += i_14_
                }
                while (--i_7_ >= 0) {
                    Class304.method2289(i_6_ shr 16, i_11_, -125, 0, this.aByteArray10486, i shr 16)
                    i_6_ += i_12_
                    i += i_15_
                    i_11_ += this.anInt10482
                }
            }
        }
    }

    fun method3296(i: Byte, i_16_: Int, i_17_: Int): Boolean {
        val i_18_ = 65 % ((i - 45) / 39)
        anInt10490++
        return i_16_ * i_17_ <= this.aByteArray10486.size
    }

    init {
        this.aByteArray10486 = ByteArray(i * i_19_)
    }

    companion object {
        @JvmField
        var aClass45_10480: Class45? = null
        @JvmField
        var anInt10481: Int = 0
        @JvmField
        var anInt10483: Int = 0
        @JvmField
        var anInt10485: Int = 0
        @JvmField
        var aClass252_10488: Class252? = null
        @JvmField
        var anInt10490: Int = 0
        @JvmField
        var anInt10491: Int = 0
        @JvmField
        var aClass262_10492: Class262? = Class262()

        @JvmStatic
        fun method3295(i: Int) {
            aClass45_10480 = null
            aClass252_10488 = null
            aClass262_10492 = null
            if (i != -1) method3295(109)
        }

        @JvmStatic
        fun method3297(i: Int, i_20_: Int, i_21_: Int): Class318_Sub1_Sub4? {
            val class357 = Class147.aClass357ArrayArrayArray2029!![i]!![i_20_]!![i_21_]
            if (class357 == null) return null
            return class357.aClass318_Sub1_Sub4_4406
        }
    }
}
