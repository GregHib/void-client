import Class299_Sub1_Sub2.Companion.method2264
import Class59_Sub2_Sub2.Companion.method574

/* Class298 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
object Class298 {
    var anInt3808: Int = 0
    var aClass114_3809: Class114? = Class114(44, 6)
    var anInt3810: Int = 0
    @JvmField
    var aBoolean3811: Boolean = false

    fun method2250(i: Int, i_0_: Int, i_1_: Int, i_2_: Int): Int {
        var i_2_ = i_2_
        if (i_0_ < 36) aBoolean3811 = true
        anInt3810++
        val i_3_ = -i_1_ + 255
        i_2_ = (0xff00ff.inv() and (i_2_ and 0xff00ff) * i_1_ or (0xff0000 and (0xff00 and i_2_) * i_1_)) ushr 8
        return i_2_ + ((i_3_ * (i and 0xff00ff) and 0xff00ff.inv() or (i_3_ * (0xff00 and i) and 0xff0000)) ushr 8)
    }

    @JvmStatic
    fun method2251(i: Int) {
        if (i != 16711680) aClass114_3809 = null
        aClass114_3809 = null
    }

    @JvmStatic
    fun method2252(bool: Boolean, i: Int, i_4_: Int, i_5_: Byte, i_6_: Int, i_7_: Int, i_8_: Int, i_9_: Int, i_10_: Int): Boolean {
        anInt3808++
        val i_11_ = (Class132.aPlayer_1907!!.anIntArray10320!![0])
        val i_12_ = (Class132.aPlayer_1907!!.anIntArray10317!![0])
        if (i_11_ < 0 || i_11_ >= Class367_Sub4.anInt7319 || i_12_ < 0 || Class348_Sub40_Sub3.anInt9109 <= i_12_) return false
        if (i < 0 || i >= Class367_Sub4.anInt7319 || i_4_ < 0 || Class348_Sub40_Sub3.anInt9109 <= i_4_) return false
        val i_13_ = (method574(i, Class132.aPlayer_1907!!.method2436(70.toByte()), i_6_, Class348_Sub40_Sub11.anIntArray9185, bool, 120.toByte(), i_9_, i_11_, i_12_, Class348_Sub42_Sub14.anIntArray9626, i_4_, (Class348_Sub45.aClass361Array7108!![Class132.aPlayer_1907!!.plane.toInt()]), i_8_, i_7_, i_10_))
        if (i_13_ < 1) return false
        Class248.anInt3203 = Class348_Sub42_Sub14.anIntArray9626!![-1 + i_13_]
        Class97.anInt1548 = Class348_Sub40_Sub11.anIntArray9185!![-1 + i_13_]
        Class348_Sub13.aBoolean6759 = false
        if (i_5_ > -83) aBoolean3811 = true
        method2264(false)
        return true
    }
}
