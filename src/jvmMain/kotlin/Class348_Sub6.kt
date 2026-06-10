import java.io.File
import kotlin.math.pow

class Class348_Sub6 internal constructor(@JvmField var anInt6630: Int, @JvmField var anInt6636: Int) : Class348() {
    companion object {
        @JvmField
        var anIntArray6631: IntArray? = IntArray(13)

        @JvmField
        var anInt6632: Int = 0

        @JvmField
        var anInt6633: Int

        @JvmField
        var anInt6634: Int = -2
        var anIntArray6635: IntArray? = IntArray(4)

        @JvmField
        var anInt6637: Int = 2

        @JvmField
        var anInt6638: Int = 0

        @JvmField
        var anInt6639: Int = 0

        /*synthetic*/
        var aClass6640: Class<*>? = null

        @JvmStatic
        fun method2768(i: Int) {
            anIntArray6631 = null
            anIntArray6635 = null
            if (i != 3) anInt6634 = 101
        }

        @JvmStatic
        fun method2769(var_class: Class<*>?, i: Byte, string: String?): Boolean {
            try {
                anInt6639++
                val var_class_0_ = (Player.aHashtable10565!!.get(string) as? Class<*>?)
                if (var_class_0_ != null) {
                    return var_class_0_.getClassLoader() === var_class!!.getClassLoader()
                }
                val file = Class275.aHashtable3548!!.get(string) as? File?
                if (i.toInt() != 20) anInt6633 = -118
                if (file != null) {
                    try {
                        System.load(file.path)
                        if (aClass6640 == null) {
                            aClass6640 = Class90::class.java
                        }
                        Player.aHashtable10565!![string] = aClass6640
                        return true
                    } catch (throwable: Throwable) {
                        if (Loader.trace) {
                            throwable.printStackTrace()
                        }
                    }
                }
                return false
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, ("gba.C(" + (if (var_class != null) "{...}" else "null") + ',' + i + ',' + (if (string != null) "{...}" else "null") + ')'))
            }
        }

        @JvmStatic
        fun method2770(i: Int) {
            anInt6638++
            if (Class10.anIntArray179 == null) Class10.anIntArray179 = IntArray(65536)
            else return
            val d = 0.7 + (0.03 * Math.random() - 0.015)
            for (i_5_ in 0..65535) {
                val d_6_ = 0.0078125 + ((0xfebd and i_5_) shr 10).toDouble() / 64.0
                val d_7_ = ((0x384 and i_5_) shr 7).toDouble() / 8.0 + 0.0625
                val d_8_ = (i_5_ and 0x7f).toDouble() / 128.0
                var d_9_ = d_8_
                var d_10_ = d_8_
                var d_11_ = d_8_
                if (d_7_ != 0.0) {
                    val d_12_: Double
                    if (d_8_ < 0.5) d_12_ = d_8_ * (d_7_ + 1.0)
                    else d_12_ = -(d_8_ * d_7_) + (d_8_ + d_7_)
                    val d_13_ = 2.0 * d_8_ - d_12_
                    var d_14_ = 0.3333333333333333 + d_6_
                    if (d_14_ > 1.0) d_14_--
                    val d_15_ = d_6_
                    var d_16_ = -0.3333333333333333 + d_6_
                    if (d_16_ < 0.0) d_16_++
                    if (6.0 * d_14_ < 1.0) d_9_ = d_13_ + 6.0 * (-d_13_ + d_12_) * d_14_
                    else if (!(2.0 * d_14_ < 1.0)) {
                        if (!(3.0 * d_14_ < 2.0)) d_9_ = d_13_
                        else d_9_ = 6.0 * ((d_12_ - d_13_) * (-d_14_ + 0.6666666666666666)) + d_13_
                    } else d_9_ = d_12_
                    if (!(6.0 * d_15_ < 1.0)) {
                        if (!(2.0 * d_15_ < 1.0)) {
                            if (!(d_15_ * 3.0 < 2.0)) d_10_ = d_13_
                            else d_10_ = ((-d_15_ + 0.6666666666666666) * (d_12_ - d_13_) * 6.0) + d_13_
                        } else d_10_ = d_12_
                    } else d_10_ = d_13_ + d_15_ * (6.0 * (d_12_ - d_13_))
                    if (d_16_ * 6.0 < 1.0) d_11_ = d_13_ + (d_12_ - d_13_) * 6.0 * d_16_
                    else if (!(2.0 * d_16_ < 1.0)) {
                        if (3.0 * d_16_ < 2.0) d_11_ = d_13_ + ((-d_13_ + d_12_) * (0.6666666666666666 - d_16_) * 6.0)
                        else d_11_ = d_13_
                    } else d_11_ = d_12_
                }
                d_9_ = d_9_.pow(d)
                d_10_ = d_10_.pow(d)
                d_11_ = d_11_.pow(d)
                val i_17_ = (d_9_ * 256.0).toInt()
                val i_18_ = (d_10_ * 256.0).toInt()
                val i_19_ = (d_11_ * 256.0).toInt()
                val i_20_ = (i_18_ shl 8) + (i_17_ shl 16) - -i_19_
                Class10.anIntArray179!![i_5_] = i_20_
            }
            if (i != 2) anInt6634 = 92
        }

        init {
            anInt6633 = 0
        }
    }
}
