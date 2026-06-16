package jaggl

import java.awt.Canvas
import java.util.*


class OpenGL {
    private var a: Thread? = null

    private var c: Hashtable<Any?, Any?>? = null

    private val peer: Long = 0

    private external fun detachPeer()

    external fun setSwapInterval(arg0: Int)

    external fun surfaceResized(arg0: Long)

    private external fun setPbuffer(arg0: Long)

    external fun arePbuffersAvailable(): Boolean

    @Synchronized
    fun a(): Boolean {
        if (this.a === Thread.currentThread()) {
            this.detachPeer()
            b.remove(this.a)
            this.a = null
            return true
        } else {
            return false
        }
    }

    private external fun releasePbuffer(arg0: Long)

    private external fun attachPeer(): Boolean

    external fun releaseSurface(arg0: Canvas?, arg1: Long)

    external fun init(arg0: Canvas?, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: Int, arg6: Int): Long

    @Synchronized
    fun b(): Boolean {
        val local1 = Thread.currentThread()
        if (!this.attachPeer()) {
            return false
        }
        val local10 = b.put(local1, this) as OpenGL?
        if (local10 != null) {
            local10.a = null
        }
        this.a = local1
        return true
    }

    private external fun createPbuffer(arg0: Int, arg1: Int): Long

    external fun swapBuffers()

    fun a(arg0: String?): Boolean {
        if (this.c == null) {
            this.c = Hashtable<Any?, Any?>()
            val local10: String = glGetString(7939)
            var local12 = 0
            while (true) {
                val local17 = local10.indexOf(32.toChar(), local12)
                if (local17 == -1) {
                    val local48 = local10.substring(local12).trim { it <= ' ' }
                    if (local48.length != 0) {
                        this.c!!.put(local48, local48)
                    }
                    break
                }
                val local26 = local10.substring(local12, local17).trim { it <= ' ' }
                if (local26.length != 0) {
                    this.c!!.put(local26, local26)
                }
                local12 = local17 + 1
            }
        }
        return this.c!!.containsKey(arg0)
    }

    external fun release()

    external fun prepareSurface(arg0: Canvas?): Long

    external fun setSurface(arg0: Long): Boolean

