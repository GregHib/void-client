import Class299.Companion.method2253
import jagex3.jagmisc.jagmisc.ping
import java.net.InetAddress

class Class169 : Runnable {
    private var aClass262_2258: Class262? = Class262()
    private var aThread2259: Thread? = Thread(this)
    override fun run() {
        anInt2263++
        while (true) {
            val class348_sub26: Class348_Sub26 = runClass348() ?: break
            var i: Int
            try {
                val `is` = InetAddress.getByName(class348_sub26!!.aString6888).getAddress()
                i = ping(`is`[0], `is`[1], `is`[2], `is`[3], 1000L)
            } catch (throwable: Throwable) {
                i = 1000
            }
            class348_sub26!!.anInt6887 = i
        }
    }

    fun runClass348(): Class348_Sub26? {
        val class348_sub26: Class348_Sub26?
        synchronized(aClass262_2258!!) {
            var class348: Class348?
            class348 = aClass262_2258!!.method1997(8)
            while (class348 == null) {
                try {
                    (aClass262_2258 as Object).wait()
                } catch (interruptedexception: InterruptedException) {
                    /* empty */
                }
                class348 = aClass262_2258!!.method1997(8)
            }
            if (class348 !is Class348_Sub26) return null
            class348_sub26 = class348
        }
        return class348_sub26
    }

    init {
        aThread2259!!.setDaemon(true)
        aThread2259!!.start()
    }

    fun method1302(i: Int, string: String): Class348_Sub26 {
        anInt2266++
        checkNotNull(aThread2259) { "" }
        requireNotNull(string) { "" }
        if (i != -5255) aClass262_2258 = null
        val class348_sub26 = Class348_Sub26(string)
        method1304(1000, class348_sub26)
        return class348_sub26
    }

    fun method1303(i: Byte) {
        anInt2257++
        if (aThread2259 != null) {
            method1304(1000, Class348())
            try {
                aThread2259!!.join()
            } catch (interruptedexception: InterruptedException) {
                /* empty */
            }
            aThread2259 = null
            if (i.toInt() != 16) anInt2264 = 87
        }
    }

    private fun method1304(i: Int, class348: Class348) {
        if (i != 1000) method1303(95.toByte())
        synchronized(aClass262_2258!!) {
            aClass262_2258!!.method1999(class348, -20180)
            (aClass262_2258 as Object).notify()
        }
        anInt2262++
    }

    companion object {
        var anInt2257: Int = 0
        @JvmField
        var aClass105Array2260: Array<Class105?>? = null
        @JvmField
        var aClass19Array2261: Array<Class19?>? = null
        var anInt2262: Int = 0
        var anInt2263: Int = 0
        @JvmField
        var anInt2264: Int = 0
        @JvmField
        var anInt2265: Int = method2253(1600, 124)
        var anInt2266: Int = 0

        @JvmStatic
        fun method1300(i: Byte) {
            if (i < -127) {
                aClass105Array2260 = null
                aClass19Array2261 = null
            }
        }

        @JvmStatic
        fun method1301(var_r: r?, i: Int, i_0_: Int, i_1_: Int, bools: BooleanArray?) {
            if (aa_Sub1.aSArray5191 != Class332.aSArray4142) {
                val i_2_ = Class348_Sub1_Sub1.aSArray8801!![i]!!.method3986(i_0_, i_1_, (-93).toByte())
                for (i_3_ in 0..i) {
                    if (bools == null || bools[i_3_]) {
                        val var_s = Class348_Sub1_Sub1.aSArray8801!![i_3_]
                        if (var_s != null) var_s.wa(var_r, i_0_, i_2_ - var_s.method3986(i_0_, i_1_, (-103).toByte()), i_1_, 0, false)
                    }
                }
            }
        }
    }
}
