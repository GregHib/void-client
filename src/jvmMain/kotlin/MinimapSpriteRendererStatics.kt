import MinimapFlagRenderer.method1084

object MinimapSpriteRendererStatics {
    @JvmField
            var aHashtable_4915: Hashtable?
            @JvmField
            var anInt4916: Int = 0
            var anInt4919: Int = 0
            @JvmField
            var aSystemFontGlyphs_4921: SystemFontGlyphs? = null
            @JvmField
            var anInt4926: Int = 0
            @JvmField
            var anInt4927: Int = 0
            @JvmField
            var anInt4930: Int = 0
    
            @JvmStatic
            fun method1109(i: Byte) {
                aSystemFontGlyphs_4921 = null
                if (i.toInt() != -22) method1111(127, -73, -7, -77, -85, 79)
                aHashtable_4915 = null
            }
    
            fun method1110(i: Int, i_0_: Int, i_1_: Int, i_2_: Byte, i_3_: Int): Boolean {
                anInt4916++
                if (!TurbulenceTextureNodeStatics.aBoolean9307 || !SkeletalAnimFrameDataStatics.aBoolean351) return false
                if (NpcDefinitionStatics.anInt2946 < 100) return false
                if (!IndexedSpriteStatics.method164(i_1_, i_3_, (-97).toByte(), i)) return false
                val i_4_ = i_3_ shl Tooltip.anInt4459
                val i_5_ = i shl Tooltip.anInt4459
                if (i_2_.toInt() != -79) anInt4919 = 64
                if (method1084(i_0_, ArchiveFileConditionWrapperStatics.anInt3465, i_5_, i_4_, NativeSpriteStatics.aTerrainTileArray5191!![i_1_]!!.method3982((-86).toByte(), i, i_3_), ArchiveFileConditionWrapperStatics.anInt3465, 18507)) {
                    SourceRowTextureNodeStatics.anInt9112++
                    return true
                }
                return false
            }
    
            fun method1111(i: Int, i_6_: Int, i_7_: Int, i_8_: Int, i_9_: Int, i_10_: Int) {
                var i_11_ = i_9_
                while (i >= i_11_) {
                    GlElementArrayBufferStatics.method1156(-27, i_7_, WidgetDefinitionStatics.anIntArrayArray255!![i_11_]!!, i_8_, i_10_)
                    i_11_++
                }
                if (i_6_ != 0) anInt4930 = 29
                anInt4926++
            }
    
            init {
                aHashtable_4915 = Hashtable(8)
            }
}
