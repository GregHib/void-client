import java.io.IOException
import java.io.OutputStream

class OutputStream_Sub2 : OutputStream() {
    @Throws(IOException::class)
    override fun write(i: Int) {
        anInt104++
        throw IOException()
    }

    companion object {
        @JvmField
        var anInt101: Int
        @JvmField
        var anInt102: Int = 0
        @JvmField
        var anInt103: Int = 0
        @JvmField
        var anInt104: Int = 0
        @JvmField
        var anInt105: Int = 0
        @JvmField
        var aClass105_106: Class105? = null
        @JvmField
        var anInt107: Int = 0
        @JvmField
        var aLong108: Long = (Math.random() * 9.999999999E9).toLong()

        @JvmStatic
        fun method135(i: Byte, `is`: ByteArray?, i_0_: Int): ByteArray {
            anInt103++
            if (i < 101) method139(34)
            val is_1_ = ByteArray(i_0_)
            Class214.method1577(`is`!!, 0, is_1_, 0, i_0_)
            return is_1_
        }

        @JvmStatic
        fun method136(i: Int, bool: Boolean, bool_2_: Boolean): Class318_Sub4 {
            anInt105++
            synchronized(Class318.aClass243Array3974!!) {
                val class318_sub4: Class318_Sub4
                if (Class318.aClass243Array3974!!.size > i && !Class318.aClass243Array3974!![i]!!.method1871(111.toByte())) {
                    class318_sub4 = Class318.aClass243Array3974!![i]!!.method1870(-104) as Class318_Sub4
                    class318_sub4.method2373(false)
                    Class331.anIntArray4128!![i]--
                } else {
                    class318_sub4 = Class318_Sub4()
                    class318_sub4.aClass318_Sub3Array6414 = arrayOfNulls<Class318_Sub3>(i)
                    var i_3_ = 0
                    while (i > i_3_) {
                        class318_sub4.aClass318_Sub3Array6414!![i_3_] = Class318_Sub3()
                        i_3_++
                    }
                }
                class318_sub4.aBoolean6409 = bool
                if (bool_2_ != false) aLong108 = 43L
                return class318_sub4
            }
        }

        @JvmStatic
        fun method137(i: Int, i_4_: Int, i_5_: Int): Boolean {
            anInt102++
            val i_6_ = -114 / ((i_4_ - 36) / 55)
            return ((0x70000 and i_5_) != 0) or Class348_Sub40_Sub9.method3073(i, i_5_, 50.toByte()) || Class264.method2015(i_5_, i, 7)
        }

        @JvmStatic
        fun method138(class348_sub42_sub12: Class348_Sub42_Sub12, bool: Boolean): Int {
            anInt107++
            var string = Class316.method2367((-126).toByte(), class348_sub42_sub12)
            var `is`: IntArray? = null
            if (!Class148.method1197(-12081, (class348_sub42_sub12.anInt9608))) {
                if (class348_sub42_sub12.anInt9599 == -1) {
                    if (Class367_Sub8.method3549(class348_sub42_sub12.anInt9608, (-44).toByte())) {
                        val class348_sub22 = ((Class282.aClass356_3654!!.method3480(class348_sub42_sub12.aLong9605.toInt().toLong(), -6008)) as? Class348_Sub22?)
                        if (class348_sub22 != null) {
                            val npc = (class348_sub22.aNpc_6859)!!
                            var class79 = (npc.aClass79_10505)
                            if (class79!!.anIntArray1377 != null) class79 = class79.method794((Class318_Sub1_Sub3_Sub3.aClass170_10209!!), -1)
                            if (class79 != null) `is` = class79.anIntArray1342
                        }
                    } else if (Class239_Sub21.method1813(8806, (class348_sub42_sub12.anInt9608))) {
                        val `object`: Any? = null
                        var class51: Class51?
                        if ((class348_sub42_sub12.anInt9608) == 1001) class51 = (Class348_Sub40_Sub12.aClass263_9195!!.method2005(0, (class348_sub42_sub12.aLong9605).toInt()))
                        else class51 = (Class348_Sub40_Sub12.aClass263_9195!!.method2005(0, (0x7fffffffL and ((class348_sub42_sub12.aLong9605) ushr 32)).toInt()))
                        if (class51.anIntArray945 != null) class51 = class51.method480((Class318_Sub1_Sub3_Sub3.aClass170_10209!!), 47.toByte())
                        if (class51 != null) `is` = class51.anIntArray917
                    }
                } else `is` = (Exception_Sub1.aClass255_112!!.method1940(-76, class348_sub42_sub12.anInt9599).anIntArray2772)
            } else `is` = (Exception_Sub1.aClass255_112!!.method1940(-115, class348_sub42_sub12.aLong9605.toInt()).anIntArray2772)
            if (`is` != null) string += Class163.method1273(`is`, true)
            var i = Class369.aClass143_4962!!.method1186(string, Class341.aClass105Array4234, bool)
            if (class348_sub42_sub12.aBoolean9597) i += Class239_Sub24.aClass105_6097!!.method971() + 4
            return i
        }

        @JvmStatic
        fun method139(i: Int) {
            if (i > 53) aClass105_106 = null
        }

        init {
            anInt101 = -1
        }
    }
}
