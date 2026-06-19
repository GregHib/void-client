import GlTextureBaseStatics.method235
import GraphicsOptionStateStatics.method1713
import SceneEntityStatics.method2385
import ChatCommandProcessor.method703
import SpriteBlitter.method882
import RenderNodeStatics.method3284

object LinkedNodeListIteratorStatics {
    @JvmField
            var anInt1642: Int = 0
            @JvmField
            var anInt1643: Int = 0
            @JvmField
            var anInt1644: Int = 0
            var anInt1645: Int = -2
            @JvmField
            var anInt1646: Int = 0
            @JvmField
            var anInt1648: Int = 0
            @JvmField
            var anInt1649: Int = 0
            var anIntArray1650: IntArray? = IntArray(1000)
            @JvmField
            var anInt1651: Int = 0
            @JvmField
            var anInt1653: Int = 0
            @JvmField
            var anInt1654: Int = 0
            @JvmField
            var anInt1655: Int = 0
    
            @JvmStatic
            fun method1004(i: Byte) {
                anIntArray1650 = null
                if (i.toInt() != 16) method1006(false, ((-62).toByte()).toByte())
            }
    
            @JvmStatic
            fun method1006(bool: Boolean, i: Byte) {
                anInt1655++
                if (bool) {
                    if (RenderNodeStatics.anInt9721 != -1) method235(RenderNodeStatics.anInt9721, ((-108).toByte()).toByte())
                    var class348_sub41 = MinimapSpriteRendererStatics.aHashtable_4915!!.method3484(0) as? RegionSceneShifter
                    while (class348_sub41 != null) {
                        if (!class348_sub41.method2712(4.toByte())) {
                            class348_sub41 = (MinimapSpriteRendererStatics.aHashtable_4915!!.method3484(0) as? RegionSceneShifter)
                            if (class348_sub41 == null) break
                        }
                        ScrollingWidgetComponentNodeStatics.method1118(true, false, class348_sub41, 2533)
                        class348_sub41 = (MinimapSpriteRendererStatics.aHashtable_4915!!.method3482(0) as? RegionSceneShifter)
                    }
                    RenderNodeStatics.anInt9721 = -1
                    MinimapSpriteRendererStatics.aHashtable_4915 = Hashtable(8)
                    method882(11.toByte())
                    RenderNodeStatics.anInt9721 = FloorOverlayDefinitionStatics.anInt970
                    method1713(false, 520)
                    TextureCacheStatics.method3466(-119)
                    method703(RenderNodeStatics.anInt9721)
                }
                ProjectileFactoryStatics.aBoolean2895 = true
                if (i < 49) anInt1651 = 10
            }
    
