import Class369_Sub1.Companion.method3570

/* Class348_Sub1_Sub1 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class348_Sub1_Sub1 internal constructor(i: Int, i_0_: Int, i_1_: Int, i_2_: Int, i_3_: Int, f: Float) : Class348_Sub1(i, i_0_, i_1_, i_2_, i_3_, f) {
    override fun method2725(i: Int, i_4_: Byte, i_5_: Int, i_6_: Int) {
        this.anInt6553 = i_5_
        this.anInt6548 = i_6_
        if (i_4_.toInt() == 70) {
            anInt8809++
            this.anInt6562 = i
        }
    }

    override fun method2716(i: Int, f: Float) {
        this.aFloat6550 = f
        if (i != -1) aClass60_8807 = null
        anInt8803++
    }

    companion object {
        @JvmField
        var aSArray8801: Array<s?>? = null
        @JvmField
        var anInt8802: Int = 0
        @JvmField
        var anInt8803: Int = 0
        @JvmField
        var anInt8804: Int = 0
        @JvmField
        var aBoolean8805: Boolean = false
        @JvmField
        var anInt8806: Int = 0
        @JvmField
        var aClass60_8807: Class60?
        @JvmField
        var anInt8808: Int = 0
        @JvmField
        var anInt8809: Int = 0

        @JvmStatic
        fun method2726(i: Int, i_7_: Int, i_8_: Int): Int {
            var i_7_ = i_7_
            var i_8_ = i_8_
            if (i_8_ > i_7_) {
                val i_9_ = i_7_
                i_7_ = i_8_
                i_8_ = i_9_
            }
            if (i != -21806) Companion.method2727((-128).toByte(), null, null)
            anInt8804++
            var i_10_: Int
            while ( /**/i_8_ != 0) {
                i_10_ = i_7_ % i_8_
                i_7_ = i_8_
                i_8_ = i_10_
            }
            return i_7_
        }

        @JvmStatic
        fun method2727(i: Byte, class237_sub1: Class237_Sub1?, `is`: Array<ByteArray?>?) {
            try {
                anInt8802++
                val is_11_ = intArrayOf(-1, 0, 0, 0, 0)
                val i_12_ = 67 % ((i - 14) / 47)
                val i_13_ = `is`!!.size
                var i_14_ = 0
                while (i_13_ > i_14_) {
                    val is_15_ = `is`[i_14_]
                    if (is_15_ != null) {
                        val class348_sub49 = Class348_Sub49(is_15_)
                        val i_16_ = (Class348_Sub23_Sub3.anIntArray9042!![i_14_] shr 8)
                        val i_17_ = 0xff and Class348_Sub23_Sub3.anIntArray9042!![i_14_]
                        val i_18_ = -za_Sub2.regionTileX + i_16_ * 64
                        val i_19_ = -Class90.regionTileY + i_17_ * 64
                        method3570(false)
                        class237_sub1!!.method1681(class348_sub49, i_18_, Class348_Sub45.aClass361Array7108, Class90.regionTileY, za_Sub2.regionTileX, i_19_, 110.toByte())
                        class237_sub1.method1691(i_19_, Class348_Sub8.aHa6654, class348_sub49, is_11_, i_18_, (-126).toByte())
                        if (!class237_sub1.aBoolean3109 && i_16_ == ha.anInt4581 / 8 && (i_17_ == Class327.anInt4095 / 8) && is_11_[0] != -1) {
                            Class259.aClass305_3304 = Class30.aClass84_413!!.method823(is_11_[2], is_11_[3], is_11_[1], -66, (Class123.aClass25_1813!!), is_11_[0])
                            Class185.anInt2481 = is_11_[4]
                        }
                    }
                    i_14_++
                }
                for (i_20_ in 0..<i_13_) {
                    val i_21_ = ((Class348_Sub23_Sub3.anIntArray9042!![i_20_] shr 8) * 64 - za_Sub2.regionTileX)
                    val i_22_ = (-Class90.regionTileY + ((0xff and Class348_Sub23_Sub3.anIntArray9042!![i_20_]) * 64))
                    val is_23_ = `is`[i_20_]
                    if (is_23_ == null && Class327.anInt4095 < 800) {
                        method3570(false)
                        class237_sub1!!.method1688(i_22_, 64, 64, 125, i_21_)
                    }
                }
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, ("bg.E(" + i + ',' + (if (class237_sub1 != null) "{...}" else "null") + ',' + (if (`is` != null) "{...}" else "null") + ')'))
            }
        }

        @JvmStatic
        fun method2728(i: Byte) {
            if (i.toInt() != 9) aClass60_8807 = null
            aClass60_8807 = null
            aSArray8801 = null
        }

        init {
            aClass60_8807 = Class60(8)
        }
    }
}
