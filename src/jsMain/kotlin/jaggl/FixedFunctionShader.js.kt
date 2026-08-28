package jaggl

/**
 * Fixed attribute-location convention shared by immediate mode, client-array
 * (glVertexPointer/glColorPointer/...) draws, and this shader.
 */
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
layout(location = 4) in vec2 aTexCoord1;

uniform mat4 uModelView;
uniform mat4 uProjection;
uniform mat4 uTextureMatrix;
uniform bool uLightingEnabled;
uniform vec4 uGlobalAmbient;
uniform vec4 uLightAmbient;
uniform vec4 uLightDiffuse;
uniform vec3 uLightDirection;

out vec4 vColor;
out vec2 vTexCoord0;
out vec2 vTexCoord1;

void main() {
    vec4 viewPos = uModelView * aPosition;
    gl_Position = uProjection * viewPos;

    if (uLightingEnabled) {
        vec3 n = normalize(mat3(uModelView) * aNormal);
        float diff = max(dot(n, normalize(-uLightDirection)), 0.0);
        vec4 lit = uGlobalAmbient + uLightAmbient + uLightDiffuse * diff;
        // Desktop GL clamps the per-vertex lit color to [0,1] before rasterizing (spec 2.14.1) -
        // GLSL doesn't do this automatically for a varying, so without it a bright light sum pushes
        // light/white base colors past 1.0 here, which then only gets clamped at the final fragment
        // write - washing out all texture/vertex-color detail on anything already light-colored while
        // darker surfaces (whose product still lands under 1.0) look unaffected.
        vColor = vec4(clamp(aColor.rgb * lit.rgb, 0.0, 1.0), aColor.a);
    } else {
        vColor = aColor;
    }

    vTexCoord0 = (uTextureMatrix * vec4(aTexCoord0, 0.0, 1.0)).xy;
    // GL_TEXTURE1 has its own texture matrix on desktop GL, but the game never loads one for it in
    // practice (see GlSpriteRenderer's masked-sprite draws) - pass unit 1's texcoord straight through.
    vTexCoord1 = aTexCoord1;
}
"""

private const val FRAGMENT_SOURCE = """#version 300 es
precision mediump float;

in vec4 vColor;
in vec2 vTexCoord0;
in vec2 vTexCoord1;
out vec4 fragColor;

uniform bool uUseTexture;
uniform sampler2D uTexture;
uniform bool uAlphaTestEnabled;
uniform float uAlphaRef;
uniform bool uFogEnabled;
uniform vec4 uFogColor;
uniform float uFogStart;
uniform float uFogEnd;

// GL_COMBINE texture-env state (ARB_texture_env_combine) - see GlConstants.GL_TEXTURE_ENV. The
// game runs texturing in GL_COMBINE mode exclusively and relies on it for things like tinting text/
// icons with the vertex color while taking only the shape (alpha) from the texture, so this can't be
// a hardcoded "vColor * texture()" modulate.
uniform int uCombineRgb;
uniform int uCombineAlpha;
uniform int uSrc0Rgb;
uniform int uSrc1Rgb;
uniform int uSrc2Rgb;
uniform int uOp0Rgb;
uniform int uOp1Rgb;
uniform int uOp2Rgb;
uniform vec4 uTexEnvColor;

// GL_TEXTURE1 stage - chained after unit 0's combine (GL_PREVIOUS below resolves to unit 0's output,
// not the raw vertex color) to support two-stage multitexturing (ARB_multitexture), which
// GlSpriteRenderer relies on for masked/tinted UI sprites (e.g. the alpha-fade mask on button caps).
uniform bool uUseTexture1;
uniform sampler2D uTexture1;
uniform int uCombineRgb1;
uniform int uCombineAlpha1;
uniform int uSrc0Rgb1;
uniform int uSrc1Rgb1;
uniform int uSrc2Rgb1;
uniform int uOp0Rgb1;
uniform int uOp1Rgb1;
uniform int uOp2Rgb1;
uniform vec4 uTexEnvColor1;

