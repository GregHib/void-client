import jaclib.memory.Stream
import jaggl.MapBuffer
import jaggl.OpenGL
import jaggl.OpenGLStatics.glActiveTexture
import jaggl.OpenGLStatics.glAlphaFunc
import jaggl.OpenGLStatics.glBindTexture
import jaggl.OpenGLStatics.glBlendFunc
import jaggl.OpenGLStatics.glClear
import jaggl.OpenGLStatics.glClearColor
import jaggl.OpenGLStatics.glClearDepth
import jaggl.OpenGLStatics.glClientActiveTexture
import jaggl.OpenGLStatics.glColorMaterial
import jaggl.OpenGLStatics.glColorPointer
import jaggl.OpenGLStatics.glCopyPixels
import jaggl.OpenGLStatics.glCullFace
import jaggl.OpenGLStatics.glDeleteBuffersARB
import jaggl.OpenGLStatics.glDeleteFramebuffersEXT
import jaggl.OpenGLStatics.glDeleteLists
import jaggl.OpenGLStatics.glDeleteObjectARB
import jaggl.OpenGLStatics.glDeleteProgramARB
import jaggl.OpenGLStatics.glDeleteRenderbuffersEXT
import jaggl.OpenGLStatics.glDeleteTextures
import jaggl.OpenGLStatics.glDepthFunc
import jaggl.OpenGLStatics.glDepthMask
import jaggl.OpenGLStatics.glDisable
import jaggl.OpenGLStatics.glDisableClientState
import jaggl.OpenGLStatics.glDrawArrays
import jaggl.OpenGLStatics.glDrawBuffer
import jaggl.OpenGLStatics.glDrawElements
import jaggl.OpenGLStatics.glEnable
import jaggl.OpenGLStatics.glEnableClientState
import jaggl.OpenGLStatics.glFinish
import jaggl.OpenGLStatics.glFlush
import jaggl.OpenGLStatics.glFogf
import jaggl.OpenGLStatics.glFogfv
import jaggl.OpenGLStatics.glFogi
import jaggl.OpenGLStatics.glGenBuffersARB
import jaggl.OpenGLStatics.glGetIntegerv
import jaggl.OpenGLStatics.glGetString
import jaggl.OpenGLStatics.glHint
import jaggl.OpenGLStatics.glLightModelfv
import jaggl.OpenGLStatics.glLightf
import jaggl.OpenGLStatics.glLightfv
import jaggl.OpenGLStatics.glLoadIdentity
import jaggl.OpenGLStatics.glLoadMatrixf
import jaggl.OpenGLStatics.glMatrixMode
import jaggl.OpenGLStatics.glMultMatrixf
import jaggl.OpenGLStatics.glNormalPointer
import jaggl.OpenGLStatics.glOrtho
import jaggl.OpenGLStatics.glPolygonMode
import jaggl.OpenGLStatics.glPopMatrix
import jaggl.OpenGLStatics.glPushMatrix
import jaggl.OpenGLStatics.glRasterPos2i
import jaggl.OpenGLStatics.glReadBuffer
import jaggl.OpenGLStatics.glReadPixelsi
import jaggl.OpenGLStatics.glScissor
import jaggl.OpenGLStatics.glShadeModel
import jaggl.OpenGLStatics.glTexCoordPointer
import jaggl.OpenGLStatics.glTexEnvfv
import jaggl.OpenGLStatics.glTexEnvi
import jaggl.OpenGLStatics.glTexGeni
import jaggl.OpenGLStatics.glVertexPointer
import jaggl.OpenGLStatics.glViewport
import java.awt.Canvas
import java.awt.Rectangle
import java.util.*

