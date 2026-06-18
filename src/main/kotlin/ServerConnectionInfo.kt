import AbstractProceduralTextureNode.Companion.method3038
import InvertTextureNode.Companion.method3134
import GameClock.method599
import Class76.Companion.method773

/* Class161 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class ServerConnectionInfo {
    @JvmField
    var anInt2138: Int
    private var aBoolean2139 = false
    @JvmField
    var anInt2143: Int = 0
    private var aBoolean2146 = true
    @JvmField
    var aString2147: String? = null
    @JvmField
    var anInt2148: Int = 43594
    fun method1259(i: Int) {
        if (i != 0) method1258(39, 119, 4)
        anInt2149++
        if (!aBoolean2146) {
            aBoolean2139 = true
            aBoolean2146 = true
        } else if (!aBoolean2139) aBoolean2146 = false
        else aBoolean2139 = false
    }

    fun method1262(privilegedOperationWorker: PrivilegedOperationWorker, i: Byte): LinkedQueueNode? {
        if (i.toInt() != 36) method1258(-105, -70, -80)
        anInt2144++
        return privilegedOperationWorker.method2235(aBoolean2139, (if (aBoolean2146) this.anInt2138 else this.anInt2148), this.aString2147, i.toInt() xor 0x6e65)
    }

    fun method1264(i: Byte, serverConnectionInfo_2_: ServerConnectionInfo?): Boolean {
        if (i <= 69) return false
        anInt2141++
        if (serverConnectionInfo_2_ != null) {
            return (this.anInt2143 == serverConnectionInfo_2_.anInt2143) && this.aString2147 == serverConnectionInfo_2_.aString2147
        }
        return false
    }

    init {
        this.anInt2138 = Loader.port
    }

    companion object {
        var anInt2140: Int = 0
        var anInt2141: Int = 0
        var anInt2142: Int = 0
        var anInt2144: Int = 0
        var anIntArray2145: IntArray? = IntArray(25)
        var anInt2149: Int = 0
        var anInt2150: Int = 0
        @JvmField
        var aBoolean2151: Boolean = false

        @JvmStatic
        fun method1258(i: Int, i_0_: Int, i_1_: Int): Boolean {
            if (i_0_ != -9301) method1263(true)
            anInt2150++
            return (0x800 and i) != 0
        }

        fun method1260(bool: Boolean, i: Int, modelLightingConfig: ModelLightingConfig?) {
            var i = i
            if (BrightnessContrastEffect.aBoolean9181) {
                BrightnessContrastEffect.aBoolean9181 = false
                i = 0
            }
            anInt2140++
            if (WaterDetailOptionState.aModelLightingConfig_5990 == null || !WaterDetailOptionState.aModelLightingConfig_5990!!.method1424(modelLightingConfig!!, 84.toByte())) {
                WaterDetailOptionState.aModelLightingConfig_5990 = modelLightingConfig
                AnimationFrameDefinition.aLong6963 = method599(-78)
                TexGenMaterialPass.anInt6248 = i
                FrameBufferObject.anInt4889 = TexGenMaterialPass.anInt6248
                if (FrameBufferObject.anInt4889 == 0) method3134(-1)
                else {
                    TileSceneEntity.aFloat8725 = KeyboardLayoutConfig.Companion.aFloat2137
                    DelegatingRenderCanvas.anInt70 = LocTypeDefLoader.anInt2500
                    SceneryDetailOptionState.aCircleRasterizer_6098 = HeapInfoRecord.aCircleRasterizer_4938
                    AbstractModel.aFloat1136 = TextureMetadataProvider.aFloat4626
                    DebugOverlayRenderer.aFloat3172 = NormalMapGenerator.aFloat3462
                    Js5Archive.aFloat670 = ModelVertexColorBuffer.aFloat6586
                    GlTexture1D.aFloat8560 = RangedGraphicsOptionState.aFloat5945
                    ParticleEmitterFactory.aFloat3177 = CollisionMap.aFloat4455
                    GroundDecorEntity.anInt8739 = NativeIndexBuffer.anInt4703
                    NoOpGraphicsOptionState.anInt6042 = AnimationFrameTable.anInt486
                }
            }
            if (bool != false) aBoolean2151 = true
        }

        @JvmStatic
        fun method1261(i: Byte) {
            if (i > 46) anIntArray2145 = null
        }

        fun method1263(bool: Boolean) {
            IntHashSet.aClass348_Sub51_3959!!.method3429(74.toByte(), (IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub27_7255), 1)
            anInt2142++
            IntHashSet.aClass348_Sub51_3959!!.method3429(74.toByte(), (IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub27_7261), 1)
            IntHashSet.aClass348_Sub51_3959!!.method3429(74.toByte(), (IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub14_7250), 1)
            IntHashSet.aClass348_Sub51_3959!!.method3429(74.toByte(), (IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub14_7264), 1)
            IntHashSet.aClass348_Sub51_3959!!.method3429(74.toByte(), (IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub4_7220), 1)
            IntHashSet.aClass348_Sub51_3959!!.method3429(74.toByte(), (IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub9_7256), 1)
            IntHashSet.aClass348_Sub51_3959!!.method3429(74.toByte(), (IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub13_7236), 0)
            IntHashSet.aClass348_Sub51_3959!!.method3429(74.toByte(), (IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub1_7246), 0)
            IntHashSet.aClass348_Sub51_3959!!.method3429(74.toByte(), (IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub21_7270), 0)
            IntHashSet.aClass348_Sub51_3959!!.method3429(74.toByte(), (IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub7_7238), 0)
            IntHashSet.aClass348_Sub51_3959!!.method3429(74.toByte(), (IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub24_7235), 0)
            IntHashSet.aClass348_Sub51_3959!!.method3429(74.toByte(), (IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub28_7230), 0)
            IntHashSet.aClass348_Sub51_3959!!.method3429(74.toByte(), (IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub18_7259), 0)
            IntHashSet.aClass348_Sub51_3959!!.method3429(74.toByte(), (IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub16_7247), 0)
            IntHashSet.aClass348_Sub51_3959!!.method3429(74.toByte(), (IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub20_7216), 0)
            IntHashSet.aClass348_Sub51_3959!!.method3429(74.toByte(), (IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub20_7248), 0)
            IntHashSet.aClass348_Sub51_3959!!.method3429(74.toByte(), (IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub15_7224), 0)
            IntHashSet.aClass348_Sub51_3959!!.method3429(74.toByte(), (IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub6_7226), 0)
            IntHashSet.aClass348_Sub51_3959!!.method3429(74.toByte(), (IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub12_7243), 0)
            WorldMapScene.method1686(55)
            IntHashSet.aClass348_Sub51_3959!!.method3429(74.toByte(), (IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub23_7231), 2)
            IntHashSet.aClass348_Sub51_3959!!.method3429(74.toByte(), (IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub29_7229), 2)
            method3038(-1)
            method773(bool)
            RuntimeException_Sub1.aBoolean4604 = true
        }
    }
}
