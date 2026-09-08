import kotlin.jvm.JvmStatic
object AbstractCameraTransformStatics {


    var anIntArray1593: IntArray? = IntArray(1)

    var anInt1594: Int = 0

    var anInt1595: Int = 0

    var anInt1596: Int = 0

    var anInt1597: Int = 0

    var anInt1598: Int = 0

    var anInt1599: Int = 0

    @JvmStatic
    fun method893(i: Byte) {
        CellNoiseTextureNode.method3111(91, IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub6_7226!!.method1743(-32350))
        anInt1595++
        val i_4_ = ((GlslMaterialPass.anInt6246 shr 12) - -(ArbVertexProgram.regionTileX shr 3))
        val i_5_ = ((RegionMapDecoder.regionTileY shr 3) + (CompositeRgbNoiseTexture.anInt8685 shr 12))
        LocalPlayerState.aPlayer_1907!!.plane = 0.toByte()
        QuickChatMenuTypeList.anInt4372 = LocalPlayerState.aPlayer_1907!!.plane.toInt()
        LocalPlayerState.aPlayer_1907!!.method2449(8, 8, 118.toByte())
        if (i.toInt() != -49) anInt1597 = 115
        var i_6_ = 18
        AbstractCameraTransformStatics.anIntArray4031 = IntArray(i_6_)
        StringCacheNode.aByteArrayArray7212 = arrayOfNulls<ByteArray>(i_6_)
        BrightnessOptionState.anIntArrayArray5894 = Array<IntArray?>(i_6_) { IntArray(4) }
        NativeSprite.anIntArray5192 = IntArray(i_6_)
        GlRectangleTexture.aByteArrayArray8642 = arrayOfNulls<ByteArray>(i_6_)
        NullOggStream.anIntArray9042 = IntArray(i_6_)
        RenderNodeStatics.anIntArray9724 = IntArray(i_6_)
        LocalizedTextTriple.anIntArray3759 = IntArray(i_6_)
        DragDropController.aByteArrayArray4281 = arrayOfNulls<ByteArray>(i_6_)
        GameAppletFrame.anIntArray38 = IntArray(i_6_)
        VorbisOggDecoder.aByteArrayArray8996 = arrayOfNulls<ByteArray>(i_6_)
        RegionMapDecoder.aByteArrayArray1887 = arrayOfNulls<ByteArray>(i_6_)
        i_6_ = 0
        var i_7_ = (i_4_ + -(GlCubemapLightPass.anInt7319 shr 4)) / 8
        while ((i_4_ - -(GlCubemapLightPass.anInt7319 shr 4)) / 8 >= i_7_) {
            var i_8_ = (-(RangeThresholdTextureNode.anInt9109 shr 4) + i_5_) / 8
            while (((i_5_ + (RangeThresholdTextureNode.anInt9109 shr 4)) / 8 >= i_8_)) {
                val i_9_ = i_8_ + (i_7_ shl 8)
                NullOggStream.anIntArray9042!![i_6_] = i_9_
                NativeSprite.anIntArray5192!![i_6_] = maps!!.method417("m" + i_7_ + "_" + i_8_, i + 49)
                GameAppletFrame.anIntArray38!![i_6_] = maps!!.method417("l" + i_7_ + "_" + i_8_, 0)
                AbstractCameraTransformStatics.anIntArray4031!![i_6_] = maps!!.method417("n" + i_7_ + "_" + i_8_, 0)
                LocalizedTextTriple.anIntArray3759!![i_6_] = maps!!.method417("um" + i_7_ + "_" + i_8_, 0)
                RenderNodeStatics.anIntArray9724!![i_6_] = (maps!!.method417("ul" + i_7_ + "_" + i_8_, ModelDefinition.method2955(i.toInt(), -49)))
                if (AbstractCameraTransformStatics.anIntArray4031!![i_6_] == -1) {
                    NativeSprite.anIntArray5192!![i_6_] = -1
                    GameAppletFrame.anIntArray38!![i_6_] = -1
                    LocalizedTextTriple.anIntArray3759!![i_6_] = -1
                    RenderNodeStatics.anIntArray9724!![i_6_] = -1
                }
                i_6_++
                i_8_++
            }
            i_7_++
        }
        var i_10_ = i_6_
        while (AbstractCameraTransformStatics.anIntArray4031!!.size > i_10_) {
            AbstractCameraTransformStatics.anIntArray4031!![i_10_] = -1
            NativeSprite.anIntArray5192!![i_10_] = -1
            GameAppletFrame.anIntArray38!![i_10_] = -1
            LocalizedTextTriple.anIntArray3759!![i_10_] = -1
            RenderNodeStatics.anIntArray9724!![i_10_] = -1
            i_10_++
        }
        val i_11_: Int
        if (WorldMapRenderer.anInt4674 != 3) i_11_ = 8
        else i_11_ = 4
        RegionSceneShifter.method3157(i_5_, 123.toByte(), i_4_, i_11_, false)
    }
    var anIntArray4031: IntArray? = null

