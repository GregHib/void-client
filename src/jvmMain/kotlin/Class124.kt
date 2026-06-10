import Class85.Companion.method828
import java.awt.Canvas
import java.util.*

class Class124 {
    var anIntArray1816: IntArray = intArrayOf()
    var anInt1817: Int
    var anInt1818: Int
    var aByteArray1820: ByteArray? = null
    var anInt1821: Int
    var aShortArray1822: ShortArray? = null
    var aByteArray1823: ByteArray = byteArrayOf()
    var anIntArray1824: IntArray? = null
    var aShortArray1825: ShortArray = shortArrayOf()
    var aShortArray1829: ShortArray = shortArrayOf()
    @JvmField
    var anInt1830: Int = 12
    var aClass162Array1832: Array<Class162?>? = null
    var aByteArray1833: ByteArray = byteArrayOf()
    var aByteArray1834: ByteArray? = null
    var aShortArray1835: ShortArray? = null
    var anInt1836: Int = 0
    var aByteArray1839: ByteArray? = null
    var anIntArray1841: IntArray = intArrayOf()
    var aShortArray1842: ShortArray = shortArrayOf()
    var aByteArray1843: ByteArray? = null
    var anIntArray1844: IntArray = intArrayOf()
    var aClass129Array1846: Array<Class129?>? = null
    var anIntArray1847: IntArray = intArrayOf()
    var aShortArray1849: ShortArray = shortArrayOf()
    var aByte1851: Byte
    var anIntArray1852: IntArray = intArrayOf()
    var aByteArray1853: ByteArray = byteArrayOf()
    var aShortArray1855: ShortArray = shortArrayOf()
    var aShortArray1856: ShortArray? = null
    var anIntArray1857: IntArray = intArrayOf()
    var anIntArray1859: IntArray? = null
    var aShortArray1862: ShortArray = shortArrayOf()
    var aShortArray1863: ShortArray = shortArrayOf()
    var anIntArray1865: IntArray = intArrayOf()
    var aClass342Array1866: Array<Class342?>? = null
    var anIntArray1867: IntArray = intArrayOf()
    var anIntArray1868: IntArray? = null

    fun method1092(i: Int, i_0_: Int) {
        anInt1819++
        var i_1_ = 0
        while (this.anInt1836 > i_1_) {
            this.anIntArray1841[i_1_] = this.anIntArray1841[i_1_] shl i
            this.anIntArray1847[i_1_] = this.anIntArray1847[i_1_] shl i
            this.anIntArray1852[i_1_] = this.anIntArray1852[i_1_] shl i
            i_1_++
        }
        if (i_0_ <= 39) method1107(40, -7, -80, -24)
        if (this.anInt1818 > 0 && this.anIntArray1859 != null) {
            for (i_2_ in this.anIntArray1859!!.indices) {
                this.anIntArray1859!![i_2_] = this.anIntArray1859!![i_2_] shl i
                this.anIntArray1816[i_2_] = this.anIntArray1816[i_2_] shl i
                if (this.aByteArray1823[i_2_].toInt() != 1) this.anIntArray1844[i_2_] = this.anIntArray1844[i_2_] shl i
            }
        }
    }

    fun method1093(i: Byte): Array<IntArray?>? {
        anInt1854++
        val `is` = IntArray(256)
        var i_3_ = 0
        var i_4_ = 0
        while (this.aClass162Array1832!!.size > i_4_) {
            val i_5_ = (this.aClass162Array1832!![i_4_]!!.anInt2156)
            if (i_5_ >= 0) {
                `is`[i_5_]++
                if (i_3_ < i_5_) i_3_ = i_5_
            }
            i_4_++
        }
        val is_6_ = arrayOfNulls<IntArray>(1 + i_3_)
        for (i_7_ in 0..i_3_) {
            is_6_[i_7_] = IntArray(`is`[i_7_])
            `is`[i_7_] = 0
        }
        if (i > -68) return null
        for (i_8_ in this.aClass162Array1832!!.indices) {
            val i_9_ = (this.aClass162Array1832!![i_8_]!!.anInt2156)
            if (i_9_ >= 0) is_6_[i_9_]!![`is`[i_9_]++] = i_8_
        }
        return is_6_
    }

    fun method1094(i: Byte): Array<IntArray?> {
        anInt1864++
        val `is` = IntArray(256)
        var i_10_ = 0
        for (i_11_ in 0..<this.anInt1817) {
            val i_12_ = this.anIntArray1824!![i_11_]
            if (i_12_ >= 0) {
                if (i_10_ < i_12_) i_10_ = i_12_
                `is`[i_12_]++
            }
        }
        val is_13_ = arrayOfNulls<IntArray>(i_10_ - -1)
        if (i <= 13) method1102(-65, (-8).toByte(), 94.toByte(), (-89).toShort(), 6.toByte(), (-117).toShort(), 21, 21.toByte(), -31)
        var i_14_ = 0
        while (i_10_ >= i_14_) {
            is_13_[i_14_] = IntArray(`is`[i_14_])
            `is`[i_14_] = 0
            i_14_++
        }
        for (i_15_ in 0..<this.anInt1817) {
            val i_16_ = this.anIntArray1824!![i_15_]
            if (i_16_ >= 0) is_13_[i_16_]!![`is`[i_16_]++] = i_15_
        }
        return is_13_
    }

    fun method1095(i: Short, i_17_: Int, i_18_: Short) {
        anInt1869++
        if (this.aShortArray1822 != null) {
            var i_19_ = i_17_
            while (this.anInt1817 > i_19_) {
                if (i == this.aShortArray1822!![i_19_]) this.aShortArray1822!![i_19_] = i_18_
                i_19_++
            }
        }
    }

    fun method1098(i: Short, i_23_: Byte, i_24_: Short) {
        if (i_23_.toInt() == 126) {
            for (i_25_ in 0..<this.anInt1817) {
                if (i == this.aShortArray1862[i_25_]) this.aShortArray1862[i_25_] = i_24_
            }
            anInt1826++
        }
    }

    fun method1099(i: Byte, i_26_: Int, i_27_: Int, i_28_: Int) {
        var i_29_ = 0
        val i_30_ = 19 % ((-40 - i) / 33)
        while ( /**/this.anInt1836 > i_29_) {
            this.anIntArray1841[i_29_] += i_27_
            this.anIntArray1847[i_29_] += i_28_
            this.anIntArray1852[i_29_] += i_26_
            i_29_++
        }
        anInt1840++
    }

    fun method1100(bool: Boolean, i: Int): Array<IntArray?> {
        anInt1845++
        val `is` = IntArray(256)
        var i_31_ = 0
        val i_32_ = (if (!bool) this.anInt1821 else this.anInt1836)
        for (i_33_ in 0..<i_32_) {
            val i_34_ = this.anIntArray1868!![i_33_]
            if (i_34_ >= 0) {
                `is`[i_34_]++
                if (i_31_ < i_34_) i_31_ = i_34_
            }
        }
        val is_35_ = arrayOfNulls<IntArray>(1 + i_31_)
        for (i_36_ in 0..i_31_) {
            is_35_[i_36_] = IntArray(`is`[i_36_])
            `is`[i_36_] = 0
        }
        var i_37_ = 0
        while (i_32_ > i_37_) {
            val i_38_ = this.anIntArray1868!![i_37_]
            if (i_38_ >= 0) is_35_[i_38_]!![`is`[i_38_]++] = i_37_
            i_37_++
        }
        if (i > -14) method1098(9.toShort(), 80.toByte(), (-118).toShort())
        return is_35_
    }

