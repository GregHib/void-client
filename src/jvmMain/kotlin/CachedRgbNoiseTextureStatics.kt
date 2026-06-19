import DisplayModeOptionStateStatics.method1827
import HslColorTableNodeStatics.method2770

object CachedRgbNoiseTextureStatics {
    @JvmField
            var aJs5Archive_8667: Js5Archive? = null
            @JvmField
            var anInt8668: Int = 0
            @JvmField
            var anInt8669: Int = 0
            @JvmField
            var aJs5Archive_8670: Js5Archive? = null
            @JvmField
            var anInt8671: Int = 0
            @JvmField
            var anInt8672: Int = 0
            @JvmField
            var anInt8673: Int = 0
            @JvmStatic
            fun method565(i: Int, i_0_: Int, modelDefinition: ModelDefinition?, `is`: IntArray?): ParticleGeometry {
                try {
                    anInt8673++
                    var is_1_: IntArray? = null
                    if (i != 255) aJs5Archive_8670 = null
                    var is_2_: IntArray? = null
                    var is_3_: IntArray? = null
                    var fs: Array<FloatArray?>? = null
                    if (modelDefinition!!.aByteArray1820 != null) {
                        val i_4_ = modelDefinition.anInt1818
                        val is_5_ = IntArray(i_4_)
                        val is_6_ = IntArray(i_4_)
                        val is_7_ = IntArray(i_4_)
                        val is_8_ = IntArray(i_4_)
                        val is_9_ = IntArray(i_4_)
                        val is_10_ = IntArray(i_4_)
                        for (i_11_ in 0..<i_4_) {
                            is_5_[i_11_] = 2147483647
                            is_6_[i_11_] = -2147483647
                            is_7_[i_11_] = 2147483647
                            is_8_[i_11_] = -2147483647
                            is_9_[i_11_] = 2147483647
                            is_10_[i_11_] = -2147483647
                        }
                        fs = arrayOfNulls<FloatArray>(i_4_)
                        is_3_ = IntArray(i_4_)
                        is_2_ = IntArray(i_4_)
                        for (i_12_ in 0..<i_0_) {
                            val i_13_ = `is`!![i_12_]
                            if (modelDefinition.aByteArray1820!![i_13_].toInt() != -1) {
                                val i_14_ = (modelDefinition.aByteArray1820!![i_13_].toInt() and 0xff)
                                for (i_15_ in 0..2) {
                                    val i_16_: Short
                                    if (i_15_ != 0) {
                                        if (i_15_ == 1) i_16_ = (modelDefinition.aShortArray1835!![i_13_])
                                        else i_16_ = (modelDefinition.aShortArray1855[i_13_])
                                    } else i_16_ = (modelDefinition.aShortArray1863[i_13_])
                                    val i_17_ = modelDefinition.anIntArray1841[i_16_.toInt()]
                                    val i_18_ = modelDefinition.anIntArray1847[i_16_.toInt()]
                                    val i_19_ = modelDefinition.anIntArray1852[i_16_.toInt()]
                                    if (i_17_ < is_5_[i_14_]) is_5_[i_14_] = i_17_
                                    if (is_6_[i_14_] < i_17_) is_6_[i_14_] = i_17_
                                    if (is_7_[i_14_] > i_18_) is_7_[i_14_] = i_18_
                                    if (i_18_ > is_8_[i_14_]) is_8_[i_14_] = i_18_
                                    if (i_19_ < is_9_[i_14_]) is_9_[i_14_] = i_19_
                                    if (i_19_ > is_10_[i_14_]) is_10_[i_14_] = i_19_
                                }
                            }
                        }
                        is_1_ = IntArray(i_4_)
                        var i_20_ = 0
                        while (i_4_ > i_20_) {
                            val i_21_ = modelDefinition.aByteArray1823[i_20_]
                            if (i_21_ > 0) {
                                is_1_[i_20_] = (is_6_[i_20_] + is_5_[i_20_]) / 2
                                is_2_[i_20_] = (is_8_[i_20_] + is_7_[i_20_]) / 2
                                is_3_[i_20_] = (is_9_[i_20_] + is_10_[i_20_]) / 2
                                val f: Float
                                val f_22_: Float
                                val f_23_: Float
                                if (i_21_.toInt() == 1) {
                                    val i_24_ = modelDefinition.anIntArray1859!![i_20_]
                                    if (i_24_ == 0) {
                                        f_22_ = 1.0f
                                        f_23_ = 1.0f
                                    } else if (i_24_ <= 0) {
                                        f_22_ = 1.0f
                                        f_23_ = -i_24_.toFloat() / 1024.0f
                                    } else {
                                        f_23_ = 1.0f
                                        f_22_ = i_24_.toFloat() / 1024.0f
                                    }
                                    f = 64.0f / (modelDefinition.anIntArray1816[i_20_]).toFloat()
                                } else if (i_21_.toInt() == 2) {
                                    f = 64.0f / (modelDefinition.anIntArray1816[i_20_]).toFloat()
                                    f_22_ = 64.0f / (modelDefinition.anIntArray1844[i_20_]).toFloat()
                                    f_23_ = 64.0f / (modelDefinition.anIntArray1859!![i_20_]).toFloat()
                                } else {
                                    f = (modelDefinition.anIntArray1816[i_20_]).toFloat() / 1024.0f
                                    f_22_ = (modelDefinition.anIntArray1844[i_20_]).toFloat() / 1024.0f
                                    f_23_ = (modelDefinition.anIntArray1859!![i_20_]).toFloat() / 1024.0f
                                }
                                fs[i_20_] = (SizeBoundedSoftCacheStatics.method1347(modelDefinition.aShortArray1825[i_20_].toInt(), modelDefinition.aShortArray1849[i_20_].toInt(), f_22_, f_23_, 126, f, modelDefinition.aShortArray1829[i_20_].toInt(), NpcSummaryDefinitionStatics.method1166(255, (modelDefinition.aByteArray1833[i_20_]).toInt())))
                            }
                            i_20_++
                        }
                    }
                    return ParticleGeometry(is_1_, is_2_, is_3_, fs)
                } catch (runtimeexception: RuntimeException) {
                    throw SoundBankPatchStatics.method2929(runtimeexception, ("dha.B(" + i + ',' + i_0_ + ',' + (if (modelDefinition != null) "{...}" else "null") + ',' + (if (`is` != null) "{...}" else "null") + ')'))
                }
            }
    
            @JvmStatic
            fun method566(bool: Boolean, bool_25_: Boolean, i: Byte) {
                anInt8671++
                val i_26_ = -94 / ((-67 - i) / 59)
                if (bool) {
                    ColourKeyTextureNodeStatics.anInt9346++
                    method1827(1415665776)
                }
                if (bool_25_) {
                    SpriteArchiveLoaderStatics.anInt383++
                    method2770(2)
                }
            }
    
            @JvmStatic
            fun method568(bool: Boolean) {
                aJs5Archive_8670 = null
                aJs5Archive_8667 = null
                if (bool != true) aJs5Archive_8670 = null
            }
}
