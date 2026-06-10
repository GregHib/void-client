import Class239_Sub18.Companion.method1802
import java.awt.Canvas
import java.io.IOException
import java.net.Socket

abstract class Class348_Sub5 internal constructor(var aHa_Sub2_6618: ha_Sub2) : Class348() {
    @JvmField
    var aBoolean6621: Boolean = false
    abstract fun method2750(class258_sub3: Class258_Sub3?, class258_sub3_0_: Class258_Sub3?, i: Int, i_1_: Byte)

    abstract fun method2751(bool: Boolean): Boolean

    abstract fun method2754(i: Int, i_5_: Byte, i_6_: Int)

    abstract fun method2756(i: Byte, i_10_: Int)

    abstract fun method2758(i: Int): Boolean

    fun method2759(i: Int): Boolean {
        if (i != 1) return true
        anInt6626++
        return false
    }

    fun method2760(i: Byte): Boolean {
        if (i.toInt() != 1) method2763(37.toByte())
        anInt6619++
        return this.aBoolean6621
    }

    open fun method2761(bool: Boolean): Int {
        anInt6622++
        if (bool != true) method2757(-63)
        return 0
    }

    abstract fun method2763(i: Byte)

    fun method2764(i: Int): Int {
        if (i != 1) aByteArray6624 = null
        anInt6623++
        return 1
    }

    companion object {
        @JvmField
        var anInt6619: Int = 0
        @JvmField
        var anInt6620: Int = 0
        @JvmField
        var anInt6622: Int = 0
        @JvmField
        var anInt6623: Int = 0
        @JvmField
        var aByteArray6624: ByteArray? = ByteArray(2048)
        @JvmField
        var anInt6625: Int = 0
        @JvmField
        var anInt6626: Int = 0
        @JvmField
        var aClass105_6627: Class105? = null
        @JvmField
        var anInt6628: Int = 0
        @JvmField
        var anInt6629: Int = 0

        @JvmStatic
        fun method2752(i: Int, i_2_: Int): Class138? {
            anInt6625++
            val class138s = Class348_Sub27.method3002((-97).toByte())
            var i_3_ = i_2_
            while (class138s.size > i_3_) {
                if (i == class138s[i_3_]!!.anInt1941) return class138s[i_3_]
                i_3_++
            }
            return null
        }

        @JvmStatic
        fun method2753(bool: Boolean, i: Int, i_4_: Int, canvas: Canvas?, var_d: d?): ha {
            try {
                anInt6628++
                if (bool != true) aByteArray6624 = null
                return ha_Sub1(canvas!!, var_d, i_4_, i)
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, ("fba.M(" + bool + ',' + i + ',' + i_4_ + ',' + (if (canvas != null) "{...}" else "null") + ',' + (if (var_d != null) "{...}" else "null") + ')'))
            }
        }

        @JvmStatic
        fun method2755(i: Int, i_7_: Int, i_8_: Int) {
            anInt6629++
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
            anInt6620++
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
                            Class130_Sub1.aClass144_5800 = (Class255.aClass161_3285!!.method1262(Class348_Sub23_Sub1.aClass297_8992!!, 36.toByte()))
                            Class367_Sub2.anInt7297 = 2
                        }
                        if (Class367_Sub2.anInt7297 == 2) {
                            if (Class130_Sub1.aClass144_5800!!.anInt1997 == 2) throw IOException()
                            if (Class130_Sub1.aClass144_5800!!.anInt1997 != 1) return
                            Class348_Sub40_Sub8.aClass238_9165 = Class348_Sub23_Sub3.method2982(((Class130_Sub1.aClass144_5800!!.anObject1998) as Socket), 24.toByte(), 7500)
                            Class130_Sub1.aClass144_5800 = null
                            method1802(0)
                            Class367_Sub2.anInt7297 = 4
                        }
                        if (Class367_Sub2.anInt7297 == 4) {
                            if (Class348_Sub40_Sub8.aClass238_9165!!.method1705(1, 104)) {
                                Class348_Sub40_Sub8.aClass238_9165!!.method1701(1, 0, (-116).toByte(), (Class299.aClass348_Sub49_Sub2_3813!!.aByteArray7154!!))
                                val i_11_ = 0xff and (Class299.aClass348_Sub49_Sub2_3813!!.aByteArray7154!![0]).toInt()
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

        @JvmStatic
        fun method2762(i: Int) {
            aByteArray6624 = null
            aClass105_6627 = null
            val i_12_ = -23 % ((i - -24) / 47)
        }
    }
}
