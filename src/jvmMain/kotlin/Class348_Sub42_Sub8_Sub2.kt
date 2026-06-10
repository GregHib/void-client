import Applet_Sub1.Companion.method94
import Applet_Sub1.Companion.set
import Class110.Companion.method1034
import Class238.Companion.method1703
import Class239.Companion.method1713
import Class239_Sub16.Companion.method1788
import Class239_Sub19.Companion.method1803
import Class239_Sub25.Companion.method1825
import Class239_Sub28.Companion.method1844
import Class239_Sub29.Companion.method1851
import Class285_Sub1.Companion.method2127
import Class318_Sub1_Sub1.Companion.method2396
import Class324.Companion.method2570
import Class348_Sub42_Sub9.Companion.method3203
import Class367_Sub8.Companion.method3546
import Class377.Companion.method3965
import InputStream_Sub2.Companion.method128
import java.io.IOException

class Class348_Sub42_Sub8_Sub2 internal constructor(private val anObject10429: Any?, i: Int) : Class348_Sub42_Sub8(i) {
    override fun method3195(i: Int): Boolean {
        if (i != -4) Companion.method3202((-58).toByte())
        anInt10438++
        return false
    }

    override fun method3193(i: Int): Any? {
        anInt10435++
        if (i < 75) method3193(-128)
        return anObject10429
    }

