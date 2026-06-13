/**
 * Platform runtime environment info (replaces direct Runtime.getRuntime() calls).
 *
 * Covers the three things the client reads from the JVM runtime:
 *  - used/free heap for the in-game debug overlay and GC-triggered cleanup
 *  - max heap for cache-size budgeting (aa_Sub3)
 *  - available processors for thread-pool sizing (Class127_Sub1)
 *  - exec() for launching a URL via the OS shell (Class297)
 *
 * JVM impl: JvmRuntimeInfo (delegates to Runtime.getRuntime()).
 */
interface RuntimeInfo {
    /** Currently used heap in kilobytes: (totalMemory - freeMemory) / 1024 */
    fun usedMemoryKb(): Int

    /** Maximum heap in megabytes: maxMemory / 1048576 + 1  (used for cache budget) */
    fun maxMemoryMb(): Int

    /** Number of logical CPUs available to the JVM process */
    fun availableProcessors(): Int

    /** Launch a shell command (e.g. open a URL via cmd /c start). Fire-and-forget. */
    fun exec(command: String)

    /**
     * Call Container.setFocusCycleRoot(true) on [target] via reflection if the platform
     * supports it (JVM only). No-op on other platforms.
     */
    fun setFocusCycleRoot(target: Any?) {}

    /**
     * Terminate the native process via the platform JNI helper (jagmisc.quit on JVM).
     * No-op on platforms without a native exit hook.
     */
    fun quit() {}

    /**
     * JVM vendor string (e.g. "Sun Microsystems", "IBM", "Apple").
     * Used by Applet_Sub1 to gate wrong-JVM warnings.
     * Default is empty string (no warning shown on non-JVM targets).
     */
    val javaVendor: String get() = ""

    /**
     * JVM version string (e.g. "1.4.2", "11.0.1").
     * Used by Applet_Sub1 to detect old/unsupported JVM versions.
     * Default is empty string (no version check on non-JVM targets).
     */
    val javaVersion: String get() = ""
}

/** Singleton accessor — set once at startup by the JVM entry point. */
object RuntimeInfoProvider {
    lateinit var instance: RuntimeInfo
}
