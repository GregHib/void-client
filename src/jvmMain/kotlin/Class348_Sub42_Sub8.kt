import Class239.Companion.method1713

/* Class348_Sub42_Sub8 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
abstract class Class348_Sub42_Sub8 internal constructor(@JvmField var anInt9545: Int) : Class348_Sub42() {
    abstract fun method3193(i: Int): Any?

    abstract fun method3195(i: Int): Boolean

    companion object {
        @JvmField
        var anInt9546: Int = 0
        @JvmField
        var anInt9547: Int = 0
        @JvmField
        var anInt9548: Int = 0
        @JvmField
        var anInt9549: Int = 0
        @JvmField
        var aClass114_9550: Class114? = Class114(109, 7)
        @JvmField
        var anInt9551: Int = 0
        @JvmField
        var aClass114_9552: Class114? = Class114(72, 0)
        @JvmField
        var aClass351_9553: Class351? = Class351(36, 7)
        @JvmField
        var aString9554: String? = null
        @JvmField
        var aShort9555: Short = 1

        @JvmStatic
        fun method3194(i: Int, i_0_: Int, i_1_: Byte): Boolean {
            anInt9551++
            if (i_1_ <= 118) method3196(122, -41)
            return false
        }

        @JvmStatic
        fun method3196(i: Int, i_2_: Int): Boolean {
            if (i_2_ >= -39) return false
            anInt9546++
            return i == 3 || i == 4 || i == 5 || i == 6
        }

        @JvmStatic
        fun method3197(i: Int, i_3_: Byte): Boolean {
            anInt9549++
            if (i_3_.toInt() != 56) aClass114_9552 = null
            return i == 7 || i == 9
        }

        @JvmStatic
        fun method3198(bool: Boolean, i: Byte) {
            anInt9547++
            if (i.toInt() != -45) aShort9555 = (-74).toShort()
            if (bool) {
                if (r.anInt9721 != -1) Class14.method235(r.anInt9721, (-113).toByte())
                var class348_sub41 = Class125.aClass356_4915!!.method3484(0) as Class348_Sub41?
                while (class348_sub41 != null) {
                    if (!class348_sub41.method2712(4.toByte())) {
                        class348_sub41 = (Class125.aClass356_4915!!.method3484(i.toInt() xor 0x2c.inv()) as Class348_Sub41?)
                        if (class348_sub41 == null) break
                    }
                    Class127_Sub1.method1118(true, false, class348_sub41, 2533)
                    class348_sub41 = (Class125.aClass356_4915!!.method3482(0) as Class348_Sub41?)
                }
                r.anInt9721 = -1
                Class125.aClass356_4915 = Class356(8)
                Class99.method882(11.toByte())
                r.anInt9721 = Class285.anInt4737
                method1713(false, 520)
                Class354.method3466(100)
                Class66.method703(r.anInt9721)
            }
            Class223.aBoolean2895 = false
            Class186.aString2496 = ""
            Class64_Sub3.aString5600 = Class186.aString2496
            Class195.method1448(-56)
            Class362.anInt4458 = -1
            Class33.method338(i + 45, Class348_Sub42_Sub16_Sub1.anInt10447)
            Class132.aPlayer_1907 = Player()
            Class132.aPlayer_1907!!.x = 512 * Class367_Sub4.anInt7319 / 2
            Class132.aPlayer_1907!!.anIntArray10320!![0] = Class367_Sub4.anInt7319 / 2
            Class132.aPlayer_1907!!.y = 512 * Class348_Sub40_Sub3.anInt9109 / 2
            Class132.aPlayer_1907!!.anIntArray10317!![0] = Class348_Sub40_Sub3.anInt9109 / 2
            Class59_Sub2_Sub2.anInt8685 = 0
            Class286_Sub4.anInt6246 = Class59_Sub2_Sub2.anInt8685
            if (Class348_Sub40_Sub21.anInt9282 == 2) {
                Class286_Sub4.anInt6246 = Class348_Sub35.anInt6981 shl 9
                Class59_Sub2_Sub2.anInt8685 = Class275.anInt3550 shl 9
            } else Class348_Sub21.method2954(62.toByte())
            Class76.method773(true)
        }

        @JvmStatic
        fun method3199(i: Int) {
            aClass114_9550 = null
            if (i < 17) method3196(60, -85)
            aClass114_9552 = null
            aClass351_9553 = null
            aString9554 = null
        }
    }
}
