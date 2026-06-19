import GlCubeMapTextureStatics.method243
import GraphicsOptionStateStatics.method1713
import FixedFunctionMaterialPassStatics.method2145
import TexGenMaterialPassStatics.method2158
import ConnectionStateTypeStatics.method527
import TerrainTileStatics.method3980
import java.awt.Container

/*
 * Class215
 */
object GameDisplayManager {
    @JvmField
    var anInt2834: Int = 0
    var anInt2835: Int = 0
    var aFloat2836: Float = 0f
    var anInt2837: Int = 0
    var anInt2838: Int = 0
    var anInt2839: Int = 0

    fun method1580(i: Byte, bool: Boolean, i_0_: Int, i_1_: Int, i_2_: Int, i_3_: Int) {
        if (SkeletalAnimFrameLoaderStatics.aFrame476 != null && (i_2_ != 3 || i_0_ != KeyboardInputSourceStatics.anInt4276 || i_3_ != FlickeringEffectsOptionStateStatics.anInt5911)) {
            method527(SkeletalAnimFrameLoaderStatics.aFrame476, VorbisOggDecoderStatics.aPrivilegedOperationWorker_8992, false)
            SkeletalAnimFrameLoaderStatics.aFrame476 = null
        }
        anInt2839++
        val i_4_ = -33 / ((-74 - i) / 51)
        if (i_2_ == 3 && SkeletalAnimFrameLoaderStatics.aFrame476 == null) {
            SkeletalAnimFrameLoaderStatics.aFrame476 = MapElementDecorStatics.method2463(i_3_, i_0_, (VorbisOggDecoderStatics.aPrivilegedOperationWorker_8992!!), 0, 14199, 0)
            if (SkeletalAnimFrameLoaderStatics.aFrame476 != null) {
                KeyboardInputSourceStatics.anInt4276 = i_0_
                FlickeringEffectsOptionStateStatics.anInt5911 = i_3_
                method243(37)
            }
        }
        if (i_2_ == 3 && SkeletalAnimFrameLoaderStatics.aFrame476 == null) GameDisplayManager.method1580((-126).toByte(), true, -1, i_1_, IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub8_7227!!.method1751(-32350), -1)
        else {
            val container: Container?
            if (SkeletalAnimFrameLoaderStatics.aFrame476 != null) {
                NpcReferenceStatics.anInt6857 = i_3_
                SocketFactoryStatics.anInt3473 = i_0_
                container = SkeletalAnimFrameLoaderStatics.aFrame476
            } else if (RsaVarbitHandlerStatics.aFrame4904 == null) {
                if (JagGlToolkitFactory.anApplet1530 == null) container = EdgeDetectTextureNodeStatics.anGameApplet_Frame_9169
                else container = JagGlToolkitFactory.anApplet1530 as? Container
                SocketFactoryStatics.anInt3473 = container!!.getSize().width
                NpcReferenceStatics.anInt6857 = container.getSize().height
            } else {
                val insets = RsaVarbitHandlerStatics.aFrame4904!!.getInsets()
                SocketFactoryStatics.anInt3473 = RsaVarbitHandlerStatics.aFrame4904!!.getSize().width + (-insets.left + -insets.right)
                NpcReferenceStatics.anInt6857 = RsaVarbitHandlerStatics.aFrame4904!!.getSize().height - (insets.top - -insets.bottom)
                container = RsaVarbitHandlerStatics.aFrame4904
            }
            if (i_2_ == 1) {
                LocTypeDefinitionStatics.anInt4017 = NpcSpawnDecoder.anInt1524
                HardCacheEntryReferenceStatics.anInt10432 = OpenGlRendererStatics.anInt7666
                ModelResourceBundleStatics.anInt7129 = (SocketFactoryStatics.anInt3473 + -NpcSpawnDecoder.anInt1524) / 2
                TimingCounters.anInt4167 = 0
            } else method2158(56.toByte())
            if (OggCacheStreamStatics.aNamedIdRecord_5271 != NpcAnimationResolverStatics.aNamedIdRecord_165) {
                if (LocTypeDefinitionStatics.anInt4017 < 1024 && (HardCacheEntryReferenceStatics.anInt10432 < 768)) {
                    /* empty */
                }
            }
            if (bool) OutgoingPacketNodeStatics.method3327(1406)
            else {
                ParticleSystemRendererStatics.aCanvas3869!!.setSize(LocTypeDefinitionStatics.anInt4017, (HardCacheEntryReferenceStatics.anInt10432))
                if (!GrayscaleNoiseTextureStatics.aBoolean5300) FacingDirectionNodeStatics.aRenderer6654!!.method3669(ParticleSystemRendererStatics.aCanvas3869, LocTypeDefinitionStatics.anInt4017, (HardCacheEntryReferenceStatics.anInt10432))
                else method3980(86, ParticleSystemRendererStatics.aCanvas3869!!)
                if (RsaVarbitHandlerStatics.aFrame4904 === container) {
                    val insets = RsaVarbitHandlerStatics.aFrame4904!!.getInsets()
                    ParticleSystemRendererStatics.aCanvas3869!!.setLocation((ModelResourceBundleStatics.anInt7129 + insets.left), (insets.top - -TimingCounters.anInt4167))
                } else ParticleSystemRendererStatics.aCanvas3869!!.setLocation(ModelResourceBundleStatics.anInt7129, TimingCounters.anInt4167)
            }
            MinimapSquareDrawerStatics.aBoolean5219 = i_2_ >= 2
            if (RenderNodeStatics.anInt9721 != -1) method1713(true, 520)
            if (PerlinNoiseTextureNodeStatics.aAbstractGameSocket_9165 != null && CameraOrModelTransformStatics.method2653(true, WorldMapRendererStatics.anInt4674)) method2145(-24498)
            for (i_5_ in 0..99) GzipDecompressorStatics.aBooleanArray2076!![i_5_] = true
            SpriteRenderableStatics.aBoolean4726 = true
        }
    }

