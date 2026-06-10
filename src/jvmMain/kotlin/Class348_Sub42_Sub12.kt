import Class275.method2064
import Class348_Sub17.Companion.method2929
import kotlin.math.atan2
import kotlin.math.sqrt

/* Class348_Sub42_Sub12 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class348_Sub42_Sub12 internal constructor(string: String?, string_15_: String?, i: Int, i_16_: Int, i_17_: Int, l: Long, i_18_: Int, i_19_: Int, bool: Boolean, bool_20_: Boolean, l_21_: Long, bool_22_: Boolean) : Class348_Sub42() {
    var aString9593: String? = null
    @JvmField
    var aString9595: String? = null
    var aBoolean9597: Boolean = false
    var anInt9599: Int = 0
    var aLong9600: Long = 0
    var aString9601: String? = null
    var anInt9602: Int = 0
    var aLong9605: Long = 0
    var anInt9607: Int = 0
    @JvmField
    var anInt9608: Int = 0
    var anInt9609: Int = 0
    var aBoolean9610: Boolean = false
    var aBoolean9611: Boolean = false

    init {
        try {
            this.anInt9607 = i_19_
            this.anInt9608 = i_16_
            this.anInt9599 = i_17_
            this.aLong9605 = l
            this.aBoolean9610 = bool
            this.aBoolean9597 = bool_20_
            this.aString9601 = string_15_
            this.aBoolean9611 = bool_22_
            this.aString9593 = string
            this.anInt9609 = i
            this.aLong9600 = l_21_
            this.anInt9602 = i_18_
        } catch (runtimeexception: RuntimeException) {
            throw method2929(runtimeexception, ("db.<init>(" + (if (string != null) "{...}" else "null") + ',' + (if (string_15_ != null) "{...}" else "null") + ',' + i + ',' + i_16_ + ',' + i_17_ + ',' + l + ',' + i_18_ + ',' + i_19_ + ',' + bool + ',' + bool_20_ + ',' + l_21_ + ',' + bool_22_ + ')'))
        }
    }

    companion object {
        var anInt9594: Int = 0
        var anInt9596: Int = 0
        var anInt9598: Int = 0
        var aClass356_9603: Class356?
        @JvmField
        var anInt9604: Int = 0
        var anInt9606: Int = 0
        var anIntArray9612: IntArray?

        @JvmStatic
        fun method3228(i: Int) {
            anIntArray9612 = null
            val i_0_ = 29 / ((31 - i) / 43)
            aClass356_9603 = null
        }

        @JvmStatic
        fun method3229(i: Int): Int {
            anInt9596++
            if (Class34.aFrame476 != null) return 3
            if (i >= -59) anInt9604 = 79
            if (!Class50_Sub1.aBoolean5219) return 1
            return 2
        }

        @JvmStatic
        fun method3230(`is`: IntArray?, is_1_: IntArray?, i: Int) {
            try {
                anInt9606++
                if (`is` == null || is_1_ == null) {
                    Class348_Sub40_Sub6.aByteArrayArrayArray9134 = null
                    Class190.anIntArray2552 = null
                    Class59_Sub2_Sub2.anIntArray8684 = null
                } else {
                    Class59_Sub2_Sub2.anIntArray8684 = `is`
                    Class190.anIntArray2552 = IntArray(`is`.size)
                    Class348_Sub40_Sub6.aByteArrayArrayArray9134 = arrayOfNulls<Array<ByteArray?>>(`is`.size)
                    for (i_2_ in i..<Class59_Sub2_Sub2.anIntArray8684!!.size) Class348_Sub40_Sub6.aByteArrayArrayArray9134!![i_2_] = arrayOfNulls<ByteArray>(is_1_[i_2_])
                }
            } catch (runtimeexception: RuntimeException) {
                throw method2929(runtimeexception, ("db.D(" + (if (`is` != null) "{...}" else "null") + ',' + (if (is_1_ != null) "{...}" else "null") + ',' + i + ')'))
            }
        }

        fun method3231(i: Int, i_3_: Int, i_4_: Int, i_5_: Int, i_6_: Int, i_7_: Int) {
            if (i_7_ > -123) method3229(14)
            Class239_Sub12.anInt5973 = i_5_
            Class121.anInt1797 = i_4_
            Class352.anInt4336 = i_3_
            Class367_Sub11.anInt7403 = i_6_
            anInt9598++
            Class281.anInt3647 = i
            if (Class239_Sub12.anInt5973 >= 100) {
                val i_8_ = Class352.anInt4336 * 512 - -256
                val i_9_ = Class281.anInt3647 * 512 - -256
                val i_10_ = (method2064(i_8_, Class355.anInt4372, 11219, i_9_) + -Class121.anInt1797)
                val i_11_ = i_8_ - Class286_Sub4.anInt6246
                val i_12_ = -Class305.anInt3855 + i_10_
                val i_13_ = i_9_ - Class59_Sub2_Sub2.anInt8685
                val i_14_ = sqrt((i_11_ * i_11_ + i_13_ * i_13_).toDouble()).toInt()
                Class348_Sub42_Sub19.Companion.anInt9701 = (atan2(i_12_.toDouble(), i_14_.toDouble()) * 2607.5945876176133).toInt() and 0x3fff
                Class5.anInt4638 = (-2607.5945876176133 * atan2(i_11_.toDouble(), i_13_.toDouble())).toInt() and 0x3fff
                if (Class348_Sub42_Sub19.Companion.anInt9701 < 1024) Class348_Sub42_Sub19.Companion.anInt9701 = 1024
                Class338.anInt4186 = 0
                if (Class348_Sub42_Sub19.Companion.anInt9701 > 3072) Class348_Sub42_Sub19.Companion.anInt9701 = 3072
            }
            Class348_Sub40_Sub21.anInt9282 = 2
            Class318_Sub1_Sub5_Sub2.anInt10163 = -1
            Class9.anInt167 = Class318_Sub1_Sub5_Sub2.anInt10163
        }

        init {
            aClass356_9603 = Class356(16)
            anIntArray9612 = IntArray(8)
        }
    }
}
