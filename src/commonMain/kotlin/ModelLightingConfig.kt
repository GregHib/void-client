import TextureQualityOptionState.Companion.method1782
import java.awt.Rectangle

/*
 * Class190
 */
class ModelLightingConfig {
    var anInt2535: Int = 0
    var aFloat2536: Float = 0f
    var anInt2538: Int = 0
    var anInt2540: Int = 0
    var aCircleRasterizer_2541: CircleRasterizer? = null
    var aFloat2542: Float = 0.25f
    var aFloat2544: Float = 0f
    var aFloat2545: Float = 1.0f
    var anInt2546: Int = 0
    var aFloat2547: Float = 0f
    var anInt2548: Int = 0
    var anInt2549: Int = 0
    var aFloat2551: Float = 1.0f
    fun method1423(i: Int, class348_sub49: ByteBuffer) {
        anInt2553++
        this.aFloat2545 = (class348_sub49.readUnsignedByte(255) * 8).toFloat() / 255.0f
        this.aFloat2542 = (8 * class348_sub49.readUnsignedByte(i + 247)).toFloat() / 255.0f
        this.aFloat2551 = (i * class348_sub49.readUnsignedByte(i + 247)).toFloat() / 255.0f
    }

    fun method1424(modelLightingConfig_4_: ModelLightingConfig, i: Byte): Boolean {
        anInt2543++
        if (i.toInt() != 84) return false
        return (this.anInt2540 == modelLightingConfig_4_.anInt2540) && (this.aFloat2547 == modelLightingConfig_4_.aFloat2547) && (modelLightingConfig_4_.aFloat2544 == this.aFloat2544) && (this.aFloat2536 == modelLightingConfig_4_.aFloat2536) && (modelLightingConfig_4_.aFloat2542 == this.aFloat2542) && (modelLightingConfig_4_.aFloat2545 == this.aFloat2545) && (modelLightingConfig_4_.aFloat2551 == this.aFloat2551) && (modelLightingConfig_4_.anInt2549 == this.anInt2549) && (modelLightingConfig_4_.anInt2546 == this.anInt2546) && (modelLightingConfig_4_.aCircleRasterizer_2541 === this.aCircleRasterizer_2541)
    }

    constructor() {
        this.anInt2535 = -50
        this.aFloat2536 = 1.2f
        this.aCircleRasterizer_2541 = ParameterizedText.aCircleRasterizer_9571
        this.anInt2546 = 0
        this.anInt2549 = LocDefinitionCache.anInt3444
        this.anInt2548 = -60
        this.anInt2538 = -50
        this.aFloat2544 = 0.69921875f
        this.anInt2540 = LocDefinitionCache.anInt3439
        this.aFloat2547 = 1.1523438f
    }

    internal constructor(class348_sub49: ByteBuffer) {
        val i = class348_sub49.readUnsignedByte(255)
        if (IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub28_7230!!.method1845(-32350) != 1 || TerrainChunkBuilder.aRenderer1098!!.method3704() <= 0) {
            if ((0x1 and i) != 0) class348_sub49.readInt((-126).toByte())
            if ((0x2 and i) != 0) class348_sub49.readUnsignedShort(842397944)
            if ((i and 0x4) != 0) class348_sub49.readUnsignedShort(842397944)
            if ((0x8 and i) != 0) class348_sub49.readUnsignedShort(842397944)
            this.anInt2540 = LocDefinitionCache.anInt3439
            this.aFloat2547 = 1.1523438f
            this.aFloat2544 = 0.69921875f
            this.aFloat2536 = 1.2f
        } else {
            if ((i and 0x1) != 0) this.anInt2540 = class348_sub49.readInt((-126).toByte())
            else this.anInt2540 = LocDefinitionCache.anInt3439
            if ((0x2 and i) != 0) this.aFloat2547 = class348_sub49.readUnsignedShort(842397944).toFloat() / 256.0f
            else this.aFloat2547 = 1.1523438f
            if ((i and 0x4) == 0) this.aFloat2544 = 0.69921875f
            else this.aFloat2544 = class348_sub49.readUnsignedShort(842397944).toFloat() / 256.0f
            if ((0x8 and i) != 0) this.aFloat2536 = class348_sub49.readUnsignedShort(842397944).toFloat() / 256.0f
            else this.aFloat2536 = 1.2f
        }
        if ((i and 0x10) == 0) {
            this.anInt2548 = -60
            this.anInt2535 = -50
            this.anInt2538 = -50
        } else {
            this.anInt2538 = class348_sub49.readShort(13638)
            this.anInt2548 = class348_sub49.readShort(13638)
            this.anInt2535 = class348_sub49.readShort(13638)
        }
        if ((0x20 and i) == 0) this.anInt2549 = LocDefinitionCache.anInt3444
        else this.anInt2549 = class348_sub49.readInt((-126).toByte())
        if ((i and 0x40) != 0) this.anInt2546 = class348_sub49.readUnsignedShort(842397944)
        else this.anInt2546 = 0
        if ((0x80 and i) != 0) {
            val i_27_ = class348_sub49.readUnsignedShort(842397944)
            val i_28_ = class348_sub49.readUnsignedShort(842397944)
            val i_29_ = class348_sub49.readUnsignedShort(842397944)
            val i_30_ = class348_sub49.readUnsignedShort(842397944)
            val i_31_ = class348_sub49.readUnsignedShort(842397944)
            val i_32_ = class348_sub49.readUnsignedShort(842397944)
            this.aCircleRasterizer_2541 = ModelLightingConfig.method1636(i_31_, i_30_, i_27_, i_32_, i_28_, -1, i_29_)
        } else this.aCircleRasterizer_2541 = ParameterizedText.aCircleRasterizer_9571
    }

