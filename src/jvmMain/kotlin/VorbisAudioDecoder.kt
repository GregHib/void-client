import CircleRasterizerStatics.method2253
import kotlin.math.cos
import kotlin.math.pow
import kotlin.math.sin
import VorbisAudioDecoderStatics.method2784
import VorbisAudioDecoderStatics.method2788
import VorbisAudioDecoderStatics.method2789
import VorbisAudioDecoderStatics.aVorbisCommentHeaderArray6704
import VorbisAudioDecoderStatics.aFloatArray6707
import VorbisAudioDecoderStatics.anIntArray6709
import VorbisAudioDecoderStatics.aBinaryBitReaderArray6710
import VorbisAudioDecoderStatics.aBooleanArray6713
import VorbisAudioDecoderStatics.aVorbisFloorDecoderArray6715
import VorbisAudioDecoderStatics.anInt6721
import VorbisAudioDecoderStatics.anInt6725

/* Class348_Sub10 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class VorbisAudioDecoder internal constructor(`is`: ByteArray?) : LinkedListNode() {
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
        val class348_sub49 = ByteBuffer(`is`)
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

    fun method2791(`is`: IntArray?): PcmSampleData? {
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
        return PcmSampleData(anInt6702, is_37_, anInt6723, anInt6717, aBoolean6728)
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
        val vorbisCommentHeader: VorbisCommentHeader = aVorbisCommentHeaderArray6704!![anIntArray6709!![i_38_]]!!
        val i_49_ = vorbisCommentHeader.anInt3557
        val i_50_ = vorbisCommentHeader.anIntArray3556!![i_49_]
        val bool_51_: Boolean = !aVorbisFloorDecoderArray6715!![i_50_]!!.method1534()
        val bool_52_ = bool_51_
        for (i_53_ in 0..<vorbisCommentHeader.anInt3555) {
            val binaryBitReader: BinaryBitReader = (aBinaryBitReaderArray6710!![vorbisCommentHeader.anIntArray3554!![i_53_]])!!
            val fs: FloatArray = aFloatArray6707!!
            binaryBitReader.method2688(fs, i_39_ shr 1, bool_52_)
        }
        if (!bool_51_) {
            val i_54_ = vorbisCommentHeader.anInt3557
            val i_55_ = vorbisCommentHeader.anIntArray3556!![i_54_]
            aVorbisFloorDecoderArray6715!![i_55_]!!.method1530(aFloatArray6707!!, i_39_ shr 1)
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
            val fs_62_: FloatArray = (if (bool) VorbisAudioDecoderStatics.aFloatArray6712 else VorbisAudioDecoderStatics.aFloatArray6722)!!
            val fs_63_: FloatArray = (if (bool) VorbisAudioDecoderStatics.aFloatArray6726 else VorbisAudioDecoderStatics.aFloatArray6720)!!
            val fs_64_: FloatArray = (if (bool) VorbisAudioDecoderStatics.aFloatArray6700 else VorbisAudioDecoderStatics.aFloatArray6708)!!
            val `is`: IntArray = (if (bool) VorbisAudioDecoderStatics.anIntArray6705 else VorbisAudioDecoderStatics.anIntArray6719)!!
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
}