vec4 combineSource(int src, vec4 texColor, vec4 previous, vec4 constant) {
    if (src == 34166) return constant; // GL_CONSTANT
    if (src == 5890) return texColor; // GL_TEXTURE
    if (src == 34167) return vColor; // GL_PRIMARY_COLOR
    return previous; // GL_PREVIOUS
}

vec3 applyOperand(int op, vec4 c) {
    if (op == 769) return vec3(1.0) - c.rgb; // GL_ONE_MINUS_SRC_COLOR
    if (op == 770) return vec3(c.a); // GL_SRC_ALPHA
    if (op == 771) return vec3(1.0 - c.a); // GL_ONE_MINUS_SRC_ALPHA
    return c.rgb; // GL_SRC_COLOR
}

vec4 combineStage(
    vec4 texColor, vec4 previous, vec4 constant,
    int combineRgb, int combineAlpha, int src0, int src1, int src2, int op0, int op1, int op2
) {
    vec3 arg0 = applyOperand(op0, combineSource(src0, texColor, previous, constant));
    vec3 arg1 = applyOperand(op1, combineSource(src1, texColor, previous, constant));
    vec3 rgb;
    if (combineRgb == 7681) rgb = arg0; // GL_REPLACE
    else if (combineRgb == 260) rgb = arg0 + arg1; // GL_ADD
    else if (combineRgb == 34023) rgb = arg0 - arg1; // GL_SUBTRACT
    else if (combineRgb == 34164) rgb = arg0 + arg1 - vec3(0.5); // GL_ADD_SIGNED
    else if (combineRgb == 34165) { // GL_INTERPOLATE
        vec3 arg2 = applyOperand(op2, combineSource(src2, texColor, previous, constant));
        rgb = arg0 * arg2 + arg1 * (vec3(1.0) - arg2);
    } else rgb = arg0 * arg1; // GL_MODULATE (default)

    float a0 = texColor.a;
    float a1 = previous.a;
    float alpha;
    if (combineAlpha == 7681) alpha = a0; // GL_REPLACE
    else if (combineAlpha == 34023) alpha = a0 - a1; // GL_SUBTRACT
    else alpha = a0 * a1; // GL_MODULATE (default)

    return vec4(rgb, alpha);
}