object GlRenderDeviceStatics {
    @JvmField
            var anInt9812: Int = 0
            @JvmField
            var anInt9813: Int = 0
            @JvmField
            var anInt9814: Int = 0
            @JvmField
            var anInt9815: Int = 0
            @JvmField
            var anInt9816: Int = 0
            @JvmField
            var anInt9817: Int = 0
            @JvmField
            var anInt9818: Int = 0
            @JvmField
            var anInt9819: Int = 0
            @JvmField
            var anInt9820: Int = 0
            @JvmField
            var anInt9821: Int = 0
            @JvmField
            var anInt9822: Int = 0
            @JvmField
            var anInt9823: Int = 0
            @JvmField
            var anInt9824: Int = 0
            @JvmField
            var anInt9825: Int = 0
            @JvmField
            var anInt9826: Int = 0
            @JvmField
            var anInt9827: Int = 0
            @JvmField
            var anInt9828: Int = 0
            @JvmField
            var anInt9829: Int = 0
            @JvmField
            var anInt9830: Int = 0
            @JvmField
            var anInt9831: Int = 0
            @JvmField
            var anInt9832: Int = 0
            @JvmField
            var anInt9833: Int = 0
            @JvmField
            var anInt9834: Int = 0
            @JvmField
            var anInt9835: Int = 0
            @JvmField
            var anInt9836: Int = 0
            @JvmField
            var anInt9837: Int = 0
            @JvmField
            var anInt9838: Int = 0
            @JvmField
            var anInt9839: Int = 0
            @JvmField
            var anInt9840: Int = 0
            @JvmField
            var anInt9841: Int = 0
            @JvmField
            var anInt9842: Int = 0
            @JvmField
            var anInt9843: Int = 0
            @JvmField
            var anInt9844: Int = 0
            @JvmField
            var anInt9845: Int = 0
            @JvmField
            var anInt9846: Int = 0
            @JvmField
            var anInt9847: Int = 0
            @JvmField
            var anInt9848: Int = 0
            @JvmField
            var anInt9849: Int = 0
            @JvmField
            var anInt9850: Int = 0
            @JvmField
            var anInt9851: Int = 0
            @JvmField
            var anInt9852: Int = 0
            @JvmField
            var anInt9853: Int = 0
            @JvmField
            var anInt9854: Int = 0
            @JvmField
            var anInt9855: Int = 0
            @JvmField
            var anInt9857: Int = 0
            @JvmField
            var anInt9858: Int = 0
            @JvmField
            var anInt9859: Int = 0
            @JvmField
            var aRectangleRegion_9860: RectangleRegion? = RectangleRegion(15, 0, 1, 0)
            @JvmField
            var anInt9861: Int = 0
            @JvmField
            var anInt9862: Int = 0
            @JvmField
            var anInt9863: Int = 0
            @JvmField
            var anInt9864: Int = 0
            @JvmField
            var anInt9865: Int = 0
            @JvmField
            var anInt9866: Int = 0
            @JvmField
            var anInt9867: Int = 0
            @JvmField
            var anInt9868: Int = 0
            @JvmField
            var anInt9870: Int = 0
            @JvmField
            var anInt9871: Int = 0
            @JvmField
            var anInt9872: Int = 0
            @JvmField
            var anInt9873: Int = 0
            @JvmField
            var anInt9874: Int = 0
            @JvmField
            var anInt9875: Int = 0
            @JvmField
            var anInt9876: Int = 0
            @JvmField
            var anInt9877: Int = 0
            @JvmField
            var anInt9878: Int = 0
            @JvmField
            var anInt9879: Int = 0
            @JvmField
            var anInt9880: Int = 0
            @JvmField
            var anInt9881: Int = 0
            @JvmField
            var anInt9882: Int = 0
            @JvmField
            var anInt9883: Int = 0
            @JvmField
            var anInt9884: Int = 0
            @JvmField
            var anInt9885: Int = 0
            @JvmField
            var anInt9886: Int = 0
            @JvmField
            var anInt9887: Int = 0
            @JvmField
            var anInt9888: Int = 0
            @JvmField
            var anInt9889: Int = 0
            @JvmField
            var anInt9890: Int = 0
            @JvmField
            var anInt9891: Int = 0
            @JvmField
            var anInt9892: Int = 0
            @JvmField
            var anInt9893: Int = 0
            @JvmField
            var anInt9894: Int = 0
            @JvmField
            var anInt9895: Int = 0
            @JvmField
            var anInt9896: Int = 0
            @JvmField
            var anInt9897: Int = 0
            @JvmField
            var anInt9898: Int = 0
            @JvmField
            var anInt9900: Int = 0
            @JvmStatic
            fun method3965(string: String?, i: Int, i_1_: Int) {
                try {
                    anInt9841++
                    val class348_sub42_sub15 = NamedTimedNodeStatics.method2516(i, 105.toByte(), i_1_) //2
                    class348_sub42_sub15.method3246(-25490)
                    class348_sub42_sub15.aString9654 = string
                } catch (runtimeexception: RuntimeException) {
                    throw SoundBankPatchStatics.method2929(runtimeexception, ("bga.AA(" + (if (string != null) "{...}" else "null") + ',' + i + ',' + i_1_ + ')'))
                }
            }
    
            @JvmStatic
            fun method3968(i: Int) {
                val i_10_ = 69 % ((-67 - i) / 57)
                aRectangleRegion_9860 = null
            }
}
