package lang

expect class ClassLoader {
    val parent: ClassLoader?

    /** URL string of the resource, or null if not found. */
    fun getResource(name: String): String?

    /** Full contents of the resource, or null if not found. */
    fun getResourceAsStream(name: String): ByteArray?

    /** Loads a class by name. Return type is `Any` (the loaded class/constructor object). */
    fun loadClass(name: String): Any

    companion object {
        fun getSystemClassLoader(): ClassLoader
    }
}