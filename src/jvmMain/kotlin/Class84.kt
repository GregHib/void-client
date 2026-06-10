/* Class84 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class84 internal constructor(class230: Class230?, i: Int, class45: Class45?) {
    private val aClass60_1449 = Class60(16)
    private val aClass45_1460: Class45?

    fun method816(bool: Boolean) {
        anInt1455++
        synchronized(aClass60_1449) {
            if (bool != false) method819(107.toByte(), 46)
            aClass60_1449.method587(-119)
        }
    }

    fun method819(i: Byte, i_14_: Int) {
        synchronized(aClass60_1449) {
            aClass60_1449.method578(2, i_14_)
        }
        anInt1457++
    }

    private fun method820(i: Int, i_15_: Int): Class300 {
        anInt1458++
        var class300: Class300?
        synchronized(aClass60_1449) {
            class300 = aClass60_1449.method583(i.toLong(), 116) as Class300?
        }
        if (class300 != null) return class300!!
        val `is`: ByteArray?
        synchronized(aClass45_1460!!) {
            `is` = aClass45_1460.method410(-1860, i_15_, i)
        }
        class300 = Class300()
        if (`is` != null) class300!!.method2275(Class348_Sub49(`is`), (-123).toByte())
        synchronized(aClass60_1449) {
            aClass60_1449.method582(class300, i.toLong(), (-106).toByte())
        }
        return class300!!
    }

    fun method822(i: Byte) {
        synchronized(aClass60_1449) {
            aClass60_1449.method590(0)
        }
        if (i >= -13) method825(14)
        anInt1452++
    }

    fun method823(i: Int, i_17_: Int, i_18_: Int, i_19_: Int, class25: Class25, i_20_: Int): Class305? {
        anInt1453++
        var class72s: Array<Class72?>? = null
        val class300 = method820(i_20_, 29)
        if (i_19_ > -36) return null
        if (class300.anIntArray3821 != null) {
            class72s = arrayOfNulls<Class72>(class300.anIntArray3821!!.size)
            var i_21_ = 0
            while (class72s.size > i_21_) {
                val class38 = class25.method301((class300.anIntArray3821!![i_21_]), 29)
                class72s[i_21_] = Class72(class38.anInt498, class38.anInt504, class38.anInt499, class38.anInt502, class38.anInt508, class38.anInt501, class38.anInt503, class38.aBoolean507)
                i_21_++
            }
        }
        return Class305(class300.anInt3817, class72s, class300.anInt3823, i_18_, i, i_17_)
    }

    init {
        try {
            aClass45_1460 = class45
            aClass45_1460!!.method407(0, 29)
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("lca.<init>(" + (if (class230 != null) "{...}" else "null") + ',' + i + ',' + (if (class45 != null) "{...}" else "null") + ')'))
        }
    }

    companion object {
        var anIntArray1450: IntArray? = intArrayOf(1, 2, 4, 8)
        @JvmField
        var anInt1451: Int = 0
        @JvmField
        var anInt1452: Int = 0
        @JvmField
        var anInt1453: Int = 0
        @JvmField
        var anInt1454: Int = 0
        @JvmField
        var anInt1455: Int = 0
        @JvmField
        var anInt1456: Int = 0
        @JvmField
        var anInt1457: Int = 0
        @JvmField
        var anInt1458: Int = 0
        @JvmField
        var anInt1459: Int = 0
        @JvmStatic
        fun method817(i: Int, i_0_: Int, i_1_: Int, i_2_: Int): Class318_Sub1_Sub3_Sub3? {
            anInt1456++
            val class357 = Class147.aClass357ArrayArrayArray2029!![i_1_]!![i_0_]!![i_2_]
            if (class357 == null) return null
            if (i != 252) return null
            var class318_sub1_sub3_sub3: Class318_Sub1_Sub3_Sub3? = null
            var i_3_ = -1
            var class148 = class357.aClass148_4396
            while (class148 != null) {
                val class318_sub1_sub3 = class148.aClass318_Sub1_Sub3_2040
                if (class318_sub1_sub3 is Class318_Sub1_Sub3_Sub3) {
                    val class318_sub1_sub3_sub3_4_ = class318_sub1_sub3
                    val i_5_ = 252 + (-1 + class318_sub1_sub3_sub3_4_.method2436(88.toByte())) * 256
                    val i_6_ = (-i_5_ + (class318_sub1_sub3_sub3_4_.x) shr 9)
                    val i_7_ = (-i_5_ + (class318_sub1_sub3_sub3_4_.y) shr 9)
                    val i_8_ = i_5_ + (class318_sub1_sub3_sub3_4_.x) shr 9
                    val i_9_ = ((class318_sub1_sub3_sub3_4_.y + i_5_) shr 9)
                    if (i_0_ >= i_6_ && i_7_ <= i_2_ && i_0_ <= i_8_ && i_2_ <= i_9_) {
                        val i_10_ = (1 + i_9_ - i_2_) * (-i_0_ + (1 + i_8_))
                        if (i_3_ < i_10_) {
                            i_3_ = i_10_
                            class318_sub1_sub3_sub3 = class318_sub1_sub3_sub3_4_
                        }
                    }
                }
                class148 = class148.aClass148_2038
            }
            return class318_sub1_sub3_sub3
        }

        fun method818(i: Int, i_11_: Int, i_12_: Int): Int {
            var i = i
            var i_12_ = i_12_
            anInt1451++
            var i_13_ = i_11_
            while (i > 0) {
                i_13_ = i_12_ and 0x1 or (i_13_ shl 1)
                i--
                i_12_ = i_12_ ushr 1
            }
            return i_13_
        }

        @JvmStatic
        fun method821(i: Int) {
            Class332.aClass60_4139!!.method590(0)
            val i_16_ = -67 / ((i - 39) / 33)
            anInt1459++
        }

        fun method824(i: Int) {
            Canvas_Sub1.anInt67 = i
            for (i_22_ in 0..<Class318_Sub7.anInt6451) {
                for (i_23_ in 0..<Class348_Sub41.anInt7054) {
                    if (Class147.aClass357ArrayArrayArray2029!![i]!![i_22_]!![i_23_] == null) Class147.aClass357ArrayArrayArray2029!![i]!![i_22_]!![i_23_] = Class357(i)
                }
            }
        }

        @JvmStatic
        fun method825(i: Int) {
            anIntArray1450 = null
            if (i > -73) anIntArray1450 = null
        }

        @JvmStatic
        fun method826(i: Int, i_24_: Int, i_25_: Int, i_26_: Int, i_27_: Int, i_28_: Int, var_ha: ha) {
            if ((Class174.aClass105_2309 == null || Class348_Sub42_Sub15.aClass105_9658 == null || Class348_Sub42_Sub15.aClass105_9659 == null) && Class21.aClass45_322!!.method421(false, Class318_Sub1_Sub3_Sub3.anInt10257) && Class21.aClass45_322!!.method421(false, Class313.anInt3937) && Class21.aClass45_322!!.method421(false, Class79.Companion.anInt1387)) {
                val class207 = Class207.method1521(Class21.aClass45_322!!, Class313.anInt3937, 0)
                Class348_Sub42_Sub15.aClass105_9658 = var_ha.method3691(class207, true)
                class207!!.method1518()
                Class309.aClass105_4808 = var_ha.method3691(class207, true)
                Class174.aClass105_2309 = (var_ha.method3691(Class207.method1521(Class21.aClass45_322!!, Class318_Sub1_Sub3_Sub3.anInt10257, 0), true))
                val class207_29_ = Class207.method1521(Class21.aClass45_322!!, Class79.Companion.anInt1387, 0)
                Class348_Sub42_Sub15.aClass105_9659 = var_ha.method3691(class207_29_, true)
                class207_29_!!.method1518()
                Class110.aClass105_1706 = var_ha.method3691(class207_29_, true)
            }
            anInt1454++
            if (Class174.aClass105_2309 != null && Class348_Sub42_Sub15.aClass105_9658 != null && Class348_Sub42_Sub15.aClass105_9659 != null) {
                val i_30_ = (-(Class348_Sub42_Sub15.aClass105_9659!!.method971() * 2) + i_25_) / Class174.aClass105_2309!!.method971()
                for (i_31_ in 0..<i_30_) Class174.aClass105_2309!!.method974(i_24_ + (Class348_Sub42_Sub15.aClass105_9659!!.method971() - -(i_31_ * Class174.aClass105_2309!!.method971())), -Class174.aClass105_2309!!.method969() + (i_28_ + i_26_))
                val i_32_ = ((i_26_ - (i + Class348_Sub42_Sub15.aClass105_9659!!.method969())) / Class348_Sub42_Sub15.aClass105_9658!!.method969())
                for (i_33_ in 0..<i_32_) {
                    Class348_Sub42_Sub15.aClass105_9658!!.method974(i_24_, (Class348_Sub42_Sub15.aClass105_9658!!.method969() * i_33_ + (i_28_ + i)))
                    Class309.aClass105_4808!!.method974(-Class309.aClass105_4808!!.method971() + i_25_ + i_24_, (Class348_Sub42_Sub15.aClass105_9658!!.method969() * i_33_ + i + i_28_))
                }
                Class348_Sub42_Sub15.aClass105_9659!!.method974(i_24_, (-Class348_Sub42_Sub15.aClass105_9659!!.method969() + i_28_ + i_26_))
                Class110.aClass105_1706!!.method974(i_24_ + (i_25_ + -Class348_Sub42_Sub15.aClass105_9659!!.method971()), i_28_ - (-i_26_ + Class348_Sub42_Sub15.aClass105_9659!!.method969()))
            }
            val i_34_ = -24 % ((i_27_ - 85) / 35)
        }
    }
}
