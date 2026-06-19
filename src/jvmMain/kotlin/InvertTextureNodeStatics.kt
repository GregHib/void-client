import MouseInputTrackerStatics.method3607

object InvertTextureNodeStatics {
    @JvmField
            var anInt9414: Int = 0
            @JvmField
            var aBoundsConstraintEntry_9415: BoundsConstraintEntry? = BoundsConstraintEntry("", 12)
            @JvmField
            var anInt9416: Int = 0
            @JvmField
            var anInt9417: Int = 0
            @JvmField
            var anInt9418: Int = 0
            @JvmField
            var anInt9419: Int = 0
            @JvmField
            var anInt9420: Int = 0
            private var aShortArray9421: ShortArray? = shortArrayOf(-10304, 9104, 25485, 4620, 4540)
            private var aShortArray9422: ShortArray? = shortArrayOf(-1, -1, -1, -1, -1)
            private var aShortArray9423: ShortArray? = shortArrayOf(6798, 8741, 25238, 4626, 4550)
            @JvmField
            var aShortArrayArray9424: Array<ShortArray?>? = arrayOf<ShortArray?>(aShortArray9423, aShortArray9421, aShortArray9422)
    
            @JvmStatic
            fun method3132(`is`: IntArray?, i: Int, i_0_: Int, i_1_: Int, i_2_: Int, var_ha_Sub2: OpenGlRenderer?, bool: Boolean, i_3_: Byte): GlTexture2DRegion {
                try {
                    if (i_3_.toInt() != 12) method3134(9)
                    anInt9418++
                    if (!var_ha_Sub2!!.aBoolean7793 && (!AsyncTaskHandleStatics.method1436(-74, i_2_) || !AsyncTaskHandleStatics.method1436(127, i_1_))) {
                        if (!var_ha_Sub2.aBoolean7837) return (GlTexture2DRegion(var_ha_Sub2, i_2_, i_1_, CacheArchiveIndexLoaderStatics.method340(i_2_, 108.toByte()), CacheArchiveIndexLoaderStatics.method340(i_1_, 108.toByte()), `is`))
                        return GlTexture2DRegion(var_ha_Sub2, 34037, i_2_, i_1_, bool, `is`, i_0_, i)
                    }
                    return GlTexture2DRegion(var_ha_Sub2, 3553, i_2_, i_1_, bool, `is`, i_0_, i)
                } catch (runtimeexception: RuntimeException) {
                    throw SoundBankPatchStatics.method2929(runtimeexception, ("wi.C(" + (if (`is` != null) "{...}" else "null") + ',' + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + (if (var_ha_Sub2 != null) "{...}" else "null") + ',' + bool + ',' + i_3_ + ')'))
                }
            }
    
            @JvmStatic
            fun method3133(i: Byte) {
                aBoundsConstraintEntry_9415 = null
                if (i.toInt() != -109) aBoundsConstraintEntry_9415 = null
                aShortArray9423 = null
                aShortArray9421 = null
                aShortArrayArray9424 = null
                aShortArray9422 = null
            }
    
