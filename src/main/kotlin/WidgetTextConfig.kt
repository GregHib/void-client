import GameAppletFrame.Companion.method94
import WallEntity.Companion.method2483
import TurbulenceTextureNode.Companion.method3113
import Class367_Sub8.Companion.method3547
import SolidFillComponent.Companion.method195
import Sprite.Companion.method159
import java.awt.datatransfer.DataFlavor
import java.awt.datatransfer.StringSelection
import kotlin.math.max
import kotlin.math.min

/*
 * Class38
 */
class WidgetTextConfig {
    @JvmField
    var anInt498: Int = 0
    @JvmField
    var anInt499: Int = 0
    @JvmField
    var anInt501: Int = 8
    @JvmField
    var anInt502: Int = 0
    @JvmField
    var anInt503: Int = 16777215
    @JvmField
    var anInt504: Int = 0
    @JvmField
    var aBoolean507: Boolean = false
    @JvmField
    var anInt508: Int = 0
    private fun method361(i: Int, class348_sub49: Buffer, i_2_: Int) {
        if (i != -6617) method363(95)
        anInt497++
        if (i_2_ == 1) this.anInt501 = class348_sub49.readUnsignedShort(842397944)
        else if (i_2_ == 2) this.aBoolean507 = true
        else if (i_2_ == 3) {
            this.anInt499 = class348_sub49.readShort(13638)
            this.anInt502 = class348_sub49.readShort(13638)
            this.anInt508 = class348_sub49.readShort(13638)
        } else if (i_2_ == 4) this.anInt498 = class348_sub49.readUnsignedByte(255)
        else if (i_2_ == 5) this.anInt504 = class348_sub49.readUnsignedShort(842397944)
        else if (i_2_ == 6) this.anInt503 = class348_sub49.readMedium(-1)
    }

    fun method364(class348_sub49: Buffer, i: Byte) {
        anInt511++
        if (i >= 22) {
            while (true) {
                val i_10_ = class348_sub49.readUnsignedByte(255)
                if (i_10_ == 0) break
                method361(-6617, class348_sub49, i_10_)
            }
        }
    }

