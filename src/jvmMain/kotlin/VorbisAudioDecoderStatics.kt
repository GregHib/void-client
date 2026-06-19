import CircleRasterizerStatics.method2253
import kotlin.math.cos
import kotlin.math.pow
import kotlin.math.sin

object VorbisAudioDecoderStatics {
    var aFloatArray6700: FloatArray? = null
    var aVorbisCommentHeaderArray6704: Array<VorbisCommentHeader?>? = null
    var anIntArray6705: IntArray? = null
    var aFloatArray6707: FloatArray? = null
    var aFloatArray6708: FloatArray? = null
    var anIntArray6709: IntArray? = null
    var aBinaryBitReaderArray6710: Array<BinaryBitReader?>? = null
    var anInt6711 = 0
    var aFloatArray6712: FloatArray? = null
    var aBooleanArray6713: BooleanArray? = null
    var aByteArray6714: ByteArray? = null
    var aVorbisFloorDecoderArray6715: Array<VorbisFloorDecoder?>? = null

    @JvmField
    var aVorbisCodebookArray6718: Array<VorbisCodebook?>? = null
    var anIntArray6719: IntArray? = null
    var aFloatArray6720: FloatArray? = null
    var anInt6721 = 0
    var aFloatArray6722: FloatArray? = null
    var aBoolean6724 = false
    var anInt6725 = 0
    var aFloatArray6726: FloatArray? = null
    var anInt6729 = 0
    fun method2784(`is`: ByteArray?, i: Int) {
        aByteArray6714 = `is`
        anInt6729 = i
        anInt6711 = 0
    }

    @JvmStatic
    fun method2785() {
        aByteArray6714 = null
        aVorbisCodebookArray6718 = null
        aVorbisFloorDecoderArray6715 = null
        aBinaryBitReaderArray6710 = null
        aVorbisCommentHeaderArray6704 = null
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
            for (i_22_ in 0..<i_14_) is_20_[i_22_] = MapSceneCacheStatics.method818(i_21_, 0, i_22_)
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
        aVorbisCodebookArray6718 = arrayOfNulls<VorbisCodebook>(i)
        for (i_23_ in 0..<i) aVorbisCodebookArray6718!![i_23_] = VorbisCodebook()
        val i_24_: Int = method2789(6) + 1
        for (i_25_ in 0..<i_24_) method2789(16)
        val i_26_: Int = method2789(6) + 1
        aVorbisFloorDecoderArray6715 = arrayOfNulls<VorbisFloorDecoder>(i_26_)
        for (i_27_ in 0..<i_26_) aVorbisFloorDecoderArray6715!![i_27_] = VorbisFloorDecoder()
        val i_28_: Int = method2789(6) + 1
        aBinaryBitReaderArray6710 = arrayOfNulls<BinaryBitReader?>(i_28_)
        for (i_29_ in 0..<i_28_) aBinaryBitReaderArray6710!![i_29_] = BinaryBitReader()
        val i_30_: Int = method2789(6) + 1
        aVorbisCommentHeaderArray6704 = arrayOfNulls<VorbisCommentHeader?>(i_30_)
        for (i_31_ in 0..<i_30_) aVorbisCommentHeaderArray6704!![i_31_] = VorbisCommentHeader()
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

    private fun method2792(js5Archive: Js5Archive): Boolean {
        if (!aBoolean6724) {
            val `is` = js5Archive.method410(-1860, 0, 0)
            if (`is` == null) return false
            method2790(`is`)
        }
        return true
    }

    @JvmStatic
    fun method2793(js5Archive: Js5Archive, i: Int): VorbisAudioDecoder? {
        if (!method2792(js5Archive)) {
            js5Archive.method421(false, i)
            return null
        }
        val `is` = js5Archive.method415(73.toByte(), i)
        if (`is` == null) return null
        return VorbisAudioDecoder(`is`)
    }

    @JvmStatic
    fun method2795(js5Archive: Js5Archive, i: Int, i_115_: Int): VorbisAudioDecoder? {
        if (!method2792(js5Archive)) {
            js5Archive.method420(-10499, i, i_115_)
            return null
        }
        val `is` = js5Archive.method410(-1860, i, i_115_)
        if (`is` == null) return null
        return VorbisAudioDecoder(`is`)
    }
}
