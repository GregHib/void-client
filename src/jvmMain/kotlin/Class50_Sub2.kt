import Class318_Sub1_Sub5.Companion.method2486

/* Class50_Sub2 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class50_Sub2 internal constructor(private var anInt5231: Int, private val anInt5227: Int, private val anInt5232: Int, private val anInt5230: Int, i_9_: Int, i_10_: Int, i_11_: Int) : Class50(i_9_, i_10_, i_11_) {
    public override fun method455(i: Int, i_0_: Int, i_1_: Int) {
        anInt5228++
        val i_2_ = i * anInt5231 shr 12
        val i_3_ = anInt5232 * i shr 12
        val i_4_ = i_0_ * anInt5227 shr 12
        if (i_1_ > -98) aBoolean5233 = false
        val i_5_ = i_0_ * anInt5230 shr 12
        Class170.method1308(this.anInt864, i_4_, i_2_, this.anInt865, (-123).toByte(), this.anInt862, i_3_, i_5_)
    }

    public override fun method457(i: Int, i_12_: Int, i_13_: Int) {
        anInt5235++
        val i_14_ = i_12_ * anInt5231 shr 12
        if (i_13_ <= -29) {
            val i_15_ = i_12_ * anInt5232 shr 12
            val i_16_ = i * anInt5227 shr 12
            val i_17_ = i * anInt5230 shr 12
            Class97.method872(this.anInt865, 1, this.anInt862, i_16_, i_17_, i_15_, i_14_)
        }
    }

    public override fun method456(i: Int, i_18_: Int, i_19_: Int) {
        anInt5234++
        val i_20_ = i_18_ * anInt5231 shr 12
        val i_21_ = anInt5232 * i_18_ shr 12
        if (i <= 87) anInt5231 = 56
        val i_22_ = i_19_ * anInt5227 shr 12
        val i_23_ = i_19_ * anInt5230 shr 12
        method2486(0, i_21_, this.anInt864, i_23_, i_20_, i_22_)
    }

    companion object {
        @JvmField
        var anInt5228: Int = 0
        @JvmField
        var anInt5229: Int = 0
        @JvmField
        var aBoolean5233: Boolean = false
        @JvmField
        var anInt5234: Int = 0
        @JvmField
        var anInt5235: Int = 0

        @JvmStatic
        fun method464(i: Int) {
            anInt5229++
            Class334.anInt4155 = i
            Class108.aClass105_1664 = null
        }
    }
}
