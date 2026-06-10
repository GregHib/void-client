import Class107.Companion.method1006
import Class151.Companion.method1213
import Class182.Companion.method1372
import Class253.Companion.method1922
import Class315.Companion.method2355
import Class340.Companion.method2672
import Class348_Sub17.Companion.method2929
import Class348_Sub31.Companion.method3007
import Class348_Sub40_Sub16.Companion.method3088
import Class348_Sub40_Sub17_Sub1.Companion.method3093
import Class348_Sub42_Sub16.Companion.method3255
import Class348_Sub42_Sub3.Companion.method3177
import Class348_Sub42_Sub8.Companion.method3196
import Class37.method359
import java.math.BigInteger

open class Class348_Sub49 : Class348 {
    @JvmField
    var aByteArray7154: ByteArray?
    var anInt7197: Int
    fun readByteInverse(i: Byte): Int {
        anInt7163++
        if (i.toInt() != 21) return -10
        return (-(this.aByteArray7154!![this.anInt7197++]) and 0xff)
    }

    fun readUnsignedShort(i: Int): Int {
        if (i != 842397944) return 111
        this.anInt7197 += 2
        anInt7186++
        return ((0xff and (this.aByteArray7154!![-1 + this.anInt7197]).toInt()) + ((this.aByteArray7154!![-2 + this.anInt7197]).toInt() shl 8 and 0xff00))
    }

    fun method3332(i: Byte): Long {
        if (i <= 88) return -9L
        anInt7179++
        val l = 0xffffffffL and method3359(-45).toLong()
        val l_4_ = 0xffffffffL and method3359(-99).toLong()
        return (l_4_ shl 32) + l
    }

    fun writeString(i: Byte, string: String) {
        anInt7172++
        if (i.toInt() != -5) this.aByteArray7154 = null
        val i_5_ = string.indexOf('\u0000')
        require(i_5_ < 0) { "NUL character at " + i_5_ + " - cannot pjstr" }
        this.anInt7197 += method3255(0, (this.aByteArray7154), string.length, false, string, (this.anInt7197))
        this.aByteArray7154!![this.anInt7197++] = 0.toByte()
    }

    fun method3334(i: Int): Int {
        anInt7208++
        var i_6_ = 0
        var i_7_: Int
        i_7_ = readSmart(-124)
        while (i_7_ == 32767) {
            i_6_ += 32767
            i_7_ = readSmart(-127)
        }
        val i_8_ = 112 % (i / 49)
        i_6_ += i_7_
        return i_6_
    }

    fun writeShortAdd(i: Int, i_9_: Int) {
        anInt7156++
        this.aByteArray7154!![this.anInt7197++] = (i_9_ shr 8).toByte()
        val i_10_ = -35 % ((-17 - i) / 48)
        this.aByteArray7154!![this.anInt7197++] = (128 + i_9_).toByte()
    }

    fun writeIntMiddle(i: Int, i_11_: Byte) {
        anInt7162++
        this.aByteArray7154!![this.anInt7197++] = (i shr 8).toByte()
        this.aByteArray7154!![this.anInt7197++] = i.toByte()
        this.aByteArray7154!![this.anInt7197++] = (i shr 24).toByte()
        this.aByteArray7154!![this.anInt7197++] = (i shr 16).toByte()
        if (i_11_.toInt() != 44) anInt7207 = 1
    }

    fun writeShort(i: Byte, i_12_: Int) {
        anInt7145++
        if (i.toInt() != 107) method3354(20)
        this.aByteArray7154!![this.anInt7197++] = (i_12_ shr 8).toByte()
        this.aByteArray7154!![this.anInt7197++] = i_12_.toByte()
    }

    fun method3338(i: Int, i_13_: Int) {
        this.aByteArray7154!![-4 + this.anInt7197 - i_13_] = (i_13_ shr 24).toByte()
        anInt7200++
        this.aByteArray7154!![this.anInt7197 - i_13_ - 3] = (i_13_ shr 16).toByte()
        this.aByteArray7154!![this.anInt7197 - (i_13_ - -2)] = (i_13_ shr 8).toByte()
        this.aByteArray7154!![i + (this.anInt7197 + -i_13_)] = i_13_.toByte()
    }

    fun method3339(i: Int, i_14_: Int) {
        if (i > 91) {
            this.aByteArray7154!![this.anInt7197 - i_14_ + -1] = i_14_.toByte()
            anInt7185++
        }
    }

    fun method3340(i: Int, i_15_: Int) {
        this.aByteArray7154!![this.anInt7197++] = (i_15_ shr 16).toByte()
        anInt7148++
        this.aByteArray7154!![this.anInt7197++] = (i_15_ shr 8).toByte()
        if (i == -9912) this.aByteArray7154!![this.anInt7197++] = i_15_.toByte()
    }