    fun method1101(i: Int, i_39_: Int, i_40_: Int, i_41_: Int): Int {
        anInt1827++
        var i_42_ = 0
        val i_43_ = 120 / ((38 - i_41_) / 61)
        while ( /**/i_42_ < this.anInt1836) {
            if (this.anIntArray1841[i_42_] == i_40_ && i == this.anIntArray1847[i_42_] && this.anIntArray1852[i_42_] == i_39_) return i_42_
            i_42_++
        }
        this.anIntArray1841[this.anInt1836] = i_40_
        this.anIntArray1847[this.anInt1836] = i
        this.anIntArray1852[this.anInt1836] = i_39_
        this.anInt1821 = 1 + this.anInt1836
        return this.anInt1836++
    }

    fun method1102(i: Int, i_44_: Byte, i_45_: Byte, i_46_: Short, i_47_: Byte, i_48_: Short, i_49_: Int, i_50_: Byte, i_51_: Int): Int {
        this.aShortArray1863[this.anInt1817] = i.toShort()
        anInt1860++
        this.aShortArray1835!![this.anInt1817] = i_49_.toShort()
        this.aShortArray1855[this.anInt1817] = i_51_.toShort()
        if (i_47_ < 30) return -92
        this.aByteArray1843!![this.anInt1817] = i_44_
        this.aByteArray1820!![this.anInt1817] = i_45_
        this.aShortArray1862[this.anInt1817] = i_48_
        this.aByteArray1834!![this.anInt1817] = i_50_
        this.aShortArray1822!![this.anInt1817] = i_46_
        return this.anInt1817++
    }

    private fun method1103(i: Int, `is`: ByteArray) {
        anInt1831++
        var bool = false
        var bool_52_ = false
        val class348_sub49 = Class348_Sub49(`is`)
        val class348_sub49_53_ = Class348_Sub49(`is`)
        val class348_sub49_54_ = Class348_Sub49(`is`)
        val class348_sub49_55_ = Class348_Sub49(`is`)
        val class348_sub49_56_ = Class348_Sub49(`is`)
        class348_sub49.anInt7197 = -18 + `is`.size
        this.anInt1836 = class348_sub49.readUnsignedShort(i xor 0x3235f8f9)
        this.anInt1817 = class348_sub49.readUnsignedShort(842397944)
        this.anInt1818 = class348_sub49.readUnsignedByte(255)
        val i_57_ = class348_sub49.readUnsignedByte(255)
        val i_58_ = class348_sub49.readUnsignedByte(255)
        val i_59_ = class348_sub49.readUnsignedByte(255)
        val i_60_ = class348_sub49.readUnsignedByte(255)
        val i_61_ = class348_sub49.readUnsignedByte(255)
        val i_62_ = class348_sub49.readUnsignedShort(842397944)
        val i_63_ = class348_sub49.readUnsignedShort(842397944)
        val i_64_ = class348_sub49.readUnsignedShort(842397944)
        val i_65_ = class348_sub49.readUnsignedShort(842397944)
        var i_66_ = 0
        val i_67_ = i_66_
        i_66_ += this.anInt1836
        val i_68_ = i_66_
        i_66_ += this.anInt1817
        val i_69_ = i_66_
        if (i_58_ == 255) i_66_ += this.anInt1817
        val i_70_ = i_66_
        if (i_60_ == 1) i_66_ += this.anInt1817
        val i_71_ = i_66_
        if (i_57_ == 1) i_66_ += this.anInt1817
        val i_72_ = i_66_
        if (i_61_ == 1) i_66_ += this.anInt1836
        val i_73_ = i_66_
        if (i == i_59_) i_66_ += this.anInt1817
        val i_74_ = i_66_
        i_66_ += i_65_
        val i_75_ = i_66_
        i_66_ += this.anInt1817 * 2
        val i_76_ = i_66_
        i_66_ += this.anInt1818 * 6
        val i_77_ = i_66_
        i_66_ += i_62_
        val i_78_ = i_66_
        i_66_ += i_63_
        val i_79_ = i_66_
        this.aShortArray1862 = ShortArray(this.anInt1817)
        if (i_58_ == 255) this.aByteArray1839 = ByteArray(this.anInt1817)
        else this.aByte1851 = i_58_.toByte()
        if (i_61_ == 1) this.anIntArray1868 = IntArray(this.anInt1836)
        if (i_59_ == 1) this.aByteArray1834 = ByteArray(this.anInt1817)
        this.aShortArray1863 = ShortArray(this.anInt1817)
        if (i_57_ == 1) {
            this.aShortArray1822 = ShortArray(this.anInt1817)
            this.aByteArray1820 = ByteArray(this.anInt1817)
            this.aByteArray1843 = ByteArray(this.anInt1817)
        }
        this.anIntArray1847 = IntArray(this.anInt1836)
        if (i_60_ == 1) this.anIntArray1824 = IntArray(this.anInt1817)
        this.aShortArray1855 = ShortArray(this.anInt1817)
        if (this.anInt1818 > 0) {
            this.aByteArray1823 = ByteArray(this.anInt1818)
            this.aShortArray1829 = ShortArray(this.anInt1818)
            this.aShortArray1849 = ShortArray(this.anInt1818)
            this.aShortArray1825 = ShortArray(this.anInt1818)
        }
        this.aShortArray1835 = ShortArray(this.anInt1817)
        this.anIntArray1852 = IntArray(this.anInt1836)
        this.anIntArray1841 = IntArray(this.anInt1836)
        class348_sub49.anInt7197 = i_67_
        i_66_ += i_64_
        class348_sub49_53_.anInt7197 = i_77_
        class348_sub49_54_.anInt7197 = i_78_
        class348_sub49_55_.anInt7197 = i_79_
        class348_sub49_56_.anInt7197 = i_72_
        var i_80_ = 0
        var i_81_ = 0
        var i_82_ = 0
        for (i_83_ in 0..<this.anInt1836) {
            val i_84_ = class348_sub49.readUnsignedByte(255)
            var i_85_ = 0
            if ((i_84_ and 0x1) != 0) i_85_ = class348_sub49_53_.method3362(77.toByte())
            var i_86_ = 0
            if ((i_84_ and 0x2) != 0) i_86_ = class348_sub49_54_.method3362(77.toByte())
            var i_87_ = 0
            if ((0x4 and i_84_) != 0) i_87_ = class348_sub49_55_.method3362(77.toByte())
            this.anIntArray1841[i_83_] = i_85_ + i_80_
            this.anIntArray1847[i_83_] = i_81_ - -i_86_
            this.anIntArray1852[i_83_] = i_82_ + i_87_
            i_82_ = this.anIntArray1852[i_83_]
            i_81_ = this.anIntArray1847[i_83_]
            i_80_ = this.anIntArray1841[i_83_]
            if (i_61_ == 1) this.anIntArray1868!![i_83_] = class348_sub49_56_.readUnsignedByte(Class348_Sub21.method2955(i, 254))
        }
        class348_sub49.anInt7197 = i_75_
        class348_sub49_53_.anInt7197 = i_71_
        class348_sub49_54_.anInt7197 = i_69_
        class348_sub49_55_.anInt7197 = i_73_
        class348_sub49_56_.anInt7197 = i_70_
        for (i_88_ in 0..<this.anInt1817) {
            this.aShortArray1862[i_88_] = class348_sub49.readUnsignedShort(842397944).toShort()
            if (i_57_ == 1) {
                val i_89_ = class348_sub49_53_.readUnsignedByte(255)
                if ((0x1 and i_89_) == 1) {
                    this.aByteArray1843!![i_88_] = 1.toByte()
                    bool = true
                } else this.aByteArray1843!![i_88_] = 0.toByte()
                if ((i_89_ and 0x2) == 2) {
                    this.aByteArray1820!![i_88_] = (i_89_ shr 2).toByte()
                    this.aShortArray1822!![i_88_] = this.aShortArray1862[i_88_]
                    this.aShortArray1862[i_88_] = 127.toShort()
                    if (this.aShortArray1822!![i_88_].toInt() != -1) bool_52_ = true
                } else {
                    this.aByteArray1820!![i_88_] = (-1).toByte()
                    this.aShortArray1822!![i_88_] = (-1).toShort()
                }
            }
            if (i_58_ == 255) this.aByteArray1839!![i_88_] = class348_sub49_54_.readByte(-108)
            if (i_59_ == 1) this.aByteArray1834!![i_88_] = class348_sub49_55_.readByte(Class348_Sub21.method2955(i, -120))
            if (i_60_ == 1) this.anIntArray1824!![i_88_] = class348_sub49_56_.readUnsignedByte(255)
        }
        class348_sub49.anInt7197 = i_74_
        this.anInt1821 = -1
        class348_sub49_53_.anInt7197 = i_68_
        var i_90_: Short = 0
        var i_91_: Short = 0
        var i_92_: Short = 0
        var i_93_ = 0
        for (i_94_ in 0..<this.anInt1817) {
            val i_95_ = class348_sub49_53_.readUnsignedByte(255)
            if (i_95_ == 1) {
                i_90_ = (i_93_ + class348_sub49.method3362(77.toByte())).toShort()
                i_93_ = i_90_.toInt()
                i_91_ = (class348_sub49.method3362(77.toByte()) + i_93_).toShort()
                i_93_ = i_91_.toInt()
                i_92_ = (i_93_ + class348_sub49.method3362(77.toByte())).toShort()
                this.aShortArray1863[i_94_] = i_90_
                i_93_ = i_92_.toInt()
                this.aShortArray1835!![i_94_] = i_91_
                this.aShortArray1855[i_94_] = i_92_
                if (i_90_ > this.anInt1821) this.anInt1821 = i_90_.toInt()
                if (this.anInt1821 < i_91_) this.anInt1821 = i_91_.toInt()
                if (this.anInt1821 < i_92_) this.anInt1821 = i_92_.toInt()
            }
            if (i_95_ == 2) {
                i_91_ = i_92_
                i_92_ = (class348_sub49.method3362(77.toByte()) + i_93_).toShort()
                this.aShortArray1863[i_94_] = i_90_
                i_93_ = i_92_.toInt()
                this.aShortArray1835!![i_94_] = i_91_
                this.aShortArray1855[i_94_] = i_92_
                if (i_92_ > this.anInt1821) this.anInt1821 = i_92_.toInt()
            }
            if (i_95_ == 3) {
                i_90_ = i_92_
                i_92_ = (class348_sub49.method3362(77.toByte()) + i_93_).toShort()
                i_93_ = i_92_.toInt()
                this.aShortArray1863[i_94_] = i_90_
                this.aShortArray1835!![i_94_] = i_91_
                this.aShortArray1855[i_94_] = i_92_
                if (this.anInt1821 < i_92_) this.anInt1821 = i_92_.toInt()
            }
            if (i_95_ == 4) {
                val i_96_ = i_90_
                i_90_ = i_91_
                i_92_ = (class348_sub49.method3362(77.toByte()) + i_93_).toShort()
                i_91_ = i_96_
                i_93_ = i_92_.toInt()
                this.aShortArray1863[i_94_] = i_90_
                this.aShortArray1835!![i_94_] = i_91_
                this.aShortArray1855[i_94_] = i_92_
                if (this.anInt1821 < i_92_) this.anInt1821 = i_92_.toInt()
            }
        }
        this.anInt1821++
        class348_sub49.anInt7197 = i_76_
        for (i_97_ in 0..<this.anInt1818) {
            this.aByteArray1823[i_97_] = 0.toByte()
            this.aShortArray1829[i_97_] = class348_sub49.readUnsignedShort(842397944).toShort()
            this.aShortArray1849[i_97_] = class348_sub49.readUnsignedShort(842397944).toShort()
            this.aShortArray1825[i_97_] = class348_sub49.readUnsignedShort(842397944).toShort()
        }
        if (this.aByteArray1820 != null) {
            var bool_98_ = false
            for (i_99_ in 0..<this.anInt1817) {
                val i_100_ = this.aByteArray1820!![i_99_].toInt() and 0xff
                if (i_100_ != 255) {
                    if (((0xffff and this.aShortArray1829[i_100_].toInt()) != this.aShortArray1863[i_99_].toInt()) || (this.aShortArray1835!![i_99_].toInt() != (0xffff and this.aShortArray1849[i_100_].toInt())) || ((0xffff and this.aShortArray1825[i_100_].toInt()) != this.aShortArray1855[i_99_].toInt())) bool_98_ = true
                    else this.aByteArray1820!![i_99_] = (-1).toByte()
                }
            }
            if (!bool_98_) this.aByteArray1820 = null
        }
        if (!bool) this.aByteArray1843 = null
        if (!bool_52_) this.aShortArray1822 = null
    }

