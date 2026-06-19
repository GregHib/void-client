import CircleRasterizerStatics.method2253
import VorbisAudioDecoderStatics.method2788
import VorbisAudioDecoderStatics.method2789
import kotlin.math.min
import VorbisFloorDecoderStatics.aFloatArray2719
import VorbisFloorDecoderStatics.anIntArray2721
import VorbisFloorDecoderStatics.anIntArray2724
import VorbisFloorDecoderStatics.aBooleanArray2727
import VorbisFloorDecoderStatics.anIntArray2728

/* Class210 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class VorbisFloorDecoder internal constructor() {
    private val anIntArray2720: IntArray
    private val anInt2722: Int
    private val anIntArray2723: IntArray
    private val anIntArray2725: IntArray
    private val anIntArray2726: IntArray
    private val anIntArray2729: IntArray
    private val anIntArrayArray2730: Array<IntArray?>

    fun method1530(fs: FloatArray, i: Int) {
        val i_0_ = anIntArray2726.size
        val i_1_: Int = anIntArray2724!![anInt2722 - 1]
        aBooleanArray2727!![1] = true
        aBooleanArray2727!![0] = aBooleanArray2727!![1]
        for (i_2_ in 2..<i_0_) {
            val i_3_: Int = VorbisFloorDecoderStatics.method1537(anIntArray2721!!, i_2_)
            val i_4_: Int = VorbisFloorDecoderStatics.method1532(anIntArray2721!!, i_2_)
            val i_5_ = method1533(anIntArray2721!![i_3_], anIntArray2728!![i_3_], anIntArray2721!![i_4_], anIntArray2728!![i_4_], anIntArray2721!![i_2_])
            val i_6_: Int = anIntArray2728!![i_2_]
            val i_7_ = i_1_ - i_5_
            val i_8_ = i_5_
            val i_9_ = (min(i_7_, i_8_)) shl 1
            if (i_6_ == 0) {
                aBooleanArray2727!![i_2_] = false
                anIntArray2728!![i_2_] = i_5_
            } else {
                aBooleanArray2727!![i_4_] = true
                aBooleanArray2727!![i_3_] = aBooleanArray2727!![i_4_]
                aBooleanArray2727!![i_2_] = true
                if (i_6_ >= i_9_) anIntArray2728!![i_2_] = (if (i_7_ > i_8_) i_6_ - i_8_ + i_5_ else i_5_ - i_6_ + i_7_ - 1)
                else anIntArray2728!![i_2_] = (if ((i_6_ and 0x1) != 0) i_5_ - (i_6_ + 1) / 2 else i_5_ + i_6_ / 2)
            }
        }
        method1535(0, i_0_ - 1)
        var i_10_ = 0
        var i_11_: Int = anIntArray2728!![0] * anInt2722
        for (i_12_ in 1..<i_0_) {
            if (aBooleanArray2727!![i_12_]) {
                val i_13_: Int = anIntArray2721!![i_12_]
                val i_14_: Int = anIntArray2728!![i_12_] * anInt2722
                method1531(i_10_, i_11_, i_13_, i_14_, fs, i)
                if (i_13_ >= i) return
                i_10_ = i_13_
                i_11_ = i_14_
            }
        }
        val f: Float = aFloatArray2719!![i_11_]
        for (i_15_ in i_10_..<i) fs[i_15_] *= f
    }

    private fun method1531(i: Int, i_16_: Int, i_17_: Int, i_18_: Int, fs: FloatArray, i_19_: Int) {
        var i_17_ = i_17_
        val i_20_ = i_18_ - i_16_
        val i_21_ = i_17_ - i
        var i_22_ = if (i_20_ < 0) -i_20_ else i_20_
        val i_23_ = i_20_ / i_21_
        var i_24_ = i_16_
        var i_25_ = 0
        val i_26_ = if (i_20_ < 0) i_23_ - 1 else i_23_ + 1
        i_22_ = i_22_ - (if (i_23_ < 0) -i_23_ else i_23_) * i_21_
        fs[i] *= aFloatArray2719!![i_24_]
        if (i_17_ > i_19_) i_17_ = i_19_
        for (i_27_ in i + 1..<i_17_) {
            i_25_ += i_22_
            if (i_25_ >= i_21_) {
                i_25_ -= i_21_
                i_24_ += i_26_
            } else i_24_ += i_23_
            fs[i_27_] *= aFloatArray2719!![i_24_]
        }
    }

    private fun method1533(i: Int, i_33_: Int, i_34_: Int, i_35_: Int, i_36_: Int): Int {
        val i_37_ = i_35_ - i_33_
        val i_38_ = i_34_ - i
        val i_39_ = if (i_37_ < 0) -i_37_ else i_37_
        val i_40_ = i_39_ * (i_36_ - i)
        val i_41_ = i_40_ / i_38_
        if (i_37_ < 0) return i_33_ - i_41_
        return i_33_ + i_41_
    }

    fun method1534(): Boolean {
        val bool = method2788() != 0
        if (!bool) return false
        val i = anIntArray2726.size
        for (i_42_ in 0..<i) anIntArray2721!![i_42_] = anIntArray2726[i_42_]
        val i_43_: Int = anIntArray2724!![anInt2722 - 1]
        val i_44_ = method2253(i_43_ - 1, -17)
        anIntArray2728!![0] = method2789(i_44_)
        anIntArray2728!![1] = method2789(i_44_)
        var i_45_ = 2
        for (i_46_ in anIntArray2725.indices) {
            val i_47_ = anIntArray2725[i_46_]
            val i_48_ = anIntArray2720[i_47_]
            val i_49_ = anIntArray2729[i_47_]
            val i_50_ = (1 shl i_49_) - 1
            var i_51_ = 0
            if (i_49_ > 0) i_51_ = VorbisAudioDecoderStatics.aVorbisCodebookArray6718!![anIntArray2723[i_47_]]!!.method3581()
            for (i_52_ in 0..<i_48_) {
                val i_53_ = anIntArrayArray2730[i_47_]!![i_51_ and i_50_]
                i_51_ = i_51_ ushr i_49_
                anIntArray2728!![i_45_++] = (if (i_53_ >= 0) VorbisAudioDecoderStatics.aVorbisCodebookArray6718!![i_53_]!!.method3581() else 0)
            }
        }
        return true
    }

    private fun method1535(i: Int, i_54_: Int) {
        if (i < i_54_) {
            var i_55_ = i
            val i_56_: Int = anIntArray2721!![i_55_]
            val i_57_: Int = anIntArray2728!![i_55_]
            val bool: Boolean = aBooleanArray2727!![i_55_]
            for (i_58_ in i + 1..i_54_) {
                val i_59_: Int = anIntArray2721!![i_58_]
                if (i_59_ < i_56_) {
                    anIntArray2721!![i_55_] = i_59_
                    anIntArray2728!![i_55_] = anIntArray2728!![i_58_]
                    aBooleanArray2727!![i_55_] = aBooleanArray2727!![i_58_]
                    i_55_++
                    anIntArray2721!![i_58_] = anIntArray2721!![i_55_]
                    anIntArray2728!![i_58_] = anIntArray2728!![i_55_]
                    aBooleanArray2727!![i_58_] = aBooleanArray2727!![i_55_]
                }
            }
            anIntArray2721!![i_55_] = i_56_
            anIntArray2728!![i_55_] = i_57_
            aBooleanArray2727!![i_55_] = bool
            method1535(i, i_55_ - 1)
            method1535(i_55_ + 1, i_54_)
        }
    }

    init {
        val i = method2789(16)
        if (i != 1) throw RuntimeException()
        val i_65_ = method2789(5)
        var i_66_ = 0
        anIntArray2725 = IntArray(i_65_)
        for (i_67_ in 0..<i_65_) {
            val i_68_ = method2789(4)
            anIntArray2725[i_67_] = i_68_
            if (i_68_ >= i_66_) i_66_ = i_68_ + 1
        }
        anIntArray2720 = IntArray(i_66_)
        anIntArray2729 = IntArray(i_66_)
        anIntArray2723 = IntArray(i_66_)
        anIntArrayArray2730 = arrayOfNulls<IntArray>(i_66_)
        for (i_69_ in 0..<i_66_) {
            anIntArray2720[i_69_] = method2789(3) + 1
            anIntArray2729[i_69_] = method2789(2)
            var i_70_ = anIntArray2729[i_69_]
            if (i_70_ != 0) anIntArray2723[i_69_] = method2789(8)
            i_70_ = 1 shl i_70_
            val `is` = IntArray(i_70_)
            anIntArrayArray2730[i_69_] = `is`
            for (i_71_ in 0..<i_70_) `is`[i_71_] = method2789(8) - 1
        }
        anInt2722 = method2789(2) + 1
        val i_72_ = method2789(4)
        var i_73_ = 2
        for (i_74_ in 0..<i_65_) i_73_ += anIntArray2720[anIntArray2725[i_74_]]
        anIntArray2726 = IntArray(i_73_)
        anIntArray2726[0] = 0
        anIntArray2726[1] = 1 shl i_72_
        i_73_ = 2
        for (i_75_ in 0..<i_65_) {
            val i_76_ = anIntArray2725[i_75_]
            for (i_77_ in 0..<anIntArray2720[i_76_]) anIntArray2726[i_73_++] = method2789(i_72_)
        }
        if (anIntArray2721 == null || anIntArray2721!!.size < i_73_) {
            anIntArray2721 = IntArray(i_73_)
            anIntArray2728 = IntArray(i_73_)
            aBooleanArray2727 = BooleanArray(i_73_)
        }
    }
}
