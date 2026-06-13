/**
 * JVM-only seam shim for [Class228].
 *
 * [Class228.method1629] uses java.io, java.util.Vector and reflection — all
 * JVM-only.  [Applet_Sub1] (commonMain) calls through this object so it need
 * not import [Class228] directly.
 */
object Class228Statics {
    fun method1629(bool: Boolean): Boolean = Class228.method1629(bool)
}
