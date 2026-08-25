import kotlin.jvm.JvmStatic
import TexGenMaterialPass.Companion.method2161
import TypedRecordTable.Companion.method2178
import HeightMapNoise.method2278
import ConfigVarProgress.Companion.method2312
import ConnectionStateType.Companion.method527
import MapRegionLoader.Companion.method751
import MapRegionLoader.Companion.method758
import ChatMessageStream.Companion.method136
import awt.Frame

class MapElementDecor internal constructor(private val anInt10355: Int, i_34_: Int, i_35_: Int, i_36_: Int, i_37_: Int, i_38_: Int, i_39_: Int, i_40_: Int, i_41_: Int, i_42_: Int, i_43_: Int, i_44_: Int, i_45_: Int) : GroundDecorEntity(i_36_, i_37_, i_38_, i_39_, i_40_, i_41_, i_42_, i_43_, i_44_, false, 0.toByte()) {
    private var anInt10331 = 0
    private var aWidgetDefinition_10332: WidgetDefinition? = null
    private var anInt10334 = 0
    private var anInt10335 = 0
    private var aBoolean10338 = true
    private var anInt10339 = 0
    private var aClass318_Sub10_10341: SceneGraphContainer? = null
    var aBoolean10345: Boolean = false
    var anInt10349: Int
    private val anInt10350: Int
    private var anInt10356 = 0
    public override fun method2386(i: Int, var_renderer: Renderer?): SceneEntityModel? {
        anInt10352++
        val class64 = method2465(var_renderer, anInt10355, (if (anInt10334 == 0) 0 else 5) or 0x800, (-82).toByte())
        if (class64 == null) return null
        if (anInt10334 != 0) class64.a(anInt10334 * 2048)
        val class101 = var_renderer!!.method3705()
        class101.method894(this.x, this.anInt6382, this.y)
        method2467(class64, var_renderer, -1, class101)
        val class318_sub4 = method136(i, false, false)
        if (ParticleSystemRenderer.aBoolean3870) class64.method608(class101, (class318_sub4.aClass318_Sub3Array6414!![0]), LocalPlayerState.anInt1906, 0)
        else class64.method615(class101, (class318_sub4.aClass318_Sub3Array6414!![0]), 0)
        if (aClass318_Sub10_10341 != null) {
            val class98 = aClass318_Sub10_10341!!.method2525()
            if (!ParticleSystemRenderer.aBoolean3870) var_renderer.method3684(class98)
            else var_renderer.method3685(class98, LocalPlayerState.anInt1906)
        }
        aBoolean10338 = class64.F()
        anInt10331 = class64.fa()
        anInt10356 = class64.ma()
        return class318_sub4
    }

    public override fun method2394(bool: Boolean): Int {
        if (bool != true) return 18
        anInt10337++
        return anInt10331
    }

    public override fun method2380(var_renderer: Renderer?, i: Int, bool: Boolean, class318_sub1: SceneEntity?, i_0_: Int, i_1_: Byte, i_2_: Int) {
        try {
            anInt10347++
            if (i_1_ > -106) this.aBoolean10345 = false
            throw IllegalStateException()
        } catch (runtimeexception: RuntimeException) {
            throw TextureLoadException.method2929(runtimeexception, ("lf.N(" + (if (var_renderer != null) "{...}" else "null") + ',' + i + ',' + bool + ',' + (if (class318_sub1 != null) "{...}" else "null") + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ')'))
        }
    }

    protected fun finalize() {
        anInt10329++
        if (aClass318_Sub10_10341 != null) aClass318_Sub10_10341!!.method2534()
    }

    public override fun method2392(bool: Boolean) {
        anInt10343++
        if (bool != true) aWidgetDefinition_10332 = null
        throw IllegalStateException()
    }

    public override fun method2376(i: Int): Boolean {
        if (i > -12) return false
        anInt10362++
        return false
    }

    private fun method2465(var_renderer: Renderer?, i: Int, i_26_: Int, i_27_: Byte): AbstractModel? {
        anInt10353++
        if (i_27_.toInt() != -82) return null
        val class368 = ConstantColourTextureNode.aMapElementDefinitionCache_9245!!.method2543(122.toByte(), i)
        val var_s = TerrainTileShape.aTerrainTileArray8801!![this.plane.toInt()]
        val var_s_28_ = (if (this.aByte6376 < 3) (TerrainTileShape.aTerrainTileArray8801!![1 + this.aByte6376]) else null)
        if (!this.aBoolean10345) return class368.method3565(anInt10339, anInt10335, this.anInt6382, i_26_, true, var_renderer, anInt10350, this.x, -129, ParticleEmitterNode.aWidgetCache_191, var_s_28_, this.y, var_s)
        return class368.method3565(0, -1, this.anInt6382, i_26_, true, var_renderer, -1, this.x, -129, ParticleEmitterNode.aWidgetCache_191, var_s_28_, this.y, var_s)
    }

