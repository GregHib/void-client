import Class33.Companion.method340

/* Class213 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class213 {
    var anInt2752: Int = -1
    private var anInt2753 = 0
    @JvmField
    var aBoolean2755: Boolean = false
    private var anInt2756 = 0
    @JvmField
    var aClass356_2757: Class356? = null
    @JvmField
    var anInt2758: Int
    var anInt2759: Int
    private var anInt2760: Int
    @JvmField
    var aClass255_2761: Class255? = null
    @JvmField
    var anIntArray2762: IntArray? = null
    @JvmField
    var aStringArray2763: Array<String?>? = null
    var anInt2764: Int
    private var anInt2765 = 128
    var anInt2766: Int
    private var anInt2767: Int
    @JvmField
    var anInt2769: Int = 0
    private var anInt2770 = -1
    private var aShortArray2771: ShortArray = shortArrayOf()
    @JvmField
    var anIntArray2772: IntArray? = intArrayOf()
    var anInt2774: Int
    private var anInt2775: Int
    private var aShortArray2777: ShortArray? = null
    @JvmField
    var anInt2778: Int
    var anInt2779: Int = 0
    var anInt2781: Int = 0
    @JvmField
    var aBoolean2783: Boolean = false
    @JvmField
    var anInt2784: Int = 0
    private var aShortArray2785: ShortArray? = null
    private var anInt2786 = 128
    var anInt2787: Int = 0
    var anInt2788: Int
    private var anInt2791 = 0
    private var anInt2792: Int
    private var anInt2794 = 128
    @JvmField
    var aString2795: String? = "null"
    private var anInt2797 = 0
    var anInt2799: Int = 0
    private var aShortArray2801: ShortArray = shortArrayOf()
    var anInt2802: Int
    private var anInt2803 = 0
    private var anInt2804: Int
    private var anInt2805: Int
    private var anInt2807 = 0
    private var anInt2808 = 0
    var anInt2810: Int = 0
    @JvmField
    var aStringArray2811: Array<String?> = emptyArray()
    @JvmField
    var anInt2812: Int
    var anInt2815: Int
    var anInt2817: Int
    var anInt2818: Int
    @JvmField
    var anInt2819: Int = 1
    @JvmField
    var anInt2820: Int = 0
    private var aByteArray2821: ByteArray? = null
    private var anInt2822: Int
    private var anInt2823 = 0
    private var anInt2824 = 0
    var anInt2825: Int = 2000
    var anInt2826: Int = 0
    @JvmField
    var anInt2827: Int = 0
    var anInt2830: Int
    @JvmField
    var anIntArray2831: IntArray = intArrayOf()
    @JvmField
    var anInt2833: Int

    fun method1554(bool: Boolean, i: Int): Class124? {
        anInt2796++
        var i_0_ = anInt2792
        var i_1_ = anInt2767
        if (bool) {
            i_1_ = anInt2775
            i_0_ = anInt2822
        }
        if (i_0_ == -1) return null
        var class124 = Class300.method2277(0, this.aClass255_2761!!.aClass45_3268!!, i_0_, -1)
        if ((class124!!.anInt1830.inv()) > i) class124.method1092(2, 54)
        if (i_1_ != -1) {
            val class124_2_ = Class300.method2277(0, (this.aClass255_2761!!.aClass45_3268!!), i_1_, -1)
            if (class124_2_!!.anInt1830 < 13) class124_2_.method1092(2, i xor 0x78.inv())
            val class124s = arrayOf<Class124?>(class124, class124_2_)
            class124 = Class124(class124s, 2)
        }
        if (aShortArray2777 != null) {
            for (i_3_ in aShortArray2777!!.indices) class124.method1098(aShortArray2777!![i_3_], 126.toByte(), aShortArray2771[i_3_])
        }
        if (aShortArray2785 != null) {
            for (i_4_ in aShortArray2785!!.indices) class124.method1095(aShortArray2785!![i_4_], 0, aShortArray2801[i_4_])
        }
        return class124
    }

    fun method1555(i: Byte, bool: Boolean): Boolean {
        anInt2828++
        var i_5_ = anInt2792
        val i_6_ = -15 / ((28 - i) / 55)
        var i_7_ = anInt2767
        if (bool) {
            i_5_ = anInt2822
            i_7_ = anInt2775
        }
        if (i_5_ == -1) return true
        var bool_8_ = true
        if (!this.aClass255_2761!!.aClass45_3268!!.method420(-10499, i_5_, 0)) bool_8_ = false
        if (i_7_ != -1 && !this.aClass255_2761!!.aClass45_3268!!.method420(-10499, i_7_, 0)) bool_8_ = false
        return bool_8_
    }

    fun method1556(class213_9_: Class213?, i: Byte, class213_10_: Class213?) {
        try {
            anInt2808 = class213_9_!!.anInt2808
            this.anInt2779 = class213_10_!!.anInt2779
            this.anInt2819 = 0
            aShortArray2785 = class213_9_.aShortArray2785
            this.anInt2788 = class213_9_.anInt2788
            this.anInt2781 = class213_10_.anInt2781
            this.aStringArray2811 = class213_9_.aStringArray2811
            anInt2797 = class213_9_.anInt2797
            aByteArray2821 = class213_9_.aByteArray2821
            aShortArray2771 = class213_9_.aShortArray2771
            this.aString2795 = class213_9_.aString2795
            anInt2756 = class213_10_.anInt2756
            anInt2770 = class213_9_.anInt2770
            aShortArray2777 = class213_9_.aShortArray2777
            this.anInt2815 = class213_9_.anInt2815
            anInt2822 = class213_9_.anInt2822
            anInt2804 = class213_9_.anInt2804
            this.anInt2825 = class213_10_.anInt2825
            anInt2767 = class213_9_.anInt2767
            aShortArray2801 = class213_9_.aShortArray2801
            this.aBoolean2783 = class213_9_.aBoolean2783
            this.anInt2810 = class213_10_.anInt2810
            this.aStringArray2763 = arrayOfNulls<String>(5)
            if (i > -5) method1554(false, -92)
            anInt2823 = class213_9_.anInt2823
            anInt2775 = class213_9_.anInt2775
            anInt2832++
            anInt2807 = class213_9_.anInt2807
            anInt2792 = class213_9_.anInt2792
            this.aClass356_2757 = class213_9_.aClass356_2757
            anInt2805 = class213_9_.anInt2805
            this.anInt2827 = class213_9_.anInt2827
            this.anInt2787 = class213_10_.anInt2787
            anInt2760 = class213_9_.anInt2760
            anInt2753 = class213_9_.anInt2753
            anInt2803 = class213_9_.anInt2803
            this.anInt2826 = class213_10_.anInt2826
            if (class213_9_.aStringArray2763 != null) {
                for (i_11_ in 0..3) this.aStringArray2763!![i_11_] = class213_9_.aStringArray2763!![i_11_]
            }
            this.aStringArray2763!![4] = Class274.aClass274_3489!!.method2063((this.aClass255_2761!!.anInt3286), 544)
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("rq.G(" + (if (class213_9_ != null) "{...}" else "null") + ',' + i + ',' + (if (class213_10_ != null) "{...}" else "null") + ')'))
        }
    }

    private fun method1557(i: Int, i_12_: Int): String {
        anInt2816++
        if (i_12_ != -11619) this.anInt2788 = -113
        if (i < 100000) return "<col=ffff00>" + i + "</col>"
        if (i < 10000000) return ("<col=ffffff>" + i / 1000 + Class274.aClass274_3519!!.method2063((this.aClass255_2761!!.anInt3286), 544) + "</col>")
        return ("<col=00ff80>" + i / 1000000 + Class274.aClass274_3517!!.method2063((this.aClass255_2761!!.anInt3286), 544) + "</col>")
    }

    fun method1558(bool: Boolean, bool_13_: Boolean): Class124? {
        anInt2809++
        var i = this.anInt2815
        var i_14_ = anInt2804
        if (bool_13_ != false) this.aClass356_2757 = null
        var i_15_ = anInt2805
        if (bool) {
            i = this.anInt2788
            i_15_ = anInt2770
            i_14_ = anInt2760
        }
        if (i == -1) return null
        var class124 = Class300.method2277(0, this.aClass255_2761!!.aClass45_3268!!, i, -1)
        if (class124!!.anInt1830 < 13) class124.method1092(2, 64)
        if (i_14_ != -1) {
            val class124_16_ = Class300.method2277(0, (this.aClass255_2761!!.aClass45_3268!!), i_14_, -1)
            if (class124_16_!!.anInt1830 < 13) class124_16_.method1092(2, 89)
            if (i_15_ == -1) {
                val class124s = arrayOf<Class124?>(class124, class124_16_)
                class124 = Class124(class124s, 2)
            } else {
                val class124_17_ = Class300.method2277(0, (this.aClass255_2761!!.aClass45_3268!!), i_15_, -1)
                if (class124_17_!!.anInt1830 < 13) class124_17_.method1092(2, 109)
                val class124s = arrayOf<Class124?>(class124, class124_16_, class124_17_)
                class124 = Class124(class124s, 3)
            }
        }
        if (class124 == null) return null
        if (!bool && (anInt2807 != 0 || anInt2797 != 0 || anInt2808 != 0)) class124.method1099(110.toByte(), anInt2808, anInt2807, anInt2797)
        if (bool && (anInt2803 != 0 || anInt2753 != 0 || anInt2823 != 0)) class124.method1099(24.toByte(), anInt2823, anInt2803, anInt2753)
        if (aShortArray2777 != null) {
            var i_18_ = 0
            while (aShortArray2777!!.size > i_18_) {
                class124.method1098(aShortArray2777!![i_18_], 126.toByte(), aShortArray2771[i_18_])
                i_18_++
            }
        }
        if (aShortArray2785 != null) {
            var i_19_ = 0
            while (aShortArray2785!!.size > i_19_) {
                class124.method1095(aShortArray2785!![i_19_], 0, aShortArray2801[i_19_])
                i_19_++
            }
        }
        return class124
    }

    fun method1559(class154: Class154?, class17: Class17?, var_ha: ha?, i: Int, i_20_: Int, i_21_: Int, i_22_: Int, i_23_: Byte, i_24_: Int): Class64? {
        try {
            anInt2813++
            if (this.anIntArray2762 != null && i_21_ > 1) {
                var i_25_ = -1
                for (i_26_ in 0..9) {
                    if (i_21_ >= this.anIntArray2831[i_26_] && this.anIntArray2831[i_26_] != 0) i_25_ = this.anIntArray2762!![i_26_]
                }
                if (i_25_ != -1) return (this.aClass255_2761!!.method1940(103, i_25_).method1559(class154, class17, var_ha, i, i_20_, 1, i_22_, 88.toByte(), i_24_))
            }
            if (i_23_.toInt() != 88) this.aString2795 = null
            var i_27_ = i
            if (class17 != null) i_27_ = i_27_ or class17.method263(i_24_, 105, i_22_, true)
            var class64: Class64?
            synchronized(this.aClass255_2761!!.aClass60_3287) {
                class64 = (this.aClass255_2761!!.aClass60_3287.method583((var_ha!!.anInt4567 shl 29 or this.anInt2769).toLong(), 69)) as Class64?
            }
            if (class64 == null || var_ha!!.method3667(class64.ua(), i_27_) != 0) {
                if (class64 != null) i_27_ = var_ha!!.method3679(i_27_, class64.ua())
                var i_28_ = i_27_
                if (aShortArray2785 != null) i_28_ = i_28_ or 0x8000
                if (aShortArray2777 != null || class154 != null) i_28_ = i_28_ or 0x4000
                if (anInt2786 != 128) i_28_ = i_28_ or 0x1
                if (anInt2786 != 128) i_28_ = i_28_ or 0x2
                if (anInt2786 != 128) i_28_ = i_28_ or 0x4
                val class124 = Class300.method2277(0, (this.aClass255_2761!!.aClass45_3268!!), anInt2756, -1)
                if (class124 == null) return null
                if (class124.anInt1830 < 13) class124.method1092(2, 97)
                class64 = var_ha!!.method3625(class124, i_28_, (this.aClass255_2761!!.anInt3291), anInt2791 + 64, 850 - -anInt2824)
                if (anInt2786 != 128 || anInt2794 != 128 || anInt2765 != 128) class64.O(anInt2786, anInt2794, anInt2765)
                if (aShortArray2777 != null) {
                    var i_29_ = 0
                    while ((i_29_ < aShortArray2777!!.size)) {
                        if (aByteArray2821 == null || aByteArray2821!!.size <= i_29_) class64.ia(aShortArray2777!![i_29_], aShortArray2771[i_29_])
                        else class64.ia(aShortArray2777!![i_29_], (Class336.aShortArray4172!![aByteArray2821!![i_29_].toInt() and 0xff]))
                        i_29_++
                    }
                }
                if (aShortArray2785 != null) {
                    var i_30_ = 0
                    while (aShortArray2785!!.size > i_30_) {
                        class64.aa(aShortArray2785!![i_30_], aShortArray2801[i_30_])
                        i_30_++
                    }
                }
                if (class154 != null) {
                    for (i_31_ in 0..4) {
                        var i_32_ = 0
                        while ((Class367_Sub2.aShortArrayArrayArray7290!!.size > i_32_)) {
                            if (class154.anIntArray2095!![i_31_] < (Class367_Sub2.aShortArrayArrayArray7290!![i_32_]!![i_31_])!!.size) class64.ia((Class136.aShortArrayArray4791!![i_32_]!![i_31_]), (Class367_Sub2.aShortArrayArrayArray7290!![i_32_]!![i_31_]!![(class154.anIntArray2095!![i_31_])]))
                            i_32_++
                        }
                    }
                }
                class64.s(i_27_)
                synchronized(this.aClass255_2761!!.aClass60_3287) {
                    this.aClass255_2761!!.aClass60_3287.method582(class64, (var_ha.anInt4567 shl 29 or this.anInt2769).toLong(), (-111).toByte())
                }
            }
            if (class17 != null) class64 = class17.method269(116, class64, i_24_, i_20_, i_27_, i_22_)
            class64!!.s(i)
            return class64
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("rq.S(" + (if (class154 != null) "{...}" else "null") + ',' + (if (class17 != null) "{...}" else "null") + ',' + (if (var_ha != null) "{...}" else "null") + ',' + i + ',' + i_20_ + ',' + i_21_ + ',' + i_22_ + ',' + i_23_ + ',' + i_24_ + ')'))
        }
    }

    fun method1560(i: Int, i_33_: Byte): Class213 {
        if (i_33_.toInt() != 97) this.anIntArray2762 = null
        anInt2768++
        if (this.anIntArray2762 != null && i > 1) {
            var i_34_ = -1
            for (i_35_ in 0..9) {
                if (i >= this.anIntArray2831[i_35_] && this.anIntArray2831[i_35_] != 0) i_34_ = this.anIntArray2762!![i_35_]
            }
            if (i_34_ != -1) return this.aClass255_2761!!.method1940(95, i_34_)
        }
        return this
    }

    fun method1561(string: String?, i: Int, i_36_: Int): String? {
        try {
            anInt2751++
            if (this.aClass356_2757 == null) return string
            if (i_36_ != -1511086397) method1569(25, null)
            val class348_sub50 = (this.aClass356_2757!!.method3480(i.toLong(), i_36_ xor 0x5a114e4b) as Class348_Sub50?)
            if (class348_sub50 == null) return string
            return class348_sub50.aString7211
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("rq.N(" + (if (string != null) "{...}" else "null") + ',' + i + ',' + i_36_ + ')'))
        }
    }

    fun method1562(i: Int, bool: Boolean, i_37_: Int, var_ha: ha?, var_ha_38_: ha?, class324: Class324?, class154: Class154?, i_39_: Int, i_40_: Byte, i_41_: Int): IntArray? {
        try {
            anInt2806++
            val class124 = Class300.method2277(0, (this.aClass255_2761!!.aClass45_3268!!), anInt2756, i_40_.toInt() xor 0x65)
            if (class124 == null) return null
            if (class124.anInt1830 < 13) class124.method1092(2, i_40_.toInt() xor 0xb.inv())
            if (aShortArray2777 != null) {
                var i_42_ = 0
                while ((aShortArray2777!!.size > i_42_)) {
                    if (aByteArray2821 == null || i_42_ >= aByteArray2821!!.size) class124.method1098(aShortArray2777!![i_42_], 126.toByte(), aShortArray2771[i_42_])
                    else class124.method1098(aShortArray2777!![i_42_], 126.toByte(), (Class336.aShortArray4172!![aByteArray2821!![i_42_].toInt() and 0xff]))
                    i_42_++
                }
            }
            if (aShortArray2785 != null) {
                var i_43_ = 0
                while ((aShortArray2785!!.size > i_43_)) {
                    class124.method1095(aShortArray2785!![i_43_], 0, aShortArray2801[i_43_])
                    i_43_++
                }
            }
            if (class154 != null) {
                for (i_44_ in 0..4) {
                    var i_45_ = 0
                    while ((i_45_ < Class367_Sub2.aShortArrayArrayArray7290!!.size)) {
                        if ((Class367_Sub2.aShortArrayArrayArray7290!![i_45_]!![i_44_])!!.size > class154.anIntArray2095!![i_44_]) class124.method1098((Class136.aShortArrayArray4791!![i_45_]!![i_44_]), 126.toByte(), (Class367_Sub2.aShortArrayArrayArray7290!![i_45_]!![i_44_]!![(class154.anIntArray2095!![i_44_])]))
                        i_45_++
                    }
                }
            }
            var i_46_ = 2048
            var bool_47_ = false
            if (anInt2786 != 128 || anInt2794 != 128 || anInt2765 != 128) {
                i_46_ = i_46_ or 0x7
                bool_47_ = true
            }
            val class64 = var_ha_38_!!.method3625(class124, i_46_, 64, anInt2791 + 64, 768 + anInt2824)
            if (!class64.method618()) return null
            if (bool_47_) class64.O(anInt2786, anInt2794, anInt2765)
            var class105: Class105? = null
            if (this.anInt2833 == -1) {
                if (this.anInt2812 != -1) {
                    class105 = (this.aClass255_2761!!.method1932(var_ha_38_, i_37_, i, class324, class154, 0, true, 83.toByte(), var_ha, this.anInt2778, false, i_41_))
                    if (class105 == null) return null
                }
            } else {
                class105 = (this.aClass255_2761!!.method1932(var_ha_38_, 0, 10, class324, class154, 0, true, 83.toByte(), var_ha, this.anInt2758, true, 1))
                if (class105 == null) return null
            }
            val i_48_: Int
            if (!bool) {
                if (i_41_ == 2) i_48_ = ((1.04 * this.anInt2825.toDouble()).toInt() shl 2)
                else i_48_ = this.anInt2825 shl 2
            } else i_48_ = ((1.5 * this.anInt2825.toDouble()).toInt() shl 2)
            var_ha_38_.DA(16, 16, 512, 512)
            val class101 = var_ha_38_.method3654()
            class101.method910()
            var_ha_38_.method3638(class101)
            var_ha_38_.xa(1.0f)
            var_ha_38_.ZA(16777215, 1.0f, 1.0f, -50.0f, -10.0f, -50.0f)
            val class101_49_ = var_ha_38_.method3705()
            class101_49_.method902(-this.anInt2810 shl 3)
            class101_49_.method896(this.anInt2781 shl 3)
            class101_49_.method891(this.anInt2779 shl 2, ((i_48_ * (Class70.anIntArray1207!![this.anInt2787 shl 3]) shr 14) - class64.fa() / 2 + (this.anInt2826 shl 2)), ((i_48_ * (Class70.anIntArray1204!![this.anInt2787 shl 3]) shr 14) - -(this.anInt2826 shl 2)))
            class101_49_.method900(this.anInt2787 shl 3)
            val i_50_ = var_ha_38_.i()
            val i_51_ = var_ha_38_.XA()
            var_ha_38_.f(50, 2147483647)
            var_ha_38_.ya()
            var_ha_38_.la()
            var_ha_38_.aa(0, 0, 36, 32, 0, 0)
            class64.method615(class101_49_, null, 1)
            var_ha_38_.f(i_50_, i_51_)
            var `is` = var_ha_38_.na(0, 0, 36, 32)
            if (i_40_.toInt() != -102) method1554(false, 37)
            if (i_41_ >= 1) {
                `is` = method1572(-16777214, -1, `is`)
                if (i_41_ >= 2) `is` = method1572(-1, -1, `is`)
            }
            if (i_37_ != 0) method1571(i_37_, `is`, 119.toByte())
            var_ha_38_.method3662(36, `is`, 94.toByte(), 0, 36, 32).method974(0, 0)
            if (this.anInt2833 == -1) {
                if (this.anInt2812 != -1) class105!!.method974(0, 0)
            } else class105!!.method974(0, 0)
            if (i_39_ == 1 || (i_39_ == 2 && (this.anInt2820 == 1 || i != 1) && i != -1)) class324!!.method2576(method1557(i, i_40_ + -11517), -256, 9, 0, -16777215, i_40_ + -15)
            `is` = var_ha_38_.na(0, 0, 36, 32)
            for (i_52_ in `is`!!.indices) {
                if ((0xffffff and `is`[i_52_]) != 0) `is`[i_52_] = Class273.method2057(`is`[i_52_], -16777216)
                else `is`[i_52_] = 0
            }
            return `is`
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("rq.O(" + i + ',' + bool + ',' + i_37_ + ',' + (if (var_ha != null) "{...}" else "null") + ',' + (if (var_ha_38_ != null) "{...}" else "null") + ',' + (if (class324 != null) "{...}" else "null") + ',' + (if (class154 != null) "{...}" else "null") + ',' + i_39_ + ',' + i_40_ + ',' + i_41_ + ')'))
        }
    }

    fun method1563(i: Byte) {
        if (i < 32) this.anInt2752 = -31
        anInt2814++
    }

    fun method1565(bool: Boolean, i: Int): Boolean {
        anInt2780++
        var i_53_ = this.anInt2815
        var i_54_ = anInt2804
        var i_55_ = anInt2805
        if (bool) {
            i_55_ = anInt2770
            i_53_ = this.anInt2788
            i_54_ = anInt2760
        }
        if (i_53_ == -1) return true
        var bool_56_ = true
        if (!this.aClass255_2761!!.aClass45_3268!!.method420(-10499, i_53_, 0)) bool_56_ = false
        if (i_54_ != -1 && !this.aClass255_2761!!.aClass45_3268!!.method420(i xor 0x2902, i_54_, 0)) bool_56_ = false
        if (i != i_55_ && !this.aClass255_2761!!.aClass45_3268!!.method420(-10499, i_55_, 0)) bool_56_ = false
        return bool_56_
    }

    private fun method1566(i: Int, i_57_: Int, class348_sub49: Class348_Sub49?) {
        try {
            if (i != 4) method1564(9)
            if (i_57_ != 1) {
                if (i_57_ != 2) {
                    if (i_57_ == 4) this.anInt2825 = class348_sub49!!.readUnsignedShort(i xor 0x3235f8fc)
                    else if (i_57_ == 5) this.anInt2787 = class348_sub49!!.readUnsignedShort(842397944)
                    else if (i_57_ == 6) this.anInt2781 = class348_sub49!!.readUnsignedShort(i xor 0x3235f8fc)
                    else if (i_57_ == 7) {
                        this.anInt2779 = class348_sub49!!.readUnsignedShort(842397944)
                        if (this.anInt2779 > 32767) this.anInt2779 -= 65536
                    } else if (i_57_ == 8) {
                        this.anInt2826 = class348_sub49!!.readUnsignedShort(842397944)
                        if (this.anInt2826 > 32767) this.anInt2826 -= 65536
                    } else if (i_57_ != 11) {
                        if (i_57_ != 12) {
                            if (i_57_ == 16) this.aBoolean2783 = true
                            else if (i_57_ == 18) this.anInt2802 = class348_sub49!!.readUnsignedShort(i xor 0x3235f8fc)
                            else if (i_57_ == 23) this.anInt2815 = class348_sub49!!.readUnsignedShort(842397944)
                            else if (i_57_ == 24) anInt2804 = class348_sub49!!.readUnsignedShort(i xor 0x3235f8fc)
                            else if (i_57_ == 25) this.anInt2788 = class348_sub49!!.readUnsignedShort(i + 842397940)
                            else if (i_57_ == 26) anInt2760 = class348_sub49!!.readUnsignedShort(i + 842397940)
                            else if (i_57_ < 30 || i_57_ >= 35) {
                                if (i_57_ >= 35 && i_57_ < 40) this.aStringArray2763!![-35 + i_57_] = class348_sub49!!.readString(103.toByte())
                                else if (i_57_ == 40) {
                                    val i_58_ = class348_sub49!!.readUnsignedByte(255)
                                    aShortArray2777 = ShortArray(i_58_)
                                    aShortArray2771 = ShortArray(i_58_)
                                    var i_59_ = 0
                                    while (i_58_ > i_59_) {
                                        aShortArray2777!![i_59_] = (class348_sub49.readUnsignedShort(842397944)).toShort()
                                        aShortArray2771[i_59_] = (class348_sub49.readUnsignedShort(842397944)).toShort()
                                        i_59_++
                                    }
                                } else if (i_57_ == 41) {
                                    val i_68_ = class348_sub49!!.readUnsignedByte(i + 251)
                                    aShortArray2801 = ShortArray(i_68_)
                                    aShortArray2785 = ShortArray(i_68_)
                                    for (i_69_ in 0..<i_68_) {
                                        aShortArray2785!![i_69_] = (class348_sub49.readUnsignedShort(842397944)).toShort()
                                        aShortArray2801[i_69_] = (class348_sub49.readUnsignedShort(842397944)).toShort()
                                    }
                                } else if (i_57_ == 42) {
                                    val i_60_ = class348_sub49!!.readUnsignedByte(i + 251)
                                    aByteArray2821 = ByteArray(i_60_)
                                    for (i_61_ in 0..<i_60_) aByteArray2821!![i_61_] = class348_sub49.readByte(-114)
                                } else if (i_57_ == 65) this.aBoolean2755 = true
                                else if (i_57_ == 78) anInt2805 = class348_sub49!!.readUnsignedShort(842397944)
                                else if (i_57_ == 79) anInt2770 = (class348_sub49!!.readUnsignedShort(i xor 0x3235f8fc))
                                else if (i_57_ == 90) anInt2792 = class348_sub49!!.readUnsignedShort(842397944)
                                else if (i_57_ == 91) anInt2822 = class348_sub49!!.readUnsignedShort(842397944)
                                else if (i_57_ != 92) {
                                    if (i_57_ != 93) {
                                        if (i_57_ != 95) {
                                            if (i_57_ != 96) {
                                                if (i_57_ == 97) this.anInt2758 = (class348_sub49!!.readUnsignedShort(842397944))
                                                else if (i_57_ == 98) this.anInt2833 = (class348_sub49!!.readUnsignedShort(842397944))
                                                else if ((i_57_ >= 100) && (i_57_ < 110)) {
                                                    if ((this.anIntArray2762) == null) {
                                                        this.anIntArray2831 = (IntArray(10))
                                                        this.anIntArray2762 = (IntArray(10))
                                                    }
                                                    this.anIntArray2762!![i_57_ - 100] = (class348_sub49!!.readUnsignedShort(842397944))
                                                    this.anIntArray2831[i_57_ + -100] = (class348_sub49.readUnsignedShort(842397944))
                                                } else if (i_57_ == 110) anInt2786 = (class348_sub49!!.readUnsignedShort(842397944))
                                                else if (i_57_ != 111) {
                                                    if (i_57_ == 112) anInt2765 = (class348_sub49!!.readUnsignedShort(842397944))
                                                    else if (i_57_ != 113) {
                                                        if (i_57_ == 114) anInt2824 = ((class348_sub49!!.readByte(-90)) * 5)
                                                        else if (i_57_ == 115) this.anInt2827 = (class348_sub49!!.readUnsignedByte(255))
                                                        else if (i_57_ != 121) {
                                                            if (i_57_ != 122) {
                                                                if (i_57_ == 125) {
                                                                    anInt2807 = class348_sub49!!.readByte(-99).toInt() shl 2
                                                                    anInt2797 = class348_sub49.readByte(i + -99).toInt() shl 2
                                                                    anInt2808 = class348_sub49.readByte(-111).toInt() shl 2
                                                                } else if (i_57_ == 126) {
                                                                    anInt2803 = class348_sub49!!.readByte(-121).toInt() shl 2
                                                                    anInt2753 = class348_sub49.readByte(-92).toInt() shl 2
                                                                    anInt2823 = class348_sub49.readByte(-93).toInt() shl 2
                                                                } else if (i_57_ == 127) {
                                                                    this.anInt2752 = class348_sub49!!.readUnsignedByte(255)
                                                                    this.anInt2759 = class348_sub49.readUnsignedShort(842397944)
                                                                } else if (i_57_ == 128) {
                                                                    this.anInt2764 = class348_sub49!!.readUnsignedByte(255)
                                                                    this.anInt2830 = class348_sub49.readUnsignedShort(842397944)
                                                                } else if (i_57_ == 129) {
                                                                    this.anInt2766 = class348_sub49!!.readUnsignedByte(i xor 0xfb)
                                                                    this.anInt2818 = class348_sub49.readUnsignedShort(842397944)
                                                                } else if (i_57_ == 130) {
                                                                    this.anInt2774 = class348_sub49!!.readUnsignedByte(255)
                                                                    this.anInt2817 = class348_sub49.readUnsignedShort(842397944)
                                                                } else if (i_57_ == 132) {
                                                                    val i_62_ = class348_sub49!!.readUnsignedByte(i xor 0xfb)
                                                                    this.anIntArray2772 = IntArray(i_62_)
                                                                    var i_63_ = 0
                                                                    while (i_62_ > i_63_) {
                                                                        this.anIntArray2772!![i_63_] = class348_sub49.readUnsignedShort(842397944)
                                                                        i_63_++
                                                                    }
                                                                } else if (i_57_ == 134) this.anInt2784 = class348_sub49!!.readUnsignedByte(255)
                                                                else if (i_57_ == 249) {
                                                                    val i_64_ = class348_sub49!!.readUnsignedByte(255)
                                                                    if (this.aClass356_2757 == null) {
                                                                        val i_65_ = method340(i_64_, 108.toByte())
                                                                        this.aClass356_2757 = Class356(i_65_)
                                                                    }
                                                                    for (i_66_ in 0..<i_64_) {
                                                                        val bool = class348_sub49.readUnsignedByte(255) == 1
                                                                        val i_67_ = class348_sub49.readMedium(-1)
                                                                        val class348: Class348?
                                                                        if (bool) class348 = Class348_Sub50(class348_sub49.readString(107.toByte()))
                                                                        else class348 = Class348_Sub35(class348_sub49.readInt((-126).toByte()))
                                                                        this.aClass356_2757!!.method3483(76.toByte(), i_67_.toLong(), class348)
                                                                    }
                                                                }
                                                            } else this.anInt2812 = class348_sub49!!.readUnsignedShort(i + 842397940)
                                                        } else this.anInt2778 = (class348_sub49!!.readUnsignedShort(842397944))
                                                    } else anInt2791 = (class348_sub49!!.readByte(-88)).toInt()
                                                } else anInt2794 = (class348_sub49!!.readUnsignedShort(842397944))
                                            } else this.anInt2799 = (class348_sub49!!.readUnsignedByte(255))
                                        } else this.anInt2810 = (class348_sub49!!.readUnsignedShort(i + 842397940))
                                    } else anInt2775 = (class348_sub49!!.readUnsignedShort(i + 842397940))
                                } else anInt2767 = class348_sub49!!.readUnsignedShort(842397944)
                            } else this.aStringArray2811[-30 + i_57_] = class348_sub49!!.readString(98.toByte())
                        } else this.anInt2819 = class348_sub49!!.readInt((-126).toByte())
                    } else this.anInt2820 = 1
                } else this.aString2795 = class348_sub49!!.readString((-42).toByte())
            } else anInt2756 = class348_sub49!!.readUnsignedShort(i + 842397940)
            anInt2754++
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("rq.L(" + i + ',' + i_57_ + ',' + (if (class348_sub49 != null) "{...}" else "null") + ')'))
        }
    }

    fun method1567(i: Int, i_70_: Int, i_71_: Int): Int {
        anInt2793++
        if (this.aClass356_2757 == null) return i
        val class348_sub35 = (this.aClass356_2757!!.method3480(i_71_.toLong(), -6008) as Class348_Sub35?)
        if (class348_sub35 == null) return i
        val i_72_ = 56 % ((-32 - i_70_) / 50)
        return class348_sub35.anInt6976
    }

    fun method1569(i: Int, class348_sub49: Class348_Sub49?) {
        try {
            if (i != 768) method1565(true, -71)
            while (true) {
                val i_93_ = class348_sub49!!.readUnsignedByte(i + -513)
                if (i_93_ == 0) break
                method1566(4, i_93_, class348_sub49)
            }
            anInt2800++
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("rq.I(" + i + ',' + (if (class348_sub49 != null) "{...}" else "null") + ')'))
        }
    }

    fun method1570(i: Int, class213_94_: Class213?, class213_95_: Class213?) {
        try {
            aShortArray2771 = class213_95_!!.aShortArray2771
            aShortArray2785 = class213_95_.aShortArray2785
            aByteArray2821 = class213_95_.aByteArray2821
            this.aBoolean2783 = class213_94_!!.aBoolean2783
            this.anInt2787 = class213_95_.anInt2787
            this.anInt2810 = class213_95_.anInt2810
            anInt2776++
            this.anInt2779 = class213_95_.anInt2779
            aShortArray2801 = class213_95_.aShortArray2801
            this.anInt2781 = class213_95_.anInt2781
            this.anInt2819 = class213_94_.anInt2819
            this.anInt2826 = class213_95_.anInt2826
            this.anInt2820 = i
            aShortArray2777 = class213_95_.aShortArray2777
            this.anInt2825 = class213_95_.anInt2825
            this.aString2795 = class213_94_.aString2795
            anInt2756 = class213_95_.anInt2756
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("rq.F(" + i + ',' + (if (class213_94_ != null) "{...}" else "null") + ',' + (if (class213_95_ != null) "{...}" else "null") + ')'))
        }
    }

    private fun method1571(i: Int, `is`: IntArray?, i_96_: Byte) {
        try {
            if (i_96_ <= 81) anInt2805 = -46
            for (i_97_ in 31 downTo 1) {
                val i_98_ = 36 * i_97_
                for (i_99_ in 35 downTo 1) {
                    if (`is`!![i_99_ - -i_98_] == 0 && `is`[i_99_ + i_98_ - 1 + -36] != 0) `is`[i_98_ + i_99_] = i
                }
            }
            anInt2790++
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("rq.M(" + i + ',' + (if (`is` != null) "{...}" else "null") + ',' + i_96_ + ')'))
        }
    }

    init {
        this.anInt2766 = -1
        anInt2775 = -1
        this.anInt2778 = -1
        this.anInt2758 = -1
        this.anInt2788 = -1
        anInt2804 = -1
        anInt2792 = -1
        this.anInt2812 = -1
        anInt2767 = -1
        anInt2760 = -1
        this.anInt2817 = -1
        anInt2822 = -1
        this.anInt2815 = -1
        this.anInt2818 = -1
        this.anInt2774 = -1
        anInt2805 = -1
        this.anInt2764 = -1
        this.anInt2759 = -1
        this.anInt2802 = -1
        this.anInt2830 = -1
        this.anInt2833 = -1
    }

    private fun method1572(i: Int, i_100_: Int, `is`: IntArray?): IntArray? {
        try {
            anInt2829++
            if (i_100_ != -1) return null
            val is_101_ = IntArray(1152)
            var i_102_ = 0
            for (i_103_ in 0..31) {
                for (i_104_ in 0..35) {
                    var i_105_ = `is`!![i_102_]
                    if (i_105_ == 0) {
                        if (i_104_ <= 0 || `is`[i_102_ - 1] == 0) {
                            if (i_103_ > 0 && `is`[-36 + i_102_] != 0) i_105_ = i
                            else if (i_104_ < 35 && `is`[i_102_ + 1] != 0) i_105_ = i
                            else if (i_103_ < 31 && `is`[i_102_ + 36] != 0) i_105_ = i
                        } else i_105_ = i
                    }
                    is_101_[i_102_++] = i_105_
                }
            }
            return is_101_
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("rq.K(" + i + ',' + i_100_ + ',' + (if (`is` != null) "{...}" else "null") + ')'))
        }
    }

    companion object {
        var anInt2751: Int = 0
        var anInt2754: Int = 0
        var anInt2768: Int = 0
        @JvmField
        var aClass238_2773: Class238? = null
        var anInt2776: Int = 0
        var anInt2780: Int = 0
        var anInt2782: Int = 0
        @JvmField
        var aLong2789: Long = 0
        var anInt2790: Int = 0
        var anInt2793: Int = 0
        var anInt2796: Int = 0
        @JvmField
        var anInt2798: Int = 0
        var anInt2800: Int = 0
        var anInt2806: Int = 0
        var anInt2809: Int = 0
        var anInt2813: Int = 0
        var anInt2814: Int = 0
        var anInt2816: Int = 0
        var anInt2828: Int = 0
        var anInt2829: Int = 0
        var anInt2832: Int = 0
        @JvmStatic
        fun method1564(i: Int) {
            aClass238_2773 = null
            if (i <= 54) aLong2789 = -74L
        }

        fun method1568(`is`: IntArray?, i: Int, i_73_: Int, i_74_: Int, fs: FloatArray?, is_75_: IntArray?, i_76_: Int, i_77_: Int, i_78_: Int, i_79_: Int, i_80_: Int, i_81_: Int, fs_82_: FloatArray?) {
            try {
                if (i_77_ <= 112) aLong2789 = 95L
                anInt2782++
                var i_83_ = i * i_80_ - -i_73_
                var i_84_ = i_81_ + i_79_ * i_74_
                val i_85_ = -i_76_ + i_80_
                val i_86_ = -i_76_ + i_79_
                if (is_75_ == null) {
                    var i_87_ = 0
                    while (i_78_ > i_87_) {
                        val i_88_ = i_83_ - -i_76_
                        while (i_83_ < i_88_) fs!![i_84_++] = fs_82_!![i_83_++]
                        i_83_ += i_85_
                        i_84_ += i_86_
                        i_87_++
                    }
                } else if (fs_82_ == null) {
                    for (i_91_ in 0..<i_78_) {
                        val i_92_ = i_76_ + i_83_
                        while (i_83_ < i_92_) `is`!![i_84_++] = is_75_[i_83_++]
                        i_83_ += i_85_
                        i_84_ += i_86_
                    }
                } else {
                    var i_89_ = 0
                    while (i_78_ > i_89_) {
                        val i_90_ = i_83_ - -i_76_
                        while (i_83_ < i_90_) {
                            `is`!![i_84_] = is_75_[i_83_]
                            fs!![i_84_++] = fs_82_[i_83_++]
                        }
                        i_83_ += i_85_
                        i_84_ += i_86_
                        i_89_++
                    }
                }
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, ("rq.C(" + (if (`is` != null) "{...}" else "null") + ',' + i + ',' + i_73_ + ',' + i_74_ + ',' + (if (fs != null) "{...}" else "null") + ',' + (if (is_75_ != null) "{...}" else "null") + ',' + i_76_ + ',' + i_77_ + ',' + i_78_ + ',' + i_79_ + ',' + i_80_ + ',' + i_81_ + ',' + (if (fs_82_ != null) "{...}" else "null") + ')'))
            }
        }
    }
}