    private fun method1104(class124_101_: Class124, i: Int, i_102_: Int, i_103_: Short): Int {
        anInt1858++
        val i_104_ = class124_101_.anIntArray1841[i_102_]
        val i_105_ = class124_101_.anIntArray1847[i_102_]
        val i_106_ = class124_101_.anIntArray1852[i_102_]
        for (i_107_ in i..<this.anInt1836) {
            if (this.anIntArray1841[i_107_] == i_104_ && i_105_ == this.anIntArray1847[i_107_] && (i_106_ == this.anIntArray1852[i_107_])) {
                this.aShortArray1842[i_107_] = Class273.method2057((this.aShortArray1842[i_107_]).toInt(), i_103_.toInt()).toShort()
                return i_107_
            }
        }
        this.anIntArray1841[this.anInt1836] = i_104_
        this.anIntArray1847[this.anInt1836] = i_105_
        this.anIntArray1852[this.anInt1836] = i_106_
        this.aShortArray1842[this.anInt1836] = i_103_
        this.anIntArray1868!![this.anInt1836] = (if (class124_101_.anIntArray1868 != null) class124_101_.anIntArray1868!![i_102_] else -1)
        return this.anInt1836++
    }

    fun method1105(i: Int, i_108_: Byte, i_109_: Byte, i_110_: Short, i_111_: Short, i_112_: Byte, i_113_: Short, i_114_: Short, i_115_: Short, i_116_: Short): Byte {
        anInt1838++
        check(this.anInt1818 < 255)
        this.aByteArray1823[this.anInt1818] = 3.toByte()
        this.aShortArray1829[this.anInt1818] = i_110_
        this.aShortArray1849[this.anInt1818] = i_114_
        this.aShortArray1825[this.anInt1818] = i_113_
        this.anIntArray1859!![this.anInt1818] = i_115_.toInt()
        this.anIntArray1816[this.anInt1818] = i_111_.toInt()
        this.anIntArray1844[this.anInt1818] = i_116_.toInt()
        this.aByteArray1833[this.anInt1818] = i_108_
        this.aByteArray1853[this.anInt1818] = i_112_
        this.anIntArray1867[this.anInt1818] = i_109_.toInt()
        val i_117_ = 93 % ((i - -19) / 56)
        return (this.anInt1818++).toByte()
    }