    @JvmStatic
    fun method2555(i: Byte) {
        AbstractCameraTransformStatics.anIntArray4031 = null
        InboundPacketHeader.aInboundPacketHeader_4027 = null
        ChatCommandProcessor.aCacheLruCache_4036 = null
    }

    @JvmStatic
    fun method901(abstractModelRenderers: Array<AbstractModelRenderer?>?, i: Int) {
        try {
            anInt1599++
            FlickeringGraphicsOptionState.anInt5850 = abstractModelRenderers!!.size
            SizeBoundedSoftCache.anIntArray2330 = IntArray(FlickeringGraphicsOptionState.anInt5850 + 10)
            TileRenderState.aAbstractModelRendererArray4234 = arrayOfNulls<AbstractModelRenderer>(FlickeringGraphicsOptionState.anInt5850 + 10)
            ArrayCopyUtil.method1575(abstractModelRenderers, 0, TileRenderState.aAbstractModelRendererArray4234!!, 0, FlickeringGraphicsOptionState.anInt5850)
            var i_17_ = 0
            while (FlickeringGraphicsOptionState.anInt5850 > i_17_) {
                SizeBoundedSoftCache.anIntArray2330!![i_17_] = TileRenderState.aAbstractModelRendererArray4234!![i_17_]!!.method980()
                i_17_++
            }
            if (i != 515880227) anInt1597 = 49
            var i_18_ = FlickeringGraphicsOptionState.anInt5850
            while ((i_18_ < TileRenderState.aAbstractModelRendererArray4234!!.size)) {
                SizeBoundedSoftCache.anIntArray2330!![i_18_] = 12
                i_18_++
            }
        } catch (runtimeexception: RuntimeException) {
            throw TextureLoadException.method2929(runtimeexception, ("bca.RA(" + (if (abstractModelRenderers != null) "{...}" else "null") + ',' + i + ')'))
        }
    }

    @JvmStatic
    fun method904(i: Int, var_ha_Sub2: OpenGlRenderer?, i_24_: Int, i_25_: Int, i_26_: Int): GlTexture2DRegion {
        try {
            anInt1594++
            if (i <= 42) method906(123)
            if (var_ha_Sub2!!.aBoolean7793 || (ModelDefinition.method1436(82, i_25_) && ModelDefinition.method1436(81, i_26_))) return GlTexture2DRegion(var_ha_Sub2, 3553, i_24_, i_25_, i_26_)
            if (var_ha_Sub2.aBoolean7837) return GlTexture2DRegion(var_ha_Sub2, 34037, i_24_, i_25_, i_26_)
            return GlTexture2DRegion(var_ha_Sub2, i_24_, i_25_, i_26_, EnumTypeList.method340(i_25_, 108.toByte()), EnumTypeList.method340(i_26_, 108.toByte()))
        } catch (runtimeexception: RuntimeException) {
            throw TextureLoadException.method2929(runtimeexception, ("bca.TA(" + i + ',' + (if (var_ha_Sub2 != null) "{...}" else "null") + ',' + i_24_ + ',' + i_25_ + ',' + i_26_ + ')'))
        }
    }

    @JvmStatic
    fun method906(i: Int) {
        anIntArray1593 = null
        if (i != -31777) method901(null, -89)
    }

    @JvmStatic
    fun method909(i: Int) {
        anInt1598++
        if (HslAdjustTextureNode.aBoolean9403 && i == 3553) {
            while (GameDisplayManager.anInt2834 < WorldMapImageBuilder.aClass110_Sub1Array1146!!.size) {
                val class110_sub1 = WorldMapImageBuilder.aClass110_Sub1Array1146!![GameDisplayManager.anInt2834]
                if (class110_sub1 == null || class110_sub1.anInt5788 != -1) GameDisplayManager.anInt2834++
                else {
                    if (PingHostListHolder.aClass348_Sub26_2332 == null) PingHostListHolder.aClass348_Sub26_2332 = (SceneObjectSpawner.aHostPingThread_1286!!.method1302(i xor 0x1967.inv(), class110_sub1.aString5794!!))
                    val i_29_ = (PingHostListHolder.aClass348_Sub26_2332!!.anInt6887)
                    if (i_29_ == -1) break
                    class110_sub1.anInt5788 = i_29_
                    GameDisplayManager.anInt2834++
                    PingHostListHolder.aClass348_Sub26_2332 = null
                }
            }
        }
    }
    var maps: Js5Archive? = null

    @JvmStatic
    fun method3554(i: Int) {
        maps = null
    }
}