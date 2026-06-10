/* Class146 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class146 {
    @JvmField
    var anInt2016: Int = 0
    @JvmField
    var anInt2019: Int = 0
    @JvmField
    var anInt2020: Int = 0

    fun method1191(i: Int, class348_sub49: Class348_Sub49) {
        if (i == 2048) {
            anInt2018++
            while (true) {
                val i_0_ = class348_sub49.readUnsignedByte(255)
                if (i_0_ == 0) break
                method1192(i_0_, class348_sub49, 17.toByte())
            }
        }
    }

    private fun method1192(i: Int, class348_sub49: Class348_Sub49, i_1_: Byte) {
        anInt2014++
        if (i_1_.toInt() != 17) method1194(-80)
        if (i == 1) {
            this.anInt2019 = class348_sub49.readUnsignedShort(842397944)
            this.anInt2016 = class348_sub49.readUnsignedByte(255)
            this.anInt2020 = class348_sub49.readUnsignedByte(i_1_.toInt() xor 0xee)
        }
    }

    companion object {
        var anInt2012: Int = 0
        @JvmField
        var aLongArray2013: LongArray? = LongArray(10)
        var anInt2014: Int = 0
        @JvmField
        var aClass45_2015: Class45? = null
        var anInt2017: Int = 0
        var anInt2018: Int = 0
        @JvmStatic
        fun method1193(i: Int, i_2_: Int, bool: Boolean): Boolean {
            if (!bool) return true
            anInt2017++
            return (i_2_ and 0x800) != 0
        }

        @JvmStatic
        fun method1194(i: Int) {
            if (i != 10) method1193(91, -68, true)
            aLongArray2013 = null
            aClass45_2015 = null
        }
    }
}
