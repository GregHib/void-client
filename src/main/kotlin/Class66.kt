import GameAppletFrame.Companion.method94
import ParticleEmitterNode.Companion.method217
import SceneRegionState.method222
import ModelBatchBase.Companion.method1129
import GlVertexBufferBase.Companion.method1148
import GlCubeMapTexture.Companion.method243
import GlCubeMapTexture.Companion.method244
import SceneTilePlaneManager.method259
import SceneTilePlaneManager.method262
import ModelOrSpriteHolder.Companion.method170
import BooleanGraphicsOptionState.Companion.method1719
import WaterDetailOptionState.Companion.method1781
import TextureQualityOptionState.Companion.method1787
import RemoveRoofsOptionState.Companion.method1811
import AntialiasOptionState.Companion.method1819
import TwoStateOptionState.Companion.method1844
import MultiLevelOptionState.Companion.method1851
import SimpleToggleOptionState.Companion.method1742
import BrightnessOptionState.Companion.method1745
import FlickeringEffectsOptionState.Companion.method1754
import ModelDataCache.method298
import ProjectileConfigUtil.method312
import ProjectileConfigUtil.method317
import SocketFactory.Companion.method2051
import WaterMaterialPass.Companion.method2148
import WaterMaterialPass.Companion.method2153
import GlslEnvMaterialPass.Companion.method2162
import ScrollTexMaterialPass.Companion.method2165
import CubeMapMaterialPass.Companion.method2172
import ItemModelDefinition.Companion.method326
import TileSceneEntity.Companion.method2396
import SceneObjectEntity.Companion.method2405
import ActorEntity.Companion.method2478
import WallEntity.Companion.method2487
import Font.Companion.method2570
import MidiSequencePlayer.Companion.method2839
import ParticleTileShape.Companion.method2732
import VorbisOggDecoder.Companion.method2972
import ClientMachineInfo.Companion.method2749
import AbstractProceduralTextureNode.Companion.method3038
import GradientLookupEffect.Companion.method3076
import SpriteRgbTextureNode.Companion.method3093
import HslAdjustTextureNode.Companion.method3128
import TileTextureNode.Companion.method3131
import NormalMapTextureNode.Companion.method3141
import EdgeDetectTextureNode.Companion.method3072
import TimedRecordAccessorB.Companion.method3316
import CharacterRenderState.Companion.method2780
import SoundEngineInitializer.method352
import Class367_Sub10.Companion.method3553
import Class367_Sub2.Companion.method3538
import Class367_Sub4.Companion.method3544
import WorldMapLabel.Companion.method3569
import ColourAdjustment.Companion.method449
import MinimapPolygonDrawer.Companion.method468
import Class55_Sub1.Companion.method524
import Class57.Companion.method529
import Class58.Companion.method532
import Class59.Companion.method544
import Class59_Sub2_Sub2.Companion.method572
import SolidFillComponent.Companion.method197
import SpriteComponent.Companion.method199
import SpriteComponent.Companion.method201
import Class62.method596
import Class62.method599
import Class64.Companion.method606
import Class64_Sub3.Companion.method690
import Sprite.Companion.method160
import TerrainTile.Companion.method3985
import java.awt.datatransfer.DataFlavor
import java.util.*
import kotlin.math.max
import kotlin.math.min
import kotlin.math.pow

object Class66 {
    private var anIntArray1149: IntArray? = IntArray(1000)
    private var aWidgetComponent_1150: WidgetComponent? = null
    private var aMinimapTileEntry_1151: MinimapTileEntry? = null
    private var aStringArray1152: Array<String?>? = arrayOfNulls<String>(1000)
    @JvmField
    var anInt1153: Int = 0
    private var anInt1154 = 0
    private var aStringArray1155: Array<String?>? = null
    @JvmField
    var anInt1156: Int = 0
    @JvmField
    var anInt1157: Int = 0
    @JvmField
    var anInt1158: Int = 0
    @JvmField
    var anInt1159: Int = 0
    private var aCalendar1160: Calendar?
    private var anIntArrayArray1161: Array<IntArray?>? = Array<IntArray?>(5) { IntArray(5000) }
    @JvmField
    var anInt1162: Int = 0
    @JvmField
    var anInt1163: Int = 0
    private var anIntArray1164: IntArray? = null
    @JvmField
    var anInt1165: Int = 0
    @JvmField
    var anInt1166: Int = 0
    @JvmField
    var anInt1167: Int = 0
    private var aScanlineRasterFillerArray1168: Array<ScanlineRasterFiller?>?
    private var aWidgetComponent_1169: WidgetComponent? = null
    private var anInt1170 = 0
    @JvmField
    var anInt1171: Int = 0
    private var anIntArray1172: IntArray? = IntArray(5)
    private var anInt1173 = 0
    @JvmField
    var aClass60_1174: Class60?
    private var anIntArray1175: IntArray?
    private var aStringArray1176: Array<String>?
    private var anInt1177: Int

    @JvmStatic
    fun method701(boundsConstraintEntry: BoundsConstraintEntry, i: Int, i_0_: Int) {
        val class348_sub42_sub19 = ConfigDefinitionLoader.method1223(i, i_0_, 96837648, boundsConstraintEntry)
        if (class348_sub42_sub19 != null) {
            anIntArray1164 = (IntArray(class348_sub42_sub19.anInt9688))
            aStringArray1155 = (arrayOfNulls<String>(class348_sub42_sub19.anInt9689))
            if ((class348_sub42_sub19.aBoundsConstraintEntry_9691 == Class90.aBoundsConstraintEntry_1512) || (class348_sub42_sub19.aBoundsConstraintEntry_9691) == Class59_Sub1_Sub2.aBoundsConstraintEntry_8664 || (class348_sub42_sub19.aBoundsConstraintEntry_9691) == Class77.aBoundsConstraintEntry_1298) {
                var i_1_ = 0
                var i_2_ = 0
                if (HeapDiagnosticsHolder.aWidgetComponent_2249 != null) {
                    i_1_ = HeapDiagnosticsHolder.aWidgetComponent_2249!!.anInt800
                    i_2_ = HeapDiagnosticsHolder.aWidgetComponent_2249!!.anInt750
                }
                anIntArray1164!![0] = GlTexture1D.aInputTracker_8552!!.method3597(true) - i_1_
                anIntArray1164!![1] = (GlTexture1D.aInputTracker_8552!!.method3594(80.toByte()) - i_2_)
            }
            method711(class348_sub42_sub19, 200000)
        }
    }

    private fun method702(i: Int) {
        val class46 = method2570(1512932720, i)
        if (class46 != null) {
            val i_3_ = i ushr 16
            var class46s = WorldMapTextLabel.aWidgetComponentArrayArray8584!![i_3_]
            if (class46s == null) {
                val widgetComponentS_4_: Array<WidgetComponent?> = WarpTextureNode.aWidgetComponentArrayArray9427!![i_3_]!!
                val i_5_ = widgetComponentS_4_.size
                WorldMapTextLabel.aWidgetComponentArrayArray8584!![i_3_] = arrayOfNulls<WidgetComponent>(i_5_)
                class46s = WorldMapTextLabel.aWidgetComponentArrayArray8584!![i_3_]!!
                ArrayCopyUtil.method1575(widgetComponentS_4_, 0, class46s, 0, widgetComponentS_4_.size)
            }
            var i_6_: Int
            i_6_ = 0
            while (i_6_ < class46s!!.size) {
                if (class46s[i_6_] == class46) break
                i_6_++
            }
            if (i_6_ < class46s.size) {
                ArrayCopyUtil.method1575(class46s, 0, class46s, 1, i_6_)
                class46s[0] = class46
            }
        }
    }

    @JvmStatic
    fun method703(i: Int) {
        if (i != -1 && TextureLoaderUtil.method2547(i, 84.toByte())) {
            val widgetComponents: Array<WidgetComponent?> = WarpTextureNode.aWidgetComponentArrayArray9427!![i]!!
            for (i_7_ in widgetComponents.indices) {
                val class46 = widgetComponents[i_7_]!!
                if (class46.anObjectArray815 != null) {
                    val class348_sub36 = WidgetActionEntry()
                    class348_sub36.aWidgetComponent_6989 = class46
                    class348_sub36.anObjectArray6987 = class46.anObjectArray815
                    method712(class348_sub36, 2000000)
                }
            }
        }
    }

