/* Class186 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
abstract class Class186 {
    abstract fun method1398(i: Int, i_3_: Int, f: Float, f_4_: Float, i_5_: Int, f_6_: Float, i_7_: Int, f_8_: Float, i_9_: Int, i_10_: Int, fs: FloatArray)

    companion object {
        @JvmField
        var aClass45_2490: Class45? = null
        @JvmField
        var aClass74_2491: Class74?
        @JvmField
        var aBoolean2492: Boolean = false
        @JvmField
        var anInt2493: Int = 0
        @JvmField
        var aStringArray2494: Array<String?>?
        @JvmField
        var aClass351_2495: Class351?
        @JvmField
        var aString2496: String?
        @JvmField
        var anIntArray2497: IntArray?

        @JvmStatic
        fun method1396(i: Int) {
            aClass45_2490 = null
            aClass74_2491 = null
            aStringArray2494 = null
            anIntArray2497 = null
            aString2496 = null
            aClass351_2495 = null
            if (i != 25) aClass351_2495 = null
        }

        @JvmStatic
        fun method1397(i: Int) {
            anInt2493++
            val i_0_ = Class328_Sub1.anInt6513
            val `is` = Class286_Sub7.anIntArray6290!!
            for (i_1_ in 0..<i_0_) {
                val player = Class294.aPlayerArray5058!![`is`[i_1_]]
                if (player != null && (player.anInt10264) > 0) {
                    player.anInt10264--
                    if ((player.anInt10264) == 0) player.aString10292 = null
                }
            }
            for (i_2_ in i..<Class150.anInt2057) {
                val l = Class74.anIntArray1233!![i_2_].toLong()
                val class348_sub22 = (Class282.aClass356_3654!!.method3480(l, -6008) as? Class348_Sub22?)
                if (class348_sub22 != null) {
                    val npc = (class348_sub22.aNpc_6859)!!
                    if ((npc.anInt10264) > 0) {
                        npc.anInt10264--
                        if (npc.anInt10264 == 0) npc.aString10292 = null
                    }
                }
            }
        }

        init {
            aClass74_2491 = Class74(13, -1)
            aStringArray2494 = arrayOfNulls<String>(100)
            aClass351_2495 = Class351(35, 5)
            aString2496 = ""
            anIntArray2497 = IntArray(25)
        }
    }
}
