import jaggl.OpenGLStatics.glAttachObjectARB
import jaggl.OpenGLStatics.glCreateProgramObjectARB
import jaggl.OpenGLStatics.glDeleteObjectARB
import jaggl.OpenGLStatics.glDetachObjectARB
import jaggl.OpenGLStatics.glGetInfoLogARB
import jaggl.OpenGLStatics.glGetObjectParameterivARB
import jaggl.OpenGLStatics.glLinkProgramARB
import java.util.*
import kotlin.math.sin

object FontStatics {
    @JvmField
            var anInt4045: Int = 0
            @JvmField
            var anInt4046: Int = 0
            @JvmField
            var anInt4047: Int = 0
            @JvmField
            var anInt4049: Int = 0
            @JvmField
            var anInt4050: Int = 0
            @JvmField
            var anInt4051: Int = 0
            @JvmField
            var anInt4052: Int = 0
            @JvmField
            var anInt4053: Int = 0
            @JvmField
            var anInt4054: Int = 0
            @JvmField
            var anInt4055: Int = 0
            @JvmField
            var anInt4056: Int = 0
            @JvmField
            var anInt4057: Int = 0
            @JvmField
            var anInt4058: Int = 0
            @JvmField
            var anInt4059: Int = 0
            @JvmField
            var anInt4060: Int = 0
            @JvmField
            var anInt4061: Int = 0
            @JvmField
            var aRectangleRegion_4062: RectangleRegion? = RectangleRegion(2, 4, 4, 0)
            @JvmField
            var anInt4064: Int = 0
            @JvmField
            var anInt4065: Int = 0
    
            @JvmStatic
            fun method2570(i: Int, i_45_: Int): WidgetComponent? {
                anInt4055++
                if (i != 1512932720) return null
                val i_46_ = i_45_ shr 16
                val i_47_ = i_45_ and 0xffff
                if (WarpTextureNodeStatics.aWidgetComponentArrayArray9427!![i_46_] == null || (WarpTextureNodeStatics.aWidgetComponentArrayArray9427!![i_46_]!![i_47_] == null)) {
                    val bool = TextureLoaderUtil.method2547(i_46_, 84.toByte())
                    if (!bool) return null
                }
                return WarpTextureNodeStatics.aWidgetComponentArrayArray9427!![i_46_]!![i_47_]
            }
    
            @JvmStatic
            fun method2572(i: Byte) {
                aRectangleRegion_4062 = null
                if (i.toInt() != 23) aRectangleRegion_4062 = null
            }
    
            @JvmStatic
            fun method2582(glRenderDevice: GlRenderDevice?, glShaderObjectHandles: Array<GlShaderObjectHandle?>?, i: Int): NativeBufferHandle? {
                try {
                    anInt4065++
                    if (i != -2113) aRectangleRegion_4062 = null
                    var i_100_ = 0
                    while (glShaderObjectHandles!!.size > i_100_) {
                        if (glShaderObjectHandles[i_100_] == null || glShaderObjectHandles[i_100_]!!.aLong517 <= 0) return null
                        i_100_++
                    }
                    val l = glCreateProgramObjectARB()
                    var i_101_ = 0
                    while (glShaderObjectHandles.size > i_101_) {
                        glAttachObjectARB(l, (glShaderObjectHandles[i_101_]!!.aLong517))
                        i_101_++
                    }
                    glLinkProgramARB(l)
                    glGetObjectParameterivARB(l, 35714, SoundEnvelopeStatics.anIntArray2744, 0)
                    if (SoundEnvelopeStatics.anIntArray2744!![0] == 0) {
                        if (SoundEnvelopeStatics.anIntArray2744!![0] == 0) println("Shader linking failed:")
                        glGetObjectParameterivARB(l, 35716, SoundEnvelopeStatics.anIntArray2744, 1)
                        if (SoundEnvelopeStatics.anIntArray2744!![1] > 1) {
                            val `is` = ByteArray(SoundEnvelopeStatics.anIntArray2744!![1])
                            glGetInfoLogARB(l, SoundEnvelopeStatics.anIntArray2744!![1], SoundEnvelopeStatics.anIntArray2744, 0, `is`, 0)
                            println(String(`is`))
                        }
                        if (SoundEnvelopeStatics.anIntArray2744!![0] == 0) {
                            var i_102_ = 0
                            while (glShaderObjectHandles.size > i_102_) {
                                glDetachObjectARB(l, (glShaderObjectHandles[i_102_]!!.aLong517))
                                i_102_++
                            }
                            glDeleteObjectARB(l)
                            return null
                        }
                    }
                    return NativeBufferHandle(glRenderDevice, l, glShaderObjectHandles)
                } catch (runtimeexception: RuntimeException) {
                    throw SoundBankPatchStatics.method2929(runtimeexception, ("da.M(" + (if (glRenderDevice != null) "{...}" else "null") + ',' + (if (glShaderObjectHandles != null) "{...}" else "null") + ',' + i + ')'))
                }
            }
}
