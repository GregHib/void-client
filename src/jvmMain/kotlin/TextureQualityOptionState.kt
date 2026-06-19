/* Class239_Sub15 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class TextureQualityOptionState : GraphicsOptionState {
    override fun method1716(bool: Boolean) {
        if (bool != false) method1783(115, -122, -59, 41, -49, 92)
        anInt5999++
        if (this.aClass348_Sub51_3136.method3428((-84).toByte())!!.method1458(-23688) < 96) this.anInt3138 = 0
        if (this.anInt3138 < 0 || this.anInt3138 > 2) this.anInt3138 = method1710(20014)
    }

    override fun method1714(i: Int, i_1_: Int): Int {
        anInt6005++
        if (i != 3) method1784(99)
        if (this.aClass348_Sub51_3136.method3428((-85).toByte())!!.method1458(-23688) < 96) return 3
        return 1
    }

    internal constructor(i: Int, class348_sub51: DisplaySettingsConfig) : super(i, class348_sub51) {
        Crc64Hashable.method1114(this.anInt3138, -122)
    }

    override fun method1712(i: Int, i_20_: Int) {
        anInt6003++
        this.anInt3138 = i_20_
        val i_21_ = 33 % ((i - 82) / 35)
        Crc64Hashable.method1114(this.anInt3138, -122)
    }

    override fun method1710(i: Int): Int {
        anInt5996++
        if (i != 20014) method1782(-76, -103)
        if (this.aClass348_Sub51_3136.method3428((-105).toByte())!!.method1458(-23688) < 96) return 0
        return 2
    }

    internal constructor(class348_sub51: DisplaySettingsConfig) : super(class348_sub51) {
        Crc64Hashable.method1114(this.anInt3138, -120)
    }

    fun method1784(i: Int): Int {
        anInt6000++
        if (i != -32350) return -82
        return this.anInt3138
    }

    fun method1786(i: Int): Boolean {
        if (i < 85) method1784(-69)
        anInt6001++
        return this.aClass348_Sub51_3136.method3428((-104).toByte())!!.method1458(-23688) >= 96
    }

    companion object {

        var anInt5996: Int = 0

        var aInboundPacketHeader_5997: InboundPacketHeader? = InboundPacketHeader(115, 11)

        var anInt5998: Int = 0

        var anInt5999: Int = 0

        var anInt6000: Int = 0

        var anInt6001: Int = 0

        var anInt6002: Int = 0

        var anInt6003: Int = 0

        var anInt6004: Int = 0

        var anInt6005: Int = 0

        var anInt6006: Int = 0

        @JvmStatic
        fun method1782(i: Int, i_0_: Int): SystemFontGlyphs? {
            if (i_0_ != 10144) return null
            anInt6004++
            if (i == 0) {
                if (MapRegionLoader.aFloat1247.toDouble() == 3.0) return MinimapSpriteRenderer.aSystemFontGlyphs_4921
                if (MapRegionLoader.aFloat1247.toDouble() == 4.0) return GlRectangleTexture.aSystemFontGlyphs_8644
                if (MapRegionLoader.aFloat1247.toDouble() == 6.0) return GlShaderObjectHandle.aSystemFontGlyphs_521
                if (MapRegionLoader.aFloat1247.toDouble() >= 8.0) return HeapDiagnosticsHolder.aSystemFontGlyphs_2252
            } else if (i == 1) {
                if (MapRegionLoader.aFloat1247.toDouble() == 3.0) return GlShaderObjectHandle.aSystemFontGlyphs_521
                if (MapRegionLoader.aFloat1247.toDouble() == 4.0) return HeapDiagnosticsHolder.aSystemFontGlyphs_2252
                if (MapRegionLoader.aFloat1247.toDouble() == 6.0) return PingHostListHolder.aSystemFontGlyphs_2333
                if (MapRegionLoader.aFloat1247.toDouble() >= 8.0) return GlBufferObject.aSystemFontGlyphs_4754
            } else if (i == 2) {
                if (MapRegionLoader.aFloat1247.toDouble() == 3.0) return PingHostListHolder.aSystemFontGlyphs_2333
                if (MapRegionLoader.aFloat1247.toDouble() == 4.0) return GlBufferObject.aSystemFontGlyphs_4754
                if (MapRegionLoader.aFloat1247.toDouble() == 6.0) return ModelVertexColorBuffer.aSystemFontGlyphs_6581
                if (MapRegionLoader.aFloat1247.toDouble() >= 8.0) return WorldMapRenderer.aSystemFontGlyphs_4672
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
                SolidFillComponent.method223(i_5_, i_6_, i_3_, i, 47.toByte())
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
                    WidgetDefinition.anIntArrayArray255!![i_19_]!![i_13_] = i_6_
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
                    WidgetDefinition.anIntArrayArray255!![i_13_]!![i_18_] = i_6_
                    if (i_16_ > 0) {
                        i_13_ += i_17_
                        i_16_ -= i_14_
                    }
                }
            }
        }

        @JvmStatic
        fun method1785(i: Int) {
            aInboundPacketHeader_5997 = null
            if (i != 8) aInboundPacketHeader_5997 = null
        }

        @JvmStatic
        fun method1787(i: Int, i_22_: Int) {
            anInt6002++
            val class348_sub42_sub15 = NamedTimedNode.method2516(i, 105.toByte(), i_22_) //8
            class348_sub42_sub15.method3251(-16058)
        }
        var anInt6637: Int = 2
    }
}
