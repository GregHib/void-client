import Class33.Companion.method340

/* Class51 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class51 {
    @JvmField
    var anInt868: Int = -1
    var anInt869: Int
    private var aByteArray872: ByteArray? = null
    private var anInt873 = 0
    @JvmField
    var anInt874: Int
    @JvmField
    var anInt875: Int
    @JvmField
    var aBoolean876: Boolean = false
    var anInt877: Int
    @JvmField
    var anInt878: Int = 256
    private var aByte879: Byte = 0
    private var anInt880 = 0
    private var aClass356_881: Class356? = null
    private var anInt882 = 128
    @JvmField
    var anInt883: Int = 64
    var aString884: String? = "null"
    private var aByteArray885: ByteArray? = null
    private var aByte886: Byte
    @JvmField
    var anInt887: Int
    @JvmField
    var aBoolean888: Boolean = false
    @JvmField
    var anInt889: Int = 0
    private var anInt890 = 0
    private lateinit var aShortArray892: ShortArray
    private var anInt893 = 0
    @JvmField
    var aBoolean894: Boolean = true
    @JvmField
    var anInt895: Int
    @JvmField
    var aBoolean896: Boolean = true
    private var anInt900 = 0
    @JvmField
    var aBoolean902: Boolean = false
    @JvmField
    var aBoolean903: Boolean = false
    @JvmField
    var anIntArray904: IntArray? = null
    @JvmField
    var aBoolean906: Boolean = false
    private var anIntArrayArray907: Array<IntArray?>? = null
    private lateinit var aShortArray908: ShortArray
    @JvmField
    var anInt909: Int = 960
    private var anInt911 = 0
    @JvmField
    var aBoolean912: Boolean = false
    @JvmField
    var aStringArray913: Array<String?>? = null
    @JvmField
    var anInt914: Int = 0
    private var anInt915: Int
    @JvmField
    var anInt916: Int = 256
    @JvmField
    var anIntArray917: IntArray? = null
    @JvmField
    var aBoolean918: Boolean = true
    private var aShortArray919: ShortArray? = null
    @JvmField
    var anInt920: Int = 2
    @JvmField
    var anInt921: Int
    private var aByte922: Byte
    @JvmField
    var anInt923: Int = 0
    @JvmField
    var aBoolean924: Boolean = true
    @JvmField
    var aBoolean925: Boolean = false
    @JvmField
    var anInt926: Int = 1
    private var anInt928 = 128
    @JvmField
    var aBoolean929: Boolean = false
    @JvmField
    var anInt930: Int = 0
    @JvmField
    var aBoolean931: Boolean = false
    @JvmField
    var aClass263_933: Class263? = null
    private var anInt934: Int
    private var anInt935 = 128
    @JvmField
    var anInt936: Int = 255
    @JvmField
    var anInt937: Int = 0
    private var anInt939: Int
    private var aShortArray940: ShortArray? = null
    @JvmField
    var anInt941: Int = 0
    @JvmField
    var aBoolean942: Boolean = false
    @JvmField
    var anIntArray943: IntArray? = null
    private var aByte944: Byte = 0
    @JvmField
    var anIntArray945: IntArray? = null
    private var anInt946 = 0
    @JvmField
    var aBoolean947: Boolean = false
    private var anInt949 = 0
    var anInt950: Int
    var anInt951: Int
    private var aByte952: Byte = 0
    @JvmField
    var anInt953: Int = 0
    private var anInt954 = 0
    @JvmField
    var anInt955: Int
    private var anIntArray959: IntArray? = null
    @JvmField
    var anInt961: Int = 1
    @JvmField
    var anInt962: Int = 0

    fun method474(i: Byte): Boolean {
        anInt891++
        if (this.anIntArray945 == null) {
            return this.anInt887 != -1 || this.anIntArray904 != null
        }
        for (i_0_ in this.anIntArray945!!.indices) {
            if (this.anIntArray945!![i_0_] != -1) {
                val class51_1_ = this.aClass263_933!!.method2005(0, this.anIntArray945!![i_0_])
                if (class51_1_.anInt887 != -1 || class51_1_.anIntArray904 != null) return true
            }
        }
        val i_2_ = -28 % ((i - 3) / 46)
        return false
    }

    fun method475(string: String?, i: Int, i_3_: Int): String? {
        anInt866++
        if (aClass356_881 == null) return string
        if (i_3_ != -16) return null
        val class348_sub50 = aClass356_881!!.method3480(i.toLong(), -6008) as Class348_Sub50?
        if (class348_sub50 == null) return string
        return class348_sub50.aString7211
    }

    fun method476(var_ha: ha?, var_s: s?, i: Int, i_4_: Int, i_5_: Int, bool: Boolean, var_s_6_: s?, i_7_: Int, i_8_: Int, i_9_: Int, i_10_: Int): Class2? {
        var i = i
        try {
            if (Class104.method955(22311, i)) i = 4
            anInt938++
            var l = (i_9_ + (i shl 3) + (this.anInt941 shl 10)).toLong()
            l = l or (var_ha!!.anInt4567 shl 29).toLong()
            var i_11_ = i_4_
            if (aByte886.toInt() == 3) i_11_ = i_11_ or 0x7
            else {
                if (aByte886.toInt() != 0 || anInt954 != 0) i_11_ = i_11_ or 0x2
                if (anInt893 != 0) i_11_ = i_11_ or 0x1
                if (anInt890 != 0) i_11_ = i_11_ or 0x4
            }
            if (bool) i_11_ = i_11_ or 0x40000
            var class2: Class2?
            synchronized(this.aClass263_933!!.aClass60_3361!!) {
                class2 = this.aClass263_933!!.aClass60_3361!!.method583(l, i_10_ + -25) as Class2?
            }
            var class64 = if (class2 == null) null else class2.aClass64_119
            var var_r: r? = null
            if (class64 == null || var_ha.method3667(class64.ua(), i_11_) != 0) {
                if (class64 != null) i_11_ = var_ha.method3679(i_11_, class64.ua())
                var i_12_ = i_11_
                if (i == 10 && i_9_ > 3) i_12_ = i_12_ or 0x5
                class64 = method477(i_9_, var_ha, i, i_10_ xor 0xec.inv(), i_12_)
                if (class64 == null) return null
                if (i == 10 && i_9_ > 3) class64.a(2048)
                if (bool) var_r = class64.ba(null)
                class64.s(i_11_)
                class2 = Class2()
                class2.aClass64_119 = class64
                class2.aR118 = var_r
                synchronized(this.aClass263_933!!.aClass60_3361!!) {
                    this.aClass263_933!!.aClass60_3361!!.method582(class2, l, (-120).toByte())
                }
            } else {
                class64 = class2!!.aClass64_119
                var_r = class2.aR118
                if (bool && var_r == null) {
                    class2.aR118 = class64!!.ba(null)
                    var_r = class2.aR118
                }
            }
            val bool_13_ = (aByte886.toInt() != 0 && (var_s_6_ != null || var_s != null))
            val bool_14_ = (anInt893 != 0 || anInt954 != 0 || anInt890 != 0)
            if (bool_13_ || bool_14_) {
                class64 = class64!!.method614(0.toByte(), i_11_, true)
                if (bool_13_) class64!!.p(aByte886.toInt(), anInt915, var_s_6_, var_s, i_5_, i_7_, i_8_)
                if (bool_14_) class64!!.H(anInt893, anInt954, anInt890)
                class64!!.s(i_4_)
            } else class64 = class64!!.method614(0.toByte(), i_4_, true)
            Class348_Sub42.aClass2_7058!!.aClass64_119 = class64
            Class348_Sub42.aClass2_7058!!.aR118 = var_r
            return Class348_Sub42.aClass2_7058
        } catch (runtimeexception: RuntimeException) {
            runtimeexception.printStackTrace()
            throw Class348_Sub17.method2929(runtimeexception, ("iv.B(" + (if (var_ha != null) "{...}" else "null") + ',' + (if (var_s != null) "{...}" else "null") + ',' + i + ',' + i_4_ + ',' + i_5_ + ',' + bool + ',' + (if (var_s_6_ != null) "{...}" else "null") + ',' + i_7_ + ',' + i_8_ + ',' + i_9_ + ',' + i_10_ + ')'))
        }
    }

    private fun method477(i: Int, var_ha: ha, i_15_: Int, i_16_: Int, i_17_: Int): Class64? {
        var i = i
        var i_17_ = i_17_
        anInt958++
        val i_18_ = anInt949 - -64
        val i_19_ = 850 + anInt880
        val i_20_ = i_17_
        val bool = (this.aBoolean902 || i_15_ == 2 && i > 3)
        if (bool) i_17_ = i_17_ or 0x10
        if (i == 0) {
            if (anInt928 != 128 || anInt900 != 0) i_17_ = i_17_ or 0x1
            if (anInt882 != 128 || anInt946 != 0) i_17_ = i_17_ or 0x4
        } else i_17_ = i_17_ or 0xd
        if (anInt935 != 128 || anInt873 != 0) i_17_ = i_17_ or 0x2
        if (i_16_ > -97) aByte944 = (-69).toByte()
        if (aShortArray940 != null) i_17_ = i_17_ or 0x4000
        if (aShortArray919 != null) i_17_ = i_17_ or 0x8000
        if (aByte922.toInt() != 0) i_17_ = i_17_ or 0x80000
        var class64: Class64? = null
        if (aByteArray885 == null) return null
        var i_21_ = -1
        var i_22_ = 0
        while (aByteArray885!!.size > i_22_) {
            if (aByteArray885!![i_22_].toInt() == i_15_) {
                i_21_ = i_22_
                break
            }
            i_22_++
        }
        if (i_21_ == -1) return null
        val i_23_ = anIntArrayArray907!![i_21_]!!.size
        if (i_23_ > 0) {
            var l = var_ha.anInt4567.toLong()
            var i_24_ = 0
            while (i_23_ > i_24_) {
                l = l * 67783L + anIntArrayArray907!![i_21_]!![i_24_].toLong()
                i_24_++
            }
            synchronized(this.aClass263_933!!.aClass60_3360) {
                class64 = this.aClass263_933!!.aClass60_3360.method583(l, 78) as Class64?
            }
            if (class64 != null) {
                if (i_18_ != class64.WA()) i_17_ = i_17_ or 0x1000
                if (i_19_ != class64.da()) i_17_ = i_17_ or 0x2000
            }
            if (class64 == null || var_ha.method3667(class64.ua(), i_17_) != 0) {
                var i_25_ = i_17_ or 0x1f01f
                if (class64 != null) i_25_ = var_ha.method3679(i_25_, class64.ua())
                var class124: Class124? = null
                synchronized(Class341.aClass124Array4236!!) {
                    for (i_26_ in 0..<i_23_) {
                        synchronized(this.aClass263_933!!.aClass45_3345!!) {
                            class124 = Class300.method2277(0, (this.aClass263_933!!.aClass45_3345!!), (0xffff and (anIntArrayArray907!![i_21_]!![i_26_])), -1)
                        }
                        if (class124 == null) return null
                        if (class124.anInt1830 < 13) class124.method1092(2, 96)
                        if (i_23_ > 1) Class341.aClass124Array4236!![i_26_] = class124
                    }
                    if (i_23_ > 1) class124 = Class124(Class341.aClass124Array4236!!, i_23_)
                }
                class64 = var_ha.method3625(class124, i_25_, (this.aClass263_933!!.anInt3363), i_18_, i_19_)
                synchronized(this.aClass263_933!!.aClass60_3360) {
                    this.aClass263_933!!.aClass60_3360.method582(class64, l, (-95).toByte())
                }
            }
        }
        val class64_27_ = class64!!.method614(0.toByte(), i_17_, true)
        if (i_18_ != class64.WA()) class64_27_!!.C(i_18_)
        if (class64.da() != i_19_) class64_27_!!.LA(i_19_)
        if (bool) class64_27_!!.v()
        if (i_15_ == 4 && i > 3) {
            class64_27_!!.k(2048)
            class64_27_.H(180, 0, -180)
        }
        i = i and 0x3
        if (i == 1) class64_27_!!.k(4096)
        else if (i != 2) {
            if (i == 3) class64_27_!!.k(12288)
        } else class64_27_!!.k(8192)
        if (aShortArray940 != null) {
            var i_28_ = 0
            while (aShortArray940!!.size > i_28_) {
                if (aByteArray872 != null && aByteArray872!!.size > i_28_) class64_27_!!.ia(aShortArray940!![i_28_], (Class348_Sub26.aShortArray6889!![0xff and aByteArray872!![i_28_].toInt()]))
                else class64_27_!!.ia(aShortArray940!![i_28_], aShortArray908[i_28_])
                i_28_++
            }
        }
        if (aShortArray919 != null) {
            for (i_29_ in aShortArray919!!.indices) class64_27_!!.aa(aShortArray919!![i_29_], aShortArray892[i_29_])
        }
        if (aByte922.toInt() != 0) class64_27_!!.method624(aByte944.toInt(), aByte952.toInt(), aByte879.toInt(), 0xff and aByte922.toInt())
        if (anInt928 != 128 || anInt935 != 128 || anInt882 != 128) class64_27_!!.O(anInt928, anInt935, anInt882)
        if (anInt900 != 0 || anInt873 != 0 || anInt946 != 0) class64_27_!!.H(anInt900, anInt873, anInt946)
        class64_27_!!.s(i_20_)
        return class64_27_
    }

    fun method478(i: Int, i_30_: Int): Boolean {
        if (i_30_ != -31076) return false
        anInt901++
        if (anIntArrayArray907 == null) return true
        synchronized(this.aClass263_933!!.aClass45_3345!!) {
            var i_31_ = 0
            while (aByteArray885!!.size > i_31_) {
                if (aByteArray885!![i_31_].toInt() == i) {
                    var i_32_ = 0
                    while ((anIntArrayArray907!![i_31_]!!.size > i_32_)) {
                        if (!this.aClass263_933!!.aClass45_3345!!.method420(i_30_ xor 0x5061, anIntArrayArray907!![i_31_]!![i_32_], 0)) return false
                        i_32_++
                    }
                    return true
                }
                i_31_++
            }
        }
        return true
    }

    fun method479(i: Byte, class348_sub49: Class348_Sub49) {
        anInt867++
        while (true) {
            val i_33_ = class348_sub49.readUnsignedByte(255)
            if (i_33_ == 0) break
            method482(class348_sub49, i_33_, (-101).toByte())
        }
        if (i.toInt() != 0) method486(-77)
    }

    fun method480(interface17: Interface17, i: Byte): Class51? {
        anInt870++
        var i_34_ = -1
        if (anInt934 == -1) {
            if (anInt939 != -1) i_34_ = interface17.method61(anInt939, (-16).toByte())
        } else i_34_ = interface17.method62(anInt934, i + -65583)
        if (i.toInt() != 47) method478(101, 42)
        if (i_34_ < 0 || -1 + this.anIntArray945!!.size <= i_34_ || this.anIntArray945!![i_34_] == -1) {
            val i_35_ = (this.anIntArray945!![-1 + this.anIntArray945!!.size])
            if (i_35_ == -1) return null
            return this.aClass263_933!!.method2005(0, i_35_)
        }
        return this.aClass263_933!!.method2005(i + -47, this.anIntArray945!![i_34_])
    }

    fun method481(i: Byte, i_36_: Int): Boolean {
        anInt957++
        if (i_36_ == -1) return false
        if (i_36_ == this.anInt868) return true
        if (this.anIntArray943 != null) {
            for (i_37_ in this.anIntArray943!!.indices) {
                if (this.anIntArray943!![i_37_] == i_36_) return true
            }
        }
        if (i < 67) method481(127.toByte(), 25)
        return false
    }

    private fun method482(class348_sub49: Class348_Sub49, i: Int, i_38_: Byte) {
        anInt960++
        if (i == 1 || i == 5) {
            if (i == 5 && this.aClass263_933!!.aBoolean3355) method484(class348_sub49, -528)
            val i_59_ = class348_sub49.readUnsignedByte(255)
            anIntArrayArray907 = arrayOfNulls<IntArray>(i_59_)
            aByteArray885 = ByteArray(i_59_)
            for (i_60_ in 0..<i_59_) {
                aByteArray885!![i_60_] = class348_sub49.readByte(-110)
                val i_61_ = class348_sub49.readUnsignedByte(255)
                anIntArrayArray907!![i_60_] = IntArray(i_61_)
                for (i_62_ in 0..<i_61_) anIntArrayArray907!![i_60_]!![i_62_] = class348_sub49.readUnsignedShort(842397944)
            }
            if (i == 5 && !this.aClass263_933!!.aBoolean3355) method484(class348_sub49, -528)
        } else if (i == 2) this.aString884 = class348_sub49.readString(121.toByte())
        else if (i == 14) this.anInt961 = class348_sub49.readUnsignedByte(255)
        else if (i != 15) {
            if (i == 17) {
                this.aBoolean896 = false
                this.anInt920 = 0
            } else if (i == 18) this.aBoolean896 = false
            else if (i != 19) {
                if (i == 21) aByte886 = 1.toByte()
                else if (i != 22) {
                    if (i == 23) this.anInt955 = 1
                    else if (i == 24) {
                        this.anInt868 = class348_sub49.readUnsignedShort(842397944)
                        if (this.anInt868 == 65535) this.anInt868 = -1
                    } else if (i == 27) this.anInt920 = 1
                    else if (i != 28) {
                        if (i != 29) {
                            if (i == 39) anInt880 = class348_sub49.readByte(-86) * 5
                            else if (i >= 30 && i < 35) this.aStringArray913!![-30 + i] = class348_sub49.readString(88.toByte())
                            else if (i == 40) {
                                val i_57_ = class348_sub49.readUnsignedByte(255)
                                aShortArray940 = ShortArray(i_57_)
                                aShortArray908 = ShortArray(i_57_)
                                var i_58_ = 0
                                while ((i_58_ < i_57_)) {
                                    aShortArray940!![i_58_] = (class348_sub49.readUnsignedShort(842397944)).toShort()
                                    aShortArray908[i_58_] = (class348_sub49.readUnsignedShort(842397944)).toShort()
                                    i_58_++
                                }
                            } else if (i == 41) {
                                val i_55_ = class348_sub49.readUnsignedByte(255)
                                aShortArray892 = ShortArray(i_55_)
                                aShortArray919 = ShortArray(i_55_)
                                for (i_56_ in 0..<i_55_) {
                                    aShortArray919!![i_56_] = (class348_sub49.readUnsignedShort(842397944)).toShort()
                                    aShortArray892[i_56_] = (class348_sub49.readUnsignedShort(842397944)).toShort()
                                }
                            } else if (i == 42) {
                                val i_53_ = class348_sub49.readUnsignedByte(255)
                                aByteArray872 = ByteArray(i_53_)
                                var i_54_ = 0
                                while (i_53_ > i_54_) {
                                    aByteArray872!![i_54_] = class348_sub49.readByte(-92)
                                    i_54_++
                                }
                            } else if (i == 62) this.aBoolean902 = true
                            else if (i != 64) {
                                if (i == 65) anInt928 = (class348_sub49.readUnsignedShort(842397944))
                                else if (i != 66) {
                                    if (i != 67) {
                                        if (i == 69) this.anInt914 = (class348_sub49.readUnsignedByte(255))
                                        else if (i != 70) {
                                            if (i == 71) anInt873 = ((class348_sub49.readShort(13638)) shl 2)
                                            else if (i != 72) {
                                                if (i == 73) this.aBoolean947 = true
                                                else if (i == 74) this.aBoolean876 = true
                                                else if (i != 75) {
                                                    if (i != 77 && (i != 92)) {
                                                        if (i == 78) {
                                                            this.anInt887 = class348_sub49.readUnsignedShort(842397944)
                                                            this.anInt889 = class348_sub49.readUnsignedByte(255)
                                                        } else if (i == 79) {
                                                            this.anInt962 = class348_sub49.readUnsignedShort(842397944)
                                                            this.anInt937 = class348_sub49.readUnsignedShort(842397944)
                                                            this.anInt889 = class348_sub49.readUnsignedByte(255)
                                                            val i_48_ = class348_sub49.readUnsignedByte(255)
                                                            this.anIntArray904 = IntArray(i_48_)
                                                            var i_49_ = 0
                                                            while (i_48_ > i_49_) {
                                                                this.anIntArray904!![i_49_] = class348_sub49.readUnsignedShort(842397944)
                                                                i_49_++
                                                            }
                                                        } else if (i == 81) {
                                                            aByte886 = 2.toByte()
                                                            anInt915 = class348_sub49.readUnsignedByte(255) * 256
                                                        } else if (i != 82) {
                                                            if (i == 88) this.aBoolean894 = false
                                                            else if (i != 89) {
                                                                if (i == 91) this.aBoolean942 = true
                                                                else if (i == 93) {
                                                                    aByte886 = 3.toByte()
                                                                    anInt915 = class348_sub49.readUnsignedShort(842397944)
                                                                } else if (i == 94) aByte886 = 4.toByte()
                                                                else if (i == 95) {
                                                                    aByte886 = 5.toByte()
                                                                    anInt915 = class348_sub49.readShort(13638)
                                                                } else if (i != 97) {
                                                                    if (i != 98) {
                                                                        if (i == 99) {
                                                                            this.anInt950 = class348_sub49.readUnsignedByte(255)
                                                                            this.anInt869 = class348_sub49.readUnsignedShort(842397944)
                                                                        } else if (i == 100) {
                                                                            this.anInt951 = class348_sub49.readUnsignedByte(255)
                                                                            this.anInt877 = class348_sub49.readUnsignedShort(842397944)
                                                                        } else if (i != 101) {
                                                                            if (i == 102) this.anInt875 = class348_sub49.readUnsignedShort(842397944)
                                                                            else if (i != 103) {
                                                                                if (i == 104) this.anInt936 = class348_sub49.readUnsignedByte(255)
                                                                                else if (i != 105) {
                                                                                    if (i == 106) {
                                                                                        val i_39_ = class348_sub49.readUnsignedByte(255)
                                                                                        this.anIntArray943 = IntArray(i_39_)
                                                                                        anIntArray959 = IntArray(i_39_)
                                                                                        for (i_40_ in 0..<i_39_) {
                                                                                            this.anIntArray943!![i_40_] = class348_sub49.readUnsignedShort(842397944)
                                                                                            val i_41_ = class348_sub49.readUnsignedByte(255)
                                                                                            anIntArray959!![i_40_] = i_41_
                                                                                            anInt911 += i_41_
                                                                                        }
                                                                                    } else if (i != 107) {
                                                                                        if (i >= 150 && i < 155) {
                                                                                            this.aStringArray913!![i + -150] = class348_sub49.readString((-41).toByte())
                                                                                            if (!this.aClass263_933!!.aBoolean3359) this.aStringArray913!![-150 + i] = null
                                                                                        } else if (i == 160) {
                                                                                            val i_46_ = class348_sub49.readUnsignedByte(255)
                                                                                            this.anIntArray917 = IntArray(i_46_)
                                                                                            var i_47_ = 0
                                                                                            while (i_46_ > i_47_) {
                                                                                                this.anIntArray917!![i_47_] = class348_sub49.readUnsignedShort(842397944)
                                                                                                i_47_++
                                                                                            }
                                                                                        } else if (i == 162) {
                                                                                            aByte886 = 3.toByte()
                                                                                            anInt915 = class348_sub49.readInt((-126).toByte())
                                                                                        } else if (i == 163) {
                                                                                            aByte944 = class348_sub49.readByte(-118)
                                                                                            aByte952 = class348_sub49.readByte(-83)
                                                                                            aByte879 = class348_sub49.readByte(-87)
                                                                                            aByte922 = class348_sub49.readByte(-111)
                                                                                        } else if (i != 164) {
                                                                                            if (i != 165) {
                                                                                                if (i != 166) {
                                                                                                    if (i == 167) this.anInt930 = class348_sub49.readUnsignedShort(842397944)
                                                                                                    else if (i != 168) {
                                                                                                        if (i != 169) {
                                                                                                            if (i != 170) {
                                                                                                                if (i == 171) this.anInt953 = class348_sub49.readSmart(-121)
                                                                                                                else if (i == 173) {
                                                                                                                    this.anInt878 = class348_sub49.readUnsignedShort(842397944)
                                                                                                                    this.anInt916 = class348_sub49.readUnsignedShort(842397944)
                                                                                                                } else if (i == 249) {
                                                                                                                    val i_42_ = class348_sub49.readUnsignedByte(255)
                                                                                                                    if (aClass356_881 == null) {
                                                                                                                        val i_43_ = method340(i_42_, 108.toByte())
                                                                                                                        aClass356_881 = Class356(i_43_)
                                                                                                                    }
                                                                                                                    for (i_44_ in 0..<i_42_) {
                                                                                                                        val bool = class348_sub49.readUnsignedByte(255) == 1
                                                                                                                        val i_45_ = class348_sub49.readMedium(-1)
                                                                                                                        val class348: Class348?
                                                                                                                        if (!bool) class348 = Class348_Sub35(class348_sub49.readInt((-126).toByte()))
                                                                                                                        else class348 = Class348_Sub50(class348_sub49.readString((-87).toByte()))
                                                                                                                        aClass356_881!!.method3483(86.toByte(), i_45_.toLong(), class348)
                                                                                                                    }
                                                                                                                }
                                                                                                            } else this.anInt909 = class348_sub49.readSmart(-121)
                                                                                                        } else this.aBoolean903 = true
                                                                                                    } else this.aBoolean888 = true
                                                                                                } else anInt890 = class348_sub49.readShort(13638)
                                                                                            } else anInt954 = class348_sub49.readShort(13638)
                                                                                        } else anInt893 = class348_sub49.readShort(13638)
                                                                                    } else this.anInt921 = class348_sub49.readUnsignedShort(842397944)
                                                                                } else this.aBoolean925 = true
                                                                            } else this.anInt955 = 0
                                                                        } else this.anInt923 = class348_sub49.readUnsignedByte(255)
                                                                    } else this.aBoolean929 = true
                                                                } else this.aBoolean912 = true
                                                            } else this.aBoolean924 = false
                                                        } else this.aBoolean931 = true
                                                    } else {
                                                        anInt934 = class348_sub49.readUnsignedShort(842397944)
                                                        if (anInt934 == 65535) anInt934 = -1
                                                        anInt939 = class348_sub49.readUnsignedShort(842397944)
                                                        if (anInt939 == 65535) anInt939 = -1
                                                        var i_50_ = -1
                                                        if (i == 92) {
                                                            i_50_ = class348_sub49.readUnsignedShort(842397944)
                                                            if (i_50_ == 65535) i_50_ = -1
                                                        }
                                                        val i_51_ = class348_sub49.readUnsignedByte(255)
                                                        this.anIntArray945 = IntArray(2 + i_51_)
                                                        var i_52_ = 0
                                                        while (i_51_ >= i_52_) {
                                                            this.anIntArray945!![i_52_] = class348_sub49.readUnsignedShort(842397944)
                                                            if (this.anIntArray945!![i_52_] == 65535) this.anIntArray945!![i_52_] = -1
                                                            i_52_++
                                                        }
                                                        this.anIntArray945!![i_51_ + 1] = i_50_
                                                    }
                                                } else this.anInt895 = (class348_sub49.readUnsignedByte(255))
                                            } else anInt946 = ((class348_sub49.readShort(13638)) shl 2)
                                        } else anInt900 = ((class348_sub49.readShort(13638)) shl 2)
                                    } else anInt882 = (class348_sub49.readUnsignedShort(842397944))
                                } else anInt935 = (class348_sub49.readUnsignedShort(842397944))
                            } else this.aBoolean918 = false
                        } else anInt949 = class348_sub49.readByte(-77).toInt()
                    } else this.anInt883 = (class348_sub49.readUnsignedByte(255) shl 2)
                } else this.aBoolean906 = true
            } else this.anInt874 = class348_sub49.readUnsignedByte(255)
        } else this.anInt926 = class348_sub49.readUnsignedByte(255)
        if (i_38_ >= -93) aByteArray885 = null
    }

    fun method483(i: Int, i_63_: Int, i_64_: Int, i_65_: Int, var_ha: ha?, i_66_: Int, i_67_: Int, i_68_: Byte, var_s: s?, i_69_: Int, i_70_: Int, i_71_: Int, class17: Class17?, var_s_72_: s?): Class64? {
        var i_64_ = i_64_
        var i_67_ = i_67_
        try {
            if (Class104.method955(22311, i_64_)) i_64_ = 4
            anInt910++
            var l = ((this.anInt941 shl 10) + ((i_64_ shl 3) - -i_66_)).toLong()
            val i_73_ = i_67_
            l = l or (var_ha!!.anInt4567 shl 29).toLong()
            if (class17 != null) i_67_ = i_67_ or class17.method263(i, 123, i_70_, false)
            if (aByte886.toInt() != 3) {
                if (aByte886.toInt() != 0 || anInt954 != 0) i_67_ = i_67_ or 0x2
                if (anInt893 != 0) i_67_ = i_67_ or 0x1
                if (anInt890 != 0) i_67_ = i_67_ or 0x4
            } else i_67_ = i_67_ or 0x7
            if (i_64_ == 10 && i_66_ > 3) i_67_ = i_67_ or 0x5
            var class64: Class64?
            synchronized(this.aClass263_933!!.aClass60_3362!!) {
                class64 = this.aClass263_933!!.aClass60_3362!!.method583(l, 100) as Class64?
            }
            if (class64 == null || var_ha.method3667(class64.ua(), i_67_) != 0) {
                if (class64 != null) i_67_ = var_ha.method3679(i_67_, class64.ua())
                class64 = method477(i_66_, var_ha, i_64_, -125, i_67_)
                if (class64 == null) return null
                synchronized(this.aClass263_933!!.aClass60_3362!!) {
                    this.aClass263_933!!.aClass60_3362!!.method582(class64, l, (-127).toByte())
                }
            }
            var bool = false
            if (i_68_ <= 38) return null
            if (class17 != null) {
                class64 = class17.method266(class64, 0x3 and i_66_, i, 1.toByte(), i_70_, i_63_, 663780816, i_67_)
                bool = true
            }
            if (i_64_ == 10 && i_66_ > 3) {
                if (!bool) {
                    class64 = class64!!.method614(3.toByte(), i_67_, true)
                    bool = true
                }
                class64!!.a(2048)
            }
            if (aByte886.toInt() != 0) {
                if (!bool) {
                    bool = true
                    class64 = class64!!.method614(3.toByte(), i_67_, true)
                }
                class64!!.p(aByte886.toInt(), anInt915, var_s_72_, var_s, i_71_, i_65_, i_69_)
            }
            if (anInt893 != 0 || anInt954 != 0 || anInt890 != 0) {
                if (!bool) {
                    bool = true
                    class64 = class64!!.method614(3.toByte(), i_67_, true)
                }
                class64!!.H(anInt893, anInt954, anInt890)
            }
            if (bool) class64!!.s(i_73_)
            return class64
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("iv.L(" + i + ',' + i_63_ + ',' + i_64_ + ',' + i_65_ + ',' + (if (var_ha != null) "{...}" else "null") + ',' + i_66_ + ',' + i_67_ + ',' + i_68_ + ',' + (if (var_s != null) "{...}" else "null") + ',' + i_69_ + ',' + i_70_ + ',' + i_71_ + ',' + (if (class17 != null) "{...}" else "null") + ',' + (if (var_s_72_ != null) "{...}" else "null") + ')'))
        }
    }

    private fun method484(class348_sub49: Class348_Sub49, i: Int) {
        if (i != -528) method486(79)
        anInt871++
        val i_74_ = class348_sub49.readUnsignedByte(255)
        for (i_75_ in 0..<i_74_) {
            class348_sub49.anInt7197++
            val i_76_ = class348_sub49.readUnsignedByte(i xor 0x2f0.inv())
            class348_sub49.anInt7197 += i_76_ * 2
        }
    }

    fun method485(i: Int): Boolean {
        anInt899++
        if (i != 9773) method485(-109)
        if (anIntArrayArray907 == null) return true
        var bool = true
        synchronized(this.aClass263_933!!.aClass45_3345!!) {
            for (i_77_ in anIntArrayArray907!!.indices) {
                var i_78_ = 0
                while ((anIntArrayArray907!![i_77_]!!.size > i_78_)) {
                    bool = bool and (this.aClass263_933!!.aClass45_3345!!.method420(-10499, anIntArrayArray907!![i_77_]!![i_78_], 0))
                    i_78_++
                }
            }
        }
        return bool
    }

    fun method487(i: Int, i_79_: Int, i_80_: Int): Int {
        val i_81_ = 81 % ((i_80_ - -53) / 44)
        anInt898++
        if (aClass356_881 == null) return i_79_
        val class348_sub35 = aClass356_881!!.method3480(i.toLong(), -6008) as Class348_Sub35?
        if (class348_sub35 == null) return i_79_
        return class348_sub35.anInt6976
    }

    fun method488(i: Int) {
        if (this.anInt874 == -1) {
            this.anInt874 = 0
            if (aByteArray885 != null && aByteArray885!!.size == 1 && aByteArray885!![0].toInt() == 10) this.anInt874 = 1
            for (i_82_ in 0..4) {
                if (this.aStringArray913!![i_82_] != null) {
                    this.anInt874 = 1
                    break
                }
            }
        }
        anInt956++
        val i_83_ = -118 / ((-55 - i) / 46)
        if (this.anInt895 == -1) this.anInt895 = if (this.anInt920 != 0) 1 else 0
    }

    fun method489(i: Int): Int {
        anInt927++
        if (this.anIntArray943 != null) {
            var i_84_ = (Math.random() * anInt911.toDouble()).toInt()
            var i_85_: Int
            i_85_ = 0
            while (i_84_ >= anIntArray959!![i_85_]) {
                i_84_ -= anIntArray959!![i_85_]
                i_85_++
            }
            return this.anIntArray943!![i_85_]
        }
        if (i != -1) method483(-2, 60, -13, 88, null, -68, 4, 52.toByte(), null, -111, -120, 102, null, null)
        return -1
    }

    init {
        this.anInt869 = -1
        this.anInt874 = -1
        aByte886 = 0.toByte()
        this.anInt877 = -1
        this.anInt875 = -1
        this.aStringArray913 = arrayOfNulls<String>(5)
        this.anInt921 = -1
        anInt939 = -1
        anInt934 = -1
        this.anInt895 = -1
        aByte922 = 0.toByte()
        anInt915 = -1
        this.anInt951 = -1
        this.anInt955 = -1
        this.anInt950 = -1
        this.anInt887 = -1
    }

    companion object {
        @JvmField
        var anInt866: Int = 0
        @JvmField
        var anInt867: Int = 0
        @JvmField
        var anInt870: Int = 0
        @JvmField
        var anInt871: Int = 0
        @JvmField
        var anInt891: Int = 0
        @JvmField
        var aClass311_897: Class311? = null
        @JvmField
        var anInt898: Int = 0
        @JvmField
        var anInt899: Int = 0
        @JvmField
        var anInt901: Int = 0
        @JvmField
        var aClass101_905: Class101? = null
        @JvmField
        var anInt910: Int = 0
        @JvmField
        var anInt927: Int = 0
        @JvmField
        var aStringArray932: Array<String?>? = arrayOfNulls<String>(100)
        @JvmField
        var anInt938: Int = 0
        @JvmField
        var anInt948: Int = 0
        @JvmField
        var anInt956: Int = 0
        @JvmField
        var anInt957: Int = 0
        @JvmField
        var anInt958: Int = 0
        @JvmField
        var anInt960: Int = 0
        @JvmStatic
        fun method486(i: Int) {
            aStringArray932 = null
            if (i > -19) method486(-34)
            aClass101_905 = null
            aClass311_897 = null
        }
    }
}
