object TextureQualityOptionStateStatics {
    @JvmField
            var anInt5996: Int = 0
            @JvmField
            var aIntRange_5997: IntRange? = IntRange(115, 11)
            @JvmField
            var anInt5998: Int = 0
            @JvmField
            var anInt5999: Int = 0
            @JvmField
            var anInt6000: Int = 0
            @JvmField
            var anInt6001: Int = 0
            @JvmField
            var anInt6002: Int = 0
            @JvmField
            var anInt6003: Int = 0
            @JvmField
            var anInt6004: Int = 0
            @JvmField
            var anInt6005: Int = 0
            @JvmField
            var anInt6006: Int = 0
    
            @JvmStatic
            fun method1782(i: Int, i_0_: Int): SystemFontGlyphs? {
                if (i_0_ != 10144) return null
                anInt6004++
                if (i == 0) {
                    if (MapRegionLoaderStatics.aFloat1247.toDouble() == 3.0) return MinimapSpriteRendererStatics.aSystemFontGlyphs_4921
                    if (MapRegionLoaderStatics.aFloat1247.toDouble() == 4.0) return GlRectangleTextureStatics.aSystemFontGlyphs_8644
                    if (MapRegionLoaderStatics.aFloat1247.toDouble() == 6.0) return GlShaderObjectHandleStatics.aSystemFontGlyphs_521
                    if (MapRegionLoaderStatics.aFloat1247.toDouble() >= 8.0) return HeapDiagnosticsHolder.aSystemFontGlyphs_2252
                } else if (i == 1) {
                    if (MapRegionLoaderStatics.aFloat1247.toDouble() == 3.0) return GlShaderObjectHandleStatics.aSystemFontGlyphs_521
                    if (MapRegionLoaderStatics.aFloat1247.toDouble() == 4.0) return HeapDiagnosticsHolder.aSystemFontGlyphs_2252
                    if (MapRegionLoaderStatics.aFloat1247.toDouble() == 6.0) return PingHostListHolder.aSystemFontGlyphs_2333
                    if (MapRegionLoaderStatics.aFloat1247.toDouble() >= 8.0) return GlBufferObjectStatics.aSystemFontGlyphs_4754
                } else if (i == 2) {
                    if (MapRegionLoaderStatics.aFloat1247.toDouble() == 3.0) return PingHostListHolder.aSystemFontGlyphs_2333
                    if (MapRegionLoaderStatics.aFloat1247.toDouble() == 4.0) return GlBufferObjectStatics.aSystemFontGlyphs_4754
                    if (MapRegionLoaderStatics.aFloat1247.toDouble() == 6.0) return ModelVertexColorBufferStatics.aSystemFontGlyphs_6581
                    if (MapRegionLoaderStatics.aFloat1247.toDouble() >= 8.0) return WorldMapRendererStatics.aSystemFontGlyphs_4672
                }
                return null
            }
    
            @JvmStatic
            fun method1783(i: Int, i_2_: Int, i_3_: Int, i_4_: Int, i_5_: Int, i_6_: Int) {
                var i = i
                var i_3_ = i_3_
                var i_4_ = i_4_
                var i_5_ = i_5_
                anInt5998++
                var i_7_ = -i_3_ + i_4_
                var i_8_ = i_5_ + -i
                if ((i_8_.inv()) == i_2_) {
                    if (i_7_ != 0) SoundCacheState.method2641(i_4_, i_3_, -117, i, i_6_)
                    return
                } else if (i_7_ == 0) {
                    NpcAppearanceFlagsStatics.method223(i_5_, i_6_, i_3_, i, 47.toByte())
                    return
                }
                if (i_7_ < 0) i_7_ = -i_7_
                if (i_8_ < 0) i_8_ = -i_8_
                val bool = i_8_ < i_7_
                if (bool) {
                    val i_9_ = i
                    val i_10_ = i_5_
                    i = i_3_
                    i_5_ = i_4_
                    i_3_ = i_9_
                    i_4_ = i_10_
                }
                if (i_5_ < i) {
                    val i_11_ = i
                    i = i_5_
                    val i_12_ = i_3_
                    i_5_ = i_11_
                    i_3_ = i_4_
                    i_4_ = i_12_
                }
                var i_13_ = i_3_
                val i_14_ = -i + i_5_
                var i_15_ = -i_3_ + i_4_
                var i_16_ = -(i_14_ shr 1)
                if (i_15_ < 0) i_15_ = -i_15_
                val i_17_ = if (i_4_ <= i_3_) -1 else 1
                if (bool) {
                    var i_19_ = i
                    while (i_5_ >= i_19_) {
                        WidgetDefinitionStatics.anIntArrayArray255!![i_19_]!![i_13_] = i_6_
                        i_16_ += i_15_
                        if (i_16_ > 0) {
                            i_13_ += i_17_
                            i_16_ -= i_14_
                        }
                        i_19_++
                    }
                } else {
                    for (i_18_ in i..i_5_) {
                        i_16_ += i_15_
                        WidgetDefinitionStatics.anIntArrayArray255!![i_13_]!![i_18_] = i_6_
                        if (i_16_ > 0) {
                            i_13_ += i_17_
                            i_16_ -= i_14_
                        }
                    }
                }
            }
    
            @JvmStatic
            fun method1785(i: Int) {
                aIntRange_5997 = null
                if (i != 8) aIntRange_5997 = null
            }
    
            @JvmStatic
            fun method1787(i: Int, i_22_: Int) {
                anInt6002++
                val class348_sub42_sub15 = NamedTimedNodeStatics.method2516(i, 105.toByte(), i_22_) //8
                class348_sub42_sub15.method3251(-16058)
            }
}
