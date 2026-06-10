import Class348_Sub1_Sub1.Companion.method2726
import kotlin.math.ceil
import kotlin.math.cos
import kotlin.math.floor
import kotlin.math.sin

/* Class163 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class163 internal constructor(i: Int, i_27_: Int) {
    private var anInt2159 = 0
    private var anIntArrayArray2163: Array<IntArray>? = null
    private var anInt2164 = 0
    fun method1268(i: Int, `is`: ShortArray): ShortArray {
        var `is` = `is`
        anInt2171++
        val i_0_ = 14 % ((i - 48) / 33)
        if (anIntArrayArray2163 != null) {
            val i_1_ = 14 + (anInt2159.toLong() * `is`.size.toLong() / anInt2164.toLong()).toInt()
            val is_2_ = IntArray(i_1_)
            var i_3_ = 0
            var i_4_ = 0
            for (i_5_ in `is`.indices) {
                val i_6_ = `is`[i_5_].toInt()
                val is_7_ = anIntArrayArray2163!![i_4_]
                for (i_8_ in 0..13) is_2_[i_3_ + i_8_] += i_6_ * is_7_[i_8_] shr 2
                i_4_ += anInt2159
                val i_9_ = i_4_ / anInt2164
                i_4_ -= anInt2164 * i_9_
                i_3_ += i_9_
            }
            `is` = ShortArray(i_1_)
            for (i_10_ in 0..<i_1_) {
                val i_11_ = 8192 + is_2_[i_10_] shr 14
                if (i_11_ >= -32768) {
                    if (i_11_ > 32767) `is`[i_10_] = 32767.toShort()
                    else `is`[i_10_] = i_11_.toShort()
                } else `is`[i_10_] = (-32768).toShort()
            }
        }
        return `is`
    }

    fun method1270(i: Int, i_12_: Byte): Int {
        var i = i
        if (i_12_.toInt() != -85) return 59
        anInt2160++
        if (anIntArrayArray2163 != null) i = (i.toLong() * anInt2159.toLong() / anInt2164.toLong()).toInt()
        return i
    }

    fun method1272(`is`: ByteArray, i: Int): ByteArray {
        var `is` = `is`
        if (i != 1) method1276(71)
        anInt2167++
        if (anIntArrayArray2163 != null) {
            val i_13_ = ((anInt2159.toLong() * `is`.size.toLong() / anInt2164.toLong()).toInt() + 14)
            val is_14_ = IntArray(i_13_)
            var i_15_ = 0
            var i_16_ = 0
            for (i_17_ in `is`.indices) {
                val i_18_ = `is`[i_17_].toInt()
                val is_19_ = anIntArrayArray2163!![i_16_]
                for (i_20_ in 0..13) is_14_[i_15_ + i_20_] += i_18_ * is_19_[i_20_]
                i_16_ += anInt2159
                val i_21_ = i_16_ / anInt2164
                i_16_ -= anInt2164 * i_21_
                i_15_ += i_21_
            }
            `is` = ByteArray(i_13_)
            for (i_22_ in 0..<i_13_) {
                val i_23_ = is_14_[i_22_] - -32768 shr 16
                if (i_23_ >= -128) {
                    if (i_23_ > 127) `is`[i_22_] = 127.toByte()
                    else `is`[i_22_] = i_23_.toByte()
                } else `is`[i_22_] = (-128).toByte()
            }
        }
        return `is`
    }

    fun method1275(i: Int, i_25_: Int): Int {
        var i_25_ = i_25_
        val i_26_ = 26 % ((i - -29) / 32)
        anInt2170++
        if (anIntArrayArray2163 != null) i_25_ = ((i_25_.toLong() * anInt2159.toLong() / anInt2164.toLong()).toInt() + 6)
        return i_25_
    }

    init {
        var i = i
        var i_27_ = i_27_
        if (i != i_27_) {
            val i_28_ = method2726(-21806, i, i_27_)
            i /= i_28_
            i_27_ /= i_28_
            anIntArrayArray2163 = Array<IntArray>(i) { IntArray(14) }
            anInt2159 = i_27_
            anInt2164 = i
            for (i_29_ in 0..<i) {
                val `is` = anIntArrayArray2163!![i_29_]
                val d = i_29_.toDouble() / i.toDouble() + 6.0
                var i_30_ = floor(1.0 + (-7.0 + d)).toInt()
                if (i_30_ < 0) i_30_ = 0
                var i_31_ = ceil(d + 7.0).toInt()
                if (i_31_ > 14) i_31_ = 14
                val d_32_ = i_27_.toDouble() / i.toDouble()
                while ( /**/i_30_ < i_31_) {
                    val d_33_ = 3.141592653589793 * (-d + i_30_.toDouble())
                    var d_34_ = d_32_
                    if (d_33_ < -1.0E-4 || d_33_ > 1.0E-4) d_34_ *= sin(d_33_) / d_33_
                    d_34_ *= (cos(0.2243994752564138 * (i_30_.toDouble() - d)) * 0.46) + 0.54
                    `is`[i_30_] = floor(0.5 + d_34_ * 65536.0).toInt()
                    i_30_++
                }
            }
        }
    }

    companion object {
        var anInt2160: Int = 0
        var anInt2161: Int = 0
        @JvmField
        var aBooleanArray2162: BooleanArray? = null
        @JvmField
        var anIntArrayArray2165: Array<IntArray?>? = arrayOf<IntArray?>(intArrayOf(2, 4, 6, 0), intArrayOf(0, 2, 3, 5, 6, 4), intArrayOf(0, 1, 4, 5), intArrayOf(4, 6, 0, 2), intArrayOf(2, 4, 0), intArrayOf(0, 2, 4), intArrayOf(6, 0, 1, 2, 4, 5), intArrayOf(0, 1, 2, 4, 6, 7), intArrayOf(4, 7, 6, 0), intArrayOf(0, 8, 6, 1, 9, 2, 9, 4), intArrayOf(2, 9, 4, 0, 8, 6), intArrayOf(2, 11, 3, 7, 10, 10, 6, 6), intArrayOf(2, 4, 6, 0))
        var anInt2166: Int = 0
        var anInt2167: Int = 0
        var anInt2168: Int = 0
        var aClass17Array2169: Array<Class17?>? = arrayOfNulls<Class17>(14)
        var anInt2170: Int = 0
        var anInt2171: Int = 0

        @JvmStatic
        fun method1269(i: Int): Class348_Sub42_Sub14? {
            if (i != -17096) return null
            anInt2168++
            return Class75.aClass348_Sub42_Sub14_1243
        }

        fun method1271(i: Int) {
            anInt2166++
            synchronized(Class342.aClass60_4254!!) {
                Class342.aClass60_4254!!.method587(-86)
                if (i != 0) method1276(25)
            }
        }

        @JvmStatic
        fun method1273(`is`: IntArray, bool: Boolean): String {
            anInt2161++
            val stringbuffer = StringBuffer()
            var i = Class239_Sub1.anInt5850
            var i_24_ = 0
            while (`is`.size > i_24_) {
                val class321 = Class348_Sub23_Sub2.aClass187_9036!!.method1408(-12637, `is`[i_24_])
                if (class321.anInt4000 != -1) {
                    var class105 = (Class34.aClass60_463!!.method583(class321.anInt4000.toLong(), -74) as? Class105?)
                    if (class105 == null) {
                        val class207 = Class207.method1521(Class21.aClass45_322!!, class321.anInt4000, 0)
                        if (class207 != null) {
                            class105 = Class348_Sub8.aHa6654!!.method3691(class207, true)
                            Class34.aClass60_463!!.method582(class105, class321.anInt4000.toLong(), (-127).toByte())
                        }
                    }
                    if (class105 != null) {
                        Class341.aClass105Array4234!![i] = class105
                        stringbuffer.append(" <img=").append(i).append(">")
                        i++
                    }
                }
                i_24_++
            }
            if (bool != true) aBooleanArray2162 = null
            return stringbuffer.toString()
        }

        @JvmStatic
        fun method1274(class76: Class76?) {
            Class71.aClass76_1208 = class76
        }

        @JvmStatic
        fun method1276(i: Int) {
            val i_35_ = 101 % ((i - -20) / 49)
            aClass17Array2169 = null
            anIntArrayArray2165 = null
            aBooleanArray2162 = null
        }
    }
}
