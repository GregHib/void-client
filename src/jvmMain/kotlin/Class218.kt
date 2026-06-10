import Class58.Companion.method536
import Class59_Sub2_Sub2.Companion.method574
import Class79.Companion.method802

/* Class218 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class218 {
    var aClass141_2851: Class141? = null
    @JvmField
    var anInt2853: Int = 0
    @JvmField
    var aBoolean2854: Boolean = false
    @JvmField
    var anInt2856: Int = 0
    fun method1593(i: Int): Boolean {
        if (i != 106) this.aClass141_2851 = null
        anInt2858++
        return this.aClass141_2851!!.aClass45_1965!!.method421(false, this.anInt2853)
    }

    private fun method1595(i: Byte, i_17_: Int, class348_sub49: Class348_Sub49) {
        anInt2852++
        if (i >= 5) {
            if (i_17_ == 1) this.anInt2853 = class348_sub49.readUnsignedShort(842397944)
            else if (i_17_ != 2) {
                if (i_17_ == 3) this.aBoolean2854 = true
                else if (i_17_ == 4) this.anInt2853 = -1
            } else this.anInt2856 = class348_sub49.readMedium(-1)
        }
    }

    fun method1596(i: Int, bool: Boolean, i_18_: Int, var_ha: ha): Class105? {
        anInt2857++
        if (i_18_ < 51) aClass114_2860 = null
        val l = (var_ha.anInt4567 shl 19 or (this.anInt2853 or (i shl 16) or (if (!bool) 0 else 262144))).toLong()
        var class105 = this.aClass141_2851!!.aClass60_1976.method583(l, -87) as Class105?
        if (class105 != null) return class105
        if (!this.aClass141_2851!!.aClass45_1965!!.method421(false, this.anInt2853)) return null
        val class207 = Class207.method1521(this.aClass141_2851!!.aClass45_1965!!, this.anInt2853, 0)
        if (class207 != null) {
            class207.anInt2700 = 0
            class207.anInt2698 = class207.anInt2700
            class207.anInt2703 = class207.anInt2698
            class207.anInt2701 = class207.anInt2703
            if (bool) class207.method1514()
            for (i_19_ in 0..<i) class207.method1520()
        }
        class105 = var_ha.method3691(class207, true)
        if (class105 != null) this.aClass141_2851!!.aClass60_1976.method582(class105, l, (-101).toByte())
        return class105
    }

    fun method1597(i: Byte, class348_sub49: Class348_Sub49) {
        anInt2850++
        while (true) {
            val i_20_ = class348_sub49.readUnsignedByte(255)
            if (i_20_ == 0) break
            method1595(61.toByte(), i_20_, class348_sub49)
        }
        if (i.toInt() != -114) aClass262_2859 = null
    }

    companion object {
        var anInt2849: Int = 0
        var anInt2850: Int = 0
        var anInt2852: Int = 0
        var anInt2855: Int = 0
        var anInt2857: Int = 0
        var anInt2858: Int = 0
        @JvmField
        var aClass262_2859: Class262? = Class262()
        var aClass114_2860: Class114?
        @JvmField
        var anInt2861: Int = 1401

        fun method1591(i: Int, i_0_: Int, i_1_: Int, i_2_: Int, i_3_: Int, i_4_: Int, i_5_: Int, i_6_: Int, i_7_: Int) {
            anInt2855++
            if (i >= 1 && i_5_ >= 1 && -2 + Class367_Sub4.anInt7319 >= i && i_5_ <= -2 + Class348_Sub40_Sub3.anInt9109) {
                var i_8_ = i_7_
                if (i_8_ < 3 && method802(i_5_, i, true)) i_8_++
                if ((Class316.aClass348_Sub51_3959!!.aClass239_Sub27_7261!!.method1840(-32350) == 0 && !method536(i_5_, false, i, Class167.anInt2204, i_8_)) || Class147.aClass357ArrayArrayArray2029 == null) return
                Class338.aClass237_Sub1_4197!!.method1694((Class348_Sub45.aClass361Array7108!![i_7_]), i_1_, i_7_, Class348_Sub8.aHa6654, i, i_5_, 106.toByte())
                if (i_3_ >= 0) {
                    val i_9_ = Class316.aClass348_Sub51_3959!!.aClass239_Sub4_7220!!.method1737(-32350)
                    Class316.aClass348_Sub51_3959!!.method3429(74.toByte(), (Class316.aClass348_Sub51_3959!!.aClass239_Sub4_7220), 1)
                    Class338.aClass237_Sub1_4197!!.method1689(i, i_7_, i_3_, Class348_Sub8.aHa6654, i_8_, 50, i_4_, i_5_, i_2_, i_6_, (Class348_Sub45.aClass361Array7108!![i_7_]))
                    Class316.aClass348_Sub51_3959!!.method3429(74.toByte(), (Class316.aClass348_Sub51_3959!!.aClass239_Sub4_7220), i_9_)
                }
            }
            if (i_0_ < 12) aClass262_2859 = null
        }

        fun method1592(i: Byte, i_10_: Int, i_11_: Int, i_12_: Int, player: Player) {
            anInt2849++
            val i_13_ = (player.anIntArray10320!![0])
            val i_14_ = (player.anIntArray10317!![0])
            if (i_13_ >= 0 && Class367_Sub4.anInt7319 > i_13_ && i_14_ >= 0 && i_14_ < Class348_Sub40_Sub3.anInt9109 && (i_12_ >= 0 && i_12_ < Class367_Sub4.anInt7319 && i_10_ >= 0 && Class348_Sub40_Sub3.anInt9109 > i_10_)) {
                val i_15_ = (method574(i_12_, player.method2436(62.toByte()), 0, Class348_Sub40_Sub11.anIntArray9185, true, 120.toByte(), -4, i_13_, i_14_, Class348_Sub42_Sub14.anIntArray9626, i_10_, (Class348_Sub45.aClass361Array7108!![(player.plane).toInt()]), 0, 0, 0))
                if (i_15_ >= 1) {
                    if (i_11_ != 4) aClass262_2859 = null
                    if (i_15_ <= 3) {
                        for (i_16_ in 0..<-1 + i_15_) player.method2451(i, Class348_Sub42_Sub14.anIntArray9626!![i_16_], i_11_ + -29038, Class348_Sub40_Sub11.anIntArray9185!![i_16_])
                    }
                }
            }
        }

        @JvmStatic
        fun method1594(i: Int) {
            aClass262_2859 = null
            if (i != -1966608624) aClass262_2859 = null
            aClass114_2860 = null
        }

        init {
            aClass114_2860 = Class114(106, 8)
        }
    }
}
