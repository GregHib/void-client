import Class239.Companion.method1717
import java.util.*

class Class348_Sub40_Sub22 : Class348_Sub40(0, true) {
    private var anInt9284 = 1024
    private lateinit var anIntArrayArray9286: Array<IntArray?>
    private lateinit var anIntArrayArray9287: Array<IntArray?>
    private var anInt9288 = 1024
    private var anInt9291 = 0
    private var anInt9293 = 0
    private var anInt9294 = 81
    private lateinit var anIntArray9297: IntArray
    private var anInt9298 = 0
    private var anInt9299 = 4
    private var anInt9300 = 0
    private var anInt9301 = 8
    private var anInt9302 = 409
    private var anInt9305 = 204

    private fun method3109(i: Byte) {
        anInt9289++
        val random = Random(anInt9301.toLong())
        anInt9298 = anInt9294 / 2
        anInt9291 = 4096 / anInt9299
        anInt9300 = 4096 / anInt9301
        val i_0_ = anInt9291 / 2
        anIntArray9297 = IntArray(anInt9301 + 1)
        val i_1_ = anInt9300 / 2
        anIntArrayArray9287 = Array<IntArray?>(anInt9301) { IntArray(1 + anInt9299) }
        anIntArrayArray9286 = Array<IntArray?>(anInt9301) { IntArray(anInt9299) }
        anIntArray9297[0] = 0
        if (i >= -111) method3109(67.toByte())
        for (i_2_ in 0..<anInt9301) {
            if (i_2_ > 0) {
                var i_3_ = anInt9300
                val i_4_ = ((Class124.method1097(90.toByte(), 4096, random) - 2048) * anInt9305 shr 12)
                i_3_ += i_4_ * i_1_ shr 12
                anIntArray9297[i_2_] = i_3_ + anIntArray9297[-1 + i_2_]
            }
            anIntArrayArray9287[i_2_]!![0] = 0
            var i_5_ = 0
            while (anInt9299 > i_5_) {
                if (i_5_ > 0) {
                    var i_6_ = anInt9291
                    val i_7_ = ((Class124.method1097(117.toByte(), 4096, random) - 2048) * anInt9302 shr 12)
                    i_6_ += i_0_ * i_7_ shr 12
                    anIntArrayArray9287[i_2_]!![i_5_] = anIntArrayArray9287[i_2_]!![i_5_ + -1] + i_6_
                }
                anIntArrayArray9286[i_2_]!![i_5_] = (if (anInt9284 <= 0) 4096 else (-Class124.method1097(124.toByte(), anInt9284, random) + 4096))
                i_5_++
            }
            anIntArrayArray9287[i_2_]!![anInt9299] = 4096
        }
        anIntArray9297[anInt9301] = 4096
    }

    override fun method3049(class348_sub49: Class348_Sub49, i: Int, i_8_: Int) {
        anInt9292++
        if (i_8_ != 31015) method3111(106, 16)
        val i_9_ = i
        while_189_@ do {
            while_188_@ do {
                while_187_@ do {
                    while_186_@ do {
                        while_185_@ do {
                            while_184_@ do {
                                do {
                                    if (i_9_ == 0) {
                                        anInt9299 = class348_sub49.readUnsignedByte(255)
                                        return
                                    } else if (i_9_ != 1) {
                                        if (i_9_ != 2) {
                                            if (i_9_ != 3) {
                                                if (i_9_ != 4) {
                                                    if (i_9_ != 5) {
                                                        if (i_9_ != 6) {
                                                            if (i_9_ != 7) break@while_189_
                                                        } else break@while_187_
                                                        break@while_188_
                                                    }
                                                } else break@while_185_
                                                break@while_186_
                                            }
                                        } else break
                                        break@while_184_
                                    }
                                    anInt9301 = class348_sub49.readUnsignedByte(255)
                                    return
                                } while (false)
                                anInt9302 = class348_sub49.readUnsignedShort(842397944)
                                return
                            } while (false)
                            anInt9305 = class348_sub49.readUnsignedShort(842397944)
                            return
                        } while (false)
                        anInt9288 = class348_sub49.readUnsignedShort(842397944)
                        return
                    } while (false)
                    anInt9293 = class348_sub49.readUnsignedShort(842397944)
                    return
                } while (false)
                anInt9294 = class348_sub49.readUnsignedShort(842397944)
                return
            } while (false)
            anInt9284 = class348_sub49.readUnsignedShort(i_8_ + 842366929)
        } while (false)
    }

