import Gl2dTextureStatics.method239
import WorldListEntryStatics.method285
import TwoStateOptionStateStatics.method1843
import java.util.*

object CollisionMapRegionStatics {
    @JvmField
            var anInt1716: Int = 0
            @JvmField
            var anInt1717: Int = 0
            @JvmField
            var anInt1719: Int = 0
            @JvmField
            var anInt1720: Int = -1
            @JvmField
            var anInt1721: Int = 0
            var aIntRange_1722: IntRange? = IntRange(8, -2)
            @JvmField
            var anInt1723: Int = 0
            @JvmStatic
            fun method1045(i: Int, i_1_: Int, i_2_: Int, i_3_: Int, i_4_: Int, i_5_: Int, i_6_: Byte): Int {
                var i_1_ = i_1_
                var i_3_ = i_3_
                var i_5_ = i_5_
                i_5_ = i_5_ and 0x3
                anInt1716++
                if ((i_2_ and 0x1) == 1) {
                    val i_7_ = i_3_
                    i_3_ = i_1_
                    i_1_ = i_7_
                }
                if (i_5_ == 0) return i_4_
                if (i_6_.toInt() != 16) return -78
                if (i_5_ == 1) return 7 + -i - i_3_ - -1
                if (i_5_ == 2) return -i_4_ + 7 - -1 - i_1_
                return i
            }
    
            @JvmStatic
            fun method1047(i: Int) {
                if (i != 1) anInt1720 = 93
                aIntRange_1722 = null
            }
    
            fun method1048(widgetComponent: WidgetComponent, i: Int) {
                anInt1723++
                val i_13_ = 113 % ((-25 - i) / 59)
                val class46_14_ = WorldMapSceneStatics.method1687(widgetComponent, 3)
                val i_15_: Int
                val i_16_: Int
                if (class46_14_ == null) {
                    i_15_ = HardCacheEntryReferenceStatics.anInt10432
                    i_16_ = LocTypeDefinitionStatics.anInt4017
                } else {
                    i_15_ = class46_14_.anInt789
                    i_16_ = class46_14_.anInt709
                }
                method1843(i_16_, -326, widgetComponent, false, i_15_)
                method239(((-114).toByte()).toByte(), i_16_, i_15_, widgetComponent)
            }
}
