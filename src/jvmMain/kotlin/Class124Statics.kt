import Class85.Companion.method828
import java.awt.Canvas

/**
 * JVM-only statics extracted from Class124's companion.
 */
object Class124Statics {
    @JvmStatic
    fun method1108(i: Byte, canvas: Canvas) {
        Class124.anInt1850++
        val dimension = canvas.getSize()
        if (i.toInt() != -99) Class124.method1096(57)
        method828(38.toByte(), dimension.height, dimension.width)
        val displayTarget = AwtDisplayTarget(canvas)
        if (Class348_Sub49.anInt7207 != 1) Class21.aHa326!!.method3643(displayTarget, Class59_Sub1.anInt5283, Class107.anInt1651)
        else Class21.aHa326!!.method3643(displayTarget, Class348_Sub16_Sub1.anInt8854, Class239_Sub16.anInt6008)
    }
}