    private fun method1106(`is`: ByteArray, i: Byte) {
        anInt1828++
        val class348_sub49 = Class348_Sub49(`is`)
        val class348_sub49_118_ = Class348_Sub49(`is`)
        val class348_sub49_119_ = Class348_Sub49(`is`)
        val class348_sub49_120_ = Class348_Sub49(`is`)
        val class348_sub49_121_ = Class348_Sub49(`is`)
        val class348_sub49_122_ = Class348_Sub49(`is`)
        val class348_sub49_123_ = Class348_Sub49(`is`)
        class348_sub49.anInt7197 = -23 + `is`.size
        this.anInt1836 = class348_sub49.readUnsignedShort(842397944)
        this.anInt1817 = class348_sub49.readUnsignedShort(842397944)
        this.anInt1818 = class348_sub49.readUnsignedByte(255)
        val i_124_ = class348_sub49.readUnsignedByte(255)
        val bool = (0x1 and i_124_) == 1
        val bool_125_ = (i_124_ and 0x2) == 2
        val bool_126_ = (i_124_ and 0x4) == 4
        val bool_127_ = (i_124_ and 0x8) == 8
        if (bool_127_) {
            class348_sub49.anInt7197 -= 7
            this.anInt1830 = class348_sub49.readUnsignedByte(255)
            class348_sub49.anInt7197 += 6
        }
        val i_128_ = class348_sub49.readUnsignedByte(255)
        val i_129_ = class348_sub49.readUnsignedByte(255)
        val i_130_ = class348_sub49.readUnsignedByte(255)
        val i_131_ = class348_sub49.readUnsignedByte(255)
        val i_132_ = class348_sub49.readUnsignedByte(255)
        val i_133_ = class348_sub49.readUnsignedShort(842397944)
        val i_134_ = class348_sub49.readUnsignedShort(842397944)
        val i_135_ = class348_sub49.readUnsignedShort(842397944)
        val i_136_ = class348_sub49.readUnsignedShort(842397944)
        val i_137_ = class348_sub49.readUnsignedShort(842397944)
        var i_138_ = 0
        var i_139_ = 0
        var i_140_ = 0
        if (this.anInt1818 > 0) {
            class348_sub49.anInt7197 = 0
            this.aByteArray1823 = ByteArray(this.anInt1818)
            var i_141_ = 0
            while ((i_141_ < this.anInt1818)) {
                val i_142_ = (class348_sub49.readByte(-124).also { this.aByteArray1823[i_141_] = it })
                if (i_142_ >= 1 && i_142_ <= 3) i_139_++
                if (i_142_.toInt() == 2) i_140_++
                if (i_142_.toInt() == 0) i_138_++
                i_141_++
            }
        }
        var i_143_ = this.anInt1818
        val i_144_ = i_143_
        i_143_ += this.anInt1836
        val i_145_ = i_143_
        if (bool) i_143_ += this.anInt1817
        val i_146_ = i_143_
        i_143_ += this.anInt1817
        val i_147_ = i_143_
        if (i_128_ == 255) i_143_ += this.anInt1817
        val i_148_ = i_143_
        if (i_130_ == 1) i_143_ += this.anInt1817
        val i_149_ = i_143_
        if (i_132_ == 1) i_143_ += this.anInt1836
        val i_150_ = i_143_
        if (i_129_ == 1) i_143_ += this.anInt1817
        if (i <= 68) this.anInt1821 = 85
        val i_151_ = i_143_
        i_143_ += i_136_
        val i_152_ = i_143_
        if (i_131_ == 1) i_143_ += 2 * this.anInt1817
        val i_153_ = i_143_
        i_143_ += i_137_
        val i_154_ = i_143_
        i_143_ += 2 * this.anInt1817
        val i_155_ = i_143_
        i_143_ += i_133_
        val i_156_ = i_143_
        i_143_ += i_134_
        val i_157_ = i_143_
        i_143_ += i_135_
        val i_158_ = i_143_
        i_143_ += i_138_ * 6
        val i_159_ = i_143_
        i_143_ += 6 * i_139_
        var i_160_ = 6
        if (this.anInt1830 == 14) i_160_ = 7
        else if (this.anInt1830 >= 15) i_160_ = 9
        val i_161_ = i_143_
        i_143_ += i_160_ * i_139_
        val i_162_ = i_143_
        i_143_ += i_139_
        val i_163_ = i_143_
        i_143_ += i_139_
        val i_164_ = i_143_
        i_143_ += 2 * i_140_ + i_139_
        this.aShortArray1835 = ShortArray(this.anInt1817)
        this.aShortArray1862 = ShortArray(this.anInt1817)
        if (i_130_ == 1) this.anIntArray1824 = IntArray(this.anInt1817)
        if (this.anInt1818 > 0) {
            if (i_140_ > 0) {
                this.anIntArray1857 = IntArray(i_140_)
                this.anIntArray1865 = IntArray(i_140_)
            }
            this.aShortArray1849 = ShortArray(this.anInt1818)
            this.aShortArray1829 = ShortArray(this.anInt1818)
            if (i_139_ > 0) {
                this.anIntArray1867 = IntArray(i_139_)
                this.aByteArray1853 = ByteArray(i_139_)
                this.anIntArray1816 = IntArray(i_139_)
                this.aByteArray1833 = ByteArray(i_139_)
                this.anIntArray1844 = IntArray(i_139_)
                this.anIntArray1859 = IntArray(i_139_)
            }
            this.aShortArray1825 = ShortArray(this.anInt1818)
        }
        if (bool) this.aByteArray1843 = ByteArray(this.anInt1817)
        if (i_129_ == 1) this.aByteArray1834 = ByteArray(this.anInt1817)
        if (i_128_ == 255) this.aByteArray1839 = ByteArray(this.anInt1817)
        else this.aByte1851 = i_128_.toByte()
        this.aShortArray1855 = ShortArray(this.anInt1817)
        this.anIntArray1847 = IntArray(this.anInt1836)
        this.aShortArray1863 = ShortArray(this.anInt1817)
        if (i_131_ == 1 && this.anInt1818 > 0) this.aByteArray1820 = ByteArray(this.anInt1817)
        val i_165_ = i_143_
        this.anIntArray1852 = IntArray(this.anInt1836)
        this.anIntArray1841 = IntArray(this.anInt1836)
        if (i_132_ == 1) this.anIntArray1868 = IntArray(this.anInt1836)
        class348_sub49.anInt7197 = i_144_
        if (i_131_ == 1) this.aShortArray1822 = ShortArray(this.anInt1817)
        class348_sub49_118_.anInt7197 = i_155_
        class348_sub49_119_.anInt7197 = i_156_
        class348_sub49_120_.anInt7197 = i_157_
        class348_sub49_121_.anInt7197 = i_149_
        var i_166_ = 0
        var i_167_ = 0
        var i_168_ = 0
        var i_169_ = 0
        while (this.anInt1836 > i_169_) {
            val i_170_ = class348_sub49.readUnsignedByte(255)
            var i_171_ = 0
            if ((i_170_ and 0x1) != 0) i_171_ = class348_sub49_118_.method3362(77.toByte())
            var i_172_ = 0
            if ((i_170_ and 0x2) != 0) i_172_ = class348_sub49_119_.method3362(77.toByte())
            var i_173_ = 0
            if ((0x4 and i_170_) != 0) i_173_ = class348_sub49_120_.method3362(77.toByte())
            this.anIntArray1841[i_169_] = i_171_ + i_166_
            this.anIntArray1847[i_169_] = i_172_ + i_167_
            this.anIntArray1852[i_169_] = i_168_ + i_173_
            i_167_ = this.anIntArray1847[i_169_]
            i_166_ = this.anIntArray1841[i_169_]
            i_168_ = this.anIntArray1852[i_169_]
            if (i_132_ == 1) this.anIntArray1868!![i_169_] = class348_sub49_121_.readUnsignedByte(255)
            i_169_++
        }
        class348_sub49.anInt7197 = i_154_
        class348_sub49_118_.anInt7197 = i_145_
        class348_sub49_119_.anInt7197 = i_147_
        class348_sub49_120_.anInt7197 = i_150_
        class348_sub49_121_.anInt7197 = i_148_
        class348_sub49_122_.anInt7197 = i_152_
        class348_sub49_123_.anInt7197 = i_153_
        var i_174_ = 0
        while ((this.anInt1817 > i_174_)) {
            this.aShortArray1862[i_174_] = class348_sub49.readUnsignedShort(842397944).toShort()
            if (bool) this.aByteArray1843!![i_174_] = class348_sub49_118_.readByte(-98)
            if (i_128_ == 255) this.aByteArray1839!![i_174_] = class348_sub49_119_.readByte(-78)
            if (i_129_ == 1) this.aByteArray1834!![i_174_] = class348_sub49_120_.readByte(-99)
            if (i_130_ == 1) this.anIntArray1824!![i_174_] = class348_sub49_121_.readUnsignedByte(255)
            if (i_131_ == 1) this.aShortArray1822!![i_174_] = (class348_sub49_122_.readUnsignedShort(842397944) + -1).toShort()
            if (this.aByteArray1820 != null) {
                if (this.aShortArray1822!![i_174_].toInt() == -1) this.aByteArray1820!![i_174_] = (-1).toByte()
                else this.aByteArray1820!![i_174_] = (-1 + class348_sub49_123_.readUnsignedByte(255)).toByte()
            }
            i_174_++
        }
        class348_sub49.anInt7197 = i_151_
        this.anInt1821 = -1
        class348_sub49_118_.anInt7197 = i_146_
        var i_175_: Short = 0
        var i_176_: Short = 0
        var i_177_: Short = 0
        var i_178_ = 0
        var i_179_ = 0
        while ((i_179_ < this.anInt1817)) {
            val i_180_ = class348_sub49_118_.readUnsignedByte(255)
            if (i_180_ == 1) {
                i_175_ = (class348_sub49.method3362(77.toByte()) + i_178_).toShort()
                i_178_ = i_175_.toInt()
                i_176_ = (class348_sub49.method3362(77.toByte()) + i_178_).toShort()
                i_178_ = i_176_.toInt()
                i_177_ = (i_178_ + class348_sub49.method3362(77.toByte())).toShort()
                i_178_ = i_177_.toInt()
                this.aShortArray1863[i_179_] = i_175_
                this.aShortArray1835!![i_179_] = i_176_
                this.aShortArray1855[i_179_] = i_177_
                if (i_175_ > this.anInt1821) this.anInt1821 = i_175_.toInt()
                if (this.anInt1821 < i_176_) this.anInt1821 = i_176_.toInt()
                if (i_177_ > this.anInt1821) this.anInt1821 = i_177_.toInt()
            }
            if (i_180_ == 2) {
                i_176_ = i_177_
                i_177_ = (class348_sub49.method3362(77.toByte()) + i_178_).toShort()
                this.aShortArray1863[i_179_] = i_175_
                i_178_ = i_177_.toInt()
                this.aShortArray1835!![i_179_] = i_176_
                this.aShortArray1855[i_179_] = i_177_
                if (this.anInt1821 < i_177_) this.anInt1821 = i_177_.toInt()
            }
            if (i_180_ == 3) {
                i_175_ = i_177_
                i_177_ = (class348_sub49.method3362(77.toByte()) + i_178_).toShort()
                i_178_ = i_177_.toInt()
                this.aShortArray1863[i_179_] = i_175_
                this.aShortArray1835!![i_179_] = i_176_
                this.aShortArray1855[i_179_] = i_177_
                if (this.anInt1821 < i_177_) this.anInt1821 = i_177_.toInt()
            }
            if (i_180_ == 4) {
                val i_181_ = i_175_
                i_175_ = i_176_
                i_177_ = (i_178_ + class348_sub49.method3362(77.toByte())).toShort()
                i_176_ = i_181_
                this.aShortArray1863[i_179_] = i_175_
                i_178_ = i_177_.toInt()
                this.aShortArray1835!![i_179_] = i_176_
                this.aShortArray1855[i_179_] = i_177_
                if (this.anInt1821 < i_177_) this.anInt1821 = i_177_.toInt()
            }
            i_179_++
        }
        class348_sub49.anInt7197 = i_158_
        this.anInt1821++
        class348_sub49_118_.anInt7197 = i_159_
        class348_sub49_119_.anInt7197 = i_161_
        class348_sub49_120_.anInt7197 = i_162_
        class348_sub49_121_.anInt7197 = i_163_
        class348_sub49_122_.anInt7197 = i_164_
        var i_182_ = 0
        while (this.anInt1818 > i_182_) {
            val i_183_ = this.aByteArray1823[i_182_].toInt() and 0xff
            if (i_183_ == 0) {
                this.aShortArray1829[i_182_] = class348_sub49.readUnsignedShort(842397944).toShort()
                this.aShortArray1849[i_182_] = class348_sub49.readUnsignedShort(842397944).toShort()
                this.aShortArray1825[i_182_] = class348_sub49.readUnsignedShort(842397944).toShort()
            }
            if (i_183_ == 1) {
                this.aShortArray1829[i_182_] = class348_sub49_118_.readUnsignedShort(842397944).toShort()
                this.aShortArray1849[i_182_] = class348_sub49_118_.readUnsignedShort(842397944).toShort()
                this.aShortArray1825[i_182_] = class348_sub49_118_.readUnsignedShort(842397944).toShort()
                if (this.anInt1830 >= 15) {
                    this.anIntArray1859!![i_182_] = class348_sub49_119_.readMedium(-1)
                    this.anIntArray1816[i_182_] = class348_sub49_119_.readMedium(-1)
                    this.anIntArray1844[i_182_] = class348_sub49_119_.readMedium(-1)
                } else {
                    this.anIntArray1859!![i_182_] = class348_sub49_119_.readUnsignedShort(842397944)
                    if (this.anInt1830 >= 14) this.anIntArray1816[i_182_] = class348_sub49_119_.readMedium(-1)
                    else this.anIntArray1816[i_182_] = class348_sub49_119_.readUnsignedShort(842397944)
                    this.anIntArray1844[i_182_] = class348_sub49_119_.readUnsignedShort(842397944)
                }
                this.aByteArray1833[i_182_] = class348_sub49_120_.readByte(-86)
                this.aByteArray1853[i_182_] = class348_sub49_121_.readByte(-116)
                this.anIntArray1867[i_182_] = class348_sub49_122_.readByte(-79).toInt()
            }
            if (i_183_ == 2) {
                this.aShortArray1829[i_182_] = class348_sub49_118_.readUnsignedShort(842397944).toShort()
                this.aShortArray1849[i_182_] = class348_sub49_118_.readUnsignedShort(842397944).toShort()
                this.aShortArray1825[i_182_] = class348_sub49_118_.readUnsignedShort(842397944).toShort()
                if (this.anInt1830 >= 15) {
                    this.anIntArray1859!![i_182_] = class348_sub49_119_.readMedium(-1)
                    this.anIntArray1816[i_182_] = class348_sub49_119_.readMedium(-1)
                    this.anIntArray1844[i_182_] = class348_sub49_119_.readMedium(-1)
                } else {
                    this.anIntArray1859!![i_182_] = class348_sub49_119_.readUnsignedShort(842397944)
                    if (this.anInt1830 < 14) this.anIntArray1816[i_182_] = class348_sub49_119_.readUnsignedShort(842397944)
                    else this.anIntArray1816[i_182_] = class348_sub49_119_.readMedium(-1)
                    this.anIntArray1844[i_182_] = class348_sub49_119_.readUnsignedShort(842397944)
                }
                this.aByteArray1833[i_182_] = class348_sub49_120_.readByte(-97)
                this.aByteArray1853[i_182_] = class348_sub49_121_.readByte(-100)
                this.anIntArray1867[i_182_] = class348_sub49_122_.readByte(-124).toInt()
                this.anIntArray1857[i_182_] = class348_sub49_122_.readByte(-112).toInt()
                this.anIntArray1865[i_182_] = class348_sub49_122_.readByte(-114).toInt()
            }
            if (i_183_ == 3) {
                this.aShortArray1829[i_182_] = class348_sub49_118_.readUnsignedShort(842397944).toShort()
                this.aShortArray1849[i_182_] = class348_sub49_118_.readUnsignedShort(842397944).toShort()
                this.aShortArray1825[i_182_] = class348_sub49_118_.readUnsignedShort(842397944).toShort()
                if (this.anInt1830 < 15) {
                    this.anIntArray1859!![i_182_] = class348_sub49_119_.readUnsignedShort(842397944)
                    if (this.anInt1830 < 14) this.anIntArray1816[i_182_] = class348_sub49_119_.readUnsignedShort(842397944)
                    else this.anIntArray1816[i_182_] = class348_sub49_119_.readMedium(-1)
                    this.anIntArray1844[i_182_] = class348_sub49_119_.readUnsignedShort(842397944)
                } else {
                    this.anIntArray1859!![i_182_] = class348_sub49_119_.readMedium(-1)
                    this.anIntArray1816[i_182_] = class348_sub49_119_.readMedium(-1)
                    this.anIntArray1844[i_182_] = class348_sub49_119_.readMedium(-1)
                }
                this.aByteArray1833[i_182_] = class348_sub49_120_.readByte(-104)
                this.aByteArray1853[i_182_] = class348_sub49_121_.readByte(-127)
                this.anIntArray1867[i_182_] = class348_sub49_122_.readByte(-109).toInt()
            }
            i_182_++
        }
        class348_sub49.anInt7197 = i_165_
        if (bool_125_) {
            val i_184_ = class348_sub49.readUnsignedByte(255)
            if (i_184_ > 0) {
                this.aClass129Array1846 = arrayOfNulls<Class129>(i_184_)
                var i_185_ = 0
                while (i_184_ > i_185_) {
                    val i_186_ = class348_sub49.readUnsignedShort(842397944)
                    val i_187_ = class348_sub49.readUnsignedShort(842397944)
                    val i_188_: Byte
                    if (i_128_ != 255) i_188_ = i_128_.toByte()
                    else i_188_ = this.aByteArray1839!![i_187_]
                    this.aClass129Array1846!![i_185_] = (Class129(i_186_, this.aShortArray1863[i_187_].toInt(), this.aShortArray1835!![i_187_].toInt(), this.aShortArray1855[i_187_].toInt(), i_188_))
                    i_185_++
                }
            }
            val i_189_ = class348_sub49.readUnsignedByte(255)
            if (i_189_ > 0) {
                this.aClass342Array1866 = arrayOfNulls<Class342>(i_189_)
                var i_190_ = 0
                while (i_189_ > i_190_) {
                    val i_191_ = class348_sub49.readUnsignedShort(842397944)
                    val i_192_ = class348_sub49.readUnsignedShort(842397944)
                    this.aClass342Array1866!![i_190_] = Class342(i_191_, i_192_)
                    i_190_++
                }
            }
        }
        if (bool_126_) {
            val i_193_ = class348_sub49.readUnsignedByte(255)
            if (i_193_ > 0) {
                this.aClass162Array1832 = arrayOfNulls<Class162>(i_193_)
                var i_194_ = 0
                while (i_193_ > i_194_) {
                    val i_195_ = class348_sub49.readUnsignedShort(842397944)
                    val i_196_ = class348_sub49.readUnsignedShort(842397944)
                    val i_197_ = class348_sub49.readUnsignedByte(255)
                    val i_198_ = class348_sub49.readByte(-127)
                    this.aClass162Array1832!![i_194_] = Class162(i_195_, i_196_, i_197_, i_198_.toInt())
                    i_194_++
                }
            }
        }
    }