            fun method1007(widgetComponent: WidgetComponent?, var_renderer: Renderer?, i: Int, i_1_: Int, i_2_: Int) {
                try {
                    anInt1648++
                    val var_aa = widgetComponent!!.method425(var_renderer!!, 40.toByte())
                    if (var_aa != null) {
                        if (i_2_ != 22960) anIntArray1650 = null
                        var_renderer.KA(i, i_1_, i + widgetComponent.anInt709, widgetComponent.anInt789 + i_1_)
                        if (KeyboardLayoutCacheStatics.anInt3306 != 2 && KeyboardLayoutCacheStatics.anInt3306 != 5 && GroundItemRenderState.aAbstractModelRenderer_1664 != null) {
                            val i_3_: Int
                            val i_4_: Int
                            val i_5_: Int
                            val i_6_: Int
                            if (WeaveTextureNodeStatics.anInt9282 == 4) {
                                i_3_ = RegionTileNodeStatics.anInt6652
                                i_4_ = HslColorTableNodeStatics.anInt6633
                                i_5_ = 4096
                                i_6_ = 0x3fff and -ResourceProviderStatics.aFloat3938.toInt()
                            } else {
                                i_5_ = 4096 - 16 * FloatBufferStatics.anInt9750
                                i_3_ = (LocalPlayerState.aPlayer_1907!!.y)
                                i_6_ = (-ResourceProviderStatics.aFloat3938.toInt() - -OpenGlRenderNodeStatics.anInt10483 and 0x3fff)
                                i_4_ = (LocalPlayerState.aPlayer_1907!!.x)
                            }
                            val i_7_ = 48 - (-(i_4_ / 128) - -(GlCubemapLightPassStatics.anInt7319 * 2)) - -208
                            val i_8_ = (208 - (RangeThresholdTextureNodeStatics.anInt9109 * 2 - 48) + 4 * RangeThresholdTextureNodeStatics.anInt9109 - i_3_ / 128)
                            GroundItemRenderState.aAbstractModelRenderer_1664!!.method967((widgetComponent.anInt709.toFloat() / 2.0f + i.toFloat()), (widgetComponent.anInt789.toFloat() / 2.0f + i_1_.toFloat()), i_7_.toFloat(), i_8_.toFloat(), i_5_, i_6_ shl 2, var_aa, i, i_1_)
                            var class348_sub35 = ModelWallEntityStatics.aNodeDeque_10125!!.method1995(i_2_ xor 0x59b4) as? IntKeyNode
                            while (class348_sub35 != null) {
                                val i_9_ = class348_sub35.anInt6976
                                val i_10_ = (-ArbVertexProgramStatics.regionTileX + ((0xfffe5b0 and (OpenGlRenderNodeStatics.aSmoothingBuffer_10488!!.anIntArray3238!![i_9_])) shr 14))
                                val i_11_ = (-RegionMapDecoder.regionTileY + (0x3fff and (OpenGlRenderNodeStatics.aSmoothingBuffer_10488!!.anIntArray3238!![i_9_])))
                                val i_12_ = -(i_4_ / 128) + 2 + 4 * i_10_
                                val i_13_ = 2 + (4 * i_11_ - i_3_ / 128)
                                method2385(widgetComponent, i_1_, var_aa, (OpenGlRenderNodeStatics.aSmoothingBuffer_10488!!.anIntArray3239!![i_9_]), i_12_, i, ((-94).toByte()).toByte(), i_13_, var_renderer)
                                class348_sub35 = ModelWallEntityStatics.aNodeDeque_10125!!.method1990(92.toByte()) as? IntKeyNode
                            }
                            var i_14_ = 0
                            while ((ClampTextureNodeStatics.anInt9479 > i_14_)) {
                                val i_15_ = (MenuActionNodeStatics.anIntArray6770!![i_14_] * 4 - -2 - i_4_ / 128)
                                val i_16_ = (-(i_3_ / 128) + BoxBlurTextureNodeStatics.anIntArray9458!![i_14_] * 4 - -2)
                                var npcConfig: NpcConfig? = (GradientLookupEffectStatics.aSeqDefinitionCache_9195!!.method2005(0, SeqDefinitionCacheStatics.anIntArray3347!![i_14_]))
                                if (npcConfig!!.anIntArray945 != null) {
                                    npcConfig = npcConfig.method480((ProjectedGroundDecorStatics.aVarpStore_10209!!), 47.toByte())
                                    if (npcConfig == null || (npcConfig.anInt921 == -1)) {
                                        i_14_++
                                        continue
                                    }
                                }
                                method2385(widgetComponent, i_1_, var_aa, npcConfig.anInt921, i_15_, i, ((-113).toByte()).toByte(), i_16_, var_renderer)
                                i_14_++
                            }
                            var class348_sub37 = ModelBatchBaseStatics.aHashtable_1895!!.method3484(i_2_ xor 0x59b0) as? HashTableContainer
                            while (class348_sub37 != null) {
                                val i_17_ = (0x3L and ((class348_sub37.aLong4291) shr 28)).toInt()
                                if (CameraOrModelTransformStatics.anInt4155 == i_17_) {
                                    val i_18_ = (-ArbVertexProgramStatics.regionTileX + ((class348_sub37.aLong4291) and 0x3fffL).toInt())
                                    val i_19_ = (-RegionMapDecoder.regionTileY + ((class348_sub37.aLong4291) shr 14 and 0x3fffL).toInt())
                                    val i_20_ = -(i_4_ / 128) + (2 + i_18_ * 4)
                                    val i_21_ = -(i_3_ / 128) + (2 + i_19_ * 4)
                                    HeadIconRendererStatics.method1211(i_1_, (BoundingBoxNodeStatics.aAbstractModelRendererArray6742!![0]), i, widgetComponent, var_aa, i_21_, i_2_ xor 0x59b2, i_20_)
                                }
                                class348_sub37 = (ModelBatchBaseStatics.aHashtable_1895!!.method3482(0) as? HashTableContainer)
                            }
                            var i_22_ = 0
                            while ((i_22_ < ModelDefinitionLoaderStatics.anInt2057)) {
                                val class348_sub22 = ((NpcEntityUpdater.aHashtable_3654!!.method3480(RgbColorPaletteStatics.anIntArray1233!![i_22_].toLong(), -6008)) as? NpcReference)
                                if (class348_sub22 != null) {
                                    val npc = (class348_sub22.aNpc_6859)!!
                                    if (npc.method2445(((-126).toByte()).toByte()) && ((npc.plane) == (LocalPlayerState.aPlayer_1907!!.plane))) {
                                        var class79 = (npc.aNpcType_10505)
                                        if (class79 != null && (class79.anIntArray1377 != null)) class79 = (class79.method794((ProjectedGroundDecorStatics.aVarpStore_10209!!), -1))
                                        if (class79 != null && class79.aBoolean1397 && class79.aBoolean1396) {
                                            val i_23_ = (-(i_4_ / 128) + (npc.x) / 128)
                                            val i_24_ = ((npc.y) / 128 + -(i_3_ / 128))
                                            if (class79.anInt1383 != -1) method2385(widgetComponent, i_1_, var_aa, class79.anInt1383, i_23_, i, ((-73).toByte()).toByte(), i_24_, var_renderer)
                                            else HeadIconRendererStatics.method1211(i_1_, (BoundingBoxNodeStatics.aAbstractModelRendererArray6742!![1]), i, widgetComponent, var_aa, i_24_, 2, i_23_)
                                        }
                                    }
                                }
                                i_22_++
                            }
                            val i_25_ = ShaderStateStatics.anInt6513
                            val `is` = ScrollTexMaterialPassStatics.anIntArray6290
                            for (i_26_ in 0..<i_25_) {
                                val player = (LoadingBarRendererStatics.aPlayerArray5058!![`is`!![i_26_]])
                                if (player != null && player.method2457(37.toByte()) && !player.aBoolean10551 && (LocalPlayerState.aPlayer_1907 != player) && (player.plane == (LocalPlayerState.aPlayer_1907!!.plane))) {
                                    val i_27_ = (-(i_4_ / 128) + (player.x) / 128)
                                    val i_28_ = (-(i_3_ / 128) + (player.y) / 128)
                                    var bool = false
                                    var i_29_ = 0
                                    while ((HslAdjustTextureNodeStatics.anInt9383 > i_29_)) {
                                        if ((player.aString10544 == WaterTextureSetStatics.aStringArray1441!![i_29_]) && (RendererStatics.anIntArray4578!![i_29_] != 0)) {
                                            bool = true
                                            break
                                        }
                                        i_29_++
                                    }
                                    var bool_30_ = false
                                    var i_31_ = 0
                                    while (ByteArrayPool.anInt496 > i_31_) {
                                        if (player.aString10544 == HostPingThreadStatics.aWorldListEntryArray2261!![i_31_]!!.aString306) {
                                            bool_30_ = true
                                            break
                                        }
                                        i_31_++
                                    }
                                    var bool_32_ = false
                                    if ((LocalPlayerState.aPlayer_1907!!.anInt10542) != 0 && (player.anInt10542 != 0) && (player.anInt10542 == (LocalPlayerState.aPlayer_1907!!.anInt10542))) bool_32_ = true
                                    if (!player.aBoolean10554) {
                                        if (!bool) {
                                            if (bool_30_) HeadIconRendererStatics.method1211(i_1_, (BoundingBoxNodeStatics.aAbstractModelRendererArray6742!![5]), i, widgetComponent, var_aa, i_28_, i_2_ + -22958, i_27_)
                                            else if (!bool_32_) HeadIconRendererStatics.method1211(i_1_, (BoundingBoxNodeStatics.aAbstractModelRendererArray6742!![2]), i, widgetComponent, var_aa, i_28_, 2, i_27_)
                                            else HeadIconRendererStatics.method1211(i_1_, (BoundingBoxNodeStatics.aAbstractModelRendererArray6742!![4]), i, widgetComponent, var_aa, i_28_, 2, i_27_)
                                        } else HeadIconRendererStatics.method1211(i_1_, (BoundingBoxNodeStatics.aAbstractModelRendererArray6742!![3]), i, widgetComponent, var_aa, i_28_, 2, i_27_)
                                    } else HeadIconRendererStatics.method1211(i_1_, (BoundingBoxNodeStatics.aAbstractModelRendererArray6742!![6]), i, widgetComponent, var_aa, i_28_, i_2_ + -22958, i_27_)
                                }
                            }
                            val class302s = MultiFieldRecordStatics.aMinimapPositionStateArray6897s
                            var i_33_ = 0
                            while ((i_33_ < class302s!!.size)) {
                                val class302 = class302s[i_33_]
                                if (class302 != null && (class302.anInt3840 != 0) && GlGroundShaderPassStatics.anInt7396 % 20 < 10) {
                                    if (class302.anInt3840 == 1) {
                                        val class348_sub22 = ((NpcEntityUpdater.aHashtable_3654!!.method3480(class302.anInt3833.toLong(), -6008)) as? NpcReference)
                                        if (class348_sub22 != null) {
                                            val npc = (class348_sub22.aNpc_6859)!!
                                            val i_34_ = (-(i_4_ / 128) + (npc.x) / 128)
                                            val i_35_ = (-(i_3_ / 128) + (npc.y) / 128)
                                            TypedRecordTableStatics.method2181(360000L, i_1_, -125, i_35_, i, widgetComponent, i_34_, (class302.anInt3831), var_aa)
                                        }
                                    }
                                    if (class302.anInt3840 == 2) {
                                        val i_36_ = (-(i_4_ / 128) + (class302.anInt3835 / 128))
                                        val i_37_ = (-(i_3_ / 128) + (class302.anInt3832 / 128))
                                        var l = (class302.anInt3837 shl 7).toLong()
                                        l *= l
                                        TypedRecordTableStatics.method2181(l, i_1_, -112, i_37_, i, widgetComponent, i_36_, (class302.anInt3831), var_aa)
                                    }
                                    if ((class302.anInt3840 == 10) && class302.anInt3833 >= 0 && (class302.anInt3833 < (LoadingBarRendererStatics.aPlayerArray5058)!!.size)) {
                                        val player = (LoadingBarRendererStatics.aPlayerArray5058!![class302.anInt3833])
                                        if (player != null) {
                                            val i_38_ = (-(i_4_ / 128) + (player.x) / 128)
                                            val i_39_ = (-(i_3_ / 128) + (player.y) / 128)
                                            TypedRecordTableStatics.method2181(360000L, i_1_, -121, i_39_, i, widgetComponent, i_38_, (class302.anInt3831), var_aa)
                                        }
                                    }
                                }
                                i_33_++
                            }
                            if (WeaveTextureNodeStatics.anInt9282 != 4) {
                                if (MediaStreamClientStatics.anInt3203 != 0) {
                                    val i_40_ = (-(i_4_ / 128) + (MediaStreamClientStatics.anInt3203 * 4 + 2) - (-(2 * LocalPlayerState.aPlayer_1907!!.method2436(77.toByte())) - -2))
                                    val i_41_ = (4 * TerrainChunkBuilderStatics.anInt1548 - (-2 + i_3_ / 128) + (2 * (LocalPlayerState.aPlayer_1907!!.method2436(59.toByte()) - 1)))
                                    HeadIconRendererStatics.method1211(i_1_, (SpriteStoreStatics.aAbstractModelRendererArray367!![(if (!ModelKeyBuilderStatics.aBoolean6759) 0 else 1)]), i, widgetComponent, var_aa, i_41_, 2, i_40_)
                                }
                                if (!LocalPlayerState.aPlayer_1907!!.aBoolean10551) var_renderer.method3675(3, ((-125).toByte()).toByte(), -1 + (i - -((widgetComponent.anInt709) / 2)), -1 + ((widgetComponent.anInt789) / 2 + i_1_), 3, -1)
                            }
                        } else var_renderer.A(-16777216, var_aa, i, i_1_)
                    }
                } catch (runtimeexception: RuntimeException) {
                    throw SoundBankPatchStatics.method2929(runtimeexception, ("mn.F(" + (if (widgetComponent != null) "{...}" else "null") + ',' + (if (var_renderer != null) "{...}" else "null") + ',' + i + ',' + i_1_ + ',' + i_2_ + ')'))
                }
            }
    
