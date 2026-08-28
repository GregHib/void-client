package jaggl

import awt.Canvas
import lang.Thread
import util.Hashtable
import org.khronos.webgl.Uint8Array
import org.khronos.webgl.Uint32Array
import org.w3c.dom.HTMLCanvasElement

const val GL_TEXTURE_1D = 3552
const val GL_TEXTURE_3D = 32879
const val GL_MULTISAMPLE = 32925

private val CORE_IN_WEBGL2 = setOf(
    "GL_ARB_multitexture", "GL_ARB_texture_env_combine", "GL_ARB_vertex_buffer_object",
    "GL_ARB_vertex_shader", "GL_ARB_fragment_shader", "GL_ARB_texture_cube_map",
    "GL_EXT_texture3D", "GL_EXT_framebuffer_object", "GL_EXT_framebuffer_blit",
    "GL_EXT_framebuffer_multisample", "GL_ARB_multisample", "GL_ARB_texture_float",
    "GL_ARB_half_float_pixel", "GL_ARB_shader_objects", "GL_ARB_shading_language_100",
)
private val UNSUPPORTED_IN_WEBGL2 = setOf(
    "GL_ARB_vertex_program", "GL_ARB_fragment_program", "GL_ARB_texture_rectangle",
)

private fun fixTarget(target: Int): Int =
    if (target == GL_TEXTURE_1D) WebGL2RenderingContext.TEXTURE_2D else target

private fun IntArray?.slice(offset: Int, count: Int): IntArray {
    val src = this ?: return IntArray(count)
    return IntArray(count) { src[offset + it] }
}

private fun FloatArray?.slice(offset: Int, count: Int): FloatArray {
    val src = this ?: return FloatArray(count)
    return FloatArray(count) { src[offset + it] }
}