    private fun method704(i: Int, bool: Boolean) {
        if (i < 5100) {
            if (i == 5000) {
                anIntArray1149!![anInt1173++] = ShaderProgram.anInt7276
                return
            }
            if (i == 5001) {
                anInt1173 -= 3
                ShaderProgram.anInt7276 = anIntArray1149!![anInt1173]
                Class57.aBoxedIntHolder_1055 = WidgetTextConfig.method360((-57).toByte(), anIntArray1149!![anInt1173 + 1])
                if (Class57.aBoxedIntHolder_1055 == null) Class57.aBoxedIntHolder_1055 = MinimapRenderer.aBoxedIntHolder_1591
                BufferToggleState.anInt3713 = anIntArray1149!![anInt1173 + 2]
                anInt1156++
                val class348_sub47 = method2148(LongKeyNode.aFontMetaRef_6766, (TheoraVideoStream.aClass77_9029), -111)
                class348_sub47.aClass348_Sub49_Sub2_7116!!!!.writeByte(false, ShaderProgram.anInt7276)
                class348_sub47.aClass348_Sub49_Sub2_7116!!!!.writeByte(false, Class57.aBoxedIntHolder_1055!!.anInt2970)
                class348_sub47.aClass348_Sub49_Sub2_7116!!!!.writeByte(false, BufferToggleState.anInt3713)
                InterfaceComponentGroup.method3243(-77, class348_sub47)
                return
            }
            if (i == 5002) {
                anInt1170 -= 2
                val string = aStringArray1152!![anInt1170]!!
                var string_8_ = aStringArray1152!![anInt1170 + 1]
                anInt1173 -= 2
                val i_9_ = anIntArray1149!![anInt1173]
                val i_10_ = anIntArray1149!![anInt1173 + 1]
                if (string_8_ == null) string_8_ = ""
                if (string_8_.length > 80) string_8_ = string_8_.substring(0, 80)
                anInt1157++
                val class348_sub47 = method2148(FontDefinition.aFontMetaRef_1987, (TheoraVideoStream.aClass77_9029), -117)
                class348_sub47.aClass348_Sub49_Sub2_7116!!!!.writeByte(false, (method1745(string, -65) + 2 + method1745(string_8_, -65)))
                class348_sub47.aClass348_Sub49_Sub2_7116!!!!.writeString((-5).toByte(), string)
                class348_sub47.aClass348_Sub49_Sub2_7116!!!!.writeByte(false, i_9_ - 1)
                class348_sub47.aClass348_Sub49_Sub2_7116!!!!.writeByte(false, i_10_)
                class348_sub47.aClass348_Sub49_Sub2_7116!!!!.writeString((-5).toByte(), string_8_)
                InterfaceComponentGroup.method3243(-85, class348_sub47)
                return
            }
            if (i == 5003) {
                val i_11_ = anIntArray1149!![--anInt1173]
                val class147 = method3985(-101, i_11_)
                var string = ""
                if (class147 != null && class147.aString2028 != null) string = class147.aString2028!!
                aStringArray1152!![anInt1170++] = string
                return
            }
            if (i == 5004) {
                val i_12_ = anIntArray1149!![--anInt1173]
                val class147 = method3985(-101, i_12_)
                var i_13_ = -1
                if (class147 != null) i_13_ = class147.anInt2032
                anIntArray1149!![anInt1173++] = i_13_
                return
            }
            if (i == 5005) {
                if (Class57.aBoxedIntHolder_1055 == null) anIntArray1149!![anInt1173++] = -1
                else {
                    anIntArray1149!![anInt1173++] = Class57.aBoxedIntHolder_1055!!.anInt2970
                    return
                }
                return
            }
            if (i == 5006) {
                val i_14_ = anIntArray1149!![--anInt1173]
                val class348_sub47 = method2148(AbstractFrameBufferSurface.aFontMetaRef_6925, (TheoraVideoStream.aClass77_9029), -100)
                class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByte(false, i_14_)
                InterfaceComponentGroup.method3243(-70, class348_sub47)
                return
            }
            if (i == 5008) {
                val string = aStringArray1152!![--anInt1170]!!
                method707(string, i)
                return
            }
            if (i == 5009) {
                anInt1170 -= 2
                val string = aStringArray1152!![anInt1170]
                val string_15_ = aStringArray1152!![anInt1170 + 1]
                if (AsyncTaskHandle.anInt2581 != 0 || ((!RangeThresholdTextureNode.aBoolean9103 || PlayerUpdateDecoder.aBoolean1915) && !MinimapTriangleDrawer.aBoolean5233)) {
                    anInt1159++
                    val class348_sub47 = method2148((CellNoiseTextureNode.aFontMetaRef_9304), (TheoraVideoStream.aClass77_9029), -116)
                    class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByte(false, 0)
                    val i_16_ = (class348_sub47.aClass348_Sub49_Sub2_7116!!.anInt7197)
                    class348_sub47.aClass348_Sub49_Sub2_7116!!.writeString((-5).toByte(), string!!)
                    method3544((class348_sub47.aClass348_Sub49_Sub2_7116!!), -70, string_15_)
                    class348_sub47.aClass348_Sub49_Sub2_7116!!.method3339(109, (class348_sub47.aClass348_Sub49_Sub2_7116!!.anInt7197) - i_16_)
                    InterfaceComponentGroup.method3243(2, class348_sub47)
                    return
                }
                return
            }
            if (i == 5010) {
                val i_17_ = anIntArray1149!![--anInt1173]
                val class147 = method3985(-101, i_17_)
                var string = ""
                if (class147 != null && class147.aString2024 != null) string = class147.aString2024!!
                aStringArray1152!![anInt1170++] = string
                return
            }
            if (i == 5011) {
                val i_18_ = anIntArray1149!![--anInt1173]
                val class147 = method3985(-101, i_18_)
                var string = ""
                if (class147 != null && class147.aString2022 != null) string = class147.aString2022!!
                aStringArray1152!![anInt1170++] = string
                return
            }
            if (i == 5012) {
                val i_19_ = anIntArray1149!![--anInt1173]
                val class147 = method3985(-101, i_19_)
                var i_20_ = -1
                if (class147 != null) i_20_ = class147.anInt2026
                anIntArray1149!![anInt1173++] = i_20_
                return
            }
            if (i == 5015) {
                val string: String?
                if (LocalPlayerState.aPlayer_1907 != null && (LocalPlayerState.aPlayer_1907!!.aString10537) != null) string = LocalPlayerState.aPlayer_1907!!.method2456(true, 255)
                else string = ""
                aStringArray1152!![anInt1170++] = string
                return
            }
            if (i == 5016) {
                anIntArray1149!![anInt1173++] = BufferToggleState.anInt3713
                return
            }
            if (i == 5017) {
                anIntArray1149!![anInt1173++] = method2749(-1)
                return
            }
            if (i == 5018) {
                val i_21_ = anIntArray1149!![--anInt1173]
                val class147 = method3985(-101, i_21_)
                var i_22_ = 0
                if (class147 != null) i_22_ = class147.anInt2027
                anIntArray1149!![anInt1173++] = i_22_
                return
            }
            if (i == 5019) {
                val i_23_ = anIntArray1149!![--anInt1173]
                val class147 = method3985(-101, i_23_)
                var string = ""
                if (class147 != null && class147.aString2033 != null) string = class147.aString2033!!
                aStringArray1152!![anInt1170++] = string
                return
            }
            if (i == 5020) {
                val string: String?
                if (LocalPlayerState.aPlayer_1907 != null && (LocalPlayerState.aPlayer_1907!!.aString10537) != null) string = LocalPlayerState.aPlayer_1907!!.method2450(false, -78)
                else string = ""
                aStringArray1152!![anInt1170++] = string!!
                return
            }
            if (i == 5023) {
                val i_24_ = anIntArray1149!![--anInt1173]
                val class147 = method3985(-101, i_24_)
                var i_25_ = -1
                if (class147 != null) i_25_ = class147.anInt2031
                anIntArray1149!![anInt1173++] = i_25_
                return
            }
            if (i == 5024) {
                val i_26_ = anIntArray1149!![--anInt1173]
                val class147 = method3985(-101, i_26_)
                var i_27_ = -1
                if (class147 != null) i_27_ = class147.anInt2030
                anIntArray1149!![anInt1173++] = i_27_
                return
            }
            if (i == 5025) {
                val i_28_ = anIntArray1149!![--anInt1173]
                val class147 = method3985(-101, i_28_)
                var string = ""
                if (class147 != null && class147.aString2025 != null) string = class147.aString2025!!
                aStringArray1152!![anInt1170++] = string
                return
            }
            if (i == 5050) {
                val i_29_ = anIntArray1149!![--anInt1173]
                aStringArray1152!![anInt1170++] = (ScriptResources.aTextureDefinitionCache_2639!!.method1625(0, i_29_).aString9587)
                return
            }
            if (i == 5051) {
                val i_30_ = anIntArray1149!![--anInt1173]
                val class348_sub42_sub11 = ScriptResources.aTextureDefinitionCache_2639!!.method1625(0, i_30_)
                if ((class348_sub42_sub11.anIntArray9592) == null) anIntArray1149!![anInt1173++] = 0
                else {
                    anIntArray1149!![anInt1173++] = (class348_sub42_sub11!!.anIntArray9592!!).size
                    return
                }
                return
            }
            if (i == 5052) {
                anInt1173 -= 2
                val i_31_ = anIntArray1149!![anInt1173]
                val i_32_ = anIntArray1149!![anInt1173 + 1]
                val class348_sub42_sub11 = ScriptResources.aTextureDefinitionCache_2639!!.method1625(0, i_31_)
                val i_33_ = (class348_sub42_sub11.anIntArray9592!![i_32_])
                anIntArray1149!![anInt1173++] = i_33_
                return
            }
            if (i == 5053) {
                val i_34_ = anIntArray1149!![--anInt1173]
                val class348_sub42_sub11 = ScriptResources.aTextureDefinitionCache_2639!!.method1625(0, i_34_)
                if ((class348_sub42_sub11.anIntArray9580) == null) anIntArray1149!![anInt1173++] = 0
                else {
                    anIntArray1149!![anInt1173++] = (class348_sub42_sub11!!.anIntArray9580!!).size
                    return
                }
                return
            }
            if (i == 5054) {
                anInt1173 -= 2
                val i_35_ = anIntArray1149!![anInt1173]
                val i_36_ = anIntArray1149!![anInt1173 + 1]
                anIntArray1149!![anInt1173++] = (ScriptResources.aTextureDefinitionCache_2639!!.method1625(0, i_35_).anIntArray9580!![i_36_]!!)
                return
            }
            if (i == 5055) {
                val i_37_ = anIntArray1149!![--anInt1173]
                aStringArray1152!![anInt1170++] = BrightnessOptionState.aCompiledScriptCache_5900!!.method3471(i_37_, (-112).toByte()).method3219(127)
                return
            }
            if (i == 5056) {
                val i_38_ = anIntArray1149!![--anInt1173]
                val class348_sub42_sub10 = BrightnessOptionState.aCompiledScriptCache_5900!!.method3471(i_38_, (-125).toByte())
                if ((class348_sub42_sub10.anIntArray9566) == null) anIntArray1149!![anInt1173++] = 0
                else {
                    anIntArray1149!![anInt1173++] = (class348_sub42_sub10.anIntArray9566!!).size
                    return
                }
                return
            }
            if (i == 5057) {
                anInt1173 -= 2
                val i_39_ = anIntArray1149!![anInt1173]
                val i_40_ = anIntArray1149!![anInt1173 + 1]
                anIntArray1149!![anInt1173++] = (BrightnessOptionState.aCompiledScriptCache_5900!!.method3471(i_39_, (-126).toByte()).anIntArray9566!![i_40_])
                return
            }
            if (i == 5058) {
                aMinimapTileEntry_1151 = MinimapTileEntry()
                aMinimapTileEntry_1151!!.anInt615 = anIntArray1149!![--anInt1173]
                aMinimapTileEntry_1151!!.aClass348_Sub42_Sub10_614 = BrightnessOptionState.aCompiledScriptCache_5900!!.method3471((aMinimapTileEntry_1151!!.anInt615), (-87).toByte())
                aMinimapTileEntry_1151!!.anIntArray617 = IntArray(aMinimapTileEntry_1151!!.aClass348_Sub42_Sub10_614!!.method3215((-48).toByte()))
                return
            }
            if (i == 5059) {
                anInt1165++
                val class348_sub47 = method2148(Js5Archive.aFontMetaRef_643, (TheoraVideoStream.aClass77_9029), -93)
                class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByte(false, 0)
                val i_41_ = (class348_sub47.aClass348_Sub49_Sub2_7116!!.anInt7197)
                class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByte(false, 0)
                class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShort(107.toByte(), aMinimapTileEntry_1151!!.anInt615)
                aMinimapTileEntry_1151!!.aClass348_Sub42_Sub10_614!!.method3210(12.toByte(), aMinimapTileEntry_1151!!.anIntArray617, (class348_sub47.aClass348_Sub49_Sub2_7116!!))
                class348_sub47.aClass348_Sub49_Sub2_7116!!.method3339(115, (class348_sub47.aClass348_Sub49_Sub2_7116!!.anInt7197) - i_41_)
                InterfaceComponentGroup.method3243(127, class348_sub47)
                return
            }
            if (i == 5060) {
                val string = aStringArray1152!![--anInt1170]
                anInt1166++
                val class348_sub47 = method2148(ItemActionPacketSender.aFontMetaRef_2109, (TheoraVideoStream.aClass77_9029), -89)
                class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByte(false, 0)
                val i_42_ = (class348_sub47.aClass348_Sub49_Sub2_7116!!.anInt7197)
                class348_sub47.aClass348_Sub49_Sub2_7116!!.writeString((-5).toByte(), string!!)
                class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShort(107.toByte(), aMinimapTileEntry_1151!!.anInt615)
                aMinimapTileEntry_1151!!.aClass348_Sub42_Sub10_614!!.method3210((-125).toByte(), aMinimapTileEntry_1151!!.anIntArray617, (class348_sub47.aClass348_Sub49_Sub2_7116!!))
                class348_sub47.aClass348_Sub49_Sub2_7116!!.method3339(102, (class348_sub47.aClass348_Sub49_Sub2_7116!!.anInt7197) - i_42_)
                InterfaceComponentGroup.method3243(127, class348_sub47)
                return
            }
            if (i == 5061) {
                anInt1165++
                val class348_sub47 = method2148(Js5Archive.aFontMetaRef_643, (TheoraVideoStream.aClass77_9029), -104)
                class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByte(false, 0)
                val i_43_ = (class348_sub47.aClass348_Sub49_Sub2_7116!!.anInt7197)
                class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByte(false, 1)
                class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShort(107.toByte(), aMinimapTileEntry_1151!!.anInt615)
                aMinimapTileEntry_1151!!.aClass348_Sub42_Sub10_614!!.method3210((-126).toByte(), aMinimapTileEntry_1151!!.anIntArray617, (class348_sub47.aClass348_Sub49_Sub2_7116!!))
                class348_sub47.aClass348_Sub49_Sub2_7116!!.method3339(92, (class348_sub47.aClass348_Sub49_Sub2_7116!!.anInt7197) - i_43_)
                InterfaceComponentGroup.method3243(-111, class348_sub47)
                return
            }
            if (i == 5062) {
                anInt1173 -= 2
                val i_44_ = anIntArray1149!![anInt1173]
                val i_45_ = anIntArray1149!![anInt1173 + 1]
                anIntArray1149!![anInt1173++] = (ScriptResources.aTextureDefinitionCache_2639!!.method1625(0, i_44_).aCharArray9588[i_45_]).code
                return
            }
            if (i == 5063) {
                anInt1173 -= 2
                val i_46_ = anIntArray1149!![anInt1173]
                val i_47_ = anIntArray1149!![anInt1173 + 1]
                anIntArray1149!![anInt1173++] = (ScriptResources.aTextureDefinitionCache_2639!!.method1625(0, i_46_).aCharArray9582[i_47_]).code
                return
            }
            if (i == 5064) {
                anInt1173 -= 2
                val i_48_ = anIntArray1149!![anInt1173]
                val i_49_ = anIntArray1149!![anInt1173 + 1]
                if (i_49_ == -1) anIntArray1149!![anInt1173++] = -1
                else {
                    anIntArray1149!![anInt1173++] = ScriptResources.aTextureDefinitionCache_2639!!.method1625(0, i_48_).method3226(i_49_.toChar(), 57249897)
                    return
                }
                return
            }
            if (i == 5065) {
                anInt1173 -= 2
                val i_50_ = anIntArray1149!![anInt1173]
                val i_51_ = anIntArray1149!![anInt1173 + 1]
                if (i_51_ == -1) anIntArray1149!![anInt1173++] = -1
                else {
                    anIntArray1149!![anInt1173++] = ScriptResources.aTextureDefinitionCache_2639!!.method1625(0, i_50_).method3222((-122).toByte(), i_51_.toChar())
                    return
                }
                return
            }
            if (i == 5066) {
                val i_52_ = anIntArray1149!![--anInt1173]
                anIntArray1149!![anInt1173++] = BrightnessOptionState.aCompiledScriptCache_5900!!.method3471(i_52_, (-123).toByte()).method3215((-127).toByte())
                return
            }
            if (i == 5067) {
                anInt1173 -= 2
                val i_53_ = anIntArray1149!![anInt1173]
                val i_54_ = anIntArray1149!![anInt1173 + 1]
                val i_55_ = BrightnessOptionState.aCompiledScriptCache_5900!!.method3471(i_53_, (-127).toByte()).method3212(0, i_54_)!!.anInt1941
                anIntArray1149!![anInt1173++] = i_55_
                return
            }
            if (i == 5068) {
                anInt1173 -= 2
                val i_56_ = anIntArray1149!![anInt1173]
                val i_57_ = anIntArray1149!![anInt1173 + 1]
                aMinimapTileEntry_1151!!.anIntArray617!![i_56_] = i_57_
                return
            }
            if (i == 5069) {
                anInt1173 -= 2
                val i_58_ = anIntArray1149!![anInt1173]
                val i_59_ = anIntArray1149!![anInt1173 + 1]
                aMinimapTileEntry_1151!!.anIntArray617!![i_58_] = i_59_
                return
            }
            if (i == 5070) {
                anInt1173 -= 3
                val i_60_ = anIntArray1149!![anInt1173]
                val i_61_ = anIntArray1149!![anInt1173 + 1]
                val i_62_ = anIntArray1149!![anInt1173 + 2]
                val class348_sub42_sub10 = BrightnessOptionState.aCompiledScriptCache_5900!!.method3471(i_60_, (-127).toByte())
                if ((class348_sub42_sub10.method3212(0, i_61_)!!.anInt1941) != 0) throw RuntimeException("bad command")
                anIntArray1149!![anInt1173++] = class348_sub42_sub10.method3213(i_62_, i_61_, true)
                return
            }
            if (i == 5071) {
                val string = aStringArray1152!![--anInt1170]!!
                val bool_63_ = anIntArray1149!![--anInt1173] == 1
                method606(0, bool_63_, string)
                anIntArray1149!![anInt1173++] = Class76.anInt1285
                return
            }
            if (i == 5072) {
                if (AsyncTaskHandle.aShortArray2579 == null || WidgetNodeLink.anInt2037 >= Class76.anInt1285) anIntArray1149!![anInt1173++] = -1
                else {
                    anIntArray1149!![anInt1173++] = (AsyncTaskHandle.aShortArray2579!![WidgetNodeLink.anInt2037++].toInt() and 0xffff)
                    return
                }
                return
            }
            if (i == 5073) {
                WidgetNodeLink.anInt2037 = 0
                return
            }
        } else if (i < 5200) {
            if (i == 5100) {
                if (LoadProgressCounters.aKeyboardInputSource_2449!!.method2696(86, -121)) anIntArray1149!![anInt1173++] = 1
                else {
                    anIntArray1149!![anInt1173++] = 0
                    return
                }
                return
            }
            if (i == 5101) {
                if (LoadProgressCounters.aKeyboardInputSource_2449!!.method2696(82, -126)) anIntArray1149!![anInt1173++] = 1
                else {
                    anIntArray1149!![anInt1173++] = 0
                    return
                }
                return
            }
            if (i == 5102) {
                if (LoadProgressCounters.aKeyboardInputSource_2449!!.method2696(81, -128)) anIntArray1149!![anInt1173++] = 1
                else {
                    anIntArray1149!![anInt1173++] = 0
                    return
                }
                return
            }
        } else if (i < 5300) {
            if (i == 5200) {
                method312(anIntArray1149!![--anInt1173], 56.toByte())
                return
            }
            if (i == 5201) {
                anIntArray1149!![anInt1173++] = method244(37)
                return
            }
            if (i == 5205) {
                method298(false, -1, -1, anIntArray1149!![--anInt1173], -53)
                return
            }
            if (i == 5206) {
                val i_64_ = anIntArray1149!![--anInt1173]
                val class348_sub42_sub14 = Class75.method766(i_64_ shr 14 and 0x3fff, i_64_ and 0x3fff)
                if (class348_sub42_sub14 == null) anIntArray1149!![anInt1173++] = -1
                else {
                    anIntArray1149!![anInt1173++] = (class348_sub42_sub14.anInt9628)
                    return
                }
                return
            }
            if (i == 5207) {
                val class348_sub42_sub14 = Class75.method757(anIntArray1149!![--anInt1173])
                if (class348_sub42_sub14 == null || (class348_sub42_sub14.aString9632) == null) aStringArray1152!![anInt1170++] = ""
                else {
                    aStringArray1152!![anInt1170++] = (class348_sub42_sub14.aString9632)
                    return
                }
                return
            }
            if (i == 5208) {
                anIntArray1149!![anInt1173++] = SpriteStore.anInt370
                anIntArray1149!![anInt1173++] = LoadProgressCounters.anInt2446
                return
            }
            if (i == 5209) {
                anIntArray1149!![anInt1173++] = WidgetActionEntry.anInt6992 + Class75.anInt1266
                anIntArray1149!![anInt1173++] = DebugOverlayRenderer.anInt3170 + Class75.anInt1263
                return
            }
            if (i == 5210) {
                val i_65_ = anIntArray1149!![--anInt1173]
                val class348_sub42_sub14 = Class75.method757(i_65_)
                if (class348_sub42_sub14 == null) {
                    anIntArray1149!![anInt1173++] = 0
                    anIntArray1149!![anInt1173++] = 0
                } else {
                    anIntArray1149!![anInt1173++] = (class348_sub42_sub14.anInt9640) shr 14 and 0x3fff
                    anIntArray1149!![anInt1173++] = (class348_sub42_sub14.anInt9640) and 0x3fff
                    return
                }
                return
            }
            if (i == 5211) {
                val i_66_ = anIntArray1149!![--anInt1173]
                val class348_sub42_sub14 = Class75.method757(i_66_)
                if (class348_sub42_sub14 == null) {
                    anIntArray1149!![anInt1173++] = 0
                    anIntArray1149!![anInt1173++] = 0
                } else {
                    anIntArray1149!![anInt1173++] = ((class348_sub42_sub14.anInt9635) - (class348_sub42_sub14.anInt9644))
                    anIntArray1149!![anInt1173++] = ((class348_sub42_sub14.anInt9627) - (class348_sub42_sub14.anInt9643))
                    return
                }
                return
            }
            if (i == 5212) {
                val class348_sub21 = method199(1)
                if (class348_sub21 == null) {
                    anIntArray1149!![anInt1173++] = -1
                    anIntArray1149!![anInt1173++] = -1
                } else {
                    anIntArray1149!![anInt1173++] = class348_sub21.anInt6847
                    val i_67_ = (class348_sub21.anInt6850 shl 28 or ((class348_sub21.anInt6852 + Class75.anInt1266) shl 14) or (class348_sub21.anInt6851 + Class75.anInt1263))
                    anIntArray1149!![anInt1173++] = i_67_
                    return
                }
                return
            }
            if (i == 5213) {
                val class348_sub21 = Hashtable.method3479(-1)
                if (class348_sub21 == null) {
                    anIntArray1149!![anInt1173++] = -1
                    anIntArray1149!![anInt1173++] = -1
                } else {
                    anIntArray1149!![anInt1173++] = class348_sub21.anInt6847
                    val i_68_ = (class348_sub21.anInt6850 shl 28 or ((class348_sub21.anInt6852 + Class75.anInt1266) shl 14) or (class348_sub21.anInt6851 + Class75.anInt1263))
                    anIntArray1149!![anInt1173++] = i_68_
                    return
                }
                return
            }
            if (i == 5214) {
                val i_69_ = anIntArray1149!![--anInt1173]
                val class348_sub42_sub14 = AudioResampler.method1269(-17096)
                if (class348_sub42_sub14 != null) {
                    val bool_70_ = class348_sub42_sub14.method3236(anIntArray1175!!, i_69_ shr 14 and 0x3fff, i_69_ and 0x3fff, i_69_ shr 28 and 0x3, (-28).toByte())
                    if (bool_70_) method2839(anIntArray1175!![1], -17, anIntArray1175!![2])
                }
                return
            }
            if (i == 5215) {
                anInt1173 -= 2
                val i_71_ = anIntArray1149!![anInt1173]
                val i_72_ = anIntArray1149!![anInt1173 + 1]
                val class107 = Class75.method767(i_71_ shr 14 and 0x3fff, i_71_ and 0x3fff)
                var bool_73_ = false
                var class348_sub42_sub14 = class107.method1011(-48) as? InterfaceComponentGroup?
                while (class348_sub42_sub14 != null) {
                    if (class348_sub42_sub14.anInt9628 == i_72_) {
                        bool_73_ = true
                        break
                    }
                    class348_sub42_sub14 = (class107.method1003(113.toByte()) as? InterfaceComponentGroup?)
                }
                if (bool_73_) anIntArray1149!![anInt1173++] = 1
                else {
                    anIntArray1149!![anInt1173++] = 0
                    return
                }
                return
            }
            if (i == 5218) {
                val i_74_ = anIntArray1149!![--anInt1173]
                val class348_sub42_sub14 = Class75.method757(i_74_)
                if (class348_sub42_sub14 == null) anIntArray1149!![anInt1173++] = -1
                else {
                    anIntArray1149!![anInt1173++] = (class348_sub42_sub14.anInt9631)
                    return
                }
                return
            }
            if (i == 5220) {
                anIntArray1149!![anInt1173++] = if (LinkedListNode.anInt4290 == 100) 1 else 0
                return
            }
            if (i == 5221) {
                val i_75_ = anIntArray1149!![--anInt1173]
                method2839(i_75_ shr 14 and 0x3fff, -17, i_75_ and 0x3fff)
                return
            }
            if (i == 5222) {
                val class348_sub42_sub14 = AudioResampler.method1269(-17096)
                if (class348_sub42_sub14 == null) {
                    anIntArray1149!![anInt1173++] = -1
                    anIntArray1149!![anInt1173++] = -1
                    return
                } else {
                    val bool_76_ = (class348_sub42_sub14.method3239(true, DebugOverlayRenderer.anInt3170 + Class75.anInt1263, WidgetActionEntry.anInt6992 + Class75.anInt1266, anIntArray1175!!))
                    if (bool_76_) {
                        anIntArray1149!![anInt1173++] = anIntArray1175!![1]
                        anIntArray1149!![anInt1173++] = anIntArray1175!![2]
                    } else {
                        anIntArray1149!![anInt1173++] = -1
                        anIntArray1149!![anInt1173++] = -1
                    }
                }
                return
            }
            if (i == 5223) {
                anInt1173 -= 2
                val i_77_ = anIntArray1149!![anInt1173]
                val i_78_ = anIntArray1149!![anInt1173 + 1]
                method298(false, i_78_ and 0x3fff, i_78_ shr 14 and 0x3fff, i_77_, -53)
                return
            }
            if (i == 5224) {
                val i_79_ = anIntArray1149!![--anInt1173]
                val class348_sub42_sub14 = AudioResampler.method1269(-17096)
                if (class348_sub42_sub14 == null) {
                    anIntArray1149!![anInt1173++] = -1
                    anIntArray1149!![anInt1173++] = -1
                    return
                } else {
                    val bool_80_ = class348_sub42_sub14.method3236(anIntArray1175!!, i_79_ shr 14 and 0x3fff, i_79_ and 0x3fff, i_79_ shr 28 and 0x3, (-28).toByte())
                    if (bool_80_) {
                        anIntArray1149!![anInt1173++] = anIntArray1175!![1]
                        anIntArray1149!![anInt1173++] = anIntArray1175!![2]
                    } else {
                        anIntArray1149!![anInt1173++] = -1
                        anIntArray1149!![anInt1173++] = -1
                    }
                }
                return
            }
            if (i == 5225) {
                val i_81_ = anIntArray1149!![--anInt1173]
                val class348_sub42_sub14 = AudioResampler.method1269(-17096)
                if (class348_sub42_sub14 == null) {
                    anIntArray1149!![anInt1173++] = -1
                    anIntArray1149!![anInt1173++] = -1
                    return
                } else {
                    val bool_82_ = class348_sub42_sub14.method3239(true, i_81_ and 0x3fff, i_81_ shr 14 and 0x3fff, anIntArray1175!!)
                    if (bool_82_) {
                        anIntArray1149!![anInt1173++] = anIntArray1175!![1]
                        anIntArray1149!![anInt1173++] = anIntArray1175!![2]
                    } else {
                        anIntArray1149!![anInt1173++] = -1
                        anIntArray1149!![anInt1173++] = -1
                    }
                }
                return
            }
            if (i == 5226) {
                method1129(anIntArray1149!![--anInt1173], 100)
                return
            }
            if (i == 5227) {
                anInt1173 -= 2
                val i_83_ = anIntArray1149!![anInt1173]
                val i_84_ = anIntArray1149!![anInt1173 + 1]
                method298(true, i_84_ and 0x3fff, i_84_ shr 14 and 0x3fff, i_83_, -62)
                return
            }
            if (i == 5228) {
                TerrainTileShape.aBoolean8805 = anIntArray1149!![--anInt1173] == 1
                return
            }
            if (i == 5229) {
                anIntArray1149!![anInt1173++] = if (TerrainTileShape.aBoolean8805) 1 else 0
                return
            }
            if (i == 5230) {
                val i_85_ = anIntArray1149!![--anInt1173]
                ProjectileConfigUtil.method314((-74).toByte(), i_85_)
                return
            }
            if (i == 5231) {
                anInt1173 -= 2
                val i_86_ = anIntArray1149!![anInt1173]
                val bool_87_ = anIntArray1149!![anInt1173 + 1] == 1
                if (HardKeyedCacheEntryReference.aHashtable_10442 != null) {
                    var class348 = HardKeyedCacheEntryReference.aHashtable_10442!!.method3480(i_86_.toLong(), -6008)
                    if (class348 != null && !bool_87_) class348.method2715(48.toByte())
                    else if (class348 == null && bool_87_) {
                        class348 = LinkedListNode()
                        HardKeyedCacheEntryReference.aHashtable_10442!!.method3483(29.toByte(), i_86_.toLong(), class348)
                    }
                }
                return
            }
            if (i == 5232) {
                val i_88_ = anIntArray1149!![--anInt1173]
                if (HardKeyedCacheEntryReference.aHashtable_10442 == null) {
                    anIntArray1149!![anInt1173++] = 0
                    return
                } else {
                    val class348 = HardKeyedCacheEntryReference.aHashtable_10442!!.method3480(i_88_.toLong(), -6008)
                    anIntArray1149!![anInt1173++] = if (class348 != null) 1 else 0
                }
                return
            }
            if (i == 5233) {
                anInt1173 -= 2
                val i_89_ = anIntArray1149!![anInt1173]
                val bool_90_ = anIntArray1149!![anInt1173 + 1] == 1
                if (HeapInfoRecord.aHashtable_4934 != null) {
                    var class348 = HeapInfoRecord.aHashtable_4934!!.method3480(i_89_.toLong(), -6008)
                    if (class348 != null && !bool_90_) class348.method2715(83.toByte())
                    else if (class348 == null && bool_90_) {
                        class348 = LinkedListNode()
                        HeapInfoRecord.aHashtable_4934!!.method3483(112.toByte(), i_89_.toLong(), class348)
                    }
                }
                return
            }
            if (i == 5234) {
                val i_91_ = anIntArray1149!![--anInt1173]
                if (HeapInfoRecord.aHashtable_4934 == null) {
                    anIntArray1149!![anInt1173++] = 0
                    return
                } else {
                    val class348 = HeapInfoRecord.aHashtable_4934!!.method3480(i_91_.toLong(), -6008)
                    anIntArray1149!![anInt1173++] = if (class348 != null) 1 else 0
                }
                return
            }
            if (i == 5235) {
                anIntArray1149!![anInt1173++] = (if (Class75.aClass348_Sub42_Sub14_1243 != null) Class75.aClass348_Sub42_Sub14_1243!!.anInt9628 else -1)
                return
            }
            if (i == 5236) {
                anInt1173 -= 2
                val i_92_ = anIntArray1149!![anInt1173]
                val i_93_ = anIntArray1149!![anInt1173 + 1]
                val i_94_ = i_93_ shr 14 and 0x3fff
                val i_95_ = i_93_ and 0x3fff
                val i_96_ = method1754(true, i_92_, i_94_, i_95_)
                if (i_96_ < 0) anIntArray1149!![anInt1173++] = -1
                else {
                    anIntArray1149!![anInt1173++] = i_96_
                    return
                }
                return
            }
            if (i == 5237) {
                FrameStatsReset.method1134(86)
                return
            }
        } else if (i < 5400) {
            if (i == 5300) {
                anInt1173 -= 2
                val i_97_ = anIntArray1149!![anInt1173]
                val i_98_ = anIntArray1149!![anInt1173 + 1]
                Class85.method830(3, i_97_, 102.toByte(), false, i_98_)
                anIntArray1149!![anInt1173++] = if (SkeletalAnimFrameLoader.aFrame476 != null) 1 else 0
                return
            }
            if (i == 5301) {
                if (SkeletalAnimFrameLoader.aFrame476 != null) Class85.method830(IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub8_7227!!.method1751(-32350), -1, 102.toByte(), false, -1)
                return
            }
            if (i == 5302) {
                val class57s = NamedTimedNode.method2515(1494)!!
                anIntArray1149!![anInt1173++] = class57s.size
                return
            }
            if (i == 5303) {
                val i_99_ = anIntArray1149!![--anInt1173]
                val class57s = NamedTimedNode.method2515(1494)!!
                anIntArray1149!![anInt1173++] = class57s[i_99_]!!.anInt1047
                anIntArray1149!![anInt1173++] = class57s[i_99_]!!.anInt1054
                return
            }
            if (i == 5305) {
                val i_100_ = KeyboardInputSource.anInt4276
                val i_101_ = FlickeringEffectsOptionState.anInt5911
                var i_102_ = -1
                val class57s = NamedTimedNode.method2515(1494)!!
                for (i_103_ in class57s.indices) {
                    val class57 = class57s[i_103_]!!
                    if (class57.anInt1047 == i_100_ && class57.anInt1054 == i_101_) {
                        i_102_ = i_103_
                        break
                    }
                }
                anIntArray1149!![anInt1173++] = i_102_
                return
            }
            if (i == 5306) {
                anIntArray1149!![anInt1173++] = ContactEntry.method3229(-126)
                return
            }
            if (i == 5307) {
                val i_104_ = anIntArray1149!![--anInt1173]
                if (i_104_ >= 1 && i_104_ <= 2) {
                    Class85.method830(i_104_, -1, 102.toByte(), false, -1)
                    return
                }
                return
            }
            if (i == 5308) {
                anIntArray1149!![anInt1173++] = IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub8_7227!!.method1751(-32350)
                return
            }
            if (i == 5309) {
                val i_105_ = anIntArray1149!![--anInt1173]
                if (i_105_ >= 1 && i_105_ <= 2) {
                    IntHashSet.aClass348_Sub51_3959!!.method3429(74.toByte(), (IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub8_7227!!), i_105_)
                    IntHashSet.aClass348_Sub51_3959!!.method3429(74.toByte(), (IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub8_7254), i_105_)
                    method243(37)
                    return
                }
                return
            }
        } else if (i < 5500) {
            if (i == 5400) {
                anInt1170 -= 2
                val string = aStringArray1152!![anInt1170]!!
                val string_106_ = aStringArray1152!![anInt1170 + 1]!!
                val i_107_ = anIntArray1149!![--anInt1173]
                anInt1171++
                val class348_sub47 = method2148((SpriteTextureNode.aFontMetaRef_9234), (TheoraVideoStream.aClass77_9029), -101)
                class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByte(false, (method1745(string, -65) + method1745(string_106_, -65) + 1))
                class348_sub47.aClass348_Sub49_Sub2_7116!!.writeString((-5).toByte(), string)
                class348_sub47.aClass348_Sub49_Sub2_7116!!.writeString((-5).toByte(), string_106_)
                class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByte(false, i_107_)
                InterfaceComponentGroup.method3243(-66, class348_sub47)
                return
            }
            if (i == 5401) {
                anInt1173 -= 2
                SceneEffectMarker.aShortArray6428!![anIntArray1149!![anInt1173]] = method160(27076, anIntArray1149!![anInt1173 + 1]).toShort()
                Exception_Sub1.aModelHeaderCache_112!!.method1930(-21804)
                Exception_Sub1.aModelHeaderCache_112!!.method1936(-71)
                MapAreaDefinition.aBufferedMessageQueue_2529!!.method2074(-118)
                TextureCache.method3466(125)
                return
            }
            if (i == 5405) {
                anInt1173 -= 2
                val i_108_ = anIntArray1149!![anInt1173]
                val i_109_ = anIntArray1149!![anInt1173 + 1]
                if (i_108_ >= 0 && i_108_ < 2) SpriteDefinition.anIntArrayArrayArray7079!![i_108_] = Array<IntArray?>(i_109_ shl 1) { IntArray(4) }
                return
            }
            if (i == 5406) {
                anInt1173 -= 7
                val i_110_ = anIntArray1149!![anInt1173]
                val i_111_ = anIntArray1149!![anInt1173 + 1] shl 1
                val i_112_ = anIntArray1149!![anInt1173 + 2]
                val i_113_ = anIntArray1149!![anInt1173 + 3]
                val i_114_ = anIntArray1149!![anInt1173 + 4]
                val i_115_ = anIntArray1149!![anInt1173 + 5]
                val i_116_ = anIntArray1149!![anInt1173 + 6]
                if (i_110_ >= 0 && i_110_ < 2 && SpriteDefinition.anIntArrayArrayArray7079!![i_110_] != null && i_111_ >= 0 && i_111_ < (SpriteDefinition.anIntArrayArrayArray7079!![i_110_]!!).size) {
                    SpriteDefinition.anIntArrayArrayArray7079!![i_110_]!![i_111_] = intArrayOf((i_112_ shr 14 and 0x3fff) shl 9, i_113_ shl 2, (i_112_ and 0x3fff) shl 9, i_116_)
                    SpriteDefinition.anIntArrayArrayArray7079!![i_110_]!![i_111_ + 1] = intArrayOf((i_114_ shr 14 and 0x3fff) shl 9, i_115_ shl 2, (i_114_ and 0x3fff) shl 9)
                }
                return
            }
            if (i == 5407) {
                val i_117_ = ((SpriteDefinition.anIntArrayArrayArray7079!![anIntArray1149!![--anInt1173]]!!).size shr 1)
                anIntArray1149!![anInt1173++] = i_117_
                return
            }
            if (i == 5411) {
                if (SkeletalAnimFrameLoader.aFrame476 != null) Class85.method830(IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub8_7227!!.method1751(-32350), -1, 102.toByte(), false, -1)
                if (Class52.aFrame4904 == null) {
                    val string = (if (InputSettingsState.aString1761 != null) InputSettingsState.aString1761 else method2162(false))
                    GrowableStringList.method1360(string, VorbisOggDecoder.aPrivilegedOperationWorker_8992, IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub25_7271!!.method1829(-32350) == 1, false, -47)
                    return
                } else {
                    method2405(97)
                    System.exit(0)
                }
                return
            }
            if (i == 5419) {
                var string: String? = ""
                if (ChatScriptListNode.aLinkedQueueNode_9536 != null) {
                    if (ChatScriptListNode.aLinkedQueueNode_9536!!.anObject1998 != null) string = (ChatScriptListNode.aLinkedQueueNode_9536!!.anObject1998) as String?
                    else string = SceneObjectAnimator.method1669(-19918, (ChatScriptListNode.aLinkedQueueNode_9536!!.anInt2000))
                }
                aStringArray1152!![anInt1170++] = string!!
                return
            }
            if (i == 5420) {
                anIntArray1149!![anInt1173++] = if (VorbisOggDecoder.aPrivilegedOperationWorker_8992!!.aBoolean3777) 0 else 1
                return
            }
            if (i == 5421) {
                if (SkeletalAnimFrameLoader.aFrame476 != null) Class85.method830(IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub8_7227!!.method1751(-32350), -1, 102.toByte(), false, -1)
                val string = aStringArray1152!![--anInt1170]
                val bool_118_ = anIntArray1149!![--anInt1173] == 1
                val string_119_ = method2162(false) + string
                GrowableStringList.method1360(string_119_, VorbisOggDecoder.aPrivilegedOperationWorker_8992, IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub25_7271!!.method1829(-32350) == 1, bool_118_, 104)
                return
            }
            if (i == 5422) {
                anInt1170 -= 2
                val string = aStringArray1152!![anInt1170]!!
                val string_120_ = aStringArray1152!![anInt1170 + 1]!!
                val i_121_ = anIntArray1149!![--anInt1173]
                if (string.length > 0) {
                    if (Class367_Sub9.aStringArray7378 == null) Class367_Sub9.aStringArray7378 = arrayOfNulls<String>((SocketFactory.anIntArray3475!![HardCacheEntryReference.aSceneProjector_10434!!.anInt2987]))
                    Class367_Sub9.aStringArray7378!![i_121_] = string
                }
                if (string_120_.length > 0) {
                    if (Class54.aStringArray974 == null) Class54.aStringArray974 = arrayOfNulls<String>((SocketFactory.anIntArray3475!![HardCacheEntryReference.aSceneProjector_10434!!.anInt2987]))
                    Class54.aStringArray974!![i_121_] = string_120_
                }
                return
            }
            if (i == 5423) {
                println(aStringArray1152!![--anInt1170])
                return
            }
            if (i == 5424) {
                anInt1173 -= 11
                CompassSmoother.anInt3376 = anIntArray1149!![anInt1173]
                Class51.anInt948 = anIntArray1149!![anInt1173 + 1]
                CompassSmoother.anInt3374 = anIntArray1149!![anInt1173 + 2]
                ShortMatrixNode.anInt9511 = anIntArray1149!![anInt1173 + 3]
                HudTabPanel.anInt2996 = anIntArray1149!![anInt1173 + 4]
                CombineTextureNode.anInt9231 = anIntArray1149!![anInt1173 + 5]
                ProjectedGroundDecor.anInt10257 = anIntArray1149!![anInt1173 + 6]
                SkyboxGradient.anInt3937 = anIntArray1149!![anInt1173 + 7]
                Class79.anInt1387 = anIntArray1149!![anInt1173 + 8]
                CharCodeMap.anInt9586 = anIntArray1149!![anInt1173 + 9]
                SolidFillComponent.anInt8363 = anIntArray1149!![anInt1173 + 10]
                CameraRotationStub.aJs5Archive_322!!.method421(false, HudTabPanel.anInt2996)
                CameraRotationStub.aJs5Archive_322!!.method421(false, CombineTextureNode.anInt9231)
                CameraRotationStub.aJs5Archive_322!!.method421(false, ProjectedGroundDecor.anInt10257)
                CameraRotationStub.aJs5Archive_322!!.method421(false, SkyboxGradient.anInt3937)
                CameraRotationStub.aJs5Archive_322!!.method421(false, Class79.anInt1387)
                SpotAnimVector.aAbstractModelRenderer_2309 = null
                AbstractMenuEntry.aAbstractModelRenderer_1706 = SpotAnimVector.aAbstractModelRenderer_2309
                TimedTileQueueEntry.aAbstractModelRenderer_9659 = AbstractMenuEntry.aAbstractModelRenderer_1706
                AbstractBloomEffect.aAbstractModelRenderer_6627 = null
                MinimapFlagRenderer.aAbstractModelRenderer_1800 = AbstractBloomEffect.aAbstractModelRenderer_6627
                OutputStream_Sub2.aAbstractModelRenderer_106 = MinimapFlagRenderer.aAbstractModelRenderer_1800
                ConfigVarProgress.aAbstractModelRenderer_4808 = null
                TimedTileQueueEntry.aAbstractModelRenderer_9658 = ConfigVarProgress.aAbstractModelRenderer_4808
                Class71.aBoolean1211 = true
                return
            }
            if (i == 5425) {
                LocalizedText.method2061(12)
                Class71.aBoolean1211 = false
                return
            }
            if (i == 5426) {
                anInt1173 -= 2
                StreamingResourceRequest.anInt10447 = anIntArray1149!![anInt1173]
                WidgetTextConfig.anInt506 = anIntArray1149!![anInt1173 + 1]
                return
            }
            if (i == 5427) {
                anInt1173 -= 2
                CubeMapMaterialPass.anInt6299 = anIntArray1149!![anInt1173 + 1]
                return
            }
            if (i == 5428) {
                anInt1173 -= 2
                val i_122_ = anIntArray1149!![anInt1173]
                val i_123_ = anIntArray1149!![anInt1173 + 1]
                anIntArray1149!![anInt1173++] = if (GroundDecorEntity.method2410((-49).toByte(), i_123_, i_122_)) 1 else 0
                return
            }
            if (i == 5429) {
                Class82.method812(aStringArray1152!![--anInt1170], false, false, (-79).toByte())
                return
            }
            if (i == 5430) {
                try {
                    JavaScriptBridge.method1617(125.toByte(), Class93.anApplet1530, "accountcreated")
                } catch (throwable: Throwable) {
                    /* empty */
                }
                return
            }
            if (i == 5431) {
                try {
                    JavaScriptBridge.method1617(125.toByte(), Class93.anApplet1530, "accountcreatestarted")
                } catch (throwable: Throwable) {
                    /* empty */
                }
                return
            }
            if (i == 5432) {
                var string = ""
                if (BlendTextureNode.aClipboard9357 != null) {
                    val transferable = BlendTextureNode.aClipboard9357!!.getContents(null)
                    if (transferable != null) {
                        try {
                            string = (transferable.getTransferData(DataFlavor.stringFlavor)) as String
                            if (string == null) string = ""
                        } catch (exception: Exception) {
                            /* empty */
                        }
                    }
                }
                aStringArray1152!![anInt1170++] = string
                return
            }
            if (i == 5433) {
                SoundCacheState.anInt4143 = anIntArray1149!![--anInt1173]
                return
            }
        } else if (i < 5600) {
            if (i == 5500) {
                anInt1173 -= 4
                val i_124_ = anIntArray1149!![anInt1173]
                val i_125_ = anIntArray1149!![anInt1173 + 1]
                val i_126_ = anIntArray1149!![anInt1173 + 2]
                val i_127_ = anIntArray1149!![anInt1173 + 3]
                method1844(i_126_, ((i_124_ shr 14 and 0x3fff) - ArbVertexProgram.regionTileX), false, i_125_ shl 2, false, i_127_, ((i_124_ and 0x3fff) - Class90.regionTileY))
                return
            }
            if (i == 5501) {
                anInt1173 -= 4
                val i_128_ = anIntArray1149!![anInt1173]
                val i_129_ = anIntArray1149!![anInt1173 + 1]
                val i_130_ = anIntArray1149!![anInt1173 + 2]
                val i_131_ = anIntArray1149!![anInt1173 + 3]
                ContactEntry.method3231(((i_128_ and 0x3fff) - Class90.regionTileY), ((i_128_ shr 14 and 0x3fff) - ArbVertexProgram.regionTileX), i_129_ shl 2, i_131_, i_130_, -128)
                return
            }
            if (i == 5502) {
                anInt1173 -= 6
                val i_132_ = anIntArray1149!![anInt1173]
                if (i_132_ >= 2) throw RuntimeException()
                NativeShaderProgram.anInt9775 = i_132_
                val i_133_ = anIntArray1149!![anInt1173 + 1]
                if (i_133_ + 1 >= (SpriteDefinition.anIntArrayArrayArray7079!![NativeShaderProgram.anInt9775])!!.size shr 1) throw RuntimeException()
                ItemDefinition.anInt2798 = i_133_
                CacheArchiveIndex.anInt1780 = 0
                RenderableGroup.anInt5019 = anIntArray1149!![anInt1173 + 2]
                CalendarUtil.anInt4133 = anIntArray1149!![anInt1173 + 3]
                val i_134_ = anIntArray1149!![anInt1173 + 4]
                if (i_134_ >= 2) throw RuntimeException()
                MapArchiveSource.anInt4803 = i_134_
                val i_135_ = anIntArray1149!![anInt1173 + 5]
                if (i_135_ + 1 >= (SpriteDefinition.anIntArrayArrayArray7079!![MapArchiveSource.anInt4803]!!).size shr 1) throw RuntimeException()
                CompassSmoother.anInt3373 = i_135_
                WeaveTextureNode.anInt9282 = 3
                SequencedWallEntity.anInt10163 = -1
                Class9.anInt167 = SequencedWallEntity.anInt10163
                return
            }
            if (i == 5503) {
                MinimapStateReset.method1122(0)
                return
            }
            if (i == 5504) {
                anInt1173 -= 2
                method2396(anIntArray1149!![anInt1173], anIntArray1149!![anInt1173 + 1], 0, 3)
                return
            }
            if (i == 5505) {
                anIntArray1149!![anInt1173++] = Class76.aFloat1287.toInt() shr 3
                return
            }
            if (i == 5506) {
                anIntArray1149!![anInt1173++] = ResourceProvider.aFloat3938.toInt() shr 3
                return
            }
            if (i == 5507) {
                method326(68.toByte())
                return
            }
            if (i == 5508) {
                CompiledScriptCache.method3470(1)
                return
            }
            if (i == 5509) {
                method2153(-77)
                return
            }
            if (i == 5510) {
                method262(0)
                return
            }
            if (i == 5511) {
                val i_136_ = anIntArray1149!![--anInt1173]
                var i_137_ = i_136_ shr 14 and 0x3fff
                var i_138_ = i_136_ and 0x3fff
                i_137_ -= ArbVertexProgram.regionTileX
                if (i_137_ < 0) i_137_ = 0
                else if (i_137_ >= Class367_Sub4.anInt7319) i_137_ = Class367_Sub4.anInt7319
                i_138_ -= Class90.regionTileY
                if (i_138_ < 0) i_138_ = 0
                else if (i_138_ >= RangeThresholdTextureNode.anInt9109) i_138_ = RangeThresholdTextureNode.anInt9109
                HslColorTableNode.anInt6633 = (i_137_ shl 9) + 256
                RegionTileNode.anInt6652 = (i_138_ shl 9) + 256
                WeaveTextureNode.anInt9282 = 4
                SequencedWallEntity.anInt10163 = -1
                Class9.anInt167 = SequencedWallEntity.anInt10163
                return
            }
            if (i == 5512) {
                method1851(121.toByte())
                return
            }
            if (i == 5514) {
                LocalPlayerState.anInt1911 = anIntArray1149!![--anInt1173]
                return
            }
            if (i == 5516) {
                anIntArray1149!![anInt1173++] = LocalPlayerState.anInt1911
                return
            }
            if (i == 5517) {
                val i_139_ = anIntArray1149!![--anInt1173]
                if (i_139_ == -1) {
                    var i_140_ = i_139_ shr 14 and 0x3fff
                    var i_141_ = i_139_ and 0x3fff
                    i_140_ -= ArbVertexProgram.regionTileX
                    if (i_140_ < 0) i_140_ = 0
                    else if (i_140_ >= Class367_Sub4.anInt7319) i_140_ = Class367_Sub4.anInt7319
                    i_141_ -= Class90.regionTileY
                    if (i_141_ < 0) i_141_ = 0
                    else if (i_141_ >= RangeThresholdTextureNode.anInt9109) i_141_ = RangeThresholdTextureNode.anInt9109
                    Class9.anInt167 = (i_140_ shl 9) + 256
                    SequencedWallEntity.anInt10163 = (i_141_ shl 9) + 256
                } else {
                    Class9.anInt167 = -1
                    SequencedWallEntity.anInt10163 = -1
                    return
                }
                return
            }
            if (i == 5547) {
                anIntArray1149!![anInt1173++] = if (WeaveTextureNode.anInt9282 == 1) 1 else 0
                return
            }
        } else if (i < 5700) {
            if (i == 5600) {
                anInt1170 -= 2
                val string = aStringArray1152!![anInt1170]!!
                val string_142_ = aStringArray1152!![anInt1170 + 1]
                val i_143_ = anIntArray1149!![--anInt1173]
                if (string.length <= 320 && WorldMapRenderer.anInt4674 == 3 && (NpcDefinition.anInt2955 == 0 && Class367_Sub2.anInt7297 == 0)) {
                    Class64_Sub3.aString5600 = string
                    TextureGenerator.aString2496 = string_142_
                    RuntimeException_Sub1.anInt4596 = i_143_
                    Buffer.method3379(2, 6)
                    return
                }
                return
            }
            if (i == 5601) {
                Class90.method854((-76).toByte())
                return
            }
            if (i == 5602) {
                if (NpcDefinition.anInt2955 == 0) {
                    LinkedNodeListIterator.anInt1645 = -2
                    HslColorTableNode.anInt6634 = -2
                }
                return
            }
            if (i == 5604) {
                anInt1170--
                if (WorldMapRenderer.anInt4674 == 3 && (NpcDefinition.anInt2955 == 0 && Class367_Sub2.anInt7297 == 0)) {
                    ClanChatRequestSender.method2106(aStringArray1152!![anInt1170], 101)
                    return
                }
                return
            }
            if (i == 5605) {
                anInt1170 -= 2
                anInt1173 -= 2
                if (WorldMapRenderer.anInt4674 == 3 && (NpcDefinition.anInt2955 == 0 && Class367_Sub2.anInt7297 == 0)) {
                    method449(aStringArray1152!![anInt1170 + 1], aStringArray1152!![anInt1170], false, anIntArray1149!![anInt1173], anIntArray1149!![anInt1173 + 1] == 1)
                    return
                }
                return
            }
            if (i == 5606) {
                if (Class367_Sub2.anInt7297 == 0) RenderableEntry.anInt4337 = -2
                return
            }
            if (i == 5607) {
                anIntArray1149!![anInt1173++] = HslColorTableNode.anInt6634
                return
            }
            if (i == 5608) {
                anIntArray1149!![anInt1173++] = Class63.anInt1121
                return
            }
            if (i == 5609) {
                anIntArray1149!![anInt1173++] = RenderableEntry.anInt4337
                return
            }
            if (i == 5611) {
                anIntArray1149!![anInt1173++] = ConfigShortValueNode.anInt9541
                return
            }
            if (i == 5612) {
                val i_144_ = anIntArray1149!![--anInt1173]
                if (WorldMapRenderer.anInt4674 == 7 && (NpcDefinition.anInt2955 == 0 && Class367_Sub2.anInt7297 == 0)) {
                    if (PerlinNoiseTextureNode.aAbstractGameSocket_9165 != null) {
                        PerlinNoiseTextureNode.aAbstractGameSocket_9165!!.method1700(36.toByte())
                        PerlinNoiseTextureNode.aAbstractGameSocket_9165 = null
                    }
                    RuntimeException_Sub1.anInt4596 = i_144_
                    Buffer.method3379(2, 9)
                    return
                }
                return
            }
            if (i == 5613) {
                anIntArray1149!![anInt1173++] = HslColorTableNode.anInt6634
                return
            }
            if (i == 5615) {
                anInt1170 -= 2
                val string = aStringArray1152!![anInt1170]!!
                val string_145_ = aStringArray1152!![anInt1170 + 1]
                if (string.length <= 320 && WorldMapRenderer.anInt4674 == 3 && (NpcDefinition.anInt2955 == 0 && Class367_Sub2.anInt7297 == 0)) {
                    if (PerlinNoiseTextureNode.aAbstractGameSocket_9165 != null) {
                        PerlinNoiseTextureNode.aAbstractGameSocket_9165!!.method1700(36.toByte())
                        PerlinNoiseTextureNode.aAbstractGameSocket_9165 = null
                    }
                    Class64_Sub3.aString5600 = string
                    TextureGenerator.aString2496 = string_145_
                    Buffer.method3379(2, 5)
                    return
                }
                return
            }
            if (i == 5616) {
                method3141(false, 11.toByte())
                return
            }
            if (i == 5617) {
                anIntArray1149!![anInt1173++] = LinkedNodeListIterator.anInt1645
                return
            }
            if (i == 5618) {
                anInt1173--
                return
            }
            if (i == 5619) {
                anInt1173--
                return
            }
            if (i == 5620) {
                anIntArray1149!![anInt1173++] = 0
                return
            }
            if (i == 5621) {
                anInt1170 -= 2
                anInt1173 -= 2
                return
            }
            if (i == 5622) return
            if (i == 5623) {
                if (NullOggStream.aString9043 == null) {
                    anIntArray1149!![anInt1173++] = 0
                    return
                } else anIntArray1149!![anInt1173++] = 1
                return
            }
            if (i == 5624) {
                anIntArray1149!![anInt1173++] = (TextureMetadataProvider.aLong4615 shr 32).toInt()
                anIntArray1149!![anInt1173++] = (TextureMetadataProvider.aLong4615 and 0xffffL).toInt()
                return
            }
            if (i == 5625) {
                anIntArray1149!![anInt1173++] = if (VideoStreamDecoder.aBoolean4127) 1 else 0
                return
            }
            if (i == 5626) {
                VideoStreamDecoder.aBoolean4127 = true
                method2172(84)
                return
            }
        } else if (i < 6100) {
            if (i == 6001) {
                val i_146_ = anIntArray1149!![--anInt1173]
                IntHashSet.aClass348_Sub51_3959!!.method3429(74.toByte(), (IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub10_7232!!), i_146_)
                TextureTileRenderer.method2953((-126).toByte())
                method243(37)
                RenderNode.aBoolean9719 = false
                return
            }
            if (i == 6002) {
                val bool_147_ = anIntArray1149!![--anInt1173] == 1
                IntHashSet.aClass348_Sub51_3959!!.method3429(74.toByte(), (IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub27_7255), if (bool_147_) 1 else 0)
                IntHashSet.aClass348_Sub51_3959!!.method3429(74.toByte(), (IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub27_7261), if (bool_147_) 1 else 0)
                TextureTileRenderer.method2953((-122).toByte())
                method3072(32.toByte())
                method243(37)
                RenderNode.aBoolean9719 = false
                return
            }
            if (i == 6003) {
                val bool_148_ = anIntArray1149!![--anInt1173] == 1
                IntHashSet.aClass348_Sub51_3959!!.method3429(74.toByte(), (IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub14_7250), if (bool_148_) 2 else 1)
                IntHashSet.aClass348_Sub51_3959!!.method3429(74.toByte(), (IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub14_7264), if (bool_148_) 2 else 1)
                EdgeDetectTextureNode.method3072((-106).toByte())
                method243(37)
                RenderNode.aBoolean9719 = false
                return
            }
            if (i == 6005) {
                IntHashSet.aClass348_Sub51_3959!!.method3429(74.toByte(), (IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub4_7220!!), if (anIntArray1149!![--anInt1173] == 1) 1 else 0)
                TextureTileRenderer.method2953((-111).toByte())
                method243(37)
                RenderNode.aBoolean9719 = false
                return
            }
            if (i == 6007) {
                IntHashSet.aClass348_Sub51_3959!!.method3429(74.toByte(), (IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub13_7236), anIntArray1149!![--anInt1173])
                method243(37)
                RenderNode.aBoolean9719 = false
                return
            }
            if (i == 6008) {
                IntHashSet.aClass348_Sub51_3959!!.method3429(74.toByte(), (IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub1_7246), if (anIntArray1149!![--anInt1173] == 1) 1 else 0)
                method243(37)
                RenderNode.aBoolean9719 = false
                return
            }
            if (i == 6010) {
                IntHashSet.aClass348_Sub51_3959!!.method3429(74.toByte(), (IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub21_7270), if (anIntArray1149!![--anInt1173] == 1) 1 else 0)
                method243(37)
                RenderNode.aBoolean9719 = false
                return
            }
            if (i == 6011) {
                IntHashSet.aClass348_Sub51_3959!!.method3429(74.toByte(), (IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub7_7238), anIntArray1149!![--anInt1173])
                TextureTileRenderer.method2953((-116).toByte())
                method243(37)
                RenderNode.aBoolean9719 = false
                return
            }
            if (i == 6012) {
                IntHashSet.aClass348_Sub51_3959!!.method3429(74.toByte(), (IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub28_7230), if (anIntArray1149!![--anInt1173] == 1) 1 else 0)
                method3038(-1)
                Class76.method773(true)
                method243(37)
                RenderNode.aBoolean9719 = false
                return
            }
            if (i == 6014) {
                IntHashSet.aClass348_Sub51_3959!!.method3429(74.toByte(), (IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub18_7259), if (anIntArray1149!![--anInt1173] == 1) 2 else 0)
                TextureTileRenderer.method2953((-112).toByte())
                method243(37)
                RenderNode.aBoolean9719 = false
                return
            }
            if (i == 6015) {
                IntHashSet.aClass348_Sub51_3959!!.method3429(74.toByte(), (IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub16_7247), if (anIntArray1149!![--anInt1173] == 1) 1 else 0)
                TextureTileRenderer.method2953((-127).toByte())
                method243(37)
                RenderNode.aBoolean9719 = false
                return
            }
            if (i == 6016) {
                IntHashSet.aClass348_Sub51_3959!!.method3429(74.toByte(), (IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub20_7248), anIntArray1149!![--anInt1173])
                method3553(false, 112.toByte(), IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub25_7271!!.method1829(-32350))
                method243(37)
                return
            }
            if (i == 6017) {
                IntHashSet.aClass348_Sub51_3959!!.method3429(74.toByte(), (IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub5_7240), if (anIntArray1149!![--anInt1173] == 1) 1 else 0)
                method352(1)
                method243(37)
                RenderNode.aBoolean9719 = false
                return
            }
            if (i == 6018) {
                IntHashSet.aClass348_Sub51_3959!!.method3429(74.toByte(), (IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub26_7272), anIntArray1149!![--anInt1173])
                method243(37)
                RenderNode.aBoolean9719 = false
                return
            }
            if (i == 6019) {
                val i_149_ = anIntArray1149!![--anInt1173]
                val i_150_ = IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub26_7260!!!!.method1838(-32350)
                if (i_149_ != i_150_) {
                    if (CameraOrModelTransform.method2653(true, WorldMapRenderer.anInt4674)) {
                        if (i_150_ == 0 && SlotBinding.anInt3428 != -1) {
                            method2732(0, SlotBinding.anInt3428, false, 94, (Class59_Sub2_Sub1.aJs5Archive_8667), i_149_)
                            method3093(87)
                            Class74.Companion.aBoolean1236 = false
                        } else if (i_149_ == 0) {
                            SoftwareSpriteRaster.method960(1)
                            Class74.Companion.aBoolean1236 = false
                        } else SkeletalAnimFrameLoader.method345(i_149_, (-49).toByte())
                    }
                    IntHashSet.aClass348_Sub51_3959!!.method3429(74.toByte(), (IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub26_7260), i_149_)
                    method243(37)
                    RenderNode.aBoolean9719 = false
                }
                return
            }
            if (i == 6020) {
                IntHashSet.aClass348_Sub51_3959!!.method3429(74.toByte(), (IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub26_7234), anIntArray1149!![--anInt1173])
                method243(37)
                RenderNode.aBoolean9719 = false
                return
            }
            if (i == 6021) {
                val i_151_ = IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub14_7250!!.method1778(-32350)
                IntHashSet.aClass348_Sub51_3959!!.method3429(74.toByte(), (IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub14_7264), if (anIntArray1149!![--anInt1173] == 1) 0 else i_151_)
                EdgeDetectTextureNode.method3072((-118).toByte())
                return
            }
            if (i == 6023) {
                val i_152_ = anIntArray1149!![--anInt1173]
                IntHashSet.aClass348_Sub51_3959!!.method3429(74.toByte(), (IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub15_7224), i_152_)
                method243(37)
                RenderNode.aBoolean9719 = false
                return
            }
            if (i == 6024) {
                IntHashSet.aClass348_Sub51_3959!!.method3429(74.toByte(), (IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub20_7216), anIntArray1149!![--anInt1173])
                method243(37)
                return
            }
            if (i == 6025) {
                IntHashSet.aClass348_Sub51_3959!!.method3429(74.toByte(), (IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub6_7226), anIntArray1149!![--anInt1173])
                method243(37)
                RenderNode.aBoolean9719 = false
                return
            }
            if (i == 6027) {
                var i_153_ = anIntArray1149!![--anInt1173]
                if (i_153_ < 0 || i_153_ > 1) i_153_ = 0
                WarpTextureNode.method3137(i_153_ == 1, (-24).toByte())
                return
            }
            if (i == 6028) {
                IntHashSet.aClass348_Sub51_3959!!.method3429(74.toByte(), (IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub22_7253), if (anIntArray1149!![--anInt1173] != 0) 1 else 0)
                method243(37)
                return
            }
            if (i == 6029) {
                IntHashSet.aClass348_Sub51_3959!!.method3429(74.toByte(), (IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub13_7236), anIntArray1149!![--anInt1173])
                method243(37)
                return
            }
            if (i == 6030) {
                IntHashSet.aClass348_Sub51_3959!!.method3429(74.toByte(), (IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub9_7256), if (anIntArray1149!![--anInt1173] != 0) 1 else 0)
                method243(37)
                TextureTileRenderer.method2953((-116).toByte())
                return
            }
            if (i == 6031) {
                var i_154_ = anIntArray1149!![--anInt1173]
                if (i_154_ < 0 || i_154_ > 5) i_154_ = 2
                method3553(false, 101.toByte(), i_154_)
                return
            }
            if (i == 6032) {
                anInt1173 -= 2
                val i_155_ = anIntArray1149!![anInt1173]
                val bool_156_ = anIntArray1149!![anInt1173 + 1] == 1
                IntHashSet.aClass348_Sub51_3959!!.method3429(74.toByte(), (IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub25_7251), i_155_)
                if (!bool_156_) IntHashSet.aClass348_Sub51_3959!!.method3429(74.toByte(), (IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub29_7229), 0)
                method243(37)
                RenderNode.aBoolean9719 = false
                return
            }
            if (i == 6033) {
                IntHashSet.aClass348_Sub51_3959!!.method3429(74.toByte(), (IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub17_7263), anIntArray1149!![--anInt1173])
                method243(37)
                return
            }
            if (i == 6034) {
                IntHashSet.aClass348_Sub51_3959!!.method3429(74.toByte(), (IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub24_7235), if (anIntArray1149!![--anInt1173] == 1) 1 else 0)
                method243(37)
                method3038(-1)
                RenderNode.aBoolean9719 = false
                return
            }
            if (i == 6035) {
                val i_157_ = IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub27_7255!!.method1840(-32350)
                IntHashSet.aClass348_Sub51_3959!!.method3429(74.toByte(), (IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub27_7261), if (anIntArray1149!![--anInt1173] == 1) 1 else i_157_)
                TextureTileRenderer.method2953((-110).toByte())
                method3072(125.toByte())
                return
            }
            if (i == 6036) {
                IntHashSet.aClass348_Sub51_3959!!.method3429(74.toByte(), (IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub23_7231), anIntArray1149!![--anInt1173])
                method243(37)
                RuntimeException_Sub1.aBoolean4604 = true
                return
            }
            if (i == 6037) {
                IntHashSet.aClass348_Sub51_3959!!.method3429(74.toByte(), (IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub26_7215), anIntArray1149!![--anInt1173])
                method243(37)
                RenderNode.aBoolean9719 = false
                return
            }
            if (i == 6038) {
                val i_158_ = anIntArray1149!![--anInt1173]
                val i_159_ = IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub26_7245!!.method1838(-32350)
                if (i_158_ != i_159_ && SlotBinding.anInt3428 == ParticleProcessor.anInt4270) {
                    if (!CameraOrModelTransform.method2653(true, WorldMapRenderer.anInt4674)) {
                        if (i_159_ == 0) {
                            method2732(0, SlotBinding.anInt3428, false, 127, (Class59_Sub2_Sub1.aJs5Archive_8667), i_158_)
                            method3093(118)
                            Class74.Companion.aBoolean1236 = false
                        } else if (i_158_ == 0) {
                            SoftwareSpriteRaster.method960(1)
                            Class74.Companion.aBoolean1236 = false
                        } else SkeletalAnimFrameLoader.method345(i_158_, (-52).toByte())
                    }
                    IntHashSet.aClass348_Sub51_3959!!.method3429(74.toByte(), (IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub26_7245), i_158_)
                    method243(37)
                    RenderNode.aBoolean9719 = false
                }
                return
            }
            if (i == 6039) {
                var i_160_ = anIntArray1149!![--anInt1173]
                if (i_160_ > 255 || i_160_ < 0) i_160_ = 0
                if (i_160_ != IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub19_7257!!.method1805(-32350)) {
                    IntHashSet.aClass348_Sub51_3959!!.method3429(74.toByte(), (IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub19_7257), i_160_)
                    method243(37)
                    RenderNode.aBoolean9719 = false
                }
                return
            }
            if (i == 6040) {
                val i_161_ = anIntArray1149!![--anInt1173]
                if (i_161_ != IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub3_7222!!.method1727(-32350)) {
                    IntHashSet.aClass348_Sub51_3959!!.method3429(74.toByte(), (IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub3_7222), i_161_)
                    method243(37)
                    RenderNode.aBoolean9719 = false
                    LoadingScreenImageNode.method3179(0)
                }
                return
            }
        } else if (i < 6200) {
            if (i == 6101) {
                anIntArray1149!![anInt1173++] = IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub10_7232!!.method1764(-32350)
                return
            }
            if (i == 6102) {
                anIntArray1149!![anInt1173++] = (if (IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub27_7255!!.method1840(-32350) == 1) 1 else 0)
                return
            }
            if (i == 6103) {
                anIntArray1149!![anInt1173++] = (if (IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub14_7250!!.method1778(-32350) == 2) 1 else 0)
                return
            }
            if (i == 6105) {
                anIntArray1149!![anInt1173++] = if (IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub4_7220!!.method1737(-32350) == 1) 1 else 0
                return
            }
            if (i == 6107) {
                anIntArray1149!![anInt1173++] = IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub13_7236!!.method1776(-32350)
                return
            }
            if (i == 6108) {
                anIntArray1149!![anInt1173++] = if (IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub1_7246!!.method1720(-32350) == 1) 1 else 0
                return
            }
            if (i == 6110) {
                anIntArray1149!![anInt1173++] = (if (IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub21_7270!!.method1812(-32350) == 1) 1 else 0)
                return
            }
            if (i == 6111) {
                anIntArray1149!![anInt1173++] = IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub7_7238!!.method1748(-32350)
                return
            }
            if (i == 6112) {
                anIntArray1149!![anInt1173++] = (if (IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub28_7230!!.method1845(-32350) == 1) 1 else 0)
                return
            }
            if (i == 6114) {
                anIntArray1149!![anInt1173++] = (if (IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub18_7259!!.method1800(-32350) == 2) 1 else 0)
                return
            }
            if (i == 6115) {
                anIntArray1149!![anInt1173++] = (if (IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub16_7247!!.method1789(-32350) == 1) 1 else 0)
                return
            }
            if (i == 6116) {
                anIntArray1149!![anInt1173++] = IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub20_7248!!.method1808(-32350)
                return
            }
            if (i == 6117) {
                anIntArray1149!![anInt1173++] = if (IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub5_7240!!.method1739(-32350) == 1) 1 else 0
                return
            }
            if (i == 6118) {
                anIntArray1149!![anInt1173++] = IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub26_7272!!.method1838(-32350)
                return
            }
            if (i == 6119) {
                anIntArray1149!![anInt1173++] = IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub26_7260!!.method1838(-32350)
                return
            }
            if (i == 6120) {
                anIntArray1149!![anInt1173++] = IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub26_7234!!.method1838(-32350)
                return
            }
            if (i == 6123) {
                anIntArray1149!![anInt1173++] = method197(false)
                return
            }
            if (i == 6124) {
                anIntArray1149!![anInt1173++] = IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub20_7216!!.method1808(-32350)
                return
            }
            if (i == 6125) {
                anIntArray1149!![anInt1173++] = IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub6_7226!!.method1743(-32350)
                return
            }
            if (i == 6127) {
                anIntArray1149!![anInt1173++] = (if (IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub12_7243!!!!.method1771(-32350) == 1) 1 else 0)
                return
            }
            if (i == 6128) {
                anIntArray1149!![anInt1173++] = (if (IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub22_7253!!.method1815(-32350) == 1) 1 else 0)
                return
            }
            if (i == 6129) {
                anIntArray1149!![anInt1173++] = IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub13_7236!!.method1776(-32350)
                return
            }
            if (i == 6130) {
                anIntArray1149!![anInt1173++] = if (IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub9_7256!!.method1759(-32350) == 1) 1 else 0
                return
            }
            if (i == 6131) {
                anIntArray1149!![anInt1173++] = IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub25_7271!!.method1829(-32350)
                return
            }
            if (i == 6132) {
                anIntArray1149!![anInt1173++] = IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub25_7251!!.method1829(-32350)
                return
            }
            if (i == 6133) {
                anIntArray1149!![anInt1173++] = if ((VorbisOggDecoder.aPrivilegedOperationWorker_8992!!.aBoolean3777) && !(VorbisOggDecoder.aPrivilegedOperationWorker_8992!!.aBoolean3794)) 1 else 0
                return
            }
            if (i == 6135) {
                anIntArray1149!![anInt1173++] = IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub17_7263!!.method1798(-32350)
                return
            }
            if (i == 6136) {
                anIntArray1149!![anInt1173++] = (if (IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub24_7235!!.method1820(-32350) == 1) 1 else 0)
                return
            }
            if (i == 6138) {
                anIntArray1149!![anInt1173++] = method1781(IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub25_7271!!.method1829(-32350), -84, 200)
                return
            }
            if (i == 6139) {
                anIntArray1149!![anInt1173++] = IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub23_7231!!.method1818(-32350)
                return
            }
            if (i == 6142) {
                anIntArray1149!![anInt1173++] = IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub26_7215!!.method1838(-32350)
                return
            }
            if (i == 6143) {
                anIntArray1149!![anInt1173++] = IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub26_7245!!.method1838(-32350)
                return
            }
            if (i == 6144) {
                anIntArray1149!![anInt1173++] = if (TheoraVideoStream.aBoolean9038) 1 else 0
                return
            }
            if (i == 6145) {
                anIntArray1149!![anInt1173++] = IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub19_7257!!.method1805(-32350)
                return
            }
            if (i == 6146) {
                anIntArray1149!![anInt1173++] = IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub3_7222!!.method1727(-32350)
                return
            }
            if (i == 6147) {
                anIntArray1149!![anInt1173++] = if (NoiseTextureNode.aClass348_Sub4_9264!!.anInt6609 < 512 || TheoraVideoStream.aBoolean9038 || NpcSummaryDefinition.aBoolean1952) 1 else 0
                return
            }
            if (i == 6148) {
                anIntArray1149!![anInt1173++] = if (TextureFormatInfo.aBoolean3847) 1 else 0
                return
            }
        } else if (i < 6300) {
            if (i == 6200) {
                anInt1173 -= 2
                AbstractMenuEntry.aShort1700 = anIntArray1149!![anInt1173].toShort()
                if (AbstractMenuEntry.aShort1700 <= 0) AbstractMenuEntry.aShort1700 = 256.toShort()
                HeapDiagnosticsHolder.aShort2250 = anIntArray1149!![anInt1173 + 1].toShort()
                if (HeapDiagnosticsHolder.aShort2250 <= 0) HeapDiagnosticsHolder.aShort2250 = 205.toShort()
                return
            }
            if (i == 6201) {
                anInt1173 -= 2
                NullOggStream.aShort9044 = anIntArray1149!![anInt1173].toShort()
                if (NullOggStream.aShort9044 <= 0) NullOggStream.aShort9044 = 256.toShort()
                TextureLoaderUtil.aShort3992 = anIntArray1149!![anInt1173 + 1].toShort()
                if (TextureLoaderUtil.aShort3992 <= 0) TextureLoaderUtil.aShort3992 = 320.toShort()
                return
            }
            if (i == 6202) {
                anInt1173 -= 4
                CacheEntryReference.aShort9555 = anIntArray1149!![anInt1173].toShort()
                if (CacheEntryReference.aShort9555 <= 0) CacheEntryReference.aShort9555 = 1.toShort()
                ColourAdjustment.aShort851 = anIntArray1149!![anInt1173 + 1].toShort()
                if (ColourAdjustment.aShort851 <= 0) ColourAdjustment.aShort851 = 32767.toShort()
                else if (ColourAdjustment.aShort851 < CacheEntryReference.aShort9555) ColourAdjustment.aShort851 = CacheEntryReference.aShort9555
                Class367_Sub8.aShort7355 = anIntArray1149!![anInt1173 + 2].toShort()
                if (Class367_Sub8.aShort7355 <= 0) Class367_Sub8.aShort7355 = 1.toShort()
                RefCountedHandle.aShort2269 = anIntArray1149!![anInt1173 + 3].toShort()
                if (RefCountedHandle.aShort2269 <= 0) RefCountedHandle.aShort2269 = 32767.toShort()
                else {
                    if (RefCountedHandle.aShort2269 < Class367_Sub8.aShort7355) RefCountedHandle.aShort2269 = Class367_Sub8.aShort7355
                    return
                }
                return
            }
            if (i == 6203) {
                LoadingScreenImageNode.method3174(0, 0, AbstractTileShape.aWidgetComponent_6561!!.anInt709, false, 74.toByte(), AbstractTileShape.aWidgetComponent_6561!!.anInt789)
                anIntArray1149!![anInt1173++] = WidgetComponentNode.anInt4656
                anIntArray1149!![anInt1173++] = GroundDecorRenderer.anInt3643
                return
            }
            if (i == 6204) {
                anIntArray1149!![anInt1173++] = NullOggStream.aShort9044.toInt()
                anIntArray1149!![anInt1173++] = TextureLoaderUtil.aShort3992.toInt()
                return
            }
            if (i == 6205) {
                anIntArray1149!![anInt1173++] = AbstractMenuEntry.aShort1700.toInt()
                anIntArray1149!![anInt1173++] = HeapDiagnosticsHolder.aShort2250.toInt()
                return
            }
        } else if (i < 6400) {
            if (i == 6300) {
                anIntArray1149!![anInt1173++] = (method599(-76) / 60000L).toInt()
                return
            }
            if (i == 6301) {
                anIntArray1149!![anInt1173++] = (method599(-77) / 86400000L).toInt() - 11745
                return
            }
            if (i == 6302) {
                anInt1173 -= 3
                val i_162_ = anIntArray1149!![anInt1173]
                val i_163_ = anIntArray1149!![anInt1173 + 1]
                val i_164_ = anIntArray1149!![anInt1173 + 2]
                aCalendar1160!!.clear()
                aCalendar1160!!.set(11, 12)
                aCalendar1160!!.set(i_164_, i_163_, i_162_)
                var i_165_ = ((aCalendar1160!!.getTime().getTime() / 86400000L).toInt() - 11745)
                if (i_164_ < 1970) i_165_--
                anIntArray1149!![anInt1173++] = i_165_
                return
            }
            if (i == 6303) {
                aCalendar1160!!.clear()
                aCalendar1160!!.setTime(Date(method599(-59)))
                anIntArray1149!![anInt1173++] = aCalendar1160!!.get(1)
                return
            }
            if (i == 6304) {
                val i_166_ = anIntArray1149!![--anInt1173]
                var bool_167_ = true
                if (i_166_ < 0) bool_167_ = (i_166_ + 1) % 4 == 0
                else if (i_166_ < 1582) bool_167_ = i_166_ % 4 == 0
                else if (i_166_ % 4 != 0) bool_167_ = false
                else if (i_166_ % 100 != 0) bool_167_ = true
                else if (i_166_ % 400 != 0) bool_167_ = false
                anIntArray1149!![anInt1173++] = if (bool_167_) 1 else 0
                return
            }
        } else if (i < 6500) {
            if (i == 6405) {
                anIntArray1149!![anInt1173++] = if (Class67.Companion.method717(-2511)) 1 else 0
                return
            }
            if (i == 6406) {
                anIntArray1149!![anInt1173++] = if (VideoAdChecker.method1891(314376967)) 1 else 0
                return
            }
        } else if (i < 6600) {
            if (i == 6500) {
                if (WorldMapRenderer.anInt4674 != 7 || NpcDefinition.anInt2955 != 0 || Class367_Sub2.anInt7297 != 0) anIntArray1149!![anInt1173++] = 1
                else {
                    if (ModelBatchBase.aBoolean1899) anIntArray1149!![anInt1173++] = 0
                    else {
                        if (WorldMapRenderer.aLong4683 > method599(-126) - 1000L) anIntArray1149!![anInt1173++] = 1
                        else {
                            ModelBatchBase.aBoolean1899 = true
                            val class348_sub47 = method2148((TheoraVideoStream.aFontMetaRef_9034), (TheoraVideoStream.aClass77_9029), -115)
                            class348_sub47.aClass348_Sub49_Sub2_7116!!.writeInt(101.toByte(), ScrollbarComponent.anInt8349)
                            InterfaceComponentGroup.method3243(118, class348_sub47)
                            anIntArray1149!![anInt1173++] = 0
                            return
                        }
                        return
                    }
                    return
                }
                return
            }
            if (i == 6501) {
                val class110_sub1 = method2487(-97)
                if (class110_sub1 == null) {
                    anIntArray1149!![anInt1173++] = -1
                    anIntArray1149!![anInt1173++] = 0
                    aStringArray1152!![anInt1170++] = ""
                    anIntArray1149!![anInt1173++] = 0
                    aStringArray1152!![anInt1170++] = ""
                    anIntArray1149!![anInt1173++] = 0
                    anIntArray1149!![anInt1173++] = 0
                    aStringArray1152!![anInt1170++] = ""
                    return
                } else {
                    anIntArray1149!![anInt1173++] = class110_sub1.anInt5786
                    anIntArray1149!![anInt1173++] = class110_sub1.anInt1708
                    aStringArray1152!![anInt1170++] = class110_sub1.aString5787
                    val class283 = class110_sub1.method1038(false)
                    anIntArray1149!![anInt1173++] = class283.anInt3657
                    aStringArray1152!![anInt1170++] = class283.aString3663
                    anIntArray1149!![anInt1173++] = class110_sub1.anInt1704
                    anIntArray1149!![anInt1173++] = class110_sub1.anInt5788
                    aStringArray1152!![anInt1170++] = class110_sub1.aString5794
                }
                return
            }
            if (i == 6502) {
                val class110_sub1 = method170(true)
                if (class110_sub1 == null) {
                    anIntArray1149!![anInt1173++] = -1
                    anIntArray1149!![anInt1173++] = 0
                    aStringArray1152!![anInt1170++] = ""
                    anIntArray1149!![anInt1173++] = 0
                    aStringArray1152!![anInt1170++] = ""
                    anIntArray1149!![anInt1173++] = 0
                    anIntArray1149!![anInt1173++] = 0
                    aStringArray1152!![anInt1170++] = ""
                    return
                } else {
                    anIntArray1149!![anInt1173++] = class110_sub1.anInt5786
                    anIntArray1149!![anInt1173++] = class110_sub1.anInt1708
                    aStringArray1152!![anInt1170++] = class110_sub1.aString5787
                    val class283 = class110_sub1.method1038(false)
                    anIntArray1149!![anInt1173++] = class283.anInt3657
                    aStringArray1152!![anInt1170++] = class283.aString3663
                    anIntArray1149!![anInt1173++] = class110_sub1.anInt1704
                    anIntArray1149!![anInt1173++] = class110_sub1.anInt5788
                    aStringArray1152!![anInt1170++] = class110_sub1.aString5794
                }
                return
            }
            if (i == 6503) {
                val i_168_ = anIntArray1149!![--anInt1173]
                val string = aStringArray1152!![--anInt1170]
                if (WorldMapRenderer.anInt4674 != 7 || NpcDefinition.anInt2955 != 0 || Class367_Sub2.anInt7297 != 0) anIntArray1149!![anInt1173++] = 0
                else {
                    anIntArray1149!![anInt1173++] = (if (method2972(string, i_168_, -42)) 1 else 0)
                    return
                }
                return
            }
            if (i == 6506) {
                val i_169_ = anIntArray1149!![--anInt1173]
                val class110_sub1 = method1742(false, i_169_)
                if (class110_sub1 == null) {
                    anIntArray1149!![anInt1173++] = -1
                    aStringArray1152!![anInt1170++] = ""
                    anIntArray1149!![anInt1173++] = 0
                    aStringArray1152!![anInt1170++] = ""
                    anIntArray1149!![anInt1173++] = 0
                    anIntArray1149!![anInt1173++] = 0
                    aStringArray1152!![anInt1170++] = ""
                    return
                } else {
                    anIntArray1149!![anInt1173++] = class110_sub1.anInt1708
                    aStringArray1152!![anInt1170++] = class110_sub1.aString5787
                    val class283 = class110_sub1.method1038(false)
                    anIntArray1149!![anInt1173++] = class283.anInt3657
                    aStringArray1152!![anInt1170++] = class283.aString3663
                    anIntArray1149!![anInt1173++] = class110_sub1.anInt1704
                    anIntArray1149!![anInt1173++] = class110_sub1.anInt5788
                    aStringArray1152!![anInt1170++] = class110_sub1.aString5794
                }
                return
            }
            if (i == 6507) {
                anInt1173 -= 4
                val i_170_ = anIntArray1149!![anInt1173]
                val bool_171_ = anIntArray1149!![anInt1173 + 1] == 1
                val i_172_ = anIntArray1149!![anInt1173 + 2]
                val bool_173_ = anIntArray1149!![anInt1173 + 3] == 1
                MinimapPositionState.method2283(bool_173_, 0, i_172_, i_170_, bool_171_)
                return
            }
            if (i == 6508) {
                SpriteRenderEntry.method3283(-47)
                return
            }
            if (i == 6509) {
                if (WorldMapRenderer.anInt4674 == 7) {
                    HslAdjustTextureNode.aBoolean9403 = anIntArray1149!![--anInt1173] == 1
                    return
                }
                return
            }
            if (i == 6510) {
                anIntArray1149!![anInt1173++] = ConfigFlagUtil.anInt3234
                return
            }
        } else if (i >= 6700) {
            if (i < 6800 && SceneRegionState.aHudTabPanel_196 == ParticleEmitterDef.aHudTabPanel_4953) {
                if (i == 6700) {
                    var i_174_ = MinimapSpriteRenderer.aHashtable_4915!!.method3474(1)
                    if (RenderNode.anInt9721 != -1) i_174_++
                    anIntArray1149!![anInt1173++] = i_174_
                    return
                }
                if (i == 6701) {
                    var i_175_ = anIntArray1149!![--anInt1173]
                    if (RenderNode.anInt9721 != -1) {
                        if (i_175_ == 0) {
                            anIntArray1149!![anInt1173++] = RenderNode.anInt9721
                            return
                        }
                        i_175_--
                    }
                    var class348_sub41 = (MinimapSpriteRenderer.aHashtable_4915!!.method3484(0) as RegionSceneShifter?)
                    while (i_175_-- > 0) class348_sub41 = (MinimapSpriteRenderer.aHashtable_4915!!.method3482(0) as RegionSceneShifter?)
                    anIntArray1149!![anInt1173++] = class348_sub41!!.anInt7050
                    return
                }
                if (i == 6702) {
                    val i_176_ = anIntArray1149!![--anInt1173]
                    if (WarpTextureNode.aWidgetComponentArrayArray9427!![i_176_] == null) aStringArray1152!![anInt1170++] = ""
                    else {
                        val string = (WarpTextureNode.aWidgetComponentArrayArray9427!![i_176_]!![0]!!.aString721)
                        if (string == null) aStringArray1152!![anInt1170++] = ""
                        else {
                            aStringArray1152!![anInt1170++] = string.substring(0, string.indexOf(':'))
                            return
                        }
                        return
                    }
                    return
                }
                if (i == 6703) {
                    val i_177_ = anIntArray1149!![--anInt1173]
                    if (WarpTextureNode.aWidgetComponentArrayArray9427!![i_177_] == null) anIntArray1149!![anInt1173++] = 0
                    else {
                        anIntArray1149!![anInt1173++] = (WarpTextureNode.aWidgetComponentArrayArray9427!![i_177_])!!.size
                        return
                    }
                    return
                }
                if (i == 6704) {
                    anInt1173 -= 2
                    val i_178_ = anIntArray1149!![anInt1173]
                    val i_179_ = anIntArray1149!![anInt1173 + 1]
                    if (WarpTextureNode.aWidgetComponentArrayArray9427!![i_178_] == null) aStringArray1152!![anInt1170++] = ""
                    else {
                        val string = (WarpTextureNode.aWidgetComponentArrayArray9427!![i_178_]!![i_179_]!!.aString721)
                        if (string == null) aStringArray1152!![anInt1170++] = ""
                        else {
                            aStringArray1152!![anInt1170++] = string
                            return
                        }
                        return
                    }
                    return
                }
                if (i == 6705) {
                    anInt1173 -= 2
                    val i_180_ = anIntArray1149!![anInt1173]
                    val i_181_ = anIntArray1149!![anInt1173 + 1]
                    if (WarpTextureNode.aWidgetComponentArrayArray9427!![i_180_] == null) anIntArray1149!![anInt1173++] = 0
                    else {
                        anIntArray1149!![anInt1173++] = WarpTextureNode.aWidgetComponentArrayArray9427!![i_180_]!![i_181_]!!.anInt732
                        return
                    }
                    return
                }
                if (i == 6706) return
                if (i == 6707) {
                    anInt1173 -= 3
                    val i_182_ = anIntArray1149!![anInt1173]
                    val i_183_ = anIntArray1149!![anInt1173 + 1]
                    val i_184_ = anIntArray1149!![anInt1173 + 2]
                    method2780(i_184_, "", 111.toByte(), 1, i_182_ shl 16 or i_183_)
                    return
                }
                if (i == 6708) {
                    anInt1173 -= 3
                    val i_185_ = anIntArray1149!![anInt1173]
                    val i_186_ = anIntArray1149!![anInt1173 + 1]
                    val i_187_ = anIntArray1149!![anInt1173 + 2]
                    method2780(i_187_, "", 127.toByte(), 2, i_185_ shl 16 or i_186_)
                    return
                }
                if (i == 6709) {
                    anInt1173 -= 3
                    val i_188_ = anIntArray1149!![anInt1173]
                    val i_189_ = anIntArray1149!![anInt1173 + 1]
                    val i_190_ = anIntArray1149!![anInt1173 + 2]
                    method2780(i_190_, "", 118.toByte(), 3, i_188_ shl 16 or i_189_)
                    return
                }
                if (i == 6710) {
                    anInt1173 -= 3
                    val i_191_ = anIntArray1149!![anInt1173]
                    val i_192_ = anIntArray1149!![anInt1173 + 1]
                    val i_193_ = anIntArray1149!![anInt1173 + 2]
                    method2780(i_193_, "", 8.toByte(), 4, i_191_ shl 16 or i_192_)
                    return
                }
                if (i == 6711) {
                    anInt1173 -= 3
                    val i_194_ = anIntArray1149!![anInt1173]
                    val i_195_ = anIntArray1149!![anInt1173 + 1]
                    val i_196_ = anIntArray1149!![anInt1173 + 2]
                    method2780(i_196_, "", 125.toByte(), 5, i_194_ shl 16 or i_195_)
                    return
                }
                if (i == 6712) {
                    anInt1173 -= 3
                    val i_197_ = anIntArray1149!![anInt1173]
                    val i_198_ = anIntArray1149!![anInt1173 + 1]
                    val i_199_ = anIntArray1149!![anInt1173 + 2]
                    method2780(i_199_, "", 108.toByte(), 6, i_197_ shl 16 or i_198_)
                    return
                }
                if (i == 6713) {
                    anInt1173 -= 3
                    val i_200_ = anIntArray1149!![anInt1173]
                    val i_201_ = anIntArray1149!![anInt1173 + 1]
                    val i_202_ = anIntArray1149!![anInt1173 + 2]
                    CharacterRenderState.method2780(i_202_, "", (-106).toByte(), 7, i_200_ shl 16 or i_201_)
                    return
                }
                if (i == 6714) {
                    anInt1173 -= 3
                    val i_203_ = anIntArray1149!![anInt1173]
                    val i_204_ = anIntArray1149!![anInt1173 + 1]
                    val i_205_ = anIntArray1149!![anInt1173 + 2]
                    method2780(i_205_, "", 117.toByte(), 8, i_203_ shl 16 or i_204_)
                    return
                }
                if (i == 6715) {
                    anInt1173 -= 3
                    val i_206_ = anIntArray1149!![anInt1173]
                    val i_207_ = anIntArray1149!![anInt1173 + 1]
                    val i_208_ = anIntArray1149!![anInt1173 + 2]
                    CharacterRenderState.method2780(i_208_, "", (-35).toByte(), 9, i_206_ shl 16 or i_207_)
                    return
                }
                if (i == 6716) {
                    anInt1173 -= 3
                    val i_209_ = anIntArray1149!![anInt1173]
                    val i_210_ = anIntArray1149!![anInt1173 + 1]
                    val i_211_ = anIntArray1149!![anInt1173 + 2]
                    method2780(i_211_, "", 107.toByte(), 10, i_209_ shl 16 or i_210_)
                    return
                }
                if (i == 6717) {
                    anInt1173 -= 3
                    val i_212_ = anIntArray1149!![anInt1173]
                    val i_213_ = anIntArray1149!![anInt1173 + 1]
                    val i_214_ = anIntArray1149!![anInt1173 + 2]
                    val class46 = NpcReference.method2957(i_214_, (-54).toByte(), i_212_ shl 16 or i_213_)
                    TileRenderState.method2678(-2049)
                    val class348_sub44 = Client.method105(class46!!)!!
                    MapRegionLoaderThread.method2666((class348_sub44.anInt7093), class348_sub44.method3307(100), class46, 21.toByte())
                    return
                }
            } else if (i < 6900) {
                if (i == 6800) {
                    val i_215_ = anIntArray1149!![--anInt1173]
                    val class42 = TheoraVideoStream.aConfigDefinitionLoader_9031!!.method1225(i_215_, 96.toByte())
                    if (class42!!.aString597 == null) aStringArray1152!![anInt1170++] = ""
                    else {
                        aStringArray1152!![anInt1170++] = class42.aString597!!
                        return
                    }
                    return
                }
                if (i == 6801) {
                    val i_216_ = anIntArray1149!![--anInt1173]
                    val class42 = TheoraVideoStream.aConfigDefinitionLoader_9031!!.method1225(i_216_, 111.toByte())
                    anIntArray1149!![anInt1173++] = class42!!.anInt578
                    return
                }
                if (i == 6802) {
                    val i_217_ = anIntArray1149!![--anInt1173]
                    val class42 = TheoraVideoStream.aConfigDefinitionLoader_9031!!.method1225(i_217_, 91.toByte())
                    anIntArray1149!![anInt1173++] = class42!!.anInt576
                    return
                }
                if (i == 6803) {
                    val i_218_ = anIntArray1149!![--anInt1173]
                    val class42 = TheoraVideoStream.aConfigDefinitionLoader_9031!!.method1225(i_218_, 44.toByte())
                    anIntArray1149!![anInt1173++] = class42!!.anInt596
                    return
                }
                if (i == 6804) {
                    anInt1173 -= 2
                    val i_219_ = anIntArray1149!![anInt1173]
                    val i_220_ = anIntArray1149!![anInt1173 + 1]
                    val class254 = ProjectionCameraTransform.aEmoteDefCache_5764!!.method2600(i_220_, 28364)
                    if (class254.method1925(false)) aStringArray1152!![anInt1170++] = (TheoraVideoStream.aConfigDefinitionLoader_9031!!.method1225(i_219_, 79.toByte())!!.method376(class254.aString3258, i_220_, 126.toByte())!!)
                    else {
                        anIntArray1149!![anInt1173++] = (TheoraVideoStream.aConfigDefinitionLoader_9031!!.method1225(i_219_, 50.toByte())!!.method378(class254.anInt3256, i_220_, false))
                        return
                    }
                    return
                }
            } else if (i < 7000) {
                if (i == 6900) {
                    anIntArray1149!![anInt1173++] = if (RangeThresholdTextureNode.aBoolean9103 && !PlayerUpdateDecoder.aBoolean1915) 1 else 0
                    return
                }
                if (i == 6901) {
                    anIntArray1149!![anInt1173++] = InputSettingsState.anInt1758
                    return
                }
                if (i == 6902) {
                    anIntArray1149!![anInt1173++] = GlArrayBufferObject.anInt4716
                    return
                }
                if (i == 6903) {
                    anIntArray1149!![anInt1173++] = ImageFrameCache.anInt4026
                    return
                }
                if (i == 6904) {
                    anIntArray1149!![anInt1173++] = FrameBufferObject.anInt4870
                    return
                }
                if (i == 6905) {
                    var string: String? = ""
                    if (ChatScriptListNode.aLinkedQueueNode_9536 != null) {
                        if (ChatScriptListNode.aLinkedQueueNode_9536!!.anObject1998 != null) string = (ChatScriptListNode.aLinkedQueueNode_9536!!.anObject1998) as String?
                        else string = SceneObjectAnimator.method1669(-19918, (ChatScriptListNode.aLinkedQueueNode_9536!!.anInt2000))
                    }
                    aStringArray1152!![anInt1170++] = string!!
                    return
                }
                if (i == 6906) {
                    anIntArray1149!![anInt1173++] = FloatGrid.anInt4976
                    return
                }
                if (i == 6907) {
                    anIntArray1149!![anInt1173++] = FrameStatsReset.anInt5797
                    return
                }
                if (i == 6908) {
                    anIntArray1149!![anInt1173++] = HslColorTableNode.anInt6632
                    return
                }
                if (i == 6909) {
                    anIntArray1149!![anInt1173++] = if (BufferToggleState.aBoolean3706) 1 else 0
                    return
                }
                if (i == 6910) {
                    anIntArray1149!![anInt1173++] = ModelDataCache.anInt359
                    return
                }
                if (i == 6911) {
                    anIntArray1149!![anInt1173++] = GameAppletFrame.anInt37
                    return
                }
                if (i == 6912) {
                    anIntArray1149!![anInt1173++] = AbstractTileShape.anInt6551
                    return
                }
            } else if (i < 7100) {
                if (i == 7000) {
                    val i_221_ = method2478(1000)
                    Class64_Sub3.anInt5584 = IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub25_7271!!.method1829(-32350)
                    anIntArray1149!![anInt1173++] = Class64_Sub3.anInt5584
                    anIntArray1149!![anInt1173++] = i_221_
                    TextureTileRenderer.method2953((-113).toByte())
                    method243(37)
                    RenderNode.aBoolean9719 = false
                    return
                }
                if (i == 7001) {
                    PlayerUpdateDecoder.method1140(47)
                    TextureTileRenderer.method2953((-126).toByte())
                    method243(37)
                    RenderNode.aBoolean9719 = false
                    return
                }
                if (i == 7002) {
                    NanoTimer.method447((-59).toByte())
                    TextureTileRenderer.method2953((-124).toByte())
                    method243(37)
                    RenderNode.aBoolean9719 = false
                    return
                }
                if (i == 7003) {
                    ServerConnectionInfo.method1263(true)
                    TextureTileRenderer.method2953((-106).toByte())
                    method243(37)
                    RenderNode.aBoolean9719 = false
                    return
                }
                if (i == 7004) {
                    method3076(0, true)
                    TextureTileRenderer.method2953((-107).toByte())
                    method243(37)
                    RenderNode.aBoolean9719 = false
                    return
                }
                if (i == 7005) {
                    IntHashSet.aClass348_Sub51_3959!!.method3429(74.toByte(), (IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub29_7229), 0)
                    method243(37)
                    RenderNode.aBoolean9719 = false
                    return
                }
                if (i == 7006) {
                    if (Class64_Sub3.anInt5584 == 2) ScreenAnchorAlignment.aBoolean2881 = true
                    else {
                        if (Class64_Sub3.anInt5584 == 1) VideoStreamDecoder.aBoolean4117 = true
                        else {
                            if (Class64_Sub3.anInt5584 == 3) AbstractTileShape.aBoolean6558 = true
                            return
                        }
                        return
                    }
                    return
                }
                if (i == 7007) {
                    anIntArray1149!![anInt1173++] = IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub29_7229!!.method1848(-32350)
                    return
                }
            } else if (i < 7200) {
                if (i == 7100) {
                    anInt1173 -= 2
                    val i_222_ = anIntArray1149!![anInt1173]
                    var i_223_ = anIntArray1149!![anInt1173 + 1]
                    if (i_222_ != -1) {
                        if (i_223_ > 255) i_223_ = 255
                        else if (i_223_ < 0) i_223_ = 0
                        method524(i_223_, false, i_222_, -122)
                    }
                    return
                }
                if (i == 7101) {
                    val i_224_ = anIntArray1149!![--anInt1173]
                    if (i_224_ != -1) method690(17.toByte(), i_224_)
                    return
                }
                if (i == 7102) {
                    val i_225_ = anIntArray1149!![--anInt1173]
                    if (i_225_ != -1) FontDefinition.method1189(-1, i_225_)
                    return
                }
                if (i == 7103) {
                    anIntArray1149!![anInt1173++] = if (method3131(50.toByte(), "jagtheora")) 1 else 0
                    return
                }
            } else if (i < 7300) {
                if (i == 7201) {
                    anIntArray1149!![anInt1173++] = if (IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub4_7220!!.method1736(123)) 1 else 0
                    return
                }
                if (i == 7202) {
                    anIntArray1149!![anInt1173++] = if (IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub21_7270!!.method1809(117)) 1 else 0
                    return
                }
                if (i == 7203) {
                    anIntArray1149!![anInt1173++] = if (IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub7_7238!!.method1747(111)) 1 else 0
                    return
                }
                if (i == 7204) {
                    anIntArray1149!![anInt1173++] = if (IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub18_7259!!.method1801(125)) 1 else 0
                    return
                }
                if (i == 7205) {
                    anIntArray1149!![anInt1173++] = if (IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub20_7216!!.method1806(108) && FacingDirectionNode.aRenderer6654!!.method3699()) 1 else 0
                    return
                }
                if (i == 7206) {
                    anIntArray1149!![anInt1173++] = if (IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub15_7224!!.method1786(93)) 1 else 0
                    return
                }
                if (i == 7207) {
                    anIntArray1149!![anInt1173++] = if (IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub6_7226!!.method1744(103)) 1 else 0
                    return
                }
                if (i == 7208) {
                    anIntArray1149!![anInt1173++] = if (IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub12_7243!!.method1774(120) && FacingDirectionNode.aRenderer6654!!.method3627()) 1 else 0
                    return
                }
                if (i == 7209) {
                    anIntArray1149!![anInt1173++] = if (IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub9_7256!!.method1757(115)) 1 else 0
                    return
                }
                if (i == 7210) {
                    anIntArray1149!![anInt1173++] = if (IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub24_7235!!.method1824(124)) 1 else 0
                    return
                }
                if (i == 7211) {
                    anIntArray1149!![anInt1173++] = if (IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub23_7231!!.method1817(108)) 1 else 0
                    return
                }
                if (i == 7212) {
                    anIntArray1149!![anInt1173++] = if (IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub16_7247!!.method1790(94)) 1 else 0
                    return
                }
                if (i == 7213) {
                    anIntArray1149!![anInt1173++] = if (IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub3_7222!!.method1729(91)) 1 else 0
                    return
                }
                if (i == 7214) {
                    anIntArray1149!![anInt1173++] = if (IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub25_7251!!.method1831(95)) 1 else 0
                    return
                }
            } else if (i < 7400) {
                if (i == 7301) {
                    val i_226_ = anIntArray1149!![--anInt1173]
                    anIntArray1149!![anInt1173++] = IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub4_7220!!.method1714(3, i_226_)
                    return
                }
                if (i == 7302) {
                    val i_227_ = anIntArray1149!![--anInt1173]
                    anIntArray1149!![anInt1173++] = IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub21_7270!!.method1714(3, i_227_)
                    return
                }
                if (i == 7303) {
                    val i_228_ = anIntArray1149!![--anInt1173]
                    anIntArray1149!![anInt1173++] = IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub7_7238!!.method1714(3, i_228_)
                    return
                }
                if (i == 7304) {
                    val i_229_ = anIntArray1149!![--anInt1173]
                    anIntArray1149!![anInt1173++] = IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub18_7259!!.method1714(3, i_229_)
                    return
                }
                if (i == 7305) {
                    val i_230_ = anIntArray1149!![--anInt1173]
                    if (FacingDirectionNode.aRenderer6654!!.method3699()) {
                        anIntArray1149!![anInt1173++] = IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub20_7216!!.method1714(3, i_230_)
                        return
                    } else anIntArray1149!![anInt1173++] = 3
                    return
                }
                if (i == 7306) {
                    val i_231_ = anIntArray1149!![--anInt1173]
                    anIntArray1149!![anInt1173++] = IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub15_7224!!.method1714(3, i_231_)
                    return
                }
                if (i == 7307) {
                    val i_232_ = anIntArray1149!![--anInt1173]
                    anIntArray1149!![anInt1173++] = IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub6_7226!!.method1714(3, i_232_)
                    return
                }
                if (i == 7308) {
                    val i_233_ = anIntArray1149!![--anInt1173]
                    if (FacingDirectionNode.aRenderer6654!!.method3627()) {
                        anIntArray1149!![anInt1173++] = IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub12_7243!!.method1714(3, i_233_)
                        return
                    } else anIntArray1149!![anInt1173++] = 3
                    return
                }
                if (i == 7309) {
                    val i_234_ = anIntArray1149!![--anInt1173]
                    anIntArray1149!![anInt1173++] = IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub9_7256!!.method1714(3, i_234_)
                    return
                }
                if (i == 7310) {
                    val i_235_ = anIntArray1149!![--anInt1173]
                    anIntArray1149!![anInt1173++] = IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub24_7235!!.method1714(3, i_235_)
                    return
                }
                if (i == 7311) {
                    val i_236_ = anIntArray1149!![--anInt1173]
                    anIntArray1149!![anInt1173++] = IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub23_7231!!.method1714(3, i_236_)
                    return
                }
                if (i == 7312) {
                    val i_237_ = anIntArray1149!![--anInt1173]
                    anIntArray1149!![anInt1173++] = IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub16_7247!!.method1714(3, i_237_)
                    return
                }
                if (i == 7313) {
                    val i_238_ = anIntArray1149!![--anInt1173]
                    anIntArray1149!![anInt1173++] = IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub3_7222!!!!.method1714(3, i_238_)
                    return
                }
                if (i == 7314) {
                    val i_239_ = anIntArray1149!![--anInt1173]
                    anIntArray1149!![anInt1173++] = IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub25_7251!!.method1714(3, i_239_)
                    return
                }
            }
        }
        throw IllegalStateException(i.toString())
    }

