import Class135_Sub2.Companion.method1156
import Class177.Companion.method1353
import Class239_Sub5.Companion.method1742
import Class348_Sub16_Sub3.Companion.method2878
import Class348_Sub40_Sub32.Companion.method3135
import Class62.method599
import r_Sub2.Companion.method3297

/* Class184 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class184 {
    var anIntArray2468: IntArray? = null
    var aStringArray2473: Array<String?>? = null
    var aClass348_Sub42_Sub19_2474: Class348_Sub42_Sub19? = null
    var anInt2477: Int = -1

    companion object {
        @JvmField
        var aBoolean2469: Boolean
        var anInt2470: Int = 0
        var anIntArray2471: IntArray? = IntArray(14)
        var anInt2472: Int = 0
        var anInt2475: Int = 0
        var anInt2476: Int = 0

        /*synthetic*/
        var aClass2478: Class<*>? = null

        fun method1384(i: Int, i_0_: Int, i_1_: Int): Int {
            var i_1_ = i_1_
            i_1_ = (0x7f and i) * i_1_ shr 7
            if (i_0_ != 1421041063) return -72
            anInt2476++
            if (i_1_ >= 2) {
                if (i_1_ > 126) i_1_ = 126
            } else i_1_ = 2
            return i_1_ + (0xff80 and i)
        }

        fun method1385(bool: Boolean, `is`: ByteArray, i: Byte) {
            anInt2475++
            if (Class299_Sub1_Sub2.aClass348_Sub49_8698 == null) Class299_Sub1_Sub2.aClass348_Sub49_8698 = Class348_Sub49(20000)
            Class299_Sub1_Sub2.aClass348_Sub49_8698!!.writeBytes(`is`.size, 0, `is`, 97)
            if (bool) {
                Class167.method1294((-113).toByte(), (Class299_Sub1_Sub2.aClass348_Sub49_8698!!.aByteArray7154))
                Class65.aClass110_Sub1Array1146 = arrayOfNulls<Class110_Sub1>(Class225.anInt2956)
                var i_2_ = 0
                var i_3_ = Class318_Sub1_Sub2.anInt8731
                while ((Class239_Sub29.anInt6151 >= i_3_)) {
                    val class110_sub1 = method1742(false, i_3_)
                    if (class110_sub1 != null) Class65.aClass110_Sub1Array1146!![i_2_++] = class110_sub1
                    i_3_++
                }
                Class130.aBoolean1899 = false
                Class240.aLong4683 = method599(-92)
                Class299_Sub1_Sub2.aClass348_Sub49_8698 = null
            }
            if (i > -21) aBoolean2469 = true
        }

        @JvmStatic
        fun method1386(bool: Boolean) {
            anIntArray2471 = null
            if (bool != true) aBoolean2469 = true
        }

        @JvmStatic
        fun method1387(i: Int, class348_sub27: Class348_Sub27) {
            anInt2470++
            if (Class147.aClass357ArrayArrayArray2029 != null) {
                if (i >= -38) method1384(-77, 22, 77)
                var interface10: Interface10? = null
                if (class348_sub27.anInt6904 == 0) interface10 = (method3297((class348_sub27.anInt6899), (class348_sub27.anInt6905), (class348_sub27.anInt6896)) as Interface10?)
                if (class348_sub27.anInt6904 == 1) interface10 = ((method3135(class348_sub27.anInt6899, class348_sub27.anInt6905, class348_sub27.anInt6896)) as Interface10?)
                if (class348_sub27.anInt6904 == 2) interface10 = ((method1353(class348_sub27.anInt6899, class348_sub27.anInt6905, class348_sub27.anInt6896, (if (aClass2478 != null) aClass2478 else (Interface10::class.java.also { aClass2478 = it })))) as Interface10?)
                if (class348_sub27.anInt6904 == 3) interface10 = ((method2878(class348_sub27.anInt6899, class348_sub27.anInt6905, class348_sub27.anInt6896)) as Interface10?)
                if (interface10 == null) {
                    class348_sub27.anInt6892 = 0
                    class348_sub27.anInt6902 = -1
                    class348_sub27.anInt6903 = 0
                } else {
                    class348_sub27.anInt6902 = interface10.method42(-103)
                    class348_sub27.anInt6903 = interface10.method39(111)
                    class348_sub27.anInt6892 = interface10.method41(-32228)
                }
            }
        }

        fun method1388(i: Int, i_4_: Int, i_5_: Int, i_6_: Int, i_7_: Int, i_8_: Int) {
            var i = i
            var i_8_ = i_8_
            method1156(-27, i_6_, Class17.anIntArrayArray255!![i++]!!, i_7_, i_4_)
            anInt2472++
            method1156(-27, i_6_, Class17.anIntArrayArray255!![i_8_--]!!, i_7_, i_4_)
            val i_9_ = -52 / ((i_5_ - -32) / 55)
            var i_10_ = i
            while (i_8_ >= i_10_) {
                val `is` = Class17.anIntArrayArray255!![i_10_]!!
                `is`[i_6_] = i_4_
                `is`[i_7_] = `is`[i_6_]
                i_10_++
            }
        }

        init {
            aBoolean2469 = false
        }
    }
}
