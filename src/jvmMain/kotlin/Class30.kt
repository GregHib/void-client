/* Class30 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class30 internal constructor(private var anInt409: Int, private var anInt417: Int, private var anInt408: Int, i_21_: Int, i_22_: Int, i_23_: Int, i_24_: Int, i_25_: Int, i_26_: Int, i_27_: Int) {
    private var anInt404: Int
    private var anInt405: Int
    private var anInt406: Int
    private var anInt412: Int
    private var anInt416: Int
    private var anInt418: Int
    private var anInt419: Int

    fun method320(i: Int, i_4_: Int, i_5_: Byte, i_6_: Int, i_7_: Int, i_8_: Int, i_9_: Int, i_10_: Int, i_11_: Int, i_12_: Int, i_13_: Int) {
        anInt415++
        anInt409 = i_6_
        anInt417 = i_12_
        anInt405 = i_7_ * i_7_
        anInt408 = i_8_
        anInt404 = i_10_ + anInt408
        anInt412 = anInt408 + i_11_
        anInt419 = anInt409 + i_13_
        anInt418 = i_9_ + anInt409
        anInt416 = i_4_ + anInt417
        anInt406 = anInt417 - -i
        if (i_5_.toInt() != -4) aClass84_413 = null
    }

    fun method321(i: Int, i_14_: Int, i_15_: Int, i_16_: Int): Boolean {
        anInt411++
        if (anInt418 > i_16_ || i_16_ > anInt419) return false
        if (anInt416 > i_15_ || i_15_ > anInt406) return false
        if (i_14_ < anInt412 || anInt404 < i_14_) return false
        if (i != -14735) method323(null, null, 29.toByte())
        val i_17_ = -anInt409 + i_16_
        val i_18_ = i_14_ + -anInt408
        return anInt405 > i_17_ * i_17_ + i_18_ * i_18_
    }

    init {
        anInt405 = i_21_ * i_21_
        anInt412 = anInt408 + i_26_
        anInt406 = i_25_ + anInt417
        anInt416 = i_24_ + anInt417
        anInt404 = i_27_ + anInt408
        anInt419 = i_23_ + anInt409
        anInt418 = anInt409 - -i_22_
    }

    companion object {
        var anIntArray407: IntArray? = IntArray(1)
        @JvmField
        var anInt410: Int = 0
        @JvmField
        var anInt411: Int = 0
        @JvmField
        var aClass84_413: Class84? = null
        @JvmField
        var anInt414: Int = 0
        @JvmField
        var anInt415: Int = 0
        fun method319(i: Int, i_0_: Int, i_1_: Byte, i_2_: Int, i_3_: Int) {
            if (i_1_.toInt() != -18) method322(73)
            anInt414++
            Class336.anInt4171 = i_2_
            Class305.anInt3861 = i_0_
            Class18.anInt282 = i
            Class205.anInt2688 = i_3_
        }

        @JvmStatic
        fun method322(i: Int) {
            anIntArray407 = null
            aClass84_413 = null
            if (i != 1) method322(-112)
        }

        @JvmStatic
        fun method323(class45: Class45?, class297: Class297?, i: Byte) {
            try {
                Class348_Sub41.aString7048 = ""
                Class59_Sub1.aClass297_5297 = class297
                anInt410++
                Class167.aClass45_2208 = class45
                if (!Class348_Sub24.aString6877!!.startsWith("win")) {
                    if (!Class348_Sub24.aString6877!!.startsWith("linux")) {
                        if (Class348_Sub24.aString6877!!.startsWith("mac")) Class348_Sub41.aString7048 += "macos/"
                    } else Class348_Sub41.aString7048 += "linux/"
                } else Class348_Sub41.aString7048 += "windows/"
                if (i.toInt() != 95) anIntArray407 = null
                if (!Class59_Sub1.aClass297_5297!!.aBoolean3794) {
                    if (!Class348_Sub24.aString6876!!.startsWith("amd64") && !Class348_Sub24.aString6876!!.startsWith("x86_64")) {
                        if (!Class348_Sub24.aString6876!!.startsWith("i386") && !Class348_Sub24.aString6876!!.startsWith("i486") && !Class348_Sub24.aString6876!!.startsWith("i586") && !Class348_Sub24.aString6876!!.startsWith("x86")) {
                            if (!Class348_Sub24.aString6876!!.startsWith("ppc")) Class348_Sub41.aString7048 += "universal/"
                            else Class348_Sub41.aString7048 += "ppc/"
                        } else Class348_Sub41.aString7048 += "x86/"
                    } else Class348_Sub41.aString7048 += "x86_64/"
                } else Class348_Sub41.aString7048 += "msjava/"
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, ("hw.A(" + (if (class45 != null) "{...}" else "null") + ',' + (if (class297 != null) "{...}" else "null") + ',' + i + ')'))
            }
        }
    }
}
