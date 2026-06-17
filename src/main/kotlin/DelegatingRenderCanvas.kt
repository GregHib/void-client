import GameAppletFrame.Companion.method94
import BloomGraphicsOptionState.Companion.method1772
import CameraDistanceOptionState.Companion.method1725
import Class286_Sub3.Companion.method2148
import Class299_Sub2_Sub1.Companion.method2271
import Class348_Sub1.Companion.method2718
import Class369_Sub1.Companion.method3570
import NativeRenderer.Companion.method3936
import java.awt.Canvas
import java.awt.Component
import java.awt.Graphics

/*
 * Canvas_Sub1
 */
class DelegatingRenderCanvas internal constructor(private val aComponent64: Component) : Canvas() {
    override fun update(graphics: Graphics?) {
        anInt61++
        aComponent64.update(graphics)
    }

    override fun paint(graphics: Graphics?) {
        aComponent64.paint(graphics)
        anInt65++
    }

    companion object {
        @JvmField
        var anIntArray60: IntArray?
        @JvmField
        var anInt61: Int = 0
        @JvmField
        var anInt62: Int = 0
        @JvmField
        var anInt63: Int = 0
        @JvmField
        var anInt65: Int = 0
        @JvmField
        var anInt66: Int = 0
        @JvmField
        var anInt67: Int = 0
        @JvmField
        var anInt68: Int = 0
        @JvmField
        var anInt69: Int = 0
        @JvmField
        var anInt70: Int = 0

        @JvmStatic
        fun method119(i: Int, l: Long) {
            try {
                anInt66++
                val i_0_ = (ConnectionStateRefs.anInt319 + LocalPlayerState.aPlayer_1907!!.x)
                val i_1_ = (Class260.anInt3310 + LocalPlayerState.aPlayer_1907!!.y)
                if (-i_0_ + FrameStatsReset.anInt5799 < -2000 || -i_0_ + FrameStatsReset.anInt5799 > 2000 || AsyncTaskHandle.anInt2578 - i_1_ < -2000 || -i_1_ + AsyncTaskHandle.anInt2578 > 2000) {
                    AsyncTaskHandle.anInt2578 = i_1_
                    FrameStatsReset.anInt5799 = i_0_
                }
                if (FrameStatsReset.anInt5799 != i_0_) {
                    val i_2_ = i_0_ - FrameStatsReset.anInt5799
                    var i_3_ = (i_2_.toLong() * l / 320L).toInt()
                    if (i_2_ <= 0) {
                        if (i_3_ == 0) i_3_ = -1
                        else if (i_3_ < i_2_) i_3_ = i_2_
                    } else if (i_3_ == 0) i_3_ = 1
                    else if (i_3_ > i_2_) i_3_ = i_2_
                    FrameStatsReset.anInt5799 += i_3_
                }
                if (i == -1) {
                    Class314.aFloat3938 += CircleDrawer.aFloat2687 * l.toFloat() / 6.0f
                    if (i_1_ != AsyncTaskHandle.anInt2578) {
                        val i_4_ = i_1_ - AsyncTaskHandle.anInt2578
                        var i_5_ = (i_4_.toLong() * l / 320L).toInt()
                        if (i_4_ > 0) {
                            if (i_5_ != 0) {
                                if (i_5_ > i_4_) i_5_ = i_4_
                            } else i_5_ = 1
                        } else if (i_5_ != 0) {
                            if (i_5_ < i_4_) i_5_ = i_4_
                        } else i_5_ = -1
                        AsyncTaskHandle.anInt2578 += i_5_
                    }
                    Class76.aFloat1287 += Class348_Sub27.aFloat6898 * l.toFloat() / 6.0f
                    method1725(262144)
                }
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, "vg.A(" + i + ',' + l + ')')
            }
        }

        @JvmStatic
        fun method120(bool: Boolean) {
            anIntArray60 = null
            if (bool != false) anIntArray60 = null
        }

