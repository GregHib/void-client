import java.lang.Byte
import java.lang.Double
import java.lang.Float
import java.lang.Long
import java.lang.Short
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.IntArray
import kotlin.String
import kotlin.Throws

/* Class348_Sub40_Sub1 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class348_Sub40_Sub1 : Class348_Sub40(1, false) {
    private var anInt9084 = 4096
    private val anIntArray9086 = IntArray(3)
    private var anInt9091 = 4096
    private var anInt9092 = 4096
    private var anInt9094 = 409

    override fun method3049(class348_sub49: Class348_Sub49, i: Int, i_0_: Int) {
        anInt9087++
        if (i_0_ != 31015) anInt9094 = 115
        val i_1_ = i
        while_131_@ do {
            while_130_@ do {
                while_129_@ do {
                    do {
                        if (i_1_ == 0) {
                            anInt9094 = class348_sub49.readUnsignedShort(i_0_ + 842366929)
                            return
                        } else if (i_1_ != 1) {
                            if (i_1_ != 2) {
                                if (i_1_ != 3) {
                                    if (i_1_ == 4) break@while_130_
                                    break@while_131_
                                }
                            } else break
                            break@while_129_
                        }
                        anInt9084 = class348_sub49.readUnsignedShort(842397944)
                        return
                    } while (false)
                    anInt9091 = class348_sub49.readUnsignedShort(842397944)
                    return
                } while (false)
                anInt9092 = class348_sub49.readUnsignedShort(i_0_ + 842366929)
                return
            } while (false)
            val i_2_ = class348_sub49.readMedium(-1)
            anIntArray9086[2] = Class139.method1166(0, i_2_ shr 12)
            anIntArray9086[1] = Class139.method1166(i_2_, 65280) shr 4
            anIntArray9086[0] = Class139.method1166(i_2_ shl 4, 267386880)
        } while (false)
    }

    override fun method3047(i: Int, i_5_: Int): Array<IntArray?>? {
        if (i_5_ != -1564599039) anInt9091 = 64
        anInt9093++
        val `is` = this.aClass322_7033!!.method2557(-127, i)!!
        if (this.aClass322_7033!!.aBoolean4035) {
            val is_6_ = this.method3039(62.toByte(), i, 0)!!
            val is_7_ = is_6_[0]!!
            val is_8_ = is_6_[1]!!
            val is_9_ = is_6_[2]!!
            val is_10_ = `is`[0]!!
            val is_11_ = `is`[1]!!
            val is_12_ = `is`[2]!!
            var i_13_ = 0
            while (Class348_Sub40_Sub6.Companion.anInt9139 > i_13_) {
                val i_14_ = is_7_[i_13_]
                var i_15_ = i_14_ - anIntArray9086[0]
                if (i_15_ < 0) i_15_ = -i_15_
                if (anInt9094 < i_15_) {
                    is_10_[i_13_] = i_14_
                    is_11_[i_13_] = is_8_[i_13_]
                    is_12_[i_13_] = is_9_[i_13_]
                } else {
                    val i_16_ = is_8_[i_13_]
                    i_15_ = -anIntArray9086[1] + i_16_
                    if (i_15_ < 0) i_15_ = -i_15_
                    if (anInt9094 < i_15_) {
                        is_10_[i_13_] = i_14_
                        is_11_[i_13_] = i_16_
                        is_12_[i_13_] = is_9_[i_13_]
                    } else {
                        val i_17_ = is_9_[i_13_]
                        i_15_ = -anIntArray9086[2] + i_17_
                        if (i_15_ < 0) i_15_ = -i_15_
                        if (i_15_ > anInt9094) {
                            is_10_[i_13_] = i_14_
                            is_11_[i_13_] = i_16_
                            is_12_[i_13_] = i_17_
                        } else {
                            is_10_[i_13_] = i_14_ * anInt9092 shr 12
                            is_11_[i_13_] = i_16_ * anInt9091 shr 12
                            is_12_[i_13_] = i_17_ * anInt9084 shr 12
                        }
                    }
                }
                i_13_++
            }
        }
        return `is`
    }

    companion object {
        @JvmField
        var anInt9085: Int = 0
        @JvmField
        var anInt9087: Int = 0
        @JvmField
        var anInt9088: Int = 0
        var aClass351_9089: Class351? = Class351(2, 6)
        @JvmField
        var aClass207_9090: Class207? = null
        @JvmField
        var anInt9093: Int = 0
        @JvmStatic
        fun method3050(bool: Boolean) {
            aClass351_9089 = null
            aClass207_9090 = null
            if (bool != true) method3050(true)
        }

        @JvmStatic
        fun method3051(i: Int, i_3_: Int): Int {
            if (i_3_ != 4096) return -68
            anInt9085++
            var i_4_ = i ushr 1
            i_4_ = i_4_ or (i_4_ ushr 1)
            i_4_ = i_4_ or (i_4_ ushr 2)
            i_4_ = i_4_ or (i_4_ ushr 4)
            i_4_ = i_4_ or (i_4_ ushr 8)
            i_4_ = i_4_ or (i_4_ ushr 16)
            return (i_4_.inv()) and i
        }

        @Throws(ClassNotFoundException::class)
        fun method3052(i: Int, string: String?): Class<*> {
            if (i != 11012) aClass351_9089 = null
            anInt9088++
            if (string == "B") return Byte.TYPE
            if (string == "I") return Integer.TYPE
            if (string == "S") return Short.TYPE
            if (string == "J") return Long.TYPE
            if (string == "Z") return java.lang.Boolean.TYPE
            if (string == "F") return Float.TYPE
            if (string == "D") return Double.TYPE
            if (string == "C") return Character.TYPE
            return Class.forName(string)
        }
    }
}
