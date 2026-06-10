import jaggl.OpenGL.Companion.glBegin
import jaggl.OpenGL.Companion.glEnd
import jaggl.OpenGL.Companion.glGetUniformLocationARB
import jaggl.OpenGL.Companion.glLoadIdentity
import jaggl.OpenGL.Companion.glMatrixMode
import jaggl.OpenGL.Companion.glOrtho
import jaggl.OpenGL.Companion.glPopAttrib
import jaggl.OpenGL.Companion.glPopMatrix
import jaggl.OpenGL.Companion.glPushAttrib
import jaggl.OpenGL.Companion.glPushMatrix
import jaggl.OpenGL.Companion.glTexCoord2f
import jaggl.OpenGL.Companion.glUniform1iARB
import jaggl.OpenGL.Companion.glUniform3fARB
import jaggl.OpenGL.Companion.glUseProgramObjectARB
import jaggl.OpenGL.Companion.glVertex2i
import jaggl.OpenGL.Companion.glViewport
import java.io.*

class Class348_Sub5_Sub1 internal constructor(var_ha_Sub2: ha_Sub2) : Class348_Sub5(var_ha_Sub2) {
    private var aClass337_8822: Class337? = null
    private var aClass337_8824: Class337? = null
    private var aClass206_8825: Class206? = null
    private var anInt8826 = 0
    private var aClass258_Sub3_8830: Class258_Sub3? = null
    private var anInt8833 = 0
    private var aClass258_Sub3_8835: Class258_Sub3? = null
    private var aClass337_8836: Class337? = null
    private var aClass258_Sub3Array8837: Array<Class258_Sub3?>? = null
    private var anInt8838 = 0
    private var anInt8841 = 0
    private var aClass337_8842: Class337? = null
    private var aClass206_8844: Class206? = null

    override fun method2756(i: Byte, i_0_: Int) {
        anInt8831++
        glUseProgramObjectARB(0L)
        this.aHa_Sub2_6618.method3738(-15039, 1)
        val i_1_ = -98 / ((i - 44) / 38)
        this.aHa_Sub2_6618.method3771((-86).toByte(), null)
        this.aHa_Sub2_6618.method3738(-15039, 0)
    }

