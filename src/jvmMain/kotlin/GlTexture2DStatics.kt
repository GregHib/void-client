import jaggl.OpenGLStatics.glCopyTexImage2D
import jaggl.OpenGLStatics.glCopyTexSubImage2D
import jaggl.OpenGLStatics.glFlush
import jaggl.OpenGLStatics.glFramebufferTexture2DEXT
import jaggl.OpenGLStatics.glPixelStorei
import jaggl.OpenGLStatics.glTexImage2Df
import jaggl.OpenGLStatics.glTexImage2Di
import jaggl.OpenGLStatics.glTexImage2Dub
import jaggl.OpenGLStatics.glTexParameteri
import jaggl.OpenGLStatics.glTexSubImage2Di
import jaggl.OpenGLStatics.glTexSubImage2Dub
import java.awt.MediaTracker
import java.awt.Toolkit
import java.awt.image.PixelGrabber

object GlTexture2DStatics {
    @JvmField
            var anInt8539: Int = 0
            @JvmField
            var anInt8540: Int = 0
            @JvmField
            var anInt8541: Int = 0
            @JvmField
            var anInt8542: Int = 0
            @JvmField
            var anInt8543: Int = 0
            @JvmField
            var anInt8544: Int = 0
            @JvmField
            var anInt8546: Int = 0
            @JvmField
            var anInt8548: Int = 0
            @JvmField
            var anInt8550: Int = 0
    
            @JvmStatic
            fun method1966(i: Int, i_43_: Int, i_44_: Int, i_45_: Int, i_46_: Byte, i_47_: Int, i_48_: Int, i_49_: Int, i_50_: Int) {
                HintArrowOrMessageStatics.aMapTileShapeArray2034!![DetailLevelOptionStateStatics.anInt6115++] = MapTileShape(i_47_, i_49_, i_50_, i, i, i_50_, i_45_, i_43_, i_43_, i_45_, i_44_, i_44_, i_48_, i_48_)
                anInt8548++
                if (i_46_.toInt() != 0) method1968()
            }
    
            @JvmStatic
            fun method1968() {
                ShaderProgramStatics.method3437(1, MapAreaDefinitionStatics.anInt2524)
            }
    
            @JvmStatic
            fun method1969(`is`: ByteArray, i: Int): AbstractModelRenderer? {
                anInt8546++
                if (i != -5901) anInt8550 = 83
                if (`is` == null) throw RuntimeException("")
                while (true) {
                    try {
                        val image = Toolkit.getDefaultToolkit().createImage(`is`)
                        val mediatracker = MediaTracker(NpcTypeStatics.aClient1367)
                        mediatracker.addImage(image, 0)
                        mediatracker.waitForAll()
                        val i_58_ = image.getWidth(NpcTypeStatics.aClient1367)
                        val i_59_ = image.getHeight(NpcTypeStatics.aClient1367)
                        if (mediatracker.isErrorAny() || i_58_ < 0 || i_59_ < 0) throw RuntimeException("")
                        val is_60_ = IntArray(i_59_ * i_58_)
                        val pixelgrabber = PixelGrabber(image, 0, 0, i_58_, i_59_, is_60_, 0, i_58_)
                        pixelgrabber.grabPixels()
                        return FacingDirectionNodeStatics.aRenderer6654!!.method3662(i_58_, is_60_, 94.toByte(), 0, i_58_, i_59_)
                    } catch (interruptedexception: InterruptedException) {
                        /* empty */
                    }
                }
            }
}
