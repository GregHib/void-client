import kotlin.math.cos
import kotlin.math.sin

/* Class239_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
class Class239_Sub4 : Class239 {
    override fun method1716(bool: Boolean) {
        if (bool != false) method1736(-57)
        anInt5880++
        if (this.aClass348_Sub51_3136.method3422(674) != Class10.aClass230_186) this.anInt3138 = 1
        else if (this.aClass348_Sub51_3136.method3425(-95)) this.anInt3138 = 0
        if (this.anInt3138 != 0 && this.anInt3138 != 1) this.anInt3138 = method1710(20014)
    }

    override fun method1712(i: Int, i_0_: Int) {
        val i_1_ = 107 / ((i - 82) / 35)
        anInt5879++
        this.anInt3138 = i_0_
    }

    fun method1736(i: Int): Boolean {
        anInt5873++
        if (this.aClass348_Sub51_3136.method3425(-80)) return false
        if (i < 85) method1716(true)
        return this.aClass348_Sub51_3136.method3422(674) == Class10.aClass230_186
    }

    internal constructor(class348_sub51: Class348_Sub51) : super(class348_sub51)

    override fun method1710(i: Int): Int {
        if (i != 20014) aClass114_5883 = null
        anInt5877++
        return 1
    }

    fun method1737(i: Int): Int {
        if (i != -32350) method1716(true)
        anInt5875++
        return this.anInt3138
    }

    override fun method1714(i: Int, i_2_: Int): Int {
        if (i != 3) aString5882 = null
        anInt5872++
        if (this.aClass348_Sub51_3136.method3425(-63)) return 3
        if (this.aClass348_Sub51_3136.method3422(674) == Class10.aClass230_186) return 1
        return 3
    }

    internal constructor(i: Int, class348_sub51: Class348_Sub51) : super(i, class348_sub51)

    companion object {
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
        var aClass45_5878: Class45? = null
        @JvmField
        var anInt5879: Int = 0
        @JvmField
        var anInt5880: Int = 0
        @JvmField
        var aClass348_Sub26_5881: Class348_Sub26? = null
        @JvmField
        var aString5882: String? = null
        @JvmField
        var aClass114_5883: Class114? = Class114(34, 12)

        @JvmStatic
        fun method1738(i: Int) {
            aClass45_5878 = null
            aFloatArray5874 = null
            aString5882 = null
            if (i != 21921) method1738(11)
            aFloatArray5876 = null
            aClass348_Sub26_5881 = null
            aClass114_5883 = null
        }

        init {
            val d = 3.834951969714103E-4
            for (i in 0..16383) {
                aFloatArray5874!![i] = sin(d * i.toDouble()).toFloat()
                aFloatArray5876!![i] = cos(i.toDouble() * d).toFloat()
            }
        }
    }
}
