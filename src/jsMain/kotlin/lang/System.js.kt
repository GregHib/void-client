package lang

/**
 * The client reads these six during PrivilegedOperationWorker's init and branches on two of them
 * in GameAppletFrame.run, so the values are not arbitrary:
 *  - java.vendor must not contain "microsoft" (that selects the DirectDraw/NativeCursor paths),
 *    nor "sun"/"apple"/"ibm" paired with an old version (that trips the "wrongjava" abort).
 *  - java.version's digits after "1." must be >= 5.
 *  - os.name must not start with "win", os.arch must not contain "arm".
 */
private val properties: MutableMap<String, String> = mutableMapOf(
    "java.vendor" to "Kotlin/JS",
    "java.version" to "1.8.0",
    "os.name" to "Linux",
    "os.arch" to "x86",
    "os.version" to "1.0",
    "user.home" to "/home/web",
    "line.separator" to "\n",
)

actual fun currentTimeMillis(): Long = Clock.millis()

actual fun nanoTime(): Long = Clock.nanos()

actual fun lineSeparator(): String = "\n"

actual fun getProperty(key: String): String? = properties[key]

actual fun getProperty(key: String, defaultValue: String): String = properties[key] ?: defaultValue

actual fun getenv(name: String): String? = null

actual fun gc() {
}

actual fun setProperty(key: String, value: String): String {
    val previous = properties.put(key, value)
    return previous ?: ""
}

actual fun runFinalization() {
}

// Never TODO(): NotImplementedError is an Error, so it would blow through the client's
// defensive `catch (Exception)` blocks instead of being absorbed by them.
actual fun exit(status: Int): Nothing = throw RuntimeException("exit($status)")

actual fun load(path: String) {
}
