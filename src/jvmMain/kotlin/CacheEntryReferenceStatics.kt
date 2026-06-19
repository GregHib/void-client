import GraphicsOptionStateStatics.method1713

object CacheEntryReferenceStatics {
    @JvmField
            var anInt9546: Int = 0
            @JvmField
            var anInt9547: Int = 0
            @JvmField
            var anInt9548: Int = 0
            @JvmField
            var anInt9549: Int = 0
            @JvmField
            var aIntRange_9550: IntRange? = IntRange(109, 7)
            @JvmField
            var anInt9551: Int = 0
            @JvmField
            var aIntRange_9552: IntRange? = IntRange(72, 0)
            @JvmField
            var aFontMetaRef_9553: FontMetaRef? = FontMetaRef(36, 7)
            @JvmField
            var aString9554: String? = null
            @JvmField
            var aShort9555: Short = 1
    
            @JvmStatic
            fun method3194(i: Int, i_0_: Int, i_1_: Byte): Boolean {
                anInt9551++
                if (i_1_ <= 118) method3196(122, -41)
                return false
            }
    
            @JvmStatic
            fun method3196(i: Int, i_2_: Int): Boolean {
                if (i_2_ >= -39) return false
                anInt9546++
                return i == 3 || i == 4 || i == 5 || i == 6
            }
    
            @JvmStatic
            fun method3197(i: Int, i_3_: Byte): Boolean {
                anInt9549++
                if (i_3_.toInt() != 56) aIntRange_9552 = null
                return i == 7 || i == 9
            }
    
            @JvmStatic
            fun method3198(bool: Boolean, i: Byte) {
                anInt9547++
                if (i.toInt() != -45) aShort9555 = (-74).toShort()
                if (bool) {
                    if (RenderNodeStatics.anInt9721 != -1) GlTextureBaseStatics.method235(RenderNodeStatics.anInt9721, (-113).toByte())
                    var class348_sub41 = MinimapSpriteRendererStatics.aHashtable_4915!!.method3484(0) as RegionSceneShifter?
                    while (class348_sub41 != null) {
                        if (!class348_sub41.method2712(4.toByte())) {
                            class348_sub41 = (MinimapSpriteRendererStatics.aHashtable_4915!!.method3484(i.toInt() xor 0x2c.inv()) as RegionSceneShifter?)
                            if (class348_sub41 == null) break
                        }
                        ScrollingWidgetComponentNodeStatics.method1118(true, false, class348_sub41, 2533)
                        class348_sub41 = (MinimapSpriteRendererStatics.aHashtable_4915!!.method3482(0) as RegionSceneShifter?)
                    }
                    RenderNodeStatics.anInt9721 = -1
                    MinimapSpriteRendererStatics.aHashtable_4915 = Hashtable(8)
                    SpriteBlitter.method882(11.toByte())
                    RenderNodeStatics.anInt9721 = GlBufferObjectStatics.anInt4737
                    method1713(false, 520)
                    TextureCacheStatics.method3466(100)
                    ChatCommandProcessor.method703(RenderNodeStatics.anInt9721)
                }
                ProjectileFactoryStatics.aBoolean2895 = false
                TextureGeneratorStatics.aString2496 = ""
                OpenGlModelStatics.aString5600 = TextureGeneratorStatics.aString2496
                RenderableGroupStatics.method1448(-56)
                Tooltip.anInt4458 = -1
                CacheArchiveIndexLoaderStatics.method338(i + 45, StreamingResourceRequestStatics.anInt10447)
                LocalPlayerState.aPlayer_1907 = Player()
                LocalPlayerState.aPlayer_1907!!.x = 512 * GlCubemapLightPassStatics.anInt7319 / 2
                LocalPlayerState.aPlayer_1907!!.anIntArray10320!![0] = GlCubemapLightPassStatics.anInt7319 / 2
                LocalPlayerState.aPlayer_1907!!.y = 512 * RangeThresholdTextureNodeStatics.anInt9109 / 2
                LocalPlayerState.aPlayer_1907!!.anIntArray10317!![0] = RangeThresholdTextureNodeStatics.anInt9109 / 2
                CompositeRgbNoiseTextureStatics.anInt8685 = 0
                GlslMaterialPassStatics.anInt6246 = CompositeRgbNoiseTextureStatics.anInt8685
                if (WeaveTextureNodeStatics.anInt9282 == 2) {
                    GlslMaterialPassStatics.anInt6246 = IntKeyNodeStatics.anInt6981 shl 9
                    CompositeRgbNoiseTextureStatics.anInt8685 = CollisionMapAccessor.anInt3550 shl 9
                } else CameraSplineNodeStatics.method2954(62.toByte())
                SceneObjectSpawnerStatics.method773(true)
            }
    
            @JvmStatic
            fun method3199(i: Int) {
                aIntRange_9550 = null
                if (i < 17) method3196(60, -85)
                aIntRange_9552 = null
                aFontMetaRef_9553 = null
                aString9554 = null
            }
}
