import java.util.*
import kotlin.math.pow
import kotlin.math.sin

class Class80 {
    @JvmField
    var anInt1407: Int = 0
    private var aClass197_1408: Class197? = null
    private val anIntArray1410 = IntArray(5)
    private val anIntArray1411 = IntArray(5)
    private var aClass197_1413: Class197? = null
    private var aClass197_1414: Class197? = null
    private var aClass197_1415: Class197? = null
    private var aClass197_1417: Class197? = null
    private var aClass197_1418: Class197? = null
    private var aClass349_1419: Class349? = null
    private var aClass197_1420: Class197? = null
    @JvmField
    var anInt1421: Int = 500
    private var anInt1422 = 100
    private var aClass197_1423: Class197? = null
    private var aClass197_1425: Class197? = null
    private var anInt1427 = 0
    private val anIntArray1428: IntArray
    private fun method806(i: Int, i_0_: Int, i_1_: Int): Int {
        if (i_1_ == 1) {
            if ((i and 0x7fff) < 16384) return i_0_
            return -i_0_
        }
        if (i_1_ == 2) return anIntArray1412!![i and 0x7fff] * i_0_ shr 14
        if (i_1_ == 3) return ((i and 0x7fff) * i_0_ shr 14) - i_0_
        if (i_1_ == 4) return anIntArray1416!![i / 2607 and 0x7fff] * i_0_
        return 0
    }

    fun method807(class348_sub49: Class348_Sub49) {
        aClass197_1418 = Class197()
        aClass197_1418!!.method1452(class348_sub49)
        aClass197_1408 = Class197()
        aClass197_1408!!.method1452(class348_sub49)
        var i = class348_sub49.readUnsignedByte(255)
        if (i != 0) {
            class348_sub49.anInt7197--
            aClass197_1415 = Class197()
            aClass197_1415!!.method1452(class348_sub49)
            aClass197_1425 = Class197()
            aClass197_1425!!.method1452(class348_sub49)
        }
        i = class348_sub49.readUnsignedByte(255)
        if (i != 0) {
            class348_sub49.anInt7197--
            aClass197_1413 = Class197()
            aClass197_1413!!.method1452(class348_sub49)
            aClass197_1423 = Class197()
            aClass197_1423!!.method1452(class348_sub49)
        }
        i = class348_sub49.readUnsignedByte(255)
        if (i != 0) {
            class348_sub49.anInt7197--
            aClass197_1414 = Class197()
            aClass197_1414!!.method1452(class348_sub49)
            aClass197_1420 = Class197()
            aClass197_1420!!.method1452(class348_sub49)
        }
        for (i_2_ in 0..9) {
            val i_3_ = class348_sub49.readSmart(-118)
            if (i_3_ == 0) break
            anIntArray1410[i_2_] = i_3_
            anIntArray1411[i_2_] = class348_sub49.method3362(77.toByte())
            anIntArray1428[i_2_] = class348_sub49.readSmart(-121)
        }
        anInt1427 = class348_sub49.readSmart(-120)
        anInt1422 = class348_sub49.readSmart(-122)
        this.anInt1421 = class348_sub49.readUnsignedShort(842397944)
        this.anInt1407 = class348_sub49.readUnsignedShort(842397944)
        aClass349_1419 = Class349()
        aClass197_1417 = Class197()
        aClass349_1419!!.method3446(class348_sub49, aClass197_1417!!)
    }

