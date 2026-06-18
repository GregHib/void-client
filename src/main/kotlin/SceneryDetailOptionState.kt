import java.io.File

class SceneryDetailOptionState : GraphicsOptionState {
    override fun method1712(i: Int, i_0_: Int) {
        val i_1_ = -73 % ((i - 82) / 35)
        this.anInt3138 = i_0_
        anInt6085++
    }

    internal constructor(class348_sub51: DisplaySettingsConfig) : super(class348_sub51)

    fun method1820(i: Int): Int {
        if (i != -32350) return -43
        anInt6091++
        return this.anInt3138
    }

    override fun method1710(i: Int): Int {
        if (i != 20014) return -20
        anInt6084++
        return 1
    }

    override fun method1714(i: Int, i_3_: Int): Int {
        anInt6092++
        if (this.aClass348_Sub51_3136.method3422(674) == ParticleEmitterNode.aSceneProjector_186) {
            if (this.aClass348_Sub51_3136.method3425(i + -70)) return 3
            if (i_3_ == 0 || this.aClass348_Sub51_3136.aClass239_Sub9_7256!!.method1759(-32350) == 1) return 1
            return 2
        }
        if (i != 3) method1716(true)
        return 3
    }

    override fun method1716(bool: Boolean) {
        if (this.aClass348_Sub51_3136.method3422(674) != ParticleEmitterNode.aSceneProjector_186) this.anInt3138 = 1
        else if (this.aClass348_Sub51_3136.method3425(-95)) this.anInt3138 = 0
        anInt6090++
        if (this.anInt3138 != 0 && this.anInt3138 != 1) this.anInt3138 = method1710(20014)
        if (bool != false) aLruByteCache_6096 = null
    }

    fun method1824(i: Int): Boolean {
        anInt6087++
        if (this.aClass348_Sub51_3136.method3422(674) == ParticleEmitterNode.aSceneProjector_186) {
            return !this.aClass348_Sub51_3136.method3425(-96)
        }
        return false
    }

    internal constructor(i: Int, class348_sub51: DisplaySettingsConfig) : super(i, class348_sub51)

