import GameAppletFrameStatics.method94
import WallEntityStatics.method2483
import TurbulenceTextureNodeStatics.method3113
import FixedFunctionWaterPassStatics.method3547
import SolidFillComponentStatics.method195
import SpriteStatics.method159
import java.awt.datatransfer.DataFlavor
import java.awt.datatransfer.StringSelection
import kotlin.math.max
import kotlin.math.min

object WidgetTextConfigStatics {
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
                val class227s = SceneNodeDequeStatics.method841(i + -70)
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
                var class348_sub27 = (SpriteRenderEntryStatics.aNodeDeque_9711!!.method1995(4) as? MultiFieldRecord?)
                val i_3_ = -45 % ((i - -34) / 47)
                while ( /**/class348_sub27 != null) {
                    if (class348_sub27.anInt6893 > 0) class348_sub27.anInt6893--
                    if (class348_sub27.anInt6893 != 0) {
                        if (class348_sub27.anInt6894 > 0) class348_sub27.anInt6894--
                        if (class348_sub27.anInt6894 == 0 && class348_sub27.anInt6905 >= 1 && class348_sub27.anInt6896 >= 1 && (class348_sub27.anInt6905 <= -2 + GlCubemapLightPassStatics.anInt7319) && (class348_sub27.anInt6896 <= -2 + RangeThresholdTextureNodeStatics.anInt9109) && (class348_sub27.anInt6907 < 0 || (method195(class348_sub27.anInt6895, false, class348_sub27.anInt6907)))) {
                            MapSceneIconDefStatics.method1591(class348_sub27.anInt6905, 70, class348_sub27.anInt6904, -1, class348_sub27.anInt6907, class348_sub27.anInt6895, class348_sub27.anInt6896, class348_sub27.anInt6900, class348_sub27.anInt6899)
                            class348_sub27.anInt6894 = -1
                            if ((class348_sub27.anInt6907 != class348_sub27.anInt6902) || class348_sub27.anInt6902 != -1) {
                                if ((class348_sub27.anInt6907 == class348_sub27.anInt6902) && (class348_sub27.anInt6892 == class348_sub27.anInt6900) && (class348_sub27.anInt6895 == (class348_sub27.anInt6903))) class348_sub27.method2715(75.toByte())
                            } else class348_sub27.method2715(86.toByte())
                        }
                    } else if (class348_sub27.anInt6902 < 0 || (method195(class348_sub27.anInt6903, false, class348_sub27.anInt6902))) {
                        MapSceneIconDefStatics.method1591(class348_sub27.anInt6905, 112, class348_sub27.anInt6904, -1, class348_sub27.anInt6902, class348_sub27.anInt6903, class348_sub27.anInt6896, class348_sub27.anInt6892, class348_sub27.anInt6899)
                        class348_sub27.method2715(49.toByte())
                    }
                    class348_sub27 = SpriteRenderEntryStatics.aNodeDeque_9711!!.method1990(81.toByte()) as? MultiFieldRecord?
                }
            }
    
            private var HISTORY_INDEX = -1
    
            @JvmStatic
            fun method363(i: Int) {
                if (HeapDiagnosticsHolder.anInt2254 < 102) HeapDiagnosticsHolder.anInt2254 += 6
                anInt512++
                if (MinimapFlagRenderer.anInt1794 != -1 && (CubemapTexture2dSourceStatics.aLong8694 < GameClock.method599(-127))) {
                    for (i_4_ in MinimapFlagRenderer.anInt1794..<MinimapSquareDrawerStatics.aStringArray5223!!.size) {
                        if (MinimapSquareDrawerStatics.aStringArray5223!![i_4_]!!.startsWith("pause")) {
                            var i_5_ = 5
                            try {
                                i_5_ = MinimapSquareDrawerStatics.aStringArray5223!![i_4_]!!.substring(6).toInt()
                            } catch (exception: Exception) {
                                /* empty */
                            }
                            method94("Pausing for " + i_5_ + " seconds...", 58)
                            MinimapFlagRenderer.anInt1794 = 1 + i_4_
                            CubemapTexture2dSourceStatics.aLong8694 = (1000 * i_5_).toLong() + GameClock.method599(-97)
                            return
                        } else {
                            MapElementManager.aString4461 = MinimapSquareDrawerStatics.aStringArray5223!![i_4_]
                            GrayscaleNoiseTextureStatics.method555(false, 0)
                        }
                    }
                    MinimapFlagRenderer.anInt1794 = -1
                }
                if (NodeDequeHolderStatics.anInt1565 != 0) {
                    ViewportTransformStatics.anInt3676 -= NodeDequeHolderStatics.anInt1565 * 5
                    if (ViewportTransformStatics.anInt3676 >= WorldMapTextLabelStatics.anInt8587) ViewportTransformStatics.anInt3676 = -1 + WorldMapTextLabelStatics.anInt8587
                    NodeDequeHolderStatics.anInt1565 = 0
                    if (ViewportTransformStatics.anInt3676 < 0) ViewportTransformStatics.anInt3676 = 0
                }
                if (i >= 124) {
                    var i_6_ = 0
                    while ((MinimapAreaMarkerNodeStatics.anInt9699 > i_6_)) {
                        val interface6 = ProceduralTextureGraphStatics.anCharStreamReaderArray9534s!![i_6_]!!
                        val i_7_ = interface6.method30(false)
                        val c = interface6.method28(46.toByte())
                        val i_8_ = interface6.method26(-7616)
                        if (i_7_ == 98) {
                            for (index in HISTORY_INDEX..<ArbFogMaterialPassStatics.aStringArray6200!!.size) {
                                if (index == -1) {
                                    continue
                                }
                                val line = ArbFogMaterialPassStatics.aStringArray6200!![index]
                                if (line!!.isEmpty()) {
                                    continue
                                }
                                val parts: Array<String?> = line.split(": ".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
                                if (parts.size == 2 && parts[1]!!.startsWith("-->")) {
                                    if (index > HISTORY_INDEX) {
                                        HISTORY_INDEX = index
                                        MapElementManager.aString4461 = parts[1]!!.substring(4)
                                        TerrainShadowBuilderGl3Statics.anInt7006 = MapElementManager.aString4461!!.length
                                        break
                                    }
                                }
                            }
                        } else if (i_7_ == 99) {
                            var found = false
                            for (index in HISTORY_INDEX - 1 downTo 0) {
                                val line = ArbFogMaterialPassStatics.aStringArray6200!![index]
                                if (line!!.isEmpty()) {
                                    continue
                                }
                                val parts: Array<String?> = line.split(": ".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
                                if (parts.size == 2 && parts[1]!!.startsWith("-->")) {
                                    HISTORY_INDEX = index
                                    MapElementManager.aString4461 = parts[1]!!.substring(4)
                                    TerrainShadowBuilderGl3Statics.anInt7006 = MapElementManager.aString4461!!.length
                                    found = true
                                    break
                                }
                            }
                            if (!found) {
                                MapElementManager.aString4461 = ""
                                TerrainShadowBuilderGl3Statics.anInt7006 = 0
                            }
                        } else if (i_7_ == 84) {
                            GrayscaleNoiseTextureStatics.method555(false, 0)
                            HISTORY_INDEX = -1
                        } else if (i_7_ != 80) {
                            if (i_7_ == 66 && (0x4 and i_8_) != 0) {
                                if (BlendTextureNodeStatics.aClipboard9357 != null) {
                                    var string = ""
                                    for (i_9_ in -1 + (ArbFogMaterialPassStatics.aStringArray6200)!!.size downTo 0) {
                                        if ((ArbFogMaterialPassStatics.aStringArray6200!![i_9_] != null) && ArbFogMaterialPassStatics.aStringArray6200!![i_9_]!!.length > 0) string += (ArbFogMaterialPassStatics.aStringArray6200!![i_9_]) + '\n'
                                    }
                                    BlendTextureNodeStatics.aClipboard9357!!.setContents(StringSelection(string), null)
                                }
                            } else if (i_7_ != 67 || (0x4 and i_8_) == 0) {
                                if (i_7_ != 85 || TerrainShadowBuilderGl3Statics.anInt7006 <= 0) {
                                    if (i_7_ == 101 && (TerrainShadowBuilderGl3Statics.anInt7006 < MapElementManager.aString4461!!.length)) {
                                        if ((0x4 and i_8_) == 0) {
                                            MapElementManager.aString4461 = ((MapElementManager.aString4461!!.substring(0, TerrainShadowBuilderGl3Statics.anInt7006)) + (MapElementManager.aString4461!!.substring(TerrainShadowBuilderGl3Statics.anInt7006 - -1)))
                                        } else {
                                            var index = MapElementManager.aString4461!!.indexOf(' ', TerrainShadowBuilderGl3Statics.anInt7006 + 1)
                                            if (index == -1) {
                                                index = MapElementManager.aString4461!!.length
                                            }
                                            MapElementManager.aString4461 = MapElementManager.aString4461!!.substring(0, TerrainShadowBuilderGl3Statics.anInt7006) + MapElementManager.aString4461!!.substring(index)
                                        }
                                    } else if (i_7_ != 96 || TerrainShadowBuilderGl3Statics.anInt7006 <= 0) {
                                        if (i_7_ == 97 && (MapElementManager.aString4461!!.length > TerrainShadowBuilderGl3Statics.anInt7006)) {
                                            if ((0x4 and i_8_) == 0) {
                                                TerrainShadowBuilderGl3Statics.anInt7006++
                                            } else {
                                                val result = MapElementManager.aString4461!!.indexOf(' ', min(TerrainShadowBuilderGl3Statics.anInt7006 + 1, MapElementManager.aString4461!!.length - 1))
                                                TerrainShadowBuilderGl3Statics.anInt7006 = if (result == -1) MapElementManager.aString4461!!.length else result + 1
                                            }
                                        } else if (i_7_ == 102) TerrainShadowBuilderGl3Statics.anInt7006 = 0
                                        else if (i_7_ == 103) TerrainShadowBuilderGl3Statics.anInt7006 = MapElementManager.aString4461!!.length
                                        else if (i_7_ != 104 || (WalkingTypeUtil.anInt3312 >= (ArbFogMaterialPassStatics.aStringArray6200)!!.size)) {
                                            if (i_7_ == 105 && WalkingTypeUtil.anInt3312 > 0) {
                                                WalkingTypeUtil.anInt3312--
                                                method159(-615751774)
                                                TerrainShadowBuilderGl3Statics.anInt7006 = MapElementManager.aString4461!!.length
                                            } else if (NpcStatics.method2446(c, 105.toByte()) || c.code == 92 || c.code == 47 || c.code == 46 || c.code == 58 || c.code == 44 || c.code == 32 || c.code == 95 || c.code == 45 || c.code == 43 || c.code == 91 || c.code == 93) {
                                                MapElementManager.aString4461 = ((MapElementManager.aString4461!!.substring(0, TerrainShadowBuilderGl3Statics.anInt7006)) + ProceduralTextureGraphStatics.anCharStreamReaderArray9534s!![i_6_]!!.method28(23.toByte()) + (MapElementManager.aString4461!!.substring(TerrainShadowBuilderGl3Statics.anInt7006)))
                                                TerrainShadowBuilderGl3Statics.anInt7006++
                                            }
                                        } else {
                                            WalkingTypeUtil.anInt3312++
                                            method159(-615751774)
                                            TerrainShadowBuilderGl3Statics.anInt7006 = MapElementManager.aString4461!!.length
                                        }
                                    } else {
                                        if ((0x4 and i_8_) == 0) {
                                            TerrainShadowBuilderGl3Statics.anInt7006--
                                        } else {
                                            TerrainShadowBuilderGl3Statics.anInt7006 = max(MapElementManager.aString4461!!.lastIndexOf(' ', TerrainShadowBuilderGl3Statics.anInt7006 - 2) + 1, 0)
                                        }
                                    }
                                } else {
                                    if ((0x4 and i_8_) == 0) {
                                        MapElementManager.aString4461 = ((MapElementManager.aString4461!!.substring(0, TerrainShadowBuilderGl3Statics.anInt7006 - 1)) + MapElementManager.aString4461!!.substring(TerrainShadowBuilderGl3Statics.anInt7006))
                                        TerrainShadowBuilderGl3Statics.anInt7006--
                                    } else {
                                        var index = MapElementManager.aString4461!!.trim { it <= ' ' }.lastIndexOf(' ', TerrainShadowBuilderGl3Statics.anInt7006)
                                        index++
                                        MapElementManager.aString4461 = MapElementManager.aString4461!!.substring(0, index)
                                        TerrainShadowBuilderGl3Statics.anInt7006 = index
                                    }
                                }
                            } else if (BlendTextureNodeStatics.aClipboard9357 != null) {
                                val transferable = BlendTextureNodeStatics.aClipboard9357!!.getContents(null)
                                if (transferable != null) {
                                    try {
                                        val string = (transferable.getTransferData(DataFlavor.stringFlavor)) as String
                                        if (string != null) {
                                            val strings = method3113('\n', true, string)
                                            ChatScriptListNodeStatics.method3189(0, strings)
                                        }
                                    } catch (exception: Exception) {
                                        /* empty */
                                    }
                                }
                            }
                        } else GrayscaleNoiseTextureStatics.method555(true, 0)
                        i_6_++
                    }
                    MinimapAreaMarkerNodeStatics.anInt9699 = 0
                    CameraConfigDefinitionStatics.anInt3246 = 0
                    TextureCacheStatics.method3466(89)
                }
            }
    
            @JvmStatic
            fun method365(class318_sub1: SceneEntity, class348_sub1s: Array<AbstractTileShape?>?) {
                if (ProjectedGroundDecorStatics.aBoolean10221) {
                    val i = class318_sub1.method2384(class348_sub1s, 49)
                    NativeLibraryState.aRenderer171!!.method3642(i, class348_sub1s)
                }
                if (SoundCacheState.aTerrainTileArray4142 == NativeSpriteStatics.aTerrainTileArray5191) {
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
                    NativeLibraryState.aRenderer171!!.EA((TerrainTileShapeStatics.aTerrainTileArray8801!![0]!!.method3986(class318_sub1.x, class318_sub1.y, (-118).toByte())), method3547(i, i_12_), method2483(i, i_12_), LoadingScreenStateStatics.method1457(i, i_12_))
                }
                val class318_sub4 = class318_sub1.method2386(1, NativeLibraryState.aRenderer171)
                if (class318_sub4 != null) {
                    if (class318_sub1.aBoolean6391) {
                        val class318_sub3s = class318_sub4.aClass318_Sub3Array6414!!
                        for (i in class318_sub3s.indices) {
                            val class318_sub3 = class318_sub3s[i]!!
                            if (class318_sub3.aBoolean6401) MapTileShapeStatics.method2663(-5590, (class318_sub3.anInt6405 - class318_sub3.anInt6403), (class318_sub3.anInt6406 + class318_sub3.anInt6403), (class318_sub3.anInt6402 - class318_sub3.anInt6403), (class318_sub3.anInt6404 + class318_sub3.anInt6403))
                        }
                    }
                    if (class318_sub4.aBoolean6409) {
                        class318_sub4.aClass318_Sub1_6410 = class318_sub1
                        if (VoronoiNoiseTextureNodeStatics.aBoolean9121) {
                            synchronized(PlayerSequenceSelector.aSceneObjectSpawner_1208!!) {
                                PlayerSequenceSelector.aSceneObjectSpawner_1208!!.method774(class318_sub4, 18802)
                            }
                        } else PlayerSequenceSelector.aSceneObjectSpawner_1208!!.method774(class318_sub4, 18802)
                    } else ScrollingNoiseTextureStatics.method560(class318_sub4, 18)
                }
            }
}
