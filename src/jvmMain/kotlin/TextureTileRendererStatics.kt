import BoundsConstraintEntryStatics.method2057
import jaclib.memory.Stream
import jaclib.memory.heap.NativeHeapBuffer
import jaggl.OpenGLStatics.glMatrixMode
import jaggl.OpenGLStatics.glPopMatrix
import jaggl.OpenGLStatics.glPushMatrix
import jaggl.OpenGLStatics.glScalef

object TextureTileRendererStatics {
    var anInt6827: Int = 0
            var anInt6828: Int = 0
            var anInt6829: Int = 0
            var anIntArray6830: IntArray? = intArrayOf(16, 32, 64, 128)
            var anInt6834: Int = 0
            var aFloat6835: Float = 0f
            var anInt6836: Int = 0
            var anInt6837: Int = 0
            var anInt6838: Int = 0
            var anInt6845: Int = 0
            fun method2947(bool: Boolean, i: Int, i_4_: Int, i_5_: Int, i_6_: Int, i_7_: Int) {
                anInt6837++
                if (bool != true) method2950(121)
                if (IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub26_7272!!.method1838(-32350) != 0 && i_5_ != 0 && HintArrowOrMessageStatics.anInt2021 < 50 && i_4_ != -1) GlTextureCubeMapStatics.aParticleEmitterNodeArray8531s!![HintArrowOrMessageStatics.anInt2021++] = ParticleEmitterNode(1.toByte(), i_4_, i_5_, i_6_, i, 0, i_7_, null)
            }
    
            @JvmStatic
            fun method2950(i: Int) {
                if (i <= 37) aFloat6835 = 2.1337976f
                anIntArray6830 = null
            }
    
            fun method2953(i: Byte) {
                if (i > -102) anIntArray6830 = null
                anInt6836++
                if (WorldMapRendererStatics.anInt4674 == 3) ByteBufferStatics.method3379(2, 4)
                else if (WorldMapRendererStatics.anInt4674 != 7) {
                    if (WorldMapRendererStatics.anInt4674 == 10) ByteBufferStatics.method3379(2, 11)
                } else ByteBufferStatics.method3379(2, 8)
            }
}
