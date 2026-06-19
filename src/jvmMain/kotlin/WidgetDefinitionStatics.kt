object WidgetDefinitionStatics {
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
            var aIntRange_250: IntRange? = IntRange(4, 1)
            @JvmField
            var anSpriteDrawTarget_252: SpriteDrawTarget? = null
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
                aIntRange_250 = null
                anIntArrayArray255 = null
                if (bool != false) method268(-22, -54, -101, -115, -107, 90, 13, -47)
                anSpriteDrawTarget_252 = null
            }
    
            @JvmStatic
            fun method268(i: Int, i_36_: Int, i_37_: Int, i_38_: Int, i_39_: Int, i_40_: Int, i_41_: Int, i_42_: Int) {
                var i_42_ = i_42_
                anInt259++
                var i_43_ = -334 + i_39_
                if (i_43_ < 0) i_43_ = 0
                else if (i_43_ > 100) i_43_ = 100
                val i_44_ = (i_43_ * (-NullOggStreamStatics.aShort9044 + TextureLoaderUtil.aShort3992) / 100 + NullOggStreamStatics.aShort9044)
                i_42_ = i_42_ * i_44_ shr 8
                LocalPlayerState.anInt1906 = LocalPlayerState.anInt1911 * i_44_ shr 8
                val i_45_ = 16384 - i and 0x3fff
                val i_46_ = 0x3fff and 16384 - i_37_
                if (i_40_ != -19360) anSpriteDrawTarget_252 = null
                var i_47_ = 0
                var i_48_ = 0
                var i_49_ = i_42_
                if (i_45_ != 0) {
                    i_48_ = -i_49_ * TrigLookupTablesStatics.anIntArray1207!![i_45_] shr 14
                    i_49_ = TrigLookupTablesStatics.anIntArray1204!![i_45_] * i_49_ shr 14
                }
                if (i_46_ != 0) {
                    i_47_ = TrigLookupTablesStatics.anIntArray1207!![i_46_] * i_49_ shr 14
                    i_49_ = i_49_ * TrigLookupTablesStatics.anIntArray1204!![i_46_] shr 14
                }
                WorldMapElementStatics.anInt4638 = i_37_
                MapTileShapeStatics.anInt4186 = 0
                CompositeRgbNoiseTextureStatics.anInt8685 = i_38_ - i_49_
                ParticleSystemRendererStatics.anInt3855 = -i_48_ + i_36_
                GlslMaterialPassStatics.anInt6246 = -i_47_ + i_41_
                MinimapAreaMarkerNodeStatics.anInt9701 = i
            }
}
