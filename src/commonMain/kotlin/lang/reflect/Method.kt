package lang.reflect

expect class Method {
//    val name: String
//    val returnType: Class<*>
//    val parameterTypes: Array<Class<*>>
//    val modifiers: Int
    fun getModifiers(): Int
    fun setAccessible(access: Boolean)

    /** Invokes this method on [obj] with [args]. */
    fun invoke(obj: Any?, vararg args: Any?): Any?
}