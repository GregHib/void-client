/**
 * JS actual for system properties: backed by a simple mutable map pre-seeded
 * with web-appropriate values. Call sites that read "os.name" / "java.vendor" etc.
 * will get sensible stubs instead of null.
 */
private val properties: MutableMap<String, String> = mutableMapOf(
    "java.vendor"  to "Kotlin/JS",
    "java.version" to "0.0",
    "os.name"      to "Web",
    "os.arch"      to "wasm32",
    "os.version"   to "0",
    "user.home"    to "/",
    "java.net.useSystemProxies" to "false",
)

actual fun systemGetProperty(key: String): String? = properties[key]

actual fun systemSetProperty(key: String, value: String) {
    properties[key] = value
}