    fun method3341(i: Int): Byte {
        if (i != -8679) aClass223_7175 = null
        anInt7195++
        return (-128 + (this.aByteArray7154!![this.anInt7197++])).toByte()
    }

    fun readUnsignedByteSubtract(i: Byte): Int {
        anInt7174++
        val i_16_ = 27 / ((-33 - i) / 51)
        return (-(this.aByteArray7154!![this.anInt7197++]) + 128 and 0xff)
    }

    fun readIntMiddleEndian(i: Byte): Int {
        this.anInt7197 += 4
        anInt7184++
        if (i.toInt() != 82) readSmart(-12)
        return ((0xff0000 and ((this.aByteArray7154!![this.anInt7197 - 1]).toInt() shl 16)) + (((this.aByteArray7154!![this.anInt7197 - 2]).toInt() shl 24 and 0xffffff.inv()) + ((0xff and (this.aByteArray7154!![this.anInt7197 + -4]).toInt()) shl 8) + (0xff and (this.aByteArray7154!![this.anInt7197 - 3]).toInt())))
    }

    fun method3344(i: Int, bool: Boolean): Int {
        anInt7165++
        if (bool != false) this.aByteArray7154 = null
        val i_17_ = Class171.method1319(this.anInt7197, true, this.aByteArray7154!!, i)
        writeInt(93.toByte(), i_17_)
        return i_17_
    }

    fun readByteSubtract(i: Int): Byte {
        if (i != -27697) anInt7207 = -57
        anInt7138++
        return (-(this.aByteArray7154!![this.anInt7197++]) + 128).toByte()
    }

    fun readIntInverseMiddle(i: Int): Int {
        this.anInt7197 += 4
        anInt7194++
        if (i != 255) return 93
        return (((0xff and (this.aByteArray7154!![-1 + this.anInt7197]).toInt()) shl 8) + (((this.aByteArray7154!![-3 + this.anInt7197]).toInt() and 0xff) shl 24) - (-((0xff and (this.aByteArray7154!![this.anInt7197 - 4]).toInt()) shl 16) + -(0xff and (this.aByteArray7154!![this.anInt7197 - 2]).toInt())))
    }

    fun method3347(`is`: ByteArray, i: Int, i_18_: Int, i_19_: Byte) {
        anInt7183++
        for (i_20_ in -1 + i_18_ + i downTo i) `is`[i_20_] = (this.aByteArray7154!![this.anInt7197++])
        val i_21_ = -53 / ((i_19_ - -72) / 47)
    }

    fun writeIntLittle(i: Int, i_22_: Int) {
        this.aByteArray7154!![this.anInt7197++] = i_22_.toByte()
        anInt7164++
        this.aByteArray7154!![this.anInt7197++] = (i_22_ shr 8).toByte()
        this.aByteArray7154!![this.anInt7197++] = (i_22_ shr 16).toByte()
        this.aByteArray7154!![this.anInt7197++] = (i_22_ shr 24).toByte()
        val i_23_ = -32 / ((-74 - i) / 44)
    }

    fun writeShortAddLittle(i: Int, i_24_: Int) {
        if (i == 4325) {
            anInt7198++
            this.aByteArray7154!![this.anInt7197++] = (i_24_ - -128).toByte()
            this.aByteArray7154!![this.anInt7197++] = (i_24_ shr 8).toByte()
        }
    }

    fun method3350(i: Int, bool: Boolean, `is`: IntArray, i_25_: Int) {
        anInt7137++
        val i_26_ = this.anInt7197
        this.anInt7197 = i
        val i_27_ = (-i + i_25_) / 8
        var i_28_ = 0
        while (i_27_ > i_28_) {
            var i_29_ = readInt((-126).toByte())
            var i_30_ = readInt((-126).toByte())
            var i_31_ = 0
            val i_32_ = -1640531527
            var i_33_ = 32
            while (i_33_-- > 0) {
                i_29_ += (i_31_ - -`is`[i_31_ and 0x3] xor (i_30_ ushr 5 xor (i_30_ shl 4)) - -i_30_)
                i_31_ += i_32_
                i_30_ += (i_31_ - -`is`[(0x1a0b and i_31_) ushr 11] xor i_29_ + (i_29_ ushr 5 xor (i_29_ shl 4)))
            }
            this.anInt7197 -= 8
            writeInt(91.toByte(), i_29_)
            writeInt(98.toByte(), i_30_)
            i_28_++
        }
        if (bool != true) method3394(88, 83)
        this.anInt7197 = i_26_
    }

