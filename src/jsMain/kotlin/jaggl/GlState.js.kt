package jaggl

/** ARB_shader_objects has one "object" namespace for both shaders and programs; mirror that with one table. */
sealed class ShaderOrProgram {
    class Program(val program: WebGLProgram) : ShaderOrProgram() {
        /** Locations for the fixed-function-built-in compatibility uniforms, cached at link time. */
        var compat: CompatUniformLocations? = null
        /** Shader types explicitly attached via glAttachObjectARB/glDetachObjectARB. */
        val attachedTypes = mutableSetOf<Int>()
        /** Whether GlState's synthetic fallback vertex shader was attached to plug a missing vertex stage. */
        var hasSyntheticVertexShader = false
    }
    class Shader(val shader: WebGLShader, val type: Int) : ShaderOrProgram()
}

/** Uniform locations backing the renamed gl_* fixed-function built-ins (see GlslLegacyTranspiler). */
class CompatUniformLocations(gl: WebGL2RenderingContext, program: WebGLProgram) {
    val modelView = gl.getUniformLocation(program, "uModelViewMatrix")
    val projection = gl.getUniformLocation(program, "uProjectionMatrix")
    val modelViewProjection = gl.getUniformLocation(program, "uModelViewProjectionMatrix")
    val normalMatrix = gl.getUniformLocation(program, "uNormalMatrix")
    val textureMatrix = gl.getUniformLocation(program, "uTextureMatrix[0]")
    val fogDensity = gl.getUniformLocation(program, "uFog.density")
    val fogStart = gl.getUniformLocation(program, "uFog.start")
    val fogEnd = gl.getUniformLocation(program, "uFog.end")
    val fogScale = gl.getUniformLocation(program, "uFog.scale")
    val fogColor = gl.getUniformLocation(program, "uFog.color")
}

private const val SYNTHETIC_VERTEX_SOURCE = """
void main() {
    gl_TexCoord[0] = gl_MultiTexCoord0;
    gl_TexCoord[1] = gl_MultiTexCoord1;
    gl_Position = ftransform();
}
"""

class ClientArrayPointer {
    var enabled: Boolean = false
    var size: Int = 4
    var type: Int = WebGL2RenderingContext.FLOAT
    var stride: Int = 0
    var offset: Int = 0
    var normalized: Boolean = false
    var sourceBuffer: WebGLBuffer? = null
}

/** Central GL-emulation state: bound objects, id tables, matrix stack and fixed-function uniforms. */
class GlState(val gl: WebGL2RenderingContext) {
    val textures = IntHandleTable<WebGLTexture>()
    val buffers = IntHandleTable<WebGLBuffer>()
    val framebuffers = IntHandleTable<WebGLFramebuffer>()
    val renderbuffers = IntHandleTable<WebGLRenderbuffer>()
    val glObjects = LongHandleTable<ShaderOrProgram>()
    val uniforms = IntHandleTable<WebGLUniformLocation>()
    /** Raw ARB vertex-program assembly source, keyed by glGenProgramARB id (hand-ported at Phase 5). */
    val arbPrograms = IntHandleTable<String>()

    val matrixStack = MatrixStack()
    val displayLists = DisplayListManager()
    lateinit var immediateMode: ImmediateModeEmulator
    lateinit var fixedFunctionShader: FixedFunctionShader

    /**
     * Desktop GL lets an ARB_shader_objects program link with only a fragment shader attached,
     * falling back to the fixed-function pipeline for vertex processing - several of the game's
     * post-processing shaders (see GlBloomEffect) rely on exactly that. WebGL2 has no fixed-function
     * fallback and refuses to link without an explicit vertex shader, so glLinkProgramARB attaches
     * this shared passthrough (compiled through the same legacy-GLSL translation as hand-written
     * shaders) whenever a program has no vertex stage of its own.
     */
    val syntheticVertexShader: WebGLShader by lazy {
        val shader = gl.createShader(WebGL2RenderingContext.VERTEX_SHADER) ?: error("createShader failed")
        gl.shaderSource(shader, translateLegacyGlsl(SYNTHETIC_VERTEX_SOURCE, WebGL2RenderingContext.VERTEX_SHADER))
        gl.compileShader(shader)
        if (gl.getShaderParameter(shader, WebGL2RenderingContext.COMPILE_STATUS) == false) {
            error("Synthetic fallback vertex shader compile failed: ${gl.getShaderInfoLog(shader)}")
        }
        shader
    }

