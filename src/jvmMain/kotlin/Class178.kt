import Class5_Sub1.Companion.method188
import java.util.*

/* Class178 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
object Class178 {
    @JvmField
    var anInt2336: Int = 0
    var anInt2337: Int = 0
    var aClass114_2338: Class114? = Class114(92, -1)
    var aClass29_2339: Class29? = Class29(14, 0)
    var anInt2340: Int = 0
    @JvmField
    var aClass29_2341: Class29? = Class29(15, 4)
    var aClass29_2342: Class29? = Class29(16, -2)
    var aClass29_2343: Class29? = Class29(17, 0)
    var aClass29_2344: Class29? = Class29(18, -2)
    var aClass29_2345: Class29? = Class29(19, -2)
    var aClass29_2346: Class29? = Class29(20, 6)
    var aClass29_2347: Class29? = Class29(21, 9)
    var aClass29_2348: Class29? = Class29(22, -2)
    var aClass29_2349: Class29? = Class29(23, 4)
    var aClass29_2350: Class29? = Class29(24, -1)
    var aClass29_2351: Class29? = Class29(26, 0)
    var aClass29_2352: Class29? = Class29(27, 0)
    @JvmField
    var aClass29_2353: Class29? = Class29(28, -2)
    private var aClass29Array2354: Array<Class29?>? = arrayOfNulls<Class29>(32)

    @JvmStatic
    fun method1355(i: Int) {
        aClass29_2346 = null
        aClass29_2349 = null
        aClass29_2344 = null
        aClass29_2352 = null
        aClass114_2338 = null
        if (i > -74) method1356(true, null, -116, -47, true, null, true)
        aClass29_2350 = null
        aClass29Array2354 = null
        aClass29_2353 = null
        aClass29_2351 = null
        aClass29_2339 = null
        aClass29_2343 = null
        aClass29_2341 = null
        aClass29_2345 = null
        aClass29_2342 = null
        aClass29_2348 = null
        aClass29_2347 = null
    }

    fun method1356(bool: Boolean, string: String?, i: Int, i_0_: Int, bool_1_: Boolean, string_2_: String?, bool_3_: Boolean) {
        var string_2_ = string_2_
        try {
            anInt2337++
            Class174.Companion.aClass45_2306!!.anInt634 = 1
            string_2_ = string_2_!!.lowercase(Locale.getDefault())
            var `is` = ShortArray(16)
            var i_4_ = -1
            var string_5_: String? = null
            if (i_0_ != -1) {
                val class254 = Class101_Sub3.aClass326_5764!!.method2600(i_0_, 28364)
                if (class254 == null || bool != class254.method1925(!bool_3_)) return
                if (class254.method1925(!bool_3_)) string_5_ = class254.aString3258
                else i_4_ = class254.anInt3256
            }
            var i_6_ = 0
            var i_7_ = 0
            if (bool_3_ != true) aClass29_2352 = null
            while ( /**/i_7_ < Exception_Sub1.aClass255_112!!.anInt3271) {
                val class213 = Exception_Sub1.aClass255_112!!.method1940(-74, i_7_)
                if ((!bool_1_ || class213.aBoolean2755) && class213.anInt2833 == -1 && class213.anInt2812 == -1 && class213.anInt2799 == 0 && class213.aString2795!!.lowercase(Locale.getDefault()).indexOf(string_2_) != -1) {
                    if (i_0_ != -1) {
                        if (bool) {
                            if (string != class213.method1561(string_5_, i_0_, -1511086397)) {
                                i_7_++
                                continue
                            }
                        } else if (class213.method1567(i_4_, -116, i_0_) != i) {
                            i_7_++
                            continue
                        }
                    }
                    if (i_6_ >= 250) {
                        Class192.aShortArray2579 = null
                        Class76.anInt1285 = -1
                        return
                    }
                    if (`is`.size <= i_6_) {
                        val is_8_ = ShortArray(2 * `is`.size)
                        for (i_9_ in 0..<i_6_) is_8_[i_9_] = `is`[i_9_]
                        `is` = is_8_
                    }
                    `is`[i_6_++] = i_7_.toShort()
                }
                i_7_++
            }
            Class192.aShortArray2579 = `is`
            Class76.anInt1285 = i_6_
            Class148.anInt2037 = 0
            val strings = arrayOfNulls<String>(Class76.anInt1285)
            var i_10_ = 0
            while (Class76.anInt1285 > i_10_) {
                strings[i_10_] = Exception_Sub1.aClass255_112!!.method1940(123, `is`[i_10_].toInt()).aString2795
                i_10_++
            }
            Class174.Companion.method1333(Class192.aShortArray2579, 26073, strings)
            Class174.Companion.aClass45_2306!!.method412(116.toByte())
            Class174.Companion.aClass45_2306!!.anInt634 = 2
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("qa.A(" + bool + ',' + (if (string != null) "{...}" else "null") + ',' + i + ',' + i_0_ + ',' + bool_1_ + ',' + (if (string_2_ != null) "{...}" else "null") + ',' + bool_3_ + ')'))
        }
    }

    init {
        val class29s = method188(59.toByte())
        for (i in class29s.indices) aClass29Array2354!![class29s[i]!!.anInt400] = class29s[i]
    }
}
