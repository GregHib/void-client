import WorldMapAreaLabelStatics.method3570

object TerrainTileShapeStatics {
    @JvmField
            var aTerrainTileArray8801: Array<TerrainTile?>? = null
            @JvmField
            var anInt8802: Int = 0
            @JvmField
            var anInt8803: Int = 0
            @JvmField
            var anInt8804: Int = 0
            @JvmField
            var aBoolean8805: Boolean = false
            @JvmField
            var anInt8806: Int = 0
            @JvmField
            var aLruByteCache_8807: LruByteCache?
            @JvmField
            var anInt8808: Int = 0
            @JvmField
            var anInt8809: Int = 0
    
            @JvmStatic
            fun method2726(i: Int, i_7_: Int, i_8_: Int): Int {
                var i_7_ = i_7_
                var i_8_ = i_8_
                if (i_8_ > i_7_) {
                    val i_9_ = i_7_
                    i_7_ = i_8_
                    i_8_ = i_9_
                }
                if (i != -21806) method2727((-128).toByte(), null, null)
                anInt8804++
                var i_10_: Int
                while ( /**/i_8_ != 0) {
                    i_10_ = i_7_ % i_8_
                    i_7_ = i_8_
                    i_8_ = i_10_
                }
                return i_7_
            }
    
            @JvmStatic
            fun method2727(i: Byte, class237_sub1: WorldMapSceneSoftware?, `is`: Array<ByteArray?>?) {
                try {
                    anInt8802++
                    val is_11_ = intArrayOf(-1, 0, 0, 0, 0)
                    val i_12_ = 67 % ((i - 14) / 47)
                    val i_13_ = `is`!!.size
                    var i_14_ = 0
                    while (i_13_ > i_14_) {
                        val is_15_ = `is`[i_14_]
                        if (is_15_ != null) {
                            val class348_sub49 = ByteBuffer(is_15_)
                            val i_16_ = (NullOggStreamStatics.anIntArray9042!![i_14_] shr 8)
                            val i_17_ = 0xff and NullOggStreamStatics.anIntArray9042!![i_14_]
                            val i_18_ = -ArbVertexProgramStatics.regionTileX + i_16_ * 64
                            val i_19_ = -RegionMapDecoder.regionTileY + i_17_ * 64
                            method3570(false)
                            class237_sub1!!.method1681(class348_sub49, i_18_, TimedRecordAccessorStatics.aCollisionMapArray7108s, RegionMapDecoder.regionTileY, ArbVertexProgramStatics.regionTileX, i_19_, 110.toByte())
                            class237_sub1.method1691(i_19_, FacingDirectionNodeStatics.aRenderer6654, class348_sub49, is_11_, i_18_, (-126).toByte())
                            if (!class237_sub1.aBoolean3109 && i_16_ == RendererStatics.anInt4581 / 8 && (i_17_ == FileIoUtil.anInt4095 / 8) && is_11_[0] != -1) {
                                KeyboardLayoutCacheStatics.aParticleSystemRenderer_3304 = CircleHitboxStatics.aMapSceneCache_413!!.method823(is_11_[2], is_11_[3], is_11_[1], -66, (HoverActionEntryStatics.aSpriteStore_1813!!), is_11_[0])
                                MapSceneDefLoaderStatics.anInt2481 = is_11_[4]
                            }
                        }
                        i_14_++
                    }
                    for (i_20_ in 0..<i_13_) {
                        val i_21_ = ((NullOggStreamStatics.anIntArray9042!![i_20_] shr 8) * 64 - ArbVertexProgramStatics.regionTileX)
                        val i_22_ = (-RegionMapDecoder.regionTileY + ((0xff and NullOggStreamStatics.anIntArray9042!![i_20_]) * 64))
                        val is_23_ = `is`[i_20_]
                        if (is_23_ == null && FileIoUtil.anInt4095 < 800) {
                            method3570(false)
                            class237_sub1!!.method1688(i_22_, 64, 64, 125, i_21_)
                        }
                    }
                } catch (runtimeexception: RuntimeException) {
                    throw SoundBankPatchStatics.method2929(runtimeexception, ("bg.E(" + i + ',' + (if (class237_sub1 != null) "{...}" else "null") + ',' + (if (`is` != null) "{...}" else "null") + ')'))
                }
            }
    
            @JvmStatic
            fun method2728(i: Byte) {
                if (i.toInt() != 9) aLruByteCache_8807 = null
                aLruByteCache_8807 = null
                aTerrainTileArray8801 = null
            }
    
            init {
                aLruByteCache_8807 = LruByteCache(8)
            }
}
