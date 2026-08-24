import kotlin.jvm.JvmStatic
import jaggl.OpenGL.Companion.glDisable
import jaggl.OpenGL.Companion.glEnable
import jaggl.OpenGL.Companion.glLoadIdentity
import jaggl.OpenGL.Companion.glLoadMatrixf
import jaggl.OpenGL.Companion.glMatrixMode
import jaggl.OpenGL.Companion.glTexGeni

class CubeMapMaterialPass internal constructor(var_ha_Sub2: OpenGlRenderer) : MaterialPass(var_ha_Sub2) {
    private var aBoolean6301 = false
    private var aGlDisplayListFont_6302: GlDisplayListFont? = null
    override fun method2133(i: Int) {
        if (i <= -75) {
            if (aBoolean6301) {
                aGlDisplayListFont_6302!!.method594('\u0001', 28666)
                this.aHa_Sub2_3684.method3738(-15039, 1)
                this.aHa_Sub2_3684.method3771((-92).toByte(), null)
                this.aHa_Sub2_3684.method3738(-15039, 0)
            } else this.aHa_Sub2_3684.method3775(false, 0, 770, 5890)
            anInt6297++
            this.aHa_Sub2_3684.method3729(8448, 116.toByte(), 8448)
            aBoolean6301 = false
        }
    }

    override fun method2140(glTexture: GlTexture?, i: Byte, i_1_: Int) {
        anInt6303++
        this.aHa_Sub2_3684.method3771((-86).toByte(), glTexture)
        this.aHa_Sub2_3684.method3761(0, i_1_)
        if (i >= -89) method2172(12)
    }

    init {
        if (var_ha_Sub2.aBoolean7863) {
            aGlDisplayListFont_6302 = GlDisplayListFont(var_ha_Sub2, 2)
            aGlDisplayListFont_6302!!.method595(123.toByte(), 0)
            this.aHa_Sub2_3684.method3738(-15039, 1)
            this.aHa_Sub2_3684.method3729(34165, (-35).toByte(), 7681)
            this.aHa_Sub2_3684.method3762(34168, 770, (-87).toByte(), 2)
            this.aHa_Sub2_3684.method3775(false, 0, 770, 34167)
            glTexGeni(8192, 9472, 34066)
            glTexGeni(8193, 9472, 34066)
            glTexGeni(8194, 9472, 34066)
            glEnable(3168)
            glEnable(3169)
            glEnable(3170)
            this.aHa_Sub2_3684.method3738(-15039, 0)
            aGlDisplayListFont_6302!!.method591(-1)
            aGlDisplayListFont_6302!!.method595(126.toByte(), 1)
            this.aHa_Sub2_3684.method3738(-15039, 1)
            this.aHa_Sub2_3684.method3729(8448, (-73).toByte(), 8448)
            this.aHa_Sub2_3684.method3762(34166, 770, (-87).toByte(), 2)
            this.aHa_Sub2_3684.method3775(false, 0, 770, 5890)
            glDisable(3168)
            glDisable(3169)
            glDisable(3170)
            glMatrixMode(5890)
            glLoadIdentity()
            glMatrixMode(5888)
            this.aHa_Sub2_3684.method3738(-15039, 0)
            aGlDisplayListFont_6302!!.method591(-1)
        }
    }

    override fun method2139(bool: Boolean, i: Byte) {
        anInt6298++
        val i_5_ = 94 / ((i - -60) / 38)
        this.aHa_Sub2_3684.method3729(8448, (-28).toByte(), 7681)
    }

    override fun method2137(i: Int): Boolean {
        if (i > -5) aFloat6304 = -0.3934622f
        anInt6294++
        return true
    }

    override fun method2134(bool: Boolean, bool_8_: Boolean) {
        if (bool_8_ != false) method2171(85)
        anInt6293++
        val class258_sub2 = this.aHa_Sub2_3684.method3741(444720536)
        if (aGlDisplayListFont_6302 != null && class258_sub2 != null && bool) {
            aGlDisplayListFont_6302!!.method594('\u0000', 28666)
            this.aHa_Sub2_3684.method3738(-15039, 1)
            this.aHa_Sub2_3684.method3771((-77).toByte(), class258_sub2)
            glMatrixMode(5890)
            glLoadMatrixf(this.aHa_Sub2_3684.aClass101_Sub3_7767.method945(true), 0)
            glMatrixMode(5888)
            this.aHa_Sub2_3684.method3738(-15039, 0)
            aBoolean6301 = true
        } else this.aHa_Sub2_3684.method3775(false, 0, 770, 34168)
    }

    override fun method2136(i: Int, i_9_: Int, i_10_: Byte) {
        anInt6305++
        if (i_10_ > -42) aBoolean6301 = false
    }

    companion object {

        var anInt6292: Int = 0

        var anInt6293: Int = 0

        var anInt6294: Int = 0

        var anInt6295: Int = 0

        var anIntArray6296: IntArray? = intArrayOf(32, 39, 44, 47)

        var anInt6297: Int = 0

        var anInt6298: Int = 0

        var anInt6299: Int = -1

        var anInt6300: Int = 0

        var anInt6303: Int = 0

        var aFloat6304: Float = 0f

        var anInt6305: Int = 0

        @JvmStatic
        fun method2170(i: Int, i_0_: Byte) {
            ColourAdjustment.anInt859 = -1
            anInt6300++
            if (i_0_.toInt() != 3) method2170(-109, 7.toByte())
            DebugOverlayRenderer.anInt3170 = i
            ColourAdjustment.anInt859 = -1
            MenuActionNode.method2811(false)
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
                SpriteArchiveLoader.anInt383--
                if (SpriteArchiveLoader.anInt383 == 0) SoundEnvelope.anIntArray179 = null
            }
            if (bool_6_) {
                ColourKeyTextureNode.anInt9346--
                if (ColourKeyTextureNode.anInt9346 == 0) SoundEnvelope.anIntArray4983 = null
            }
        }
    }
}
