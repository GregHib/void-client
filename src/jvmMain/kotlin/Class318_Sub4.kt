import Class33.Companion.method340

/* Class318_Sub4 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class318_Sub4 : Class318() {
    var aBoolean6409: Boolean = false
    var aClass318_Sub1_6410: Class318_Sub1? = null
    @JvmField
    var aClass318_Sub3Array6414: Array<Class318_Sub3?>? = null

    fun method2504(i: Int, i_32_: Int, var_ha: ha?, i_33_: Int): Boolean {
        if (i_33_ >= -37) method2502(null, -82)
        anInt6407++
        val i_34_ = this.aClass318_Sub1_6410!!.method2393(-117)
        if (this.aClass318_Sub3Array6414 != null) {
            var i_35_ = 0
            while (this.aClass318_Sub3Array6414!!.size > i_35_) {
                this.aClass318_Sub3Array6414!![i_35_]!!.anInt6403 = this.aClass318_Sub3Array6414!![i_35_]!!.anInt6403 shl i_34_
                if (this.aClass318_Sub3Array6414!![i_35_]!!.method2500(i_32_, i) && this.aClass318_Sub1_6410!!.method2391(var_ha, i, i_32_, 0)) {
                    this.aClass318_Sub3Array6414!![i_35_]!!.anInt6403 = this.aClass318_Sub3Array6414!![i_35_]!!.anInt6403 shr i_34_
                    return true
                }
                this.aClass318_Sub3Array6414!![i_35_]!!.anInt6403 = this.aClass318_Sub3Array6414!![i_35_]!!.anInt6403 shr i_34_
                i_35_++
            }
        }
        return false
    }

    companion object {
        var anInt6407: Int = 0
        var anInt6408: Int = 0
        @JvmField
        var anInt6411: Int = 0
        var anInt6412: Int = 0
        var anInt6413: Int = 0
        fun method2501(i: Int, var_ha_Sub3: ha_Sub3?, `is`: IntArray?, i_0_: Byte, is_1_: IntArray?, i_2_: Int): aa_Sub2 {
            try {
                if (i_0_ >= -32) method2502(null, -18)
                anInt6412++
                if (var_ha_Sub3!!.method3880(Class68.aClass68_1183, Class348_Sub40_Sub38.aClass304_9471, 125.toByte())) {
                    val is_3_ = ByteArray(i * i_2_)
                    var i_4_ = 0
                    while (i > i_4_) {
                        var i_5_ = `is`!![i_4_] + i_2_ * i_4_
                        var i_6_ = 0
                        while (is_1_!![i_4_] > i_6_) {
                            is_3_[i_5_++] = (-1).toByte()
                            i_6_++
                        }
                        i_4_++
                    }
                    return aa_Sub2(var_ha_Sub3, i_2_, i, is_3_)
                }
                val is_7_ = IntArray(i * i_2_)
                var i_8_ = 0
                while (i > i_8_) {
                    var i_9_ = `is`!![i_8_] + i_8_ * i_2_
                    for (i_10_ in 0..<is_1_!![i_8_]) is_7_[i_9_++] = -16777216
                    i_8_++
                }
                return aa_Sub2(var_ha_Sub3, i_2_, i, is_7_)
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, ("jda.A(" + i + ',' + (if (var_ha_Sub3 != null) "{...}" else "null") + ',' + (if (`is` != null) "{...}" else "null") + ',' + i_0_ + ',' + (if (is_1_ != null) "{...}" else "null") + ',' + i_2_ + ')'))
            }
        }

        @JvmStatic
        fun method2502(`is`: ByteArray?, i: Int): Class348_Sub42_Sub19? {
            if (i >= -76) return null
            anInt6413++
            val class348_sub42_sub19 = Class348_Sub42_Sub19()
            val class348_sub49 = Class348_Sub49(`is`)
            class348_sub49.anInt7197 = -2 + class348_sub49.aByteArray7154!!.size
            val i_11_ = class348_sub49.readUnsignedShort(842397944)
            val i_12_ = -12 + -i_11_ + (-2 + (class348_sub49.aByteArray7154)!!.size)
            class348_sub49.anInt7197 = i_12_
            val i_13_ = class348_sub49.readInt((-126).toByte())
            class348_sub42_sub19.anInt9688 = class348_sub49.readUnsignedShort(842397944)
            class348_sub42_sub19.anInt9689 = class348_sub49.readUnsignedShort(842397944)
            class348_sub42_sub19.anInt9697 = class348_sub49.readUnsignedShort(842397944)
            class348_sub42_sub19.anInt9695 = class348_sub49.readUnsignedShort(842397944)
            val i_14_ = class348_sub49.readUnsignedByte(255)
            if (i_14_ > 0) {
                class348_sub42_sub19.aClass356Array9693 = arrayOfNulls<Class356>(i_14_)
                for (i_15_ in 0..<i_14_) {
                    var i_16_ = class348_sub49.readUnsignedShort(842397944)
                    val class356 = Class356(method340(i_16_, 108.toByte()))
                    class348_sub42_sub19.aClass356Array9693!![i_15_] = class356
                    while (i_16_-- > 0) {
                        val i_17_ = class348_sub49.readInt((-126).toByte())
                        val i_18_ = class348_sub49.readInt((-126).toByte())
                        class356.method3483(124.toByte(), i_17_.toLong(), Class348_Sub35(i_18_))
                    }
                }
            }
            class348_sub49.anInt7197 = 0
            class348_sub42_sub19.aString9690 = class348_sub49.method3384(107)
            class348_sub42_sub19.anIntArray9694 = IntArray(i_13_)
            class348_sub42_sub19.anIntArray9696 = IntArray(i_13_)
            class348_sub42_sub19.aStringArray9692 = arrayOfNulls<String>(i_13_)
            var i_19_ = 0
            while (class348_sub49.anInt7197 < i_12_) {
                val i_20_ = class348_sub49.readUnsignedShort(842397944)
                if (i_20_ != 3) {
                    if (i_20_ >= 100 || i_20_ == 21 || i_20_ == 38 || i_20_ == 39) class348_sub42_sub19.anIntArray9694!![i_19_] = class348_sub49.readUnsignedByte(255)
                    else class348_sub42_sub19.anIntArray9694!![i_19_] = class348_sub49.readInt((-126).toByte())
                } else class348_sub42_sub19.aStringArray9692!![i_19_] = class348_sub49.readString((-98).toByte()).intern()
                class348_sub42_sub19.anIntArray9696!![i_19_++] = i_20_
            }
            return class348_sub42_sub19
        }

        @JvmStatic
        fun method2503(i: Int, i_21_: Int, i_22_: Int, `is`: ByteArray, i_23_: Int, i_24_: Int, i_25_: Int): Boolean {
            var i_21_ = i_21_
            anInt6408++
            val i_26_ = i_23_ % i_22_
            val i_27_: Int
            if (i_26_ != 0) i_27_ = i_22_ - i_26_
            else i_27_ = 0
            val i_28_ = -((-1 + (i_22_ + i_25_)) / i_22_)
            if (i_24_ != -16259) method2501(-113, null, null, 40.toByte(), null, -110)
            val i_29_ = -((i_22_ + i_23_ + -1) / i_22_)
            for (i_30_ in i_28_..-1) {
                for (i_31_ in i_29_..-1) {
                    if (`is`[i_21_].toInt() == 0) return true
                    i_21_ += i_22_
                }
                i_21_ -= i_27_
                if (`is`[-1 + i_21_].toInt() == 0) return true
                i_21_ += i
            }
            return false
        }
    }
}
