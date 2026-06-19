import SceneEntityModelStatics.method2502
import jaggl.OpenGLStatics.glCompileShaderARB
import jaggl.OpenGLStatics.glCreateShaderObjectARB
import jaggl.OpenGLStatics.glDeleteObjectARB
import jaggl.OpenGLStatics.glGetInfoLogARB
import jaggl.OpenGLStatics.glGetObjectParameterivARB
import jaggl.OpenGLStatics.glShaderSourceRawARB

object ShaderObjectStatics {
    var anInt4099: Int = 0
            var anInt4100: Int = 0
            var anInt4101: Int = 0
    
            fun method2608(glRenderDevice: GlRenderDevice?, `is`: ByteArray?, i: Int, i_0_: Int): GlShaderObjectHandle? {
                try {
                    anInt4099++
                    if (`is` == null || `is`.size == 0) return null
                    val l = glCreateShaderObjectARB(i_0_)
                    glShaderSourceRawARB(l, `is`)
                    glCompileShaderARB(l)
                    if (i > -95) method2608(null, null, -27, 75)
                    glGetObjectParameterivARB(l, 35713, (DirectionalStripeTextureNodeStatics.anIntArray9096), 0)
                    if (DirectionalStripeTextureNodeStatics.anIntArray9096!![0] == 0) {
                        if (DirectionalStripeTextureNodeStatics.anIntArray9096!![0] == 0) println("Shader compile failed:")
                        glGetObjectParameterivARB(l, 35716, (DirectionalStripeTextureNodeStatics.anIntArray9096), 1)
                        if (DirectionalStripeTextureNodeStatics.anIntArray9096!![1] > 1) {
                            val is_1_ = ByteArray(DirectionalStripeTextureNodeStatics.anIntArray9096!![1])
                            glGetInfoLogARB(l, (DirectionalStripeTextureNodeStatics.anIntArray9096!![1]), DirectionalStripeTextureNodeStatics.anIntArray9096, 0, is_1_, 0)
                            println(String(is_1_))
                        }
                        if (DirectionalStripeTextureNodeStatics.anIntArray9096!![0] == 0) {
                            glDeleteObjectARB(l)
                            return null
                        }
                    }
                    return GlShaderObjectHandle(glRenderDevice, l, i_0_)
                } catch (runtimeexception: RuntimeException) {
                    throw SoundBankPatchStatics.method2929(runtimeexception, ("dea.E(" + (if (glRenderDevice != null) "{...}" else "null") + ',' + (if (`is` != null) "{...}" else "null") + ',' + i + ',' + i_0_ + ')'))
                }
            }
    
            fun method2609(i: Int, i_2_: Int): MinimapAreaMarkerNode? {
                anInt4101++
                var class348_sub42_sub19 = (ImageFrameCacheStatics.aCacheLruCache_4036!!.method2302(i_2_.toLong(), (-68).toByte()) as MinimapAreaMarkerNode?)
                if (class348_sub42_sub19 != null) return class348_sub42_sub19
                val `is` = CameraNodeListStatics.aJs5Archive_1743!!.method410(-1860, i_2_, 0)
                if (`is` == null || `is`.size <= 1) return null
                try {
                    class348_sub42_sub19 = method2502(`is`, -104)
                } catch (exception: Exception) {
                    throw RuntimeException(exception.message + " S: " + i_2_)
                }
                if (i > -103) return null
                ImageFrameCacheStatics.aCacheLruCache_4036!!.method2305(i_2_.toLong(), class348_sub42_sub19, -1)
                return class348_sub42_sub19
            }
}
