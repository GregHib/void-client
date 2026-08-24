import NullRenderPass.Companion.method3535

/* Class211 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class SoundEnvelope {

    var anInt2731: Int = 0

    var anInt2734: Int = 0
    private var anInt2735 = 0

    var aBoolean2737: Boolean = false
    private var anInt2738 = 0
    private var anInt2739 = 0
    private var anInt2740 = 0

    var aShortArray2742: ShortArray? = null
    private var anInt2743 = 0

    var aClass348_Sub1_2745: AbstractTileShape? = null

    var aBoolean2749: Boolean = false

    fun method1539(i: Int, i_27_: Byte, i_28_: Int, i_29_: Int, i_30_: Int) {
        anInt2741++
        anInt2735 = i_28_
        anInt2738 = i
        anInt2743 = i_30_
        anInt2740 = i_29_
    }

    private fun method1541(i: Int, var_renderer: Renderer, i_33_: Int, i_34_: Int, i_35_: Int, i_36_: Int, i_37_: Int) {
        anInt2736++
        if (i_35_ == 3) this.aClass348_Sub1_2745 = var_renderer.method3690(i_34_, i, i_33_, i_37_, i_36_, 1.0f)
    }

    private fun method1542(i: Int) {
        val i_38_ = this.anInt2734
        while_70_@ do {
            while_69_@ do {
                while_68_@ do {
                    while_67_@ do {
                        while_66_@ do {
                            while_65_@ do {
                                while_64_@ do {
                                    while_63_@ do {
                                        while_62_@ do {
                                            while_61_@ do {
                                                while_60_@ do {
                                                    while_59_@ do {
                                                        while_58_@ do {
                                                            while_57_@ do {
                                                                do {
                                                                    if (i_38_ == 2) {
                                                                        anInt2743 = 2048
                                                                        anInt2738 = 0
                                                                        anInt2735 = 2048
                                                                        anInt2740 = 1
                                                                        break@while_70_
                                                                    } else if (i_38_ != 3) {
                                                                        if (i_38_ != 4) {
                                                                            if (i_38_ != 5) {
                                                                                if (i_38_ != 12) {
                                                                                    if (i_38_ != 13) {
                                                                                        if (i_38_ != 10) {
                                                                                            if (i_38_ != 11) {
                                                                                                if (i_38_ != 6) {
                                                                                                    if (i_38_ != 7) {
                                                                                                        if (i_38_ != 8) {
                                                                                                            if (i_38_ != 9) {
                                                                                                                if (i_38_ != 14) {
                                                                                                                    if (i_38_ != 15) {
                                                                                                                        if (i_38_ == 16) break@while_68_
                                                                                                                        break@while_69_
                                                                                                                    }
                                                                                                                } else break@while_66_
                                                                                                                break@while_67_
                                                                                                            }
                                                                                                        } else break@while_64_
                                                                                                        break@while_65_
                                                                                                    }
                                                                                                } else break@while_62_
                                                                                                break@while_63_
                                                                                            }
                                                                                        } else break@while_60_
                                                                                        break@while_61_
                                                                                    }
                                                                                } else break@while_58_
                                                                                break@while_59_
                                                                            }
                                                                        } else break
                                                                        break@while_57_
                                                                    }
                                                                    anInt2738 = 0
                                                                    anInt2743 = 2048
                                                                    anInt2740 = 1
                                                                    anInt2735 = 4096
                                                                    break@while_70_
                                                                } while (false)
                                                                anInt2738 = 0
                                                                anInt2740 = 4
                                                                anInt2743 = 2048
                                                                anInt2735 = 2048
                                                                break@while_70_
                                                            } while (false)
                                                            anInt2735 = 8192
                                                            anInt2740 = 4
                                                            anInt2743 = 2048
                                                            anInt2738 = 0
                                                            break@while_70_
                                                        } while (false)
                                                        anInt2735 = 2048
                                                        anInt2740 = 2
                                                        anInt2738 = 0
                                                        anInt2743 = 2048
                                                        break@while_70_
                                                    } while (false)
                                                    anInt2743 = 2048
                                                    anInt2738 = 0
                                                    anInt2740 = 2
                                                    anInt2735 = 8192
                                                    break@while_70_
                                                } while (false)
                                                anInt2743 = 512
                                                anInt2740 = 3
                                                anInt2738 = 1536
                                                anInt2735 = 2048
                                                break@while_70_
                                            } while (false)
                                            anInt2740 = 3
                                            anInt2743 = 512
                                            anInt2738 = 1536
                                            anInt2735 = 4096
                                            break@while_70_
                                        } while (false)
                                        anInt2738 = 1280
                                        anInt2740 = 3
                                        anInt2743 = 768
                                        anInt2735 = 2048
                                        break@while_70_
                                    } while (false)
                                    anInt2738 = 1280
                                    anInt2740 = 3
                                    anInt2735 = 4096
                                    anInt2743 = 768
                                    break@while_70_
                                } while (false)
                                anInt2738 = 1024
                                anInt2735 = 2048
                                anInt2743 = 1024
                                anInt2740 = 3
                                break@while_70_
                            } while (false)
                            anInt2743 = 1024
                            anInt2735 = 4096
                            anInt2740 = 3
                            anInt2738 = 1024
                            break@while_70_
                        } while (false)
                        anInt2740 = 1
                        anInt2738 = 1280
                        anInt2735 = 2048
                        anInt2743 = 768
                        break@while_70_
                    } while (false)
                    anInt2735 = 4096
                    anInt2743 = 512
                    anInt2740 = 1
                    anInt2738 = 1536
                    break@while_70_
                } while (false)
                anInt2735 = 8192
                anInt2740 = 1
                anInt2743 = 256
                anInt2738 = 1792
                break@while_70_
            } while (false)
            anInt2735 = 2048
            anInt2743 = 2048
            anInt2738 = 0
            anInt2740 = 0
        } while (false)
        if (i == 32402) anInt2748++
    }

    fun method1544(i: Int, bool: Boolean, i_39_: Int) {
        if (i != 8688) method1544(86, false, 92)
        anInt2733++
        val i_40_: Int
        while_74_@ do {
            if (bool) i_40_ = 2048
            else {
                val i_41_ = 0x7ff and anInt2735 * i_39_ / 50 + anInt2739
                val i_42_ = anInt2740
                while_73_@ do {
                    while_72_@ do {
                        while_71_@ do {
                            do {
                                if (i_42_ == 1) {
                                    i_40_ = ((SpotAnimVector.anIntArray1207!![i_41_ shl 3]) shr 4) + 1024
                                    break@while_74_
                                } else if (i_42_ != 3) {
                                    if (i_42_ != 4) {
                                        if (i_42_ != 2) {
                                            if (i_42_ == 5) break@while_72_
                                            break@while_73_
                                        }
                                    } else break
                                    break@while_71_
                                }
                                i_40_ = (SoundEnvelope.anIntArray3726!![i_41_] shr 1)
                                break@while_74_
                            } while (false)
                            i_40_ = i_41_ shr 10 shl 11
                            break@while_74_
                        } while (false)
                        i_40_ = i_41_
                        break@while_74_
                    } while (false)
                    i_40_ = (if (i_41_ >= 1024) -i_41_ + 2048 else i_41_) shl 1
                    break@while_74_
                } while (false)
                i_40_ = 2048
            }
        } while (false)
        this.aClass348_Sub1_2745!!.method2716(-1, (((anInt2743 * i_40_ shr 11) + anInt2738).toFloat() / 2048.0f))
    }

    protected constructor() {
        if (SoundEnvelope.anIntArray3726 == null) method1177(122.toByte())
        method1542(32402)
    }

    internal constructor(var_renderer: Renderer?, class348_sub49: ByteBuffer?, i: Int) {
        try {
            if (SoundEnvelope.anIntArray3726 == null) method1177(122.toByte())
            this.anInt2731 = class348_sub49!!.readUnsignedByte(255)
            this.aBoolean2737 = (0x8 and this.anInt2731) != 0
            this.aBoolean2749 = (this.anInt2731 and 0x10) != 0
            this.anInt2731 = 0x7 and this.anInt2731
            val i_43_ = class348_sub49.readUnsignedShort(842397944) shl i
            val i_44_ = class348_sub49.readUnsignedShort(842397944) shl i
            val i_45_ = class348_sub49.readUnsignedShort(842397944) shl i
            var i_46_ = class348_sub49.readUnsignedByte(255)
            val i_47_ = 1 + i_46_ * 2
            this.aShortArray2742 = ShortArray(i_47_)
            var i_48_ = 0
            while ((i_48_ < this.aShortArray2742!!.size)) {
                val i_49_ = class348_sub49.readUnsignedShort(842397944).toShort().toInt()
                var i_50_ = i_49_ ushr 8
                if (i_47_ <= i_50_) i_50_ = i_47_ - 1
                var i_51_ = 0xff and i_49_
                if (-i_50_ + i_47_ < i_51_) i_51_ = i_47_ - i_50_
                this.aShortArray2742!![i_48_] = WhirlpoolHash.method2057(i_51_, i_50_ shl 8).toShort()
                i_48_++
            }
            i_46_ = ((i_46_ shl ActorEntity.anInt4459) + ActorEntity.anInt9037)
            val i_52_ = (if (SoundEnvelope.anIntArray179 == null) (SoundEnvelope.anIntArray4983!![method303(class348_sub49.readUnsignedShort(842397944), 30).toInt() and 0xffff]) else (SoundEnvelope.anIntArray179!![class348_sub49.readUnsignedShort(842397944)]))
            val i_53_ = class348_sub49.readUnsignedByte(255)
            anInt2739 = (0xe0 and i_53_) shl 3
            this.anInt2734 = 0x1f and i_53_
            if (this.anInt2734 != 31) method1542(32402)
            method1541(i_45_, var_renderer!!, i_44_, i_43_, 3, i_52_, i_46_)
        } catch (runtimeexception: RuntimeException) {
            throw TextureLoadException.method2929(runtimeexception, ("ro.<init>(" + (if (var_renderer != null) "{...}" else "null") + ',' + (if (class348_sub49 != null) "{...}" else "null") + ',' + i + ')'))
        }
    }

    companion object {
        var anInt2733: Int = 0
        var anInt2736: Int = 0
        var anInt2741: Int = 0
        var anInt2748: Int = 0
        var anIntArray3726: IntArray? = null
        var anIntArray179: IntArray? = null
        var anIntArray4983: IntArray? = null

        var anInt362: Int = 0
        fun method303(i: Int, i_3_: Int): Short {
            anInt362++
            val i_4_ = (i and 0xfe66) shr 10
            var i_5_ = i shr 3 and 0x70
            val i_6_ = i and 0x7f
            i_5_ = (if (i_6_ <= 64) i_6_ * i_5_ shr 7 else i_5_ * (127 + -i_6_) shr 7)
            val i_7_ = i_5_ + i_6_
            val i_8_: Int
            if (i_7_ != 0) i_8_ = (i_5_ shl 8) / i_7_
            else i_8_ = i_5_ shl 1
            val i_9_ = i_7_
            if (i_3_ != 30) return 79.toShort()
            return (i_9_ or (i_8_ shr 4 shl 7 or (i_4_ shl 10))).toShort()
        }

        var anInt1970: Int = 0
        fun method1177(i: Byte) {
            anIntArray3726 = method3533(127.toByte(), 2048, 4, 8, 0.4f, 35, true, 8)
            if (i.toInt() == 122) anInt1970++
        }

        var anInt7281: Int = 0
        fun method3533(i: Byte, i_0_: Int, i_1_: Int, i_2_: Int, f: Float, i_3_: Int, bool: Boolean, i_4_: Int): IntArray {
            anInt7281++
            val `is` = IntArray(i_0_)
            val class348_sub40_sub8 = PerlinNoiseTextureNode()
            class348_sub40_sub8.anInt9149 = (f * 4096.0f).toInt()
            class348_sub40_sub8.anInt9164 = i_4_
            class348_sub40_sub8.anInt9150 = i_1_
            class348_sub40_sub8.aBoolean9160 = bool
            class348_sub40_sub8.anInt9158 = i_2_
            class348_sub40_sub8.anInt9156 = i_3_
            class348_sub40_sub8.method3044(110)
            NpcType.method797(1, i_0_, 115.toByte())
            class348_sub40_sub8.method3069(0, `is`, 115.toByte())
            if (i < 89) method3535(72, -40)
            return `is`
        }
    }
}
