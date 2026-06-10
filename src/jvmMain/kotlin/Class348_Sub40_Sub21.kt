/* Class348_Sub40_Sub21 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class348_Sub40_Sub21 : Class348_Sub40(0, true) {
    private var anInt9266 = 0
    private var anInt9269 = 2048
    private var anInt9276 = 4096
    private var anInt9277 = 8192
    private var anInt9278 = 0
    private var anInt9279 = 12288
    private var anInt9281 = 2048
    override fun method3042(i: Int, i_0_: Int): IntArray {
        anInt9267++
        val `is` = this.aClass191_7032!!.method1433(0, i)!!
        if (i_0_ != 255) method3108(-114, -119, -89)
        if (this.aClass191_7032!!.aBoolean2570) {
            val i_1_ = -2048 + Class239_Sub18.anIntArray6035!![i]
            var i_2_ = 0
            while ((i_2_ < Class348_Sub40_Sub6.Companion.anInt9139)) {
                val i_3_ = -2048 + Class318_Sub6.anIntArray6432!![i_2_]
                var i_4_ = i_3_ - -anInt9269
                i_4_ = if (i_4_ < -2048) 4096 + i_4_ else i_4_
                i_4_ = if (i_4_ <= 2048) i_4_ else -4096 + i_4_
                var i_5_ = anInt9278 + i_1_
                i_5_ = if (i_5_ < -2048) i_5_ - -4096 else i_5_
                i_5_ = if (i_5_ <= 2048) i_5_ else i_5_ - 4096
                var i_6_ = i_3_ - -anInt9266
                i_6_ = if (i_6_ < -2048) i_6_ + 4096 else i_6_
                i_6_ = if (i_6_ > 2048) i_6_ - 4096 else i_6_
                var i_7_ = anInt9281 + i_1_
                i_7_ = if (i_7_ < -2048) i_7_ - -4096 else i_7_
                i_7_ = if (i_7_ > 2048) -4096 + i_7_ else i_7_
                `is`[i_2_] = if (method3108(i_5_, 9619, i_4_) || method3105(i_7_, -7981, i_6_)) 4096 else 0
                i_2_++
            }
        }
        return `is`
    }

    override fun method3044(i: Int) {
        anInt9272++
        if (i <= 108) method3042(69, 74)
        Class220.method1605(26188)
    }

    private fun method3105(i: Int, i_8_: Int, i_9_: Int): Boolean {
        anInt9273++
        val i_10_ = (i_9_ + i) * anInt9279 shr 12
        var i_11_ = Class127.anIntArray4654!![(i_10_ * 255 and 0xfff2f) shr 12]
        if (i_8_ != -7981) anInt9266 = -52
        i_11_ = (i_11_ shl 12) / anInt9279
        i_11_ = (i_11_ shl 12) / anInt9277
        i_11_ = i_11_ * anInt9276 shr 12
        return i_11_ > i + -i_9_ && -i_9_ + i > -i_11_
    }

    override fun method3049(class348_sub49: Class348_Sub49, i: Int, i_13_: Int) {
        anInt9268++
        if (i_13_ != 31015) method3042(72, 12)
        val i_14_ = i
        while_183_@ do {
            while_182_@ do {
                while_181_@ do {
                    while_180_@ do {
                        while_179_@ do {
                            do {
                                if (i_14_ == 0) {
                                    anInt9269 = class348_sub49.readUnsignedShort(842397944)
                                    return
                                } else if (i_14_ != 1) {
                                    if (i_14_ != 2) {
                                        if (i_14_ != 3) {
                                            if (i_14_ != 4) {
                                                if (i_14_ != 5) {
                                                    if (i_14_ == 6) break@while_182_
                                                    break@while_183_
                                                }
                                            } else break@while_180_
                                            break@while_181_
                                        }
                                    } else break
                                    break@while_179_
                                }
                                anInt9278 = class348_sub49.readUnsignedShort(842397944)
                                return
                            } while (false)
                            anInt9266 = class348_sub49.readUnsignedShort(842397944)
                            return
                        } while (false)
                        anInt9281 = class348_sub49.readUnsignedShort(842397944)
                        return
                    } while (false)
                    anInt9279 = class348_sub49.readUnsignedShort(842397944)
                    return
                } while (false)
                anInt9276 = class348_sub49.readUnsignedShort(842397944)
                return
            } while (false)
            anInt9277 = class348_sub49.readUnsignedShort(842397944)
        } while (false)
    }

    private fun method3108(i: Int, i_20_: Int, i_21_: Int): Boolean {
        if (i_20_ != 9619) return true
        anInt9271++
        val i_22_ = anInt9279 * (i - i_21_) shr 12
        var i_23_ = Class127.anIntArray4654!![(0xff530 and 255 * i_22_) shr 12]
        i_23_ = (i_23_ shl 12) / anInt9279
        i_23_ = (i_23_ shl 12) / anInt9277
        i_23_ = anInt9276 * i_23_ shr 12
        return i_23_ > i_21_ - -i && -i_23_ < i + i_21_
    }

    companion object {
        @JvmField
        var anInt9267: Int = 0
        @JvmField
        var anInt9268: Int = 0
        @JvmField
        var anInt9270: Int = 0
        @JvmField
        var anInt9271: Int = 0
        @JvmField
        var anInt9272: Int = 0
        @JvmField
        var anInt9273: Int = 0
        @JvmField
        var aClass223_9274: Class223?
        @JvmField
        var aStringArray9275: Array<String?>? = arrayOfNulls<String>(100)
        @JvmField
        var anInt9280: Int
        @JvmField
        var anInt9282: Int = 0
        @JvmField
        var aLongArray9283: LongArray?

        @JvmStatic
        fun method3106(i: Byte) {
            aLongArray9283 = null
            aStringArray9275 = null
            aClass223_9274 = null
            val i_12_ = 69 % ((19 - i) / 41)
        }

        fun method3107(i: Byte, interface10: Interface10, i_15_: Int, i_16_: Int): Long {
            anInt9270++
            val l = 4194304L
            val l_17_: Long = Long.MIN_VALUE
            val class51: Class51 = Class348_Sub40_Sub12.Companion.aClass263_9195!!.method2005(0, interface10.method42(-107))
            var l_18_ = (interface10.method39(-14) shl 14 or (i_16_ or (i_15_ shl 7)) or (interface10.method41(-32228) shl 20) or 0x40000000).toLong()
            if (class51.anInt874 == 0) l_18_ = l_18_ or l_17_
            if (class51.anInt895 == 1) l_18_ = l_18_ or l
            val i_19_ = 57 % ((-24 - i) / 57)
            l_18_ = l_18_ or (interface10.method42(-102).toLong() shl 32)
            return l_18_
        }

        init {
            aClass223_9274 = Class223(5, 1)
            anInt9280 = 0
            aLongArray9283 = LongArray(256)
            for (i in 0..255) {
                var l = i.toLong()
                for (i_24_ in 0..7) {
                    if ((0x1L and l) == 1L) l = 0x3693a86a2878f0bdL.inv() xor (l ushr 1)
                    else l = l ushr 1
                }
                aLongArray9283!![i] = l
            }
        }

    }
}
