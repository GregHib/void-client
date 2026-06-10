import kotlin.math.sqrt

/* s_Sub1 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class s_Sub1(private val aHa_Sub1_8217: ha_Sub1, i: Int, private val anInt8223: Int, i_486_: Int, i_487_: Int, `is`: Array<IntArray?>, is_488_: Array<IntArray?>, i_489_: Int) : s(i_486_, i_487_, i_489_, `is`) {
    private var aFloat8212 = 0f
    private var aFloat8213 = 0f
    private var aFloat8214 = 0f
    private var aClass102ArrayArray8215: Array<Array<Class102?>?>? = null
    private var aFloat8216 = 0f
    private var aFloat8218 = 0f
    private var aClass198ArrayArray8219: Array<Array<Class198?>?>? = null
    private var aByteArrayArray8220: Array<ByteArray?>?
    private var aFloat8221 = 0f
    private var aClass236ArrayArray8222: Array<Array<Class236?>?>? = null
    private var aFloat8224 = 0f
    private var aClass145ArrayArray8225: Array<Array<Class145?>?>? = null
    private var aFloat8226 = 0f
    private var aFloat8227 = 0f
    private var anInt8228 = -1
    private var aFloat8229 = 0f
    private var aClass266ArrayArray8230: Array<Array<Class266?>?>? = null
    private var aFloat8231 = 0f
    private var aByteArrayArray8232: Array<ByteArray?>?
    private var aFloat8233 = 0f

    override fun method3981(class348_sub1: Class348_Sub1, `is`: IntArray) {
        /* empty */
    }

    override fun U(i: Int, i_0_: Int, `is`: IntArray?, is_1_: IntArray?, is_2_: IntArray, is_3_: IntArray?, is_4_: IntArray, is_5_: IntArray?, is_6_: IntArray, is_7_: IntArray, i_8_: Int, i_9_: Int, i_10_: Int, bool: Boolean) {
        val bool_11_ = (anInt8223 and 0x20) == 0
        if (aClass266ArrayArray8230 == null && !bool_11_) {
            aClass266ArrayArray8230 = Array<Array<Class266?>?>(this.anInt4587) { arrayOfNulls<Class266?>(this.anInt4590) }
            aClass145ArrayArray8225 = Array<Array<Class145?>?>(this.anInt4587) { arrayOfNulls<Class145?>(this.anInt4590) }
        } else if (aClass198ArrayArray8219 == null && bool_11_) aClass198ArrayArray8219 = Array<Array<Class198?>?>(this.anInt4587) { arrayOfNulls<Class198?>(this.anInt4590) }
        else check(aClass102ArrayArray8215 == null)
        if (`is` != null && `is`.size != 0) {
            for (i_12_ in is_4_.indices) {
                if (is_4_[i_12_] == -1) is_4_[i_12_] = 0
                else is_4_[i_12_] = ((Class126.anIntArray4983!![Class25.method303(is_4_[i_12_], 30).toInt() and 0xffff]) shl 8) or 0xff
            }
            if (is_5_ != null) {
                for (i_13_ in is_5_.indices) {
                    if (is_5_[i_13_] == -1) is_5_[i_13_] = 0
                    else is_5_[i_13_] = ((Class126.anIntArray4983!![Class25.method303(is_5_[i_13_], 30).toInt() and 0xffff]) shl 8) or 0xff
                }
            }
            if (bool_11_) {
                val class198 = Class198()
                class198.aShort2620 = `is`.size.toShort()
                class198.aShort2619 = (`is`.size / 3).toShort()
                class198.aShortArray2622 = ShortArray(class198.aShort2620.toInt())
                class198.aShortArray2618 = ShortArray(class198.aShort2620.toInt())
                class198.aShortArray2613 = ShortArray(class198.aShort2620.toInt())
                class198.anIntArray2623 = IntArray(class198.aShort2620.toInt())
                class198.aShortArray2616 = ShortArray(class198.aShort2620.toInt())
                class198.aShortArray2614 = ShortArray(class198.aShort2620.toInt())
                class198.aByteArray2617 = ByteArray(class198.aShort2620.toInt())
                if (is_3_ != null) class198.aShortArray2621 = ShortArray(class198.aShort2620.toInt())
                for (i_14_ in 0..<class198.aShort2620) {
                    val i_15_ = `is`[i_14_]
                    val i_16_ = is_2_[i_14_]
                    val bool_17_ = false
                    var i_18_: Int
                    if (i_15_ == 0 && i_16_ == 0) i_18_ = (aByteArrayArray8220!![i]!![i_0_] - aByteArrayArray8232!![i]!![i_0_])
                    else if (i_15_ == 0 && i_16_ == this.anInt4592) i_18_ = (aByteArrayArray8220!![i]!![i_0_ + 1] - aByteArrayArray8232!![i]!![i_0_ + 1])
                    else if (i_15_ == this.anInt4592 && i_16_ == this.anInt4592) i_18_ = (aByteArrayArray8220!![i + 1]!![i_0_ + 1] - aByteArrayArray8232!![i + 1]!![i_0_ + 1])
                    else if (i_15_ == this.anInt4592 && i_16_ == 0) i_18_ = (aByteArrayArray8220!![i + 1]!![i_0_] - aByteArrayArray8232!![i + 1]!![i_0_])
                    else {
                        val i_19_ = (((aByteArrayArray8220!![i]!![i_0_] - aByteArrayArray8232!![i]!![i_0_]) * (this.anInt4592 - i_15_)) + (aByteArrayArray8220!![i + 1]!![i_0_] - aByteArrayArray8232!![i + 1]!![i_0_]) * i_15_)
                        val i_20_ = (((aByteArrayArray8220!![i]!![i_0_ + 1] - aByteArrayArray8232!![i]!![i_0_ + 1]) * (this.anInt4592 - i_15_)) + ((aByteArrayArray8220!![i + 1]!![i_0_ + 1] - aByteArrayArray8232!![i + 1]!![i_0_ + 1]) * i_15_))
                        i_18_ = (i_19_ * (this.anInt4592 - i_16_) + i_20_ * i_16_) shr 2 * this.anInt4588
                    }
                    val i_21_ = (i shl this.anInt4588) + i_15_
                    val i_22_ = (i_0_ shl this.anInt4588) + i_16_
                    class198.aShortArray2622!![i_14_] = i_15_.toShort()
                    class198.aShortArray2613!![i_14_] = i_16_.toShort()
                    class198.aShortArray2618!![i_14_] = (this.method3986(i_21_, i_22_, 64.toByte()) + (if (is_1_ != null) is_1_[i_14_] else 0)).toShort()
                    if (i_18_ < 0) i_18_ = 0
                    if (is_4_[i_14_] == 0) {
                        class198.anIntArray2623!![i_14_] = 0
                        if (is_5_ != null) class198.aByteArray2617!![i_14_] = i_18_.toByte()
                    } else {
                        var i_23_ = 0
                        if (is_3_ != null) {
                            val i_24_ = (is_3_[i_14_].toShort().also { class198.aShortArray2621!![i_14_] = it }).toInt()
                            if (i_9_ != 0) {
                                i_23_ = 255 * i_24_ / i_9_
                                if (i_23_ < 0) i_23_ = 0
                                else if (i_23_ > 255) i_23_ = 255
                            }
                        }
                        var i_25_ = -16777216
                        if (is_6_[i_14_] != -1 && method3997(aHa_Sub1_8217.aD4579!!.method3(is_6_[i_14_], -6662)!!.aByte213.toInt())) i_25_ = -1694498816
                        class198.anIntArray2623!![i_14_] = (i_25_ or Class298.method2250(method3991((is_4_[i_14_] shr 8), i_18_), 118, i_23_, i_8_))
                        if (is_5_ != null) class198.aByteArray2617!![i_14_] = i_18_.toByte()
                    }
                    class198.aShortArray2616!![i_14_] = is_6_[i_14_].toShort()
                    class198.aShortArray2614!![i_14_] = is_7_[i_14_].toShort()
                }
                if (is_5_ != null) class198.anIntArray2615 = IntArray(class198.aShort2619.toInt())
                for (i_26_ in 0..<class198.aShort2619) {
                    val i_27_ = i_26_ * 3
                    if (is_5_ != null && is_5_[i_27_] != 0) class198.anIntArray2615!![i_26_] = 0xffffff.inv() or (is_5_[i_27_] shr 8)
                }
                aClass198ArrayArray8219!![i]!![i_0_] = class198
            } else {
                var bool_28_ = true
                var i_29_ = -1
                var i_30_ = -1
                var i_31_ = -1
                var i_32_ = -1
                if (`is`.size == 6) {
                    for (i_33_ in 0..5) {
                        if (`is`[i_33_] == 0 && is_2_[i_33_] == 0) {
                            if (i_29_ != -1 && is_4_[i_29_] != is_4_[i_33_]) {
                                bool_28_ = false
                                break
                            }
                            i_29_ = i_33_
                        } else if (`is`[i_33_] == this.anInt4592 && is_2_[i_33_] == 0) {
                            if (i_30_ != -1 && is_4_[i_30_] != is_4_[i_33_]) {
                                bool_28_ = false
                                break
                            }
                            i_30_ = i_33_
                        } else if (`is`[i_33_] == this.anInt4592 && is_2_[i_33_] == this.anInt4592) {
                            if (i_31_ != -1 && is_4_[i_31_] != is_4_[i_33_]) {
                                bool_28_ = false
                                break
                            }
                            i_31_ = i_33_
                        } else if (`is`[i_33_] == 0 && is_2_[i_33_] == this.anInt4592) {
                            if (i_32_ != -1 && is_4_[i_32_] != is_4_[i_33_]) {
                                bool_28_ = false
                                break
                            }
                            i_32_ = i_33_
                        }
                    }
                    if (i_29_ == -1 || i_30_ == -1 || i_31_ == -1 || i_32_ == -1) bool_28_ = false
                    if (bool_28_) {
                        if (is_1_ != null) {
                            for (i_34_ in 0..3) {
                                if (is_1_[i_34_] != 0) {
                                    bool_28_ = false
                                    break
                                }
                            }
                        }
                        if (bool_28_) {
                            for (i_35_ in 1..3) {
                                if (`is`[i_35_] != `is`[0] && (`is`[i_35_] != `is`[0] + this.anInt4592) && (`is`[i_35_] != `is`[0] - this.anInt4592)) {
                                    bool_28_ = false
                                    break
                                }
                                if (is_2_[i_35_] != is_2_[0] && (is_2_[i_35_] != is_2_[0] + this.anInt4592) && (is_2_[i_35_] != is_2_[0] - this.anInt4592)) {
                                    bool_28_ = false
                                    break
                                }
                            }
                        }
                    }
                } else bool_28_ = false
                if (bool_28_) {
                    val class266 = Class266()
                    val i_36_ = is_4_[0]
                    val i_37_ = is_6_[0]
                    if (is_5_ != null) {
                        class266.anInt3388 = is_5_[0] shr 8
                        if (i_36_ == 0) class266.aByte3386 = (class266.aByte3386.toInt() or 0x2).toByte()
                    } else if (i_36_ == 0) return
                    if ((this.anIntArrayArray4584[i]!![i_0_] == this.anIntArrayArray4584[i + 1]!![i_0_]) && (this.anIntArrayArray4584[i]!![i_0_] == this.anIntArrayArray4584[i + 1]!![i_0_ + 1]) && (this.anIntArrayArray4584[i]!![i_0_] == this.anIntArrayArray4584[i]!![i_0_ + 1])) class266.aByte3386 = (class266.aByte3386.toInt() or 0x1).toByte()
                    if (i_37_ != -1 && (class266.aByte3386.toInt() and 0x2) == 0 && !(aHa_Sub1_8217.aD4579!!.method3(i_37_, -6662)!!.aBoolean209)) {
                        var i_38_: Int
                        if (is_3_ != null && i_9_ != 0) {
                            i_38_ = 255 * is_3_[i_29_] / i_9_
                            if (i_38_ < 0) i_38_ = 0
                            else if (i_38_ > 255) i_38_ = 255
                        } else i_38_ = 0
                        class266.anInt3389 = (Class298.method2250(method3991(is_4_[i_29_] shr 8, (aByteArrayArray8220!![i]!![i_0_] - aByteArrayArray8232!![i]!![i_0_])), 88, i_38_, i_8_))
                        if (class266.anInt3388 != 0) class266.anInt3389 = class266.anInt3389 or (255 - (aByteArrayArray8220!![i]!![i_0_] - aByteArrayArray8232!![i]!![i_0_]) shl 25)
                        if (is_3_ != null && i_9_ != 0) {
                            i_38_ = 255 * is_3_[i_30_] / i_9_
                            if (i_38_ < 0) i_38_ = 0
                            else if (i_38_ > 255) i_38_ = 255
                        } else i_38_ = 0
                        class266.anInt3387 = (Class298.method2250(method3991(is_4_[i_30_] shr 8, (aByteArrayArray8220!![i + 1]!![i_0_] - (aByteArrayArray8232!![i + 1]!![i_0_]))), 97, i_38_, i_8_))
                        if (class266.anInt3388 != 0) class266.anInt3387 = class266.anInt3387 or (255 - (aByteArrayArray8220!![i + 1]!![i_0_] - aByteArrayArray8232!![i + 1]!![i_0_]) shl 25)
                        if (is_3_ != null && i_9_ != 0) {
                            i_38_ = 255 * is_3_[i_31_] / i_9_
                            if (i_38_ < 0) i_38_ = 0
                            else if (i_38_ > 255) i_38_ = 255
                        } else i_38_ = 0
                        class266.anInt3380 = (Class298.method2250(method3991(is_4_[i_31_] shr 8, ((aByteArrayArray8220!![i + 1]!![i_0_ + 1]) - (aByteArrayArray8232!![i + 1]!![i_0_ + 1]))), 103, i_38_, i_8_))
                        if (class266.anInt3388 != 0) class266.anInt3380 = class266.anInt3380 or (255 - (aByteArrayArray8220!![i + 1]!![i_0_ + 1] - (aByteArrayArray8232!![i + 1]!![i_0_ + 1])) shl 25)
                        if (is_3_ != null && i_9_ != 0) {
                            i_38_ = 255 * is_3_[i_32_] / i_9_
                            if (i_38_ < 0) i_38_ = 0
                            else if (i_38_ > 255) i_38_ = 255
                        } else i_38_ = 0
                        class266.anInt3381 = (Class298.method2250(method3991(is_4_[i_32_] shr 8, (aByteArrayArray8220!![i]!![i_0_ + 1] - (aByteArrayArray8232!![i]!![i_0_ + 1]))), 42, i_38_, i_8_))
                        class266.aShort3379 = i_37_.toShort()
                    } else {
                        var i_39_: Int
                        if (is_3_ != null && i_9_ != 0) {
                            i_39_ = 255 * is_3_[i_29_] / i_9_
                            if (i_39_ < 0) i_39_ = 0
                            else if (i_39_ > 255) i_39_ = 255
                        } else i_39_ = 0
                        class266.anInt3389 = (Class298.method2250(method3991(is_4_[i_29_] shr 8, (aByteArrayArray8220!![i]!![i_0_] - aByteArrayArray8232!![i]!![i_0_])), 68, i_39_, i_8_))
                        if (class266.anInt3388 != 0) class266.anInt3389 = class266.anInt3389 or (255 - (aByteArrayArray8220!![i]!![i_0_] - aByteArrayArray8232!![i]!![i_0_]) shl 25)
                        if (is_3_ != null && i_9_ != 0) {
                            i_39_ = 255 * is_3_[i_30_] / i_9_
                            if (i_39_ < 0) i_39_ = 0
                            else if (i_39_ > 255) i_39_ = 255
                        } else i_39_ = 0
                        class266.anInt3387 = (Class298.method2250(method3991(is_4_[i_30_] shr 8, (aByteArrayArray8220!![i + 1]!![i_0_] - (aByteArrayArray8232!![i + 1]!![i_0_]))), 112, i_39_, i_8_))
                        if (class266.anInt3388 != 0) class266.anInt3387 = class266.anInt3387 or (255 - (aByteArrayArray8220!![i + 1]!![i_0_] - aByteArrayArray8232!![i + 1]!![i_0_]) shl 25)
                        if (is_3_ != null && i_9_ != 0) {
                            i_39_ = 255 * is_3_[i_31_] / i_9_
                            if (i_39_ < 0) i_39_ = 0
                            else if (i_39_ > 255) i_39_ = 255
                        } else i_39_ = 0
                        class266.anInt3380 = (Class298.method2250(method3991(is_4_[i_31_] shr 8, ((aByteArrayArray8220!![i + 1]!![i_0_ + 1]) - (aByteArrayArray8232!![i + 1]!![i_0_ + 1]))), 62, i_39_, i_8_))
                        if (class266.anInt3388 != 0) class266.anInt3380 = class266.anInt3380 or (255 - (aByteArrayArray8220!![i + 1]!![i_0_ + 1] - (aByteArrayArray8232!![i + 1]!![i_0_ + 1])) shl 25)
                        if (is_3_ != null && i_9_ != 0) {
                            i_39_ = 255 * is_3_[i_32_] / i_9_
                            if (i_39_ < 0) i_39_ = 0
                            else if (i_39_ > 255) i_39_ = 255
                        } else i_39_ = 0
                        class266.anInt3381 = (Class298.method2250(method3991(is_4_[i_32_] shr 8, (aByteArrayArray8220!![i]!![i_0_ + 1] - (aByteArrayArray8232!![i]!![i_0_ + 1]))), 84, i_39_, i_8_))
                        if (class266.anInt3388 != 0) class266.anInt3381 = class266.anInt3381 or (255 - (aByteArrayArray8220!![i]!![i_0_ + 1] - aByteArrayArray8232!![i]!![i_0_ + 1]) shl 25)
                        class266.aShort3379 = (-1).toShort()
                    }
                    if (is_3_ != null) {
                        class266.aShort3384 = is_3_[i_31_].toShort()
                        class266.aShort3385 = is_3_[i_32_].toShort()
                        class266.aShort3383 = is_3_[i_30_].toShort()
                        class266.aShort3382 = is_3_[i_29_].toShort()
                    }
                    aClass266ArrayArray8230!![i]!![i_0_] = class266
                } else {
                    val class145 = Class145()
                    class145.aShort2003 = `is`.size.toShort()
                    class145.aShort2010 = (`is`.size / 3).toShort()
                    class145.aShortArray2009 = ShortArray(class145.aShort2003.toInt())
                    class145.aShortArray2007 = ShortArray(class145.aShort2003.toInt())
                    class145.aShortArray2002 = ShortArray(class145.aShort2003.toInt())
                    class145.anIntArray2001 = IntArray(class145.aShort2003.toInt())
                    if (is_3_ != null) class145.aShortArray2006 = ShortArray(class145.aShort2003.toInt())
                    for (i_40_ in 0..<class145.aShort2003) {
                        val i_41_ = `is`[i_40_]
                        val i_42_ = is_2_[i_40_]
                        val bool_43_ = false
                        var i_44_: Int
                        if (i_41_ == 0 && i_42_ == 0) i_44_ = (aByteArrayArray8220!![i]!![i_0_] - aByteArrayArray8232!![i]!![i_0_])
                        else if (i_41_ == 0 && i_42_ == this.anInt4592) i_44_ = (aByteArrayArray8220!![i]!![i_0_ + 1] - aByteArrayArray8232!![i]!![i_0_ + 1])
                        else if (i_41_ == this.anInt4592 && i_42_ == this.anInt4592) i_44_ = (aByteArrayArray8220!![i + 1]!![i_0_ + 1] - aByteArrayArray8232!![i + 1]!![i_0_ + 1])
                        else if (i_41_ == this.anInt4592 && i_42_ == 0) i_44_ = (aByteArrayArray8220!![i + 1]!![i_0_] - aByteArrayArray8232!![i + 1]!![i_0_])
                        else {
                            val i_45_ = (((aByteArrayArray8220!![i]!![i_0_] - aByteArrayArray8232!![i]!![i_0_]) * (this.anInt4592 - i_41_)) + ((aByteArrayArray8220!![i + 1]!![i_0_] - aByteArrayArray8232!![i + 1]!![i_0_]) * i_41_))
                            val i_46_ = (((aByteArrayArray8220!![i]!![i_0_ + 1] - aByteArrayArray8232!![i]!![i_0_ + 1]) * (this.anInt4592 - i_41_)) + ((aByteArrayArray8220!![i + 1]!![i_0_ + 1] - aByteArrayArray8232!![i + 1]!![i_0_ + 1]) * i_41_))
                            i_44_ = ((i_45_ * (this.anInt4592 - i_42_) + i_46_ * i_42_) shr 2 * this.anInt4588)
                        }
                        val i_47_ = (i shl this.anInt4588) + i_41_
                        val i_48_ = (i_0_ shl this.anInt4588) + i_42_
                        class145.aShortArray2009!![i_40_] = i_41_.toShort()
                        class145.aShortArray2002!![i_40_] = i_42_.toShort()
                        class145.aShortArray2007!![i_40_] = (this.method3986(i_47_, i_48_, 126.toByte()) + (if (is_1_ != null) is_1_[i_40_] else 0)).toShort()
                        if (i_44_ < 0) i_44_ = 0
                        if (is_4_[i_40_] == 0) {
                            if (is_5_ != null) class145.anIntArray2001!![i_40_] = i_44_ shl 25
                            else class145.anIntArray2001!![i_40_] = 0
                        } else {
                            var i_49_ = 0
                            if (is_3_ != null) {
                                val i_50_ = (is_3_[i_40_].toShort().also { class145.aShortArray2006!![i_40_] = it }).toInt()
                                if (i_9_ != 0) {
                                    i_49_ = 255 * i_50_ / i_9_
                                    if (i_49_ < 0) i_49_ = 0
                                    else if (i_49_ > 255) i_49_ = 255
                                }
                            }
                            class145.anIntArray2001!![i_40_] = Class298.method2250(method3991((is_4_[i_40_] shr 8), i_44_), 40, i_49_, i_8_)
                            if (is_5_ != null) class145.anIntArray2001!![i_40_] = class145.anIntArray2001!![i_40_] or (i_44_ shl 25)
                        }
                    }
                    var bool_51_ = false
                    for (i_52_ in 0..<class145.aShort2010) {
                        if (is_6_[i_52_ * 3] != -1 && !(aHa_Sub1_8217.aD4579!!.method3(is_6_[i_52_ * 3], -6662)!!.aBoolean209)) bool_51_ = true
                    }
                    if (is_5_ != null) class145.anIntArray2011 = IntArray(class145.aShort2010.toInt())
                    if (bool_51_) {
                        class145.aShortArray2008 = ShortArray(class145.aShort2010.toInt())
                        class145.aShortArray2005 = ShortArray(class145.aShort2010.toInt())
                    }
                    for (i_53_ in 0..<class145.aShort2010) {
                        val i_54_ = i_53_ * 3
                        if (is_5_ != null && is_5_[i_54_] != 0) class145.anIntArray2011!![i_53_] = is_5_[i_54_] shr 8
                        if (bool_51_) {
                            val i_55_ = i_54_ + 1
                            val i_56_ = i_55_ + 1
                            var bool_57_ = false
                            var bool_58_ = true
                            var i_59_ = is_6_[i_54_]
                            if (i_59_ == -1 || (aHa_Sub1_8217.aD4579!!.method3(i_59_, -6662)!!.aBoolean209)) bool_58_ = false
                            else bool_57_ = true
                            i_59_ = is_6_[i_55_]
                            if (i_59_ == -1 || (aHa_Sub1_8217.aD4579!!.method3(i_59_, -6662)!!.aBoolean209)) bool_58_ = false
                            else bool_57_ = true
                            i_59_ = is_6_[i_56_]
                            if (i_59_ == -1 || (aHa_Sub1_8217.aD4579!!.method3(i_59_, -6662)!!.aBoolean209)) bool_58_ = false
                            else bool_57_ = true
                            if (bool_58_) {
                                class145.aShortArray2008!![i_53_] = i_59_.toShort()
                                class145.aShortArray2005!![i_53_] = is_7_[i_54_].toShort()
                            } else {
                                if (bool_57_) {
                                    i_59_ = is_6_[i_54_]
                                    if (i_59_ != -1 && !(aHa_Sub1_8217.aD4579!!.method3(i_59_, -6662)!!.aBoolean209)) class145.anIntArray2001!![i_54_] = (Class126.anIntArray4983!![(Class25.method303((aHa_Sub1_8217.aD4579!!.method3(i_59_, -6662)!!.aShort208).toInt() and 0xffff, 30)).toInt() and 0xffff])
                                    i_59_ = is_6_[i_55_]
                                    if (i_59_ != -1 && !(aHa_Sub1_8217.aD4579!!.method3(i_59_, -6662)!!.aBoolean209)) class145.anIntArray2001!![i_55_] = (Class126.anIntArray4983!![(Class25.method303((aHa_Sub1_8217.aD4579!!.method3(i_59_, -6662)!!.aShort208).toInt() and 0xffff, 30)).toInt() and 0xffff])
                                    i_59_ = is_6_[i_56_]
                                    if (i_59_ != -1 && !(aHa_Sub1_8217.aD4579!!.method3(i_59_, -6662)!!.aBoolean209)) class145.anIntArray2001!![i_56_] = (Class126.anIntArray4983!![(Class25.method303((aHa_Sub1_8217.aD4579!!.method3(i_59_, -6662)!!.aShort208).toInt() and 0xffff, 30)).toInt() and 0xffff])
                                }
                                class145.aShortArray2008!![i_53_] = (-1).toShort()
                            }
                        }
                    }
                    aClass145ArrayArray8225!![i]!![i_0_] = class145
                }
            }
        }
    }

    override fun method3978(i: Int, i_60_: Int, `is`: IntArray, is_61_: IntArray, is_62_: IntArray, is_63_: IntArray, is_64_: IntArray, is_65_: IntArray, is_66_: IntArray, is_67_: IntArray, is_68_: IntArray, is_69_: IntArray, is_70_: IntArray, i_71_: Int, i_72_: Int, i_73_: Int, bool: Boolean) {
        if (aClass102ArrayArray8215 == null) {
            aClass102ArrayArray8215 = Array<Array<Class102?>?>(this.anInt4587) { arrayOfNulls<Class102?>(this.anInt4590) }
            aClass236ArrayArray8222 = Array<Array<Class236?>?>(this.anInt4587) { arrayOfNulls<Class236?>(this.anInt4590) }
        } else check(!(aClass266ArrayArray8230 != null || aClass198ArrayArray8219 != null))
        var bool_74_ = false
        if (is_67_.size == 2 && is_64_.size == 2 && (is_67_[0] == is_67_[1] || is_69_[0] != -1 && is_69_[0] == is_69_[1])) {
            bool_74_ = true
            for (i_75_ in 1..1) {
                val i_76_ = `is`[is_64_[i_75_]]
                val i_77_ = is_62_[is_64_[i_75_]]
                if (i_76_ != 0 && i_76_ != this.anInt4592 || i_77_ != 0 && i_77_ != this.anInt4592) {
                    bool_74_ = false
                    break
                }
            }
        }
        if (!bool_74_) {
            val class236 = Class236()
            val i_78_ = `is`.size.toShort().toInt()
            val i_79_ = is_67_.size.toShort().toInt()
            class236.aShort3089 = i_78_.toShort()
            class236.aShortArray3088 = ShortArray(i_78_)
            class236.aShortArray3096 = ShortArray(i_78_)
            class236.aShortArray3097 = ShortArray(i_78_)
            class236.aShortArray3094 = ShortArray(i_78_)
            for (i_80_ in 0..<i_78_) {
                val i_81_ = `is`[i_80_]
                val i_82_ = is_62_[i_80_]
                if (i_81_ == 0 && i_82_ == 0) class236.aShortArray3088!![i_80_] = (aByteArrayArray8220!![i]!![i_60_] - aByteArrayArray8232!![i]!![i_60_]).toShort()
                else if (i_81_ == 0 && i_82_ == this.anInt4592) class236.aShortArray3088!![i_80_] = (aByteArrayArray8220!![i]!![i_60_ + 1] - aByteArrayArray8232!![i]!![i_60_ + 1]).toShort()
                else if (i_81_ == this.anInt4592 && i_82_ == this.anInt4592) class236.aShortArray3088!![i_80_] = (aByteArrayArray8220!![i + 1]!![i_60_ + 1] - aByteArrayArray8232!![i + 1]!![i_60_ + 1]).toShort()
                else if (i_81_ == this.anInt4592 && i_82_ == 0) class236.aShortArray3088!![i_80_] = (aByteArrayArray8220!![i + 1]!![i_60_] - aByteArrayArray8232!![i + 1]!![i_60_]).toShort()
                else {
                    val i_83_ = (((aByteArrayArray8220!![i]!![i_60_] - aByteArrayArray8232!![i]!![i_60_]) * (this.anInt4592 - i_81_)) + (aByteArrayArray8220!![i + 1]!![i_60_] - aByteArrayArray8232!![i + 1]!![i_60_]) * i_81_)
                    val i_84_ = (((aByteArrayArray8220!![i]!![i_60_ + 1] - aByteArrayArray8232!![i]!![i_60_ + 1]) * (this.anInt4592 - i_81_)) + ((aByteArrayArray8220!![i + 1]!![i_60_ + 1] - aByteArrayArray8232!![i + 1]!![i_60_ + 1]) * i_81_))
                    class236.aShortArray3088!![i_80_] = ((i_83_ * (this.anInt4592 - i_82_) + i_84_ * i_82_) shr 2 * this.anInt4588).toShort()
                }
                val i_85_ = (i shl this.anInt4588) + i_81_
                val i_86_ = (i_60_ shl this.anInt4588) + i_82_
                class236.aShortArray3096!![i_80_] = i_81_.toShort()
                class236.aShortArray3094!![i_80_] = i_82_.toShort()
                class236.aShortArray3097!![i_80_] = (this.method3986(i_85_, i_86_, 67.toByte()) + (if (is_61_ != null) is_61_[i_80_] else 0)).toShort()
                if (class236.aShortArray3088!![i_80_] < 2) class236.aShortArray3088!![i_80_] = 2.toShort()
            }
            var bool_87_ = false
            var i_88_ = 0
            for (i_89_ in 0..<i_79_) {
                if (is_67_[i_89_] >= 0 || is_68_ != null && is_68_[i_89_] >= 0) i_88_++
                val i_90_ = is_69_[i_89_]
                if (i_90_ != -1) {
                    val class12 = aHa_Sub1_8217.aD4579!!.method3(i_90_, -6662)
                    if (!class12!!.aBoolean209) {
                        bool_87_ = true
                        if (method3997(class12.aByte213.toInt()) || class12.aByte198.toInt() != 0 || class12.aByte211.toInt() != 0) class236.aByte3100 = (class236.aByte3100.toInt() or 0x4).toByte()
                    }
                }
            }
            class236.anIntArray3093 = IntArray(i_88_)
            if (is_68_ != null) class236.anIntArray3092 = IntArray(i_88_)
            class236.aShortArray3091 = ShortArray(i_88_)
            class236.aShortArray3090 = ShortArray(i_88_)
            class236.aShortArray3101 = ShortArray(i_88_)
            if (bool_87_) {
                class236.aShortArray3095 = ShortArray(i_88_)
                class236.aShortArray3098 = ShortArray(i_88_)
            }
            for (i_91_ in 0..<i_79_) {
                if (is_67_[i_91_] >= 0 || is_68_ != null && is_68_[i_91_] >= 0) {
                    if (is_67_[i_91_] >= 0) class236.anIntArray3093!![class236.aShort3099.toInt()] = Class25.method303(is_67_[i_91_], 30).toInt()
                    else class236.anIntArray3093!![class236.aShort3099.toInt()] = -1
                    if (is_68_ != null) {
                        if (is_68_[i_91_] != -1) class236.anIntArray3092!![class236.aShort3099.toInt()] = Class25.method303(is_68_[i_91_], 30).toInt()
                        else class236.anIntArray3092!![class236.aShort3099.toInt()] = -1
                    }
                    class236.aShortArray3091!![class236.aShort3099.toInt()] = is_64_[i_91_].toShort()
                    class236.aShortArray3090!![class236.aShort3099.toInt()] = is_65_[i_91_].toShort()
                    class236.aShortArray3101!![class236.aShort3099.toInt()] = is_66_[i_91_].toShort()
                    if (bool_87_) {
                        if (is_69_[i_91_] != -1 && !(aHa_Sub1_8217.aD4579!!.method3(is_69_[i_91_], -6662)!!.aBoolean209)) {
                            class236.aShortArray3095!![class236.aShort3099.toInt()] = is_69_[i_91_].toShort()
                            class236.aShortArray3098!![class236.aShort3099.toInt()] = is_70_[i_91_].toShort()
                        } else class236.aShortArray3095!![class236.aShort3099.toInt()] = (-1).toShort()
                    }
                    class236.aShort3099++
                }
            }
            aClass236ArrayArray8222!![i]!![i_60_] = class236
        } else if (is_67_[0] >= 0 || is_68_ != null && is_68_[0] >= 0) {
            val class102 = Class102()
            val i_92_ = is_67_[0]
            val i_93_ = is_69_[0]
            if (is_68_ != null) {
                class102.anInt1600 = Class291.method2198(0, (aByteArrayArray8220!![i]!![i_60_] - aByteArrayArray8232!![i]!![i_60_]), Class25.method303(is_68_[0], 30).toInt())
                if (i_92_ == -1) class102.aByte1606 = (class102.aByte1606.toInt() or 0x2).toByte()
            }
            if ((this.anIntArrayArray4584!![i]!![i_60_] == this.anIntArrayArray4584!![i + 1]!![i_60_]) && (this.anIntArrayArray4584!![i]!![i_60_] == this.anIntArrayArray4584!![i + 1]!![i_60_ + 1]) && (this.anIntArrayArray4584!![i]!![i_60_] == this.anIntArrayArray4584!![i]!![i_60_ + 1])) class102.aByte1606 = (class102.aByte1606.toInt() or 0x1).toByte()
            var class12: Class12? = null
            if (i_93_ != -1) class12 = aHa_Sub1_8217.aD4579!!.method3(i_93_, -6662)
            if (class12 != null && (class102.aByte1606.toInt() and 0x2) == 0 && !class12.aBoolean209) {
                class102.aShort1601 = (aByteArrayArray8220!![i]!![i_60_] - aByteArrayArray8232!![i]!![i_60_]).toShort()
                class102.aShort1603 = (aByteArrayArray8220!![i + 1]!![i_60_] - aByteArrayArray8232!![i + 1]!![i_60_]).toShort()
                class102.aShort1602 = (aByteArrayArray8220!![i + 1]!![i_60_ + 1] - aByteArrayArray8232!![i + 1]!![i_60_ + 1]).toShort()
                class102.aShort1604 = (aByteArrayArray8220!![i]!![i_60_ + 1] - aByteArrayArray8232!![i]!![i_60_ + 1]).toShort()
                class102.aShort1605 = i_93_.toShort()
                if (method3997(class12.aByte213.toInt()) || class12.aByte198.toInt() != 0 || class12.aByte211.toInt() != 0) class102.aByte1606 = (class102.aByte1606.toInt() or 0x4).toByte()
            } else {
                val i_94_ = Class25.method303(i_92_, 30)
                class102.aShort1601 = Class291.method2198(0, ((aByteArrayArray8220!![i]!![i_60_]) - (aByteArrayArray8232!![i]!![i_60_])), i_94_.toInt()).toShort()
                class102.aShort1603 = Class291.method2198(0, ((aByteArrayArray8220!![i + 1]!![i_60_]) - (aByteArrayArray8232!![i + 1]!![i_60_])), i_94_.toInt()).toShort()
                class102.aShort1602 = Class291.method2198(0, ((aByteArrayArray8220!![i + 1]!![i_60_ + 1]) - (aByteArrayArray8232!![i + 1]!![i_60_ + 1])), i_94_.toInt()).toShort()
                class102.aShort1604 = Class291.method2198(0, ((aByteArrayArray8220!![i]!![i_60_ + 1]) - (aByteArrayArray8232!![i]!![i_60_ + 1])), i_94_.toInt()).toShort()
                class102.aShort1605 = (-1).toShort()
            }
            aClass102ArrayArray8215!![i]!![i_60_] = class102
        }
    }

    override fun method3984(i: Int, i_95_: Int, i_96_: Int, bools: Array<BooleanArray?>?, bool: Boolean, i_97_: Int, i_98_: Int) {
        val class101_sub1 = aHa_Sub1_8217.aClass101_Sub1_7492!!
        anInt8228 = i_97_
        aFloat8212 = class101_sub1.aFloat5672
        aFloat8216 = class101_sub1.aFloat5673
        aFloat8224 = class101_sub1.aFloat5669
        aFloat8213 = class101_sub1.aFloat5686
        aFloat8214 = class101_sub1.aFloat5655
        aFloat8221 = class101_sub1.aFloat5678
        aFloat8229 = class101_sub1.aFloat5666
        aFloat8226 = class101_sub1.aFloat5685
        aFloat8233 = class101_sub1.aFloat5662
        aFloat8227 = class101_sub1.aFloat5680
        aFloat8231 = class101_sub1.aFloat5664
        aFloat8218 = class101_sub1.aFloat5681
        for (i_99_ in 0..<i_96_ + i_96_) {
            for (i_100_ in 0..<i_96_ + i_96_) {
                if (bools!!!![i_99_]!![i_100_]) {
                    val i_101_ = i - i_96_ + i_99_
                    val i_102_ = i_95_ - i_96_ + i_100_
                    if (i_101_ >= 0 && i_101_ < this.anInt4587 && i_102_ >= 0 && i_102_ < this.anInt4590) method3992(i_101_, i_102_, i_98_)
                }
            }
        }
    }

    override fun ka(i: Int, i_103_: Int, i_104_: Int) {
        if (aByteArrayArray8232!![i]!![i_103_] < i_104_) aByteArrayArray8232!![i]!![i_103_] = i_104_.toByte()
    }

    private fun method3990(i: Int, i_105_: Int, bool: Boolean, class167: Class167, class109: Class109, `is`: IntArray, is_106_: IntArray, is_107_: IntArray, is_108_: IntArray, i_109_: Int) {
        val class266 = aClass266ArrayArray8230!![i]!![i_105_]
        if (class266 == null) {
            val class145 = aClass145ArrayArray8225!![i]!![i_105_]
            if (class145 != null) {
                if (i_109_ != 0) {
                    if ((class145.aByte2004.toInt() and 0x4) != 0) {
                        if ((i_109_ and 0x1) != 0) return
                    } else if ((i_109_ and 0x2) != 0) return
                }
                if (anInt8228 == -1) {
                    for (i_187_ in 0..<class145.aShort2003) {
                        val i_188_ = (class145.aShortArray2009!![i_187_] + (i shl this.anInt4588))
                        var i_189_ = class145.aShortArray2007!![i_187_].toInt()
                        val i_190_ = (class145.aShortArray2002!![i_187_] + (i_105_ shl this.anInt4588))
                        val f = aFloat8218 + (aFloat8233 * i_188_.toFloat() + aFloat8227 * i_189_.toFloat() + aFloat8231 * i_190_.toFloat())
                        if (f <= aHa_Sub1_8217.anInt7482.toFloat()) return
                        is_108_[i_187_] = 0
                        if (bool) {
                            var i_191_ = (f - (class167.anInt2210).toFloat()).toInt()
                            if (i_191_ > 255) i_191_ = 255
                            if (i_191_ > 0) {
                                is_108_[i_187_] = i_191_
                                val i_192_ = ((class145.aShortArray2006!![i_187_]) * i_191_ / 255)
                                if (i_192_ > 0) i_189_ -= i_192_
                            }
                        } else if (class167.aBoolean2201) {
                            val i_193_ = (f - (class167.anInt2210).toFloat()).toInt()
                            if (i_193_ > 0) {
                                is_108_[i_187_] = i_193_
                                if (is_108_[i_187_] > 255) is_108_[i_187_] = 255
                            }
                        }
                        val f_194_ = aFloat8213 + (aFloat8212 * i_188_.toFloat() + aFloat8216 * i_189_.toFloat() + aFloat8224 * i_190_.toFloat())
                        val f_195_ = aFloat8226 + (aFloat8214 * i_188_.toFloat() + aFloat8221 * i_189_.toFloat() + aFloat8229 * i_190_.toFloat())
                        `is`[i_187_] = (class109.anInt1665 + (f_194_ * (aHa_Sub1_8217.anInt7491).toFloat() / f).toInt())
                        is_106_[i_187_] = (class109.anInt1668 + (f_195_ * (aHa_Sub1_8217.anInt7497).toFloat() / f).toInt())
                        is_107_[i_187_] = f.toInt()
                    }
                } else {
                    for (i_196_ in 0..<class145.aShort2003) {
                        val i_197_ = (class145.aShortArray2009!![i_196_] + (i shl this.anInt4588))
                        var i_198_ = class145.aShortArray2007!![i_196_].toInt()
                        val i_199_ = (class145.aShortArray2002!![i_196_] + (i_105_ shl this.anInt4588))
                        val f = aFloat8218 + (aFloat8233 * i_197_.toFloat() + aFloat8227 * i_198_.toFloat() + aFloat8231 * i_199_.toFloat())
                        is_108_[i_196_] = 0
                        if (bool) {
                            var i_200_ = anInt8228 - class167.anInt2210
                            if (i_200_ > 255) i_200_ = 255
                            if (i_200_ > 0) {
                                is_108_[i_196_] = i_200_
                                val i_201_ = ((class145.aShortArray2006!![i_196_]) * i_200_ / 255)
                                if (i_201_ > 0) i_198_ -= i_201_
                            }
                        } else if (class167.aBoolean2201) {
                            val i_202_ = anInt8228 - class167.anInt2210
                            if (i_202_ > 0) {
                                is_108_[i_196_] = i_202_
                                if (is_108_[i_196_] > 255) is_108_[i_196_] = 255
                            }
                        }
                        val f_203_ = aFloat8213 + (aFloat8212 * i_197_.toFloat() + aFloat8216 * i_198_.toFloat() + aFloat8224 * i_199_.toFloat())
                        val f_204_ = aFloat8226 + (aFloat8214 * i_197_.toFloat() + aFloat8221 * i_198_.toFloat() + aFloat8229 * i_199_.toFloat())
                        `is`[i_196_] = (class109.anInt1665 + (f_203_ * (aHa_Sub1_8217.anInt7491).toFloat() / anInt8228.toFloat()).toInt())
                        is_106_[i_196_] = (class109.anInt1668 + (f_204_ * (aHa_Sub1_8217.anInt7497).toFloat() / anInt8228.toFloat()).toInt())
                        is_107_[i_196_] = f.toInt()
                    }
                }
                if (class145.aShortArray2008 == null) {
                    for (i_233_ in 0..<class145.aShort2010) {
                        val i_234_ = i_233_ * 3
                        val i_235_ = i_234_ + 1
                        val i_236_ = i_235_ + 1
                        val i_237_ = `is`[i_234_]
                        val i_238_ = `is`[i_235_]
                        val i_239_ = `is`[i_236_]
                        val i_240_ = is_106_[i_234_]
                        val i_241_ = is_106_[i_235_]
                        val i_242_ = is_106_[i_236_]
                        val i_243_ = (is_108_[i_234_] + is_108_[i_235_] + is_108_[i_236_])
                        if (((i_237_ - i_238_) * (i_242_ - i_241_) - (i_240_ - i_241_) * (i_239_ - i_238_)) > 0) {
                            class109.aBoolean1671 = (i_237_ < 0 || i_238_ < 0 || i_239_ < 0 || i_237_ > class109.anInt1679 || i_238_ > class109.anInt1679 || (i_239_ > class109.anInt1679))
                            if (i_243_ < 765) {
                                if (i_243_ > 0) {
                                    if (((class145.anIntArray2001!![i_234_]) and 0xffffff) != 0) class109.method1027(
                                        i_240_.toFloat(),
                                        i_241_.toFloat(),
                                        i_242_.toFloat(),
                                        i_237_.toFloat(),
                                        i_238_.toFloat(),
                                        i_239_.toFloat(),
                                        is_107_[i_234_].toFloat(),
                                        is_107_[i_235_].toFloat(),
                                        is_107_[i_236_].toFloat(),
                                        (Class298.method2250((class145.anIntArray2001!![i_234_]), 117, is_108_[i_234_], (class167.anInt2192))),
                                        (Class298.method2250((class145.anIntArray2001!![i_235_]), 60, is_108_[i_235_], (class167.anInt2192))),
                                        (Class298.method2250((class145.anIntArray2001!![i_236_]), 95, is_108_[i_236_], (class167.anInt2192)))
                                    )
                                } else if (((class145.anIntArray2001!![i_234_]) and 0xffffff) != 0) class109.method1027(i_240_.toFloat(), i_241_.toFloat(), i_242_.toFloat(), i_237_.toFloat(), i_238_.toFloat(), i_239_.toFloat(), is_107_[i_234_].toFloat(), is_107_[i_235_].toFloat(), is_107_[i_236_].toFloat(), (class145.anIntArray2001!![i_234_]), (class145.anIntArray2001!![i_235_]), (class145.anIntArray2001!![i_236_]))
                            } else class109.method1018(i_240_.toFloat(), i_241_.toFloat(), i_242_.toFloat(), i_237_.toFloat(), i_238_.toFloat(), i_239_.toFloat(), is_107_[i_234_].toFloat(), is_107_[i_235_].toFloat(), is_107_[i_236_].toFloat(), (class167.anInt2192))
                        }
                    }
                } else if (anInt8228 == -1) {
                    for (i_205_ in 0..<class145.aShort2010) {
                        val i_206_ = i_205_ * 3
                        val i_207_ = i_206_ + 1
                        val i_208_ = i_207_ + 1
                        val i_209_ = `is`[i_206_]
                        val i_210_ = `is`[i_207_]
                        val i_211_ = `is`[i_208_]
                        val i_212_ = is_106_[i_206_]
                        val i_213_ = is_106_[i_207_]
                        val i_214_ = is_106_[i_208_]
                        val i_215_ = (is_108_[i_206_] + is_108_[i_207_] + is_108_[i_208_])
                        if (((i_209_ - i_210_) * (i_214_ - i_213_) - (i_212_ - i_213_) * (i_211_ - i_210_)) > 0) {
                            class109.aBoolean1671 = (i_209_ < 0 || i_210_ < 0 || i_211_ < 0 || (i_209_ > class109.anInt1679) || (i_210_ > class109.anInt1679) || (i_211_ > class109.anInt1679))
                            val i_216_ = (class145.aShortArray2008!![i_205_])
                            if (i_215_ < 765) {
                                if (i_215_ > 0) {
                                    if (i_216_.toInt() != -1) {
                                        var i_217_ = -16777216
                                        if (i_216_.toInt() != -1 && method3997(aHa_Sub1_8217.aD4579!!.method3(i_216_.toInt(), -6662)!!.aByte213.toInt())) i_217_ = -1694498816
                                        class109.method1024(
                                            i_212_.toFloat(),
                                            i_213_.toFloat(),
                                            i_214_.toFloat(),
                                            i_209_.toFloat(),
                                            i_210_.toFloat(),
                                            i_211_.toFloat(),
                                            is_107_[i_206_].toFloat(),
                                            is_107_[i_207_].toFloat(),
                                            is_107_[i_208_].toFloat(),
                                            ((class145.aShortArray2009!![i_206_]).toFloat() / (this.anInt4592).toFloat()),
                                            ((class145.aShortArray2009!![i_207_]).toFloat() / (this.anInt4592).toFloat()),
                                            ((class145.aShortArray2009!![i_208_]).toFloat() / (this.anInt4592).toFloat()),
                                            ((class145.aShortArray2002!![i_206_]).toFloat() / (this.anInt4592).toFloat()),
                                            ((class145.aShortArray2002!![i_207_]).toFloat() / (this.anInt4592).toFloat()),
                                            ((class145.aShortArray2002!![i_208_]).toFloat() / (this.anInt4592).toFloat()),
                                            (i_217_ or ((class145.anIntArray2001!![i_206_]) and 0xffffff)),
                                            (i_217_ or ((class145.anIntArray2001!![i_207_]) and 0xffffff)),
                                            (i_217_ or ((class145.anIntArray2001!![i_208_]) and 0xffffff)),
                                            (class167.anInt2192),
                                            is_108_[i_206_],
                                            is_108_[i_207_],
                                            is_108_[i_208_],
                                            i_216_.toInt()
                                        )
                                    } else if (((class145.anIntArray2001!![i_206_]) and 0xffffff) != 0) {
                                        if (i_216_.toInt() != -1 && method3997(aHa_Sub1_8217.aD4579!!.method3(i_216_.toInt(), -6662)!!.aByte213.toInt())) class109.anInt1674 = -1694498816
                                        class109.method1027(
                                            i_212_.toFloat(),
                                            i_213_.toFloat(),
                                            i_214_.toFloat(),
                                            i_209_.toFloat(),
                                            i_210_.toFloat(),
                                            i_211_.toFloat(),
                                            is_107_[i_206_].toFloat(),
                                            is_107_[i_207_].toFloat(),
                                            is_107_[i_208_].toFloat(),
                                            (Class6.method206((class145.anIntArray2001!![i_206_]), (is_108_[i_206_] shl 24 or (class167.anInt2192)), 255)),
                                            (Class6.method206((class145.anIntArray2001!![i_207_]), (is_108_[i_207_] shl 24 or (class167.anInt2192)), 255)),
                                            (Class6.method206((class145.anIntArray2001!![i_208_]), (is_108_[i_208_] shl 24 or (class167.anInt2192)), 255))
                                        )
                                        class109.anInt1674 = 0
                                    }
                                } else if (i_216_.toInt() != -1) {
                                    var i_218_ = -16777216
                                    if (i_216_.toInt() != -1 && (method3997(aHa_Sub1_8217.aD4579!!.method3(i_216_.toInt(), -6662)!!.aByte213.toInt()))) i_218_ = -1694498816
                                    class109.method1024(
                                        i_212_.toFloat(),
                                        i_213_.toFloat(),
                                        i_214_.toFloat(),
                                        i_209_.toFloat(),
                                        i_210_.toFloat(),
                                        i_211_.toFloat(),
                                        is_107_[i_206_].toFloat(),
                                        is_107_[i_207_].toFloat(),
                                        is_107_[i_208_].toFloat(),
                                        ((class145.aShortArray2009!![i_206_]).toFloat() / this.anInt4592.toFloat()),
                                        ((class145.aShortArray2009!![i_207_]).toFloat() / this.anInt4592.toFloat()),
                                        ((class145.aShortArray2009!![i_208_]).toFloat() / this.anInt4592.toFloat()),
                                        ((class145.aShortArray2002!![i_206_]).toFloat() / this.anInt4592.toFloat()),
                                        ((class145.aShortArray2002!![i_207_]).toFloat() / this.anInt4592.toFloat()),
                                        ((class145.aShortArray2002!![i_208_]).toFloat() / this.anInt4592.toFloat()),
                                        i_218_ or ((class145.anIntArray2001!![i_206_]) and 0xffffff),
                                        i_218_ or ((class145.anIntArray2001!![i_207_]) and 0xffffff),
                                        i_218_ or ((class145.anIntArray2001!![i_208_]) and 0xffffff),
                                        0,
                                        0,
                                        0,
                                        0,
                                        i_216_.toInt()
                                    )
                                } else if (((class145.anIntArray2001!![i_206_]) and 0xffffff) != 0) {
                                    if (i_216_.toInt() != -1 && (method3997(aHa_Sub1_8217.aD4579!!.method3(i_216_.toInt(), -6662)!!.aByte213.toInt()))) class109.anInt1674 = -1694498816
                                    class109.method1027(i_212_.toFloat(), i_213_.toFloat(), i_214_.toFloat(), i_209_.toFloat(), i_210_.toFloat(), i_211_.toFloat(), is_107_[i_206_].toFloat(), is_107_[i_207_].toFloat(), is_107_[i_208_].toFloat(), (class145.anIntArray2001!![i_206_]), (class145.anIntArray2001!![i_207_]), (class145.anIntArray2001!![i_208_]))
                                    class109.anInt1674 = 0
                                }
                            } else class109.method1018(i_212_.toFloat(), i_213_.toFloat(), i_214_.toFloat(), i_209_.toFloat(), i_210_.toFloat(), i_211_.toFloat(), is_107_[i_206_].toFloat(), is_107_[i_207_].toFloat(), is_107_[i_208_].toFloat(), class167.anInt2192)
                        }
                    }
                } else {
                    for (i_219_ in 0..<class145.aShort2010) {
                        val i_220_ = i_219_ * 3
                        val i_221_ = i_220_ + 1
                        val i_222_ = i_221_ + 1
                        val i_223_ = `is`[i_220_]
                        val i_224_ = `is`[i_221_]
                        val i_225_ = `is`[i_222_]
                        val i_226_ = is_106_[i_220_]
                        val i_227_ = is_106_[i_221_]
                        val i_228_ = is_106_[i_222_]
                        val i_229_ = (is_108_[i_220_] + is_108_[i_221_] + is_108_[i_222_])
                        if (((i_223_ - i_224_) * (i_228_ - i_227_) - (i_226_ - i_227_) * (i_225_ - i_224_)) > 0) {
                            class109.aBoolean1671 = (i_223_ < 0 || i_224_ < 0 || i_225_ < 0 || (i_223_ > class109.anInt1679) || (i_224_ > class109.anInt1679) || (i_225_ > class109.anInt1679))
                            val i_230_ = (class145.aShortArray2008!![i_219_])
                            if (i_229_ < 765) {
                                if (i_230_.toInt() != -1 && method3997(aHa_Sub1_8217.aD4579!!.method3(i_230_.toInt(), -6662)!!.aByte213.toInt())) class109.anInt1674 = -1694498816
                                if (i_229_ > 0) {
                                    if (i_230_.toInt() != -1) {
                                        var i_231_ = -16777216
                                        if (i_230_.toInt() != -1 && method3997(aHa_Sub1_8217.aD4579!!.method3(i_230_.toInt(), -6662)!!.aByte213.toInt())) i_231_ = -1694498816
                                        class109.method1024(
                                            i_226_.toFloat(),
                                            i_227_.toFloat(),
                                            i_228_.toFloat(),
                                            i_223_.toFloat(),
                                            i_224_.toFloat(),
                                            i_225_.toFloat(),
                                            is_107_[i_220_].toFloat(),
                                            is_107_[i_221_].toFloat(),
                                            is_107_[i_222_].toFloat(),
                                            ((class145.aShortArray2009!![i_220_]).toFloat() / (this.anInt4592).toFloat()),
                                            ((class145.aShortArray2009!![i_221_]).toFloat() / (this.anInt4592).toFloat()),
                                            ((class145.aShortArray2009!![i_222_]).toFloat() / (this.anInt4592).toFloat()),
                                            ((class145.aShortArray2002!![i_220_]).toFloat() / (this.anInt4592).toFloat()),
                                            ((class145.aShortArray2002!![i_221_]).toFloat() / (this.anInt4592).toFloat()),
                                            ((class145.aShortArray2002!![i_222_]).toFloat() / (this.anInt4592).toFloat()),
                                            (i_231_ or ((class145.anIntArray2001!![i_220_]) and 0xffffff)),
                                            (i_231_ or ((class145.anIntArray2001!![i_221_]) and 0xffffff)),
                                            (i_231_ or ((class145.anIntArray2001!![i_222_]) and 0xffffff)),
                                            (class167.anInt2192),
                                            is_108_[i_220_],
                                            is_108_[i_221_],
                                            is_108_[i_222_],
                                            i_230_.toInt()
                                        )
                                    } else if (((class145.anIntArray2001!![i_220_]) and 0xffffff) != 0) {
                                        if (i_230_.toInt() != -1 && method3997(aHa_Sub1_8217.aD4579!!.method3(i_230_.toInt(), -6662)!!.aByte213.toInt())) class109.anInt1674 = -1694498816
                                        class109.method1027(
                                            i_226_.toFloat(),
                                            i_227_.toFloat(),
                                            i_228_.toFloat(),
                                            i_223_.toFloat(),
                                            i_224_.toFloat(),
                                            i_225_.toFloat(),
                                            is_107_[i_220_].toFloat(),
                                            is_107_[i_221_].toFloat(),
                                            is_107_[i_222_].toFloat(),
                                            (Class6.method206((class145.anIntArray2001!![i_220_]), (is_108_[i_220_] shl 24 or (class167.anInt2192)), 255)),
                                            (Class6.method206((class145.anIntArray2001!![i_221_]), (is_108_[i_221_] shl 24 or (class167.anInt2192)), 255)),
                                            (Class6.method206((class145.anIntArray2001!![i_222_]), (is_108_[i_222_] shl 24 or (class167.anInt2192)), 255))
                                        )
                                        class109.anInt1674 = 0
                                    }
                                } else if (i_230_.toInt() != -1) {
                                    var i_232_ = -16777216
                                    if (i_230_.toInt() != -1 && (method3997(aHa_Sub1_8217.aD4579!!.method3(i_230_.toInt(), -6662)!!.aByte213.toInt()))) i_232_ = -1694498816
                                    class109.method1024(
                                        i_226_.toFloat(),
                                        i_227_.toFloat(),
                                        i_228_.toFloat(),
                                        i_223_.toFloat(),
                                        i_224_.toFloat(),
                                        i_225_.toFloat(),
                                        is_107_[i_220_].toFloat(),
                                        is_107_[i_221_].toFloat(),
                                        is_107_[i_222_].toFloat(),
                                        ((class145.aShortArray2009!![i_220_]).toFloat() / this.anInt4592.toFloat()),
                                        ((class145.aShortArray2009!![i_221_]).toFloat() / this.anInt4592.toFloat()),
                                        ((class145.aShortArray2009!![i_222_]).toFloat() / this.anInt4592.toFloat()),
                                        ((class145.aShortArray2002!![i_220_]).toFloat() / this.anInt4592.toFloat()),
                                        ((class145.aShortArray2002!![i_221_]).toFloat() / this.anInt4592.toFloat()),
                                        ((class145.aShortArray2002!![i_222_]).toFloat() / this.anInt4592.toFloat()),
                                        i_232_ or ((class145.anIntArray2001!![i_220_]) and 0xffffff),
                                        i_232_ or ((class145.anIntArray2001!![i_221_]) and 0xffffff),
                                        i_232_ or ((class145.anIntArray2001!![i_222_]) and 0xffffff),
                                        0,
                                        0,
                                        0,
                                        0,
                                        i_230_.toInt()
                                    )
                                } else if (((class145.anIntArray2001!![i_220_]) and 0xffffff) != 0) {
                                    if (i_230_.toInt() != -1 && (method3997(aHa_Sub1_8217.aD4579!!.method3(i_230_.toInt(), -6662)!!.aByte213.toInt()))) class109.anInt1674 = -1694498816
                                    class109.method1027(i_226_.toFloat(), i_227_.toFloat(), i_228_.toFloat(), i_223_.toFloat(), i_224_.toFloat(), i_225_.toFloat(), is_107_[i_220_].toFloat(), is_107_[i_221_].toFloat(), is_107_[i_222_].toFloat(), (class145.anIntArray2001!![i_220_]), (class145.anIntArray2001!![i_221_]), (class145.anIntArray2001!![i_222_]))
                                    class109.anInt1674 = 0
                                }
                                class109.anInt1674 = 0
                            } else class109.method1018(i_226_.toFloat(), i_227_.toFloat(), i_228_.toFloat(), i_223_.toFloat(), i_224_.toFloat(), i_225_.toFloat(), is_107_[i_220_].toFloat(), is_107_[i_221_].toFloat(), is_107_[i_222_].toFloat(), class167.anInt2192)
                        }
                    }
                }
            }
        } else if ((class266.aByte3386.toInt() and 0x2) == 0) {
            if (i_109_ != 0) {
                if ((class266.aByte3386.toInt() and 0x4) != 0) {
                    if ((i_109_ and 0x1) != 0) return
                } else if ((i_109_ and 0x2) != 0) return
            }
            val i_110_ = i * this.anInt4592
            val i_111_ = i_110_ + this.anInt4592
            val i_112_ = i_105_ * this.anInt4592
            val i_113_ = i_112_ + this.anInt4592
            var i_114_ = 0
            var i_115_ = 0
            var i_116_ = 0
            var i_117_ = 0
            val f: Float
            val f_118_: Float
            val f_119_: Float
            val f_120_: Float
            val i_121_: Int
            val i_122_: Int
            val i_123_: Int
            val i_124_: Int
            val i_125_: Int
            val i_126_: Int
            val i_127_: Int
            val i_128_: Int
            if ((class266.aByte3386.toInt() and 0x1) == 0 || bool) {
                var i_150_ = this.anIntArrayArray4584[i]!![i_105_]
                var i_151_ = this.anIntArrayArray4584[i + 1]!![i_105_]
                var i_152_ = this.anIntArrayArray4584[i + 1]!![i_105_ + 1]
                var i_153_ = this.anIntArrayArray4584[i]!![i_105_ + 1]
                if (anInt8228 == -1) {
                    f = aFloat8218 + (aFloat8233 * i_110_.toFloat() + aFloat8227 * i_150_.toFloat() + aFloat8231 * i_112_.toFloat())
                    if (f <= aHa_Sub1_8217.anInt7482.toFloat()) return
                    f_118_ = aFloat8218 + (aFloat8233 * i_111_.toFloat() + aFloat8227 * i_151_.toFloat() + aFloat8231 * i_112_.toFloat())
                    if (f_118_ <= aHa_Sub1_8217.anInt7482.toFloat()) return
                    f_119_ = aFloat8218 + (aFloat8233 * i_111_.toFloat() + aFloat8227 * i_152_.toFloat() + aFloat8231 * i_113_.toFloat())
                    if (f_119_ <= aHa_Sub1_8217.anInt7482.toFloat()) return
                    f_120_ = aFloat8218 + (aFloat8233 * i_110_.toFloat() + aFloat8227 * i_153_.toFloat() + aFloat8231 * i_113_.toFloat())
                    if (f_120_ <= aHa_Sub1_8217.anInt7482.toFloat()) return
                } else {
                    f = aFloat8218 + (aFloat8233 * i_110_.toFloat() + aFloat8227 * i_150_.toFloat() + aFloat8231 * i_112_.toFloat())
                    f_118_ = aFloat8218 + (aFloat8233 * i_111_.toFloat() + aFloat8227 * i_151_.toFloat() + aFloat8231 * i_112_.toFloat())
                    f_119_ = aFloat8218 + (aFloat8233 * i_111_.toFloat() + aFloat8227 * i_152_.toFloat() + aFloat8231 * i_113_.toFloat())
                    f_120_ = aFloat8218 + (aFloat8233 * i_110_.toFloat() + aFloat8227 * i_153_.toFloat() + aFloat8231 * i_113_.toFloat())
                }
                if (bool) {
                    var i_154_ = (f - (class167.anInt2210).toFloat()).toInt()
                    if (i_154_ > 255) i_154_ = 255
                    if (i_154_ > 0) {
                        i_114_ = i_154_
                        val i_155_ = (class266.aShort3382 * i_154_ / 255)
                        if (i_155_ > 0) i_150_ -= i_155_
                    }
                    i_154_ = (f_118_ - (class167.anInt2210).toFloat()).toInt()
                    if (i_154_ > 255) i_154_ = 255
                    if (i_154_ > 0) {
                        i_115_ = i_154_
                        val i_156_ = (class266.aShort3383 * i_154_ / 255)
                        if (i_156_ > 0) i_151_ -= i_156_
                    }
                    i_154_ = (f_119_ - (class167.anInt2210).toFloat()).toInt()
                    if (i_154_ > 255) i_154_ = 255
                    if (i_154_ > 0) {
                        i_116_ = i_154_
                        val i_157_ = (class266.aShort3384 * i_154_ / 255)
                        if (i_157_ > 0) i_152_ -= i_157_
                    }
                    i_154_ = (f_120_ - (class167.anInt2210).toFloat()).toInt()
                    if (i_154_ > 255) i_154_ = 255
                    if (i_154_ > 0) {
                        i_117_ = i_154_
                        val i_158_ = (class266.aShort3385 * i_154_ / 255)
                        if (i_158_ > 0) i_153_ -= i_158_
                    }
                } else if (class167.aBoolean2201) {
                    var i_159_ = (f - (class167.anInt2210).toFloat()).toInt()
                    if (i_159_ > 0) {
                        i_114_ = i_159_
                        if (i_114_ > 255) i_114_ = 255
                    }
                    i_159_ = (f_118_ - (class167.anInt2210).toFloat()).toInt()
                    if (i_159_ > 0) {
                        i_115_ = i_159_
                        if (i_115_ > 255) i_115_ = 255
                    }
                    i_159_ = (f_119_ - (class167.anInt2210).toFloat()).toInt()
                    if (i_159_ > 0) {
                        i_116_ = i_159_
                        if (i_116_ > 255) i_116_ = 255
                    }
                    i_159_ = (f_120_ - (class167.anInt2210).toFloat()).toInt()
                    if (i_159_ > 0) {
                        i_117_ = i_159_
                        if (i_117_ > 255) i_117_ = 255
                    }
                }
                if (anInt8228 == -1) {
                    val f_160_ = aFloat8213 + (aFloat8212 * i_110_.toFloat() + aFloat8216 * i_150_.toFloat() + aFloat8224 * i_112_.toFloat())
                    i_121_ = (class109.anInt1665 + (f_160_ * (aHa_Sub1_8217.anInt7491).toFloat() / f).toInt())
                    val f_161_ = aFloat8226 + (aFloat8214 * i_110_.toFloat() + aFloat8221 * i_150_.toFloat() + aFloat8229 * i_112_.toFloat())
                    i_122_ = (class109.anInt1668 + (f_161_ * (aHa_Sub1_8217.anInt7497).toFloat() / f).toInt())
                    val f_162_ = aFloat8213 + (aFloat8212 * i_111_.toFloat() + aFloat8216 * i_151_.toFloat() + aFloat8224 * i_112_.toFloat())
                    i_123_ = (class109.anInt1665 + (f_162_ * (aHa_Sub1_8217.anInt7491).toFloat() / f_118_).toInt())
                    val f_163_ = aFloat8226 + (aFloat8214 * i_111_.toFloat() + aFloat8221 * i_151_.toFloat() + aFloat8229 * i_112_.toFloat())
                    i_124_ = (class109.anInt1668 + (f_163_ * (aHa_Sub1_8217.anInt7497).toFloat() / f_118_).toInt())
                    val f_164_ = aFloat8213 + (aFloat8212 * i_111_.toFloat() + aFloat8216 * i_152_.toFloat() + aFloat8224 * i_113_.toFloat())
                    i_125_ = (class109.anInt1665 + (f_164_ * (aHa_Sub1_8217.anInt7491).toFloat() / f_119_).toInt())
                    val f_165_ = aFloat8226 + (aFloat8214 * i_111_.toFloat() + aFloat8221 * i_152_.toFloat() + aFloat8229 * i_113_.toFloat())
                    i_126_ = (class109.anInt1668 + (f_165_ * (aHa_Sub1_8217.anInt7497).toFloat() / f_119_).toInt())
                    val f_166_ = aFloat8213 + (aFloat8212 * i_110_.toFloat() + aFloat8216 * i_153_.toFloat() + aFloat8224 * i_113_.toFloat())
                    i_127_ = (class109.anInt1665 + (f_166_ * (aHa_Sub1_8217.anInt7491).toFloat() / f_120_).toInt())
                    val f_167_ = aFloat8226 + (aFloat8214 * i_110_.toFloat() + aFloat8221 * i_153_.toFloat() + aFloat8229 * i_113_.toFloat())
                    i_128_ = (class109.anInt1668 + (f_167_ * (aHa_Sub1_8217.anInt7497).toFloat() / f_120_).toInt())
                } else {
                    val f_168_ = aFloat8213 + (aFloat8212 * i_110_.toFloat() + aFloat8216 * i_150_.toFloat() + aFloat8224 * i_112_.toFloat())
                    i_121_ = (class109.anInt1665 + (f_168_ * (aHa_Sub1_8217.anInt7491).toFloat() / anInt8228.toFloat()).toInt())
                    val f_169_ = aFloat8226 + (aFloat8214 * i_110_.toFloat() + aFloat8221 * i_150_.toFloat() + aFloat8229 * i_112_.toFloat())
                    i_122_ = (class109.anInt1668 + (f_169_ * (aHa_Sub1_8217.anInt7497).toFloat() / anInt8228.toFloat()).toInt())
                    val f_170_ = aFloat8213 + (aFloat8212 * i_111_.toFloat() + aFloat8216 * i_151_.toFloat() + aFloat8224 * i_112_.toFloat())
                    i_123_ = (class109.anInt1665 + (f_170_ * (aHa_Sub1_8217.anInt7491).toFloat() / anInt8228.toFloat()).toInt())
                    val f_171_ = aFloat8226 + (aFloat8214 * i_111_.toFloat() + aFloat8221 * i_151_.toFloat() + aFloat8229 * i_112_.toFloat())
                    i_124_ = (class109.anInt1668 + (f_171_ * (aHa_Sub1_8217.anInt7497).toFloat() / anInt8228.toFloat()).toInt())
                    val f_172_ = aFloat8213 + (aFloat8212 * i_111_.toFloat() + aFloat8216 * i_152_.toFloat() + aFloat8224 * i_113_.toFloat())
                    i_125_ = (class109.anInt1665 + (f_172_ * (aHa_Sub1_8217.anInt7491).toFloat() / anInt8228.toFloat()).toInt())
                    val f_173_ = aFloat8226 + (aFloat8214 * i_111_.toFloat() + aFloat8221 * i_152_.toFloat() + aFloat8229 * i_113_.toFloat())
                    i_126_ = (class109.anInt1668 + (f_173_ * (aHa_Sub1_8217.anInt7497).toFloat() / anInt8228.toFloat()).toInt())
                    val f_174_ = aFloat8213 + (aFloat8212 * i_110_.toFloat() + aFloat8216 * i_153_.toFloat() + aFloat8224 * i_113_.toFloat())
                    i_127_ = (class109.anInt1665 + (f_174_ * (aHa_Sub1_8217.anInt7491).toFloat() / anInt8228.toFloat()).toInt())
                    val f_175_ = aFloat8226 + (aFloat8214 * i_110_.toFloat() + aFloat8221 * i_153_.toFloat() + aFloat8229 * i_113_.toFloat())
                    i_128_ = (class109.anInt1668 + (f_175_ * (aHa_Sub1_8217.anInt7497).toFloat() / anInt8228.toFloat()).toInt())
                }
            } else {
                val i_129_ = this.anIntArrayArray4584[i]!![i_105_]
                val f_130_ = aFloat8227 * i_129_.toFloat()
                if (anInt8228 == -1) {
                    f = aFloat8218 + (aFloat8233 * i_110_.toFloat() + f_130_ + aFloat8231 * i_112_.toFloat())
                    if (f <= aHa_Sub1_8217.anInt7482.toFloat()) return
                    f_118_ = aFloat8218 + (aFloat8233 * i_111_.toFloat() + f_130_ + aFloat8231 * i_112_.toFloat())
                    if (f_118_ <= aHa_Sub1_8217.anInt7482.toFloat()) return
                    f_119_ = aFloat8218 + (aFloat8233 * i_111_.toFloat() + f_130_ + aFloat8231 * i_113_.toFloat())
                    if (f_119_ <= aHa_Sub1_8217.anInt7482.toFloat()) return
                    f_120_ = aFloat8218 + (aFloat8233 * i_110_.toFloat() + f_130_ + aFloat8231 * i_113_.toFloat())
                    if (f_120_ <= aHa_Sub1_8217.anInt7482.toFloat()) return
                } else {
                    f = aFloat8218 + (aFloat8233 * i_110_.toFloat() + f_130_ + aFloat8231 * i_112_.toFloat())
                    f_118_ = aFloat8218 + (aFloat8233 * i_111_.toFloat() + f_130_ + aFloat8231 * i_112_.toFloat())
                    f_119_ = aFloat8218 + (aFloat8233 * i_111_.toFloat() + f_130_ + aFloat8231 * i_113_.toFloat())
                    f_120_ = aFloat8218 + (aFloat8233 * i_110_.toFloat() + f_130_ + aFloat8231 * i_113_.toFloat())
                }
                if (class167.aBoolean2201) {
                    var i_131_ = (f - (class167.anInt2210).toFloat()).toInt()
                    if (i_131_ > 0) {
                        i_114_ = i_131_
                        if (i_114_ > 255) i_114_ = 255
                    }
                    i_131_ = (f_118_ - (class167.anInt2210).toFloat()).toInt()
                    if (i_131_ > 0) {
                        i_115_ = i_131_
                        if (i_115_ > 255) i_115_ = 255
                    }
                    i_131_ = (f_119_ - (class167.anInt2210).toFloat()).toInt()
                    if (i_131_ > 0) {
                        i_116_ = i_131_
                        if (i_116_ > 255) i_116_ = 255
                    }
                    i_131_ = (f_120_ - (class167.anInt2210).toFloat()).toInt()
                    if (i_131_ > 0) {
                        i_117_ = i_131_
                        if (i_117_ > 255) i_117_ = 255
                    }
                }
                val f_132_ = aFloat8216 * i_129_.toFloat()
                val f_133_ = aFloat8221 * i_129_.toFloat()
                if (anInt8228 == -1) {
                    val f_134_ = (aFloat8213 + (aFloat8212 * i_110_.toFloat() + f_132_ + aFloat8224 * i_112_.toFloat()))
                    i_121_ = (class109.anInt1665 + (f_134_ * (aHa_Sub1_8217.anInt7491).toFloat() / f).toInt())
                    val f_135_ = (aFloat8226 + (aFloat8214 * i_110_.toFloat() + f_133_ + aFloat8229 * i_112_.toFloat()))
                    i_122_ = (class109.anInt1668 + (f_135_ * (aHa_Sub1_8217.anInt7497).toFloat() / f).toInt())
                    val f_136_ = (aFloat8213 + (aFloat8212 * i_111_.toFloat() + f_132_ + aFloat8224 * i_112_.toFloat()))
                    i_123_ = (class109.anInt1665 + (f_136_ * (aHa_Sub1_8217.anInt7491).toFloat() / f_118_).toInt())
                    val f_137_ = (aFloat8226 + (aFloat8214 * i_111_.toFloat() + f_133_ + aFloat8229 * i_112_.toFloat()))
                    i_124_ = (class109.anInt1668 + (f_137_ * (aHa_Sub1_8217.anInt7497).toFloat() / f_118_).toInt())
                    val f_138_ = (aFloat8213 + (aFloat8212 * i_111_.toFloat() + f_132_ + aFloat8224 * i_113_.toFloat()))
                    i_125_ = (class109.anInt1665 + (f_138_ * (aHa_Sub1_8217.anInt7491).toFloat() / f_119_).toInt())
                    val f_139_ = (aFloat8226 + (aFloat8214 * i_111_.toFloat() + f_133_ + aFloat8229 * i_113_.toFloat()))
                    i_126_ = (class109.anInt1668 + (f_139_ * (aHa_Sub1_8217.anInt7497).toFloat() / f_119_).toInt())
                    val f_140_ = (aFloat8213 + (aFloat8212 * i_110_.toFloat() + f_132_ + aFloat8224 * i_113_.toFloat()))
                    i_127_ = (class109.anInt1665 + (f_140_ * (aHa_Sub1_8217.anInt7491).toFloat() / f_120_).toInt())
                    val f_141_ = (aFloat8226 + (aFloat8214 * i_110_.toFloat() + f_133_ + aFloat8229 * i_113_.toFloat()))
                    i_128_ = (class109.anInt1668 + (f_141_ * (aHa_Sub1_8217.anInt7497).toFloat() / f_120_).toInt())
                } else {
                    val f_142_ = (aFloat8213 + (aFloat8212 * i_110_.toFloat() + f_132_ + aFloat8224 * i_112_.toFloat()))
                    i_121_ = (class109.anInt1665 + (f_142_ * (aHa_Sub1_8217.anInt7491).toFloat() / anInt8228.toFloat()).toInt())
                    val f_143_ = (aFloat8226 + (aFloat8214 * i_110_.toFloat() + f_133_ + aFloat8229 * i_112_.toFloat()))
                    i_122_ = (class109.anInt1668 + (f_143_ * (aHa_Sub1_8217.anInt7497).toFloat() / anInt8228.toFloat()).toInt())
                    val f_144_ = (aFloat8213 + (aFloat8212 * i_111_.toFloat() + f_132_ + aFloat8224 * i_112_.toFloat()))
                    i_123_ = (class109.anInt1665 + (f_144_ * (aHa_Sub1_8217.anInt7491).toFloat() / anInt8228.toFloat()).toInt())
                    val f_145_ = (aFloat8226 + (aFloat8214 * i_111_.toFloat() + f_133_ + aFloat8229 * i_112_.toFloat()))
                    i_124_ = (class109.anInt1668 + (f_145_ * (aHa_Sub1_8217.anInt7497).toFloat() / anInt8228.toFloat()).toInt())
                    val f_146_ = (aFloat8213 + (aFloat8212 * i_111_.toFloat() + f_132_ + aFloat8224 * i_113_.toFloat()))
                    i_125_ = (class109.anInt1665 + (f_146_ * (aHa_Sub1_8217.anInt7491).toFloat() / anInt8228.toFloat()).toInt())
                    val f_147_ = (aFloat8226 + (aFloat8214 * i_111_.toFloat() + f_133_ + aFloat8229 * i_113_.toFloat()))
                    i_126_ = (class109.anInt1668 + (f_147_ * (aHa_Sub1_8217.anInt7497).toFloat() / anInt8228.toFloat()).toInt())
                    val f_148_ = (aFloat8213 + (aFloat8212 * i_110_.toFloat() + f_132_ + aFloat8224 * i_113_.toFloat()))
                    i_127_ = (class109.anInt1665 + (f_148_ * (aHa_Sub1_8217.anInt7491).toFloat() / anInt8228.toFloat()).toInt())
                    val f_149_ = (aFloat8226 + (aFloat8214 * i_110_.toFloat() + f_133_ + aFloat8229 * i_113_.toFloat()))
                    i_128_ = (class109.anInt1668 + (f_149_ * (aHa_Sub1_8217.anInt7497).toFloat() / anInt8228.toFloat()).toInt())
                }
            }
            val bool_176_ = (class266.aShort3379.toInt() != -1 && method3997(aHa_Sub1_8217.aD4579!!.method3(class266.aShort3379.toInt(), -6662)!!.aByte213.toInt()))
            if (anInt8228 == -1) {
                var i_177_ = i_115_ + i_116_ + i_117_
                if (((i_125_ - i_127_) * (i_124_ - i_128_) - (i_126_ - i_128_) * (i_123_ - i_127_)) > 0) {
                    class109.aBoolean1671 = (i_125_ < 0 || i_127_ < 0 || i_123_ < 0 || i_125_ > class109.anInt1679 || i_127_ > class109.anInt1679 || i_123_ > class109.anInt1679)
                    if (i_177_ < 765) {
                        if (i_177_ > 0) {
                            if (class266.aShort3379 >= 0) {
                                var i_178_ = -16777216
                                if (bool_176_) i_178_ = -1694498816
                                class109.method1024(i_126_.toFloat(), i_128_.toFloat(), i_124_.toFloat(), i_125_.toFloat(), i_127_.toFloat(), i_123_.toFloat(), f_119_, f_120_, f_118_, 1.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, i_178_ or ((class266.anInt3380) and 0xffffff), i_178_ or ((class266.anInt3381) and 0xffffff), i_178_ or ((class266.anInt3387) and 0xffffff), class167.anInt2192, i_116_, i_117_, i_115_, class266.aShort3379.toInt())
                            } else {
                                if (bool_176_) class109.anInt1674 = 100
                                class109.method1027(
                                    i_126_.toFloat(),
                                    i_128_.toFloat(),
                                    i_124_.toFloat(),
                                    i_125_.toFloat(),
                                    i_127_.toFloat(),
                                    i_123_.toFloat(),
                                    f_119_.toInt().toFloat(),
                                    f_120_.toInt().toFloat(),
                                    f_118_.toInt().toFloat(),
                                    (Class6.method206(class266.anInt3380, (i_116_ shl 24 or class167.anInt2192), 255)),
                                    (Class6.method206(class266.anInt3381, (i_117_ shl 24 or class167.anInt2192), 255)),
                                    (Class6.method206(class266.anInt3387, (i_115_ shl 24 or class167.anInt2192), 255))
                                )
                                class109.anInt1674 = 0
                            }
                        } else if (class266.aShort3379 >= 0) {
                            var i_179_ = -16777216
                            if (bool_176_) i_179_ = -1694498816
                            class109.method1024(i_126_.toFloat(), i_128_.toFloat(), i_124_.toFloat(), i_125_.toFloat(), i_127_.toFloat(), i_123_.toFloat(), f_119_, f_120_, f_118_, 1.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, i_179_ or (class266.anInt3380 and 0xffffff), i_179_ or (class266.anInt3381 and 0xffffff), i_179_ or (class266.anInt3387 and 0xffffff), 0, 0, 0, 0, class266.aShort3379.toInt())
                        } else {
                            if (bool_176_) class109.anInt1674 = 100
                            class109.method1027(i_126_.toFloat(), i_128_.toFloat(), i_124_.toFloat(), i_125_.toFloat(), i_127_.toFloat(), i_123_.toFloat(), f_119_.toInt().toFloat(), f_120_.toInt().toFloat(), f_118_.toInt().toFloat(), class266.anInt3380, class266.anInt3381, class266.anInt3387)
                            class109.anInt1674 = 0
                        }
                    } else class109.method1018(i_126_.toFloat(), i_128_.toFloat(), i_124_.toFloat(), i_125_.toFloat(), i_127_.toFloat(), i_123_.toFloat(), f_119_.toInt().toFloat(), f_120_.toInt().toFloat(), f_118_.toInt().toFloat(), (class167.anInt2192))
                }
                i_177_ = i_114_ + i_115_ + i_117_
                if (((i_121_ - i_123_) * (i_128_ - i_124_) - (i_122_ - i_124_) * (i_127_ - i_123_)) > 0) {
                    class109.aBoolean1671 = (i_121_ < 0 || i_123_ < 0 || i_127_ < 0 || i_121_ > class109.anInt1679 || i_123_ > class109.anInt1679 || i_127_ > class109.anInt1679)
                    if (i_177_ < 765) {
                        if (bool_176_) class109.anInt1674 = -1694498816
                        if (i_177_ > 0) {
                            if (class266.aShort3379 >= 0) {
                                var i_180_ = -16777216
                                if (bool_176_) i_180_ = -1694498816
                                class109.method1024(i_122_.toFloat(), i_124_.toFloat(), i_128_.toFloat(), i_121_.toFloat(), i_123_.toFloat(), i_127_.toFloat(), f, f_118_, f_120_, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, i_180_ or ((class266.anInt3389) and 0xffffff), i_180_ or ((class266.anInt3387) and 0xffffff), i_180_ or ((class266.anInt3381) and 0xffffff), class167.anInt2192, i_114_, i_115_, i_117_, class266.aShort3379.toInt())
                            } else {
                                if (bool_176_) class109.anInt1674 = 100
                                class109.method1027(
                                    i_122_.toFloat(),
                                    i_124_.toFloat(),
                                    i_128_.toFloat(),
                                    i_121_.toFloat(),
                                    i_123_.toFloat(),
                                    i_127_.toFloat(),
                                    f.toInt().toFloat(),
                                    f_118_.toInt().toFloat(),
                                    f_120_.toInt().toFloat(),
                                    (Class6.method206(class266.anInt3389, (i_114_ shl 24 or class167.anInt2192), 255)),
                                    (Class6.method206(class266.anInt3387, (i_115_ shl 24 or class167.anInt2192), 255)),
                                    (Class6.method206(class266.anInt3381, (i_117_ shl 24 or class167.anInt2192), 255))
                                )
                                class109.anInt1674 = 0
                            }
                        } else if (class266.aShort3379 >= 0) {
                            var i_181_ = -16777216
                            if (bool_176_) i_181_ = -1694498816
                            class109.method1024(i_122_.toFloat(), i_124_.toFloat(), i_128_.toFloat(), i_121_.toFloat(), i_123_.toFloat(), i_127_.toFloat(), f, f_118_, f_120_, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, i_181_ or (class266.anInt3389 and 0xffffff), i_181_ or (class266.anInt3387 and 0xffffff), i_181_ or (class266.anInt3381 and 0xffffff), 0, 0, 0, 0, class266.aShort3379.toInt())
                        } else {
                            if (bool_176_) class109.anInt1674 = 100
                            class109.method1027(i_122_.toFloat(), i_124_.toFloat(), i_128_.toFloat(), i_121_.toFloat(), i_123_.toFloat(), i_127_.toFloat(), f.toInt().toFloat(), f_118_.toInt().toFloat(), f_120_.toInt().toFloat(), class266.anInt3389, class266.anInt3387, class266.anInt3381)
                            class109.anInt1674 = 0
                        }
                    } else class109.method1018(i_122_.toFloat(), i_124_.toFloat(), i_128_.toFloat(), i_121_.toFloat(), i_123_.toFloat(), i_127_.toFloat(), f.toInt().toFloat(), f_118_.toInt().toFloat(), f_120_.toInt().toFloat(), (class167.anInt2192))
                }
            } else {
                var i_182_ = i_115_ + i_116_ + i_117_
                if (((i_125_ - i_127_) * (i_124_ - i_128_) - (i_126_ - i_128_) * (i_123_ - i_127_)) > 0) {
                    class109.aBoolean1671 = (i_125_ < 0 || i_127_ < 0 || i_123_ < 0 || i_125_ > class109.anInt1679 || i_127_ > class109.anInt1679 || i_123_ > class109.anInt1679)
                    if (i_182_ < 765) {
                        if (bool_176_) class109.anInt1674 = -1694498816
                        if (i_182_ > 0) {
                            if (class266.aShort3379 >= 0) {
                                var i_183_ = -16777216
                                if (bool_176_) i_183_ = -1694498816
                                class109.method1024(i_126_.toFloat(), i_128_.toFloat(), i_124_.toFloat(), i_125_.toFloat(), i_127_.toFloat(), i_123_.toFloat(), f_119_, f_120_, f_118_, 1.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, i_183_ or ((class266.anInt3380) and 0xffffff), i_183_ or ((class266.anInt3381) and 0xffffff), i_183_ or ((class266.anInt3387) and 0xffffff), class167.anInt2192, i_116_, i_117_, i_115_, class266.aShort3379.toInt())
                            } else {
                                if (bool_176_) class109.anInt1674 = 100
                                class109.method1027(
                                    i_126_.toFloat(),
                                    i_128_.toFloat(),
                                    i_124_.toFloat(),
                                    i_125_.toFloat(),
                                    i_127_.toFloat(),
                                    i_123_.toFloat(),
                                    f_119_.toInt().toFloat(),
                                    f_120_.toInt().toFloat(),
                                    f_118_.toInt().toFloat(),
                                    (Class6.method206(class266.anInt3380, (i_116_ shl 24 or class167.anInt2192), 255)),
                                    (Class6.method206(class266.anInt3381, (i_117_ shl 24 or class167.anInt2192), 255)),
                                    (Class6.method206(class266.anInt3387, (i_115_ shl 24 or class167.anInt2192), 255))
                                )
                                class109.anInt1674 = 0
                            }
                        } else if (class266.aShort3379 >= 0) {
                            var i_184_ = -16777216
                            if (bool_176_) i_184_ = -1694498816
                            class109.method1024(i_126_.toFloat(), i_128_.toFloat(), i_124_.toFloat(), i_125_.toFloat(), i_127_.toFloat(), i_123_.toFloat(), f_119_, f_120_, f_118_, 1.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, i_184_ or (class266.anInt3380 and 0xffffff), i_184_ or (class266.anInt3381 and 0xffffff), i_184_ or (class266.anInt3387 and 0xffffff), 0, 0, 0, 0, class266.aShort3379.toInt())
                        } else {
                            if (bool_176_) class109.anInt1674 = 100
                            class109.method1027(i_126_.toFloat(), i_128_.toFloat(), i_124_.toFloat(), i_125_.toFloat(), i_127_.toFloat(), i_123_.toFloat(), f_119_.toInt().toFloat(), f_120_.toInt().toFloat(), f_118_.toInt().toFloat(), class266.anInt3380, class266.anInt3381, class266.anInt3387)
                            class109.anInt1674 = 0
                        }
                    } else class109.method1018(i_126_.toFloat(), i_128_.toFloat(), i_124_.toFloat(), i_125_.toFloat(), i_127_.toFloat(), i_123_.toFloat(), f_119_.toInt().toFloat(), f_120_.toInt().toFloat(), f_118_.toInt().toFloat(), (class167.anInt2192))
                }
                i_182_ = i_114_ + i_115_ + i_117_
                if (((i_121_ - i_123_) * (i_128_ - i_124_) - (i_122_ - i_124_) * (i_127_ - i_123_)) > 0) {
                    class109.aBoolean1671 = (i_121_ < 0 || i_123_ < 0 || i_127_ < 0 || i_121_ > class109.anInt1679 || i_123_ > class109.anInt1679 || i_127_ > class109.anInt1679)
                    if (i_182_ < 765) {
                        if (bool_176_) class109.anInt1674 = -1694498816
                        if (i_182_ > 0) {
                            if (class266.aShort3379 >= 0) {
                                var i_185_ = -16777216
                                if (bool_176_) i_185_ = -1694498816
                                class109.method1024(i_122_.toFloat(), i_124_.toFloat(), i_128_.toFloat(), i_121_.toFloat(), i_123_.toFloat(), i_127_.toFloat(), f, f_118_, f_120_, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, i_185_ or ((class266.anInt3389) and 0xffffff), i_185_ or ((class266.anInt3387) and 0xffffff), i_185_ or ((class266.anInt3381) and 0xffffff), class167.anInt2192, i_114_, i_115_, i_117_, class266.aShort3379.toInt())
                            } else {
                                if (bool_176_) class109.anInt1674 = 100
                                class109.method1027(
                                    i_122_.toFloat(),
                                    i_124_.toFloat(),
                                    i_128_.toFloat(),
                                    i_121_.toFloat(),
                                    i_123_.toFloat(),
                                    i_127_.toFloat(),
                                    f.toInt().toFloat(),
                                    f_118_.toInt().toFloat(),
                                    f_120_.toInt().toFloat(),
                                    (Class6.method206(class266.anInt3389, (i_114_ shl 24 or class167.anInt2192), 255)),
                                    (Class6.method206(class266.anInt3387, (i_115_ shl 24 or class167.anInt2192), 255)),
                                    (Class6.method206(class266.anInt3381, (i_117_ shl 24 or class167.anInt2192), 255))
                                )
                                class109.anInt1674 = 0
                            }
                        } else if (class266.aShort3379 >= 0) {
                            var i_186_ = -16777216
                            if (bool_176_) i_186_ = -1694498816
                            class109.method1024(i_122_.toFloat(), i_124_.toFloat(), i_128_.toFloat(), i_121_.toFloat(), i_123_.toFloat(), i_127_.toFloat(), f, f_118_, f_120_, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, i_186_ or (class266.anInt3389 and 0xffffff), i_186_ or (class266.anInt3387 and 0xffffff), i_186_ or (class266.anInt3381 and 0xffffff), 0, 0, 0, 0, class266.aShort3379.toInt())
                        } else {
                            if (bool_176_) class109.anInt1674 = 100
                            class109.method1027(i_122_.toFloat(), i_124_.toFloat(), i_128_.toFloat(), i_121_.toFloat(), i_123_.toFloat(), i_127_.toFloat(), f.toInt().toFloat(), f_118_.toInt().toFloat(), f_120_.toInt().toFloat(), class266.anInt3389, class266.anInt3387, class266.anInt3381)
                            class109.anInt1674 = 0
                        }
                    } else class109.method1018(i_122_.toFloat(), i_124_.toFloat(), i_128_.toFloat(), i_121_.toFloat(), i_123_.toFloat(), i_127_.toFloat(), f.toInt().toFloat(), f_118_.toInt().toFloat(), f_120_.toInt().toFloat(), (class167.anInt2192))
                }
            }
        }
    }

    override fun method3983(i: Int, i_248_: Int, i_249_: Int, bools: Array<BooleanArray?>?, bool: Boolean, i_250_: Int) {
        val class101_sub1 = aHa_Sub1_8217.aClass101_Sub1_7492!!
        anInt8228 = -1
        aFloat8212 = class101_sub1.aFloat5672
        aFloat8216 = class101_sub1.aFloat5673
        aFloat8224 = class101_sub1.aFloat5669
        aFloat8213 = class101_sub1.aFloat5686
        aFloat8214 = class101_sub1.aFloat5655
        aFloat8221 = class101_sub1.aFloat5678
        aFloat8229 = class101_sub1.aFloat5666
        aFloat8226 = class101_sub1.aFloat5685
        aFloat8233 = class101_sub1.aFloat5662
        aFloat8227 = class101_sub1.aFloat5680
        aFloat8231 = class101_sub1.aFloat5664
        aFloat8218 = class101_sub1.aFloat5681
        for (i_251_ in 0..<i_249_ + i_249_) {
            for (i_252_ in 0..<i_249_ + i_249_) {
                if (bools!![i_251_]!![i_252_]) {
                    val i_253_ = i - i_249_ + i_251_
                    val i_254_ = i_248_ - i_249_ + i_252_
                    if (i_253_ >= 0 && i_253_ < this.anInt4587 && i_254_ >= 0 && i_254_ < this.anInt4590) method3992(i_253_, i_254_, i_250_)
                }
            }
        }
    }

    private fun method3992(i: Int, i_255_: Int, i_256_: Int) {
        val class167 = aHa_Sub1_8217.method3724(Thread.currentThread())
        class167!!.aClass109_2220!!.anInt1674 = 0
        if (aClass266ArrayArray8230 != null) method3990(i, i_255_, class167.aBoolean2195, class167, class167.aClass109_2220!!, class167.anIntArray2212!!, class167.anIntArray2228!!, class167.anIntArray2217!!, class167.anIntArray2232!!, i_256_)
        else if (aClass102ArrayArray8215 != null) method3994(i, i_255_, class167.aClass109_2220!!, class167.anIntArray2212!!, class167.anIntArray2228!!, class167.anIntArray2217!!, class167.anIntArray2232, i_256_)
        else if (aClass198ArrayArray8219 != null) method3995(i, i_255_, class167.aBoolean2195, class167, class167.aClass109_2220!!, class167.anIntArray2212!!, class167.anIntArray2228!!, class167.anIntArray2217!!, class167.anIntArray2232!!, i_256_)
    }

    override fun wa(var_r: r?, i: Int, i_257_: Int, i_258_: Int, i_259_: Int, bool: Boolean) {
        /* empty */
    }

    private fun method3993(i: Int, i_260_: Int, i_261_: Int, i_262_: Int, i_263_: Int, i_264_: Int, i_265_: Int, bools: Array<BooleanArray?>, class167: Class167, class109: Class109, `is`: IntArray, is_266_: IntArray) {
        val i_267_ = (i_265_ - i_263_) * i_261_ / 256
        val i_268_ = i_261_ shr 8
        val bool = class167.aBoolean2202
        aHa_Sub1_8217.C(false)
        class109.aBoolean1669 = false
        class109.aBoolean1667 = false
        var i_269_ = i
        var i_270_ = i_260_ + i_267_
        for (i_271_ in i_262_..<i_264_) {
            for (i_272_ in i_263_..<i_265_) {
                if (bools[i_271_ - i_262_]!![i_272_ - i_263_]) {
                    if (aClass266ArrayArray8230 != null) {
                        if (aClass266ArrayArray8230!![i_271_]!![i_272_] != null) {
                            val class266 = aClass266ArrayArray8230!![i_271_]!![i_272_]!!
                            if (class266.aShort3379.toInt() != -1 && (class266.aByte3386.toInt() and 0x2) == 0 && class266.anInt3388 == 0) {
                                val i_273_ = aHa_Sub1_8217.method3722(class266.aShort3379.toInt())
                                class109.method1022((i_270_ - i_268_).toFloat(), (i_270_ - i_268_).toFloat(), i_270_.toFloat(), (i_269_ + i_268_).toFloat(), i_269_.toFloat(), (i_269_ + i_268_).toFloat(), 100.0f, 100.0f, 100.0f, Class291.method2198(0, (class266.anInt3380), i_273_).toFloat(), Class291.method2198(0, (class266.anInt3381), i_273_).toFloat(), Class291.method2198(0, (class266.anInt3387), i_273_).toFloat())
                                class109.method1022(i_270_.toFloat(), i_270_.toFloat(), (i_270_ - i_268_).toFloat(), i_269_.toFloat(), (i_269_ + i_268_).toFloat(), i_269_.toFloat(), 100.0f, 100.0f, 100.0f, Class291.method2198(0, (class266.anInt3389), i_273_).toFloat(), Class291.method2198(0, (class266.anInt3387), i_273_).toFloat(), Class291.method2198(0, (class266.anInt3381), i_273_).toFloat())
                            } else if (class266.anInt3388 == 0) {
                                class109.method1027((i_270_ - i_268_).toFloat(), (i_270_ - i_268_).toFloat(), i_270_.toFloat(), (i_269_ + i_268_).toFloat(), i_269_.toFloat(), (i_269_ + i_268_).toFloat(), 100.0f, 100.0f, 100.0f, class266.anInt3380, class266.anInt3381, class266.anInt3387)
                                class109.method1027(i_270_.toFloat(), i_270_.toFloat(), (i_270_ - i_268_).toFloat(), i_269_.toFloat(), (i_269_ + i_268_).toFloat(), i_269_.toFloat(), 100.0f, 100.0f, 100.0f, class266.anInt3389, class266.anInt3387, class266.anInt3381)
                            } else {
                                val i_274_ = class266.anInt3388
                                class109.method1027((i_270_ - i_268_).toFloat(), (i_270_ - i_268_).toFloat(), i_270_.toFloat(), (i_269_ + i_268_).toFloat(), i_269_.toFloat(), (i_269_ + i_268_).toFloat(), 100.0f, 100.0f, 100.0f, Class6.method206(i_274_, (class266.anInt3380) and 0xffffff.inv(), 255), Class6.method206(i_274_, (class266.anInt3381) and 0xffffff.inv(), 255), Class6.method206(i_274_, (class266.anInt3387) and 0xffffff.inv(), 255))
                                class109.method1027(i_270_.toFloat(), i_270_.toFloat(), (i_270_ - i_268_).toFloat(), i_269_.toFloat(), (i_269_ + i_268_).toFloat(), i_269_.toFloat(), 100.0f, 100.0f, 100.0f, Class6.method206(i_274_, (class266.anInt3389) and 0xffffff.inv(), 255), Class6.method206(i_274_, (class266.anInt3387) and 0xffffff.inv(), 255), Class6.method206(i_274_, (class266.anInt3381) and 0xffffff.inv(), 255))
                            }
                        } else if (aClass145ArrayArray8225!![i_271_]!![i_272_] != null) {
                            val class145 = aClass145ArrayArray8225!![i_271_]!![i_272_]!!
                            for (i_275_ in 0..<class145.aShort2003) {
                                `is`[i_275_] = i_269_ + ((class145.aShortArray2009!![i_275_]) * i_268_ / this.anInt4592)
                                is_266_[i_275_] = i_270_ - ((class145.aShortArray2002!![i_275_]) * i_268_ / this.anInt4592)
                            }
                            for (i_276_ in 0..<class145.aShort2010) {
                                val i_277_ = i_276_ * 3
                                val i_278_ = i_277_ + 1
                                val i_279_ = i_278_ + 1
                                val i_280_ = `is`[i_277_]
                                val i_281_ = `is`[i_278_]
                                val i_282_ = `is`[i_279_]
                                val i_283_ = is_266_[i_277_]
                                val i_284_ = is_266_[i_278_]
                                val i_285_ = is_266_[i_279_]
                                if ((class145.anIntArray2011 != null) && (class145.anIntArray2011!![i_276_]) != 0 && ((class145.aShortArray2008 == null) || ((class145.aShortArray2008) != null && ((class145.aShortArray2008!![i_276_]).toInt() == -1)))) {
                                    val i_286_ = (class145.anIntArray2011!![i_276_])
                                    class109.method1027(
                                        i_283_.toFloat(),
                                        i_284_.toFloat(),
                                        i_285_.toFloat(),
                                        i_280_.toFloat(),
                                        i_281_.toFloat(),
                                        i_282_.toFloat(),
                                        100.0f,
                                        100.0f,
                                        100.0f,
                                        Class6.method206(i_286_, (-16777216 - ((class145.anIntArray2001!![i_277_]) and 0xffffff.inv())), 255),
                                        Class6.method206(i_286_, (-16777216 - ((class145.anIntArray2001!![i_278_]) and 0xffffff.inv())), 255),
                                        Class6.method206(i_286_, (-16777216 - ((class145.anIntArray2001!![i_279_]) and 0xffffff.inv())), 255)
                                    )
                                } else if ((class145.aShortArray2008) != null && ((class145.aShortArray2008!![i_276_]).toInt() != -1)) {
                                    val i_287_ = (aHa_Sub1_8217.method3722(class145.aShortArray2008!![i_276_].toInt()))
                                    class109.method1022(i_283_.toFloat(), i_284_.toFloat(), i_285_.toFloat(), i_280_.toFloat(), i_281_.toFloat(), i_282_.toFloat(), 100.0f, 100.0f, 100.0f, i_287_.toFloat(), i_287_.toFloat(), i_287_.toFloat())
                                } else class109.method1027(i_283_.toFloat(), i_284_.toFloat(), i_285_.toFloat(), i_280_.toFloat(), i_281_.toFloat(), i_282_.toFloat(), 100.0f, 100.0f, 100.0f, (class145.anIntArray2001!![i_277_]), (class145.anIntArray2001!![i_278_]), (class145.anIntArray2001!![i_279_]))
                            }
                        }
                    } else if (aClass198ArrayArray8219!![i_271_]!![i_272_] != null) {
                        val class198 = aClass198ArrayArray8219!![i_271_]!![i_272_]!!
                        for (i_288_ in 0..<class198.aShort2620) {
                            `is`[i_288_] = i_269_ + ((class198.aShortArray2622!![i_288_]) * i_268_ / this.anInt4592)
                            is_266_[i_288_] = i_270_ - ((class198.aShortArray2613!![i_288_]) * i_268_ / this.anInt4592)
                        }
                        for (i_289_ in 0..<class198.aShort2619) {
                            val i_290_ = i_289_ * 3
                            val i_291_ = i_290_ + 1
                            val i_292_ = i_291_ + 1
                            val i_293_ = `is`[i_290_]
                            val i_294_ = `is`[i_291_]
                            val i_295_ = `is`[i_292_]
                            val i_296_ = is_266_[i_290_]
                            val i_297_ = is_266_[i_291_]
                            val i_298_ = is_266_[i_292_]
                            if (class198.anIntArray2615 != null && (class198.anIntArray2615!![i_289_]) != 0) {
                                val i_299_ = (class198.anIntArray2615!![i_289_])
                                class109.method1027(i_296_.toFloat(), i_297_.toFloat(), i_298_.toFloat(), i_293_.toFloat(), i_294_.toFloat(), i_295_.toFloat(), 100.0f, 100.0f, 100.0f, i_299_, i_299_, i_299_)
                            } else class109.method1027(i_296_.toFloat(), i_297_.toFloat(), i_298_.toFloat(), i_293_.toFloat(), i_294_.toFloat(), i_295_.toFloat(), 100.0f, 100.0f, 100.0f, (class198.anIntArray2623!![i_290_]), (class198.anIntArray2623!![i_291_]), (class198.anIntArray2623!![i_292_]))
                        }
                    }
                }
                i_270_ -= i_268_
            }
            i_270_ = i_260_ + i_267_
            i_269_ += i_268_
        }
        class109.aBoolean1669 = true
        aHa_Sub1_8217.C(bool)
    }

    private fun method3994(i: Int, i_300_: Int, class109: Class109, `is`: IntArray, is_301_: IntArray, is_302_: IntArray, is_303_: IntArray?, i_304_: Int) {
        val class102 = aClass102ArrayArray8215!![i]!![i_300_]
        if (class102 == null) {
            val class236 = aClass236ArrayArray8222!![i]!![i_300_]
            if (class236 != null) {
                if (i_304_ != 0) {
                    if ((class236.aByte3100.toInt() and 0x4) != 0) {
                        if ((i_304_ and 0x1) != 0) return
                    } else if ((i_304_ and 0x2) != 0) return
                }
                if (anInt8228 == -1) {
                    for (i_360_ in 0..<class236.aShort3089) {
                        val i_361_ = (class236.aShortArray3096!![i_360_] + (i shl this.anInt4588))
                        val i_362_ = class236.aShortArray3097!![i_360_]
                        val i_363_ = (class236.aShortArray3094!![i_360_] + (i_300_ shl this.anInt4588))
                        val f = aFloat8218 + (aFloat8233 * i_361_.toFloat() + aFloat8227 * i_362_.toFloat() + aFloat8231 * i_363_.toFloat())
                        if (f <= aHa_Sub1_8217.anInt7482.toFloat()) return
                        val f_364_ = aFloat8213 + (aFloat8212 * i_361_.toFloat() + aFloat8216 * i_362_.toFloat() + aFloat8224 * i_363_.toFloat())
                        val f_365_ = aFloat8226 + (aFloat8214 * i_361_.toFloat() + aFloat8221 * i_362_.toFloat() + aFloat8229 * i_363_.toFloat())
                        `is`[i_360_] = (class109.anInt1665 + (f_364_ * (aHa_Sub1_8217.anInt7491).toFloat() / f).toInt())
                        is_301_[i_360_] = (class109.anInt1668 + (f_365_ * (aHa_Sub1_8217.anInt7497).toFloat() / f).toInt())
                        is_302_[i_360_] = f.toInt()
                    }
                } else {
                    for (i_366_ in 0..<class236.aShort3089) {
                        val i_367_ = (class236.aShortArray3096!![i_366_] + (i shl this.anInt4588))
                        val i_368_ = class236.aShortArray3097!![i_366_]
                        val i_369_ = (class236.aShortArray3094!![i_366_] + (i_300_ shl this.anInt4588))
                        val f = aFloat8218 + (aFloat8233 * i_367_.toFloat() + aFloat8227 * i_368_.toFloat() + aFloat8231 * i_369_.toFloat())
                        val f_370_ = aFloat8213 + (aFloat8212 * i_367_.toFloat() + aFloat8216 * i_368_.toFloat() + aFloat8224 * i_369_.toFloat())
                        val f_371_ = aFloat8226 + (aFloat8214 * i_367_.toFloat() + aFloat8221 * i_368_.toFloat() + aFloat8229 * i_369_.toFloat())
                        `is`[i_366_] = (class109.anInt1665 + (f_370_ * (aHa_Sub1_8217.anInt7491).toFloat() / anInt8228.toFloat()).toInt())
                        is_301_[i_366_] = (class109.anInt1668 + (f_371_ * (aHa_Sub1_8217.anInt7497).toFloat() / anInt8228.toFloat()).toInt())
                        is_302_[i_366_] = f.toInt()
                    }
                }
                if (class236.aShortArray3095 == null) {
                    for (i_396_ in 0..<class236.aShort3099) {
                        val i_397_ = class236.aShortArray3091!![i_396_]
                        val i_398_ = class236.aShortArray3090!![i_396_]
                        val i_399_ = class236.aShortArray3101!![i_396_]
                        val i_400_ = `is`[i_397_.toInt()]
                        val i_401_ = `is`[i_398_.toInt()]
                        val i_402_ = `is`[i_399_.toInt()]
                        val i_403_ = is_301_[i_397_.toInt()]
                        val i_404_ = is_301_[i_398_.toInt()]
                        val i_405_ = is_301_[i_399_.toInt()]
                        if (((i_400_ - i_401_) * (i_405_ - i_404_) - (i_403_ - i_404_) * (i_402_ - i_401_)) > 0) {
                            val i_406_ = class236.anIntArray3093!![i_396_]
                            if (i_406_ != -1) {
                                class109.aBoolean1671 = (i_400_ < 0 || i_401_ < 0 || i_402_ < 0 || (i_400_ > class109.anInt1679) || (i_401_ > class109.anInt1679) || (i_402_ > class109.anInt1679))
                                class109.method1022(
                                    i_403_.toFloat(),
                                    i_404_.toFloat(),
                                    i_405_.toFloat(),
                                    i_400_.toFloat(),
                                    i_401_.toFloat(),
                                    i_402_.toFloat(),
                                    is_302_[i_397_.toInt()].toFloat(),
                                    is_302_[i_398_.toInt()].toFloat(),
                                    is_302_[i_399_.toInt()].toFloat(),
                                    (Class291.method2198(0, (class236.aShortArray3088!![i_397_.toInt()]).toInt(), i_406_)).toFloat(),
                                    (Class291.method2198(0, (class236.aShortArray3088!![i_398_.toInt()]).toInt(), i_406_)).toFloat(),
                                    (Class291.method2198(0, (class236.aShortArray3088!![i_399_.toInt()]).toInt(), i_406_)).toFloat()
                                )
                            }
                        }
                    }
                } else if (anInt8228 == -1) {
                    for (i_372_ in 0..<class236.aShort3099) {
                        val i_373_ = (class236.aShortArray3091!![i_372_])
                        val i_374_ = (class236.aShortArray3090!![i_372_])
                        val i_375_ = (class236.aShortArray3101!![i_372_])
                        val i_376_ = `is`[i_373_.toInt()]
                        val i_377_ = `is`[i_374_.toInt()]
                        val i_378_ = `is`[i_375_.toInt()]
                        val i_379_ = is_301_[i_373_.toInt()]
                        val i_380_ = is_301_[i_374_.toInt()]
                        val i_381_ = is_301_[i_375_.toInt()]
                        if (((i_376_ - i_377_) * (i_381_ - i_380_) - (i_379_ - i_380_) * (i_378_ - i_377_)) > 0) {
                            class109.aBoolean1671 = (i_376_ < 0 || i_377_ < 0 || i_378_ < 0 || (i_376_ > class109.anInt1679) || (i_377_ > class109.anInt1679) || (i_378_ > class109.anInt1679))
                            val i_382_ = (class236.aShortArray3095!![i_372_])
                            if (i_382_.toInt() == -1) {
                                val i_383_ = (class236.anIntArray3093!![i_372_])
                                if (i_383_ != -1) class109.method1022(
                                    i_379_.toFloat(),
                                    i_380_.toFloat(),
                                    i_381_.toFloat(),
                                    i_376_.toFloat(),
                                    i_377_.toFloat(),
                                    i_378_.toFloat(),
                                    is_302_[i_373_.toInt()].toFloat(),
                                    is_302_[i_374_.toInt()].toFloat(),
                                    is_302_[i_375_.toInt()].toFloat(),
                                    (Class291.method2198(0, (class236.aShortArray3088!![i_373_.toInt()]).toInt(), i_383_)).toFloat(),
                                    (Class291.method2198(0, (class236.aShortArray3088!![i_374_.toInt()]).toInt(), i_383_)).toFloat(),
                                    (Class291.method2198(0, (class236.aShortArray3088!![i_375_.toInt()]).toInt(), i_383_)).toFloat()
                                )
                            } else class109.method1024(
                                i_379_.toFloat(),
                                i_380_.toFloat(),
                                i_381_.toFloat(),
                                i_376_.toFloat(),
                                i_377_.toFloat(),
                                i_378_.toFloat(),
                                is_302_[i_373_.toInt()].toFloat(),
                                is_302_[i_374_.toInt()].toFloat(),
                                is_302_[i_375_.toInt()].toFloat(),
                                ((class236.aShortArray3096!![i_373_.toInt()]).toFloat() / this.anInt4592.toFloat()),
                                ((class236.aShortArray3096!![i_374_.toInt()]).toFloat() / this.anInt4592.toFloat()),
                                ((class236.aShortArray3096!![i_375_.toInt()]).toFloat() / this.anInt4592.toFloat()),
                                ((class236.aShortArray3094!![i_373_.toInt()]).toFloat() / this.anInt4592.toFloat()),
                                ((class236.aShortArray3094!![i_374_.toInt()]).toFloat() / this.anInt4592.toFloat()),
                                ((class236.aShortArray3094!![i_375_.toInt()]).toFloat() / this.anInt4592.toFloat()),
                                0xffffff.inv() or ((Class126.anIntArray4983!![(class236.aShortArray3088!![i_373_.toInt()]).toInt() and 0xffff]) and 0xffffff),
                                0xffffff.inv() or ((Class126.anIntArray4983!![(class236.aShortArray3088!![i_374_.toInt()]).toInt() and 0xffff]) and 0xffffff),
                                0xffffff.inv() or ((Class126.anIntArray4983!![(class236.aShortArray3088!![i_375_.toInt()]).toInt() and 0xffff]) and 0xffffff),
                                0,
                                0,
                                0,
                                0,
                                i_382_.toInt()
                            )
                        }
                    }
                } else {
                    for (i_384_ in 0..<class236.aShort3099) {
                        val i_385_ = (class236.aShortArray3091!![i_384_])
                        val i_386_ = (class236.aShortArray3090!![i_384_])
                        val i_387_ = (class236.aShortArray3101!![i_384_])
                        val i_388_ = `is`[i_385_.toInt()]
                        val i_389_ = `is`[i_386_.toInt()]
                        val i_390_ = `is`[i_387_.toInt()]
                        val i_391_ = is_301_[i_385_.toInt()]
                        val i_392_ = is_301_[i_386_.toInt()]
                        val i_393_ = is_301_[i_387_.toInt()]
                        if (((i_388_ - i_389_) * (i_393_ - i_392_) - (i_391_ - i_392_) * (i_390_ - i_389_)) > 0) {
                            class109.aBoolean1671 = (i_388_ < 0 || i_389_ < 0 || i_390_ < 0 || (i_388_ > class109.anInt1679) || (i_389_ > class109.anInt1679) || (i_390_ > class109.anInt1679))
                            val i_394_ = (class236.aShortArray3095!![i_384_])
                            if (i_394_.toInt() == -1) {
                                val i_395_ = (class236.anIntArray3093!![i_384_])
                                if (i_395_ != -1) class109.method1022(
                                    i_391_.toFloat(),
                                    i_392_.toFloat(),
                                    i_393_.toFloat(),
                                    i_388_.toFloat(),
                                    i_389_.toFloat(),
                                    i_390_.toFloat(),
                                    is_302_[i_385_.toInt()].toFloat(),
                                    is_302_[i_386_.toInt()].toFloat(),
                                    is_302_[i_387_.toInt()].toFloat(),
                                    (Class291.method2198(0, (class236.aShortArray3088!![i_385_.toInt()]).toInt(), i_395_)).toFloat(),
                                    (Class291.method2198(0, (class236.aShortArray3088!![i_386_.toInt()]).toInt(), i_395_)).toFloat(),
                                    (Class291.method2198(0, (class236.aShortArray3088!![i_387_.toInt()]).toInt(), i_395_)).toFloat()
                                )
                            } else class109.method1024(
                                i_391_.toFloat(),
                                i_392_.toFloat(),
                                i_393_.toFloat(),
                                i_388_.toFloat(),
                                i_389_.toFloat(),
                                i_390_.toFloat(),
                                is_302_[i_385_.toInt()].toFloat(),
                                is_302_[i_386_.toInt()].toFloat(),
                                is_302_[i_387_.toInt()].toFloat(),
                                ((class236.aShortArray3096!![i_385_.toInt()]).toFloat() / this.anInt4592.toFloat()),
                                ((class236.aShortArray3096!![i_386_.toInt()]).toFloat() / this.anInt4592.toFloat()),
                                ((class236.aShortArray3096!![i_387_.toInt()]).toFloat() / this.anInt4592.toFloat()),
                                ((class236.aShortArray3094!![i_385_.toInt()]).toFloat() / this.anInt4592.toFloat()),
                                ((class236.aShortArray3094!![i_386_.toInt()]).toFloat() / this.anInt4592.toFloat()),
                                ((class236.aShortArray3094!![i_387_.toInt()]).toFloat() / this.anInt4592.toFloat()),
                                0xffffff.inv() or ((Class126.anIntArray4983!![(class236.aShortArray3088!![i_385_.toInt()]).toInt() and 0xffff]) and 0xffffff),
                                0xffffff.inv() or ((Class126.anIntArray4983!![(class236.aShortArray3088!![i_386_.toInt()]).toInt() and 0xffff]) and 0xffffff),
                                0xffffff.inv() or ((Class126.anIntArray4983!![(class236.aShortArray3088!![i_387_.toInt()]).toInt() and 0xffff]) and 0xffffff),
                                0,
                                0,
                                0,
                                0,
                                i_394_.toInt()
                            )
                        }
                    }
                }
            }
        } else if ((class102.aByte1606.toInt() and 0x2) == 0) {
            if (i_304_ != 0) {
                if ((class102.aByte1606.toInt() and 0x4) != 0) {
                    if ((i_304_ and 0x1) != 0) return
                } else if ((i_304_ and 0x2) != 0) return
            }
            val i_305_ = i * this.anInt4592
            val i_306_ = i_305_ + this.anInt4592
            val i_307_ = i_300_ * this.anInt4592
            val i_308_ = i_307_ + this.anInt4592
            val f: Float
            val f_309_: Float
            val f_310_: Float
            val f_311_: Float
            val i_312_: Int
            val i_313_: Int
            val i_314_: Int
            val i_315_: Int
            val i_316_: Int
            val i_317_: Int
            val i_318_: Int
            val i_319_: Int
            if ((class102.aByte1606.toInt() and 0x1) == 0) {
                val i_340_ = this.anIntArrayArray4584[i]!![i_300_]
                val i_341_ = this.anIntArrayArray4584[i + 1]!![i_300_]
                val i_342_ = this.anIntArrayArray4584[i + 1]!![i_300_ + 1]
                val i_343_ = this.anIntArrayArray4584[i]!![i_300_ + 1]
                if (anInt8228 == -1) {
                    f = aFloat8218 + (aFloat8233 * i_305_.toFloat() + aFloat8227 * i_340_.toFloat() + aFloat8231 * i_307_.toFloat())
                    if (f <= aHa_Sub1_8217.anInt7482.toFloat()) return
                    f_309_ = aFloat8218 + (aFloat8233 * i_306_.toFloat() + aFloat8227 * i_341_.toFloat() + aFloat8231 * i_307_.toFloat())
                    if (f_309_ <= aHa_Sub1_8217.anInt7482.toFloat()) return
                    f_310_ = aFloat8218 + (aFloat8233 * i_306_.toFloat() + aFloat8227 * i_342_.toFloat() + aFloat8231 * i_308_.toFloat())
                    if (f_310_ <= aHa_Sub1_8217.anInt7482.toFloat()) return
                    f_311_ = aFloat8218 + (aFloat8233 * i_305_.toFloat() + aFloat8227 * i_343_.toFloat() + aFloat8231 * i_308_.toFloat())
                    if (f_311_ <= aHa_Sub1_8217.anInt7482.toFloat()) return
                    val f_344_ = aFloat8213 + (aFloat8212 * i_305_.toFloat() + aFloat8216 * i_340_.toFloat() + aFloat8224 * i_307_.toFloat())
                    i_312_ = (class109.anInt1665 + (f_344_ * (aHa_Sub1_8217.anInt7491).toFloat() / f).toInt())
                    val f_345_ = aFloat8226 + (aFloat8214 * i_305_.toFloat() + aFloat8221 * i_340_.toFloat() + aFloat8229 * i_307_.toFloat())
                    i_313_ = (class109.anInt1668 + (f_345_ * (aHa_Sub1_8217.anInt7497).toFloat() / f).toInt())
                    val f_346_ = aFloat8213 + (aFloat8212 * i_306_.toFloat() + aFloat8216 * i_341_.toFloat() + aFloat8224 * i_307_.toFloat())
                    i_314_ = (class109.anInt1665 + (f_346_ * (aHa_Sub1_8217.anInt7491).toFloat() / f_309_).toInt())
                    val f_347_ = aFloat8226 + (aFloat8214 * i_306_.toFloat() + aFloat8221 * i_341_.toFloat() + aFloat8229 * i_307_.toFloat())
                    i_315_ = (class109.anInt1668 + (f_347_ * (aHa_Sub1_8217.anInt7497).toFloat() / f_309_).toInt())
                    val f_348_ = aFloat8213 + (aFloat8212 * i_306_.toFloat() + aFloat8216 * i_342_.toFloat() + aFloat8224 * i_308_.toFloat())
                    i_316_ = (class109.anInt1665 + (f_348_ * (aHa_Sub1_8217.anInt7491).toFloat() / f_310_).toInt())
                    val f_349_ = aFloat8226 + (aFloat8214 * i_306_.toFloat() + aFloat8221 * i_342_.toFloat() + aFloat8229 * i_308_.toFloat())
                    i_317_ = (class109.anInt1668 + (f_349_ * (aHa_Sub1_8217.anInt7497).toFloat() / f_310_).toInt())
                    val f_350_ = aFloat8213 + (aFloat8212 * i_305_.toFloat() + aFloat8216 * i_343_.toFloat() + aFloat8224 * i_308_.toFloat())
                    i_318_ = (class109.anInt1665 + (f_350_ * (aHa_Sub1_8217.anInt7491).toFloat() / f_311_).toInt())
                    val f_351_ = aFloat8226 + (aFloat8214 * i_305_.toFloat() + aFloat8221 * i_343_.toFloat() + aFloat8229 * i_308_.toFloat())
                    i_319_ = (class109.anInt1668 + (f_351_ * (aHa_Sub1_8217.anInt7497).toFloat() / f_311_).toInt())
                } else {
                    f = aFloat8218 + (aFloat8233 * i_305_.toFloat() + aFloat8227 * i_340_.toFloat() + aFloat8231 * i_307_.toFloat())
                    f_309_ = aFloat8218 + (aFloat8233 * i_306_.toFloat() + aFloat8227 * i_341_.toFloat() + aFloat8231 * i_307_.toFloat())
                    f_310_ = aFloat8218 + (aFloat8233 * i_306_.toFloat() + aFloat8227 * i_342_.toFloat() + aFloat8231 * i_308_.toFloat())
                    f_311_ = aFloat8218 + (aFloat8233 * i_305_.toFloat() + aFloat8227 * i_343_.toFloat() + aFloat8231 * i_308_.toFloat())
                    val f_352_ = aFloat8213 + (aFloat8212 * i_305_.toFloat() + aFloat8216 * i_340_.toFloat() + aFloat8224 * i_307_.toFloat())
                    i_312_ = (class109.anInt1665 + (f_352_ * (aHa_Sub1_8217.anInt7491).toFloat() / anInt8228.toFloat()).toInt())
                    val f_353_ = aFloat8226 + (aFloat8214 * i_305_.toFloat() + aFloat8221 * i_340_.toFloat() + aFloat8229 * i_307_.toFloat())
                    i_313_ = (class109.anInt1668 + (f_353_ * (aHa_Sub1_8217.anInt7497).toFloat() / anInt8228.toFloat()).toInt())
                    val f_354_ = aFloat8213 + (aFloat8212 * i_306_.toFloat() + aFloat8216 * i_341_.toFloat() + aFloat8224 * i_307_.toFloat())
                    i_314_ = (class109.anInt1665 + (f_354_ * (aHa_Sub1_8217.anInt7491).toFloat() / anInt8228.toFloat()).toInt())
                    val f_355_ = aFloat8226 + (aFloat8214 * i_306_.toFloat() + aFloat8221 * i_341_.toFloat() + aFloat8229 * i_307_.toFloat())
                    i_315_ = (class109.anInt1668 + (f_355_ * (aHa_Sub1_8217.anInt7497).toFloat() / anInt8228.toFloat()).toInt())
                    val f_356_ = aFloat8213 + (aFloat8212 * i_306_.toFloat() + aFloat8216 * i_342_.toFloat() + aFloat8224 * i_308_.toFloat())
                    i_316_ = (class109.anInt1665 + (f_356_ * (aHa_Sub1_8217.anInt7491).toFloat() / anInt8228.toFloat()).toInt())
                    val f_357_ = aFloat8226 + (aFloat8214 * i_306_.toFloat() + aFloat8221 * i_342_.toFloat() + aFloat8229 * i_308_.toFloat())
                    i_317_ = (class109.anInt1668 + (f_357_ * (aHa_Sub1_8217.anInt7497).toFloat() / anInt8228.toFloat()).toInt())
                    val f_358_ = aFloat8213 + (aFloat8212 * i_305_.toFloat() + aFloat8216 * i_343_.toFloat() + aFloat8224 * i_308_.toFloat())
                    i_318_ = (class109.anInt1665 + (f_358_ * (aHa_Sub1_8217.anInt7491).toFloat() / anInt8228.toFloat()).toInt())
                    val f_359_ = aFloat8226 + (aFloat8214 * i_305_.toFloat() + aFloat8221 * i_343_.toFloat() + aFloat8229 * i_308_.toFloat())
                    i_319_ = (class109.anInt1668 + (f_359_ * (aHa_Sub1_8217.anInt7497).toFloat() / anInt8228.toFloat()).toInt())
                }
            } else {
                val i_320_ = this.anIntArrayArray4584[i]!![i_300_]
                val f_321_ = aFloat8227 * i_320_.toFloat()
                if (anInt8228 == -1) {
                    f = aFloat8218 + (aFloat8233 * i_305_.toFloat() + f_321_ + aFloat8231 * i_307_.toFloat())
                    if (f <= aHa_Sub1_8217.anInt7482.toFloat()) return
                    f_309_ = aFloat8218 + (aFloat8233 * i_306_.toFloat() + f_321_ + aFloat8231 * i_307_.toFloat())
                    if (f_309_ <= aHa_Sub1_8217.anInt7482.toFloat()) return
                    f_310_ = aFloat8218 + (aFloat8233 * i_306_.toFloat() + f_321_ + aFloat8231 * i_308_.toFloat())
                    if (f_310_ <= aHa_Sub1_8217.anInt7482.toFloat()) return
                    f_311_ = aFloat8218 + (aFloat8233 * i_305_.toFloat() + f_321_ + aFloat8231 * i_308_.toFloat())
                    if (f_311_ <= aHa_Sub1_8217.anInt7482.toFloat()) return
                } else {
                    f = aFloat8218 + (aFloat8233 * i_305_.toFloat() + f_321_ + aFloat8231 * i_307_.toFloat())
                    f_309_ = aFloat8218 + (aFloat8233 * i_306_.toFloat() + f_321_ + aFloat8231 * i_307_.toFloat())
                    f_310_ = aFloat8218 + (aFloat8233 * i_306_.toFloat() + f_321_ + aFloat8231 * i_308_.toFloat())
                    f_311_ = aFloat8218 + (aFloat8233 * i_305_.toFloat() + f_321_ + aFloat8231 * i_308_.toFloat())
                }
                val f_322_ = aFloat8216 * i_320_.toFloat()
                val f_323_ = aFloat8221 * i_320_.toFloat()
                if (anInt8228 == -1) {
                    val f_324_ = (aFloat8213 + (aFloat8212 * i_305_.toFloat() + f_322_ + aFloat8224 * i_307_.toFloat()))
                    i_312_ = (class109.anInt1665 + (f_324_ * (aHa_Sub1_8217.anInt7491).toFloat() / f).toInt())
                    val f_325_ = (aFloat8226 + (aFloat8214 * i_305_.toFloat() + f_323_ + aFloat8229 * i_307_.toFloat()))
                    i_313_ = (class109.anInt1668 + (f_325_ * (aHa_Sub1_8217.anInt7497).toFloat() / f).toInt())
                    val f_326_ = (aFloat8213 + (aFloat8212 * i_306_.toFloat() + f_322_ + aFloat8224 * i_307_.toFloat()))
                    i_314_ = (class109.anInt1665 + (f_326_ * (aHa_Sub1_8217.anInt7491).toFloat() / f_309_).toInt())
                    val f_327_ = (aFloat8226 + (aFloat8214 * i_306_.toFloat() + f_323_ + aFloat8229 * i_307_.toFloat()))
                    i_315_ = (class109.anInt1668 + (f_327_ * (aHa_Sub1_8217.anInt7497).toFloat() / f_309_).toInt())
                    val f_328_ = (aFloat8213 + (aFloat8212 * i_306_.toFloat() + f_322_ + aFloat8224 * i_308_.toFloat()))
                    i_316_ = (class109.anInt1665 + (f_328_ * (aHa_Sub1_8217.anInt7491).toFloat() / f_310_).toInt())
                    val f_329_ = (aFloat8226 + (aFloat8214 * i_306_.toFloat() + f_323_ + aFloat8229 * i_308_.toFloat()))
                    i_317_ = (class109.anInt1668 + (f_329_ * (aHa_Sub1_8217.anInt7497).toFloat() / f_310_).toInt())
                    val f_330_ = (aFloat8213 + (aFloat8212 * i_305_.toFloat() + f_322_ + aFloat8224 * i_308_.toFloat()))
                    i_318_ = (class109.anInt1665 + (f_330_ * (aHa_Sub1_8217.anInt7491).toFloat() / f_311_).toInt())
                    val f_331_ = (aFloat8226 + (aFloat8214 * i_305_.toFloat() + f_323_ + aFloat8229 * i_308_.toFloat()))
                    i_319_ = (class109.anInt1668 + (f_331_ * (aHa_Sub1_8217.anInt7497).toFloat() / f_311_).toInt())
                } else {
                    val f_332_ = (aFloat8213 + (aFloat8212 * i_305_.toFloat() + f_322_ + aFloat8224 * i_307_.toFloat()))
                    i_312_ = (class109.anInt1665 + (f_332_ * (aHa_Sub1_8217.anInt7491).toFloat() / anInt8228.toFloat()).toInt())
                    val f_333_ = (aFloat8226 + (aFloat8214 * i_305_.toFloat() + f_323_ + aFloat8229 * i_307_.toFloat()))
                    i_313_ = (class109.anInt1668 + (f_333_ * (aHa_Sub1_8217.anInt7497).toFloat() / anInt8228.toFloat()).toInt())
                    val f_334_ = (aFloat8213 + (aFloat8212 * i_306_.toFloat() + f_322_ + aFloat8224 * i_307_.toFloat()))
                    i_314_ = (class109.anInt1665 + (f_334_ * (aHa_Sub1_8217.anInt7491).toFloat() / anInt8228.toFloat()).toInt())
                    val f_335_ = (aFloat8226 + (aFloat8214 * i_306_.toFloat() + f_323_ + aFloat8229 * i_307_.toFloat()))
                    i_315_ = (class109.anInt1668 + (f_335_ * (aHa_Sub1_8217.anInt7497).toFloat() / anInt8228.toFloat()).toInt())
                    val f_336_ = (aFloat8213 + (aFloat8212 * i_306_.toFloat() + f_322_ + aFloat8224 * i_308_.toFloat()))
                    i_316_ = (class109.anInt1665 + (f_336_ * (aHa_Sub1_8217.anInt7491).toFloat() / anInt8228.toFloat()).toInt())
                    val f_337_ = (aFloat8226 + (aFloat8214 * i_306_.toFloat() + f_323_ + aFloat8229 * i_308_.toFloat()))
                    i_317_ = (class109.anInt1668 + (f_337_ * (aHa_Sub1_8217.anInt7497).toFloat() / anInt8228.toFloat()).toInt())
                    val f_338_ = (aFloat8213 + (aFloat8212 * i_305_.toFloat() + f_322_ + aFloat8224 * i_308_.toFloat()))
                    i_318_ = (class109.anInt1665 + (f_338_ * (aHa_Sub1_8217.anInt7491).toFloat() / anInt8228.toFloat()).toInt())
                    val f_339_ = (aFloat8226 + (aFloat8214 * i_305_.toFloat() + f_323_ + aFloat8229 * i_308_.toFloat()))
                    i_319_ = (class109.anInt1668 + (f_339_ * (aHa_Sub1_8217.anInt7497).toFloat() / anInt8228.toFloat()).toInt())
                }
            }
            if (anInt8228 == -1) {
                if (((i_316_ - i_318_) * (i_315_ - i_319_) - (i_317_ - i_319_) * (i_314_ - i_318_)) > 0) {
                    class109.aBoolean1671 = (i_316_ < 0 || i_318_ < 0 || i_314_ < 0 || i_316_ > class109.anInt1679 || i_318_ > class109.anInt1679 || i_314_ > class109.anInt1679)
                    if (class102.aShort1605 >= 0) class109.method1024(
                        i_317_.toFloat(),
                        i_319_.toFloat(),
                        i_315_.toFloat(),
                        i_316_.toFloat(),
                        i_318_.toFloat(),
                        i_314_.toFloat(),
                        f_310_,
                        f_311_,
                        f_309_,
                        1.0f,
                        0.0f,
                        1.0f,
                        1.0f,
                        1.0f,
                        0.0f,
                        (0xffffff.inv() or ((Class126.anIntArray4983!![(class102.aShort1602.toInt() and 0xffff)]) and 0xffffff)),
                        (0xffffff.inv() or ((Class126.anIntArray4983!![(class102.aShort1604.toInt() and 0xffff)]) and 0xffffff)),
                        (0xffffff.inv() or ((Class126.anIntArray4983!![(class102.aShort1603.toInt() and 0xffff)]) and 0xffffff)),
                        0,
                        0,
                        0,
                        0,
                        class102.aShort1605.toInt()
                    )
                    else class109.method1022(i_317_.toFloat(), i_319_.toFloat(), i_315_.toFloat(), i_316_.toFloat(), i_318_.toFloat(), i_314_.toFloat(), f_310_.toInt().toFloat(), f_311_.toInt().toFloat(), f_309_.toInt().toFloat(), (class102.aShort1602.toInt() and 0xffff).toFloat(), (class102.aShort1604.toInt() and 0xffff).toFloat(), (class102.aShort1603.toInt() and 0xffff).toFloat())
                }
                if (((i_312_ - i_314_) * (i_319_ - i_315_) - (i_313_ - i_315_) * (i_318_ - i_314_)) > 0) {
                    class109.aBoolean1671 = (i_312_ < 0 || i_314_ < 0 || i_318_ < 0 || i_312_ > class109.anInt1679 || i_314_ > class109.anInt1679 || i_318_ > class109.anInt1679)
                    if (class102.aShort1605 >= 0) class109.method1024(
                        i_313_.toFloat(),
                        i_315_.toFloat(),
                        i_319_.toFloat(),
                        i_312_.toFloat(),
                        i_314_.toFloat(),
                        i_318_.toFloat(),
                        f,
                        f_309_,
                        f_311_,
                        0.0f,
                        1.0f,
                        1.0f,
                        0.0f,
                        0.0f,
                        1.0f,
                        (0xffffff.inv() or ((Class126.anIntArray4983!![(class102.aShort1601.toInt() and 0xffff)]) and 0xffffff)),
                        (0xffffff.inv() or ((Class126.anIntArray4983!![(class102.aShort1603.toInt() and 0xffff)]) and 0xffffff)),
                        (0xffffff.inv() or ((Class126.anIntArray4983!![(class102.aShort1604.toInt() and 0xffff)]) and 0xffffff)),
                        0,
                        0,
                        0,
                        0,
                        class102.aShort1605.toInt()
                    )
                    else class109.method1022(i_313_.toFloat(), i_315_.toFloat(), i_319_.toFloat(), i_312_.toFloat(), i_314_.toFloat(), i_318_.toFloat(), f.toInt().toFloat(), f_309_.toInt().toFloat(), f_311_.toInt().toFloat(), (class102.aShort1601.toInt() and 0xffff).toFloat(), (class102.aShort1603.toInt() and 0xffff).toFloat(), (class102.aShort1604.toInt() and 0xffff).toFloat())
                }
            } else {
                if (((i_316_ - i_318_) * (i_315_ - i_319_) - (i_317_ - i_319_) * (i_314_ - i_318_)) > 0) {
                    class109.aBoolean1671 = (i_316_ < 0 || i_318_ < 0 || i_314_ < 0 || i_316_ > class109.anInt1679 || i_318_ > class109.anInt1679 || i_314_ > class109.anInt1679)
                    if (class102.aShort1605 >= 0) class109.method1024(
                        i_317_.toFloat(),
                        i_319_.toFloat(),
                        i_315_.toFloat(),
                        i_316_.toFloat(),
                        i_318_.toFloat(),
                        i_314_.toFloat(),
                        f_310_,
                        f_311_,
                        f_309_,
                        1.0f,
                        0.0f,
                        1.0f,
                        1.0f,
                        1.0f,
                        0.0f,
                        (0xffffff.inv() or ((Class126.anIntArray4983!![(class102.aShort1602.toInt() and 0xffff)]) and 0xffffff)),
                        (0xffffff.inv() or ((Class126.anIntArray4983!![(class102.aShort1604.toInt() and 0xffff)]) and 0xffffff)),
                        (0xffffff.inv() or ((Class126.anIntArray4983!![(class102.aShort1603.toInt() and 0xffff)]) and 0xffffff)),
                        0,
                        0,
                        0,
                        0,
                        class102.aShort1605.toInt()
                    )
                    else class109.method1022(i_317_.toFloat(), i_319_.toFloat(), i_315_.toFloat(), i_316_.toFloat(), i_318_.toFloat(), i_314_.toFloat(), f_310_.toInt().toFloat(), f_311_.toInt().toFloat(), f_309_.toInt().toFloat(), (class102.aShort1602.toInt() and 0xffff).toFloat(), (class102.aShort1604.toInt() and 0xffff).toFloat(), (class102.aShort1603.toInt() and 0xffff).toFloat())
                }
                if (((i_312_ - i_314_) * (i_319_ - i_315_) - (i_313_ - i_315_) * (i_318_ - i_314_)) > 0) {
                    class109.aBoolean1671 = (i_312_ < 0 || i_314_ < 0 || i_318_ < 0 || i_312_ > class109.anInt1679 || i_314_ > class109.anInt1679 || i_318_ > class109.anInt1679)
                    if (class102.aShort1605 >= 0) class109.method1024(
                        i_313_.toFloat(),
                        i_315_.toFloat(),
                        i_319_.toFloat(),
                        i_312_.toFloat(),
                        i_314_.toFloat(),
                        i_318_.toFloat(),
                        f,
                        f_309_,
                        f_311_,
                        0.0f,
                        1.0f,
                        1.0f,
                        0.0f,
                        0.0f,
                        1.0f,
                        (0xffffff.inv() or ((Class126.anIntArray4983!![(class102.aShort1601.toInt() and 0xffff)]) and 0xffffff)),
                        (0xffffff.inv() or ((Class126.anIntArray4983!![(class102.aShort1603.toInt() and 0xffff)]) and 0xffffff)),
                        (0xffffff.inv() or ((Class126.anIntArray4983!![(class102.aShort1604.toInt() and 0xffff)]) and 0xffffff)),
                        0,
                        0,
                        0,
                        0,
                        class102.aShort1605.toInt()
                    )
                    else class109.method1022(i_313_.toFloat(), i_315_.toFloat(), i_319_.toFloat(), i_312_.toFloat(), i_314_.toFloat(), i_318_.toFloat(), f.toInt().toFloat(), f_309_.toInt().toFloat(), f_311_.toInt().toFloat(), (class102.aShort1601.toInt() and 0xffff).toFloat(), (class102.aShort1603.toInt() and 0xffff).toFloat(), (class102.aShort1604.toInt() and 0xffff).toFloat())
                }
            }
        }
    }

    override fun method3989(var_r: r?, i: Int, i_407_: Int, i_408_: Int, i_409_: Int, bool: Boolean): Boolean {
        return false
    }

    override fun fa(i: Int, i_410_: Int, var_r: r?): r? {
        return null
    }

    override fun method3987(i: Int, i_411_: Int, i_412_: Int, i_413_: Int, i_414_: Int, i_415_: Int, i_416_: Int, bools: Array<BooleanArray?>) {
        val class167 = aHa_Sub1_8217.method3724(Thread.currentThread())
        val class109 = class167!!.aClass109_2220!!
        class109.anInt1674 = 0
        class109.aBoolean1671 = true
        aHa_Sub1_8217.ya()
        if (aClass266ArrayArray8230 != null || aClass198ArrayArray8219 != null) method3993(i, i_411_, i_412_, i_413_, i_414_, i_415_, i_416_, bools, class167, class109, class167.anIntArray2212!!, class167.anIntArray2228!!)
        else if (aClass102ArrayArray8215 != null) method3996(i, i_411_, i_412_, i_413_, i_414_, i_415_, i_416_, bools, class167, class109, class167.anIntArray2212!!, class167.anIntArray2228!!)
    }

    private fun method3995(i: Int, i_417_: Int, bool: Boolean, class167: Class167, class109: Class109, `is`: IntArray, is_418_: IntArray, is_419_: IntArray, is_420_: IntArray, i_421_: Int) {
        val class198 = aClass198ArrayArray8219!![i]!![i_417_]
        if (i_421_ == 0 || (i_421_ and 0x2) == 0) {
            if (class198 != null) {
                if (anInt8228 == -1) {
                    for (i_422_ in 0..<class198.aShort2620) {
                        val i_423_ = (class198.aShortArray2622!![i_422_] + (i shl this.anInt4588))
                        var i_424_ = class198.aShortArray2618!![i_422_].toInt()
                        val i_425_ = (class198.aShortArray2613!![i_422_] + (i_417_ shl this.anInt4588))
                        val f = aFloat8218 + (aFloat8233 * i_423_.toFloat() + aFloat8227 * i_424_.toFloat() + aFloat8231 * i_425_.toFloat())
                        if (f <= aHa_Sub1_8217.anInt7482.toFloat()) return
                        is_420_[i_422_] = 0
                        if (bool) {
                            var i_426_ = (f - (class167.anInt2210).toFloat()).toInt()
                            if (i_426_ > 255) i_426_ = 255
                            if (i_426_ > 0) {
                                is_420_[i_422_] = i_426_
                                val i_427_ = ((class198.aShortArray2621!![i_422_]) * i_426_ / 255)
                                if (i_427_ > 0) i_424_ -= i_427_
                            }
                        } else if (class167.aBoolean2201) {
                            val i_428_ = (f - (class167.anInt2210).toFloat()).toInt()
                            if (i_428_ > 0) {
                                is_420_[i_422_] = i_428_
                                if (is_420_[i_422_] > 255) is_420_[i_422_] = 255
                            }
                        }
                        val f_429_ = aFloat8213 + (aFloat8212 * i_423_.toFloat() + aFloat8216 * i_424_.toFloat() + aFloat8224 * i_425_.toFloat())
                        val f_430_ = aFloat8226 + (aFloat8214 * i_423_.toFloat() + aFloat8221 * i_424_.toFloat() + aFloat8229 * i_425_.toFloat())
                        `is`[i_422_] = (class109.anInt1665 + (f_429_ * (aHa_Sub1_8217.anInt7491).toFloat() / f).toInt())
                        is_418_[i_422_] = (class109.anInt1668 + (f_430_ * (aHa_Sub1_8217.anInt7497).toFloat() / f).toInt())
                        is_419_[i_422_] = f.toInt()
                    }
                } else {
                    for (i_431_ in 0..<class198.aShort2620) {
                        val i_432_ = (class198.aShortArray2622!![i_431_] + (i shl this.anInt4588))
                        var i_433_ = class198.aShortArray2618!![i_431_].toInt()
                        val i_434_ = (class198.aShortArray2613!![i_431_] + (i_417_ shl this.anInt4588))
                        val f = aFloat8218 + (aFloat8233 * i_432_.toFloat() + aFloat8227 * i_433_.toFloat() + aFloat8231 * i_434_.toFloat())
                        is_420_[i_431_] = 0
                        if (bool) {
                            var i_435_ = anInt8228 - class167.anInt2210
                            if (i_435_ > 255) i_435_ = 255
                            if (i_435_ > 0) {
                                is_420_[i_431_] = i_435_
                                val i_436_ = ((class198.aShortArray2621!![i_431_]) * i_435_ / 255)
                                if (i_436_ > 0) i_433_ -= i_436_
                            }
                        } else if (class167.aBoolean2201) {
                            val i_437_ = anInt8228 - class167.anInt2210
                            if (i_437_ > 0) {
                                is_420_[i_431_] = i_437_
                                if (is_420_[i_431_] > 255) is_420_[i_431_] = 255
                            }
                        }
                        val f_438_ = aFloat8213 + (aFloat8212 * i_432_.toFloat() + aFloat8216 * i_433_.toFloat() + aFloat8224 * i_434_.toFloat())
                        val f_439_ = aFloat8226 + (aFloat8214 * i_432_.toFloat() + aFloat8221 * i_433_.toFloat() + aFloat8229 * i_434_.toFloat())
                        `is`[i_431_] = (class109.anInt1665 + (f_438_ * (aHa_Sub1_8217.anInt7491).toFloat() / anInt8228.toFloat()).toInt())
                        is_418_[i_431_] = (class109.anInt1668 + (f_439_ * (aHa_Sub1_8217.anInt7497).toFloat() / anInt8228.toFloat()).toInt())
                        is_419_[i_431_] = f.toInt()
                    }
                }
                val f = this.anInt4592.toFloat()
                for (i_440_ in 0..<class198.aShort2619) {
                    val i_441_ = i_440_ * 3
                    val i_442_ = i_441_ + 1
                    val i_443_ = i_442_ + 1
                    val i_444_ = `is`[i_441_]
                    val i_445_ = `is`[i_442_]
                    val i_446_ = `is`[i_443_]
                    val i_447_ = is_418_[i_441_]
                    val i_448_ = is_418_[i_442_]
                    val i_449_ = is_418_[i_443_]
                    if (((i_444_ - i_445_) * (i_449_ - i_448_) - (i_447_ - i_448_) * (i_446_ - i_445_)) > 0) {
                        class109.aBoolean1671 = (i_444_ < 0 || i_445_ < 0 || i_446_ < 0 || i_444_ > class109.anInt1679 || i_445_ > class109.anInt1679 || i_446_ > class109.anInt1679)
                        if (is_420_[i_441_] + is_420_[i_442_] + is_420_[i_443_] < 765) {
                            val i_450_ = i shl this.anInt4588
                            val i_451_ = i_417_ shl this.anInt4588
                            if ((class198.anIntArray2623!![i_441_] and 0xffffff) != 0) {
                                if (((class198.aShortArray2616!![i_441_]) == (class198.aShortArray2616!![i_442_])) && ((class198.aShortArray2616!![i_441_]) == (class198.aShortArray2616!![i_443_])) && ((class198.aShortArray2614!![i_441_]) == (class198.aShortArray2614!![i_442_])) && ((class198.aShortArray2614!![i_441_]) == (class198.aShortArray2614!![i_443_]))) class109.method1024(
                                    i_447_.toFloat(),
                                    i_448_.toFloat(),
                                    i_449_.toFloat(),
                                    i_444_.toFloat(),
                                    i_445_.toFloat(),
                                    i_446_.toFloat(),
                                    is_419_[i_441_].toFloat(),
                                    is_419_[i_442_].toFloat(),
                                    is_419_[i_443_].toFloat(),
                                    ((i_450_ + (class198.aShortArray2622!![i_441_])).toFloat() / (class198.aShortArray2614!![i_441_]).toFloat()),
                                    ((i_450_ + (class198.aShortArray2622!![i_442_])).toFloat() / (class198.aShortArray2614!![i_442_]).toFloat()),
                                    ((i_450_ + (class198.aShortArray2622!![i_443_])).toFloat() / (class198.aShortArray2614!![i_443_]).toFloat()),
                                    ((i_451_ + (class198.aShortArray2613!![i_441_])).toFloat() / (class198.aShortArray2614!![i_441_]).toFloat()),
                                    ((i_451_ + (class198.aShortArray2613!![i_442_])).toFloat() / (class198.aShortArray2614!![i_442_]).toFloat()),
                                    ((i_451_ + (class198.aShortArray2613!![i_443_])).toFloat() / (class198.aShortArray2614!![i_443_]).toFloat()),
                                    (class198.anIntArray2623!![i_441_]),
                                    (class198.anIntArray2623!![i_442_]),
                                    (class198.anIntArray2623!![i_443_]),
                                    class167.anInt2192,
                                    is_420_[i_441_],
                                    is_420_[i_442_],
                                    is_420_[i_443_],
                                    (class198.aShortArray2616!![i_441_]).toInt()
                                )
                                else class109.method1020(
                                    i_447_.toFloat(),
                                    i_448_.toFloat(),
                                    i_449_.toFloat(),
                                    i_444_.toFloat(),
                                    i_445_.toFloat(),
                                    i_446_.toFloat(),
                                    is_419_[i_441_].toFloat(),
                                    is_419_[i_442_].toFloat(),
                                    is_419_[i_443_].toFloat(),
                                    (i_450_ + (class198.aShortArray2622!![i_441_])).toFloat() / f,
                                    (i_450_ + (class198.aShortArray2622!![i_442_])).toFloat() / f,
                                    (i_450_ + (class198.aShortArray2622!![i_443_])).toFloat() / f,
                                    (i_451_ + (class198.aShortArray2613!![i_441_])).toFloat() / f,
                                    (i_451_ + (class198.aShortArray2613!![i_442_])).toFloat() / f,
                                    (i_451_ + (class198.aShortArray2613!![i_443_])).toFloat() / f,
                                    (class198.anIntArray2623!![i_441_]),
                                    (class198.anIntArray2623!![i_442_]),
                                    (class198.anIntArray2623!![i_443_]),
                                    class167.anInt2192,
                                    is_420_[i_441_],
                                    is_420_[i_442_],
                                    is_420_[i_443_],
                                    (class198.aShortArray2616!![i_441_]).toInt(),
                                    f / (class198.aShortArray2614!![i_441_]).toFloat(),
                                    (class198.aShortArray2616!![i_442_]).toInt(),
                                    f / (class198.aShortArray2614!![i_442_]).toFloat(),
                                    (class198.aShortArray2616!![i_443_]).toInt(),
                                    f / (class198.aShortArray2614!![i_443_]).toFloat()
                                )
                            }
                        } else class109.method1018(i_447_.toFloat(), i_448_.toFloat(), i_449_.toFloat(), i_444_.toFloat(), i_445_.toFloat(), i_446_.toFloat(), is_419_[i_441_].toFloat(), is_419_[i_442_].toFloat(), is_419_[i_443_].toFloat(), (class167.anInt2192))
                    }
                }
            }
        }
    }

    override fun method3979(i: Int, i_452_: Int) {
        method3992(i, i_452_, 0)
    }

    private fun method3996(i: Int, i_453_: Int, i_454_: Int, i_455_: Int, i_456_: Int, i_457_: Int, i_458_: Int, bools: Array<BooleanArray?>, class167: Class167, class109: Class109, `is`: IntArray, is_459_: IntArray) {
        val i_460_ = (i_458_ - i_456_) * i_454_ / 256
        val i_461_ = i_454_ shr 8
        val bool = class167.aBoolean2202
        aHa_Sub1_8217.C(false)
        class109.aBoolean1669 = false
        class109.aBoolean1667 = false
        var i_462_ = i
        var i_463_ = i_453_ + i_460_
        for (i_464_ in i_455_..<i_457_) {
            for (i_465_ in i_456_..<i_458_) {
                if (bools[i_464_ - i_455_]!![i_465_ - i_456_]) {
                    if (aClass102ArrayArray8215!![i_464_]!![i_465_] != null) {
                        val class102 = aClass102ArrayArray8215!![i_464_]!![i_465_]!!
                        if (class102.aShort1605.toInt() != -1 && (class102.aByte1606.toInt() and 0x2) == 0 && class102.anInt1600 == -1) {
                            val i_466_ = aHa_Sub1_8217.method3722(class102.aShort1605.toInt())
                            class109.method1022(
                                (i_463_ - i_461_).toFloat(),
                                (i_463_ - i_461_).toFloat(),
                                i_463_.toFloat(),
                                (i_462_ + i_461_).toFloat(),
                                i_462_.toFloat(),
                                (i_462_ + i_461_).toFloat(),
                                100.0f,
                                100.0f,
                                100.0f,
                                Class291.method2198(0, ((class102.aShort1602).toInt() and 0xffff), i_466_).toFloat(),
                                Class291.method2198(0, ((class102.aShort1604).toInt() and 0xffff), i_466_).toFloat(),
                                Class291.method2198(0, ((class102.aShort1603).toInt() and 0xffff), i_466_).toFloat()
                            )
                            class109.method1022(
                                i_463_.toFloat(),
                                i_463_.toFloat(),
                                (i_463_ - i_461_).toFloat(),
                                i_462_.toFloat(),
                                (i_462_ + i_461_).toFloat(),
                                i_462_.toFloat(),
                                100.0f,
                                100.0f,
                                100.0f,
                                Class291.method2198(0, ((class102.aShort1601).toInt() and 0xffff), i_466_).toFloat(),
                                Class291.method2198(0, ((class102.aShort1603).toInt() and 0xffff), i_466_).toFloat(),
                                Class291.method2198(0, ((class102.aShort1604).toInt() and 0xffff), i_466_).toFloat()
                            )
                        } else if (class102.anInt1600 == -1) {
                            class109.method1022((i_463_ - i_461_).toFloat(), (i_463_ - i_461_).toFloat(), i_463_.toFloat(), (i_462_ + i_461_).toFloat(), i_462_.toFloat(), (i_462_ + i_461_).toFloat(), 100.0f, 100.0f, 100.0f, (class102.aShort1602.toInt() and 0xffff).toFloat(), (class102.aShort1604.toInt() and 0xffff).toFloat(), (class102.aShort1603.toInt() and 0xffff).toFloat())
                            class109.method1022(i_463_.toFloat(), i_463_.toFloat(), (i_463_ - i_461_).toFloat(), i_462_.toFloat(), (i_462_ + i_461_).toFloat(), i_462_.toFloat(), 100.0f, 100.0f, 100.0f, (class102.aShort1601.toInt() and 0xffff).toFloat(), (class102.aShort1603.toInt() and 0xffff).toFloat(), (class102.aShort1604.toInt() and 0xffff).toFloat())
                        } else {
                            val i_467_ = class102.anInt1600
                            class109.method1022((i_463_ - i_461_).toFloat(), (i_463_ - i_461_).toFloat(), i_463_.toFloat(), (i_462_ + i_461_).toFloat(), i_462_.toFloat(), (i_462_ + i_461_).toFloat(), 100.0f, 100.0f, 100.0f, i_467_.toFloat(), i_467_.toFloat(), i_467_.toFloat())
                            class109.method1022(i_463_.toFloat(), i_463_.toFloat(), (i_463_ - i_461_).toFloat(), i_462_.toFloat(), (i_462_ + i_461_).toFloat(), i_462_.toFloat(), 100.0f, 100.0f, 100.0f, i_467_.toFloat(), i_467_.toFloat(), i_467_.toFloat())
                        }
                    } else if (aClass236ArrayArray8222!![i_464_]!![i_465_] != null) {
                        val class236 = aClass236ArrayArray8222!![i_464_]!![i_465_]!!
                        for (i_468_ in 0..<class236.aShort3089) {
                            `is`[i_468_] = i_462_ + ((class236.aShortArray3096!![i_468_]) * i_461_ / this.anInt4592)
                            is_459_[i_468_] = i_463_ - ((class236.aShortArray3094!![i_468_]) * i_461_ / this.anInt4592)
                        }
                        for (i_469_ in 0..<class236.aShort3099) {
                            val i_470_ = (class236.aShortArray3091!![i_469_])
                            val i_471_ = (class236.aShortArray3090!![i_469_])
                            val i_472_ = (class236.aShortArray3101!![i_469_])
                            val i_473_ = `is`[i_470_.toInt()]
                            val i_474_ = `is`[i_471_.toInt()]
                            val i_475_ = `is`[i_472_.toInt()]
                            val i_476_ = is_459_[i_470_.toInt()]
                            val i_477_ = is_459_[i_471_.toInt()]
                            val i_478_ = is_459_[i_472_.toInt()]
                            if (class236.anIntArray3092 != null && (class236.anIntArray3092!![i_469_]) != -1) {
                                val i_479_ = (class236.anIntArray3092!![i_469_])
                                class109.method1022(
                                    i_476_.toFloat(),
                                    i_477_.toFloat(),
                                    i_478_.toFloat(),
                                    i_473_.toFloat(),
                                    i_474_.toFloat(),
                                    i_475_.toFloat(),
                                    100.0f,
                                    100.0f,
                                    100.0f,
                                    (Class291.method2198(0, (class236.aShortArray3088!![i_470_.toInt()]).toInt(), i_479_)).toFloat(),
                                    (Class291.method2198(0, (class236.aShortArray3088!![i_471_.toInt()]).toInt(), i_479_)).toFloat(),
                                    (Class291.method2198(0, (class236.aShortArray3088!![i_472_.toInt()]).toInt(), i_479_)).toFloat()
                                )
                            } else if ((class236.aShortArray3095 != null) && (class236.aShortArray3095!![i_469_]).toInt() != -1) {
                                val i_480_ = aHa_Sub1_8217.method3722(class236.aShortArray3095!![i_469_].toInt())
                                class109.method1022(
                                    i_476_.toFloat(),
                                    i_477_.toFloat(),
                                    i_478_.toFloat(),
                                    i_473_.toFloat(),
                                    i_474_.toFloat(),
                                    i_475_.toFloat(),
                                    100.0f,
                                    100.0f,
                                    100.0f,
                                    (Class291.method2198(0, (class236.aShortArray3088!![i_470_.toInt()]).toInt(), i_480_)).toFloat(),
                                    (Class291.method2198(0, (class236.aShortArray3088!![i_471_.toInt()]).toInt(), i_480_)).toFloat(),
                                    (Class291.method2198(0, (class236.aShortArray3088!![i_472_.toInt()]).toInt(), i_480_)).toFloat()
                                )
                            } else {
                                val i_481_ = (class236.anIntArray3093!![i_469_])
                                class109.method1022(
                                    i_476_.toFloat(),
                                    i_477_.toFloat(),
                                    i_478_.toFloat(),
                                    i_473_.toFloat(),
                                    i_474_.toFloat(),
                                    i_475_.toFloat(),
                                    100.0f,
                                    100.0f,
                                    100.0f,
                                    (Class291.method2198(0, (class236.aShortArray3088!![i_470_.toInt()]).toInt(), i_481_)).toFloat(),
                                    (Class291.method2198(0, (class236.aShortArray3088!![i_471_.toInt()]).toInt(), i_481_)).toFloat(),
                                    (Class291.method2198(0, (class236.aShortArray3088!![i_472_.toInt()]).toInt(), i_481_)).toFloat()
                                )
                            }
                        }
                    }
                }
                i_463_ -= i_461_
            }
            i_463_ = i_453_ + i_460_
            i_462_ += i_461_
        }
        class109.aBoolean1669 = true
        aHa_Sub1_8217.C(bool)
    }

    override fun YA() {
        aByteArrayArray8220 = null
        aByteArrayArray8232 = null
    }

    override fun CA(var_r: r?, i: Int, i_482_: Int, i_483_: Int, i_484_: Int, bool: Boolean) {
        /* empty */
    }

    private fun method3997(i: Int): Boolean {
        if ((anInt8223 and 0x8) == 0) return false
        if (i == 4) return true
        if (i == 8) return true
        return i == 9
    }

    init {
        aByteArrayArray8220 = Array<ByteArray?>(i_486_ + 1) { ByteArray(i_487_ + 1) }
        val i_490_ = aHa_Sub1_8217.anInt7500 shr 9
        for (i_491_ in 1..<i_487_) {
            for (i_492_ in 1..<i_486_) {
                var i_493_ = i_490_
                val i_494_ = (is_488_[i_492_ + 1]!![i_491_] - is_488_[i_492_ - 1]!![i_491_])
                val i_495_ = (is_488_[i_492_]!![i_491_ + 1] - is_488_[i_492_]!![i_491_ - 1])
                val i_496_ = sqrt((i_494_ * i_494_ + 512 * i_489_ + i_495_ * i_495_).toDouble()).toInt()
                val i_497_ = (i_494_ shl 8) / i_496_
                val i_498_ = -512 * i_489_ / i_496_
                val i_499_ = (i_495_ shl 8) / i_496_
                i_493_ += (aHa_Sub1_8217.anInt7484 * i_497_ + aHa_Sub1_8217.anInt7473 * i_498_ + aHa_Sub1_8217.anInt7479 * i_499_) shr 17
                i_493_ = i_493_ shr 1
                if (i_493_ < 2) i_493_ = 2
                else if (i_493_ > 126) i_493_ = 126
                aByteArrayArray8220!![i_492_]!![i_491_] = i_493_.toByte()
            }
        }
        aByteArrayArray8232 = Array<ByteArray?>(i_486_ + 1) { ByteArray(i_487_ + 1) }
    }

    companion object {
        private fun method3991(i: Int, i_244_: Int): Int {
            var i_245_ = (i and 0xff0000) * i_244_ shr 23
            if (i_245_ < 2) i_245_ = 2
            else if (i_245_ > 253) i_245_ = 253
            var i_246_ = (i and 0xff00) * i_244_ shr 15
            if (i_246_ < 2) i_246_ = 2
            else if (i_246_ > 253) i_246_ = 253
            var i_247_ = (i and 0xff) * i_244_ shr 7
            if (i_247_ < 2) i_247_ = 2
            else if (i_247_ > 253) i_247_ = 253
            return i_245_ shl 16 or (i_246_ shl 8) or i_247_
        }
    }
}
