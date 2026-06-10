import Class33.Companion.method340
import Class50_Sub1.Companion.method462

/* Class117 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class117 {
    private var anInt1764 = 0
    var aClass356_1767: Class356? = null
    private var aClass356_1770: Class356? = null
    private var aString1774: String? = "null"
    var aChar1778: Char = 0.toChar()
    var aChar1779: Char = 0.toChar()
    private fun method1065(class348_sub49: Class348_Sub49, i: Int, i_0_: Int) {
        if (i_0_ == 1) this.aChar1778 = method462(class348_sub49.readByte(-91), -128)
        else if (i_0_ == 2) this.aChar1779 = method462(class348_sub49.readByte(-119), -128)
        else if (i_0_ == 3) aString1774 = class348_sub49.readString(86.toByte())
        else if (i_0_ == 4) anInt1764 = class348_sub49.readInt(((-126).toByte()).toByte())
        else if (i_0_ == 5 || i_0_ == 6) {
            val i_1_ = class348_sub49.readUnsignedShort(i xor 0x3235ab57.inv())
            this.aClass356_1767 = Class356(method340(i_1_, 108.toByte()))
            for (i_2_ in 0..<i_1_) {
                val i_3_ = class348_sub49.readInt(((-126).toByte()).toByte())
                val class348 = if (i_0_ != 5) Class348_Sub35(class348_sub49.readInt(((-126).toByte()).toByte()))
                else Class348_Sub50(class348_sub49.readString(((-35).toByte()).toByte()))
                aClass356_1767!!.method3483(21.toByte(), i_3_.toLong(), class348)
            }
        }
        anInt1765++
        if (i != -21424) method1068(((-15).toByte()).toByte())
    }

    fun method1066(bool: Boolean, string: String): Boolean {
        anInt1776++
        if (this.aClass356_1767 == null) return false
        if (bool != false) aClass356_1770 = null
        if (aClass356_1770 == null) method1071(true)
        var class348_sub46 = (aClass356_1770!!.method3480(Class287.method2179(string, 109.toByte()), -6008) as? Class348_Sub46)
        while (class348_sub46 != null) {
            if (class348_sub46.aString7111 == string) return true
            class348_sub46 = aClass356_1770!!.method3476(true) as? Class348_Sub46
        }
        return false
    }

    fun method1067(bool: Boolean, i: Int): Boolean {
        anInt1773++
        if (this.aClass356_1767 == null) return false
        if (bool != true) return true
        if (aClass356_1770 == null) method1068(120.toByte())
        val class348_sub35 = aClass356_1770!!.method3480(i.toLong(), -6008) as? Class348_Sub35
        return class348_sub35 != null
    }

    private fun method1068(i: Byte) {
        anInt1772++
        aClass356_1770 = Class356(aClass356_1767!!.method3475(true))
        var class348_sub35 = (aClass356_1767!!.method3484(0) as? Class348_Sub35)
        while (class348_sub35 != null) {
            val class348_sub35_4_ = Class348_Sub35(class348_sub35.aLong4291.toInt())
            aClass356_1770!!.method3483(26.toByte(), class348_sub35.anInt6976.toLong(), class348_sub35_4_)
            class348_sub35 = aClass356_1767!!.method3482(0) as? Class348_Sub35
        }
    }

    fun method1069(i: Int, class348_sub49: Class348_Sub49) {
        anInt1763++
        while (true) {
            val i_5_ = class348_sub49.readUnsignedByte(i + 255)
            if (i_5_ == 0) break
            method1065(class348_sub49, i + -21424, i_5_)
        }
        if (i != 0) aString1774 = null
    }

    private fun method1071(bool: Boolean) {
        aClass356_1770 = Class356(aClass356_1767!!.method3475(bool))
        anInt1768++
        var class348_sub50 = (aClass356_1767!!.method3484(0) as? Class348_Sub50)
        while (class348_sub50 != null) {
            val class348_sub46 = Class348_Sub46((class348_sub50.aString7211), (class348_sub50.aLong4291).toInt())
            aClass356_1770!!.method3483(102.toByte(), Class287.method2179((class348_sub50.aString7211!!), 120.toByte()), class348_sub46)
            class348_sub50 = aClass356_1767!!.method3482(0) as? Class348_Sub50
        }
    }

    fun method1073(bool: Boolean, i: Int): Int {
        if (bool != false) method1067(false, -31)
        anInt1775++
        if (this.aClass356_1767 == null) return anInt1764
        val class348_sub35 = (aClass356_1767!!.method3480(i.toLong(), -6008) as? Class348_Sub35) ?: return anInt1764
        return class348_sub35.anInt6976
    }

    fun method1074(i: Int, i_7_: Int): String? {
        anInt1777++
        if (i_7_ <= 60) return null
        if (this.aClass356_1767 == null) return aString1774
        val class348_sub50 = (aClass356_1767!!.method3480(i.toLong(), -6008) as? Class348_Sub50) ?: return aString1774
        return class348_sub50.aString7211
    }

    companion object {
        @JvmField
        var anInt1763: Int = 0
        @JvmField
        var anInt1765: Int = 0
        @JvmField
        var aClass351_1766: Class351? = Class351(74, -1)
        @JvmField
        var anInt1768: Int = 0
        @JvmField
        var anInt1769: Int = 0
        @JvmField
        var anInt1771: Int = 0
        @JvmField
        var anInt1772: Int = 0
        @JvmField
        var anInt1773: Int = 0
        @JvmField
        var anInt1775: Int = 0
        @JvmField
        var anInt1776: Int = 0
        @JvmField
        var anInt1777: Int = 0
        @JvmField
        var anInt1780: Int = 0

        @JvmStatic
        fun method1064(i: Int) {
            if (i != -3) aClass351_1766 = null
            aClass351_1766 = null
        }

        @JvmStatic
        fun method1070(i: Byte, i_6_: Int) {
            if (i < 109) anInt1780 = 10
            anInt1769++
            if (Class348_Sub49_Sub2.anIntArray9757 == null || Class348_Sub49_Sub2.anIntArray9757!!.size < i_6_) Class348_Sub49_Sub2.anIntArray9757 = IntArray(i_6_)
        }

        fun method1072(class45: Class45?, i: Byte) {
            if (i >= -91) method1070(((-93).toByte()).toByte(), 92)
            Class239_Sub12.aClass45_5964 = class45
            anInt1771++
        }
    }
}
