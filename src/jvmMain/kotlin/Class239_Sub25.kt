import Applet_Sub1.Companion.method86
import kotlin.math.pow

/* Class239_Sub25 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class239_Sub25 : Class239 {
    private var aBoolean6110 = true
    @JvmField
    var aBoolean6113: Boolean = false

    override fun method1714(i: Int, i_0_: Int): Int {
        anInt6100++
        if (i != 3) aBoolean6110 = false
        if (!this.aClass348_Sub51_3136.method3428((-89).toByte())!!.method1460(-38)) return 3
        if (i_0_ == 3 && !method86("jagdx", i xor 0x3)) return 3
        return 2
    }

    override fun method1712(i: Int, i_1_: Int) {
        val i_2_ = -50 / ((i - 82) / 35)
        this.anInt3138 = i_1_
        anInt6106++
        this.aBoolean6113 = false
    }

    fun method1826(bool: Boolean, i: Int) {
        aBoolean6110 = bool
        anInt6109++
        if (i != -142238264) method1828(20)
    }

    override fun method1710(i: Int): Int {
        this.aBoolean6113 = true
        anInt6101++
        if (i != 20014) aBoolean6110 = false
        if (!this.aClass348_Sub51_3136.method3428((-113).toByte())!!.method1460(i + -20083)) return 0
        return 2
    }

    internal constructor(i: Int, class348_sub51: Class348_Sub51) : super(i, class348_sub51)

    internal constructor(class348_sub51: Class348_Sub51) : super(class348_sub51)

    override fun method1716(bool: Boolean) {
        anInt6108++
        if (!this.aClass348_Sub51_3136.method3428((-106).toByte())!!.method1460(-33)) this.anInt3138 = 0
        if (bool != false) method1829(31)
        if (this.anInt3138 < 0 || this.anInt3138 > 5) this.anInt3138 = method1710(20014)
    }

    fun method1829(i: Int): Int {
        anInt6107++
        if (i != -32350) aBoolean6110 = false
        return this.anInt3138
    }

    fun method1830(i: Byte): Boolean {
        anInt6099++
        if (i >= -93) aBoolean6110 = false
        return aBoolean6110
    }

    fun method1831(i: Int): Boolean {
        anInt6105++
        if (i < 85) return true
        return this.aClass348_Sub51_3136.method3428((-124).toByte())!!.method1460(-59)
    }

    companion object {
        @JvmField
        var anInt6099: Int = 0
        @JvmField
        var anInt6100: Int = 0
        @JvmField
        var anInt6101: Int = 0
        @JvmField
        var anInt6102: Int = 0
        @JvmField
        var aClass318_Sub9_Sub2_Sub1Array6103: Array<Class318_Sub9_Sub2_Sub1?>? = null
        @JvmField
        var anInt6104: Int = 0
        @JvmField
        var anInt6105: Int = 0
        @JvmField
        var anInt6106: Int = 0
        @JvmField
        var anInt6107: Int = 0
        @JvmField
        var anInt6108: Int = 0
        @JvmField
        var anInt6109: Int = 0
        @JvmField
        var anInt6111: Int = 0
        @JvmField
        var anInt6112: Int = 0
        @JvmStatic
        fun method1825(i: Int, i_3_: Int, i_4_: Int) {
            anInt6102++
            val class348_sub42_sub15 = Class318_Sub9_Sub1.method2516(0, 105.toByte(), 15)
            class348_sub42_sub15.method3246(-25490)
            class348_sub42_sub15.anInt9652 = i_4_
            class348_sub42_sub15.anInt9651 = i_3_
            if (i < 57) method1828(5)
        }

        @JvmStatic
        fun method1827(i: Int) {
            anInt6112++
            if (Class126.anIntArray4983 == null) Class126.anIntArray4983 = IntArray(65536)
            else return
            val d = 0.7 + (0.03 * Math.random() - 0.015)
            var i_5_ = 0
            if (i == 1415665776) {
                for (i_6_ in 0..511) {
                    val f = (((i_6_ shr 3).toFloat() / 64.0f + 0.0078125f) * 360.0f)
                    val f_7_ = (i_6_ and 0x7).toFloat() / 8.0f + 0.0625f
                    for (i_8_ in 0..127) {
                        val f_9_ = i_8_.toFloat() / 128.0f
                        var f_10_ = 0.0f
                        var f_11_ = 0.0f
                        var f_12_ = 0.0f
                        val f_13_ = f / 60.0f
                        val i_14_ = f_13_.toInt()
                        val i_15_ = i_14_ % 6
                        val f_16_ = -i_14_.toFloat() + f_13_
                        val f_17_ = f_9_ * (-f_7_ + 1.0f)
                        val f_18_ = f_9_ * (1.0f - f_16_ * f_7_)
                        val f_19_ = (1.0f - (1.0f - f_16_) * f_7_) * f_9_
                        if (i_15_ == 0) {
                            f_10_ = f_9_
                            f_11_ = f_19_
                            f_12_ = f_17_
                        } else if (i_15_ == 1) {
                            f_11_ = f_9_
                            f_10_ = f_18_
                            f_12_ = f_17_
                        } else if (i_15_ == 2) {
                            f_12_ = f_19_
                            f_10_ = f_17_
                            f_11_ = f_9_
                        } else if (i_15_ == 3) {
                            f_12_ = f_9_
                            f_11_ = f_18_
                            f_10_ = f_17_
                        } else if (i_15_ == 4) {
                            f_12_ = f_9_
                            f_11_ = f_17_
                            f_10_ = f_19_
                        } else if (i_15_ == 5) {
                            f_10_ = f_9_
                            f_11_ = f_17_
                            f_12_ = f_18_
                        }
                        f_10_ = f_10_.toDouble().pow(d).toFloat()
                        f_11_ = f_11_.toDouble().pow(d).toFloat()
                        f_12_ = f_12_.toDouble().pow(d).toFloat()
                        val i_20_ = (f_10_ * 256.0f).toInt()
                        val i_21_ = (256.0f * f_11_).toInt()
                        val i_22_ = (256.0f * f_12_).toInt()
                        val i_23_ = ((i_21_ shl 8) + ((i_20_ shl 16) + (-16777216 + i_22_)))
                        Class126.anIntArray4983!![i_5_++] = i_23_
                    }
                }
            }
        }

        @JvmStatic
        fun method1828(i: Int) {
            if (i < 20) method1832(47)
            anInt6104++
            synchronized(Class342.aClass60_4254!!) {
                Class342.aClass60_4254!!.method590(0)
            }
        }

        @JvmStatic
        fun method1832(i: Int) {
            if (i != 1) method1828(33)
            aClass318_Sub9_Sub2_Sub1Array6103 = null
        }
    }
}
