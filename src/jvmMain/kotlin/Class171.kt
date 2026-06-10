/* Class171 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class171 internal constructor(private val aHa_Sub2_2268: ha_Sub2, i: Int, var anInt2270: Int) {
    @Throws(Throwable::class)
    protected fun finalize() {
        aHa_Sub2_2268.method3765(65.toByte(), this.anInt2270)
        anInt2274++
//        super.finalize()
    }

    companion object {
        var anInt2267: Int = 0
        @JvmField
        var aShort2269: Short = 32767
        var anInt2271: Int = 0
        @JvmField
        var anIntArray2272: IntArray? = null
        var anInt2273: Int = 0
        var anInt2274: Int = 0
        var anInt2275: Int = 0

        /*synthetic*/
        var aClass2276: Class<*>? = null

        @JvmStatic
        fun method1319(i: Int, bool: Boolean, `is`: ByteArray, i_0_: Int): Int {
            anInt2267++
            if (bool != true) return 63
            var i_1_ = -1
            for (i_2_ in i_0_..<i) i_1_ = (i_1_ ushr 8 xor Class89.anIntArray1508!![(i_1_ xor `is`[i_2_].toInt()) and 0xff])
            i_1_ = i_1_ xor -0x1
            return i_1_
        }

        @JvmStatic
        fun method1320() {
            for (i in 0..<Class331.anInt4135) {
                if (!r.aBooleanArray9718!![i]) {
                    val class211 = Class239_Sub14.aClass211Array5993!![i]
                    val class348_sub1 = class211!!.aClass348_Sub1_2745!!
                    val i_3_ = class211.anInt2731
                    val i_4_ = (class348_sub1.method2723(-1) - Class348_Sub23_Sub2.anInt9037)
                    val i_5_ = 1 + (2 * i_4_ shr Class362.anInt4459)
                    var i_6_ = 0
                    val `is` = IntArray(i_5_ * i_5_)
                    val i_7_ = (class348_sub1.method2724(-1) - i_4_ shr Class362.anInt4459)
                    var i_8_ = (class348_sub1.method2717(79.toByte()) - i_4_ shr Class362.anInt4459)
                    var i_9_ = (class348_sub1.method2717(113.toByte()) + i_4_ shr Class362.anInt4459)
                    if (i_8_ < 0) {
                        i_6_ -= i_8_
                        i_8_ = 0
                    }
                    if (i_9_ >= Class348_Sub41.anInt7054) i_9_ = Class348_Sub41.anInt7054 - 1
                    for (i_10_ in i_8_..i_9_) {
                        val i_11_ = class211.aShortArray2742!![i_6_].toInt()
                        val i_12_ = i_11_ ushr 8
                        var i_13_ = i_6_ * i_5_ + i_12_
                        var i_14_ = i_7_ + (i_11_ ushr 8)
                        var i_15_ = i_14_ + (i_11_ and 0xff) - 1
                        if (i_14_ < 0) {
                            i_13_ -= i_14_
                            i_14_ = 0
                        }
                        if (i_15_ >= Class318_Sub7.anInt6451) i_15_ = Class318_Sub7.anInt6451 - 1
                        for (i_16_ in i_14_..i_15_) {
                            var i_17_ = 1
                            val class318_sub1_sub3: Class318_Sub1_Sub3? = (Class177.Companion.method1353(i_3_, i_16_, i_10_, (if (aClass2276 != null) aClass2276 else (Class318_Sub1_Sub3::class.java.also { aClass2276 = it }))))
                            if (class318_sub1_sub3 != null && (class318_sub1_sub3.aByte8745).toInt() != 0) {
                                if ((class318_sub1_sub3.aByte8745).toInt() == 1) {
                                    var bool = i_16_ - 1 >= i_14_
                                    var bool_18_ = i_16_ + 1 <= i_15_
                                    if (!bool && i_10_ + 1 <= i_9_) {
                                        val i_19_ = (class211.aShortArray2742!![i_6_ + 1]).toInt()
                                        val i_20_ = i_7_ + (i_19_ ushr 8)
                                        val i_21_ = i_20_ + (i_19_ and 0xff)
                                        bool = i_16_ > i_20_ && i_16_ < i_21_
                                    }
                                    if (!bool_18_ && i_10_ - 1 >= i_8_) {
                                        val i_22_ = (class211.aShortArray2742!![i_6_ - 1]).toInt()
                                        val i_23_ = i_7_ + (i_22_ ushr 8)
                                        val i_24_ = i_23_ + (i_22_ and 0xff)
                                        bool_18_ = i_16_ > i_23_ && i_16_ < i_24_
                                    }
                                    if (bool && !bool_18_) i_17_ = 4
                                    else if (bool_18_ && !bool) i_17_ = 2
                                } else {
                                    var bool = i_16_ - 1 >= i_14_
                                    var bool_25_ = i_16_ + 1 <= i_15_
                                    if (!bool && i_10_ - 1 >= i_8_) {
                                        val i_26_ = (class211.aShortArray2742!![i_6_ - 1]).toInt()
                                        val i_27_ = i_7_ + (i_26_ ushr 8)
                                        val i_28_ = i_27_ + (i_26_ and 0xff)
                                        bool = i_16_ > i_27_ && i_16_ < i_28_
                                    }
                                    if (!bool_25_ && i_10_ + 1 <= i_9_) {
                                        val i_29_ = (class211.aShortArray2742!![i_6_ + 1]).toInt()
                                        val i_30_ = i_7_ + (i_29_ ushr 8)
                                        val i_31_ = i_30_ + (i_29_ and 0xff)
                                        bool_25_ = i_16_ > i_30_ && i_16_ < i_31_
                                    }
                                    if (bool && !bool_25_) i_17_ = 3
                                    else if (bool_25_ && !bool) i_17_ = 5
                                }
                            }
                            `is`[i_13_++] = i_17_
                        }
                        i_6_++
                    }
                    r.aBooleanArray9718!![i] = true
                    aa_Sub1.aSArray5191!![i_3_]!!.method3981(class348_sub1, `is`)
                }
            }
        }

        fun method1321(i: Byte, i_32_: Int, i_33_: Int, i_34_: Int, i_35_: Int, i_36_: Int): Int {
            var i_35_ = i_35_
            val i_37_ = 4 / ((-51 - i) / 63)
            anInt2273++
            if (aa_Sub1.aSArray5191 == null) return 0
            if (i_35_ < 3) {
                val i_38_ = i_32_ shr 9
                val i_39_ = i_33_ shr 9
                if (i_34_ < 0 || i_36_ < 0 || -1 + Class367_Sub4.anInt7319 < i_34_ || (i_36_ > Class348_Sub40_Sub3.anInt9109 - 1)) return 0
                if (i_38_ < 1 || i_39_ < 1 || -1 + Class367_Sub4.anInt7319 < i_38_ || -1 + Class348_Sub40_Sub3.anInt9109 < i_39_) return 0
                var bool = ((0x2 and (Class348_Sub33.aByteArrayArrayArray6962!![1]!![i_32_ shr 9]!![i_33_ shr 9]).toInt()) != 0)
                if ((i_32_ and 0x1ff) == 0) {
                    val bool_40_ = ((0x2 and (Class348_Sub33.aByteArrayArrayArray6962!![1]!![-1 + i_38_]!![i_33_ shr 9]).toInt()) != 0)
                    val bool_41_ = ((0x2 and (Class348_Sub33.aByteArrayArrayArray6962!![1]!![i_38_]!![i_33_ shr 9]).toInt()) != 0)
                    if (bool_40_ == !bool_41_) bool = (0x2 and (Class348_Sub33.aByteArrayArrayArray6962!![1]!![i_34_]!![i_36_]).toInt()) != 0
                }
                if ((i_33_ and 0x1ff) == 0) {
                    val bool_42_ = ((Class348_Sub33.aByteArrayArrayArray6962!![1]!![i_32_ shr 9]!![-1 + i_39_]).toInt() and 0x2) != 0
                    val bool_43_ = ((0x2 and (Class348_Sub33.aByteArrayArrayArray6962!![1]!![i_32_ shr 9]!![i_39_]).toInt()) != 0)
                    if (bool_42_ == !bool_43_) bool = (0x2 and (Class348_Sub33.aByteArrayArrayArray6962!![1]!![i_34_]!![i_36_]).toInt()) != 0
                }
                if (bool) i_35_++
            }
            return aa_Sub1.aSArray5191!![i_35_]!!.method3986(i_32_, i_33_, 22.toByte())
        }

        @JvmStatic
        fun method1322(i: Byte) {
            if (i.toInt() == -28) anIntArray2272 = null
        }

        @JvmStatic
        fun method1323(i: Int, i_44_: Int) {
            synchronized(Class342.aClass60_4254!!) {
                Class342.aClass60_4254!!.method578(2, i)
            }
            if (i_44_ == 26603) anInt2271++
        }
    }
}
