/* Class318_Sub1_Sub5 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
abstract class Class318_Sub1_Sub5 internal constructor(i: Int, i_11_: Int, i_12_: Int, i_13_: Int, i_14_: Int, i_15_: Int, i_16_: Int) : Class318_Sub1() {
    @JvmField
    var aShort8769: Short
    @JvmField
    var aShort8781: Short

    override fun method2378(i: Int): Boolean {
        if (i != 0) method2378(29)
        anInt8767++
        return (Class99.aBooleanArrayArray1572!![(-Class239_Sub25.anInt6111 + ((this.x shr Class362.anInt4459) - -Class318_Sub1_Sub4_Sub1.anInt10084))]!![(Class318_Sub1_Sub4_Sub1.anInt10084 + (-Class285_Sub2.anInt8502 + (this.y shr Class362.anInt4459)))])
    }

    override fun method2382(i: Byte): Boolean {
        anInt8774++
        if (i >= -51) method2486(-102, 81, -103, -31, -95, -90)
        return Class125.method1110((this.y shr Class362.anInt4459), this.method2394(true), this.aByte6376.toInt(), (-79).toByte(), (this.x shr Class362.anInt4459))
    }

    override fun method2380(var_ha: ha?, i: Int, bool: Boolean, class318_sub1: Class318_Sub1?, i_2_: Int, i_3_: Byte, i_4_: Int) {
        try {
            anInt8768++
            if (i_3_ >= -106) method2384(null, 52)
            throw IllegalStateException()
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("un.N(" + (if (var_ha != null) "{...}" else "null") + ',' + i + ',' + bool + ',' + (if (class318_sub1 != null) "{...}" else "null") + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ')'))
        }
    }

    override fun method2388(i: Int): Boolean {
        if (i >= -65) return false
        anInt8772++
        return false
    }

    override fun method2392(bool: Boolean) {
        if (bool == true) {
            anInt8779++
            throw IllegalStateException()
        }
    }

    override fun method2384(class348_sub1s: Array<Class348_Sub1?>?, i: Int): Int {
        anInt8771++
        val i_10_ = 122 % ((-14 - i) / 61)
        return this.method2390(class348_sub1s!!, (this.x shr Class362.anInt4459), -2, (this.y shr Class362.anInt4459))
    }

    init {
        this.aShort8769 = i_16_.toShort()
        this.aByte6376 = i_14_.toByte()
        this.anInt6382 = i_11_
        this.x = i
        this.aShort8781 = i_15_.toShort()
        this.y = i_12_
        this.plane = i_13_.toByte()
    }

    companion object {
        @JvmField
        var aClass144_8766: Class144? = null
        @JvmField
        var anInt8767: Int = 0
        @JvmField
        var anInt8768: Int = 0
        @JvmField
        var anInt8770: Int = 0
        @JvmField
        var anInt8771: Int = 0
        @JvmField
        var anInt8772: Int = 0
        @JvmField
        var aBoolean8773: Boolean = false
        @JvmField
        var anInt8774: Int = 0
        @JvmField
        var anInt8775: Int = 2
        @JvmField
        var anInt8776: Int = 0
        @JvmField
        var anInt8777: Int = 0
        @JvmField
        var anInt8778: Int = 0
        @JvmField
        var anInt8779: Int = 0
        @JvmField
        var anInt8780: Int = 0
        @JvmStatic
        fun method2483(i: Int, i_0_: Int): Int {
            if (Class239_Sub1.aShortArrayArray5847 != null) return Class239_Sub1.aShortArrayArray5847!![i]!![i_0_].toInt() and 0xffff
            return 0
        }

        @JvmStatic
        fun method2484(i: Int) {
            if (i != 0) method2487(-24)
            aClass144_8766 = null
        }

        @JvmStatic
        fun method2485(i: Int): Boolean {
            anInt8776++
            if (Class135_Sub2.aClass348_Sub42_Sub12_4846 == null) return false
            if ((Class135_Sub2.aClass348_Sub42_Sub12_4846!!.anInt9608) >= 2000) Class135_Sub2.aClass348_Sub42_Sub12_4846!!.anInt9608 -= 2000
            val i_1_ = -53 % ((-41 - i) / 54)
            return (Class135_Sub2.aClass348_Sub42_Sub12_4846!!.anInt9608) == 1011
        }

        @JvmStatic
        fun method2486(i: Int, i_5_: Int, i_6_: Int, i_7_: Int, i_8_: Int, i_9_: Int) {
            if (i_8_ >= Class369.anInt4960 && i_5_ <= Class113.anInt1745 && Class132.anInt1910 <= i_9_ && Class38.anInt513 >= i_7_) Class125.method1111(i_7_, i, i_5_, i_8_, i_9_, i_6_)
            else Class239_Sub16.method1792(i_9_, i_8_, i_7_, i_5_, (-114).toByte(), i_6_)
            if (i != 0) anInt8780 = 42
            anInt8777++
        }

        @JvmStatic
        fun method2487(i: Int): Class110_Sub1? {
            anInt8778++
            Class348_Sub36.anInt6985 = 0
            if (i >= -91) anInt8775 = -63
            return Class2.method170(true)
        }
    }
}