            fun method1010(bool: Boolean, bool_42_: Boolean) {
                RenderNodeStatics.aAbstractCameraTransform_9720!!.method898(CameraRotationStubStatics.aRenderer326!!.method3640())
                anInt1642++
                val `is` = CameraRotationStubStatics.aRenderer326!!.Y()
                Gl3dTextureStatics.anInt8630 = `is`[2]
                MediaStreamClientStatics.anInt3202 = `is`[0]
                ProjectileConfigUtil.anInt394 = `is`[3]
                SimpleToggleOptionStateStatics.anInt5886 = `is`[1]
                if (bool_42_) {
                    CameraRotationStubStatics.aRenderer326!!.DA(AnimationFrameState.anInt1537, SceneTextLabelStatics.anInt6417, TextureHandleStatics.anInt2590, ModelFacePriorityNodeStatics.anInt1879)
                    method3284(true, ModelWallEntityStatics.aDouble10120)
                } else {
                    CameraRotationStubStatics.aRenderer326!!.DA(ConfigValueProviderStatics.anInt4910, ShaderStateVariant.anInt8799, TexGenMaterialPassStatics.anInt6255, FireParticleStreamStatics.anInt95)
                    method3284(true, GlCubeMapTextureStatics.aDouble8621)
                }
                if (bool != false) method1010(true, true)
            }
}