    companion object {
        @JvmField
        var anInt6084: Int = 0
        @JvmField
        var anInt6085: Int = 0
        @JvmField
        var anInt6086: Int = 0
        @JvmField
        var anInt6087: Int = 0
        @JvmField
        var anInt6088: Int = 0
        @JvmField
        var aIntRange_6089: IntRange? = IntRange(41, 3)
        @JvmField
        var anInt6090: Int = 0
        @JvmField
        var anInt6091: Int = 0
        @JvmField
        var anInt6092: Int = 0
        @JvmField
        var aStringArrayArray6093: Array<Array<String?>?>? = arrayOf<Array<String?>?>(arrayOf<String?>("M1", "M2", "S1", "F"), arrayOf<String?>("M1", "M2", "M3", "S1", "S2", "F"), arrayOf<String?>("M1", "M2", "M3", "M4", "S1", "S2", "S3", "F"))
        @JvmField
        var anInt6094: Int = 0
        @JvmField
        var anInt6095: Int = 0
        @JvmField
        var aLruByteCache_6096: LruByteCache? = LruByteCache(8)
        @JvmField
        var aAbstractModelRenderer_6097: AbstractModelRenderer? = null
        @JvmField
        var aCircleRasterizer_6098: CircleRasterizer? = null

        @JvmStatic
        fun method1821(i: Int, file: File): ByteArray? {
            anInt6086++
            val i_2_ = 34 % ((i - 31) / 39)
            return FileIoUtil.method2607(file.length().toInt(), file, 121)
        }

        @JvmStatic
        fun method1822(i: Byte) {
            aIntRange_6089 = null
            aLruByteCache_6096 = null
            aAbstractModelRenderer_6097 = null
            aStringArrayArray6093 = null
            aCircleRasterizer_6098 = null
            if (i.toInt() != 110) aCircleRasterizer_6098 = null
        }

        @JvmStatic
        fun method1823(var_renderer: Renderer, i: Int, i_4_: Int, i_5_: Byte) {
            anInt6088++
            val i_6_ = 56 % ((68 - i_5_) / 58)
            if (i >= 0 && i_4_ >= 0 && GlFramebufferBlitter.anInt282 != 0 && ParticleSystemRenderer.anInt3861 != 0) {
                val abstractCameraTransform: AbstractCameraTransform
                val i_7_: Int
                val i_8_: Int
                var i_9_: Int
                var i_10_: Int
                val i_11_: Int
                val i_12_: Int
                if (GrayscaleNoiseTexture.aBoolean5300) {
                    LinkedNodeListIterator.method1010(false, false)
                    abstractCameraTransform = var_renderer.method3640()!!
                    val `is` = var_renderer.Y()
                    i_7_ = `is`[0]
                    i_8_ = `is`[1]
                    i_9_ = `is`[3]
                    i_10_ = `is`[2]
                    i_11_ = i + MinimapFlagRenderer.method1082(-81, false)
                    i_12_ = OggBitstreamDecoder.method2960(false, -52) + i_4_
                } else {
                    var_renderer.DA(HslPaletteState.anInt4171, CircleDrawer.anInt2688, GlFramebufferBlitter.anInt282, ParticleSystemRenderer.anInt3861)
                    i_8_ = CircleDrawer.anInt2688
                    i_9_ = ParticleSystemRenderer.anInt3861
                    i_7_ = HslPaletteState.anInt4171
                    i_10_ = GlFramebufferBlitter.anInt282
                    var_renderer.KA(ConfigValueProvider.anInt4911, SocketGameConnection.anInt5832, GlFramebufferBlitter.anInt282, ParticleSystemRenderer.anInt3861)
                    abstractCameraTransform = var_renderer.method3654()
                    abstractCameraTransform.method903(GlRectangleTexture.anInt8633, CachedRgbNoiseTexture.anInt8668, MinimapTileEntry.anInt620, PackedFlagsAccessor.anInt7092, ClanChatRequestSender.anInt3650, DisplaySettingsConfig.anInt7244)
                    var_renderer.method3638(abstractCameraTransform)
                    i_12_ = i_4_
                    i_11_ = i
                }
                TextureDefinitionCache.method1626(1, true)
                if (i_10_ == 0) i_10_ = 1
                if (i_9_ == 0) i_9_ = 1
                if (TerrainTileShape.aTerrainTileArray8801 != null && (!RenderNode.aBoolean9722 || (0x40 and WidgetTextConfig.anInt500) != 0)) {
                    var i_13_ = -1
                    var i_14_ = -1
                    val i_15_ = var_renderer.i()
                    val i_16_ = var_renderer.XA()
                    val i_17_: Int
                    val i_18_: Int
                    val i_19_: Int
                    val i_20_: Int
                    if (ParticleSystemRenderer.aBoolean3870) {
                        i_18_ = LocalPlayerState.anInt1906 * (-i_7_ + i_11_) / i_10_
                        i_17_ = i_18_
                        i_20_ = LocalPlayerState.anInt1906 * (-i_8_ + i_12_) / i_9_
                        i_19_ = i_20_
                    } else {
                        i_17_ = i_15_ * (-i_7_ + i_11_) / i_10_
                        i_19_ = i_15_ * (i_12_ + -i_8_) / i_9_
                        i_20_ = i_16_ * (-i_8_ + i_12_) / i_9_
                        i_18_ = (i_11_ - i_7_) * i_16_ / i_10_
                    }
                    val `is` = intArrayOf(i_17_, i_19_, i_15_)
                    val is_21_ = intArrayOf(i_18_, i_20_, i_16_)
                    abstractCameraTransform.method890(`is`)
                    abstractCameraTransform.method890(is_21_)
                    val f = GroundItemRenderState.method1012(`is`[1].toFloat(), is_21_[0].toFloat(), `is`[2].toFloat(), is_21_[2].toFloat(), 4, `is`[0].toFloat(), 123.toByte(), is_21_[1].toFloat())
                    if (f > 0.0f) {
                        val i_22_ = is_21_[0] + -`is`[0]
                        val i_23_ = -`is`[2] + is_21_[2]
                        val i_24_ = (`is`[0].toFloat() + i_22_.toFloat() * f).toInt()
                        val i_25_ = (`is`[2].toFloat() + i_23_.toFloat() * f).toInt()
                        i_13_ = (LocalPlayerState.aPlayer_1907!!.method2436(71.toByte()) + -1 shl 8) + i_24_ shr 9
                        i_14_ = i_25_ - -(LocalPlayerState.aPlayer_1907!!.method2436(73.toByte()) + -1 shl 8) shr 9
                        var i_26_ = (LocalPlayerState.aPlayer_1907!!.plane).toInt()
                        if (i_26_ < 3 && ((0x2 and (AnimationFrameDefinition.aByteArrayArrayArray6962!![1]!![i_24_ shr 9]!![i_25_ shr 9]).toInt()) != 0)) i_26_++
                    }
                    if (i_13_ != -1 && i_14_ != -1) {
                        if (!RenderNode.aBoolean9722 || (0x40 and WidgetTextConfig.anInt500) == 0) {
                            if (ObjectSpawnDecoder.aBoolean1801) MinimapPolygonDrawer.method466(false, "", i_14_, (-109).toByte(), true, i_13_, -1, true, 12, (i_14_ or (i_13_ shl 0)).toLong(), (LocalizedText.aLocalizedText_3510!!.method2063(AnimationFrameDefinition.anInt6967, 544)), 0L, -1)
                            RenderableEntry.anInt4334++
                            MinimapPolygonDrawer.method466(false, "", i_14_, (-82).toByte(), true, i_13_, -1, true, 19, (i_14_ or (i_13_ shl 0)).toLong(), LightingOptionState.aString5882, 0L, MapElementLookup.anInt4144)
                        } else {
                            val class46 = NpcReference.method2957(Class9.anInt169, (-54).toByte(), OrientationRotator.anInt2046)
                            if (class46 == null) TileRenderState.method2678(-2049)
                            else MinimapPolygonDrawer.method466(false, " ->", i_14_, (-101).toByte(), true, i_13_, -1, true, 15, (i_13_ shl 0 or i_14_).toLong(), ItemNameResolver.aString5001, 0L, (FloatBuffer.anInt9747))
                        }
                    }
                }
                if (GrayscaleNoiseTexture.aBoolean5300) GlVertexBufferArb.method2129(86.toByte())
                var i_27_ = 0
                while ((i_27_ < (if (!GrayscaleNoiseTexture.aBoolean5300) 1 else 2))) {
                    val bool = i_27_ == 0
                    val class76 = (if (bool) PlayerSequenceSelector.aSceneObjectSpawner_1208 else HardCacheEntryReference.aSceneObjectSpawner_10436)
                    var i_28_ = i
                    var i_29_ = i_4_
                    if (GrayscaleNoiseTexture.aBoolean5300) {
                        LinkedNodeListIterator.method1010(false, bool)
                        i_28_ += MinimapFlagRenderer.method1082(-92, bool)
                        i_29_ += OggBitstreamDecoder.method2960(bool, -48)
                    }
                    val class243 = class76!!.aDoublyLinkedNodeList_1282
                    var class318_sub4 = class243.method1872(8) as SceneEntityModel?
                    while (class318_sub4 != null) {
                        if ((RuntimeException_Sub1.aBoolean4599 || ((LocalPlayerState.aPlayer_1907!!.plane) == class318_sub4.aClass318_Sub1_6410!!.plane)) && class318_sub4.method2504(i_29_, i_28_, var_renderer, -115)) {
                            val bool_30_ = false
                            val bool_31_ = false
                            val i_32_: Int
                            val i_33_: Int
                            if (class318_sub4.aClass318_Sub1_6410 is GroundDecorEntity) {
                                i_32_ = (class318_sub4.aClass318_Sub1_6410 as GroundDecorEntity).aShort8750.toInt()
                                i_33_ = (class318_sub4.aClass318_Sub1_6410 as GroundDecorEntity).aShort8743.toInt()
                            } else {
                                i_32_ = (class318_sub4.aClass318_Sub1_6410!!.y shr 9)
                                i_33_ = (class318_sub4.aClass318_Sub1_6410!!.x shr 9)
                            }
                            if (class318_sub4.aClass318_Sub1_6410 is Player) {
                                val player = ((class318_sub4.aClass318_Sub1_6410) as Player)
                                val i_34_ = player.method2436(78.toByte())
                                if (((0x1 and i_34_) == 0 && (0x1ff and (player.x)) == 0 && (0x1ff and (player.y)) == 0) || ((i_34_ and 0x1) == 1 && ((player.x) and 0x1ff) == 256 && ((player.y) and 0x1ff) == 256)) {
                                    val i_35_ = (player.x - (-1 + player.method2436(82.toByte()) shl 8))
                                    val i_36_ = (player.y + -(-1 + player.method2436(105.toByte()) shl 8))
                                    var i_37_ = 0
                                    while ((ModelDefinitionLoader.anInt2057 > i_37_)) {
                                        val class348_sub22 = ((NpcEntityUpdater.aHashtable_3654!!.method3480(RgbColorPalette.anIntArray1233!![i_37_].toLong(), -6008)) as? NpcReference?)
                                        if (class348_sub22 != null) {
                                            val npc = (class348_sub22.aNpc_6859)!!
                                            if ((Class367_Sub11.anInt7396 != (npc.anInt10215)) && (npc.aBoolean10309)) {
                                                val i_38_ = ((npc.x) - ((npc.aNpcType_10505!!.anInt1399) + -1 shl 8))
                                                val i_39_ = (-((-1 + (npc.aNpcType_10505!!.anInt1399)) shl 8) + (npc.y))
                                                if (i_35_ <= i_38_ && ((-(i_38_ + -i_35_ shr 9) + (player.method2436(68.toByte()))) >= (npc.aNpcType_10505!!.anInt1399)) && i_36_ <= i_39_ && ((-(-i_36_ + i_39_ shr 9) + (player.method2436(97.toByte()))) >= (npc.aNpcType_10505!!.anInt1399))) {
                                                    WaterMaterialPass.method2150(((class318_sub4.aClass318_Sub1_6410!!.plane) != (LocalPlayerState.aPlayer_1907!!.plane)), false, npc)
                                                    npc.anInt10215 = Class367_Sub11.anInt7396
                                                }
                                            }
                                        }
                                        i_37_++
                                    }
                                    val i_40_ = ShaderState.anInt6513
                                    val `is` = ScrollTexMaterialPass.anIntArray6290!!
                                    var i_41_ = 0
                                    while ((i_40_ > i_41_)) {
                                        val player_42_ = (LoadingBarRenderer.aPlayerArray5058!![`is`[i_41_]])
                                        if ((player_42_ != null) && (Class367_Sub11.anInt7396 != (player_42_.anInt10215)) && (player != player_42_) && (player_42_.aBoolean10309)) {
                                            val i_43_ = ((player_42_.x) + -((player_42_.method2436(94.toByte()) - 1) shl 8))
                                            val i_44_ = ((player_42_.y) + -((-1 + (player_42_.method2436(82.toByte()))) shl 8))
                                            if ((i_43_ >= i_35_) && ((player.method2436(70.toByte()) - (-i_35_ + i_43_ shr 9)) >= player_42_.method2436(89.toByte())) && (i_44_ >= i_36_) && ((player.method2436(42.toByte()) - (i_44_ - i_36_ shr 9)) >= player_42_.method2436(127.toByte()))) {
                                                SpriteDefinition.method3298(114.toByte(), ((class318_sub4.aClass318_Sub1_6410!!.plane) != (LocalPlayerState.aPlayer_1907!!.plane)), player_42_)
                                                player_42_.anInt10215 = Class367_Sub11.anInt7396
                                            }
                                        }
                                        i_41_++
                                    }
                                }
                                if (Class367_Sub11.anInt7396 == player.anInt10215) {
                                    class318_sub4 = class243.method1878((-123).toByte()) as SceneEntityModel?
                                    continue
                                }
                                SpriteDefinition.method3298(96.toByte(), ((LocalPlayerState.aPlayer_1907!!.plane) != class318_sub4.aClass318_Sub1_6410!!.plane), player)
                                player.anInt10215 = Class367_Sub11.anInt7396
                            }
                            if (class318_sub4.aClass318_Sub1_6410 is Npc) {
                                val npc = ((class318_sub4.aClass318_Sub1_6410) as Npc)
                                if (npc.aNpcType_10505 != null) {
                                    if (((npc.aNpcType_10505!!.anInt1399 and 0x1) == 0 && (0x1ff and (npc.x)) == 0 && (0x1ff and (npc.y)) == 0) || ((0x1 and npc.aNpcType_10505!!.anInt1399) == 1 && (0x1ff and (npc.x)) == 256 && ((npc.y) and 0x1ff) == 256)) {
                                        val i_45_ = ((npc.x) - ((-1 + npc.aNpcType_10505!!.anInt1399) shl 8))
                                        val i_46_ = ((npc.y) - (npc.aNpcType_10505!!.anInt1399 - 1 shl 8))
                                        for (i_47_ in 0..<ModelDefinitionLoader.anInt2057) {
                                            val class348_sub22 = ((NpcEntityUpdater.aHashtable_3654!!.method3480(RgbColorPalette.anIntArray1233!![i_47_].toLong(), -6008)) as NpcReference?)
                                            if (class348_sub22 != null) {
                                                val npc_48_ = (class348_sub22.aNpc_6859)!!
                                                if (((npc_48_.anInt10215) != Class367_Sub11.anInt7396) && (npc != npc_48_) && (npc_48_.aBoolean10309)) {
                                                    val i_49_ = (-((npc_48_.aNpcType_10505!!.anInt1399) - 1 shl 8) + (npc_48_.x))
                                                    val i_50_ = ((npc_48_.y) + -((npc_48_.aNpcType_10505!!.anInt1399) - 1 shl 8))
                                                    if (i_49_ >= i_45_ && ((npc_48_.aNpcType_10505!!.anInt1399) <= ((npc.aNpcType_10505!!.anInt1399) - (-i_45_ + i_49_ shr 9))) && (i_46_ <= i_50_) && ((npc_48_.aNpcType_10505!!.anInt1399) <= ((npc.aNpcType_10505!!.anInt1399) + -(i_50_ + -i_46_ shr 9)))) {
                                                        WaterMaterialPass.method2150(((class318_sub4.aClass318_Sub1_6410!!.plane) != (LocalPlayerState.aPlayer_1907!!.plane)), false, npc_48_)
                                                        npc_48_.anInt10215 = (Class367_Sub11.anInt7396)
                                                    }
                                                }
                                            }
                                        }
                                        val i_51_ = ShaderState.anInt6513
                                        val `is` = ScrollTexMaterialPass.anIntArray6290!!
                                        var i_52_ = 0
                                        while ((i_51_ > i_52_)) {
                                            val player = (LoadingBarRenderer.aPlayerArray5058!![`is`[i_52_]])
                                            if ((player != null) && (Class367_Sub11.anInt7396 != (player.anInt10215)) && (player.aBoolean10309)) {
                                                val i_53_ = ((player.x) - ((-1 + (player.method2436(116.toByte()))) shl 8))
                                                val i_54_ = ((player.y) + -((player.method2436(121.toByte())) + -1 shl 8))
                                                if ((i_53_ >= i_45_) && ((-(-i_45_ + i_53_ shr 9) + (npc.aNpcType_10505!!.anInt1399)) >= player.method2436(114.toByte())) && (i_54_ >= i_46_) && (player.method2436(58.toByte()) <= ((npc.aNpcType_10505!!.anInt1399) - (i_54_ + -i_46_ shr 9)))) {
                                                    SpriteDefinition.method3298(125.toByte(), ((class318_sub4.aClass318_Sub1_6410!!.plane) != (LocalPlayerState.aPlayer_1907!!.plane)), player)
                                                    player.anInt10215 = Class367_Sub11.anInt7396
                                                }
                                            }
                                            i_52_++
                                        }
                                    }
                                    if (Class367_Sub11.anInt7396 == npc.anInt10215) {
                                        class318_sub4 = class243.method1878((-123).toByte()) as SceneEntityModel?
                                        continue
                                    }
                                    WaterMaterialPass.method2150((class318_sub4.aClass318_Sub1_6410!!.plane != (LocalPlayerState.aPlayer_1907!!.plane)), false, npc)
                                    npc.anInt10215 = Class367_Sub11.anInt7396
                                }
                            }
                            if (class318_sub4.aClass318_Sub1_6410 is DynamicSceneObjectEntity) {
                                val i_55_ = ArbVertexProgram.regionTileX + i_33_
                                val i_56_ = i_32_ - -Class90.regionTileY
                                val class348_sub37 = ((ModelBatchBase.aHashtable_1895!!.method3480(((class318_sub4.aClass318_Sub1_6410!!.plane).toInt() shl 28 or (i_56_ shl 14) or i_55_).toLong(), -6008)) as HashTableContainer?)
                                if (class348_sub37 != null) {
                                    var i_57_ = 0
                                    var class348_sub34 = (class348_sub37.aNodeDeque_6998.method1993(-92) as IntPair?)
                                    while (class348_sub34 != null) {
                                        val class213 = (Exception_Sub1.aModelHeaderCache_112!!.method1940(79, (class348_sub34.anInt6973)))
                                        if (RenderNode.aBoolean9722 && ((LocalPlayerState.aPlayer_1907!!.plane) == class318_sub4.aClass318_Sub1_6410!!.plane)) {
                                            val class254 = (if (ParticleEmitterFactory.anInt3176 != -1) (ProjectionCameraTransform.aEmoteDefCache_5764!!.method2600(ParticleEmitterFactory.anInt3176, 28364)) else null)
                                            if ((WidgetTextConfig.anInt500 and 0x1) != 0 && (class254 == null || ((class254.anInt3256) != (class213.method1567((class254.anInt3256), 29, ParticleEmitterFactory.anInt3176))))) {
                                                Class97.anInt1555++
                                                MinimapPolygonDrawer.method466(false, (ItemNameResolver.aString5000 + " -> <col=ff9040>" + (class213.aString2795)), i_32_, (-76).toByte(), false, i_33_, -1, true, 49, i_57_.toLong(), ItemNameResolver.aString5001, class348_sub34.anInt6973.toLong(), (FloatBuffer.anInt9747))
                                            }
                                        }
                                        if (class318_sub4.aClass318_Sub1_6410!!.plane == (LocalPlayerState.aPlayer_1907!!.plane)) {
                                            val strings = (class213.aStringArray2811)
                                            for (i_58_ in 4 downTo 0) {
                                                if (strings != null && strings[i_58_] != null) {
                                                    var i_59_ = 0
                                                    if (i_58_ == 0) i_59_ = 21
                                                    var i_60_ = WidgetTextConfig.anInt506
                                                    if (i_58_ == 1) i_59_ = 10
                                                    if (i_58_ == 2) i_59_ = 47
                                                    if (i_58_ == 3) i_59_ = 22
                                                    if (i_58_ == (class213.anInt2752)) i_60_ = class213.anInt2759
                                                    if (i_58_ == 4) i_59_ = 5
                                                    if ((class213.anInt2764) == i_58_) i_60_ = class213.anInt2830
                                                    MinimapPolygonDrawer.method466(false, ("<col=ff9040>" + (class213.aString2795)), i_32_, (-119).toByte(), false, i_33_, -1, true, i_59_, i_57_.toLong(), strings[i_58_], class348_sub34.anInt6973.toLong(), i_60_)
                                                    CacheEntryReference.anInt9548++
                                                }
                                            }
                                        }
                                        AnimationFrameDefinition.anInt6956++
                                        MinimapPolygonDrawer.method466(((LocalPlayerState.aPlayer_1907!!.plane) != class318_sub4.aClass318_Sub1_6410!!.plane), ("<col=ff9040>" + class213.aString2795) + Loader.getDebug(class213.anInt2769), i_32_, (-122).toByte(), false, i_33_, -1, true, 1010, i_57_.toLong(), (LocalizedText.aLocalizedText_3505!!.method2063(AnimationFrameDefinition.anInt6967, 544)), class348_sub34.anInt6973.toLong(), CubeMapMaterialPass.anInt6299)
                                        class348_sub34 = (class348_sub37.aNodeDeque_6998.method2003(-127) as IntPair?)
                                        i_57_++
                                    }
                                }
                            }
                            if (class318_sub4.aClass318_Sub1_6410 is Interface10) {
                                val interface10 = ((class318_sub4.aClass318_Sub1_6410) as Interface10)
                                var npcConfig: NpcConfig? = (GradientLookupEffect.aSeqDefinitionCache_9195!!.method2005(0, interface10.method42(-100)))
                                if (npcConfig!!.anIntArray945 != null) npcConfig = (npcConfig.method480((ProjectedGroundDecor.aVarpStore_10209!!), 47.toByte()))
                                if (npcConfig != null) {
                                    if (RenderNode.aBoolean9722 && ((LocalPlayerState.aPlayer_1907!!.plane) == (class318_sub4.aClass318_Sub1_6410!!.plane))) {
                                        val class254 = (if (ParticleEmitterFactory.anInt3176 != -1) (ProjectionCameraTransform.aEmoteDefCache_5764!!.method2600(ParticleEmitterFactory.anInt3176, 28364)) else null)
                                        if (((0x4 and WidgetTextConfig.anInt500) != 0) && (class254 == null || ((class254.anInt3256) != (npcConfig.method487(ParticleEmitterFactory.anInt3176, (class254.anInt3256), 54))))) {
                                            TrigLookupInit.anInt2877++
                                            MinimapPolygonDrawer.method466(false, (ItemNameResolver.aString5000 + " -> <col=00ffff>" + (npcConfig.aString884)), i_32_, (-94).toByte(), false, i_33_, -1, true, 2, interface10.hashCode().toLong(), ItemNameResolver.aString5001, (WeaveTextureNode.method3107(95.toByte(), interface10, i_32_, i_33_)), FloatBuffer.anInt9747)
                                        }
                                    }
                                    if (class318_sub4.aClass318_Sub1_6410!!.plane == (LocalPlayerState.aPlayer_1907!!.plane)) {
                                        val strings = npcConfig.aStringArray913
                                        if (strings != null) {
                                            for (i_61_ in 4 downTo 0) {
                                                if (strings[i_61_] != null) {
                                                    var i_62_ = 0
                                                    if (i_61_ == 0) i_62_ = 3
                                                    var i_63_ = WidgetTextConfig.anInt506
                                                    if (i_61_ == 1) i_62_ = 4
                                                    if (i_61_ == 2) i_62_ = 9
                                                    if (i_61_ == 3) i_62_ = 59
                                                    if (i_61_ == 4) i_62_ = 1007
                                                    if ((npcConfig.anInt950) == i_61_) i_63_ = (npcConfig.anInt869)
                                                    if (i_61_ == (npcConfig.anInt951)) i_63_ = (npcConfig.anInt877)
                                                    MinimapPolygonDrawer.method466(false, ("<col=00ffff>" + (npcConfig.aString884)), i_32_, (-100).toByte(), false, i_33_, -1, true, i_62_, interface10.hashCode().toLong(), strings[i_61_], (WeaveTextureNode.method3107((-116).toByte(), interface10, i_32_, i_33_)), i_63_)
                                                    Class83.anInt1445++
                                                }
                                            }
                                        }
                                        val x = i_33_ + ArbVertexProgram.regionTileX
                                        val y = i_32_ + Class90.regionTileY
                                        MinimapPolygonDrawer.method466(
                                            ((LocalPlayerState.aPlayer_1907!!.plane) != class318_sub4.aClass318_Sub1_6410!!.plane),
                                            ("<col=00ffff>" + npcConfig.aString884 + Loader.getDebug(npcConfig.anInt941, x, y, class318_sub4.aClass318_Sub1_6410!!.plane.toInt())),
                                            i_32_,
                                            (-120).toByte(),
                                            false,
                                            i_33_,
                                            -1,
                                            true,
                                            1001,
                                            interface10.hashCode().toLong(),
                                            (LocalizedText.aLocalizedText_3505!!.method2063(AnimationFrameDefinition.anInt6967, 544)),
                                            npcConfig.anInt941.toLong(),
                                            CubeMapMaterialPass.anInt6299
                                        )
                                        anInt6094++
                                    }
                                }
                            }
                        }
                        class318_sub4 = class243.method1878((-123).toByte()) as SceneEntityModel?
                    }
                    if (GrayscaleNoiseTexture.aBoolean5300) GlVertexBufferArb.method2129(86.toByte())
                    i_27_++
                }
                TextureDefinitionCache.method1626(1, false)
            }
        }
    }
}
