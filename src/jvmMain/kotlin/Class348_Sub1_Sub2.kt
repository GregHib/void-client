/* Class348_Sub1_Sub2 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class348_Sub1_Sub2 internal constructor(i: Int, i_9_: Int, i_10_: Int, i_11_: Int, i_12_: Int, f: Float) : Class348_Sub1(i, i_9_, i_10_, i_11_, i_12_, f) {
    override fun method2725(i: Int, i_0_: Byte, i_1_: Int, i_2_: Int) {
        this.anInt6553 = i_1_
        this.anInt6548 = i_2_
        anInt8812++
        if (i_0_.toInt() == 70) this.anInt6562 = i
    }

    override fun method2716(i: Int, f: Float) {
        this.aFloat6550 = f
        if (i == -1) anInt8814++
    }

    companion object {
        @JvmField
        var aClass262_8810: Class262? = Class262()
        @JvmField
        var anInt8811: Int = 0
        @JvmField
        var anInt8812: Int = 0
        @JvmField
        var anInt8813: Int = 0
        @JvmField
        var anInt8814: Int = 0
        @JvmField
        var aClass308_8815: Class308? = Class308(16)
        @JvmField
        var aByteArrayArray8816: Array<ByteArray?>? = null
        @JvmField
        var aClass114_8817: Class114? = Class114(83, 2)

        @JvmStatic
        fun method2729(i: Int, i_3_: Int): Int {
            anInt8813++
            if (i_3_ != 16) return 23
            return 0xff and i
        }

        @JvmStatic
        fun method2730(i: Int, i_4_: Int, `is`: ByteArray, i_5_: Int): ByteArray {
            anInt8811++
            val is_6_: ByteArray?
            if (i_4_ > 0) {
                is_6_ = ByteArray(i_5_)
                var i_7_ = 0
                while (i_5_ > i_7_) {
                    is_6_[i_7_] = `is`[i_4_ + i_7_]
                    i_7_++
                }
            } else is_6_ = `is`
            val class85 = Class85()
            class85.method829(i + -4682)
            class85.method832((i_5_ * 8).toLong(), is_6_, -69)
            val is_8_ = ByteArray(64)
            class85.method833(true, 0, is_8_)
            return is_8_
        }

        @JvmStatic
        fun method2731(i: Byte) {
            aByteArrayArray8816 = null
            aClass262_8810 = null
            aClass308_8815 = null
            aClass114_8817 = null
        }
    }
}
