package jaggl;


import voidawt.Canvas;
import java.util.Hashtable;

public final class OpenGL {

    public static final int GL_POINTS = 0x0;

    public static final int GL_LINES = 0x1;

    public static final int GL_ONE = 0x1;

    public static final int GL_LINE_LOOP = 0x2;

    public static final int GL_TRIANGLES = 0x4;

    public static final int GL_TRIANGLE_FAN = 0x6;

    public static final int GL_QUADS = 0x7;

    public static final int GL_DEPTH_BUFFER_BIT = 0x100;

    public static final int GL_LEQUAL = 0x203;

    public static final int GL_GREATER = 0x204;

    public static final int GL_SRC_COLOR = 0x300;

    public static final int GL_ONE_MINUS_SRC_COLOR = 0x301;

    public static final int GL_SRC_ALPHA = 0x302;

    public static final int GL_ONE_MINUS_SRC_ALPHA = 0x303;

    public static final int GL_DST_COLOR = 0x306;

    public static final int GL_FRONT = 0x404;

    public static final int GL_BACK = 0x405;

    public static final int GL_VIEWPORT_BIT = 0x800;

    public static final int GL_POINT_SMOOTH = 0xB10;

    public static final int GL_POINT_SIZE_RANGE = 0xB12;

    public static final int GL_CULL_FACE = 0xB44;

    public static final int GL_LIGHTING = 0xB50;

    public static final int GL_LIGHT_MODEL_AMBIENT = 0xB53;

    public static final int GL_COLOR_MATERIAL = 0xB57;

    public static final int GL_FOG = 0xB60;

    public static final int GL_FOG_DENSITY = 0xB62;

    public static final int GL_FOG_START = 0xB63;

    public static final int GL_FOG_END = 0xB64;

    public static final int GL_FOG_MODE = 0xB65;

    public static final int GL_FOG_COLOR = 0xB66;

    public static final int GL_DEPTH_TEST = 0xB71;

    public static final int GL_MODELVIEW_MATRIX = 0xBA6;

    public static final int GL_ALPHA_TEST = 0xBC0;

    public static final int GL_BLEND = 0xBE2;

    public static final int GL_SCISSOR_TEST = 0xC11;

    public static final int GL_FOG_HINT = 0xC54;

    public static final int GL_TEXTURE_GEN_S = 0xC60;

    public static final int GL_TEXTURE_GEN_T = 0xC61;

    public static final int GL_TEXTURE_GEN_R = 0xC62;

    public static final int GL_TEXTURE_GEN_Q = 0xC63;

    public static final int GL_UNPACK_ROW_LENGTH = 0xCF2;

    public static final int GL_UNPACK_ALIGNMENT = 0xCF5;

    public static final int GL_RED_SCALE = 0xD14;

    public static final int GL_RED_BIAS = 0xD15;

    public static final int GL_GREEN_SCALE = 0xD18;

    public static final int GL_GREEN_BIAS = 0xD19;

    public static final int GL_BLUE_SCALE = 0xD1A;

    public static final int GL_BLUE_BIAS = 0xD1B;

    public static final int GL_TEXTURE_2D = 0xDE1;

    public static final int GL_FASTEST = 0x1101;

    public static final int GL_AMBIENT = 0x1200;

    public static final int GL_DIFFUSE = 0x1201;

    public static final int GL_POSITION = 0x1203;

    public static final int GL_CONSTANT_ATTENUATION = 0x1207;

    public static final int GL_LINEAR_ATTENUATION = 0x1208;

    public static final int GL_QUADRATIC_ATTENUATION = 0x1209;

    public static final int GL_COMPILE = 0x1300;

    public static final int GL_UNSIGNED_BYTE = 0x1401;

    public static final int GL_FLOAT = 0x1406;

    public static final int GL_AMBIENT_AND_DIFFUSE = 0x1602;

    public static final int GL_MODELVIEW = 0x1700;

