object IndexedSpriteStatics {
    @JvmField
            var anInt5194: Int = 0
            @JvmField
            var anInt5195: Int = 0
            @JvmField
            var aStringArray5197: Array<String?>? = arrayOfNulls<String>(100)
            @JvmField
            var anInt5198: Int = 0
            @JvmField
            var aServerConnectionInfo_5199: ServerConnectionInfo? = null
    
            @JvmStatic
            fun method162(i: Byte) {
                aStringArray5197 = null
                if (i >= -67) aServerConnectionInfo_5199 = null
                aServerConnectionInfo_5199 = null
            }
    
            @JvmStatic
            fun method163(i: Int): Int {
                anInt5198++
                if (i != 512) method165(122, 62, -125, 72, -74, 116, 43, 104.toByte(), 62, -115)
                return NpcConfigStatics.aResourceLoaderThread_897!!.method2325((-98).toByte())
            }
    
            @JvmStatic
            fun method164(i: Int, i_0_: Int, i_1_: Byte, i_2_: Int): Boolean {
                anInt5195++
                if (!TurbulenceTextureNodeStatics.aBoolean9307 || !SkeletalAnimFrameDataStatics.aBoolean351) return false
                if (NpcDefinitionStatics.anInt2946 < 100) return false
                val i_3_ = TextureCacheStatics.anIntArrayArrayArray4356!![i]!![i_0_]!![i_2_]
                if (i_3_ == -RandomAccessFileOnDiskStatics.anInt3049) return false
                if (RandomAccessFileOnDiskStatics.anInt3049 == i_3_) return true
                if (SoundCacheState.aTerrainTileArray4142 == NativeSpriteStatics.aTerrainTileArray5191) return false
                val i_4_ = i_0_ shl Tooltip.anInt4459
                val i_5_ = i_2_ shl Tooltip.anInt4459
                if (i_1_.toInt() != -97) method163(-4)
                if ((ScrollTexMaterialPassStatics.method2169(i_4_ - -1, i_4_ - (-ArchiveFileConditionWrapperStatics.anInt3465 - -1), 1 + i_5_, 1 + i_4_, -1 + (i_5_ - -ArchiveFileConditionWrapperStatics.anInt3465), NativeSpriteStatics.aTerrainTileArray5191!![i]!!.method3982((-86).toByte(), 1 + i_2_, i_0_), NativeSpriteStatics.aTerrainTileArray5191!![i]!!.method3982((-86).toByte(), 1 + i_2_, 1 + i_0_), NativeSpriteStatics.aTerrainTileArray5191!![i]!!.method3982((-86).toByte(), i_2_, i_0_), -1 + ArchiveFileConditionWrapperStatics.anInt3465 + i_5_, false)) && (ScrollTexMaterialPassStatics.method2169(
                        1 + i_4_,
                        ArchiveFileConditionWrapperStatics.anInt3465 + (i_4_ + -1),
                        i_5_ + 1,
                        ArchiveFileConditionWrapperStatics.anInt3465 + (i_4_ - 1),
                        i_5_ + ArchiveFileConditionWrapperStatics.anInt3465 - 1,
                        NativeSpriteStatics.aTerrainTileArray5191!![i]!!.method3982((-86).toByte(), i_2_ - -1, 1 + i_0_),
                        NativeSpriteStatics.aTerrainTileArray5191!![i]!!.method3982((-86).toByte(), i_2_, i_0_ + 1),
                        NativeSpriteStatics.aTerrainTileArray5191!![i]!!.method3982((-86).toByte(), i_2_, i_0_),
                        1 + i_5_,
                        false
                    ))
                ) {
                    TheoraVideoStreamStatics.anInt9039++
                    TextureCacheStatics.anIntArrayArrayArray4356!![i]!![i_0_]!![i_2_] = RandomAccessFileOnDiskStatics.anInt3049
                    return true
                }
                TextureCacheStatics.anIntArrayArrayArray4356!![i]!![i_0_]!![i_2_] = -RandomAccessFileOnDiskStatics.anInt3049
                return false
            }
    
            @JvmStatic
            fun method165(i: Int, i_6_: Int, i_7_: Int, i_8_: Int, i_9_: Int, i_10_: Int, i_11_: Int, i_12_: Byte, i_13_: Int, i_14_: Int) {
                anInt5194++
                if (i_9_ < 512 || i_11_ < 512 || (-2 + GlCubemapLightPassStatics.anInt7319) * 512 < i_9_ || (-2 + RangeThresholdTextureNodeStatics.anInt9109) * 512 < i_11_) {
                    RemoveRoofsOptionStateStatics.anIntArray6062!![1] = -1
                    RemoveRoofsOptionStateStatics.anIntArray6062!![0] = RemoveRoofsOptionStateStatics.anIntArray6062!![1]
                } else if (i_12_ >= 22) {
                    val i_15_ = CollisionMapAccessor.method2064(i_9_, i, 11219, i_11_) - i_7_
                    if (GrayscaleNoiseTextureStatics.aBoolean5300) LinkedNodeListIteratorStatics.method1010(false, true)
                    else {
                        SettingsCrcWriter.aAbstractCameraTransform_2123!!.method891(i_10_, 0, 0)
                        FacingDirectionNodeStatics.aRenderer6654!!.method3638(SettingsCrcWriter.aAbstractCameraTransform_2123)
                    }
                    if (!ParticleSystemRendererStatics.aBoolean3870) FacingDirectionNodeStatics.aRenderer6654!!.da(i_9_, i_15_, i_11_, RemoveRoofsOptionStateStatics.anIntArray6062)
                    else FacingDirectionNodeStatics.aRenderer6654!!.HA(i_9_, i_15_, i_11_, LocalPlayerState.anInt1906, RemoveRoofsOptionStateStatics.anIntArray6062)
                    if (GrayscaleNoiseTextureStatics.aBoolean5300) GlVertexBufferArbStatics.method2129(60.toByte())
                    else {
                        SettingsCrcWriter.aAbstractCameraTransform_2123!!.method891(-i_10_, 0, 0)
                        FacingDirectionNodeStatics.aRenderer6654!!.method3638(SettingsCrcWriter.aAbstractCameraTransform_2123)
                    }
                }
            }
}
