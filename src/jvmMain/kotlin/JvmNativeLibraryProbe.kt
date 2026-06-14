import java.util.Vector

/**
 * JVM implementation of [NativeLibraryProbe].
 *
 * Reflects into [ClassLoader.nativeLibraries] (a private [Vector] of
 * `java.lang.ClassLoader$NativeLibrary` entries), finds the entry whose
 * `name` field contains [substr], and returns its `handle` field as a
 * lowercase hex string.  All reflection exceptions are swallowed and
 * `null` is returned, matching the original try/catch behaviour in
 * [Client.method81].
 *
 * This is the D3D anti-cheat probe — the result must be byte-identical
 * to the original ClassLoader-reflection path when sw3d.dll is loaded.
 */
class JvmNativeLibraryProbe(private val classLoader: ClassLoader) : NativeLibraryProbe {

    override fun hexHandleFor(substr: String): String? {
        return try {
            val field = ClassLoader::class.java.getDeclaredField("nativeLibraries")
            field.isAccessible = true
            val vector = field.get(classLoader) as Vector<*>
            for (i in vector.indices) {
                try {
                    val obj: Any = vector.elementAt(i)
                    val nameField = obj.javaClass.getDeclaredField("name")
                    nameField.isAccessible = true
                    try {
                        val name = nameField.get(obj) as String?
                        if (name != null && name.indexOf(substr) != -1) {
                            val handleField = obj.javaClass.getDeclaredField("handle")
                            handleField.isAccessible = true
                            val hex = java.lang.Long.toHexString(handleField.getLong(obj))
                            handleField.isAccessible = false
                            nameField.isAccessible = false
                            return hex
                        }
                    } catch (_: Throwable) { /* match original swallow */ }
                    nameField.isAccessible = false
                } catch (_: Throwable) { /* match original swallow */ }
            }
            null
        } catch (_: Throwable) {
            null
        }
    }
}
