import java.io.File
import java.util.*
import kotlin.math.atan2
import kotlin.math.pow
import NoiseTextureGeneratorStatics.anInt1070
import NoiseTextureGeneratorStatics.anInt1072
import NoiseTextureGeneratorStatics.anInt1073

/*
 * Class59
 */
abstract class NoiseTextureGenerator(i: Int, i_73_: Int, i_74_: Int, i_75_: Int, i_76_: Int) {
    private var aShortArray1069: ShortArray? = null
    @JvmField
    var anInt1071: Int = 4
    private var anInt1074 = 4
    private var anInt1078 = 4
    private var anInt1079 = 4
    private var anInt1081 = 0
    private val aShortArray1082: ShortArray
    private fun method539(i: Int) {
        anInt1070++
        val random = Random(anInt1081.toLong())
        for (i_0_ in 0..254) aShortArray1082[i_0_] = i_0_.toShort()
        for (i_1_ in 0..254) {
            val i_2_ = -i_1_ + 255
            val i_3_ = ModelDefinitionStatics.method1097(106.toByte(), i_2_, random)
            val i_4_ = aShortArray1082[i_3_]
            aShortArray1082[i_3_] = aShortArray1082[i_2_]
            aShortArray1082[256 + i_2_] = i_4_
            aShortArray1082[i_2_] = aShortArray1082[256 + i_2_]
        }
        if (i <= 6) this.anInt1071 = -11
    }

    private fun method540(i: Int) {
        aShortArray1069 = ShortArray(this.anInt1071)
        anInt1072++
        var i_5_ = i
        while (this.anInt1071 > i_5_) {
            aShortArray1069!![i_5_] = 2.0.pow(i_5_.toDouble()).toInt().toShort()
            i_5_++
        }
    }

    abstract fun method541(i: Int)

