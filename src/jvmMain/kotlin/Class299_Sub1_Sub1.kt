/* Class299_Sub1_Sub1 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class299_Sub1_Sub1 internal constructor(private val aHa_Sub2_8693: ha_Sub2, private val anInt8689: Int, private val anInt8695: Int, private val anInt8691: Int, private val anInt8690: Int, private val anInt8686: Int, private val anInt8697: Int) : Class299_Sub1() {
    private var aClass258_Sub2_8688: Class258_Sub2? = null

    override fun method2256(i: Byte): Class258_Sub2? {
        anInt8692++
        if (i.toInt() != -121) method2256(33.toByte())
        if (aClass258_Sub2_8688 == null) {
            val var_d = aHa_Sub2_8693.aD4579!!
            Class308.anIntArray3883!![3] = anInt8690
            Class308.anIntArray3883!![4] = anInt8686
            Class308.anIntArray3883!![2] = anInt8691
            Class308.anIntArray3883!![5] = anInt8697
            Class308.anIntArray3883!![1] = anInt8695
            Class308.anIntArray3883!![0] = anInt8689
            var bool = false
            var i_0_ = 0
            for (i_1_ in 0..5) {
                if (!var_d.method4(i.toInt() xor 0x1f68, Class308.anIntArray3883!![i_1_])) return null
                val class12 = var_d.method3(Class308.anIntArray3883!![i_1_], -6662)
                val i_2_ = if (!class12!!.aBoolean199) 128 else 64
                if (i_0_ < i_2_) i_0_ = i_2_
                if (class12.aByte205 > 0) bool = true
            }
            for (i_3_ in 0..5) Class341.anIntArrayArray4233!![i_3_] = var_d.method5(false, Class308.anIntArray3883!![i_3_], 1.0f, i_0_, i_0_, i + 192)
            aClass258_Sub2_8688 = Class258_Sub2(aHa_Sub2_8693, 6407, i_0_, bool, Class341.anIntArrayArray4233)
        }
        return aClass258_Sub2_8688
    }

    companion object {
        @JvmField
        var anInt8687: Int = 0
        @JvmField
        var anInt8692: Int = 0
        @JvmField
        var aLong8694: Long = 0
        @JvmField
        var aFloat8696: Float = 0f
        @JvmStatic
        fun method2260(i: Int, i_4_: Int, l: Long, i_5_: Int, bool: Boolean, class45: Class45?, i_6_: Byte, i_7_: Int) {
            do {
                try {
                    Class239_Sub14.anInt5994 = 10000
                    Class124.aClass45_1848 = class45
                    Class58.anInt1059 = i_7_
                    Class318_Sub1_Sub4_Sub1.anInt10074 = i
                    Class346.aBoolean4275 = bool
                    Class285.aClass348_Sub16_Sub3_4743 = null
                    Class318.anInt3971 = i_4_
                    anInt8687++
                    Class239_Sub12.aLong5971 = l
                    Class348_Sub43.anInt7068 = 1
                    Class348_Sub40_Sub35.anInt9444 = i_5_
                    if (i_6_ >= 54) break
                    method2260(36, 99, 61L, 90, false, null, 126.toByte(), -67)
                } catch (runtimeexception: RuntimeException) {
                    throw Class348_Sub17.method2929(runtimeexception, ("dq.E(" + i + ',' + i_4_ + ',' + l + ',' + i_5_ + ',' + bool + ',' + (if (class45 != null) "{...}" else "null") + ',' + i_6_ + ',' + i_7_ + ')'))
                }
                break
            } while (false)
        }
    }
}
