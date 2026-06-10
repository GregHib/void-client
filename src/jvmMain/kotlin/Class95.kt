/* Class95 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
object Class95 {
    @JvmField
    var anInt1539: Int = 0
    var aClass114_1540: Class114? = Class114(113, 1)
    @JvmField
    var aClass45_1541: Class45? = null
    @JvmField
    var aClass221_1542: Class221? = null
    @JvmField
    var aClass348_Sub42_Sub17Array1543: Array<Class348_Sub42_Sub17?>? = arrayOfNulls(14)

    @JvmStatic
    fun method868(i: Int, i_0_: Int, bool: Boolean): Int {
        anInt1539++
        if (bool != false) method868(89, 115, true)
        if (i == 1 || i == 3) return Class348_Sub42_Sub10.anIntArray9572!![i_0_ and 0x3]
        return Class348_Sub42_Sub20.anIntArray9714!![i_0_ and 0x3]
    }

    @JvmStatic
    fun method869(i: Int) {
        aClass45_1541 = null
        aClass114_1540 = null
        aClass348_Sub42_Sub17Array1543 = null
        aClass221_1542 = null
        if (i != 3) method869(55)
    }
}