    fun method542(i: Int, i_6_: Int, i_7_: Int, i_8_: Int) {
        anInt1073++
        val `is` = IntArray(i_6_)
        val is_9_ = IntArray(i)
        for (i_10_ in 0..<i_6_) `is`[i_10_] = (i_10_ shl 12) / i_6_
        val is_11_ = IntArray(i_8_)
        var i_12_ = 0
        while (i > i_12_) {
            is_9_[i_12_] = (i_12_ shl 12) / i
            i_12_++
        }
        for (i_13_ in i_7_..<i_8_) is_11_[i_13_] = (i_13_ shl 12) / i_8_
        method543(true)
        var i_14_ = 0
        while (i_8_ > i_14_) {
            var i_15_ = 0
            while (i > i_15_) {
                var i_16_ = 0
                while (i_6_ > i_16_) {
                    var i_17_ = 0
                    while ((this.anInt1071 > i_17_)) {
                        val i_18_ = aShortArray1069!![i_17_].toInt() shl 12
                        var i_19_ = i_18_ * is_11_[i_14_] shr 12
                        val i_20_ = anInt1074 * i_18_ shr 12
                        val i_21_ = anInt1078 * i_18_ shr 12
                        var i_22_ = `is`[i_16_] * i_18_ shr 12
                        val i_23_ = i_18_ * anInt1079 shr 12
                        var i_24_ = i_18_ * is_9_[i_15_] shr 12
                        i_22_ *= anInt1079
                        i_24_ *= anInt1078
                        i_19_ *= anInt1074
                        var i_25_ = i_22_ shr 12
                        var i_26_ = i_25_ + 1
                        i_25_ = i_25_ and 0xff
                        var i_27_ = i_24_ shr 12
                        var i_28_ = 1 + i_27_
                        i_27_ = i_27_ and 0xff
                        var i_29_ = i_19_ shr 12
                        var i_30_ = i_29_ + 1
                        i_22_ = i_22_ and 0xfff
                        i_24_ = i_24_ and 0xfff
                        if (i_28_ >= i_21_) i_28_ = 0
                        else i_28_ = i_28_ and 0xff
                        if (i_26_ >= i_23_) i_26_ = 0
                        else i_26_ = i_26_ and 0xff
                        i_29_ = i_29_ and 0xff
                        if (i_20_ > i_30_) i_30_ = i_30_ and 0xff
                        else i_30_ = 0
                        i_19_ = i_19_ and 0xfff
                        val i_31_ = -4096 + i_24_
                        val i_32_ = aShortArray1082[i_30_].toInt()
                        val i_33_ = i_22_ + -4096
                        val i_34_ = LoadingScreenStateStatics.anIntArray2631!![i_19_]
                        val i_35_ = LoadingScreenStateStatics.anIntArray2631!![i_22_]
                        val i_36_ = LoadingScreenStateStatics.anIntArray2631!![i_24_]
                        val i_37_ = i_19_ + -4096
                        val i_38_ = aShortArray1082[i_29_].toInt()
                        val i_39_ = aShortArray1082[i_38_ + i_28_].toInt()
                        val i_40_ = aShortArray1082[i_32_ + i_27_].toInt()
                        val i_41_ = aShortArray1082[i_28_ - -i_32_].toInt()
                        val i_42_ = aShortArray1082[i_38_ + i_27_].toInt()
                        var i_43_ = HeightMapNoise.method2279(true, (aShortArray1082[i_25_ - -i_42_]).toInt(), i_19_, i_24_, i_22_)
                        var i_44_ = HeightMapNoise.method2279(true, (aShortArray1082[i_26_ + i_42_]).toInt(), i_19_, i_24_, i_33_)
                        var i_45_ = i_43_ - -((i_44_ - i_43_) * i_35_ shr 12)
                        i_43_ = HeightMapNoise.method2279(true, (aShortArray1082[i_39_ + i_25_]).toInt(), i_19_, i_31_, i_22_)
                        i_44_ = HeightMapNoise.method2279(true, (aShortArray1082[i_26_ + i_39_]).toInt(), i_19_, i_31_, i_33_)
                        var i_46_ = i_43_ + ((i_44_ + -i_43_) * i_35_ shr 12)
                        i_43_ = HeightMapNoise.method2279(true, (aShortArray1082[i_40_ + i_25_]).toInt(), i_37_, i_24_, i_22_)
                        val i_47_ = ((i_46_ + -i_45_) * i_36_ shr 12) + i_45_
                        i_44_ = HeightMapNoise.method2279(true, (aShortArray1082[i_40_ + i_26_]).toInt(), i_37_, i_24_, i_33_)
                        i_45_ = i_43_ + (i_35_ * (i_44_ - i_43_) shr 12)
                        i_43_ = HeightMapNoise.method2279(true, (aShortArray1082[i_25_ - -i_41_]).toInt(), i_37_, i_31_, i_22_)
                        i_44_ = HeightMapNoise.method2279(true, (aShortArray1082[i_26_ - -i_41_]).toInt(), i_37_, i_31_, i_33_)
                        i_46_ = (((-i_43_ + i_44_) * i_35_ shr 12) + i_43_)
                        val i_48_ = ((i_46_ - i_45_) * i_36_ shr 12) + i_45_
                        method546(i_47_ + ((-i_47_ + i_48_) * i_34_ shr 12), i_17_, i_7_ xor 0x1.inv())
                        i_17_++
                    }
                    method541(-1538606516)
                    i_16_++
                }
                i_15_++
            }
            i_14_++
        }
    }

    abstract fun method543(bool: Boolean)

    abstract fun method546(i: Int, i_50_: Int, i_51_: Int)

    init {
        aShortArray1082 = ShortArray(512)
        this.anInt1071 = i_73_
        anInt1078 = i_75_
        anInt1079 = i_74_
        anInt1081 = i
        anInt1074 = i_76_
        method540(0)
        method539(85)
    }
}
