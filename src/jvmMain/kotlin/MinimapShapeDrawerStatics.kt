import jaggl.OpenGL.Companion.glBindProgramARB
import jaggl.OpenGL.Companion.glGenProgramARB
import jaggl.OpenGL.Companion.glGetIntegerv
import jaggl.OpenGL.Companion.glProgramStringARB

object MinimapShapeDrawerStatics {
    var anInt861: Int = 0

    var aString863: String? = null

    @JvmStatic
    fun method458(i: Int) {
        if (i != -14487) method459(-97, null, null, true)
        aString863 = null
    }

    @JvmStatic
    fun method459(i: Int, var_ha_Sub2: OpenGlRenderer?, string: String?, bool: Boolean): RefCountedHandle? {
        try {
            anInt861++
            val i_6_ = glGenProgramARB()
            glBindProgramARB(i, i_6_)
            if (bool != false) return null
            glProgramStringARB(i, 34933, string)
            glGetIntegerv(34379, ProducerImageSurface.anIntArray9069, 0)
            if (ProducerImageSurface.anIntArray9069!![0] != -1) {
                glBindProgramARB(i, 0)
                return null
            }
            glBindProgramARB(i, 0)
            return RefCountedHandle(var_ha_Sub2!!, i, i_6_)
        } catch (runtimeexception: RuntimeException) {
            throw TextureLoadException.method2929(runtimeexception, ("iu.I(" + i + ',' + (if (var_ha_Sub2 != null) "{...}" else "null") + ',' + (if (string != null) "{...}" else "null") + ',' + bool + ')'))
        }
    }
}
