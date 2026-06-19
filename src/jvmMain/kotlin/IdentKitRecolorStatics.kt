import WorldMapElementStatics.method181

object IdentKitRecolorStatics {
    @JvmField
            var anInt147: Int = 0
            @JvmField
            var anInt149: Int = 0
            @JvmField
            var aBoxedIntHolder_151: BoxedIntHolder? = BoxedIntHolder(2)
            @JvmField
            var anInt152: Int = 0
            @JvmField
            var anInt153: Int = 0
            @JvmField
            var anInt155: Int = 0
            @JvmStatic
            fun method203(i: Int, i_0_: Int, i_1_: Int, i_2_: Int, i_3_: Int) {
                anInt149++
                var i_4_ = 0
                if (i > -92) aBoxedIntHolder_151 = null
                var i_5_ = i_3_
                var i_6_ = -i_3_
                var i_7_ = -1
                val i_8_ = WhirlpoolHashStatics.method831(CameraNodeListStatics.anInt1745, i_3_ + i_0_, WorldMapLabelStatics.anInt4960, -108)
                val i_9_ = WhirlpoolHashStatics.method831(CameraNodeListStatics.anInt1745, -i_3_ + i_0_, WorldMapLabelStatics.anInt4960, 81)
                GlElementArrayBufferStatics.method1156(-27, i_8_, WidgetDefinitionStatics.anIntArrayArray255!![i_2_]!!, i_9_, i_1_)
                while (i_5_ > i_4_) {
                    i_7_ += 2
                    i_6_ += i_7_
                    if (i_6_ > 0) {
                        i_5_--
                        i_6_ -= i_5_ shl 1
                        val i_10_ = -i_5_ + i_2_
                        val i_11_ = i_5_ + i_2_
                        if (i_11_ >= LocalPlayerState.anInt1910 && WidgetTextConfigStatics.anInt513 >= i_10_) {
                            val i_12_ = WhirlpoolHashStatics.method831(CameraNodeListStatics.anInt1745, i_4_ + i_0_, WorldMapLabelStatics.anInt4960, 74)
                            val i_13_ = WhirlpoolHashStatics.method831(CameraNodeListStatics.anInt1745, i_0_ + -i_4_, WorldMapLabelStatics.anInt4960, 98)
                            if (i_11_ <= WidgetTextConfigStatics.anInt513) GlElementArrayBufferStatics.method1156(-27, i_12_, (WidgetDefinitionStatics.anIntArrayArray255!![i_11_]!!), i_13_, i_1_)
                            if (LocalPlayerState.anInt1910 <= i_10_) GlElementArrayBufferStatics.method1156(-27, i_12_, (WidgetDefinitionStatics.anIntArrayArray255!![i_10_]!!), i_13_, i_1_)
                        }
                    }
                    val i_14_ = -++i_4_ + i_2_
                    val i_15_ = i_2_ - -i_4_
                    if (LocalPlayerState.anInt1910 <= i_15_ && WidgetTextConfigStatics.anInt513 >= i_14_) {
                        val i_16_ = WhirlpoolHashStatics.method831(CameraNodeListStatics.anInt1745, i_0_ + i_5_, WorldMapLabelStatics.anInt4960, 52)
                        val i_17_ = WhirlpoolHashStatics.method831(CameraNodeListStatics.anInt1745, i_0_ + -i_5_, WorldMapLabelStatics.anInt4960, -106)
                        if (i_15_ <= WidgetTextConfigStatics.anInt513) GlElementArrayBufferStatics.method1156(-27, i_16_, WidgetDefinitionStatics.anIntArrayArray255!![i_15_]!!, i_17_, i_1_)
                        if (i_14_ >= LocalPlayerState.anInt1910) GlElementArrayBufferStatics.method1156(-27, i_16_, WidgetDefinitionStatics.anIntArrayArray255!![i_14_]!!, i_17_, i_1_)
                    }
                }
            }
    