actual class OpenGL {
    actual var a: Thread? = null
    actual var c: Hashtable<Any?, Any?>? = null
    private var peerValue: Long = 0L
    actual val peer: Long get() = peerValue

    actual fun detachPeer() {}
    actual fun setSwapInterval(arg0: Int) {}
    actual fun surfaceResized(arg0: Long) {}
    actual fun setPbuffer(arg0: Long) {}
    actual fun arePbuffersAvailable(): Boolean = false
    actual fun a(): Boolean = true
    actual fun releasePbuffer(arg0: Long) {}
    actual fun attachPeer(): Boolean = true
    actual fun releaseSurface(arg0: Canvas?, arg1: Long) {}

    actual fun init(arg0: Canvas?, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: Int, arg6: Int): Long {
        val canvasEl = arg0?.element as? HTMLCanvasElement
        if (canvasEl == null) {
            return 0L
        }
        var context = canvasEl.getContext("webgl2") as? WebGL2RenderingContext
        if (context == null) {
            context = arg0.replaceWithFreshCanvas().getContext("webgl2") as? WebGL2RenderingContext
        }
        if (context == null) {
            return 0L
        }
        try {
            val newState = GlState(context)
            newState.immediateMode = ImmediateModeEmulator(context, newState)
            newState.fixedFunctionShader = FixedFunctionShader(context)
            state = newState
            peerValue = 1L
            return peerValue
        } catch (t: Throwable) {
            return 0L
        }
    }

    actual fun b(): Boolean = true
    actual fun createPbuffer(arg0: Int, arg1: Int): Long = 0L
    actual fun swapBuffers() {}
    actual fun a(arg0: String?): Boolean {
        if (arg0 == null) return false
        if (arg0 in CORE_IN_WEBGL2) return true
        if (arg0 in UNSUPPORTED_IN_WEBGL2) return false
        val supported = state.gl.getSupportedExtensions() ?: return false
        return supported.contains(arg0)
    }

    actual fun release() {
        peerValue = 0L
    }

    actual fun prepareSurface(arg0: Canvas?): Long = 0L
    actual fun setSurface(arg0: Long): Boolean = true

    actual companion object {
        lateinit var state: GlState
        private val gl: WebGL2RenderingContext get() = state.gl

        actual val b: Hashtable<Any?, Any?> = Hashtable()

        private inline fun exec(crossinline op: () -> Unit) {
            if (state.displayLists.isRecording) {
                state.displayLists.record { op() }
            } else {
                op()
            }
        }

        private const val GL_BGRA = 32993
        private const val GL_RGBA = 6408
        private fun fixBgraFormat(format: Int): Int = if (format == GL_BGRA) GL_RGBA else format

        private const val GL_UNSIGNED_INT_8_8_8_8_REV = 33639
        private fun fixPixelType(type: Int): Int =
            if (type == GL_UNSIGNED_INT_8_8_8_8_REV) WebGL2RenderingContext.UNSIGNED_BYTE else type

        private const val GL_RGB = 6407

        private fun bgraToRgb(data: Uint8Array): Uint8Array {
            val texels = data.length / 4
            val out = Uint8Array(texels * 3)
            val src = data.asDynamic()
            val dst = out.asDynamic()
            var i = 0
            var o = 0
            while (i + 3 < data.length) {
                dst[o] = src[i + 2]
                dst[o + 1] = src[i + 1]
                dst[o + 2] = src[i]
                i += 4
                o += 3
            }
            return out
        }

        private fun swapRedBlue(data: Uint8Array): Uint8Array {
            val out = Uint8Array(data.length)
            val src = data.asDynamic()
            val dst = out.asDynamic()
            var i = 0
            while (i + 3 < data.length) {
                dst[i] = src[i + 2]
                dst[i + 1] = src[i + 1]
                dst[i + 2] = src[i]
                dst[i + 3] = src[i + 3]
                i += 4
            }
            return out
        }

        // ---- Immediate mode -------------------------------------------------

        actual fun glBegin(arg0: Int) = exec { state.immediateMode.begin(arg0) }
        actual fun glEnd() = exec { state.immediateMode.end() }
        actual fun glVertex2i(arg0: Int, arg1: Int) = exec { state.immediateMode.vertex(arg0.toFloat(), arg1.toFloat(), 0f) }
        actual fun glVertex2f(arg0: Float, arg1: Float) = exec { state.immediateMode.vertex(arg0, arg1, 0f) }
        actual fun glVertex3f(arg0: Float, arg1: Float, arg2: Float) = exec { state.immediateMode.vertex(arg0, arg1, arg2) }

        actual fun glColor3f(arg0: Float, arg1: Float, arg2: Float) = exec {
            state.currentColor[0] = arg0; state.currentColor[1] = arg1; state.currentColor[2] = arg2; state.currentColor[3] = 1f
        }

        actual fun glColor4f(arg0: Float, arg1: Float, arg2: Float, arg3: Float) = exec {
            state.currentColor[0] = arg0; state.currentColor[1] = arg1; state.currentColor[2] = arg2; state.currentColor[3] = arg3
        }

        actual fun glColor3ub(arg0: Byte, arg1: Byte, arg2: Byte) = exec {
            state.currentColor[0] = (arg0.toInt() and 0xFF) / 255f
            state.currentColor[1] = (arg1.toInt() and 0xFF) / 255f
            state.currentColor[2] = (arg2.toInt() and 0xFF) / 255f
            state.currentColor[3] = 1f
        }

        actual fun glColor4ub(arg0: Byte, arg1: Byte, arg2: Byte, arg3: Byte) = exec {
            state.currentColor[0] = (arg0.toInt() and 0xFF) / 255f
            state.currentColor[1] = (arg1.toInt() and 0xFF) / 255f
            state.currentColor[2] = (arg2.toInt() and 0xFF) / 255f
            state.currentColor[3] = (arg3.toInt() and 0xFF) / 255f
        }

        actual fun glTexCoord2f(arg0: Float, arg1: Float) = exec { state.currentTexCoord[0] = arg0; state.currentTexCoord[1] = arg1 }
        actual fun glTexCoord2i(arg0: Int, arg1: Int) = exec { state.currentTexCoord[0] = arg0.toFloat(); state.currentTexCoord[1] = arg1.toFloat() }
        actual fun glTexCoord3f(arg0: Float, arg1: Float, arg2: Float) = exec { state.currentTexCoord[0] = arg0; state.currentTexCoord[1] = arg1 }
        actual fun glTexCoord3i(arg0: Int, arg1: Int, arg2: Int) = exec { state.currentTexCoord[0] = arg0.toFloat(); state.currentTexCoord[1] = arg1.toFloat() }

        actual fun glNormal3f(arg0: Float, arg1: Float, arg2: Float) = exec {
            state.currentNormal[0] = arg0; state.currentNormal[1] = arg1; state.currentNormal[2] = arg2
        }

        actual fun glRasterPos2i(arg0: Int, arg1: Int) {
            // Only known call sites are the glCopyPixels(GL_COLOR) copy-to-self pattern below; no-op otherwise.
        }

        // ---- Matrix stack -----------------------------------------------------

        actual fun glMatrixMode(arg0: Int) = exec { state.matrixStack.mode = arg0 }
        actual fun glLoadIdentity() = exec { state.matrixStack.loadIdentity() }
        actual fun glLoadMatrixf(arg0: FloatArray?, arg1: Int) = exec { state.matrixStack.loadMatrix(arg0.slice(arg1, 16)) }
        actual fun glMultMatrixf(arg0: FloatArray?, arg1: Int) = exec { state.matrixStack.mult(arg0.slice(arg1, 16)) }
        actual fun glPushMatrix() = exec { state.matrixStack.push() }
        actual fun glPopMatrix() = exec { state.matrixStack.pop() }
        actual fun glTranslatef(arg0: Float, arg1: Float, arg2: Float) = exec { state.matrixStack.translate(arg0, arg1, arg2) }
        actual fun glScalef(arg0: Float, arg1: Float, arg2: Float) = exec { state.matrixStack.scale(arg0, arg1, arg2) }
        actual fun glRotatef(arg0: Float, arg1: Float, arg2: Float, arg3: Float) = exec { state.matrixStack.rotate(arg0, arg1, arg2, arg3) }
        actual fun glOrtho(arg0: Double, arg1: Double, arg2: Double, arg3: Double, arg4: Double, arg5: Double) = exec {
            state.matrixStack.ortho(arg0, arg1, arg2, arg3, arg4, arg5)
        }

        actual fun glFrustum(arg0: Double, arg1: Double, arg2: Double, arg3: Double, arg4: Double, arg5: Double) = exec {
            state.matrixStack.frustum(arg0, arg1, arg2, arg3, arg4, arg5)
        }

        // ---- Display lists ------------------------------------------------

        actual fun glGenLists(arg0: Int): Int = state.displayLists.genLists(arg0)
        actual fun glDeleteLists(arg0: Int, arg1: Int) = state.displayLists.deleteLists(arg0, arg1)
        actual fun glNewList(arg0: Int, arg1: Int) {
            state.displayLists.newList(arg0)
        }

        actual fun glEndList() {
            state.displayLists.endList()
        }

        actual fun glCallList(arg0: Int) = exec { state.displayLists.callList(arg0) }

        // ---- Core / fixed-function state ------------------------------------

        private fun texturingUnitIndex(): Int? = when (state.activeTextureUnit) {
            0, 1, 2 -> state.activeTextureUnit
            else -> null
        }

        actual fun glEnable(arg0: Int) = exec {
            when (arg0) {
                GL_LIGHTING -> state.lightingEnabled = true
                WebGL2RenderingContext.TEXTURE_2D, WebGL2RenderingContext.TEXTURE_CUBE_MAP,
                GL_TEXTURE_1D, GL_TEXTURE_3D,
                    -> texturingUnitIndex()?.let {
                        state.texturingEnabled[it] = true
                        state.textureTarget[it] = fixTarget(arg0)
                    }
                GL_TEXTURE_GEN_S, GL_TEXTURE_GEN_T, GL_TEXTURE_GEN_R, GL_TEXTURE_GEN_Q ->
                    texturingUnitIndex()?.let { state.texGenEnabled[it] = true }
                GL_FOG -> state.fogEnabled = true
                GL_ALPHA_TEST -> state.alphaTestEnabled = true
                in GL_LIGHT0..GL_LIGHT7 -> (arg0 - GL_LIGHT0).let { if (it in 0..1) state.lightEnabled[it] = true }
                GL_COLOR_MATERIAL, GL_NORMALIZE, GL_MULTISAMPLE -> {
                }
                else -> gl.enable(arg0)
            }
        }

        actual fun glDisable(arg0: Int) = exec {
            when (arg0) {
                GL_LIGHTING -> state.lightingEnabled = false
                WebGL2RenderingContext.TEXTURE_2D, WebGL2RenderingContext.TEXTURE_CUBE_MAP,
                GL_TEXTURE_1D, GL_TEXTURE_3D,
                    -> texturingUnitIndex()?.let { state.texturingEnabled[it] = false }
                GL_TEXTURE_GEN_S, GL_TEXTURE_GEN_T, GL_TEXTURE_GEN_R, GL_TEXTURE_GEN_Q ->
                    texturingUnitIndex()?.let { state.texGenEnabled[it] = false }
                GL_FOG -> state.fogEnabled = false
                GL_ALPHA_TEST -> state.alphaTestEnabled = false
                in GL_LIGHT0..GL_LIGHT7 -> (arg0 - GL_LIGHT0).let { if (it in 0..1) state.lightEnabled[it] = false }
                GL_COLOR_MATERIAL, GL_NORMALIZE, GL_MULTISAMPLE -> {
                }
                else -> gl.disable(arg0)
            }
        }

        actual fun glShadeModel(arg0: Int) {}
        actual fun glColorMaterial(arg0: Int, arg1: Int) {}

        actual fun glHint(arg0: Int, arg1: Int) {
            if (arg0 == WebGL2RenderingContext.GENERATE_MIPMAP_HINT || arg0 == WebGL2RenderingContext.FRAGMENT_SHADER_DERIVATIVE_HINT) {
                gl.hint(arg0, arg1)
            }
        }

        actual fun glPointSize(arg0: Float) {}
        actual fun glLineWidth(arg0: Float) = gl.lineWidth(arg0)
        actual fun glPolygonMode(arg0: Int, arg1: Int) {}
        actual fun glPushAttrib(arg0: Int) {}
        actual fun glPopAttrib() {}

        actual fun glAlphaFunc(arg0: Int, arg1: Float) = exec {
            state.alphaFunc = arg0
            state.alphaRef = arg1
        }

        actual fun glBlendFunc(arg0: Int, arg1: Int) = gl.blendFunc(arg0, arg1)
        actual fun glDepthFunc(arg0: Int) = gl.depthFunc(arg0)
        actual fun glDepthMask(arg0: Boolean) = gl.depthMask(arg0)
        actual fun glCullFace(arg0: Int) = gl.cullFace(arg0)
        actual fun glColorMask(arg0: Boolean, arg1: Boolean, arg2: Boolean, arg3: Boolean) = gl.colorMask(arg0, arg1, arg2, arg3)
        actual fun glScissor(arg0: Int, arg1: Int, arg2: Int, arg3: Int) = gl.scissor(arg0, arg1, arg2, arg3)
        actual fun glStencilFunc(arg0: Int, arg1: Int, arg2: Int) = gl.stencilFunc(arg0, arg1, arg2)
        actual fun glStencilOp(arg0: Int, arg1: Int, arg2: Int) = gl.stencilOp(arg0, arg1, arg2)

        actual fun glViewport(arg0: Int, arg1: Int, arg2: Int, arg3: Int) = gl.viewport(arg0, arg1, arg2, arg3)
        actual fun glClearColor(arg0: Float, arg1: Float, arg2: Float, arg3: Float) = gl.clearColor(arg0, arg1, arg2, arg3)
        actual fun glClearDepth(arg0: Float) = gl.clearDepth(arg0)
        actual fun glClear(arg0: Int) = gl.clear(arg0)
        actual fun glFinish() = gl.finish()
        actual fun glFlush() = gl.flush()

        actual fun glLightf(arg0: Int, arg1: Int, arg2: Float) {}
        actual fun glLightfv(arg0: Int, arg1: Int, arg2: FloatArray?, arg3: Int) = exec {
            val light = arg0 - GL_LIGHT0
            if (light !in 0..1) return@exec
            val v = arg2.slice(arg3, 4)
            when (arg1) {
                GL_AMBIENT -> v.copyInto(state.lightAmbient[light])
                GL_DIFFUSE -> v.copyInto(state.lightDiffuse[light])
                GL_POSITION -> state.transformLightPosition(v).copyInto(state.lightDirection[light])
            }
        }

        actual fun glLightModelfv(arg0: Int, arg1: FloatArray?, arg2: Int) = exec {
            if (arg0 == GL_LIGHT_MODEL_AMBIENT) arg1.slice(arg2, 4).copyInto(state.globalAmbient)
        }

        actual fun glMaterialfv(arg0: Int, arg1: Int, arg2: FloatArray?, arg3: Int) {}

        actual fun glFogf(arg0: Int, arg1: Float) = exec {
            when (arg0) {
                GL_FOG_START -> state.fogStart = arg1; GL_FOG_END -> state.fogEnd = arg1
            }
        }

        actual fun glFogi(arg0: Int, arg1: Int) {}
        actual fun glFogfv(arg0: Int, arg1: FloatArray?, arg2: Int) = exec {
            when (arg0) {
                GL_FOG_COLOR -> arg1.slice(arg2, 4).copyInto(state.fogColor)
                GL_FOG_START -> state.fogStart = arg1?.get(arg2) ?: state.fogStart
                GL_FOG_END -> state.fogEnd = arg1?.get(arg2) ?: state.fogEnd
            }
        }

        actual fun glTexGeni(arg0: Int, arg1: Int, arg2: Int) = exec {
            if (arg1 != GL_TEXTURE_GEN_MODE) return@exec
            if (arg0 !in GL_S..GL_Q) return@exec
            texturingUnitIndex()?.let { state.texGenMode[it] = arg2 }
        }
        actual fun glTexGenfv(arg0: Int, arg1: Int, arg2: FloatArray?, arg3: Int) {}
        actual fun glTexEnvi(arg0: Int, arg1: Int, arg2: Int) = exec {
            if (arg0 != GL_TEXTURE_ENV) return@exec
            val unit = texturingUnitIndex() ?: return@exec
            when (arg1) {
                GL_COMBINE_RGB -> state.combineRgb[unit] = arg2
                GL_COMBINE_ALPHA -> state.combineAlpha[unit] = arg2
                GL_SOURCE0_RGB -> state.source0Rgb[unit] = arg2
                GL_SOURCE1_RGB -> state.source1Rgb[unit] = arg2
                GL_SOURCE2_RGB -> state.source2Rgb[unit] = arg2
                GL_OPERAND0_RGB -> state.operand0Rgb[unit] = arg2
                GL_OPERAND1_RGB -> state.operand1Rgb[unit] = arg2
                GL_OPERAND2_RGB -> state.operand2Rgb[unit] = arg2
                GL_SOURCE0_ALPHA -> state.source0Alpha[unit] = arg2
                GL_SOURCE1_ALPHA -> state.source1Alpha[unit] = arg2
                GL_SOURCE2_ALPHA -> state.source2Alpha[unit] = arg2
                GL_OPERAND0_ALPHA -> state.operand0Alpha[unit] = arg2
                GL_OPERAND1_ALPHA -> state.operand1Alpha[unit] = arg2
                GL_OPERAND2_ALPHA -> state.operand2Alpha[unit] = arg2
                GL_RGB_SCALE -> state.rgbScale[unit] = arg2.toFloat()
                GL_ALPHA_SCALE -> state.alphaScale[unit] = arg2.toFloat()
            }
        }

        actual fun glTexEnvf(arg0: Int, arg1: Int, arg2: Float) = exec {
            if (arg0 != GL_TEXTURE_ENV) return@exec
            val unit = texturingUnitIndex() ?: return@exec
            when (arg1) {
                GL_RGB_SCALE -> state.rgbScale[unit] = arg2
                GL_ALPHA_SCALE -> state.alphaScale[unit] = arg2
            }
        }
        actual fun glTexEnvfv(arg0: Int, arg1: Int, arg2: FloatArray?, arg3: Int) = exec {
            if (arg0 == GL_TEXTURE_ENV && arg1 == GL_TEXTURE_ENV_COLOR) {
                val unit = texturingUnitIndex() ?: return@exec
                arg2.slice(arg3, 4).copyInto(state.textureEnvColor[unit])
            }
        }

        // ---- Queries ----------------------------------------------------------

        private const val GL_MAX_TEXTURE_UNITS = 34018
        private const val GL_MAX_TEXTURE_COORDS = 34929
        private const val GL_POINT_SIZE_RANGE = 2834
        private fun sizedInternalFormat(format: Int): Int = when (format) {
            6408 -> WebGL2RenderingContext.RGBA8
            6407 -> WebGL2RenderingContext.RGB8
            6406 -> WebGL2RenderingContext.R8
            6409 -> WebGL2RenderingContext.R8
            6410 -> WebGL2RenderingContext.RG8
            6402 -> WebGL2RenderingContext.DEPTH_COMPONENT24
            34041 -> WebGL2RenderingContext.DEPTH24_STENCIL8
            else -> format
        }

        private fun translatePname(pname: Int): Int = when (pname) {
            GL_MAX_TEXTURE_UNITS, GL_MAX_TEXTURE_COORDS -> WebGL2RenderingContext.MAX_TEXTURE_IMAGE_UNITS
            GL_POINT_SIZE_RANGE -> WebGL2RenderingContext.ALIASED_POINT_SIZE_RANGE
            else -> pname
        }

        actual fun glGetError(): Int = gl.getError()
        actual fun glGetString(arg0: Int): String {
            if (arg0 == 7938) return "2.1.0 WebGL2"
            return gl.getParameter(arg0)?.toString() ?: ""
        }

        actual fun glGetIntegerv(arg0: Int, arg1: IntArray?, arg2: Int) {
            when (val v = gl.getParameter(translatePname(arg0))) {
                is org.khronos.webgl.Int32Array -> for (i in 0 until v.length) arg1?.set(arg2 + i, v.asDynamic()[i] as Int)
                is Int -> arg1?.set(arg2, v)
                is Double -> arg1?.set(arg2, v.toInt())
                is Boolean -> arg1?.set(arg2, if (v) 1 else 0)
                else -> arg1?.set(arg2, 0)
            }
        }

        actual fun glGetFloatv(arg0: Int, arg1: FloatArray?, arg2: Int) {
            when (val v = gl.getParameter(translatePname(arg0))) {
                is org.khronos.webgl.Float32Array -> for (i in 0 until v.length) arg1?.set(arg2 + i, v.asDynamic()[i] as Float)
                is Float -> arg1?.set(arg2, v)
                is Double -> arg1?.set(arg2, v.toFloat())
                else -> arg1?.set(arg2, 0f)
            }
        }

        // ---- Textures -----------------------------------------------------

        actual fun glGenTextures(arg0: Int, arg1: IntArray?, arg2: Int) {
            for (i in 0 until arg0) {
                val id = state.textures.allocate(gl.createTexture()!!)
                arg1?.set(arg2 + i, id)
            }
        }

        actual fun glDeleteTextures(arg0: Int, arg1: IntArray?, arg2: Int) {
            for (i in 0 until arg0) {
                val id = arg1?.get(arg2 + i) ?: continue
                state.textures[id]?.let { gl.deleteTexture(it) }
                state.textures.release(id)
            }
        }

        actual fun glBindTexture(arg0: Int, arg1: Int) = exec {
            val target = fixTarget(arg0)
            val tex = if (arg1 == 0) null else state.textures[arg1]
            gl.bindTexture(target, tex)
            val unit = state.activeTextureUnit
            if (target == WebGL2RenderingContext.TEXTURE_2D) state.boundTexture2D[unit] = tex
            else if (target == WebGL2RenderingContext.TEXTURE_CUBE_MAP) state.boundTextureCubeMap[unit] = tex
        }

        actual fun glTexParameteri(arg0: Int, arg1: Int, arg2: Int) = gl.texParameteri(fixTarget(arg0), arg1, arg2)
        actual fun glTexParameterf(arg0: Int, arg1: Int, arg2: Float) = gl.texParameterf(fixTarget(arg0), arg1, arg2)
        actual fun glGenerateMipmapEXT(arg0: Int) = gl.generateMipmap(fixTarget(arg0))

        actual fun glActiveTexture(arg0: Int) = exec {
            state.activeTextureUnit = arg0 - WebGL2RenderingContext.TEXTURE0
            state.matrixStack.textureUnit = state.activeTextureUnit
            gl.activeTexture(arg0)
        }

        actual fun glClientActiveTexture(arg0: Int) {}

        actual fun glMultiTexCoord2f(arg0: Int, arg1: Float, arg2: Float) = exec {
            when (arg0 - WebGL2RenderingContext.TEXTURE0) {
                0 -> {
                    state.currentTexCoord[0] = arg1; state.currentTexCoord[1] = arg2
                }
                1 -> {
                    state.currentTexCoord1[0] = arg1; state.currentTexCoord1[1] = arg2
                    state.currentTexCoord1[2] = 0f
                }
            }
        }

        actual fun glMultiTexCoord2i(arg0: Int, arg1: Int, arg2: Int) = exec {
            when (arg0 - WebGL2RenderingContext.TEXTURE0) {
                0 -> {
                    state.currentTexCoord[0] = arg1.toFloat(); state.currentTexCoord[1] = arg2.toFloat()
                }
                1 -> {
                    state.currentTexCoord1[0] = arg1.toFloat(); state.currentTexCoord1[1] = arg2.toFloat()
                    state.currentTexCoord1[2] = 0f
                }
            }
        }

        actual fun glMultiTexCoord3i(arg0: Int, arg1: Int, arg2: Int, arg3: Int) = exec {
            when (arg0 - WebGL2RenderingContext.TEXTURE0) {
                0 -> {
                    state.currentTexCoord[0] = arg1.toFloat(); state.currentTexCoord[1] = arg2.toFloat()
                }
                1 -> {
                    state.currentTexCoord1[0] = arg1.toFloat(); state.currentTexCoord1[1] = arg2.toFloat()
                    state.currentTexCoord1[2] = arg3.toFloat()
                }
            }
        }

        actual fun glTexImage1Dub(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: Int, arg6: Int, arg7: ByteArray?, arg8: Int) {
            val data = arg7?.asUint8Array()?.subarray(arg8, arg7.size)
            gl.texImage2D(WebGL2RenderingContext.TEXTURE_2D, arg1, arg2, arg3, 1, arg4, arg5, arg6, data)
        }

        actual fun glTexImage2Dub(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: Int, arg6: Int, arg7: Int, arg8: ByteArray?, arg9: Int) {
            val data = arg8?.asUint8Array()?.subarray(arg9, arg8.size)
            gl.texImage2D(fixTarget(arg0), arg1, arg2, arg3, arg4, arg5, arg6, arg7, data)
            state.recordTextureInternalFormat(fixTarget(arg0), arg2)
        }

        actual fun glTexImage2Di(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: Int, arg6: Int, arg7: Int, arg8: IntArray?, arg9: Int) {
            val type = fixPixelType(arg7)
            var data = if (arg8 == null) null
            else if (type == WebGL2RenderingContext.UNSIGNED_BYTE) arg8.asUint8ArrayView(arg9, arg8.size - arg9)
            else arg8.asInt32Array().subarray(arg9, arg8.size)
            val target = fixTarget(arg0)
            val internalformat = fixBgraFormat(arg2)
            val toRgb = arg6 == GL_BGRA && internalformat == GL_RGB
            val format = if (toRgb) GL_RGB else fixBgraFormat(arg6)
            if (arg6 == GL_BGRA && data is Uint8Array) {
                data = if (toRgb) bgraToRgb(data) else swapRedBlue(data)
            }
            gl.texImage2D(target, arg1, internalformat, arg3, arg4, arg5, format, type, data)
            state.recordTextureInternalFormat(target, internalformat)
        }

        actual fun glTexImage2Df(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: Int, arg6: Int, arg7: Int, arg8: FloatArray?, arg9: Int) {
            val data = arg8?.asFloat32Array()?.subarray(arg9, arg8.size)
            gl.texImage2D(fixTarget(arg0), arg1, arg2, arg3, arg4, arg5, arg6, arg7, data)
            state.recordTextureInternalFormat(fixTarget(arg0), arg2)
        }

        actual fun glTexImage3Dub(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: Int, arg6: Int, arg7: Int, arg8: Int, arg9: ByteArray?, arg10: Int) {
            val data = arg9?.asUint8Array()?.subarray(arg10, arg9.size)
            gl.texImage3D(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, data)
        }

        actual fun glTexSubImage2Dub(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: Int, arg6: Int, arg7: Int, arg8: ByteArray?, arg9: Int) {
            val data = arg8?.asUint8Array()?.subarray(arg9, arg8.size)
            gl.texSubImage2D(fixTarget(arg0), arg1, arg2, arg3, arg4, arg5, arg6, arg7, data)
        }

        actual fun glTexSubImage2Di(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: Int, arg6: Int, arg7: Int, arg8: IntArray?, arg9: Int) {
            val type = fixPixelType(arg7)
            var data = if (arg8 == null) null
            else if (type == WebGL2RenderingContext.UNSIGNED_BYTE) arg8.asUint8ArrayView(arg9, arg8.size - arg9)
            else arg8.asInt32Array().subarray(arg9, arg8.size)
            val target = fixTarget(arg0)
            val toRgb = arg6 == GL_BGRA && state.textureInternalFormat(target) == GL_RGB
            val format = if (toRgb) GL_RGB else fixBgraFormat(arg6)
            if (arg6 == GL_BGRA && data is Uint8Array) {
                data = if (toRgb) bgraToRgb(data) else swapRedBlue(data)
            }
            gl.texSubImage2D(target, arg1, arg2, arg3, arg4, arg5, format, type, data)
        }

        actual fun glTexSubImage2Df(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: Int, arg6: Int, arg7: Int, arg8: FloatArray?, arg9: Int) {
            val data = arg8?.asFloat32Array()?.subarray(arg9, arg8.size)
            gl.texSubImage2D(fixTarget(arg0), arg1, arg2, arg3, arg4, arg5, arg6, arg7, data)
        }

        actual fun glCopyTexImage2D(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: Int, arg6: Int, arg7: Int) =
            gl.copyTexImage2D(fixTarget(arg0), arg1, arg2, arg3, arg4, arg5, arg6, arg7)

        actual fun glCopyTexSubImage2D(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: Int, arg6: Int, arg7: Int) =
            gl.copyTexSubImage2D(fixTarget(arg0), arg1, arg2, arg3, arg4, arg5, arg6, arg7)

        actual fun glCopyTexSubImage3D(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: Int, arg6: Int, arg7: Int, arg8: Int) =
            gl.copyTexSubImage3D(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8)
        actual fun glGetTexImageub(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: ByteArray?, arg5: Int) {}
        actual fun glGetTexImagei(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: IntArray?, arg5: Int) {}

        actual fun glGenBuffersARB(arg0: Int, arg1: IntArray?, arg2: Int) {
            for (i in 0 until arg0) {
                val buf = gl.createBuffer()
                if (buf == null) {
                }
                val id = state.buffers.allocate(buf!!)
                arg1?.set(arg2 + i, id)
            }
        }

        actual fun glDeleteBuffersARB(arg0: Int, arg1: IntArray?, arg2: Int) {
            for (i in 0 until arg0) {
                val id = arg1?.get(arg2 + i) ?: continue
                state.buffers[id]?.let { gl.deleteBuffer(it) }
                state.buffers.release(id)
            }
        }

        actual fun glBindBufferARB(arg0: Int, arg1: Int) {
            val buf = if (arg1 == 0) null else state.buffers[arg1]
            gl.bindBuffer(arg0, buf)
            when (arg0) {
                WebGL2RenderingContext.ARRAY_BUFFER -> state.boundArrayBuffer = buf
                WebGL2RenderingContext.ELEMENT_ARRAY_BUFFER -> state.boundElementArrayBuffer = buf
            }
        }

        actual fun glBufferDataARBa(arg0: Int, arg1: Int, arg2: Long, arg3: Int) {
            val bytes = jaclib.memory.heap.nativeHeapBytes(arg2)
            if (bytes == null) gl.bufferData(arg0, arg1, arg3)
            else gl.bufferData(arg0, bytes.asUint8Array().subarray(0, arg1), arg3)
        }

        actual fun glBufferDataARBub(arg0: Int, arg1: Int, arg2: ByteArray?, arg3: Int, arg4: Int) {
            val data = arg2 ?: return
            gl.bufferData(arg0, data.asUint8Array().subarray(arg3, arg3 + arg1), arg4)
        }

        actual fun glBufferSubDataARBa(arg0: Int, arg1: Int, arg2: Int, arg3: Long) {
            val bytes = jaclib.memory.heap.nativeHeapBytes(arg3) ?: return
            gl.bufferSubData(arg0, arg1, bytes.asUint8Array().subarray(0, arg2))
        }

        actual fun glBufferSubDataARBub(arg0: Int, arg1: Int, arg2: Int, arg3: ByteArray?, arg4: Int) {
            val data = arg3 ?: return
            gl.bufferSubData(arg0, arg1, data.asUint8Array().subarray(arg4, arg4 + arg2))
        }

        actual fun glMapBufferARB(arg0: Int, arg1: Int): Long = 0L
        actual fun glUnmapBufferARB(arg0: Int): Boolean = true

        actual fun glEnableClientState(arg0: Int) = exec {
            val loc = attribForClientState(arg0) ?: return@exec
            state.clientArrays.getValue(loc).enabled = true
        }

        actual fun glDisableClientState(arg0: Int) = exec {
            val loc = attribForClientState(arg0) ?: return@exec
            state.clientArrays.getValue(loc).enabled = false
        }

        private fun attribForClientState(cap: Int): Int? = when (cap) {
            GL_VERTEX_ARRAY -> ATTRIB_POSITION
            GL_COLOR_ARRAY -> ATTRIB_COLOR
            GL_TEXTURE_COORD_ARRAY -> ATTRIB_TEXCOORD0
            GL_NORMAL_ARRAY -> ATTRIB_NORMAL
            else -> null
        }

        actual fun glVertexPointer(arg0: Int, arg1: Int, arg2: Int, arg3: Long) = exec {
            val p = state.clientArrays.getValue(ATTRIB_POSITION)
            p.size = arg0; p.type = arg1; p.stride = arg2; p.offset = arg3.toInt()
            p.sourceBuffer = state.boundArrayBuffer
        }

        actual fun glColorPointer(arg0: Int, arg1: Int, arg2: Int, arg3: Long) = exec {
            val p = state.clientArrays.getValue(ATTRIB_COLOR)
            p.size = arg0; p.type = arg1; p.stride = arg2; p.offset = arg3.toInt()
            p.normalized = arg1 == WebGL2RenderingContext.UNSIGNED_BYTE
            p.sourceBuffer = state.boundArrayBuffer
        }

        actual fun glTexCoordPointer(arg0: Int, arg1: Int, arg2: Int, arg3: Long) = exec {
            val p = state.clientArrays.getValue(ATTRIB_TEXCOORD0)
            p.size = arg0; p.type = arg1; p.stride = arg2; p.offset = arg3.toInt()
            p.sourceBuffer = state.boundArrayBuffer
        }

        actual fun glNormalPointer(arg0: Int, arg1: Int, arg2: Long) = exec {
            val p = state.clientArrays.getValue(ATTRIB_NORMAL)
            p.size = 3; p.type = arg0; p.stride = arg1; p.offset = arg2.toInt()
            p.sourceBuffer = state.boundArrayBuffer
        }

        private fun bindClientArrays() {
            for ((loc, p) in state.clientArrays) {
                if (p.enabled) {
                    gl.bindBuffer(WebGL2RenderingContext.ARRAY_BUFFER, p.sourceBuffer)
                    gl.enableVertexAttribArray(loc)
                    gl.vertexAttribPointer(loc, p.size, p.type, p.normalized, p.stride, p.offset)
                } else {
                    gl.disableVertexAttribArray(loc)
                    when (loc) {
                        ATTRIB_COLOR -> gl.vertexAttrib4f(
                            loc, state.currentColor[0], state.currentColor[1], state.currentColor[2], state.currentColor[3]
                        )
                        ATTRIB_TEXCOORD0 -> gl.vertexAttrib2f(loc, state.currentTexCoord[0], state.currentTexCoord[1])
                        ATTRIB_TEXCOORD1 -> gl.vertexAttrib3f(
                            loc, state.currentTexCoord1[0], state.currentTexCoord1[1], state.currentTexCoord1[2]
                        )
                        ATTRIB_NORMAL -> gl.vertexAttrib3f(loc, state.currentNormal[0], state.currentNormal[1], state.currentNormal[2])
                    }
                }
            }
        }

        actual fun glDrawArrays(arg0: Int, arg1: Int, arg2: Int) = exec {
            bindClientArrays()
            state.prepareDraw()
            val indices = quadIndices(arg0, arg1, arg2)
            if (indices == null) {
                gl.drawArrays(arg0, arg1, arg2)
            } else {
                gl.bindBuffer(WebGL2RenderingContext.ELEMENT_ARRAY_BUFFER, state.quadIndexBuffer)
                gl.bufferData(WebGL2RenderingContext.ELEMENT_ARRAY_BUFFER, indices, WebGL2RenderingContext.STREAM_DRAW)
                gl.drawElements(WebGL2RenderingContext.TRIANGLES, indices.length, GL_UNSIGNED_INT, 0)
                gl.bindBuffer(WebGL2RenderingContext.ELEMENT_ARRAY_BUFFER, state.boundElementArrayBuffer)
            }
        }

        private const val GL_UNSIGNED_INT = 5125

        private fun quadIndices(mode: Int, first: Int, count: Int): Uint32Array? {
            val out = ArrayList<Int>()
            when (mode) {
                GL_QUADS -> {
                    var i = 0
                    while (i + 4 <= count) {
                        val b = first + i
                        out.add(b); out.add(b + 1); out.add(b + 2)
                        out.add(b); out.add(b + 2); out.add(b + 3)
                        i += 4
                    }
                }
                GL_QUAD_STRIP -> {
                    var i = 0
                    while (i + 4 <= count) {
                        val b = first + i
                        out.add(b); out.add(b + 1); out.add(b + 3)
                        out.add(b); out.add(b + 3); out.add(b + 2)
                        i += 2
                    }
                }
                GL_POLYGON -> {
                    for (i in 1..count - 2) {
                        out.add(first); out.add(first + i); out.add(first + i + 1)
                    }
                }
                else -> return null
            }
            val array = Uint32Array(out.size)
            val view = array.asDynamic()
            for (i in out.indices) view[i] = out[i]
            return array
        }

        actual fun glDrawElements(arg0: Int, arg1: Int, arg2: Int, arg3: Long) = exec {
            bindClientArrays()
            if (state.boundElementArrayBuffer == null) {
                val bytesPerIndex = when (arg2) {
                    WebGL2RenderingContext.UNSIGNED_BYTE -> 1
                    5123 -> 2
                    else -> 4
                }
                val bytes = jaclib.memory.heap.nativeHeapBytes(arg3)
                gl.bindBuffer(WebGL2RenderingContext.ELEMENT_ARRAY_BUFFER, state.clientElementBuffer)
                if (bytes != null) {
                    gl.bufferData(
                        WebGL2RenderingContext.ELEMENT_ARRAY_BUFFER,
                        bytes.asUint8Array().subarray(0, arg1 * bytesPerIndex),
                        WebGL2RenderingContext.STREAM_DRAW
                    )
                }
                state.prepareDraw()
                gl.drawElements(arg0, arg1, arg2, 0)
                gl.bindBuffer(WebGL2RenderingContext.ELEMENT_ARRAY_BUFFER, null)
            } else {
                gl.bindBuffer(WebGL2RenderingContext.ELEMENT_ARRAY_BUFFER, state.boundElementArrayBuffer)
                state.prepareDraw()
                gl.drawElements(arg0, arg1, arg2, arg3.toInt())
            }
        }

        actual fun glPixelStorei(arg0: Int, arg1: Int) = gl.pixelStorei(arg0, arg1)
        actual fun glPixelTransferf(arg0: Int, arg1: Float) {}
        actual fun glPixelZoom(arg0: Float, arg1: Float) {}
        actual fun glReadPixelsi(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: Int, arg6: IntArray?, arg7: Int) {
            arg6 ?: return
            gl.readPixels(arg0, arg1, arg2, arg3, arg4, arg5, arg6.asInt32Array())
        }

        actual fun glReadPixelsub(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: Int, arg6: ByteArray?, arg7: Int) {
            arg6 ?: return
            gl.readPixels(arg0, arg1, arg2, arg3, arg4, arg5, arg6.asUint8Array())
        }
        actual fun glCopyPixels(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int) {}
        actual fun glDrawPixelsi(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: IntArray?, arg5: Int) {}
        actual fun glDrawPixelsub(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: ByteArray?, arg5: Int) {}

        actual fun glGenFramebuffersEXT(arg0: Int, arg1: IntArray?, arg2: Int) {
            for (i in 0 until arg0) {
                val id = state.framebuffers.allocate(gl.createFramebuffer()!!)
                arg1?.set(arg2 + i, id)
            }
        }

        actual fun glDeleteFramebuffersEXT(arg0: Int, arg1: IntArray?, arg2: Int) {
            for (i in 0 until arg0) {
                val id = arg1?.get(arg2 + i) ?: continue
                state.framebuffers[id]?.let { gl.deleteFramebuffer(it) }
                state.framebuffers.release(id)
            }
        }

        actual fun glBindFramebufferEXT(arg0: Int, arg1: Int) {
            val fb = if (arg1 == 0) null else state.framebuffers[arg1]
            gl.bindFramebuffer(arg0, fb)
            state.boundFramebuffer = fb
        }

        actual fun glFramebufferTexture2DEXT(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int) {
            val tex = if (arg3 == 0) null else state.textures[arg3]
            gl.framebufferTexture2D(arg0, arg1, fixTarget(arg2), tex, arg4)
        }

        actual fun glFramebufferTexture3DEXT(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: Int) {
            val tex = if (arg3 == 0) null else state.textures[arg3]
            gl.framebufferTextureLayer(arg0, arg1, tex, arg4, arg5)
        }

        actual fun glFramebufferRenderbufferEXT(arg0: Int, arg1: Int, arg2: Int, arg3: Int) {
            val rb = if (arg3 == 0) null else state.renderbuffers[arg3]
            gl.framebufferRenderbuffer(arg0, arg1, arg2, rb)
        }

        actual fun glCheckFramebufferStatusEXT(arg0: Int): Int = gl.checkFramebufferStatus(arg0)
        actual fun glBlitFramebufferEXT(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: Int, arg6: Int, arg7: Int, arg8: Int, arg9: Int) =
            gl.blitFramebuffer(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9)

        actual fun glDrawBuffer(arg0: Int) {
            val mode = if (state.boundFramebuffer == null && arg0 != WebGL2RenderingContext.NONE) {
                WebGL2RenderingContext.BACK
            } else arg0
            gl.drawBuffers(arrayOf(mode))
        }

        actual fun glDrawBuffersARB(arg0: Int, arg1: IntArray?, arg2: Int) = gl.drawBuffers(arg1.slice(arg2, arg0).toTypedArray())
        actual fun glReadBuffer(arg0: Int) {
            val mode = if (state.boundFramebuffer == null && arg0 != WebGL2RenderingContext.NONE) {
                WebGL2RenderingContext.BACK
            } else arg0
            gl.readBuffer(mode)
        }

        actual fun glGenRenderbuffersEXT(arg0: Int, arg1: IntArray?, arg2: Int) {
            for (i in 0 until arg0) {
                val id = state.renderbuffers.allocate(gl.createRenderbuffer()!!)
                arg1?.set(arg2 + i, id)
            }
        }

        actual fun glDeleteRenderbuffersEXT(arg0: Int, arg1: IntArray?, arg2: Int) {
            for (i in 0 until arg0) {
                val id = arg1?.get(arg2 + i) ?: continue
                state.renderbuffers[id]?.let { gl.deleteRenderbuffer(it) }
                state.renderbuffers.release(id)
            }
        }

        actual fun glBindRenderbufferEXT(arg0: Int, arg1: Int) = gl.bindRenderbuffer(arg0, if (arg1 == 0) null else state.renderbuffers[arg1])
        actual fun glRenderbufferStorageEXT(arg0: Int, arg1: Int, arg2: Int, arg3: Int) =
            gl.renderbufferStorage(arg0, sizedInternalFormat(arg1), arg2, arg3)

        actual fun glRenderbufferStorageMultisampleEXT(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int) =
            gl.renderbufferStorageMultisample(arg0, arg1, sizedInternalFormat(arg2), arg3, arg4)

        actual fun glCreateShaderObjectARB(arg0: Int): Long {
            val shader = gl.createShader(arg0) ?: return 0L
            return state.glObjects.allocate(ShaderOrProgram.Shader(shader, arg0))
        }

        actual fun glShaderSourceARB(arg0: Long, arg1: String?) {
            val obj = state.glObjects[arg0] as? ShaderOrProgram.Shader ?: return
            gl.shaderSource(obj.shader, translateLegacyGlsl(arg1 ?: "", obj.type))
        }

        actual fun glShaderSourceRawARB(arg0: Long, arg1: ByteArray?) {
            val obj = state.glObjects[arg0] as? ShaderOrProgram.Shader ?: return
            gl.shaderSource(obj.shader, translateLegacyGlsl(arg1?.decodeToString() ?: "", obj.type))
        }

        actual fun glCompileShaderARB(arg0: Long) {
            (state.glObjects[arg0] as? ShaderOrProgram.Shader)?.let { gl.compileShader(it.shader) }
        }

        actual fun glCreateProgramObjectARB(): Long {
            val program = gl.createProgram() ?: return 0L
            return state.glObjects.allocate(ShaderOrProgram.Program(program))
        }

        actual fun glAttachObjectARB(arg0: Long, arg1: Long) {
            val obj = state.glObjects[arg0] as? ShaderOrProgram.Program ?: return
            val shaderObj = state.glObjects[arg1] as? ShaderOrProgram.Shader ?: return
            gl.attachShader(obj.program, shaderObj.shader)
            obj.attachedTypes.add(shaderObj.type)
        }

        actual fun glDetachObjectARB(arg0: Long, arg1: Long) {
            val obj = state.glObjects[arg0] as? ShaderOrProgram.Program ?: return
            val shaderObj = state.glObjects[arg1] as? ShaderOrProgram.Shader ?: return
            gl.detachShader(obj.program, shaderObj.shader)
            obj.attachedTypes.remove(shaderObj.type)
        }

        actual fun glLinkProgramARB(arg0: Long) {
            (state.glObjects[arg0] as? ShaderOrProgram.Program)?.let {
                if (WebGL2RenderingContext.VERTEX_SHADER !in it.attachedTypes && !it.hasSyntheticVertexShader) {
                    gl.attachShader(it.program, state.syntheticVertexShader)
                    it.hasSyntheticVertexShader = true
                }
                gl.linkProgram(it.program)
                it.compat = CompatUniformLocations(gl, it.program)
            }
        }

        actual fun glUseProgramObjectARB(arg0: Long) {
            val obj = if (arg0 == 0L) null else state.glObjects[arg0] as? ShaderOrProgram.Program
            gl.useProgram(obj?.program)
            state.boundProgram = obj?.program
            state.boundProgramObj = obj
        }

        actual fun glDeleteObjectARB(arg0: Long) {
            when (val obj = state.glObjects[arg0]) {
                is ShaderOrProgram.Program -> gl.deleteProgram(obj.program)
                is ShaderOrProgram.Shader -> gl.deleteShader(obj.shader)
                null -> return
            }
            state.glObjects.release(arg0)
        }

        actual fun glGetObjectParameterivARB(arg0: Long, arg1: Int, arg2: IntArray?, arg3: Int) {
            val obj = state.glObjects[arg0]
            if (arg1 == 35716) {
                val log = when (obj) {
                    is ShaderOrProgram.Program -> gl.getProgramInfoLog(obj.program)
                    is ShaderOrProgram.Shader -> gl.getShaderInfoLog(obj.shader)
                    null -> null
                }
                arg2?.set(arg3, (log?.length ?: 0) + 1)
                return
            }
            val result: Any? = when (obj) {
                is ShaderOrProgram.Program -> gl.getProgramParameter(obj.program, arg1)
                is ShaderOrProgram.Shader -> gl.getShaderParameter(obj.shader, arg1)
                null -> null
            }
            val v = when (result) {
                is Boolean -> if (result) 1 else 0
                is Int -> result
                is Double -> result.toInt()
                else -> 0
            }
            arg2?.set(arg3, v)
        }

        actual fun glGetInfoLogARB(arg0: Long, arg1: Int, arg2: IntArray?, arg3: Int, arg4: ByteArray?, arg5: Int) {
            val log = when (val obj = state.glObjects[arg0]) {
                is ShaderOrProgram.Program -> gl.getProgramInfoLog(obj.program)
                is ShaderOrProgram.Shader -> gl.getShaderInfoLog(obj.shader)
                null -> null
            } ?: ""
            val bytes = log.encodeToByteArray()
            val n = minOf(bytes.size, arg1)
            arg2?.set(arg3, n)
            if (arg4 != null) for (i in 0 until n) arg4[arg5 + i] = bytes[i]
        }

        actual fun glGetProgramivARB(arg0: Int, arg1: Int, arg2: IntArray?, arg3: Int) {
            arg2?.set(arg3, 0)
        }

        actual fun glGetUniformLocationARB(arg0: Long, arg1: String?): Int {
            val program = (state.glObjects[arg0] as? ShaderOrProgram.Program)?.program ?: return -1
            val location = gl.getUniformLocation(program, arg1 ?: "") ?: return -1
            return state.uniforms.allocate(location)
        }

        actual fun glUniform1iARB(arg0: Int, arg1: Int) = gl.uniform1i(state.uniforms[arg0], arg1)
        actual fun glUniform1fARB(arg0: Int, arg1: Float) = gl.uniform1f(state.uniforms[arg0], arg1)
        actual fun glUniform2fARB(arg0: Int, arg1: Float, arg2: Float) = gl.uniform2f(state.uniforms[arg0], arg1, arg2)
        actual fun glUniform3fARB(arg0: Int, arg1: Float, arg2: Float, arg3: Float) = gl.uniform3f(state.uniforms[arg0], arg1, arg2, arg3)
        actual fun glUniform4fARB(arg0: Int, arg1: Float, arg2: Float, arg3: Float, arg4: Float) =
            gl.uniform4f(state.uniforms[arg0], arg1, arg2, arg3, arg4)

        actual fun glUniformMatrix2fvARB(arg0: Int, arg1: Int, arg2: Boolean, arg3: FloatArray?, arg4: Int) =
            gl.uniformMatrix2fv(state.uniforms[arg0], arg2, arg3.slice(arg4, 4 * arg1).asFloat32Array())

        actual fun glUniformMatrix3fvARB(arg0: Int, arg1: Int, arg2: Boolean, arg3: FloatArray?, arg4: Int) =
            gl.uniformMatrix3fv(state.uniforms[arg0], arg2, arg3.slice(arg4, 9 * arg1).asFloat32Array())

        actual fun glUniformMatrix4fvARB(arg0: Int, arg1: Int, arg2: Boolean, arg3: FloatArray?, arg4: Int) =
            gl.uniformMatrix4fv(state.uniforms[arg0], arg2, arg3.slice(arg4, 16 * arg1).asFloat32Array())

        // ---- ARB vertex-program assembly (Phase 5: hand-port pending) --------

        actual fun glGenProgramARB(): Int = state.arbPrograms.allocate("")
        actual fun glDeleteProgramARB(arg0: Int) = state.arbPrograms.release(arg0)
        actual fun glBindProgramARB(arg0: Int, arg1: Int) {}
        actual fun glProgramStringARB(arg0: Int, arg1: Int, arg2: String?) {}
        actual fun glProgramRawARB(arg0: Int, arg1: Int, arg2: ByteArray?) {}
        actual fun glProgramLocalParameter4fARB(arg0: Int, arg1: Int, arg2: Float, arg3: Float, arg4: Float, arg5: Float) {}
        actual fun glProgramLocalParameter4fvARB(arg0: Int, arg1: Int, arg2: FloatArray?, arg3: Int) {}
    }
}
