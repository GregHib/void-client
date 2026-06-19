import FloorOverlayDefinitionStatics.method500

object ModelHeaderCacheStatics {
    var aIntRange_3265: IntRange?
            var anInt3266: Int = 0
            var anInt3270: Int = 0
            var anInt3272: Int = 0
            @JvmField
            var anIntArray3273: IntArray? = IntArray(5)
            var anInt3274: Int = 0
            var anInt3275: Int = 0
            var anInt3276: Int = 0
            var anInt3277: Int = 0
            var anInt3279: Int = 0
            var anInt3280: Int = 0
            var anInt3281: Int = 0
            var anInt3282: Int = 0
            var anInt3283: Int = 0
            var anInt3284: Int = 0
            @JvmField
            var aServerConnectionInfo_3285: ServerConnectionInfo? = null
            fun method1929(i: Byte): Array<RgbColorPalette?> {
                if (i.toInt() != -19) method1933(null, null, false)
                anInt3280++
                return (arrayOf<RgbColorPalette?>(HardCacheEntryReferenceStatics.aRgbColorPalette_10437, NamedIdEntryStatics.aRgbColorPalette_6891, SplashImageLoadableStatics.aRgbColorPalette_4689, BufferedFileReader.aRgbColorPalette_4537, FileIoUtil.aRgbColorPalette_4098, RectangleBoundsStatics.aRgbColorPalette_2157, StaticNoiseTextureStatics.aRgbColorPalette_8662, GlShaderObjectHandleStatics.aRgbColorPalette_515, IntKeyNodeStatics.aRgbColorPalette_6977, ArbFogMaterialPassStatics.aRgbColorPalette_6201, NpcUpdateProcessor.aRgbColorPalette_1519, SynthVoiceGroupStatics.aRgbColorPalette_8853, ClampTextureNodeStatics.aRgbColorPalette_9475, TextureGeneratorStatics.aRgbColorPalette_2491))
            }
    
            @JvmStatic
            fun method1931(bool: Boolean) {
                anIntArray3273 = null
                if (bool != true) aIntRange_3265 = null
                aIntRange_3265 = null
                aServerConnectionInfo_3285 = null
            }
    
