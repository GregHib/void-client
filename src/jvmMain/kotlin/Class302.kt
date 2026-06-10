import Canvas_Sub1.Companion.method119
import Class103.method950
import Class112.Companion.method1053
import Class175.Companion.method1343
import Class33.Companion.method338
import Class5_Sub2.Companion.method198
import Class75_Sub1.method769
import Class82.Companion.method814
import Class88.Companion.method842

/* Class302 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class302 {
    @JvmField
    var anInt3831: Int = 0
    @JvmField
    var anInt3832: Int = 0
    @JvmField
    var anInt3833: Int = 0
    var anInt3834: Int = -1
    @JvmField
    var anInt3835: Int = 0
    var anInt3837: Int = 0
    @JvmField
    var anInt3838: Int = 0
    @JvmField
    var anInt3839: Int = 0
    @JvmField
    var anInt3840: Int = 0

    companion object {
        var anInt3836: Int = 0
        var anInt3841: Int = 0

        fun method2283(bool: Boolean, i: Int, i_0_: Int, i_1_: Int, bool_2_: Boolean) {
            method950(i_0_, 0, Class65.aClass110_Sub1Array1146!!.size + -1, bool, 56.toByte(), i_1_, bool_2_)
            anInt3836++
            Class215.anInt2834 = i
            Class176.aClass348_Sub26_2332 = null
        }

        @JvmStatic
        fun method2284(i: Byte, l: Long) {
            try {
                anInt3841++
                if (Class147.aClass357ArrayArrayArray2029 != null) {
                    if (Class348_Sub40_Sub21.anInt9282 != 1 && Class348_Sub40_Sub21.anInt9282 != 5) {
                        if (Class348_Sub40_Sub21.anInt9282 == 4) method814(125.toByte(), l)
                    } else method119(-1, l)
                }
                Class348_Sub47.method3324(Class348_Sub8.aHa6654, 83.toByte(), Class367_Sub11.anInt7396.toLong())
                if (r.anInt9721 != -1) method769(r.anInt9721, 118.toByte())
                for (i_3_ in 0..<Class348_Sub38.anInt7008) {
                    if (Class152.aBooleanArray2076!![i_3_]) Class268.aBooleanArray3438!![i_3_] = true
                    Class175.aBooleanArray2326!![i_3_] = Class152.aBooleanArray2076!![i_3_]
                    Class152.aBooleanArray2076!![i_3_] = false
                }
                Class58.anInt1064 = Class367_Sub11.anInt7396
                method198(null, false, -1, -1)
                method1343(-1, null, 1, -1)
                if (r.anInt9721 != -1) {
                    Class348_Sub38.anInt7008 = 0
                    method842(false)
                }
                Class348_Sub8.aHa6654!!.la()
                Class348_Sub42_Sub20.method3281(46.toByte(), Class348_Sub8.aHa6654!!)
                var i_4_ = method1053(3112)
                if (i_4_ == -1) i_4_ = Class362.anInt4458
                if (i_4_ == -1) i_4_ = Class348_Sub42_Sub16_Sub1.anInt10447
                method338(0, i_4_)
                if (i.toInt() == -43) {
                    val i_5_ = (Class132.aPlayer_1907!!.method2436(103.toByte()) shl 8)
                    Class335.method2655(98, Class132.aPlayer_1907!!.plane.toInt(), Class348_Sub51.anInt7267, i_5_ + (Class132.aPlayer_1907!!.y), (Class132.aPlayer_1907!!.x - -i_5_))
                    Class348_Sub51.anInt7267 = 0
                }
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, "wo.B(" + i + ',' + l + ')')
            }
        }
    }
}
