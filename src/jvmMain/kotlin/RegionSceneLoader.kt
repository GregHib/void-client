import LightDetailOptionStateStatics.method1802
import WaterMaterialPassStatics.method2148
import WorldMapAreaLabelStatics.method3570
import java.io.IOException

/* Class289 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
object RegionSceneLoader {
    var anInt3696: Int = 0
    @JvmField
    var aBoolean3697: Boolean = false
    var anInt3698: Int = 0
    @JvmField
    var anInt3699: Int
    @JvmField
    var aByteArrayArrayArray3700: Array<Array<ByteArray?>?>? = null
    @JvmField
    var aWidgetComponent_3701: WidgetComponent? = null
    var anInt3702: Int = 0
    var anInt3703: Int = 0
    @JvmField
    var anInt3704: Int = 0
    @JvmField
    var aNodeDeque_3705: NodeDeque? = null

    @JvmStatic
    fun method2191(i: Int) {
        if (i != 0) RegionSceneLoader.method2192((-74).toByte())
        aWidgetComponent_3701 = null
        aByteArrayArrayArray3700 = null
        aNodeDeque_3705 = null
    }

    fun method2192(i: Byte) {
        BackgroundWorkerThreadStatics.anInt3227 = 0
        anInt3702++
        val i_0_ = (((LocalPlayerState.aPlayer_1907!!.x) shr 9) - -ArbVertexProgramStatics.regionTileX)
        val i_1_ = (RegionMapDecoder.regionTileY + (LocalPlayerState.aPlayer_1907!!.y shr 9))
        if (i.toInt() != 80) RegionSceneLoader.method2192((-34).toByte())
        if (i_0_ >= 3053 && i_0_ <= 3156 && i_1_ >= 3056 && i_1_ <= 3136) BackgroundWorkerThreadStatics.anInt3227 = 1
        if (i_0_ >= 3072 && i_0_ <= 3118 && i_1_ >= 9492 && i_1_ <= 9535) BackgroundWorkerThreadStatics.anInt3227 = 1
        if (BackgroundWorkerThreadStatics.anInt3227 == 1 && i_0_ >= 3139 && i_0_ <= 3199 && i_1_ >= 3008 && i_1_ <= 3062) BackgroundWorkerThreadStatics.anInt3227 = 0
    }

    @JvmStatic
    fun method2193(bool: Boolean, i: Byte) {
        anInt3698++
        method3570(false)
        if (CameraOrModelTransformStatics.method2653(true, WorldMapRendererStatics.anInt4674)) {
            SceneRegionState.anInt193++
            if (i < -118 && (SceneRegionState.anInt193 >= 50 || bool)) {
                SceneRegionState.anInt193 = 0
                if (!AbstractMenuEntryStatics.aBoolean1712 && PerlinNoiseTextureNodeStatics.aAbstractGameSocket_9165 != null) {
                    IOException_Sub1Statics.anInt88++
                    val class348_sub47 = method2148((RangedGraphicsOptionStateStatics.aFontMetaRef_5938), (TheoraVideoStreamStatics.aIsaacCipher_9029), -106)
                    InterfaceComponentGroupStatics.method3243(122, class348_sub47)
                    try {
                        method1802(0)
                    } catch (ioexception: IOException) {
                        AbstractMenuEntryStatics.aBoolean1712 = true
                    }
                }
                method3570(false)
            }
        }
    }

    @JvmStatic
    fun method2194(i: Int, class348_sub42_sub13: ContactList?): Int {
        anInt3696++
        if (i != -1) return -42
        val string = MenuActionNodeStatics.method2812(i + -43, class348_sub42_sub13!!)
        return WorldMapLabelStatics.aFontDefinition_4962!!.method1186(string, TileRenderStateStatics.aAbstractModelRendererArray4234, false)
    }

    init {
        anInt3699 = 0
    }
}
