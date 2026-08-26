package lang

expect class ClassLoader {
    val parent: ClassLoader?

    /** URL string of the resource, or null if not found. */
    fun getResource(name: String): String?

    /** Full contents of the resource, or null if not found. */
    fun getResourceAsStream(name: String): ByteArray?

    /** Loads a class by name. Return type is `Any` (the loaded class/constructor object). */
    fun loadClass(name: String): Any

    /**
     * The underlying platform class loader object (e.g. the real `java.lang.ClassLoader`
     * on JVM), for code that needs to reflect into platform-internal fields. Not this
     * wrapper class, which has none of those fields.
     */
    val nativeInstance: Any

    companion object {
        fun getSystemClassLoader(): ClassLoader

        /** The [Class] of the underlying platform class loader, for use with [nativeInstance]. */
        val nativeClass: Class<*>
    }
}