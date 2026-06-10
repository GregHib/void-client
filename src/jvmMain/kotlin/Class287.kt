import Class151.Companion.method1211
import Class19.Companion.method285
import java.util.zip.CRC32
import kotlin.math.atan2
import kotlin.math.cos
import kotlin.math.min
import kotlin.math.sin

class Class287 {
    var anInt3687: Int = 0
    var anInterface12Array3688: Array<Interface12?> = emptyArray()
    var anInt3690: Int = 0
    private fun method2182(bool: Boolean, class223: Class223?, class348_sub49: Class348_Sub49?): Interface12? {
        try {
            anInt3692++
            if (Class219.aClass223_2868 == class223) return Class170.method1312(64.toByte(), class348_sub49!!)
            if (Class348_Sub49.aClass223_7175 == class223) return Class105_Sub1.method987(743571200, class348_sub49!!)
            if (Class101_Sub1.aClass223_5689 == class223) return Class303.method2287(class348_sub49!!, (-112).toByte())
            if (class223 == Class28.aClass223_4997) return Class337.method2660(26.toByte(), class348_sub49!!)
            if (bool != true) Companion.method2180((-104).toByte())
            if (class223 == Class348_Sub40_Sub21.aClass223_9274) return Class288_Sub1.Companion.method2189(class348_sub49!!, 86)
            if (class223 == Class313.aClass223_3934) return Class5.method179(16533, class348_sub49!!)
            if (Class185.aClass223_2489 == class223) return Class348_Sub46.method3322(0, class348_sub49!!)
            if (class223 == Class174.aClass223_2307) return Class50_Sub4.method472(-27794, class348_sub49!!)
            if (Class149.aClass223_2045 == class223) return Class328_Sub2.method2612(class348_sub49!!, true)
            if (Class187.aClass223_2507 == class223) return Class285_Sub1.method2128(-1730, class348_sub49!!)
            return null
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("vp.F(" + bool + ',' + (if (class223 != null) "{...}" else "null") + ',' + (if (class348_sub49 != null) "{...}" else "null") + ')'))
        }
    }

    fun method2183(class348_sub49: Class348_Sub49, i: Int) {
        this.anInt3690 = class348_sub49.readMedium(-1)
        anInt3693++
        this.anInt3687 = class348_sub49.readUnsignedShort(842397944)
        this.anInterface12Array3688 = arrayOfNulls<Interface12>(class348_sub49.readUnsignedByte(i xor 0x557d))
        val class223s = method285(-99)
        var i_27_ = 0
        if (i != 21890) method2180(25.toByte())
        while ( /**/this.anInterface12Array3688.size > i_27_) {
            this.anInterface12Array3688[i_27_] = method2182(true, class223s[(class348_sub49.readUnsignedByte(Class348_Sub21.method2955(i, 21885)))], class348_sub49)
            i_27_++
        }
    }

    companion object {
        var anInt3685: Int = 0
        var anInt3686: Int = 0
        var anInt3689: Int = 0
        var aCRC32_3691: CRC32? = CRC32()
        var anInt3692: Int = 0
        var anInt3693: Int = 0
        var anInt3694: Int = 0
        @JvmField
        var anInt3695: Int = 0

        @JvmStatic
        fun method2178(class318_sub1: Class318_Sub1?, i: Int, class17: Class17?, i_0_: Int) {
            try {
                anInt3694++
                if (Class147.anInt2021 < 50 && (class17 != null && class17.anIntArrayArray264 != null && (class17.anIntArrayArray264!!.size > i) && class17.anIntArrayArray264!![i] != null)) {
                    val i_1_ = class17.anIntArrayArray264!![i]!![0]
                    var i_2_ = i_1_ shr 8
                    val i_3_ = (i_1_ and 0xf1) shr 5
                    if (i_0_ > -13) anInt3695 = 0
                    if (class17.anIntArrayArray264!![i]!!.size > 1) {
                        val i_4_ = ((class17.anIntArrayArray264!![i])!!.size.toDouble() * Math.random()).toInt()
                        if (i_4_ > 0) i_2_ = class17.anIntArrayArray264!![i]!![i_4_]
                    }
                    val i_5_ = i_1_ and 0x1f
                    var i_6_ = 256
                    if (class17.anIntArray236 != null && class17.anIntArray265 != null) i_6_ = ((Math.random() * (-(class17.anIntArray236!![i]) + (class17.anIntArray265!![i])).toDouble()).toInt() + class17.anIntArray236!![i])
                    val i_7_ = (if (class17.anIntArray253 == null) 255 else class17.anIntArray253!![i])
                    if (i_5_ == 0) {
                        if (Class132.aPlayer_1907 == class318_sub1) {
                            if (!class17.aBoolean268) Class348_Sub20.method2947(true, i_7_, i_2_, i_3_, 0, i_6_)
                            else Class279.method2090(i_3_, i_6_, false, (-35).toByte(), i_7_, 0, i_2_)
                        }
                    } else if (Class316.aClass348_Sub51_3959!!.aClass239_Sub26_7234!!.method1838(-32350) != 0) {
                        val i_8_ = (class318_sub1!!.x + -256 shr 9)
                        val i_9_ = (class318_sub1.y - 256 shr 9)
                        val i_10_ = (if (Class132.aPlayer_1907 != class318_sub1) ((class318_sub1.plane.toInt() shl 24) + ((i_8_ shl 16) + (i_9_ shl 8)) + i_5_) else 0)
                        Class258_Sub2.aClass10Array8531!![Class147.anInt2021++] = Class10((if (class17.aBoolean268) 2.toByte() else 1.toByte()), i_2_, i_3_, 0, i_7_, i_10_, i_6_, class318_sub1)
                    }
                }
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, ("vp.A(" + (if (class318_sub1 != null) "{...}" else "null") + ',' + i + ',' + (if (class17 != null) "{...}" else "null") + ',' + i_0_ + ')'))
            }
        }

        fun method2179(string: String, i: Byte): Long {
            anInt3689++
            val i_11_ = string.length
            var l = 0L
            if (i <= 98) method2184('\uffed', -66)
            for (i_12_ in 0..<i_11_) l = (l shl 5) + -l + string.get(i_12_).code.toLong()
            return l
        }

        @JvmStatic
        fun method2180(i: Byte) {
            aCRC32_3691 = null
            if (i > -70) anInt3695 = 92
        }

        fun method2181(l: Long, i: Int, i_13_: Int, i_14_: Int, i_15_: Int, class46: Class46?, i_16_: Int, i_17_: Int, var_aa: aa?) {
            try {
                anInt3686++
                val i_18_ = i_14_ * i_14_ + i_16_ * i_16_
                if (l >= i_18_.toLong()) {
                    if (i_13_ > -49) method2178(null, -119, null, 58)
                    var i_19_ = min(class46!!.anInt709 / 2, class46.anInt789 / 2)
                    if (i_18_ > i_19_ * i_19_) {
                        i_19_ -= 10
                        val i_20_: Int
                        if (Class348_Sub40_Sub21.anInt9282 == 4) i_20_ = Class314.aFloat3938.toInt() and 0x3fff
                        else i_20_ = 0x3fff and (Class314.aFloat3938.toInt() + r_Sub2.anInt10483)
                        var i_21_ = Class70.anIntArray1207!![i_20_]
                        var i_22_ = Class70.anIntArray1204!![i_20_]
                        if (Class348_Sub40_Sub21.anInt9282 != 4) {
                            i_22_ = i_22_ * 256 / (Class348_Sub49_Sub1.anInt9750 - -256)
                            i_21_ = 256 * i_21_ / (Class348_Sub49_Sub1.anInt9750 - -256)
                        }
                        val i_23_ = i_22_ * i_16_ + i_21_ * i_14_ shr 14
                        val i_24_ = i_22_ * i_14_ + -(i_21_ * i_16_) shr 14
                        val d = atan2(i_23_.toDouble(), i_24_.toDouble())
                        val i_25_ = (i_19_.toDouble() * sin(d)).toInt()
                        val i_26_ = (cos(d) * i_19_.toDouble()).toInt()
                        Class200.aClass105Array2640!![i_17_]!!.method981((class46.anInt709.toFloat() / 2.0f + i_15_.toFloat() + i_25_.toFloat()), (i.toFloat() + class46.anInt789.toFloat() / 2.0f - i_26_.toFloat()), 4096, (65535.0 * (-d / 6.283185307179586)).toInt())
                    } else method1211(i, Class59_Sub1.aClass105Array5294!![i_17_], i_15_, class46, var_aa, i_14_, 2, i_16_)
                }
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, ("vp.D(" + l + ',' + i + ',' + i_13_ + ',' + i_14_ + ',' + i_15_ + ',' + (if (class46 != null) "{...}" else "null") + ',' + i_16_ + ',' + i_17_ + ',' + (if (var_aa != null) "{...}" else "null") + ')'))
            }
        }

        fun method2184(c: Char, i: Int): Char {
            anInt3685++
            if (i != -10072) anInt3695 = -123
            val i_28_ = c.code
            while_97_@ do {
                while_96_@ do {
                    while_95_@ do {
                        while_94_@ do {
                            while_93_@ do {
                                while_92_@ do {
                                    while_91_@ do {
                                        while_90_@ do {
                                            while_89_@ do {
                                                do {
                                                    if (i_28_ != 32 && (i_28_ != 160) && (i_28_ != 95) && i_28_ != 45) {
                                                        if ((i_28_ != 91) && (i_28_ != 93) && i_28_ != 35) {
                                                            if ((i_28_ != 224) && (i_28_ != 225) && i_28_ != 226 && (i_28_ != 228) && i_28_ != 227 && i_28_ != 192 && (i_28_ != 193) && (i_28_ != 194) && (i_28_ != 196) && i_28_ != 195) {
                                                                if (i_28_ != 232 && i_28_ != 233 && (i_28_ != 234) && (i_28_ != 235) && i_28_ != 200 && i_28_ != 201 && i_28_ != 202 && (i_28_ != 203)) {
                                                                    if ((i_28_ != 237) && (i_28_ != 238) && (i_28_ != 239) && (i_28_ != 205) && (i_28_ != 206) && (i_28_ != 207)) {
                                                                        if ((i_28_ != 242) && (i_28_ != 243) && (i_28_ != 244) && (i_28_ != 246) && (i_28_ != 245) && (i_28_ != 210) && (i_28_ != 211) && (i_28_ != 212) && (i_28_ != 214) && (i_28_ != 213)) {
                                                                            if (i_28_ != 249 && i_28_ != 250 && i_28_ != 251 && i_28_ != 252 && i_28_ != 217 && i_28_ != 218 && i_28_ != 219 && i_28_ != 220) {
                                                                                if (i_28_ != 231 && i_28_ != 199) {
                                                                                    if (i_28_ != 255 && i_28_ != 376) {
                                                                                        if (i_28_ != 241 && i_28_ != 209) {
                                                                                            if (i_28_ == 223) break@while_96_
                                                                                            break@while_97_
                                                                                        }
                                                                                    } else break@while_94_
                                                                                    break@while_95_
                                                                                }
                                                                            } else break@while_92_
                                                                            break@while_93_
                                                                        }
                                                                    } else break@while_90_
                                                                    break@while_91_
                                                                }
                                                            } else break
                                                            break@while_89_
                                                        }
                                                    } else return '_'
                                                    return c
                                                } while (false)
                                                return 'a'
                                            } while (false)
                                            return 'e'
                                        } while (false)
                                        return 'i'
                                    } while (false)
                                    return 'o'
                                } while (false)
                                return 'u'
                            } while (false)
                            return 'c'
                        } while (false)
                        return 'y'
                    } while (false)
                    return 'n'
                } while (false)
                return 'b'
            } while (false)
            return c.lowercaseChar()
        }
    }
}
