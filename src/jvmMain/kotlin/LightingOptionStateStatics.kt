import kotlin.math.cos
import kotlin.math.sin

object LightingOptionStateStatics {
    @JvmField
            var anInt5872: Int = 0
            @JvmField
            var anInt5873: Int = 0
            @JvmField
            var aFloatArray5874: FloatArray? = FloatArray(16384)
            @JvmField
            var anInt5875: Int = 0
            @JvmField
            var aFloatArray5876: FloatArray? = FloatArray(16384)
            @JvmField
            var anInt5877: Int = 0
            @JvmField
            var aJs5Archive_5878: Js5Archive? = null
            @JvmField
            var anInt5879: Int = 0
            @JvmField
            var anInt5880: Int = 0
            @JvmField
            var aClass348_Sub26_5881: NamedIdEntry? = null
            @JvmField
            var aString5882: String? = null
            @JvmField
            var aIntRange_5883: IntRange? = IntRange(34, 12)
    
            @JvmStatic
            fun method1738(i: Int) {
                aJs5Archive_5878 = null
                aFloatArray5874 = null
                aString5882 = null
                if (i != 21921) method1738(11)
                aFloatArray5876 = null
                aClass348_Sub26_5881 = null
                aIntRange_5883 = null
            }
    
            init {
                val d = 3.834951969714103E-4
                for (i in 0..16383) {
                    aFloatArray5874!![i] = sin(d * i.toDouble()).toFloat()
                    aFloatArray5876!![i] = cos(i.toDouble() * d).toFloat()
                }
            }
}
