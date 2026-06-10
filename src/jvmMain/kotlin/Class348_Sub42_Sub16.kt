import kotlin.concurrent.Volatile

/* Class348_Sub42_Sub16 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
abstract class Class348_Sub42_Sub16 : Class348_Sub42() {
    @JvmField
    var aBoolean9663: Boolean = false

    @JvmField
    @Volatile
    var aBoolean9664: Boolean = true
    var aBoolean9667: Boolean = false
    abstract fun method3257(i: Int): Int

    abstract fun method3259(i: Int): ByteArray?

    companion object {
        @JvmField
        var aClass21_9661: Class21?
        @JvmField
        var anInt9662: Int = 0
        @JvmField
        var aString9665: String? = null
        @JvmField
        var anInt9666: Int = 0
        @JvmField
        var anInt9668: Int = 0

        @JvmStatic
        fun method3252(i: Int) {
            aClass21_9661 = null
            aString9665 = null
            if (i != 353) aClass21_9661 = null
        }

        @JvmStatic
        fun method3253(i: Int, i_0_: Int, i_1_: Int, var_class: Class<*>) {
            val class357 = Class147.aClass357ArrayArrayArray2029!![i]!![i_0_]!![i_1_]
            if (class357 != null) {
                var class148 = class357.aClass148_4396
                while (class148 != null) {
                    val class318_sub1_sub3 = class148.aClass318_Sub1_Sub3_2040!!
                    if (var_class.isAssignableFrom(class318_sub1_sub3.javaClass) && (class318_sub1_sub3.aShort8743.toInt() == i_0_) && (class318_sub1_sub3.aShort8750.toInt() == i_1_)) {
                        Class348_Sub46.method3320(class318_sub1_sub3, false)
                        break
                    }
                    class148 = class148.aClass148_2038
                }
            }
        }

        @JvmStatic
        fun method3254(i: Int, i_2_: Int, i_3_: Int, class318_sub1_sub4: Class318_Sub1_Sub4, class318_sub1_sub4_4_: Class318_Sub1_Sub4?) {
            val class357 = Class348_Sub46.method3321(i, i_2_, i_3_)
            if (class357 != null) {
                class357.aClass318_Sub1_Sub4_4406 = class318_sub1_sub4
                class357.aClass318_Sub1_Sub4_4403 = class318_sub1_sub4_4_
                val i_5_ = if (aa_Sub1.aSArray5191 == Class332.aSArray4142) 1 else 0
                if (class318_sub1_sub4.method2376(-109)) {
                    if (class318_sub1_sub4.method2377(122.toByte())) {
                        class318_sub1_sub4.aClass318_Sub1_6379 = Class250.aClass318_Sub1Array3226!![i_5_]
                        Class250.aClass318_Sub1Array3226!![i_5_] = class318_sub1_sub4
                    } else {
                        class318_sub1_sub4.aClass318_Sub1_6379 = aClass318_Sub1Array4293!![i_5_]
                        aClass318_Sub1Array4293!![i_5_] = class318_sub1_sub4
                        Class348_Sub16_Sub2.aBoolean8870 = true
                    }
                } else {
                    class318_sub1_sub4.aClass318_Sub1_6379 = Class115.aClass318_Sub1Array1754!![i_5_]
                    Class115.aClass318_Sub1Array1754!![i_5_] = class318_sub1_sub4
                }
                if (class318_sub1_sub4_4_ != null) {
                    if (class318_sub1_sub4_4_.method2376(-118)) {
                        if (class318_sub1_sub4_4_.method2377(122.toByte())) {
                            class318_sub1_sub4_4_.aClass318_Sub1_6379 = Class250.aClass318_Sub1Array3226!![i_5_]
                            Class250.aClass318_Sub1Array3226!![i_5_] = class318_sub1_sub4_4_
                        } else {
                            class318_sub1_sub4_4_.aClass318_Sub1_6379 = aClass318_Sub1Array4293!![i_5_]
                            aClass318_Sub1Array4293!![i_5_] = class318_sub1_sub4_4_
                            Class348_Sub16_Sub2.aBoolean8870 = true
                        }
                    } else {
                        class318_sub1_sub4_4_.aClass318_Sub1_6379 = Class115.aClass318_Sub1Array1754!![i_5_]
                        Class115.aClass318_Sub1Array1754!![i_5_] = class318_sub1_sub4_4_
                    }
                }
            }
        }

        @JvmStatic
        fun method3255(i: Int, `is`: ByteArray?, i_6_: Int, bool: Boolean, string: String?, i_7_: Int): Int {
            try {
                anInt9666++
                if (bool != false) return -119
                val i_8_ = -i + i_6_
                var i_9_ = 0
                while (i_8_ > i_9_) {
                    val i_10_ = string!!.get(i_9_ + i).code
                    if (i_10_ > 0 && i_10_ < 128 || i_10_ >= 160 && i_10_ <= 255) `is`!![i_7_ + i_9_] = i_10_.toByte()
                    else if (i_10_ == 8364) `is`!![i_9_ + i_7_] = (-128).toByte()
                    else if (i_10_ == 8218) `is`!![i_9_ + i_7_] = (-126).toByte()
                    else if (i_10_ == 402) `is`!![i_7_ - -i_9_] = (-125).toByte()
                    else if (i_10_ != 8222) {
                        if (i_10_ != 8230) {
                            if (i_10_ != 8224) {
                                if (i_10_ == 8225) `is`!![i_9_ + i_7_] = (-121).toByte()
                                else if (i_10_ == 710) `is`!![i_7_ + i_9_] = (-120).toByte()
                                else if (i_10_ == 8240) `is`!![i_7_ - -i_9_] = (-119).toByte()
                                else if (i_10_ != 352) {
                                    if (i_10_ == 8249) `is`!![i_9_ + i_7_] = (-117).toByte()
                                    else if (i_10_ == 338) `is`!![i_9_ + i_7_] = (-116).toByte()
                                    else if (i_10_ == 381) `is`!![i_7_ + i_9_] = (-114).toByte()
                                    else if (i_10_ != 8216) {
                                        if (i_10_ == 8217) `is`!![i_7_ - -i_9_] = (-110).toByte()
                                        else if (i_10_ == 8220) `is`!![i_7_ + i_9_] = (-109).toByte()
                                        else if (i_10_ == 8221) `is`!![i_7_ + i_9_] = (-108).toByte()
                                        else if (i_10_ == 8226) `is`!![i_7_ + i_9_] = (-107).toByte()
                                        else if (i_10_ != 8211) {
                                            if (i_10_ == 8212) `is`!![i_7_ + i_9_] = (-105).toByte()
                                            else if (i_10_ != 732) {
                                                if (i_10_ != 8482) {
                                                    if (i_10_ != 353) {
                                                        if (i_10_ == 8250) `is`!![i_7_ - -i_9_] = (-101).toByte()
                                                        else if (i_10_ == 339) `is`!![i_7_ - -i_9_] = (-100).toByte()
                                                        else if (i_10_ != 382) {
                                                            if (i_10_ != 376) `is`!![i_9_ + i_7_] = 63.toByte()
                                                            else `is`!![i_7_ + i_9_] = (-97).toByte()
                                                        } else `is`!![i_7_ - -i_9_] = (-98).toByte()
                                                    } else `is`!![i_9_ + i_7_] = (-102).toByte()
                                                } else `is`!![i_9_ + i_7_] = (-103).toByte()
                                            } else `is`!![i_9_ + i_7_] = (-104).toByte()
                                        } else `is`!![i_7_ - -i_9_] = (-106).toByte()
                                    } else `is`!![i_7_ + i_9_] = (-111).toByte()
                                } else `is`!![i_7_ - -i_9_] = (-118).toByte()
                            } else `is`!![i_9_ + i_7_] = (-122).toByte()
                        } else `is`!![i_7_ - -i_9_] = (-123).toByte()
                    } else `is`!![i_7_ - -i_9_] = (-124).toByte()
                    i_9_++
                }
                return i_8_
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, ("ffa.E(" + i + ',' + (if (`is` != null) "{...}" else "null") + ',' + i_6_ + ',' + bool + ',' + (if (string != null) "{...}" else "null") + ',' + i_7_ + ')'))
            }
        }

        @JvmStatic
        fun method3256(i: Int): Int {
            anInt9662++
            if (Class348_Sub1.anIntArray6547 == null) return 0
            if (i != 2) aClass21_9661 = null
            return 2 * Class348_Sub1.anIntArray6547!!.size
        }

        @JvmStatic
        fun method3258(i: Int, i_11_: Int, fs: FloatArray?): FloatArray {
            anInt9668++
            val fs_12_ = FloatArray(i_11_)
            Class214.method1574(fs!!, 0, fs_12_, i, i_11_)
            return fs_12_
        }

        init {
            aClass21_9661 = Class21()
        }
    }
}
