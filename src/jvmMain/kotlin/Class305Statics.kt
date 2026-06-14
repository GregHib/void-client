import java.awt.Canvas

/**
 * JVM-only companion statics split from [Class305] — holds the AWT canvas reference
 * plus companion methods that touch JVM-only types (Canvas, Class318_Sub2, za_Sub1)
 * so that Class305 itself can eventually live in commonMain.
 */
object Class305Statics {
    var aCanvas3869: Canvas? = null

    @JvmStatic
    fun method2294(i: Int) {
        aCanvas3869 = null
        Class305.aDisplayTarget3869 = null
        if (i <= 94) method2296(-107)
    }

    @JvmStatic
    fun method2296(i: Int) {
        Class305.anInt3868++
        if (i < -46) {
            for (i_22_ in 0..99) Class318_Sub2.aClass147Array6400!![i_22_] = null
            za_Sub1.anInt9774 = 0
        }
    }
}
