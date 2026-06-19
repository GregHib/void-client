import GlRectangleTextureStatics.method253
import IdentKitRecolorStatics.method203

object WidgetComponentNodeStatics {
    @JvmField
            var anInt4652: Int = 0
            @JvmField
            var anInt4653: Int = 0
            @JvmField
            var anIntArray4654: IntArray? = null
            @JvmField
            var anInt4656: Int = 0
            @JvmField
            var anInt4657: Int = 0
            @JvmField
            var anInt4658: Int = 0
            @JvmField
            var anInt4660: Int = 0
            @JvmField
            var anInt4662: Int = 0
    
            fun method1115(i: Int, i_3_: Int, i_4_: Byte): Int {
                anInt4652++
                var i_5_ = i - -(57 * i_3_)
                i_5_ = i_5_ xor (i_5_ shl 13)
                val i_6_ = -76 / ((i_4_ - 22) / 60)
                val i_7_ = 1376312589 + i_5_ * (15731 * i_5_ * i_5_ + 789221) and 0x7fffffff
                return (i_7_ and 0x7fa112f) shr 19
            }
    
            fun method1116(i: Int, i_8_: Int, i_9_: Int, i_10_: Int, i_11_: Byte) {
                if (WorldMapLabelStatics.anInt4960 > i_9_ + -i_10_ || CameraNodeListStatics.anInt1745 < i_10_ + i_9_ || LocalPlayerState.anInt1910 > i - i_10_ || i - -i_10_ > WidgetTextConfigStatics.anInt513) method203(-107, i_9_, i_8_, i, i_10_)
                else method253(i, i_9_, -648, i_8_, i_10_)
                anInt4662++
                val i_12_ = -68 / ((40 - i_11_) / 36)
            }
    
            @JvmStatic
            fun method1117(i: Int) {
                anIntArray4654 = null
                val i_13_ = -13 / ((i - 57) / 47)
            }
}
