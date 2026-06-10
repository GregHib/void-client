import Class299.Companion.method2253
import kotlin.math.cos
import kotlin.math.pow
import kotlin.math.sin

/* Class348_Sub10 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class348_Sub10 private constructor(`is`: ByteArray?) : Class348() {
    private var aFloatArray6701: FloatArray? = null
    private var anInt6702 = 0
    private var aByteArrayArray6703: Array<ByteArray?>? = null
    private var aBoolean6706 = false
    private var anInt6716 = 0
    private var anInt6717 = 0
    private var anInt6723 = 0
    private var anInt6727 = 0
    private var aBoolean6728 = false
    private var anInt6730 = 0
    private var aByteArray6731: ByteArray? = null
    private var anInt6732 = 0
    private var anInt6733 = 0

    private fun method2787(`is`: ByteArray?) {
        val class348_sub49 = Class348_Sub49(`is`)
        anInt6702 = class348_sub49.readInt((-126).toByte())
        anInt6716 = class348_sub49.readInt((-126).toByte())
        anInt6723 = class348_sub49.readInt((-126).toByte())
        anInt6717 = class348_sub49.readInt((-126).toByte())
        if (anInt6717 < 0) {
            anInt6717 = anInt6717.inv()
            aBoolean6728 = true
        }
        val i = class348_sub49.readInt((-126).toByte())
        aByteArrayArray6703 = arrayOfNulls<ByteArray>(i)
        for (i_3_ in 0..<i) {
            var i_4_ = 0
            var i_5_: Int
            do {
                i_5_ = class348_sub49.readUnsignedByte(255)
                i_4_ += i_5_
            } while (i_5_ >= 255)
            val is_6_ = ByteArray(i_4_)
            class348_sub49.method3389(2147483647, 0, i_4_, is_6_)
            aByteArrayArray6703!![i_3_] = is_6_
        }
    }

    fun method2791(`is`: IntArray?): Class348_Sub19_Sub1? {
        if (`is` != null && `is`[0] <= 0) return null
        if (aByteArray6731 == null) {
            anInt6730 = 0
            aFloatArray6701 = FloatArray(anInt6721)
            aByteArray6731 = ByteArray(anInt6716)
            anInt6733 = 0
            anInt6732 = 0
        }
        while ( /**/anInt6732 < aByteArrayArray6703!!.size) {
            if (`is` != null && `is`[0] <= 0) return null
            val fs = method2794(anInt6732)
            if (fs != null) {
                var i = anInt6733
                var i_34_ = fs.size
                if (i_34_ > anInt6716 - i) i_34_ = anInt6716 - i
                for (i_35_ in 0..<i_34_) {
                    var i_36_ = (128.0f + fs[i_35_] * 128.0f).toInt()
                    if ((i_36_ and 0xff.inv()) != 0) i_36_ = (i_36_.inv()) shr 31
                    aByteArray6731!![i++] = (i_36_ - 128).toByte()
                }
                if (`is` != null) `is`[0] -= i - anInt6733
                anInt6733 = i
            }
            anInt6732++
        }
        aFloatArray6701 = null
        val is_37_ = aByteArray6731
        aByteArray6731 = null
        return Class348_Sub19_Sub1(anInt6702, is_37_, anInt6723, anInt6717, aBoolean6728)
    }

    private fun method2794(i: Int): FloatArray? {
        method2784(aByteArrayArray6703!![i], 0)
        method2788()
        val i_38_: Int = method2789(method2253(anIntArray6709!!.size - 1, 123))
        val bool: Boolean = aBooleanArray6713!![i_38_]
        val i_39_: Int = if (bool) anInt6721 else anInt6725
        var bool_40_ = false
        var bool_41_ = false
        if (bool) {
            bool_40_ = method2788() != 0
            bool_41_ = method2788() != 0
        }
        val i_42_ = i_39_ shr 1
        val i_43_: Int
        val i_44_: Int
        val i_45_: Int
        if (bool && !bool_40_) {
            i_43_ = (i_39_ shr 2) - (anInt6725 shr 2)
            i_44_ = (i_39_ shr 2) + (anInt6725 shr 2)
            i_45_ = anInt6725 shr 1
        } else {
            i_43_ = 0
            i_44_ = i_42_
            i_45_ = i_39_ shr 1
        }
        val i_46_: Int
        val i_47_: Int
        val i_48_: Int
        if (bool && !bool_41_) {
            i_46_ = i_39_ - (i_39_ shr 2) - (anInt6725 shr 2)
            i_47_ = i_39_ - (i_39_ shr 2) + (anInt6725 shr 2)
            i_48_ = anInt6725 shr 1
        } else {
            i_46_ = i_42_
            i_47_ = i_39_
            i_48_ = i_39_ shr 1
        }
        val class276: Class276 = aClass276Array6704!![anIntArray6709!![i_38_]]!!
        val i_49_ = class276.anInt3557
        val i_50_ = class276.anIntArray3556!![i_49_]
        val bool_51_: Boolean = !aClass210Array6715!![i_50_]!!.method1534()
        val bool_52_ = bool_51_
        for (i_53_ in 0..<class276.anInt3555) {
            val class343: Class343 = (aClass343Array6710!![class276.anIntArray3554!![i_53_]])!!
            val fs: FloatArray = aFloatArray6707!!
            class343.method2688(fs, i_39_ shr 1, bool_52_)
        }
        if (!bool_51_) {
            val i_54_ = class276.anInt3557
            val i_55_ = class276.anIntArray3556!![i_54_]
            aClass210Array6715!![i_55_]!!.method1530(aFloatArray6707!!, i_39_ shr 1)
        }
        if (bool_51_) {
            for (i_56_ in (i_39_ shr 1)..<i_39_) aFloatArray6707!![i_56_] = 0.0f
        } else {
            val i_57_ = i_39_ shr 1
            val i_58_ = i_39_ shr 2
            val i_59_ = i_39_ shr 3
            val fs: FloatArray? = aFloatArray6707
            for (i_60_ in 0..<i_57_) fs!![i_60_] *= 0.5f
            for (i_61_ in i_57_..<i_39_) fs!![i_61_] = -fs[i_39_ - i_61_ - 1]
            val fs_62_: FloatArray = (if (bool) Class348_Sub10.Companion.aFloatArray6712 else Class348_Sub10.Companion.aFloatArray6722)!!
            val fs_63_: FloatArray = (if (bool) Class348_Sub10.Companion.aFloatArray6726 else Class348_Sub10.Companion.aFloatArray6720)!!
            val fs_64_: FloatArray = (if (bool) Class348_Sub10.Companion.aFloatArray6700 else Class348_Sub10.Companion.aFloatArray6708)!!
            val `is`: IntArray = (if (bool) Class348_Sub10.Companion.anIntArray6705 else Class348_Sub10.Companion.anIntArray6719)!!
            for (i_65_ in 0..<i_58_) {
                val f = fs!![4 * i_65_] - fs[i_39_ - 4 * i_65_ - 1]
                val f_66_ = fs[4 * i_65_ + 2] - fs[i_39_ - 4 * i_65_ - 3]
                val f_67_ = fs_62_[2 * i_65_]
                val f_68_ = fs_62_[2 * i_65_ + 1]
                fs[i_39_ - 4 * i_65_ - 1] = f * f_67_ - f_66_ * f_68_
                fs[i_39_ - 4 * i_65_ - 3] = f * f_68_ + f_66_ * f_67_
            }
            for (i_69_ in 0..<i_59_) {
                val f = fs!![i_57_ + 3 + 4 * i_69_]
                val f_70_ = fs[i_57_ + 1 + 4 * i_69_]
                val f_71_ = fs[4 * i_69_ + 3]
                val f_72_ = fs[4 * i_69_ + 1]
                fs[i_57_ + 3 + 4 * i_69_] = f + f_71_
                fs[i_57_ + 1 + 4 * i_69_] = f_70_ + f_72_
                val f_73_ = fs_62_[i_57_ - 4 - 4 * i_69_]
                val f_74_ = fs_62_[i_57_ - 3 - 4 * i_69_]
                fs[4 * i_69_ + 3] = (f - f_71_) * f_73_ - (f_70_ - f_72_) * f_74_
                fs[4 * i_69_ + 1] = (f_70_ - f_72_) * f_73_ + (f - f_71_) * f_74_
            }
            val i_75_ = method2253(i_39_ - 1, -52)
            for (i_76_ in 0..<i_75_ - 3) {
                val i_77_ = i_39_ shr i_76_ + 2
                val i_78_ = 8 shl i_76_
                for (i_79_ in 0..<(2 shl i_76_)) {
                    val i_80_ = i_39_ - i_77_ * 2 * i_79_
                    val i_81_ = i_39_ - i_77_ * (2 * i_79_ + 1)
                    for (i_82_ in 0..<(i_39_ shr i_76_ + 4)) {
                        val i_83_ = 4 * i_82_
                        val f = fs!![i_80_ - 1 - i_83_]
                        val f_84_ = fs[i_80_ - 3 - i_83_]
                        val f_85_ = fs[i_81_ - 1 - i_83_]
                        val f_86_ = fs[i_81_ - 3 - i_83_]
                        fs[i_80_ - 1 - i_83_] = f + f_85_
                        fs[i_80_ - 3 - i_83_] = f_84_ + f_86_
                        val f_87_ = fs_62_[i_82_ * i_78_]
                        val f_88_ = fs_62_[i_82_ * i_78_ + 1]
                        fs[i_81_ - 1 - i_83_] = (f - f_85_) * f_87_ - (f_84_ - f_86_) * f_88_
                        fs[i_81_ - 3 - i_83_] = (f_84_ - f_86_) * f_87_ + (f - f_85_) * f_88_
                    }
                }
            }
            for (i_89_ in 1..<i_59_ - 1) {
                val i_90_ = `is`[i_89_]
                if (i_89_ < i_90_) {
                    val i_91_ = 8 * i_89_
                    val i_92_ = 8 * i_90_
                    var f = fs!![i_91_ + 1]
                    fs[i_91_ + 1] = fs[i_92_ + 1]
                    fs[i_92_ + 1] = f
                    f = fs[i_91_ + 3]
                    fs[i_91_ + 3] = fs[i_92_ + 3]
                    fs[i_92_ + 3] = f
                    f = fs[i_91_ + 5]
                    fs[i_91_ + 5] = fs[i_92_ + 5]
                    fs[i_92_ + 5] = f
                    f = fs[i_91_ + 7]
                    fs[i_91_ + 7] = fs[i_92_ + 7]
                    fs[i_92_ + 7] = f
                }
            }
            for (i_93_ in 0..<i_57_) fs!![i_93_] = fs[2 * i_93_ + 1]
            for (i_94_ in 0..<i_59_) {
                fs!![i_39_ - 1 - 2 * i_94_] = fs[4 * i_94_]
                fs[i_39_ - 2 - 2 * i_94_] = fs[4 * i_94_ + 1]
                fs[i_39_ - i_58_ - 1 - 2 * i_94_] = fs[4 * i_94_ + 2]
                fs[i_39_ - i_58_ - 2 - 2 * i_94_] = fs[4 * i_94_ + 3]
            }
            for (i_95_ in 0..<i_59_) {
                val f = fs_64_[2 * i_95_]
                val f_96_ = fs_64_[2 * i_95_ + 1]
                val f_97_ = fs!![i_57_ + 2 * i_95_]
                val f_98_ = fs[i_57_ + 2 * i_95_ + 1]
                val f_99_ = fs[i_39_ - 2 - 2 * i_95_]
                val f_100_ = fs[i_39_ - 1 - 2 * i_95_]
                var f_101_ = f_96_ * (f_97_ - f_99_) + f * (f_98_ + f_100_)
                fs[i_57_ + 2 * i_95_] = (f_97_ + f_99_ + f_101_) * 0.5f
                fs[i_39_ - 2 - 2 * i_95_] = (f_97_ + f_99_ - f_101_) * 0.5f
                f_101_ = f_96_ * (f_98_ + f_100_) - f * (f_97_ - f_99_)
                fs[i_57_ + 2 * i_95_ + 1] = (f_98_ - f_100_ + f_101_) * 0.5f
                fs[i_39_ - 1 - 2 * i_95_] = (-f_98_ + f_100_ + f_101_) * 0.5f
            }
            for (i_102_ in 0..<i_58_) {
                fs!![i_102_] = (fs[2 * i_102_ + i_57_] * fs_63_[2 * i_102_] + fs[2 * i_102_ + 1 + i_57_] * fs_63_[2 * i_102_ + 1])
                fs[i_57_ - 1 - i_102_] = (fs[2 * i_102_ + i_57_] * fs_63_[2 * i_102_ + 1] - fs[2 * i_102_ + 1 + i_57_] * fs_63_[2 * i_102_])
            }
            for (i_103_ in 0..<i_58_) fs!![i_39_ - i_58_ + i_103_] = -fs[i_103_]
            for (i_104_ in 0..<i_58_) fs!![i_104_] = fs[i_58_ + i_104_]
            for (i_105_ in 0..<i_58_) fs!![i_58_ + i_105_] = -fs[i_58_ - i_105_ - 1]
            for (i_106_ in 0..<i_58_) fs!![i_57_ + i_106_] = fs[i_39_ - i_106_ - 1]
            for (i_107_ in i_43_..<i_44_) {
                val f = sin(((i_107_ - i_43_).toDouble() + 0.5) / i_45_.toDouble() * 0.5 * 3.141592653589793).toFloat()
                aFloatArray6707!![i_107_] *= sin(1.5707963267948966 * f.toDouble() * f.toDouble()).toFloat()
            }
            for (i_108_ in i_46_..<i_47_) {
                val f = sin((((i_108_ - i_46_).toDouble() + 0.5) / i_48_.toDouble() * 0.5 * 3.141592653589793) + 1.5707963267948966).toFloat()
                aFloatArray6707!![i_108_] *= sin(1.5707963267948966 * f.toDouble() * f.toDouble()).toFloat()
            }
        }
        var fs: FloatArray? = null
        if (anInt6730 > 0) {
            val i_109_ = anInt6730 + i_39_ shr 2
            fs = FloatArray(i_109_)
            if (!aBoolean6706) {
                for (i_110_ in 0..<anInt6727) {
                    val i_111_ = (anInt6730 shr 1) + i_110_
                    fs[i_110_] += aFloatArray6701!![i_111_]
                }
            }
            if (!bool_51_) {
                for (i_112_ in i_43_..<(i_39_ shr 1)) {
                    val i_113_ = fs.size - (i_39_ shr 1) + i_112_
                    fs[i_113_] += aFloatArray6707!![i_112_]
                }
            }
        }
        val fs_114_ = aFloatArray6701
        aFloatArray6701 = aFloatArray6707
        aFloatArray6707 = fs_114_
        anInt6730 = i_39_
        anInt6727 = i_47_ - (i_39_ shr 1)
        aBoolean6706 = bool_51_
        return fs
    }

    init {
        method2787(`is`)
    }

    companion object {
        private var aFloatArray6700: FloatArray? = null
        private var aClass276Array6704: Array<Class276?>? = null
        private var anIntArray6705: IntArray? = null
        private var aFloatArray6707: FloatArray? = null
        private var aFloatArray6708: FloatArray? = null
        private var anIntArray6709: IntArray? = null
        private var aClass343Array6710: Array<Class343?>? = null
        private var anInt6711 = 0
        private var aFloatArray6712: FloatArray? = null
        private var aBooleanArray6713: BooleanArray? = null
        private var aByteArray6714: ByteArray? = null
        private var aClass210Array6715: Array<Class210?>? = null
        @JvmField
        var aClass370Array6718: Array<Class370?>? = null
        private var anIntArray6719: IntArray? = null
        private var aFloatArray6720: FloatArray? = null
        private var anInt6721 = 0
        private var aFloatArray6722: FloatArray? = null
        private var aBoolean6724 = false
        private var anInt6725 = 0
        private var aFloatArray6726: FloatArray? = null
        private var anInt6729 = 0
        private fun method2784(`is`: ByteArray?, i: Int) {
            aByteArray6714 = `is`
            anInt6729 = i
            anInt6711 = 0
        }

        @JvmStatic
        fun method2785() {
            aByteArray6714 = null
            aClass370Array6718 = null
            aClass210Array6715 = null
            aClass343Array6710 = null
            aClass276Array6704 = null
            aBooleanArray6713 = null
            anIntArray6709 = null
            aFloatArray6707 = null
            aFloatArray6722 = null
            aFloatArray6720 = null
            aFloatArray6708 = null
            aFloatArray6712 = null
            aFloatArray6726 = null
            aFloatArray6700 = null
            anIntArray6719 = null
            anIntArray6705 = null
        }

        fun method2786(i: Int): Float {
            var i_0_ = i and 0x1fffff
            val i_1_ = i and 0x7fffffff.inv()
            val i_2_ = (i and 0x7fe00000) shr 21
            if (i_1_ != 0) i_0_ = -i_0_
            return (i_0_.toDouble() * 2.0.pow((i_2_ - 788).toDouble())).toFloat()
        }

        @JvmStatic
        fun method2788(): Int {
            val i: Int = aByteArray6714!![anInt6729].toInt() shr anInt6711 and 0x1
            anInt6711++
            anInt6729 += anInt6711 shr 3
            anInt6711 = anInt6711 and 0x7
            return i
        }

        @JvmStatic
        fun method2789(i: Int): Int {
            var i = i
            var i_7_ = 0
            var i_8_ = 0
            var i_9_: Int
            while ( /**/i >= 8 - anInt6711) {
                i_9_ = 8 - anInt6711
                val i_10_ = (1 shl i_9_) - 1
                i_7_ += (aByteArray6714!![anInt6729].toInt() shr anInt6711 and i_10_) shl i_8_
                anInt6711 = 0
                anInt6729++
                i_8_ += i_9_
                i -= i_9_
            }
            if (i > 0) {
                i_9_ = (1 shl i) - 1
                i_7_ += (aByteArray6714!![anInt6729].toInt() shr anInt6711 and i_9_) shl i_8_
                anInt6711 += i
            }
            return i_7_
        }

        private fun method2790(`is`: ByteArray?) {
            method2784(`is`, 0)
            anInt6725 = 1 shl method2789(4)
            anInt6721 = 1 shl method2789(4)
            aFloatArray6707 = FloatArray(anInt6721)
            for (i in 0..1) {
                val i_11_: Int = if (i != 0) anInt6721 else anInt6725
                val i_12_ = i_11_ shr 1
                val i_13_ = i_11_ shr 2
                val i_14_ = i_11_ shr 3
                val fs = FloatArray(i_12_)
                for (i_15_ in 0..<i_13_) {
                    fs[2 * i_15_] = cos((4 * i_15_).toDouble() * 3.141592653589793 / i_11_.toDouble()).toFloat()
                    fs[2 * i_15_ + 1] = -sin((4 * i_15_).toDouble() * 3.141592653589793 / i_11_.toDouble()).toFloat()
                }
                val fs_16_ = FloatArray(i_12_)
                for (i_17_ in 0..<i_13_) {
                    fs_16_[2 * i_17_] = cos((2 * i_17_ + 1).toDouble() * 3.141592653589793 / (2 * i_11_).toDouble()).toFloat()
                    fs_16_[2 * i_17_ + 1] = sin((2 * i_17_ + 1).toDouble() * 3.141592653589793 / (2 * i_11_).toDouble()).toFloat()
                }
                val fs_18_ = FloatArray(i_13_)
                for (i_19_ in 0..<i_14_) {
                    fs_18_[2 * i_19_] = cos((4 * i_19_ + 2).toDouble() * 3.141592653589793 / i_11_.toDouble()).toFloat()
                    fs_18_[2 * i_19_ + 1] = -sin((4 * i_19_ + 2).toDouble() * 3.141592653589793 / i_11_.toDouble()).toFloat()
                }
                val is_20_ = IntArray(i_14_)
                val i_21_ = method2253(i_14_ - 1, -53)
                for (i_22_ in 0..<i_14_) is_20_[i_22_] = Class84.method818(i_21_, 0, i_22_)
                if (i == 0) {
                    aFloatArray6722 = fs
                    aFloatArray6720 = fs_16_
                    aFloatArray6708 = fs_18_
                    anIntArray6719 = is_20_
                } else {
                    aFloatArray6712 = fs
                    aFloatArray6726 = fs_16_
                    aFloatArray6700 = fs_18_
                    anIntArray6705 = is_20_
                }
            }
            val i: Int = method2789(8) + 1
            aClass370Array6718 = arrayOfNulls<Class370>(i)
            for (i_23_ in 0..<i) aClass370Array6718!![i_23_] = Class370()
            val i_24_: Int = method2789(6) + 1
            for (i_25_ in 0..<i_24_) method2789(16)
            val i_26_: Int = method2789(6) + 1
            aClass210Array6715 = arrayOfNulls<Class210>(i_26_)
            for (i_27_ in 0..<i_26_) aClass210Array6715!![i_27_] = Class210()
            val i_28_: Int = method2789(6) + 1
            aClass343Array6710 = arrayOfNulls<Class343?>(i_28_)
            for (i_29_ in 0..<i_28_) aClass343Array6710!![i_29_] = Class343()
            val i_30_: Int = method2789(6) + 1
            aClass276Array6704 = arrayOfNulls<Class276?>(i_30_)
            for (i_31_ in 0..<i_30_) aClass276Array6704!![i_31_] = Class276()
            val i_32_: Int = method2789(6) + 1
            aBooleanArray6713 = BooleanArray(i_32_)
            anIntArray6709 = IntArray(i_32_)
            for (i_33_ in 0..<i_32_) {
                aBooleanArray6713!![i_33_] = method2788() != 0
                method2789(16)
                method2789(16)
                anIntArray6709!![i_33_] = method2789(8)
            }
            aBoolean6724 = true
        }

        private fun method2792(class45: Class45): Boolean {
            if (!aBoolean6724) {
                val `is` = class45.method410(-1860, 0, 0)
                if (`is` == null) return false
                method2790(`is`)
            }
            return true
        }

        @JvmStatic
        fun method2793(class45: Class45, i: Int): Class348_Sub10? {
            if (!method2792(class45)) {
                class45.method421(false, i)
                return null
            }
            val `is` = class45.method415(73.toByte(), i)
            if (`is` == null) return null
            return Class348_Sub10(`is`)
        }

        @JvmStatic
        fun method2795(class45: Class45, i: Int, i_115_: Int): Class348_Sub10? {
            if (!method2792(class45)) {
                class45.method420(-10499, i, i_115_)
                return null
            }
            val `is` = class45.method410(-1860, i, i_115_)
            if (`is` == null) return null
            return Class348_Sub10(`is`)
        }
    }
}