    fun method1107(i: Int, i_199_: Int, i_200_: Int, i_201_: Int) {
        if (i_200_ != 0) {
            val i_202_ = Class70.anIntArray1207!![i_200_]
            val i_203_ = Class70.anIntArray1204!![i_200_]
            for (i_204_ in 0..<this.anInt1836) {
                val i_205_ = ((i_203_ * this.anIntArray1841[i_204_] + this.anIntArray1847[i_204_] * i_202_) shr 14)
                this.anIntArray1847[i_204_] = ((-(this.anIntArray1841[i_204_] * i_202_) + this.anIntArray1847[i_204_] * i_203_) shr 14)
                this.anIntArray1841[i_204_] = i_205_
            }
        }
        if (i != 6875) this.aShortArray1835 = null
        anInt1837++
        if (i_201_ != 0) {
            val i_206_ = Class70.anIntArray1207!![i_201_]
            val i_207_ = Class70.anIntArray1204!![i_201_]
            for (i_208_ in 0..<this.anInt1836) {
                val i_209_ = ((this.anIntArray1847[i_208_] * i_207_ + -(i_206_ * this.anIntArray1852[i_208_])) shr 14)
                this.anIntArray1852[i_208_] = ((this.anIntArray1847[i_208_] * i_206_ - -(i_207_ * this.anIntArray1852[i_208_])) shr 14)
                this.anIntArray1847[i_208_] = i_209_
            }
        }
        if (i_199_ != 0) {
            val i_210_ = Class70.anIntArray1207!![i_199_]
            val i_211_ = Class70.anIntArray1204!![i_199_]
            var i_212_ = 0
            while (this.anInt1836 > i_212_) {
                val i_213_ = ((i_211_ * this.anIntArray1841[i_212_] + this.anIntArray1852[i_212_] * i_210_) shr 14)
                this.anIntArray1852[i_212_] = ((i_211_ * this.anIntArray1852[i_212_] + -(this.anIntArray1841[i_212_] * i_210_)) shr 14)
                this.anIntArray1841[i_212_] = i_213_
                i_212_++
            }
        }
    }

