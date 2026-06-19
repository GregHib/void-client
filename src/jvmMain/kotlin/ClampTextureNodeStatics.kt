import kotlin.math.min

object ClampTextureNodeStatics {
    @JvmField
            var anInt9468: Int = 0
            @JvmField
            var anInt9469: Int = 0
            @JvmField
            var aTextureFormatInfo_9471: TextureFormatInfo? = TextureFormatInfo(1)
            @JvmField
            var anInt9472: Int = 0
            @JvmField
            var anInt9473: Int = 0
            @JvmField
            var aRgbColorPalette_9475: RgbColorPalette? = RgbColorPalette(12, 7)
            @JvmField
            var anInt9476: Int = 0
            var aConfigFlagUtil_9477: ConfigFlagUtil? = ConfigFlagUtil()
            @JvmField
            var aNodeDeque_9478: NodeDeque? = NodeDeque()
            @JvmField
            var anInt9479: Int = 0
            @JvmField
            var anIntArray9480: IntArray? = IntArray(13)
    
            @JvmStatic
            fun method3149(i: Int) {
                aRgbColorPalette_9475 = null
                anIntArray9480 = null
                aTextureFormatInfo_9471 = null
                aConfigFlagUtil_9477 = null
                aNodeDeque_9478 = null
                if (i < 32) method3149(58)
            }
    
            @JvmStatic
            fun method3150(bool: Boolean) {
                anInt9469++
                var i = 0
                if (bool != true) method3150(false)
                while ( /**/ModelDefinitionLoaderStatics.anInt2057 > i) {
                    val i_14_ = RgbColorPaletteStatics.anIntArray1233!![i]
                    val class348_sub22 = (NpcEntityUpdater.aHashtable_3654!!.method3480(i_14_.toLong(), -6008) as NpcReference?)
                    if (class348_sub22 != null) {
                        val npc = (class348_sub22.aNpc_6859)!!
                        ImageFrameCacheStatics.method2556(false, npc.aNpcType_10505!!.anInt1399, npc)
                    }
                    i++
                }
            }
}
