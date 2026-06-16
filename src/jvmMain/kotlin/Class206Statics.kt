/**
 * JVM-only statics split from [Class206] companion.
 * [anInt4889] (framebuffer height) and [aBoolean4888] (cross-fade flag) are read/written
 * from Client.kt and packet handlers that should not import the FBO class.
 */
object Class206Statics {
    var anInt4889: Int
        get() = Class206.anInt4889
        set(v) { Class206.anInt4889 = v }
    var aBoolean4888: Boolean
        get() = Class206.aBoolean4888
        set(v) { Class206.aBoolean4888 = v }
}
