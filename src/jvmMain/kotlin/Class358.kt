import Class348_Sub17.Companion.method2929

/* Class358 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class358 internal constructor(`is`: IntArray?, is_1_: IntArray?, is_2_: IntArray?, fs: Array<FloatArray?>?) {
    var aFloatArrayArray4412: Array<FloatArray?>?
    var anIntArray4414: IntArray?
    var anIntArray4415: IntArray?
    var anIntArray4416: IntArray?

    init {
        try {
            this.anIntArray4414 = is_2_
            this.aFloatArrayArray4412 = fs
            this.anIntArray4415 = is_1_
            this.anIntArray4416 = `is`
        } catch (runtimeexception: RuntimeException) {
            throw method2929(runtimeexception, ("ew.<init>(" + (if (`is` != null) "{...}" else "null") + ',' + (if (is_1_ != null) "{...}" else "null") + ',' + (if (is_2_ != null) "{...}" else "null") + ',' + (if (fs != null) "{...}" else "null") + ')'))
        }
    }

    companion object {
        var anInt4411: Int = 0
        var anInt4413: Int = 0
        var aClass60_4417: Class60? = Class60(50)
        var aClass351_4418: Class351? = Class351(33, 8)

        @JvmStatic
        fun method3488(i: Int) {
            if (i < 25) method3489(30)
            aClass351_4418 = null
            aClass60_4417 = null
        }

        fun method3489(i: Int) {
            Class60.aHa1098!!.xa((Class316.aClass348_Sub51_3959!!.aClass239_Sub10_7232!!.method1764(-32350).toFloat() * 0.1f + 0.7f) * 1.1523438f)
            anInt4413++
            Class60.aHa1098!!.ZA(Class268.anInt3439, 0.69921875f, 1.2f, -200.0f, -240.0f, -200.0f)
            Class60.aHa1098!!.L(Class268.anInt3444, -1, 0)
            val i_0_ = -35 / ((45 - i) / 44)
            Class60.aHa1098!!.method3653(Class348_Sub42_Sub10.aClass299_9571)
        }
    }
}
