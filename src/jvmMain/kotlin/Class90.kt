import Class348_Sub40_Sub22.Companion.method3111

/* Class90 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
object Class90 {
    @JvmField
    var aClass273_1512: Class273? = Class273("", 15)
    @JvmField
    var anInt1513: Int = 0
    @JvmField
    var anInt1514: Int = 0
    @JvmField
    var anInt1515: Int = 0
    var aLong1516: Long = 0
    @JvmField
    var regionTileY: Int = 0
    var anIntArray1518: IntArray? = IntArray(14)

    @JvmStatic
    fun method852(i: Int) {
        aClass273_1512 = null
        if (i != 6) aLong1516 = 20L
        anIntArray1518 = null
    }

    fun method853(i: Byte) {
        anInt1515++
        val i_0_ = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255)
        val i_1_ = Class299.aClass348_Sub49_Sub2_3813!!.readShortAddLittle(-121)
        val bool = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(i + 156) == 1
        val i_2_ = Class299.aClass348_Sub49_Sub2_3813!!.readShortAdd(i + -172)
        Class312.anInt3931 = Class299.aClass348_Sub49_Sub2_3813!!.readByteAdd((-112).toByte())
        Class322.method2554((-45).toByte())
        method3111(125, i_0_)
        Class299.aClass348_Sub49_Sub2_3813!!.startBitAccess(-122)
        for (i_3_ in 0..3) {
            var i_4_ = 0
            while ((Class367_Sub4.anInt7319 shr 3 > i_4_)) {
                var i_5_ = 0
                while ((i_5_ < Class348_Sub40_Sub3.anInt9109 shr 3)) {
                    val i_6_ = Class299.aClass348_Sub49_Sub2_3813!!.readBits((-24).toByte(), 1)
                    if (i_6_ != 1) Class62.anIntArrayArrayArray1116!![i_3_]!![i_4_]!![i_5_] = -1
                    else Class62.anIntArrayArrayArray1116!![i_3_]!![i_4_]!![i_5_] = Class299.aClass348_Sub49_Sub2_3813!!.readBits((-24).toByte(), 26)
                    i_5_++
                }
                i_4_++
            }
        }
        Class299.aClass348_Sub49_Sub2_3813!!.stopBitAccess(false)
        var i_7_ = (-Class299.aClass348_Sub49_Sub2_3813!!.anInt7197 + Class348_Sub40_Sub25.anInt9341) / 16
        Class239_Sub6.anIntArrayArray5894 = Array<IntArray?>(i_7_) { IntArray(4) }
        var i_8_ = 0
        if (i.toInt() != 99) method852(-55)
        while ( /**/i_8_ < i_7_) {
            for (i_9_ in 0..3) Class239_Sub6.anIntArrayArray5894!![i_8_]!![i_9_] = Class299.aClass348_Sub49_Sub2_3813!!.readInt((-126).toByte())
            i_8_++
        }
        Class322.anIntArray4031 = null
        Applet_Sub1.anIntArray38 = IntArray(i_7_)
        r.anIntArray9724 = IntArray(i_7_)
        aa_Sub1.anIntArray5192 = IntArray(i_7_)
        Class348_Sub23_Sub3.anIntArray9042 = IntArray(i_7_)
        Class295.anIntArray3759 = IntArray(i_7_)
        Class348_Sub50.aByteArrayArray7212 = null
        Class348_Sub23_Sub1.aByteArrayArray8996 = arrayOfNulls<ByteArray>(i_7_)
        Class129.aByteArrayArray1887 = arrayOfNulls<ByteArray>(i_7_)
        Class14_Sub4.aByteArrayArray8642 = arrayOfNulls<ByteArray>(i_7_)
        Class347.aByteArrayArray4281 = arrayOfNulls<ByteArray>(i_7_)
        i_7_ = 0
        for (i_10_ in 0..3) {
            var i_11_ = 0
            while ((Class367_Sub4.anInt7319 shr 3 > i_11_)) {
                for (i_12_ in 0..<(Class348_Sub40_Sub3.anInt9109 shr 3)) {
                    val i_13_ = (Class62.anIntArrayArrayArray1116!![i_10_]!![i_11_]!![i_12_])
                    if (i_13_ != -1) {
                        val i_14_ = i_13_ shr 14 and 0x3ff
                        val i_15_ = (i_13_ and 0x3ff9) shr 3
                        var i_16_ = i_15_ / 8 + (i_14_ / 8 shl 8)
                        var i_17_ = 0
                        while (i_7_ > i_17_) {
                            if (i_16_ == Class348_Sub23_Sub3.anIntArray9042!![i_17_]) {
                                i_16_ = -1
                                break
                            }
                            i_17_++
                        }
                        if (i_16_ != -1) {
                            Class348_Sub23_Sub3.anIntArray9042!![i_7_] = i_16_
                            val i_18_ = 0xff and (i_16_ shr 8)
                            val i_19_ = 0xff and i_16_
                            aa_Sub1.anIntArray5192!![i_7_] = (Class367_Sub10.aClass45_7382!!.method417("m" + i_18_ + "_" + i_19_, Class348_Sub21.method2955(i.toInt(), 99)))
                            Applet_Sub1.anIntArray38!![i_7_] = Class367_Sub10.aClass45_7382!!.method417("l" + i_18_ + "_" + i_19_, 0)
                            Class295.anIntArray3759!![i_7_] = (Class367_Sub10.aClass45_7382!!.method417("um" + i_18_ + "_" + i_19_, 0))
                            r.anIntArray9724!![i_7_] = (Class367_Sub10.aClass45_7382!!.method417("ul" + i_18_ + "_" + i_19_, 0))
                            i_7_++
                        }
                    }
                }
                i_11_++
            }
        }
        Class348_Sub41.method3157(i_1_, 124.toByte(), i_2_, 11, bool)
    }

    fun method854(i: Byte) {
        anInt1513++
        if (Class225.anInt2955 == 5 && i < -48) Class225.anInt2955 = 6
    }
}
