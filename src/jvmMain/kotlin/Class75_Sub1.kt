/* Class75_Sub1 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
object Class75_Sub1 : Class75() {
    @JvmField
    var anInt5652: Int = 1
    @JvmField
    var anInt5653: Int = 0
    var aFloat5654: Float = 1.0f

    @JvmStatic
    fun method769(i: Int, i_0_: Byte) {
        anInt5653++
        if (i_0_ > 109 && Class320.method2547(i, 84.toByte())) Class348_Sub42_Sub4.method3180(-1, (Class348_Sub40_Sub33.aClass46ArrayArray9427!![i]!!), 24235)
    }

    @JvmStatic
    fun method770(i: Int, i_1_: Int, i_2_: Int, class318_sub1_sub1: Class318_Sub1_Sub1) {
        val class357 = Class348_Sub46.method3321(i, i_1_, i_2_)
        if (class357 != null) {
            class357.aClass318_Sub1_Sub1_4402 = class318_sub1_sub1
            val i_3_ = if (aa_Sub1.aSArray5191 == Class332.aSArray4142) 1 else 0
            if (class318_sub1_sub1.method2376(-93)) {
                if (class318_sub1_sub1.method2377(122.toByte())) {
                    class318_sub1_sub1.aClass318_Sub1_6379 = Class250.aClass318_Sub1Array3226!![i_3_]
                    Class250.aClass318_Sub1Array3226!![i_3_] = class318_sub1_sub1
                } else {
                    class318_sub1_sub1.aClass318_Sub1_6379 = Class348.aClass318_Sub1Array4293!![i_3_]
                    Class348.aClass318_Sub1Array4293!![i_3_] = class318_sub1_sub1
                    Class348_Sub16_Sub2.aBoolean8870 = true
                }
            } else {
                class318_sub1_sub1.aClass318_Sub1_6379 = Class115.aClass318_Sub1Array1754!![i_3_]
                Class115.aClass318_Sub1Array1754!![i_3_] = class318_sub1_sub1
            }
        }
    }
}
