import Class239_Sub6.Companion.method1745
import Class285_Sub1.Companion.method2127
import Class286_Sub3.Companion.method2148
import Class59.Companion.method544

/* Class27 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
object Class27 {
    var anInt387: Int = 0
    @JvmField
    var anInt388: Int = 0
    @JvmField
    var aClass356_389: Class356? = Class356(4)
    @JvmField
    var anInt390: Int = 0
    @JvmField
    var anInt391: Int = 0
    @JvmField
    var anInt392: Int = 0
    @JvmField
    var anInt393: Int = 0
    @JvmField
    var anInt394: Int = 0
    @JvmField
    var aClass351_395: Class351? = Class351(49, 6)
    @JvmField
    var anInt396: Int = -1
    @JvmField
    var anInt397: Int = 0
    var aClass351_398: Class351? = Class351(23, 8)
    @JvmField
    var aClass341_399: Class341? = Class341()

    @JvmStatic
    fun method312(i: Int, i_0_: Byte) {
        Class48.anInt859 = -1
        if (i != 37) {
            if (i != 50) {
                if (i != 75) {
                    if (i != 100) {
                        if (i == 200) Class75.aFloat1249 = 16.0f
                    } else Class75.aFloat1249 = 8.0f
                } else Class75.aFloat1249 = 6.0f
            } else Class75.aFloat1249 = 4.0f
        } else Class75.aFloat1249 = 3.0f
        anInt397++
        Class48.anInt859 = -1
        if (i_0_.toInt() != 56) anInt394 = 32
    }

    @JvmStatic
    fun method313(l: Long, i: Int): String? {
        var l = l
        try {
            anInt392++
            if (l <= 0L || l >= 6582952005840035281L) return null
            if (l % 37L == 0L) return null
            var i_1_ = 0
            var l_2_ = l
            while (l_2_ != 0L) {
                i_1_++
                l_2_ /= 37L
            }
            if (i >= -82) anInt396 = -58
            val stringbuffer = StringBuffer(i_1_)
            while (l != 0L) {
                val l_3_ = l
                l /= 37L
                stringbuffer.append(Class48.aCharArray852!![(-(37L * l) + l_3_).toInt()])
            }
            return stringbuffer.reverse().toString()
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, "ht.A(" + l + ',' + i + ')')
        }
    }

    @JvmStatic
    fun method314(i: Byte, i_4_: Int) {
        if (i >= -31) anInt394 = -128
        Class34.anInt481 = i_4_
        Class367_Sub9.anInt7379 = 3
        anInt390++
        Class164.anInt2173 = 100
        Class348_Sub40_Sub30.anInt9399 = -1
    }

    @JvmStatic
    fun method315(i: Byte, string: String?): Int {
        anInt393++
        var i_5_ = 0
        if (i <= 70) return -84
        while ( /**/i_5_ < Class59_Sub2.aStringArray5305!!.size) {
            if (Class59_Sub2.aStringArray5305!![i_5_].equals(string, ignoreCase = true)) return i_5_
            i_5_++
        }
        return -1
    }

    @JvmStatic
    fun method316(i: Byte) {
        aClass356_389 = null
        aClass351_398 = null
        aClass341_399 = null
        if (i.toInt() != -94) method313(98L, -24)
        aClass351_395 = null
    }

    @JvmStatic
    fun method317(string: String?, i: Int, bool: Boolean) {
        anInt391++
        if (string != null) {
            if (Class348_Sub42_Sub12.anInt9604 >= 100) method544((Class274.aClass274_3522!!.method2063(Class348_Sub33.anInt6967, 544)), false, 4)
            else {
                val string_6_ = method2127(2, string)
                if (string_6_ != null) {
                    var i_7_ = 0
                    while ((i_7_ < Class348_Sub42_Sub12.anInt9604)) {
                        val string_8_ = method2127(2, (Class51.aStringArray932!![i_7_]))
                        if (string_8_ != null && string_8_ == string_6_) {
                            method544((string + (Class274.aClass274_3523!!.method2063(Class348_Sub33.anInt6967, 544))), false, 4)
                            return
                        }
                        if (Class348_Sub40_Sub21.aStringArray9275!![i_7_] != null) {
                            val string_9_ = (method2127(2, (Class348_Sub40_Sub21.aStringArray9275!![i_7_])))
                            if (string_9_ != null && string_9_ == string_6_) {
                                method544(string + (Class274.aClass274_3523!!.method2063((Class348_Sub33.anInt6967), 544)), false, 4)
                                return
                            }
                        }
                        i_7_++
                    }
                    if (i >= 90) {
                        for (i_10_ in 0..<Class348_Sub40_Sub30.anInt9383) {
                            val string_11_ = method2127(2, (Class83.aStringArray1441!![i_10_]))
                            if (string_11_ != null && string_11_ == string_6_) {
                                method544(((Class274.aClass274_3528!!.method2063(Class348_Sub33.anInt6967, 544)) + string + (Class274.aClass274_3529!!.method2063(Class348_Sub33.anInt6967, 544))), false, 4)
                                return
                            }
                            if (Class286_Sub2.aStringArray6205!![i_10_] != null) {
                                val string_12_ = (method2127(2, (Class286_Sub2.aStringArray6205!![i_10_])))
                                if (string_12_ != null && string_12_ == string_6_) {
                                    method544(((Class274.aClass274_3528!!.method2063(Class348_Sub33.anInt6967, 544)) + string + (Class274.aClass274_3529!!.method2063(Class348_Sub33.anInt6967, 544))), false, 4)
                                    return
                                }
                            }
                        }
                        if (method2127(2, (Class132.aPlayer_1907!!.aString10544)) == string_6_) method544((Class274.aClass274_3525!!.method2063(Class348_Sub33.anInt6967, 544)), false, 4)
                        else {
                            Class5.anInt4628++
                            val class348_sub47 = (method2148(Class348_Sub42_Sub19.aClass351_9687, Class348_Sub23_Sub2.aClass77_9029, -94))
                            class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByte(false, method1745(string, -65) - -1)
                            class348_sub47.aClass348_Sub49_Sub2_7116!!.writeString((-5).toByte(), string)
                            class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByte(false, if (!bool) 0 else 1)
                            Class348_Sub42_Sub14.method3243(-116, class348_sub47)
                        }
                    }
                }
            }
        }
    }
}
