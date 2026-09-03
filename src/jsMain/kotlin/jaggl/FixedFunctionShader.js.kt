package jaggl

const val ATTRIB_POSITION = 0
const val ATTRIB_COLOR = 1
const val ATTRIB_TEXCOORD0 = 2
const val ATTRIB_NORMAL = 3
const val ATTRIB_TEXCOORD1 = 4

private const val VERTEX_SOURCE = """#version 300 es
layout(location = 0) in vec4 aPosition;
layout(location = 1) in vec4 aColor;
layout(location = 2) in vec2 aTexCoord0;
layout(location = 3) in vec3 aNormal;
layout(location = 4) in vec3 aTexCoord1;

uniform mat4 uModelView;
uniform mat4 uProjection;
uniform mat4 uTextureMatrix;
uniform mat4 uTextureMatrixU[3];
uniform highp int uTexGenMode[3];
uniform bool uLightingEnabled;
uniform vec4 uGlobalAmbient;
uniform bool uLightEnabled[$MAX_LIGHTS];
uniform vec4 uLightAmbient[$MAX_LIGHTS];
uniform vec4 uLightDiffuse[$MAX_LIGHTS];
// xyz = eye-space position (or direction when w == 0), w == 1 means positional with attenuation.
uniform vec4 uLightPosition[$MAX_LIGHTS];
uniform vec3 uLightAttenuation[$MAX_LIGHTS];

out vec4 vColor;
out vec3 vTexCoord0;
out vec3 vTexCoord1;
out vec3 vTexCoord2;

// Transpiled ARB_position_invariant vertex programs (water, ground shader, fog pass) must
// reproduce this exact transform bit-for-bit so their geometry doesn't z-fight against
// fixed-function-rendered geometry at the same world position - see the matching invariant
// declaration and comment in ArbVertexProgramTranspiler.buildGlsl().
invariant gl_Position;

void main() {
    vec4 viewPos = uModelView * aPosition;
    gl_Position = uProjection * viewPos;

    vec3 rawEyeNormal = mat3(uModelView) * aNormal;
    float eyeNormalLenSq = dot(rawEyeNormal, rawEyeNormal);
    vec3 eyeNormal = eyeNormalLenSq > 0.0 ? rawEyeNormal * inversesqrt(eyeNormalLenSq) : vec3(0.0);

    if (uLightingEnabled) {
        vec4 lit = uGlobalAmbient;
        for (int i = 0; i < $MAX_LIGHTS; i++) {
            if (uLightEnabled[i]) {
                vec3 lightDir;
                float atten = 1.0;
                if (uLightPosition[i].w == 0.0) {
                    lightDir = normalize(uLightPosition[i].xyz);
                } else {
                    vec3 toLight = uLightPosition[i].xyz - viewPos.xyz;
                    float dist = length(toLight);
                    lightDir = toLight / max(dist, 0.0001);
                    vec3 k = uLightAttenuation[i];
                    atten = 1.0 / max(k.x + k.y * dist + k.z * dist * dist, 0.0001);
                }
                float diff = max(dot(rawEyeNormal, lightDir), 0.0);
                lit += (uLightAmbient[i] + uLightDiffuse[i] * diff) * atten;
            }
        }
        vColor = vec4(clamp(aColor.rgb * lit.rgb, 0.0, 1.0), aColor.a);
    } else {
        vColor = aColor;
    }

    vTexCoord0 = (uTextureMatrix * vec4(aTexCoord0, 0.0, 1.0)).xyz;

    vec3 reflected = reflect(normalize(viewPos.xyz), eyeNormal);
    for (int i = 1; i < 3; i++) {
        vec4 gen;
        if (uTexGenMode[i] == 34065) {
            gen = vec4(eyeNormal, 1.0);
        } else if (uTexGenMode[i] == 34066) {
            gen = vec4(reflected, 1.0);
        } else if (uTexGenMode[i] == 9218) {
            float m = 2.0 * sqrt(reflected.x * reflected.x + reflected.y * reflected.y +
                                 (reflected.z + 1.0) * (reflected.z + 1.0));
            gen = vec4(reflected.x / m + 0.5, reflected.y / m + 0.5, 0.0, 1.0);
        } else {
            gen = vec4(aTexCoord1, 1.0);
        }
        vec3 coord = (uTextureMatrixU[i] * gen).xyz;
        if (i == 1) vTexCoord1 = coord; else vTexCoord2 = coord;
    }
}
"""

