import AbstractProceduralTextureNodeStatics.method3038
import InvertTextureNodeStatics.method3134
import GameClock.method599
import SceneObjectSpawnerStatics.method773

object ServerConnectionInfoStatics {
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
                if (BrightnessContrastEffectStatics.aBoolean9181) {
                    BrightnessContrastEffectStatics.aBoolean9181 = false
                    i = 0
                }
                anInt2140++
                if (WaterDetailOptionStateStatics.aModelLightingConfig_5990 == null || !WaterDetailOptionStateStatics.aModelLightingConfig_5990!!.method1424(modelLightingConfig!!, 84.toByte())) {
                    WaterDetailOptionStateStatics.aModelLightingConfig_5990 = modelLightingConfig
                    AnimationFrameDefinitionStatics.aLong6963 = method599(-78)
                    TexGenMaterialPassStatics.anInt6248 = i
                    FrameBufferObjectStatics.anInt4889 = TexGenMaterialPassStatics.anInt6248
                    if (FrameBufferObjectStatics.anInt4889 == 0) method3134(-1)
                    else {
                        TileSceneEntityStatics.aFloat8725 = KeyboardLayoutConfigStatics.aFloat2137
                        DelegatingRenderCanvasStatics.anInt70 = LocTypeDefLoaderStatics.anInt2500
                        SceneryDetailOptionStateStatics.aCircleRasterizer_6098 = HeapInfoRecordStatics.aCircleRasterizer_4938
                        AbstractModelStatics.aFloat1136 = TextureMetadataProviderStatics.aFloat4626
                        DebugOverlayRenderer.aFloat3172 = NormalMapGeneratorStatics.aFloat3462
                        Js5ArchiveStatics.aFloat670 = ModelVertexColorBufferStatics.aFloat6586
                        GlTexture1DStatics.aFloat8560 = RangedGraphicsOptionStateStatics.aFloat5945
                        ParticleEmitterFactoryStatics.aFloat3177 = CollisionMapStatics.aFloat4455
                        GroundDecorEntityStatics.anInt8739 = NativeIndexBufferStatics.anInt4703
                        NoOpGraphicsOptionStateStatics.anInt6042 = AnimationFrameTable.anInt486
                    }
                }
                if (bool != false) aBoolean2151 = true
            }
    
            @JvmStatic
            fun method1261(i: Byte) {
                if (i > 46) anIntArray2145 = null
            }
    
            fun method1263(bool: Boolean) {
                IntHashSetStatics.aClass348_Sub51_3959!!.method3429(74.toByte(), (IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub27_7255), 1)
                anInt2142++
                IntHashSetStatics.aClass348_Sub51_3959!!.method3429(74.toByte(), (IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub27_7261), 1)
                IntHashSetStatics.aClass348_Sub51_3959!!.method3429(74.toByte(), (IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub14_7250), 1)
                IntHashSetStatics.aClass348_Sub51_3959!!.method3429(74.toByte(), (IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub14_7264), 1)
                IntHashSetStatics.aClass348_Sub51_3959!!.method3429(74.toByte(), (IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub4_7220), 1)
                IntHashSetStatics.aClass348_Sub51_3959!!.method3429(74.toByte(), (IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub9_7256), 1)
                IntHashSetStatics.aClass348_Sub51_3959!!.method3429(74.toByte(), (IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub13_7236), 0)
                IntHashSetStatics.aClass348_Sub51_3959!!.method3429(74.toByte(), (IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub1_7246), 0)
                IntHashSetStatics.aClass348_Sub51_3959!!.method3429(74.toByte(), (IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub21_7270), 0)
                IntHashSetStatics.aClass348_Sub51_3959!!.method3429(74.toByte(), (IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub7_7238), 0)
                IntHashSetStatics.aClass348_Sub51_3959!!.method3429(74.toByte(), (IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub24_7235), 0)
                IntHashSetStatics.aClass348_Sub51_3959!!.method3429(74.toByte(), (IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub28_7230), 0)
                IntHashSetStatics.aClass348_Sub51_3959!!.method3429(74.toByte(), (IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub18_7259), 0)
                IntHashSetStatics.aClass348_Sub51_3959!!.method3429(74.toByte(), (IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub16_7247), 0)
                IntHashSetStatics.aClass348_Sub51_3959!!.method3429(74.toByte(), (IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub20_7216), 0)
                IntHashSetStatics.aClass348_Sub51_3959!!.method3429(74.toByte(), (IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub20_7248), 0)
                IntHashSetStatics.aClass348_Sub51_3959!!.method3429(74.toByte(), (IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub15_7224), 0)
                IntHashSetStatics.aClass348_Sub51_3959!!.method3429(74.toByte(), (IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub6_7226), 0)
                IntHashSetStatics.aClass348_Sub51_3959!!.method3429(74.toByte(), (IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub12_7243), 0)
                WorldMapSceneStatics.method1686(55)
                IntHashSetStatics.aClass348_Sub51_3959!!.method3429(74.toByte(), (IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub23_7231), 2)
                IntHashSetStatics.aClass348_Sub51_3959!!.method3429(74.toByte(), (IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub29_7229), 2)
                method3038(-1)
                method773(bool)
                TextureLoadExceptionStatics.aBoolean4604 = true
            }
}
