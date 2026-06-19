import SoundBankPatchStatics.method2929
import GameClock.method599
import jaggl.OpenGLStatics.glCompileShaderARB
import jaggl.OpenGLStatics.glCreateShaderObjectARB
import jaggl.OpenGLStatics.glDeleteObjectARB
import jaggl.OpenGLStatics.glGetInfoLogARB
import jaggl.OpenGLStatics.glGetObjectParameterivARB
import jaggl.OpenGLStatics.glShaderSourceARB
import java.math.BigInteger

object TimedTileQueueEntryStatics {
    var anInt9646: Int = 0
            var anInt9647: Int = 0
            var anInt9648: Int = 0
            var anInt9649: Int = 0
            var anInt9653: Int = 0
            var anInt9655: Int = 0
            var anInt9656: Int = 0
            var aBigInteger9657: BigInteger? = LoaderStatics.FILE_SERVER_RSA_MODULUS
            var aAbstractModelRenderer_9658: AbstractModelRenderer? = null
            var aAbstractModelRenderer_9659: AbstractModelRenderer? = null
            var aConnectionStateType_9660: ConnectionStateType? = null
    
            @JvmStatic
            fun method3247(i: Int) {
                if (i > -49) method3247(49)
                aConnectionStateType_9660 = null
                aAbstractModelRenderer_9658 = null
                aAbstractModelRenderer_9659 = null
                aBigInteger9657 = null
            }
    
            fun method3249(i: Int, i_0_: Int, var_ha_Sub2: OpenGlRenderer?, string: String?): ManagedGlResource? {
                try {
                    anInt9656++
                    val i_1_ = -89 / ((29 - i_0_) / 47)
                    val l = glCreateShaderObjectARB(i)
                    glShaderSourceARB(l, string)
                    glCompileShaderARB(l)
                    glGetObjectParameterivARB(l, 35713, (ShortMatrixNodeStatics.anIntArray9519), 0)
                    if (ShortMatrixNodeStatics.anIntArray9519!![0] == 0) {
                        if (ShortMatrixNodeStatics.anIntArray9519!![0] == 0) println("Shader compile failed:")
                        glGetObjectParameterivARB(l, 35716, (ShortMatrixNodeStatics.anIntArray9519), 1)
                        if (ShortMatrixNodeStatics.anIntArray9519!![1] > 1) {
                            val `is` = ByteArray(ShortMatrixNodeStatics.anIntArray9519!![1])
                            glGetInfoLogARB(l, (ShortMatrixNodeStatics.anIntArray9519!![1]), ShortMatrixNodeStatics.anIntArray9519, 0, `is`, 0)
                            println(String(`is`))
                        }
                        if (ShortMatrixNodeStatics.anIntArray9519!![0] == 0) {
                            glDeleteObjectARB(l)
                            return null
                        }
                    }
                    return ManagedGlResource(var_ha_Sub2, l, i)
                } catch (runtimeexception: RuntimeException) {
                    throw method2929(runtimeexception, ("et.G(" + i + ',' + i_0_ + ',' + (if (var_ha_Sub2 != null) "{...}" else "null") + ',' + (if (string != null) "{...}" else "null") + ')'))
                }
            }
}
