/* Class348_Sub40_Sub26 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class348_Sub40_Sub26 : Class348_Sub40(1, false) {
    private var anInt9344 = 4096
    private var anInt9347 = 4096
    private var anInt9354 = 4096
    override fun method3047(i: Int, i_3_: Int): Array<IntArray?>? {
        if (i_3_ != -1564599039) return null
        anInt9353++
        val `is` = this.aClass322_7033!!.method2557(i_3_ + 1564598957, i)!!
        if (this.aClass322_7033!!.aBoolean4035) {
            val is_4_ = this.method3039((-60).toByte(), i, 0)!!
            val is_5_ = is_4_[0]!!
            val is_6_ = is_4_[1]!!
            val is_7_ = is_4_[2]!!
            val is_8_ = `is`[0]!!
            val is_9_ = `is`[1]!!
            val is_10_ = `is`[2]!!
            var i_11_ = 0
            while ((i_11_ < Class348_Sub40_Sub6.Companion.anInt9139)) {
                val i_12_ = is_5_[i_11_]
                val i_13_ = is_7_[i_11_]
                val i_14_ = is_6_[i_11_]
                if (i_13_ != i_12_ || i_13_ != i_14_) {
                    is_8_[i_11_] = anInt9344
                    is_9_[i_11_] = anInt9354
                    is_10_[i_11_] = anInt9347
                } else {
                    is_8_[i_11_] = i_12_ * anInt9344 shr 12
                    is_9_[i_11_] = anInt9354 * i_13_ shr 12
                    is_10_[i_11_] = anInt9347 * i_14_ shr 12
                }
                i_11_++
            }
        }
        return `is`
    }

    override fun method3049(class348_sub49: Class348_Sub49, i: Int, i_23_: Int) {
        do {
            try {
                val i_24_ = i
                while_201_@ do {
                    do {
                        if (i_24_ == 0) {
                            anInt9344 = class348_sub49!!.readUnsignedShort(i_23_ + 842366929)
                            break@while_201_
                        } else if (i_24_ != 1) {
                            if (i_24_ == 2) break
                            break@while_201_
                        }
                        anInt9354 = class348_sub49!!.readUnsignedShort(842397944)
                        break@while_201_
                    } while (false)
                    anInt9347 = class348_sub49!!.readUnsignedShort(842397944)
                } while (false)
                anInt9350++
                if (i_23_ == 31015) break
                method3118(96.toByte())
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, ("uf.F(" + (if (class348_sub49 != null) "{...}" else "null") + ',' + i + ',' + i_23_ + ')'))
            }
            break
        } while (false)
    }

    companion object {
        @JvmField
        var anInt9345: Int = 0
        @JvmField
        var anInt9346: Int = 0
        @JvmField
        var anInt9348: Int = 0
        @JvmField
        var anInt9349: Int = 0
        @JvmField
        var anInt9350: Int = 0
        @JvmField
        var aBooleanArray9351: BooleanArray?
        @JvmField
        var aBoolean9352: Boolean = true
        @JvmField
        var anInt9353: Int = 0
        @JvmField
        var anInt9355: Int = 0

        @JvmStatic
        fun method3118(i: Byte) {
            aBooleanArray9351 = null
            val i_0_ = 37 / ((28 - i) / 61)
        }

        @JvmStatic
        fun method3119(i: Int, i_1_: Int, i_2_: Int): Boolean {
            if (i_1_ <= 39) method3119(-106, 118, -21)
            anInt9355++
            return (i and 0xc580) != 0
        }

        @JvmStatic
        fun method3120(i: Int) {
            Class312.anInt3931 = 0
            anInt9345++
            val i_15_ = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedByteSubtract((-118).toByte())
            val i_16_ = Class299.aClass348_Sub49_Sub2_3813!!.readShortAddLittle(-117)
            val i_17_ = Class299.aClass348_Sub49_Sub2_3813!!.readShortLittle(false)
            val bool = (Class299.aClass348_Sub49_Sub2_3813!!.readByteInverse(21.toByte()) == 1)

            Class322.method2554((-45).toByte())
            Class348_Sub40_Sub22.Companion.method3111(111, i_15_)
            var i_18_: Int = (-Class299.aClass348_Sub49_Sub2_3813!!.anInt7197 + Class348_Sub40_Sub25.Companion.anInt9341) / 16
            Class239_Sub6.anIntArrayArray5894 = Array<IntArray?>(i_18_) { IntArray(4) }
            for (i_19_ in 0..<i_18_) {
                for (i_20_ in 0..3) Class239_Sub6.anIntArrayArray5894!![i_19_]!![i_20_] = Class299.aClass348_Sub49_Sub2_3813!!.readInt((-126).toByte())
            }
            Class348_Sub23_Sub1.aByteArrayArray8996 = arrayOfNulls<ByteArray>(i_18_)
            Class129.aByteArrayArray1887 = arrayOfNulls<ByteArray>(i_18_)
            aa_Sub1.anIntArray5192 = IntArray(i_18_)
            Class14_Sub4.aByteArrayArray8642 = arrayOfNulls<ByteArray>(i_18_)
            Applet_Sub1.anIntArray38 = IntArray(i_18_)
            Class348_Sub50.aByteArrayArray7212 = null
            r.anIntArray9724 = IntArray(i_18_)
            Class322.anIntArray4031 = null
            Class347.aByteArrayArray4281 = arrayOfNulls<ByteArray>(i_18_)
            if (i >= -47) anInt9349 = -54
            Class295.anIntArray3759 = IntArray(i_18_)
            Class348_Sub23_Sub3.anIntArray9042 = IntArray(i_18_)
            i_18_ = 0
            for (i_21_ in (-(Class367_Sub4.anInt7319 shr 4) + i_17_) / 8..(i_17_ + (Class367_Sub4.anInt7319 shr 4)) / 8) {
                var i_22_: Int = (i_16_ - (Class348_Sub40_Sub3.Companion.anInt9109 shr 4)) / 8
                while ((i_22_ <= ((Class348_Sub40_Sub3.Companion.anInt9109 shr 4) + i_16_) / 8)) {
                    Class348_Sub23_Sub3.anIntArray9042!![i_18_] = i_22_ + (i_21_ shl 8)
                    aa_Sub1.anIntArray5192!![i_18_] = Class367_Sub10.aClass45_7382!!.method417("m" + i_21_ + "_" + i_22_, 0)
                    Applet_Sub1.anIntArray38!![i_18_] = Class367_Sub10.aClass45_7382!!.method417("l" + i_21_ + "_" + i_22_, 0)
                    Class295.anIntArray3759!![i_18_] = Class367_Sub10.aClass45_7382!!.method417("um" + i_21_ + "_" + i_22_, 0)
                    r.anIntArray9724!![i_18_] = Class367_Sub10.aClass45_7382!!.method417("ul" + i_21_ + "_" + i_22_, 0)
                    i_18_++
                    i_22_++
                }
            }
            Class348_Sub41.method3157(i_16_, 123.toByte(), i_17_, 11, bool)
        }

        init {
            aBooleanArray9351 = BooleanArray(8)
        }
    }
}
