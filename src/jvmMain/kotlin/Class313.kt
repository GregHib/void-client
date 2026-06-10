import Class286_Sub3.Companion.method2148

/* Class313 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
object Class313 {
    var anInt3933: Int = 0
    var aClass223_3934: Class223? = Class223(2, 2)
    var aFloat3935: Float = 0f
    @JvmField
    var anInt3936: Int = 0
    var anInt3937: Int = 0

    @JvmStatic
    fun method2333(bool: Boolean) {
        if (bool == false) aClass223_3934 = null
    }

    @JvmStatic
    fun method2334(i: Int) {
        Class318_Sub1_Sub3_Sub4.anInt10340++
        if (i != 0) method2333(true)
        anInt3933++
        val class348_sub47 = method2148(aa_Sub3.aClass351_5200, Class348_Sub23_Sub2.aClass77_9029, i xor 0x53.inv())
        class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShort(107.toByte(), Class135_Sub1.anInt4718)
        Class348_Sub42_Sub14.method3243(118, class348_sub47)
    }
}
