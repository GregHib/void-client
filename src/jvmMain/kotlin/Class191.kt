import Class367.Companion.method3529
import aa_Sub2.Companion.method165

/* Class191 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class191 internal constructor(i: Int, i_16_: Int, i_17_: Int) {
    private var anInt2557 = 0
    private val anInt2559: Int
    private var aClass262_2561: Class262?
    private var anInt2562 = -1
    private var aClass348_Sub6Array2563: Array<Class348_Sub6?>?
    private var anIntArrayArray2564: Array<IntArray?>?
    private var anInt2565: Int
    var aBoolean2570: Boolean
    fun method1427(i: Byte): Array<IntArray?>? {
        anInt2558++
        if (anInt2559 != anInt2565) throw RuntimeException("Can only retrieve a full image cache")
        var i_0_ = 0
        while (anInt2559 > i_0_) {
            aClass348_Sub6Array2563!![i_0_] = aa_Sub3.aClass348_Sub6_5206
            i_0_++
        }
        if (i.toInt() != 16) method1427((-42).toByte())
        return anIntArrayArray2564
    }

    fun method1432(i: Byte) {
        for (i_13_ in 0..<anInt2559) anIntArrayArray2564!![i_13_] = null
        anInt2556++
        aClass348_Sub6Array2563 = null
        anIntArrayArray2564 = null
        aClass262_2561!!.method1996(112)
        if (i.toInt() != 124) anInt2565 = -126
        aClass262_2561 = null
    }

    fun method1433(i: Int, i_14_: Int): IntArray? {
        if (i != 0) method1427(108.toByte())
        anInt2566++
        if (anInt2559 == anInt2565) {
            this.aBoolean2570 = aClass348_Sub6Array2563!![i_14_] == null
            aClass348_Sub6Array2563!![i_14_] = aa_Sub3.aClass348_Sub6_5206
            return anIntArrayArray2564!![i_14_]
        }
        if (anInt2559 != 1) {
            var class348_sub6 = aClass348_Sub6Array2563!![i_14_]
            if (class348_sub6 == null) {
                this.aBoolean2570 = true
                if (anInt2557 < anInt2559) {
                    class348_sub6 = Class348_Sub6(i_14_, anInt2557)
                    anInt2557++
                } else {
                    val class348_sub6_15_ = aClass262_2561!!.method1993(i + -123) as Class348_Sub6?
                    class348_sub6 = Class348_Sub6(i_14_, class348_sub6_15_!!.anInt6636)
                    aClass348_Sub6Array2563!![class348_sub6_15_.anInt6630] = null
                    class348_sub6_15_.method2715(80.toByte())
                }
                aClass348_Sub6Array2563!![i_14_] = class348_sub6
            } else this.aBoolean2570 = false
            aClass262_2561!!.method2001(class348_sub6, -90)
            return (anIntArrayArray2564!![class348_sub6.anInt6636])
        }
        this.aBoolean2570 = i_14_ != anInt2562
        anInt2562 = i_14_
        return anIntArrayArray2564!![0]
    }

    init {
        aClass262_2561 = Class262()
        this.aBoolean2570 = false
        anInt2559 = i
        anInt2565 = i_16_
        aClass348_Sub6Array2563 = arrayOfNulls<Class348_Sub6>(anInt2565)
        anIntArrayArray2564 = Array<IntArray?>(anInt2559) { IntArray(i_17_) }
    }

    companion object {
        var anInt2556: Int = 0
        var anInt2558: Int = 0
        var anInt2560: Int = 0
        var anInt2566: Int = 0
        var anInt2567: Int = 0
        var aClass227_2568: Class227? = Class227(0)
        var anInt2569: Int = 0
        @JvmField
        var aClass304_2571: Class304? = Class304(2)

        @JvmStatic
        fun method1428(bool: Boolean) {
            Class342.anImage4249 = null
            anInt2569++
            Class351.aFont4329 = null
            if (bool != true) method1431(-122)
        }

        fun method1429(string: String?, i: Int) {
            Class286_Sub2.method2144("", i, (-125).toByte(), 0, string, "", "")
            anInt2560++
        }

        fun method1430(i: Int, i_1_: Byte, i_2_: Int, i_3_: Int, i_4_: Int, i_5_: Int, i_6_: Int, i_7_: Int, class318_sub1_sub3_sub3: Class318_Sub1_Sub3_Sub3?, class318_sub1_sub3_sub3_8_: Class318_Sub1_Sub3_Sub3?) {
            try {
                anInt2567++
                val i_9_ = class318_sub1_sub3_sub3!!.method2425(-1)
                if (i_9_ != -1) {
                    val `object`: Any? = null
                    var class105 = (Class348_Sub1_Sub1.aClass60_8807!!.method583(i_9_.toLong(), 118) as? Class105?)
                    if (class105 == null) {
                        val class207s = Class207.method1519(Class21.aClass45_322!!, i_9_, 0)
                        if (class207s == null) return
                        class105 = Class348_Sub8.aHa6654!!.method3691(class207s[0], true)
                        Class348_Sub1_Sub1.aClass60_8807!!.method582(class105, i_9_.toLong(), (-115).toByte())
                    }
                    method165(class318_sub1_sub3_sub3_8_!!.plane.toInt(), i_5_, 0, i_3_ shr 1, class318_sub1_sub3_sub3_8_.x, class318_sub1_sub3_sub3_8_.method2436(126.toByte()) * 256, class318_sub1_sub3_sub3_8_.y, 92.toByte(), i_6_ shr 1, i_2_)
                    var i_10_ = i_7_ + (Class239_Sub21.anIntArray6062!![0] + -18)
                    var i_11_ = -54 + (Class239_Sub21.anIntArray6062!![1] + i_4_) - 16
                    i_10_ += i / 4 * 18
                    i_11_ += 18 * (i % 4)
                    val i_12_ = -76 / ((i_1_ - 3) / 38)
                    class105!!.method974(i_10_, i_11_)
                    if (class318_sub1_sub3_sub3 === class318_sub1_sub3_sub3_8_) Class348_Sub8.aHa6654!!.method3668(18, -1 + i_11_, -256, i_10_ - 1, 18, 57)
                    Class338.method2663(-5590, i_10_ + -1, 18 + i_10_, i_11_ + -1, i_11_ - -18)
                    val class318_sub6 = method3529(32564)
                    class318_sub6.anInt6426 = 16 + i_10_
                    class318_sub6.anInt6427 = i_11_
                    class318_sub6.aClass318_Sub1_Sub3_Sub3_6431 = class318_sub1_sub3_sub3
                    class318_sub6.anInt6425 = i_11_ - -16
                    class318_sub6.anInt6429 = i_10_
                    InputStream_Sub2.aClass243_83!!.method1869(-87, class318_sub6)
                }
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, ("qk.G(" + i + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ',' + (if (class318_sub1_sub3_sub3 != null) "{...}" else "null") + ',' + (if (class318_sub1_sub3_sub3_8_ != null) "{...}" else "null") + ')'))
            }
        }

        @JvmStatic
        fun method1431(i: Int) {
            aClass304_2571 = null
            aClass227_2568 = null
            if (i != 0) aClass227_2568 = null
        }
    }
}
