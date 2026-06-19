import DelegatingRenderCanvasStatics.method119
import MinimapDrawController.method950
import ScriptCompilerThreadStatics.method1053
import SizeBoundedSoftCacheStatics.method1343
import CacheArchiveIndexLoaderStatics.method338
import SolidFillComponentStatics.method198
import ActiveMapRegion.method769
import ConfigArchiveLoaderStatics.method814
import SceneNodeDequeStatics.method842

object MinimapPositionStateStatics {
    var anInt3836: Int = 0
            var anInt3841: Int = 0
    
            fun method2283(bool: Boolean, i: Int, i_0_: Int, i_1_: Int, bool_2_: Boolean) {
                method950(i_0_, 0, WorldMapImageBuilderStatics.aClass110_Sub1Array1146!!.size + -1, bool, 56.toByte(), i_1_, bool_2_)
                anInt3836++
                GameDisplayManager.anInt2834 = i
                PingHostListHolder.aClass348_Sub26_2332 = null
            }
    
            @JvmStatic
            fun method2284(i: Byte, l: Long) {
                try {
                    anInt3841++
                    if (HintArrowOrMessageStatics.aSceneCollisionEntryArrayArrayArray2029 != null) {
                        if (WeaveTextureNodeStatics.anInt9282 != 1 && WeaveTextureNodeStatics.anInt9282 != 5) {
                            if (WeaveTextureNodeStatics.anInt9282 == 4) method814(125.toByte(), l)
                        } else method119(-1, l)
                    }
                    OutgoingPacketNodeStatics.method3324(FacingDirectionNodeStatics.aRenderer6654, 83.toByte(), GlGroundShaderPassStatics.anInt7396.toLong())
                    if (RenderNodeStatics.anInt9721 != -1) method769(RenderNodeStatics.anInt9721, 118.toByte())
                    for (i_3_ in 0..<TerrainShadowBuilderGl3Statics.anInt7008) {
                        if (GzipDecompressorStatics.aBooleanArray2076!![i_3_]) LocDefinitionCacheStatics.aBooleanArray3438!![i_3_] = true
                        SizeBoundedSoftCacheStatics.aBooleanArray2326!![i_3_] = GzipDecompressorStatics.aBooleanArray2076!![i_3_]
                        GzipDecompressorStatics.aBooleanArray2076!![i_3_] = false
                    }
                    DirectionPathStatics.anInt1064 = GlGroundShaderPassStatics.anInt7396
                    method198(null, false, -1, -1)
                    method1343(-1, null, 1, -1)
                    if (RenderNodeStatics.anInt9721 != -1) {
                        TerrainShadowBuilderGl3Statics.anInt7008 = 0
                        method842(false)
                    }
                    FacingDirectionNodeStatics.aRenderer6654!!.la()
                    SpriteRenderEntryStatics.method3281(46.toByte(), FacingDirectionNodeStatics.aRenderer6654!!)
                    var i_4_ = method1053(3112)
                    if (i_4_ == -1) i_4_ = Tooltip.anInt4458
                    if (i_4_ == -1) i_4_ = StreamingResourceRequestStatics.anInt10447
                    method338(0, i_4_)
                    if (i.toInt() == -43) {
                        val i_5_ = (LocalPlayerState.aPlayer_1907!!.method2436(103.toByte()) shl 8)
                        TimingCounters.method2655(98, LocalPlayerState.aPlayer_1907!!.plane.toInt(), DisplaySettingsConfigStatics.anInt7267, i_5_ + (LocalPlayerState.aPlayer_1907!!.y), (LocalPlayerState.aPlayer_1907!!.x - -i_5_))
                        DisplaySettingsConfigStatics.anInt7267 = 0
                    }
                } catch (runtimeexception: RuntimeException) {
                    throw SoundBankPatchStatics.method2929(runtimeexception, "wo.B(" + i + ',' + l + ')')
                }
            }
}
