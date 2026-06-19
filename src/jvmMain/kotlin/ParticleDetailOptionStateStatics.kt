import FlickeringEffectsOptionStateStatics.method1753
import LocConfigModelBuilderStatics.method3561

object ParticleDetailOptionStateStatics {
    @JvmField
            var aBoundsConstraintEntry_6018: BoundsConstraintEntry? = BoundsConstraintEntry("", 14)
            @JvmField
            var anInt6019: Int = 0
            @JvmField
            var anInt6020: Int = 0
            @JvmField
            var anIntArray6021: IntArray? = null
            @JvmField
            var anInt6022: Int = 0
            @JvmField
            var anInt6023: Int = 0
            @JvmField
            var anInt6024: Int = 0
            @JvmField
            var anInt6025: Int = 0
            @JvmField
            var anInt6026: Int = 0
            @JvmField
            var anInt6027: Int = 0
            @JvmField
            var anInt6028: Int = 0
    
            @JvmStatic
            fun method1793(`is`: ByteArray, i: Int, i_0_: Int, i_1_: Int): String? {
                anInt6020++
                val cs = CharArray(i_1_)
                var i_2_ = 0
                if (i_0_ >= -82) return null
                var i_3_ = i
                val i_4_ = i_1_ + i
                while (i_4_ > i_3_) {
                    val i_5_ = 0xff and `is`[i_3_++].toInt()
                    var i_6_: Int
                    if (i_5_ < 128) {
                        if (i_5_ == 0) i_6_ = 65533
                        else i_6_ = i_5_
                    } else if (i_5_ >= 192) {
                        if (i_5_ >= 224) {
                            if (i_5_ < 240) {
                                if (i_3_ + 1 < i_4_ && (`is`[i_3_].toInt() and 0xc0) == 128 && (0xc0 and `is`[1 + i_3_].toInt()) == 128) {
                                    i_6_ = ((i_5_ and 0xf) shl 12 or (`is`[i_3_++].toInt() shl 6 and 0xfc0) or (`is`[i_3_++].toInt() and 0x3f))
                                    if (i_6_ < 2048) i_6_ = 65533
                                } else i_6_ = 65533
                            } else if (i_5_ >= 248) i_6_ = 65533
                            else if (i_4_ <= i_3_ - -2 || (0xc0 and `is`[i_3_].toInt()) != 128 || (0xc0 and `is`[1 + i_3_].toInt()) != 128 || (`is`[2 + i_3_].toInt() and 0xc0) != 128) i_6_ = 65533
                            else {
                                i_6_ = (i_5_ shl 18 and 0x1c0000 or ((`is`[i_3_++].toInt() and 0x3f) shl 12) or (0xfc0 and (`is`[i_3_++].toInt() shl 6)) or (0x3f and `is`[i_3_++].toInt()))
                                if (i_6_ >= 65536 && i_6_ <= 1114111) i_6_ = 65533
                                else i_6_ = 65533
                            }
                        } else if (i_3_ >= i_4_ || (0xc0 and `is`[i_3_].toInt()) != 128) i_6_ = 65533
                        else {
                            i_6_ = `is`[i_3_++].toInt() and 0x3f or (i_5_ shl 6 and 0x7c0)
                            if (i_6_ < 128) i_6_ = 65533
                        }
                    } else i_6_ = 65533
                    cs[i_2_++] = i_6_.toChar()
                }
                return String(cs, 0, i_2_)
            }
    
            @JvmStatic
            fun method1794(i: Int) {
                if (i != 63) anIntArray6021 = null
                aBoundsConstraintEntry_6018 = null
                anIntArray6021 = null
            }
    
            @JvmStatic
            fun method1795(`is`: ByteArray, bool: Boolean): String {
                anInt6026++
                return FixedFunctionWaterPassStatics.method3546(`is`, 0, `is`.size, 0)
            }
    
            @JvmStatic
            fun method1796(i: Int, i_10_: Int): Boolean {
                if (i < 53) return true
                anInt6019++
                return i_10_ == 18 || i_10_ == 6 || i_10_ == 1011 || i_10_ == 13 || i_10_ == 16
            }
    
