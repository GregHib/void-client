import BlankTextureNode.Companion.method3098
import NativeLibraryState.method215
import jaggl.OpenGL
import java.awt.Canvas

/*
 * Class93
 */
object JagGlToolkitFactory {

    var anInt1529: Int = 0

    var anApplet1530: GameApplet? = null
    var aStringArray1531: Array<String>? = arrayOf("Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat")

    var anInt1532: Int = 0

    var anInt1533: Int = 0

    var anInt1534: Int = 0

    @JvmStatic
    fun method861(i: Int) {
        aStringArray1531 = null
        val i_0_ = 2 / ((i - 33) / 38)
        anApplet1530 = null
    }

    fun method862(canvas: Canvas?, var_renderConfig: RenderConfig?, js5Archive: Js5Archive?, i: Int, i_1_: Int): Renderer? {
        try {
            anInt1532++
            if (!method215(27165)) throw RuntimeException("")
            if (!method3098(i xor 0x158f.inv(), "jaggl")) throw RuntimeException("")
            val opengl = OpenGL()
            val l = opengl.init(canvas, 8, 8, 8, 24, 0, i_1_)
            if (l == 0L) throw RuntimeException("")
            if (i != 25542) return null
            val glRenderDevice = GlRenderDevice(opengl, canvas, l, var_renderConfig, js5Archive, i_1_)
            glRenderDevice.method3930(26.toByte())
            return glRenderDevice
        } catch (runtimeexception: RuntimeException) {
            throw TextureLoadException.method2929(runtimeexception, ("lt.D(" + (if (canvas != null) "{...}" else "null") + ',' + (if (var_renderConfig != null) "{...}" else "null") + ',' + (if (js5Archive != null) "{...}" else "null") + ',' + i + ',' + i_1_ + ')'))
        }
    }

    fun method863(i: Int, i_2_: Byte, `is`: ByteArray?): ByteArray? {
        if (i_2_ < 64) return null
        anInt1529++
        val is_3_ = ByteArray(i)
        ArrayCopyUtil.method1577(`is`!!, 0, is_3_, 0, i)
        return is_3_
    }

    @JvmStatic
    fun method864(i: Int, `is`: ByteArray?, i_4_: Int, i_5_: Int): ByteArray {
        anInt1533++
        if (i_5_ >= -30) aStringArray1531 = null
        val is_6_ = ByteArray(i_4_)
        ArrayCopyUtil.method1577(`is`!!, i, is_6_, 0, i_4_)
        return is_6_
    }
}