    @JvmStatic
    fun method705(class348_sub36: WidgetActionEntry) {
        method712(class348_sub36, 200000)
    }

    @JvmStatic
    fun method706() {
        /* empty */
    }

    private fun method707(string: String, i: Int) {
        var string = string
        if (AsyncTaskHandle.anInt2581 != 0 || ((!RangeThresholdTextureNode.aBoolean9103 || PlayerUpdateDecoder.aBoolean1915) && !MinimapTriangleDrawer.aBoolean5233)) {
            var string_240_ = string.lowercase(Locale.getDefault())
            var i_241_ = 0
            if (string_240_.startsWith(LocalizedText.aLocalizedText_3530!!.method2063(0, 544)!!)) {
                i_241_ = 0
                string = string.substring(LocalizedText.aLocalizedText_3530!!.method2063(0, 544)!!.length)
            } else if (string_240_.startsWith(LocalizedText.aLocalizedText_3531!!.method2063(0, 544)!!)) {
                i_241_ = 1
                string = string.substring(LocalizedText.aLocalizedText_3531!!.method2063(0, 544)!!.length)
            } else if (string_240_.startsWith(LocalizedText.aLocalizedText_3532!!.method2063(0, 544)!!)) {
                i_241_ = 2
                string = string.substring(LocalizedText.aLocalizedText_3532!!.method2063(0, 544)!!.length)
            } else if (string_240_.startsWith(LocalizedText.aLocalizedText_3533!!.method2063(0, 544)!!)) {
                i_241_ = 3
                string = string.substring(LocalizedText.aLocalizedText_3533!!.method2063(0, 544)!!.length)
            } else if (string_240_.startsWith(LocalizedText.aLocalizedText_3534!!.method2063(0, 544)!!)) {
                i_241_ = 4
                string = string.substring(LocalizedText.aLocalizedText_3534!!.method2063(0, 544)!!.length)
            } else if (string_240_.startsWith(LocalizedText.aLocalizedText_3535!!.method2063(0, 544)!!)) {
                i_241_ = 5
                string = string.substring(LocalizedText.aLocalizedText_3535!!.method2063(0, 544)!!.length)
            } else if (string_240_.startsWith(LocalizedText.aLocalizedText_3536!!.method2063(0, 544)!!)) {
                i_241_ = 6
                string = string.substring(LocalizedText.aLocalizedText_3536!!.method2063(0, 544)!!.length)
            } else if (string_240_.startsWith(LocalizedText.aLocalizedText_3537!!.method2063(0, 544)!!)) {
                i_241_ = 7
                string = string.substring(LocalizedText.aLocalizedText_3537!!.method2063(0, 544)!!.length)
            } else if (string_240_.startsWith(LocalizedText.aLocalizedText_3538!!.method2063(0, 544)!!)) {
                i_241_ = 8
                string = string.substring(LocalizedText.aLocalizedText_3538!!.method2063(0, 544)!!.length)
            } else if (string_240_.startsWith(LocalizedText.aLocalizedText_3539!!.method2063(0, 544)!!)) {
                i_241_ = 9
                string = string.substring(LocalizedText.aLocalizedText_3539!!.method2063(0, 544)!!.length)
            } else if (string_240_.startsWith(LocalizedText.aLocalizedText_3540!!.method2063(0, 544)!!)) {
                i_241_ = 10
                string = string.substring(LocalizedText.aLocalizedText_3540!!.method2063(0, 544)!!.length)
            } else if (string_240_.startsWith(LocalizedText.aLocalizedText_3541!!.method2063(0, 544)!!)) {
                i_241_ = 11
                string = string.substring(LocalizedText.aLocalizedText_3541!!.method2063(0, 544)!!.length)
            } else if (AnimationFrameDefinition.anInt6967 != 0) {
                if (string_240_.startsWith(LocalizedText.aLocalizedText_3530!!.method2063(AnimationFrameDefinition.anInt6967, 544)!!)) {
                    i_241_ = 0
                    string = string.substring(LocalizedText.aLocalizedText_3530!!.method2063(AnimationFrameDefinition.anInt6967, 544)!!.length)
                } else if (string_240_.startsWith(LocalizedText.aLocalizedText_3531!!.method2063(AnimationFrameDefinition.anInt6967, 544)!!)) {
                    i_241_ = 1
                    string = string.substring(LocalizedText.aLocalizedText_3531!!.method2063(AnimationFrameDefinition.anInt6967, 544)!!.length)
                } else if (string_240_.startsWith(LocalizedText.aLocalizedText_3532!!.method2063(AnimationFrameDefinition.anInt6967, 544)!!)) {
                    i_241_ = 2
                    string = string.substring(LocalizedText.aLocalizedText_3532!!.method2063(AnimationFrameDefinition.anInt6967, 544)!!.length)
                } else if (string_240_.startsWith(LocalizedText.aLocalizedText_3533!!.method2063(AnimationFrameDefinition.anInt6967, 544)!!)) {
                    i_241_ = 3
                    string = string.substring(LocalizedText.aLocalizedText_3533!!.method2063(AnimationFrameDefinition.anInt6967, 544)!!.length)
                } else if (string_240_.startsWith(LocalizedText.aLocalizedText_3534!!.method2063(AnimationFrameDefinition.anInt6967, 544)!!)) {
                    i_241_ = 4
                    string = string.substring(LocalizedText.aLocalizedText_3534!!.method2063(AnimationFrameDefinition.anInt6967, 544)!!.length)
                } else if (string_240_.startsWith(LocalizedText.aLocalizedText_3535!!.method2063(AnimationFrameDefinition.anInt6967, 544)!!)) {
                    i_241_ = 5
                    string = string.substring(LocalizedText.aLocalizedText_3535!!.method2063(AnimationFrameDefinition.anInt6967, 544)!!.length)
                } else if (string_240_.startsWith(LocalizedText.aLocalizedText_3536!!.method2063(AnimationFrameDefinition.anInt6967, 544)!!)) {
                    i_241_ = 6
                    string = string.substring(LocalizedText.aLocalizedText_3536!!.method2063(AnimationFrameDefinition.anInt6967, 544)!!.length)
                } else if (string_240_.startsWith(LocalizedText.aLocalizedText_3537!!.method2063(AnimationFrameDefinition.anInt6967, 544)!!)) {
                    i_241_ = 7
                    string = string.substring(LocalizedText.aLocalizedText_3537!!.method2063(AnimationFrameDefinition.anInt6967, 544)!!.length)
                } else if (string_240_.startsWith(LocalizedText.aLocalizedText_3538!!.method2063(AnimationFrameDefinition.anInt6967, 544)!!)) {
                    i_241_ = 8
                    string = string.substring(LocalizedText.aLocalizedText_3538!!.method2063(AnimationFrameDefinition.anInt6967, 544)!!.length)
                } else if (string_240_.startsWith(LocalizedText.aLocalizedText_3539!!.method2063(AnimationFrameDefinition.anInt6967, 544)!!)) {
                    i_241_ = 9
                    string = string.substring(LocalizedText.aLocalizedText_3539!!.method2063(AnimationFrameDefinition.anInt6967, 544)!!.length)
                } else if (string_240_.startsWith(LocalizedText.aLocalizedText_3540!!.method2063(AnimationFrameDefinition.anInt6967, 544)!!)) {
                    i_241_ = 10
                    string = string.substring(LocalizedText.aLocalizedText_3540!!.method2063(AnimationFrameDefinition.anInt6967, 544)!!.length)
                } else if (string_240_.startsWith(LocalizedText.aLocalizedText_3541!!.method2063(AnimationFrameDefinition.anInt6967, 544)!!)) {
                    i_241_ = 11
                    string = string.substring(LocalizedText.aLocalizedText_3541!!.method2063(AnimationFrameDefinition.anInt6967, 544)!!.length)
                }
            }
            string_240_ = string.lowercase(Locale.getDefault())
            var i_242_ = 0
            if (string_240_.startsWith(LocalizedText.aLocalizedText_3542!!.method2063(0, 544)!!)) {
                i_242_ = 1
                string = string.substring(LocalizedText.aLocalizedText_3542!!.method2063(0, 544)!!.length)
            } else if (string_240_.startsWith(LocalizedText.aLocalizedText_3543!!.method2063(0, 544)!!)) {
                i_242_ = 2
                string = string.substring(LocalizedText.aLocalizedText_3543!!.method2063(0, 544)!!.length)
            } else if (string_240_.startsWith(LocalizedText.aLocalizedText_3544!!.method2063(0, 544)!!)) {
                i_242_ = 3
                string = string.substring(LocalizedText.aLocalizedText_3544!!.method2063(0, 544)!!.length)
            } else if (string_240_.startsWith(LocalizedText.aLocalizedText_3545!!.method2063(0, 544)!!)) {
                i_242_ = 4
                string = string.substring(LocalizedText.aLocalizedText_3545!!.method2063(0, 544)!!.length)
            } else if (string_240_.startsWith(LocalizedText.aLocalizedText_3546!!.method2063(0, 544)!!)) {
                i_242_ = 5
                string = string.substring(LocalizedText.aLocalizedText_3546!!.method2063(0, 544)!!.length)
            } else if (AnimationFrameDefinition.anInt6967 != 0) {
                if (string_240_.startsWith(LocalizedText.aLocalizedText_3542!!.method2063(AnimationFrameDefinition.anInt6967, 544)!!)) {
                    i_242_ = 1
                    string = string.substring(LocalizedText.aLocalizedText_3542!!.method2063(AnimationFrameDefinition.anInt6967, 544)!!.length)
                } else if (string_240_.startsWith(LocalizedText.aLocalizedText_3543!!.method2063(AnimationFrameDefinition.anInt6967, 544)!!)) {
                    i_242_ = 2
                    string = string.substring(LocalizedText.aLocalizedText_3543!!.method2063(AnimationFrameDefinition.anInt6967, 544)!!.length)
                } else if (string_240_.startsWith(LocalizedText.aLocalizedText_3544!!.method2063(AnimationFrameDefinition.anInt6967, 544)!!)) {
                    i_242_ = 3
                    string = string.substring(LocalizedText.aLocalizedText_3544!!.method2063(AnimationFrameDefinition.anInt6967, 544)!!.length)
                } else if (string_240_.startsWith(LocalizedText.aLocalizedText_3545!!.method2063(AnimationFrameDefinition.anInt6967, 544)!!)) {
                    i_242_ = 4
                    string = string.substring(LocalizedText.aLocalizedText_3545!!.method2063(AnimationFrameDefinition.anInt6967, 544)!!.length)
                } else if (string_240_.startsWith(LocalizedText.aLocalizedText_3546!!.method2063(AnimationFrameDefinition.anInt6967, 544)!!)) {
                    i_242_ = 5
                    string = string.substring(LocalizedText.aLocalizedText_3546!!.method2063(AnimationFrameDefinition.anInt6967, 544)!!.length)
                }
            }
            anInt1158++
            val class348_sub47 = method2148(CircleDrawer.aFontMetaRef_2686, TheoraVideoStream.aClass77_9029, -88)
            class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByte(false, 0)
            val i_243_ = (class348_sub47.aClass348_Sub49_Sub2_7116!!.anInt7197)
            class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByte(false, i_241_)
            class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByte(false, i_242_)
            method3544((class348_sub47.aClass348_Sub49_Sub2_7116!!), -101, string)
            class348_sub47.aClass348_Sub49_Sub2_7116!!.method3339(119, (class348_sub47.aClass348_Sub49_Sub2_7116!!.anInt7197) - i_243_)
            InterfaceComponentGroup.method3243(124, class348_sub47)
        }
    }

