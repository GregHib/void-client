/* Class359 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class359 {
    var anInt4420: Int = 0
    var anInt4423: Int = 0
    var anInt4425: Int = 0
    var aBoolean4426: Boolean = false

    companion object {
        var anInt4419: Int = 0
        var aClass114_4421: Class114? = Class114(13, -2)
        var anInt4422: Int = 0
        var anInt4424: Int = 0
        @JvmStatic
        fun method3490(bool: Boolean): Boolean {
            anInt4419++
            var bool_0_ = bool
            if (Class348_Sub40_Sub1.aClass207_9090 == null) {
                if (!Class21.aClass45_322!!.method421(false, OutputStream_Sub1.anInt98)) bool_0_ = false
                else Class348_Sub40_Sub1.aClass207_9090 = Class207.method1512(Class21.aClass45_322!!, OutputStream_Sub1.anInt98)
            }
            if (Class348_Sub7.aClass207_6643 == null) {
                if (Class21.aClass45_322!!.method421(!bool, Class348_Sub32.anInt6938)) Class348_Sub7.aClass207_6643 = Class207.method1512(Class21.aClass45_322!!, Class348_Sub32.anInt6938)
                else bool_0_ = false
            }
            if (Class112.aClass207_1727 == null) {
                if (!Class21.aClass45_322!!.method421(false, Class295.anInt3762)) bool_0_ = false
                else Class112.aClass207_1727 = Class207.method1512(Class21.aClass45_322!!, Class295.anInt3762)
            }
            if (Class281.aClass143_3649 == null) {
                if (Class104.aClass45_1627!!.method421(false, Class20.anInt317)) Class281.aClass143_3649 = Class239_Sub10.method1766((-89).toByte(), Class20.anInt317, Class104.aClass45_1627!!)
                else bool_0_ = false
            }
            if (Class5_Sub1_Sub1.aClass207Array9929 == null) {
                if (Class21.aClass45_322!!.method421(false, Class20.anInt317)) Class5_Sub1_Sub1.aClass207Array9929 = Class207.method1523(Class21.aClass45_322!!, Class20.anInt317)
                else bool_0_ = false
            }
            return bool_0_
        }

        @JvmStatic
        fun method3491(i: Int) {
            aClass114_4421 = null
            if (i != 1) method3491(-30)
        }

        fun method3492(i: Int, i_1_: Int): Int {
            anInt4422++
            val i_2_ = 0x3f and i
            val i_3_ = (i_1_ and i) shr 6
            if (i_2_ == 18) {
                if (i_3_ == 0) return 1
                if (i_3_ == 1) return 2
                if (i_3_ == 2) return 4
                if (i_3_ == 3) return 8
            } else if (i_2_ == 19 || i_2_ == 21) {
                if (i_3_ == 0) return 16
                if (i_3_ == 1) return 32
                if (i_3_ == 2) return 64
                if (i_3_ == 3) return 128
            }
            return 0
        }
    }
}