    companion object {
        var anInt2537: Int = 0

        var aFontMetaRef_2539: FontMetaRef? = FontMetaRef(26, 7)
        var anInt2543: Int = 0
        var anInt2553: Int = 0

        var aRectangleArray2554: Array<Rectangle?>? = arrayOfNulls<Rectangle>(100)
        var aFloat2555: Float = 0f


        @JvmStatic
        fun method1425(i: Byte, structConfig: StructConfig?, class348_sub21: CameraSplineNode?, i_5_: Int, var_renderer: Renderer?, i_6_: Int): Boolean {
            try {
                anInt2537++
                var i_7_ = 2147483647
                var i_8_ = -2147483648
                var i_9_ = 2147483647
                var i_10_ = -2147483648
                if (structConfig!!.anIntArray591 != null) {
                    i_8_ = (MapRegionLoader.anInt1272 + ((-MapRegionLoader.anInt1274 + (class348_sub21!!.anInt6852 + structConfig.anInt595)) * (MapRegionLoader.anInt1276 - MapRegionLoader.anInt1272) / (-MapRegionLoader.anInt1274 + MapRegionLoader.anInt1265)))
                    i_9_ = (-((-MapRegionLoader.anInt1262 + MapRegionLoader.anInt1268) * (structConfig.anInt570 + (class348_sub21.anInt6851 - MapRegionLoader.anInt1257)) / (MapRegionLoader.anInt1277 + -MapRegionLoader.anInt1257)) + MapRegionLoader.anInt1268)
                    i_10_ = (-((-MapRegionLoader.anInt1262 + MapRegionLoader.anInt1268) * (class348_sub21.anInt6851 + (structConfig.anInt607 + -MapRegionLoader.anInt1257)) / (MapRegionLoader.anInt1277 - MapRegionLoader.anInt1257)) + MapRegionLoader.anInt1268)
                    i_7_ = (((-MapRegionLoader.anInt1272 + MapRegionLoader.anInt1276) * (-MapRegionLoader.anInt1274 + class348_sub21.anInt6852 + structConfig.anInt603) / (-MapRegionLoader.anInt1274 + MapRegionLoader.anInt1265)) + MapRegionLoader.anInt1272)
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
                        i_15_ = (GlTexture3D.aFontDefinition_8527!!.method1188(structConfig.aString597, null, NativeRenderer.aStringArray8019, 87.toByte(), null))
                        i_17_ = (class348_sub21!!.anInt6855 - (structConfig.anInt568 * (MapRegionLoader.anInt1268 + -MapRegionLoader.anInt1262) / (MapRegionLoader.anInt1277 - MapRegionLoader.anInt1257)))
                        i_16_ = (class348_sub21.anInt6853 + ((-MapRegionLoader.anInt1272 + MapRegionLoader.anInt1276) * structConfig.anInt566 / (MapRegionLoader.anInt1265 + -MapRegionLoader.anInt1274)))
                        if (abstractModelRenderer == null) i_17_ -= i_15_ * systemFontGlyphs.method2560() / 2
                        else i_17_ -= ((abstractModelRenderer.method980() shr 1) - -(i_15_ * systemFontGlyphs.method2565()))
                        var i_23_ = 0
                        while (i_15_ > i_23_) {
                            var string = NativeRenderer.aStringArray8019!![i_23_]!!
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
                if (MapRegionLoader.anInt1272 > i_8_ || i_7_ > MapRegionLoader.anInt1276 || i_10_ < MapRegionLoader.anInt1262 || i_9_ > MapRegionLoader.anInt1268) return true
                MapRegionLoader.method745(var_renderer!!, class348_sub21!!, structConfig)
                if (abstractModelRenderer != null) {
                    if (GlEnvMappedWaterPass.anInt7379 > 0 && ((HslAdjustTextureNode.anInt9399 != -1 && (HslAdjustTextureNode.anInt9399 == class348_sub21.anInt6847)) || (SkeletalAnimFrameLoader.anInt481 != -1 && (structConfig.anInt596 == SkeletalAnimFrameLoader.anInt481)))) {
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
                if (structConfig.aString597 != null && systemFontGlyphs != null) method2683(systemFontGlyphs, class348_sub21, i_16_, 64, i_15_, var_renderer, i_17_, i_18_, structConfig)
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
                throw TextureLoadException.method2929(runtimeexception, ("bp.C(" + i + ',' + (if (structConfig != null) "{...}" else "null") + ',' + (if (class348_sub21 != null) "{...}" else "null") + ',' + i_5_ + ',' + (if (var_renderer != null) "{...}" else "null") + ',' + i_6_ + ')'))
            }
        }

        @JvmStatic
        fun method1426(i: Int) {
            aFontMetaRef_2539 = null
            aRectangleArray2554 = null
            ByteArrayPool.anIntArray2552 = null
            if (i != 25165) aRectangleArray2554 = null
        }

        var anInt4242: Int = 0
        fun method2683(systemFontGlyphs: SystemFontGlyphs?, class348_sub21: CameraSplineNode?, i: Int, i_0_: Int, i_1_: Int, var_renderer: Renderer?, i_2_: Int, i_3_: Int, structConfig: StructConfig?) {
            var i_2_ = i_2_
            try {
                if (i_0_ == 64) {
                    anInt4242++
                    val i_4_ = -5 + i - i_3_ / 2
                    val i_5_ = i_2_ - -2
                    if (structConfig!!.anInt602 != 0) var_renderer!!.method3675(i_3_ + 10, (-125).toByte(), i_4_, i_5_, (i_2_ - -(systemFontGlyphs!!.method2565() * i_1_) - (i_5_ - 1)), structConfig.anInt602)
                    if (structConfig.anInt604 != 0) var_renderer!!.method3668(i_3_ + 10, i_5_, structConfig.anInt604, i_4_, (i_1_ * systemFontGlyphs!!.method2565() + i_2_ - (i_5_ + -1)), 92)
                    var i_6_ = structConfig.anInt580
                    if (class348_sub21!!.aBoolean6848 && structConfig.anInt567 != -1) i_6_ = structConfig.anInt567
                    var i_7_ = 0
                    while (i_1_ > i_7_) {
                        var string = NativeRenderer.aStringArray8019!![i_7_]
                        if (-1 + i_1_ > i_7_) string = string!!.substring(0, -4 + string.length)
                        systemFontGlyphs!!.method2563(var_renderer!!, string!!, i, i_2_, i_6_, true)
                        i_2_ += systemFontGlyphs.method2565()
                        i_7_++
                    }
                }
            } catch (runtimeexception: RuntimeException) {
                throw TextureLoadException.method2929(runtimeexception, ("eca.A(" + (if (systemFontGlyphs != null) "{...}" else "null") + ',' + (if (class348_sub21 != null) "{...}" else "null") + ',' + i + ',' + i_0_ + ',' + i_1_ + ',' + (if (var_renderer != null) "{...}" else "null") + ',' + i_2_ + ',' + i_3_ + ',' + (if (structConfig != null) "{...}" else "null") + ')'))
            }
        }

        var anInt2988: Int = 0
        fun method1636(i: Int, i_74_: Int, i_75_: Int, i_76_: Int, i_77_: Int, i_78_: Int, i_79_: Int): CircleRasterizer? {
            anInt2988++
            val l = (i_76_.toLong() * 76724863L xor (i.toLong() * 32147369L xor (i_74_.toLong() * 986053L xor (i_75_.toLong() * 67481L xor i_77_.toLong() * 97549L xor i_79_.toLong() * 475427L))))
            var circleRasterizer = PlayerAppearanceUpdateDecoder.aLruByteCache_4543!!.method583(l, 90) as CircleRasterizer?
            if (circleRasterizer != null) return circleRasterizer
            circleRasterizer = TerrainChunkBuilder.aRenderer1098!!.method3697(i_75_, i_77_, i_79_, i_74_, i, i_76_)
            if (i_78_ != -1) method1636(58, 63, -99, -89, -7, 18, 71)
            PlayerAppearanceUpdateDecoder.aLruByteCache_4543!!.method582(circleRasterizer, l, (-106).toByte())
            return circleRasterizer
        }
    }
}
