package lang

actual class ClassLoader internal constructor(
    internal val delegate: java.lang.ClassLoader
) {
    actual val parent: ClassLoader?
        get() = delegate.parent?.let { ClassLoader(it) }

    actual fun getResource(name: String): String? =
        delegate.getResource(name)?.toString()

    actual fun getResourceAsStream(name: String): ByteArray? =
        delegate.getResourceAsStream(name)?.use { it.readBytes() }

    actual fun loadClass(name: String): Any = delegate.loadClass(name)

    actual companion object {
        actual fun getSystemClassLoader(): ClassLoader =
            ClassLoader(java.lang.ClassLoader.getSystemClassLoader())
    }
}