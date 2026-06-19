import InputTrackerStatics.method3591
import MapRegionLoaderStatics.method756
import MapRegionLoaderStatics.method760
import MapRegionLoaderStatics.method761
import AnimationFrameState.method867
import InputStream_Sub1Statics.method126
import kotlin.math.atan2
import kotlin.math.sqrt

object SpotAnimEntityStatics {
    var anInt6437: Int = 0
            var anInt6438: Int = 0
            var anInt6440: Int = 0
            var anInt6442: Int = 0
            @JvmField
            var aFontMetaRef_6443: FontMetaRef? = FontMetaRef(68, 2)
            var anInt6445: Int = 0
            var anInt6448: Int = 0
            var anInt6450: Int = 0
            @JvmField
            var anInt6451: Int = 0
            @JvmStatic
            fun method2508(i: Int) {
                if (i != 32767) method2512(null, null, 5)
                aFontMetaRef_6443 = null
            }
    
            fun method2509(i: Int, i_0_: Int, var_renderer: Renderer, i_1_: Int, i_2_: Int, bool: Boolean, i_3_: Int, i_4_: Int) {
                anInt6438++
                if (bool != true) anInt6451 = -14
                var_renderer.method3675(i, (-125).toByte(), i_1_, i_0_, i_3_, i_2_)
                var_renderer.method3675(i - 2, (-125).toByte(), 1 + i_1_, 1 + i_0_, 16, i_4_)
                var_renderer.method3668(-2 + i, 18 + i_0_, i_4_, 1 + i_1_, -19 + i_3_, 115)
            }
    
            @JvmStatic
            fun method2510(js5Archive: Js5Archive?, class348_sub16_sub3: MidiSequencePlayer?, js5Archive_5_: Js5Archive?, bool: Boolean, soundChannelMixer: SoundChannelMixer?, js5Archive_6_: Js5Archive?): Boolean {
                try {
                    ActorEntityStatics.aSoundChannelMixer_8764 = soundChannelMixer
                    NodeDequeHolderStatics.aClass348_Sub16_Sub3_1564 = class348_sub16_sub3
                    MinimapTileEntryStatics.aJs5Archive_611 = js5Archive
                    GlEnvMappedWaterPassStatics.aJs5Archive_7371 = js5Archive_6_
                    MapElementLookupStatics.aJs5Archive_4147 = js5Archive_5_
                    BasicGlRenderPassStatics.anIntArray7299 = IntArray(16)
                    if (bool != false) anInt6451 = 71
                    anInt6442++
                    for (i in 0..15) BasicGlRenderPassStatics.anIntArray7299!![i] = 255
                    return true
                } catch (runtimeexception: RuntimeException) {
                    throw SoundBankPatchStatics.method2929(runtimeexception, ("rba.G(" + (if (js5Archive != null) "{...}" else "null") + ',' + (if (class348_sub16_sub3 != null) "{...}" else "null") + ',' + (if (js5Archive_5_ != null) "{...}" else "null") + ',' + bool + ',' + (if (soundChannelMixer != null) "{...}" else "null") + ',' + (if (js5Archive_6_ != null) "{...}" else "null") + ')'))
                }
            }
    
