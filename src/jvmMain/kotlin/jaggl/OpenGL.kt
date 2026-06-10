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

        @JvmStatic
		external fun glTranslatef(arg0: Float, arg1: Float, arg2: Float)

        @JvmStatic
		external fun glBindRenderbufferEXT(arg0: Int, arg1: Int)

        @JvmStatic
		external fun glScalef(arg0: Float, arg1: Float, arg2: Float)

        @JvmStatic
		external fun glActiveTexture(arg0: Int)

        @JvmStatic
		external fun glProgramLocalParameter4fvARB(arg0: Int, arg1: Int, arg2: FloatArray?, arg3: Int)

        @JvmStatic
		external fun glGetObjectParameterivARB(arg0: Long, arg1: Int, arg2: IntArray?, arg3: Int)

        @JvmStatic
		external fun glFramebufferTexture3DEXT(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: Int)

        @JvmStatic
		external fun glDeleteLists(arg0: Int, arg1: Int)

        @JvmStatic
		external fun glUniform1iARB(arg0: Int, arg1: Int)

        @JvmStatic
		external fun glFinish()

        @JvmStatic
		external fun glDrawElements(arg0: Int, arg1: Int, arg2: Int, arg3: Long)

        @JvmStatic
		external fun glReadBuffer(arg0: Int)

        private external fun glGetError(): Int

        @JvmStatic
		external fun glUseProgramObjectARB(arg0: Long)

        private external fun glColor4f(arg0: Float, arg1: Float, arg2: Float, arg3: Float)

        @JvmStatic
		external fun glTexGeni(arg0: Int, arg1: Int, arg2: Int)

        @JvmStatic
		external fun glDeleteFramebuffersEXT(arg0: Int, arg1: IntArray?, arg2: Int)

        @JvmStatic
		external fun glColorMask(arg0: Boolean, arg1: Boolean, arg2: Boolean, arg3: Boolean)

        @JvmStatic
		external fun glCullFace(arg0: Int)

        @JvmStatic
		external fun glLoadMatrixf(arg0: FloatArray?, arg1: Int)

        @JvmStatic
		external fun glRasterPos2i(arg0: Int, arg1: Int)

        @JvmStatic
		external fun glBufferDataARBa(arg0: Int, arg1: Int, arg2: Long, arg3: Int)

        private external fun glStencilFunc(arg0: Int, arg1: Int, arg2: Int)

        @JvmStatic
		external fun glClearColor(arg0: Float, arg1: Float, arg2: Float, arg3: Float)

        @JvmStatic
		external fun glRenderbufferStorageEXT(arg0: Int, arg1: Int, arg2: Int, arg3: Int)

        @JvmStatic
		external fun glDeleteBuffersARB(arg0: Int, arg1: IntArray?, arg2: Int)

        @JvmStatic
		external fun glCopyTexSubImage3D(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: Int, arg6: Int, arg7: Int, arg8: Int)

        @JvmStatic
		external fun glTexImage2Df(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: Int, arg6: Int, arg7: Int, arg8: FloatArray?, arg9: Int)

        @JvmStatic
		external fun glReadPixelsi(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: Int, arg6: IntArray?, arg7: Int)

        @JvmStatic
		external fun glTexCoordPointer(arg0: Int, arg1: Int, arg2: Int, arg3: Long)

        @JvmStatic
		external fun glBindTexture(arg0: Int, arg1: Int)

        @JvmStatic
		external fun glLinkProgramARB(arg0: Long)

        @JvmStatic
		external fun glOrtho(arg0: Double, arg1: Double, arg2: Double, arg3: Double, arg4: Double, arg5: Double)

        private external fun glUniformMatrix3fvARB(arg0: Int, arg1: Int, arg2: Boolean, arg3: FloatArray?, arg4: Int)

        private external fun glUniformMatrix2fvARB(arg0: Int, arg1: Int, arg2: Boolean, arg3: FloatArray?, arg4: Int)

        @JvmStatic
		external fun glBufferSubDataARBa(arg0: Int, arg1: Int, arg2: Int, arg3: Long)

        @JvmStatic
		external fun glDeleteRenderbuffersEXT(arg0: Int, arg1: IntArray?, arg2: Int)

        @JvmStatic
		external fun glPixelStorei(arg0: Int, arg1: Int)

        @JvmStatic
		external fun glScissor(arg0: Int, arg1: Int, arg2: Int, arg3: Int)

        private external fun glTexCoord2i(arg0: Int, arg1: Int)

        @JvmStatic
		external fun glLineWidth(arg0: Float)

        @JvmStatic
		external fun glGenerateMipmapEXT(arg0: Int)

        @JvmStatic
		external fun glDeleteObjectARB(arg0: Long)

        private external fun glMultiTexCoord2i(arg0: Int, arg1: Int, arg2: Int)

        @JvmStatic
		external fun glRotatef(arg0: Float, arg1: Float, arg2: Float, arg3: Float)

        @JvmStatic
		external fun glMultiTexCoord2f(arg0: Int, arg1: Float, arg2: Float)

        @JvmStatic
		external fun glFramebufferRenderbufferEXT(arg0: Int, arg1: Int, arg2: Int, arg3: Int)

        @JvmStatic
		external fun glTexSubImage2Di(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: Int, arg6: Int, arg7: Int, arg8: IntArray?, arg9: Int)

        @JvmStatic
		external fun glLightf(arg0: Int, arg1: Int, arg2: Float)

        @JvmStatic
		external fun glTexGenfv(arg0: Int, arg1: Int, arg2: FloatArray?, arg3: Int)

        @JvmStatic
		external fun glTexCoord3i(arg0: Int, arg1: Int, arg2: Int)

        @JvmStatic
		external fun glDrawArrays(arg0: Int, arg1: Int, arg2: Int)

        @JvmStatic
		external fun glCallList(arg0: Int)

        @JvmStatic
		external fun glDeleteProgramARB(arg0: Int)

        @JvmStatic
		external fun glBindFramebufferEXT(arg0: Int, arg1: Int)

        @JvmStatic
		external fun glTexCoord3f(arg0: Float, arg1: Float, arg2: Float)

        @JvmStatic
		external fun glGenBuffersARB(arg0: Int, arg1: IntArray?, arg2: Int)

        @JvmStatic
		external fun glVertexPointer(arg0: Int, arg1: Int, arg2: Int, arg3: Long)

        @JvmStatic
		external fun glGetInfoLogARB(arg0: Long, arg1: Int, arg2: IntArray?, arg3: Int, arg4: ByteArray?, arg5: Int)

        private external fun glReadPixelsub(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: Int, arg6: ByteArray?, arg7: Int)

        @JvmStatic
		external fun glDepthMask(arg0: Boolean)

        @JvmStatic
		external fun glEnd()

        @JvmStatic
		external fun glEndList()

        @JvmStatic
		external fun glTexImage3Dub(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: Int, arg6: Int, arg7: Int, arg8: Int, arg9: ByteArray?, arg10: Int)

        @JvmStatic
		external fun glTexImage1Dub(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: Int, arg6: Int, arg7: ByteArray?, arg8: Int)

        @JvmStatic
		external fun glBlendFunc(arg0: Int, arg1: Int)

        private external fun glStencilOp(arg0: Int, arg1: Int, arg2: Int)

        @JvmStatic
		external fun glClearDepth(arg0: Float)

        @JvmStatic
		external fun glGetUniformLocationARB(arg0: Long, arg1: String?): Int

        @JvmStatic
		external fun glNewList(arg0: Int, arg1: Int)

        @JvmStatic
		external fun glViewport(arg0: Int, arg1: Int, arg2: Int, arg3: Int)

        @JvmStatic
		external fun glTexEnvfv(arg0: Int, arg1: Int, arg2: FloatArray?, arg3: Int)

        @JvmStatic
		external fun glPolygonMode(arg0: Int, arg1: Int)

        @JvmStatic
		external fun glTexParameteri(arg0: Int, arg1: Int, arg2: Int)

        @JvmStatic
		external fun glPushMatrix()

        @JvmStatic
		external fun glPixelTransferf(arg0: Int, arg1: Float)

        @JvmStatic
		external fun glUniform1fARB(arg0: Int, arg1: Float)

        @JvmStatic
		external fun glBlitFramebufferEXT(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: Int, arg6: Int, arg7: Int, arg8: Int, arg9: Int)

        @JvmStatic
		external fun glCopyTexSubImage2D(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: Int, arg6: Int, arg7: Int)

        @JvmStatic
		external fun glCompileShaderARB(arg0: Long)

        private external fun glMaterialfv(arg0: Int, arg1: Int, arg2: FloatArray?, arg3: Int)

        @JvmStatic
		external fun glDetachObjectARB(arg0: Long, arg1: Long)

        @JvmStatic
		external fun glNormalPointer(arg0: Int, arg1: Int, arg2: Long)

        @JvmStatic
		external fun glUniform2fARB(arg0: Int, arg1: Float, arg2: Float)

        @JvmStatic
		external fun glLightfv(arg0: Int, arg1: Int, arg2: FloatArray?, arg3: Int)

        @JvmStatic
		external fun glFogfv(arg0: Int, arg1: FloatArray?, arg2: Int)

        @JvmStatic
		external fun glGetFloatv(arg0: Int, arg1: FloatArray?, arg2: Int)

        @JvmStatic
		external fun glHint(arg0: Int, arg1: Int)

        @JvmStatic
		external fun glBufferDataARBub(arg0: Int, arg1: Int, arg2: ByteArray?, arg3: Int, arg4: Int)

        @JvmStatic
		external fun glTexSubImage2Df(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: Int, arg6: Int, arg7: Int, arg8: FloatArray?, arg9: Int)

        @JvmStatic
		external fun glClientActiveTexture(arg0: Int)

        @JvmStatic
		external fun glLightModelfv(arg0: Int, arg1: FloatArray?, arg2: Int)

        private external fun glTexParameterf(arg0: Int, arg1: Int, arg2: Float)

        @JvmStatic
		external fun glMatrixMode(arg0: Int)

        @JvmStatic
		external fun glCopyTexImage2D(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: Int, arg6: Int, arg7: Int)

        @JvmStatic
		external fun glTexImage2Di(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: Int, arg6: Int, arg7: Int, arg8: IntArray?, arg9: Int)

        external fun glUnmapBufferARB(arg0: Int): Boolean

        @JvmStatic
		external fun glColor4ub(arg0: Byte, arg1: Byte, arg2: Byte, arg3: Byte)

        @JvmStatic
		external fun glBufferSubDataARBub(arg0: Int, arg1: Int, arg2: Int, arg3: ByteArray?, arg4: Int)

        @JvmStatic
		external fun glMultMatrixf(arg0: FloatArray?, arg1: Int)

        @JvmStatic
		external fun glFogi(arg0: Int, arg1: Int)

        @JvmStatic
		external fun glVertex2i(arg0: Int, arg1: Int)

        @JvmStatic
		external fun glDepthFunc(arg0: Int)

        private external fun glDrawPixelsi(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: IntArray?, arg5: Int)

        private external fun glDrawPixelsub(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: ByteArray?, arg5: Int)

        @JvmStatic
		external fun glVertex3f(arg0: Float, arg1: Float, arg2: Float)

        @JvmStatic
		external fun glUniform4fARB(arg0: Int, arg1: Float, arg2: Float, arg3: Float, arg4: Float)

        private external fun glFrustum(arg0: Double, arg1: Double, arg2: Double, arg3: Double, arg4: Double, arg5: Double)

        @JvmStatic
		external fun glTexEnvi(arg0: Int, arg1: Int, arg2: Int)

        @JvmStatic
		external fun glCreateProgramObjectARB(): Long

        @JvmStatic
		external fun glNormal3f(arg0: Float, arg1: Float, arg2: Float)

        private external fun glGetTexImageub(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: ByteArray?, arg5: Int)

        @JvmStatic
		external fun glGenFramebuffersEXT(arg0: Int, arg1: IntArray?, arg2: Int)

        private external fun glGetProgramivARB(arg0: Int, arg1: Int, arg2: IntArray?, arg3: Int)

        @JvmStatic
		external fun glUniform3fARB(arg0: Int, arg1: Float, arg2: Float, arg3: Float)

        private external fun glDrawBuffersARB(arg0: Int, arg1: IntArray?, arg2: Int)

        @JvmStatic
		external fun glCreateShaderObjectARB(arg0: Int): Long

        external fun glMapBufferARB(arg0: Int, arg1: Int): Long

        private external fun glColor3ub(arg0: Byte, arg1: Byte, arg2: Byte)

        @JvmStatic
		external fun glGetIntegerv(arg0: Int, arg1: IntArray?, arg2: Int)

        @JvmStatic
		external fun glShadeModel(arg0: Int)

        @JvmStatic
		external fun glProgramStringARB(arg0: Int, arg1: Int, arg2: String?)

        @JvmStatic
		external fun glGenProgramARB(): Int

        @JvmStatic
		external fun glPushAttrib(arg0: Int)

        @JvmStatic
		external fun glFlush()

        @JvmStatic
		external fun glRenderbufferStorageMultisampleEXT(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int)

        @JvmStatic
		external fun glEnable(arg0: Int)

        @JvmStatic
		external fun glDisable(arg0: Int)

        @JvmStatic
		external fun glGenTextures(arg0: Int, arg1: IntArray?, arg2: Int)

        @JvmStatic
		external fun glFramebufferTexture2DEXT(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int)

        @JvmStatic
		external fun glBindBufferARB(arg0: Int, arg1: Int)

        @JvmStatic
		external fun glMultiTexCoord3i(arg0: Int, arg1: Int, arg2: Int, arg3: Int)

        @JvmStatic
		external fun glColorMaterial(arg0: Int, arg1: Int)

        @JvmStatic
		external fun glTexSubImage2Dub(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: Int, arg6: Int, arg7: Int, arg8: ByteArray?, arg9: Int)

        @JvmStatic
		external fun glShaderSourceARB(arg0: Long, arg1: String?)

        @JvmStatic
		external fun glGetTexImagei(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: IntArray?, arg5: Int)

        @JvmStatic
		external fun glGetString(arg0: Int): String

        private external fun glPixelZoom(arg0: Float, arg1: Float)

        @JvmStatic
		external fun glDisableClientState(arg0: Int)

        @JvmStatic
		external fun glClear(arg0: Int)

        @JvmStatic
		external fun glPointSize(arg0: Float)

        @JvmStatic
		external fun glCopyPixels(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int)

        @JvmStatic
		external fun glTexCoord2f(arg0: Float, arg1: Float)

        @JvmStatic
		external fun glBindProgramARB(arg0: Int, arg1: Int)

        @JvmStatic
		external fun glGenRenderbuffersEXT(arg0: Int, arg1: IntArray?, arg2: Int)

        @JvmStatic
		external fun glPopAttrib()

        @JvmStatic
		external fun glVertex2f(arg0: Float, arg1: Float)

        @JvmStatic
		external fun glLoadIdentity()

        @JvmStatic
		external fun glGenLists(arg0: Int): Int

        @JvmStatic
		external fun glColorPointer(arg0: Int, arg1: Int, arg2: Int, arg3: Long)

        @JvmStatic
		external fun glPopMatrix()

        @JvmStatic
		external fun glEnableClientState(arg0: Int)

        @JvmStatic
		external fun glShaderSourceRawARB(arg0: Long, arg1: ByteArray?)

        @JvmStatic
		external fun glColor3f(arg0: Float, arg1: Float, arg2: Float)

        @JvmStatic
		external fun glTexEnvf(arg0: Int, arg1: Int, arg2: Float)

        @JvmStatic
		external fun glProgramLocalParameter4fARB(arg0: Int, arg1: Int, arg2: Float, arg3: Float, arg4: Float, arg5: Float)

        @JvmStatic
		external fun glAlphaFunc(arg0: Int, arg1: Float)

        @JvmStatic
		external fun glDeleteTextures(arg0: Int, arg1: IntArray?, arg2: Int)

        @JvmStatic
		external fun glDrawBuffer(arg0: Int)

        @JvmStatic
		external fun glBegin(arg0: Int)

        @JvmStatic
		external fun glFogf(arg0: Int, arg1: Float)

        @JvmStatic
		external fun glAttachObjectARB(arg0: Long, arg1: Long)

        @JvmStatic
		external fun glCheckFramebufferStatusEXT(arg0: Int): Int

        @JvmStatic
		external fun glTexImage2Dub(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: Int, arg6: Int, arg7: Int, arg8: ByteArray?, arg9: Int)

        private external fun glUniformMatrix4fvARB(arg0: Int, arg1: Int, arg2: Boolean, arg3: FloatArray?, arg4: Int)

        @JvmStatic
		external fun glProgramRawARB(arg0: Int, arg1: Int, arg2: ByteArray?)
    }
}