    override fun method3042(i: Int, i_10_: Int): IntArray {
        anInt9296++
        val `is` = this.aClass191_7032!!.method1433(0, i)!!
        if (this.aClass191_7032!!.aBoolean2570) {
            var i_11_ = 0
            var i_12_: Int
            i_12_ = anInt9293 + Class239_Sub18.anIntArray6035!![i]
            while (i_12_ < 0) {
                i_12_ += 4096
            }
            while ( /**/i_12_ > 4096) {
                i_12_ -= 4096
            }
            while ( /**/i_11_ < anInt9301) {
                if (i_12_ < anIntArray9297[i_11_]) break
                i_11_++
            }
            val i_13_ = -1 + i_11_
            val bool = (0x1 and i_11_) == 0
            val i_14_ = anIntArray9297[i_11_]
            val i_15_ = anIntArray9297[i_11_ - 1]
            if (anInt9298 + i_15_ < i_12_ && i_12_ < i_14_ - anInt9298) {
                var i_16_ = 0
                while (Class348_Sub40_Sub6.Companion.anInt9139 > i_16_) {
                    var i_17_ = 0
                    val i_18_ = if (!bool) -anInt9288 else anInt9288
                    var i_19_: Int
                    i_19_ = (Class318_Sub6.anIntArray6432!![i_16_] + (i_18_ * anInt9291 shr 12))
                    while (i_19_ < 0) {
                        i_19_ += 4096
                    }
                    while ( /**/i_19_ > 4096) {
                        i_19_ -= 4096
                    }
                    while ( /**/i_17_ < anInt9299) {
                        if (anIntArrayArray9287[i_13_]!![i_17_] > i_19_) break
                        i_17_++
                    }
                    val i_20_ = i_17_ - 1
                    val i_21_ = anIntArrayArray9287[i_13_]!![i_20_]
                    val i_22_ = anIntArrayArray9287[i_13_]!![i_17_]
                    if (anInt9298 + i_21_ >= i_19_ || i_19_ >= -anInt9298 + i_22_) `is`[i_16_] = 0
                    else `is`[i_16_] = anIntArrayArray9286[i_13_]!![i_20_]
                    i_16_++
                }
            } else Class214.method1579(`is`, 0, Class348_Sub40_Sub6.Companion.anInt9139, 0)
        }
        if (i_10_ != 255) method3110(44)
        return `is`
    }

    override fun method3044(i: Int) {
        if (i <= 108) method3111(-110, -119)
        anInt9295++
        method3109((-125).toByte())
    }

    companion object {
        @JvmField
        var aClass114_9285: Class114? = Class114(104, 1)
        @JvmField
        var anInt9289: Int = 0
        @JvmField
        var anInt9290: Int = 0
        @JvmField
        var anInt9292: Int = 0
        @JvmField
        var anInt9295: Int = 0
        @JvmField
        var anInt9296: Int = 0
        var aClass304_9303: Class304? = Class304(1)
        @JvmField
        var aClass351_9304: Class351? = Class351(20, -1)
        @JvmStatic
        fun method3110(i: Int) {
            aClass351_9304 = null
            aClass304_9303 = null
            if (i != -1633784916) aClass304_9303 = null
            aClass114_9285 = null
        }

        @JvmStatic
        fun method3111(i: Int, i_23_: Int) {
            anInt9290++
            if (i_23_ != Class348_Sub15.anInt6769) {
                if (i < 18) aClass304_9303 = null
                Class348_Sub40_Sub3.Companion.anInt9109 = Class73.anIntArray4780!![i_23_]
                Class367_Sub4.anInt7319 = Class348_Sub40_Sub3.Companion.anInt9109
                Class290.method2196((-9).toByte())
                Class62.anIntArrayArrayArray1116 = (Array<Array<IntArray?>?>(4) { Array<IntArray?>(Class367_Sub4.anInt7319 shr 3) { IntArray(Class348_Sub40_Sub3.Companion.anInt9109 shr 3) } })
                Class239_Sub8.anIntArrayArray5921 = (Array<IntArray?>(Class367_Sub4.anInt7319) { IntArray(Class348_Sub40_Sub3.Companion.anInt9109) })
                Class348_Sub42_Sub17.anIntArrayArray9678 = (Array<IntArray?>(Class367_Sub4.anInt7319) { IntArray(Class348_Sub40_Sub3.Companion.anInt9109) })
                for (i_24_ in 0..3) Class348_Sub45.aClass361Array7108!![i_24_] = Class105_Sub1.method988(Class348_Sub40_Sub3.Companion.anInt9109, 1, Class367_Sub4.anInt7319)
                Class289.aByteArrayArrayArray3700 = (Array<Array<ByteArray?>?>(4) { Array<ByteArray?>(Class367_Sub4.anInt7319) { ByteArray(Class348_Sub40_Sub3.Companion.anInt9109) } })
                method1717(19278, Class348_Sub40_Sub3.Companion.anInt9109, Class367_Sub4.anInt7319, 4)
                Class97.method873(Class367_Sub4.anInt7319 shr 3, 21719, Class348_Sub8.aHa6654, Class348_Sub40_Sub3.Companion.anInt9109 shr 3)
                Class348_Sub15.anInt6769 = i_23_
            }
        }
    }
}
