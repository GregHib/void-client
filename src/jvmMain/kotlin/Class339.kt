import Class239_Sub15.Companion.method1783
import Class251.Companion.method1916
import Class43.Companion.method381
import Class5_Sub2.Companion.method196
import Class66.method705
import java.io.BufferedReader
import java.io.DataInputStream
import java.io.IOException
import java.io.InputStreamReader
import java.net.MalformedURLException
import java.net.URL
import kotlin.concurrent.Volatile

class Class339 : Runnable {
    private var aClass144_4201: Class144? = null
    private var aClass295Array4204: Array<Class295?>? = null

    @Volatile
    private var aBoolean4205 = false
    private var aThread4206: Thread? = null
    override fun run() {
        anInt4203++
        try {
            val bufferedreader = BufferedReader(InputStreamReader((aClass144_4201!!.anObject1998) as DataInputStream?))
            var string = bufferedreader.readLine()
            val class179 = method381(68.toByte())
            while ( /**/string != null) {
                class179.method1364(-1, string)
                string = bufferedreader.readLine()
            }
            val strings = class179.method1361(63)
            if (strings.size % 3 != 0) return
            aClass295Array4204 = arrayOfNulls<Class295>(strings.size / 3)
            var i = 0
            while (i < strings.size) {
                aClass295Array4204!![i / 3] = Class295(strings[i], strings[i + 1], strings[2 + i])
                i += 3
            }
        } catch (ioexception: IOException) {
            /* empty */
        }
        aBoolean4205 = true
    }

    fun method2667(bool: Boolean, i: Int): Class295? {
        anInt4210++
        if (bool != false) return null
        if (aClass295Array4204 == null || i < 0 || i >= aClass295Array4204!!.size) return null
        return aClass295Array4204!![i]
    }

    fun method2668(i: Int): Boolean {
        anInt4208++
        if (aBoolean4205) return true
        if (aClass144_4201 == null) {
            try {
                val i_15_ = (if (Class8.aClass364_165 == Class55_Sub1.aClass364_5271) 80 else 7000 - -(Class135_Sub2.aClass161_4839!!.anInt2143))
                aClass144_4201 = (Class348_Sub23_Sub1.aClass297_8992!!.method2237(URL("http://" + (Class135_Sub2.aClass161_4839!!.aString2147) + ":" + i_15_ + "/news.ws?game=" + Class348_Sub42_Sub8_Sub2.aClass230_10434!!.anInt2987), 8362))
            } catch (malformedurlexception: MalformedURLException) {
                return true
            }
        }
        if (aClass144_4201 == null || aClass144_4201!!.anInt1997 == 2) return true
        if (i != -21913) return false
        if (aClass144_4201!!.anInt1997 != 1) return false
        if (aThread4206 == null) {
            aThread4206 = Thread(this)
            aThread4206!!.start()
        }
        return aBoolean4205
    }

    companion object {
        var anInt4198: Int = 0
        var anInt4199: Int = 0
        var anInt4200: Int = 0
        var anInt4202: Int = -1
        var anInt4203: Int = 0
        var aClass351_4207: Class351? = Class351(29, 3)
        var anInt4208: Int = 0
        var anInt4209: Int = 0
        var anInt4210: Int = 0
        var anInt4211: Int = 0

        @JvmStatic
        fun method2664(i: Int) {
            if (i == 3) aClass351_4207 = null
        }

        fun method2665(i: Int, i_0_: Byte, i_1_: Int, i_2_: Int, i_3_: Int, i_4_: Int) {
            anInt4200++
            val i_5_ = i_4_ - i
            val i_6_ = -i_2_ + i_3_
            if (i_5_ == 0) {
                if (i_6_ != 0) Class336.method2656(i_2_, i, 124.toByte(), i_1_, i_3_)
                return
            } else if (i_6_ == 0) {
                method196(true, i_4_, i_1_, i, i_2_)
                return
            }
            val i_7_ = (i_6_ shl 12) / i_5_
            val i_8_ = -(i_7_ * i shr 12) + i_2_
            var i_9_: Int
            var i_10_: Int
            if (i < Class369.anInt4960) {
                i_9_ = (i_7_ * Class369.anInt4960 shr 12) + i_8_
                i_10_ = Class369.anInt4960
            } else if (i > Class113.anInt1745) {
                i_9_ = i_8_ - -(Class113.anInt1745 * i_7_ shr 12)
                i_10_ = Class113.anInt1745
            } else {
                i_10_ = i
                i_9_ = i_2_
            }
            if (i_0_ < 56) anInt4202 = -57
            var i_11_: Int
            var i_12_: Int
            if (Class369.anInt4960 <= i_4_) {
                if (Class113.anInt1745 >= i_4_) {
                    i_11_ = i_4_
                    i_12_ = i_3_
                } else {
                    i_11_ = Class113.anInt1745
                    i_12_ = i_8_ + (Class113.anInt1745 * i_7_ shr 12)
                }
            } else {
                i_11_ = Class369.anInt4960
                i_12_ = (i_7_ * Class369.anInt4960 shr 12) + i_8_
            }
            if (i_12_ < Class132.anInt1910) {
                i_11_ = (Class132.anInt1910 + -i_8_ shl 12) / i_7_
                i_12_ = Class132.anInt1910
            } else if (Class38.anInt513 < i_12_) {
                i_11_ = (Class38.anInt513 - i_8_ shl 12) / i_7_
                i_12_ = Class38.anInt513
            }
            if (Class132.anInt1910 <= i_9_) {
                if (Class38.anInt513 < i_9_) {
                    i_10_ = (Class38.anInt513 - i_8_ shl 12) / i_7_
                    i_9_ = Class38.anInt513
                }
            } else {
                i_10_ = (-i_8_ + Class132.anInt1910 shl 12) / i_7_
                i_9_ = Class132.anInt1910
            }
            method1783(i_10_, -1, i_9_, i_12_, i_11_, i_1_)
        }

        @JvmStatic
        fun method2666(i: Int, i_13_: Int, class46: Class46?, i_14_: Byte) {
            anInt4199++
            if (class46 != null) {
                if (class46.anObjectArray714 != null) {
                    val class348_sub36 = Class348_Sub36()
                    class348_sub36.anObjectArray6987 = class46.anObjectArray714
                    class348_sub36.aClass46_6989 = class46
                    method705(class348_sub36)
                }
                Class362.anInt4458 = class46.anInt695
                Class246.anInt3176 = i
                Class38.anInt500 = i_13_
                Class301.anInt3829 = class46.anInt812
                r.aBoolean9722 = true
                Class9.anInt169 = class46.anInt704
                Class348_Sub49_Sub1.anInt9747 = class46.anInt824
                if (i_14_.toInt() != 21) Companion.method2665(-99, (-106).toByte(), 10, -37, 26, -123)
                Class149.anInt2046 = class46.anInt830
                method1916(-9343, class46)
            }
        }

        fun method2669(objects: Array<Any?>?, ls: LongArray?, i: Int) {
            try {
                if (i < -5) {
                    anInt4209++
                    Class353.method3461(0, objects, -1 + ls!!.size, ls, 9455)
                }
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, ("eaa.E(" + (if (objects != null) "{...}" else "null") + ',' + (if (ls != null) "{...}" else "null") + ',' + i + ')'))
            }
        }
    }
}
