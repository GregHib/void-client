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
    val arbPrograms = IntHandleTable<String>()

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
    var boundArrayBuffer: WebGLBuffer? = null
    var boundElementArrayBuffer: WebGLBuffer? = null
    var boundProgram: WebGLProgram? = null
    var boundProgramObj: ShaderOrProgram.Program? = null
    var boundFramebuffer: WebGLFramebuffer? = null
    var readbackFramebuffer: WebGLFramebuffer? = null

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
    val texEnvDirty = booleanArrayOf(true, true, true)
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
    val lightEnabled = booleanArrayOf(false, false)
    val lightAmbient = arrayOf(floatArrayOf(0f, 0f, 0f, 1f), floatArrayOf(0f, 0f, 0f, 1f))
    val lightDiffuse = arrayOf(floatArrayOf(0f, 0f, 0f, 1f), floatArrayOf(0f, 0f, 0f, 1f))
    val lightDirection = arrayOf(floatArrayOf(0f, 0f, -1f), floatArrayOf(0f, 0f, -1f))

    val currentColor = floatArrayOf(1f, 1f, 1f, 1f)
    val currentTexCoord = floatArrayOf(0f, 0f)
    val currentTexCoord1 = floatArrayOf(0f, 0f, 0f)
    val currentNormal = floatArrayOf(0f, 0f, 1f)

    fun prepareDraw() {
        val program = boundProgramObj
        if (program == null) {
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

            if (ffpStateDirty) {
                ffpStateDirty = false
                gl.uniform1i(s.uLightingEnabled, if (lightingEnabled) 1 else 0)
                gl.uniform4fv(s.uGlobalAmbient, globalAmbient.asFloat32Array())
                for (i in 0 until 2) {
                    gl.uniform1i(s.uLightEnabled[i], if (lightEnabled[i]) 1 else 0)
                    gl.uniform4fv(s.uLightAmbient[i], lightAmbient[i].asFloat32Array())
                    gl.uniform4fv(s.uLightDiffuse[i], lightDiffuse[i].asFloat32Array())
                    gl.uniform3fv(s.uLightDirection[i], lightDirection[i].asFloat32Array())
                }
                gl.uniform1i(s.uAlphaTestEnabled, if (alphaTestEnabled) 1 else 0)
                gl.uniform1i(s.uAlphaFunc, alphaFunc)
                gl.uniform1f(s.uAlphaRef, alphaRef)
                gl.uniform1i(s.uFogEnabled, if (fogEnabled) 1 else 0)
                gl.uniform4fv(s.uFogColor, fogColor.asFloat32Array())
                gl.uniform1f(s.uFogStart, fogStart)
                gl.uniform1f(s.uFogEnd, fogEnd)
            }

            for (unit in 0 until 3) {
                val cube = textureTarget[unit] == GL_TEXTURE_CUBE_MAP
                if (texEnvDirty[unit]) {
                    texEnvDirty[unit] = false
                    gl.uniform1i(s.uTexGenMode[unit], if (texGenEnabled[unit]) texGenMode[unit] else 0)
                    gl.uniform1i(s.uUseTexture[unit], if (texturingEnabled[unit]) 1 else 0)
                    gl.uniform1i(s.uCubeMap[unit], if (cube) 1 else 0)
                    if (texturingEnabled[unit]) uploadCombine(s, unit)
                }
                if (unit > 0 && texturingEnabled[unit] && cube) {
                    bindCubeSampler(CUBE_SAMPLER_UNIT + unit, boundTextureCubeMap[unit])
                }
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

    private fun bindCubeSampler(glUnit: Int, texture: WebGLTexture?) {
        gl.activeTexture(WebGL2RenderingContext.TEXTURE0 + glUnit)
        gl.bindTexture(GL_TEXTURE_CUBE_MAP, texture)
        gl.activeTexture(WebGL2RenderingContext.TEXTURE0 + activeTextureUnit)
    }

    private fun uploadCombine(s: FixedFunctionShader, unit: Int) {
        gl.uniform1i(s.uCombineRgb[unit], combineRgb[unit])
        gl.uniform1i(s.uCombineAlpha[unit], combineAlpha[unit])
        gl.uniform3i(s.uSrcRgb[unit], source0Rgb[unit], source1Rgb[unit], source2Rgb[unit])
        gl.uniform3i(s.uOpRgb[unit], operand0Rgb[unit], operand1Rgb[unit], operand2Rgb[unit])
        gl.uniform3i(s.uSrcAlpha[unit], source0Alpha[unit], source1Alpha[unit], source2Alpha[unit])
        gl.uniform3i(s.uOpAlpha[unit], operand0Alpha[unit], operand1Alpha[unit], operand2Alpha[unit])
        gl.uniform4fv(s.uTexEnvColor[unit], textureEnvColor[unit].asFloat32Array())
        gl.uniform2f(s.uEnvScale[unit], rgbScale[unit], alphaScale[unit])
    }

    private fun boundTextureFor(target: Int): WebGLTexture? = when {
        target == WebGL2RenderingContext.TEXTURE_2D -> boundTexture2D[activeTextureUnit]
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
