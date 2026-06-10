import Class156.Companion.method1242
import Class273.Companion.method2057
import Class275.method2064
import Class367_Sub4.Companion.method3542
import Class50_Sub1.Companion.method462

/* Class348_Sub42_Sub11 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class348_Sub42_Sub11 : Class348_Sub42() {
    var anIntArray9580: IntArray? = null
    lateinit var aCharArray9582: CharArray
    var aString9587: String? = null
    lateinit var aCharArray9588: CharArray
    var anIntArray9592: IntArray? = null

    fun method3221(i: Int, class348_sub49: Class348_Sub49) {
        val i_0_ = 81 / ((-39 - i) / 52)
        anInt9583++
        while (true) {
            val i_1_ = class348_sub49.readUnsignedByte(255)
            if (i_1_ == 0) break
            method3227(-5847, class348_sub49, i_1_)
        }
    }

    fun method3222(i: Byte, c: Char): Int {
        anInt9585++
        if (this.anIntArray9580 == null) return -1
        var i_2_ = 0
        while ( /**/this.anIntArray9580!!.size > i_2_) {
            if (this.aCharArray9582[i_2_] == c) return this.anIntArray9580!![i_2_]
            i_2_++
        }
        return -1
    }

    fun method3224(i: Byte) {
        if (this.anIntArray9580 != null) {
            var i_3_ = 0
            while ((this.anIntArray9580!!.size > i_3_)) {
                this.anIntArray9580!![i_3_] = method2057((this.anIntArray9580!![i_3_]), 32768)
                i_3_++
            }
        }
        anInt9579++
        if (this.anIntArray9592 != null) {
            var i_4_ = 0
            while ((this.anIntArray9592!!.size > i_4_)) {
                this.anIntArray9592!![i_4_] = method2057((this.anIntArray9592!![i_4_]), 32768)
                i_4_++
            }
        }
        if (i <= 102) method3222(78.toByte(), '\uffc1')
    }

    fun method3226(c: Char, i: Int): Int {
        anInt9584++
        if (this.anIntArray9592 == null) return -1
        var i_23_ = 0
        while (this.anIntArray9592!!.size > i_23_) {
            if (this.aCharArray9588[i_23_] == c) return this.anIntArray9592!![i_23_]
            i_23_++
        }
        return -1
    }

    private fun method3227(i: Int, class348_sub49: Class348_Sub49, i_24_: Int) {
        if (i_24_ != 1) {
            if (i_24_ == 2) {
                val i_25_ = class348_sub49.readUnsignedByte(255)
                this.anIntArray9592 = IntArray(i_25_)
                this.aCharArray9588 = CharArray(i_25_)
                for (i_26_ in 0..<i_25_) {
                    this.anIntArray9592!![i_26_] = class348_sub49.readUnsignedShort(842397944)
                    val i_27_ = class348_sub49.readByte(-121)
                    this.aCharArray9588[i_26_] = (if (i_27_.toInt() != 0) method462(i_27_, -128) else '\u0000')
                }
            } else if (i_24_ == 3) {
                val i_28_ = class348_sub49.readUnsignedByte(255)
                this.aCharArray9582 = CharArray(i_28_)
                this.anIntArray9580 = IntArray(i_28_)
                var i_29_ = 0
                while (i_28_ > i_29_) {
                    this.anIntArray9580!![i_29_] = class348_sub49.readUnsignedShort(842397944)
                    val i_30_ = class348_sub49.readByte(-115)
                    this.aCharArray9582[i_29_] = (if (i_30_.toInt() != 0) method462(i_30_, -128) else '\u0000')
                    i_29_++
                }
            }
        } else this.aString9587 = class348_sub49.readString(100.toByte())
        if (i != -5847) anInt9586 = 12
        anInt9581++
    }

    companion object {
        var anInt9579: Int = 0
        var anInt9581: Int = 0
        var anInt9583: Int = 0
        var anInt9584: Int = 0
        var anInt9585: Int = 0
        var anInt9586: Int = 0
        var anInt9589: Int = 0
        var aClass351_9590: Class351? = Class351(83, -1)
        var anInt9591: Int = -1
        @JvmStatic
        fun method3220(i: Byte) {
            if (i < 96) anInt9591 = 45
            aClass351_9590 = null
        }

        fun method3223() {
            for (i in 0..<Class86.anInt1477) {
                val class318_sub1_sub3 = Class24.aClass318_Sub1_Sub3Array357!![i]!!
                Class348_Sub46.method3320(class318_sub1_sub3, true)
                Class24.aClass318_Sub1_Sub3Array357!![i] = null
            }
            Class86.anInt1477 = 0
        }

        fun method3225(i: Int) {
            anInt9589++
            if (Class316.aClass348_Sub51_3959!!.aClass239_Sub14_7264!!.method1778(-32350) == 2) {
                val i_5_ = (0xff and -4 + Class239_Sub15.anInt6006).toByte()
                val i_6_ = Class239_Sub15.anInt6006 % Class367_Sub4.anInt7319
                for (i_7_ in 0..3) {
                    var i_8_ = 0
                    while (Class348_Sub40_Sub3.anInt9109 > i_8_) {
                        Class289.aByteArrayArrayArray3700!![i_7_]!![i_6_]!![i_8_] = i_5_
                        i_8_++
                    }
                }
                if (Class355.anInt4372 != 3) {
                    for (i_9_ in 0..1) {
                        Class327.anIntArray4097!![i_9_] = -1000000
                        Class156.anIntArray2117!![i_9_] = 1000000
                        Class348_Sub40_Sub19.anIntArray9259!![i_9_] = 0
                        Class64.anIntArray1127!![i_9_] = 1000000
                        Class56.anIntArray1045!![i_9_] = 0
                    }
                    var i_10_ = (Class132.aPlayer_1907!!.x)
                    var i_11_ = (Class132.aPlayer_1907!!.y)
                    if (i >= 100) {
                        if (Class348_Sub40_Sub21.anInt9282 == 1 || Class9.anInt167 != -1) {
                            if (Class348_Sub40_Sub21.anInt9282 != 1) {
                                i_11_ = Class318_Sub1_Sub5_Sub2.anInt10163
                                i_10_ = Class9.anInt167
                            }
                            if ((0x4 and (Class348_Sub33.aByteArrayArrayArray6962!![Class355.anInt4372]!![i_10_ shr 9]!![i_11_ shr 9]).toInt()) != 0) method3542(i_11_ shr 9, Class147.aClass357ArrayArrayArray2029, i_10_ shr 9, 0, 0, false)
                            if (Class348_Sub42_Sub19.Companion.anInt9701 < 2560) {
                                var i_12_ = Class286_Sub4.anInt6246 shr 9
                                var i_13_ = Class59_Sub2_Sub2.anInt8685 shr 9
                                val i_14_ = i_10_ shr 9
                                val i_15_ = i_11_ shr 9
                                val i_16_: Int
                                if (i_14_ > i_12_) i_16_ = i_14_ + -i_12_
                                else i_16_ = i_12_ + -i_14_
                                val i_17_: Int
                                if (i_15_ <= i_13_) i_17_ = -i_15_ + i_13_
                                else i_17_ = i_15_ + -i_13_
                                if (i_16_ == 0 && i_17_ == 0 || -Class367_Sub4.anInt7319 >= i_16_ || (Class367_Sub4.anInt7319 <= i_16_) || i_17_ <= -Class348_Sub40_Sub3.anInt9109 || Class348_Sub40_Sub3.anInt9109 <= i_17_) method1242(("RC: " + i_12_ + "," + i_13_ + " " + i_14_ + "," + i_15_ + " " + za_Sub2.regionTileX + "," + Class90.regionTileY), null, 15004)
                                else if (i_16_ <= i_17_) {
                                    val i_18_ = i_16_ * 65536 / i_17_
                                    var i_19_ = 32768
                                    while (i_15_ != i_13_) {
                                        if (i_15_ > i_13_) i_13_++
                                        else if (i_15_ < i_13_) i_13_--
                                        if ((0x4 and (Class348_Sub33.aByteArrayArrayArray6962!![Class355.anInt4372]!![i_12_]!![i_13_]).toInt()) != 0) {
                                            method3542(i_13_, (Class147.aClass357ArrayArrayArray2029), i_12_, 0, 1, false)
                                            break
                                        }
                                        i_19_ += i_18_
                                        if (i_19_ >= 65536) {
                                            if (i_12_ < i_14_) i_12_++
                                            else if (i_14_ < i_12_) i_12_--
                                            i_19_ -= 65536
                                            if ((0x4 and (Class348_Sub33.aByteArrayArrayArray6962!![Class355.anInt4372]!![i_12_]!![i_13_]).toInt()) != 0) {
                                                method3542(i_13_, (Class147.aClass357ArrayArrayArray2029), i_12_, 0, 1, false)
                                                break
                                            }
                                        }
                                    }
                                } else {
                                    val i_20_ = 65536 * i_17_ / i_16_
                                    var i_21_ = 32768
                                    while (i_14_ != i_12_) {
                                        if (i_12_ >= i_14_) {
                                            if (i_12_ > i_14_) i_12_--
                                        } else i_12_++
                                        if ((0x4 and (Class348_Sub33.aByteArrayArrayArray6962!![Class355.anInt4372]!![i_12_]!![i_13_]).toInt()) != 0) {
                                            method3542(i_13_, (Class147.aClass357ArrayArrayArray2029), i_12_, 0, 1, false)
                                            break
                                        }
                                        i_21_ += i_20_
                                        if (i_21_ >= 65536) {
                                            if (i_15_ > i_13_) i_13_++
                                            else if (i_13_ > i_15_) i_13_--
                                            i_21_ -= 65536
                                            if ((0x4 and (Class348_Sub33.aByteArrayArrayArray6962!![Class355.anInt4372]!![i_12_]!![i_13_]).toInt()) != 0) {
                                                method3542(i_13_, (Class147.aClass357ArrayArrayArray2029), i_12_, 0, 1, false)
                                                break
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            val i_22_ = method2064(Class286_Sub4.anInt6246, Class355.anInt4372, 11219, Class59_Sub2_Sub2.anInt8685)
                            if (i_22_ - Class305.anInt3855 < 3200 && ((Class348_Sub33.aByteArrayArrayArray6962!![Class355.anInt4372]!![Class286_Sub4.anInt6246 shr 9]!![Class59_Sub2_Sub2.anInt8685 shr 9]).toInt() and 0x4) != 0) method3542(Class59_Sub2_Sub2.anInt8685 shr 9, Class147.aClass357ArrayArrayArray2029, Class286_Sub4.anInt6246 shr 9, 0, 1, false)
                        }
                    }
                }
            }
        }
    }
}
