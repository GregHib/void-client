import jaggl.OpenGL.Companion.glCallList
import jaggl.OpenGL.Companion.glEndList
import jaggl.OpenGL.Companion.glGenLists
import jaggl.OpenGL.Companion.glNewList

/*
 * Class61
 */
class GlDisplayListFont internal constructor(var_ha_Sub2: OpenGlRenderer?, i: Int) {
    private val anInt1109: Int

    fun method591(i: Int) {
        anInt1108++
        glEndList()
        if (i != -1) method595((-56).toByte(), 72)
    }

    fun method594(c: Char, i: Int) {
        anInt1107++
        glCallList(anInt1109 - -c.code)
        if (i != 28666) method591(30)
    }

    fun method595(i: Byte, i_7_: Int) {
        glNewList(i_7_ + anInt1109, 4864)
        anInt1106++
        if (i <= 101) method594('\ufff3', -3)
    }

    init {
        anInt1109 = glGenLists(i)
    }

    companion object {
        @JvmField
        var anInt1104: Int = 0
        @JvmField
        var anInt1105: Int = 0
        @JvmField
        var anInt1106: Int = 0
        @JvmField
        var anInt1107: Int = 0
        @JvmField
        var anInt1108: Int = 0
        @JvmStatic
        fun method592(bool: Boolean, i: Byte, bool_0_: Boolean, i_1_: Int, i_2_: Int): Int {
            anInt1105++
            if (i.toInt() != -128) return -20
            val class348_sub13 = GlTexture1D.method1974((-1).toByte(), i_1_, bool_0_)
            if (class348_sub13 == null) return 0
            var i_3_ = 0
            var i_4_ = 0
            while ((class348_sub13.anIntArray6757!!.size > i_4_)) {
                if (class348_sub13.anIntArray6757!![i_4_] >= 0 && (Exception_Sub1.aModelHeaderCache_112!!.anInt3271 > class348_sub13.anIntArray6757!![i_4_])) {
                    val class213 = (Exception_Sub1.aModelHeaderCache_112!!.method1940(-127, (class348_sub13.anIntArray6757!![i_4_])))
                    val i_5_ = class213.method1567((ProjectionCameraTransform.aEmoteDefCache_5764!!.method2600(i_2_, 28364).anInt3256), 107, i_2_)
                    if (!bool) i_3_ += i_5_
                    else i_3_ += i_5_ * (class348_sub13.anIntArray6758[i_4_])
                }
                i_4_++
            }
            return i_3_
        }

        @JvmStatic
        fun method593(i: Int, i_6_: Byte, string: String?): SocketFactory? {
            anInt1104++
            var socketFactory: SocketFactory?
            try {
                socketFactory = ProxySocketFactory()
            } catch (throwable: Throwable) {
                socketFactory = DirectSocketFactory()
            }
            if (i_6_.toInt() != -90) return null
            socketFactory.aString3476 = string
            socketFactory.anInt3470 = i
            return socketFactory
        }
    }
}
