import kotlin.jvm.JvmStatic
/* Class223 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class ProjectileFactory internal constructor(i: Int, var anInt2896: Int) {
    override fun toString(): String {
        anInt2894++
        throw IllegalStateException()
    }

    companion object {
        var anInt2894: Int = 0
        var aBoolean2895: Boolean = false
        var anInt2897: Int = 0

        var anIntArray2899: IntArray?

        var anIntArrayArray2900: Array<IntArray?>?


        @JvmStatic
        fun method1613(bool: Boolean, i: Int, i_0_: Int): Boolean {
            anInt2897++
            return (i_0_ and 0x22) != 0
        }

        init {
            anIntArray2899 = IntArray(13)
            anIntArrayArray2900 = Array<IntArray?>(128) { IntArray(128) }
        }
    }
}