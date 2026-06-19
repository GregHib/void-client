import LinkedListIteratorStatics.method1241
import BooleanGraphicsOptionStateStatics.method1722
import SoundBankPatchStatics.method2929
import NpcReferenceStatics.method2959
import GlShadowRenderPassStatics.method3553
import GameClock.method599
import RasterSpriteStatics.method166

object OutgoingPacketNodeStatics {
    var anInt7117: Int = 0
            var anInt7120: Int = 0
            var anInt7121: Int = 0
            var anInt7123: Int = 0
            var aIntRange_7124: IntRange? = IntRange(62, 4)
            @JvmField
            var anInt7125: Int = 1406
    
            @JvmStatic
            fun method3323(i: Int) {
                val i_0_ = -14 / ((73 - i) / 51)
                aIntRange_7124 = null
            }
    
            fun method3324(var_renderer: Renderer?, i: Byte, l: Long) {
                do {
                    try {
                        ObjectSpawnDecoder.anInt1803 = 0
                        MapArchiveSourceStatics.anInt4797 = SkyboxGradient.anInt3936
                        WallEntityStatics.anInt8780 = 0
                        anInt7120++
                        SkyboxGradient.anInt3936 = 0
                        val l_1_ = method599(-53)
                        var class318_sub10 = GzipDecompressorStatics.aDoublyLinkedNodeList_2077!!.method1872(8) as SceneGraphContainer?
                        if (i > 40) {
                            while ( /**/class318_sub10 != null) {
                                if (class318_sub10.method2535(var_renderer, l)) WallEntityStatics.anInt8780++
                                class318_sub10 = GzipDecompressorStatics.aDoublyLinkedNodeList_2077!!.method1878((-64).toByte()) as SceneGraphContainer?
                            }
                            if (!PcmStreamBufferStatics.aBoolean8874 || l % 100L != 0L) break
                            println("Particle system count: " + GzipDecompressorStatics.aDoublyLinkedNodeList_2077!!.method1874(0) + ", running: " + WallEntityStatics.anInt8780)
                            println("Emitters: " + ObjectSpawnDecoder.anInt1803 + " Particles: " + SkyboxGradient.anInt3936 + ". Time taken: " + (-l_1_ + method599(-112)) + "ms")
                        }
                    } catch (runtimeexception: RuntimeException) {
                        throw method2929(runtimeexception, ("wm.A(" + (if (var_renderer != null) "{...}" else "null") + ',' + i + ',' + l + ')'))
                    }
                    break
                } while (false)
            }
    
            fun method3325(i: Int, i_2_: Int, bool: Boolean): Boolean {
                if (bool != true) return false
                anInt7121++
                return ((((0x2000 and i) != 0) or method1241(i_2_, i, -118) or method1722(i, i_2_, 94.toByte())) and method166(105.toByte(), i_2_, i))
            }
    
            @JvmStatic
            fun method3327(i: Int) {
                if (i == 1406) {
                    if (FacingDirectionNodeStatics.aRenderer6654!!.method3694()) {
                        FacingDirectionNodeStatics.aRenderer6654!!.method3701(ParticleSystemRendererStatics.aCanvas3869)
                        method2959(-1)
                        if (!GrayscaleNoiseTextureStatics.aBoolean5300) {
                            val dimension = ParticleSystemRendererStatics.aCanvas3869!!.getSize()
                            FacingDirectionNodeStatics.aRenderer6654!!.method3643(ParticleSystemRendererStatics.aCanvas3869, dimension.width, dimension.height)
                        } else ModelDefinitionStatics.method1108((-99).toByte(), ParticleSystemRendererStatics.aCanvas3869!!)
                        FacingDirectionNodeStatics.aRenderer6654!!.method3677(ParticleSystemRendererStatics.aCanvas3869)
                    } else method3553(false, 100.toByte(), IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub25_7271!!.method1829(-32350))
                    anInt7123++
                    TextureCacheStatics.method3466(i + -1347)
                    PcmStreamBufferStatics.aBoolean8870 = true
                }
            }
}
