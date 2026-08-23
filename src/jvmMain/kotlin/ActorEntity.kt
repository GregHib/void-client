import PositionedSceneNode.Companion.anIntArray8797

abstract class ActorEntity internal constructor(i: Int, i_11_: Int, i_12_: Int, i_13_: Int, i_14_: Int, i_15_: Int) : SceneEntity() {
    var aShort8759: Short
    override fun method2384(class348_sub1s: Array<AbstractTileShape?>?, i: Int): Int {
        anInt8758++
        val i_0_ = this.x shr MapTileShape.anInt4459
        val i_1_ = this.y shr MapTileShape.anInt4459
        val i_2_ = -103 / ((i - -14) / 61)
        var i_3_ = 0
        if (anInt6111 == i_0_) i_3_++
        else if (anInt6111 < i_0_) i_3_ += 2
        if (i_1_ == anInt8502) i_3_ += 3
        else if (i_1_ < anInt8502) i_3_ += 6
        val i_4_ = anIntArray8797!![i_3_]
        if ((this.aShort8759.toInt() and i_4_) != 0) return this.method2390(class348_sub1s!!, i_0_, -2, i_1_)
        if (this.aShort8759.toInt() == 1 && i_0_ > 0) return this.method2390(class348_sub1s!!, -1 + i_0_, -2, i_1_)
        if (this.aShort8759.toInt() == 4 && i_0_ <= anInt6451) return this.method2390(class348_sub1s!!, 1 + i_0_, -2, i_1_)
        if (this.aShort8759.toInt() == 8 && i_1_ > 0) return this.method2390(class348_sub1s!!, i_0_, -2, -1 + i_1_)
        if (this.aShort8759.toInt() == 2 && i_1_ <= anInt7054) return this.method2390(class348_sub1s!!, i_0_, -2, i_1_ + 1)
        if (this.aShort8759.toInt() == 16 && i_0_ > 0 && i_1_ <= anInt7054) return this.method2390(class348_sub1s!!, -1 + i_0_, -2, i_1_ + 1)
        if (this.aShort8759.toInt() == 32 && anInt6451 >= i_0_ && anInt7054 >= i_1_) return this.method2390(class348_sub1s!!, i_0_ + 1, -2, i_1_ + 1)
        if (this.aShort8759.toInt() == 128 && i_0_ > 0 && i_1_ > 0) return this.method2390(class348_sub1s!!, i_0_ - 1, -2, i_1_ - 1)
        if (this.aShort8759.toInt() == 64 && i_0_ <= anInt6451 && i_1_ > 0) return this.method2390(class348_sub1s!!, 1 + i_0_, -2, -1 + i_1_)
        throw RuntimeException("")
    }

    override fun method2382(i: Byte): Boolean {
        if (i >= -51) return false
        anInt8760++
        return method125((this.y shr MapTileShape.anInt4459), (this.x shr MapTileShape.anInt4459), this.aByte6376.toInt(), this, 120.toByte())
    }

    init {
        this.x = i
        this.anInt6382 = i_11_
        this.aByte6376 = i_14_.toByte()
        this.y = i_12_
        this.plane = i_13_.toByte()
        this.aShort8759 = i_15_.toShort()
    }

    override fun method2378(i: Int): Boolean {
        anInt8757++
        if (i != 0) method2378(-104)
        return (aBooleanArrayArray1572!![(-anInt6111 + (this.x shr MapTileShape.anInt4459) + anInt10084)]!![(anInt10084 + -anInt8502 + (this.y shr MapTileShape.anInt4459))])
    }

