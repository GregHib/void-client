import java.awt.Frame

object SkeletalAnimFrameLoaderStatics {
    @JvmField
            var anInt462: Int = 0
            @JvmField
            var aLruByteCache_463: LruByteCache? = LruByteCache(8)
            @JvmField
            var anInt466: Int = 0
            @JvmField
            var anInt467: Int = 0
            @JvmField
            var anInt468: Int = 0
            @JvmField
            var anInt469: Int = 0
            @JvmField
            var anInt470: Int = 0
            @JvmField
            var anInt471: Int = 0
            @JvmField
            var anInt473: Int = 0
            @JvmField
            var aFrame476: Frame? = null
            @JvmField
            var anInt478: Int = 0
            @JvmField
            var anInt479: Int = 0
            @JvmField
            var anInt481: Int
            @JvmField
            var aLong482: Long = -1L
    
            @JvmStatic
            fun method345(i: Int, i_17_: Byte) {
                anInt469++
                if (SpriteDefinitionStatics.anInt7068 == 0) NodeDequeHolderStatics.aClass348_Sub16_Sub3_1564!!.method2861(0, i)
                else DirectionPathStatics.anInt1059 = i
                if (i_17_ > -26) method349(-111)
            }
    
            @JvmStatic
            fun method347(`is`: IntArray?, is_20_: IntArray?, i: Int, i_21_: Int, i_22_: Int) {
                do {
                    try {
                        anInt473++
                        if (i_21_ != -22222) aLruByteCache_463 = null
                        if (i >= i_22_) break
                        val i_23_ = (i - -i_22_) / 2
                        var i_24_ = i
                        val i_25_ = `is`!![i_23_]
                        `is`[i_23_] = `is`[i_22_]
                        `is`[i_22_] = i_25_
                        val i_26_ = is_20_!![i_23_]
                        is_20_[i_23_] = is_20_[i_22_]
                        is_20_[i_22_] = i_26_
                        val i_27_ = if (i_25_ == 2147483647) 0 else 1
                        for (i_28_ in i..<i_22_) {
                            if (`is`[i_28_] < (i_28_ and i_27_) + i_25_) {
                                val i_29_ = `is`[i_28_]
                                `is`[i_28_] = `is`[i_24_]
                                `is`[i_24_] = i_29_
                                val i_30_ = is_20_[i_28_]
                                is_20_[i_28_] = is_20_[i_24_]
                                is_20_[i_24_++] = i_30_
                            }
                        }
                        `is`[i_22_] = `is`[i_24_]
                        `is`[i_24_] = i_25_
                        is_20_[i_22_] = is_20_[i_24_]
                        is_20_[i_24_] = i_26_
                        method347(`is`, is_20_, i, -22222, -1 + i_24_)
                        method347(`is`, is_20_, i_24_ - -1, i_21_, i_22_)
                    } catch (runtimeexception: RuntimeException) {
                        throw SoundBankPatchStatics.method2929(runtimeexception, ("ic.K(" + (if (`is` != null) "{...}" else "null") + ',' + (if (is_20_ != null) "{...}" else "null") + ',' + i + ',' + i_21_ + ',' + i_22_ + ')'))
                    }
                    break
                } while (false)
            }
    
            @JvmStatic
            fun method349(i: Int) {
                anInt462++
                val i_32_ = ShaderStateStatics.anInt6513
                val `is` = ScrollTexMaterialPassStatics.anIntArray6290
                for (i_33_ in 0..<i_32_) {
                    val player = LoadingBarRendererStatics.aPlayerArray5058!![`is`!![i_33_]]
                    if (player != null) ImageFrameCacheStatics.method2556(false, player.method2436(60.toByte()), player)
                }
                if (i != 4740) method347(null, null, 79, -21, 64)
            }
    
            fun method350(i: Int, i_34_: Int, i_35_: Int, i_36_: Int, i_37_: Int) {
                anInt466++
                val class348_sub42_sub15 = NamedTimedNodeStatics.method2516(i_36_, 105.toByte(), 10)
                class348_sub42_sub15.method3246(-25490)
                class348_sub42_sub15.anInt9651 = i_34_
                val i_38_ = 112 % ((i_35_ - 76) / 44)
                class348_sub42_sub15.anInt9650 = i_37_
                class348_sub42_sub15.anInt9652 = i
            }
    
            @JvmStatic
            fun method351(i: Int) {
                aLruByteCache_463 = null
                val i_39_ = 90 / ((i - 19) / 43)
                aFrame476 = null
            }
    
            init {
                anInt481 = -1
            }
}