    fun readMedium(i: Int): Int {
        this.anInt7197 += 3
        anInt7203++
        if (i != -1) return -52
        return ((0xff00 and ((this.aByteArray7154!![-2 + this.anInt7197]).toInt() shl 8)) + ((((this.aByteArray7154!![-3 + this.anInt7197]).toInt() and 0xff) shl 16) - -((this.aByteArray7154!![-1 + this.anInt7197]).toInt() and 0xff)))
    }

    fun method3352(i: Int): Boolean {
        anInt7168++
        this.anInt7197 -= 4
        if (i != -25541) method3369(56.toByte())
        val i_34_ = Class171.method1319(this.anInt7197, true, this.aByteArray7154!!, 0)
        val i_35_ = readInt((-126).toByte())
        return i_35_ == i_34_
    }

    fun writeShortLittle(i: Int, i_36_: Byte) {
        this.aByteArray7154!![this.anInt7197++] = i.toByte()
        if (i_36_.toInt() != 3) this.aByteArray7154 = null
        anInt7151++
        this.aByteArray7154!![this.anInt7197++] = (i shr 8).toByte()
    }

    fun readShortAdd(i: Int): Int {
        anInt7158++
        val i_38_ = -108 / ((i - 73) / 50)
        this.anInt7197 += 2
        return (((this.aByteArray7154!![-2 + this.anInt7197]).toInt() shl 8 and 0xff00) - -(0xff and -128 + (this.aByteArray7154!![this.anInt7197 + -1])))
    }

    fun writeIntInverseMiddle(i: Int, i_39_: Int) {
        anInt7190++
        this.aByteArray7154!![this.anInt7197++] = (i shr 16).toByte()
        this.aByteArray7154!![this.anInt7197++] = (i shr 24).toByte()
        this.aByteArray7154!![this.anInt7197++] = i.toByte()
        if (i_39_ != -4086) readShort(24)
        this.aByteArray7154!![this.anInt7197++] = (i shr 8).toByte()
    }

    fun method3357(i: Int, l: Long, i_40_: Byte) {
        var i = i
        try {
            anInt7193++
            require(!(--i < 0 || i > 7))
            val i_41_ = 101 % ((-11 - i_40_) / 49)
            var i_42_ = 8 * i
            while (i_42_ >= 0) {
                this.aByteArray7154!![this.anInt7197++] = (l shr i_42_).toInt().toByte()
                i_42_ -= 8
            }
        } catch (runtimeexception: RuntimeException) {
            throw method2929(runtimeexception, ("cea.JB(" + i + ',' + l + ',' + i_40_ + ')'))
        }
    }

    fun readShortAddLittle(i: Int): Int {
        anInt7181++
        if (i > -105) this.aByteArray7154 = null
        this.anInt7197 += 2
        return (((this.aByteArray7154!![this.anInt7197 + -2]) - 128 and 0xff) + ((this.aByteArray7154!![-1 + this.anInt7197]).toInt() shl 8 and 0xff00))
    }

    fun method3359(i: Int): Int {
        if (i > -17) aLongArray7206 = null
        anInt7188++
        this.anInt7197 += 4
        return (((this.aByteArray7154!![-3 + this.anInt7197]).toInt() shl 8 and 0xff00) + ((this.aByteArray7154!![this.anInt7197 - 1]).toInt() shl 24 and 0xffffff.inv()) + (((0xff and (this.aByteArray7154!![this.anInt7197 + -2]).toInt()) shl 16) + ((this.aByteArray7154!![-4 + this.anInt7197]).toInt() and 0xff)))
    }

    fun method3360(i: Byte) {
        if (this.aByteArray7154 != null) Class37.method357(0, this.aByteArray7154!!)
        anInt7177++
        this.aByteArray7154 = null
        if (i.toInt() != -69) method3344(-115, true)
    }

    fun readByteInverse(i: Int): Byte {
        anInt7150++
        if (i != -622951480) aClass223_7175 = null
        return (-this.aByteArray7154!![this.anInt7197++]).toByte()
    }

    fun method3362(i: Byte): Int {
        anInt7155++
        val i_43_ = ((this.aByteArray7154!![this.anInt7197]).toInt() and 0xff)
        if (i.toInt() != 77) readByte(-48)
        if (i_43_ < 128) return -64 + readUnsignedByte(255)
        return readUnsignedShort(i.toInt() xor 0x3235f8b5) - 49152
    }

    fun method3363(i: Int): Int {
        this.anInt7197 += 3
        anInt7144++
        if (i != -13309) method3379(94, 83)
        return (((this.aByteArray7154!![this.anInt7197 - 3]).toInt() and 0xff) + (((this.aByteArray7154!![-2 + this.anInt7197]).toInt() shl 8 and 0xff00) + ((this.aByteArray7154!![-1 + this.anInt7197]).toInt() shl 16 and 0xff0000)))
    }

