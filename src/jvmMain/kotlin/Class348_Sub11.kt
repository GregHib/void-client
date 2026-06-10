/* Class348_Sub11 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class348_Sub11 : Class348(), Interface6 {
    var aChar4761: Char = 0.toChar()
    var aLong4764: Long = 0
    var anInt4766: Int = 0
    var anInt4767: Int = 0
    var anInt4771: Int = 0

    override fun method27(i: Int): Int {
        if (i != 26276) method27(113)
        anInt4769++
        return this.anInt4771
    }

    override fun method28(i: Byte): Char {
        anInt4768++
        if (i < 8) method27(113)
        return this.aChar4761
    }

    override fun method26(i: Int): Int {
        anInt4762++
        if (i != -7616) method29(38.toByte())
        return this.anInt4766
    }

    override fun method29(i: Byte): Long {
        val i_0_ = 17 / ((i - 46) / 58)
        anInt4765++
        return this.aLong4764
    }

    override fun method30(bool: Boolean): Int {
        anInt4760++
        if (bool != false) return -114
        return this.anInt4767
    }

    companion object {
        var anInt4760: Int = 0
        var anInt4762: Int = 0
        var anInt4763: Int = 0
        var anInt4765: Int = 0
        var anInt4768: Int = 0
        var anInt4769: Int = 0
        var aClass45_4770: Class45? = null
        @JvmStatic
        fun method2796(i: Byte) {
            aClass45_4770 = null
            if (i.toInt() != 104) Companion.method2796((-6).toByte())
        }

        fun method2797(string: String?, i: Byte): Boolean {
            anInt4763++
            if (string == null) return false
            var i_1_ = 0
            while ((i_1_ < Class348_Sub40_Sub30.anInt9383)) {
                if (string.equals(Class83.aStringArray1441!![i_1_], ignoreCase = true)) return true
                i_1_++
            }
            if (string.equals(Class132.aPlayer_1907!!.aString10544, ignoreCase = true)) return true
            if (i.toInt() != -63) return false
            return false
        }
    }
}
