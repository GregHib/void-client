/* Class318_Sub1_Sub2 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
abstract class Class318_Sub1_Sub2 internal constructor(i: Int, i_6_: Int, i_7_: Int, i_8_: Int, i_9_: Int) : Class318_Sub1() {
    override fun method2382(i: Byte): Boolean {
        if (i > -51) return false
        anInt8733++
        val class148 = Class195.method1449(this.plane.toInt(), (this.x shr Class362.anInt4459), (this.y shr Class362.anInt4459))
        if (class148 == null || !class148.aClass318_Sub1_Sub3_2040!!.aBoolean8741) return aa_Sub2.method164(this.plane.toInt(), (this.x shr Class362.anInt4459), (-97).toByte(), (this.y shr Class362.anInt4459))
        return (Class125.method1110(this.y shr Class362.anInt4459, class148.aClass318_Sub1_Sub3_2040!!.method2394(true) + this.method2394(true), this.plane.toInt(), (-79).toByte(), this.x shr Class362.anInt4459))
    }

    override fun method2378(i: Int): Boolean {
        if (i != 0) method2406(79)
        anInt8734++
        return (Class99.aBooleanArrayArray1572!![(Class318_Sub1_Sub4_Sub1.anInt10084 + -Class239_Sub25.anInt6111 + (this.x shr Class362.anInt4459))]!![(Class318_Sub1_Sub4_Sub1.anInt10084 + (-Class285_Sub2.anInt8502 + (this.y shr Class362.anInt4459)))])
    }

    override fun method2392(bool: Boolean) {
        if (bool != true) anInt8731 = 119
        anInt8730++
        throw IllegalStateException()
    }

    override fun method2384(class348_sub1s: Array<Class348_Sub1?>?, i: Int): Int {
        anInt8735++
        val i_2_ = -79 % ((-14 - i) / 61)
        return this.method2390(class348_sub1s!!, (this.x shr Class362.anInt4459), -2, (this.y shr Class362.anInt4459))
    }

    override fun method2388(i: Int): Boolean {
        if (i > -65) anInt8731 = -84
        anInt8738++
        return false
    }

    override fun method2380(var_ha: ha?, i: Int, bool: Boolean, class318_sub1: Class318_Sub1?, i_3_: Int, i_4_: Byte, i_5_: Int) {
        try {
            if (i_4_ > -106) method2405(-8)
            anInt8736++
            throw IllegalStateException()
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("fha.N(" + (if (var_ha != null) "{...}" else "null") + ',' + i + ',' + bool + ',' + (if (class318_sub1 != null) "{...}" else "null") + ',' + i_3_ + ',' + i_4_ + ',' + i_5_ + ')'))
        }
    }

    init {
        this.x = i
        this.plane = i_8_.toByte()
        this.anInt6382 = i_6_
        this.aByte6376 = i_9_.toByte()
        this.y = i_7_
    }

    companion object {
        @JvmField
        var anInt8729: Int = 0
        @JvmField
        var anInt8730: Int = 0
        @JvmField
        var anInt8731: Int = 0
        @JvmField
        var aClass60_8732: Class60? = Class60(64)
        @JvmField
        var anInt8733: Int = 0
        @JvmField
        var anInt8734: Int = 0
        @JvmField
        var anInt8735: Int = 0
        @JvmField
        var anInt8736: Int = 0
        @JvmField
        var aClass70_8737: Class70? = Class70()
        @JvmField
        var anInt8738: Int = 0

        @JvmStatic
        fun method2405(i: Int) {
            anInt8729++
            var class234: Class234? = null
            try {
                class234 = Class297.method2231("2", -1141472112)!!
                val class348_sub49 = Class348_Sub49(3 + 6 * Class335.anInt4168)
                class348_sub49.writeByte(false, 1)
                class348_sub49.writeShort(107.toByte(), Class335.anInt4168)
                val i_0_ = -4 % ((-12 - i) / 38)
                var i_1_ = 0
                while ((i_1_ < Class77.anIntArray1303!!.size)) {
                    if (Class286_Sub6.aBooleanArray6270!![i_1_]) {
                        class348_sub49.writeShort(107.toByte(), i_1_)
                        class348_sub49.writeInt(124.toByte(), Class77.anIntArray1303!![i_1_])
                    }
                    i_1_++
                }
                class234.method1658(117.toByte(), 0, class348_sub49.anInt7197, (class348_sub49.aByteArray7154))
            } catch (exception: Exception) {
                /* empty */
            }
            try {
                if (class234 != null) class234.method1657(false)
            } catch (exception: Exception) {
                /* empty */
            }
            Class34.aLong482 = Class62.method599(-117)
            Class184.aBoolean2469 = false
        }

        @JvmStatic
        fun method2406(i: Int) {
            if (i > -126) anInt8731 = 118
            aClass60_8732 = null
            aClass70_8737 = null
        }
    }
}