    fun method2466(bool: Boolean) {
        if (bool == false) {
            if (aClass318_Sub10_10341 != null) aClass318_Sub10_10341!!.method2534()
            anInt10359++
        }
    }

    public override fun method2377(i: Byte): Boolean {
        anInt10358++
        if (i.toInt() != 122) method2388(-40)
        return aBoolean10338
    }

    private fun method2467(abstractModel: AbstractModel?, var_renderer: Renderer?, i: Int, abstractCameraTransform: AbstractCameraTransform?) {
        do {
            try {
                abstractModel!!.method620(abstractCameraTransform)
                anInt10360++
                val class129s = abstractModel.method619()
                val class342s = abstractModel.method604()
                if (i == -1) {
                    if ((aClass318_Sub10_10341 == null || (aClass318_Sub10_10341!!.aBoolean6470)) && (class129s != null || class342s != null)) aClass318_Sub10_10341 = SceneGraphContainer.Companion.method2526(GlGroundShaderPass.anInt7396, true)
                    if (aClass318_Sub10_10341 == null) break
                    aClass318_Sub10_10341!!.method2536(var_renderer, GlGroundShaderPass.anInt7396.toLong(), class129s, class342s, false)
                    aClass318_Sub10_10341!!.method2533(this.plane.toInt(), this.aShort8743.toInt(), this.aShort8751.toInt(), this.aShort8750.toInt(), this.aShort8747.toInt())
                }
            } catch (runtimeexception: RuntimeException) {
                throw TextureLoadException.method2929(runtimeexception, ("lf.BA(" + (if (abstractModel != null) "{...}" else "null") + ',' + (if (var_renderer != null) "{...}" else "null") + ',' + i + ',' + (if (abstractCameraTransform != null) "{...}" else "null") + ')'))
            }
            break
        } while (false)
    }

    public override fun method2379(i: Int): Int {
        anInt10342++
        if (i != -25675) anInt10334 = 73
        return anInt10356
    }

    public override fun method2381(var_renderer: Renderer?, i: Int): CircleHitbox? {
        if (i != 7) method2387(null, -106)
        anInt10363++
        return null
    }

    public override fun method2388(i: Int): Boolean {
        if (i >= -65) return false
        anInt10328++
        return false
    }

    public override fun method2387(var_renderer: Renderer?, i: Int) {
        if (i >= -125) anInt10331 = 38
        anInt10354++
        val class64 = method2465(var_renderer, anInt10355, 0, (-82).toByte())
        if (class64 != null) {
            val class101 = var_renderer!!.method3705()
            class101.method894(this.x, this.anInt6382, this.y)
            method2467(class64, var_renderer, -1, class101)
        }
    }

    public override fun method2391(var_renderer: Renderer?, i: Int, i_29_: Int, i_30_: Int): Boolean {
        anInt10346++
        if (i_30_ != 0) return false
        return false
    }

    init {
        anInt10350 = -1
        anInt10334 = i_45_
        this.anInt10349 = i_35_ + i_34_
        val class368 = ConstantColourTextureNode.aMapElementDefinitionCache_9245!!.method2543(57.toByte(), anInt10355)
        val i_46_ = class368.anInt4503
        if (i_46_ == -1) this.aBoolean10345 = true
        else {
            aWidgetDefinition_10332 = ParticleEmitterNode.aWidgetCache_191!!.method835(i_46_, 7)
            this.aBoolean10345 = false
        }
        if (this.anInt10349 == i_35_) method2178(this, anInt10335, aWidgetDefinition_10332, -99)
    }

    fun method2470(i: Int, i_47_: Byte) {
        if (i_47_ <= -14) {
            anInt10333++
            if (!this.aBoolean10345) {
                anInt10339 += i
                while (aWidgetDefinition_10332!!.anIntArray267!![anInt10335] < anInt10339) {
                    anInt10339 -= (aWidgetDefinition_10332!!.anIntArray267!![anInt10335])
                    anInt10335++
                    if (aWidgetDefinition_10332!!.anIntArray237.size <= anInt10335) {
                        this.aBoolean10345 = true
                        break
                    }
                }
                if (!this.aBoolean10345) method2178(this, anInt10335, aWidgetDefinition_10332, -59)
            }
        }
    }

