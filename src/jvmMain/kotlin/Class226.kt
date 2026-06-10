/* Class226 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class226 internal constructor(i: Int, class45: Class45?, class45_3_: Class45?) {
    private val aClass60_2960 = Class60(64)
    private val aClass45_2961: Class45?
    private var aClass45_2965: Class45? = null

    fun method1625(i: Int, i_0_: Int): Class348_Sub42_Sub11 {
        anInt2963++
        var class348_sub42_sub11 = aClass60_2960.method583(i_0_.toLong(), -51) as Class348_Sub42_Sub11?
        if (class348_sub42_sub11 != null) return class348_sub42_sub11
        val `is`: ByteArray?
        if (i_0_ < 32768) `is` = aClass45_2961!!.method410(-1860, 0, i_0_)
        else `is` = aClass45_2965!!.method410(-1860, 0, 0x7fff and i_0_)
        class348_sub42_sub11 = Class348_Sub42_Sub11()
        if (`is` != null) class348_sub42_sub11.method3221(117, Class348_Sub49(`is`))
        if (i_0_ >= 32768) class348_sub42_sub11.method3224(104.toByte())
        if (i != 0) aClass45_2965 = null
        aClass60_2960.method582(class348_sub42_sub11, i_0_.toLong(), (-123).toByte())
        return class348_sub42_sub11
    }

    init {
        do {
            try {
                aClass45_2961 = class45
                aClass45_2965 = class45_3_
                if (aClass45_2961 != null) aClass45_2961.method407(0, 0)
                if (aClass45_2965 == null) break
                aClass45_2965!!.method407(0, 0)
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, ("sga.<init>(" + i + ',' + (if (class45 != null) "{...}" else "null") + ',' + (if (class45_3_ != null) "{...}" else "null") + ')'))
            }
            break
        } while (false)
    }

    companion object {
        @JvmField
        var aClass356_2959: Class356? = Class356(512)
        var anInt2962: Int = 0
        var anInt2963: Int = 0
        @JvmField
        var anInt2964: Int = 64
        @JvmStatic
        fun method1624(i: Int) {
            aClass356_2959 = null
            if (i != 28962) aClass356_2959 = null
        }

        @JvmStatic
        fun method1626(i: Int, bool: Boolean) {
            anInt2962++
            var i_1_ = Class239_Sub19.anInt6043
            var i_2_ = Class348_Sub33.anInt6964
            if (i == 1) {
                if (bool && Class305.aBoolean3870) {
                    i_1_ = i_1_ shl 1
                    i_2_ = -i_1_
                }
                Class348_Sub8.aHa6654!!.f(i_2_, i_1_)
            }
        }
    }
}