            @JvmStatic
            fun method204(i: Int) {
                anInt155++
                while (CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.method3415(-62, RadialTextureNodeStatics.anInt9341) >= 15) {
                    val i_18_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readBits((-24).toByte(), 15)
                    if (i_18_ == 32767) break
                    var bool = false
                    var class348_sub22 = (NpcEntityUpdater.aHashtable_3654!!.method3480(i_18_.toLong(), -6008) as NpcReference?)
                    if (class348_sub22 == null) {
                        val npc = Npc()
                        npc.anInt10290 = i_18_
                        class348_sub22 = NpcReference(npc)
                        NpcEntityUpdater.aHashtable_3654!!.method3483(57.toByte(), i_18_.toLong(), class348_sub22)
                        bool = true
                        TurbulenceTextureNodeStatics.aClass348_Sub22Array9319!![TerrainShadowBuilderGl2Statics.anInt6930++] = class348_sub22
                    }
                    val npc = (class348_sub22.aNpc_6859)!!
                    RgbColorPaletteStatics.anIntArray1233!![ModelDefinitionLoaderStatics.anInt2057++] = i_18_
                    npc.anInt10306 = NullOggStreamStatics.anInt9041
                    if ((npc.aNpcType_10505) != null && npc.aNpcType_10505!!.method793(0)) method181(true, npc)
                    val i_19_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readBits((-24).toByte(), 2)
                    val i_20_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readBits((-24).toByte(), 1)
                    var i_21_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readBits((-24).toByte(), 5)
                    if (i_21_ > 15) i_21_ -= 32
                    var i_22_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readBits((-24).toByte(), 5)
                    if (i_22_ > 15) i_22_ -= 32
                    val i_23_ = 0x3d01 and (4 + CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readBits((-24).toByte(), 3) shl 11)
                    val i_24_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readBits((-24).toByte(), 1)
                    if (i_24_ == 1) MinimapRectClipper.anIntArray224!![AbstractCameraTransformStatics.anInt1597++] = i_18_
                    npc.method2448((MapAreaDefinitionStatics.aBufferedMessageQueue_2529!!.method2079(CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readBits((-24).toByte(), 14), -1)), i xor 0x2b297815)
                    npc.method2434(111.toByte(), npc.aNpcType_10505!!.anInt1399)
                    npc.anInt10310 = (npc.aNpcType_10505!!.anInt1329) shl 3
                    if (bool) npc.method2435((-108).toByte(), i_23_, true)
                    npc.method2444((LocalPlayerState.aPlayer_1907!!.anIntArray10317!![0]) - -i_21_, i_20_ == 1, (LocalPlayerState.aPlayer_1907!!.anIntArray10320!![0]) + i_22_, i + 724138125, npc.method2436(50.toByte()), i_19_)
                    if (npc.aNpcType_10505!!.method793(0)) ProjectileFactoryStatics.method1614(979190089, npc, npc.plane.toInt(), (npc.anIntArray10317!![0]), (npc.anIntArray10320!![0]), null, null, 0)
                }
                if (i == -724138005) CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.stopBitAccess(false)
            }
    
            fun method205(i: Int, i_25_: Int, i_26_: Int, string: String?, i_27_: Int, i_28_: Int, i_29_: Int, i_30_: Int) {
                try {
                    anInt147++
                    val class318_sub5 = SceneTextLabel()
                    class318_sub5.anInt6419 = i_25_
                    class318_sub5.anInt6418 = i_30_
                    class318_sub5.anInt6422 = i_29_
                    class318_sub5.anInt6421 = i + GlGroundShaderPassStatics.anInt7396
                    if (i_28_ >= -48) method206(-90, -126, -8)
                    class318_sub5.aString6416 = string
                    class318_sub5.anInt6415 = i_26_
                    class318_sub5.anInt6420 = i_27_
                    NpcDefinitionStatics.aDoublyLinkedNodeList_2957!!.method1869(-103, class318_sub5)
                } catch (runtimeexception: RuntimeException) {
                    throw SoundBankPatchStatics.method2929(runtimeexception, ("go.F(" + i + ',' + i_25_ + ',' + i_26_ + ',' + (if (string != null) "{...}" else "null") + ',' + i_27_ + ',' + i_28_ + ',' + i_29_ + ',' + i_30_ + ')'))
                }
            }
    
            @JvmStatic
            fun method206(i: Int, i_31_: Int, i_32_: Int): Int {
                var i_31_ = i_31_
                anInt152++
                val i_33_ = i_31_ ushr 24
                val i_34_ = -i_33_ + i_32_
                i_31_ = (0xff0000 and (i_31_ and 0xff00) * i_33_ or ((0xff00ff and i_31_) * i_33_ and 0xff00ff.inv())) ushr 8
                return i_31_ + (((i and 0xff00) * i_34_ and 0xff0000 or (0xff00ff.inv() and (0xff00ff and i) * i_34_)) ushr 8)
            }
    
