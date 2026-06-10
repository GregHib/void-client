/* Class260 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
object Class260 {
    var aClass114_3307: Class114? = Class114(56, 2)
    var anInt3308: Int = 0
    @JvmField
    var aClass45_3309: Class45? = null
    @JvmField
    var anInt3310: Int
    var anIntArray3311: IntArray?
    var anInt3312: Int = 0

    @JvmStatic
    fun method1977(i: Byte, i_0_: Int): Boolean {
        if (i.toInt() != -79) return false
        anInt3308++
        return i_0_ == 3 || i_0_ == 7 || i_0_ == 10
    }

    @JvmStatic
    fun method1978() {
        for (i in Class348_Sub40_Sub34.aClass293Array9432!!.indices) Class348_Sub40_Sub34.aClass293Array9432!![i]!!.method2205()
        Class348_Sub40_Sub34.aClass293Array9432 = null
    }

    @JvmStatic
    fun method1979(i: Byte) {
        aClass45_3309 = null
        anIntArray3311 = null
        if (i < 105) method1978()
        aClass114_3307 = null
    }

    init {
        anInt3310 = 0
        anIntArray3311 = IntArray(1)
    }
}
