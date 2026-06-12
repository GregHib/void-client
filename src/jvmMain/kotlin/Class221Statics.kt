import kotlin.math.max

/**
 * JVM-only statics split out of [Class221].
 *
 * Holds [method1607], whose body compares the receiver against JVM-only
 * singleton handles ([Class321], [Class5_Sub1.aClass221_8344],
 * [Class223Statics.aClass221_2893], [Class104.aClass221_1620]) to compute a
 * layout-anchor offset. Taking the [Class221] instance as the first parameter
 * keeps that JVM coupling in jvmMain so [Class221] itself can be common — it is
 * a ctor-param type threaded through the Class369 hierarchy.
 */
object Class221Statics {
    @JvmStatic
    fun method1607(class221: Class221, i: Int, i_0_: Int, i_1_: Byte): Int {
        Class221.anInt2882++
        val i_2_ = (max(Class321.anInt4017, i))
        if (Class5_Sub1.aClass221_8344 == class221) return 0
        if (i_1_ >= -103) Class221.aBoolean2881 = true
        if (class221 == Class223Statics.aClass221_2893) return i_2_ - i_0_
        if (Class104.aClass221_1620 == class221) return (-i_0_ + i_2_) / 2
        return 0
    }
}
