import GraphicsOptionStateStatics.method1713
import TexGenMaterialPassStatics.method2158
import CubemapTexture2dSourceStatics.method2260
import jaggl.OpenGLStatics.glBindProgramARB
import jaggl.OpenGLStatics.glDisable
import jaggl.OpenGLStatics.glEnable
import jaggl.OpenGLStatics.glProgramLocalParameter4fARB
import ArbVertexProgramStatics.method3442
import java.awt.Container

object GlGroundShaderPassStatics {
    @JvmField
            var anInt7393: Int = 0
            @JvmField
            var aByteArray7394: ByteArray? = null
            @JvmField
            var anInt7396: Int = 0
            @JvmField
            var anIntArray7397: IntArray? = IntArray(4096)
            @JvmField
            var aIntRange_7398: IntRange? = IntRange(16, 6)
            @JvmField
            var anInt7400: Int = 0
            @JvmField
            var anInt7401: Int = 0
            @JvmField
            var anInt7402: Int = 0
            @JvmField
            var anInt7403: Int = 0
            @JvmField
            var anInt7405: Int = 0
            @JvmField
            var anInt7408: Int = 0
            @JvmField
            var anInt7409: Int = 0
            @JvmField
            var anInt7410: Int = 0
            @JvmField
            var anInt7412: Int = 0
            @JvmField
            var anInt7414: Int = 0
            @JvmField
            var aLongHashTable_7415: LongHashTable? = LongHashTable(8)
    
            @JvmStatic
            fun method3555(js5Archive: Js5Archive?, i: Int, bool: Boolean, l: Long, i_7_: Int, i_8_: Int, i_9_: Int) {
                try {
                    anInt7410++
                    method2260(i_9_, i_8_, l, 0, bool, js5Archive, 126.toByte(), i_7_)
                    val i_10_ = -35 / ((-41 - i) / 38)
                } catch (runtimeexception: RuntimeException) {
                    throw SoundBankPatchStatics.method2929(runtimeexception, ("or.Q(" + (if (js5Archive != null) "{...}" else "null") + ',' + i + ',' + bool + ',' + l + ',' + i_7_ + ',' + i_8_ + ',' + i_9_ + ')'))
                }
            }
    
            @JvmStatic
            fun method3556(bool: Boolean) {
                anInt7405++
                if (bool == false) {
                    synchronized(NpcTypeStatics.aClient1367!!) {
                        if (SkeletalAnimFrameLoaderStatics.aFrame476 == null) {
                            val container: Container
                            if (RsaVarbitHandlerStatics.aFrame4904 != null) container = RsaVarbitHandlerStatics.aFrame4904!!
                            else if (JagGlToolkitFactory.anApplet1530 == null) container = EdgeDetectTextureNodeStatics.anGameApplet_Frame_9169!!
                            else container = JagGlToolkitFactory.anApplet1530!! as Container
                            SocketFactoryStatics.anInt3473 = container.getSize().width
                            NpcReferenceStatics.anInt6857 = container.getSize().height
                            if (RsaVarbitHandlerStatics.aFrame4904 === container) {
                                val insets = RsaVarbitHandlerStatics.aFrame4904!!.getInsets()
                                SocketFactoryStatics.anInt3473 -= insets.left - -insets.right
                                NpcReferenceStatics.anInt6857 -= insets.bottom + insets.top
                            }
                            if (ContactEntryStatics.method3229(-86) == 1) {
                                LocTypeDefinitionStatics.anInt4017 = NpcSpawnDecoder.anInt1524
                                TimingCounters.anInt4167 = 0
                                ModelResourceBundleStatics.anInt7129 = (SocketFactoryStatics.anInt3473 - NpcSpawnDecoder.anInt1524) / 2
                                HardCacheEntryReferenceStatics.anInt10432 = OpenGlRendererStatics.anInt7666
                            } else method2158(56.toByte())
                            if (OggCacheStreamStatics.aNamedIdRecord_5271 != NpcAnimationResolverStatics.aNamedIdRecord_165) {
                                if (LocTypeDefinitionStatics.anInt4017 < 1024 && HardCacheEntryReferenceStatics.anInt10432 < 768) {
                                    /* empty */
                                }
                            }
                            ParticleSystemRendererStatics.aCanvas3869!!.setSize(LocTypeDefinitionStatics.anInt4017, (HardCacheEntryReferenceStatics.anInt10432))
                            if (FacingDirectionNodeStatics.aRenderer6654 != null) {
                                if (GrayscaleNoiseTextureStatics.aBoolean5300) TerrainTileStatics.method3980(120, ParticleSystemRendererStatics.aCanvas3869!!)
                                else FacingDirectionNodeStatics.aRenderer6654!!.method3669(ParticleSystemRendererStatics.aCanvas3869, LocTypeDefinitionStatics.anInt4017, HardCacheEntryReferenceStatics.anInt10432)
                            }
                            if (RsaVarbitHandlerStatics.aFrame4904 === container) {
                                val insets = RsaVarbitHandlerStatics.aFrame4904!!.getInsets()
                                ParticleSystemRendererStatics.aCanvas3869!!.setLocation(insets.left - -ModelResourceBundleStatics.anInt7129, TimingCounters.anInt4167 + insets.top)
                            } else ParticleSystemRendererStatics.aCanvas3869!!.setLocation((ModelResourceBundleStatics.anInt7129), TimingCounters.anInt4167)
                            if (RenderNodeStatics.anInt9721 != -1) method1713(true, 520)
                            ScreenBorderFiller.method1170((-78).toByte())
                        } else {
                            /* empty */
                        }
                    }
                }
            }
    
            @JvmStatic
            fun method3557(bool: Boolean) {
                anIntArray7397 = null
                aLongHashTable_7415 = null
                if (bool == true) {
                    aIntRange_7398 = null
                    aByteArray7394 = null
                }
            }
}