private const val FRAGMENT_SOURCE = """#version 300 es
precision mediump float;
precision highp sampler3D;

in vec4 vColor;
in vec3 vTexCoord0;
in vec3 vTexCoord1;
in vec3 vTexCoord2;
out vec4 fragColor;

uniform bool uUseTexture[3];
uniform bool uCubeMap[3];
uniform int uIs3D[3];
uniform sampler2D uTexture0;
uniform sampler2D uTexture1;
uniform sampler2D uTexture2;
uniform sampler3D uTexture3D0;
uniform sampler3D uTexture3D1;
uniform sampler3D uTexture3D2;
uniform samplerCube uTextureCube1;
uniform samplerCube uTextureCube2;
uniform bool uAlphaTestEnabled;
uniform int uAlphaFunc;
uniform float uAlphaRef;
uniform bool uFogEnabled;
uniform vec4 uFogColor;
uniform float uFogStart;
uniform float uFogEnd;

uniform int uCombineRgb[3];
uniform int uCombineAlpha[3];
uniform ivec3 uSrcRgb[3];
uniform ivec3 uOpRgb[3];
uniform ivec3 uSrcAlpha[3];
uniform ivec3 uOpAlpha[3];
uniform vec4 uTexEnvColor[3];
uniform vec2 uEnvScale[3];

vec4 combineSource(int src, vec4 texColor, vec4 previous, vec4 constant) {
    if (src == 34166) return constant;
    if (src == 5890) return texColor;
    if (src == 34167) return vColor;
    return previous;
}

vec3 applyOperand(int op, vec4 c) {
    if (op == 769) return vec3(1.0) - c.rgb;
    if (op == 770) return vec3(c.a);
    if (op == 771) return vec3(1.0 - c.a);
    return c.rgb;
}

float applyOperandAlpha(int op, vec4 c) {
    if (op == 771) return 1.0 - c.a;
    return c.a;
}

vec4 combineStage(int stage, vec4 texColor, vec4 previous) {
    vec4 constant = uTexEnvColor[stage];
    ivec3 srcRgb = uSrcRgb[stage];
    ivec3 opRgb = uOpRgb[stage];
    ivec3 srcAlpha = uSrcAlpha[stage];
    ivec3 opAlpha = uOpAlpha[stage];

    vec3 arg0 = applyOperand(opRgb.x, combineSource(srcRgb.x, texColor, previous, constant));
    vec3 arg1 = applyOperand(opRgb.y, combineSource(srcRgb.y, texColor, previous, constant));
    int combineRgb = uCombineRgb[stage];
    vec3 rgb;
    if (combineRgb == 7681) rgb = arg0;
    else if (combineRgb == 260) rgb = arg0 + arg1;
    else if (combineRgb == 34023) rgb = arg0 - arg1;
    else if (combineRgb == 34164) rgb = arg0 + arg1 - vec3(0.5);
    else if (combineRgb == 34165) {
        vec3 arg2 = applyOperand(opRgb.z, combineSource(srcRgb.z, texColor, previous, constant));
        rgb = arg0 * arg2 + arg1 * (vec3(1.0) - arg2);
    } else rgb = arg0 * arg1;

    float a0 = applyOperandAlpha(opAlpha.x, combineSource(srcAlpha.x, texColor, previous, constant));
    float a1 = applyOperandAlpha(opAlpha.y, combineSource(srcAlpha.y, texColor, previous, constant));
    int combineAlpha = uCombineAlpha[stage];
    float alpha;
    if (combineAlpha == 7681) alpha = a0;
    else if (combineAlpha == 260) alpha = a0 + a1;
    else if (combineAlpha == 34023) alpha = a0 - a1;
    else if (combineAlpha == 34164) alpha = a0 + a1 - 0.5;
    else if (combineAlpha == 34165) {
        float a2 = applyOperandAlpha(opAlpha.z, combineSource(srcAlpha.z, texColor, previous, constant));
        alpha = a0 * a2 + a1 * (1.0 - a2);
    } else alpha = a0 * a1;

    vec2 scale = uEnvScale[stage];
    return vec4(clamp(rgb * scale.x, 0.0, 1.0), clamp(alpha * scale.y, 0.0, 1.0));
}

bool alphaTestPasses(float a) {
    if (uAlphaFunc == 512) return false;
    if (uAlphaFunc == 513) return a < uAlphaRef;
    if (uAlphaFunc == 514) return a == uAlphaRef;
    if (uAlphaFunc == 515) return a <= uAlphaRef;
    if (uAlphaFunc == 516) return a > uAlphaRef;
    if (uAlphaFunc == 517) return a != uAlphaRef;
    if (uAlphaFunc == 518) return a >= uAlphaRef;
    return true;
}

// The client's 3D textures (animated water normal/detail maps) are authored as
// GL_LUMINANCE_ALPHA: one channel of intensity meant to be read back as (L,L,L,A). WebGL2's
// texImage3D has no legacy-format path, so the shim uploads them as RG8 (R=luminance,
// G=alpha) instead - reconstruct the original (L,L,L,A) reading here rather than exposing
// WebGL's native (R,G,0,1) layout to the combine stage.
vec4 sampleLuminanceAlpha3D(sampler3D s, vec3 coord) {
    vec2 t = texture(s, coord).rg;
    return vec4(t.r, t.r, t.r, t.g);
}

vec4 sampleUnit(int unit) {
    // 3D textures (the animated water normal map) are sampled with the texcoord's full vec3;
    // the animated slice coordinate r arrives through the per-unit texture matrix.
    if (unit == 0) {
        if (uIs3D[0] != 0) return sampleLuminanceAlpha3D(uTexture3D0, vTexCoord0);
        return texture(uTexture0, vTexCoord0.xy);
    }
    if (unit == 1) {
        if (uCubeMap[1]) return texture(uTextureCube1, vTexCoord1);
        if (uIs3D[1] != 0) return sampleLuminanceAlpha3D(uTexture3D1, vTexCoord1);
        return texture(uTexture1, vTexCoord1.xy);
    }
    if (uCubeMap[2]) return texture(uTextureCube2, vTexCoord2);
    if (uIs3D[2] != 0) return sampleLuminanceAlpha3D(uTexture3D2, vTexCoord2);
    return texture(uTexture2, vTexCoord2.xy);
}

void main() {
    vec4 color = vColor;
    for (int i = 0; i < 3; i++) {
        if (uUseTexture[i]) color = combineStage(i, sampleUnit(i), color);
    }
    if (uAlphaTestEnabled && !alphaTestPasses(color.a)) {
        discard;
    }
    if (uFogEnabled) {
        float depth = gl_FragCoord.z / gl_FragCoord.w;
        float fogFactor = clamp((uFogEnd - depth) / (uFogEnd - uFogStart), 0.0, 1.0);
        color = vec4(mix(uFogColor.rgb, color.rgb, fogFactor), color.a);
    }
    fragColor = color;
}
"""

