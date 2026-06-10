/* Class207 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class207 {
    var aByteArray2695: ByteArray? = null
    @JvmField
    var anInt2696: Int = 0
    lateinit var anIntArray2697: IntArray
    @JvmField
    var anInt2698: Int = 0
    lateinit var aByteArray2699: ByteArray
    @JvmField
    var anInt2700: Int = 0
    @JvmField
    var anInt2701: Int = 0
    @JvmField
    var anInt2702: Int = 0
    @JvmField
    var anInt2703: Int = 0

    fun method1510(): Int {
        return (this.anInt2702 + this.anInt2703 + this.anInt2698)
    }

    fun method1511(i: Int) {
        var i_0_ = -1
        if (this.anIntArray2697.size < 255) {
            for (i_1_ in this.anIntArray2697.indices) {
                if (this.anIntArray2697[i_1_] == i) {
                    i_0_ = i_1_
                    break
                }
            }
            if (i_0_ == -1) {
                i_0_ = this.anIntArray2697.size
                val `is` = IntArray(this.anIntArray2697.size + 1)
                Class214.method1578(this.anIntArray2697, 0, `is`, 0, this.anIntArray2697.size)
                this.anIntArray2697 = `is`
                `is`[i_0_] = i
            }
        } else {
            var i_2_ = 2147483647
            val i_3_ = i shr 16 and 0xff
            val i_4_ = i shr 8 and 0xff
            val i_5_ = i and 0xff
            for (i_6_ in this.anIntArray2697.indices) {
                val i_7_ = this.anIntArray2697[i_6_]
                val i_8_ = i_7_ shr 16 and 0xff
                val i_9_ = i_7_ shr 8 and 0xff
                val i_10_ = i_7_ and 0xff
                var i_11_ = i_3_ - i_8_
                if (i_11_ < 0) i_11_ = -i_11_
                var i_12_ = i_4_ - i_9_
                if (i_12_ < 0) i_12_ = -i_12_
                var i_13_ = i_5_ - i_10_
                if (i_13_ < 0) i_13_ = -i_13_
                val i_14_ = i_11_ + i_12_ + i_13_
                if (i_14_ < i_2_) {
                    i_2_ = i_14_
                    i_0_ = i_6_
                }
            }
        }
        for (i_15_ in this.anInt2696 - 1 downTo 1) {
            val i_16_ = i_15_ * this.anInt2702
            for (i_17_ in this.anInt2702 - 1 downTo 1) {
                if (((this.anIntArray2697[this.aByteArray2699[i_17_ + i_16_].toInt() and 0xff]) == 0) && (this.anIntArray2697[((this.aByteArray2699[i_17_ + i_16_ - 1 - this.anInt2702]).toInt() and 0xff)]) != 0) this.aByteArray2699[i_17_ + i_16_] = i_0_.toByte()
            }
        }
    }

    fun method1513(i: Int) {
        val i_18_ = method1510()
        val i_19_ = method1522()
        if (this.anInt2702 != i_18_ || this.anInt2696 != i_19_) {
            var i_20_ = i
            if (i_20_ > this.anInt2703) i_20_ = this.anInt2703
            var i_21_ = i
            if ((i_21_ + this.anInt2703 + this.anInt2702) > i_18_) i_21_ = (i_18_ - this.anInt2703 - this.anInt2702)
            var i_22_ = i
            if (i_22_ > this.anInt2700) i_22_ = this.anInt2700
            var i_23_ = i
            if ((i_23_ + this.anInt2700 + this.anInt2696) > i_19_) i_23_ = (i_19_ - this.anInt2700 - this.anInt2696)
            val i_24_ = this.anInt2702 + i_20_ + i_21_
            val i_25_ = this.anInt2696 + i_22_ + i_23_
            val `is` = ByteArray(i_24_ * i_25_)
            if (this.aByteArray2695 == null) {
                for (i_26_ in 0..<this.anInt2696) {
                    var i_27_ = i_26_ * this.anInt2702
                    var i_28_ = (i_26_ + i_22_) * i_24_ + i_20_
                    for (i_29_ in 0..<this.anInt2702) `is`[i_28_++] = this.aByteArray2699[i_27_++]
                }
            } else {
                val is_30_ = ByteArray(i_24_ * i_25_)
                for (i_31_ in 0..<this.anInt2696) {
                    var i_32_ = i_31_ * this.anInt2702
                    var i_33_ = (i_31_ + i_22_) * i_24_ + i_20_
                    for (i_34_ in 0..<this.anInt2702) {
                        is_30_[i_33_] = this.aByteArray2695!![i_32_]
                        `is`[i_33_++] = this.aByteArray2699[i_32_++]
                    }
                }
                this.aByteArray2695 = is_30_
            }
            this.anInt2703 -= i_20_
            this.anInt2700 -= i_22_
            this.anInt2698 -= i_21_
            this.anInt2701 -= i_23_
            this.anInt2702 = i_24_
            this.anInt2696 = i_25_
            this.aByteArray2699 = `is`
        }
    }

    fun method1514() {
        val `is` = this.aByteArray2699
        if (this.aByteArray2695 == null) {
            for (i in (this.anInt2696 shr 1) - 1 downTo 0) {
                var i_35_ = i * this.anInt2702
                var i_36_ = ((this.anInt2696 - i - 1) * this.anInt2702)
                for (i_37_ in -this.anInt2702..-1) {
                    val i_38_ = `is`[i_35_]
                    `is`[i_35_] = `is`[i_36_]
                    `is`[i_36_] = i_38_
                    i_35_++
                    i_36_++
                }
            }
        } else {
            val is_39_ = this.aByteArray2695
            for (i in (this.anInt2696 shr 1) - 1 downTo 0) {
                var i_40_ = i * this.anInt2702
                var i_41_ = ((this.anInt2696 - i - 1) * this.anInt2702)
                for (i_42_ in -this.anInt2702..-1) {
                    var i_43_ = `is`[i_40_]
                    `is`[i_40_] = `is`[i_41_]
                    `is`[i_41_] = i_43_
                    i_43_ = is_39_!![i_40_]
                    is_39_[i_40_] = is_39_[i_41_]
                    is_39_[i_41_] = i_43_
                    i_40_++
                    i_41_++
                }
            }
        }
        val i = this.anInt2700
        this.anInt2700 = this.anInt2701
        this.anInt2701 = i
    }

    fun method1515(i: Int) {
        var i_44_ = -1
        if (this.anIntArray2697.size < 255) {
            for (i_45_ in this.anIntArray2697.indices) {
                if (this.anIntArray2697[i_45_] == i) {
                    i_44_ = i_45_
                    break
                }
            }
            if (i_44_ == -1) {
                i_44_ = this.anIntArray2697.size
                val `is` = IntArray(this.anIntArray2697.size + 1)
                Class214.method1578(this.anIntArray2697, 0, `is`, 0, this.anIntArray2697.size)
                this.anIntArray2697 = `is`
                `is`[i_44_] = i
            }
        } else {
            var i_46_ = 2147483647
            val i_47_ = i shr 16 and 0xff
            val i_48_ = i shr 8 and 0xff
            val i_49_ = i and 0xff
            for (i_50_ in this.anIntArray2697.indices) {
                val i_51_ = this.anIntArray2697[i_50_]
                val i_52_ = i_51_ shr 16 and 0xff
                val i_53_ = i_51_ shr 8 and 0xff
                val i_54_ = i_51_ and 0xff
                var i_55_ = i_47_ - i_52_
                if (i_55_ < 0) i_55_ = -i_55_
                var i_56_ = i_48_ - i_53_
                if (i_56_ < 0) i_56_ = -i_56_
                var i_57_ = i_49_ - i_54_
                if (i_57_ < 0) i_57_ = -i_57_
                val i_58_ = i_55_ + i_56_ + i_57_
                if (i_58_ < i_46_) {
                    i_46_ = i_58_
                    i_44_ = i_50_
                }
            }
        }
        var i_59_ = 0
        val `is` = (ByteArray(this.anInt2702 * this.anInt2696))
        for (i_60_ in 0..<this.anInt2696) {
            for (i_61_ in 0..<this.anInt2702) {
                var i_62_ = this.aByteArray2699[i_59_].toInt() and 0xff
                if (this.anIntArray2697[i_62_] == 0) {
                    if (i_61_ > 0 && (this.anIntArray2697[(this.aByteArray2699[i_59_ - 1].toInt() and 0xff)]) != 0) i_62_ = i_44_
                    else if (i_60_ > 0 && (this.anIntArray2697[((this.aByteArray2699[i_59_ - this.anInt2702]).toInt() and 0xff)]) != 0) i_62_ = i_44_
                    else if (i_61_ < this.anInt2702 - 1 && (this.anIntArray2697[(this.aByteArray2699[i_59_ + 1].toInt() and 0xff)]) != 0) i_62_ = i_44_
                    else if (i_60_ < this.anInt2696 - 1 && (this.anIntArray2697[((this.aByteArray2699[i_59_ + this.anInt2702]).toInt() and 0xff)]) != 0) i_62_ = i_44_
                }
                `is`[i_59_++] = i_62_.toByte()
            }
        }
        this.aByteArray2699 = `is`
    }

    fun method1516(): IntArray {
        val i = method1510()
        val `is` = IntArray(i * method1522())
        if (this.aByteArray2695 == null) {
            for (i_67_ in 0..<this.anInt2696) {
                var i_68_ = i_67_ * this.anInt2702
                var i_69_ = (this.anInt2703 + (i_67_ + this.anInt2700) * i)
                for (i_70_ in 0..<this.anInt2702) {
                    val i_71_ = (this.anIntArray2697[this.aByteArray2699[i_68_++].toInt() and 0xff])
                    if (i_71_ != 0) `is`[i_69_++] = 0xffffff.inv() or i_71_
                    else `is`[i_69_++] = 0
                }
            }
        } else {
            for (i_63_ in 0..<this.anInt2696) {
                var i_64_ = i_63_ * this.anInt2702
                var i_65_ = (this.anInt2703 + (i_63_ + this.anInt2700) * i)
                for (i_66_ in 0..<this.anInt2702) {
                    `is`[i_65_++] = (this.aByteArray2695!![i_64_].toInt() shl 24 or (this.anIntArray2697[(this.aByteArray2699[i_64_].toInt() and 0xff)]))
                    i_64_++
                }
            }
        }
        return `is`
    }

    fun method1518() {
        val `is` = this.aByteArray2699
        if (this.aByteArray2695 == null) {
            for (i in this.anInt2696 - 1 downTo 0) {
                var i_98_ = i * this.anInt2702
                var i_99_ = (i + 1) * this.anInt2702
                while (i_98_ < i_99_) {
                    i_99_--
                    val i_100_ = `is`[i_98_]
                    `is`[i_98_] = `is`[i_99_]
                    `is`[i_99_] = i_100_
                    i_98_++
                }
            }
        } else {
            val is_101_ = this.aByteArray2695
            for (i in this.anInt2696 - 1 downTo 0) {
                var i_102_ = i * this.anInt2702
                var i_103_ = (i + 1) * this.anInt2702
                while (i_102_ < i_103_) {
                    i_103_--
                    var i_104_ = `is`[i_102_]
                    `is`[i_102_] = `is`[i_103_]
                    `is`[i_103_] = i_104_
                    i_104_ = is_101_!![i_102_]
                    is_101_[i_102_] = is_101_[i_103_]
                    is_101_[i_103_] = i_104_
                    i_102_++
                }
            }
        }
        val i = this.anInt2703
        this.anInt2703 = this.anInt2698
        this.anInt2698 = i
    }

    fun method1520() {
        val `is` = (ByteArray(this.anInt2702 * this.anInt2696))
        var i = 0
        if (this.aByteArray2695 == null) {
            for (i_106_ in 0..<this.anInt2702) {
                for (i_107_ in this.anInt2696 - 1 downTo 0) `is`[i++] = (this.aByteArray2699[i_106_ + i_107_ * this.anInt2702])
            }
            this.aByteArray2699 = `is`
        } else {
            val is_108_ = ByteArray((this.anInt2702 * this.anInt2696))
            for (i_109_ in 0..<this.anInt2702) {
                for (i_110_ in this.anInt2696 - 1 downTo 0) {
                    `is`[i] = (this.aByteArray2699[i_109_ + i_110_ * this.anInt2702])
                    is_108_[i++] = (this.aByteArray2695!![i_109_ + i_110_ * this.anInt2702])
                }
            }
            this.aByteArray2699 = `is`
            this.aByteArray2695 = is_108_
        }
        var i_111_ = this.anInt2700
        this.anInt2700 = this.anInt2703
        this.anInt2703 = this.anInt2701
        this.anInt2701 = this.anInt2698
        this.anInt2698 = this.anInt2700
        i_111_ = this.anInt2696
        this.anInt2696 = this.anInt2702
        this.anInt2702 = i_111_
    }

    fun method1522(): Int {
        return (this.anInt2696 + this.anInt2700 + this.anInt2701)
    }

    fun method1524() {
        val i = method1510()
        val i_113_ = method1522()
        if (this.anInt2702 != i || this.anInt2696 != i_113_) {
            val `is` = ByteArray(i * i_113_)
            if (this.aByteArray2695 == null) {
                for (i_119_ in 0..<this.anInt2696) {
                    var i_120_ = i_119_ * this.anInt2702
                    var i_121_ = ((i_119_ + this.anInt2700) * i + this.anInt2703)
                    for (i_122_ in 0..<this.anInt2702) `is`[i_121_++] = this.aByteArray2699[i_120_++]
                }
            } else {
                val is_114_ = ByteArray(i * i_113_)
                for (i_115_ in 0..<this.anInt2696) {
                    var i_116_ = i_115_ * this.anInt2702
                    var i_117_ = ((i_115_ + this.anInt2700) * i + this.anInt2703)
                    for (i_118_ in 0..<this.anInt2702) {
                        `is`[i_117_] = this.aByteArray2699[i_116_]
                        is_114_[i_117_++] = this.aByteArray2695!![i_116_++]
                    }
                }
                this.aByteArray2695 = is_114_
            }
            this.anInt2701 = 0
            this.anInt2700 = this.anInt2701
            this.anInt2698 = this.anInt2700
            this.anInt2703 = this.anInt2698
            this.anInt2702 = i
            this.anInt2696 = i_113_
            this.aByteArray2699 = `is`
        }
    }

    companion object {
        @JvmStatic
        fun method1512(class45: Class45, i: Int): Class207? {
            val `is` = class45.method415(73.toByte(), i)
            if (`is` == null) return null
            return method1517(`is`)[0]
        }

        private fun method1517(`is`: ByteArray): Array<Class207> {
            val class348_sub49 = Class348_Sub49(`is`)
            class348_sub49.anInt7197 = `is`.size - 2
            val i = class348_sub49.readUnsignedShort(842397944)
            val class207s: Array<Class207> = Array<Class207>(i) { Class207() }
            class348_sub49.anInt7197 = `is`.size - 7 - i * 8
            val i_73_ = class348_sub49.readUnsignedShort(842397944)
            val i_74_ = class348_sub49.readUnsignedShort(842397944)
            val i_75_ = (class348_sub49.readUnsignedByte(255) and 0xff) + 1
            for (i_76_ in 0..<i) class207s[i_76_].anInt2703 = class348_sub49.readUnsignedShort(842397944)
            for (i_77_ in 0..<i) class207s[i_77_].anInt2700 = class348_sub49.readUnsignedShort(842397944)
            for (i_78_ in 0..<i) class207s[i_78_].anInt2702 = class348_sub49.readUnsignedShort(842397944)
            for (i_79_ in 0..<i) class207s[i_79_].anInt2696 = class348_sub49.readUnsignedShort(842397944)
            for (i_80_ in 0..<i) {
                val class207 = class207s[i_80_]
                class207.anInt2698 = (i_73_ - class207.anInt2702 - class207.anInt2703)
                class207.anInt2701 = (i_74_ - class207.anInt2696 - class207.anInt2700)
            }
            class348_sub49.anInt7197 = `is`.size - 7 - i * 8 - (i_75_ - 1) * 3
            val is_81_ = IntArray(i_75_)
            for (i_82_ in 1..<i_75_) {
                is_81_[i_82_] = class348_sub49.readMedium(-1)
                if (is_81_[i_82_] == 0) is_81_[i_82_] = 1
            }
            for (i_83_ in 0..<i) class207s[i_83_].anIntArray2697 = is_81_
            class348_sub49.anInt7197 = 0
            for (i_84_ in 0..<i) {
                val class207 = class207s[i_84_]
                val i_85_ = (class207.anInt2702 * class207.anInt2696)
                class207.aByteArray2699 = ByteArray(i_85_)
                val i_86_ = class348_sub49.readUnsignedByte(255)
                if ((i_86_ and 0x2) == 0) {
                    if ((i_86_ and 0x1) == 0) {
                        for (i_87_ in 0..<i_85_) class207.aByteArray2699[i_87_] = class348_sub49.readByte(-126)
                    } else {
                        for (i_88_ in 0..<class207.anInt2702) {
                            for (i_89_ in 0..<class207.anInt2696) class207.aByteArray2699[(i_88_ + i_89_ * class207.anInt2702)] = class348_sub49.readByte(-96)
                        }
                    }
                } else {
                    var bool = false
                    class207.aByteArray2695 = ByteArray(i_85_)
                    if ((i_86_ and 0x1) == 0) {
                        for (i_90_ in 0..<i_85_) class207.aByteArray2699[i_90_] = class348_sub49.readByte(-118)
                        for (i_91_ in 0..<i_85_) {
                            val i_92_ = (class348_sub49.readByte(-89).also { class207.aByteArray2695!![i_91_] = it })
                            bool = bool or (i_92_.toInt() != -1)
                        }
                    } else {
                        for (i_93_ in 0..<class207.anInt2702) {
                            for (i_94_ in 0..<class207.anInt2696) class207.aByteArray2699[(i_93_ + i_94_ * class207.anInt2702)] = class348_sub49.readByte(-84)
                        }
                        for (i_95_ in 0..<class207.anInt2702) {
                            for (i_96_ in 0..<class207.anInt2696) {
                                val i_97_ = (class348_sub49.readByte(-122).also { class207.aByteArray2695!![i_95_ + i_96_ * (class207.anInt2702)] = it })
                                bool = bool or (i_97_.toInt() != -1)
                            }
                        }
                    }
                    if (!bool) class207.aByteArray2695 = null
                }
            }
            return class207s
        }

        @JvmStatic
        fun method1519(class45: Class45, i: Int, i_105_: Int): Array<Class207>? {
            val `is` = class45.method410(-1860, i, i_105_)
            if (`is` == null) return null
            return method1517(`is`)
        }

        @JvmStatic
        fun method1521(class45: Class45, i: Int, i_112_: Int): Class207? {
            val `is` = class45.method410(-1860, i, i_112_)
            if (`is` == null) return null
            return method1517(`is`)[0]
        }

        @JvmStatic
        fun method1523(class45: Class45, i: Int): Array<Class207>? {
            val `is` = class45.method415(73.toByte(), i)
            if (`is` == null) return null
            return method1517(`is`)
        }
    }
}
