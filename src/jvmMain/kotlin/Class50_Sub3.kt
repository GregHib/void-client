import Class367_Sub3.Companion.method3540
import ha_Sub2.Companion.method3743
import java.awt.Color

class Class50_Sub3 internal constructor(private val anInt5246: Int, private val anInt5250: Int, private val anInt5245: Int, private var anInt5247: Int, private val anInt5236: Int, private val anInt5237: Int, private val anInt5243: Int, private val anInt5249: Int, i_29_: Int, i_30_: Int) : Class50(-1, i_29_, i_30_) {
    public override fun method457(i: Int, i_12_: Int, i_13_: Int) {
        anInt5254++
        val i_14_ = anInt5246 * i_12_ shr 12
        val i_15_ = anInt5250 * i shr 12
        val i_16_ = anInt5245 * i_12_ shr 12
        val i_17_ = anInt5247 * i shr 12
        val i_18_ = i_12_ * anInt5236 shr 12
        val i_19_ = anInt5237 * i shr 12
        val i_20_ = i_12_ * anInt5243 shr 12
        if (i_13_ > -29) anInt5252 = -91
        val i_21_ = anInt5249 * i shr 12
        method3540(i_15_, i_17_, this.anInt865, i_21_, i_16_, i_14_, i_18_, i_19_, i_20_, true)
    }

    public override fun method456(i: Int, i_31_: Int, i_32_: Int) {
        anInt5244++
        if (i < 87) anInt5247 = 18
    }

    public override fun method455(i: Int, i_35_: Int, i_36_: Int) {
        anInt5240++
        if (i_36_ >= -98) Companion.method470(null, (-17).toByte())
    }

    companion object {
        @JvmField
        var anInt5238: Int = 0
        @JvmField
        var anInt5239: Int = 0
        @JvmField
        var anInt5240: Int = 0
        @JvmField
        var anIntArray5241: IntArray? = IntArray(14)
        @JvmField
        var aColorArray5242: Array<Color?>? = arrayOf<Color?>(Color(16777215), Color(16777215), Color(16741381), Color(16741381))
        @JvmField
        var anInt5244: Int = 0
        @JvmField
        var anInt5248: Int = 0
        @JvmField
        var anInt5251: Int = 0
        @JvmField
        var anInt5252: Int = 0
        @JvmField
        var anInt5253: Int = 0
        @JvmField
        var anInt5254: Int = 0

        fun method465(i: Int) {
            if (i != -1636518164) anInt5252 = -40
            Class158.aClass356_4934!!.method3481(0)
            anInt5251++
            Class348_Sub42_Sub9_Sub1.aClass356_10442!!.method3481(0)
        }

        @JvmStatic
        fun method466(bool: Boolean, string: String?, i: Int, i_0_: Byte, bool_1_: Boolean, i_2_: Int, i_3_: Int, bool_4_: Boolean, i_5_: Int, l: Long, string_6_: String?, l_7_: Long, i_8_: Int) {
            var i_8_ = i_8_
            try {
                anInt5238++
                if (!Class5_Sub1.aBoolean8335 && Class73.anInt4776 < 500) {
                    i_8_ = if (i_8_ != -1) i_8_ else Class362.anInt4458
                    if (i_0_ >= -65) method469(19.toByte())
                    val class348_sub42_sub12 = Class348_Sub42_Sub12(string_6_, string, i_8_, i_5_, i_3_, l_7_, i_2_, i, bool_4_, bool, l, bool_1_)
                    method3743(6.toByte(), class348_sub42_sub12)
                }
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, ("hc.B(" + bool + ',' + (if (string != null) "{...}" else "null") + ',' + i + ',' + i_0_ + ',' + bool_1_ + ',' + i_2_ + ',' + i_3_ + ',' + bool_4_ + ',' + i_5_ + ',' + l + ',' + (if (string_6_ != null) "{...}" else "null") + ',' + l_7_ + ',' + i_8_ + ')'))
            }
        }

        fun method467(i: Int, i_9_: Int, i_10_: Int) {
            if (i_9_ == -18075) {
                anInt5248++
                val class348_sub42_sub15 = Class318_Sub9_Sub1.method2516(i, 105.toByte(), 1)
                class348_sub42_sub15.method3246(-25490)
                class348_sub42_sub15.anInt9652 = i_10_
            }
        }

        @JvmStatic
        fun method468(string: String?, i: Int): Boolean {
            val i_11_ = -91 % ((-35 - i) / 52)
            anInt5239++
            return Class174.method1332(true, true, 10, string!!)
        }

        @JvmStatic
        fun method469(i: Byte) {
            val i_33_ = -24 / ((i - -12) / 41)
            aColorArray5242 = null
            anIntArray5241 = null
        }

        @JvmStatic
        fun method470(`is`: ShortArray?, i: Byte): ShortArray? {
            anInt5253++
            if (`is` == null) return null
            val is_34_ = ShortArray(`is`.size)
            Class214.method1576(`is`, 0, is_34_, 0, `is`.size)
            if (i >= -103) Companion.method470(null, (-35).toByte())
            return is_34_
        }
    }
}