/** Exposes the fixed-function fragment stage to the transpiled ARB vertex programs. */
internal val FF_FRAGMENT_SOURCE: String = FRAGMENT_SOURCE

class FixedFunctionShader(private val gl: WebGL2RenderingContext) {
    val program: WebGLProgram

    val uModelView: WebGLUniformLocation?
    val uProjection: WebGLUniformLocation?
    val uTextureMatrix: WebGLUniformLocation?
    val uLightingEnabled: WebGLUniformLocation?
    val uGlobalAmbient: WebGLUniformLocation?
    val uLightEnabled: Array<WebGLUniformLocation?>
    val uLightAmbient: Array<WebGLUniformLocation?>
    val uLightDiffuse: Array<WebGLUniformLocation?>
    val uLightPosition: Array<WebGLUniformLocation?>
    val uLightAttenuation: Array<WebGLUniformLocation?>
    val uTextureMatrixU: Array<WebGLUniformLocation?>
    val uTexGenMode: Array<WebGLUniformLocation?>
    // Fragment-stage locations (shared layout with the transpiled ARB programs).
    val frag: FfFragmentUniformLocations

    init {
        val vs = compile(WebGL2RenderingContext.VERTEX_SHADER, VERTEX_SOURCE)
        val fs = compile(WebGL2RenderingContext.FRAGMENT_SHADER, FRAGMENT_SOURCE)
        val prog = gl.createProgram() ?: error("createProgram failed")
        gl.attachShader(prog, vs)
        gl.attachShader(prog, fs)
        gl.linkProgram(prog)
        if (gl.getProgramParameter(prog, WebGL2RenderingContext.LINK_STATUS) == false) {
            val log = gl.getProgramInfoLog(prog)
            throw RuntimeException("Fixed-function shader link failed: $log")
        }
        program = prog

        uModelView = gl.getUniformLocation(program, "uModelView")
        uProjection = gl.getUniformLocation(program, "uProjection")
        uTextureMatrix = gl.getUniformLocation(program, "uTextureMatrix")
        uTextureMatrixU = perUnit("uTextureMatrixU")
        uTexGenMode = perUnit("uTexGenMode")
        uLightingEnabled = gl.getUniformLocation(program, "uLightingEnabled")
        uGlobalAmbient = gl.getUniformLocation(program, "uGlobalAmbient")
        uLightEnabled = perLight("uLightEnabled")
        uLightAmbient = perLight("uLightAmbient")
        uLightDiffuse = perLight("uLightDiffuse")
        uLightPosition = perLight("uLightPosition")
        uLightAttenuation = perLight("uLightAttenuation")
        frag = FfFragmentUniformLocations(gl, prog)

        // Sampler unit assignment: 2D samplers on logical units 0..2, 3D samplers on the
        // reserved units 3..5, cube samplers on the reserved units 6..7.
        gl.useProgram(program)
        for (unit in 0 until 3) {
            gl.uniform1i(frag.texture2D[unit], unit)
            gl.uniform1i(frag.texture3D[unit], FF_TEXTURE_3D_SAMPLER_UNIT + unit)
        }
        gl.uniform1i(frag.textureCube[1], CUBE_SAMPLER_UNIT + 1)
        gl.uniform1i(frag.textureCube[2], CUBE_SAMPLER_UNIT + 2)
        gl.useProgram(null)
    }

