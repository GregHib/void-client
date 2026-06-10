import Class239_Sub25.Companion.method1827
import Class348_Sub6.Companion.method2770

/* Class59_Sub2_Sub1 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class59_Sub2_Sub1 : Class59_Sub2(12, 5, 16, 2, 2, 0.45f) {
    private lateinit var aByteArray8674: ByteArray

    override fun method563(i: Byte, i_27_: Int, i_28_: Byte) {
        var i_28_ = i_28_
        if (i > 79) {
            anInt8669++
            i_28_ = (((i_28_.toInt() and 0xff) shr 1) + 127).toByte()
            var i_29_ = 2 * i_27_
            aByteArray8674[i_29_++] = i_28_
            aByteArray8674[i_29_] = i_28_
        }
    }

    fun method567(i: Int, i_30_: Byte, i_31_: Int, i_32_: Int): ByteArray {
        anInt8672++
        aByteArray8674 = ByteArray(2 * i_32_ * i * i_31_)
        this.method542(i, i_32_, 0, i_31_)
        val i_33_ = -61 % ((70 - i_30_) / 37)
        return aByteArray8674
    }

    companion object {
        @JvmField
        var aClass45_8667: Class45? = null
        @JvmField
        var anInt8668: Int = 0
        @JvmField
        var anInt8669: Int = 0
        @JvmField
        var aClass45_8670: Class45? = null
        @JvmField
        var anInt8671: Int = 0
        @JvmField
        var anInt8672: Int = 0
        @JvmField
        var anInt8673: Int = 0
        @JvmStatic
        fun method565(i: Int, i_0_: Int, class124: Class124?, `is`: IntArray?): Class358 {
            try {
                anInt8673++
                var is_1_: IntArray? = null
                if (i != 255) aClass45_8670 = null
                var is_2_: IntArray? = null
                var is_3_: IntArray? = null
                var fs: Array<FloatArray?>? = null
                if (class124!!.aByteArray1820 != null) {
                    val i_4_ = class124.anInt1818
                    val is_5_ = IntArray(i_4_)
                    val is_6_ = IntArray(i_4_)
                    val is_7_ = IntArray(i_4_)
                    val is_8_ = IntArray(i_4_)
                    val is_9_ = IntArray(i_4_)
                    val is_10_ = IntArray(i_4_)
                    for (i_11_ in 0..<i_4_) {
                        is_5_[i_11_] = 2147483647
                        is_6_[i_11_] = -2147483647
                        is_7_[i_11_] = 2147483647
                        is_8_[i_11_] = -2147483647
                        is_9_[i_11_] = 2147483647
                        is_10_[i_11_] = -2147483647
                    }
                    fs = arrayOfNulls<FloatArray>(i_4_)
                    is_3_ = IntArray(i_4_)
                    is_2_ = IntArray(i_4_)
                    for (i_12_ in 0..<i_0_) {
                        val i_13_ = `is`!![i_12_]
                        if (class124.aByteArray1820!![i_13_].toInt() != -1) {
                            val i_14_ = (class124.aByteArray1820!![i_13_].toInt() and 0xff)
                            for (i_15_ in 0..2) {
                                val i_16_: Short
                                if (i_15_ != 0) {
                                    if (i_15_ == 1) i_16_ = (class124.aShortArray1835!![i_13_])
                                    else i_16_ = (class124.aShortArray1855[i_13_])
                                } else i_16_ = (class124.aShortArray1863[i_13_])
                                val i_17_ = class124.anIntArray1841[i_16_.toInt()]
                                val i_18_ = class124.anIntArray1847[i_16_.toInt()]
                                val i_19_ = class124.anIntArray1852[i_16_.toInt()]
                                if (i_17_ < is_5_[i_14_]) is_5_[i_14_] = i_17_
                                if (is_6_[i_14_] < i_17_) is_6_[i_14_] = i_17_
                                if (is_7_[i_14_] > i_18_) is_7_[i_14_] = i_18_
                                if (i_18_ > is_8_[i_14_]) is_8_[i_14_] = i_18_
                                if (i_19_ < is_9_[i_14_]) is_9_[i_14_] = i_19_
                                if (i_19_ > is_10_[i_14_]) is_10_[i_14_] = i_19_
                            }
                        }
                    }
                    is_1_ = IntArray(i_4_)
                    var i_20_ = 0
                    while (i_4_ > i_20_) {
                        val i_21_ = class124.aByteArray1823[i_20_]
                        if (i_21_ > 0) {
                            is_1_[i_20_] = (is_6_[i_20_] + is_5_[i_20_]) / 2
                            is_2_[i_20_] = (is_8_[i_20_] + is_7_[i_20_]) / 2
                            is_3_[i_20_] = (is_9_[i_20_] + is_10_[i_20_]) / 2
                            val f: Float
                            val f_22_: Float
                            val f_23_: Float
                            if (i_21_.toInt() == 1) {
                                val i_24_ = class124.anIntArray1859!![i_20_]
                                if (i_24_ == 0) {
                                    f_22_ = 1.0f
                                    f_23_ = 1.0f
                                } else if (i_24_ <= 0) {
                                    f_22_ = 1.0f
                                    f_23_ = -i_24_.toFloat() / 1024.0f
                                } else {
                                    f_23_ = 1.0f
                                    f_22_ = i_24_.toFloat() / 1024.0f
                                }
                                f = 64.0f / (class124.anIntArray1816[i_20_]).toFloat()
                            } else if (i_21_.toInt() == 2) {
                                f = 64.0f / (class124.anIntArray1816[i_20_]).toFloat()
                                f_22_ = 64.0f / (class124.anIntArray1844[i_20_]).toFloat()
                                f_23_ = 64.0f / (class124.anIntArray1859!![i_20_]).toFloat()
                            } else {
                                f = (class124.anIntArray1816[i_20_]).toFloat() / 1024.0f
                                f_22_ = (class124.anIntArray1844[i_20_]).toFloat() / 1024.0f
                                f_23_ = (class124.anIntArray1859!![i_20_]).toFloat() / 1024.0f
                            }
                            fs[i_20_] = (Class175.method1347(class124.aShortArray1825[i_20_].toInt(), class124.aShortArray1849[i_20_].toInt(), f_22_, f_23_, 126, f, class124.aShortArray1829[i_20_].toInt(), Class139.method1166(255, (class124.aByteArray1833[i_20_]).toInt())))
                        }
                        i_20_++
                    }
                }
                return Class358(is_1_, is_2_, is_3_, fs)
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, ("dha.B(" + i + ',' + i_0_ + ',' + (if (class124 != null) "{...}" else "null") + ',' + (if (`is` != null) "{...}" else "null") + ')'))
            }
        }

        @JvmStatic
        fun method566(bool: Boolean, bool_25_: Boolean, i: Byte) {
            anInt8671++
            val i_26_ = -94 / ((-67 - i) / 59)
            if (bool) {
                Class348_Sub40_Sub26.anInt9346++
                method1827(1415665776)
            }
            if (bool_25_) {
                Class26.anInt383++
                method2770(2)
            }
        }

        @JvmStatic
        fun method568(bool: Boolean) {
            aClass45_8670 = null
            aClass45_8667 = null
            if (bool != true) aClass45_8670 = null
        }
    }
}
