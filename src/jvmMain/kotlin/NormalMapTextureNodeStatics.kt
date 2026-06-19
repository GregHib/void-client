import ProjectedGroundDecorStatics.method2433
import AbstractFrameBufferSurfaceStatics.method3007
import SpriteStatics.method160
import kotlin.math.sqrt

object NormalMapTextureNodeStatics {
    @JvmField
            var anIntArray9431: IntArray? = IntArray(1)
            @JvmField
            var aSceneLoaderThreadArray9432: Array<SceneLoaderThread?>? = null
            @JvmField
            var anInt9433: Int = 0
            @JvmField
            var anInt9434: Int = 0
            @JvmField
            var anInt9435: Int = 0
            @JvmField
            var anIntArray9436: IntArray? = IntArray(2)
            @JvmField
            var anInt9437: Int = 0
            @JvmStatic
            fun method3140(i: Int, i_0_: Int): Int {
                val i_1_ = 40 / ((i - 19) / 63)
                anInt9435++
                if (i_0_ == 16711935) return -1
                return method160(27076, i_0_)
            }
    
            @JvmStatic
            fun method3141(bool: Boolean, i: Byte) {
                if (PerlinNoiseTextureNodeStatics.aAbstractGameSocket_9165 != null) {
                    PerlinNoiseTextureNodeStatics.aAbstractGameSocket_9165!!.method1700(36.toByte())
                    PerlinNoiseTextureNodeStatics.aAbstractGameSocket_9165 = null
                }
                anInt9437++
                NpcDefinitionStatics.anInt2955 = 0
                InterfaceBoundsStatics.method2938(87.toByte())
                method2433()
                if (i.toInt() != 11) anIntArray9436 = null
                for (i_2_ in 0..3) TimedRecordAccessorStatics.aCollisionMapArray7108s!![i_2_]!!.method3500(700)
                LoadingScreenImageNodeStatics.method3177(-50, false)
                System.gc()
                method3007(2, 22684)
                RgbColorPaletteStatics.aBoolean1236 = false
                SlotBindingStatics.anInt3428 = -1
                SpriteRgbTextureNodeStatics.method3093(i + 79)
                FloatCameraTransformStatics.method921(99.toByte(), true)
                RegionMapDecoder.regionTileY = 0
                ArbVertexProgramStatics.regionTileX = 0
                RendererStatics.anInt4581 = 0
                FileIoUtil.anInt4095 = 0
                WidgetRedrawTrackerStatics.anInt3931 = 0
                WaterTextureSetStatics.anInt1447 = WidgetRedrawTrackerStatics.anInt3931
                var i_3_ = 0
                while ((i_3_ < MultiFieldRecordStatics.aMinimapPositionStateArray6897s!!.size)) {
                    MultiFieldRecordStatics.aMinimapPositionStateArray6897s!![i_3_] = null
                    i_3_++
                }
                HashLinkedListNodeStatics.method3163((-114).toByte())
                for (i_4_ in 0..2047) LoadingBarRendererStatics.aPlayerArray5058!![i_4_] = null
                ModelDefinitionLoaderStatics.anInt2057 = 0
                NpcEntityUpdater.aHashtable_3654!!.method3481(i.toInt() xor 0xb)
                TerrainShadowBuilderGl2Statics.anInt6930 = 0
                ModelBatchBaseStatics.aHashtable_1895!!.method3481(0)
                MinimapStateReset.method1122(0)
                GlArrayBufferObjectStatics.anInt4718 = 0
                ProjectedGroundDecorStatics.aVarpStore_10209!!.method1314((-107).toByte())
                HeightMapNoise.method2282(-12648)
                MinimapPolygonDrawerStatics.method465(i + -1636518175)
                FloatCameraTransformStatics.aLong5745 = 0L
                LightingOptionStateStatics.aClass348_Sub26_5881 = null
                if (bool) ByteBufferStatics.method3379(2, 12)
                else {
                    ByteBufferStatics.method3379(i + -9, 3)
                    try {
                        JavaScriptBridge.method1617(125.toByte(), JagGlToolkitFactory.anApplet1530, "loggedout")
                    } catch (throwable: Throwable) {
                        /* empty */
                    }
                }
            }
    
            @JvmStatic
            fun method3142(i: Int) {
                anIntArray9431 = null
                anIntArray9436 = null
                if (i != 0) aSceneLoaderThreadArray9432 = null
                aSceneLoaderThreadArray9432 = null
            }
}
