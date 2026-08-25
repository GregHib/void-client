package lang

actual typealias Class<T> = java.lang.Class<T>

actual fun classOf(value: Any?): Class<*> = value!!.javaClass

@Suppress("UNCHECKED_CAST")
actual val <T : Any> T.jClass: Class<T>
    get() = this.javaClass

actual val <T : Any> kotlin.reflect.KClass<T>.jClass: Class<T>
    get() = this.java

actual fun forName(name: String?) = java.lang.Class.forName(name)