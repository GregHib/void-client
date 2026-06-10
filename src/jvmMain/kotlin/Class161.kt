import Class348_Sub40.Companion.method3038
import Class348_Sub40_Sub32.Companion.method3134
import Class62.method599
import Class76.Companion.method773

/* Class161 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class161 {
    @JvmField
    var anInt2138: Int
    private var aBoolean2139 = false
    @JvmField
    var anInt2143: Int = 0
    private var aBoolean2146 = true
    @JvmField
    var aString2147: String? = null
    @JvmField
    var anInt2148: Int = 43594
    fun method1259(i: Int) {
        if (i != 0) method1258(39, 119, 4)
        anInt2149++
        if (!aBoolean2146) {
            aBoolean2139 = true
            aBoolean2146 = true
        } else if (!aBoolean2139) aBoolean2146 = false
        else aBoolean2139 = false
    }

    fun method1262(class297: Class297, i: Byte): Class144? {
        if (i.toInt() != 36) method1258(-105, -70, -80)
        anInt2144++
        return class297.method2235(aBoolean2139, (if (aBoolean2146) this.anInt2138 else this.anInt2148), this.aString2147, i.toInt() xor 0x6e65)
    }

    fun method1264(i: Byte, class161_2_: Class161?): Boolean {
        if (i <= 69) return false
        anInt2141++
        if (class161_2_ != null) {
            return (this.anInt2143 == class161_2_.anInt2143) && this.aString2147 == class161_2_.aString2147
        }
        return false
    }

    init {
        this.anInt2138 = Loader.port
    }

    companion object {
        var anInt2140: Int = 0
        var anInt2141: Int = 0
        var anInt2142: Int = 0
        var anInt2144: Int = 0
        var anIntArray2145: IntArray? = IntArray(25)
        var anInt2149: Int = 0
        var anInt2150: Int = 0
        @JvmField
        var aBoolean2151: Boolean = false

        @JvmStatic
        fun method1258(i: Int, i_0_: Int, i_1_: Int): Boolean {
            if (i_0_ != -9301) method1263(true)
            anInt2150++
            return (0x800 and i) != 0
        }

        fun method1260(bool: Boolean, i: Int, class190: Class190?) {
            var i = i
            if (Class348_Sub40_Sub10.aBoolean9181) {
                Class348_Sub40_Sub10.aBoolean9181 = false
                i = 0
            }
            anInt2140++
            if (Class239_Sub14.aClass190_5990 == null || !Class239_Sub14.aClass190_5990!!.method1424(class190!!, 84.toByte())) {
                Class239_Sub14.aClass190_5990 = class190
                Class348_Sub33.aLong6963 = method599(-78)
                Class286_Sub5.anInt6248 = i
                Class206.anInt4889 = Class286_Sub5.anInt6248
                if (Class206.anInt4889 == 0) method3134(-1)
                else {
                    Class318_Sub1_Sub1.aFloat8725 = Class160.Companion.aFloat2137
                    Canvas_Sub1.anInt70 = Class187.anInt2500
                    Class239_Sub24.aClass299_6098 = Class158.aClass299_4938
                    Class64.aFloat1136 = Class244.aFloat4626
                    Class245.aFloat3172 = Class269.aFloat3462
                    Class45.aFloat670 = Class348_Sub3.aFloat6586
                    Class258_Sub4.aFloat8560 = Class239_Sub10.aFloat5945
                    Class246.aFloat3177 = Class361.aFloat4455
                    Class318_Sub1_Sub3.anInt8739 = Class119_Sub1.anInt4703
                    Class239_Sub19.anInt6042 = Class36.anInt486
                }
            }
            if (bool != false) aBoolean2151 = true
        }

        @JvmStatic
        fun method1261(i: Byte) {
            if (i > 46) anIntArray2145 = null
        }

        fun method1263(bool: Boolean) {
            Class316.aClass348_Sub51_3959!!.method3429(74.toByte(), (Class316.aClass348_Sub51_3959!!.aClass239_Sub27_7255), 1)
            anInt2142++
            Class316.aClass348_Sub51_3959!!.method3429(74.toByte(), (Class316.aClass348_Sub51_3959!!.aClass239_Sub27_7261), 1)
            Class316.aClass348_Sub51_3959!!.method3429(74.toByte(), (Class316.aClass348_Sub51_3959!!.aClass239_Sub14_7250), 1)
            Class316.aClass348_Sub51_3959!!.method3429(74.toByte(), (Class316.aClass348_Sub51_3959!!.aClass239_Sub14_7264), 1)
            Class316.aClass348_Sub51_3959!!.method3429(74.toByte(), (Class316.aClass348_Sub51_3959!!.aClass239_Sub4_7220), 1)
            Class316.aClass348_Sub51_3959!!.method3429(74.toByte(), (Class316.aClass348_Sub51_3959!!.aClass239_Sub9_7256), 1)
            Class316.aClass348_Sub51_3959!!.method3429(74.toByte(), (Class316.aClass348_Sub51_3959!!.aClass239_Sub13_7236), 0)
            Class316.aClass348_Sub51_3959!!.method3429(74.toByte(), (Class316.aClass348_Sub51_3959!!.aClass239_Sub1_7246), 0)
            Class316.aClass348_Sub51_3959!!.method3429(74.toByte(), (Class316.aClass348_Sub51_3959!!.aClass239_Sub21_7270), 0)
            Class316.aClass348_Sub51_3959!!.method3429(74.toByte(), (Class316.aClass348_Sub51_3959!!.aClass239_Sub7_7238), 0)
            Class316.aClass348_Sub51_3959!!.method3429(74.toByte(), (Class316.aClass348_Sub51_3959!!.aClass239_Sub24_7235), 0)
            Class316.aClass348_Sub51_3959!!.method3429(74.toByte(), (Class316.aClass348_Sub51_3959!!.aClass239_Sub28_7230), 0)
            Class316.aClass348_Sub51_3959!!.method3429(74.toByte(), (Class316.aClass348_Sub51_3959!!.aClass239_Sub18_7259), 0)
            Class316.aClass348_Sub51_3959!!.method3429(74.toByte(), (Class316.aClass348_Sub51_3959!!.aClass239_Sub16_7247), 0)
            Class316.aClass348_Sub51_3959!!.method3429(74.toByte(), (Class316.aClass348_Sub51_3959!!.aClass239_Sub20_7216), 0)
            Class316.aClass348_Sub51_3959!!.method3429(74.toByte(), (Class316.aClass348_Sub51_3959!!.aClass239_Sub20_7248), 0)
            Class316.aClass348_Sub51_3959!!.method3429(74.toByte(), (Class316.aClass348_Sub51_3959!!.aClass239_Sub15_7224), 0)
            Class316.aClass348_Sub51_3959!!.method3429(74.toByte(), (Class316.aClass348_Sub51_3959!!.aClass239_Sub6_7226), 0)
            Class316.aClass348_Sub51_3959!!.method3429(74.toByte(), (Class316.aClass348_Sub51_3959!!.aClass239_Sub12_7243), 0)
            Class237.method1686(55)
            Class316.aClass348_Sub51_3959!!.method3429(74.toByte(), (Class316.aClass348_Sub51_3959!!.aClass239_Sub23_7231), 2)
            Class316.aClass348_Sub51_3959!!.method3429(74.toByte(), (Class316.aClass348_Sub51_3959!!.aClass239_Sub29_7229), 2)
            method3038(-1)
            method773(bool)
            RuntimeException_Sub1.aBoolean4604 = true
        }
    }
}
