import FloorOverlayDefinition.Companion.method500

/* Class255 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class ModelHeaderCache internal constructor(sceneProjector: SceneProjector?, i: Int, bool: Boolean, emoteDefCache: EmoteDefCache?, js5Archive: Js5Archive?, js5Archive_22_: Js5Archive?) {
    private val aJs5Archive_3267: Js5Archive?
    var aJs5Archive_3268: Js5Archive? = null
    private var aBoolean3269 = false
    var anInt3271: Int = 0
    private val aLruByteCache_3278 = LruByteCache(64)
    var anInt3286: Int = 0
    var aLruByteCache_3287: LruByteCache = LruByteCache(50)
    var aSizeBoundedSoftCache_3288: SizeBoundedSoftCache = SizeBoundedSoftCache(250)
    private var aCrc64Hashable_3289: Crc64Hashable? = Crc64Hashable()
    private val aStringArray3290: Array<String?>
    var anInt3291: Int = 0
    private var aEmoteDefCache_3292: EmoteDefCache? = null
    private val aStringArray3293: Array<String?>

    fun method1930(i: Int) {
        synchronized(this.aLruByteCache_3287) {
            this.aLruByteCache_3287.method590(0)
            if (i != -21804) method1930(-35)
        }
        anInt3275++
    }

    fun method1932(var_renderer: Renderer?, i: Int, i_0_: Int, font: Font?, compositeNpcModelBuilder: CompositeNpcModelBuilder?, i_1_: Int, bool: Boolean, i_2_: Byte, var_renderer_3_: Renderer?, i_4_: Int, bool_5_: Boolean, i_6_: Int): AbstractModelRenderer? {
        try {
            anInt3266++
            val class105 = method1941(i_6_, (-74).toByte(), i_4_, i_0_, i, i_1_, var_renderer_3_, compositeNpcModelBuilder)
            if (class105 != null) return class105
            var class213 = method1940(90, i_4_)
            if (i_0_ > 1 && class213.anIntArray2762 != null) {
                var i_7_ = -1
                for (i_8_ in 0..9) {
                    if ((class213.anIntArray2831[i_8_] <= i_0_) && class213.anIntArray2831[i_8_] != 0) i_7_ = class213.anIntArray2762!![i_8_]
                }
                if (i_7_ != -1) class213 = method1940(127, i_7_)
            }
            if (i_2_.toInt() != 83) method1935(-83, -37, null, null, false, -49)
            val `is` = class213.method1562(i_0_, bool_5_, i, var_renderer_3_, var_renderer, font, compositeNpcModelBuilder, i_1_, (-102).toByte(), i_6_)
            if (`is` == null) return null
            val abstractModelRenderer_9_: AbstractModelRenderer?
            if (bool) abstractModelRenderer_9_ = var_renderer!!.method3662(36, `is`, 94.toByte(), 0, 36, 32)
            else abstractModelRenderer_9_ = var_renderer_3_!!.method3662(36, `is`, 94.toByte(), 0, 36, 32)
            if (!bool) {
                val crc64Hashable = Crc64Hashable()
                crc64Hashable.anInt4982 = i
                crc64Hashable.aBoolean4990 = compositeNpcModelBuilder != null
                crc64Hashable.anInt4989 = i_0_
                crc64Hashable.anInt4992 = i_4_
                crc64Hashable.anInt4981 = i_1_
                crc64Hashable.anInt4991 = var_renderer_3_!!.anInt4567
                crc64Hashable.anInt4993 = i_6_
                this.aSizeBoundedSoftCache_3288.method1348(70, abstractModelRenderer_9_, crc64Hashable)
            }
            return abstractModelRenderer_9_
        } catch (runtimeexception: RuntimeException) {
            throw SoundBankPatch.method2929(runtimeexception, ("ub.C(" + (if (var_renderer != null) "{...}" else "null") + ',' + i + ',' + i_0_ + ',' + (if (font != null) "{...}" else "null") + ',' + (if (compositeNpcModelBuilder != null) "{...}" else "null") + ',' + i_1_ + ',' + bool + ',' + i_2_ + ',' + (if (var_renderer_3_ != null) "{...}" else "null") + ',' + i_4_ + ',' + bool_5_ + ',' + i_6_ + ')'))
        }
    }

    fun method1934(i: Byte, bool: Boolean) {
        if (i.toInt() != 11) method1935(97, -31, null, null, false, 53)
        anInt3276++
        if (!aBoolean3269 != !bool) {
            aBoolean3269 = bool
            method1939(i.toInt() xor 0x14.inv())
        }
    }

    fun method1936(i: Int) {
        anInt3281++
        synchronized(this.aSizeBoundedSoftCache_3288) {
            this.aSizeBoundedSoftCache_3288.method1345((-126).toByte())
            val i_12_ = -63 / ((21 - i) / 50)
        }
    }

    fun method1937(i: Int, bool: Boolean) {
        anInt3274++
        synchronized(aLruByteCache_3278) {
            aLruByteCache_3278.method578(2, i)
        }
        synchronized(this.aLruByteCache_3287) {
            if (bool != false) method1939(-11)
            this.aLruByteCache_3287.method578(2, i)
        }
        synchronized(this.aSizeBoundedSoftCache_3288) {
            this.aSizeBoundedSoftCache_3288.method1346(-1491, i)
        }
    }

    fun method1938(i: Int) {
        anInt3272++
        synchronized(aLruByteCache_3278) {
            aLruByteCache_3278.method587(-88)
        }
        synchronized(this.aLruByteCache_3287) {
            this.aLruByteCache_3287.method587(-85)
        }
        synchronized(this.aSizeBoundedSoftCache_3288) {
            this.aSizeBoundedSoftCache_3288.method1344((-124).toByte())
        }
        if (i < 105) this.aJs5Archive_3268 = null
    }

    fun method1939(i: Int) {
        synchronized(aLruByteCache_3278) {
            if (i > -28) aEmoteDefCache_3292 = null
            aLruByteCache_3278.method590(0)
        }
        anInt3277++
        synchronized(this.aLruByteCache_3287) {
            this.aLruByteCache_3287.method590(0)
        }
        synchronized(this.aSizeBoundedSoftCache_3288) {
            this.aSizeBoundedSoftCache_3288.method1345(47.toByte())
        }
    }

    fun method1940(i: Int, i_13_: Int): ItemDefinition {
        anInt3283++
        var itemDefinition: ItemDefinition?
        synchronized(aLruByteCache_3278) {
            itemDefinition = aLruByteCache_3278.method583(i_13_.toLong(), 90) as ItemDefinition?
        }
        if (itemDefinition != null) return itemDefinition
        val `is`: ByteArray?
        synchronized(aJs5Archive_3267!!) {
            `is` = aJs5Archive_3267.method410(-1860, method500(7, i_13_), ConfigFlagUtil.Companion.method1914(-23590, i_13_))
        }
        itemDefinition = ItemDefinition()
        itemDefinition.aModelHeaderCache_2761 = this
        itemDefinition.anInt2769 = i_13_
        itemDefinition.aStringArray2811 = arrayOf<String?>(null, null, LocalizedText.aLocalizedText_3490!!.method2063(this.anInt3286, 544), null, null)
        itemDefinition.aStringArray2763 = (arrayOf<String?>(null, null, null, null, LocalizedText.aLocalizedText_3491!!.method2063(this.anInt3286, 544)))
        if (`is` != null) itemDefinition.method1569(768, Buffer(`is`))
        itemDefinition.method1563(92.toByte())
        val i_14_ = 4 / ((i - 13) / 59)
        if (itemDefinition.anInt2833 != -1) itemDefinition.method1570(1, method1940(90, itemDefinition.anInt2758), method1940(101, itemDefinition.anInt2833))
        if (itemDefinition.anInt2812 != -1) itemDefinition.method1556(method1940(-58, itemDefinition.anInt2778), (-29).toByte(), method1940(-82, itemDefinition.anInt2812))
        if (!aBoolean3269 && itemDefinition.aBoolean2783) {
            itemDefinition.aString2795 = LocalizedText.aLocalizedText_3488!!.method2063(this.anInt3286, 544)
            itemDefinition.anInt2827 = 0
            itemDefinition.aStringArray2811 = aStringArray3290
            itemDefinition.aStringArray2763 = aStringArray3293
            itemDefinition.aBoolean2755 = false
            itemDefinition.anIntArray2772 = null
            if (itemDefinition.aHashtable_2757 != null) {
                var bool = false
                var class348 = itemDefinition.aHashtable_2757!!.method3484(0)
                while (class348 != null) {
                    val class254 = aEmoteDefCache_3292!!.method2600(class348.aLong4291.toInt(), 28364)
                    if (class254.aBoolean3261) class348.method2715(60.toByte())
                    else bool = true
                    class348 = itemDefinition.aHashtable_2757!!.method3482(0)
                }
                if (!bool) itemDefinition.aHashtable_2757 = null
            }
        }
        synchronized(aLruByteCache_3278) {
            aLruByteCache_3278.method582(itemDefinition, i_13_.toLong(), (-118).toByte())
        }
        return itemDefinition
    }

    fun method1941(i: Int, i_15_: Byte, i_16_: Int, i_17_: Int, i_18_: Int, i_19_: Int, var_renderer: Renderer?, compositeNpcModelBuilder: CompositeNpcModelBuilder?): AbstractModelRenderer? {
        try {
            aCrc64Hashable_3289!!.anInt4992 = i_16_
            aCrc64Hashable_3289!!.anInt4989 = i_17_
            aCrc64Hashable_3289!!.anInt4991 = var_renderer!!.anInt4567
            aCrc64Hashable_3289!!.anInt4981 = i_19_
            if (i_15_.toInt() != -74) aCrc64Hashable_3289 = null
            aCrc64Hashable_3289!!.aBoolean4990 = compositeNpcModelBuilder != null
            aCrc64Hashable_3289!!.anInt4982 = i_18_
            anInt3282++
            aCrc64Hashable_3289!!.anInt4993 = i
            return this.aSizeBoundedSoftCache_3288.method1340(123, aCrc64Hashable_3289!!) as AbstractModelRenderer?
        } catch (runtimeexception: RuntimeException) {
            throw SoundBankPatch.method2929(runtimeexception, ("ub.D(" + i + ',' + i_15_ + ',' + i_16_ + ',' + i_17_ + ',' + i_18_ + ',' + i_19_ + ',' + (if (var_renderer != null) "{...}" else "null") + ',' + (if (compositeNpcModelBuilder != null) "{...}" else "null") + ')'))
        }
    }

    fun method1942(i: Int, i_20_: Byte) {
        this.anInt3291 = i
        anInt3284++
        synchronized(this.aLruByteCache_3287) {
            this.aLruByteCache_3287.method590(0)
            val i_21_ = 89 % ((-65 - i_20_) / 60)
        }
    }

    init {
        try {
            aBoolean3269 = bool
            aEmoteDefCache_3292 = emoteDefCache
            this.aJs5Archive_3268 = js5Archive_22_
            this.anInt3286 = i
            aJs5Archive_3267 = js5Archive
            if (aJs5Archive_3267 != null) {
                val i_23_ = -1 + aJs5Archive_3267.method414(-1)
                this.anInt3271 = aJs5Archive_3267.method407(0, i_23_) + i_23_ * 256
            } else this.anInt3271 = 0
            aStringArray3290 = (arrayOf<String?>(null, null, LocalizedText.aLocalizedText_3490!!.method2063(this.anInt3286, 544), null, null))
            aStringArray3293 = (arrayOf<String?>(null, null, null, null, LocalizedText.aLocalizedText_3491!!.method2063(this.anInt3286, 544)))
        } catch (runtimeexception: RuntimeException) {
            throw SoundBankPatch.method2929(runtimeexception, ("ub.<init>(" + (if (sceneProjector != null) "{...}" else "null") + ',' + i + ',' + bool + ',' + (if (emoteDefCache != null) "{...}" else "null") + ',' + (if (js5Archive != null) "{...}" else "null") + ',' + (if (js5Archive_22_ != null) "{...}" else "null") + ')'))
        }
    }

    companion object {
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
            return (arrayOf<RgbColorPalette?>(HardCacheEntryReference.aRgbColorPalette_10437, NamedIdEntry.aRgbColorPalette_6891, SplashImageLoadable.aRgbColorPalette_4689, BufferedFileReader.aRgbColorPalette_4537, FileIoUtil.aRgbColorPalette_4098, RectangleBounds.aRgbColorPalette_2157, StaticNoiseTexture.aRgbColorPalette_8662, GlShaderObjectHandle.aRgbColorPalette_515, IntKeyNode.aRgbColorPalette_6977, ArbFogMaterialPass.aRgbColorPalette_6201, Class91.aRgbColorPalette_1519, SynthVoiceGroup.aRgbColorPalette_8853, ClampTextureNode.aRgbColorPalette_9475, TextureGenerator.aRgbColorPalette_2491))
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
                var spriteImages: Array<SpriteImage>? = SpriteImage.method1519(js5Archive!!, NpcReference.anInt6862, 0)
                HostPingThread.aAbstractModelRendererArray2260 = arrayOfNulls<AbstractModelRenderer>(spriteImages!!.size)
                run {
                    var i = 0
                    while (spriteImages.size > i) {
                        HostPingThread.aAbstractModelRendererArray2260!![i] = var_renderer!!.method3691(spriteImages[i], true)
                        i++
                    }
                }
                spriteImages = SpriteImage.method1519(js5Archive, DualMaterialContainer.anInt1639, 0)
                TimedRecordAccessor.aAbstractModelRendererArray7107 = arrayOfNulls<AbstractModelRenderer>(spriteImages!!.size)
                run {
                    var i = 0
                    while (spriteImages.size > i) {
                        TimedRecordAccessor.aAbstractModelRendererArray7107!![i] = var_renderer!!.method3691(spriteImages[i], true)
                        i++
                    }
                }
                spriteImages = SpriteImage.method1519(js5Archive, MouseInputTracker.anInt7429, 0)
                CameraDistanceOptionState.aAbstractModelRendererArray5857 = arrayOfNulls<AbstractModelRenderer>(spriteImages!!.size)
                run {
                    var i = 0
                    while (spriteImages.size > i) {
                        CameraDistanceOptionState.aAbstractModelRendererArray5857!![i] = var_renderer!!.method3691(spriteImages[i], true)
                        i++
                    }
                }
                spriteImages = SpriteImage.method1519(js5Archive, Renderer.anInt4562, 0)
                WallSceneEntity.aAbstractModelRendererArray9959 = arrayOfNulls<AbstractModelRenderer>(spriteImages!!.size)
                run {
                    var i = 0
                    while (spriteImages.size > i) {
                        WallSceneEntity.aAbstractModelRendererArray9959!![i] = var_renderer!!.method3691(spriteImages[i], true)
                        i++
                    }
                }
                spriteImages = SpriteImage.method1519(js5Archive, Class82.anInt1435, 0)
                CompassSmoother.aAbstractModelRendererArray3378 = arrayOfNulls<AbstractModelRenderer>(spriteImages!!.size)
                run {
                    var i = 0
                    while (spriteImages.size > i) {
                        CompassSmoother.aAbstractModelRendererArray3378!![i] = var_renderer!!.method3691(spriteImages[i], true)
                        i++
                    }
                }
                spriteImages = SpriteImage.method1519(js5Archive, OverlayColorTable.anInt1756, 0)
                CustomCursorsOptionState.aAbstractModelRendererArray5933 = arrayOfNulls<AbstractModelRenderer>(spriteImages!!.size)
                for (i in spriteImages.indices) CustomCursorsOptionState.aAbstractModelRendererArray5933!![i] = var_renderer!!.method3691(spriteImages[i], true)
                spriteImages = SpriteImage.method1519(js5Archive, CutsceneSequenceData.anInt3739, 0)
                GrayscaleNoiseTexture.aAbstractModelRendererArray5294 = arrayOfNulls<AbstractModelRenderer>(spriteImages!!.size)
                run {
                    var i = 0
                    while (spriteImages.size > i) {
                        GrayscaleNoiseTexture.aAbstractModelRendererArray5294!![i] = var_renderer!!.method3691(spriteImages[i], true)
                        i++
                    }
                }
                spriteImages = SpriteImage.method1519(js5Archive, Class86.anInt1481, 0)
                SpriteStore.aAbstractModelRendererArray367 = arrayOfNulls<AbstractModelRenderer>(spriteImages!!.size)
                run {
                    var i = 0
                    while (spriteImages.size > i) {
                        SpriteStore.aAbstractModelRendererArray367!![i] = var_renderer!!.method3691(spriteImages[i], true)
                        i++
                    }
                }
                spriteImages = SpriteImage.method1519(js5Archive, RangedGraphicsOptionState.anInt5948, 0)
                BoxBlurTextureNode.aAbstractModelRendererArray9467 = arrayOfNulls<AbstractModelRenderer>(spriteImages!!.size)
                for (i in spriteImages.indices) BoxBlurTextureNode.aAbstractModelRendererArray9467!![i] = var_renderer!!.method3691(spriteImages[i], true)
                spriteImages = SpriteImage.method1519(js5Archive, CameraNodeList.anInt1742, 0)
                BoundingBoxNode.aAbstractModelRendererArray6742 = arrayOfNulls<AbstractModelRenderer>(spriteImages!!.size)
                run {
                    var i = 0
                    while (spriteImages.size > i) {
                        BoundingBoxNode.aAbstractModelRendererArray6742!![i] = var_renderer!!.method3691(spriteImages[i], true)
                        i++
                    }
                }
                spriteImages = SpriteImage.method1519(js5Archive, NamedIdRecord.anInt4469, 0)
                WorldMapRenderer.aAbstractModelRendererArray4679 = arrayOfNulls<AbstractModelRenderer>(spriteImages!!.size)
                for (i in spriteImages.indices) WorldMapRenderer.aAbstractModelRendererArray4679!![i] = var_renderer!!.method3691(spriteImages[i], true)
                spriteImages = SpriteImage.method1519(js5Archive, ClampTextureNode.anInt9473, 0)
                CameraNodeList.aAbstractModelRendererArray1744 = arrayOfNulls<AbstractModelRenderer>(spriteImages!!.size)
                run {
                    var i = 0
                    while (spriteImages.size > i) {
                        CameraNodeList.aAbstractModelRendererArray1744!![i] = var_renderer!!.method3691(spriteImages[i], true)
                        i++
                    }
                }
                NpcType.aAbstractModelRenderer_1365 = var_renderer!!.method3691(SpriteImage.method1521(js5Archive, RsaVarbitHandler.anInt4895, 0), bool)
                SceneryDetailOptionState.aAbstractModelRenderer_6097 = var_renderer.method3691(SpriteImage.method1521(js5Archive, (PerlinTextureProvider.anInt5814), 0), true)
                spriteImages = SpriteImage.method1519(js5Archive, SpriteComponent.anInt8370, 0)
                ScriptResources.aAbstractModelRendererArray2640 = arrayOfNulls<AbstractModelRenderer>(spriteImages!!.size)
                for (i in spriteImages.indices) ScriptResources.aAbstractModelRendererArray2640!![i] = var_renderer.method3691(spriteImages[i], true)
            } catch (runtimeexception: RuntimeException) {
                throw SoundBankPatch.method2929(runtimeexception, ("ub.N(" + (if (js5Archive != null) "{...}" else "null") + ',' + (if (var_renderer != null) "{...}" else "null") + ',' + bool + ')'))
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
                throw SoundBankPatch.method2929(runtimeexception, ("ub.H(" + i + ',' + i_10_ + ',' + (if (circleHitbox != null) "{...}" else "null") + ',' + (if (abstractModel != null) "{...}" else "null") + ',' + bool + ',' + i_11_ + ')'))
            }
        }

        init {
            aIntRange_3265 = IntRange(48, -2)
        }
    }
}
