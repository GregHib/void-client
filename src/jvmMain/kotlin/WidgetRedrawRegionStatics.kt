import SpotAnimDefCache.method1943
import NodeDequeStatics.method1992
import PositionedSceneNodeStatics.method2519
import java.awt.Image

object WidgetRedrawRegionStatics {
    var anInt4241: Int = 0
            var anInt4242: Int = 0
            var anInt4243: Int = 0
            var aNamedIdRecord_4246: NamedIdRecord? = NamedIdRecord("WTI", 5)
            var aTrigLookupTables_4247: TrigLookupTables?
            var anImage4249: Image? = null
            var anIntArray4250: IntArray? = IntArray(64)
            var anInt4251: Int = 0
            @JvmField
            var anIntArrayArray4253: Array<IntArray?>? = null
            var aLruByteCache_4254: LruByteCache?
    
            @JvmStatic
            fun method2682(i: Int) {
                aNamedIdRecord_4246 = null
                anIntArrayArray4253 = null
                if (i > 5) {
                    aTrigLookupTables_4247 = null
                    anIntArray4250 = null
                    aLruByteCache_4254 = null
                    anImage4249 = null
                }
            }
    
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
                            var string = NativeRendererStatics.aStringArray8019!![i_7_]
                            if (-1 + i_1_ > i_7_) string = string!!.substring(0, -4 + string.length)
                            systemFontGlyphs!!.method2563(var_renderer!!, string!!, i, i_2_, i_6_, true)
                            i_2_ += systemFontGlyphs.method2565()
                            i_7_++
                        }
                    }
                } catch (runtimeexception: RuntimeException) {
                    throw SoundBankPatchStatics.method2929(runtimeexception, ("eca.A(" + (if (systemFontGlyphs != null) "{...}" else "null") + ',' + (if (class348_sub21 != null) "{...}" else "null") + ',' + i + ',' + i_0_ + ',' + i_1_ + ',' + (if (var_renderer != null) "{...}" else "null") + ',' + i_2_ + ',' + i_3_ + ',' + (if (structConfig != null) "{...}" else "null") + ')'))
                }
            }
    
            fun method2684(i: Int, f: Float): Float {
                if (i != 6) aTrigLookupTables_4247 = null
                anInt4251++
                return (f * (6.0f * f - 15.0f) + 10.0f) * (f * (f * f))
            }
    
            fun method2686() {
                for (i in DelegatingRenderCanvasStatics.anInt67..<MapAreaDefinitionStatics.anInt2524) {
                    for (i_8_ in 0..<SpotAnimEntityStatics.anInt6451) {
                        for (i_9_ in 0..<RegionSceneShifterStatics.anInt7054) {
                            val class357 = HintArrowOrMessageStatics.aSceneCollisionEntryArrayArrayArray2029!![i]!![i_8_]!![i_9_]
                            if (class357 != null) {
                                val class318_sub1_sub4 = class357.aClass318_Sub1_Sub4_4406
                                val class318_sub1_sub4_10_ = class357.aClass318_Sub1_Sub4_4403
                                if (class318_sub1_sub4 != null && class318_sub1_sub4.method2388(-121)) {
                                    method2519(class318_sub1_sub4, i, i_8_, i_9_, 1, 1)
                                    if (class318_sub1_sub4_10_ != null && class318_sub1_sub4_10_.method2388(-125)) {
                                        method2519(class318_sub1_sub4_10_, i, i_8_, i_9_, 1, 1)
                                        class318_sub1_sub4_10_.method2380(NativeLibraryState.aRenderer171, 0, false, class318_sub1_sub4, 0, (-110).toByte(), 0)
                                        class318_sub1_sub4_10_.method2392(true)
                                    }
                                    class318_sub1_sub4.method2392(true)
                                }
                                var class148 = class357.aWidgetNodeLink_4396
                                while (class148 != null) {
                                    val class318_sub1_sub3 = (class148.aClass318_Sub1_Sub3_2040)
                                    if (class318_sub1_sub3 != null && class318_sub1_sub3.method2388(-71)) {
                                        method2519(class318_sub1_sub3, i, i_8_, i_9_, (class318_sub1_sub3.aShort8751 - class318_sub1_sub3.aShort8743 + 1), (class318_sub1_sub3.aShort8747 - class318_sub1_sub3.aShort8750 + 1))
                                        class318_sub1_sub3.method2392(true)
                                    }
                                    class148 = class148.aWidgetNodeLink_2038
                                }
                                val class318_sub1_sub1 = class357.aClass318_Sub1_Sub1_4402
                                if (class318_sub1_sub1 != null && class318_sub1_sub1.method2388(-85)) {
                                    method1992(class318_sub1_sub1, i, i_8_, i_9_)
                                    class318_sub1_sub1.method2392(true)
                                }
                            }
                        }
                    }
                }
            }
    
            init {
                aTrigLookupTables_4247 = TrigLookupTables()
                aLruByteCache_4254 = LruByteCache(32)
            }
}
