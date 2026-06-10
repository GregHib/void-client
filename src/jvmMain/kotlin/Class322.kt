import Class110_Sub1.Companion.method1041
import Class219.Companion.method1600
import Class230.Companion.method1635
import Class258_Sub4.Companion.method1974
import Class348_Sub42_Sub9_Sub1.Companion.method3208
import Class348_Sub8.Companion.method2774
import Class71.method729
import za_Sub2.Companion.method3443

/* Class322 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class322 internal constructor(i: Int, i_9_: Int, i_10_: Int) {
    private val anInt4020: Int
    private var aClass262_4021: Class262?
    private var anInt4022: Int
    private val anInt4024: Int
    private var anInt4025 = 0
    private var anIntArrayArrayArray4029: Array<Array<IntArray?>?>?
    private var aClass348_Sub24Array4033: Array<Class348_Sub24?>?
    var aBoolean4035: Boolean
    fun method2553(i: Int): Array<Array<IntArray?>?>? {
        anInt4018++
        if (anInt4024 != anInt4020) throw RuntimeException("Can only retrieve a full image cache")
        for (i_2_ in i..<anInt4020) aClass348_Sub24Array4033!![i_2_] = Class341.aClass348_Sub24_4226
        return anIntArrayArrayArray4029
    }

    fun method2557(i: Int, i_6_: Int): Array<IntArray?>? {
        anInt4034++
        if (i >= -75) Companion.method2554((-61).toByte())
        if (anInt4020 != anInt4024) {
            if (anInt4020 == 1) {
                this.aBoolean4035 = i_6_ != anInt4022
                anInt4022 = i_6_
                return anIntArrayArrayArray4029!![0]
            }
            var class348_sub24 = aClass348_Sub24Array4033!![i_6_]
            if (class348_sub24 == null) {
                this.aBoolean4035 = true
                if (anInt4020 <= anInt4025) {
                    val class348_sub24_7_ = aClass262_4021!!.method1993(-126) as Class348_Sub24?
                    class348_sub24 = Class348_Sub24(i_6_, class348_sub24_7_!!.anInt6875)
                    aClass348_Sub24Array4033!![class348_sub24_7_.anInt6872] = null
                    class348_sub24_7_.method2715(56.toByte())
                } else {
                    class348_sub24 = Class348_Sub24(i_6_, anInt4025)
                    anInt4025++
                }
                aClass348_Sub24Array4033!![i_6_] = class348_sub24
            } else this.aBoolean4035 = false
            aClass262_4021!!.method2001(class348_sub24, -110)
            return (anIntArrayArrayArray4029!![class348_sub24.anInt6875])
        }
        this.aBoolean4035 = aClass348_Sub24Array4033!![i_6_] == null
        aClass348_Sub24Array4033!![i_6_] = Class341.aClass348_Sub24_4226
        return anIntArrayArrayArray4029!![i_6_]
    }

    fun method2558(i: Int) {
        anInt4019++
        if (i != 6144) anIntArrayArrayArray4029 = null
        var i_8_ = 0
        while (anInt4020 > i_8_) {
            anIntArrayArrayArray4029!![i_8_]!![0] = null
            anIntArrayArrayArray4029!![i_8_]!![1] = null
            anIntArrayArrayArray4029!![i_8_]!![2] = null
            anIntArrayArrayArray4029!![i_8_] = null
            i_8_++
        }
        aClass348_Sub24Array4033 = null
        anIntArrayArrayArray4029 = null
        aClass262_4021!!.method1996(99)
        aClass262_4021 = null
    }

    init {
        anInt4022 = -1
        aClass262_4021 = Class262()
        this.aBoolean4035 = false
        anInt4020 = i
        anInt4024 = i_9_
        aClass348_Sub24Array4033 = arrayOfNulls<Class348_Sub24>(anInt4024)
        anIntArrayArrayArray4029 = Array<Array<IntArray?>?>(anInt4020) { Array<IntArray?>(3) { IntArray(i_10_) } }
    }

    companion object {
        var anInt4018: Int = 0
        var anInt4019: Int = 0
        var anInt4023: Int = 0
        var anInt4026: Int = 0
        var aClass114_4027: Class114?
        var anInt4028: Int = 0
        var anInt4030: Int = 0
        var anIntArray4031: IntArray? = null
        @JvmField
        var anInt4032: Int = -1
        var anInt4034: Int = 0
        @JvmField
        var aClass308_4036: Class308?

        fun method2552(bool: Boolean, i: Int, i_0_: Int, i_1_: Int): Int {
            if (i_1_ != -24667) method2554(95.toByte())
            anInt4023++
            val class348_sub13 = method1974(4.toByte(), i, bool)
            if (class348_sub13 == null) return -1
            if (i_0_ < 0 || i_0_ >= class348_sub13.anIntArray6757!!.size) return -1
            return class348_sub13.anIntArray6757!![i_0_]
        }

        fun method2554(i: Byte) {
            if (i.toInt() != -45) anInt4032 = 61
            anInt4030++
            if (Class312.anInt3931 == 1 || Class312.anInt3931 == 3 || (Class312.anInt3931 != Class83.anInt1447 && (Class312.anInt3931 == 0 || Class83.anInt1447 == 0))) {
                Class348_Sub32.anInt6930 = 0
                Class150.anInt2057 = 0
                Class282.aClass356_3654!!.method3481(0)
            }
            Class83.anInt1447 = Class312.anInt3931
        }

        @JvmStatic
        fun method2555(i: Byte) {
            if (i.toInt() != 28) method2554(21.toByte())
            anIntArray4031 = null
            aClass114_4027 = null
            aClass308_4036 = null
        }

        fun method2556(bool: Boolean, i: Int, class318_sub1_sub3_sub3: Class318_Sub1_Sub3_Sub3) {
            anInt4028++
            var i_3_ = -1
            var i_4_ = 0
            if (Class367_Sub11.anInt7396 < class318_sub1_sub3_sub3.anInt10239) Class239_Sub26.method1834(class318_sub1_sub3_sub3, (-16).toByte())
            else if (Class367_Sub11.anInt7396 <= (class318_sub1_sub3_sub3.anInt10300)) method1041(-1, class318_sub1_sub3_sub3)
            else {
                method1600(false, 0, class318_sub1_sub3_sub3)
                i_3_ = Class235.anInt3062
                i_4_ = Class127_Sub1.anInt8387
            }
            if (bool != false) aClass114_4027 = null
            if ((class318_sub1_sub3_sub3.x < 512) || class318_sub1_sub3_sub3.y < 512 || (-512 + Class367_Sub4.anInt7319 * 512 <= class318_sub1_sub3_sub3.x) || (-512 + Class348_Sub40_Sub3.anInt9109 * 512 <= class318_sub1_sub3_sub3.y)) {
                class318_sub1_sub3_sub3.anInt10291 = -1
                class318_sub1_sub3_sub3.anInt10300 = 0
                i_4_ = 0
                i_3_ = -1
                class318_sub1_sub3_sub3.anIntArray10236 = null
                class318_sub1_sub3_sub3.anInt10269 = -1
                class318_sub1_sub3_sub3.anInt10286 = -1
                class318_sub1_sub3_sub3.anInt10239 = 0
                class318_sub1_sub3_sub3.x = (512 * (class318_sub1_sub3_sub3.anIntArray10320!![0]) + 256 * class318_sub1_sub3_sub3.method2436(120.toByte()))
                class318_sub1_sub3_sub3.y = (512 * (class318_sub1_sub3_sub3.anIntArray10317!![0]) + class318_sub1_sub3_sub3.method2436(88.toByte()) * 256)
                class318_sub1_sub3_sub3.method2427(70)
            }
            if ((Class132.aPlayer_1907 == class318_sub1_sub3_sub3) && (class318_sub1_sub3_sub3.x < 6144 || class318_sub1_sub3_sub3.y < 6144 || (class318_sub1_sub3_sub3.x >= 512 * (Class367_Sub4.anInt7319 + -12)) || (512 * (Class348_Sub40_Sub3.anInt9109 - 12) <= class318_sub1_sub3_sub3.y))) {
                class318_sub1_sub3_sub3.anInt10291 = -1
                i_3_ = -1
                class318_sub1_sub3_sub3.anInt10300 = 0
                class318_sub1_sub3_sub3.anInt10269 = -1
                class318_sub1_sub3_sub3.anInt10239 = 0
                i_4_ = 0
                class318_sub1_sub3_sub3.anIntArray10236 = null
                class318_sub1_sub3_sub3.anInt10286 = -1
                class318_sub1_sub3_sub3.x = (512 * (class318_sub1_sub3_sub3.anIntArray10320!![0]) + 256 * class318_sub1_sub3_sub3.method2436(115.toByte()))
                class318_sub1_sub3_sub3.y = (512 * (class318_sub1_sub3_sub3.anIntArray10317!![0]) + 256 * class318_sub1_sub3_sub3.method2436(115.toByte()))
                class318_sub1_sub3_sub3.method2427(54)
            }
            val i_5_ = method2774(108.toByte(), class318_sub1_sub3_sub3)
            method3443(true, class318_sub1_sub3_sub3)
            method729(i_3_, i_5_, 67.toByte(), class318_sub1_sub3_sub3, i_4_)
            method3208(class318_sub1_sub3_sub3, i_3_, -98)
            method1635(-69, class318_sub1_sub3_sub3)
        }

        init {
            aClass114_4027 = Class114(90, 10)
            aClass308_4036 = Class308(128)
        }
    }
}
