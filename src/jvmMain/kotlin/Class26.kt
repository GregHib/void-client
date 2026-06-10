/* Class26 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class26 internal constructor(class45: Class45?, class45_9_: Class45?) {
    private val aClass356_374 = Class356(256)
    private val aClass45_377: Class45?
    private val aClass45_379: Class45?
    private val aClass356_381 = Class356(256)
    private fun method307(i: Int, `is`: IntArray?, i_0_: Int, i_1_: Int): Class348_Sub19_Sub1? {
        anInt378++
        var i_2_ = i xor (i_1_ ushr 12 or (i_1_ shl 4 and 0xfff1))
        i_2_ = i_2_ or (i_1_ shl 16)
        val l = i_2_.toLong()
        var class348_sub19_sub1 = aClass356_381.method3480(l, -6008) as Class348_Sub19_Sub1?
        if (class348_sub19_sub1 != null) return class348_sub19_sub1
        if (`is` != null && `is`[0] <= 0) return null
        val class317 = Class317.method2372(aClass45_379!!, i_1_, i)
        if (i_0_ < 50) Companion.method311((-60).toByte(), 'n')
        if (class317 == null) return null
        class348_sub19_sub1 = class317.method2369()
        aClass356_381.method3483(32.toByte(), l, class348_sub19_sub1)
        if (`is` != null) `is`[0] -= (class348_sub19_sub1.aByteArray8984)!!.size
        return class348_sub19_sub1
    }

    fun method308(i: Int, `is`: IntArray?, i_3_: Int): Class348_Sub19_Sub1? {
        anInt373++
        if ((aClass45_379!!.method414(-1).inv()) == i_3_) return method307(i, `is`, 122, 0)
        if (aClass45_379.method407(0, i) == 1) return method307(0, `is`, 69, i)
        throw RuntimeException()
    }

    fun method309(`is`: IntArray?, i: Int, i_4_: Int): Class348_Sub19_Sub1? {
        anInt376++
        if (aClass45_377!!.method414(i_4_) == 1) return method310(i, 0, 92.toByte(), `is`)
        if (aClass45_377.method407(0, i) == 1) return method310(0, i, 78.toByte(), `is`)
        if (i_4_ != -1) method307(44, null, -124, -47)
        throw RuntimeException()
    }

    private fun method310(i: Int, i_5_: Int, i_6_: Byte, `is`: IntArray?): Class348_Sub19_Sub1? {
        anInt375++
        var i_7_ = i xor (0xfff0 and (i_5_ shl 4) or (i_5_ ushr 12))
        i_7_ = i_7_ or (i_5_ shl 16)
        val i_8_ = -113 / ((i_6_ - 16) / 34)
        val l = i_7_.toLong() xor 0x100000000L
        var class348_sub19_sub1 = aClass356_381.method3480(l, -6008) as Class348_Sub19_Sub1?
        if (class348_sub19_sub1 != null) return class348_sub19_sub1
        if (`is` != null && `is`[0] <= 0) return null
        var class348_sub10 = aClass356_374.method3480(l, -6008) as Class348_Sub10?
        if (class348_sub10 == null) {
            class348_sub10 = Class348_Sub10.method2795(aClass45_377!!, i_5_, i)
            if (class348_sub10 == null) return null
            aClass356_374.method3483(108.toByte(), l, class348_sub10)
        }
        class348_sub19_sub1 = class348_sub10.method2791(`is`)
        if (class348_sub19_sub1 == null) return null
        class348_sub10.method2715(27.toByte())
        aClass356_381.method3483(117.toByte(), l, class348_sub19_sub1)
        return class348_sub19_sub1
    }

    init {
        try {
            aClass45_377 = class45_9_
            aClass45_379 = class45
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("hs.<init>(" + (if (class45 != null) "{...}" else "null") + ',' + (if (class45_9_ != null) "{...}" else "null") + ')'))
        }
    }

    companion object {
        @JvmField
        var anInt373: Int = 0
        @JvmField
        var anInt375: Int = 0
        @JvmField
        var anInt376: Int = 0
        @JvmField
        var anInt378: Int = 0
        @JvmField
        var anInt380: Int = 0
        @JvmField
        var aClass364_382: Class364? = Class364("WTQA", 2)
        @JvmField
        var anInt383: Int
        var aBoolean384: Boolean = false
        @JvmField
        var anInt385: Int = 0
        @JvmField
        var anInt386: Int = 0

        @JvmStatic
        fun method306(bool: Boolean) {
            aClass364_382 = null
            if (bool != true) Companion.method311((-5).toByte(), '\u0002')
        }

        fun method311(i: Byte, c: Char): Boolean {
            anInt380++
            if (i <= 85) Companion.method311((-75).toByte(), '\u000c')
            return c.code == 160 || c.code == 32 || c.code == 95 || c.code == 45
        }

        init {
            anInt383 = 0
        }
    }
}