    public static final int GL_PROJECTION = 0x1701;

    public static final int GL_TEXTURE = 0x1702;

    public static final int GL_COLOR = 0x1800;

    public static final int GL_ALPHA = 0x1906;

    public static final int GL_RGBA = 0x1908;

    public static final int GL_FILL = 0x1B02;

    public static final int GL_SMOOTH = 0x1D01;

    public static final int GL_VENDOR = 0x1F00;

    public static final int GL_RENDERER = 0x1F01;

    public static final int GL_VERSION = 0x1F02;

    public static final int GL_S = 0x2000;

    public static final int GL_T = 0x2001;

    public static final int GL_R = 0x2002;

    public static final int GL_Q = 0x2003;

    public static final int GL_MODULATE = 0x2100;

    public static final int GL_TEXTURE_ENV_MODE = 0x2200;

    public static final int GL_TEXTURE_ENV_COLOR = 0x2201;

    public static final int GL_TEXTURE_ENV = 0x2300;

    public static final int GL_EYE_LINEAR = 0x2400;

    public static final int GL_OBJECT_LINEAR = 0x2401;

    public static final int GL_TEXTURE_GEN_MODE = 0x2500;

    public static final int GL_OBJECT_PLANE = 0x2501;

    public static final int GL_EYE_PLANE = 0x2502;

    public static final int GL_NEAREST = 0x2600;

    public static final int GL_LINEAR = 0x2601;

    public static final int GL_NEAREST_MIPMAP_NEAREST = 0x2700;

    public static final int GL_LINEAR_MIPMAP_LINEAR = 0x2703;

    public static final int GL_TEXTURE_MAG_FILTER = 0x2800;

    public static final int GL_TEXTURE_MIN_FILTER = 0x2801;

    public static final int GL_TEXTURE_WRAP_S = 0x2802;

    public static final int GL_TEXTURE_WRAP_T = 0x2803;

    public static final int GL_REPEAT = 0x2901;

    public static final int GL_LIGHT0 = 0x4000;

    public static final int GL_COLOR_BUFFER_BIT = 0x4000;

    public static final int GL_LIGHT1 = 0x4001;

    public static final int GL_LIGHT2 = 0x4002;

    public static final int GL_VERTEX_ARRAY = 0x8074;

    public static final int GL_NORMAL_ARRAY = 0x8075;

    public static final int GL_COLOR_ARRAY = 0x8076;

    public static final int GL_TEXTURE_COORD_ARRAY = 0x8078;

    public static final int GL_MULTISAMPLE = 0x809D;

    public static final int GL_BGRA = 0x80E1;

    public static final int GL_CLAMP_TO_EDGE = 0x812F;

    public static final int GL_TEXTURE0 = 0x84C0;

    public static final int GL_TEXTURE1 = 0x84C1;

    public static final int GL_MAX_TEXTURE_UNITS = 0x84E2;

    public static final int GL_NORMAL_MAP = 0x8511;

    public static final int GL_REFLECTION_MAP = 0x8512;

    public static final int GL_TEXTURE_CUBE_MAP_POSITIVE_X = 0x8515;

    public static final int GL_COMBINE = 0x8570;

    public static final int GL_COMBINE_RGB = 0x8571;

    public static final int GL_COMBINE_ALPHA = 0x8572;

    public static final int GL_RGB_SCALE = 0x8573;

    public static final int GL_CONSTANT = 0x8576;

    public static final int GL_PREVIOUS = 0x8578;

    public static final int GL_SRC0_RGB = 0x8580;

    public static final int GL_SRC2_RGB = 0x8582;

    public static final int GL_SRC0_ALPHA = 0x8588;

    public static final int GL_SRC2_ALPHA = 0x858A;

    public static final int GL_OPERAND0_RGB = 0x8590;

    public static final int GL_OPERAND0_ALPHA = 0x8598;

