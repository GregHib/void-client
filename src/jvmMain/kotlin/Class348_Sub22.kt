import Class324.Companion.method2570
import Class348_Sub3.Companion.method2743
import java.awt.Color

class Class348_Sub22 internal constructor(@JvmField var aNpc_6859: Npc?) : Class348() {
    companion object {
        @JvmField
        var anInt6857: Int = 0
        var anInt6858: Int = 0
        var anInt6860: Int = 0
        var anInt6861: Int = 0
        var anInt6862: Int = 0

        @JvmStatic
        fun method2957(i: Int, i_0_: Byte, i_1_: Int): Class46? {
            anInt6858++
            val class46 = method2570(i_0_ + 1512932774, i_1_)
            if (i == -1) return class46
            if (class46 == null || class46.aClass46Array798 == null || (i >= class46.aClass46Array798!!.size)) return null
            return class46.aClass46Array798!![i]
        }

        fun method2958(i: Int, class45: Class45): Int {
            anInt6861++
            var i_2_ = 0
            if (class45.method421(false, anInt6862)) i_2_++
            if (class45.method421(false, Class106.anInt1639)) i_2_++
            if (class45.method421(false, Class373_Sub2.anInt7429)) i_2_++
            if (class45.method421(false, ha.anInt4562)) i_2_++
            if (class45.method421(false, Class82.anInt1435)) i_2_++
            if (class45.method421(false, Class115.anInt1756)) i_2_++
            if (class45.method421(false, Class291.anInt3739)) i_2_++
            if (class45.method421(false, Class86.anInt1481)) i_2_++
            if (class45.method421(false, Class239_Sub10.anInt5948)) i_2_++
            if (class45.method421(false, Class113.anInt1742)) i_2_++
            if (class45.method421(false, Class364.anInt4469)) i_2_++
            if (i != 22388) return 8
            if (class45.method421(false, Class348_Sub40_Sub38.anInt9473)) i_2_++
            if (class45.method421(false, Class187.anInt2510)) i_2_++
            if (class45.method421(false, Class52.anInt4895)) i_2_++
            if (class45.method421(false, Class186_Sub1.anInt5814)) i_2_++
            if (class45.method421(false, Class5_Sub3.anInt8370)) i_2_++
            return i_2_
        }

        @JvmStatic
        fun method2959(i: Int) {
            Class182.aClass346_2449!!.method2698(14174)
            anInt6860++
            Class258_Sub4.aClass373_8552!!.method3592(0)
            Class79.aClient1367!!.method87((-49).toByte())
            Class305.aCanvas3869!!.setBackground(Color.black)
            Class337.anInt4179 = i
            Class182.aClass346_2449 = method2743(Class305.aCanvas3869, 84.toByte())
            Class258_Sub4.aClass373_8552 = Class348_Sub18.Companion.method2941(Class305.aCanvas3869, 0, true)
        }
    }
}
