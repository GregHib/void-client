import Class139.Companion.method1166
import Class254.Companion.method1928
import Class287.Companion.method2178

/* Class348_Sub17 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class348_Sub17 : Class348 {
    lateinit var aByteArray6792: ByteArray
    private var anIntArray6793: IntArray? = null
    var aShortArray6795: ShortArray? = null
    var aClass23Array6796: Array<Class23?>? = null
    var anInt6797: Int = 0
    var aByteArray6798: ByteArray? = null
    lateinit var aByteArray6799: ByteArray
    lateinit var aClass348_Sub19_Sub1Array6800: Array<Class348_Sub19_Sub1?>
    fun method2932(class26: Class26?, `is`: IntArray?, is_5_: ByteArray?, i: Int): Boolean {
        try {
            anInt6803++
            var bool = true
            var i_6_ = 0
            var class348_sub19_sub1: Class348_Sub19_Sub1? = null
            for (i_7_ in i..127) {
                if (is_5_ == null || is_5_[i_7_].toInt() != 0) {
                    var i_8_ = anIntArray6793!![i_7_]
                    if (i_8_ != 0) {
                        if (i_8_ != i_6_) {
                            i_6_ = i_8_
                            if ((--i_8_ and 0x1) == 0) class348_sub19_sub1 = class26!!.method308(i_8_ shr 2, `is`, -2)
                            else class348_sub19_sub1 = class26!!.method309(`is`, i_8_ shr 2, -1)
                            if (class348_sub19_sub1 == null) bool = false
                        }
                        if (class348_sub19_sub1 != null) {
                            this.aClass348_Sub19_Sub1Array6800[i_7_] = class348_sub19_sub1
                            anIntArray6793!![i_7_] = 0
                        }
                    }
                }
            }
            return bool
        } catch (runtimeexception: RuntimeException) {
            throw method2929(runtimeexception, ("jf.B(" + (if (class26 != null) "{...}" else "null") + ',' + (if (`is` != null) "{...}" else "null") + ',' + (if (is_5_ != null) "{...}" else "null") + ',' + i + ')'))
        }
    }

    fun method2933(i: Byte) {
        anInt6794++
        if (i >= -65) this.aClass23Array6796 = null
        anIntArray6793 = null
    }

    constructor()

    internal constructor(`is`: ByteArray?) {
        this.aShortArray6795 = ShortArray(128)
        this.aByteArray6792 = ByteArray(128)
        this.aByteArray6798 = ByteArray(128)
        this.aByteArray6799 = ByteArray(128)
        this.aClass348_Sub19_Sub1Array6800 = arrayOfNulls<Class348_Sub19_Sub1>(128)
        this.aClass23Array6796 = arrayOfNulls<Class23>(128)
        anIntArray6793 = IntArray(128)
        val class348_sub49 = Class348_Sub49(`is`)
        var i: Int
        i = 0
        while (((class348_sub49.aByteArray7154!![i + class348_sub49.anInt7197]).toInt() != 0)) {
            i++
        }
        val is_9_ = ByteArray(i)
        var i_10_ = 0
        while (i > i_10_) {
            is_9_[i_10_] = class348_sub49.readByte(-128)
            i_10_++
        }
        class348_sub49.anInt7197++
        i++
        var i_11_ = class348_sub49.anInt7197
        class348_sub49.anInt7197 += i
        var i_12_: Int
        i_12_ = 0
        while (((class348_sub49.aByteArray7154!![i_12_ + class348_sub49.anInt7197]).toInt() != 0)) {
            i_12_++
        }
        val is_13_ = ByteArray(i_12_)
        var i_14_ = 0
        while (i_12_ > i_14_) {
            is_13_[i_14_] = class348_sub49.readByte(-81)
            i_14_++
        }
        i_12_++
        class348_sub49.anInt7197++
        var i_15_ = class348_sub49.anInt7197
        class348_sub49.anInt7197 += i_12_
        var i_16_: Int
        i_16_ = 0
        while (((class348_sub49.aByteArray7154!![class348_sub49.anInt7197 + i_16_]).toInt() != 0)) {
            i_16_++
        }
        val is_17_ = ByteArray(i_16_)
        var i_18_ = 0
        while (i_16_ > i_18_) {
            is_17_[i_18_] = class348_sub49.readByte(-82)
            i_18_++
        }
        class348_sub49.anInt7197++
        val is_19_ = ByteArray(++i_16_)
        var i_20_: Int
        if (i_16_ > 1) {
            is_19_[1] = 1.toByte()
            i_20_ = 2
            var i_21_ = 1
            var i_22_ = 2
            while (i_16_ > i_22_) {
                var i_23_ = class348_sub49.readUnsignedByte(255)
                if (i_23_ == 0) i_21_ = i_20_++
                else {
                    if (i_23_ <= i_21_) i_23_--
                    i_21_ = i_23_
                }
                is_19_[i_22_] = i_21_.toByte()
                i_22_++
            }
        } else i_20_ = i_16_
        val class23s: Array<Class23?> = arrayOfNulls<Class23>(i_20_)
        for (i_24_ in class23s.indices) {
            class23s[i_24_] = Class23()
            val class23 = class23s[i_24_]!!
            var i_25_ = class348_sub49.readUnsignedByte(255)
            if (i_25_ > 0) class23.aByteArray348 = ByteArray(i_25_ * 2)
            i_25_ = class348_sub49.readUnsignedByte(255)
            if (i_25_ > 0) {
                class23.aByteArray344 = ByteArray(i_25_ * 2 + 2)
                class23.aByteArray344!![1] = 64.toByte()
            }
        }
        var i_26_ = class348_sub49.readUnsignedByte(255)
        val is_27_ = if (i_26_ > 0) ByteArray(i_26_ * 2) else null
        i_26_ = class348_sub49.readUnsignedByte(255)
        val is_28_ = if (i_26_ > 0) ByteArray(2 * i_26_) else null
        var i_29_: Int
        i_29_ = 0
        while (((class348_sub49.aByteArray7154!![class348_sub49.anInt7197 - -i_29_]).toInt() != 0)) {
            i_29_++
        }
        val is_30_ = ByteArray(i_29_)
        var i_31_ = 0
        while (i_29_ > i_31_) {
            is_30_[i_31_] = class348_sub49.readByte(-108)
            i_31_++
        }
        class348_sub49.anInt7197++
        i_29_++
        var i_32_ = 0
        for (i_33_ in 0..127) {
            i_32_ += class348_sub49.readUnsignedByte(255)
            this.aShortArray6795!![i_33_] = i_32_.toShort()
        }
        i_32_ = 0
        for (i_34_ in 0..127) {
            i_32_ += class348_sub49.readUnsignedByte(255)
            this.aShortArray6795!![i_34_] = (this.aShortArray6795!![i_34_] + (i_32_ shl 8)).toShort()
        }
        var i_35_ = 0
        var i_36_ = 0
        var i_37_ = 0
        for (i_38_ in 0..127) {
            if (i_35_ == 0) {
                if (i_36_ < is_30_.size) i_35_ = is_30_[i_36_++].toInt()
                else i_35_ = -1
                i_37_ = class348_sub49.method3366(124.toByte())
            }
            this.aShortArray6795!![i_38_] = (this.aShortArray6795!![i_38_] + method1166(32768, i_37_ + -1 shl 14)).toShort()
            i_35_--
            anIntArray6793!![i_38_] = i_37_
        }
        i_36_ = 0
        i_35_ = 0
        var i_39_ = 0
        for (i_40_ in 0..127) {
            if (anIntArray6793!![i_40_] != 0) {
                if (i_35_ == 0) {
                    i_39_ = -1 + (class348_sub49.aByteArray7154!![i_11_++])
                    if (i_36_ < is_9_.size) i_35_ = is_9_[i_36_++].toInt()
                    else i_35_ = -1
                }
                i_35_--
                this.aByteArray6798!![i_40_] = i_39_.toByte()
            }
        }
        i_36_ = 0
        i_35_ = 0
        var i_41_ = 0
        for (i_42_ in 0..127) {
            if (anIntArray6793!![i_42_] != 0) {
                if (i_35_ == 0) {
                    if (i_36_ >= is_13_.size) i_35_ = -1
                    else i_35_ = is_13_[i_36_++].toInt()
                    i_41_ = 16 + (class348_sub49.aByteArray7154!![i_15_++]) shl 2
                }
                i_35_--
                this.aByteArray6792[i_42_] = i_41_.toByte()
            }
        }
        i_35_ = 0
        i_36_ = 0
        var class23: Class23? = null
        for (i_43_ in 0..127) {
            if (anIntArray6793!![i_43_] != 0) {
                if (i_35_ == 0) {
                    class23 = class23s[is_19_[i_36_].toInt()]
                    if (i_36_ < is_17_.size) i_35_ = is_17_[i_36_++].toInt()
                    else i_35_ = -1
                }
                i_35_--
                this.aClass23Array6796!![i_43_] = class23
            }
        }
        i_35_ = 0
        i_36_ = 0
        var i_44_ = 0
        for (i_45_ in 0..127) {
            if (i_35_ == 0) {
                if (is_30_.size > i_36_) i_35_ = is_30_[i_36_++].toInt()
                else i_35_ = -1
                if (anIntArray6793!![i_45_] > 0) i_44_ = class348_sub49.readUnsignedByte(255) + 1
            }
            this.aByteArray6799[i_45_] = i_44_.toByte()
            i_35_--
        }
        this.anInt6797 = class348_sub49.readUnsignedByte(255) - -1
        var i_46_ = 0
        while (i_20_ > i_46_) {
            val class23_47_ = class23s[i_46_]!!
            if (class23_47_.aByteArray348 != null) {
                var i_48_ = 1
                while (i_48_ < class23_47_.aByteArray348!!.size) {
                    class23_47_.aByteArray348!![i_48_] = class348_sub49.readByte(-93)
                    i_48_ += 2
                }
            }
            if (class23_47_.aByteArray344 != null) {
                var i_49_ = 3
                while (-2 + class23_47_.aByteArray344!!.size > i_49_) {
                    class23_47_.aByteArray344!![i_49_] = class348_sub49.readByte(-89)
                    i_49_ += 2
                }
            }
            i_46_++
        }
        if (is_27_ != null) {
            var i_50_ = 1
            while (i_50_ < is_27_.size) {
                is_27_[i_50_] = class348_sub49.readByte(-82)
                i_50_ += 2
            }
        }
        if (is_28_ != null) {
            var i_51_ = 1
            while (is_28_.size > i_51_) {
                is_28_[i_51_] = class348_sub49.readByte(-126)
                i_51_ += 2
            }
        }
        for (i_52_ in 0..<i_20_) {
            val class23_53_ = class23s[i_52_]!!
            if (class23_53_.aByteArray344 != null) {
                i_32_ = 0
                var i_54_ = 2
                while (i_54_ < class23_53_.aByteArray344!!.size) {
                    i_32_ = 1 + i_32_ - -class348_sub49.readUnsignedByte(255)
                    class23_53_.aByteArray344!![i_54_] = i_32_.toByte()
                    i_54_ += 2
                }
            }
        }
        var i_55_ = 0
        while (i_20_ > i_55_) {
            val class23_56_ = class23s[i_55_]!!
            if (class23_56_.aByteArray348 != null) {
                i_32_ = 0
                var i_57_ = 2
                while (i_57_ < class23_56_.aByteArray348!!.size) {
                    i_32_ = 1 + (i_32_ - -class348_sub49.readUnsignedByte(255))
                    class23_56_.aByteArray348!![i_57_] = i_32_.toByte()
                    i_57_ += 2
                }
            }
            i_55_++
        }
        if (is_27_ != null) {
            i_32_ = class348_sub49.readUnsignedByte(255)
            is_27_[0] = i_32_.toByte()
            var i_58_ = 2
            while (i_58_ < is_27_.size) {
                i_32_ = 1 + (i_32_ - -class348_sub49.readUnsignedByte(255))
                is_27_[i_58_] = i_32_.toByte()
                i_58_ += 2
            }
            var i_59_ = is_27_[0].toInt()
            var i_60_ = is_27_[1].toInt()
            var i_61_ = 0
            while (i_59_ > i_61_) {
                this.aByteArray6799[i_61_] = (32 + i_60_ * (this.aByteArray6799[i_61_]) shr 6).toByte()
                i_61_++
            }
            var i_62_ = 2
            while (is_27_.size > i_62_) {
                val i_63_ = is_27_[i_62_].toInt()
                val i_64_ = is_27_[1 + i_62_].toInt()
                var i_65_ = (-i_59_ + i_63_) / 2 + (-i_59_ + i_63_) * i_60_
                for (i_66_ in i_59_..<i_63_) {
                    val i_67_ = method1928(-i_59_ + i_63_, -110, i_65_)
                    this.aByteArray6799[i_66_] = (32 + (this.aByteArray6799[i_66_]) * i_67_ shr 6).toByte()
                    i_65_ += -i_60_ + i_64_
                }
                i_59_ = i_63_
                i_62_ += 2
                i_60_ = i_64_
            }
            for (i_68_ in i_59_..127) this.aByteArray6799[i_68_] = (32 + i_60_ * (this.aByteArray6799[i_68_]) shr 6).toByte()
            val `object`: Any? = null
        }
        if (is_28_ != null) {
            i_32_ = class348_sub49.readUnsignedByte(255)
            is_28_[0] = i_32_.toByte()
            var i_69_ = 2
            while (i_69_ < is_28_.size) {
                i_32_ = class348_sub49.readUnsignedByte(255) + (1 + i_32_)
                is_28_[i_69_] = i_32_.toByte()
                i_69_ += 2
            }
            var i_70_ = is_28_[0].toInt()
            var i_71_ = is_28_[1].toInt() shl 1
            var i_72_ = 0
            while (i_70_ > i_72_) {
                var i_73_ = ((this.aByteArray6792[i_72_].toInt() and 0xff) + i_71_)
                if (i_73_ < 0) i_73_ = 0
                if (i_73_ > 128) i_73_ = 128
                this.aByteArray6792[i_72_] = i_73_.toByte()
                i_72_++
            }
            var i_74_ = 2
            while (is_28_.size > i_74_) {
                val i_75_ = is_28_[i_74_].toInt()
                val i_76_ = is_28_[i_74_ - -1].toInt() shl 1
                var i_77_ = (-i_70_ + i_75_) * i_71_ + (-i_70_ + i_75_) / 2
                var i_78_ = i_70_
                while (i_75_ > i_78_) {
                    val i_79_ = method1928(-i_70_ + i_75_, -34, i_77_)
                    var i_80_ = ((0xff and this.aByteArray6792[i_78_].toInt()) + i_79_)
                    if (i_80_ < 0) i_80_ = 0
                    if (i_80_ > 128) i_80_ = 128
                    this.aByteArray6792[i_78_] = i_80_.toByte()
                    i_77_ += -i_71_ + i_76_
                    i_78_++
                }
                i_71_ = i_76_
                i_70_ = i_75_
                i_74_ += 2
            }
            val `object`: Any? = null
            for (i_81_ in i_70_..127) {
                var i_82_ = i_71_ + (this.aByteArray6792[i_81_].toInt() and 0xff)
                if (i_82_ < 0) i_82_ = 0
                if (i_82_ > 128) i_82_ = 128
                this.aByteArray6792[i_81_] = i_82_.toByte()
            }
        }
        var i_83_ = 0
        while (i_20_ > i_83_) {
            class23s[i_83_]!!.anInt347 = class348_sub49.readUnsignedByte(255)
            i_83_++
        }
        for (i_84_ in 0..<i_20_) {
            val class23_85_ = class23s[i_84_]!!
            if (class23_85_.aByteArray348 != null) class23_85_.anInt345 = class348_sub49.readUnsignedByte(255)
            if (class23_85_.aByteArray344 != null) class23_85_.anInt349 = class348_sub49.readUnsignedByte(255)
            if (class23_85_.anInt347 > 0) class23_85_.anInt350 = class348_sub49.readUnsignedByte(255)
        }
        var i_86_ = 0
        while (i_20_ > i_86_) {
            class23s[i_86_]!!.anInt352 = class348_sub49.readUnsignedByte(255)
            i_86_++
        }
        for (i_87_ in 0..<i_20_) {
            val class23_88_ = class23s[i_87_]!!
            if (class23_88_.anInt352 > 0) class23_88_.anInt353 = class348_sub49.readUnsignedByte(255)
        }
        var i_89_ = 0
        while (i_20_ > i_89_) {
            val class23_90_ = class23s[i_89_]!!
            if (class23_90_.anInt353 > 0) class23_90_.anInt346 = class348_sub49.readUnsignedByte(255)
            i_89_++
        }
    }

    companion object {
        @JvmField
        var aBoolean6788: Boolean = false
        var anInt6789: Int = 0
        var anInt6790: Int = 0
        var aLong6791: Long = 0L
        var anInt6794: Int = 0
        var anInt6801: Int = 0
        @JvmField
        var aClass359Array6802: Array<Class359?>? = arrayOfNulls<Class359>(2048)
        var anInt6803: Int = 0

        fun method2928(bool: Boolean) {
            if (bool == true) {
                Class258_Sub2.aClass10Array8531 = arrayOfNulls<Class10>(50)
                anInt6790++
                Class147.anInt2021 = 0
            }
        }

        @JvmStatic
        fun method2929(throwable: Throwable, string: String?): RuntimeException_Sub1 {
            anInt6789++
            if (Loader.trace) {
                throwable.printStackTrace()
            }
            val runtimeexception_sub1: RuntimeException_Sub1
            if (throwable is RuntimeException_Sub1) {
                runtimeexception_sub1 = throwable
                runtimeexception_sub1.aString4594 += ' '.toString() + string
            } else runtimeexception_sub1 = RuntimeException_Sub1(throwable, string)
            return runtimeexception_sub1
        }

        @JvmStatic
        fun method2930(i: Byte) {
            aClass359Array6802 = null
            val i_0_ = -14 / ((i - 61) / 43)
        }

        fun method2931(i: Int, i_1_: Byte, `is`: IntArray?, npc: Npc?) {
            do {
                try {
                    anInt6801++
                    if ((npc!!.anIntArray10236) != null) {
                        var bool = true
                        for (i_2_ in npc.anIntArray10236!!.indices) {
                            if ((npc.anIntArray10236!![i_2_]) != `is`!![i_2_]) {
                                bool = false
                                break
                            }
                        }
                        if (bool && npc.anInt10286 != -1) {
                            val class17 = (Class10.aClass87_191!!.method835(npc.anInt10286, 7))
                            val i_3_ = class17.anInt248
                            if (i_3_ == 1) {
                                npc.anInt10232 = 0
                                npc.anInt10218 = i
                                npc.anInt10294 = 0
                                npc.anInt10267 = 0
                                npc.anInt10244 = 1
                                if (!npc.aBoolean10309) method2178(npc, npc.anInt10267, class17, -72)
                            }
                            if (i_3_ == 2) npc.anInt10294 = 0
                        }
                    }
                    var bool = true
                    var i_4_ = 0
                    while (`is`!!.size > i_4_) {
                        if (`is`[i_4_] != -1) bool = false
                        if (npc.anIntArray10236 == null || (npc.anIntArray10236!![i_4_]) == -1 || (Class10.aClass87_191!!.method835(`is`[i_4_], 7).anInt239 >= Class10.aClass87_191!!.method835((npc.anIntArray10236!![i_4_]), 7).anInt239)) {
                            npc.anInt10218 = i
                            npc.anInt10322 = npc.anInt10319
                            npc.anIntArray10236 = `is`
                        }
                        i_4_++
                    }
                    if (i_1_ <= 31) method2931(-66, 125.toByte(), null, null)
                    if (!bool) break
                    npc.anIntArray10236 = `is`
                    npc.anInt10218 = i
                    npc.anInt10322 = (npc.anInt10319)
                } catch (runtimeexception: RuntimeException) {
                    throw method2929(runtimeexception, ("jf.E(" + i + ',' + i_1_ + ',' + (if (`is` != null) "{...}" else "null") + ',' + (if (npc != null) "{...}" else "null") + ')'))
                }
                break
            } while (false)
        }
    }
}
