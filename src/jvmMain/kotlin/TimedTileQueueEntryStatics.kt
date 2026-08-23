import jaggl.OpenGL.Companion.glCompileShaderARB
import jaggl.OpenGL.Companion.glCreateShaderObjectARB
import jaggl.OpenGL.Companion.glDeleteObjectARB
import jaggl.OpenGL.Companion.glGetInfoLogARB
import jaggl.OpenGL.Companion.glGetObjectParameterivARB
import jaggl.OpenGL.Companion.glShaderSourceARB

object TimedTileQueueEntryStatics {
    var anInt9655: Int = 0
    var anInt9656: Int = 0
    var aBigInteger9657: BigInt? = Loader.FILE_SERVER_RSA_MODULUS
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
            throw TextureLoadException.method2929(runtimeexception, ("et.G(" + i + ',' + i_0_ + ',' + (if (var_ha_Sub2 != null) "{...}" else "null") + ',' + (if (string != null) "{...}" else "null") + ')'))
        }
    }
}
