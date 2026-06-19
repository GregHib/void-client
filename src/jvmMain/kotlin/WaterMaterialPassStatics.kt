import TwoStateOptionStateStatics.method1847
import MinimapShapeDrawerStatics.method459
import jaggl.OpenGLStatics.glBindProgramARB
import jaggl.OpenGLStatics.glDisable
import jaggl.OpenGLStatics.glEnable
import jaggl.OpenGLStatics.glLoadIdentity
import jaggl.OpenGLStatics.glLoadMatrixf
import jaggl.OpenGLStatics.glMatrixMode
import jaggl.OpenGLStatics.glProgramLocalParameter4fARB
import jaggl.OpenGLStatics.glProgramLocalParameter4fvARB
import java.util.*

object WaterMaterialPassStatics {
    @JvmField
            var anInt6214: Int = 0
            @JvmField
            var anInt6215: Int = 0
            @JvmField
            var anInt6216: Int = 0
            @JvmField
            var anInt6217: Int = 0
            @JvmField
            var aCalendar6221: Calendar? = Calendar.getInstance(TimeZone.getTimeZone("GMT"))
            @JvmField
            var anInt6223: Int = 0
            @JvmField
            var anInt6224: Int = 0
            @JvmField
            var anInt6226: Int = 0
            @JvmField
            var anIntArray6228: IntArray? = null
            @JvmField
            var anInt6229: Int = 0
            @JvmField
            var anInt6230: Int = 0
            @JvmField
            var anInt6231: Int = 0
            @JvmField
            var anInt6232: Int = 0
    
            @JvmStatic
            fun method2148(fontMetaRef: FontMetaRef?, isaacCipher: IsaacCipher?, i: Int): OutgoingPacketNode {
                try {
                    anInt6230++
                    val class348_sub47 = ParticleConfigParserStatics.method2273((-103).toByte())!!
                    if (i >= -80) aCalendar6221 = null
                    class348_sub47.anInt7122 = fontMetaRef!!.anInt4323
                    class348_sub47.aFontMetaRef_7118 = fontMetaRef
                    if (class348_sub47.anInt7122 != -1) {
                        if (class348_sub47.anInt7122 == -2) class348_sub47.aClass348_Sub49_Sub2_7116 = CipheredPacketBuffer(10000)
                        else if (class348_sub47.anInt7122 <= 18) class348_sub47.aClass348_Sub49_Sub2_7116 = CipheredPacketBuffer(20)
                        else if (class348_sub47.anInt7122 <= 98) class348_sub47.aClass348_Sub49_Sub2_7116 = CipheredPacketBuffer(100)
                        else class348_sub47.aClass348_Sub49_Sub2_7116 = CipheredPacketBuffer(260)
                    } else class348_sub47.aClass348_Sub49_Sub2_7116 = CipheredPacketBuffer(260)
                    class348_sub47.aClass348_Sub49_Sub2_7116!!.method3416(-17, isaacCipher!!)
    
                    if (LoaderStatics.debug) {
                        println("Encode packet " + class348_sub47.aFontMetaRef_7118!!.method3456(200))
                    }
                    class348_sub47.aClass348_Sub49_Sub2_7116!!.method3408(class348_sub47.aFontMetaRef_7118!!.method3456(200), 18676)
                    class348_sub47.anInt7119 = 0
                    return class348_sub47
                } catch (runtimeexception: RuntimeException) {
                    throw SoundBankPatchStatics.method2929(runtimeexception, ("em.C(" + (if (fontMetaRef != null) "{...}" else "null") + ',' + (if (isaacCipher != null) "{...}" else "null") + ',' + i + ')'))
                }
            }
    
