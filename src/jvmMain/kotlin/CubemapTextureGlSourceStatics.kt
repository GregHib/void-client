import jaggl.OpenGLStatics.glBegin
import jaggl.OpenGLStatics.glEnd
import jaggl.OpenGLStatics.glLoadIdentity
import jaggl.OpenGLStatics.glMatrixMode
import jaggl.OpenGLStatics.glMultiTexCoord3i
import jaggl.OpenGLStatics.glOrtho
import jaggl.OpenGLStatics.glPopAttrib
import jaggl.OpenGLStatics.glPushAttrib
import jaggl.OpenGLStatics.glTexCoord3i
import jaggl.OpenGLStatics.glVertex2f
import jaggl.OpenGLStatics.glViewport

object CubemapTextureGlSourceStatics {
    @JvmField
            var aClass348_Sub49_8698: ByteBuffer? = null
            @JvmField
            var anInt8699: Int = 0
            @JvmField
            var anInt8700: Int = 0
            @JvmField
            var anInt8702: Int = 0
            @JvmField
            var anInt8703: Int = 0
            @JvmField
            var anInt8704: Int = 0
            @JvmField
            var anInt8705: Int = 0
            @JvmField
            var aFontMetaRef_8706: FontMetaRef? = FontMetaRef(79, 3)
            @JvmStatic
            fun method2263(var_renderer: Renderer?, i: Int, i_4_: Int): AbstractModelRenderer? {
                anInt8705++
                val class348_sub15 = (ProjectileConfigUtil.aHashtable_389!!.method3480(i_4_.toLong(), -6008) as MenuActionNode?)
                if (class348_sub15 != null) {
                    val class348_sub23_sub2 = class348_sub15.aClass55_Sub1_6768!!.method506(false)
                    class348_sub15.aBoolean6772 = true
                    if (class348_sub23_sub2 != null) return class348_sub23_sub2.method2975(var_renderer!!, 0)
                }
                if (i != 0) aFontMetaRef_8706 = null
                return null
            }
    
            @JvmStatic
            fun method2264(bool: Boolean) {
                if (bool != false) aClass348_Sub49_8698 = null
                anInt8704++
                val class348_sub42_sub15 = NamedTimedNodeStatics.method2516(0, 105.toByte(), 15)
                class348_sub42_sub15.method3251(-16058)
            }
    
            @JvmStatic
            fun method2265(i: Int) {
                aClass348_Sub49_8698 = null
                if (i != -10794) aFontMetaRef_8706 = null
                aFontMetaRef_8706 = null
            }
}
