import ScrollTexMaterialPass.Companion.method2169
import WhirlpoolHash.Companion.anInt1067
import WhirlpoolHash.Companion.anInt3225
import WhirlpoolHash.Companion.anInt425
import WhirlpoolHash.Companion.anInt4267
import WhirlpoolHash.Companion.anInt6008
import WhirlpoolHash.Companion.anInt7207
import WhirlpoolHash.Companion.anInt8854
import WhirlpoolHash.Companion.method1752

/* Class121 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
object MinimapFlagRenderer {
    @JvmField
    var anInt1794: Int
    @JvmField
    var anInt1795: Int = 0
    var anInt1796: Int = 0
    @JvmField
    var anInt1797: Int = 0
    @JvmField
    var anInt1798: Int = 0
    @JvmField
    var anInt1799: Int = 0
    @JvmField
    var aAbstractModelRenderer_1800: AbstractModelRenderer? = null

    @JvmStatic
    fun method1081(i: Byte) {
        val i_0_ = -38 % ((i - 57) / 62)
        aAbstractModelRenderer_1800 = null
    }

    fun method1082(i: Int, bool: Boolean): Int {
        anInt1795++
        var i_1_ = WhirlpoolHash.anInt7207
        while_44_@ do {
            do {
                if (i_1_ == 0) {
                    if (bool) return 0
                    return MapRegionLoaderThread.anInt4211
                } else if (i_1_ != 1) {
                    if (i_1_ == 2) break
                    break@while_44_
                }
                return MapRegionLoaderThread.anInt4211
            } while (false)
            return 0
        } while (false)
        i_1_ = -103 / ((i - -37) / 39)
        return 0
    }

    @JvmStatic
    fun method1083(var_renderer: Renderer?, i: Int, i_2_: Byte, i_3_: Int, i_4_: Int, i_5_: Int) {
        anInt1798++
        CameraRotationStub.aRenderer326 = var_renderer
        NpcConfig.aAbstractCameraTransform_905 = CameraRotationStub.aRenderer326!!.method3654()
        MapSceneRenderer.aAbstractCameraTransform_624 = CameraRotationStub.aRenderer326!!.method3654()
        RenderNodeStatics.aAbstractCameraTransform_9720 = CameraRotationStub.aRenderer326!!.method3654()
        WhirlpoolHash.anInt10444 = i_4_
        WhirlpoolHash.anInt7207 = 0
        WhirlpoolHash.anInt2747 = i
        LocalPlayerState.anIntArray1909 = null
        NpcSpawnDecoder.anSpriteDrawTargetArray1525 = null
        method828(38.toByte(), i_3_, i_5_)
        ProjectileConfigUtil.anInt396 = -1
        LocalizedTextTriple.anInt3760 = -1
        WorldMapAreaLabel.anInt8583 = -1
        val i_6_ = 90 % ((70 - i_2_) / 33)
    }

    var anInt1467: Int = 0

    fun method828(i: Byte, i_13_: Int, i_14_: Int) {
        anInt1467++
        if (CameraRotationStub.aRenderer326 != null) {
            val i_15_ = anInt425
            val i_16_ = anInt3225
            method1752(-1, i_13_, i_14_)
            if (anInt7207 == 0) {
                WidgetDefinition.anSpriteDrawTarget_252 = null
                WidgetDefinition.anSpriteDrawTarget_252 = (CameraRotationStub.aRenderer326!!.method3634(CameraRotationStub.aRenderer326!!.method3665((anInt8854), anInt6008), CameraRotationStub.aRenderer326!!.method3624((anInt8854), anInt6008)))
            } else if (anInt7207 == 1 && (NpcSpawnDecoder.anSpriteDrawTargetArray1525 == null || i_15_ != anInt425 || i_16_ != anInt3225)) {
                NpcSpawnDecoder.anSpriteDrawTargetArray1525 = arrayOfNulls<SpriteDrawTarget>(anInt3225 * anInt425)
                var i_17_ = 0
                while (NpcSpawnDecoder.anSpriteDrawTargetArray1525!!.size > i_17_) {
                    NpcSpawnDecoder.anSpriteDrawTargetArray1525!![i_17_] = (CameraRotationStub.aRenderer326!!.method3634(CameraRotationStub.aRenderer326!!.method3665(anInt1067, anInt4267), CameraRotationStub.aRenderer326!!.method3624(anInt1067, anInt4267)))
                    i_17_++
                }
                LocalPlayerState.anIntArray1909 = IntArray(anInt425 * anInt3225)
                GroundDecorSceneEntity.anInt9997 = 1
            }
            PcmStreamBuffer.aBoolean8870 = true
        }
    }

    @JvmStatic
    fun method1084(i: Int, i_7_: Int, i_8_: Int, i_9_: Int, i_10_: Int, i_11_: Int, i_12_: Int): Boolean {
        anInt1799++
        val i_13_ = i_9_ - -i_7_
        val i_14_ = i + i_10_
        val i_15_ = i_8_ + i_11_
        if (!method2169(i_9_, i_13_, i_8_, i_9_, i_15_, i_14_, i_14_, i_14_, i_15_, false)) return false
        if (i_12_ != 18507) method1082(-107, false)
        if (!method2169(i_9_, i_13_, i_8_, i_13_, i_15_, i_14_, i_14_, i_14_, i_8_, false)) return false
        if (TextureDefinitionLoader.anInt1974 > i_9_) {
            if (!method2169(i_9_, i_9_, i_15_, i_9_, i_15_, i_14_, i_14_, i_10_, i_8_, false)) return false
            if (!method2169(i_9_, i_9_, i_15_, i_9_, i_8_, i_14_, i_10_, i_10_, i_8_, false)) return false
        } else {
            if (!method2169(i_13_, i_13_, i_15_, i_13_, i_15_, i_14_, i_14_, i_10_, i_8_, false)) return false
            if (!method2169(i_13_, i_13_, i_15_, i_13_, i_8_, i_14_, i_10_, i_10_, i_8_, false)) return false
        }
        if (i_8_ >= BlendTextureNode.anInt9360) {
            if (!method2169(i_9_, i_13_, i_15_, i_9_, i_15_, i_14_, i_14_, i_10_, i_15_, false)) return false
            return method2169(i_9_, i_13_, i_15_, i_13_, i_15_, i_14_, i_10_, i_10_, i_15_, false)
        } else {
            if (!method2169(i_9_, i_13_, i_8_, i_9_, i_8_, i_14_, i_14_, i_10_, i_8_, false)) return false
            return method2169(i_9_, i_13_, i_8_, i_13_, i_8_, i_14_, i_10_, i_10_, i_8_, false)
        }
    }

    init {
        anInt1794 = -1
    }
}
