import FlickeringEffectsOptionStateStatics.method1750
import ProjectedGroundDecorStatics.method2420
import NullRenderPassStatics.method3535

object AbstractProceduralTextureNodeStatics {
    @JvmField
            var anInt7026: Int = 0
            @JvmField
            var anInt7027: Int = 0
            @JvmField
            var anInt7028: Int = 0
            @JvmField
            var anInt7029: Int = 0
            @JvmField
            var anInt7030: Int = 0
            @JvmField
            var anInt7034: Int = 0
            @JvmField
            var anInt7035: Int = 0
            @JvmField
            var anInt7037: Int = 0
            @JvmField
            var anInt7038: Int = 0
            @JvmField
            var anInt7039: Int = 0
            @JvmField
            var anInt7040: Int = 0
            @JvmField
            var aHashtable_7041: Hashtable? = Hashtable(32)
            @JvmField
            var aSoundChannelMixer_7042: SoundChannelMixer? = null
            @JvmField
            var anInt7043: Int = 0
            @JvmField
            var anInt7044: Int = 0
            fun method3036(class348_sub49: ByteBuffer, i: Int): MinimapTriangleDrawer? {
                anInt7026++
                if (i > -4) return null
                return MinimapTriangleDrawer(class348_sub49.readShort(13638), class348_sub49.readShort(13638), class348_sub49.readShort(13638), class348_sub49.readShort(13638), class348_sub49.readMedium(-1), class348_sub49.readMedium(-1), class348_sub49.readUnsignedByte(255))
            }
    
            @JvmStatic
            fun method3038(i: Int) {
                anInt7044++
                var i_0_ = 0
                if (IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub28_7230!!.method1845(-32350) == 1) {
                    i_0_ = i_0_ or 0x1
                    i_0_ = i_0_ or 0x10
                    i_0_ = i_0_ or 0x20
                    i_0_ = i_0_ or 0x2
                    i_0_ = i_0_ or 0x4
                }
                if ((IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub24_7235!!.method1820(-32350).inv()) == i) i_0_ = i_0_ or 0x40
                method2420(i_0_, i)
                GradientLookupEffectStatics.aSeqDefinitionCache_9195!!.method2009(i_0_, 109.toByte())
                ClientExceptionStatics.aModelHeaderCache_112!!.method1942(i_0_, (-125).toByte())
                MapAreaDefinitionStatics.aBufferedMessageQueue_2529!!.method2073(-25032, i_0_)
                ConstantColourTextureNodeStatics.aMapElementDefinitionCache_9245!!.method2541(119, i_0_)
                method3535(i_0_, i.inv())
                NormalMapGeneratorStatics.method2040(i_0_, true)
                CollisionFlagQueryStatics.method720(i_0_, i + 1227)
                method1750(14056, i_0_)
                TextureTileRendererStatics.method2953((-106).toByte())
            }
    
            @JvmStatic
            fun method3040(bool: Boolean) {
                aSoundChannelMixer_7042 = null
                aHashtable_7041 = null
            }
    
