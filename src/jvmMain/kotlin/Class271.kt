/* Class271 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class271 internal constructor(class230: Class230?, i: Int, class45: Class45?) {
    private val aClass60_3466 = Class60(64)
    private val aClass45_3468: Class45?
    fun method2044(i: Int, i_0_: Int): Class348_Sub42_Sub7 {
        anInt3469++
        var class348_sub42_sub7: Class348_Sub42_Sub7?
        synchronized(aClass60_3466) {
            class348_sub42_sub7 = aClass60_3466.method583(i_0_.toLong(), -85) as Class348_Sub42_Sub7?
        }
        if (class348_sub42_sub7 != null) return class348_sub42_sub7
        val `is`: ByteArray?
        synchronized(aClass45_3468!!) {
            `is` = aClass45_3468.method410(-1860, 5, i_0_)
        }
        class348_sub42_sub7 = Class348_Sub42_Sub7()
        if (i < 78) method2046()
        if (`is` != null) class348_sub42_sub7.method3192(16.toByte(), Class348_Sub49(`is`))
        synchronized(aClass60_3466) {
            aClass60_3466.method582(class348_sub42_sub7, i_0_.toLong(), (-93).toByte())
        }
        return class348_sub42_sub7
    }

    init {
        try {
            aClass45_3468 = class45
            aClass45_3468!!.method407(0, 5)
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("ut.<init>(" + (if (class230 != null) "{...}" else "null") + ',' + i + ',' + (if (class45 != null) "{...}" else "null") + ')'))
        }
    }

    companion object {
        var aClass114_3467: Class114? = Class114(45, 8)
        var anInt3469: Int = 0

        @JvmStatic
        fun method2045(i: Byte) {
            aClass114_3467 = null
            if (i.toInt() != 62) method2046()
        }

        fun method2046() {
            Class71.aClass76_1208 = Class71.aClass76_1210
        }
    }
}