            @JvmStatic
            fun method207(var_renderer: Renderer?, i: Byte) {
                do {
                    try {
                        anInt153++
                        var i_35_ = 0
                        var i_36_ = 0
                        if (i < 113) aBoxedIntHolder_151 = null
                        if (GrayscaleNoiseTextureStatics.aBoolean5300) {
                            i_35_ = NativeTerrainTileStatics.method4008((-127).toByte())
                            i_36_ = SceneTilePlaneManager.method260(false)
                        }
                        var_renderer!!.KA(i_35_, i_36_, LocTypeDefinitionStatics.anInt4017 + i_35_, i_36_ + 350)
                        var_renderer.aa(i_35_, i_36_, LocTypeDefinitionStatics.anInt4017, 350, 0x332277 or (HeapDiagnosticsHolder.anInt2254 shl 24), 1)
                        MapTileShapeStatics.method2663(-5590, i_35_, LocTypeDefinitionStatics.anInt4017 + i_35_, i_36_, i_36_ + 350)
                        val i_37_ = 350 / MovementDirectionStatics.anInt1188
                        if (WorldMapTextLabelStatics.anInt8587 > 0) {
                            val i_38_ = 342 + -MovementDirectionStatics.anInt1188
                            val i_39_ = (i_37_ * i_38_ / (-1 + (i_37_ - -WorldMapTextLabelStatics.anInt8587)))
                            var i_40_ = 4
                            if (WorldMapTextLabelStatics.anInt8587 > 1) i_40_ += ((WorldMapTextLabelStatics.anInt8587 + (-1 + -ViewportTransformStatics.anInt3676)) * (i_38_ - i_39_) / (WorldMapTextLabelStatics.anInt8587 + -1))
                            var_renderer.aa(-16 + (LocTypeDefinitionStatics.anInt4017 + i_35_), i_36_ + i_40_, 12, i_39_, 0x332277 or (HeapDiagnosticsHolder.anInt2254 shl 24), 2)
                            var i_41_ = ViewportTransformStatics.anInt3676
                            while (((i_41_ < i_37_ + ViewportTransformStatics.anInt3676) && WorldMapTextLabelStatics.anInt8587 > i_41_)) {
                                val strings = (TurbulenceTextureNodeStatics.method3113('\u0008', true, ArbFogMaterialPassStatics.aStringArray6200!![i_41_]!!))
                                val i_42_ = (-16 + LocTypeDefinitionStatics.anInt4017 + -8) / strings.size
                                for (i_43_ in strings.indices) {
                                    val i_44_ = i_42_ * i_43_ + 8
                                    var_renderer.KA(i_35_ + i_44_, i_36_, i_42_ + i_35_ - (-i_44_ - -8), i_36_ + 350)
                                    GameAppletFrameStatics.aFont_20!!.method2576(BackgroundWorkerThreadStatics.method1909(31.toByte(), strings[i_43_]!!), -1, (-((-ViewportTransformStatics.anInt3676 + i_41_) * MovementDirectionStatics.anInt1188) + (-ProducerImageSurfaceStatics.anInt9077 + i_36_ - (-350 - (-2 + -(ParticleEmitterFactoryStatics.aFontDefinition_3179!!.anInt1993))))), i_35_ + i_44_, -16777216, -110)
                                }
                                i_41_++
                            }
                        }
                        WorldMapRendererStatics.aFont_4684!!.method2569("Build: 634", 350 + (i_36_ + -20), -1, (LocTypeDefinitionStatics.anInt4017 + i_35_ + -25), -121, -16777216)
                        var_renderer.KA(i_35_, i_36_, i_35_ - -LocTypeDefinitionStatics.anInt4017, i_36_ - -350)
                        var_renderer.method3649((-80).toByte(), LocTypeDefinitionStatics.anInt4017, -ProducerImageSurfaceStatics.anInt9077 + (350 + i_36_), -1, i_35_)
                        NodeDequeStatics.aFont_3326!!.method2576("--> " + BackgroundWorkerThreadStatics.method1909(31.toByte(), MapElementManager.aString4461!!), -1, (i_36_ - (-350 + WorldMapLabelStatics.aFontDefinition_4962!!.anInt1993) - 1), 10 + i_35_, -16777216, -127)
                        if (!SizeBoundedSoftCacheStatics.aBoolean2329) break
                        var i_45_ = -1
                        if (GlGroundShaderPassStatics.anInt7396 % 30 > 15) i_45_ = 16777215
                        var_renderer.method3660(10 + (i_35_ - -(WorldMapLabelStatics.aFontDefinition_4962!!.method1183(true, "--> " + (BackgroundWorkerThreadStatics.method1909(31.toByte(), MapElementManager.aString4461!!).substring(0, TerrainShadowBuilderGl3Statics.anInt7006))))), i_45_, 12, 350 + (i_36_ + -WorldMapLabelStatics.aFontDefinition_4962!!.anInt1993 - 11), true)
                    } catch (runtimeexception: RuntimeException) {
                        throw SoundBankPatchStatics.method2929(runtimeexception, ("go.B(" + (if (var_renderer != null) "{...}" else "null") + ',' + i + ')'))
                    }
                    break
                } while (false)
            }
    
            @JvmStatic
            fun method208(i: Byte) {
                if (i.toInt() != 0) method204(29)
                aBoxedIntHolder_151 = null
            }
}
