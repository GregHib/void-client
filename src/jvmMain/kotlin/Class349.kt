import kotlin.math.cos
import kotlin.math.pow

/* Class349 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class349 {
    var anIntArray4299: IntArray = IntArray(2)
    private val anIntArrayArrayArray4300: Array<Array<IntArray?>?>
    private val anIntArrayArrayArray4302: Array<Array<IntArray?>?>
    private val anIntArray4304 = IntArray(2)
    fun method3446(class348_sub49: Class348_Sub49, class197: Class197) {
        val i = class348_sub49.readUnsignedByte(255)
        this.anIntArray4299[0] = i shr 4
        this.anIntArray4299[1] = i and 0xf
        if (i != 0) {
            anIntArray4304[0] = class348_sub49.readUnsignedShort(842397944)
            anIntArray4304[1] = class348_sub49.readUnsignedShort(842397944)
            val i_0_ = class348_sub49.readUnsignedByte(255)
            for (i_1_ in 0..1) {
                for (i_2_ in 0..<this.anIntArray4299[i_1_]) {
                    anIntArrayArrayArray4302[i_1_]!![0]!![i_2_] = class348_sub49.readUnsignedShort(842397944)
                    anIntArrayArrayArray4300[i_1_]!![0]!![i_2_] = class348_sub49.readUnsignedShort(842397944)
                }
            }
            for (i_3_ in 0..1) {
                for (i_4_ in 0..<this.anIntArray4299[i_3_]) {
                    if ((i_0_ and (1 shl i_3_ * 4 shl i_4_)) == 0) {
                        anIntArrayArrayArray4302[i_3_]!![1]!![i_4_] = anIntArrayArrayArray4302[i_3_]!![0]!![i_4_]
                        anIntArrayArrayArray4300[i_3_]!![1]!![i_4_] = anIntArrayArrayArray4300[i_3_]!![0]!![i_4_]
                    } else {
                        anIntArrayArrayArray4302[i_3_]!![1]!![i_4_] = class348_sub49.readUnsignedShort(842397944)
                        anIntArrayArrayArray4300[i_3_]!![1]!![i_4_] = class348_sub49.readUnsignedShort(842397944)
                    }
                }
            }
            if (i_0_ != 0 || anIntArray4304[1] != anIntArray4304[0]) class197.method1454(class348_sub49)
        } else {
            anIntArray4304[1] = 0
            anIntArray4304[0] = anIntArray4304[1]
        }
    }

    private fun method3447(i: Int, i_5_: Int, f: Float): Float {
        var f_6_ = (anIntArrayArrayArray4302[i]!![0]!![i_5_].toFloat() + f * (anIntArrayArrayArray4302[i]!![1]!![i_5_] - anIntArrayArrayArray4302[i]!![0]!![i_5_]).toFloat())
        f_6_ *= 1.2207031E-4f
        return method3448(f_6_)
    }

    private fun method3449(i: Int, i_8_: Int, f: Float): Float {
        var f_9_ = (anIntArrayArrayArray4300[i]!![0]!![i_8_].toFloat() + f * (anIntArrayArrayArray4300[i]!![1]!![i_8_] - anIntArrayArrayArray4300[i]!![0]!![i_8_]).toFloat())
        f_9_ *= 0.0015258789f
        return 1.0f - 10.0.pow((-f_9_ / 20.0f).toDouble()).toFloat()
    }

    fun method3451(i: Int, f: Float): Int {
        if (i == 0) {
            var f_10_ = (anIntArray4304[0].toFloat() + (anIntArray4304[1] - anIntArray4304[0]).toFloat() * f)
            f_10_ *= 0.0030517578f
            aFloat4305 = 0.1.pow((f_10_ / 20.0f).toDouble()).toFloat()
            anInt4303 = (aFloat4305 * 65536.0f).toInt()
        }
        if (this.anIntArray4299[i] == 0) return 0
        var f_11_ = method3449(i, 0, f)
        aFloatArrayArray4306!![i]!![0] = -2.0f * f_11_ * cos(method3447(i, 0, f).toDouble()).toFloat()
        aFloatArrayArray4306!![i]!![1] = f_11_ * f_11_
        for (i_12_ in 1..<this.anIntArray4299[i]) {
            f_11_ = method3449(i, i_12_, f)
            val f_13_ = (-2.0f * f_11_ * cos(method3447(i, i_12_, f).toDouble()).toFloat())
            val f_14_ = f_11_ * f_11_
            aFloatArrayArray4306!![i]!![i_12_ * 2 + 1] = aFloatArrayArray4306!![i]!![i_12_ * 2 - 1] * f_14_
            aFloatArrayArray4306!![i]!![i_12_ * 2] = (aFloatArrayArray4306!![i]!![i_12_ * 2 - 1] * f_13_ + aFloatArrayArray4306!![i]!![i_12_ * 2 - 2] * f_14_)
            for (i_15_ in i_12_ * 2 - 1 downTo 2) aFloatArrayArray4306!![i]!![i_15_] += (aFloatArrayArray4306!![i]!![i_15_ - 1] * f_13_ + aFloatArrayArray4306!![i]!![i_15_ - 2] * f_14_)
            aFloatArrayArray4306!![i]!![1] += aFloatArrayArray4306!![i]!![0] * f_13_ + f_14_
            aFloatArrayArray4306!![i]!![0] += f_13_
        }
        if (i == 0) {
            for (i_16_ in 0..<this.anIntArray4299[0] * 2) aFloatArrayArray4306!![0]!![i_16_] *= aFloat4305
        }
        for (i_17_ in 0..<this.anIntArray4299[i] * 2) anIntArrayArray4301!![i]!![i_17_] = (aFloatArrayArray4306!![i]!![i_17_] * 65536.0f).toInt()
        return this.anIntArray4299[i] * 2
    }

    init {
        anIntArrayArrayArray4302 = Array<Array<IntArray?>?>(2) { Array<IntArray?>(2) { IntArray(4) } }
        anIntArrayArrayArray4300 = Array<Array<IntArray?>?>(2) { Array<IntArray?>(2) { IntArray(4) } }
    }

    companion object {
        var anIntArrayArray4301: Array<IntArray?>? = Array<IntArray?>(2) { IntArray(8) }
        var anInt4303: Int = 0
        private var aFloat4305 = 0f
        private var aFloatArrayArray4306: Array<FloatArray?>? = Array<FloatArray?>(2) { FloatArray(8) }

        private fun method3448(f: Float): Float {
            val f_7_ = 32.703197f * 2.0.pow(f.toDouble()).toFloat()
            return f_7_ * 3.1415927f / 11025.0f
        }

        @JvmStatic
        fun method3450() {
            aFloatArrayArray4306 = null
            anIntArrayArray4301 = null
        }
    }
}
