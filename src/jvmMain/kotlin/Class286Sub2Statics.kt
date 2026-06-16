/**
 * JVM-only statics split from [Class286_Sub2] companion.
 * [anInt6212] (framebuffer width) and [aStringArray6205] (chat history) are used widely
 * by rendering and network classes that should not depend on the socket impl.
 */
object Class286Sub2Statics {
    var anInt6212: Int = 0
    var aStringArray6205: Array<String?>?
        get() = Class286_Sub2.aStringArray6205
        set(v) { Class286_Sub2.aStringArray6205 = v }
}
