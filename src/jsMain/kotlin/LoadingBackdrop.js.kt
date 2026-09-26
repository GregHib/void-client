import jaggl.OpenGL
import jaggl.WebGL2RenderingContext
import jaggl.WebGLProgram
import jaggl.WebGLTexture

// Raw GL enums not exposed as constants by the WebGL2 bindings.
private const val GL_TEXTURE_2D = 0x0DE1
private const val GL_TEXTURE0 = 0x84C0
private const val GL_RGBA = 0x1908
private const val GL_NEAREST = 0x2600
private const val GL_CLAMP_TO_EDGE = 0x812F
private const val GL_TEXTURE_MAG_FILTER = 0x2800
private const val GL_TEXTURE_MIN_FILTER = 0x2801
private const val GL_TEXTURE_WRAP_S = 0x2802
private const val GL_TEXTURE_WRAP_T = 0x2803
private const val GL_TRIANGLES = 0x0004
private const val GL_READ_FRAMEBUFFER = 0x8CA8
private const val GL_DRAW_FRAMEBUFFER = 0x8CA9
private const val GL_READ_FRAMEBUFFER_BINDING = 0x8CAA
private const val GL_DRAW_FRAMEBUFFER_BINDING = 0x8CA6
private const val GL_ACTIVE_TEXTURE = 0x84E0
private const val GL_TEXTURE_BINDING_2D = 0x8069
private const val GL_SAMPLER_BINDING = 0x8919
private const val GL_CURRENT_PROGRAM = 0x8B8D
private const val GL_VERTEX_ARRAY_BINDING = 0x85B5
private const val GL_VIEWPORT = 0x0BA2
private const val GL_COLOR_WRITEMASK = 0x0C23
private val CAPS_OFF = intArrayOf(
    0x0C11, // SCISSOR_TEST
    0x0BE2, // BLEND
    0x0B71, // DEPTH_TEST
    0x0B44, // CULL_FACE
    0x0B90, // STENCIL_TEST
    0x809E, // SAMPLE_ALPHA_TO_COVERAGE
    0x80A0, // SAMPLE_COVERAGE
    0x8C89, // RASTERIZER_DISCARD
)

private const val VERTEX_SOURCE = """#version 300 es
out vec2 vUv;
void main() {
    // One triangle covering the viewport: (0,0), (2,0), (0,2) in UV space.
    vec2 p = vec2(float((gl_VertexID << 1) & 2), float(gl_VertexID & 2));
    vUv = p;
    gl_Position = vec4(p * 2.0 - 1.0, 0.0, 1.0);
}
"""

private const val FRAGMENT_SOURCE = """#version 300 es
precision mediump float;
uniform sampler2D uFrame;
in vec2 vUv;
out vec4 outColor;
void main() {
    outColor = vec4(texture(uFrame, vUv).rgb, 1.0);
}
"""

/** Everything below belongs to [context]; a re-initialised GL context makes it stale. */
private var context: WebGL2RenderingContext? = null
private var frame: WebGLTexture? = null
private var program: WebGLProgram? = null
private var emptyVao: dynamic = null

/**
 * Runs [block] with the default framebuffer bound and texture unit 0 free, then puts back every
 * binding and capability it may have changed. The client's GlState caches bindings, so they must
 * come back exactly as they were rather than to whatever the cache believes.
 */
private inline fun withIsolatedState(gl: WebGL2RenderingContext, block: () -> Unit) {
    val g = gl.asDynamic()
    val readFbo = gl.getParameter(GL_READ_FRAMEBUFFER_BINDING)
    val drawFbo = gl.getParameter(GL_DRAW_FRAMEBUFFER_BINDING)
    val activeTexture = gl.getParameter(GL_ACTIVE_TEXTURE) as Int
    gl.activeTexture(GL_TEXTURE0)
    val texture0 = gl.getParameter(GL_TEXTURE_BINDING_2D)
    val sampler0 = gl.getParameter(GL_SAMPLER_BINDING)
    val currentProgram = gl.getParameter(GL_CURRENT_PROGRAM)
    val vao = gl.getParameter(GL_VERTEX_ARRAY_BINDING)
    val viewport = gl.getParameter(GL_VIEWPORT).asDynamic()
    val colorMask = gl.getParameter(GL_COLOR_WRITEMASK).unsafeCast<Array<Boolean>>()
    val capsEnabled = BooleanArray(CAPS_OFF.size) { gl.isEnabled(CAPS_OFF[it]) }
    try {
        g.bindFramebuffer(GL_READ_FRAMEBUFFER, null)
        g.bindFramebuffer(GL_DRAW_FRAMEBUFFER, null)
        g.bindSampler(0, null)
        for (cap in CAPS_OFF) gl.disable(cap)
        gl.colorMask(true, true, true, true)
        block()
    } finally {
        for (i in CAPS_OFF.indices) if (capsEnabled[i]) gl.enable(CAPS_OFF[i])
        gl.colorMask(colorMask[0], colorMask[1], colorMask[2], colorMask[3])
        gl.viewport(viewport[0] as Int, viewport[1] as Int, viewport[2] as Int, viewport[3] as Int)
        g.bindVertexArray(vao)
        g.useProgram(currentProgram)
        g.bindSampler(0, sampler0)
        g.bindTexture(GL_TEXTURE_2D, texture0)
        gl.activeTexture(activeTexture)
        g.bindFramebuffer(GL_READ_FRAMEBUFFER, readFbo)
        g.bindFramebuffer(GL_DRAW_FRAMEBUFFER, drawFbo)
    }
}