    constructor() {
        this.anInt1817 = 0
        this.aByte1851 = 0.toByte()
        this.anInt1821 = 0
        this.anInt1818 = 0
    }

    internal constructor(`is`: ByteArray) {
        this.anInt1817 = 0
        this.aByte1851 = 0.toByte()
        this.anInt1821 = 0
        this.anInt1818 = 0
        if (`is`[`is`.size + -1].toInt() == -1 && `is`[-2 + `is`.size].toInt() == -1) method1106(`is`, 93.toByte())
        else method1103(1, `is`)
    }

    internal constructor(i: Int, i_214_: Int, i_215_: Int) {
        this.anInt1817 = 0
        this.aByte1851 = 0.toByte()
        this.anInt1821 = 0
        this.anInt1818 = 0
        this.aByteArray1820 = ByteArray(i_214_)
        this.aShortArray1863 = ShortArray(i_214_)
        this.aShortArray1862 = ShortArray(i_214_)
        this.anIntArray1868 = IntArray(i)
        this.anIntArray1824 = IntArray(i_214_)
        this.anIntArray1852 = IntArray(i)
        if (i_215_ > 0) {
            this.anIntArray1857 = IntArray(i_215_)
            this.anIntArray1867 = IntArray(i_215_)
            this.aShortArray1849 = ShortArray(i_215_)
            this.anIntArray1844 = IntArray(i_215_)
            this.aShortArray1825 = ShortArray(i_215_)
            this.anIntArray1865 = IntArray(i_215_)
            this.aByteArray1833 = ByteArray(i_215_)
            this.anIntArray1859 = IntArray(i_215_)
            this.aShortArray1829 = ShortArray(i_215_)
            this.aByteArray1823 = ByteArray(i_215_)
            this.anIntArray1816 = IntArray(i_215_)
            this.aByteArray1853 = ByteArray(i_215_)
        }
        this.aShortArray1822 = ShortArray(i_214_)
        this.aByteArray1839 = ByteArray(i_214_)
        this.aShortArray1855 = ShortArray(i_214_)
        this.aShortArray1835 = ShortArray(i_214_)
        this.anIntArray1841 = IntArray(i)
        this.aByteArray1843 = ByteArray(i_214_)
        this.anIntArray1847 = IntArray(i)
        this.aByteArray1834 = ByteArray(i_214_)
    }

