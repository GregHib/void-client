/* Class113 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class113 {
    override fun toString(): String {
        anInt1741++
        throw IllegalStateException()
    }

    companion object {
        var aLong1739: Long = 0L
        @JvmField
        var anInt1740: Int = 0
        @JvmField
        var anInt1741: Int = 0
        @JvmField
        var anInt1742: Int = 0
        @JvmField
        var aClass45_1743: Class45? = null
        @JvmField
        var aClass105Array1744: Array<Class105?>? = null
        @JvmField
        var anInt1745: Int = 100

        fun method1056(i: Int, i_0_: Int, c: Char): Int {
            if (i_0_ != 30316) return 27
            anInt1740++
            var i_1_ = c.code shl 4
            if (Character.isUpperCase(c) || Character.isTitleCase(c)) {
                val i_2_ = c.lowercaseChar().code
                i_1_ = 1 + (i_2_ shl 4)
            }
            return i_1_
        }

        @JvmStatic
        fun method1057(bool: Boolean) {
            aClass45_1743 = null
            aClass105Array1744 = null
            if (bool != true) method1056(110, -57, '\uffd1')
        }
    }
}
