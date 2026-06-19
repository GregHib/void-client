object ChatEffectsOptionStateStatics {
    @JvmField
            var anInt5858: Int = 0
            @JvmField
            var anInt5859: Int = 0
            @JvmField
            var anInt5860: Int = 0
            @JvmField
            var anInt5861: Int = 0
            @JvmField
            var anInt5862: Int = 0
            @JvmField
            var anInt5863: Int = 0
            @JvmField
            var anInt5864: Int = 0
            @JvmField
            var anInt5865: Int = 0
            @JvmField
            var anInt5866: Int = 0
            @JvmField
            var anInt5867: Int = 0
            @JvmField
            var anInt5868: Int = 0
            @JvmField
            var anInt5869: Int = 0
            @JvmField
            var anInt5870: Int = 0
            @JvmField
            var anInt5871: Int = 0
    
            @JvmStatic
            fun method1728(i: Int, i_2_: Int, i_3_: Int, bool: Boolean, i_4_: Int) {
                anInt5860++
                if (TextureLoaderUtil.method2547(i_3_, 84.toByte())) NullRenderPassStatics.method3534(false, i_2_, i_4_, bool, i, (WarpTextureNodeStatics.aWidgetComponentArrayArray9427!![i_3_]!!))
            }
    
            @JvmStatic
            fun method1730(i: Int, i_5_: Int, i_6_: Int, i_7_: Int, i_8_: Int, i_9_: Int, i_10_: Int, i_11_: Int) {
                if (i_10_ != -128) method1730(-6, -95, 101, -81, 56, 14, -29, -19)
                anInt5868++
                val i_12_ = -i_9_ + i_5_
                val i_13_ = i_9_ + i_6_
                for (i_14_ in i_6_..<i_13_) GlElementArrayBufferStatics.method1156(-27, i_7_, WidgetDefinitionStatics.anIntArrayArray255!![i_14_]!!, i_11_, i)
                val i_15_ = i_7_ + -i_9_
                val i_16_ = i_9_ + i_11_
                var i_17_ = i_5_
                while (i_12_ < i_17_) {
                    GlElementArrayBufferStatics.method1156(i_10_ + 101, i_7_, WidgetDefinitionStatics.anIntArrayArray255!![i_17_]!!, i_11_, i)
                    i_17_--
                }
                for (i_18_ in i_13_..i_12_) {
                    val `is` = WidgetDefinitionStatics.anIntArrayArray255!![i_18_]!!
                    GlElementArrayBufferStatics.method1156(-27, i_16_, `is`, i_11_, i)
                    GlElementArrayBufferStatics.method1156(-27, i_15_, `is`, i_16_, i_8_)
                    GlElementArrayBufferStatics.method1156(-27, i_7_, `is`, i_15_, i)
                }
            }
    
            @JvmStatic
            fun method1731(i: Int) {
                anInt5863++
                val class348_sub45 = (GroundDecorEntityStatics.aNodeDeque_8744!!.method1995(i xor 0x5) as TimedRecordAccessor?)
                val bool = (RegionSceneLoader.aWidgetComponent_3701 != null || HashLinkedListNodeStatics.anInt7059 > 0)
                val i_19_ = class348_sub45!!.method3308((-128).toByte())
                val i_20_ = class348_sub45.method3311(119)
                if (bool) NpcEntityUpdater.anInt3655 = 1
                if (!bool) SpriteMaskShapeStatics.method2599(109.toByte(), IntHashSetStatics.aClass348_Sub42_Sub12_3963, i_20_, i_19_)
                else RectangleRegionStatics.aClass348_Sub42_Sub12_1946 = IntHashSetStatics.aClass348_Sub42_Sub12_3963
                if (i != 1) method1734(-88, null, (-126).toByte(), false)
            }
    
            @JvmStatic
            fun method1732(i: Byte, i_21_: Int): Boolean {
                anInt5865++
                val i_22_ = i.toInt() and 0xff
                if (i_22_ == 0) return false
                return i_21_ < (i_22_.inv()) || i_22_ >= 160 || MapSceneRenderer.aCharArray625!![i_22_ + -128].code != 0
            }
    
            @JvmStatic
            fun method1733(i: Byte, i_23_: Int) {
                anInt5870++
                if (i.toInt() != -78) method1732(80.toByte(), -38)
                val class348_sub42_sub15 = NamedTimedNodeStatics.method2516(i_23_, 105.toByte(), 11)
                class348_sub42_sub15.method3251(-16058)
            }
    
            fun method1734(i: Int, var_renderer: Renderer?, i_25_: Byte, bool: Boolean): RenderableEntry? {
                try {
                    anInt5859++
                    if (i == -1) return null
                    if (AbstractTileShapeStatics.anIntArray6547 != null) {
                        for (i_26_ in AbstractTileShapeStatics.anIntArray6547!!.indices) {
                            if (AbstractTileShapeStatics.anIntArray6547!![i_26_] == i) return LoadingScreenStateStatics.aRenderableEntryArray2636!![i_26_]
                        }
                    }
                    var renderableEntry = SoundCacheState.aLruByteCache_4139!!.method583(i.toLong(), -92) as? RenderableEntry?
                    if (renderableEntry != null) {
                        if (bool && renderableEntry.aFontDefinition_4333 == null) {
                            val class143 = RangedGraphicsOptionStateStatics.method1766((-76).toByte(), i, TerrainTileStatics.aJs5Archive_4585!!)
                            if (class143 == null) return null
                            renderableEntry.aFontDefinition_4333 = class143
                        }
                        return renderableEntry
                    }
                    val i_27_ = -118 / ((-33 - i_25_) / 44)
                    val spriteImages = SpriteImageStatics.method1523(GlShaderObjectHandleStatics.aJs5Archive_518!!, i)
                    if (spriteImages == null) return null
                    val class143 = RangedGraphicsOptionStateStatics.method1766((-39).toByte(), i, TerrainTileStatics.aJs5Archive_4585!!)
                    if (class143 == null) return null
                    if (!bool) renderableEntry = RenderableEntry(var_renderer!!.method3686(class143, spriteImages, true))
                    else renderableEntry = RenderableEntry(var_renderer!!.method3686(class143, spriteImages, true), class143)
                    SoundCacheState.aLruByteCache_4139!!.method582(renderableEntry, i.toLong(), (-109).toByte())
                    return renderableEntry
                } catch (runtimeexception: RuntimeException) {
                    throw SoundBankPatchStatics.method2929(runtimeexception, ("jaa.K(" + i + ',' + (if (var_renderer != null) "{...}" else "null") + ',' + i_25_ + ',' + bool + ')'))
                }
            }
}
