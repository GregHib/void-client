import jaclib.memory.Stream
import jaggl.OpenGLStatics.glLoadMatrixf
import jaggl.OpenGLStatics.glMatrixMode
import jaggl.OpenGLStatics.glPopMatrix
import jaggl.OpenGLStatics.glPushMatrix
import jaggl.OpenGLStatics.glTranslatef
import java.io.IOException
import kotlin.math.sqrt

object OpenGlTerrainTileStatics {
    @JvmField
            var anInt8236: Int = 0
            @JvmField
            var anInt8237: Int = 0
            @JvmField
            var anInt8238: Int = 0
            @JvmField
            var anInt8239: Int = 0
            @JvmField
            var aLinkedNodeListIterator_8241: LinkedNodeListIterator? = LinkedNodeListIterator()
            @JvmField
            var anInt8242: Int = 0
            @JvmField
            var anInt8244: Int = 0
            @JvmField
            var anInt8247: Int = 0
            @JvmField
            var anInt8248: Int = 0
            @JvmField
            var anInt8249: Int = 0
            @JvmField
            var anInt8250: Int = 0
            @JvmField
            var anInt8251: Int = 0
            @JvmField
            var anInt8254: Int = 0
            @JvmField
            var anInt8255: Int = 0
            @JvmField
            var anInt8259: Int = 0
            @JvmField
            var anInt8261: Int = 0
            @JvmField
            var anInt8262: Int = 0
            @JvmField
            var anInt8263: Int = 0
            @JvmField
            var aString8265: String? = null
            @JvmField
            var anIntArray8269: IntArray?
            @JvmField
            var anInt8270: Int = -1
            @JvmField
            var anInt8271: Int = 0
            @JvmStatic
            fun method3999(i: Int, i_147_: Int, i_148_: Int): Boolean {
                if (i_148_ != 458752) anInt8237 = -28
                anInt8238++
                return ((0x70000 and i_147_) != 0) or ProjectileFactoryStatics.method1613(false, i, i_147_) || ParticleEmitterDefStatics.method2187(i_147_, -121, i)
            }
    
            @JvmStatic
            fun method4000(i: Int) {
                if (i != 8448) aString8265 = null
                anIntArray8269 = null
                aString8265 = null
                aLinkedNodeListIterator_8241 = null
            }
    
            @JvmStatic
            fun method4001(class318_sub1: SceneEntity) {
                NativeLibraryState.aRenderer171!!.H(class318_sub1.x, (class318_sub1.anInt6382 + (class318_sub1.method2394(true) shr 1)), class318_sub1.y, LoadingScreenImageNodeStatics.anIntArray9505)
                class318_sub1.anInt6386 = LoadingScreenImageNodeStatics.anIntArray9505!![0]
                class318_sub1.anInt6380 = LoadingScreenImageNodeStatics.anIntArray9505!![1]
                class318_sub1.anInt6389 = LoadingScreenImageNodeStatics.anIntArray9505!![2]
            }
    
            @JvmStatic
            fun method4002(class348_sub49: ByteBuffer, i: Byte) {
                anInt8248++
                val `is` = ByteArray(24)
                if (i.toInt() == 55) {
                    if (BufferedFileReader.aBufferedRandomAccessFile_4538 != null) {
                        try {
                            BufferedFileReader.aBufferedRandomAccessFile_4538!!.method789(0L, (-120).toByte())
                            BufferedFileReader.aBufferedRandomAccessFile_4538!!.method784(-89, `is`)
                            var i_170_: Int
                            i_170_ = 0
                            while (i_170_ < 24) {
                                if (`is`[i_170_].toInt() != 0) break
                                i_170_++
                            }
                            if (i_170_ >= 24) throw IOException()
                        } catch (exception: Exception) {
                            var i_171_ = 0
                            while (i_171_ < 24) {
                                `is`[i_171_] = (-1).toByte()
                                i_171_++
                            }
                        }
                    }
                    class348_sub49.writeBytes(24, 0, `is`, i.toInt() xor 0x8)
                }
            }
    
            init {
                anIntArray8269 = IntArray(8)
            }
}
