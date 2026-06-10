/* Class17 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class17 {
    @JvmField
    var anIntArray236: IntArray? = null
    @JvmField
    var anIntArray237: IntArray = IntArray(0)
    @JvmField
    var anInt238: Int
    @JvmField
    var anInt239: Int = 5
    @JvmField
    var aBoolean241: Boolean = false
    @JvmField
    var aBoolean242: Boolean = false
    @JvmField
    var anInt244: Int = 99
    @JvmField
    var anInt245: Int
    @JvmField
    var anInt248: Int = 2
    @JvmField
    var anInt249: Int
    @JvmField
    var aClass87_251: Class87? = null
    @JvmField
    var anIntArray253: IntArray? = null
    @JvmField
    var aBoolean254: Boolean = false
    private var anIntArray260: IntArray? = null
    @JvmField
    var anInt261: Int
    @JvmField
    var anInt262: Int
    @JvmField
    var aBooleanArray263: BooleanArray? = null
    @JvmField
    var anIntArrayArray264: Array<IntArray?>? = null
    @JvmField
    var anIntArray265: IntArray? = null
    @JvmField
    var anIntArray267: IntArray? = null
    @JvmField
    var aBoolean268: Boolean = false
    @JvmField
    var anInt269: Int = 0

    fun method263(i: Int, i_0_: Int, i_1_: Int, bool: Boolean): Int {
        anInt240++
        var i_2_ = 0
        var i_3_ = 0
        var i_4_ = this.anIntArray237[i_1_]
        var class348_sub42_sub17: Class348_Sub42_Sub17? = null
        val class348_sub42_sub17_5_ = this.aClass87_251!!.method839(i_4_ shr 16, 3)
        i_4_ = i_4_ and 0xffff
        if (class348_sub42_sub17_5_ == null) return i_2_
        if ((this.aBoolean241 || Class28.aBoolean5002) && i != -1 && i < this.anIntArray237.size) {
            i_3_ = this.anIntArray237[i]
            class348_sub42_sub17 = this.aClass87_251!!.method839(i_3_ shr 16, 3)
            i_3_ = i_3_ and 0xffff
        }
        if (i_0_ <= 96) return 11
        if (this.aBoolean242) i_2_ = i_2_ or 0x200
        if (class348_sub42_sub17_5_.method3272(i_4_, 0)) i_2_ = i_2_ or 0x80
        if (class348_sub42_sub17_5_.method3271(i_4_, 14)) i_2_ = i_2_ or 0x100
        if (class348_sub42_sub17_5_.method3267((-110).toByte(), i_4_)) i_2_ = i_2_ or 0x400
        if (class348_sub42_sub17 != null) {
            if (class348_sub42_sub17.method3272(i_3_, 0)) i_2_ = i_2_ or 0x80
            if (class348_sub42_sub17.method3271(i_3_, 14)) i_2_ = i_2_ or 0x100
            if (class348_sub42_sub17.method3267((-127).toByte(), i_3_)) i_2_ = i_2_ or 0x400
        }
        if (anIntArray260 != null && bool) {
            if (anIntArray260!!.size > i_1_) {
                var i_6_ = anIntArray260!![i_1_]
                if (i_6_ != 65535) {
                    val class348_sub42_sub17_7_ = this.aClass87_251!!.method839(i_6_ shr 16, 3)
                    i_6_ = i_6_ and 0xffff
                    if (class348_sub42_sub17_7_ != null) {
                        if (class348_sub42_sub17_7_.method3272(i_6_, 0)) i_2_ = i_2_ or 0x80
                        if (class348_sub42_sub17_7_.method3271(i_6_, 14)) i_2_ = i_2_ or 0x100
                        if (class348_sub42_sub17_7_.method3267((-103).toByte(), i_6_)) i_2_ = i_2_ or 0x400
                    }
                }
            }
            if ((this.aBoolean241 || Class28.aBoolean5002) && i != -1 && anIntArray260!!.size > i) {
                var i_8_ = anIntArray260!![i]
                if (i_8_ != 65535) {
                    val class348_sub42_sub17_9_ = this.aClass87_251!!.method839(i_8_ shr 16, 3)
                    i_8_ = i_8_ and 0xffff
                    if (class348_sub42_sub17_9_ != null) {
                        if (class348_sub42_sub17_9_.method3272(i_8_, 0)) i_2_ = i_2_ or 0x80
                        if (class348_sub42_sub17_9_.method3271(i_8_, 14)) i_2_ = i_2_ or 0x100
                        if (class348_sub42_sub17_9_.method3267((-93).toByte(), i_8_)) i_2_ = i_2_ or 0x400
                    }
                }
            }
        }
        return 0x20 or i_2_
    }

    private fun method264(class348_sub49: Class348_Sub49, i: Int, i_10_: Int) {
        if (i_10_ == -14861) {
            if (i == 1) {
                val i_11_ = class348_sub49.readUnsignedShort(842397944) //short
                this.anIntArray267 = IntArray(i_11_)
                this.anIntArray237 = IntArray(i_11_)
                for (i_12_ in 0..<i_11_) this.anIntArray267!![i_12_] = class348_sub49.readUnsignedShort(842397944)
                for (i_13_ in 0..<i_11_) this.anIntArray237[i_13_] = class348_sub49.readUnsignedShort(842397944)
                for (i_14_ in 0..<i_11_) this.anIntArray237[i_14_] = ((class348_sub49.readUnsignedShort(842397944) shl 16) + this.anIntArray237[i_14_])
            } else if (i != 2) {
                if (i == 3) {
                    this.aBooleanArray263 = BooleanArray(256)
                    val i_15_ = class348_sub49.readUnsignedByte(255) //byte
                    for (i_16_ in 0..<i_15_) this.aBooleanArray263!![class348_sub49.readUnsignedByte(255)] = true
                } else if (i != 5) {
                    if (i != 6) {
                        if (i != 7) {
                            if (i != 8) {
                                if (i == 9) this.anInt262 = class348_sub49.readUnsignedByte(i_10_ + 15116)
                                else if (i == 10) this.anInt245 = class348_sub49.readUnsignedByte(i_10_ xor 0x3af3.inv())
                                else if (i != 11) {
                                    if (i == 12) {
                                        val i_17_ = class348_sub49.readUnsignedByte(i_10_ xor 0x3af3.inv())
                                        anIntArray260 = IntArray(i_17_)
                                        var i_18_ = 0
                                        while ((i_18_ < i_17_)) {
                                            anIntArray260!![i_18_] = class348_sub49.readUnsignedShort(842397944)
                                            i_18_++
                                        }
                                        var i_19_ = 0
                                        while ((i_17_ > i_19_)) {
                                            anIntArray260!![i_19_] = ((class348_sub49.readUnsignedShort(842397944) shl 16) - -anIntArray260!![i_19_])
                                            i_19_++
                                        }
                                    } else if (i == 13) {
                                        val i_20_ = class348_sub49.readUnsignedShort(842397944)
                                        this.anIntArrayArray264 = arrayOfNulls<IntArray>(i_20_)
                                        var i_21_ = 0
                                        while ((i_21_ < i_20_)) {
                                            val i_22_ = class348_sub49.readUnsignedByte(255)
                                            if (i_22_ > 0) {
                                                this.anIntArrayArray264!![i_21_] = IntArray(i_22_)
                                                this.anIntArrayArray264!![i_21_]!![0] = class348_sub49.readMedium(-1)
                                                var i_23_ = 1
                                                while ((i_22_ > i_23_)) {
                                                    this.anIntArrayArray264!![i_21_]!![i_23_] = (class348_sub49.readUnsignedShort(842397944))
                                                    i_23_++
                                                }
                                            }
                                            i_21_++
                                        }
                                    } else if (i != 14) {
                                        if (i == 15) this.aBoolean241 = true
                                        else if (i == 16) this.aBoolean254 = true
                                        else if (i == 18) this.aBoolean268 = true
                                        else if (i == 19) {
                                            if (this.anIntArray253 == null) {
                                                this.anIntArray253 = (IntArray((this.anIntArrayArray264)!!.size))
                                                var i_24_ = 0
                                                while (((this.anIntArrayArray264)!!.size > i_24_)) {
                                                    this.anIntArray253!![i_24_] = 255
                                                    i_24_++
                                                }
                                            }
                                            this.anIntArray253!![class348_sub49.readUnsignedByte(255)] = (class348_sub49.readUnsignedByte(Class348_Sub21.method2955(i_10_, -15092)))
                                        } else if (i == 20) {
                                            if ((this.anIntArray236 == null) || (this.anIntArray265) == null) {
                                                this.anIntArray236 = (IntArray((this.anIntArrayArray264)!!.size))
                                                this.anIntArray265 = (IntArray((this.anIntArrayArray264)!!.size))
                                                var i_25_ = 0
                                                while (((this.anIntArrayArray264)!!.size > i_25_)) {
                                                    this.anIntArray236!![i_25_] = 256
                                                    this.anIntArray265!![i_25_] = 256
                                                    i_25_++
                                                }
                                            }
                                            val i_26_ = class348_sub49.readUnsignedByte(255)
                                            this.anIntArray236!![i_26_] = class348_sub49.readUnsignedShort(842397944)
                                            this.anIntArray265!![i_26_] = class348_sub49.readUnsignedShort(842397944)
                                        }
                                    } else this.aBoolean242 = true
                                } else this.anInt248 = class348_sub49.readUnsignedByte(255)
                            } else this.anInt244 = class348_sub49.readUnsignedByte(255)
                        } else this.anInt261 = class348_sub49.readUnsignedShort(842397944)
                    } else this.anInt249 = class348_sub49.readUnsignedShort(842397944)
                } else this.anInt239 = class348_sub49.readUnsignedByte(i_10_ + 15116)
            } else this.anInt238 = class348_sub49.readUnsignedShort(i_10_ xor 0x3235c2f4.inv())
            anInt257++
        }
    }

    fun method266(class64: Class64, i: Int, i_27_: Int, i_28_: Byte, i_29_: Int, i_30_: Int, i_31_: Int, i_32_: Int): Class64? {
        var i_27_ = i_27_
        var i_29_ = i_29_
        var i_32_ = i_32_
        anInt266++
        val i_33_ = this.anIntArray267!![i_29_]
        i_29_ = this.anIntArray237[i_29_]
        val class348_sub42_sub17 = this.aClass87_251!!.method839(i_29_ shr 16, 3)
        i_29_ = i_29_ and 0xffff
        if (class348_sub42_sub17 == null) return class64.method614(i_28_, i_32_, true)
        var class348_sub42_sub17_34_: Class348_Sub42_Sub17? = null
        if ((this.aBoolean241 || Class28.aBoolean5002) && i_27_ != -1 && this.anIntArray237.size > i_27_) {
            i_27_ = this.anIntArray237[i_27_]
            class348_sub42_sub17_34_ = this.aClass87_251!!.method839(i_27_ shr 16, 3)
            i_27_ = i_27_ and 0xffff
        }
        if (this.aBoolean242) i_32_ = i_32_ or 0x200
        if (class348_sub42_sub17.method3272(i_29_, i_31_ + -663780816)) i_32_ = i_32_ or 0x80
        if (class348_sub42_sub17.method3271(i_29_, i_31_ xor 0x27907dde)) i_32_ = i_32_ or 0x100
        if (class348_sub42_sub17.method3267((-126).toByte(), i_29_)) i_32_ = i_32_ or 0x400
        if (class348_sub42_sub17_34_ != null) {
            if (class348_sub42_sub17_34_.method3272(i_27_, 0)) i_32_ = i_32_ or 0x80
            if (class348_sub42_sub17_34_.method3271(i_27_, 14)) i_32_ = i_32_ or 0x100
            if (class348_sub42_sub17_34_.method3267((-125).toByte(), i_27_)) i_32_ = i_32_ or 0x400
        }
        i_32_ = i_32_ or 0x20
        if (i_31_ != 663780816) this.anInt261 = -72
        val class64_35_ = class64.method614(i_28_, i_32_, true)
        class64_35_!!.method617(i_29_, i_33_, class348_sub42_sub17_34_, i, class348_sub42_sub17, false, this.aBoolean242, i_27_, i_30_ + -1)
        return class64_35_
    }

    fun method267(class348_sub49: Class348_Sub49, bool: Boolean) {
        anInt243++
        while (true) {
            val i = class348_sub49.readUnsignedByte(255)
            if (i == 0) break
            method264(class348_sub49, i, -14861)
        }
        if (bool != false) this.anIntArray267 = null
    }

    fun method269(i: Int, class64: Class64, i_50_: Int, i_51_: Int, i_52_: Int, i_53_: Int): Class64? {
        var i_50_ = i_50_
        var i_52_ = i_52_
        anInt246++
        val i_54_ = this.anIntArray267!![i_53_]
        var i_55_ = this.anIntArray237[i_53_]
        val class348_sub42_sub17 = this.aClass87_251!!.method839(i_55_ shr 16, 3)
        i_55_ = i_55_ and 0xffff
        if (class348_sub42_sub17 == null) return class64.method614(1.toByte(), i_52_, true)
        var class348_sub42_sub17_56_: Class348_Sub42_Sub17? = null
        if ((this.aBoolean241 || Class28.aBoolean5002) && i_50_ != -1 && this.anIntArray237.size > i_50_) {
            i_50_ = this.anIntArray237[i_50_]
            class348_sub42_sub17_56_ = this.aClass87_251!!.method839(i_50_ shr 16, 3)
            i_50_ = i_50_ and 0xffff
        }
        var class348_sub42_sub17_57_: Class348_Sub42_Sub17? = null
        var class348_sub42_sub17_58_: Class348_Sub42_Sub17? = null
        var i_59_ = 0
        var i_60_ = 0
        if (anIntArray260 != null) {
            if (anIntArray260!!.size > i_53_) {
                i_59_ = anIntArray260!![i_53_]
                if (i_59_ != 65535) {
                    class348_sub42_sub17_57_ = this.aClass87_251!!.method839(i_59_ shr 16, 3)
                    i_59_ = i_59_ and 0xffff
                }
            }
            if ((this.aBoolean241 || Class28.aBoolean5002) && i_50_ != -1 && i_50_ < anIntArray260!!.size) {
                i_60_ = anIntArray260!![i_50_]
                if (i_60_ != 65535) {
                    class348_sub42_sub17_58_ = this.aClass87_251!!.method839(i_60_ shr 16, 3)
                    i_60_ = i_60_ and 0xffff
                }
            }
        }
        if (this.aBoolean242) i_52_ = i_52_ or 0x200
        if (class348_sub42_sub17.method3272(i_55_, 0)) i_52_ = i_52_ or 0x80
        if (class348_sub42_sub17.method3271(i_55_, 14)) i_52_ = i_52_ or 0x100
        if (class348_sub42_sub17.method3267((-102).toByte(), i_55_)) i_52_ = i_52_ or 0x400
        if (class348_sub42_sub17_57_ != null) {
            if (class348_sub42_sub17_57_.method3272(i_59_, 0)) i_52_ = i_52_ or 0x80
            if (class348_sub42_sub17_57_.method3271(i_59_, 14)) i_52_ = i_52_ or 0x100
            if (class348_sub42_sub17_57_.method3267((-109).toByte(), i_59_)) i_52_ = i_52_ or 0x400
        }
        if (class348_sub42_sub17_56_ != null) {
            if (class348_sub42_sub17_56_.method3272(i_50_, 0)) i_52_ = i_52_ or 0x80
            if (class348_sub42_sub17_56_.method3271(i_50_, 14)) i_52_ = i_52_ or 0x100
            if (class348_sub42_sub17_56_.method3267((-114).toByte(), i_50_)) i_52_ = i_52_ or 0x400
        }
        if (class348_sub42_sub17_58_ != null) {
            if (class348_sub42_sub17_58_.method3272(i_60_, 0)) i_52_ = i_52_ or 0x80
            if (class348_sub42_sub17_58_.method3271(i_60_, 14)) i_52_ = i_52_ or 0x100
            if (class348_sub42_sub17_58_.method3267((-109).toByte(), i_60_)) i_52_ = i_52_ or 0x400
        }
        i_52_ = i_52_ or 0x20
        val class64_61_ = class64.method614(1.toByte(), i_52_, true)
        val i_62_ = -33 / ((49 - i) / 45)
        class64_61_!!.method617(i_55_, i_54_, class348_sub42_sub17_56_, 0, class348_sub42_sub17, false, this.aBoolean242, i_50_, -1 + i_51_)
        if (class348_sub42_sub17_57_ != null) class64_61_.method617(i_59_, i_54_, class348_sub42_sub17_58_, 0, class348_sub42_sub17_57_, false, this.aBoolean242, i_60_, -1 + i_51_)
        return class64_61_
    }

    fun method270(i: Byte) {
        anInt258++
        if (this.anInt262 == -1) {
            if (this.aBooleanArray263 == null) this.anInt262 = 0
            else this.anInt262 = 2
        }
        if (this.anInt245 == -1) {
            if (this.aBooleanArray263 != null) this.anInt245 = 2
            else this.anInt245 = 0
        }
        val i_63_ = -41 / ((i - 45) / 49)
    }

    init {
        this.anInt238 = -1
        this.anInt245 = -1
        this.anInt262 = -1
        this.anInt249 = -1
        this.anInt261 = -1
    }

    companion object {
        @JvmField
        var anInt235: Int = 0
        @JvmField
        var anInt240: Int = 0
        @JvmField
        var anInt243: Int = 0
        @JvmField
        var anInt246: Int = 0
        @JvmField
        var aBoolean247: Boolean = false
        var aClass114_250: Class114? = Class114(4, 1)
        @JvmField
        var anInterface4_252: Interface4? = null
        @JvmField
        var anIntArrayArray255: Array<IntArray?>? = null
        @JvmField
        var anIntArray256: IntArray? = null
        @JvmField
        var anInt257: Int = 0
        @JvmField
        var anInt258: Int = 0
        @JvmField
        var anInt259: Int = 0
        @JvmField
        var anInt266: Int = 0
        @JvmStatic
        fun method265(bool: Boolean) {
            anIntArray256 = null
            aClass114_250 = null
            anIntArrayArray255 = null
            if (bool != false) method268(-22, -54, -101, -115, -107, 90, 13, -47)
            anInterface4_252 = null
        }

        @JvmStatic
        fun method268(i: Int, i_36_: Int, i_37_: Int, i_38_: Int, i_39_: Int, i_40_: Int, i_41_: Int, i_42_: Int) {
            var i_42_ = i_42_
            anInt259++
            var i_43_ = -334 + i_39_
            if (i_43_ < 0) i_43_ = 0
            else if (i_43_ > 100) i_43_ = 100
            val i_44_ = (i_43_ * (-Class348_Sub23_Sub3.aShort9044 + Class320.aShort3992) / 100 + Class348_Sub23_Sub3.aShort9044)
            i_42_ = i_42_ * i_44_ shr 8
            Class132.anInt1906 = Class132.anInt1911 * i_44_ shr 8
            val i_45_ = 16384 - i and 0x3fff
            val i_46_ = 0x3fff and 16384 - i_37_
            if (i_40_ != -19360) anInterface4_252 = null
            var i_47_ = 0
            var i_48_ = 0
            var i_49_ = i_42_
            if (i_45_ != 0) {
                i_48_ = -i_49_ * Class70.anIntArray1207!![i_45_] shr 14
                i_49_ = Class70.anIntArray1204!![i_45_] * i_49_ shr 14
            }
            if (i_46_ != 0) {
                i_47_ = Class70.anIntArray1207!![i_46_] * i_49_ shr 14
                i_49_ = i_49_ * Class70.anIntArray1204!![i_46_] shr 14
            }
            Class5.anInt4638 = i_37_
            Class338.anInt4186 = 0
            Class59_Sub2_Sub2.anInt8685 = i_38_ - i_49_
            Class305.anInt3855 = -i_48_ + i_36_
            Class286_Sub4.anInt6246 = -i_47_ + i_41_
            Class348_Sub42_Sub19.anInt9701 = i
        }
    }
}
