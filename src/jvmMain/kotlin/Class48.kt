import Class239_Sub26.Companion.method1836
import Class286_Sub8.Companion.method2172
import s_Sub2.Companion.method4002

/* Class48 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class48 {
    @JvmField
    var anInt847: Int = 0
    @JvmField
    var anInt853: Int = 0
    @JvmField
    var anInt854: Int = 0
    @JvmField
    var anInt856: Int
    @JvmField
    var anInt857: Int = 128
    @JvmField
    var anInt858: Int
    fun method451(class48_7_: Class48, i: Byte) {
        this.anInt857 = class48_7_.anInt857
        this.anInt858 = class48_7_.anInt858
        this.anInt856 = class48_7_.anInt856
        this.anInt854 = class48_7_.anInt854
        anInt855++
        this.anInt847 = class48_7_.anInt847
        this.anInt853 = class48_7_.anInt853
        if (i.toInt() != -110) Companion.method448((-93).toByte())
    }

    fun method452(bool: Boolean): Class48 {
        anInt848++
        if (bool != true) Companion.method448((-81).toByte())
        return Class48(this.anInt858, this.anInt856, this.anInt857, this.anInt854, this.anInt847, this.anInt853)
    }

    internal constructor(i: Int) {
        this.anInt856 = 128
        this.anInt858 = i
    }

    private constructor(i: Int, i_8_: Int, i_9_: Int, i_10_: Int, i_11_: Int, i_12_: Int) {
        this.anInt856 = 128
        this.anInt847 = i_11_
        this.anInt854 = i_10_
        this.anInt853 = i_12_
        this.anInt858 = i
        this.anInt856 = i_8_
        this.anInt857 = i_9_
    }

    companion object {
        @JvmField
        var anInt848: Int = 0
        @JvmField
        var anInt849: Int = 0
        @JvmField
        var anInt850: Int = 0
        @JvmField
        var aShort851: Short
        var aCharArray852: CharArray? = charArrayOf('_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9')
        @JvmField
        var anInt855: Int = 0
        @JvmField
        var anInt859: Int
        @JvmField
        var anIntArray860: IntArray?

        @JvmStatic
        fun method448(i: Byte) {
            aCharArray852 = null
            anIntArray860 = null
            val i_0_ = -50 % ((37 - i) / 40)
        }

        @JvmStatic
        fun method449(string: String?, string_1_: String?, bool: Boolean, i: Int, bool_2_: Boolean) {
            do {
                try {
                    anInt849++
                    val class348_sub47 = Class203.method1478(true)
                    class348_sub47!!.aClass348_Sub49_Sub2_7116!!.writeByte(bool, Class178.aClass29_2348!!.anInt400)
                    class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShort(107.toByte(), 0)
                    val i_3_ = (class348_sub47.aClass348_Sub49_Sub2_7116!!.anInt7197)
                    class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShort(107.toByte(), 634)
                    val `is`: IntArray = Class50_Sub1.Companion.method463(class348_sub47, false)
                    val i_4_ = (class348_sub47.aClass348_Sub49_Sub2_7116!!.anInt7197)
                    class348_sub47.aClass348_Sub49_Sub2_7116!!.writeString((-5).toByte(), string_1_!!)
                    class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShort(107.toByte(), Class202.anInt2670)
                    class348_sub47.aClass348_Sub49_Sub2_7116!!.writeString((-5).toByte(), string!!)
                    class348_sub47.aClass348_Sub49_Sub2_7116!!.writeLong(Class244.aLong4615, 104.toByte())
                    class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByte(bool, Class348_Sub33.anInt6967)
                    class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByte(bool, (Class348_Sub42_Sub8_Sub2.aClass230_10434!!.anInt2987))
                    method4002((class348_sub47.aClass348_Sub49_Sub2_7116!!), 55.toByte())
                    val string_5_ = Class14_Sub1.aString8605
                    class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByte(false, if (string_5_ == null) 0 else 1)
                    if (string_5_ != null) class348_sub47.aClass348_Sub49_Sub2_7116!!.writeString((-5).toByte(), string_5_)
                    class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByte(false, i)
                    class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByte(false, if (!bool_2_) 0 else 1)
                    class348_sub47.aClass348_Sub49_Sub2_7116!!.anInt7197 += 7
                    class348_sub47.aClass348_Sub49_Sub2_7116!!.method3350(i_4_, true, `is`, (class348_sub47.aClass348_Sub49_Sub2_7116!!.anInt7197))
                    class348_sub47.aClass348_Sub49_Sub2_7116!!.method3383(1809639944, (class348_sub47.aClass348_Sub49_Sub2_7116!!.anInt7197 + -i_3_))
                    Class348_Sub42_Sub14.method3243(2, class348_sub47)
                    Class352.anInt4337 = -3
                    Class367_Sub2.anInt7297 = 1
                    Class169.anInt2264 = 0
                    Class105_Sub1.anInt8398 = 0
                    if (i >= 13) break
                    Class330.aBoolean4127 = true
                    method2172(60)
                } catch (runtimeexception: RuntimeException) {
                    throw Class348_Sub17.method2929(runtimeexception, ("iq.D(" + (if (string != null) "{...}" else "null") + ',' + (if (string_1_ != null) "{...}" else "null") + ',' + bool + ',' + i + ',' + bool_2_ + ')'))
                }
                break
            } while (false)
        }

        fun method450(i: Int, string: String, i_6_: Int): Int {
            if (i != -20188) return 88
            anInt850++
            return method1836(-123, i_6_, true, string)
        }

        init {
            aShort851 = 32767.toShort()
            anInt859 = -1
            anIntArray860 = intArrayOf(4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0)
        }
    }
}
