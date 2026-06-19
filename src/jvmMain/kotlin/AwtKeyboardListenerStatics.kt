import java.awt.Component
import java.awt.event.FocusEvent
import java.awt.event.FocusListener
import java.awt.event.KeyEvent
import java.awt.event.KeyListener

object AwtKeyboardListenerStatics {
    @JvmField
            var anInt6525: Int = 0
            @JvmField
            var anInt6526: Int = 0
            @JvmField
            var anInt6527: Int = 0
            @JvmField
            var aIntRange_6528: IntRange? = IntRange(14, 2)
            @JvmField
            var anInt6529: Int = 0
            @JvmField
            var anInt6530: Int = 0
            @JvmField
            var anInt6531: Int = 0
            @JvmField
            var anInt6532: Int = 0
            @JvmField
            var anInt6533: Int = 0
            @JvmField
            var anInt6534: Int = 0
            @JvmField
            var anInt6535: Int = 0
            @JvmField
            var anInt6536: Int = 0
            @JvmField
            var anInt6537: Int = 0
            @JvmField
            var anInt6538: Int = 0
            @JvmField
            var anInt6539: Int = 0
            @JvmField
            var anInt6540: Int = 0
            @JvmStatic
            fun method2703(i: Int, i_6_: Int, i_7_: Int, i_8_: Byte) {
                anInt6536++
                val class190 = NodeDequeStatics.aModelLightingConfigArrayArray3335!![i_6_]!![i_7_]
                if (i_8_.toInt() == -13) ServerConnectionInfoStatics.method1260(false, i, (if (class190 == null) LocalizedTextStatics.aModelLightingConfig_3547 else class190))
            }
    
            @JvmStatic
            fun method2705(i: Int) {
                aIntRange_6528 = null
                if (i != 14645) method2705(1)
            }
}
