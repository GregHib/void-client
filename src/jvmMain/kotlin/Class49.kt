import Class14_Sub2.Companion.method243
import Class348_Sub40_Sub12.Companion.method3076
import Class367_Sub10.Companion.method3553
import kotlin.concurrent.Volatile

/* Class49 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class49 internal constructor(var_ha_Sub1: ha_Sub1?, class105: Class105?, class216: Class216?) : Interface4 {
    var aFloatArray4719: FloatArray? = null
    var anInt4722: Int = 0
    private var aClass216_4724: Class216? = null
    var anInt4725: Int = 0
    private val aHa_Sub1_4729: ha_Sub1?
    var anIntArray4731: IntArray?

    override fun method14(i: Int, i_3_: Int, i_4_: Int, i_5_: Int, i_6_: Int, i_7_: Int, bool: Boolean, bool_8_: Boolean) {
        anInt4723++
        Class213.method1568((aHa_Sub1_4729!!.aClass348_Sub31_7469!!.anIntArray6916), i_3_, i, i_7_, if (bool_8_) aHa_Sub1_4729.aFloatArray7502 else null, if (bool) this.anIntArray4731 else null, i_4_, 115, i_5_, (aHa_Sub1_4729.aClass348_Sub31_7469!!.anInt6917), this.anInt4725, i_6_, if (!bool_8_) null else this.aFloatArray4719)
    }

    override fun method15(i: Int, i_9_: Int, i_10_: Int, i_11_: Int, i_12_: Int, i_13_: Int, bool: Boolean, bool_14_: Boolean) {
        anInt4721++
        Class213.method1568(this.anIntArray4731, i_9_, i, i_13_, if (bool_14_) this.aFloatArray4719 else null, if (!bool) null else (aHa_Sub1_4729!!.aClass348_Sub31_7469!!.anIntArray6916), i_10_, 113, i_11_, this.anInt4725, (aHa_Sub1_4729!!.aClass348_Sub31_7469!!.anInt6917), i_12_, if (bool_14_) aHa_Sub1_4729.aFloatArray7502 else null)
    }

    init {
        do {
            try {
                aHa_Sub1_4729 = var_ha_Sub1
                if (class105 is Class105_Sub3_Sub1) {
                    val class105_sub3_sub1 = class105
                    this.anIntArray4731 = (class105_sub3_sub1.anIntArray9933)
                    this.anInt4722 = class105_sub3_sub1.anInt8470
                    this.anInt4725 = class105_sub3_sub1.anInt8471
                } else {
                    if (class105 !is Class105_Sub3_Sub3) throw RuntimeException()
                    val class105_sub3_sub3 = class105
                    this.anInt4725 = class105_sub3_sub3.anInt8471
                    this.anInt4722 = class105_sub3_sub3.anInt8470
                    this.anIntArray4731 = (class105_sub3_sub3.anIntArray9936)
                }
                if (class216 == null) break
                aClass216_4724 = class216
                if ((aClass216_4724!!.anInt4974 != this.anInt4725) || (this.anInt4722 != aClass216_4724!!.anInt4978)) throw RuntimeException()
                this.aFloatArray4719 = aClass216_4724!!.aFloatArray4980
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, ("it.<init>(" + (if (var_ha_Sub1 != null) "{...}" else "null") + ',' + (if (class105 != null) "{...}" else "null") + ',' + (if (class216 != null) "{...}" else "null") + ')'))
            }
            break
        } while (false)
    }

    companion object {
        @JvmField
        var aFloat4720: Float = 0f
        @JvmField
        var anInt4721: Int = 0
        @JvmField
        var anInt4723: Int = 0

        @JvmField
        @Volatile
        var aBoolean4726: Boolean = true
        @JvmField
        var anInt4727: Int = 0
        @JvmField
        var aBoolean4728: Boolean = false
        @JvmField
        var aClass46_4730: Class46? = null
        @JvmStatic
        fun method453(i: Int) {
            if (i == -2001) aClass46_4730 = null
        }

        fun method454(i: Int, i_0_: Byte): Int {
            val i_1_ = 20 / ((i_0_ - -4) / 37)
            anInt4727++
            val i_2_: Int
            if (i > 12000) {
                Class133.method1140(73)
                i_2_ = 4
            } else if (i > 5000) {
                Class47.method447((-59).toByte())
                i_2_ = 3
            } else if (i <= 2000) {
                i_2_ = 1
                method3076(0, true)
            } else {
                i_2_ = 2
                Class161.method1263(true)
            }
            if (Class316.aClass348_Sub51_3959!!.aClass239_Sub25_7271!!.method1829(-32350) != 2) {
                Class316.aClass348_Sub51_3959!!.method3429(74.toByte(), (Class316.aClass348_Sub51_3959!!.aClass239_Sub25_7251), 2)
                method3553(false, 119.toByte(), 2)
            }
            method243(37)
            return i_2_
        }
    }
}
