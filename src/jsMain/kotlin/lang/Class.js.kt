package lang

import lang.reflect.Field
import lang.reflect.Method
import kotlin.reflect.KClass

actual class Class<T> internal constructor(
    internal val ctor: dynamic,
    /**
     * The Kotlin view of the same type, when known. Kotlin/JS does not put interfaces in the
     * prototype chain: a class records the interfaces it implements as a bitmask (`$imask$`) on
     * its prototype, and `x is SomeInterface` consults that mask. `instanceof` and
     * `isPrototypeOf` therefore only see the class hierarchy, and every [isInstance] /
     * [isAssignableFrom] against an interface returned false. The scene graph filters tile
     * entities with `RenderTarget::class` (an interface) in ClickFeedbackTask.method1353 and
     * AsyncResourceRequest.method3253, so on the web client no server-side object removal or
     * replacement could find the object it was meant to remove (GregHib/void-client#23).
     * Going through the public [KClass.isInstance] gives the same answer as `is`.
     */
    private val kClass: KClass<*>? = null,
) {

    actual fun isInstance(obj: Any?): Boolean {
        if (obj == null) return false
        val k = kClass
        if (k != null) return k.isInstance(obj)
        val c = ctor
        return js("obj instanceof c") as Boolean
    }

    actual fun isAssignableFrom(other: Class<*>): Boolean {
        if (ctor === other.ctor) return true
        val c = ctor
        val oc = other.ctor
        // Class-to-class: the ordinary prototype chain.
        if (js("c.prototype != null && oc.prototype != null && c.prototype.isPrototypeOf(oc.prototype)") as Boolean) return true
        // Interface-to-class: build an object that shares `other`'s prototype (and so its
        // `$imask$`) and ask Kotlin whether that would be an instance of this type.
        val k = kClass ?: return false
        if (js("oc.prototype == null") as Boolean) return false
        val probe: Any = js("Object.create(oc.prototype)")
        return k.isInstance(probe)
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
        return Class(this.js, this)
    }

actual fun forName(name: String?): Class<*> =
    throw ClassNotFoundException(name)

// null means "bootstrap classloader" to the client, which is what its security checks expect.
actual fun <T> Class<T>.getClassLoader(): ClassLoader? = null

actual fun <T> Class<T>.getMethod(name: String?, vararg parameterTypes: Class<*>): Method =
    throw RuntimeException("No such method: $name")

actual fun <T> Class<T>.getDeclaredMethod(name: String?, vararg parameterTypes: Class<*>): Method =
    throw RuntimeException("No such method: $name")