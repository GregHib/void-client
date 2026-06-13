/** Singleton handle to the active [Applet_Sub1] root.
 *
 * Previously lived on `Class348_Sub40_Sub9.anApplet_Sub1_9169` (a jvmMain companion field).
 * Typed as [AppletWindowCallbacks] (a commonMain interface) so this object compiles before
 * Applet_Sub1 is moved to commonMain; callers that need the concrete type cast locally.
 */
object AppletRoot {
    var instance: AppletWindowCallbacks? = null
}
