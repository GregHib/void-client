import WaterMaterialPassStatics.method2148

object ModelOrSpriteHolderStatics {
    @JvmField
            var anInt116: Int = 0
            @JvmField
            var aTextureDefinitionLoader_117: TextureDefinitionLoader? = null
            @JvmField
            var anInt120: Int = 0
            @JvmField
            var anInt121: Int = 0
            @JvmField
            var anInt122: Int = 0
    
            @JvmStatic
            fun method170(bool: Boolean): MapLabelMenuEntry? {
                if (bool != true) method174(-106, -36)
                anInt122++
                if (WidgetActionEntryStatics.anInt6985 < WorldMapImageBuilderStatics.aClass110_Sub1Array1146!!.size) return WorldMapImageBuilderStatics.aClass110_Sub1Array1146!![WidgetActionEntryStatics.anInt6985++]
                return null
            }
    
            @JvmStatic
            fun method171(i: Byte) {
                aTextureDefinitionLoader_117 = null
                if (i.toInt() != 72) method173(39, null, null)
            }
    
            fun method172(i: Int, js5Archive: Js5Archive?) {
                if (i != 30284) method170(true)
                anInt116++
                CachedRgbNoiseTextureStatics.aJs5Archive_8670 = js5Archive
            }
    
            @JvmStatic
            fun method173(i: Int, widgetComponent: WidgetComponent?, widgetComponent_0_: WidgetComponent?) {
                try {
                    anInt120++
                    TerrainShadowBuilderGl3Statics.anInt7009++
                    val class348_sub47 = method2148(CustomCursorsOptionStateStatics.aFontMetaRef_5934, TheoraVideoStreamStatics.aIsaacCipher_9029, -104)
                    class348_sub47.aClass348_Sub49_Sub2_7116!!.writeInt(112.toByte(), widgetComponent!!.anInt830)
                    class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShortLittle(widgetComponent_0_!!.anInt704, 3.toByte())
                    class348_sub47.aClass348_Sub49_Sub2_7116!!.writeIntMiddle(widgetComponent_0_.anInt830, 44.toByte())
                    class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShort(107.toByte(), widgetComponent_0_.anInt812)
                    class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShortAddLittle(4325, widgetComponent.anInt704)
                    class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShortAddLittle(4325, widgetComponent.anInt812)
                    if (i > -50) aTextureDefinitionLoader_117 = null
                    InterfaceComponentGroupStatics.method3243(-100, class348_sub47)
                } catch (runtimeexception: RuntimeException) {
                    throw SoundBankPatchStatics.method2929(runtimeexception, ("ak.E(" + i + ',' + (if (widgetComponent != null) "{...}" else "null") + ',' + (if (widgetComponent_0_ != null) "{...}" else "null") + ')'))
                }
            }
    
            @JvmStatic
            fun method174(i: Int, i_1_: Int) {
                if (i_1_ != -30742) aTextureDefinitionLoader_117 = null
                anInt121++
                SoundCacheState.aLruByteCache_4139!!.method578(2, i)
            }
}
