import MinimapFlagRenderer.method1083
import GlFramebufferBlitter.Companion.method282
import MapRegionLoader.Companion.method749

/* Class348_Sub42_Sub3 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class LoadingScreenImageNode internal constructor(var aByteArray9499: ByteArray?) : HashLinkedListNode() {
    companion object {
        @JvmField
        var aBoolean9498: Boolean = false
        var anInt9500: Int = 0
        @JvmField
        var anInt9501: Int
        @JvmField
        var aShortArray9502: ShortArray?
        var aInboundPacketHeader_9503: InboundPacketHeader?
        @JvmField
        var anInt9504: Int = 0
        var anIntArray9505: IntArray? = IntArray(3)
        var anInt9506: Int = 0
        var anInt9507: Int = 0
        var anInt9508: Int = 0

        fun method3174(i: Int, i_0_: Int, i_1_: Int, bool: Boolean, i_2_: Byte, i_3_: Int) {
            var i = i
            var i_0_ = i_0_
            var i_1_ = i_1_
            var i_3_ = i_3_
            if (i_1_ < 1) i_1_ = 1
            anInt9507++
            if (i_3_ < 1) i_3_ = 1
            var i_4_ = i_3_ - 334
            if (i_4_ < 0) i_4_ = 0
            else if (i_4_ > 100) i_4_ = 100
            var i_5_ = ((-AbstractMenuEntryStatics.aShort1700 + HeapDiagnosticsHolder.aShort2250) * i_4_ / 100 + AbstractMenuEntryStatics.aShort1700)
            if (i_5_ < ChatCommandProcessor.aShort9555) i_5_ = ChatCommandProcessor.aShort9555.toInt()
            else if (ColourAdjustment.aShort851 < i_5_) i_5_ = ColourAdjustment.aShort851.toInt()
            var i_6_ = 512 * i_5_ * i_3_ / (i_1_ * 334)
            if (i_6_ >= FixedFunctionWaterPass.aShort7355) {
                if (i_6_ > RefCountedHandle.aShort2269) {
                    i_6_ = RefCountedHandle.aShort2269.toInt()
                    i_5_ = i_1_ * i_6_ * 334 / (i_3_ * 512)
                    if (i_5_ < ChatCommandProcessor.aShort9555) {
                        i_5_ = ChatCommandProcessor.aShort9555.toInt()
                        val i_7_ = i_6_ * (i_1_ * 334) / (i_5_ * 512)
                        val i_8_ = (-i_7_ + i_3_) / 2
                        if (bool) {
                            FacingDirectionNode.aRenderer6654!!.la()
                            FacingDirectionNode.aRenderer6654!!.method3675(i_1_, (-125).toByte(), i, i_0_, i_8_, -16777216)
                            FacingDirectionNode.aRenderer6654!!.method3675(i_1_, (-125).toByte(), i, i_3_ + i_0_ - i_8_, i_8_, -16777216)
                        }
                        i_0_ += i_8_
                        i_3_ -= 2 * i_8_
                    }
                }
            } else {
                i_6_ = FixedFunctionWaterPass.aShort7355.toInt()
                i_5_ = i_6_ * (i_1_ * 334) / (i_3_ * 512)
                if (ColourAdjustment.aShort851 < i_5_) {
                    i_5_ = ColourAdjustment.aShort851.toInt()
                    val i_9_ = i_5_ * i_3_ * 512 / (334 * i_6_)
                    val i_10_ = (i_1_ + -i_9_) / 2
                    if (bool) {
                        FacingDirectionNode.aRenderer6654!!.la()
                        FacingDirectionNode.aRenderer6654!!.method3675(i_10_, (-125).toByte(), i, i_0_, i_3_, -16777216)
                        FacingDirectionNode.aRenderer6654!!.method3675(i_10_, (-125).toByte(), -i_10_ + i + i_1_, i_0_, i_3_, -16777216)
                    }
                    i += i_10_
                    i_1_ -= i_10_ * 2
                }
            }
            TerrainChunkBuilder.anInt1550 = i_3_ * i_5_ / 334
            RandomAccessFileOnDisk.anInt3047 = i_0_
            GroundDecorRenderer.anInt3643 = i_3_.toShort().toInt()
            WidgetComponentNode.anInt4656 = i_1_.toShort().toInt()
            LocalizedTextTriple.anInt3764 = i
            val i_11_ = -3 % ((-8 - i_2_) / 56)
        }

        @JvmStatic
        fun method3176(bool: Boolean) {
            anIntArray9505 = null
            aShortArray9502 = null
            if (bool != true) aShortArray9502 = null
            aInboundPacketHeader_9503 = null
        }

        @JvmStatic
        fun method3177(i: Int, bool: Boolean) {
            if (!bool || MapRegionLoader.aClass348_Sub42_Sub14_1243 == null) GroundDecorOptionState.anInt5976 = -1
            else GroundDecorOptionState.anInt5976 = (MapRegionLoader.aClass348_Sub42_Sub14_1243!!.anInt9628)
            anInt9500++
            MapRegionLoader.aClass348_Sub42_Sub14_1243 = null
            HeapDiagnosticsHolder.aWidgetComponent_2249 = null
            LinkedListNodeStatics.anInt4290 = 0
            RegionSceneLoader.aNodeDeque_3705 = null
            method749()
            MapRegionLoader.aNodeDeque_1254!!.method1996(127)
            GlBufferObject.aSystemFontGlyphs_4754 = null
            HeapDiagnosticsHolder.aSystemFontGlyphs_2252 = null
            TooltipComponentRenderer.aAbstractModelRenderer_4643 = null
            MinimapSpriteRenderer.aSystemFontGlyphs_4921 = null
            PingHostListHolder.aSystemFontGlyphs_2333 = null
            ModelVertexColorBuffer.aSystemFontGlyphs_6581 = null
            GlShaderObjectHandle.aSystemFontGlyphs_521 = null
            MapRegionLoader.aSmoothingBuffer_1246 = null
            GlRectangleTexture.aSystemFontGlyphs_8644 = null
            ColourAdjustment.anInt859 = -1
            if (i <= -44) {
                TextureMetadataProvider.anInt4609 = -1
                WorldMapRenderer.aSystemFontGlyphs_4672 = null
                if (MapRegionLoader.aConfigDefinitionLoader_1238 != null) {
                    MapRegionLoader.aConfigDefinitionLoader_1238!!.method1219(7851)
                    MapRegionLoader.aConfigDefinitionLoader_1238!!.method1220((-100).toByte(), 64, 128)
                }
                if (MapRegionLoader.aTextureDefinitionLoader_1242 != null) MapRegionLoader.aTextureDefinitionLoader_1242!!.method1178(64, 1, 64)
                if (MapRegionLoader.aSeqDefinitionCache_1245 != null) MapRegionLoader.aSeqDefinitionCache_1245!!.method2014(64, true)
                RenderConfigFactory.aVarbitDefLoader_2981!!.method1444(64, -124)
            }
        }

        fun method3178(js5Archive: Js5Archive?, i: Int, `is`: IntArray?, js5Archive_15_: Js5Archive?) {
            try {
                anInt9506++
                if (`is` != null) AbstractTileShapeStatics.anIntArray6547 = `is`
                TerrainTileStatics.aJs5Archive_4585 = js5Archive
                if (i >= -6) method3177(-36, true)
                GlShaderObjectHandle.aJs5Archive_518 = js5Archive_15_
            } catch (runtimeexception: RuntimeException) {
                throw TextureLoadException.method2929(runtimeexception, ("lk.F(" + (if (js5Archive != null) "{...}" else "null") + ',' + i + ',' + (if (`is` != null) "{...}" else "null") + ',' + (if (js5Archive_15_ != null) "{...}" else "null") + ')'))
            }
        }

        fun method3179(i: Int) {
            CacheStateResetter.method175((-50).toByte())
            anInt9508++
            val i_16_ = IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub3_7222!!.method1727(-32350)
            do {
                if (i_16_ == 2) {
                    method1083(FacingDirectionNode.aRenderer6654, 100, 9.toByte(), GameDisplayManager.anInt10432, 100, LocTypeDefinition.anInt4017)
                    break
                } else if (i_16_ != 3) break
                method282(2, FacingDirectionNode.aRenderer6654, LocTypeDefinition.anInt4017, 73.toByte(), Js5Archive.anInt666, PerlinTextureProvider.anInt5812, GameDisplayManager.anInt10432, 2)
            } while (false)
            if (IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub3_7222!!.method1735(false)) TerrainTileStatics.method3980(i + 93, ParticleSystemRenderer.aCanvas3869!!)
            if (FacingDirectionNode.aRenderer6654 != null) BufferToggleState.method2196((-9).toByte())
            ParticleSystemRenderer.aBoolean3870 = i != IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub3_7222!!.method1727(-32350)
            GrayscaleNoiseTexture.aBoolean5300 = IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub3_7222!!.method1735(false)
        }

        init {
            anInt9501 = 0
            aShortArray9502 = ShortArray(256)
            aInboundPacketHeader_9503 = InboundPacketHeader(9, -1)
        }
    }
}