    private fun method708(c: Char): Int {
        if (WorldMapSceneSoftware.method1693(c, -114)) return 1
        return 0
    }

    private fun method709(i: Int): String {
        val l = (i.toLong() + 11745L) * 86400000L
        aCalendar1160!!.setTime(Date(l))
        val i_244_ = aCalendar1160!!.get(5)
        val i_245_ = aCalendar1160!!.get(2)
        val i_246_ = aCalendar1160!!.get(1)
        return (i_244_.toString() + "-" + aStringArray1176!![i_245_] + "-" + i_246_)
    }

    private fun method710(i: Int, bool: Boolean) {
        var i = i
        if (i < 300) {
            if (i == 100) {
                anInt1173 -= 3
                val i_247_ = anIntArray1149!![anInt1173]
                val i_248_ = anIntArray1149!![anInt1173 + 1]
                val i_249_ = anIntArray1149!![anInt1173 + 2]
                if (i_248_ == 0) throw RuntimeException()
                val class46 = method2570(1512932720, i_247_)
                if (class46!!.aWidgetComponentArray798 == null) class46.aWidgetComponentArray798 = arrayOfNulls<WidgetComponent>(i_249_ + 1)
                if (class46.aWidgetComponentArray798!!.size <= i_249_) {
                    val widgetComponents = arrayOfNulls<WidgetComponent>(i_249_ + 1)
                    for (i_250_ in class46.aWidgetComponentArray798!!.indices) widgetComponents[i_250_] = class46.aWidgetComponentArray798!![i_250_]
                    class46.aWidgetComponentArray798 = widgetComponents
                }
                if (i_249_ > 0 && (class46.aWidgetComponentArray798!![i_249_ - 1] == null)) throw RuntimeException("Gap at:" + (i_249_ - 1))
                val widgetComponent_251_ = WidgetComponent()
                widgetComponent_251_.anInt774 = i_248_
                widgetComponent_251_.anInt830 = class46.anInt830
                widgetComponent_251_.anInt834 = widgetComponent_251_.anInt830
                widgetComponent_251_.anInt704 = i_249_
                class46.aWidgetComponentArray798!![i_249_] = widgetComponent_251_
                if (bool) aWidgetComponent_1169 = widgetComponent_251_
                else aWidgetComponent_1150 = widgetComponent_251_
                ConfigFlagUtil.method1916(-9343, class46)
                return
            }
            if (i == 101) {
                val class46 = (if (bool) Class66.aWidgetComponent_1169 else Class66.aWidgetComponent_1150)!!
                if (class46.anInt704 == -1) {
                    if (bool) throw RuntimeException("Tried to .cc_delete static .active-component!")
                    throw RuntimeException("Tried to cc_delete static active-component!")
                }
                val class46_252_ = method2570(1512932720, class46.anInt830)
                class46_252_!!.aWidgetComponentArray798!![(class46.anInt704)] = null
                ConfigFlagUtil.method1916(-9343, class46_252_)
                return
            }
            if (i == 102) {
                val class46 = method2570(1512932720, anIntArray1149!![--anInt1173])
                class46!!.aWidgetComponentArray798 = null
                ConfigFlagUtil.method1916(-9343, class46)
                return
            }
            if (i == 200) {
                anInt1173 -= 2
                val i_253_ = anIntArray1149!![anInt1173]
                val i_254_ = anIntArray1149!![anInt1173 + 1]
                val class46 = NpcReference.method2957(i_254_, (-54).toByte(), i_253_)
                if (class46 == null || i_254_ == -1) {
                    anIntArray1149!![anInt1173++] = 0
                    return
                } else {
                    anIntArray1149!![anInt1173++] = 1
                    if (bool) aWidgetComponent_1169 = class46
                    else aWidgetComponent_1150 = class46
                }
                return
            }
            if (i == 201) {
                val i_255_ = anIntArray1149!![--anInt1173]
                val class46 = method2570(1512932720, i_255_)
                if (class46 == null) {
                    anIntArray1149!![anInt1173++] = 0
                    return
                } else {
                    anIntArray1149!![anInt1173++] = 1
                    if (bool) aWidgetComponent_1169 = class46
                    else aWidgetComponent_1150 = class46
                }
                return
            }
            if (i == 202) {
                val i_256_ = anIntArray1149!![--anInt1173]
                method714(i_256_)
                return
            }
            if (i == 203) {
                val i_257_ = anIntArray1149!![--anInt1173]
                method702(i_257_)
                return
            }
        } else if (i < 500) {
            if (i == 403) {
                anInt1173 -= 2
                val i_258_ = anIntArray1149!![anInt1173]
                val i_259_ = anIntArray1149!![anInt1173 + 1]
                if ((LocalPlayerState.aPlayer_1907!!.aCompositeNpcModelBuilder_10536) != null) {
                    for (i_260_ in TextureDefinitionLoader.anIntArray1973!!.indices) {
                        if (TextureDefinitionLoader.anIntArray1973!![i_260_] == i_258_) {
                            LocalPlayerState.aPlayer_1907!!.aCompositeNpcModelBuilder_10536!!.method1233(RadialTextureNode.aModelDefinitionLoader_9342, i_259_, -1, i_260_)
                            return
                        }
                    }
                    for (i_261_ in Class91.anIntArray1521!!.indices) {
                        if (Class91.anIntArray1521!![i_261_] == i_258_) {
                            LocalPlayerState.aPlayer_1907!!.aCompositeNpcModelBuilder_10536!!.method1233(RadialTextureNode.aModelDefinitionLoader_9342, i_259_, -1, i_261_)
                            break
                        }
                    }
                    return
                }
                return
            }
            if (i == 404) {
                anInt1173 -= 2
                val i_262_ = anIntArray1149!![anInt1173]
                val i_263_ = anIntArray1149!![anInt1173 + 1]
                if ((LocalPlayerState.aPlayer_1907!!.aCompositeNpcModelBuilder_10536) != null) {
                    LocalPlayerState.aPlayer_1907!!.aCompositeNpcModelBuilder_10536!!.method1231(i_262_, 0, i_263_)
                    return
                }
                return
            }
            if (i == 410) {
                val bool_264_ = anIntArray1149!![--anInt1173] != 0
                if ((LocalPlayerState.aPlayer_1907!!.aCompositeNpcModelBuilder_10536) != null) {
                    LocalPlayerState.aPlayer_1907!!.aCompositeNpcModelBuilder_10536!!.method1229((-17).toByte(), bool_264_)
                    return
                }
                return
            }
            if (i == 411) {
                anInt1173 -= 2
                val i_265_ = anIntArray1149!![anInt1173]
                val i_266_ = anIntArray1149!![anInt1173 + 1]
                if ((LocalPlayerState.aPlayer_1907!!.aCompositeNpcModelBuilder_10536) != null) {
                    LocalPlayerState.aPlayer_1907!!.aCompositeNpcModelBuilder_10536!!.method1227(42.toByte(), i_265_, i_266_, Exception_Sub1.aModelHeaderCache_112)
                    return
                }
                return
            }
        } else if (i >= 1000 && i < 1100 || i >= 2000 && i < 2100) {
            val widgetComponent: WidgetComponent?
            if (i >= 2000) {
                i -= 1000
                widgetComponent = method2570(1512932720, anIntArray1149!![--anInt1173])
            } else widgetComponent = if (bool) aWidgetComponent_1169 else aWidgetComponent_1150
            if (i == 1000) {
                anInt1173 -= 4
                widgetComponent!!.anInt788 = anIntArray1149!![anInt1173]
                widgetComponent.anInt739 = anIntArray1149!![anInt1173 + 1]
                var i_267_ = anIntArray1149!![anInt1173 + 2]
                if (i_267_ < 0) i_267_ = 0
                else if (i_267_ > 5) i_267_ = 5
                var i_268_ = anIntArray1149!![anInt1173 + 3]
                if (i_268_ < 0) i_268_ = 0
                else if (i_268_ > 5) i_268_ = 5
                widgetComponent.aByte817 = i_267_.toByte()
                widgetComponent.aByte681 = i_268_.toByte()
                ConfigFlagUtil.method1916(-9343, widgetComponent)
                CollisionMapRegion.method1048(widgetComponent, 50)
                if (widgetComponent.anInt704 == -1) ChatEffectsOptionState.method1733((-78).toByte(), widgetComponent.anInt830)
                return
            }
            if (i == 1001) {
                anInt1173 -= 4
                widgetComponent!!.anInt842 = anIntArray1149!![anInt1173]
                widgetComponent.anInt728 = anIntArray1149!![anInt1173 + 1]
                widgetComponent.anInt796 = 0
                widgetComponent.anInt826 = 0
                var i_269_ = anIntArray1149!![anInt1173 + 2]
                if (i_269_ < 0) i_269_ = 0
                else if (i_269_ > 4) i_269_ = 4
                var i_270_ = anIntArray1149!![anInt1173 + 3]
                if (i_270_ < 0) i_270_ = 0
                else if (i_270_ > 4) i_270_ = 4
                widgetComponent.aByte778 = i_269_.toByte()
                widgetComponent.aByte724 = i_270_.toByte()
                ConfigFlagUtil.method1916(-9343, widgetComponent)
                CollisionMapRegion.method1048(widgetComponent, 62)
                if (widgetComponent.anInt774 == 0) ConfigFlagUtil.method1913(false, 36, widgetComponent)
                return
            }
            if (i == 1003) {
                val bool_271_ = anIntArray1149!![--anInt1173] == 1
                if (widgetComponent!!.aBoolean813 != bool_271_) {
                    widgetComponent.aBoolean813 = bool_271_
                    ConfigFlagUtil.method1916(-9343, widgetComponent)
                }
                if (widgetComponent.anInt704 == -1) NamedIdEntry.method2999(90.toByte(), widgetComponent.anInt830)
                return
            }
            if (i == 1004) {
                anInt1173 -= 2
                widgetComponent!!.anInt710 = anIntArray1149!![anInt1173]
                widgetComponent.anInt775 = anIntArray1149!![anInt1173 + 1]
                ConfigFlagUtil.method1916(-9343, widgetComponent)
                CollisionMapRegion.method1048(widgetComponent, 59)
                if (widgetComponent.anInt774 == 0) ConfigFlagUtil.method1913(false, 49, widgetComponent)
                return
            }
            if (i == 1005) {
                widgetComponent!!.aBoolean776 = anIntArray1149!![--anInt1173] == 1
                return
            }
        } else if (i >= 1100 && i < 1200 || i >= 2100 && i < 2200) {
            val widgetComponent: WidgetComponent?
            if (i >= 2000) {
                i -= 1000
                widgetComponent = method2570(1512932720, anIntArray1149!![--anInt1173])
            } else widgetComponent = if (bool) aWidgetComponent_1169 else aWidgetComponent_1150
            if (i == 1100) {
                anInt1173 -= 2
                widgetComponent!!.anInt747 = anIntArray1149!![anInt1173]
                if (widgetComponent.anInt747 > (widgetComponent.anInt698 - widgetComponent.anInt709)) widgetComponent.anInt747 = (widgetComponent.anInt698 - widgetComponent.anInt709)
                if (widgetComponent.anInt747 < 0) widgetComponent.anInt747 = 0
                widgetComponent.anInt755 = anIntArray1149!![anInt1173 + 1]
                if (widgetComponent.anInt755 > (widgetComponent.anInt791 - widgetComponent.anInt789)) widgetComponent.anInt755 = (widgetComponent.anInt791 - widgetComponent.anInt789)
                if (widgetComponent.anInt755 < 0) widgetComponent.anInt755 = 0
                ConfigFlagUtil.method1916(-9343, widgetComponent)
                if (widgetComponent.anInt704 == -1) RenderQueueState.method2615(-91, widgetComponent.anInt830)
                return
            }
            if (i == 1101) {
                widgetComponent!!.anInt749 = anIntArray1149!![--anInt1173]
                ConfigFlagUtil.method1916(-9343, widgetComponent)
                if (widgetComponent.anInt704 == -1) method1148(widgetComponent.anInt830, 6)
                return
            }
            if (i == 1102) {
                widgetComponent!!.aBoolean810 = anIntArray1149!![--anInt1173] == 1
                ConfigFlagUtil.method1916(-9343, widgetComponent)
                return
            }
            if (i == 1103) {
                widgetComponent!!.anInt696 = anIntArray1149!![--anInt1173]
                ConfigFlagUtil.method1916(-9343, widgetComponent)
                return
            }
            if (i == 1104) {
                widgetComponent!!.anInt690 = anIntArray1149!![--anInt1173]
                ConfigFlagUtil.method1916(-9343, widgetComponent)
                return
            }
            if (i == 1105) {
                val i_272_ = anIntArray1149!![--anInt1173]
                if (widgetComponent!!.anInt756 != i_272_) {
                    widgetComponent.anInt756 = i_272_
                    ConfigFlagUtil.method1916(-9343, widgetComponent)
                }
                if (widgetComponent.anInt704 == -1) ProjectileSpawner.method1477(widgetComponent.anInt830, 14)
                return
            }
            if (i == 1106) {
                widgetComponent!!.anInt828 = anIntArray1149!![--anInt1173]
                ConfigFlagUtil.method1916(-9343, widgetComponent)
                return
            }
            if (i == 1107) {
                widgetComponent!!.aBoolean697 = anIntArray1149!![--anInt1173] == 1
                ConfigFlagUtil.method1916(-9343, widgetComponent)
                return
            }
            if (i == 1108) {
                widgetComponent!!.anInt770 = 1
                widgetComponent.anInt753 = anIntArray1149!![--anInt1173]
                ConfigFlagUtil.method1916(-9343, widgetComponent)
                if (widgetComponent.anInt704 == -1) method3569(widgetComponent.anInt830, -125)
                return
            }
            if (i == 1109) {
                anInt1173 -= 6
                widgetComponent!!.anInt808 = anIntArray1149!![anInt1173]
                widgetComponent.anInt786 = anIntArray1149!![anInt1173 + 1]
                widgetComponent.anInt757 = anIntArray1149!![anInt1173 + 2]
                widgetComponent.anInt675 = anIntArray1149!![anInt1173 + 3]
                widgetComponent.anInt717 = anIntArray1149!![anInt1173 + 4]
                widgetComponent.anInt716 = anIntArray1149!![anInt1173 + 5]
                ConfigFlagUtil.method1916(-9343, widgetComponent)
                if (widgetComponent.anInt704 == -1) {
                    method1787(widgetComponent.anInt830, 8)
                    LoadingScreenState.method1459(widgetComponent.anInt830, 2)
                }
                return
            }
            if (i == 1110) {
                val i_273_ = anIntArray1149!![--anInt1173]
                if (widgetComponent!!.anInt699 != i_273_) {
                    widgetComponent.anInt699 = i_273_
                    widgetComponent.anInt795 = 0
                    widgetComponent.anInt730 = 1
                    widgetComponent.anInt841 = 0
                    val class17 = (if (widgetComponent.anInt699 == -1) null else ParticleEmitterNode.aClass87_191!!.method835(widgetComponent.anInt699, 7))
                    if (class17 != null) CompassSmoother.method2017(widgetComponent.anInt795, class17, 46)
                    ConfigFlagUtil.method1916(-9343, widgetComponent)
                }
                if (widgetComponent.anInt704 == -1) Class64_Sub3.method687((-117).toByte(), widgetComponent.anInt830)
                return
            }
            if (i == 1111) {
                widgetComponent!!.aBoolean689 = anIntArray1149!![--anInt1173] == 1
                ConfigFlagUtil.method1916(-9343, widgetComponent)
                return
            }
            if (i == 1112) {
                val string = aStringArray1152!![--anInt1170]
                if (string != widgetComponent!!.aString792) {
                    widgetComponent.aString792 = string
                    ConfigFlagUtil.method1916(-9343, widgetComponent)
                }
                if (widgetComponent.anInt704 == -1) method3316(121, widgetComponent.anInt830)
                return
            }
            if (i == 1113) {
                widgetComponent!!.anInt702 = anIntArray1149!![--anInt1173]
                ConfigFlagUtil.method1916(-9343, widgetComponent)
                if (widgetComponent.anInt704 == -1) ConfigVarProgress.method2311((-109).toByte(), widgetComponent.anInt830)
                return
            }
            if (i == 1114) {
                anInt1173 -= 3
                widgetComponent!!.anInt762 = anIntArray1149!![anInt1173]
                widgetComponent.anInt700 = anIntArray1149!![anInt1173 + 1]
                widgetComponent.anInt673 = anIntArray1149!![anInt1173 + 2]
                ConfigFlagUtil.method1916(-9343, widgetComponent)
                return
            }
            if (i == 1115) {
                widgetComponent!!.aBoolean769 = anIntArray1149!![--anInt1173] == 1
                ConfigFlagUtil.method1916(-9343, widgetComponent)
                return
            }
            if (i == 1116) {
                widgetComponent!!.anInt672 = anIntArray1149!![--anInt1173]
                ConfigFlagUtil.method1916(-9343, widgetComponent)
                return
            }
            if (i == 1117) {
                widgetComponent!!.anInt809 = anIntArray1149!![--anInt1173]
                ConfigFlagUtil.method1916(-9343, widgetComponent)
                return
            }
            if (i == 1118) {
                widgetComponent!!.aBoolean790 = anIntArray1149!![--anInt1173] == 1
                ConfigFlagUtil.method1916(-9343, widgetComponent)
                return
            }
            if (i == 1119) {
                widgetComponent!!.aBoolean735 = anIntArray1149!![--anInt1173] == 1
                ConfigFlagUtil.method1916(-9343, widgetComponent)
                return
            }
            if (i == 1120) {
                anInt1173 -= 2
                widgetComponent!!.anInt698 = anIntArray1149!![anInt1173]
                widgetComponent.anInt791 = anIntArray1149!![anInt1173 + 1]
                ConfigFlagUtil.method1916(-9343, widgetComponent)
                if (widgetComponent.anInt774 == 0) ConfigFlagUtil.method1913(false, 62, widgetComponent)
                return
            }
            if (i == 1122) {
                widgetComponent!!.aBoolean745 = anIntArray1149!![--anInt1173] == 1
                ConfigFlagUtil.method1916(-9343, widgetComponent)
                return
            }
            if (i == 1123) {
                widgetComponent!!.anInt716 = anIntArray1149!![--anInt1173]
                ConfigFlagUtil.method1916(-9343, widgetComponent)
                if (widgetComponent.anInt704 == -1) method1787(widgetComponent.anInt830, 8)
                return
            }
            if (i == 1124) {
                val i_274_ = anIntArray1149!![--anInt1173]
                widgetComponent!!.aBoolean744 = i_274_ == 1
                ConfigFlagUtil.method1916(-9343, widgetComponent)
                return
            }
            if (i == 1125) {
                anInt1173 -= 2
                widgetComponent!!.anInt688 = anIntArray1149!![anInt1173]
                widgetComponent.anInt799 = anIntArray1149!![anInt1173 + 1]
                ConfigFlagUtil.method1916(-9343, widgetComponent)
                return
            }
            if (i == 1126) {
                widgetComponent!!.anInt773 = anIntArray1149!![--anInt1173]
                ConfigFlagUtil.method1916(-9343, widgetComponent)
                return
            }
            if (i == 1127) {
                anInt1173 -= 2
                val i_275_ = anIntArray1149!![anInt1173]
                val i_276_ = anIntArray1149!![anInt1173 + 1]
                val class254 = ProjectionCameraTransform.aEmoteDefCache_5764!!.method2600(i_275_, 28364)
                if (i_276_ == class254.anInt3256) {
                    widgetComponent!!.method435(i_275_, -3437)
                    return
                } else widgetComponent!!.method436(-70, i_275_, i_276_)
                return
            }
            if (i == 1128) {
                val i_277_ = anIntArray1149!![--anInt1173]
                val string = aStringArray1152!![--anInt1170]
                val class254 = ProjectionCameraTransform.aEmoteDefCache_5764!!.method2600(i_277_, 28364)
                if (class254.aString3258 == string) {
                    widgetComponent!!.method435(i_277_, -3437)
                    return
                } else widgetComponent!!.method439(0, i_277_, string)
                return
            }
            if (i == 1129 || i == 1130) {
                val i_278_ = anIntArray1149!![--anInt1173]
                if ((widgetComponent!!.anInt774 == 5 || i != 1129) && (widgetComponent.anInt774 == 4 || i != 1130)) {
                    if (widgetComponent.anInt806 != i_278_) {
                        widgetComponent.anInt806 = i_278_
                        ConfigFlagUtil.method1916(-9343, widgetComponent)
                    }
                    if (widgetComponent.anInt704 == -1) GlowPostProcessor.method1415(widgetComponent.anInt830, 117)
                    return
                }
                return
            }
        } else if (i >= 1200 && i < 1300 || i >= 2200 && i < 2300) {
            val widgetComponent: WidgetComponent?
            if (i >= 2000) {
                i -= 1000
                widgetComponent = method2570(1512932720, anIntArray1149!![--anInt1173])
            } else widgetComponent = if (bool) aWidgetComponent_1169 else aWidgetComponent_1150
            ConfigFlagUtil.method1916(-9343, widgetComponent!!)
            if (i == 1200 || i == 1205 || i == 1208 || i == 1209 || i == 1212 || i == 1213) {
                anInt1173 -= 2
                val i_279_ = anIntArray1149!![anInt1173]
                val i_280_ = anIntArray1149!![anInt1173 + 1]
                if (widgetComponent!!.anInt704 == -1) {
                    Class73.Companion.method743(9, widgetComponent.anInt830)
                    method1787(widgetComponent.anInt830, 8)
                    LoadingScreenState.method1459(widgetComponent.anInt830, 2)
                }
                if (i_279_ == -1) {
                    widgetComponent.anInt770 = 1
                    widgetComponent.anInt753 = -1
                    widgetComponent.anInt812 = -1
                } else {
                    widgetComponent.anInt812 = i_279_
                    widgetComponent.anInt781 = i_280_
                    widgetComponent.aBoolean720 = i == 1208 || i == 1209
                    val class213 = Exception_Sub1.aModelHeaderCache_112!!.method1940(74, i_279_)
                    widgetComponent.anInt757 = class213.anInt2787
                    widgetComponent.anInt675 = class213.anInt2781
                    widgetComponent.anInt717 = class213.anInt2810
                    widgetComponent.anInt808 = class213.anInt2779
                    widgetComponent.anInt786 = class213.anInt2826
                    widgetComponent.anInt716 = class213.anInt2825
                    if (i == 1205 || i == 1209) widgetComponent.anInt678 = 0
                    else if (i == 1212 || i == 1213) widgetComponent.anInt678 = 1
                    else widgetComponent.anInt678 = 2
                    if (widgetComponent.anInt796 > 0) widgetComponent.anInt716 = (widgetComponent.anInt716 * 32 / widgetComponent.anInt796)
                    else {
                        if (widgetComponent.anInt842 > 0) widgetComponent.anInt716 = (widgetComponent.anInt716 * 32 / widgetComponent.anInt842)
                        return
                    }
                    return
                }
                return
            }
            if (i == 1201) {
                widgetComponent!!.anInt770 = 2
                widgetComponent.anInt753 = anIntArray1149!![--anInt1173]
                if (widgetComponent.anInt704 == -1) method3569(widgetComponent.anInt830, -124)
                return
            }
            if (i == 1202) {
                widgetComponent!!.anInt770 = 3
                widgetComponent.anInt753 = -1
                if (widgetComponent.anInt704 == -1) method3569(widgetComponent.anInt830, 94)
                return
            }
            if (i == 1203) {
                widgetComponent!!.anInt770 = 6
                widgetComponent.anInt753 = anIntArray1149!![--anInt1173]
                if (widgetComponent.anInt704 == -1) method3569(widgetComponent.anInt830, -26)
                return
            }
            if (i == 1204) {
                widgetComponent!!.anInt770 = 5
                widgetComponent.anInt753 = anIntArray1149!![--anInt1173]
                if (widgetComponent.anInt704 == -1) method3569(widgetComponent.anInt830, -127)
                return
            }
            if (i == 1206) {
                anInt1173 -= 4
                widgetComponent!!.anInt705 = anIntArray1149!![anInt1173]
                widgetComponent.anInt674 = anIntArray1149!![anInt1173 + 1]
                widgetComponent.anInt733 = anIntArray1149!![anInt1173 + 2]
                widgetComponent.anInt693 = anIntArray1149!![anInt1173 + 3]
                ConfigFlagUtil.method1916(-9343, widgetComponent)
                return
            }
            if (i == 1207) {
                anInt1173 -= 2
                widgetComponent!!.anInt759 = anIntArray1149!![anInt1173]
                widgetComponent.anInt835 = anIntArray1149!![anInt1173 + 1]
                ConfigFlagUtil.method1916(-9343, widgetComponent)
                return
            }
            if (i == 1210) {
                anInt1173 -= 4
                widgetComponent!!.anInt753 = anIntArray1149!![anInt1173]
                widgetComponent.anInt779 = anIntArray1149!![anInt1173 + 1]
                if (anIntArray1149!![anInt1173 + 2] == 1) widgetComponent.anInt770 = 9
                else widgetComponent.anInt770 = 8
                widgetComponent.aBoolean720 = anIntArray1149!![anInt1173 + 3] == 1
                if (widgetComponent.anInt704 == -1) method3569(widgetComponent.anInt830, 8)
                return
            }
            if (i == 1211) {
                widgetComponent!!.anInt770 = 5
                widgetComponent.anInt753 = CharCodeMap.anInt9591
                widgetComponent.anInt779 = 0
                if (widgetComponent.anInt704 == -1) method3569(widgetComponent.anInt830, 66)
                return
            }
        } else if (i >= 1300 && i < 1400 || i >= 2300 && i < 2400) {
            val widgetComponent: WidgetComponent?
            if (i >= 2000) {
                i -= 1000
                widgetComponent = method2570(1512932720, anIntArray1149!![--anInt1173])
            } else widgetComponent = if (bool) aWidgetComponent_1169 else aWidgetComponent_1150
            if (i == 1300) {
                val i_281_ = anIntArray1149!![--anInt1173] - 1
                if (i_281_ >= 0 && i_281_ <= 9) {
                    widgetComponent!!.method438(i_281_, 124, aStringArray1152!![--anInt1170])
                    return
                } else anInt1170--
                return
            }
            if (i == 1301) {
                anInt1173 -= 2
                val i_282_ = anIntArray1149!![anInt1173]
                val i_283_ = anIntArray1149!![anInt1173 + 1]
                if (i_282_ == -1 && i_283_ == -1) widgetComponent!!.aWidgetComponent_782 = null
                else {
                    widgetComponent!!.aWidgetComponent_782 = NpcReference.method2957(i_283_, (-54).toByte(), i_282_)
                    return
                }
                return
            }
            if (i == 1302) {
                val i_284_ = anIntArray1149!![--anInt1173]
                if (i_284_ == InputStream_Sub1.anInt78 || i_284_ == GrowableStringList.anInt2361 || i_284_ == WidgetRedrawTracker.anInt3930) {
                    widgetComponent!!.anInt797 = i_284_
                    return
                }
                return
            }
            if (i == 1303) {
                widgetComponent!!.anInt729 = anIntArray1149!![--anInt1173]
                return
            }
            if (i == 1304) {
                widgetComponent!!.anInt703 = anIntArray1149!![--anInt1173]
                return
            }
            if (i == 1305) {
                widgetComponent!!.aString752 = aStringArray1152!![--anInt1170]
                return
            }
            if (i == 1306) {
                widgetComponent!!.aString780 = aStringArray1152!![--anInt1170]
                return
            }
            if (i == 1307) {
                widgetComponent!!.aStringArray833 = null
                return
            }
            if (i == 1308) {
                widgetComponent!!.anInt695 = anIntArray1149!![--anInt1173]
                widgetComponent.anInt824 = anIntArray1149!![--anInt1173]
                return
            }
            if (i == 1309) {
                val i_285_ = anIntArray1149!![--anInt1173]
                val i_286_ = anIntArray1149!![--anInt1173]
                if (i_286_ >= 1 && i_286_ <= 10) widgetComponent!!.method431(i_286_ - 1, i_285_, (-119).toByte())
                return
            }
            if (i == 1310) {
                widgetComponent!!.aString816 = aStringArray1152!![--anInt1170]
                return
            }
            if (i == 1311) {
                widgetComponent!!.anInt713 = anIntArray1149!![--anInt1173]
                return
            }
            if (i == 1312 || i == 1313) {
                val i_287_: Int
                val i_288_: Int
                val i_289_: Int
                if (i == 1312) {
                    anInt1173 -= 3
                    i_287_ = anIntArray1149!![anInt1173] - 1
                    i_288_ = anIntArray1149!![anInt1173 + 1]
                    i_289_ = anIntArray1149!![anInt1173 + 2]
                    if (i_287_ < 0 || i_287_ > 9) throw RuntimeException("IOR13121313")
                } else {
                    anInt1173 -= 2
                    i_287_ = 10
                    i_288_ = anIntArray1149!![anInt1173]
                    i_289_ = anIntArray1149!![anInt1173 + 1]
                }
                if (widgetComponent!!.aByteArray746 == null) {
                    if (i_288_ != 0) {
                        widgetComponent.aByteArray746 = ByteArray(11)
                        widgetComponent.aByteArray832 = ByteArray(11)
                        widgetComponent.anIntArray707 = IntArray(11)
                    } else return
                }
                widgetComponent.aByteArray746[i_287_] = i_288_.toByte()
                if (i_288_ == 0) {
                    widgetComponent.aBoolean676 = false
                    for (i_290_ in widgetComponent.aByteArray746.indices) {
                        if (widgetComponent.aByteArray746[i_290_].toInt() != 0) {
                            widgetComponent.aBoolean676 = true
                            break
                        }
                    }
                } else widgetComponent.aBoolean676 = true
                widgetComponent.aByteArray832[i_287_] = i_289_.toByte()
                return
            }
            if (i == 1314) {
                widgetComponent!!.anInt719 = anIntArray1149!![--anInt1173]
                return
            }
        } else {
            if (i >= 1400 && i < 1500 || i >= 2400 && i < 2500) {
                val widgetComponent: WidgetComponent?
                if (i >= 2000) {
                    i -= 1000
                    widgetComponent = method2570(1512932720, anIntArray1149!![--anInt1173])
                } else widgetComponent = if (bool) aWidgetComponent_1169 else aWidgetComponent_1150
                if (i == 1499) widgetComponent!!.method434(false)
                else {
                    var string = aStringArray1152!![--anInt1170]!!
                    var `is`: IntArray? = null
                    if (string.length > 0 && string.get(string.length - 1) == 'Y') {
                        var i_291_ = anIntArray1149!![--anInt1173]
                        if (i_291_ > 0) {
                            `is` = IntArray(i_291_)
                            while (i_291_-- > 0) `is`[i_291_] = anIntArray1149!![--anInt1173]
                        }
                        string = string.substring(0, string.length - 1)
                    }
                    var objects: Array<Any?>? = arrayOfNulls<Any>(string.length + 1)
                    for (i_292_ in objects!!.size - 1 downTo 1) {
                        if (string.get(i_292_ - 1) == 's') objects[i_292_] = aStringArray1152!![--anInt1170]
                        else objects[i_292_] = anIntArray1149!![--anInt1173]
                    }
                    val i_293_ = anIntArray1149!![--anInt1173]
                    if (i_293_ != -1) objects[0] = i_293_
                    else objects = null
                    if (i == 1400) widgetComponent!!.anObjectArray763 = objects
                    else if (i == 1401) widgetComponent!!.anObjectArray805 = objects
                    else if (i == 1402) widgetComponent!!.anObjectArray742 = objects
                    else if (i == 1403) widgetComponent!!.anObjectArray811 = objects
                    else if (i == 1404) widgetComponent!!.anObjectArray683 = objects
                    else if (i == 1405) widgetComponent!!.anObjectArray823 = objects
                    else if (i == 1406) widgetComponent!!.anObjectArray680 = objects
                    else if (i == 1407) {
                        widgetComponent!!.anObjectArray777 = objects
                        widgetComponent.anIntArray686 = `is`
                    } else if (i == 1408) widgetComponent!!.anObjectArray764 = objects
                    else if (i == 1409) widgetComponent!!.anObjectArray741 = objects
                    else if (i == 1410) widgetComponent!!.anObjectArray692 = objects
                    else if (i == 1411) widgetComponent!!.anObjectArray785 = objects
                    else if (i == 1412) widgetComponent!!.anObjectArray839 = objects
                    else if (i == 1414) {
                        widgetComponent!!.anObjectArray751 = objects
                        widgetComponent.anIntArray771 = `is`
                    } else if (i == 1415) {
                        widgetComponent!!.anObjectArray671 = objects
                        widgetComponent.anIntArray731 = `is`
                    } else if (i == 1416) widgetComponent!!.anObjectArray714 = objects
                    else if (i == 1417) widgetComponent!!.anObjectArray803 = objects
                    else if (i == 1418) widgetComponent!!.anObjectArray820 = objects
                    else if (i == 1419) widgetComponent!!.anObjectArray822 = objects
                    else if (i == 1420) widgetComponent!!.anObjectArray734 = objects
                    else if (i == 1421) widgetComponent!!.anObjectArray761 = objects
                    else if (i == 1422) widgetComponent!!.anObjectArray836 = objects
                    else if (i == 1423) widgetComponent!!.anObjectArray840 = objects
                    else if (i == 1424) widgetComponent!!.anObjectArray701 = objects
                    else if (i == 1425) widgetComponent!!.anObjectArray807 = objects
                    else if (i == 1426) widgetComponent!!.anObjectArray687 = objects
                    else if (i == 1427) widgetComponent!!.anObjectArray727 = objects
                    else if (i == 1428) {
                        widgetComponent!!.anObjectArray685 = objects
                        widgetComponent.anIntArray818 = `is`
                    } else if (i == 1429) {
                        widgetComponent!!.anObjectArray708 = objects
                        widgetComponent.anIntArray831 = `is`
                    } else if (i == 1430) widgetComponent!!.anObjectArray679 = objects
                    widgetComponent!!.aBoolean682 = true
                    return
                }
                return
            }
            if (i < 1600) {
                val class46 = (if (bool) Class66.aWidgetComponent_1169 else Class66.aWidgetComponent_1150)!!
                if (i == 1500) {
                    anIntArray1149!![anInt1173++] = class46.anInt800
                    return
                }
                if (i == 1501) {
                    anIntArray1149!![anInt1173++] = class46.anInt750
                    return
                }
                if (i == 1502) {
                    anIntArray1149!![anInt1173++] = class46.anInt709
                    return
                }
                if (i == 1503) {
                    anIntArray1149!![anInt1173++] = class46.anInt789
                    return
                }
                if (i == 1504) {
                    anIntArray1149!![anInt1173++] = if (class46.aBoolean813) 1 else 0
                    return
                }
                if (i == 1505) {
                    anIntArray1149!![anInt1173++] = class46.anInt834
                    return
                }
                if (i == 1506) {
                    val class46_294_ = WorldMapScene.method1687(class46, 3)
                    anIntArray1149!![anInt1173++] = (if (class46_294_ == null) -1 else class46_294_.anInt830)
                    return
                }
            } else if (i < 1700) {
                val class46 = (if (bool) Class66.aWidgetComponent_1169 else Class66.aWidgetComponent_1150)!!
                if (i == 1600) {
                    anIntArray1149!![anInt1173++] = class46.anInt747
                    return
                }
                if (i == 1601) {
                    anIntArray1149!![anInt1173++] = class46.anInt755
                    return
                }
                if (i == 1602) {
                    aStringArray1152!![anInt1170++] = class46.aString792!!
                    return
                }
                if (i == 1603) {
                    anIntArray1149!![anInt1173++] = class46.anInt698
                    return
                }
                if (i == 1604) {
                    anIntArray1149!![anInt1173++] = class46.anInt791
                    return
                }
                if (i == 1605) {
                    anIntArray1149!![anInt1173++] = class46.anInt716
                    return
                }
                if (i == 1606) {
                    anIntArray1149!![anInt1173++] = class46.anInt757
                    return
                }
                if (i == 1607) {
                    anIntArray1149!![anInt1173++] = class46.anInt717
                    return
                }
                if (i == 1608) {
                    anIntArray1149!![anInt1173++] = class46.anInt675
                    return
                }
                if (i == 1609) {
                    anIntArray1149!![anInt1173++] = class46.anInt696
                    return
                }
                if (i == 1610) {
                    anIntArray1149!![anInt1173++] = class46.anInt808
                    return
                }
                if (i == 1611) {
                    anIntArray1149!![anInt1173++] = class46.anInt786
                    return
                }
                if (i == 1612) {
                    anIntArray1149!![anInt1173++] = class46.anInt756
                    return
                }
                if (i == 1613) {
                    val i_295_ = anIntArray1149!![--anInt1173]
                    val class254 = ProjectionCameraTransform.aEmoteDefCache_5764!!.method2600(i_295_, 28364)
                    if (class254.method1925(false)) aStringArray1152!![anInt1170++] = class46.method429(i_295_, (class254.aString3258), -1)!!
                    else {
                        anIntArray1149!![anInt1173++] = class46.method428((class254.anInt3256), i_295_, -126)
                        return
                    }
                    return
                }
                if (i == 1614) {
                    anIntArray1149!![anInt1173++] = class46.anInt828
                    return
                }
                if (i == 2614) {
                    anIntArray1149!![anInt1173++] = (if (class46.anInt770 == 1) class46.anInt753 else -1)
                    return
                }
            } else if (i < 1800) {
                val class46 = (if (bool) Class66.aWidgetComponent_1169 else Class66.aWidgetComponent_1150)!!
                if (i == 1700) {
                    anIntArray1149!![anInt1173++] = class46.anInt812
                    return
                }
                if (i == 1701) {
                    if (class46.anInt812 == -1) {
                        anIntArray1149!![anInt1173++] = 0
                        return
                    } else anIntArray1149!![anInt1173++] = class46.anInt781
                    return
                }
                if (i == 1702) {
                    anIntArray1149!![anInt1173++] = class46.anInt704
                    return
                }
            } else if (i < 1900) {
                val class46 = (if (bool) Class66.aWidgetComponent_1169 else Class66.aWidgetComponent_1150)!!
                if (i == 1800) {
                    anIntArray1149!![anInt1173++] = Client.method105(class46)!!.method3307(83)
                    return
                }
                if (i == 1801) {
                    var i_296_ = anIntArray1149!![--anInt1173]
                    i_296_--
                    if (class46.aStringArray833 == null || i_296_ >= class46.aStringArray833!!.size || class46.aStringArray833!![i_296_] == null) aStringArray1152!![anInt1170++] = ""
                    else {
                        aStringArray1152!![anInt1170++] = class46.aStringArray833!![i_296_]!!
                        return
                    }
                    return
                }
                if (i == 1802) {
                    if (class46.aString752 == null) aStringArray1152!![anInt1170++] = ""
                    else {
                        aStringArray1152!![anInt1170++] = class46.aString752!!
                        return
                    }
                    return
                }
            } else if (i < 2000 || i >= 2900 && i < 3000) {
                val widgetComponent: WidgetComponent?
                if (i >= 2000) {
                    widgetComponent = method2570(1512932720, anIntArray1149!![--anInt1173])
                    i -= 1000
                } else widgetComponent = if (bool) aWidgetComponent_1169 else aWidgetComponent_1150
                if (anInt1177 >= 10) throw RuntimeException("C29xx-1")
                if (i == 1927) {
                    if (widgetComponent!!.anObjectArray727 != null) {
                        val class348_sub36 = WidgetActionEntry()
                        class348_sub36.aWidgetComponent_6989 = widgetComponent
                        class348_sub36.anObjectArray6987 = widgetComponent.anObjectArray727
                        class348_sub36.anInt6988 = anInt1177 + 1
                        HashTileShape.aNodeDeque_8810!!.method1999(class348_sub36, -20180)
                        return
                    }
                    return
                }
            } else if (i < 2600) {
                val class46 = method2570(1512932720, anIntArray1149!![--anInt1173])
                if (i == 2500) {
                    anIntArray1149!![anInt1173++] = class46!!.anInt800
                    return
                }
                if (i == 2501) {
                    anIntArray1149!![anInt1173++] = class46!!.anInt750
                    return
                }
                if (i == 2502) {
                    anIntArray1149!![anInt1173++] = class46!!.anInt709
                    return
                }
                if (i == 2503) {
                    anIntArray1149!![anInt1173++] = class46!!.anInt789
                    return
                }
                if (i == 2504) {
                    anIntArray1149!![anInt1173++] = if (class46!!.aBoolean813) 1 else 0
                    return
                }
                if (i == 2505) {
                    anIntArray1149!![anInt1173++] = class46!!.anInt834
                    return
                }
                if (i == 1506) {
                    val class46_297_ = WorldMapScene.method1687(class46!!, 3)
                    anIntArray1149!![anInt1173++] = (if (class46_297_ == null) -1 else class46_297_.anInt830)
                    return
                }
            } else if (i < 2700) {
                val class46 = method2570(1512932720, anIntArray1149!![--anInt1173])
                if (i == 2600) {
                    anIntArray1149!![anInt1173++] = class46!!.anInt747
                    return
                }
                if (i == 2601) {
                    anIntArray1149!![anInt1173++] = class46!!.anInt755
                    return
                }
                if (i == 2602) {
                    aStringArray1152!![anInt1170++] = class46!!.aString792!!
                    return
                }
                if (i == 2603) {
                    anIntArray1149!![anInt1173++] = class46!!.anInt698
                    return
                }
                if (i == 2604) {
                    anIntArray1149!![anInt1173++] = class46!!.anInt791
                    return
                }
                if (i == 2605) {
                    anIntArray1149!![anInt1173++] = class46!!.anInt716
                    return
                }
                if (i == 2606) {
                    anIntArray1149!![anInt1173++] = class46!!.anInt757
                    return
                }
                if (i == 2607) {
                    anIntArray1149!![anInt1173++] = class46!!.anInt717
                    return
                }
                if (i == 2608) {
                    anIntArray1149!![anInt1173++] = class46!!.anInt675
                    return
                }
                if (i == 2609) {
                    anIntArray1149!![anInt1173++] = class46!!.anInt696
                    return
                }
                if (i == 2610) {
                    anIntArray1149!![anInt1173++] = class46!!.anInt808
                    return
                }
                if (i == 2611) {
                    anIntArray1149!![anInt1173++] = class46!!.anInt786
                    return
                }
                if (i == 2612) {
                    anIntArray1149!![anInt1173++] = class46!!.anInt756
                    return
                }
                if (i == 2613) {
                    anIntArray1149!![anInt1173++] = class46!!.anInt828
                    return
                }
                if (i == 2614) {
                    anIntArray1149!![anInt1173++] = (if (class46!!.anInt770 == 1) class46.anInt753 else -1)
                    return
                }
            } else if (i < 2800) {
                if (i == 2700) {
                    val class46 = method2570(1512932720, anIntArray1149!![--anInt1173])
                    anIntArray1149!![anInt1173++] = class46!!.anInt812
                    return
                }
                if (i == 2701) {
                    val class46 = method2570(1512932720, anIntArray1149!![--anInt1173])
                    if (class46!!.anInt812 == -1) {
                        anIntArray1149!![anInt1173++] = 0
                        return
                    } else anIntArray1149!![anInt1173++] = class46.anInt781
                    return
                }
                if (i == 2702) {
                    val i_298_ = anIntArray1149!![--anInt1173]
                    val class348_sub41 = (MinimapSpriteRenderer.aHashtable_4915!!.method3480(i_298_.toLong(), -6008) as RegionSceneShifter?)
                    if (class348_sub41 == null) {
                        anIntArray1149!![anInt1173++] = 0
                        return
                    } else anIntArray1149!![anInt1173++] = 1
                    return
                }
                if (i == 2703) {
                    val class46 = method2570(1512932720, anIntArray1149!![--anInt1173])
                    if (class46!!.aWidgetComponentArray798 == null) anIntArray1149!![anInt1173++] = 0
                    else {
                        var i_299_ = class46.aWidgetComponentArray798!!.size
                        var i_300_ = 0
                        while ((i_300_ < class46.aWidgetComponentArray798!!.size)) {
                            if (class46.aWidgetComponentArray798!![i_300_] == null) {
                                i_299_ = i_300_
                                break
                            }
                            i_300_++
                        }
                        anIntArray1149!![anInt1173++] = i_299_
                        return
                    }
                    return
                }
                if (i == 2704 || i == 2705) {
                    anInt1173 -= 2
                    val i_301_ = anIntArray1149!![anInt1173]
                    val i_302_ = anIntArray1149!![anInt1173 + 1]
                    val class348_sub41 = (MinimapSpriteRenderer.aHashtable_4915!!.method3480(i_301_.toLong(), -6008) as RegionSceneShifter?)
                    if (class348_sub41 != null && (class348_sub41.anInt7050 == i_302_)) anIntArray1149!![anInt1173++] = 1
                    else {
                        anIntArray1149!![anInt1173++] = 0
                        return
                    }
                    return
                }
            } else if (i < 2900) {
                val class46 = method2570(1512932720, anIntArray1149!![--anInt1173])
                if (i == 2800) {
                    anIntArray1149!![anInt1173++] = Client.method105(class46!!)!!.method3307(11)
                    return
                }
                if (i == 2801) {
                    var i_303_ = anIntArray1149!![--anInt1173]
                    i_303_--
                    if (class46!!.aStringArray833 == null || i_303_ >= class46.aStringArray833!!.size || class46.aStringArray833!![i_303_] == null) aStringArray1152!![anInt1170++] = ""
                    else {
                        aStringArray1152!![anInt1170++] = class46.aStringArray833!![i_303_]!!
                        return
                    }
                    return
                }
                if (i == 2802) {
                    if (class46!!.aString752 == null) aStringArray1152!![anInt1170++] = ""
                    else {
                        aStringArray1152!![anInt1170++] = class46.aString752!!
                        return
                    }
                    return
                }
            } else if (i < 3200) {
                if (i == 3100) {
                    val string = aStringArray1152!![--anInt1170]
                    SpriteSheetCache.method1429(string, 0)
                    return
                }
                if (i == 3101) {
                    anInt1173 -= 2
                    method222((LocalPlayerState.aPlayer_1907), anIntArray1149!![anInt1173], 4.toByte(), anIntArray1149!![anInt1173 + 1])
                    return
                }
                if (i == 3103) {
                    LocalizedText.method2060((-101).toByte(), true)
                    return
                }
                if (i == 3104) {
                    val string = aStringArray1152!![--anInt1170]!!
                    var i_304_ = 0
                    if (method468(string, 73)) i_304_ = RegionSceneShifter.method3156(true, string)
                    anInt1163++
                    val class348_sub47 = method2148((LongKeyNode.aFontMetaRef_6764), (TheoraVideoStream.aClass77_9029), -112)
                    class348_sub47.aClass348_Sub49_Sub2_7116!!.writeInt(102.toByte(), i_304_)
                    InterfaceComponentGroup.method3243(116, class348_sub47)
                    return
                }
                if (i == 3105) {
                    val string = aStringArray1152!![--anInt1170]!!
                    anInt1162++
                    val class348_sub47 = method2148(RsaPacketDecoder.aFontMetaRef_4225, (TheoraVideoStream.aClass77_9029), -96)
                    class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByte(false, string.length + 1)
                    class348_sub47.aClass348_Sub49_Sub2_7116!!.writeString((-5).toByte(), string)
                    InterfaceComponentGroup.method3243(-81, class348_sub47)
                    return
                }
                if (i == 3106) {
                    val string = aStringArray1152!![--anInt1170]!!
                    anInt1153++
                    val class348_sub47 = method2148((VoronoiNoiseTextureNode.aFontMetaRef_9130), (TheoraVideoStream.aClass77_9029), -93)
                    class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByte(false, string.length + 1)
                    class348_sub47.aClass348_Sub49_Sub2_7116!!.writeString((-5).toByte(), string)
                    InterfaceComponentGroup.method3243(35, class348_sub47)
                    return
                }
                if (i == 3107) {
                    val i_305_ = anIntArray1149!![--anInt1173]
                    val string = aStringArray1152!![--anInt1170]
                    method201(i_305_, -7257, string)
                    return
                }
                if (i == 3108) {
                    anInt1173 -= 3
                    val i_306_ = anIntArray1149!![anInt1173]
                    val i_307_ = anIntArray1149!![anInt1173 + 1]
                    val i_308_ = anIntArray1149!![anInt1173 + 2]
                    val class46 = method2570(1512932720, i_308_)
                    MinimapRenderer.method887(class46, i_306_, i_307_, 2147483647)
                    return
                }
                if (i == 3109) {
                    anInt1173 -= 2
                    val i_309_ = anIntArray1149!![anInt1173]
                    val i_310_ = anIntArray1149!![anInt1173 + 1]
                    val class46 = if (bool) aWidgetComponent_1169 else aWidgetComponent_1150
                    MinimapRenderer.method887(class46, i_309_, i_310_, 2147483647)
                    return
                }
                if (i == 3110) {
                    val i_311_ = anIntArray1149!![--anInt1173]
                    anInt1167++
                    val class348_sub47 = method2148((GradientLookupEffect.aFontMetaRef_9189), (TheoraVideoStream.aClass77_9029), -121)
                    class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShort(107.toByte(), i_311_)
                    InterfaceComponentGroup.method3243(122, class348_sub47)
                    return
                }
                if (i == 3111) {
                    anInt1173 -= 2
                    val i_312_ = anIntArray1149!![anInt1173]
                    val i_313_ = anIntArray1149!![anInt1173 + 1]
                    val class348_sub41 = (MinimapSpriteRenderer.aHashtable_4915!!.method3480(i_312_.toLong(), -6008) as RegionSceneShifter?)
                    if (class348_sub41 != null) ScrollingWidgetComponentNode.method1118((class348_sub41.anInt7050 != i_313_), true, class348_sub41, 2533)
                    MapTileShape.method2661(i_313_, i_312_, 3, true, 2)
                    return
                }
                if (i == 3112) {
                    anInt1173--
                    val i_314_ = anIntArray1149!![anInt1173]
                    val class348_sub41 = (MinimapSpriteRenderer.aHashtable_4915!!.method3480(i_314_.toLong(), -6008) as RegionSceneShifter?)
                    if (class348_sub41 != null && class348_sub41.anInt7053 == 3) ScrollingWidgetComponentNode.method1118(true, true, class348_sub41, 2533)
                    return
                }
                if (i == 3113) {
                    BooleanGraphicsOptionState.method1721(aStringArray1152!![--anInt1170], (-70).toByte())
                    return
                }
                if (i == 3114) {
                    anInt1173 -= 2
                    val i_315_ = anIntArray1149!![anInt1173]
                    val i_316_ = anIntArray1149!![anInt1173 + 1]
                    val string = aStringArray1152!![--anInt1170]
                    FixedFunctionMaterialPass.method2144("", i_315_, (-87).toByte(), i_316_, string, "", "")
                    return
                }
                if (i == 3115) {
                    anInt1173 -= 11
                    val class221s = HeapInfoRecord.method1248(20)
                    val class341s = method596(20000)
                    method2051(anIntArray1149!![anInt1173 + 9], anIntArray1149!![anInt1173 + 5], class221s[anIntArray1149!![anInt1173]], (class341s[anIntArray1149!![anInt1173 + 1]]), anIntArray1149!![anInt1173 + 7], anIntArray1149!![anInt1173 + 6], anIntArray1149!![anInt1173 + 4], 111.toByte(), anIntArray1149!![anInt1173 + 10], anIntArray1149!![anInt1173 + 2], anIntArray1149!![anInt1173 + 3], anIntArray1149!![anInt1173 + 8])
                    return
                }
            } else if (i < 3300) {
                if (i == 3200) {
                    anInt1173 -= 3
                    TextureTileRenderer.method2947(true, 255, anIntArray1149!![anInt1173], anIntArray1149!![anInt1173 + 1], anIntArray1149!![anInt1173 + 2], 256)
                    return
                }
                if (i == 3201) {
                    HeadIconRenderer.method1212(255, anIntArray1149!![--anInt1173], -1, 50)
                    return
                }
                if (i == 3202) {
                    anInt1173 -= 2
                    ClickFeedbackTask.method1352(anIntArray1149!![anInt1173], 255, anIntArray1149!![anInt1173 + 1], (-98).toByte())
                    return
                }
                if (i == 3203) {
                    anInt1173 -= 4
                    TextureTileRenderer.method2947(true, anIntArray1149!![anInt1173 + 3], anIntArray1149!![anInt1173], anIntArray1149!![anInt1173 + 1], anIntArray1149!![anInt1173 + 2], 256)
                    return
                }
                if (i == 3204) {
                    anInt1173 -= 3
                    HeadIconRenderer.method1212(anIntArray1149!![anInt1173 + 1], anIntArray1149!![anInt1173], -1, anIntArray1149!![anInt1173 + 2])
                    return
                }
                if (i == 3205) {
                    anInt1173 -= 3
                    ClickFeedbackTask.method1352(anIntArray1149!![anInt1173], anIntArray1149!![anInt1173 + 2], anIntArray1149!![anInt1173 + 1], (-98).toByte())
                    return
                }
                if (i == 3206) {
                    anInt1173 -= 4
                    SoundChannelMixer.method2090(anIntArray1149!![anInt1173 + 1], 256, false, (-35).toByte(), anIntArray1149!![anInt1173 + 3], anIntArray1149!![anInt1173 + 2], anIntArray1149!![anInt1173])
                    return
                }
                if (i == 3207) {
                    anInt1173 -= 4
                    SoundChannelMixer.method2090(anIntArray1149!![anInt1173 + 1], 256, true, (-35).toByte(), anIntArray1149!![anInt1173 + 3], anIntArray1149!![anInt1173 + 2], anIntArray1149!![anInt1173])
                    return
                }
                if (i == 3208) {
                    anInt1173 -= 5
                    TextureTileRenderer.method2947(true, anIntArray1149!![anInt1173 + 3], anIntArray1149!![anInt1173], anIntArray1149!![anInt1173 + 1], anIntArray1149!![anInt1173 + 2], anIntArray1149!![anInt1173 + 4])
                    return
                }
                if (i == 3209) {
                    anInt1173 -= 5
                    SoundChannelMixer.method2090(anIntArray1149!![anInt1173 + 1], anIntArray1149!![anInt1173 + 4], false, (-35).toByte(), anIntArray1149!![anInt1173 + 3], anIntArray1149!![anInt1173 + 2], anIntArray1149!![anInt1173])
                    return
                }
            } else if (i < 3400) {
                if (i == 3300) {
                    anIntArray1149!![anInt1173++] = Class367_Sub11.anInt7396
                    return
                }
                if (i == 3301) {
                    anInt1173 -= 2
                    val i_317_ = anIntArray1149!![anInt1173]
                    val i_318_ = anIntArray1149!![anInt1173 + 1]
                    anIntArray1149!![anInt1173++] = ImageFrameCache.method2552(false, i_317_, i_318_, -24667)
                    return
                }
                if (i == 3302) {
                    anInt1173 -= 2
                    val i_319_ = anIntArray1149!![anInt1173]
                    val i_320_ = anIntArray1149!![anInt1173 + 1]
                    anIntArray1149!![anInt1173++] = WorldMapRenderer.method1854(71, i_319_, false, i_320_)
                    return
                }
                if (i == 3303) {
                    anInt1173 -= 2
                    val i_321_ = anIntArray1149!![anInt1173]
                    val i_322_ = anIntArray1149!![anInt1173 + 1]
                    anIntArray1149!![anInt1173++] = method532(i_322_, i_321_, false, -126)
                    return
                }
                if (i == 3304) {
                    val i_323_ = anIntArray1149!![--anInt1173]
                    anIntArray1149!![anInt1173++] = (ScrollingWidgetComponentNode.aParticleEffectCache_8378!!.method2044(106, i_323_).anInt9542)
                    return
                }
                if (i == 3305) {
                    val i_324_ = anIntArray1149!![--anInt1173]
                    anIntArray1149!![anInt1173++] = ServerConnectionInfo.anIntArray2145!![i_324_]
                    return
                }
                if (i == 3306) {
                    val i_325_ = anIntArray1149!![--anInt1173]
                    anIntArray1149!![anInt1173++] = SpotAnimDefCache.anIntArray3295!![i_325_]
                    return
                }
                if (i == 3307) {
                    val i_326_ = anIntArray1149!![--anInt1173]
                    anIntArray1149!![anInt1173++] = TextureGenerator.anIntArray2497!![i_326_]
                    return
                }
                if (i == 3308) {
                    val i_327_ = (LocalPlayerState.aPlayer_1907!!.plane).toInt()
                    val i_328_ = (((LocalPlayerState.aPlayer_1907!!.x) shr 9) + ArbVertexProgram.regionTileX)
                    val i_329_ = (((LocalPlayerState.aPlayer_1907!!.y) shr 9) + Class90.regionTileY)
                    anIntArray1149!![anInt1173++] = (i_327_ shl 28) + (i_328_ shl 14) + i_329_
                    return
                }
                if (i == 3309) {
                    val i_330_ = anIntArray1149!![--anInt1173]
                    anIntArray1149!![anInt1173++] = i_330_ shr 14 and 0x3fff
                    return
                }
                if (i == 3310) {
                    val i_331_ = anIntArray1149!![--anInt1173]
                    anIntArray1149!![anInt1173++] = i_331_ shr 28
                    return
                }
                if (i == 3311) {
                    val i_332_ = anIntArray1149!![--anInt1173]
                    anIntArray1149!![anInt1173++] = i_332_ and 0x3fff
                    return
                }
                if (i == 3312) {
                    anIntArray1149!![anInt1173++] = if (ModelBatchBase.aBoolean1900) 1 else 0
                    return
                }
                if (i == 3313) {
                    anInt1173 -= 2
                    val i_333_ = anIntArray1149!![anInt1173]
                    val i_334_ = anIntArray1149!![anInt1173 + 1]
                    anIntArray1149!![anInt1173++] = ImageFrameCache.method2552(true, i_333_, i_334_, -24667)
                    return
                }
                if (i == 3314) {
                    anInt1173 -= 2
                    val i_335_ = anIntArray1149!![anInt1173]
                    val i_336_ = anIntArray1149!![anInt1173 + 1]
                    anIntArray1149!![anInt1173++] = WorldMapRenderer.method1854(103, i_335_, true, i_336_)
                    return
                }
                if (i == 3315) {
                    anInt1173 -= 2
                    val i_337_ = anIntArray1149!![anInt1173]
                    val i_338_ = anIntArray1149!![anInt1173 + 1]
                    anIntArray1149!![anInt1173++] = method532(i_338_, i_337_, true, 126)
                    return
                }
                if (i == 3316) {
                    if (AsyncTaskHandle.anInt2581 >= 2) anIntArray1149!![anInt1173++] = AsyncTaskHandle.anInt2581
                    else {
                        anIntArray1149!![anInt1173++] = 0
                        return
                    }
                    return
                }
                if (i == 3317) {
                    anIntArray1149!![anInt1173++] = RegionSceneLoader.anInt3699
                    return
                }
                if (i == 3318) {
                    anIntArray1149!![anInt1173++] = CacheStateResetter.aServerConnectionInfo_125!!.anInt2143
                    return
                }
                if (i == 3321) {
                    anIntArray1149!![anInt1173++] = ConfigVarProgress.anInt4816
                    return
                }
                if (i == 3322) {
                    anIntArray1149!![anInt1173++] = MinimapStateReset.anInt1872
                    return
                }
                if (i == 3323) {
                    if (MinimapSpriteRenderer.anInt4919 >= 5 && MinimapSpriteRenderer.anInt4919 <= 9) anIntArray1149!![anInt1173++] = 1
                    else {
                        anIntArray1149!![anInt1173++] = 0
                        return
                    }
                    return
                }
                if (i == 3324) {
                    if (MinimapSpriteRenderer.anInt4919 >= 5 && MinimapSpriteRenderer.anInt4919 <= 9) anIntArray1149!![anInt1173++] = MinimapSpriteRenderer.anInt4919
                    else {
                        anIntArray1149!![anInt1173++] = 0
                        return
                    }
                    return
                }
                if (i == 3325) {
                    anIntArray1149!![anInt1173++] = if (FrameBufferObject.aBoolean4888) 1 else 0
                    return
                }
                if (i == 3326) {
                    anIntArray1149!![anInt1173++] = (LocalPlayerState.aPlayer_1907!!.anInt10516)
                    return
                }
                if (i == 3327) {
                    anIntArray1149!![anInt1173++] = if ((LocalPlayerState.aPlayer_1907!!.aCompositeNpcModelBuilder_10536) != null && LocalPlayerState.aPlayer_1907!!.aCompositeNpcModelBuilder_10536!!.aBoolean2100) 1 else 0
                    return
                }
                if (i == 3329) {
                    anIntArray1149!![anInt1173++] = if (MinimapTriangleDrawer.aBoolean5233) 1 else 0
                    return
                }
                if (i == 3330) {
                    val i_339_ = anIntArray1149!![--anInt1173]
                    anIntArray1149!![anInt1173++] = SkeletonSequenceLoader.method2301(35.toByte(), i_339_, false)
                    return
                }
                if (i == 3331) {
                    anInt1173 -= 2
                    val i_340_ = anIntArray1149!![anInt1173]
                    val i_341_ = anIntArray1149!![anInt1173 + 1]
                    anIntArray1149!![anInt1173++] = Class61.method592(false, (-128).toByte(), false, i_340_, i_341_)
                    return
                }
                if (i == 3332) {
                    anInt1173 -= 2
                    val i_342_ = anIntArray1149!![anInt1173]
                    val i_343_ = anIntArray1149!![anInt1173 + 1]
                    anIntArray1149!![anInt1173++] = Class61.method592(true, (-128).toByte(), false, i_342_, i_343_)
                    return
                }
                if (i == 3333) {
                    anIntArray1149!![anInt1173++] = RuntimeException_Sub1.anInt4596
                    return
                }
                if (i == 3335) {
                    anIntArray1149!![anInt1173++] = AnimationFrameDefinition.anInt6967
                    return
                }
                if (i == 3336) {
                    anInt1173 -= 4
                    var i_344_ = anIntArray1149!![anInt1173]
                    val i_345_ = anIntArray1149!![anInt1173 + 1]
                    val i_346_ = anIntArray1149!![anInt1173 + 2]
                    val i_347_ = anIntArray1149!![anInt1173 + 3]
                    i_344_ += i_345_ shl 14
                    i_344_ += i_346_ shl 28
                    i_344_ += i_347_
                    anIntArray1149!![anInt1173++] = i_344_
                    return
                }
                if (i == 3337) {
                    anIntArray1149!![anInt1173++] = SocketStreamWorker.anInt2670
                    return
                }
                if (i == 3338) {
                    anIntArray1149!![anInt1173++] = ViewportTransform.method2116(-26584)
                    return
                }
                if (i == 3339) {
                    anIntArray1149!![anInt1173++] = 0
                    return
                }
                if (i == 3340) {
                    anIntArray1149!![anInt1173++] = if (SizeBoundedSoftCache.aBoolean2329) 1 else 0
                    return
                }
                if (i == 3341) {
                    anIntArray1149!![anInt1173++] = if (PlayerAppearanceUpdateDecoder.aBoolean4540) 1 else 0
                    return
                }
                if (i == 3342) {
                    anIntArray1149!![anInt1173++] = GlTexture1D.aInputTracker_8552!!.method3597(true)
                    return
                }
                if (i == 3343) {
                    anIntArray1149!![anInt1173++] = GlTexture1D.aInputTracker_8552!!.method3594(127.toByte())
                    return
                }
                if (i == 3344) {
                    aStringArray1152!![anInt1170++] = ArchiveResourceProvider.method2347((-119).toByte())!!
                    return
                }
                if (i == 3345) {
                    aStringArray1152!![anInt1170++] = method217(112.toByte())!!
                    return
                }
                if (i == 3346) {
                    anIntArray1149!![anInt1173++] = ModelWallEntity.method2489((-106).toByte())
                    return
                }
                if (i == 3347) {
                    anIntArray1149!![anInt1173++] = GlShaderProgramHandle.anInt4179
                    return
                }
                if (i == 3349) {
                    anIntArray1149!![anInt1173++] = LocalPlayerState.aPlayer_1907!!.aCompassSmoother_10217.method2019((-31).toByte()) shr 3
                    return
                }
                if (i == 3351) {
                    anIntArray1149!![anInt1173++] = if (GlTexture1D.aInputTracker_8552!!.method3595(-83)) 1 else 0
                    anIntArray1149!![anInt1173++] = if (GlTexture1D.aInputTracker_8552!!.method3588(-121)) 1 else 0
                    anIntArray1149!![anInt1173++] = if (GlTexture1D.aInputTracker_8552!!.method3590(125.toByte())) 1 else 0
                    return
                }
            } else if (i < 3500) {
                if (i == 3400) {
                    anInt1173 -= 2
                    val i_348_ = anIntArray1149!![anInt1173]
                    val i_349_ = anIntArray1149!![anInt1173 + 1]
                    val class117 = RegionTileNode.aCacheArchiveIndexLoader_6653!!.method337(true, i_348_)
                    aStringArray1152!![anInt1170++] = class117.method1074(i_349_, 124)
                    return
                }
                if (i == 3408) {
                    anInt1173 -= 4
                    val i_350_ = anIntArray1149!![anInt1173]
                    val i_351_ = anIntArray1149!![anInt1173 + 1]
                    val i_352_ = anIntArray1149!![anInt1173 + 2]
                    val i_353_ = anIntArray1149!![anInt1173 + 3]
                    val class117 = RegionTileNode.aCacheArchiveIndexLoader_6653!!.method337(true, i_352_)
                    if (class117.aChar1778.code != i_350_ || class117.aChar1779.code != i_351_) throw RuntimeException("C3408-1 " + i_352_ + "-" + i_353_)
                    if (i_351_ == 115) aStringArray1152!![anInt1170++] = class117.method1074(i_353_, 119)
                    else {
                        anIntArray1149!![anInt1173++] = class117.method1073(false, i_353_)
                        return
                    }
                    return
                }
                if (i == 3409) {
                    anInt1173 -= 3
                    val i_354_ = anIntArray1149!![anInt1173]
                    val i_355_ = anIntArray1149!![anInt1173 + 1]
                    val i_356_ = anIntArray1149!![anInt1173 + 2]
                    if (i_355_ == -1) throw RuntimeException("C3409-2")
                    val class117 = RegionTileNode.aCacheArchiveIndexLoader_6653!!.method337(true, i_355_)
                    if (class117.aChar1779.code != i_354_) throw RuntimeException("C3409-1")
                    anIntArray1149!![anInt1173++] = if (class117.method1067(true, i_356_)) 1 else 0
                    return
                }
                if (i == 3410) {
                    val i_357_ = anIntArray1149!![--anInt1173]
                    val string = aStringArray1152!![--anInt1170]!!
                    if (i_357_ == -1) throw RuntimeException("C3410-2")
                    val class117 = RegionTileNode.aCacheArchiveIndexLoader_6653!!.method337(true, i_357_)
                    if (class117.aChar1779 != 's') throw RuntimeException("C3410-1")
                    anIntArray1149!![anInt1173++] = if (class117.method1066(false, string)) 1 else 0
                    return
                }
                if (i == 3411) {
                    val i_358_ = anIntArray1149!![--anInt1173]
                    val class117 = RegionTileNode.aCacheArchiveIndexLoader_6653!!.method337(true, i_358_)
                    anIntArray1149!![anInt1173++] = class117.aHashtable_1767!!.method3474(1)
                    return
                }
            } else if (i < 3700) {
                if (i == 3600) {
                    if (MinimapSpriteRenderer.anInt4930 == 0) anIntArray1149!![anInt1173++] = -2
                    else {
                        if (MinimapSpriteRenderer.anInt4930 == 1) anIntArray1149!![anInt1173++] = -1
                        else {
                            anIntArray1149!![anInt1173++] = HslAdjustTextureNode.anInt9383
                            return
                        }
                        return
                    }
                    return
                }
                if (i == 3601) {
                    val i_359_ = anIntArray1149!![--anInt1173]
                    if (MinimapSpriteRenderer.anInt4930 == 2 && i_359_ < HslAdjustTextureNode.anInt9383) {
                        aStringArray1152!![anInt1170++] = Class83.aStringArray1441!![i_359_]
                        if (FixedFunctionMaterialPass.aStringArray6205!![i_359_] != null) aStringArray1152!![anInt1170++] = FixedFunctionMaterialPass.aStringArray6205!![i_359_]!!
                        else aStringArray1152!![anInt1170++] = ""
                    } else {
                        aStringArray1152!![anInt1170++] = ""
                        aStringArray1152!![anInt1170++] = ""
                        return
                    }
                    return
                }
                if (i == 3602) {
                    val i_360_ = anIntArray1149!![--anInt1173]
                    if (MinimapSpriteRenderer.anInt4930 == 2 && i_360_ < HslAdjustTextureNode.anInt9383) anIntArray1149!![anInt1173++] = Renderer.anIntArray4578!![i_360_]
                    else {
                        anIntArray1149!![anInt1173++] = 0
                        return
                    }
                    return
                }
                if (i == 3603) {
                    val i_361_ = anIntArray1149!![--anInt1173]
                    if (MinimapSpriteRenderer.anInt4930 == 2 && i_361_ < HslAdjustTextureNode.anInt9383) anIntArray1149!![anInt1173++] = NpcCountAccessor.anIntArray2280!![i_361_]
                    else {
                        anIntArray1149!![anInt1173++] = 0
                        return
                    }
                    return
                }
                if (i == 3604) {
                    val string = aStringArray1152!![--anInt1170]!!
                    val i_362_ = anIntArray1149!![--anInt1173]
                    NpcDefinitionCache.method1982(16, i_362_, string)
                    return
                }
                if (i == 3605) {
                    val string = aStringArray1152!![--anInt1170]
                    method3128(-81, string)
                    return
                }
                if (i == 3606) {
                    val string = aStringArray1152!![--anInt1170]
                    method2165(true, string)
                    return
                }
                if (i == 3607) {
                    val string = aStringArray1152!![--anInt1170]
                    method317(string, 117, false)
                    return
                }
                if (i == 3608) {
                    val string = aStringArray1152!![--anInt1170]
                    method3538(true, string)
                    return
                }
                if (i == 3609) {
                    var string = aStringArray1152!![--anInt1170]!!
                    if (string.startsWith("<img=0>") || string.startsWith("<img=1>")) string = string.substring(7)
                    anIntArray1149!![anInt1173++] = (if (KeyEventNode.method2797(string, (-63).toByte())) 1 else 0)
                    return
                }
                if (i == 3610) {
                    val i_363_ = anIntArray1149!![--anInt1173]
                    if (MinimapSpriteRenderer.anInt4930 == 2 && i_363_ < HslAdjustTextureNode.anInt9383) aStringArray1152!![anInt1170++] = GlBufferObject.aStringArray4744!![i_363_]!!
                    else {
                        aStringArray1152!![anInt1170++] = ""
                        return
                    }
                    return
                }
                if (i == 3611) {
                    if (MinimapShapeDrawer.aString863 == null) {
                        aStringArray1152!![anInt1170++] = ""
                        return
                    } else aStringArray1152!![anInt1170++] = SettingsCrcWriter.method1245(MinimapShapeDrawer.aString863!!, false)
                    return
                }
                if (i == 3612) {
                    if (MinimapShapeDrawer.aString863 == null) {
                        anIntArray1149!![anInt1173++] = 0
                        return
                    } else anIntArray1149!![anInt1173++] = ByteArrayPool.anInt496
                    return
                }
                if (i == 3613) {
                    val i_364_ = anIntArray1149!![--anInt1173]
                    if (MinimapShapeDrawer.aString863 != null && i_364_ < ByteArrayPool.anInt496) aStringArray1152!![anInt1170++] = (HostPingThread.aWorldListEntryArray2261!![i_364_]!!.aString314!!)
                    else {
                        aStringArray1152!![anInt1170++] = ""
                        return
                    }
                    return
                }
                if (i == 3614) {
                    val i_365_ = anIntArray1149!![--anInt1173]
                    if (MinimapShapeDrawer.aString863 != null && i_365_ < ByteArrayPool.anInt496) anIntArray1149!![anInt1173++] = (HostPingThread.aWorldListEntryArray2261!![i_365_]!!.anInt308)
                    else {
                        anIntArray1149!![anInt1173++] = 0
                        return
                    }
                    return
                }
                if (i == 3615) {
                    val i_366_ = anIntArray1149!![--anInt1173]
                    if (MinimapShapeDrawer.aString863 != null && i_366_ < ByteArrayPool.anInt496) anIntArray1149!![anInt1173++] = (HostPingThread.aWorldListEntryArray2261!![i_366_]!!.aByte310).toInt()
                    else {
                        anIntArray1149!![anInt1173++] = 0
                        return
                    }
                    return
                }
                if (i == 3616) {
                    anIntArray1149!![anInt1173++] = ModelDefinitionCache.aByte2871.toInt()
                    return
                }
                if (i == 3617) {
                    val string = aStringArray1152!![--anInt1170]!!
                    WorldMapToggle.method2298((-117).toByte(), string)
                    return
                }
                if (i == 3618) {
                    anIntArray1149!![anInt1173++] = NativeIndexBuffer.aByte4702.toInt()
                    return
                }
                if (i == 3619) {
                    val string = aStringArray1152!![--anInt1170]!!
                    WallSceneEntity.method2399(string, -117)
                    return
                }
                if (i == 3620) {
                    ManagedGlResource.method1867(77)
                    return
                }
                if (i == 3621) {
                    if (MinimapSpriteRenderer.anInt4930 == 0) anIntArray1149!![anInt1173++] = -1
                    else {
                        anIntArray1149!![anInt1173++] = ContactEntry.anInt9604
                        return
                    }
                    return
                }
                if (i == 3622) {
                    val i_367_ = anIntArray1149!![--anInt1173]
                    if (MinimapSpriteRenderer.anInt4930 != 0 && i_367_ < ContactEntry.anInt9604) {
                        aStringArray1152!![anInt1170++] = Class51.aStringArray932!![i_367_]!!
                        if (WeaveTextureNode.aStringArray9275!![i_367_] != null) aStringArray1152!![anInt1170++] = (WeaveTextureNode.aStringArray9275!![i_367_]!!)
                        else aStringArray1152!![anInt1170++] = ""
                    } else {
                        aStringArray1152!![anInt1170++] = ""
                        aStringArray1152!![anInt1170++] = ""
                        return
                    }
                    return
                }
                if (i == 3623) {
                    var string = aStringArray1152!![--anInt1170]!!
                    if (string.startsWith("<img=0>") || string.startsWith("<img=1>")) string = string.substring(7)
                    anIntArray1149!![anInt1173++] = if (FontMetaRef.method3455(string, 28280)) 1 else 0
                    return
                }
                if (i == 3624) {
                    val i_368_ = anIntArray1149!![--anInt1173]
                    if (HostPingThread.aWorldListEntryArray2261 != null && i_368_ < ByteArrayPool.anInt496 && (HostPingThread.aWorldListEntryArray2261!![i_368_]!!.aString306.equals(LocalPlayerState.aPlayer_1907!!.aString10544, ignoreCase = true))) anIntArray1149!![anInt1173++] = 1
                    else {
                        anIntArray1149!![anInt1173++] = 0
                        return
                    }
                    return
                }
                if (i == 3625) {
                    if (CameraSplineNode.aString6854 == null) {
                        aStringArray1152!![anInt1170++] = ""
                        return
                    } else aStringArray1152!![anInt1170++] = CameraSplineNode.aString6854
                    return
                }
                if (i == 3626) {
                    val i_369_ = anIntArray1149!![--anInt1173]
                    if (MinimapShapeDrawer.aString863 != null && i_369_ < ByteArrayPool.anInt496) aStringArray1152!![anInt1170++] = (HostPingThread.aWorldListEntryArray2261!![i_369_]!!.aString313!!)
                    else {
                        aStringArray1152!![anInt1170++] = ""
                        return
                    }
                    return
                }
                if (i == 3627) {
                    val i_370_ = anIntArray1149!![--anInt1173]
                    if (MinimapSpriteRenderer.anInt4930 == 2 && i_370_ >= 0 && i_370_ < HslAdjustTextureNode.anInt9383) anIntArray1149!![anInt1173++] = if (ObjectSpawnDecoder.aBooleanArray1806!![i_370_]) 1 else 0
                    else {
                        anIntArray1149!![anInt1173++] = 0
                        return
                    }
                    return
                }
                if (i == 3628) {
                    var string = aStringArray1152!![--anInt1170]!!
                    if (string.startsWith("<img=0>") || string.startsWith("<img=1>")) string = string.substring(7)
                    anIntArray1149!![anInt1173++] = ParticleConfigParser.method2274(string, -91)
                    return
                }
                if (i == 3629) {
                    anIntArray1149!![anInt1173++] = Renderer.anInt4583
                    return
                }
                if (i == 3630) {
                    val string = aStringArray1152!![--anInt1170]
                    method317(string, 119, true)
                    return
                }
                if (i == 3631) {
                    val i_371_ = anIntArray1149!![--anInt1173]
                    anIntArray1149!![anInt1173++] = if (Class367_Sub3.aBooleanArray7304!![i_371_]) 1 else 0
                    return
                }
                if (i == 3632) {
                    val i_372_ = anIntArray1149!![--anInt1173]
                    if (MinimapShapeDrawer.aString863 != null && i_372_ < ByteArrayPool.anInt496) aStringArray1152!![anInt1170++] = (HostPingThread.aWorldListEntryArray2261!![i_372_]!!.aString306!!)
                    else {
                        aStringArray1152!![anInt1170++] = ""
                        return
                    }
                    return
                }
                if (i == 3633) {
                    val i_373_ = anIntArray1149!![--anInt1173]
                    if (MinimapSpriteRenderer.anInt4930 != 0 && i_373_ < ContactEntry.anInt9604) aStringArray1152!![anInt1170++] = ObjectSpawnDecoder.aStringArray1808!![i_373_]
                    else {
                        aStringArray1152!![anInt1170++] = ""
                        return
                    }
                    return
                }
            } else if (i < 4000) {
                if (i == 3903) {
                    val i_374_ = anIntArray1149!![--anInt1173]
                    anIntArray1149!![anInt1173++] = DetailLevelOptionState.aClass54Array6114!![i_374_]!!.method499(21110)
                    return
                }
                if (i == 3904) {
                    val i_375_ = anIntArray1149!![--anInt1173]
                    anIntArray1149!![anInt1173++] = (DetailLevelOptionState.aClass54Array6114!![i_375_]!!.anInt969)
                    return
                }
                if (i == 3905) {
                    val i_376_ = anIntArray1149!![--anInt1173]
                    anIntArray1149!![anInt1173++] = (DetailLevelOptionState.aClass54Array6114!![i_376_]!!.anInt976)
                    return
                }
                if (i == 3906) {
                    val i_377_ = anIntArray1149!![--anInt1173]
                    anIntArray1149!![anInt1173++] = (DetailLevelOptionState.aClass54Array6114!![i_377_]!!.anInt967)
                    return
                }
                if (i == 3907) {
                    val i_378_ = anIntArray1149!![--anInt1173]
                    anIntArray1149!![anInt1173++] = (DetailLevelOptionState.aClass54Array6114!![i_378_]!!.anInt977)
                    return
                }
                if (i == 3908) {
                    val i_379_ = anIntArray1149!![--anInt1173]
                    anIntArray1149!![anInt1173++] = (DetailLevelOptionState.aClass54Array6114!![i_379_]!!.anInt973)
                    return
                }
                if (i == 3910) {
                    val i_380_ = anIntArray1149!![--anInt1173]
                    val i_381_ = DetailLevelOptionState.aClass54Array6114!![i_380_]!!.method502(100.toByte())
                    anIntArray1149!![anInt1173++] = if (i_381_ == 0) 1 else 0
                    return
                }
                if (i == 3911) {
                    val i_382_ = anIntArray1149!![--anInt1173]
                    val i_383_ = DetailLevelOptionState.aClass54Array6114!![i_382_]!!.method502(118.toByte())
                    anIntArray1149!![anInt1173++] = if (i_383_ == 2) 1 else 0
                    return
                }
                if (i == 3912) {
                    val i_384_ = anIntArray1149!![--anInt1173]
                    val i_385_ = DetailLevelOptionState.aClass54Array6114!![i_384_]!!.method502((-100).toByte())
                    anIntArray1149!![anInt1173++] = if (i_385_ == 5) 1 else 0
                    return
                }
                if (i == 3913) {
                    val i_386_ = anIntArray1149!![--anInt1173]
                    val i_387_ = DetailLevelOptionState.aClass54Array6114!![i_386_]!!.method502(55.toByte())
                    anIntArray1149!![anInt1173++] = if (i_387_ == 1) 1 else 0
                    return
                }
            } else if (i < 4100) {
                if (i == 4000) {
                    anInt1173 -= 2
                    val i_388_ = anIntArray1149!![anInt1173]
                    val i_389_ = anIntArray1149!![anInt1173 + 1]
                    anIntArray1149!![anInt1173++] = i_388_ + i_389_
                    return
                }
                if (i == 4001) {
                    anInt1173 -= 2
                    val i_390_ = anIntArray1149!![anInt1173]
                    val i_391_ = anIntArray1149!![anInt1173 + 1]
                    anIntArray1149!![anInt1173++] = i_390_ - i_391_
                    return
                }
                if (i == 4002) {
                    anInt1173 -= 2
                    val i_392_ = anIntArray1149!![anInt1173]
                    val i_393_ = anIntArray1149!![anInt1173 + 1]
                    anIntArray1149!![anInt1173++] = i_392_ * i_393_
                    return
                }
                if (i == 4003) {
                    anInt1173 -= 2
                    val i_394_ = anIntArray1149!![anInt1173]
                    val i_395_ = anIntArray1149!![anInt1173 + 1]
                    anIntArray1149!![anInt1173++] = i_394_ / i_395_
                    return
                }
                if (i == 4004) {
                    val i_396_ = anIntArray1149!![--anInt1173]
                    anIntArray1149!![anInt1173++] = (Math.random() * i_396_.toDouble()).toInt()
                    return
                }
                if (i == 4005) {
                    val i_397_ = anIntArray1149!![--anInt1173]
                    anIntArray1149!![anInt1173++] = (Math.random() * (i_397_ + 1).toDouble()).toInt()
                    return
                }
                if (i == 4006) {
                    anInt1173 -= 5
                    val i_398_ = anIntArray1149!![anInt1173]
                    val i_399_ = anIntArray1149!![anInt1173 + 1]
                    val i_400_ = anIntArray1149!![anInt1173 + 2]
                    val i_401_ = anIntArray1149!![anInt1173 + 3]
                    val i_402_ = anIntArray1149!![anInt1173 + 4]
                    anIntArray1149!![anInt1173++] = i_398_ + ((i_399_ - i_398_) * (i_402_ - i_400_) / (i_401_ - i_400_))
                    return
                }
                if (i == 4007) {
                    anInt1173 -= 2
                    val l = anIntArray1149!![anInt1173].toLong()
                    val l_403_ = anIntArray1149!![anInt1173 + 1].toLong()
                    anIntArray1149!![anInt1173++] = (l + l * l_403_ / 100L).toInt()
                    return
                }
                if (i == 4008) {
                    anInt1173 -= 2
                    val i_404_ = anIntArray1149!![anInt1173]
                    val i_405_ = anIntArray1149!![anInt1173 + 1]
                    anIntArray1149!![anInt1173++] = i_404_ or (1 shl i_405_)
                    return
                }
                if (i == 4009) {
                    anInt1173 -= 2
                    val i_406_ = anIntArray1149!![anInt1173]
                    val i_407_ = anIntArray1149!![anInt1173 + 1]
                    anIntArray1149!![anInt1173++] = i_406_ and -1 - (1 shl i_407_)
                    return
                }
                if (i == 4010) {
                    anInt1173 -= 2
                    val i_408_ = anIntArray1149!![anInt1173]
                    val i_409_ = anIntArray1149!![anInt1173 + 1]
                    anIntArray1149!![anInt1173++] = if ((i_408_ and (1 shl i_409_)) != 0) 1 else 0
                    return
                }
                if (i == 4011) {
                    anInt1173 -= 2
                    val i_410_ = anIntArray1149!![anInt1173]
                    val i_411_ = anIntArray1149!![anInt1173 + 1]
                    anIntArray1149!![anInt1173++] = i_410_ % i_411_
                    return
                }
                if (i == 4012) {
                    anInt1173 -= 2
                    val i_412_ = anIntArray1149!![anInt1173]
                    val i_413_ = anIntArray1149!![anInt1173 + 1]
                    if (i_412_ == 0) anIntArray1149!![anInt1173++] = 0
                    else {
                        anIntArray1149!![anInt1173++] = i_412_.toDouble().pow(i_413_.toDouble()).toInt()
                        return
                    }
                    return
                }
                if (i == 4013) {
                    anInt1173 -= 2
                    val i_414_ = anIntArray1149!![anInt1173]
                    val i_415_ = anIntArray1149!![anInt1173 + 1]
                    if (i_414_ == 0) anIntArray1149!![anInt1173++] = 0
                    else {
                        if (i_415_ == 0) anIntArray1149!![anInt1173++] = 2147483647
                        else {
                            anIntArray1149!![anInt1173++] = i_414_.toDouble().pow(1.0 / i_415_.toDouble()).toInt()
                            return
                        }
                        return
                    }
                    return
                }
                if (i == 4014) {
                    anInt1173 -= 2
                    val i_416_ = anIntArray1149!![anInt1173]
                    val i_417_ = anIntArray1149!![anInt1173 + 1]
                    anIntArray1149!![anInt1173++] = i_416_ and i_417_
                    return
                }
                if (i == 4015) {
                    anInt1173 -= 2
                    val i_418_ = anIntArray1149!![anInt1173]
                    val i_419_ = anIntArray1149!![anInt1173 + 1]
                    anIntArray1149!![anInt1173++] = i_418_ or i_419_
                    return
                }
                if (i == 4016) {
                    anInt1173 -= 2
                    val i_420_ = anIntArray1149!![anInt1173]
                    val i_421_ = anIntArray1149!![anInt1173 + 1]
                    anIntArray1149!![anInt1173++] = min(i_420_, i_421_)
                    return
                }
                if (i == 4017) {
                    anInt1173 -= 2
                    val i_422_ = anIntArray1149!![anInt1173]
                    val i_423_ = anIntArray1149!![anInt1173 + 1]
                    anIntArray1149!![anInt1173++] = max(i_422_, i_423_)
                    return
                }
                if (i == 4018) {
                    anInt1173 -= 3
                    val l = anIntArray1149!![anInt1173].toLong()
                    val l_424_ = anIntArray1149!![anInt1173 + 1].toLong()
                    val l_425_ = anIntArray1149!![anInt1173 + 2].toLong()
                    anIntArray1149!![anInt1173++] = (l * l_425_ / l_424_).toInt()
                    return
                }
                if (i == 4019) {
                    anInt1173 -= 2
                    val i_426_ = anIntArray1149!![anInt1173]
                    val i_427_ = anIntArray1149!![anInt1173 + 1]
                    if (i_426_ > 700 || i_427_ > 700) anIntArray1149!![anInt1173++] = 256
                    val d = ((Math.random() * (i_427_ + i_426_).toDouble() - i_426_.toDouble() + 800.0) / 100.0)
                    anIntArray1149!![anInt1173++] = (2.0.pow(d) + 0.5).toInt()
                    return
                }
            } else if (i < 4200) {
                if (i == 4100) {
                    val string = aStringArray1152!![--anInt1170]
                    val i_428_ = anIntArray1149!![--anInt1173]
                    aStringArray1152!![anInt1170++] = string + i_428_
                    return
                }
                if (i == 4101) {
                    anInt1170 -= 2
                    val string = aStringArray1152!![anInt1170]
                    val string_429_ = aStringArray1152!![anInt1170 + 1]
                    aStringArray1152!![anInt1170++] = string + string_429_
                    return
                }
                if (i == 4102) {
                    val string = aStringArray1152!![--anInt1170]
                    val i_430_ = anIntArray1149!![--anInt1173]
                    aStringArray1152!![anInt1170++] = string + ScreenBorderFiller.method1171(i_430_, 76, true)
                    return
                }
                if (i == 4103) {
                    val string = aStringArray1152!![--anInt1170]!!
                    aStringArray1152!![anInt1170++] = string.lowercase(Locale.getDefault())
                    return
                }
                if (i == 4104) {
                    aStringArray1152!![anInt1170++] = method709(anIntArray1149!![--anInt1173])
                    return
                }
                if (i == 4105) {
                    anInt1170 -= 2
                    val string = aStringArray1152!![anInt1170]
                    val string_431_ = aStringArray1152!![anInt1170 + 1]
                    if ((LocalPlayerState.aPlayer_1907!!.aCompositeNpcModelBuilder_10536) != null && LocalPlayerState.aPlayer_1907!!.aCompositeNpcModelBuilder_10536!!.aBoolean2100) aStringArray1152!![anInt1170++] = string_431_
                    else {
                        aStringArray1152!![anInt1170++] = string
                        return
                    }
                    return
                }
                if (i == 4106) {
                    val i_432_ = anIntArray1149!![--anInt1173]
                    aStringArray1152!![anInt1170++] = i_432_.toString()
                    return
                }
                if (i == 4107) {
                    anInt1170 -= 2
                    anIntArray1149!![anInt1173++] = method1811(9152, (aStringArray1152!![anInt1170 + 1]), AnimationFrameDefinition.anInt6967, (aStringArray1152!![anInt1170]))
                    return
                }
                if (i == 4108) {
                    val string = aStringArray1152!![--anInt1170]
                    anInt1173 -= 2
                    val i_433_ = anIntArray1149!![anInt1173]
                    val i_434_ = anIntArray1149!![anInt1173 + 1]
                    val class143 = method1819(i_434_, 0, -123, SoftwareSpriteRaster.aJs5Archive_1627!!)
                    anIntArray1149!![anInt1173++] = class143!!.method1190(CameraNodeList.aAbstractModelRendererArray1744, 1, string, i_433_)
                    return
                }
                if (i == 4109) {
                    val string = aStringArray1152!![--anInt1170]
                    anInt1173 -= 2
                    val i_435_ = anIntArray1149!![anInt1173]
                    val i_436_ = anIntArray1149!![anInt1173 + 1]
                    val class143 = method1819(i_436_, 0, -79, SoftwareSpriteRaster.aJs5Archive_1627!!)
                    anIntArray1149!![anInt1173++] = class143!!.method1187(string, false, i_435_, CameraNodeList.aAbstractModelRendererArray1744)
                    return
                }
                if (i == 4110) {
                    anInt1170 -= 2
                    val string = aStringArray1152!![anInt1170]
                    val string_437_ = aStringArray1152!![anInt1170 + 1]
                    if (anIntArray1149!![--anInt1173] == 1) aStringArray1152!![anInt1170++] = string
                    else {
                        aStringArray1152!![anInt1170++] = string_437_
                        return
                    }
                    return
                }
                if (i == 4111) {
                    val string = aStringArray1152!![--anInt1170]!!
                    aStringArray1152!![anInt1170++] = method572(string, 23034)
                    return
                }
                if (i == 4112) {
                    val string = aStringArray1152!![--anInt1170]
                    val i_438_ = anIntArray1149!![--anInt1173]
                    if (i_438_ == -1) throw RuntimeException("null char")
                    aStringArray1152!![anInt1170++] = string + i_438_.toChar()
                    return
                }
                if (i == 4113) {
                    val i_439_ = anIntArray1149!![--anInt1173]
                    anIntArray1149!![anInt1173++] = method708(i_439_.toChar())
                    return
                }
                if (i == 4114) {
                    val i_440_ = anIntArray1149!![--anInt1173]
                    anIntArray1149!![anInt1173++] = if (Npc.method2446(i_440_.toChar(), 105.toByte())) 1 else 0
                    return
                }
                if (i == 4115) {
                    val i_441_ = anIntArray1149!![--anInt1173]
                    anIntArray1149!![anInt1173++] = if (GameDisplayManager.method1581(-93, i_441_.toChar())) 1 else 0
                    return
                }
                if (i == 4116) {
                    val i_442_ = anIntArray1149!![--anInt1173]
                    anIntArray1149!![anInt1173++] = if (CameraOrModelTransform.method2647(true, i_442_.toChar())) 1 else 0
                    return
                }
                if (i == 4117) {
                    val string = aStringArray1152!![--anInt1170]
                    if (string == null) {
                        anIntArray1149!![anInt1173++] = 0
                        return
                    } else anIntArray1149!![anInt1173++] = string.length
                    return
                }
                if (i == 4118) {
                    val string = aStringArray1152!![--anInt1170]!!
                    anInt1173 -= 2
                    val i_443_ = anIntArray1149!![anInt1173]
                    val i_444_ = anIntArray1149!![anInt1173 + 1]
                    aStringArray1152!![anInt1170++] = string.substring(i_443_, i_444_)
                    return
                }
                if (i == 4119) {
                    val string = aStringArray1152!![--anInt1170]!!
                    val stringbuffer = StringBuffer(string.length)
                    var bool_445_ = false
                    for (i_446_ in 0..<string.length) {
                        val c = string.get(i_446_)
                        if (c == '<') bool_445_ = true
                        else if (c == '>') bool_445_ = false
                        else if (!bool_445_) stringbuffer.append(c)
                    }
                    aStringArray1152!![anInt1170++] = stringbuffer.toString()
                    return
                }
                if (i == 4120) {
                    val string = aStringArray1152!![--anInt1170]!!
                    anInt1173 -= 2
                    val i_447_ = anIntArray1149!![anInt1173]
                    val i_448_ = anIntArray1149!![anInt1173 + 1]
                    anIntArray1149!![anInt1173++] = string.indexOf(i_447_.toChar(), i_448_)
                    return
                }
                if (i == 4121) {
                    anInt1170 -= 2
                    val string = aStringArray1152!![anInt1170]!!
                    val string_449_ = aStringArray1152!![anInt1170 + 1]!!
                    val i_450_ = anIntArray1149!![--anInt1173]
                    anIntArray1149!![anInt1173++] = string.indexOf(string_449_, i_450_)
                    return
                }
                if (i == 4122) {
                    val i_451_ = anIntArray1149!![--anInt1173]
                    anIntArray1149!![anInt1173++] = i_451_.toChar().lowercaseChar().code
                    return
                }
                if (i == 4123) {
                    val i_452_ = anIntArray1149!![--anInt1173]
                    anIntArray1149!![anInt1173++] = i_452_.toChar().uppercaseChar().code
                    return
                }
                if (i == 4124) {
                    val bool_453_ = anIntArray1149!![--anInt1173] != 0
                    val i_454_ = anIntArray1149!![--anInt1173]
                    aStringArray1152!![anInt1170++] = SceneCollisionEntry.method3486(0, bool_453_, AnimationFrameDefinition.anInt6967, i_454_.toLong(), 16980)
                    return
                }
                if (i == 4125) {
                    val string = aStringArray1152!![--anInt1170]
                    val i_455_ = anIntArray1149!![--anInt1173]
                    val class143 = method1819(i_455_, 0, -114, SoftwareSpriteRaster.aJs5Archive_1627!!)
                    anIntArray1149!![anInt1173++] = class143!!.method1186(string, CameraNodeList.aAbstractModelRendererArray1744, false)
                    return
                }
            } else if (i < 4300) {
                if (i == 4200) {
                    val i_456_ = anIntArray1149!![--anInt1173]
                    aStringArray1152!![anInt1170++] = (Exception_Sub1.aModelHeaderCache_112!!.method1940(-52, i_456_).aString2795) + Loader.getDebug(i_456_)
                    return
                }
                if (i == 4201) {
                    anInt1173 -= 2
                    val i_457_ = anIntArray1149!![anInt1173]
                    val i_458_ = anIntArray1149!![anInt1173 + 1]
                    val class213 = Exception_Sub1.aModelHeaderCache_112!!.method1940(-79, i_457_)
                    if (i_458_ >= 1 && i_458_ <= 5 && (class213.aStringArray2811[i_458_ - 1] != null)) aStringArray1152!![anInt1170++] = (class213.aStringArray2811[i_458_ - 1])
                    else {
                        aStringArray1152!![anInt1170++] = ""
                        return
                    }
                    return
                }
                if (i == 4202) {
                    anInt1173 -= 2
                    val i_459_ = anIntArray1149!![anInt1173]
                    val i_460_ = anIntArray1149!![anInt1173 + 1]
                    val class213 = Exception_Sub1.aModelHeaderCache_112!!.method1940(112, i_459_)
                    if (i_460_ >= 1 && i_460_ <= 5 && (class213.aStringArray2763!![i_460_ - 1] != null)) aStringArray1152!![anInt1170++] = (class213.aStringArray2763!![i_460_ - 1])
                    else {
                        aStringArray1152!![anInt1170++] = ""
                        return
                    }
                    return
                }
                if (i == 4203) {
                    val i_461_ = anIntArray1149!![--anInt1173]
                    anIntArray1149!![anInt1173++] = Exception_Sub1.aModelHeaderCache_112!!.method1940(-52, i_461_).anInt2819
                    return
                }
                if (i == 4204) {
                    val i_462_ = anIntArray1149!![--anInt1173]
                    anIntArray1149!![anInt1173++] = if (Exception_Sub1.aModelHeaderCache_112!!.method1940(82, i_462_).anInt2820 == 1) 1 else 0
                    return
                }
                if (i == 4205) {
                    val i_463_ = anIntArray1149!![--anInt1173]
                    val class213 = Exception_Sub1.aModelHeaderCache_112!!.method1940(80, i_463_)
                    if (class213.anInt2833 == -1 && class213.anInt2758 >= 0) anIntArray1149!![anInt1173++] = class213.anInt2758
                    else {
                        anIntArray1149!![anInt1173++] = i_463_
                        return
                    }
                    return
                }
                if (i == 4206) {
                    val i_464_ = anIntArray1149!![--anInt1173]
                    val class213 = Exception_Sub1.aModelHeaderCache_112!!.method1940(-56, i_464_)
                    if (class213.anInt2833 >= 0 && class213.anInt2758 >= 0) anIntArray1149!![anInt1173++] = class213.anInt2758
                    else {
                        anIntArray1149!![anInt1173++] = i_464_
                        return
                    }
                    return
                }
                if (i == 4207) {
                    val i_465_ = anIntArray1149!![--anInt1173]
                    anIntArray1149!![anInt1173++] = if (Exception_Sub1.aModelHeaderCache_112!!.method1940(87, i_465_).aBoolean2783) 1 else 0
                    return
                }
                if (i == 4208) {
                    anInt1173 -= 2
                    val i_466_ = anIntArray1149!![anInt1173]
                    val i_467_ = anIntArray1149!![anInt1173 + 1]
                    val class254 = ProjectionCameraTransform.aEmoteDefCache_5764!!.method2600(i_467_, 28364)
                    if (class254.method1925(false)) aStringArray1152!![anInt1170++] = (Exception_Sub1.aModelHeaderCache_112!!.method1940(-96, i_466_).method1561(class254.aString3258, i_467_, -1511086397))
                    else {
                        anIntArray1149!![anInt1173++] = (Exception_Sub1.aModelHeaderCache_112!!.method1940(-82, i_466_).method1567(class254.anInt3256, -106, i_467_))
                        return
                    }
                    return
                }
                if (i == 4209) {
                    anInt1173 -= 2
                    val i_468_ = anIntArray1149!![anInt1173]
                    val i_469_ = anIntArray1149!![anInt1173 + 1] - 1
                    val class213 = Exception_Sub1.aModelHeaderCache_112!!.method1940(108, i_468_)
                    if (class213.anInt2766 == i_469_) anIntArray1149!![anInt1173++] = class213.anInt2818
                    else {
                        if (class213.anInt2774 == i_469_) anIntArray1149!![anInt1173++] = class213.anInt2817
                        else {
                            anIntArray1149!![anInt1173++] = -1
                            return
                        }
                        return
                    }
                    return
                }
                if (i == 4210) {
                    val string = aStringArray1152!![--anInt1170]
                    val i_470_ = anIntArray1149!![--anInt1173]
                    ParticleAmountCache.method1586(i_470_ == 1, (-108).toByte(), string)
                    anIntArray1149!![anInt1173++] = Class76.anInt1285
                    return
                }
                if (i == 4211) {
                    if (AsyncTaskHandle.aShortArray2579 == null || WidgetNodeLink.anInt2037 >= Class76.anInt1285) anIntArray1149!![anInt1173++] = -1
                    else {
                        anIntArray1149!![anInt1173++] = (AsyncTaskHandle.aShortArray2579!![WidgetNodeLink.anInt2037++].toInt() and 0xffff)
                        return
                    }
                    return
                }
                if (i == 4212) {
                    WidgetNodeLink.anInt2037 = 0
                    return
                }
                if (i == 4213) {
                    val i_471_ = anIntArray1149!![--anInt1173]
                    anIntArray1149!![anInt1173++] = Exception_Sub1.aModelHeaderCache_112!!.method1940(-115, i_471_).anInt2802
                    return
                }
                if (i == 4214) {
                    val string = aStringArray1152!![--anInt1170]
                    anInt1173 -= 3
                    val i_472_ = anIntArray1149!![anInt1173]
                    val i_473_ = anIntArray1149!![anInt1173 + 1]
                    val i_474_ = anIntArray1149!![anInt1173 + 2]
                    method259(i_474_, -125, i_472_ == 1, string, i_473_)
                    anIntArray1149!![anInt1173++] = Class76.anInt1285
                    return
                }
                if (i == 4215) {
                    anInt1170 -= 2
                    anInt1173 -= 2
                    val string = aStringArray1152!![anInt1170]
                    val i_475_ = anIntArray1149!![anInt1173]
                    val i_476_ = anIntArray1149!![anInt1173 + 1]
                    val string_477_ = aStringArray1152!![anInt1170 + 1]
                    method1719(i_475_ == 1, string, string_477_, i_476_, -1)
                    anIntArray1149!![anInt1173++] = Class76.anInt1285
                    return
                }
            } else if (i < 4400) {
                if (i == 4300) {
                    anInt1173 -= 2
                    val i_478_ = anIntArray1149!![anInt1173]
                    val i_479_ = anIntArray1149!![anInt1173 + 1]
                    val class254 = ProjectionCameraTransform.aEmoteDefCache_5764!!.method2600(i_479_, 28364)
                    if (class254.method1925(false)) aStringArray1152!![anInt1170++] = (MapAreaDefinition.aBufferedMessageQueue_2529!!.method2079(i_478_, -1).method801(17.toByte(), i_479_, class254.aString3258))
                    else {
                        anIntArray1149!![anInt1173++] = (MapAreaDefinition.aBufferedMessageQueue_2529!!.method2079(i_478_, -1).method805(class254.anInt3256, i_479_, 48))
                        return
                    }
                    return
                }
            } else if (i < 4500) {
                if (i == 4400) {
                    anInt1173 -= 2
                    val i_480_ = anIntArray1149!![anInt1173]
                    val i_481_ = anIntArray1149!![anInt1173 + 1]
                    val class254 = ProjectionCameraTransform.aEmoteDefCache_5764!!.method2600(i_481_, 28364)
                    if (class254.method1925(false)) aStringArray1152!![anInt1170++] = (GradientLookupEffect.aSeqDefinitionCache_9195!!.method2005(0, i_480_).method475(class254.aString3258, i_481_, -16)!!)
                    else {
                        anIntArray1149!![anInt1173++] = (GradientLookupEffect.aSeqDefinitionCache_9195!!.method2005(0, i_480_).method487(i_481_, class254.anInt3256, 81))
                        return
                    }
                    return
                }
            } else if (i < 4600) {
                if (i == 4500) {
                    anInt1173 -= 2
                    val i_482_ = anIntArray1149!![anInt1173]
                    val i_483_ = anIntArray1149!![anInt1173 + 1]
                    val class254 = ProjectionCameraTransform.aEmoteDefCache_5764!!.method2600(i_483_, 28364)
                    if (class254.method1925(false)) aStringArray1152!![anInt1170++] = (SpriteLoadValidator.aClass65_4787!!.method700(i_482_, -121).method3170(-250, class254.aString3258, i_483_))
                    else {
                        anIntArray1149!![anInt1173++] = (SpriteLoadValidator.aClass65_4787!!.method700(i_482_, 81).method3166(i_483_, class254.anInt3256, 124.toByte()))
                        return
                    }
                    return
                }
            } else if (i < 4700 && i == 4600) {
                val i_484_ = anIntArray1149!![--anInt1173]
                val class225 = Class64_Sub3.aNpcDefinitionCache_5558!!.method1983(i_484_, 32)
                if (class225.anIntArray2915 != null && class225.anIntArray2915!!.size > 0) {
                    var i_485_ = 0
                    var i_486_ = class225.anIntArray2929!![0]
                    for (i_487_ in 1..<class225.anIntArray2915!!.size) {
                        if (class225.anIntArray2929!![i_487_] > i_486_) {
                            i_485_ = i_487_
                            i_486_ = class225.anIntArray2929!![i_487_]
                        }
                    }
                    anIntArray1149!![anInt1173++] = class225.anIntArray2915!![i_485_]
                } else {
                    anIntArray1149!![anInt1173++] = class225.anInt2918
                    return
                }
                return
            }
        }
        throw IllegalStateException(i.toString())
    }

