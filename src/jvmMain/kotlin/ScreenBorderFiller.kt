import GlEnvMappedWaterPass.Companion.method3551
import java.awt.Color
import java.awt.Container
import java.awt.Rectangle

/*
 * Class140
 */
object ScreenBorderFiller {
    var anInt1956: Int = 0
    var anInt1957: Int = 0
    var anInt1958: Int = 0
    var aIntRange_1959: IntRange? = IntRange(81, 6)
    var anInt1960: Int = 0
    @JvmField
    var aFontMetaRef_1961: FontMetaRef? = FontMetaRef(77, -1)
    @JvmField
    var anInt1962: Int = 0

    @Throws(ClientException::class)
    @JvmStatic
    fun method1168(i: Int, i_0_: Int, rectangles: Array<Rectangle?>?) {
        anInt1957++
        if (WhirlpoolHash.anInt7207 != 1) CameraRotationStub.aRenderer326!!.method3707(rectangles, i, 0, 0)
        else CameraRotationStub.aRenderer326!!.method3707(rectangles, i, MapRegionLoaderThread.anInt4211, PerlinNoiseTextureNode.anInt9157)
        if (i_0_ != 0) aFontMetaRef_1961 = null
    }

    @JvmStatic
    fun method1169(bool: Boolean) {
        aFontMetaRef_1961 = null
        aIntRange_1959 = null
        if (bool != false) aFontMetaRef_1961 = null
    }

    @JvmStatic
    fun method1170(i: Byte) {
        anInt1956++
        if (SkeletalAnimFrameLoader.aFrame476 == null) {
            val i_1_ = ModelResourceBundle.anInt7129
            val i_2_ = TimingCounters.anInt4167
            if (i > -25) ScreenBorderFiller.method1172((-22).toByte(), -1)
            val i_3_ = -i_1_ + -LocTypeDefinition.anInt4017 + SocketFactory.anInt3473
            val i_4_ = -i_2_ + (NpcReference.anInt6857 + -HardCacheEntryReference.anInt10432)
            do {
                if (i_1_ > 0 || i_3_ > 0 || i_2_ > 0 || i_4_ > 0) {
                    try {
                        val container: Container?
                        if (RsaVarbitHandler.aFrame4904 == null) {
                            if (JagGlToolkitFactory.anApplet1530 == null) container = EdgeDetectTextureNode.anGameApplet_Frame_9169
                            else container = JagGlToolkitFactory.anApplet1530 as? Container
                        } else container = RsaVarbitHandler.aFrame4904
                        var i_5_ = 0
                        var i_6_ = 0
                        if (container === RsaVarbitHandler.aFrame4904) {
                            val insets = RsaVarbitHandler.aFrame4904!!.getInsets()
                            i_5_ = insets.left
                            i_6_ = insets.top
                        }
                        val graphics = container!!.getGraphics()
                        graphics.setColor(Color.black)
                        if (i_1_ > 0) graphics.fillRect(i_5_, i_6_, i_1_, NpcReference.anInt6857)
                        if (i_2_ > 0) graphics.fillRect(i_5_, i_6_, SocketFactory.anInt3473, i_2_)
                        if (i_3_ > 0) graphics.fillRect((-i_3_ + SocketFactory.anInt3473 + i_5_), i_6_, i_3_, NpcReference.anInt6857)
                        if (i_4_ <= 0) break
                        graphics.fillRect(i_5_, NpcReference.anInt6857 + (i_6_ - i_4_), SocketFactory.anInt3473, i_4_)
                    } catch (exception: Exception) {
                        break
                    }
                    break
                }
            } while (false)
        }
    }

    fun method1171(i: Int, i_7_: Int, bool: Boolean): String? {
        if (i_7_ < 43) return null
        anInt1958++
        if (!bool || i < 0) return i.toString()
        return method3551(8320, 10, i, bool)
    }

    @JvmStatic
    fun method1172(i: Byte, i_8_: Int): Boolean {
        anInt1960++
        val i_9_ = 35 / ((-45 - i) / 38)
        return (i_8_ >= 0 && i_8_ <= 3) || i_8_ == 9
    }
}
