/**
 * JVM-only seam shim for [Class286_Sub5].
 *
 * [Class286_Sub5.method2161] calls [Class327.method2606] (JVM thread sleep) and
 * lives in jvmMain.  [Applet_Sub1] (commonMain) calls through this object so it
 * need not import [Class286_Sub5] directly.
 */
object Class286_Sub5Statics {
    fun method2161(i: Byte, l: Long) = Class286_Sub5.method2161(i, l)
}
