import LinkedListIterator.Companion.method1241
import BooleanGraphicsOptionState.Companion.method1722
import NpcReference.Companion.method2959
import GlTexture2DRegion.Companion.method3553
import GameClock.method599
import ModelDefinition.Companion.method1096
import RasterSprite.Companion.method166
import java.awt.Canvas

class OutgoingPacketNode : LinkedListNode() {
    var aClass348_Sub49_Sub2_7116: CipheredPacketBuffer? = null
    var aOutgoingPacketHeader_7118: OutgoingPacketHeader? = null
    var anInt7119: Int = 0
    var anInt7122: Int = 0
    fun method3326(i: Byte) {
        anInt7117++
        if (PingHostListHolder.aClass348_Sub47Array2334!!.size > GroundDecorOptionState.anInt5980 && i.toInt() == -45) PingHostListHolder.aClass348_Sub47Array2334!![GroundDecorOptionState.anInt5980++] = this
    }

    companion object {
        var anInt7117: Int = 0
        var anInt7120: Int = 0
        var anInt7121: Int = 0
        var anInt7123: Int = 0

        var anInt7125: Int = 1406

        @JvmStatic
        fun method3323(i: Int) {
            val i_0_ = -14 / ((73 - i) / 51)
            InboundPacketHeader.aInboundPacketHeader_7124 = null
        }

        fun method3324(var_renderer: Renderer?, i: Byte, l: Long) {
            do {
                try {
                    ObjectSpawnDecoder.anInt1803 = 0
                    MapArchiveSource.anInt4797 = SkyboxGradient.anInt3936
                    WallEntity.anInt8780 = 0
                    anInt7120++
                    SkyboxGradient.anInt3936 = 0
                    val l_1_ = method599(-53)
                    var class318_sub10 = OpenGlModel.aDoublyLinkedNodeList_2077!!.method1872(8) as SceneGraphContainer?
                    if (i > 40) {
                        while ( /**/class318_sub10 != null) {
                            if (class318_sub10.method2535(var_renderer, l)) WallEntity.anInt8780++
                            class318_sub10 = OpenGlModel.aDoublyLinkedNodeList_2077!!.method1878((-64).toByte()) as SceneGraphContainer?
                        }
                        if (!PcmStreamBuffer.aBoolean8874 || l % 100L != 0L) break
                        println("Particle system count: " + OpenGlModel.aDoublyLinkedNodeList_2077!!.method1874(0) + ", running: " + WallEntity.anInt8780)
                        println("Emitters: " + ObjectSpawnDecoder.anInt1803 + " Particles: " + SkyboxGradient.anInt3936 + ". Time taken: " + (-l_1_ + method599(-112)) + "ms")
                    }
                } catch (runtimeexception: RuntimeException) {
                    throw TextureLoadException.method2929(runtimeexception, ("wm.A(" + (if (var_renderer != null) "{...}" else "null") + ',' + i + ',' + l + ')'))
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
                    FacingDirectionNodeStatics.aRenderer6654!!.method3701(ParticleSystemRenderer.aCanvas3869)
                    method2959(-1)
                    if (!GrayscaleNoiseTexture.aBoolean5300) {
                        val dimension = ParticleSystemRenderer.aCanvas3869!!.getSize()
                        FacingDirectionNodeStatics.aRenderer6654!!.method3643(ParticleSystemRenderer.aCanvas3869, dimension.width, dimension.height)
                    } else method1108((-99).toByte(), ParticleSystemRenderer.aCanvas3869!!)
                    FacingDirectionNodeStatics.aRenderer6654!!.method3677(ParticleSystemRenderer.aCanvas3869)
                } else method3553(false, 100.toByte(), IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub25_7271!!.method1829(-32350))
                anInt7123++
                TextureCache.method3466(i + -1347)
                PcmStreamBuffer.aBoolean8870 = true
            }
        }

        var anInt1850: Int = 0
        @JvmStatic
        fun method1108(i: Byte, canvas: Canvas) {
            anInt1850++
            val dimension = canvas.getSize()
            if (i.toInt() != -99) method1096(57)
            MinimapFlagRenderer.method828(38.toByte(), dimension.height, dimension.width)
            if (WhirlpoolHash.anInt7207 != 1) CameraRotationStubStatics.aRenderer326!!.method3643(canvas, WhirlpoolHash.anInt5283, WhirlpoolHash.anInt1651)
            else CameraRotationStubStatics.aRenderer326!!.method3643(canvas, WhirlpoolHash.anInt8854, WhirlpoolHash.anInt6008)
        }
    }
}