    companion object {
        var anInt10328: Int = 0
        var anInt10329: Int = 0

        var aMapTileShapeArray10330: Array<MapTileShape?>? = null
        var anInt10333: Int = 0

        var aWidgetComponent_10336: WidgetComponent? = null
        var anInt10337: Int = 0
        var anInt10340: Int = 0
        var anInt10342: Int = 0
        var anInt10343: Int = 0
        var anInt10344: Int = 0
        var anInt10346: Int = 0
        var anInt10347: Int = 0
        var anInt10348: Int = 0
        var anInt10351: Int = 0
        var anInt10352: Int = 0
        var anInt10353: Int = 0
        var anInt10354: Int = 0
        var anInt10357: Int = 0
        var anInt10358: Int = 0
        var anInt10359: Int = 0
        var anInt10360: Int = 0
        var anInt10361: Int = 0
        var anInt10362: Int = 0
        var anInt10363: Int = 0

        var anInt10364: Int = 0

        fun method2461(class318_sub6: SceneEffectMarker, bool: Boolean) {
            if (bool != true) aWidgetComponent_10336 = null
            class318_sub6.aClass318_Sub1_Sub3_Sub3_6431 = null
            anInt10361++
            if (RendererType.anInt4474 < 20) {
                GameClock.aDoublyLinkedNodeList_1114!!.method1869(-89, class318_sub6)
                RendererType.anInt4474++
            }
        }

        fun method2462(i: Int, i_3_: Int, i_4_: Int): Int {
            anInt10351++
            var i_5_ = (method2278(4, 91923 + i_4_, 120.toByte(), i_3_ + 45365) - 128 + ((method2278(2, 37821 + i_4_, 122.toByte(), 10294 + i_3_) - 128 shr 1) + (-128 + method2278(1, i_4_, 120.toByte(), i_3_) shr 2)))
            i_5_ = (0.3 * i_5_.toDouble()).toInt() + 35
            if (i_5_ >= 10) {
                if (i_5_ > 60) i_5_ = 60
            } else i_5_ = 10
            return i_5_
        }

        fun method2463(i: Int, i_6_: Int, privilegedOperationWorker: PrivilegedOperationWorker, i_7_: Int, i_8_: Int, i_9_: Int): Frame? {
            var i_7_ = i_7_
            anInt10344++
            if (!privilegedOperationWorker.method2247(-4)) return null
            if (i_7_ == 0) {
                val class57s = WorldListEntry.method286((-49).toByte(), privilegedOperationWorker)
                if (class57s == null) return null
                var bool = false
                var i_10_ = 0
                while (class57s.size > i_10_) {
                    if (i_6_ == class57s[i_10_]!!.anInt1047 && (i == class57s[i_10_]!!.anInt1054) && (i_9_ == 0 || (class57s[i_10_]!!.anInt1052 == i_9_)) && (!bool || (class57s[i_10_]!!.anInt1046 > i_7_))) {
                        i_7_ = class57s[i_10_]!!.anInt1046
                        bool = true
                    }
                    i_10_++
                }
                if (!bool) return null
            }
            val class144 = privilegedOperationWorker.method2229(i_9_, i, i_7_, i_6_, (-11).toByte())
            while (class144.anInt1997 == 0) method2161(19.toByte(), 10L)
            val frame = class144.anObject1998 as Frame?
            if (frame == null) return null
            if (i_8_ != 14199) return null
            if (class144.anInt1997 == 2) {
                method527(frame, privilegedOperationWorker, false)
                return null
            }
            return frame
        }

        fun method2464(i: Byte, i_11_: Int, i_12_: Int, i_13_: Int, var_renderer: Renderer?, i_14_: Int, var_renderConfig: RenderConfig?) {
            do {
                try {
                    anInt10357++
                    if (LinkedListNodeStatics.anInt4290 < 100) SpotAnimEntity.Companion.method2512(var_renderConfig, var_renderer, i.toInt() xor 0x74)
                    var_renderer!!.KA(i_11_, i_14_, i_12_ + i_11_, i_14_ + i_13_)
                    if (LinkedListNodeStatics.anInt4290 < 100) {
                        val i_15_ = 20
                        val i_16_ = i_12_ / 2 + i_11_
                        val i_17_ = i_14_ - -(i_13_ / 2) - 18 - i_15_
                        var_renderer.aa(i_11_, i_14_, i_12_, i_13_, -16777216, 0)
                        var_renderer.method3628(-152 + i_16_, i_17_, 304, 34, LoadingBarRenderer.aColorArray9163!![UnderlayDefinition.anInt2884]!!.getRGB(), 0)
                        var_renderer.aa(i_16_ - 150, 2 + i_17_, LinkedListNodeStatics.anInt4290 * 3, 30, GlVertexBufferBase.aColorArray1928!![UnderlayDefinition.anInt2884]!!.getRGB(), 0)
                        NodeDequeStatics.aRSFont_3326!!.method2575((-116).toByte(), i_16_, MinimapPolygonDrawer.aColorArray5242!![UnderlayDefinition.anInt2884]!!.getRGB(), LocalizedText.aLocalizedText_3501!!.method2063(ChatCommandProcessor.anInt6967, i + 551), -1, i_15_ + i_17_)
                    } else {
                        val i_18_ = (WidgetActionEntry.anInt6992 + -(i_12_.toFloat() / MapRegionLoader.aFloat1247).toInt())
                        val i_19_ = ((i_13_.toFloat() / MapRegionLoader.aFloat1247).toInt() + DebugOverlayRenderer.anInt3170)
                        val i_20_ = ((i_12_.toFloat() / MapRegionLoader.aFloat1247).toInt() + WidgetActionEntry.anInt6992)
                        StaticNoiseTexture.anInt8665 = DebugOverlayRenderer.anInt3170 + -(i_13_.toFloat() / MapRegionLoader.aFloat1247).toInt()
                        LocConfigModelBuilder.anInt4509 = (WidgetActionEntry.anInt6992 + -(i_12_.toFloat() / MapRegionLoader.aFloat1247).toInt())
                        val i_21_ = (DebugOverlayRenderer.anInt3170 + -(i_13_.toFloat() / MapRegionLoader.aFloat1247).toInt())
                        LoadProgressCounters.anInt2446 = ((2 * i_13_).toFloat() / MapRegionLoader.aFloat1247).toInt()
                        SpriteStore.anInt370 = ((i_12_ * 2).toFloat() / MapRegionLoader.aFloat1247).toInt()
                        method751(i_18_ + MapRegionLoader.anInt1266, i_19_ + MapRegionLoader.anInt1263, i_20_ - -MapRegionLoader.anInt1266, MapRegionLoader.anInt1263 + i_21_, i_11_, i_14_, i_12_ + i_11_, i_13_ + i_14_ + 1)
                        MapRegionLoader.method748(var_renderer)
                        if (i.toInt() != -7) method2462(63, -7, -14)
                        val class262 = method758(var_renderer)
                        method2312(-13084, 0, class262, 0, var_renderer)
                        if (GlEnvMappedWaterPass.anInt7379 > 0) {
                            ClientLoadStateMachine.anInt2173--
                            if (ClientLoadStateMachine.anInt2173 == 0) {
                                GlEnvMappedWaterPass.anInt7379--
                                ClientLoadStateMachine.anInt2173 = 20
                            }
                        }
                        if (!PixelBlender.aBoolean3811) break
                        val i_22_ = -5 + i_11_ + i_12_
                        var i_23_ = -8 + i_13_ + i_14_
                        GameAppletFrame.aRSFont_20!!.method2569("Fps:" + (SimpleToggleOptionState.anInt5891), i_23_, 16776960, i_22_, i + -116, -1)
                        i_23_ -= 15
                        val runtime = Runtime.getRuntime()
                        val i_24_ = ((runtime.totalMemory() + -runtime.freeMemory()) / 1024L).toInt()
                        var i_25_ = 16776960
                        if (i_24_ > 65536) i_25_ = 16711680
                        GameAppletFrame.aRSFont_20!!.method2569("Mem:" + i_24_ + "k", i_23_, i_25_, i_22_, -127, -1)
                        i_23_ -= 15
                    }
                } catch (runtimeexception: RuntimeException) {
                    throw TextureLoadException.method2929(runtimeexception, ("lf.L(" + i + ',' + i_11_ + ',' + i_12_ + ',' + i_13_ + ',' + (if (var_renderer != null) "{...}" else "null") + ',' + i_14_ + ',' + (if (var_renderConfig != null) "{...}" else "null") + ')'))
                }
                break
            } while (false)
        }

        fun method2468(i: Int) {
            anInt10348++
            if (i == 3613) {
                var i_31_ = 0
                var i_32_ = 0
                while (GlCubemapLightPass.anInt7319 > i_32_) {
                    var i_33_ = 0
                    while (RangeThresholdTextureNode.anInt9109 > i_33_) {
                        if (GlCubemapLightPass.method3542(i_33_, HintArrowOrMessage.aSceneCollisionEntryArrayArrayArray2029, i_32_, 0, i_31_, true)) i_31_++
                        if (i_31_ >= 512) return
                        i_33_++
                    }
                    i_32_++
                }
            }
        }

        @JvmStatic
        fun method2469(bool: Boolean) {
            aWidgetComponent_10336 = null
            if (bool == true) aMapTileShapeArray10330 = null
        }
    }
}
