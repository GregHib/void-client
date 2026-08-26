package lang

actual class ClassLoader private constructor(private val label: String?) {

    actual val parent: ClassLoader? get() = null

    // Best-effort only: treats the resource name as a relative URL path.
    actual fun getResource(name: String): String? = name

    // The browser has no synchronous file/resource I/O (fetch() is async),
    // so this can't be implemented faithfully.
    actual fun getResourceAsStream(name: String): ByteArray? = null

    actual fun loadClass(name: String): Any {
        val found = js("globalThis[name]")
        if (found == null || found == undefined) {
            throw NoSuchElementException("Class not found: $name")
        }
        return found
    }

    // There is no platform class loader to reflect into on JS.
    actual val nativeInstance: Any get() = throw UnsupportedOperationException()

    actual companion object {
        actual fun getSystemClassLoader(): ClassLoader = ClassLoader(null)

        actual val nativeClass: Class<*> get() = throw UnsupportedOperationException()
    }
}