import kotlin.jvm.JvmStatic
import jaggl.OpenGL.Companion.glBindProgramARB
import jaggl.OpenGL.Companion.glGenProgramARB
import jaggl.OpenGL.Companion.glGetIntegerv
import jaggl.OpenGL.Companion.glProgramStringARB

/*
 * Class50
 */
abstract class MinimapShapeDrawer(@JvmField var anInt864: Int, @JvmField var anInt865: Int, @JvmField var anInt862: Int) {
    abstract fun method455(i: Int, i_0_: Int, i_1_: Int)

    abstract fun method456(i: Int, i_2_: Int, i_3_: Int)

    abstract fun method457(i: Int, i_4_: Int, i_5_: Int)

    companion object {

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
}
