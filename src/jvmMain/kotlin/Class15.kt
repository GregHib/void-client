/* Class15 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
object Class15 {
    @JvmField
    var aClass60_225: Class60? = Class60(4)
    @JvmField
    var anInt226: Int = 0
    @JvmField
    var anInt227: Int = 0
    @JvmField
    var anInt228: Int = 0
    var aClass114_229: Class114? = Class114(51, 17)

    @JvmStatic
    fun method255(i: Int) {
        aClass60_225 = null
        if (i != 6725) aClass60_225 = null
        aClass114_229 = null
    }

    @JvmStatic
    fun method256(i: Int, i_0_: Byte): Int {
        anInt228++
        return i ushr 7
    }

    fun method257(i: Int, string: String, c: Char): Int {
        anInt227++
        var i_1_ = 0
        if (i != 4) aClass114_229 = null
        val i_2_ = string.length
        var i_3_ = 0
        while (i_2_ > i_3_) {
            if (c == string.get(i_3_)) i_1_++
            i_3_++
        }
        return i_1_
    }
}