    fun readIntLittle(i: Byte): Int {
        if (i > -117) this.anInt7197 = 61
        this.anInt7197 += 4
        anInt7167++
        return ((0xff and (this.aByteArray7154!![this.anInt7197 - 4]).toInt()) + (((0xff and (this.aByteArray7154!![-3 + this.anInt7197]).toInt()) shl 8) + (0xffffff.inv() and ((this.aByteArray7154!![this.anInt7197 - 1]).toInt() shl 24)) + (((this.aByteArray7154!![this.anInt7197 - 2]).toInt() and 0xff) shl 16)))
    }

    fun readLong(i: Int): Long {
        anInt7149++
        if (i != -456577760) return 14L
        val l = 0xffffffffL and readInt((-126).toByte()).toLong()
        val l_44_ = readInt((-126).toByte()).toLong() and 0xffffffffL
        return l_44_ + (l shl 32)
    }

    fun method3366(i: Byte): Int {
        anInt7170++
        var i_45_ = (this.aByteArray7154!![this.anInt7197++]).toInt()
        var i_46_ = 0
        if (i < 23) return -99
        while ( /**/i_45_ < 0) {
            i_46_ = (0x7f and i_45_ or i_46_) shl 7
            i_45_ = (this.aByteArray7154!![this.anInt7197++]).toInt()
        }
        return i_46_ or i_45_
    }

    fun method3367(i: Int, `is`: IntArray, i_47_: Int, i_48_: Int) {
        anInt7178++
        val i_49_ = this.anInt7197
        this.anInt7197 = i_47_
        val i_50_ = (i_48_ + -i_47_) / 8
        var i_51_ = 0
        while (i_50_ > i_51_) {
            var i_52_ = readInt((-126).toByte())
            var i_53_ = readInt((-126).toByte())
            var i_54_ = -957401312
            val i_55_ = -1640531527
            var i_56_ = 32
            while (i_56_-- > 0) {
                i_53_ -= ((i_52_ shl 4 xor (i_52_ ushr 5)) + i_52_ xor i_54_ - -`is`[0x4d000003 and (i_54_ ushr 11)])
                i_54_ -= i_55_
                i_52_ -= (i_54_ - -`is`[i_54_ and 0x3] xor (i_53_ shl 4 xor (i_53_ ushr 5)) - -i_53_)
            }
            this.anInt7197 -= 8
            writeInt(113.toByte(), i_52_)
            writeInt(126.toByte(), i_53_)
            i_51_++
        }
        if (i == 607818341) this.anInt7197 = i_49_
    }

    fun method3368(i: Int, i_57_: Int): Long {
        var i = i
        i--
        anInt7191++
        require(!(i < 0 || i > 7))
        if (i_57_ != 3060) return 99L
        var i_58_ = 8 * i
        var l = 0L
        while ( /**/i_58_ >= 0) {
            l = l or (((this.aByteArray7154!![this.anInt7197++]).toLong() and 0xffL) shl i_58_)
            i_58_ -= 8
        }
        return l
    }

    fun method3369(i: Byte): Int {
        if (i.toInt() != 125) return 100
        anInt7139++
        this.anInt7197 += 3
        var i_59_ = (((this.aByteArray7154!![this.anInt7197 - 1]).toInt() and 0xff) + ((0xff0000 and ((this.aByteArray7154!![this.anInt7197 + -3]).toInt() shl 16)) + ((0xff and (this.aByteArray7154!![this.anInt7197 + -2]).toInt()) shl 8)))
        if (i_59_ > 8388607) i_59_ -= 16777216
        return i_59_
    }

    fun writeByteSubtract(i: Byte, i_60_: Int) {
        val i_61_ = -4 % ((-35 - i) / 33)
        anInt7142++
        this.aByteArray7154!![this.anInt7197++] = (-i_60_ + 128).toByte()
    }

    fun method3371(i: Int): String {
        anInt7152++
        val i_62_ = (this.aByteArray7154!![this.anInt7197++])
        check(i_62_.toInt() == 0) { "Bad version number in gjstr2" }
        val i_63_ = this.anInt7197
        while ((this.aByteArray7154!![this.anInt7197++]).toInt() != 0) {
            /* empty */
        }
        val i_64_ = this.anInt7197 - (i_63_ + 1)
        if (i != -13487) writeInt(10.toByte(), -125)
        if (i_64_ == 0) return ""
        return Class367_Sub8.method3546(this.aByteArray7154!!, 0, i_64_, i_63_)
    }

