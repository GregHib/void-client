import Class348_Sub17.Companion.method2929
import Class62.method599
import jaggl.OpenGL.Companion.glCompileShaderARB
import jaggl.OpenGL.Companion.glCreateShaderObjectARB
import jaggl.OpenGL.Companion.glDeleteObjectARB
import jaggl.OpenGL.Companion.glGetInfoLogARB
import jaggl.OpenGL.Companion.glGetObjectParameterivARB
import jaggl.OpenGL.Companion.glShaderSourceARB
import java.math.BigInteger

class Class348_Sub42_Sub15 internal constructor(i: Int, i_2_: Int) : Class348_Sub42() {
    var anInt9650: Int = 0
    var anInt9651: Int = 0
    @JvmField
    var anInt9652: Int = 0
    var aString9654: String? = null
    fun method3245(bool: Boolean): Int {
        anInt9646++
        if (bool != true) method3248(-60)
        return (this.aLong4291 ushr 32 and 0xffL).toInt()
    }

    fun method3246(i: Int) {
        this.aLong7057 = this.aLong7057 or 0x7fffffffffffffffL.inv()
        anInt9653++
        if (method3250((-89).toByte()) == 0L) Class367_Sub4.aClass107_7325!!.method1005(true, this)
        if (i != -25490) aClass105_9659 = null
    }

    fun method3248(i: Int): Int {
        if (i != 1) return -110
        anInt9647++
        return this.aLong4291.toInt()
    }

    fun method3250(i: Byte): Long {
        anInt9649++
        if (i >= -37) method3250(79.toByte())
        return this.aLong7057 and 0x7fffffffffffffffL
    }

    init {
        this.aLong4291 = i.toLong() shl 32 or i_2_.toLong()
    }

    fun method3251(i: Int) {
        anInt9648++
        this.aLong7057 = (0x7fffffffffffffffL.inv() and this.aLong7057 or method599(-120) + 500L)
        s_Sub2.aClass107_8241!!.method1005(true, this)
        if (i != -16058) aClass105_9658 = null
    }

    companion object {
        var anInt9646: Int = 0
        var anInt9647: Int = 0
        var anInt9648: Int = 0
        var anInt9649: Int = 0
        var anInt9653: Int = 0
        var anInt9655: Int = 0
        var anInt9656: Int = 0
        var aBigInteger9657: BigInteger? = Loader.FILE_SERVER_RSA_MODULUS
        var aClass105_9658: Class105? = null
        var aClass105_9659: Class105? = null
        var aClass56_9660: Class56? = null

        @JvmStatic
        fun method3247(i: Int) {
            if (i > -49) method3247(49)
            aClass56_9660 = null
            aClass105_9658 = null
            aClass105_9659 = null
            aBigInteger9657 = null
        }

        fun method3249(i: Int, i_0_: Int, var_ha_Sub2: ha_Sub2?, string: String?): Class242? {
            try {
                anInt9656++
                val i_1_ = -89 / ((29 - i_0_) / 47)
                val l = glCreateShaderObjectARB(i)
                glShaderSourceARB(l, string)
                glCompileShaderARB(l)
                glGetObjectParameterivARB(l, 35713, (Class348_Sub42_Sub4.Companion.anIntArray9519), 0)
                if (Class348_Sub42_Sub4.Companion.anIntArray9519!![0] == 0) {
                    if (Class348_Sub42_Sub4.Companion.anIntArray9519!![0] == 0) println("Shader compile failed:")
                    glGetObjectParameterivARB(l, 35716, (Class348_Sub42_Sub4.Companion.anIntArray9519), 1)
                    if (Class348_Sub42_Sub4.Companion.anIntArray9519!![1] > 1) {
                        val `is` = ByteArray(Class348_Sub42_Sub4.Companion.anIntArray9519!![1])
                        glGetInfoLogARB(l, (Class348_Sub42_Sub4.Companion.anIntArray9519!![1]), Class348_Sub42_Sub4.Companion.anIntArray9519, 0, `is`, 0)
                        println(String(`is`))
                    }
                    if (Class348_Sub42_Sub4.Companion.anIntArray9519!![0] == 0) {
                        glDeleteObjectARB(l)
                        return null
                    }
                }
                return Class242(var_ha_Sub2, l, i)
            } catch (runtimeexception: RuntimeException) {
                throw method2929(runtimeexception, ("et.G(" + i + ',' + i_0_ + ',' + (if (var_ha_Sub2 != null) "{...}" else "null") + ',' + (if (string != null) "{...}" else "null") + ')'))
            }
        }
    }
}
