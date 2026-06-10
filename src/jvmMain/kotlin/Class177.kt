import Class101_Sub3.Companion.method943
import Class167.Companion.method1296
import Class348_Sub1_Sub3.Companion.method2732
import Class348_Sub5.Companion.method2755

/* Class177 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class177 internal constructor(private val aClass52_4671: Class52) : Interface1 {
    override fun method9(i: Byte, bool: Boolean) {
        if (bool) Class348_Sub8.aHa6654!!.aa(0, 0, Class321.anInt4017, Class348_Sub42_Sub8_Sub2.anInt10432, aClass52_4671.anInt4899, 0)
        anInt4668++
        if (i.toInt() != -49) anInt4666 = -20
    }

    override fun method7(i: Int) {
        anInt4667++
        if (i != 10286) method1354(42.toByte())
    }

    override fun method8(i: Byte): Boolean {
        anInt4663++
        val i_3_ = 35 / ((i - 25) / 52)
        return true
    }

    companion object {
        var anInt4663: Int = 0
        var anInt4664: Int = 0
        @JvmField
        var anInt4665: Int = 0
        var anInt4666: Int = 0
        var anInt4667: Int = 0
        var anInt4668: Int = 0
        @JvmField
        var anInt4669: Int = 0
        @JvmField
        var anIntArray4670: IntArray? = IntArray(3)
        fun method1352(i: Int, i_0_: Int, i_1_: Int, i_2_: Byte) {
            var i_0_ = i_0_
            anInt4664++
            if (i_2_.toInt() != -98) method1354(69.toByte())
            i_0_ = (i_0_ * Class316.aClass348_Sub51_3959!!.aClass239_Sub26_7260!!.method1838(-32350) shr 8)
            if (i_0_ != 0 && i != -1) {
                if (!Class74.aBoolean1236 && Class267.anInt3428 != -1 && method1296(true) && !Class327.method2605((-99).toByte())) {
                    Class209.aClass348_Sub16_Sub3_2718 = method943(false)
                    val class348_sub16_sub3 = Class172.method1326(Class209.aClass348_Sub16_Sub3_2718, i_2_.toInt() xor 0x68.inv())
                    Class348_Sub42_Sub18.method3273(true, -95, class348_sub16_sub3)
                }
                method2732(0, i, false, 102, Class348_Sub23_Sub2.aClass45_9033, i_0_)
                method2755(-1, 255, -1)
                Class74.aBoolean1236 = true
            }
        }

        @JvmStatic
        fun method1353(i: Int, i_4_: Int, i_5_: Int, var_class: Class<out Any>?): Class318_Sub1_Sub3? {
            val class357 = Class147.aClass357ArrayArrayArray2029!![i]!![i_4_]!![i_5_]
            if (class357 == null) return null
            var class148 = class357.aClass148_4396
            while (class148 != null) {
                val class318_sub1_sub3 = class148.aClass318_Sub1_Sub3_2040
                if (var_class!!.isAssignableFrom(class318_sub1_sub3!!.javaClass) && class318_sub1_sub3.aShort8743.toInt() == i_4_ && (class318_sub1_sub3.aShort8750.toInt() == i_5_)) return class318_sub1_sub3
                class148 = class148.aClass148_2038
            }
            return null
        }

        @JvmStatic
        fun method1354(i: Byte) {
            if (i.toInt() == -22) anIntArray4670 = null
        }
    }
}
