import kotlin.math.cos
import kotlin.math.sin

/* Class70 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class70 {
    override fun toString(): String {
        anInt1203++
        throw IllegalStateException()
    }

    companion object {
        @JvmField
        var anInt1203: Int = 0
        @JvmField
        var anIntArray1204: IntArray?
        @JvmField
        var anInt1205: Int = 0
        @JvmField
        var anInt1206: Int = 0
        @JvmField
        var anIntArray1207: IntArray? = IntArray(16384)

        @JvmStatic
        fun method725(i: Int) {
            anIntArray1207 = null
            anIntArray1204 = null
            if (i != 16384) anIntArray1207 = null
        }

        @JvmStatic
        fun method726(i: Int) {
            if (i <= 88) anIntArray1204 = null
            anInt1206++
            if (Class348_Sub42_Sub15.aClass56_9660 != null) {
                Class51.aClass311_897 = Class311()
                Class51.aClass311_897!!.method2316(Class348_Sub42_Sub15.aClass56_9660, Class348_Sub42_Sub15.aClass56_9660!!.aClass274_1012!!.method2063(Class348_Sub33.anInt6967, 544), Class348_Sub42_Sub15.aClass56_9660!!.anInt1025, Class283.aLong3660, false)
                Class348_Sub32.aThread6946 = Thread(Class51.aClass311_897, "")
                Class348_Sub32.aThread6946!!.start()
            }
        }

        fun method727(i: Byte, i_0_: Int, i_1_: Int, i_2_: Int) {
            anInt1205++
            val class348_sub42_sub15 = Class318_Sub9_Sub1.method2516(i_2_, 105.toByte(), 9)
            class348_sub42_sub15.method3246(i + -25427)
            class348_sub42_sub15.anInt9652 = i_1_
            class348_sub42_sub15.anInt9651 = i_0_
            if (i.toInt() != -63) anIntArray1207 = null
        }

        init {
            anIntArray1204 = IntArray(16384)
            val d = 3.834951969714103E-4
            for (i in 0..16383) {
                anIntArray1207!![i] = (16384.0 * sin(d * i.toDouble())).toInt()
                anIntArray1204!![i] = (cos(d * i.toDouble()) * 16384.0).toInt()
            }
        }
    }
}