void main() {
    vec4 color = vColor;
    if (uUseTexture) {
        vec4 texColor = texture(uTexture, vTexCoord0);
        color = combineStage(
            texColor, vColor, uTexEnvColor,
            uCombineRgb, uCombineAlpha, uSrc0Rgb, uSrc1Rgb, uSrc2Rgb, uOp0Rgb, uOp1Rgb, uOp2Rgb
        );

        if (uUseTexture1) {
            vec4 texColor1 = texture(uTexture1, vTexCoord1);
            color = combineStage(
                texColor1, color, uTexEnvColor1,
                uCombineRgb1, uCombineAlpha1, uSrc0Rgb1, uSrc1Rgb1, uSrc2Rgb1, uOp0Rgb1, uOp1Rgb1, uOp2Rgb1
            );
        }
    }
    if (uAlphaTestEnabled && color.a <= uAlphaRef) {
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
    val uLightAmbient: WebGLUniformLocation?
    val uLightDiffuse: WebGLUniformLocation?
    val uLightDirection: WebGLUniformLocation?
    val uUseTexture: WebGLUniformLocation?
    val uTexture: WebGLUniformLocation?
    val uAlphaTestEnabled: WebGLUniformLocation?
    val uAlphaRef: WebGLUniformLocation?
    val uFogEnabled: WebGLUniformLocation?
    val uFogColor: WebGLUniformLocation?
    val uFogStart: WebGLUniformLocation?
    val uFogEnd: WebGLUniformLocation?
    val uCombineRgb: WebGLUniformLocation?
    val uCombineAlpha: WebGLUniformLocation?
    val uSrc0Rgb: WebGLUniformLocation?
    val uSrc1Rgb: WebGLUniformLocation?
    val uSrc2Rgb: WebGLUniformLocation?
    val uOp0Rgb: WebGLUniformLocation?
    val uOp1Rgb: WebGLUniformLocation?
    val uOp2Rgb: WebGLUniformLocation?
    val uTexEnvColor: WebGLUniformLocation?
    val uUseTexture1: WebGLUniformLocation?
    val uTexture1: WebGLUniformLocation?
    val uCombineRgb1: WebGLUniformLocation?
    val uCombineAlpha1: WebGLUniformLocation?
    val uSrc0Rgb1: WebGLUniformLocation?
    val uSrc1Rgb1: WebGLUniformLocation?
    val uSrc2Rgb1: WebGLUniformLocation?
    val uOp0Rgb1: WebGLUniformLocation?
    val uOp1Rgb1: WebGLUniformLocation?
    val uOp2Rgb1: WebGLUniformLocation?
    val uTexEnvColor1: WebGLUniformLocation?

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
        uLightingEnabled = gl.getUniformLocation(program, "uLightingEnabled")
        uGlobalAmbient = gl.getUniformLocation(program, "uGlobalAmbient")
        uLightAmbient = gl.getUniformLocation(program, "uLightAmbient")
        uLightDiffuse = gl.getUniformLocation(program, "uLightDiffuse")
        uLightDirection = gl.getUniformLocation(program, "uLightDirection")
        uUseTexture = gl.getUniformLocation(program, "uUseTexture")
        uTexture = gl.getUniformLocation(program, "uTexture")
        uAlphaTestEnabled = gl.getUniformLocation(program, "uAlphaTestEnabled")
        uAlphaRef = gl.getUniformLocation(program, "uAlphaRef")
        uFogEnabled = gl.getUniformLocation(program, "uFogEnabled")
        uFogColor = gl.getUniformLocation(program, "uFogColor")
        uFogStart = gl.getUniformLocation(program, "uFogStart")
        uFogEnd = gl.getUniformLocation(program, "uFogEnd")
        uCombineRgb = gl.getUniformLocation(program, "uCombineRgb")
        uCombineAlpha = gl.getUniformLocation(program, "uCombineAlpha")
        uSrc0Rgb = gl.getUniformLocation(program, "uSrc0Rgb")
        uSrc1Rgb = gl.getUniformLocation(program, "uSrc1Rgb")
        uSrc2Rgb = gl.getUniformLocation(program, "uSrc2Rgb")
        uOp0Rgb = gl.getUniformLocation(program, "uOp0Rgb")
        uOp1Rgb = gl.getUniformLocation(program, "uOp1Rgb")
        uOp2Rgb = gl.getUniformLocation(program, "uOp2Rgb")
        uTexEnvColor = gl.getUniformLocation(program, "uTexEnvColor")
        uUseTexture1 = gl.getUniformLocation(program, "uUseTexture1")
        uTexture1 = gl.getUniformLocation(program, "uTexture1")
        uCombineRgb1 = gl.getUniformLocation(program, "uCombineRgb1")
        uCombineAlpha1 = gl.getUniformLocation(program, "uCombineAlpha1")
        uSrc0Rgb1 = gl.getUniformLocation(program, "uSrc0Rgb1")
        uSrc1Rgb1 = gl.getUniformLocation(program, "uSrc1Rgb1")
        uSrc2Rgb1 = gl.getUniformLocation(program, "uSrc2Rgb1")
        uOp0Rgb1 = gl.getUniformLocation(program, "uOp0Rgb1")
        uOp1Rgb1 = gl.getUniformLocation(program, "uOp1Rgb1")
        uOp2Rgb1 = gl.getUniformLocation(program, "uOp2Rgb1")
        uTexEnvColor1 = gl.getUniformLocation(program, "uTexEnvColor1")
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
