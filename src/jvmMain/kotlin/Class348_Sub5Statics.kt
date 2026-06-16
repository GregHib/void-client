import Class239_Sub18.Companion.method1802
import java.awt.Canvas

/**
 * JVM-only statics for Class348_Sub5. Extracted from its companion because
 * method2752/2753/2755/2757 reference jvmMain-only classes (Class348_Sub27,
 * AWT factories, Class367_Sub2, etc.). The portable companion fields and
 * method2762 remain on the commonMain companion object.
 */
object Class348_Sub5Statics {

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
            return JvmSoftwareToolkitFactory.build(var_d, gameSurfaceFactory, displayTarget!!, i, i_4_, bool)
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("fba.M(" + bool + ',' + i + ',' + i_4_ + ',' + (if (displayTarget != null) "{...}" else "null") + ',' + (if (var_d != null) "{...}" else "null") + ')'))
        }
    }

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
