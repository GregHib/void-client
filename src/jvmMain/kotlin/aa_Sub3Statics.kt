/**
 * JVM-only companion members for [aa_Sub3] — split out so the class body can live in commonMain.
 * Mirrors the pattern of other *Statics files (e.g. Class238Statics, aa_Sub3Statics).
 */
object aa_Sub3Statics {
    var aClass351_5200: Class351? = Class351(13, 2)
    var anInt5203: Int = 0
    var aClass351_5204: Class351? = Class351(15, 8)
    var anInt5205: Int = 0
    var aClass348_Sub6_5206: Class348_Sub6? = Class348_Sub6(0, 0)
    var aClass45_5207: Class45? = null

    /*synthetic*/
    var aClass5208: Class<*>? = null

    @JvmStatic
    fun method166(i: Byte, i_0_: Int, i_1_: Int): Boolean {
        if (i < 5) method166((-119).toByte(), -93, 73)
        anInt5203++
        return (i_1_ and 0x800) != 0 && (i_0_ and 0x37) != 0
    }

    @JvmStatic
    fun method167(i: Int) {
        if (i != 19612) method167(-70)
        aClass351_5200 = null
        aClass351_5204 = null
        aClass348_Sub6_5206 = null
        aClass45_5207 = null
    }

    fun method168(i: Byte) {
        do {
            if (!Class348_Sub23_Sub1.aClass297_8992!!.aBoolean3794) {
                try {
                    try {
                        Class226.anInt2964 = RuntimeInfoProvider.instance.maxMemoryMb()
                    } catch (throwable: Throwable) {
                        /* empty */
                    }
                    break
                } catch (exception: Exception) {
                    break
                }
            }
            Class226.anInt2964 = 96
        } while (false)
        val i_2_ = 15 % (i / 51)
        anInt5205++
    }
}
