import kotlin.math.max

/* Class221 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class221 {
    fun method1607(i: Int, i_0_: Int, i_1_: Byte): Int {
        anInt2882++
        val i_2_ = (max(Class321.anInt4017, i))
        if (Class5_Sub1.aClass221_8344 == this) return 0
        if (i_1_ >= -103) aBoolean2881 = true
        if (this == Class223.Companion.aClass221_2893) return i_2_ - i_0_
        if (Class104.aClass221_1620 == this) return (-i_0_ + i_2_) / 2
        return 0
    }

    override fun toString(): String {
        anInt2879++
        throw IllegalStateException()
    }

    companion object {
        var anInt2879: Int = 0
        var anInt2880: Int = 0
        var aBoolean2881: Boolean = false
        var anInt2882: Int = 0
    }
}
