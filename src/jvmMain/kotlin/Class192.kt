/* Class192 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class192 internal constructor(var aBoolean2574: Boolean) {
    var anInterface5_Impl2_2572: Interface5_Impl2? = null
    var anInterface5_Impl2_2576: Interface5_Impl2? = null
    var aBoolean2577: Boolean = false
    fun method1435(i: Byte) {
        if (i >= -6) this.aBoolean2577 = true
        anInt2575++
        if (this.anInterface5_Impl2_2576 != null) this.anInterface5_Impl2_2576!!.method21(23315)
        this.aBoolean2577 = false
    }

    fun method1437(i: Byte): Boolean {
        anInt2580++
        if (i.toInt() != -100) this.anInterface5_Impl2_2572 = null
        return this.aBoolean2577 && !this.aBoolean2574
    }

    companion object {
        var anInt2573: Int = 0
        var anInt2575: Int = 0
        @JvmField
        var anInt2578: Int = 0
        var aShortArray2579: ShortArray? = null
        var anInt2580: Int = 0
        @JvmField
        var anInt2581: Int = 0
        var anInt2582: Int = 0

        fun method1434(i: Int) {
            anInt2573++
            var class318_sub6 = InputStream_Sub2.aClass243_83!!.method1875(60) as Class318_Sub6?
            while (class318_sub6 != null) {
                Class318_Sub1_Sub3_Sub4.method2461(class318_sub6, true)
                class318_sub6 = (InputStream_Sub2.aClass243_83!!.method1875(60) as Class318_Sub6?)
            }
            val i_0_: Int
            val i_1_: Int
            if (Class316.aClass348_Sub51_3959!!.aClass239_Sub27_7261!!.method1840(-32350) == 1) {
                i_0_ = 0
                i_1_ = 3
            } else {
                i_1_ = Class167.anInt2204
                i_0_ = i_1_
            }
            Client.method115()
            for (i_2_ in i_0_..i_1_) {
                Client.method109()
                Client.method117(i_2_)
                Client.method104(i_2_)
            }
            Client.method106()
            if (i == -14988) Client.method112()
        }

        @JvmStatic
        fun method1436(i: Int, i_3_: Int): Boolean {
            val i_4_ = 22 % ((i - 16) / 35)
            anInt2582++
            return i_3_ == (i_3_ and -i_3_)
        }

        @JvmStatic
        fun method1438(i: Int) {
            val i_5_ = 85 % ((i - -28) / 60)
            aShortArray2579 = null
        }
    }
}