            @JvmStatic
            fun method1797(i: Int, i_11_: Int, widgetComponent: WidgetComponent, i_12_: Byte) {
                if (RenderNodeStatics.aBoolean9722) {
                    val class254 = (if (ParticleEmitterFactoryStatics.anInt3176 != -1) ProjectionCameraTransformStatics.aEmoteDefCache_5764!!.method2600(ParticleEmitterFactoryStatics.anInt3176, 28364) else null)
                    if (ClientStatics.method105(widgetComponent)!!.method3303(1) && (WidgetTextConfigStatics.anInt500 and 0x20) != 0 && (class254 == null || (widgetComponent.method428(class254.anInt3256, ParticleEmitterFactoryStatics.anInt3176, -128) != class254.anInt3256))) {
                        ItemModelDefinitionStatics.anInt436++
                        MinimapPolygonDrawerStatics.method466(false, (ItemNameResolverStatics.aString5000 + " -> " + widgetComponent.aString752) + LoaderStatics.getDebug(widgetComponent.anInt830 shr 16, widgetComponent.anInt830 and 0xffff), widgetComponent.anInt830, (-90).toByte(), false, widgetComponent.anInt704, widgetComponent.anInt812, true, 6, (widgetComponent.anInt830 or (widgetComponent.anInt704 shl 0)).toLong(), ItemNameResolverStatics.aString5001, 0L, FloatBufferStatics.anInt9747)
                    }
                }
                anInt6022++
                for (i_13_ in 9 downTo 5) {
                    val string = method3561(i_13_, widgetComponent, true)
                    if (string != null) {
                        MinimapPolygonDrawerStatics.method466(false, widgetComponent.aString752 + LoaderStatics.getDebug(widgetComponent.anInt830 shr 16, widgetComponent.anInt830 and 0xffff), widgetComponent.anInt830, (-122).toByte(), false, widgetComponent.anInt704, widgetComponent.anInt812, true, 1011, ((widgetComponent.anInt704 shl 0) or widgetComponent.anInt830).toLong(), string, (1 + i_13_).toLong(), MinimapRendererStatics.method888(57.toByte(), i_13_, widgetComponent))
                        TimingCounters.anInt4169++
                    }
                }
                val string = method1753(0, widgetComponent)
                if (string != null) {
                    MinimapPolygonDrawerStatics.method466(false, widgetComponent.aString752 + LoaderStatics.getDebug(widgetComponent.anInt830 shr 16, widgetComponent.anInt830 and 0xffff), widgetComponent.anInt830, (-83).toByte(), false, widgetComponent.anInt704, widgetComponent.anInt812, true, 13, ((widgetComponent.anInt704 shl 0) or widgetComponent.anInt830).toLong(), string, 0L, widgetComponent.anInt713)
                    ScriptOpcodeHolder.anInt2340++
                }
                for (i_14_ in 4 downTo 0) {
                    val string_15_ = method3561(i_14_, widgetComponent, true)
                    if (string_15_ != null) {
                        MinimapPolygonDrawerStatics.method466(false, widgetComponent.aString752, widgetComponent.anInt830, (-67).toByte(), false, widgetComponent.anInt704, widgetComponent.anInt812, true, 18, ((widgetComponent.anInt704 shl 0) or widgetComponent.anInt830).toLong(), string_15_, (1 + i_14_).toLong(), MinimapRendererStatics.method888(57.toByte(), i_14_, widgetComponent))
                        TimingCounters.anInt4169++
                    }
                }
                if (ClientStatics.method105(widgetComponent)!!.method3305(0)) {
                    if (widgetComponent.aString816 != null) MinimapPolygonDrawerStatics.method466(false, "", widgetComponent.anInt830, (-118).toByte(), false, widgetComponent.anInt704, widgetComponent.anInt812, true, 16, ((widgetComponent.anInt704 shl 0) or widgetComponent.anInt830).toLong(), widgetComponent.aString816, 0L, -1)
                    else MinimapPolygonDrawerStatics.method466(false, "", widgetComponent.anInt830, (-79).toByte(), false, widgetComponent.anInt704, widgetComponent.anInt812, true, 16, (widgetComponent.anInt704 shl 0 or widgetComponent.anInt830).toLong(), LocalizedTextStatics.aLocalizedText_3492!!.method2063(AnimationFrameDefinitionStatics.anInt6967, 544), 0L, -1)
                    TimedTileQueueEntryStatics.anInt9655++
                }
            }
}
