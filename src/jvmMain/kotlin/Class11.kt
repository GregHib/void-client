import Class239_Sub16.Companion.method1791

/* Class11 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
object Class11 {
    var anInt193: Int = 0
    var anInt194: Int = 0
    var anInt195: Int = 0
    var aClass231_196: Class231? = null
    var anInt197: Int = 0

    fun method221(i: Int) {
        if (i != 0) anInt197 = -100
        aClass231_196 = null
    }

    fun method222(player: Player?, i: Int, i_0_: Byte, i_1_: Int) {
        anInt195++
        if (i_0_.toInt() != 4) anInt194 = -100
        val `is` = IntArray(4)
        Class214.method1579(`is`, 0, `is`.size, i)
        method1791(23946, `is`, i_1_, player)
    }
}
