import jaggl.OpenGLStatics.glBegin
import jaggl.OpenGLStatics.glEnd
import jaggl.OpenGLStatics.glGetUniformLocationARB
import jaggl.OpenGLStatics.glLoadIdentity
import jaggl.OpenGLStatics.glMatrixMode
import jaggl.OpenGLStatics.glOrtho
import jaggl.OpenGLStatics.glPopAttrib
import jaggl.OpenGLStatics.glPopMatrix
import jaggl.OpenGLStatics.glPushAttrib
import jaggl.OpenGLStatics.glPushMatrix
import jaggl.OpenGLStatics.glTexCoord2f
import jaggl.OpenGLStatics.glUniform1iARB
import jaggl.OpenGLStatics.glUniform3fARB
import jaggl.OpenGLStatics.glUseProgramObjectARB
import jaggl.OpenGLStatics.glVertex2i
import jaggl.OpenGLStatics.glViewport
import java.io.*

object GlBloomEffectStatics {
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
            var aCameraRotationStub_8832: CameraRotationStub? = CameraRotationStub()
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
                aCameraRotationStub_8832 = null
                if (i != 2048) method2765(52)
            }
    
            @JvmStatic
            @Throws(IOException::class)
            fun method2766(bool: Boolean, throwable: Throwable): String {
                var throwable = throwable
                anInt8823++
                var string: String
                if (throwable is TextureLoadException) {
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
