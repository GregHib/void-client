import Class348_Sub40_Sub19.Companion.method3098
import Class9.method215
import jaggl.OpenGL
import java.awt.Canvas

object Class93 {
    @JvmField
    var anInt1529: Int = 0
    @JvmField
    var anApplet1530: GameApplet? = null
    var aStringArray1531: Array<String>? = arrayOf("Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat")
    @JvmField
    var anInt1532: Int = 0
    @JvmField
    var anInt1533: Int = 0
    @JvmField
    var anInt1534: Int = 0

    @JvmStatic
    fun method861(i: Int) {
        aStringArray1531 = null
        val i_0_ = 2 / ((i - 33) / 38)
        anApplet1530 = null
    }

    fun method862(canvas: Canvas?, var_d: d?, class45: Class45?, i: Int, i_1_: Int): ha? {
        try {
            anInt1532++
            if (!method215(27165)) throw RuntimeException("")
            if (!method3098(i xor 0x158f.inv(), "jaggl")) throw RuntimeException("")
            val opengl = OpenGL()
            val l = opengl.init(canvas, 8, 8, 8, 24, 0, i_1_)
            if (l == 0L) throw RuntimeException("")
            if (i != 25542) return null
            val class377 = Class377(opengl, canvas, l, var_d, class45, i_1_)
            class377.method3930(26.toByte())
            return class377
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("lt.D(" + (if (canvas != null) "{...}" else "null") + ',' + (if (var_d != null) "{...}" else "null") + ',' + (if (class45 != null) "{...}" else "null") + ',' + i + ',' + i_1_ + ')'))
        }
    }

    fun method863(i: Int, i_2_: Byte, `is`: ByteArray?): ByteArray? {
        if (i_2_ < 64) return null
        anInt1529++
        val is_3_ = ByteArray(i)
        Class214.method1577(`is`!!, 0, is_3_, 0, i)
        return is_3_
    }

    @JvmStatic
    fun method864(i: Int, `is`: ByteArray?, i_4_: Int, i_5_: Int): ByteArray {
        anInt1533++
        if (i_5_ >= -30) aStringArray1531 = null
        val is_6_ = ByteArray(i_4_)
        Class214.method1577(`is`!!, i, is_6_, 0, i_4_)
        return is_6_
    }
}
