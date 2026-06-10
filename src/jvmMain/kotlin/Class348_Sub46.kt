import Class183.Companion.method1376
import Class185.Companion.method1394
import Class348_Sub14.Companion.method2808
import java.io.IOException

/* Class348_Sub46 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class348_Sub46 : Class348 {
    var aString7111: String? = null

    constructor()

    internal constructor(string: String?, i: Int) {
        this.aString7111 = string
    }

    companion object {
        var anInt7109: Int = 0
        var anInt7110: Int = 0
        var anInt7112: Int = 0
        var aClass114_7113: Class114? = Class114(97, 0)
        var anInt7114: Int = 0
        @JvmField
        var anInt7115: Int = 1

        @JvmStatic
        fun method3317(i: Byte) {
            if (Class299_Sub1.aFileOutputStream6323 != null) {
                try {
                    Class299_Sub1.aFileOutputStream6323!!.close()
                } catch (ioexception: IOException) {
                    /* empty */
                }
            }
            if (i > -33) method3321(-73, 3, 6)
            anInt7110++
            Class299_Sub1.aFileOutputStream6323 = null
        }

        @JvmStatic
        fun method3318(i: Byte) {
            aClass114_7113 = null
        }

        fun method3319(var_ha: ha?, i: Byte) {
            if (i > -108) method3321(19, 60, 108)
            anInt7114++
            if (((Class132.aPlayer_1907!!.plane).toInt() != Class334.anInt4155) && Class147.aClass357ArrayArrayArray2029 != null) {
                if (method2808((Class132.aPlayer_1907!!.plane).toInt(), var_ha, true)) Class334.anInt4155 = Class132.aPlayer_1907!!.plane.toInt()
            }
        }

        fun method3320(class318_sub1_sub3: Class318_Sub1_Sub3, bool: Boolean) {
            for (i in class318_sub1_sub3.aShort8743..class318_sub1_sub3.aShort8751) {
                for (i_0_ in class318_sub1_sub3.aShort8750..class318_sub1_sub3.aShort8747) {
                    val class357 = (Class147.aClass357ArrayArrayArray2029!![class318_sub1_sub3.plane.toInt()]!![i]!![i_0_])
                    if (class357 != null) {
                        var class148 = class357.aClass148_4396
                        var class148_1_: Class148? = null
                        while ( /**/class148 != null) {
                            if (class148.aClass318_Sub1_Sub3_2040 === class318_sub1_sub3) {
                                if (class148_1_ != null) class148_1_.aClass148_2038 = class148.aClass148_2038
                                else class357.aClass148_4396 = class148.aClass148_2038
                                class148.method1199((-106).toByte())
                                break
                            }
                            class148_1_ = class148
                            class148 = class148.aClass148_2038
                        }
                    }
                }
            }
            if (!bool) method1376(class318_sub1_sub3)
        }

        fun method3321(i: Int, i_2_: Int, i_3_: Int): Class357? {
            if (Class147.aClass357ArrayArrayArray2029!![i]!![i_2_]!![i_3_] == null) {
                val bool = (Class147.aClass357ArrayArrayArray2029!![0]!![i_2_]!![i_3_] != null && Class147.aClass357ArrayArrayArray2029!![0]!![i_2_]!![i_3_]!!.aClass357_4400 != null)
                if (bool && i >= Class189.anInt2524 - 1) return null
                method1394(i, i_2_, i_3_)
            }
            return Class147.aClass357ArrayArrayArray2029!![i]!![i_2_]!![i_3_]
        }

        fun method3322(i: Int, class348_sub49: Class348_Sub49): Class369_Sub3 {
            anInt7109++
            val class369 = Class348_Sub16_Sub2.method2834((-125).toByte(), class348_sub49)
            val i_4_ = class348_sub49.readUnsignedShort(i xor 0x3235f8f8)
            val i_5_ = class348_sub49.readUnsignedShort(842397944)
            if (i != 0) aClass114_7113 = null
            val i_6_ = class348_sub49.readUnsignedShort(842397944)
            val i_7_ = class348_sub49.readUnsignedShort(i + 842397944)
            val i_8_ = class348_sub49.readUnsignedShort(842397944)
            val i_9_ = class348_sub49.readUnsignedShort(842397944)
            return Class369_Sub3(class369.aClass221_4968, class369.aClass341_4973, class369.anInt4970, class369.anInt4959, class369.anInt4971, class369.anInt4963, class369.anInt4966, class369.anInt4965, class369.anInt4961, i_4_, i_5_, i_6_, i_7_, i_8_, i_9_)
        }
    }
}
