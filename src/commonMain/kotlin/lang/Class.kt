package lang

import lang.reflect.Field
import lang.reflect.Method

expect class Class<T> {
//    val name: String

//    val simpleName: String

    fun isInstance(obj: Any?): Boolean

    fun isAssignableFrom(other: Class<*>): Boolean
    fun getDeclaredField(name: String?): Field
    fun getDeclaredFields(): Array<Field>

    override fun toString(): String
    override fun equals(other: Any?): Boolean
    override fun hashCode(): Int
}

expect fun forName(name: String?): Class<*>
expect fun classOf(value: Any?): Class<*>

expect val <T : Any> T.jClass: Class<T>

/** Equivalent of `SomeType::class.java`. */
expect val <T : Any> kotlin.reflect.KClass<T>.jClass: Class<T>

expect fun <T> Class<T>.getClassLoader(): ClassLoader?
expect fun <T> Class<T>.getMethod(name: String?, vararg parameterTypes: Class<*>): Method
expect fun <T> Class<T>.getDeclaredMethod(name: String?, vararg parameterTypes: Class<*>): Method