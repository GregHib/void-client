import kotlin.math.atan2

/* Class348_Sub40_Sub33 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class348_Sub40_Sub33 : Class348_Sub40(1, false) {
    override fun method3047(i: Int, i_2_: Int): Array<IntArray?>? {
        anInt9429++
        val `is` = this.aClass322_7033!!.method2557(-97, i)!!
        if (i_2_ != -1564599039) aClass46ArrayArray9427 = null
        if (this.aClass322_7033!!.aBoolean4035) {
            val is_3_ = `is`[0]!!
            val is_4_ = `is`[1]!!
            val is_5_ = `is`[2]!!
            var i_6_ = 0
            while ((Class348_Sub40_Sub6.Companion.anInt9139 > i_6_)) {
                method3139(i_6_, i, (-31).toByte())
                val is_7_ = this.method3039(43.toByte(), Class344.anInt4265, 0)!!
                is_3_[i_6_] = is_7_[0]!![Class121.anInt1796]
                is_4_[i_6_] = is_7_[1]!![Class121.anInt1796]
                is_5_[i_6_] = is_7_[2]!![Class121.anInt1796]
                i_6_++
            }
        }
        return `is`
    }

    override fun method3042(i: Int, i_8_: Int): IntArray {
        anInt9428++
        if (i_8_ != 255) aClass46ArrayArray9427 = null
        val `is` = this.aClass191_7032!!.method1433(0, i)!!
        if (this.aClass191_7032!!.aBoolean2570) {
            var i_9_ = 0
            while ((i_9_ < Class348_Sub40_Sub6.Companion.anInt9139)) {
                method3139(i_9_, i, (-31).toByte())
                val is_10_ = this.method3048(Class344.anInt4265, i_8_ xor 0x25c5979e, 0)!!
                `is`[i_9_] = is_10_[Class121.anInt1796]
                i_9_++
            }
        }
        return `is`
    }

    override fun method3049(class348_sub49: Class348_Sub49, i: Int, i_11_: Int) {
        if (i_11_ != 31015) aClass46ArrayArray9427 = null
        anInt9430++
        if (i == 0) this.aBoolean7045 = class348_sub49.readUnsignedByte(255) == 1
    }

    private fun method3139(i: Int, i_12_: Int, i_13_: Byte) {
        anInt9425++
        val i_14_ = Class318_Sub6.anIntArray6432!![i]
        val i_15_ = Class239_Sub18.anIntArray6035!![i_12_]
        if (i_13_.toInt() != -31) method3139(-44, -111, 48.toByte())
        val f = atan2((i_14_ + -2048).toDouble(), (i_15_ + -2048).toDouble()).toFloat()
        if (f.toDouble() >= -3.141592653589793 && f.toDouble() <= -2.356194490192345) {
            Class344.anInt4265 = i_12_
            Class121.anInt1796 = i
        } else if (!(f.toDouble() <= -1.5707963267948966) || !(f.toDouble() >= -2.356194490192345)) {
            if (!(f.toDouble() <= -0.7853981633974483) || !(f.toDouble() >= -1.5707963267948966)) {
                if (!(f <= 0.0f) || !(f.toDouble() >= -0.7853981633974483)) {
                    if (!(f >= 0.0f) || !(f.toDouble() <= 0.7853981633974483)) {
                        if (!(f.toDouble() >= 0.7853981633974483) || !(f.toDouble() <= 1.5707963267948966)) {
                            if (f.toDouble() >= 1.5707963267948966 && f.toDouble() <= 2.356194490192345) {
                                Class344.anInt4265 = Class286_Sub2.anInt6212 + -i
                                Class121.anInt1796 = i_12_
                            } else if (f.toDouble() >= 2.356194490192345 && f.toDouble() <= 3.141592653589793) {
                                Class344.anInt4265 = i_12_
                                Class121.anInt1796 = -i + Class348_Sub40_Sub6.Companion.anInt9139
                            }
                        } else {
                            Class121.anInt1796 = -i_12_ + Class348_Sub40_Sub6.Companion.anInt9139
                            Class344.anInt4265 = -i + Class286_Sub2.anInt6212
                        }
                    } else {
                        Class121.anInt1796 = -i + Class348_Sub40_Sub6.Companion.anInt9139
                        Class344.anInt4265 = -i_12_ + Class286_Sub2.anInt6212
                    }
                } else {
                    Class121.anInt1796 = i
                    Class344.anInt4265 = Class286_Sub2.anInt6212 - i_12_
                }
            } else {
                Class121.anInt1796 = Class348_Sub40_Sub6.Companion.anInt9139 - i_12_
                Class344.anInt4265 = i
            }
        } else {
            Class344.anInt4265 = i
            Class121.anInt1796 = i_12_
        }
        Class344.anInt4265 = Class344.anInt4265 and Class299_Sub2.anInt6325
        Class121.anInt1796 = Class121.anInt1796 and Class239_Sub22.anInt6076
    }

    companion object {
        @JvmField
        var anInt9425: Int = 0
        @JvmField
        var anInt9426: Int = 0
        @JvmField
        var aClass46ArrayArray9427: Array<Array<Class46?>?>? = null
        @JvmField
        var anInt9428: Int = 0
        @JvmField
        var anInt9429: Int = 0
        @JvmField
        var anInt9430: Int = 0

        @JvmStatic
        fun method3137(bool: Boolean, i: Byte): Boolean {
            var bool = bool
            anInt9426++
            val bool_0_ = Class348_Sub8.aHa6654!!.method3666()
            if (i.toInt() != -24) return true
            if (!bool_0_ == !bool) return true
            if (!bool) Class348_Sub8.aHa6654!!.method3710()
            else if (!Class348_Sub8.aHa6654!!.method3671()) bool = false
            if (bool_0_ == bool) return false
            Class316.aClass348_Sub51_3959!!.method3429(74.toByte(), (Class316.aClass348_Sub51_3959!!.aClass239_Sub12_7243), if (bool) 1 else 0)
            Class14_Sub2.method243(37)
            return true
        }

        @JvmStatic
        fun method3138(i: Byte) {
            aClass46ArrayArray9427 = null
            val i_1_ = 93 % ((-58 - i) / 55)
        }
    }
}
