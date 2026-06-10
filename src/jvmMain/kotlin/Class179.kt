import Class348_Sub16_Sub3.Companion.method2862
import ha_Sub3.Companion.method3873

/* Class179 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class179 internal constructor(private val anInt2365: Int, bool: Boolean) {
    private var aBoolean2360 = false
    private var anInt2364 = -1
    private var aStringArray2367 = arrayOfNulls<String>(0)
    private fun method1358(i: Int, i_0_: Int): Int {
        val i_1_ = 71 % ((i_0_ - -4) / 53)
        anInt2362++
        var i_2_ = aStringArray2367.size
        while (i_2_ <= i) {
            if (!aBoolean2360) i_2_ += anInt2365
            else if (i_2_ != 0) i_2_ *= anInt2365
            else i_2_ = 1
        }
        return i_2_
    }

    fun method1361(i: Int): Array<String?> {
        anInt2359++
        val i_7_ = 95 % ((15 - i) / 32)
        val strings = arrayOfNulls<String>(1 + anInt2364)
        Class214.method1575(aStringArray2367, 0, strings, 0, anInt2364 - -1)
        return strings
    }

    private fun method1362(string: String?, i: Int, i_8_: Int) {
        if (i >= -56) aBoolean2360 = true
        anInt2366++
        if (i_8_ > anInt2364) anInt2364 = i_8_
        if (aStringArray2367.size <= i_8_) method1363(i_8_, -107)
        aStringArray2367[i_8_] = string
    }

    private fun method1363(i: Int, i_9_: Int) {
        val i_10_ = 50 % ((3 - i_9_) / 63)
        anInt2358++
        val strings = arrayOfNulls<String>(method1358(i, 108))
        Class214.method1575(aStringArray2367, 0, strings, 0, aStringArray2367.size)
        aStringArray2367 = strings
    }

    fun method1364(i: Int, string: String?) {
        method1362(string, -99, 1 + anInt2364)
        anInt2356++
        if (i != -1) aBoolean2360 = true
    }

    init {
        aBoolean2360 = bool
    }

    override fun toString(): String {
        anInt2357++
        val stringbuffer = StringBuffer()
        stringbuffer.append("[")
        var i = 0
        while (anInt2364 > i) {
            if (i != 0) stringbuffer.append(", ")
            stringbuffer.append(aStringArray2367[i])
            i++
        }
        stringbuffer.append("]")
        return stringbuffer.toString()
    }

    companion object {
        var anInt2355: Int = 0
        var anInt2356: Int = 0
        var anInt2357: Int = 0
        var anInt2358: Int = 0
        var anInt2359: Int = 0
        var anInt2361: Int = 1
        var anInt2362: Int = 0
        var anInt2363: Int = 0
        var anInt2366: Int = 0
        var anInt2368: Int = 0
        var anInt2369: Int = 0

        @JvmStatic
        fun method1357(`is`: ByteArray?, bool: Boolean, i: Byte): Any? {
            if (i < 73) anInt2361 = -51
            anInt2363++
            if (`is` == null) return null
            if (`is`.size > 136 && !Class17.aBoolean247) {
                try {
                    val class344: Class344 = Class344_Sub1()
                    class344.method2691(62.toByte(), `is`)
                    return class344
                } catch (throwable: Throwable) {
                    Class17.aBoolean247 = true
                }
            }
            if (bool) return method3873(`is`, 0)
            return `is`
        }

        @JvmStatic
        fun method1359(bool: Boolean, i: Int): Int {
            anInt2368++
            if (bool != true) anInt2361 = -32
            return i ushr 10
        }

        fun method1360(string: String?, class297: Class297?, bool: Boolean, bool_3_: Boolean, i: Int) {
            try {
                anInt2369++
                if (bool_3_) {
                    if (Class297.aString3803.startsWith("win") && class297!!.aBoolean3777) {
                        var string_4_: String? = null
                        if (Class93.anApplet1530 != null) string_4_ = Class93.anApplet1530!!.getParameter("haveie6")
                        if (string_4_ == null || string_4_ != "1") {
                            val class144 = method2862(class297, string, -117, 0)
                            Class318_Sub1_Sub5.aClass144_8766 = class144
                            Class195.aClass297_5017 = class297
                            Class348_Sub42_Sub8.aString9554 = string
                            return
                        }
                    }
                    if (Class297.aString3803.startsWith("mac")) {
                        var string_5_: String? = null
                        if (Class93.anApplet1530 != null) string_5_ = Class93.anApplet1530!!.getParameter("havefirefox")
                        if (string_5_ != null && string_5_ == "1" && bool) {
                            method2862(class297, string, 42, 1)
                            return
                        }
                    }
                    method2862(class297, string, 96, 2)
                } else method2862(class297, string, -96, 3)
                val i_6_ = -6 / ((i - 20) / 44)
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, ("bo.C(" + (if (string != null) "{...}" else "null") + ',' + (if (class297 != null) "{...}" else "null") + ',' + bool + ',' + bool_3_ + ',' + i + ')'))
            }
        }

        fun method1365(i: Int, i_11_: Byte, class348_sub49: Class348_Sub49) {
            if (i_11_ > -113) anInt2361 = -64
            if (Class374.aClass78_4538 != null) {
                try {
                    Class374.aClass78_4538!!.method789(0L, 59.toByte())
                    Class374.aClass78_4538!!.method783(i, 24, true, (class348_sub49.aByteArray7154))
                } catch (exception: Exception) {
                    /* empty */
                }
            }
            anInt2355++
        }
    }
}
