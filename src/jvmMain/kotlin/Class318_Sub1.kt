/* Class318_Sub1 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
abstract class Class318_Sub1 : Class318() {
    @JvmField
    var aByte6376: Byte = 0
    @JvmField
    var x: Int = 0
    @JvmField
    var aClass318_Sub1_6379: Class318_Sub1? = null
    @JvmField
    var anInt6380: Int = 0
    @JvmField
    var plane: Byte = 0
    @JvmField
    var anInt6382: Int = 0
    @JvmField
    var anInt6386: Int = 0
    @JvmField
    var aBoolean6387: Boolean = false
    @JvmField
    var y: Int = 0
    @JvmField
    var anInt6389: Int = 0
    @JvmField
    var aBoolean6391: Boolean = false
    abstract fun method2376(i: Int): Boolean

    abstract fun method2377(i: Byte): Boolean

    abstract fun method2378(i: Int): Boolean

    abstract fun method2379(i: Int): Int

    abstract fun method2380(var_ha: ha?, i: Int, bool: Boolean, class318_sub1_0_: Class318_Sub1?, i_1_: Int, i_2_: Byte, i_3_: Int)

    abstract fun method2381(var_ha: ha?, i: Int): Class30?

    abstract fun method2382(i: Byte): Boolean

    abstract fun method2384(class348_sub1s: Array<Class348_Sub1?>?, i: Int): Int

    abstract fun method2386(i: Int, var_ha: ha?): Class318_Sub4?

    abstract fun method2387(var_ha: ha?, i: Int)

    abstract fun method2388(i: Int): Boolean

    fun method2390(class348_sub1s: Array<Class348_Sub1?>, i: Int, i_30_: Int, i_31_: Int): Int {
        anInt6384++
        if (i_30_ != -2) this.aByte6376 = 33.toByte()
        val l = (Class348_Sub42_Sub8_Sub2.aLongArrayArrayArray10431!![this.plane.toInt()]!![i]!![i_31_])
        var l_32_ = 0L
        var i_33_ = 0
        while ( /**/l_32_ <= 48) {
            val i_34_ = (0xffffL and (l shr l_32_.toInt())).toInt()
            if (i_34_ <= 0) break
            class348_sub1s[i_33_++] = (Class239_Sub14.aClass211Array5993!![i_34_ + -1]!!.aClass348_Sub1_2745)
            l_32_ += 16L
        }
        for (i_35_ in i_33_..3) class348_sub1s[i_35_] = null
        return i_33_
    }

    abstract fun method2391(var_ha: ha?, i: Int, i_36_: Int, i_37_: Int): Boolean

    abstract fun method2392(bool: Boolean)

    open fun method2393(i: Int): Int {
        if (i >= -109) Companion.method2385(null, 23, null, -94, -53, 18, (-3).toByte(), 35, null)
        anInt6378++
        return 0
    }

    abstract fun method2394(bool: Boolean): Int

    companion object {
        @JvmField
        var anInt6378: Int = 0
        @JvmField
        var aClass114_6383: Class114? = Class114(11, 6)
        @JvmField
        var anInt6384: Int = 0
        @JvmField
        var anInt6385: Int = 0
        @JvmField
        var anInt6390: Int = 0
        @JvmField
        var anInt6392: Int = 0

        @JvmStatic
        fun method2383(var_ha: ha?, i: Int, class46: Class46?) {
            do {
                try {
                    if (i != -2) method2383(null, -63, null)
                    anInt6385++
                    val bool = ((Exception_Sub1.aClass255_112!!.method1941(class46!!.anInt672, (-74).toByte(), class46.anInt812, class46.anInt781, 0xffffff.inv() or class46.anInt809, class46.anInt678, var_ha, (if (!class46.aBoolean720) null else (Class132.aPlayer_1907!!.aClass154_10536)))) == null)
                    if (!bool) break
                    Class5_Sub1_Sub1.aClass262_9931!!.method1999(Class348_Sub7(class46.anInt812, class46.anInt781, class46.anInt672, (0xffffff.inv() or class46.anInt809), class46.anInt678, class46.aBoolean720), i xor 0x4ed2)
                    Class251.method1916(-9343, class46)
                } catch (runtimeexception: RuntimeException) {
                    throw Class348_Sub17.method2929(runtimeexception, ("ga.QA(" + (if (var_ha != null) "{...}" else "null") + ',' + i + ',' + (if (class46 != null) "{...}" else "null") + ')'))
                }
                break
            } while (false)
        }

        @JvmStatic
        fun method2385(class46: Class46?, i: Int, var_aa: aa?, i_4_: Int, i_5_: Int, i_6_: Int, i_7_: Byte, i_8_: Int, var_ha: ha?) {
            do {
                try {
                    anInt6390++
                    val class42 = Class348_Sub23_Sub2.aClass153_9031!!.method1225(i_4_, 98.toByte())
                    if (i_7_ < -52) {
                        if (class42 == null || !class42.aBoolean569 || !class42.method373((Class318_Sub1_Sub3_Sub3.Companion.aClass170_10209!!), 69)) break
                        if (class42.anIntArray591 != null) {
                            val `is` = (IntArray(class42.anIntArray591!!.size))
                            var i_9_ = 0
                            while (`is`.size / 2 > i_9_) {
                                val i_10_: Int
                                if (Class348_Sub40_Sub21.anInt9282 != 4) i_10_ = 0x3fff and (r_Sub2.anInt10483 + Class314.aFloat3938.toInt())
                                else i_10_ = Class314.aFloat3938.toInt() and 0x3fff
                                var i_11_ = Class70.anIntArray1207!![i_10_]
                                var i_12_ = Class70.anIntArray1204!![i_10_]
                                if (Class348_Sub40_Sub21.anInt9282 != 4) {
                                    i_11_ = (i_11_ * 256 / (Class348_Sub49_Sub1.anInt9750 + 256))
                                    i_12_ = i_12_ * 256 / (256 + (Class348_Sub49_Sub1.anInt9750))
                                }
                                `is`[i_9_ * 2] = (((i_11_ * (((class42.anIntArray591!![i_9_ * 2 - -1]) * 4) + i_8_) + (i_5_ - -(4 * (class42.anIntArray591!![2 * i_9_]))) * i_12_) shr 14) + (i_6_ - -(class46!!.anInt709 / 2)))
                                `is`[i_9_ * 2 - -1] = (-((((class42.anIntArray591!![1 + i_9_ * 2]) * 4 + i_8_) * i_12_ - (i_5_ - -((class42.anIntArray591!![i_9_ * 2]) * 4)) * i_11_) shr 14) + i + class46.anInt789 / 2)
                                i_9_++
                            }
                            Class329.method2619(var_ha!!, `is`, class42.anInt582, class46!!.anIntArray677, class46.anIntArray772!!)
                            if (class42.anInt584 > 0) {
                                var i_13_ = 0
                                while ((i_13_ < -1 + `is`.size / 2)) {
                                    var i_14_ = `is`[i_13_ * 2]
                                    var i_15_ = `is`[1 + 2 * i_13_]
                                    var i_16_ = `is`[2 + i_13_ * 2]
                                    var i_17_ = `is`[1 + 2 * (i_13_ - -1)]
                                    if (i_14_ <= i_16_) {
                                        if (i_14_ == i_16_ && i_15_ > i_17_) {
                                            val i_18_ = i_15_
                                            i_15_ = i_17_
                                            i_17_ = i_18_
                                        }
                                    } else {
                                        val i_19_ = i_14_
                                        i_14_ = i_16_
                                        val i_20_ = i_15_
                                        i_15_ = i_17_
                                        i_16_ = i_19_
                                        i_17_ = i_20_
                                    }
                                    var_ha!!.method3703(i_14_, i_15_, i_16_, i_17_, (class42.anIntArray572[((class42.aByteArray564[i_13_]).toInt() and 0xff)]), 1, var_aa, i_6_, i, class42.anInt584, class42.anInt575, (class42.anInt601))
                                    i_13_++
                                }
                                var i_21_ = `is`[-2 + `is`.size]
                                var i_22_ = `is`[-1 + `is`.size]
                                var i_23_ = `is`[0]
                                var i_24_ = `is`[1]
                                if (i_23_ < i_21_) {
                                    val i_25_ = i_21_
                                    i_21_ = i_23_
                                    val i_26_ = i_22_
                                    i_22_ = i_24_
                                    i_23_ = i_25_
                                    i_24_ = i_26_
                                } else if (i_21_ == i_23_ && i_22_ > i_24_) {
                                    val i_27_ = i_22_
                                    i_22_ = i_24_
                                    i_24_ = i_27_
                                }
                                var_ha!!.method3703(i_21_, i_22_, i_23_, i_24_, (class42.anIntArray572[(class42.aByteArray564[((class42.aByteArray564).size - 1)]).toInt() and 0xff]), 1, var_aa, i_6_, i, class42.anInt584, class42.anInt575, class42.anInt601)
                            } else {
                                var i_28_ = 0
                                while (-1 + `is`.size / 2 > i_28_) {
                                    var_ha!!.method3636(`is`[i_28_ * 2], `is`[2 * i_28_ + 1], `is`[2 * (i_28_ - -1)], `is`[2 * i_28_ + 3], (class42.anIntArray572[((class42.aByteArray564[i_28_]).toInt() and 0xff)]), 1, var_aa, i_6_, i)
                                    i_28_++
                                }
                                var_ha!!.method3636(`is`[`is`.size + -2], `is`[-1 + `is`.size], `is`[0], `is`[1], (class42.anIntArray572[(class42.aByteArray564[((class42.aByteArray564).size + -1)]).toInt() and 0xff]), 1, var_aa, i_6_, i)
                            }
                        }
                        var class105: Class105? = null
                        if (class42.anInt578 != -1) {
                            class105 = class42.method374(false, var_ha!!, 127.toByte())
                            if (class105 != null) Class151.method1211(i, class105, i_6_, class46, var_aa, i_8_, 2, i_5_)
                        }
                        if (class42.aString597 == null) break
                        var i_29_ = 0
                        if (class105 != null) i_29_ = class105.method969()
                        var class324 = Class240.aClass324_4684
                        var class143 = Class258_Sub1.aClass143_8527
                        if (class42.anInt576 == 1) {
                            class324 = Applet_Sub1.aClass324_20
                            class143 = Class246.aClass143_3179
                        }
                        if (class42.anInt576 == 2) {
                            class143 = Class369.aClass143_4962
                            class324 = Class262.aClass324_3326
                        }
                        Class334.method2650(class143, class42.anInt580, var_aa, i_8_, i_6_, class42.aString597, i, class324, i_29_, class46, i_5_, 100)
                    }
                } catch (runtimeexception: RuntimeException) {
                    throw Class348_Sub17.method2929(runtimeexception, ("ga.KA(" + (if (class46 != null) "{...}" else "null") + ',' + i + ',' + (if (var_aa != null) "{...}" else "null") + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ',' + (if (var_ha != null) "{...}" else "null") + ')'))
                }
                break
            } while (false)
        }

        @JvmStatic
        fun method2389(i: Int) {
            aClass114_6383 = null
            if (i != 1) aClass114_6383 = null
        }
    }
}
