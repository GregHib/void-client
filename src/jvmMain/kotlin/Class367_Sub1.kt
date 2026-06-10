import Class239_Sub28.Companion.method1843

/* Class367_Sub1 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class367_Sub1 internal constructor(var_ha_Sub3: ha_Sub3) : Class367(var_ha_Sub3) {
    override fun method3520(i: Byte) {
        anInt7278++
        if (i.toInt() == 87) {
            /* empty */
        }
    }

    override fun method3526(i: Int, i_9_: Int, i_10_: Int) {
        anInt7284++
        if (i != 10756) method3525(-42, false)
    }

    override fun method3525(i: Int, bool: Boolean) {
        anInt7285++
        if (i == 15192) {
            /* empty */
        }
    }

    override fun method3527(i: Int, interface18: Interface18?, i_12_: Int) {
        this.aHa_Sub3_4479.method3850(81.toByte(), interface18)
        anInt7280++
        this.aHa_Sub3_4479.method3923(true, i)
        if (i_12_ == -16776) {
            /* empty */
        }
    }

    override fun method3530(i: Int): Boolean {
        anInt7283++
        if (i >= -57) method3530(-90)
        return false
    }

    override fun method3521(bool: Boolean, i: Byte) {
        anInt7277++
        if (i.toInt() != -103) method3527(-12, null, 67)
    }

    companion object {
        @JvmField
        var anInt7277: Int = 0
        @JvmField
        var anInt7278: Int = 0
        @JvmField
        var anInt7279: Int = 0
        @JvmField
        var anInt7280: Int = 0
        @JvmField
        var anInt7281: Int = 0
        @JvmField
        var anInt7282: Int = 0
        @JvmField
        var anInt7283: Int = 0
        @JvmField
        var anInt7284: Int = 0
        @JvmField
        var anInt7285: Int = 0

        @JvmStatic
        fun method3533(i: Byte, i_0_: Int, i_1_: Int, i_2_: Int, f: Float, i_3_: Int, bool: Boolean, i_4_: Int): IntArray {
            anInt7281++
            val `is` = IntArray(i_0_)
            val class348_sub40_sub8 = Class348_Sub40_Sub8()
            class348_sub40_sub8.anInt9149 = (f * 4096.0f).toInt()
            class348_sub40_sub8.anInt9164 = i_4_
            class348_sub40_sub8.anInt9150 = i_1_
            class348_sub40_sub8.aBoolean9160 = bool
            class348_sub40_sub8.anInt9158 = i_2_
            class348_sub40_sub8.anInt9156 = i_3_
            class348_sub40_sub8.method3044(110)
            Class79.method797(1, i_0_, 115.toByte())
            class348_sub40_sub8.method3069(0, `is`, 115.toByte())
            if (i < 89) method3535(72, -40)
            return `is`
        }

        @JvmStatic
        fun method3534(bool: Boolean, i: Int, i_5_: Int, bool_6_: Boolean, i_7_: Int, class46s: Array<Class46?>) {
            anInt7279++
            if (bool == false) {
                for (i_8_ in class46s.indices) {
                    val class46 = class46s[i_8_]
                    if (class46 != null && i == class46.anInt834) {
                        method1843(i_5_, -326, class46, bool_6_, i_7_)
                        Class14_Sub1.method239(115.toByte(), i_5_, i_7_, class46)
                        if ((-class46.anInt709 + class46.anInt698) < class46.anInt747) class46.anInt747 = (class46.anInt698 - class46.anInt709)
                        if (class46.anInt747 < 0) class46.anInt747 = 0
                        if ((class46.anInt791 - class46.anInt789) < class46.anInt755) class46.anInt755 = (class46.anInt791 - class46.anInt789)
                        if (class46.anInt755 < 0) class46.anInt755 = 0
                        if (class46.anInt774 == 0) Class251.method1913(bool_6_, -116, class46)
                    }
                }
            }
        }

        @JvmStatic
        fun method3535(i: Int, i_11_: Int) {
            Class171.anInt2275 = i
            anInt7282++
            Class15.aClass60_225!!.method590(i_11_)
        }
    }
}
