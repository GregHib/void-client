import Class184.Companion.method1387

/* Class363 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
object Class363 {
    var aString4461: String? = ""
    var anInt4462: Int = 0
    var anIntArray4463: IntArray? = IntArray(8)
    var anInt4464: Int = 0
    var anInt4465: Int = 0

    fun method3513(i: Int) {
        synchronized(Class318.aClass243Array3974!!) {
            var i_0_ = 0
            while ((i_0_ < Class318.aClass243Array3974!!.size)) {
                Class318.aClass243Array3974!![i_0_] = Class243()
                Class331.anIntArray4128!![i_0_] = 0
                i_0_++
            }
        }
        anInt4462++
        val i_1_ = 60 / ((-36 - i) / 57)
    }

    fun method3514(i: Byte) {
        anInt4465++
        var class348_sub27 = (Class348_Sub42_Sub20.aClass262_9711!!.method1995(4) as Class348_Sub27?)
        while (class348_sub27 != null) {
            if (class348_sub27.anInt6893 == -1) {
                class348_sub27.anInt6894 = 0
                if ((class348_sub27.anInt6905 >= 0) && class348_sub27.anInt6896 >= 0 && (class348_sub27.anInt6905 < Class367_Sub4.anInt7319) && (class348_sub27.anInt6896 < Class348_Sub40_Sub3.anInt9109)) method1387(i + 26, class348_sub27)
            } else class348_sub27.method2715(39.toByte())
            class348_sub27 = Class348_Sub42_Sub20.aClass262_9711!!.method1990(57.toByte()) as Class348_Sub27?
        }
        if (i.toInt() != -105) method3516(-128)
    }

    fun method3515(i: Int) {
        val i_2_ = 52 / ((33 - i) / 40)
        Class348_Sub40.aClass356_7041!!.method3481(0)
        anInt4464++
    }

    @JvmStatic
    fun method3516(i: Int) {
        aString4461 = null
        if (i <= 123) anIntArray4463 = null
        anIntArray4463 = null
    }
}
