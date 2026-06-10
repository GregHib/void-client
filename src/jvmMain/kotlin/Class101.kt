/* Class101 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
public abstract class Class101 {
    abstract fun method890(`is`: IntArray)

    abstract fun method891(i: Int, i_0_: Int, i_1_: Int)

    abstract fun method892(i: Int, i_2_: Int, i_3_: Int, `is`: IntArray)

    abstract fun method894(i: Int, i_12_: Int, i_13_: Int)

    abstract fun method895(i: Int)

    abstract fun method896(i: Int)

    abstract fun method897(i: Int, i_14_: Int, i_15_: Int, `is`: IntArray)

    abstract fun method898(class101_16_: Class101?)

    abstract fun method899(i: Int)

    abstract fun method900(i: Int)

    abstract fun method902(i: Int)

    abstract fun method903(i: Int, i_19_: Int, i_20_: Int, i_21_: Int, i_22_: Int, i_23_: Int)

    abstract fun method905(i: Int, i_27_: Int, i_28_: Int, `is`: IntArray)

    abstract fun method907(): Class101?

    abstract fun method908(i: Int)

    abstract fun method910()

    companion object {
        @JvmField
        var anIntArray1593: IntArray? = IntArray(1)
        @JvmField
        var anInt1594: Int = 0
        @JvmField
        var anInt1595: Int = 0
        @JvmField
        var anInt1596: Int = 0
        @JvmField
        var anInt1597: Int = 0
        @JvmField
        var anInt1598: Int = 0
        @JvmField
        var anInt1599: Int = 0

        @JvmStatic
        fun method893(i: Byte) {
            Class348_Sub40_Sub22.method3111(91, Class316.aClass348_Sub51_3959!!.aClass239_Sub6_7226!!.method1743(-32350))
            anInt1595++
            val i_4_ = ((Class286_Sub4.anInt6246 shr 12) - -(za_Sub2.regionTileX shr 3))
            val i_5_ = ((Class90.regionTileY shr 3) + (Class59_Sub2_Sub2.anInt8685 shr 12))
            Class132.aPlayer_1907!!.plane = 0.toByte()
            Class355.anInt4372 = Class132.aPlayer_1907!!.plane.toInt()
            Class132.aPlayer_1907!!.method2449(8, 8, 118.toByte())
            if (i.toInt() != -49) anInt1597 = 115
            var i_6_ = 18
            Class322.anIntArray4031 = IntArray(i_6_)
            Class348_Sub50.aByteArrayArray7212 = arrayOfNulls<ByteArray>(i_6_)
            Class239_Sub6.anIntArrayArray5894 = Array<IntArray?>(i_6_) { IntArray(4) }
            aa_Sub1.anIntArray5192 = IntArray(i_6_)
            Class14_Sub4.aByteArrayArray8642 = arrayOfNulls<ByteArray>(i_6_)
            Class348_Sub23_Sub3.anIntArray9042 = IntArray(i_6_)
            r.anIntArray9724 = IntArray(i_6_)
            Class295.anIntArray3759 = IntArray(i_6_)
            Class347.aByteArrayArray4281 = arrayOfNulls<ByteArray>(i_6_)
            Applet_Sub1.anIntArray38 = IntArray(i_6_)
            Class348_Sub23_Sub1.aByteArrayArray8996 = arrayOfNulls<ByteArray>(i_6_)
            Class129.aByteArrayArray1887 = arrayOfNulls<ByteArray>(i_6_)
            i_6_ = 0
            var i_7_ = (i_4_ + -(Class367_Sub4.anInt7319 shr 4)) / 8
            while ((i_4_ - -(Class367_Sub4.anInt7319 shr 4)) / 8 >= i_7_) {
                var i_8_ = (-(Class348_Sub40_Sub3.anInt9109 shr 4) + i_5_) / 8
                while (((i_5_ + (Class348_Sub40_Sub3.anInt9109 shr 4)) / 8 >= i_8_)) {
                    val i_9_ = i_8_ + (i_7_ shl 8)
                    Class348_Sub23_Sub3.anIntArray9042!![i_6_] = i_9_
                    aa_Sub1.anIntArray5192!![i_6_] = Class367_Sub10.aClass45_7382!!.method417("m" + i_7_ + "_" + i_8_, i + 49)
                    Applet_Sub1.anIntArray38!![i_6_] = Class367_Sub10.aClass45_7382!!.method417("l" + i_7_ + "_" + i_8_, 0)
                    Class322.anIntArray4031!![i_6_] = Class367_Sub10.aClass45_7382!!.method417("n" + i_7_ + "_" + i_8_, 0)
                    Class295.anIntArray3759!![i_6_] = Class367_Sub10.aClass45_7382!!.method417("um" + i_7_ + "_" + i_8_, 0)
                    r.anIntArray9724!![i_6_] = (Class367_Sub10.aClass45_7382!!.method417("ul" + i_7_ + "_" + i_8_, Class348_Sub21.method2955(i.toInt(), -49)))
                    if (Class322.anIntArray4031!![i_6_] == -1) {
                        aa_Sub1.anIntArray5192!![i_6_] = -1
                        Applet_Sub1.anIntArray38!![i_6_] = -1
                        Class295.anIntArray3759!![i_6_] = -1
                        r.anIntArray9724!![i_6_] = -1
                    }
                    i_6_++
                    i_8_++
                }
                i_7_++
            }
            var i_10_ = i_6_
            while (Class322.anIntArray4031!!.size > i_10_) {
                Class322.anIntArray4031!![i_10_] = -1
                aa_Sub1.anIntArray5192!![i_10_] = -1
                Applet_Sub1.anIntArray38!![i_10_] = -1
                Class295.anIntArray3759!![i_10_] = -1
                r.anIntArray9724!![i_10_] = -1
                i_10_++
            }
            val i_11_: Int
            if (Class240.anInt4674 != 3) i_11_ = 8
            else i_11_ = 4
            Class348_Sub41.method3157(i_5_, 123.toByte(), i_4_, i_11_, false)
        }

        @JvmStatic
        fun method901(class105s: Array<Class105?>?, i: Int) {
            try {
                anInt1599++
                Class239_Sub1.anInt5850 = class105s!!.size
                Class175.anIntArray2330 = IntArray(Class239_Sub1.anInt5850 + 10)
                Class341.aClass105Array4234 = arrayOfNulls<Class105>(Class239_Sub1.anInt5850 + 10)
                Class214.method1575(class105s, 0, Class341.aClass105Array4234!!, 0, Class239_Sub1.anInt5850)
                var i_17_ = 0
                while (Class239_Sub1.anInt5850 > i_17_) {
                    Class175.anIntArray2330!![i_17_] = Class341.aClass105Array4234!![i_17_]!!.method980()
                    i_17_++
                }
                if (i != 515880227) anInt1597 = 49
                var i_18_ = Class239_Sub1.anInt5850
                while ((i_18_ < Class341.aClass105Array4234!!.size)) {
                    Class175.anIntArray2330!![i_18_] = 12
                    i_18_++
                }
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, ("bca.RA(" + (if (class105s != null) "{...}" else "null") + ',' + i + ')'))
            }
        }

        @JvmStatic
        fun method904(i: Int, var_ha_Sub2: ha_Sub2?, i_24_: Int, i_25_: Int, i_26_: Int): Class258_Sub3_Sub1 {
            try {
                anInt1594++
                if (i <= 42) method906(123)
                if (var_ha_Sub2!!.aBoolean7793 || (Class192.method1436(82, i_25_) && Class192.method1436(81, i_26_))) return Class258_Sub3_Sub1(var_ha_Sub2, 3553, i_24_, i_25_, i_26_)
                if (var_ha_Sub2.aBoolean7837) return Class258_Sub3_Sub1(var_ha_Sub2, 34037, i_24_, i_25_, i_26_)
                return Class258_Sub3_Sub1(var_ha_Sub2, i_24_, i_25_, i_26_, Class33.method340(i_25_, 108.toByte()), Class33.method340(i_26_, 108.toByte()))
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, ("bca.TA(" + i + ',' + (if (var_ha_Sub2 != null) "{...}" else "null") + ',' + i_24_ + ',' + i_25_ + ',' + i_26_ + ')'))
            }
        }

        @JvmStatic
        fun method906(i: Int) {
            anIntArray1593 = null
            if (i != -31777) method901(null, -89)
        }

        @JvmStatic
        fun method909(i: Int) {
            anInt1598++
            if (Class348_Sub40_Sub30.aBoolean9403 && i == 3553) {
                while (Class215.anInt2834 < Class65.aClass110_Sub1Array1146!!.size) {
                    val class110_sub1 = Class65.aClass110_Sub1Array1146!![Class215.anInt2834]
                    if (class110_sub1 == null || class110_sub1.anInt5788 != -1) Class215.anInt2834++
                    else {
                        if (Class176.aClass348_Sub26_2332 == null) Class176.aClass348_Sub26_2332 = (Class76.aClass169_1286!!.method1302(i xor 0x1967.inv(), class110_sub1.aString5794!!))
                        val i_29_ = (Class176.aClass348_Sub26_2332!!.anInt6887)
                        if (i_29_ == -1) break
                        class110_sub1.anInt5788 = i_29_
                        Class215.anInt2834++
                        Class176.aClass348_Sub26_2332 = null
                    }
                }
            }
        }
    }
}
