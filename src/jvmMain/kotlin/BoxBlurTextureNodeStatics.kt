object BoxBlurTextureNodeStatics {
    @JvmField
            var anInt9457: Int = 0
            @JvmField
            var anIntArray9458: IntArray?
            @JvmField
            var anInt9459: Int = 0
            @JvmField
            var anInt9460: Int = 0
            @JvmField
            var anInt9461: Int = -1
            @JvmField
            var anInt9462: Int = 0
            @JvmField
            var anInt9464: Int = 0
            @JvmField
            var aLongArray9465: LongArray? = null
            @JvmField
            var aAbstractModelRendererArray9467: Array<AbstractModelRenderer?>? = null
    
            @JvmStatic
            fun method3146(i: Int, i_0_: Int, i_1_: Byte, i_2_: Int, i_3_: Int, i_4_: Int, `is`: ByteArray?, is_5_: ByteArray?, i_6_: Int) {
                var i_0_ = i_0_
                var i_4_ = i_4_
                var i_6_ = i_6_
                try {
                    anInt9464++
                    val i_7_ = -(i_0_ shr 2)
                    i_0_ = -(i_0_ and 0x3)
                    if (i_1_ >= -12) method3148(true)
                    for (i_8_ in -i_3_..-1) {
                        for (i_9_ in i_7_..-1) {
                            `is`!![i_4_] = (`is`[i_4_++] + -is_5_!![i_6_++]).toByte()
                            `is`[i_4_] = (`is`[i_4_++] + -is_5_[i_6_++]).toByte()
                            `is`[i_4_] = (`is`[i_4_++] + -is_5_[i_6_++]).toByte()
                            `is`[i_4_] = (`is`[i_4_++] + -is_5_[i_6_++]).toByte()
                        }
                        for (i_10_ in i_0_..-1) `is`!![i_4_] = (`is`[i_4_++] + -is_5_!![i_6_++]).toByte()
                        i_4_ += i
                        i_6_ += i_2_
                    }
                } catch (runtimeexception: RuntimeException) {
                    throw SoundBankPatchStatics.method2929(runtimeexception, ("fd.D(" + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ',' + (if (`is` != null) "{...}" else "null") + ',' + (if (is_5_ != null) "{...}" else "null") + ',' + i_6_ + ')'))
                }
            }
    
            @JvmStatic
            fun method3147(i: Byte) {
                if (i.toInt() != 27) method3146(-85, 87, 91.toByte(), 46, -77, 54, null, null, -117)
                MediaStreamClientStatics.anInt3203 = -1
                TerrainChunkBuilderStatics.anInt1548 = -1
                KeyboardLayoutCacheStatics.anInt3306 = 0
                anInt9459++
            }
    
            @JvmStatic
            fun method3148(bool: Boolean) {
                anIntArray9458 = null
                aLongArray9465 = null
                if (bool != true) method3146(79, -54, (-128).toByte(), -109, 85, -107, null, null, 58)
                aAbstractModelRendererArray9467 = null
            }
    
            init {
                anIntArray9458 = IntArray(1000)
            }
}
