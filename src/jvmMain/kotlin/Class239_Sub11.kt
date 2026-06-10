/* Class239_Sub11 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class239_Sub11 : Class239 {
    fun method1768(i: Int): Int {
        if (i != -32350) method1767(true, -55)
        anInt5958++
        return this.anInt3138
    }

    override fun method1710(i: Int): Int {
        anInt5956++
        if (i != 20014) return -48
        return 0
    }

    override fun method1716(bool: Boolean) {
        if (bool != false) method1716(false)
        anInt5954++
        if (this.anInt3138 != 1 && this.anInt3138 != 0) this.anInt3138 = method1710(20014)
    }

    internal constructor(i: Int, class348_sub51: Class348_Sub51) : super(i, class348_sub51)

    override fun method1712(i: Int, i_2_: Int) {
        anInt5952++
        this.anInt3138 = i_2_
        val i_3_ = 98 / ((82 - i) / 35)
    }

    internal constructor(class348_sub51: Class348_Sub51) : super(class348_sub51)

    override fun method1714(i: Int, i_15_: Int): Int {
        if (i != 3) return 94
        anInt5955++
        return 1
    }

    companion object {
        @JvmField
        var aClass114_5949: Class114? = Class114(69, 12)
        @JvmField
        var aClass114_5950: Class114?
        @JvmField
        var anInt5951: Int = 1339
        @JvmField
        var anInt5952: Int = 0
        @JvmField
        var anInt5953: Int = 0
        @JvmField
        var anInt5954: Int = 0
        @JvmField
        var anInt5955: Int = 0
        @JvmField
        var anInt5956: Int = 0
        @JvmField
        var anInt5957: Int = 0
        @JvmField
        var anInt5958: Int = 0
        @JvmField
        var anInt5959: Int

        @JvmStatic
        fun method1767(bool: Boolean, i: Int) {
            anInt5953++
            Class101_Sub3.method947(41.toByte())
            val i_0_ = (Class269.aClass217_3453!!.method1588(-51, i).anInt2125)
            if (i_0_ != 0) {
                if (bool != true) method1769(-43)
                val i_1_ = (Class318_Sub1_Sub3_Sub3.aClass170_10209!!.anIntArray5063[i])
                if (i_0_ == 5) Class318_Sub1_Sub5.anInt8770 = i_1_
                if (i_0_ == 6) Class348_Sub40_Sub31.anInt9408 = i_1_
            }
        }

        @JvmStatic
        fun method1769(i: Int) {
            aClass114_5950 = null
            if (i != 100) method1769(-25)
            aClass114_5949 = null
        }

        @JvmStatic
        fun method1770(i: Byte): Int {
            anInt5957++
            if (Class367_Sub8.anInt7365 == 0) {
                Class267.aClass267_3401!!.method2025(Class309("jaclib"), false)
                if (Class267.aClass267_3401!!.method2027(119)!!.method31(28) != 100) return 1
                if (!(Class267.aClass267_3401!!.method2027(71) as Class309).method2313(124)) Class79.aClient1367!!.method97(i + 24)
                Class367_Sub8.anInt7365 = 1
            }
            if (Class367_Sub8.anInt7365 == 1) {
                Class126.aClass267Array4987 = Class267.method2029(110)
                Class267.aClass267_3396!!.method2025(Class292(Class367_Sub8.aClass45_7362!!), false)
                Class267.aClass267_3402!!.method2025(Class309("jaggl"), false)
                Class267.aClass267_3403!!.method2025(Class309("jagdx"), false)
                Class267.aClass267_3404!!.method2025(Class309("jagmisc"), false)
                Class267.aClass267_3405!!.method2025(Class309("sw3d"), false)
                Class267.aClass267_3406!!.method2025(Class309("hw3d"), false)
                Class267.aClass267_3407!!.method2025(Class309("jagtheora"), false)
                Class267.aClass267_3408!!.method2025(Class292(Class136.aClass45_4796!!), false)
                Class267.aClass267_3409!!.method2025(Class292(Class348_Sub11.aClass45_4770!!), false)
                Class267.aClass267_3410!!.method2025(Class292(Class95.aClass45_1541!!), false)
                Class267.aClass267_3411!!.method2025(Class292(Class94.aClass45_1538!!), false)
                Class267.aClass267_3412!!.method2025(Class292(Class247.aClass45_3183!!), false)
                Class267.aClass267_3413!!.method2025(Class292(Class216.aClass45_4975!!), false)
                Class267.aClass267_3414!!.method2025(Class292(Class174.aClass45_2306!!), false)
                Class267.aClass267_3415!!.method2025(Class292(r_Sub2.aClass45_10480!!), false)
                Class267.aClass267_3416!!.method2025(Class292(Class78.aClass45_1322!!), false)
                Class267.aClass267_3417!!.method2025(Class292(Class348_Sub16_Sub3.aClass45_8926!!), false)
                Class267.aClass267_3418!!.method2025(Class292(Class130.aClass45_1897!!), false)
                Class267.aClass267_3419!!.method2025(Class292(Class82.aClass45_1434!!), false)
                Class267.aClass267_3420!!.method2025(Class292(aClass45_3146!!), false)
                Class267.aClass267_3421!!.method2025(Class292(Class262.aClass45_3323!!), false)
                Class267.aClass267_3422!!.method2025(Class73((Class16.aClass45_233), "huffman"), false)
                Class267.aClass267_3423!!.method2025(Class292(Class348_Sub35.aClass45_6980!!), false)
                Class267.aClass267_3424!!.method2025(Class292(Class113.aClass45_1743!!), false)
                Class267.aClass267_3425!!.method2025(Class292(Class104.aClass45_1627!!), false)
                Class267.aClass267_3426!!.method2025(Class136((Class348_Sub32.aClass45_6950), "details"), false)
                for (i_4_ in Class126.aClass267Array4987!!.indices) {
                    if (Class126.aClass267Array4987!![i_4_]!!.method2027(78) == null) throw RuntimeException()
                }
                var i_5_ = 0
                val class267s = Class126.aClass267Array4987!!
                for (i_6_ in class267s.indices) {
                    val class267 = class267s[i_6_]!!
                    val i_7_ = class267.method2024(-1)
                    val i_8_ = class267.method2027(80)!!.method31(87)
                    i_5_ += i_8_ * i_7_ / 100
                }
                Class348_Sub40_Sub24.anInt9327 = i_5_
                Class367_Sub8.anInt7365 = 2
            }
            if (Class126.aClass267Array4987 == null) return 100
            var i_9_ = 0
            var i_10_ = 0
            var bool = true
            if (i.toInt() != -25) anInt5951 = -33
            val class267s = Class126.aClass267Array4987!!
            var i_11_ = 0
            while (class267s.size > i_11_) {
                val class267 = class267s[i_11_]!!
                val i_12_ = class267.method2024(-1)
                val i_13_ = class267.method2027(70)!!.method31(i.toInt() xor 0x75)
                i_9_ += i_12_
                i_10_ += i_13_ * i_12_ / 100
                if (i_13_ < 100) bool = false
                i_11_++
            }
            if (bool) {
                if (!(Class267.aClass267_3404!!.method2027(92) as Class309).method2313(102)) Class79.aClient1367!!.method83(true)
                if (!(Class267.aClass267_3407!!.method2027(i.toInt() xor 0x64.inv()) as Class309).method2313(103)) Class38.aBoolean510 = Class79.aClient1367!!.method100(i.toInt() xor 0x12.inv())
                Class126.aClass267Array4987 = null
            }
            i_9_ -= Class348_Sub40_Sub24.anInt9327
            i_10_ -= Class348_Sub40_Sub24.anInt9327
            var i_14_ = if (i_9_ <= 0) 100 else 100 * i_10_ / i_9_
            if (!bool && i_14_ > 99) i_14_ = 99
            return i_14_
        }

        init {
            aClass114_5950 = Class114(64, 2)
            anInt5959 = 0
        }
    }
}