    private fun method711(class348_sub42_sub19: MinimapAreaMarkerNode, i: Int) {
        var class348_sub42_sub19 = class348_sub42_sub19
        anInt1173 = 0
        anInt1170 = 0
        var i_488_ = -1
        var `is` = class348_sub42_sub19.anIntArray9696!!
        var is_489_ = class348_sub42_sub19.anIntArray9694!!
        var i_490_ = -1
        anInt1154 = 0
        try {
            var i_491_ = 0
            while (true) {
                if (++i_491_ > i) throw RuntimeException("slow")
                i_490_ = `is`[++i_488_]
                if (i_490_ < 100) {
                    if (i_490_ == 0) anIntArray1149!![anInt1173++] = is_489_[i_488_]
                    else if (i_490_ == 1) {
                        val i_492_ = is_489_[i_488_]
                        anIntArray1149!![anInt1173++] = (ProjectedGroundDecor.aVarpStore_10209!!.anIntArray5063[i_492_])
                    } else if (i_490_ == 2) {
                        val i_493_ = is_489_[i_488_]
                        ProjectedGroundDecor.aVarpStore_10209!!.method1306((-78).toByte(), anIntArray1149!![--anInt1173], i_493_)
                    } else if (i_490_ == 3) aStringArray1152!![anInt1170++] = (class348_sub42_sub19.aStringArray9692!![i_488_])
                    else if (i_490_ == 6) i_488_ += is_489_[i_488_]
                    else if (i_490_ == 7) {
                        anInt1173 -= 2
                        if (anIntArray1149!![anInt1173] != anIntArray1149!![anInt1173 + 1]) i_488_ += is_489_[i_488_]
                    } else if (i_490_ == 8) {
                        anInt1173 -= 2
                        if (anIntArray1149!![anInt1173] == anIntArray1149!![anInt1173 + 1]) i_488_ += is_489_[i_488_]
                    } else if (i_490_ == 9) {
                        anInt1173 -= 2
                        if (anIntArray1149!![anInt1173] < anIntArray1149!![anInt1173 + 1]) i_488_ += is_489_[i_488_]
                    } else if (i_490_ == 10) {
                        anInt1173 -= 2
                        if (anIntArray1149!![anInt1173] > anIntArray1149!![anInt1173 + 1]) i_488_ += is_489_[i_488_]
                    } else if (i_490_ == 21) {
                        if (anInt1154 == 0) return
                        val class184 = aScanlineRasterFillerArray1168!![--anInt1154]!!
                        class348_sub42_sub19 = class184.aClass348_Sub42_Sub19_2474!!
                        `is` = (class348_sub42_sub19.anIntArray9696!!)
                        is_489_ = (class348_sub42_sub19.anIntArray9694!!)
                        i_488_ = class184.anInt2477
                        anIntArray1164 = class184.anIntArray2468
                        aStringArray1155 = class184.aStringArray2473
                    } else if (i_490_ == 25) {
                        val i_494_ = is_489_[i_488_]
                        anIntArray1149!![anInt1173++] = ProjectedGroundDecor.aVarpStore_10209!!.method62(i_494_, -65536)
                    } else if (i_490_ == 27) {
                        val i_495_ = is_489_[i_488_]
                        ProjectedGroundDecor.aVarpStore_10209!!.method1307(i_495_, -1, anIntArray1149!![--anInt1173])
                    } else if (i_490_ == 31) {
                        anInt1173 -= 2
                        if (anIntArray1149!![anInt1173] <= anIntArray1149!![anInt1173 + 1]) i_488_ += is_489_[i_488_]
                    } else if (i_490_ == 32) {
                        anInt1173 -= 2
                        if (anIntArray1149!![anInt1173] >= anIntArray1149!![anInt1173 + 1]) i_488_ += is_489_[i_488_]
                    } else if (i_490_ == 33) anIntArray1149!![anInt1173++] = anIntArray1164!![is_489_[i_488_]]
                    else if (i_490_ == 34) anIntArray1164!![is_489_[i_488_]] = anIntArray1149!![--anInt1173]
                    else if (i_490_ == 35) aStringArray1152!![anInt1170++] = aStringArray1155!![is_489_[i_488_]]!!
                    else if (i_490_ == 36) aStringArray1155!![is_489_[i_488_]] = aStringArray1152!![--anInt1170]
                    else if (i_490_ == 37) {
                        val i_496_ = is_489_[i_488_]
                        anInt1170 -= i_496_
                        val string = ClientLoadStateMachine.method1279(true, i_496_, aStringArray1152, anInt1170)
                        aStringArray1152!![anInt1170++] = string
                    } else if (i_490_ == 38) anInt1173--
                    else if (i_490_ == 39) anInt1170--
                    else if (i_490_ == 40) {
                        val i_497_ = is_489_[i_488_]
                        val class348_sub42_sub19_498_ = ShaderObject.method2609(-114, i_497_)
                        if (class348_sub42_sub19_498_ == null) throw RuntimeException()
                        val is_499_ = IntArray(class348_sub42_sub19_498_.anInt9688)
                        val strings = (arrayOfNulls<String>(class348_sub42_sub19_498_.anInt9689))
                        for (i_500_ in 0..<class348_sub42_sub19_498_.anInt9697) is_499_[i_500_] = (anIntArray1149!![anInt1173 - (class348_sub42_sub19_498_.anInt9697) + i_500_])
                        for (i_501_ in 0..<class348_sub42_sub19_498_.anInt9695) strings[i_501_] = (aStringArray1152!![anInt1170 - (class348_sub42_sub19_498_.anInt9695) + i_501_])
                        anInt1173 -= class348_sub42_sub19_498_.anInt9697
                        anInt1170 -= class348_sub42_sub19_498_.anInt9695
                        val scanlineRasterFiller = ScanlineRasterFiller()
                        scanlineRasterFiller.aClass348_Sub42_Sub19_2474 = class348_sub42_sub19
                        scanlineRasterFiller.anInt2477 = i_488_
                        scanlineRasterFiller.anIntArray2468 = anIntArray1164
                        scanlineRasterFiller.aStringArray2473 = aStringArray1155
                        if (anInt1154 >= aScanlineRasterFillerArray1168!!.size) throw RuntimeException()
                        aScanlineRasterFillerArray1168!![anInt1154++] = scanlineRasterFiller
                        class348_sub42_sub19 = class348_sub42_sub19_498_
                        `is` = (class348_sub42_sub19.anIntArray9696!!)
                        is_489_ = (class348_sub42_sub19.anIntArray9694!!)
                        i_488_ = -1
                        anIntArray1164 = is_499_
                        aStringArray1155 = strings
                    } else if (i_490_ == 42) anIntArray1149!![anInt1173++] = Class77.anIntArray1303!![is_489_[i_488_]]
                    else if (i_490_ == 43) {
                        val i_502_ = is_489_[i_488_]
                        Class77.anIntArray1303!![i_502_] = anIntArray1149!![--anInt1173]
                        TerrainTileGeometry.method1647(-128, i_502_)
                        ScanlineRasterFiller.aBoolean2469 = ScanlineRasterFiller.aBoolean2469 or GlslEnvMaterialPass.aBooleanArray6270!![i_502_]
                    } else if (i_490_ == 44) {
                        val i_503_ = is_489_[i_488_] shr 16
                        val i_504_ = is_489_[i_488_] and 0xffff
                        val i_505_ = anIntArray1149!![--anInt1173]
                        if (i_505_ < 0 || i_505_ > 5000) throw RuntimeException()
                        anIntArray1172!![i_503_] = i_505_
                        var i_506_ = -1
                        if (i_504_ == 105) i_506_ = 0
                        for (i_507_ in 0..<i_505_) anIntArrayArray1161!![i_503_]!![i_507_] = i_506_
                    } else if (i_490_ == 45) {
                        val i_508_ = is_489_[i_488_]
                        val i_509_ = anIntArray1149!![--anInt1173]
                        if (i_509_ < 0 || i_509_ >= anIntArray1172!![i_508_]) throw RuntimeException()
                        anIntArray1149!![anInt1173++] = anIntArrayArray1161!![i_508_]!![i_509_]
                    } else if (i_490_ == 46) {
                        val i_510_ = is_489_[i_488_]
                        anInt1173 -= 2
                        val i_511_ = anIntArray1149!![anInt1173]
                        if (i_511_ < 0 || i_511_ >= anIntArray1172!![i_510_]) throw RuntimeException()
                        anIntArrayArray1161!![i_510_]!![i_511_] = anIntArray1149!![anInt1173 + 1]
                    } else if (i_490_ == 47) {
                        var string = GlTextureCubeMap.aStringArray8532!![is_489_[i_488_]]
                        if (string == null) string = "null"
                        aStringArray1152!![anInt1170++] = string
                    } else if (i_490_ == 48) {
                        val i_512_ = is_489_[i_488_]
                        GlTextureCubeMap.aStringArray8532!![i_512_] = aStringArray1152!![--anInt1170]
                        method529(i_512_, true)
                    } else if (i_490_ == 51) {
                        val class356 = (class348_sub42_sub19.aHashtableArray9693!![is_489_[i_488_]]!!)
                        val class348_sub35 = (class356.method3480(anIntArray1149!![--anInt1173].toLong(), -6008) as IntKeyNode?)
                        if (class348_sub35 != null) i_488_ += class348_sub35.anInt6976
                    } else if (i_490_ == 86) {
                        if (anIntArray1149!![--anInt1173] == 1) {
                            i_488_ += is_489_[i_488_]
                        }
                    }
                } else {
                    val bool: Boolean
                    bool = is_489_[i_488_] == 1
                    if (i_490_ >= 100 && i_490_ < 5000) method710(i_490_, bool)
                    else {
                        if (i_490_ < 5000 || i_490_ >= 10000) break
                        method704(i_490_, bool)
                    }
                }
            }
            throw IllegalStateException("Command: " + i_490_)
        } catch (exception: Exception) {
            if (class348_sub42_sub19.aString9690 == null) {
                val stringbuffer = StringBuffer(30)
                stringbuffer.append("CS2: ").append(class348_sub42_sub19.aLong4291).append(" ")
                var i_514_ = anInt1154 - 1
                while (i_514_ >= 0) {
                    stringbuffer.append("v: ").append(aScanlineRasterFillerArray1168!![i_514_]!!.aClass348_Sub42_Sub19_2474!!.aLong4291).append(" ")
                    i_514_--
                }
                stringbuffer.append("op: ").append(i_490_)
                LinkedListIterator.method1242(stringbuffer.toString(), exception, 15004)
            } else {
                method544(("Clientscript error in: " + class348_sub42_sub19.aString9690), false, 4)
                val stringbuffer = StringBuffer(30)
                stringbuffer.append("Clientscript error in: ").append(class348_sub42_sub19.aString9690).append("\n")
                var i_513_ = anInt1154 - 1
                while (i_513_ >= 0) {
                    stringbuffer.append("via: ").append(aScanlineRasterFillerArray1168!![i_513_]!!.aClass348_Sub42_Sub19_2474!!.aString9690).append("\n")
                    i_513_--
                }
                stringbuffer.append("Op: ").append(i_490_).append("\n")
                val string = exception.message
                if (string != null && string.length > 0) stringbuffer.append("Message: ").append(string).append("\n")
                LinkedListIterator.method1242(stringbuffer.toString(), exception, 15004)
                method94(stringbuffer.toString(), 90)
            }
        }
    }

