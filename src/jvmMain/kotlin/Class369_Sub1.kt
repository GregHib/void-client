/* Class369_Sub1 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class369_Sub1(class221: Class221?, class341: Class341?, i: Int, i_0_: Int, i_1_: Int, i_2_: Int, i_3_: Int, i_4_: Int, i_5_: Int, i_6_: Int, i_7_: Int, i_8_: Int) : Class369(class221, class341, i, i_0_, i_1_, i_2_, i_3_, i_4_, i_5_) {
    @JvmField
    var anInt8580: Int = 0
    @JvmField
    var anInt8582: Int = 0
    override fun method51(i: Byte): Class223? {
        if (i <= 116) method51((-95).toByte())
        anInt8581++
        return Class313.aClass223_3934
    }

    init {
        try {
            this.anInt8580 = i_7_
            this.anInt8582 = i_8_
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("kh.<init>(" + (if (class221 != null) "{...}" else "null") + ',' + (if (class341 != null) "{...}" else "null") + ',' + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ')'))
        }
    }

    companion object {
        @JvmField
        var anInt8579: Int = 0
        @JvmField
        var anInt8581: Int = 0
        @JvmField
        var anInt8583: Int = -1

        @JvmStatic
        fun method3570(bool: Boolean) {
            if (Class348_Sub40.aClass279_7042 != null) Class348_Sub40.aClass279_7042!!.method2084(-6858)
            anInt8579++
            if (Class194.aClass279_2596 != null) Class194.aClass279_2596!!.method2084(-6858)
            if (bool != false) anInt8583 = 30
        }
    }
}