            fun method2150(bool: Boolean, bool_14_: Boolean, npc: Npc) {
                anInt6226++
                if (FileExistsConditionStatics.anInt4776 < 400) {
                    var class79 = (npc.aNpcType_10505)
                    if (class79!!.anIntArray1377 != null) {
                        class79 = class79.method794((ProjectedGroundDecorStatics.aVarpStore_10209!!), -1)
                        if (class79 == null) return
                    }
                    if (class79.aBoolean1396) {
                        var string = class79.aString1372
                        if (class79.anInt1361 != 0) {
                            val string_15_ = (if (GlRectangleTextureStatics.aSceneProjector_8638 != HardCacheEntryReferenceStatics.aSceneProjector_10434) LocalizedTextStatics.aLocalizedText_3511!!.method2063(AnimationFrameDefinitionStatics.anInt6967, 544) else LocalizedTextStatics.aLocalizedText_3513!!.method2063(AnimationFrameDefinitionStatics.anInt6967, 544))
                            string += ((GlRectangleTextureStatics.method250((LocalPlayerState.aPlayer_1907!!.anInt10516), true, class79.anInt1361)) + " (" + string_15_ + class79.anInt1361 + ")")
                        }
                        if (RenderNodeStatics.aBoolean9722 && !bool) {
                            val class254 = (if (ParticleEmitterFactoryStatics.anInt3176 == -1) null else ProjectionCameraTransformStatics.aEmoteDefCache_5764!!.method2600(ParticleEmitterFactoryStatics.anInt3176, 28364))
                            if ((WidgetTextConfigStatics.anInt500 and 0x2) != 0 && (class254 == null || (class79.method805((class254.anInt3256), ParticleEmitterFactoryStatics.anInt3176, 61) != class254.anInt3256))) {
                                MinimapPolygonDrawerStatics.method466(false, ItemNameResolverStatics.aString5000 + " -> <col=ffff00>" + string, 0, (-81).toByte(), false, 0, -1, true, 30, npc.anInt10290.toLong(), ItemNameResolverStatics.aString5001, npc.anInt10290.toLong(), FloatBufferStatics.anInt9747)
                                TextureHandleStatics.anInt2586++
                            }
                        }
                        if (!bool) {
                            var strings: Array<String?>? = class79.aStringArray1349
                            if (ArbVertexProgramStatics.aBoolean9783) strings = method1847(strings, 0)
                            if (strings != null) {
                                for (i in 4 downTo 0) {
                                    if (strings[i] != null && (class79.aByte1384.toInt() == 0 || !(strings[i].equals(LocalizedTextStatics.aLocalizedText_3506!!.method2063(AnimationFrameDefinitionStatics.anInt6967, 544), ignoreCase = true)))) {
                                        var i_16_ = 0
                                        if (i == 0) i_16_ = 25
                                        var i_17_ = WidgetTextConfigStatics.anInt506
                                        if (i == 1) i_16_ = 20
                                        if (i == 2) i_16_ = 44
                                        if (i == 3) i_16_ = 46
                                        if (class79.anInt1335 == i) i_17_ = class79.anInt1371
                                        if (i == 4) i_16_ = 60
                                        if (i == class79.anInt1385) i_17_ = class79.anInt1338
                                        RenderConfigFactoryStatics.anInt2976++
                                        MinimapPolygonDrawerStatics.method466(false, "<col=ffff00>" + string, 0, (-93).toByte(), false, 0, -1, true, i_16_, npc.anInt10290.toLong(), strings[i], npc.anInt10290.toLong(), (if (!(strings[i].equals(LocalizedTextStatics.aLocalizedText_3506!!.method2063(AnimationFrameDefinitionStatics.anInt6967, 544), ignoreCase = true))) i_17_ else class79.anInt1401))
                                    }
                                }
                            }
                            if (class79.aByte1384.toInt() == 1 && strings != null) {
                                for (i in 4 downTo 0) {
                                    if (strings[i] != null && (strings[i].equals(LocalizedTextStatics.aLocalizedText_3506!!.method2063(AnimationFrameDefinitionStatics.anInt6967, 544), ignoreCase = true))) {
                                        var i_18_: Short = 0
                                        if ((LocalPlayerState.aPlayer_1907!!.anInt10516) < class79.anInt1361) i_18_ = 2000.toShort()
                                        var i_19_: Short = 0
                                        if (i == 0) i_19_ = 25.toShort()
                                        if (i == 1) i_19_ = 20.toShort()
                                        if (i == 2) i_19_ = 44.toShort()
                                        if (i == 3) i_19_ = 46.toShort()
                                        if (i == 4) i_19_ = 60.toShort()
                                        if (i_19_.toInt() != 0) i_19_ = (i_19_ + i_18_).toShort()
                                        LocConfigModelBuilderStatics.anInt4510++
                                        MinimapPolygonDrawerStatics.method466(false, "<col=ffff00>" + string, 0, (-101).toByte(), false, 0, -1, true, i_19_.toInt(), npc.anInt10290.toLong(), strings[i], npc.anInt10290.toLong(), class79.anInt1401)
                                    }
                                }
                            }
                        }
                        CircleDrawer.anInt2690++
                        val npcX = (npc.x shr 9) + ArbVertexProgramStatics.regionTileX - npc.aNpcType_10505!!.anInt1399 + 1
                        val npcY = (npc.y shr 9) + RegionMapDecoder.regionTileY - npc.aNpcType_10505!!.anInt1399 + 1
                        MinimapPolygonDrawerStatics.method466(bool, "<col=ffff00>" + string + LoaderStatics.getDebug(class79.anInt1344, npcX, npcY, npc.plane.toInt()), 0, (-105).toByte(), bool_14_, 0, -1, true, 1008, npc.anInt10290.toLong(), LocalizedTextStatics.aLocalizedText_3505!!.method2063(AnimationFrameDefinitionStatics.anInt6967, 544), npc.anInt10290.toLong(), CubeMapMaterialPassStatics.anInt6299)
                    }
                }
            }
    
