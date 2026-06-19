import kotlin.math.pow

object StaticNoiseTextureStatics {
    @JvmField
            var anInt8659: Int = 0
            @JvmField
            var anInt8661: Int = 0
            @JvmField
            var aRgbColorPalette_8662: RgbColorPalette? = RgbColorPalette(6, 5)
            var anIntArray8663: IntArray? = IntArray(120)
            @JvmField
            var aBoundsConstraintEntry_8664: BoundsConstraintEntry?
            @JvmField
            var anInt8665: Int = 0
            @JvmField
            var anIntArray8666: IntArray? = null
    
            @JvmStatic
            fun method561(i: Int) {
                aRgbColorPalette_8662 = null
                if (i != 120) method561(-85)
                anIntArray8666 = null
                anIntArray8663 = null
                aBoundsConstraintEntry_8664 = null
            }
    
            init {
                var i = 0
                for (i_7_ in 0..119) {
                    val i_8_ = i_7_ - -1
                    val i_9_ = (300.0 * 2.0.pow(i_8_.toDouble() / 7.0) + i_8_.toDouble()).toInt()
                    i += i_9_
                    anIntArray8663!![i_7_] = i / 4
                }
                aBoundsConstraintEntry_8664 = BoundsConstraintEntry("", 17)
            }
}
