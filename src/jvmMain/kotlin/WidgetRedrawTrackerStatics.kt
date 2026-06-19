import FixedFunctionMaterialPassStatics.method2145
import ModelVertexColorBufferStatics.method2739
import BoxBlurTextureNodeStatics.method3147
import RenderListTextureNodeStatics.method3153

object WidgetRedrawTrackerStatics {
    var anInt3924: Int = 0
            var aIntRange_3925: IntRange?
            var anInt3926: Int = 0
            var anInt3927: Int = 0
            var anInt3928: Int = 0
            var anInt3929: Int = 0
            var anInt3930: Int = 2
            @JvmField
            var anInt3931: Int
            @JvmField
            var anInt3932: Int
    
            fun method2330(i: Byte) {
                method2739(0)
                anInt3924++
                if (i.toInt() == 86) {
                    RadialTextureNodeStatics.anInt9341 = 0
                    SineWaveTextureNodeStatics.aIntRange_9456 = null
                    CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.anInt7197 = 0
                    AbstractGameSocketStatics.aIntRange_3133 = null
                    GraphicsOptionStateStatics.aIntRange_3145 = null
                    StringCacheNodeStatics.anInt7213 = 0
                    ModelVertexColorBufferStatics.aIntRange_6584 = null
                    RegionSceneLoader.anInt3699 = 0
                    method3153(0)
                    method3147(27.toByte())
                    for (i_0_ in 0..2047) LoadingBarRendererStatics.aPlayerArray5058!![i_0_] = null
                    LocalPlayerState.aPlayer_1907 = null
                    var i_1_ = 0
                    while (TerrainShadowBuilderGl2Statics.anInt6930 > i_1_) {
                        val npc = (TurbulenceTextureNodeStatics.aClass348_Sub22Array9319!![i_1_]!!.aNpc_6859)
                        if (npc != null) npc.anInt10275 = -1
                        i_1_++
                    }
                    MapElementManager.method3515(i + 36)
                    SequencedWallEntityStatics.anInt10163 = -1
                    NativeLibraryState.anInt167 = SequencedWallEntityStatics.anInt10163
                    WeaveTextureNodeStatics.anInt9282 = 1
                    ByteBufferStatics.method3379(2, 10)
                    for (i_2_ in 0..99) GzipDecompressorStatics.aBooleanArray2076!![i_2_] = true
                    method2145(-24498)
                    LightingOptionStateStatics.aClass348_Sub26_5881 = null
                    FloatCameraTransformStatics.aLong5745 = 0L
                }
            }
    
            @JvmStatic
            fun method2331(bool: Boolean) {
                aIntRange_3925 = null
                if (bool != true) anInt3930 = -53
            }
    
            fun method2332(i: Int, i_3_: Byte, i_4_: Int): Boolean {
                if (i_3_ <= 120) anInt3930 = 6
                anInt3926++
                return (0x20 and i_4_) != 0
            }
    
            init {
                aIntRange_3925 = IntRange(27, 3)
                anInt3931 = 0
                anInt3932 = 1403
            }
}