    fun readShort(i: Int): Int {
        anInt7204++
        this.anInt7197 += 2
        var i_65_ = (((this.aByteArray7154!![this.anInt7197 - 1]).toInt() and 0xff) + (((this.aByteArray7154!![-2 + this.anInt7197]).toInt() and 0xff) shl 8))
        if (i_65_ > 32767) i_65_ -= 65536
        return i_65_
    }

    fun readShortLittle(bool: Boolean): Int {
        if (bool != false) return 113
        anInt7171++
        this.anInt7197 += 2
        return ((0xff00 and ((this.aByteArray7154!![this.anInt7197 - 1]).toInt() shl 8)) + ((this.aByteArray7154!![-2 + this.anInt7197]).toInt() and 0xff))
    }

    fun writeByteInverse(i: Byte, i_66_: Int) {
        this.aByteArray7154!![this.anInt7197++] = (-i_66_).toByte()
        if (i >= -27) this.aByteArray7154 = null
        anInt7140++
    }

    fun method3375(i: Byte): Int {
        anInt7187++
        this.anInt7197 += 2
        var i_67_ = ((0xff and -128 + (this.aByteArray7154!![this.anInt7197 - 1])) + (((this.aByteArray7154!![-2 + this.anInt7197]).toInt() and 0xff) shl 8))
        if (i.toInt() != 84) return 85
        if (i_67_ > 32767) i_67_ -= 65536
        return i_67_
    }

    fun readString(i: Byte): String {
        anInt7166++
        val i_68_ = -81 / ((i - 30) / 52)
        val i_69_ = this.anInt7197
        while ((this.aByteArray7154!![this.anInt7197++]).toInt() != 0) {
            /* empty */
        }
        val i_70_ = -1 + this.anInt7197 - i_69_
        if (i_70_ == 0) return ""
        return Class367_Sub8.method3546(this.aByteArray7154!!, 0, i_70_, i_69_)
    }

    fun writeByte(bool: Boolean, i: Int) {
        anInt7160++
        this.aByteArray7154!![this.anInt7197++] = i.toByte()
        if (bool != false) this.anInt7197 = -121
    }

    fun writeBytes(i: Int, i_73_: Int, `is`: ByteArray, i_74_: Int) {
        var i_75_ = i_73_
        while (i_73_ + i > i_75_) {
            this.aByteArray7154!![this.anInt7197++] = `is`[i_75_]
            i_75_++
        }
        val i_76_ = -41 % ((8 - i_74_) / 52)
        anInt7199++
    }

    fun method3381(i: Int, i_77_: Int) {
        anInt7180++
        if (i_77_ >= 0 && i_77_ < 128) writeByte(false, i_77_)
        else if (i_77_ >= 0 && i_77_ < 32768) writeShort(107.toByte(), i_77_ + 32768)
        else require(i != 5537)
    }

    fun readSmart(i: Int): Int {
        if (i > -116) return -4
        anInt7176++
        val i_78_ = 0xff and (this.aByteArray7154!![this.anInt7197]).toInt()
        if (i_78_ < 128) return readUnsignedByte(255)
        return readUnsignedShort(842397944) + -32768
    }

    fun method3383(i: Int, i_79_: Int) {
        anInt7157++
        this.aByteArray7154!![-2 + -i_79_ + this.anInt7197] = (i_79_ shr 8).toByte()
        this.aByteArray7154!![this.anInt7197 - i_79_ + -1] = i_79_.toByte()
    }

    fun method3384(i: Int): String? {
        anInt7205++
        if (i <= 105) aLongArray7206 = null
        if ((this.aByteArray7154!![this.anInt7197]).toInt() == 0) {
            this.anInt7197++
            return null
        }
        return readString(92.toByte())
    }

    fun readInt(i: Byte): Int {
        anInt7196++
        this.anInt7197 += 4
        if (i.toInt() != -126) method3368(-61, -64)
        return ((0xff and (this.aByteArray7154!![this.anInt7197 - 1]).toInt()) + ((((this.aByteArray7154!![-4 + this.anInt7197]).toInt() and 0xff) shl 24) + (0xff0000 and ((this.aByteArray7154!![-3 + this.anInt7197]).toInt() shl 16))) - -(((this.aByteArray7154!![-2 + this.anInt7197]).toInt() and 0xff) shl 8))
    }

    fun method3386(string: String, i: Int) {
        anInt7182++
        val i_80_ = -21 % ((42 - i) / 52)
        val i_81_ = string.indexOf('\u0000')
        require(i_81_ < 0) { "NUL character at " + i_81_ + " - cannot pjstr2" }
        this.aByteArray7154!![this.anInt7197++] = 0.toByte()
        this.anInt7197 += method3255(0, (this.aByteArray7154), string.length, false, string, (this.anInt7197))
        this.aByteArray7154!![this.anInt7197++] = 0.toByte()
    }

