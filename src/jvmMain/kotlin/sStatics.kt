import java.awt.Canvas

/**
 * JVM-only statics extracted from s's companion.
 */
object sStatics {
    fun method3980(i: Int, canvas: Canvas) {
        if (i > 85) {
            s.anInt4586++
            val dimension = canvas.getSize()
            Class85.method828(38.toByte(), dimension.height, dimension.width)
            val displayTarget = AwtDisplayTarget(canvas)
            if (Class348_Sub49.anInt7207 != 1) Class21.aHa326!!.method3669(displayTarget, Class59_Sub1.anInt5283, Class107.anInt1651)
            else Class21.aHa326!!.method3669(displayTarget, Class348_Sub16_Sub1.anInt8854, Class239_Sub16.anInt6008)
        }
    }
}