            @JvmStatic
            fun method2151(i: Int) {
                anIntArray6228 = null
                if (i > -72) method2148(null, null, 77)
                aCalendar6221 = null
            }
    
            @JvmStatic
            fun method2152(bool: Boolean) {
                for (i in 0..<CollisionFlagQueryStatics.anInt1200) MapElementDecorStatics.aMapTileShapeArray10330!![i] = null
                anInt6223++
                CollisionFlagQueryStatics.anInt1200 = 0
                run {
                    var i = 0
                    while (MapAreaDefinitionStatics.anInt2524 > i) {
                        for (i_20_ in 0..<SpotAnimEntityStatics.anInt6451) {
                            var i_21_ = 0
                            while ((i_21_ < RegionSceneShifterStatics.anInt7054)) {
                                val class357 = (HintArrowOrMessageStatics.aSceneCollisionEntryArrayArrayArray2029!![i]!![i_21_]!![i_20_])
                                if (class357 != null) {
                                    if (class357.aShort4398 > 0) class357.aShort4398 = (class357.aShort4398 * -1).toShort()
                                    if (class357.aShort4409 > 0) class357.aShort4409 = (class357.aShort4409 * -1).toShort()
                                }
                                i_21_++
                            }
                        }
                        i++
                    }
                }
                if (bool != false) anIntArray6228 = null
                var i = 0
                while (MapAreaDefinitionStatics.anInt2524 > i) {
                    for (i_22_ in 0..<SpotAnimEntityStatics.anInt6451) {
                        var i_23_ = 0
                        while (RegionSceneShifterStatics.anInt7054 > i_23_) {
                            val class357 = (HintArrowOrMessageStatics.aSceneCollisionEntryArrayArrayArray2029!![i]!![i_23_]!![i_22_])
                            if (class357 != null) {
                                val bool_24_ = ((HintArrowOrMessageStatics.aSceneCollisionEntryArrayArrayArray2029!![0]!![i_23_]!![i_22_]) != null && (HintArrowOrMessageStatics.aSceneCollisionEntryArrayArrayArray2029!![0]!![i_23_]!![i_22_]!!.aSceneCollisionEntry_4400) != null)
                                if (class357.aShort4409 < 0) {
                                    var i_25_ = i_22_
                                    var i_26_ = i_22_
                                    val i_27_ = i
                                    val i_28_ = i
                                    var class357_29_ = (HintArrowOrMessageStatics.aSceneCollisionEntryArrayArrayArray2029!![i]!![i_23_]!![i_25_ + -1])
                                    val i_30_: Int
                                    i_30_ = (TerrainTileShapeStatics.aTerrainTileArray8801!![i]!!.method3982((-86).toByte(), i_22_, i_23_))
                                    while ((i_25_ > 0 && class357_29_ != null && class357_29_.aShort4409 < 0 && (class357_29_.aShort4409 == class357.aShort4409) && (class357.aShort4401 == class357_29_.aShort4401) && ((TerrainTileShapeStatics.aTerrainTileArray8801!![i]!!.method3982((-86).toByte(), -1 + i_25_, i_23_)) == i_30_))) {
                                        if (-1 + i_25_ > 0 && i_30_ != (TerrainTileShapeStatics.aTerrainTileArray8801!![i]!!.method3982((-86).toByte(), i_25_ + -2, i_23_))) break
                                        i_25_--
                                        class357_29_ = (HintArrowOrMessageStatics.aSceneCollisionEntryArrayArrayArray2029!![i]!![i_23_]!![i_25_ + -1])
                                    }
                                    class357_29_ = (HintArrowOrMessageStatics.aSceneCollisionEntryArrayArrayArray2029!![i]!![i_23_]!![1 + i_26_])
                                    while (((RegionSceneShifterStatics.anInt7054 > i_26_) && class357_29_ != null && class357_29_.aShort4409 < 0 && (class357_29_.aShort4409 == class357.aShort4409) && (class357.aShort4401 == class357_29_.aShort4401) && i_30_ == (TerrainTileShapeStatics.aTerrainTileArray8801!![i]!!.method3982((-86).toByte(), i_26_ - -1, i_23_)))) {
                                        if ((RegionSceneShifterStatics.anInt7054 > 1 + i_26_) && i_30_ != (TerrainTileShapeStatics.aTerrainTileArray8801!![i]!!.method3982((-86).toByte(), i_26_ + 2, i_23_))) break
                                        i_26_++
                                        class357_29_ = (HintArrowOrMessageStatics.aSceneCollisionEntryArrayArrayArray2029!![i]!![i_23_]!![i_26_ + 1])
                                    }
                                    val i_31_ = 1 + (-i_27_ + i_28_)
                                    val i_32_ = TerrainTileShapeStatics.aTerrainTileArray8801!![if (bool_24_) 1 + i_27_ else i_27_]!!.method3982((-86).toByte(), i_25_, i_23_)
                                    val i_33_ = (class357.aShort4409 * i_31_ + i_32_)
                                    val i_34_ = (TerrainTileShapeStatics.aTerrainTileArray8801!![if (!bool_24_) i_27_ else i_27_ + 1]!!.method3982((-86).toByte(), 1 + i_26_, i_23_))
                                    val i_35_ = (i_34_ - -(i_31_ * class357.aShort4409))
                                    val i_36_ = i_23_ shl Tooltip.anInt4459
                                    val i_37_ = i_25_ shl Tooltip.anInt4459
                                    val i_38_ = (ArchiveFileConditionWrapperStatics.anInt3465 + (i_26_ shl Tooltip.anInt4459))
                                    MapElementDecorStatics.aMapTileShapeArray10330!![CollisionFlagQueryStatics.anInt1200++] = (MapTileShape(1, i_28_, class357.aShort4401 + i_36_, class357.aShort4401 + i_36_, class357.aShort4401 + i_36_, class357.aShort4401 + i_36_, i_32_, i_34_, i_35_, i_33_, i_37_, i_38_, i_38_, i_37_))
                                    var i_39_ = i_27_
                                    while (i_28_ >= i_39_) {
                                        var i_40_ = i_25_
                                        while (i_26_ >= i_40_) {
                                            HintArrowOrMessageStatics.aSceneCollisionEntryArrayArrayArray2029!![i_39_]!![i_23_]!![i_40_]!!.aShort4409 = (HintArrowOrMessageStatics.aSceneCollisionEntryArrayArrayArray2029!![i_39_]!![i_23_]!![i_40_]!!.aShort4409 * -1).toShort()
                                            i_40_++
                                        }
                                        i_39_++
                                    }
                                }
                                if (class357.aShort4398 < 0) {
                                    var i_41_ = i_23_
                                    var i_42_ = i_23_
                                    val i_43_ = i
                                    val i_44_ = i
                                    var class357_45_ = (HintArrowOrMessageStatics.aSceneCollisionEntryArrayArrayArray2029!![i]!![i_41_ - 1]!![i_22_])
                                    val i_46_: Int
                                    i_46_ = (TerrainTileShapeStatics.aTerrainTileArray8801!![i]!!.method3982((-86).toByte(), i_22_, i_23_))
                                    while ((i_41_ > 0 && class357_45_ != null && class357_45_.aShort4398 < 0 && (class357.aShort4398 == class357_45_.aShort4398) && (class357.aShort4397 == class357_45_.aShort4397) && ((TerrainTileShapeStatics.aTerrainTileArray8801!![i]!!.method3982((-86).toByte(), i_22_, -1 + i_41_)) == i_46_))) {
                                        if (i_41_ + -1 > 0 && ((TerrainTileShapeStatics.aTerrainTileArray8801!![i]!!.method3982((-86).toByte(), i_22_, -2 + i_41_)) != i_46_)) break
                                        i_41_--
                                        class357_45_ = (HintArrowOrMessageStatics.aSceneCollisionEntryArrayArrayArray2029!![i]!![i_41_ - 1]!![i_22_])
                                    }
                                    class357_45_ = (HintArrowOrMessageStatics.aSceneCollisionEntryArrayArrayArray2029!![i]!![i_42_ - -1]!![i_22_])
                                    while ((i_42_ < SpotAnimEntityStatics.anInt6451 && class357_45_ != null && class357_45_.aShort4398 < 0 && (class357.aShort4398 == class357_45_.aShort4398) && (class357_45_.aShort4397 == class357.aShort4397) && ((TerrainTileShapeStatics.aTerrainTileArray8801!![i]!!.method3982((-86).toByte(), i_22_, i_42_ + 1)) == i_46_))) {
                                        if (SpotAnimEntityStatics.anInt6451 > i_42_ + 1 && ((TerrainTileShapeStatics.aTerrainTileArray8801!![i]!!.method3982((-86).toByte(), i_22_, 2 + i_42_)) != i_46_)) break
                                        i_42_++
                                        class357_45_ = (HintArrowOrMessageStatics.aSceneCollisionEntryArrayArrayArray2029!![i]!![1 + i_42_]!![i_22_])
                                    }
                                    val i_47_ = 1 + -i_43_ + i_44_
                                    val i_48_ = TerrainTileShapeStatics.aTerrainTileArray8801!![if (!bool_24_) i_43_ else 1 + i_43_]!!.method3982((-86).toByte(), i_22_, i_41_)
                                    val i_49_ = (i_48_ - -(i_47_ * class357.aShort4398))
                                    val i_50_ = (TerrainTileShapeStatics.aTerrainTileArray8801!![if (!bool_24_) i_43_ else 1 + i_43_]!!.method3982((-86).toByte(), i_22_, 1 + i_42_))
                                    val i_51_ = (class357.aShort4398 * i_47_ + i_50_)
                                    val i_52_ = i_41_ shl Tooltip.anInt4459
                                    val i_53_ = ((i_42_ shl Tooltip.anInt4459) + ArchiveFileConditionWrapperStatics.anInt3465)
                                    val i_54_ = i_22_ shl Tooltip.anInt4459
                                    MapElementDecorStatics.aMapTileShapeArray10330!![CollisionFlagQueryStatics.anInt1200++] = (MapTileShape(2, i_44_, i_52_, i_53_, i_53_, i_52_, i_48_, i_50_, i_51_, i_49_, i_54_ + class357.aShort4397, i_54_ + class357.aShort4397, class357.aShort4397 + i_54_, (i_54_ - -class357.aShort4397)))
                                    for (i_55_ in i_43_..i_44_) {
                                        var i_56_ = i_41_
                                        while ((i_42_ >= i_56_)) {
                                            HintArrowOrMessageStatics.aSceneCollisionEntryArrayArrayArray2029!![i_55_]!![i_56_]!![i_22_]!!.aShort4398 = (HintArrowOrMessageStatics.aSceneCollisionEntryArrayArrayArray2029!![i_55_]!![i_56_]!![i_22_]!!.aShort4398 * -1).toShort()
                                            i_56_++
                                        }
                                    }
                                }
                            }
                            i_23_++
                        }
                    }
                    i++
                }
                MinimapSquareDrawerStatics.aBoolean5226 = true
            }
    
            @JvmStatic
            fun method2153(i: Int) {
                anInt6214++
                if (!KeyboardLayoutConfigStatics.aBoolean2130 && i <= -37) {
                    KeyboardLayoutConfigStatics.aBoolean2130 = true
                    CircleDrawer.aFloat2687 += (-CircleDrawer.aFloat2687 + 24.0f) / 2.0f
                    WorldMapPolygonIconLabelStatics.aBoolean10174 = true
                }
            }
}