    public static final int GL_VERTEX_PROGRAM_ARB = 0x8620;

    public static final int GL_PROGRAM_ERROR_POSITION_ARB = 0x864B;

    public static final int GL_FRAGMENT_PROGRAM_ARB = 0x8804;

    public static final int GL_RGBA16F = 0x881A;

    public static final int GL_MAX_TEXTURE_COORDS = 0x8871;

    public static final int GL_MAX_TEXTURE_IMAGE_UNITS = 0x8872;

    public static final int GL_PROGRAM_FORMAT_ASCII_ARB = 0x8875;

    public static final int GL_ARRAY_BUFFER = 0x8892;

    public static final int GL_ELEMENT_ARRAY_BUFFER = 0x8893;

    public static final int GL_COMPILE_STATUS = 0x8B81;

    public static final int GL_LINK_STATUS = 0x8B82;

    public static final int GL_INFO_LOG_LENGTH = 0x8B84;

    public static final int GL_READ_FRAMEBUFFER = 0x8CA8;

    public static final int GL_DRAW_FRAMEBUFFER = 0x8CA9;

    public static final int GL_FRAMEBUFFER_COMPLETE = 0x8CD5;

    public static final int GL_FRAMEBUFFER = 0x8D40;

    public static final int GL_RENDERBUFFER = 0x8D41;

    public static final Hashtable a = new Hashtable();

    public long peer;

    public Hashtable c;

    public Thread b;

    public static void glPixelZoom(float xfactor, float yfactor) {}

    public static void glUniform1iARB(int location, int v0) {}

    public static void glColor3f(float red, float green, float blue) {}

    public static void glBufferDataARBa(int arg0, int arg1, long arg2, int arg3) {}

    public static void glMultiTexCoord2i(int target, int s, int t) {}

    public static void glTexCoord3f(float s, float t, float r) {}

    public static void glReadPixelsi(int x, int y, int width, int height, int format, int type, int[] pixels, int pixelsOffset) {}

    public static void glRasterPos2i(int x, int y) {}

    public static void glNormal3f(float nx, float ny, float nz) {}

    public static void glGetTexImageub(int target, int level, int format, int type, byte[] pixels, int pixelsOffset) {}

    public static long glCreateProgramObjectARB() { return 0L; }

    public static void glVertexPointer(int size, int type, int stride, long pointer) {}

    public static void glShaderSourceARB(long shaderObj, String string) {}

    public static void glProgramStringARB(int target, int format, String string) {}

    public static void glGetProgramivARB(int target, int pname, int[] params, int paramsOffset) {}

    public static void glGenFramebuffersEXT(int n, int[] framebuffers, int framebuffersOffset) {}

    public static void glTexParameteri(int target, int pname, int param) {}

    public static void glDeleteBuffersARB(int n, int[] buffers, int buffersOffset) {}

    public static void glDisable(int cap) {}

    public static void glTexSubImage2Di(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, int[] pixels, int pixelsOffset) {}

    public static void glGenBuffersARB(int n, int[] buffers, int buffersOffset) {}

    public static void glTexImage2Dub(int target, int level, int internalformat, int width, int height, int border, int format, int type, byte[] pixels, int pixelsOffset) {}

    public static void glGetInfoLogARB(long obj, int maxLength, int[] length, int lengthOffset, byte[] infoLog, int infoLogOffset) {}

    public static void glColor4ub(byte red, byte green, byte blue, byte alpha) {}

    public static void glUniform1fARB(int location, float v0) {}

    public static void glVertex3f(float x, float y, float z) {}

    public static void glTexCoord2f(float s, float t) {}

    public static void glDeleteObjectARB(long obj) {}

    public static void glDetachObjectARB(long containerObj, long attachedObj) {}

    public static void glColor4f(float red, float green, float blue, float alpha) {}

    public static void glTexImage3Dub(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, byte[] pixels, int pixelsOffset) {}