    private fun method712(class348_sub36: WidgetActionEntry, i: Int) {
        val objects = class348_sub36.anObjectArray6987!!
        val i_515_ = (objects[0] as Int)
        val class348_sub42_sub19 = ShaderObject.method2609(-122, i_515_)
        if (class348_sub42_sub19 != null) {
            anIntArray1164 = (IntArray(class348_sub42_sub19.anInt9688))
            var i_516_ = 0
            aStringArray1155 = (arrayOfNulls<String>(class348_sub42_sub19.anInt9689))
            var i_517_ = 0
            for (i_518_ in 1..<objects.size) {
                if (objects[i_518_] is Int) {
                    var i_519_ = (objects[i_518_] as Int)
                    if (i_519_ == -2147483647) i_519_ = class348_sub36.anInt6984
                    if (i_519_ == -2147483646) i_519_ = class348_sub36.anInt6995
                    if (i_519_ == -2147483645) i_519_ = (if (class348_sub36.aWidgetComponent_6989 != null) class348_sub36.aWidgetComponent_6989!!.anInt830 else -1)
                    if (i_519_ == -2147483644) i_519_ = class348_sub36.anInt6986
                    if (i_519_ == -2147483643) i_519_ = (if (class348_sub36.aWidgetComponent_6989 != null) class348_sub36.aWidgetComponent_6989!!.anInt704 else -1)
                    if (i_519_ == -2147483642) i_519_ = (if (class348_sub36.aWidgetComponent_6983 != null) class348_sub36.aWidgetComponent_6983!!.anInt830 else -1)
                    if (i_519_ == -2147483641) i_519_ = (if (class348_sub36.aWidgetComponent_6983 != null) class348_sub36.aWidgetComponent_6983!!.anInt704 else -1)
                    if (i_519_ == -2147483640) i_519_ = class348_sub36.anInt6991
                    if (i_519_ == -2147483639) i_519_ = class348_sub36.anInt6982
                    anIntArray1164!![i_516_++] = i_519_
                } else if (objects[i_518_] is String) {
                    var string = objects[i_518_] as String
                    if (string == "event_opbase") string = class348_sub36.aString6994!!
                    aStringArray1155!![i_517_++] = string
                }
            }
            anInt1177 = class348_sub36.anInt6988
            method711(class348_sub42_sub19, i)
        }
    }

