import GameDisplayManager.method1582
import BoundsConstraintEntryStatics.method2057
import WorldMapAreaLabelStatics.method3570

object HuffmanCodecStatics {
    var anInt3765: Int = 0
            var aBoolean3767: Boolean = false
            @JvmField
            var anInt3768: Int = 0
            var anInt3770: Int = 0
            var anInt3771: Int = 0
            var anInt3772: Int = 0
            var aIntRange_3773: IntRange? = IntRange(55, 0)
            var anInt3775: Int = 0
    
            fun method2224(i: Int, i_0_: Byte, i_1_: Int): Boolean {
                val i_2_ = 41 / ((59 - i_0_) / 37)
                anInt3765++
                return (i and 0x800) != 0
            }
    
            @JvmStatic
            fun method2225(i: Int) {
                if (i != 32) aIntRange_3773 = null
                aIntRange_3773 = null
            }
    
            @JvmStatic
            fun method2228(i: Int) {
                if (i == 0) {
                    method1582(7851)
                    anInt3772++
                    method3570(false)
                }
            }
}