            fun method1933(js5Archive: Js5Archive?, var_renderer: Renderer?, bool: Boolean) {
                try {
                    anInt3279++
                    var spriteImages: Array<SpriteImage>? = SpriteImageStatics.method1519(js5Archive!!, NpcReferenceStatics.anInt6862, 0)
                    HostPingThreadStatics.aAbstractModelRendererArray2260 = arrayOfNulls<AbstractModelRenderer>(spriteImages!!.size)
                    run {
                        var i = 0
                        while (spriteImages.size > i) {
                            HostPingThreadStatics.aAbstractModelRendererArray2260!![i] = var_renderer!!.method3691(spriteImages[i], true)
                            i++
                        }
                    }
                    spriteImages = SpriteImageStatics.method1519(js5Archive, DualMaterialContainerStatics.anInt1639, 0)
                    TimedRecordAccessorStatics.aAbstractModelRendererArray7107 = arrayOfNulls<AbstractModelRenderer>(spriteImages!!.size)
                    run {
                        var i = 0
                        while (spriteImages.size > i) {
                            TimedRecordAccessorStatics.aAbstractModelRendererArray7107!![i] = var_renderer!!.method3691(spriteImages[i], true)
                            i++
                        }
                    }
                    spriteImages = SpriteImageStatics.method1519(js5Archive, MouseInputTrackerStatics.anInt7429, 0)
                    CameraDistanceOptionStateStatics.aAbstractModelRendererArray5857 = arrayOfNulls<AbstractModelRenderer>(spriteImages!!.size)
                    run {
                        var i = 0
                        while (spriteImages.size > i) {
                            CameraDistanceOptionStateStatics.aAbstractModelRendererArray5857!![i] = var_renderer!!.method3691(spriteImages[i], true)
                            i++
                        }
                    }
                    spriteImages = SpriteImageStatics.method1519(js5Archive, RendererStatics.anInt4562, 0)
                    WallSceneEntityStatics.aAbstractModelRendererArray9959 = arrayOfNulls<AbstractModelRenderer>(spriteImages!!.size)
                    run {
                        var i = 0
                        while (spriteImages.size > i) {
                            WallSceneEntityStatics.aAbstractModelRendererArray9959!![i] = var_renderer!!.method3691(spriteImages[i], true)
                            i++
                        }
                    }
                    spriteImages = SpriteImageStatics.method1519(js5Archive, ConfigArchiveLoaderStatics.anInt1435, 0)
                    CompassSmootherStatics.aAbstractModelRendererArray3378 = arrayOfNulls<AbstractModelRenderer>(spriteImages!!.size)
                    run {
                        var i = 0
                        while (spriteImages.size > i) {
                            CompassSmootherStatics.aAbstractModelRendererArray3378!![i] = var_renderer!!.method3691(spriteImages[i], true)
                            i++
                        }
                    }
                    spriteImages = SpriteImageStatics.method1519(js5Archive, OverlayColorTable.anInt1756, 0)
                    CustomCursorsOptionStateStatics.aAbstractModelRendererArray5933 = arrayOfNulls<AbstractModelRenderer>(spriteImages!!.size)
                    for (i in spriteImages.indices) CustomCursorsOptionStateStatics.aAbstractModelRendererArray5933!![i] = var_renderer!!.method3691(spriteImages[i], true)
                    spriteImages = SpriteImageStatics.method1519(js5Archive, CutsceneSequenceDataStatics.anInt3739, 0)
                    GrayscaleNoiseTextureStatics.aAbstractModelRendererArray5294 = arrayOfNulls<AbstractModelRenderer>(spriteImages!!.size)
                    run {
                        var i = 0
                        while (spriteImages.size > i) {
                            GrayscaleNoiseTextureStatics.aAbstractModelRendererArray5294!![i] = var_renderer!!.method3691(spriteImages[i], true)
                            i++
                        }
                    }
                    spriteImages = SpriteImageStatics.method1519(js5Archive, DrawListState.anInt1481, 0)
                    SpriteStoreStatics.aAbstractModelRendererArray367 = arrayOfNulls<AbstractModelRenderer>(spriteImages!!.size)
                    run {
                        var i = 0
                        while (spriteImages.size > i) {
                            SpriteStoreStatics.aAbstractModelRendererArray367!![i] = var_renderer!!.method3691(spriteImages[i], true)
                            i++
                        }
                    }
                    spriteImages = SpriteImageStatics.method1519(js5Archive, RangedGraphicsOptionStateStatics.anInt5948, 0)
                    BoxBlurTextureNodeStatics.aAbstractModelRendererArray9467 = arrayOfNulls<AbstractModelRenderer>(spriteImages!!.size)
                    for (i in spriteImages.indices) BoxBlurTextureNodeStatics.aAbstractModelRendererArray9467!![i] = var_renderer!!.method3691(spriteImages[i], true)
                    spriteImages = SpriteImageStatics.method1519(js5Archive, CameraNodeListStatics.anInt1742, 0)
                    BoundingBoxNodeStatics.aAbstractModelRendererArray6742 = arrayOfNulls<AbstractModelRenderer>(spriteImages!!.size)
                    run {
                        var i = 0
                        while (spriteImages.size > i) {
                            BoundingBoxNodeStatics.aAbstractModelRendererArray6742!![i] = var_renderer!!.method3691(spriteImages[i], true)
                            i++
                        }
                    }
                    spriteImages = SpriteImageStatics.method1519(js5Archive, NamedIdRecordStatics.anInt4469, 0)
                    WorldMapRendererStatics.aAbstractModelRendererArray4679 = arrayOfNulls<AbstractModelRenderer>(spriteImages!!.size)
                    for (i in spriteImages.indices) WorldMapRendererStatics.aAbstractModelRendererArray4679!![i] = var_renderer!!.method3691(spriteImages[i], true)
                    spriteImages = SpriteImageStatics.method1519(js5Archive, ClampTextureNodeStatics.anInt9473, 0)
                    CameraNodeListStatics.aAbstractModelRendererArray1744 = arrayOfNulls<AbstractModelRenderer>(spriteImages!!.size)
                    run {
                        var i = 0
                        while (spriteImages.size > i) {
                            CameraNodeListStatics.aAbstractModelRendererArray1744!![i] = var_renderer!!.method3691(spriteImages[i], true)
                            i++
                        }
                    }
                    NpcTypeStatics.aAbstractModelRenderer_1365 = var_renderer!!.method3691(SpriteImageStatics.method1521(js5Archive, RsaVarbitHandlerStatics.anInt4895, 0), bool)
                    SceneryDetailOptionStateStatics.aAbstractModelRenderer_6097 = var_renderer.method3691(SpriteImageStatics.method1521(js5Archive, (PerlinTextureProviderStatics.anInt5814), 0), true)
                    spriteImages = SpriteImageStatics.method1519(js5Archive, SpriteComponentStatics.anInt8370, 0)
                    ScriptResources.aAbstractModelRendererArray2640 = arrayOfNulls<AbstractModelRenderer>(spriteImages!!.size)
                    for (i in spriteImages.indices) ScriptResources.aAbstractModelRendererArray2640!![i] = var_renderer.method3691(spriteImages[i], true)
                } catch (runtimeexception: RuntimeException) {
                    throw SoundBankPatchStatics.method2929(runtimeexception, ("ub.N(" + (if (js5Archive != null) "{...}" else "null") + ',' + (if (var_renderer != null) "{...}" else "null") + ',' + bool + ')'))
                }
            }
    
            @JvmStatic
            fun method1935(i: Int, i_10_: Int, circleHitbox: CircleHitbox?, abstractModel: AbstractModel?, bool: Boolean, i_11_: Int) {
                try {
                    anInt3270++
                    if (abstractModel != null) {
                        if (bool != false) method1929(106.toByte())
                        circleHitbox!!.method320(abstractModel.EA(), abstractModel.fa(), (-4).toByte(), i_11_, abstractModel.na(), i, abstractModel.V(), abstractModel.G(), abstractModel.HA(), i_10_, abstractModel.RA())
                    }
                } catch (runtimeexception: RuntimeException) {
                    throw SoundBankPatchStatics.method2929(runtimeexception, ("ub.H(" + i + ',' + i_10_ + ',' + (if (circleHitbox != null) "{...}" else "null") + ',' + (if (abstractModel != null) "{...}" else "null") + ',' + bool + ',' + i_11_ + ')'))
                }
            }
    
            init {
                aIntRange_3265 = IntRange(48, -2)
            }
}
