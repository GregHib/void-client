/* Class348_Sub2 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class348_Sub2 private constructor(class348_sub49: Class348_Sub49) : Class348() {
    @JvmField
    var aByteArray6564: ByteArray?
    @JvmField
    var aClass356_6565: Class356? = null

    fun method2733() {
        if (this.aClass356_6565 == null) {
            this.aClass356_6565 = Class356(16)
            val `is` = IntArray(16)
            val is_0_ = IntArray(16)
            is_0_[9] = 128
            `is`[9] = is_0_[9]
            val class204 = Class204(this.aByteArray6564)
            val i = class204.method1483()
            for (i_1_ in 0..<i) {
                class204.method1492(i_1_)
                class204.method1485(i_1_)
                class204.method1486(i_1_)
            }
            while_123_@ while (true) {
                val i_2_ = class204.method1490()
                val i_3_ = class204.anIntArray2681!![i_2_]
                while (class204.anIntArray2681!![i_2_] == i_3_) {
                    class204.method1492(i_2_)
                    val i_4_ = class204.method1494(i_2_)
                    if (i_4_ == 1) {
                        class204.method1495()
                        class204.method1486(i_2_)
                        if (!class204.method1480()) break
                        break@while_123_
                    }
                    val i_5_ = i_4_ and 0xf0
                    if (i_5_ == 176) {
                        val i_6_ = i_4_ and 0xf
                        val i_7_ = i_4_ shr 8 and 0x7f
                        val i_8_ = i_4_ shr 16 and 0x7f
                        if (i_7_ == 0) `is`[i_6_] = (`is`[i_6_] and 0x1fc000.inv()) + (i_8_ shl 14)
                        if (i_7_ == 32) `is`[i_6_] = (`is`[i_6_] and 0x3f80.inv()) + (i_8_ shl 7)
                    }
                    if (i_5_ == 192) {
                        val i_9_ = i_4_ and 0xf
                        val i_10_ = i_4_ shr 8 and 0x7f
                        is_0_[i_9_] = `is`[i_9_] + i_10_
                    }
                    if (i_5_ == 144) {
                        val i_11_ = i_4_ and 0xf
                        val i_12_ = i_4_ shr 8 and 0x7f
                        val i_13_ = i_4_ shr 16 and 0x7f
                        if (i_13_ > 0) {
                            val i_14_ = is_0_[i_11_]
                            var class348_sub8 = (this.aClass356_6565!!.method3480(i_14_.toLong(), -6008) as? Class348_Sub8?)
                            if (class348_sub8 == null) {
                                class348_sub8 = Class348_Sub8(ByteArray(128))
                                this.aClass356_6565!!.method3483(21.toByte(), i_14_.toLong(), class348_sub8)
                            }
                            class348_sub8.aByteArray6657!![i_12_] = 1.toByte()
                        }
                    }
                    class204.method1485(i_2_)
                    class204.method1486(i_2_)
                }
            }
        }
    }

    fun method2735() {
        this.aClass356_6565 = null
    }

    init {
        class348_sub49.anInt7197 = class348_sub49.aByteArray7154!!.size - 3
        val i = class348_sub49.readUnsignedByte(255)
        val i_16_ = class348_sub49.readUnsignedShort(842397944)
        var i_17_ = 14 + i * 10
        class348_sub49.anInt7197 = 0
        var i_18_ = 0
        var i_19_ = 0
        var i_20_ = 0
        var i_21_ = 0
        var i_22_ = 0
        var i_23_ = 0
        var i_24_ = 0
        var i_25_ = 0
        while_121_@ for (i_26_ in 0..<i) {
            var i_27_ = -1
            while (true) {
                val i_28_ = class348_sub49.readUnsignedByte(255)
                if (i_28_ != i_27_) i_17_++
                i_27_ = i_28_ and 0xf
                if (i_28_ == 7) continue@while_121_
                if (i_28_ == 23) i_18_++
                else if (i_27_ == 0) i_20_++
                else if (i_27_ == 1) i_21_++
                else if (i_27_ == 2) i_19_++
                else if (i_27_ == 3) i_22_++
                else if (i_27_ == 4) i_23_++
                else if (i_27_ == 5) i_24_++
                else {
                    if (i_27_ != 6) break
                    i_25_++
                }
            }
            throw RuntimeException()
        }
        i_17_ += 5 * i_18_
        i_17_ += 2 * (i_20_ + i_21_ + i_19_ + i_22_ + i_24_)
        i_17_ += i_23_ + i_25_
        val i_29_ = class348_sub49.anInt7197
        val i_30_ = (i + i_18_ + i_19_ + i_20_ + i_21_ + i_22_ + i_23_ + i_24_ + i_25_)
        for (i_31_ in 0..<i_30_) class348_sub49.method3366(111.toByte())
        i_17_ += class348_sub49.anInt7197 - i_29_
        var i_32_ = class348_sub49.anInt7197
        var i_33_ = 0
        var i_34_ = 0
        var i_35_ = 0
        var i_36_ = 0
        var i_37_ = 0
        var i_38_ = 0
        var i_39_ = 0
        var i_40_ = 0
        var i_41_ = 0
        var i_42_ = 0
        var i_43_ = 0
        var i_44_ = 0
        var i_45_ = 0
        for (i_46_ in 0..<i_19_) {
            i_45_ = i_45_ + class348_sub49.readUnsignedByte(255) and 0x7f
            if (i_45_ == 0 || i_45_ == 32) i_25_++
            else if (i_45_ == 1) i_33_++
            else if (i_45_ == 33) i_34_++
            else if (i_45_ == 7) i_35_++
            else if (i_45_ == 39) i_36_++
            else if (i_45_ == 10) i_37_++
            else if (i_45_ == 42) i_38_++
            else if (i_45_ == 99) i_39_++
            else if (i_45_ == 98) i_40_++
            else if (i_45_ == 101) i_41_++
            else if (i_45_ == 100) i_42_++
            else if (i_45_ == 64 || i_45_ == 65 || i_45_ == 120 || i_45_ == 121 || i_45_ == 123) i_43_++
            else i_44_++
        }
        var i_47_ = 0
        var i_48_ = class348_sub49.anInt7197
        class348_sub49.anInt7197 += i_43_
        var i_49_ = class348_sub49.anInt7197
        class348_sub49.anInt7197 += i_24_
        var i_50_ = class348_sub49.anInt7197
        class348_sub49.anInt7197 += i_23_
        var i_51_ = class348_sub49.anInt7197
        class348_sub49.anInt7197 += i_22_
        var i_52_ = class348_sub49.anInt7197
        class348_sub49.anInt7197 += i_33_
        var i_53_ = class348_sub49.anInt7197
        class348_sub49.anInt7197 += i_35_
        var i_54_ = class348_sub49.anInt7197
        class348_sub49.anInt7197 += i_37_
        var i_55_ = class348_sub49.anInt7197
        class348_sub49.anInt7197 += i_20_ + i_21_ + i_24_
        var i_56_ = class348_sub49.anInt7197
        class348_sub49.anInt7197 += i_20_
        var i_57_ = class348_sub49.anInt7197
        class348_sub49.anInt7197 += i_44_
        var i_58_ = class348_sub49.anInt7197
        class348_sub49.anInt7197 += i_21_
        var i_59_ = class348_sub49.anInt7197
        class348_sub49.anInt7197 += i_34_
        var i_60_ = class348_sub49.anInt7197
        class348_sub49.anInt7197 += i_36_
        var i_61_ = class348_sub49.anInt7197
        class348_sub49.anInt7197 += i_38_
        var i_62_ = class348_sub49.anInt7197
        class348_sub49.anInt7197 += i_25_
        var i_63_ = class348_sub49.anInt7197
        class348_sub49.anInt7197 += i_22_
        var i_64_ = class348_sub49.anInt7197
        class348_sub49.anInt7197 += i_39_
        var i_65_ = class348_sub49.anInt7197
        class348_sub49.anInt7197 += i_40_
        var i_66_ = class348_sub49.anInt7197
        class348_sub49.anInt7197 += i_41_
        var i_67_ = class348_sub49.anInt7197
        class348_sub49.anInt7197 += i_42_
        var i_68_ = class348_sub49.anInt7197
        class348_sub49.anInt7197 += i_18_ * 3
        this.aByteArray6564 = ByteArray(i_17_)
        val class348_sub49_69_ = Class348_Sub49(this.aByteArray6564)
        class348_sub49_69_.writeInt(124.toByte(), 1297377380)
        class348_sub49_69_.writeInt(89.toByte(), 6)
        class348_sub49_69_.writeShort(107.toByte(), if (i > 1) 1 else 0)
        class348_sub49_69_.writeShort(107.toByte(), i)
        class348_sub49_69_.writeShort(107.toByte(), i_16_)
        class348_sub49.anInt7197 = i_29_
        var i_70_ = 0
        var i_71_ = 0
        var i_72_ = 0
        var i_73_ = 0
        var i_74_ = 0
        var i_75_ = 0
        var i_76_ = 0
        val `is` = IntArray(128)
        i_45_ = 0
        for (i_77_ in 0..<i) {
            class348_sub49_69_.writeInt(86.toByte(), 1297379947)
            class348_sub49_69_.anInt7197 += 4
            val i_78_ = class348_sub49_69_.anInt7197
            var i_79_ = -1
            while_122_@ do {
                while (true) {
                    val i_80_ = class348_sub49.method3366(73.toByte())
                    class348_sub49_69_.method3396(i_80_, -21)
                    val i_81_ = ((class348_sub49.aByteArray7154!![i_47_++]).toInt() and 0xff)
                    val bool = i_81_ != i_79_
                    i_79_ = i_81_ and 0xf
                    if (i_81_ == 7) {
                        if (bool) class348_sub49_69_.writeByte(false, 255)
                        class348_sub49_69_.writeByte(false, 47)
                        class348_sub49_69_.writeByte(false, 0)
                        break@while_122_
                    }
                    if (i_81_ == 23) {
                        if (bool) class348_sub49_69_.writeByte(false, 255)
                        class348_sub49_69_.writeByte(false, 81)
                        class348_sub49_69_.writeByte(false, 3)
                        class348_sub49_69_.writeByte(false, (class348_sub49.aByteArray7154!![i_68_++]).toInt())
                        class348_sub49_69_.writeByte(false, (class348_sub49.aByteArray7154!![i_68_++]).toInt())
                        class348_sub49_69_.writeByte(false, (class348_sub49.aByteArray7154!![i_68_++]).toInt())
                    } else {
                        i_70_ = i_70_ xor (i_81_ shr 4)
                        if (i_79_ == 0) {
                            if (bool) class348_sub49_69_.writeByte(false, 144 + i_70_)
                            i_71_ += (class348_sub49.aByteArray7154!![i_55_++]).toInt()
                            i_72_ += (class348_sub49.aByteArray7154!![i_56_++]).toInt()
                            class348_sub49_69_.writeByte(false, i_71_ and 0x7f)
                            class348_sub49_69_.writeByte(false, i_72_ and 0x7f)
                        } else if (i_79_ == 1) {
                            if (bool) class348_sub49_69_.writeByte(false, 128 + i_70_)
                            i_71_ += (class348_sub49.aByteArray7154!![i_55_++]).toInt()
                            i_73_ += (class348_sub49.aByteArray7154!![i_58_++]).toInt()
                            class348_sub49_69_.writeByte(false, i_71_ and 0x7f)
                            class348_sub49_69_.writeByte(false, i_73_ and 0x7f)
                        } else if (i_79_ == 2) {
                            if (bool) class348_sub49_69_.writeByte(false, 176 + i_70_)
                            i_45_ = i_45_ + (class348_sub49.aByteArray7154!![i_32_++]) and 0x7f
                            class348_sub49_69_.writeByte(false, i_45_)
                            var i_82_: Int
                            if (i_45_ == 0 || i_45_ == 32) i_82_ = (class348_sub49.aByteArray7154!![i_62_++]).toInt()
                            else if (i_45_ == 1) i_82_ = (class348_sub49.aByteArray7154!![i_52_++]).toInt()
                            else if (i_45_ == 33) i_82_ = (class348_sub49.aByteArray7154!![i_59_++]).toInt()
                            else if (i_45_ == 7) i_82_ = (class348_sub49.aByteArray7154!![i_53_++]).toInt()
                            else if (i_45_ == 39) i_82_ = (class348_sub49.aByteArray7154!![i_60_++]).toInt()
                            else if (i_45_ == 10) i_82_ = (class348_sub49.aByteArray7154!![i_54_++]).toInt()
                            else if (i_45_ == 42) i_82_ = (class348_sub49.aByteArray7154!![i_61_++]).toInt()
                            else if (i_45_ == 99) i_82_ = (class348_sub49.aByteArray7154!![i_64_++]).toInt()
                            else if (i_45_ == 98) i_82_ = (class348_sub49.aByteArray7154!![i_65_++]).toInt()
                            else if (i_45_ == 101) i_82_ = (class348_sub49.aByteArray7154!![i_66_++]).toInt()
                            else if (i_45_ == 100) i_82_ = (class348_sub49.aByteArray7154!![i_67_++]).toInt()
                            else if (i_45_ == 64 || i_45_ == 65 || i_45_ == 120 || i_45_ == 121 || i_45_ == 123) i_82_ = (class348_sub49.aByteArray7154!![i_48_++]).toInt()
                            else i_82_ = (class348_sub49.aByteArray7154!![i_57_++]).toInt()
                            i_82_ += `is`[i_45_]
                            `is`[i_45_] = i_82_
                            class348_sub49_69_.writeByte(false, i_82_ and 0x7f)
                        } else if (i_79_ == 3) {
                            if (bool) class348_sub49_69_.writeByte(false, 224 + i_70_)
                            i_74_ += (class348_sub49.aByteArray7154!![i_63_++]).toInt()
                            i_74_ += (class348_sub49.aByteArray7154!![i_51_++]).toInt() shl 7
                            class348_sub49_69_.writeByte(false, i_74_ and 0x7f)
                            class348_sub49_69_.writeByte(false, i_74_ shr 7 and 0x7f)
                        } else if (i_79_ == 4) {
                            if (bool) class348_sub49_69_.writeByte(false, 208 + i_70_)
                            i_75_ += (class348_sub49.aByteArray7154!![i_50_++]).toInt()
                            class348_sub49_69_.writeByte(false, i_75_ and 0x7f)
                        } else if (i_79_ == 5) {
                            if (bool) class348_sub49_69_.writeByte(false, 160 + i_70_)
                            i_71_ += (class348_sub49.aByteArray7154!![i_55_++]).toInt()
                            i_76_ += (class348_sub49.aByteArray7154!![i_49_++]).toInt()
                            class348_sub49_69_.writeByte(false, i_71_ and 0x7f)
                            class348_sub49_69_.writeByte(false, i_76_ and 0x7f)
                        } else {
                            if (i_79_ != 6) break
                            if (bool) class348_sub49_69_.writeByte(false, 192 + i_70_)
                            class348_sub49_69_.writeByte(false, (class348_sub49.aByteArray7154!![i_62_++]).toInt())
                        }
                    }
                }
                throw RuntimeException()
            } while (false)
            class348_sub49_69_.method3338(-1, (class348_sub49_69_.anInt7197 - i_78_))
        }
    }

    companion object {
        fun method2734(class45: Class45, i: Int, i_15_: Int): Class348_Sub2? {
            val `is` = class45.method410(-1860, i, i_15_)
            if (`is` == null) return null
            return Class348_Sub2(Class348_Sub49(`is`))
        }
    }
}
