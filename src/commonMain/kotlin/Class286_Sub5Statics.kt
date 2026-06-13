/**
 * Static-accessor seam for [Class286_Sub5].
 * [Class286_Sub5.method2161] calls JVM thread sleep — JVM only.
 * [Applet_Sub1] and [Client] (commonMain) call through this seam.
 */
expect object Class286_Sub5Statics {
    fun method2161(i: Byte, l: Long)
}