    var activeTextureUnit = 0
    var boundTexture2D = arrayOfNulls<WebGLTexture>(32)
    var boundTextureCubeMap = arrayOfNulls<WebGLTexture>(32)
    var boundArrayBuffer: WebGLBuffer? = null
    var boundElementArrayBuffer: WebGLBuffer? = null
    var boundProgram: WebGLProgram? = null
    var boundProgramObj: ShaderOrProgram.Program? = null
    var boundFramebuffer: WebGLFramebuffer? = null
    var readbackFramebuffer: WebGLFramebuffer? = null

    /**
     * Desktop GL lets glDrawElements read indices straight out of client (CPU-side) memory when
     * buffer 0 is bound to GL_ELEMENT_ARRAY_BUFFER, treating the trailing pointer argument as a raw
     * address rather than a byte offset - terrain tile rendering (see TextureTileRenderer.method2948)
     * relies on exactly this, rebuilding its index list into plain native-heap memory every frame
     * instead of a real VBO. WebGL2 has no client-side arrays at all; every glDrawElements needs a
     * real bound buffer. This scratch buffer is where that raw index data gets uploaded to on demand.
     */
    val clientElementBuffer: WebGLBuffer by lazy { gl.createBuffer()!! }

    /** Attribute location -> client array pointer, populated by glVertexPointer/glColorPointer/etc. */
    val clientArrays: Map<Int, ClientArrayPointer> = mapOf(
        ATTRIB_POSITION to ClientArrayPointer(),
        ATTRIB_COLOR to ClientArrayPointer(),
        ATTRIB_TEXCOORD0 to ClientArrayPointer(),
        ATTRIB_NORMAL to ClientArrayPointer(),
        ATTRIB_TEXCOORD1 to ClientArrayPointer(),
    )

    // Fixed-function pipeline state, fed into FixedFunctionShader's uniforms.
    var lightingEnabled = false
    var fogEnabled = false
    var alphaTestEnabled = false
    var alphaRef = 0f

    val texturingEnabled = booleanArrayOf(false, false)
    // Defaults match desktop GL's GL_COMBINE defaults (RGB modulate of TEXTURE by PREVIOUS).
    val combineRgb = intArrayOf(GL_MODULATE, GL_MODULATE)
    val combineAlpha = intArrayOf(GL_MODULATE, GL_MODULATE)
    val source0Rgb = intArrayOf(GL_TEXTURE, GL_TEXTURE)
    val source1Rgb = intArrayOf(GL_PREVIOUS, GL_PREVIOUS)
    val source2Rgb = intArrayOf(GL_CONSTANT, GL_CONSTANT)
    val operand0Rgb = intArrayOf(GL_SRC_COLOR, GL_SRC_COLOR)
    val operand1Rgb = intArrayOf(GL_SRC_COLOR, GL_SRC_COLOR)
    val operand2Rgb = intArrayOf(GL_SRC_ALPHA, GL_SRC_ALPHA)
    val textureEnvColor = arrayOf(floatArrayOf(0f, 0f, 0f, 0f), floatArrayOf(0f, 0f, 0f, 0f))
    val fogColor = floatArrayOf(0f, 0f, 0f, 1f)
    var fogStart = 0f
    var fogEnd = 1f
    val globalAmbient = floatArrayOf(0.2f, 0.2f, 0.2f, 1f)
    val light0Ambient = floatArrayOf(0f, 0f, 0f, 1f)
    val light0Diffuse = floatArrayOf(0f, 0f, 0f, 1f)
    val light0Direction = floatArrayOf(0f, 0f, -1f)

    // Immediate-mode "current" attribute values, carried forward onto each glVertex* call.
    val currentColor = floatArrayOf(1f, 1f, 1f, 1f)
    val currentTexCoord = floatArrayOf(0f, 0f)
    val currentTexCoord1 = floatArrayOf(0f, 0f)
    val currentNormal = floatArrayOf(0f, 0f, 1f)

