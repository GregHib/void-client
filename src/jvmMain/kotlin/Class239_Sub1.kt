import Class59.Companion.method544

/* Class239_Sub1 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class239_Sub1 : Class239 {
    fun method1720(i: Int): Int {
        anInt5843++
        if (i != -32350) method1714(82, -89)
        return this.anInt3138
    }

    override fun method1716(bool: Boolean) {
        if (this.anInt3138 != 1 && this.anInt3138 != 0) this.anInt3138 = method1710(20014)
        if (bool == false) anInt5846++
    }

    internal constructor(class348_sub51: Class348_Sub51) : super(class348_sub51)

    override fun method1714(i: Int, i_8_: Int): Int {
        if (i != 3) anInt5850 = 94
        anInt5841++
        return 1
    }

    override fun method1712(i: Int, i_9_: Int) {
        val i_10_ = -57 / ((82 - i) / 35)
        anInt5844++
        this.anInt3138 = i_9_
    }

    internal constructor(i: Int, class348_sub51: Class348_Sub51) : super(i, class348_sub51)

    override fun method1710(i: Int): Int {
        if (i != 20014) anInt5850 = -72
        anInt5842++
        return 1
    }

    companion object {
        @JvmField
        var anInt5841: Int = 0
        @JvmField
        var anInt5842: Int = 0
        @JvmField
        var anInt5843: Int = 0
        @JvmField
        var anInt5844: Int = 0
        @JvmField
        var anInt5845: Int = 0
        @JvmField
        var anInt5846: Int = 0
        @JvmField
        var aShortArrayArray5847: Array<ShortArray?>? = null
        @JvmField
        var anInt5848: Int = 0
        @JvmField
        var anInt5849: Int = 0
        @JvmField
        var anInt5850: Int = 0

        @JvmStatic
        fun method1719(bool: Boolean, string: String?, string_0_: String?, i: Int, i_1_: Int) {
            try {
                Class178.method1356(true, string_0_, i_1_, i, bool, string, true)
                anInt5845++
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, ("aj.G(" + bool + ',' + (if (string != null) "{...}" else "null") + ',' + (if (string_0_ != null) "{...}" else "null") + ',' + i + ',' + i_1_ + ')'))
            }
        }

        @JvmStatic
        fun method1721(string: String?, i: Byte) {
            anInt5849++
            if (r.aBoolean9722 && (0x18 and Class38.anInt500) != 0) {
                val i_2_ = -88 / ((i - -33) / 37)
                var bool = false
                val i_3_ = Class328_Sub1.anInt6513
                val `is` = Class286_Sub7.anIntArray6290!!
                var i_4_ = 0
                while (i_3_ > i_4_) {
                    val player = (Class294.aPlayerArray5058!![`is`[i_4_]])!!
                    if (player.aString10544 != null && player.aString10544.equals(string, ignoreCase = true) && (((player == Class132.aPlayer_1907) && (0x10 and Class38.anInt500) != 0) || (player != null && (Class38.anInt500 and 0x8) != 0))) {
                        Class228.anInt2975++
                        val class348_sub47 = Class286_Sub3.method2148(Class52.aClass351_4907, (Class348_Sub23_Sub2.aClass77_9029), -102)
                        class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShortAddLittle(4325, Class9.anInt169)
                        class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShortLittle(`is`[i_4_], 3.toByte())
                        class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShortLittle(Class301.anInt3829, 3.toByte())
                        class348_sub47.aClass348_Sub49_Sub2_7116!!.writeIntInverseMiddle(Class149.anInt2046, -4086)
                        class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByteInverse((-64).toByte(), 0)
                        Class348_Sub42_Sub14.method3243(116, class348_sub47)
                        bool = true
                        Class298.method2252(true, player.anIntArray10320!![0], player.anIntArray10317!![0], (-99).toByte(), player.method2436(54.toByte()), 0, player.method2436(91.toByte()), -2, 0)
                        break
                    }
                    i_4_++
                }
                if (!bool) method544((Class274.aClass274_3504!!.method2063(Class348_Sub33.anInt6967, 544)) + string, false, 4)
                if (r.aBoolean9722) Class341.method2678(-2049)
            }
        }

        @JvmStatic
        fun method1722(i: Int, i_5_: Int, i_6_: Byte): Boolean {
            val i_7_ = 92 % ((i_6_ - 48) / 32)
            anInt5848++
            return (0x10000 and i) != 0
        }

        @JvmStatic
        fun method1723(i: Byte) {
            aShortArrayArray5847 = null
            if (i.toInt() != 119) anInt5850 = -51
        }
    }
}