    fun readUnsignedByte(i: Int): Int {
        anInt7153++
        return ((this.aByteArray7154!![this.anInt7197++]).toInt() and 0xff)
    }

    fun readByte(i: Int): Byte {
        if (i >= -75) writeByteAdd((-18).toByte(), -24)
        anInt7143++
        return (this.aByteArray7154!![this.anInt7197++])
    }

    fun method3389(i: Int, i_82_: Int, i_83_: Int, `is`: ByteArray) {
        anInt7159++
        var i_84_ = i_82_
        while (i_83_ + i_82_ > i_84_) {
            `is`[i_84_] = (this.aByteArray7154!![this.anInt7197++])
            i_84_++
        }
        if (i != 2147483647) anInt7207 = -47
    }

    fun method3390(biginteger: BigInteger?, i: Byte, biginteger_85_: BigInteger?) {
        try {
            anInt7147++
            val i_86_ = this.anInt7197
            this.anInt7197 = 0
            val `is` = ByteArray(i_86_)
            method3389(2147483647, 0, i_86_, `is`)
            if (i >= -33) method3354(-73)
            val biginteger_87_ = BigInteger(`is`)
            val biginteger_88_ = biginteger_87_.modPow(biginteger_85_, biginteger)
            val is_89_ = biginteger_88_.toByteArray()
            this.anInt7197 = 0
            writeShort(107.toByte(), is_89_.size)
            writeBytes(is_89_.size, 0, is_89_, 85)
        } catch (runtimeexception: RuntimeException) {
            throw method2929(runtimeexception, ("cea.SA(" + (if (biginteger != null) "{...}" else "null") + ',' + i + ',' + (if (biginteger_85_ != null) "{...}" else "null") + ')'))
        }
    }

    fun writeInt(i: Byte, i_90_: Int) {
        this.aByteArray7154!![this.anInt7197++] = (i_90_ shr 24).toByte()
        if (i < 84) writeByteAdd((-122).toByte(), -112)
        anInt7202++
        this.aByteArray7154!![this.anInt7197++] = (i_90_ shr 16).toByte()
        this.aByteArray7154!![this.anInt7197++] = (i_90_ shr 8).toByte()
        this.aByteArray7154!![this.anInt7197++] = i_90_.toByte()
    }

    fun writeLong(l: Long, i: Byte) {
        try {
            val i_91_ = -16 % ((i - -5) / 52)
            this.aByteArray7154!![this.anInt7197++] = (l shr 56).toInt().toByte()
            anInt7209++
            this.aByteArray7154!![this.anInt7197++] = (l shr 48).toInt().toByte()
            this.aByteArray7154!![this.anInt7197++] = (l shr 40).toInt().toByte()
            this.aByteArray7154!![this.anInt7197++] = (l shr 32).toInt().toByte()
            this.aByteArray7154!![this.anInt7197++] = (l shr 24).toInt().toByte()
            this.aByteArray7154!![this.anInt7197++] = (l shr 16).toInt().toByte()
            this.aByteArray7154!![this.anInt7197++] = (l shr 8).toInt().toByte()
            this.aByteArray7154!![this.anInt7197++] = l.toInt().toByte()
        } catch (runtimeexception: RuntimeException) {
            throw method2929(runtimeexception, "cea.BB(" + l + ',' + i + ')')
        }
    }

    fun readByteAdd(i: Byte): Int {
        anInt7169++
        val i_92_ = 18 / ((-28 - i) / 40)
        return ((this.aByteArray7154!![this.anInt7197++]) - 128 and 0xff)
    }

    internal constructor(i: Int) {
        this.anInt7197 = 0
        this.aByteArray7154 = method359(i, -1)
    }

    fun method3394(i: Int, i_93_: Int) {
        this.aByteArray7154!![this.anInt7197++] = i_93_.toByte()
        anInt7141++
        this.aByteArray7154!![this.anInt7197++] = (i_93_ shr 8).toByte()
        if (i == -23892) {
            this.aByteArray7154!![this.anInt7197++] = (i_93_ shr 16).toByte()
            this.aByteArray7154!![this.anInt7197++] = (i_93_ shr 24).toByte()
        }
    }

    fun writeByteAdd(i: Byte, i_94_: Int) {
        anInt7192++
        this.aByteArray7154!![this.anInt7197++] = (i_94_ + 128).toByte()
        val i_95_ = -21 % ((-8 - i) / 57)
    }

