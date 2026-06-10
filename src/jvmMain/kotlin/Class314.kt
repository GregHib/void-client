/* Class314 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
abstract class Class314 {
    abstract fun method2335(i: Int, i_0_: Int): Int

    abstract fun method2338(i: Byte, i_6_: Int)

    abstract fun method2339(i: Int, i_7_: Byte): ByteArray?

    abstract fun method2340(i: Byte): Class291?

    companion object {
        @JvmField
        var aFloat3938: Float = 0.0f
        @JvmField
        var anInt3939: Int = 0
        @JvmField
        var anInt3940: Int = 0
        @JvmField
        var anInt3941: Int = 0
        @JvmField
        var anInt3942: Int = 0
        @JvmField
        var aFloat3943: Float = 0f

        @JvmStatic
        fun method2336(class51: Class51, i: Int, i_1_: Int, i_2_: Int, i_3_: Int) {
            anInt3940++
            if (i_3_ > -126) anInt3941 = 15
            var class348_sub9 = Class218.aClass262_2859!!.method1995(4) as? Class348_Sub9?
            while (class348_sub9 != null) {
                if (i_2_ == class348_sub9.anInt6693 && (class348_sub9.anInt6678 == i shl 9) && (i_1_ shl 9 == class348_sub9.anInt6689) && (class348_sub9.aClass51_6695!!.anInt941 == class51.anInt941)) {
                    if (class348_sub9.aClass348_Sub16_Sub5_6676 != null) {
                        Class348_Sub43.aClass348_Sub16_Sub4_7065!!.method2880(class348_sub9.aClass348_Sub16_Sub5_6676!!)
                        class348_sub9.aClass348_Sub16_Sub5_6676 = null
                    }
                    if (class348_sub9.aClass348_Sub16_Sub5_6673 != null) {
                        Class348_Sub43.aClass348_Sub16_Sub4_7065!!.method2880(class348_sub9.aClass348_Sub16_Sub5_6673!!)
                        class348_sub9.aClass348_Sub16_Sub5_6673 = null
                    }
                    class348_sub9.method2715(125.toByte())
                    break
                }
                class348_sub9 = Class218.aClass262_2859!!.method1990(123.toByte()) as? Class348_Sub9?
            }
        }

        fun method2337(f: Float, bool: Boolean, f_4_: Float, f_5_: Float): Float {
            if (bool != true) method2337(-0.96692735f, false, 0.1946915f, -1.0497112f)
            anInt3942++
            return f + (-f + f_4_) * f_5_
        }
    }
}
