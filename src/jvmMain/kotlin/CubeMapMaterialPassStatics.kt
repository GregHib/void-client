import jaggl.OpenGLStatics.glDisable
import jaggl.OpenGLStatics.glEnable
import jaggl.OpenGLStatics.glLoadIdentity
import jaggl.OpenGLStatics.glLoadMatrixf
import jaggl.OpenGLStatics.glMatrixMode
import jaggl.OpenGLStatics.glTexGeni

object CubeMapMaterialPassStatics {
    @JvmField
            var anInt6292: Int = 0
            @JvmField
            var anInt6293: Int = 0
            @JvmField
            var anInt6294: Int = 0
            @JvmField
            var anInt6295: Int = 0
            @JvmField
            var anIntArray6296: IntArray? = intArrayOf(32, 39, 44, 47)
            @JvmField
            var anInt6297: Int = 0
            @JvmField
            var anInt6298: Int = 0
            @JvmField
            var anInt6299: Int = -1
            @JvmField
            var anInt6300: Int = 0
            @JvmField
            var anInt6303: Int = 0
            @JvmField
            var aFloat6304: Float = 0f
            @JvmField
            var anInt6305: Int = 0
    
            @JvmStatic
            fun method2170(i: Int, i_0_: Byte) {
                ColourAdjustmentStatics.anInt859 = -1
                anInt6300++
                if (i_0_.toInt() != 3) method2170(-109, 7.toByte())
                DebugOverlayRenderer.anInt3170 = i
                ColourAdjustmentStatics.anInt859 = -1
                MenuActionNodeStatics.method2811(false)
            }
    
            @JvmStatic
            fun method2171(i: Int) {
                if (i != 0) method2172(-6)
                anIntArray6296 = null
            }
    
            @JvmStatic
            fun method2172(i: Int) {
                val i_2_ = 27 / ((i - -12) / 57)
                anInt6295++
                if (JagGlToolkitFactory.anApplet1530 != null) {
                    try {
                        val string = JagGlToolkitFactory.anApplet1530!!.getParameter("cookiehost")
                        val i_3_ = (GameClock.method599(-74) / 86400000L).toInt() - 11745
                        val string_4_ = ("usrdob=" + i_3_ + "; version=1; path=/; domain=" + string)
                        JavaScriptBridge.method1615(JagGlToolkitFactory.anApplet1530, -15092, "document.cookie=\"" + string_4_ + "\"")
                    } catch (throwable: Throwable) {
                        /* empty */
                    }
                }
            }
    
            @JvmStatic
            fun method2173(bool: Boolean, i: Int, bool_6_: Boolean) {
                val i_7_ = 111 % ((i - -62) / 38)
                anInt6292++
                if (bool) {
                    SpriteArchiveLoaderStatics.anInt383--
                    if (SpriteArchiveLoaderStatics.anInt383 == 0) ParticleEmitterNodeStatics.anIntArray179 = null
                }
                if (bool_6_) {
                    ColourKeyTextureNodeStatics.anInt9346--
                    if (ColourKeyTextureNodeStatics.anInt9346 == 0) Crc64HashableStatics.anIntArray4983 = null
                }
            }
}
