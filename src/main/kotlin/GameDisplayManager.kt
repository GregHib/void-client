import GlCubeMapTexture.Companion.method243
import GraphicsOptionState.Companion.method1713
import FixedFunctionMaterialPass.Companion.method2145
import TexGenMaterialPass.Companion.method2158
import Class56.Companion.method527
import TerrainTile.Companion.method3980
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
        if (SkeletalAnimFrameLoader.aFrame476 != null && (i_2_ != 3 || i_0_ != KeyboardInputSource.anInt4276 || i_3_ != FlickeringEffectsOptionState.anInt5911)) {
            method527(SkeletalAnimFrameLoader.aFrame476, VorbisOggDecoder.aPrivilegedOperationWorker_8992, false)
            SkeletalAnimFrameLoader.aFrame476 = null
        }
        anInt2839++
        val i_4_ = -33 / ((-74 - i) / 51)
        if (i_2_ == 3 && SkeletalAnimFrameLoader.aFrame476 == null) {
            SkeletalAnimFrameLoader.aFrame476 = MapElementDecor.method2463(i_3_, i_0_, (VorbisOggDecoder.aPrivilegedOperationWorker_8992!!), 0, 14199, 0)
            if (SkeletalAnimFrameLoader.aFrame476 != null) {
                KeyboardInputSource.anInt4276 = i_0_
                FlickeringEffectsOptionState.anInt5911 = i_3_
                method243(37)
            }
        }
        if (i_2_ == 3 && SkeletalAnimFrameLoader.aFrame476 == null) GameDisplayManager.method1580((-126).toByte(), true, -1, i_1_, IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub8_7227!!.method1751(-32350), -1)
        else {
            val container: Container?
            if (SkeletalAnimFrameLoader.aFrame476 != null) {
                NpcReference.anInt6857 = i_3_
                SocketFactory.anInt3473 = i_0_
                container = SkeletalAnimFrameLoader.aFrame476
            } else if (Class52.aFrame4904 == null) {
                if (Class93.anApplet1530 == null) container = EdgeDetectTextureNode.anGameApplet_Frame_9169
                else container = Class93.anApplet1530 as? Container
                SocketFactory.anInt3473 = container!!.getSize().width
                NpcReference.anInt6857 = container.getSize().height
            } else {
                val insets = Class52.aFrame4904!!.getInsets()
                SocketFactory.anInt3473 = Class52.aFrame4904!!.getSize().width + (-insets.left + -insets.right)
                NpcReference.anInt6857 = Class52.aFrame4904!!.getSize().height - (insets.top - -insets.bottom)
                container = Class52.aFrame4904
            }
            if (i_2_ == 1) {
                LocTypeDefinition.anInt4017 = Class92.anInt1524
                HardCacheEntryReference.anInt10432 = OpenGlRenderer.anInt7666
                ModelResourceBundle.anInt7129 = (SocketFactory.anInt3473 + -Class92.anInt1524) / 2
                TimingCounters.anInt4167 = 0
            } else method2158(56.toByte())
            if (Class55_Sub1.aNamedIdRecord_5271 != Class8.aNamedIdRecord_165) {
                if (LocTypeDefinition.anInt4017 < 1024 && (HardCacheEntryReference.anInt10432 < 768)) {
                    /* empty */
                }
            }
            if (bool) OutgoingPacketNode.method3327(1406)
            else {
                ParticleSystemRenderer.aCanvas3869!!.setSize(LocTypeDefinition.anInt4017, (HardCacheEntryReference.anInt10432))
                if (!Class59_Sub1.aBoolean5300) FacingDirectionNode.aRenderer6654!!.method3669(ParticleSystemRenderer.aCanvas3869, LocTypeDefinition.anInt4017, (HardCacheEntryReference.anInt10432))
                else method3980(86, ParticleSystemRenderer.aCanvas3869!!)
                if (Class52.aFrame4904 === container) {
                    val insets = Class52.aFrame4904!!.getInsets()
                    ParticleSystemRenderer.aCanvas3869!!.setLocation((ModelResourceBundle.anInt7129 + insets.left), (insets.top - -TimingCounters.anInt4167))
                } else ParticleSystemRenderer.aCanvas3869!!.setLocation(ModelResourceBundle.anInt7129, TimingCounters.anInt4167)
            }
            Class50_Sub1.aBoolean5219 = i_2_ >= 2
            if (RenderNode.anInt9721 != -1) method1713(true, 520)
            if (PerlinNoiseTextureNode.aAbstractGameSocket_9165 != null && CameraOrModelTransform.method2653(true, WorldMapRenderer.anInt4674)) method2145(-24498)
            for (i_5_ in 0..99) GzipDecompressor.aBooleanArray2076!![i_5_] = true
            Class49.aBoolean4726 = true
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
                    if (SpriteDefinition.anInt7068 == 1) {
                        var i_6_ = Class98.aClass348_Sub16_Sub3_1564!!.method2844(123.toByte())
                        if (i_6_ > 0 && Class98.aClass348_Sub16_Sub3_1564!!.method2860(124)) {
                            i_6_ -= WaterDetailOptionState.anInt5994
                            if (i_6_ < 0) i_6_ = 0
                            Class98.aClass348_Sub16_Sub3_1564!!.method2861(0, i_6_)
                            break
                        }
                        Class98.aClass348_Sub16_Sub3_1564!!.method2877(-128)
                        Class98.aClass348_Sub16_Sub3_1564!!.method2867(i xor 0x1eaf)
                        TextureDefinitionLoader.aSpriteArchiveLoader_1977 = null
                        if (ModelDefinition.aJs5Archive_1848 != null) SpriteDefinition.anInt7068 = 2
                        else SpriteDefinition.anInt7068 = 0
                        MaterialPass.aClass348_Sub2_3683 = null
                    }
                    if (SpriteDefinition.anInt7068 != 3) break
                    var i_7_ = Class98.aClass348_Sub16_Sub3_1564!!.method2844((-87).toByte())
                    if (i_7_ < Class58.anInt1059 && Class98.aClass348_Sub16_Sub3_1564!!.method2860(95)) {
                        i_7_ += DirectionalLightTextureNode.anInt9444
                        if (Class58.anInt1059 < i_7_) i_7_ = Class58.anInt1059
                        Class98.aClass348_Sub16_Sub3_1564!!.method2861(i xor 0x1eab, i_7_)
                    } else {
                        DirectionalLightTextureNode.anInt9444 = 0
                        SpriteDefinition.anInt7068 = 0
                    }
                } catch (exception: Exception) {
                    exception.printStackTrace()
                    Class98.aClass348_Sub16_Sub3_1564!!.method2877(-128)
                    ModelDefinition.aJs5Archive_1848 = null
                    MaterialPass.aClass348_Sub2_3683 = null
                    GlBufferObject.aClass348_Sub16_Sub3_4743 = null
                    TextureDefinitionLoader.aSpriteArchiveLoader_1977 = null
                    SpriteDefinition.anInt7068 = 0
                    break
                }
                break
            } while (false)
        }
    }
}
