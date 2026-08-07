import LocTypeDefLoader.Companion.method1406
import WaterDetailOptionState.Companion.method1779
import ConfigFlagUtilStatics.method1916
import TextureCubeProviderStatics.method2269
import ProjectedGroundDecor.Companion.method2433
import RingBufferInputStream.Companion.method3616
import MinimapTriangleDrawer.Companion.method464
import ChatCommandProcessor.method705
import kotlin.math.max

/* Class341 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class TileRenderState {
    override fun toString(): String {
        anInt4227++
        throw IllegalStateException()
    }

    fun method2679(i: Int, i_7_: Int, i_8_: Int): Int {
        anInt4232++
        if (i_8_ != 1595) return 38
        val i_9_ = (max(GameDisplayManager.anInt10432, i))
        if (PerlinTextureProvider.aTileRenderState_5808 == this) return 0
        if (this == WorldMapSceneSoftware.aTileRenderState_5821) return i_9_ - i_7_
        if (ProjectileConfigUtil.aTileRenderState_399 == this) return (i_9_ - i_7_) / 2
        return 0
    }

    companion object {
        var anInt4227: Int = 0

        var anInt4228: Int = 0
        var anInt4229: Int = 0
        var anInt4230: Int = 0
        var anInt4231: Int = 0
        var anInt4232: Int = 0
        var anIntArrayArray4233: Array<IntArray?>? = arrayOfNulls<IntArray>(6)
        var aAbstractModelRendererArray4234: Array<AbstractModelRenderer?>? = null

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
            ColourAdjustment.anInt859 = -1
            DebugOverlayRenderer.anInt3170 = -(MapRegionLoaderStatics.anInt1267 * i_3_ / i_5_) + MapRegionLoaderStatics.anInt1267
            WidgetActionEntry.anInt6992 = MapRegionLoaderStatics.anInt1259 * i_1_ / i_4_
            TextureMetadataProvider.anInt4609 = -1
            val i_6_ = 50 / ((-12 - i_2_) / 40)
            MenuActionNode.method2811(false)
        }

        @JvmStatic
        fun method2677(i: Int) {
            anIntArrayArray4233 = null
            ImageFrameCache.aClass348_Sub24_4226 = null
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
                val class46 = NpcReference.method2957(NativeLibraryState.anInt169, (-54).toByte(), OrientationRotator.anInt2046)
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

        var anInt542: Int = 0

        @JvmStatic
        fun method369(i: Int) {
            TimedRecordAccessorStatics.aAbstractModelRendererArray7107 = null
            CameraDistanceOptionState.aAbstractModelRendererArray5857 = null
            BoundingBoxNode.aAbstractModelRendererArray6742 = null
            WorldMapRenderer.aAbstractModelRendererArray4679 = null
            NpcType.aAbstractModelRenderer_1365 = null
            SpriteStore.aAbstractModelRendererArray367 = null
            CustomCursorsOptionState.aAbstractModelRendererArray5933 = null
            ScriptResources.aAbstractModelRendererArray2640 = null
            BoxBlurTextureNode.aAbstractModelRendererArray9467 = null
            NodeDequeStatics.aRSFont_3326 = null
            SceneryDetailOptionState.aAbstractModelRenderer_6097 = null
            GameAppletFrame.aRSFont_20 = null
            WorldMapRenderer.aRSFont_4684 = null
            HostPingThread.aAbstractModelRendererArray2260 = null
            CameraNodeListStatics.aAbstractModelRendererArray1744 = null
            CompassSmoother.aAbstractModelRendererArray3378 = null
            GrayscaleNoiseTexture.aAbstractModelRendererArray5294 = null
            WallSceneEntity.aAbstractModelRendererArray9959 = null
            anInt542++
        }


        fun method2681(i: Int) {
            if (i == 9864) {
                anInt4230++
                if (FacingDirectionNodeStatics.aRenderer6654 != null) {
                    if (GrayscaleNoiseTexture.aBoolean5300) method1406(true)
                    PlayerSequenceSelector.aSceneObjectSpawner_1208!!.method775(69.toByte())
                    method2433()
                    method464(i + -9865)
                    LocalizedTextStatics.method2061(-127)
                    MapElementManager.method3513(-113)
                    method1779(124.toByte())
                    if (KeyboardLayoutCache.aParticleSystemRenderer_3304 != null) KeyboardLayoutCache.aParticleSystemRenderer_3304!!.method2295(96.toByte())
                    method2269(true)
                    InterfaceBounds.method2938(127.toByte())
                    method369(-29776)
                    method3616(12639)
                    LoadingScreenImageNodeStatics.method3177(-78, false)
                    for (i_12_ in 0..2047) {
                        val player = (LoadingBarRenderer.aPlayerArray5058!![i_12_])
                        if (player != null) {
                            var i_13_ = 0
                            while (((player.aAbstractModelArray10323).size > i_13_)) {
                                player.aAbstractModelArray10323[i_13_] = null
                                i_13_++
                            }
                        }
                    }
                    for (i_14_ in 0..<TerrainShadowBuilderGl2.anInt6930) {
                        val npc = (TurbulenceTextureNode.aClass348_Sub22Array9319!![i_14_]!!.aNpc_6859)
                        if (npc != null) {
                            for (i_15_ in (npc.aAbstractModelArray10323).indices) npc.aAbstractModelArray10323[i_15_] = null
                        }
                    }
                    MinimapSquareDrawer.aAbstractCameraTransform_5209 = null
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
}
