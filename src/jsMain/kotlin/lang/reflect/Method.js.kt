package lang.reflect

import lang.Class

actual class Method(
    actual val name: String,
    actual val returnType: Class,
    actual val parameterTypes: Array<Class>,
    actual val modifiers: Int,
    private val invoker: (Any?, Array<out Any?>) -> Any?
) {
    actual fun invoke(obj: Any?, vararg args: Any?): Any? = invoker(obj, args)
}
