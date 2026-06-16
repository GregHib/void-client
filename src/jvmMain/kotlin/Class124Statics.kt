import Class85.Companion.method828
import java.awt.Canvas

/**
 * JVM-only statics extracted from Class124's companion.
 * Holds AWT-coupled method1108 plus the Class45-coupled companion members
 * (aClass45_1848, method1096, method1097) so Class124 itself can live in commonMain.
 */
object Class124Statics {
    var aClass45_1848: Class45? = null

    fun method1096(i: Int) {
        if (i >= 88) aClass45_1848 = null
    }

    fun method1097(i: Byte, i_20_: Int, random: JavaRandom): Int {
        Class124.anInt1861++
        require(i_20_ > 0)
        if (Class192.method1436(-19, i_20_)) return (i_20_.toLong() * (0xffffffffL and random.nextInt().toLong()) shr 32).toInt()
        val i_21_ = -2147483648 + -(4294967296L % i_20_.toLong()).toInt()
        if (i < 78) aClass45_1848 = null
        var i_22_: Int
        do i_22_ = random.nextInt() while (i_22_ >= i_21_)
        return Class350.method3452(i_22_, (-15).toByte(), i_20_)
    }

    fun method1108(i: Byte, canvas: Canvas) {
        Class124.anInt1850++
        val dimension = canvas.getSize()
        if (i.toInt() != -99) method1096(57)
        method828(38.toByte(), dimension.height, dimension.width)
        val displayTarget = AwtDisplayTarget(canvas)
        if (Class348_Sub49.anInt7207 != 1) Class21.aHa326!!.method3643(displayTarget, Class59_Sub1.anInt5283, Class107.anInt1651)
        else Class21.aHa326!!.method3643(displayTarget, Class348_Sub16_Sub1.anInt8854, Class239_Sub16.anInt6008)
    }
}