    fun method809(i: Int, i_4_: Int): IntArray? {
        Class214.method1573(anIntArray1409!!, 0, i)
        if (i_4_ < 10) return anIntArray1409
        val d = i.toDouble() / (i_4_.toDouble() + 0.0)
        aClass197_1418!!.method1453()
        aClass197_1408!!.method1453()
        var i_5_ = 0
        var i_6_ = 0
        var i_7_ = 0
        if (aClass197_1415 != null) {
            aClass197_1415!!.method1453()
            aClass197_1425!!.method1453()
            i_5_ = ((aClass197_1415!!.anInt2606 - aClass197_1415!!.anInt2607).toDouble() * 32.768 / d).toInt()
            i_6_ = (aClass197_1415!!.anInt2607.toDouble() * 32.768 / d).toInt()
        }
        var i_8_ = 0
        var i_9_ = 0
        var i_10_ = 0
        if (aClass197_1413 != null) {
            aClass197_1413!!.method1453()
            aClass197_1423!!.method1453()
            i_8_ = ((aClass197_1413!!.anInt2606 - aClass197_1413!!.anInt2607).toDouble() * 32.768 / d).toInt()
            i_9_ = (aClass197_1413!!.anInt2607.toDouble() * 32.768 / d).toInt()
        }
        for (i_11_ in 0..4) {
            if (anIntArray1410[i_11_] != 0) {
                anIntArray1431!![i_11_] = 0
                anIntArray1424!![i_11_] = (anIntArray1428[i_11_].toDouble() * d).toInt()
                anIntArray1430!![i_11_] = (anIntArray1410[i_11_] shl 14) / 100
                anIntArray1429!![i_11_] = ((aClass197_1418!!.anInt2606 - aClass197_1418!!.anInt2607).toDouble() * 32.768 * 1.0057929410678534.pow(anIntArray1411[i_11_].toDouble()) / d).toInt()
                anIntArray1426!![i_11_] = (aClass197_1418!!.anInt2607.toDouble() * 32.768 / d).toInt()
            }
        }
        for (i_12_ in 0..<i) {
            var i_13_ = aClass197_1418!!.method1451(i)
            var i_14_ = aClass197_1408!!.method1451(i)
            if (aClass197_1415 != null) {
                val i_15_ = aClass197_1415!!.method1451(i)
                val i_16_ = aClass197_1425!!.method1451(i)
                i_13_ += method806(i_7_, i_16_, aClass197_1415!!.anInt2603) shr 1
                i_7_ += (i_15_ * i_5_ shr 16) + i_6_
            }
            if (aClass197_1413 != null) {
                val i_17_ = aClass197_1413!!.method1451(i)
                val i_18_ = aClass197_1423!!.method1451(i)
                i_14_ = (i_14_ * ((method806(i_10_, i_18_, aClass197_1413!!.anInt2603) shr 1) + 32768)) shr 15
                i_10_ += (i_17_ * i_8_ shr 16) + i_9_
            }
            for (i_19_ in 0..4) {
                if (anIntArray1410[i_19_] != 0) {
                    val i_20_: Int = i_12_ + anIntArray1424!![i_19_]
                    if (i_20_ < i) {
                        anIntArray1409!![i_20_] += method806(anIntArray1431!![i_19_], i_14_ * anIntArray1430!![i_19_] shr 15, (aClass197_1418!!.anInt2603))
                        anIntArray1431!![i_19_] += ((i_13_ * anIntArray1429!![i_19_] shr 16) + anIntArray1426!![i_19_])
                    }
                }
            }
        }
        if (aClass197_1414 != null) {
            aClass197_1414!!.method1453()
            aClass197_1420!!.method1453()
            var i_21_ = 0
            val bool = false
            var bool_22_ = true
            for (i_23_ in 0..<i) {
                val i_24_ = aClass197_1414!!.method1451(i)
                val i_25_ = aClass197_1420!!.method1451(i)
                val i_26_: Int
                if (bool_22_) i_26_ = (aClass197_1414!!.anInt2607 + ((aClass197_1414!!.anInt2606 - aClass197_1414!!.anInt2607) * i_24_ shr 8))
                else i_26_ = (aClass197_1414!!.anInt2607 + ((aClass197_1414!!.anInt2606 - aClass197_1414!!.anInt2607) * i_25_ shr 8))
                i_21_ += 256
                if (i_21_ >= i_26_) {
                    i_21_ = 0
                    bool_22_ = !bool_22_
                }
                if (bool_22_) anIntArray1409!![i_23_] = 0
            }
        }
        if (anInt1427 > 0 && anInt1422 > 0) {
            val i_27_ = (anInt1427.toDouble() * d).toInt()
            for (i_28_ in i_27_..<i) anIntArray1409!![i_28_] += anIntArray1409!![i_28_ - i_27_] * anInt1422 / 100
        }
        if (aClass349_1419!!.anIntArray4299[0] > 0 || aClass349_1419!!.anIntArray4299[1] > 0) {
            aClass197_1417!!.method1453()
            var i_29_ = aClass197_1417!!.method1451(i + 1)
            var i_30_ = aClass349_1419!!.method3451(0, i_29_.toFloat() / 65536.0f)
            var i_31_ = aClass349_1419!!.method3451(1, i_29_.toFloat() / 65536.0f)
            if (i >= i_30_ + i_31_) {
                var i_32_ = 0
                var i_33_ = i_31_
                if (i_33_ > i - i_30_) i_33_ = i - i_30_
                while ( /**/i_32_ < i_33_) {
                    var i_34_ = ((anIntArray1409!![i_32_ + i_30_].toLong() * Class349.anInt4303.toLong()) shr 16).toInt()
                    for (i_35_ in 0..<i_30_) i_34_ += (((anIntArray1409!![i_32_ + i_30_ - 1 - i_35_]).toLong() * (Class349.anIntArrayArray4301!![0]!![i_35_]).toLong()) shr 16).toInt()
                    for (i_36_ in 0..<i_32_) i_34_ -= ((anIntArray1409!![i_32_ - 1 - i_36_].toLong() * (Class349.anIntArrayArray4301!![1]!![i_36_]).toLong()) shr 16).toInt()
                    anIntArray1409!![i_32_] = i_34_
                    i_29_ = aClass197_1417!!.method1451(i + 1)
                    i_32_++
                }
                i_33_ = 128
                while (true) {
                    if (i_33_ > i - i_30_) i_33_ = i - i_30_
                    while ( /**/i_32_ < i_33_) {
                        var i_37_ = ((anIntArray1409!![i_32_ + i_30_].toLong() * Class349.anInt4303.toLong()) shr 16).toInt()
                        for (i_38_ in 0..<i_30_) i_37_ += (((anIntArray1409!![i_32_ + i_30_ - 1 - i_38_]).toLong() * (Class349.anIntArrayArray4301!![0]!![i_38_]).toLong()) shr 16).toInt()
                        for (i_39_ in 0..<i_31_) i_37_ -= (((anIntArray1409!![i_32_ - 1 - i_39_]).toLong() * (Class349.anIntArrayArray4301!![1]!![i_39_]).toLong()) shr 16).toInt()
                        anIntArray1409!![i_32_] = i_37_
                        i_29_ = aClass197_1417!!.method1451(i + 1)
                        i_32_++
                    }
                    if (i_32_ >= i - i_30_) break
                    i_30_ = aClass349_1419!!.method3451(0, i_29_.toFloat() / 65536.0f)
                    i_31_ = aClass349_1419!!.method3451(1, i_29_.toFloat() / 65536.0f)
                    i_33_ += 128
                }
                while ( /**/i_32_ < i) {
                    var i_40_ = 0
                    for (i_41_ in i_32_ + i_30_ - i..<i_30_) i_40_ += (((anIntArray1409!![i_32_ + i_30_ - 1 - i_41_]).toLong() * (Class349.anIntArrayArray4301!![0]!![i_41_]).toLong()) shr 16).toInt()
                    for (i_42_ in 0..<i_31_) i_40_ -= ((anIntArray1409!![i_32_ - 1 - i_42_].toLong() * (Class349.anIntArrayArray4301!![1]!![i_42_]).toLong()) shr 16).toInt()
                    anIntArray1409!![i_32_] = i_40_
                    i_29_ = aClass197_1417!!.method1451(i + 1)
                    i_32_++
                }
            }
        }
        for (i_43_ in 0..<i) {
            if (anIntArray1409!![i_43_] < -32768) anIntArray1409!![i_43_] = -32768
            if (anIntArray1409!![i_43_] > 32767) anIntArray1409!![i_43_] = 32767
        }
        return anIntArray1409
    }

