import Class376.Companion.method3620

/* Class89 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class89 internal constructor(class377: Class377?, l: Long, class39s: Array<Class39?>?) {
    private val aClass377_1506: Class377?
    var aLong1510: Long = 0

    @Throws(Throwable::class)
    protected fun finalize() {
        anInt1509++
        aClass377_1506!!.method3966(this.aLong1510, 34192)
//        super.finalize()
    }

    init {
        try {
            this.aLong1510 = l
            aClass377_1506 = class377
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("lha.<init>(" + (if (class377 != null) "{...}" else "null") + ',' + l + ',' + (if (class39s != null) "{...}" else "null") + ')'))
        }
    }

    companion object {
        @JvmField
        var aLong1507: Long = 0
        @JvmField
        var anIntArray1508: IntArray? = IntArray(256)
        @JvmField
        var anInt1509: Int = 0
        @JvmField
        var anInt1511: Int = 0

        @JvmStatic
        fun method849(i: Int, i_0_: Int, i_1_: Int, i_2_: Int, i_3_: Int, i_4_: Int, i_5_: Int) {
            anInt1511++
            if (i_4_ <= 80) method851(-7)
            val i_6_ = i_0_ + i
            val i_7_ = -i + i_3_
            for (i_8_ in i_0_..<i_6_) Class135_Sub2.method1156(-27, i_2_, Class17.anIntArrayArray255!![i_8_]!!, i_1_, i_5_)
            val i_9_ = -i + i_2_
            for (i_10_ in i_3_ downTo i_7_ + 1) Class135_Sub2.method1156(-27, i_2_, Class17.anIntArrayArray255!![i_10_]!!, i_1_, i_5_)
            val i_11_ = i + i_1_
            var i_12_ = i_6_
            while (i_7_ >= i_12_) {
                val `is`: IntArray = Class17.anIntArrayArray255!![i_12_]!!
                Class135_Sub2.method1156(-27, i_11_, `is`, i_1_, i_5_)
                Class135_Sub2.method1156(-27, i_2_, `is`, i_9_, i_5_)
                i_12_++
            }
        }

        @JvmStatic
        fun method850(class318_sub1_sub3: Class318_Sub1_Sub3, bool: Boolean): Boolean {
            val bool_13_ = aa_Sub1.aSArray5191 == Class332.aSArray4142
            var i = 0
            var i_14_: Short = 0
            var i_15_: Byte = 0
            class318_sub1_sub3.method2409((-116).toByte())
            if (class318_sub1_sub3.aShort8743 < 0 || class318_sub1_sub3.aShort8750 < 0 || (class318_sub1_sub3.aShort8751 >= Class318_Sub7.anInt6451) || (class318_sub1_sub3.aShort8747 >= Class348_Sub41.anInt7054)) return false
            var i_16_: Short = 0
            for (i_17_ in class318_sub1_sub3.aShort8743..class318_sub1_sub3.aShort8751) {
                for (i_18_ in class318_sub1_sub3.aShort8750..class318_sub1_sub3.aShort8747) {
                    val class357 = Class348_Sub46.method3321(class318_sub1_sub3.plane.toInt(), i_17_, i_18_)
                    if (class357 != null) {
                        val class148 = method3620(class318_sub1_sub3, 118)
                        var class148_19_ = class357.aClass148_4396
                        if (class148_19_ == null) class357.aClass148_4396 = class148
                        else {
                            while ( /**/class148_19_!!.aClass148_2038 != null) {
                                class148_19_ = class148_19_.aClass148_2038
                            }
                            class148_19_.aClass148_2038 = class148
                        }
                        if (bool_13_ && (Class342.anIntArrayArray4253!![i_17_]!![i_18_] and 0xffffff.inv()) != 0) {
                            i = Class342.anIntArrayArray4253!![i_17_]!![i_18_]
                            i_14_ = Class239_Sub1.aShortArrayArray5847!![i_17_]!![i_18_]
                            i_15_ = (Class348_Sub1_Sub2.aByteArrayArray8816!![i_17_]!![i_18_])
                        }
                        if (!bool && (class357.aClass318_Sub1_Sub1_4402 != null) && (class357.aClass318_Sub1_Sub1_4402!!.aShort8727) > i_16_) i_16_ = (class357.aClass318_Sub1_Sub1_4402!!.aShort8727)
                    }
                }
            }
            if (bool_13_ && (i and 0xffffff.inv()) != 0) {
                for (i_20_ in class318_sub1_sub3.aShort8743..class318_sub1_sub3.aShort8751) {
                    var i_21_ = (class318_sub1_sub3.aShort8750).toInt()
                    while ((i_21_ <= class318_sub1_sub3.aShort8747)) {
                        if ((Class342.anIntArrayArray4253!![i_20_]!![i_21_] and 0xffffff.inv()) == 0) {
                            Class342.anIntArrayArray4253!![i_20_]!![i_21_] = i
                            Class239_Sub1.aShortArrayArray5847!![i_20_]!![i_21_] = i_14_
                            Class348_Sub1_Sub2.aByteArrayArray8816!![i_20_]!![i_21_] = i_15_
                        }
                        i_21_++
                    }
                }
            }
            if (bool) Class24.aClass318_Sub1_Sub3Array357!![Class86.anInt1477++] = class318_sub1_sub3
            else {
                val i_22_ = if (aa_Sub1.aSArray5191 == Class332.aSArray4142) 1 else 0
                if (class318_sub1_sub3.method2376(-118)) {
                    if (class318_sub1_sub3.method2377(122.toByte())) {
                        class318_sub1_sub3.aClass318_Sub1_6379 = Class250.aClass318_Sub1Array3226!![i_22_]
                        Class250.aClass318_Sub1Array3226!![i_22_] = class318_sub1_sub3
                    } else {
                        class318_sub1_sub3.aClass318_Sub1_6379 = Class348.aClass318_Sub1Array4293!![i_22_]
                        Class348.aClass318_Sub1Array4293!![i_22_] = class318_sub1_sub3
                        Class348_Sub16_Sub2.aBoolean8870 = true
                    }
                } else {
                    class318_sub1_sub3.aClass318_Sub1_6379 = Class115.aClass318_Sub1Array1754!![i_22_]
                    Class115.aClass318_Sub1Array1754!![i_22_] = class318_sub1_sub3
                }
            }
            if (bool) class318_sub1_sub3.anInt6382 -= i_16_.toInt()
            return true
        }

        @JvmStatic
        fun method851(i: Int) {
            if (i == 1) anIntArray1508 = null
        }

        init {
            for (i in 0..255) {
                var i_23_ = i
                for (i_24_ in 0..7) {
                    if ((i_23_ and 0x1) != 1) i_23_ = i_23_ ushr 1
                    else i_23_ = i_23_ ushr 1 xor 0x12477cdf.inv()
                }
                anIntArray1508!![i] = i_23_
            }
        }
    }
}
