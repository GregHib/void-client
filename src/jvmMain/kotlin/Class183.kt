import Class239_Sub26.Companion.method1837
import Class348_Sub42_Sub8.Companion.method3194

/* Class183 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class183 internal constructor(class230: Class230?, i: Int, class45: Class45?) {
    private val aClass60_2458 = Class60(128)
    private val aClass45_2461: Class45?
    fun method1377(i: Int) {
        anInt2457++
        if (i != 2) method1376(null)
        synchronized(aClass60_2458) {
            aClass60_2458.method587(-125)
        }
    }

    fun method1380(bool: Boolean, i: Int): Class22? {
        anInt2460++
        if (bool != true) return null
        var class22: Class22?
        synchronized(aClass60_2458) {
            class22 = aClass60_2458.method583(i.toLong(), 77) as Class22?
        }
        if (class22 != null) return class22
        val `is`: ByteArray?
        synchronized(aClass45_2461!!) {
            `is` = aClass45_2461.method410(-1860, 1, i)
        }
        class22 = Class22()
        if (`is` != null) class22.method290(Class348_Sub49(`is`), -1)
        synchronized(aClass60_2458) {
            aClass60_2458.method582(class22, i.toLong(), (-124).toByte())
        }
        return class22
    }

    fun method1381(bool: Boolean) {
        synchronized(aClass60_2458) {
            if (bool != true) method1382(-96, 76)
            aClass60_2458.method590(0)
        }
        anInt2465++
    }

    fun method1383(i: Int, i_7_: Int) {
        anInt2467++
        synchronized(aClass60_2458) {
            aClass60_2458.method578(2, i_7_)
        }
        if (i != 32841) anInt2464 = 86
    }

    init {
        try {
            aClass45_2461 = class45
            aClass45_2461!!.method407(0, 1)
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("qe.<init>(" + (if (class230 != null) "{...}" else "null") + ',' + i + ',' + (if (class45 != null) "{...}" else "null") + ')'))
        }
    }

    companion object {
        var anInt2457: Int = 0
        var anInt2459: Int = 0
        var anInt2460: Int = 0
        @JvmField
        var aClass250_2462: Class250? = null
        var anInt2463: Int = 0
        @JvmField
        var anInt2464: Int = 0
        var anInt2465: Int = 0
        var anIntArray2466: IntArray? = IntArray(14)
        var anInt2467: Int = 0

        @JvmStatic
        fun method1376(class318_sub1: Class318_Sub1?) {
            if (class318_sub1 != null) {
                for (i in 0..1) {
                    var class318_sub1_0_: Class318_Sub1? = null
                    var class318_sub1_1_ = Class348.aClass318_Sub1Array4293!![i]
                    while (class318_sub1_1_ != null) {
                        if (class318_sub1_1_ === class318_sub1) {
                            if (class318_sub1_0_ != null) class318_sub1_0_.aClass318_Sub1_6379 = (class318_sub1_1_.aClass318_Sub1_6379)
                            else Class348.aClass318_Sub1Array4293!![i] = (class318_sub1_1_.aClass318_Sub1_6379)
                            Class348_Sub16_Sub2.aBoolean8870 = true
                            return
                        }
                        class318_sub1_0_ = class318_sub1_1_
                        class318_sub1_1_ = (class318_sub1_1_.aClass318_Sub1_6379)
                    }
                    class318_sub1_0_ = null
                    var class318_sub1_2_ = Class250.aClass318_Sub1Array3226!![i]
                    while (class318_sub1_2_ != null) {
                        if (class318_sub1_2_ === class318_sub1) {
                            if (class318_sub1_0_ != null) class318_sub1_0_.aClass318_Sub1_6379 = (class318_sub1_2_.aClass318_Sub1_6379)
                            else Class250.aClass318_Sub1Array3226!![i] = (class318_sub1_2_.aClass318_Sub1_6379)
                            Class348_Sub16_Sub2.aBoolean8870 = true
                            return
                        }
                        class318_sub1_0_ = class318_sub1_2_
                        class318_sub1_2_ = (class318_sub1_2_.aClass318_Sub1_6379)
                    }
                    class318_sub1_0_ = null
                    var class318_sub1_3_: Class318_Sub1? = Class115.aClass318_Sub1Array1754!![i]
                    while (class318_sub1_3_ != null) {
                        if (class318_sub1_3_ === class318_sub1) {
                            if (class318_sub1_0_ != null) class318_sub1_0_.aClass318_Sub1_6379 = (class318_sub1_3_.aClass318_Sub1_6379)
                            else Class115.aClass318_Sub1Array1754!![i] = (class318_sub1_3_.aClass318_Sub1_6379!!)
                            Class348_Sub16_Sub2.aBoolean8870 = true
                            return
                        }
                        class318_sub1_0_ = class318_sub1_3_
                        class318_sub1_3_ = (class318_sub1_3_.aClass318_Sub1_6379)
                    }
                }
            }
        }

        @JvmStatic
        fun method1378(i: Int) {
            aClass250_2462 = null
            anIntArray2466 = null
            if (i != 14) method1382(99, -102)
        }

        fun method1379(i: Int, i_4_: Int, i_5_: Int): Boolean {
            anInt2459++
            if (i != 4) return true
            return (method3194(i_5_, i_4_, 126.toByte()) and method1837(i_4_, 46, i_5_))
        }

        fun method1382(i: Int, i_6_: Int): Int {
            anInt2463++
            if (i != 6406) {
                if (i != 6409) {
                    if (i == 32841) return 1
                    if (i != 6410) {
                        if (i == 6407) return 3
                        if (i == 6408) return 4
                    } else return 2
                } else return 1
            } else return 1
            if (i_6_ != -6409) anIntArray2466 = null
            throw IllegalArgumentException("")
        }
    }
}