    fun method1581(i: Int, c: Char): Boolean {
        anInt2838++
        if (i >= -18) return false
        return (c.code >= 65 && c.code <= 90) || (c.code >= 97 && c.code <= 122)
    }

    @JvmStatic
    fun method1582(i: Int) {
        anInt2837++
        if (i == 7851) {
            do {
                try {
                    if (SpriteDefinitionStatics.anInt7068 == 1) {
                        var i_6_ = NodeDequeHolderStatics.aClass348_Sub16_Sub3_1564!!.method2844(123.toByte())
                        if (i_6_ > 0 && NodeDequeHolderStatics.aClass348_Sub16_Sub3_1564!!.method2860(124)) {
                            i_6_ -= WaterDetailOptionStateStatics.anInt5994
                            if (i_6_ < 0) i_6_ = 0
                            NodeDequeHolderStatics.aClass348_Sub16_Sub3_1564!!.method2861(0, i_6_)
                            break
                        }
                        NodeDequeHolderStatics.aClass348_Sub16_Sub3_1564!!.method2877(-128)
                        NodeDequeHolderStatics.aClass348_Sub16_Sub3_1564!!.method2867(i xor 0x1eaf)
                        TextureDefinitionLoaderStatics.aSpriteArchiveLoader_1977 = null
                        if (ModelDefinitionStatics.aJs5Archive_1848 != null) SpriteDefinitionStatics.anInt7068 = 2
                        else SpriteDefinitionStatics.anInt7068 = 0
                        MaterialPassStatics.aClass348_Sub2_3683 = null
                    }
                    if (SpriteDefinitionStatics.anInt7068 != 3) break
                    var i_7_ = NodeDequeHolderStatics.aClass348_Sub16_Sub3_1564!!.method2844((-87).toByte())
                    if (i_7_ < DirectionPathStatics.anInt1059 && NodeDequeHolderStatics.aClass348_Sub16_Sub3_1564!!.method2860(95)) {
                        i_7_ += DirectionalLightTextureNodeStatics.anInt9444
                        if (DirectionPathStatics.anInt1059 < i_7_) i_7_ = DirectionPathStatics.anInt1059
                        NodeDequeHolderStatics.aClass348_Sub16_Sub3_1564!!.method2861(i xor 0x1eab, i_7_)
                    } else {
                        DirectionalLightTextureNodeStatics.anInt9444 = 0
                        SpriteDefinitionStatics.anInt7068 = 0
                    }
                } catch (exception: Exception) {
                    exception.printStackTrace()
                    NodeDequeHolderStatics.aClass348_Sub16_Sub3_1564!!.method2877(-128)
                    ModelDefinitionStatics.aJs5Archive_1848 = null
                    MaterialPassStatics.aClass348_Sub2_3683 = null
                    GlBufferObjectStatics.aClass348_Sub16_Sub3_4743 = null
                    TextureDefinitionLoaderStatics.aSpriteArchiveLoader_1977 = null
                    SpriteDefinitionStatics.anInt7068 = 0
                    break
                }
                break
            } while (false)
        }
    }
}
