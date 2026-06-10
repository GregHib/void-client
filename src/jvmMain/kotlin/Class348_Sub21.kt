import kotlin.math.atan2
import kotlin.math.sqrt

/* Class348_Sub21 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class348_Sub21 internal constructor(i: Int) : Class348() {
    @JvmField
    var anInt6847: Int
    var aBoolean6848: Boolean = false
    var anInt6850: Int = 0
    @JvmField
    var anInt6851: Int = 0
    @JvmField
    var anInt6852: Int = 0
    var anInt6853: Int = 0
    var anInt6855: Int = 0

    init {
        this.anInt6847 = -1
        this.anInt6847 = i
    }

    companion object {
        var anInt6849: Int = 0
        var aString6854: String? = null
        var anInt6856: Int = 0

        @JvmStatic
        fun method2954(i: Byte) {
            anInt6856++
            if (za_Sub1.anInt9775 != -1 && Class292.anInt4803 != -1) {
                val i_0_ = ((Class117.anInt1780 * (Class331.anInt4133 + -Class195.anInt5019) shr 16) + Class195.anInt5019)
                Class117.anInt1780 += i_0_
                if (Class117.anInt1780 < 65535) {
                    Class347.aBoolean4284 = false
                    Class25.aBoolean368 = false
                } else {
                    Class347.aBoolean4284 = !Class25.aBoolean368
                    Class117.anInt1780 = 65535
                    Class25.aBoolean368 = true
                }
                val f = Class117.anInt1780.toFloat() / 65535.0f
                val fs = FloatArray(3)
                val i_1_ = 2 * Class213.anInt2798
                for (i_2_ in 0..2) {
                    val i_3_ = 3 * (Class348_Sub43.anIntArrayArrayArray7079!![za_Sub1.anInt9775]!![i_1_]!![i_2_])
                    val i_4_ = ((Class348_Sub43.anIntArrayArrayArray7079!![za_Sub1.anInt9775]!![1 + i_1_]!![i_2_]) * 3)
                    val i_5_ = 3 * ((Class348_Sub43.anIntArrayArrayArray7079!![za_Sub1.anInt9775]!![2 + i_1_]!![i_2_]) + ((Class348_Sub43.anIntArrayArrayArray7079!![za_Sub1.anInt9775]!![2 + i_1_]!![i_2_]) + -(Class348_Sub43.anIntArrayArrayArray7079!![za_Sub1.anInt9775]!![i_1_ - -3]!![i_2_])))
                    val i_6_ = (Class348_Sub43.anIntArrayArrayArray7079!![za_Sub1.anInt9775]!![i_1_]!![i_2_])
                    val i_7_ = i_4_ - i_3_
                    val i_8_ = -(2 * i_4_) + i_3_ - -i_5_
                    val i_9_ = -i_6_ + ((Class348_Sub43.anIntArrayArrayArray7079!![za_Sub1.anInt9775]!![i_1_ - -2]!![i_2_]) + i_4_) + -i_5_
                    fs[i_2_] = i_6_.toFloat() + f * (i_7_.toFloat() + f * (f * i_9_.toFloat() + i_8_.toFloat()))
                }
                Class286_Sub4.anInt6246 = fs[0].toInt() - 512 * za_Sub2.regionTileX
                Class305.anInt3855 = -1 * fs[1].toInt()
                Class59_Sub2_Sub2.anInt8685 = fs[2].toInt() + -(Class90.regionTileY * 512)
                val fs_10_ = FloatArray(3)
                val i_11_ = 2 * Class264.anInt3373
                val i_12_ = -88 % ((-64 - i) / 57)
                for (i_13_ in 0..2) {
                    val i_14_ = 3 * (Class348_Sub43.anIntArrayArrayArray7079!![Class292.anInt4803]!![i_11_]!![i_13_])
                    val i_15_ = 3 * (Class348_Sub43.anIntArrayArrayArray7079!![Class292.anInt4803]!![i_11_ + 1]!![i_13_])
                    val i_16_ = (((Class348_Sub43.anIntArrayArrayArray7079!![Class292.anInt4803]!![2 + i_11_]!![i_13_]) + (-(Class348_Sub43.anIntArrayArrayArray7079!![Class292.anInt4803]!![3 + i_11_]!![i_13_]) + (Class348_Sub43.anIntArrayArrayArray7079!![Class292.anInt4803]!![i_11_ - -2]!![i_13_]))) * 3)
                    val i_17_ = (Class348_Sub43.anIntArrayArrayArray7079!![Class292.anInt4803]!![i_11_]!![i_13_])
                    val i_18_ = -i_14_ + i_15_
                    val i_19_ = -(i_15_ * 2) + i_14_ + i_16_
                    val i_20_ = (-i_16_ + i_15_ + (-i_17_ + (Class348_Sub43.anIntArrayArrayArray7079!![Class292.anInt4803]!![2 + i_11_]!![i_13_])))
                    fs_10_[i_13_] = (f * (i_18_.toFloat() + f * (i_20_.toFloat() * f + i_19_.toFloat())) + i_17_.toFloat())
                }
                val f_21_ = -fs[0] + fs_10_[0]
                val f_22_ = -1.0f * (-fs[1] + fs_10_[1])
                val f_23_ = -fs[2] + fs_10_[2]
                val d = sqrt((f_21_ * f_21_ + f_23_ * f_23_).toDouble())
                Class348_Sub42_Sub19.anInt9701 = 0x3fff and (2607.5945876176133 * atan2(f_22_.toDouble(), d)).toInt()
                Class5.anInt4638 = 0x3fff and (2607.5945876176133 * -atan2(f_21_.toDouble(), f_23_.toDouble())).toInt()
                Class338.anInt4186 = ((Class348_Sub43.anIntArrayArrayArray7079!![za_Sub1.anInt9775]!![i_1_]!![3]) + (((-(Class348_Sub43.anIntArrayArrayArray7079!![za_Sub1.anInt9775]!![i_1_]!![3]) + (Class348_Sub43.anIntArrayArrayArray7079!![za_Sub1.anInt9775]!![2 + i_1_]!![3])) * Class117.anInt1780) shr 16))
            }
        }

        fun method2955(i: Int, i_24_: Int): Int {
            return i xor i_24_
        }

        @JvmStatic
        fun method2956(i: Byte) {
            aString6854 = null
            if (i.toInt() != 53) Companion.method2954((-100).toByte())
        }
    }
}
