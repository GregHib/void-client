import java.io.EOFException
import java.io.File
import java.io.IOException

class Class78 internal constructor(private val aClass234_1312: Class234, i: Int, i_22_: Int) {
    private val aByteArray1305: ByteArray
    private val aByteArray1311: ByteArray
    private var anInt1314 = 0
    private var aLong1315: Long = 0
    private var aLong1317: Long
    private var aLong1319 = -1L
    private var anInt1320 = 0
    private var aLong1321 = -1L
    private var aLong1323: Long
    private var aLong1324: Long

    @Throws(IOException::class)
    fun method783(i: Int, i_0_: Int, bool: Boolean, `is`: ByteArray?) {
        var i = i
        var i_0_ = i_0_
        anInt1310++
        try {
            if (aLong1324 - -i_0_.toLong() > aLong1323) aLong1323 = i_0_.toLong() + aLong1324
            if (aLong1321 != -1L && (aLong1321 > aLong1324 || (aLong1324 > anInt1314.toLong() + aLong1321))) method791(-1)
            if (aLong1321 != -1L && (aLong1324 + i_0_.toLong() > aByteArray1305.size.toLong() + aLong1321)) {
                val i_1_ = (aByteArray1305.size.toLong() + (aLong1321 + -aLong1324)).toInt()
                Class214.method1577(`is`!!, i, aByteArray1305, (-aLong1321 + aLong1324).toInt(), i_1_)
                i += i_1_
                i_0_ -= i_1_
                aLong1324 += i_1_.toLong()
                anInt1314 = aByteArray1305.size
                method791(-1)
            }
            if (aByteArray1305.size < i_0_) {
                if (aLong1315 != aLong1324) {
                    aClass234_1312.method1661(-18968, aLong1324)
                    aLong1315 = aLong1324
                }
                aClass234_1312.method1658(115.toByte(), i, i_0_, `is`)
                aLong1315 += i_0_.toLong()
                if (aLong1317 < aLong1315) aLong1317 = aLong1315
                var l = -1L
                if ((aLong1319 <= aLong1324) && (aLong1319 + anInt1320.toLong() > aLong1324)) l = aLong1324
                else if ((aLong1324 <= aLong1319) && aLong1319 < aLong1324 - -i_0_.toLong()) l = aLong1319
                var l_2_ = -1L
                if (i_0_.toLong() + aLong1324 > aLong1319 && anInt1320.toLong() + aLong1319 >= aLong1324 + i_0_.toLong()) l_2_ = i_0_.toLong() + aLong1324
                else if ((aLong1324 < anInt1320.toLong() + aLong1319) && (i_0_.toLong() + aLong1324 >= aLong1319 + anInt1320.toLong())) l_2_ = anInt1320.toLong() + aLong1319
                if (l > -1L && l_2_ > l) {
                    val i_3_ = (l_2_ + -l).toInt()
                    Class214.method1577(`is`!!, (-aLong1324 + l + i.toLong()).toInt(), aByteArray1311, (-aLong1319 + l).toInt(), i_3_)
                }
                aLong1324 += i_0_.toLong()
                return
            }
            if (i_0_ > 0) {
                if (aLong1321 == -1L) aLong1321 = aLong1324
                Class214.method1577(`is`!!, i, aByteArray1305, (-aLong1321 + aLong1324).toInt(), i_0_)
                aLong1324 += i_0_.toLong()
                if (aLong1324 + -aLong1321 > anInt1314.toLong()) anInt1314 = (-aLong1321 + aLong1324).toInt()
                return
            }
        } catch (ioexception: IOException) {
            aLong1315 = -1L
            throw ioexception
        }
        if (bool != true) anInt1314 = -69
    }

    @Throws(IOException::class)
    fun method784(i: Int, `is`: ByteArray) {
        val i_4_ = -98 % ((1 - i) / 40)
        method788(0, `is`, `is`.size, -16717)
        anInt1313++
    }

    private fun method785(i: Int): File? {
        anInt1316++
        if (i != -8659) method785(-88)
        return aClass234_1312.method1660(i xor 0x2198.inv())
    }

