/* Class59_Sub2_Sub2 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class59_Sub2_Sub2 : Class59_Sub2(12, 5, 16, 2, 2, 0.45f) {
    private lateinit var aByteArray8681: ByteArray
    fun method571(i: Int, i_4_: Byte, i_5_: Int, i_6_: Int): ByteArray {
        aByteArray8681 = ByteArray(i_5_ * (i_6_ * (i * 2)))
        val i_7_ = -82 % ((i_4_ - 70) / 37)
        anInt8678++
        this.method542(i, i_6_, 0, i_5_)
        return aByteArray8681
    }

    override fun method563(i: Byte, i_8_: Int, i_9_: Byte) {
        var i_9_ = i_9_
        anInt8682++
        i_9_ = (127 + ((0xff and i_9_.toInt()) shr 1)).toByte()
        var i_10_ = 2 * i_8_
        aByteArray8681[i_10_++] = i_9_
        aByteArray8681[i_10_] = i_9_
        if (i <= 79) Companion.method574(-29, -37, 73, null, true, (-64).toByte(), 2, -112, 50, null, -65, null, -92, 30, -5)
    }

    companion object {
        @JvmField
        var anInt8675: Int = 0
        @JvmField
        var anInt8676: Int = 0
        @JvmField
        var anInt8677: Int = 0
        @JvmField
        var anInt8678: Int = 0
        @JvmField
        var aClass356_8679: Class356? = Class356(16)
        @JvmField
        var anInt8680: Int = 0
        @JvmField
        var anInt8682: Int = 0
        var aClass114_8683: Class114? = Class114(100, -1)
        @JvmField
        var anIntArray8684: IntArray? = null
        @JvmField
        var anInt8685: Int = 0

        @JvmStatic
        fun method569(i: Byte, class348_sub49: Class348_Sub49) {
            anInt8675++
            val i_0_ = class348_sub49.readSmart(-128)
            Class373_Sub2.aClass283Array7446 = arrayOfNulls<Class283>(i_0_)
            var i_1_ = 0
            while (i_0_ > i_1_) {
                Class373_Sub2.aClass283Array7446!![i_1_] = Class283()
                Class373_Sub2.aClass283Array7446!![i_1_]!!.anInt3657 = class348_sub49.readSmart(-124)
                Class373_Sub2.aClass283Array7446!![i_1_]!!.aString3663 = class348_sub49.method3371(-13487)
                i_1_++
            }
            Class318_Sub1_Sub2.anInt8731 = class348_sub49.readSmart(-127)
            Class239_Sub29.anInt6151 = class348_sub49.readSmart(-119)
            Class225.anInt2956 = class348_sub49.readSmart(-122)
            OutputStream_Sub1.aClass110_Sub1Array97 = arrayOfNulls<Class110_Sub1>(1 + (Class239_Sub29.anInt6151 + -Class318_Sub1_Sub2.anInt8731))
            var i_2_ = 0
            while (Class225.anInt2956 > i_2_) {
                val i_3_ = class348_sub49.readSmart(-126)
                val class110_sub1 = (Class110_Sub1().also { OutputStream_Sub1.aClass110_Sub1Array97!![i_3_] = it })
                class110_sub1.anInt1711 = class348_sub49.readUnsignedByte(255)
                class110_sub1.anInt1708 = class348_sub49.readInt((-126).toByte())
                class110_sub1.anInt5786 = Class318_Sub1_Sub2.anInt8731 + i_3_
                class110_sub1.aString5787 = class348_sub49.method3371(-13487)
                class110_sub1.aString5794 = class348_sub49.method3371(-13487)
                i_2_++
            }
            Class5_Sub1.anInt8349 = class348_sub49.readInt((-126).toByte())
            Class195.aBoolean5013 = true
        }

        @JvmStatic
        fun method570(i: Int) {
            if (i < 51) method570(-85)
            aClass114_8683 = null
            anIntArray8684 = null
            aClass356_8679 = null
        }

        @JvmStatic
        fun method572(string: String, i: Int): String {
            anInt8677++
            if (i != 23034) aClass356_8679 = null
            val i_11_ = string.length
            var i_12_ = 0
            var i_13_ = 0
            while (i_11_ > i_13_) {
                val c = string.get(i_13_)
                if (c == '<' || c == '>') i_12_ += 3
                i_13_++
            }
            val stringbuffer = StringBuffer(i_12_ + i_11_)
            for (i_14_ in 0..<i_11_) {
                val c = string.get(i_14_)
                if (c.code != 60) {
                    if (c.code != 62) stringbuffer.append(c)
                    else stringbuffer.append("<gt>")
                } else stringbuffer.append("<lt>")
            }
            return stringbuffer.toString()
        }

        @JvmStatic
        fun method573(class348_sub42: Class348_Sub42?, class348_sub42_15_: Class348_Sub42?, i: Byte) {
            try {
                if (class348_sub42!!.aClass348_Sub42_7060 != null) class348_sub42.method3162(true)
                anInt8680++
                class348_sub42.aClass348_Sub42_7060 = class348_sub42_15_
                class348_sub42.aClass348_Sub42_7063 = class348_sub42_15_!!.aClass348_Sub42_7063
                if (i.toInt() != 63) anInt8685 = 110
                class348_sub42.aClass348_Sub42_7060!!.aClass348_Sub42_7063 = class348_sub42
                class348_sub42.aClass348_Sub42_7063!!.aClass348_Sub42_7060 = class348_sub42
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, ("wd.F(" + (if (class348_sub42 != null) "{...}" else "null") + ',' + (if (class348_sub42_15_ != null) "{...}" else "null") + ',' + i + ')'))
            }
        }

        @JvmStatic
        fun method574(i: Int, i_16_: Int, i_17_: Int, `is`: IntArray?, bool: Boolean, i_18_: Byte, i_19_: Int, i_20_: Int, i_21_: Int, is_22_: IntArray?, i_23_: Int, class361: Class361?, i_24_: Int, i_25_: Int, i_26_: Int): Int {
            try {
                for (i_27_ in 0..127) {
                    for (i_28_ in 0..127) {
                        r.anIntArrayArray9723!![i_27_]!![i_28_] = 0
                        Class223.anIntArrayArray2900!![i_27_]!![i_28_] = 99999999
                    }
                }
                anInt8676++
                val bool_29_: Boolean
                if (i_16_ != 1) {
                    if (i_16_ == 2) bool_29_ = Class263.method2007(i_19_, -125, i_23_, class361!!, i, i_21_, i_24_, i_17_, i_25_, i_20_, i_26_)
                    else bool_29_ = Class189.method1420(i_24_, i_26_, -73, i_21_, i_17_, i, i_20_, i_25_, i_16_, class361!!, i_19_, i_23_)
                } else bool_29_ = Class5_Sub1.method187(i, i_23_, i_21_, i_26_, i_25_, i_24_, class361!!, i_19_, i_17_, i_20_, 1109655552)
                val i_30_ = i_20_ - 64
                val i_31_ = i_21_ + -64
                var i_32_ = Class348_Sub40_Sub30.anInt9388
                var i_33_ = Class115.anInt1753
                if (!bool_29_) {
                    if (!bool) return -1
                    var i_34_ = 2147483647
                    var i_35_ = 2147483647
                    val i_36_ = 10
                    var i_37_ = -i_36_ + i
                    while (i - -i_36_ >= i_37_) {
                        for (i_38_ in i_23_ - i_36_..i_23_ - -i_36_) {
                            val i_39_ = i_37_ - i_30_
                            val i_40_ = -i_31_ + i_38_
                            if (i_39_ >= 0 && i_40_ >= 0 && i_39_ < 128 && i_40_ < 128 && (Class223.anIntArrayArray2900!![i_39_]!![i_40_] < 100)) {
                                var i_41_ = 0
                                if (i <= i_37_) {
                                    if (-1 + i_24_ + i < i_37_) i_41_ = i_37_ - -1 - (i + i_24_)
                                } else i_41_ = -i_37_ + i
                                var i_42_ = 0
                                if (i_38_ >= i_23_) {
                                    if (i_17_ + (i_23_ - 1) < i_38_) i_42_ = -i_17_ - i_23_ - (-1 - i_38_)
                                } else i_42_ = -i_38_ + i_23_
                                val i_43_ = i_41_ * i_41_ + i_42_ * i_42_
                                if (i_43_ < i_34_ || i_34_ == i_43_ && ((Class223.anIntArrayArray2900!![i_39_]!![i_40_]) < i_35_)) {
                                    i_34_ = i_43_
                                    i_32_ = i_37_
                                    i_35_ = (Class223.anIntArrayArray2900!![i_39_]!![i_40_])
                                    i_33_ = i_38_
                                }
                            }
                        }
                        i_37_++
                    }
                    if (i_34_ == 2147483647) return -1
                }
                if (i_20_ == i_32_ && i_33_ == i_21_) return 0
                var i_44_ = 0
                if (i_18_.toInt() != 120) aClass114_8683 = null
                Class367_Sub11.anIntArray7397!![i_44_] = i_32_
                Class205.anIntArray2694!![i_44_++] = i_33_
                var i_46_: Int
                var i_45_ = (r.anIntArrayArray9723!![i_32_ + -i_30_]!![-i_31_ + i_33_].also { i_46_ = it })
                while (i_32_ != i_20_ || i_33_ != i_21_) {
                    if (i_46_ != i_45_) {
                        Class367_Sub11.anIntArray7397!![i_44_] = i_32_
                        i_46_ = i_45_
                        Class205.anIntArray2694!![i_44_++] = i_33_
                    }
                    if ((i_45_ and 0x2) == 0) {
                        if ((0x8 and i_45_) != 0) i_32_--
                    } else i_32_++
                    if ((0x1 and i_45_) == 0) {
                        if ((0x4 and i_45_) != 0) i_33_--
                    } else i_33_++
                    i_45_ = r.anIntArrayArray9723!![-i_30_ + i_32_]!![i_33_ + -i_31_]
                }
                var i_47_ = 0
                while (i_44_-- > 0) {
                    is_22_!![i_47_] = Class367_Sub11.anIntArray7397!![i_44_]
                    `is`!![i_47_++] = Class205.anIntArray2694!![i_44_]
                    if (is_22_.size <= i_47_) break
                }
                return i_47_
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, ("wd.B(" + i + ',' + i_16_ + ',' + i_17_ + ',' + (if (`is` != null) "{...}" else "null") + ',' + bool + ',' + i_18_ + ',' + i_19_ + ',' + i_20_ + ',' + i_21_ + ',' + (if (is_22_ != null) "{...}" else "null") + ',' + i_23_ + ',' + (if (class361 != null) "{...}" else "null") + ',' + i_24_ + ',' + i_25_ + ',' + i_26_ + ')'))
            }
        }
    }
}
