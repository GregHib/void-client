import java.awt.event.ActionEvent

/**
 * JVM actual for [Class369_Sub3_Sub1Statics].
 *
 * Holds the primitive counters/flags declared in the commonMain expect, plus the
 * JVM-only methods: [method3575]/[method3576]/[method3577] (touch Class45, Class17,
 * etc.) and [method3578] (AWT EventQueue/ActionEvent pump).
 */
actual object Class369_Sub3_Sub1Statics {
    actual var anInt10173: Int = 0
    actual var aBoolean10174: Boolean = true
    actual var anInt10175: Int = 0
    actual var anInt10176: Int = 0
    actual var anInt10178: Int = 0

    fun method3575(i: Byte, i_0_: Int, i_1_: Int, i_2_: Int, i_3_: Int, i_4_: Int) {
        var i_0_ = i_0_
        var i_2_ = i_2_
        var i_3_ = i_3_
        var i_4_ = i_4_
        if (i_3_ <= Class38.anInt513 && i_2_ >= Class132.anInt1910) {
            val bool: Boolean
            if (Class369.Companion.anInt4960 <= i_4_) {
                if (i_4_ <= Class113.anInt1745) bool = true
                else {
                    bool = false
                    i_4_ = Class113.anInt1745
                }
            } else {
                i_4_ = Class369.Companion.anInt4960
                bool = false
            }
            val bool_5_: Boolean
            if (Class369.Companion.anInt4960 > i_0_) {
                i_0_ = Class369.Companion.anInt4960
                bool_5_ = false
            } else if (Class113.anInt1745 < i_0_) {
                i_0_ = Class113.anInt1745
                bool_5_ = false
            } else bool_5_ = true
            if (i_3_ < Class132.anInt1910) i_3_ = Class132.anInt1910
            else Class135_Sub2.method1156(-27, i_0_, Class17.anIntArrayArray255!![i_3_++]!!, i_4_, i_1_)
            if (Class38.anInt513 >= i_2_) Class135_Sub2.method1156(-27, i_0_, Class17.anIntArrayArray255!![i_2_--]!!, i_4_, i_1_)
            else i_2_ = Class38.anInt513
            if (!bool || !bool_5_) {
                if (bool) {
                    for (i_7_ in i_3_..i_2_) Class17.anIntArrayArray255!![i_7_]!![i_4_] = i_1_
                } else if (bool_5_) {
                    for (i_6_ in i_3_..i_2_) Class17.anIntArrayArray255!![i_6_]!![i_0_] = i_1_
                }
            } else {
                var i_8_ = i_3_
                while (i_2_ >= i_8_) {
                    val `is` = Class17.anIntArrayArray255!![i_8_]!!
                    `is`[i_0_] = i_1_
                    `is`[i_4_] = `is`[i_0_]
                    i_8_++
                }
            }
        }
        if (i <= 57) method3578((-97).toByte(), null, null)
        anInt10173++
    }

    fun method3576(bool: Boolean, bool_9_: Boolean): Boolean {
        return bool or bool_9_
    }

    fun method3577(i: Int, i_10_: Byte, class45: Class45): Class105? {
        anInt10176++
        var class105 = Class345.aClass60_4273!!.method583(i.toLong(), -68) as Class105?
        val i_11_ = -86 / ((55 - i_10_) / 51)
        if (class105 == null) {
            if (Class286_Sub7.aBoolean6289) class105 = Class348_Sub8.aHa6654!!.method3691(Class207Statics.method1512(class45, i), true)
            else class105 = Class258_Sub3.method1969(class45.method415(73.toByte(), i)!!, -5901)
            Class345.aClass60_4273!!.method582(class105, i.toLong(), (-108).toByte())
        }
        return class105
    }

    fun method3578(i: Byte, `object`: Any?, class297: Class297?) {
        do {
            try {
                anInt10178++
                if (class297!!.anEventQueue3799 != null) {
                    var i_12_ = 0
                    if (i.toInt() != -42) method3578(95.toByte(), null, null)
                    while ( /**/i_12_ < 50 && class297.anEventQueue3799!!.peekEvent() != null) {
                        Class286_Sub5.method2161(30.toByte(), 1L)
                        i_12_++
                    }
                    try {
                        if (`object` == null) break
                        class297.anEventQueue3799!!.postEvent(ActionEvent(`object`, 1001, "dummy"))
                    } catch (exception: Exception) {
                        /* empty */
                    }
                    break
                }
                break
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, ("fu.F(" + i + ',' + (if (`object` != null) "{...}" else "null") + ',' + (if (class297 != null) "{...}" else "null") + ')'))
            }
        } while (false)
    }
}
