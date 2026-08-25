package lang.reflect

import lang.Class

actual class Method(
    val name: String,
    val returnType: Class<*>,
    val parameterTypes: Array<Class<*>>,
    private val modifierBits: Int,
    private val invoker: (Any?, Array<out Any?>) -> Any?
) {
    actual fun getModifiers(): Int = modifierBits

    actual fun setAccessible(access: Boolean) {
    }

    actual fun invoke(obj: Any?, vararg args: Any?): Any? = invoker(obj, args)
}
