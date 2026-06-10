import Class348_Sub42_Sub16_Sub1.Companion.method3262
import kotlin.concurrent.Volatile

/* Class168 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
object Class168 {
    var aClass114_2248: Class114?
    @JvmField
    var aClass46_2249: Class46? = null
    @JvmField
    var aShort2250: Short = 205
    var anInt2251: Int = 0
    @JvmField
    var aClass323_2252: Class323? = null
    var anInt2253: Int = 0
    @JvmField
    var anInt2254: Int = 0
    var aClass114_2255: Class114?

    @Volatile
    var anObject2256: Any?

    @JvmStatic
    fun method1298(i: Int) {
        if (i != -1) aClass46_2249 = null
        anObject2256 = null
        aClass114_2255 = null
        aClass46_2249 = null
        aClass114_2248 = null
        aClass323_2252 = null
    }

    fun method1299(i: Int, i_0_: Int, i_1_: Int): Boolean {
        anInt2253++
        if (i != 393216) anInt2251 = -106
        return method3262(i_0_, i_1_, 102) or ((i_0_ and 0x60000) != 0) || Class348_Sub9.method2783(i_1_, (-99).toByte(), i_0_)
    }

    init {
        aClass114_2248 = Class114(25, 6)
        aClass114_2255 = Class114(99, -1)
        anObject2256 = null
    }
}
