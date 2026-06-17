/* Class131 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
object ParserSpecialCharsHolder {
    var aIntRange_1901: IntRange? = IntRange(38, -1)
    var anInt1902: Int
    var aCharArray1903: CharArray? = charArrayOf('[', ']', '#')
    @JvmField
    var aClass351_1904: Class351?

    @JvmStatic
    fun method1136(i: Byte) {
        aCharArray1903 = null
        if (i.toInt() == -98) {
            aIntRange_1901 = null
            aClass351_1904 = null
        }
    }

    init {
        anInt1902 = 0
        aClass351_1904 = Class351(61, 11)
    }
}
