import KaraokeSubtitleStreamStatics.method2985

object TextureMapImageNodeStatics {
    @JvmField
            var anInt9371: Int = 0
            @JvmField
            var anInt9372: Int = 1
            @JvmField
            var anInt9373: Int = 0
            @JvmField
            var anInt9376: Int = 0
            @JvmField
            var anInt9377: Int = 0
            @JvmField
            var anInt9378: Int = 0
            @JvmField
            var anInt9381: Int = 0
            @JvmField
            var anInt9382: Int = 0
    
            @JvmStatic
            fun method3124(i: Int, i_13_: Byte, i_14_: Int): Boolean {
                anInt9371++
                if (i_13_ > -55) method3124(-76, (-110).toByte(), -59)
                return ((i_14_ and 0x40000) != 0) or method2985(-31735, i, i_14_) || HardCacheEntryReferenceStatics.method3200(i_14_, i, (-120).toByte())
            }
    
            @JvmStatic
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
                if (ModelTransformParamsStatics.anInt4319 == 2) {
                    var i_25_ = i_23_ + i_16_ * WorldMapToggle.anInt3872
                    if (i_25_ >= 0 && GlTextureBaseStatics.anIntArray5091!!.size > i_25_ && GlTextureBaseStatics.anIntArray5091!![i_25_] > -38400 + (i_22_ shl 8)) return false
                    i_25_ = i_17_ + i_21_ * WorldMapToggle.anInt3872
                    if (i_25_ >= 0 && GlTextureBaseStatics.anIntArray5091!!.size > i_25_ && ((i_19_ shl 8) + -38400 < GlTextureBaseStatics.anIntArray5091!![i_25_])) return false
                    i_25_ = i + i_24_ * WorldMapToggle.anInt3872
                    if (i_25_ >= 0 && GlTextureBaseStatics.anIntArray5091!!.size > i_25_ && (GlTextureBaseStatics.anIntArray5091!![i_25_] > (i_18_ shl 8) - 38400)) return false
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
                                i_24_ *= WorldMapToggle.anInt3872
                                while (--i_16_ >= 0) {
                                    if (!SceneObjectSpawnerStatics.method771(i_36_, (-25).toByte(), i_18_, 0, 1 + (i shr 12), (i_17_ shr 12) - 1, GlTextureBaseStatics.anIntArray5091, i_24_)) return false
                                    i_24_ += WorldMapToggle.anInt3872
                                    i += i_34_
                                    i_17_ += i_33_
                                    i_18_ += i_37_
                                }
                                while (--i_21_ >= 0) {
                                    if (!SceneObjectSpawnerStatics.method771(i_36_, (-25).toByte(), i_18_, 0, 1 + (i_23_ shr 12), -1 + (i_17_ shr 12), GlTextureBaseStatics.anIntArray5091, i_24_)) return false
                                    i_24_ += WorldMapToggle.anInt3872
                                    i_23_ += i_32_
                                    i_18_ += i_37_
                                    i_17_ += i_33_
                                }
                                return true
                            }
                            i_21_ -= i_16_
                            i_16_ -= i_24_
                            i_24_ *= WorldMapToggle.anInt3872
                            while (--i_16_ >= 0) {
                                if (!SceneObjectSpawnerStatics.method771(i_36_, (-25).toByte(), i_18_, 0, (i_17_ shr 12) + 1, -1 + (i shr 12), GlTextureBaseStatics.anIntArray5091, i_24_)) return false
                                i_18_ += i_37_
                                i_17_ += i_33_
                                i_24_ += WorldMapToggle.anInt3872
                                i += i_34_
                            }
                            while (--i_21_ >= 0) {
                                if (!SceneObjectSpawnerStatics.method771(i_36_, (-25).toByte(), i_18_, 0, (i_17_ shr 12) - -1, (i_23_ shr 12) - 1, GlTextureBaseStatics.anIntArray5091, i_24_)) return false
                                i_18_ += i_37_
                                i_17_ += i_33_
                                i_24_ += WorldMapToggle.anInt3872
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
                            i_24_ *= WorldMapToggle.anInt3872
                            while (--i_21_ >= 0) {
                                if (!SceneObjectSpawnerStatics.method771(i_36_, (-25).toByte(), i_18_, 0, (i_23_ shr 12) - -1, (i shr 12) - 1, GlTextureBaseStatics.anIntArray5091, i_24_)) return false
                                i_18_ += i_37_
                                i_24_ += WorldMapToggle.anInt3872
                                i_23_ += i_33_
                                i += i_34_
                            }
                            while (--i_16_ >= 0) {
                                if (!SceneObjectSpawnerStatics.method771(i_36_, (-25).toByte(), i_18_, 0, (i_17_ shr 12) - -1, (i shr 12) + -1, GlTextureBaseStatics.anIntArray5091, i_24_)) return false
                                i += i_34_
                                i_17_ += i_32_
                                i_18_ += i_37_
                                i_24_ += WorldMapToggle.anInt3872
                            }
                            return true
                        }
                        i_16_ -= i_21_
                        i_21_ -= i_24_
                        i_24_ = WorldMapToggle.anInt3872 * i_24_
                        while (--i_21_ >= 0) {
                            if (!SceneObjectSpawnerStatics.method771(i_36_, (-25).toByte(), i_18_, 0, 1 + (i shr 12), -1 + (i_23_ shr 12), GlTextureBaseStatics.anIntArray5091, i_24_)) return false
                            i += i_34_
                            i_24_ += WorldMapToggle.anInt3872
                            i_23_ += i_33_
                            i_18_ += i_37_
                        }
                        while (--i_16_ >= 0) {
                            if (!SceneObjectSpawnerStatics.method771(i_36_, (-25).toByte(), i_18_, 0, (i shr 12) - -1, -1 + (i_17_ shr 12), GlTextureBaseStatics.anIntArray5091, i_24_)) return false
                            i_18_ += i_37_
                            i_17_ += i_32_
                            i_24_ += WorldMapToggle.anInt3872
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
                            i_21_ = WorldMapToggle.anInt3872 * i_21_
                            while (--i_16_ >= 0) {
                                if (!SceneObjectSpawnerStatics.method771(i_36_, (-25).toByte(), i_19_, 0, (i shr 12) - -1, (i_17_ shr 12) - 1, GlTextureBaseStatics.anIntArray5091, i_21_)) return false
                                i_17_ += i_33_
                                i_19_ += i_37_
                                i_21_ += WorldMapToggle.anInt3872
                                i += i_32_
                            }
                            while (--i_24_ >= 0) {
                                if (!SceneObjectSpawnerStatics.method771(i_36_, (-25).toByte(), i_19_, 0, (i_23_ shr 12) - -1, -1 + (i_17_ shr 12), GlTextureBaseStatics.anIntArray5091, i_21_)) return false
                                i_19_ += i_37_
                                i_21_ += WorldMapToggle.anInt3872
                                i_17_ += i_33_
                                i_23_ += i_34_
                            }
                            return true
                        }
                        i_24_ -= i_16_
                        i_16_ -= i_21_
                        i_21_ = WorldMapToggle.anInt3872 * i_21_
                        while (--i_16_ >= 0) {
                            if (!SceneObjectSpawnerStatics.method771(i_36_, (-25).toByte(), i_19_, 0, 1 + (i_17_ shr 12), (i shr 12) - 1, GlTextureBaseStatics.anIntArray5091, i_21_)) return false
                            i_21_ += WorldMapToggle.anInt3872
                            i_17_ += i_33_
                            i_19_ += i_37_
                            i += i_32_
                        }
                        while (--i_24_ >= 0) {
                            if (!SceneObjectSpawnerStatics.method771(i_36_, (-25).toByte(), i_19_, 0, 1 + (i_17_ shr 12), (i_23_ shr 12) - 1, GlTextureBaseStatics.anIntArray5091, i_21_)) return false
                            i_17_ += i_33_
                            i_23_ += i_34_
                            i_19_ += i_37_
                            i_21_ += WorldMapToggle.anInt3872
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
                        i_21_ = WorldMapToggle.anInt3872 * i_21_
                        while (--i_24_ >= 0) {
                            if (!SceneObjectSpawnerStatics.method771(i_36_, (-25).toByte(), i_19_, 0, (i_17_ shr 12) - -1, -1 + (i_23_ shr 12), GlTextureBaseStatics.anIntArray5091, i_21_)) return false
                            i_23_ += i_32_
                            i_19_ += i_37_
                            i_21_ += WorldMapToggle.anInt3872
                            i_17_ += i_33_
                        }
                        while (--i_16_ >= 0) {
                            if (!SceneObjectSpawnerStatics.method771(i_36_, (-25).toByte(), i_19_, 0, (i shr 12) - -1, -1 + (i_23_ shr 12), GlTextureBaseStatics.anIntArray5091, i_21_)) return false
                            i_23_ += i_32_
                            i += i_34_
                            i_19_ += i_37_
                            i_21_ += WorldMapToggle.anInt3872
                        }
                        return true
                    }
                    i_16_ -= i_24_
                    i_24_ -= i_21_
                    i_21_ = WorldMapToggle.anInt3872 * i_21_
                    while (--i_24_ >= 0) {
                        if (!SceneObjectSpawnerStatics.method771(i_36_, (-25).toByte(), i_19_, 0, (i_23_ shr 12) - -1, (i_17_ shr 12) - 1, GlTextureBaseStatics.anIntArray5091, i_21_)) return false
                        i_17_ += i_33_
                        i_23_ += i_32_
                        i_21_ += WorldMapToggle.anInt3872
                        i_19_ += i_37_
                    }
                    while (--i_16_ >= 0) {
                        if (!SceneObjectSpawnerStatics.method771(i_36_, (-25).toByte(), i_19_, 0, (i_23_ shr 12) - -1, -1 + (i shr 12), GlTextureBaseStatics.anIntArray5091, i_21_)) return false
                        i_19_ += i_37_
                        i_21_ += WorldMapToggle.anInt3872
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
                        i_16_ *= WorldMapToggle.anInt3872
                        while (--i_21_ >= 0) {
                            if (!SceneObjectSpawnerStatics.method771(i_36_, (-25).toByte(), i_22_, 0, 1 + (i_23_ shr 12), -1 + (i shr 12), GlTextureBaseStatics.anIntArray5091, i_16_)) return false
                            i_22_ += i_37_
                            i_16_ += WorldMapToggle.anInt3872
                            i_23_ += i_32_
                            i += i_34_
                        }
                        while (--i_24_ >= 0) {
                            if (!SceneObjectSpawnerStatics.method771(i_36_, (-25).toByte(), i_22_, 0, 1 + (i_17_ shr 12), (i shr 12) + -1, GlTextureBaseStatics.anIntArray5091, i_16_)) return false
                            i_17_ += i_33_
                            i += i_34_
                            i_22_ += i_37_
                            i_16_ += WorldMapToggle.anInt3872
                        }
                        return true
                    }
                    i_24_ -= i_21_
                    i_21_ -= i_16_
                    i_16_ *= WorldMapToggle.anInt3872
                    while (--i_21_ >= 0) {
                        if (!SceneObjectSpawnerStatics.method771(i_36_, (-25).toByte(), i_22_, 0, 1 + (i shr 12), (i_23_ shr 12) + -1, GlTextureBaseStatics.anIntArray5091, i_16_)) return false
                        i_16_ += WorldMapToggle.anInt3872
                        i_22_ += i_37_
                        i += i_34_
                        i_23_ += i_32_
                    }
                    while (--i_24_ >= 0) {
                        if (!SceneObjectSpawnerStatics.method771(i_36_, (-25).toByte(), i_22_, 0, (i shr 12) - -1, -1 + (i_17_ shr 12), GlTextureBaseStatics.anIntArray5091, i_16_)) return false
                        i_17_ += i_33_
                        i_16_ += WorldMapToggle.anInt3872
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
                    i_16_ = WorldMapToggle.anInt3872 * i_16_
                    while (--i_24_ >= 0) {
                        if (!SceneObjectSpawnerStatics.method771(i_36_, (-25).toByte(), i_22_, 0, 1 + (i_17_ shr 12), -1 + (i_23_ shr 12), GlTextureBaseStatics.anIntArray5091, i_16_)) return false
                        i_17_ += i_34_
                        i_23_ += i_32_
                        i_22_ += i_37_
                        i_16_ += WorldMapToggle.anInt3872
                    }
                    while (--i_21_ >= 0) {
                        if (!SceneObjectSpawnerStatics.method771(i_36_, (-25).toByte(), i_22_, 0, (i shr 12) - -1, -1 + (i_23_ shr 12), GlTextureBaseStatics.anIntArray5091, i_16_)) return false
                        i_23_ += i_32_
                        i_22_ += i_37_
                        i += i_33_
                        i_16_ += WorldMapToggle.anInt3872
                    }
                    return true
                }
                i_21_ -= i_24_
                i_24_ -= i_16_
                i_16_ *= WorldMapToggle.anInt3872
                while (--i_24_ >= 0) {
                    if (!SceneObjectSpawnerStatics.method771(i_36_, (-25).toByte(), i_22_, 0, 1 + (i_23_ shr 12), -1 + (i_17_ shr 12), GlTextureBaseStatics.anIntArray5091, i_16_)) return false
                    i_16_ += WorldMapToggle.anInt3872
                    i_23_ += i_32_
                    i_22_ += i_37_
                    i_17_ += i_34_
                }
                while (--i_21_ >= 0) {
                    if (!SceneObjectSpawnerStatics.method771(i_36_, (-25).toByte(), i_22_, 0, (i_23_ shr 12) - -1, (i shr 12) - 1, GlTextureBaseStatics.anIntArray5091, i_16_)) return false
                    i_16_ += WorldMapToggle.anInt3872
                    i += i_33_
                    i_22_ += i_37_
                    i_23_ += i_32_
                }
                return true
            }
}
