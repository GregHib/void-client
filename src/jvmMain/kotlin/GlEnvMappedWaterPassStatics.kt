import FontStatics.method2582
import jaggl.OpenGLStatics.glGetUniformLocationARB
import jaggl.OpenGLStatics.glUniform1fARB
import jaggl.OpenGLStatics.glUniform1iARB
import jaggl.OpenGLStatics.glUniform3fARB
import jaggl.OpenGLStatics.glUniform4fARB
import jaggl.OpenGLStatics.glUseProgramObjectARB
import kotlin.math.abs

object GlEnvMappedWaterPassStatics {
    @JvmField
            var anInt7366: Int = 0
            @JvmField
            var aIntRange_7367: IntRange? = IntRange(37, 7)
            @JvmField
            var anInt7368: Int = 0
            @JvmField
            var anInt7370: Int = 0
            @JvmField
            var aJs5Archive_7371: Js5Archive? = null
            @JvmField
            var anInt7372: Int = 0
            @JvmField
            var anInt7374: Int = 0
            @JvmField
            var anInt7377: Int = 0
            @JvmField
            var aStringArray7378: Array<String?>? = null
            @JvmField
            var anInt7379: Int = 0
            @JvmField
            var anInt7380: Int = 0
    
            @JvmStatic
            fun method3551(i: Int, i_5_: Int, i_6_: Int, bool: Boolean): String? {
                var i_6_ = i_6_
                anInt7374++
                require(!(i_5_ < 2 || i_5_ > 36)) { "Invalid radix:" + i_5_ }
                if (!bool || i_6_ < 0) return i_6_.toString(i_5_.coerceIn(2, 36))
                var i_7_ = 2
                var i_8_ = i_6_ / i_5_
                while (i_8_ != 0) {
                    i_8_ /= i_5_
                    i_7_++
                }
                val cs = CharArray(i_7_)
                cs[0] = '+'
                var i_9_ = i_7_ + -1
                if (i != 8320) return null
                while ( /**/i_9_ > 0) {
                    val i_10_ = i_6_
                    i_6_ /= i_5_
                    val i_11_ = i_10_ + -(i_6_ * i_5_)
                    if (i_11_ < 10) cs[i_9_] = (i_11_ + 48).toChar()
                    else cs[i_9_] = (i_11_ + 87).toChar()
                    i_9_--
                }
                return String(cs)
            }
    
            @JvmStatic
            fun method3552(i: Int) {
                aJs5Archive_7371 = null
                aIntRange_7367 = null
                aStringArray7378 = null
                if (i != 87) anInt7379 = 80
            }
}
