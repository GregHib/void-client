import Class239_Sub18.Companion.method1802
import java.awt.Canvas

/**
 * JVM-only statics for Class348_Sub5. Extracted from its companion because
 * method2752/2753/2755/2757 reference jvmMain-only classes (Class348_Sub27,
 * AWT factories, Class367_Sub2, etc.). The portable companion fields and
 * method2762 remain on the commonMain companion object.
 */
object Class348_Sub5Statics {

    @JvmStatic
    fun method2752(i: Int, i_2_: Int): Class138? {
        Class348_Sub5.anInt6625++
        val class138s = Class348_Sub27.method3002((-97).toByte())
        var i_3_ = i_2_
        while (class138s.size > i_3_) {
            if (i == class138s[i_3_]!!.anInt1941) return class138s[i_3_]
            i_3_++
        }
        return null
    }

    @JvmStatic
    fun method2753(
        bool: Boolean,
        i: Int,
        i_4_: Int,
        displayTarget: DisplayTarget?,
        var_d: d?,
        gameSurfaceFactory: GameSurfaceFactory,
    ): ha {
        try {
            Class348_Sub5.anInt6628++
            if (bool != true) Class348_Sub5.aByteArray6624 = null
            val var_ha_sub1 = ha_Sub1(
                var_d,
                gameSurfaceFactory,
                { i, i2 -> Class216(i, i2) },
                { ha, i3, i13 -> Class49(ha, i3 as Class105?, i13 as Class216?) },
                class64Factory = { ha, c124, i, i1, i2, i3 -> Class64_Sub1(ha, c124 as Class124, i, i1, i2, i3) },
                sFactory = { ha, a, b, c, d, e, f, g -> s_Sub1(ha, a, b, c, d, e, f, g) },
                class167Factory = { ha -> Class167(ha) },
                class60Factory = { Class60(it) },
                class324Factory = { ha, c143, c207s, bool ->
                    val class143 = c143 as Class143?
                    val `is` = IntArray(c207s!!.size)
                    val is_283_ = IntArray(c207s.size)
                    var bool_284_ = false
                    for (i in c207s.indices) {
                        `is`[i] = c207s[i]!!.anInt2702
                        is_283_[i] = c207s[i]!!.anInt2696
                        if (c207s[i]!!.aByteArray2695 != null) bool_284_ = true
                    }
                    if (bool) {
                        if (bool_284_) Class324_Sub4(ha, class143, c207s, `is`, is_283_)
                        else Class324_Sub1(ha, class143, c207s, `is`, is_283_)
                    } else {
                        require(!bool_284_) { "" }
                        Class324_Sub3(ha, class143, c207s, `is`, is_283_)
                    }
                },
                class105FactoryProvider = ::JvmClass105Factory,
                audioInit = { Class59_Sub2_Sub1.method566(true, true, (-126).toByte()) { Class239_Sub25.method1827(1415665776) } },
                screenReleaseCallback = { Class286_Sub8.method2173(false, -101, true) },
            )
            var_ha_sub1.method3643(displayTarget!!, i_4_, i)
            var_ha_sub1.method3677(displayTarget)
            return var_ha_sub1
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("fba.M(" + bool + ',' + i + ',' + i_4_ + ',' + (if (displayTarget != null) "{...}" else "null") + ',' + (if (var_d != null) "{...}" else "null") + ')'))
        }
    }

    @JvmStatic
    fun method2755(i: Int, i_7_: Int, i_8_: Int) {
        Class348_Sub5.anInt6629++
        if ((Class348_Sub43.anInt7068.inv()) != i) {
            if (i_8_ >= 0) Class367_Sub3.anIntArray7299!![i_8_] = i_7_
            else {
                for (i_9_ in 0..15) Class367_Sub3.anIntArray7299!![i_9_] = i_7_
            }
        }
        Class98.aClass348_Sub16_Sub3_1564!!.method2843(i_7_, i_8_, -7836)
    }

    @JvmStatic
    fun method2757(i: Int) {
        Class348_Sub5.anInt6620++
        if (Class367_Sub2.anInt7297 != 0) {
            try {
                if (i >= 82) {
                    if (++Class169.anInt2264 > 2000) {
                        if (Class348_Sub40_Sub8.aClass238_9165 != null) {
                            Class348_Sub40_Sub8.aClass238_9165!!.method1700(36.toByte())
                            Class348_Sub40_Sub8.aClass238_9165 = null
                        }
                        if (Class105_Sub1.anInt8398 >= 2) {
                            Class367_Sub2.anInt7297 = 0
                            Class352.anInt4337 = -5
                            return
                        }
                        Class255.aClass161_3285!!.method1259(0)
                        Class367_Sub2.anInt7297 = 1
                        Class169.anInt2264 = 0
                        Class105_Sub1.anInt8398++
                    }
                    if (Class367_Sub2.anInt7297 == 1) {
                        Class130_Sub1.aClass144_5800 = (Class255.aClass161_3285!!.method1262Connection(Class348_Sub23_Sub1.aClass297_8992!!))
                        Class367_Sub2.anInt7297 = 2
                    }
                    if (Class367_Sub2.anInt7297 == 2) {
                        if (Class130_Sub1.aClass144_5800!!.anInt1997 == 2) throw IOException()
                        if (Class130_Sub1.aClass144_5800!!.anInt1997 != 1) return
                        Class348_Sub40_Sub8.aClass238_9165 = (Class130_Sub1.aClass144_5800!!.anObject1998) as Class238
                        Class130_Sub1.aClass144_5800 = null
                        method1802(0)
                        Class367_Sub2.anInt7297 = 4
                    }
                    if (Class367_Sub2.anInt7297 == 4) {
                        if (Class348_Sub40_Sub8.aClass238_9165!!.method1705(1, 104)) {
                            Class348_Sub40_Sub8.aClass238_9165!!.method1701(1, 0, (-116).toByte(), (Class299Statics.aClass348_Sub49_Sub2_3813!!.aByteArray7154!!))
                            val i_11_ = 0xff and (Class299Statics.aClass348_Sub49_Sub2_3813!!.aByteArray7154!![0]).toInt()
                            Class352.anInt4337 = i_11_
                            Class367_Sub2.anInt7297 = 0
                            Class348_Sub40_Sub8.aClass238_9165!!.method1700(36.toByte())
                            Class348_Sub40_Sub8.aClass238_9165 = null
                        }
                    }
                }
            } catch (ioexception: IOException) {
                if (Class348_Sub40_Sub8.aClass238_9165 != null) {
                    Class348_Sub40_Sub8.aClass238_9165!!.method1700(36.toByte())
                    Class348_Sub40_Sub8.aClass238_9165 = null
                }
                if (Class105_Sub1.anInt8398 < 2) {
                    Class255.aClass161_3285!!.method1259(0)
                    Class169.anInt2264 = 0
                    Class105_Sub1.anInt8398++
                    Class367_Sub2.anInt7297 = 1
                } else {
                    Class352.anInt4337 = -4
                    Class367_Sub2.anInt7297 = 0
                }
            }
        }
    }
}
