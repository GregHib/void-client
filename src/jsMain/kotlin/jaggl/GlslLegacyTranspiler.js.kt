package jaggl

/**
 * The game's material shaders are written in old desktop-style GLSL that leans on the legacy
 * fixed-function pipeline: attribute/varying, texture2D()/texture3D(), gl_FragColor, and the
 * fixed-function built-ins (gl_Vertex, gl_ModelViewMatrix, gl_TexCoord[], gl_Fog, ftransform()...).
 * None of that exists in GLSL ES 300 es, and identifiers can't be redeclared with a "gl_" prefix
 * (reserved by the spec) even to polyfill them - so every gl_* reference is renamed to a
 * same-shaped replacement we declare ourselves, backed by uniforms/attributes this shim populates
 * every draw call from the current matrix stack and fog state (see GlState.applyCompatUniforms).
 */

private val BUILTIN_RENAMES = linkedMapOf(
    "gl_ModelViewProjectionMatrix" to "uModelViewProjectionMatrix",
    "gl_ModelViewMatrix" to "uModelViewMatrix",
    "gl_ProjectionMatrix" to "uProjectionMatrix",
    "gl_NormalMatrix" to "uNormalMatrix",
    "gl_TextureMatrix" to "uTextureMatrix",
    "gl_MultiTexCoord0" to "aMultiTexCoord0",
    "gl_MultiTexCoord1" to "aMultiTexCoord1",
    "gl_Vertex" to "aVertex",
    "gl_Normal" to "aNormal",
    "gl_Color" to "aColor",
    "gl_TexCoord" to "vTexCoord",
    "gl_FogFragCoord" to "vFogFragCoord",
    "gl_Fog" to "uFog",
)

private const val TEXCOORD_ARRAY_SIZE = 4

private const val FOG_STRUCT = "struct FogParameters { float density; float start; float end; float scale; vec4 color; };\n"

internal fun translateLegacyGlsl(source: String, shaderType: Int): String {
    if (source.trimStart().startsWith("#version")) return source

    var body = source
    val isVertex = shaderType == WebGL2RenderingContext.VERTEX_SHADER

    body = if (isVertex) {
        Regex("""\bvarying\b""").replace(Regex("""\battribute\b""").replace(body, "in"), "out")
    } else {
        Regex("""\bvarying\b""").replace(body, "in")
    }

    body = Regex("""\btexture2DProj\(""").replace(body, "textureProj(")
    body = Regex("""\btexture2D\(""").replace(body, "texture(")
    body = Regex("""\btexture3D\(""").replace(body, "texture(")
    body = Regex("""\btextureCube\(""").replace(body, "texture(")
    body = Regex("""\bshadow2D\(""").replace(body, "texture(")

    val usesCompat = BUILTIN_RENAMES.keys.any { Regex("""\b$it\b""").containsMatchIn(body) }
    val usesFtransform = Regex("""\bftransform\s*\(""").containsMatchIn(body)
    for ((builtin, replacement) in BUILTIN_RENAMES) {
        body = Regex("""\b$builtin\b""").replace(body, replacement)
    }

    val header = StringBuilder("#version 300 es\n")
    if (!isVertex) {
        header.append("precision highp float;\nprecision highp int;\n")
        header.append("precision highp sampler2D;\nprecision highp sampler3D;\nprecision highp samplerCube;\n")
        header.append("out vec4 fragColor;\n")
        body = Regex("""\bgl_FragData\[0\]""").replace(body, "fragColor")
        body = Regex("""\bgl_FragColor\b""").replace(body, "fragColor")
    }

    if (usesCompat || usesFtransform) {
        header.append("uniform mat4 uModelViewMatrix;\n")
        header.append("uniform mat4 uProjectionMatrix;\n")
        header.append("uniform mat4 uModelViewProjectionMatrix;\n")
        header.append("uniform mat3 uNormalMatrix;\n")
        header.append("uniform mat4 uTextureMatrix[1];\n")
        header.append(FOG_STRUCT)
        header.append("uniform FogParameters uFog;\n")
        if (isVertex) {
            header.append("layout(location = $ATTRIB_POSITION) in vec4 aVertex;\n")
            header.append("layout(location = $ATTRIB_COLOR) in vec4 aColor;\n")
            header.append("layout(location = $ATTRIB_TEXCOORD0) in vec4 aMultiTexCoord0;\n")
            header.append("vec4 aMultiTexCoord1 = vec4(0.0);\n")
            header.append("layout(location = $ATTRIB_NORMAL) in vec3 aNormal;\n")
            header.append("out vec4 vTexCoord[$TEXCOORD_ARRAY_SIZE];\n")
            header.append("out float vFogFragCoord;\n")
            if (usesFtransform) {
                header.append("vec4 ftransform() { return uProjectionMatrix * uModelViewMatrix * aVertex; }\n")
            }
        } else {
            header.append("in vec4 vTexCoord[$TEXCOORD_ARRAY_SIZE];\n")
            header.append("in float vFogFragCoord;\n")
        }
    }

    return header.toString() + body
}
