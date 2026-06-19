import java.util.*
import java.util.Hashtable
import kotlin.math.atan2

object PlayerStatics {
    @JvmField
            var anInt10518: Int = 0
            @JvmField
            var anInt10523: Int = 0
            @JvmField
            var anInt10525: Int = 0
            @JvmField
            var anInt10527: Int = 0
            @JvmField
            var anInt10528: Int = 0
            @JvmField
            var anInt10529: Int = 0
            @JvmField
            var anInt10530: Int = 0
            @JvmField
            var anInt10532: Int = 0
            @JvmField
            var anInt10533: Int = 0
            @JvmField
            var anInt10534: Int = 0
            @JvmField
            var anInt10541: Int = 0
            @JvmField
            var anInt10543: Int = 0
            @JvmField
            var anInt10545: Int = 0
            @JvmField
            var anInt10546: Int = 0
            @JvmField
            var anInt10547: Int = 0
            @JvmField
            var anInt10548: Int = 0
            @JvmField
            var anInt10550: Int = 0
            @JvmField
            var anInt10555: Int = 0
            @JvmField
            var anInt10559: Int = 0
            @JvmField
            var anInt10562: Int = 0
            @JvmField
            var anInt10563: Int = 0
            @JvmField
            var aHashtable10565: Hashtable<Any?, Any?>? = Hashtable<Any?, Any?>()
            @JvmField
            var anIntArray10566: IntArray? = null
            @JvmField
            var anInt10567: Int = -1
    
            @JvmStatic
            fun method2458(bool: Boolean) {
                anIntArray10566 = null
                if (bool != true) method2458(false)
                aHashtable10565 = null
            }
    
            @JvmStatic
            fun method2460(f: Float, i: Int, f_100_: Float, i_101_: Int, i_102_: Int, f_103_: Float, textureGenerator: TextureGenerator?, i_104_: Int, i_105_: Byte, i_106_: Int, f_107_: Float, `is`: ByteArray?, i_108_: Int, f_109_: Float) {
                var f = f
                var f_100_ = f_100_
                var f_107_ = f_107_
                var f_109_ = f_109_
                do {
                    try {
                        anInt10559++
                        val i_110_ = i_102_ * i_106_
                        val fs = FloatArray(i_110_)
                        var i_111_ = 0
                        while (i_101_ > i_111_) {
                            var i_112_ = i
                            textureGenerator!!.method1398(i_108_, i_102_, f_100_ / i_106_.toFloat(), f_109_ / i_108_.toFloat(), 0, f * 127.0f, 1, f_107_ / i_102_.toFloat(), i_106_, i_104_, fs)
                            f_107_ *= 2.0f
                            f_100_ *= 2.0f
                            var i_113_ = 0
                            while (i_110_ > i_113_) {
                                `is`!![i_112_] = (`is`[i_112_] + fs[i_113_]).toInt().toByte()
                                i_112_++
                                i_113_++
                            }
                            f_109_ *= 2.0f
                            f *= f_103_
                            i_111_++
                        }
                        var i_114_ = i
                        for (i_115_ in 0..<i_110_) {
                            `is`!![i_114_] = (127 + `is`[i_114_]).toByte()
                            i_114_++
                        }
                        if (i_105_.toInt() == 30) break
                        aHashtable10565 = null
                    } catch (runtimeexception: RuntimeException) {
                        throw SoundBankPatchStatics.method2929(runtimeexception, ("ke.LB(" + f + ',' + i + ',' + f_100_ + ',' + i_101_ + ',' + i_102_ + ',' + f_103_ + ',' + (if (textureGenerator != null) "{...}" else "null") + ',' + i_104_ + ',' + i_105_ + ',' + i_106_ + ',' + f_107_ + ',' + (if (`is` != null) "{...}" else "null") + ',' + i_108_ + ',' + f_109_ + ')'))
                    }
                    break
                } while (false)
            }
}
