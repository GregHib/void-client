import Class33.Companion.method340
import Class348_Sub40_Sub1.Companion.method3051
import kotlin.math.asin
import kotlin.math.atan2
import kotlin.math.max
import kotlin.math.sqrt

/* Class72 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class72 internal constructor(private val anInt1230: Int, private val anInt1224: Int, private val anInt1225: Int, private val anInt1216: Int, private val anInt1229: Int, private val anInt1218: Int, private val anInt1222: Int, private val aBoolean1223: Boolean) {
    private var anInt1217 = 0
    private var anInt1219 = 0
    private var anInt1220 = 0
    private var aClass105_1221: Class105? = null
    private var anInt1231 = 0
    @JvmField
    var anInt1232: Int = 0

    private fun method730(var_ha: ha, class72_0_: Class72?): Boolean {
        if (aClass105_1221 == null) {
            if (anInt1230 == 0) {
                if (Class101_Sub1.aD5684!!.method4(-7953, anInt1224)) {
                    val `is` = Class101_Sub1.aD5684!!.method6(-21540, anInt1220, 0.7f, anInt1224, false, anInt1220)
                    aClass105_1221 = var_ha.method3662(anInt1220, `is`, 94.toByte(), 0, anInt1220, anInt1220)
                }
            } else if (anInt1230 == 2) method740(var_ha, class72_0_)
            else if (anInt1230 == 1) method735(var_ha, class72_0_)
        }
        return aClass105_1221 != null
    }

    fun method733(i: Int, i_11_: Int, i_12_: Int, i_13_: Int): Boolean {
        var i_14_: Int
        var i_15_: Int
        var i_16_: Int
        if (aBoolean1223) {
            this.anInt1232 = 1073741823
            i_14_ = anInt1225
            i_15_ = anInt1216
            i_16_ = anInt1229
        } else {
            i_14_ = anInt1225 - i
            i_15_ = anInt1216 - i_11_
            i_16_ = anInt1229 - i_12_
            this.anInt1232 = sqrt((i_14_ * i_14_ + i_15_ * i_15_ + i_16_ * i_16_).toDouble()).toInt()
            if (this.anInt1232 == 0) this.anInt1232 = 1
            i_14_ = (i_14_ shl 8) / this.anInt1232
            i_15_ = (i_15_ shl 8) / this.anInt1232
            i_16_ = (i_16_ shl 8) / this.anInt1232
        }
        val i_17_ = (sqrt((i_14_ * i_14_ + i_15_ * i_15_ + i_16_ * i_16_).toDouble()) * 256.0).toInt()
        if (i_17_ > 128) {
            i_14_ = (i_14_ shl 16) / i_17_
            i_15_ = (i_15_ shl 16) / i_17_
            i_16_ = (i_16_ shl 16) / i_17_
            anInt1217 = anInt1218 * i_13_ / (if (aBoolean1223) 1024 else this.anInt1232)
        } else anInt1217 = 0
        if (anInt1217 < 8) {
            aClass105_1221 = null
            return false
        }
        var i_18_ = method340(anInt1217, 108.toByte())
        if (i_18_ > i_13_) i_18_ = method3051(i_13_, 4096)
        if (i_18_ > 512) i_18_ = 512
        if (i_18_ != anInt1220) anInt1220 = i_18_
        anInt1231 = (asin((i_15_.toFloat() / 256.0f).toDouble()) * 2607.5945876176133).toInt() and 0x3fff
        anInt1219 = (atan2(i_14_.toDouble(), -i_16_.toDouble()) * 2607.5945876176133).toInt() and 0x3fff
        aClass105_1221 = null
        return true
    }

    fun method734() {
        aClass105_1221 = null
    }

    private fun method735(var_ha: ha, class72_19_: Class72?) {
        method738(var_ha)
        method732(var_ha)
        var_ha.K(anIntArray1226)
        var_ha.KA(0, 0, anInt1220, anInt1220)
        var_ha.ya()
        var_ha.aa(0, 0, anInt1220, anInt1220, 0xffffff.inv() or anInt1222, 0)
        var i = 0
        var i_20_ = 0
        var i_21_ = 256
        if (class72_19_ != null) {
            if (class72_19_.aBoolean1223) {
                i = -class72_19_.anInt1225
                i_20_ = -class72_19_.anInt1216
                i_21_ = -class72_19_.anInt1229
            } else {
                i = class72_19_.anInt1225 - anInt1225
                i_20_ = class72_19_.anInt1216 - anInt1216
                i_21_ = class72_19_.anInt1229 - anInt1229
            }
        }
        if (anInt1231 != 0) {
            val i_22_: Int = Class70.Companion.anIntArray1207!![anInt1231]
            val i_23_: Int = Class70.Companion.anIntArray1204!![anInt1231]
            val i_24_ = i_20_ * i_23_ - i_21_ * i_22_ shr 14
            i_21_ = i_20_ * i_22_ + i_21_ * i_23_ shr 14
            i_20_ = i_24_
        }
        if (anInt1219 != 0) {
            val i_25_: Int = Class70.Companion.anIntArray1207!![anInt1219]
            val i_26_: Int = Class70.Companion.anIntArray1204!![anInt1219]
            val i_27_ = i_21_ * i_25_ + i * i_26_ shr 14
            i_21_ = i_21_ * i_26_ - i * i_25_ shr 14
            i = i_27_
        }
        val class64: Class64? = aClass64_1227!!.method614(0.toByte(), 51200, true)
        class64!!.aa(0.toShort(), anInt1224.toShort())
        var_ha.xa(1.0f)
        var_ha.ZA(16777215, 1.0f, 1.0f, i.toFloat(), i_20_.toFloat(), i_21_.toFloat())
        var i_28_ = 1024 * anInt1220 / (class64.RA() - class64.V())
        if (anInt1222 != 0) i_28_ = i_28_ * 13 / 16
        var_ha.DA(anInt1220 / 2, anInt1220 / 2, i_28_, i_28_)
        var_ha.method3638(var_ha.method3654())
        val class101 = var_ha.method3654()
        class101.method894(0, 0, var_ha.i() - class64.HA())
        class64.method608(class101, null, 1024, 1)
        val i_29_ = anInt1220 * 13 / 16
        val i_30_ = (anInt1220 - i_29_) / 2
        aClass105_1215!!.method970(i_30_, i_30_, i_29_, i_29_, 0, 0xffffff.inv() or anInt1222, 1)
        aClass105_1221 = var_ha.method3683(0, 0, anInt1220, anInt1220, true)
        var_ha.ya()
        var_ha.aa(0, 0, anInt1220, anInt1220, 0, 0)
        aClass105_1228!!.method970(0, 0, anInt1220, anInt1220, 1, 0, 0)
        aClass105_1221!!.method968(0, 0, 0)
        var_ha.KA(anIntArray1226!![0], anIntArray1226!![1], anIntArray1226!![2], anIntArray1226!![3])
    }

    fun method736(var_ha: ha, class72_31_: Class72?): Boolean {
        return aClass105_1221 != null || method730(var_ha, class72_31_)
    }

    fun method737(var_ha: ha?, i: Int, i_32_: Int, i_33_: Int, i_34_: Int, i_35_: Int, i_36_: Int) {
        if (aClass105_1221 != null) {
            var i_37_ = anInt1231 - i_35_ and 0x3fff
            var i_38_ = anInt1219 - i_36_ and 0x3fff
            if (i_38_ > 8192) i_38_ -= 16384
            if (i_37_ > 8192) i_37_ -= 16384
            val i_39_ = i_37_ * i_34_ / 4096 + (i_34_ - anInt1217) / 2
            val i_40_ = i_38_ * i_34_ / -4096 + (i_33_ - anInt1217) / 2
            if (i_39_ < i_34_ && i_39_ + anInt1217 > 0 && i_40_ < i_33_ && i_40_ + anInt1217 > 0) aClass105_1221!!.method973(i_40_ + i, i_39_ + i_32_, anInt1217, anInt1217)
        }
    }

    private fun method740(var_ha: ha, class72_60_: Class72?) {
        val class124 = Class300.method2277(0, Class260.aClass45_3309!!, anInt1224, -1)
        if (class124 != null) {
            var_ha.K(anIntArray1226)
            var_ha.KA(0, 0, anInt1220, anInt1220)
            var_ha.aa(0, 0, anInt1220, anInt1220, 0, 0)
            var i = 0
            var i_61_ = 0
            var i_62_ = 256
            if (class72_60_ != null) {
                if (class72_60_.aBoolean1223) {
                    i = -class72_60_.anInt1225
                    i_61_ = -class72_60_.anInt1216
                    i_62_ = -class72_60_.anInt1229
                } else {
                    i = anInt1225 - class72_60_.anInt1225
                    i_61_ = anInt1216 - class72_60_.anInt1216
                    i_62_ = anInt1229 - class72_60_.anInt1229
                }
            }
            if (anInt1231 != 0) {
                val i_63_ = -anInt1231 and 0x3fff
                val i_64_: Int = Class70.Companion.anIntArray1207!![i_63_]
                val i_65_: Int = Class70.Companion.anIntArray1204!![i_63_]
                val i_66_ = i_61_ * i_65_ - i_62_ * i_64_ shr 14
                i_62_ = i_61_ * i_64_ + i_62_ * i_65_ shr 14
                i_61_ = i_66_
            }
            if (anInt1219 != 0) {
                val i_67_ = -anInt1219 and 0x3fff
                val i_68_: Int = Class70.Companion.anIntArray1207!![i_67_]
                val i_69_: Int = Class70.Companion.anIntArray1204!![i_67_]
                val i_70_ = i_62_ * i_68_ + i * i_69_ shr 14
                i_62_ = i_62_ * i_69_ - i * i_68_ shr 14
                i = i_70_
            }
            var_ha.xa(1.0f)
            var_ha.ZA(16777215, 1.0f, 1.0f, i.toFloat(), i_61_.toFloat(), i_62_.toFloat())
            val class64 = var_ha.method3625(class124, 2048, 0, 64, 768)
            val i_71_ = class64.RA() - class64.V()
            val i_72_ = class64.EA() - class64.fa()
            val i_73_ = class64.V() + i_71_ / 2
            val i_74_ = class64.fa() + i_72_ / 2
            val i_75_ = max(i_71_, i_72_)
            var_ha.DA(i_73_, i_74_, i_75_, i_75_)
            var_ha.method3638(var_ha.method3654())
            val class101 = var_ha.method3705()
            class101.method894(0, 0, var_ha.i() - class64.HA())
            class64.method608(class101, null, var_ha.i(), 1)
            aClass105_1221 = var_ha.method3683(0, 0, anInt1220, anInt1220, true)
            aClass105_1221!!.method968(0, 0, 3)
            var_ha.KA(anIntArray1226!![0], anIntArray1226!![1], anIntArray1226!![2], anIntArray1226!![3])
        }
    }

    companion object {
        private var aClass105_1215: Class105? = null
        private var anIntArray1226: IntArray? = IntArray(4)
        private var aClass64_1227: Class64? = null
        private var aClass105_1228: Class105? = null
        @JvmStatic
        fun method731() {
            aClass64_1227 = null
            aClass105_1215 = null
            aClass105_1228 = null
            anIntArray1226 = null
        }

        private fun method732(var_ha: ha) {
            if (aClass105_1228 == null) {
                val `is` = IntArray(16384)
                val is_1_ = IntArray(16384)
                for (i in 0..63) {
                    var i_2_ = 64 - i
                    i_2_ *= i_2_
                    val i_3_ = 128 - i - 1
                    val i_4_ = i * 128
                    val i_5_ = i_3_ * 128
                    for (i_6_ in 0..63) {
                        var i_7_ = 64 - i_6_
                        i_7_ *= i_7_
                        val i_8_ = 128 - i_6_ - 1
                        var i_9_ = 256 - (i_7_ + i_2_ shl 8) / 4096
                        i_9_ = i_9_ * 16 * 192 / 1536
                        if (i_9_ < 0) i_9_ = 0
                        else if (i_9_ > 255) i_9_ = 255
                        val i_10_ = i_9_ / 2
                        is_1_[i_5_ + i_8_] = 0xffffff.inv() or (i_9_ shl 16)
                        is_1_[i_5_ + i_6_] = is_1_[i_5_ + i_8_]
                        is_1_[i_4_ + i_8_] = is_1_[i_5_ + i_6_]
                        is_1_[i_4_ + i_6_] = is_1_[i_4_ + i_8_]
                        `is`[i_5_ + i_8_] = 127 - i_10_ shl 24 or 0xffffff
                        `is`[i_5_ + i_6_] = `is`[i_5_ + i_8_]
                        `is`[i_4_ + i_8_] = `is`[i_5_ + i_6_]
                        `is`[i_4_ + i_6_] = `is`[i_4_ + i_8_]
                    }
                }
                aClass105_1228 = var_ha.method3662(128, is_1_, 94.toByte(), 0, 128, 128)
                aClass105_1215 = var_ha.method3662(128, `is`, 94.toByte(), 0, 128, 128)
            }
        }

        private fun method738(var_ha: ha) {
            if (aClass64_1227 == null) {
                val class124 = Class124(580, 1104, 1)
                class124.method1105(109, 0.toByte(), 0.toByte(), 0.toShort(), 1024.toShort(), 0.toByte(), 0.toShort(), 32767.toShort(), 1024.toShort(), 1024.toShort())
                class124.method1101(128, 0, 0, -93)
                class124.method1101(-128, 0, 0, 108)
                for (i in 0..24) {
                    val i_41_ = i * 8192 / 24
                    val i_42_: Int = Class70.Companion.anIntArray1207!![i_41_]
                    val i_43_: Int = Class70.Companion.anIntArray1204!![i_41_]
                    for (i_44_ in 1..23) {
                        val i_45_ = i_44_ * 8192 / 24
                        val i_46_: Int = Class70.Companion.anIntArray1204!![i_45_] shr 7
                        val i_47_: Int = Class70.Companion.anIntArray1207!![i_45_] * i_42_ shr 21
                        val i_48_: Int = Class70.Companion.anIntArray1207!![i_45_] * i_43_ shr 21
                        class124.method1101(i_46_, -i_47_, i_48_, 127)
                    }
                    if (i > 0) {
                        var i_49_ = i * 23 + 2
                        var i_50_ = i_49_ - 23
                        class124.method1102(0, 0.toByte(), 0.toByte(), 0.toShort(), 52.toByte(), 127.toShort(), i_50_, 0.toByte(), i_49_)
                        for (i_51_ in 1..22) {
                            val i_52_ = i_50_ + 1
                            val i_53_ = i_49_ + 1
                            class124.method1102(i_50_, 0.toByte(), 0.toByte(), 0.toShort(), 41.toByte(), 127.toShort(), i_52_, 0.toByte(), i_49_)
                            class124.method1102(i_52_, 0.toByte(), 0.toByte(), 0.toShort(), 67.toByte(), 127.toShort(), i_53_, 0.toByte(), i_49_)
                            i_50_ = i_52_
                            i_49_ = i_53_
                        }
                        class124.method1102(i_49_, 0.toByte(), 0.toByte(), 0.toShort(), 98.toByte(), 127.toShort(), i_50_, 0.toByte(), 1)
                    }
                }
                class124.anInt1821 = class124.anInt1836
                class124.anIntArray1824 = null
                class124.anIntArray1868 = null
                class124.aByteArray1839 = null
                aClass64_1227 = var_ha.method3625(class124, 51200, 33, 64, 768)
            }
        }

        fun method739() {
            aClass64_1227 = null
            aClass105_1228 = null
        }
    }
}
