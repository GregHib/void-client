import CompositeRgbNoiseTextureStatics.method573
import kotlin.math.cos
import kotlin.math.sin
import kotlin.math.sqrt

object SizeBoundedSoftCacheStatics {
    var anInt2310: Int = 0
            var anInt2313: Int = 0
            var anInt2314: Int = 0
            @JvmField
            var aFontMetaRef_2315: FontMetaRef?
            var anInt2317: Int = 0
            var anInt2318: Int = 0
            var anInt2319: Int = 0
            var anInt2320: Int = 0
            var anInt2321: Int = 0
            var anInt2322: Int = 0
            var anInt2323: Int = 0
            var anInt2325: Int = 0
            @JvmField
            var aBooleanArray2326: BooleanArray? = BooleanArray(100)
            @JvmField
            var aRsaPacketDecoder_2327: RsaPacketDecoder? = null
            var anInt2328: Int = 0
            @JvmField
            var aBoolean2329: Boolean = false
            @JvmField
            var anIntArray2330: IntArray? = null
    
            @JvmStatic
            fun method1343(i: Int, widgetComponent: WidgetComponent?, i_1_: Int, i_2_: Int) {
                LongHashTableStatics.anInt451 = i
                WidgetActionEntryStatics.aWidgetComponent_6990 = widgetComponent
                SoundCacheState.anInt4141 = i_2_
                anInt2328++
                if (i_1_ != 1) method1349(119.toByte())
            }
    
            fun method1347(i: Int, i_6_: Int, f: Float, f_7_: Float, i_8_: Int, f_9_: Float, i_10_: Int, i_11_: Int): FloatArray {
                anInt2323++
                val fs = FloatArray(9)
                var fs_12_ = FloatArray(9)
                var f_13_ = cos((i_11_.toFloat() * 0.024543693f).toDouble()).toFloat()
                val i_14_ = -94 / ((i_8_ - 57) / 62)
                var f_15_ = sin((0.024543693f * i_11_.toFloat()).toDouble()).toFloat()
                fs[6] = -f_15_
                var f_16_ = -f_13_ + 1.0f
                fs[8] = f_13_
                fs[3] = 0.0f
                fs[1] = 0.0f
                fs[2] = f_15_
                fs[4] = 1.0f
                fs[5] = 0.0f
                fs[0] = f_13_
                fs[7] = 0.0f
                val fs_17_ = FloatArray(9)
                var f_18_ = 1.0f
                f_13_ = i_6_.toFloat() / 32767.0f
                var f_19_ = 0.0f
                f_16_ = -f_13_ + 1.0f
                f_15_ = -sqrt((1.0f - f_13_ * f_13_).toDouble()).toFloat()
                val f_20_ = sqrt((i_10_ * i_10_ + i * i).toDouble()).toFloat()
                if (f_20_ == 0.0f && f_13_ == 0.0f) fs_12_ = fs
                else {
                    if (f_20_ != 0.0f) {
                        f_18_ = -i.toFloat() / f_20_
                        f_19_ = i_10_.toFloat() / f_20_
                    }
                    fs_17_[5] = f_18_ * f_15_
                    fs_17_[2] = f_18_ * f_19_ * f_16_
                    fs_17_[8] = f_13_ + f_16_ * (f_19_ * f_19_)
                    fs_17_[4] = f_13_
                    fs_17_[0] = f_16_ * (f_18_ * f_18_) + f_13_
                    fs_17_[6] = f_16_ * (f_19_ * f_18_)
                    fs_17_[3] = f_15_ * -f_19_
                    fs_17_[1] = f_15_ * f_19_
                    fs_17_[7] = f_15_ * -f_18_
                    fs_12_[0] = fs_17_[0] * fs[0] + fs[1] * fs_17_[3] + fs_17_[6] * fs[2]
                    fs_12_[1] = fs_17_[7] * fs[2] + (fs[1] * fs_17_[4] + fs[0] * fs_17_[1])
                    fs_12_[2] = fs[1] * fs_17_[5] + fs[0] * fs_17_[2] + fs[2] * fs_17_[8]
                    fs_12_[3] = fs_17_[0] * fs[3] + fs[4] * fs_17_[3] + fs_17_[6] * fs[5]
                    fs_12_[4] = fs[5] * fs_17_[7] + (fs[3] * fs_17_[1] + fs[4] * fs_17_[4])
                    fs_12_[6] = fs_17_[0] * fs[6] + fs[7] * fs_17_[3] + fs_17_[6] * fs[8]
                    fs_12_[5] = fs[4] * fs_17_[5] + fs_17_[2] * fs[3] + fs[5] * fs_17_[8]
                    fs_12_[7] = fs_17_[1] * fs[6] + fs_17_[4] * fs[7] + fs[8] * fs_17_[7]
                    fs_12_[8] = fs_17_[5] * fs[7] + fs[6] * fs_17_[2] + fs[8] * fs_17_[8]
                }
                fs_12_[7] *= f
                fs_12_[4] *= f_9_
                fs_12_[3] *= f_9_
                fs_12_[5] *= f_9_
                fs_12_[2] *= f_7_
                fs_12_[8] *= f
                fs_12_[6] *= f
                fs_12_[1] *= f_7_
                fs_12_[0] *= f_7_
                return fs_12_
            }
    
            @JvmStatic
            fun method1349(i: Byte) {
                anIntArray2330 = null
                aRsaPacketDecoder_2327 = null
                aBooleanArray2326 = null
                aFontMetaRef_2315 = null
                if (i > -103) aBooleanArray2326 = null
            }
    
            init {
                aFontMetaRef_2315 = FontMetaRef(18, 3)
            }
}