    public static long glMapBufferARB(int target, int access) { return 0L; }

    public static void glEnable(int cap) {}

    public static void glLinkProgramARB(long programObj) {}

    public static void glFramebufferRenderbufferEXT(int target, int attachment, int renderbuffertarget, int renderbuffer) {}

    public static void glColorMask(boolean red, boolean green, boolean blue, boolean alpha) {}

    public static void glDrawPixelsub(int width, int height, int format, int type, byte[] pixels, int pixelsOffset) {}

    public static void glTexImage2Di(int target, int level, int internalformat, int width, int height, int border, int format, int type, int[] pixels, int pixelsOffset) {}

    public static void glGenRenderbuffersEXT(int n, int[] renderbuffers, int renderbuffersOffset) {}

    public static int glGenLists(int range) { return 0; }

    public static void glTexParameterf(int target, int pname, float param) {}

    public static void glNewList(int list, int mode) {}

    public static void glGetObjectParameterivARB(long obj, int pname, int[] params, int paramsOffset) {}

    public static void glUseProgramObjectARB(long programObj) {}

    public static void glEnd() {}

    public static void glDrawBuffer(int buf) {}

    public static long glCreateShaderObjectARB(int shaderType) { return 0L; }

    public static void glGetIntegerv(int pname, int[] data, int dataOffset) {}

    public static void glColorMaterial(int face, int mode) {}

    public static void glGetTexImagei(int target, int level, int format, int type, int[] pixels, int pixelsOffset) {}

    public static void glUniformMatrix4fvARB(int location, int count, boolean transpose, float[] value, int valueOffset) {}

    public static void glDepthFunc(int func) {}

    public static void glDeleteTextures(int n, int[] textures, int texturesOffset) {}

    public static void glColorPointer(int size, int type, int stride, long pointer) {}

    public static void glFlush() {}

    public static void glTexCoord2i(int s, int t) {}

    public static void glProgramLocalParameter4fARB(int target, int index, float x, float y, float z, float w) {}

    public static void glDrawArrays(int mode, int first, int count) {}

    public static void glBlitFramebufferEXT(int srcX0, int srcY0, int srcX1, int srcY1, int dstX0, int dstY0, int dstX1, int dstY1, int mask, int filter) {}

    public static void glDrawPixelsi(int width, int height, int format, int type, int[] pixels, int pixelsOffset) {}

    public static void glTexImage1Dub(int target, int level, int internalformat, int width, int border, int format, int type, byte[] pixels, int pixelsOffset) {}

    public static void glAttachObjectARB(long containerObj, long obj) {}

    public static void glMultMatrixf(float[] m, int mOffset) {}

    public static int glGetError() { return 0; }

    public static void glFramebufferTexture3DEXT(int target, int attachment, int textarget, int texture, int level, int zoffset) {}

    public static void glRotatef(float angle, float x, float y, float z) {}

    public static void glPushAttrib(int mask) {}

    public static void glGenerateMipmapEXT(int target) {}

    public static void glViewport(int x, int y, int width, int height) {}

    public static void glGenTextures(int n, int[] textures, int texturesOffset) {}

    public static void glBindFramebufferEXT(int target, int framebuffer) {}

    public static void glPopAttrib() {}

    public static void glDeleteProgramARB(int arg0) {}

    public static void glClientActiveTexture(int texture) {}

    public static void glLightModelfv(int pname, float[] params, int paramsOffset) {}

    public static void glBindRenderbufferEXT(int target, int renderbuffer) {}

    public static void glDepthMask(boolean flag) {}

    public static void glTexSubImage2Dub(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, byte[] pixels, int pixelsOffset) {}

    public static void glMatrixMode(int mode) {}

    public static void glBufferDataARBub(int arg0, int arg1, byte[] arg2, int arg3, int arg4) {}

    public static void glBindBufferARB(int target, int buffer) {}

