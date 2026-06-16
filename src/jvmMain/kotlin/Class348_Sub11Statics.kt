/**
 * JVM-only statics split out of [Class348_Sub11]'s companion so the event node
 * class could move to commonMain. [method2796] and [method2797] reference
 * JVM game globals (Class45, Class83, Class132, Class348_Sub40_Sub30).
 */
object Class348_Sub11Statics {
    var aClass45_4770: Class45? = null

    fun method2796(i: Byte) {
        aClass45_4770 = null
        if (i.toInt() != 104) method2796((-6).toByte())
    }

    fun method2797(string: String?, i: Byte): Boolean {
        Class348_Sub11.anInt4763++
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
