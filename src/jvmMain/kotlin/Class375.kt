/* Class375 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
internal object Class375 {
    @JvmField
    var anInt4539: Int = 0
    @JvmField
    var aBoolean4540: Boolean = false
    @JvmField
    var anInt4541: Int = 0
    @JvmField
    var aBoolean4542: Boolean = false
    @JvmField
    var aClass60_4543: Class60? = Class60(8)
    @JvmField
    var anInt4544: Int = -1
    var anInt4545: Int = -1

    @JvmStatic
    fun method3612(i: Int, class348_sub49_sub2: Class348_Sub49_Sub2?) {
        if (i < 59) Class375.method3614(-51, 64, -115, null, -96)
        for (i_0_ in 0..<Class101_Sub3.anInt5768) {
            val i_1_ = Class18.anIntArray279!![i_0_]
            val player = Class294.aPlayerArray5058!![i_1_]
            var i_2_ = class348_sub49_sub2!!.readUnsignedByte(255)
            if ((i_2_ and 0x40) != 0) i_2_ += class348_sub49_sub2.readUnsignedByte(255) shl 8
            if ((i_2_ and 0x4000) != 0) i_2_ += class348_sub49_sub2.readUnsignedByte(255) shl 16
            Class133.method1141(class348_sub49_sub2, i_1_, i_2_, 123, player)
        }
        anInt4541++
    }

    @JvmStatic
    fun method3613(i: Int) {
        if (i != 64) Class375.method3612(-7, null)
        aClass60_4543 = null
    }

    @JvmStatic
    fun method3614(i: Int, i_3_: Int, i_4_: Int, class348_sub47: Class348_Sub47?, i_5_: Int) {
        anInt4539++
        if (i_5_ != -19692) method3613(10)
        class348_sub47!!.aClass348_Sub49_Sub2_7116!!.writeInt(124.toByte(), i)
        class348_sub47!!.aClass348_Sub49_Sub2_7116!!.writeShort(107.toByte(), i_4_)
        class348_sub47!!.aClass348_Sub49_Sub2_7116!!.writeShort(107.toByte(), i_3_)
    }
}
