/* Class16 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
object Class16 {
    @JvmField
    var anInt230: Int = 0
    @JvmField
    var aClass148_231: Class148? = null
    @JvmField
    var anInt232: Int = 0
    @JvmField
    var aClass45_233: Class45? = null
    @JvmField
    var anInt234: Int = 0

    @JvmStatic
    fun method258(i: Int, i_0_: Int) {
        val class357 = Class147.aClass357ArrayArrayArray2029!![0]!![i]!![i_0_]
        for (i_1_ in 0..2) {
            val class357_2_ = (Class147.aClass357ArrayArrayArray2029!![i_1_ + 1]!![i]!![i_0_].also { Class147.aClass357ArrayArrayArray2029!![i_1_]!![i]!![i_0_] = it })
            if (class357_2_ != null) {
                var class148 = class357_2_.aClass148_4396
                while (class148 != null) {
                    val class318_sub1_sub3 = class148.aClass318_Sub1_Sub3_2040!!
                    if ((class318_sub1_sub3.aShort8743.toInt() == i) && (class318_sub1_sub3.aShort8750).toInt() == i_0_) class318_sub1_sub3.plane--
                    class148 = class148.aClass148_2038
                }
                if (class357_2_.aClass318_Sub1_Sub1_4402 != null) class357_2_.aClass318_Sub1_Sub1_4402!!.plane--
                if (class357_2_.aClass318_Sub1_Sub4_4406 != null) class357_2_.aClass318_Sub1_Sub4_4406!!.plane--
                if (class357_2_.aClass318_Sub1_Sub4_4403 != null) class357_2_.aClass318_Sub1_Sub4_4403!!.plane--
                if (class357_2_.aClass318_Sub1_Sub5_4395 != null) class357_2_.aClass318_Sub1_Sub5_4395!!.plane--
                if (class357_2_.aClass318_Sub1_Sub5_4407 != null) class357_2_.aClass318_Sub1_Sub5_4407!!.plane--
            }
        }
        if (Class147.aClass357ArrayArrayArray2029!![0]!![i]!![i_0_] == null) {
            Class147.aClass357ArrayArrayArray2029!![0]!![i]!![i_0_] = Class357(0)
            Class147.aClass357ArrayArrayArray2029!![0]!![i]!![i_0_]!!.aByte4399 = 1.toByte()
        }
        Class147.aClass357ArrayArrayArray2029!![0]!![i]!![i_0_]!!.aClass357_4400 = class357
        Class147.aClass357ArrayArrayArray2029!![3]!![i]!![i_0_] = null
    }

    @JvmStatic
    fun method259(i: Int, i_3_: Int, bool: Boolean, string: String?, i_4_: Int) {
        anInt230++
        Class178.method1356(false, null, i, i_4_, bool, string, true)
        val i_5_ = -1 / ((i_3_ - -33) / 63)
    }

    @JvmStatic
    fun method260(bool: Boolean): Int {
        if (bool != false) aClass45_233 = null
        anInt232++
        if (Class348_Sub49.anInt7207 == 1) return Class348_Sub40_Sub8.anInt9157
        return 0
    }

    @JvmStatic
    fun method261(i: Byte) {
        aClass45_233 = null
        aClass148_231 = null
        if (i.toInt() != -120) method262(-23)
    }

    @JvmStatic
    fun method262(i: Int) {
        anInt234++
        if (i != 0) aClass148_231 = null
        if (!Class160.aBoolean2130) {
            Class160.aBoolean2130 = true
            Class205.aFloat2687 += (-Class205.aFloat2687 + -24.0f) / 2.0f
            Class369_Sub3_Sub1.aBoolean10174 = true
        }
    }
}
