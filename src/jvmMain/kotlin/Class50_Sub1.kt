import Class299_Sub2.Companion.method2267
import ha_Sub3.Companion.method3873

/* Class50_Sub1 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class50_Sub1 internal constructor(private var anInt5214: Int, private val anInt5212: Int, private val anInt5213: Int, private val anInt5222: Int, i_9_: Int, i_10_: Int, i_11_: Int) : Class50(i_9_, i_10_, i_11_) {
    public override fun method455(i: Int, i_0_: Int, i_1_: Int) {
        anInt5220++
        if (i_1_ >= -98) aBoolean5221 = false
        val i_2_ = anInt5214 * i shr 12
        val i_3_ = i * anInt5213 shr 12
        val i_4_ = anInt5212 * i_0_ shr 12
        val i_5_ = i_0_ * anInt5222 shr 12
        method2267(10499, i_5_, i_2_, this.anInt865, this.anInt864, this.anInt862, i_4_, i_3_)
    }

    public override fun method457(i: Int, i_12_: Int, i_13_: Int) {
        anInt5211++
        if (i_13_ >= -29) method460(-42)
    }

    public override fun method456(i: Int, i_14_: Int, i_15_: Int) {
        if (i <= 87) anInt5214 = -17
        anInt5218++
        val i_16_ = i_14_ * anInt5214 shr 12
        val i_17_ = anInt5213 * i_14_ shr 12
        val i_18_ = anInt5212 * i_15_ shr 12
        val i_19_ = i_15_ * anInt5222 shr 12
        ha.method3641(i_18_, i_19_, (-75).toByte(), this.anInt864, i_17_, i_16_)
    }

    companion object {
        @JvmField
        var aClass101_5209: Class101? = null
        @JvmField
        var anInt5210: Int = 0
        @JvmField
        var anInt5211: Int = 0
        @JvmField
        var anInt5215: Int = 0
        @JvmField
        var anInt5216: Int = 0
        var aClass351_5217: Class351?
        @JvmField
        var anInt5218: Int = 0
        @JvmField
        var aBoolean5219: Boolean = true
        @JvmField
        var anInt5220: Int = 0
        @JvmField
        var aBoolean5221: Boolean = false
        @JvmField
        var aStringArray5223: Array<String?>? = null
        @JvmField
        var aBoolean5224: Boolean
        @JvmField
        var aBooleanArrayArray5225: Array<BooleanArray?>?
        var aBoolean5226: Boolean

        @JvmStatic
        fun method460(i: Int) {
            if (i != 2) method460(-52)
            aClass101_5209 = null
            aBooleanArrayArray5225 = null
            aStringArray5223 = null
            aClass351_5217 = null
        }

        @JvmStatic
        fun method461(bool: Boolean, `object`: Any?, i: Int): ByteArray? {
            anInt5215++
            if (`object` == null) return null
            if (`object` is ByteArray) {
                val `is` = `object`
                if (bool) return method3873(`is`, 0)
                return `is`
            }
            if (i != 53146732) return null
            if (`object` is Class344) {
                val class344 = `object`
                return class344.method2692(-3672)
            }
            throw IllegalArgumentException()
        }

        @JvmStatic
        fun method462(i: Byte, i_20_: Int): Char {
            anInt5216++
            var i_21_ = 0xff and i.toInt()
            require(i_21_ != 0) { "Non cp1252 character 0x" + i_21_.toString(16) + " provided" }
            if (i_21_ >= 128 && i_21_ < 160) {
                var i_22_ = Class44.aCharArray625!![i_21_ + -128].code
                if (i_22_ == 0) i_22_ = 63
                i_21_ = i_22_
            }
            return i_21_.toChar()
        }

        @JvmStatic
        fun method463(class348_sub47: Class348_Sub47, bool: Boolean): IntArray {
            anInt5210++
            val class348_sub49 = Class348_Sub49(518)
            val `is` = IntArray(4)
            for (i in 0..3) `is`[i] = (Math.random() * 9.9999999E7).toInt()
            class348_sub49.writeByte(bool, 10)
            class348_sub49.writeInt(114.toByte(), `is`[0])
            class348_sub49.writeInt(97.toByte(), `is`[1])
            class348_sub49.writeInt(109.toByte(), `is`[2])
            class348_sub49.writeInt(105.toByte(), `is`[3])
            for (i in 0..9) class348_sub49.writeInt(120.toByte(), (9.9999999E7 * Math.random()).toInt())
            class348_sub49.writeShort(107.toByte(), (9.9999999E7 * Math.random()).toInt())
            class348_sub49.method3390(Class348_Sub31.aBigInteger6921, (-98).toByte(), Class318_Sub1_Sub4.aBigInteger8762)
            class348_sub47.aClass348_Sub49_Sub2_7116!!.writeBytes(class348_sub49.anInt7197, 0, class348_sub49.aByteArray7154!!, 80)
            return `is`
        }

        init {
            aClass351_5217 = Class351(17, 8)
            aBooleanArrayArray5225 = (arrayOf<BooleanArray?>(
                BooleanArray(4),
                booleanArrayOf(false, true, true, false),
                booleanArrayOf(true, false, true, false),
                booleanArrayOf(true, false, true, false),
                booleanArrayOf(false, false, true, false),
                booleanArrayOf(false, false, true, false),
                booleanArrayOf(true, false, true, false),
                booleanArrayOf(true, false, false, true),
                booleanArrayOf(true, false, false, true),
                booleanArrayOf(true, true, false, false),
                BooleanArray(4),
                booleanArrayOf(false, true, false, true),
                BooleanArray(4)
            ))
            aBoolean5226 = false
            aBoolean5224 = false
        }
    }
}
