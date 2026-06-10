import Class369_Sub1.Companion.method3570

/* Class122 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
object Class122 {
    var aBoolean1801: Boolean = false
    @JvmField
    var anInt1802: Int = 0
    @JvmField
    var anInt1803: Int
    @JvmField
    var anInt1804: Int = 0
    @JvmField
    var anInt1805: Int = 0
    var aBooleanArray1806: BooleanArray? = BooleanArray(200)
    @JvmField
    var anInt1807: Int = 0
    @JvmField
    var aStringArray1808: Array<String?>?
    @JvmField
    var anInt1809: Int = 0

    fun method1085(i: Int, i_0_: Int, i_1_: Byte, i_2_: Int, i_3_: Int) {
        anInt1805++
        val class348_sub42_sub15 = Class318_Sub9_Sub1.method2516(i_3_, 105.toByte(), 8)
        class348_sub42_sub15.method3246(-25490)
        class348_sub42_sub15.anInt9652 = i_0_
        if (i_1_ < -57) {
            class348_sub42_sub15.anInt9650 = i
            class348_sub42_sub15.anInt9651 = i_2_
        }
    }

    @JvmStatic
    fun method1086(bool: Boolean) {
        if (bool != true) anInt1803 = -25
        aStringArray1808 = null
        aBooleanArray1806 = null
    }

    @JvmStatic
    fun method1087(i: Int, i_4_: Int, i_5_: Int): Boolean {
        if (i != 12644) Class122.method1085(55, -60, (-29).toByte(), -35, -112)
        anInt1809++
        return (0x84080 and i_5_) != 0
    }

    @JvmStatic
    fun method1088(i: Int, i_6_: Byte, i_7_: Int, i_8_: Int, i_9_: Int): Int {
        anInt1804++
        val i_10_ = -Class70.anIntArray1204!![8192 * i_8_ / i_7_] + 65536 shr 1
        if (i_6_.toInt() != 22) return -73
        return ((i_10_ * i shr 16) + (i_9_ * (65536 + -i_10_) shr 16))
    }

    fun method1089(i: Int, c: Char): Boolean {
        anInt1807++
        if (i >= -107) aBooleanArray1806 = null
        if (c.code > 0 && c.code < 128 || c.code >= 160 && c.code <= 255) return true
        if (c.code != 0) {
            val cs = Class44.aCharArray625
            var i_11_ = 0
            while (cs!!.size > i_11_) {
                val i_12_ = cs[i_11_].code
                if (c.code == i_12_) return true
                i_11_++
            }
        }
        return false
    }

    fun method1090(`is`: Array<ByteArray?>?, i: Int, class237_sub1: Class237_Sub1?) {
        try {
            anInt1802++
            val i_13_ = Class347.aByteArrayArray4281!!.size
            if (i == 65536) {
                for (i_14_ in 0..<i_13_) {
                    val is_15_ = `is`!![i_14_]
                    if (is_15_ != null) {
                        val i_16_ = (64 * (Class348_Sub23_Sub3.anIntArray9042!![i_14_] shr 8) + -za_Sub2.regionTileX)
                        val i_17_ = ((Class348_Sub23_Sub3.anIntArray9042!![i_14_] and 0xff) * 64 - Class90.regionTileY)
                        method3570(false)
                        class237_sub1!!.method1695(is_15_, (Class348_Sub45.aClass361Array7108), i_17_, Class348_Sub8.aHa6654, i_16_, i xor 0x1054f)
                    }
                }
            }
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("nga.C(" + (if (`is` != null) "{...}" else "null") + ',' + i + ',' + (if (class237_sub1 != null) "{...}" else "null") + ')'))
        }
    }

    init {
        anInt1803 = 0
        aStringArray1808 = arrayOfNulls<String>(100)
    }
}
