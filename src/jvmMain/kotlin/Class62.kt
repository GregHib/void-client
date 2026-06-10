import Class14_Sub2.Companion.method243
import Class348_Sub40_Sub12.Companion.method3076
import Class367_Sub10.Companion.method3553

/* Class62 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
object Class62 {
    @JvmField
    var anInt1110: Int = 0
    @JvmField
    var anInt1111: Int = 0
    @JvmField
    var anInt1112: Int = 0
    @JvmField
    var anInt1113: Int = 0
    @JvmField
    var aClass243_1114: Class243? = Class243()
    @JvmField
    var anInt1115: Int = 0
    @JvmField
    var anIntArrayArrayArray1116: Array<Array<IntArray?>?>? = null

    @JvmStatic
    fun method596(i: Int): Array<Class341?> {
        if (i != 20000) anIntArrayArrayArray1116 = null
        anInt1112++
        return (arrayOf<Class341?>(Class186_Sub1.aClass341_5808, Class27.aClass341_399, Class237_Sub1.aClass341_5821))
    }

    @JvmStatic
    fun method597(i: Byte) {
        aClass243_1114 = null
        anIntArrayArrayArray1116 = null
        val i_0_ = -116 / ((6 - i) / 60)
    }

    @JvmStatic
    fun method598(i: Int) {
        anInt1111++
        if (i != 9013) method597(86.toByte())
        var class348_sub15 = Class27.aClass356_389!!.method3484(0) as? Class348_Sub15?
        while (class348_sub15 != null) {
            if (!class348_sub15.aBoolean6772) Class64_Sub3.method690((-94).toByte(), (class348_sub15.anInt6773))
            else class348_sub15.aBoolean6772 = false
            class348_sub15 = Class27.aClass356_389!!.method3482(0) as? Class348_Sub15?
        }
    }

    @JvmStatic
    @Synchronized
    fun method599(i: Int): Long {
        if (i > -52) return -121L
        anInt1113++
        val l = System.currentTimeMillis()
        if (Class101_Sub1.aLong5663 > l) Class318_Sub1_Sub1.aLong8728 += Class101_Sub1.aLong5663 - l
        Class101_Sub1.aLong5663 = l
        return l + Class318_Sub1_Sub1.aLong8728
    }

    fun method600(i: Byte, i_1_: Int, i_2_: Int): Int {
        anInt1115++
        val i_3_: Int
        if (i_2_ <= 20000) {
            if (i_2_ <= 10000) {
                if (i_2_ <= 5000) {
                    method3076(0, true)
                    i_3_ = 1
                } else {
                    i_3_ = 2
                    Class161.method1263(true)
                }
            } else {
                i_3_ = 3
                Class47.method447((-59).toByte())
            }
        } else {
            Class133.method1140(120)
            i_3_ = 4
        }
        if (i_1_ != Class316.aClass348_Sub51_3959!!.aClass239_Sub25_7271!!.method1829(-32350)) {
            Class316.aClass348_Sub51_3959!!.method3429(74.toByte(), (Class316.aClass348_Sub51_3959!!.aClass239_Sub25_7251), i_1_)
            method3553(false, 122.toByte(), i_1_)
        }
        if (i >= -20) aClass243_1114 = null
        method243(37)
        return i_3_
    }
}
