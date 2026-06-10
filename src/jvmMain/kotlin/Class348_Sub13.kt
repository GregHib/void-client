import aa_Sub2.Companion.method165

/* Class348_Sub13 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class348_Sub13 : Class348() {
    var anIntArray6757: IntArray? = intArrayOf(-1)
    var anIntArray6758: IntArray = IntArray(1)
    private fun method2802(`is`: IntArray?, i: Int, bool: Boolean, is_6_: IntArray?, i_7_: Byte): Long {
        try {
            anInt6755++
            val ls = Class348_Sub40_Sub21.aLongArray9283
            var l = -1L
            l = (ls!![(0xffL and (l xor (i shr 8).toLong())).toInt()] xor (l ushr 8))
            l = ls[(0xffL and (l xor i.toLong())).toInt()] xor (l ushr 8)
            var i_8_ = 0
            while (is_6_!!.size > i_8_) {
                l = (ls[(0xffL and (l xor (is_6_[i_8_] shr 24).toLong())).toInt()] xor (l ushr 8))
                l = (l ushr 8 xor ls[(0xffL and (l xor (is_6_[i_8_] shr 16).toLong())).toInt()])
                l = l ushr 8 xor ls[((l xor (is_6_[i_8_] shr 8).toLong()) and 0xffL).toInt()]
                l = (ls[((is_6_[i_8_].toLong() xor l) and 0xffL).toInt()] xor (l ushr 8))
                i_8_++
            }
            if (i_7_.toInt() != -74) this.anIntArray6757 = null
            if (`is` != null) {
                for (i_9_ in 0..4) l = l ushr 8 xor ls[((l xor `is`[i_9_].toLong()) and 0xffL).toInt()]
            }
            l = (ls[(0xffL and ((if (!bool) 0 else 1).toLong() xor l)).toInt()] xor (l ushr 8))
            return l
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.Companion.method2929(runtimeexception, ("ie.C(" + (if (`is` != null) "{...}" else "null") + ',' + i + ',' + bool + ',' + (if (is_6_ != null) "{...}" else "null") + ',' + i_7_ + ')'))
        }
    }

    fun method2803(class17: Class17?, class154: Class154?, i: Int, i_10_: Int, i_11_: Int, i_12_: Int, i_13_: Int, var_ha: ha?, bool: Boolean, i_14_: Int): Class64? {
        try {
            anInt6756++
            var class64: Class64? = null
            var i_15_ = i_13_
            var class225: Class225? = null
            if (i != -1) class225 = Class64_Sub3.aClass261_5558!!.method1983(i, 32)
            var `is` = this.anIntArray6757
            if (class225 != null && class225.anIntArray2906 != null) {
                `is` = IntArray(class225.anIntArray2906.size)
                var i_16_ = 0
                while ((i_16_ < class225.anIntArray2906.size)) {
                    val i_17_ = class225.anIntArray2906[i_16_]
                    if (i_17_ >= 0 && i_17_ < this.anIntArray6757!!.size) `is`[i_16_] = this.anIntArray6757!![i_17_]
                    else `is`[i_16_] = -1
                    i_16_++
                }
            }
            var bool_18_ = false
            var bool_19_ = false
            var bool_20_ = false
            var bool_21_ = false
            var i_22_ = -1
            var i_23_ = -1
            var i_24_ = 0
            var class348_sub42_sub17: Class348_Sub42_Sub17? = null
            var class348_sub42_sub17_25_: Class348_Sub42_Sub17? = null
            if (class17 != null) {
                i_22_ = class17.anIntArray237[i_10_]
                i_15_ = i_15_ or 0x20
                val i_26_ = i_22_ ushr 16
                class348_sub42_sub17 = Class10.aClass87_191!!.method839(i_26_, i_14_ + 4)
                i_22_ = i_22_ and 0xffff
                if (class348_sub42_sub17 != null) {
                    bool_19_ = bool_19_ or class348_sub42_sub17.method3272(i_22_, 0)
                    bool_18_ = bool_18_ or class348_sub42_sub17.method3271(i_22_, 14)
                    bool_21_ = bool_21_ or class348_sub42_sub17.method3267((-112).toByte(), i_22_)
                    bool_20_ = bool_20_ or class17.aBoolean242
                }
                if ((class17.aBoolean241 || Class28.aBoolean5002) && i_12_ != -1 && class17.anIntArray237.size > i_12_) {
                    i_23_ = class17.anIntArray237[i_12_]
                    i_24_ = class17.anIntArray267!![i_10_]
                    val i_27_ = i_23_ ushr 16
                    i_23_ = i_23_ and 0xffff
                    if (i_27_ == i_26_) class348_sub42_sub17_25_ = class348_sub42_sub17
                    else class348_sub42_sub17_25_ = Class10.aClass87_191!!.method839(i_23_ ushr 16, 3)
                    if (class348_sub42_sub17_25_ != null) {
                        bool_19_ = bool_19_ or class348_sub42_sub17_25_.method3272(i_23_, 0)
                        bool_18_ = bool_18_ or class348_sub42_sub17_25_.method3271(i_23_, 14)
                        bool_21_ = bool_21_ or class348_sub42_sub17_25_.method3267((-118).toByte(), i_23_)
                    }
                }
                if (bool_19_) i_15_ = i_15_ or 0x80
                if (bool_18_) i_15_ = i_15_ or 0x100
                if (bool_20_) i_15_ = i_15_ or 0x200
                if (bool_21_) i_15_ = i_15_ or 0x400
            }
            val l = method2802((if (class154 != null) class154.anIntArray2095 else null), i, bool, `is`, (-74).toByte())
            if (Class202.aClass60_2671 != null) class64 = Class202.aClass60_2671!!.method583(l, i_14_ xor 0x56) as Class64?
            if (class64 == null || var_ha!!.method3667(class64.ua(), i_15_) != 0) {
                if (class64 != null) i_15_ = var_ha!!.method3679(i_15_, class64.ua())
                var i_28_ = i_15_
                var bool_29_ = false
                var i_30_ = 0
                while (`is`!!.size > i_30_) {
                    if (`is`[i_30_] != -1 && !Exception_Sub1.aClass255_112!!.method1940(-91, `is`[i_30_]).method1565(bool, -1)) bool_29_ = true
                    i_30_++
                }
                if (bool_29_) return null
                val class124s = arrayOfNulls<Class124>(`is`.size)
                for (i_31_ in `is`.indices) {
                    if (`is`[i_31_] != -1) class124s[i_31_] = Exception_Sub1.aClass255_112!!.method1940(Class348_Sub21.Companion.method2955(i_14_, -112), `is`[i_31_]).method1558(bool, false)
                }
                if (class225 != null && class225.anIntArrayArray2939 != null) {
                    var i_32_ = 0
                    while ((class225.anIntArrayArray2939!!.size > i_32_)) {
                        if ((class225.anIntArrayArray2939!![i_32_] != null) && class124s[i_32_] != null) {
                            val i_33_ = (class225.anIntArrayArray2939!![i_32_]!![0])
                            val i_34_ = (class225.anIntArrayArray2939!![i_32_]!![1])
                            val i_35_ = (class225.anIntArrayArray2939!![i_32_]!![2])
                            val i_36_ = (class225.anIntArrayArray2939!![i_32_]!![3])
                            val i_37_ = (class225.anIntArrayArray2939!![i_32_]!![4])
                            val i_38_ = (class225.anIntArrayArray2939!![i_32_]!![5])
                            if (i_36_ != 0 || i_37_ != 0 || i_38_ != 0) class124s[i_32_]!!.method1107(6875, i_37_, i_38_, i_36_)
                            if (i_33_ != 0 || i_34_ != 0 || i_35_ != 0) class124s[i_32_]!!.method1099((-91).toByte(), i_35_, i_33_, i_34_)
                        }
                        i_32_++
                    }
                }
                if (class154 != null) i_28_ = i_28_ or 0x4000
                val class124 = Class124(class124s, class124s.size)
                class64 = var_ha!!.method3625(class124, i_28_, Class348_Sub42_Sub1.anInt9488, 64, 850)
                if (class154 != null) {
                    for (i_39_ in 0..4) {
                        for (i_40_ in (Class367_Sub2.aShortArrayArrayArray7290)!!.indices) {
                            if (class154.anIntArray2095!![i_39_] < (Class367_Sub2.aShortArrayArrayArray7290!![i_40_]!![i_39_])!!.size) class64.ia((Class136.aShortArrayArray4791!![i_40_]!![i_39_]), (Class367_Sub2.aShortArrayArrayArray7290!![i_40_]!![i_39_]!![(class154.anIntArray2095!![i_39_])]))
                        }
                    }
                }
                if (Class202.aClass60_2671 != null) {
                    class64.s(i_15_)
                    Class202.aClass60_2671!!.method582(class64, l, (-128).toByte())
                }
            }
            if (class17 == null || class348_sub42_sub17 == null) return class64
            val class64_41_ = class64.method614(1.toByte(), i_15_, true)
            class64_41_!!.method617(i_22_, i_24_, class348_sub42_sub17_25_, 0, class348_sub42_sub17, false, class17.aBoolean242, i_23_, i_11_ + i_14_)
            return class64_41_
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.Companion.method2929(runtimeexception, ("ie.B(" + (if (class17 != null) "{...}" else "null") + ',' + (if (class154 != null) "{...}" else "null") + ',' + i + ',' + i_10_ + ',' + i_11_ + ',' + i_12_ + ',' + i_13_ + ',' + (if (var_ha != null) "{...}" else "null") + ',' + bool + ',' + i_14_ + ')'))
        }
    }

    companion object {
        var anInt6754: Int = 0
        var anInt6755: Int = 0
        var anInt6756: Int = 0
        var aBoolean6759: Boolean = true

        fun method2801(i: Int, i_0_: Int, i_1_: Int, i_2_: Int, i_3_: Int, class318_sub1_sub3_sub3: Class318_Sub1_Sub3_Sub3, i_4_: Byte) {
            val i_5_ = 1 / ((i_4_ - 6) / 48)
            anInt6754++
            method165(class318_sub1_sub3_sub3.plane.toInt(), i_2_, i, i_3_, class318_sub1_sub3_sub3.x, 0, class318_sub1_sub3_sub3.y, 110.toByte(), i_0_, i_1_)
        }
    }
}
