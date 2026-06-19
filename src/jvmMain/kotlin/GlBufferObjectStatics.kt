import jaclib.memory.Buffer
import jaclib.memory.Source
import jaclib.memory.heap.NativeHeapBuffer
import jaggl.MapBuffer
import jaggl.OpenGLStatics.glBindBufferARB
import jaggl.OpenGLStatics.glBufferDataARBa
import jaggl.OpenGLStatics.glBufferDataARBub
import jaggl.OpenGLStatics.glBufferSubDataARBa
import jaggl.OpenGLStatics.glGenBuffersARB

object GlBufferObjectStatics {
    @JvmField
            var anInt4735: Int = 0
            @JvmField
            var anInt4737: Int = 0
            @JvmField
            var anInt4738: Int = 0
            @JvmField
            var anInt4740: Int = 0
            @JvmField
            var aBoolean4741: Boolean = false
            @JvmField
            var anInt4742: Int = 0
            @JvmField
            var aClass348_Sub16_Sub3_4743: MidiSequencePlayer? = null
            @JvmField
            var aStringArray4744: Array<String?>? = arrayOfNulls<String>(200)
            @JvmField
            var anInt4745: Int = 0
            @JvmField
            var anInt4749: Int = 0
            @JvmField
            var anInt4751: Int = 0
            @JvmField
            var anInt4752: Int = 0
            @JvmField
            var anInt4753: Int = 0
            @JvmField
            var aSystemFontGlyphs_4754: SystemFontGlyphs? = null
            @JvmField
            var anInt4756: Int = 0
            @JvmField
            var anInt4757: Int = 0
            @JvmField
            var anInt4758: Int = 0
            fun method2119(f: Float, i: Int, f_0_: Float, i_1_: Int, f_2_: Float): Float {
                anInt4738++
                if (i_1_ >= -59) method2119(1.299765f, 45, -0.43444797f, -35, 0.059617087f)
                val fs = GlShaderProgramHandleStatics.aFloatArrayArray4174!![i]!!
                return fs[1] * f + f_2_ * fs[0] + fs[2] * f_0_
            }
    
            @JvmStatic
            fun method2124(i: Int) {
                aClass348_Sub16_Sub3_4743 = null
                aSystemFontGlyphs_4754 = null
                aStringArray4744 = null
                if (i != 0) method2119(-1.1717526f, -45, -2.0738192f, 18, -0.4863547f)
            }
}
