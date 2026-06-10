import jaggl.OpenGL.Companion.glDisable
import jaggl.OpenGL.Companion.glEnable
import jaggl.OpenGL.Companion.glLoadIdentity
import jaggl.OpenGL.Companion.glMatrixMode
import jaggl.OpenGL.Companion.glRotatef
import jaggl.OpenGL.Companion.glTexGeni
import kotlin.math.pow
import kotlin.math.sqrt

class Class286_Sub9 internal constructor(var_ha_Sub2: ha_Sub2) : Class286(var_ha_Sub2) {
    private var aBoolean6308 = false
    private var aClass61_6310: Class61? = null
    private var aBoolean6316 = false
    private var aClass258_Sub2Array6317: Array<Class258_Sub2?>? = null
    override fun method2133(i: Int) {
        anInt6318++
        if (aBoolean6316) {
            if (!aBoolean6308) {
                this.aHa_Sub2_3684.method3738(-15039, 2)
                this.aHa_Sub2_3684.method3771((-84).toByte(), null)
            }
            this.aHa_Sub2_3684.method3738(-15039, 1)
            this.aHa_Sub2_3684.method3771((-87).toByte(), null)
            this.aHa_Sub2_3684.method3738(-15039, 0)
            aClass61_6310!!.method594('\u0001', 28666)
            aBoolean6316 = false
        } else this.aHa_Sub2_3684.method3775(false, 0, 770, 5890)
        if (i < -75) this.aHa_Sub2_3684.method3729(8448, (-75).toByte(), 8448)
    }

    override fun method2140(class258: Class258?, i: Byte, i_5_: Int) {
        if (i >= -89) aClass258_Sub2Array6317 = null
        this.aHa_Sub2_3684.method3771((-115).toByte(), class258)
        anInt6312++
        this.aHa_Sub2_3684.method3761(0, i_5_)
    }

    private fun method2176(i: Int) {
        aClass61_6310 = Class61(this.aHa_Sub2_3684, 2)
        if (i >= -7) method2140(null, 112.toByte(), -64)
        anInt6314++
        aClass61_6310!!.method595(105.toByte(), 0)
        this.aHa_Sub2_3684.method3738(-15039, 1)
        glTexGeni(8192, 9472, 34065)
        glTexGeni(8193, 9472, 34065)
        glTexGeni(8194, 9472, 34065)
        glEnable(3168)
        glEnable(3169)
        glEnable(3170)
        glMatrixMode(5890)
        glLoadIdentity()
        glRotatef(22.5f, 1.0f, 0.0f, 0.0f)
        glMatrixMode(5888)
        if (aBoolean6308) {
            this.aHa_Sub2_3684.method3729(260, 104.toByte(), 7681)
            this.aHa_Sub2_3684.method3762(5890, 770, (-87).toByte(), 0)
            this.aHa_Sub2_3684.method3775(false, 0, 770, 34167)
        } else {
            this.aHa_Sub2_3684.method3729(7681, 126.toByte(), 8448)
            this.aHa_Sub2_3684.method3762(34168, 768, (-87).toByte(), 0)
            this.aHa_Sub2_3684.method3738(-15039, 2)
            this.aHa_Sub2_3684.method3729(260, 124.toByte(), 7681)
            this.aHa_Sub2_3684.method3762(34168, 768, (-87).toByte(), 0)
            this.aHa_Sub2_3684.method3762(34168, 770, (-87).toByte(), 1)
            this.aHa_Sub2_3684.method3775(false, 0, 770, 34167)
        }
        this.aHa_Sub2_3684.method3738(-15039, 0)
        aClass61_6310!!.method591(-1)
        aClass61_6310!!.method595(114.toByte(), 1)
        this.aHa_Sub2_3684.method3738(-15039, 1)
        glDisable(3168)
        glDisable(3169)
        glDisable(3170)
        glMatrixMode(5890)
        glLoadIdentity()
        glMatrixMode(5888)
        if (aBoolean6308) {
            this.aHa_Sub2_3684.method3729(8448, 115.toByte(), 8448)
            this.aHa_Sub2_3684.method3762(5890, 768, (-87).toByte(), 0)
            this.aHa_Sub2_3684.method3775(false, 0, 770, 5890)
        } else {
            this.aHa_Sub2_3684.method3729(8448, (-9).toByte(), 8448)
            this.aHa_Sub2_3684.method3762(5890, 768, (-87).toByte(), 0)
            this.aHa_Sub2_3684.method3738(-15039, 2)
            this.aHa_Sub2_3684.method3729(8448, 92.toByte(), 8448)
            this.aHa_Sub2_3684.method3762(5890, 768, (-87).toByte(), 0)
            this.aHa_Sub2_3684.method3762(34168, 768, (-87).toByte(), 1)
            this.aHa_Sub2_3684.method3775(false, 0, 770, 5890)
        }
        this.aHa_Sub2_3684.method3738(-15039, 0)
        aClass61_6310!!.method591(-1)
    }

