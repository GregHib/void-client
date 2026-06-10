import Class286_Sub2.Companion.method2146
import Class5.Companion.method181
import Class6.Companion.method204

/* Class91 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
object Class91 {
    @JvmField
    var aClass74_1519: Class74?
    @JvmField
    var anInt1520: Int = 0
    var anIntArray1521: IntArray? = intArrayOf(7, 8, 9, 10, 11, 12, 13, 15)
    @JvmField
    var anInt1522: Int = 0
    @JvmField
    var aClass82_1523: Class82? = null

    fun method855(i: Int, i_0_: Int, i_1_: Int) {
        anInt1520++
        val class348_sub42_sub15 = Class318_Sub9_Sub1.method2516(i_1_, 105.toByte(), i) //6
        class348_sub42_sub15.method3246(i xor 0x6397.inv())
        class348_sub42_sub15.anInt9652 = i_0_
    }

    fun method856(i: Byte) {
        Class358.anInt4411 = 0
        Class101.anInt1597 = 0
        anInt1522++
        Class348_Sub23_Sub3.anInt9041++
        Class139.method1165(1)
        method204(-724138005)
        Class170.method1318(-65536)
        var bool = false
        for (i_2_ in 0..<Class358.anInt4411) {
            val i_3_ = Class5_Sub1_Sub1.anIntArray9932!![i_2_]
            val class348_sub22 = (Class282.aClass356_3654!!.method3480(i_3_.toLong(), -6008) as Class348_Sub22)
            val npc = (class348_sub22.aNpc_6859)!!
            if (Class5_Sub1.aBoolean8335 && Class348_Sub42_Sub1.method3169(i_3_, 0)) method2146(84.toByte())
            if (Class348_Sub23_Sub3.anInt9041 != (npc.anInt10306)) {
                if (npc.aClass79_10505!!.method793(0)) method181(true, npc)
                npc.method2448(null, -2)
                class348_sub22.method2715(52.toByte())
                bool = true
            }
        }
        if (bool) {
            Class348_Sub32.anInt6930 = Class282.aClass356_3654!!.method3474(1)
            Class282.aClass356_3654!!.method3477(3, Class348_Sub40_Sub23.aClass348_Sub22Array9319!! as Array<Class348?>)
        }
        if (Class348_Sub40_Sub25.anInt9341 != Class299.aClass348_Sub49_Sub2_3813!!.anInt7197) throw RuntimeException("gnp1 pos:" + (Class299.aClass348_Sub49_Sub2_3813!!.anInt7197) + " psize:" + Class348_Sub40_Sub25.anInt9341)
        if (i <= 47) aClass74_1519 = null
        var i_4_ = 0
        while (Class150.anInt2057 > i_4_) {
            if (Class282.aClass356_3654!!.method3480(Class74.anIntArray1233!![i_4_].toLong(), -6008) == null) throw RuntimeException("gnp2 pos:" + i_4_ + " size:" + Class150.anInt2057)
            i_4_++
        }
        if (Class348_Sub32.anInt6930 - Class150.anInt2057 != 0) throw RuntimeException("gnp3 mis:" + (Class348_Sub32.anInt6930 - Class150.anInt2057))
        for (i_5_ in 0..<Class348_Sub32.anInt6930) {
            if (Class348_Sub40_Sub23.aClass348_Sub22Array9319!![i_5_]!!.aNpc_6859!!.anInt10306 != Class348_Sub23_Sub3.anInt9041) throw RuntimeException("gnp4 uk:" + (Class348_Sub40_Sub23.aClass348_Sub22Array9319!![i_5_]!!.aNpc_6859!!.anInt10290))
        }
    }

    @JvmStatic
    fun method857(i: Int) {
        anIntArray1521 = null
        aClass82_1523 = null
        aClass74_1519 = null
        if (i < 121) method856(((-72).toByte()).toByte())
    }

    init {
        aClass74_1519 = Class74(10, 8)
    }
}
