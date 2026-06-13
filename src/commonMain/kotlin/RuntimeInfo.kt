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
}

/** Singleton accessor — set once at startup by the JVM entry point. */
object RuntimeInfoProvider {
    lateinit var instance: RuntimeInfo
}
