import kotlin.math.cos
import kotlin.math.sin

/* Class21 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class21 {
    override fun toString(): String {
        anInt327++
        throw IllegalStateException()
    }

    companion object {
        @JvmField
        var anInt321: Int = 0
        @JvmField
        var aClass45_322: Class45? = null
        @JvmField
        var aClass46_323: Class46? = null
        @JvmField
        var anInt324: Int = 0
        @JvmField
        var anInt325: Int = -50
        @JvmField
        var aHa326: ha? = null
        @JvmField
        var anInt327: Int = 0

        @JvmStatic
        fun method288(i: Byte) {
            aClass45_322 = null
            if (i > 93) {
                aHa326 = null
                aClass46_323 = null
            }
        }

        fun method289(i: Int, i_0_: Int, i_1_: Int, i_2_: Int) {
            anInt324++
            if (Class369_Sub1.anInt8583 != i_2_ || Class295.anInt3760 != i_0_ || i_1_ != Class27.anInt396) {
                Class369_Sub1.anInt8583 = i_2_
                Class348_Sub16_Sub2.aBoolean8870 = true
                Class27.anInt396 = i_1_
                Class295.anInt3760 = i_0_
                val d = -((i_2_ * 2).toDouble() * 3.141592653589793) / 16384.0
                val d_3_ = -(3.141592653589793 * (2 * i_0_).toDouble()) / 16384.0
                val d_4_ = cos(d_3_)
                val d_5_ = sin(d_3_)
                val d_6_ = cos(d)
                val d_7_ = sin(d)
                Class247.aDouble3182 = d_4_
                Class348_Sub15.aDouble6774 = d_7_
                Class295.aDouble3761 = d_6_
                Class348_Sub16_Sub2.aDouble8869 = d_4_ * d_6_
                if (i != -15902) Companion.method288((-120).toByte())
                Class348_Sub42_Sub5.aDouble9531 = d_7_ * -d_4_
                Class357.aDouble4404 = d_5_
                Class319.aDouble3980 = 0.0
                Class59.aDouble1083 = d_6_ * -d_5_
                Class348_Sub23_Sub2.aDouble9023 = d_5_ * d_7_
            }
        }
    }
}