    /**
     * Uploads matrix + fixed-function-state uniforms before each draw: either to the fallback
     * fixed-function shader (no ARB program bound), or to whatever compatibility uniforms
     * (renamed gl_* built-ins - see GlslLegacyTranspiler) the currently-bound ARB program declares.
     */
    fun prepareDraw() {
        val program = boundProgramObj
        if (program == null) {
            gl.useProgram(fixedFunctionShader.program)
            val s = fixedFunctionShader
            gl.uniformMatrix4fv(s.uModelView, false, matrixStack.modelview().asFloat32Array())
            gl.uniformMatrix4fv(s.uProjection, false, matrixStack.projection().asFloat32Array())
            gl.uniformMatrix4fv(s.uTextureMatrix, false, matrixStack.textureMatrix().asFloat32Array())
            gl.uniform1i(s.uLightingEnabled, if (lightingEnabled) 1 else 0)
            gl.uniform4fv(s.uGlobalAmbient, globalAmbient.asFloat32Array())
            gl.uniform4fv(s.uLightAmbient, light0Ambient.asFloat32Array())
            gl.uniform4fv(s.uLightDiffuse, light0Diffuse.asFloat32Array())
            gl.uniform3fv(s.uLightDirection, light0Direction.asFloat32Array())
            gl.uniform1i(s.uUseTexture, if (texturingEnabled[0]) 1 else 0)
            gl.uniform1i(s.uTexture, 0)
            gl.uniform1i(s.uAlphaTestEnabled, if (alphaTestEnabled) 1 else 0)
            gl.uniform1f(s.uAlphaRef, alphaRef)
            gl.uniform1i(s.uFogEnabled, if (fogEnabled) 1 else 0)
            gl.uniform4fv(s.uFogColor, fogColor.asFloat32Array())
            gl.uniform1f(s.uFogStart, fogStart)
            gl.uniform1f(s.uFogEnd, fogEnd)
            gl.uniform1i(s.uCombineRgb, combineRgb[0])
            gl.uniform1i(s.uCombineAlpha, combineAlpha[0])
            gl.uniform1i(s.uSrc0Rgb, source0Rgb[0])
            gl.uniform1i(s.uSrc1Rgb, source1Rgb[0])
            gl.uniform1i(s.uSrc2Rgb, source2Rgb[0])
            gl.uniform1i(s.uOp0Rgb, operand0Rgb[0])
            gl.uniform1i(s.uOp1Rgb, operand1Rgb[0])
            gl.uniform1i(s.uOp2Rgb, operand2Rgb[0])
            gl.uniform4fv(s.uTexEnvColor, textureEnvColor[0].asFloat32Array())

            gl.uniform1i(s.uUseTexture1, if (texturingEnabled[1]) 1 else 0)
            if (texturingEnabled[1]) {
                gl.uniform1i(s.uTexture1, 1)
                gl.uniform1i(s.uCombineRgb1, combineRgb[1])
                gl.uniform1i(s.uCombineAlpha1, combineAlpha[1])
                gl.uniform1i(s.uSrc0Rgb1, source0Rgb[1])
                gl.uniform1i(s.uSrc1Rgb1, source1Rgb[1])
                gl.uniform1i(s.uSrc2Rgb1, source2Rgb[1])
                gl.uniform1i(s.uOp0Rgb1, operand0Rgb[1])
                gl.uniform1i(s.uOp1Rgb1, operand1Rgb[1])
                gl.uniform1i(s.uOp2Rgb1, operand2Rgb[1])
                gl.uniform4fv(s.uTexEnvColor1, textureEnvColor[1].asFloat32Array())
            }
            return
        }
        val c = program.compat ?: return
        val mv = matrixStack.modelview()
        val proj = matrixStack.projection()
        gl.uniformMatrix4fv(c.modelView, false, mv.asFloat32Array())
        gl.uniformMatrix4fv(c.projection, false, proj.asFloat32Array())
        gl.uniformMatrix4fv(c.modelViewProjection, false, Mat4.multiply(proj, mv).asFloat32Array())
        gl.uniformMatrix3fv(c.normalMatrix, false, upperLeft3x3(mv).asFloat32Array())
        gl.uniformMatrix4fv(c.textureMatrix, false, matrixStack.textureMatrix().asFloat32Array())
        val fogRange = if (fogEnd - fogStart == 0f) 1f else 1f / (fogEnd - fogStart)
        gl.uniform1f(c.fogDensity, 1f)
        gl.uniform1f(c.fogStart, fogStart)
        gl.uniform1f(c.fogEnd, fogEnd)
        gl.uniform1f(c.fogScale, fogRange)
        gl.uniform4fv(c.fogColor, fogColor.asFloat32Array())
    }

    private fun upperLeft3x3(m: FloatArray): FloatArray = floatArrayOf(
        m[0], m[1], m[2],
        m[4], m[5], m[6],
        m[8], m[9], m[10],
    )

    fun readbackFbo(): WebGLFramebuffer {
        var fbo = readbackFramebuffer
        if (fbo == null) {
            fbo = gl.createFramebuffer()!!
            readbackFramebuffer = fbo
        }
        return fbo
    }
}
