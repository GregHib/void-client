package lang

import java.util.Collections
import java.util.WeakHashMap

actual class ClassLoader internal constructor(
    internal val delegate: java.lang.ClassLoader
) {
    actual val parent: ClassLoader?
        get() = delegate.parent?.let { wrap(it) }

    actual fun getResource(name: String): String? =
        delegate.getResource(name)?.toString()

    actual fun getResourceAsStream(name: String): ByteArray? =
        delegate.getResourceAsStream(name)?.use { it.readBytes() }

    actual fun loadClass(name: String): Any = delegate.loadClass(name)

    actual val nativeInstance: Any get() = delegate

    actual companion object {
        // Java code (and this decompiled codebase) compares ClassLoaders with reference
        // equality, since java.lang.ClassLoader.getClassLoader() returns a JVM-managed
        // singleton per loader. Cache the wrapper per delegate so === keeps working here.
        private val cache = Collections.synchronizedMap(WeakHashMap<java.lang.ClassLoader, ClassLoader>())

        internal fun wrap(delegate: java.lang.ClassLoader): ClassLoader =
            cache.getOrPut(delegate) { ClassLoader(delegate) }

        actual fun getSystemClassLoader(): ClassLoader =
            wrap(java.lang.ClassLoader.getSystemClassLoader())

        actual val nativeClass: Class<*> get() = java.lang.ClassLoader::class.java
    }
}