    override fun method2136(i: Int, i_6_: Int, i_7_: Byte) {
        anInt6307++
        if (aBoolean6316) {
            this.aHa_Sub2_3684.method3738(-15039, 1)
            this.aHa_Sub2_3684.method3771((-91).toByte(), aClass258_Sub2Array6317!![i + -1])
            this.aHa_Sub2_3684.method3738(-15039, 0)
        }
        if (i_7_ > -42) method2134(true, true)
    }

    override fun method2137(i: Int): Boolean {
        anInt6315++
        return i <= -5
    }

    override fun method2134(bool: Boolean, bool_8_: Boolean) {
        if (bool_8_ == false) {
            anInt6306++
            if (aClass61_6310 == null || !bool) this.aHa_Sub2_3684.method3775(false, 0, 770, 34168)
            else {
                if (!aBoolean6308) {
                    this.aHa_Sub2_3684.method3738(-15039, 2)
                    this.aHa_Sub2_3684.method3771((-120).toByte(), (this.aHa_Sub2_3684.aClass258_Sub3_7827))
                    this.aHa_Sub2_3684.method3738(-15039, 0)
                }
                aClass61_6310!!.method594('\u0000', 28666)
                aBoolean6316 = true
            }
        }
    }

    override fun method2139(bool: Boolean, i: Byte) {
        this.aHa_Sub2_3684.method3729(8448, 121.toByte(), 7681)
        anInt6309++
        val i_9_ = 96 / ((i - -60) / 38)
    }

    init {
        if (var_ha_Sub2.aBoolean7863) {
            aBoolean6308 = var_ha_Sub2.anInt7795 < 3
            val i = if (aBoolean6308) 48 else 127
            val `is` = Array<ByteArray?>(6) { ByteArray(4096) }
            val is_10_ = Array<ByteArray?>(6) { ByteArray(4096) }
            val is_11_ = Array<ByteArray?>(6) { ByteArray(4096) }
            var i_12_ = 0
            for (i_13_ in 0..63) {
                for (i_14_ in 0..63) {
                    var f = i_13_.toFloat() * 2.0f / 64.0f - 1.0f
                    var f_15_ = -1.0f + 2.0f * i_14_.toFloat() / 64.0f
                    val f_16_ = (1.0 / sqrt((f * f + (1.0f + (f_15_ * f_15_))).toDouble())).toFloat()
                    f_15_ *= f_16_
                    f *= f_16_
                    for (i_17_ in 0..5) {
                        val f_18_: Float
                        if (i_17_ == 0) f_18_ = -f_15_
                        else if (i_17_ == 1) f_18_ = f_15_
                        else if (i_17_ != 2) {
                            if (i_17_ != 3) {
                                if (i_17_ != 4) f_18_ = -f_16_
                                else f_18_ = f_16_
                            } else f_18_ = -f
                        } else f_18_ = f
                        val i_19_: Int
                        val i_20_: Int
                        val i_21_: Int
                        if (f_18_ > 0.0f) {
                            i_19_ = (i.toDouble() * f_18_.toDouble().pow(96.0)).toInt()
                            i_20_ = (i.toDouble() * f_18_.toDouble().pow(36.0)).toInt()
                            i_21_ = (i.toDouble() * f_18_.toDouble().pow(12.0)).toInt()
                        } else {
                            i_21_ = 0
                            i_20_ = i_21_
                            i_19_ = i_20_
                        }
                        is_10_[i_17_]!![i_12_] = i_19_.toByte()
                        is_11_[i_17_]!![i_12_] = i_20_.toByte()
                        `is`[i_17_]!![i_12_] = i_21_.toByte()
                    }
                    i_12_++
                }
            }
            aClass258_Sub2Array6317 = arrayOfNulls<Class258_Sub2>(3)
            aClass258_Sub2Array6317!![0] = Class258_Sub2(this.aHa_Sub2_3684, 6406, 64, false, is_10_, 6406)
            aClass258_Sub2Array6317!![1] = Class258_Sub2(this.aHa_Sub2_3684, 6406, 64, false, is_11_, 6406)
            aClass258_Sub2Array6317!![2] = Class258_Sub2(this.aHa_Sub2_3684, 6406, 64, false, `is`, 6406)
            method2176(-88)
        }
    }