    internal constructor(class124s: Array<Class124?>, i: Int) {
        this.anInt1817 = 0
        this.aByte1851 = 0.toByte()
        this.anInt1821 = 0
        this.anInt1818 = 0
        this.anInt1818 = 0
        this.anInt1817 = 0
        this.anInt1836 = 0
        var i_216_ = 0
        var i_217_ = 0
        var i_218_ = 0
        var bool = false
        var bool_219_ = false
        var bool_220_ = false
        var bool_221_ = false
        var bool_222_ = false
        this.aByte1851 = (-1).toByte()
        var bool_223_ = false
        var i_224_ = 0
        while (i > i_224_) {
            val class124_225_ = class124s[i_224_]
            if (class124_225_ != null) {
                this.anInt1817 += class124_225_.anInt1817
                this.anInt1836 += class124_225_.anInt1836
                this.anInt1818 += class124_225_.anInt1818
                bool = bool or (class124_225_.aByteArray1843 != null)
                if (class124_225_.aClass162Array1832 != null) i_218_ += (class124_225_.aClass162Array1832!!).size
                if (class124_225_.aClass129Array1846 != null) i_216_ += (class124_225_.aClass129Array1846!!).size
                if (class124_225_.aClass342Array1866 != null) i_217_ += (class124_225_.aClass342Array1866!!).size
                bool_222_ = (bool_222_ or (class124_225_.aShortArray1822 != null))
                bool_221_ = (bool_221_ or (class124_225_.aByteArray1820 != null))
                if (class124_225_.aByteArray1839 == null) {
                    if (this.aByte1851.toInt() == -1) this.aByte1851 = class124_225_.aByte1851
                    if (this.aByte1851 != class124_225_.aByte1851) bool_219_ = true
                } else bool_219_ = true
                bool_220_ = (bool_220_ or (class124_225_.aByteArray1834 != null))
                bool_223_ = (bool_223_ or (class124_225_.anIntArray1824 != null))
            }
            i_224_++
        }
        this.aShortArray1835 = ShortArray(this.anInt1817)
        if (this.anInt1818 > 0) {
            this.aShortArray1829 = ShortArray(this.anInt1818)
            this.aByteArray1823 = ByteArray(this.anInt1818)
            this.anIntArray1867 = IntArray(this.anInt1818)
            this.anIntArray1844 = IntArray(this.anInt1818)
            this.aByteArray1833 = ByteArray(this.anInt1818)
            this.anIntArray1857 = IntArray(this.anInt1818)
            this.anIntArray1865 = IntArray(this.anInt1818)
            this.anIntArray1859 = IntArray(this.anInt1818)
            this.aByteArray1853 = ByteArray(this.anInt1818)
            this.aShortArray1849 = ShortArray(this.anInt1818)
            this.anIntArray1816 = IntArray(this.anInt1818)
            this.aShortArray1825 = ShortArray(this.anInt1818)
        }
        this.aShortArray1856 = ShortArray(this.anInt1817)
        if (bool_222_) this.aShortArray1822 = ShortArray(this.anInt1817)
        this.aShortArray1863 = ShortArray(this.anInt1817)
        if (bool_223_) this.anIntArray1824 = IntArray(this.anInt1817)
        if (bool_219_) this.aByteArray1839 = ByteArray(this.anInt1817)
        if (bool) this.aByteArray1843 = ByteArray(this.anInt1817)
        if (i_218_ > 0) this.aClass162Array1832 = arrayOfNulls<Class162>(i_218_)
        if (i_217_ > 0) this.aClass342Array1866 = arrayOfNulls<Class342>(i_217_)
        this.anIntArray1868 = IntArray(this.anInt1836)
        if (bool_221_) this.aByteArray1820 = ByteArray(this.anInt1817)
        this.anIntArray1852 = IntArray(this.anInt1836)
        this.aShortArray1862 = ShortArray(this.anInt1817)
        this.anIntArray1841 = IntArray(this.anInt1836)
        this.anIntArray1847 = IntArray(this.anInt1836)
        if (i_216_ > 0) this.aClass129Array1846 = arrayOfNulls<Class129>(i_216_)
        this.aShortArray1855 = ShortArray(this.anInt1817)
        if (bool_220_) this.aByteArray1834 = ByteArray(this.anInt1817)
        this.aShortArray1842 = ShortArray(this.anInt1836)
        this.anInt1818 = 0
        i_217_ = 0
        i_218_ = 0
        i_216_ = 0
        this.anInt1817 = 0
        this.anInt1836 = 0
        var i_226_ = 0
        while (i > i_226_) {
            val i_227_ = (1 shl i_226_).toShort()
            val class124_228_ = class124s[i_226_]
            if (class124_228_ != null) {
                if (class124_228_.aClass162Array1832 != null) {
                    var i_229_ = 0
                    while ((class124_228_.aClass162Array1832!!.size > i_229_)) {
                        val class162 = (class124_228_.aClass162Array1832!![i_229_])!!
                        this.aClass162Array1832!![i_218_++] = class162.method1266(5, ((class162.anInt2155) - -(this.anInt1817)))
                        i_229_++
                    }
                }
                var i_230_ = 0
                while (class124_228_.anInt1817 > i_230_) {
                    if (bool && class124_228_.aByteArray1843 != null) this.aByteArray1843!![(this.anInt1817)] = (class124_228_.aByteArray1843!![i_230_])
                    if (bool_219_) {
                        if (class124_228_.aByteArray1839 != null) this.aByteArray1839!![(this.anInt1817)] = (class124_228_.aByteArray1839!![i_230_])
                        else this.aByteArray1839!![(this.anInt1817)] = class124_228_.aByte1851
                    }
                    if (bool_220_ && class124_228_.aByteArray1834 != null) this.aByteArray1834!![(this.anInt1817)] = (class124_228_.aByteArray1834!![i_230_])
                    if (bool_222_) {
                        if (class124_228_.aShortArray1822 == null) this.aShortArray1822!![this.anInt1817] = (-1).toShort()
                        else this.aShortArray1822!![this.anInt1817] = (class124_228_.aShortArray1822!![i_230_])
                    }
                    if (bool_223_) {
                        if (class124_228_.anIntArray1824 == null) this.anIntArray1824!![(this.anInt1817)] = -1
                        else this.anIntArray1824!![(this.anInt1817)] = (class124_228_.anIntArray1824!![i_230_])
                    }
                    this.aShortArray1863[(this.anInt1817)] = method1104(class124_228_, 0, (class124_228_.aShortArray1863[i_230_]).toInt(), i_227_).toShort()
                    this.aShortArray1835!![(this.anInt1817)] = method1104(class124_228_, 0, (class124_228_.aShortArray1835!![i_230_]).toInt(), i_227_).toShort()
                    this.aShortArray1855[(this.anInt1817)] = method1104(class124_228_, 0, (class124_228_.aShortArray1855[i_230_]).toInt(), i_227_).toShort()
                    this.aShortArray1856!![(this.anInt1817)] = i_227_
                    this.aShortArray1862[(this.anInt1817)] = class124_228_.aShortArray1862[i_230_]
                    this.anInt1817++
                    i_230_++
                }
                if (class124_228_.aClass129Array1846 != null) {
                    var i_231_ = 0
                    while ((class124_228_.aClass129Array1846!!.size > i_231_)) {
                        val i_232_ = method1104(class124_228_, 0, class124_228_.aClass129Array1846!![i_231_]!!.anInt1881, i_227_)
                        val i_233_ = method1104(class124_228_, 0, class124_228_.aClass129Array1846!![i_231_]!!.anInt1877, i_227_)
                        val i_234_ = method1104(class124_228_, 0, class124_228_.aClass129Array1846!![i_231_]!!.anInt1892, i_227_)
                        this.aClass129Array1846!![i_216_] = class124_228_.aClass129Array1846!![i_231_]!!.method1124(i_233_, -1, i_234_, i_232_)
                        i_216_++
                        i_231_++
                    }
                }
                if (class124_228_.aClass342Array1866 != null) {
                    var i_235_ = 0
                    while ((class124_228_.aClass342Array1866!!).size > i_235_) {
                        val i_236_ = method1104(class124_228_, 0, class124_228_.aClass342Array1866!![i_235_]!!.anInt4244, i_227_)
                        this.aClass342Array1866!![i_217_] = class124_228_.aClass342Array1866!![i_235_]!!.method2687(94.toByte(), i_236_)
                        i_217_++
                        i_235_++
                    }
                }
            }
            i_226_++
        }
        var i_237_ = 0
        this.anInt1821 = this.anInt1836
        var i_238_ = 0
        while (i > i_238_) {
            val i_239_ = (1 shl i_238_).toShort()
            val class124_240_ = class124s[i_238_]
            if (class124_240_ != null) {
                var i_241_ = 0
                while (class124_240_.anInt1817 > i_241_) {
                    if (bool_221_) this.aByteArray1820!![i_237_++] = (if ((class124_240_.aByteArray1820) != null && (class124_240_.aByteArray1820!![i_241_]).toInt() != -1) ((class124_240_.aByteArray1820!![i_241_]) + this.anInt1818) else -1).toByte()
                    i_241_++
                }
                var i_242_ = 0
                while ((class124_240_.anInt1818 > i_242_)) {
                    val i_243_ = ((class124_240_.aByteArray1823[i_242_]).also { this.aByteArray1823[(this.anInt1818)] = it })
                    if (i_243_.toInt() == 0) {
                        this.aShortArray1829[(this.anInt1818)] = method1104(class124_240_, 0, (class124_240_.aShortArray1829[i_242_]).toInt(), i_239_).toShort()
                        this.aShortArray1849[(this.anInt1818)] = method1104(class124_240_, 0, (class124_240_.aShortArray1849[i_242_]).toInt(), i_239_).toShort()
                        this.aShortArray1825[(this.anInt1818)] = method1104(class124_240_, 0, (class124_240_.aShortArray1825[i_242_]).toInt(), i_239_).toShort()
                    }
                    if (i_243_ >= 1 && i_243_ <= 3) {
                        this.aShortArray1829[(this.anInt1818)] = (class124_240_.aShortArray1829[i_242_])
                        this.aShortArray1849[(this.anInt1818)] = (class124_240_.aShortArray1849[i_242_])
                        this.aShortArray1825[(this.anInt1818)] = (class124_240_.aShortArray1825[i_242_])
                        this.anIntArray1859!![(this.anInt1818)] = (class124_240_.anIntArray1859!![i_242_])
                        this.anIntArray1816[(this.anInt1818)] = (class124_240_.anIntArray1816[i_242_])
                        this.anIntArray1844[(this.anInt1818)] = (class124_240_.anIntArray1844[i_242_])
                        this.aByteArray1833[(this.anInt1818)] = (class124_240_.aByteArray1833[i_242_])
                        this.aByteArray1853[(this.anInt1818)] = (class124_240_.aByteArray1853[i_242_])
                        this.anIntArray1867[(this.anInt1818)] = (class124_240_.anIntArray1867[i_242_])
                    }
                    if (i_243_.toInt() == 2) {
                        this.anIntArray1857[(this.anInt1818)] = (class124_240_.anIntArray1857[i_242_])
                        this.anIntArray1865[(this.anInt1818)] = (class124_240_.anIntArray1865[i_242_])
                    }
                    this.anInt1818++
                    i_242_++
                }
            }
            i_238_++
        }
    }

