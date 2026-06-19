import TextureQualityOptionStateStatics.method1782
import java.awt.Rectangle

object ModelLightingConfigStatics {
    var anInt2537: Int = 0
            @JvmField
            var aFontMetaRef_2539: FontMetaRef? = FontMetaRef(26, 7)
            var anInt2543: Int = 0
            var anInt2550: Int = 0
            @JvmField
            var anIntArray2552: IntArray? = null
            var anInt2553: Int = 0
            @JvmField
            var aRectangleArray2554: Array<Rectangle?>? = arrayOfNulls<Rectangle>(100)
            var aFloat2555: Float = 0f
    
            fun method1422(i: Int, i_0_: Int, i_1_: Int, i_2_: Int): Boolean {
                anInt2550++
                SourceRowTextureNodeStatics.aAbstractCameraTransform_9114!!.method897(i_1_, i, i_0_, SequencedWallEntityStatics.anIntArray10172!!)
                val i_3_ = SequencedWallEntityStatics.anIntArray10172!![2]
                if (i_3_ < 50) return false
                SequencedWallEntityStatics.anIntArray10172!![2] = i_3_
                SequencedWallEntityStatics.anIntArray10172!![0] = (ScreenBorderFiller.anInt1962 * SequencedWallEntityStatics.anIntArray10172!![0] / i_3_) + CollisionFlagQueryStatics.anInt1202
                SequencedWallEntityStatics.anIntArray10172!![1] = (CipheredPacketBufferStatics.anInt9759 + (SequencedWallEntityStatics.anIntArray10172!![1] * GlIndexBufferArbStatics.anInt8498 / i_3_))
                if (i_2_ != -7596) aRectangleArray2554 = null
                return true
            }
    
