package jaggl

import awt.Canvas
import lang.Thread
import util.Hashtable
import kotlin.jvm.JvmStatic

expect class OpenGL {
    var a: Thread?

    var c: Hashtable<Any?, Any?>?

    val peer: Long

    fun detachPeer()

    fun setSwapInterval(arg0: Int)

    fun surfaceResized(arg0: Long)

    fun setPbuffer(arg0: Long)

    fun arePbuffersAvailable(): Boolean

    /*@Synchronized*/
    fun a(): Boolean 

    fun releasePbuffer(arg0: Long)

    fun attachPeer(): Boolean

    fun releaseSurface(arg0: Canvas?, arg1: Long)

    fun init(arg0: Canvas?, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: Int, arg6: Int): Long

    /*@Synchronized*/
    fun b(): Boolean 

    fun createPbuffer(arg0: Int, arg1: Int): Long

    fun swapBuffers()

    fun a(arg0: String?): Boolean 

    fun release()

    fun prepareSurface(arg0: Canvas?): Long

    fun setSurface(arg0: Long): Boolean

    companion object {
        val b: Hashtable<Any?, Any?>

        @JvmStatic
        fun glTranslatef(arg0: Float, arg1: Float, arg2: Float)

        @JvmStatic
        fun glBindRenderbufferEXT(arg0: Int, arg1: Int)

        @JvmStatic
        fun glScalef(arg0: Float, arg1: Float, arg2: Float)

        @JvmStatic
        fun glActiveTexture(arg0: Int)

        @JvmStatic
        fun glProgramLocalParameter4fvARB(arg0: Int, arg1: Int, arg2: FloatArray?, arg3: Int)

        @JvmStatic
        fun glGetObjectParameterivARB(arg0: Long, arg1: Int, arg2: IntArray?, arg3: Int)

        @JvmStatic
        fun glFramebufferTexture3DEXT(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: Int)

        @JvmStatic
        fun glDeleteLists(arg0: Int, arg1: Int)

        @JvmStatic
        fun glUniform1iARB(arg0: Int, arg1: Int)

        @JvmStatic
        fun glFinish()

        @JvmStatic
        fun glDrawElements(arg0: Int, arg1: Int, arg2: Int, arg3: Long)

        @JvmStatic
        fun glReadBuffer(arg0: Int)

        fun glGetError(): Int

        @JvmStatic
        fun glUseProgramObjectARB(arg0: Long)

        fun glColor4f(arg0: Float, arg1: Float, arg2: Float, arg3: Float)

        @JvmStatic
        fun glTexGeni(arg0: Int, arg1: Int, arg2: Int)

        @JvmStatic
        fun glDeleteFramebuffersEXT(arg0: Int, arg1: IntArray?, arg2: Int)

        @JvmStatic
        fun glColorMask(arg0: Boolean, arg1: Boolean, arg2: Boolean, arg3: Boolean)

        @JvmStatic
        fun glCullFace(arg0: Int)

        @JvmStatic
        fun glLoadMatrixf(arg0: FloatArray?, arg1: Int)

        @JvmStatic
        fun glRasterPos2i(arg0: Int, arg1: Int)

        @JvmStatic
        fun glBufferDataARBa(arg0: Int, arg1: Int, arg2: Long, arg3: Int)

        fun glStencilFunc(arg0: Int, arg1: Int, arg2: Int)

        @JvmStatic
        fun glClearColor(arg0: Float, arg1: Float, arg2: Float, arg3: Float)

        @JvmStatic
        fun glRenderbufferStorageEXT(arg0: Int, arg1: Int, arg2: Int, arg3: Int)

        @JvmStatic
        fun glDeleteBuffersARB(arg0: Int, arg1: IntArray?, arg2: Int)

        @JvmStatic
        fun glCopyTexSubImage3D(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: Int, arg6: Int, arg7: Int, arg8: Int)

        @JvmStatic
        fun glTexImage2Df(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: Int, arg6: Int, arg7: Int, arg8: FloatArray?, arg9: Int)

        @JvmStatic
        fun glReadPixelsi(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: Int, arg6: IntArray?, arg7: Int)

        @JvmStatic
        fun glTexCoordPointer(arg0: Int, arg1: Int, arg2: Int, arg3: Long)

        @JvmStatic
        fun glBindTexture(arg0: Int, arg1: Int)

        @JvmStatic
        fun glLinkProgramARB(arg0: Long)

        @JvmStatic
        fun glOrtho(arg0: Double, arg1: Double, arg2: Double, arg3: Double, arg4: Double, arg5: Double)

        fun glUniformMatrix3fvARB(arg0: Int, arg1: Int, arg2: Boolean, arg3: FloatArray?, arg4: Int)

        fun glUniformMatrix2fvARB(arg0: Int, arg1: Int, arg2: Boolean, arg3: FloatArray?, arg4: Int)

        @JvmStatic
        fun glBufferSubDataARBa(arg0: Int, arg1: Int, arg2: Int, arg3: Long)

        @JvmStatic
        fun glDeleteRenderbuffersEXT(arg0: Int, arg1: IntArray?, arg2: Int)

        @JvmStatic
        fun glPixelStorei(arg0: Int, arg1: Int)

        @JvmStatic
        fun glScissor(arg0: Int, arg1: Int, arg2: Int, arg3: Int)

        fun glTexCoord2i(arg0: Int, arg1: Int)

        @JvmStatic
        fun glLineWidth(arg0: Float)

        @JvmStatic
        fun glGenerateMipmapEXT(arg0: Int)

        @JvmStatic
        fun glDeleteObjectARB(arg0: Long)

        fun glMultiTexCoord2i(arg0: Int, arg1: Int, arg2: Int)

        @JvmStatic
        fun glRotatef(arg0: Float, arg1: Float, arg2: Float, arg3: Float)

        @JvmStatic
        fun glMultiTexCoord2f(arg0: Int, arg1: Float, arg2: Float)

        @JvmStatic
        fun glFramebufferRenderbufferEXT(arg0: Int, arg1: Int, arg2: Int, arg3: Int)

        @JvmStatic
        fun glTexSubImage2Di(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: Int, arg6: Int, arg7: Int, arg8: IntArray?, arg9: Int)

        @JvmStatic
        fun glLightf(arg0: Int, arg1: Int, arg2: Float)

        @JvmStatic
        fun glTexGenfv(arg0: Int, arg1: Int, arg2: FloatArray?, arg3: Int)

        @JvmStatic
        fun glTexCoord3i(arg0: Int, arg1: Int, arg2: Int)

        @JvmStatic
        fun glDrawArrays(arg0: Int, arg1: Int, arg2: Int)

        @JvmStatic
        fun glCallList(arg0: Int)

        @JvmStatic
        fun glDeleteProgramARB(arg0: Int)

        @JvmStatic
        fun glBindFramebufferEXT(arg0: Int, arg1: Int)

        @JvmStatic
        fun glTexCoord3f(arg0: Float, arg1: Float, arg2: Float)

        @JvmStatic
        fun glGenBuffersARB(arg0: Int, arg1: IntArray?, arg2: Int)

        @JvmStatic
        fun glVertexPointer(arg0: Int, arg1: Int, arg2: Int, arg3: Long)

        @JvmStatic
        fun glGetInfoLogARB(arg0: Long, arg1: Int, arg2: IntArray?, arg3: Int, arg4: ByteArray?, arg5: Int)

        fun glReadPixelsub(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: Int, arg6: ByteArray?, arg7: Int)

        @JvmStatic
        fun glDepthMask(arg0: Boolean)

        @JvmStatic
        fun glEnd()

        @JvmStatic
        fun glEndList()

        @JvmStatic
        fun glTexImage3Dub(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: Int, arg6: Int, arg7: Int, arg8: Int, arg9: ByteArray?, arg10: Int)

        @JvmStatic
        fun glTexImage1Dub(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: Int, arg6: Int, arg7: ByteArray?, arg8: Int)

        @JvmStatic
        fun glBlendFunc(arg0: Int, arg1: Int)

        fun glStencilOp(arg0: Int, arg1: Int, arg2: Int)

        @JvmStatic
        fun glClearDepth(arg0: Float)

        @JvmStatic
        fun glGetUniformLocationARB(arg0: Long, arg1: String?): Int

        @JvmStatic
        fun glNewList(arg0: Int, arg1: Int)

        @JvmStatic
        fun glViewport(arg0: Int, arg1: Int, arg2: Int, arg3: Int)

        @JvmStatic
        fun glTexEnvfv(arg0: Int, arg1: Int, arg2: FloatArray?, arg3: Int)

        @JvmStatic
        fun glPolygonMode(arg0: Int, arg1: Int)

        @JvmStatic
        fun glTexParameteri(arg0: Int, arg1: Int, arg2: Int)

        @JvmStatic
        fun glPushMatrix()

        @JvmStatic
        fun glPixelTransferf(arg0: Int, arg1: Float)

        @JvmStatic
        fun glUniform1fARB(arg0: Int, arg1: Float)

        @JvmStatic
        fun glBlitFramebufferEXT(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: Int, arg6: Int, arg7: Int, arg8: Int, arg9: Int)

        @JvmStatic
        fun glCopyTexSubImage2D(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: Int, arg6: Int, arg7: Int)

        @JvmStatic
        fun glCompileShaderARB(arg0: Long)

        fun glMaterialfv(arg0: Int, arg1: Int, arg2: FloatArray?, arg3: Int)

        @JvmStatic
        fun glDetachObjectARB(arg0: Long, arg1: Long)

        @JvmStatic
        fun glNormalPointer(arg0: Int, arg1: Int, arg2: Long)

        @JvmStatic
        fun glUniform2fARB(arg0: Int, arg1: Float, arg2: Float)

        @JvmStatic
        fun glLightfv(arg0: Int, arg1: Int, arg2: FloatArray?, arg3: Int)

        @JvmStatic
        fun glFogfv(arg0: Int, arg1: FloatArray?, arg2: Int)

        @JvmStatic
        fun glGetFloatv(arg0: Int, arg1: FloatArray?, arg2: Int)

        @JvmStatic
        fun glHint(arg0: Int, arg1: Int)

        @JvmStatic
        fun glBufferDataARBub(arg0: Int, arg1: Int, arg2: ByteArray?, arg3: Int, arg4: Int)

        @JvmStatic
        fun glTexSubImage2Df(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: Int, arg6: Int, arg7: Int, arg8: FloatArray?, arg9: Int)

        @JvmStatic
        fun glClientActiveTexture(arg0: Int)

        @JvmStatic
        fun glLightModelfv(arg0: Int, arg1: FloatArray?, arg2: Int)

        fun glTexParameterf(arg0: Int, arg1: Int, arg2: Float)

        @JvmStatic
        fun glMatrixMode(arg0: Int)

        @JvmStatic
        fun glCopyTexImage2D(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: Int, arg6: Int, arg7: Int)

        @JvmStatic
        fun glTexImage2Di(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: Int, arg6: Int, arg7: Int, arg8: IntArray?, arg9: Int)

        fun glUnmapBufferARB(arg0: Int): Boolean

        @JvmStatic
        fun glColor4ub(arg0: Byte, arg1: Byte, arg2: Byte, arg3: Byte)

        @JvmStatic
        fun glBufferSubDataARBub(arg0: Int, arg1: Int, arg2: Int, arg3: ByteArray?, arg4: Int)

        @JvmStatic
        fun glMultMatrixf(arg0: FloatArray?, arg1: Int)

        @JvmStatic
        fun glFogi(arg0: Int, arg1: Int)

        @JvmStatic
        fun glVertex2i(arg0: Int, arg1: Int)

        @JvmStatic
        fun glDepthFunc(arg0: Int)

        fun glDrawPixelsi(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: IntArray?, arg5: Int)

        fun glDrawPixelsub(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: ByteArray?, arg5: Int)

        @JvmStatic
        fun glVertex3f(arg0: Float, arg1: Float, arg2: Float)

        @JvmStatic
        fun glUniform4fARB(arg0: Int, arg1: Float, arg2: Float, arg3: Float, arg4: Float)

        fun glFrustum(arg0: Double, arg1: Double, arg2: Double, arg3: Double, arg4: Double, arg5: Double)

        @JvmStatic
        fun glTexEnvi(arg0: Int, arg1: Int, arg2: Int)

        @JvmStatic
        fun glCreateProgramObjectARB(): Long

        @JvmStatic
        fun glNormal3f(arg0: Float, arg1: Float, arg2: Float)

        fun glGetTexImageub(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: ByteArray?, arg5: Int)

        @JvmStatic
        fun glGenFramebuffersEXT(arg0: Int, arg1: IntArray?, arg2: Int)

        fun glGetProgramivARB(arg0: Int, arg1: Int, arg2: IntArray?, arg3: Int)

        @JvmStatic
        fun glUniform3fARB(arg0: Int, arg1: Float, arg2: Float, arg3: Float)

        fun glDrawBuffersARB(arg0: Int, arg1: IntArray?, arg2: Int)

        @JvmStatic
        fun glCreateShaderObjectARB(arg0: Int): Long

        fun glMapBufferARB(arg0: Int, arg1: Int): Long

        fun glColor3ub(arg0: Byte, arg1: Byte, arg2: Byte)

        @JvmStatic
        fun glGetIntegerv(arg0: Int, arg1: IntArray?, arg2: Int)

        @JvmStatic
        fun glShadeModel(arg0: Int)

        @JvmStatic
        fun glProgramStringARB(arg0: Int, arg1: Int, arg2: String?)

        @JvmStatic
        fun glGenProgramARB(): Int

        @JvmStatic
        fun glPushAttrib(arg0: Int)

        @JvmStatic
        fun glFlush()

        @JvmStatic
        fun glRenderbufferStorageMultisampleEXT(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int)

        @JvmStatic
        fun glEnable(arg0: Int)

        @JvmStatic
        fun glDisable(arg0: Int)

        @JvmStatic
        fun glGenTextures(arg0: Int, arg1: IntArray?, arg2: Int)

        @JvmStatic
        fun glFramebufferTexture2DEXT(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int)

        @JvmStatic
        fun glBindBufferARB(arg0: Int, arg1: Int)

        @JvmStatic
        fun glMultiTexCoord3i(arg0: Int, arg1: Int, arg2: Int, arg3: Int)

        @JvmStatic
        fun glColorMaterial(arg0: Int, arg1: Int)

        @JvmStatic
        fun glTexSubImage2Dub(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: Int, arg6: Int, arg7: Int, arg8: ByteArray?, arg9: Int)

        @JvmStatic
        fun glShaderSourceARB(arg0: Long, arg1: String?)

        @JvmStatic
        fun glGetTexImagei(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: IntArray?, arg5: Int)

        @JvmStatic
        fun glGetString(arg0: Int): String

        fun glPixelZoom(arg0: Float, arg1: Float)

        @JvmStatic
        fun glDisableClientState(arg0: Int)

        @JvmStatic
        fun glClear(arg0: Int)

        @JvmStatic
        fun glPointSize(arg0: Float)

        @JvmStatic
        fun glCopyPixels(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int)

        @JvmStatic
        fun glTexCoord2f(arg0: Float, arg1: Float)

        @JvmStatic
        fun glBindProgramARB(arg0: Int, arg1: Int)

        @JvmStatic
        fun glGenRenderbuffersEXT(arg0: Int, arg1: IntArray?, arg2: Int)

        @JvmStatic
        fun glPopAttrib()

        @JvmStatic
        fun glVertex2f(arg0: Float, arg1: Float)

        @JvmStatic
        fun glLoadIdentity()

        @JvmStatic
        fun glGenLists(arg0: Int): Int

        @JvmStatic
        fun glColorPointer(arg0: Int, arg1: Int, arg2: Int, arg3: Long)

        @JvmStatic
        fun glPopMatrix()

        @JvmStatic
        fun glEnableClientState(arg0: Int)

        @JvmStatic
        fun glShaderSourceRawARB(arg0: Long, arg1: ByteArray?)

        @JvmStatic
        fun glColor3f(arg0: Float, arg1: Float, arg2: Float)

        @JvmStatic
        fun glTexEnvf(arg0: Int, arg1: Int, arg2: Float)

        @JvmStatic
        fun glProgramLocalParameter4fARB(arg0: Int, arg1: Int, arg2: Float, arg3: Float, arg4: Float, arg5: Float)

        @JvmStatic
        fun glAlphaFunc(arg0: Int, arg1: Float)

        @JvmStatic
        fun glDeleteTextures(arg0: Int, arg1: IntArray?, arg2: Int)

        @JvmStatic
        fun glDrawBuffer(arg0: Int)

        @JvmStatic
        fun glBegin(arg0: Int)

        @JvmStatic
        fun glFogf(arg0: Int, arg1: Float)

        @JvmStatic
        fun glAttachObjectARB(arg0: Long, arg1: Long)

        @JvmStatic
        fun glCheckFramebufferStatusEXT(arg0: Int): Int

        @JvmStatic
        fun glTexImage2Dub(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: Int, arg6: Int, arg7: Int, arg8: ByteArray?, arg9: Int)

        fun glUniformMatrix4fvARB(arg0: Int, arg1: Int, arg2: Boolean, arg3: FloatArray?, arg4: Int)

        @JvmStatic
        fun glProgramRawARB(arg0: Int, arg1: Int, arg2: ByteArray?)
    }
}