    companion object {
        @JvmField
        var anInt6306: Int = 0
        @JvmField
        var anInt6307: Int = 0
        @JvmField
        var anInt6309: Int = 0
        @JvmField
        var anInt6311: Int = 0
        @JvmField
        var anInt6312: Int = 0
        @JvmField
        var anInt6313: Int = 0
        @JvmField
        var anInt6314: Int = 0
        @JvmField
        var anInt6315: Int = 0
        @JvmField
        var anInt6318: Int = 0
        @JvmField
        var anInt6319: Int = 0

        @JvmStatic
        fun method2174(i: Byte, i_0_: Int, i_1_: Int): Boolean {
            anInt6313++
            val i_2_ = 52 % ((i - 68) / 41)
            return false
        }

        @JvmStatic
        fun method2175(i: Int, i_3_: Byte, i_4_: Int): Int {
            anInt6319++
            if (i_3_ >= -14) return 64
            if (i_4_ == 1 || i_4_ == 3) return Class348_Sub20.anIntArray6830!![i and 0x3]
            return Class84.anIntArray1450!![0x3 and i]
        }

        @JvmStatic
        fun method2177(i: Int, i_22_: Int, class348_sub49_sub2: Class348_Sub49_Sub2) {
            anInt6311++
            val bool = (class348_sub49_sub2.readBits((-24).toByte(), i) == 1)
            if (bool) Class18.anIntArray279!![Class101_Sub3.anInt5768++] = i_22_
            val i_23_ = class348_sub49_sub2.readBits((-24).toByte(), 2)
            val player = Class294.aPlayerArray5058!![i_22_]!!
            if (i_23_ == 0) {
                if (bool) player.aBoolean10539 = false
                else {
                    if (Class348_Sub42_Sub11.anInt9591 == i_22_) throw RuntimeException("s:lr")
                    val class359 = (Class359().also { Class348_Sub17.aClass359Array6802!![i_22_] = it })
                    class359.anInt4420 = ((Class90.regionTileY - -(player.anIntArray10317!![0]) shr 6) + ((player.anIntArray10320!![0] + za_Sub2.regionTileX) shr 6 shl 14) + ((player.plane).toInt() shl 28))
                    if (player.anInt10524 != -1) class359.anInt4423 = player.anInt10524
                    else class359.anInt4423 = player.aClass264_10217.method2019((-91).toByte())
                    class359.aBoolean4426 = player.aBoolean10554
                    class359.anInt4425 = (player.anInt10275)
                    if (player.anInt10553 > 0) Class295.method2221(player, -28482)
                    Class294.aPlayerArray5058!![i_22_] = null
                    if (class348_sub49_sub2.readBits((-24).toByte(), 1) != 0) Class211.method1538(i_22_, 105.toByte(), class348_sub49_sub2)
                }
            } else if (i_23_ == 1) {
                val i_24_ = class348_sub49_sub2.readBits((-24).toByte(), 3)
                var i_25_ = (player.anIntArray10320!![0])
                var i_26_ = (player.anIntArray10317!![0])
                if (i_24_ == 0) {
                    i_26_--
                    i_25_--
                } else if (i_24_ != 1) {
                    if (i_24_ == 2) {
                        i_25_++
                        i_26_--
                    } else if (i_24_ == 3) i_25_--
                    else if (i_24_ != 4) {
                        if (i_24_ == 5) {
                            i_26_++
                            i_25_--
                        } else if (i_24_ != 6) {
                            if (i_24_ == 7) {
                                i_26_++
                                i_25_++
                            }
                        } else i_26_++
                    } else i_25_++
                } else i_26_--
                if (bool) {
                    player.anInt10531 = i_26_
                    player.aBoolean10539 = true
                    player.anInt10549 = i_25_
                } else player.method2455(i_26_, -26443, (Class259.aByteArray3300!![i_22_]), i_25_)
            } else if (i_23_ == 2) {
                val i_27_ = class348_sub49_sub2.readBits((-24).toByte(), 4)
                var i_28_ = (player.anIntArray10320!![0])
                var i_29_ = (player.anIntArray10317!![0])
                if (i_27_ == 0) {
                    i_28_ -= 2
                    i_29_ -= 2
                } else if (i_27_ == 1) {
                    i_29_ -= 2
                    i_28_--
                } else if (i_27_ != 2) {
                    if (i_27_ == 3) {
                        i_29_ -= 2
                        i_28_++
                    } else if (i_27_ == 4) {
                        i_28_ += 2
                        i_29_ -= 2
                    } else if (i_27_ == 5) {
                        i_28_ -= 2
                        i_29_--
                    } else if (i_27_ == 6) {
                        i_29_--
                        i_28_ += 2
                    } else if (i_27_ == 7) i_28_ -= 2
                    else if (i_27_ == 8) i_28_ += 2
                    else if (i_27_ == 9) {
                        i_29_++
                        i_28_ -= 2
                    } else if (i_27_ == 10) {
                        i_29_++
                        i_28_ += 2
                    } else if (i_27_ == 11) {
                        i_29_ += 2
                        i_28_ -= 2
                    } else if (i_27_ == 12) {
                        i_29_ += 2
                        i_28_--
                    } else if (i_27_ != 13) {
                        if (i_27_ == 14) {
                            i_29_ += 2
                            i_28_++
                        } else if (i_27_ == 15) {
                            i_28_ += 2
                            i_29_ += 2
                        }
                    } else i_29_ += 2
                } else i_29_ -= 2
                if (bool) {
                    player.aBoolean10539 = true
                    player.anInt10549 = i_28_
                    player.anInt10531 = i_29_
                } else player.method2455(i_29_, -26443, (Class259.aByteArray3300!![i_22_]), i_28_)
            } else {
                val i_30_ = class348_sub49_sub2.readBits((-24).toByte(), 1)
                if (i_30_ == 0) {
                    val i_31_ = class348_sub49_sub2.readBits((-24).toByte(), 12)
                    val i_32_ = i_31_ shr 10
                    var i_33_ = 0x1f and (i_31_ shr 5)
                    if (i_33_ > 15) i_33_ -= 32
                    var i_34_ = 0x1f and i_31_
                    if (i_34_ > 15) i_34_ -= 32
                    val i_35_ = i_33_ + (player.anIntArray10320!![0])
                    val i_36_ = i_34_ + (player.anIntArray10317!![0])
                    if (bool) {
                        player.anInt10531 = i_36_
                        player.anInt10549 = i_35_
                        player.aBoolean10539 = true
                    } else player.method2455(i_36_, -26443, (Class259.aByteArray3300!![i_22_]), i_35_)
                    player.aByte6376 = (0x3 and (player.plane) + i_32_).toByte()
                    player.plane = player.aByte6376
                    if (Class79.method802(i_36_, i_35_, true)) player.aByte6376++
                    if (Class348_Sub42_Sub11.anInt9591 == i_22_) {
                        if ((player.plane).toInt() != Class355.anInt4372) Class348_Sub16_Sub2.aBoolean8870 = true
                        Class355.anInt4372 = (player.plane).toInt()
                    }
                } else {
                    val i_37_ = class348_sub49_sub2.readBits((-24).toByte(), 30)
                    val i_38_ = i_37_ shr 28
                    val i_39_ = 0x3fff and (i_37_ shr 14)
                    val i_40_ = 0x3fff and i_37_
                    val i_41_ = ((i_39_ + ((player.anIntArray10320!![0]) + za_Sub2.regionTileX) and 0x3fff) - za_Sub2.regionTileX)
                    val i_42_ = (-Class90.regionTileY + (0x3fff and (i_40_ + Class90.regionTileY + (player.anIntArray10317!![0]))))
                    if (bool) {
                        player.aBoolean10539 = true
                        player.anInt10531 = i_42_
                        player.anInt10549 = i_41_
                    } else player.method2455(i_42_, -26443, (Class259.aByteArray3300!![i_22_]), i_41_)
                    player.aByte6376 = ((player.plane) + i_38_ and 0x3).toByte()
                    player.plane = player.aByte6376
                    if (Class79.method802(i_42_, i_41_, true)) player.aByte6376++
                    if (Class348_Sub42_Sub11.anInt9591 == i_22_) Class355.anInt4372 = (player.plane).toInt()
                }
            }
        }
    }
}
