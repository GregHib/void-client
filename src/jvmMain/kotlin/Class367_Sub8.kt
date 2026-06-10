/* Class367_Sub8 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class367_Sub8 internal constructor(var_ha_Sub3: ha_Sub3, class269: Class269?) : Class367(var_ha_Sub3) {
    private var aFloat7350 = 0.0f
    private val aClass269_7353: Class269?
    override fun method3520(i: Byte) {
        this.aHa_Sub3_4479.method3897(1, -4382)
        if (i.toInt() != 87) Companion.method3549(-29, (-5).toByte())
        anInt7364++
        this.aHa_Sub3_4479.method3874(Class167.aClass229_2207, 120, Class167.aClass229_2207)
        this.aHa_Sub3_4479.method3849(47.toByte(), 0, Class342.aClass70_4247)
        this.aHa_Sub3_4479.method3885(0, true, Class342.aClass70_4247)
        this.aHa_Sub3_4479.method3910((-26).toByte(), 1)
        this.aHa_Sub3_4479.method3850(86.toByte(), null)
        this.aHa_Sub3_4479.method3897(0, -4382)
        this.aHa_Sub3_4479.method3885(0, true, Class342.aClass70_4247)
    }

    override fun method3526(i: Int, i_17_: Int, i_18_: Int) {
        this.aHa_Sub3_4479.method3897(1, -4382)
        anInt7354++
        if (i != 10756) method3527(-26, null, 111)
        if ((0x80 and i_17_) == 0) {
            if ((0x1 and i_18_) != 1) {
                if (aClass269_7353!!.aBoolean3458) this.aHa_Sub3_4479.method3850(108.toByte(), aClass269_7353.anInterface18_Impl1_3452)
                else this.aHa_Sub3_4479.method3850(126.toByte(), (aClass269_7353.anInterface18_Impl3Array3459!![0]))
            } else if (aClass269_7353!!.aBoolean3458) {
                aFloat7350 = ((this.aHa_Sub3_4479.anInt8146) % 4000).toFloat() / 4000.0f
                this.aHa_Sub3_4479.method3850((-112).toByte(), aClass269_7353.anInterface18_Impl1_3452)
            } else {
                val i_19_ = (16 * (this.aHa_Sub3_4479.anInt8146 % 4000) / 4000)
                this.aHa_Sub3_4479.method3850((-114).toByte(), (aClass269_7353.anInterface18_Impl3Array3459!![i_19_]))
            }
        } else this.aHa_Sub3_4479.method3850(85.toByte(), null)
        this.aHa_Sub3_4479.method3897(0, -4382)
    }

    override fun method3530(i: Int): Boolean {
        if (i > -57) return false
        anInt7360++
        return aClass269_7353!!.method2039(116)
    }

    override fun method3532(i: Int) {
        if (this.aHa_Sub3_4479.method3877((-126).toByte()) == 0) {
            val class101_sub2 = this.aHa_Sub3_4479.method3848(5)
            this.aHa_Sub3_4479.method3897(1, i xor 0x39a4.inv())
            val class101_sub2_21_ = this.aHa_Sub3_4479.method3820(false)
            class101_sub2_21_.method898(class101_sub2)
            class101_sub2_21_.method914(0.125f, 1.0f, 0, 0.125f)
            class101_sub2_21_.method920(0.0f, false, aFloat7350, 0.0f)
            this.aHa_Sub3_4479.method3853(-32, Class348_Sub40_Sub38.aClass251_9477)
            this.aHa_Sub3_4479.method3897(0, -4382)
        }
        anInt7352++
        if (i != 10425) method3530(16)
    }

    override fun method3521(bool: Boolean, i: Byte) {
        if (i.toInt() != -103) anInt7365 = 86
        this.aHa_Sub3_4479.method3874((Class328_Sub3.aClass229_6519), i.toInt() xor 0x17.inv(), Class167.aClass229_2207)
        anInt7357++
    }

    override fun method3525(i: Int, bool: Boolean) {
        anInt7356++
        this.aHa_Sub3_4479.method3897(1, i xor 0x2a45.inv())
        this.aHa_Sub3_4479.method3874((Class328_Sub3.aClass229_6519), 111, (Class348_Sub23_Sub2.aClass229_9011))
        this.aHa_Sub3_4479.method3924(true, false, 0, Class342.aClass70_4247, false)
        this.aHa_Sub3_4479.method3885(0, true, Class318_Sub1_Sub2.aClass70_8737)
        this.aHa_Sub3_4479.method3910((-26).toByte(), 0)
        this.aHa_Sub3_4479.method3897(0, -4382)
        this.aHa_Sub3_4479.method3894(-28186, -16777216)
        this.aHa_Sub3_4479.method3885(0, true, Class348_Sub40_Sub39.aClass70_9485)
        method3532(10425)
        if (i != 15192) aShort7355 = 106.toShort()
    }

    override fun method3527(i: Int, interface18: Interface18?, i_22_: Int) {
        this.aHa_Sub3_4479.method3850(103.toByte(), interface18)
        anInt7358++
        if (i_22_ != -16776) method3520((-127).toByte())
    }

    init {
        try {
            aClass269_7353 = class269
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("kl.<init>(" + (if (var_ha_Sub3 != null) "{...}" else "null") + ',' + (if (class269 != null) "{...}" else "null") + ')'))
        }
    }

    companion object {
        @JvmField
        var anInt7349: Int = 0
        @JvmField
        var anInt7351: Int = 0
        @JvmField
        var anInt7352: Int = 0
        @JvmField
        var anInt7354: Int = 0
        @JvmField
        var aShort7355: Short = 1
        @JvmField
        var anInt7356: Int = 0
        @JvmField
        var anInt7357: Int = 0
        @JvmField
        var anInt7358: Int = 0
        @JvmField
        var anInt7359: Int = 0
        @JvmField
        var anInt7360: Int = 0
        @JvmField
        var aClass364_7361: Class364? = Class364("WTRC", 1)
        @JvmField
        var aClass45_7362: Class45? = null
        @JvmField
        var aClass114_7363: Class114?
        @JvmField
        var anInt7364: Int = 0
        var anInt7365: Int = 0

        @JvmStatic
        fun method3546(`is`: ByteArray, i: Int, i_0_: Int, i_1_: Int): String {
            anInt7349++
            val cs = CharArray(i_0_)
            var i_2_ = 0
            for (i_3_ in i..<i_0_) {
                var i_4_ = 0xff and `is`[i_3_ + i_1_].toInt()
                if (i_4_ != 0) {
                    if (i_4_ >= 128 && i_4_ < 160) {
                        var i_5_ = Class44.aCharArray625!![i_4_ - 128].code
                        if (i_5_ == 0) i_5_ = 63
                        i_4_ = i_5_
                    }
                    cs[i_2_++] = i_4_.toChar()
                }
            }
            return String(cs, 0, i_2_)
        }

        @JvmStatic
        fun method3547(i: Int, i_6_: Int): Int {
            if (Class342.anIntArrayArray4253 != null) return Class342.anIntArrayArray4253!![i]!![i_6_] and 0xffffff
            return 0
        }

        @JvmStatic
        fun method3548(i: Int, npc: Npc?, `is`: IntArray?, is_7_: IntArray?, is_8_: IntArray?) {
            try {
                if (i != -7387) method3550(10.toByte())
                var i_9_ = 0
                while (is_7_!!.size > i_9_) {
                    val i_10_ = is_7_[i_9_]
                    var i_11_ = `is`!![i_9_]
                    val i_12_ = is_8_!![i_9_]
                    var i_13_ = 0
                    while (i_11_ != 0 && ((npc!!.aClass182Array10308)!!.size > i_13_)) {
                        if ((0x1 and i_11_) != 0) {
                            if (i_10_ != -1) {
                                val class17 = Class10.aClass87_191!!.method835(i_10_, i + 7394)
                                val i_14_ = class17.anInt248
                                var class182 = (npc.aClass182Array10308!![i_13_])
                                if (class182 != null) {
                                    if (i_10_ != class182.anInt2454) {
                                        if (Class10.aClass87_191!!.method835(class182.anInt2454, 7).anInt239 <= class17.anInt239) {
                                            npc.aClass182Array10308!![i_13_] = null
                                            class182 = npc.aClass182Array10308!![i_13_]
                                        }
                                    } else if (i_14_ == 0) {
                                        npc.aClass182Array10308!![i_13_] = null
                                        class182 = npc.aClass182Array10308!![i_13_]
                                    } else if (i_14_ == 1) {
                                        class182.anInt2448 = i_12_
                                        class182.anInt2456 = 0
                                        class182.anInt2455 = 1
                                        class182.anInt2451 = 0
                                        class182.anInt2445 = 0
                                        if (!npc.aBoolean10309) Class287.method2178(npc, 0, class17, -75)
                                    } else if (i_14_ == 2) class182.anInt2445 = 0
                                }
                                if (class182 == null) {
                                    npc.aClass182Array10308!![i_13_] = Class182()
                                    class182 = npc.aClass182Array10308!![i_13_]!!
                                    class182.anInt2455 = 1
                                    class182.anInt2454 = i_10_
                                    class182.anInt2456 = 0
                                    class182.anInt2445 = 0
                                    class182.anInt2451 = 0
                                    class182.anInt2448 = i_12_
                                    if (!npc.aBoolean10309) Class287.method2178(npc, 0, class17, -19)
                                }
                            } else npc.aClass182Array10308!![i_13_] = null
                        }
                        i_11_ = i_11_ ushr 1
                        i_13_++
                    }
                    i_9_++
                }
                anInt7359++
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, ("kl.E(" + i + ',' + (if (npc != null) "{...}" else "null") + ',' + (if (`is` != null) "{...}" else "null") + ',' + (if (is_7_ != null) "{...}" else "null") + ',' + (if (is_8_ != null) "{...}" else "null") + ')'))
            }
        }

        @JvmStatic
        fun method3549(i: Int, i_15_: Byte): Boolean {
            anInt7351++
            val i_16_ = -72 / ((37 - i_15_) / 48)
            if (i == 25 || i == 20 || i == 44 || i == 46 || i == 60) return true
            return i == 30 || i == 1008
        }

        @JvmStatic
        fun method3550(i: Byte) {
            aClass114_7363 = null
            aClass45_7362 = null
            val i_20_ = -90 % ((-54 - i) / 60)
            aClass364_7361 = null
        }

        init {
            aClass114_7363 = Class114(103, 8)
        }
    }
}
