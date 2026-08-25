package jaggl

import awt.Canvas
import util.Hashtable
import kotlin.jvm.JvmStatic

actual class OpenGL {
    /*private*/ actual var a: Thread? = null

    /*private*/ actual var c: util.Hashtable<Any?, Any?>? = null

    /*private*/ actual val peer: Long = 0

    /*private*/ actual external fun detachPeer()

    actual external fun setSwapInterval(arg0: Int)

    actual external fun surfaceResized(arg0: Long)

    /*private*/ actual external fun setPbuffer(arg0: Long)

    actual external fun arePbuffersAvailable(): Boolean

    @Synchronized
    actual fun a(): Boolean {
        if (this.a === Thread.currentThread()) {
            this.detachPeer()
            b.remove(this.a)
            this.a = null
            return true
        } else {
            return false
        }
    }

    /*private*/ actual external fun releasePbuffer(arg0: Long)

    /*private*/ actual external fun attachPeer(): Boolean

    actual external fun releaseSurface(arg0: Canvas?, arg1: Long)

    actual external fun init(arg0: Canvas?, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: Int, arg6: Int): Long

    @Synchronized
    actual fun b(): Boolean {
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

    /*private*/ actual external fun createPbuffer(arg0: Int, arg1: Int): Long

    actual external fun swapBuffers()

    actual fun a(arg0: String?): Boolean {
        if (this.c == null) {
            this.c = _root_ide_package_.util.Hashtable<Any?, Any?>()
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

    actual external fun release()

    actual external fun prepareSurface(arg0: Canvas?): Long

    actual external fun setSurface(arg0: Long): Boolean

    actual companion object {
        private val b: util.Hashtable<Any?, Any?> = _root_ide_package_.util.Hashtable<Any?, Any?>()

        @JvmStatic
		actual external fun glTranslatef(arg0: Float, arg1: Float, arg2: Float)

        @JvmStatic
		actual external fun glBindRenderbufferEXT(arg0: Int, arg1: Int)

        @JvmStatic
		actual external fun glScalef(arg0: Float, arg1: Float, arg2: Float)

        @JvmStatic
		actual external fun glActiveTexture(arg0: Int)

        @JvmStatic
		actual external fun glProgramLocalParameter4fvARB(arg0: Int, arg1: Int, arg2: FloatArray?, arg3: Int)

        @JvmStatic
		actual external fun glGetObjectParameterivARB(arg0: Long, arg1: Int, arg2: IntArray?, arg3: Int)

        @JvmStatic
		actual external fun glFramebufferTexture3DEXT(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: Int)

        @JvmStatic
		actual external fun glDeleteLists(arg0: Int, arg1: Int)

        @JvmStatic
		actual external fun glUniform1iARB(arg0: Int, arg1: Int)

        @JvmStatic
		actual external fun glFinish()

        @JvmStatic
		actual external fun glDrawElements(arg0: Int, arg1: Int, arg2: Int, arg3: Long)

        @JvmStatic
		actual external fun glReadBuffer(arg0: Int)

        /*private*/ actual external fun glGetError(): Int

        @JvmStatic
		actual external fun glUseProgramObjectARB(arg0: Long)

        /*private*/ actual external fun glColor4f(arg0: Float, arg1: Float, arg2: Float, arg3: Float)

        @JvmStatic
		actual external fun glTexGeni(arg0: Int, arg1: Int, arg2: Int)

        @JvmStatic
		actual external fun glDeleteFramebuffersEXT(arg0: Int, arg1: IntArray?, arg2: Int)

        @JvmStatic
		actual external fun glColorMask(arg0: Boolean, arg1: Boolean, arg2: Boolean, arg3: Boolean)

        @JvmStatic
		actual external fun glCullFace(arg0: Int)

        @JvmStatic
		actual external fun glLoadMatrixf(arg0: FloatArray?, arg1: Int)

        @JvmStatic
		actual external fun glRasterPos2i(arg0: Int, arg1: Int)

        @JvmStatic
		actual external fun glBufferDataARBa(arg0: Int, arg1: Int, arg2: Long, arg3: Int)

        /*private*/ actual external fun glStencilFunc(arg0: Int, arg1: Int, arg2: Int)

        @JvmStatic
		actual external fun glClearColor(arg0: Float, arg1: Float, arg2: Float, arg3: Float)

        @JvmStatic
		actual external fun glRenderbufferStorageEXT(arg0: Int, arg1: Int, arg2: Int, arg3: Int)

        @JvmStatic
		actual external fun glDeleteBuffersARB(arg0: Int, arg1: IntArray?, arg2: Int)

        @JvmStatic
		actual external fun glCopyTexSubImage3D(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: Int, arg6: Int, arg7: Int, arg8: Int)

        @JvmStatic
		actual external fun glTexImage2Df(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: Int, arg6: Int, arg7: Int, arg8: FloatArray?, arg9: Int)

        @JvmStatic
		actual external fun glReadPixelsi(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: Int, arg6: IntArray?, arg7: Int)

        @JvmStatic
		actual external fun glTexCoordPointer(arg0: Int, arg1: Int, arg2: Int, arg3: Long)

        @JvmStatic
		actual external fun glBindTexture(arg0: Int, arg1: Int)

        @JvmStatic
		actual external fun glLinkProgramARB(arg0: Long)

        @JvmStatic
		actual external fun glOrtho(arg0: Double, arg1: Double, arg2: Double, arg3: Double, arg4: Double, arg5: Double)

        /*private*/ actual external fun glUniformMatrix3fvARB(arg0: Int, arg1: Int, arg2: Boolean, arg3: FloatArray?, arg4: Int)

        /*private*/ actual external fun glUniformMatrix2fvARB(arg0: Int, arg1: Int, arg2: Boolean, arg3: FloatArray?, arg4: Int)

        @JvmStatic
		actual external fun glBufferSubDataARBa(arg0: Int, arg1: Int, arg2: Int, arg3: Long)

        @JvmStatic
		actual external fun glDeleteRenderbuffersEXT(arg0: Int, arg1: IntArray?, arg2: Int)

        @JvmStatic
		actual external fun glPixelStorei(arg0: Int, arg1: Int)

        @JvmStatic
		actual external fun glScissor(arg0: Int, arg1: Int, arg2: Int, arg3: Int)

        /*private*/ actual external fun glTexCoord2i(arg0: Int, arg1: Int)

        @JvmStatic
		actual external fun glLineWidth(arg0: Float)

        @JvmStatic
		actual external fun glGenerateMipmapEXT(arg0: Int)

        @JvmStatic
		actual external fun glDeleteObjectARB(arg0: Long)

        /*private*/ actual external fun glMultiTexCoord2i(arg0: Int, arg1: Int, arg2: Int)

        @JvmStatic
		actual external fun glRotatef(arg0: Float, arg1: Float, arg2: Float, arg3: Float)

        @JvmStatic
		actual external fun glMultiTexCoord2f(arg0: Int, arg1: Float, arg2: Float)

        @JvmStatic
		actual external fun glFramebufferRenderbufferEXT(arg0: Int, arg1: Int, arg2: Int, arg3: Int)

        @JvmStatic
		actual external fun glTexSubImage2Di(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: Int, arg6: Int, arg7: Int, arg8: IntArray?, arg9: Int)

        @JvmStatic
		actual external fun glLightf(arg0: Int, arg1: Int, arg2: Float)

        @JvmStatic
		actual external fun glTexGenfv(arg0: Int, arg1: Int, arg2: FloatArray?, arg3: Int)

        @JvmStatic
		actual external fun glTexCoord3i(arg0: Int, arg1: Int, arg2: Int)

        @JvmStatic
		actual external fun glDrawArrays(arg0: Int, arg1: Int, arg2: Int)

        @JvmStatic
		actual external fun glCallList(arg0: Int)

        @JvmStatic
		actual external fun glDeleteProgramARB(arg0: Int)

        @JvmStatic
		actual external fun glBindFramebufferEXT(arg0: Int, arg1: Int)

        @JvmStatic
		actual external fun glTexCoord3f(arg0: Float, arg1: Float, arg2: Float)

        @JvmStatic
		actual external fun glGenBuffersARB(arg0: Int, arg1: IntArray?, arg2: Int)

        @JvmStatic
		actual external fun glVertexPointer(arg0: Int, arg1: Int, arg2: Int, arg3: Long)

        @JvmStatic
		actual external fun glGetInfoLogARB(arg0: Long, arg1: Int, arg2: IntArray?, arg3: Int, arg4: ByteArray?, arg5: Int)

        /*private*/ actual external fun glReadPixelsub(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: Int, arg6: ByteArray?, arg7: Int)

        @JvmStatic
		actual external fun glDepthMask(arg0: Boolean)

        @JvmStatic
		actual external fun glEnd()

        @JvmStatic
		actual external fun glEndList()

        @JvmStatic
		actual external fun glTexImage3Dub(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: Int, arg6: Int, arg7: Int, arg8: Int, arg9: ByteArray?, arg10: Int)

        @JvmStatic
		actual external fun glTexImage1Dub(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: Int, arg6: Int, arg7: ByteArray?, arg8: Int)

        @JvmStatic
		actual external fun glBlendFunc(arg0: Int, arg1: Int)

        /*private*/ actual external fun glStencilOp(arg0: Int, arg1: Int, arg2: Int)

        @JvmStatic
		actual external fun glClearDepth(arg0: Float)

        @JvmStatic
		actual external fun glGetUniformLocationARB(arg0: Long, arg1: String?): Int

        @JvmStatic
		actual external fun glNewList(arg0: Int, arg1: Int)

        @JvmStatic
		actual external fun glViewport(arg0: Int, arg1: Int, arg2: Int, arg3: Int)

        @JvmStatic
		actual external fun glTexEnvfv(arg0: Int, arg1: Int, arg2: FloatArray?, arg3: Int)

        @JvmStatic
		actual external fun glPolygonMode(arg0: Int, arg1: Int)

        @JvmStatic
		actual external fun glTexParameteri(arg0: Int, arg1: Int, arg2: Int)

        @JvmStatic
		actual external fun glPushMatrix()

        @JvmStatic
		actual external fun glPixelTransferf(arg0: Int, arg1: Float)

        @JvmStatic
		actual external fun glUniform1fARB(arg0: Int, arg1: Float)

        @JvmStatic
		actual external fun glBlitFramebufferEXT(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: Int, arg6: Int, arg7: Int, arg8: Int, arg9: Int)

        @JvmStatic
		actual external fun glCopyTexSubImage2D(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: Int, arg6: Int, arg7: Int)

        @JvmStatic
		actual external fun glCompileShaderARB(arg0: Long)

        /*private*/ actual external fun glMaterialfv(arg0: Int, arg1: Int, arg2: FloatArray?, arg3: Int)

        @JvmStatic
		actual external fun glDetachObjectARB(arg0: Long, arg1: Long)

        @JvmStatic
		actual external fun glNormalPointer(arg0: Int, arg1: Int, arg2: Long)

        @JvmStatic
		actual external fun glUniform2fARB(arg0: Int, arg1: Float, arg2: Float)

        @JvmStatic
		actual external fun glLightfv(arg0: Int, arg1: Int, arg2: FloatArray?, arg3: Int)

        @JvmStatic
		actual external fun glFogfv(arg0: Int, arg1: FloatArray?, arg2: Int)

        @JvmStatic
		actual external fun glGetFloatv(arg0: Int, arg1: FloatArray?, arg2: Int)

        @JvmStatic
		actual external fun glHint(arg0: Int, arg1: Int)

        @JvmStatic
		actual external fun glBufferDataARBub(arg0: Int, arg1: Int, arg2: ByteArray?, arg3: Int, arg4: Int)

        @JvmStatic
		actual external fun glTexSubImage2Df(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: Int, arg6: Int, arg7: Int, arg8: FloatArray?, arg9: Int)

        @JvmStatic
		actual external fun glClientActiveTexture(arg0: Int)

        @JvmStatic
		actual external fun glLightModelfv(arg0: Int, arg1: FloatArray?, arg2: Int)

        /*private*/ actual external fun glTexParameterf(arg0: Int, arg1: Int, arg2: Float)

        @JvmStatic
		actual external fun glMatrixMode(arg0: Int)

        @JvmStatic
		actual external fun glCopyTexImage2D(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: Int, arg6: Int, arg7: Int)

        @JvmStatic
		actual external fun glTexImage2Di(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: Int, arg6: Int, arg7: Int, arg8: IntArray?, arg9: Int)

        actual external fun glUnmapBufferARB(arg0: Int): Boolean

        @JvmStatic
		actual external fun glColor4ub(arg0: Byte, arg1: Byte, arg2: Byte, arg3: Byte)

        @JvmStatic
		actual external fun glBufferSubDataARBub(arg0: Int, arg1: Int, arg2: Int, arg3: ByteArray?, arg4: Int)

        @JvmStatic
		actual external fun glMultMatrixf(arg0: FloatArray?, arg1: Int)

        @JvmStatic
		actual external fun glFogi(arg0: Int, arg1: Int)

        @JvmStatic
		actual external fun glVertex2i(arg0: Int, arg1: Int)

        @JvmStatic
		actual external fun glDepthFunc(arg0: Int)

        /*private*/ actual external fun glDrawPixelsi(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: IntArray?, arg5: Int)

        /*private*/ actual external fun glDrawPixelsub(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: ByteArray?, arg5: Int)

        @JvmStatic
		actual external fun glVertex3f(arg0: Float, arg1: Float, arg2: Float)

        @JvmStatic
		actual external fun glUniform4fARB(arg0: Int, arg1: Float, arg2: Float, arg3: Float, arg4: Float)

        /*private*/ actual external fun glFrustum(arg0: Double, arg1: Double, arg2: Double, arg3: Double, arg4: Double, arg5: Double)

        @JvmStatic
		actual external fun glTexEnvi(arg0: Int, arg1: Int, arg2: Int)

        @JvmStatic
		actual external fun glCreateProgramObjectARB(): Long

        @JvmStatic
		actual external fun glNormal3f(arg0: Float, arg1: Float, arg2: Float)

        /*private*/ actual external fun glGetTexImageub(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: ByteArray?, arg5: Int)

        @JvmStatic
		actual external fun glGenFramebuffersEXT(arg0: Int, arg1: IntArray?, arg2: Int)

        /*private*/ actual external fun glGetProgramivARB(arg0: Int, arg1: Int, arg2: IntArray?, arg3: Int)

        @JvmStatic
		actual external fun glUniform3fARB(arg0: Int, arg1: Float, arg2: Float, arg3: Float)

        /*private*/ actual external fun glDrawBuffersARB(arg0: Int, arg1: IntArray?, arg2: Int)

        @JvmStatic
		actual external fun glCreateShaderObjectARB(arg0: Int): Long

        actual external fun glMapBufferARB(arg0: Int, arg1: Int): Long

        /*private*/ actual external fun glColor3ub(arg0: Byte, arg1: Byte, arg2: Byte)

        @JvmStatic
		actual external fun glGetIntegerv(arg0: Int, arg1: IntArray?, arg2: Int)

        @JvmStatic
		actual external fun glShadeModel(arg0: Int)

        @JvmStatic
		actual external fun glProgramStringARB(arg0: Int, arg1: Int, arg2: String?)

        @JvmStatic
		actual external fun glGenProgramARB(): Int

        @JvmStatic
		actual external fun glPushAttrib(arg0: Int)

        @JvmStatic
		actual external fun glFlush()

        @JvmStatic
		actual external fun glRenderbufferStorageMultisampleEXT(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int)

        @JvmStatic
		actual external fun glEnable(arg0: Int)

        @JvmStatic
		actual external fun glDisable(arg0: Int)

        @JvmStatic
		actual external fun glGenTextures(arg0: Int, arg1: IntArray?, arg2: Int)

        @JvmStatic
		actual external fun glFramebufferTexture2DEXT(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int)

        @JvmStatic
		actual external fun glBindBufferARB(arg0: Int, arg1: Int)

        @JvmStatic
		actual external fun glMultiTexCoord3i(arg0: Int, arg1: Int, arg2: Int, arg3: Int)

        @JvmStatic
		actual external fun glColorMaterial(arg0: Int, arg1: Int)

        @JvmStatic
		actual external fun glTexSubImage2Dub(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: Int, arg6: Int, arg7: Int, arg8: ByteArray?, arg9: Int)

        @JvmStatic
		actual external fun glShaderSourceARB(arg0: Long, arg1: String?)

        @JvmStatic
		actual external fun glGetTexImagei(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: IntArray?, arg5: Int)

        @JvmStatic
		actual external fun glGetString(arg0: Int): String

        /*private*/ actual external fun glPixelZoom(arg0: Float, arg1: Float)

        @JvmStatic
		actual external fun glDisableClientState(arg0: Int)

        @JvmStatic
		actual external fun glClear(arg0: Int)

        @JvmStatic
		actual external fun glPointSize(arg0: Float)

        @JvmStatic
		actual external fun glCopyPixels(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int)

        @JvmStatic
		actual external fun glTexCoord2f(arg0: Float, arg1: Float)

        @JvmStatic
		actual external fun glBindProgramARB(arg0: Int, arg1: Int)

        @JvmStatic
		actual external fun glGenRenderbuffersEXT(arg0: Int, arg1: IntArray?, arg2: Int)

        @JvmStatic
		actual external fun glPopAttrib()

        @JvmStatic
		actual external fun glVertex2f(arg0: Float, arg1: Float)

        @JvmStatic
		actual external fun glLoadIdentity()

        @JvmStatic
		actual external fun glGenLists(arg0: Int): Int

        @JvmStatic
		actual external fun glColorPointer(arg0: Int, arg1: Int, arg2: Int, arg3: Long)

        @JvmStatic
		actual external fun glPopMatrix()

        @JvmStatic
		actual external fun glEnableClientState(arg0: Int)

        @JvmStatic
		actual external fun glShaderSourceRawARB(arg0: Long, arg1: ByteArray?)

        @JvmStatic
		actual external fun glColor3f(arg0: Float, arg1: Float, arg2: Float)

        @JvmStatic
		actual external fun glTexEnvf(arg0: Int, arg1: Int, arg2: Float)

        @JvmStatic
		actual external fun glProgramLocalParameter4fARB(arg0: Int, arg1: Int, arg2: Float, arg3: Float, arg4: Float, arg5: Float)

        @JvmStatic
		actual external fun glAlphaFunc(arg0: Int, arg1: Float)

        @JvmStatic
		actual external fun glDeleteTextures(arg0: Int, arg1: IntArray?, arg2: Int)

        @JvmStatic
		actual external fun glDrawBuffer(arg0: Int)

        @JvmStatic
		actual external fun glBegin(arg0: Int)

        @JvmStatic
		actual external fun glFogf(arg0: Int, arg1: Float)

        @JvmStatic
		actual external fun glAttachObjectARB(arg0: Long, arg1: Long)

        @JvmStatic
		actual external fun glCheckFramebufferStatusEXT(arg0: Int): Int

        @JvmStatic
		actual external fun glTexImage2Dub(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: Int, arg6: Int, arg7: Int, arg8: ByteArray?, arg9: Int)

        /*private*/ actual external fun glUniformMatrix4fvARB(arg0: Int, arg1: Int, arg2: Boolean, arg3: FloatArray?, arg4: Int)

        @JvmStatic
		actual external fun glProgramRawARB(arg0: Int, arg1: Int, arg2: ByteArray?)
    }
}
