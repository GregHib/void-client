package jaggl

import awt.Canvas
import lang.Thread
import util.Hashtable
import org.khronos.webgl.Float32Array
import org.khronos.webgl.get
import org.khronos.webgl.set
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
    // Vertex-program assembly is emulated: glProgramRawARB transpiles ARBvp1.0 assembly to
    // GLSL ES 300 (ArbVertexProgramTranspiler) and program-enabled draws route through it.
    "GL_ARB_vertex_program",
)
private val UNSUPPORTED_IN_WEBGL2 = setOf(
    "GL_ARB_fragment_program", "GL_ARB_texture_rectangle",
)

private const val GL_VERTEX_PROGRAM_ARB = 34336
private const val GL_FRAGMENT_PROGRAM_ARB = 34820
private const val GL_PROGRAM_ERROR_POSITION_ARB = 34379
private const val GL_PROGRAM_FORMAT_ASCII_ARB = 34933

private fun fixTarget(target: Int): Int =
    if (target == GL_TEXTURE_1D) WebGL2RenderingContext.TEXTURE_2D else target

private fun IntArray?.slice(offset: Int, count: Int): IntArray {
    val src = this ?: return IntArray(count)
    return IntArray(count) { src[offset + it] }
}

/**
 * Copies [count] elements out of a caller-owned array.
 *
 * **Call this outside `exec`, never inside it.** The client hands these entry points a shared
 * scratch array - `InputStream_Sub2.aFloatArray84`, a single FloatArray(4) that all 32 of
 * OpenGlRenderer's texenv, light, light-model and fog writers take turns filling - and overwrites
 * it immediately afterwards. `exec` defers its body when a display list is being compiled, so a
 * read left inside the lambda samples the array at *replay* time and picks up whichever unrelated
 * writer touched it last.
 *
 * That is not hypothetical: WaterMaterialPass compiles its setup into a display list, and its
 * unit-1 GL_TEXTURE_ENV_COLOR is the water's alpha (COMBINE_ALPHA = REPLACE from GL_CONSTANT) and
 * an additive RGB term. Reading it late made low-detail water take its opacity from the fog colour
 * or, with flickering effects on, from an animating light intensity - water that flickered as the
 * camera moved.
 */
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
        // NOTE: deliberately NOT setting alpha:false here. It looks like a free win (the canvas is
        // usually drawn opaque, so skipping the browser's per-frame alpha-compositing blend should
        // cost nothing) but at least one pass (the minimap) relies on an RGBA drawing buffer
        // (copyTexImage2D(RGBA) from the default framebuffer) - forcing the canvas opaque made it
        // render solid black instead. The compositing problems that alpha:false would solve (sky
        // showing the page, low-alpha water blown out) are handled by [swapBuffers] forcing the
        // presented alpha to 1 instead. Only powerPreference (GPU selection on hybrid-GPU laptops)
        // is safe to request; it doesn't affect pixel/alpha semantics at all.
        // arg1..arg6 mirror the JNI surface request: red/green/blue bits, depth bits, stencil bits
        // and the multisample count from the client's Anti-aliasing option. The JVM gets exactly
        // that pixel format; ask the browser for MSAA only when the client asked for it, otherwise
        // alpha-tested foliage gets coverage-resolved rims the native client never shows.
        val wantAntialias = arg6 > 0
        val contextOptions = js("({powerPreference: 'high-performance'})")
        contextOptions.antialias = wantAntialias
        var context = canvasEl.getContext("webgl2", contextOptions) as? WebGL2RenderingContext
        // Context attributes are fixed once a canvas has a context; a re-init with a different
        // sample count (settings change) needs a fresh canvas to take effect.
        if (context != null && context.getContextAttributes().antialias != wantAntialias) context = null
        if (context == null) {
            context = arg0.replaceWithFreshCanvas().getContext("webgl2", contextOptions) as? WebGL2RenderingContext
        }
        if (context == null) {
            return 0L
        }
        try {
            attribStack.clear()
            // A fresh context starts from GL defaults; the mirror simply starts out unknown.
            resetStateCache()
            viewportX = 0
            viewportY = 0
            viewportW = canvasEl.width
            viewportH = canvasEl.height
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
    /**
     * End of frame. The JVM presents an opaque window surface, so whatever alpha the client leaves
     * in the colour buffer is never seen. The browser composites the canvas *with* its alpha
     * (`alpha:true`, premultiplied), and the client writes alpha it never meant to display: the
     * frame clear is the fog colour with alpha 0, and translucent passes (HD water) leave
     * fractional alpha. The result is compositor dependent: a black sky where the page shows
     * through, and low-alpha water blown out to white by the premultiply. Force alpha to 1 on the
     * default framebuffer before the browser takes the frame so RGB displays exactly as rendered.
     * See [init] for why `alpha:false` is not used instead.
     */
    actual fun swapBuffers() {
        if (peerValue == 0L) return
        presentOpaque()
    }
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
        /**
         * The GL context, with any deferred immediate-mode batch drawn first.
         *
         * ImmediateModeEmulator holds a run of quads back after glEnd so consecutive same-state
         * primitives merge into one draw (see its end()). That is only correct if the batch goes
         * out *before* anything else touches GL, because it has to be drawn under the state it was
         * recorded with. Every gl.* call in this file reads the context through here, so that
         * ordering is structural rather than a list of flush points somebody has to keep complete.
         *
         * The emulator itself holds its own context reference, so flushing from here cannot
         * recurse; it also guards re-entry internally.
         */
        private val gl: WebGL2RenderingContext get() {
            state.immediateMode.flushPending()
            return state.gl
        }

        private const val GL_VIEWPORT_BIT = 0x800

        /** Mirror of the current GL viewport, kept for [glPushAttrib]/[glPopAttrib]. */
        private var viewportX = 0
        private var viewportY = 0
        private var viewportW = 0
        private var viewportH = 0
        private val attribStack = ArrayList<IntArray?>()

        actual val b: Hashtable<Any?, Any?> = Hashtable()

        /**
         * Runs a shim operation, or records it when a display list is being built.
         *
         * Deliberately does *not* drain the pending immediate-mode batch. Flushing here would be
         * the safe blanket rule, but it would also defeat the batching entirely: the per-quad
         * preamble in GlSpriteRenderer is a run of state calls that are all no-ops the second time
         * round (GlTexture.method1957, OpenGlRenderer.method3792/3753/3771/3738 all cache, and the
         * texenv setters are value-gated here), so a blanket flush would fire on every quad
         * without a single GL call having been issued.
         *
         * Draining instead happens at the two points where it is actually needed, and both are
         * structural rather than a list somebody has to keep complete:
         *  - the [gl] accessor, which every real WebGL call in this file goes through;
         *  - the value-gated setters in GlState, which flush on the change path only.
         *
         * What neither covers is shim-side state with no cheap redundancy check - the matrix
         * stack, the ARB program bindings and their local parameters, fog, alpha test. Those flush
         * explicitly at their call sites below, each with a comment saying so.
         */
        private inline fun exec(crossinline op: () -> Unit) {
            if (state.displayLists.isRecording) {
                state.displayLists.record { op() }
            } else {
                op()
            }
        }

        /**
         * Draws any deferred immediate-mode batch. Named for use at the explicit flush points -
         * shim state that has no redundancy check and never reaches WebGL on its own.
         */
        private fun flushBatch() {
            state.immediateMode.flushPending()
        }

        private const val GL_BGRA = 32993
        private const val GL_RGBA = 6408
        private fun fixBgraFormat(format: Int): Int = if (format == GL_BGRA) GL_RGBA else format

        private const val GL_UNSIGNED_INT_8_8_8_8_REV = 33639
        private fun fixPixelType(type: Int): Int =
            if (type == GL_UNSIGNED_INT_8_8_8_8_REV) WebGL2RenderingContext.UNSIGNED_BYTE else type

        private const val GL_RGB = 6407

        private const val GL_COLOR_BUFFER_BIT = 0x4000
        private const val GL_SCISSOR_TEST = 0x0C11
        private const val GL_COLOR_CLEAR_VALUE = 0x0C22
        private const val GL_COLOR_WRITEMASK = 0x0C23
        private const val GL_FRAMEBUFFER = 0x8D40
        private const val GL_FRAMEBUFFER_BINDING = 0x8CA6

        /** Masked clear of the default framebuffer's alpha to 1, leaving every other state as it was. */
        private fun presentOpaque() {
            val gl = gl
            val prevFbo = gl.getParameter(GL_FRAMEBUFFER_BINDING).unsafeCast<WebGLFramebuffer?>()
            if (prevFbo != null) gl.bindFramebuffer(GL_FRAMEBUFFER, null)
            val mask = gl.getParameter(GL_COLOR_WRITEMASK).unsafeCast<Array<Boolean>>()
            val clear = gl.getParameter(GL_COLOR_CLEAR_VALUE).unsafeCast<Float32Array>()
            val scissor = gl.isEnabled(GL_SCISSOR_TEST)
            if (scissor) gl.disable(GL_SCISSOR_TEST)
            gl.colorMask(false, false, false, true)
            gl.clearColor(0f, 0f, 0f, 1f)
            gl.clear(GL_COLOR_BUFFER_BIT)
            gl.colorMask(mask[0], mask[1], mask[2], mask[3])
            gl.clearColor(clear[0], clear[1], clear[2], clear[3])
            if (scissor) gl.enable(GL_SCISSOR_TEST)
            if (prevFbo != null) gl.bindFramebuffer(GL_FRAMEBUFFER, prevFbo)
            // Touched colour mask, clear colour and scissor without going through the mirrors, so
            // the mirror no longer describes GL. Drop it rather than reason about what survived.
            resetStateCache()
        }

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

        actual fun glTexCoord2f(arg0: Float, arg1: Float) = exec {
            state.currentTexCoord[0] = arg0; state.currentTexCoord[1] = arg1; state.currentTexCoord[2] = 0f
        }
        actual fun glTexCoord2i(arg0: Int, arg1: Int) = exec {
            state.currentTexCoord[0] = arg0.toFloat(); state.currentTexCoord[1] = arg1.toFloat()
            state.currentTexCoord[2] = 0f
        }
        actual fun glTexCoord3f(arg0: Float, arg1: Float, arg2: Float) = exec {
            state.currentTexCoord[0] = arg0; state.currentTexCoord[1] = arg1; state.currentTexCoord[2] = arg2
        }
        actual fun glTexCoord3i(arg0: Int, arg1: Int, arg2: Int) = exec {
            state.currentTexCoord[0] = arg0.toFloat(); state.currentTexCoord[1] = arg1.toFloat()
            state.currentTexCoord[2] = arg2.toFloat()
        }

        actual fun glNormal3f(arg0: Float, arg1: Float, arg2: Float) = exec {
            state.currentNormal[0] = arg0; state.currentNormal[1] = arg1; state.currentNormal[2] = arg2
        }

        actual fun glRasterPos2i(arg0: Int, arg1: Int) {
            // Only known call sites are the glCopyPixels(GL_COLOR) copy-to-self pattern below; no-op otherwise.
        }

        // ---- Matrix stack -----------------------------------------------------

        // Matrix state has no cheap redundancy check and is uploaded as a uniform at draw time,
        // so a pending batch has to go out before any of these. This is what stops a run of glyphs
        // batching (each is bracketed by glTranslatef / glLoadIdentity) - correctly so.
        actual fun glMatrixMode(arg0: Int) = exec { flushBatch(); state.matrixStack.mode = arg0 }
        actual fun glLoadIdentity() = exec { flushBatch(); state.matrixStack.loadIdentity() }
        actual fun glLoadMatrixf(arg0: FloatArray?, arg1: Int) {
            val m = arg0.slice(arg1, 16)
            exec {
                flushBatch()
                state.matrixStack.loadMatrix(m)
            }
        }
        actual fun glMultMatrixf(arg0: FloatArray?, arg1: Int) {
            val m = arg0.slice(arg1, 16)
            exec {
                flushBatch()
                state.matrixStack.mult(m)
            }
        }
        actual fun glPushMatrix() = exec { flushBatch(); state.matrixStack.push() }
        actual fun glPopMatrix() = exec { flushBatch(); state.matrixStack.pop() }
        actual fun glTranslatef(arg0: Float, arg1: Float, arg2: Float) = exec { flushBatch(); state.matrixStack.translate(arg0, arg1, arg2) }
        actual fun glScalef(arg0: Float, arg1: Float, arg2: Float) = exec { flushBatch(); state.matrixStack.scale(arg0, arg1, arg2) }
        actual fun glRotatef(arg0: Float, arg1: Float, arg2: Float, arg3: Float) = exec { flushBatch(); state.matrixStack.rotate(arg0, arg1, arg2, arg3) }
        actual fun glOrtho(arg0: Double, arg1: Double, arg2: Double, arg3: Double, arg4: Double, arg5: Double) = exec {
            flushBatch()
            state.matrixStack.ortho(arg0, arg1, arg2, arg3, arg4, arg5)
        }

        actual fun glFrustum(arg0: Double, arg1: Double, arg2: Double, arg3: Double, arg4: Double, arg5: Double) = exec {
            flushBatch()
            state.matrixStack.frustum(arg0, arg1, arg2, arg3, arg4, arg5)
        }

        // ---- Display lists ------------------------------------------------

        actual fun glGenLists(arg0: Int): Int = state.displayLists.genLists(arg0)
        actual fun glDeleteLists(arg0: Int, arg1: Int) = state.displayLists.deleteLists(arg0, arg1)
        actual fun glNewList(arg0: Int, arg1: Int) {
            // Neither of these touches WebGL, so they miss the flush in the `gl` accessor. A batch
            // left pending across a list boundary would otherwise be concatenated with the list's
            // own first primitive when the list is replayed, long after the state it was recorded
            // under has gone.
            state.immediateMode.flushPending()
            state.displayLists.newList(arg0)
        }

        actual fun glEndList() {
            state.immediateMode.flushPending()
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
                GL_VERTEX_PROGRAM_ARB -> if (!state.vertexProgramEnabled) {
                    flushBatch()
                    state.vertexProgramEnabled = true
                }
                // Fragment-program assembly has no WebGL2 emulation; absorb the enable so
                // the caller's enable/disable pairing never produces INVALID_ENUM noise.
                GL_FRAGMENT_PROGRAM_ARB -> {}
                GL_LIGHTING -> state.setLightingEnabled(true)
                WebGL2RenderingContext.TEXTURE_2D, WebGL2RenderingContext.TEXTURE_CUBE_MAP,
                GL_TEXTURE_1D, GL_TEXTURE_3D,
                    -> texturingUnitIndex()?.let {
                        state.setTexturingEnabled(it, true)
                        state.setTextureTarget(it, fixTarget(arg0))
                    }
                GL_TEXTURE_GEN_S, GL_TEXTURE_GEN_T, GL_TEXTURE_GEN_R, GL_TEXTURE_GEN_Q ->
                    texturingUnitIndex()?.let { state.setTexGenEnabled(it, arg0 - GL_TEXTURE_GEN_S, true) }
                GL_FOG -> state.setFogEnabled(true)
                GL_ALPHA_TEST -> state.setAlphaTestEnabled(true)
                in GL_LIGHT0..GL_LIGHT7 -> (arg0 - GL_LIGHT0).let {
                    if (it in 0 until MAX_LIGHTS) state.setLightEnabled(it, true)
                }
                GL_COLOR_MATERIAL, GL_NORMALIZE, GL_MULTISAMPLE -> {
                }
                else -> setCapability(arg0, true)
            }
        }

        actual fun glDisable(arg0: Int) = exec {
            when (arg0) {
                GL_VERTEX_PROGRAM_ARB -> if (state.vertexProgramEnabled) {
                    flushBatch()
                    state.vertexProgramEnabled = false
                }
                GL_FRAGMENT_PROGRAM_ARB -> {}
                GL_LIGHTING -> state.setLightingEnabled(false)
                WebGL2RenderingContext.TEXTURE_2D, WebGL2RenderingContext.TEXTURE_CUBE_MAP,
                GL_TEXTURE_1D, GL_TEXTURE_3D,
                    -> texturingUnitIndex()?.let { state.setTexturingEnabled(it, false) }
                GL_TEXTURE_GEN_S, GL_TEXTURE_GEN_T, GL_TEXTURE_GEN_R, GL_TEXTURE_GEN_Q ->
                    texturingUnitIndex()?.let { state.setTexGenEnabled(it, arg0 - GL_TEXTURE_GEN_S, false) }
                GL_FOG -> state.setFogEnabled(false)
                GL_ALPHA_TEST -> state.setAlphaTestEnabled(false)
                in GL_LIGHT0..GL_LIGHT7 -> (arg0 - GL_LIGHT0).let {
                    if (it in 0 until MAX_LIGHTS) state.setLightEnabled(it, false)
                }
                GL_COLOR_MATERIAL, GL_NORMALIZE, GL_MULTISAMPLE -> {
                }
                else -> setCapability(arg0, false)
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
        /**
         * The client brackets its offscreen passes - the sky cubemap (CubemapTextureGlSource),
         * bloom and glow - with `glPushAttrib(GL_VIEWPORT_BIT)` / `glPopAttrib()` around a
         * `glViewport` of the offscreen target's size, and relies on the pop to put the window
         * viewport back. Nothing else re-issues `glViewport` during normal play, so leaving these
         * as no-ops left the last offscreen viewport (128x128 for the cubemap) latched: the whole
         * frame rendered into that corner of the canvas until a window resize or a display-mode
         * change happened to call `glViewport` again. WebGL2 has no attribute stack, so keep a
         * minimal one here. `GL_VIEWPORT_BIT` is the only bit the client ever pushes; any other
         * mask still pushes a frame so pushes and pops stay balanced.
         */
        actual fun glPushAttrib(arg0: Int) {
            attribStack.add(if (arg0 and GL_VIEWPORT_BIT != 0) intArrayOf(viewportX, viewportY, viewportW, viewportH) else null)
        }

        actual fun glPopAttrib() {
            val saved = attribStack.removeLastOrNull() ?: return
            glViewport(saved[0], saved[1], saved[2], saved[3])
        }

        actual fun glAlphaFunc(arg0: Int, arg1: Float) = exec {
            if (state.alphaFunc == arg0 && state.alphaRef == arg1) return@exec
            flushBatch()
            state.alphaFunc = arg0
            state.alphaRef = arg1
            state.ffpStateDirty = true
        }

        // ---- Mirrored non-programmable GL state ------------------------------------------
        //
        // OpenGlRenderer deliberately re-issues state rather than eliding it (see the "Always
        // re-issue rather than eliding" comments on method3728 / method3729) because a native
        // driver dedupes redundant calls almost for free. WebGL does not: every call is a JS ->
        // browser boundary crossing with validation. With the renderer's own caches gone, this is
        // the only layer left that can see real GL state, so the filtering happens here.
        //
        // Every field below must be invalidated by [resetStateCache] anywhere the shim changes
        // real GL state behind the client's back, and on context creation. [presentOpaque] is the
        // one such place today; it restores what it touched, but it resets the cache anyway
        // rather than relying on that.
        //
        // Every mirror therefore needs a value meaning "unknown", distinct from both settings.
        // Resetting a boolean mirror to `false` does not mean "ask again" - it means "GL is
        // definitely disabled", and the next glDisable for that capability gets elided against a
        // GL that still has it enabled. Since the reset runs once a frame, that left blending and
        // depth writes stuck on from the previous frame: a washed-out scene with geometry in the
        // wrong depth order. Booleans are mirrored as tri-state ints for that reason.

        private const val UNKNOWN = -1
        private const val OFF = 0
        private const val ON = 1

        private fun flagOf(value: Boolean): Int = if (value) ON else OFF

        /** Capabilities whose enable/disable state is mirrored. */
        private val cachedCaps = intArrayOf(
            GL_BLEND, GL_DEPTH_TEST, GL_CULL_FACE, GL_SCISSOR_TEST, GL_STENCIL_TEST,
            GL_POLYGON_OFFSET_FILL,
        )
        private val cachedCapState = IntArray(cachedCaps.size) { UNKNOWN }


        private var blendSrc = UNKNOWN
        private var blendDst = UNKNOWN
        private var depthFunc = UNKNOWN
        private var depthMask = UNKNOWN
        private var cullFace = UNKNOWN
        private var colorMaskR = UNKNOWN
        private var colorMaskG = UNKNOWN
        private var colorMaskB = UNKNOWN
        private var colorMaskA = UNKNOWN
        private var scissorX = UNKNOWN
        private var scissorY = UNKNOWN
        private var scissorW = UNKNOWN
        private var scissorH = UNKNOWN
        private var stencilFunc = UNKNOWN
        private var stencilRef = UNKNOWN
        private var stencilMask = UNKNOWN
        private var stencilFail = UNKNOWN
        private var stencilZFail = UNKNOWN
        private var stencilZPass = UNKNOWN

        /** Drops every mirrored value, so the next call of each kind is issued for real. */
        private fun resetStateCache() {
            for (i in cachedCapState.indices) cachedCapState[i] = UNKNOWN
            blendSrc = UNKNOWN; blendDst = UNKNOWN
            depthFunc = UNKNOWN
            depthMask = UNKNOWN
            cullFace = UNKNOWN
            colorMaskR = UNKNOWN; colorMaskG = UNKNOWN; colorMaskB = UNKNOWN; colorMaskA = UNKNOWN
            scissorX = UNKNOWN; scissorY = UNKNOWN; scissorW = UNKNOWN; scissorH = UNKNOWN
            stencilFunc = UNKNOWN; stencilRef = UNKNOWN; stencilMask = UNKNOWN
            stencilFail = UNKNOWN; stencilZFail = UNKNOWN; stencilZPass = UNKNOWN
        }

        /** Index of [cap] in [cachedCaps], or -1 when it is not mirrored and must pass through. */
        private fun capIndex(cap: Int): Int {
            for (i in cachedCaps.indices) if (cachedCaps[i] == cap) return i
            return -1
        }

        private fun setCapability(cap: Int, enable: Boolean) {
            val index = capIndex(cap)
            if (index >= 0) {
                val wanted = flagOf(enable)
                if (cachedCapState[index] == wanted) return
                cachedCapState[index] = wanted
            }
            if (enable) gl.enable(cap) else gl.disable(cap)
        }

        actual fun glBlendFunc(arg0: Int, arg1: Int) {
            if (blendSrc == arg0 && blendDst == arg1) return
            blendSrc = arg0; blendDst = arg1
            gl.blendFunc(arg0, arg1)
        }

        actual fun glDepthFunc(arg0: Int) {
            if (depthFunc == arg0) return
            depthFunc = arg0
            gl.depthFunc(arg0)
        }

        actual fun glDepthMask(arg0: Boolean) {
            val wanted = flagOf(arg0)
            if (depthMask == wanted) return
            depthMask = wanted
            gl.depthMask(arg0)
        }

        actual fun glCullFace(arg0: Int) {
            if (cullFace == arg0) return
            cullFace = arg0
            gl.cullFace(arg0)
        }

        actual fun glColorMask(arg0: Boolean, arg1: Boolean, arg2: Boolean, arg3: Boolean) {
            val r = flagOf(arg0); val g = flagOf(arg1); val b = flagOf(arg2); val a = flagOf(arg3)
            if (colorMaskR == r && colorMaskG == g && colorMaskB == b && colorMaskA == a) return
            colorMaskR = r; colorMaskG = g; colorMaskB = b; colorMaskA = a
            gl.colorMask(arg0, arg1, arg2, arg3)
        }

        actual fun glScissor(arg0: Int, arg1: Int, arg2: Int, arg3: Int) {
            if (scissorX == arg0 && scissorY == arg1 && scissorW == arg2 && scissorH == arg3) return
            scissorX = arg0; scissorY = arg1; scissorW = arg2; scissorH = arg3
            gl.scissor(arg0, arg1, arg2, arg3)
        }

        actual fun glStencilFunc(arg0: Int, arg1: Int, arg2: Int) {
            if (stencilFunc == arg0 && stencilRef == arg1 && stencilMask == arg2) return
            stencilFunc = arg0; stencilRef = arg1; stencilMask = arg2
            gl.stencilFunc(arg0, arg1, arg2)
        }

        actual fun glStencilOp(arg0: Int, arg1: Int, arg2: Int) {
            if (stencilFail == arg0 && stencilZFail == arg1 && stencilZPass == arg2) return
            stencilFail = arg0; stencilZFail = arg1; stencilZPass = arg2
            gl.stencilOp(arg0, arg1, arg2)
        }

        actual fun glViewport(arg0: Int, arg1: Int, arg2: Int, arg3: Int) {
            viewportX = arg0; viewportY = arg1; viewportW = arg2; viewportH = arg3
            gl.viewport(arg0, arg1, arg2, arg3)
        }
        actual fun glClearColor(arg0: Float, arg1: Float, arg2: Float, arg3: Float) = gl.clearColor(arg0, arg1, arg2, arg3)
        actual fun glClearDepth(arg0: Float) = gl.clearDepth(arg0)
        actual fun glClear(arg0: Int) = gl.clear(arg0)
        actual fun glFinish() = gl.finish()
        actual fun glFlush() = gl.flush()

        actual fun glLightf(arg0: Int, arg1: Int, arg2: Float) = exec {
            val light = arg0 - GL_LIGHT0
            if (light !in 0 until MAX_LIGHTS) return@exec
            when (arg1) {
                GL_CONSTANT_ATTENUATION -> state.setLightScalar(state.lightAttenuation[light], 0, arg2)
                GL_LINEAR_ATTENUATION -> state.setLightScalar(state.lightAttenuation[light], 1, arg2)
                GL_QUADRATIC_ATTENUATION -> state.setLightScalar(state.lightAttenuation[light], 2, arg2)
            }
        }
        actual fun glLightfv(arg0: Int, arg1: Int, arg2: FloatArray?, arg3: Int) {
            val light = arg0 - GL_LIGHT0
            if (light !in 0 until MAX_LIGHTS) return
            val v = arg2.slice(arg3, 4)
            exec {
                when (arg1) {
                    GL_AMBIENT -> state.setLightVector(state.lightAmbient[light], v)
                    GL_DIFFUSE -> state.setLightVector(state.lightDiffuse[light], v)
                    GL_POSITION -> state.setLightVector(state.lightPosition[light], state.transformLightPosition(v))
                }
            }
        }

        actual fun glLightModelfv(arg0: Int, arg1: FloatArray?, arg2: Int) {
            if (arg0 != GL_LIGHT_MODEL_AMBIENT) return
            val ambient = arg1.slice(arg2, 4)
            exec { state.setLightVector(state.globalAmbient, ambient) }
        }

        actual fun glMaterialfv(arg0: Int, arg1: Int, arg2: FloatArray?, arg3: Int) {}

        actual fun glFogf(arg0: Int, arg1: Float) = exec {
            flushBatch()
            state.ffpStateDirty = true
            when (arg0) {
                GL_FOG_START -> state.fogStart = arg1; GL_FOG_END -> state.fogEnd = arg1
            }
        }

        actual fun glFogi(arg0: Int, arg1: Int) {}
        actual fun glFogfv(arg0: Int, arg1: FloatArray?, arg2: Int) {
            val colour = if (arg0 == GL_FOG_COLOR) arg1.slice(arg2, 4) else null
            val scalar = arg1?.getOrNull(arg2)
            exec {
                flushBatch()
                state.ffpStateDirty = true
                when (arg0) {
                    GL_FOG_COLOR -> colour!!.copyInto(state.fogColor)
                    GL_FOG_START -> state.fogStart = scalar ?: state.fogStart
                    GL_FOG_END -> state.fogEnd = scalar ?: state.fogEnd
                }
            }
        }

        actual fun glTexGeni(arg0: Int, arg1: Int, arg2: Int) = exec {
            if (arg1 != GL_TEXTURE_GEN_MODE) return@exec
            if (arg0 !in GL_S..GL_Q) return@exec
            texturingUnitIndex()?.let { state.setTexGenMode(it, arg0 - GL_S, arg2) }
        }

        actual fun glTexGenfv(arg0: Int, arg1: Int, arg2: FloatArray?, arg3: Int) {
            if (arg2 == null || arg0 !in GL_S..GL_Q) return
            if (arg1 != GL_OBJECT_PLANE && arg1 != GL_EYE_PLANE) return
            // Copy now, outside exec - see the note on slice() above.
            val plane = floatArrayOf(arg2[arg3], arg2[arg3 + 1], arg2[arg3 + 2], arg2[arg3 + 3])
            exec {
                val unit = texturingUnitIndex() ?: return@exec
                val coord = arg0 - GL_S
                if (arg1 == GL_OBJECT_PLANE) {
                    state.setTexGenPlane(unit, state.texGenObjectPlane[unit][coord], plane)
                } else {
                    // GL_EYE_PLANE: stored as plane * inverse(modelview at specification time), so
                    // the plane stays fixed in eye space whatever the modelview does afterwards.
                    val inv = Mat4.invert(state.matrixStack.modelview()) ?: Mat4.identity()
                    val eyePlane = FloatArray(4)
                    for (j in 0 until 4) {
                        var sum = 0f
                        for (i in 0 until 4) sum += plane[i] * inv[j * 4 + i]
                        eyePlane[j] = sum
                    }
                    state.setTexGenPlane(unit, state.texGenEyePlane[unit][coord], eyePlane)
                }
            }
        }
        actual fun glTexEnvi(arg0: Int, arg1: Int, arg2: Int) = exec {
            if (arg0 != GL_TEXTURE_ENV) return@exec
            val unit = texturingUnitIndex() ?: return@exec
            when (arg1) {
                GL_COMBINE_RGB -> state.setTexEnvInt(state.combineRgb, unit, arg2)
                GL_COMBINE_ALPHA -> state.setTexEnvInt(state.combineAlpha, unit, arg2)
                GL_SOURCE0_RGB -> state.setTexEnvInt(state.source0Rgb, unit, arg2)
                GL_SOURCE1_RGB -> state.setTexEnvInt(state.source1Rgb, unit, arg2)
                GL_SOURCE2_RGB -> state.setTexEnvInt(state.source2Rgb, unit, arg2)
                GL_OPERAND0_RGB -> state.setTexEnvInt(state.operand0Rgb, unit, arg2)
                GL_OPERAND1_RGB -> state.setTexEnvInt(state.operand1Rgb, unit, arg2)
                GL_OPERAND2_RGB -> state.setTexEnvInt(state.operand2Rgb, unit, arg2)
                GL_SOURCE0_ALPHA -> state.setTexEnvInt(state.source0Alpha, unit, arg2)
                GL_SOURCE1_ALPHA -> state.setTexEnvInt(state.source1Alpha, unit, arg2)
                GL_SOURCE2_ALPHA -> state.setTexEnvInt(state.source2Alpha, unit, arg2)
                GL_OPERAND0_ALPHA -> state.setTexEnvInt(state.operand0Alpha, unit, arg2)
                GL_OPERAND1_ALPHA -> state.setTexEnvInt(state.operand1Alpha, unit, arg2)
                GL_OPERAND2_ALPHA -> state.setTexEnvInt(state.operand2Alpha, unit, arg2)
                GL_RGB_SCALE -> state.setTexEnvFloat(state.rgbScale, unit, arg2.toFloat())
                GL_ALPHA_SCALE -> state.setTexEnvFloat(state.alphaScale, unit, arg2.toFloat())
            }
        }

        actual fun glTexEnvf(arg0: Int, arg1: Int, arg2: Float) = exec {
            if (arg0 != GL_TEXTURE_ENV) return@exec
            val unit = texturingUnitIndex() ?: return@exec
            when (arg1) {
                GL_RGB_SCALE -> state.setTexEnvFloat(state.rgbScale, unit, arg2)
                GL_ALPHA_SCALE -> state.setTexEnvFloat(state.alphaScale, unit, arg2)
            }
        }
        actual fun glTexEnvfv(arg0: Int, arg1: Int, arg2: FloatArray?, arg3: Int) {
            if (arg0 != GL_TEXTURE_ENV || arg1 != GL_TEXTURE_ENV_COLOR) return
            val colour = arg2.slice(arg3, 4)
            exec {
                val unit = texturingUnitIndex() ?: return@exec
                state.setTexEnvVector(unit, state.textureEnvColor[unit], colour)
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

        // texImage2D keeps WebGL1's legacy unsized formats (GL_ALPHA/GL_LUMINANCE/
        // GL_LUMINANCE_ALPHA) working as both internalformat and format for backward
        // compatibility, but texImage3D is a WebGL2-only entry point with no such carve-out:
        // it requires a *sized* internalformat (see sizedInternalFormat) paired with the
        // matching unsized *format* token (GL_RED/GL_RG), not the legacy one. Passing the
        // legacy format straight through (as glTexImage3Dub used to) is an invalid
        // combination for gl.texImage3D and silently fails, leaving the texture data
        // unset.
        private fun unsizedFormatFor3D(format: Int): Int = when (format) {
            6406, 6409 -> WebGL2RenderingContext.RED
            6410 -> WebGL2RenderingContext.RG
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
            // GL_PROGRAM_ERROR_POSITION_ARB is shim-side ARB vertex-program state (not a
            // WebGL enum): the client's compile check (ArbVertexProgram.method3442) reads it.
            if (arg0 == GL_PROGRAM_ERROR_POSITION_ARB) {
                arg1?.set(arg2, state.arbErrorPosition)
                return
            }
            when (val v = gl.getParameter(translatePname(arg0))) {
                is org.khronos.webgl.Int32Array -> for (i in 0 until v.length) arg1?.set(arg2 + i, v.asDynamic()[i] as Int)
                is Int -> arg1?.set(arg2, v)
                is Double -> arg1?.set(arg2, v.toInt())
                is Boolean -> arg1?.set(arg2, if (v) 1 else 0)
                else -> arg1?.set(arg2, 0)
            }
        }

        actual fun glGetFloatv(arg0: Int, arg1: FloatArray?, arg2: Int) {
            // Fixed-function matrix state lives in MatrixStack on the JS shim. WebGL2's
            // getParameter() does not know the legacy matrix pnames (2982/2983/2984) and
            // silently returns null for them, which previously left the caller's array
            // untouched/zeroed - e.g. ParticleSortRenderer's billboard basis vectors were
            // all zero, collapsing every particle quad to a zero-area point.
            when (arg0) {
                GL_MODELVIEW_MATRIX_PNAME -> {
                    val m = state.matrixStack.modelview()
                    for (i in m.indices) arg1?.set(arg2 + i, m[i])
                    return
                }
                GL_PROJECTION_MATRIX_PNAME -> {
                    val m = state.matrixStack.projection()
                    for (i in m.indices) arg1?.set(arg2 + i, m[i])
                    return
                }
                GL_TEXTURE_MATRIX_PNAME -> {
                    val m = state.matrixStack.textureMatrix(state.matrixStack.textureUnit)
                    for (i in m.indices) arg1?.set(arg2 + i, m[i])
                    return
                }
            }
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
                state.textures[id]?.let {
                    // Deleting unbinds the texture everywhere in GL, so drop it from the mirrors
                    // too, or a later bind of whatever replaces it could be deduped against a
                    // binding that no longer exists.
                    state.forgetTexture(it)
                    gl.deleteTexture(it)
                }
                state.textures.release(id)
            }
        }

        actual fun glBindTexture(arg0: Int, arg1: Int) = exec {
            val target = fixTarget(arg0)
            val tex = if (arg1 == 0) null else state.textures[arg1]
            val unit = state.activeTextureUnit
            // Per-unit, per-target bindings are already mirrored for the sampler-unit copies
            // below, so the redundant rebinds the client makes (a sprite rebinds its texture even
            // when it is the same one as the last sprite) can be dropped here.
            val alreadyBound = when (target) {
                WebGL2RenderingContext.TEXTURE_2D -> state.boundTexture2D[unit] === tex
                WebGL2RenderingContext.TEXTURE_CUBE_MAP -> state.boundTextureCubeMap[unit] === tex
                GL_TEXTURE_3D -> state.boundTexture3D[unit] === tex
                else -> false
            }
            if (!alreadyBound) {
                gl.bindTexture(target, tex)
            }
            if (target == WebGL2RenderingContext.TEXTURE_2D) state.boundTexture2D[unit] = tex
            else if (target == WebGL2RenderingContext.TEXTURE_CUBE_MAP) state.boundTextureCubeMap[unit] = tex
            else if (target == GL_TEXTURE_3D) state.boundTexture3D[unit] = tex
            // state.textureTarget (which drives uIs3D/uCubeMap) is otherwise only ever written
            // by glEnable and is sticky - nothing clears it when a unit stops being used for a
            // 3D/cube texture. If any other code path rebinds a plain 2D texture to the same
            // logical unit without an exactly-matching glDisable/glEnable pair, the stale target
            // silently persists and the next draw to reuse that unit (e.g. any other water tile,
            // since they all share this uniform) samples through the wrong sampler. Deriving the
            // target from the actual bind call too makes it self-healing regardless of
            // enable/disable call ordering elsewhere.
            texturingUnitIndex()?.let { state.setTextureTarget(it, target) }
        }

        actual fun glTexParameteri(arg0: Int, arg1: Int, arg2: Int) = gl.texParameteri(fixTarget(arg0), arg1, arg2)
        actual fun glTexParameterf(arg0: Int, arg1: Int, arg2: Float) = gl.texParameterf(fixTarget(arg0), arg1, arg2)
        actual fun glGenerateMipmapEXT(arg0: Int) = gl.generateMipmap(fixTarget(arg0))

        actual fun glActiveTexture(arg0: Int) = exec {
            val unit = arg0 - WebGL2RenderingContext.TEXTURE0
            state.matrixStack.textureUnit = unit
            if (state.activeTextureUnit == unit) return@exec
            state.activeTextureUnit = unit
            gl.activeTexture(arg0)
        }

        actual fun glClientActiveTexture(arg0: Int) {}

        actual fun glMultiTexCoord2f(arg0: Int, arg1: Float, arg2: Float) = exec {
            when (arg0 - WebGL2RenderingContext.TEXTURE0) {
                0 -> {
                    state.currentTexCoord[0] = arg1; state.currentTexCoord[1] = arg2
                    state.currentTexCoord[2] = 0f
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
                    state.currentTexCoord[2] = 0f
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
                    state.currentTexCoord[2] = arg3.toFloat()
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
            if (arg1 == 0) state.recordTextureSize(fixTarget(arg0), arg3, arg4)
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
            if (arg1 == 0) state.recordTextureSize(target, arg3, arg4)
        }

        actual fun glTexImage2Df(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: Int, arg6: Int, arg7: Int, arg8: FloatArray?, arg9: Int) {
            val data = arg8?.asFloat32Array()?.subarray(arg9, arg8.size)
            gl.texImage2D(fixTarget(arg0), arg1, arg2, arg3, arg4, arg5, arg6, arg7, data)
            state.recordTextureInternalFormat(fixTarget(arg0), arg2)
        }

        actual fun glTexImage3Dub(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: Int, arg6: Int, arg7: Int, arg8: Int, arg9: ByteArray?, arg10: Int) {
            val data = arg9?.asUint8Array()?.subarray(arg10, arg9.size)
            val internalformat = sizedInternalFormat(arg2)
            val format = unsizedFormatFor3D(arg7)
            gl.texImage3D(arg0, arg1, internalformat, arg3, arg4, arg5, arg6, format, arg8, data)
        }

        actual fun glTexSubImage2Dub(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: Int, arg6: Int, arg7: Int, arg8: ByteArray?, arg9: Int) {
            val data = arg8?.asUint8Array()?.subarray(arg9, arg8.size)
            gl.texSubImage2D(fixTarget(arg0), arg1, arg2, arg3, arg4, arg5, arg6, arg7, data)
            if (data != null) replicateSpriteEdges(fixTarget(arg0), arg1, arg2, arg3, arg4, arg5, arg6, arg7, data)
        }

        private const val GL_UNPACK_ROW_LENGTH = 0x0CF2
        private const val GL_UNPACK_ALIGNMENT = 0x0CF5
        private const val GL_LUMINANCE_ALPHA = 6410
        private const val GL_LUMINANCE = 6409
        private const val GL_ALPHA = 6406

        private fun bytesPerPixel(format: Int): Int = when (format) {
            GL_RGBA, GL_BGRA -> 4
            GL_RGB -> 3
            GL_LUMINANCE_ALPHA, WebGL2RenderingContext.RG -> 2
            GL_ALPHA, GL_LUMINANCE, WebGL2RenderingContext.RED -> 1
            else -> 0
        }

        /**
         * The client asks for `GL_ARB_texture_rectangle` and, when it is missing (always, on WebGL),
         * pads every sprite up to a power-of-two texture and samples only the sprite's sub-rectangle.
         * Stretched sprites are drawn with LINEAR filtering, so the texels just inside the sprite's
         * right/bottom edge blend with the transparent black padding: a dark seam at the end of any
         * stretched strip (the login button's middle piece, for one). A rectangle texture has no
         * padding to bleed, so give the padding the same content clamp-to-edge would produce:
         * replicate the sprite's last column and row one texel outwards. Only sprites uploaded at
         * the origin into a larger texture qualify, which leaves atlas sub-uploads untouched.
         */
        private fun replicateSpriteEdges(target: Int, level: Int, x: Int, y: Int, w: Int, h: Int, format: Int, type: Int, data: Uint8Array) {
            if (level != 0 || x != 0 || y != 0 || w <= 0 || h <= 0) return
            if (type != WebGL2RenderingContext.UNSIGNED_BYTE) return
            val bpp = bytesPerPixel(format)
            if (bpp == 0) return
            val size = state.textureSize(target) ?: return
            val padRight = w < size[0]
            val padBottom = h < size[1]
            if (!padRight && !padBottom) return
            if (data.length < w * h * bpp) return
            val prevAlign = gl.getParameter(GL_UNPACK_ALIGNMENT).unsafeCast<Int>()
            val prevRowLength = gl.getParameter(GL_UNPACK_ROW_LENGTH).unsafeCast<Int>()
            gl.pixelStorei(GL_UNPACK_ALIGNMENT, 1)
            gl.pixelStorei(GL_UNPACK_ROW_LENGTH, 0)
            if (padRight) {
                val col = Uint8Array(h * bpp)
                for (row in 0 until h) {
                    val src = (row * w + (w - 1)) * bpp
                    for (b in 0 until bpp) col[row * bpp + b] = data[src + b]
                }
                gl.texSubImage2D(target, 0, w, 0, 1, h, format, type, col)
            }
            if (padBottom) {
                val rowW = if (padRight) w + 1 else w
                val rowData = Uint8Array(rowW * bpp)
                val src = (h - 1) * w * bpp
                for (i in 0 until w * bpp) rowData[i] = data[src + i]
                if (padRight) for (b in 0 until bpp) rowData[w * bpp + b] = data[src + (w - 1) * bpp + b]
                gl.texSubImage2D(target, 0, 0, h, rowW, 1, format, type, rowData)
            }
            gl.pixelStorei(GL_UNPACK_ALIGNMENT, prevAlign)
            gl.pixelStorei(GL_UNPACK_ROW_LENGTH, prevRowLength)
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
            if (data is Uint8Array) replicateSpriteEdges(target, arg1, arg2, arg3, arg4, arg5, format, type, data)
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
            if (arg2 == null) {
                gl.bufferData(arg0, arg1, arg4)
                return
            }
            gl.bufferData(arg0, arg2.asUint8Array().subarray(arg3, arg3 + arg1), arg4)
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
                        ATTRIB_TEXCOORD0 -> gl.vertexAttrib3f(
                            loc, state.currentTexCoord[0], state.currentTexCoord[1], state.currentTexCoord[2]
                        )
                        ATTRIB_TEXCOORD1 -> gl.vertexAttrib3f(
                            loc, state.currentTexCoord1[0], state.currentTexCoord1[1], state.currentTexCoord1[2]
                        )
                        ATTRIB_NORMAL -> gl.vertexAttrib3f(loc, state.currentNormal[0], state.currentNormal[1], state.currentNormal[2])
                    }
                }
            }
            // The loop above leaves ARRAY_BUFFER bound to whichever client array came last.
            // glBufferDataARB/glBufferSubDataARB act on the *currently bound* buffer rather than
            // on state.boundArrayBuffer, so the real binding has to be put back - otherwise a
            // later glBufferSubData with no intervening glBindBuffer writes into the wrong buffer.
            gl.bindBuffer(WebGL2RenderingContext.ARRAY_BUFFER, state.boundArrayBuffer)
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
                gl.drawElements(
                    WebGL2RenderingContext.TRIANGLES, indices.length, WebGL2RenderingContext.UNSIGNED_INT, 0
                )
                gl.bindBuffer(WebGL2RenderingContext.ELEMENT_ARRAY_BUFFER, state.boundElementArrayBuffer)
            }
        }

        // Fixed-function matrix *pname* values (as passed to glGetFloatv/glGetIntegerv).
        // These are shim-only state on JS (tracked by MatrixStack); WebGL2 has no such
        // legacy pnames, so gl.getParameter() returns null for them.
        private const val GL_MODELVIEW_MATRIX_PNAME = 2982
        private const val GL_PROJECTION_MATRIX_PNAME = 2983
        private const val GL_TEXTURE_MATRIX_PNAME = 2984

        // Reused/grown across quad draws instead of allocating a fresh boxed ArrayList<Int> (plus a
        // second Uint32Array copy pass) on every GL_QUADS/GL_QUAD_STRIP/GL_POLYGON draw call.
        private var quadIndexScratch = IntArray(0)

        private fun ensureQuadIndexCapacity(required: Int) {
            if (required <= quadIndexScratch.size) return
            var newSize = if (quadIndexScratch.isEmpty()) required else quadIndexScratch.size * 2
            while (newSize < required) newSize *= 2
            quadIndexScratch = IntArray(newSize)
        }

        private fun quadIndices(mode: Int, first: Int, count: Int): Uint32Array? {
            val maxOut = when (mode) {
                GL_QUADS -> count / 4 * 6
                GL_QUAD_STRIP -> if (count >= 4) (count - 2) / 2 * 6 else 0
                GL_POLYGON -> if (count >= 3) (count - 2) * 3 else 0
                else -> return null
            }
            ensureQuadIndexCapacity(maxOut)
            var out = 0
            when (mode) {
                GL_QUADS -> {
                    var i = 0
                    while (i + 4 <= count) {
                        val b = first + i
                        quadIndexScratch[out++] = b; quadIndexScratch[out++] = b + 1; quadIndexScratch[out++] = b + 2
                        quadIndexScratch[out++] = b; quadIndexScratch[out++] = b + 2; quadIndexScratch[out++] = b + 3
                        i += 4
                    }
                }
                GL_QUAD_STRIP -> {
                    var i = 0
                    while (i + 4 <= count) {
                        val b = first + i
                        quadIndexScratch[out++] = b; quadIndexScratch[out++] = b + 1; quadIndexScratch[out++] = b + 3
                        quadIndexScratch[out++] = b; quadIndexScratch[out++] = b + 3; quadIndexScratch[out++] = b + 2
                        i += 2
                    }
                }
                GL_POLYGON -> {
                    for (i in 1..count - 2) {
                        quadIndexScratch[out++] = first; quadIndexScratch[out++] = first + i; quadIndexScratch[out++] = first + i + 1
                    }
                }
            }
            return quadIndexScratch.asUint32ArrayView(out)
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
            state.useProgram(obj?.program)
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
            if (arg1 == GL_PROGRAM_ERROR_POSITION_ARB) {
                arg2?.set(arg3, state.arbErrorPosition)
                return
            }
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

        // ---- ARB vertex-program assembly (transpiled to GLSL ES 300) --------
        // Programs load via glProgramRawARB/glProgramStringARB into the currently bound
        // program handle, transpile at load time, and compile eagerly so that a failure is
        // reported through GL_PROGRAM_ERROR_POSITION_ARB exactly like a driver error.

        actual fun glGenProgramARB(): Int = state.arbPrograms.allocate(ArbProgramRuntime())

        actual fun glDeleteProgramARB(arg0: Int) = exec {
            state.immediateMode.flushPending()
            state.arbPrograms[arg0]?.delete(state.gl)
            state.arbPrograms.release(arg0)
        }

        actual fun glBindProgramARB(arg0: Int, arg1: Int) = exec {
            if (arg0 == GL_VERTEX_PROGRAM_ARB) {
                val program = if (arg1 == 0) null else state.arbPrograms[arg1]
                if (program !== state.boundVertexProgram) {
                    flushBatch()
                    state.boundVertexProgram = program
                }
            }
        }

        actual fun glProgramStringARB(arg0: Int, arg1: Int, arg2: String?) = exec {
            loadArbProgram(arg0, arg1, arg2, 0)
        }

        actual fun glProgramRawARB(arg0: Int, arg1: Int, arg2: ByteArray?) {
            // The assembly is ASCII; strip any NUL padding before transpiling.
            val text = arg2?.decodeToString()?.substringBefore('\u0000')
            exec {
                if (text == null) state.arbErrorPosition = 0
                else loadArbProgram(arg0, arg1, text, 0)
            }
        }

        private fun loadArbProgram(target: Int, format: Int, text: String?, line: Int) {
            // Compiling and linking here binds and unbinds programs through state.gl directly,
            // bypassing the `gl` accessor's flush, so drain any pending batch up front.
            state.immediateMode.flushPending()
            if (target != GL_VERTEX_PROGRAM_ARB) {
                // Fragment-program assembly (34820) has no emulation — fail the load so the
                // caller falls back exactly as it would on unsupported hardware.
                state.arbErrorPosition = if (target == GL_FRAGMENT_PROGRAM_ARB) 0 else line
                return
            }
            if (format != GL_PROGRAM_FORMAT_ASCII_ARB || text.isNullOrEmpty()) {
                state.arbErrorPosition = 0
                return
            }
            val runtime = state.boundVertexProgram
            if (runtime == null) {
                state.arbErrorPosition = 0
                return
            }
            state.arbErrorPosition = -1
            // build() binds the freshly linked program to assign sampler units and then unbinds
            // it, both without going through GlState.useProgram - drop the mirror so the next
            // draw re-binds for real.
            state.forgetBoundProgram()
            if (!runtime.loadSource(state.gl, text, line)) {
                state.arbErrorPosition = runtime.errorLine
            }
        }

        actual fun glProgramLocalParameter4fARB(arg0: Int, arg1: Int, arg2: Float, arg3: Float, arg4: Float, arg5: Float) = exec {
            if (arg0 == GL_VERTEX_PROGRAM_ARB) {
                flushBatch()
                state.boundVertexProgram?.setLocalParameter(arg1, arg2, arg3, arg4, arg5)
            }
        }

        actual fun glProgramLocalParameter4fvARB(arg0: Int, arg1: Int, arg2: FloatArray?, arg3: Int) {
            if (arg0 != GL_VERTEX_PROGRAM_ARB || arg2 == null || arg3 < 0 || arg3 + 4 > arg2.size) return
            val x = arg2[arg3]; val y = arg2[arg3 + 1]; val z = arg2[arg3 + 2]; val w = arg2[arg3 + 3]
            exec {
                flushBatch()
                state.boundVertexProgram?.setLocalParameter(arg1, x, y, z, w)
            }
        }
    }
}
