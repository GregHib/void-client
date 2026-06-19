import java.io.IOException
import java.net.Socket

object SocketFactoryStatics {
    @JvmField
            var anInt3471: Int = 0
            @JvmField
            var anInt3472: Int = 0
            @JvmField
            var anInt3473: Int = 0
            @JvmField
            var anInt3474: Int = 0
            @JvmField
            var anIntArray3475: IntArray? = intArrayOf(1, 4, 1, 2)
            @JvmStatic
            fun method2048(i: Int) {
                anIntArray3475 = null
                if (i != 1) anInt3473 = -69
            }
    
            @JvmStatic
            fun method2049(i: Int) {
                anInt3474++
                if (i > 49) {
                    if (WorldMapRendererStatics.anInt4674 == 7) NormalMapTextureNodeStatics.method3141(false, 11.toByte())
                    else {
                        ItemDefinitionStatics.aAbstractGameSocket_2773 = PerlinNoiseTextureNodeStatics.aAbstractGameSocket_9165
                        PerlinNoiseTextureNodeStatics.aAbstractGameSocket_9165 = null
                        ByteBufferStatics.method3379(2, 13)
                    }
                }
            }
    
            @JvmStatic
            fun method2051(i: Int, i_0_: Int, screenAnchorAlignment: ScreenAnchorAlignment?, tileRenderState: TileRenderState?, i_1_: Int, i_2_: Int, i_3_: Int, i_4_: Byte, i_5_: Int, i_6_: Int, i_7_: Int, i_8_: Int) {
                try {
                    DirectionUtil.aScreenAnchorAlignment_1542 = screenAnchorAlignment
                    ChatEffectsOptionStateStatics.anInt5871 = i_7_
                    DefaultGraphicsOptionStateStatics.aTileRenderState_6128 = tileRenderState
                    DrawListState.anInt1479 = i
                    RegionTileNodeStatics.aSpriteImage_6643 = null
                    LocalizedTextTripleStatics.anInt3762 = i_8_
                    ColorThresholdEffectStatics.aSpriteImage_9090 = null
                    RegionSceneLoader.anInt3704 = i_3_
                    ConnectionStateRefs.anInt317 = i_5_
                    anInt3471++
                    NormalMapGeneratorStatics.anInt3451 = i_0_
                    FireParticleStreamStatics.anInt98 = i_2_
                    BufferToggleStateStatics.anInt3712 = i_6_
                    ScriptCompilerThreadStatics.aSpriteImage_1727 = null
                    TerrainShadowBuilderGl2Statics.anInt6938 = i_1_
                    TextureAtlasStateStatics.method3490(true)
                    val i_9_ = -77 % ((i_4_ - 29) / 34)
                    LocalizedTextTripleStatics.aBoolean3763 = true
                } catch (runtimeexception: RuntimeException) {
                    throw SoundBankPatchStatics.method2929(runtimeexception, ("uu.E(" + i + ',' + i_0_ + ',' + (if (screenAnchorAlignment != null) "{...}" else "null") + ',' + (if (tileRenderState != null) "{...}" else "null") + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ')'))
                }
            }
}
