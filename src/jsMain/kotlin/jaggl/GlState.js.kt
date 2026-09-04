package jaggl

sealed class ShaderOrProgram {
    class Program(val program: WebGLProgram) : ShaderOrProgram() {
        var compat: CompatUniformLocations? = null
        val attachedTypes = mutableSetOf<Int>()
        var hasSyntheticVertexShader = false
    }
    class Shader(val shader: WebGLShader, val type: Int) : ShaderOrProgram()
}

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

    // Per-program dirty tracking for GlState.prepareDraw()'s compat branch. This program has its
    // own independent uniform storage (a separate linked WebGLProgram), so these must live here
    // rather than globally - re-uploads are only skippable against *this* program's last values.
    var lastModelViewVersion = -1
    var lastProjectionVersion = -1
    var lastTextureMatrixVersion = -1
    var lastFogStart = Float.NaN
    var lastFogEnd = Float.NaN
    val lastFogColor = floatArrayOf(Float.NaN, Float.NaN, Float.NaN, Float.NaN)
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

internal const val CUBE_SAMPLER_UNIT = 5

class GlState(val gl: WebGL2RenderingContext) {
    val textures = IntHandleTable<WebGLTexture>()
    val buffers = IntHandleTable<WebGLBuffer>()
    val framebuffers = IntHandleTable<WebGLFramebuffer>()
    val renderbuffers = IntHandleTable<WebGLRenderbuffer>()
    val glObjects = LongHandleTable<ShaderOrProgram>()
    val uniforms = IntHandleTable<WebGLUniformLocation>()
    internal val arbPrograms = IntHandleTable<ArbProgramRuntime>()

    val matrixStack = MatrixStack()
    val displayLists = DisplayListManager()
    lateinit var immediateMode: ImmediateModeEmulator
    lateinit var fixedFunctionShader: FixedFunctionShader

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
    var boundTexture3D = arrayOfNulls<WebGLTexture>(32)
    var boundArrayBuffer: WebGLBuffer? = null
    var boundElementArrayBuffer: WebGLBuffer? = null
    var boundProgram: WebGLProgram? = null
    var boundProgramObj: ShaderOrProgram.Program? = null
    var boundFramebuffer: WebGLFramebuffer? = null
    var readbackFramebuffer: WebGLFramebuffer? = null

    // ARB vertex program state (GL_VERTEX_PROGRAM_ARB = 34336 emulation).
    var vertexProgramEnabled = false
    internal var boundVertexProgram: ArbProgramRuntime? = null
    // GL_PROGRAM_ERROR_POSITION_ARB: -1 means no error after the last program load.
    var arbErrorPosition = -1

    val clientElementBuffer: WebGLBuffer by lazy { gl.createBuffer()!! }

    val quadIndexBuffer: WebGLBuffer by lazy { gl.createBuffer()!! }

    val clientArrays: Map<Int, ClientArrayPointer> = mapOf(
        ATTRIB_POSITION to ClientArrayPointer(),
        ATTRIB_COLOR to ClientArrayPointer(),
        ATTRIB_TEXCOORD0 to ClientArrayPointer(),
        ATTRIB_NORMAL to ClientArrayPointer(),
        ATTRIB_TEXCOORD1 to ClientArrayPointer(),
    )

    var lightingEnabled = false
    var fogEnabled = false
    var alphaTestEnabled = false
    var ffpStateDirty = true
    // Separate from ffpStateDirty: the fixed-function *vertex* lighting uniforms
    // (uLightingEnabled/uGlobalAmbient/uLight*) live only in fixedFunctionShader.program and
    // are never touched by the ARB vertex-program path (which uploads its own uArbLight*
    // uniforms unconditionally every draw). ffpStateDirty, by contrast, is also consumed by
    // uploadFfFragmentUniforms on behalf of whichever program draws next (FF or ARB). Sharing
    // one flag between these meant an ARB draw could silently consume ffpStateDirty and skip
    // the fixed-function lighting re-upload for the rest of that frame - surfacing as
    // terrain/objects flipping between stale and fresh lighting depending on whether a water
    // (ARB) draw happened to run first, i.e. camera-angle/visibility dependent.
    var ffpLightingDirty = true
    val texEnvDirty = booleanArrayOf(true, true, true)
    // The fixed-function fragment stage is shared (by source) between the fixed-function
    // program and every transpiled ARB vertex program, but each is a distinct WebGLProgram
    // with independent uniform storage. texEnvDirty/ffpStateDirty alone would only reach
    // whichever program happens to draw first after a state change; track which program last
    // received the upload so a switch to a different program forces a full re-upload too.
    internal var lastFragUniformProgram: WebGLProgram? = null
    // TexGen state only feeds the fixed-function *vertex* stage (uTexGenMode); kept separate
    // so transpiled-ARB draws can consume texEnvDirty without losing texgen updates.
    val texGenDirty = booleanArrayOf(true, true, true)
    private var lastProjectionVersion = -1
    private val lastTextureMatrixVersion = intArrayOf(-1, -1, -1)

