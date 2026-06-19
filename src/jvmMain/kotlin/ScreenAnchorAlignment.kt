import kotlin.math.max
import ScreenAnchorAlignmentStatics.anInt2879
import ScreenAnchorAlignmentStatics.aBoolean2881
import ScreenAnchorAlignmentStatics.anInt2882

/* Class221 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class ScreenAnchorAlignment {
    fun method1607(i: Int, i_0_: Int, i_1_: Byte): Int {
        anInt2882++
        val i_2_ = (max(LocTypeDefinitionStatics.anInt4017, i))
        if (ScrollbarComponentStatics.aScreenAnchorAlignment_8344 == this) return 0
        if (i_1_ >= -103) aBoolean2881 = true
        if (this == ProjectileFactoryStatics.aScreenAnchorAlignment_2893) return i_2_ - i_0_
        if (SoftwareSpriteRasterStatics.aScreenAnchorAlignment_1620 == this) return (-i_0_ + i_2_) / 2
        return 0
    }

    override fun toString(): String {
        anInt2879++
        throw IllegalStateException()
    }
}