    init {
        anIntArray1428 = IntArray(5)
    }

    companion object {
        private var anIntArray1409: IntArray?
        private var anIntArray1412: IntArray?
        private var anIntArray1416: IntArray? = IntArray(32768)
        private var anIntArray1424: IntArray?
        private var anIntArray1426: IntArray?
        private var anIntArray1429: IntArray?
        private var anIntArray1430: IntArray?
        private var anIntArray1431: IntArray?

        @JvmStatic
        fun method808() {
            anIntArray1409 = null
            anIntArray1416 = null
            anIntArray1412 = null
            anIntArray1431 = null
            anIntArray1424 = null
            anIntArray1430 = null
            anIntArray1429 = null
            anIntArray1426 = null
        }

        init {
            val random = Random(0L)
            for (i in 0..32767) anIntArray1416!![i] = (random.nextInt() and 0x2) - 1
            anIntArray1412 = IntArray(32768)
            for (i in 0..32767) anIntArray1412!![i] = (sin(i.toDouble() / 5215.1903) * 16384.0).toInt()
            anIntArray1409 = IntArray(220500)
            anIntArray1424 = IntArray(5)
            anIntArray1426 = IntArray(5)
            anIntArray1429 = IntArray(5)
            anIntArray1431 = IntArray(5)
            anIntArray1430 = IntArray(5)
        }
    }
}