private fun currentContext(): WebGL2RenderingContext? {
    val gl = OpenGL.contextOrNull ?: return null
    if (gl !== context) {
        // New context: anything created on the old one is unusable.
        frame = null
        program = null
        emptyVao = null
        context = gl
    }
    return gl
}

private fun compile(gl: WebGL2RenderingContext, type: Int, source: String): dynamic {
    val shader = gl.createShader(type) ?: return null
    gl.shaderSource(shader, source)
    gl.compileShader(shader)
    if (gl.getShaderParameter(shader, WebGL2RenderingContext.COMPILE_STATUS) == false) {
        console.error("Loading backdrop shader failed: ${gl.getShaderInfoLog(shader)}")
        gl.deleteShader(shader)
        return null
    }
    return shader
}

private fun ensureProgram(gl: WebGL2RenderingContext): WebGLProgram? {
    program?.let { return it }
    val vs = compile(gl, WebGL2RenderingContext.VERTEX_SHADER, VERTEX_SOURCE) ?: return null
    val fs = compile(gl, WebGL2RenderingContext.FRAGMENT_SHADER, FRAGMENT_SOURCE) ?: return null
    val p = gl.createProgram() ?: return null
    gl.attachShader(p, vs)
    gl.attachShader(p, fs)
    gl.linkProgram(p)
    gl.deleteShader(vs)
    gl.deleteShader(fs)
    if (gl.getProgramParameter(p, WebGL2RenderingContext.LINK_STATUS) == false) {
        console.error("Loading backdrop program failed: ${gl.getProgramInfoLog(p)}")
        gl.deleteProgram(p)
        return null
    }
    // uFrame defaults to texture unit 0, which is what draw() binds.
    program = p
    emptyVao = gl.asDynamic().createVertexArray()
    return p
}

actual fun captureLoadingBackdrop(drawFrame: () -> Unit) {
    val gl = currentContext() ?: return
    releaseLoadingBackdrop()
    try {
        drawFrame()
    } catch (t: Throwable) {
        // Losing the backdrop only costs the black background; never let it break the load.
        console.error("Loading backdrop frame failed", t)
        return
    }
    withIsolatedState(gl) {
        val g = gl.asDynamic()
        val width = g.drawingBufferWidth as Int
        val height = g.drawingBufferHeight as Int
        val texture = gl.createTexture() ?: return@withIsolatedState
        gl.bindTexture(GL_TEXTURE_2D, texture)
        gl.texParameteri(GL_TEXTURE_2D, GL_TEXTURE_MIN_FILTER, GL_NEAREST)
        gl.texParameteri(GL_TEXTURE_2D, GL_TEXTURE_MAG_FILTER, GL_NEAREST)
        gl.texParameteri(GL_TEXTURE_2D, GL_TEXTURE_WRAP_S, GL_CLAMP_TO_EDGE)
        gl.texParameteri(GL_TEXTURE_2D, GL_TEXTURE_WRAP_T, GL_CLAMP_TO_EDGE)
        // Reads the (resolved, if antialiased) default framebuffer, as the minimap pass does.
        gl.copyTexImage2D(GL_TEXTURE_2D, 0, GL_RGBA, 0, 0, width, height, 0)
        frame = texture
    }
}

actual fun drawLoadingBackdrop() {
    val gl = currentContext() ?: return
    val texture = frame ?: return
    val p = ensureProgram(gl) ?: return
    withIsolatedState(gl) {
        val g = gl.asDynamic()
        gl.viewport(0, 0, g.drawingBufferWidth as Int, g.drawingBufferHeight as Int)
        gl.useProgram(p)
        g.bindVertexArray(emptyVao)
        gl.bindTexture(GL_TEXTURE_2D, texture)
        gl.drawArrays(GL_TRIANGLES, 0, 3)
    }
}

actual fun releaseLoadingBackdrop() {
    val texture = frame ?: return
    frame = null
    // Only delete on the context that created it; a replaced context already dropped it.
    if (OpenGL.contextOrNull === context) context?.deleteTexture(texture)
}