    companion object {
        @JvmField
        var anInt10430: Int = 0
        @JvmField
        var aLongArrayArrayArray10431: Array<Array<LongArray?>?>? = null
        @JvmField
        var anInt10432: Int = 0
        @JvmField
        var anInt10433: Int = 0
        @JvmField
        var aClass230_10434: Class230? = null
        @JvmField
        var anInt10435: Int = 0
        @JvmField
        var aClass76_10436: Class76? = Class76(true)
        @JvmField
        var aClass74_10437: Class74? = Class74(0, 3)
        @JvmField
        var anInt10438: Int = 0

        @JvmStatic
        fun method3200(i: Int, i_0_: Int, i_1_: Byte): Boolean {
            anInt10433++
            val i_2_ = 18 / ((i_1_ - 30) / 42)
            if (!Class296.method2224(i, (-118).toByte(), i_0_)) return false
            if (Class239_Sub26.method1833((-118).toByte(), i, i_0_) or ((0x9000 and i) != 0) or Class348_Sub23_Sub4.method2985(-31735, i_0_, i)) return true
            return (((0x37 and i_0_) == 0) and (((0x2000 and i) != 0) or Class274.method2058(i, i_0_, 88) or method3203(i_0_, 127.toByte(), i)))
        }

        @JvmStatic
        @Throws(IOException::class)
        fun method3201(bool: Boolean): Boolean {
            anInt10430++
            if (Class348_Sub40_Sub8.aClass238_9165 == null) return false
            if (Class348_Sub3.aClass114_6584 == null) {
                if (Class108.aBoolean1661) {
                    if (!Class348_Sub40_Sub8.aClass238_9165!!.method1705(1, 119)) return false
                    Class348_Sub40_Sub8.aClass238_9165!!.method1701(1, 0, 6.toByte(), (Class299.aClass348_Sub49_Sub2_3813!!.aByteArray7154!!))
                    Class348_Sub50.anInt7213 = 0
                    Class108.aBoolean1661 = false
                    Class13.anInt221++
                }
                Class299.aClass348_Sub49_Sub2_3813!!.anInt7197 = 0
                if (Class299.aClass348_Sub49_Sub2_3813!!.method3404(-1510)) {
                    if (!Class348_Sub40_Sub8.aClass238_9165!!.method1705(1, 119)) return false
                    Class348_Sub40_Sub8.aClass238_9165!!.method1701(1, 1, 26.toByte(), (Class299.aClass348_Sub49_Sub2_3813!!.aByteArray7154!!))
                    Class13.anInt221++
                    Class348_Sub50.anInt7213 = 0
                }
                Class108.aBoolean1661 = true
                val class114s = Class14_Sub3.method248(-11271)
                val i = Class299.aClass348_Sub49_Sub2_3813!!.method3407(15295)
                if (i < 0 || i >= class114s.size) throw IOException("invo:" + i + " ip:" + (Class299.aClass348_Sub49_Sub2_3813!!.anInt7197))
                Class348_Sub3.aClass114_6584 = class114s[i]
                if (Loader.debug) {
                    println("Packet read: " + i + " length: " + Class348_Sub3.aClass114_6584!!.anInt1749)
                }
                Class348_Sub40_Sub25.anInt9341 = Class348_Sub3.aClass114_6584!!.anInt1749
            }
            if (Class348_Sub40_Sub25.anInt9341 == -1) {
                if (!Class348_Sub40_Sub8.aClass238_9165!!.method1705(1, 116)) return false
                Class348_Sub40_Sub8.aClass238_9165!!.method1701(1, 0, (-118).toByte(), (Class299.aClass348_Sub49_Sub2_3813!!.aByteArray7154!!))
                Class348_Sub40_Sub25.anInt9341 = 0xff and (Class299.aClass348_Sub49_Sub2_3813!!.aByteArray7154!![0]).toInt()
                Class13.anInt221++
                Class348_Sub50.anInt7213 = 0
            }
            if (Class348_Sub40_Sub25.anInt9341 == -2) {
                if (!Class348_Sub40_Sub8.aClass238_9165!!.method1705(2, 120)) return false
                Class348_Sub40_Sub8.aClass238_9165!!.method1701(2, 0, 127.toByte(), (Class299.aClass348_Sub49_Sub2_3813!!.aByteArray7154!!))
                Class299.aClass348_Sub49_Sub2_3813!!.anInt7197 = 0
                Class348_Sub40_Sub25.anInt9341 = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                Class13.anInt221 += 2
                Class348_Sub50.anInt7213 = 0
            }
            if (Class348_Sub40_Sub25.anInt9341 > 0) {
                if (!Class348_Sub40_Sub8.aClass238_9165!!.method1705(Class348_Sub40_Sub25.anInt9341, 104)) return false
                Class299.aClass348_Sub49_Sub2_3813!!.anInt7197 = 0
                Class348_Sub40_Sub8.aClass238_9165!!.method1701(Class348_Sub40_Sub25.anInt9341, 0, (-123).toByte(), (Class299.aClass348_Sub49_Sub2_3813!!.aByteArray7154!!))
                Class13.anInt221 += Class348_Sub40_Sub25.anInt9341
                Class348_Sub50.anInt7213 = 0
            }
            Class348_Sub40_Sub36.aClass114_9456 = Class239.aClass114_3145
            Class239.aClass114_3145 = Class238.aClass114_3133
            Class238.aClass114_3133 = Class348_Sub3.aClass114_6584
            if (IOException_Sub1.aClass114_90 == Class348_Sub3.aClass114_6584) {
                Class43.method382(Class299.aClass348_Sub49_Sub2_3813!!.readString(118.toByte()), true)
                Class348_Sub3.aClass114_6584 = null
                return true
            }
            if (Class348_Sub3.aClass114_6584 == Class348_Sub42_Sub3.aClass114_9503) {
                val i = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255)
                val bool_3_ = (i and 0x1) == 1
                val string = Class299.aClass348_Sub49_Sub2_3813!!.readString(108.toByte())
                var string_4_ = Class299.aClass348_Sub49_Sub2_3813!!.readString((-92).toByte())
                if (string_4_ == "") string_4_ = string
                val string_5_ = Class299.aClass348_Sub49_Sub2_3813!!.readString((-64).toByte())
                var string_6_ = Class299.aClass348_Sub49_Sub2_3813!!.readString((-97).toByte())
                if (string_6_ == "") string_6_ = string_5_
                if (bool_3_) {
                    var i_7_ = 0
                    while ((i_7_ < Class348_Sub42_Sub12.anInt9604)) {
                        if (Class122.aStringArray1808!![i_7_] == string_6_) {
                            Class51.aStringArray932!![i_7_] = string
                            Class122.aStringArray1808!![i_7_] = string_4_
                            Class348_Sub40_Sub21.aStringArray9275!![i_7_] = string_5_
                            aa_Sub2.aStringArray5197!![i_7_] = string_6_
                            break
                        }
                        i_7_++
                    }
                } else {
                    Class51.aStringArray932!![Class348_Sub42_Sub12.anInt9604] = string
                    Class122.aStringArray1808!![Class348_Sub42_Sub12.anInt9604] = string_4_
                    Class348_Sub40_Sub21.aStringArray9275!![(Class348_Sub42_Sub12.anInt9604)] = string_5_
                    aa_Sub2.aStringArray5197!![Class348_Sub42_Sub12.anInt9604] = string_6_
                    Class367_Sub3.aBooleanArray7304!![Class348_Sub42_Sub12.anInt9604] = Class139.method1166(i, 2) == 2
                    Class348_Sub42_Sub12.anInt9604++
                }
                Class126.anInt4985 = Class311.anInt3918
                Class348_Sub3.aClass114_6584 = null
                return true
            }
            if (Class348_Sub3.aClass114_6584 == Class318_Sub6.aClass114_6424) {
                method128(Class348_Sub26.aClass74_6891, 8.toByte())
                Class348_Sub3.aClass114_6584 = null
                return true
            }
            if (Class356.aClass114_4388 == Class348_Sub3.aClass114_6584) {
                val i = Class299.aClass348_Sub49_Sub2_3813!!.readByte(-100)
                val i_8_ = Class299.aClass348_Sub49_Sub2_3813!!.readShortAddLittle(-111)
                Class318_Sub1_Sub1_Sub1.method2397((-126).toByte())
                Class50_Sub3.method467(i_8_, -18075, i.toInt())
                Class348_Sub3.aClass114_6584 = null
                return true
            }
            if (Class135_Sub1.aClass114_4707 == Class348_Sub3.aClass114_6584) {
                val i = Class299.aClass348_Sub49_Sub2_3813!!.readIntLittle((-123).toByte())
                val i_9_ = Class299.aClass348_Sub49_Sub2_3813!!.readInt((-126).toByte())
                Class318_Sub1_Sub1_Sub1.method2397((-124).toByte())
                val class348_sub41 = (Class125.aClass356_4915!!.method3480(i_9_.toLong(), -6008) as Class348_Sub41?)
                val class348_sub41_10_ = (Class125.aClass356_4915!!.method3480(i.toLong(), -6008) as Class348_Sub41?)
                if (class348_sub41_10_ != null) Class127_Sub1.method1118((class348_sub41 == null || (class348_sub41_10_.anInt7050 != class348_sub41.anInt7050)), false, class348_sub41_10_, 2533)
                if (class348_sub41 != null) {
                    class348_sub41.method2715(32.toByte())
                    Class125.aClass356_4915!!.method3483(102.toByte(), i.toLong(), class348_sub41)
                }
                var class46 = method2570(1512932720, i_9_)
                if (class46 != null) Class251.method1916(-9343, class46)
                class46 = method2570(1512932720, i)
                if (class46 != null) {
                    Class251.method1916(-9343, class46)
                    Class251.method1913(true, -123, class46)
                }
                if (r.anInt9721 != -1) Class239_Sub12.method1775((-8).toByte(), r.anInt9721, 1)
                Class348_Sub3.aClass114_6584 = null
                return true
            }
            if (bool != true) aClass230_10434 = null
            if (Class348_Sub3.aClass114_6584 == Class116.aClass114_1762) {
                Class239_Sub4.aString5882 = (if (Class348_Sub40_Sub25.anInt9341 > 2) Class299.aClass348_Sub49_Sub2_3813!!.readString((-119).toByte()) else Class274.aClass274_3509!!.method2063(Class348_Sub33.anInt6967, 544))
                Class333.anInt4144 = (if (Class348_Sub40_Sub25.anInt9341 <= 0) -1 else Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944))
                if (Class333.anInt4144 == 65535) Class333.anInt4144 = -1
                Class348_Sub3.aClass114_6584 = null
                return true
            }
            if (Class239.aClass114_3135 == Class348_Sub3.aClass114_6584) {
                val i = Class299.aClass348_Sub49_Sub2_3813!!.readByteAdd(62.toByte())
                val i_11_ = Class299.aClass348_Sub49_Sub2_3813!!.readIntLittle((-126).toByte())
                Class318_Sub1_Sub1_Sub1.method2397((-124).toByte())
                Class348_Sub15.method2813(true, i, i_11_)
                Class348_Sub3.aClass114_6584 = null
                return true
            }
            if (Class348_Sub3.aClass114_6584 == Class20.aClass114_316) {
                val i = Class299.aClass348_Sub49_Sub2_3813!!.readIntInverseMiddle(255)
                val i_12_ = Class299.aClass348_Sub49_Sub2_3813!!.readShortLittle(false)
                val i_13_ = Class299.aClass348_Sub49_Sub2_3813!!.readShortAdd(10)
                val i_14_ = Class299.aClass348_Sub49_Sub2_3813!!.readShortLittle(false)
                Class318_Sub1_Sub1_Sub1.method2397((-127).toByte())
                method1703(7, i, i_13_ shl 16 or i_14_, 4, i_12_)
                Class348_Sub3.aClass114_6584 = null
                return true
            }
            if (Class348_Sub40_Sub15.aClass114_9216 == Class348_Sub3.aClass114_6584) {
                Class128.anInt1872 = Class299.aClass348_Sub49_Sub2_3813!!.readShort(13638)
                Class348_Sub3.aClass114_6584 = null
                Class348_Sub40_Sub23.anInt9313 = Class311.anInt3918
                return true
            }
            if (Class348_Sub3.aClass114_6584 == Class330.aClass114_4126) {
                method128(Class348_Sub16_Sub1.aClass74_8853, 8.toByte())
                Class348_Sub3.aClass114_6584 = null
                return true
            }
            if (Class348_Sub3.aClass114_6584 == Class173.aClass114_2285) {
                val i = Class299.aClass348_Sub49_Sub2_3813!!.readIntMiddleEndian(82.toByte())
                Class318_Sub1_Sub1_Sub1.method2397((-124).toByte())
                method1703(3, i, -1, 4, -1)
                Class348_Sub3.aClass114_6584 = null
                return true
            }
            if (Class348_Sub3.aClass114_6584 == Class22.aClass114_330) {
                val bool_15_ = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255) == 1
                val string = Class299.aClass348_Sub49_Sub2_3813!!.readString((-34).toByte())
                var string_16_ = string
                if (bool_15_) string_16_ = Class299.aClass348_Sub49_Sub2_3813!!.readString((-64).toByte())
                val l = Class299.aClass348_Sub49_Sub2_3813!!.readLong(-456577760)
                val l_17_ = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944).toLong()
                val l_18_ = Class299.aClass348_Sub49_Sub2_3813!!.readMedium(-1).toLong()
                val i = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255)
                val l_19_ = l_18_ + (l_17_ shl 32)
                var bool_20_ = false
                while_217_@ do {
                    for (i_21_ in 0..99) {
                        if (l_19_ == Class357.aLongArray4410!![i_21_]) {
                            bool_20_ = true
                            break@while_217_
                        }
                    }
                    if (i <= 1) {
                        if ((Class348_Sub40_Sub3.aBoolean9103 && !Class133.aBoolean1915) || Class50_Sub2.aBoolean5233) bool_20_ = true
                        else if (Class351.method3455(string_16_, 28280)) bool_20_ = true
                    }
                } while (false)
                if (!bool_20_ && Class250.anInt3227 == 0) {
                    Class357.aLongArray4410!![Class79.anInt1359] = l_19_
                    Class79.anInt1359 = (1 + Class79.anInt1359) % 100
                    val string_22_ = (Class59_Sub2_Sub2.method572((Class348_Sub40_Sub32.method3136(64.toByte(), Class299.aClass348_Sub49_Sub2_3813)), 23034))
                    if (i == 2 || i == 3) Class318_Sub1_Sub3_Sub5.method2477("<img=1>" + string_16_, string_22_, (-126).toByte(), -1, "<img=1>" + string, Class239_Sub16.method1788((-76).toByte(), l), 9, 0, string)
                    else if (i != 1) Class318_Sub1_Sub3_Sub5.method2477(string_16_, string_22_, (-125).toByte(), -1, string, Class239_Sub16.method1788((-83).toByte(), l), 9, 0, string)
                    else Class318_Sub1_Sub3_Sub5.method2477("<img=0>" + string_16_, string_22_, (-126).toByte(), -1, "<img=0>" + string, Class239_Sub16.method1788((-75).toByte(), l), 9, 0, string)
                }
                Class348_Sub3.aClass114_6584 = null
                return true
            }
            if (Class348_Sub3.aClass114_6584 == Class295.aClass114_3751) {
                val i = Class299.aClass348_Sub49_Sub2_3813!!.readShortLittle(!bool)
                Class318_Sub1_Sub1_Sub1.method2397((-126).toByte())
                Class143.method1189(-1, i)
                Class348_Sub3.aClass114_6584 = null
                return true
            }
            if (Class348_Sub3.aClass114_6584 == InputStream_Sub2.aClass114_82) {
                method128(Class39.aClass74_515, 8.toByte())
                Class348_Sub3.aClass114_6584 = null
                return true
            }
            if (Class348_Sub3.aClass114_6584 == Class73.aClass114_4779) {
                val i = Class299.aClass348_Sub49_Sub2_3813!!.readByteAdd((-78).toByte())
                val i_23_ = Class299.aClass348_Sub49_Sub2_3813!!.readByteInverse(21.toByte())
                val i_24_ = Class299.aClass348_Sub49_Sub2_3813!!.readShortAdd(127)
                val i_25_ = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedByteSubtract((-128).toByte())
                val i_26_ = Class299.aClass348_Sub49_Sub2_3813!!.readByteInverse(21.toByte())
                Class318_Sub1_Sub1_Sub1.method2397((-127).toByte())
                Class181.aBooleanArray2374!![i_23_] = true
                Class275.anIntArray3552!![i_23_] = i
                Class255.anIntArray3273!![i_23_] = i_25_
                Class338.anIntArray4196!![i_23_] = i_26_
                Class318_Sub1_Sub1_Sub2.anIntArray9981!![i_23_] = i_24_
                Class348_Sub3.aClass114_6584 = null
                return true
            }
            if (Class348_Sub3.aClass114_6584 == Class239_Sub24.aClass114_6089) {
                Class73.anInt4786 = (Class299.aClass348_Sub49_Sub2_3813!!.readByteInverse(-622951480).toInt() shl 3)
                Class348_Sub40_Sub12.anInt9200 = Class299.aClass348_Sub49_Sub2_3813!!.readByteAdd((-84).toByte())
                Class278.anInt3581 = (Class299.aClass348_Sub49_Sub2_3813!!.method3341(-8679).toInt() shl 3)
                Class348_Sub3.aClass114_6584 = null
                return true
            }
            if (Class348_Sub3.aClass114_6584 == Class19.aClass114_304) {
                Class90.method853(99.toByte())
                Class348_Sub3.aClass114_6584 = null
                return false
            }
            if (Class345.aClass114_4269 == Class348_Sub3.aClass114_6584) {
                val i = Class299.aClass348_Sub49_Sub2_3813!!.readByteAdd(71.toByte())
                Class318_Sub1_Sub1_Sub1.method2397((-128).toByte())
                Class37.anInt495 = i
                Class348_Sub3.aClass114_6584 = null
                return true
            }
            if (Class369_Sub2.aClass114_8590 == Class348_Sub3.aClass114_6584) {
                method128(Class374.aClass74_4537, 8.toByte())
                Class348_Sub3.aClass114_6584 = null
                return true
            }
            if (Class348_Sub3.aClass114_6584 == Class252.aClass114_3240) {
                val i = Class299.aClass348_Sub49_Sub2_3813!!.readShortAddLittle(-117)
                val i_27_ = Class299.aClass348_Sub49_Sub2_3813!!.readShortAdd(125)
                Class318_Sub1_Sub1_Sub1.method2397((-128).toByte())
                method2396(i, i_27_, 0, 3)
                Class348_Sub3.aClass114_6584 = null
                return true
            }
            if (Class322.aClass114_4027 == Class348_Sub3.aClass114_6584) {
                var i = Class299.aClass348_Sub49_Sub2_3813!!.readShortLittle(false)
                if (i == 65535) i = -1
                val i_28_ = Class299.aClass348_Sub49_Sub2_3813!!.readIntInverseMiddle(255)
                val i_29_ = Class299.aClass348_Sub49_Sub2_3813!!.readInt((-126).toByte())
                Class318_Sub1_Sub1_Sub1.method2397((-128).toByte())
                Class70.method727((-63).toByte(), i_29_, i, i_28_)
                val class213 = Exception_Sub1.aClass255_112!!.method1940(-126, i)
                Class122.method1085(class213.anInt2825, class213.anInt2787, (-59).toByte(), class213.anInt2781, i_28_)
                Class34.method350(class213.anInt2779, class213.anInt2826, 125, i_28_, class213.anInt2810)
                Class348_Sub3.aClass114_6584 = null
                return true
            }
            if (Class133.aClass114_1917 == Class348_Sub3.aClass114_6584) {
                val i = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                val i_30_ = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255)
                val bool_31_ = (0x1 and i_30_) == 1
                Class187.method1405(i, bool_31_, true)
                val i_32_ = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                for (i_33_ in 0..<i_32_) {
                    var i_34_ = Class299.aClass348_Sub49_Sub2_3813!!.readByteAdd((-127).toByte())
                    if (i_34_ == 255) {
                        val index = Class299.aClass348_Sub49_Sub2_3813!!.anInt7197
                        val data = Class299.aClass348_Sub49_Sub2_3813!!.aByteArray7154
                        i_34_ = Class299.aClass348_Sub49_Sub2_3813!!.readIntMiddleEndian(82.toByte())
                    }
                    val i_35_ = Class299.aClass348_Sub49_Sub2_3813!!.readShortAdd(-78)
                    Canvas_Sub1.method121(i, -364570972, bool_31_, i_33_, i_34_, i_35_ - 1)
                }
                Class199.anIntArray2633!![Class139.method1166(31, Class106.anInt1631++)] = i
                Class348_Sub3.aClass114_6584 = null
                return true
            }
            if (Class348_Sub3.aClass114_6584 == Class296.aClass114_3773) {
                Class348_Sub40_Sub34.method3141(false, 11.toByte())
                Class348_Sub3.aClass114_6584 = null
                return false
            }
            if (Class348_Sub3.aClass114_6584 == Class298.aClass114_3809) {
                val i = Class299.aClass348_Sub49_Sub2_3813!!.readIntInverseMiddle(255)
                val i_36_ = Class299.aClass348_Sub49_Sub2_3813!!.readShortAdd(124)
                Class318_Sub1_Sub3_Sub3.aClass170_10209!!.method1313(42.toByte(), i, i_36_)
                Class348_Sub3.aClass114_6584 = null
                return true
            }
            if (Class348_Sub3.aClass114_6584 == Class239_Sub20.aClass114_6056) {
                val i = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedByteSubtract(75.toByte())
                val i_37_ = Class299.aClass348_Sub49_Sub2_3813!!.readShortAdd(124)
                var i_38_ = Class299.aClass348_Sub49_Sub2_3813!!.readShortAdd(125)
                val i_39_ = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                val i_40_ = Class299.aClass348_Sub49_Sub2_3813!!.readIntMiddleEndian(82.toByte())
                val bool_41_ = (0x80 and i) != 0
                val i_42_ = 0x7 and i
                var i_43_ = (i and 0x7e) shr 3
                if (i_43_ == 15) i_43_ = -1
                if (i_40_ shr 30 == 0) {
                    if (i_40_ shr 29 != 0) {
                        val i_44_ = i_40_ and 0xffff
                        val class348_sub22 = (Class282.aClass356_3654!!.method3480(i_44_.toLong(), -6008) as Class348_Sub22?)
                        if (class348_sub22 != null) {
                            val npc = (class348_sub22.aNpc_6859)!!
                            if (i_38_ == 65535) i_38_ = -1
                            var bool_45_ = true
                            val i_46_ = (if (!bool_41_) npc.anInt10269 else npc.anInt10291)
                            if (i_38_ != -1 && i_46_ != -1) {
                                if (i_46_ == i_38_) {
                                    val class368 = Class348_Sub40_Sub18.aClass319_9245!!.method2543(55.toByte(), i_38_)
                                    if (class368.aBoolean4487 && class368.anInt4503 != -1) {
                                        val class17 = (Class10.aClass87_191!!.method835(class368.anInt4503, 7))
                                        val i_47_ = class17.anInt248
                                        if (i_47_ != 0 && i_47_ != 2) {
                                            if (i_47_ == 1) bool_45_ = true
                                        } else bool_45_ = false
                                    }
                                } else {
                                    val class368 = Class348_Sub40_Sub18.aClass319_9245!!.method2543(105.toByte(), i_38_)
                                    val class368_48_ = Class348_Sub40_Sub18.aClass319_9245!!.method2543(56.toByte(), i_46_)
                                    if (class368.anInt4503 != -1 && (class368_48_.anInt4503 != -1)) {
                                        val class17 = (Class10.aClass87_191!!.method835(class368.anInt4503, 7))
                                        val class17_49_ = (Class10.aClass87_191!!.method835((class368_48_.anInt4503), 7))
                                        if (class17.anInt239 < class17_49_.anInt239) bool_45_ = false
                                    }
                                }
                            }
                            if (bool_45_) {
                                if (bool_41_) {
                                    npc.anInt10211 = i_39_ + Class367_Sub11.anInt7396
                                    npc.anInt10260 = i_37_
                                    npc.anInt10291 = i_38_
                                    npc.anInt10289 = i_43_
                                    npc.anInt10202 = i_42_
                                    npc.anInt10273 = 0
                                    npc.anInt10276 = 1
                                    npc.anInt10224 = 0
                                    if (npc.anInt10211 > Class367_Sub11.anInt7396) npc.anInt10224 = -1
                                    if (npc.anInt10291 != -1 && (Class367_Sub11.anInt7396 == (npc.anInt10211))) {
                                        val i_51_ = (Class348_Sub40_Sub18.aClass319_9245!!.method2543(103.toByte(), (npc.anInt10291)).anInt4503)
                                        if (i_51_ != -1) {
                                            val class17 = Class10.aClass87_191!!.method835(i_51_, 7)
                                            if (class17 != null && (class17.anIntArray237) != null && !(npc.aBoolean10309)) Class287.method2178(npc, 0, class17, -17)
                                        }
                                    }
                                } else {
                                    npc.anInt10243 = 0
                                    npc.anInt10220 = i_37_
                                    npc.anInt10269 = i_38_
                                    npc.anInt10240 = 0
                                    npc.anInt10278 = i_43_
                                    npc.anInt10225 = Class367_Sub11.anInt7396 + i_39_
                                    npc.anInt10237 = i_42_
                                    npc.anInt10283 = 1
                                    if (npc.anInt10225 > Class367_Sub11.anInt7396) npc.anInt10240 = -1
                                    if (npc.anInt10269 != -1 && (Class367_Sub11.anInt7396 == (npc.anInt10225))) {
                                        val i_50_ = (Class348_Sub40_Sub18.aClass319_9245!!.method2543(87.toByte(), (npc.anInt10269)).anInt4503)
                                        if (i_50_ != -1) {
                                            val class17 = Class10.aClass87_191!!.method835(i_50_, 7)
                                            if (class17 != null && (class17.anIntArray237) != null && !(npc.aBoolean10309)) Class287.method2178(npc, 0, class17, -44)
                                        }
                                    }
                                }
                            }
                        }
                    } else if (i_40_ shr 28 != 0) {
                        val i_52_ = i_40_ and 0xffff
                        val player: Player?
                        if (Class348_Sub42_Sub11.anInt9591 != i_52_) player = (Class294.aPlayerArray5058!![i_52_])
                        else player = Class132.aPlayer_1907
                        if (player != null) {
                            if (i_38_ == 65535) i_38_ = -1
                            var bool_53_ = true
                            val i_54_ = (if (!bool_41_) player.anInt10269 else player.anInt10291)
                            if (i_38_ != -1 && i_54_ != -1) {
                                if (i_38_ == i_54_) {
                                    val class368 = Class348_Sub40_Sub18.aClass319_9245!!.method2543(111.toByte(), i_38_)
                                    if (class368.aBoolean4487 && class368.anInt4503 != -1) {
                                        val class17 = (Class10.aClass87_191!!.method835(class368.anInt4503, 7))
                                        val i_57_ = class17.anInt248
                                        if (i_57_ != 0 && i_57_ != 2) {
                                            if (i_57_ == 1) bool_53_ = true
                                        } else bool_53_ = false
                                    }
                                } else {
                                    val class368 = Class348_Sub40_Sub18.aClass319_9245!!.method2543(105.toByte(), i_38_)
                                    val class368_55_ = Class348_Sub40_Sub18.aClass319_9245!!.method2543(118.toByte(), i_54_)
                                    if (class368.anInt4503 != -1 && class368_55_.anInt4503 != -1) {
                                        val class17 = (Class10.aClass87_191!!.method835(class368.anInt4503, 7))
                                        val class17_56_ = (Class10.aClass87_191!!.method835((class368_55_.anInt4503), 7))
                                        if (class17.anInt239 < class17_56_.anInt239) bool_53_ = false
                                    }
                                }
                            }
                            if (bool_53_) {
                                if (bool_41_) {
                                    player.anInt10224 = 0
                                    player.anInt10260 = i_37_
                                    player.anInt10289 = i_43_
                                    player.anInt10273 = 0
                                    player.anInt10276 = 1
                                    player.anInt10291 = i_38_
                                    player.anInt10211 = i_39_ + Class367_Sub11.anInt7396
                                    player.anInt10202 = i_42_
                                    if (player.anInt10211 > Class367_Sub11.anInt7396) player.anInt10224 = -1
                                    if (player.anInt10291 == 65535) player.anInt10291 = -1
                                    if ((player.anInt10291 != -1) && ((player.anInt10211) == Class367_Sub11.anInt7396)) {
                                        val i_58_ = (Class348_Sub40_Sub18.aClass319_9245!!.method2543(45.toByte(), (player.anInt10291)).anInt4503)
                                        if (i_58_ != -1) {
                                            val class17 = Class10.aClass87_191!!.method835(i_58_, 7)
                                            if (class17 != null && (class17.anIntArray237) != null && !(player.aBoolean10309)) Class287.method2178(player, 0, class17, -120)
                                        }
                                    }
                                } else {
                                    player.anInt10269 = i_38_
                                    player.anInt10243 = 0
                                    player.anInt10220 = i_37_
                                    player.anInt10240 = 0
                                    player.anInt10278 = i_43_
                                    player.anInt10237 = i_42_
                                    player.anInt10283 = 1
                                    player.anInt10225 = i_39_ + Class367_Sub11.anInt7396
                                    if (player.anInt10269 == 65535) player.anInt10269 = -1
                                    if (Class367_Sub11.anInt7396 < (player.anInt10225)) player.anInt10240 = -1
                                    if ((player.anInt10269 != -1) && (Class367_Sub11.anInt7396 == (player.anInt10225))) {
                                        val i_59_ = (Class348_Sub40_Sub18.aClass319_9245!!.method2543(81.toByte(), (player.anInt10269)).anInt4503)
                                        if (i_59_ != -1) {
                                            val class17 = Class10.aClass87_191!!.method835(i_59_, 7)
                                            if (class17 != null && (class17.anIntArray237) != null && !(player.aBoolean10309)) Class287.method2178(player, 0, class17, -101)
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    val i_60_ = (i_40_ and 0x33705717) shr 28
                    val i_61_ = -za_Sub2.regionTileX + ((0xffff4fe and i_40_) shr 14)
                    val i_62_ = -Class90.regionTileY + (0x3fff and i_40_)
                    if (i_61_ >= 0 && i_62_ >= 0 && Class367_Sub4.anInt7319 > i_61_ && Class348_Sub40_Sub3.anInt9109 > i_62_) {
                        val i_63_ = 256 + 512 * i_61_
                        val i_64_ = 512 * i_62_ + 256
                        var i_65_ = i_60_
                        if (i_65_ < 3 && Class79.method802(i_62_, i_61_, true)) i_65_++
                        val class318_sub1_sub3_sub4 = (Class318_Sub1_Sub3_Sub4(i_38_, i_39_, Class367_Sub11.anInt7396, i_60_, i_65_, i_63_, -i_37_ + Class275.method2064(i_63_, i_60_, 11219, i_64_), i_64_, i_61_, i_61_, i_62_, i_62_, i_42_))
                        r_Sub2.aClass262_10492!!.method1999(Class348_Sub42_Sub6(class318_sub1_sub3_sub4), -20180)
                    }
                }
                Class348_Sub3.aClass114_6584 = null
                return true
            }
            if (Class348_Sub3.aClass114_6584 == Class63.aClass114_1120) {
                val i = Class299.aClass348_Sub49_Sub2_3813!!.readShortAddLittle(-116)
                val string = Class299.aClass348_Sub49_Sub2_3813!!.readString((-85).toByte())
                Class318_Sub1_Sub1_Sub1.method2397((-125).toByte())
                method3965(string, i, 2)
                Class348_Sub3.aClass114_6584 = null
                return true
            }
            if (Class348_Sub3.aClass114_6584 == Class74.aClass114_1234) {
                Class24.anInt359 = Class299.aClass348_Sub49_Sub2_3813!!.method3369(125.toByte())
                Class348_Sub40_Sub3.aBoolean9103 = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255) == 1
                Class348_Sub3.aClass114_6584 = null
                return true
            }
            if (Class352.aClass114_4331 == Class348_Sub3.aClass114_6584) {
                val string = Class299.aClass348_Sub49_Sub2_3813!!.readString(122.toByte())
                val bool_66_ = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255) == 1
                val string_67_: String?
                if (!bool_66_) string_67_ = string
                else string_67_ = Class299.aClass348_Sub49_Sub2_3813!!.readString(125.toByte())
                val i = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                val i_68_ = Class299.aClass348_Sub49_Sub2_3813!!.readByte(-128)
                var bool_69_ = false
                if (i_68_.toInt() == -128) bool_69_ = true
                if (bool_69_) {
                    if (Class37.anInt496 == 0) {
                        Class348_Sub3.aClass114_6584 = null
                        return true
                    }
                    val bool_70_ = false
                    var i_71_: Int
                    i_71_ = 0
                    while (Class37.anInt496 > i_71_) {
                        if (Class169.aClass19Array2261!![i_71_]!!.aString306 == string_67_ && i == (Class169.aClass19Array2261!![i_71_]!!.anInt308)) break
                        i_71_++
                    }
                    if (Class37.anInt496 > i_71_) {
                        while ( /**/-1 + Class37.anInt496 > i_71_) {
                            Class169.aClass19Array2261!![i_71_] = Class169.aClass19Array2261!![i_71_ - -1]
                            i_71_++
                        }
                        Class37.anInt496--
                        Class169.aClass19Array2261!![Class37.anInt496] = null
                    }
                } else {
                    val string_72_ = Class299.aClass348_Sub49_Sub2_3813!!.readString((-74).toByte())
                    val class19 = Class19()
                    class19.aString306 = string_67_
                    class19.aString314 = string
                    class19.aString312 = method2127(2, class19.aString306)
                    class19.aString313 = string_72_
                    class19.anInt308 = i
                    class19.aByte310 = i_68_
                    var i_73_: Int
                    i_73_ = -1 + Class37.anInt496
                    while (i_73_ >= 0) {
                        val i_74_ = Class169.aClass19Array2261!![i_73_]!!.aString312!!.compareTo(class19.aString312!!)
                        if (i_74_ == 0) {
                            Class169.aClass19Array2261!![i_73_]!!.anInt308 = i
                            Class169.aClass19Array2261!![i_73_]!!.aByte310 = i_68_
                            Class169.aClass19Array2261!![i_73_]!!.aString313 = string_72_
                            if (string_67_ == Class132.aPlayer_1907!!.aString10544) Class119_Sub1.aByte4702 = i_68_
                            Class230.anInt2986 = Class311.anInt3918
                            Class348_Sub3.aClass114_6584 = null
                            return true
                        }
                        if (i_74_ < 0) break
                        i_73_--
                    }
                    if (Class169.aClass19Array2261!!.size <= Class37.anInt496) {
                        Class348_Sub3.aClass114_6584 = null
                        return true
                    }
                    for (i_75_ in Class37.anInt496 - 1 downTo i_73_ + 1) Class169.aClass19Array2261!![1 + i_75_] = Class169.aClass19Array2261!![i_75_]
                    if (Class37.anInt496 == 0) Class169.aClass19Array2261 = arrayOfNulls<Class19>(100)
                    Class169.aClass19Array2261!![i_73_ - -1] = class19
                    Class37.anInt496++
                    if (string_67_ == Class132.aPlayer_1907!!.aString10544) Class119_Sub1.aByte4702 = i_68_
                }
                Class230.anInt2986 = Class311.anInt3918
                Class348_Sub3.aClass114_6584 = null
                return true
            }
            if (Class239_Sub11.aClass114_5949 == Class348_Sub3.aClass114_6584) {
                val i = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255)
                val i_76_ = i shr 5
                val i_77_ = 0x1f and i
                if (i_77_ == 0) {
                    Class348_Sub27.aClass302Array6897!![i_76_] = null
                    Class348_Sub3.aClass114_6584 = null
                    return true
                }
                val class302 = Class302()
                class302.anInt3840 = i_77_
                class302.anInt3831 = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255)
                if (class302.anInt3831 >= 0 && (class302.anInt3831 < Class239_Sub9.aClass105Array5933!!.size)) {
                    if (class302.anInt3840 == 1 || class302.anInt3840 == 10) {
                        class302.anInt3833 = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                        Class299.aClass348_Sub49_Sub2_3813!!.anInt7197 += 6
                    } else if (class302.anInt3840 >= 2 && class302.anInt3840 <= 6) {
                        if (class302.anInt3840 == 2) {
                            class302.anInt3832 = 256
                            class302.anInt3835 = 256
                        }
                        if (class302.anInt3840 == 3) {
                            class302.anInt3835 = 0
                            class302.anInt3832 = 256
                        }
                        if (class302.anInt3840 == 4) {
                            class302.anInt3835 = 512
                            class302.anInt3832 = 256
                        }
                        if (class302.anInt3840 == 5) {
                            class302.anInt3835 = 256
                            class302.anInt3832 = 0
                        }
                        if (class302.anInt3840 == 6) {
                            class302.anInt3835 = 256
                            class302.anInt3832 = 512
                        }
                        class302.anInt3840 = 2
                        class302.anInt3838 = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255)
                        class302.anInt3835 += (Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944) + -za_Sub2.regionTileX shl 9)
                        class302.anInt3832 += (Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944) - Class90.regionTileY shl 9)
                        class302.anInt3839 = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255) shl 2
                        class302.anInt3837 = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                    }
                    class302.anInt3834 = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                    if (class302.anInt3834 == 65535) class302.anInt3834 = -1
                    Class348_Sub27.aClass302Array6897!![i_76_] = class302
                }
                Class348_Sub3.aClass114_6584 = null
                return true
            }
            if (Class172.aClass114_2279 == Class348_Sub3.aClass114_6584) {
                Class348_Sub40_Sub34.method3141(Class223.aBoolean2895, 11.toByte())
                Class348_Sub3.aClass114_6584 = null
                return false
            }

            if (Class367_Sub4.aClass114_7323 == Class348_Sub3.aClass114_6584) {
                Class348_Sub16_Sub1.method2822(-101, Class299.aClass348_Sub49_Sub2_3813!!, Class348_Sub40_Sub25.anInt9341)
                Class348_Sub3.aClass114_6584 = null
                return true
            }
            if (Class348_Sub3.aClass114_6584 == Class239_Sub26.aClass114_6121) {
                val i = Class299.aClass348_Sub49_Sub2_3813!!.readShortAdd(124)
                val i_78_ = Class299.aClass348_Sub49_Sub2_3813!!.readIntLittle((-118).toByte())
                Class318_Sub1_Sub1_Sub1.method2397((-128).toByte())
                Class91.method855(6, i, i_78_)
                Class348_Sub3.aClass114_6584 = null
                return true
            }
            if (Class264.aClass114_3371 == Class348_Sub3.aClass114_6584) {
                method128(Class59_Sub1_Sub2.aClass74_8662, 8.toByte())
                Class348_Sub3.aClass114_6584 = null
                return true
            }
            if (Class348_Sub3.aClass114_6584 == Class367_Sub4.aClass114_7324) {
                val i = Class299.aClass348_Sub49_Sub2_3813!!.readInt((-126).toByte())
                val i_79_ = Class299.aClass348_Sub49_Sub2_3813!!.readShortAddLittle(-120)
                val i_80_ = Class299.aClass348_Sub49_Sub2_3813!!.readShortAdd(125)
                Class318_Sub1_Sub1_Sub1.method2397((-125).toByte())
                Class211.method1540(-101, i, i_79_ + (i_80_ shl 16))
                Class348_Sub3.aClass114_6584 = null
                return true
            }
            if (Class348_Sub3.aClass114_6584 == Class361.aClass114_4433) {
                Class318_Sub1_Sub3_Sub3.aClass170_10209!!.method1314(80.toByte())
                Class287.anInt3695 += 32
                Class348_Sub3.aClass114_6584 = null
                return true
            }
            if (Class348_Sub3.aClass114_6584 == Class303.aClass114_3842) {
                val i = Class299.aClass348_Sub49_Sub2_3813!!.readIntInverseMiddle(255)
                Class318_Sub1_Sub1_Sub1.method2397((-128).toByte())
                method1703(5, i, Class348_Sub42_Sub11.anInt9591, 4, 0)
                Class348_Sub3.aClass114_6584 = null
                return true
            }
            if (Class346_Sub1.aClass114_6528 == Class348_Sub3.aClass114_6584) {
                val i = Class299.aClass348_Sub49_Sub2_3813!!.readShortAdd(-124)
                Class318_Sub1_Sub1_Sub1.method2397((-124).toByte())
                Class64_Sub3.method690((-107).toByte(), i)
                Class348_Sub3.aClass114_6584 = null
                return true
            }
            if (Class5_Sub2.aClass114_8365 == Class348_Sub3.aClass114_6584) {
                val bool_81_ = (Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255) == 1)
                val string = Class299.aClass348_Sub49_Sub2_3813!!.readString((-29).toByte())
                var string_82_ = string
                if (bool_81_) string_82_ = Class299.aClass348_Sub49_Sub2_3813!!.readString((-98).toByte())
                val i = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255)
                var bool_83_ = false
                if (i <= 1) {
                    if (Class348_Sub40_Sub3.aBoolean9103 && !Class133.aBoolean1915 || Class50_Sub2.aBoolean5233) bool_83_ = true
                    else if (i <= 1 && Class351.method3455(string_82_, 28280)) bool_83_ = true
                }
                if (!bool_83_ && Class250.anInt3227 == 0) {
                    val string_84_ = (Class59_Sub2_Sub2.method572((Class348_Sub40_Sub32.method3136(64.toByte(), Class299.aClass348_Sub49_Sub2_3813)), 23034))
                    if (i == 2) Class318_Sub1_Sub3_Sub5.method2477("<img=1>" + string_82_, string_84_, (-119).toByte(), -1, "<img=1>" + string, null, 24, 0, string)
                    else if (i == 1) Class318_Sub1_Sub3_Sub5.method2477("<img=0>" + string_82_, string_84_, (-119).toByte(), -1, "<img=0>" + string, null, 24, 0, string)
                    else Class318_Sub1_Sub3_Sub5.method2477(string_82_, string_84_, (-115).toByte(), -1, string, null, 24, 0, string)
                }
                Class348_Sub3.aClass114_6584 = null
                return true
            }
            if (Class15.aClass114_229 == Class348_Sub3.aClass114_6584) {
                method128(Class286_Sub1.aClass74_6201, 8.toByte())
                Class348_Sub3.aClass114_6584 = null
                return true
            }
            if (Class348_Sub3.aClass114_6584 == Class101_Sub2.aClass114_5742) {
                val i = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedByteSubtract(31.toByte())
                val i_85_ = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedByteSubtract((-104).toByte())
                val i_86_ = Class299.aClass348_Sub49_Sub2_3813!!.readByteInverse(21.toByte())
                val i_87_ = Class299.aClass348_Sub49_Sub2_3813!!.readByteInverse(21.toByte())
                val i_88_ = (Class299.aClass348_Sub49_Sub2_3813!!.readShortAdd(126) shl 2)
                Class318_Sub1_Sub1_Sub1.method2397((-127).toByte())
                method1844(i_85_, i_86_, true, i_88_, !bool, i_87_, i)
                Class348_Sub3.aClass114_6584 = null
                return true
            }
            if (Class348_Sub3.aClass114_6584 == Class111.aClass114_1722) {
                val string = Class299.aClass348_Sub49_Sub2_3813!!.readString((-100).toByte())
                val objects = arrayOfNulls<Any>(1 + string.length)
                for (i in -1 + string.length downTo 0) {
                    if (string.get(i) != 's') objects[i + 1] = Class299.aClass348_Sub49_Sub2_3813!!.readInt((-126).toByte())
                    else objects[1 + i] = Class299.aClass348_Sub49_Sub2_3813!!.readString(122.toByte())
                }
                objects[0] = Class299.aClass348_Sub49_Sub2_3813!!.readInt((-126).toByte())
                Class318_Sub1_Sub1_Sub1.method2397((-127).toByte())
                val class348_sub36 = Class348_Sub36()
                class348_sub36.anObjectArray6987 = objects
                Class66.method705(class348_sub36)
                Class348_Sub3.aClass114_6584 = null
                return true
            }
            if (Class239_Sub22.aClass114_6075 == Class348_Sub3.aClass114_6584) {
                Class318_Sub1_Sub1_Sub1.method2397((-127).toByte())
                method1851(125.toByte())
                Class348_Sub3.aClass114_6584 = null
                return true
            }
            if (Class348_Sub3.aClass114_6584 == Class348_Sub41.aClass114_7052) {
                val i = Class299.aClass348_Sub49_Sub2_3813!!.readIntLittle((-118).toByte())
                var i_89_ = Class299.aClass348_Sub49_Sub2_3813!!.readShortAdd(127)
                if (i_89_ == 65535) i_89_ = -1
                Class318_Sub1_Sub1_Sub1.method2397((-126).toByte())
                method1703(2, i, i_89_, 4, -1)
                Class348_Sub3.aClass114_6584 = null
                return true
            }
            if (Class348_Sub3.aClass114_6584 == Class264.aClass114_3368) {
                val i = Class299.aClass348_Sub49_Sub2_3813!!.readInt((-126).toByte())
                Class318_Sub1_Sub1_Sub1.method2397((-124).toByte())
                val class348_sub41 = (Class125.aClass356_4915!!.method3480(i.toLong(), -6008) as Class348_Sub41?)
                if (class348_sub41 != null) Class127_Sub1.method1118(true, false, class348_sub41, 2533)
                if (Class49.aClass46_4730 != null) {
                    Class251.method1916(-9343, Class49.aClass46_4730!!)
                    Class49.aClass46_4730 = null
                }
                Class348_Sub3.aClass114_6584 = null
                return true
            }
            if (InputStream_Sub1.aClass114_79 == Class348_Sub3.aClass114_6584) {
                val i = Class299.aClass348_Sub49_Sub2_3813!!.readShortAdd(-86)
                val i_90_ = Class299.aClass348_Sub49_Sub2_3813!!.readIntInverseMiddle(255)
                Class318_Sub1_Sub1_Sub1.method2397((-124).toByte())
                Class348_Sub23.method2966(i_90_, i, false)
                Class348_Sub3.aClass114_6584 = null
                return true
            }
            if (Class312.aClass114_3925 == Class348_Sub3.aClass114_6584) {
                method128(aClass74_10437, 8.toByte())
                Class348_Sub3.aClass114_6584 = null
                return true
            }
            if (Class348_Sub3.aClass114_6584 == Class228.aClass114_2972) {
                val i = Class299.aClass348_Sub49_Sub2_3813!!.readInt((-126).toByte())
                Class348_Sub42_Sub6.aClass144_9536 = Class348_Sub23_Sub1.aClass297_8992!!.method2232(80, i)
                Class348_Sub3.aClass114_6584 = null
                return true
            }
            if (Class348_Sub3.aClass114_6584 == Class131.aClass114_1901) {
                val i = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                val player: Player?
                if (i != Class348_Sub42_Sub11.anInt9591) player = Class294.aPlayerArray5058!![i]
                else player = Class132.aPlayer_1907
                if (player == null) {
                    Class348_Sub3.aClass114_6584 = null
                    return true
                }
                var i_91_ = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                val i_92_ = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255)
                val bool_93_ = (0x8000 and i_91_) != 0
                if ((player.aString10544) != null && player.aClass154_10536 != null) {
                    var bool_94_ = false
                    if (i_92_ <= 1) {
                        if (!bool_93_ && ((Class348_Sub40_Sub3.aBoolean9103 && !Class133.aBoolean1915) || Class50_Sub2.aBoolean5233)) bool_94_ = true
                        else if (Class351.method3455(player.aString10544, 28280)) bool_94_ = true
                    }
                    if (!bool_94_ && Class250.anInt3227 == 0) {
                        var i_95_ = -1
                        val string: String?
                        if (bool_93_) {
                            i_91_ = i_91_ and 0x7fff
                            val class43 = Class52.method490((-104).toByte(), (Class299.aClass348_Sub49_Sub2_3813!!))
                            i_95_ = class43.anInt615
                            string = (class43.aClass348_Sub42_Sub10_614!!.method3216(Class299.aClass348_Sub49_Sub2_3813!!, 119.toByte()))
                        } else string = (Class59_Sub2_Sub2.method572((Class348_Sub40_Sub32.method3136(64.toByte(), Class299.aClass348_Sub49_Sub2_3813)), 23034))
                        player.aString10292 = string!!.trim { it <= ' ' }
                        player.anInt10201 = i_91_ shr 8
                        player.anInt10234 = i_91_ and 0xff
                        player.anInt10264 = 150
                        val i_96_: Int
                        if (i_92_ != 1 && i_92_ != 2) i_96_ = if (!bool_93_) 2 else 17
                        else i_96_ = if (bool_93_) 17 else 1
                        if (i_92_ != 2) {
                            if (i_92_ != 1) Class318_Sub1_Sub3_Sub5.method2477(player.method2450(false, -121), string, (-126).toByte(), i_95_, player.method2456(true, 255), null, i_96_, 0, player.aString10537)
                            else Class318_Sub1_Sub3_Sub5.method2477("<img=0>" + player.method2450(false, -93), string, (-111).toByte(), i_95_, "<img=0>" + player.method2456(true, 255), null, i_96_, 0, player.aString10537)
                        } else Class318_Sub1_Sub3_Sub5.method2477("<img=1>" + player.method2450(false, -95), string, (-120).toByte(), i_95_, "<img=1>" + player.method2456(true, 255), null, i_96_, 0, player.aString10537)
                    }
                }
                Class348_Sub3.aClass114_6584 = null
                return true
            }
            if (Class63.aClass114_1123 == Class348_Sub3.aClass114_6584) {
                val bool_97_ = (Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255) == 1)
                val string = Class299.aClass348_Sub49_Sub2_3813!!.readString(126.toByte())
                var string_98_ = string
                if (bool_97_) string_98_ = Class299.aClass348_Sub49_Sub2_3813!!.readString(86.toByte())
                val l = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944).toLong()
                val l_99_ = Class299.aClass348_Sub49_Sub2_3813!!.readMedium(-1).toLong()
                val i = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255)
                val l_100_ = (l shl 32) - -l_99_
                var bool_101_ = false
                while_218_@ do {
                    for (i_102_ in 0..99) {
                        if (l_100_ == Class357.aLongArray4410!![i_102_]) {
                            bool_101_ = true
                            break@while_218_
                        }
                    }
                    if (i <= 1) {
                        if ((Class348_Sub40_Sub3.aBoolean9103 && !Class133.aBoolean1915) || Class50_Sub2.aBoolean5233) bool_101_ = true
                        else if (Class351.method3455(string_98_, 28280)) bool_101_ = true
                    }
                } while (false)
                if (!bool_101_ && Class250.anInt3227 == 0) {
                    Class357.aLongArray4410!![Class79.anInt1359] = l_100_
                    Class79.anInt1359 = (1 + Class79.anInt1359) % 100
                    val string_103_ = (Class59_Sub2_Sub2.method572((Class348_Sub40_Sub32.method3136(64.toByte(), Class299.aClass348_Sub49_Sub2_3813)), 23034))
                    if (i == 2) Class318_Sub1_Sub3_Sub5.method2477("<img=1>" + string_98_, string_103_, (-127).toByte(), -1, "<img=1>" + string, null, 7, 0, string)
                    else if (i == 1) Class318_Sub1_Sub3_Sub5.method2477("<img=0>" + string_98_, string_103_, (-115).toByte(), -1, "<img=0>" + string, null, 7, 0, string)
                    else Class318_Sub1_Sub3_Sub5.method2477(string_98_, string_103_, (-128).toByte(), -1, string, null, 3, 0, string)
                }
                Class348_Sub3.aClass114_6584 = null
                return true
            }
            if (Class348_Sub42_Sub8.Companion.aClass114_9552 == Class348_Sub3.aClass114_6584) {
                if (r.anInt9721 != -1) Class239_Sub12.method1775((-8).toByte(), r.anInt9721, 0)
                Class348_Sub3.aClass114_6584 = null
                return true
            }
            if (Class168.aClass114_2248 == Class348_Sub3.aClass114_6584) {
                val i = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255)
                val i_104_ = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedByteSubtract((-87).toByte())
                val i_105_ = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255)
                val i_106_ = (Class299.aClass348_Sub49_Sub2_3813!!.readShortLittle(!bool) shl 2)
                val i_107_ = Class299.aClass348_Sub49_Sub2_3813!!.readByteInverse(21.toByte())
                Class318_Sub1_Sub1_Sub1.method2397((-125).toByte())
                Class348_Sub42_Sub12.method3231(i_104_, i, i_106_, i_107_, i_105_, -127)
                Class348_Sub3.aClass114_6584 = null
                return true
            }

            if (Class348_Sub3.aClass114_6584 == Class348_Sub46.aClass114_7113) {
                Class348_Sub3.aClass114_6584 = null
                return false
            }
            if (Class267.aClass114_3427 == Class348_Sub3.aClass114_6584) {
                method1034(Class348_Sub40_Sub25.anInt9341, Class299.aClass348_Sub49_Sub2_3813, Class348_Sub23_Sub1.aClass297_8992, 110)
                Class348_Sub3.aClass114_6584 = null
                return true
            }
            if (Class189.aClass114_2527 == Class348_Sub3.aClass114_6584) {
                val bool_108_ = (Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255) == 1)
                val `is` = ByteArray(Class348_Sub40_Sub25.anInt9341 - 1)
                Class299.aClass348_Sub49_Sub2_3813!!.method3389(2147483647, 0, (Class348_Sub40_Sub25.anInt9341) + -1, `is`)
                Class184.method1385(bool_108_, `is`, (-104).toByte())
                Class348_Sub3.aClass114_6584 = null
                return true
            }
            if (Class348_Sub3.aClass114_6584 == Class254.aClass114_3264) {
                val i = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255)
                val i_109_ = Class299.aClass348_Sub49_Sub2_3813!!.method3341(-8679)
                Class318_Sub1_Sub1_Sub1.method2397((-128).toByte())
                Class348_Sub42_Sub14.method3244(i_109_.toInt(), i, 120)
                Class348_Sub3.aClass114_6584 = null
                return true
            }
            if (Class255.aClass114_3265 == Class348_Sub3.aClass114_6584) {
                Class278.anInt3581 = (Class299.aClass348_Sub49_Sub2_3813!!.readByteInverse(-622951480).toInt() shl 3)
                Class348_Sub40_Sub12.anInt9200 = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedByteSubtract(98.toByte())
                Class73.anInt4786 = (Class299.aClass348_Sub49_Sub2_3813!!.readByteSubtract(-27697).toInt() shl 3)
                while ((Class299.aClass348_Sub49_Sub2_3813!!.anInt7197) < Class348_Sub40_Sub25.anInt9341) {
                    val class74 = (Class255.method1929((-19).toByte())[Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255)])
                    method128(class74, 8.toByte())
                }
                Class348_Sub3.aClass114_6584 = null
                return true
            }
            if (Class271.aClass114_3467 == Class348_Sub3.aClass114_6584) {
                val i = Class299.aClass348_Sub49_Sub2_3813!!.readShort(13638)
                val i_110_ = Class299.aClass348_Sub49_Sub2_3813!!.readInt((-126).toByte())
                val i_111_ = Class299.aClass348_Sub49_Sub2_3813!!.method3375(84.toByte())
                Class318_Sub1_Sub1_Sub1.method2397((-124).toByte())
                Class120.method1080(i_111_, -23697, i, i_110_)
                Class348_Sub3.aClass114_6584 = null
                return true
            }
            if (Class178.aClass114_2338 == Class348_Sub3.aClass114_6584) {
                val string = Class299.aClass348_Sub49_Sub2_3813!!.readString(100.toByte())
                val i = Class299.aClass348_Sub49_Sub2_3813!!.readShortAdd(124)
                Class318_Sub1_Sub1_Sub1.method2397((-127).toByte())
                method3965(string, i, 2)
                Class348_Sub3.aClass114_6584 = null
                return true
            }
            if (Class348_Sub3.aClass114_6584 == Class318_Sub1_Sub5_Sub2.aClass114_10168) {
                val i = Class299.aClass348_Sub49_Sub2_3813!!.readShortAddLittle(-117)
                val i_112_ = Class299.aClass348_Sub49_Sub2_3813!!.readInt((-126).toByte())
                Class318_Sub1_Sub1_Sub1.method2397((-127).toByte())
                Class348_Sub40_Sub15.method3084(i, (-88).toByte(), i_112_)
                Class348_Sub3.aClass114_6584 = null
                return true
            }
            if (Class167.aClass114_2196 == Class348_Sub3.aClass114_6584) {
                val bool_113_ = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255) == 1
                val string = Class299.aClass348_Sub49_Sub2_3813!!.readString((-81).toByte())
                var string_114_ = string
                if (bool_113_) string_114_ = Class299.aClass348_Sub49_Sub2_3813!!.readString((-39).toByte())
                val l = Class299.aClass348_Sub49_Sub2_3813!!.readLong(-456577760)
                val l_115_ = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944).toLong()
                val l_116_ = Class299.aClass348_Sub49_Sub2_3813!!.readMedium(-1).toLong()
                val i = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255)
                val i_117_ = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                val l_118_ = (l_115_ shl 32) - -l_116_
                var bool_119_ = false
                while_219_@ do {
                    for (i_120_ in 0..99) {
                        if (Class357.aLongArray4410!![i_120_] == l_118_) {
                            bool_119_ = true
                            break@while_219_
                        }
                    }
                    if (i <= 1 && Class351.method3455(string_114_, 28280)) bool_119_ = true
                } while (false)
                if (!bool_119_ && Class250.anInt3227 == 0) {
                    Class357.aLongArray4410!![Class79.anInt1359] = l_118_
                    Class79.anInt1359 = (Class79.anInt1359 + 1) % 100
                    val string_121_ = (Class239_Sub6.aClass355_5900!!.method3471(i_117_, (-106).toByte()).method3216(Class299.aClass348_Sub49_Sub2_3813!!, 42.toByte()))
                    if (i == 2) Class318_Sub1_Sub3_Sub5.method2477("<img=1>" + string_114_, string_121_, (-120).toByte(), i_117_, "<img=1>" + string, method1788(87.toByte(), l), 20, 0, string)
                    else if (i != 1) Class318_Sub1_Sub3_Sub5.method2477(string_114_, string_121_, (-111).toByte(), i_117_, string, method1788(80.toByte(), l), 20, 0, string)
                    else Class318_Sub1_Sub3_Sub5.method2477("<img=0>" + string_114_, string_121_, (-116).toByte(), i_117_, "<img=0>" + string, Class239_Sub16.method1788((-98).toByte(), l), 20, 0, string)
                }
                Class348_Sub3.aClass114_6584 = null
                return true
            }
            if (Class348_Sub47.aClass114_7124 == Class348_Sub3.aClass114_6584) {
                val i = Class299.aClass348_Sub49_Sub2_3813!!.readIntInverseMiddle(255)
                Class318_Sub1_Sub1_Sub1.method2397((-125).toByte())
                if (i == -1) {
                    Class9.anInt167 = -1
                    Class318_Sub1_Sub5_Sub2.anInt10163 = -1
                } else {
                    var i_122_ = 0x3fff and (i shr 14)
                    i_122_ -= za_Sub2.regionTileX
                    var i_123_ = 0x3fff and i
                    i_123_ -= Class90.regionTileY
                    if (i_122_ >= 0) {
                        if (Class367_Sub4.anInt7319 <= i_122_) i_122_ = Class367_Sub4.anInt7319
                    } else i_122_ = 0
                    Class9.anInt167 = (i_122_ shl 9) - -256
                    if (i_123_ >= 0) {
                        if (i_123_ >= Class348_Sub40_Sub3.anInt9109) i_123_ = Class348_Sub40_Sub3.anInt9109
                    } else i_123_ = 0
                    Class318_Sub1_Sub5_Sub2.anInt10163 = 256 + (i_123_ shl 9)
                }
                Class348_Sub3.aClass114_6584 = null
                return true
            }
            if (Class348_Sub3.aClass114_6584 == Class348_Sub40_Sub19.aClass114_9254) {
                val i = Class299.aClass348_Sub49_Sub2_3813!!.readByteAdd((-88).toByte())
                val i_124_ = Class299.aClass348_Sub49_Sub2_3813!!.readShortLittle(!bool)
                Class318_Sub1_Sub3_Sub3.aClass170_10209!!.method1316((-58).toByte(), i_124_, i)
                Class348_Sub3.aClass114_6584 = null
                return true
            }
            if (Class133.aClass114_1914 == Class348_Sub3.aClass114_6584) {
                method128(Class348_Sub40_Sub38.aClass74_9475, 8.toByte())
                Class348_Sub3.aClass114_6584 = null
                return true
            }
            if (Class348_Sub3.aClass114_6584 == Class292.aClass114_4798) {
                var i = Class299.aClass348_Sub49_Sub2_3813!!.readShortAddLittle(-107)
                if (i == 65535) i = -1
                val i_125_ = Class299.aClass348_Sub49_Sub2_3813!!.readByteAdd((-121).toByte())
                val i_126_ = i_125_ shr 2
                val i_127_ = i_125_ and 0x3
                val i_128_ = Class36.anIntArray487!![i_126_]
                val i_129_ = Class299.aClass348_Sub49_Sub2_3813!!.readIntInverseMiddle(255)
                val i_130_ = (0x36079814 and i_129_) shr 28
                var i_131_ = i_129_ shr 14 and 0x3fff
                var i_132_ = 0x3fff and i_129_
                i_131_ -= za_Sub2.regionTileX
                i_132_ -= Class90.regionTileY
                ha_Sub3.method3824(i_132_, i, i_126_, i_131_, i_127_, 102, i_130_, i_128_)
                Class348_Sub3.aClass114_6584 = null
                return true
            }
            if (Class348_Sub3.aClass114_6584 == Class168.aClass114_2255) {
                val string = Class299.aClass348_Sub49_Sub2_3813!!.readString((-104).toByte())
                val i = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                val string_133_ = (Class239_Sub6.aClass355_5900!!.method3471(i, (-98).toByte()).method3216(Class299.aClass348_Sub49_Sub2_3813!!, 42.toByte()))
                Class318_Sub1_Sub3_Sub5.method2477(string, string_133_, (-122).toByte(), i, string, null, 19, 0, string)
                Class348_Sub3.aClass114_6584 = null
                return true
            }
            if (Class348_Sub3.aClass114_6584 == Class348_Sub42_Sub8.Companion.aClass114_9550) {
                method128(Class327.aClass74_4098, 8.toByte())
                Class348_Sub3.aClass114_6584 = null
                return true
            }
            if (Class202.aClass114_2665 == Class348_Sub3.aClass114_6584) {
                for (i in Class294.aPlayerArray5058!!.indices) {
                    if (Class294.aPlayerArray5058!![i] != null) {
                        Class294.aPlayerArray5058!![i]!!.anIntArray10236 = null
                        Class294.aPlayerArray5058!![i]!!.anInt10286 = -1
                    }
                }
                var i = 0
                while (Class348_Sub32.anInt6930 > i) {
                    Class348_Sub40_Sub23.aClass348_Sub22Array9319!![i]!!.aNpc_6859!!.anIntArray10236 = null
                    Class348_Sub40_Sub23.aClass348_Sub22Array9319!![i]!!.aNpc_6859!!.anInt10286 = -1
                    i++
                }
                Class348_Sub3.aClass114_6584 = null
                return true
            }
            if (Class365.aClass114_4477 == Class348_Sub3.aClass114_6584) {
                val i = Class299.aClass348_Sub49_Sub2_3813!!.readIntInverseMiddle(255)
                val i_134_ = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                val i_135_ = Class299.aClass348_Sub49_Sub2_3813!!.readShortAddLittle(-109)
                val i_136_ = Class299.aClass348_Sub49_Sub2_3813!!.readShortAdd(16)
                Class318_Sub1_Sub1_Sub1.method2397((-125).toByte())
                Class122.method1085(i_136_, i_134_, (-86).toByte(), i_135_, i)
                Class348_Sub3.aClass114_6584 = null
                return true
            }
            if (Class95.aClass114_1540 == Class348_Sub3.aClass114_6584) {
                Class57.aClass227_1055 = Class38.method360((-57).toByte(), Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255))
                Class348_Sub3.aClass114_6584 = null
                return true
            }
            if (Class239_Sub21.aClass114_6058 == Class348_Sub3.aClass114_6584) {
                method128(Class186.aClass74_2491, 8.toByte())
                Class348_Sub3.aClass114_6584 = null
                return true
            }
            if (Class176.aClass114_2331 == Class348_Sub3.aClass114_6584) {
                Class348_Sub42_Sub12.anInt9604 = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255)
                var i = 0
                while (Class348_Sub42_Sub12.anInt9604 > i) {
                    Class51.aStringArray932!![i] = Class299.aClass348_Sub49_Sub2_3813!!.readString((-36).toByte())
                    Class122.aStringArray1808!![i] = Class299.aClass348_Sub49_Sub2_3813!!.readString(112.toByte())
                    if (Class122.aStringArray1808!![i] == "") Class122.aStringArray1808!![i] = Class51.aStringArray932!![i]
                    Class348_Sub40_Sub21.aStringArray9275!![i] = Class299.aClass348_Sub49_Sub2_3813!!.readString(84.toByte())
                    aa_Sub2.aStringArray5197!![i] = Class299.aClass348_Sub49_Sub2_3813!!.readString((-111).toByte())
                    if (aa_Sub2.aStringArray5197!![i] == "") aa_Sub2.aStringArray5197!![i] = Class348_Sub40_Sub21.aStringArray9275!![i]
                    Class367_Sub3.aBooleanArray7304!![i] = false
                    i++
                }
                Class126.anInt4985 = Class311.anInt3918
                Class348_Sub3.aClass114_6584 = null
                return true
            }
            if (Class348_Sub3.aClass114_6584 == Class166.aClass114_2183) {
                var i = Class299.aClass348_Sub49_Sub2_3813!!.readShortAddLittle(-121)
                if (i == 65535) i = -1
                var string: String? = Class299.aClass348_Sub49_Sub2_3813!!.readString(103.toByte())
                val i_137_ = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedByteSubtract((-91).toByte())
                val i_138_ = Class299.aClass348_Sub49_Sub2_3813!!.readByteAdd(13.toByte())
                if (i_137_ >= 1 && i_137_ <= 8) {
                    if (string.equals("null", ignoreCase = true)) string = null
                    Class318_Sub1_Sub2_Sub1.aStringArray10195!![i_137_ + -1] = string
                    Canvas_Sub1.anIntArray60!![i_137_ + -1] = i
                    Class71.aBooleanArray1214!![i_137_ - 1] = i_138_ == 0
                }
                Class348_Sub3.aClass114_6584 = null
                return true
            }
            if (Class128.aClass114_1871 == Class348_Sub3.aClass114_6584) {
                val i = Class299.aClass348_Sub49_Sub2_3813!!.readSmart(-117)
                val i_139_ = Class299.aClass348_Sub49_Sub2_3813!!.readInt((-126).toByte())
                val i_140_ = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255)
                var string = ""
                var string_141_ = string
                if ((i_140_ and 0x1) != 0) {
                    string = Class299.aClass348_Sub49_Sub2_3813!!.readString(92.toByte())
                    if ((i_140_ and 0x2) != 0) string_141_ = Class299.aClass348_Sub49_Sub2_3813!!.readString(126.toByte())
                    else string_141_ = string
                }
                val string_142_ = Class299.aClass348_Sub49_Sub2_3813!!.readString((-95).toByte())
                if (i == 99) method94(string_142_, -93)
                else if (i == 98) set(string_142_)
                else {
                    if (string_141_ != "" && Class351.method3455(string_141_, 28280)) {
                        Class348_Sub3.aClass114_6584 = null
                        return true
                    }
                    Class286_Sub2.method2144(string_141_, i, (-92).toByte(), i_139_, string_142_, string, string)
                }
                Class348_Sub3.aClass114_6584 = null
                return true
            }
            if (Class348_Sub3.aClass114_6584 == Class348_Sub45.aClass114_7105) {
                val i = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255)
                if (Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255) == 0) Class239_Sub26.aClass54Array6114!![i] = Class54()
                else {
                    Class299.aClass348_Sub49_Sub2_3813!!.anInt7197--
                    Class239_Sub26.aClass54Array6114!![i] = Class54(Class299.aClass348_Sub49_Sub2_3813!!)
                }
                Class348_Sub3.aClass114_6584 = null
                Class189.anInt2523 = Class311.anInt3918
                return true
            }
            if (Class348_Sub3.aClass114_6584 == Class110.aClass114_1702) {
                val i = Class299.aClass348_Sub49_Sub2_3813!!.readShort(13638)
                val i_143_ = Class299.aClass348_Sub49_Sub2_3813!!.readIntMiddleEndian(82.toByte())
                Class318_Sub1_Sub1_Sub1.method2397((-126).toByte())
                Class173.method1330(i, -19906, i_143_)
                Class348_Sub3.aClass114_6584 = null
                return true
            }
            if (Class348_Sub3.aClass114_6584 == Class3.aClass114_123) {
                val i = Class299.aClass348_Sub49_Sub2_3813!!.readIntMiddleEndian(82.toByte())
                val i_144_ = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                var i_145_ = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                if (i_145_ == 65535) i_145_ = -1
                var i_146_ = Class299.aClass348_Sub49_Sub2_3813!!.readShortAdd(124)
                Class318_Sub1_Sub1_Sub1.method2397((-128).toByte())
                if (i_146_ == 65535) i_146_ = -1
                var i_147_ = i_146_
                while (i_145_ >= i_147_) {
                    val l = (i.toLong() shl 32) - -i_147_.toLong()
                    val class348_sub44 = (Class226.aClass356_2959!!.method3480(l, -6008) as Class348_Sub44?)
                    val class348_sub44_148_: Class348_Sub44?
                    if (class348_sub44 == null) {
                        if (i_147_ == -1) class348_sub44_148_ = (Class348_Sub44(method2570(1512932720, i)!!.aClass348_Sub44_748!!.anInt7098, i_144_))
                        else class348_sub44_148_ = Class348_Sub44(0, i_144_)
                    } else {
                        class348_sub44_148_ = Class348_Sub44((class348_sub44.anInt7098), i_144_)
                        class348_sub44.method2715(91.toByte())
                    }
                    Class226.aClass356_2959!!.method3483(125.toByte(), l, class348_sub44_148_)
                    i_147_++
                }
                Class348_Sub3.aClass114_6584 = null
                return true
            }
            if (Class348_Sub3.aClass114_6584 == Class348_Sub45.aClass114_7106) {
                while ((Class299.aClass348_Sub49_Sub2_3813!!.anInt7197) < Class348_Sub40_Sub25.anInt9341) {
                    val bool_149_ = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255) == 1
                    var string: String? = Class299.aClass348_Sub49_Sub2_3813!!.readString((-95).toByte())
                    val string_150_ = Class299.aClass348_Sub49_Sub2_3813!!.readString(118.toByte())
                    val i = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                    val i_151_ = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255)
                    var string_152_ = ""
                    var bool_153_ = false
                    if (i > 0) {
                        string_152_ = Class299.aClass348_Sub49_Sub2_3813!!.readString(119.toByte())
                        bool_153_ = (Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255) == 1)
                    }
                    var i_154_ = 0
                    while ((i_154_ < Class348_Sub40_Sub30.anInt9383)) {
                        if (!bool_149_) {
                            if (string == Class83.aStringArray1441!![i_154_]) {
                                if (i != ha.anIntArray4578!![i_154_]) {
                                    var bool_155_ = true
                                    var class318_sub9_sub1 = (Class348_Sub42_Sub14.aClass243_9642!!.method1872(8) as? Class318_Sub9_Sub1?)
                                    while (class318_sub9_sub1 != null) {
                                        if (class318_sub9_sub1.aString8783 == string) {
                                            if (i == 0 || (class318_sub9_sub1.aShort8786.toInt() != 0)) {
                                                if (i == 0 && (class318_sub9_sub1.aShort8786).toInt() != 0) {
                                                    bool_155_ = false
                                                    class318_sub9_sub1.method2373(false)
                                                }
                                            } else {
                                                bool_155_ = false
                                                class318_sub9_sub1.method2373(false)
                                            }
                                        }
                                        class318_sub9_sub1 = (Class348_Sub42_Sub14.aClass243_9642!!.method1878(124.toByte()) as? Class318_Sub9_Sub1?)
                                    }
                                    if (bool_155_) Class348_Sub42_Sub14.aClass243_9642!!.method1869(-95, Class318_Sub9_Sub1(string, i))
                                    ha.anIntArray4578!![i_154_] = i
                                }
                                Class286_Sub2.aStringArray6205!![i_154_] = string_150_
                                Class285.aStringArray4744!![i_154_] = string_152_
                                Class172.anIntArray2280!![i_154_] = i_151_
                                string = null
                                Class122.aBooleanArray1806!![i_154_] = bool_153_
                                break
                            }
                        } else if (string_150_ == Class83.aStringArray1441!![i_154_]) {
                            Class83.aStringArray1441!![i_154_] = string
                            Class286_Sub2.aStringArray6205!![i_154_] = string_150_
                            string = null
                            break
                        }
                        i_154_++
                    }
                    if (string != null && Class348_Sub40_Sub30.anInt9383 < 200) {
                        Class83.aStringArray1441!![Class348_Sub40_Sub30.anInt9383] = string
                        Class286_Sub2.aStringArray6205!![(Class348_Sub40_Sub30.anInt9383)] = string_150_
                        ha.anIntArray4578!![Class348_Sub40_Sub30.anInt9383] = i
                        Class285.aStringArray4744!![Class348_Sub40_Sub30.anInt9383] = string_152_
                        Class172.anIntArray2280!![Class348_Sub40_Sub30.anInt9383] = i_151_
                        Class122.aBooleanArray1806!![Class348_Sub40_Sub30.anInt9383] = bool_153_
                        Class348_Sub40_Sub30.anInt9383++
                    }
                }
                Class125.anInt4930 = 2
                Class126.anInt4985 = Class311.anInt3918
                var bool_156_ = false
                var i = Class348_Sub40_Sub30.anInt9383
                while (i > 0) {
                    i--
                    bool_156_ = true
                    var i_157_ = 0
                    while (i > i_157_) {
                        if (((Class3.aClass161_125!!.anInt2143 != ha.anIntArray4578!![i_157_]) && (ha.anIntArray4578!![i_157_ - -1] == Class3.aClass161_125!!.anInt2143)) || (ha.anIntArray4578!![i_157_] == 0 && (ha.anIntArray4578!![1 + i_157_] != 0))) {
                            val i_158_ = ha.anIntArray4578!![i_157_]
                            ha.anIntArray4578!![i_157_] = ha.anIntArray4578!![1 + i_157_]
                            ha.anIntArray4578!![i_157_ - -1] = i_158_
                            val string = Class285.aStringArray4744!![i_157_]
                            Class285.aStringArray4744!![i_157_] = Class285.aStringArray4744!![1 + i_157_]
                            Class285.aStringArray4744!![1 + i_157_] = string
                            val string_159_ = Class83.aStringArray1441!![i_157_]
                            Class83.aStringArray1441!![i_157_] = Class83.aStringArray1441!![i_157_ + 1]
                            Class83.aStringArray1441!![i_157_ + 1] = string_159_
                            val string_160_ = Class286_Sub2.aStringArray6205!![i_157_]
                            Class286_Sub2.aStringArray6205!![i_157_] = Class286_Sub2.aStringArray6205!![i_157_ + 1]
                            Class286_Sub2.aStringArray6205!![i_157_ - -1] = string_160_
                            val i_161_ = Class172.anIntArray2280!![i_157_]
                            Class172.anIntArray2280!![i_157_] = Class172.anIntArray2280!![1 + i_157_]
                            Class172.anIntArray2280!![i_157_ + 1] = i_161_
                            val bool_162_ = Class122.aBooleanArray1806!![i_157_]
                            Class122.aBooleanArray1806!![i_157_] = Class122.aBooleanArray1806!![1 + i_157_]
                            bool_156_ = false
                            Class122.aBooleanArray1806!![i_157_ + 1] = bool_162_
                        }
                        i_157_++
                    }
                    if (bool_156_) break
                }
                Class348_Sub3.aClass114_6584 = null
                return true
            }
            if (Class59_Sub2_Sub2.aClass114_8683 == Class348_Sub3.aClass114_6584) {
                if (Class34.aFrame476 != null) Class85.method830(Class316.aClass348_Sub51_3959!!.aClass239_Sub8_7227!!.method1751(-32350), -1, 102.toByte(), false, -1)
                val `is` = ByteArray(Class348_Sub40_Sub25.anInt9341)
                Class299.aClass348_Sub49_Sub2_3813!!.method3409(Class348_Sub40_Sub25.anInt9341, `is`, 0, -32769)
                val string = method3546(`is`, 0, Class348_Sub40_Sub25.anInt9341, 0)
                Class179.method1360(string, Class348_Sub23_Sub1.aClass297_8992, Class316.aClass348_Sub51_3959!!.aClass239_Sub25_7271!!.method1829(-32350) == 1, true, 99)
                Class348_Sub3.aClass114_6584 = null
                return true
            }
            if (Class367_Sub8.aClass114_7363 == Class348_Sub3.aClass114_6584) {
                var i = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                if (i == 65535) i = -1
                val i_163_ = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255)
                val i_164_ = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                val i_165_ = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255)
                val i_166_ = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                Class348_Sub20.method2947(true, i_165_, i, i_163_, i_164_, i_166_)
                Class348_Sub3.aClass114_6584 = null
                return true
            }
            if (Class348_Sub3.aClass114_6584 == Class239.aClass114_3143) {
                val i = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                val i_167_ = Class299.aClass348_Sub49_Sub2_3813!!.readByte(-83)
                Class318_Sub1_Sub3_Sub3.aClass170_10209!!.method1313(42.toByte(), i_167_.toInt(), i)
                Class348_Sub3.aClass114_6584 = null
                return true
            }
            if (Class348_Sub3.aClass114_6584 == Class318_Sub1_Sub3.aClass114_8756) {
                var i = Class299.aClass348_Sub49_Sub2_3813!!.readShortLittle(false)
                if (i == 65535) i = -1
                val i_168_ = Class299.aClass348_Sub49_Sub2_3813!!.readIntInverseMiddle(255)
                Class318_Sub1_Sub1_Sub1.method2397((-127).toByte())
                Class25.method304(i, 437853543, i_168_)
                Class348_Sub3.aClass114_6584 = null
                return true
            }
            if (Class348_Sub3.aClass114_6584 == Class280.aClass114_3641) {
                method128(Class348_Sub35.aClass74_6977, 8.toByte())
                Class348_Sub3.aClass114_6584 = null
                return true
            }
            if (Class348_Sub3.aClass114_6584 == Class218.aClass114_2860) {
                var i = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                if (i == 65535) i = -1
                val i_169_ = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255)
                val i_170_ = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                val i_171_ = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255)
                val i_172_ = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                Class279.method2090(i_169_, i_172_, false, (-35).toByte(), i_171_, i_170_, i)
                Class348_Sub3.aClass114_6584 = null
                return true
            }

            if (Class348_Sub3.aClass114_6584 == Class20.aClass114_318) {
                Class348_Sub40_Sub26.method3120(-86)
                Class348_Sub3.aClass114_6584 = null
                return false
            }
            if (Class348_Sub3.aClass114_6584 == Class345.aClass114_4272) {
                val i = Class299.aClass348_Sub49_Sub2_3813!!.readShortAdd(-127)
                val i_173_ = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255)
                Class318_Sub1_Sub1_Sub1.method2397((-128).toByte())
                Class55_Sub1.method524(i_173_, true, i, -127)
                Class348_Sub3.aClass114_6584 = null
                return true
            }
            if (Class205.aClass114_2693 == Class348_Sub3.aClass114_6584) {
                val bool_174_ = (Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255) == 1)
                val string = Class299.aClass348_Sub49_Sub2_3813!!.readString(107.toByte())
                var string_175_ = string
                if (bool_174_) string_175_ = Class299.aClass348_Sub49_Sub2_3813!!.readString((-71).toByte())
                val l = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944).toLong()
                val l_176_ = Class299.aClass348_Sub49_Sub2_3813!!.readMedium(-1).toLong()
                val i = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255)
                val i_177_ = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                val l_178_ = l_176_ + (l shl 32)
                var bool_179_ = false
                while_220_@ do {
                    for (i_180_ in 0..99) {
                        if (l_178_ == Class357.aLongArray4410!![i_180_]) {
                            bool_179_ = true
                            break@while_220_
                        }
                    }
                    if (i <= 1 && Class351.method3455(string_175_, 28280)) bool_179_ = true
                } while (false)
                if (!bool_179_ && Class250.anInt3227 == 0) {
                    Class357.aLongArray4410!![Class79.anInt1359] = l_178_
                    Class79.anInt1359 = (Class79.anInt1359 - -1) % 100
                    val string_181_ = (Class239_Sub6.aClass355_5900!!.method3471(i_177_, (-93).toByte()).method3216(Class299.aClass348_Sub49_Sub2_3813!!, 62.toByte()))
                    if (i == 2) Class318_Sub1_Sub3_Sub5.method2477("<img=1>" + string_175_, string_181_, (-110).toByte(), i_177_, "<img=1>" + string, null, 18, 0, string)
                    else if (i == 1) Class318_Sub1_Sub3_Sub5.method2477("<img=0>" + string_175_, string_181_, (-112).toByte(), i_177_, "<img=0>" + string, null, 18, 0, string)
                    else Class318_Sub1_Sub3_Sub5.method2477(string_175_, string_181_, (-118).toByte(), i_177_, string, null, 18, 0, string)
                }
                Class348_Sub3.aClass114_6584 = null
                return true
            }
            if (Class348_Sub3.aClass114_6584 == Class367_Sub9.aClass114_7367) {
                val i = Class299.aClass348_Sub49_Sub2_3813!!.readShortLittle(false)
                val i_182_ = Class299.aClass348_Sub49_Sub2_3813!!.readIntLittle((-122).toByte())
                val i_183_ = Class299.aClass348_Sub49_Sub2_3813!!.readByteAdd((-95).toByte())
                Class318_Sub1_Sub1_Sub1.method2397((-125).toByte())
                val class348_sub41 = (Class125.aClass356_4915!!.method3480(i_182_.toLong(), -6008) as Class348_Sub41?)
                if (class348_sub41 != null) Class127_Sub1.method1118(i != (class348_sub41.anInt7050), false, class348_sub41, 2533)
                Class338.method2661(i, i_182_, i_183_, false, 2)
                Class348_Sub3.aClass114_6584 = null
                return true
            }
            if (Class348_Sub3.aClass114_6584 == Class127_Sub1.aClass114_8384) {
                Class348_Sub3.aClass114_6584 = null
                Class125.anInt4930 = 1
                Class126.anInt4985 = Class311.anInt3918
                return true
            }
            if (Class348_Sub3.aClass114_6584 == Class176.aClass114_2335) {
                Class318_Sub1_Sub1_Sub1.method2397((-125).toByte())
                Class128.method1122(0)
                Class348_Sub3.aClass114_6584 = null
                return true
            }
            if (Class13.aClass114_220 == Class348_Sub3.aClass114_6584) {
                val i = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                val i_184_ = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                val i_185_ = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                Class318_Sub1_Sub1_Sub1.method2397((-125).toByte())
                if (Class348_Sub40_Sub33.aClass46ArrayArray9427!![i] != null) {
                    var i_186_ = i_184_
                    while (i_185_ > i_186_) {
                        val i_187_ = Class299.aClass348_Sub49_Sub2_3813!!.readMedium(-1)
                        if ((Class348_Sub40_Sub33.aClass46ArrayArray9427!![i])!!.size > i_186_ && (Class348_Sub40_Sub33.aClass46ArrayArray9427!![i]!![i_186_]) != null) Class348_Sub40_Sub33.aClass46ArrayArray9427!![i]!![i_186_]!!.anInt732 = i_187_
                        i_186_++
                    }
                }
                Class348_Sub3.aClass114_6584 = null
                return true
            }
            if (Class348_Sub3.aClass114_6584 == Class239_Sub14.aClass114_5992) {
                method128(Class265.aClass74_4689, 8.toByte())
                Class348_Sub3.aClass114_6584 = null
                return true
            }
            if (Class348_Sub38.aClass114_7015 == Class348_Sub3.aClass114_6584) {
                Class348_Sub40_Sub12.anInt9200 = Class299.aClass348_Sub49_Sub2_3813!!.readByteAdd(126.toByte())
                Class73.anInt4786 = (Class299.aClass348_Sub49_Sub2_3813!!.readByteInverse(-622951480).toInt() shl 3)
                Class278.anInt3581 = (Class299.aClass348_Sub49_Sub2_3813!!.readByteInverse(-622951480).toInt() shl 3)
                var class348_sub37 = Class130.aClass356_1895!!.method3484(0) as? Class348_Sub37?
                while (class348_sub37 != null) {
                    val i = ((class348_sub37.aLong4291 shr 28) and 0x3L).toInt()
                    val i_188_ = (class348_sub37.aLong4291 and 0x3fffL).toInt()
                    val i_189_ = i_188_ + -za_Sub2.regionTileX
                    val i_190_ = (0x3fffL and (class348_sub37.aLong4291 shr 14)).toInt()
                    val i_191_ = -Class90.regionTileY + i_190_
                    if (i == Class348_Sub40_Sub12.anInt9200 && Class278.anInt3581 <= i_189_ && 8 + Class278.anInt3581 > i_189_ && Class73.anInt4786 <= i_191_ && Class73.anInt4786 - -8 > i_191_) {
                        class348_sub37.method2715(89.toByte())
                        if (i_189_ >= 0 && i_191_ >= 0 && i_189_ < Class367_Sub4.anInt7319 && (i_191_ < Class348_Sub40_Sub3.anInt9109)) Class203.method1479(i_191_, (-118).toByte(), i_189_, Class348_Sub40_Sub12.anInt9200)
                    }
                    class348_sub37 = (Class130.aClass356_1895!!.method3482(0) as? Class348_Sub37?)
                }
                var class348_sub27 = (Class348_Sub42_Sub20.aClass262_9711!!.method1995(4) as? Class348_Sub27?)
                while (class348_sub27 != null) {
                    if ((Class278.anInt3581 <= class348_sub27.anInt6905) && (class348_sub27.anInt6905 < Class278.anInt3581 - -8) && (class348_sub27.anInt6896 >= Class73.anInt4786) && (class348_sub27.anInt6896 < Class73.anInt4786 + 8) && (class348_sub27.anInt6899 == Class348_Sub40_Sub12.anInt9200)) class348_sub27.anInt6893 = 0
                    class348_sub27 = Class348_Sub42_Sub20.aClass262_9711!!.method1990(31.toByte()) as? Class348_Sub27?
                }
                Class348_Sub3.aClass114_6584 = null
                return true
            }
            if (Class348_Sub3.aClass114_6584 == Class239_Sub15.aClass114_5997) {
                val i = Class299.aClass348_Sub49_Sub2_3813!!.readByteInverse(21.toByte())
                val `is` = IntArray(4)
                for (i_192_ in 0..3) `is`[i_192_] = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                val i_193_ = Class299.aClass348_Sub49_Sub2_3813!!.readShortLittle(false)
                val class348_sub22 = (Class282.aClass356_3654!!.method3480(i_193_.toLong(), -6008) as Class348_Sub22?)
                if (class348_sub22 != null) Class348_Sub17.method2931(i, 110.toByte(), `is`, (class348_sub22.aNpc_6859))
                Class348_Sub3.aClass114_6584 = null
                return true
            }
            if (Class348_Sub3.aClass114_6584 == Class348_Sub40_Sub22.aClass114_9285) {
                Class259.anInt3306 = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255)
                Class348_Sub3.aClass114_6584 = null
                return true
            }
            if (Class348_Sub40_Sub24.aClass114_9324 == Class348_Sub3.aClass114_6584) {
                val i = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedByteSubtract((-104).toByte())
                val i_194_ = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedByteSubtract((-92).toByte())
                var i_195_ = Class299.aClass348_Sub49_Sub2_3813!!.readShortAddLittle(-127)
                if (i_195_ == 65535) i_195_ = -1
                Class151.method1212(i_194_, i_195_, -1, i)
                Class348_Sub3.aClass114_6584 = null
                return true
            }
            if (Class321.aClass114_4015 == Class348_Sub3.aClass114_6584) {
                val i = Class299.aClass348_Sub49_Sub2_3813!!.method3363(-13309)
                var i_196_ = Class299.aClass348_Sub49_Sub2_3813!!.readShortAddLittle(-124)
                if (i_196_ == 65535) i_196_ = -1
                val i_197_ = Class299.aClass348_Sub49_Sub2_3813!!.readByteInverse(21.toByte())
                Class177.method1352(i_196_, i_197_, i, (-98).toByte())
                Class348_Sub3.aClass114_6584 = null
                return true
            }
            if (Class348_Sub40_Sub12.aClass114_9197 == Class348_Sub3.aClass114_6584) {
                val string = Class299.aClass348_Sub49_Sub2_3813!!.readString((-43).toByte())
                val string_198_ = Class59_Sub2_Sub2.method572((Class348_Sub40_Sub32.method3136(64.toByte(), (Class299.aClass348_Sub49_Sub2_3813))), 23034)
                Class286_Sub2.method2144(string, 6, (-101).toByte(), 0, string_198_, string, string)
                Class348_Sub3.aClass114_6584 = null
                return true
            }
            if (Class348_Sub3.aClass114_6584 == Class127_Sub1.aClass114_8385) {
                val i = Class299.aClass348_Sub49_Sub2_3813!!.readIntLittle((-124).toByte())
                val string = Class299.aClass348_Sub49_Sub2_3813!!.readString((-97).toByte())
                Class318_Sub1_Sub1_Sub1.method2397((-125).toByte())
                method1803(i, string, -32394)
                Class348_Sub3.aClass114_6584 = null
                return true
            }
            if (Class348_Sub3.aClass114_6584 == Class174.aClass114_2305) {
                val i = Class299.aClass348_Sub49_Sub2_3813!!.readIntMiddleEndian(82.toByte())
                val i_199_ = Class299.aClass348_Sub49_Sub2_3813!!.readIntInverseMiddle(255)
                val i_200_ = Class299.aClass348_Sub49_Sub2_3813!!.readShortLittle(false)
                Class318_Sub1_Sub1_Sub1.method2397((-126).toByte())
                method1703(5, i, i_200_, 4, i_199_)
                Class348_Sub3.aClass114_6584 = null
                return true
            }
            if (Class368.aClass114_4500 == Class348_Sub3.aClass114_6584) {
                val bool_201_ = (Class299.aClass348_Sub49_Sub2_3813!!.readByteInverse(21.toByte()) == 1)
                Class318_Sub1_Sub1_Sub1.method2397((-124).toByte())
                Class122.aBoolean1801 = bool_201_
                Class348_Sub3.aClass114_6584 = null
                return true
            }
            if (Class348_Sub3.aClass114_6584 == Class59.aClass114_1068) {
                Class268.method2038(-103)
                Class348_Sub3.aClass114_6584 = null
                return true
            }
            if (Class348_Sub1_Sub2.aClass114_8817 == Class348_Sub3.aClass114_6584) {
                za.anInt7276 = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedByteSubtract(69.toByte())
                Class290.anInt3713 = Class299.aClass348_Sub49_Sub2_3813!!.readByteAdd((-82).toByte())
                Class348_Sub3.aClass114_6584 = null
                return true
            }
            if (Class348_Sub3.aClass114_6584 == Class348_Sub40_Sub19.aClass114_9257) {
                val i = Class299.aClass348_Sub49_Sub2_3813!!.readByteInverse(21.toByte())
                val i_202_ = Class299.aClass348_Sub49_Sub2_3813!!.readShortAdd(127)
                Class318_Sub1_Sub1_Sub1.method2397((-125).toByte())
                if (i == 2) Class130_Sub1.method1134(92)
                r.anInt9721 = i_202_
                Class348_Sub7.method2772(i_202_, 123.toByte())
                method1713(false, 520)
                Class66.method703(r.anInt9721)
                for (i_203_ in 0..99) Class152.aBooleanArray2076!![i_203_] = true
                Class348_Sub3.aClass114_6584 = null
                return true
            }
            if (Class348_Sub3.aClass114_6584 == Class260.aClass114_3307) {
                if (!Class340.method2672(Class240.anInt4674, -105)) Class289.anInt3699 = (Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944) * 30)
                else Class289.anInt3699 = (Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944).toFloat() * 2.5f).toInt()
                Class348_Sub40_Sub23.anInt9313 = Class311.anInt3918
                Class348_Sub3.aClass114_6584 = null
                return true
            }
            if (Class348_Sub3.aClass114_6584 == Class318_Sub1.aClass114_6383) {
                var i = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                if (i == 65535) i = -1
                val i_204_ = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255)
                val i_205_ = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                val i_206_ = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255)
                Class279.method2090(i_204_, 256, true, (-35).toByte(), i_206_, i_205_, i)
                Class348_Sub3.aClass114_6584 = null
                return true
            }
            if (Class318_Sub1_Sub5_Sub2.aClass114_10149 == Class348_Sub3.aClass114_6584) {
                var i = Class299.aClass348_Sub49_Sub2_3813!!.readShortAdd(-16)
                if (i == 65535) i = -1
                val i_207_ = Class299.aClass348_Sub49_Sub2_3813!!.readIntMiddleEndian(82.toByte())
                Class318_Sub1_Sub1_Sub1.method2397((-125).toByte())
                method1703(1, i_207_, i, 4, -1)
                Class348_Sub3.aClass114_6584 = null
                return true
            }
            if (Class348_Sub3.aClass114_6584 == Class47.aClass114_843) {
                method128(Class91.aClass74_1519, 8.toByte())
                Class348_Sub3.aClass114_6584 = null
                return true
            }
            if (Class348_Sub3.aClass114_6584 == Class239_Sub4.aClass114_5883) {
                var i = Class299.aClass348_Sub49_Sub2_3813!!.readShortAdd(125)
                if (i == 65535) i = -1
                var i_208_ = Class299.aClass348_Sub49_Sub2_3813!!.readShortLittle(false)
                if (i_208_ == 65535) i_208_ = -1
                val i_209_ = Class299.aClass348_Sub49_Sub2_3813!!.readInt((-126).toByte())
                val i_210_ = Class299.aClass348_Sub49_Sub2_3813!!.readIntInverseMiddle(255)
                Class318_Sub1_Sub1_Sub1.method2397((-127).toByte())
                for (i_211_ in i_208_..i) {
                    val l = i_211_.toLong() + (i_209_.toLong() shl 32)
                    val class348_sub44 = (Class226.aClass356_2959!!.method3480(l, -6008) as Class348_Sub44?)
                    val class348_sub44_212_: Class348_Sub44?
                    if (class348_sub44 != null) {
                        class348_sub44_212_ = Class348_Sub44(i_210_, (class348_sub44.anInt7093))
                        class348_sub44.method2715(80.toByte())
                    } else if (i_211_ == -1) class348_sub44_212_ = (Class348_Sub44(i_210_, method2570(1512932720, i_209_)!!.aClass348_Sub44_748!!.anInt7093))
                    else class348_sub44_212_ = Class348_Sub44(i_210_, -1)
                    Class226.aClass356_2959!!.method3483(114.toByte(), l, class348_sub44_212_)
                }
                Class348_Sub3.aClass114_6584 = null
                return true
            }
            if (Class348_Sub3.aClass114_6584 == Class151.aClass114_2068) {
                val i = Class299.aClass348_Sub49_Sub2_3813!!.readShortAdd(-103)
                val i_213_ = Class299.aClass348_Sub49_Sub2_3813!!.readIntInverseMiddle(255)
                Class318_Sub1_Sub3_Sub3.aClass170_10209!!.method1316((-124).toByte(), i, i_213_)
                Class348_Sub3.aClass114_6584 = null
                return true
            }
            if (Class348_Sub3.aClass114_6584 == Class314_Sub1.aClass114_6340) {
                Class299.aClass348_Sub49_Sub2_3813!!.anInt7197 += 28
                if (Class299.aClass348_Sub49_Sub2_3813!!.method3352(-25541)) Class179.method1365((Class299.aClass348_Sub49_Sub2_3813!!.anInt7197) + -28, (-126).toByte(), Class299.aClass348_Sub49_Sub2_3813!!)
                Class348_Sub3.aClass114_6584 = null
                return true
            }
            if (Class348_Sub3.aClass114_6584 == Class17.aClass114_250) {
                Class309.anInt4816 = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255)
                Class348_Sub40_Sub23.anInt9313 = Class311.anInt3918
                Class348_Sub3.aClass114_6584 = null
                return true
            }
            if (Class185.aClass114_2483 == Class348_Sub3.aClass114_6584) {
                val i = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedByteSubtract(20.toByte())
                val i_214_ = Class299.aClass348_Sub49_Sub2_3813!!.readByteInverse(21.toByte())
                val i_215_ = Class299.aClass348_Sub49_Sub2_3813!!.readIntMiddleEndian(82.toByte())
                Class186.anIntArray2497!![i_214_] = i_215_
                Class161.anIntArray2145!![i_214_] = i
                Class256.anIntArray3295!![i_214_] = 1
                val i_216_ = OutputStream_Sub1.anIntArray100!![i_214_] + -1
                var i_217_ = 0
                while (i_216_ > i_217_) {
                    if (Class59_Sub1_Sub2.anIntArray8663!![i_217_] <= i_215_) Class256.anIntArray3295!![i_214_] = i_217_ - -2
                    i_217_++
                }
                Class199.anIntArray2632!![Class139.method1166(31, Class326.anInt4086++)] = i_214_
                Class348_Sub3.aClass114_6584 = null
                return true
            }
            if (Class19.aClass114_315 == Class348_Sub3.aClass114_6584) {
                method128(Class162.aClass74_2157, 8.toByte())
                Class348_Sub3.aClass114_6584 = null
                return true
            }
            if (Class28.aClass114_4998 == Class348_Sub3.aClass114_6584) {
                val i = Class299.aClass348_Sub49_Sub2_3813!!.readShortAdd(10)
                val i_218_ = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedByteSubtract(70.toByte())
                val bool_219_ = (0x1 and i_218_) == 1
                Class348_Sub40_Sub3.method3054(bool_219_, i, -128)
                Class199.anIntArray2633!![Class139.method1166(31, Class106.anInt1631++)] = i
                Class348_Sub3.aClass114_6584 = null
                return true
            }
            if (Class348_Sub40_Sub16.aClass114_9225 == Class348_Sub3.aClass114_6584) {
                val i = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                val i_220_ = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255)
                val bool_221_ = (i_220_ and 0x1) == 1
                while ((Class299.aClass348_Sub49_Sub2_3813!!.anInt7197) < Class348_Sub40_Sub25.anInt9341) {
                    val i_222_ = Class299.aClass348_Sub49_Sub2_3813!!.readSmart(-125)
                    val i_223_ = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                    var i_224_ = 0
                    if (i_223_ != 0) {
                        i_224_ = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255)
                        if (i_224_ == 255) i_224_ = Class299.aClass348_Sub49_Sub2_3813!!.readInt((-126).toByte())
                    }
                    Canvas_Sub1.method121(i, -364570972, bool_221_, i_222_, i_224_, -1 + i_223_)
                }
                Class199.anIntArray2633!![Class139.method1166(31, Class106.anInt1631++)] = i
                Class348_Sub3.aClass114_6584 = null
                return true
            }
            if (Class239_Sub11.aClass114_5950 == Class348_Sub3.aClass114_6584) {
                var i = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedByteSubtract((-113).toByte())
                var i_225_ = Class299.aClass348_Sub49_Sub2_3813!!.readByteAdd(127.toByte())
                if (i == 255) {
                    i_225_ = -1
                    i = -1
                }
                method1825(120, i_225_, i)
                Class348_Sub3.aClass114_6584 = null
                return true
            }
            if (Class367_Sub11.aClass114_7398 == Class348_Sub3.aClass114_6584) {
                val i = Class299.aClass348_Sub49_Sub2_3813!!.readIntLittle((-124).toByte())
                val i_226_ = Class299.aClass348_Sub49_Sub2_3813!!.readShortLittle(false)
                Class318_Sub1_Sub1_Sub1.method2397((-124).toByte())
                Class50_Sub3.method467(i_226_, -18075, i)
                Class348_Sub3.aClass114_6584 = null
                return true
            }
            if (Class209.aClass114_2717 == Class348_Sub3.aClass114_6584) {
                Class91.method856(63.toByte())
                Class348_Sub3.aClass114_6584 = null
                return true
            }
            if (Class367_Sub3.aClass114_7301 == Class348_Sub3.aClass114_6584) {
                val bool_227_ = (Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255) == 1)
                val string = Class299.aClass348_Sub49_Sub2_3813!!.readString(89.toByte())
                var string_228_ = string
                if (bool_227_) string_228_ = Class299.aClass348_Sub49_Sub2_3813!!.readString(98.toByte())
                val i = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255)
                val i_229_ = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                var bool_230_ = false
                if (i <= 1 && Class351.method3455(string_228_, 28280)) bool_230_ = true
                if (!bool_230_ && Class250.anInt3227 == 0) {
                    val string_231_ = (Class239_Sub6.aClass355_5900!!.method3471(i_229_, (-108).toByte()).method3216(Class299.aClass348_Sub49_Sub2_3813!!, 93.toByte()))
                    if (i == 2) Class318_Sub1_Sub3_Sub5.method2477("<img=1>" + string_228_, string_231_, (-127).toByte(), i_229_, "<img=1>" + string, null, 25, 0, string)
                    else if (i != 1) Class318_Sub1_Sub3_Sub5.method2477(string_228_, string_231_, (-119).toByte(), i_229_, string, null, 25, 0, string)
                    else Class318_Sub1_Sub3_Sub5.method2477("<img=0>" + string_228_, string_231_, (-125).toByte(), i_229_, "<img=0>" + string, null, 25, 0, string)
                }
                Class348_Sub3.aClass114_6584 = null
                return true
            }
            if (Class140.aClass114_1959 == Class348_Sub3.aClass114_6584) {
                val i = Class299.aClass348_Sub49_Sub2_3813!!.readIntInverseMiddle(255)
                val i_232_ = Class299.aClass348_Sub49_Sub2_3813!!.readShortAdd(-110)
                Class318_Sub1_Sub1_Sub1.method2397((-124).toByte())
                Class348_Sub49_Sub2.method3411(i, 12, i_232_)
                Class348_Sub3.aClass114_6584 = null
                return true
            }
            if (Class348_Sub3.aClass114_6584 == Class359.aClass114_4421) {
                Class230.anInt2986 = Class311.anInt3918
                if (Class348_Sub40_Sub25.anInt9341 == 0) {
                    Class37.anInt496 = 0
                    Class50.aString863 = null
                    Class169.aClass19Array2261 = null
                    Class348_Sub21.aString6854 = null
                    Class348_Sub3.aClass114_6584 = null
                    return true
                }
                Class348_Sub21.aString6854 = Class299.aClass348_Sub49_Sub2_3813!!.readString((-112).toByte())
                var bool_233_ = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255) == 1
                if (bool_233_) Class299.aClass348_Sub49_Sub2_3813!!.readString(108.toByte())
                val l = Class299.aClass348_Sub49_Sub2_3813!!.readLong(-456577760)
                Class50.aString863 = Class27.method313(l, -104)
                Class219.aByte2871 = Class299.aClass348_Sub49_Sub2_3813!!.readByte(-90)
                val i = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255)
                if (i == 255) {
                    Class348_Sub3.aClass114_6584 = null
                    return true
                }
                Class37.anInt496 = i
                val class19s = arrayOfNulls<Class19>(100)
                var i_234_ = 0
                while (Class37.anInt496 > i_234_) {
                    class19s[i_234_] = Class19()
                    class19s[i_234_]!!.aString314 = Class299.aClass348_Sub49_Sub2_3813!!.readString(103.toByte())
                    bool_233_ = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255) == 1
                    if (!bool_233_) class19s[i_234_]!!.aString306 = class19s[i_234_]!!.aString314
                    else class19s[i_234_]!!.aString306 = Class299.aClass348_Sub49_Sub2_3813!!.readString(107.toByte())
                    class19s[i_234_]!!.aString312 = method2127(2, (class19s[i_234_]!!.aString306))
                    class19s[i_234_]!!.anInt308 = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                    class19s[i_234_]!!.aByte310 = Class299.aClass348_Sub49_Sub2_3813!!.readByte(-118)
                    class19s[i_234_]!!.aString313 = Class299.aClass348_Sub49_Sub2_3813!!.readString((-124).toByte())
                    if (class19s[i_234_]!!.aString306 == Class132.aPlayer_1907!!.aString10544) Class119_Sub1.aByte4702 = class19s[i_234_]!!.aByte310
                    i_234_++
                }
                var bool_235_ = false
                var i_236_ = Class37.anInt496
                while (i_236_ > 0) {
                    i_236_--
                    bool_235_ = true
                    var i_237_ = 0
                    while (i_236_ > i_237_) {
                        if ((class19s[i_237_]!!.aString312!!.compareTo(class19s[1 + i_237_]!!.aString312!!)) > 0) {
                            val class19 = class19s[i_237_]
                            class19s[i_237_] = class19s[i_237_ - -1]
                            class19s[1 + i_237_] = class19
                            bool_235_ = false
                        }
                        i_237_++
                    }
                    if (bool_235_) break
                }
                Class169.aClass19Array2261 = class19s
                Class348_Sub3.aClass114_6584 = null
                return true
            }
            Class156.method1242(("T1 - " + (if (Class348_Sub3.aClass114_6584 == null) -1 else Class348_Sub3.aClass114_6584!!.method1058(110.toByte())) + "," + (if (Class239.aClass114_3145 == null) -1 else Class239.aClass114_3145!!.method1058(127.toByte())) + "," + (if (Class348_Sub40_Sub36.aClass114_9456 == null) -1 else Class348_Sub40_Sub36.aClass114_9456!!.method1058(125.toByte())) + " - " + Class348_Sub40_Sub25.anInt9341), null, 15004)
            Class348_Sub40_Sub34.method3141(false, 11.toByte())
            return true
        }

        @JvmStatic
        fun method3202(i: Byte) {
            aClass230_10434 = null
            if (i > 38) {
                aLongArrayArrayArray10431 = null
                aClass76_10436 = null
                aClass74_10437 = null
            }
        }
    }
}
