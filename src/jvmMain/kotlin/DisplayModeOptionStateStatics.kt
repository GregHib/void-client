import GameAppletFrameStatics.method86
import kotlin.math.pow

object DisplayModeOptionStateStatics {
    @JvmField
            var anInt6099: Int = 0
            @JvmField
            var anInt6100: Int = 0
            @JvmField
            var anInt6101: Int = 0
            @JvmField
            var anInt6102: Int = 0
            @JvmField
            var aClass318_Sub9_Sub2_Sub1Array6103: Array<ProjectileNode?>? = null
            @JvmField
            var anInt6104: Int = 0
            @JvmField
            var anInt6105: Int = 0
            @JvmField
            var anInt6106: Int = 0
            @JvmField
            var anInt6107: Int = 0
            @JvmField
            var anInt6108: Int = 0
            @JvmField
            var anInt6109: Int = 0
            @JvmField
            var anInt6111: Int = 0
            @JvmField
            var anInt6112: Int = 0
            @JvmStatic
            fun method1825(i: Int, i_3_: Int, i_4_: Int) {
                anInt6102++
                val class348_sub42_sub15 = NamedTimedNodeStatics.method2516(0, 105.toByte(), 15)
                class348_sub42_sub15.method3246(-25490)
                class348_sub42_sub15.anInt9652 = i_4_
                class348_sub42_sub15.anInt9651 = i_3_
                if (i < 57) method1828(5)
            }
    
            @JvmStatic
            fun method1827(i: Int) {
                anInt6112++
                if (Crc64HashableStatics.anIntArray4983 == null) Crc64HashableStatics.anIntArray4983 = IntArray(65536)
                else return
                val d = 0.7 + (0.03 * Math.random() - 0.015)
                var i_5_ = 0
                if (i == 1415665776) {
                    for (i_6_ in 0..511) {
                        val f = (((i_6_ shr 3).toFloat() / 64.0f + 0.0078125f) * 360.0f)
                        val f_7_ = (i_6_ and 0x7).toFloat() / 8.0f + 0.0625f
                        for (i_8_ in 0..127) {
                            val f_9_ = i_8_.toFloat() / 128.0f
                            var f_10_ = 0.0f
                            var f_11_ = 0.0f
                            var f_12_ = 0.0f
                            val f_13_ = f / 60.0f
                            val i_14_ = f_13_.toInt()
                            val i_15_ = i_14_ % 6
                            val f_16_ = -i_14_.toFloat() + f_13_
                            val f_17_ = f_9_ * (-f_7_ + 1.0f)
                            val f_18_ = f_9_ * (1.0f - f_16_ * f_7_)
                            val f_19_ = (1.0f - (1.0f - f_16_) * f_7_) * f_9_
                            if (i_15_ == 0) {
                                f_10_ = f_9_
                                f_11_ = f_19_
                                f_12_ = f_17_
                            } else if (i_15_ == 1) {
                                f_11_ = f_9_
                                f_10_ = f_18_
                                f_12_ = f_17_
                            } else if (i_15_ == 2) {
                                f_12_ = f_19_
                                f_10_ = f_17_
                                f_11_ = f_9_
                            } else if (i_15_ == 3) {
                                f_12_ = f_9_
                                f_11_ = f_18_
                                f_10_ = f_17_
                            } else if (i_15_ == 4) {
                                f_12_ = f_9_
                                f_11_ = f_17_
                                f_10_ = f_19_
                            } else if (i_15_ == 5) {
                                f_10_ = f_9_
                                f_11_ = f_17_
                                f_12_ = f_18_
                            }
                            f_10_ = f_10_.toDouble().pow(d).toFloat()
                            f_11_ = f_11_.toDouble().pow(d).toFloat()
                            f_12_ = f_12_.toDouble().pow(d).toFloat()
                            val i_20_ = (f_10_ * 256.0f).toInt()
                            val i_21_ = (256.0f * f_11_).toInt()
                            val i_22_ = (256.0f * f_12_).toInt()
                            val i_23_ = ((i_21_ shl 8) + ((i_20_ shl 16) + (-16777216 + i_22_)))
                            Crc64HashableStatics.anIntArray4983!![i_5_++] = i_23_
                        }
                    }
                }
            }
    
            @JvmStatic
            fun method1828(i: Int) {
                if (i < 20) method1832(47)
                anInt6104++
                synchronized(WidgetRedrawRegionStatics.aLruByteCache_4254!!) {
                    WidgetRedrawRegionStatics.aLruByteCache_4254!!.method590(0)
                }
            }
    
            @JvmStatic
            fun method1832(i: Int) {
                if (i != 1) method1828(33)
                aClass318_Sub9_Sub2_Sub1Array6103 = null
            }
}
