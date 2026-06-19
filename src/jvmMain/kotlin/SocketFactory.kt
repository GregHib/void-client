import java.io.IOException
import java.net.Socket

/*
 * Class272
 */
abstract class SocketFactory {

    var anInt3470: Int = 0

    var aString3476: String? = null

    @Throws(IOException::class)
    fun method2047(i: Byte): Socket {
        anInt3472++
        if (i <= 84) anIntArray3475 = null
        return Socket(this.aString3476, this.anInt3470)
    }

    @Throws(IOException::class)
    abstract fun method2050(i: Int): Socket?

    companion object {

        var anInt3471: Int = 0

        var anInt3472: Int = 0

        var anInt3473: Int = 0

        var anInt3474: Int = 0

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
                if (WorldMapRenderer.anInt4674 == 7) NormalMapTextureNode.method3141(false, 11.toByte())
                else {
                    ItemDefinition.aAbstractGameSocket_2773 = Client.aAbstractGameSocket_9165
                    Client.aAbstractGameSocket_9165 = null
                    ByteBufferStatics.method3379(2, 13)
                }
            }
        }

        @JvmStatic
        fun method2051(i: Int, i_0_: Int, screenAnchorAlignment: ScreenAnchorAlignment?, tileRenderState: TileRenderState?, i_1_: Int, i_2_: Int, i_3_: Int, i_4_: Byte, i_5_: Int, i_6_: Int, i_7_: Int, i_8_: Int) {
            try {
                DirectionUtil.aScreenAnchorAlignment_1542 = screenAnchorAlignment
                ChatEffectsOptionState.anInt5871 = i_7_
                DefaultGraphicsOptionState.aTileRenderState_6128 = tileRenderState
                DrawListState.anInt1479 = i
                RegionTileNode.aSpriteImage_6643 = null
                LocalizedTextTriple.anInt3762 = i_8_
                ColorThresholdEffect.aSpriteImage_9090 = null
                RegionSceneLoader.anInt3704 = i_3_
                ConnectionStateRefs.anInt317 = i_5_
                anInt3471++
                NormalMapGenerator.anInt3451 = i_0_
                FireParticleStream.anInt98 = i_2_
                BufferToggleState.anInt3712 = i_6_
                ScriptCompilerThread.aSpriteImage_1727 = null
                TerrainShadowBuilderGl2.anInt6938 = i_1_
                TextureAtlasState.method3490(true)
                val i_9_ = -77 % ((i_4_ - 29) / 34)
                LocalizedTextTriple.aBoolean3763 = true
            } catch (runtimeexception: RuntimeException) {
                throw TextureLoadException.method2929(runtimeexception, ("uu.E(" + i + ',' + i_0_ + ',' + (if (screenAnchorAlignment != null) "{...}" else "null") + ',' + (if (tileRenderState != null) "{...}" else "null") + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ')'))
            }
        }
    }
}