    var alphaFunc = GL_ALWAYS
    var alphaRef = 0f

    val texturingEnabled = booleanArrayOf(false, false, false)
    val textureTarget = IntArray(3) { WebGL2RenderingContext.TEXTURE_2D }
    val texGenEnabled = booleanArrayOf(false, false, false)
    val texGenMode = intArrayOf(0, 0, 0)
    val combineRgb = IntArray(3) { GL_MODULATE }
    val combineAlpha = IntArray(3) { GL_MODULATE }
    val source0Rgb = IntArray(3) { GL_TEXTURE }
    val source1Rgb = IntArray(3) { GL_PREVIOUS }
    val source2Rgb = IntArray(3) { GL_CONSTANT }
    val operand0Rgb = IntArray(3) { GL_SRC_COLOR }
    val operand1Rgb = IntArray(3) { GL_SRC_COLOR }
    val operand2Rgb = IntArray(3) { GL_SRC_ALPHA }
    val source0Alpha = IntArray(3) { GL_TEXTURE }
    val source1Alpha = IntArray(3) { GL_PREVIOUS }
    val source2Alpha = IntArray(3) { GL_CONSTANT }
    val operand0Alpha = IntArray(3) { GL_SRC_ALPHA }
    val operand1Alpha = IntArray(3) { GL_SRC_ALPHA }
    val operand2Alpha = IntArray(3) { GL_SRC_ALPHA }
    val rgbScale = FloatArray(3) { 1f }
    val alphaScale = FloatArray(3) { 1f }
    val textureEnvColor = Array(3) { floatArrayOf(0f, 0f, 0f, 0f) }
    val fogColor = floatArrayOf(0f, 0f, 0f, 1f)
    var fogStart = 0f
    var fogEnd = 1f
    val globalAmbient = floatArrayOf(0.2f, 0.2f, 0.2f, 1f)
    val lightEnabled = BooleanArray(MAX_LIGHTS)
    val lightAmbient = Array(MAX_LIGHTS) { floatArrayOf(0f, 0f, 0f, 1f) }
    val lightDiffuse = Array(MAX_LIGHTS) { floatArrayOf(0f, 0f, 0f, 1f) }
    // xyz = eye-space position (or direction, when w == 0), w mirrors the w passed to
    // glLightfv(GL_POSITION): 0 = directional light, 1 = positional light with attenuation.
    val lightPosition = Array(MAX_LIGHTS) { floatArrayOf(0f, 0f, -1f, 0f) }
    // (constant, linear, quadratic) attenuation factors; GL defaults to (1, 0, 0), i.e. no falloff.
    val lightAttenuation = Array(MAX_LIGHTS) { floatArrayOf(1f, 0f, 0f) }

    val currentColor = floatArrayOf(1f, 1f, 1f, 1f)
    val currentTexCoord = floatArrayOf(0f, 0f)
    val currentTexCoord1 = floatArrayOf(0f, 0f, 0f)
    val currentNormal = floatArrayOf(0f, 0f, 1f)