        fun method121(i: Int, i_6_: Int, bool: Boolean, i_7_: Int, i_8_: Int, i_9_: Int) {
            if (i_6_ != -364570972) anInt70 = -4
            anInt68++
            val l = (i or (if (!bool) 0 else -2147483648)).toLong()
            var class348_sub13 = (Class348_Sub40.aClass356_7041!!.method3480(l, -6008) as Class348_Sub13?)
            if (class348_sub13 == null) {
                class348_sub13 = Class348_Sub13()
                Class348_Sub40.aClass356_7041!!.method3483(109.toByte(), l, class348_sub13)
            }
            if (class348_sub13.anIntArray6757!!.size <= i_7_) {
                val `is` = IntArray(1 + i_7_)
                val is_10_ = IntArray(1 + i_7_)
                var i_11_ = 0
                while ((class348_sub13.anIntArray6757!!.size > i_11_)) {
                    `is`[i_11_] = class348_sub13.anIntArray6757!![i_11_]
                    is_10_[i_11_] = class348_sub13.anIntArray6758[i_11_]
                    i_11_++
                }
                for (i_12_ in class348_sub13.anIntArray6757!!.size..<i_7_) {
                    `is`[i_12_] = -1
                    is_10_[i_12_] = 0
                }
                class348_sub13.anIntArray6757 = `is`
                class348_sub13.anIntArray6758 = is_10_
            }
            class348_sub13.anIntArray6757!![i_7_] = i_9_
            class348_sub13.anIntArray6758[i_7_] = i_8_
        }

        fun method122(i: Int, i_13_: Int, i_14_: Int, i_15_: Int, i_16_: Int, i_17_: Byte, var_renderer: Renderer): Class64? {
            anInt62++
            if (i_17_.toInt() != -35) anInt70 = 10
            val l = i_16_.toLong()
            var class64 = CharCountUtil.aClass60_225!!.method583(l, 81) as Class64?
            val i_18_ = 2055
            if (class64 == null) {
                val class124 = Class300.method2277(0, RasterSprite.aClass45_5207!!, i_16_, -1)
                if (class124 == null) return null
                if (class124.anInt1830 < 13) class124.method1092(2, 105)
                class64 = var_renderer.method3625(class124, i_18_, RefCountedHandle.anInt2275, 64, 768)
                CharCountUtil.aClass60_225!!.method582(class64, l, (-122).toByte())
            }
            class64 = class64.method614(2.toByte(), i_18_, true)
            if (i_15_ != 0) class64!!.a(i_15_)
            if (i_13_ != 0) class64!!.FA(i_13_)
            if (i_14_ != 0) class64!!.VA(i_14_)
            if (i != 0) class64!!.H(0, i, 0)
            return class64
        }

