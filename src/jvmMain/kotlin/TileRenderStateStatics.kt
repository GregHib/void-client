import LocTypeDefLoaderStatics.method1406
import WaterDetailOptionStateStatics.method1779
import ConfigFlagUtilStatics.method1916
import LocalizedTextStatics.method2061
import TextureCubeProviderStatics.method2269
import ProjectedGroundDecorStatics.method2433
import RingBufferInputStreamStatics.method3616
import Bzip2DecoderStateStatics.method369
import MinimapTriangleDrawerStatics.method464
import ChatCommandProcessor.method705
import kotlin.math.max

object TileRenderStateStatics {
    var aClass348_Sub24_4226: ClientGameLoopNode? = ClientGameLoopNode(0, 0)
            var anInt4227: Int = 0
            @JvmField
            var anInt4228: Int = 0
            var anInt4229: Int = 0
            var anInt4230: Int = 0
            var anInt4231: Int = 0
            var anInt4232: Int = 0
            var anIntArrayArray4233: Array<IntArray?>? = arrayOfNulls<IntArray>(6)
            var aAbstractModelRendererArray4234: Array<AbstractModelRenderer?>? = null
            @JvmField
            var anInt4235: Int
            var aModelDefinitionArray4236s: Array<ModelDefinition?>? = arrayOfNulls<ModelDefinition>(4)
            var anInt4237: Int = 0
    
            @JvmStatic
            fun method2676(i: Int, i_0_: Int, i_1_: Int, i_2_: Byte, i_3_: Int) {
                var i_1_ = i_1_
                var i_3_ = i_3_
                anInt4231++
                val f = MapRegionLoaderStatics.anInt1267.toFloat() / MapRegionLoaderStatics.anInt1259.toFloat()
                var i_4_ = i
                var i_5_ = i_0_
                if (f < 1.0f) i_5_ = (f * i.toFloat()).toInt()
                else i_4_ = (i_0_.toFloat() / f).toInt()
                i_1_ -= (i + -i_4_) / 2
                i_3_ -= (i_0_ + -i_5_) / 2
                ColourAdjustmentStatics.anInt859 = -1
                DebugOverlayRenderer.anInt3170 = -(MapRegionLoaderStatics.anInt1267 * i_3_ / i_5_) + MapRegionLoaderStatics.anInt1267
                WidgetActionEntryStatics.anInt6992 = MapRegionLoaderStatics.anInt1259 * i_1_ / i_4_
                TextureMetadataProviderStatics.anInt4609 = -1
                val i_6_ = 50 / ((-12 - i_2_) / 40)
                MenuActionNodeStatics.method2811(false)
            }
    
            @JvmStatic
            fun method2677(i: Int) {
                anIntArrayArray4233 = null
                aClass348_Sub24_4226 = null
                if (i >= 93) {
                    aAbstractModelRendererArray4234 = null
                    aModelDefinitionArray4236s = null
                }
            }
    
            @JvmStatic
            fun method2678(i: Int) {
                if (i != -2049) anIntArrayArray4233 = null
                anInt4229++
                if (RenderNodeStatics.aBoolean9722) {
                    val class46 = NpcReferenceStatics.method2957(NativeLibraryState.anInt169, (-54).toByte(), OrientationRotator.anInt2046)
                    if (class46 != null && class46.anObjectArray680 != null) {
                        val class348_sub36 = WidgetActionEntry()
                        class348_sub36.aWidgetComponent_6989 = class46
                        class348_sub36.anObjectArray6987 = class46.anObjectArray680
                        method705(class348_sub36)
                    }
                    HeightMapNoise.anInt3829 = -1
                    RenderNodeStatics.aBoolean9722 = false
                    Tooltip.anInt4458 = -1
                    if (class46 != null) method1916(-9343, class46)
                }
            }
    
            fun method2680(string: String, bool: Boolean, string_10_: String, string_11_: String): String {
                var string_11_ = string_11_
                anInt4237++
                var i = string_11_.indexOf(string_10_)
                while (i != -1) {
                    string_11_ = (string_11_.substring(0, i) + string + string_11_.substring(string_10_.length + i))
                    i = string_11_.indexOf(string_10_, string.length + i)
                }
                if (bool != true) method2678(45)
                return string_11_
            }
    
            fun method2681(i: Int) {
                if (i == 9864) {
                    anInt4230++
                    if (FacingDirectionNodeStatics.aRenderer6654 != null) {
                        if (GrayscaleNoiseTextureStatics.aBoolean5300) method1406(true)
                        PlayerSequenceSelector.aSceneObjectSpawner_1208!!.method775(69.toByte())
                        method2433()
                        method464(i + -9865)
                        method2061(-127)
                        MapElementManager.method3513(-113)
                        method1779(124.toByte())
                        if (KeyboardLayoutCacheStatics.aParticleSystemRenderer_3304 != null) KeyboardLayoutCacheStatics.aParticleSystemRenderer_3304!!.method2295(96.toByte())
                        method2269(true)
                        InterfaceBoundsStatics.method2938(127.toByte())
                        method369(-29776)
                        method3616(12639)
                        LoadingScreenImageNodeStatics.method3177(-78, false)
                        for (i_12_ in 0..2047) {
                            val player = (LoadingBarRendererStatics.aPlayerArray5058!![i_12_])
                            if (player != null) {
                                var i_13_ = 0
                                while (((player.aAbstractModelArray10323).size > i_13_)) {
                                    player.aAbstractModelArray10323[i_13_] = null
                                    i_13_++
                                }
                            }
                        }
                        for (i_14_ in 0..<TerrainShadowBuilderGl2Statics.anInt6930) {
                            val npc = (TurbulenceTextureNodeStatics.aClass348_Sub22Array9319!![i_14_]!!.aNpc_6859)
                            if (npc != null) {
                                for (i_15_ in (npc.aAbstractModelArray10323).indices) npc.aAbstractModelArray10323[i_15_] = null
                            }
                        }
                        MinimapSquareDrawerStatics.aAbstractCameraTransform_5209 = null
                        SettingsCrcWriter.aAbstractCameraTransform_2123 = null
                        FacingDirectionNodeStatics.aRenderer6654!!.method3635(64.toByte())
                        FacingDirectionNodeStatics.aRenderer6654 = null
                    }
                }
            }
    
            init {
                anInt4235 = 0
            }
}
