import Class318_Sub1_Sub3_Sub3.Companion.method2433
import Class348_Sub31.Companion.method3007
import aa.Companion.method160
import kotlin.math.sqrt

/* Class348_Sub40_Sub34 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class348_Sub40_Sub34 : Class348_Sub40(1, false) {
    private var anInt9438 = 4096
    private var aBoolean9439 = true

    override fun method3049(class348_sub49: Class348_Sub49, i: Int, i_5_: Int) {
        do {
            try {
                if (i_5_ != 31015) method3140(-77, 55)
                anInt9433++
                val i_6_ = i
                if (i_6_ == 0) {
                    anInt9438 = class348_sub49!!.readUnsignedShort(842397944)
                    break
                } else if (i_6_ != 1) break
                aBoolean9439 = class348_sub49!!.readUnsignedByte(255) == 1
                break
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, ("cfa.F(" + (if (class348_sub49 != null) "{...}" else "null") + ',' + i + ',' + i_5_ + ')'))
            }
        } while (false)
    }

    override fun method3047(i: Int, i_7_: Int): Array<IntArray?>? {
        anInt9434++
        val `is` = this.aClass322_7033!!.method2557(-111, i)!!
        if (i_7_ != -1564599039) method3140(72, -13)
        if (this.aClass322_7033!!.aBoolean4035) {
            val is_8_ = this.method3048(-1 + i and Class299_Sub2.anInt6325, 633706337, 0)!!
            val is_9_ = this.method3048(i, i_7_ + -2096661920, 0)!!
            val is_10_ = this.method3048(Class299_Sub2.anInt6325 and 1 + i, 633706337, 0)!!
            val is_11_ = `is`[0]!!
            val is_12_ = `is`[1]!!
            val is_13_ = `is`[2]!!
            var i_14_ = 0
            while (Class348_Sub40_Sub6.Companion.anInt9139 > i_14_) {
                val i_15_ = (-is_8_[i_14_] + is_10_[i_14_]) * anInt9438
                val i_16_ = (anInt9438 * (is_9_[1 + i_14_ and Class239_Sub22.anInt6076] - is_9_[Class239_Sub22.anInt6076 and -1 + i_14_]))
                val i_17_ = i_16_ shr 12
                val i_18_ = i_15_ shr 12
                val i_19_ = i_17_ * i_17_ shr 12
                val i_20_ = i_18_ * i_18_ shr 12
                val i_21_ = (sqrt(((i_19_ - (-i_20_ + -4096)).toFloat() / 4096.0f).toDouble()) * 4096.0).toInt()
                var i_22_: Int
                var i_23_: Int
                var i_24_: Int
                if (i_21_ == 0) {
                    i_22_ = 0
                    i_23_ = 0
                    i_24_ = 0
                } else {
                    i_23_ = i_16_ / i_21_
                    i_22_ = i_15_ / i_21_
                    i_24_ = 16777216 / i_21_
                }
                if (aBoolean9439) {
                    i_24_ = (i_24_ shr 1) + 2048
                    i_23_ = (i_23_ shr 1) + 2048
                    i_22_ = (i_22_ shr 1) + 2048
                }
                is_11_[i_14_] = i_23_
                is_12_[i_14_] = i_22_
                is_13_[i_14_] = i_24_
                i_14_++
            }
        }
        return `is`
    }

    companion object {
        @JvmField
        var anIntArray9431: IntArray? = IntArray(1)
        @JvmField
        var aClass293Array9432: Array<Class293?>? = null
        @JvmField
        var anInt9433: Int = 0
        @JvmField
        var anInt9434: Int = 0
        @JvmField
        var anInt9435: Int = 0
        @JvmField
        var anIntArray9436: IntArray? = IntArray(2)
        @JvmField
        var anInt9437: Int = 0
        @JvmStatic
        fun method3140(i: Int, i_0_: Int): Int {
            val i_1_ = 40 / ((i - 19) / 63)
            anInt9435++
            if (i_0_ == 16711935) return -1
            return method160(27076, i_0_)
        }

        @JvmStatic
        fun method3141(bool: Boolean, i: Byte) {
            if (Class348_Sub40_Sub8.Companion.aClass238_9165 != null) {
                Class348_Sub40_Sub8.Companion.aClass238_9165!!.method1700(36.toByte())
                Class348_Sub40_Sub8.Companion.aClass238_9165 = null
            }
            anInt9437++
            Class225.anInt2955 = 0
            Class348_Sub18.method2938(87.toByte())
            method2433()
            if (i.toInt() != 11) anIntArray9436 = null
            for (i_2_ in 0..3) Class348_Sub45.aClass361Array7108!![i_2_]!!.method3500(700)
            Class348_Sub42_Sub3.method3177(-50, false)
            System.gc()
            method3007(2, 22684)
            Class74.aBoolean1236 = false
            Class267.anInt3428 = -1
            Class348_Sub40_Sub17_Sub1.Companion.method3093(i + 79)
            Class101_Sub2.method921(99.toByte(), true)
            Class90.regionTileY = 0
            za_Sub2.regionTileX = 0
            ha.anInt4581 = 0
            Class327.anInt4095 = 0
            Class312.anInt3931 = 0
            Class83.anInt1447 = Class312.anInt3931
            var i_3_ = 0
            while ((i_3_ < Class348_Sub27.aClass302Array6897!!.size)) {
                Class348_Sub27.aClass302Array6897!![i_3_] = null
                i_3_++
            }
            Class348_Sub42.method3163((-114).toByte())
            for (i_4_ in 0..2047) Class294.aPlayerArray5058!![i_4_] = null
            Class150.anInt2057 = 0
            Class282.aClass356_3654!!.method3481(i.toInt() xor 0xb)
            Class348_Sub32.anInt6930 = 0
            Class130.aClass356_1895!!.method3481(0)
            Class128.method1122(0)
            Class135_Sub1.anInt4718 = 0
            Class318_Sub1_Sub3_Sub3.aClass170_10209!!.method1314((-107).toByte())
            Class301.method2282(-12648)
            Class50_Sub3.method465(i + -1636518175)
            Class101_Sub2.aLong5745 = 0L
            Class239_Sub4.aClass348_Sub26_5881 = null
            if (bool) Class348_Sub49.method3379(2, 12)
            else {
                Class348_Sub49.method3379(i + -9, 3)
                try {
                    Class224.method1617(125.toByte(), Class93.anApplet1530, "loggedout")
                } catch (throwable: Throwable) {
                    /* empty */
                }
            }
        }

        @JvmStatic
        fun method3142(i: Int) {
            anIntArray9431 = null
            anIntArray9436 = null
            if (i != 0) aClass293Array9432 = null
            aClass293Array9432 = null
        }
    }
}
