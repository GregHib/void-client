import jaclib.memory.Stream
import jaclib.memory.StreamStatics.c
import jaclib.memory.heap.NativeHeapBuffer
import java.awt.Component

object ModelVertexColorBufferStatics {
    @JvmField
            var anInt6568: Int = 0
            @JvmField
            var anInt6570: Int = 0
            @JvmField
            var anInt6576: Int = 0
            @JvmField
            var anInt6578: Int = 0
            @JvmField
            var anInt6579: Int = 0
            @JvmField
            var anInt6580: Int = 0
            @JvmField
            var aSystemFontGlyphs_6581: SystemFontGlyphs? = null
            @JvmField
            var anInt6583: Int = 0
            @JvmField
            var aIntRange_6584: IntRange? = null
            @JvmField
            var anInt6585: Int = 0
            @JvmField
            var aFloat6586: Float = 0f
            @JvmField
            var anInt6587: Int = 0
            @JvmField
            var anInt6588: Int = 0
            @JvmStatic
            fun method2738(i: Byte) {
                aIntRange_6584 = null
                aSystemFontGlyphs_6581 = null
                val i_21_ = 89 / ((19 - i) / 43)
            }
    
            @JvmStatic
            fun method2739(i: Int) {
                GrayscaleEffectStatics.aNodeDeque_9201!!.method1996(98)
                anInt6579++
                IntPairStatics.anInt6969 = i
            }
    
            @JvmStatic
            fun method2743(component: Component?, i: Byte): KeyboardInputSource {
                anInt6587++
                val i_41_ = -16 % ((i - -58) / 63)
                return AwtKeyboardListener(component)
            }
}
