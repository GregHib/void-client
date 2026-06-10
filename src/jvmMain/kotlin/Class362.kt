import Class13.method226
import Class16.method260
import Class348_Sub17.Companion.method2929
import Class359.Companion.method3490
import Class45.Companion.method395

/* Class362 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
object Class362 {
    var aClass324_4456: Class324? = null
    var anInt4457: Int = 0
    @JvmField
    var anInt4458: Int = -1
    @JvmField
    var anInt4459: Int = 0
    var aClass183_4460: Class183? = null

    @JvmStatic
    fun method3511(bool: Boolean, class324: Class324?, class143: Class143?, string: String?, i: Int, var_ha: ha?) {
        var class324 = class324
        var class143 = class143
        try {
            if (i != 2) aClass324_4456 = null
            anInt4457++
            val bool_0_ = !Class295.aBoolean3763 || method3490(true)
            if (bool_0_) {
                if (Class295.aBoolean3763 && bool_0_) {
                    class143 = Class281.aClass143_3649
                    class324 = var_ha!!.method3686(class143, (Class5_Sub1_Sub1.aClass207Array9929), true)
                    var i_1_ = class143!!.method1187(string, false, 250, null)
                    var i_2_ = class143.method1185(null, i xor 0x2, class143.anInt1992, 250, string)
                    val i_3_ = Class348_Sub7.aClass207_6643!!.anInt2702
                    val i_4_ = i_3_ + 4
                    i_2_ += 2 * i_4_
                    i_1_ += 2 * i_4_
                    if (i_2_ < Class269.anInt3451) i_2_ = Class269.anInt3451
                    if (i_1_ < Class289.anInt3704) i_1_ = Class289.anInt3704
                    var i_5_ = (Class95.aClass221_1542!!.method1607(Class92.anInt1524, i_1_, (-107).toByte()) - -Class290.anInt3712)
                    var i_6_ = (Class239_Sub27.aClass341_6128!!.method2679(ha_Sub2.anInt7666, i_2_, 1595) + Class239_Sub3.anInt5871)
                    if (Class59_Sub1.aBoolean5300) {
                        i_5_ += s_Sub3.method4008((-124).toByte())
                        i_6_ += method260(false)
                    }
                    var_ha.method3691(Class112.aClass207_1727, false)!!.method965((Class348_Sub40_Sub1.aClass207_9090!!.anInt2702) + i_5_, (Class348_Sub40_Sub1.aClass207_9090!!.anInt2696) + i_6_, -(2 * (Class348_Sub40_Sub1.aClass207_9090!!.anInt2702)) + i_1_, -((Class348_Sub40_Sub1.aClass207_9090!!.anInt2696) * 2) + i_2_, 1, 0, 0)
                    var_ha.method3691(Class348_Sub40_Sub1.aClass207_9090, true)!!.method974(i_5_, i_6_)
                    Class348_Sub40_Sub1.aClass207_9090!!.method1518()
                    var_ha.method3691(Class348_Sub40_Sub1.aClass207_9090, true)!!.method974(i_5_ + i_1_ - i_3_, i_6_)
                    Class348_Sub40_Sub1.aClass207_9090!!.method1514()
                    var_ha.method3691(Class348_Sub40_Sub1.aClass207_9090, true)!!.method974(i_5_ - -i_1_ + -i_3_, -i_3_ + (i_6_ - -i_2_))
                    Class348_Sub40_Sub1.aClass207_9090!!.method1518()
                    var_ha.method3691(Class348_Sub40_Sub1.aClass207_9090, true)!!.method974(i_5_, -i_3_ + i_6_ - -i_2_)
                    Class348_Sub40_Sub1.aClass207_9090!!.method1514()
                    var_ha.method3691(Class348_Sub7.aClass207_6643, true)!!.method972(i_5_, (Class348_Sub40_Sub1.aClass207_9090!!.anInt2696) + i_6_, i_3_, -(2 * (Class348_Sub40_Sub1.aClass207_9090!!.anInt2696)) + i_2_)
                    Class348_Sub7.aClass207_6643!!.method1520()
                    var_ha.method3691(Class348_Sub7.aClass207_6643, true)!!.method972((Class348_Sub40_Sub1.aClass207_9090!!.anInt2702) + i_5_, i_6_, -((Class348_Sub40_Sub1.aClass207_9090!!.anInt2702) * 2) + i_1_, i_3_)
                    Class348_Sub7.aClass207_6643!!.method1520()
                    var_ha.method3691(Class348_Sub7.aClass207_6643, true)!!.method972(i_5_ - -i_1_ + -i_3_, (Class348_Sub40_Sub1.aClass207_9090!!.anInt2696) + i_6_, i_3_, -(2 * (Class348_Sub40_Sub1.aClass207_9090!!.anInt2696)) + i_2_)
                    Class348_Sub7.aClass207_6643!!.method1520()
                    var_ha.method3691(Class348_Sub7.aClass207_6643, true)!!.method972((Class348_Sub40_Sub1.aClass207_9090!!.anInt2702) + i_5_, -i_3_ + i_6_ - -i_2_, -(2 * (Class348_Sub40_Sub1.aClass207_9090!!.anInt2702)) + i_1_, i_3_)
                    Class348_Sub7.aClass207_6643!!.method1520()
                    class324!!.method2584(null, 0, -1, null, 0xffffff.inv() or Class86.anInt1479, 1, i_2_ + -(i_4_ * 2), null, i_6_ + i_4_, 0, 0, -(2 * i_4_) + i_1_, i_5_ + i_4_, false, 1, string)
                    method226(i_5_, i_1_, i_6_, i xor 0x2, i_2_)
                } else {
                    val i_7_ = class143!!.method1187(string, false, 250, null)
                    val i_8_ = class143.method1190(null, 1, string, 250) * 13
                    val i_9_ = 4
                    val i_10_ = 6 - -i_9_
                    val i_11_ = i_9_ + 6
                    var_ha!!.aa(i_10_ + -i_9_, i_11_ + -i_9_, i_9_ + i_7_ + i_9_, i_8_ + (i_9_ - -i_9_), -16777216, 0)
                    var_ha.method3628(i_10_ - i_9_, -i_9_ + i_11_, i_9_ + (i_7_ + i_9_), i_9_ + i_9_ + i_8_, -1, 0)
                    class324!!.method2584(null, 0, -1, null, -1, 1, i_8_, null, i_11_, 0, 0, i_7_, i_10_, false, 1, string)
                    method226(i_10_ - i_9_, i_9_ + i_7_ - -i_9_, i_11_ + -i_9_, i + -2, i_9_ + i_8_ - -i_9_)
                }
                if (bool) {
                    try {
                        if (!Class59_Sub1.aBoolean5300) var_ha.method3689(118.toByte())
                        else method395(i + 79)
                    } catch (exception_sub1: Exception_Sub1) {
                        /* empty */
                    }
                }
            }
        } catch (runtimeexception: RuntimeException) {
            throw method2929(runtimeexception, ("fg.A(" + bool + ',' + (if (class324 != null) "{...}" else "null") + ',' + (if (class143 != null) "{...}" else "null") + ',' + (if (string != null) "{...}" else "null") + ',' + i + ',' + (if (var_ha != null) "{...}" else "null") + ')'))
        }
    }

    @JvmStatic
    fun method3512(i: Int) {
        aClass183_4460 = null
        if (i != 4) anInt4458 = 96
        aClass324_4456 = null
    }
}
