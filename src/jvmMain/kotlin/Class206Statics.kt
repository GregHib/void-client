/**
 * JVM-only statics split from [Class206] companion.
 * [anInt4889] (framebuffer height) and [aBoolean4888] (cross-fade flag) are read/written
 * from Client.kt and packet handlers that should not import the FBO class.
 */
object Class206Statics {
    var anInt4889: Int = 0
    var aBoolean4888: Boolean = false
}