    public static void glMaterialfv(int face, int pname, float[] params, int paramsOffset) {}

    public static void glLoadIdentity() {}

    public static void glPixelStorei(int pname, int param) {}

    public static void glMultiTexCoord2f(int target, float s, float t) {}

    public static void glGetFloatv(int pname, float[] data, int dataOffset) {}

    public static void glPolygonMode(int face, int mode) {}

    public static void glPointSize(float size) {}

    public static void glRenderbufferStorageEXT(int target, int internalformat, int width, int height) {}

    public static void glFinish() {}

    public static void glScalef(float x, float y, float z) {}

    public static void glCullFace(int mode) {}

    public static void glShaderSourceRawARB(long arg0, byte[] arg1) {}

    public static void glTexEnvfv(int target, int pname, float[] params, int paramsOffset) {}

    public static void glPixelTransferf(int pname, float param) {}

    public static void glMultiTexCoord3i(int target, int s, int t, int r) {}

    public static void glCallList(int list) {}

    public static void glUniformMatrix3fvARB(int location, int count, boolean transpose, float[] value, int valueOffset) {}

    public static void glBindProgramARB(int target, int program) {}

    public static void glTexEnvi(int target, int pname, int param) {}

    public static void glEndList() {}

    public static void glCompileShaderARB(long shaderObj) {}

    public static void glCopyPixels(int x, int y, int width, int height, int type) {}

    public static void glTexImage2Df(int target, int level, int internalformat, int width, int height, int border, int format, int type, float[] pixels, int pixelsOffset) {}

    public static boolean glUnmapBufferARB(int target) { return false; }

    public static void glClearDepth(float depth) {}

    public static void glVertex2i(int x, int y) {}

    public static void glClearColor(float red, float green, float blue, float alpha) {}

    public static void glPushMatrix() {}

    public static void glActiveTexture(int texture) {}

    public static void glTexSubImage2Df(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, float[] pixels, int pixelsOffset) {}

    public static void glScissor(int x, int y, int width, int height) {}

    public static void glColor3ub(byte red, byte green, byte blue) {}

    public static void glClear(int mask) {}

    public static void glDeleteLists(int list, int range) {}

    public static int glGenProgramARB() { return 0; }

    public static void glFogfv(int pname, float[] params, int paramsOffset) {}

    public static void glProgramRawARB(int arg0, int arg1, byte[] arg2) {}

    public static void glTexGenfv(int coord, int pname, float[] params, int paramsOffset) {}

    public static void glFramebufferTexture2DEXT(int target, int attachment, int textarget, int texture, int level) {}

    public static void glUniform4fARB(int location, float v0, float v1, float v2, float v3) {}

    public static void glLightfv(int light, int pname, float[] params, int paramsOffset) {}

    public static void glTexGeni(int coord, int pname, int param) {}

    public static void glDrawBuffersARB(int n, int[] bufs, int bufsOffset) {}

    public static void glLineWidth(float width) {}

    public static String glGetString(int name) { return null; }

    public static void glTexCoordPointer(int size, int type, int stride, long pointer) {}

    public static void glShadeModel(int mode) {}

    public static void glLoadMatrixf(float[] m, int mOffset) {}

    public static void glBlendFunc(int sfactor, int dfactor) {}

    public static int glGetUniformLocationARB(long programObj, String name) { return 0; }

    public static int glCheckFramebufferStatusEXT(int target) { return 0; }

    public static void glUniform3fARB(int location, float v0, float v1, float v2) {}

    public static void glDrawElements(int mode, int count, int type, long indices) {}

    public static void glFogf(int pname, float param) {}

    public static void glTexEnvf(int target, int pname, float param) {}

    public static void glRenderbufferStorageMultisampleEXT(int target, int samples, int internalformat, int width, int height) {}

