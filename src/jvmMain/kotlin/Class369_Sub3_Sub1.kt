import java.awt.event.ActionEvent

class Class369_Sub3_Sub1(class221: Class221?, class341: Class341?, i: Int, i_13_: Int, i_14_: Int, i_15_: Int, i_16_: Int, i_17_: Int, i_18_: Int, i_19_: Int, i_20_: Int, i_21_: Int, i_22_: Int, i_23_: Int, i_24_: Int, i_25_: Int) : Class369_Sub3(class221, class341, i, i_13_, i_14_, i_15_, i_16_, i_17_, i_18_, i_19_, i_20_, i_21_, i_22_, i_23_, i_24_) {
    @JvmField
    var anInt10177: Int = 0
    override fun method51(i: Byte): Class223? {
        anInt10175++
        if (i < 116) this.anInt10177 = -10
        return Class187.aClass223_2507
    }

    init {
        try {
            this.anInt10177 = i_25_
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("fu.<init>(" + (if (class221 != null) "{...}" else "null") + ',' + (if (class341 != null) "{...}" else "null") + ',' + i + ',' + i_13_ + ',' + i_14_ + ',' + i_15_ + ',' + i_16_ + ',' + i_17_ + ',' + i_18_ + ',' + i_19_ + ',' + i_20_ + ',' + i_21_ + ',' + i_22_ + ',' + i_23_ + ',' + i_24_ + ',' + i_25_ + ')'))
        }
    }

    companion object {
        @JvmField
        var anInt10173: Int = 0
        @JvmField
        var aBoolean10174: Boolean = true
        @JvmField
        var anInt10175: Int = 0
        @JvmField
        var anInt10176: Int = 0
        @JvmField
        var anInt10178: Int = 0

        @JvmStatic
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
            if (i <= 57) Companion.method3578((-97).toByte(), null, null)
            anInt10173++
        }

        @JvmStatic
        fun method3576(bool: Boolean, bool_9_: Boolean): Boolean {
            return bool or bool_9_
        }

        @JvmStatic
        fun method3577(i: Int, i_10_: Byte, class45: Class45): Class105? {
            anInt10176++
            var class105 = Class345.aClass60_4273!!.method583(i.toLong(), -68) as Class105?
            val i_11_ = -86 / ((55 - i_10_) / 51)
            if (class105 == null) {
                if (Class286_Sub7.aBoolean6289) class105 = Class348_Sub8.aHa6654!!.method3691(Class207.method1512(class45, i), true)
                else class105 = Class258_Sub3.method1969(class45.method415(73.toByte(), i)!!, -5901)
                Class345.aClass60_4273!!.method582(class105, i.toLong(), (-108).toByte())
            }
            return class105
        }

        @JvmStatic
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
}