            @JvmStatic
            fun method1425(i: Byte, structConfig: StructConfig?, class348_sub21: CameraSplineNode?, i_5_: Int, var_renderer: Renderer?, i_6_: Int): Boolean {
                try {
                    anInt2537++
                    var i_7_ = 2147483647
                    var i_8_ = -2147483648
                    var i_9_ = 2147483647
                    var i_10_ = -2147483648
                    if (structConfig!!.anIntArray591 != null) {
                        i_8_ = (MapRegionLoaderStatics.anInt1272 + ((-MapRegionLoaderStatics.anInt1274 + (class348_sub21!!.anInt6852 + structConfig.anInt595)) * (MapRegionLoaderStatics.anInt1276 - MapRegionLoaderStatics.anInt1272) / (-MapRegionLoaderStatics.anInt1274 + MapRegionLoaderStatics.anInt1265)))
                        i_9_ = (-((-MapRegionLoaderStatics.anInt1262 + MapRegionLoaderStatics.anInt1268) * (structConfig.anInt570 + (class348_sub21.anInt6851 - MapRegionLoaderStatics.anInt1257)) / (MapRegionLoaderStatics.anInt1277 + -MapRegionLoaderStatics.anInt1257)) + MapRegionLoaderStatics.anInt1268)
                        i_10_ = (-((-MapRegionLoaderStatics.anInt1262 + MapRegionLoaderStatics.anInt1268) * (class348_sub21.anInt6851 + (structConfig.anInt607 + -MapRegionLoaderStatics.anInt1257)) / (MapRegionLoaderStatics.anInt1277 - MapRegionLoaderStatics.anInt1257)) + MapRegionLoaderStatics.anInt1268)
                        i_7_ = (((-MapRegionLoaderStatics.anInt1272 + MapRegionLoaderStatics.anInt1276) * (-MapRegionLoaderStatics.anInt1274 + class348_sub21.anInt6852 + structConfig.anInt603) / (-MapRegionLoaderStatics.anInt1274 + MapRegionLoaderStatics.anInt1265)) + MapRegionLoaderStatics.anInt1272)
                    }
                    var abstractModelRenderer: AbstractModelRenderer? = null
                    var i_11_ = 0
                    if (i > -29) aRectangleArray2554 = null
                    var i_12_ = 0
                    var i_13_ = 0
                    var i_14_ = 0
                    if (structConfig.anInt578 != -1) {
                        if (class348_sub21!!.aBoolean6848 && structConfig.anInt605 != -1) abstractModelRenderer = structConfig.method374(true, var_renderer!!, 127.toByte())
                        else abstractModelRenderer = structConfig.method374(false, var_renderer!!, 127.toByte())
                        if (abstractModelRenderer != null) {
                            i_11_ = (class348_sub21.anInt6853 + -(abstractModelRenderer.method966() - -1 shr 1))
                            i_12_ = (class348_sub21.anInt6853 + (1 + abstractModelRenderer.method966() shr 1))
                            if (i_11_ < i_7_) i_7_ = i_11_
                            if (i_12_ > i_8_) i_8_ = i_12_
                            i_13_ = (class348_sub21.anInt6855 - (abstractModelRenderer.method980() - -1 shr 1))
                            if (i_13_ < i_9_) i_9_ = i_13_
                            i_14_ = (class348_sub21.anInt6855 + (1 + abstractModelRenderer.method980() shr 1))
                            if (i_14_ > i_10_) i_10_ = i_14_
                        }
                    }
                    var systemFontGlyphs: SystemFontGlyphs? = null
                    var i_15_ = 0
                    var i_16_ = 0
                    var i_17_ = 0
                    var i_18_ = 0
                    var i_19_ = 0
                    var i_20_ = 0
                    var i_21_ = 0
                    var i_22_ = 0
                    if (structConfig.aString597 != null) {
                        systemFontGlyphs = method1782(structConfig.anInt576, 10144)
                        if (systemFontGlyphs != null) {
                            i_15_ = (GlTexture3DStatics.aFontDefinition_8527!!.method1188(structConfig.aString597, null, NativeRendererStatics.aStringArray8019, 87.toByte(), null))
                            i_17_ = (class348_sub21!!.anInt6855 - (structConfig.anInt568 * (MapRegionLoaderStatics.anInt1268 + -MapRegionLoaderStatics.anInt1262) / (MapRegionLoaderStatics.anInt1277 - MapRegionLoaderStatics.anInt1257)))
                            i_16_ = (class348_sub21.anInt6853 + ((-MapRegionLoaderStatics.anInt1272 + MapRegionLoaderStatics.anInt1276) * structConfig.anInt566 / (MapRegionLoaderStatics.anInt1265 + -MapRegionLoaderStatics.anInt1274)))
                            if (abstractModelRenderer == null) i_17_ -= i_15_ * systemFontGlyphs.method2560() / 2
                            else i_17_ -= ((abstractModelRenderer.method980() shr 1) - -(i_15_ * systemFontGlyphs.method2565()))
                            var i_23_ = 0
                            while (i_15_ > i_23_) {
                                var string = NativeRendererStatics.aStringArray8019!![i_23_]!!
                                if (i_23_ < -1 + i_15_) string = string.substring(0, -4 + string.length)
                                val i_24_ = systemFontGlyphs.method2564(string)
                                if (i_18_ < i_24_) i_18_ = i_24_
                                i_23_++
                            }
                            i_19_ = i_6_ + i_16_ + -(i_18_ / 2)
                            i_20_ = i_6_ + i_16_ + i_18_ / 2
                            if (i_7_ > i_19_) i_7_ = i_19_
                            i_21_ = i_17_ + i_5_
                            if (i_20_ > i_8_) i_8_ = i_20_
                            i_22_ = i_5_ + (i_17_ + systemFontGlyphs.method2565() * i_15_)
                            if (i_9_ > i_21_) i_9_ = i_21_
                            if (i_10_ < i_22_) i_10_ = i_22_
                        }
                    }
                    if (MapRegionLoaderStatics.anInt1272 > i_8_ || i_7_ > MapRegionLoaderStatics.anInt1276 || i_10_ < MapRegionLoaderStatics.anInt1262 || i_9_ > MapRegionLoaderStatics.anInt1268) return true
                    MapRegionLoaderStatics.method745(var_renderer!!, class348_sub21!!, structConfig)
                    if (abstractModelRenderer != null) {
                        if (GlEnvMappedWaterPassStatics.anInt7379 > 0 && ((HslAdjustTextureNodeStatics.anInt9399 != -1 && (HslAdjustTextureNodeStatics.anInt9399 == class348_sub21.anInt6847)) || (SkeletalAnimFrameLoaderStatics.anInt481 != -1 && (structConfig.anInt596 == SkeletalAnimFrameLoaderStatics.anInt481)))) {
                            val i_25_: Int
                            if (ClientLoadStateMachine.anInt2173 <= 50) i_25_ = 2 * ClientLoadStateMachine.anInt2173
                            else i_25_ = -(ClientLoadStateMachine.anInt2173 * 2) + 200
                            val i_26_ = 0xffff00 or (i_25_ shl 24)
                            var_renderer.method3656((-105).toByte(), i_26_, abstractModelRenderer.method971() / 2 - -7, (class348_sub21.anInt6853), (class348_sub21.anInt6855))
                            var_renderer.method3656((-120).toByte(), i_26_, abstractModelRenderer.method971() / 2 - -5, (class348_sub21.anInt6853), (class348_sub21.anInt6855))
                            var_renderer.method3656((-126).toByte(), i_26_, 3 + abstractModelRenderer.method971() / 2, (class348_sub21.anInt6853), (class348_sub21.anInt6855))
                            var_renderer.method3656((-112).toByte(), i_26_, 1 + abstractModelRenderer.method971() / 2, (class348_sub21.anInt6853), (class348_sub21.anInt6855))
                            var_renderer.method3656((-123).toByte(), i_26_, abstractModelRenderer.method971() / 2, (class348_sub21.anInt6853), (class348_sub21.anInt6855))
                        }
                        abstractModelRenderer.method974((class348_sub21.anInt6853 + -(abstractModelRenderer.method966() shr 1)), (class348_sub21.anInt6855 + -(abstractModelRenderer.method980() shr 1)))
                    }
                    if (structConfig.aString597 != null && systemFontGlyphs != null) WidgetRedrawRegionStatics.method2683(systemFontGlyphs, class348_sub21, i_16_, 64, i_15_, var_renderer, i_17_, i_18_, structConfig)
                    if (structConfig.anInt578 != -1 || structConfig.aString597 != null) {
                        val class348_sub12 = BoundingBoxNode(class348_sub21)
                        class348_sub12.anInt6746 = i_13_
                        class348_sub12.anInt6753 = i_21_
                        class348_sub12.anInt6747 = i_11_
                        class348_sub12.anInt6738 = i_22_
                        class348_sub12.anInt6745 = i_19_
                        class348_sub12.anInt6735 = i_14_
                        class348_sub12.anInt6737 = i_20_
                        class348_sub12.anInt6750 = i_12_
                        RegionSceneLoader.aNodeDeque_3705!!.method1999(class348_sub12, -20180)
                    }
                    return false
                } catch (runtimeexception: RuntimeException) {
                    throw SoundBankPatchStatics.method2929(runtimeexception, ("bp.C(" + i + ',' + (if (structConfig != null) "{...}" else "null") + ',' + (if (class348_sub21 != null) "{...}" else "null") + ',' + i_5_ + ',' + (if (var_renderer != null) "{...}" else "null") + ',' + i_6_ + ')'))
                }
            }
    
            @JvmStatic
            fun method1426(i: Int) {
                aFontMetaRef_2539 = null
                aRectangleArray2554 = null
                anIntArray2552 = null
                if (i != 25165) aRectangleArray2554 = null
            }
}
