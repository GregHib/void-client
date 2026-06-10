/* Class295 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class295 internal constructor(string: String?, string_4_: String?, string_5_: String?) {
    var aString3754: String? = null
    var aString3756: String? = null
    var aString3758: String? = null

    init {
        try {
            this.aString3754 = string_4_
            this.aString3758 = string_5_
            this.aString3756 = string
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("wc.<init>(" + (if (string != null) "{...}" else "null") + ',' + (if (string_4_ != null) "{...}" else "null") + ',' + (if (string_5_ != null) "{...}" else "null") + ')'))
        }
    }

    companion object {
        var aClass114_3751: Class114?
        var anInt3752: Int = 0
        var aClass348_Sub42_Sub17Array3753: Array<Class348_Sub42_Sub17?>? = arrayOfNulls<Class348_Sub42_Sub17>(14)
        var anInt3755: Int = 0
        var anInt3757: Int = 0
        var anIntArray3759: IntArray? = null
        var anInt3760: Int
        var aDouble3761: Double = 0.0
        @JvmField
        var anInt3762: Int = 0
        @JvmField
        var aBoolean3763: Boolean = false
        @JvmField
        var anInt3764: Int

        fun method2220(i: Int, i_0_: Int, i_1_: Int, i_2_: Byte): Int {
            var i_0_ = i_0_
            anInt3757++
            if (i_2_.toInt() != 71) return -122
            i_0_ = i_0_ and 0x3
            if (i_0_ == 0) return i_1_
            if (i_0_ == 1) return i
            if (i_0_ == 2) return 7 + -i_1_
            return 7 + -i
        }

        fun method2221(player: Player, i: Int) {
            anInt3752++
            if (i != -28482) aClass348_Sub42_Sub17Array3753 = null
            val class348_sub9 = ((Class348_Sub42_Sub16_Sub2.aClass356_10465!!.method3480(player.anInt10290.toLong(), -6008)) as Class348_Sub9?)
            if (class348_sub9 != null) {
                if (class348_sub9.aClass348_Sub16_Sub5_6676 != null) {
                    Class348_Sub43.aClass348_Sub16_Sub4_7065!!.method2880(class348_sub9.aClass348_Sub16_Sub5_6676!!)
                    class348_sub9.aClass348_Sub16_Sub5_6676 = null
                }
                class348_sub9.method2715(82.toByte())
            }
        }

        fun method2222(i: Int, i_3_: Byte) {
            anInt3755++
            Class73.aLong4783 = 1000000000L / i.toLong()
            if (i_3_.toInt() != -124) method2223(-83)
        }

        @JvmStatic
        fun method2223(i: Int) {
            aClass348_Sub42_Sub17Array3753 = null
            anIntArray3759 = null
            aClass114_3751 = null
            if (i < 100) aBoolean3763 = false
        }

        init {
            aClass114_3751 = Class114(1, 2)
            anInt3760 = -1
            anInt3764 = 0
        }
    }
}