    private fun perLight(name: String): Array<WebGLUniformLocation?> = Array(MAX_LIGHTS) {
        gl.getUniformLocation(program, "$name[$it]")
    }

    private fun perUnit(name: String): Array<WebGLUniformLocation?> = Array(3) {
        gl.getUniformLocation(program, "$name[$it]")
    }

    private fun compile(type: Int, source: String): WebGLShader {
        val shader = gl.createShader(type) ?: error("createShader failed")
        gl.shaderSource(shader, source)
        gl.compileShader(shader)
        if (gl.getShaderParameter(shader, WebGL2RenderingContext.COMPILE_STATUS) == false) {
            val log = gl.getShaderInfoLog(shader)
            throw RuntimeException("Fixed-function shader compile failed: $log\n$source")
        }
        return shader
    }
}

/**
 * Fragment-stage uniform locations for the fixed-function fragment source. Used both by the
 * fixed-function program itself and by transpiled ARB vertex programs, which pair the same
 * fragment stage with a generated vertex stage.
 */
class FfFragmentUniformLocations(gl: WebGL2RenderingContext, program: WebGLProgram) {
    val useTexture: Array<WebGLUniformLocation?> = Array(3) { gl.getUniformLocation(program, "uUseTexture[$it]") }
    val cubeMap: Array<WebGLUniformLocation?> = Array(3) { gl.getUniformLocation(program, "uCubeMap[$it]") }
    val is3D: Array<WebGLUniformLocation?> = Array(3) { gl.getUniformLocation(program, "uIs3D[$it]") }
    val texture2D: Array<WebGLUniformLocation?> = Array(3) { gl.getUniformLocation(program, "uTexture$it") }
    val texture3D: Array<WebGLUniformLocation?> = Array(3) { gl.getUniformLocation(program, "uTexture3D$it") }
    val textureCube: Array<WebGLUniformLocation?> = arrayOf(
        null,
        gl.getUniformLocation(program, "uTextureCube1"),
        gl.getUniformLocation(program, "uTextureCube2"),
    )
    val alphaTestEnabled: WebGLUniformLocation? = gl.getUniformLocation(program, "uAlphaTestEnabled")
    val alphaFunc: WebGLUniformLocation? = gl.getUniformLocation(program, "uAlphaFunc")
    val alphaRef: WebGLUniformLocation? = gl.getUniformLocation(program, "uAlphaRef")
    val fogEnabled: WebGLUniformLocation? = gl.getUniformLocation(program, "uFogEnabled")
    val fogColor: WebGLUniformLocation? = gl.getUniformLocation(program, "uFogColor")
    val fogStart: WebGLUniformLocation? = gl.getUniformLocation(program, "uFogStart")
    val fogEnd: WebGLUniformLocation? = gl.getUniformLocation(program, "uFogEnd")
    val combineRgb: Array<WebGLUniformLocation?> = Array(3) { gl.getUniformLocation(program, "uCombineRgb[$it]") }
    val combineAlpha: Array<WebGLUniformLocation?> = Array(3) { gl.getUniformLocation(program, "uCombineAlpha[$it]") }
    val srcRgb: Array<WebGLUniformLocation?> = Array(3) { gl.getUniformLocation(program, "uSrcRgb[$it]") }
    val opRgb: Array<WebGLUniformLocation?> = Array(3) { gl.getUniformLocation(program, "uOpRgb[$it]") }
    val srcAlpha: Array<WebGLUniformLocation?> = Array(3) { gl.getUniformLocation(program, "uSrcAlpha[$it]") }
    val opAlpha: Array<WebGLUniformLocation?> = Array(3) { gl.getUniformLocation(program, "uOpAlpha[$it]") }
    val texEnvColor: Array<WebGLUniformLocation?> = Array(3) { gl.getUniformLocation(program, "uTexEnvColor[$it]") }
    val envScale: Array<WebGLUniformLocation?> = Array(3) { gl.getUniformLocation(program, "uEnvScale[$it]") }
}

