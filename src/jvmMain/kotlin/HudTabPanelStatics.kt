import SceneTilePlaneManager.method260
import ArrayCopyUtil.method1574
import ProjectedGroundDecorStatics.method2431

object HudTabPanelStatics {
    var anInt2990: Int = 0
            var anInt2991: Int = 0
            var anInt2992: Int = 0
            var aPrivilegedOperationWorker_2993: PrivilegedOperationWorker? = null
            var anInt2994: Int = 0
            var anInt2996: Int = 0
            var anInt2997: Int = 0
    
            fun method1638(i: Int, fs: FloatArray, i_0_: Int): FloatArray {
                anInt2990++
                if (i_0_ != -1) aPrivilegedOperationWorker_2993 = null
                val fs_1_ = FloatArray(i)
                method1574(fs, 0, fs_1_, 0, i)
                return fs_1_
            }
    
            @JvmStatic
            fun method1639(i: Int, i_2_: Int): Boolean {
                anInt2994++
                return i >= 12 && i <= 17
            }
    
            @JvmStatic
            fun method1641(i: Byte) {
                aPrivilegedOperationWorker_2993 = null
                if (i.toInt() != 85) aPrivilegedOperationWorker_2993 = null
            }
    
            @JvmStatic
            fun method1642(i: Byte, var_renderer: Renderer?) {
                anInt2997++
                var i_3_ = 0
                var i_4_ = 0
                if (GrayscaleNoiseTextureStatics.aBoolean5300) {
                    i_3_ = NativeTerrainTileStatics.method4008((-124).toByte())
                    i_4_ = method260(false)
                }
                val i_5_ = -10660793
                SpotAnimEntityStatics.method2509(SceneTileBoundsStatics.anInt1117, ProceduralTextureGraphStatics.anInt9532 - -i_4_, var_renderer!!, GlArrayBufferObjectStatics.anInt4717 - -i_3_, i_5_, true, WorldMapSceneSoftwareStatics.anInt5819, -16777216)
                if (i > 98) {
                    NodeDequeStatics.aFont_3326!!.method2576(LocalizedTextStatics.aLocalizedText_3507!!.method2063(AnimationFrameDefinitionStatics.anInt6967, 544), i_5_, i_4_ + (ProceduralTextureGraphStatics.anInt9532 - -14), i_3_ + (GlArrayBufferObjectStatics.anInt4717 + 3), -1, -125)
                    val i_6_ = GlTexture1DStatics.aInputTracker_8552!!.method3597(true) - -i_3_
                    val i_7_ = i_4_ + GlTexture1DStatics.aInputTracker_8552!!.method3594(127.toByte())
                    if (ChatScriptListNodeStatics.aBoolean9535) {
                        var i_8_ = 0
                        var class348_sub42_sub13 = (ParticleSortRendererStatics.aLinkedNodeListIterator_3022!!.method1011(-119) as? ContactList?)
                        while (class348_sub42_sub13 != null) {
                            val i_9_ = (31 + i_4_ + ProceduralTextureGraphStatics.anInt9532 + i_8_ * 16)
                            i_8_++
                            if ((class348_sub42_sub13.anInt9615) == 1) SceneModelBuilderStatics.method2494(i_4_ + ProceduralTextureGraphStatics.anInt9532, -256, i_9_, var_renderer, ((class348_sub42_sub13.aLinkedNodeListIterator_9621.aClass348_Sub42_1647.aClass348_Sub42_7063) as ContactEntry?), SceneTileBoundsStatics.anInt1117, i_7_, -1, 124.toByte(), WorldMapSceneSoftwareStatics.anInt5819, GlArrayBufferObjectStatics.anInt4717 - -i_3_, i_6_)
                            else method2431(-1, i_9_, class348_sub42_sub13, i_6_, SceneTileBoundsStatics.anInt1117, -256, i_7_, var_renderer, ProceduralTextureGraphStatics.anInt9532 + i_4_, 126, GlArrayBufferObjectStatics.anInt4717 - -i_3_, WorldMapSceneSoftwareStatics.anInt5819)
                            class348_sub42_sub13 = (ParticleSortRendererStatics.aLinkedNodeListIterator_3022!!.method1003(44.toByte()) as? ContactList?)
                        }
                        if (ManagedGlResourceStatics.aClass348_Sub42_Sub13_3152 != null) {
                            SpotAnimEntityStatics.method2509(TerrainTileShapeStatics.anInt8806, InputTrackerStatics.anInt4534, var_renderer, MinimapPolygonDrawerStatics.anInt5252, i_5_, true, ClickFeedbackTaskStatics.anInt4669, -16777216)
                            i_8_ = 0
                            NodeDequeStatics.aFont_3326!!.method2576(ManagedGlResourceStatics.aClass348_Sub42_Sub13_3152!!.aString9617, i_5_, InputTrackerStatics.anInt4534 - -14, 3 + MinimapPolygonDrawerStatics.anInt5252, -1, -126)
                            var class348_sub42_sub12 = (ManagedGlResourceStatics.aClass348_Sub42_Sub13_3152!!.aLinkedNodeListIterator_9621.method1011(-84) as? ContactEntry?)
                            while (class348_sub42_sub12 != null) {
                                val i_10_ = 31 + (InputTrackerStatics.anInt4534 + i_8_ * 16)
                                i_8_++
                                SceneModelBuilderStatics.method2494(InputTrackerStatics.anInt4534, -256, i_10_, var_renderer, class348_sub42_sub12, TerrainTileShapeStatics.anInt8806, i_7_, -1, 125.toByte(), ClickFeedbackTaskStatics.anInt4669, MinimapPolygonDrawerStatics.anInt5252, i_6_)
                                class348_sub42_sub12 = (ManagedGlResourceStatics.aClass348_Sub42_Sub13_3152!!.aLinkedNodeListIterator_9621.method1003(73.toByte()) as? ContactEntry?)
                            }
                            SoundCacheState.method2642(TerrainTileShapeStatics.anInt8806, InputTrackerStatics.anInt4534, true, MinimapPolygonDrawerStatics.anInt5252, ClickFeedbackTaskStatics.anInt4669)
                        }
                    } else {
                        var i_11_ = 0
                        var class348_sub42_sub12 = (SourceRowTextureNodeStatics.aNodeDeque_9111!!.method1995(4) as? ContactEntry?)
                        while (class348_sub42_sub12 != null) {
                            val i_12_ = 31 + (i_4_ + ProceduralTextureGraphStatics.anInt9532 - -((-i_11_ + -1 + FileExistsConditionStatics.anInt4776) * 16))
                            SceneModelBuilderStatics.method2494(i_4_ + ProceduralTextureGraphStatics.anInt9532, -256, i_12_, var_renderer, class348_sub42_sub12, SceneTileBoundsStatics.anInt1117, i_7_, -1, 124.toByte(), WorldMapSceneSoftwareStatics.anInt5819, GlArrayBufferObjectStatics.anInt4717 - -i_3_, i_6_)
                            i_11_++
                            class348_sub42_sub12 = SourceRowTextureNodeStatics.aNodeDeque_9111!!.method1990(55.toByte()) as? ContactEntry?
                        }
                    }
                    SoundCacheState.method2642(SceneTileBoundsStatics.anInt1117, ProceduralTextureGraphStatics.anInt9532 - -i_4_, true, GlArrayBufferObjectStatics.anInt4717 + i_3_, WorldMapSceneSoftwareStatics.anInt5819)
                }
            }
}
