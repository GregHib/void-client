import DelegatingRenderCanvas.Companion.method119
import MinimapDrawController.method950
import ScriptCompilerThread.Companion.method1053
import SizeBoundedSoftCache.Companion.method1343
import CacheArchiveIndexLoader.Companion.method338
import SolidFillComponent.Companion.method198
import ActiveMapRegion.method769
import ConfigArchiveLoader.Companion.method814
import SceneNodeDeque.Companion.method842

/* Class302 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class MinimapPositionState {

    var anInt3831: Int = 0

    var anInt3832: Int = 0

    var anInt3833: Int = 0
    var anInt3834: Int = -1

    var anInt3835: Int = 0
    var anInt3837: Int = 0

    var anInt3838: Int = 0

    var anInt3839: Int = 0

    var anInt3840: Int = 0

    companion object {
        var anInt3836: Int = 0
        var anInt3841: Int = 0

        fun method2283(bool: Boolean, i: Int, i_0_: Int, i_1_: Int, bool_2_: Boolean) {
            method950(i_0_, 0, WorldMapImageBuilder.aClass110_Sub1Array1146!!.size + -1, bool, 56.toByte(), i_1_, bool_2_)
            anInt3836++
            GameDisplayManager.anInt2834 = i
            PingHostListHolder.aClass348_Sub26_2332 = null
        }

        @JvmStatic
        fun method2284(i: Byte, l: Long) {
            try {
                anInt3841++
                if (HintArrowOrMessage.aSceneCollisionEntryArrayArrayArray2029 != null) {
                    if (WeaveTextureNode.anInt9282 != 1 && WeaveTextureNode.anInt9282 != 5) {
                        if (WeaveTextureNode.anInt9282 == 4) method814(125.toByte(), l)
                    } else method119(-1, l)
                }
                OutgoingPacketNode.method3324(FacingDirectionNode.aRenderer6654, 83.toByte(), GlGroundShaderPass.anInt7396.toLong())
                if (RenderNodeStatics.anInt9721 != -1) method769(RenderNodeStatics.anInt9721, 118.toByte())
                for (i_3_ in 0..<TerrainShadowBuilderGl3.anInt7008) {
                    if (OpenGlModel.aBooleanArray2076!![i_3_]) LocDefinitionCache.aBooleanArray3438!![i_3_] = true
                    SizeBoundedSoftCache.aBooleanArray2326!![i_3_] = OpenGlModel.aBooleanArray2076!![i_3_]
                    OpenGlModel.aBooleanArray2076!![i_3_] = false
                }
                DirectionPath.anInt1064 = GlGroundShaderPass.anInt7396
                method198(null, false, -1, -1)
                method1343(-1, null, 1, -1)
                if (RenderNodeStatics.anInt9721 != -1) {
                    TerrainShadowBuilderGl3.anInt7008 = 0
                    method842(false)
                }
                FacingDirectionNode.aRenderer6654!!.la()
                SpriteRenderEntry.method3281(46.toByte(), FacingDirectionNode.aRenderer6654!!)
                var i_4_ = method1053(3112)
                if (i_4_ == -1) i_4_ = Tooltip.anInt4458
                if (i_4_ == -1) i_4_ = StreamingResourceRequest.anInt10447
                method338(0, i_4_)
                if (i.toInt() == -43) {
                    val i_5_ = (LocalPlayerState.aPlayer_1907!!.method2436(103.toByte()) shl 8)
                    TimingCounters.method2655(98, LocalPlayerState.aPlayer_1907!!.plane.toInt(), DisplaySettingsConfig.anInt7267, i_5_ + (LocalPlayerState.aPlayer_1907!!.y), (LocalPlayerState.aPlayer_1907!!.x - -i_5_))
                    DisplaySettingsConfig.anInt7267 = 0
                }
            } catch (runtimeexception: RuntimeException) {
                throw TextureLoadException.method2929(runtimeexception, "wo.B(" + i + ',' + l + ')')
            }
        }
    }
}
