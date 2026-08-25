package lang

import lang.reflect.Field
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
    actual fun getClassLoader(): ClassLoader? {
        TODO("Not yet implemented")
    }

    actual fun getDeclaredField(name: String): Field {
        TODO("Not yet implemented")
    }

    actual fun getDeclaredFields(): Array<Field> {
        TODO("Not yet implemented")
    }
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

actual fun classOf(value: Any?): Class<*> {
    val ctor: dynamic = value.asDynamic().constructor
    val name: String = (ctor?.name as? String) ?: "Object"
    return TODO()//Class(ctor/*, name*/)
}

actual fun forName(name: String?): Class<*> {
    TODO("Not yet implemented")
}