    companion object {
        private val b: Hashtable<Any?, Any?> = Hashtable<Any?, Any?>()

		external fun glTranslatef(arg0: Float, arg1: Float, arg2: Float)

		external fun glBindRenderbufferEXT(arg0: Int, arg1: Int)

		external fun glScalef(arg0: Float, arg1: Float, arg2: Float)

		external fun glActiveTexture(arg0: Int)

		external fun glProgramLocalParameter4fvARB(arg0: Int, arg1: Int, arg2: FloatArray?, arg3: Int)

		external fun glGetObjectParameterivARB(arg0: Long, arg1: Int, arg2: IntArray?, arg3: Int)

		external fun glFramebufferTexture3DEXT(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: Int)

		external fun glDeleteLists(arg0: Int, arg1: Int)

		external fun glUniform1iARB(arg0: Int, arg1: Int)

		external fun glFinish()

		external fun glDrawElements(arg0: Int, arg1: Int, arg2: Int, arg3: Long)

		external fun glReadBuffer(arg0: Int)

        private external fun glGetError(): Int

		external fun glUseProgramObjectARB(arg0: Long)

        private external fun glColor4f(arg0: Float, arg1: Float, arg2: Float, arg3: Float)

		external fun glTexGeni(arg0: Int, arg1: Int, arg2: Int)

		external fun glDeleteFramebuffersEXT(arg0: Int, arg1: IntArray?, arg2: Int)

		external fun glColorMask(arg0: Boolean, arg1: Boolean, arg2: Boolean, arg3: Boolean)

		external fun glCullFace(arg0: Int)

		external fun glLoadMatrixf(arg0: FloatArray?, arg1: Int)

		external fun glRasterPos2i(arg0: Int, arg1: Int)

		external fun glBufferDataARBa(arg0: Int, arg1: Int, arg2: Long, arg3: Int)

        private external fun glStencilFunc(arg0: Int, arg1: Int, arg2: Int)

		external fun glClearColor(arg0: Float, arg1: Float, arg2: Float, arg3: Float)

		external fun glRenderbufferStorageEXT(arg0: Int, arg1: Int, arg2: Int, arg3: Int)

		external fun glDeleteBuffersARB(arg0: Int, arg1: IntArray?, arg2: Int)

		external fun glCopyTexSubImage3D(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: Int, arg6: Int, arg7: Int, arg8: Int)

		external fun glTexImage2Df(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: Int, arg6: Int, arg7: Int, arg8: FloatArray?, arg9: Int)

		external fun glReadPixelsi(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: Int, arg6: IntArray?, arg7: Int)

		external fun glTexCoordPointer(arg0: Int, arg1: Int, arg2: Int, arg3: Long)

		external fun glBindTexture(arg0: Int, arg1: Int)

		external fun glLinkProgramARB(arg0: Long)

		external fun glOrtho(arg0: Double, arg1: Double, arg2: Double, arg3: Double, arg4: Double, arg5: Double)

        private external fun glUniformMatrix3fvARB(arg0: Int, arg1: Int, arg2: Boolean, arg3: FloatArray?, arg4: Int)

        private external fun glUniformMatrix2fvARB(arg0: Int, arg1: Int, arg2: Boolean, arg3: FloatArray?, arg4: Int)

		external fun glBufferSubDataARBa(arg0: Int, arg1: Int, arg2: Int, arg3: Long)

		external fun glDeleteRenderbuffersEXT(arg0: Int, arg1: IntArray?, arg2: Int)

		external fun glPixelStorei(arg0: Int, arg1: Int)

		external fun glScissor(arg0: Int, arg1: Int, arg2: Int, arg3: Int)

        private external fun glTexCoord2i(arg0: Int, arg1: Int)

		external fun glLineWidth(arg0: Float)

		external fun glGenerateMipmapEXT(arg0: Int)

		external fun glDeleteObjectARB(arg0: Long)

        private external fun glMultiTexCoord2i(arg0: Int, arg1: Int, arg2: Int)

		external fun glRotatef(arg0: Float, arg1: Float, arg2: Float, arg3: Float)

		external fun glMultiTexCoord2f(arg0: Int, arg1: Float, arg2: Float)

		external fun glFramebufferRenderbufferEXT(arg0: Int, arg1: Int, arg2: Int, arg3: Int)

		external fun glTexSubImage2Di(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: Int, arg6: Int, arg7: Int, arg8: IntArray?, arg9: Int)

		external fun glLightf(arg0: Int, arg1: Int, arg2: Float)

		external fun glTexGenfv(arg0: Int, arg1: Int, arg2: FloatArray?, arg3: Int)

		external fun glTexCoord3i(arg0: Int, arg1: Int, arg2: Int)

		external fun glDrawArrays(arg0: Int, arg1: Int, arg2: Int)

		external fun glCallList(arg0: Int)

		external fun glDeleteProgramARB(arg0: Int)

		external fun glBindFramebufferEXT(arg0: Int, arg1: Int)

		external fun glTexCoord3f(arg0: Float, arg1: Float, arg2: Float)

		external fun glGenBuffersARB(arg0: Int, arg1: IntArray?, arg2: Int)

		external fun glVertexPointer(arg0: Int, arg1: Int, arg2: Int, arg3: Long)

		external fun glGetInfoLogARB(arg0: Long, arg1: Int, arg2: IntArray?, arg3: Int, arg4: ByteArray?, arg5: Int)

        private external fun glReadPixelsub(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: Int, arg6: ByteArray?, arg7: Int)

		external fun glDepthMask(arg0: Boolean)

		external fun glEnd()

		external fun glEndList()

		external fun glTexImage3Dub(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: Int, arg6: Int, arg7: Int, arg8: Int, arg9: ByteArray?, arg10: Int)

		external fun glTexImage1Dub(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: Int, arg6: Int, arg7: ByteArray?, arg8: Int)

		external fun glBlendFunc(arg0: Int, arg1: Int)

        private external fun glStencilOp(arg0: Int, arg1: Int, arg2: Int)

		external fun glClearDepth(arg0: Float)

		external fun glGetUniformLocationARB(arg0: Long, arg1: String?): Int

		external fun glNewList(arg0: Int, arg1: Int)

		external fun glViewport(arg0: Int, arg1: Int, arg2: Int, arg3: Int)

		external fun glTexEnvfv(arg0: Int, arg1: Int, arg2: FloatArray?, arg3: Int)

		external fun glPolygonMode(arg0: Int, arg1: Int)

		external fun glTexParameteri(arg0: Int, arg1: Int, arg2: Int)

		external fun glPushMatrix()

		external fun glPixelTransferf(arg0: Int, arg1: Float)

		external fun glUniform1fARB(arg0: Int, arg1: Float)

		external fun glBlitFramebufferEXT(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: Int, arg6: Int, arg7: Int, arg8: Int, arg9: Int)

		external fun glCopyTexSubImage2D(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: Int, arg6: Int, arg7: Int)

		external fun glCompileShaderARB(arg0: Long)

        private external fun glMaterialfv(arg0: Int, arg1: Int, arg2: FloatArray?, arg3: Int)

		external fun glDetachObjectARB(arg0: Long, arg1: Long)

		external fun glNormalPointer(arg0: Int, arg1: Int, arg2: Long)

		external fun glUniform2fARB(arg0: Int, arg1: Float, arg2: Float)

		external fun glLightfv(arg0: Int, arg1: Int, arg2: FloatArray?, arg3: Int)

		external fun glFogfv(arg0: Int, arg1: FloatArray?, arg2: Int)

		external fun glGetFloatv(arg0: Int, arg1: FloatArray?, arg2: Int)

		external fun glHint(arg0: Int, arg1: Int)

		external fun glBufferDataARBub(arg0: Int, arg1: Int, arg2: ByteArray?, arg3: Int, arg4: Int)

		external fun glTexSubImage2Df(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: Int, arg6: Int, arg7: Int, arg8: FloatArray?, arg9: Int)

		external fun glClientActiveTexture(arg0: Int)

		external fun glLightModelfv(arg0: Int, arg1: FloatArray?, arg2: Int)

        private external fun glTexParameterf(arg0: Int, arg1: Int, arg2: Float)

		external fun glMatrixMode(arg0: Int)

		external fun glCopyTexImage2D(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: Int, arg6: Int, arg7: Int)

		external fun glTexImage2Di(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: Int, arg6: Int, arg7: Int, arg8: IntArray?, arg9: Int)

        external fun glUnmapBufferARB(arg0: Int): Boolean

		external fun glColor4ub(arg0: Byte, arg1: Byte, arg2: Byte, arg3: Byte)

		external fun glBufferSubDataARBub(arg0: Int, arg1: Int, arg2: Int, arg3: ByteArray?, arg4: Int)

		external fun glMultMatrixf(arg0: FloatArray?, arg1: Int)

		external fun glFogi(arg0: Int, arg1: Int)

		external fun glVertex2i(arg0: Int, arg1: Int)

		external fun glDepthFunc(arg0: Int)

        private external fun glDrawPixelsi(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: IntArray?, arg5: Int)

        private external fun glDrawPixelsub(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: ByteArray?, arg5: Int)

		external fun glVertex3f(arg0: Float, arg1: Float, arg2: Float)

		external fun glUniform4fARB(arg0: Int, arg1: Float, arg2: Float, arg3: Float, arg4: Float)

        private external fun glFrustum(arg0: Double, arg1: Double, arg2: Double, arg3: Double, arg4: Double, arg5: Double)

		external fun glTexEnvi(arg0: Int, arg1: Int, arg2: Int)

		external fun glCreateProgramObjectARB(): Long

		external fun glNormal3f(arg0: Float, arg1: Float, arg2: Float)

        private external fun glGetTexImageub(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: ByteArray?, arg5: Int)

		external fun glGenFramebuffersEXT(arg0: Int, arg1: IntArray?, arg2: Int)

        private external fun glGetProgramivARB(arg0: Int, arg1: Int, arg2: IntArray?, arg3: Int)

		external fun glUniform3fARB(arg0: Int, arg1: Float, arg2: Float, arg3: Float)

        private external fun glDrawBuffersARB(arg0: Int, arg1: IntArray?, arg2: Int)

		external fun glCreateShaderObjectARB(arg0: Int): Long

        external fun glMapBufferARB(arg0: Int, arg1: Int): Long

        private external fun glColor3ub(arg0: Byte, arg1: Byte, arg2: Byte)

		external fun glGetIntegerv(arg0: Int, arg1: IntArray?, arg2: Int)

		external fun glShadeModel(arg0: Int)

		external fun glProgramStringARB(arg0: Int, arg1: Int, arg2: String?)

		external fun glGenProgramARB(): Int

		external fun glPushAttrib(arg0: Int)

		external fun glFlush()

		external fun glRenderbufferStorageMultisampleEXT(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int)

		external fun glEnable(arg0: Int)

		external fun glDisable(arg0: Int)

		external fun glGenTextures(arg0: Int, arg1: IntArray?, arg2: Int)

		external fun glFramebufferTexture2DEXT(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int)

		external fun glBindBufferARB(arg0: Int, arg1: Int)

		external fun glMultiTexCoord3i(arg0: Int, arg1: Int, arg2: Int, arg3: Int)

		external fun glColorMaterial(arg0: Int, arg1: Int)

		external fun glTexSubImage2Dub(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: Int, arg6: Int, arg7: Int, arg8: ByteArray?, arg9: Int)

		external fun glShaderSourceARB(arg0: Long, arg1: String?)

		external fun glGetTexImagei(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: IntArray?, arg5: Int)

		external fun glGetString(arg0: Int): String

        private external fun glPixelZoom(arg0: Float, arg1: Float)

		external fun glDisableClientState(arg0: Int)

		external fun glClear(arg0: Int)

		external fun glPointSize(arg0: Float)

		external fun glCopyPixels(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int)

		external fun glTexCoord2f(arg0: Float, arg1: Float)

		external fun glBindProgramARB(arg0: Int, arg1: Int)

		external fun glGenRenderbuffersEXT(arg0: Int, arg1: IntArray?, arg2: Int)

		external fun glPopAttrib()

		external fun glVertex2f(arg0: Float, arg1: Float)

		external fun glLoadIdentity()

		external fun glGenLists(arg0: Int): Int

		external fun glColorPointer(arg0: Int, arg1: Int, arg2: Int, arg3: Long)

		external fun glPopMatrix()

		external fun glEnableClientState(arg0: Int)

		external fun glShaderSourceRawARB(arg0: Long, arg1: ByteArray?)

		external fun glColor3f(arg0: Float, arg1: Float, arg2: Float)

		external fun glTexEnvf(arg0: Int, arg1: Int, arg2: Float)

		external fun glProgramLocalParameter4fARB(arg0: Int, arg1: Int, arg2: Float, arg3: Float, arg4: Float, arg5: Float)

		external fun glAlphaFunc(arg0: Int, arg1: Float)

		external fun glDeleteTextures(arg0: Int, arg1: IntArray?, arg2: Int)

		external fun glDrawBuffer(arg0: Int)

		external fun glBegin(arg0: Int)

		external fun glFogf(arg0: Int, arg1: Float)

		external fun glAttachObjectARB(arg0: Long, arg1: Long)

		external fun glCheckFramebufferStatusEXT(arg0: Int): Int

		external fun glTexImage2Dub(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: Int, arg6: Int, arg7: Int, arg8: ByteArray?, arg9: Int)

        private external fun glUniformMatrix4fvARB(arg0: Int, arg1: Int, arg2: Boolean, arg3: FloatArray?, arg4: Int)

		external fun glProgramRawARB(arg0: Int, arg1: Int, arg2: ByteArray?)
    }
}
