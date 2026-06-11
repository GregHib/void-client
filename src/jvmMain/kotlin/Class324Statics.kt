import jaggl.OpenGL.Companion.glAttachObjectARB
import jaggl.OpenGL.Companion.glCreateProgramObjectARB
import jaggl.OpenGL.Companion.glDeleteObjectARB
import jaggl.OpenGL.Companion.glDetachObjectARB
import jaggl.OpenGL.Companion.glGetInfoLogARB
import jaggl.OpenGL.Companion.glGetObjectParameterivARB
import jaggl.OpenGL.Companion.glLinkProgramARB

/**
 * JVM-only statics extracted from Class324's companion.
 * Contains OpenGL shader-linking logic (jaggl) that cannot live in commonMain.
 */
object Class324Statics {
    @JvmStatic
    fun method2582(class377: Class377?, class39s: Array<Class39?>?, i: Int): Class89? {
        try {
            Class324.anInt4065++
            if (i != -2113) Class324.aClass138_4062 = null
            var i_100_ = 0
            while (class39s!!.size > i_100_) {
                if (class39s[i_100_] == null || class39s[i_100_]!!.aLong517 <= 0) return null
                i_100_++
            }
            val l = glCreateProgramObjectARB()
            var i_101_ = 0
            while (class39s.size > i_101_) {
                glAttachObjectARB(l, (class39s[i_101_]!!.aLong517))
                i_101_++
            }
            glLinkProgramARB(l)
            glGetObjectParameterivARB(l, 35714, Class211.anIntArray2744, 0)
            if (Class211.anIntArray2744!![0] == 0) {
                if (Class211.anIntArray2744!![0] == 0) println("Shader linking failed:")
                glGetObjectParameterivARB(l, 35716, Class211.anIntArray2744, 1)
                if (Class211.anIntArray2744!![1] > 1) {
                    val `is` = ByteArray(Class211.anIntArray2744!![1])
                    glGetInfoLogARB(l, Class211.anIntArray2744!![1], Class211.anIntArray2744, 0, `is`, 0)
                    println(String(`is`))
                }
                if (Class211.anIntArray2744!![0] == 0) {
                    var i_102_ = 0
                    while (class39s.size > i_102_) {
                        glDetachObjectARB(l, (class39s[i_102_]!!.aLong517))
                        i_102_++
                    }
                    glDeleteObjectARB(l)
                    return null
                }
            }
            return Class89(class377, l, class39s)
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("da.M(" + (if (class377 != null) "{...}" else "null") + ',' + (if (class39s != null) "{...}" else "null") + ',' + i + ')'))
        }
    }
}
