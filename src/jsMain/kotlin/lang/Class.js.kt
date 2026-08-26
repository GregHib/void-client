package lang

import lang.reflect.Field
import lang.reflect.Method
import kotlin.reflect.KClass

actual class Class<T> internal constructor(
    internal val ctor: dynamic,
//    actual val name: String
) {
//    actual val simpleName: String
//        get() = name.substringAfterLast('.')

    actual fun isInstance(obj: Any?): Boolean {
        if (obj == null) return false
        val c = ctor
        return js("obj instanceof c") as Boolean
    }

    actual fun isAssignableFrom(other: Class<*>): Boolean {
        if (ctor === other.ctor) return true
        val c = ctor
        val oc = other.ctor
        return js("c.prototype.isPrototypeOf(oc.prototype)") as Boolean
    }

    actual override fun toString(): String = "class "

    actual override fun equals(other: Any?): Boolean =
        other is Class<*> && other.ctor === ctor

    actual override fun hashCode(): Int = "name".hashCode()

    /**
     * Kotlin/JS erases field metadata, so there is nothing to reflect over. Throwing
     * NoSuchFieldException is not just a placeholder - LoadingBarRenderer.method58 calls
     * method2211 inside `catch (Exception) { aBoolean5022 = true }`, and that failure is exactly
     * what selects the plain-AWT loading bar. A TODO() here would escape the catch and kill the
     * loading screen instead of enabling it.
     */
    actual fun getDeclaredField(name: String?): Field =
        throw NoSuchFieldException(name)

    actual fun getDeclaredFields(): Array<Field> = emptyArray()
}

actual val <T : Any> T.jClass: Class<T>
    get() {
        @Suppress("UNCHECKED_CAST")
        val kClass = this::class as KClass<T>
        return kClass.jClass
    }

actual val <T : Any> KClass<T>.jClass: Class<T>
    get() {
        val js = this.js
        return Class(js/*, js.name*/)
    }

actual fun forName(name: String?): Class<*> =
    throw ClassNotFoundException(name)

// null means "bootstrap classloader" to the client, which is what its security checks expect.
actual fun <T> Class<T>.getClassLoader(): ClassLoader? = null

actual fun <T> Class<T>.getMethod(name: String?, vararg parameterTypes: Class<*>): Method =
    throw RuntimeException("No such method: $name")

actual fun <T> Class<T>.getDeclaredMethod(name: String?, vararg parameterTypes: Class<*>): Method =
    throw RuntimeException("No such method: $name")