    companion object {
        @JvmField
        var anInt497: Int = 0
        @JvmField
        var anInt500: Int = 0
        @JvmField
        var anInt505: Int = 0
        @JvmField
        var anInt506: Int = -1
        @JvmField
        var anInt509: Int = 0
        @JvmField
        var aBoolean510: Boolean = false
        @JvmField
        var anInt511: Int = 0
        @JvmField
        var anInt512: Int = 0
        @JvmField
        var anInt513: Int = 100

        @JvmStatic
        fun method360(i: Byte, i_0_: Int): BoxedIntHolder? {
            anInt505++
            if (i.toInt() != -57) method363(97)
            val class227s = SceneNodeDeque.method841(i + -70)
            var i_1_ = 0
            while (class227s.size > i_1_) {
                val class227 = class227s[i_1_]!!
                if (class227.anInt2970 == i_0_) return class227
                i_1_++
            }
            return null
        }

        @JvmStatic
        fun method362(i: Int) {
            anInt509++
            var class348_sub27 = (SpriteRenderEntry.aNodeDeque_9711!!.method1995(4) as? MultiFieldRecord?)
            val i_3_ = -45 % ((i - -34) / 47)
            while ( /**/class348_sub27 != null) {
                if (class348_sub27.anInt6893 > 0) class348_sub27.anInt6893--
                if (class348_sub27.anInt6893 != 0) {
                    if (class348_sub27.anInt6894 > 0) class348_sub27.anInt6894--
                    if (class348_sub27.anInt6894 == 0 && class348_sub27.anInt6905 >= 1 && class348_sub27.anInt6896 >= 1 && (class348_sub27.anInt6905 <= -2 + Class367_Sub4.anInt7319) && (class348_sub27.anInt6896 <= -2 + RangeThresholdTextureNode.anInt9109) && (class348_sub27.anInt6907 < 0 || (method195(class348_sub27.anInt6895, false, class348_sub27.anInt6907)))) {
                        MapSceneIconDef.method1591(class348_sub27.anInt6905, 70, class348_sub27.anInt6904, -1, class348_sub27.anInt6907, class348_sub27.anInt6895, class348_sub27.anInt6896, class348_sub27.anInt6900, class348_sub27.anInt6899)
                        class348_sub27.anInt6894 = -1
                        if ((class348_sub27.anInt6907 != class348_sub27.anInt6902) || class348_sub27.anInt6902 != -1) {
                            if ((class348_sub27.anInt6907 == class348_sub27.anInt6902) && (class348_sub27.anInt6892 == class348_sub27.anInt6900) && (class348_sub27.anInt6895 == (class348_sub27.anInt6903))) class348_sub27.method2715(75.toByte())
                        } else class348_sub27.method2715(86.toByte())
                    }
                } else if (class348_sub27.anInt6902 < 0 || (method195(class348_sub27.anInt6903, false, class348_sub27.anInt6902))) {
                    MapSceneIconDef.method1591(class348_sub27.anInt6905, 112, class348_sub27.anInt6904, -1, class348_sub27.anInt6902, class348_sub27.anInt6903, class348_sub27.anInt6896, class348_sub27.anInt6892, class348_sub27.anInt6899)
                    class348_sub27.method2715(49.toByte())
                }
                class348_sub27 = SpriteRenderEntry.aNodeDeque_9711!!.method1990(81.toByte()) as? MultiFieldRecord?
            }
        }

        private var HISTORY_INDEX = -1

        @JvmStatic
        fun method363(i: Int) {
            if (HeapDiagnosticsHolder.anInt2254 < 102) HeapDiagnosticsHolder.anInt2254 += 6
            anInt512++
            if (MinimapFlagRenderer.anInt1794 != -1 && (CubemapTexture2dSource.aLong8694 < GameClock.method599(-127))) {
                for (i_4_ in MinimapFlagRenderer.anInt1794..<MinimapSquareDrawer.aStringArray5223!!.size) {
                    if (MinimapSquareDrawer.aStringArray5223!![i_4_]!!.startsWith("pause")) {
                        var i_5_ = 5
                        try {
                            i_5_ = MinimapSquareDrawer.aStringArray5223!![i_4_]!!.substring(6).toInt()
                        } catch (exception: Exception) {
                            /* empty */
                        }
                        method94("Pausing for " + i_5_ + " seconds...", 58)
                        MinimapFlagRenderer.anInt1794 = 1 + i_4_
                        CubemapTexture2dSource.aLong8694 = (1000 * i_5_).toLong() + GameClock.method599(-97)
                        return
                    } else {
                        MapElementManager.aString4461 = MinimapSquareDrawer.aStringArray5223!![i_4_]
                        GrayscaleNoiseTexture.method555(false, 0)
                    }
                }
                MinimapFlagRenderer.anInt1794 = -1
            }
            if (Class98.anInt1565 != 0) {
                ViewportTransform.anInt3676 -= Class98.anInt1565 * 5
                if (ViewportTransform.anInt3676 >= WorldMapTextLabel.anInt8587) ViewportTransform.anInt3676 = -1 + WorldMapTextLabel.anInt8587
                Class98.anInt1565 = 0
                if (ViewportTransform.anInt3676 < 0) ViewportTransform.anInt3676 = 0
            }
            if (i >= 124) {
                var i_6_ = 0
                while ((MinimapAreaMarkerNode.anInt9699 > i_6_)) {
                    val interface6 = ProceduralTextureGraph.anInterface6Array9534!![i_6_]!!
                    val i_7_ = interface6.method30(false)
                    val c = interface6.method28(46.toByte())
                    val i_8_ = interface6.method26(-7616)
                    if (i_7_ == 98) {
                        for (index in HISTORY_INDEX..<ArbFogMaterialPass.aStringArray6200!!.size) {
                            if (index == -1) {
                                continue
                            }
                            val line = ArbFogMaterialPass.aStringArray6200!![index]
                            if (line!!.isEmpty()) {
                                continue
                            }
                            val parts: Array<String?> = line.split(": ".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
                            if (parts.size == 2 && parts[1]!!.startsWith("-->")) {
                                if (index > HISTORY_INDEX) {
                                    HISTORY_INDEX = index
                                    MapElementManager.aString4461 = parts[1]!!.substring(4)
                                    TerrainShadowBuilderGl3.anInt7006 = MapElementManager.aString4461!!.length
                                    break
                                }
                            }
                        }
                    } else if (i_7_ == 99) {
                        var found = false
                        for (index in HISTORY_INDEX - 1 downTo 0) {
                            val line = ArbFogMaterialPass.aStringArray6200!![index]
                            if (line!!.isEmpty()) {
                                continue
                            }
                            val parts: Array<String?> = line.split(": ".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
                            if (parts.size == 2 && parts[1]!!.startsWith("-->")) {
                                HISTORY_INDEX = index
                                MapElementManager.aString4461 = parts[1]!!.substring(4)
                                TerrainShadowBuilderGl3.anInt7006 = MapElementManager.aString4461!!.length
                                found = true
                                break
                            }
                        }
                        if (!found) {
                            MapElementManager.aString4461 = ""
                            TerrainShadowBuilderGl3.anInt7006 = 0
                        }
                    } else if (i_7_ == 84) {
                        GrayscaleNoiseTexture.method555(false, 0)
                        HISTORY_INDEX = -1
                    } else if (i_7_ != 80) {
                        if (i_7_ == 66 && (0x4 and i_8_) != 0) {
                            if (BlendTextureNode.aClipboard9357 != null) {
                                var string = ""
                                for (i_9_ in -1 + (ArbFogMaterialPass.aStringArray6200)!!.size downTo 0) {
                                    if ((ArbFogMaterialPass.aStringArray6200!![i_9_] != null) && ArbFogMaterialPass.aStringArray6200!![i_9_]!!.length > 0) string += (ArbFogMaterialPass.aStringArray6200!![i_9_]) + '\n'
                                }
                                BlendTextureNode.aClipboard9357!!.setContents(StringSelection(string), null)
                            }
                        } else if (i_7_ != 67 || (0x4 and i_8_) == 0) {
                            if (i_7_ != 85 || TerrainShadowBuilderGl3.anInt7006 <= 0) {
                                if (i_7_ == 101 && (TerrainShadowBuilderGl3.anInt7006 < MapElementManager.aString4461!!.length)) {
                                    if ((0x4 and i_8_) == 0) {
                                        MapElementManager.aString4461 = ((MapElementManager.aString4461!!.substring(0, TerrainShadowBuilderGl3.anInt7006)) + (MapElementManager.aString4461!!.substring(TerrainShadowBuilderGl3.anInt7006 - -1)))
                                    } else {
                                        var index = MapElementManager.aString4461!!.indexOf(' ', TerrainShadowBuilderGl3.anInt7006 + 1)
                                        if (index == -1) {
                                            index = MapElementManager.aString4461!!.length
                                        }
                                        MapElementManager.aString4461 = MapElementManager.aString4461!!.substring(0, TerrainShadowBuilderGl3.anInt7006) + MapElementManager.aString4461!!.substring(index)
                                    }
                                } else if (i_7_ != 96 || TerrainShadowBuilderGl3.anInt7006 <= 0) {
                                    if (i_7_ == 97 && (MapElementManager.aString4461!!.length > TerrainShadowBuilderGl3.anInt7006)) {
                                        if ((0x4 and i_8_) == 0) {
                                            TerrainShadowBuilderGl3.anInt7006++
                                        } else {
                                            val result = MapElementManager.aString4461!!.indexOf(' ', min(TerrainShadowBuilderGl3.anInt7006 + 1, MapElementManager.aString4461!!.length - 1))
                                            TerrainShadowBuilderGl3.anInt7006 = if (result == -1) MapElementManager.aString4461!!.length else result + 1
                                        }
                                    } else if (i_7_ == 102) TerrainShadowBuilderGl3.anInt7006 = 0
                                    else if (i_7_ == 103) TerrainShadowBuilderGl3.anInt7006 = MapElementManager.aString4461!!.length
                                    else if (i_7_ != 104 || (WalkingTypeUtil.anInt3312 >= (ArbFogMaterialPass.aStringArray6200)!!.size)) {
                                        if (i_7_ == 105 && WalkingTypeUtil.anInt3312 > 0) {
                                            WalkingTypeUtil.anInt3312--
                                            method159(-615751774)
                                            TerrainShadowBuilderGl3.anInt7006 = MapElementManager.aString4461!!.length
                                        } else if (Npc.method2446(c, 105.toByte()) || c.code == 92 || c.code == 47 || c.code == 46 || c.code == 58 || c.code == 44 || c.code == 32 || c.code == 95 || c.code == 45 || c.code == 43 || c.code == 91 || c.code == 93) {
                                            MapElementManager.aString4461 = ((MapElementManager.aString4461!!.substring(0, TerrainShadowBuilderGl3.anInt7006)) + ProceduralTextureGraph.anInterface6Array9534!![i_6_]!!.method28(23.toByte()) + (MapElementManager.aString4461!!.substring(TerrainShadowBuilderGl3.anInt7006)))
                                            TerrainShadowBuilderGl3.anInt7006++
                                        }
                                    } else {
                                        WalkingTypeUtil.anInt3312++
                                        method159(-615751774)
                                        TerrainShadowBuilderGl3.anInt7006 = MapElementManager.aString4461!!.length
                                    }
                                } else {
                                    if ((0x4 and i_8_) == 0) {
                                        TerrainShadowBuilderGl3.anInt7006--
                                    } else {
                                        TerrainShadowBuilderGl3.anInt7006 = max(MapElementManager.aString4461!!.lastIndexOf(' ', TerrainShadowBuilderGl3.anInt7006 - 2) + 1, 0)
                                    }
                                }
                            } else {
                                if ((0x4 and i_8_) == 0) {
                                    MapElementManager.aString4461 = ((MapElementManager.aString4461!!.substring(0, TerrainShadowBuilderGl3.anInt7006 - 1)) + MapElementManager.aString4461!!.substring(TerrainShadowBuilderGl3.anInt7006))
                                    TerrainShadowBuilderGl3.anInt7006--
                                } else {
                                    var index = MapElementManager.aString4461!!.trim { it <= ' ' }.lastIndexOf(' ', TerrainShadowBuilderGl3.anInt7006)
                                    index++
                                    MapElementManager.aString4461 = MapElementManager.aString4461!!.substring(0, index)
                                    TerrainShadowBuilderGl3.anInt7006 = index
                                }
                            }
                        } else if (BlendTextureNode.aClipboard9357 != null) {
                            val transferable = BlendTextureNode.aClipboard9357!!.getContents(null)
                            if (transferable != null) {
                                try {
                                    val string = (transferable.getTransferData(DataFlavor.stringFlavor)) as String
                                    if (string != null) {
                                        val strings = method3113('\n', true, string)
                                        ChatScriptListNode.method3189(0, strings)
                                    }
                                } catch (exception: Exception) {
                                    /* empty */
                                }
                            }
                        }
                    } else GrayscaleNoiseTexture.method555(true, 0)
                    i_6_++
                }
                MinimapAreaMarkerNode.anInt9699 = 0
                CameraConfigDefinition.anInt3246 = 0
                TextureCache.method3466(89)
            }
        }

        @JvmStatic
        fun method365(class318_sub1: SceneEntity, class348_sub1s: Array<AbstractTileShape?>?) {
            if (ProjectedGroundDecor.aBoolean10221) {
                val i = class318_sub1.method2384(class348_sub1s, 49)
                Class9.aRenderer171!!.method3642(i, class348_sub1s)
            }
            if (SoundCacheState.aTerrainTileArray4142 == NativeSprite.aTerrainTileArray5191) {
                val bool = false
                val bool_11_ = false
                val i: Int
                val i_12_: Int
                if (class318_sub1 is GroundDecorEntity) {
                    i = (class318_sub1.aShort8743).toInt()
                    i_12_ = class318_sub1.aShort8750.toInt()
                } else {
                    i = (class318_sub1.x shr Tooltip.anInt4459)
                    i_12_ = (class318_sub1.y shr Tooltip.anInt4459)
                }
                Class9.aRenderer171!!.EA((TerrainTileShape.aTerrainTileArray8801!![0]!!.method3986(class318_sub1.x, class318_sub1.y, (-118).toByte())), method3547(i, i_12_), method2483(i, i_12_), LoadingScreenState.method1457(i, i_12_))
            }
            val class318_sub4 = class318_sub1.method2386(1, Class9.aRenderer171)
            if (class318_sub4 != null) {
                if (class318_sub1.aBoolean6391) {
                    val class318_sub3s = class318_sub4.aClass318_Sub3Array6414!!
                    for (i in class318_sub3s.indices) {
                        val class318_sub3 = class318_sub3s[i]!!
                        if (class318_sub3.aBoolean6401) MapTileShape.method2663(-5590, (class318_sub3.anInt6405 - class318_sub3.anInt6403), (class318_sub3.anInt6406 + class318_sub3.anInt6403), (class318_sub3.anInt6402 - class318_sub3.anInt6403), (class318_sub3.anInt6404 + class318_sub3.anInt6403))
                    }
                }
                if (class318_sub4.aBoolean6409) {
                    class318_sub4.aClass318_Sub1_6410 = class318_sub1
                    if (VoronoiNoiseTextureNode.aBoolean9121) {
                        synchronized(PlayerSequenceSelector.aSceneObjectSpawner_1208!!) {
                            PlayerSequenceSelector.aSceneObjectSpawner_1208!!.method774(class318_sub4, 18802)
                        }
                    } else PlayerSequenceSelector.aSceneObjectSpawner_1208!!.method774(class318_sub4, 18802)
                } else ScrollingNoiseTexture.method560(class318_sub4, 18)
            }
        }
    }
}
