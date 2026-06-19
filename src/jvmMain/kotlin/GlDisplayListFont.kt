import jaggl.OpenGLStatics.glCallList
import jaggl.OpenGLStatics.glEndList
import jaggl.OpenGLStatics.glGenLists
import jaggl.OpenGLStatics.glNewList
import GlDisplayListFontStatics.anInt1106
import GlDisplayListFontStatics.anInt1107
import GlDisplayListFontStatics.anInt1108

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
}
