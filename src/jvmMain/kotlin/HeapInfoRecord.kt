import PlayerUpdateDecoder.method1142
import java.io.File
import HeapInfoRecordStatics.aCircleRasterizer_4938
import HeapInfoRecordStatics.anInt4941

/*
 * Class158
 */
class HeapInfoRecord internal constructor(string: String?, screenAnchorAlignment: ScreenAnchorAlignment?, tileRenderState: TileRenderState?, i: Int, i_1_: Int, i_2_: Int, i_3_: Int, i_4_: Int, i_5_: Int, i_6_: Int, i_7_: Int, i_8_: Int, i_9_: Int) : ConfigTypeProvider {
    var anInt4931: Int = 0
    var anInt4932: Int = 0
    var anInt4935: Int = 0
    var anInt4936: Int = 0
    var anInt4937: Int = 0
    var anInt4940: Int = 0
    var aString4942: String? = null
    var anInt4943: Int = 0
    var anInt4944: Int = 0
    var aTileRenderState_4945: TileRenderState? = null
    var anInt4946: Int = 0
    var anInt4947: Int = 0
    var aScreenAnchorAlignment_4948: ScreenAnchorAlignment? = null
    override fun method51(i: Byte): ProjectileFactory? {
        anInt4941++
        if (i <= 116) aCircleRasterizer_4938 = null
        return SpotAnimVectorStatics.aProjectileFactory_2307
    }

    init {
        try {
            this.anInt4946 = i_3_
            this.anInt4932 = i_1_
            this.anInt4943 = i_2_
            this.anInt4944 = i_7_
            this.aString4942 = string
            this.aScreenAnchorAlignment_4948 = screenAnchorAlignment
            this.anInt4931 = i_5_
            this.anInt4940 = i_9_
            this.anInt4947 = i
            this.aTileRenderState_4945 = tileRenderState
            this.anInt4936 = i_6_
            this.anInt4935 = i_8_
            this.anInt4937 = i_4_
        } catch (runtimeexception: RuntimeException) {
            throw SoundBankPatchStatics.method2929(runtimeexception, ("ot.<init>(" + (if (string != null) "{...}" else "null") + ',' + (if (screenAnchorAlignment != null) "{...}" else "null") + ',' + (if (tileRenderState != null) "{...}" else "null") + ',' + i + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ',' + i_9_ + ')'))
        }
    }
}
