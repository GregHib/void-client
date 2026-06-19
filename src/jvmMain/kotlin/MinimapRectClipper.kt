import GlslMaterialPassStatics.method2154

/*
 * Class13
 */
object MinimapRectClipper {
    @JvmField
    var anInt219: Int = 0
    @JvmField
    var aIntRange_220: IntRange? = IntRange(40, -1)
    @JvmField
    var anInt221: Int = 0
    @JvmField
    var anIntArray222: IntArray?
    @JvmField
    var aClass314_Sub1Array223: Array<ArchiveResourceProvider?>? = arrayOfNulls<ArchiveResourceProvider>(37)
    @JvmField
    var anIntArray224: IntArray?

    @JvmStatic
    fun method225(i: Byte) {
        if (i > 54) {
            aIntRange_220 = null
            anIntArray224 = null
            anIntArray222 = null
            aClass314_Sub1Array223 = null
        }
    }

    @JvmStatic
    fun method226(i: Int, i_0_: Int, i_1_: Int, i_2_: Int, i_3_: Int) {
        var i_4_ = i_2_
        while (TerrainShadowBuilderGl3Statics.anInt7008 > i_4_) {
            val rectangle = HintIconState.aRectangleArray2371!![i_4_]!!
            if (i < rectangle.width + rectangle.x && i_0_ + i > rectangle.x && (i_1_ < rectangle.y - -rectangle.height) && rectangle.y < i_1_ + i_3_) GzipDecompressorStatics.aBooleanArray2076!![i_4_] = true
            i_4_++
        }
        anInt219++
        MapTileShapeStatics.method2663(i_2_ + -5590, i, i - -i_0_, i_1_, i_3_ + i_1_)
    }

    @JvmStatic
    fun method227(class318_sub1: SceneEntity, bool: Boolean, bool_5_: Boolean) {
        class318_sub1.aBoolean6391 = bool_5_
        if (VoronoiNoiseTextureNodeStatics.aBoolean9121) {
            if (bool) MapElementDefinitionCacheStatics.aCacheIndexManagerArray3982!![MapElementDefinitionCacheStatics.aCacheIndexManagerArray3982!!.size - 1]!!.method2353(class318_sub1, false)
            else {
                val i = method2154(class318_sub1.anInt6386)
                val i_6_ = (RsaVarbitHandlerStatics.anIntArray4906!![2] * class318_sub1.method2379(-25675) / class318_sub1.anInt6389)
                val i_7_ = method2154((class318_sub1.anInt6386) - i_6_)
                val i_8_ = method2154((class318_sub1.anInt6386) + i_6_)
                if (i_7_ == i_8_) MapElementDefinitionCacheStatics.aCacheIndexManagerArray3982!![i]!!.method2353(class318_sub1, false)
                else if (i_8_ - i_7_ == 1) MapElementDefinitionCacheStatics.aCacheIndexManagerArray3982!![ActiveMapRegion.anInt5652 + i_7_]!!.method2353(class318_sub1, false)
                else MapElementDefinitionCacheStatics.aCacheIndexManagerArray3982!![MapElementDefinitionCacheStatics.aCacheIndexManagerArray3982!!.size - 1]!!.method2353(class318_sub1, false)
            }
        } else WidgetTextConfigStatics.method365(class318_sub1, OverlayColorTable.aClass348_Sub1Array1752)
    }

    init {
        anIntArray222 = IntArray(3)
        anIntArray224 = IntArray(250)
    }
}