    override fun method2750(class258_sub3: Class258_Sub3?, class258_sub3_2_: Class258_Sub3?, i: Int, i_3_: Byte) {
        try {
            anInt8828++
            glPushAttrib(2048)
            glMatrixMode(5889)
            glPushMatrix()
            glLoadIdentity()
            glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0)
            if (aClass258_Sub3Array8837 == null) {
                this.aHa_Sub2_6618.method3771((-90).toByte(), class258_sub3_2_)
                this.aHa_Sub2_6618.method3773(-1, aClass206_8825)
                aClass206_8825!!.method1503(0, 3.toByte())
                glViewport(0, 0, 256, 256)
                val l = aClass337_8842!!.aLong4178
                glUseProgramObjectARB(l)
                glUniform1iARB(glGetUniformLocationARB(l, "sceneTex"), 0)
                glUniform3fARB(glGetUniformLocationARB(l, "params"), Class75_Sub1.aFloat5654, 0.0f, 0.0f)
                glBegin(7)
                glTexCoord2f(0.0f, 0.0f)
                glVertex2i(0, 0)
                glTexCoord2f(anInt8841.toFloat(), 0.0f)
                glVertex2i(1, 0)
                glTexCoord2f(anInt8841.toFloat(), anInt8833.toFloat())
                glVertex2i(1, 1)
                glTexCoord2f(0.0f, anInt8833.toFloat())
                glVertex2i(0, 1)
                glEnd()
            } else {
                this.aHa_Sub2_6618.method3773(-1, aClass206_8844)
                var i_4_ = Class348_Sub40_Sub1.method3051(anInt8841, 4096)
                var i_5_ = Class348_Sub40_Sub1.method3051(anInt8833, 4096)
                var i_6_ = 0
                while (i_4_ > 256 || i_5_ > 256) {
                    glViewport(0, 0, i_4_, i_5_)
                    aClass206_8844!!.method1509(aClass258_Sub3Array8837!![i_6_]!!, 0, 0)
                    if (i_6_ == 0) {
                        this.aHa_Sub2_6618.method3771((-115).toByte(), class258_sub3_2_)
                        glBegin(7)
                        glTexCoord2f(0.0f, 0.0f)
                        glVertex2i(0, 0)
                        glTexCoord2f(anInt8841.toFloat(), 0.0f)
                        glVertex2i(1, 0)
                        glTexCoord2f(anInt8841.toFloat(), anInt8833.toFloat())
                        glVertex2i(1, 1)
                        glTexCoord2f(0.0f, anInt8833.toFloat())
                        glVertex2i(0, 1)
                        glEnd()
                    } else {
                        this.aHa_Sub2_6618.method3771((-82).toByte(), aClass258_Sub3Array8837!![i_6_ - 1])
                        glBegin(7)
                        glTexCoord2f(0.0f, 0.0f)
                        glVertex2i(0, 0)
                        glTexCoord2f(1.0f, 0.0f)
                        glVertex2i(1, 0)
                        glTexCoord2f(1.0f, 1.0f)
                        glVertex2i(1, 1)
                        glTexCoord2f(0.0f, 1.0f)
                        glVertex2i(0, 1)
                        glEnd()
                    }
                    if (i_5_ > 256) i_5_ = i_5_ shr 1
                    if (i_4_ > 256) i_4_ = i_4_ shr 1
                    i_6_++
                }
                this.aHa_Sub2_6618.method3770(-422613672, aClass206_8844)
                this.aHa_Sub2_6618.method3771((-100).toByte(), aClass258_Sub3Array8837!![i_6_ + -1])
                this.aHa_Sub2_6618.method3773(-1, aClass206_8825)
                aClass206_8825!!.method1503(0, 3.toByte())
                glViewport(0, 0, 256, 256)
                val l = aClass337_8824!!.aLong4178
                glUseProgramObjectARB(l)
                glUniform1iARB(glGetUniformLocationARB(l, "sceneTex"), 0)
                glUniform3fARB(glGetUniformLocationARB(l, "params"), Class75_Sub1.aFloat5654, 0.0f, 0.0f)
                glBegin(7)
                glTexCoord2f(0.0f, 0.0f)
                glVertex2i(0, 0)
                glTexCoord2f(1.0f, 0.0f)
                glVertex2i(1, 0)
                glTexCoord2f(1.0f, 1.0f)
                glVertex2i(1, 1)
                glTexCoord2f(0.0f, 1.0f)
                glVertex2i(0, 1)
                glEnd()
            }
            aClass206_8825!!.method1503(1, 3.toByte())
            this.aHa_Sub2_6618.method3771((-100).toByte(), aClass258_Sub3_8835)
            val l = aClass337_8822!!.aLong4178
            glUseProgramObjectARB(l)
            glUniform1iARB(glGetUniformLocationARB(l, "baseTex"), 0)
            glUniform3fARB(glGetUniformLocationARB(l, "step"), 0.00390625f, 0.0f, 0.0f)
            glBegin(7)
            glTexCoord2f(0.0f, 0.0f)
            glVertex2i(0, 0)
            glTexCoord2f(1.0f, 0.0f)
            glVertex2i(1, 0)
            glTexCoord2f(1.0f, 1.0f)
            glVertex2i(1, 1)
            glTexCoord2f(0.0f, 1.0f)
            glVertex2i(0, 1)
            glEnd()
            aClass206_8825!!.method1503(0, 3.toByte())
            this.aHa_Sub2_6618.method3771((-114).toByte(), aClass258_Sub3_8830)
            glUniform3fARB(glGetUniformLocationARB(l, "step"), 0.0f, 0.00390625f, 0.0f)
            glBegin(7)
            glTexCoord2f(0.0f, 0.0f)
            if (i_3_ <= 98) aClass258_Sub3_8835 = null
            glVertex2i(0, 0)
            glTexCoord2f(1.0f, 0.0f)
            glVertex2i(1, 0)
            glTexCoord2f(1.0f, 1.0f)
            glVertex2i(1, 1)
            glTexCoord2f(0.0f, 1.0f)
            glVertex2i(0, 1)
            glEnd()
            glPopAttrib()
            glPopMatrix()
            glMatrixMode(5888)
            this.aHa_Sub2_6618.method3770(-422613672, aClass206_8825)
            val l_7_ = aClass337_8836!!.aLong4178
            glUseProgramObjectARB(l_7_)
            glUniform1iARB(glGetUniformLocationARB(l_7_, "sceneTex"), 0)
            glUniform1iARB(glGetUniformLocationARB(l_7_, "bloomTex"), 1)
            glUniform3fARB(glGetUniformLocationARB(l_7_, "params"), Class348_Sub40_Sub13.aFloat9204, Class239_Sub26.aFloat6120, 0.0f)
            this.aHa_Sub2_6618.method3738(-15039, 1)
            this.aHa_Sub2_6618.method3771((-99).toByte(), aClass258_Sub3_8835)
            this.aHa_Sub2_6618.method3738(-15039, 0)
            this.aHa_Sub2_6618.method3771((-82).toByte(), class258_sub3_2_)
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("rda.H(" + (if (class258_sub3 != null) "{...}" else "null") + ',' + (if (class258_sub3_2_ != null) "{...}" else "null") + ',' + i + ',' + i_3_ + ')'))
        }
    }

    override fun method2754(i: Int, i_14_: Byte, i_15_: Int) {
        anInt8833 = i
        if (i_14_ >= 7) {
            anInt8843++
            anInt8841 = i_15_
            val i_16_ = Class348_Sub40_Sub1.method3051(anInt8841, 4096)
            val i_17_ = Class348_Sub40_Sub1.method3051(anInt8833, 4096)
            if (anInt8826 != i_16_ || anInt8838 != i_17_) {
                if (aClass258_Sub3Array8837 != null) {
                    var i_18_ = 0
                    while ((i_18_ < aClass258_Sub3Array8837!!.size)) {
                        aClass258_Sub3Array8837!![i_18_]!!.method1952(-19948)
                        i_18_++
                    }
                    aClass258_Sub3Array8837 = null
                }
                if (i_16_ > 256 || i_17_ > 256) {
                    var i_19_ = i_16_
                    var i_20_ = i_17_
                    var i_21_ = 0
                    while (i_19_ > 256 || i_20_ > 256) {
                        if (i_20_ > 256) i_20_ = i_20_ shr 1
                        if (i_19_ > 256) i_19_ = i_19_ shr 1
                        i_21_++
                    }
                    if (aClass206_8844 == null) aClass206_8844 = Class206(this.aHa_Sub2_6618)
                    i_19_ = i_16_
                    aClass258_Sub3Array8837 = arrayOfNulls<Class258_Sub3>(i_21_)
                    i_20_ = i_17_
                    i_21_ = 0
                    while (i_19_ > 256 || i_20_ > 256) {
                        aClass258_Sub3Array8837!![i_21_++] = Class258_Sub3((this.aHa_Sub2_6618), 3553, 34842, i_19_, i_20_)
                        if (i_20_ > 256) i_20_ = i_20_ shr 1
                        if (i_19_ > 256) i_19_ = i_19_ shr 1
                    }
                } else aClass206_8844 = null
                anInt8826 = i_16_
                anInt8838 = i_17_
            }
        }
    }

    override fun method2763(i: Byte) {
        aClass337_8822 = null
        aClass258_Sub3_8835 = null
        aClass206_8844 = null
        aClass206_8825 = null
        aClass337_8842 = null
        anInt8839++
        aClass258_Sub3Array8837 = null
        aClass337_8824 = null
        aClass337_8836 = null
        if (i > -123) method2756((-56).toByte(), -105)
        aClass258_Sub3_8830 = null
    }

    override fun method2751(bool: Boolean): Boolean {
        if (bool != true) method2751(true)
        anInt8829++
        return aClass206_8825 != null
    }

    fun method2767(i: Byte): Boolean {
        if (i.toInt() != 104) return false
        anInt8840++
        return this.aHa_Sub2_6618.aBoolean7820 && this.aHa_Sub2_6618.aBoolean7783 && this.aHa_Sub2_6618.aBoolean7818
    }

    override fun method2761(bool: Boolean): Int {
        anInt8827++
        if (bool != true) anInt8833 = -77
        return 1
    }

    override fun method2758(i: Int): Boolean {
        if (i < 84) aClass206_8844 = null
        anInt8834++
        if (this.aHa_Sub2_6618.aBoolean7820 && this.aHa_Sub2_6618.aBoolean7783 && this.aHa_Sub2_6618.aBoolean7818) {
            aClass206_8825 = Class206(this.aHa_Sub2_6618)
            aClass258_Sub3_8835 = Class258_Sub3(this.aHa_Sub2_6618, 3553, 34842, 256, 256)
            aClass258_Sub3_8835!!.method1965(false, false, 10243)
            aClass258_Sub3_8830 = Class258_Sub3(this.aHa_Sub2_6618, 3553, 34842, 256, 256)
            aClass258_Sub3_8830!!.method1965(false, false, 10243)
            this.aHa_Sub2_6618.method3773(-1, aClass206_8825)
            aClass206_8825!!.method1509(aClass258_Sub3_8835!!, 0, 0)
            aClass206_8825!!.method1509(aClass258_Sub3_8830!!, 0, 1)
            aClass206_8825!!.method1503(0, 3.toByte())
            if (!aClass206_8825!!.method1507(124)) {
                this.aHa_Sub2_6618.method3770(-422613672, aClass206_8825)
                return false
            }
            this.aHa_Sub2_6618.method3770(-422613672, aClass206_8825)
            aClass337_8842 = (Class318_Sub1_Sub5_Sub2.method2493(
                this.aHa_Sub2_6618,
                -1,
                (arrayOf<Class242?>(Class348_Sub42_Sub15.method3249(35632, 80, this.aHa_Sub2_6618, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n")))
            ))
            aClass337_8824 = (Class318_Sub1_Sub5_Sub2.method2493(this.aHa_Sub2_6618, -1, (arrayOf<Class242?>(Class348_Sub42_Sub15.method3249(35632, -45, this.aHa_Sub2_6618, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n")))))
            aClass337_8836 = (Class318_Sub1_Sub5_Sub2.method2493(
                this.aHa_Sub2_6618,
                -1,
                (arrayOf<Class242?>(
                    Class348_Sub42_Sub15.method3249(
                        35632,
                        -108,
                        this.aHa_Sub2_6618,
                        "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n"
                    )
                ))
            ))
            aClass337_8822 = (Class318_Sub1_Sub5_Sub2.method2493(
                this.aHa_Sub2_6618, -1, (arrayOf<Class242?>(
                    Class348_Sub42_Sub15.method3249(
                        35632,
                        -31,
                        this.aHa_Sub2_6618,
                        "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n"
                    )
                ))
            ))
            return aClass337_8824 != null && aClass337_8842 != null && aClass337_8836 != null && aClass337_8822 != null
        }
        return false
    }

    companion object {
        @JvmField
        var anInt8823: Int = 0
        @JvmField
        var anInt8827: Int = 0
        @JvmField
        var anInt8828: Int = 0
        @JvmField
        var anInt8829: Int = 0
        @JvmField
        var anInt8831: Int = 0
        @JvmField
        var aClass21_8832: Class21? = Class21()
        @JvmField
        var anInt8834: Int = 0
        @JvmField
        var anInt8839: Int = 0
        @JvmField
        var anInt8840: Int = 0
        @JvmField
        var anInt8843: Int = 0
        @JvmStatic
        fun method2765(i: Int) {
            aClass21_8832 = null
            if (i != 2048) method2765(52)
        }

        @JvmStatic
        @Throws(IOException::class)
        fun method2766(bool: Boolean, throwable: Throwable): String {
            var throwable = throwable
            anInt8823++
            var string: String
            if (throwable is RuntimeException_Sub1) {
                val runtimeexception_sub1 = throwable
                string = (runtimeexception_sub1.aString4594 + " | ")
                throwable = (runtimeexception_sub1.aThrowable4595!!)
            } else string = ""
            val stringwriter = StringWriter()
            val printwriter = PrintWriter(stringwriter)
            throwable.printStackTrace(printwriter)
            printwriter.close()
            val string_8_ = stringwriter.toString()
            val bufferedreader = BufferedReader(StringReader(string_8_))
            if (bool != false) method2765(-61)
            val string_9_ = bufferedreader.readLine()
            while (true) {
                val string_10_ = bufferedreader.readLine()
                if (string_10_ == null) break
                val i = string_10_.indexOf('(')
                val i_11_ = string_10_.indexOf(')', 1 + i)
                var string_12_: String?
                if (i == -1) string_12_ = string_10_
                else string_12_ = string_10_.substring(0, i)
                string_12_ = string_12_.trim { it <= ' ' }
                string_12_ = string_12_.substring(1 + string_12_.lastIndexOf(' '))
                string_12_ = string_12_.substring(1 + string_12_.lastIndexOf('\t'))
                string += string_12_
                if (i != -1 && i_11_ != -1) {
                    val i_13_ = string_10_.indexOf(".java:", i)
                    if (i_13_ >= 0) string += string_10_.substring(i_13_ - -5, i_11_)
                }
                string += ' '
            }
            string += "| " + string_9_
            return string
        }
    }
}
