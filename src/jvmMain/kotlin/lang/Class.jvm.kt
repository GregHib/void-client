package lang

import lang.reflect.Method

actual typealias Class<T> = java.lang.Class<T>

@Suppress("UNCHECKED_CAST")
actual val <T : Any> T.jClass: Class<T>
    get() = this.javaClass

actual val <T : Any> kotlin.reflect.KClass<T>.jClass: Class<T>
    get() = this.java

actual fun forName(name: String?) = java.lang.Class.forName(name)

actual fun <T> Class<T>.getClassLoader(): ClassLoader? =
    this.classLoader?.let { ClassLoader.wrap(it) }

actual fun <T> Class<T>.getMethod(name: String?, vararg parameterTypes: Class<*>): Method =
    this.getMethod(name, *parameterTypes)

actual fun <T> Class<T>.getDeclaredMethod(name: String?, vararg parameterTypes: Class<*>): Method =
    this.getDeclaredMethod(name, *parameterTypes)