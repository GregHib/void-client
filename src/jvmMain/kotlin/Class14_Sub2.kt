import Class348_Sub16_Sub3.Companion.method2878
import Class348_Sub40_Sub3.Companion.method3055
import Class55.Companion.method520
import jaggl.OpenGL.Companion.glTexImage2Di
import r_Sub2.Companion.method3297

class Class14_Sub2 internal constructor(class377: Class377?, i: Int, bool: Boolean, `is`: Array<IntArray?>?) : Class14(class377, 34067, Class108.aClass304_1662, Class68.aClass68_1183, 6 * (i * i), bool), Interface18_Impl2 {
    init {
        try {
            this.aClass377_5082!!.method3850((-109).toByte(), this)
            if (bool) {
                for (i_1_ in 0..5) this.method233(i, i, `is`!![i_1_]!!, i_1_ + 34069, 255)
            } else {
                for (i_0_ in 0..5) glTexImage2Di(34069 + i_0_, 0, this.method228(121), i, i, 0, method3055(110, this.aClass304_5084), (this.aClass377_5082!!.anInt9918), `is`!![i_0_], 0)
            }
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("le.<init>(" + (if (class377 != null) "{...}" else "null") + ',' + i + ',' + bool + ',' + (if (`is` != null) "{...}" else "null") + ')'))
        }
    }

    companion object {
        @JvmField
        var anInt8619: Int = 0
        @JvmField
        var anInt8620: Int = 0
        @JvmField
        var aDouble8621: Double = 0.0
        @JvmField
        var anInt8622: Int = 0

        /*synthetic*/
        var aClass8623: Class<*>? = null

        @JvmStatic
        fun method243(i: Int) {
            anInt8620++
            var class234: Class234? = null
            try {
                val class144 = Class348_Sub23_Sub1.aClass297_8992!!.method2233((-46).toByte(), "", true)
                while (class144!!.anInt1997 == 0) Class286_Sub5.method2161((-122).toByte(), 1L)
                if (class144.anInt1997 == 1) {
                    class234 = class144.anObject1998 as Class234?
                    val class348_sub49 = Class316.aClass348_Sub51_3959!!.method3427(24)
                    class234!!.method1658(114.toByte(), 0, (class348_sub49.anInt7197), (class348_sub49.aByteArray7154))
                }
            } catch (exception: Exception) {
                /* empty */
            }
            do {
                try {
                    if (i != 37) aDouble8621 = -0.46512114956219314
                    if (class234 == null) break
                    class234.method1657(false)
                } catch (exception: Exception) {
                    break
                }
                break
            } while (false)
        }

        @JvmStatic
        fun method244(i: Int): Int {
            anInt8622++
            if (Class75.aFloat1249.toDouble() == 3.0) return 37
            if (i != 37) return 11
            if (Class75.aFloat1249.toDouble() == 4.0) return 50
            if (Class75.aFloat1249.toDouble() == 6.0) return 75
            if (Class75.aFloat1249.toDouble() == 8.0) return 100
            return 200
        }

        @JvmStatic
        fun method245(i: Int, i_2_: Int, i_3_: Int, i_4_: Byte): Boolean {
            if (i_4_ < 38) return false
            anInt8619++
            var interface10 = method3297(i, i_2_, i_3_) as Interface10?
            var bool = true
            if (interface10 != null) bool = bool and method520(interface10, -1)
            interface10 = (Class177.method1353(i, i_2_, i_3_, (if (aClass8623 != null) aClass8623 else (Interface10::class.java.also { aClass8623 = it }))) as Interface10?)
            if (interface10 != null) bool = bool and method520(interface10, -1)
            interface10 = method2878(i, i_2_, i_3_) as Interface10?
            if (interface10 != null) bool = bool and method520(interface10, -1)
            return bool
        }
    }
}
