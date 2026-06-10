import Class59_Sub2_Sub2.Companion.method573
import kotlin.math.cos
import kotlin.math.sin
import kotlin.math.sqrt

/* Class175 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class175 internal constructor(private var anInt2311: Int) {
    private val aClass356_2312: Class356
    private var aClass107_2316: Class107? = Class107()
    private val anInt2324: Int
    private fun method1338(i: Int, interface14: Interface14) {
        anInt2321++
        val l = interface14.method52(117.toByte())
        var class348_sub42_sub9 = aClass356_2312.method3480(l, -6008) as Class348_Sub42_Sub9?
        while (class348_sub42_sub9 != null) {
            if (class348_sub42_sub9.anInterface14_9559!!.method53(78, interface14)) {
                method1342(class348_sub42_sub9, 79.toByte())
                break
            }
            class348_sub42_sub9 = aClass356_2312.method3476(true) as Class348_Sub42_Sub9?
        }
    }

    fun method1339(i: Int): Int {
        if (i != 100) return -3
        anInt2310++
        return anInt2324
    }

    fun method1340(i: Int, interface14: Interface14): Any? {
        anInt2313++
        val l = interface14.method52(64.toByte())
        var class348_sub42_sub9 = aClass356_2312.method3480(l, -6008) as Class348_Sub42_Sub9?
        while (class348_sub42_sub9 != null) {
            if (class348_sub42_sub9.anInterface14_9559!!.method53(94, interface14)) {
                val `object` = class348_sub42_sub9.method3205(65536)
                if (`object` == null) {
                    class348_sub42_sub9.method2715(36.toByte())
                    class348_sub42_sub9.method3162(true)
                    anInt2311 += (class348_sub42_sub9.anInt9556)
                } else {
                    if (class348_sub42_sub9.method3206((-128).toByte())) {
                        val class348_sub42_sub9_sub1 = (Class348_Sub42_Sub9_Sub1(interface14, `object`, (class348_sub42_sub9.anInt9556)))
                        aClass356_2312.method3483(125.toByte(), (class348_sub42_sub9.aLong4291), class348_sub42_sub9_sub1)
                        aClass107_2316!!.method1005(true, class348_sub42_sub9_sub1)
                        class348_sub42_sub9_sub1.aLong7057 = 0L
                        class348_sub42_sub9.method2715(65.toByte())
                        class348_sub42_sub9.method3162(true)
                    } else {
                        aClass107_2316!!.method1005(true, class348_sub42_sub9)
                        class348_sub42_sub9.aLong7057 = 0L
                    }
                    return `object`
                }
            }
            class348_sub42_sub9 = aClass356_2312.method3476(true) as Class348_Sub42_Sub9?
        }
        if (i < 66) return null
        return null
    }

    private fun method1341(`object`: Any?, interface14: Interface14?, i: Int, i_0_: Int) {
        try {
            if (i < -84) {
                anInt2314++
                check(anInt2324 >= i_0_) { "s>cs" }
                method1338(7, interface14!!)
                anInt2311 -= i_0_
                while (anInt2311 < 0) {
                    val class348_sub42_sub9 = aClass107_2316!!.method1008(20) as Class348_Sub42_Sub9?
                    method1342(class348_sub42_sub9, 60.toByte())
                }
                val class348_sub42_sub9_sub1 = Class348_Sub42_Sub9_Sub1(interface14, `object`, i_0_)
                aClass356_2312.method3483(120.toByte(), interface14.method52(120.toByte()), class348_sub42_sub9_sub1)
                aClass107_2316!!.method1005(true, class348_sub42_sub9_sub1)
                class348_sub42_sub9_sub1.aLong7057 = 0L
            }
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("pq.L(" + (if (`object` != null) "{...}" else "null") + ',' + (if (interface14 != null) "{...}" else "null") + ',' + i + ',' + i_0_ + ')'))
        }
    }

    private fun method1342(class348_sub42_sub9: Class348_Sub42_Sub9?, i: Byte) {
        anInt2317++
        if (i < 51) method1341(null, null, -110, 119)
        if (class348_sub42_sub9 != null) {
            class348_sub42_sub9.method2715(42.toByte())
            class348_sub42_sub9.method3162(true)
            anInt2311 += class348_sub42_sub9.anInt9556
        }
    }

    fun method1344(i: Byte) {
        anInt2319++
        var class348_sub42_sub9 = aClass107_2316!!.method1011(-87) as Class348_Sub42_Sub9?
        while (class348_sub42_sub9 != null) {
            if (class348_sub42_sub9.method3206(5.toByte())) {
                class348_sub42_sub9.method2715(127.toByte())
                class348_sub42_sub9.method3162(true)
                anInt2311 += class348_sub42_sub9.anInt9556
            }
            class348_sub42_sub9 = (aClass107_2316!!.method1003(69.toByte()) as Class348_Sub42_Sub9?)
        }
        if (i > -34) aBooleanArray2326 = null
    }

    fun method1345(i: Byte) {
        aClass107_2316!!.method1009(2110355138)
        anInt2325++
        aClass356_2312.method3481(0)
        val i_3_ = 18 % ((i - -89) / 35)
        anInt2311 = anInt2324
    }

    fun method1346(i: Int, i_4_: Int) {
        anInt2322++
        if (Class103.aClass345_1607 != null) {
            var class348_sub42_sub9 = aClass107_2316!!.method1011(-72) as Class348_Sub42_Sub9?
            while (class348_sub42_sub9 != null) {
                if (class348_sub42_sub9.method3206((-124).toByte())) {
                    if (class348_sub42_sub9.method3205(i + 67027) == null) {
                        class348_sub42_sub9.method2715(103.toByte())
                        class348_sub42_sub9.method3162(true)
                        anInt2311 += (class348_sub42_sub9.anInt9556)
                    }
                } else if (++class348_sub42_sub9.aLong7057 > i_4_.toLong()) {
                    val class348_sub42_sub9_5_ = Class103.aClass345_1607!!.method2694(-1, class348_sub42_sub9)
                    aClass356_2312.method3483(120.toByte(), (class348_sub42_sub9.aLong4291), class348_sub42_sub9_5_)
                    method573(class348_sub42_sub9_5_, class348_sub42_sub9, 63.toByte())
                    class348_sub42_sub9.method2715(70.toByte())
                    class348_sub42_sub9.method3162(true)
                }
                class348_sub42_sub9 = (aClass107_2316!!.method1003(59.toByte()) as Class348_Sub42_Sub9?)
            }
        }
        if (i != -1491) method1342(null, 51.toByte())
    }

    fun method1348(i: Int, `object`: Any?, interface14: Interface14?) {
        do {
            try {
                anInt2318++
                method1341(`object`, interface14, -114, 1)
                if (i > 62) break
                aClass107_2316 = null
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, ("pq.K(" + i + ',' + (if (`object` != null) "{...}" else "null") + ',' + (if (interface14 != null) "{...}" else "null") + ')'))
            }
            break
        } while (false)
    }

    fun method1350(i: Byte): Int {
        val i_21_ = -9 % ((73 - i) / 53)
        anInt2320++
        return anInt2311
    }

    init {
        anInt2324 = anInt2311
        var i_22_: Int
        i_22_ = 1
        while (i_22_ + i_22_ < anInt2311) {
            i_22_ += i_22_
        }
        aClass356_2312 = Class356(i_22_)
    }

    companion object {
        var anInt2310: Int = 0
        var anInt2313: Int = 0
        var anInt2314: Int = 0
        @JvmField
        var aClass351_2315: Class351?
        var anInt2317: Int = 0
        var anInt2318: Int = 0
        var anInt2319: Int = 0
        var anInt2320: Int = 0
        var anInt2321: Int = 0
        var anInt2322: Int = 0
        var anInt2323: Int = 0
        var anInt2325: Int = 0
        @JvmField
        var aBooleanArray2326: BooleanArray? = BooleanArray(100)
        @JvmField
        var aClass340_2327: Class340? = null
        var anInt2328: Int = 0
        @JvmField
        var aBoolean2329: Boolean = false
        @JvmField
        var anIntArray2330: IntArray? = null

        @JvmStatic
        fun method1343(i: Int, class46: Class46?, i_1_: Int, i_2_: Int) {
            Class32.anInt451 = i
            Class348_Sub36.aClass46_6990 = class46
            Class332.anInt4141 = i_2_
            anInt2328++
            if (i_1_ != 1) method1349(119.toByte())
        }

        fun method1347(i: Int, i_6_: Int, f: Float, f_7_: Float, i_8_: Int, f_9_: Float, i_10_: Int, i_11_: Int): FloatArray {
            anInt2323++
            val fs = FloatArray(9)
            var fs_12_ = FloatArray(9)
            var f_13_ = cos((i_11_.toFloat() * 0.024543693f).toDouble()).toFloat()
            val i_14_ = -94 / ((i_8_ - 57) / 62)
            var f_15_ = sin((0.024543693f * i_11_.toFloat()).toDouble()).toFloat()
            fs[6] = -f_15_
            var f_16_ = -f_13_ + 1.0f
            fs[8] = f_13_
            fs[3] = 0.0f
            fs[1] = 0.0f
            fs[2] = f_15_
            fs[4] = 1.0f
            fs[5] = 0.0f
            fs[0] = f_13_
            fs[7] = 0.0f
            val fs_17_ = FloatArray(9)
            var f_18_ = 1.0f
            f_13_ = i_6_.toFloat() / 32767.0f
            var f_19_ = 0.0f
            f_16_ = -f_13_ + 1.0f
            f_15_ = -sqrt((1.0f - f_13_ * f_13_).toDouble()).toFloat()
            val f_20_ = sqrt((i_10_ * i_10_ + i * i).toDouble()).toFloat()
            if (f_20_ == 0.0f && f_13_ == 0.0f) fs_12_ = fs
            else {
                if (f_20_ != 0.0f) {
                    f_18_ = -i.toFloat() / f_20_
                    f_19_ = i_10_.toFloat() / f_20_
                }
                fs_17_[5] = f_18_ * f_15_
                fs_17_[2] = f_18_ * f_19_ * f_16_
                fs_17_[8] = f_13_ + f_16_ * (f_19_ * f_19_)
                fs_17_[4] = f_13_
                fs_17_[0] = f_16_ * (f_18_ * f_18_) + f_13_
                fs_17_[6] = f_16_ * (f_19_ * f_18_)
                fs_17_[3] = f_15_ * -f_19_
                fs_17_[1] = f_15_ * f_19_
                fs_17_[7] = f_15_ * -f_18_
                fs_12_[0] = fs_17_[0] * fs[0] + fs[1] * fs_17_[3] + fs_17_[6] * fs[2]
                fs_12_[1] = fs_17_[7] * fs[2] + (fs[1] * fs_17_[4] + fs[0] * fs_17_[1])
                fs_12_[2] = fs[1] * fs_17_[5] + fs[0] * fs_17_[2] + fs[2] * fs_17_[8]
                fs_12_[3] = fs_17_[0] * fs[3] + fs[4] * fs_17_[3] + fs_17_[6] * fs[5]
                fs_12_[4] = fs[5] * fs_17_[7] + (fs[3] * fs_17_[1] + fs[4] * fs_17_[4])
                fs_12_[6] = fs_17_[0] * fs[6] + fs[7] * fs_17_[3] + fs_17_[6] * fs[8]
                fs_12_[5] = fs[4] * fs_17_[5] + fs_17_[2] * fs[3] + fs[5] * fs_17_[8]
                fs_12_[7] = fs_17_[1] * fs[6] + fs_17_[4] * fs[7] + fs[8] * fs_17_[7]
                fs_12_[8] = fs_17_[5] * fs[7] + fs[6] * fs_17_[2] + fs[8] * fs_17_[8]
            }
            fs_12_[7] *= f
            fs_12_[4] *= f_9_
            fs_12_[3] *= f_9_
            fs_12_[5] *= f_9_
            fs_12_[2] *= f_7_
            fs_12_[8] *= f
            fs_12_[6] *= f
            fs_12_[1] *= f_7_
            fs_12_[0] *= f_7_
            return fs_12_
        }

        @JvmStatic
        fun method1349(i: Byte) {
            anIntArray2330 = null
            aClass340_2327 = null
            aBooleanArray2326 = null
            aClass351_2315 = null
            if (i > -103) aBooleanArray2326 = null
        }

        init {
            aClass351_2315 = Class351(18, 3)
        }
    }
}
