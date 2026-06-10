import Class318_Sub4.Companion.method2502
import jaggl.OpenGL.Companion.glCompileShaderARB
import jaggl.OpenGL.Companion.glCreateShaderObjectARB
import jaggl.OpenGL.Companion.glDeleteObjectARB
import jaggl.OpenGL.Companion.glGetInfoLogARB
import jaggl.OpenGL.Companion.glGetObjectParameterivARB
import jaggl.OpenGL.Companion.glShaderSourceRawARB

open class Class328 {
    companion object {
        var anInt4099: Int = 0
        var anInt4100: Int = 0
        var anInt4101: Int = 0

        fun method2608(class377: Class377?, `is`: ByteArray?, i: Int, i_0_: Int): Class39? {
            try {
                anInt4099++
                if (`is` == null || `is`.size == 0) return null
                val l = glCreateShaderObjectARB(i_0_)
                glShaderSourceRawARB(l, `is`)
                glCompileShaderARB(l)
                if (i > -95) method2608(null, null, -27, 75)
                glGetObjectParameterivARB(l, 35713, (Class348_Sub40_Sub2.anIntArray9096), 0)
                if (Class348_Sub40_Sub2.anIntArray9096!![0] == 0) {
                    if (Class348_Sub40_Sub2.anIntArray9096!![0] == 0) println("Shader compile failed:")
                    glGetObjectParameterivARB(l, 35716, (Class348_Sub40_Sub2.anIntArray9096), 1)
                    if (Class348_Sub40_Sub2.anIntArray9096!![1] > 1) {
                        val is_1_ = ByteArray(Class348_Sub40_Sub2.anIntArray9096!![1])
                        glGetInfoLogARB(l, (Class348_Sub40_Sub2.anIntArray9096!![1]), Class348_Sub40_Sub2.anIntArray9096, 0, is_1_, 0)
                        println(String(is_1_))
                    }
                    if (Class348_Sub40_Sub2.anIntArray9096!![0] == 0) {
                        glDeleteObjectARB(l)
                        return null
                    }
                }
                return Class39(class377, l, i_0_)
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, ("dea.E(" + (if (class377 != null) "{...}" else "null") + ',' + (if (`is` != null) "{...}" else "null") + ',' + i + ',' + i_0_ + ')'))
            }
        }

        fun method2609(i: Int, i_2_: Int): Class348_Sub42_Sub19? {
            anInt4101++
            var class348_sub42_sub19 = (Class322.aClass308_4036!!.method2302(i_2_.toLong(), (-68).toByte()) as Class348_Sub42_Sub19?)
            if (class348_sub42_sub19 != null) return class348_sub42_sub19
            val `is` = Class113.aClass45_1743!!.method410(-1860, i_2_, 0)
            if (`is` == null || `is`.size <= 1) return null
            try {
                class348_sub42_sub19 = method2502(`is`, -104)
            } catch (exception: Exception) {
                throw RuntimeException(exception.message + " S: " + i_2_)
            }
            if (i > -103) return null
            Class322.aClass308_4036!!.method2305(i_2_.toLong(), class348_sub42_sub19, -1)
            return class348_sub42_sub19
        }
    }
}