    fun prepareDraw() {
        val program = boundProgramObj
        if (program == null) {
            // Transpiled ARB vertex program path: the ARB assembly (paired with the shared
            // fixed-function fragment stage) replaces the fixed-function vertex stage.
            val arb = boundVertexProgram
            if (vertexProgramEnabled && arb != null &&
                arb.status == ArbProgramRuntime.Status.OK && arb.useAndUpload(gl, this)
            ) {
                return
            }

            gl.useProgram(fixedFunctionShader.program)
            val s = fixedFunctionShader
            gl.uniformMatrix4fv(s.uModelView, false, matrixStack.modelview().asFloat32Array())

            val projectionVersion = matrixStack.version(GL_PROJECTION)
            if (projectionVersion != lastProjectionVersion) {
                lastProjectionVersion = projectionVersion
                gl.uniformMatrix4fv(s.uProjection, false, matrixStack.projection().asFloat32Array())
            }

            for (unit in 0 until 3) {
                val version = matrixStack.version(GL_TEXTURE_MATRIX, unit)
                if (version == lastTextureMatrixVersion[unit]) continue
                lastTextureMatrixVersion[unit] = version
                val m = matrixStack.textureMatrix(unit).asFloat32Array()
                if (unit == 0) gl.uniformMatrix4fv(s.uTextureMatrix, false, m)
                gl.uniformMatrix4fv(s.uTextureMatrixU[unit], false, m)
            }

            if (ffpLightingDirty) {
                ffpLightingDirty = false
                gl.uniform1i(s.uLightingEnabled, if (lightingEnabled) 1 else 0)
                gl.uniform4fv(s.uGlobalAmbient, globalAmbient.asFloat32Array())
                for (i in 0 until MAX_LIGHTS) {
                    gl.uniform1i(s.uLightEnabled[i], if (lightEnabled[i]) 1 else 0)
                    gl.uniform4fv(s.uLightAmbient[i], lightAmbient[i].asFloat32Array())
                    gl.uniform4fv(s.uLightDiffuse[i], lightDiffuse[i].asFloat32Array())
                    gl.uniform4fv(s.uLightPosition[i], lightPosition[i].asFloat32Array())
                    gl.uniform3fv(s.uLightAttenuation[i], lightAttenuation[i].asFloat32Array())
                }
            }
            val ffpWasDirty = ffpStateDirty

            for (unit in 0 until 3) {
                if (texGenDirty[unit]) {
                    texGenDirty[unit] = false
                    gl.uniform1i(s.uTexGenMode[unit], if (texGenEnabled[unit]) texGenMode[unit] else 0)
                }
            }
            uploadFfFragmentUniforms(gl, this, s.frag, s.program, ffpWasDirty)
            return
        }
        val c = program.compat ?: return
        val mv = matrixStack.modelview()
        val proj = matrixStack.projection()

        val mvVersion = matrixStack.version(GL_MODELVIEW)
        val mvChanged = mvVersion != c.lastModelViewVersion
        if (mvChanged) {
            c.lastModelViewVersion = mvVersion
            gl.uniformMatrix4fv(c.modelView, false, mv.asFloat32Array())
            gl.uniformMatrix3fv(c.normalMatrix, false, upperLeft3x3(mv).asFloat32Array())
        }

        val projVersion = matrixStack.version(GL_PROJECTION)
        val projChanged = projVersion != c.lastProjectionVersion
        if (projChanged) {
            c.lastProjectionVersion = projVersion
            gl.uniformMatrix4fv(c.projection, false, proj.asFloat32Array())
        }

        if (mvChanged || projChanged) {
            gl.uniformMatrix4fv(c.modelViewProjection, false, Mat4.multiply(proj, mv).asFloat32Array())
        }

        val texVersion = matrixStack.version(GL_TEXTURE_MATRIX)
        if (texVersion != c.lastTextureMatrixVersion) {
            c.lastTextureMatrixVersion = texVersion
            gl.uniformMatrix4fv(c.textureMatrix, false, matrixStack.textureMatrix().asFloat32Array())
        }

        if (fogStart != c.lastFogStart || fogEnd != c.lastFogEnd ||
            fogColor[0] != c.lastFogColor[0] || fogColor[1] != c.lastFogColor[1] ||
            fogColor[2] != c.lastFogColor[2] || fogColor[3] != c.lastFogColor[3]
        ) {
            c.lastFogStart = fogStart
            c.lastFogEnd = fogEnd
            c.lastFogColor[0] = fogColor[0]; c.lastFogColor[1] = fogColor[1]
            c.lastFogColor[2] = fogColor[2]; c.lastFogColor[3] = fogColor[3]
            val fogRange = if (fogEnd - fogStart == 0f) 1f else 1f / (fogEnd - fogStart)
            gl.uniform1f(c.fogDensity, 1f)
            gl.uniform1f(c.fogStart, fogStart)
            gl.uniform1f(c.fogEnd, fogEnd)
            gl.uniform1f(c.fogScale, fogRange)
            gl.uniform4fv(c.fogColor, fogColor.asFloat32Array())
        }
    }

    /** Binds [texture] as [target] on a reserved sampler unit, restoring the active unit. */
    fun bindSampler(target: Int, glUnit: Int, texture: WebGLTexture?) {
        gl.activeTexture(WebGL2RenderingContext.TEXTURE0 + glUnit)
        gl.bindTexture(target, texture)
        gl.activeTexture(WebGL2RenderingContext.TEXTURE0 + activeTextureUnit)
    }

    private fun boundTextureFor(target: Int): WebGLTexture? = when {
        target == WebGL2RenderingContext.TEXTURE_2D || target == GL_TEXTURE_1D -> boundTexture2D[activeTextureUnit]
        target == GL_TEXTURE_3D -> boundTexture3D[activeTextureUnit]
        target == WebGL2RenderingContext.TEXTURE_CUBE_MAP || target in 34069..34074 ->
            boundTextureCubeMap[activeTextureUnit]
        else -> null
    }

    fun recordTextureInternalFormat(target: Int, internalformat: Int) {
        boundTextureFor(target)?.asDynamic()?.__jagglInternalFormat = internalformat
    }

    fun textureInternalFormat(target: Int): Int {
        val v = boundTextureFor(target)?.asDynamic()?.__jagglInternalFormat
        return if (v == null || v == undefined) 0 else v as Int
    }

    fun transformLightPosition(v: FloatArray): FloatArray {
        val m = matrixStack.modelview()
        val w = v[3]
        return floatArrayOf(
            m[0] * v[0] + m[4] * v[1] + m[8] * v[2] + m[12] * w,
            m[1] * v[0] + m[5] * v[1] + m[9] * v[2] + m[13] * w,
            m[2] * v[0] + m[6] * v[1] + m[10] * v[2] + m[14] * w,
            w,
        )
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
