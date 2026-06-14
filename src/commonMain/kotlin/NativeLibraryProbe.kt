/**
 * Seam for the JVM native-library reflection in [Client.method81] (D3D anti-cheat probe).
 *
 * On JVM: [JvmNativeLibraryProbe] reflects into [ClassLoader.nativeLibraries], finds the
 * entry whose `name` contains the given substring (e.g. "sw3d.dll"), and returns its
 * `handle` as a lowercase hex string.
 *
 * On JS: [NativeLibraryProbes.instance] is left null → [hexHandleFor] is never called →
 * the "|16)" segment is simply absent from the diagnostic string, which is correct
 * (there is no sw3d.dll in a browser).
 */
interface NativeLibraryProbe {
    /**
     * Return the hex handle of the native library whose path contains [substr],
     * or `null` if no matching library is loaded or the reflection fails.
     */
    fun hexHandleFor(substr: String): String?
}

object NativeLibraryProbes {
    var instance: NativeLibraryProbe? = null
}
