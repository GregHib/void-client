import MinimapRectClipper.method226
import SceneTilePlaneManager.method260
import SoundBankPatch.Companion.method2929
import TextureAtlasState.Companion.method3490
import Js5Archive.Companion.method395

/* Class362 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
object Tooltip {
    var aFont_4456: Font? = null
    var anInt4457: Int = 0
    @JvmField
    var anInt4458: Int = -1
    @JvmField
    var anInt4459: Int = 0
    var aParticleDefLoader_4460: ParticleDefLoader? = null

    @JvmStatic
    fun method3511(bool: Boolean, font: Font?, fontDefinition: FontDefinition?, string: String?, i: Int, var_renderer: Renderer?) {
        var class324 = font
        var class143 = fontDefinition
        try {
            if (i != 2) aFont_4456 = null
            anInt4457++
            val bool_0_ = !LocalizedTextTriple.aBoolean3763 || method3490(true)
            if (bool_0_) {
                if (LocalizedTextTriple.aBoolean3763 && bool_0_) {
                    class143 = ClanChatRequestSender.aFontDefinition_3649
                    class324 = var_renderer!!.method3686(class143, (ProportionalScrollbarComponent.aSpriteImageArray9929), true)
                    var i_1_ = class143!!.method1187(string, false, 250, null)
                    var i_2_ = class143.method1185(null, i xor 0x2, class143.anInt1992, 250, string)
                    val i_3_ = RegionTileNode.aSpriteImage_6643!!.anInt2702
                    val i_4_ = i_3_ + 4
                    i_2_ += 2 * i_4_
                    i_1_ += 2 * i_4_
                    if (i_2_ < NormalMapGenerator.anInt3451) i_2_ = NormalMapGenerator.anInt3451
                    if (i_1_ < RegionSceneLoader.anInt3704) i_1_ = RegionSceneLoader.anInt3704
                    var i_5_ = (DirectionUtil.aScreenAnchorAlignment_1542!!.method1607(NpcSpawnDecoder.anInt1524, i_1_, (-107).toByte()) - -BufferToggleState.anInt3712)
                    var i_6_ = (DefaultGraphicsOptionState.aTileRenderState_6128!!.method2679(OpenGlRenderer.anInt7666, i_2_, 1595) + ChatEffectsOptionState.anInt5871)
                    if (GrayscaleNoiseTexture.aBoolean5300) {
                        i_5_ += NativeTerrainTile.method4008((-124).toByte())
                        i_6_ += method260(false)
                    }
                    var_renderer.method3691(ScriptCompilerThread.aSpriteImage_1727, false)!!.method965((ColorThresholdEffect.aSpriteImage_9090!!.anInt2702) + i_5_, (ColorThresholdEffect.aSpriteImage_9090!!.anInt2696) + i_6_, -(2 * (ColorThresholdEffect.aSpriteImage_9090!!.anInt2702)) + i_1_, -((ColorThresholdEffect.aSpriteImage_9090!!.anInt2696) * 2) + i_2_, 1, 0, 0)
                    var_renderer.method3691(ColorThresholdEffect.aSpriteImage_9090, true)!!.method974(i_5_, i_6_)
                    ColorThresholdEffect.aSpriteImage_9090!!.method1518()
                    var_renderer.method3691(ColorThresholdEffect.aSpriteImage_9090, true)!!.method974(i_5_ + i_1_ - i_3_, i_6_)
                    ColorThresholdEffect.aSpriteImage_9090!!.method1514()
                    var_renderer.method3691(ColorThresholdEffect.aSpriteImage_9090, true)!!.method974(i_5_ - -i_1_ + -i_3_, -i_3_ + (i_6_ - -i_2_))
                    ColorThresholdEffect.aSpriteImage_9090!!.method1518()
                    var_renderer.method3691(ColorThresholdEffect.aSpriteImage_9090, true)!!.method974(i_5_, -i_3_ + i_6_ - -i_2_)
                    ColorThresholdEffect.aSpriteImage_9090!!.method1514()
                    var_renderer.method3691(RegionTileNode.aSpriteImage_6643, true)!!.method972(i_5_, (ColorThresholdEffect.aSpriteImage_9090!!.anInt2696) + i_6_, i_3_, -(2 * (ColorThresholdEffect.aSpriteImage_9090!!.anInt2696)) + i_2_)
                    RegionTileNode.aSpriteImage_6643!!.method1520()
                    var_renderer.method3691(RegionTileNode.aSpriteImage_6643, true)!!.method972((ColorThresholdEffect.aSpriteImage_9090!!.anInt2702) + i_5_, i_6_, -((ColorThresholdEffect.aSpriteImage_9090!!.anInt2702) * 2) + i_1_, i_3_)
                    RegionTileNode.aSpriteImage_6643!!.method1520()
                    var_renderer.method3691(RegionTileNode.aSpriteImage_6643, true)!!.method972(i_5_ - -i_1_ + -i_3_, (ColorThresholdEffect.aSpriteImage_9090!!.anInt2696) + i_6_, i_3_, -(2 * (ColorThresholdEffect.aSpriteImage_9090!!.anInt2696)) + i_2_)
                    RegionTileNode.aSpriteImage_6643!!.method1520()
                    var_renderer.method3691(RegionTileNode.aSpriteImage_6643, true)!!.method972((ColorThresholdEffect.aSpriteImage_9090!!.anInt2702) + i_5_, -i_3_ + i_6_ - -i_2_, -(2 * (ColorThresholdEffect.aSpriteImage_9090!!.anInt2702)) + i_1_, i_3_)
                    RegionTileNode.aSpriteImage_6643!!.method1520()
                    class324!!.method2584(null, 0, -1, null, 0xffffff.inv() or DrawListState.anInt1479, 1, i_2_ + -(i_4_ * 2), null, i_6_ + i_4_, 0, 0, -(2 * i_4_) + i_1_, i_5_ + i_4_, false, 1, string)
                    method226(i_5_, i_1_, i_6_, i xor 0x2, i_2_)
                } else {
                    val i_7_ = class143!!.method1187(string, false, 250, null)
                    val i_8_ = class143.method1190(null, 1, string, 250) * 13
                    val i_9_ = 4
                    val i_10_ = 6 - -i_9_
                    val i_11_ = i_9_ + 6
                    var_renderer!!.aa(i_10_ + -i_9_, i_11_ + -i_9_, i_9_ + i_7_ + i_9_, i_8_ + (i_9_ - -i_9_), -16777216, 0)
                    var_renderer.method3628(i_10_ - i_9_, -i_9_ + i_11_, i_9_ + (i_7_ + i_9_), i_9_ + i_9_ + i_8_, -1, 0)
                    class324!!.method2584(null, 0, -1, null, -1, 1, i_8_, null, i_11_, 0, 0, i_7_, i_10_, false, 1, string)
                    method226(i_10_ - i_9_, i_9_ + i_7_ - -i_9_, i_11_ + -i_9_, i + -2, i_9_ + i_8_ - -i_9_)
                }
                if (bool) {
                    try {
                        if (!GrayscaleNoiseTexture.aBoolean5300) var_renderer.method3689(118.toByte())
                        else method395(i + 79)
                    } catch (exception_sub1: Exception_Sub1) {
                        /* empty */
                    }
                }
            }
        } catch (runtimeexception: RuntimeException) {
            throw method2929(runtimeexception, ("fg.A(" + bool + ',' + (if (class324 != null) "{...}" else "null") + ',' + (if (class143 != null) "{...}" else "null") + ',' + (if (string != null) "{...}" else "null") + ',' + i + ',' + (if (var_renderer != null) "{...}" else "null") + ')'))
        }
    }

    @JvmStatic
    fun method3512(i: Int) {
        aParticleDefLoader_4460 = null
        if (i != 4) anInt4458 = 96
        aFont_4456 = null
    }
}
