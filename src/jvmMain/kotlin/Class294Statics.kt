/**
 * JVM-side accessor shim for [Class294] companion members.
 * Companions in jvmMain reference this instead of [Class294] directly
 * so that the logic can be reasoned about without java.awt deps.
 */
object Class294Statics {
    val aPlayerArray5058: Array<Player?>?
        get() = Class294.aPlayerArray5058
}
