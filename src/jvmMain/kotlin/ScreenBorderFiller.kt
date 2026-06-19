import GlEnvMappedWaterPassStatics.method3551
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
        if (ByteBufferStatics.anInt7207 != 1) CameraRotationStubStatics.aRenderer326!!.method3707(rectangles, i, 0, 0)
        else CameraRotationStubStatics.aRenderer326!!.method3707(rectangles, i, MapRegionLoaderThreadStatics.anInt4211, PerlinNoiseTextureNodeStatics.anInt9157)
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
        if (SkeletalAnimFrameLoaderStatics.aFrame476 == null) {
            val i_1_ = ModelResourceBundleStatics.anInt7129
            val i_2_ = TimingCounters.anInt4167
            if (i > -25) ScreenBorderFiller.method1172((-22).toByte(), -1)
            val i_3_ = -i_1_ + -LocTypeDefinitionStatics.anInt4017 + SocketFactoryStatics.anInt3473
            val i_4_ = -i_2_ + (NpcReferenceStatics.anInt6857 + -HardCacheEntryReferenceStatics.anInt10432)
            do {
                if (i_1_ > 0 || i_3_ > 0 || i_2_ > 0 || i_4_ > 0) {
                    try {
                        val container: Container?
                        if (RsaVarbitHandlerStatics.aFrame4904 == null) {
                            if (JagGlToolkitFactory.anApplet1530 == null) container = EdgeDetectTextureNodeStatics.anGameApplet_Frame_9169
                            else container = JagGlToolkitFactory.anApplet1530 as? Container
                        } else container = RsaVarbitHandlerStatics.aFrame4904
                        var i_5_ = 0
                        var i_6_ = 0
                        if (container === RsaVarbitHandlerStatics.aFrame4904) {
                            val insets = RsaVarbitHandlerStatics.aFrame4904!!.getInsets()
                            i_5_ = insets.left
                            i_6_ = insets.top
                        }
                        val graphics = container!!.getGraphics()
                        graphics.setColor(Color.black)
                        if (i_1_ > 0) graphics.fillRect(i_5_, i_6_, i_1_, NpcReferenceStatics.anInt6857)
                        if (i_2_ > 0) graphics.fillRect(i_5_, i_6_, SocketFactoryStatics.anInt3473, i_2_)
                        if (i_3_ > 0) graphics.fillRect((-i_3_ + SocketFactoryStatics.anInt3473 + i_5_), i_6_, i_3_, NpcReferenceStatics.anInt6857)
                        if (i_4_ <= 0) break
                        graphics.fillRect(i_5_, NpcReferenceStatics.anInt6857 + (i_6_ - i_4_), SocketFactoryStatics.anInt3473, i_4_)
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
