import java.awt.Frame
import java.math.BigInteger

class Class52 internal constructor(@JvmField var anInt4899: Int) : Interface12 {
    override fun method51(i: Byte): Class223? {
        anInt4894++
        if (i < 116) return null
        return Class219.aClass223_2868
    }

    companion object {
        @JvmField
        var anInt4894: Int = 0
        @JvmField
        var anInt4895: Int = 0
        @JvmField
        var aBigInteger4896: BigInteger? = BigInteger("10001", 16)
        @JvmField
        var anInt4897: Int = 0
        @JvmField
        var anInt4898: Int = 0
        @JvmField
        var anInt4900: Int = 0
        @JvmField
        var aClass138_4901: Class138?
        @JvmField
        var anInt4902: Int = 0
        @JvmField
        var aBoolean4903: Boolean = false
        @JvmField
        var aFrame4904: Frame? = null
        @JvmField
        var aClass351_4905: Class351?
        var anIntArray4906: IntArray?
        @JvmField
        var aClass351_4907: Class351?

        fun method490(i: Byte, class348_sub49: Class348_Sub49): Class43 {
            anInt4897++
            val class43 = Class43()
            class43.anInt615 = class348_sub49.readUnsignedShort(842397944)
            class43.aClass348_Sub42_Sub10_614 = Class239_Sub6.aClass355_5900!!.method3471(class43.anInt615, (-90).toByte())
            val i_0_ = -91 / ((9 - i) / 54)
            return class43
        }

        fun method491(i: Byte) {
            var i_1_ = 0
            while ((Class348_Sub33.aByteArrayArrayArray6962!!.size > i_1_)) {
                for (i_2_ in Class348_Sub33.aByteArrayArrayArray6962!![0]!!.indices) {
                    var i_3_ = 0
                    while ((Class348_Sub33.aByteArrayArrayArray6962!![0]!![0]!!.size > i_3_)) {
                        Class348_Sub33.aByteArrayArrayArray6962!![i_1_]!![i_2_]!![i_3_] = 0.toByte()
                        i_3_++
                    }
                }
                i_1_++
            }
            val i_4_ = 119 / ((i - 47) / 34)
            anInt4902++
        }

        @JvmStatic
        fun method492(i: Int) {
            aClass351_4905 = null
            aClass351_4907 = null
            aFrame4904 = null
            if (i < -17) {
                aBigInteger4896 = null
                anIntArray4906 = null
                aClass138_4901 = null
            }
        }

        @JvmStatic
        fun method493(bool: Boolean) {
            if (Class328_Sub2.aClass56Array6515 == null) {
                Class328_Sub2.aClass56Array6515 = Class56.Companion.method528(-91)
                Class348_Sub42_Sub15.aClass56_9660 = Class328_Sub2.aClass56Array6515!![0]
                Class283.aLong3660 = Class62.method599(-119)
            }
            anInt4900++
            if (Class51.Companion.aClass311_897 == null) Class70.method726(116)
            val class56 = Class348_Sub42_Sub15.aClass56_9660!!
            val i = Class164.method1278(-28660)
            if (class56 == Class348_Sub42_Sub15.aClass56_9660) {
                Class64_Sub2.aString5420 = Class348_Sub42_Sub15.aClass56_9660!!.aClass274_1012!!.method2063(Class348_Sub33.anInt6967, 544)
                if (Class348_Sub42_Sub15.aClass56_9660!!.aBoolean1016) Class251.anInt3236 = (i * ((Class348_Sub42_Sub15.aClass56_9660!!.anInt1021) + -(Class348_Sub42_Sub15.aClass56_9660!!.anInt1025)) / 100 + (Class348_Sub42_Sub15.aClass56_9660!!.anInt1025))
                if (Class348_Sub42_Sub15.aClass56_9660!!.aBoolean1013) Class64_Sub2.aString5420 += Class251.anInt3236.toString() + "%"
            } else if (Class348_Sub42_Sub15.aClass56_9660 == Class56.Companion.aClass56_1043) {
                Class51.Companion.aClass311_897 = null
                Class348_Sub49.method3379(2, 3)
            } else {
                Class64_Sub2.aString5420 = class56.aClass274_1015!!.method2063(Class348_Sub33.anInt6967, 544)
                if (Class348_Sub42_Sub15.aClass56_9660!!.aBoolean1013) Class64_Sub2.aString5420 += class56.anInt1021.toString() + "%"
                Class251.anInt3236 = class56.anInt1021
                if (Class348_Sub42_Sub15.aClass56_9660!!.aBoolean1016 || class56.aBoolean1016) Class283.aLong3660 = Class62.method599(-128)
            }
            if (bool == true) {
                if (Class51.Companion.aClass311_897 != null) {
                    Class51.Companion.aClass311_897!!.method2316((Class348_Sub42_Sub15.aClass56_9660), Class64_Sub2.aString5420, Class251.anInt3236, Class283.aLong3660, false)
                    if (Class182.anInterface16Array2447 != null) {
                        var i_5_ = Class375.anInt4544 - -1
                        while ((Class182.anInterface16Array2447!!.size > i_5_)) {
                            if (Class182.anInterface16Array2447!![i_5_]!!.method60(-19079) >= 100 && Class375.anInt4544 == -1 + i_5_ && Class240.anInt4674 >= 1 && Class51.Companion.aClass311_897!!.method2322(0)) {
                                try {
                                    Class182.anInterface16Array2447!![i_5_]!!.method57(117)
                                } catch (exception: Exception) {
                                    Class182.anInterface16Array2447 = null
                                    break
                                }
                                Class51.Companion.aClass311_897!!.method2321(10559, Class182.anInterface16Array2447!![i_5_]!!)
                                Class375.anInt4544++
                                if ((Class375.anInt4544 >= (-1 + Class182.anInterface16Array2447!!.size)) && Class182.anInterface16Array2447!!.size > 1) Class375.anInt4544 = if (!Class186_Sub1.aClass111_5813!!.method1044(26)) -1 else 0
                            }
                            i_5_++
                        }
                    }
                }
            }
        }

        @JvmStatic
        fun method494(i: Int, i_6_: Int): Int {
            if (i <= 78) aBigInteger4896 = null
            anInt4898++
            return 0x7f and i_6_
        }

        init {
            aClass138_4901 = Class138(12, 0, 1, 0)
            anIntArray4906 = IntArray(4)
            aClass351_4905 = Class351(44, 3)
            aClass351_4907 = Class351(48, 11)
        }
    }
}
