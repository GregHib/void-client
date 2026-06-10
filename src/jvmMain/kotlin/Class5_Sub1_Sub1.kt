import aa_Sub2.Companion.method163

/* Class5_Sub1_Sub1 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class5_Sub1_Sub1 internal constructor(class45: Class45, class45_0_: Class45, class369_sub3_sub1: Class369_Sub3_Sub1) : Class5_Sub1(class45, class45_0_, class369_sub3_sub1) {
    override fun method186(i: Int, i_1_: Int, i_2_: Byte, i_3_: Int, i_4_: Int) {
        if (i_2_ <= 21) aClass207Array9929 = null
        anInt9928++
        val i_5_ = this.aClass105_8350!!.method966()
        val i_6_ = ((this.aClass369_4635 as Class369_Sub3_Sub1).anInt10177 * method163(512) / 10 % i_5_)
        this.aClass105_8350!!.method972(i_3_ - (i_5_ - i_6_), i, -i_6_ + (i_4_ - -i_5_), i_1_)
    }

    companion object {
        @JvmField
        var anInt9928: Int = 0
        @JvmField
        var aClass207Array9929: Array<Class207>? = null
        @JvmField
        var anInt9930: Int = 0
        @JvmField
        var aClass262_9931: Class262? = Class262()
        @JvmField
        var anIntArray9932: IntArray? = IntArray(1000)

        @JvmStatic
        fun method190(i: Byte) {
            if (i < 23) anIntArray9932 = null
            aClass207Array9929 = null
            aClass262_9931 = null
            anIntArray9932 = null
        }
    }
}
