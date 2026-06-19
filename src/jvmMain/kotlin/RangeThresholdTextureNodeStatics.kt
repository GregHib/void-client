object RangeThresholdTextureNodeStatics {
    @JvmField
            var anInt9102: Int = 0
            @JvmField
            var aBoolean9103: Boolean = false
            @JvmField
            var anInt9105: Int = 0
            @JvmField
            var anInt9106: Int = 0
            @JvmField
            var anInt9108: Int = 0
            @JvmField
            var anInt9109: Int = 104
            @JvmField
            var anInt9110: Int = 0
    
            fun method3054(bool: Boolean, i: Int, i_2_: Int) {
                anInt9105++
                if (i_2_ < -127) {
                    val class348_sub13 = GlTexture1DStatics.method1974((-122).toByte(), i, bool)
                    if (class348_sub13 != null) class348_sub13.method2715(97.toByte())
                }
            }
    
            @JvmStatic
            fun method3055(i: Int, textureFormatInfo: TextureFormatInfo?): Int {
                anInt9106++
                if (i < 94) method3054(false, -98, -116)
                if (textureFormatInfo != TimedRecordAccessorStatics.aTextureFormatInfo_7103) {
                    if (GroundItemRenderState.aTextureFormatInfo_1662 == textureFormatInfo) return 6408
                    if (textureFormatInfo == ClampTextureNodeStatics.aTextureFormatInfo_9471) return 6406
                    if (CellNoiseTextureNodeStatics.aTextureFormatInfo_9303 != textureFormatInfo) {
                        if (textureFormatInfo == SpriteSheetCacheStatics.aTextureFormatInfo_2571) return 6410
                        if (textureFormatInfo == SceneLinkedListNodeStatics.aTextureFormatInfo_3977) return 6145
                    } else return 6409
                } else return 6407
                throw IllegalStateException()
            }
    
            @JvmStatic
            fun method3056(i: Int, i_7_: Int, i_8_: Int): Boolean {
                if (i < 0) anInt9109 = 114
                anInt9108++
                return (0x22 and i_7_) != 0
            }
}