            fun method2512(var_renderConfig: RenderConfig?, var_renderer: Renderer?, i: Int) {
                try {
                    anInt6440++
                    if (MapRegionLoaderStatics.aClass348_Sub42_Sub14_1243 != null) {
                        if (LinkedListNodeStatics.anInt4290 < 10) {
                            if (!MapRegionLoaderStatics.aJs5Archive_1237!!.method413(100, MapRegionLoaderStatics.aClass348_Sub42_Sub14_1243!!.aString9625!!)) {
                                LinkedListNodeStatics.anInt4290 = (TerrainShadowBuilderGl2Statics.aJs5Archive_6950!!.method397((MapRegionLoaderStatics.aClass348_Sub42_Sub14_1243!!.aString9625!!), 0)) / 10
                                return
                            }
                            method126(-16203)
                            LinkedListNodeStatics.anInt4290 = 10
                        }
                        if (LinkedListNodeStatics.anInt4290 == 10) {
                            MapRegionLoaderStatics.anInt1266 = (MapRegionLoaderStatics.aClass348_Sub42_Sub14_1243!!.anInt9644 shr 6 shl 6)
                            MapRegionLoaderStatics.anInt1263 = (MapRegionLoaderStatics.aClass348_Sub42_Sub14_1243!!.anInt9643 shr 6 shl 6)
                            MapRegionLoaderStatics.anInt1259 = 64 + ((MapRegionLoaderStatics.aClass348_Sub42_Sub14_1243!!.anInt9635 shr 6 shl 6) - MapRegionLoaderStatics.anInt1266)
                            MapRegionLoaderStatics.anInt1267 = 64 + ((MapRegionLoaderStatics.aClass348_Sub42_Sub14_1243!!.anInt9627 shr 6 shl 6) - MapRegionLoaderStatics.anInt1263)
                            val `is` = IntArray(3)
                            var i_7_ = -1
                            var i_8_ = -1
                            if (MapRegionLoaderStatics.aClass348_Sub42_Sub14_1243!!.method3236(`is`, (ArbVertexProgramStatics.regionTileX - -((LocalPlayerState.aPlayer_1907!!.x) shr 9)), ((LocalPlayerState.aPlayer_1907!!.y) shr 9) + RegionMapDecoder.regionTileY, (LocalPlayerState.aPlayer_1907!!.plane).toInt(), (-28).toByte())) {
                                i_7_ = -MapRegionLoaderStatics.anInt1266 + `is`[1]
                                i_8_ = -MapRegionLoaderStatics.anInt1263 + `is`[2]
                            }
                            if (SceneNodeDequeStatics.aBoolean1500 || i_7_ < 0 || MapRegionLoaderStatics.anInt1259 <= i_7_ || i_8_ < 0 || MapRegionLoaderStatics.anInt1267 <= i_8_) {
                                if (IdleAnimationsOptionStateStatics.anInt5909 == -1 || MapRegionLoaderThreadStatics.anInt4202 == -1) {
                                    MapRegionLoaderStatics.aClass348_Sub42_Sub14_1243!!.method3242(`is`, 123, 0x3fff and (MapRegionLoaderStatics.aClass348_Sub42_Sub14_1243!!.anInt9640), (MapRegionLoaderStatics.aClass348_Sub42_Sub14_1243!!.anInt9640) shr 14 and 0x3fff)
                                    DebugOverlayRenderer.anInt3170 = `is`[2] - MapRegionLoaderStatics.anInt1263
                                    WidgetActionEntryStatics.anInt6992 = `is`[1] - MapRegionLoaderStatics.anInt1266
                                } else {
                                    MapRegionLoaderStatics.aClass348_Sub42_Sub14_1243!!.method3242(`is`, 88, MapRegionLoaderThreadStatics.anInt4202, IdleAnimationsOptionStateStatics.anInt5909)
                                    MapRegionLoaderThreadStatics.anInt4202 = -1
                                    IdleAnimationsOptionStateStatics.anInt5909 = MapRegionLoaderThreadStatics.anInt4202
                                    if (`is` != null) {
                                        WidgetActionEntryStatics.anInt6992 = -MapRegionLoaderStatics.anInt1266 + `is`[1]
                                        DebugOverlayRenderer.anInt3170 = -MapRegionLoaderStatics.anInt1263 + `is`[2]
                                    }
                                    SceneNodeDequeStatics.aBoolean1500 = false
                                }
                            } else {
                                i_7_ += (10.0 * Math.random()).toInt() + -5
                                i_8_ += (Math.random() * 10.0).toInt() + -5
                                WidgetActionEntryStatics.anInt6992 = i_7_
                                DebugOverlayRenderer.anInt3170 = i_8_
                            }
                            if (MapRegionLoaderStatics.aClass348_Sub42_Sub14_1243!!.anInt9631 != 37) {
                                if (MapRegionLoaderStatics.aClass348_Sub42_Sub14_1243!!.anInt9631 != 50) {
                                    if (MapRegionLoaderStatics.aClass348_Sub42_Sub14_1243!!.anInt9631 != 75) {
                                        if ((MapRegionLoaderStatics.aClass348_Sub42_Sub14_1243!!.anInt9631) == 100) {
                                            MapRegionLoaderStatics.aFloat1247 = 8.0f
                                            MapRegionLoaderStatics.aFloat1249 = MapRegionLoaderStatics.aFloat1247
                                        } else if ((MapRegionLoaderStatics.aClass348_Sub42_Sub14_1243!!.anInt9631) != 200) {
                                            MapRegionLoaderStatics.aFloat1247 = 8.0f
                                            MapRegionLoaderStatics.aFloat1249 = MapRegionLoaderStatics.aFloat1247
                                        } else {
                                            MapRegionLoaderStatics.aFloat1247 = 16.0f
                                            MapRegionLoaderStatics.aFloat1249 = MapRegionLoaderStatics.aFloat1247
                                        }
                                    } else {
                                        MapRegionLoaderStatics.aFloat1247 = 6.0f
                                        MapRegionLoaderStatics.aFloat1249 = MapRegionLoaderStatics.aFloat1247
                                    }
                                } else {
                                    MapRegionLoaderStatics.aFloat1247 = 4.0f
                                    MapRegionLoaderStatics.aFloat1249 = MapRegionLoaderStatics.aFloat1247
                                }
                            } else {
                                MapRegionLoaderStatics.aFloat1247 = 3.0f
                                MapRegionLoaderStatics.aFloat1249 = MapRegionLoaderStatics.aFloat1247
                            }
                            MapRegionLoaderStatics.anInt1255 = MapRegionLoaderStatics.aFloat1247.toInt() shr 1
                            MapRegionLoaderStatics.aByteArrayArrayArray1251 = SpriteMaskShapeStatics.method2596(MapRegionLoaderStatics.anInt1255, 12871)
                            MenuActionNodeStatics.method2811(false)
                            method760()
                            RegionSceneLoader.aNodeDeque_3705 = NodeDeque()
                            MapRegionLoaderStatics.anInt1250 += (Math.random() * 5.0).toInt() + -2
                            if (MapRegionLoaderStatics.anInt1250 < -8) MapRegionLoaderStatics.anInt1250 = -8
                            if (MapRegionLoaderStatics.anInt1250 > 8) MapRegionLoaderStatics.anInt1250 = 8
                            MapRegionLoaderStatics.anInt1253 += -2 + (5.0 * Math.random()).toInt()
                            if (MapRegionLoaderStatics.anInt1253 < -16) MapRegionLoaderStatics.anInt1253 = -16
                            if (MapRegionLoaderStatics.anInt1253 > 16) MapRegionLoaderStatics.anInt1253 = 16
                            MapRegionLoaderStatics.method764(var_renderConfig!!, (MapRegionLoaderStatics.anInt1250 shr 2 shl 10), MapRegionLoaderStatics.anInt1253 shr 1)
                            MapRegionLoaderStatics.aConfigDefinitionLoader_1238!!.method1220(73.toByte(), 256, 1024)
                            MapRegionLoaderStatics.aTextureDefinitionLoader_1242!!.method1178(256, 1, 256)
                            MapRegionLoaderStatics.aSeqDefinitionCache_1245!!.method2014(4096, true)
                            RenderConfigFactoryStatics.aVarbitDefLoader_2981!!.method1444(256, 123)
                            LinkedListNodeStatics.anInt4290 = 20
                        } else if (LinkedListNodeStatics.anInt4290 == 20) {
                            RegionSceneLoader.method2193(true, (-123).toByte())
                            method756(var_renderer, MapRegionLoaderStatics.anInt1250, MapRegionLoaderStatics.anInt1253)
                            LinkedListNodeStatics.anInt4290 = 60
                            RegionSceneLoader.method2193(true, (-122).toByte())
                            method867(true)
                        } else if (i <= -43) {
                            if (LinkedListNodeStatics.anInt4290 == 60) {
                                if (MapRegionLoaderStatics.aJs5Archive_1237!!.method400(-18308, (MapRegionLoaderStatics.aClass348_Sub42_Sub14_1243!!.aString9625) + "_staticelements")) {
                                    if (!MapRegionLoaderStatics.aJs5Archive_1237!!.method413(100, (MapRegionLoaderStatics.aClass348_Sub42_Sub14_1243!!.aString9625) + "_staticelements")) return
                                    MapRegionLoaderStatics.aSmoothingBuffer_1246 = (SkeletonSequenceLoader.method2300(MapRegionLoaderStatics.aJs5Archive_1237, (MapRegionLoaderStatics.aClass348_Sub42_Sub14_1243!!.aString9625) + "_staticelements", ModelBatchBaseStatics.aBoolean1900, (-91).toByte()))
                                } else MapRegionLoaderStatics.aSmoothingBuffer_1246 = SmoothingBuffer(0)
                                method761()
                                LinkedListNodeStatics.anInt4290 = 70
                                RegionSceneLoader.method2193(true, (-127).toByte())
                                method867(true)
                            } else if (LinkedListNodeStatics.anInt4290 == 70) {
                                MinimapSpriteRendererStatics.aSystemFontGlyphs_4921 = SystemFontGlyphs(var_renderer!!, 11, true, ParticleSystemRendererStatics.aCanvas3869!!)
                                LinkedListNodeStatics.anInt4290 = 73
                                RegionSceneLoader.method2193(true, (-123).toByte())
                                method867(true)
                            } else if (LinkedListNodeStatics.anInt4290 == 73) {
                                GlRectangleTextureStatics.aSystemFontGlyphs_8644 = SystemFontGlyphs(var_renderer!!, 12, true, ParticleSystemRendererStatics.aCanvas3869!!)
                                LinkedListNodeStatics.anInt4290 = 76
                                RegionSceneLoader.method2193(true, (-125).toByte())
                                method867(true)
                            } else if (LinkedListNodeStatics.anInt4290 == 76) {
                                GlShaderObjectHandleStatics.aSystemFontGlyphs_521 = SystemFontGlyphs(var_renderer!!, 14, true, ParticleSystemRendererStatics.aCanvas3869!!)
                                LinkedListNodeStatics.anInt4290 = 79
                                RegionSceneLoader.method2193(true, (-123).toByte())
                                method867(true)
                            } else if (LinkedListNodeStatics.anInt4290 == 79) {
                                HeapDiagnosticsHolder.aSystemFontGlyphs_2252 = SystemFontGlyphs(var_renderer!!, 17, true, ParticleSystemRendererStatics.aCanvas3869!!)
                                LinkedListNodeStatics.anInt4290 = 82
                                RegionSceneLoader.method2193(true, (-124).toByte())
                                method867(true)
                            } else if (LinkedListNodeStatics.anInt4290 == 82) {
                                PingHostListHolder.aSystemFontGlyphs_2333 = SystemFontGlyphs(var_renderer!!, 19, true, ParticleSystemRendererStatics.aCanvas3869!!)
                                LinkedListNodeStatics.anInt4290 = 85
                                RegionSceneLoader.method2193(true, (-128).toByte())
                                method867(true)
                            } else if (LinkedListNodeStatics.anInt4290 == 85) {
                                GlBufferObjectStatics.aSystemFontGlyphs_4754 = SystemFontGlyphs(var_renderer!!, 22, true, ParticleSystemRendererStatics.aCanvas3869!!)
                                LinkedListNodeStatics.anInt4290 = 88
                                RegionSceneLoader.method2193(true, (-124).toByte())
                                method867(true)
                            } else if (LinkedListNodeStatics.anInt4290 == 88) {
                                ModelVertexColorBufferStatics.aSystemFontGlyphs_6581 = SystemFontGlyphs(var_renderer!!, 26, true, ParticleSystemRendererStatics.aCanvas3869!!)
                                LinkedListNodeStatics.anInt4290 = 91
                                RegionSceneLoader.method2193(true, (-125).toByte())
                                method867(true)
                            } else {
                                WorldMapRendererStatics.aSystemFontGlyphs_4672 = SystemFontGlyphs(var_renderer!!, 30, true, ParticleSystemRendererStatics.aCanvas3869!!)
                                LinkedListNodeStatics.anInt4290 = 100
                                RegionSceneLoader.method2193(true, (-119).toByte())
                                method867(true)
                                System.gc()
                            }
                        }
                    }
                } catch (runtimeexception: RuntimeException) {
                    throw SoundBankPatchStatics.method2929(runtimeexception, ("rba.A(" + (if (var_renderConfig != null) "{...}" else "null") + ',' + (if (var_renderer!! != null) "{...}" else "null") + ',' + i + ')'))
                }
            }
}
