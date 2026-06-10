import kotlin.math.sqrt

/* Class348_Sub40_Sub9 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class348_Sub40_Sub9 : Class348_Sub40(1, true) {
    private var anInt9167 = 4096
    override fun method3049(class348_sub49: Class348_Sub49, i: Int, i_2_: Int) {
        if (i_2_ != 31015) method3042(-111, 25)
        anInt9170++
        if (i == 0) anInt9167 = class348_sub49.readUnsignedShort(842397944)
    }

    override fun method3042(i: Int, i_5_: Int): IntArray {
        anInt9166++
        val `is` = this.aClass191_7032!!.method1433(0, i)!!
        if (this.aClass191_7032!!.aBoolean2570) {
            val is_6_ = this.method3048(Class299_Sub2.anInt6325 and -1 + i, 633706337, 0)!!
            val is_7_ = this.method3048(i, 633706337, 0)!!
            val is_8_ = this.method3048(i - -1 and Class299_Sub2.anInt6325, 633706337, 0)!!
            var i_9_ = 0
            while (Class348_Sub40_Sub6.Companion.anInt9139 > i_9_) {
                val i_10_ = anInt9167 * (-is_6_[i_9_] + is_8_[i_9_])
                val i_11_ = (anInt9167 * (-is_7_[Class239_Sub22.anInt6076 and -1 + i_9_] + is_7_[Class239_Sub22.anInt6076 and i_9_ - -1]))
                val i_12_ = i_11_ shr 12
                val i_13_ = i_10_ shr 12
                val i_14_ = i_12_ * i_12_ shr 12
                val i_15_ = i_13_ * i_13_ shr 12
                val i_16_ = (4096.0 * sqrt(((i_15_ + (i_14_ - -4096)).toFloat() / 4096.0f).toDouble())).toInt()
                val i_17_ = if (i_16_ != 0) 16777216 / i_16_ else 0
                `is`[i_9_] = 4096 - i_17_
                i_9_++
            }
        }
        return `is`
    }

    companion object {
        @JvmField
        var anInt9166: Int = 0
        @JvmField
        var anInt9168: Int = 0
        @JvmField
        var anApplet_Sub1_9169: Applet_Sub1? = null
        @JvmField
        var anInt9170: Int = 0
        @JvmField
        var aClass60_9171: Class60? = Class60(4)
        @JvmField
        var anInt9172: Int = 0
        @JvmField
        var aClass324_9173: Class324? = null

        @JvmStatic
        fun method3071(i: Byte) {
            if (i.toInt() != 59) anApplet_Sub1_9169 = null
            aClass60_9171 = null
            aClass324_9173 = null
        }

        @JvmStatic
        fun method3072(i: Byte) {
            anInt9168++
            val i_0_ = Class316.aClass348_Sub51_3959!!.aClass239_Sub14_7264!!.method1778(-32350)
            val i_1_ = 14 / ((i - -34) / 61)
            if (i_0_ == 0) {
                Class289.aByteArrayArrayArray3700 = null
                Class46.method440(0, (-61).toByte())
            } else if (i_0_ == 1) {
                Class301.method2280(0.toByte(), 28587)
                Class46.method440(512, (-61).toByte())
                if (Class348_Sub33.aByteArrayArrayArray6962 != null) Class318_Sub1_Sub3_Sub4.method2468(3613)
            } else {
                Class301.method2280((-4 + Class239_Sub15.anInt6006 and 0xff).toByte(), 28587)
                Class46.method440(2, (-61).toByte())
            }
            Class318_Sub1_Sub3_Sub5.anInt10395 = Class355.anInt4372
        }

        @JvmStatic
        fun method3073(i: Int, i_3_: Int, i_4_: Byte): Boolean {
            anInt9172++
            if (i_4_.toInt() != 50) return false
            return (0x34 and i_3_) != 0
        }
    }
}