    companion object {
        @JvmField
        var anInt1819: Int = 0
        @JvmField
        var anInt1826: Int = 0
        @JvmField
        var anInt1827: Int = 0
        @JvmField
        var anInt1828: Int = 0
        @JvmField
        var anInt1831: Int = 0
        @JvmField
        var anInt1837: Int = 0
        @JvmField
        var anInt1838: Int = 0
        @JvmField
        var anInt1840: Int = 0
        @JvmField
        var anInt1845: Int = 0
        @JvmField
        var aClass45_1848: Class45? = null
        @JvmField
        var anInt1850: Int = 0
        @JvmField
        var anInt1854: Int = 0
        @JvmField
        var anInt1858: Int = 0
        @JvmField
        var anInt1860: Int = 0
        @JvmField
        var anInt1861: Int = 0
        @JvmField
        var anInt1864: Int = 0
        @JvmField
        var anInt1869: Int = 0

        @JvmStatic
        fun method1096(i: Int) {
            if (i >= 88) aClass45_1848 = null
        }

        fun method1097(i: Byte, i_20_: Int, random: Random): Int {
            anInt1861++
            require(i_20_ > 0)
            if (Class192.method1436(-19, i_20_)) return (i_20_.toLong() * (0xffffffffL and random.nextInt().toLong()) shr 32).toInt()
            val i_21_ = -2147483648 + -(4294967296L % i_20_.toLong()).toInt()
            if (i < 78) aClass45_1848 = null
            var i_22_: Int
            do i_22_ = random.nextInt() while (i_22_ >= i_21_)
            return Class350.method3452(i_22_, (-15).toByte(), i_20_)
        }

        @JvmStatic
        fun method1108(i: Byte, canvas: Canvas) {
            anInt1850++
            val dimension = canvas.getSize()
            if (i.toInt() != -99) method1096(57)
            method828(38.toByte(), dimension.height, dimension.width)
            if (Class348_Sub49.anInt7207 != 1) Class21.aHa326!!.method3643(canvas, Class59_Sub1.anInt5283, Class107.anInt1651)
            else Class21.aHa326!!.method3643(canvas, Class348_Sub16_Sub1.anInt8854, Class239_Sub16.anInt6008)
        }
    }
}