    public static void glCopyTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int x, int y, int width, int height) {}

    public static void glFrustum(double left, double right, double bottom, double top, double zNear, double zFar) {}

    public static void glUniform2fARB(int location, float v0, float v1) {}

    public static void glDeleteFramebuffersEXT(int n, int[] framebuffers, int framebuffersOffset) {}

    public static void glUniformMatrix2fvARB(int location, int count, boolean transpose, float[] value, int valueOffset) {}

    public static void glCopyTexSubImage2D(int target, int level, int xoffset, int yoffset, int x, int y, int width, int height) {}

    public static void glCopyTexImage2D(int target, int level, int internalformat, int x, int y, int width, int height, int border) {}

    public static void glOrtho(double left, double right, double bottom, double top, double zNear, double zFar) {}

    public static void glBufferSubDataARBub(int arg0, int arg1, int arg2, byte[] arg3, int arg4) {}

    public static void glTexCoord3i(int s, int t, int r) {}

    public static void glTranslatef(float x, float y, float z) {}

    public static void glPopMatrix() {}

    public static void glStencilFunc(int func, int ref, int mask) {}

    public static void glBegin(int mode) {}

    public static void glBindTexture(int target, int texture) {}

    public static void glReadBuffer(int src) {}

    public static void glReadPixelsub(int x, int y, int width, int height, int format, int type, byte[] pixels, int pixelsOffset) {}

    public static void glDeleteRenderbuffersEXT(int n, int[] renderbuffers, int renderbuffersOffset) {}

    public static void glLightf(int light, int pname, float param) {}

    public static void glEnableClientState(int array) {}

    public static void glHint(int target, int mode) {}

    public static void glNormalPointer(int type, int stride, long pointer) {}

    public static void glAlphaFunc(int func, float ref) {}

    public static void glProgramLocalParameter4fvARB(int target, int index, float[] params, int paramsOffset) {}

    public static void glVertex2f(float x, float y) {}

    public static void glStencilOp(int fail, int zfail, int zpass) {}

    public static void glBufferSubDataARBa(int arg0, int arg1, int arg2, long arg3) {}

    public static void glDisableClientState(int array) {}

    public static void glFogi(int pname, int param) {}

    public void release() {}

    public long init(Canvas arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) { return 0L; }

    public void surfaceResized(long arg0) {}

    public boolean a(String arg0) {
        if (this.c == null) {
            this.c = new Hashtable();
            String local10 = glGetString(7939);
            int local12 = 0;
            while (true) {
                int local17 = local10.indexOf(32, local12);
                if (local17 == -1) {
                    String local47 = local10.substring(local12).trim();
                    if (local47.length() != 0) {
                        this.c.put(local47, local47);
                    }
                    break;
                }
                String local26 = local10.substring(local12, local17).trim();
                if (local26.length() != 0) {
                    this.c.put(local26, local26);
                }
                local12 = local17 + 1;
            }
        }
        return this.c.containsKey(arg0);
    }

    public void setPbuffer(long arg0) {}

    public void swapBuffers() {}

    public void releaseSurface(Canvas arg0, long arg1) {}

    public long prepareSurface(Canvas arg0) { return 0L; }

    public long createPbuffer(int arg0, int arg1) { return 0L; }

    public boolean setSurface(long arg0) { return false; }

    public synchronized boolean b() {
        Thread local1 = Thread.currentThread();
        if (!this.attachPeer()) {
            return false;
        }
        OpenGL local10 = (OpenGL) a.put(local1, this);
        if (local10 != null) {
            local10.b = null;
        }
        this.b = local1;
        return true;
    }

    public synchronized boolean a() {
        if (this.b == Thread.currentThread()) {
            this.detachPeer();
            a.remove(this.b);
            this.b = null;
            return true;
        } else {
            return false;
        }
    }

    public void releasePbuffer(long arg0) {}

    public void detachPeer() {}

    public boolean attachPeer() { return false; }

    public void setSwapInterval(int arg0) {}

    public boolean arePbuffersAvailable() { return false; }
}
