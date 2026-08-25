package jaggl

import awt.Canvas
import util.Hashtable
import lang.Thread

actual class OpenGL {
    actual fun a(): Boolean {
        TODO("Not yet implemented")
    }

    actual fun a(arg0: String?): Boolean {
        TODO("Not yet implemented")
    }

    actual var a: Thread?
        get() = TODO("Not yet implemented")
        set(value) {}
    actual var c: Hashtable<Any?, Any?>?
        get() = TODO("Not yet implemented")
        set(value) {}
    actual val peer: Long
        get() = TODO("Not yet implemented")

    actual fun detachPeer() {
    }

    actual fun setSwapInterval(arg0: Int) {
    }

    actual fun surfaceResized(arg0: Long) {
    }

    actual fun setPbuffer(arg0: Long) {
    }

    actual fun arePbuffersAvailable(): Boolean {
        TODO("Not yet implemented")
    }

    actual fun releasePbuffer(arg0: Long) {
    }

    actual fun attachPeer(): Boolean {
        TODO("Not yet implemented")
    }

    actual fun releaseSurface(arg0: Canvas?, arg1: Long) {
    }

    actual fun init(arg0: Canvas?, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: Int, arg6: Int): Long {
        TODO("Not yet implemented")
    }

    actual fun b(): Boolean {
        TODO("Not yet implemented")
    }

    actual fun createPbuffer(arg0: Int, arg1: Int): Long {
        TODO("Not yet implemented")
    }

    actual fun swapBuffers() {
    }

    actual fun release() {
    }

    actual fun prepareSurface(arg0: Canvas?): Long {
        TODO("Not yet implemented")
    }

    actual fun setSurface(arg0: Long): Boolean {
        TODO("Not yet implemented")
    }

    actual companion object {
        actual val b: Hashtable<Any?, Any?>
            get() = TODO("Not yet implemented")

        actual fun glTranslatef(arg0: Float, arg1: Float, arg2: Float) {
        }

        actual fun glBindRenderbufferEXT(arg0: Int, arg1: Int) {
        }

        actual fun glScalef(arg0: Float, arg1: Float, arg2: Float) {
        }

        actual fun glActiveTexture(arg0: Int) {
        }

        actual fun glProgramLocalParameter4fvARB(arg0: Int, arg1: Int, arg2: FloatArray?, arg3: Int) {
        }

        actual fun glGetObjectParameterivARB(arg0: Long, arg1: Int, arg2: IntArray?, arg3: Int) {
        }

        actual fun glFramebufferTexture3DEXT(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: Int) {
        }

        actual fun glDeleteLists(arg0: Int, arg1: Int) {
        }

        actual fun glUniform1iARB(arg0: Int, arg1: Int) {
        }

        actual fun glFinish() {
        }

        actual fun glDrawElements(arg0: Int, arg1: Int, arg2: Int, arg3: Long) {
        }

        actual fun glReadBuffer(arg0: Int) {
        }

        actual fun glGetError(): Int {
            TODO("Not yet implemented")
        }

        actual fun glUseProgramObjectARB(arg0: Long) {
        }

        actual fun glColor4f(arg0: Float, arg1: Float, arg2: Float, arg3: Float) {
        }

        actual fun glTexGeni(arg0: Int, arg1: Int, arg2: Int) {
        }

        actual fun glDeleteFramebuffersEXT(arg0: Int, arg1: IntArray?, arg2: Int) {
        }

        actual fun glColorMask(arg0: Boolean, arg1: Boolean, arg2: Boolean, arg3: Boolean) {
        }

        actual fun glCullFace(arg0: Int) {
        }

        actual fun glLoadMatrixf(arg0: FloatArray?, arg1: Int) {
        }

        actual fun glRasterPos2i(arg0: Int, arg1: Int) {
        }

        actual fun glBufferDataARBa(arg0: Int, arg1: Int, arg2: Long, arg3: Int) {
        }

        actual fun glStencilFunc(arg0: Int, arg1: Int, arg2: Int) {
        }

        actual fun glClearColor(arg0: Float, arg1: Float, arg2: Float, arg3: Float) {
        }

        actual fun glRenderbufferStorageEXT(arg0: Int, arg1: Int, arg2: Int, arg3: Int) {
        }

        actual fun glDeleteBuffersARB(arg0: Int, arg1: IntArray?, arg2: Int) {
        }

        actual fun glCopyTexSubImage3D(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: Int, arg6: Int, arg7: Int, arg8: Int) {
        }

        actual fun glTexImage2Df(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: Int, arg6: Int, arg7: Int, arg8: FloatArray?, arg9: Int) {
        }

        actual fun glReadPixelsi(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: Int, arg6: IntArray?, arg7: Int) {
        }

        actual fun glTexCoordPointer(arg0: Int, arg1: Int, arg2: Int, arg3: Long) {
        }

        actual fun glBindTexture(arg0: Int, arg1: Int) {
        }

        actual fun glLinkProgramARB(arg0: Long) {
        }

        actual fun glOrtho(arg0: Double, arg1: Double, arg2: Double, arg3: Double, arg4: Double, arg5: Double) {
        }

        actual fun glUniformMatrix3fvARB(arg0: Int, arg1: Int, arg2: Boolean, arg3: FloatArray?, arg4: Int) {
        }

        actual fun glUniformMatrix2fvARB(arg0: Int, arg1: Int, arg2: Boolean, arg3: FloatArray?, arg4: Int) {
        }

        actual fun glBufferSubDataARBa(arg0: Int, arg1: Int, arg2: Int, arg3: Long) {
        }

        actual fun glDeleteRenderbuffersEXT(arg0: Int, arg1: IntArray?, arg2: Int) {
        }

        actual fun glPixelStorei(arg0: Int, arg1: Int) {
        }

        actual fun glScissor(arg0: Int, arg1: Int, arg2: Int, arg3: Int) {
        }

        actual fun glTexCoord2i(arg0: Int, arg1: Int) {
        }

        actual fun glLineWidth(arg0: Float) {
        }

        actual fun glGenerateMipmapEXT(arg0: Int) {
        }

        actual fun glDeleteObjectARB(arg0: Long) {
        }

        actual fun glMultiTexCoord2i(arg0: Int, arg1: Int, arg2: Int) {
        }

        actual fun glRotatef(arg0: Float, arg1: Float, arg2: Float, arg3: Float) {
        }

        actual fun glMultiTexCoord2f(arg0: Int, arg1: Float, arg2: Float) {
        }

        actual fun glFramebufferRenderbufferEXT(arg0: Int, arg1: Int, arg2: Int, arg3: Int) {
        }

        actual fun glTexSubImage2Di(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: Int, arg6: Int, arg7: Int, arg8: IntArray?, arg9: Int) {
        }

        actual fun glLightf(arg0: Int, arg1: Int, arg2: Float) {
        }

        actual fun glTexGenfv(arg0: Int, arg1: Int, arg2: FloatArray?, arg3: Int) {
        }

        actual fun glTexCoord3i(arg0: Int, arg1: Int, arg2: Int) {
        }

        actual fun glDrawArrays(arg0: Int, arg1: Int, arg2: Int) {
        }

        actual fun glCallList(arg0: Int) {
        }

        actual fun glDeleteProgramARB(arg0: Int) {
        }

        actual fun glBindFramebufferEXT(arg0: Int, arg1: Int) {
        }

        actual fun glTexCoord3f(arg0: Float, arg1: Float, arg2: Float) {
        }

        actual fun glGenBuffersARB(arg0: Int, arg1: IntArray?, arg2: Int) {
        }

        actual fun glVertexPointer(arg0: Int, arg1: Int, arg2: Int, arg3: Long) {
        }

        actual fun glGetInfoLogARB(arg0: Long, arg1: Int, arg2: IntArray?, arg3: Int, arg4: ByteArray?, arg5: Int) {
        }

        actual fun glReadPixelsub(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: Int, arg6: ByteArray?, arg7: Int) {
        }

        actual fun glDepthMask(arg0: Boolean) {
        }

        actual fun glEnd() {
        }

        actual fun glEndList() {
        }

        actual fun glTexImage3Dub(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: Int, arg6: Int, arg7: Int, arg8: Int, arg9: ByteArray?, arg10: Int) {
        }

        actual fun glTexImage1Dub(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: Int, arg6: Int, arg7: ByteArray?, arg8: Int) {
        }

        actual fun glBlendFunc(arg0: Int, arg1: Int) {
        }

        actual fun glStencilOp(arg0: Int, arg1: Int, arg2: Int) {
        }

        actual fun glClearDepth(arg0: Float) {
        }

        actual fun glGetUniformLocationARB(arg0: Long, arg1: String?): Int {
            TODO("Not yet implemented")
        }

        actual fun glNewList(arg0: Int, arg1: Int) {
        }

        actual fun glViewport(arg0: Int, arg1: Int, arg2: Int, arg3: Int) {
        }

        actual fun glTexEnvfv(arg0: Int, arg1: Int, arg2: FloatArray?, arg3: Int) {
        }

        actual fun glPolygonMode(arg0: Int, arg1: Int) {
        }

        actual fun glTexParameteri(arg0: Int, arg1: Int, arg2: Int) {
        }

        actual fun glPushMatrix() {
        }

        actual fun glPixelTransferf(arg0: Int, arg1: Float) {
        }

        actual fun glUniform1fARB(arg0: Int, arg1: Float) {
        }

        actual fun glBlitFramebufferEXT(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: Int, arg6: Int, arg7: Int, arg8: Int, arg9: Int) {
        }

        actual fun glCopyTexSubImage2D(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: Int, arg6: Int, arg7: Int) {
        }

        actual fun glCompileShaderARB(arg0: Long) {
        }

        actual fun glMaterialfv(arg0: Int, arg1: Int, arg2: FloatArray?, arg3: Int) {
        }

        actual fun glDetachObjectARB(arg0: Long, arg1: Long) {
        }

        actual fun glNormalPointer(arg0: Int, arg1: Int, arg2: Long) {
        }

        actual fun glUniform2fARB(arg0: Int, arg1: Float, arg2: Float) {
        }

        actual fun glLightfv(arg0: Int, arg1: Int, arg2: FloatArray?, arg3: Int) {
        }

        actual fun glFogfv(arg0: Int, arg1: FloatArray?, arg2: Int) {
        }

        actual fun glGetFloatv(arg0: Int, arg1: FloatArray?, arg2: Int) {
        }

        actual fun glHint(arg0: Int, arg1: Int) {
        }

        actual fun glBufferDataARBub(arg0: Int, arg1: Int, arg2: ByteArray?, arg3: Int, arg4: Int) {
        }

        actual fun glTexSubImage2Df(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: Int, arg6: Int, arg7: Int, arg8: FloatArray?, arg9: Int) {
        }

        actual fun glClientActiveTexture(arg0: Int) {
        }

        actual fun glLightModelfv(arg0: Int, arg1: FloatArray?, arg2: Int) {
        }

        actual fun glTexParameterf(arg0: Int, arg1: Int, arg2: Float) {
        }

        actual fun glMatrixMode(arg0: Int) {
        }

        actual fun glCopyTexImage2D(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: Int, arg6: Int, arg7: Int) {
        }

        actual fun glTexImage2Di(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: Int, arg6: Int, arg7: Int, arg8: IntArray?, arg9: Int) {
        }

        actual fun glUnmapBufferARB(arg0: Int): Boolean {
            TODO("Not yet implemented")
        }

        actual fun glColor4ub(arg0: Byte, arg1: Byte, arg2: Byte, arg3: Byte) {
        }

        actual fun glBufferSubDataARBub(arg0: Int, arg1: Int, arg2: Int, arg3: ByteArray?, arg4: Int) {
        }

        actual fun glMultMatrixf(arg0: FloatArray?, arg1: Int) {
        }

        actual fun glFogi(arg0: Int, arg1: Int) {
        }

        actual fun glVertex2i(arg0: Int, arg1: Int) {
        }

        actual fun glDepthFunc(arg0: Int) {
        }

        actual fun glDrawPixelsi(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: IntArray?, arg5: Int) {
        }

        actual fun glDrawPixelsub(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: ByteArray?, arg5: Int) {
        }

        actual fun glVertex3f(arg0: Float, arg1: Float, arg2: Float) {
        }

        actual fun glUniform4fARB(arg0: Int, arg1: Float, arg2: Float, arg3: Float, arg4: Float) {
        }

        actual fun glFrustum(arg0: Double, arg1: Double, arg2: Double, arg3: Double, arg4: Double, arg5: Double) {
        }

        actual fun glTexEnvi(arg0: Int, arg1: Int, arg2: Int) {
        }

        actual fun glCreateProgramObjectARB(): Long {
            TODO("Not yet implemented")
        }

        actual fun glNormal3f(arg0: Float, arg1: Float, arg2: Float) {
        }

        actual fun glGetTexImageub(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: ByteArray?, arg5: Int) {
        }

        actual fun glGenFramebuffersEXT(arg0: Int, arg1: IntArray?, arg2: Int) {
        }

        actual fun glGetProgramivARB(arg0: Int, arg1: Int, arg2: IntArray?, arg3: Int) {
        }

        actual fun glUniform3fARB(arg0: Int, arg1: Float, arg2: Float, arg3: Float) {
        }

        actual fun glDrawBuffersARB(arg0: Int, arg1: IntArray?, arg2: Int) {
        }

        actual fun glCreateShaderObjectARB(arg0: Int): Long {
            TODO("Not yet implemented")
        }

        actual fun glMapBufferARB(arg0: Int, arg1: Int): Long {
            TODO("Not yet implemented")
        }

        actual fun glColor3ub(arg0: Byte, arg1: Byte, arg2: Byte) {
        }

        actual fun glGetIntegerv(arg0: Int, arg1: IntArray?, arg2: Int) {
        }

        actual fun glShadeModel(arg0: Int) {
        }

        actual fun glProgramStringARB(arg0: Int, arg1: Int, arg2: String?) {
        }

        actual fun glGenProgramARB(): Int {
            TODO("Not yet implemented")
        }

        actual fun glPushAttrib(arg0: Int) {
        }

        actual fun glFlush() {
        }

        actual fun glRenderbufferStorageMultisampleEXT(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int) {
        }

        actual fun glEnable(arg0: Int) {
        }

        actual fun glDisable(arg0: Int) {
        }

        actual fun glGenTextures(arg0: Int, arg1: IntArray?, arg2: Int) {
        }

        actual fun glFramebufferTexture2DEXT(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int) {
        }

        actual fun glBindBufferARB(arg0: Int, arg1: Int) {
        }

        actual fun glMultiTexCoord3i(arg0: Int, arg1: Int, arg2: Int, arg3: Int) {
        }

        actual fun glColorMaterial(arg0: Int, arg1: Int) {
        }

        actual fun glTexSubImage2Dub(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: Int, arg6: Int, arg7: Int, arg8: ByteArray?, arg9: Int) {
        }

        actual fun glShaderSourceARB(arg0: Long, arg1: String?) {
        }

        actual fun glGetTexImagei(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: IntArray?, arg5: Int) {
        }

        actual fun glGetString(arg0: Int): String {
            TODO("Not yet implemented")
        }

        actual fun glPixelZoom(arg0: Float, arg1: Float) {
        }

        actual fun glDisableClientState(arg0: Int) {
        }

        actual fun glClear(arg0: Int) {
        }

        actual fun glPointSize(arg0: Float) {
        }

        actual fun glCopyPixels(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int) {
        }

        actual fun glTexCoord2f(arg0: Float, arg1: Float) {
        }

        actual fun glBindProgramARB(arg0: Int, arg1: Int) {
        }

        actual fun glGenRenderbuffersEXT(arg0: Int, arg1: IntArray?, arg2: Int) {
        }

        actual fun glPopAttrib() {
        }

        actual fun glVertex2f(arg0: Float, arg1: Float) {
        }

        actual fun glLoadIdentity() {
        }

        actual fun glGenLists(arg0: Int): Int {
            TODO("Not yet implemented")
        }

        actual fun glColorPointer(arg0: Int, arg1: Int, arg2: Int, arg3: Long) {
        }

        actual fun glPopMatrix() {
        }

        actual fun glEnableClientState(arg0: Int) {
        }

        actual fun glShaderSourceRawARB(arg0: Long, arg1: ByteArray?) {
        }

        actual fun glColor3f(arg0: Float, arg1: Float, arg2: Float) {
        }

        actual fun glTexEnvf(arg0: Int, arg1: Int, arg2: Float) {
        }

        actual fun glProgramLocalParameter4fARB(arg0: Int, arg1: Int, arg2: Float, arg3: Float, arg4: Float, arg5: Float) {
        }

        actual fun glAlphaFunc(arg0: Int, arg1: Float) {
        }

        actual fun glDeleteTextures(arg0: Int, arg1: IntArray?, arg2: Int) {
        }

        actual fun glDrawBuffer(arg0: Int) {
        }

        actual fun glBegin(arg0: Int) {
        }

        actual fun glFogf(arg0: Int, arg1: Float) {
        }

        actual fun glAttachObjectARB(arg0: Long, arg1: Long) {
        }

        actual fun glCheckFramebufferStatusEXT(arg0: Int): Int {
            TODO("Not yet implemented")
        }

        actual fun glTexImage2Dub(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: Int, arg6: Int, arg7: Int, arg8: ByteArray?, arg9: Int) {
        }

        actual fun glUniformMatrix4fvARB(arg0: Int, arg1: Int, arg2: Boolean, arg3: FloatArray?, arg4: Int) {
        }

        actual fun glProgramRawARB(arg0: Int, arg1: Int, arg2: ByteArray?) {
        }
    }
}