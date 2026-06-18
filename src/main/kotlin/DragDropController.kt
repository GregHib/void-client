import MatrixCameraTransform.Companion.method913
import SceneTilePlaneManager.method260
import ModelOrSpriteHolder.Companion.method173
import WallEntity.Companion.method2485
import SolidFillComponent.Companion.method191
import Class66.method705

/* Class347 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class DragDropController {
    var anInt4279: Int = 0
    var anInt4282: Int = 0
    var anInt4283: Int = 0

    companion object {
        @JvmField
        var aBoolean4278: Boolean = true
        var anInt4280: Int = 0
        var aByteArrayArray4281: Array<ByteArray?>? = null
        @JvmField
        var aBoolean4284: Boolean = false

        @JvmStatic
        fun method2707(bool: Boolean) {
            aByteArrayArray4281 = null
            if (bool != false) method2708(57)
        }

        @JvmStatic
        fun method2708(i: Int) {
            ConfigFlagUtil.method1916(-9343, RegionSceneLoader.aWidgetComponent_3701!!)
            anInt4280++
            SceneEntity.anInt6392++
            if (!MinimapSquareDrawer.aBoolean5221 || !ScrollingWidgetComponentNode.aBoolean8386) {
                if (SceneEntity.anInt6392 > 1) RegionSceneLoader.aWidgetComponent_3701 = null
            } else {
                var i_0_ = 0
                var i_1_ = 0
                if (Class59_Sub1.aBoolean5300) {
                    i_0_ = NativeTerrainTile.method4008((-124).toByte())
                    i_1_ = method260(false)
                }
                var i_2_ = i_0_ + GlTexture1D.aInputTracker_8552!!.method3597(true)
                var i_3_ = i_1_ + GlTexture1D.aInputTracker_8552!!.method3594(80.toByte())
                i_3_ -= ModelDefinitionCache.anInt2872
                i_2_ -= SceneEntityModel.anInt6411
                if (i_2_ < BoxBlurTextureNode.anInt9461) i_2_ = BoxBlurTextureNode.anInt9461
                if (i == -30206) {
                    if (i_2_ - -RegionSceneLoader.aWidgetComponent_3701!!.anInt709 > (BoxBlurTextureNode.anInt9461 - -CalendarUtil.aWidgetComponent_4130!!.anInt709)) i_2_ = (CalendarUtil.aWidgetComponent_4130!!.anInt709 + (BoxBlurTextureNode.anInt9461 + -RegionSceneLoader.aWidgetComponent_3701!!.anInt709))
                    if (i_3_ < Bzip2DecoderState.anInt558) i_3_ = Bzip2DecoderState.anInt558
                    if (RegionSceneLoader.aWidgetComponent_3701!!.anInt789 + i_3_ > (Bzip2DecoderState.anInt558 - -CalendarUtil.aWidgetComponent_4130!!.anInt789)) i_3_ = (-RegionSceneLoader.aWidgetComponent_3701!!.anInt789 + (Bzip2DecoderState.anInt558 - -CalendarUtil.aWidgetComponent_4130!!.anInt789))
                    val i_4_ = (-BoxBlurTextureNode.anInt9461 + (i_2_ - -CalendarUtil.aWidgetComponent_4130!!.anInt747))
                    val i_5_ = (-Bzip2DecoderState.anInt558 + (i_3_ + CalendarUtil.aWidgetComponent_4130!!.anInt755))
                    if (GlTexture1D.aInputTracker_8552!!.method3593(94)) {
                        if (RegionSceneLoader.aWidgetComponent_3701!!.anInt703 < SceneEntity.anInt6392) {
                            val i_6_ = i_2_ + -NativeRenderer.anInt8001
                            val i_7_ = -GrayscaleEffect.anInt9203 + i_3_
                            if (RegionSceneLoader.aWidgetComponent_3701!!.anInt729 < i_6_ || (-RegionSceneLoader.aWidgetComponent_3701!!.anInt729 > i_6_) || (i_7_ > RegionSceneLoader.aWidgetComponent_3701!!.anInt729) || i_7_ < -RegionSceneLoader.aWidgetComponent_3701!!.anInt729) ParticleConfigParser.aBoolean3819 = true
                        }
                        if ((RegionSceneLoader.aWidgetComponent_3701!!.anObjectArray823 != null) && ParticleConfigParser.aBoolean3819) {
                            val class348_sub36 = WidgetActionEntry()
                            class348_sub36.aWidgetComponent_6989 = RegionSceneLoader.aWidgetComponent_3701
                            class348_sub36.anInt6984 = i_4_
                            class348_sub36.anObjectArray6987 = (RegionSceneLoader.aWidgetComponent_3701!!.anObjectArray823)
                            class348_sub36.anInt6995 = i_5_
                            method705(class348_sub36)
                        }
                    } else {
                        if (ParticleConfigParser.aBoolean3819) {
                            TileRenderState.Companion.method2678(-2049)
                            if (RegionSceneLoader.aWidgetComponent_3701!!.anObjectArray692 != null) {
                                val class348_sub36 = WidgetActionEntry()
                                class348_sub36.aWidgetComponent_6983 = MapElementDecor.aWidgetComponent_10336
                                class348_sub36.anInt6984 = i_4_
                                class348_sub36.anObjectArray6987 = (RegionSceneLoader.aWidgetComponent_3701!!.anObjectArray692)
                                class348_sub36.anInt6995 = i_5_
                                class348_sub36.aWidgetComponent_6989 = RegionSceneLoader.aWidgetComponent_3701
                                method705(class348_sub36)
                            }
                            if (MapElementDecor.aWidgetComponent_10336 != null && (Client.method108(RegionSceneLoader.aWidgetComponent_3701) != null)) method173(-67, RegionSceneLoader.aWidgetComponent_3701, (MapElementDecor.aWidgetComponent_10336))
                        } else if ((WallEntity.anInt8770 == 1 || method2485(-113)) && Class73.anInt4776 > 2) method191(true, (NativeRenderer.anInt8001 + SceneEntityModel.anInt6411), (ModelDefinitionCache.anInt2872 - -(GrayscaleEffect.anInt9203)))
                        else if (method913(127.toByte())) method191(true, (NativeRenderer.anInt8001 + SceneEntityModel.anInt6411), (ModelDefinitionCache.anInt2872 + (GrayscaleEffect.anInt9203)))
                        RegionSceneLoader.aWidgetComponent_3701 = null
                    }
                }
            }
        }
    }
}