            fun method3041(i: Int, i_5_: Int, i_6_: Int, i_7_: Int, i_8_: Int, i_9_: Int, i_10_: Int, i_11_: Int) {
                anInt7030++
                var i_12_ = 0
                var i_13_ = i_8_
                var i_14_ = 0
                val i_15_ = -i_11_ + i
                val i_16_ = i_8_ - i_11_
                val i_17_ = i * i
                val i_18_ = i_8_ * i_8_
                val i_19_ = i_15_ * i_15_
                val i_20_ = i_16_ * i_16_
                val i_21_ = i_18_ shl 1
                val i_22_ = i_17_ shl 1
                val i_23_ = i_20_ shl 1
                val i_24_ = i_19_ shl 1
                val i_25_ = i_8_ shl 1
                val i_26_ = i_16_ shl 1
                var i_27_ = i_21_ + i_17_ * (-i_25_ + 1)
                var i_28_ = i_18_ + -(i_22_ * (-1 + i_25_))
                var i_29_ = (1 - i_26_) * i_19_ + i_23_
                var i_30_ = i_20_ + -(i_24_ * (-1 + i_26_))
                val i_31_ = i_17_ shl 2
                val i_32_ = i_18_ shl 2
                val i_33_ = i_19_ shl 2
                val i_34_ = i_20_ shl 2
                var i_35_ = 3 * i_21_
                var i_36_ = i_22_ * (-3 + i_25_)
                var i_37_ = 3 * i_23_
                var i_38_ = (i_26_ - 3) * i_24_
                var i_39_ = i_32_
                var i_40_ = i_31_ * (i_7_ + i_8_)
                var i_41_ = i_34_
                var i_42_ = i_33_ * (-1 + i_16_)
                if (i_6_ >= LocalPlayerState.anInt1910 && WidgetTextConfigStatics.anInt513 >= i_6_) {
                    val `is` = WidgetDefinitionStatics.anIntArrayArray255!![i_6_]!!
                    val i_43_ = WhirlpoolHashStatics.method831(CameraNodeListStatics.anInt1745, i_5_ + -i, WorldMapLabelStatics.anInt4960, 77)
                    val i_44_ = WhirlpoolHashStatics.method831(CameraNodeListStatics.anInt1745, i + i_5_, WorldMapLabelStatics.anInt4960, -68)
                    val i_45_ = WhirlpoolHashStatics.method831(CameraNodeListStatics.anInt1745, i_5_ + -i_15_, WorldMapLabelStatics.anInt4960, i_7_ + -115)
                    val i_46_ = WhirlpoolHashStatics.method831(CameraNodeListStatics.anInt1745, i_5_ + i_15_, WorldMapLabelStatics.anInt4960, 97)
                    GlElementArrayBufferStatics.method1156(-27, i_45_, `is`, i_43_, i_10_)
                    GlElementArrayBufferStatics.method1156(-27, i_46_, `is`, i_45_, i_9_)
                    GlElementArrayBufferStatics.method1156(-27, i_44_, `is`, i_46_, i_10_)
                }
                while (i_13_ > 0) {
                    val bool = i_16_ >= i_13_
                    if (bool) {
                        if (i_29_ < 0) {
                            while (i_29_ < 0) {
                                i_29_ += i_37_
                                i_30_ += i_41_
                                i_41_ += i_34_
                                i_14_++
                                i_37_ += i_34_
                            }
                        }
                        if (i_30_ < 0) {
                            i_29_ += i_37_
                            i_30_ += i_41_
                            i_41_ += i_34_
                            i_37_ += i_34_
                            i_14_++
                        }
                        i_29_ += -i_42_
                        i_30_ += -i_38_
                        i_42_ -= i_33_
                        i_38_ -= i_33_
                    }
                    if (i_27_ < 0) {
                        while (i_27_ < 0) {
                            i_27_ += i_35_
                            i_28_ += i_39_
                            i_12_++
                            i_39_ += i_32_
                            i_35_ += i_32_
                        }
                    }
                    if (i_28_ < 0) {
                        i_28_ += i_39_
                        i_27_ += i_35_
                        i_35_ += i_32_
                        i_12_++
                        i_39_ += i_32_
                    }
                    i_27_ += -i_40_
                    i_28_ += -i_36_
                    i_13_--
                    i_36_ -= i_31_
                    i_40_ -= i_31_
                    val i_47_ = -i_13_ + i_6_
                    val i_48_ = i_13_ + i_6_
                    if (i_48_ >= LocalPlayerState.anInt1910 && WidgetTextConfigStatics.anInt513 >= i_47_) {
                        val i_49_ = WhirlpoolHashStatics.method831(CameraNodeListStatics.anInt1745, i_12_ + i_5_, WorldMapLabelStatics.anInt4960, 36)
                        val i_50_ = WhirlpoolHashStatics.method831(CameraNodeListStatics.anInt1745, -i_12_ + i_5_, WorldMapLabelStatics.anInt4960, 97)
                        if (bool) {
                            val i_51_ = WhirlpoolHashStatics.method831(CameraNodeListStatics.anInt1745, i_5_ - -i_14_, WorldMapLabelStatics.anInt4960, i_7_ xor 0x5c.inv())
                            val i_52_ = WhirlpoolHashStatics.method831(CameraNodeListStatics.anInt1745, -i_14_ + i_5_, WorldMapLabelStatics.anInt4960, 32)
                            if (LocalPlayerState.anInt1910 <= i_47_) {
                                val `is` = WidgetDefinitionStatics.anIntArrayArray255!![i_47_]!!
                                GlElementArrayBufferStatics.method1156(-27, i_52_, `is`, i_50_, i_10_)
                                GlElementArrayBufferStatics.method1156(-27, i_51_, `is`, i_52_, i_9_)
                                GlElementArrayBufferStatics.method1156(i_7_ + -26, i_49_, `is`, i_51_, i_10_)
                            }
                            if (WidgetTextConfigStatics.anInt513 >= i_48_) {
                                val `is` = WidgetDefinitionStatics.anIntArrayArray255!![i_48_]!!
                                GlElementArrayBufferStatics.method1156(i_7_ xor 0x1a, i_52_, `is`, i_50_, i_10_)
                                GlElementArrayBufferStatics.method1156(-27, i_51_, `is`, i_52_, i_9_)
                                GlElementArrayBufferStatics.method1156(-27, i_49_, `is`, i_51_, i_10_)
                            }
                        } else {
                            if (i_47_ >= LocalPlayerState.anInt1910) GlElementArrayBufferStatics.method1156(-27, i_49_, (WidgetDefinitionStatics.anIntArrayArray255!![i_47_]!!), i_50_, i_10_)
                            if (i_48_ <= WidgetTextConfigStatics.anInt513) GlElementArrayBufferStatics.method1156(-27, i_49_, (WidgetDefinitionStatics.anIntArrayArray255!![i_48_]!!), i_50_, i_10_)
                        }
                    }
                }
            }
}
