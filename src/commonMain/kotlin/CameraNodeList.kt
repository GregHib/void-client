import kotlin.jvm.JvmStatic
/* Class113 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class CameraNodeList {
    override fun toString(): String {
        anInt1741++
        throw IllegalStateException()
    }

    companion object {
        var aLong1739: Long = 0L

        var anInt1740: Int = 0

        var anInt1741: Int = 0

        var anInt1742: Int = 0

        var aJs5Archive_1743: Js5Archive? = null

        var aAbstractModelRendererArray1744: Array<AbstractModelRenderer?>? = null

        var anInt1745: Int = 100

        fun method1056(i: Int, i_0_: Int, c: Char): Int {
            if (i_0_ != 30316) return 27
            anInt1740++
            var i_1_ = c.code shl 4
            if (c.isUpperCase() || c.isTitleCase()) {
                val i_2_ = c.lowercaseChar().code
                i_1_ = 1 + (i_2_ shl 4)
            }
            return i_1_
        }

        @JvmStatic
        fun method1057(bool: Boolean) {
            aJs5Archive_1743 = null
            aAbstractModelRendererArray1744 = null
            if (bool != true) method1056(110, -57, '\uffd1')
        }
    }
}
