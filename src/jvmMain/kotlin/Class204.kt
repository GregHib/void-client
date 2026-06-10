/* Class204 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class204 {
    private val aClass348_Sub49_2677: Class348_Sub49
    private var anIntArray2678: IntArray? = null
    private var anIntArray2679: IntArray? = null
    private var aLong2680: Long = 0
    var anIntArray2681: IntArray? = null
    private var anIntArray2682: IntArray? = null
    var anInt2683: Int = 0
    private var anInt2684 = 0

    fun method1480(): Boolean {
        val i = anIntArray2682!!.size
        for (i_0_ in 0..<i) {
            if (anIntArray2682!![i_0_] >= 0) return false
        }
        return true
    }

    private fun method1481(i: Int, i_1_: Int): Int {
        if (i_1_ == 255) {
            val i_2_ = aClass348_Sub49_2677.readUnsignedByte(255)
            var i_3_ = aClass348_Sub49_2677.method3366(112.toByte())
            if (i_2_ == 47) {
                aClass348_Sub49_2677.anInt7197 += i_3_
                return 1
            }
            if (i_2_ == 81) {
                val i_4_ = aClass348_Sub49_2677.readMedium(-1)
                i_3_ -= 3
                val i_5_ = this.anIntArray2681!![i]
                aLong2680 += i_5_.toLong() * (anInt2684 - i_4_).toLong()
                anInt2684 = i_4_
                aClass348_Sub49_2677.anInt7197 += i_3_
                return 2
            }
            aClass348_Sub49_2677.anInt7197 += i_3_
            return 3
        }
        val i_6_: Byte = aByteArray2676!![i_1_ - 128]
        var i_7_ = i_1_
        if (i_6_ >= 1) i_7_ = i_7_ or (aClass348_Sub49_2677.readUnsignedByte(255) shl 8)
        if (i_6_ >= 2) i_7_ = i_7_ or (aClass348_Sub49_2677.readUnsignedByte(255) shl 16)
        return i_7_
    }

    fun method1482(`is`: ByteArray?) {
        aClass348_Sub49_2677.aByteArray7154 = `is`
        aClass348_Sub49_2677.anInt7197 = 10
        val i = aClass348_Sub49_2677.readUnsignedShort(842397944)
        this.anInt2683 = aClass348_Sub49_2677.readUnsignedShort(842397944)
        anInt2684 = 500000
        anIntArray2679 = IntArray(i)
        var i_8_ = 0
        while (i_8_ < i) {
            val i_9_ = aClass348_Sub49_2677.readInt((-126).toByte())
            val i_10_ = aClass348_Sub49_2677.readInt((-126).toByte())
            if (i_9_ == 1297379947) {
                anIntArray2679!![i_8_] = aClass348_Sub49_2677.anInt7197
                i_8_++
            }
            aClass348_Sub49_2677.anInt7197 += i_10_
        }
        aLong2680 = 0L
        anIntArray2682 = IntArray(i)
        for (i_11_ in 0..<i) anIntArray2682!![i_11_] = anIntArray2679!![i_11_]
        this.anIntArray2681 = IntArray(i)
        anIntArray2678 = IntArray(i)
    }

    fun method1483(): Int {
        return anIntArray2682!!.size
    }

    fun method1484(l: Long) {
        aLong2680 = l
        val i = anIntArray2682!!.size
        for (i_12_ in 0..<i) {
            this.anIntArray2681!![i_12_] = 0
            anIntArray2678!![i_12_] = 0
            aClass348_Sub49_2677.anInt7197 = anIntArray2679!![i_12_]
            method1485(i_12_)
            anIntArray2682!![i_12_] = aClass348_Sub49_2677.anInt7197
        }
    }

    fun method1485(i: Int) {
        val i_13_ = aClass348_Sub49_2677.method3366(98.toByte())
        this.anIntArray2681!![i] += i_13_
    }

    fun method1486(i: Int) {
        anIntArray2682!![i] = aClass348_Sub49_2677.anInt7197
    }

    fun method1487() {
        aClass348_Sub49_2677.aByteArray7154 = null
        anIntArray2679 = null
        anIntArray2682 = null
        this.anIntArray2681 = null
        anIntArray2678 = null
    }

    fun method1488(i: Int): Long {
        return aLong2680 + i.toLong() * anInt2684.toLong()
    }

    private fun method1489(i: Int): Int {
        var i_14_ = (aClass348_Sub49_2677.aByteArray7154!![aClass348_Sub49_2677.anInt7197]).toInt()
        if (i_14_ < 0) {
            i_14_ = i_14_ and 0xff
            anIntArray2678!![i] = i_14_
            aClass348_Sub49_2677.anInt7197++
        } else i_14_ = anIntArray2678!![i]
        if (i_14_ == 240 || i_14_ == 247) {
            val i_15_ = aClass348_Sub49_2677.method3366(40.toByte())
            if (i_14_ == 247 && i_15_ > 0) {
                val i_16_ = ((aClass348_Sub49_2677.aByteArray7154!![aClass348_Sub49_2677.anInt7197]).toInt() and 0xff)
                if (i_16_ >= 241 && i_16_ <= 243 || i_16_ == 246 || i_16_ == 248 || i_16_ >= 250 && i_16_ <= 252 || i_16_ == 254) {
                    aClass348_Sub49_2677.anInt7197++
                    anIntArray2678!![i] = i_16_
                    return method1481(i, i_16_)
                }
            }
            aClass348_Sub49_2677.anInt7197 += i_15_
            return 0
        }
        return method1481(i, i_14_)
    }

    fun method1490(): Int {
        val i = anIntArray2682!!.size
        var i_17_ = -1
        var i_18_ = 2147483647
        for (i_19_ in 0..<i) {
            if (anIntArray2682!![i_19_] >= 0 && this.anIntArray2681!![i_19_] < i_18_) {
                i_17_ = i_19_
                i_18_ = this.anIntArray2681!![i_19_]
            }
        }
        return i_17_
    }

    fun method1491(): Boolean {
        return aClass348_Sub49_2677.aByteArray7154 != null
    }

    fun method1492(i: Int) {
        aClass348_Sub49_2677.anInt7197 = anIntArray2682!![i]
    }

    fun method1494(i: Int): Int {
        val i_20_ = method1489(i)
        return i_20_
    }

    fun method1495() {
        aClass348_Sub49_2677.anInt7197 = -1
    }

    constructor() {
        aClass348_Sub49_2677 = Class348_Sub49(null)
    }

    internal constructor(`is`: ByteArray?) {
        aClass348_Sub49_2677 = Class348_Sub49(null)
        method1482(`is`)
    }

    companion object {
        private var aByteArray2676: ByteArray? = byteArrayOf(2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
        @JvmStatic
        fun method1493() {
            aByteArray2676 = null
        }
    }
}