    fun method787(i: Int): Long {
        if (i != 0) return 26L
        anInt1318++
        return aLong1323
    }

    @Throws(IOException::class)
    fun method788(i: Int, `is`: ByteArray, i_5_: Int, i_6_: Int) {
        var i = i
        var i_5_ = i_5_
        anInt1307++
        try {
            if (i_5_ + i > `is`.size) throw ArrayIndexOutOfBoundsException(i + (i_5_ - `is`.size))
            if (i_6_ != -16717) return
            if (aLong1321 != -1L && aLong1324 >= aLong1321 && (aLong1324 - -i_5_.toLong() <= anInt1314.toLong() + aLong1321)) {
                Class214.method1577(aByteArray1305, (-aLong1321 + aLong1324).toInt(), `is`, i, i_5_)
                aLong1324 += i_5_.toLong()
                return
            }
            val l = aLong1324
            val i_7_ = i
            val i_8_ = i_5_
            if (aLong1324 >= aLong1319 && (aLong1319 - -anInt1320.toLong() > aLong1324)) {
                var i_9_ = (anInt1320.toLong() - (-aLong1319 + aLong1324)).toInt()
                if (i_5_ < i_9_) i_9_ = i_5_
                Class214.method1577(aByteArray1311, (aLong1324 + -aLong1319).toInt(), `is`, i, i_9_)
                aLong1324 += i_9_.toLong()
                i_5_ -= i_9_
                i += i_9_
            }
            if (i_5_ > aByteArray1311.size) {
                aClass234_1312.method1661(i_6_ + -2251, aLong1324)
                aLong1315 = aLong1324
                var i_10_: Int
                while ( /**/i_5_ > 0) {
                    i_10_ = aClass234_1312.method1656(`is`, i, 8.toByte(), i_5_)
                    if (i_10_ == -1) break
                    i += i_10_
                    aLong1315 += i_10_.toLong()
                    aLong1324 += i_10_.toLong()
                    i_5_ -= i_10_
                }
            } else if (i_5_ > 0) {
                method792((-46).toByte())
                var i_11_ = i_5_
                if (anInt1320 < i_11_) i_11_ = anInt1320
                Class214.method1577(aByteArray1311, 0, `is`, i, i_11_)
                i += i_11_
                aLong1324 += i_11_.toLong()
                i_5_ -= i_11_
            }
            if (aLong1321 != -1L) {
                if (aLong1324 < aLong1321 && i_5_ > 0) {
                    var i_12_ = (aLong1321 - aLong1324).toInt() + i
                    if (i + i_5_ < i_12_) i_12_ = i + i_5_
                    while (i_12_ > i) {
                        `is`[i++] = 0.toByte()
                        i_5_--
                        aLong1324++
                    }
                }
                var l_13_ = -1L
                if (aLong1321 < l || (l - -i_8_.toLong() <= aLong1321)) {
                    if (aLong1321 <= l && l < aLong1321 - -anInt1314.toLong()) l_13_ = l
                } else l_13_ = aLong1321
                var l_14_ = -1L
                if (anInt1314.toLong() + aLong1321 <= l || (i_8_.toLong() + l < anInt1314.toLong() + aLong1321)) {
                    if ((aLong1321 < l - -i_8_.toLong()) && (anInt1314.toLong() + aLong1321 >= l - -i_8_.toLong())) l_14_ = l + i_8_.toLong()
                } else l_14_ = aLong1321 - -anInt1314.toLong()
                if (l_13_ > -1L && (l_13_ < l_14_)) {
                    val i_15_ = (l_14_ + -l_13_).toInt()
                    Class214.method1577(aByteArray1305, (l_13_ + -aLong1321).toInt(), `is`, i_7_ - -(l_13_ - l).toInt(), i_15_)
                    if (l_14_ > aLong1324) {
                        i_5_ -= (-aLong1324 + l_14_).toInt()
                        aLong1324 = l_14_
                    }
                }
            }
        } catch (ioexception: IOException) {
            aLong1315 = -1L
            throw ioexception
        }
        if (i_5_ > 0) throw EOFException()
    }

