import jaclib.memory.Buffer
import jaggl.OpenGLStatics.glBufferDataARBa
import jaggl.OpenGLStatics.glBufferDataARBub
import jaggl.OpenGLStatics.glBufferSubDataARBub
import jaggl.OpenGLStatics.glGenBuffersARB
import java.awt.Color

object GlVertexBufferBaseStatics {
    @JvmField
            var anInt1922: Int = 0
            @JvmField
            var anInt1924: Int = 0
            @JvmField
            var anInt1925: Int = 0
            @JvmField
            var anInt1926: Int = 0
            @JvmField
            var aColorArray1928: Array<Color?>? = arrayOf<Color?>(Color(9179409), Color(3289650), Color(3289650), Color(3289650))
            @JvmStatic
            fun method1148(i: Int, i_0_: Int) {
                anInt1925++
                val class348_sub42_sub15 = NamedTimedNodeStatics.method2516(i, 105.toByte(), i_0_) //6
                class348_sub42_sub15.method3251(i_0_ xor 0x3ebf.inv())
            }
    
            @JvmStatic
            fun method1149(i: Int) {
                val i_1_ = -90 / ((-50 - i) / 37)
                aColorArray1928 = null
            }
    
            @JvmStatic
            fun method1151(i: Int, var_renderer: Renderer?, i_3_: Int): FontDefinition? {
                anInt1924++
                if (i != -25411) return null
                val class352 = ChatEffectsOptionStateStatics.method1734(i_3_, var_renderer, (-81).toByte(), true)
                if (class352 == null) return null
                return class352.aFontDefinition_4333
            }
}
