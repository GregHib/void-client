import Class93.method864

/* Class173 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class173 {
    override fun toString(): String {
        anInt2282++
        throw IllegalStateException()
    }

    companion object {
        var anInt2282: Int = 0
        var anInt2283: Int = 0
        var anInt2284: Int = 0
        var aClass114_2285: Class114? = Class114(77, 4)
        var aLong2286: Long = 0L

        @JvmStatic
        fun method1329(i: Int) {
            if (i != 4) method1329(95)
            aClass114_2285 = null
        }

        fun method1330(i: Int, i_0_: Int, i_1_: Int) {
            anInt2284++
            val class348_sub42_sub15 = Class318_Sub9_Sub1.method2516(i_1_, 105.toByte(), 5)
            class348_sub42_sub15.method3246(-25490)
            if (i_0_ != -19906) method1329(71)
            class348_sub42_sub15.anInt9652 = i
        }

        @JvmStatic
        fun method1331(i: Byte, `object`: Any?, i_2_: Int, i_3_: Int): ByteArray? {
            anInt2283++
            if (`object` == null) return null
            if (`object` is ByteArray) {
                val `is` = `object`
                return method864(i_2_, `is`, i_3_, -104)
            }
            if (i < 89) aClass114_2285 = null
            if (`object` is Class344) {
                val class344 = `object`
                return class344.method2689(2, i_3_, i_2_)
            }
            throw IllegalArgumentException()
        }
    }
}
