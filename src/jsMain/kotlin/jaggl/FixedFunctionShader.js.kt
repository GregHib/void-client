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
uniform bool uLightEnabled[2];
uniform vec4 uLightAmbient[2];
uniform vec4 uLightDiffuse[2];
uniform vec3 uLightDirection[2];

out vec4 vColor;
out vec2 vTexCoord0;
out vec3 vTexCoord1;
out vec3 vTexCoord2;

void main() {
    vec4 viewPos = uModelView * aPosition;
    gl_Position = uProjection * viewPos;

    vec3 eyeNormal = normalize(mat3(uModelView) * aNormal);

    if (uLightingEnabled) {
        vec4 lit = uGlobalAmbient;
        for (int i = 0; i < 2; i++) {
            if (uLightEnabled[i]) {
                float diff = max(dot(eyeNormal, normalize(uLightDirection[i])), 0.0);
                lit += uLightAmbient[i] + uLightDiffuse[i] * diff;
            }
        }
        vColor = vec4(clamp(aColor.rgb * lit.rgb, 0.0, 1.0), aColor.a);
    } else {
        vColor = aColor;
    }

    vTexCoord0 = (uTextureMatrix * vec4(aTexCoord0, 0.0, 1.0)).xy;

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

in vec4 vColor;
in vec2 vTexCoord0;
in vec3 vTexCoord1;
in vec3 vTexCoord2;
out vec4 fragColor;

uniform bool uUseTexture[3];
uniform bool uCubeMap[3];
uniform sampler2D uTexture0;
uniform sampler2D uTexture1;
uniform sampler2D uTexture2;
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

vec4 sampleUnit(int unit) {
    if (unit == 0) return texture(uTexture0, vTexCoord0);
    if (unit == 1) return uCubeMap[1] ? texture(uTextureCube1, vTexCoord1) : texture(uTexture1, vTexCoord1.xy);
    return uCubeMap[2] ? texture(uTextureCube2, vTexCoord2) : texture(uTexture2, vTexCoord2.xy);
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
    val uLightDirection: Array<WebGLUniformLocation?>
    val uUseTexture: Array<WebGLUniformLocation?>
    val uCubeMap: Array<WebGLUniformLocation?>
    val uTexture: Array<WebGLUniformLocation?>
    val uTextureCube: Array<WebGLUniformLocation?>
    val uTextureMatrixU: Array<WebGLUniformLocation?>
    val uTexGenMode: Array<WebGLUniformLocation?>
    val uAlphaTestEnabled: WebGLUniformLocation?
    val uAlphaFunc: WebGLUniformLocation?
    val uAlphaRef: WebGLUniformLocation?
    val uFogEnabled: WebGLUniformLocation?
    val uFogColor: WebGLUniformLocation?
    val uFogStart: WebGLUniformLocation?
    val uFogEnd: WebGLUniformLocation?
    val uCombineRgb: Array<WebGLUniformLocation?>
    val uCombineAlpha: Array<WebGLUniformLocation?>
    val uSrcRgb: Array<WebGLUniformLocation?>
    val uOpRgb: Array<WebGLUniformLocation?>
    val uSrcAlpha: Array<WebGLUniformLocation?>
    val uOpAlpha: Array<WebGLUniformLocation?>
    val uTexEnvColor: Array<WebGLUniformLocation?>
    val uEnvScale: Array<WebGLUniformLocation?>

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
        uCubeMap = perUnit("uCubeMap")
        uTextureCube = arrayOf(
            null,
            gl.getUniformLocation(program, "uTextureCube1"),
            gl.getUniformLocation(program, "uTextureCube2"),
        )
        uLightingEnabled = gl.getUniformLocation(program, "uLightingEnabled")
        uGlobalAmbient = gl.getUniformLocation(program, "uGlobalAmbient")
        uLightEnabled = perIndex("uLightEnabled")
        uLightAmbient = perIndex("uLightAmbient")
        uLightDiffuse = perIndex("uLightDiffuse")
        uLightDirection = perIndex("uLightDirection")
        uUseTexture = perUnit("uUseTexture")
        uTexture = arrayOf(
            gl.getUniformLocation(program, "uTexture0"),
            gl.getUniformLocation(program, "uTexture1"),
            gl.getUniformLocation(program, "uTexture2"),
        )
        uAlphaTestEnabled = gl.getUniformLocation(program, "uAlphaTestEnabled")
        uAlphaFunc = gl.getUniformLocation(program, "uAlphaFunc")
        uAlphaRef = gl.getUniformLocation(program, "uAlphaRef")
        uFogEnabled = gl.getUniformLocation(program, "uFogEnabled")
        uFogColor = gl.getUniformLocation(program, "uFogColor")
        uFogStart = gl.getUniformLocation(program, "uFogStart")
        uFogEnd = gl.getUniformLocation(program, "uFogEnd")
        uCombineRgb = perUnit("uCombineRgb")
        uCombineAlpha = perUnit("uCombineAlpha")
        uSrcRgb = perUnit("uSrcRgb")
        uOpRgb = perUnit("uOpRgb")
        uSrcAlpha = perUnit("uSrcAlpha")
        uOpAlpha = perUnit("uOpAlpha")
        uTexEnvColor = perUnit("uTexEnvColor")
        uEnvScale = perUnit("uEnvScale")
    }

    private fun perIndex(name: String): Array<WebGLUniformLocation?> =
        arrayOf(gl.getUniformLocation(program, "$name[0]"), gl.getUniformLocation(program, "$name[1]"))

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
