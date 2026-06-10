/* i - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class i : Class64, Interface19 {
    private val anOa5117: oa
    @JvmField
    var aClass342Array5118: Array<Class342?>? = null
    @JvmField
    var nativeid: Long = 0
    @JvmField
    var aClass129Array5119: Array<Class129?>? = null
    private val aYa5120: ya?

    public external override fun C(i: Int)

    public external override fun k(i: Int)

    external override fun w(bool: Boolean)

    public external override fun O(i: Int, i_0_: Int, i_1_: Int)

    public external override fun s(i: Int)

    public external override fun LA(i: Int)

    public external override fun fa(): Int

    public external override fun NA(): Boolean

    public external override fun F(): Boolean

    external fun ZA(var_i_2_: i?, var_i_3_: i?, i: Int, bool: Boolean, bool_4_: Boolean)

    public override fun method613(class64: Class64?, i: Int, i_5_: Int, i_6_: Int, bool: Boolean) {
        anOa5117.method3973()?.method144(this, class64, i, i_5_, i_6_, bool)
    }

    public external override fun aa(i: Short, i_7_: Short)

    public override fun method623(i: Int, i_8_: Int, class101: Class101?, bool: Boolean, i_9_: Int, i_10_: Int): Boolean {
        return anOa5117.method3973()!!.method143(this, i, i_8_, class101, bool, i_10_)
    }

    public external override fun EA(): Int

    public override fun method619(): Array<Class129?>? {
        return this.aClass129Array5119
    }

    public external override fun wa()

    public external override fun P(i: Int, i_11_: Int, i_12_: Int, i_13_: Int)

    public override fun method608(class101: Class101?, class318_sub3: Class318_Sub3?, i: Int, i_14_: Int) {
        if (class318_sub3 == null) anOa5117.method3973()!!.method149(this, class101, null, i, i_14_)
        else {
            oa.Companion.anIntArray5132[5] = 0
            anOa5117.method3973()!!.method149(this, class101, oa.Companion.anIntArray5132, i, i_14_)
            class318_sub3.anInt6405 = oa.Companion.anIntArray5132[0]
            class318_sub3.anInt6402 = oa.Companion.anIntArray5132[1]
            class318_sub3.anInt6406 = oa.Companion.anIntArray5132[2]
            class318_sub3.anInt6404 = oa.Companion.anIntArray5132[3]
            class318_sub3.anInt6403 = oa.Companion.anIntArray5132[4]
            class318_sub3.aBoolean6401 = oa.Companion.anIntArray5132[5] != 0
        }
    }

    public external override fun v()

    private external fun l(l: Long, i: Int, `is`: IntArray?, i_15_: Int, i_16_: Int, i_17_: Int, i_18_: Int, bool: Boolean)

    public override fun method618(): Boolean {
        return true
    }

    public override fun method621() {
        if (anOa5117.anInt5141 > 1) {
            synchronized(this) {
                this.aBoolean1124 = false
                (this as Object).notifyAll()
            }
        }
    }

    public external override fun VA(i: Int)

    public override fun method628(i: Int, i_19_: Int, class101: Class101?, bool: Boolean, i_20_: Int): Boolean {
        return anOa5117.method3973()!!.method146(this, i, i_19_, class101, bool)
    }

    public override fun method614(i: Byte, i_21_: Int, bool: Boolean): Class64 {
        return anOa5117.method3973()!!.method152(this, i, i_21_, bool)
    }

    public external override fun na(): Int

    public external override fun HA(): Int

    public override fun method612() {
        /* empty */
    }

    public external override fun p(i: Int, i_22_: Int, var_s: s?, var_s_23_: s?, i_24_: Int, i_25_: Int, i_26_: Int)

    public external override fun V(): Int

    public external override fun da(): Int

    public override fun method605(i: Int, `is`: IntArray, i_27_: Int, i_28_: Int, i_29_: Int, i_30_: Int, bool: Boolean) {
        l(this.nativeid, i, `is`, i_27_, i_28_, i_29_, i_30_, bool)
    }

    public external override fun G(): Int

    public external override fun ma(): Int

    private external fun R(
        var_oa: oa?,
        var_ya: ya?,
        i: Int,
        i_31_: Int,
        `is`: IntArray?,
        is_32_: IntArray?,
        is_33_: IntArray?,
        is_34_: IntArray?,
        is_35_: ShortArray?,
        i_36_: Int,
        is_37_: ShortArray?,
        is_38_: ShortArray?,
        is_39_: ShortArray?,
        is_40_: ByteArray?,
        is_41_: ByteArray?,
        is_42_: ByteArray?,
        is_43_: ByteArray?,
        is_44_: ShortArray?,
        is_45_: ShortArray?,
        is_46_: IntArray?,
        i_47_: Byte,
        is_48_: ShortArray?,
        i_49_: Int,
        is_50_: ByteArray?,
        is_51_: ShortArray?,
        is_52_: ShortArray?,
        is_53_: ShortArray?,
        is_54_: IntArray?,
        is_55_: IntArray?,
        is_56_: IntArray?,
        is_57_: ByteArray?,
        is_58_: ByteArray?,
        is_59_: IntArray?,
        is_60_: IntArray?,
        is_61_: IntArray?,
        is_62_: IntArray?,
        i_63_: Int,
        i_64_: Int,
        i_65_: Int,
        i_66_: Int,
        i_67_: Int,
        i_68_: Int,
        is_69_: IntArray?
    )

    public external override fun FA(i: Int)

    public override fun method624(i: Int, i_70_: Int, i_71_: Int, i_72_: Int) {
        /* empty */
    }

    public external override fun ia(i: Short, i_73_: Short)

    protected fun finalize() {
        if (this.nativeid != 0L) Class257.method1947(0, this)
    }

    public external override fun WA(): Int

    public override fun method610(class101: Class101, i: Int, bool: Boolean) {
        A((class101 as ja).nativeid, i, bool)
    }

    public override fun method622() {
        if (anOa5117.anInt5141 > 1) {
            synchronized(this) {
                while (this.aBoolean1124) {
                    try {
                        (this as Object).wait()
                    } catch (interruptedexception: InterruptedException) {
                        /* empty */
                    }
                }
                this.aBoolean1124 = true
            }
        }
    }

    public override fun method615(class101: Class101?, class318_sub3: Class318_Sub3?, i: Int) {
        if (class318_sub3 == null) anOa5117.method3973()?.method145(this, class101!!, null, i)
        else {
            oa.Companion.anIntArray5132[5] = 0
            anOa5117.method3973()?.method145(this, class101!!, oa.Companion.anIntArray5132, i)
            class318_sub3.anInt6405 = oa.Companion.anIntArray5132[0]
            class318_sub3.anInt6402 = oa.Companion.anIntArray5132[1]
            class318_sub3.anInt6406 = oa.Companion.anIntArray5132[2]
            class318_sub3.anInt6404 = oa.Companion.anIntArray5132[3]
            class318_sub3.anInt6403 = oa.Companion.anIntArray5132[4]
            class318_sub3.aBoolean6401 = oa.Companion.anIntArray5132[5] != 0
        }
    }

    public external override fun r(): Boolean

    public override fun method620(class101: Class101?) {
        method693(oa.Companion.anIntArray5140, class101)
        var i = 0
        if (this.aClass129Array5119 != null) {
            for (i_74_ in this.aClass129Array5119!!.indices) {
                val class129 = this.aClass129Array5119!![i_74_]!!
                class129.anInt1882 = oa.Companion.anIntArray5140[i++]
                class129.anInt1891 = oa.Companion.anIntArray5140[i++]
                class129.anInt1889 = oa.Companion.anIntArray5140[i++]
                class129.anInt1883 = oa.Companion.anIntArray5140[i++]
                class129.anInt1890 = oa.Companion.anIntArray5140[i++]
                class129.anInt1880 = oa.Companion.anIntArray5140[i++]
                class129.anInt1876 = oa.Companion.anIntArray5140[i++]
                class129.anInt1874 = oa.Companion.anIntArray5140[i++]
                class129.anInt1884 = oa.Companion.anIntArray5140[i++]
            }
        }
        if (this.aClass342Array5118 != null) {
            for (i_75_ in this.aClass342Array5118!!.indices) {
                val class342 = this.aClass342Array5118!![i_75_]!!
                var class342_76_: Class342? = class342
                if (class342.aClass342_4248 != null) class342_76_ = class342.aClass342_4248
                if (class342.aClass101_4252 != null) class342.aClass101_4252!!.method898(class101)
                else class342.aClass101_4252 = class101!!.method907()
                class342_76_!!.anInt4238 = oa.Companion.anIntArray5140[i++]
                class342_76_.anInt4239 = oa.Companion.anIntArray5140[i++]
                class342_76_.anInt4240 = oa.Companion.anIntArray5140[i++]
            }
        }
    }

    public external override fun a(i: Int)

    public override fun method604(): Array<Class342?>? {
        return this.aClass342Array5118
    }

    private fun method693(`is`: IntArray?, class101: Class101?) {
        anOa5117.method3973()!!.method151(this, `is`, class101)
    }

    public external override fun ua(): Int

    public external override fun H(i: Int, i_77_: Int, i_78_: Int)

    constructor(var_oa: oa, var_ya: ya?, class124: Class124, i: Int, i_79_: Int, i_80_: Int, i_81_: Int) {
        anOa5117 = var_oa
        aYa5120 = var_ya
        this.aClass129Array5119 = class124.aClass129Array1846
        this.aClass342Array5118 = class124.aClass342Array1866
        val i_82_ = (if (class124.aClass129Array1846 == null) 0 else class124.aClass129Array1846!!.size)
        val i_83_ = (if (class124.aClass342Array1866 == null) 0 else class124.aClass342Array1866!!.size)
        var i_84_ = 0
        val `is` = IntArray(i_82_ * 3 + i_83_)
        for (i_85_ in 0..<i_82_) {
            `is`[i_84_++] = this.aClass129Array5119!![i_85_]!!.anInt1881
            `is`[i_84_++] = this.aClass129Array5119!![i_85_]!!.anInt1877
            `is`[i_84_++] = this.aClass129Array5119!![i_85_]!!.anInt1892
        }
        for (i_86_ in 0..<i_83_) `is`[i_84_++] = this.aClass342Array5118!![i_86_]!!.anInt4244
        val i_87_ = (if (class124.aClass162Array1832 == null) 0 else class124.aClass162Array1832!!.size)
        val is_88_ = IntArray(i_87_ * 8)
        var i_89_ = 0
        for (i_90_ in 0..<i_87_) {
            val class162 = class124.aClass162Array1832!![i_90_]!!
            val class189 = Class73.method742(104, class162.anInt2153)
            is_88_[i_89_++] = class162.anInt2155
            is_88_[i_89_++] = class189.anInt2526
            is_88_[i_89_++] = class189.anInt2530
            is_88_[i_89_++] = class189.anInt2525
            is_88_[i_89_++] = class189.anInt2533
            is_88_[i_89_++] = class189.anInt2534
            is_88_[i_89_++] = if (class189.aBoolean2531) -1 else 0
        }
        for (i_91_ in 0..<i_87_) {
            val class162 = class124.aClass162Array1832!![i_91_]!!
            is_88_[i_89_++] = class162.anInt2156
        }
        R(
            anOa5117,
            aYa5120,
            class124.anInt1836,
            class124.anInt1821,
            class124.anIntArray1841,
            class124.anIntArray1847,
            class124.anIntArray1852,
            class124.anIntArray1868,
            class124.aShortArray1842,
            class124.anInt1817,
            class124.aShortArray1863,
            class124.aShortArray1835,
            class124.aShortArray1855,
            class124.aByteArray1843,
            class124.aByteArray1839,
            class124.aByteArray1834,
            class124.aByteArray1820,
            class124.aShortArray1862,
            class124.aShortArray1822,
            class124.anIntArray1824,
            class124.aByte1851,
            class124.aShortArray1856,
            class124.anInt1818,
            class124.aByteArray1823,
            class124.aShortArray1829,
            class124.aShortArray1849,
            class124.aShortArray1825,
            class124.anIntArray1859,
            class124.anIntArray1816,
            class124.anIntArray1844,
            class124.aByteArray1833,
            class124.aByteArray1853,
            class124.anIntArray1867,
            class124.anIntArray1857,
            class124.anIntArray1865,
            `is`,
            i_82_,
            i_83_,
            i,
            i_79_,
            i_80_,
            i_81_,
            is_88_
        )
    }

    private external fun A(l: Long, i: Int, bool: Boolean)

    public external override fun ba(var_r: r?): r?

    private external fun oa(var_oa: oa?)

    constructor(var_oa: oa) {
        anOa5117 = var_oa
        aYa5120 = null
        oa(var_oa)
    }

    public external override fun RA(): Int

    public external override fun I(i: Int, `is`: IntArray, i_92_: Int, i_93_: Int, i_94_: Int, bool: Boolean, i_95_: Int, is_96_: IntArray?)
}