/**
 * Uploads the fragment-side fixed-function state (alpha test, fog, texenv/combine, sampler
 * rebindings for the reserved cube/3D units). [force] re-uploads the global state instead of
 * waiting for the dirty flags.
 *
 * [program] identifies which compiled WebGLProgram this upload targets. The fixed-function
 * fragment source is shared (verbatim) by the fixed-function program and every transpiled ARB
 * vertex program, but each is a distinct linked program with its own uniform storage — a value
 * uploaded into one is invisible to the others. [GlState.texEnvDirty]/[GlState.ffpStateDirty]
 * are cleared globally by whichever program draws first after a state change, so without this
 * check every *other* program that draws afterwards would keep stale (default-zero) uniforms:
 * textures reporting as disabled, fog/alpha-test off, texenv colours black. Detecting a program
 * switch and forcing a full re-upload in that case fixes that (surfaces as, e.g., HD water
 * losing its texture/colour or flashing white depending on draw order / camera angle).
 */
fun uploadFfFragmentUniforms(gl: WebGL2RenderingContext, state: GlState, L: FfFragmentUniformLocations, program: WebGLProgram, force: Boolean) {
    val programChanged = state.lastFragUniformProgram !== program
    state.lastFragUniformProgram = program
    val forceGlobal = force || programChanged
    if (forceGlobal) {
        state.ffpStateDirty = false
        gl.uniform1i(L.alphaTestEnabled, if (state.alphaTestEnabled) 1 else 0)
        gl.uniform1i(L.alphaFunc, state.alphaFunc)
        gl.uniform1f(L.alphaRef, state.alphaRef)
        gl.uniform1i(L.fogEnabled, if (state.fogEnabled) 1 else 0)
        gl.uniform4fv(L.fogColor, state.fogColor.asFloat32Array())
        gl.uniform1f(L.fogStart, state.fogStart)
        gl.uniform1f(L.fogEnd, state.fogEnd)
//        println("[FOGDBG] uploadFfFragmentUniforms programChanged=$programChanged fogEnabled=${state.fogEnabled} fogColor=(${state.fogColor[0]}, ${state.fogColor[1]}, ${state.fogColor[2]}) fogStart=${state.fogStart} fogEnd=${state.fogEnd}")
    }
    for (unit in 0 until 3) {
        val cube = state.textureTarget[unit] == GL_TEXTURE_CUBE_MAP
        val is3d = state.textureTarget[unit] == GL_TEXTURE_3D
        if (state.texEnvDirty[unit] || programChanged) {
            state.texEnvDirty[unit] = false
            gl.uniform1i(L.useTexture[unit], if (state.texturingEnabled[unit]) 1 else 0)
            gl.uniform1i(L.is3D[unit], if (state.texturingEnabled[unit] && is3d) 1 else 0)
            gl.uniform1i(L.cubeMap[unit], if (cube) 1 else 0)
            if (state.texturingEnabled[unit]) uploadFfCombine(gl, L, state, unit)
//            println("[FOGDBG] texenv[$unit] programChanged=$programChanged texturingEnabled=${state.texturingEnabled[unit]} is3d=$is3d cube=$cube useTextureLocNull=${L.useTexture[unit] == null} boundTex2D=${state.boundTexture2D[unit] != null} boundTex3D=${state.boundTexture3D[unit] != null}")
        }
        // Copy the logical-unit binding onto the reserved sampler unit (2D samplers read
        // their logical unit directly, cube/3D samplers read the reserved ones).
        if (unit > 0 && state.texturingEnabled[unit] && cube) {
            state.bindSampler(GL_TEXTURE_CUBE_MAP, CUBE_SAMPLER_UNIT + unit, state.boundTextureCubeMap[unit])
        }
        if (state.texturingEnabled[unit] && is3d) {
            state.bindSampler(GL_TEXTURE_3D, FF_TEXTURE_3D_SAMPLER_UNIT + unit, state.boundTexture3D[unit])
        }
    }
}

private fun uploadFfCombine(gl: WebGL2RenderingContext, L: FfFragmentUniformLocations, state: GlState, unit: Int) {
    gl.uniform1i(L.combineRgb[unit], state.combineRgb[unit])
    gl.uniform1i(L.combineAlpha[unit], state.combineAlpha[unit])
    gl.uniform3i(L.srcRgb[unit], state.source0Rgb[unit], state.source1Rgb[unit], state.source2Rgb[unit])
    gl.uniform3i(L.opRgb[unit], state.operand0Rgb[unit], state.operand1Rgb[unit], state.operand2Rgb[unit])
    gl.uniform3i(L.srcAlpha[unit], state.source0Alpha[unit], state.source1Alpha[unit], state.source2Alpha[unit])
    gl.uniform3i(L.opAlpha[unit], state.operand0Alpha[unit], state.operand1Alpha[unit], state.operand2Alpha[unit])
    gl.uniform4fv(L.texEnvColor[unit], state.textureEnvColor[unit].asFloat32Array())
    gl.uniform2f(L.envScale[unit], state.rgbScale[unit], state.alphaScale[unit])
}
