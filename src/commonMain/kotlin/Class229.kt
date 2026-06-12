/* Class229 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class229 {
    companion object {
        var anInt2976: Int = 0
        var anInt2977: Int = 0
        // Class45/Class268/Class194 are jvmMain-only types; held as Any? here and
        // cast to their concrete types at jvmMain call-sites.
        var aClass45_2978: Any? = null
        var aClass268_2979: Any? = null
        var anInt2980: Int = 0
        var aClass194_2981: Any? = null

        fun method1631(bool: Boolean): Class241 {
            anInt2980++
            if (bool != false) aClass194_2981 = null
            try {
                return Class241_Sub2()
            } catch (throwable: Throwable) {
                try {
                    return Class241_Sub3()
                } catch (throwable_0_: Throwable) {
                    return Class241_Sub1()
                }
            }
        }

        fun method1632(i: Int) {
            aClass45_2978 = null
            val i_1_ = -20 / ((-87 - i) / 34)
            aClass194_2981 = null
            aClass268_2979 = null
        }

        fun method1633(bool: Boolean, i: Int, i_2_: Int): Boolean {
            if (bool != false) method1633(false, 85, -80)
            anInt2977++
            return (0x400 and i) != 0
        }
    }
}