    @JvmStatic
    fun method713() {
        anIntArray1164 = null
        aStringArray1155 = null
        anIntArray1172 = null
        anIntArrayArray1161 = null
        anIntArray1149 = null
        aStringArray1152 = null
        aScanlineRasterFillerArray1168 = null
        aWidgetComponent_1150 = null
        aWidgetComponent_1169 = null
        aMinimapTileEntry_1151 = null
        aCalendar1160 = null
        aStringArray1176 = null
        anIntArray1175 = null
        aClass60_1174 = null
    }

    private fun method714(i: Int) {
        val class46 = method2570(1512932720, i)
        if (class46 != null) {
            val i_520_ = i ushr 16
            var class46s = WorldMapTextLabel.aWidgetComponentArrayArray8584!![i_520_]
            if (class46s == null) {
                val widgetComponentS_521_: Array<WidgetComponent?> = WarpTextureNode.aWidgetComponentArrayArray9427!![i_520_]!!
                val i_522_ = widgetComponentS_521_.size
                WorldMapTextLabel.aWidgetComponentArrayArray8584!![i_520_] = arrayOfNulls<WidgetComponent>(i_522_)
                class46s = WorldMapTextLabel.aWidgetComponentArrayArray8584!![i_520_]!!
                ArrayCopyUtil.method1575(widgetComponentS_521_, 0, class46s, 0, widgetComponentS_521_.size)
            }
            var i_523_: Int
            i_523_ = 0
            while (i_523_ < class46s!!.size) {
                if (class46s[i_523_] == class46) break
                i_523_++
            }
            if (i_523_ < class46s.size) {
                ArrayCopyUtil.method1575(class46s, i_523_ + 1, class46s, i_523_, class46s.size - i_523_ - 1)
                class46s[class46s.size - 1] = class46
            }
        }
    }

    @JvmStatic
    fun method715(i: Int, bool: Boolean) {
        /* empty */
    }

    init {
        aScanlineRasterFillerArray1168 = arrayOfNulls<ScanlineRasterFiller>(50)
        aCalendar1160 = Calendar.getInstance()
        anIntArray1175 = IntArray(3)
        aStringArray1176 = arrayOf<String>("Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec")
        aClass60_1174 = Class60(4)
        anInt1177 = 0
    }
}
