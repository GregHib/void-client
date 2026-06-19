import AbstractCameraTransformStatics.method904
import PerlinTextureProviderStatics.method1401
import InvertTextureNodeStatics.method3132
import jaggl.OpenGLStatics.glBegin
import jaggl.OpenGLStatics.glColor3f
import jaggl.OpenGLStatics.glColor4ub
import jaggl.OpenGLStatics.glEnd
import jaggl.OpenGLStatics.glMultiTexCoord2f
import jaggl.OpenGLStatics.glPixelTransferf
import jaggl.OpenGLStatics.glPopMatrix
import jaggl.OpenGLStatics.glPushMatrix
import jaggl.OpenGLStatics.glTexCoord2f
import jaggl.OpenGLStatics.glTranslatef
import jaggl.OpenGLStatics.glVertex2f
import jaggl.OpenGLStatics.glVertex2i

object GlSpriteRendererStatics {
    @JvmField
            var anInt8424: Int = 0
            @JvmField
            var anInt8425: Int = 0
            @JvmField
            var anInt8426: Int = 0
            @JvmField
            var anInt8428: Int = 0
            @JvmField
            var anInt8433: Int = 0
            @JvmField
            var anInt8435: Int = 0
            @JvmField
            var anInt8436: Int = 0
            @JvmField
            var anInt8437: Int = 0
            @JvmField
            var anInt8438: Int = 0
            @JvmField
            var anInt8439: Int = 0
            @JvmField
            var anInt8440: Int = 0
            @JvmField
            var anInt8441: Int = 0
            @JvmField
            var anInt8442: Int = 0
            @JvmField
            var anInt8443: Int = 0
            @JvmField
            var anInt8444: Int = 0
            @JvmField
            var anInt8445: Int = 0
            @JvmField
            var anInt8448: Int = 0
            fun method990(c: Char, i: Byte): Char {
                anInt8444++
                if (c.code == 198) return 'E'
                if (c.code == 230) return 'e'
                if (c.code == 223) return 's'
                if (c.code == 338) return 'E'
                if (c.code == 339) return 'e'
                if (i >= -18) return 'M'
                return '\u0000'
            }
    
            fun method993(l: Long, l_104_: Long): Long {
                try {
                    return l xor l_104_
                } catch (runtimeexception: RuntimeException) {
                    throw SoundBankPatchStatics.method2929(runtimeexception, "nda.Q($l,$l_104_)")
                }
            }
}
