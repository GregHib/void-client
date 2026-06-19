import jaggl.OpenGLStatics.glGetUniformLocationARB
import jaggl.OpenGLStatics.glUniform1fARB
import jaggl.OpenGLStatics.glUniform1iARB
import jaggl.OpenGLStatics.glUniform3fARB
import jaggl.OpenGLStatics.glUniform4fARB
import jaggl.OpenGLStatics.glUseProgramObjectARB
import kotlin.math.abs
import kotlin.math.min

object GlslEnvMaterialPassStatics {
    @JvmField
            var aSceneProjector_6262: SceneProjector? = SceneProjector("game3", 2)
            @JvmField
            var anInt6263: Int = 0
            @JvmField
            var anInt6264: Int = 0
            @JvmField
            var anInt6265: Int = 0
            @JvmField
            var anInt6267: Int = 0
            @JvmField
            var anInt6269: Int = 0
            @JvmField
            var aBooleanArray6270: BooleanArray? = null
            @JvmField
            var anInt6271: Int = 0
            @JvmField
            var anInt6273: Int = 0
            @JvmField
            var anInt6275: Int = 0
            @JvmField
            var aLong6276: Long = 0
    
            @JvmStatic
            fun method2162(bool: Boolean): String {
                if (bool != false) aLong6276 = -88L
                anInt6271++
                var string = "www"
                if (FixedFunctionWaterPassStatics.aNamedIdRecord_7361 != NpcAnimationResolverStatics.aNamedIdRecord_165) {
                    if (NpcAnimationResolverStatics.aNamedIdRecord_165 != SpriteArchiveLoaderStatics.aNamedIdRecord_382) {
                        if (NpcAnimationResolverStatics.aNamedIdRecord_165 == GroundItemRenderState.aNamedIdRecord_1657) string = "www-wtwip"
                    } else string = "www-wtqa"
                } else string = "www-wtrc"
                var string_2_ = ""
                if (BloomGraphicsOptionStateStatics.aString5966 != null) string_2_ = "/p=" + BloomGraphicsOptionStateStatics.aString5966
                return ("http://" + string + "." + (HardCacheEntryReferenceStatics.aSceneProjector_10434?.aString2985) + ".com/l=" + AnimationFrameDefinitionStatics.anInt6967 + "/a=" + SocketStreamWorkerStatics.anInt2670 + string_2_ + "/")
            }
    
            @JvmStatic
            fun method2163(bool: Boolean): Boolean {
                anInt6273++
                try {
                    if (SpriteDefinitionStatics.anInt7068 == 2) {
                        if (MaterialPassStatics.aClass348_Sub2_3683 == null) {
                            MaterialPassStatics.aClass348_Sub2_3683 = MidiFileBuilderStatics.method2734(ModelDefinitionStatics.aJs5Archive_1848!!, (NpcActorEntityStatics.anInt10074), SceneLinkedListNodeStatics.anInt3971)
                            if (MaterialPassStatics.aClass348_Sub2_3683 == null) return false
                        }
                        if (TextureDefinitionLoaderStatics.aSpriteArchiveLoader_1977 == null) TextureDefinitionLoaderStatics.aSpriteArchiveLoader_1977 = SpriteArchiveLoader(MinimapTileEntryStatics.aJs5Archive_611, MapElementLookupStatics.aJs5Archive_4147)
                        var class348_sub16_sub3 = NodeDequeHolderStatics.aClass348_Sub16_Sub3_1564!!
                        if (GlBufferObjectStatics.aClass348_Sub16_Sub3_4743 != null) class348_sub16_sub3 = GlBufferObjectStatics.aClass348_Sub16_Sub3_4743!!
                        if (class348_sub16_sub3.method2866((MaterialPassStatics.aClass348_Sub2_3683), 22050, TextureDefinitionLoaderStatics.aSpriteArchiveLoader_1977, GlEnvMappedWaterPassStatics.aJs5Archive_7371, -35)) {
                            NodeDequeHolderStatics.aClass348_Sub16_Sub3_1564 = class348_sub16_sub3
                            NodeDequeHolderStatics.aClass348_Sub16_Sub3_1564!!.method2864(52.toByte())
                            if (DirectionalLightTextureNodeStatics.anInt9444 <= 0) {
                                SpriteDefinitionStatics.anInt7068 = 0
                                NodeDequeHolderStatics.aClass348_Sub16_Sub3_1564!!.method2861(0, DirectionPathStatics.anInt1059)
                                for (i in BasicGlRenderPassStatics.anIntArray7299!!.indices) {
                                    NodeDequeHolderStatics.aClass348_Sub16_Sub3_1564!!.method2843(BasicGlRenderPassStatics.anIntArray7299!![i], i, -7836)
                                    BasicGlRenderPassStatics.anIntArray7299!![i] = 255
                                }
                            } else {
                                SpriteDefinitionStatics.anInt7068 = 3
                                NodeDequeHolderStatics.aClass348_Sub16_Sub3_1564!!.method2861(0, (min(DirectionPathStatics.anInt1059, DirectionalLightTextureNodeStatics.anInt9444)))
                                var i = 0
                                while ((BasicGlRenderPassStatics.anIntArray7299!!.size > i)) {
                                    NodeDequeHolderStatics.aClass348_Sub16_Sub3_1564!!.method2843(BasicGlRenderPassStatics.anIntArray7299!![i], i, -7836)
                                    BasicGlRenderPassStatics.anIntArray7299!![i] = 255
                                    i++
                                }
                            }
                            if (GlBufferObjectStatics.aClass348_Sub16_Sub3_4743 == null) {
                                if (BloomGraphicsOptionStateStatics.aLong5971 <= 0) NodeDequeHolderStatics.aClass348_Sub16_Sub3_1564!!.method2869(MaterialPassStatics.aClass348_Sub2_3683, KeyboardInputSourceStatics.aBoolean4275, false)
                                else NodeDequeHolderStatics.aClass348_Sub16_Sub3_1564!!.method2870(MaterialPassStatics.aClass348_Sub2_3683, BloomGraphicsOptionStateStatics.aLong5971, KeyboardInputSourceStatics.aBoolean4275, true, 24.toByte())
                            }
                            if (ActorEntityStatics.aSoundChannelMixer_8764 != null) ActorEntityStatics.aSoundChannelMixer_8764!!.method2088(bool, NodeDequeHolderStatics.aClass348_Sub16_Sub3_1564)
                            ModelDefinitionStatics.aJs5Archive_1848 = null
                            MaterialPassStatics.aClass348_Sub2_3683 = null
                            BloomGraphicsOptionStateStatics.aLong5971 = 0L
                            TextureDefinitionLoaderStatics.aSpriteArchiveLoader_1977 = null
                            GlBufferObjectStatics.aClass348_Sub16_Sub3_4743 = null
                            return true
                        }
                    }
                    if (bool != false) aBooleanArray6270 = null
                } catch (exception: Exception) {
                    exception.printStackTrace()
                    NodeDequeHolderStatics.aClass348_Sub16_Sub3_1564!!.method2877(-128)
                    GlBufferObjectStatics.aClass348_Sub16_Sub3_4743 = null
                    TextureDefinitionLoaderStatics.aSpriteArchiveLoader_1977 = null
                    MaterialPassStatics.aClass348_Sub2_3683 = null
                    ModelDefinitionStatics.aJs5Archive_1848 = null
                    SpriteDefinitionStatics.anInt7068 = 0
                }
                return false
            }
    
            @JvmStatic
            fun method2164(bool: Boolean) {
                if (bool == true) {
                    aSceneProjector_6262 = null
                    aBooleanArray6270 = null
                }
            }
}
