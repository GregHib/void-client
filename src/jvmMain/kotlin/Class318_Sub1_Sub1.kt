import Class239_Sub2.Companion.method1725

/* Class318_Sub1_Sub1 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
abstract class Class318_Sub1_Sub1 internal constructor(i: Int, i_4_: Int, i_5_: Int, i_6_: Int, i_7_: Int, i_8_: Int) : Class318_Sub1() {
    @JvmField
    var aShort8727: Short
    override fun method2382(i: Byte): Boolean {
        if (i > -51) aClass351_8724 = null
        anInt8723++
        return aa_Sub2.method164(this.aByte6376.toInt(), (this.x shr Class362.anInt4459), (-97).toByte(), (this.y shr Class362.anInt4459))
    }

    override fun method2384(class348_sub1s: Array<Class348_Sub1?>?, i: Int): Int {
        anInt8722++
        val i_0_ = 88 % ((i - -14) / 61)
        return this.method2390(class348_sub1s!!, (this.x shr Class362.anInt4459), -2, (this.y shr Class362.anInt4459))
    }

    init {
        this.aByte6376 = i_7_.toByte()
        this.x = i
        this.y = i_5_
        this.aShort8727 = i_8_.toShort()
        this.anInt6382 = i_4_
        this.plane = i_6_.toByte()
    }

    override fun method2378(i: Int): Boolean {
        if (i != 0) aClass351_8724 = null
        anInt8721++
        return (Class99.aBooleanArrayArray1572!![(Class318_Sub1_Sub4_Sub1.anInt10084 + -Class239_Sub25.anInt6111 + (this.x shr Class362.anInt4459))]!![((this.y shr Class362.anInt4459) + -Class285_Sub2.anInt8502 + Class318_Sub1_Sub4_Sub1.anInt10084)])
    }

    companion object {
        @JvmField
        var anInt8721: Int = 0
        @JvmField
        var anInt8722: Int = 0
        @JvmField
        var anInt8723: Int = 0
        @JvmField
        var aClass351_8724: Class351? = Class351(50, -1)
        @JvmField
        var aFloat8725: Float = 0f
        @JvmField
        var anInt8726: Int = 0
        @JvmField
        var aLong8728: Long = 0

        @JvmStatic
        fun method2395(i: Byte) {
            aClass351_8724 = null
            if (i.toInt() != 50) method2395(65.toByte())
        }

        @JvmStatic
        fun method2396(i: Int, i_1_: Int, i_2_: Int, i_3_: Int) {
            var i = i
            var i_1_ = i_1_
            var i_2_ = i_2_
            i = i shl i_3_
            anInt8726++
            i_1_ = i_1_ shl 3
            i_2_ = i_2_ shl 3
            if (Class348_Sub40_Sub21.anInt9282 == 2) {
                Class5.anInt4638 = i_1_
                Class338.anInt4186 = i_2_
                Class348_Sub42_Sub19.anInt9701 = i
            }
            Class314.aFloat3938 = i_1_.toFloat()
            Class76.aFloat1287 = i.toFloat()
            method1725(262144)
            Class369_Sub3_Sub1.aBoolean10174 = true
        }
    }
}