    @Throws(IOException::class)
    fun method789(l: Long, i: Byte) {
        try {
            anInt1309++
            if (l < 0) throw IOException("Invalid seek to " + l + " in file " + method785(-8659))
            val i_16_ = -67 / ((i - -49) / 34)
            aLong1324 = l
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, "l.A(" + l + ',' + i + ')')
        }
    }

    @Throws(IOException::class)
    fun method790(i: Byte) {
        anInt1304++
        method791(-1)
        aClass234_1312.method1657(false)
        val i_17_ = -26 % ((i - -7) / 51)
    }

    @Throws(IOException::class)
    private fun method791(i: Int) {
        if (i != -1) aLong1321 = 47L
        if (aLong1321 != -1L) {
            if (aLong1315 != aLong1321) {
                aClass234_1312.method1661(-18968, aLong1321)
                aLong1315 = aLong1321
            }
            aClass234_1312.method1658(120.toByte(), 0, anInt1314, aByteArray1305)
            aLong1315 += anInt1314.toLong()
            if (aLong1317 < aLong1315) aLong1317 = aLong1315
            var l = -1L
            var l_18_ = -1L
            if (aLong1319 <= aLong1321 && (aLong1321 < anInt1320.toLong() + aLong1319)) l = aLong1321
            else if ((aLong1319 >= aLong1321) && (aLong1319 < aLong1321 - -anInt1314.toLong())) l = aLong1319
            if ((anInt1314.toLong() + aLong1321 > aLong1319) && (anInt1314.toLong() + aLong1321 <= anInt1320.toLong() + aLong1319)) l_18_ = aLong1321 - -anInt1314.toLong()
            else if ((aLong1321 < aLong1319 + anInt1320.toLong()) && (aLong1319 + anInt1320.toLong() <= anInt1314.toLong() + aLong1321)) l_18_ = anInt1320.toLong() + aLong1319
            if (l > -1 && l < l_18_) {
                val i_19_ = (-l + l_18_).toInt()
                Class214.method1577(aByteArray1305, (l - aLong1321).toInt(), aByteArray1311, (-aLong1319 + l).toInt(), i_19_)
            }
            aLong1321 = -1L
            anInt1314 = 0
        }
        anInt1308++
    }

    @Throws(IOException::class)
    private fun method792(i: Byte) {
        anInt1320 = 0
        anInt1306++
        if (i.toInt() != -46) method785(111)
        if (aLong1315 != aLong1324) {
            aClass234_1312.method1661(-18968, aLong1324)
            aLong1315 = aLong1324
        }
        aLong1319 = aLong1324
        while (anInt1320 < aByteArray1311.size) {
            var i_20_ = -anInt1320 + aByteArray1311.size
            if (i_20_ > 200000000) i_20_ = 200000000
            val i_21_ = aClass234_1312.method1656(aByteArray1311, anInt1320, 125.toByte(), i_20_)
            if (i_21_ == -1) break
            anInt1320 += i_21_
            aLong1315 += i_21_.toLong()
        }
    }

    init {
        aLong1317 = aClass234_1312.method1662((-46).toByte())
        aLong1323 = aLong1317
        aByteArray1305 = ByteArray(i_22_)
        aByteArray1311 = ByteArray(i)
        aLong1324 = 0L
    }

    companion object {
        @JvmField
        var anInt1304: Int = 0
        @JvmField
        var anInt1306: Int = 0
        @JvmField
        var anInt1307: Int = 0
        @JvmField
        var anInt1308: Int = 0
        @JvmField
        var anInt1309: Int = 0
        @JvmField
        var anInt1310: Int = 0
        @JvmField
        var anInt1313: Int = 0
        @JvmField
        var anInt1316: Int = 0
        @JvmField
        var anInt1318: Int = 0
        @JvmField
        var aClass45_1322: Class45? = null
        @JvmStatic
        fun method786(i: Byte) {
            if (i.toInt() != 0) aClass45_1322 = null
            aClass45_1322 = null
        }
    }
}
