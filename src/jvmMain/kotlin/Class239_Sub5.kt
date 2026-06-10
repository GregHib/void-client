/* Class239_Sub5 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class239_Sub5 : Class239 {
    override fun method1710(i: Int): Int {
        anInt5892++
        if (i != 20014) return 98
        return 1
    }

    override fun method1712(i: Int, i_0_: Int) {
        this.anInt3138 = i_0_
        val i_1_ = 57 / ((i - 82) / 35)
        anInt5887++
    }

    fun method1739(i: Int): Int {
        anInt5889++
        if (i != -32350) anInt5886 = -17
        return this.anInt3138
    }

    internal constructor(class348_sub51: Class348_Sub51) : super(class348_sub51)

    internal constructor(i: Int, class348_sub51: Class348_Sub51) : super(i, class348_sub51)

    override fun method1714(i: Int, i_13_: Int): Int {
        if (i != 3) anInt5891 = -34
        anInt5884++
        return 1
    }

    override fun method1716(bool: Boolean) {
        anInt5888++
        if (bool != false) method1710(-110)
        if (this.anInt3138 != 1 && this.anInt3138 != 0) this.anInt3138 = method1710(20014)
    }

    companion object {
        @JvmField
        var anInt5884: Int = 0
        @JvmField
        var anInt5885: Int = 0
        @JvmField
        var anInt5886: Int = 0
        @JvmField
        var anInt5887: Int = 0
        @JvmField
        var anInt5888: Int = 0
        @JvmField
        var anInt5889: Int = 0
        @JvmField
        var anInt5890: Int = 0
        @JvmField
        var anInt5891: Int = 0
        @JvmField
        var anInt5892: Int = 0
        @JvmField
        var anInt5893: Int = 0

        @JvmStatic
        fun method1740(i: Int, i_2_: Int, bool: Boolean): Boolean {
            if (bool != false) return true
            anInt5890++
            return Class239_Sub26.method1833((-128).toByte(), i_2_, i) || Class348_Sub42_Sub8_Sub2.method3200(i_2_, i, 96.toByte())
        }

        @JvmStatic
        fun method1741(class348_sub49_sub2: Class348_Sub49_Sub2, i: Byte) {
            anInt5893++
            class348_sub49_sub2.startBitAccess(122)
            val i_3_ = Class348_Sub42_Sub11.anInt9591
            val player = (Player().also { Class294.aPlayerArray5058!![i_3_] = it }.also { Class132.aPlayer_1907 = it })
            player.anInt10290 = i_3_
            val i_4_ = class348_sub49_sub2.readBits((-24).toByte(), 30)
            if (i.toInt() != 118) anInt5886 = 111
            val i_5_ = (i_4_ shr 28).toByte()
            val i_6_ = i_4_ shr 14 and 0x3fff
            player.anIntArray10320!![0] = -za_Sub2.regionTileX + i_6_
            val i_7_ = 0x3fff and i_4_
            player.x = (((player.anIntArray10320!![0]) shl 9) + (player.method2436(91.toByte()) shl 8))
            player.anIntArray10317!![0] = i_7_ + -Class90.regionTileY
            player.y = (((player.anIntArray10317!![0]) shl 9) - -(player.method2436(85.toByte()) shl 8))
            player.aByte6376 = i_5_
            player.plane = player.aByte6376
            Class355.anInt4372 = player.plane.toInt()
            if (Class79.method802((player.anIntArray10317!![0]), (player.anIntArray10320!![0]), true)) player.aByte6376++
            if (Class154.aClass348_Sub49Array2105!![i_3_] != null) player.method2452(84.toByte(), (Class154.aClass348_Sub49Array2105!![i_3_]!!))
            Class328_Sub1.anInt6513 = 0
            Class286_Sub7.anIntArray6290!![Class328_Sub1.anInt6513++] = i_3_
            Class348_Sub5.aByteArray6624!![i_3_] = 0.toByte()
            Class348_Sub42_Sub4.anInt9513 = 0
            for (i_8_ in 1..2047) {
                if (i_8_ != i_3_) {
                    val i_9_ = class348_sub49_sub2.readBits((-24).toByte(), 18)
                    val i_10_ = i_9_ shr 16
                    val i_11_ = (i_9_ and 0xff78) shr 8
                    val i_12_ = i_9_ and 0xff
                    Class348_Sub17.aClass359Array6802!![i_8_] = Class359()
                    val class359 = Class348_Sub17.aClass359Array6802!![i_8_]!!
                    class359.aBoolean4426 = false
                    class359.anInt4420 = (i_11_ shl 14) + ((i_10_ shl 28) + i_12_)
                    class359.anInt4423 = 0
                    class359.anInt4425 = -1
                    Class135_Sub1.anIntArray4709!![Class348_Sub42_Sub4.anInt9513++] = i_8_
                    Class348_Sub5.aByteArray6624!![i_8_] = 0.toByte()
                }
            }
            class348_sub49_sub2.stopBitAccess(false)
        }

        @JvmStatic
        fun method1742(bool: Boolean, i: Int): Class110_Sub1? {
            if (bool != false) method1740(35, -126, false)
            anInt5885++
            if (!Class195.aBoolean5013 || Class318_Sub1_Sub2.anInt8731 > i || Class239_Sub29.anInt6151 < i) return null
            return (OutputStream_Sub1.aClass110_Sub1Array97!![i + -Class318_Sub1_Sub2.anInt8731])
        }
    }
}
