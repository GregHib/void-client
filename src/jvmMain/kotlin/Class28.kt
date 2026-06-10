/* Class28 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class28 : Interface15 {
    override fun method54(i: Int, l: Long, class138: Class138?, `is`: IntArray?): String? {
        try {
            anInt4996++
            if (Class234.aClass138_3044 == class138) {
                val class117 = Class348_Sub7.aClass33_6653!!.method337(true, `is`!![0])
                return class117.method1074(l.toInt(), 91)
            }
            if (Class299_Sub1.aClass138_6321 == class138 || za.aClass138_7274 == class138) {
                val class213 = Exception_Sub1.aClass255_112!!.method1940(i + -99, l.toInt())
                return class213.aString2795
            }
            if (i != 1) method54(85, -41L, null, null)
            if (class138 == Class348_Sub42_Sub5.aClass138_9530 || class138 == Class348_Sub49_Sub1.aClass138_9748 || Class71.aClass138_1213 == class138) return Class348_Sub7.aClass33_6653!!.method337(true, `is`!![0]).method1074(l.toInt(), i xor 0x48)
            return null
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("hu.A(" + i + ',' + l + ',' + (if (class138 != null) "{...}" else "null") + ',' + (if (`is` != null) "{...}" else "null") + ')'))
        }
    }

    companion object {
        @JvmField
        var anInt4996: Int = 0
        @JvmField
        var aClass223_4997: Class223? = Class223(6, 1)
        var aClass114_4998: Class114?
        @JvmField
        var anInt4999: Int = 0
        @JvmField
        var aString5000: String? = null
        @JvmField
        var aString5001: String? = null
        @JvmField
        var aBoolean5002: Boolean = false

        @JvmStatic
        fun method318(i: Int) {
            aString5001 = null
            aString5000 = null
            val i_0_ = 74 / ((i - 58) / 49)
            aClass223_4997 = null
            aClass114_4998 = null
        }

        init {
            aClass114_4998 = Class114(59, 3)
        }
    }
}