    companion object {
        var aBooleanArrayArray1572: Array<BooleanArray?>? = null
        var anInt6111: Int = 0
        var anInt8502: Int = 0
        var anInt6451: Int = 0
        var anInt7054: Int = 0
        var anInt10084: Int = 0

        var anInt8757: Int = 0

        var anInt8758: Int = 0

        var anInt8760: Int = 0

        var anInt8765: Int = 0

        var aBoolean9307: Boolean = true
        var aBoolean351: Boolean = true
        var anInt2946: Int = 0
        var aTerrainTileArray5191: Array<TerrainTile?>? = null
        var anInt3465: Int = 0
        var anInt9037: Int = 0
        var anInt562: Int = 0
        
        var anInt72: Int = 0
        fun method125(i: Int, i_0_: Int, i_1_: Int, class318_sub1_sub4: ActorEntity?, i_2_: Byte): Boolean {
            anInt72++
            if (!aBoolean9307 || !aBoolean351) return false
            if (anInt2946 < 100) return false
            if (!method164(i_1_, i_0_, (-97).toByte(), i)) return false
            val i_3_ = i_0_ shl MapTileShape.anInt4459
            val i_4_ = i shl MapTileShape.anInt4459
            if (i_2_.toInt() != 120) return false
            val i_5_ = -1 + aTerrainTileArray5191!![i_1_]!!.method3982((-86).toByte(), i, i_0_)
            val i_6_ = i_5_ + class318_sub1_sub4!!.method2394(true)
            if (class318_sub1_sub4.aShort8759.toInt() == 1) {
                if (!method2169(i_3_, i_3_, i_4_, i_3_, anInt3465 + i_4_, i_6_, i_6_, i_5_, i_4_, false)) return false
                if (!method2169(i_3_, i_3_, i_4_, i_3_, anInt3465 + i_4_, i_5_, i_6_, i_5_, i_4_ + anInt3465, false)) return false
                anInt562++
                return true
            }
            if (class318_sub1_sub4.aShort8759.toInt() == 2) {
                if (!method2169(i_3_, i_3_ - -anInt3465, i_4_ - -anInt3465, i_3_, anInt3465 + i_4_, i_6_, i_6_, i_5_, i_4_ - -anInt3465, false)) return false
                if (!method2169(i_3_, anInt3465 + i_3_, i_4_ + anInt3465, anInt3465 + i_3_, anInt3465 + i_4_, i_6_, i_5_, i_5_, i_4_ - -anInt3465, false)) return false
                anInt562++
                return true
            }
            if (class318_sub1_sub4.aShort8759.toInt() == 4) {
                if (!method2169(i_3_ + anInt3465, anInt3465 + i_3_, i_4_, anInt3465 + i_3_, i_4_ - -anInt3465, i_6_, i_6_, i_5_, i_4_, false)) return false
                if (!method2169(i_3_ + anInt3465, i_3_ - -anInt3465, i_4_, anInt3465 + i_3_, i_4_ - -anInt3465, i_5_, i_6_, i_5_, anInt3465 + i_4_, false)) return false
                anInt562++
                return true
            }
            if (class318_sub1_sub4.aShort8759.toInt() == 8) {
                if (!method2169(i_3_, anInt3465 + i_3_, i_4_, i_3_, i_4_, i_6_, i_6_, i_5_, i_4_, false)) return false
                if (!method2169(i_3_, i_3_ + anInt3465, i_4_, anInt3465 + i_3_, i_4_, i_6_, i_5_, i_5_, i_4_, false)) return false
                anInt562++
                return true
            }
            if (class318_sub1_sub4.aShort8759.toInt() == 16) {
                if (!method1084(i_6_, anInt9037, anInt9037 + i_4_, i_3_, i_5_, anInt9037, 18507)) return false
                anInt562++
                return true
            }
            if (class318_sub1_sub4.aShort8759.toInt() == 32) {
                if (!method1084(i_6_, anInt9037, anInt9037 + i_4_, i_3_ + anInt9037, i_5_, anInt9037, 18507)) return false
                anInt562++
                return true
            }
            if (class318_sub1_sub4.aShort8759.toInt() == 64) {
                if (!method1084(i_6_, anInt9037, i_4_, anInt9037 + i_3_, i_5_, anInt9037, 18507)) return false
                anInt562++
                return true
            }
            if (class318_sub1_sub4.aShort8759.toInt() == 128) {
                if (!method1084(i_6_, anInt9037, i_4_, i_3_, i_5_, anInt9037, 18507)) return false
                anInt562++
                return true
            }
            return true
        }

        var anInt9360: Int = 0
        var anInt1799: Int = 0
        var anInt1974: Int = 0
        @JvmStatic
        fun method1084(i: Int, i_7_: Int, i_8_: Int, i_9_: Int, i_10_: Int, i_11_: Int, i_12_: Int): Boolean {
            anInt1799++
            val i_13_ = i_9_ - -i_7_
            val i_14_ = i + i_10_
            val i_15_ = i_8_ + i_11_
            if (!method2169(i_9_, i_13_, i_8_, i_9_, i_15_, i_14_, i_14_, i_14_, i_15_, false)) return false
            if (!method2169(i_9_, i_13_, i_8_, i_13_, i_15_, i_14_, i_14_, i_14_, i_8_, false)) return false
            if (anInt1974 > i_9_) {
                if (!method2169(i_9_, i_9_, i_15_, i_9_, i_15_, i_14_, i_14_, i_10_, i_8_, false)) return false
                if (!method2169(i_9_, i_9_, i_15_, i_9_, i_8_, i_14_, i_10_, i_10_, i_8_, false)) return false
            } else {
                if (!method2169(i_13_, i_13_, i_15_, i_13_, i_15_, i_14_, i_14_, i_10_, i_8_, false)) return false
                if (!method2169(i_13_, i_13_, i_15_, i_13_, i_8_, i_14_, i_10_, i_10_, i_8_, false)) return false
            }
            if (i_8_ >= anInt9360) {
                if (!method2169(i_9_, i_13_, i_15_, i_9_, i_15_, i_14_, i_14_, i_10_, i_15_, false)) return false
                return method2169(i_9_, i_13_, i_15_, i_13_, i_15_, i_14_, i_10_, i_10_, i_15_, false)
            } else {
                if (!method2169(i_9_, i_13_, i_8_, i_9_, i_8_, i_14_, i_14_, i_10_, i_8_, false)) return false
                return method2169(i_9_, i_13_, i_8_, i_13_, i_8_, i_14_, i_10_, i_10_, i_8_, false)
            }
        }
        var anIntArray10172: IntArray? = IntArray(3)

        var anInt6281: Int = 0
        @JvmStatic
        fun method2169(i: Int, i_10_: Int, i_11_: Int, i_12_: Int, i_13_: Int, i_14_: Int, i_15_: Int, i_16_: Int, i_17_: Int, bool: Boolean): Boolean {
            var i = i
            var i_10_ = i_10_
            var i_11_ = i_11_
            var i_12_ = i_12_
            var i_13_ = i_13_
            var i_14_ = i_14_
            var i_15_ = i_15_
            var i_16_ = i_16_
            var i_17_ = i_17_
            anInt6281++
            if (!method1422(i_16_, i_11_, i, -7596)) return false
            i_16_ = anIntArray10172!![1]
            i = anIntArray10172!![0]
            i_11_ = anIntArray10172!![2]
            if (!method1422(i_15_, i_17_, i_10_, -7596)) return false
            i_10_ = anIntArray10172!![0]
            i_17_ = anIntArray10172!![2]
            i_15_ = anIntArray10172!![1]
            if (!method1422(i_14_, i_13_, i_12_, -7596)) return false
            i_13_ = anIntArray10172!![2]
            if (bool != false) return false
            i_14_ = anIntArray10172!![1]
            i_12_ = anIntArray10172!![0]
            return method3125(i_12_, i_16_, i_10_, i_13_, i_17_, (-76).toByte(), i_15_, i_11_, i, i_14_)
        }

        var anInt9372: Int = 1
        var anInt4319: Int = 0
        var anInt9377: Int = 0
        var anInt3872: Int = -1
        var anIntArray5091: IntArray? = null
        fun method3125(i: Int, i_16_: Int, i_17_: Int, i_18_: Int, i_19_: Int, i_20_: Byte, i_21_: Int, i_22_: Int, i_23_: Int, i_24_: Int): Boolean {
            var i = i
            var i_16_ = i_16_
            var i_17_ = i_17_
            var i_18_ = i_18_
            var i_19_ = i_19_
            var i_21_ = i_21_
            var i_22_ = i_22_
            var i_23_ = i_23_
            var i_24_ = i_24_
            anInt9377++
            if (i_16_ > 2000 || i_21_ > 2000 || i_24_ > 2000 || i_23_ > 2000 || i_17_ > 2000 || i > 2000) return false
            if (i_16_ < -2000 || i_21_ < -2000 || i_24_ < -2000 || i_23_ < -2000 || i_17_ < -2000 || i < -2000) return false
            if (anInt4319 == 2) {
                var i_25_ = i_23_ + i_16_ * anInt3872
                if (i_25_ >= 0 && anIntArray5091!!.size > i_25_ && anIntArray5091!![i_25_] > -38400 + (i_22_ shl 8)) return false
                i_25_ = i_17_ + i_21_ * anInt3872
                if (i_25_ >= 0 && anIntArray5091!!.size > i_25_ && ((i_19_ shl 8) + -38400 < anIntArray5091!![i_25_])) return false
                i_25_ = i + i_24_ * anInt3872
                if (i_25_ >= 0 && anIntArray5091!!.size > i_25_ && (anIntArray5091!![i_25_] > (i_18_ shl 8) - 38400)) return false
            }
            val i_26_ = -i_23_ + i_17_
            val i_27_ = i_21_ - i_16_
            val i_28_ = -i_23_ + i
            val i_29_ = -i_16_ + i_24_
            val i_30_ = -i_22_ + i_19_
            if (i_16_ < i_21_ && i_24_ > i_24_) {
                i_16_--
                if (i_24_ < i_21_) i_21_++
                else i_24_++
            } else if (i_21_ >= i_24_) {
                i_24_--
                if (i_21_ < i_16_) i_16_++
                else i_21_++
            } else {
                i_21_--
                if (i_16_ > i_24_) i_16_++
                else i_24_++
            }
            val i_31_ = -i_22_ + i_18_
            var i_32_ = 0
            if (i_21_ != i_16_) i_32_ = (i_17_ - i_23_ shl 12) / (i_21_ - i_16_)
            var i_33_ = 0
            if (i_21_ != i_24_) i_33_ = (-i_17_ + i shl 12) / (i_24_ + -i_21_)
            if (i_20_ >= -7) anInt9372 = 8
            var i_34_ = 0
            if (i_24_ != i_16_) i_34_ = (i_23_ + -i shl 12) / (i_16_ - i_24_)
            val i_35_ = -(i_27_ * i_28_) + i_29_ * i_26_
            if (i_35_ == 0) return false
            val i_36_ = (-(i_31_ * i_27_) + i_30_ * i_29_ shl 8) / i_35_
            val i_37_ = (i_26_ * i_31_ + -(i_30_ * i_28_) shl 8) / i_35_
            if (i_16_ > i_21_ || i_24_ < i_16_) {
                if (i_24_ < i_21_) {
                    if (DrawListState.anInt1480 <= i_24_) return true
                    i_18_ = -(i_36_ * i) + ((i_18_ shl 8) - -i_36_)
                    if (DrawListState.anInt1480 < i_16_) i_16_ = DrawListState.anInt1480
                    if (DrawListState.anInt1480 < i_21_) i_21_ = DrawListState.anInt1480
                    if (i_21_ > i_16_) {
                        i = i shl -1549996884
                        i_17_ = i
                        i_23_ = i_23_ shl 869809292
                        if (i_24_ < 0) {
                            i_18_ -= i_24_ * i_37_
                            i -= i_34_ * i_24_
                            i_17_ -= i_24_ * i_33_
                            i_24_ = 0
                        }
                        if (i_16_ < 0) {
                            i_23_ -= i_16_ * i_32_
                            i_16_ = 0
                        }
                        if (i_34_ > i_33_) {
                            i_21_ -= i_16_
                            i_16_ -= i_24_
                            i_24_ *= anInt3872
                            while (--i_16_ >= 0) {
                                if (!method771(i_36_, (-25).toByte(), i_18_, 0, 1 + (i shr 12), (i_17_ shr 12) - 1, anIntArray5091, i_24_)) return false
                                i_24_ += anInt3872
                                i += i_34_
                                i_17_ += i_33_
                                i_18_ += i_37_
                            }
                            while (--i_21_ >= 0) {
                                if (!method771(i_36_, (-25).toByte(), i_18_, 0, 1 + (i_23_ shr 12), -1 + (i_17_ shr 12), anIntArray5091, i_24_)) return false
                                i_24_ += anInt3872
                                i_23_ += i_32_
                                i_18_ += i_37_
                                i_17_ += i_33_
                            }
                            return true
                        }
                        i_21_ -= i_16_
                        i_16_ -= i_24_
                        i_24_ *= anInt3872
                        while (--i_16_ >= 0) {
                            if (!method771(i_36_, (-25).toByte(), i_18_, 0, (i_17_ shr 12) + 1, -1 + (i shr 12), anIntArray5091, i_24_)) return false
                            i_18_ += i_37_
                            i_17_ += i_33_
                            i_24_ += anInt3872
                            i += i_34_
                        }
                        while (--i_21_ >= 0) {
                            if (!method771(i_36_, (-25).toByte(), i_18_, 0, (i_17_ shr 12) - -1, (i_23_ shr 12) - 1, anIntArray5091, i_24_)) return false
                            i_18_ += i_37_
                            i_17_ += i_33_
                            i_24_ += anInt3872
                            i_23_ += i_32_
                        }
                        return true
                    }
                    i = i shl -384535508
                    i_23_ = i
                    if (i_24_ < 0) {
                        i_23_ -= i_33_ * i_24_
                        i -= i_34_ * i_24_
                        i_18_ -= i_24_ * i_37_
                        i_24_ = 0
                    }
                    i_17_ = i_17_ shl 1142396620
                    if (i_21_ < 0) {
                        i_17_ -= i_21_ * i_32_
                        i_21_ = 0
                    }
                    if (i_33_ >= i_34_) {
                        i_16_ -= i_21_
                        i_21_ -= i_24_
                        i_24_ *= anInt3872
                        while (--i_21_ >= 0) {
                            if (!method771(i_36_, (-25).toByte(), i_18_, 0, (i_23_ shr 12) - -1, (i shr 12) - 1, anIntArray5091, i_24_)) return false
                            i_18_ += i_37_
                            i_24_ += anInt3872
                            i_23_ += i_33_
                            i += i_34_
                        }
                        while (--i_16_ >= 0) {
                            if (!method771(i_36_, (-25).toByte(), i_18_, 0, (i_17_ shr 12) - -1, (i shr 12) + -1, anIntArray5091, i_24_)) return false
                            i += i_34_
                            i_17_ += i_32_
                            i_18_ += i_37_
                            i_24_ += anInt3872
                        }
                        return true
                    }
                    i_16_ -= i_21_
                    i_21_ -= i_24_
                    i_24_ = anInt3872 * i_24_
                    while (--i_21_ >= 0) {
                        if (!method771(i_36_, (-25).toByte(), i_18_, 0, 1 + (i shr 12), -1 + (i_23_ shr 12), anIntArray5091, i_24_)) return false
                        i += i_34_
                        i_24_ += anInt3872
                        i_23_ += i_33_
                        i_18_ += i_37_
                    }
                    while (--i_16_ >= 0) {
                        if (!method771(i_36_, (-25).toByte(), i_18_, 0, (i shr 12) - -1, -1 + (i_17_ shr 12), anIntArray5091, i_24_)) return false
                        i_18_ += i_37_
                        i_17_ += i_32_
                        i_24_ += anInt3872
                        i += i_34_
                    }
                    return true
                }
                if (DrawListState.anInt1480 <= i_21_) return true
                i_19_ = i_36_ + -(i_17_ * i_36_) + (i_19_ shl 8)
                if (DrawListState.anInt1480 < i_24_) i_24_ = DrawListState.anInt1480
                if (DrawListState.anInt1480 < i_16_) i_16_ = DrawListState.anInt1480
                if (i_24_ >= i_16_) {
                    i_17_ = i_17_ shl 1841711244
                    i = i_17_
                    i_23_ = i_23_ shl -258927156
                    if (i_21_ < 0) {
                        i -= i_32_ * i_21_
                        i_19_ -= i_21_ * i_37_
                        i_17_ -= i_33_ * i_21_
                        i_21_ = 0
                    }
                    if (i_16_ < 0) {
                        i_23_ -= i_34_ * i_16_
                        i_16_ = 0
                    }
                    if (i_32_ >= i_33_) {
                        i_24_ -= i_16_
                        i_16_ -= i_21_
                        i_21_ = anInt3872 * i_21_
                        while (--i_16_ >= 0) {
                            if (!method771(i_36_, (-25).toByte(), i_19_, 0, (i shr 12) - -1, (i_17_ shr 12) - 1, anIntArray5091, i_21_)) return false
                            i_17_ += i_33_
                            i_19_ += i_37_
                            i_21_ += anInt3872
                            i += i_32_
                        }
                        while (--i_24_ >= 0) {
                            if (!method771(i_36_, (-25).toByte(), i_19_, 0, (i_23_ shr 12) - -1, -1 + (i_17_ shr 12), anIntArray5091, i_21_)) return false
                            i_19_ += i_37_
                            i_21_ += anInt3872
                            i_17_ += i_33_
                            i_23_ += i_34_
                        }
                        return true
                    }
                    i_24_ -= i_16_
                    i_16_ -= i_21_
                    i_21_ = anInt3872 * i_21_
                    while (--i_16_ >= 0) {
                        if (!method771(i_36_, (-25).toByte(), i_19_, 0, 1 + (i_17_ shr 12), (i shr 12) - 1, anIntArray5091, i_21_)) return false
                        i_21_ += anInt3872
                        i_17_ += i_33_
                        i_19_ += i_37_
                        i += i_32_
                    }
                    while (--i_24_ >= 0) {
                        if (!method771(i_36_, (-25).toByte(), i_19_, 0, 1 + (i_17_ shr 12), (i_23_ shr 12) - 1, anIntArray5091, i_21_)) return false
                        i_17_ += i_33_
                        i_23_ += i_34_
                        i_19_ += i_37_
                        i_21_ += anInt3872
                    }
                    return true
                }
                i_17_ = i_17_ shl -575323604
                i_23_ = i_17_
                i = i shl 1434108396
                if (i_21_ < 0) {
                    i_23_ -= i_32_ * i_21_
                    i_17_ -= i_21_ * i_33_
                    i_19_ -= i_37_ * i_21_
                    i_21_ = 0
                }
                if (i_24_ < 0) {
                    i -= i_34_ * i_24_
                    i_24_ = 0
                }
                if (i_24_ != i_21_ && i_33_ > i_32_ || (i_24_ == i_21_ && i_32_ > i_34_)) {
                    i_16_ -= i_24_
                    i_24_ -= i_21_
                    i_21_ = anInt3872 * i_21_
                    while (--i_24_ >= 0) {
                        if (!method771(i_36_, (-25).toByte(), i_19_, 0, (i_17_ shr 12) - -1, -1 + (i_23_ shr 12), anIntArray5091, i_21_)) return false
                        i_23_ += i_32_
                        i_19_ += i_37_
                        i_21_ += anInt3872
                        i_17_ += i_33_
                    }
                    while (--i_16_ >= 0) {
                        if (!method771(i_36_, (-25).toByte(), i_19_, 0, (i shr 12) - -1, -1 + (i_23_ shr 12), anIntArray5091, i_21_)) return false
                        i_23_ += i_32_
                        i += i_34_
                        i_19_ += i_37_
                        i_21_ += anInt3872
                    }
                    return true
                }
                i_16_ -= i_24_
                i_24_ -= i_21_
                i_21_ = anInt3872 * i_21_
                while (--i_24_ >= 0) {
                    if (!method771(i_36_, (-25).toByte(), i_19_, 0, (i_23_ shr 12) - -1, (i_17_ shr 12) - 1, anIntArray5091, i_21_)) return false
                    i_17_ += i_33_
                    i_23_ += i_32_
                    i_21_ += anInt3872
                    i_19_ += i_37_
                }
                while (--i_16_ >= 0) {
                    if (!method771(i_36_, (-25).toByte(), i_19_, 0, (i_23_ shr 12) - -1, -1 + (i shr 12), anIntArray5091, i_21_)) return false
                    i_19_ += i_37_
                    i_21_ += anInt3872
                    i_23_ += i_32_
                    i += i_34_
                }
                return true
            }
            if (i_16_ >= DrawListState.anInt1480) return true
            i_22_ = (i_22_ shl 8) - (i_23_ * i_36_ + -i_36_)
            if (DrawListState.anInt1480 < i_24_) i_24_ = DrawListState.anInt1480
            if (DrawListState.anInt1480 < i_21_) i_21_ = DrawListState.anInt1480
            if (i_24_ > i_21_) {
                i_23_ = i_23_ shl 1361045260
                i = i_23_
                if (i_16_ < 0) {
                    i_23_ -= i_32_ * i_16_
                    i_22_ -= i_16_ * i_37_
                    i -= i_16_ * i_34_
                    i_16_ = 0
                }
                i_17_ = i_17_ shl 1453497388
                if (i_21_ < 0) {
                    i_17_ -= i_21_ * i_33_
                    i_21_ = 0
                }
                if (i_21_ != i_16_ && i_32_ > i_34_ || (i_16_ == i_21_ && i_34_ > i_33_)) {
                    i_24_ -= i_21_
                    i_21_ -= i_16_
                    i_16_ *= anInt3872
                    while (--i_21_ >= 0) {
                        if (!method771(i_36_, (-25).toByte(), i_22_, 0, 1 + (i_23_ shr 12), -1 + (i shr 12), anIntArray5091, i_16_)) return false
                        i_22_ += i_37_
                        i_16_ += anInt3872
                        i_23_ += i_32_
                        i += i_34_
                    }
                    while (--i_24_ >= 0) {
                        if (!method771(i_36_, (-25).toByte(), i_22_, 0, 1 + (i_17_ shr 12), (i shr 12) + -1, anIntArray5091, i_16_)) return false
                        i_17_ += i_33_
                        i += i_34_
                        i_22_ += i_37_
                        i_16_ += anInt3872
                    }
                    return true
                }
                i_24_ -= i_21_
                i_21_ -= i_16_
                i_16_ *= anInt3872
                while (--i_21_ >= 0) {
                    if (!method771(i_36_, (-25).toByte(), i_22_, 0, 1 + (i shr 12), (i_23_ shr 12) + -1, anIntArray5091, i_16_)) return false
                    i_16_ += anInt3872
                    i_22_ += i_37_
                    i += i_34_
                    i_23_ += i_32_
                }
                while (--i_24_ >= 0) {
                    if (!method771(i_36_, (-25).toByte(), i_22_, 0, (i shr 12) - -1, -1 + (i_17_ shr 12), anIntArray5091, i_16_)) return false
                    i_17_ += i_33_
                    i_16_ += anInt3872
                    i_22_ += i_37_
                    i += i_34_
                }
                return true
            }
            i_23_ = i_23_ shl 1488621804
            i_17_ = i_23_
            if (i_16_ < 0) {
                i_17_ -= i_34_ * i_16_
                i_22_ -= i_16_ * i_37_
                i_23_ -= i_32_ * i_16_
                i_16_ = 0
            }
            i = i shl -1533082100
            if (i_24_ < 0) {
                i -= i_24_ * i_33_
                i_24_ = 0
            }
            if ((i_16_ == i_24_ || i_32_ <= i_34_) && (i_24_ != i_16_ || i_32_ >= i_33_)) {
                i_21_ -= i_24_
                i_24_ -= i_16_
                i_16_ = anInt3872 * i_16_
                while (--i_24_ >= 0) {
                    if (!method771(i_36_, (-25).toByte(), i_22_, 0, 1 + (i_17_ shr 12), -1 + (i_23_ shr 12), anIntArray5091, i_16_)) return false
                    i_17_ += i_34_
                    i_23_ += i_32_
                    i_22_ += i_37_
                    i_16_ += anInt3872
                }
                while (--i_21_ >= 0) {
                    if (!method771(i_36_, (-25).toByte(), i_22_, 0, (i shr 12) - -1, -1 + (i_23_ shr 12), anIntArray5091, i_16_)) return false
                    i_23_ += i_32_
                    i_22_ += i_37_
                    i += i_33_
                    i_16_ += anInt3872
                }
                return true
            }
            i_21_ -= i_24_
            i_24_ -= i_16_
            i_16_ *= anInt3872
            while (--i_24_ >= 0) {
                if (!method771(i_36_, (-25).toByte(), i_22_, 0, 1 + (i_23_ shr 12), -1 + (i_17_ shr 12), anIntArray5091, i_16_)) return false
                i_16_ += anInt3872
                i_23_ += i_32_
                i_22_ += i_37_
                i_17_ += i_34_
            }
            while (--i_21_ >= 0) {
                if (!method771(i_36_, (-25).toByte(), i_22_, 0, (i_23_ shr 12) - -1, (i shr 12) - 1, anIntArray5091, i_16_)) return false
                i_16_ += anInt3872
                i += i_33_
                i_22_ += i_37_
                i_23_ += i_32_
            }
            return true
        }
        var aAbstractCameraTransform_9114: AbstractCameraTransform? = null
        
        var anInt2550: Int = 0
        var anInt1962: Int = 0
        var anInt9759: Int = 0
        var anInt1202: Int = 0
        var anInt8498: Int = 0
        fun method1422(i: Int, i_0_: Int, i_1_: Int, i_2_: Int): Boolean {
            anInt2550++
            ActorEntity.aAbstractCameraTransform_9114!!.method897(i_1_, i, i_0_, anIntArray10172!!)
            val i_3_ = anIntArray10172!![2]
            if (i_3_ < 50) return false
            anIntArray10172!![2] = i_3_
            anIntArray10172!![0] = (ActorEntity.anInt1962 * anIntArray10172!![0] / i_3_) + ActorEntity.anInt1202
            anIntArray10172!![1] = (ActorEntity.anInt9759 + (anIntArray10172!![1] * ActorEntity.anInt8498 / i_3_))
            return true
        }

        var aResourceLoaderThread_897: ResourceLoaderThread? = null
        var anInt5198: Int = 0
        fun method163(i: Int): Int {
            anInt5198++
            return aResourceLoaderThread_897!!.method2325((-98).toByte())
        }
        var anInt3049: Int = 0
        var anIntArrayArrayArray4356: Array<Array<IntArray?>?>? = null
        var anInt5195: Int = 0
        var aTerrainTileArray4142: Array<TerrainTile?>? = null
        var anInt9039: Int = 0
        fun method164(i: Int, i_0_: Int, i_1_: Byte, i_2_: Int): Boolean {
            anInt5195++
            if (!aBoolean9307 || !aBoolean351) return false
            if (anInt2946 < 100) return false
            val i_3_ = anIntArrayArrayArray4356!![i]!![i_0_]!![i_2_]
            if (i_3_ == -anInt3049) return false
            if (anInt3049 == i_3_) return true
            if (aTerrainTileArray4142 === aTerrainTileArray5191) return false
            val i_4_ = i_0_ shl MapTileShape.anInt4459
            val i_5_ = i_2_ shl MapTileShape.anInt4459
            if ((method2169(i_4_ - -1, i_4_ - (-anInt3465 - -1), 1 + i_5_, 1 + i_4_, -1 + (i_5_ - -anInt3465), aTerrainTileArray5191!![i]!!.method3982((-86).toByte(), 1 + i_2_, i_0_), aTerrainTileArray5191!![i]!!.method3982((-86).toByte(), 1 + i_2_, 1 + i_0_), aTerrainTileArray5191!![i]!!.method3982((-86).toByte(), i_2_, i_0_), -1 + anInt3465 + i_5_, false)) && (method2169(
                    1 + i_4_,
                    anInt3465 + (i_4_ + -1),
                    i_5_ + 1,
                    anInt3465 + (i_4_ - 1),
                    i_5_ + anInt3465 - 1,
                    aTerrainTileArray5191!![i]!!.method3982((-86).toByte(), i_2_ - -1, 1 + i_0_),
                    aTerrainTileArray5191!![i]!!.method3982((-86).toByte(), i_2_, i_0_ + 1),
                    aTerrainTileArray5191!![i]!!.method3982((-86).toByte(), i_2_, i_0_),
                    1 + i_5_,
                    false
                ))
            ) {
                anInt9039++
                anIntArrayArrayArray4356!![i]!![i_0_]!![i_2_] = anInt3049
                return true
            }
            anIntArrayArrayArray4356!![i]!![i_0_]!![i_2_] = -anInt3049
            return false
        }

        var anInt1281: Int = 0
        fun method771(i: Int, i_0_: Byte, i_1_: Int, i_2_: Int, i_3_: Int, i_4_: Int, `is`: IntArray?, i_5_: Int): Boolean {
            var i_1_ = i_1_
            var i_2_ = i_2_
            var i_3_ = i_3_
            var i_4_ = i_4_
            var i_5_ = i_5_
            anInt1281++
            if (i_3_ > anInt3872) i_3_ = anInt3872
            if (i_4_ < 0) i_4_ = 0
            if (i_4_ >= i_3_) return true
            i_5_ += -1 + i_4_
            i_1_ += i * i_4_
            i_2_ = -i_4_ + i_3_ shr 2
            if (anInt4319 == 1) {
                anInt2946 += i_2_
                while (--i_2_ >= 0) {
                    if (`is`!![++i_5_] > i_1_) `is`[i_5_] = i_1_
                    i_1_ += i
                    if (`is`[++i_5_] > i_1_) `is`[i_5_] = i_1_
                    i_1_ += i
                    if (i_1_ < `is`[++i_5_]) `is`[i_5_] = i_1_
                    i_1_ += i
                    if (`is`[++i_5_] > i_1_) `is`[i_5_] = i_1_
                    i_1_ += i
                }
                i_2_ = 0x3 and i_3_ - i_4_
                while (--i_2_ >= 0) {
                    if (`is`!![++i_5_] > i_1_) `is`[i_5_] = i_1_
                    i_1_ += i
                }
            } else {
                i_1_ -= 38400
                while (--i_2_ >= 0) {
                    if (`is`!![++i_5_] > i_1_) return false
                    i_1_ += i
                    if (`is`[++i_5_] > i_1_) return false
                    i_1_ += i
                    if (i_1_ < `is`[++i_5_]) return false
                    i_1_ += i
                    if (`is`[++i_5_] > i_1_) return false
                    i_1_ += i
                }
                i_2_ = 0x3 and i_3_ - i_4_
                while (--i_2_ >= 0) {
                    if (i_1_ < `is`!![++i_5_]) return false
                    i_1_ += i
                }
            }
            return true
        }
    }
}
