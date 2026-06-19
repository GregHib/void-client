object FlickeringEffectsOptionStateStatics {
    @JvmField
            var anInt5911: Int = 0
            @JvmField
            var anInt5912: Int = 0
            @JvmField
            var anInt5913: Int = 0
            @JvmField
            var anInt5914: Int = 0
            @JvmField
            var anInt5915: Int = 0
            @JvmField
            var anInt5916: Int = 0
            @JvmField
            var anInt5917: Int = 0
            @JvmField
            var anInt5918: Int = 0
            @JvmField
            var anInt5919: Int = 0
            @JvmField
            var anInt5920: Int = 0
            @JvmField
            var anIntArrayArray5921: Array<IntArray?>? = null
            @JvmField
            var anInt5922: Int = 0
            @JvmField
            var anInt5923: Int = 0
            @JvmField
            var anInt5924: Int = 0
    
            @JvmStatic
            fun method1749(class110_sub1: MapLabelMenuEntry?, class110_sub1_0_: MapLabelMenuEntry?, bool: Boolean, i: Int, i_1_: Byte): Int {
                try {
                    anInt5916++
                    if (i == 1) {
                        var i_2_ = class110_sub1!!.anInt1704
                        var i_3_ = class110_sub1_0_!!.anInt1704
                        if (!bool) {
                            if (i_2_ == -1) i_2_ = 2001
                            if (i_3_ == -1) i_3_ = 2001
                        }
                        return -i_3_ + i_2_
                    }
                    if (i == 2) return (RemoveRoofsOptionStateStatics.method1811(9152, (class110_sub1_0_!!.method1038(false).aString3663), AnimationFrameDefinitionStatics.anInt6967, (class110_sub1!!.method1038(false).aString3663)))
                    if (i == 3) {
                        if (class110_sub1!!.aString5787 == "-") {
                            if (class110_sub1_0_!!.aString5787 == "-") return 0
                            if (bool) return -1
                            return 1
                        } else if (class110_sub1_0_!!.aString5787 == "-") {
                            if (!bool) return -1
                            return 1
                        }
                        return (RemoveRoofsOptionStateStatics.method1811(9152, class110_sub1_0_.aString5787, AnimationFrameDefinitionStatics.anInt6967, class110_sub1.aString5787))
                    }
                    if (i == 4) {
                        if (!class110_sub1!!.method1033(-85)) {
                            if (!class110_sub1_0_!!.method1033(101)) return 0
                            return -1
                        }
                        if (class110_sub1_0_!!.method1033(70)) return 0
                        return 1
                    }
                    if (i == 5) {
                        if (class110_sub1!!.method1036((-35).toByte())) {
                            if (!class110_sub1_0_!!.method1036((-35).toByte())) return 1
                            return 0
                        }
                        if (!class110_sub1_0_!!.method1036((-35).toByte())) return 0
                        return -1
                    }
                    if (i == 6) {
                        if (class110_sub1!!.method1031(i_1_.toInt() xor 0x61.inv())) {
                            if (class110_sub1_0_!!.method1031(-105)) return 0
                            return 1
                        }
                        if (class110_sub1_0_!!.method1031(i_1_.toInt() xor 0x60.inv())) return -1
                        return 0
                    }
                    if (i_1_.toInt() != -30) return 63
                    if (i == 7) {
                        if (class110_sub1!!.method1029(true)) {
                            if (!class110_sub1_0_!!.method1029(true)) return 1
                            return 0
                        }
                        if (class110_sub1_0_!!.method1029(true)) return -1
                        return 0
                    }
                    if (i == 8) {
                        var i_4_ = class110_sub1!!.anInt5788
                        var i_5_ = class110_sub1_0_!!.anInt5788
                        if (bool) {
                            if (i_5_ == 1000) i_5_ = -1
                            if (i_4_ == 1000) i_4_ = -1
                        } else {
                            if (i_5_ == -1) i_5_ = 1000
                            if (i_4_ == -1) i_4_ = 1000
                        }
                        return -i_5_ + i_4_
                    }
                    return (class110_sub1!!.anInt5786 + -class110_sub1_0_!!.anInt5786)
                } catch (runtimeexception: RuntimeException) {
                    throw SoundBankPatchStatics.method2929(runtimeexception, ("mfa.L(" + (if (class110_sub1 != null) "{...}" else "null") + ',' + (if (class110_sub1_0_ != null) "{...}" else "null") + ',' + bool + ',' + i + ',' + i_1_ + ')'))
                }
            }
    
            @JvmStatic
            fun method1750(i: Int, i_6_: Int) {
                anInt5912++
                ParamMapStatics.anInt9488 = i_6_
                SocketStreamWorkerStatics.aLruByteCache_2671!!.method590(0)
            }
    
            @JvmStatic
            fun method1752(i: Int, i_10_: Int, i_11_: Int) {
                GrayscaleNoiseTextureStatics.anInt5283 = i_11_
                anInt5922++
                LinkedNodeListIteratorStatics.anInt1651 = i_10_
                if (i == -1) {
                    if (ByteBufferStatics.anInt7207 == 0) {
                        ShadowQualityOptionStateStatics.anInt6008 = (2 * HardKeyedCacheEntryReferenceStatics.anInt10444 + LinkedNodeListIteratorStatics.anInt1651)
                        SynthVoiceGroupStatics.anInt8854 = SoundEnvelopeStatics.anInt2747 * 2 + GrayscaleNoiseTextureStatics.anInt5283
                    } else if (ByteBufferStatics.anInt7207 == 1) {
                        ItemModelDefinitionStatics.anInt425 = (BloomGraphicsOptionStateStatics.anInt5965 + GrayscaleNoiseTextureStatics.anInt5283 / DirectionPathStatics.anInt1067 - -2)
                        BackgroundWorkerThreadStatics.anInt3225 = (FileExistsConditionStatics.anInt4784 + LinkedNodeListIteratorStatics.anInt1651 / ByteStoreStatics.anInt4267 - -2)
                        SynthVoiceGroupStatics.anInt8854 = DirectionPathStatics.anInt1067 * ItemModelDefinitionStatics.anInt425
                        ShadowQualityOptionStateStatics.anInt6008 = ByteStoreStatics.anInt4267 * BackgroundWorkerThreadStatics.anInt3225
                        SoundEnvelopeStatics.anInt2747 = (-GrayscaleNoiseTextureStatics.anInt5283 + SynthVoiceGroupStatics.anInt8854 shr 1)
                        HardKeyedCacheEntryReferenceStatics.anInt10444 = (ShadowQualityOptionStateStatics.anInt6008 - LinkedNodeListIteratorStatics.anInt1651 shr 1)
                    } else if (ByteBufferStatics.anInt7207 == 2) {
                        SynthVoiceGroupStatics.anInt8854 = GrayscaleNoiseTextureStatics.anInt5283
                        ShadowQualityOptionStateStatics.anInt6008 = LinkedNodeListIteratorStatics.anInt1651
                    }
                }
            }
    
            @JvmStatic
            fun method1753(i: Int, widgetComponent: WidgetComponent): String? {
                anInt5924++
                if (ClientStatics.method105(widgetComponent)!!.method3307(116) == 0) return null
                if (widgetComponent.aString780 == null || widgetComponent.aString780!!.trim { it <= ' ' }.length == 0) {
                    if (TextureCubeProviderStatics.aBoolean6327) return "Hidden-use"
                    return null
                }
                if (i != 0) return null
                return widgetComponent.aString780
            }
    
            @JvmStatic
            fun method1754(bool: Boolean, i: Int, i_12_: Int, i_13_: Int): Int {
                anInt5920++
                if (LinkedListNodeStatics.anInt4290 < 100) return -2
                if (bool != true) method1754(false, 115, 112, -104)
                var i_14_ = -2
                var i_15_ = 2147483647
                val i_16_ = i_12_ - MapRegionLoaderStatics.anInt1266
                val i_17_ = i_13_ - MapRegionLoaderStatics.anInt1263
                var class348_sub21 = MapRegionLoaderStatics.aNodeDeque_1254!!.method1995(4) as CameraSplineNode?
                while (class348_sub21 != null) {
                    if (class348_sub21.anInt6847 == i) {
                        val i_18_ = class348_sub21.anInt6852
                        val i_19_ = class348_sub21.anInt6851
                        val i_20_ = (i_19_ - -MapRegionLoaderStatics.anInt1263 or (MapRegionLoaderStatics.anInt1266 + i_18_ shl 14))
                        val i_21_ = ((-i_19_ + i_17_) * (-i_19_ + i_17_) + (i_16_ - i_18_) * (-i_18_ + i_16_))
                        if (i_14_ < 0 || i_15_ > i_21_) {
                            i_15_ = i_21_
                            i_14_ = i_20_
                        }
                    }
                    class348_sub21 = MapRegionLoaderStatics.aNodeDeque_1254!!.method1990(113.toByte()) as CameraSplineNode?
                }
                return i_14_
            }
    
            @JvmStatic
            fun method1755(i: Int) {
                anIntArrayArray5921 = null
                if (i != 1) method1749(null, null, false, -43, 102.toByte())
            }
    
            @JvmStatic
            fun method1756(`is`: ByteArray?, i: Int, i_22_: Int, i_23_: Int, is_24_: Array<ByteArray>, is_25_: Array<ByteArray>, is_26_: IntArray?, is_27_: IntArray?): Int {
                try {
                    anInt5918++
                    val i_28_ = -19 % ((i - 64) / 39)
                    val i_29_ = is_26_!![i_23_]
                    val i_30_ = is_27_!![i_23_] + i_29_
                    val i_31_ = is_26_[i_22_]
                    val i_32_ = is_27_[i_22_] + i_31_
                    var i_33_ = i_29_
                    if (i_29_ < i_31_) i_33_ = i_31_
                    var i_34_ = i_30_
                    if (i_32_ < i_30_) i_34_ = i_32_
                    var i_35_ = 0xff and `is`!![i_23_].toInt()
                    if (i_35_ > (`is`[i_22_].toInt() and 0xff)) i_35_ = 0xff and `is`[i_22_].toInt()
                    val is_36_ = is_25_!![i_23_]
                    val is_37_ = is_24_!![i_22_]
                    var i_38_ = i_33_ + -i_29_
                    var i_39_ = -i_31_ + i_33_
                    var i_40_ = i_33_
                    while (i_34_ > i_40_) {
                        val i_41_ = is_37_[i_39_++] + is_36_[i_38_++]
                        if (i_41_ < i_35_) i_35_ = i_41_
                        i_40_++
                    }
                    return -i_35_
                } catch (runtimeexception: RuntimeException) {
                    throw SoundBankPatchStatics.method2929(runtimeexception, ("mfa.K(" + (if (`is` != null) "{...}" else "null") + ',' + i + ',' + i_22_ + ',' + i_23_ + ',' + (if (is_24_ != null) "{...}" else "null") + ',' + (if (is_25_ != null) "{...}" else "null") + ',' + (if (is_26_ != null) "{...}" else "null") + ',' + (if (is_27_ != null) "{...}" else "null") + ')'))
                }
            }
}
