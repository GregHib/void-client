import Class299.Companion.method2253
import Class348_Sub10.Companion.method2788
import Class348_Sub10.Companion.method2789
import kotlin.math.min

/* Class210 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class210 internal constructor() {
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
            val i_3_: Int = Companion.method1537(anIntArray2721!!, i_2_)
            val i_4_: Int = Companion.method1532(anIntArray2721!!, i_2_)
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
            if (i_49_ > 0) i_51_ = Class348_Sub10.aClass370Array6718!![anIntArray2723[i_47_]]!!.method3581()
            for (i_52_ in 0..<i_48_) {
                val i_53_ = anIntArrayArray2730[i_47_]!![i_51_ and i_50_]
                i_51_ = i_51_ ushr i_49_
                anIntArray2728!![i_45_++] = (if (i_53_ >= 0) Class348_Sub10.aClass370Array6718!![i_53_]!!.method3581() else 0)
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

    companion object {
        private var aFloatArray2719: FloatArray? = floatArrayOf(
            1.0649863E-7f,
            1.1341951E-7f,
            1.2079015E-7f,
            1.2863978E-7f,
            1.369995E-7f,
            1.459025E-7f,
            1.5538409E-7f,
            1.6548181E-7f,
            1.7623574E-7f,
            1.8768856E-7f,
            1.998856E-7f,
            2.128753E-7f,
            2.2670913E-7f,
            2.4144197E-7f,
            2.5713223E-7f,
            2.7384212E-7f,
            2.9163792E-7f,
            3.1059022E-7f,
            3.307741E-7f,
            3.5226967E-7f,
            3.7516213E-7f,
            3.995423E-7f,
            4.255068E-7f,
            4.5315863E-7f,
            4.8260745E-7f,
            5.1397E-7f,
            5.4737063E-7f,
            5.829419E-7f,
            6.208247E-7f,
            6.611694E-7f,
            7.041359E-7f,
            7.4989464E-7f,
            7.98627E-7f,
            8.505263E-7f,
            9.057983E-7f,
            9.646621E-7f,
            1.0273513E-6f,
            1.0941144E-6f,
            1.1652161E-6f,
            1.2409384E-6f,
            1.3215816E-6f,
            1.4074654E-6f,
            1.4989305E-6f,
            1.5963394E-6f,
            1.7000785E-6f,
            1.8105592E-6f,
            1.9282195E-6f,
            2.053526E-6f,
            2.1869757E-6f,
            2.3290977E-6f,
            2.4804558E-6f,
            2.6416496E-6f,
            2.813319E-6f,
            2.9961443E-6f,
            3.1908505E-6f,
            3.39821E-6f,
            3.619045E-6f,
            3.8542307E-6f,
            4.1047006E-6f,
            4.371447E-6f,
            4.6555283E-6f,
            4.958071E-6f,
            5.280274E-6f,
            5.623416E-6f,
            5.988857E-6f,
            6.3780467E-6f,
            6.7925284E-6f,
            7.2339453E-6f,
            7.704048E-6f,
            8.2047E-6f,
            8.737888E-6f,
            9.305725E-6f,
            9.910464E-6f,
            1.0554501E-5f,
            1.1240392E-5f,
            1.1970856E-5f,
            1.2748789E-5f,
            1.3577278E-5f,
            1.4459606E-5f,
            1.5399271E-5f,
            1.6400005E-5f,
            1.7465769E-5f,
            1.8600793E-5f,
            1.9809577E-5f,
            2.1096914E-5f,
            2.2467912E-5f,
            2.3928002E-5f,
            2.5482977E-5f,
            2.7139005E-5f,
            2.890265E-5f,
            3.078091E-5f,
            3.2781227E-5f,
            3.4911533E-5f,
            3.718028E-5f,
            3.9596467E-5f,
            4.2169668E-5f,
            4.491009E-5f,
            4.7828602E-5f,
            5.0936775E-5f,
            5.424693E-5f,
            5.7772202E-5f,
            6.152657E-5f,
            6.552491E-5f,
            6.9783084E-5f,
            7.4317984E-5f,
            7.914758E-5f,
            8.429104E-5f,
            8.976875E-5f,
            9.560242E-5f,
            1.0181521E-4f,
            1.0843174E-4f,
            1.1547824E-4f,
            1.2298267E-4f,
            1.3097477E-4f,
            1.3948625E-4f,
            1.4855085E-4f,
            1.5820454E-4f,
            1.6848555E-4f,
            1.7943469E-4f,
            1.9109536E-4f,
            2.0351382E-4f,
            2.167393E-4f,
            2.3082423E-4f,
            2.4582449E-4f,
            2.6179955E-4f,
            2.7881275E-4f,
            2.9693157E-4f,
            3.1622787E-4f,
            3.3677815E-4f,
            3.5866388E-4f,
            3.8197188E-4f,
            4.0679457E-4f,
            4.3323037E-4f,
            4.613841E-4f,
            4.913675E-4f,
            5.2329927E-4f,
            5.573062E-4f,
            5.935231E-4f,
            6.320936E-4f,
            6.731706E-4f,
            7.16917E-4f,
            7.635063E-4f,
            8.1312325E-4f,
            8.6596457E-4f,
            9.2223985E-4f,
            9.821722E-4f,
            0.0010459992f,
            0.0011139743f,
            0.0011863665f,
            0.0012634633f,
            0.0013455702f,
            0.0014330129f,
            0.0015261382f,
            0.0016253153f,
            0.0017309374f,
            0.0018434235f,
            0.0019632196f,
            0.0020908006f,
            0.0022266726f,
            0.0023713743f,
            0.0025254795f,
            0.0026895993f,
            0.0028643848f,
            0.0030505287f,
            0.003248769f,
            0.0034598925f,
            0.0036847359f,
            0.0039241905f,
            0.0041792067f,
            0.004450795f,
            0.004740033f,
            0.005048067f,
            0.0053761187f,
            0.005725489f,
            0.0060975635f,
            0.0064938175f,
            0.0069158226f,
            0.0073652514f,
            0.007843887f,
            0.008353627f,
            0.008896492f,
            0.009474637f,
            0.010090352f,
            0.01074608f,
            0.011444421f,
            0.012188144f,
            0.012980198f,
            0.013823725f,
            0.014722068f,
            0.015678791f,
            0.016697686f,
            0.017782796f,
            0.018938422f,
            0.020169148f,
            0.021479854f,
            0.022875736f,
            0.02436233f,
            0.025945531f,
            0.027631618f,
            0.029427277f,
            0.031339627f,
            0.03337625f,
            0.035545226f,
            0.037855156f,
            0.0403152f,
            0.042935107f,
            0.045725275f,
            0.048696756f,
            0.05186135f,
            0.05523159f,
            0.05882085f,
            0.062643364f,
            0.06671428f,
            0.07104975f,
            0.075666964f,
            0.08058423f,
            0.08582105f,
            0.09139818f,
            0.097337745f,
            0.1036633f,
            0.11039993f,
            0.11757434f,
            0.12521498f,
            0.13335215f,
            0.14201812f,
            0.15124726f,
            0.16107617f,
            0.1715438f,
            0.18269168f,
            0.19456401f,
            0.20720787f,
            0.22067343f,
            0.23501402f,
            0.25028655f,
            0.26655158f,
            0.28387362f,
            0.3023213f,
            0.32196787f,
            0.34289113f,
            0.36517414f,
            0.3889052f,
            0.41417846f,
            0.44109413f,
            0.4697589f,
            0.50028646f,
            0.53279793f,
            0.5674221f,
            0.6042964f,
            0.64356697f,
            0.6853896f,
            0.72993004f,
            0.777365f,
            0.8278826f,
            0.88168305f,
            0.9389798f,
            1.0f
        )
        private var anIntArray2721: IntArray? = null
        private var anIntArray2724: IntArray? = intArrayOf(256, 128, 86, 64)
        private var aBooleanArray2727: BooleanArray? = null
        private var anIntArray2728: IntArray? = null
        private fun method1532(`is`: IntArray, i: Int): Int {
            val i_28_ = `is`[i]
            var i_29_ = -1
            var i_30_ = 2147483647
            for (i_31_ in 0..<i) {
                val i_32_ = `is`[i_31_]
                if (i_32_ > i_28_ && i_32_ < i_30_) {
                    i_29_ = i_31_
                    i_30_ = i_32_
                }
            }
            return i_29_
        }

        @JvmStatic
        fun method1536() {
            anIntArray2724 = null
            aFloatArray2719 = null
            anIntArray2721 = null
            anIntArray2728 = null
            aBooleanArray2727 = null
        }

        private fun method1537(`is`: IntArray, i: Int): Int {
            val i_60_ = `is`[i]
            var i_61_ = -1
            var i_62_ = -2147483648
            for (i_63_ in 0..<i) {
                val i_64_ = `is`[i_63_]
                if (i_64_ < i_60_ && i_64_ > i_62_) {
                    i_61_ = i_63_
                    i_62_ = i_64_
                }
            }
            return i_61_
        }
    }
}
