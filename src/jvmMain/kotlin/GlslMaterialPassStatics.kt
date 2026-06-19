import jaggl.OpenGLStatics.glGetUniformLocationARB
import jaggl.OpenGLStatics.glUniform1fARB
import jaggl.OpenGLStatics.glUniform1iARB
import jaggl.OpenGLStatics.glUniform2fARB
import jaggl.OpenGLStatics.glUniform3fARB
import jaggl.OpenGLStatics.glUniform4fARB
import jaggl.OpenGLStatics.glUseProgramObjectARB
import kotlin.math.abs

object GlslMaterialPassStatics {
    @JvmField
            var anInt6235: Int = 0
            @JvmField
            var anInt6236: Int = 0
            @JvmField
            var anInt6238: Int = 0
            @JvmField
            var anInt6239: Int = 0
            @JvmField
            var anInt6240: Int = 0
            @JvmField
            var anInt6241: Int = 0
            @JvmField
            var anInt6243: Int = 0
            @JvmField
            var aFontMetaRef_6244: FontMetaRef? = FontMetaRef(9, 8)
            @JvmField
            var anInt6245: Int = 0
            @JvmField
            var anInt6246: Int = 0
    
            @JvmStatic
            fun method2154(i: Int): Int {
                var i_1_ = -1
                for (i_2_ in 0..<ActiveMapRegion.anInt5652 - 1) {
                    if (i < (WidgetDefinitionStatics.anIntArray256!![i_2_] + ParticleProcessorStatics.anIntArray4271!![i_2_])) {
                        i_1_ = i_2_
                        break
                    }
                }
                if (i_1_ == -1) i_1_ = ActiveMapRegion.anInt5652 - 1
                return i_1_
            }
    
            @JvmStatic
            fun method2155(i: Int, i_3_: Byte): Int {
                var i = i
                if (i_3_.toInt() != 43) return -54
                i = (i and 0x55555555) + ((0x55555554.inv() and i) ushr 1)
                anInt6241++
                i = (0x33333333 and (i ushr 2)) + (0x33333333 and i)
                i = 0xf0f0f0f and (i ushr 4) + i
                i += i ushr 8
                i += i ushr 16
                return i and 0xff
            }
    
            @JvmStatic
            fun method2156(i: Int) {
                aFontMetaRef_6244 = null
                if (i <= 57) aFontMetaRef_6244 = null
            }
    
            @JvmStatic
            fun method2157(i: Int, i_15_: Int): String? {
                anInt6238++
                if (i_15_ != -1431655765) method2157(-27, 75)
                val class348_sub15 = (ProjectileConfigUtil.aHashtable_389!!.method3480(i.toLong(), -6008) as MenuActionNode?)
                if (class348_sub15 != null) {
                    val class348_sub23_sub4 = class348_sub15.aClass55_Sub1_6768!!.method513(i_15_ + 1431655815)
                    if (class348_sub23_sub4 != null) {
                        val d = class348_sub15.aClass55_Sub1_6768!!.method519(i_15_ xor 0x55555524)
                        if (class348_sub23_sub4.method2983(85.toByte()).toDouble() <= d && d <= class348_sub23_sub4.method2984(97.toByte()).toDouble()) return class348_sub23_sub4.method2989(9)
                    }
                }
                return null
            }
}
