import Class215.method1582
import Class273.Companion.method2057
import Class369_Sub1.Companion.method3570

/* Class296 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class296 internal constructor(`is`: ByteArray) {
    private val anIntArray3766: IntArray
    private val aByteArray3769: ByteArray
    private var anIntArray3774: IntArray?
    fun method2226(`is`: ByteArray?, i: Int, is_3_: ByteArray?, i_4_: Int, i_5_: Int, i_6_: Int): Int {
        var i_4_ = i_4_
        var i_6_ = i_6_
        try {
            anInt3770++
            if (i_4_ == 0) return 0
            i_4_ += i_6_
            var i_7_ = 0
            if (i_5_ != -1) anIntArray3774 = null
            var i_8_ = i
            while (true) {
                val i_9_ = is_3_!![i_8_]
                if (i_9_ >= 0) i_7_++
                else i_7_ = anIntArray3774!![i_7_]
                var i_10_: Int
                if ((anIntArray3774!![i_7_].also { i_10_ = it }) < 0) {
                    `is`!![i_6_++] = (i_10_.inv()).toByte()
                    if (i_4_ <= i_6_) break
                    i_7_ = 0
                }
                if ((0x40 and i_9_.toInt()) != 0) i_7_ = anIntArray3774!![i_7_]
                else i_7_++
                if ((anIntArray3774!![i_7_].also { i_10_ = it }) < 0) {
                    `is`!![i_6_++] = (i_10_.inv()).toByte()
                    if (i_6_ >= i_4_) break
                    i_7_ = 0
                }
                if ((0x20 and i_9_.toInt()) == 0) i_7_++
                else i_7_ = anIntArray3774!![i_7_]
                if ((anIntArray3774!![i_7_].also { i_10_ = it }) < 0) {
                    `is`!![i_6_++] = (i_10_.inv()).toByte()
                    if (i_6_ >= i_4_) break
                    i_7_ = 0
                }
                if ((i_9_.toInt() and 0x10) == 0) i_7_++
                else i_7_ = anIntArray3774!![i_7_]
                if ((anIntArray3774!![i_7_].also { i_10_ = it }) < 0) {
                    `is`!![i_6_++] = (i_10_.inv()).toByte()
                    if (i_6_ >= i_4_) break
                    i_7_ = 0
                }
                if ((0x8 and i_9_.toInt()) == 0) i_7_++
                else i_7_ = anIntArray3774!![i_7_]
                if ((anIntArray3774!![i_7_].also { i_10_ = it }) < 0) {
                    `is`!![i_6_++] = (i_10_.inv()).toByte()
                    if (i_4_ <= i_6_) break
                    i_7_ = 0
                }
                if ((i_9_.toInt() and 0x4) != 0) i_7_ = anIntArray3774!![i_7_]
                else i_7_++
                if ((anIntArray3774!![i_7_].also { i_10_ = it }) < 0) {
                    `is`!![i_6_++] = (i_10_.inv()).toByte()
                    if (i_4_ <= i_6_) break
                    i_7_ = 0
                }
                if ((i_9_.toInt() and 0x2) == 0) i_7_++
                else i_7_ = anIntArray3774!![i_7_]
                if ((anIntArray3774!![i_7_].also { i_10_ = it }) < 0) {
                    `is`!![i_6_++] = (i_10_.inv()).toByte()
                    if (i_4_ <= i_6_) break
                    i_7_ = 0
                }
                if ((i_9_.toInt() and 0x1) != 0) i_7_ = anIntArray3774!![i_7_]
                else i_7_++
                if ((anIntArray3774!![i_7_].also { i_10_ = it }) < 0) {
                    `is`!![i_6_++] = (i_10_.inv()).toByte()
                    if (i_6_ >= i_4_) break
                    i_7_ = 0
                }
                i_8_++
            }
            return i_8_ + 1 + -i
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("wda.A(" + (if (`is` != null) "{...}" else "null") + ',' + i + ',' + (if (is_3_ != null) "{...}" else "null") + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ')'))
        }
    }

    fun method2227(i: Int, i_11_: Int, i_12_: Int, `is`: ByteArray?, i_13_: Int, is_14_: ByteArray?): Int {
        var i = i
        var i_11_ = i_11_
        try {
            anInt3771++
            var i_15_ = 0
            i += i_11_
            var i_16_ = i_12_ shl 3
            if (i_13_ <= 14) method2226(null, 61, null, 89, 122, 10)
            while ( /**/i > i_11_) {
                val i_17_ = 0xff and `is`!![i_11_].toInt()
                val i_18_ = anIntArray3766[i_17_]
                val i_19_ = aByteArray3769[i_17_].toInt()
                if (i_19_ == 0) throw RuntimeException("No codeword for data value " + i_17_)
                var i_20_ = i_16_ shr 3
                var i_21_ = i_16_ and 0x7
                i_15_ = i_15_ and (-i_21_ shr 31)
                val i_22_ = (i_21_ - -i_19_ + -1 shr 3) + i_20_
                i_16_ += i_19_
                i_21_ += 24
                is_14_!![i_20_] = (method2057(i_15_, i_18_ ushr i_21_).also { i_15_ = it }).toByte()
                if (i_22_ > i_20_) {
                    i_20_++
                    i_21_ -= 8
                    is_14_[i_20_] = ((i_18_ ushr i_21_).also { i_15_ = it }).toByte()
                    if (i_20_ < i_22_) {
                        i_20_++
                        i_21_ -= 8
                        is_14_[i_20_] = ((i_18_ ushr i_21_).also { i_15_ = it }).toByte()
                        if (i_22_ > i_20_) {
                            i_21_ -= 8
                            i_20_++
                            is_14_[i_20_] = ((i_18_ ushr i_21_).also { i_15_ = it }).toByte()
                            if (i_20_ < i_22_) {
                                i_21_ -= 8
                                i_20_++
                                is_14_[i_20_] = ((i_18_ shl -i_21_).also { i_15_ = it }).toByte()
                            }
                        }
                    }
                }
                i_11_++
            }
            return -i_12_ + (i_16_ - -7 shr 3)
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("wda.C(" + i + ',' + i_11_ + ',' + i_12_ + ',' + (if (`is` != null) "{...}" else "null") + ',' + i_13_ + ',' + (if (is_14_ != null) "{...}" else "null") + ')'))
        }
    }

    init {
        val i = `is`.size
        anIntArray3766 = IntArray(i)
        aByteArray3769 = `is`
        anIntArray3774 = IntArray(8)
        val is_23_ = IntArray(33)
        var i_24_ = 0
        for (i_25_ in 0..<i) {
            val i_26_ = `is`[i_25_].toInt()
            if (i_26_ != 0) {
                val i_27_ = 1 shl 32 - i_26_
                val i_28_ = is_23_[i_26_]
                anIntArray3766[i_25_] = i_28_
                val i_29_: Int
                if ((i_27_ and i_28_) == 0) {
                    for (i_30_ in -1 + i_26_ downTo 1) {
                        val i_31_ = is_23_[i_30_]
                        if (i_31_ != i_28_) break
                        val i_32_ = 1 shl 32 + -i_30_
                        if ((i_31_ and i_32_) != 0) {
                            is_23_[i_30_] = is_23_[i_30_ - 1]
                            break
                        }
                        is_23_[i_30_] = method2057(i_31_, i_32_)
                    }
                    i_29_ = i_27_ or i_28_
                } else i_29_ = is_23_[-1 + i_26_]
                is_23_[i_26_] = i_29_
                for (i_33_ in i_26_ + 1..32) {
                    if (i_28_ == is_23_[i_33_]) is_23_[i_33_] = i_29_
                }
                var i_34_ = 0
                for (i_35_ in 0..<i_26_) {
                    var i_36_ = -2147483648 ushr i_35_
                    if ((i_28_ and i_36_) == 0) i_34_++
                    else {
                        if (anIntArray3774!![i_34_] == 0) anIntArray3774!![i_34_] = i_24_
                        i_34_ = anIntArray3774!![i_34_]
                    }
                    i_36_ = i_36_ ushr 1
                    if (anIntArray3774!!.size <= i_34_) {
                        val is_37_ = IntArray(anIntArray3774!!.size * 2)
                        var i_38_ = 0
                        while (anIntArray3774!!.size > i_38_) {
                            is_37_[i_38_] = anIntArray3774!![i_38_]
                            i_38_++
                        }
                        anIntArray3774 = is_37_
                    }
                }
                anIntArray3774!![i_34_] = i_25_.inv()
                if (i_34_ >= i_24_) i_24_ = 1 + i_34_
            }
        }
    }

    companion object {
        var anInt3765: Int = 0
        var aBoolean3767: Boolean = false
        @JvmField
        var anInt3768: Int = 0
        var anInt3770: Int = 0
        var anInt3771: Int = 0
        var anInt3772: Int = 0
        var aClass114_3773: Class114? = Class114(55, 0)
        var anInt3775: Int = 0

        fun method2224(i: Int, i_0_: Byte, i_1_: Int): Boolean {
            val i_2_ = 41 / ((59 - i_0_) / 37)
            anInt3765++
            return (i and 0x800) != 0
        }

        @JvmStatic
        fun method2225(i: Int) {
            if (i != 32) aClass114_3773 = null
            aClass114_3773 = null
        }

        @JvmStatic
        fun method2228(i: Int) {
            if (i == 0) {
                method1582(7851)
                anInt3772++
                method3570(false)
            }
        }
    }
}