            @JvmStatic
            fun method3134(i: Int) {
                anInt9419++
                if ((TexGenMaterialPassStatics.anInt6248.inv()) <= i) {
                    val l = GameClock.method599(i xor 0x3c)
                    TexGenMaterialPassStatics.anInt6248 -= (-AnimationFrameDefinitionStatics.aLong6963 + l).toInt()
                    if (TexGenMaterialPassStatics.anInt6248 > 0) {
                        val i_4_ = ((TexGenMaterialPassStatics.anInt6248 shl 8) / FrameBufferObjectStatics.anInt4889)
                        val i_5_ = -i_4_ + 255
                        val f = i_4_.toFloat() / 255.0f
                        val f_6_ = 1.0f - f
                        NativeIndexBufferStatics.anInt4703 = (((i_5_ * ((WaterDetailOptionStateStatics.aModelLightingConfig_5990!!.anInt2540) and 0xff00ff) + (GroundDecorEntityStatics.anInt8739 and 0xff00ff) * i_4_) and 0xff00ff.inv()) - -(0xff0000 and (i_4_ * (0xff00 and GroundDecorEntityStatics.anInt8739) + (0xff00 and (WaterDetailOptionStateStatics.aModelLightingConfig_5990!!.anInt2540)) * i_5_))) ushr 8
                        RangedGraphicsOptionStateStatics.aFloat5945 = (GlTexture1DStatics.aFloat8560 + f_6_ * ((WaterDetailOptionStateStatics.aModelLightingConfig_5990!!.aFloat2551) - GlTexture1DStatics.aFloat8560))
                        ModelVertexColorBufferStatics.aFloat6586 = (WaterDetailOptionStateStatics.aModelLightingConfig_5990!!.aFloat2545 - Js5ArchiveStatics.aFloat670) * f_6_ + Js5ArchiveStatics.aFloat670
                        AnimationFrameTable.anInt486 = (i_4_ * NoOpGraphicsOptionStateStatics.anInt6042 + (WaterDetailOptionStateStatics.aModelLightingConfig_5990!!.anInt2546 * i_5_)) shr 8
                        KeyboardLayoutConfigStatics.aFloat2137 = (TileSceneEntityStatics.aFloat8725 + (-TileSceneEntityStatics.aFloat8725 + (WaterDetailOptionStateStatics.aModelLightingConfig_5990!!.aFloat2547)) * f_6_)
                        TextureMetadataProviderStatics.aFloat4626 = (AbstractModelStatics.aFloat1136 + f_6_ * ((WaterDetailOptionStateStatics.aModelLightingConfig_5990!!.aFloat2544) - AbstractModelStatics.aFloat1136))
                        LocTypeDefLoaderStatics.anInt2500 = (((i_4_ * (0xff00 and DelegatingRenderCanvasStatics.anInt70) + (0xff00 and (WaterDetailOptionStateStatics.aModelLightingConfig_5990!!.anInt2549)) * i_5_) and 0xff0000) + (0xff00ff.inv() and (i_4_ * (0xff00ff and DelegatingRenderCanvasStatics.anInt70) - -(i_5_ * (0xff00ff and (WaterDetailOptionStateStatics.aModelLightingConfig_5990!!.anInt2549)))))) ushr 8
                        CollisionMapStatics.aFloat4455 = (ParticleEmitterFactoryStatics.aFloat3177 + f_6_ * (-ParticleEmitterFactoryStatics.aFloat3177 + (WaterDetailOptionStateStatics.aModelLightingConfig_5990!!.aFloat2536)))
                        NormalMapGeneratorStatics.aFloat3462 = (DebugOverlayRenderer.aFloat3172 + (WaterDetailOptionStateStatics.aModelLightingConfig_5990!!.aFloat2542 - DebugOverlayRenderer.aFloat3172) * f_6_)
                        if (SceneryDetailOptionStateStatics.aCircleRasterizer_6098 !== (WaterDetailOptionStateStatics.aModelLightingConfig_5990!!.aCircleRasterizer_2541)) HeapInfoRecordStatics.aCircleRasterizer_4938 = (LruByteCacheStatics.aRenderer1098!!.method3706(SceneryDetailOptionStateStatics.aCircleRasterizer_6098, (WaterDetailOptionStateStatics.aModelLightingConfig_5990!!.aCircleRasterizer_2541), f_6_, HeapInfoRecordStatics.aCircleRasterizer_4938))
                    } else {
                        HeapInfoRecordStatics.aCircleRasterizer_4938 = (WaterDetailOptionStateStatics.aModelLightingConfig_5990!!.aCircleRasterizer_2541)
                        TextureMetadataProviderStatics.aFloat4626 = WaterDetailOptionStateStatics.aModelLightingConfig_5990!!.aFloat2544
                        ModelVertexColorBufferStatics.aFloat6586 = WaterDetailOptionStateStatics.aModelLightingConfig_5990!!.aFloat2545
                        RangedGraphicsOptionStateStatics.aFloat5945 = WaterDetailOptionStateStatics.aModelLightingConfig_5990!!.aFloat2551
                        AnimationFrameTable.anInt486 = WaterDetailOptionStateStatics.aModelLightingConfig_5990!!.anInt2546
                        NormalMapGeneratorStatics.aFloat3462 = WaterDetailOptionStateStatics.aModelLightingConfig_5990!!.aFloat2542
                        CollisionMapStatics.aFloat4455 = WaterDetailOptionStateStatics.aModelLightingConfig_5990!!.aFloat2536
                        TexGenMaterialPassStatics.anInt6248 = -1
                        LocTypeDefLoaderStatics.anInt2500 = WaterDetailOptionStateStatics.aModelLightingConfig_5990!!.anInt2549
                        NativeIndexBufferStatics.anInt4703 = WaterDetailOptionStateStatics.aModelLightingConfig_5990!!.anInt2540
                        KeyboardLayoutConfigStatics.aFloat2137 = WaterDetailOptionStateStatics.aModelLightingConfig_5990!!.aFloat2547
                    }
                    AnimationFrameDefinitionStatics.aLong6963 = l
                }
            }
    
            @JvmStatic
            fun method3135(i: Int, i_7_: Int, i_8_: Int): WallEntity? {
                val class357 = HintArrowOrMessageStatics.aSceneCollisionEntryArrayArrayArray2029!![i]!![i_7_]!![i_8_]
                if (class357 == null) return null
                return class357.aClass318_Sub1_Sub5_4395
            }
    
            fun method3136(i: Byte, class348_sub49: ByteBuffer?): String {
                anInt9416++
                if (i.toInt() != 64) aShortArray9423 = null
                return method3607(32767, class348_sub49, -77)
            }
}