        @JvmStatic
        fun method123(i: Int) {
            anInt63++
            Class289.method2193(false, (-125).toByte())
            Class268.anInt3441 = 0
            var bool = true
            var i_19_ = 0
            while (Class347.aByteArrayArray4281!!.size > i_19_) {
                if (NativeSprite.anIntArray5192!![i_19_] != -1 && Class347.aByteArrayArray4281!![i_19_] == null) {
                    Class347.aByteArrayArray4281!![i_19_] = Class367_Sub10.aClass45_7382!!.method410(-1860, NativeSprite.anIntArray5192!![i_19_], 0)
                    if (Class347.aByteArrayArray4281!![i_19_] == null) {
                        bool = false
                        Class268.anInt3441++
                    }
                }
                if (GameAppletFrame.anIntArray38!![i_19_] != -1 && GlRectangleTexture.aByteArrayArray8642!![i_19_] == null) {
                    GlRectangleTexture.aByteArrayArray8642!![i_19_] = (Class367_Sub10.aClass45_7382!!.method393(GameAppletFrame.anIntArray38!![i_19_], 0, i + 2, BrightnessOptionState.anIntArrayArray5894!![i_19_]))
                    if (GlRectangleTexture.aByteArrayArray8642!![i_19_] == null) {
                        Class268.anInt3441++
                        bool = false
                    }
                }
                if (Class295.anIntArray3759!![i_19_] != -1 && ModelFacePriorityNode.aByteArrayArray1887!![i_19_] == null) {
                    ModelFacePriorityNode.aByteArrayArray1887!![i_19_] = Class367_Sub10.aClass45_7382!!.method410(-1860, Class295.anIntArray3759!![i_19_], 0)
                    if (ModelFacePriorityNode.aByteArrayArray1887!![i_19_] == null) {
                        Class268.anInt3441++
                        bool = false
                    }
                }
                if (RenderNode.anIntArray9724!![i_19_] != -1 && Class348_Sub23_Sub1.aByteArrayArray8996!![i_19_] == null) {
                    Class348_Sub23_Sub1.aByteArrayArray8996!![i_19_] = Class367_Sub10.aClass45_7382!!.method410(-1860, RenderNode.anIntArray9724!![i_19_], 0)
                    if (Class348_Sub23_Sub1.aByteArrayArray8996!![i_19_] == null) {
                        bool = false
                        Class268.anInt3441++
                    }
                }
                if (Class322.anIntArray4031 != null && Class348_Sub50.aByteArrayArray7212!![i_19_] == null && Class322.anIntArray4031!![i_19_] != -1) {
                    Class348_Sub50.aByteArrayArray7212!![i_19_] = (Class367_Sub10.aClass45_7382!!.method393(Class322.anIntArray4031!![i_19_], 0, i + 2, BrightnessOptionState.anIntArrayArray5894!![i_19_]))
                    if (Class348_Sub50.aByteArrayArray7212!![i_19_] == null) {
                        bool = false
                        Class268.anInt3441++
                    }
                }
                i_19_++
            }
            if (OpenGlRenderNode.aSmoothingBuffer_10488 == null) {
                if (Class348_Sub26.aClass348_Sub42_Sub14_6885 != null && (Class348_Sub32.aClass45_6950!!.method400(-18308, (Class348_Sub26.aClass348_Sub42_Sub14_6885!!.aString9625) + "_staticelements"))) {
                    if (Class348_Sub32.aClass45_6950!!.method413(100, (Class348_Sub26.aClass348_Sub42_Sub14_6885!!.aString9625) + "_staticelements")) OpenGlRenderNode.aSmoothingBuffer_10488 = Class307.method2300(Class348_Sub32.aClass45_6950, ((Class348_Sub26.aClass348_Sub42_Sub14_6885!!.aString9625) + "_staticelements"), ModelBatchBase.aBoolean1900, (-91).toByte())
                    else {
                        bool = false
                        Class268.anInt3441++
                    }
                } else OpenGlRenderNode.aSmoothingBuffer_10488 = SmoothingBuffer(0)
            }
            if (bool) {
                bool = true
                CompositeNpcModelBuilder.anInt2101 = 0
                for (i_20_ in Class347.aByteArrayArray4281!!.indices) {
                    var `is` = GlRectangleTexture.aByteArrayArray8642!![i_20_]
                    if (`is` != null) {
                        var i_21_ = 64 * (Class348_Sub23_Sub3.anIntArray9042!![i_20_] shr 8) - ArbVertexProgram.regionTileX
                        var i_22_ = 64 * (Class348_Sub23_Sub3.anIntArray9042!![i_20_] and 0xff) - Class90.regionTileY
                        if (Class312.anInt3931 != 0) {
                            i_22_ = 10
                            i_21_ = 10
                        }
                        bool = bool and Class348_Sub41.method3154(Class367_Sub4.anInt7319, i_21_, (Class348_Sub40_Sub3.anInt9109), i_22_, `is`, 39.toByte())
                    }
                    `is` = Class348_Sub23_Sub1.aByteArrayArray8996!![i_20_]
                    if (`is` != null) {
                        var i_23_ = 64 * (Class348_Sub23_Sub3.anIntArray9042!![i_20_] shr 8) - ArbVertexProgram.regionTileX
                        var i_24_ = 64 * (Class348_Sub23_Sub3.anIntArray9042!![i_20_] and 0xff) + -Class90.regionTileY
                        if (Class312.anInt3931 != 0) {
                            i_24_ = 10
                            i_23_ = 10
                        }
                        bool = bool and Class348_Sub41.method3154(Class367_Sub4.anInt7319, i_23_, (Class348_Sub40_Sub3.anInt9109), i_24_, `is`, 39.toByte())
                    }
                }
                if (bool) {
                    if (Class36.anInt489 != 0) Class362.method3511(true, GameAppletFrame.aClass324_20, ParticleEmitterFactory.aFontDefinition_3179, ((Class274.aClass274_3495!!.method2063(Class348_Sub33.anInt6967, 544)) + "<br>(100%)"), 2, Class348_Sub8.aRenderer6654)
                    method3570(false)
                    Class348_Sub18.method2938(102.toByte())
                    method1772(i xor 0x41)
                    var bool_25_ = false
                    if (Class348_Sub8.aRenderer6654!!.method3639() && Class316.aClass348_Sub51_3959!!.aClass239_Sub18_7259!!.method1800(-32350) == 2) {
                        var i_26_ = 0
                        while ((i_26_ < Class347.aByteArrayArray4281!!.size)) {
                            if ((Class348_Sub23_Sub1.aByteArrayArray8996!![i_26_] != null) || ModelFacePriorityNode.aByteArrayArray1887!![i_26_] != null) {
                                bool_25_ = true
                                break
                            }
                            i_26_++
                        }
                    }
                    var i_27_: Int
                    if (Class316.aClass348_Sub51_3959!!.aClass239_Sub16_7247!!.method1789(-32350) != 1) i_27_ = Class9.anIntArray168!![Class348_Sub15.anInt6769]
                    else i_27_ = (Class286_Sub8.anIntArray6296!![Class348_Sub15.anInt6769])
                    if (Class348_Sub8.aRenderer6654!!.method3670()) i_27_++
                    Class348_Sub42_Sub2.method3171(Class348_Sub8.aRenderer6654, ShadowQualityOptionState.anInt6012, 9, 4, Class367_Sub4.anInt7319, Class348_Sub40_Sub3.anInt9109, i_27_, bool_25_, Class348_Sub8.aRenderer6654!!.method3704() > 0)
                    Class348_Sub32.method3018(Class318_Sub1_Sub4_Sub2.anInt10096)
                    if (Class318_Sub1_Sub4_Sub2.anInt10096 != 0) Class348_Sub48.method3328(WorldMapRenderer.aClass324_4684)
                    else Class348_Sub48.method3328(null)
                    for (i_28_ in 0..3) Class348_Sub45.aClass361Array7108!![i_28_]!!.method3500(i xor 0x2bc)
                    Class52.method491((-86).toByte())
                    FloatCameraTransform.method921(99.toByte(), false)
                    method3936(i + i)
                    KeyboardLayoutCache.aClass305_3304 = null
                    Class55_Sub1.aBoolean5265 = false
                    method3570(false)
                    System.gc()
                    Class289.method2193(true, (-128).toByte())
                    Class36.method354(2)
                    Class291.anInt3720 = Class316.aClass348_Sub51_3959!!.aClass239_Sub7_7238!!.method1748(-32350)
                    Class296.aBoolean3767 = TextureDefinitionCache.anInt2964 >= 96
                    Class369.aBoolean4972 = Class316.aClass348_Sub51_3959!!.aClass239_Sub18_7259!!.method1800(-32350) == 2
                    TextureGenerator.aBoolean2492 = Class316.aClass348_Sub51_3959!!.aClass239_Sub28_7230!!.method1845(i + -32350) == 1
                    OutputStream_Sub2.anInt101 = if (Class316.aClass348_Sub51_3959!!.aClass239_Sub27_7261!!.method1840(-32350) == 1) -1 else ParticleSystemState.anInt2204
                    IOException_Sub1.aBoolean86 = Class316.aClass348_Sub51_3959!!.aClass239_Sub9_7256!!.method1759(-32350) == 1
                    Class47.aBoolean845 = Class316.aClass348_Sub51_3959!!.aClass239_Sub24_7235!!.method1820(i xor 0x7e5d.inv()) == 1
                    Class338.aClass237_Sub1_4197 = WorldMapSceneSoftware(4, Class367_Sub4.anInt7319, Class348_Sub40_Sub3.anInt9109, false)
                    if (Class312.anInt3931 != 0) Class44.method385(false, Class338.aClass237_Sub1_4197, Class347.aByteArrayArray4281)
                    else Class348_Sub1_Sub1.method2727((-65).toByte(), Class338.aClass237_Sub1_4197, (Class347.aByteArrayArray4281))
                    GroundItemRenderState.method1015(Class367_Sub4.anInt7319 shr 4, (Class348_Sub40_Sub3.anInt9109 shr 4), true)
                    Class348_Sub42_Sub3.method3175((-77).toByte())
                    if (bool_25_) {
                        DoublyLinkedNodeList.method1879(true)
                        VarpStore.aClass237_Sub1_5067 = WorldMapSceneSoftware(1, Class367_Sub4.anInt7319, Class348_Sub40_Sub3.anInt9109, true)
                        if (Class312.anInt3931 == 0) {
                            Class348_Sub1_Sub1.method2727((-44).toByte(), (VarpStore.aClass237_Sub1_5067), (ModelFacePriorityNode.aByteArrayArray1887))
                            Class289.method2193(true, (-119).toByte())
                        } else {
                            Class44.method385(false, VarpStore.aClass237_Sub1_5067, ModelFacePriorityNode.aByteArrayArray1887)
                            Class289.method2193(true, (-125).toByte())
                        }
                        VarpStore.aClass237_Sub1_5067!!.method1679(0, 0, (Class338.aClass237_Sub1_4197!!.anIntArrayArrayArray3122[0]!!))
                        VarpStore.aClass237_Sub1_5067!!.method1685(Class348_Sub8.aRenderer6654, null, 21407, null)
                        DoublyLinkedNodeList.method1879(false)
                    }
                    Class338.aClass237_Sub1_4197!!.method1685(Class348_Sub8.aRenderer6654, (if (!bool_25_) null else (VarpStore.aClass237_Sub1_5067!!.anIntArrayArrayArray3122)), 21407, Class348_Sub45.aClass361Array7108)
                    if (Class312.anInt3931 == 0) {
                        Class289.method2193(true, (-128).toByte())
                        ObjectSpawnDecoder.method1090(GlRectangleTexture.aByteArrayArray8642, i + 65536, Class338.aClass237_Sub1_4197)
                        if (Class348_Sub50.aByteArrayArray7212 != null) Class92.method859(i xor 0x7e.inv())
                    } else {
                        Class289.method2193(true, (-121).toByte())
                        ProjectionCameraTransform.method944(i + -8212, GlRectangleTexture.aByteArrayArray8642, Class338.aClass237_Sub1_4197)
                    }
                    Class348_Sub18.method2938(66.toByte())
                    if (TextureDefinitionCache.anInt2964 < 96) method2271(31268)
                    Class289.method2193(true, (-119).toByte())
                    Class338.aClass237_Sub1_4197!!.method1680(null, (-125).toByte(), (if (!bool_25_) null else (Class332.aTerrainTileArray4142!![0])), Class348_Sub8.aRenderer6654)
                    Class338.aClass237_Sub1_4197!!.method1697(false, Class348_Sub8.aRenderer6654, -36)
                    Class289.method2193(true, (-122).toByte())
                    if (bool_25_) {
                        DoublyLinkedNodeList.method1879(true)
                        Class289.method2193(true, (-124).toByte())
                        if (Class312.anInt3931 != 0) ProjectionCameraTransform.method944(-8212, (Class348_Sub23_Sub1.aByteArrayArray8996), VarpStore.aClass237_Sub1_5067)
                        else ObjectSpawnDecoder.method1090((Class348_Sub23_Sub1.aByteArrayArray8996), i + 65536, VarpStore.aClass237_Sub1_5067)
                        Class348_Sub18.method2938(73.toByte())
                        Class289.method2193(true, (-121).toByte())
                        VarpStore.aClass237_Sub1_5067!!.method1680((Class348_Sub1_Sub1.aTerrainTileArray8801!![0]), (-127).toByte(), null, (Class348_Sub8.aRenderer6654))
                        VarpStore.aClass237_Sub1_5067!!.method1697(true, Class348_Sub8.aRenderer6654, i + -60)
                        Class289.method2193(true, (-126).toByte())
                        DoublyLinkedNodeList.method1879(false)
                    }
                    Class348_Sub50.method3419(13022)
                    var i_29_ = Class338.aClass237_Sub1_4197!!.anInt5824
                    if (i_29_ > Class355.anInt4372) i_29_ = Class355.anInt4372
                    if (i_29_ < -1 + Class355.anInt4372) i_29_ = Class355.anInt4372 - 1
                    if (Class316.aClass348_Sub51_3959!!.aClass239_Sub27_7261!!.method1840(-32350) == 0) Class84.method824(i_29_)
                    else Class84.method824(0)
                    for (i_30_ in 0..3) {
                        var i_31_ = 0
                        while (Class367_Sub4.anInt7319 > i_31_) {
                            var i_32_ = 0
                            while (Class348_Sub40_Sub3.anInt9109 > i_32_) {
                                ProjectileSpawner.method1479(i_32_, (-126).toByte(), i_31_, i_30_)
                                i_32_++
                            }
                            i_31_++
                        }
                    }
                    Class348_Sub40_Sub9.method3072((-99).toByte())
                    method3570(false)
                    Class363.method3514((-105).toByte())
                    Class348_Sub18.method2938(62.toByte())
                    FrameStatsReset.method1131(99)
                    if (Class52.aFrame4904 != null && Class348_Sub40_Sub8.aAbstractGameSocket_9165 != null && WorldMapRenderer.anInt4674 == 11) {
                        Class352.anInt4335++
                        val class348_sub47 = method2148(Class327.aClass351_4094, (Class348_Sub23_Sub2.aClass77_9029), i xor 0x55.inv())
                        class348_sub47.aClass348_Sub49_Sub2_7116!!.writeInt(108.toByte(), 1057001181)
                        Class348_Sub42_Sub14.method3243(-122, class348_sub47)
                    }
                    if (Class312.anInt3931 == 0) {
                        val i_33_ = ((Renderer.anInt4581 + -(Class367_Sub4.anInt7319 shr 4)) / 8)
                        val i_34_ = ((Renderer.anInt4581 - -(Class367_Sub4.anInt7319 shr 4)) / 8)
                        val i_35_ = ((Class327.anInt4095 + -(Class348_Sub40_Sub3.anInt9109 shr 4)) / 8)
                        val i_36_ = (((Class348_Sub40_Sub3.anInt9109 shr 4) + Class327.anInt4095) / 8)
                        for (i_37_ in i_33_ - 1..i_34_ - -1) {
                            for (i_38_ in i_35_ + -1..i_36_ - -1) {
                                if (i_33_ > i_37_ || i_34_ < i_37_ || i_38_ < i_35_ || i_38_ > i_36_) {
                                    Class367_Sub10.aClass45_7382!!.method409("m" + i_37_ + "_" + i_38_, true)
                                    Class367_Sub10.aClass45_7382!!.method409("l" + i_37_ + "_" + i_38_, true)
                                }
                            }
                        }
                    }
                    if (WorldMapRenderer.anInt4674 != 4) {
                        if (WorldMapRenderer.anInt4674 != 8) {
                            Class348_Sub49.method3379(2, 10)
                            if (Class348_Sub40_Sub8.aAbstractGameSocket_9165 != null) {
                                val class348_sub47 = method2148((Class340.aClass351_4223), (Class348_Sub23_Sub2.aClass77_9029), -106)
                                Class348_Sub42_Sub14.method3243(127, class348_sub47)
                            }
                        } else Class348_Sub49.method3379(2, 7)
                    } else Class348_Sub49.method3379(i xor 0x2, 3)
                    method2718(-106)
                    method3570(false)
                    Class94.method867(true)
                    Class348_Sub16_Sub2.aBoolean8870 = true
                    if (GlTexture1D.aBoolean8558) {
                        method94(("Took: " + (Class62.method599(-117) + -Class90.aLong1516) + "ms"), i + 52)
                        GlTexture1D.aBoolean8558 = false
                    }
                } else Class36.anInt489 = 2
            } else Class36.anInt489 = 1
        }

        init {
            anIntArray60 = IntArray(8)
        }
    }
}