    fun method3396(i: Int, i_96_: Int) {
        if (i_96_ > -5) aClass223_7175 = null
        anInt7146++
        if ((i and 0x7f.inv()) != 0) {
            if ((i and 0x3fff.inv()) != 0) {
                if ((0x1fffff.inv() and i) != 0) {
                    if ((i and 0xfffffff.inv()) != 0) writeByte(false, 0x80 or (i ushr 28))
                    writeByte(false, 0x80 or (i ushr 21))
                }
                writeByte(false, (0x2000f4 or i) ushr 14)
            }
            writeByte(false, 0x80 or (i ushr 7))
        }
        writeByte(false, i and 0x7f)
    }

    fun method3397(i: Int, i_97_: Int) {
        anInt7189++
        this.aByteArray7154!![this.anInt7197++] = i_97_.toByte()
        this.aByteArray7154!![this.anInt7197++] = (i_97_ shr 8).toByte()
        if (i < 22) readUnsignedByte(6)
    }

    internal constructor(`is`: ByteArray?) {
        this.aByteArray7154 = `is`
        this.anInt7197 = 0
    }

    companion object {
        var anInt7137: Int = 0
        var anInt7138: Int = 0
        var anInt7139: Int = 0
        var anInt7140: Int = 0
        var anInt7141: Int = 0
        var anInt7142: Int = 0
        var anInt7143: Int = 0
        var anInt7144: Int = 0
        var anInt7145: Int = 0
        var anInt7146: Int = 0
        var anInt7147: Int = 0
        var anInt7148: Int = 0
        var anInt7149: Int = 0
        var anInt7150: Int = 0
        var anInt7151: Int = 0
        var anInt7152: Int = 0
        var anInt7153: Int = 0
        var anInt7155: Int = 0
        var anInt7156: Int = 0
        var anInt7157: Int = 0
        var anInt7158: Int = 0
        var anInt7159: Int = 0
        var anInt7160: Int = 0
        var anInt7161: Int = 0
        var anInt7162: Int = 0
        var anInt7163: Int = 0
        var anInt7164: Int = 0
        var anInt7165: Int = 0
        var anInt7166: Int = 0
        var anInt7167: Int = 0
        var anInt7168: Int = 0
        var anInt7169: Int = 0
        var anInt7170: Int = 0
        var anInt7171: Int = 0
        var anInt7172: Int = 0
        var anInt7173: Int = 0
        var anInt7174: Int = 0
        var aClass223_7175: Class223? = Class223(1, 2)
        var anInt7176: Int = 0
        var anInt7177: Int = 0
        var anInt7178: Int = 0
        var anInt7179: Int = 0
        var anInt7180: Int = 0
        var anInt7181: Int = 0
        var anInt7182: Int = 0
        var anInt7183: Int = 0
        var anInt7184: Int = 0
        var anInt7185: Int = 0
        var anInt7186: Int = 0
        var anInt7187: Int = 0
        var anInt7188: Int = 0
        var anInt7189: Int = 0
        var anInt7190: Int = 0
        var anInt7191: Int = 0
        var anInt7192: Int = 0
        var anInt7193: Int = 0
        var anInt7194: Int = 0
        var anInt7195: Int = 0
        var anInt7196: Int = 0
        var anInt7198: Int = 0
        var anInt7199: Int = 0
        var anInt7200: Int = 0
        var anInt7201: Int = 0
        var anInt7202: Int = 0
        var anInt7203: Int = 0
        var anInt7204: Int = 0
        var anInt7205: Int = 0
        var aLongArray7206: LongArray? = LongArray(32)
        var anInt7207: Int = 0
        var anInt7208: Int = 0
        var anInt7209: Int = 0

        fun method3331(i: Int, i_0_: Byte, i_1_: Int): Int {
            var i = i
            var i_1_ = i_1_
            anInt7161++
            var i_2_ = 1
            while ( /**/i > 1) {
                if ((0x1 and i) != 0) i_2_ *= i_1_
                i_1_ *= i_1_
                i = i shr 1
            }
            val i_3_ = 3 / ((i_0_ - -24) / 46)
            if (i == 1) return i_2_ * i_1_
            return i_2_
        }

        fun method3354(i: Int) {
            if (Class348_Sub34.aHa6968 != null) {
                Class348_Sub34.aHa6968!!.method3635((-44).toByte())
                Class348_Sub40_Sub9.aClass324_9173 = null
                Class348_Sub34.aHa6968 = null
            }
            val i_37_ = -97 % ((i - -14) / 37)
            anInt7173++
        }

        @JvmStatic
        fun method3376(i: Int) {
            aLongArray7206 = null
            aClass223_7175 = null
            if (i != -2) method3376(-87)
        }

        fun method3379(i: Int, i_71_: Int) {
            anInt7201++
            if (i_71_ != Class240.anInt4674) {
                if (i_71_ == 13) {
                    if (Class348_Sub23_Sub3.aString9043 != null) Class135_Sub2.method1157(RuntimeException_Sub1.anInt4596, (-81).toByte())
                    else method1922(Class186.aString2496, RuntimeException_Sub1.anInt4596, Class64_Sub3.aString5600, true)
                }
                if (i_71_ != 13 && Class213.aClass238_2773 != null) {
                    Class213.aClass238_2773!!.method1700(36.toByte())
                    Class213.aClass238_2773 = null
                }
                if (i_71_ == 3) Class348_Sub42_Sub8.method3198((Class285.anInt4737 != r.anInt9721), (-45).toByte())
                if (i_71_ == 7) method1006((r.anInt9721 != Class54.anInt970), 102.toByte())
                if (i_71_ == 5) {
                    if (Class348_Sub23_Sub3.aString9043 == null) method1213(Class64_Sub3.aString5600, Class186.aString2496, -124)
                    else method1372(-1)
                } else if (i_71_ != 6) {
                    if (i_71_ == 9) {
                        if (Class348_Sub23_Sub3.aString9043 != null) Class135_Sub2.method1157((RuntimeException_Sub1.anInt4596), (-120).toByte())
                        else method1922(Class186.aString2496, RuntimeException_Sub1.anInt4596, Class64_Sub3.aString5600, true)
                    } else if (i_71_ == 12) {
                        if (Class348_Sub23_Sub3.aString9043 == null) method1213(Class64_Sub3.aString5600, Class186.aString2496, -98)
                        else method1372(-1)
                    }
                } else if (Class348_Sub23_Sub3.aString9043 == null) method1922(Class186.aString2496, RuntimeException_Sub1.anInt4596, Class64_Sub3.aString5600, true)
                else Class135_Sub2.method1157(RuntimeException_Sub1.anInt4596, (-99).toByte())
                if (Class318_Sub1_Sub1_Sub2.method2402(Class240.anInt4674, (-78).toByte())) {
                    Class95.aClass45_1541!!.anInt634 = 2
                    Class247.aClass45_3183!!.anInt634 = 2
                    Class94.aClass45_1538!!.anInt634 = 2
                    Class216.aClass45_4975!!.anInt634 = 2
                    Class174.aClass45_2306!!.anInt634 = 2
                    r_Sub2.aClass45_10480!!.anInt634 = 2
                    Class78.aClass45_1322!!.anInt634 = 2
                }
                if (Class318_Sub1_Sub1_Sub2.method2402(i_71_, (-119).toByte())) {
                    Class31.anInt443 = 1
                    Class36.anInt489 = 0
                    Class348_Sub46.Companion.anInt7115 = 1
                    Class154.anInt2101 = 0
                    Class268.anInt3441 = 0
                    method3177(-111, true)
                    Class95.aClass45_1541!!.anInt634 = 1
                    Class247.aClass45_3183!!.anInt634 = 1
                    Class94.aClass45_1538!!.anInt634 = 1
                    Class216.aClass45_4975!!.anInt634 = 1
                    Class174.aClass45_2306!!.anInt634 = 1
                    r_Sub2.aClass45_10480!!.anInt634 = 1
                    Class78.aClass45_1322!!.anInt634 = 1
                }
                if (i_71_ == 11 || i_71_ == 3) method3088(9)
                val bool = (i == i_71_ || method3196(i_71_, i xor 0x58.inv()) || method2672(i_71_, -100))
                val bool_72_ = (Class240.anInt4674 == 2 || method3196(Class240.anInt4674, -110) || method2672(Class240.anInt4674, -128))
                if (bool != bool_72_) {
                    if (bool) {
                        Class267.anInt3428 = Class345.anInt4270
                        if (Class316.aClass348_Sub51_3959!!.aClass239_Sub26_7245!!.method1838(-32350) != 0) {
                            method2355(Class316.aClass348_Sub51_3959!!.aClass239_Sub26_7245!!.method1838(-32350), 50.toByte(), false, Class59_Sub2_Sub1.aClass45_8667, Class345.anInt4270, 0, 2)
                            method3093(i xor 0x66)
                        } else method3007(2, 22684)
                        Class348_Sub4.aClass248_6601!!.method1892(-117, false)
                    } else {
                        method3007(2, 22684)
                        Class348_Sub4.aClass248_6601!!.method1892(i xor 0x4b.inv(), true)
                    }
                }
                if (Class318_Sub1_Sub1_Sub2.method2402(i_71_, (-64).toByte()) || i_71_ == 13) Class348_Sub8.aHa6654!!.method3673()
                Class240.anInt4674 = i_71_
            }
        }
    }
}
