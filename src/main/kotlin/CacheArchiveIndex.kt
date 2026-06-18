import CacheArchiveIndexLoader.Companion.method340
import Class50_Sub1.Companion.method462

/* Class117 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class CacheArchiveIndex {
    private var anInt1764 = 0
    var aHashtable_1767: Hashtable? = null
    private var aHashtable_1770: Hashtable? = null
    private var aString1774: String? = "null"
    var aChar1778: Char = 0.toChar()
    var aChar1779: Char = 0.toChar()
    private fun method1065(class348_sub49: Buffer, i: Int, i_0_: Int) {
        if (i_0_ == 1) this.aChar1778 = method462(class348_sub49.readByte(-91), -128)
        else if (i_0_ == 2) this.aChar1779 = method462(class348_sub49.readByte(-119), -128)
        else if (i_0_ == 3) aString1774 = class348_sub49.readString(86.toByte())
        else if (i_0_ == 4) anInt1764 = class348_sub49.readInt(((-126).toByte()).toByte())
        else if (i_0_ == 5 || i_0_ == 6) {
            val i_1_ = class348_sub49.readUnsignedShort(i xor 0x3235ab57.inv())
            this.aHashtable_1767 = Hashtable(method340(i_1_, 108.toByte()))
            for (i_2_ in 0..<i_1_) {
                val i_3_ = class348_sub49.readInt(((-126).toByte()).toByte())
                val class348 = if (i_0_ != 5) IntKeyNode(class348_sub49.readInt(((-126).toByte()).toByte()))
                else StringCacheNode(class348_sub49.readString(((-35).toByte()).toByte()))
                aHashtable_1767!!.method3483(21.toByte(), i_3_.toLong(), class348)
            }
        }
        anInt1765++
        if (i != -21424) method1068(((-15).toByte()).toByte())
    }

    fun method1066(bool: Boolean, string: String): Boolean {
        anInt1776++
        if (this.aHashtable_1767 == null) return false
        if (bool != false) aHashtable_1770 = null
        if (aHashtable_1770 == null) method1071(true)
        var class348_sub46 = (aHashtable_1770!!.method3480(TypedRecordTable.method2179(string, 109.toByte()), -6008) as? StringValueNode)
        while (class348_sub46 != null) {
            if (class348_sub46.aString7111 == string) return true
            class348_sub46 = aHashtable_1770!!.method3476(true) as? StringValueNode
        }
        return false
    }

    fun method1067(bool: Boolean, i: Int): Boolean {
        anInt1773++
        if (this.aHashtable_1767 == null) return false
        if (bool != true) return true
        if (aHashtable_1770 == null) method1068(120.toByte())
        val class348_sub35 = aHashtable_1770!!.method3480(i.toLong(), -6008) as? IntKeyNode
        return class348_sub35 != null
    }

    private fun method1068(i: Byte) {
        anInt1772++
        aHashtable_1770 = Hashtable(aHashtable_1767!!.method3475(true))
        var class348_sub35 = (aHashtable_1767!!.method3484(0) as? IntKeyNode)
        while (class348_sub35 != null) {
            val class348_sub35_4_ = IntKeyNode(class348_sub35.aLong4291.toInt())
            aHashtable_1770!!.method3483(26.toByte(), class348_sub35.anInt6976.toLong(), class348_sub35_4_)
            class348_sub35 = aHashtable_1767!!.method3482(0) as? IntKeyNode
        }
    }

    fun method1069(i: Int, class348_sub49: Buffer) {
        anInt1763++
        while (true) {
            val i_5_ = class348_sub49.readUnsignedByte(i + 255)
            if (i_5_ == 0) break
            method1065(class348_sub49, i + -21424, i_5_)
        }
        if (i != 0) aString1774 = null
    }

    private fun method1071(bool: Boolean) {
        aHashtable_1770 = Hashtable(aHashtable_1767!!.method3475(bool))
        anInt1768++
        var class348_sub50 = (aHashtable_1767!!.method3484(0) as? StringCacheNode)
        while (class348_sub50 != null) {
            val class348_sub46 = StringValueNode((class348_sub50.aString7211), (class348_sub50.aLong4291).toInt())
            aHashtable_1770!!.method3483(102.toByte(), TypedRecordTable.method2179((class348_sub50.aString7211!!), 120.toByte()), class348_sub46)
            class348_sub50 = aHashtable_1767!!.method3482(0) as? StringCacheNode
        }
    }

    fun method1073(bool: Boolean, i: Int): Int {
        if (bool != false) method1067(false, -31)
        anInt1775++
        if (this.aHashtable_1767 == null) return anInt1764
        val class348_sub35 = (aHashtable_1767!!.method3480(i.toLong(), -6008) as? IntKeyNode) ?: return anInt1764
        return class348_sub35.anInt6976
    }

    fun method1074(i: Int, i_7_: Int): String? {
        anInt1777++
        if (i_7_ <= 60) return null
        if (this.aHashtable_1767 == null) return aString1774
        val class348_sub50 = (aHashtable_1767!!.method3480(i.toLong(), -6008) as? StringCacheNode) ?: return aString1774
        return class348_sub50.aString7211
    }

    companion object {
        @JvmField
        var anInt1763: Int = 0
        @JvmField
        var anInt1765: Int = 0
        @JvmField
        var aFontMetaRef_1766: FontMetaRef? = FontMetaRef(74, -1)
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
            if (i != -3) aFontMetaRef_1766 = null
            aFontMetaRef_1766 = null
        }

        @JvmStatic
        fun method1070(i: Byte, i_6_: Int) {
            if (i < 109) anInt1780 = 10
            anInt1769++
            if (CipheredPacketBuffer.anIntArray9757 == null || CipheredPacketBuffer.anIntArray9757!!.size < i_6_) CipheredPacketBuffer.anIntArray9757 = IntArray(i_6_)
        }

        fun method1072(js5Archive: Js5Archive?, i: Byte) {
            if (i >= -91) method1070(((-93).toByte()).toByte(), 92)
            BloomGraphicsOptionState.aJs5Archive_5964 = js5Archive
            anInt1771++
        }
    }
}
