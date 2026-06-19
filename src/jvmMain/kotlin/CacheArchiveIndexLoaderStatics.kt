import AbstractFrameBufferSurfaceStatics.method3013
import SpriteComponentStatics.method200
import java.awt.Point

object CacheArchiveIndexLoaderStatics {
    @JvmField
            var anInt456: Int = 0
            @JvmField
            var anInt457: Int = 0
            @JvmField
            var anInt459: Int = 0
            @JvmField
            var anInt461: Int = 0
    
            @JvmStatic
            fun method338(i: Int, i_0_: Int) {
                var i_0_ = i_0_
                if (i == IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub22_7253!!.method1815(-32350)) i_0_ = -1
                anInt456++
                if (i_0_ != GlShaderProgramHandleStatics.anInt4179) {
                    if (i_0_ != -1) {
                        val class222 = GraphicsOptionStateStatics.aItemDefinitionLoader_3147!!.method1287((-104).toByte(), i_0_)
                        val class207 = class222.method1610(71.toByte())
                        if (class207 == null) i_0_ = -1
                        else {
                            VorbisOggDecoderStatics.aPrivilegedOperationWorker_8992!!.method2238(class207.method1522(), class207.method1516(), 17, Point(class222.anInt2883, class222.anInt2890), ParticleSystemRendererStatics.aCanvas3869, class207.method1510())
                            GlShaderProgramHandleStatics.anInt4179 = i_0_
                        }
                    }
                    if (i_0_ == -1 && GlShaderProgramHandleStatics.anInt4179 != -1) {
                        VorbisOggDecoderStatics.aPrivilegedOperationWorker_8992!!.method2238(-1, null, i + 17, Point(), (ParticleSystemRendererStatics.aCanvas3869), -1)
                        GlShaderProgramHandleStatics.anInt4179 = -1
                    }
                }
            }
    
            fun method339(i: Int, i_1_: Int, `is`: ByteArray, i_2_: Int, i_3_: Int, i_4_: Int) {
                var i = i
                var i_2_ = i_2_
                anInt461++
                if (i_4_ > i_1_) {
                    i += i_1_
                    i_2_ = -i_1_ + i_4_ shr 2
                    while (--i_2_ >= 0) {
                        `is`[i++] = 1.toByte()
                        `is`[i++] = 1.toByte()
                        `is`[i++] = 1.toByte()
                        `is`[i++] = 1.toByte()
                    }
                    if (i_3_ == 1354705384) {
                        i_2_ = 0x3 and i_4_ - i_1_
                        while (--i_2_ >= 0) `is`[i++] = 1.toByte()
                    }
                }
            }
    
            @JvmStatic
            fun method340(i: Int, i_5_: Byte): Int {
                var i = i
                anInt459++
                i = --i or (i ushr 1)
                i = i or (i ushr 2)
                i = i or (i ushr 4)
                if (i_5_.toInt() != 108) return 34
                i = i or (i ushr 8)
                i = i or (i ushr 16)
                return 1 + i
            }
}
